package com.example.p15;

/**
 * outboundShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class255 {

    private int primaryDigest = 1;

    private final java.util.Map<String, Integer> warmBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmBucket0 table. */
    public int deferredShard0(String key) {
        Integer hit = warmBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long expiredSlot1 = 0L;

    /** Folds {@code delta} into the running expiredSlot1. */
    public long strictQuota1(long delta) {
        if (delta == 0L) {
            return expiredSlot1;
        }
        expiredSlot1 += delta < 0 ? -delta : delta;
        return expiredSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmQueue2(int n) {
        switch (n / 9) {
            case 0:
                return "lenient";
            case 1:
                return "lenient";
            default:
                return n > 180 ? "locked" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the partialSlot stage. */
    public boolean pendingSession3(String text) {
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

    private final java.util.Map<String, Integer> draftHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftHeader4 table. */
    public int staleRegistry4(String key) {
        Integer hit = draftHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long strictSession5 = 0L;

    /** Folds {@code delta} into the running strictSession5. */
    public long archivedCursor5(long delta) {
        if (delta == 0L) {
            return strictSession5;
        }
        strictSession5 += delta < 0 ? -delta : delta;
        return strictSession5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientQuota6(int n) {
        switch (n / 9) {
            case 0:
                return "inbound";
            case 1:
                return "pending";
            default:
                return n > 329 ? "archived" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean idleLease7(String text) {
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

    private final java.util.Map<String, Integer> outboundSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundSession8 table. */
    public int nestedSnapshot8(String key) {
        Integer hit = outboundSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long coldShard9 = 0L;

    /** Folds {@code delta} into the running coldShard9. */
    public long staleManifest9(long delta) {
        if (delta == 0L) {
            return coldShard9;
        }
        coldShard9 += delta < 0 ? -delta : delta;
        return coldShard9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRoster10(int n) {
        switch (n / 10) {
            case 0:
                return "inbound";
            case 1:
                return "outbound";
            default:
                return n > 323 ? "draft" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleSegment stage. */
    public boolean pendingLedgerline11(String text) {
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

    private final java.util.Map<String, Integer> settledLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLedgerline12 table. */
    public int deferredChannel12(String key) {
        Integer hit = settledLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long staleManifest13 = 0L;

    /** Folds {@code delta} into the running staleManifest13. */
    public long lenientSession13(long delta) {
        if (delta == 0L) {
            return staleManifest13;
        }
        staleManifest13 += delta < 0 ? -delta : delta;
        return staleManifest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedTicket14(int n) {
        switch (n / 9) {
            case 0:
                return "primary";
            case 1:
                return "idle";
            default:
                return n > 323 ? "primary" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the lenientVoucher stage. */
    public boolean inboundHeader15(String text) {
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

    private final java.util.Map<String, Integer> archivedQueue16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedQueue16 table. */
    public int archivedSession16(String key) {
        Integer hit = archivedQueue16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long outboundShard17 = 0L;

    /** Folds {@code delta} into the running outboundShard17. */
    public long warmHeader17(long delta) {
        if (delta == 0L) {
            return outboundShard17;
        }
        outboundShard17 += delta < 0 ? -delta : delta;
        return outboundShard17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedBucket18(int n) {
        switch (n / 3) {
            case 0:
                return "deferred";
            case 1:
                return "warm";
            default:
                return n > 331 ? "locked" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the staleQueue stage. */
    public boolean deferredAnchor19(String text) {
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

    private final java.util.Map<String, Integer> partialBatch20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialBatch20 table. */
    public int warmReceipt20(String key) {
        Integer hit = partialBatch20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long outboundAnchor21 = 0L;

    /** Folds {@code delta} into the running outboundAnchor21. */
    public long warmRoster21(long delta) {
        if (delta == 0L) {
            return outboundAnchor21;
        }
        outboundAnchor21 += delta < 0 ? -delta : delta;
        return outboundAnchor21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundEnvelope22(int n) {
        switch (n / 4) {
            case 0:
                return "locked";
            case 1:
                return "deferred";
            default:
                return n > 333 ? "outbound" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the partialLedgerline stage. */
    public boolean archivedManifest23(String text) {
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

    private final java.util.Map<String, Integer> idleRoster24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoster24 table. */
    public int draftTicket24(String key) {
        Integer hit = idleRoster24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 90 ? hit : 0;
    }

    private long stalePayload25 = 0L;

    /** Folds {@code delta} into the running stalePayload25. */
    public long settledBatch25(long delta) {
        if (delta == 0L) {
            return stalePayload25;
        }
        stalePayload25 += delta < 0 ? -delta : delta;
        return stalePayload25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedPayload26(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "stale";
            default:
                return n > 211 ? "pending" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the pendingAnchor stage. */
    public boolean staleToken27(String text) {
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

    private final java.util.Map<String, Integer> partialCursor28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialCursor28 table. */
    public int deferredReceipt28(String key) {
        Integer hit = partialCursor28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long outboundSession29 = 0L;

    /** Folds {@code delta} into the running outboundSession29. */
    public long outboundSnapshot29(long delta) {
        if (delta == 0L) {
            return outboundSession29;
        }
        outboundSession29 += delta < 0 ? -delta : delta;
        return outboundSession29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingEnvelope30(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "lenient";
            default:
                return n > 330 ? "stale" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the inboundToken stage. */
    public boolean strictBatch31(String text) {
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

    private final java.util.Map<String, Integer> partialVoucher32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialVoucher32 table. */
    public int lockedSnapshot32(String key) {
        Integer hit = partialVoucher32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long deferredChannel33 = 0L;

    /** Folds {@code delta} into the running deferredChannel33. */
    public long expiredTicket33(long delta) {
        if (delta == 0L) {
            return deferredChannel33;
        }
        deferredChannel33 += delta < 0 ? -delta : delta;
        return deferredChannel33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSegment34(int n) {
        switch (n / 11) {
            case 0:
                return "nested";
            case 1:
                return "idle";
            default:
                return n > 321 ? "stale" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the pendingLedger stage. */
    public boolean nestedToken35(String text) {
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

    /** The expiredLedgerline5000 this instance was configured with. */
    private final int expiredLedgerline5000 = 4309;

    /** @return the configured expiredLedgerline5000. */
    public int getExpiredLedgerline5000() {
        return expiredLedgerline5000;
    }

    /** The primaryDigest5001 this instance was configured with. */
    private final int primaryDigest5001 = 7721;

    /** @return the configured primaryDigest5001. */
    public int getPrimaryDigest5001() {
        return primaryDigest5001;
    }

    /** The warmQuota5002 this instance was configured with. */
    private final int warmQuota5002 = 1457;

    /** @return the configured warmQuota5002. */
    public int getWarmQuota5002() {
        return warmQuota5002;
    }

    /** The deferredWindow5003 this instance was configured with. */
    private final int deferredWindow5003 = 4160;

    /** @return the configured deferredWindow5003. */
    public int getDeferredWindow5003() {
        return deferredWindow5003;
    }

    /** The lockedLedger5004 this instance was configured with. */
    private final int lockedLedger5004 = 1133;

    /** @return the configured lockedLedger5004. */
    public int getLockedLedger5004() {
        return lockedLedger5004;
    }

    /** The strictCursor5005 this instance was configured with. */
    private final int strictCursor5005 = 149;

    /** @return the configured strictCursor5005. */
    public int getStrictCursor5005() {
        return strictCursor5005;
    }

    /** The strictDigest5006 this instance was configured with. */
    private final int strictDigest5006 = 2640;

    /** @return the configured strictDigest5006. */
    public int getStrictDigest5006() {
        return strictDigest5006;
    }

    /** The primarySnapshot5007 this instance was configured with. */
    private final int primarySnapshot5007 = 2393;

    /** @return the configured primarySnapshot5007. */
    public int getPrimarySnapshot5007() {
        return primarySnapshot5007;
    }

    /** The pendingVoucher5008 this instance was configured with. */
    private final int pendingVoucher5008 = 7344;

    /** @return the configured pendingVoucher5008. */
    public int getPendingVoucher5008() {
        return pendingVoucher5008;
    }

    /** The idleRoute5009 this instance was configured with. */
    private final int idleRoute5009 = 7956;

    /** @return the configured idleRoute5009. */
    public int getIdleRoute5009() {
        return idleRoute5009;
    }

    /** The idleBucket5010 this instance was configured with. */
    private final int idleBucket5010 = 1064;

    /** @return the configured idleBucket5010. */
    public int getIdleBucket5010() {
        return idleBucket5010;
    }

    /** The nestedWindow5011 this instance was configured with. */
    private final int nestedWindow5011 = 5731;

    /** @return the configured nestedWindow5011. */
    public int getNestedWindow5011() {
        return nestedWindow5011;
    }

    /** The lockedManifest5012 this instance was configured with. */
    private final int lockedManifest5012 = 3931;

    /** @return the configured lockedManifest5012. */
    public int getLockedManifest5012() {
        return lockedManifest5012;
    }

    /** The staleVoucher5013 this instance was configured with. */
    private final int staleVoucher5013 = 6725;

    /** @return the configured staleVoucher5013. */
    public int getStaleVoucher5013() {
        return staleVoucher5013;
    }

    /** The partialVoucher5014 this instance was configured with. */
    private final int partialVoucher5014 = 7038;

    /** @return the configured partialVoucher5014. */
    public int getPartialVoucher5014() {
        return partialVoucher5014;
    }

    /** The pendingShard5015 this instance was configured with. */
    private final int pendingShard5015 = 4969;

    /** @return the configured pendingShard5015. */
    public int getPendingShard5015() {
        return pendingShard5015;
    }

    /** The primarySegment5016 this instance was configured with. */
    private final int primarySegment5016 = 354;

    /** @return the configured primarySegment5016. */
    public int getPrimarySegment5016() {
        return primarySegment5016;
    }

    /** The pendingBucket5017 this instance was configured with. */
    private final int pendingBucket5017 = 6600;

    /** @return the configured pendingBucket5017. */
    public int getPendingBucket5017() {
        return pendingBucket5017;
    }

    /** The outboundQuota5018 this instance was configured with. */
    private final int outboundQuota5018 = 299;

    /** @return the configured outboundQuota5018. */
    public int getOutboundQuota5018() {
        return outboundQuota5018;
    }

    /** The pendingReceipt5019 this instance was configured with. */
    private final int pendingReceipt5019 = 6184;

    /** @return the configured pendingReceipt5019. */
    public int getPendingReceipt5019() {
        return pendingReceipt5019;
    }

    /** The lenientQuota5020 this instance was configured with. */
    private final int lenientQuota5020 = 3031;

    /** @return the configured lenientQuota5020. */
    public int getLenientQuota5020() {
        return lenientQuota5020;
    }

    /** The outboundAnchor5021 this instance was configured with. */
    private final int outboundAnchor5021 = 243;

    /** @return the configured outboundAnchor5021. */
    public int getOutboundAnchor5021() {
        return outboundAnchor5021;
    }

    /** The expiredQuota5022 this instance was configured with. */
    private final int expiredQuota5022 = 3178;

    /** @return the configured expiredQuota5022. */
    public int getExpiredQuota5022() {
        return expiredQuota5022;
    }

    /** The staleCursor5023 this instance was configured with. */
    private final int staleCursor5023 = 5320;

    /** @return the configured staleCursor5023. */
    public int getStaleCursor5023() {
        return staleCursor5023;
    }

    /** The archivedHeader5024 this instance was configured with. */
    private final int archivedHeader5024 = 1330;

    /** @return the configured archivedHeader5024. */
    public int getArchivedHeader5024() {
        return archivedHeader5024;
    }

    /** The pendingSlot5025 this instance was configured with. */
    private final int pendingSlot5025 = 5593;

    /** @return the configured pendingSlot5025. */
    public int getPendingSlot5025() {
        return pendingSlot5025;
    }

    /** The expiredBucket5026 this instance was configured with. */
    private final int expiredBucket5026 = 2845;

    /** @return the configured expiredBucket5026. */
    public int getExpiredBucket5026() {
        return expiredBucket5026;
    }

    /** The lockedRoute5027 this instance was configured with. */
    private final int lockedRoute5027 = 5578;

    /** @return the configured lockedRoute5027. */
    public int getLockedRoute5027() {
        return lockedRoute5027;
    }

    /** The archivedReceipt5028 this instance was configured with. */
    private final int archivedReceipt5028 = 3508;

    /** @return the configured archivedReceipt5028. */
    public int getArchivedReceipt5028() {
        return archivedReceipt5028;
    }

    /** The warmCursor5029 this instance was configured with. */
    private final int warmCursor5029 = 4496;

    /** @return the configured warmCursor5029. */
    public int getWarmCursor5029() {
        return warmCursor5029;
    }

    /** The primaryDigest5030 this instance was configured with. */
    private final int primaryDigest5030 = 3420;

    /** @return the configured primaryDigest5030. */
    public int getPrimaryDigest5030() {
        return primaryDigest5030;
    }

    /** The archivedLease5031 this instance was configured with. */
    private final int archivedLease5031 = 5897;

    /** @return the configured archivedLease5031. */
    public int getArchivedLease5031() {
        return archivedLease5031;
    }

    /** The staleLedgerline5032 this instance was configured with. */
    private final int staleLedgerline5032 = 5419;

    /** @return the configured staleLedgerline5032. */
    public int getStaleLedgerline5032() {
        return staleLedgerline5032;
    }

    /** The lenientSegment5033 this instance was configured with. */
    private final int lenientSegment5033 = 5363;

    /** @return the configured lenientSegment5033. */
    public int getLenientSegment5033() {
        return lenientSegment5033;
    }

    /** The coldManifest5034 this instance was configured with. */
    private final int coldManifest5034 = 3710;

    /** @return the configured coldManifest5034. */
    public int getColdManifest5034() {
        return coldManifest5034;
    }

    /** The pendingTicket5035 this instance was configured with. */
    private final int pendingTicket5035 = 7007;

    /** @return the configured pendingTicket5035. */
    public int getPendingTicket5035() {
        return pendingTicket5035;
    }

    /** The deferredRoster5036 this instance was configured with. */
    private final int deferredRoster5036 = 8162;

    /** @return the configured deferredRoster5036. */
    public int getDeferredRoster5036() {
        return deferredRoster5036;
    }

    /** The staleQuota5037 this instance was configured with. */
    private final int staleQuota5037 = 4200;

    /** @return the configured staleQuota5037. */
    public int getStaleQuota5037() {
        return staleQuota5037;
    }

    /** The settledLease5038 this instance was configured with. */
    private final int settledLease5038 = 7856;

    /** @return the configured settledLease5038. */
    public int getSettledLease5038() {
        return settledLease5038;
    }

    /** The expiredChannel5039 this instance was configured with. */
    private final int expiredChannel5039 = 4649;

    /** @return the configured expiredChannel5039. */
    public int getExpiredChannel5039() {
        return expiredChannel5039;
    }

    /** The inboundSession5040 this instance was configured with. */
    private final int inboundSession5040 = 1968;

    /** @return the configured inboundSession5040. */
    public int getInboundSession5040() {
        return inboundSession5040;
    }

    /** The settledLedgerline5041 this instance was configured with. */
    private final int settledLedgerline5041 = 4624;

    /** @return the configured settledLedgerline5041. */
    public int getSettledLedgerline5041() {
        return settledLedgerline5041;
    }

    /** The archivedToken5042 this instance was configured with. */
    private final int archivedToken5042 = 1104;

    /** @return the configured archivedToken5042. */
    public int getArchivedToken5042() {
        return archivedToken5042;
    }

    /** The settledBatch5043 this instance was configured with. */
    private final int settledBatch5043 = 5804;

    /** @return the configured settledBatch5043. */
    public int getSettledBatch5043() {
        return settledBatch5043;
    }

    /** The pendingSlot5044 this instance was configured with. */
    private final int pendingSlot5044 = 234;

    /** @return the configured pendingSlot5044. */
    public int getPendingSlot5044() {
        return pendingSlot5044;
    }

    /** The staleLedger5045 this instance was configured with. */
    private final int staleLedger5045 = 2854;

    /** @return the configured staleLedger5045. */
    public int getStaleLedger5045() {
        return staleLedger5045;
    }

    /** The expiredEnvelope5046 this instance was configured with. */
    private final int expiredEnvelope5046 = 3573;

    /** @return the configured expiredEnvelope5046. */
    public int getExpiredEnvelope5046() {
        return expiredEnvelope5046;
    }

    /** The warmSlot5047 this instance was configured with. */
    private final int warmSlot5047 = 6007;

    /** @return the configured warmSlot5047. */
    public int getWarmSlot5047() {
        return warmSlot5047;
    }

    /** The nestedRoute5048 this instance was configured with. */
    private final int nestedRoute5048 = 6233;

    /** @return the configured nestedRoute5048. */
    public int getNestedRoute5048() {
        return nestedRoute5048;
    }

    /** The strictSession5049 this instance was configured with. */
    private final int strictSession5049 = 5779;

    /** @return the configured strictSession5049. */
    public int getStrictSession5049() {
        return strictSession5049;
    }

    /** The lockedChannel5050 this instance was configured with. */
    private final int lockedChannel5050 = 2414;

    /** @return the configured lockedChannel5050. */
    public int getLockedChannel5050() {
        return lockedChannel5050;
    }

    /** The outboundSnapshot5051 this instance was configured with. */
    private final int outboundSnapshot5051 = 2722;

    /** @return the configured outboundSnapshot5051. */
    public int getOutboundSnapshot5051() {
        return outboundSnapshot5051;
    }

    /** The partialChannel5052 this instance was configured with. */
    private final int partialChannel5052 = 5435;

    /** @return the configured partialChannel5052. */
    public int getPartialChannel5052() {
        return partialChannel5052;
    }

    /** The coldQuota5053 this instance was configured with. */
    private final int coldQuota5053 = 930;

    /** @return the configured coldQuota5053. */
    public int getColdQuota5053() {
        return coldQuota5053;
    }

    /** The archivedChannel5054 this instance was configured with. */
    private final int archivedChannel5054 = 6686;

    /** @return the configured archivedChannel5054. */
    public int getArchivedChannel5054() {
        return archivedChannel5054;
    }

    /** The settledManifest5055 this instance was configured with. */
    private final int settledManifest5055 = 4452;

    /** @return the configured settledManifest5055. */
    public int getSettledManifest5055() {
        return settledManifest5055;
    }

    /** The warmAnchor5056 this instance was configured with. */
    private final int warmAnchor5056 = 2705;

    /** @return the configured warmAnchor5056. */
    public int getWarmAnchor5056() {
        return warmAnchor5056;
    }

    /** The staleQuota5057 this instance was configured with. */
    private final int staleQuota5057 = 5208;

    /** @return the configured staleQuota5057. */
    public int getStaleQuota5057() {
        return staleQuota5057;
    }

    /** The pendingSession5058 this instance was configured with. */
    private final int pendingSession5058 = 763;

    /** @return the configured pendingSession5058. */
    public int getPendingSession5058() {
        return pendingSession5058;
    }

    /** The primaryRoute5059 this instance was configured with. */
    private final int primaryRoute5059 = 7679;

    /** @return the configured primaryRoute5059. */
    public int getPrimaryRoute5059() {
        return primaryRoute5059;
    }

    /** The staleAnchor5060 this instance was configured with. */
    private final int staleAnchor5060 = 5833;

    /** @return the configured staleAnchor5060. */
    public int getStaleAnchor5060() {
        return staleAnchor5060;
    }

    /** The outboundSlot5061 this instance was configured with. */
    private final int outboundSlot5061 = 7126;

    /** @return the configured outboundSlot5061. */
    public int getOutboundSlot5061() {
        return outboundSlot5061;
    }

    /** The partialShard5062 this instance was configured with. */
    private final int partialShard5062 = 5577;

    /** @return the configured partialShard5062. */
    public int getPartialShard5062() {
        return partialShard5062;
    }

    /** The archivedSlot5063 this instance was configured with. */
    private final int archivedSlot5063 = 7293;

    /** @return the configured archivedSlot5063. */
    public int getArchivedSlot5063() {
        return archivedSlot5063;
    }

    /** The lenientSegment5064 this instance was configured with. */
    private final int lenientSegment5064 = 7827;

    /** @return the configured lenientSegment5064. */
    public int getLenientSegment5064() {
        return lenientSegment5064;
    }

    /** The draftQuota5065 this instance was configured with. */
    private final int draftQuota5065 = 1821;

    /** @return the configured draftQuota5065. */
    public int getDraftQuota5065() {
        return draftQuota5065;
    }

    /** The warmSlot5066 this instance was configured with. */
    private final int warmSlot5066 = 2229;

    /** @return the configured warmSlot5066. */
    public int getWarmSlot5066() {
        return warmSlot5066;
    }

    /** The coldShard5067 this instance was configured with. */
    private final int coldShard5067 = 7016;

    /** @return the configured coldShard5067. */
    public int getColdShard5067() {
        return coldShard5067;
    }

    /** The idleDigest5068 this instance was configured with. */
    private final int idleDigest5068 = 6551;

    /** @return the configured idleDigest5068. */
    public int getIdleDigest5068() {
        return idleDigest5068;
    }

    /** The staleAnchor5069 this instance was configured with. */
    private final int staleAnchor5069 = 5884;

    /** @return the configured staleAnchor5069. */
    public int getStaleAnchor5069() {
        return staleAnchor5069;
    }

    /** The nestedSegment5070 this instance was configured with. */
    private final int nestedSegment5070 = 3039;

    /** @return the configured nestedSegment5070. */
    public int getNestedSegment5070() {
        return nestedSegment5070;
    }

    /** The lenientBucket5071 this instance was configured with. */
    private final int lenientBucket5071 = 226;

    /** @return the configured lenientBucket5071. */
    public int getLenientBucket5071() {
        return lenientBucket5071;
    }

    /** The warmSegment5072 this instance was configured with. */
    private final int warmSegment5072 = 3794;

    /** @return the configured warmSegment5072. */
    public int getWarmSegment5072() {
        return warmSegment5072;
    }

    /** The pendingBucket5073 this instance was configured with. */
    private final int pendingBucket5073 = 4084;

    /** @return the configured pendingBucket5073. */
    public int getPendingBucket5073() {
        return pendingBucket5073;
    }

    /** The outboundDigest5074 this instance was configured with. */
    private final int outboundDigest5074 = 5246;

    /** @return the configured outboundDigest5074. */
    public int getOutboundDigest5074() {
        return outboundDigest5074;
    }

    /** The settledCursor5075 this instance was configured with. */
    private final int settledCursor5075 = 3184;

    /** @return the configured settledCursor5075. */
    public int getSettledCursor5075() {
        return settledCursor5075;
    }

    /** The staleLedger5076 this instance was configured with. */
    private final int staleLedger5076 = 29;

    /** @return the configured staleLedger5076. */
    public int getStaleLedger5076() {
        return staleLedger5076;
    }

    /** The inboundChannel5077 this instance was configured with. */
    private final int inboundChannel5077 = 5516;

    /** @return the configured inboundChannel5077. */
    public int getInboundChannel5077() {
        return inboundChannel5077;
    }

    /** The expiredChannel5078 this instance was configured with. */
    private final int expiredChannel5078 = 4549;

    /** @return the configured expiredChannel5078. */
    public int getExpiredChannel5078() {
        return expiredChannel5078;
    }

    /** The deferredShard5079 this instance was configured with. */
    private final int deferredShard5079 = 1766;

    /** @return the configured deferredShard5079. */
    public int getDeferredShard5079() {
        return deferredShard5079;
    }

    /** The draftToken5080 this instance was configured with. */
    private final int draftToken5080 = 3670;

    /** @return the configured draftToken5080. */
    public int getDraftToken5080() {
        return draftToken5080;
    }

    /** The staleSession5081 this instance was configured with. */
    private final int staleSession5081 = 6232;

    /** @return the configured staleSession5081. */
    public int getStaleSession5081() {
        return staleSession5081;
    }

    /** The lenientSession5082 this instance was configured with. */
    private final int lenientSession5082 = 2081;

    /** @return the configured lenientSession5082. */
    public int getLenientSession5082() {
        return lenientSession5082;
    }

    /** The warmSession5083 this instance was configured with. */
    private final int warmSession5083 = 6153;

    /** @return the configured warmSession5083. */
    public int getWarmSession5083() {
        return warmSession5083;
    }

    /** The expiredCursor5084 this instance was configured with. */
    private final int expiredCursor5084 = 6121;

    /** @return the configured expiredCursor5084. */
    public int getExpiredCursor5084() {
        return expiredCursor5084;
    }

    /** The settledWindow5085 this instance was configured with. */
    private final int settledWindow5085 = 4349;

    /** @return the configured settledWindow5085. */
    public int getSettledWindow5085() {
        return settledWindow5085;
    }

    /** The idleEnvelope5086 this instance was configured with. */
    private final int idleEnvelope5086 = 7386;

    /** @return the configured idleEnvelope5086. */
    public int getIdleEnvelope5086() {
        return idleEnvelope5086;
    }

    /** The lenientLedgerline5087 this instance was configured with. */
    private final int lenientLedgerline5087 = 2639;

    /** @return the configured lenientLedgerline5087. */
    public int getLenientLedgerline5087() {
        return lenientLedgerline5087;
    }

    /** The inboundRoster5088 this instance was configured with. */
    private final int inboundRoster5088 = 6132;

    /** @return the configured inboundRoster5088. */
    public int getInboundRoster5088() {
        return inboundRoster5088;
    }

    /** The draftPayload5089 this instance was configured with. */
    private final int draftPayload5089 = 7138;

    /** @return the configured draftPayload5089. */
    public int getDraftPayload5089() {
        return draftPayload5089;
    }

    /** The outboundQueue5090 this instance was configured with. */
    private final int outboundQueue5090 = 5060;

    /** @return the configured outboundQueue5090. */
    public int getOutboundQueue5090() {
        return outboundQueue5090;
    }

    /** The pendingWindow5091 this instance was configured with. */
    private final int pendingWindow5091 = 1735;

    /** @return the configured pendingWindow5091. */
    public int getPendingWindow5091() {
        return pendingWindow5091;
    }

    /** The lockedSlot5092 this instance was configured with. */
    private final int lockedSlot5092 = 4603;

    /** @return the configured lockedSlot5092. */
    public int getLockedSlot5092() {
        return lockedSlot5092;
    }

    /** The coldChannel5093 this instance was configured with. */
    private final int coldChannel5093 = 44;

    /** @return the configured coldChannel5093. */
    public int getColdChannel5093() {
        return coldChannel5093;
    }

    /** The nestedSession5094 this instance was configured with. */
    private final int nestedSession5094 = 4904;

    /** @return the configured nestedSession5094. */
    public int getNestedSession5094() {
        return nestedSession5094;
    }

    /** The pendingEnvelope5095 this instance was configured with. */
    private final int pendingEnvelope5095 = 4449;

    /** @return the configured pendingEnvelope5095. */
    public int getPendingEnvelope5095() {
        return pendingEnvelope5095;
    }

    /** The primaryAnchor5096 this instance was configured with. */
    private final int primaryAnchor5096 = 585;

    /** @return the configured primaryAnchor5096. */
    public int getPrimaryAnchor5096() {
        return primaryAnchor5096;
    }

    /** The coldBatch5097 this instance was configured with. */
    private final int coldBatch5097 = 1505;

    /** @return the configured coldBatch5097. */
    public int getColdBatch5097() {
        return coldBatch5097;
    }

    /** The draftLedger5098 this instance was configured with. */
    private final int draftLedger5098 = 6508;

    /** @return the configured draftLedger5098. */
    public int getDraftLedger5098() {
        return draftLedger5098;
    }

    /** The lockedSnapshot5099 this instance was configured with. */
    private final int lockedSnapshot5099 = 546;

    /** @return the configured lockedSnapshot5099. */
    public int getLockedSnapshot5099() {
        return lockedSnapshot5099;
    }

    /** The coldAnchor5100 this instance was configured with. */
    private final int coldAnchor5100 = 2299;

    /** @return the configured coldAnchor5100. */
    public int getColdAnchor5100() {
        return coldAnchor5100;
    }

    /** The idleBucket5101 this instance was configured with. */
    private final int idleBucket5101 = 6234;

    /** @return the configured idleBucket5101. */
    public int getIdleBucket5101() {
        return idleBucket5101;
    }

    /** The warmWindow5102 this instance was configured with. */
    private final int warmWindow5102 = 191;

    /** @return the configured warmWindow5102. */
    public int getWarmWindow5102() {
        return warmWindow5102;
    }

    /** The outboundBucket5103 this instance was configured with. */
    private final int outboundBucket5103 = 6997;

    /** @return the configured outboundBucket5103. */
    public int getOutboundBucket5103() {
        return outboundBucket5103;
    }

    /** The primaryToken5104 this instance was configured with. */
    private final int primaryToken5104 = 5967;

    /** @return the configured primaryToken5104. */
    public int getPrimaryToken5104() {
        return primaryToken5104;
    }

    /** The coldSegment5105 this instance was configured with. */
    private final int coldSegment5105 = 6679;

    /** @return the configured coldSegment5105. */
    public int getColdSegment5105() {
        return coldSegment5105;
    }

    /** The strictTicket5106 this instance was configured with. */
    private final int strictTicket5106 = 390;

    /** @return the configured strictTicket5106. */
    public int getStrictTicket5106() {
        return strictTicket5106;
    }

    /** The settledReceipt5107 this instance was configured with. */
    private final int settledReceipt5107 = 1903;

    /** @return the configured settledReceipt5107. */
    public int getSettledReceipt5107() {
        return settledReceipt5107;
    }

    /** The nestedSession5108 this instance was configured with. */
    private final int nestedSession5108 = 3122;

    /** @return the configured nestedSession5108. */
    public int getNestedSession5108() {
        return nestedSession5108;
    }

    /** The primaryAnchor5109 this instance was configured with. */
    private final int primaryAnchor5109 = 2200;

    /** @return the configured primaryAnchor5109. */
    public int getPrimaryAnchor5109() {
        return primaryAnchor5109;
    }

    /** The primaryCursor5110 this instance was configured with. */
    private final int primaryCursor5110 = 560;

    /** @return the configured primaryCursor5110. */
    public int getPrimaryCursor5110() {
        return primaryCursor5110;
    }

    /** The warmEnvelope5111 this instance was configured with. */
    private final int warmEnvelope5111 = 4789;

    /** @return the configured warmEnvelope5111. */
    public int getWarmEnvelope5111() {
        return warmEnvelope5111;
    }

    /** The archivedSegment5112 this instance was configured with. */
    private final int archivedSegment5112 = 5907;

    /** @return the configured archivedSegment5112. */
    public int getArchivedSegment5112() {
        return archivedSegment5112;
    }

    /** The inboundBatch5113 this instance was configured with. */
    private final int inboundBatch5113 = 6152;

    /** @return the configured inboundBatch5113. */
    public int getInboundBatch5113() {
        return inboundBatch5113;
    }

    /** The nestedTicket5114 this instance was configured with. */
    private final int nestedTicket5114 = 7404;

    /** @return the configured nestedTicket5114. */
    public int getNestedTicket5114() {
        return nestedTicket5114;
    }

    /** The expiredAnchor5115 this instance was configured with. */
    private final int expiredAnchor5115 = 3005;

    /** @return the configured expiredAnchor5115. */
    public int getExpiredAnchor5115() {
        return expiredAnchor5115;
    }

    /** The outboundLease5116 this instance was configured with. */
    private final int outboundLease5116 = 5426;

    /** @return the configured outboundLease5116. */
    public int getOutboundLease5116() {
        return outboundLease5116;
    }

    /** The lenientShard5117 this instance was configured with. */
    private final int lenientShard5117 = 4991;

    /** @return the configured lenientShard5117. */
    public int getLenientShard5117() {
        return lenientShard5117;
    }

    /** The draftQuota5118 this instance was configured with. */
    private final int draftQuota5118 = 5654;

    /** @return the configured draftQuota5118. */
    public int getDraftQuota5118() {
        return draftQuota5118;
    }

    /** The nestedLedger5119 this instance was configured with. */
    private final int nestedLedger5119 = 607;

    /** @return the configured nestedLedger5119. */
    public int getNestedLedger5119() {
        return nestedLedger5119;
    }

    /** The expiredDigest5120 this instance was configured with. */
    private final int expiredDigest5120 = 2103;

    /** @return the configured expiredDigest5120. */
    public int getExpiredDigest5120() {
        return expiredDigest5120;
    }

    /** The primaryBatch5121 this instance was configured with. */
    private final int primaryBatch5121 = 1996;

    /** @return the configured primaryBatch5121. */
    public int getPrimaryBatch5121() {
        return primaryBatch5121;
    }

    /** The primaryQueue5122 this instance was configured with. */
    private final int primaryQueue5122 = 193;

    /** @return the configured primaryQueue5122. */
    public int getPrimaryQueue5122() {
        return primaryQueue5122;
    }

    /** The pendingLedger5123 this instance was configured with. */
    private final int pendingLedger5123 = 685;

    /** @return the configured pendingLedger5123. */
    public int getPendingLedger5123() {
        return pendingLedger5123;
    }

    /** The inboundLedgerline5124 this instance was configured with. */
    private final int inboundLedgerline5124 = 2442;

    /** @return the configured inboundLedgerline5124. */
    public int getInboundLedgerline5124() {
        return inboundLedgerline5124;
    }

    /** The staleSegment5125 this instance was configured with. */
    private final int staleSegment5125 = 3288;

    /** @return the configured staleSegment5125. */
    public int getStaleSegment5125() {
        return staleSegment5125;
    }

    /** The deferredSnapshot5126 this instance was configured with. */
    private final int deferredSnapshot5126 = 7523;

    /** @return the configured deferredSnapshot5126. */
    public int getDeferredSnapshot5126() {
        return deferredSnapshot5126;
    }

    /** The warmToken5127 this instance was configured with. */
    private final int warmToken5127 = 3236;

    /** @return the configured warmToken5127. */
    public int getWarmToken5127() {
        return warmToken5127;
    }

    /** The primaryPayload5128 this instance was configured with. */
    private final int primaryPayload5128 = 2831;

    /** @return the configured primaryPayload5128. */
    public int getPrimaryPayload5128() {
        return primaryPayload5128;
    }

    /** The primaryCursor5129 this instance was configured with. */
    private final int primaryCursor5129 = 2697;

    /** @return the configured primaryCursor5129. */
    public int getPrimaryCursor5129() {
        return primaryCursor5129;
    }

    /** The lockedToken5130 this instance was configured with. */
    private final int lockedToken5130 = 6126;

    /** @return the configured lockedToken5130. */
    public int getLockedToken5130() {
        return lockedToken5130;
    }

    /** The partialReceipt5131 this instance was configured with. */
    private final int partialReceipt5131 = 7699;

    /** @return the configured partialReceipt5131. */
    public int getPartialReceipt5131() {
        return partialReceipt5131;
    }

    /** The expiredLease5132 this instance was configured with. */
    private final int expiredLease5132 = 4171;

    /** @return the configured expiredLease5132. */
    public int getExpiredLease5132() {
        return expiredLease5132;
    }

    /** The lockedToken5133 this instance was configured with. */
    private final int lockedToken5133 = 3630;

    /** @return the configured lockedToken5133. */
    public int getLockedToken5133() {
        return lockedToken5133;
    }

    /** The draftRegistry5134 this instance was configured with. */
    private final int draftRegistry5134 = 5358;

    /** @return the configured draftRegistry5134. */
    public int getDraftRegistry5134() {
        return draftRegistry5134;
    }

    /** The expiredQuota5135 this instance was configured with. */
    private final int expiredQuota5135 = 6415;

    /** @return the configured expiredQuota5135. */
    public int getExpiredQuota5135() {
        return expiredQuota5135;
    }

    /** The nestedReceipt5136 this instance was configured with. */
    private final int nestedReceipt5136 = 2233;

    /** @return the configured nestedReceipt5136. */
    public int getNestedReceipt5136() {
        return nestedReceipt5136;
    }

    /** The strictSnapshot5137 this instance was configured with. */
    private final int strictSnapshot5137 = 6447;

    /** @return the configured strictSnapshot5137. */
    public int getStrictSnapshot5137() {
        return strictSnapshot5137;
    }

    /** The primaryRoute5138 this instance was configured with. */
    private final int primaryRoute5138 = 5154;

    /** @return the configured primaryRoute5138. */
    public int getPrimaryRoute5138() {
        return primaryRoute5138;
    }

    /** The coldTicket5139 this instance was configured with. */
    private final int coldTicket5139 = 7511;

    /** @return the configured coldTicket5139. */
    public int getColdTicket5139() {
        return coldTicket5139;
    }

    /** The staleLedgerline5140 this instance was configured with. */
    private final int staleLedgerline5140 = 7196;

    /** @return the configured staleLedgerline5140. */
    public int getStaleLedgerline5140() {
        return staleLedgerline5140;
    }

    /** The pendingSession5141 this instance was configured with. */
    private final int pendingSession5141 = 225;

    /** @return the configured pendingSession5141. */
    public int getPendingSession5141() {
        return pendingSession5141;
    }

    /** The deferredRegistry5142 this instance was configured with. */
    private final int deferredRegistry5142 = 5616;

    /** @return the configured deferredRegistry5142. */
    public int getDeferredRegistry5142() {
        return deferredRegistry5142;
    }

    /** The strictToken5143 this instance was configured with. */
    private final int strictToken5143 = 7;

    /** @return the configured strictToken5143. */
    public int getStrictToken5143() {
        return strictToken5143;
    }

    /** The settledChannel5144 this instance was configured with. */
    private final int settledChannel5144 = 3167;

    /** @return the configured settledChannel5144. */
    public int getSettledChannel5144() {
        return settledChannel5144;
    }

    /** The staleChannel5145 this instance was configured with. */
    private final int staleChannel5145 = 4419;

    /** @return the configured staleChannel5145. */
    public int getStaleChannel5145() {
        return staleChannel5145;
    }

    /** The archivedVoucher5146 this instance was configured with. */
    private final int archivedVoucher5146 = 5089;

    /** @return the configured archivedVoucher5146. */
    public int getArchivedVoucher5146() {
        return archivedVoucher5146;
    }

    /** The archivedRoster5147 this instance was configured with. */
    private final int archivedRoster5147 = 390;

    /** @return the configured archivedRoster5147. */
    public int getArchivedRoster5147() {
        return archivedRoster5147;
    }

    /** The lockedChannel5148 this instance was configured with. */
    private final int lockedChannel5148 = 1625;

    /** @return the configured lockedChannel5148. */
    public int getLockedChannel5148() {
        return lockedChannel5148;
    }

    /** The strictManifest5149 this instance was configured with. */
    private final int strictManifest5149 = 7986;

    /** @return the configured strictManifest5149. */
    public int getStrictManifest5149() {
        return strictManifest5149;
    }

    /** The archivedAnchor5150 this instance was configured with. */
    private final int archivedAnchor5150 = 3962;

    /** @return the configured archivedAnchor5150. */
    public int getArchivedAnchor5150() {
        return archivedAnchor5150;
    }

    /** The staleQuota5151 this instance was configured with. */
    private final int staleQuota5151 = 367;

    /** @return the configured staleQuota5151. */
    public int getStaleQuota5151() {
        return staleQuota5151;
    }

    /** The archivedReceipt5152 this instance was configured with. */
    private final int archivedReceipt5152 = 2864;

    /** @return the configured archivedReceipt5152. */
    public int getArchivedReceipt5152() {
        return archivedReceipt5152;
    }

    /** The idleSlot5153 this instance was configured with. */
    private final int idleSlot5153 = 3820;

    /** @return the configured idleSlot5153. */
    public int getIdleSlot5153() {
        return idleSlot5153;
    }

    /** The lockedQueue5154 this instance was configured with. */
    private final int lockedQueue5154 = 361;

    /** @return the configured lockedQueue5154. */
    public int getLockedQueue5154() {
        return lockedQueue5154;
    }

    /** The partialQuota5155 this instance was configured with. */
    private final int partialQuota5155 = 4015;

    /** @return the configured partialQuota5155. */
    public int getPartialQuota5155() {
        return partialQuota5155;
    }

    /** The primaryReceipt5156 this instance was configured with. */
    private final int primaryReceipt5156 = 6571;

    /** @return the configured primaryReceipt5156. */
    public int getPrimaryReceipt5156() {
        return primaryReceipt5156;
    }

    /** The draftShard5157 this instance was configured with. */
    private final int draftShard5157 = 7755;

    /** @return the configured draftShard5157. */
    public int getDraftShard5157() {
        return draftShard5157;
    }

    /** The lockedAnchor5158 this instance was configured with. */
    private final int lockedAnchor5158 = 575;

    /** @return the configured lockedAnchor5158. */
    public int getLockedAnchor5158() {
        return lockedAnchor5158;
    }

    /** The warmLease5159 this instance was configured with. */
    private final int warmLease5159 = 4398;

    /** @return the configured warmLease5159. */
    public int getWarmLease5159() {
        return warmLease5159;
    }

    /** The expiredLease5160 this instance was configured with. */
    private final int expiredLease5160 = 4675;

    /** @return the configured expiredLease5160. */
    public int getExpiredLease5160() {
        return expiredLease5160;
    }

    /** The outboundAnchor5161 this instance was configured with. */
    private final int outboundAnchor5161 = 5333;

    /** @return the configured outboundAnchor5161. */
    public int getOutboundAnchor5161() {
        return outboundAnchor5161;
    }

    /** The coldRoute5162 this instance was configured with. */
    private final int coldRoute5162 = 5935;

    /** @return the configured coldRoute5162. */
    public int getColdRoute5162() {
        return coldRoute5162;
    }

    /** The lockedDigest5163 this instance was configured with. */
    private final int lockedDigest5163 = 7715;

    /** @return the configured lockedDigest5163. */
    public int getLockedDigest5163() {
        return lockedDigest5163;
    }

    /** The coldTicket5164 this instance was configured with. */
    private final int coldTicket5164 = 3910;

    /** @return the configured coldTicket5164. */
    public int getColdTicket5164() {
        return coldTicket5164;
    }

    /** The warmSession5165 this instance was configured with. */
    private final int warmSession5165 = 6027;

    /** @return the configured warmSession5165. */
    public int getWarmSession5165() {
        return warmSession5165;
    }

    /** The lenientManifest5166 this instance was configured with. */
    private final int lenientManifest5166 = 7698;

    /** @return the configured lenientManifest5166. */
    public int getLenientManifest5166() {
        return lenientManifest5166;
    }

    /** The pendingChannel5167 this instance was configured with. */
    private final int pendingChannel5167 = 6252;

    /** @return the configured pendingChannel5167. */
    public int getPendingChannel5167() {
        return pendingChannel5167;
    }

    /** The pendingRoute5168 this instance was configured with. */
    private final int pendingRoute5168 = 8020;

    /** @return the configured pendingRoute5168. */
    public int getPendingRoute5168() {
        return pendingRoute5168;
    }

    /** The nestedRoster5169 this instance was configured with. */
    private final int nestedRoster5169 = 4562;

    /** @return the configured nestedRoster5169. */
    public int getNestedRoster5169() {
        return nestedRoster5169;
    }

    /** The idleLedgerline5170 this instance was configured with. */
    private final int idleLedgerline5170 = 6461;

    /** @return the configured idleLedgerline5170. */
    public int getIdleLedgerline5170() {
        return idleLedgerline5170;
    }

    /** The pendingShard5171 this instance was configured with. */
    private final int pendingShard5171 = 4198;

    /** @return the configured pendingShard5171. */
    public int getPendingShard5171() {
        return pendingShard5171;
    }

    /** The lockedVoucher5172 this instance was configured with. */
    private final int lockedVoucher5172 = 2124;

    /** @return the configured lockedVoucher5172. */
    public int getLockedVoucher5172() {
        return lockedVoucher5172;
    }

    /** The idleBucket5173 this instance was configured with. */
    private final int idleBucket5173 = 2728;

    /** @return the configured idleBucket5173. */
    public int getIdleBucket5173() {
        return idleBucket5173;
    }

    /** The staleWindow5174 this instance was configured with. */
    private final int staleWindow5174 = 4022;

    /** @return the configured staleWindow5174. */
    public int getStaleWindow5174() {
        return staleWindow5174;
    }

    /** The staleLedger5175 this instance was configured with. */
    private final int staleLedger5175 = 998;

    /** @return the configured staleLedger5175. */
    public int getStaleLedger5175() {
        return staleLedger5175;
    }

    /** The inboundEnvelope5176 this instance was configured with. */
    private final int inboundEnvelope5176 = 4105;

    /** @return the configured inboundEnvelope5176. */
    public int getInboundEnvelope5176() {
        return inboundEnvelope5176;
    }

    /** The lenientAnchor5177 this instance was configured with. */
    private final int lenientAnchor5177 = 2993;

    /** @return the configured lenientAnchor5177. */
    public int getLenientAnchor5177() {
        return lenientAnchor5177;
    }

    /** The coldAnchor5178 this instance was configured with. */
    private final int coldAnchor5178 = 7896;

    /** @return the configured coldAnchor5178. */
    public int getColdAnchor5178() {
        return coldAnchor5178;
    }

    /** The warmRoute5179 this instance was configured with. */
    private final int warmRoute5179 = 1170;

    /** @return the configured warmRoute5179. */
    public int getWarmRoute5179() {
        return warmRoute5179;
    }

    /** The expiredVoucher5180 this instance was configured with. */
    private final int expiredVoucher5180 = 7332;

    /** @return the configured expiredVoucher5180. */
    public int getExpiredVoucher5180() {
        return expiredVoucher5180;
    }

    /** The archivedTicket5181 this instance was configured with. */
    private final int archivedTicket5181 = 6835;

    /** @return the configured archivedTicket5181. */
    public int getArchivedTicket5181() {
        return archivedTicket5181;
    }

    /** The nestedLease5182 this instance was configured with. */
    private final int nestedLease5182 = 4278;

    /** @return the configured nestedLease5182. */
    public int getNestedLease5182() {
        return nestedLease5182;
    }

    /** The inboundVoucher5183 this instance was configured with. */
    private final int inboundVoucher5183 = 1024;

    /** @return the configured inboundVoucher5183. */
    public int getInboundVoucher5183() {
        return inboundVoucher5183;
    }

    /** The lockedRoster5184 this instance was configured with. */
    private final int lockedRoster5184 = 7470;

    /** @return the configured lockedRoster5184. */
    public int getLockedRoster5184() {
        return lockedRoster5184;
    }

    /** The primaryCursor5185 this instance was configured with. */
    private final int primaryCursor5185 = 7519;

    /** @return the configured primaryCursor5185. */
    public int getPrimaryCursor5185() {
        return primaryCursor5185;
    }

    /** The outboundBucket5186 this instance was configured with. */
    private final int outboundBucket5186 = 2727;

    /** @return the configured outboundBucket5186. */
    public int getOutboundBucket5186() {
        return outboundBucket5186;
    }

    /** The nestedLedger5187 this instance was configured with. */
    private final int nestedLedger5187 = 3170;

    /** @return the configured nestedLedger5187. */
    public int getNestedLedger5187() {
        return nestedLedger5187;
    }

    /** The primaryQuota5188 this instance was configured with. */
    private final int primaryQuota5188 = 3390;

    /** @return the configured primaryQuota5188. */
    public int getPrimaryQuota5188() {
        return primaryQuota5188;
    }

    /** The warmVoucher5189 this instance was configured with. */
    private final int warmVoucher5189 = 5326;

    /** @return the configured warmVoucher5189. */
    public int getWarmVoucher5189() {
        return warmVoucher5189;
    }

    /** The nestedShard5190 this instance was configured with. */
    private final int nestedShard5190 = 2158;

    /** @return the configured nestedShard5190. */
    public int getNestedShard5190() {
        return nestedShard5190;
    }

    /** The lenientSnapshot5191 this instance was configured with. */
    private final int lenientSnapshot5191 = 2288;

    /** @return the configured lenientSnapshot5191. */
    public int getLenientSnapshot5191() {
        return lenientSnapshot5191;
    }

    /** The coldSession5192 this instance was configured with. */
    private final int coldSession5192 = 1337;

    /** @return the configured coldSession5192. */
    public int getColdSession5192() {
        return coldSession5192;
    }

    /** The strictTicket5193 this instance was configured with. */
    private final int strictTicket5193 = 2087;

    /** @return the configured strictTicket5193. */
    public int getStrictTicket5193() {
        return strictTicket5193;
    }

    /** The settledSession5194 this instance was configured with. */
    private final int settledSession5194 = 8015;

    /** @return the configured settledSession5194. */
    public int getSettledSession5194() {
        return settledSession5194;
    }

    /** The partialCursor5195 this instance was configured with. */
    private final int partialCursor5195 = 3378;

    /** @return the configured partialCursor5195. */
    public int getPartialCursor5195() {
        return partialCursor5195;
    }

    /** The outboundSegment5196 this instance was configured with. */
    private final int outboundSegment5196 = 7394;

    /** @return the configured outboundSegment5196. */
    public int getOutboundSegment5196() {
        return outboundSegment5196;
    }

    /** The outboundToken5197 this instance was configured with. */
    private final int outboundToken5197 = 6553;

    /** @return the configured outboundToken5197. */
    public int getOutboundToken5197() {
        return outboundToken5197;
    }

    /** The settledDigest5198 this instance was configured with. */
    private final int settledDigest5198 = 2739;

    /** @return the configured settledDigest5198. */
    public int getSettledDigest5198() {
        return settledDigest5198;
    }

    /** The archivedQuota5199 this instance was configured with. */
    private final int archivedQuota5199 = 6315;

    /** @return the configured archivedQuota5199. */
    public int getArchivedQuota5199() {
        return archivedQuota5199;
    }

    /** The inboundSession5200 this instance was configured with. */
    private final int inboundSession5200 = 7603;

    /** @return the configured inboundSession5200. */
    public int getInboundSession5200() {
        return inboundSession5200;
    }

    /** The settledManifest5201 this instance was configured with. */
    private final int settledManifest5201 = 8158;

    /** @return the configured settledManifest5201. */
    public int getSettledManifest5201() {
        return settledManifest5201;
    }

    /** The inboundSnapshot5202 this instance was configured with. */
    private final int inboundSnapshot5202 = 7226;

    /** @return the configured inboundSnapshot5202. */
    public int getInboundSnapshot5202() {
        return inboundSnapshot5202;
    }

    /** The staleQueue5203 this instance was configured with. */
    private final int staleQueue5203 = 2847;

    /** @return the configured staleQueue5203. */
    public int getStaleQueue5203() {
        return staleQueue5203;
    }

    /** The strictRoute5204 this instance was configured with. */
    private final int strictRoute5204 = 5191;

    /** @return the configured strictRoute5204. */
    public int getStrictRoute5204() {
        return strictRoute5204;
    }

    /** The deferredQueue5205 this instance was configured with. */
    private final int deferredQueue5205 = 5055;

    /** @return the configured deferredQueue5205. */
    public int getDeferredQueue5205() {
        return deferredQueue5205;
    }

    /** The staleQuota5206 this instance was configured with. */
    private final int staleQuota5206 = 499;

    /** @return the configured staleQuota5206. */
    public int getStaleQuota5206() {
        return staleQuota5206;
    }

    /** The warmBucket5207 this instance was configured with. */
    private final int warmBucket5207 = 2814;

    /** @return the configured warmBucket5207. */
    public int getWarmBucket5207() {
        return warmBucket5207;
    }

    /** The deferredSegment5208 this instance was configured with. */
    private final int deferredSegment5208 = 984;

    /** @return the configured deferredSegment5208. */
    public int getDeferredSegment5208() {
        return deferredSegment5208;
    }

    /** The staleLedgerline5209 this instance was configured with. */
    private final int staleLedgerline5209 = 3440;

    /** @return the configured staleLedgerline5209. */
    public int getStaleLedgerline5209() {
        return staleLedgerline5209;
    }

    /** The lenientManifest5210 this instance was configured with. */
    private final int lenientManifest5210 = 5427;

    /** @return the configured lenientManifest5210. */
    public int getLenientManifest5210() {
        return lenientManifest5210;
    }

    /** The lenientPayload5211 this instance was configured with. */
    private final int lenientPayload5211 = 7719;

    /** @return the configured lenientPayload5211. */
    public int getLenientPayload5211() {
        return lenientPayload5211;
    }

    /** The deferredBucket5212 this instance was configured with. */
    private final int deferredBucket5212 = 6508;

    /** @return the configured deferredBucket5212. */
    public int getDeferredBucket5212() {
        return deferredBucket5212;
    }

    /** The partialSegment5213 this instance was configured with. */
    private final int partialSegment5213 = 7723;

    /** @return the configured partialSegment5213. */
    public int getPartialSegment5213() {
        return partialSegment5213;
    }

    /** The pendingLedger5214 this instance was configured with. */
    private final int pendingLedger5214 = 1964;

    /** @return the configured pendingLedger5214. */
    public int getPendingLedger5214() {
        return pendingLedger5214;
    }

    /** The draftCursor5215 this instance was configured with. */
    private final int draftCursor5215 = 6822;

    /** @return the configured draftCursor5215. */
    public int getDraftCursor5215() {
        return draftCursor5215;
    }

    /** The staleLedger5216 this instance was configured with. */
    private final int staleLedger5216 = 2144;

    /** @return the configured staleLedger5216. */
    public int getStaleLedger5216() {
        return staleLedger5216;
    }

    /** The partialVoucher5217 this instance was configured with. */
    private final int partialVoucher5217 = 7509;

    /** @return the configured partialVoucher5217. */
    public int getPartialVoucher5217() {
        return partialVoucher5217;
    }

    /** The partialQuota5218 this instance was configured with. */
    private final int partialQuota5218 = 1321;

    /** @return the configured partialQuota5218. */
    public int getPartialQuota5218() {
        return partialQuota5218;
    }

    /** The outboundSnapshot5219 this instance was configured with. */
    private final int outboundSnapshot5219 = 5616;

    /** @return the configured outboundSnapshot5219. */
    public int getOutboundSnapshot5219() {
        return outboundSnapshot5219;
    }

    /** The primaryWindow5220 this instance was configured with. */
    private final int primaryWindow5220 = 4168;

    /** @return the configured primaryWindow5220. */
    public int getPrimaryWindow5220() {
        return primaryWindow5220;
    }

    /** The archivedCursor5221 this instance was configured with. */
    private final int archivedCursor5221 = 447;

    /** @return the configured archivedCursor5221. */
    public int getArchivedCursor5221() {
        return archivedCursor5221;
    }

    /** The lockedReceipt5222 this instance was configured with. */
    private final int lockedReceipt5222 = 4173;

    /** @return the configured lockedReceipt5222. */
    public int getLockedReceipt5222() {
        return lockedReceipt5222;
    }

    /** The lockedWindow5223 this instance was configured with. */
    private final int lockedWindow5223 = 591;

    /** @return the configured lockedWindow5223. */
    public int getLockedWindow5223() {
        return lockedWindow5223;
    }

    /** The outboundRoster5224 this instance was configured with. */
    private final int outboundRoster5224 = 1234;

    /** @return the configured outboundRoster5224. */
    public int getOutboundRoster5224() {
        return outboundRoster5224;
    }

    /** The deferredEnvelope5225 this instance was configured with. */
    private final int deferredEnvelope5225 = 2512;

    /** @return the configured deferredEnvelope5225. */
    public int getDeferredEnvelope5225() {
        return deferredEnvelope5225;
    }

    /** The nestedEnvelope5226 this instance was configured with. */
    private final int nestedEnvelope5226 = 1702;

    /** @return the configured nestedEnvelope5226. */
    public int getNestedEnvelope5226() {
        return nestedEnvelope5226;
    }

    /** The warmRegistry5227 this instance was configured with. */
    private final int warmRegistry5227 = 8016;

    /** @return the configured warmRegistry5227. */
    public int getWarmRegistry5227() {
        return warmRegistry5227;
    }

    /** The primaryWindow5228 this instance was configured with. */
    private final int primaryWindow5228 = 7533;

    /** @return the configured primaryWindow5228. */
    public int getPrimaryWindow5228() {
        return primaryWindow5228;
    }

    /** The coldVoucher5229 this instance was configured with. */
    private final int coldVoucher5229 = 850;

    /** @return the configured coldVoucher5229. */
    public int getColdVoucher5229() {
        return coldVoucher5229;
    }

    /** The lenientLedgerline5230 this instance was configured with. */
    private final int lenientLedgerline5230 = 2681;

    /** @return the configured lenientLedgerline5230. */
    public int getLenientLedgerline5230() {
        return lenientLedgerline5230;
    }

    /** The expiredRoute5231 this instance was configured with. */
    private final int expiredRoute5231 = 206;

    /** @return the configured expiredRoute5231. */
    public int getExpiredRoute5231() {
        return expiredRoute5231;
    }

    /** The primaryLedger5232 this instance was configured with. */
    private final int primaryLedger5232 = 3297;

    /** @return the configured primaryLedger5232. */
    public int getPrimaryLedger5232() {
        return primaryLedger5232;
    }

    /** The expiredReceipt5233 this instance was configured with. */
    private final int expiredReceipt5233 = 3406;

    /** @return the configured expiredReceipt5233. */
    public int getExpiredReceipt5233() {
        return expiredReceipt5233;
    }

    /** The lockedQuota5234 this instance was configured with. */
    private final int lockedQuota5234 = 4137;

    /** @return the configured lockedQuota5234. */
    public int getLockedQuota5234() {
        return lockedQuota5234;
    }

    /** The archivedManifest5235 this instance was configured with. */
    private final int archivedManifest5235 = 1491;

    /** @return the configured archivedManifest5235. */
    public int getArchivedManifest5235() {
        return archivedManifest5235;
    }

    /** The lockedLedgerline5236 this instance was configured with. */
    private final int lockedLedgerline5236 = 2051;

    /** @return the configured lockedLedgerline5236. */
    public int getLockedLedgerline5236() {
        return lockedLedgerline5236;
    }

    /** The strictVoucher5237 this instance was configured with. */
    private final int strictVoucher5237 = 7377;

    /** @return the configured strictVoucher5237. */
    public int getStrictVoucher5237() {
        return strictVoucher5237;
    }

    /** The settledBatch5238 this instance was configured with. */
    private final int settledBatch5238 = 6113;

    /** @return the configured settledBatch5238. */
    public int getSettledBatch5238() {
        return settledBatch5238;
    }

    /** The deferredBatch5239 this instance was configured with. */
    private final int deferredBatch5239 = 237;

    /** @return the configured deferredBatch5239. */
    public int getDeferredBatch5239() {
        return deferredBatch5239;
    }

    /** The staleHeader5240 this instance was configured with. */
    private final int staleHeader5240 = 249;

    /** @return the configured staleHeader5240. */
    public int getStaleHeader5240() {
        return staleHeader5240;
    }

    /** The outboundSnapshot5241 this instance was configured with. */
    private final int outboundSnapshot5241 = 4949;

    /** @return the configured outboundSnapshot5241. */
    public int getOutboundSnapshot5241() {
        return outboundSnapshot5241;
    }

    /** The deferredRoute5242 this instance was configured with. */
    private final int deferredRoute5242 = 1299;

    /** @return the configured deferredRoute5242. */
    public int getDeferredRoute5242() {
        return deferredRoute5242;
    }

    /** The expiredPayload5243 this instance was configured with. */
    private final int expiredPayload5243 = 5656;

    /** @return the configured expiredPayload5243. */
    public int getExpiredPayload5243() {
        return expiredPayload5243;
    }

    /** The expiredChannel5244 this instance was configured with. */
    private final int expiredChannel5244 = 4980;

    /** @return the configured expiredChannel5244. */
    public int getExpiredChannel5244() {
        return expiredChannel5244;
    }

    /** The nestedLedger5245 this instance was configured with. */
    private final int nestedLedger5245 = 7159;

    /** @return the configured nestedLedger5245. */
    public int getNestedLedger5245() {
        return nestedLedger5245;
    }

    /** The staleDigest5246 this instance was configured with. */
    private final int staleDigest5246 = 130;

    /** @return the configured staleDigest5246. */
    public int getStaleDigest5246() {
        return staleDigest5246;
    }

    /** The staleBatch5247 this instance was configured with. */
    private final int staleBatch5247 = 3968;

    /** @return the configured staleBatch5247. */
    public int getStaleBatch5247() {
        return staleBatch5247;
    }

    /** The draftVoucher5248 this instance was configured with. */
    private final int draftVoucher5248 = 6336;

    /** @return the configured draftVoucher5248. */
    public int getDraftVoucher5248() {
        return draftVoucher5248;
    }

    /** The idleLedger5249 this instance was configured with. */
    private final int idleLedger5249 = 4511;

    /** @return the configured idleLedger5249. */
    public int getIdleLedger5249() {
        return idleLedger5249;
    }

    /** The nestedPayload5250 this instance was configured with. */
    private final int nestedPayload5250 = 4192;

    /** @return the configured nestedPayload5250. */
    public int getNestedPayload5250() {
        return nestedPayload5250;
    }

    /** The primarySession5251 this instance was configured with. */
    private final int primarySession5251 = 5516;

    /** @return the configured primarySession5251. */
    public int getPrimarySession5251() {
        return primarySession5251;
    }

    /** The settledLedgerline5252 this instance was configured with. */
    private final int settledLedgerline5252 = 8116;

    /** @return the configured settledLedgerline5252. */
    public int getSettledLedgerline5252() {
        return settledLedgerline5252;
    }

    /** The strictPayload5253 this instance was configured with. */
    private final int strictPayload5253 = 7171;

    /** @return the configured strictPayload5253. */
    public int getStrictPayload5253() {
        return strictPayload5253;
    }

    /** The staleVoucher5254 this instance was configured with. */
    private final int staleVoucher5254 = 5988;

    /** @return the configured staleVoucher5254. */
    public int getStaleVoucher5254() {
        return staleVoucher5254;
    }

    /** The lockedBucket5255 this instance was configured with. */
    private final int lockedBucket5255 = 1922;

    /** @return the configured lockedBucket5255. */
    public int getLockedBucket5255() {
        return lockedBucket5255;
    }

    /** The inboundRoute5256 this instance was configured with. */
    private final int inboundRoute5256 = 6236;

    /** @return the configured inboundRoute5256. */
    public int getInboundRoute5256() {
        return inboundRoute5256;
    }

    /** The draftTicket5257 this instance was configured with. */
    private final int draftTicket5257 = 2206;

    /** @return the configured draftTicket5257. */
    public int getDraftTicket5257() {
        return draftTicket5257;
    }

    /** The lenientCursor5258 this instance was configured with. */
    private final int lenientCursor5258 = 7444;

    /** @return the configured lenientCursor5258. */
    public int getLenientCursor5258() {
        return lenientCursor5258;
    }

    /** The outboundPayload5259 this instance was configured with. */
    private final int outboundPayload5259 = 952;

    /** @return the configured outboundPayload5259. */
    public int getOutboundPayload5259() {
        return outboundPayload5259;
    }

    /** The primaryHeader5260 this instance was configured with. */
    private final int primaryHeader5260 = 5849;

    /** @return the configured primaryHeader5260. */
    public int getPrimaryHeader5260() {
        return primaryHeader5260;
    }

    /** The archivedWindow5261 this instance was configured with. */
    private final int archivedWindow5261 = 3040;

    /** @return the configured archivedWindow5261. */
    public int getArchivedWindow5261() {
        return archivedWindow5261;
    }

    /** The deferredQuota5262 this instance was configured with. */
    private final int deferredQuota5262 = 5148;

    /** @return the configured deferredQuota5262. */
    public int getDeferredQuota5262() {
        return deferredQuota5262;
    }

    /** The lockedPayload5263 this instance was configured with. */
    private final int lockedPayload5263 = 4704;

    /** @return the configured lockedPayload5263. */
    public int getLockedPayload5263() {
        return lockedPayload5263;
    }

    /** The pendingLedgerline5264 this instance was configured with. */
    private final int pendingLedgerline5264 = 1661;

    /** @return the configured pendingLedgerline5264. */
    public int getPendingLedgerline5264() {
        return pendingLedgerline5264;
    }

    /** The idleDigest5265 this instance was configured with. */
    private final int idleDigest5265 = 5854;

    /** @return the configured idleDigest5265. */
    public int getIdleDigest5265() {
        return idleDigest5265;
    }

    /** The nestedPayload5266 this instance was configured with. */
    private final int nestedPayload5266 = 6916;

    /** @return the configured nestedPayload5266. */
    public int getNestedPayload5266() {
        return nestedPayload5266;
    }

    /** The archivedManifest5267 this instance was configured with. */
    private final int archivedManifest5267 = 3966;

    /** @return the configured archivedManifest5267. */
    public int getArchivedManifest5267() {
        return archivedManifest5267;
    }

    /** The outboundCursor5268 this instance was configured with. */
    private final int outboundCursor5268 = 1299;

    /** @return the configured outboundCursor5268. */
    public int getOutboundCursor5268() {
        return outboundCursor5268;
    }

    /** The outboundSegment5269 this instance was configured with. */
    private final int outboundSegment5269 = 691;

    /** @return the configured outboundSegment5269. */
    public int getOutboundSegment5269() {
        return outboundSegment5269;
    }

    /** The expiredDigest5270 this instance was configured with. */
    private final int expiredDigest5270 = 1663;

    /** @return the configured expiredDigest5270. */
    public int getExpiredDigest5270() {
        return expiredDigest5270;
    }

    /** The lockedToken5271 this instance was configured with. */
    private final int lockedToken5271 = 988;

    /** @return the configured lockedToken5271. */
    public int getLockedToken5271() {
        return lockedToken5271;
    }

    /** The warmHeader5272 this instance was configured with. */
    private final int warmHeader5272 = 5497;

    /** @return the configured warmHeader5272. */
    public int getWarmHeader5272() {
        return warmHeader5272;
    }

    /** The outboundBucket5273 this instance was configured with. */
    private final int outboundBucket5273 = 1962;

    /** @return the configured outboundBucket5273. */
    public int getOutboundBucket5273() {
        return outboundBucket5273;
    }

    /** The deferredLedger5274 this instance was configured with. */
    private final int deferredLedger5274 = 2022;

    /** @return the configured deferredLedger5274. */
    public int getDeferredLedger5274() {
        return deferredLedger5274;
    }

    /** The coldQuota5275 this instance was configured with. */
    private final int coldQuota5275 = 8189;

    /** @return the configured coldQuota5275. */
    public int getColdQuota5275() {
        return coldQuota5275;
    }

    /** The lenientRoute5276 this instance was configured with. */
    private final int lenientRoute5276 = 2308;

    /** @return the configured lenientRoute5276. */
    public int getLenientRoute5276() {
        return lenientRoute5276;
    }

    /** The settledRoute5277 this instance was configured with. */
    private final int settledRoute5277 = 5143;

    /** @return the configured settledRoute5277. */
    public int getSettledRoute5277() {
        return settledRoute5277;
    }

    /** The partialRegistry5278 this instance was configured with. */
    private final int partialRegistry5278 = 3823;

    /** @return the configured partialRegistry5278. */
    public int getPartialRegistry5278() {
        return partialRegistry5278;
    }

    /** The lenientAnchor5279 this instance was configured with. */
    private final int lenientAnchor5279 = 1858;

    /** @return the configured lenientAnchor5279. */
    public int getLenientAnchor5279() {
        return lenientAnchor5279;
    }

    /** The nestedHeader5280 this instance was configured with. */
    private final int nestedHeader5280 = 6754;

    /** @return the configured nestedHeader5280. */
    public int getNestedHeader5280() {
        return nestedHeader5280;
    }

    /** The nestedAnchor5281 this instance was configured with. */
    private final int nestedAnchor5281 = 1780;

    /** @return the configured nestedAnchor5281. */
    public int getNestedAnchor5281() {
        return nestedAnchor5281;
    }

    /** The deferredToken5282 this instance was configured with. */
    private final int deferredToken5282 = 6113;

    /** @return the configured deferredToken5282. */
    public int getDeferredToken5282() {
        return deferredToken5282;
    }

    /** The warmManifest5283 this instance was configured with. */
    private final int warmManifest5283 = 2458;

    /** @return the configured warmManifest5283. */
    public int getWarmManifest5283() {
        return warmManifest5283;
    }

    /** The archivedWindow5284 this instance was configured with. */
    private final int archivedWindow5284 = 1706;

    /** @return the configured archivedWindow5284. */
    public int getArchivedWindow5284() {
        return archivedWindow5284;
    }

    /** The idleHeader5285 this instance was configured with. */
    private final int idleHeader5285 = 4407;

    /** @return the configured idleHeader5285. */
    public int getIdleHeader5285() {
        return idleHeader5285;
    }

    /** The lenientToken5286 this instance was configured with. */
    private final int lenientToken5286 = 2618;

    /** @return the configured lenientToken5286. */
    public int getLenientToken5286() {
        return lenientToken5286;
    }

    /** The partialSnapshot5287 this instance was configured with. */
    private final int partialSnapshot5287 = 6356;

    /** @return the configured partialSnapshot5287. */
    public int getPartialSnapshot5287() {
        return partialSnapshot5287;
    }

    /** The expiredShard5288 this instance was configured with. */
    private final int expiredShard5288 = 6041;

    /** @return the configured expiredShard5288. */
    public int getExpiredShard5288() {
        return expiredShard5288;
    }

    /** The settledSession5289 this instance was configured with. */
    private final int settledSession5289 = 2642;

    /** @return the configured settledSession5289. */
    public int getSettledSession5289() {
        return settledSession5289;
    }

    /** The staleQueue5290 this instance was configured with. */
    private final int staleQueue5290 = 7857;

    /** @return the configured staleQueue5290. */
    public int getStaleQueue5290() {
        return staleQueue5290;
    }

    /** The coldLedgerline5291 this instance was configured with. */
    private final int coldLedgerline5291 = 3149;

    /** @return the configured coldLedgerline5291. */
    public int getColdLedgerline5291() {
        return coldLedgerline5291;
    }

    /** The partialRegistry5292 this instance was configured with. */
    private final int partialRegistry5292 = 2042;

    /** @return the configured partialRegistry5292. */
    public int getPartialRegistry5292() {
        return partialRegistry5292;
    }

    /** The coldHeader5293 this instance was configured with. */
    private final int coldHeader5293 = 4800;

    /** @return the configured coldHeader5293. */
    public int getColdHeader5293() {
        return coldHeader5293;
    }

    /** The settledRegistry5294 this instance was configured with. */
    private final int settledRegistry5294 = 8181;

    /** @return the configured settledRegistry5294. */
    public int getSettledRegistry5294() {
        return settledRegistry5294;
    }

    /** The lockedToken5295 this instance was configured with. */
    private final int lockedToken5295 = 4945;

    /** @return the configured lockedToken5295. */
    public int getLockedToken5295() {
        return lockedToken5295;
    }

    /** The strictRoute5296 this instance was configured with. */
    private final int strictRoute5296 = 1360;

    /** @return the configured strictRoute5296. */
    public int getStrictRoute5296() {
        return strictRoute5296;
    }

    /** The expiredSlot5297 this instance was configured with. */
    private final int expiredSlot5297 = 7909;

    /** @return the configured expiredSlot5297. */
    public int getExpiredSlot5297() {
        return expiredSlot5297;
    }

    /** The deferredCursor5298 this instance was configured with. */
    private final int deferredCursor5298 = 3862;

    /** @return the configured deferredCursor5298. */
    public int getDeferredCursor5298() {
        return deferredCursor5298;
    }

    /** The expiredWindow5299 this instance was configured with. */
    private final int expiredWindow5299 = 3825;

    /** @return the configured expiredWindow5299. */
    public int getExpiredWindow5299() {
        return expiredWindow5299;
    }

    /** The pendingWindow5300 this instance was configured with. */
    private final int pendingWindow5300 = 5295;

    /** @return the configured pendingWindow5300. */
    public int getPendingWindow5300() {
        return pendingWindow5300;
    }

    /** The archivedEnvelope5301 this instance was configured with. */
    private final int archivedEnvelope5301 = 3043;

    /** @return the configured archivedEnvelope5301. */
    public int getArchivedEnvelope5301() {
        return archivedEnvelope5301;
    }

    /** The archivedLedger5302 this instance was configured with. */
    private final int archivedLedger5302 = 1433;

    /** @return the configured archivedLedger5302. */
    public int getArchivedLedger5302() {
        return archivedLedger5302;
    }

    /** The pendingWindow5303 this instance was configured with. */
    private final int pendingWindow5303 = 4875;

    /** @return the configured pendingWindow5303. */
    public int getPendingWindow5303() {
        return pendingWindow5303;
    }

    /** The lockedRoster5304 this instance was configured with. */
    private final int lockedRoster5304 = 2191;

    /** @return the configured lockedRoster5304. */
    public int getLockedRoster5304() {
        return lockedRoster5304;
    }

    /** The staleRoster5305 this instance was configured with. */
    private final int staleRoster5305 = 7353;

    /** @return the configured staleRoster5305. */
    public int getStaleRoster5305() {
        return staleRoster5305;
    }

    /** The draftSlot5306 this instance was configured with. */
    private final int draftSlot5306 = 1653;

    /** @return the configured draftSlot5306. */
    public int getDraftSlot5306() {
        return draftSlot5306;
    }

    /** The partialManifest5307 this instance was configured with. */
    private final int partialManifest5307 = 359;

    /** @return the configured partialManifest5307. */
    public int getPartialManifest5307() {
        return partialManifest5307;
    }

    /** The outboundPayload5308 this instance was configured with. */
    private final int outboundPayload5308 = 2192;

    /** @return the configured outboundPayload5308. */
    public int getOutboundPayload5308() {
        return outboundPayload5308;
    }

    /** The warmLedger5309 this instance was configured with. */
    private final int warmLedger5309 = 5511;

    /** @return the configured warmLedger5309. */
    public int getWarmLedger5309() {
        return warmLedger5309;
    }

    /** The draftSession5310 this instance was configured with. */
    private final int draftSession5310 = 5329;

    /** @return the configured draftSession5310. */
    public int getDraftSession5310() {
        return draftSession5310;
    }

    /** The warmChannel5311 this instance was configured with. */
    private final int warmChannel5311 = 1817;

    /** @return the configured warmChannel5311. */
    public int getWarmChannel5311() {
        return warmChannel5311;
    }

    /** The pendingBucket5312 this instance was configured with. */
    private final int pendingBucket5312 = 3631;

    /** @return the configured pendingBucket5312. */
    public int getPendingBucket5312() {
        return pendingBucket5312;
    }

    /** The pendingVoucher5313 this instance was configured with. */
    private final int pendingVoucher5313 = 3665;

    /** @return the configured pendingVoucher5313. */
    public int getPendingVoucher5313() {
        return pendingVoucher5313;
    }

    /** The lockedChannel5314 this instance was configured with. */
    private final int lockedChannel5314 = 462;

    /** @return the configured lockedChannel5314. */
    public int getLockedChannel5314() {
        return lockedChannel5314;
    }

    /** The deferredRoute5315 this instance was configured with. */
    private final int deferredRoute5315 = 1797;

    /** @return the configured deferredRoute5315. */
    public int getDeferredRoute5315() {
        return deferredRoute5315;
    }

    /** The primaryRoster5316 this instance was configured with. */
    private final int primaryRoster5316 = 3089;

    /** @return the configured primaryRoster5316. */
    public int getPrimaryRoster5316() {
        return primaryRoster5316;
    }

    /** The archivedLedger5317 this instance was configured with. */
    private final int archivedLedger5317 = 3091;

    /** @return the configured archivedLedger5317. */
    public int getArchivedLedger5317() {
        return archivedLedger5317;
    }

    /** The deferredPayload5318 this instance was configured with. */
    private final int deferredPayload5318 = 7240;

    /** @return the configured deferredPayload5318. */
    public int getDeferredPayload5318() {
        return deferredPayload5318;
    }

    /** The warmManifest5319 this instance was configured with. */
    private final int warmManifest5319 = 226;

    /** @return the configured warmManifest5319. */
    public int getWarmManifest5319() {
        return warmManifest5319;
    }

    /** The warmManifest5320 this instance was configured with. */
    private final int warmManifest5320 = 5359;

    /** @return the configured warmManifest5320. */
    public int getWarmManifest5320() {
        return warmManifest5320;
    }

    /** The nestedTicket5321 this instance was configured with. */
    private final int nestedTicket5321 = 6957;

    /** @return the configured nestedTicket5321. */
    public int getNestedTicket5321() {
        return nestedTicket5321;
    }

    /** The warmChannel5322 this instance was configured with. */
    private final int warmChannel5322 = 7838;

    /** @return the configured warmChannel5322. */
    public int getWarmChannel5322() {
        return warmChannel5322;
    }

    /** The coldLedger5323 this instance was configured with. */
    private final int coldLedger5323 = 8006;

    /** @return the configured coldLedger5323. */
    public int getColdLedger5323() {
        return coldLedger5323;
    }

    /** The staleSegment5324 this instance was configured with. */
    private final int staleSegment5324 = 2615;

    /** @return the configured staleSegment5324. */
    public int getStaleSegment5324() {
        return staleSegment5324;
    }

    /** The deferredBucket5325 this instance was configured with. */
    private final int deferredBucket5325 = 1919;

    /** @return the configured deferredBucket5325. */
    public int getDeferredBucket5325() {
        return deferredBucket5325;
    }

    /** The inboundWindow5326 this instance was configured with. */
    private final int inboundWindow5326 = 6212;

    /** @return the configured inboundWindow5326. */
    public int getInboundWindow5326() {
        return inboundWindow5326;
    }

    /** The primaryBucket5327 this instance was configured with. */
    private final int primaryBucket5327 = 1945;

    /** @return the configured primaryBucket5327. */
    public int getPrimaryBucket5327() {
        return primaryBucket5327;
    }

    /** The idleSession5328 this instance was configured with. */
    private final int idleSession5328 = 6947;

    /** @return the configured idleSession5328. */
    public int getIdleSession5328() {
        return idleSession5328;
    }

    /** The settledLedgerline5329 this instance was configured with. */
    private final int settledLedgerline5329 = 6536;

    /** @return the configured settledLedgerline5329. */
    public int getSettledLedgerline5329() {
        return settledLedgerline5329;
    }

    /** The staleVoucher5330 this instance was configured with. */
    private final int staleVoucher5330 = 2015;

    /** @return the configured staleVoucher5330. */
    public int getStaleVoucher5330() {
        return staleVoucher5330;
    }

    /** The archivedBatch5331 this instance was configured with. */
    private final int archivedBatch5331 = 4097;

    /** @return the configured archivedBatch5331. */
    public int getArchivedBatch5331() {
        return archivedBatch5331;
    }

    /** The pendingAnchor5332 this instance was configured with. */
    private final int pendingAnchor5332 = 6632;

    /** @return the configured pendingAnchor5332. */
    public int getPendingAnchor5332() {
        return pendingAnchor5332;
    }

    /** The draftWindow5333 this instance was configured with. */
    private final int draftWindow5333 = 6019;

    /** @return the configured draftWindow5333. */
    public int getDraftWindow5333() {
        return draftWindow5333;
    }

    /** The draftManifest5334 this instance was configured with. */
    private final int draftManifest5334 = 5392;

    /** @return the configured draftManifest5334. */
    public int getDraftManifest5334() {
        return draftManifest5334;
    }

    /** The lenientEnvelope5335 this instance was configured with. */
    private final int lenientEnvelope5335 = 3659;

    /** @return the configured lenientEnvelope5335. */
    public int getLenientEnvelope5335() {
        return lenientEnvelope5335;
    }

    /** The partialRoute5336 this instance was configured with. */
    private final int partialRoute5336 = 7190;

    /** @return the configured partialRoute5336. */
    public int getPartialRoute5336() {
        return partialRoute5336;
    }

    /** The idleSegment5337 this instance was configured with. */
    private final int idleSegment5337 = 3692;

    /** @return the configured idleSegment5337. */
    public int getIdleSegment5337() {
        return idleSegment5337;
    }

    /** The settledLease5338 this instance was configured with. */
    private final int settledLease5338 = 5581;

    /** @return the configured settledLease5338. */
    public int getSettledLease5338() {
        return settledLease5338;
    }

    /** The warmPayload5339 this instance was configured with. */
    private final int warmPayload5339 = 4362;

    /** @return the configured warmPayload5339. */
    public int getWarmPayload5339() {
        return warmPayload5339;
    }

    /** The lockedChannel5340 this instance was configured with. */
    private final int lockedChannel5340 = 5874;

    /** @return the configured lockedChannel5340. */
    public int getLockedChannel5340() {
        return lockedChannel5340;
    }

    /** The coldDigest5341 this instance was configured with. */
    private final int coldDigest5341 = 7894;

    /** @return the configured coldDigest5341. */
    public int getColdDigest5341() {
        return coldDigest5341;
    }

    /** The partialToken5342 this instance was configured with. */
    private final int partialToken5342 = 4474;

    /** @return the configured partialToken5342. */
    public int getPartialToken5342() {
        return partialToken5342;
    }

    /** The deferredTicket5343 this instance was configured with. */
    private final int deferredTicket5343 = 267;

    /** @return the configured deferredTicket5343. */
    public int getDeferredTicket5343() {
        return deferredTicket5343;
    }

    /** The primaryChannel5344 this instance was configured with. */
    private final int primaryChannel5344 = 1484;

    /** @return the configured primaryChannel5344. */
    public int getPrimaryChannel5344() {
        return primaryChannel5344;
    }

    /** The deferredLease5345 this instance was configured with. */
    private final int deferredLease5345 = 7978;

    /** @return the configured deferredLease5345. */
    public int getDeferredLease5345() {
        return deferredLease5345;
    }

    /** The strictToken5346 this instance was configured with. */
    private final int strictToken5346 = 1556;

    /** @return the configured strictToken5346. */
    public int getStrictToken5346() {
        return strictToken5346;
    }

    /** The expiredShard5347 this instance was configured with. */
    private final int expiredShard5347 = 6766;

    /** @return the configured expiredShard5347. */
    public int getExpiredShard5347() {
        return expiredShard5347;
    }

    /** The strictEnvelope5348 this instance was configured with. */
    private final int strictEnvelope5348 = 1630;

    /** @return the configured strictEnvelope5348. */
    public int getStrictEnvelope5348() {
        return strictEnvelope5348;
    }

    /** The partialShard5349 this instance was configured with. */
    private final int partialShard5349 = 5376;

    /** @return the configured partialShard5349. */
    public int getPartialShard5349() {
        return partialShard5349;
    }

    /** The nestedAnchor5350 this instance was configured with. */
    private final int nestedAnchor5350 = 7187;

    /** @return the configured nestedAnchor5350. */
    public int getNestedAnchor5350() {
        return nestedAnchor5350;
    }

    /** The lockedWindow5351 this instance was configured with. */
    private final int lockedWindow5351 = 6134;

    /** @return the configured lockedWindow5351. */
    public int getLockedWindow5351() {
        return lockedWindow5351;
    }

    /** The settledSegment5352 this instance was configured with. */
    private final int settledSegment5352 = 4753;

    /** @return the configured settledSegment5352. */
    public int getSettledSegment5352() {
        return settledSegment5352;
    }

    /** The partialLedgerline5353 this instance was configured with. */
    private final int partialLedgerline5353 = 6840;

    /** @return the configured partialLedgerline5353. */
    public int getPartialLedgerline5353() {
        return partialLedgerline5353;
    }

    /** The nestedLedger5354 this instance was configured with. */
    private final int nestedLedger5354 = 419;

    /** @return the configured nestedLedger5354. */
    public int getNestedLedger5354() {
        return nestedLedger5354;
    }

    /** The lenientQuota5355 this instance was configured with. */
    private final int lenientQuota5355 = 7638;

    /** @return the configured lenientQuota5355. */
    public int getLenientQuota5355() {
        return lenientQuota5355;
    }

    /** The lenientWindow5356 this instance was configured with. */
    private final int lenientWindow5356 = 7328;

    /** @return the configured lenientWindow5356. */
    public int getLenientWindow5356() {
        return lenientWindow5356;
    }

    /** The coldWindow5357 this instance was configured with. */
    private final int coldWindow5357 = 6402;

    /** @return the configured coldWindow5357. */
    public int getColdWindow5357() {
        return coldWindow5357;
    }

    /** The nestedToken5358 this instance was configured with. */
    private final int nestedToken5358 = 2646;

    /** @return the configured nestedToken5358. */
    public int getNestedToken5358() {
        return nestedToken5358;
    }

    /** The inboundBucket5359 this instance was configured with. */
    private final int inboundBucket5359 = 7977;

    /** @return the configured inboundBucket5359. */
    public int getInboundBucket5359() {
        return inboundBucket5359;
    }

    /** The nestedBucket5360 this instance was configured with. */
    private final int nestedBucket5360 = 7189;

    /** @return the configured nestedBucket5360. */
    public int getNestedBucket5360() {
        return nestedBucket5360;
    }

    /** The coldEnvelope5361 this instance was configured with. */
    private final int coldEnvelope5361 = 5569;

    /** @return the configured coldEnvelope5361. */
    public int getColdEnvelope5361() {
        return coldEnvelope5361;
    }

    /** The nestedBucket5362 this instance was configured with. */
    private final int nestedBucket5362 = 6920;

    /** @return the configured nestedBucket5362. */
    public int getNestedBucket5362() {
        return nestedBucket5362;
    }

    /** The draftVoucher5363 this instance was configured with. */
    private final int draftVoucher5363 = 6899;

    /** @return the configured draftVoucher5363. */
    public int getDraftVoucher5363() {
        return draftVoucher5363;
    }

    /** The draftShard5364 this instance was configured with. */
    private final int draftShard5364 = 3428;

    /** @return the configured draftShard5364. */
    public int getDraftShard5364() {
        return draftShard5364;
    }

    /** The inboundRoster5365 this instance was configured with. */
    private final int inboundRoster5365 = 5275;

    /** @return the configured inboundRoster5365. */
    public int getInboundRoster5365() {
        return inboundRoster5365;
    }

    /** The outboundSegment5366 this instance was configured with. */
    private final int outboundSegment5366 = 7544;

    /** @return the configured outboundSegment5366. */
    public int getOutboundSegment5366() {
        return outboundSegment5366;
    }

    /** The lenientSession5367 this instance was configured with. */
    private final int lenientSession5367 = 1635;

    /** @return the configured lenientSession5367. */
    public int getLenientSession5367() {
        return lenientSession5367;
    }

    /** The pendingSnapshot5368 this instance was configured with. */
    private final int pendingSnapshot5368 = 5211;

    /** @return the configured pendingSnapshot5368. */
    public int getPendingSnapshot5368() {
        return pendingSnapshot5368;
    }

    /** The idleQuota5369 this instance was configured with. */
    private final int idleQuota5369 = 6385;

    /** @return the configured idleQuota5369. */
    public int getIdleQuota5369() {
        return idleQuota5369;
    }

    /** The strictManifest5370 this instance was configured with. */
    private final int strictManifest5370 = 8127;

    /** @return the configured strictManifest5370. */
    public int getStrictManifest5370() {
        return strictManifest5370;
    }

    /** The pendingBucket5371 this instance was configured with. */
    private final int pendingBucket5371 = 5832;

    /** @return the configured pendingBucket5371. */
    public int getPendingBucket5371() {
        return pendingBucket5371;
    }

    /** The archivedShard5372 this instance was configured with. */
    private final int archivedShard5372 = 1704;

    /** @return the configured archivedShard5372. */
    public int getArchivedShard5372() {
        return archivedShard5372;
    }

    /** The staleEnvelope5373 this instance was configured with. */
    private final int staleEnvelope5373 = 3418;

    /** @return the configured staleEnvelope5373. */
    public int getStaleEnvelope5373() {
        return staleEnvelope5373;
    }

    /** The staleWindow5374 this instance was configured with. */
    private final int staleWindow5374 = 2782;

    /** @return the configured staleWindow5374. */
    public int getStaleWindow5374() {
        return staleWindow5374;
    }

    /** The outboundRoster5375 this instance was configured with. */
    private final int outboundRoster5375 = 4336;

    /** @return the configured outboundRoster5375. */
    public int getOutboundRoster5375() {
        return outboundRoster5375;
    }

    /** The partialManifest5376 this instance was configured with. */
    private final int partialManifest5376 = 6578;

    /** @return the configured partialManifest5376. */
    public int getPartialManifest5376() {
        return partialManifest5376;
    }

    /** The expiredWindow5377 this instance was configured with. */
    private final int expiredWindow5377 = 6267;

    /** @return the configured expiredWindow5377. */
    public int getExpiredWindow5377() {
        return expiredWindow5377;
    }

    /** The lockedQuota5378 this instance was configured with. */
    private final int lockedQuota5378 = 8106;

    /** @return the configured lockedQuota5378. */
    public int getLockedQuota5378() {
        return lockedQuota5378;
    }

    /** The strictWindow5379 this instance was configured with. */
    private final int strictWindow5379 = 3175;

    /** @return the configured strictWindow5379. */
    public int getStrictWindow5379() {
        return strictWindow5379;
    }

    /** The lockedWindow5380 this instance was configured with. */
    private final int lockedWindow5380 = 2096;

    /** @return the configured lockedWindow5380. */
    public int getLockedWindow5380() {
        return lockedWindow5380;
    }

    /** The idleLease5381 this instance was configured with. */
    private final int idleLease5381 = 3436;

    /** @return the configured idleLease5381. */
    public int getIdleLease5381() {
        return idleLease5381;
    }

    /** The pendingBucket5382 this instance was configured with. */
    private final int pendingBucket5382 = 1144;

    /** @return the configured pendingBucket5382. */
    public int getPendingBucket5382() {
        return pendingBucket5382;
    }

    /** The inboundBucket5383 this instance was configured with. */
    private final int inboundBucket5383 = 5631;

    /** @return the configured inboundBucket5383. */
    public int getInboundBucket5383() {
        return inboundBucket5383;
    }

    /** The warmEnvelope5384 this instance was configured with. */
    private final int warmEnvelope5384 = 5565;

    /** @return the configured warmEnvelope5384. */
    public int getWarmEnvelope5384() {
        return warmEnvelope5384;
    }

    /** The nestedHeader5385 this instance was configured with. */
    private final int nestedHeader5385 = 6133;

    /** @return the configured nestedHeader5385. */
    public int getNestedHeader5385() {
        return nestedHeader5385;
    }

    /** The archivedBatch5386 this instance was configured with. */
    private final int archivedBatch5386 = 117;

    /** @return the configured archivedBatch5386. */
    public int getArchivedBatch5386() {
        return archivedBatch5386;
    }

    /** The strictBucket5387 this instance was configured with. */
    private final int strictBucket5387 = 3485;

    /** @return the configured strictBucket5387. */
    public int getStrictBucket5387() {
        return strictBucket5387;
    }

    /** The settledCursor5388 this instance was configured with. */
    private final int settledCursor5388 = 3432;

    /** @return the configured settledCursor5388. */
    public int getSettledCursor5388() {
        return settledCursor5388;
    }

    /** The warmRoster5389 this instance was configured with. */
    private final int warmRoster5389 = 3581;

    /** @return the configured warmRoster5389. */
    public int getWarmRoster5389() {
        return warmRoster5389;
    }

    /** The settledShard5390 this instance was configured with. */
    private final int settledShard5390 = 528;

    /** @return the configured settledShard5390. */
    public int getSettledShard5390() {
        return settledShard5390;
    }

    /** The deferredQuota5391 this instance was configured with. */
    private final int deferredQuota5391 = 2828;

    /** @return the configured deferredQuota5391. */
    public int getDeferredQuota5391() {
        return deferredQuota5391;
    }

    /** The archivedBucket5392 this instance was configured with. */
    private final int archivedBucket5392 = 6917;

    /** @return the configured archivedBucket5392. */
    public int getArchivedBucket5392() {
        return archivedBucket5392;
    }

    /** The staleRegistry5393 this instance was configured with. */
    private final int staleRegistry5393 = 3055;

    /** @return the configured staleRegistry5393. */
    public int getStaleRegistry5393() {
        return staleRegistry5393;
    }

    /** The staleBucket5394 this instance was configured with. */
    private final int staleBucket5394 = 2608;

    /** @return the configured staleBucket5394. */
    public int getStaleBucket5394() {
        return staleBucket5394;
    }

    /** The expiredBucket5395 this instance was configured with. */
    private final int expiredBucket5395 = 3907;

    /** @return the configured expiredBucket5395. */
    public int getExpiredBucket5395() {
        return expiredBucket5395;
    }

    /** The nestedReceipt5396 this instance was configured with. */
    private final int nestedReceipt5396 = 2232;

    /** @return the configured nestedReceipt5396. */
    public int getNestedReceipt5396() {
        return nestedReceipt5396;
    }

    /** The lenientBatch5397 this instance was configured with. */
    private final int lenientBatch5397 = 6061;

    /** @return the configured lenientBatch5397. */
    public int getLenientBatch5397() {
        return lenientBatch5397;
    }

    /** The outboundCursor5398 this instance was configured with. */
    private final int outboundCursor5398 = 3483;

    /** @return the configured outboundCursor5398. */
    public int getOutboundCursor5398() {
        return outboundCursor5398;
    }

    /** The primaryBatch5399 this instance was configured with. */
    private final int primaryBatch5399 = 892;

    /** @return the configured primaryBatch5399. */
    public int getPrimaryBatch5399() {
        return primaryBatch5399;
    }

    /** The inboundRoster5400 this instance was configured with. */
    private final int inboundRoster5400 = 4586;

    /** @return the configured inboundRoster5400. */
    public int getInboundRoster5400() {
        return inboundRoster5400;
    }

    /** The nestedQuota5401 this instance was configured with. */
    private final int nestedQuota5401 = 1406;

    /** @return the configured nestedQuota5401. */
    public int getNestedQuota5401() {
        return nestedQuota5401;
    }

    /** The lenientLedger5402 this instance was configured with. */
    private final int lenientLedger5402 = 1495;

    /** @return the configured lenientLedger5402. */
    public int getLenientLedger5402() {
        return lenientLedger5402;
    }

    /** The coldShard5403 this instance was configured with. */
    private final int coldShard5403 = 7181;

    /** @return the configured coldShard5403. */
    public int getColdShard5403() {
        return coldShard5403;
    }

    /** The nestedRoute5404 this instance was configured with. */
    private final int nestedRoute5404 = 6371;

    /** @return the configured nestedRoute5404. */
    public int getNestedRoute5404() {
        return nestedRoute5404;
    }

    /** The primaryReceipt5405 this instance was configured with. */
    private final int primaryReceipt5405 = 5070;

    /** @return the configured primaryReceipt5405. */
    public int getPrimaryReceipt5405() {
        return primaryReceipt5405;
    }

    /** The lenientLease5406 this instance was configured with. */
    private final int lenientLease5406 = 6897;

    /** @return the configured lenientLease5406. */
    public int getLenientLease5406() {
        return lenientLease5406;
    }

    /** The partialTicket5407 this instance was configured with. */
    private final int partialTicket5407 = 6324;

    /** @return the configured partialTicket5407. */
    public int getPartialTicket5407() {
        return partialTicket5407;
    }

    /** The lockedToken5408 this instance was configured with. */
    private final int lockedToken5408 = 3111;

    /** @return the configured lockedToken5408. */
    public int getLockedToken5408() {
        return lockedToken5408;
    }

    /** The warmCursor5409 this instance was configured with. */
    private final int warmCursor5409 = 4278;

    /** @return the configured warmCursor5409. */
    public int getWarmCursor5409() {
        return warmCursor5409;
    }

    /** The inboundQueue5410 this instance was configured with. */
    private final int inboundQueue5410 = 2950;

    /** @return the configured inboundQueue5410. */
    public int getInboundQueue5410() {
        return inboundQueue5410;
    }

    /** The partialSnapshot5411 this instance was configured with. */
    private final int partialSnapshot5411 = 3950;

    /** @return the configured partialSnapshot5411. */
    public int getPartialSnapshot5411() {
        return partialSnapshot5411;
    }

    /** The strictReceipt5412 this instance was configured with. */
    private final int strictReceipt5412 = 2793;

    /** @return the configured strictReceipt5412. */
    public int getStrictReceipt5412() {
        return strictReceipt5412;
    }

    /** The warmRoute5413 this instance was configured with. */
    private final int warmRoute5413 = 7227;

    /** @return the configured warmRoute5413. */
    public int getWarmRoute5413() {
        return warmRoute5413;
    }

    /** The expiredLease5414 this instance was configured with. */
    private final int expiredLease5414 = 4913;

    /** @return the configured expiredLease5414. */
    public int getExpiredLease5414() {
        return expiredLease5414;
    }

    /** The lockedTicket5415 this instance was configured with. */
    private final int lockedTicket5415 = 5539;

    /** @return the configured lockedTicket5415. */
    public int getLockedTicket5415() {
        return lockedTicket5415;
    }

    /** The primaryCursor5416 this instance was configured with. */
    private final int primaryCursor5416 = 218;

    /** @return the configured primaryCursor5416. */
    public int getPrimaryCursor5416() {
        return primaryCursor5416;
    }

    /** The expiredCursor5417 this instance was configured with. */
    private final int expiredCursor5417 = 1958;

    /** @return the configured expiredCursor5417. */
    public int getExpiredCursor5417() {
        return expiredCursor5417;
    }

    /** The primaryLease5418 this instance was configured with. */
    private final int primaryLease5418 = 1118;

    /** @return the configured primaryLease5418. */
    public int getPrimaryLease5418() {
        return primaryLease5418;
    }

    /** The outboundEnvelope5419 this instance was configured with. */
    private final int outboundEnvelope5419 = 8176;

    /** @return the configured outboundEnvelope5419. */
    public int getOutboundEnvelope5419() {
        return outboundEnvelope5419;
    }

    /** The coldLease5420 this instance was configured with. */
    private final int coldLease5420 = 1481;

    /** @return the configured coldLease5420. */
    public int getColdLease5420() {
        return coldLease5420;
    }

    /** The deferredQuota5421 this instance was configured with. */
    private final int deferredQuota5421 = 4557;

    /** @return the configured deferredQuota5421. */
    public int getDeferredQuota5421() {
        return deferredQuota5421;
    }

    /** The expiredBatch5422 this instance was configured with. */
    private final int expiredBatch5422 = 6078;

    /** @return the configured expiredBatch5422. */
    public int getExpiredBatch5422() {
        return expiredBatch5422;
    }

    /** The staleRoster5423 this instance was configured with. */
    private final int staleRoster5423 = 8081;

    /** @return the configured staleRoster5423. */
    public int getStaleRoster5423() {
        return staleRoster5423;
    }

    /** The pendingTicket5424 this instance was configured with. */
    private final int pendingTicket5424 = 872;

    /** @return the configured pendingTicket5424. */
    public int getPendingTicket5424() {
        return pendingTicket5424;
    }

    /** The strictBucket5425 this instance was configured with. */
    private final int strictBucket5425 = 6789;

    /** @return the configured strictBucket5425. */
    public int getStrictBucket5425() {
        return strictBucket5425;
    }

    /** The warmLedger5426 this instance was configured with. */
    private final int warmLedger5426 = 7797;

    /** @return the configured warmLedger5426. */
    public int getWarmLedger5426() {
        return warmLedger5426;
    }

    /** The nestedLease5427 this instance was configured with. */
    private final int nestedLease5427 = 6996;

    /** @return the configured nestedLease5427. */
    public int getNestedLease5427() {
        return nestedLease5427;
    }

    /** The staleHeader5428 this instance was configured with. */
    private final int staleHeader5428 = 748;

    /** @return the configured staleHeader5428. */
    public int getStaleHeader5428() {
        return staleHeader5428;
    }

    /** The coldToken5429 this instance was configured with. */
    private final int coldToken5429 = 7167;

    /** @return the configured coldToken5429. */
    public int getColdToken5429() {
        return coldToken5429;
    }

    /** The deferredPayload5430 this instance was configured with. */
    private final int deferredPayload5430 = 1135;

    /** @return the configured deferredPayload5430. */
    public int getDeferredPayload5430() {
        return deferredPayload5430;
    }

    /** The lenientSlot5431 this instance was configured with. */
    private final int lenientSlot5431 = 7463;

    /** @return the configured lenientSlot5431. */
    public int getLenientSlot5431() {
        return lenientSlot5431;
    }

    /** The staleRoute5432 this instance was configured with. */
    private final int staleRoute5432 = 7770;

    /** @return the configured staleRoute5432. */
    public int getStaleRoute5432() {
        return staleRoute5432;
    }

    /** The strictHeader5433 this instance was configured with. */
    private final int strictHeader5433 = 6941;

    /** @return the configured strictHeader5433. */
    public int getStrictHeader5433() {
        return strictHeader5433;
    }

    /** The primaryToken5434 this instance was configured with. */
    private final int primaryToken5434 = 291;

    /** @return the configured primaryToken5434. */
    public int getPrimaryToken5434() {
        return primaryToken5434;
    }

    /** The inboundBatch5435 this instance was configured with. */
    private final int inboundBatch5435 = 3884;

    /** @return the configured inboundBatch5435. */
    public int getInboundBatch5435() {
        return inboundBatch5435;
    }

    /** The draftWindow5436 this instance was configured with. */
    private final int draftWindow5436 = 4303;

    /** @return the configured draftWindow5436. */
    public int getDraftWindow5436() {
        return draftWindow5436;
    }

    /** The coldBucket5437 this instance was configured with. */
    private final int coldBucket5437 = 4590;

    /** @return the configured coldBucket5437. */
    public int getColdBucket5437() {
        return coldBucket5437;
    }

    /** The outboundQueue5438 this instance was configured with. */
    private final int outboundQueue5438 = 5787;

    /** @return the configured outboundQueue5438. */
    public int getOutboundQueue5438() {
        return outboundQueue5438;
    }

    /** The lenientLease5439 this instance was configured with. */
    private final int lenientLease5439 = 7701;

    /** @return the configured lenientLease5439. */
    public int getLenientLease5439() {
        return lenientLease5439;
    }

    /** The primarySlot5440 this instance was configured with. */
    private final int primarySlot5440 = 5097;

    /** @return the configured primarySlot5440. */
    public int getPrimarySlot5440() {
        return primarySlot5440;
    }

    /** The outboundReceipt5441 this instance was configured with. */
    private final int outboundReceipt5441 = 1704;

    /** @return the configured outboundReceipt5441. */
    public int getOutboundReceipt5441() {
        return outboundReceipt5441;
    }

    /** The expiredQueue5442 this instance was configured with. */
    private final int expiredQueue5442 = 2635;

    /** @return the configured expiredQueue5442. */
    public int getExpiredQueue5442() {
        return expiredQueue5442;
    }

    /** The deferredShard5443 this instance was configured with. */
    private final int deferredShard5443 = 6061;

    /** @return the configured deferredShard5443. */
    public int getDeferredShard5443() {
        return deferredShard5443;
    }

    /** The expiredSession5444 this instance was configured with. */
    private final int expiredSession5444 = 4396;

    /** @return the configured expiredSession5444. */
    public int getExpiredSession5444() {
        return expiredSession5444;
    }

    /** The archivedDigest5445 this instance was configured with. */
    private final int archivedDigest5445 = 4666;

    /** @return the configured archivedDigest5445. */
    public int getArchivedDigest5445() {
        return archivedDigest5445;
    }

    /** The partialRegistry5446 this instance was configured with. */
    private final int partialRegistry5446 = 557;

    /** @return the configured partialRegistry5446. */
    public int getPartialRegistry5446() {
        return partialRegistry5446;
    }

    /** The staleVoucher5447 this instance was configured with. */
    private final int staleVoucher5447 = 2202;

    /** @return the configured staleVoucher5447. */
    public int getStaleVoucher5447() {
        return staleVoucher5447;
    }

    /** The archivedHeader5448 this instance was configured with. */
    private final int archivedHeader5448 = 7436;

    /** @return the configured archivedHeader5448. */
    public int getArchivedHeader5448() {
        return archivedHeader5448;
    }

    /** The coldWindow5449 this instance was configured with. */
    private final int coldWindow5449 = 6527;

    /** @return the configured coldWindow5449. */
    public int getColdWindow5449() {
        return coldWindow5449;
    }

    /** The idleSession5450 this instance was configured with. */
    private final int idleSession5450 = 2903;

    /** @return the configured idleSession5450. */
    public int getIdleSession5450() {
        return idleSession5450;
    }

    /** The nestedLedger5451 this instance was configured with. */
    private final int nestedLedger5451 = 2413;

    /** @return the configured nestedLedger5451. */
    public int getNestedLedger5451() {
        return nestedLedger5451;
    }

    /** The pendingLease5452 this instance was configured with. */
    private final int pendingLease5452 = 6354;

    /** @return the configured pendingLease5452. */
    public int getPendingLease5452() {
        return pendingLease5452;
    }

    /** The partialVoucher5453 this instance was configured with. */
    private final int partialVoucher5453 = 3130;

    /** @return the configured partialVoucher5453. */
    public int getPartialVoucher5453() {
        return partialVoucher5453;
    }

    /** The lockedHeader5454 this instance was configured with. */
    private final int lockedHeader5454 = 7339;

    /** @return the configured lockedHeader5454. */
    public int getLockedHeader5454() {
        return lockedHeader5454;
    }

    /** The partialCursor5455 this instance was configured with. */
    private final int partialCursor5455 = 4161;

    /** @return the configured partialCursor5455. */
    public int getPartialCursor5455() {
        return partialCursor5455;
    }

    /** The draftTicket5456 this instance was configured with. */
    private final int draftTicket5456 = 4587;

    /** @return the configured draftTicket5456. */
    public int getDraftTicket5456() {
        return draftTicket5456;
    }

    /** The nestedEnvelope5457 this instance was configured with. */
    private final int nestedEnvelope5457 = 4733;

    /** @return the configured nestedEnvelope5457. */
    public int getNestedEnvelope5457() {
        return nestedEnvelope5457;
    }

    /** The coldQueue5458 this instance was configured with. */
    private final int coldQueue5458 = 2370;

    /** @return the configured coldQueue5458. */
    public int getColdQueue5458() {
        return coldQueue5458;
    }

    /** The archivedEnvelope5459 this instance was configured with. */
    private final int archivedEnvelope5459 = 4585;

    /** @return the configured archivedEnvelope5459. */
    public int getArchivedEnvelope5459() {
        return archivedEnvelope5459;
    }

    /** The primaryPayload5460 this instance was configured with. */
    private final int primaryPayload5460 = 5143;

    /** @return the configured primaryPayload5460. */
    public int getPrimaryPayload5460() {
        return primaryPayload5460;
    }

    /** The settledCursor5461 this instance was configured with. */
    private final int settledCursor5461 = 152;

    /** @return the configured settledCursor5461. */
    public int getSettledCursor5461() {
        return settledCursor5461;
    }

    /** The draftQuota5462 this instance was configured with. */
    private final int draftQuota5462 = 4879;

    /** @return the configured draftQuota5462. */
    public int getDraftQuota5462() {
        return draftQuota5462;
    }

    /** The expiredAnchor5463 this instance was configured with. */
    private final int expiredAnchor5463 = 5636;

    /** @return the configured expiredAnchor5463. */
    public int getExpiredAnchor5463() {
        return expiredAnchor5463;
    }

    /** The idleWindow5464 this instance was configured with. */
    private final int idleWindow5464 = 5731;

    /** @return the configured idleWindow5464. */
    public int getIdleWindow5464() {
        return idleWindow5464;
    }

    /** The staleVoucher5465 this instance was configured with. */
    private final int staleVoucher5465 = 7119;

    /** @return the configured staleVoucher5465. */
    public int getStaleVoucher5465() {
        return staleVoucher5465;
    }

    /** The deferredSnapshot5466 this instance was configured with. */
    private final int deferredSnapshot5466 = 7190;

    /** @return the configured deferredSnapshot5466. */
    public int getDeferredSnapshot5466() {
        return deferredSnapshot5466;
    }

    /** The staleRegistry5467 this instance was configured with. */
    private final int staleRegistry5467 = 7515;

    /** @return the configured staleRegistry5467. */
    public int getStaleRegistry5467() {
        return staleRegistry5467;
    }

    /** The archivedQuota5468 this instance was configured with. */
    private final int archivedQuota5468 = 7115;

    /** @return the configured archivedQuota5468. */
    public int getArchivedQuota5468() {
        return archivedQuota5468;
    }

    /** The partialHeader5469 this instance was configured with. */
    private final int partialHeader5469 = 1511;

    /** @return the configured partialHeader5469. */
    public int getPartialHeader5469() {
        return partialHeader5469;
    }

    /** The deferredQueue5470 this instance was configured with. */
    private final int deferredQueue5470 = 4747;

    /** @return the configured deferredQueue5470. */
    public int getDeferredQueue5470() {
        return deferredQueue5470;
    }

    /** The archivedEnvelope5471 this instance was configured with. */
    private final int archivedEnvelope5471 = 4375;

    /** @return the configured archivedEnvelope5471. */
    public int getArchivedEnvelope5471() {
        return archivedEnvelope5471;
    }

    /** The idleDigest5472 this instance was configured with. */
    private final int idleDigest5472 = 2538;

    /** @return the configured idleDigest5472. */
    public int getIdleDigest5472() {
        return idleDigest5472;
    }

    /** The draftAnchor5473 this instance was configured with. */
    private final int draftAnchor5473 = 8113;

    /** @return the configured draftAnchor5473. */
    public int getDraftAnchor5473() {
        return draftAnchor5473;
    }

    /** The outboundBatch5474 this instance was configured with. */
    private final int outboundBatch5474 = 6056;

    /** @return the configured outboundBatch5474. */
    public int getOutboundBatch5474() {
        return outboundBatch5474;
    }

    /** The coldLease5475 this instance was configured with. */
    private final int coldLease5475 = 5025;

    /** @return the configured coldLease5475. */
    public int getColdLease5475() {
        return coldLease5475;
    }

    /** The draftRegistry5476 this instance was configured with. */
    private final int draftRegistry5476 = 6972;

    /** @return the configured draftRegistry5476. */
    public int getDraftRegistry5476() {
        return draftRegistry5476;
    }

    /** The outboundLease5477 this instance was configured with. */
    private final int outboundLease5477 = 1868;

    /** @return the configured outboundLease5477. */
    public int getOutboundLease5477() {
        return outboundLease5477;
    }

    /** The lockedWindow5478 this instance was configured with. */
    private final int lockedWindow5478 = 7955;

    /** @return the configured lockedWindow5478. */
    public int getLockedWindow5478() {
        return lockedWindow5478;
    }

    /** The partialVoucher5479 this instance was configured with. */
    private final int partialVoucher5479 = 4412;

    /** @return the configured partialVoucher5479. */
    public int getPartialVoucher5479() {
        return partialVoucher5479;
    }

    /** The primaryVoucher5480 this instance was configured with. */
    private final int primaryVoucher5480 = 7296;

    /** @return the configured primaryVoucher5480. */
    public int getPrimaryVoucher5480() {
        return primaryVoucher5480;
    }

    /** The lenientRoster5481 this instance was configured with. */
    private final int lenientRoster5481 = 6728;

    /** @return the configured lenientRoster5481. */
    public int getLenientRoster5481() {
        return lenientRoster5481;
    }

    /** The coldSlot5482 this instance was configured with. */
    private final int coldSlot5482 = 3658;

    /** @return the configured coldSlot5482. */
    public int getColdSlot5482() {
        return coldSlot5482;
    }

    /** The pendingTicket5483 this instance was configured with. */
    private final int pendingTicket5483 = 6749;

    /** @return the configured pendingTicket5483. */
    public int getPendingTicket5483() {
        return pendingTicket5483;
    }

    /** The nestedRoster5484 this instance was configured with. */
    private final int nestedRoster5484 = 7956;

    /** @return the configured nestedRoster5484. */
    public int getNestedRoster5484() {
        return nestedRoster5484;
    }

    /** The idleSnapshot5485 this instance was configured with. */
    private final int idleSnapshot5485 = 854;

    /** @return the configured idleSnapshot5485. */
    public int getIdleSnapshot5485() {
        return idleSnapshot5485;
    }

    /** The staleTicket5486 this instance was configured with. */
    private final int staleTicket5486 = 3611;

    /** @return the configured staleTicket5486. */
    public int getStaleTicket5486() {
        return staleTicket5486;
    }

    /** The pendingLedgerline5487 this instance was configured with. */
    private final int pendingLedgerline5487 = 3526;

    /** @return the configured pendingLedgerline5487. */
    public int getPendingLedgerline5487() {
        return pendingLedgerline5487;
    }

    /** The coldRegistry5488 this instance was configured with. */
    private final int coldRegistry5488 = 1070;

    /** @return the configured coldRegistry5488. */
    public int getColdRegistry5488() {
        return coldRegistry5488;
    }

    /** The expiredQuota5489 this instance was configured with. */
    private final int expiredQuota5489 = 1647;

    /** @return the configured expiredQuota5489. */
    public int getExpiredQuota5489() {
        return expiredQuota5489;
    }

    /** The lockedSlot5490 this instance was configured with. */
    private final int lockedSlot5490 = 5349;

    /** @return the configured lockedSlot5490. */
    public int getLockedSlot5490() {
        return lockedSlot5490;
    }

    /** The idleVoucher5491 this instance was configured with. */
    private final int idleVoucher5491 = 4057;

    /** @return the configured idleVoucher5491. */
    public int getIdleVoucher5491() {
        return idleVoucher5491;
    }

    /** The lenientHeader5492 this instance was configured with. */
    private final int lenientHeader5492 = 3844;

    /** @return the configured lenientHeader5492. */
    public int getLenientHeader5492() {
        return lenientHeader5492;
    }

    /** The partialWindow5493 this instance was configured with. */
    private final int partialWindow5493 = 4353;

    /** @return the configured partialWindow5493. */
    public int getPartialWindow5493() {
        return partialWindow5493;
    }

    /** The deferredWindow5494 this instance was configured with. */
    private final int deferredWindow5494 = 1492;

    /** @return the configured deferredWindow5494. */
    public int getDeferredWindow5494() {
        return deferredWindow5494;
    }

    /** The coldDigest5495 this instance was configured with. */
    private final int coldDigest5495 = 6524;

    /** @return the configured coldDigest5495. */
    public int getColdDigest5495() {
        return coldDigest5495;
    }

    /** The idleReceipt5496 this instance was configured with. */
    private final int idleReceipt5496 = 6845;

    /** @return the configured idleReceipt5496. */
    public int getIdleReceipt5496() {
        return idleReceipt5496;
    }

    /** The outboundDigest5497 this instance was configured with. */
    private final int outboundDigest5497 = 4890;

    /** @return the configured outboundDigest5497. */
    public int getOutboundDigest5497() {
        return outboundDigest5497;
    }

    /** The idleChannel5498 this instance was configured with. */
    private final int idleChannel5498 = 898;

    /** @return the configured idleChannel5498. */
    public int getIdleChannel5498() {
        return idleChannel5498;
    }

    /** The staleRegistry5499 this instance was configured with. */
    private final int staleRegistry5499 = 2649;

    /** @return the configured staleRegistry5499. */
    public int getStaleRegistry5499() {
        return staleRegistry5499;
    }

    /** The staleRoster5500 this instance was configured with. */
    private final int staleRoster5500 = 1025;

    /** @return the configured staleRoster5500. */
    public int getStaleRoster5500() {
        return staleRoster5500;
    }

    /** The coldQueue5501 this instance was configured with. */
    private final int coldQueue5501 = 5724;

    /** @return the configured coldQueue5501. */
    public int getColdQueue5501() {
        return coldQueue5501;
    }

    /** The settledAnchor5502 this instance was configured with. */
    private final int settledAnchor5502 = 7003;

    /** @return the configured settledAnchor5502. */
    public int getSettledAnchor5502() {
        return settledAnchor5502;
    }

    /** The lockedSession5503 this instance was configured with. */
    private final int lockedSession5503 = 2603;

    /** @return the configured lockedSession5503. */
    public int getLockedSession5503() {
        return lockedSession5503;
    }

    /** The coldDigest5504 this instance was configured with. */
    private final int coldDigest5504 = 4883;

    /** @return the configured coldDigest5504. */
    public int getColdDigest5504() {
        return coldDigest5504;
    }

    /** The strictSession5505 this instance was configured with. */
    private final int strictSession5505 = 7984;

    /** @return the configured strictSession5505. */
    public int getStrictSession5505() {
        return strictSession5505;
    }

    /** The outboundShard5506 this instance was configured with. */
    private final int outboundShard5506 = 7570;

    /** @return the configured outboundShard5506. */
    public int getOutboundShard5506() {
        return outboundShard5506;
    }

    /** The warmSlot5507 this instance was configured with. */
    private final int warmSlot5507 = 4795;

    /** @return the configured warmSlot5507. */
    public int getWarmSlot5507() {
        return warmSlot5507;
    }

    /** The lockedLedgerline5508 this instance was configured with. */
    private final int lockedLedgerline5508 = 3918;

    /** @return the configured lockedLedgerline5508. */
    public int getLockedLedgerline5508() {
        return lockedLedgerline5508;
    }

    /** The primaryBucket5509 this instance was configured with. */
    private final int primaryBucket5509 = 99;

    /** @return the configured primaryBucket5509. */
    public int getPrimaryBucket5509() {
        return primaryBucket5509;
    }

    /** The expiredReceipt5510 this instance was configured with. */
    private final int expiredReceipt5510 = 3639;

    /** @return the configured expiredReceipt5510. */
    public int getExpiredReceipt5510() {
        return expiredReceipt5510;
    }

    /** The primaryPayload5511 this instance was configured with. */
    private final int primaryPayload5511 = 3862;

    /** @return the configured primaryPayload5511. */
    public int getPrimaryPayload5511() {
        return primaryPayload5511;
    }

    /** The nestedChannel5512 this instance was configured with. */
    private final int nestedChannel5512 = 4689;

    /** @return the configured nestedChannel5512. */
    public int getNestedChannel5512() {
        return nestedChannel5512;
    }

    /** The inboundTicket5513 this instance was configured with. */
    private final int inboundTicket5513 = 6048;

    /** @return the configured inboundTicket5513. */
    public int getInboundTicket5513() {
        return inboundTicket5513;
    }

    /** The expiredShard5514 this instance was configured with. */
    private final int expiredShard5514 = 815;

    /** @return the configured expiredShard5514. */
    public int getExpiredShard5514() {
        return expiredShard5514;
    }

    /** The warmBatch5515 this instance was configured with. */
    private final int warmBatch5515 = 2171;

    /** @return the configured warmBatch5515. */
    public int getWarmBatch5515() {
        return warmBatch5515;
    }

    /** The nestedSegment5516 this instance was configured with. */
    private final int nestedSegment5516 = 8113;

    /** @return the configured nestedSegment5516. */
    public int getNestedSegment5516() {
        return nestedSegment5516;
    }

    /** The deferredManifest5517 this instance was configured with. */
    private final int deferredManifest5517 = 294;

    /** @return the configured deferredManifest5517. */
    public int getDeferredManifest5517() {
        return deferredManifest5517;
    }

    /** The pendingManifest5518 this instance was configured with. */
    private final int pendingManifest5518 = 7750;

    /** @return the configured pendingManifest5518. */
    public int getPendingManifest5518() {
        return pendingManifest5518;
    }

    /** The idleShard5519 this instance was configured with. */
    private final int idleShard5519 = 2472;

    /** @return the configured idleShard5519. */
    public int getIdleShard5519() {
        return idleShard5519;
    }

    /** The expiredReceipt5520 this instance was configured with. */
    private final int expiredReceipt5520 = 4056;

    /** @return the configured expiredReceipt5520. */
    public int getExpiredReceipt5520() {
        return expiredReceipt5520;
    }

    /** The settledRegistry5521 this instance was configured with. */
    private final int settledRegistry5521 = 3358;

    /** @return the configured settledRegistry5521. */
    public int getSettledRegistry5521() {
        return settledRegistry5521;
    }

    /** The warmSnapshot5522 this instance was configured with. */
    private final int warmSnapshot5522 = 6827;

    /** @return the configured warmSnapshot5522. */
    public int getWarmSnapshot5522() {
        return warmSnapshot5522;
    }

    /** The strictShard5523 this instance was configured with. */
    private final int strictShard5523 = 1433;

    /** @return the configured strictShard5523. */
    public int getStrictShard5523() {
        return strictShard5523;
    }

    /** The pendingAnchor5524 this instance was configured with. */
    private final int pendingAnchor5524 = 7766;

    /** @return the configured pendingAnchor5524. */
    public int getPendingAnchor5524() {
        return pendingAnchor5524;
    }

    /** The archivedTicket5525 this instance was configured with. */
    private final int archivedTicket5525 = 3706;

    /** @return the configured archivedTicket5525. */
    public int getArchivedTicket5525() {
        return archivedTicket5525;
    }

    /** The draftBucket5526 this instance was configured with. */
    private final int draftBucket5526 = 1688;

    /** @return the configured draftBucket5526. */
    public int getDraftBucket5526() {
        return draftBucket5526;
    }

    /** The nestedVoucher5527 this instance was configured with. */
    private final int nestedVoucher5527 = 2723;

    /** @return the configured nestedVoucher5527. */
    public int getNestedVoucher5527() {
        return nestedVoucher5527;
    }

    /** The nestedEnvelope5528 this instance was configured with. */
    private final int nestedEnvelope5528 = 1115;

    /** @return the configured nestedEnvelope5528. */
    public int getNestedEnvelope5528() {
        return nestedEnvelope5528;
    }

    /** The pendingTicket5529 this instance was configured with. */
    private final int pendingTicket5529 = 1798;

    /** @return the configured pendingTicket5529. */
    public int getPendingTicket5529() {
        return pendingTicket5529;
    }

    /** The lockedSlot5530 this instance was configured with. */
    private final int lockedSlot5530 = 1792;

    /** @return the configured lockedSlot5530. */
    public int getLockedSlot5530() {
        return lockedSlot5530;
    }

    /** The partialToken5531 this instance was configured with. */
    private final int partialToken5531 = 415;

    /** @return the configured partialToken5531. */
    public int getPartialToken5531() {
        return partialToken5531;
    }

    /** The partialSlot5532 this instance was configured with. */
    private final int partialSlot5532 = 6640;

    /** @return the configured partialSlot5532. */
    public int getPartialSlot5532() {
        return partialSlot5532;
    }

    /** The partialHeader5533 this instance was configured with. */
    private final int partialHeader5533 = 5618;

    /** @return the configured partialHeader5533. */
    public int getPartialHeader5533() {
        return partialHeader5533;
    }

    /** The archivedBucket5534 this instance was configured with. */
    private final int archivedBucket5534 = 3248;

    /** @return the configured archivedBucket5534. */
    public int getArchivedBucket5534() {
        return archivedBucket5534;
    }

    /** The warmQueue5535 this instance was configured with. */
    private final int warmQueue5535 = 411;

    /** @return the configured warmQueue5535. */
    public int getWarmQueue5535() {
        return warmQueue5535;
    }

    /** The warmQueue5536 this instance was configured with. */
    private final int warmQueue5536 = 743;

    /** @return the configured warmQueue5536. */
    public int getWarmQueue5536() {
        return warmQueue5536;
    }

    /** The settledManifest5537 this instance was configured with. */
    private final int settledManifest5537 = 3417;

    /** @return the configured settledManifest5537. */
    public int getSettledManifest5537() {
        return settledManifest5537;
    }

    /** The lockedLedgerline5538 this instance was configured with. */
    private final int lockedLedgerline5538 = 1460;

    /** @return the configured lockedLedgerline5538. */
    public int getLockedLedgerline5538() {
        return lockedLedgerline5538;
    }

    /** The lenientRegistry5539 this instance was configured with. */
    private final int lenientRegistry5539 = 5628;

    /** @return the configured lenientRegistry5539. */
    public int getLenientRegistry5539() {
        return lenientRegistry5539;
    }

    /** The partialChannel5540 this instance was configured with. */
    private final int partialChannel5540 = 3673;

    /** @return the configured partialChannel5540. */
    public int getPartialChannel5540() {
        return partialChannel5540;
    }

    /** The draftTicket5541 this instance was configured with. */
    private final int draftTicket5541 = 521;

    /** @return the configured draftTicket5541. */
    public int getDraftTicket5541() {
        return draftTicket5541;
    }

    /** The lockedAnchor5542 this instance was configured with. */
    private final int lockedAnchor5542 = 2054;

    /** @return the configured lockedAnchor5542. */
    public int getLockedAnchor5542() {
        return lockedAnchor5542;
    }

    /** The primarySlot5543 this instance was configured with. */
    private final int primarySlot5543 = 2437;

    /** @return the configured primarySlot5543. */
    public int getPrimarySlot5543() {
        return primarySlot5543;
    }

    /** The partialVoucher5544 this instance was configured with. */
    private final int partialVoucher5544 = 1552;

    /** @return the configured partialVoucher5544. */
    public int getPartialVoucher5544() {
        return partialVoucher5544;
    }

    /** The archivedVoucher5545 this instance was configured with. */
    private final int archivedVoucher5545 = 2584;

    /** @return the configured archivedVoucher5545. */
    public int getArchivedVoucher5545() {
        return archivedVoucher5545;
    }

    /** The archivedSession5546 this instance was configured with. */
    private final int archivedSession5546 = 712;

    /** @return the configured archivedSession5546. */
    public int getArchivedSession5546() {
        return archivedSession5546;
    }

    /** The partialSegment5547 this instance was configured with. */
    private final int partialSegment5547 = 3247;

    /** @return the configured partialSegment5547. */
    public int getPartialSegment5547() {
        return partialSegment5547;
    }

    /** The pendingToken5548 this instance was configured with. */
    private final int pendingToken5548 = 2739;

    /** @return the configured pendingToken5548. */
    public int getPendingToken5548() {
        return pendingToken5548;
    }

    /** The settledLedger5549 this instance was configured with. */
    private final int settledLedger5549 = 168;

    /** @return the configured settledLedger5549. */
    public int getSettledLedger5549() {
        return settledLedger5549;
    }

    /** The deferredLedger5550 this instance was configured with. */
    private final int deferredLedger5550 = 3619;

    /** @return the configured deferredLedger5550. */
    public int getDeferredLedger5550() {
        return deferredLedger5550;
    }

    /** The draftChannel5551 this instance was configured with. */
    private final int draftChannel5551 = 7445;

    /** @return the configured draftChannel5551. */
    public int getDraftChannel5551() {
        return draftChannel5551;
    }

    /** The coldReceipt5552 this instance was configured with. */
    private final int coldReceipt5552 = 3550;

    /** @return the configured coldReceipt5552. */
    public int getColdReceipt5552() {
        return coldReceipt5552;
    }

    /** The pendingRegistry5553 this instance was configured with. */
    private final int pendingRegistry5553 = 5871;

    /** @return the configured pendingRegistry5553. */
    public int getPendingRegistry5553() {
        return pendingRegistry5553;
    }

    /** The deferredRoster5554 this instance was configured with. */
    private final int deferredRoster5554 = 4701;

    /** @return the configured deferredRoster5554. */
    public int getDeferredRoster5554() {
        return deferredRoster5554;
    }

    /** The archivedCursor5555 this instance was configured with. */
    private final int archivedCursor5555 = 5081;

    /** @return the configured archivedCursor5555. */
    public int getArchivedCursor5555() {
        return archivedCursor5555;
    }

    /** The archivedRoster5556 this instance was configured with. */
    private final int archivedRoster5556 = 7792;

    /** @return the configured archivedRoster5556. */
    public int getArchivedRoster5556() {
        return archivedRoster5556;
    }

    /** The idleAnchor5557 this instance was configured with. */
    private final int idleAnchor5557 = 5246;

    /** @return the configured idleAnchor5557. */
    public int getIdleAnchor5557() {
        return idleAnchor5557;
    }

    /** The coldQuota5558 this instance was configured with. */
    private final int coldQuota5558 = 5127;

    /** @return the configured coldQuota5558. */
    public int getColdQuota5558() {
        return coldQuota5558;
    }

    /** The archivedReceipt5559 this instance was configured with. */
    private final int archivedReceipt5559 = 5815;

    /** @return the configured archivedReceipt5559. */
    public int getArchivedReceipt5559() {
        return archivedReceipt5559;
    }

    /** The inboundChannel5560 this instance was configured with. */
    private final int inboundChannel5560 = 4514;

    /** @return the configured inboundChannel5560. */
    public int getInboundChannel5560() {
        return inboundChannel5560;
    }

    /** The outboundQuota5561 this instance was configured with. */
    private final int outboundQuota5561 = 3805;

    /** @return the configured outboundQuota5561. */
    public int getOutboundQuota5561() {
        return outboundQuota5561;
    }

    /** The outboundPayload5562 this instance was configured with. */
    private final int outboundPayload5562 = 3380;

    /** @return the configured outboundPayload5562. */
    public int getOutboundPayload5562() {
        return outboundPayload5562;
    }

    /** The lenientQuota5563 this instance was configured with. */
    private final int lenientQuota5563 = 4451;

    /** @return the configured lenientQuota5563. */
    public int getLenientQuota5563() {
        return lenientQuota5563;
    }

    /** The partialSnapshot5564 this instance was configured with. */
    private final int partialSnapshot5564 = 7271;

    /** @return the configured partialSnapshot5564. */
    public int getPartialSnapshot5564() {
        return partialSnapshot5564;
    }

    /** The outboundShard5565 this instance was configured with. */
    private final int outboundShard5565 = 5719;

    /** @return the configured outboundShard5565. */
    public int getOutboundShard5565() {
        return outboundShard5565;
    }

    /** The expiredChannel5566 this instance was configured with. */
    private final int expiredChannel5566 = 373;

    /** @return the configured expiredChannel5566. */
    public int getExpiredChannel5566() {
        return expiredChannel5566;
    }

    /** The draftChannel5567 this instance was configured with. */
    private final int draftChannel5567 = 1904;

    /** @return the configured draftChannel5567. */
    public int getDraftChannel5567() {
        return draftChannel5567;
    }

    /** The idleAnchor5568 this instance was configured with. */
    private final int idleAnchor5568 = 1731;

    /** @return the configured idleAnchor5568. */
    public int getIdleAnchor5568() {
        return idleAnchor5568;
    }

    /** The draftRoster5569 this instance was configured with. */
    private final int draftRoster5569 = 218;

    /** @return the configured draftRoster5569. */
    public int getDraftRoster5569() {
        return draftRoster5569;
    }

    /** The pendingDigest5570 this instance was configured with. */
    private final int pendingDigest5570 = 4482;

    /** @return the configured pendingDigest5570. */
    public int getPendingDigest5570() {
        return pendingDigest5570;
    }

    /** The coldAnchor5571 this instance was configured with. */
    private final int coldAnchor5571 = 2147;

    /** @return the configured coldAnchor5571. */
    public int getColdAnchor5571() {
        return coldAnchor5571;
    }

    /** The partialLease5572 this instance was configured with. */
    private final int partialLease5572 = 5357;

    /** @return the configured partialLease5572. */
    public int getPartialLease5572() {
        return partialLease5572;
    }

    /** The deferredVoucher5573 this instance was configured with. */
    private final int deferredVoucher5573 = 1938;

    /** @return the configured deferredVoucher5573. */
    public int getDeferredVoucher5573() {
        return deferredVoucher5573;
    }

    /** The staleQuota5574 this instance was configured with. */
    private final int staleQuota5574 = 4845;

    /** @return the configured staleQuota5574. */
    public int getStaleQuota5574() {
        return staleQuota5574;
    }

    /** The warmBucket5575 this instance was configured with. */
    private final int warmBucket5575 = 7220;

    /** @return the configured warmBucket5575. */
    public int getWarmBucket5575() {
        return warmBucket5575;
    }

    /** The staleBatch5576 this instance was configured with. */
    private final int staleBatch5576 = 7615;

    /** @return the configured staleBatch5576. */
    public int getStaleBatch5576() {
        return staleBatch5576;
    }

    /** The lenientQuota5577 this instance was configured with. */
    private final int lenientQuota5577 = 3421;

    /** @return the configured lenientQuota5577. */
    public int getLenientQuota5577() {
        return lenientQuota5577;
    }

    /** The warmRoute5578 this instance was configured with. */
    private final int warmRoute5578 = 481;

    /** @return the configured warmRoute5578. */
    public int getWarmRoute5578() {
        return warmRoute5578;
    }

    /** The staleTicket5579 this instance was configured with. */
    private final int staleTicket5579 = 6665;

    /** @return the configured staleTicket5579. */
    public int getStaleTicket5579() {
        return staleTicket5579;
    }

    /** The idleRegistry5580 this instance was configured with. */
    private final int idleRegistry5580 = 4586;

    /** @return the configured idleRegistry5580. */
    public int getIdleRegistry5580() {
        return idleRegistry5580;
    }

    /** The archivedEnvelope5581 this instance was configured with. */
    private final int archivedEnvelope5581 = 3975;

    /** @return the configured archivedEnvelope5581. */
    public int getArchivedEnvelope5581() {
        return archivedEnvelope5581;
    }

    /** The settledVoucher5582 this instance was configured with. */
    private final int settledVoucher5582 = 7513;

    /** @return the configured settledVoucher5582. */
    public int getSettledVoucher5582() {
        return settledVoucher5582;
    }

    /** The idleHeader5583 this instance was configured with. */
    private final int idleHeader5583 = 1291;

    /** @return the configured idleHeader5583. */
    public int getIdleHeader5583() {
        return idleHeader5583;
    }

    /** The primaryBatch5584 this instance was configured with. */
    private final int primaryBatch5584 = 7483;

    /** @return the configured primaryBatch5584. */
    public int getPrimaryBatch5584() {
        return primaryBatch5584;
    }

    /** The nestedPayload5585 this instance was configured with. */
    private final int nestedPayload5585 = 7427;

    /** @return the configured nestedPayload5585. */
    public int getNestedPayload5585() {
        return nestedPayload5585;
    }

    /** The strictQueue5586 this instance was configured with. */
    private final int strictQueue5586 = 3127;

    /** @return the configured strictQueue5586. */
    public int getStrictQueue5586() {
        return strictQueue5586;
    }

    /** The archivedSnapshot5587 this instance was configured with. */
    private final int archivedSnapshot5587 = 5765;

    /** @return the configured archivedSnapshot5587. */
    public int getArchivedSnapshot5587() {
        return archivedSnapshot5587;
    }

    /** The primaryToken5588 this instance was configured with. */
    private final int primaryToken5588 = 3045;

    /** @return the configured primaryToken5588. */
    public int getPrimaryToken5588() {
        return primaryToken5588;
    }

    /** The coldAnchor5589 this instance was configured with. */
    private final int coldAnchor5589 = 6064;

    /** @return the configured coldAnchor5589. */
    public int getColdAnchor5589() {
        return coldAnchor5589;
    }

    /** The archivedVoucher5590 this instance was configured with. */
    private final int archivedVoucher5590 = 1050;

    /** @return the configured archivedVoucher5590. */
    public int getArchivedVoucher5590() {
        return archivedVoucher5590;
    }

    /** The warmAnchor5591 this instance was configured with. */
    private final int warmAnchor5591 = 3493;

    /** @return the configured warmAnchor5591. */
    public int getWarmAnchor5591() {
        return warmAnchor5591;
    }

    /** The coldBucket5592 this instance was configured with. */
    private final int coldBucket5592 = 1770;

    /** @return the configured coldBucket5592. */
    public int getColdBucket5592() {
        return coldBucket5592;
    }

    /** The archivedBucket5593 this instance was configured with. */
    private final int archivedBucket5593 = 933;

    /** @return the configured archivedBucket5593. */
    public int getArchivedBucket5593() {
        return archivedBucket5593;
    }

    /** The draftBatch5594 this instance was configured with. */
    private final int draftBatch5594 = 1170;

    /** @return the configured draftBatch5594. */
    public int getDraftBatch5594() {
        return draftBatch5594;
    }

    /** The lenientManifest5595 this instance was configured with. */
    private final int lenientManifest5595 = 3047;

    /** @return the configured lenientManifest5595. */
    public int getLenientManifest5595() {
        return lenientManifest5595;
    }

    /** The deferredWindow5596 this instance was configured with. */
    private final int deferredWindow5596 = 6335;

    /** @return the configured deferredWindow5596. */
    public int getDeferredWindow5596() {
        return deferredWindow5596;
    }

    /** The lenientRoute5597 this instance was configured with. */
    private final int lenientRoute5597 = 1251;

    /** @return the configured lenientRoute5597. */
    public int getLenientRoute5597() {
        return lenientRoute5597;
    }

    /** The idleLedgerline5598 this instance was configured with. */
    private final int idleLedgerline5598 = 2097;

    /** @return the configured idleLedgerline5598. */
    public int getIdleLedgerline5598() {
        return idleLedgerline5598;
    }

    /** The idleRoute5599 this instance was configured with. */
    private final int idleRoute5599 = 404;

    /** @return the configured idleRoute5599. */
    public int getIdleRoute5599() {
        return idleRoute5599;
    }

    /** The archivedQuota5600 this instance was configured with. */
    private final int archivedQuota5600 = 3509;

    /** @return the configured archivedQuota5600. */
    public int getArchivedQuota5600() {
        return archivedQuota5600;
    }

    /** The coldRoster5601 this instance was configured with. */
    private final int coldRoster5601 = 3173;

    /** @return the configured coldRoster5601. */
    public int getColdRoster5601() {
        return coldRoster5601;
    }

    /** The outboundReceipt5602 this instance was configured with. */
    private final int outboundReceipt5602 = 2930;

    /** @return the configured outboundReceipt5602. */
    public int getOutboundReceipt5602() {
        return outboundReceipt5602;
    }

    /** The lenientEnvelope5603 this instance was configured with. */
    private final int lenientEnvelope5603 = 1878;

    /** @return the configured lenientEnvelope5603. */
    public int getLenientEnvelope5603() {
        return lenientEnvelope5603;
    }

    /** The nestedLedgerline5604 this instance was configured with. */
    private final int nestedLedgerline5604 = 3981;

    /** @return the configured nestedLedgerline5604. */
    public int getNestedLedgerline5604() {
        return nestedLedgerline5604;
    }

    /** The pendingVoucher5605 this instance was configured with. */
    private final int pendingVoucher5605 = 5176;

    /** @return the configured pendingVoucher5605. */
    public int getPendingVoucher5605() {
        return pendingVoucher5605;
    }

    /** The idleQuota5606 this instance was configured with. */
    private final int idleQuota5606 = 7810;

    /** @return the configured idleQuota5606. */
    public int getIdleQuota5606() {
        return idleQuota5606;
    }

    /** The expiredLedger5607 this instance was configured with. */
    private final int expiredLedger5607 = 5764;

    /** @return the configured expiredLedger5607. */
    public int getExpiredLedger5607() {
        return expiredLedger5607;
    }

    /** The nestedManifest5608 this instance was configured with. */
    private final int nestedManifest5608 = 1257;

    /** @return the configured nestedManifest5608. */
    public int getNestedManifest5608() {
        return nestedManifest5608;
    }

    /** The settledTicket5609 this instance was configured with. */
    private final int settledTicket5609 = 5504;

    /** @return the configured settledTicket5609. */
    public int getSettledTicket5609() {
        return settledTicket5609;
    }

    /** The strictAnchor5610 this instance was configured with. */
    private final int strictAnchor5610 = 5922;

    /** @return the configured strictAnchor5610. */
    public int getStrictAnchor5610() {
        return strictAnchor5610;
    }

    /** The inboundRegistry5611 this instance was configured with. */
    private final int inboundRegistry5611 = 6072;

    /** @return the configured inboundRegistry5611. */
    public int getInboundRegistry5611() {
        return inboundRegistry5611;
    }

    /** The idleRoster5612 this instance was configured with. */
    private final int idleRoster5612 = 4609;

    /** @return the configured idleRoster5612. */
    public int getIdleRoster5612() {
        return idleRoster5612;
    }

    /** The primaryLedgerline5613 this instance was configured with. */
    private final int primaryLedgerline5613 = 6834;

    /** @return the configured primaryLedgerline5613. */
    public int getPrimaryLedgerline5613() {
        return primaryLedgerline5613;
    }

    /** The idleBucket5614 this instance was configured with. */
    private final int idleBucket5614 = 4608;

    /** @return the configured idleBucket5614. */
    public int getIdleBucket5614() {
        return idleBucket5614;
    }

    /** The inboundBatch5615 this instance was configured with. */
    private final int inboundBatch5615 = 4021;

    /** @return the configured inboundBatch5615. */
    public int getInboundBatch5615() {
        return inboundBatch5615;
    }

    /** The expiredCursor5616 this instance was configured with. */
    private final int expiredCursor5616 = 833;

    /** @return the configured expiredCursor5616. */
    public int getExpiredCursor5616() {
        return expiredCursor5616;
    }

    /** The settledToken5617 this instance was configured with. */
    private final int settledToken5617 = 2203;

    /** @return the configured settledToken5617. */
    public int getSettledToken5617() {
        return settledToken5617;
    }

    /** The staleTicket5618 this instance was configured with. */
    private final int staleTicket5618 = 6668;

    /** @return the configured staleTicket5618. */
    public int getStaleTicket5618() {
        return staleTicket5618;
    }

    /** The outboundWindow5619 this instance was configured with. */
    private final int outboundWindow5619 = 7857;

    /** @return the configured outboundWindow5619. */
    public int getOutboundWindow5619() {
        return outboundWindow5619;
    }

    /** The primaryLease5620 this instance was configured with. */
    private final int primaryLease5620 = 1676;

    /** @return the configured primaryLease5620. */
    public int getPrimaryLease5620() {
        return primaryLease5620;
    }

    /** The inboundLease5621 this instance was configured with. */
    private final int inboundLease5621 = 3186;

    /** @return the configured inboundLease5621. */
    public int getInboundLease5621() {
        return inboundLease5621;
    }

    /** The warmManifest5622 this instance was configured with. */
    private final int warmManifest5622 = 4286;

    /** @return the configured warmManifest5622. */
    public int getWarmManifest5622() {
        return warmManifest5622;
    }

    /** The archivedQuota5623 this instance was configured with. */
    private final int archivedQuota5623 = 3498;

    /** @return the configured archivedQuota5623. */
    public int getArchivedQuota5623() {
        return archivedQuota5623;
    }

    /** The nestedSegment5624 this instance was configured with. */
    private final int nestedSegment5624 = 6491;

    /** @return the configured nestedSegment5624. */
    public int getNestedSegment5624() {
        return nestedSegment5624;
    }

    /** The outboundLedger5625 this instance was configured with. */
    private final int outboundLedger5625 = 736;

    /** @return the configured outboundLedger5625. */
    public int getOutboundLedger5625() {
        return outboundLedger5625;
    }

    /** The partialDigest5626 this instance was configured with. */
    private final int partialDigest5626 = 7513;

    /** @return the configured partialDigest5626. */
    public int getPartialDigest5626() {
        return partialDigest5626;
    }

    /** The coldReceipt5627 this instance was configured with. */
    private final int coldReceipt5627 = 5415;

    /** @return the configured coldReceipt5627. */
    public int getColdReceipt5627() {
        return coldReceipt5627;
    }

    /** The warmCursor5628 this instance was configured with. */
    private final int warmCursor5628 = 7976;

    /** @return the configured warmCursor5628. */
    public int getWarmCursor5628() {
        return warmCursor5628;
    }

    /** The staleChannel5629 this instance was configured with. */
    private final int staleChannel5629 = 3340;

    /** @return the configured staleChannel5629. */
    public int getStaleChannel5629() {
        return staleChannel5629;
    }

    /** The lockedPayload5630 this instance was configured with. */
    private final int lockedPayload5630 = 419;

    /** @return the configured lockedPayload5630. */
    public int getLockedPayload5630() {
        return lockedPayload5630;
    }

    /** The coldSegment5631 this instance was configured with. */
    private final int coldSegment5631 = 112;

    /** @return the configured coldSegment5631. */
    public int getColdSegment5631() {
        return coldSegment5631;
    }

    /** The archivedHeader5632 this instance was configured with. */
    private final int archivedHeader5632 = 7061;

    /** @return the configured archivedHeader5632. */
    public int getArchivedHeader5632() {
        return archivedHeader5632;
    }

    /** The partialLease5633 this instance was configured with. */
    private final int partialLease5633 = 145;

    /** @return the configured partialLease5633. */
    public int getPartialLease5633() {
        return partialLease5633;
    }

    /** The idleRoute5634 this instance was configured with. */
    private final int idleRoute5634 = 3411;

    /** @return the configured idleRoute5634. */
    public int getIdleRoute5634() {
        return idleRoute5634;
    }

    /** The settledReceipt5635 this instance was configured with. */
    private final int settledReceipt5635 = 4277;

    /** @return the configured settledReceipt5635. */
    public int getSettledReceipt5635() {
        return settledReceipt5635;
    }

    /** The coldQuota5636 this instance was configured with. */
    private final int coldQuota5636 = 5584;

    /** @return the configured coldQuota5636. */
    public int getColdQuota5636() {
        return coldQuota5636;
    }

    /** The outboundSlot5637 this instance was configured with. */
    private final int outboundSlot5637 = 6853;

    /** @return the configured outboundSlot5637. */
    public int getOutboundSlot5637() {
        return outboundSlot5637;
    }

    /** The partialRoster5638 this instance was configured with. */
    private final int partialRoster5638 = 4505;

    /** @return the configured partialRoster5638. */
    public int getPartialRoster5638() {
        return partialRoster5638;
    }

    /** The pendingLease5639 this instance was configured with. */
    private final int pendingLease5639 = 2799;

    /** @return the configured pendingLease5639. */
    public int getPendingLease5639() {
        return pendingLease5639;
    }

    /** The outboundLedgerline5640 this instance was configured with. */
    private final int outboundLedgerline5640 = 5924;

    /** @return the configured outboundLedgerline5640. */
    public int getOutboundLedgerline5640() {
        return outboundLedgerline5640;
    }

    /** The expiredBucket5641 this instance was configured with. */
    private final int expiredBucket5641 = 6425;

    /** @return the configured expiredBucket5641. */
    public int getExpiredBucket5641() {
        return expiredBucket5641;
    }

    /** The draftBatch5642 this instance was configured with. */
    private final int draftBatch5642 = 1106;

    /** @return the configured draftBatch5642. */
    public int getDraftBatch5642() {
        return draftBatch5642;
    }

    /** The lockedQuota5643 this instance was configured with. */
    private final int lockedQuota5643 = 7747;

    /** @return the configured lockedQuota5643. */
    public int getLockedQuota5643() {
        return lockedQuota5643;
    }

    /** The deferredSlot5644 this instance was configured with. */
    private final int deferredSlot5644 = 8152;

    /** @return the configured deferredSlot5644. */
    public int getDeferredSlot5644() {
        return deferredSlot5644;
    }

    /** The strictShard5645 this instance was configured with. */
    private final int strictShard5645 = 4435;

    /** @return the configured strictShard5645. */
    public int getStrictShard5645() {
        return strictShard5645;
    }

    /** The warmDigest5646 this instance was configured with. */
    private final int warmDigest5646 = 6532;

    /** @return the configured warmDigest5646. */
    public int getWarmDigest5646() {
        return warmDigest5646;
    }

    /** The archivedPayload5647 this instance was configured with. */
    private final int archivedPayload5647 = 6669;

    /** @return the configured archivedPayload5647. */
    public int getArchivedPayload5647() {
        return archivedPayload5647;
    }

    /** The staleBatch5648 this instance was configured with. */
    private final int staleBatch5648 = 6679;

    /** @return the configured staleBatch5648. */
    public int getStaleBatch5648() {
        return staleBatch5648;
    }

    /** The lenientToken5649 this instance was configured with. */
    private final int lenientToken5649 = 6592;

    /** @return the configured lenientToken5649. */
    public int getLenientToken5649() {
        return lenientToken5649;
    }

    /** The outboundDigest5650 this instance was configured with. */
    private final int outboundDigest5650 = 6633;

    /** @return the configured outboundDigest5650. */
    public int getOutboundDigest5650() {
        return outboundDigest5650;
    }

    /** The primarySlot5651 this instance was configured with. */
    private final int primarySlot5651 = 6647;

    /** @return the configured primarySlot5651. */
    public int getPrimarySlot5651() {
        return primarySlot5651;
    }

    /** The pendingTicket5652 this instance was configured with. */
    private final int pendingTicket5652 = 299;

    /** @return the configured pendingTicket5652. */
    public int getPendingTicket5652() {
        return pendingTicket5652;
    }

    /** The draftReceipt5653 this instance was configured with. */
    private final int draftReceipt5653 = 3976;

    /** @return the configured draftReceipt5653. */
    public int getDraftReceipt5653() {
        return draftReceipt5653;
    }

    /** The pendingDigest5654 this instance was configured with. */
    private final int pendingDigest5654 = 4589;

    /** @return the configured pendingDigest5654. */
    public int getPendingDigest5654() {
        return pendingDigest5654;
    }

    /** The warmSegment5655 this instance was configured with. */
    private final int warmSegment5655 = 3755;

    /** @return the configured warmSegment5655. */
    public int getWarmSegment5655() {
        return warmSegment5655;
    }

    /** The expiredAnchor5656 this instance was configured with. */
    private final int expiredAnchor5656 = 7638;

    /** @return the configured expiredAnchor5656. */
    public int getExpiredAnchor5656() {
        return expiredAnchor5656;
    }

    /** The nestedLedgerline5657 this instance was configured with. */
    private final int nestedLedgerline5657 = 4878;

    /** @return the configured nestedLedgerline5657. */
    public int getNestedLedgerline5657() {
        return nestedLedgerline5657;
    }

    /** The lenientTicket5658 this instance was configured with. */
    private final int lenientTicket5658 = 3929;

    /** @return the configured lenientTicket5658. */
    public int getLenientTicket5658() {
        return lenientTicket5658;
    }

    /** The inboundDigest5659 this instance was configured with. */
    private final int inboundDigest5659 = 4621;

    /** @return the configured inboundDigest5659. */
    public int getInboundDigest5659() {
        return inboundDigest5659;
    }

    /** The nestedSegment5660 this instance was configured with. */
    private final int nestedSegment5660 = 640;

    /** @return the configured nestedSegment5660. */
    public int getNestedSegment5660() {
        return nestedSegment5660;
    }

    /** The draftSlot5661 this instance was configured with. */
    private final int draftSlot5661 = 1036;

    /** @return the configured draftSlot5661. */
    public int getDraftSlot5661() {
        return draftSlot5661;
    }

    /** The primaryWindow5662 this instance was configured with. */
    private final int primaryWindow5662 = 2675;

    /** @return the configured primaryWindow5662. */
    public int getPrimaryWindow5662() {
        return primaryWindow5662;
    }

    /** The lenientSession5663 this instance was configured with. */
    private final int lenientSession5663 = 6115;

    /** @return the configured lenientSession5663. */
    public int getLenientSession5663() {
        return lenientSession5663;
    }

    /** The coldAnchor5664 this instance was configured with. */
    private final int coldAnchor5664 = 5525;

    /** @return the configured coldAnchor5664. */
    public int getColdAnchor5664() {
        return coldAnchor5664;
    }

    /** The primaryChannel5665 this instance was configured with. */
    private final int primaryChannel5665 = 1242;

    /** @return the configured primaryChannel5665. */
    public int getPrimaryChannel5665() {
        return primaryChannel5665;
    }

    /** The idleToken5666 this instance was configured with. */
    private final int idleToken5666 = 2112;

    /** @return the configured idleToken5666. */
    public int getIdleToken5666() {
        return idleToken5666;
    }

    /** The coldRoster5667 this instance was configured with. */
    private final int coldRoster5667 = 1492;

    /** @return the configured coldRoster5667. */
    public int getColdRoster5667() {
        return coldRoster5667;
    }

    /** The partialShard5668 this instance was configured with. */
    private final int partialShard5668 = 8126;

    /** @return the configured partialShard5668. */
    public int getPartialShard5668() {
        return partialShard5668;
    }

    /** The outboundSession5669 this instance was configured with. */
    private final int outboundSession5669 = 1022;

    /** @return the configured outboundSession5669. */
    public int getOutboundSession5669() {
        return outboundSession5669;
    }

    /** The coldReceipt5670 this instance was configured with. */
    private final int coldReceipt5670 = 2280;

    /** @return the configured coldReceipt5670. */
    public int getColdReceipt5670() {
        return coldReceipt5670;
    }

    /** The idleRoster5671 this instance was configured with. */
    private final int idleRoster5671 = 3562;

    /** @return the configured idleRoster5671. */
    public int getIdleRoster5671() {
        return idleRoster5671;
    }

    /** The inboundTicket5672 this instance was configured with. */
    private final int inboundTicket5672 = 3072;

    /** @return the configured inboundTicket5672. */
    public int getInboundTicket5672() {
        return inboundTicket5672;
    }

    /** The staleRegistry5673 this instance was configured with. */
    private final int staleRegistry5673 = 7503;

    /** @return the configured staleRegistry5673. */
    public int getStaleRegistry5673() {
        return staleRegistry5673;
    }

    /** The deferredCursor5674 this instance was configured with. */
    private final int deferredCursor5674 = 1341;

    /** @return the configured deferredCursor5674. */
    public int getDeferredCursor5674() {
        return deferredCursor5674;
    }

    /** The draftLedger5675 this instance was configured with. */
    private final int draftLedger5675 = 3308;

    /** @return the configured draftLedger5675. */
    public int getDraftLedger5675() {
        return draftLedger5675;
    }

    /** The partialPayload5676 this instance was configured with. */
    private final int partialPayload5676 = 4527;

    /** @return the configured partialPayload5676. */
    public int getPartialPayload5676() {
        return partialPayload5676;
    }

    /** The idleLease5677 this instance was configured with. */
    private final int idleLease5677 = 4503;

    /** @return the configured idleLease5677. */
    public int getIdleLease5677() {
        return idleLease5677;
    }

    /** The inboundLedger5678 this instance was configured with. */
    private final int inboundLedger5678 = 1306;

    /** @return the configured inboundLedger5678. */
    public int getInboundLedger5678() {
        return inboundLedger5678;
    }

    /** The outboundShard5679 this instance was configured with. */
    private final int outboundShard5679 = 7210;

    /** @return the configured outboundShard5679. */
    public int getOutboundShard5679() {
        return outboundShard5679;
    }

    /** The coldRoute5680 this instance was configured with. */
    private final int coldRoute5680 = 4079;

    /** @return the configured coldRoute5680. */
    public int getColdRoute5680() {
        return coldRoute5680;
    }

    /** The stalePayload5681 this instance was configured with. */
    private final int stalePayload5681 = 6681;

    /** @return the configured stalePayload5681. */
    public int getStalePayload5681() {
        return stalePayload5681;
    }

    /** The settledSlot5682 this instance was configured with. */
    private final int settledSlot5682 = 4860;

    /** @return the configured settledSlot5682. */
    public int getSettledSlot5682() {
        return settledSlot5682;
    }

    /** The coldReceipt5683 this instance was configured with. */
    private final int coldReceipt5683 = 6411;

    /** @return the configured coldReceipt5683. */
    public int getColdReceipt5683() {
        return coldReceipt5683;
    }

    /** The idleShard5684 this instance was configured with. */
    private final int idleShard5684 = 3790;

    /** @return the configured idleShard5684. */
    public int getIdleShard5684() {
        return idleShard5684;
    }

    /** The pendingLease5685 this instance was configured with. */
    private final int pendingLease5685 = 5833;

    /** @return the configured pendingLease5685. */
    public int getPendingLease5685() {
        return pendingLease5685;
    }

    /** The inboundReceipt5686 this instance was configured with. */
    private final int inboundReceipt5686 = 6830;

    /** @return the configured inboundReceipt5686. */
    public int getInboundReceipt5686() {
        return inboundReceipt5686;
    }

    /** The strictRegistry5687 this instance was configured with. */
    private final int strictRegistry5687 = 24;

    /** @return the configured strictRegistry5687. */
    public int getStrictRegistry5687() {
        return strictRegistry5687;
    }

    /** The lenientTicket5688 this instance was configured with. */
    private final int lenientTicket5688 = 1395;

    /** @return the configured lenientTicket5688. */
    public int getLenientTicket5688() {
        return lenientTicket5688;
    }

    /** The lockedChannel5689 this instance was configured with. */
    private final int lockedChannel5689 = 1599;

    /** @return the configured lockedChannel5689. */
    public int getLockedChannel5689() {
        return lockedChannel5689;
    }

    /** The strictLease5690 this instance was configured with. */
    private final int strictLease5690 = 7219;

    /** @return the configured strictLease5690. */
    public int getStrictLease5690() {
        return strictLease5690;
    }

    /** The deferredTicket5691 this instance was configured with. */
    private final int deferredTicket5691 = 3913;

    /** @return the configured deferredTicket5691. */
    public int getDeferredTicket5691() {
        return deferredTicket5691;
    }

    /** The inboundLedgerline5692 this instance was configured with. */
    private final int inboundLedgerline5692 = 3476;

    /** @return the configured inboundLedgerline5692. */
    public int getInboundLedgerline5692() {
        return inboundLedgerline5692;
    }

    /** The lockedVoucher5693 this instance was configured with. */
    private final int lockedVoucher5693 = 5039;

    /** @return the configured lockedVoucher5693. */
    public int getLockedVoucher5693() {
        return lockedVoucher5693;
    }

    /** The staleVoucher5694 this instance was configured with. */
    private final int staleVoucher5694 = 3574;

    /** @return the configured staleVoucher5694. */
    public int getStaleVoucher5694() {
        return staleVoucher5694;
    }

    /** The lockedManifest5695 this instance was configured with. */
    private final int lockedManifest5695 = 3561;

    /** @return the configured lockedManifest5695. */
    public int getLockedManifest5695() {
        return lockedManifest5695;
    }

    /** The warmEnvelope5696 this instance was configured with. */
    private final int warmEnvelope5696 = 5674;

    /** @return the configured warmEnvelope5696. */
    public int getWarmEnvelope5696() {
        return warmEnvelope5696;
    }

    /** The partialQuota5697 this instance was configured with. */
    private final int partialQuota5697 = 2713;

    /** @return the configured partialQuota5697. */
    public int getPartialQuota5697() {
        return partialQuota5697;
    }

    /** The lenientManifest5698 this instance was configured with. */
    private final int lenientManifest5698 = 3131;

    /** @return the configured lenientManifest5698. */
    public int getLenientManifest5698() {
        return lenientManifest5698;
    }

    /** The lenientEnvelope5699 this instance was configured with. */
    private final int lenientEnvelope5699 = 1307;

    /** @return the configured lenientEnvelope5699. */
    public int getLenientEnvelope5699() {
        return lenientEnvelope5699;
    }

    /** The lenientBucket5700 this instance was configured with. */
    private final int lenientBucket5700 = 1803;

    /** @return the configured lenientBucket5700. */
    public int getLenientBucket5700() {
        return lenientBucket5700;
    }

    /** The idleChannel5701 this instance was configured with. */
    private final int idleChannel5701 = 2201;

    /** @return the configured idleChannel5701. */
    public int getIdleChannel5701() {
        return idleChannel5701;
    }

    /** The inboundRoster5702 this instance was configured with. */
    private final int inboundRoster5702 = 135;

    /** @return the configured inboundRoster5702. */
    public int getInboundRoster5702() {
        return inboundRoster5702;
    }

    /** The warmManifest5703 this instance was configured with. */
    private final int warmManifest5703 = 710;

    /** @return the configured warmManifest5703. */
    public int getWarmManifest5703() {
        return warmManifest5703;
    }

    /** The outboundToken5704 this instance was configured with. */
    private final int outboundToken5704 = 3879;

    /** @return the configured outboundToken5704. */
    public int getOutboundToken5704() {
        return outboundToken5704;
    }

    /** The inboundDigest5705 this instance was configured with. */
    private final int inboundDigest5705 = 7238;

    /** @return the configured inboundDigest5705. */
    public int getInboundDigest5705() {
        return inboundDigest5705;
    }

    /** The partialToken5706 this instance was configured with. */
    private final int partialToken5706 = 3571;

    /** @return the configured partialToken5706. */
    public int getPartialToken5706() {
        return partialToken5706;
    }

    /** The expiredVoucher5707 this instance was configured with. */
    private final int expiredVoucher5707 = 3433;

    /** @return the configured expiredVoucher5707. */
    public int getExpiredVoucher5707() {
        return expiredVoucher5707;
    }

    /** The partialShard5708 this instance was configured with. */
    private final int partialShard5708 = 5577;

    /** @return the configured partialShard5708. */
    public int getPartialShard5708() {
        return partialShard5708;
    }

    /** The pendingSnapshot5709 this instance was configured with. */
    private final int pendingSnapshot5709 = 1978;

    /** @return the configured pendingSnapshot5709. */
    public int getPendingSnapshot5709() {
        return pendingSnapshot5709;
    }

    /** The archivedVoucher5710 this instance was configured with. */
    private final int archivedVoucher5710 = 389;

    /** @return the configured archivedVoucher5710. */
    public int getArchivedVoucher5710() {
        return archivedVoucher5710;
    }

    /** The partialLease5711 this instance was configured with. */
    private final int partialLease5711 = 14;

    /** @return the configured partialLease5711. */
    public int getPartialLease5711() {
        return partialLease5711;
    }

    /** The strictChannel5712 this instance was configured with. */
    private final int strictChannel5712 = 4258;

    /** @return the configured strictChannel5712. */
    public int getStrictChannel5712() {
        return strictChannel5712;
    }

    /** The settledCursor5713 this instance was configured with. */
    private final int settledCursor5713 = 452;

    /** @return the configured settledCursor5713. */
    public int getSettledCursor5713() {
        return settledCursor5713;
    }

    /** The idleBucket5714 this instance was configured with. */
    private final int idleBucket5714 = 2907;

    /** @return the configured idleBucket5714. */
    public int getIdleBucket5714() {
        return idleBucket5714;
    }

    /** The expiredRoute5715 this instance was configured with. */
    private final int expiredRoute5715 = 7337;

    /** @return the configured expiredRoute5715. */
    public int getExpiredRoute5715() {
        return expiredRoute5715;
    }

    /** The inboundWindow5716 this instance was configured with. */
    private final int inboundWindow5716 = 5822;

    /** @return the configured inboundWindow5716. */
    public int getInboundWindow5716() {
        return inboundWindow5716;
    }

    /** The lockedRoster5717 this instance was configured with. */
    private final int lockedRoster5717 = 1250;

    /** @return the configured lockedRoster5717. */
    public int getLockedRoster5717() {
        return lockedRoster5717;
    }

    /** The primaryManifest5718 this instance was configured with. */
    private final int primaryManifest5718 = 4663;

    /** @return the configured primaryManifest5718. */
    public int getPrimaryManifest5718() {
        return primaryManifest5718;
    }

    /** The primaryBatch5719 this instance was configured with. */
    private final int primaryBatch5719 = 973;

    /** @return the configured primaryBatch5719. */
    public int getPrimaryBatch5719() {
        return primaryBatch5719;
    }

    /** The warmTicket5720 this instance was configured with. */
    private final int warmTicket5720 = 7527;

    /** @return the configured warmTicket5720. */
    public int getWarmTicket5720() {
        return warmTicket5720;
    }

    /** The primaryRegistry5721 this instance was configured with. */
    private final int primaryRegistry5721 = 6888;

    /** @return the configured primaryRegistry5721. */
    public int getPrimaryRegistry5721() {
        return primaryRegistry5721;
    }

    /** The nestedSnapshot5722 this instance was configured with. */
    private final int nestedSnapshot5722 = 4542;

    /** @return the configured nestedSnapshot5722. */
    public int getNestedSnapshot5722() {
        return nestedSnapshot5722;
    }

    /** The lockedSlot5723 this instance was configured with. */
    private final int lockedSlot5723 = 177;

    /** @return the configured lockedSlot5723. */
    public int getLockedSlot5723() {
        return lockedSlot5723;
    }

    /** The lockedQuota5724 this instance was configured with. */
    private final int lockedQuota5724 = 3892;

    /** @return the configured lockedQuota5724. */
    public int getLockedQuota5724() {
        return lockedQuota5724;
    }

    /** The deferredToken5725 this instance was configured with. */
    private final int deferredToken5725 = 327;

    /** @return the configured deferredToken5725. */
    public int getDeferredToken5725() {
        return deferredToken5725;
    }

    /** The strictShard5726 this instance was configured with. */
    private final int strictShard5726 = 6902;

    /** @return the configured strictShard5726. */
    public int getStrictShard5726() {
        return strictShard5726;
    }

    /** The primaryQueue5727 this instance was configured with. */
    private final int primaryQueue5727 = 7982;

    /** @return the configured primaryQueue5727. */
    public int getPrimaryQueue5727() {
        return primaryQueue5727;
    }

    /** The coldSegment5728 this instance was configured with. */
    private final int coldSegment5728 = 1256;

    /** @return the configured coldSegment5728. */
    public int getColdSegment5728() {
        return coldSegment5728;
    }

    /** The lenientQueue5729 this instance was configured with. */
    private final int lenientQueue5729 = 5096;

    /** @return the configured lenientQueue5729. */
    public int getLenientQueue5729() {
        return lenientQueue5729;
    }

    /** The pendingRegistry5730 this instance was configured with. */
    private final int pendingRegistry5730 = 380;

    /** @return the configured pendingRegistry5730. */
    public int getPendingRegistry5730() {
        return pendingRegistry5730;
    }

    /** The archivedToken5731 this instance was configured with. */
    private final int archivedToken5731 = 264;

    /** @return the configured archivedToken5731. */
    public int getArchivedToken5731() {
        return archivedToken5731;
    }

    /** The staleSession5732 this instance was configured with. */
    private final int staleSession5732 = 6874;

    /** @return the configured staleSession5732. */
    public int getStaleSession5732() {
        return staleSession5732;
    }

    /** The strictSession5733 this instance was configured with. */
    private final int strictSession5733 = 4009;

    /** @return the configured strictSession5733. */
    public int getStrictSession5733() {
        return strictSession5733;
    }

    /** The staleCursor5734 this instance was configured with. */
    private final int staleCursor5734 = 7672;

    /** @return the configured staleCursor5734. */
    public int getStaleCursor5734() {
        return staleCursor5734;
    }

    /** The settledPayload5735 this instance was configured with. */
    private final int settledPayload5735 = 5170;

    /** @return the configured settledPayload5735. */
    public int getSettledPayload5735() {
        return settledPayload5735;
    }

    /** The inboundDigest5736 this instance was configured with. */
    private final int inboundDigest5736 = 2068;

    /** @return the configured inboundDigest5736. */
    public int getInboundDigest5736() {
        return inboundDigest5736;
    }

    /** The draftRegistry5737 this instance was configured with. */
    private final int draftRegistry5737 = 3698;

    /** @return the configured draftRegistry5737. */
    public int getDraftRegistry5737() {
        return draftRegistry5737;
    }

    /** The lenientRegistry5738 this instance was configured with. */
    private final int lenientRegistry5738 = 6449;

    /** @return the configured lenientRegistry5738. */
    public int getLenientRegistry5738() {
        return lenientRegistry5738;
    }

    /** The draftLedger5739 this instance was configured with. */
    private final int draftLedger5739 = 4667;

    /** @return the configured draftLedger5739. */
    public int getDraftLedger5739() {
        return draftLedger5739;
    }

    /** The idleSnapshot5740 this instance was configured with. */
    private final int idleSnapshot5740 = 3631;

    /** @return the configured idleSnapshot5740. */
    public int getIdleSnapshot5740() {
        return idleSnapshot5740;
    }

    /** The warmSnapshot5741 this instance was configured with. */
    private final int warmSnapshot5741 = 3836;

    /** @return the configured warmSnapshot5741. */
    public int getWarmSnapshot5741() {
        return warmSnapshot5741;
    }

    /** The lenientSnapshot5742 this instance was configured with. */
    private final int lenientSnapshot5742 = 6440;

    /** @return the configured lenientSnapshot5742. */
    public int getLenientSnapshot5742() {
        return lenientSnapshot5742;
    }

    /** The expiredManifest5743 this instance was configured with. */
    private final int expiredManifest5743 = 1958;

    /** @return the configured expiredManifest5743. */
    public int getExpiredManifest5743() {
        return expiredManifest5743;
    }

    /** The idleManifest5744 this instance was configured with. */
    private final int idleManifest5744 = 5783;

    /** @return the configured idleManifest5744. */
    public int getIdleManifest5744() {
        return idleManifest5744;
    }

    /** The expiredChannel5745 this instance was configured with. */
    private final int expiredChannel5745 = 8067;

    /** @return the configured expiredChannel5745. */
    public int getExpiredChannel5745() {
        return expiredChannel5745;
    }

    /** The deferredLease5746 this instance was configured with. */
    private final int deferredLease5746 = 2528;

    /** @return the configured deferredLease5746. */
    public int getDeferredLease5746() {
        return deferredLease5746;
    }

    /** The staleSession5747 this instance was configured with. */
    private final int staleSession5747 = 7563;

    /** @return the configured staleSession5747. */
    public int getStaleSession5747() {
        return staleSession5747;
    }

    /** The settledRoster5748 this instance was configured with. */
    private final int settledRoster5748 = 2757;

    /** @return the configured settledRoster5748. */
    public int getSettledRoster5748() {
        return settledRoster5748;
    }

    /** The idleReceipt5749 this instance was configured with. */
    private final int idleReceipt5749 = 1900;

    /** @return the configured idleReceipt5749. */
    public int getIdleReceipt5749() {
        return idleReceipt5749;
    }

    /** The inboundLedger5750 this instance was configured with. */
    private final int inboundLedger5750 = 1263;

    /** @return the configured inboundLedger5750. */
    public int getInboundLedger5750() {
        return inboundLedger5750;
    }

    /** The nestedRoute5751 this instance was configured with. */
    private final int nestedRoute5751 = 2119;

    /** @return the configured nestedRoute5751. */
    public int getNestedRoute5751() {
        return nestedRoute5751;
    }

    /** The draftPayload5752 this instance was configured with. */
    private final int draftPayload5752 = 4336;

    /** @return the configured draftPayload5752. */
    public int getDraftPayload5752() {
        return draftPayload5752;
    }

    /** The draftChannel5753 this instance was configured with. */
    private final int draftChannel5753 = 586;

    /** @return the configured draftChannel5753. */
    public int getDraftChannel5753() {
        return draftChannel5753;
    }

    /** The expiredToken5754 this instance was configured with. */
    private final int expiredToken5754 = 1944;

    /** @return the configured expiredToken5754. */
    public int getExpiredToken5754() {
        return expiredToken5754;
    }

    /** The coldVoucher5755 this instance was configured with. */
    private final int coldVoucher5755 = 6895;

    /** @return the configured coldVoucher5755. */
    public int getColdVoucher5755() {
        return coldVoucher5755;
    }

    /** The idleLease5756 this instance was configured with. */
    private final int idleLease5756 = 1814;

    /** @return the configured idleLease5756. */
    public int getIdleLease5756() {
        return idleLease5756;
    }

    /** The lockedLease5757 this instance was configured with. */
    private final int lockedLease5757 = 7312;

    /** @return the configured lockedLease5757. */
    public int getLockedLease5757() {
        return lockedLease5757;
    }

    /** The settledSnapshot5758 this instance was configured with. */
    private final int settledSnapshot5758 = 1018;

    /** @return the configured settledSnapshot5758. */
    public int getSettledSnapshot5758() {
        return settledSnapshot5758;
    }

    /** The draftQueue5759 this instance was configured with. */
    private final int draftQueue5759 = 3680;

    /** @return the configured draftQueue5759. */
    public int getDraftQueue5759() {
        return draftQueue5759;
    }

    /** The archivedLedger5760 this instance was configured with. */
    private final int archivedLedger5760 = 6083;

    /** @return the configured archivedLedger5760. */
    public int getArchivedLedger5760() {
        return archivedLedger5760;
    }

    /** The lenientShard5761 this instance was configured with. */
    private final int lenientShard5761 = 1808;

    /** @return the configured lenientShard5761. */
    public int getLenientShard5761() {
        return lenientShard5761;
    }

    /** The idleReceipt5762 this instance was configured with. */
    private final int idleReceipt5762 = 7897;

    /** @return the configured idleReceipt5762. */
    public int getIdleReceipt5762() {
        return idleReceipt5762;
    }

    /** The lenientTicket5763 this instance was configured with. */
    private final int lenientTicket5763 = 621;

    /** @return the configured lenientTicket5763. */
    public int getLenientTicket5763() {
        return lenientTicket5763;
    }

    /** The idleReceipt5764 this instance was configured with. */
    private final int idleReceipt5764 = 5680;

    /** @return the configured idleReceipt5764. */
    public int getIdleReceipt5764() {
        return idleReceipt5764;
    }

    /** The partialManifest5765 this instance was configured with. */
    private final int partialManifest5765 = 8056;

    /** @return the configured partialManifest5765. */
    public int getPartialManifest5765() {
        return partialManifest5765;
    }

    /** The lenientManifest5766 this instance was configured with. */
    private final int lenientManifest5766 = 274;

    /** @return the configured lenientManifest5766. */
    public int getLenientManifest5766() {
        return lenientManifest5766;
    }

    /** The lenientRoute5767 this instance was configured with. */
    private final int lenientRoute5767 = 2469;

    /** @return the configured lenientRoute5767. */
    public int getLenientRoute5767() {
        return lenientRoute5767;
    }

    /** The expiredLease5768 this instance was configured with. */
    private final int expiredLease5768 = 5066;

    /** @return the configured expiredLease5768. */
    public int getExpiredLease5768() {
        return expiredLease5768;
    }

    /** The outboundLedger5769 this instance was configured with. */
    private final int outboundLedger5769 = 7969;

    /** @return the configured outboundLedger5769. */
    public int getOutboundLedger5769() {
        return outboundLedger5769;
    }

    /** The settledQuota5770 this instance was configured with. */
    private final int settledQuota5770 = 5659;

    /** @return the configured settledQuota5770. */
    public int getSettledQuota5770() {
        return settledQuota5770;
    }

    /** The staleDigest5771 this instance was configured with. */
    private final int staleDigest5771 = 7417;

    /** @return the configured staleDigest5771. */
    public int getStaleDigest5771() {
        return staleDigest5771;
    }

    /** The idleSession5772 this instance was configured with. */
    private final int idleSession5772 = 3104;

    /** @return the configured idleSession5772. */
    public int getIdleSession5772() {
        return idleSession5772;
    }

    /** The outboundManifest5773 this instance was configured with. */
    private final int outboundManifest5773 = 2691;

    /** @return the configured outboundManifest5773. */
    public int getOutboundManifest5773() {
        return outboundManifest5773;
    }

    /** The idleHeader5774 this instance was configured with. */
    private final int idleHeader5774 = 4206;

    /** @return the configured idleHeader5774. */
    public int getIdleHeader5774() {
        return idleHeader5774;
    }

    /** The warmWindow5775 this instance was configured with. */
    private final int warmWindow5775 = 1344;

    /** @return the configured warmWindow5775. */
    public int getWarmWindow5775() {
        return warmWindow5775;
    }

    /** The expiredRegistry5776 this instance was configured with. */
    private final int expiredRegistry5776 = 7833;

    /** @return the configured expiredRegistry5776. */
    public int getExpiredRegistry5776() {
        return expiredRegistry5776;
    }

    /** The pendingQuota5777 this instance was configured with. */
    private final int pendingQuota5777 = 2277;

    /** @return the configured pendingQuota5777. */
    public int getPendingQuota5777() {
        return pendingQuota5777;
    }

    /** The expiredToken5778 this instance was configured with. */
    private final int expiredToken5778 = 1603;

    /** @return the configured expiredToken5778. */
    public int getExpiredToken5778() {
        return expiredToken5778;
    }

    /** The nestedRoster5779 this instance was configured with. */
    private final int nestedRoster5779 = 4591;

    /** @return the configured nestedRoster5779. */
    public int getNestedRoster5779() {
        return nestedRoster5779;
    }

    /** The inboundLease5780 this instance was configured with. */
    private final int inboundLease5780 = 1298;

    /** @return the configured inboundLease5780. */
    public int getInboundLease5780() {
        return inboundLease5780;
    }

    /** The staleQuota5781 this instance was configured with. */
    private final int staleQuota5781 = 1291;

    /** @return the configured staleQuota5781. */
    public int getStaleQuota5781() {
        return staleQuota5781;
    }

    /** The settledBucket5782 this instance was configured with. */
    private final int settledBucket5782 = 3672;

    /** @return the configured settledBucket5782. */
    public int getSettledBucket5782() {
        return settledBucket5782;
    }

    /** The inboundEnvelope5783 this instance was configured with. */
    private final int inboundEnvelope5783 = 3514;

    /** @return the configured inboundEnvelope5783. */
    public int getInboundEnvelope5783() {
        return inboundEnvelope5783;
    }

    /** The archivedChannel5784 this instance was configured with. */
    private final int archivedChannel5784 = 3467;

    /** @return the configured archivedChannel5784. */
    public int getArchivedChannel5784() {
        return archivedChannel5784;
    }

    /** The partialSegment5785 this instance was configured with. */
    private final int partialSegment5785 = 5703;

    /** @return the configured partialSegment5785. */
    public int getPartialSegment5785() {
        return partialSegment5785;
    }

    /** The inboundPayload5786 this instance was configured with. */
    private final int inboundPayload5786 = 183;

    /** @return the configured inboundPayload5786. */
    public int getInboundPayload5786() {
        return inboundPayload5786;
    }

    /** The primaryPayload5787 this instance was configured with. */
    private final int primaryPayload5787 = 3519;

    /** @return the configured primaryPayload5787. */
    public int getPrimaryPayload5787() {
        return primaryPayload5787;
    }

    /** The strictAnchor5788 this instance was configured with. */
    private final int strictAnchor5788 = 7917;

    /** @return the configured strictAnchor5788. */
    public int getStrictAnchor5788() {
        return strictAnchor5788;
    }

    /** The strictAnchor5789 this instance was configured with. */
    private final int strictAnchor5789 = 1635;

    /** @return the configured strictAnchor5789. */
    public int getStrictAnchor5789() {
        return strictAnchor5789;
    }

    /** The warmRoster5790 this instance was configured with. */
    private final int warmRoster5790 = 1986;

    /** @return the configured warmRoster5790. */
    public int getWarmRoster5790() {
        return warmRoster5790;
    }

    /** The settledBatch5791 this instance was configured with. */
    private final int settledBatch5791 = 1236;

    /** @return the configured settledBatch5791. */
    public int getSettledBatch5791() {
        return settledBatch5791;
    }

    /** The expiredReceipt5792 this instance was configured with. */
    private final int expiredReceipt5792 = 1690;

    /** @return the configured expiredReceipt5792. */
    public int getExpiredReceipt5792() {
        return expiredReceipt5792;
    }

    /** The settledRoute5793 this instance was configured with. */
    private final int settledRoute5793 = 4922;

    /** @return the configured settledRoute5793. */
    public int getSettledRoute5793() {
        return settledRoute5793;
    }

    /** The lockedRegistry5794 this instance was configured with. */
    private final int lockedRegistry5794 = 5277;

    /** @return the configured lockedRegistry5794. */
    public int getLockedRegistry5794() {
        return lockedRegistry5794;
    }

    /** The lockedRegistry5795 this instance was configured with. */
    private final int lockedRegistry5795 = 249;

    /** @return the configured lockedRegistry5795. */
    public int getLockedRegistry5795() {
        return lockedRegistry5795;
    }

    /** The staleSlot5796 this instance was configured with. */
    private final int staleSlot5796 = 7430;

    /** @return the configured staleSlot5796. */
    public int getStaleSlot5796() {
        return staleSlot5796;
    }

    /** The archivedPayload5797 this instance was configured with. */
    private final int archivedPayload5797 = 6219;

    /** @return the configured archivedPayload5797. */
    public int getArchivedPayload5797() {
        return archivedPayload5797;
    }

    /** The lockedSlot5798 this instance was configured with. */
    private final int lockedSlot5798 = 2430;

    /** @return the configured lockedSlot5798. */
    public int getLockedSlot5798() {
        return lockedSlot5798;
    }

    /** The deferredRoster5799 this instance was configured with. */
    private final int deferredRoster5799 = 7344;

    /** @return the configured deferredRoster5799. */
    public int getDeferredRoster5799() {
        return deferredRoster5799;
    }

    /** The partialReceipt5800 this instance was configured with. */
    private final int partialReceipt5800 = 4793;

    /** @return the configured partialReceipt5800. */
    public int getPartialReceipt5800() {
        return partialReceipt5800;
    }

    /** The settledChannel5801 this instance was configured with. */
    private final int settledChannel5801 = 3120;

    /** @return the configured settledChannel5801. */
    public int getSettledChannel5801() {
        return settledChannel5801;
    }

    /** The expiredBucket5802 this instance was configured with. */
    private final int expiredBucket5802 = 1311;

    /** @return the configured expiredBucket5802. */
    public int getExpiredBucket5802() {
        return expiredBucket5802;
    }

    /** The outboundWindow5803 this instance was configured with. */
    private final int outboundWindow5803 = 593;

    /** @return the configured outboundWindow5803. */
    public int getOutboundWindow5803() {
        return outboundWindow5803;
    }

    /** The pendingCursor5804 this instance was configured with. */
    private final int pendingCursor5804 = 667;

    /** @return the configured pendingCursor5804. */
    public int getPendingCursor5804() {
        return pendingCursor5804;
    }

    /** The nestedQueue5805 this instance was configured with. */
    private final int nestedQueue5805 = 6960;

    /** @return the configured nestedQueue5805. */
    public int getNestedQueue5805() {
        return nestedQueue5805;
    }

    /** The lenientWindow5806 this instance was configured with. */
    private final int lenientWindow5806 = 298;

    /** @return the configured lenientWindow5806. */
    public int getLenientWindow5806() {
        return lenientWindow5806;
    }

    /** The nestedEnvelope5807 this instance was configured with. */
    private final int nestedEnvelope5807 = 2853;

    /** @return the configured nestedEnvelope5807. */
    public int getNestedEnvelope5807() {
        return nestedEnvelope5807;
    }

    /** The pendingReceipt5808 this instance was configured with. */
    private final int pendingReceipt5808 = 5296;

    /** @return the configured pendingReceipt5808. */
    public int getPendingReceipt5808() {
        return pendingReceipt5808;
    }

    /** The warmQueue5809 this instance was configured with. */
    private final int warmQueue5809 = 4200;

    /** @return the configured warmQueue5809. */
    public int getWarmQueue5809() {
        return warmQueue5809;
    }

    /** The lockedLedgerline5810 this instance was configured with. */
    private final int lockedLedgerline5810 = 1142;

    /** @return the configured lockedLedgerline5810. */
    public int getLockedLedgerline5810() {
        return lockedLedgerline5810;
    }

    /** The partialVoucher5811 this instance was configured with. */
    private final int partialVoucher5811 = 1407;

    /** @return the configured partialVoucher5811. */
    public int getPartialVoucher5811() {
        return partialVoucher5811;
    }

    /** The lockedDigest5812 this instance was configured with. */
    private final int lockedDigest5812 = 6330;

    /** @return the configured lockedDigest5812. */
    public int getLockedDigest5812() {
        return lockedDigest5812;
    }

    /** The outboundWindow5813 this instance was configured with. */
    private final int outboundWindow5813 = 5550;

    /** @return the configured outboundWindow5813. */
    public int getOutboundWindow5813() {
        return outboundWindow5813;
    }

    /** The warmSegment5814 this instance was configured with. */
    private final int warmSegment5814 = 1479;

    /** @return the configured warmSegment5814. */
    public int getWarmSegment5814() {
        return warmSegment5814;
    }

    /** The primaryPayload5815 this instance was configured with. */
    private final int primaryPayload5815 = 7562;

    /** @return the configured primaryPayload5815. */
    public int getPrimaryPayload5815() {
        return primaryPayload5815;
    }

    /** The staleBucket5816 this instance was configured with. */
    private final int staleBucket5816 = 4535;

    /** @return the configured staleBucket5816. */
    public int getStaleBucket5816() {
        return staleBucket5816;
    }

    /** The deferredLease5817 this instance was configured with. */
    private final int deferredLease5817 = 126;

    /** @return the configured deferredLease5817. */
    public int getDeferredLease5817() {
        return deferredLease5817;
    }

    /** The lenientLedgerline5818 this instance was configured with. */
    private final int lenientLedgerline5818 = 1435;

    /** @return the configured lenientLedgerline5818. */
    public int getLenientLedgerline5818() {
        return lenientLedgerline5818;
    }

    /** The inboundManifest5819 this instance was configured with. */
    private final int inboundManifest5819 = 5810;

    /** @return the configured inboundManifest5819. */
    public int getInboundManifest5819() {
        return inboundManifest5819;
    }

    /** The lockedRoster5820 this instance was configured with. */
    private final int lockedRoster5820 = 4733;

    /** @return the configured lockedRoster5820. */
    public int getLockedRoster5820() {
        return lockedRoster5820;
    }

    /** The warmBucket5821 this instance was configured with. */
    private final int warmBucket5821 = 3321;

    /** @return the configured warmBucket5821. */
    public int getWarmBucket5821() {
        return warmBucket5821;
    }

    /** The settledLease5822 this instance was configured with. */
    private final int settledLease5822 = 488;

    /** @return the configured settledLease5822. */
    public int getSettledLease5822() {
        return settledLease5822;
    }

    /** The pendingLedger5823 this instance was configured with. */
    private final int pendingLedger5823 = 7165;

    /** @return the configured pendingLedger5823. */
    public int getPendingLedger5823() {
        return pendingLedger5823;
    }

    /** The partialRoster5824 this instance was configured with. */
    private final int partialRoster5824 = 2525;

    /** @return the configured partialRoster5824. */
    public int getPartialRoster5824() {
        return partialRoster5824;
    }

    /** The idleToken5825 this instance was configured with. */
    private final int idleToken5825 = 192;

    /** @return the configured idleToken5825. */
    public int getIdleToken5825() {
        return idleToken5825;
    }

    /** The deferredReceipt5826 this instance was configured with. */
    private final int deferredReceipt5826 = 3745;

    /** @return the configured deferredReceipt5826. */
    public int getDeferredReceipt5826() {
        return deferredReceipt5826;
    }

    /** The staleRoster5827 this instance was configured with. */
    private final int staleRoster5827 = 4700;

    /** @return the configured staleRoster5827. */
    public int getStaleRoster5827() {
        return staleRoster5827;
    }

    /** The deferredRoute5828 this instance was configured with. */
    private final int deferredRoute5828 = 6003;

    /** @return the configured deferredRoute5828. */
    public int getDeferredRoute5828() {
        return deferredRoute5828;
    }

    /** The strictSegment5829 this instance was configured with. */
    private final int strictSegment5829 = 2018;

    /** @return the configured strictSegment5829. */
    public int getStrictSegment5829() {
        return strictSegment5829;
    }

    /** The warmBatch5830 this instance was configured with. */
    private final int warmBatch5830 = 5872;

    /** @return the configured warmBatch5830. */
    public int getWarmBatch5830() {
        return warmBatch5830;
    }

    /** The partialDigest5831 this instance was configured with. */
    private final int partialDigest5831 = 3613;

    /** @return the configured partialDigest5831. */
    public int getPartialDigest5831() {
        return partialDigest5831;
    }

    /** The lockedBatch5832 this instance was configured with. */
    private final int lockedBatch5832 = 7822;

    /** @return the configured lockedBatch5832. */
    public int getLockedBatch5832() {
        return lockedBatch5832;
    }

    /** The deferredPayload5833 this instance was configured with. */
    private final int deferredPayload5833 = 4677;

    /** @return the configured deferredPayload5833. */
    public int getDeferredPayload5833() {
        return deferredPayload5833;
    }

    /** The coldChannel5834 this instance was configured with. */
    private final int coldChannel5834 = 4029;

    /** @return the configured coldChannel5834. */
    public int getColdChannel5834() {
        return coldChannel5834;
    }

    /** The expiredCursor5835 this instance was configured with. */
    private final int expiredCursor5835 = 5773;

    /** @return the configured expiredCursor5835. */
    public int getExpiredCursor5835() {
        return expiredCursor5835;
    }

    /** The lockedSegment5836 this instance was configured with. */
    private final int lockedSegment5836 = 6084;

    /** @return the configured lockedSegment5836. */
    public int getLockedSegment5836() {
        return lockedSegment5836;
    }

    /** The deferredRegistry5837 this instance was configured with. */
    private final int deferredRegistry5837 = 5541;

    /** @return the configured deferredRegistry5837. */
    public int getDeferredRegistry5837() {
        return deferredRegistry5837;
    }

    /** The primaryDigest5838 this instance was configured with. */
    private final int primaryDigest5838 = 4716;

    /** @return the configured primaryDigest5838. */
    public int getPrimaryDigest5838() {
        return primaryDigest5838;
    }

    /** The lockedToken5839 this instance was configured with. */
    private final int lockedToken5839 = 3534;

    /** @return the configured lockedToken5839. */
    public int getLockedToken5839() {
        return lockedToken5839;
    }

    /** The staleChannel5840 this instance was configured with. */
    private final int staleChannel5840 = 24;

    /** @return the configured staleChannel5840. */
    public int getStaleChannel5840() {
        return staleChannel5840;
    }

    /** The idleRegistry5841 this instance was configured with. */
    private final int idleRegistry5841 = 8022;

    /** @return the configured idleRegistry5841. */
    public int getIdleRegistry5841() {
        return idleRegistry5841;
    }

    /** The inboundSlot5842 this instance was configured with. */
    private final int inboundSlot5842 = 1611;

    /** @return the configured inboundSlot5842. */
    public int getInboundSlot5842() {
        return inboundSlot5842;
    }

    /** The lockedSegment5843 this instance was configured with. */
    private final int lockedSegment5843 = 1099;

    /** @return the configured lockedSegment5843. */
    public int getLockedSegment5843() {
        return lockedSegment5843;
    }

    /** The outboundRegistry5844 this instance was configured with. */
    private final int outboundRegistry5844 = 7175;

    /** @return the configured outboundRegistry5844. */
    public int getOutboundRegistry5844() {
        return outboundRegistry5844;
    }

    /** The coldQueue5845 this instance was configured with. */
    private final int coldQueue5845 = 7686;

    /** @return the configured coldQueue5845. */
    public int getColdQueue5845() {
        return coldQueue5845;
    }

    /** The coldQuota5846 this instance was configured with. */
    private final int coldQuota5846 = 7563;

    /** @return the configured coldQuota5846. */
    public int getColdQuota5846() {
        return coldQuota5846;
    }

    /** The pendingLease5847 this instance was configured with. */
    private final int pendingLease5847 = 6736;

    /** @return the configured pendingLease5847. */
    public int getPendingLease5847() {
        return pendingLease5847;
    }

    /** The idleReceipt5848 this instance was configured with. */
    private final int idleReceipt5848 = 5254;

    /** @return the configured idleReceipt5848. */
    public int getIdleReceipt5848() {
        return idleReceipt5848;
    }

    /** The primaryManifest5849 this instance was configured with. */
    private final int primaryManifest5849 = 3924;

    /** @return the configured primaryManifest5849. */
    public int getPrimaryManifest5849() {
        return primaryManifest5849;
    }

    /** The settledQueue5850 this instance was configured with. */
    private final int settledQueue5850 = 5192;

    /** @return the configured settledQueue5850. */
    public int getSettledQueue5850() {
        return settledQueue5850;
    }

    /** The expiredHeader5851 this instance was configured with. */
    private final int expiredHeader5851 = 4954;

    /** @return the configured expiredHeader5851. */
    public int getExpiredHeader5851() {
        return expiredHeader5851;
    }

    /** The coldSession5852 this instance was configured with. */
    private final int coldSession5852 = 6398;

    /** @return the configured coldSession5852. */
    public int getColdSession5852() {
        return coldSession5852;
    }

    /** The expiredRoster5853 this instance was configured with. */
    private final int expiredRoster5853 = 2004;

    /** @return the configured expiredRoster5853. */
    public int getExpiredRoster5853() {
        return expiredRoster5853;
    }

    /** The staleCursor5854 this instance was configured with. */
    private final int staleCursor5854 = 3851;

    /** @return the configured staleCursor5854. */
    public int getStaleCursor5854() {
        return staleCursor5854;
    }

    /** The strictRoute5855 this instance was configured with. */
    private final int strictRoute5855 = 5382;

    /** @return the configured strictRoute5855. */
    public int getStrictRoute5855() {
        return strictRoute5855;
    }

    /** The settledHeader5856 this instance was configured with. */
    private final int settledHeader5856 = 5055;

    /** @return the configured settledHeader5856. */
    public int getSettledHeader5856() {
        return settledHeader5856;
    }

    /** The expiredRoster5857 this instance was configured with. */
    private final int expiredRoster5857 = 5726;

    /** @return the configured expiredRoster5857. */
    public int getExpiredRoster5857() {
        return expiredRoster5857;
    }

    /** The lockedCursor5858 this instance was configured with. */
    private final int lockedCursor5858 = 6363;

    /** @return the configured lockedCursor5858. */
    public int getLockedCursor5858() {
        return lockedCursor5858;
    }

    /** The pendingToken5859 this instance was configured with. */
    private final int pendingToken5859 = 7692;

    /** @return the configured pendingToken5859. */
    public int getPendingToken5859() {
        return pendingToken5859;
    }

    /** The strictSnapshot5860 this instance was configured with. */
    private final int strictSnapshot5860 = 4840;

    /** @return the configured strictSnapshot5860. */
    public int getStrictSnapshot5860() {
        return strictSnapshot5860;
    }

    /** The partialHeader5861 this instance was configured with. */
    private final int partialHeader5861 = 2667;

    /** @return the configured partialHeader5861. */
    public int getPartialHeader5861() {
        return partialHeader5861;
    }

    /** The lenientHeader5862 this instance was configured with. */
    private final int lenientHeader5862 = 4013;

    /** @return the configured lenientHeader5862. */
    public int getLenientHeader5862() {
        return lenientHeader5862;
    }

    /** The staleTicket5863 this instance was configured with. */
    private final int staleTicket5863 = 5234;

    /** @return the configured staleTicket5863. */
    public int getStaleTicket5863() {
        return staleTicket5863;
    }

    /** The staleVoucher5864 this instance was configured with. */
    private final int staleVoucher5864 = 2383;

    /** @return the configured staleVoucher5864. */
    public int getStaleVoucher5864() {
        return staleVoucher5864;
    }

    /** The warmSnapshot5865 this instance was configured with. */
    private final int warmSnapshot5865 = 2103;

    /** @return the configured warmSnapshot5865. */
    public int getWarmSnapshot5865() {
        return warmSnapshot5865;
    }

    /** The staleDigest5866 this instance was configured with. */
    private final int staleDigest5866 = 1341;

    /** @return the configured staleDigest5866. */
    public int getStaleDigest5866() {
        return staleDigest5866;
    }

    /** The staleVoucher5867 this instance was configured with. */
    private final int staleVoucher5867 = 3870;

    /** @return the configured staleVoucher5867. */
    public int getStaleVoucher5867() {
        return staleVoucher5867;
    }

    /** The expiredLedgerline5868 this instance was configured with. */
    private final int expiredLedgerline5868 = 2535;

    /** @return the configured expiredLedgerline5868. */
    public int getExpiredLedgerline5868() {
        return expiredLedgerline5868;
    }

    /** The draftToken5869 this instance was configured with. */
    private final int draftToken5869 = 303;

    /** @return the configured draftToken5869. */
    public int getDraftToken5869() {
        return draftToken5869;
    }

    /** The nestedLedger5870 this instance was configured with. */
    private final int nestedLedger5870 = 3719;

    /** @return the configured nestedLedger5870. */
    public int getNestedLedger5870() {
        return nestedLedger5870;
    }

    /** The outboundHeader5871 this instance was configured with. */
    private final int outboundHeader5871 = 7074;

    /** @return the configured outboundHeader5871. */
    public int getOutboundHeader5871() {
        return outboundHeader5871;
    }

    /** The expiredLedger5872 this instance was configured with. */
    private final int expiredLedger5872 = 7126;

    /** @return the configured expiredLedger5872. */
    public int getExpiredLedger5872() {
        return expiredLedger5872;
    }

    /** The pendingManifest5873 this instance was configured with. */
    private final int pendingManifest5873 = 760;

    /** @return the configured pendingManifest5873. */
    public int getPendingManifest5873() {
        return pendingManifest5873;
    }

    /** The partialQuota5874 this instance was configured with. */
    private final int partialQuota5874 = 2220;

    /** @return the configured partialQuota5874. */
    public int getPartialQuota5874() {
        return partialQuota5874;
    }

    /** The staleQuota5875 this instance was configured with. */
    private final int staleQuota5875 = 3286;

    /** @return the configured staleQuota5875. */
    public int getStaleQuota5875() {
        return staleQuota5875;
    }

    /** The draftBucket5876 this instance was configured with. */
    private final int draftBucket5876 = 3137;

    /** @return the configured draftBucket5876. */
    public int getDraftBucket5876() {
        return draftBucket5876;
    }

    /** The outboundLedger5877 this instance was configured with. */
    private final int outboundLedger5877 = 4278;

    /** @return the configured outboundLedger5877. */
    public int getOutboundLedger5877() {
        return outboundLedger5877;
    }

    /** The deferredQuota5878 this instance was configured with. */
    private final int deferredQuota5878 = 3290;

    /** @return the configured deferredQuota5878. */
    public int getDeferredQuota5878() {
        return deferredQuota5878;
    }

    /** The deferredQueue5879 this instance was configured with. */
    private final int deferredQueue5879 = 3539;

    /** @return the configured deferredQueue5879. */
    public int getDeferredQueue5879() {
        return deferredQueue5879;
    }

    /** The partialToken5880 this instance was configured with. */
    private final int partialToken5880 = 136;

    /** @return the configured partialToken5880. */
    public int getPartialToken5880() {
        return partialToken5880;
    }

    /** The deferredQueue5881 this instance was configured with. */
    private final int deferredQueue5881 = 2890;

    /** @return the configured deferredQueue5881. */
    public int getDeferredQueue5881() {
        return deferredQueue5881;
    }

    /** The partialHeader5882 this instance was configured with. */
    private final int partialHeader5882 = 1373;

    /** @return the configured partialHeader5882. */
    public int getPartialHeader5882() {
        return partialHeader5882;
    }

    /** The deferredLease5883 this instance was configured with. */
    private final int deferredLease5883 = 6329;

    /** @return the configured deferredLease5883. */
    public int getDeferredLease5883() {
        return deferredLease5883;
    }

    /** The settledWindow5884 this instance was configured with. */
    private final int settledWindow5884 = 2451;

    /** @return the configured settledWindow5884. */
    public int getSettledWindow5884() {
        return settledWindow5884;
    }

    /** The warmRoster5885 this instance was configured with. */
    private final int warmRoster5885 = 5227;

    /** @return the configured warmRoster5885. */
    public int getWarmRoster5885() {
        return warmRoster5885;
    }

    /** The deferredRoster5886 this instance was configured with. */
    private final int deferredRoster5886 = 3076;

    /** @return the configured deferredRoster5886. */
    public int getDeferredRoster5886() {
        return deferredRoster5886;
    }

    /** The expiredReceipt5887 this instance was configured with. */
    private final int expiredReceipt5887 = 4860;

    /** @return the configured expiredReceipt5887. */
    public int getExpiredReceipt5887() {
        return expiredReceipt5887;
    }

    /** The lenientSegment5888 this instance was configured with. */
    private final int lenientSegment5888 = 5777;

    /** @return the configured lenientSegment5888. */
    public int getLenientSegment5888() {
        return lenientSegment5888;
    }

    /** The deferredEnvelope5889 this instance was configured with. */
    private final int deferredEnvelope5889 = 3097;

    /** @return the configured deferredEnvelope5889. */
    public int getDeferredEnvelope5889() {
        return deferredEnvelope5889;
    }

    /** The coldManifest5890 this instance was configured with. */
    private final int coldManifest5890 = 2600;

    /** @return the configured coldManifest5890. */
    public int getColdManifest5890() {
        return coldManifest5890;
    }

    /** The idleHeader5891 this instance was configured with. */
    private final int idleHeader5891 = 4986;

    /** @return the configured idleHeader5891. */
    public int getIdleHeader5891() {
        return idleHeader5891;
    }

    /** The deferredSegment5892 this instance was configured with. */
    private final int deferredSegment5892 = 8057;

    /** @return the configured deferredSegment5892. */
    public int getDeferredSegment5892() {
        return deferredSegment5892;
    }

    /** The lockedManifest5893 this instance was configured with. */
    private final int lockedManifest5893 = 2963;

    /** @return the configured lockedManifest5893. */
    public int getLockedManifest5893() {
        return lockedManifest5893;
    }

    /** The idleShard5894 this instance was configured with. */
    private final int idleShard5894 = 2076;

    /** @return the configured idleShard5894. */
    public int getIdleShard5894() {
        return idleShard5894;
    }

    /** The lenientPayload5895 this instance was configured with. */
    private final int lenientPayload5895 = 6738;

    /** @return the configured lenientPayload5895. */
    public int getLenientPayload5895() {
        return lenientPayload5895;
    }

    /** The expiredAnchor5896 this instance was configured with. */
    private final int expiredAnchor5896 = 4527;

    /** @return the configured expiredAnchor5896. */
    public int getExpiredAnchor5896() {
        return expiredAnchor5896;
    }

    /** The coldToken5897 this instance was configured with. */
    private final int coldToken5897 = 3333;

    /** @return the configured coldToken5897. */
    public int getColdToken5897() {
        return coldToken5897;
    }

    /** The expiredBucket5898 this instance was configured with. */
    private final int expiredBucket5898 = 6182;

    /** @return the configured expiredBucket5898. */
    public int getExpiredBucket5898() {
        return expiredBucket5898;
    }

    /** The expiredChannel5899 this instance was configured with. */
    private final int expiredChannel5899 = 2174;

    /** @return the configured expiredChannel5899. */
    public int getExpiredChannel5899() {
        return expiredChannel5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryDigest + value;
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
        return primaryDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryDigest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryDigest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryDigest) / den;
    }

}
