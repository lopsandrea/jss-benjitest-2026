package com.example.p57;

/**
 * archivedSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class057 {

    private int partialQueue = 1;

    private final java.util.Map<String, Integer> strictRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictRegistry0 table. */
    public int draftBatch0(String key) {
        Integer hit = strictRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long partialLedgerline1 = 0L;

    /** Folds {@code delta} into the running partialLedgerline1. */
    public long pendingQueue1(long delta) {
        if (delta == 0L) {
            return partialLedgerline1;
        }
        partialLedgerline1 += delta < 0 ? -delta : delta;
        return partialLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftChannel2(int n) {
        switch (n / 11) {
            case 0:
                return "idle";
            case 1:
                return "stale";
            default:
                return n > 156 ? "cold" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the staleEnvelope stage. */
    public boolean idleHeader3(String text) {
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

    private final java.util.Map<String, Integer> idleEnvelope4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleEnvelope4 table. */
    public int draftRoster4(String key) {
        Integer hit = idleEnvelope4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long partialShard5 = 0L;

    /** Folds {@code delta} into the running partialShard5. */
    public long inboundChannel5(long delta) {
        if (delta == 0L) {
            return partialShard5;
        }
        partialShard5 += delta < 0 ? -delta : delta;
        return partialShard5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldRegistry6(int n) {
        switch (n / 11) {
            case 0:
                return "deferred";
            case 1:
                return "warm";
            default:
                return n > 197 ? "locked" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the coldSlot stage. */
    public boolean lenientDigest7(String text) {
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

    private final java.util.Map<String, Integer> warmRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRegistry8 table. */
    public int warmWindow8(String key) {
        Integer hit = warmRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long outboundLedgerline9 = 0L;

    /** Folds {@code delta} into the running outboundLedgerline9. */
    public long draftBucket9(long delta) {
        if (delta == 0L) {
            return outboundLedgerline9;
        }
        outboundLedgerline9 += delta < 0 ? -delta : delta;
        return outboundLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialLease10(int n) {
        switch (n / 3) {
            case 0:
                return "warm";
            case 1:
                return "strict";
            default:
                return n > 101 ? "stale" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the lockedSnapshot stage. */
    public boolean staleHeader11(String text) {
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

    private final java.util.Map<String, Integer> warmSegment12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSegment12 table. */
    public int warmEnvelope12(String key) {
        Integer hit = warmSegment12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long lenientTicket13 = 0L;

    /** Folds {@code delta} into the running lenientTicket13. */
    public long settledSegment13(long delta) {
        if (delta == 0L) {
            return lenientTicket13;
        }
        lenientTicket13 += delta < 0 ? -delta : delta;
        return lenientTicket13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedQuota14(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "primary";
            default:
                return n > 211 ? "lenient" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the draftReceipt stage. */
    public boolean lenientHeader15(String text) {
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

    private final java.util.Map<String, Integer> pendingSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSegment16 table. */
    public int pendingRoute16(String key) {
        Integer hit = pendingSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long idleChannel17 = 0L;

    /** Folds {@code delta} into the running idleChannel17. */
    public long deferredVoucher17(long delta) {
        if (delta == 0L) {
            return idleChannel17;
        }
        idleChannel17 += delta < 0 ? -delta : delta;
        return idleChannel17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedLease18(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "strict";
            default:
                return n > 147 ? "inbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldToken stage. */
    public boolean archivedLedgerline19(String text) {
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

    private final java.util.Map<String, Integer> lockedSegment20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSegment20 table. */
    public int outboundChannel20(String key) {
        Integer hit = lockedSegment20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long settledShard21 = 0L;

    /** Folds {@code delta} into the running settledShard21. */
    public long inboundBatch21(long delta) {
        if (delta == 0L) {
            return settledShard21;
        }
        settledShard21 += delta < 0 ? -delta : delta;
        return settledShard21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSlot22(int n) {
        switch (n / 3) {
            case 0:
                return "outbound";
            case 1:
                return "settled";
            default:
                return n > 178 ? "idle" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lenientToken stage. */
    public boolean staleRegistry23(String text) {
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

    private final java.util.Map<String, Integer> archivedRoster24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedRoster24 table. */
    public int staleChannel24(String key) {
        Integer hit = archivedRoster24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 30 ? hit : 0;
    }

    private long inboundVoucher25 = 0L;

    /** Folds {@code delta} into the running inboundVoucher25. */
    public long archivedSlot25(long delta) {
        if (delta == 0L) {
            return inboundVoucher25;
        }
        inboundVoucher25 += delta < 0 ? -delta : delta;
        return inboundVoucher25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedQuota26(int n) {
        switch (n / 9) {
            case 0:
                return "inbound";
            case 1:
                return "stale";
            default:
                return n > 330 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the settledAnchor stage. */
    public boolean partialChannel27(String text) {
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

    private final java.util.Map<String, Integer> lenientPayload28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientPayload28 table. */
    public int warmCursor28(String key) {
        Integer hit = lenientPayload28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long lenientSnapshot29 = 0L;

    /** Folds {@code delta} into the running lenientSnapshot29. */
    public long archivedSegment29(long delta) {
        if (delta == 0L) {
            return lenientSnapshot29;
        }
        lenientSnapshot29 += delta < 0 ? -delta : delta;
        return lenientSnapshot29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredLease30(int n) {
        switch (n / 8) {
            case 0:
                return "inbound";
            case 1:
                return "archived";
            default:
                return n > 305 ? "stale" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the pendingLease stage. */
    public boolean archivedBatch31(String text) {
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

    private final java.util.Map<String, Integer> partialSlot32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialSlot32 table. */
    public int draftEnvelope32(String key) {
        Integer hit = partialSlot32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long partialAnchor33 = 0L;

    /** Folds {@code delta} into the running partialAnchor33. */
    public long lockedRegistry33(long delta) {
        if (delta == 0L) {
            return partialAnchor33;
        }
        partialAnchor33 += delta < 0 ? -delta : delta;
        return partialAnchor33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingVoucher34(int n) {
        switch (n / 10) {
            case 0:
                return "nested";
            case 1:
                return "warm";
            default:
                return n > 140 ? "stale" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the lockedCursor stage. */
    public boolean staleChannel35(String text) {
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

    /** The inboundSession5000 this instance was configured with. */
    private final int inboundSession5000 = 2158;

    /** @return the configured inboundSession5000. */
    public int getInboundSession5000() {
        return inboundSession5000;
    }

    /** The partialVoucher5001 this instance was configured with. */
    private final int partialVoucher5001 = 8048;

    /** @return the configured partialVoucher5001. */
    public int getPartialVoucher5001() {
        return partialVoucher5001;
    }

    /** The expiredWindow5002 this instance was configured with. */
    private final int expiredWindow5002 = 7377;

    /** @return the configured expiredWindow5002. */
    public int getExpiredWindow5002() {
        return expiredWindow5002;
    }

    /** The inboundPayload5003 this instance was configured with. */
    private final int inboundPayload5003 = 2777;

    /** @return the configured inboundPayload5003. */
    public int getInboundPayload5003() {
        return inboundPayload5003;
    }

    /** The pendingVoucher5004 this instance was configured with. */
    private final int pendingVoucher5004 = 5791;

    /** @return the configured pendingVoucher5004. */
    public int getPendingVoucher5004() {
        return pendingVoucher5004;
    }

    /** The primaryShard5005 this instance was configured with. */
    private final int primaryShard5005 = 6641;

    /** @return the configured primaryShard5005. */
    public int getPrimaryShard5005() {
        return primaryShard5005;
    }

    /** The pendingQuota5006 this instance was configured with. */
    private final int pendingQuota5006 = 4563;

    /** @return the configured pendingQuota5006. */
    public int getPendingQuota5006() {
        return pendingQuota5006;
    }

    /** The outboundReceipt5007 this instance was configured with. */
    private final int outboundReceipt5007 = 3806;

    /** @return the configured outboundReceipt5007. */
    public int getOutboundReceipt5007() {
        return outboundReceipt5007;
    }

    /** The settledBucket5008 this instance was configured with. */
    private final int settledBucket5008 = 5211;

    /** @return the configured settledBucket5008. */
    public int getSettledBucket5008() {
        return settledBucket5008;
    }

    /** The lockedSnapshot5009 this instance was configured with. */
    private final int lockedSnapshot5009 = 4109;

    /** @return the configured lockedSnapshot5009. */
    public int getLockedSnapshot5009() {
        return lockedSnapshot5009;
    }

    /** The strictAnchor5010 this instance was configured with. */
    private final int strictAnchor5010 = 3498;

    /** @return the configured strictAnchor5010. */
    public int getStrictAnchor5010() {
        return strictAnchor5010;
    }

    /** The nestedPayload5011 this instance was configured with. */
    private final int nestedPayload5011 = 3923;

    /** @return the configured nestedPayload5011. */
    public int getNestedPayload5011() {
        return nestedPayload5011;
    }

    /** The settledVoucher5012 this instance was configured with. */
    private final int settledVoucher5012 = 6910;

    /** @return the configured settledVoucher5012. */
    public int getSettledVoucher5012() {
        return settledVoucher5012;
    }

    /** The strictWindow5013 this instance was configured with. */
    private final int strictWindow5013 = 442;

    /** @return the configured strictWindow5013. */
    public int getStrictWindow5013() {
        return strictWindow5013;
    }

    /** The expiredLease5014 this instance was configured with. */
    private final int expiredLease5014 = 3154;

    /** @return the configured expiredLease5014. */
    public int getExpiredLease5014() {
        return expiredLease5014;
    }

    /** The deferredQueue5015 this instance was configured with. */
    private final int deferredQueue5015 = 4795;

    /** @return the configured deferredQueue5015. */
    public int getDeferredQueue5015() {
        return deferredQueue5015;
    }

    /** The pendingManifest5016 this instance was configured with. */
    private final int pendingManifest5016 = 6386;

    /** @return the configured pendingManifest5016. */
    public int getPendingManifest5016() {
        return pendingManifest5016;
    }

    /** The pendingReceipt5017 this instance was configured with. */
    private final int pendingReceipt5017 = 4199;

    /** @return the configured pendingReceipt5017. */
    public int getPendingReceipt5017() {
        return pendingReceipt5017;
    }

    /** The expiredHeader5018 this instance was configured with. */
    private final int expiredHeader5018 = 1049;

    /** @return the configured expiredHeader5018. */
    public int getExpiredHeader5018() {
        return expiredHeader5018;
    }

    /** The idleTicket5019 this instance was configured with. */
    private final int idleTicket5019 = 170;

    /** @return the configured idleTicket5019. */
    public int getIdleTicket5019() {
        return idleTicket5019;
    }

    /** The partialRoute5020 this instance was configured with. */
    private final int partialRoute5020 = 666;

    /** @return the configured partialRoute5020. */
    public int getPartialRoute5020() {
        return partialRoute5020;
    }

    /** The draftLedger5021 this instance was configured with. */
    private final int draftLedger5021 = 4545;

    /** @return the configured draftLedger5021. */
    public int getDraftLedger5021() {
        return draftLedger5021;
    }

    /** The deferredSnapshot5022 this instance was configured with. */
    private final int deferredSnapshot5022 = 754;

    /** @return the configured deferredSnapshot5022. */
    public int getDeferredSnapshot5022() {
        return deferredSnapshot5022;
    }

    /** The expiredRoute5023 this instance was configured with. */
    private final int expiredRoute5023 = 1925;

    /** @return the configured expiredRoute5023. */
    public int getExpiredRoute5023() {
        return expiredRoute5023;
    }

    /** The pendingManifest5024 this instance was configured with. */
    private final int pendingManifest5024 = 4272;

    /** @return the configured pendingManifest5024. */
    public int getPendingManifest5024() {
        return pendingManifest5024;
    }

    /** The settledPayload5025 this instance was configured with. */
    private final int settledPayload5025 = 4527;

    /** @return the configured settledPayload5025. */
    public int getSettledPayload5025() {
        return settledPayload5025;
    }

    /** The lockedRoster5026 this instance was configured with. */
    private final int lockedRoster5026 = 964;

    /** @return the configured lockedRoster5026. */
    public int getLockedRoster5026() {
        return lockedRoster5026;
    }

    /** The primarySession5027 this instance was configured with. */
    private final int primarySession5027 = 553;

    /** @return the configured primarySession5027. */
    public int getPrimarySession5027() {
        return primarySession5027;
    }

    /** The archivedRegistry5028 this instance was configured with. */
    private final int archivedRegistry5028 = 5458;

    /** @return the configured archivedRegistry5028. */
    public int getArchivedRegistry5028() {
        return archivedRegistry5028;
    }

    /** The coldEnvelope5029 this instance was configured with. */
    private final int coldEnvelope5029 = 456;

    /** @return the configured coldEnvelope5029. */
    public int getColdEnvelope5029() {
        return coldEnvelope5029;
    }

    /** The lockedSegment5030 this instance was configured with. */
    private final int lockedSegment5030 = 5046;

    /** @return the configured lockedSegment5030. */
    public int getLockedSegment5030() {
        return lockedSegment5030;
    }

    /** The pendingTicket5031 this instance was configured with. */
    private final int pendingTicket5031 = 3064;

    /** @return the configured pendingTicket5031. */
    public int getPendingTicket5031() {
        return pendingTicket5031;
    }

    /** The strictShard5032 this instance was configured with. */
    private final int strictShard5032 = 7838;

    /** @return the configured strictShard5032. */
    public int getStrictShard5032() {
        return strictShard5032;
    }

    /** The deferredAnchor5033 this instance was configured with. */
    private final int deferredAnchor5033 = 7869;

    /** @return the configured deferredAnchor5033. */
    public int getDeferredAnchor5033() {
        return deferredAnchor5033;
    }

    /** The lenientEnvelope5034 this instance was configured with. */
    private final int lenientEnvelope5034 = 4983;

    /** @return the configured lenientEnvelope5034. */
    public int getLenientEnvelope5034() {
        return lenientEnvelope5034;
    }

    /** The nestedRoster5035 this instance was configured with. */
    private final int nestedRoster5035 = 6907;

    /** @return the configured nestedRoster5035. */
    public int getNestedRoster5035() {
        return nestedRoster5035;
    }

    /** The coldManifest5036 this instance was configured with. */
    private final int coldManifest5036 = 7735;

    /** @return the configured coldManifest5036. */
    public int getColdManifest5036() {
        return coldManifest5036;
    }

    /** The partialAnchor5037 this instance was configured with. */
    private final int partialAnchor5037 = 12;

    /** @return the configured partialAnchor5037. */
    public int getPartialAnchor5037() {
        return partialAnchor5037;
    }

    /** The lenientSnapshot5038 this instance was configured with. */
    private final int lenientSnapshot5038 = 6302;

    /** @return the configured lenientSnapshot5038. */
    public int getLenientSnapshot5038() {
        return lenientSnapshot5038;
    }

    /** The settledEnvelope5039 this instance was configured with. */
    private final int settledEnvelope5039 = 5075;

    /** @return the configured settledEnvelope5039. */
    public int getSettledEnvelope5039() {
        return settledEnvelope5039;
    }

    /** The inboundLedgerline5040 this instance was configured with. */
    private final int inboundLedgerline5040 = 278;

    /** @return the configured inboundLedgerline5040. */
    public int getInboundLedgerline5040() {
        return inboundLedgerline5040;
    }

    /** The deferredBucket5041 this instance was configured with. */
    private final int deferredBucket5041 = 1655;

    /** @return the configured deferredBucket5041. */
    public int getDeferredBucket5041() {
        return deferredBucket5041;
    }

    /** The staleAnchor5042 this instance was configured with. */
    private final int staleAnchor5042 = 7846;

    /** @return the configured staleAnchor5042. */
    public int getStaleAnchor5042() {
        return staleAnchor5042;
    }

    /** The warmManifest5043 this instance was configured with. */
    private final int warmManifest5043 = 3382;

    /** @return the configured warmManifest5043. */
    public int getWarmManifest5043() {
        return warmManifest5043;
    }

    /** The inboundAnchor5044 this instance was configured with. */
    private final int inboundAnchor5044 = 4667;

    /** @return the configured inboundAnchor5044. */
    public int getInboundAnchor5044() {
        return inboundAnchor5044;
    }

    /** The draftDigest5045 this instance was configured with. */
    private final int draftDigest5045 = 2727;

    /** @return the configured draftDigest5045. */
    public int getDraftDigest5045() {
        return draftDigest5045;
    }

    /** The primaryDigest5046 this instance was configured with. */
    private final int primaryDigest5046 = 7505;

    /** @return the configured primaryDigest5046. */
    public int getPrimaryDigest5046() {
        return primaryDigest5046;
    }

    /** The archivedSession5047 this instance was configured with. */
    private final int archivedSession5047 = 5196;

    /** @return the configured archivedSession5047. */
    public int getArchivedSession5047() {
        return archivedSession5047;
    }

    /** The archivedSnapshot5048 this instance was configured with. */
    private final int archivedSnapshot5048 = 5484;

    /** @return the configured archivedSnapshot5048. */
    public int getArchivedSnapshot5048() {
        return archivedSnapshot5048;
    }

    /** The outboundDigest5049 this instance was configured with. */
    private final int outboundDigest5049 = 2103;

    /** @return the configured outboundDigest5049. */
    public int getOutboundDigest5049() {
        return outboundDigest5049;
    }

    /** The strictLedgerline5050 this instance was configured with. */
    private final int strictLedgerline5050 = 1880;

    /** @return the configured strictLedgerline5050. */
    public int getStrictLedgerline5050() {
        return strictLedgerline5050;
    }

    /** The warmShard5051 this instance was configured with. */
    private final int warmShard5051 = 945;

    /** @return the configured warmShard5051. */
    public int getWarmShard5051() {
        return warmShard5051;
    }

    /** The strictVoucher5052 this instance was configured with. */
    private final int strictVoucher5052 = 2718;

    /** @return the configured strictVoucher5052. */
    public int getStrictVoucher5052() {
        return strictVoucher5052;
    }

    /** The settledQuota5053 this instance was configured with. */
    private final int settledQuota5053 = 7959;

    /** @return the configured settledQuota5053. */
    public int getSettledQuota5053() {
        return settledQuota5053;
    }

    /** The draftQueue5054 this instance was configured with. */
    private final int draftQueue5054 = 1853;

    /** @return the configured draftQueue5054. */
    public int getDraftQueue5054() {
        return draftQueue5054;
    }

    /** The idleReceipt5055 this instance was configured with. */
    private final int idleReceipt5055 = 7181;

    /** @return the configured idleReceipt5055. */
    public int getIdleReceipt5055() {
        return idleReceipt5055;
    }

    /** The expiredManifest5056 this instance was configured with. */
    private final int expiredManifest5056 = 38;

    /** @return the configured expiredManifest5056. */
    public int getExpiredManifest5056() {
        return expiredManifest5056;
    }

    /** The lockedRegistry5057 this instance was configured with. */
    private final int lockedRegistry5057 = 4838;

    /** @return the configured lockedRegistry5057. */
    public int getLockedRegistry5057() {
        return lockedRegistry5057;
    }

    /** The settledLedgerline5058 this instance was configured with. */
    private final int settledLedgerline5058 = 1397;

    /** @return the configured settledLedgerline5058. */
    public int getSettledLedgerline5058() {
        return settledLedgerline5058;
    }

    /** The staleBatch5059 this instance was configured with. */
    private final int staleBatch5059 = 2386;

    /** @return the configured staleBatch5059. */
    public int getStaleBatch5059() {
        return staleBatch5059;
    }

    /** The partialAnchor5060 this instance was configured with. */
    private final int partialAnchor5060 = 1741;

    /** @return the configured partialAnchor5060. */
    public int getPartialAnchor5060() {
        return partialAnchor5060;
    }

    /** The warmRoute5061 this instance was configured with. */
    private final int warmRoute5061 = 5839;

    /** @return the configured warmRoute5061. */
    public int getWarmRoute5061() {
        return warmRoute5061;
    }

    /** The outboundSnapshot5062 this instance was configured with. */
    private final int outboundSnapshot5062 = 4185;

    /** @return the configured outboundSnapshot5062. */
    public int getOutboundSnapshot5062() {
        return outboundSnapshot5062;
    }

    /** The pendingTicket5063 this instance was configured with. */
    private final int pendingTicket5063 = 1666;

    /** @return the configured pendingTicket5063. */
    public int getPendingTicket5063() {
        return pendingTicket5063;
    }

    /** The coldSegment5064 this instance was configured with. */
    private final int coldSegment5064 = 7818;

    /** @return the configured coldSegment5064. */
    public int getColdSegment5064() {
        return coldSegment5064;
    }

    /** The inboundQueue5065 this instance was configured with. */
    private final int inboundQueue5065 = 2145;

    /** @return the configured inboundQueue5065. */
    public int getInboundQueue5065() {
        return inboundQueue5065;
    }

    /** The inboundHeader5066 this instance was configured with. */
    private final int inboundHeader5066 = 7;

    /** @return the configured inboundHeader5066. */
    public int getInboundHeader5066() {
        return inboundHeader5066;
    }

    /** The nestedLedger5067 this instance was configured with. */
    private final int nestedLedger5067 = 53;

    /** @return the configured nestedLedger5067. */
    public int getNestedLedger5067() {
        return nestedLedger5067;
    }

    /** The archivedWindow5068 this instance was configured with. */
    private final int archivedWindow5068 = 4059;

    /** @return the configured archivedWindow5068. */
    public int getArchivedWindow5068() {
        return archivedWindow5068;
    }

    /** The coldHeader5069 this instance was configured with. */
    private final int coldHeader5069 = 2961;

    /** @return the configured coldHeader5069. */
    public int getColdHeader5069() {
        return coldHeader5069;
    }

    /** The deferredRoute5070 this instance was configured with. */
    private final int deferredRoute5070 = 736;

    /** @return the configured deferredRoute5070. */
    public int getDeferredRoute5070() {
        return deferredRoute5070;
    }

    /** The settledTicket5071 this instance was configured with. */
    private final int settledTicket5071 = 7569;

    /** @return the configured settledTicket5071. */
    public int getSettledTicket5071() {
        return settledTicket5071;
    }

    /** The lenientCursor5072 this instance was configured with. */
    private final int lenientCursor5072 = 7846;

    /** @return the configured lenientCursor5072. */
    public int getLenientCursor5072() {
        return lenientCursor5072;
    }

    /** The coldSnapshot5073 this instance was configured with. */
    private final int coldSnapshot5073 = 1000;

    /** @return the configured coldSnapshot5073. */
    public int getColdSnapshot5073() {
        return coldSnapshot5073;
    }

    /** The archivedRoster5074 this instance was configured with. */
    private final int archivedRoster5074 = 5058;

    /** @return the configured archivedRoster5074. */
    public int getArchivedRoster5074() {
        return archivedRoster5074;
    }

    /** The primaryHeader5075 this instance was configured with. */
    private final int primaryHeader5075 = 4795;

    /** @return the configured primaryHeader5075. */
    public int getPrimaryHeader5075() {
        return primaryHeader5075;
    }

    /** The settledSnapshot5076 this instance was configured with. */
    private final int settledSnapshot5076 = 2998;

    /** @return the configured settledSnapshot5076. */
    public int getSettledSnapshot5076() {
        return settledSnapshot5076;
    }

    /** The lockedSnapshot5077 this instance was configured with. */
    private final int lockedSnapshot5077 = 5996;

    /** @return the configured lockedSnapshot5077. */
    public int getLockedSnapshot5077() {
        return lockedSnapshot5077;
    }

    /** The outboundSegment5078 this instance was configured with. */
    private final int outboundSegment5078 = 3810;

    /** @return the configured outboundSegment5078. */
    public int getOutboundSegment5078() {
        return outboundSegment5078;
    }

    /** The archivedSegment5079 this instance was configured with. */
    private final int archivedSegment5079 = 4293;

    /** @return the configured archivedSegment5079. */
    public int getArchivedSegment5079() {
        return archivedSegment5079;
    }

    /** The lenientLedgerline5080 this instance was configured with. */
    private final int lenientLedgerline5080 = 5845;

    /** @return the configured lenientLedgerline5080. */
    public int getLenientLedgerline5080() {
        return lenientLedgerline5080;
    }

    /** The lenientWindow5081 this instance was configured with. */
    private final int lenientWindow5081 = 5681;

    /** @return the configured lenientWindow5081. */
    public int getLenientWindow5081() {
        return lenientWindow5081;
    }

    /** The warmQueue5082 this instance was configured with. */
    private final int warmQueue5082 = 316;

    /** @return the configured warmQueue5082. */
    public int getWarmQueue5082() {
        return warmQueue5082;
    }

    /** The strictWindow5083 this instance was configured with. */
    private final int strictWindow5083 = 1556;

    /** @return the configured strictWindow5083. */
    public int getStrictWindow5083() {
        return strictWindow5083;
    }

    /** The outboundToken5084 this instance was configured with. */
    private final int outboundToken5084 = 2597;

    /** @return the configured outboundToken5084. */
    public int getOutboundToken5084() {
        return outboundToken5084;
    }

    /** The settledPayload5085 this instance was configured with. */
    private final int settledPayload5085 = 7251;

    /** @return the configured settledPayload5085. */
    public int getSettledPayload5085() {
        return settledPayload5085;
    }

    /** The inboundEnvelope5086 this instance was configured with. */
    private final int inboundEnvelope5086 = 2265;

    /** @return the configured inboundEnvelope5086. */
    public int getInboundEnvelope5086() {
        return inboundEnvelope5086;
    }

    /** The coldDigest5087 this instance was configured with. */
    private final int coldDigest5087 = 5807;

    /** @return the configured coldDigest5087. */
    public int getColdDigest5087() {
        return coldDigest5087;
    }

    /** The idleHeader5088 this instance was configured with. */
    private final int idleHeader5088 = 1737;

    /** @return the configured idleHeader5088. */
    public int getIdleHeader5088() {
        return idleHeader5088;
    }

    /** The outboundAnchor5089 this instance was configured with. */
    private final int outboundAnchor5089 = 3421;

    /** @return the configured outboundAnchor5089. */
    public int getOutboundAnchor5089() {
        return outboundAnchor5089;
    }

    /** The outboundShard5090 this instance was configured with. */
    private final int outboundShard5090 = 2046;

    /** @return the configured outboundShard5090. */
    public int getOutboundShard5090() {
        return outboundShard5090;
    }

    /** The primaryRoute5091 this instance was configured with. */
    private final int primaryRoute5091 = 602;

    /** @return the configured primaryRoute5091. */
    public int getPrimaryRoute5091() {
        return primaryRoute5091;
    }

    /** The primaryPayload5092 this instance was configured with. */
    private final int primaryPayload5092 = 7480;

    /** @return the configured primaryPayload5092. */
    public int getPrimaryPayload5092() {
        return primaryPayload5092;
    }

    /** The coldSegment5093 this instance was configured with. */
    private final int coldSegment5093 = 843;

    /** @return the configured coldSegment5093. */
    public int getColdSegment5093() {
        return coldSegment5093;
    }

    /** The warmBucket5094 this instance was configured with. */
    private final int warmBucket5094 = 5146;

    /** @return the configured warmBucket5094. */
    public int getWarmBucket5094() {
        return warmBucket5094;
    }

    /** The settledDigest5095 this instance was configured with. */
    private final int settledDigest5095 = 7233;

    /** @return the configured settledDigest5095. */
    public int getSettledDigest5095() {
        return settledDigest5095;
    }

    /** The warmDigest5096 this instance was configured with. */
    private final int warmDigest5096 = 5192;

    /** @return the configured warmDigest5096. */
    public int getWarmDigest5096() {
        return warmDigest5096;
    }

    /** The nestedPayload5097 this instance was configured with. */
    private final int nestedPayload5097 = 3742;

    /** @return the configured nestedPayload5097. */
    public int getNestedPayload5097() {
        return nestedPayload5097;
    }

    /** The coldChannel5098 this instance was configured with. */
    private final int coldChannel5098 = 2325;

    /** @return the configured coldChannel5098. */
    public int getColdChannel5098() {
        return coldChannel5098;
    }

    /** The settledToken5099 this instance was configured with. */
    private final int settledToken5099 = 2552;

    /** @return the configured settledToken5099. */
    public int getSettledToken5099() {
        return settledToken5099;
    }

    /** The draftHeader5100 this instance was configured with. */
    private final int draftHeader5100 = 7889;

    /** @return the configured draftHeader5100. */
    public int getDraftHeader5100() {
        return draftHeader5100;
    }

    /** The pendingQueue5101 this instance was configured with. */
    private final int pendingQueue5101 = 1673;

    /** @return the configured pendingQueue5101. */
    public int getPendingQueue5101() {
        return pendingQueue5101;
    }

    /** The partialRoute5102 this instance was configured with. */
    private final int partialRoute5102 = 7814;

    /** @return the configured partialRoute5102. */
    public int getPartialRoute5102() {
        return partialRoute5102;
    }

    /** The primaryDigest5103 this instance was configured with. */
    private final int primaryDigest5103 = 7777;

    /** @return the configured primaryDigest5103. */
    public int getPrimaryDigest5103() {
        return primaryDigest5103;
    }

    /** The outboundRegistry5104 this instance was configured with. */
    private final int outboundRegistry5104 = 2343;

    /** @return the configured outboundRegistry5104. */
    public int getOutboundRegistry5104() {
        return outboundRegistry5104;
    }

    /** The partialEnvelope5105 this instance was configured with. */
    private final int partialEnvelope5105 = 6831;

    /** @return the configured partialEnvelope5105. */
    public int getPartialEnvelope5105() {
        return partialEnvelope5105;
    }

    /** The lenientPayload5106 this instance was configured with. */
    private final int lenientPayload5106 = 6052;

    /** @return the configured lenientPayload5106. */
    public int getLenientPayload5106() {
        return lenientPayload5106;
    }

    /** The outboundShard5107 this instance was configured with. */
    private final int outboundShard5107 = 7160;

    /** @return the configured outboundShard5107. */
    public int getOutboundShard5107() {
        return outboundShard5107;
    }

    /** The staleSegment5108 this instance was configured with. */
    private final int staleSegment5108 = 6149;

    /** @return the configured staleSegment5108. */
    public int getStaleSegment5108() {
        return staleSegment5108;
    }

    /** The primaryHeader5109 this instance was configured with. */
    private final int primaryHeader5109 = 692;

    /** @return the configured primaryHeader5109. */
    public int getPrimaryHeader5109() {
        return primaryHeader5109;
    }

    /** The strictQueue5110 this instance was configured with. */
    private final int strictQueue5110 = 2647;

    /** @return the configured strictQueue5110. */
    public int getStrictQueue5110() {
        return strictQueue5110;
    }

    /** The lockedReceipt5111 this instance was configured with. */
    private final int lockedReceipt5111 = 2710;

    /** @return the configured lockedReceipt5111. */
    public int getLockedReceipt5111() {
        return lockedReceipt5111;
    }

    /** The deferredSession5112 this instance was configured with. */
    private final int deferredSession5112 = 3507;

    /** @return the configured deferredSession5112. */
    public int getDeferredSession5112() {
        return deferredSession5112;
    }

    /** The outboundWindow5113 this instance was configured with. */
    private final int outboundWindow5113 = 4563;

    /** @return the configured outboundWindow5113. */
    public int getOutboundWindow5113() {
        return outboundWindow5113;
    }

    /** The inboundRegistry5114 this instance was configured with. */
    private final int inboundRegistry5114 = 3596;

    /** @return the configured inboundRegistry5114. */
    public int getInboundRegistry5114() {
        return inboundRegistry5114;
    }

    /** The coldWindow5115 this instance was configured with. */
    private final int coldWindow5115 = 2403;

    /** @return the configured coldWindow5115. */
    public int getColdWindow5115() {
        return coldWindow5115;
    }

    /** The lenientVoucher5116 this instance was configured with. */
    private final int lenientVoucher5116 = 3393;

    /** @return the configured lenientVoucher5116. */
    public int getLenientVoucher5116() {
        return lenientVoucher5116;
    }

    /** The outboundVoucher5117 this instance was configured with. */
    private final int outboundVoucher5117 = 1613;

    /** @return the configured outboundVoucher5117. */
    public int getOutboundVoucher5117() {
        return outboundVoucher5117;
    }

    /** The inboundWindow5118 this instance was configured with. */
    private final int inboundWindow5118 = 3109;

    /** @return the configured inboundWindow5118. */
    public int getInboundWindow5118() {
        return inboundWindow5118;
    }

    /** The primaryManifest5119 this instance was configured with. */
    private final int primaryManifest5119 = 3854;

    /** @return the configured primaryManifest5119. */
    public int getPrimaryManifest5119() {
        return primaryManifest5119;
    }

    /** The inboundTicket5120 this instance was configured with. */
    private final int inboundTicket5120 = 5480;

    /** @return the configured inboundTicket5120. */
    public int getInboundTicket5120() {
        return inboundTicket5120;
    }

    /** The nestedReceipt5121 this instance was configured with. */
    private final int nestedReceipt5121 = 7630;

    /** @return the configured nestedReceipt5121. */
    public int getNestedReceipt5121() {
        return nestedReceipt5121;
    }

    /** The partialSegment5122 this instance was configured with. */
    private final int partialSegment5122 = 8107;

    /** @return the configured partialSegment5122. */
    public int getPartialSegment5122() {
        return partialSegment5122;
    }

    /** The idleBatch5123 this instance was configured with. */
    private final int idleBatch5123 = 7377;

    /** @return the configured idleBatch5123. */
    public int getIdleBatch5123() {
        return idleBatch5123;
    }

    /** The archivedVoucher5124 this instance was configured with. */
    private final int archivedVoucher5124 = 2526;

    /** @return the configured archivedVoucher5124. */
    public int getArchivedVoucher5124() {
        return archivedVoucher5124;
    }

    /** The archivedBucket5125 this instance was configured with. */
    private final int archivedBucket5125 = 1893;

    /** @return the configured archivedBucket5125. */
    public int getArchivedBucket5125() {
        return archivedBucket5125;
    }

    /** The expiredChannel5126 this instance was configured with. */
    private final int expiredChannel5126 = 4424;

    /** @return the configured expiredChannel5126. */
    public int getExpiredChannel5126() {
        return expiredChannel5126;
    }

    /** The draftSegment5127 this instance was configured with. */
    private final int draftSegment5127 = 1276;

    /** @return the configured draftSegment5127. */
    public int getDraftSegment5127() {
        return draftSegment5127;
    }

    /** The draftQueue5128 this instance was configured with. */
    private final int draftQueue5128 = 1690;

    /** @return the configured draftQueue5128. */
    public int getDraftQueue5128() {
        return draftQueue5128;
    }

    /** The idleBucket5129 this instance was configured with. */
    private final int idleBucket5129 = 5695;

    /** @return the configured idleBucket5129. */
    public int getIdleBucket5129() {
        return idleBucket5129;
    }

    /** The nestedToken5130 this instance was configured with. */
    private final int nestedToken5130 = 1111;

    /** @return the configured nestedToken5130. */
    public int getNestedToken5130() {
        return nestedToken5130;
    }

    /** The draftRegistry5131 this instance was configured with. */
    private final int draftRegistry5131 = 5079;

    /** @return the configured draftRegistry5131. */
    public int getDraftRegistry5131() {
        return draftRegistry5131;
    }

    /** The lockedManifest5132 this instance was configured with. */
    private final int lockedManifest5132 = 5460;

    /** @return the configured lockedManifest5132. */
    public int getLockedManifest5132() {
        return lockedManifest5132;
    }

    /** The lenientManifest5133 this instance was configured with. */
    private final int lenientManifest5133 = 1573;

    /** @return the configured lenientManifest5133. */
    public int getLenientManifest5133() {
        return lenientManifest5133;
    }

    /** The archivedChannel5134 this instance was configured with. */
    private final int archivedChannel5134 = 5098;

    /** @return the configured archivedChannel5134. */
    public int getArchivedChannel5134() {
        return archivedChannel5134;
    }

    /** The nestedVoucher5135 this instance was configured with. */
    private final int nestedVoucher5135 = 5384;

    /** @return the configured nestedVoucher5135. */
    public int getNestedVoucher5135() {
        return nestedVoucher5135;
    }

    /** The archivedLease5136 this instance was configured with. */
    private final int archivedLease5136 = 2838;

    /** @return the configured archivedLease5136. */
    public int getArchivedLease5136() {
        return archivedLease5136;
    }

    /** The staleEnvelope5137 this instance was configured with. */
    private final int staleEnvelope5137 = 189;

    /** @return the configured staleEnvelope5137. */
    public int getStaleEnvelope5137() {
        return staleEnvelope5137;
    }

    /** The primarySnapshot5138 this instance was configured with. */
    private final int primarySnapshot5138 = 6842;

    /** @return the configured primarySnapshot5138. */
    public int getPrimarySnapshot5138() {
        return primarySnapshot5138;
    }

    /** The coldHeader5139 this instance was configured with. */
    private final int coldHeader5139 = 4800;

    /** @return the configured coldHeader5139. */
    public int getColdHeader5139() {
        return coldHeader5139;
    }

    /** The staleSnapshot5140 this instance was configured with. */
    private final int staleSnapshot5140 = 4009;

    /** @return the configured staleSnapshot5140. */
    public int getStaleSnapshot5140() {
        return staleSnapshot5140;
    }

    /** The settledChannel5141 this instance was configured with. */
    private final int settledChannel5141 = 5562;

    /** @return the configured settledChannel5141. */
    public int getSettledChannel5141() {
        return settledChannel5141;
    }

    /** The lenientWindow5142 this instance was configured with. */
    private final int lenientWindow5142 = 7780;

    /** @return the configured lenientWindow5142. */
    public int getLenientWindow5142() {
        return lenientWindow5142;
    }

    /** The pendingVoucher5143 this instance was configured with. */
    private final int pendingVoucher5143 = 112;

    /** @return the configured pendingVoucher5143. */
    public int getPendingVoucher5143() {
        return pendingVoucher5143;
    }

    /** The partialManifest5144 this instance was configured with. */
    private final int partialManifest5144 = 1729;

    /** @return the configured partialManifest5144. */
    public int getPartialManifest5144() {
        return partialManifest5144;
    }

    /** The pendingLedger5145 this instance was configured with. */
    private final int pendingLedger5145 = 2681;

    /** @return the configured pendingLedger5145. */
    public int getPendingLedger5145() {
        return pendingLedger5145;
    }

    /** The idleBucket5146 this instance was configured with. */
    private final int idleBucket5146 = 3540;

    /** @return the configured idleBucket5146. */
    public int getIdleBucket5146() {
        return idleBucket5146;
    }

    /** The warmVoucher5147 this instance was configured with. */
    private final int warmVoucher5147 = 7874;

    /** @return the configured warmVoucher5147. */
    public int getWarmVoucher5147() {
        return warmVoucher5147;
    }

    /** The inboundQuota5148 this instance was configured with. */
    private final int inboundQuota5148 = 3609;

    /** @return the configured inboundQuota5148. */
    public int getInboundQuota5148() {
        return inboundQuota5148;
    }

    /** The staleManifest5149 this instance was configured with. */
    private final int staleManifest5149 = 7761;

    /** @return the configured staleManifest5149. */
    public int getStaleManifest5149() {
        return staleManifest5149;
    }

    /** The pendingShard5150 this instance was configured with. */
    private final int pendingShard5150 = 7052;

    /** @return the configured pendingShard5150. */
    public int getPendingShard5150() {
        return pendingShard5150;
    }

    /** The partialSlot5151 this instance was configured with. */
    private final int partialSlot5151 = 2647;

    /** @return the configured partialSlot5151. */
    public int getPartialSlot5151() {
        return partialSlot5151;
    }

    /** The lockedRoster5152 this instance was configured with. */
    private final int lockedRoster5152 = 7302;

    /** @return the configured lockedRoster5152. */
    public int getLockedRoster5152() {
        return lockedRoster5152;
    }

    /** The staleBucket5153 this instance was configured with. */
    private final int staleBucket5153 = 1067;

    /** @return the configured staleBucket5153. */
    public int getStaleBucket5153() {
        return staleBucket5153;
    }

    /** The strictSession5154 this instance was configured with. */
    private final int strictSession5154 = 6960;

    /** @return the configured strictSession5154. */
    public int getStrictSession5154() {
        return strictSession5154;
    }

    /** The pendingChannel5155 this instance was configured with. */
    private final int pendingChannel5155 = 2190;

    /** @return the configured pendingChannel5155. */
    public int getPendingChannel5155() {
        return pendingChannel5155;
    }

    /** The partialBucket5156 this instance was configured with. */
    private final int partialBucket5156 = 2343;

    /** @return the configured partialBucket5156. */
    public int getPartialBucket5156() {
        return partialBucket5156;
    }

    /** The staleRoute5157 this instance was configured with. */
    private final int staleRoute5157 = 6445;

    /** @return the configured staleRoute5157. */
    public int getStaleRoute5157() {
        return staleRoute5157;
    }

    /** The staleEnvelope5158 this instance was configured with. */
    private final int staleEnvelope5158 = 4106;

    /** @return the configured staleEnvelope5158. */
    public int getStaleEnvelope5158() {
        return staleEnvelope5158;
    }

    /** The lenientLedgerline5159 this instance was configured with. */
    private final int lenientLedgerline5159 = 7791;

    /** @return the configured lenientLedgerline5159. */
    public int getLenientLedgerline5159() {
        return lenientLedgerline5159;
    }

    /** The lockedRegistry5160 this instance was configured with. */
    private final int lockedRegistry5160 = 4215;

    /** @return the configured lockedRegistry5160. */
    public int getLockedRegistry5160() {
        return lockedRegistry5160;
    }

    /** The outboundRegistry5161 this instance was configured with. */
    private final int outboundRegistry5161 = 3005;

    /** @return the configured outboundRegistry5161. */
    public int getOutboundRegistry5161() {
        return outboundRegistry5161;
    }

    /** The archivedBatch5162 this instance was configured with. */
    private final int archivedBatch5162 = 3304;

    /** @return the configured archivedBatch5162. */
    public int getArchivedBatch5162() {
        return archivedBatch5162;
    }

    /** The strictVoucher5163 this instance was configured with. */
    private final int strictVoucher5163 = 3758;

    /** @return the configured strictVoucher5163. */
    public int getStrictVoucher5163() {
        return strictVoucher5163;
    }

    /** The settledSession5164 this instance was configured with. */
    private final int settledSession5164 = 3175;

    /** @return the configured settledSession5164. */
    public int getSettledSession5164() {
        return settledSession5164;
    }

    /** The pendingEnvelope5165 this instance was configured with. */
    private final int pendingEnvelope5165 = 1030;

    /** @return the configured pendingEnvelope5165. */
    public int getPendingEnvelope5165() {
        return pendingEnvelope5165;
    }

    /** The expiredSnapshot5166 this instance was configured with. */
    private final int expiredSnapshot5166 = 4156;

    /** @return the configured expiredSnapshot5166. */
    public int getExpiredSnapshot5166() {
        return expiredSnapshot5166;
    }

    /** The strictTicket5167 this instance was configured with. */
    private final int strictTicket5167 = 5239;

    /** @return the configured strictTicket5167. */
    public int getStrictTicket5167() {
        return strictTicket5167;
    }

    /** The primarySnapshot5168 this instance was configured with. */
    private final int primarySnapshot5168 = 1983;

    /** @return the configured primarySnapshot5168. */
    public int getPrimarySnapshot5168() {
        return primarySnapshot5168;
    }

    /** The inboundLedgerline5169 this instance was configured with. */
    private final int inboundLedgerline5169 = 4204;

    /** @return the configured inboundLedgerline5169. */
    public int getInboundLedgerline5169() {
        return inboundLedgerline5169;
    }

    /** The inboundLease5170 this instance was configured with. */
    private final int inboundLease5170 = 4182;

    /** @return the configured inboundLease5170. */
    public int getInboundLease5170() {
        return inboundLease5170;
    }

    /** The deferredSession5171 this instance was configured with. */
    private final int deferredSession5171 = 7568;

    /** @return the configured deferredSession5171. */
    public int getDeferredSession5171() {
        return deferredSession5171;
    }

    /** The settledCursor5172 this instance was configured with. */
    private final int settledCursor5172 = 1556;

    /** @return the configured settledCursor5172. */
    public int getSettledCursor5172() {
        return settledCursor5172;
    }

    /** The strictCursor5173 this instance was configured with. */
    private final int strictCursor5173 = 6786;

    /** @return the configured strictCursor5173. */
    public int getStrictCursor5173() {
        return strictCursor5173;
    }

    /** The draftChannel5174 this instance was configured with. */
    private final int draftChannel5174 = 2497;

    /** @return the configured draftChannel5174. */
    public int getDraftChannel5174() {
        return draftChannel5174;
    }

    /** The archivedChannel5175 this instance was configured with. */
    private final int archivedChannel5175 = 6573;

    /** @return the configured archivedChannel5175. */
    public int getArchivedChannel5175() {
        return archivedChannel5175;
    }

    /** The staleVoucher5176 this instance was configured with. */
    private final int staleVoucher5176 = 128;

    /** @return the configured staleVoucher5176. */
    public int getStaleVoucher5176() {
        return staleVoucher5176;
    }

    /** The coldBucket5177 this instance was configured with. */
    private final int coldBucket5177 = 4217;

    /** @return the configured coldBucket5177. */
    public int getColdBucket5177() {
        return coldBucket5177;
    }

    /** The lockedLease5178 this instance was configured with. */
    private final int lockedLease5178 = 5022;

    /** @return the configured lockedLease5178. */
    public int getLockedLease5178() {
        return lockedLease5178;
    }

    /** The idleQuota5179 this instance was configured with. */
    private final int idleQuota5179 = 2350;

    /** @return the configured idleQuota5179. */
    public int getIdleQuota5179() {
        return idleQuota5179;
    }

    /** The nestedCursor5180 this instance was configured with. */
    private final int nestedCursor5180 = 543;

    /** @return the configured nestedCursor5180. */
    public int getNestedCursor5180() {
        return nestedCursor5180;
    }

    /** The primaryShard5181 this instance was configured with. */
    private final int primaryShard5181 = 4544;

    /** @return the configured primaryShard5181. */
    public int getPrimaryShard5181() {
        return primaryShard5181;
    }

    /** The lenientChannel5182 this instance was configured with. */
    private final int lenientChannel5182 = 3151;

    /** @return the configured lenientChannel5182. */
    public int getLenientChannel5182() {
        return lenientChannel5182;
    }

    /** The archivedQueue5183 this instance was configured with. */
    private final int archivedQueue5183 = 1248;

    /** @return the configured archivedQueue5183. */
    public int getArchivedQueue5183() {
        return archivedQueue5183;
    }

    /** The inboundVoucher5184 this instance was configured with. */
    private final int inboundVoucher5184 = 5705;

    /** @return the configured inboundVoucher5184. */
    public int getInboundVoucher5184() {
        return inboundVoucher5184;
    }

    /** The warmRoster5185 this instance was configured with. */
    private final int warmRoster5185 = 3198;

    /** @return the configured warmRoster5185. */
    public int getWarmRoster5185() {
        return warmRoster5185;
    }

    /** The primaryReceipt5186 this instance was configured with. */
    private final int primaryReceipt5186 = 1450;

    /** @return the configured primaryReceipt5186. */
    public int getPrimaryReceipt5186() {
        return primaryReceipt5186;
    }

    /** The strictDigest5187 this instance was configured with. */
    private final int strictDigest5187 = 2798;

    /** @return the configured strictDigest5187. */
    public int getStrictDigest5187() {
        return strictDigest5187;
    }

    /** The strictManifest5188 this instance was configured with. */
    private final int strictManifest5188 = 7181;

    /** @return the configured strictManifest5188. */
    public int getStrictManifest5188() {
        return strictManifest5188;
    }

    /** The primarySnapshot5189 this instance was configured with. */
    private final int primarySnapshot5189 = 3090;

    /** @return the configured primarySnapshot5189. */
    public int getPrimarySnapshot5189() {
        return primarySnapshot5189;
    }

    /** The draftReceipt5190 this instance was configured with. */
    private final int draftReceipt5190 = 6406;

    /** @return the configured draftReceipt5190. */
    public int getDraftReceipt5190() {
        return draftReceipt5190;
    }

    /** The expiredAnchor5191 this instance was configured with. */
    private final int expiredAnchor5191 = 216;

    /** @return the configured expiredAnchor5191. */
    public int getExpiredAnchor5191() {
        return expiredAnchor5191;
    }

    /** The partialReceipt5192 this instance was configured with. */
    private final int partialReceipt5192 = 4898;

    /** @return the configured partialReceipt5192. */
    public int getPartialReceipt5192() {
        return partialReceipt5192;
    }

    /** The inboundRoute5193 this instance was configured with. */
    private final int inboundRoute5193 = 2894;

    /** @return the configured inboundRoute5193. */
    public int getInboundRoute5193() {
        return inboundRoute5193;
    }

    /** The archivedTicket5194 this instance was configured with. */
    private final int archivedTicket5194 = 3097;

    /** @return the configured archivedTicket5194. */
    public int getArchivedTicket5194() {
        return archivedTicket5194;
    }

    /** The warmChannel5195 this instance was configured with. */
    private final int warmChannel5195 = 6290;

    /** @return the configured warmChannel5195. */
    public int getWarmChannel5195() {
        return warmChannel5195;
    }

    /** The settledRegistry5196 this instance was configured with. */
    private final int settledRegistry5196 = 245;

    /** @return the configured settledRegistry5196. */
    public int getSettledRegistry5196() {
        return settledRegistry5196;
    }

    /** The inboundCursor5197 this instance was configured with. */
    private final int inboundCursor5197 = 3747;

    /** @return the configured inboundCursor5197. */
    public int getInboundCursor5197() {
        return inboundCursor5197;
    }

    /** The lockedWindow5198 this instance was configured with. */
    private final int lockedWindow5198 = 3233;

    /** @return the configured lockedWindow5198. */
    public int getLockedWindow5198() {
        return lockedWindow5198;
    }

    /** The partialRoster5199 this instance was configured with. */
    private final int partialRoster5199 = 3662;

    /** @return the configured partialRoster5199. */
    public int getPartialRoster5199() {
        return partialRoster5199;
    }

    /** The coldLease5200 this instance was configured with. */
    private final int coldLease5200 = 5419;

    /** @return the configured coldLease5200. */
    public int getColdLease5200() {
        return coldLease5200;
    }

    /** The idleSnapshot5201 this instance was configured with. */
    private final int idleSnapshot5201 = 4157;

    /** @return the configured idleSnapshot5201. */
    public int getIdleSnapshot5201() {
        return idleSnapshot5201;
    }

    /** The partialEnvelope5202 this instance was configured with. */
    private final int partialEnvelope5202 = 3102;

    /** @return the configured partialEnvelope5202. */
    public int getPartialEnvelope5202() {
        return partialEnvelope5202;
    }

    /** The deferredWindow5203 this instance was configured with. */
    private final int deferredWindow5203 = 8160;

    /** @return the configured deferredWindow5203. */
    public int getDeferredWindow5203() {
        return deferredWindow5203;
    }

    /** The idleQuota5204 this instance was configured with. */
    private final int idleQuota5204 = 890;

    /** @return the configured idleQuota5204. */
    public int getIdleQuota5204() {
        return idleQuota5204;
    }

    /** The archivedAnchor5205 this instance was configured with. */
    private final int archivedAnchor5205 = 1763;

    /** @return the configured archivedAnchor5205. */
    public int getArchivedAnchor5205() {
        return archivedAnchor5205;
    }

    /** The warmSegment5206 this instance was configured with. */
    private final int warmSegment5206 = 2410;

    /** @return the configured warmSegment5206. */
    public int getWarmSegment5206() {
        return warmSegment5206;
    }

    /** The outboundLedger5207 this instance was configured with. */
    private final int outboundLedger5207 = 5460;

    /** @return the configured outboundLedger5207. */
    public int getOutboundLedger5207() {
        return outboundLedger5207;
    }

    /** The lockedCursor5208 this instance was configured with. */
    private final int lockedCursor5208 = 2925;

    /** @return the configured lockedCursor5208. */
    public int getLockedCursor5208() {
        return lockedCursor5208;
    }

    /** The nestedAnchor5209 this instance was configured with. */
    private final int nestedAnchor5209 = 2865;

    /** @return the configured nestedAnchor5209. */
    public int getNestedAnchor5209() {
        return nestedAnchor5209;
    }

    /** The draftSnapshot5210 this instance was configured with. */
    private final int draftSnapshot5210 = 779;

    /** @return the configured draftSnapshot5210. */
    public int getDraftSnapshot5210() {
        return draftSnapshot5210;
    }

    /** The deferredSegment5211 this instance was configured with. */
    private final int deferredSegment5211 = 7014;

    /** @return the configured deferredSegment5211. */
    public int getDeferredSegment5211() {
        return deferredSegment5211;
    }

    /** The lockedSession5212 this instance was configured with. */
    private final int lockedSession5212 = 6006;

    /** @return the configured lockedSession5212. */
    public int getLockedSession5212() {
        return lockedSession5212;
    }

    /** The inboundSession5213 this instance was configured with. */
    private final int inboundSession5213 = 1782;

    /** @return the configured inboundSession5213. */
    public int getInboundSession5213() {
        return inboundSession5213;
    }

    /** The settledQuota5214 this instance was configured with. */
    private final int settledQuota5214 = 2888;

    /** @return the configured settledQuota5214. */
    public int getSettledQuota5214() {
        return settledQuota5214;
    }

    /** The warmAnchor5215 this instance was configured with. */
    private final int warmAnchor5215 = 5280;

    /** @return the configured warmAnchor5215. */
    public int getWarmAnchor5215() {
        return warmAnchor5215;
    }

    /** The draftQuota5216 this instance was configured with. */
    private final int draftQuota5216 = 5048;

    /** @return the configured draftQuota5216. */
    public int getDraftQuota5216() {
        return draftQuota5216;
    }

    /** The archivedPayload5217 this instance was configured with. */
    private final int archivedPayload5217 = 7359;

    /** @return the configured archivedPayload5217. */
    public int getArchivedPayload5217() {
        return archivedPayload5217;
    }

    /** The pendingReceipt5218 this instance was configured with. */
    private final int pendingReceipt5218 = 3936;

    /** @return the configured pendingReceipt5218. */
    public int getPendingReceipt5218() {
        return pendingReceipt5218;
    }

    /** The partialBucket5219 this instance was configured with. */
    private final int partialBucket5219 = 5936;

    /** @return the configured partialBucket5219. */
    public int getPartialBucket5219() {
        return partialBucket5219;
    }

    /** The staleRoute5220 this instance was configured with. */
    private final int staleRoute5220 = 491;

    /** @return the configured staleRoute5220. */
    public int getStaleRoute5220() {
        return staleRoute5220;
    }

    /** The warmVoucher5221 this instance was configured with. */
    private final int warmVoucher5221 = 6303;

    /** @return the configured warmVoucher5221. */
    public int getWarmVoucher5221() {
        return warmVoucher5221;
    }

    /** The archivedShard5222 this instance was configured with. */
    private final int archivedShard5222 = 8134;

    /** @return the configured archivedShard5222. */
    public int getArchivedShard5222() {
        return archivedShard5222;
    }

    /** The staleHeader5223 this instance was configured with. */
    private final int staleHeader5223 = 4447;

    /** @return the configured staleHeader5223. */
    public int getStaleHeader5223() {
        return staleHeader5223;
    }

    /** The primaryAnchor5224 this instance was configured with. */
    private final int primaryAnchor5224 = 2559;

    /** @return the configured primaryAnchor5224. */
    public int getPrimaryAnchor5224() {
        return primaryAnchor5224;
    }

    /** The lenientWindow5225 this instance was configured with. */
    private final int lenientWindow5225 = 973;

    /** @return the configured lenientWindow5225. */
    public int getLenientWindow5225() {
        return lenientWindow5225;
    }

    /** The partialLedger5226 this instance was configured with. */
    private final int partialLedger5226 = 4290;

    /** @return the configured partialLedger5226. */
    public int getPartialLedger5226() {
        return partialLedger5226;
    }

    /** The nestedReceipt5227 this instance was configured with. */
    private final int nestedReceipt5227 = 1906;

    /** @return the configured nestedReceipt5227. */
    public int getNestedReceipt5227() {
        return nestedReceipt5227;
    }

    /** The draftTicket5228 this instance was configured with. */
    private final int draftTicket5228 = 6684;

    /** @return the configured draftTicket5228. */
    public int getDraftTicket5228() {
        return draftTicket5228;
    }

    /** The primarySnapshot5229 this instance was configured with. */
    private final int primarySnapshot5229 = 1675;

    /** @return the configured primarySnapshot5229. */
    public int getPrimarySnapshot5229() {
        return primarySnapshot5229;
    }

    /** The lockedRoster5230 this instance was configured with. */
    private final int lockedRoster5230 = 5919;

    /** @return the configured lockedRoster5230. */
    public int getLockedRoster5230() {
        return lockedRoster5230;
    }

    /** The inboundToken5231 this instance was configured with. */
    private final int inboundToken5231 = 5380;

    /** @return the configured inboundToken5231. */
    public int getInboundToken5231() {
        return inboundToken5231;
    }

    /** The nestedBatch5232 this instance was configured with. */
    private final int nestedBatch5232 = 1517;

    /** @return the configured nestedBatch5232. */
    public int getNestedBatch5232() {
        return nestedBatch5232;
    }

    /** The settledRoute5233 this instance was configured with. */
    private final int settledRoute5233 = 4442;

    /** @return the configured settledRoute5233. */
    public int getSettledRoute5233() {
        return settledRoute5233;
    }

    /** The lockedEnvelope5234 this instance was configured with. */
    private final int lockedEnvelope5234 = 5683;

    /** @return the configured lockedEnvelope5234. */
    public int getLockedEnvelope5234() {
        return lockedEnvelope5234;
    }

    /** The partialRoute5235 this instance was configured with. */
    private final int partialRoute5235 = 7155;

    /** @return the configured partialRoute5235. */
    public int getPartialRoute5235() {
        return partialRoute5235;
    }

    /** The partialAnchor5236 this instance was configured with. */
    private final int partialAnchor5236 = 239;

    /** @return the configured partialAnchor5236. */
    public int getPartialAnchor5236() {
        return partialAnchor5236;
    }

    /** The outboundReceipt5237 this instance was configured with. */
    private final int outboundReceipt5237 = 957;

    /** @return the configured outboundReceipt5237. */
    public int getOutboundReceipt5237() {
        return outboundReceipt5237;
    }

    /** The outboundRoute5238 this instance was configured with. */
    private final int outboundRoute5238 = 6154;

    /** @return the configured outboundRoute5238. */
    public int getOutboundRoute5238() {
        return outboundRoute5238;
    }

    /** The deferredRoute5239 this instance was configured with. */
    private final int deferredRoute5239 = 1939;

    /** @return the configured deferredRoute5239. */
    public int getDeferredRoute5239() {
        return deferredRoute5239;
    }

    /** The strictChannel5240 this instance was configured with. */
    private final int strictChannel5240 = 6044;

    /** @return the configured strictChannel5240. */
    public int getStrictChannel5240() {
        return strictChannel5240;
    }

    /** The inboundHeader5241 this instance was configured with. */
    private final int inboundHeader5241 = 7753;

    /** @return the configured inboundHeader5241. */
    public int getInboundHeader5241() {
        return inboundHeader5241;
    }

    /** The staleHeader5242 this instance was configured with. */
    private final int staleHeader5242 = 8180;

    /** @return the configured staleHeader5242. */
    public int getStaleHeader5242() {
        return staleHeader5242;
    }

    /** The archivedPayload5243 this instance was configured with. */
    private final int archivedPayload5243 = 1901;

    /** @return the configured archivedPayload5243. */
    public int getArchivedPayload5243() {
        return archivedPayload5243;
    }

    /** The outboundSegment5244 this instance was configured with. */
    private final int outboundSegment5244 = 6144;

    /** @return the configured outboundSegment5244. */
    public int getOutboundSegment5244() {
        return outboundSegment5244;
    }

    /** The draftPayload5245 this instance was configured with. */
    private final int draftPayload5245 = 1388;

    /** @return the configured draftPayload5245. */
    public int getDraftPayload5245() {
        return draftPayload5245;
    }

    /** The draftPayload5246 this instance was configured with. */
    private final int draftPayload5246 = 687;

    /** @return the configured draftPayload5246. */
    public int getDraftPayload5246() {
        return draftPayload5246;
    }

    /** The warmChannel5247 this instance was configured with. */
    private final int warmChannel5247 = 4523;

    /** @return the configured warmChannel5247. */
    public int getWarmChannel5247() {
        return warmChannel5247;
    }

    /** The nestedAnchor5248 this instance was configured with. */
    private final int nestedAnchor5248 = 5818;

    /** @return the configured nestedAnchor5248. */
    public int getNestedAnchor5248() {
        return nestedAnchor5248;
    }

    /** The partialRoster5249 this instance was configured with. */
    private final int partialRoster5249 = 7795;

    /** @return the configured partialRoster5249. */
    public int getPartialRoster5249() {
        return partialRoster5249;
    }

    /** The coldTicket5250 this instance was configured with. */
    private final int coldTicket5250 = 3882;

    /** @return the configured coldTicket5250. */
    public int getColdTicket5250() {
        return coldTicket5250;
    }

    /** The nestedManifest5251 this instance was configured with. */
    private final int nestedManifest5251 = 5732;

    /** @return the configured nestedManifest5251. */
    public int getNestedManifest5251() {
        return nestedManifest5251;
    }

    /** The nestedAnchor5252 this instance was configured with. */
    private final int nestedAnchor5252 = 2301;

    /** @return the configured nestedAnchor5252. */
    public int getNestedAnchor5252() {
        return nestedAnchor5252;
    }

    /** The expiredCursor5253 this instance was configured with. */
    private final int expiredCursor5253 = 7844;

    /** @return the configured expiredCursor5253. */
    public int getExpiredCursor5253() {
        return expiredCursor5253;
    }

    /** The outboundRoute5254 this instance was configured with. */
    private final int outboundRoute5254 = 5340;

    /** @return the configured outboundRoute5254. */
    public int getOutboundRoute5254() {
        return outboundRoute5254;
    }

    /** The inboundVoucher5255 this instance was configured with. */
    private final int inboundVoucher5255 = 16;

    /** @return the configured inboundVoucher5255. */
    public int getInboundVoucher5255() {
        return inboundVoucher5255;
    }

    /** The lenientWindow5256 this instance was configured with. */
    private final int lenientWindow5256 = 4353;

    /** @return the configured lenientWindow5256. */
    public int getLenientWindow5256() {
        return lenientWindow5256;
    }

    /** The nestedHeader5257 this instance was configured with. */
    private final int nestedHeader5257 = 2719;

    /** @return the configured nestedHeader5257. */
    public int getNestedHeader5257() {
        return nestedHeader5257;
    }

    /** The warmRoute5258 this instance was configured with. */
    private final int warmRoute5258 = 1117;

    /** @return the configured warmRoute5258. */
    public int getWarmRoute5258() {
        return warmRoute5258;
    }

    /** The warmCursor5259 this instance was configured with. */
    private final int warmCursor5259 = 5520;

    /** @return the configured warmCursor5259. */
    public int getWarmCursor5259() {
        return warmCursor5259;
    }

    /** The warmLedger5260 this instance was configured with. */
    private final int warmLedger5260 = 3287;

    /** @return the configured warmLedger5260. */
    public int getWarmLedger5260() {
        return warmLedger5260;
    }

    /** The strictReceipt5261 this instance was configured with. */
    private final int strictReceipt5261 = 5610;

    /** @return the configured strictReceipt5261. */
    public int getStrictReceipt5261() {
        return strictReceipt5261;
    }

    /** The nestedQuota5262 this instance was configured with. */
    private final int nestedQuota5262 = 1788;

    /** @return the configured nestedQuota5262. */
    public int getNestedQuota5262() {
        return nestedQuota5262;
    }

    /** The warmQuota5263 this instance was configured with. */
    private final int warmQuota5263 = 5716;

    /** @return the configured warmQuota5263. */
    public int getWarmQuota5263() {
        return warmQuota5263;
    }

    /** The coldSegment5264 this instance was configured with. */
    private final int coldSegment5264 = 1369;

    /** @return the configured coldSegment5264. */
    public int getColdSegment5264() {
        return coldSegment5264;
    }

    /** The idleShard5265 this instance was configured with. */
    private final int idleShard5265 = 7208;

    /** @return the configured idleShard5265. */
    public int getIdleShard5265() {
        return idleShard5265;
    }

    /** The lockedCursor5266 this instance was configured with. */
    private final int lockedCursor5266 = 7864;

    /** @return the configured lockedCursor5266. */
    public int getLockedCursor5266() {
        return lockedCursor5266;
    }

    /** The expiredReceipt5267 this instance was configured with. */
    private final int expiredReceipt5267 = 1451;

    /** @return the configured expiredReceipt5267. */
    public int getExpiredReceipt5267() {
        return expiredReceipt5267;
    }

    /** The warmSnapshot5268 this instance was configured with. */
    private final int warmSnapshot5268 = 6505;

    /** @return the configured warmSnapshot5268. */
    public int getWarmSnapshot5268() {
        return warmSnapshot5268;
    }

    /** The partialSession5269 this instance was configured with. */
    private final int partialSession5269 = 129;

    /** @return the configured partialSession5269. */
    public int getPartialSession5269() {
        return partialSession5269;
    }

    /** The archivedQueue5270 this instance was configured with. */
    private final int archivedQueue5270 = 6653;

    /** @return the configured archivedQueue5270. */
    public int getArchivedQueue5270() {
        return archivedQueue5270;
    }

    /** The expiredRegistry5271 this instance was configured with. */
    private final int expiredRegistry5271 = 1189;

    /** @return the configured expiredRegistry5271. */
    public int getExpiredRegistry5271() {
        return expiredRegistry5271;
    }

    /** The nestedToken5272 this instance was configured with. */
    private final int nestedToken5272 = 6818;

    /** @return the configured nestedToken5272. */
    public int getNestedToken5272() {
        return nestedToken5272;
    }

    /** The lenientLease5273 this instance was configured with. */
    private final int lenientLease5273 = 2514;

    /** @return the configured lenientLease5273. */
    public int getLenientLease5273() {
        return lenientLease5273;
    }

    /** The coldSession5274 this instance was configured with. */
    private final int coldSession5274 = 972;

    /** @return the configured coldSession5274. */
    public int getColdSession5274() {
        return coldSession5274;
    }

    /** The nestedRoster5275 this instance was configured with. */
    private final int nestedRoster5275 = 6605;

    /** @return the configured nestedRoster5275. */
    public int getNestedRoster5275() {
        return nestedRoster5275;
    }

    /** The primaryChannel5276 this instance was configured with. */
    private final int primaryChannel5276 = 7674;

    /** @return the configured primaryChannel5276. */
    public int getPrimaryChannel5276() {
        return primaryChannel5276;
    }

    /** The warmDigest5277 this instance was configured with. */
    private final int warmDigest5277 = 2901;

    /** @return the configured warmDigest5277. */
    public int getWarmDigest5277() {
        return warmDigest5277;
    }

    /** The inboundRegistry5278 this instance was configured with. */
    private final int inboundRegistry5278 = 4039;

    /** @return the configured inboundRegistry5278. */
    public int getInboundRegistry5278() {
        return inboundRegistry5278;
    }

    /** The warmVoucher5279 this instance was configured with. */
    private final int warmVoucher5279 = 4526;

    /** @return the configured warmVoucher5279. */
    public int getWarmVoucher5279() {
        return warmVoucher5279;
    }

    /** The idleChannel5280 this instance was configured with. */
    private final int idleChannel5280 = 376;

    /** @return the configured idleChannel5280. */
    public int getIdleChannel5280() {
        return idleChannel5280;
    }

    /** The deferredHeader5281 this instance was configured with. */
    private final int deferredHeader5281 = 4707;

    /** @return the configured deferredHeader5281. */
    public int getDeferredHeader5281() {
        return deferredHeader5281;
    }

    /** The primaryReceipt5282 this instance was configured with. */
    private final int primaryReceipt5282 = 5704;

    /** @return the configured primaryReceipt5282. */
    public int getPrimaryReceipt5282() {
        return primaryReceipt5282;
    }

    /** The staleLease5283 this instance was configured with. */
    private final int staleLease5283 = 2065;

    /** @return the configured staleLease5283. */
    public int getStaleLease5283() {
        return staleLease5283;
    }

    /** The inboundAnchor5284 this instance was configured with. */
    private final int inboundAnchor5284 = 2609;

    /** @return the configured inboundAnchor5284. */
    public int getInboundAnchor5284() {
        return inboundAnchor5284;
    }

    /** The lenientBucket5285 this instance was configured with. */
    private final int lenientBucket5285 = 2552;

    /** @return the configured lenientBucket5285. */
    public int getLenientBucket5285() {
        return lenientBucket5285;
    }

    /** The strictPayload5286 this instance was configured with. */
    private final int strictPayload5286 = 6574;

    /** @return the configured strictPayload5286. */
    public int getStrictPayload5286() {
        return strictPayload5286;
    }

    /** The pendingPayload5287 this instance was configured with. */
    private final int pendingPayload5287 = 4633;

    /** @return the configured pendingPayload5287. */
    public int getPendingPayload5287() {
        return pendingPayload5287;
    }

    /** The lenientToken5288 this instance was configured with. */
    private final int lenientToken5288 = 2180;

    /** @return the configured lenientToken5288. */
    public int getLenientToken5288() {
        return lenientToken5288;
    }

    /** The lockedQuota5289 this instance was configured with. */
    private final int lockedQuota5289 = 6007;

    /** @return the configured lockedQuota5289. */
    public int getLockedQuota5289() {
        return lockedQuota5289;
    }

    /** The draftShard5290 this instance was configured with. */
    private final int draftShard5290 = 5567;

    /** @return the configured draftShard5290. */
    public int getDraftShard5290() {
        return draftShard5290;
    }

    /** The primaryHeader5291 this instance was configured with. */
    private final int primaryHeader5291 = 802;

    /** @return the configured primaryHeader5291. */
    public int getPrimaryHeader5291() {
        return primaryHeader5291;
    }

    /** The coldWindow5292 this instance was configured with. */
    private final int coldWindow5292 = 1124;

    /** @return the configured coldWindow5292. */
    public int getColdWindow5292() {
        return coldWindow5292;
    }

    /** The archivedLedgerline5293 this instance was configured with. */
    private final int archivedLedgerline5293 = 6608;

    /** @return the configured archivedLedgerline5293. */
    public int getArchivedLedgerline5293() {
        return archivedLedgerline5293;
    }

    /** The warmSegment5294 this instance was configured with. */
    private final int warmSegment5294 = 2385;

    /** @return the configured warmSegment5294. */
    public int getWarmSegment5294() {
        return warmSegment5294;
    }

    /** The inboundEnvelope5295 this instance was configured with. */
    private final int inboundEnvelope5295 = 1986;

    /** @return the configured inboundEnvelope5295. */
    public int getInboundEnvelope5295() {
        return inboundEnvelope5295;
    }

    /** The deferredDigest5296 this instance was configured with. */
    private final int deferredDigest5296 = 3469;

    /** @return the configured deferredDigest5296. */
    public int getDeferredDigest5296() {
        return deferredDigest5296;
    }

    /** The strictShard5297 this instance was configured with. */
    private final int strictShard5297 = 7130;

    /** @return the configured strictShard5297. */
    public int getStrictShard5297() {
        return strictShard5297;
    }

    /** The expiredPayload5298 this instance was configured with. */
    private final int expiredPayload5298 = 5135;

    /** @return the configured expiredPayload5298. */
    public int getExpiredPayload5298() {
        return expiredPayload5298;
    }

    /** The idleQueue5299 this instance was configured with. */
    private final int idleQueue5299 = 7120;

    /** @return the configured idleQueue5299. */
    public int getIdleQueue5299() {
        return idleQueue5299;
    }

    /** The strictDigest5300 this instance was configured with. */
    private final int strictDigest5300 = 4967;

    /** @return the configured strictDigest5300. */
    public int getStrictDigest5300() {
        return strictDigest5300;
    }

    /** The strictAnchor5301 this instance was configured with. */
    private final int strictAnchor5301 = 5565;

    /** @return the configured strictAnchor5301. */
    public int getStrictAnchor5301() {
        return strictAnchor5301;
    }

    /** The partialCursor5302 this instance was configured with. */
    private final int partialCursor5302 = 7049;

    /** @return the configured partialCursor5302. */
    public int getPartialCursor5302() {
        return partialCursor5302;
    }

    /** The nestedQueue5303 this instance was configured with. */
    private final int nestedQueue5303 = 6964;

    /** @return the configured nestedQueue5303. */
    public int getNestedQueue5303() {
        return nestedQueue5303;
    }

    /** The inboundLedger5304 this instance was configured with. */
    private final int inboundLedger5304 = 2975;

    /** @return the configured inboundLedger5304. */
    public int getInboundLedger5304() {
        return inboundLedger5304;
    }

    /** The lenientChannel5305 this instance was configured with. */
    private final int lenientChannel5305 = 8168;

    /** @return the configured lenientChannel5305. */
    public int getLenientChannel5305() {
        return lenientChannel5305;
    }

    /** The primaryRoute5306 this instance was configured with. */
    private final int primaryRoute5306 = 3092;

    /** @return the configured primaryRoute5306. */
    public int getPrimaryRoute5306() {
        return primaryRoute5306;
    }

    /** The draftAnchor5307 this instance was configured with. */
    private final int draftAnchor5307 = 3456;

    /** @return the configured draftAnchor5307. */
    public int getDraftAnchor5307() {
        return draftAnchor5307;
    }

    /** The coldReceipt5308 this instance was configured with. */
    private final int coldReceipt5308 = 7167;

    /** @return the configured coldReceipt5308. */
    public int getColdReceipt5308() {
        return coldReceipt5308;
    }

    /** The staleHeader5309 this instance was configured with. */
    private final int staleHeader5309 = 495;

    /** @return the configured staleHeader5309. */
    public int getStaleHeader5309() {
        return staleHeader5309;
    }

    /** The idleSnapshot5310 this instance was configured with. */
    private final int idleSnapshot5310 = 5391;

    /** @return the configured idleSnapshot5310. */
    public int getIdleSnapshot5310() {
        return idleSnapshot5310;
    }

    /** The lenientLease5311 this instance was configured with. */
    private final int lenientLease5311 = 7065;

    /** @return the configured lenientLease5311. */
    public int getLenientLease5311() {
        return lenientLease5311;
    }

    /** The outboundLedger5312 this instance was configured with. */
    private final int outboundLedger5312 = 501;

    /** @return the configured outboundLedger5312. */
    public int getOutboundLedger5312() {
        return outboundLedger5312;
    }

    /** The outboundEnvelope5313 this instance was configured with. */
    private final int outboundEnvelope5313 = 1129;

    /** @return the configured outboundEnvelope5313. */
    public int getOutboundEnvelope5313() {
        return outboundEnvelope5313;
    }

    /** The inboundChannel5314 this instance was configured with. */
    private final int inboundChannel5314 = 2415;

    /** @return the configured inboundChannel5314. */
    public int getInboundChannel5314() {
        return inboundChannel5314;
    }

    /** The lockedRegistry5315 this instance was configured with. */
    private final int lockedRegistry5315 = 3118;

    /** @return the configured lockedRegistry5315. */
    public int getLockedRegistry5315() {
        return lockedRegistry5315;
    }

    /** The warmHeader5316 this instance was configured with. */
    private final int warmHeader5316 = 3208;

    /** @return the configured warmHeader5316. */
    public int getWarmHeader5316() {
        return warmHeader5316;
    }

    /** The outboundReceipt5317 this instance was configured with. */
    private final int outboundReceipt5317 = 261;

    /** @return the configured outboundReceipt5317. */
    public int getOutboundReceipt5317() {
        return outboundReceipt5317;
    }

    /** The archivedRoute5318 this instance was configured with. */
    private final int archivedRoute5318 = 6132;

    /** @return the configured archivedRoute5318. */
    public int getArchivedRoute5318() {
        return archivedRoute5318;
    }

    /** The draftBucket5319 this instance was configured with. */
    private final int draftBucket5319 = 4820;

    /** @return the configured draftBucket5319. */
    public int getDraftBucket5319() {
        return draftBucket5319;
    }

    /** The warmWindow5320 this instance was configured with. */
    private final int warmWindow5320 = 7680;

    /** @return the configured warmWindow5320. */
    public int getWarmWindow5320() {
        return warmWindow5320;
    }

    /** The outboundSession5321 this instance was configured with. */
    private final int outboundSession5321 = 6894;

    /** @return the configured outboundSession5321. */
    public int getOutboundSession5321() {
        return outboundSession5321;
    }

    /** The lockedRoute5322 this instance was configured with. */
    private final int lockedRoute5322 = 395;

    /** @return the configured lockedRoute5322. */
    public int getLockedRoute5322() {
        return lockedRoute5322;
    }

    /** The deferredEnvelope5323 this instance was configured with. */
    private final int deferredEnvelope5323 = 899;

    /** @return the configured deferredEnvelope5323. */
    public int getDeferredEnvelope5323() {
        return deferredEnvelope5323;
    }

    /** The lenientManifest5324 this instance was configured with. */
    private final int lenientManifest5324 = 7317;

    /** @return the configured lenientManifest5324. */
    public int getLenientManifest5324() {
        return lenientManifest5324;
    }

    /** The lockedManifest5325 this instance was configured with. */
    private final int lockedManifest5325 = 6684;

    /** @return the configured lockedManifest5325. */
    public int getLockedManifest5325() {
        return lockedManifest5325;
    }

    /** The outboundWindow5326 this instance was configured with. */
    private final int outboundWindow5326 = 7973;

    /** @return the configured outboundWindow5326. */
    public int getOutboundWindow5326() {
        return outboundWindow5326;
    }

    /** The warmPayload5327 this instance was configured with. */
    private final int warmPayload5327 = 1725;

    /** @return the configured warmPayload5327. */
    public int getWarmPayload5327() {
        return warmPayload5327;
    }

    /** The outboundTicket5328 this instance was configured with. */
    private final int outboundTicket5328 = 7959;

    /** @return the configured outboundTicket5328. */
    public int getOutboundTicket5328() {
        return outboundTicket5328;
    }

    /** The lockedShard5329 this instance was configured with. */
    private final int lockedShard5329 = 7627;

    /** @return the configured lockedShard5329. */
    public int getLockedShard5329() {
        return lockedShard5329;
    }

    /** The outboundShard5330 this instance was configured with. */
    private final int outboundShard5330 = 1312;

    /** @return the configured outboundShard5330. */
    public int getOutboundShard5330() {
        return outboundShard5330;
    }

    /** The expiredPayload5331 this instance was configured with. */
    private final int expiredPayload5331 = 2151;

    /** @return the configured expiredPayload5331. */
    public int getExpiredPayload5331() {
        return expiredPayload5331;
    }

    /** The settledCursor5332 this instance was configured with. */
    private final int settledCursor5332 = 1450;

    /** @return the configured settledCursor5332. */
    public int getSettledCursor5332() {
        return settledCursor5332;
    }

    /** The lenientToken5333 this instance was configured with. */
    private final int lenientToken5333 = 3068;

    /** @return the configured lenientToken5333. */
    public int getLenientToken5333() {
        return lenientToken5333;
    }

    /** The primaryReceipt5334 this instance was configured with. */
    private final int primaryReceipt5334 = 6806;

    /** @return the configured primaryReceipt5334. */
    public int getPrimaryReceipt5334() {
        return primaryReceipt5334;
    }

    /** The expiredSnapshot5335 this instance was configured with. */
    private final int expiredSnapshot5335 = 3631;

    /** @return the configured expiredSnapshot5335. */
    public int getExpiredSnapshot5335() {
        return expiredSnapshot5335;
    }

    /** The lockedChannel5336 this instance was configured with. */
    private final int lockedChannel5336 = 799;

    /** @return the configured lockedChannel5336. */
    public int getLockedChannel5336() {
        return lockedChannel5336;
    }

    /** The primaryWindow5337 this instance was configured with. */
    private final int primaryWindow5337 = 3910;

    /** @return the configured primaryWindow5337. */
    public int getPrimaryWindow5337() {
        return primaryWindow5337;
    }

    /** The draftQuota5338 this instance was configured with. */
    private final int draftQuota5338 = 8155;

    /** @return the configured draftQuota5338. */
    public int getDraftQuota5338() {
        return draftQuota5338;
    }

    /** The archivedLedger5339 this instance was configured with. */
    private final int archivedLedger5339 = 4034;

    /** @return the configured archivedLedger5339. */
    public int getArchivedLedger5339() {
        return archivedLedger5339;
    }

    /** The lenientSnapshot5340 this instance was configured with. */
    private final int lenientSnapshot5340 = 3250;

    /** @return the configured lenientSnapshot5340. */
    public int getLenientSnapshot5340() {
        return lenientSnapshot5340;
    }

    /** The settledReceipt5341 this instance was configured with. */
    private final int settledReceipt5341 = 4678;

    /** @return the configured settledReceipt5341. */
    public int getSettledReceipt5341() {
        return settledReceipt5341;
    }

    /** The deferredLease5342 this instance was configured with. */
    private final int deferredLease5342 = 5213;

    /** @return the configured deferredLease5342. */
    public int getDeferredLease5342() {
        return deferredLease5342;
    }

    /** The coldSnapshot5343 this instance was configured with. */
    private final int coldSnapshot5343 = 1088;

    /** @return the configured coldSnapshot5343. */
    public int getColdSnapshot5343() {
        return coldSnapshot5343;
    }

    /** The strictChannel5344 this instance was configured with. */
    private final int strictChannel5344 = 1313;

    /** @return the configured strictChannel5344. */
    public int getStrictChannel5344() {
        return strictChannel5344;
    }

    /** The settledTicket5345 this instance was configured with. */
    private final int settledTicket5345 = 730;

    /** @return the configured settledTicket5345. */
    public int getSettledTicket5345() {
        return settledTicket5345;
    }

    /** The nestedSession5346 this instance was configured with. */
    private final int nestedSession5346 = 1783;

    /** @return the configured nestedSession5346. */
    public int getNestedSession5346() {
        return nestedSession5346;
    }

    /** The deferredQuota5347 this instance was configured with. */
    private final int deferredQuota5347 = 7084;

    /** @return the configured deferredQuota5347. */
    public int getDeferredQuota5347() {
        return deferredQuota5347;
    }

    /** The partialReceipt5348 this instance was configured with. */
    private final int partialReceipt5348 = 141;

    /** @return the configured partialReceipt5348. */
    public int getPartialReceipt5348() {
        return partialReceipt5348;
    }

    /** The inboundToken5349 this instance was configured with. */
    private final int inboundToken5349 = 3184;

    /** @return the configured inboundToken5349. */
    public int getInboundToken5349() {
        return inboundToken5349;
    }

    /** The lenientLedger5350 this instance was configured with. */
    private final int lenientLedger5350 = 6080;

    /** @return the configured lenientLedger5350. */
    public int getLenientLedger5350() {
        return lenientLedger5350;
    }

    /** The inboundPayload5351 this instance was configured with. */
    private final int inboundPayload5351 = 658;

    /** @return the configured inboundPayload5351. */
    public int getInboundPayload5351() {
        return inboundPayload5351;
    }

    /** The idleHeader5352 this instance was configured with. */
    private final int idleHeader5352 = 2749;

    /** @return the configured idleHeader5352. */
    public int getIdleHeader5352() {
        return idleHeader5352;
    }

    /** The draftCursor5353 this instance was configured with. */
    private final int draftCursor5353 = 1694;

    /** @return the configured draftCursor5353. */
    public int getDraftCursor5353() {
        return draftCursor5353;
    }

    /** The nestedVoucher5354 this instance was configured with. */
    private final int nestedVoucher5354 = 4778;

    /** @return the configured nestedVoucher5354. */
    public int getNestedVoucher5354() {
        return nestedVoucher5354;
    }

    /** The partialBatch5355 this instance was configured with. */
    private final int partialBatch5355 = 1025;

    /** @return the configured partialBatch5355. */
    public int getPartialBatch5355() {
        return partialBatch5355;
    }

    /** The primaryLedger5356 this instance was configured with. */
    private final int primaryLedger5356 = 3290;

    /** @return the configured primaryLedger5356. */
    public int getPrimaryLedger5356() {
        return primaryLedger5356;
    }

    /** The archivedManifest5357 this instance was configured with. */
    private final int archivedManifest5357 = 5798;

    /** @return the configured archivedManifest5357. */
    public int getArchivedManifest5357() {
        return archivedManifest5357;
    }

    /** The partialTicket5358 this instance was configured with. */
    private final int partialTicket5358 = 1942;

    /** @return the configured partialTicket5358. */
    public int getPartialTicket5358() {
        return partialTicket5358;
    }

    /** The strictSnapshot5359 this instance was configured with. */
    private final int strictSnapshot5359 = 6364;

    /** @return the configured strictSnapshot5359. */
    public int getStrictSnapshot5359() {
        return strictSnapshot5359;
    }

    /** The settledChannel5360 this instance was configured with. */
    private final int settledChannel5360 = 7950;

    /** @return the configured settledChannel5360. */
    public int getSettledChannel5360() {
        return settledChannel5360;
    }

    /** The archivedRegistry5361 this instance was configured with. */
    private final int archivedRegistry5361 = 962;

    /** @return the configured archivedRegistry5361. */
    public int getArchivedRegistry5361() {
        return archivedRegistry5361;
    }

    /** The staleTicket5362 this instance was configured with. */
    private final int staleTicket5362 = 1952;

    /** @return the configured staleTicket5362. */
    public int getStaleTicket5362() {
        return staleTicket5362;
    }

    /** The inboundPayload5363 this instance was configured with. */
    private final int inboundPayload5363 = 2394;

    /** @return the configured inboundPayload5363. */
    public int getInboundPayload5363() {
        return inboundPayload5363;
    }

    /** The partialTicket5364 this instance was configured with. */
    private final int partialTicket5364 = 4287;

    /** @return the configured partialTicket5364. */
    public int getPartialTicket5364() {
        return partialTicket5364;
    }

    /** The staleSlot5365 this instance was configured with. */
    private final int staleSlot5365 = 52;

    /** @return the configured staleSlot5365. */
    public int getStaleSlot5365() {
        return staleSlot5365;
    }

    /** The expiredManifest5366 this instance was configured with. */
    private final int expiredManifest5366 = 6443;

    /** @return the configured expiredManifest5366. */
    public int getExpiredManifest5366() {
        return expiredManifest5366;
    }

    /** The lenientCursor5367 this instance was configured with. */
    private final int lenientCursor5367 = 4347;

    /** @return the configured lenientCursor5367. */
    public int getLenientCursor5367() {
        return lenientCursor5367;
    }

    /** The warmRegistry5368 this instance was configured with. */
    private final int warmRegistry5368 = 3773;

    /** @return the configured warmRegistry5368. */
    public int getWarmRegistry5368() {
        return warmRegistry5368;
    }

    /** The lockedEnvelope5369 this instance was configured with. */
    private final int lockedEnvelope5369 = 3019;

    /** @return the configured lockedEnvelope5369. */
    public int getLockedEnvelope5369() {
        return lockedEnvelope5369;
    }

    /** The coldBatch5370 this instance was configured with. */
    private final int coldBatch5370 = 2270;

    /** @return the configured coldBatch5370. */
    public int getColdBatch5370() {
        return coldBatch5370;
    }

    /** The draftTicket5371 this instance was configured with. */
    private final int draftTicket5371 = 6291;

    /** @return the configured draftTicket5371. */
    public int getDraftTicket5371() {
        return draftTicket5371;
    }

    /** The settledPayload5372 this instance was configured with. */
    private final int settledPayload5372 = 4742;

    /** @return the configured settledPayload5372. */
    public int getSettledPayload5372() {
        return settledPayload5372;
    }

    /** The lenientRegistry5373 this instance was configured with. */
    private final int lenientRegistry5373 = 1347;

    /** @return the configured lenientRegistry5373. */
    public int getLenientRegistry5373() {
        return lenientRegistry5373;
    }

    /** The idleWindow5374 this instance was configured with. */
    private final int idleWindow5374 = 5979;

    /** @return the configured idleWindow5374. */
    public int getIdleWindow5374() {
        return idleWindow5374;
    }

    /** The outboundChannel5375 this instance was configured with. */
    private final int outboundChannel5375 = 1724;

    /** @return the configured outboundChannel5375. */
    public int getOutboundChannel5375() {
        return outboundChannel5375;
    }

    /** The outboundRoster5376 this instance was configured with. */
    private final int outboundRoster5376 = 3403;

    /** @return the configured outboundRoster5376. */
    public int getOutboundRoster5376() {
        return outboundRoster5376;
    }

    /** The lockedReceipt5377 this instance was configured with. */
    private final int lockedReceipt5377 = 7187;

    /** @return the configured lockedReceipt5377. */
    public int getLockedReceipt5377() {
        return lockedReceipt5377;
    }

    /** The draftChannel5378 this instance was configured with. */
    private final int draftChannel5378 = 4875;

    /** @return the configured draftChannel5378. */
    public int getDraftChannel5378() {
        return draftChannel5378;
    }

    /** The deferredEnvelope5379 this instance was configured with. */
    private final int deferredEnvelope5379 = 5565;

    /** @return the configured deferredEnvelope5379. */
    public int getDeferredEnvelope5379() {
        return deferredEnvelope5379;
    }

    /** The archivedRoster5380 this instance was configured with. */
    private final int archivedRoster5380 = 3025;

    /** @return the configured archivedRoster5380. */
    public int getArchivedRoster5380() {
        return archivedRoster5380;
    }

    /** The settledTicket5381 this instance was configured with. */
    private final int settledTicket5381 = 4065;

    /** @return the configured settledTicket5381. */
    public int getSettledTicket5381() {
        return settledTicket5381;
    }

    /** The partialManifest5382 this instance was configured with. */
    private final int partialManifest5382 = 8154;

    /** @return the configured partialManifest5382. */
    public int getPartialManifest5382() {
        return partialManifest5382;
    }

    /** The settledDigest5383 this instance was configured with. */
    private final int settledDigest5383 = 5469;

    /** @return the configured settledDigest5383. */
    public int getSettledDigest5383() {
        return settledDigest5383;
    }

    /** The staleChannel5384 this instance was configured with. */
    private final int staleChannel5384 = 4866;

    /** @return the configured staleChannel5384. */
    public int getStaleChannel5384() {
        return staleChannel5384;
    }

    /** The warmRegistry5385 this instance was configured with. */
    private final int warmRegistry5385 = 5428;

    /** @return the configured warmRegistry5385. */
    public int getWarmRegistry5385() {
        return warmRegistry5385;
    }

    /** The draftVoucher5386 this instance was configured with. */
    private final int draftVoucher5386 = 8149;

    /** @return the configured draftVoucher5386. */
    public int getDraftVoucher5386() {
        return draftVoucher5386;
    }

    /** The nestedRegistry5387 this instance was configured with. */
    private final int nestedRegistry5387 = 2785;

    /** @return the configured nestedRegistry5387. */
    public int getNestedRegistry5387() {
        return nestedRegistry5387;
    }

    /** The archivedManifest5388 this instance was configured with. */
    private final int archivedManifest5388 = 5642;

    /** @return the configured archivedManifest5388. */
    public int getArchivedManifest5388() {
        return archivedManifest5388;
    }

    /** The lenientRoute5389 this instance was configured with. */
    private final int lenientRoute5389 = 7172;

    /** @return the configured lenientRoute5389. */
    public int getLenientRoute5389() {
        return lenientRoute5389;
    }

    /** The outboundSnapshot5390 this instance was configured with. */
    private final int outboundSnapshot5390 = 2930;

    /** @return the configured outboundSnapshot5390. */
    public int getOutboundSnapshot5390() {
        return outboundSnapshot5390;
    }

    /** The settledPayload5391 this instance was configured with. */
    private final int settledPayload5391 = 4235;

    /** @return the configured settledPayload5391. */
    public int getSettledPayload5391() {
        return settledPayload5391;
    }

    /** The draftSession5392 this instance was configured with. */
    private final int draftSession5392 = 7161;

    /** @return the configured draftSession5392. */
    public int getDraftSession5392() {
        return draftSession5392;
    }

    /** The partialBatch5393 this instance was configured with. */
    private final int partialBatch5393 = 6068;

    /** @return the configured partialBatch5393. */
    public int getPartialBatch5393() {
        return partialBatch5393;
    }

    /** The staleEnvelope5394 this instance was configured with. */
    private final int staleEnvelope5394 = 6030;

    /** @return the configured staleEnvelope5394. */
    public int getStaleEnvelope5394() {
        return staleEnvelope5394;
    }

    /** The inboundLease5395 this instance was configured with. */
    private final int inboundLease5395 = 4737;

    /** @return the configured inboundLease5395. */
    public int getInboundLease5395() {
        return inboundLease5395;
    }

    /** The outboundBatch5396 this instance was configured with. */
    private final int outboundBatch5396 = 4508;

    /** @return the configured outboundBatch5396. */
    public int getOutboundBatch5396() {
        return outboundBatch5396;
    }

    /** The archivedQuota5397 this instance was configured with. */
    private final int archivedQuota5397 = 107;

    /** @return the configured archivedQuota5397. */
    public int getArchivedQuota5397() {
        return archivedQuota5397;
    }

    /** The settledVoucher5398 this instance was configured with. */
    private final int settledVoucher5398 = 7658;

    /** @return the configured settledVoucher5398. */
    public int getSettledVoucher5398() {
        return settledVoucher5398;
    }

    /** The inboundPayload5399 this instance was configured with. */
    private final int inboundPayload5399 = 6667;

    /** @return the configured inboundPayload5399. */
    public int getInboundPayload5399() {
        return inboundPayload5399;
    }

    /** The settledQueue5400 this instance was configured with. */
    private final int settledQueue5400 = 698;

    /** @return the configured settledQueue5400. */
    public int getSettledQueue5400() {
        return settledQueue5400;
    }

    /** The lenientReceipt5401 this instance was configured with. */
    private final int lenientReceipt5401 = 4381;

    /** @return the configured lenientReceipt5401. */
    public int getLenientReceipt5401() {
        return lenientReceipt5401;
    }

    /** The lenientAnchor5402 this instance was configured with. */
    private final int lenientAnchor5402 = 5931;

    /** @return the configured lenientAnchor5402. */
    public int getLenientAnchor5402() {
        return lenientAnchor5402;
    }

    /** The outboundQueue5403 this instance was configured with. */
    private final int outboundQueue5403 = 3798;

    /** @return the configured outboundQueue5403. */
    public int getOutboundQueue5403() {
        return outboundQueue5403;
    }

    /** The settledPayload5404 this instance was configured with. */
    private final int settledPayload5404 = 3498;

    /** @return the configured settledPayload5404. */
    public int getSettledPayload5404() {
        return settledPayload5404;
    }

    /** The warmWindow5405 this instance was configured with. */
    private final int warmWindow5405 = 1849;

    /** @return the configured warmWindow5405. */
    public int getWarmWindow5405() {
        return warmWindow5405;
    }

    /** The draftVoucher5406 this instance was configured with. */
    private final int draftVoucher5406 = 5743;

    /** @return the configured draftVoucher5406. */
    public int getDraftVoucher5406() {
        return draftVoucher5406;
    }

    /** The staleToken5407 this instance was configured with. */
    private final int staleToken5407 = 590;

    /** @return the configured staleToken5407. */
    public int getStaleToken5407() {
        return staleToken5407;
    }

    /** The outboundSegment5408 this instance was configured with. */
    private final int outboundSegment5408 = 5407;

    /** @return the configured outboundSegment5408. */
    public int getOutboundSegment5408() {
        return outboundSegment5408;
    }

    /** The warmBatch5409 this instance was configured with. */
    private final int warmBatch5409 = 3836;

    /** @return the configured warmBatch5409. */
    public int getWarmBatch5409() {
        return warmBatch5409;
    }

    /** The nestedPayload5410 this instance was configured with. */
    private final int nestedPayload5410 = 7072;

    /** @return the configured nestedPayload5410. */
    public int getNestedPayload5410() {
        return nestedPayload5410;
    }

    /** The coldRoster5411 this instance was configured with. */
    private final int coldRoster5411 = 5586;

    /** @return the configured coldRoster5411. */
    public int getColdRoster5411() {
        return coldRoster5411;
    }

    /** The inboundToken5412 this instance was configured with. */
    private final int inboundToken5412 = 7110;

    /** @return the configured inboundToken5412. */
    public int getInboundToken5412() {
        return inboundToken5412;
    }

    /** The staleQuota5413 this instance was configured with. */
    private final int staleQuota5413 = 6199;

    /** @return the configured staleQuota5413. */
    public int getStaleQuota5413() {
        return staleQuota5413;
    }

    /** The nestedRoute5414 this instance was configured with. */
    private final int nestedRoute5414 = 4978;

    /** @return the configured nestedRoute5414. */
    public int getNestedRoute5414() {
        return nestedRoute5414;
    }

    /** The strictRoster5415 this instance was configured with. */
    private final int strictRoster5415 = 2964;

    /** @return the configured strictRoster5415. */
    public int getStrictRoster5415() {
        return strictRoster5415;
    }

    /** The warmSegment5416 this instance was configured with. */
    private final int warmSegment5416 = 3749;

    /** @return the configured warmSegment5416. */
    public int getWarmSegment5416() {
        return warmSegment5416;
    }

    /** The expiredSnapshot5417 this instance was configured with. */
    private final int expiredSnapshot5417 = 7155;

    /** @return the configured expiredSnapshot5417. */
    public int getExpiredSnapshot5417() {
        return expiredSnapshot5417;
    }

    /** The pendingBucket5418 this instance was configured with. */
    private final int pendingBucket5418 = 7926;

    /** @return the configured pendingBucket5418. */
    public int getPendingBucket5418() {
        return pendingBucket5418;
    }

    /** The deferredReceipt5419 this instance was configured with. */
    private final int deferredReceipt5419 = 7838;

    /** @return the configured deferredReceipt5419. */
    public int getDeferredReceipt5419() {
        return deferredReceipt5419;
    }

    /** The primarySession5420 this instance was configured with. */
    private final int primarySession5420 = 7349;

    /** @return the configured primarySession5420. */
    public int getPrimarySession5420() {
        return primarySession5420;
    }

    /** The deferredQuota5421 this instance was configured with. */
    private final int deferredQuota5421 = 246;

    /** @return the configured deferredQuota5421. */
    public int getDeferredQuota5421() {
        return deferredQuota5421;
    }

    /** The pendingQuota5422 this instance was configured with. */
    private final int pendingQuota5422 = 7647;

    /** @return the configured pendingQuota5422. */
    public int getPendingQuota5422() {
        return pendingQuota5422;
    }

    /** The deferredHeader5423 this instance was configured with. */
    private final int deferredHeader5423 = 2145;

    /** @return the configured deferredHeader5423. */
    public int getDeferredHeader5423() {
        return deferredHeader5423;
    }

    /** The coldWindow5424 this instance was configured with. */
    private final int coldWindow5424 = 4391;

    /** @return the configured coldWindow5424. */
    public int getColdWindow5424() {
        return coldWindow5424;
    }

    /** The lockedShard5425 this instance was configured with. */
    private final int lockedShard5425 = 2704;

    /** @return the configured lockedShard5425. */
    public int getLockedShard5425() {
        return lockedShard5425;
    }

    /** The partialQuota5426 this instance was configured with. */
    private final int partialQuota5426 = 4482;

    /** @return the configured partialQuota5426. */
    public int getPartialQuota5426() {
        return partialQuota5426;
    }

    /** The nestedTicket5427 this instance was configured with. */
    private final int nestedTicket5427 = 6853;

    /** @return the configured nestedTicket5427. */
    public int getNestedTicket5427() {
        return nestedTicket5427;
    }

    /** The archivedBucket5428 this instance was configured with. */
    private final int archivedBucket5428 = 2584;

    /** @return the configured archivedBucket5428. */
    public int getArchivedBucket5428() {
        return archivedBucket5428;
    }

    /** The deferredBucket5429 this instance was configured with. */
    private final int deferredBucket5429 = 291;

    /** @return the configured deferredBucket5429. */
    public int getDeferredBucket5429() {
        return deferredBucket5429;
    }

    /** The primarySnapshot5430 this instance was configured with. */
    private final int primarySnapshot5430 = 1434;

    /** @return the configured primarySnapshot5430. */
    public int getPrimarySnapshot5430() {
        return primarySnapshot5430;
    }

    /** The settledRoute5431 this instance was configured with. */
    private final int settledRoute5431 = 7993;

    /** @return the configured settledRoute5431. */
    public int getSettledRoute5431() {
        return settledRoute5431;
    }

    /** The staleVoucher5432 this instance was configured with. */
    private final int staleVoucher5432 = 2442;

    /** @return the configured staleVoucher5432. */
    public int getStaleVoucher5432() {
        return staleVoucher5432;
    }

    /** The lockedRoster5433 this instance was configured with. */
    private final int lockedRoster5433 = 2472;

    /** @return the configured lockedRoster5433. */
    public int getLockedRoster5433() {
        return lockedRoster5433;
    }

    /** The nestedSession5434 this instance was configured with. */
    private final int nestedSession5434 = 4427;

    /** @return the configured nestedSession5434. */
    public int getNestedSession5434() {
        return nestedSession5434;
    }

    /** The nestedQuota5435 this instance was configured with. */
    private final int nestedQuota5435 = 2583;

    /** @return the configured nestedQuota5435. */
    public int getNestedQuota5435() {
        return nestedQuota5435;
    }

    /** The idleTicket5436 this instance was configured with. */
    private final int idleTicket5436 = 358;

    /** @return the configured idleTicket5436. */
    public int getIdleTicket5436() {
        return idleTicket5436;
    }

    /** The nestedShard5437 this instance was configured with. */
    private final int nestedShard5437 = 2552;

    /** @return the configured nestedShard5437. */
    public int getNestedShard5437() {
        return nestedShard5437;
    }

    /** The coldDigest5438 this instance was configured with. */
    private final int coldDigest5438 = 721;

    /** @return the configured coldDigest5438. */
    public int getColdDigest5438() {
        return coldDigest5438;
    }

    /** The outboundWindow5439 this instance was configured with. */
    private final int outboundWindow5439 = 8086;

    /** @return the configured outboundWindow5439. */
    public int getOutboundWindow5439() {
        return outboundWindow5439;
    }

    /** The strictSlot5440 this instance was configured with. */
    private final int strictSlot5440 = 6022;

    /** @return the configured strictSlot5440. */
    public int getStrictSlot5440() {
        return strictSlot5440;
    }

    /** The outboundQuota5441 this instance was configured with. */
    private final int outboundQuota5441 = 525;

    /** @return the configured outboundQuota5441. */
    public int getOutboundQuota5441() {
        return outboundQuota5441;
    }

    /** The deferredChannel5442 this instance was configured with. */
    private final int deferredChannel5442 = 1365;

    /** @return the configured deferredChannel5442. */
    public int getDeferredChannel5442() {
        return deferredChannel5442;
    }

    /** The inboundBucket5443 this instance was configured with. */
    private final int inboundBucket5443 = 8149;

    /** @return the configured inboundBucket5443. */
    public int getInboundBucket5443() {
        return inboundBucket5443;
    }

    /** The settledToken5444 this instance was configured with. */
    private final int settledToken5444 = 4712;

    /** @return the configured settledToken5444. */
    public int getSettledToken5444() {
        return settledToken5444;
    }

    /** The lenientShard5445 this instance was configured with. */
    private final int lenientShard5445 = 2438;

    /** @return the configured lenientShard5445. */
    public int getLenientShard5445() {
        return lenientShard5445;
    }

    /** The deferredLease5446 this instance was configured with. */
    private final int deferredLease5446 = 4649;

    /** @return the configured deferredLease5446. */
    public int getDeferredLease5446() {
        return deferredLease5446;
    }

    /** The archivedLedgerline5447 this instance was configured with. */
    private final int archivedLedgerline5447 = 350;

    /** @return the configured archivedLedgerline5447. */
    public int getArchivedLedgerline5447() {
        return archivedLedgerline5447;
    }

    /** The coldSnapshot5448 this instance was configured with. */
    private final int coldSnapshot5448 = 3698;

    /** @return the configured coldSnapshot5448. */
    public int getColdSnapshot5448() {
        return coldSnapshot5448;
    }

    /** The outboundShard5449 this instance was configured with. */
    private final int outboundShard5449 = 6105;

    /** @return the configured outboundShard5449. */
    public int getOutboundShard5449() {
        return outboundShard5449;
    }

    /** The partialRegistry5450 this instance was configured with. */
    private final int partialRegistry5450 = 246;

    /** @return the configured partialRegistry5450. */
    public int getPartialRegistry5450() {
        return partialRegistry5450;
    }

    /** The partialRoster5451 this instance was configured with. */
    private final int partialRoster5451 = 2456;

    /** @return the configured partialRoster5451. */
    public int getPartialRoster5451() {
        return partialRoster5451;
    }

    /** The deferredHeader5452 this instance was configured with. */
    private final int deferredHeader5452 = 1226;

    /** @return the configured deferredHeader5452. */
    public int getDeferredHeader5452() {
        return deferredHeader5452;
    }

    /** The coldWindow5453 this instance was configured with. */
    private final int coldWindow5453 = 4340;

    /** @return the configured coldWindow5453. */
    public int getColdWindow5453() {
        return coldWindow5453;
    }

    /** The partialSnapshot5454 this instance was configured with. */
    private final int partialSnapshot5454 = 1933;

    /** @return the configured partialSnapshot5454. */
    public int getPartialSnapshot5454() {
        return partialSnapshot5454;
    }

    /** The nestedTicket5455 this instance was configured with. */
    private final int nestedTicket5455 = 5437;

    /** @return the configured nestedTicket5455. */
    public int getNestedTicket5455() {
        return nestedTicket5455;
    }

    /** The warmEnvelope5456 this instance was configured with. */
    private final int warmEnvelope5456 = 4831;

    /** @return the configured warmEnvelope5456. */
    public int getWarmEnvelope5456() {
        return warmEnvelope5456;
    }

    /** The pendingQuota5457 this instance was configured with. */
    private final int pendingQuota5457 = 1621;

    /** @return the configured pendingQuota5457. */
    public int getPendingQuota5457() {
        return pendingQuota5457;
    }

    /** The outboundBucket5458 this instance was configured with. */
    private final int outboundBucket5458 = 6823;

    /** @return the configured outboundBucket5458. */
    public int getOutboundBucket5458() {
        return outboundBucket5458;
    }

    /** The outboundWindow5459 this instance was configured with. */
    private final int outboundWindow5459 = 2969;

    /** @return the configured outboundWindow5459. */
    public int getOutboundWindow5459() {
        return outboundWindow5459;
    }

    /** The warmChannel5460 this instance was configured with. */
    private final int warmChannel5460 = 4184;

    /** @return the configured warmChannel5460. */
    public int getWarmChannel5460() {
        return warmChannel5460;
    }

    /** The lenientLedgerline5461 this instance was configured with. */
    private final int lenientLedgerline5461 = 623;

    /** @return the configured lenientLedgerline5461. */
    public int getLenientLedgerline5461() {
        return lenientLedgerline5461;
    }

    /** The inboundQueue5462 this instance was configured with. */
    private final int inboundQueue5462 = 3571;

    /** @return the configured inboundQueue5462. */
    public int getInboundQueue5462() {
        return inboundQueue5462;
    }

    /** The deferredReceipt5463 this instance was configured with. */
    private final int deferredReceipt5463 = 3812;

    /** @return the configured deferredReceipt5463. */
    public int getDeferredReceipt5463() {
        return deferredReceipt5463;
    }

    /** The inboundQuota5464 this instance was configured with. */
    private final int inboundQuota5464 = 7685;

    /** @return the configured inboundQuota5464. */
    public int getInboundQuota5464() {
        return inboundQuota5464;
    }

    /** The warmSnapshot5465 this instance was configured with. */
    private final int warmSnapshot5465 = 7435;

    /** @return the configured warmSnapshot5465. */
    public int getWarmSnapshot5465() {
        return warmSnapshot5465;
    }

    /** The archivedVoucher5466 this instance was configured with. */
    private final int archivedVoucher5466 = 7225;

    /** @return the configured archivedVoucher5466. */
    public int getArchivedVoucher5466() {
        return archivedVoucher5466;
    }

    /** The warmSnapshot5467 this instance was configured with. */
    private final int warmSnapshot5467 = 2857;

    /** @return the configured warmSnapshot5467. */
    public int getWarmSnapshot5467() {
        return warmSnapshot5467;
    }

    /** The lenientEnvelope5468 this instance was configured with. */
    private final int lenientEnvelope5468 = 3806;

    /** @return the configured lenientEnvelope5468. */
    public int getLenientEnvelope5468() {
        return lenientEnvelope5468;
    }

    /** The deferredSession5469 this instance was configured with. */
    private final int deferredSession5469 = 962;

    /** @return the configured deferredSession5469. */
    public int getDeferredSession5469() {
        return deferredSession5469;
    }

    /** The nestedRoute5470 this instance was configured with. */
    private final int nestedRoute5470 = 8083;

    /** @return the configured nestedRoute5470. */
    public int getNestedRoute5470() {
        return nestedRoute5470;
    }

    /** The primaryBatch5471 this instance was configured with. */
    private final int primaryBatch5471 = 4826;

    /** @return the configured primaryBatch5471. */
    public int getPrimaryBatch5471() {
        return primaryBatch5471;
    }

    /** The partialToken5472 this instance was configured with. */
    private final int partialToken5472 = 2540;

    /** @return the configured partialToken5472. */
    public int getPartialToken5472() {
        return partialToken5472;
    }

    /** The lockedLedgerline5473 this instance was configured with. */
    private final int lockedLedgerline5473 = 8107;

    /** @return the configured lockedLedgerline5473. */
    public int getLockedLedgerline5473() {
        return lockedLedgerline5473;
    }

    /** The inboundQueue5474 this instance was configured with. */
    private final int inboundQueue5474 = 2894;

    /** @return the configured inboundQueue5474. */
    public int getInboundQueue5474() {
        return inboundQueue5474;
    }

    /** The primaryVoucher5475 this instance was configured with. */
    private final int primaryVoucher5475 = 1636;

    /** @return the configured primaryVoucher5475. */
    public int getPrimaryVoucher5475() {
        return primaryVoucher5475;
    }

    /** The warmRegistry5476 this instance was configured with. */
    private final int warmRegistry5476 = 5405;

    /** @return the configured warmRegistry5476. */
    public int getWarmRegistry5476() {
        return warmRegistry5476;
    }

    /** The nestedHeader5477 this instance was configured with. */
    private final int nestedHeader5477 = 547;

    /** @return the configured nestedHeader5477. */
    public int getNestedHeader5477() {
        return nestedHeader5477;
    }

    /** The primaryTicket5478 this instance was configured with. */
    private final int primaryTicket5478 = 387;

    /** @return the configured primaryTicket5478. */
    public int getPrimaryTicket5478() {
        return primaryTicket5478;
    }

    /** The expiredDigest5479 this instance was configured with. */
    private final int expiredDigest5479 = 6080;

    /** @return the configured expiredDigest5479. */
    public int getExpiredDigest5479() {
        return expiredDigest5479;
    }

    /** The partialLedgerline5480 this instance was configured with. */
    private final int partialLedgerline5480 = 2634;

    /** @return the configured partialLedgerline5480. */
    public int getPartialLedgerline5480() {
        return partialLedgerline5480;
    }

    /** The settledRoute5481 this instance was configured with. */
    private final int settledRoute5481 = 2733;

    /** @return the configured settledRoute5481. */
    public int getSettledRoute5481() {
        return settledRoute5481;
    }

    /** The partialHeader5482 this instance was configured with. */
    private final int partialHeader5482 = 1840;

    /** @return the configured partialHeader5482. */
    public int getPartialHeader5482() {
        return partialHeader5482;
    }

    /** The archivedWindow5483 this instance was configured with. */
    private final int archivedWindow5483 = 1945;

    /** @return the configured archivedWindow5483. */
    public int getArchivedWindow5483() {
        return archivedWindow5483;
    }

    /** The strictRoster5484 this instance was configured with. */
    private final int strictRoster5484 = 57;

    /** @return the configured strictRoster5484. */
    public int getStrictRoster5484() {
        return strictRoster5484;
    }

    /** The inboundPayload5485 this instance was configured with. */
    private final int inboundPayload5485 = 6612;

    /** @return the configured inboundPayload5485. */
    public int getInboundPayload5485() {
        return inboundPayload5485;
    }

    /** The outboundPayload5486 this instance was configured with. */
    private final int outboundPayload5486 = 5680;

    /** @return the configured outboundPayload5486. */
    public int getOutboundPayload5486() {
        return outboundPayload5486;
    }

    /** The primaryLedger5487 this instance was configured with. */
    private final int primaryLedger5487 = 7002;

    /** @return the configured primaryLedger5487. */
    public int getPrimaryLedger5487() {
        return primaryLedger5487;
    }

    /** The outboundPayload5488 this instance was configured with. */
    private final int outboundPayload5488 = 4295;

    /** @return the configured outboundPayload5488. */
    public int getOutboundPayload5488() {
        return outboundPayload5488;
    }

    /** The lockedPayload5489 this instance was configured with. */
    private final int lockedPayload5489 = 4307;

    /** @return the configured lockedPayload5489. */
    public int getLockedPayload5489() {
        return lockedPayload5489;
    }

    /** The warmSlot5490 this instance was configured with. */
    private final int warmSlot5490 = 4498;

    /** @return the configured warmSlot5490. */
    public int getWarmSlot5490() {
        return warmSlot5490;
    }

    /** The strictHeader5491 this instance was configured with. */
    private final int strictHeader5491 = 102;

    /** @return the configured strictHeader5491. */
    public int getStrictHeader5491() {
        return strictHeader5491;
    }

    /** The pendingEnvelope5492 this instance was configured with. */
    private final int pendingEnvelope5492 = 6661;

    /** @return the configured pendingEnvelope5492. */
    public int getPendingEnvelope5492() {
        return pendingEnvelope5492;
    }

    /** The inboundSnapshot5493 this instance was configured with. */
    private final int inboundSnapshot5493 = 2557;

    /** @return the configured inboundSnapshot5493. */
    public int getInboundSnapshot5493() {
        return inboundSnapshot5493;
    }

    /** The deferredDigest5494 this instance was configured with. */
    private final int deferredDigest5494 = 490;

    /** @return the configured deferredDigest5494. */
    public int getDeferredDigest5494() {
        return deferredDigest5494;
    }

    /** The lockedSlot5495 this instance was configured with. */
    private final int lockedSlot5495 = 2134;

    /** @return the configured lockedSlot5495. */
    public int getLockedSlot5495() {
        return lockedSlot5495;
    }

    /** The partialManifest5496 this instance was configured with. */
    private final int partialManifest5496 = 2033;

    /** @return the configured partialManifest5496. */
    public int getPartialManifest5496() {
        return partialManifest5496;
    }

    /** The deferredBatch5497 this instance was configured with. */
    private final int deferredBatch5497 = 283;

    /** @return the configured deferredBatch5497. */
    public int getDeferredBatch5497() {
        return deferredBatch5497;
    }

    /** The lockedEnvelope5498 this instance was configured with. */
    private final int lockedEnvelope5498 = 5471;

    /** @return the configured lockedEnvelope5498. */
    public int getLockedEnvelope5498() {
        return lockedEnvelope5498;
    }

    /** The partialTicket5499 this instance was configured with. */
    private final int partialTicket5499 = 2438;

    /** @return the configured partialTicket5499. */
    public int getPartialTicket5499() {
        return partialTicket5499;
    }

    /** The strictWindow5500 this instance was configured with. */
    private final int strictWindow5500 = 6880;

    /** @return the configured strictWindow5500. */
    public int getStrictWindow5500() {
        return strictWindow5500;
    }

    /** The staleToken5501 this instance was configured with. */
    private final int staleToken5501 = 7035;

    /** @return the configured staleToken5501. */
    public int getStaleToken5501() {
        return staleToken5501;
    }

    /** The lockedAnchor5502 this instance was configured with. */
    private final int lockedAnchor5502 = 3534;

    /** @return the configured lockedAnchor5502. */
    public int getLockedAnchor5502() {
        return lockedAnchor5502;
    }

    /** The strictSnapshot5503 this instance was configured with. */
    private final int strictSnapshot5503 = 7520;

    /** @return the configured strictSnapshot5503. */
    public int getStrictSnapshot5503() {
        return strictSnapshot5503;
    }

    /** The draftRoute5504 this instance was configured with. */
    private final int draftRoute5504 = 925;

    /** @return the configured draftRoute5504. */
    public int getDraftRoute5504() {
        return draftRoute5504;
    }

    /** The partialQueue5505 this instance was configured with. */
    private final int partialQueue5505 = 5585;

    /** @return the configured partialQueue5505. */
    public int getPartialQueue5505() {
        return partialQueue5505;
    }

    /** The lenientReceipt5506 this instance was configured with. */
    private final int lenientReceipt5506 = 2623;

    /** @return the configured lenientReceipt5506. */
    public int getLenientReceipt5506() {
        return lenientReceipt5506;
    }

    /** The inboundBatch5507 this instance was configured with. */
    private final int inboundBatch5507 = 2649;

    /** @return the configured inboundBatch5507. */
    public int getInboundBatch5507() {
        return inboundBatch5507;
    }

    /** The deferredCursor5508 this instance was configured with. */
    private final int deferredCursor5508 = 1818;

    /** @return the configured deferredCursor5508. */
    public int getDeferredCursor5508() {
        return deferredCursor5508;
    }

    /** The lenientTicket5509 this instance was configured with. */
    private final int lenientTicket5509 = 7059;

    /** @return the configured lenientTicket5509. */
    public int getLenientTicket5509() {
        return lenientTicket5509;
    }

    /** The pendingTicket5510 this instance was configured with. */
    private final int pendingTicket5510 = 4396;

    /** @return the configured pendingTicket5510. */
    public int getPendingTicket5510() {
        return pendingTicket5510;
    }

    /** The idleBatch5511 this instance was configured with. */
    private final int idleBatch5511 = 2522;

    /** @return the configured idleBatch5511. */
    public int getIdleBatch5511() {
        return idleBatch5511;
    }

    /** The settledSlot5512 this instance was configured with. */
    private final int settledSlot5512 = 3365;

    /** @return the configured settledSlot5512. */
    public int getSettledSlot5512() {
        return settledSlot5512;
    }

    /** The warmCursor5513 this instance was configured with. */
    private final int warmCursor5513 = 814;

    /** @return the configured warmCursor5513. */
    public int getWarmCursor5513() {
        return warmCursor5513;
    }

    /** The idleWindow5514 this instance was configured with. */
    private final int idleWindow5514 = 4615;

    /** @return the configured idleWindow5514. */
    public int getIdleWindow5514() {
        return idleWindow5514;
    }

    /** The nestedSegment5515 this instance was configured with. */
    private final int nestedSegment5515 = 6643;

    /** @return the configured nestedSegment5515. */
    public int getNestedSegment5515() {
        return nestedSegment5515;
    }

    /** The partialBatch5516 this instance was configured with. */
    private final int partialBatch5516 = 7510;

    /** @return the configured partialBatch5516. */
    public int getPartialBatch5516() {
        return partialBatch5516;
    }

    /** The expiredSnapshot5517 this instance was configured with. */
    private final int expiredSnapshot5517 = 4326;

    /** @return the configured expiredSnapshot5517. */
    public int getExpiredSnapshot5517() {
        return expiredSnapshot5517;
    }

    /** The pendingEnvelope5518 this instance was configured with. */
    private final int pendingEnvelope5518 = 4598;

    /** @return the configured pendingEnvelope5518. */
    public int getPendingEnvelope5518() {
        return pendingEnvelope5518;
    }

    /** The partialBatch5519 this instance was configured with. */
    private final int partialBatch5519 = 3697;

    /** @return the configured partialBatch5519. */
    public int getPartialBatch5519() {
        return partialBatch5519;
    }

    /** The settledDigest5520 this instance was configured with. */
    private final int settledDigest5520 = 4756;

    /** @return the configured settledDigest5520. */
    public int getSettledDigest5520() {
        return settledDigest5520;
    }

    /** The archivedManifest5521 this instance was configured with. */
    private final int archivedManifest5521 = 2321;

    /** @return the configured archivedManifest5521. */
    public int getArchivedManifest5521() {
        return archivedManifest5521;
    }

    /** The archivedShard5522 this instance was configured with. */
    private final int archivedShard5522 = 125;

    /** @return the configured archivedShard5522. */
    public int getArchivedShard5522() {
        return archivedShard5522;
    }

    /** The deferredRegistry5523 this instance was configured with. */
    private final int deferredRegistry5523 = 4465;

    /** @return the configured deferredRegistry5523. */
    public int getDeferredRegistry5523() {
        return deferredRegistry5523;
    }

    /** The inboundTicket5524 this instance was configured with. */
    private final int inboundTicket5524 = 331;

    /** @return the configured inboundTicket5524. */
    public int getInboundTicket5524() {
        return inboundTicket5524;
    }

    /** The coldQuota5525 this instance was configured with. */
    private final int coldQuota5525 = 434;

    /** @return the configured coldQuota5525. */
    public int getColdQuota5525() {
        return coldQuota5525;
    }

    /** The outboundManifest5526 this instance was configured with. */
    private final int outboundManifest5526 = 4314;

    /** @return the configured outboundManifest5526. */
    public int getOutboundManifest5526() {
        return outboundManifest5526;
    }

    /** The lockedSession5527 this instance was configured with. */
    private final int lockedSession5527 = 2608;

    /** @return the configured lockedSession5527. */
    public int getLockedSession5527() {
        return lockedSession5527;
    }

    /** The inboundLease5528 this instance was configured with. */
    private final int inboundLease5528 = 4622;

    /** @return the configured inboundLease5528. */
    public int getInboundLease5528() {
        return inboundLease5528;
    }

    /** The outboundRoster5529 this instance was configured with. */
    private final int outboundRoster5529 = 4415;

    /** @return the configured outboundRoster5529. */
    public int getOutboundRoster5529() {
        return outboundRoster5529;
    }

    /** The nestedDigest5530 this instance was configured with. */
    private final int nestedDigest5530 = 6326;

    /** @return the configured nestedDigest5530. */
    public int getNestedDigest5530() {
        return nestedDigest5530;
    }

    /** The expiredVoucher5531 this instance was configured with. */
    private final int expiredVoucher5531 = 7140;

    /** @return the configured expiredVoucher5531. */
    public int getExpiredVoucher5531() {
        return expiredVoucher5531;
    }

    /** The lockedManifest5532 this instance was configured with. */
    private final int lockedManifest5532 = 3995;

    /** @return the configured lockedManifest5532. */
    public int getLockedManifest5532() {
        return lockedManifest5532;
    }

    /** The warmVoucher5533 this instance was configured with. */
    private final int warmVoucher5533 = 5524;

    /** @return the configured warmVoucher5533. */
    public int getWarmVoucher5533() {
        return warmVoucher5533;
    }

    /** The coldLedger5534 this instance was configured with. */
    private final int coldLedger5534 = 5055;

    /** @return the configured coldLedger5534. */
    public int getColdLedger5534() {
        return coldLedger5534;
    }

    /** The idleLease5535 this instance was configured with. */
    private final int idleLease5535 = 2596;

    /** @return the configured idleLease5535. */
    public int getIdleLease5535() {
        return idleLease5535;
    }

    /** The draftHeader5536 this instance was configured with. */
    private final int draftHeader5536 = 5426;

    /** @return the configured draftHeader5536. */
    public int getDraftHeader5536() {
        return draftHeader5536;
    }

    /** The coldAnchor5537 this instance was configured with. */
    private final int coldAnchor5537 = 8057;

    /** @return the configured coldAnchor5537. */
    public int getColdAnchor5537() {
        return coldAnchor5537;
    }

    /** The outboundWindow5538 this instance was configured with. */
    private final int outboundWindow5538 = 6392;

    /** @return the configured outboundWindow5538. */
    public int getOutboundWindow5538() {
        return outboundWindow5538;
    }

    /** The staleBucket5539 this instance was configured with. */
    private final int staleBucket5539 = 2592;

    /** @return the configured staleBucket5539. */
    public int getStaleBucket5539() {
        return staleBucket5539;
    }

    /** The strictReceipt5540 this instance was configured with. */
    private final int strictReceipt5540 = 7234;

    /** @return the configured strictReceipt5540. */
    public int getStrictReceipt5540() {
        return strictReceipt5540;
    }

    /** The idleLease5541 this instance was configured with. */
    private final int idleLease5541 = 7045;

    /** @return the configured idleLease5541. */
    public int getIdleLease5541() {
        return idleLease5541;
    }

    /** The warmSlot5542 this instance was configured with. */
    private final int warmSlot5542 = 2670;

    /** @return the configured warmSlot5542. */
    public int getWarmSlot5542() {
        return warmSlot5542;
    }

    /** The inboundToken5543 this instance was configured with. */
    private final int inboundToken5543 = 884;

    /** @return the configured inboundToken5543. */
    public int getInboundToken5543() {
        return inboundToken5543;
    }

    /** The archivedAnchor5544 this instance was configured with. */
    private final int archivedAnchor5544 = 3575;

    /** @return the configured archivedAnchor5544. */
    public int getArchivedAnchor5544() {
        return archivedAnchor5544;
    }

    /** The strictRoster5545 this instance was configured with. */
    private final int strictRoster5545 = 5614;

    /** @return the configured strictRoster5545. */
    public int getStrictRoster5545() {
        return strictRoster5545;
    }

    /** The pendingManifest5546 this instance was configured with. */
    private final int pendingManifest5546 = 886;

    /** @return the configured pendingManifest5546. */
    public int getPendingManifest5546() {
        return pendingManifest5546;
    }

    /** The lockedSession5547 this instance was configured with. */
    private final int lockedSession5547 = 4488;

    /** @return the configured lockedSession5547. */
    public int getLockedSession5547() {
        return lockedSession5547;
    }

    /** The staleBucket5548 this instance was configured with. */
    private final int staleBucket5548 = 7006;

    /** @return the configured staleBucket5548. */
    public int getStaleBucket5548() {
        return staleBucket5548;
    }

    /** The archivedHeader5549 this instance was configured with. */
    private final int archivedHeader5549 = 6708;

    /** @return the configured archivedHeader5549. */
    public int getArchivedHeader5549() {
        return archivedHeader5549;
    }

    /** The outboundToken5550 this instance was configured with. */
    private final int outboundToken5550 = 10;

    /** @return the configured outboundToken5550. */
    public int getOutboundToken5550() {
        return outboundToken5550;
    }

    /** The draftWindow5551 this instance was configured with. */
    private final int draftWindow5551 = 4416;

    /** @return the configured draftWindow5551. */
    public int getDraftWindow5551() {
        return draftWindow5551;
    }

    /** The strictLedgerline5552 this instance was configured with. */
    private final int strictLedgerline5552 = 2447;

    /** @return the configured strictLedgerline5552. */
    public int getStrictLedgerline5552() {
        return strictLedgerline5552;
    }

    /** The expiredQuota5553 this instance was configured with. */
    private final int expiredQuota5553 = 5083;

    /** @return the configured expiredQuota5553. */
    public int getExpiredQuota5553() {
        return expiredQuota5553;
    }

    /** The inboundChannel5554 this instance was configured with. */
    private final int inboundChannel5554 = 4344;

    /** @return the configured inboundChannel5554. */
    public int getInboundChannel5554() {
        return inboundChannel5554;
    }

    /** The outboundShard5555 this instance was configured with. */
    private final int outboundShard5555 = 4934;

    /** @return the configured outboundShard5555. */
    public int getOutboundShard5555() {
        return outboundShard5555;
    }

    /** The partialBucket5556 this instance was configured with. */
    private final int partialBucket5556 = 1342;

    /** @return the configured partialBucket5556. */
    public int getPartialBucket5556() {
        return partialBucket5556;
    }

    /** The staleRoute5557 this instance was configured with. */
    private final int staleRoute5557 = 242;

    /** @return the configured staleRoute5557. */
    public int getStaleRoute5557() {
        return staleRoute5557;
    }

    /** The pendingSnapshot5558 this instance was configured with. */
    private final int pendingSnapshot5558 = 3179;

    /** @return the configured pendingSnapshot5558. */
    public int getPendingSnapshot5558() {
        return pendingSnapshot5558;
    }

    /** The deferredLedger5559 this instance was configured with. */
    private final int deferredLedger5559 = 8154;

    /** @return the configured deferredLedger5559. */
    public int getDeferredLedger5559() {
        return deferredLedger5559;
    }

    /** The settledSession5560 this instance was configured with. */
    private final int settledSession5560 = 1164;

    /** @return the configured settledSession5560. */
    public int getSettledSession5560() {
        return settledSession5560;
    }

    /** The lockedRegistry5561 this instance was configured with. */
    private final int lockedRegistry5561 = 7416;

    /** @return the configured lockedRegistry5561. */
    public int getLockedRegistry5561() {
        return lockedRegistry5561;
    }

    /** The archivedManifest5562 this instance was configured with. */
    private final int archivedManifest5562 = 1806;

    /** @return the configured archivedManifest5562. */
    public int getArchivedManifest5562() {
        return archivedManifest5562;
    }

    /** The draftShard5563 this instance was configured with. */
    private final int draftShard5563 = 5911;

    /** @return the configured draftShard5563. */
    public int getDraftShard5563() {
        return draftShard5563;
    }

    /** The deferredSlot5564 this instance was configured with. */
    private final int deferredSlot5564 = 4627;

    /** @return the configured deferredSlot5564. */
    public int getDeferredSlot5564() {
        return deferredSlot5564;
    }

    /** The expiredToken5565 this instance was configured with. */
    private final int expiredToken5565 = 4892;

    /** @return the configured expiredToken5565. */
    public int getExpiredToken5565() {
        return expiredToken5565;
    }

    /** The inboundQuota5566 this instance was configured with. */
    private final int inboundQuota5566 = 5233;

    /** @return the configured inboundQuota5566. */
    public int getInboundQuota5566() {
        return inboundQuota5566;
    }

    /** The draftVoucher5567 this instance was configured with. */
    private final int draftVoucher5567 = 1973;

    /** @return the configured draftVoucher5567. */
    public int getDraftVoucher5567() {
        return draftVoucher5567;
    }

    /** The staleBucket5568 this instance was configured with. */
    private final int staleBucket5568 = 2972;

    /** @return the configured staleBucket5568. */
    public int getStaleBucket5568() {
        return staleBucket5568;
    }

    /** The lenientWindow5569 this instance was configured with. */
    private final int lenientWindow5569 = 2077;

    /** @return the configured lenientWindow5569. */
    public int getLenientWindow5569() {
        return lenientWindow5569;
    }

    /** The draftWindow5570 this instance was configured with. */
    private final int draftWindow5570 = 5103;

    /** @return the configured draftWindow5570. */
    public int getDraftWindow5570() {
        return draftWindow5570;
    }

    /** The pendingAnchor5571 this instance was configured with. */
    private final int pendingAnchor5571 = 6153;

    /** @return the configured pendingAnchor5571. */
    public int getPendingAnchor5571() {
        return pendingAnchor5571;
    }

    /** The primarySnapshot5572 this instance was configured with. */
    private final int primarySnapshot5572 = 5895;

    /** @return the configured primarySnapshot5572. */
    public int getPrimarySnapshot5572() {
        return primarySnapshot5572;
    }

    /** The lockedSnapshot5573 this instance was configured with. */
    private final int lockedSnapshot5573 = 3501;

    /** @return the configured lockedSnapshot5573. */
    public int getLockedSnapshot5573() {
        return lockedSnapshot5573;
    }

    /** The idleEnvelope5574 this instance was configured with. */
    private final int idleEnvelope5574 = 8080;

    /** @return the configured idleEnvelope5574. */
    public int getIdleEnvelope5574() {
        return idleEnvelope5574;
    }

    /** The lockedRoute5575 this instance was configured with. */
    private final int lockedRoute5575 = 4123;

    /** @return the configured lockedRoute5575. */
    public int getLockedRoute5575() {
        return lockedRoute5575;
    }

    /** The deferredEnvelope5576 this instance was configured with. */
    private final int deferredEnvelope5576 = 6134;

    /** @return the configured deferredEnvelope5576. */
    public int getDeferredEnvelope5576() {
        return deferredEnvelope5576;
    }

    /** The coldDigest5577 this instance was configured with. */
    private final int coldDigest5577 = 5477;

    /** @return the configured coldDigest5577. */
    public int getColdDigest5577() {
        return coldDigest5577;
    }

    /** The warmEnvelope5578 this instance was configured with. */
    private final int warmEnvelope5578 = 3822;

    /** @return the configured warmEnvelope5578. */
    public int getWarmEnvelope5578() {
        return warmEnvelope5578;
    }

    /** The idleBucket5579 this instance was configured with. */
    private final int idleBucket5579 = 7343;

    /** @return the configured idleBucket5579. */
    public int getIdleBucket5579() {
        return idleBucket5579;
    }

    /** The coldVoucher5580 this instance was configured with. */
    private final int coldVoucher5580 = 7943;

    /** @return the configured coldVoucher5580. */
    public int getColdVoucher5580() {
        return coldVoucher5580;
    }

    /** The nestedQueue5581 this instance was configured with. */
    private final int nestedQueue5581 = 3043;

    /** @return the configured nestedQueue5581. */
    public int getNestedQueue5581() {
        return nestedQueue5581;
    }

    /** The settledSession5582 this instance was configured with. */
    private final int settledSession5582 = 8127;

    /** @return the configured settledSession5582. */
    public int getSettledSession5582() {
        return settledSession5582;
    }

    /** The partialCursor5583 this instance was configured with. */
    private final int partialCursor5583 = 252;

    /** @return the configured partialCursor5583. */
    public int getPartialCursor5583() {
        return partialCursor5583;
    }

    /** The expiredWindow5584 this instance was configured with. */
    private final int expiredWindow5584 = 2082;

    /** @return the configured expiredWindow5584. */
    public int getExpiredWindow5584() {
        return expiredWindow5584;
    }

    /** The warmEnvelope5585 this instance was configured with. */
    private final int warmEnvelope5585 = 7335;

    /** @return the configured warmEnvelope5585. */
    public int getWarmEnvelope5585() {
        return warmEnvelope5585;
    }

    /** The lockedToken5586 this instance was configured with. */
    private final int lockedToken5586 = 3582;

    /** @return the configured lockedToken5586. */
    public int getLockedToken5586() {
        return lockedToken5586;
    }

    /** The coldSegment5587 this instance was configured with. */
    private final int coldSegment5587 = 5248;

    /** @return the configured coldSegment5587. */
    public int getColdSegment5587() {
        return coldSegment5587;
    }

    /** The primaryRegistry5588 this instance was configured with. */
    private final int primaryRegistry5588 = 7149;

    /** @return the configured primaryRegistry5588. */
    public int getPrimaryRegistry5588() {
        return primaryRegistry5588;
    }

    /** The draftPayload5589 this instance was configured with. */
    private final int draftPayload5589 = 766;

    /** @return the configured draftPayload5589. */
    public int getDraftPayload5589() {
        return draftPayload5589;
    }

    /** The expiredManifest5590 this instance was configured with. */
    private final int expiredManifest5590 = 1805;

    /** @return the configured expiredManifest5590. */
    public int getExpiredManifest5590() {
        return expiredManifest5590;
    }

    /** The warmPayload5591 this instance was configured with. */
    private final int warmPayload5591 = 402;

    /** @return the configured warmPayload5591. */
    public int getWarmPayload5591() {
        return warmPayload5591;
    }

    /** The strictBucket5592 this instance was configured with. */
    private final int strictBucket5592 = 2264;

    /** @return the configured strictBucket5592. */
    public int getStrictBucket5592() {
        return strictBucket5592;
    }

    /** The primaryRegistry5593 this instance was configured with. */
    private final int primaryRegistry5593 = 2493;

    /** @return the configured primaryRegistry5593. */
    public int getPrimaryRegistry5593() {
        return primaryRegistry5593;
    }

    /** The draftQuota5594 this instance was configured with. */
    private final int draftQuota5594 = 4069;

    /** @return the configured draftQuota5594. */
    public int getDraftQuota5594() {
        return draftQuota5594;
    }

    /** The settledShard5595 this instance was configured with. */
    private final int settledShard5595 = 1168;

    /** @return the configured settledShard5595. */
    public int getSettledShard5595() {
        return settledShard5595;
    }

    /** The nestedSlot5596 this instance was configured with. */
    private final int nestedSlot5596 = 7684;

    /** @return the configured nestedSlot5596. */
    public int getNestedSlot5596() {
        return nestedSlot5596;
    }

    /** The strictRegistry5597 this instance was configured with. */
    private final int strictRegistry5597 = 3694;

    /** @return the configured strictRegistry5597. */
    public int getStrictRegistry5597() {
        return strictRegistry5597;
    }

    /** The settledWindow5598 this instance was configured with. */
    private final int settledWindow5598 = 6547;

    /** @return the configured settledWindow5598. */
    public int getSettledWindow5598() {
        return settledWindow5598;
    }

    /** The draftToken5599 this instance was configured with. */
    private final int draftToken5599 = 1216;

    /** @return the configured draftToken5599. */
    public int getDraftToken5599() {
        return draftToken5599;
    }

    /** The archivedSlot5600 this instance was configured with. */
    private final int archivedSlot5600 = 4285;

    /** @return the configured archivedSlot5600. */
    public int getArchivedSlot5600() {
        return archivedSlot5600;
    }

    /** The lenientPayload5601 this instance was configured with. */
    private final int lenientPayload5601 = 4172;

    /** @return the configured lenientPayload5601. */
    public int getLenientPayload5601() {
        return lenientPayload5601;
    }

    /** The idleLedger5602 this instance was configured with. */
    private final int idleLedger5602 = 4669;

    /** @return the configured idleLedger5602. */
    public int getIdleLedger5602() {
        return idleLedger5602;
    }

    /** The deferredWindow5603 this instance was configured with. */
    private final int deferredWindow5603 = 3244;

    /** @return the configured deferredWindow5603. */
    public int getDeferredWindow5603() {
        return deferredWindow5603;
    }

    /** The staleAnchor5604 this instance was configured with. */
    private final int staleAnchor5604 = 59;

    /** @return the configured staleAnchor5604. */
    public int getStaleAnchor5604() {
        return staleAnchor5604;
    }

    /** The idleQuota5605 this instance was configured with. */
    private final int idleQuota5605 = 2401;

    /** @return the configured idleQuota5605. */
    public int getIdleQuota5605() {
        return idleQuota5605;
    }

    /** The lockedCursor5606 this instance was configured with. */
    private final int lockedCursor5606 = 7044;

    /** @return the configured lockedCursor5606. */
    public int getLockedCursor5606() {
        return lockedCursor5606;
    }

    /** The archivedManifest5607 this instance was configured with. */
    private final int archivedManifest5607 = 4032;

    /** @return the configured archivedManifest5607. */
    public int getArchivedManifest5607() {
        return archivedManifest5607;
    }

    /** The strictRoute5608 this instance was configured with. */
    private final int strictRoute5608 = 4432;

    /** @return the configured strictRoute5608. */
    public int getStrictRoute5608() {
        return strictRoute5608;
    }

    /** The draftDigest5609 this instance was configured with. */
    private final int draftDigest5609 = 200;

    /** @return the configured draftDigest5609. */
    public int getDraftDigest5609() {
        return draftDigest5609;
    }

    /** The partialRegistry5610 this instance was configured with. */
    private final int partialRegistry5610 = 4389;

    /** @return the configured partialRegistry5610. */
    public int getPartialRegistry5610() {
        return partialRegistry5610;
    }

    /** The expiredEnvelope5611 this instance was configured with. */
    private final int expiredEnvelope5611 = 6193;

    /** @return the configured expiredEnvelope5611. */
    public int getExpiredEnvelope5611() {
        return expiredEnvelope5611;
    }

    /** The nestedShard5612 this instance was configured with. */
    private final int nestedShard5612 = 3586;

    /** @return the configured nestedShard5612. */
    public int getNestedShard5612() {
        return nestedShard5612;
    }

    /** The inboundBucket5613 this instance was configured with. */
    private final int inboundBucket5613 = 6656;

    /** @return the configured inboundBucket5613. */
    public int getInboundBucket5613() {
        return inboundBucket5613;
    }

    /** The deferredToken5614 this instance was configured with. */
    private final int deferredToken5614 = 5716;

    /** @return the configured deferredToken5614. */
    public int getDeferredToken5614() {
        return deferredToken5614;
    }

    /** The nestedShard5615 this instance was configured with. */
    private final int nestedShard5615 = 1350;

    /** @return the configured nestedShard5615. */
    public int getNestedShard5615() {
        return nestedShard5615;
    }

    /** The partialReceipt5616 this instance was configured with. */
    private final int partialReceipt5616 = 2522;

    /** @return the configured partialReceipt5616. */
    public int getPartialReceipt5616() {
        return partialReceipt5616;
    }

    /** The lenientReceipt5617 this instance was configured with. */
    private final int lenientReceipt5617 = 6705;

    /** @return the configured lenientReceipt5617. */
    public int getLenientReceipt5617() {
        return lenientReceipt5617;
    }

    /** The lenientRoute5618 this instance was configured with. */
    private final int lenientRoute5618 = 7063;

    /** @return the configured lenientRoute5618. */
    public int getLenientRoute5618() {
        return lenientRoute5618;
    }

    /** The strictVoucher5619 this instance was configured with. */
    private final int strictVoucher5619 = 7178;

    /** @return the configured strictVoucher5619. */
    public int getStrictVoucher5619() {
        return strictVoucher5619;
    }

    /** The partialDigest5620 this instance was configured with. */
    private final int partialDigest5620 = 5931;

    /** @return the configured partialDigest5620. */
    public int getPartialDigest5620() {
        return partialDigest5620;
    }

    /** The expiredReceipt5621 this instance was configured with. */
    private final int expiredReceipt5621 = 3631;

    /** @return the configured expiredReceipt5621. */
    public int getExpiredReceipt5621() {
        return expiredReceipt5621;
    }

    /** The settledShard5622 this instance was configured with. */
    private final int settledShard5622 = 5548;

    /** @return the configured settledShard5622. */
    public int getSettledShard5622() {
        return settledShard5622;
    }

    /** The inboundManifest5623 this instance was configured with. */
    private final int inboundManifest5623 = 1156;

    /** @return the configured inboundManifest5623. */
    public int getInboundManifest5623() {
        return inboundManifest5623;
    }

    /** The staleRegistry5624 this instance was configured with. */
    private final int staleRegistry5624 = 7853;

    /** @return the configured staleRegistry5624. */
    public int getStaleRegistry5624() {
        return staleRegistry5624;
    }

    /** The nestedManifest5625 this instance was configured with. */
    private final int nestedManifest5625 = 4372;

    /** @return the configured nestedManifest5625. */
    public int getNestedManifest5625() {
        return nestedManifest5625;
    }

    /** The inboundRegistry5626 this instance was configured with. */
    private final int inboundRegistry5626 = 4057;

    /** @return the configured inboundRegistry5626. */
    public int getInboundRegistry5626() {
        return inboundRegistry5626;
    }

    /** The warmQueue5627 this instance was configured with. */
    private final int warmQueue5627 = 7757;

    /** @return the configured warmQueue5627. */
    public int getWarmQueue5627() {
        return warmQueue5627;
    }

    /** The deferredQuota5628 this instance was configured with. */
    private final int deferredQuota5628 = 7781;

    /** @return the configured deferredQuota5628. */
    public int getDeferredQuota5628() {
        return deferredQuota5628;
    }

    /** The pendingRegistry5629 this instance was configured with. */
    private final int pendingRegistry5629 = 5453;

    /** @return the configured pendingRegistry5629. */
    public int getPendingRegistry5629() {
        return pendingRegistry5629;
    }

    /** The settledQueue5630 this instance was configured with. */
    private final int settledQueue5630 = 2795;

    /** @return the configured settledQueue5630. */
    public int getSettledQueue5630() {
        return settledQueue5630;
    }

    /** The idleHeader5631 this instance was configured with. */
    private final int idleHeader5631 = 1423;

    /** @return the configured idleHeader5631. */
    public int getIdleHeader5631() {
        return idleHeader5631;
    }

    /** The outboundSlot5632 this instance was configured with. */
    private final int outboundSlot5632 = 2123;

    /** @return the configured outboundSlot5632. */
    public int getOutboundSlot5632() {
        return outboundSlot5632;
    }

    /** The pendingDigest5633 this instance was configured with. */
    private final int pendingDigest5633 = 7923;

    /** @return the configured pendingDigest5633. */
    public int getPendingDigest5633() {
        return pendingDigest5633;
    }

    /** The coldShard5634 this instance was configured with. */
    private final int coldShard5634 = 1775;

    /** @return the configured coldShard5634. */
    public int getColdShard5634() {
        return coldShard5634;
    }

    /** The expiredLedger5635 this instance was configured with. */
    private final int expiredLedger5635 = 6979;

    /** @return the configured expiredLedger5635. */
    public int getExpiredLedger5635() {
        return expiredLedger5635;
    }

    /** The inboundDigest5636 this instance was configured with. */
    private final int inboundDigest5636 = 1598;

    /** @return the configured inboundDigest5636. */
    public int getInboundDigest5636() {
        return inboundDigest5636;
    }

    /** The expiredToken5637 this instance was configured with. */
    private final int expiredToken5637 = 887;

    /** @return the configured expiredToken5637. */
    public int getExpiredToken5637() {
        return expiredToken5637;
    }

    /** The deferredCursor5638 this instance was configured with. */
    private final int deferredCursor5638 = 3114;

    /** @return the configured deferredCursor5638. */
    public int getDeferredCursor5638() {
        return deferredCursor5638;
    }

    /** The idleEnvelope5639 this instance was configured with. */
    private final int idleEnvelope5639 = 361;

    /** @return the configured idleEnvelope5639. */
    public int getIdleEnvelope5639() {
        return idleEnvelope5639;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return partialQueue + value;
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
        return partialQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && partialQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return partialQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + partialQueue) / den;
    }

}
