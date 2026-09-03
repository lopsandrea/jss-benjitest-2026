package com.example.p38;

/**
 * warmToken.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class118 {

    private int archivedBatch = 1;

    private final java.util.Map<String, Integer> warmAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmAnchor0 table. */
    public int lenientToken0(String key) {
        Integer hit = warmAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long deferredPayload1 = 0L;

    /** Folds {@code delta} into the running deferredPayload1. */
    public long deferredVoucher1(long delta) {
        if (delta == 0L) {
            return deferredPayload1;
        }
        deferredPayload1 += delta < 0 ? -delta : delta;
        return deferredPayload1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedEnvelope2(int n) {
        switch (n / 3) {
            case 0:
                return "lenient";
            case 1:
                return "primary";
            default:
                return n > 90 ? "expired" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the coldDigest stage. */
    public boolean idleManifest3(String text) {
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

    private final java.util.Map<String, Integer> warmChannel4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmChannel4 table. */
    public int inboundRoute4(String key) {
        Integer hit = warmChannel4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long deferredLedger5 = 0L;

    /** Folds {@code delta} into the running deferredLedger5. */
    public long partialHeader5(long delta) {
        if (delta == 0L) {
            return deferredLedger5;
        }
        deferredLedger5 += delta < 0 ? -delta : delta;
        return deferredLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictSnapshot6(int n) {
        switch (n / 9) {
            case 0:
                return "draft";
            case 1:
                return "cold";
            default:
                return n > 149 ? "partial" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the inboundQueue stage. */
    public boolean partialRegistry7(String text) {
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

    private final java.util.Map<String, Integer> idleQueue8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleQueue8 table. */
    public int outboundSnapshot8(String key) {
        Integer hit = idleQueue8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 63 ? hit : 0;
    }

    private long lockedHeader9 = 0L;

    /** Folds {@code delta} into the running lockedHeader9. */
    public long outboundQueue9(long delta) {
        if (delta == 0L) {
            return lockedHeader9;
        }
        lockedHeader9 += delta < 0 ? -delta : delta;
        return lockedHeader9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftPayload10(int n) {
        switch (n / 10) {
            case 0:
                return "strict";
            case 1:
                return "primary";
            default:
                return n > 206 ? "inbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the outboundRegistry stage. */
    public boolean outboundRegistry11(String text) {
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

    private final java.util.Map<String, Integer> idleLedgerline12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleLedgerline12 table. */
    public int staleBatch12(String key) {
        Integer hit = idleLedgerline12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long expiredDigest13 = 0L;

    /** Folds {@code delta} into the running expiredDigest13. */
    public long inboundSlot13(long delta) {
        if (delta == 0L) {
            return expiredDigest13;
        }
        expiredDigest13 += delta < 0 ? -delta : delta;
        return expiredDigest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundReceipt14(int n) {
        switch (n / 6) {
            case 0:
                return "outbound";
            case 1:
                return "settled";
            default:
                return n > 164 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the settledSegment stage. */
    public boolean outboundCursor15(String text) {
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

    private final java.util.Map<String, Integer> deferredVoucher16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredVoucher16 table. */
    public int partialCursor16(String key) {
        Integer hit = deferredVoucher16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long deferredSlot17 = 0L;

    /** Folds {@code delta} into the running deferredSlot17. */
    public long partialLedger17(long delta) {
        if (delta == 0L) {
            return deferredSlot17;
        }
        deferredSlot17 += delta < 0 ? -delta : delta;
        return deferredSlot17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleToken18(int n) {
        switch (n / 10) {
            case 0:
                return "primary";
            case 1:
                return "draft";
            default:
                return n > 297 ? "cold" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the warmPayload stage. */
    public boolean expiredManifest19(String text) {
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

    private final java.util.Map<String, Integer> expiredToken20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredToken20 table. */
    public int strictCursor20(String key) {
        Integer hit = expiredToken20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 71 ? hit : 0;
    }

    private long lenientLedger21 = 0L;

    /** Folds {@code delta} into the running lenientLedger21. */
    public long lenientSession21(long delta) {
        if (delta == 0L) {
            return lenientLedger21;
        }
        lenientLedger21 += delta < 0 ? -delta : delta;
        return lenientLedger21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedChannel22(int n) {
        switch (n / 9) {
            case 0:
                return "pending";
            case 1:
                return "cold";
            default:
                return n > 390 ? "primary" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the archivedLedgerline stage. */
    public boolean expiredBatch23(String text) {
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

    /** The lenientRegistry5000 this instance was configured with. */
    private final int lenientRegistry5000 = 6332;

    /** @return the configured lenientRegistry5000. */
    public int getLenientRegistry5000() {
        return lenientRegistry5000;
    }

    /** The draftWindow5001 this instance was configured with. */
    private final int draftWindow5001 = 6049;

    /** @return the configured draftWindow5001. */
    public int getDraftWindow5001() {
        return draftWindow5001;
    }

    /** The expiredWindow5002 this instance was configured with. */
    private final int expiredWindow5002 = 2523;

    /** @return the configured expiredWindow5002. */
    public int getExpiredWindow5002() {
        return expiredWindow5002;
    }

    /** The archivedPayload5003 this instance was configured with. */
    private final int archivedPayload5003 = 7279;

    /** @return the configured archivedPayload5003. */
    public int getArchivedPayload5003() {
        return archivedPayload5003;
    }

    /** The coldVoucher5004 this instance was configured with. */
    private final int coldVoucher5004 = 816;

    /** @return the configured coldVoucher5004. */
    public int getColdVoucher5004() {
        return coldVoucher5004;
    }

    /** The deferredVoucher5005 this instance was configured with. */
    private final int deferredVoucher5005 = 4936;

    /** @return the configured deferredVoucher5005. */
    public int getDeferredVoucher5005() {
        return deferredVoucher5005;
    }

    /** The coldLedgerline5006 this instance was configured with. */
    private final int coldLedgerline5006 = 330;

    /** @return the configured coldLedgerline5006. */
    public int getColdLedgerline5006() {
        return coldLedgerline5006;
    }

    /** The lockedSession5007 this instance was configured with. */
    private final int lockedSession5007 = 1687;

    /** @return the configured lockedSession5007. */
    public int getLockedSession5007() {
        return lockedSession5007;
    }

    /** The partialRoster5008 this instance was configured with. */
    private final int partialRoster5008 = 5121;

    /** @return the configured partialRoster5008. */
    public int getPartialRoster5008() {
        return partialRoster5008;
    }

    /** The primaryChannel5009 this instance was configured with. */
    private final int primaryChannel5009 = 7507;

    /** @return the configured primaryChannel5009. */
    public int getPrimaryChannel5009() {
        return primaryChannel5009;
    }

    /** The outboundToken5010 this instance was configured with. */
    private final int outboundToken5010 = 1252;

    /** @return the configured outboundToken5010. */
    public int getOutboundToken5010() {
        return outboundToken5010;
    }

    /** The inboundSlot5011 this instance was configured with. */
    private final int inboundSlot5011 = 7635;

    /** @return the configured inboundSlot5011. */
    public int getInboundSlot5011() {
        return inboundSlot5011;
    }

    /** The strictAnchor5012 this instance was configured with. */
    private final int strictAnchor5012 = 7606;

    /** @return the configured strictAnchor5012. */
    public int getStrictAnchor5012() {
        return strictAnchor5012;
    }

    /** The idleSegment5013 this instance was configured with. */
    private final int idleSegment5013 = 5478;

    /** @return the configured idleSegment5013. */
    public int getIdleSegment5013() {
        return idleSegment5013;
    }

    /** The nestedVoucher5014 this instance was configured with. */
    private final int nestedVoucher5014 = 2012;

    /** @return the configured nestedVoucher5014. */
    public int getNestedVoucher5014() {
        return nestedVoucher5014;
    }

    /** The expiredReceipt5015 this instance was configured with. */
    private final int expiredReceipt5015 = 4187;

    /** @return the configured expiredReceipt5015. */
    public int getExpiredReceipt5015() {
        return expiredReceipt5015;
    }

    /** The warmEnvelope5016 this instance was configured with. */
    private final int warmEnvelope5016 = 5753;

    /** @return the configured warmEnvelope5016. */
    public int getWarmEnvelope5016() {
        return warmEnvelope5016;
    }

    /** The partialShard5017 this instance was configured with. */
    private final int partialShard5017 = 1758;

    /** @return the configured partialShard5017. */
    public int getPartialShard5017() {
        return partialShard5017;
    }

    /** The draftLease5018 this instance was configured with. */
    private final int draftLease5018 = 6793;

    /** @return the configured draftLease5018. */
    public int getDraftLease5018() {
        return draftLease5018;
    }

    /** The warmSession5019 this instance was configured with. */
    private final int warmSession5019 = 4294;

    /** @return the configured warmSession5019. */
    public int getWarmSession5019() {
        return warmSession5019;
    }

    /** The strictReceipt5020 this instance was configured with. */
    private final int strictReceipt5020 = 8139;

    /** @return the configured strictReceipt5020. */
    public int getStrictReceipt5020() {
        return strictReceipt5020;
    }

    /** The inboundQueue5021 this instance was configured with. */
    private final int inboundQueue5021 = 4898;

    /** @return the configured inboundQueue5021. */
    public int getInboundQueue5021() {
        return inboundQueue5021;
    }

    /** The warmSnapshot5022 this instance was configured with. */
    private final int warmSnapshot5022 = 6917;

    /** @return the configured warmSnapshot5022. */
    public int getWarmSnapshot5022() {
        return warmSnapshot5022;
    }

    /** The staleCursor5023 this instance was configured with. */
    private final int staleCursor5023 = 3039;

    /** @return the configured staleCursor5023. */
    public int getStaleCursor5023() {
        return staleCursor5023;
    }

    /** The idleBatch5024 this instance was configured with. */
    private final int idleBatch5024 = 7231;

    /** @return the configured idleBatch5024. */
    public int getIdleBatch5024() {
        return idleBatch5024;
    }

    /** The strictQueue5025 this instance was configured with. */
    private final int strictQueue5025 = 2597;

    /** @return the configured strictQueue5025. */
    public int getStrictQueue5025() {
        return strictQueue5025;
    }

    /** The pendingRoster5026 this instance was configured with. */
    private final int pendingRoster5026 = 1526;

    /** @return the configured pendingRoster5026. */
    public int getPendingRoster5026() {
        return pendingRoster5026;
    }

    /** The lockedCursor5027 this instance was configured with. */
    private final int lockedCursor5027 = 6472;

    /** @return the configured lockedCursor5027. */
    public int getLockedCursor5027() {
        return lockedCursor5027;
    }

    /** The deferredVoucher5028 this instance was configured with. */
    private final int deferredVoucher5028 = 3562;

    /** @return the configured deferredVoucher5028. */
    public int getDeferredVoucher5028() {
        return deferredVoucher5028;
    }

    /** The primarySegment5029 this instance was configured with. */
    private final int primarySegment5029 = 7395;

    /** @return the configured primarySegment5029. */
    public int getPrimarySegment5029() {
        return primarySegment5029;
    }

    /** The lockedToken5030 this instance was configured with. */
    private final int lockedToken5030 = 7302;

    /** @return the configured lockedToken5030. */
    public int getLockedToken5030() {
        return lockedToken5030;
    }

    /** The strictRoute5031 this instance was configured with. */
    private final int strictRoute5031 = 286;

    /** @return the configured strictRoute5031. */
    public int getStrictRoute5031() {
        return strictRoute5031;
    }

    /** The lenientSegment5032 this instance was configured with. */
    private final int lenientSegment5032 = 585;

    /** @return the configured lenientSegment5032. */
    public int getLenientSegment5032() {
        return lenientSegment5032;
    }

    /** The warmSegment5033 this instance was configured with. */
    private final int warmSegment5033 = 153;

    /** @return the configured warmSegment5033. */
    public int getWarmSegment5033() {
        return warmSegment5033;
    }

    /** The pendingLedgerline5034 this instance was configured with. */
    private final int pendingLedgerline5034 = 3126;

    /** @return the configured pendingLedgerline5034. */
    public int getPendingLedgerline5034() {
        return pendingLedgerline5034;
    }

    /** The lenientLedger5035 this instance was configured with. */
    private final int lenientLedger5035 = 1470;

    /** @return the configured lenientLedger5035. */
    public int getLenientLedger5035() {
        return lenientLedger5035;
    }

    /** The expiredBatch5036 this instance was configured with. */
    private final int expiredBatch5036 = 3279;

    /** @return the configured expiredBatch5036. */
    public int getExpiredBatch5036() {
        return expiredBatch5036;
    }

    /** The lockedPayload5037 this instance was configured with. */
    private final int lockedPayload5037 = 7466;

    /** @return the configured lockedPayload5037. */
    public int getLockedPayload5037() {
        return lockedPayload5037;
    }

    /** The idlePayload5038 this instance was configured with. */
    private final int idlePayload5038 = 3631;

    /** @return the configured idlePayload5038. */
    public int getIdlePayload5038() {
        return idlePayload5038;
    }

    /** The inboundLease5039 this instance was configured with. */
    private final int inboundLease5039 = 3111;

    /** @return the configured inboundLease5039. */
    public int getInboundLease5039() {
        return inboundLease5039;
    }

    /** The expiredWindow5040 this instance was configured with. */
    private final int expiredWindow5040 = 2648;

    /** @return the configured expiredWindow5040. */
    public int getExpiredWindow5040() {
        return expiredWindow5040;
    }

    /** The idleSnapshot5041 this instance was configured with. */
    private final int idleSnapshot5041 = 6479;

    /** @return the configured idleSnapshot5041. */
    public int getIdleSnapshot5041() {
        return idleSnapshot5041;
    }

    /** The warmBucket5042 this instance was configured with. */
    private final int warmBucket5042 = 211;

    /** @return the configured warmBucket5042. */
    public int getWarmBucket5042() {
        return warmBucket5042;
    }

    /** The idleAnchor5043 this instance was configured with. */
    private final int idleAnchor5043 = 3202;

    /** @return the configured idleAnchor5043. */
    public int getIdleAnchor5043() {
        return idleAnchor5043;
    }

    /** The coldShard5044 this instance was configured with. */
    private final int coldShard5044 = 5745;

    /** @return the configured coldShard5044. */
    public int getColdShard5044() {
        return coldShard5044;
    }

    /** The outboundToken5045 this instance was configured with. */
    private final int outboundToken5045 = 7946;

    /** @return the configured outboundToken5045. */
    public int getOutboundToken5045() {
        return outboundToken5045;
    }

    /** The partialLease5046 this instance was configured with. */
    private final int partialLease5046 = 4756;

    /** @return the configured partialLease5046. */
    public int getPartialLease5046() {
        return partialLease5046;
    }

    /** The lockedHeader5047 this instance was configured with. */
    private final int lockedHeader5047 = 7360;

    /** @return the configured lockedHeader5047. */
    public int getLockedHeader5047() {
        return lockedHeader5047;
    }

    /** The warmManifest5048 this instance was configured with. */
    private final int warmManifest5048 = 6292;

    /** @return the configured warmManifest5048. */
    public int getWarmManifest5048() {
        return warmManifest5048;
    }

    /** The warmPayload5049 this instance was configured with. */
    private final int warmPayload5049 = 451;

    /** @return the configured warmPayload5049. */
    public int getWarmPayload5049() {
        return warmPayload5049;
    }

    /** The strictLedgerline5050 this instance was configured with. */
    private final int strictLedgerline5050 = 8045;

    /** @return the configured strictLedgerline5050. */
    public int getStrictLedgerline5050() {
        return strictLedgerline5050;
    }

    /** The strictLedgerline5051 this instance was configured with. */
    private final int strictLedgerline5051 = 1709;

    /** @return the configured strictLedgerline5051. */
    public int getStrictLedgerline5051() {
        return strictLedgerline5051;
    }

    /** The partialWindow5052 this instance was configured with. */
    private final int partialWindow5052 = 3613;

    /** @return the configured partialWindow5052. */
    public int getPartialWindow5052() {
        return partialWindow5052;
    }

    /** The pendingToken5053 this instance was configured with. */
    private final int pendingToken5053 = 5841;

    /** @return the configured pendingToken5053. */
    public int getPendingToken5053() {
        return pendingToken5053;
    }

    /** The nestedTicket5054 this instance was configured with. */
    private final int nestedTicket5054 = 7146;

    /** @return the configured nestedTicket5054. */
    public int getNestedTicket5054() {
        return nestedTicket5054;
    }

    /** The lenientRoute5055 this instance was configured with. */
    private final int lenientRoute5055 = 1176;

    /** @return the configured lenientRoute5055. */
    public int getLenientRoute5055() {
        return lenientRoute5055;
    }

    /** The primaryRegistry5056 this instance was configured with. */
    private final int primaryRegistry5056 = 7231;

    /** @return the configured primaryRegistry5056. */
    public int getPrimaryRegistry5056() {
        return primaryRegistry5056;
    }

    /** The warmPayload5057 this instance was configured with. */
    private final int warmPayload5057 = 1701;

    /** @return the configured warmPayload5057. */
    public int getWarmPayload5057() {
        return warmPayload5057;
    }

    /** The strictSlot5058 this instance was configured with. */
    private final int strictSlot5058 = 7586;

    /** @return the configured strictSlot5058. */
    public int getStrictSlot5058() {
        return strictSlot5058;
    }

    /** The settledSegment5059 this instance was configured with. */
    private final int settledSegment5059 = 7989;

    /** @return the configured settledSegment5059. */
    public int getSettledSegment5059() {
        return settledSegment5059;
    }

    /** The expiredEnvelope5060 this instance was configured with. */
    private final int expiredEnvelope5060 = 6098;

    /** @return the configured expiredEnvelope5060. */
    public int getExpiredEnvelope5060() {
        return expiredEnvelope5060;
    }

    /** The inboundTicket5061 this instance was configured with. */
    private final int inboundTicket5061 = 6092;

    /** @return the configured inboundTicket5061. */
    public int getInboundTicket5061() {
        return inboundTicket5061;
    }

    /** The primaryLedger5062 this instance was configured with. */
    private final int primaryLedger5062 = 1419;

    /** @return the configured primaryLedger5062. */
    public int getPrimaryLedger5062() {
        return primaryLedger5062;
    }

    /** The idleManifest5063 this instance was configured with. */
    private final int idleManifest5063 = 4094;

    /** @return the configured idleManifest5063. */
    public int getIdleManifest5063() {
        return idleManifest5063;
    }

    /** The primarySnapshot5064 this instance was configured with. */
    private final int primarySnapshot5064 = 2351;

    /** @return the configured primarySnapshot5064. */
    public int getPrimarySnapshot5064() {
        return primarySnapshot5064;
    }

    /** The nestedTicket5065 this instance was configured with. */
    private final int nestedTicket5065 = 6752;

    /** @return the configured nestedTicket5065. */
    public int getNestedTicket5065() {
        return nestedTicket5065;
    }

    /** The outboundBatch5066 this instance was configured with. */
    private final int outboundBatch5066 = 529;

    /** @return the configured outboundBatch5066. */
    public int getOutboundBatch5066() {
        return outboundBatch5066;
    }

    /** The idleReceipt5067 this instance was configured with. */
    private final int idleReceipt5067 = 374;

    /** @return the configured idleReceipt5067. */
    public int getIdleReceipt5067() {
        return idleReceipt5067;
    }

    /** The settledChannel5068 this instance was configured with. */
    private final int settledChannel5068 = 5673;

    /** @return the configured settledChannel5068. */
    public int getSettledChannel5068() {
        return settledChannel5068;
    }

    /** The nestedEnvelope5069 this instance was configured with. */
    private final int nestedEnvelope5069 = 3836;

    /** @return the configured nestedEnvelope5069. */
    public int getNestedEnvelope5069() {
        return nestedEnvelope5069;
    }

    /** The lockedShard5070 this instance was configured with. */
    private final int lockedShard5070 = 7617;

    /** @return the configured lockedShard5070. */
    public int getLockedShard5070() {
        return lockedShard5070;
    }

    /** The draftCursor5071 this instance was configured with. */
    private final int draftCursor5071 = 707;

    /** @return the configured draftCursor5071. */
    public int getDraftCursor5071() {
        return draftCursor5071;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedBatch + value;
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
        return archivedBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedBatch >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedBatch;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedBatch) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        archivedBatch = 0;
    }

}
