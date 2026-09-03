package com.example.p23;

/**
 * idleLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class103 {

    private int deferredCursor = 1;

    private final java.util.Map<String, Integer> draftEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftEnvelope0 table. */
    public int settledBatch0(String key) {
        Integer hit = draftEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long expiredQueue1 = 0L;

    /** Folds {@code delta} into the running expiredQueue1. */
    public long warmLease1(long delta) {
        if (delta == 0L) {
            return expiredQueue1;
        }
        expiredQueue1 += delta < 0 ? -delta : delta;
        return expiredQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredShard2(int n) {
        switch (n / 6) {
            case 0:
                return "partial";
            case 1:
                return "deferred";
            default:
                return n > 185 ? "nested" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the nestedRoster stage. */
    public boolean nestedWindow3(String text) {
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

    private final java.util.Map<String, Integer> primaryReceipt4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryReceipt4 table. */
    public int warmLease4(String key) {
        Integer hit = primaryReceipt4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long staleLedger5 = 0L;

    /** Folds {@code delta} into the running staleLedger5. */
    public long warmCursor5(long delta) {
        if (delta == 0L) {
            return staleLedger5;
        }
        staleLedger5 += delta < 0 ? -delta : delta;
        return staleLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientDigest6(int n) {
        switch (n / 6) {
            case 0:
                return "inbound";
            case 1:
                return "locked";
            default:
                return n > 111 ? "settled" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the primaryBatch stage. */
    public boolean archivedEnvelope7(String text) {
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

    private final java.util.Map<String, Integer> coldDigest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldDigest8 table. */
    public int pendingHeader8(String key) {
        Integer hit = coldDigest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long deferredQueue9 = 0L;

    /** Folds {@code delta} into the running deferredQueue9. */
    public long strictPayload9(long delta) {
        if (delta == 0L) {
            return deferredQueue9;
        }
        deferredQueue9 += delta < 0 ? -delta : delta;
        return deferredQueue9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledBatch10(int n) {
        switch (n / 5) {
            case 0:
                return "pending";
            case 1:
                return "idle";
            default:
                return n > 364 ? "strict" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the nestedRegistry stage. */
    public boolean settledAnchor11(String text) {
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

    private final java.util.Map<String, Integer> nestedSession12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSession12 table. */
    public int idleManifest12(String key) {
        Integer hit = nestedSession12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long outboundSegment13 = 0L;

    /** Folds {@code delta} into the running outboundSegment13. */
    public long strictSlot13(long delta) {
        if (delta == 0L) {
            return outboundSegment13;
        }
        outboundSegment13 += delta < 0 ? -delta : delta;
        return outboundSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredHeader14(int n) {
        switch (n / 10) {
            case 0:
                return "stale";
            case 1:
                return "settled";
            default:
                return n > 396 ? "partial" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the partialHeader stage. */
    public boolean primaryRegistry15(String text) {
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

    private final java.util.Map<String, Integer> staleTicket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleTicket16 table. */
    public int outboundChannel16(String key) {
        Integer hit = staleTicket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long staleSnapshot17 = 0L;

    /** Folds {@code delta} into the running staleSnapshot17. */
    public long nestedToken17(long delta) {
        if (delta == 0L) {
            return staleSnapshot17;
        }
        staleSnapshot17 += delta < 0 ? -delta : delta;
        return staleSnapshot17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundTicket18(int n) {
        switch (n / 3) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 232 ? "primary" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lockedShard stage. */
    public boolean archivedCursor19(String text) {
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

    private final java.util.Map<String, Integer> pendingSnapshot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSnapshot20 table. */
    public int warmShard20(String key) {
        Integer hit = pendingSnapshot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long archivedSlot21 = 0L;

    /** Folds {@code delta} into the running archivedSlot21. */
    public long archivedSession21(long delta) {
        if (delta == 0L) {
            return archivedSlot21;
        }
        archivedSlot21 += delta < 0 ? -delta : delta;
        return archivedSlot21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedShard22(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "nested";
            default:
                return n > 392 ? "strict" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the deferredSnapshot stage. */
    public boolean partialWindow23(String text) {
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

    private final java.util.Map<String, Integer> expiredHeader24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredHeader24 table. */
    public int expiredQuota24(String key) {
        Integer hit = expiredHeader24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long warmLedgerline25 = 0L;

    /** Folds {@code delta} into the running warmLedgerline25. */
    public long inboundSlot25(long delta) {
        if (delta == 0L) {
            return warmLedgerline25;
        }
        warmLedgerline25 += delta < 0 ? -delta : delta;
        return warmLedgerline25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryChannel26(int n) {
        switch (n / 6) {
            case 0:
                return "idle";
            case 1:
                return "expired";
            default:
                return n > 180 ? "locked" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the pendingSegment stage. */
    public boolean pendingPayload27(String text) {
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

    private final java.util.Map<String, Integer> draftManifest28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftManifest28 table. */
    public int warmBucket28(String key) {
        Integer hit = draftManifest28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long settledSlot29 = 0L;

    /** Folds {@code delta} into the running settledSlot29. */
    public long deferredSnapshot29(long delta) {
        if (delta == 0L) {
            return settledSlot29;
        }
        settledSlot29 += delta < 0 ? -delta : delta;
        return settledSlot29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryChannel30(int n) {
        switch (n / 6) {
            case 0:
                return "draft";
            case 1:
                return "partial";
            default:
                return n > 317 ? "cold" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the nestedRoster stage. */
    public boolean pendingDigest31(String text) {
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

    private final java.util.Map<String, Integer> strictSegment32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictSegment32 table. */
    public int settledEnvelope32(String key) {
        Integer hit = strictSegment32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long strictSegment33 = 0L;

    /** Folds {@code delta} into the running strictSegment33. */
    public long deferredShard33(long delta) {
        if (delta == 0L) {
            return strictSegment33;
        }
        strictSegment33 += delta < 0 ? -delta : delta;
        return strictSegment33;
    }

    /** The partialSlot5000 this instance was configured with. */
    private final int partialSlot5000 = 7451;

    /** @return the configured partialSlot5000. */
    public int getPartialSlot5000() {
        return partialSlot5000;
    }

    /** The warmRegistry5001 this instance was configured with. */
    private final int warmRegistry5001 = 1166;

    /** @return the configured warmRegistry5001. */
    public int getWarmRegistry5001() {
        return warmRegistry5001;
    }

    /** The strictTicket5002 this instance was configured with. */
    private final int strictTicket5002 = 5800;

    /** @return the configured strictTicket5002. */
    public int getStrictTicket5002() {
        return strictTicket5002;
    }

    /** The lockedBatch5003 this instance was configured with. */
    private final int lockedBatch5003 = 5655;

    /** @return the configured lockedBatch5003. */
    public int getLockedBatch5003() {
        return lockedBatch5003;
    }

    /** The partialSession5004 this instance was configured with. */
    private final int partialSession5004 = 1967;

    /** @return the configured partialSession5004. */
    public int getPartialSession5004() {
        return partialSession5004;
    }

    /** The draftLedger5005 this instance was configured with. */
    private final int draftLedger5005 = 6111;

    /** @return the configured draftLedger5005. */
    public int getDraftLedger5005() {
        return draftLedger5005;
    }

    /** The strictWindow5006 this instance was configured with. */
    private final int strictWindow5006 = 6549;

    /** @return the configured strictWindow5006. */
    public int getStrictWindow5006() {
        return strictWindow5006;
    }

    /** The strictDigest5007 this instance was configured with. */
    private final int strictDigest5007 = 8169;

    /** @return the configured strictDigest5007. */
    public int getStrictDigest5007() {
        return strictDigest5007;
    }

    /** The outboundCursor5008 this instance was configured with. */
    private final int outboundCursor5008 = 2019;

    /** @return the configured outboundCursor5008. */
    public int getOutboundCursor5008() {
        return outboundCursor5008;
    }

    /** The lenientRoster5009 this instance was configured with. */
    private final int lenientRoster5009 = 5919;

    /** @return the configured lenientRoster5009. */
    public int getLenientRoster5009() {
        return lenientRoster5009;
    }

    /** The draftWindow5010 this instance was configured with. */
    private final int draftWindow5010 = 5048;

    /** @return the configured draftWindow5010. */
    public int getDraftWindow5010() {
        return draftWindow5010;
    }

    /** The archivedLease5011 this instance was configured with. */
    private final int archivedLease5011 = 4010;

    /** @return the configured archivedLease5011. */
    public int getArchivedLease5011() {
        return archivedLease5011;
    }

    /** The coldRoster5012 this instance was configured with. */
    private final int coldRoster5012 = 7624;

    /** @return the configured coldRoster5012. */
    public int getColdRoster5012() {
        return coldRoster5012;
    }

    /** The deferredRegistry5013 this instance was configured with. */
    private final int deferredRegistry5013 = 6820;

    /** @return the configured deferredRegistry5013. */
    public int getDeferredRegistry5013() {
        return deferredRegistry5013;
    }

    /** The deferredManifest5014 this instance was configured with. */
    private final int deferredManifest5014 = 3226;

    /** @return the configured deferredManifest5014. */
    public int getDeferredManifest5014() {
        return deferredManifest5014;
    }

    /** The coldLedgerline5015 this instance was configured with. */
    private final int coldLedgerline5015 = 2591;

    /** @return the configured coldLedgerline5015. */
    public int getColdLedgerline5015() {
        return coldLedgerline5015;
    }

    /** The lenientLedgerline5016 this instance was configured with. */
    private final int lenientLedgerline5016 = 7808;

    /** @return the configured lenientLedgerline5016. */
    public int getLenientLedgerline5016() {
        return lenientLedgerline5016;
    }

    /** The lockedDigest5017 this instance was configured with. */
    private final int lockedDigest5017 = 2961;

    /** @return the configured lockedDigest5017. */
    public int getLockedDigest5017() {
        return lockedDigest5017;
    }

    /** The expiredQuota5018 this instance was configured with. */
    private final int expiredQuota5018 = 1341;

    /** @return the configured expiredQuota5018. */
    public int getExpiredQuota5018() {
        return expiredQuota5018;
    }

    /** The strictSegment5019 this instance was configured with. */
    private final int strictSegment5019 = 994;

    /** @return the configured strictSegment5019. */
    public int getStrictSegment5019() {
        return strictSegment5019;
    }

    /** The settledShard5020 this instance was configured with. */
    private final int settledShard5020 = 7834;

    /** @return the configured settledShard5020. */
    public int getSettledShard5020() {
        return settledShard5020;
    }

    /** The idleCursor5021 this instance was configured with. */
    private final int idleCursor5021 = 7817;

    /** @return the configured idleCursor5021. */
    public int getIdleCursor5021() {
        return idleCursor5021;
    }

    /** The settledShard5022 this instance was configured with. */
    private final int settledShard5022 = 5543;

    /** @return the configured settledShard5022. */
    public int getSettledShard5022() {
        return settledShard5022;
    }

    /** The staleTicket5023 this instance was configured with. */
    private final int staleTicket5023 = 4272;

    /** @return the configured staleTicket5023. */
    public int getStaleTicket5023() {
        return staleTicket5023;
    }

    /** The primaryShard5024 this instance was configured with. */
    private final int primaryShard5024 = 7635;

    /** @return the configured primaryShard5024. */
    public int getPrimaryShard5024() {
        return primaryShard5024;
    }

    /** The nestedQueue5025 this instance was configured with. */
    private final int nestedQueue5025 = 7113;

    /** @return the configured nestedQueue5025. */
    public int getNestedQueue5025() {
        return nestedQueue5025;
    }

    /** The draftPayload5026 this instance was configured with. */
    private final int draftPayload5026 = 6499;

    /** @return the configured draftPayload5026. */
    public int getDraftPayload5026() {
        return draftPayload5026;
    }

    /** The nestedTicket5027 this instance was configured with. */
    private final int nestedTicket5027 = 4009;

    /** @return the configured nestedTicket5027. */
    public int getNestedTicket5027() {
        return nestedTicket5027;
    }

    /** The strictRoster5028 this instance was configured with. */
    private final int strictRoster5028 = 6523;

    /** @return the configured strictRoster5028. */
    public int getStrictRoster5028() {
        return strictRoster5028;
    }

    /** The primaryVoucher5029 this instance was configured with. */
    private final int primaryVoucher5029 = 7159;

    /** @return the configured primaryVoucher5029. */
    public int getPrimaryVoucher5029() {
        return primaryVoucher5029;
    }

    /** The staleRegistry5030 this instance was configured with. */
    private final int staleRegistry5030 = 8143;

    /** @return the configured staleRegistry5030. */
    public int getStaleRegistry5030() {
        return staleRegistry5030;
    }

    /** The pendingLedger5031 this instance was configured with. */
    private final int pendingLedger5031 = 6412;

    /** @return the configured pendingLedger5031. */
    public int getPendingLedger5031() {
        return pendingLedger5031;
    }

    /** The primarySlot5032 this instance was configured with. */
    private final int primarySlot5032 = 1784;

    /** @return the configured primarySlot5032. */
    public int getPrimarySlot5032() {
        return primarySlot5032;
    }

    /** The inboundDigest5033 this instance was configured with. */
    private final int inboundDigest5033 = 5326;

    /** @return the configured inboundDigest5033. */
    public int getInboundDigest5033() {
        return inboundDigest5033;
    }

    /** The staleBatch5034 this instance was configured with. */
    private final int staleBatch5034 = 7179;

    /** @return the configured staleBatch5034. */
    public int getStaleBatch5034() {
        return staleBatch5034;
    }

    /** The expiredTicket5035 this instance was configured with. */
    private final int expiredTicket5035 = 2524;

    /** @return the configured expiredTicket5035. */
    public int getExpiredTicket5035() {
        return expiredTicket5035;
    }

    /** The deferredLedger5036 this instance was configured with. */
    private final int deferredLedger5036 = 6918;

    /** @return the configured deferredLedger5036. */
    public int getDeferredLedger5036() {
        return deferredLedger5036;
    }

    /** The nestedSlot5037 this instance was configured with. */
    private final int nestedSlot5037 = 2216;

    /** @return the configured nestedSlot5037. */
    public int getNestedSlot5037() {
        return nestedSlot5037;
    }

    /** The warmRoute5038 this instance was configured with. */
    private final int warmRoute5038 = 5770;

    /** @return the configured warmRoute5038. */
    public int getWarmRoute5038() {
        return warmRoute5038;
    }

    /** The staleQueue5039 this instance was configured with. */
    private final int staleQueue5039 = 7552;

    /** @return the configured staleQueue5039. */
    public int getStaleQueue5039() {
        return staleQueue5039;
    }

    /** The primaryReceipt5040 this instance was configured with. */
    private final int primaryReceipt5040 = 82;

    /** @return the configured primaryReceipt5040. */
    public int getPrimaryReceipt5040() {
        return primaryReceipt5040;
    }

    /** The archivedSlot5041 this instance was configured with. */
    private final int archivedSlot5041 = 2590;

    /** @return the configured archivedSlot5041. */
    public int getArchivedSlot5041() {
        return archivedSlot5041;
    }

    /** The pendingSlot5042 this instance was configured with. */
    private final int pendingSlot5042 = 4515;

    /** @return the configured pendingSlot5042. */
    public int getPendingSlot5042() {
        return pendingSlot5042;
    }

    /** The deferredAnchor5043 this instance was configured with. */
    private final int deferredAnchor5043 = 7483;

    /** @return the configured deferredAnchor5043. */
    public int getDeferredAnchor5043() {
        return deferredAnchor5043;
    }

    /** The settledShard5044 this instance was configured with. */
    private final int settledShard5044 = 5449;

    /** @return the configured settledShard5044. */
    public int getSettledShard5044() {
        return settledShard5044;
    }

    /** The warmTicket5045 this instance was configured with. */
    private final int warmTicket5045 = 2504;

    /** @return the configured warmTicket5045. */
    public int getWarmTicket5045() {
        return warmTicket5045;
    }

    /** The lenientShard5046 this instance was configured with. */
    private final int lenientShard5046 = 2905;

    /** @return the configured lenientShard5046. */
    public int getLenientShard5046() {
        return lenientShard5046;
    }

    /** The nestedEnvelope5047 this instance was configured with. */
    private final int nestedEnvelope5047 = 2583;

    /** @return the configured nestedEnvelope5047. */
    public int getNestedEnvelope5047() {
        return nestedEnvelope5047;
    }

    /** The strictVoucher5048 this instance was configured with. */
    private final int strictVoucher5048 = 5736;

    /** @return the configured strictVoucher5048. */
    public int getStrictVoucher5048() {
        return strictVoucher5048;
    }

    /** The lockedHeader5049 this instance was configured with. */
    private final int lockedHeader5049 = 6548;

    /** @return the configured lockedHeader5049. */
    public int getLockedHeader5049() {
        return lockedHeader5049;
    }

    /** The archivedBucket5050 this instance was configured with. */
    private final int archivedBucket5050 = 2819;

    /** @return the configured archivedBucket5050. */
    public int getArchivedBucket5050() {
        return archivedBucket5050;
    }

    /** The draftQuota5051 this instance was configured with. */
    private final int draftQuota5051 = 1788;

    /** @return the configured draftQuota5051. */
    public int getDraftQuota5051() {
        return draftQuota5051;
    }

    /** The draftBucket5052 this instance was configured with. */
    private final int draftBucket5052 = 4045;

    /** @return the configured draftBucket5052. */
    public int getDraftBucket5052() {
        return draftBucket5052;
    }

    /** The idleCursor5053 this instance was configured with. */
    private final int idleCursor5053 = 6133;

    /** @return the configured idleCursor5053. */
    public int getIdleCursor5053() {
        return idleCursor5053;
    }

    /** The outboundSegment5054 this instance was configured with. */
    private final int outboundSegment5054 = 3951;

    /** @return the configured outboundSegment5054. */
    public int getOutboundSegment5054() {
        return outboundSegment5054;
    }

    /** The draftWindow5055 this instance was configured with. */
    private final int draftWindow5055 = 533;

    /** @return the configured draftWindow5055. */
    public int getDraftWindow5055() {
        return draftWindow5055;
    }

    /** The lockedAnchor5056 this instance was configured with. */
    private final int lockedAnchor5056 = 4549;

    /** @return the configured lockedAnchor5056. */
    public int getLockedAnchor5056() {
        return lockedAnchor5056;
    }

    /** The expiredBatch5057 this instance was configured with. */
    private final int expiredBatch5057 = 6441;

    /** @return the configured expiredBatch5057. */
    public int getExpiredBatch5057() {
        return expiredBatch5057;
    }

    /** The idleWindow5058 this instance was configured with. */
    private final int idleWindow5058 = 5446;

    /** @return the configured idleWindow5058. */
    public int getIdleWindow5058() {
        return idleWindow5058;
    }

    /** The staleSnapshot5059 this instance was configured with. */
    private final int staleSnapshot5059 = 666;

    /** @return the configured staleSnapshot5059. */
    public int getStaleSnapshot5059() {
        return staleSnapshot5059;
    }

    /** The warmLedgerline5060 this instance was configured with. */
    private final int warmLedgerline5060 = 6038;

    /** @return the configured warmLedgerline5060. */
    public int getWarmLedgerline5060() {
        return warmLedgerline5060;
    }

    /** The idleLedgerline5061 this instance was configured with. */
    private final int idleLedgerline5061 = 4820;

    /** @return the configured idleLedgerline5061. */
    public int getIdleLedgerline5061() {
        return idleLedgerline5061;
    }

    /** The staleBatch5062 this instance was configured with. */
    private final int staleBatch5062 = 3191;

    /** @return the configured staleBatch5062. */
    public int getStaleBatch5062() {
        return staleBatch5062;
    }

    /** The lockedQuota5063 this instance was configured with. */
    private final int lockedQuota5063 = 4869;

    /** @return the configured lockedQuota5063. */
    public int getLockedQuota5063() {
        return lockedQuota5063;
    }

    /** The staleSnapshot5064 this instance was configured with. */
    private final int staleSnapshot5064 = 2220;

    /** @return the configured staleSnapshot5064. */
    public int getStaleSnapshot5064() {
        return staleSnapshot5064;
    }

    /** The archivedQueue5065 this instance was configured with. */
    private final int archivedQueue5065 = 3739;

    /** @return the configured archivedQueue5065. */
    public int getArchivedQueue5065() {
        return archivedQueue5065;
    }

    /** The nestedToken5066 this instance was configured with. */
    private final int nestedToken5066 = 2432;

    /** @return the configured nestedToken5066. */
    public int getNestedToken5066() {
        return nestedToken5066;
    }

    /** The staleToken5067 this instance was configured with. */
    private final int staleToken5067 = 7535;

    /** @return the configured staleToken5067. */
    public int getStaleToken5067() {
        return staleToken5067;
    }

    /** The partialTicket5068 this instance was configured with. */
    private final int partialTicket5068 = 5768;

    /** @return the configured partialTicket5068. */
    public int getPartialTicket5068() {
        return partialTicket5068;
    }

    /** The nestedLedgerline5069 this instance was configured with. */
    private final int nestedLedgerline5069 = 7704;

    /** @return the configured nestedLedgerline5069. */
    public int getNestedLedgerline5069() {
        return nestedLedgerline5069;
    }

    /** The draftQueue5070 this instance was configured with. */
    private final int draftQueue5070 = 2444;

    /** @return the configured draftQueue5070. */
    public int getDraftQueue5070() {
        return draftQueue5070;
    }

    /** The lockedSegment5071 this instance was configured with. */
    private final int lockedSegment5071 = 3780;

    /** @return the configured lockedSegment5071. */
    public int getLockedSegment5071() {
        return lockedSegment5071;
    }

    /** The outboundVoucher5072 this instance was configured with. */
    private final int outboundVoucher5072 = 3479;

    /** @return the configured outboundVoucher5072. */
    public int getOutboundVoucher5072() {
        return outboundVoucher5072;
    }

    /** The nestedAnchor5073 this instance was configured with. */
    private final int nestedAnchor5073 = 703;

    /** @return the configured nestedAnchor5073. */
    public int getNestedAnchor5073() {
        return nestedAnchor5073;
    }

    /** The lenientBucket5074 this instance was configured with. */
    private final int lenientBucket5074 = 1082;

    /** @return the configured lenientBucket5074. */
    public int getLenientBucket5074() {
        return lenientBucket5074;
    }

    /** The idlePayload5075 this instance was configured with. */
    private final int idlePayload5075 = 6322;

    /** @return the configured idlePayload5075. */
    public int getIdlePayload5075() {
        return idlePayload5075;
    }

    /** The pendingPayload5076 this instance was configured with. */
    private final int pendingPayload5076 = 3312;

    /** @return the configured pendingPayload5076. */
    public int getPendingPayload5076() {
        return pendingPayload5076;
    }

    /** The primaryToken5077 this instance was configured with. */
    private final int primaryToken5077 = 3522;

    /** @return the configured primaryToken5077. */
    public int getPrimaryToken5077() {
        return primaryToken5077;
    }

    /** The archivedBucket5078 this instance was configured with. */
    private final int archivedBucket5078 = 7001;

    /** @return the configured archivedBucket5078. */
    public int getArchivedBucket5078() {
        return archivedBucket5078;
    }

    /** The lockedLease5079 this instance was configured with. */
    private final int lockedLease5079 = 4572;

    /** @return the configured lockedLease5079. */
    public int getLockedLease5079() {
        return lockedLease5079;
    }

    /** The lockedEnvelope5080 this instance was configured with. */
    private final int lockedEnvelope5080 = 3772;

    /** @return the configured lockedEnvelope5080. */
    public int getLockedEnvelope5080() {
        return lockedEnvelope5080;
    }

    /** The idleBucket5081 this instance was configured with. */
    private final int idleBucket5081 = 5557;

    /** @return the configured idleBucket5081. */
    public int getIdleBucket5081() {
        return idleBucket5081;
    }

    /** The staleRoute5082 this instance was configured with. */
    private final int staleRoute5082 = 4249;

    /** @return the configured staleRoute5082. */
    public int getStaleRoute5082() {
        return staleRoute5082;
    }

    /** The strictShard5083 this instance was configured with. */
    private final int strictShard5083 = 8141;

    /** @return the configured strictShard5083. */
    public int getStrictShard5083() {
        return strictShard5083;
    }

    /** The draftLedger5084 this instance was configured with. */
    private final int draftLedger5084 = 4969;

    /** @return the configured draftLedger5084. */
    public int getDraftLedger5084() {
        return draftLedger5084;
    }

    /** The idleQuota5085 this instance was configured with. */
    private final int idleQuota5085 = 2422;

    /** @return the configured idleQuota5085. */
    public int getIdleQuota5085() {
        return idleQuota5085;
    }

    /** The partialRegistry5086 this instance was configured with. */
    private final int partialRegistry5086 = 1781;

    /** @return the configured partialRegistry5086. */
    public int getPartialRegistry5086() {
        return partialRegistry5086;
    }

    /** The idleBucket5087 this instance was configured with. */
    private final int idleBucket5087 = 155;

    /** @return the configured idleBucket5087. */
    public int getIdleBucket5087() {
        return idleBucket5087;
    }

    /** The strictEnvelope5088 this instance was configured with. */
    private final int strictEnvelope5088 = 3079;

    /** @return the configured strictEnvelope5088. */
    public int getStrictEnvelope5088() {
        return strictEnvelope5088;
    }

    /** The idleLease5089 this instance was configured with. */
    private final int idleLease5089 = 3473;

    /** @return the configured idleLease5089. */
    public int getIdleLease5089() {
        return idleLease5089;
    }

    /** The staleVoucher5090 this instance was configured with. */
    private final int staleVoucher5090 = 1708;

    /** @return the configured staleVoucher5090. */
    public int getStaleVoucher5090() {
        return staleVoucher5090;
    }

    /** The settledTicket5091 this instance was configured with. */
    private final int settledTicket5091 = 2823;

    /** @return the configured settledTicket5091. */
    public int getSettledTicket5091() {
        return settledTicket5091;
    }

    /** The archivedCursor5092 this instance was configured with. */
    private final int archivedCursor5092 = 815;

    /** @return the configured archivedCursor5092. */
    public int getArchivedCursor5092() {
        return archivedCursor5092;
    }

    /** The coldRegistry5093 this instance was configured with. */
    private final int coldRegistry5093 = 6025;

    /** @return the configured coldRegistry5093. */
    public int getColdRegistry5093() {
        return coldRegistry5093;
    }

    /** The idleBucket5094 this instance was configured with. */
    private final int idleBucket5094 = 2534;

    /** @return the configured idleBucket5094. */
    public int getIdleBucket5094() {
        return idleBucket5094;
    }

    /** The warmHeader5095 this instance was configured with. */
    private final int warmHeader5095 = 5708;

    /** @return the configured warmHeader5095. */
    public int getWarmHeader5095() {
        return warmHeader5095;
    }

    /** The pendingLedgerline5096 this instance was configured with. */
    private final int pendingLedgerline5096 = 6663;

    /** @return the configured pendingLedgerline5096. */
    public int getPendingLedgerline5096() {
        return pendingLedgerline5096;
    }

    /** The archivedLedgerline5097 this instance was configured with. */
    private final int archivedLedgerline5097 = 489;

    /** @return the configured archivedLedgerline5097. */
    public int getArchivedLedgerline5097() {
        return archivedLedgerline5097;
    }

    /** The lockedQuota5098 this instance was configured with. */
    private final int lockedQuota5098 = 58;

    /** @return the configured lockedQuota5098. */
    public int getLockedQuota5098() {
        return lockedQuota5098;
    }

    /** The draftManifest5099 this instance was configured with. */
    private final int draftManifest5099 = 4104;

    /** @return the configured draftManifest5099. */
    public int getDraftManifest5099() {
        return draftManifest5099;
    }

    /** The nestedCursor5100 this instance was configured with. */
    private final int nestedCursor5100 = 5242;

    /** @return the configured nestedCursor5100. */
    public int getNestedCursor5100() {
        return nestedCursor5100;
    }

    /** The coldLease5101 this instance was configured with. */
    private final int coldLease5101 = 4413;

    /** @return the configured coldLease5101. */
    public int getColdLease5101() {
        return coldLease5101;
    }

    /** The archivedTicket5102 this instance was configured with. */
    private final int archivedTicket5102 = 6200;

    /** @return the configured archivedTicket5102. */
    public int getArchivedTicket5102() {
        return archivedTicket5102;
    }

    /** The coldReceipt5103 this instance was configured with. */
    private final int coldReceipt5103 = 3072;

    /** @return the configured coldReceipt5103. */
    public int getColdReceipt5103() {
        return coldReceipt5103;
    }

    /** The inboundQueue5104 this instance was configured with. */
    private final int inboundQueue5104 = 4269;

    /** @return the configured inboundQueue5104. */
    public int getInboundQueue5104() {
        return inboundQueue5104;
    }

    /** The inboundWindow5105 this instance was configured with. */
    private final int inboundWindow5105 = 5915;

    /** @return the configured inboundWindow5105. */
    public int getInboundWindow5105() {
        return inboundWindow5105;
    }

    /** The idleLease5106 this instance was configured with. */
    private final int idleLease5106 = 1819;

    /** @return the configured idleLease5106. */
    public int getIdleLease5106() {
        return idleLease5106;
    }

    /** The pendingBucket5107 this instance was configured with. */
    private final int pendingBucket5107 = 13;

    /** @return the configured pendingBucket5107. */
    public int getPendingBucket5107() {
        return pendingBucket5107;
    }

    /** The expiredShard5108 this instance was configured with. */
    private final int expiredShard5108 = 923;

    /** @return the configured expiredShard5108. */
    public int getExpiredShard5108() {
        return expiredShard5108;
    }

    /** The idlePayload5109 this instance was configured with. */
    private final int idlePayload5109 = 3701;

    /** @return the configured idlePayload5109. */
    public int getIdlePayload5109() {
        return idlePayload5109;
    }

    /** The staleVoucher5110 this instance was configured with. */
    private final int staleVoucher5110 = 1311;

    /** @return the configured staleVoucher5110. */
    public int getStaleVoucher5110() {
        return staleVoucher5110;
    }

    /** The strictRoute5111 this instance was configured with. */
    private final int strictRoute5111 = 1971;

    /** @return the configured strictRoute5111. */
    public int getStrictRoute5111() {
        return strictRoute5111;
    }

    /** The strictRegistry5112 this instance was configured with. */
    private final int strictRegistry5112 = 4954;

    /** @return the configured strictRegistry5112. */
    public int getStrictRegistry5112() {
        return strictRegistry5112;
    }

    /** The inboundManifest5113 this instance was configured with. */
    private final int inboundManifest5113 = 6753;

    /** @return the configured inboundManifest5113. */
    public int getInboundManifest5113() {
        return inboundManifest5113;
    }

    /** The strictSnapshot5114 this instance was configured with. */
    private final int strictSnapshot5114 = 1435;

    /** @return the configured strictSnapshot5114. */
    public int getStrictSnapshot5114() {
        return strictSnapshot5114;
    }

    /** The coldToken5115 this instance was configured with. */
    private final int coldToken5115 = 221;

    /** @return the configured coldToken5115. */
    public int getColdToken5115() {
        return coldToken5115;
    }

    /** The staleSnapshot5116 this instance was configured with. */
    private final int staleSnapshot5116 = 6997;

    /** @return the configured staleSnapshot5116. */
    public int getStaleSnapshot5116() {
        return staleSnapshot5116;
    }

    /** The warmBatch5117 this instance was configured with. */
    private final int warmBatch5117 = 2175;

    /** @return the configured warmBatch5117. */
    public int getWarmBatch5117() {
        return warmBatch5117;
    }

    /** The inboundToken5118 this instance was configured with. */
    private final int inboundToken5118 = 5971;

    /** @return the configured inboundToken5118. */
    public int getInboundToken5118() {
        return inboundToken5118;
    }

    /** The outboundToken5119 this instance was configured with. */
    private final int outboundToken5119 = 2886;

    /** @return the configured outboundToken5119. */
    public int getOutboundToken5119() {
        return outboundToken5119;
    }

    /** The nestedEnvelope5120 this instance was configured with. */
    private final int nestedEnvelope5120 = 1078;

    /** @return the configured nestedEnvelope5120. */
    public int getNestedEnvelope5120() {
        return nestedEnvelope5120;
    }

    /** The deferredLedgerline5121 this instance was configured with. */
    private final int deferredLedgerline5121 = 3617;

    /** @return the configured deferredLedgerline5121. */
    public int getDeferredLedgerline5121() {
        return deferredLedgerline5121;
    }

    /** The archivedSession5122 this instance was configured with. */
    private final int archivedSession5122 = 7594;

    /** @return the configured archivedSession5122. */
    public int getArchivedSession5122() {
        return archivedSession5122;
    }

    /** The idleSegment5123 this instance was configured with. */
    private final int idleSegment5123 = 4170;

    /** @return the configured idleSegment5123. */
    public int getIdleSegment5123() {
        return idleSegment5123;
    }

    /** The warmChannel5124 this instance was configured with. */
    private final int warmChannel5124 = 5638;

    /** @return the configured warmChannel5124. */
    public int getWarmChannel5124() {
        return warmChannel5124;
    }

    /** The inboundLease5125 this instance was configured with. */
    private final int inboundLease5125 = 7153;

    /** @return the configured inboundLease5125. */
    public int getInboundLease5125() {
        return inboundLease5125;
    }

    /** The idleToken5126 this instance was configured with. */
    private final int idleToken5126 = 897;

    /** @return the configured idleToken5126. */
    public int getIdleToken5126() {
        return idleToken5126;
    }

    /** The expiredHeader5127 this instance was configured with. */
    private final int expiredHeader5127 = 8044;

    /** @return the configured expiredHeader5127. */
    public int getExpiredHeader5127() {
        return expiredHeader5127;
    }

    /** The outboundLedger5128 this instance was configured with. */
    private final int outboundLedger5128 = 5713;

    /** @return the configured outboundLedger5128. */
    public int getOutboundLedger5128() {
        return outboundLedger5128;
    }

    /** The lenientQueue5129 this instance was configured with. */
    private final int lenientQueue5129 = 1496;

    /** @return the configured lenientQueue5129. */
    public int getLenientQueue5129() {
        return lenientQueue5129;
    }

    /** The expiredToken5130 this instance was configured with. */
    private final int expiredToken5130 = 4240;

    /** @return the configured expiredToken5130. */
    public int getExpiredToken5130() {
        return expiredToken5130;
    }

    /** The lockedBucket5131 this instance was configured with. */
    private final int lockedBucket5131 = 8099;

    /** @return the configured lockedBucket5131. */
    public int getLockedBucket5131() {
        return lockedBucket5131;
    }

    /** The lockedDigest5132 this instance was configured with. */
    private final int lockedDigest5132 = 888;

    /** @return the configured lockedDigest5132. */
    public int getLockedDigest5132() {
        return lockedDigest5132;
    }

    /** The primaryDigest5133 this instance was configured with. */
    private final int primaryDigest5133 = 781;

    /** @return the configured primaryDigest5133. */
    public int getPrimaryDigest5133() {
        return primaryDigest5133;
    }

    /** The coldRegistry5134 this instance was configured with. */
    private final int coldRegistry5134 = 7375;

    /** @return the configured coldRegistry5134. */
    public int getColdRegistry5134() {
        return coldRegistry5134;
    }

    /** The idleVoucher5135 this instance was configured with. */
    private final int idleVoucher5135 = 326;

    /** @return the configured idleVoucher5135. */
    public int getIdleVoucher5135() {
        return idleVoucher5135;
    }

    /** The idlePayload5136 this instance was configured with. */
    private final int idlePayload5136 = 72;

    /** @return the configured idlePayload5136. */
    public int getIdlePayload5136() {
        return idlePayload5136;
    }

    /** The draftSession5137 this instance was configured with. */
    private final int draftSession5137 = 4984;

    /** @return the configured draftSession5137. */
    public int getDraftSession5137() {
        return draftSession5137;
    }

    /** The strictBatch5138 this instance was configured with. */
    private final int strictBatch5138 = 4939;

    /** @return the configured strictBatch5138. */
    public int getStrictBatch5138() {
        return strictBatch5138;
    }

    /** The staleToken5139 this instance was configured with. */
    private final int staleToken5139 = 4371;

    /** @return the configured staleToken5139. */
    public int getStaleToken5139() {
        return staleToken5139;
    }

    /** The partialShard5140 this instance was configured with. */
    private final int partialShard5140 = 4353;

    /** @return the configured partialShard5140. */
    public int getPartialShard5140() {
        return partialShard5140;
    }

    /** The primaryToken5141 this instance was configured with. */
    private final int primaryToken5141 = 3913;

    /** @return the configured primaryToken5141. */
    public int getPrimaryToken5141() {
        return primaryToken5141;
    }

    /** The inboundSlot5142 this instance was configured with. */
    private final int inboundSlot5142 = 2897;

    /** @return the configured inboundSlot5142. */
    public int getInboundSlot5142() {
        return inboundSlot5142;
    }

    /** The partialManifest5143 this instance was configured with. */
    private final int partialManifest5143 = 1522;

    /** @return the configured partialManifest5143. */
    public int getPartialManifest5143() {
        return partialManifest5143;
    }

    /** The settledRoster5144 this instance was configured with. */
    private final int settledRoster5144 = 261;

    /** @return the configured settledRoster5144. */
    public int getSettledRoster5144() {
        return settledRoster5144;
    }

    /** The nestedQueue5145 this instance was configured with. */
    private final int nestedQueue5145 = 1275;

    /** @return the configured nestedQueue5145. */
    public int getNestedQueue5145() {
        return nestedQueue5145;
    }

    /** The primaryLedgerline5146 this instance was configured with. */
    private final int primaryLedgerline5146 = 7470;

    /** @return the configured primaryLedgerline5146. */
    public int getPrimaryLedgerline5146() {
        return primaryLedgerline5146;
    }

    /** The nestedWindow5147 this instance was configured with. */
    private final int nestedWindow5147 = 2387;

    /** @return the configured nestedWindow5147. */
    public int getNestedWindow5147() {
        return nestedWindow5147;
    }

    /** The strictVoucher5148 this instance was configured with. */
    private final int strictVoucher5148 = 5747;

    /** @return the configured strictVoucher5148. */
    public int getStrictVoucher5148() {
        return strictVoucher5148;
    }

    /** The lockedQueue5149 this instance was configured with. */
    private final int lockedQueue5149 = 3716;

    /** @return the configured lockedQueue5149. */
    public int getLockedQueue5149() {
        return lockedQueue5149;
    }

    /** The lockedToken5150 this instance was configured with. */
    private final int lockedToken5150 = 3627;

    /** @return the configured lockedToken5150. */
    public int getLockedToken5150() {
        return lockedToken5150;
    }

    /** The pendingVoucher5151 this instance was configured with. */
    private final int pendingVoucher5151 = 4852;

    /** @return the configured pendingVoucher5151. */
    public int getPendingVoucher5151() {
        return pendingVoucher5151;
    }

    /** The inboundRegistry5152 this instance was configured with. */
    private final int inboundRegistry5152 = 5738;

    /** @return the configured inboundRegistry5152. */
    public int getInboundRegistry5152() {
        return inboundRegistry5152;
    }

    /** The archivedEnvelope5153 this instance was configured with. */
    private final int archivedEnvelope5153 = 4393;

    /** @return the configured archivedEnvelope5153. */
    public int getArchivedEnvelope5153() {
        return archivedEnvelope5153;
    }

    /** The warmAnchor5154 this instance was configured with. */
    private final int warmAnchor5154 = 951;

    /** @return the configured warmAnchor5154. */
    public int getWarmAnchor5154() {
        return warmAnchor5154;
    }

    /** The inboundReceipt5155 this instance was configured with. */
    private final int inboundReceipt5155 = 5714;

    /** @return the configured inboundReceipt5155. */
    public int getInboundReceipt5155() {
        return inboundReceipt5155;
    }

    /** The draftWindow5156 this instance was configured with. */
    private final int draftWindow5156 = 1921;

    /** @return the configured draftWindow5156. */
    public int getDraftWindow5156() {
        return draftWindow5156;
    }

    /** The pendingToken5157 this instance was configured with. */
    private final int pendingToken5157 = 7535;

    /** @return the configured pendingToken5157. */
    public int getPendingToken5157() {
        return pendingToken5157;
    }

    /** The pendingAnchor5158 this instance was configured with. */
    private final int pendingAnchor5158 = 6396;

    /** @return the configured pendingAnchor5158. */
    public int getPendingAnchor5158() {
        return pendingAnchor5158;
    }

    /** The primaryReceipt5159 this instance was configured with. */
    private final int primaryReceipt5159 = 7191;

    /** @return the configured primaryReceipt5159. */
    public int getPrimaryReceipt5159() {
        return primaryReceipt5159;
    }

    /** The partialPayload5160 this instance was configured with. */
    private final int partialPayload5160 = 1088;

    /** @return the configured partialPayload5160. */
    public int getPartialPayload5160() {
        return partialPayload5160;
    }

    /** The primaryRegistry5161 this instance was configured with. */
    private final int primaryRegistry5161 = 4148;

    /** @return the configured primaryRegistry5161. */
    public int getPrimaryRegistry5161() {
        return primaryRegistry5161;
    }

    /** The coldRoster5162 this instance was configured with. */
    private final int coldRoster5162 = 5822;

    /** @return the configured coldRoster5162. */
    public int getColdRoster5162() {
        return coldRoster5162;
    }

    /** The settledSegment5163 this instance was configured with. */
    private final int settledSegment5163 = 7191;

    /** @return the configured settledSegment5163. */
    public int getSettledSegment5163() {
        return settledSegment5163;
    }

    /** The settledPayload5164 this instance was configured with. */
    private final int settledPayload5164 = 4124;

    /** @return the configured settledPayload5164. */
    public int getSettledPayload5164() {
        return settledPayload5164;
    }

    /** The pendingBatch5165 this instance was configured with. */
    private final int pendingBatch5165 = 5921;

    /** @return the configured pendingBatch5165. */
    public int getPendingBatch5165() {
        return pendingBatch5165;
    }

    /** The strictQueue5166 this instance was configured with. */
    private final int strictQueue5166 = 8001;

    /** @return the configured strictQueue5166. */
    public int getStrictQueue5166() {
        return strictQueue5166;
    }

    /** The partialDigest5167 this instance was configured with. */
    private final int partialDigest5167 = 6440;

    /** @return the configured partialDigest5167. */
    public int getPartialDigest5167() {
        return partialDigest5167;
    }

    /** The lenientToken5168 this instance was configured with. */
    private final int lenientToken5168 = 5294;

    /** @return the configured lenientToken5168. */
    public int getLenientToken5168() {
        return lenientToken5168;
    }

    /** The staleAnchor5169 this instance was configured with. */
    private final int staleAnchor5169 = 1215;

    /** @return the configured staleAnchor5169. */
    public int getStaleAnchor5169() {
        return staleAnchor5169;
    }

    /** The outboundRegistry5170 this instance was configured with. */
    private final int outboundRegistry5170 = 140;

    /** @return the configured outboundRegistry5170. */
    public int getOutboundRegistry5170() {
        return outboundRegistry5170;
    }

    /** The inboundLease5171 this instance was configured with. */
    private final int inboundLease5171 = 4015;

    /** @return the configured inboundLease5171. */
    public int getInboundLease5171() {
        return inboundLease5171;
    }

    /** The lockedTicket5172 this instance was configured with. */
    private final int lockedTicket5172 = 4812;

    /** @return the configured lockedTicket5172. */
    public int getLockedTicket5172() {
        return lockedTicket5172;
    }

    /** The nestedSnapshot5173 this instance was configured with. */
    private final int nestedSnapshot5173 = 2289;

    /** @return the configured nestedSnapshot5173. */
    public int getNestedSnapshot5173() {
        return nestedSnapshot5173;
    }

    /** The outboundLedger5174 this instance was configured with. */
    private final int outboundLedger5174 = 7906;

    /** @return the configured outboundLedger5174. */
    public int getOutboundLedger5174() {
        return outboundLedger5174;
    }

    /** The lockedBatch5175 this instance was configured with. */
    private final int lockedBatch5175 = 929;

    /** @return the configured lockedBatch5175. */
    public int getLockedBatch5175() {
        return lockedBatch5175;
    }

    /** The partialLedgerline5176 this instance was configured with. */
    private final int partialLedgerline5176 = 4239;

    /** @return the configured partialLedgerline5176. */
    public int getPartialLedgerline5176() {
        return partialLedgerline5176;
    }

    /** The outboundChannel5177 this instance was configured with. */
    private final int outboundChannel5177 = 2931;

    /** @return the configured outboundChannel5177. */
    public int getOutboundChannel5177() {
        return outboundChannel5177;
    }

    /** The partialQueue5178 this instance was configured with. */
    private final int partialQueue5178 = 407;

    /** @return the configured partialQueue5178. */
    public int getPartialQueue5178() {
        return partialQueue5178;
    }

    /** The idleBatch5179 this instance was configured with. */
    private final int idleBatch5179 = 2637;

    /** @return the configured idleBatch5179. */
    public int getIdleBatch5179() {
        return idleBatch5179;
    }

    /** The draftChannel5180 this instance was configured with. */
    private final int draftChannel5180 = 5414;

    /** @return the configured draftChannel5180. */
    public int getDraftChannel5180() {
        return draftChannel5180;
    }

    /** The staleVoucher5181 this instance was configured with. */
    private final int staleVoucher5181 = 4429;

    /** @return the configured staleVoucher5181. */
    public int getStaleVoucher5181() {
        return staleVoucher5181;
    }

    /** The settledChannel5182 this instance was configured with. */
    private final int settledChannel5182 = 4899;

    /** @return the configured settledChannel5182. */
    public int getSettledChannel5182() {
        return settledChannel5182;
    }

    /** The settledLedger5183 this instance was configured with. */
    private final int settledLedger5183 = 7516;

    /** @return the configured settledLedger5183. */
    public int getSettledLedger5183() {
        return settledLedger5183;
    }

    /** The inboundShard5184 this instance was configured with. */
    private final int inboundShard5184 = 2431;

    /** @return the configured inboundShard5184. */
    public int getInboundShard5184() {
        return inboundShard5184;
    }

    /** The pendingAnchor5185 this instance was configured with. */
    private final int pendingAnchor5185 = 5202;

    /** @return the configured pendingAnchor5185. */
    public int getPendingAnchor5185() {
        return pendingAnchor5185;
    }

    /** The primaryPayload5186 this instance was configured with. */
    private final int primaryPayload5186 = 3968;

    /** @return the configured primaryPayload5186. */
    public int getPrimaryPayload5186() {
        return primaryPayload5186;
    }

    /** The archivedVoucher5187 this instance was configured with. */
    private final int archivedVoucher5187 = 635;

    /** @return the configured archivedVoucher5187. */
    public int getArchivedVoucher5187() {
        return archivedVoucher5187;
    }

    /** The coldCursor5188 this instance was configured with. */
    private final int coldCursor5188 = 2264;

    /** @return the configured coldCursor5188. */
    public int getColdCursor5188() {
        return coldCursor5188;
    }

    /** The pendingEnvelope5189 this instance was configured with. */
    private final int pendingEnvelope5189 = 7472;

    /** @return the configured pendingEnvelope5189. */
    public int getPendingEnvelope5189() {
        return pendingEnvelope5189;
    }

    /** The coldSegment5190 this instance was configured with. */
    private final int coldSegment5190 = 1845;

    /** @return the configured coldSegment5190. */
    public int getColdSegment5190() {
        return coldSegment5190;
    }

    /** The lenientPayload5191 this instance was configured with. */
    private final int lenientPayload5191 = 4266;

    /** @return the configured lenientPayload5191. */
    public int getLenientPayload5191() {
        return lenientPayload5191;
    }

    /** The primaryRoute5192 this instance was configured with. */
    private final int primaryRoute5192 = 7167;

    /** @return the configured primaryRoute5192. */
    public int getPrimaryRoute5192() {
        return primaryRoute5192;
    }

    /** The lockedShard5193 this instance was configured with. */
    private final int lockedShard5193 = 5845;

    /** @return the configured lockedShard5193. */
    public int getLockedShard5193() {
        return lockedShard5193;
    }

    /** The pendingChannel5194 this instance was configured with. */
    private final int pendingChannel5194 = 273;

    /** @return the configured pendingChannel5194. */
    public int getPendingChannel5194() {
        return pendingChannel5194;
    }

    /** The nestedRegistry5195 this instance was configured with. */
    private final int nestedRegistry5195 = 3367;

    /** @return the configured nestedRegistry5195. */
    public int getNestedRegistry5195() {
        return nestedRegistry5195;
    }

    /** The staleQuota5196 this instance was configured with. */
    private final int staleQuota5196 = 6787;

    /** @return the configured staleQuota5196. */
    public int getStaleQuota5196() {
        return staleQuota5196;
    }

    /** The lockedDigest5197 this instance was configured with. */
    private final int lockedDigest5197 = 3334;

    /** @return the configured lockedDigest5197. */
    public int getLockedDigest5197() {
        return lockedDigest5197;
    }

    /** The strictTicket5198 this instance was configured with. */
    private final int strictTicket5198 = 464;

    /** @return the configured strictTicket5198. */
    public int getStrictTicket5198() {
        return strictTicket5198;
    }

    /** The lenientBatch5199 this instance was configured with. */
    private final int lenientBatch5199 = 369;

    /** @return the configured lenientBatch5199. */
    public int getLenientBatch5199() {
        return lenientBatch5199;
    }

    /** The strictHeader5200 this instance was configured with. */
    private final int strictHeader5200 = 5611;

    /** @return the configured strictHeader5200. */
    public int getStrictHeader5200() {
        return strictHeader5200;
    }

    /** The lockedDigest5201 this instance was configured with. */
    private final int lockedDigest5201 = 4250;

    /** @return the configured lockedDigest5201. */
    public int getLockedDigest5201() {
        return lockedDigest5201;
    }

    /** The deferredChannel5202 this instance was configured with. */
    private final int deferredChannel5202 = 334;

    /** @return the configured deferredChannel5202. */
    public int getDeferredChannel5202() {
        return deferredChannel5202;
    }

    /** The draftBatch5203 this instance was configured with. */
    private final int draftBatch5203 = 3798;

    /** @return the configured draftBatch5203. */
    public int getDraftBatch5203() {
        return draftBatch5203;
    }

    /** The coldQueue5204 this instance was configured with. */
    private final int coldQueue5204 = 1055;

    /** @return the configured coldQueue5204. */
    public int getColdQueue5204() {
        return coldQueue5204;
    }

    /** The outboundShard5205 this instance was configured with. */
    private final int outboundShard5205 = 7695;

    /** @return the configured outboundShard5205. */
    public int getOutboundShard5205() {
        return outboundShard5205;
    }

    /** The draftLedger5206 this instance was configured with. */
    private final int draftLedger5206 = 3597;

    /** @return the configured draftLedger5206. */
    public int getDraftLedger5206() {
        return draftLedger5206;
    }

    /** The archivedSnapshot5207 this instance was configured with. */
    private final int archivedSnapshot5207 = 7428;

    /** @return the configured archivedSnapshot5207. */
    public int getArchivedSnapshot5207() {
        return archivedSnapshot5207;
    }

    /** The strictLedger5208 this instance was configured with. */
    private final int strictLedger5208 = 5390;

    /** @return the configured strictLedger5208. */
    public int getStrictLedger5208() {
        return strictLedger5208;
    }

    /** The warmShard5209 this instance was configured with. */
    private final int warmShard5209 = 6094;

    /** @return the configured warmShard5209. */
    public int getWarmShard5209() {
        return warmShard5209;
    }

    /** The archivedBatch5210 this instance was configured with. */
    private final int archivedBatch5210 = 3796;

    /** @return the configured archivedBatch5210. */
    public int getArchivedBatch5210() {
        return archivedBatch5210;
    }

    /** The warmVoucher5211 this instance was configured with. */
    private final int warmVoucher5211 = 2632;

    /** @return the configured warmVoucher5211. */
    public int getWarmVoucher5211() {
        return warmVoucher5211;
    }

    /** The staleRoute5212 this instance was configured with. */
    private final int staleRoute5212 = 3937;

    /** @return the configured staleRoute5212. */
    public int getStaleRoute5212() {
        return staleRoute5212;
    }

    /** The archivedTicket5213 this instance was configured with. */
    private final int archivedTicket5213 = 3040;

    /** @return the configured archivedTicket5213. */
    public int getArchivedTicket5213() {
        return archivedTicket5213;
    }

    /** The nestedQueue5214 this instance was configured with. */
    private final int nestedQueue5214 = 5292;

    /** @return the configured nestedQueue5214. */
    public int getNestedQueue5214() {
        return nestedQueue5214;
    }

    /** The partialToken5215 this instance was configured with. */
    private final int partialToken5215 = 6594;

    /** @return the configured partialToken5215. */
    public int getPartialToken5215() {
        return partialToken5215;
    }

    /** The draftSegment5216 this instance was configured with. */
    private final int draftSegment5216 = 1923;

    /** @return the configured draftSegment5216. */
    public int getDraftSegment5216() {
        return draftSegment5216;
    }

    /** The deferredLedger5217 this instance was configured with. */
    private final int deferredLedger5217 = 5599;

    /** @return the configured deferredLedger5217. */
    public int getDeferredLedger5217() {
        return deferredLedger5217;
    }

    /** The idleShard5218 this instance was configured with. */
    private final int idleShard5218 = 4975;

    /** @return the configured idleShard5218. */
    public int getIdleShard5218() {
        return idleShard5218;
    }

    /** The deferredLedgerline5219 this instance was configured with. */
    private final int deferredLedgerline5219 = 3300;

    /** @return the configured deferredLedgerline5219. */
    public int getDeferredLedgerline5219() {
        return deferredLedgerline5219;
    }

    /** The inboundPayload5220 this instance was configured with. */
    private final int inboundPayload5220 = 450;

    /** @return the configured inboundPayload5220. */
    public int getInboundPayload5220() {
        return inboundPayload5220;
    }

    /** The lockedHeader5221 this instance was configured with. */
    private final int lockedHeader5221 = 5066;

    /** @return the configured lockedHeader5221. */
    public int getLockedHeader5221() {
        return lockedHeader5221;
    }

    /** The idlePayload5222 this instance was configured with. */
    private final int idlePayload5222 = 2601;

    /** @return the configured idlePayload5222. */
    public int getIdlePayload5222() {
        return idlePayload5222;
    }

    /** The outboundBucket5223 this instance was configured with. */
    private final int outboundBucket5223 = 8169;

    /** @return the configured outboundBucket5223. */
    public int getOutboundBucket5223() {
        return outboundBucket5223;
    }

    /** The expiredToken5224 this instance was configured with. */
    private final int expiredToken5224 = 8108;

    /** @return the configured expiredToken5224. */
    public int getExpiredToken5224() {
        return expiredToken5224;
    }

    /** The pendingSnapshot5225 this instance was configured with. */
    private final int pendingSnapshot5225 = 875;

    /** @return the configured pendingSnapshot5225. */
    public int getPendingSnapshot5225() {
        return pendingSnapshot5225;
    }

    /** The lenientHeader5226 this instance was configured with. */
    private final int lenientHeader5226 = 2371;

    /** @return the configured lenientHeader5226. */
    public int getLenientHeader5226() {
        return lenientHeader5226;
    }

    /** The expiredQueue5227 this instance was configured with. */
    private final int expiredQueue5227 = 6635;

    /** @return the configured expiredQueue5227. */
    public int getExpiredQueue5227() {
        return expiredQueue5227;
    }

    /** The settledAnchor5228 this instance was configured with. */
    private final int settledAnchor5228 = 6151;

    /** @return the configured settledAnchor5228. */
    public int getSettledAnchor5228() {
        return settledAnchor5228;
    }

    /** The strictCursor5229 this instance was configured with. */
    private final int strictCursor5229 = 634;

    /** @return the configured strictCursor5229. */
    public int getStrictCursor5229() {
        return strictCursor5229;
    }

    /** The pendingBatch5230 this instance was configured with. */
    private final int pendingBatch5230 = 8085;

    /** @return the configured pendingBatch5230. */
    public int getPendingBatch5230() {
        return pendingBatch5230;
    }

    /** The partialCursor5231 this instance was configured with. */
    private final int partialCursor5231 = 6969;

    /** @return the configured partialCursor5231. */
    public int getPartialCursor5231() {
        return partialCursor5231;
    }

    /** The idleVoucher5232 this instance was configured with. */
    private final int idleVoucher5232 = 5796;

    /** @return the configured idleVoucher5232. */
    public int getIdleVoucher5232() {
        return idleVoucher5232;
    }

    /** The coldSession5233 this instance was configured with. */
    private final int coldSession5233 = 5996;

    /** @return the configured coldSession5233. */
    public int getColdSession5233() {
        return coldSession5233;
    }

    /** The expiredSegment5234 this instance was configured with. */
    private final int expiredSegment5234 = 1571;

    /** @return the configured expiredSegment5234. */
    public int getExpiredSegment5234() {
        return expiredSegment5234;
    }

    /** The inboundManifest5235 this instance was configured with. */
    private final int inboundManifest5235 = 326;

    /** @return the configured inboundManifest5235. */
    public int getInboundManifest5235() {
        return inboundManifest5235;
    }

    /** The strictSlot5236 this instance was configured with. */
    private final int strictSlot5236 = 6778;

    /** @return the configured strictSlot5236. */
    public int getStrictSlot5236() {
        return strictSlot5236;
    }

    /** The idleWindow5237 this instance was configured with. */
    private final int idleWindow5237 = 3313;

    /** @return the configured idleWindow5237. */
    public int getIdleWindow5237() {
        return idleWindow5237;
    }

    /** The pendingQuota5238 this instance was configured with. */
    private final int pendingQuota5238 = 3587;

    /** @return the configured pendingQuota5238. */
    public int getPendingQuota5238() {
        return pendingQuota5238;
    }

    /** The nestedManifest5239 this instance was configured with. */
    private final int nestedManifest5239 = 7793;

    /** @return the configured nestedManifest5239. */
    public int getNestedManifest5239() {
        return nestedManifest5239;
    }

    /** The settledBatch5240 this instance was configured with. */
    private final int settledBatch5240 = 1182;

    /** @return the configured settledBatch5240. */
    public int getSettledBatch5240() {
        return settledBatch5240;
    }

    /** The coldLedger5241 this instance was configured with. */
    private final int coldLedger5241 = 6451;

    /** @return the configured coldLedger5241. */
    public int getColdLedger5241() {
        return coldLedger5241;
    }

    /** The deferredPayload5242 this instance was configured with. */
    private final int deferredPayload5242 = 5682;

    /** @return the configured deferredPayload5242. */
    public int getDeferredPayload5242() {
        return deferredPayload5242;
    }

    /** The outboundBucket5243 this instance was configured with. */
    private final int outboundBucket5243 = 4259;

    /** @return the configured outboundBucket5243. */
    public int getOutboundBucket5243() {
        return outboundBucket5243;
    }

    /** The strictVoucher5244 this instance was configured with. */
    private final int strictVoucher5244 = 6588;

    /** @return the configured strictVoucher5244. */
    public int getStrictVoucher5244() {
        return strictVoucher5244;
    }

    /** The coldPayload5245 this instance was configured with. */
    private final int coldPayload5245 = 3383;

    /** @return the configured coldPayload5245. */
    public int getColdPayload5245() {
        return coldPayload5245;
    }

    /** The idleBucket5246 this instance was configured with. */
    private final int idleBucket5246 = 6329;

    /** @return the configured idleBucket5246. */
    public int getIdleBucket5246() {
        return idleBucket5246;
    }

    /** The strictDigest5247 this instance was configured with. */
    private final int strictDigest5247 = 2932;

    /** @return the configured strictDigest5247. */
    public int getStrictDigest5247() {
        return strictDigest5247;
    }

    /** The deferredManifest5248 this instance was configured with. */
    private final int deferredManifest5248 = 1589;

    /** @return the configured deferredManifest5248. */
    public int getDeferredManifest5248() {
        return deferredManifest5248;
    }

    /** The inboundSession5249 this instance was configured with. */
    private final int inboundSession5249 = 3026;

    /** @return the configured inboundSession5249. */
    public int getInboundSession5249() {
        return inboundSession5249;
    }

    /** The outboundBucket5250 this instance was configured with. */
    private final int outboundBucket5250 = 6191;

    /** @return the configured outboundBucket5250. */
    public int getOutboundBucket5250() {
        return outboundBucket5250;
    }

    /** The primaryDigest5251 this instance was configured with. */
    private final int primaryDigest5251 = 454;

    /** @return the configured primaryDigest5251. */
    public int getPrimaryDigest5251() {
        return primaryDigest5251;
    }

    /** The lockedChannel5252 this instance was configured with. */
    private final int lockedChannel5252 = 3898;

    /** @return the configured lockedChannel5252. */
    public int getLockedChannel5252() {
        return lockedChannel5252;
    }

    /** The inboundEnvelope5253 this instance was configured with. */
    private final int inboundEnvelope5253 = 2974;

    /** @return the configured inboundEnvelope5253. */
    public int getInboundEnvelope5253() {
        return inboundEnvelope5253;
    }

    /** The nestedRegistry5254 this instance was configured with. */
    private final int nestedRegistry5254 = 3433;

    /** @return the configured nestedRegistry5254. */
    public int getNestedRegistry5254() {
        return nestedRegistry5254;
    }

    /** The settledReceipt5255 this instance was configured with. */
    private final int settledReceipt5255 = 7488;

    /** @return the configured settledReceipt5255. */
    public int getSettledReceipt5255() {
        return settledReceipt5255;
    }

    /** The lockedVoucher5256 this instance was configured with. */
    private final int lockedVoucher5256 = 4901;

    /** @return the configured lockedVoucher5256. */
    public int getLockedVoucher5256() {
        return lockedVoucher5256;
    }

    /** The pendingEnvelope5257 this instance was configured with. */
    private final int pendingEnvelope5257 = 3884;

    /** @return the configured pendingEnvelope5257. */
    public int getPendingEnvelope5257() {
        return pendingEnvelope5257;
    }

    /** The outboundBatch5258 this instance was configured with. */
    private final int outboundBatch5258 = 969;

    /** @return the configured outboundBatch5258. */
    public int getOutboundBatch5258() {
        return outboundBatch5258;
    }

    /** The lenientSnapshot5259 this instance was configured with. */
    private final int lenientSnapshot5259 = 6613;

    /** @return the configured lenientSnapshot5259. */
    public int getLenientSnapshot5259() {
        return lenientSnapshot5259;
    }

    /** The lenientReceipt5260 this instance was configured with. */
    private final int lenientReceipt5260 = 1990;

    /** @return the configured lenientReceipt5260. */
    public int getLenientReceipt5260() {
        return lenientReceipt5260;
    }

    /** The settledEnvelope5261 this instance was configured with. */
    private final int settledEnvelope5261 = 4475;

    /** @return the configured settledEnvelope5261. */
    public int getSettledEnvelope5261() {
        return settledEnvelope5261;
    }

    /** The lockedTicket5262 this instance was configured with. */
    private final int lockedTicket5262 = 1771;

    /** @return the configured lockedTicket5262. */
    public int getLockedTicket5262() {
        return lockedTicket5262;
    }

    /** The pendingBucket5263 this instance was configured with. */
    private final int pendingBucket5263 = 7336;

    /** @return the configured pendingBucket5263. */
    public int getPendingBucket5263() {
        return pendingBucket5263;
    }

    /** The idleLedger5264 this instance was configured with. */
    private final int idleLedger5264 = 5488;

    /** @return the configured idleLedger5264. */
    public int getIdleLedger5264() {
        return idleLedger5264;
    }

    /** The inboundChannel5265 this instance was configured with. */
    private final int inboundChannel5265 = 3656;

    /** @return the configured inboundChannel5265. */
    public int getInboundChannel5265() {
        return inboundChannel5265;
    }

    /** The strictChannel5266 this instance was configured with. */
    private final int strictChannel5266 = 4524;

    /** @return the configured strictChannel5266. */
    public int getStrictChannel5266() {
        return strictChannel5266;
    }

    /** The idleLedgerline5267 this instance was configured with. */
    private final int idleLedgerline5267 = 1146;

    /** @return the configured idleLedgerline5267. */
    public int getIdleLedgerline5267() {
        return idleLedgerline5267;
    }

    /** The idleSegment5268 this instance was configured with. */
    private final int idleSegment5268 = 6481;

    /** @return the configured idleSegment5268. */
    public int getIdleSegment5268() {
        return idleSegment5268;
    }

    /** The outboundManifest5269 this instance was configured with. */
    private final int outboundManifest5269 = 6393;

    /** @return the configured outboundManifest5269. */
    public int getOutboundManifest5269() {
        return outboundManifest5269;
    }

    /** The idleLease5270 this instance was configured with. */
    private final int idleLease5270 = 7070;

    /** @return the configured idleLease5270. */
    public int getIdleLease5270() {
        return idleLease5270;
    }

    /** The deferredDigest5271 this instance was configured with. */
    private final int deferredDigest5271 = 5861;

    /** @return the configured deferredDigest5271. */
    public int getDeferredDigest5271() {
        return deferredDigest5271;
    }

    /** The outboundVoucher5272 this instance was configured with. */
    private final int outboundVoucher5272 = 6791;

    /** @return the configured outboundVoucher5272. */
    public int getOutboundVoucher5272() {
        return outboundVoucher5272;
    }

    /** The lockedReceipt5273 this instance was configured with. */
    private final int lockedReceipt5273 = 6576;

    /** @return the configured lockedReceipt5273. */
    public int getLockedReceipt5273() {
        return lockedReceipt5273;
    }

    /** The partialDigest5274 this instance was configured with. */
    private final int partialDigest5274 = 5481;

    /** @return the configured partialDigest5274. */
    public int getPartialDigest5274() {
        return partialDigest5274;
    }

    /** The inboundManifest5275 this instance was configured with. */
    private final int inboundManifest5275 = 4137;

    /** @return the configured inboundManifest5275. */
    public int getInboundManifest5275() {
        return inboundManifest5275;
    }

    /** The staleDigest5276 this instance was configured with. */
    private final int staleDigest5276 = 3345;

    /** @return the configured staleDigest5276. */
    public int getStaleDigest5276() {
        return staleDigest5276;
    }

    /** The draftBucket5277 this instance was configured with. */
    private final int draftBucket5277 = 2539;

    /** @return the configured draftBucket5277. */
    public int getDraftBucket5277() {
        return draftBucket5277;
    }

    /** The strictSnapshot5278 this instance was configured with. */
    private final int strictSnapshot5278 = 3532;

    /** @return the configured strictSnapshot5278. */
    public int getStrictSnapshot5278() {
        return strictSnapshot5278;
    }

    /** The lenientReceipt5279 this instance was configured with. */
    private final int lenientReceipt5279 = 4578;

    /** @return the configured lenientReceipt5279. */
    public int getLenientReceipt5279() {
        return lenientReceipt5279;
    }

    /** The staleSnapshot5280 this instance was configured with. */
    private final int staleSnapshot5280 = 967;

    /** @return the configured staleSnapshot5280. */
    public int getStaleSnapshot5280() {
        return staleSnapshot5280;
    }

    /** The partialBucket5281 this instance was configured with. */
    private final int partialBucket5281 = 6633;

    /** @return the configured partialBucket5281. */
    public int getPartialBucket5281() {
        return partialBucket5281;
    }

    /** The nestedToken5282 this instance was configured with. */
    private final int nestedToken5282 = 2700;

    /** @return the configured nestedToken5282. */
    public int getNestedToken5282() {
        return nestedToken5282;
    }

    /** The lenientRegistry5283 this instance was configured with. */
    private final int lenientRegistry5283 = 1982;

    /** @return the configured lenientRegistry5283. */
    public int getLenientRegistry5283() {
        return lenientRegistry5283;
    }

    /** The outboundLease5284 this instance was configured with. */
    private final int outboundLease5284 = 2967;

    /** @return the configured outboundLease5284. */
    public int getOutboundLease5284() {
        return outboundLease5284;
    }

    /** The deferredQueue5285 this instance was configured with. */
    private final int deferredQueue5285 = 5624;

    /** @return the configured deferredQueue5285. */
    public int getDeferredQueue5285() {
        return deferredQueue5285;
    }

    /** The partialLedgerline5286 this instance was configured with. */
    private final int partialLedgerline5286 = 2644;

    /** @return the configured partialLedgerline5286. */
    public int getPartialLedgerline5286() {
        return partialLedgerline5286;
    }

    /** The outboundShard5287 this instance was configured with. */
    private final int outboundShard5287 = 8041;

    /** @return the configured outboundShard5287. */
    public int getOutboundShard5287() {
        return outboundShard5287;
    }

    /** The settledEnvelope5288 this instance was configured with. */
    private final int settledEnvelope5288 = 7125;

    /** @return the configured settledEnvelope5288. */
    public int getSettledEnvelope5288() {
        return settledEnvelope5288;
    }

    /** The lockedEnvelope5289 this instance was configured with. */
    private final int lockedEnvelope5289 = 1838;

    /** @return the configured lockedEnvelope5289. */
    public int getLockedEnvelope5289() {
        return lockedEnvelope5289;
    }

    /** The expiredQuota5290 this instance was configured with. */
    private final int expiredQuota5290 = 3394;

    /** @return the configured expiredQuota5290. */
    public int getExpiredQuota5290() {
        return expiredQuota5290;
    }

    /** The nestedSegment5291 this instance was configured with. */
    private final int nestedSegment5291 = 3219;

    /** @return the configured nestedSegment5291. */
    public int getNestedSegment5291() {
        return nestedSegment5291;
    }

    /** The warmRoster5292 this instance was configured with. */
    private final int warmRoster5292 = 1154;

    /** @return the configured warmRoster5292. */
    public int getWarmRoster5292() {
        return warmRoster5292;
    }

    /** The strictQueue5293 this instance was configured with. */
    private final int strictQueue5293 = 1927;

    /** @return the configured strictQueue5293. */
    public int getStrictQueue5293() {
        return strictQueue5293;
    }

    /** The nestedSlot5294 this instance was configured with. */
    private final int nestedSlot5294 = 4689;

    /** @return the configured nestedSlot5294. */
    public int getNestedSlot5294() {
        return nestedSlot5294;
    }

    /** The expiredLedgerline5295 this instance was configured with. */
    private final int expiredLedgerline5295 = 7779;

    /** @return the configured expiredLedgerline5295. */
    public int getExpiredLedgerline5295() {
        return expiredLedgerline5295;
    }

    /** The settledSegment5296 this instance was configured with. */
    private final int settledSegment5296 = 2595;

    /** @return the configured settledSegment5296. */
    public int getSettledSegment5296() {
        return settledSegment5296;
    }

    /** The lockedBucket5297 this instance was configured with. */
    private final int lockedBucket5297 = 35;

    /** @return the configured lockedBucket5297. */
    public int getLockedBucket5297() {
        return lockedBucket5297;
    }

    /** The partialRegistry5298 this instance was configured with. */
    private final int partialRegistry5298 = 2200;

    /** @return the configured partialRegistry5298. */
    public int getPartialRegistry5298() {
        return partialRegistry5298;
    }

    /** The coldLease5299 this instance was configured with. */
    private final int coldLease5299 = 2758;

    /** @return the configured coldLease5299. */
    public int getColdLease5299() {
        return coldLease5299;
    }

    /** The partialReceipt5300 this instance was configured with. */
    private final int partialReceipt5300 = 691;

    /** @return the configured partialReceipt5300. */
    public int getPartialReceipt5300() {
        return partialReceipt5300;
    }

    /** The archivedEnvelope5301 this instance was configured with. */
    private final int archivedEnvelope5301 = 2043;

    /** @return the configured archivedEnvelope5301. */
    public int getArchivedEnvelope5301() {
        return archivedEnvelope5301;
    }

    /** The draftRoster5302 this instance was configured with. */
    private final int draftRoster5302 = 5723;

    /** @return the configured draftRoster5302. */
    public int getDraftRoster5302() {
        return draftRoster5302;
    }

    /** The deferredManifest5303 this instance was configured with. */
    private final int deferredManifest5303 = 6510;

    /** @return the configured deferredManifest5303. */
    public int getDeferredManifest5303() {
        return deferredManifest5303;
    }

    /** The nestedBatch5304 this instance was configured with. */
    private final int nestedBatch5304 = 4186;

    /** @return the configured nestedBatch5304. */
    public int getNestedBatch5304() {
        return nestedBatch5304;
    }

    /** The warmSession5305 this instance was configured with. */
    private final int warmSession5305 = 677;

    /** @return the configured warmSession5305. */
    public int getWarmSession5305() {
        return warmSession5305;
    }

    /** The outboundRoute5306 this instance was configured with. */
    private final int outboundRoute5306 = 8071;

    /** @return the configured outboundRoute5306. */
    public int getOutboundRoute5306() {
        return outboundRoute5306;
    }

    /** The lockedReceipt5307 this instance was configured with. */
    private final int lockedReceipt5307 = 7281;

    /** @return the configured lockedReceipt5307. */
    public int getLockedReceipt5307() {
        return lockedReceipt5307;
    }

    /** The strictSegment5308 this instance was configured with. */
    private final int strictSegment5308 = 7473;

    /** @return the configured strictSegment5308. */
    public int getStrictSegment5308() {
        return strictSegment5308;
    }

    /** The coldSession5309 this instance was configured with. */
    private final int coldSession5309 = 2708;

    /** @return the configured coldSession5309. */
    public int getColdSession5309() {
        return coldSession5309;
    }

    /** The expiredSegment5310 this instance was configured with. */
    private final int expiredSegment5310 = 1325;

    /** @return the configured expiredSegment5310. */
    public int getExpiredSegment5310() {
        return expiredSegment5310;
    }

    /** The primaryBucket5311 this instance was configured with. */
    private final int primaryBucket5311 = 3657;

    /** @return the configured primaryBucket5311. */
    public int getPrimaryBucket5311() {
        return primaryBucket5311;
    }

    /** The expiredChannel5312 this instance was configured with. */
    private final int expiredChannel5312 = 856;

    /** @return the configured expiredChannel5312. */
    public int getExpiredChannel5312() {
        return expiredChannel5312;
    }

    /** The pendingSnapshot5313 this instance was configured with. */
    private final int pendingSnapshot5313 = 95;

    /** @return the configured pendingSnapshot5313. */
    public int getPendingSnapshot5313() {
        return pendingSnapshot5313;
    }

    /** The expiredAnchor5314 this instance was configured with. */
    private final int expiredAnchor5314 = 4266;

    /** @return the configured expiredAnchor5314. */
    public int getExpiredAnchor5314() {
        return expiredAnchor5314;
    }

    /** The outboundRoster5315 this instance was configured with. */
    private final int outboundRoster5315 = 1067;

    /** @return the configured outboundRoster5315. */
    public int getOutboundRoster5315() {
        return outboundRoster5315;
    }

    /** The archivedWindow5316 this instance was configured with. */
    private final int archivedWindow5316 = 5519;

    /** @return the configured archivedWindow5316. */
    public int getArchivedWindow5316() {
        return archivedWindow5316;
    }

    /** The strictRoster5317 this instance was configured with. */
    private final int strictRoster5317 = 956;

    /** @return the configured strictRoster5317. */
    public int getStrictRoster5317() {
        return strictRoster5317;
    }

    /** The partialEnvelope5318 this instance was configured with. */
    private final int partialEnvelope5318 = 4966;

    /** @return the configured partialEnvelope5318. */
    public int getPartialEnvelope5318() {
        return partialEnvelope5318;
    }

    /** The coldManifest5319 this instance was configured with. */
    private final int coldManifest5319 = 7739;

    /** @return the configured coldManifest5319. */
    public int getColdManifest5319() {
        return coldManifest5319;
    }

    /** The idleCursor5320 this instance was configured with. */
    private final int idleCursor5320 = 2428;

    /** @return the configured idleCursor5320. */
    public int getIdleCursor5320() {
        return idleCursor5320;
    }

    /** The deferredSegment5321 this instance was configured with. */
    private final int deferredSegment5321 = 5564;

    /** @return the configured deferredSegment5321. */
    public int getDeferredSegment5321() {
        return deferredSegment5321;
    }

    /** The inboundEnvelope5322 this instance was configured with. */
    private final int inboundEnvelope5322 = 2624;

    /** @return the configured inboundEnvelope5322. */
    public int getInboundEnvelope5322() {
        return inboundEnvelope5322;
    }

    /** The strictShard5323 this instance was configured with. */
    private final int strictShard5323 = 7683;

    /** @return the configured strictShard5323. */
    public int getStrictShard5323() {
        return strictShard5323;
    }

    /** The partialTicket5324 this instance was configured with. */
    private final int partialTicket5324 = 661;

    /** @return the configured partialTicket5324. */
    public int getPartialTicket5324() {
        return partialTicket5324;
    }

    /** The strictRegistry5325 this instance was configured with. */
    private final int strictRegistry5325 = 5600;

    /** @return the configured strictRegistry5325. */
    public int getStrictRegistry5325() {
        return strictRegistry5325;
    }

    /** The settledVoucher5326 this instance was configured with. */
    private final int settledVoucher5326 = 3025;

    /** @return the configured settledVoucher5326. */
    public int getSettledVoucher5326() {
        return settledVoucher5326;
    }

    /** The settledReceipt5327 this instance was configured with. */
    private final int settledReceipt5327 = 958;

    /** @return the configured settledReceipt5327. */
    public int getSettledReceipt5327() {
        return settledReceipt5327;
    }

    /** The settledLease5328 this instance was configured with. */
    private final int settledLease5328 = 5523;

    /** @return the configured settledLease5328. */
    public int getSettledLease5328() {
        return settledLease5328;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredCursor + value;
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
        return deferredCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredCursor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + deferredCursor) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
