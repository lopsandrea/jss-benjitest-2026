package com.example.p71;

/**
 * expiredShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class071 {

    private int outboundChannel = 1;

    private final java.util.Map<String, Integer> pendingChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingChannel0 table. */
    public int draftManifest0(String key) {
        Integer hit = pendingChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long expiredCursor1 = 0L;

    /** Folds {@code delta} into the running expiredCursor1. */
    public long partialTicket1(long delta) {
        if (delta == 0L) {
            return expiredCursor1;
        }
        expiredCursor1 += delta < 0 ? -delta : delta;
        return expiredCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftQuota2(int n) {
        switch (n / 10) {
            case 0:
                return "outbound";
            case 1:
                return "primary";
            default:
                return n > 113 ? "lenient" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the strictToken stage. */
    public boolean staleSegment3(String text) {
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

    private final java.util.Map<String, Integer> coldSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSegment4 table. */
    public int nestedBucket4(String key) {
        Integer hit = coldSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long partialLedger5 = 0L;

    /** Folds {@code delta} into the running partialLedger5. */
    public long pendingSlot5(long delta) {
        if (delta == 0L) {
            return partialLedger5;
        }
        partialLedger5 += delta < 0 ? -delta : delta;
        return partialLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQueue6(int n) {
        switch (n / 10) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 60 ? "draft" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the draftRoster stage. */
    public boolean settledBucket7(String text) {
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

    private final java.util.Map<String, Integer> deferredTicket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredTicket8 table. */
    public int coldSegment8(String key) {
        Integer hit = deferredTicket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long idleLedgerline9 = 0L;

    /** Folds {@code delta} into the running idleLedgerline9. */
    public long archivedTicket9(long delta) {
        if (delta == 0L) {
            return idleLedgerline9;
        }
        idleLedgerline9 += delta < 0 ? -delta : delta;
        return idleLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialSlot10(int n) {
        switch (n / 4) {
            case 0:
                return "settled";
            case 1:
                return "primary";
            default:
                return n > 382 ? "deferred" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the coldCursor stage. */
    public boolean settledLedger11(String text) {
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

    private final java.util.Map<String, Integer> outboundWindow12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundWindow12 table. */
    public int partialSession12(String key) {
        Integer hit = outboundWindow12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long lockedSession13 = 0L;

    /** Folds {@code delta} into the running lockedSession13. */
    public long strictEnvelope13(long delta) {
        if (delta == 0L) {
            return lockedSession13;
        }
        lockedSession13 += delta < 0 ? -delta : delta;
        return lockedSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedRoute14(int n) {
        switch (n / 4) {
            case 0:
                return "expired";
            case 1:
                return "settled";
            default:
                return n > 113 ? "outbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedHeader stage. */
    public boolean expiredRoster15(String text) {
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

    private final java.util.Map<String, Integer> draftBatch16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftBatch16 table. */
    public int outboundRegistry16(String key) {
        Integer hit = draftBatch16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long settledHeader17 = 0L;

    /** Folds {@code delta} into the running settledHeader17. */
    public long warmCursor17(long delta) {
        if (delta == 0L) {
            return settledHeader17;
        }
        settledHeader17 += delta < 0 ? -delta : delta;
        return settledHeader17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSession18(int n) {
        switch (n / 10) {
            case 0:
                return "archived";
            case 1:
                return "locked";
            default:
                return n > 194 ? "nested" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the coldShard stage. */
    public boolean lenientQueue19(String text) {
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

    private final java.util.Map<String, Integer> idleLedger20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleLedger20 table. */
    public int strictHeader20(String key) {
        Integer hit = idleLedger20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long lockedSegment21 = 0L;

    /** Folds {@code delta} into the running lockedSegment21. */
    public long lenientRoute21(long delta) {
        if (delta == 0L) {
            return lockedSegment21;
        }
        lockedSegment21 += delta < 0 ? -delta : delta;
        return lockedSegment21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedReceipt22(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "inbound";
            default:
                return n > 374 ? "outbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the lockedDigest stage. */
    public boolean coldReceipt23(String text) {
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

    private final java.util.Map<String, Integer> idleDigest24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleDigest24 table. */
    public int lockedBatch24(String key) {
        Integer hit = idleDigest24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long settledSegment25 = 0L;

    /** Folds {@code delta} into the running settledSegment25. */
    public long strictQuota25(long delta) {
        if (delta == 0L) {
            return settledSegment25;
        }
        settledSegment25 += delta < 0 ? -delta : delta;
        return settledSegment25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBatch26(int n) {
        switch (n / 8) {
            case 0:
                return "outbound";
            case 1:
                return "inbound";
            default:
                return n > 254 ? "pending" : "locked";
        }
    }

    /** The archivedToken5000 this instance was configured with. */
    private final int archivedToken5000 = 6756;

    /** @return the configured archivedToken5000. */
    public int getArchivedToken5000() {
        return archivedToken5000;
    }

    /** The idleRegistry5001 this instance was configured with. */
    private final int idleRegistry5001 = 628;

    /** @return the configured idleRegistry5001. */
    public int getIdleRegistry5001() {
        return idleRegistry5001;
    }

    /** The deferredBucket5002 this instance was configured with. */
    private final int deferredBucket5002 = 3444;

    /** @return the configured deferredBucket5002. */
    public int getDeferredBucket5002() {
        return deferredBucket5002;
    }

    /** The expiredBucket5003 this instance was configured with. */
    private final int expiredBucket5003 = 2002;

    /** @return the configured expiredBucket5003. */
    public int getExpiredBucket5003() {
        return expiredBucket5003;
    }

    /** The partialReceipt5004 this instance was configured with. */
    private final int partialReceipt5004 = 198;

    /** @return the configured partialReceipt5004. */
    public int getPartialReceipt5004() {
        return partialReceipt5004;
    }

    /** The settledSlot5005 this instance was configured with. */
    private final int settledSlot5005 = 5166;

    /** @return the configured settledSlot5005. */
    public int getSettledSlot5005() {
        return settledSlot5005;
    }

    /** The coldRoster5006 this instance was configured with. */
    private final int coldRoster5006 = 4289;

    /** @return the configured coldRoster5006. */
    public int getColdRoster5006() {
        return coldRoster5006;
    }

    /** The pendingSegment5007 this instance was configured with. */
    private final int pendingSegment5007 = 1319;

    /** @return the configured pendingSegment5007. */
    public int getPendingSegment5007() {
        return pendingSegment5007;
    }

    /** The nestedAnchor5008 this instance was configured with. */
    private final int nestedAnchor5008 = 5234;

    /** @return the configured nestedAnchor5008. */
    public int getNestedAnchor5008() {
        return nestedAnchor5008;
    }

    /** The lenientChannel5009 this instance was configured with. */
    private final int lenientChannel5009 = 1975;

    /** @return the configured lenientChannel5009. */
    public int getLenientChannel5009() {
        return lenientChannel5009;
    }

    /** The pendingSnapshot5010 this instance was configured with. */
    private final int pendingSnapshot5010 = 3158;

    /** @return the configured pendingSnapshot5010. */
    public int getPendingSnapshot5010() {
        return pendingSnapshot5010;
    }

    /** The nestedPayload5011 this instance was configured with. */
    private final int nestedPayload5011 = 7611;

    /** @return the configured nestedPayload5011. */
    public int getNestedPayload5011() {
        return nestedPayload5011;
    }

    /** The partialVoucher5012 this instance was configured with. */
    private final int partialVoucher5012 = 3271;

    /** @return the configured partialVoucher5012. */
    public int getPartialVoucher5012() {
        return partialVoucher5012;
    }

    /** The outboundRegistry5013 this instance was configured with. */
    private final int outboundRegistry5013 = 222;

    /** @return the configured outboundRegistry5013. */
    public int getOutboundRegistry5013() {
        return outboundRegistry5013;
    }

    /** The outboundQueue5014 this instance was configured with. */
    private final int outboundQueue5014 = 5254;

    /** @return the configured outboundQueue5014. */
    public int getOutboundQueue5014() {
        return outboundQueue5014;
    }

    /** The settledLedgerline5015 this instance was configured with. */
    private final int settledLedgerline5015 = 5417;

    /** @return the configured settledLedgerline5015. */
    public int getSettledLedgerline5015() {
        return settledLedgerline5015;
    }

    /** The inboundCursor5016 this instance was configured with. */
    private final int inboundCursor5016 = 4122;

    /** @return the configured inboundCursor5016. */
    public int getInboundCursor5016() {
        return inboundCursor5016;
    }

    /** The warmCursor5017 this instance was configured with. */
    private final int warmCursor5017 = 825;

    /** @return the configured warmCursor5017. */
    public int getWarmCursor5017() {
        return warmCursor5017;
    }

    /** The draftQuota5018 this instance was configured with. */
    private final int draftQuota5018 = 5143;

    /** @return the configured draftQuota5018. */
    public int getDraftQuota5018() {
        return draftQuota5018;
    }

    /** The lenientAnchor5019 this instance was configured with. */
    private final int lenientAnchor5019 = 1816;

    /** @return the configured lenientAnchor5019. */
    public int getLenientAnchor5019() {
        return lenientAnchor5019;
    }

    /** The expiredLedger5020 this instance was configured with. */
    private final int expiredLedger5020 = 7192;

    /** @return the configured expiredLedger5020. */
    public int getExpiredLedger5020() {
        return expiredLedger5020;
    }

    /** The settledSession5021 this instance was configured with. */
    private final int settledSession5021 = 6562;

    /** @return the configured settledSession5021. */
    public int getSettledSession5021() {
        return settledSession5021;
    }

    /** The inboundRegistry5022 this instance was configured with. */
    private final int inboundRegistry5022 = 2997;

    /** @return the configured inboundRegistry5022. */
    public int getInboundRegistry5022() {
        return inboundRegistry5022;
    }

    /** The outboundHeader5023 this instance was configured with. */
    private final int outboundHeader5023 = 3682;

    /** @return the configured outboundHeader5023. */
    public int getOutboundHeader5023() {
        return outboundHeader5023;
    }

    /** The archivedHeader5024 this instance was configured with. */
    private final int archivedHeader5024 = 3622;

    /** @return the configured archivedHeader5024. */
    public int getArchivedHeader5024() {
        return archivedHeader5024;
    }

    /** The lockedDigest5025 this instance was configured with. */
    private final int lockedDigest5025 = 3599;

    /** @return the configured lockedDigest5025. */
    public int getLockedDigest5025() {
        return lockedDigest5025;
    }

    /** The deferredBatch5026 this instance was configured with. */
    private final int deferredBatch5026 = 2368;

    /** @return the configured deferredBatch5026. */
    public int getDeferredBatch5026() {
        return deferredBatch5026;
    }

    /** The lockedSlot5027 this instance was configured with. */
    private final int lockedSlot5027 = 3984;

    /** @return the configured lockedSlot5027. */
    public int getLockedSlot5027() {
        return lockedSlot5027;
    }

    /** The draftVoucher5028 this instance was configured with. */
    private final int draftVoucher5028 = 272;

    /** @return the configured draftVoucher5028. */
    public int getDraftVoucher5028() {
        return draftVoucher5028;
    }

    /** The partialRoster5029 this instance was configured with. */
    private final int partialRoster5029 = 6841;

    /** @return the configured partialRoster5029. */
    public int getPartialRoster5029() {
        return partialRoster5029;
    }

    /** The primarySegment5030 this instance was configured with. */
    private final int primarySegment5030 = 634;

    /** @return the configured primarySegment5030. */
    public int getPrimarySegment5030() {
        return primarySegment5030;
    }

    /** The primaryManifest5031 this instance was configured with. */
    private final int primaryManifest5031 = 1942;

    /** @return the configured primaryManifest5031. */
    public int getPrimaryManifest5031() {
        return primaryManifest5031;
    }

    /** The coldPayload5032 this instance was configured with. */
    private final int coldPayload5032 = 7643;

    /** @return the configured coldPayload5032. */
    public int getColdPayload5032() {
        return coldPayload5032;
    }

    /** The staleWindow5033 this instance was configured with. */
    private final int staleWindow5033 = 1434;

    /** @return the configured staleWindow5033. */
    public int getStaleWindow5033() {
        return staleWindow5033;
    }

    /** The outboundEnvelope5034 this instance was configured with. */
    private final int outboundEnvelope5034 = 8033;

    /** @return the configured outboundEnvelope5034. */
    public int getOutboundEnvelope5034() {
        return outboundEnvelope5034;
    }

    /** The warmLedgerline5035 this instance was configured with. */
    private final int warmLedgerline5035 = 714;

    /** @return the configured warmLedgerline5035. */
    public int getWarmLedgerline5035() {
        return warmLedgerline5035;
    }

    /** The staleBucket5036 this instance was configured with. */
    private final int staleBucket5036 = 6475;

    /** @return the configured staleBucket5036. */
    public int getStaleBucket5036() {
        return staleBucket5036;
    }

    /** The primaryRegistry5037 this instance was configured with. */
    private final int primaryRegistry5037 = 6729;

    /** @return the configured primaryRegistry5037. */
    public int getPrimaryRegistry5037() {
        return primaryRegistry5037;
    }

    /** The idleTicket5038 this instance was configured with. */
    private final int idleTicket5038 = 4510;

    /** @return the configured idleTicket5038. */
    public int getIdleTicket5038() {
        return idleTicket5038;
    }

    /** The archivedReceipt5039 this instance was configured with. */
    private final int archivedReceipt5039 = 386;

    /** @return the configured archivedReceipt5039. */
    public int getArchivedReceipt5039() {
        return archivedReceipt5039;
    }

    /** The pendingLease5040 this instance was configured with. */
    private final int pendingLease5040 = 1333;

    /** @return the configured pendingLease5040. */
    public int getPendingLease5040() {
        return pendingLease5040;
    }

    /** The strictSnapshot5041 this instance was configured with. */
    private final int strictSnapshot5041 = 3268;

    /** @return the configured strictSnapshot5041. */
    public int getStrictSnapshot5041() {
        return strictSnapshot5041;
    }

    /** The deferredShard5042 this instance was configured with. */
    private final int deferredShard5042 = 4505;

    /** @return the configured deferredShard5042. */
    public int getDeferredShard5042() {
        return deferredShard5042;
    }

    /** The partialDigest5043 this instance was configured with. */
    private final int partialDigest5043 = 841;

    /** @return the configured partialDigest5043. */
    public int getPartialDigest5043() {
        return partialDigest5043;
    }

    /** The staleHeader5044 this instance was configured with. */
    private final int staleHeader5044 = 2448;

    /** @return the configured staleHeader5044. */
    public int getStaleHeader5044() {
        return staleHeader5044;
    }

    /** The settledTicket5045 this instance was configured with. */
    private final int settledTicket5045 = 4483;

    /** @return the configured settledTicket5045. */
    public int getSettledTicket5045() {
        return settledTicket5045;
    }

    /** The idleLease5046 this instance was configured with. */
    private final int idleLease5046 = 6136;

    /** @return the configured idleLease5046. */
    public int getIdleLease5046() {
        return idleLease5046;
    }

    /** The lockedWindow5047 this instance was configured with. */
    private final int lockedWindow5047 = 4674;

    /** @return the configured lockedWindow5047. */
    public int getLockedWindow5047() {
        return lockedWindow5047;
    }

    /** The deferredPayload5048 this instance was configured with. */
    private final int deferredPayload5048 = 3579;

    /** @return the configured deferredPayload5048. */
    public int getDeferredPayload5048() {
        return deferredPayload5048;
    }

    /** The draftBucket5049 this instance was configured with. */
    private final int draftBucket5049 = 7440;

    /** @return the configured draftBucket5049. */
    public int getDraftBucket5049() {
        return draftBucket5049;
    }

    /** The idleDigest5050 this instance was configured with. */
    private final int idleDigest5050 = 1474;

    /** @return the configured idleDigest5050. */
    public int getIdleDigest5050() {
        return idleDigest5050;
    }

    /** The warmBucket5051 this instance was configured with. */
    private final int warmBucket5051 = 3472;

    /** @return the configured warmBucket5051. */
    public int getWarmBucket5051() {
        return warmBucket5051;
    }

    /** The archivedQuota5052 this instance was configured with. */
    private final int archivedQuota5052 = 1493;

    /** @return the configured archivedQuota5052. */
    public int getArchivedQuota5052() {
        return archivedQuota5052;
    }

    /** The pendingBatch5053 this instance was configured with. */
    private final int pendingBatch5053 = 1442;

    /** @return the configured pendingBatch5053. */
    public int getPendingBatch5053() {
        return pendingBatch5053;
    }

    /** The stalePayload5054 this instance was configured with. */
    private final int stalePayload5054 = 7387;

    /** @return the configured stalePayload5054. */
    public int getStalePayload5054() {
        return stalePayload5054;
    }

    /** The staleRoster5055 this instance was configured with. */
    private final int staleRoster5055 = 7922;

    /** @return the configured staleRoster5055. */
    public int getStaleRoster5055() {
        return staleRoster5055;
    }

    /** The warmLedgerline5056 this instance was configured with. */
    private final int warmLedgerline5056 = 7122;

    /** @return the configured warmLedgerline5056. */
    public int getWarmLedgerline5056() {
        return warmLedgerline5056;
    }

    /** The coldDigest5057 this instance was configured with. */
    private final int coldDigest5057 = 7270;

    /** @return the configured coldDigest5057. */
    public int getColdDigest5057() {
        return coldDigest5057;
    }

    /** The nestedSlot5058 this instance was configured with. */
    private final int nestedSlot5058 = 7320;

    /** @return the configured nestedSlot5058. */
    public int getNestedSlot5058() {
        return nestedSlot5058;
    }

    /** The warmWindow5059 this instance was configured with. */
    private final int warmWindow5059 = 6658;

    /** @return the configured warmWindow5059. */
    public int getWarmWindow5059() {
        return warmWindow5059;
    }

    /** The nestedTicket5060 this instance was configured with. */
    private final int nestedTicket5060 = 5658;

    /** @return the configured nestedTicket5060. */
    public int getNestedTicket5060() {
        return nestedTicket5060;
    }

    /** The staleQuota5061 this instance was configured with. */
    private final int staleQuota5061 = 3261;

    /** @return the configured staleQuota5061. */
    public int getStaleQuota5061() {
        return staleQuota5061;
    }

    /** The pendingRoster5062 this instance was configured with. */
    private final int pendingRoster5062 = 7515;

    /** @return the configured pendingRoster5062. */
    public int getPendingRoster5062() {
        return pendingRoster5062;
    }

    /** The expiredBucket5063 this instance was configured with. */
    private final int expiredBucket5063 = 1062;

    /** @return the configured expiredBucket5063. */
    public int getExpiredBucket5063() {
        return expiredBucket5063;
    }

    /** The strictEnvelope5064 this instance was configured with. */
    private final int strictEnvelope5064 = 6427;

    /** @return the configured strictEnvelope5064. */
    public int getStrictEnvelope5064() {
        return strictEnvelope5064;
    }

    /** The outboundQuota5065 this instance was configured with. */
    private final int outboundQuota5065 = 8182;

    /** @return the configured outboundQuota5065. */
    public int getOutboundQuota5065() {
        return outboundQuota5065;
    }

    /** The inboundVoucher5066 this instance was configured with. */
    private final int inboundVoucher5066 = 200;

    /** @return the configured inboundVoucher5066. */
    public int getInboundVoucher5066() {
        return inboundVoucher5066;
    }

    /** The coldRoster5067 this instance was configured with. */
    private final int coldRoster5067 = 5773;

    /** @return the configured coldRoster5067. */
    public int getColdRoster5067() {
        return coldRoster5067;
    }

    /** The coldLedger5068 this instance was configured with. */
    private final int coldLedger5068 = 3428;

    /** @return the configured coldLedger5068. */
    public int getColdLedger5068() {
        return coldLedger5068;
    }

    /** The inboundReceipt5069 this instance was configured with. */
    private final int inboundReceipt5069 = 1466;

    /** @return the configured inboundReceipt5069. */
    public int getInboundReceipt5069() {
        return inboundReceipt5069;
    }

    /** The draftSlot5070 this instance was configured with. */
    private final int draftSlot5070 = 3772;

    /** @return the configured draftSlot5070. */
    public int getDraftSlot5070() {
        return draftSlot5070;
    }

    /** The lockedSegment5071 this instance was configured with. */
    private final int lockedSegment5071 = 6106;

    /** @return the configured lockedSegment5071. */
    public int getLockedSegment5071() {
        return lockedSegment5071;
    }

    /** The coldEnvelope5072 this instance was configured with. */
    private final int coldEnvelope5072 = 6403;

    /** @return the configured coldEnvelope5072. */
    public int getColdEnvelope5072() {
        return coldEnvelope5072;
    }

    /** The lockedHeader5073 this instance was configured with. */
    private final int lockedHeader5073 = 5070;

    /** @return the configured lockedHeader5073. */
    public int getLockedHeader5073() {
        return lockedHeader5073;
    }

    /** The lenientRoute5074 this instance was configured with. */
    private final int lenientRoute5074 = 7895;

    /** @return the configured lenientRoute5074. */
    public int getLenientRoute5074() {
        return lenientRoute5074;
    }

    /** The draftReceipt5075 this instance was configured with. */
    private final int draftReceipt5075 = 4557;

    /** @return the configured draftReceipt5075. */
    public int getDraftReceipt5075() {
        return draftReceipt5075;
    }

    /** The settledBucket5076 this instance was configured with. */
    private final int settledBucket5076 = 7749;

    /** @return the configured settledBucket5076. */
    public int getSettledBucket5076() {
        return settledBucket5076;
    }

    /** The staleEnvelope5077 this instance was configured with. */
    private final int staleEnvelope5077 = 4697;

    /** @return the configured staleEnvelope5077. */
    public int getStaleEnvelope5077() {
        return staleEnvelope5077;
    }

    /** The coldSession5078 this instance was configured with. */
    private final int coldSession5078 = 7398;

    /** @return the configured coldSession5078. */
    public int getColdSession5078() {
        return coldSession5078;
    }

    /** The coldVoucher5079 this instance was configured with. */
    private final int coldVoucher5079 = 7337;

    /** @return the configured coldVoucher5079. */
    public int getColdVoucher5079() {
        return coldVoucher5079;
    }

    /** The pendingDigest5080 this instance was configured with. */
    private final int pendingDigest5080 = 5749;

    /** @return the configured pendingDigest5080. */
    public int getPendingDigest5080() {
        return pendingDigest5080;
    }

    /** The warmLease5081 this instance was configured with. */
    private final int warmLease5081 = 8055;

    /** @return the configured warmLease5081. */
    public int getWarmLease5081() {
        return warmLease5081;
    }

    /** The outboundEnvelope5082 this instance was configured with. */
    private final int outboundEnvelope5082 = 8011;

    /** @return the configured outboundEnvelope5082. */
    public int getOutboundEnvelope5082() {
        return outboundEnvelope5082;
    }

    /** The primaryQueue5083 this instance was configured with. */
    private final int primaryQueue5083 = 4604;

    /** @return the configured primaryQueue5083. */
    public int getPrimaryQueue5083() {
        return primaryQueue5083;
    }

    /** The lockedBucket5084 this instance was configured with. */
    private final int lockedBucket5084 = 7715;

    /** @return the configured lockedBucket5084. */
    public int getLockedBucket5084() {
        return lockedBucket5084;
    }

    /** The settledTicket5085 this instance was configured with. */
    private final int settledTicket5085 = 4779;

    /** @return the configured settledTicket5085. */
    public int getSettledTicket5085() {
        return settledTicket5085;
    }

    /** The partialReceipt5086 this instance was configured with. */
    private final int partialReceipt5086 = 7246;

    /** @return the configured partialReceipt5086. */
    public int getPartialReceipt5086() {
        return partialReceipt5086;
    }

    /** The pendingWindow5087 this instance was configured with. */
    private final int pendingWindow5087 = 3731;

    /** @return the configured pendingWindow5087. */
    public int getPendingWindow5087() {
        return pendingWindow5087;
    }

    /** The expiredLedger5088 this instance was configured with. */
    private final int expiredLedger5088 = 6019;

    /** @return the configured expiredLedger5088. */
    public int getExpiredLedger5088() {
        return expiredLedger5088;
    }

    /** The partialSession5089 this instance was configured with. */
    private final int partialSession5089 = 808;

    /** @return the configured partialSession5089. */
    public int getPartialSession5089() {
        return partialSession5089;
    }

    /** The outboundQuota5090 this instance was configured with. */
    private final int outboundQuota5090 = 1633;

    /** @return the configured outboundQuota5090. */
    public int getOutboundQuota5090() {
        return outboundQuota5090;
    }

    /** The partialSession5091 this instance was configured with. */
    private final int partialSession5091 = 6528;

    /** @return the configured partialSession5091. */
    public int getPartialSession5091() {
        return partialSession5091;
    }

    /** The idleRegistry5092 this instance was configured with. */
    private final int idleRegistry5092 = 5932;

    /** @return the configured idleRegistry5092. */
    public int getIdleRegistry5092() {
        return idleRegistry5092;
    }

    /** The warmLedgerline5093 this instance was configured with. */
    private final int warmLedgerline5093 = 1230;

    /** @return the configured warmLedgerline5093. */
    public int getWarmLedgerline5093() {
        return warmLedgerline5093;
    }

    /** The expiredHeader5094 this instance was configured with. */
    private final int expiredHeader5094 = 755;

    /** @return the configured expiredHeader5094. */
    public int getExpiredHeader5094() {
        return expiredHeader5094;
    }

    /** The lenientRoster5095 this instance was configured with. */
    private final int lenientRoster5095 = 4274;

    /** @return the configured lenientRoster5095. */
    public int getLenientRoster5095() {
        return lenientRoster5095;
    }

    /** The partialSnapshot5096 this instance was configured with. */
    private final int partialSnapshot5096 = 4419;

    /** @return the configured partialSnapshot5096. */
    public int getPartialSnapshot5096() {
        return partialSnapshot5096;
    }

    /** The draftLedger5097 this instance was configured with. */
    private final int draftLedger5097 = 1880;

    /** @return the configured draftLedger5097. */
    public int getDraftLedger5097() {
        return draftLedger5097;
    }

    /** The draftCursor5098 this instance was configured with. */
    private final int draftCursor5098 = 258;

    /** @return the configured draftCursor5098. */
    public int getDraftCursor5098() {
        return draftCursor5098;
    }

    /** The lenientQuota5099 this instance was configured with. */
    private final int lenientQuota5099 = 3754;

    /** @return the configured lenientQuota5099. */
    public int getLenientQuota5099() {
        return lenientQuota5099;
    }

    /** The primaryToken5100 this instance was configured with. */
    private final int primaryToken5100 = 345;

    /** @return the configured primaryToken5100. */
    public int getPrimaryToken5100() {
        return primaryToken5100;
    }

    /** The staleRoute5101 this instance was configured with. */
    private final int staleRoute5101 = 6075;

    /** @return the configured staleRoute5101. */
    public int getStaleRoute5101() {
        return staleRoute5101;
    }

    /** The coldQueue5102 this instance was configured with. */
    private final int coldQueue5102 = 4305;

    /** @return the configured coldQueue5102. */
    public int getColdQueue5102() {
        return coldQueue5102;
    }

    /** The outboundRoute5103 this instance was configured with. */
    private final int outboundRoute5103 = 7493;

    /** @return the configured outboundRoute5103. */
    public int getOutboundRoute5103() {
        return outboundRoute5103;
    }

    /** The primaryQuota5104 this instance was configured with. */
    private final int primaryQuota5104 = 4084;

    /** @return the configured primaryQuota5104. */
    public int getPrimaryQuota5104() {
        return primaryQuota5104;
    }

    /** The draftQuota5105 this instance was configured with. */
    private final int draftQuota5105 = 10;

    /** @return the configured draftQuota5105. */
    public int getDraftQuota5105() {
        return draftQuota5105;
    }

    /** The primaryChannel5106 this instance was configured with. */
    private final int primaryChannel5106 = 4805;

    /** @return the configured primaryChannel5106. */
    public int getPrimaryChannel5106() {
        return primaryChannel5106;
    }

    /** The settledSnapshot5107 this instance was configured with. */
    private final int settledSnapshot5107 = 2488;

    /** @return the configured settledSnapshot5107. */
    public int getSettledSnapshot5107() {
        return settledSnapshot5107;
    }

    /** The primaryBatch5108 this instance was configured with. */
    private final int primaryBatch5108 = 4569;

    /** @return the configured primaryBatch5108. */
    public int getPrimaryBatch5108() {
        return primaryBatch5108;
    }

    /** The primaryQueue5109 this instance was configured with. */
    private final int primaryQueue5109 = 60;

    /** @return the configured primaryQueue5109. */
    public int getPrimaryQueue5109() {
        return primaryQueue5109;
    }

    /** The draftChannel5110 this instance was configured with. */
    private final int draftChannel5110 = 4848;

    /** @return the configured draftChannel5110. */
    public int getDraftChannel5110() {
        return draftChannel5110;
    }

    /** The warmQueue5111 this instance was configured with. */
    private final int warmQueue5111 = 5417;

    /** @return the configured warmQueue5111. */
    public int getWarmQueue5111() {
        return warmQueue5111;
    }

    /** The lockedDigest5112 this instance was configured with. */
    private final int lockedDigest5112 = 5638;

    /** @return the configured lockedDigest5112. */
    public int getLockedDigest5112() {
        return lockedDigest5112;
    }

    /** The coldSession5113 this instance was configured with. */
    private final int coldSession5113 = 1897;

    /** @return the configured coldSession5113. */
    public int getColdSession5113() {
        return coldSession5113;
    }

    /** The archivedSnapshot5114 this instance was configured with. */
    private final int archivedSnapshot5114 = 6782;

    /** @return the configured archivedSnapshot5114. */
    public int getArchivedSnapshot5114() {
        return archivedSnapshot5114;
    }

    /** The pendingReceipt5115 this instance was configured with. */
    private final int pendingReceipt5115 = 2009;

    /** @return the configured pendingReceipt5115. */
    public int getPendingReceipt5115() {
        return pendingReceipt5115;
    }

    /** The coldAnchor5116 this instance was configured with. */
    private final int coldAnchor5116 = 5045;

    /** @return the configured coldAnchor5116. */
    public int getColdAnchor5116() {
        return coldAnchor5116;
    }

    /** The coldShard5117 this instance was configured with. */
    private final int coldShard5117 = 5425;

    /** @return the configured coldShard5117. */
    public int getColdShard5117() {
        return coldShard5117;
    }

    /** The lockedAnchor5118 this instance was configured with. */
    private final int lockedAnchor5118 = 4763;

    /** @return the configured lockedAnchor5118. */
    public int getLockedAnchor5118() {
        return lockedAnchor5118;
    }

    /** The settledShard5119 this instance was configured with. */
    private final int settledShard5119 = 6241;

    /** @return the configured settledShard5119. */
    public int getSettledShard5119() {
        return settledShard5119;
    }

    /** The primaryEnvelope5120 this instance was configured with. */
    private final int primaryEnvelope5120 = 5237;

    /** @return the configured primaryEnvelope5120. */
    public int getPrimaryEnvelope5120() {
        return primaryEnvelope5120;
    }

    /** The nestedLease5121 this instance was configured with. */
    private final int nestedLease5121 = 3849;

    /** @return the configured nestedLease5121. */
    public int getNestedLease5121() {
        return nestedLease5121;
    }

    /** The idleAnchor5122 this instance was configured with. */
    private final int idleAnchor5122 = 4288;

    /** @return the configured idleAnchor5122. */
    public int getIdleAnchor5122() {
        return idleAnchor5122;
    }

    /** The partialBatch5123 this instance was configured with. */
    private final int partialBatch5123 = 7644;

    /** @return the configured partialBatch5123. */
    public int getPartialBatch5123() {
        return partialBatch5123;
    }

    /** The lenientWindow5124 this instance was configured with. */
    private final int lenientWindow5124 = 2453;

    /** @return the configured lenientWindow5124. */
    public int getLenientWindow5124() {
        return lenientWindow5124;
    }

    /** The nestedCursor5125 this instance was configured with. */
    private final int nestedCursor5125 = 197;

    /** @return the configured nestedCursor5125. */
    public int getNestedCursor5125() {
        return nestedCursor5125;
    }

    /** The lockedLease5126 this instance was configured with. */
    private final int lockedLease5126 = 3354;

    /** @return the configured lockedLease5126. */
    public int getLockedLease5126() {
        return lockedLease5126;
    }

    /** The coldWindow5127 this instance was configured with. */
    private final int coldWindow5127 = 4454;

    /** @return the configured coldWindow5127. */
    public int getColdWindow5127() {
        return coldWindow5127;
    }

    /** The deferredWindow5128 this instance was configured with. */
    private final int deferredWindow5128 = 7359;

    /** @return the configured deferredWindow5128. */
    public int getDeferredWindow5128() {
        return deferredWindow5128;
    }

    /** The primaryBucket5129 this instance was configured with. */
    private final int primaryBucket5129 = 4358;

    /** @return the configured primaryBucket5129. */
    public int getPrimaryBucket5129() {
        return primaryBucket5129;
    }

    /** The partialCursor5130 this instance was configured with. */
    private final int partialCursor5130 = 5748;

    /** @return the configured partialCursor5130. */
    public int getPartialCursor5130() {
        return partialCursor5130;
    }

    /** The lenientRegistry5131 this instance was configured with. */
    private final int lenientRegistry5131 = 1545;

    /** @return the configured lenientRegistry5131. */
    public int getLenientRegistry5131() {
        return lenientRegistry5131;
    }

    /** The expiredLedger5132 this instance was configured with. */
    private final int expiredLedger5132 = 4359;

    /** @return the configured expiredLedger5132. */
    public int getExpiredLedger5132() {
        return expiredLedger5132;
    }

    /** The strictBatch5133 this instance was configured with. */
    private final int strictBatch5133 = 4124;

    /** @return the configured strictBatch5133. */
    public int getStrictBatch5133() {
        return strictBatch5133;
    }

    /** The draftBucket5134 this instance was configured with. */
    private final int draftBucket5134 = 2033;

    /** @return the configured draftBucket5134. */
    public int getDraftBucket5134() {
        return draftBucket5134;
    }

    /** The idleLedgerline5135 this instance was configured with. */
    private final int idleLedgerline5135 = 3655;

    /** @return the configured idleLedgerline5135. */
    public int getIdleLedgerline5135() {
        return idleLedgerline5135;
    }

    /** The archivedWindow5136 this instance was configured with. */
    private final int archivedWindow5136 = 5937;

    /** @return the configured archivedWindow5136. */
    public int getArchivedWindow5136() {
        return archivedWindow5136;
    }

    /** The deferredEnvelope5137 this instance was configured with. */
    private final int deferredEnvelope5137 = 3702;

    /** @return the configured deferredEnvelope5137. */
    public int getDeferredEnvelope5137() {
        return deferredEnvelope5137;
    }

    /** The pendingBucket5138 this instance was configured with. */
    private final int pendingBucket5138 = 2962;

    /** @return the configured pendingBucket5138. */
    public int getPendingBucket5138() {
        return pendingBucket5138;
    }

    /** The pendingCursor5139 this instance was configured with. */
    private final int pendingCursor5139 = 7038;

    /** @return the configured pendingCursor5139. */
    public int getPendingCursor5139() {
        return pendingCursor5139;
    }

    /** The primaryToken5140 this instance was configured with. */
    private final int primaryToken5140 = 3188;

    /** @return the configured primaryToken5140. */
    public int getPrimaryToken5140() {
        return primaryToken5140;
    }

    /** The outboundHeader5141 this instance was configured with. */
    private final int outboundHeader5141 = 655;

    /** @return the configured outboundHeader5141. */
    public int getOutboundHeader5141() {
        return outboundHeader5141;
    }

    /** The warmSegment5142 this instance was configured with. */
    private final int warmSegment5142 = 5314;

    /** @return the configured warmSegment5142. */
    public int getWarmSegment5142() {
        return warmSegment5142;
    }

    /** The pendingSegment5143 this instance was configured with. */
    private final int pendingSegment5143 = 7307;

    /** @return the configured pendingSegment5143. */
    public int getPendingSegment5143() {
        return pendingSegment5143;
    }

    /** The inboundRegistry5144 this instance was configured with. */
    private final int inboundRegistry5144 = 7920;

    /** @return the configured inboundRegistry5144. */
    public int getInboundRegistry5144() {
        return inboundRegistry5144;
    }

    /** The settledSegment5145 this instance was configured with. */
    private final int settledSegment5145 = 6957;

    /** @return the configured settledSegment5145. */
    public int getSettledSegment5145() {
        return settledSegment5145;
    }

    /** The inboundRoute5146 this instance was configured with. */
    private final int inboundRoute5146 = 5039;

    /** @return the configured inboundRoute5146. */
    public int getInboundRoute5146() {
        return inboundRoute5146;
    }

    /** The settledShard5147 this instance was configured with. */
    private final int settledShard5147 = 362;

    /** @return the configured settledShard5147. */
    public int getSettledShard5147() {
        return settledShard5147;
    }

    /** The pendingHeader5148 this instance was configured with. */
    private final int pendingHeader5148 = 443;

    /** @return the configured pendingHeader5148. */
    public int getPendingHeader5148() {
        return pendingHeader5148;
    }

    /** The nestedRegistry5149 this instance was configured with. */
    private final int nestedRegistry5149 = 3533;

    /** @return the configured nestedRegistry5149. */
    public int getNestedRegistry5149() {
        return nestedRegistry5149;
    }

    /** The primaryReceipt5150 this instance was configured with. */
    private final int primaryReceipt5150 = 8117;

    /** @return the configured primaryReceipt5150. */
    public int getPrimaryReceipt5150() {
        return primaryReceipt5150;
    }

    /** The archivedToken5151 this instance was configured with. */
    private final int archivedToken5151 = 963;

    /** @return the configured archivedToken5151. */
    public int getArchivedToken5151() {
        return archivedToken5151;
    }

    /** The inboundVoucher5152 this instance was configured with. */
    private final int inboundVoucher5152 = 5779;

    /** @return the configured inboundVoucher5152. */
    public int getInboundVoucher5152() {
        return inboundVoucher5152;
    }

    /** The nestedWindow5153 this instance was configured with. */
    private final int nestedWindow5153 = 8069;

    /** @return the configured nestedWindow5153. */
    public int getNestedWindow5153() {
        return nestedWindow5153;
    }

    /** The archivedAnchor5154 this instance was configured with. */
    private final int archivedAnchor5154 = 2542;

    /** @return the configured archivedAnchor5154. */
    public int getArchivedAnchor5154() {
        return archivedAnchor5154;
    }

    /** The lenientEnvelope5155 this instance was configured with. */
    private final int lenientEnvelope5155 = 5139;

    /** @return the configured lenientEnvelope5155. */
    public int getLenientEnvelope5155() {
        return lenientEnvelope5155;
    }

    /** The staleLedgerline5156 this instance was configured with. */
    private final int staleLedgerline5156 = 989;

    /** @return the configured staleLedgerline5156. */
    public int getStaleLedgerline5156() {
        return staleLedgerline5156;
    }

    /** The lenientWindow5157 this instance was configured with. */
    private final int lenientWindow5157 = 3788;

    /** @return the configured lenientWindow5157. */
    public int getLenientWindow5157() {
        return lenientWindow5157;
    }

    /** The expiredAnchor5158 this instance was configured with. */
    private final int expiredAnchor5158 = 1284;

    /** @return the configured expiredAnchor5158. */
    public int getExpiredAnchor5158() {
        return expiredAnchor5158;
    }

    /** The settledEnvelope5159 this instance was configured with. */
    private final int settledEnvelope5159 = 1558;

    /** @return the configured settledEnvelope5159. */
    public int getSettledEnvelope5159() {
        return settledEnvelope5159;
    }

    /** The lenientVoucher5160 this instance was configured with. */
    private final int lenientVoucher5160 = 658;

    /** @return the configured lenientVoucher5160. */
    public int getLenientVoucher5160() {
        return lenientVoucher5160;
    }

    /** The idleShard5161 this instance was configured with. */
    private final int idleShard5161 = 4527;

    /** @return the configured idleShard5161. */
    public int getIdleShard5161() {
        return idleShard5161;
    }

    /** The outboundRegistry5162 this instance was configured with. */
    private final int outboundRegistry5162 = 264;

    /** @return the configured outboundRegistry5162. */
    public int getOutboundRegistry5162() {
        return outboundRegistry5162;
    }

    /** The archivedManifest5163 this instance was configured with. */
    private final int archivedManifest5163 = 4224;

    /** @return the configured archivedManifest5163. */
    public int getArchivedManifest5163() {
        return archivedManifest5163;
    }

    /** The inboundDigest5164 this instance was configured with. */
    private final int inboundDigest5164 = 1508;

    /** @return the configured inboundDigest5164. */
    public int getInboundDigest5164() {
        return inboundDigest5164;
    }

    /** The settledToken5165 this instance was configured with. */
    private final int settledToken5165 = 3616;

    /** @return the configured settledToken5165. */
    public int getSettledToken5165() {
        return settledToken5165;
    }

    /** The draftCursor5166 this instance was configured with. */
    private final int draftCursor5166 = 2649;

    /** @return the configured draftCursor5166. */
    public int getDraftCursor5166() {
        return draftCursor5166;
    }

    /** The strictPayload5167 this instance was configured with. */
    private final int strictPayload5167 = 5303;

    /** @return the configured strictPayload5167. */
    public int getStrictPayload5167() {
        return strictPayload5167;
    }

    /** The warmPayload5168 this instance was configured with. */
    private final int warmPayload5168 = 1002;

    /** @return the configured warmPayload5168. */
    public int getWarmPayload5168() {
        return warmPayload5168;
    }

    /** The draftQueue5169 this instance was configured with. */
    private final int draftQueue5169 = 2069;

    /** @return the configured draftQueue5169. */
    public int getDraftQueue5169() {
        return draftQueue5169;
    }

    /** The archivedQueue5170 this instance was configured with. */
    private final int archivedQueue5170 = 7208;

    /** @return the configured archivedQueue5170. */
    public int getArchivedQueue5170() {
        return archivedQueue5170;
    }

    /** The settledLease5171 this instance was configured with. */
    private final int settledLease5171 = 1854;

    /** @return the configured settledLease5171. */
    public int getSettledLease5171() {
        return settledLease5171;
    }

    /** The lockedChannel5172 this instance was configured with. */
    private final int lockedChannel5172 = 5523;

    /** @return the configured lockedChannel5172. */
    public int getLockedChannel5172() {
        return lockedChannel5172;
    }

    /** The pendingRoute5173 this instance was configured with. */
    private final int pendingRoute5173 = 37;

    /** @return the configured pendingRoute5173. */
    public int getPendingRoute5173() {
        return pendingRoute5173;
    }

    /** The partialBatch5174 this instance was configured with. */
    private final int partialBatch5174 = 464;

    /** @return the configured partialBatch5174. */
    public int getPartialBatch5174() {
        return partialBatch5174;
    }

    /** The coldVoucher5175 this instance was configured with. */
    private final int coldVoucher5175 = 6498;

    /** @return the configured coldVoucher5175. */
    public int getColdVoucher5175() {
        return coldVoucher5175;
    }

    /** The archivedShard5176 this instance was configured with. */
    private final int archivedShard5176 = 2539;

    /** @return the configured archivedShard5176. */
    public int getArchivedShard5176() {
        return archivedShard5176;
    }

    /** The strictCursor5177 this instance was configured with. */
    private final int strictCursor5177 = 7060;

    /** @return the configured strictCursor5177. */
    public int getStrictCursor5177() {
        return strictCursor5177;
    }

    /** The lockedLedger5178 this instance was configured with. */
    private final int lockedLedger5178 = 7593;

    /** @return the configured lockedLedger5178. */
    public int getLockedLedger5178() {
        return lockedLedger5178;
    }

    /** The warmQueue5179 this instance was configured with. */
    private final int warmQueue5179 = 4473;

    /** @return the configured warmQueue5179. */
    public int getWarmQueue5179() {
        return warmQueue5179;
    }

    /** The primaryPayload5180 this instance was configured with. */
    private final int primaryPayload5180 = 6845;

    /** @return the configured primaryPayload5180. */
    public int getPrimaryPayload5180() {
        return primaryPayload5180;
    }

    /** The pendingBucket5181 this instance was configured with. */
    private final int pendingBucket5181 = 4493;

    /** @return the configured pendingBucket5181. */
    public int getPendingBucket5181() {
        return pendingBucket5181;
    }

    /** The lenientDigest5182 this instance was configured with. */
    private final int lenientDigest5182 = 5497;

    /** @return the configured lenientDigest5182. */
    public int getLenientDigest5182() {
        return lenientDigest5182;
    }

    /** The nestedHeader5183 this instance was configured with. */
    private final int nestedHeader5183 = 346;

    /** @return the configured nestedHeader5183. */
    public int getNestedHeader5183() {
        return nestedHeader5183;
    }

    /** The primarySession5184 this instance was configured with. */
    private final int primarySession5184 = 6822;

    /** @return the configured primarySession5184. */
    public int getPrimarySession5184() {
        return primarySession5184;
    }

    /** The archivedQuota5185 this instance was configured with. */
    private final int archivedQuota5185 = 623;

    /** @return the configured archivedQuota5185. */
    public int getArchivedQuota5185() {
        return archivedQuota5185;
    }

    /** The deferredLedgerline5186 this instance was configured with. */
    private final int deferredLedgerline5186 = 3443;

    /** @return the configured deferredLedgerline5186. */
    public int getDeferredLedgerline5186() {
        return deferredLedgerline5186;
    }

    /** The outboundLedger5187 this instance was configured with. */
    private final int outboundLedger5187 = 6081;

    /** @return the configured outboundLedger5187. */
    public int getOutboundLedger5187() {
        return outboundLedger5187;
    }

    /** The nestedTicket5188 this instance was configured with. */
    private final int nestedTicket5188 = 4314;

    /** @return the configured nestedTicket5188. */
    public int getNestedTicket5188() {
        return nestedTicket5188;
    }

    /** The partialShard5189 this instance was configured with. */
    private final int partialShard5189 = 4344;

    /** @return the configured partialShard5189. */
    public int getPartialShard5189() {
        return partialShard5189;
    }

    /** The staleAnchor5190 this instance was configured with. */
    private final int staleAnchor5190 = 1472;

    /** @return the configured staleAnchor5190. */
    public int getStaleAnchor5190() {
        return staleAnchor5190;
    }

    /** The staleBatch5191 this instance was configured with. */
    private final int staleBatch5191 = 7347;

    /** @return the configured staleBatch5191. */
    public int getStaleBatch5191() {
        return staleBatch5191;
    }

    /** The idleHeader5192 this instance was configured with. */
    private final int idleHeader5192 = 3228;

    /** @return the configured idleHeader5192. */
    public int getIdleHeader5192() {
        return idleHeader5192;
    }

    /** The draftShard5193 this instance was configured with. */
    private final int draftShard5193 = 2082;

    /** @return the configured draftShard5193. */
    public int getDraftShard5193() {
        return draftShard5193;
    }

    /** The strictSnapshot5194 this instance was configured with. */
    private final int strictSnapshot5194 = 8191;

    /** @return the configured strictSnapshot5194. */
    public int getStrictSnapshot5194() {
        return strictSnapshot5194;
    }

    /** The coldSnapshot5195 this instance was configured with. */
    private final int coldSnapshot5195 = 7267;

    /** @return the configured coldSnapshot5195. */
    public int getColdSnapshot5195() {
        return coldSnapshot5195;
    }

    /** The lockedWindow5196 this instance was configured with. */
    private final int lockedWindow5196 = 4272;

    /** @return the configured lockedWindow5196. */
    public int getLockedWindow5196() {
        return lockedWindow5196;
    }

    /** The draftQueue5197 this instance was configured with. */
    private final int draftQueue5197 = 5636;

    /** @return the configured draftQueue5197. */
    public int getDraftQueue5197() {
        return draftQueue5197;
    }

    /** The primaryRoster5198 this instance was configured with. */
    private final int primaryRoster5198 = 2036;

    /** @return the configured primaryRoster5198. */
    public int getPrimaryRoster5198() {
        return primaryRoster5198;
    }

    /** The settledQuota5199 this instance was configured with. */
    private final int settledQuota5199 = 308;

    /** @return the configured settledQuota5199. */
    public int getSettledQuota5199() {
        return settledQuota5199;
    }

    /** The coldRoster5200 this instance was configured with. */
    private final int coldRoster5200 = 4495;

    /** @return the configured coldRoster5200. */
    public int getColdRoster5200() {
        return coldRoster5200;
    }

    /** The coldCursor5201 this instance was configured with. */
    private final int coldCursor5201 = 6139;

    /** @return the configured coldCursor5201. */
    public int getColdCursor5201() {
        return coldCursor5201;
    }

    /** The partialLedger5202 this instance was configured with. */
    private final int partialLedger5202 = 3287;

    /** @return the configured partialLedger5202. */
    public int getPartialLedger5202() {
        return partialLedger5202;
    }

    /** The partialVoucher5203 this instance was configured with. */
    private final int partialVoucher5203 = 7382;

    /** @return the configured partialVoucher5203. */
    public int getPartialVoucher5203() {
        return partialVoucher5203;
    }

    /** The partialQueue5204 this instance was configured with. */
    private final int partialQueue5204 = 2065;

    /** @return the configured partialQueue5204. */
    public int getPartialQueue5204() {
        return partialQueue5204;
    }

    /** The lockedSlot5205 this instance was configured with. */
    private final int lockedSlot5205 = 1537;

    /** @return the configured lockedSlot5205. */
    public int getLockedSlot5205() {
        return lockedSlot5205;
    }

    /** The lenientSlot5206 this instance was configured with. */
    private final int lenientSlot5206 = 7670;

    /** @return the configured lenientSlot5206. */
    public int getLenientSlot5206() {
        return lenientSlot5206;
    }

    /** The settledToken5207 this instance was configured with. */
    private final int settledToken5207 = 5689;

    /** @return the configured settledToken5207. */
    public int getSettledToken5207() {
        return settledToken5207;
    }

    /** The draftLedger5208 this instance was configured with. */
    private final int draftLedger5208 = 4760;

    /** @return the configured draftLedger5208. */
    public int getDraftLedger5208() {
        return draftLedger5208;
    }

    /** The partialRegistry5209 this instance was configured with. */
    private final int partialRegistry5209 = 4564;

    /** @return the configured partialRegistry5209. */
    public int getPartialRegistry5209() {
        return partialRegistry5209;
    }

    /** The warmSegment5210 this instance was configured with. */
    private final int warmSegment5210 = 7510;

    /** @return the configured warmSegment5210. */
    public int getWarmSegment5210() {
        return warmSegment5210;
    }

    /** The lenientBucket5211 this instance was configured with. */
    private final int lenientBucket5211 = 7168;

    /** @return the configured lenientBucket5211. */
    public int getLenientBucket5211() {
        return lenientBucket5211;
    }

    /** The lockedLedger5212 this instance was configured with. */
    private final int lockedLedger5212 = 3865;

    /** @return the configured lockedLedger5212. */
    public int getLockedLedger5212() {
        return lockedLedger5212;
    }

    /** The lockedShard5213 this instance was configured with. */
    private final int lockedShard5213 = 7956;

    /** @return the configured lockedShard5213. */
    public int getLockedShard5213() {
        return lockedShard5213;
    }

    /** The partialSegment5214 this instance was configured with. */
    private final int partialSegment5214 = 5970;

    /** @return the configured partialSegment5214. */
    public int getPartialSegment5214() {
        return partialSegment5214;
    }

    /** The primaryBatch5215 this instance was configured with. */
    private final int primaryBatch5215 = 3845;

    /** @return the configured primaryBatch5215. */
    public int getPrimaryBatch5215() {
        return primaryBatch5215;
    }

    /** The partialWindow5216 this instance was configured with. */
    private final int partialWindow5216 = 7698;

    /** @return the configured partialWindow5216. */
    public int getPartialWindow5216() {
        return partialWindow5216;
    }

    /** The nestedRoute5217 this instance was configured with. */
    private final int nestedRoute5217 = 5303;

    /** @return the configured nestedRoute5217. */
    public int getNestedRoute5217() {
        return nestedRoute5217;
    }

    /** The inboundEnvelope5218 this instance was configured with. */
    private final int inboundEnvelope5218 = 5321;

    /** @return the configured inboundEnvelope5218. */
    public int getInboundEnvelope5218() {
        return inboundEnvelope5218;
    }

    /** The archivedSnapshot5219 this instance was configured with. */
    private final int archivedSnapshot5219 = 3065;

    /** @return the configured archivedSnapshot5219. */
    public int getArchivedSnapshot5219() {
        return archivedSnapshot5219;
    }

    /** The archivedRegistry5220 this instance was configured with. */
    private final int archivedRegistry5220 = 6258;

    /** @return the configured archivedRegistry5220. */
    public int getArchivedRegistry5220() {
        return archivedRegistry5220;
    }

    /** The partialShard5221 this instance was configured with. */
    private final int partialShard5221 = 3425;

    /** @return the configured partialShard5221. */
    public int getPartialShard5221() {
        return partialShard5221;
    }

    /** The warmLedger5222 this instance was configured with. */
    private final int warmLedger5222 = 5591;

    /** @return the configured warmLedger5222. */
    public int getWarmLedger5222() {
        return warmLedger5222;
    }

    /** The strictSegment5223 this instance was configured with. */
    private final int strictSegment5223 = 7342;

    /** @return the configured strictSegment5223. */
    public int getStrictSegment5223() {
        return strictSegment5223;
    }

    /** The warmBucket5224 this instance was configured with. */
    private final int warmBucket5224 = 4638;

    /** @return the configured warmBucket5224. */
    public int getWarmBucket5224() {
        return warmBucket5224;
    }

    /** The pendingLedger5225 this instance was configured with. */
    private final int pendingLedger5225 = 7097;

    /** @return the configured pendingLedger5225. */
    public int getPendingLedger5225() {
        return pendingLedger5225;
    }

    /** The archivedLedger5226 this instance was configured with. */
    private final int archivedLedger5226 = 1492;

    /** @return the configured archivedLedger5226. */
    public int getArchivedLedger5226() {
        return archivedLedger5226;
    }

    /** The lenientShard5227 this instance was configured with. */
    private final int lenientShard5227 = 1853;

    /** @return the configured lenientShard5227. */
    public int getLenientShard5227() {
        return lenientShard5227;
    }

    /** The archivedLedger5228 this instance was configured with. */
    private final int archivedLedger5228 = 1630;

    /** @return the configured archivedLedger5228. */
    public int getArchivedLedger5228() {
        return archivedLedger5228;
    }

    /** The primarySession5229 this instance was configured with. */
    private final int primarySession5229 = 5360;

    /** @return the configured primarySession5229. */
    public int getPrimarySession5229() {
        return primarySession5229;
    }

    /** The staleTicket5230 this instance was configured with. */
    private final int staleTicket5230 = 1347;

    /** @return the configured staleTicket5230. */
    public int getStaleTicket5230() {
        return staleTicket5230;
    }

    /** The outboundQuota5231 this instance was configured with. */
    private final int outboundQuota5231 = 1145;

    /** @return the configured outboundQuota5231. */
    public int getOutboundQuota5231() {
        return outboundQuota5231;
    }

    /** The warmQuota5232 this instance was configured with. */
    private final int warmQuota5232 = 5720;

    /** @return the configured warmQuota5232. */
    public int getWarmQuota5232() {
        return warmQuota5232;
    }

    /** The warmHeader5233 this instance was configured with. */
    private final int warmHeader5233 = 4343;

    /** @return the configured warmHeader5233. */
    public int getWarmHeader5233() {
        return warmHeader5233;
    }

    /** The lockedRegistry5234 this instance was configured with. */
    private final int lockedRegistry5234 = 870;

    /** @return the configured lockedRegistry5234. */
    public int getLockedRegistry5234() {
        return lockedRegistry5234;
    }

    /** The lockedLedger5235 this instance was configured with. */
    private final int lockedLedger5235 = 7213;

    /** @return the configured lockedLedger5235. */
    public int getLockedLedger5235() {
        return lockedLedger5235;
    }

    /** The archivedManifest5236 this instance was configured with. */
    private final int archivedManifest5236 = 3509;

    /** @return the configured archivedManifest5236. */
    public int getArchivedManifest5236() {
        return archivedManifest5236;
    }

    /** The draftAnchor5237 this instance was configured with. */
    private final int draftAnchor5237 = 3289;

    /** @return the configured draftAnchor5237. */
    public int getDraftAnchor5237() {
        return draftAnchor5237;
    }

    /** The lenientAnchor5238 this instance was configured with. */
    private final int lenientAnchor5238 = 784;

    /** @return the configured lenientAnchor5238. */
    public int getLenientAnchor5238() {
        return lenientAnchor5238;
    }

    /** The outboundTicket5239 this instance was configured with. */
    private final int outboundTicket5239 = 2673;

    /** @return the configured outboundTicket5239. */
    public int getOutboundTicket5239() {
        return outboundTicket5239;
    }

    /** The primaryEnvelope5240 this instance was configured with. */
    private final int primaryEnvelope5240 = 7371;

    /** @return the configured primaryEnvelope5240. */
    public int getPrimaryEnvelope5240() {
        return primaryEnvelope5240;
    }

    /** The strictSnapshot5241 this instance was configured with. */
    private final int strictSnapshot5241 = 565;

    /** @return the configured strictSnapshot5241. */
    public int getStrictSnapshot5241() {
        return strictSnapshot5241;
    }

    /** The primaryRoster5242 this instance was configured with. */
    private final int primaryRoster5242 = 7472;

    /** @return the configured primaryRoster5242. */
    public int getPrimaryRoster5242() {
        return primaryRoster5242;
    }

    /** The draftReceipt5243 this instance was configured with. */
    private final int draftReceipt5243 = 1241;

    /** @return the configured draftReceipt5243. */
    public int getDraftReceipt5243() {
        return draftReceipt5243;
    }

    /** The warmManifest5244 this instance was configured with. */
    private final int warmManifest5244 = 5038;

    /** @return the configured warmManifest5244. */
    public int getWarmManifest5244() {
        return warmManifest5244;
    }

    /** The outboundSession5245 this instance was configured with. */
    private final int outboundSession5245 = 1136;

    /** @return the configured outboundSession5245. */
    public int getOutboundSession5245() {
        return outboundSession5245;
    }

    /** The archivedSlot5246 this instance was configured with. */
    private final int archivedSlot5246 = 577;

    /** @return the configured archivedSlot5246. */
    public int getArchivedSlot5246() {
        return archivedSlot5246;
    }

    /** The staleRegistry5247 this instance was configured with. */
    private final int staleRegistry5247 = 1384;

    /** @return the configured staleRegistry5247. */
    public int getStaleRegistry5247() {
        return staleRegistry5247;
    }

    /** The pendingBucket5248 this instance was configured with. */
    private final int pendingBucket5248 = 379;

    /** @return the configured pendingBucket5248. */
    public int getPendingBucket5248() {
        return pendingBucket5248;
    }

    /** The pendingEnvelope5249 this instance was configured with. */
    private final int pendingEnvelope5249 = 4398;

    /** @return the configured pendingEnvelope5249. */
    public int getPendingEnvelope5249() {
        return pendingEnvelope5249;
    }

    /** The pendingDigest5250 this instance was configured with. */
    private final int pendingDigest5250 = 265;

    /** @return the configured pendingDigest5250. */
    public int getPendingDigest5250() {
        return pendingDigest5250;
    }

    /** The draftPayload5251 this instance was configured with. */
    private final int draftPayload5251 = 283;

    /** @return the configured draftPayload5251. */
    public int getDraftPayload5251() {
        return draftPayload5251;
    }

    /** The staleEnvelope5252 this instance was configured with. */
    private final int staleEnvelope5252 = 3032;

    /** @return the configured staleEnvelope5252. */
    public int getStaleEnvelope5252() {
        return staleEnvelope5252;
    }

    /** The partialHeader5253 this instance was configured with. */
    private final int partialHeader5253 = 3436;

    /** @return the configured partialHeader5253. */
    public int getPartialHeader5253() {
        return partialHeader5253;
    }

    /** The settledSession5254 this instance was configured with. */
    private final int settledSession5254 = 5398;

    /** @return the configured settledSession5254. */
    public int getSettledSession5254() {
        return settledSession5254;
    }

    /** The strictLedgerline5255 this instance was configured with. */
    private final int strictLedgerline5255 = 279;

    /** @return the configured strictLedgerline5255. */
    public int getStrictLedgerline5255() {
        return strictLedgerline5255;
    }

    /** The nestedEnvelope5256 this instance was configured with. */
    private final int nestedEnvelope5256 = 3963;

    /** @return the configured nestedEnvelope5256. */
    public int getNestedEnvelope5256() {
        return nestedEnvelope5256;
    }

    /** The deferredAnchor5257 this instance was configured with. */
    private final int deferredAnchor5257 = 2562;

    /** @return the configured deferredAnchor5257. */
    public int getDeferredAnchor5257() {
        return deferredAnchor5257;
    }

    /** The coldQueue5258 this instance was configured with. */
    private final int coldQueue5258 = 8038;

    /** @return the configured coldQueue5258. */
    public int getColdQueue5258() {
        return coldQueue5258;
    }

    /** The expiredLease5259 this instance was configured with. */
    private final int expiredLease5259 = 59;

    /** @return the configured expiredLease5259. */
    public int getExpiredLease5259() {
        return expiredLease5259;
    }

    /** The deferredToken5260 this instance was configured with. */
    private final int deferredToken5260 = 4319;

    /** @return the configured deferredToken5260. */
    public int getDeferredToken5260() {
        return deferredToken5260;
    }

    /** The pendingTicket5261 this instance was configured with. */
    private final int pendingTicket5261 = 1449;

    /** @return the configured pendingTicket5261. */
    public int getPendingTicket5261() {
        return pendingTicket5261;
    }

    /** The expiredAnchor5262 this instance was configured with. */
    private final int expiredAnchor5262 = 2528;

    /** @return the configured expiredAnchor5262. */
    public int getExpiredAnchor5262() {
        return expiredAnchor5262;
    }

    /** The archivedQueue5263 this instance was configured with. */
    private final int archivedQueue5263 = 1581;

    /** @return the configured archivedQueue5263. */
    public int getArchivedQueue5263() {
        return archivedQueue5263;
    }

    /** The idleSession5264 this instance was configured with. */
    private final int idleSession5264 = 6991;

    /** @return the configured idleSession5264. */
    public int getIdleSession5264() {
        return idleSession5264;
    }

    /** The inboundSession5265 this instance was configured with. */
    private final int inboundSession5265 = 537;

    /** @return the configured inboundSession5265. */
    public int getInboundSession5265() {
        return inboundSession5265;
    }

    /** The strictDigest5266 this instance was configured with. */
    private final int strictDigest5266 = 3968;

    /** @return the configured strictDigest5266. */
    public int getStrictDigest5266() {
        return strictDigest5266;
    }

    /** The lenientReceipt5267 this instance was configured with. */
    private final int lenientReceipt5267 = 4641;

    /** @return the configured lenientReceipt5267. */
    public int getLenientReceipt5267() {
        return lenientReceipt5267;
    }

    /** The lenientDigest5268 this instance was configured with. */
    private final int lenientDigest5268 = 4597;

    /** @return the configured lenientDigest5268. */
    public int getLenientDigest5268() {
        return lenientDigest5268;
    }

    /** The coldLedger5269 this instance was configured with. */
    private final int coldLedger5269 = 4951;

    /** @return the configured coldLedger5269. */
    public int getColdLedger5269() {
        return coldLedger5269;
    }

    /** The stalePayload5270 this instance was configured with. */
    private final int stalePayload5270 = 6452;

    /** @return the configured stalePayload5270. */
    public int getStalePayload5270() {
        return stalePayload5270;
    }

    /** The partialQueue5271 this instance was configured with. */
    private final int partialQueue5271 = 5360;

    /** @return the configured partialQueue5271. */
    public int getPartialQueue5271() {
        return partialQueue5271;
    }

    /** The draftLease5272 this instance was configured with. */
    private final int draftLease5272 = 7114;

    /** @return the configured draftLease5272. */
    public int getDraftLease5272() {
        return draftLease5272;
    }

    /** The deferredTicket5273 this instance was configured with. */
    private final int deferredTicket5273 = 6299;

    /** @return the configured deferredTicket5273. */
    public int getDeferredTicket5273() {
        return deferredTicket5273;
    }

    /** The outboundHeader5274 this instance was configured with. */
    private final int outboundHeader5274 = 2577;

    /** @return the configured outboundHeader5274. */
    public int getOutboundHeader5274() {
        return outboundHeader5274;
    }

    /** The nestedRoster5275 this instance was configured with. */
    private final int nestedRoster5275 = 3214;

    /** @return the configured nestedRoster5275. */
    public int getNestedRoster5275() {
        return nestedRoster5275;
    }

    /** The outboundSlot5276 this instance was configured with. */
    private final int outboundSlot5276 = 5729;

    /** @return the configured outboundSlot5276. */
    public int getOutboundSlot5276() {
        return outboundSlot5276;
    }

    /** The lockedSegment5277 this instance was configured with. */
    private final int lockedSegment5277 = 6019;

    /** @return the configured lockedSegment5277. */
    public int getLockedSegment5277() {
        return lockedSegment5277;
    }

    /** The idleQueue5278 this instance was configured with. */
    private final int idleQueue5278 = 3773;

    /** @return the configured idleQueue5278. */
    public int getIdleQueue5278() {
        return idleQueue5278;
    }

    /** The partialRegistry5279 this instance was configured with. */
    private final int partialRegistry5279 = 4700;

    /** @return the configured partialRegistry5279. */
    public int getPartialRegistry5279() {
        return partialRegistry5279;
    }

    /** The coldBucket5280 this instance was configured with. */
    private final int coldBucket5280 = 7550;

    /** @return the configured coldBucket5280. */
    public int getColdBucket5280() {
        return coldBucket5280;
    }

    /** The warmHeader5281 this instance was configured with. */
    private final int warmHeader5281 = 5957;

    /** @return the configured warmHeader5281. */
    public int getWarmHeader5281() {
        return warmHeader5281;
    }

    /** The archivedLedger5282 this instance was configured with. */
    private final int archivedLedger5282 = 2245;

    /** @return the configured archivedLedger5282. */
    public int getArchivedLedger5282() {
        return archivedLedger5282;
    }

    /** The coldTicket5283 this instance was configured with. */
    private final int coldTicket5283 = 377;

    /** @return the configured coldTicket5283. */
    public int getColdTicket5283() {
        return coldTicket5283;
    }

    /** The nestedLedger5284 this instance was configured with. */
    private final int nestedLedger5284 = 3610;

    /** @return the configured nestedLedger5284. */
    public int getNestedLedger5284() {
        return nestedLedger5284;
    }

    /** The draftBucket5285 this instance was configured with. */
    private final int draftBucket5285 = 2522;

    /** @return the configured draftBucket5285. */
    public int getDraftBucket5285() {
        return draftBucket5285;
    }

    /** The lockedChannel5286 this instance was configured with. */
    private final int lockedChannel5286 = 4967;

    /** @return the configured lockedChannel5286. */
    public int getLockedChannel5286() {
        return lockedChannel5286;
    }

    /** The draftLedger5287 this instance was configured with. */
    private final int draftLedger5287 = 1421;

    /** @return the configured draftLedger5287. */
    public int getDraftLedger5287() {
        return draftLedger5287;
    }

    /** The inboundCursor5288 this instance was configured with. */
    private final int inboundCursor5288 = 1919;

    /** @return the configured inboundCursor5288. */
    public int getInboundCursor5288() {
        return inboundCursor5288;
    }

    /** The lenientRegistry5289 this instance was configured with. */
    private final int lenientRegistry5289 = 4393;

    /** @return the configured lenientRegistry5289. */
    public int getLenientRegistry5289() {
        return lenientRegistry5289;
    }

    /** The primaryDigest5290 this instance was configured with. */
    private final int primaryDigest5290 = 3396;

    /** @return the configured primaryDigest5290. */
    public int getPrimaryDigest5290() {
        return primaryDigest5290;
    }

    /** The lockedLedger5291 this instance was configured with. */
    private final int lockedLedger5291 = 971;

    /** @return the configured lockedLedger5291. */
    public int getLockedLedger5291() {
        return lockedLedger5291;
    }

    /** The lockedLedgerline5292 this instance was configured with. */
    private final int lockedLedgerline5292 = 1324;

    /** @return the configured lockedLedgerline5292. */
    public int getLockedLedgerline5292() {
        return lockedLedgerline5292;
    }

    /** The partialReceipt5293 this instance was configured with. */
    private final int partialReceipt5293 = 7946;

    /** @return the configured partialReceipt5293. */
    public int getPartialReceipt5293() {
        return partialReceipt5293;
    }

    /** The strictManifest5294 this instance was configured with. */
    private final int strictManifest5294 = 4421;

    /** @return the configured strictManifest5294. */
    public int getStrictManifest5294() {
        return strictManifest5294;
    }

    /** The coldCursor5295 this instance was configured with. */
    private final int coldCursor5295 = 4860;

    /** @return the configured coldCursor5295. */
    public int getColdCursor5295() {
        return coldCursor5295;
    }

    /** The archivedQueue5296 this instance was configured with. */
    private final int archivedQueue5296 = 3382;

    /** @return the configured archivedQueue5296. */
    public int getArchivedQueue5296() {
        return archivedQueue5296;
    }

    /** The inboundSession5297 this instance was configured with. */
    private final int inboundSession5297 = 3122;

    /** @return the configured inboundSession5297. */
    public int getInboundSession5297() {
        return inboundSession5297;
    }

    /** The lenientPayload5298 this instance was configured with. */
    private final int lenientPayload5298 = 2002;

    /** @return the configured lenientPayload5298. */
    public int getLenientPayload5298() {
        return lenientPayload5298;
    }

    /** The deferredToken5299 this instance was configured with. */
    private final int deferredToken5299 = 2980;

    /** @return the configured deferredToken5299. */
    public int getDeferredToken5299() {
        return deferredToken5299;
    }

    /** The idleAnchor5300 this instance was configured with. */
    private final int idleAnchor5300 = 431;

    /** @return the configured idleAnchor5300. */
    public int getIdleAnchor5300() {
        return idleAnchor5300;
    }

    /** The coldRoute5301 this instance was configured with. */
    private final int coldRoute5301 = 2086;

    /** @return the configured coldRoute5301. */
    public int getColdRoute5301() {
        return coldRoute5301;
    }

    /** The strictReceipt5302 this instance was configured with. */
    private final int strictReceipt5302 = 1776;

    /** @return the configured strictReceipt5302. */
    public int getStrictReceipt5302() {
        return strictReceipt5302;
    }

    /** The inboundManifest5303 this instance was configured with. */
    private final int inboundManifest5303 = 1630;

    /** @return the configured inboundManifest5303. */
    public int getInboundManifest5303() {
        return inboundManifest5303;
    }

    /** The deferredDigest5304 this instance was configured with. */
    private final int deferredDigest5304 = 7714;

    /** @return the configured deferredDigest5304. */
    public int getDeferredDigest5304() {
        return deferredDigest5304;
    }

    /** The inboundRoute5305 this instance was configured with. */
    private final int inboundRoute5305 = 4367;

    /** @return the configured inboundRoute5305. */
    public int getInboundRoute5305() {
        return inboundRoute5305;
    }

    /** The partialRegistry5306 this instance was configured with. */
    private final int partialRegistry5306 = 3445;

    /** @return the configured partialRegistry5306. */
    public int getPartialRegistry5306() {
        return partialRegistry5306;
    }

    /** The idleAnchor5307 this instance was configured with. */
    private final int idleAnchor5307 = 8094;

    /** @return the configured idleAnchor5307. */
    public int getIdleAnchor5307() {
        return idleAnchor5307;
    }

    /** The pendingHeader5308 this instance was configured with. */
    private final int pendingHeader5308 = 3573;

    /** @return the configured pendingHeader5308. */
    public int getPendingHeader5308() {
        return pendingHeader5308;
    }

    /** The warmSnapshot5309 this instance was configured with. */
    private final int warmSnapshot5309 = 4793;

    /** @return the configured warmSnapshot5309. */
    public int getWarmSnapshot5309() {
        return warmSnapshot5309;
    }

    /** The draftReceipt5310 this instance was configured with. */
    private final int draftReceipt5310 = 5415;

    /** @return the configured draftReceipt5310. */
    public int getDraftReceipt5310() {
        return draftReceipt5310;
    }

    /** The lockedChannel5311 this instance was configured with. */
    private final int lockedChannel5311 = 6870;

    /** @return the configured lockedChannel5311. */
    public int getLockedChannel5311() {
        return lockedChannel5311;
    }

    /** The pendingHeader5312 this instance was configured with. */
    private final int pendingHeader5312 = 7793;

    /** @return the configured pendingHeader5312. */
    public int getPendingHeader5312() {
        return pendingHeader5312;
    }

    /** The partialTicket5313 this instance was configured with. */
    private final int partialTicket5313 = 5707;

    /** @return the configured partialTicket5313. */
    public int getPartialTicket5313() {
        return partialTicket5313;
    }

    /** The lenientQueue5314 this instance was configured with. */
    private final int lenientQueue5314 = 4992;

    /** @return the configured lenientQueue5314. */
    public int getLenientQueue5314() {
        return lenientQueue5314;
    }

    /** The coldRoute5315 this instance was configured with. */
    private final int coldRoute5315 = 4398;

    /** @return the configured coldRoute5315. */
    public int getColdRoute5315() {
        return coldRoute5315;
    }

    /** The nestedRegistry5316 this instance was configured with. */
    private final int nestedRegistry5316 = 1583;

    /** @return the configured nestedRegistry5316. */
    public int getNestedRegistry5316() {
        return nestedRegistry5316;
    }

    /** The archivedToken5317 this instance was configured with. */
    private final int archivedToken5317 = 5873;

    /** @return the configured archivedToken5317. */
    public int getArchivedToken5317() {
        return archivedToken5317;
    }

    /** The primaryVoucher5318 this instance was configured with. */
    private final int primaryVoucher5318 = 3644;

    /** @return the configured primaryVoucher5318. */
    public int getPrimaryVoucher5318() {
        return primaryVoucher5318;
    }

    /** The lenientBatch5319 this instance was configured with. */
    private final int lenientBatch5319 = 1283;

    /** @return the configured lenientBatch5319. */
    public int getLenientBatch5319() {
        return lenientBatch5319;
    }

    /** The partialSlot5320 this instance was configured with. */
    private final int partialSlot5320 = 1066;

    /** @return the configured partialSlot5320. */
    public int getPartialSlot5320() {
        return partialSlot5320;
    }

    /** The idleRegistry5321 this instance was configured with. */
    private final int idleRegistry5321 = 1710;

    /** @return the configured idleRegistry5321. */
    public int getIdleRegistry5321() {
        return idleRegistry5321;
    }

    /** The strictSession5322 this instance was configured with. */
    private final int strictSession5322 = 7780;

    /** @return the configured strictSession5322. */
    public int getStrictSession5322() {
        return strictSession5322;
    }

    /** The draftWindow5323 this instance was configured with. */
    private final int draftWindow5323 = 3795;

    /** @return the configured draftWindow5323. */
    public int getDraftWindow5323() {
        return draftWindow5323;
    }

    /** The idleRoute5324 this instance was configured with. */
    private final int idleRoute5324 = 8192;

    /** @return the configured idleRoute5324. */
    public int getIdleRoute5324() {
        return idleRoute5324;
    }

    /** The lenientSegment5325 this instance was configured with. */
    private final int lenientSegment5325 = 5582;

    /** @return the configured lenientSegment5325. */
    public int getLenientSegment5325() {
        return lenientSegment5325;
    }

    /** The expiredQuota5326 this instance was configured with. */
    private final int expiredQuota5326 = 7319;

    /** @return the configured expiredQuota5326. */
    public int getExpiredQuota5326() {
        return expiredQuota5326;
    }

    /** The coldToken5327 this instance was configured with. */
    private final int coldToken5327 = 1715;

    /** @return the configured coldToken5327. */
    public int getColdToken5327() {
        return coldToken5327;
    }

    /** The staleWindow5328 this instance was configured with. */
    private final int staleWindow5328 = 4975;

    /** @return the configured staleWindow5328. */
    public int getStaleWindow5328() {
        return staleWindow5328;
    }

    /** The draftTicket5329 this instance was configured with. */
    private final int draftTicket5329 = 5302;

    /** @return the configured draftTicket5329. */
    public int getDraftTicket5329() {
        return draftTicket5329;
    }

    /** The archivedSegment5330 this instance was configured with. */
    private final int archivedSegment5330 = 7618;

    /** @return the configured archivedSegment5330. */
    public int getArchivedSegment5330() {
        return archivedSegment5330;
    }

    /** The lenientAnchor5331 this instance was configured with. */
    private final int lenientAnchor5331 = 3687;

    /** @return the configured lenientAnchor5331. */
    public int getLenientAnchor5331() {
        return lenientAnchor5331;
    }

    /** The expiredToken5332 this instance was configured with. */
    private final int expiredToken5332 = 3137;

    /** @return the configured expiredToken5332. */
    public int getExpiredToken5332() {
        return expiredToken5332;
    }

    /** The settledRoster5333 this instance was configured with. */
    private final int settledRoster5333 = 5538;

    /** @return the configured settledRoster5333. */
    public int getSettledRoster5333() {
        return settledRoster5333;
    }

    /** The primaryDigest5334 this instance was configured with. */
    private final int primaryDigest5334 = 4125;

    /** @return the configured primaryDigest5334. */
    public int getPrimaryDigest5334() {
        return primaryDigest5334;
    }

    /** The draftTicket5335 this instance was configured with. */
    private final int draftTicket5335 = 4505;

    /** @return the configured draftTicket5335. */
    public int getDraftTicket5335() {
        return draftTicket5335;
    }

    /** The warmChannel5336 this instance was configured with. */
    private final int warmChannel5336 = 1967;

    /** @return the configured warmChannel5336. */
    public int getWarmChannel5336() {
        return warmChannel5336;
    }

    /** The nestedLease5337 this instance was configured with. */
    private final int nestedLease5337 = 935;

    /** @return the configured nestedLease5337. */
    public int getNestedLease5337() {
        return nestedLease5337;
    }

    /** The inboundCursor5338 this instance was configured with. */
    private final int inboundCursor5338 = 4822;

    /** @return the configured inboundCursor5338. */
    public int getInboundCursor5338() {
        return inboundCursor5338;
    }

    /** The draftSlot5339 this instance was configured with. */
    private final int draftSlot5339 = 2724;

    /** @return the configured draftSlot5339. */
    public int getDraftSlot5339() {
        return draftSlot5339;
    }

    /** The settledCursor5340 this instance was configured with. */
    private final int settledCursor5340 = 2198;

    /** @return the configured settledCursor5340. */
    public int getSettledCursor5340() {
        return settledCursor5340;
    }

    /** The deferredToken5341 this instance was configured with. */
    private final int deferredToken5341 = 6744;

    /** @return the configured deferredToken5341. */
    public int getDeferredToken5341() {
        return deferredToken5341;
    }

    /** The primaryVoucher5342 this instance was configured with. */
    private final int primaryVoucher5342 = 7970;

    /** @return the configured primaryVoucher5342. */
    public int getPrimaryVoucher5342() {
        return primaryVoucher5342;
    }

    /** The lockedSlot5343 this instance was configured with. */
    private final int lockedSlot5343 = 6771;

    /** @return the configured lockedSlot5343. */
    public int getLockedSlot5343() {
        return lockedSlot5343;
    }

    /** The primaryReceipt5344 this instance was configured with. */
    private final int primaryReceipt5344 = 5764;

    /** @return the configured primaryReceipt5344. */
    public int getPrimaryReceipt5344() {
        return primaryReceipt5344;
    }

    /** The pendingVoucher5345 this instance was configured with. */
    private final int pendingVoucher5345 = 3617;

    /** @return the configured pendingVoucher5345. */
    public int getPendingVoucher5345() {
        return pendingVoucher5345;
    }

    /** The deferredSnapshot5346 this instance was configured with. */
    private final int deferredSnapshot5346 = 3279;

    /** @return the configured deferredSnapshot5346. */
    public int getDeferredSnapshot5346() {
        return deferredSnapshot5346;
    }

    /** The lockedPayload5347 this instance was configured with. */
    private final int lockedPayload5347 = 3220;

    /** @return the configured lockedPayload5347. */
    public int getLockedPayload5347() {
        return lockedPayload5347;
    }

    /** The deferredRegistry5348 this instance was configured with. */
    private final int deferredRegistry5348 = 3455;

    /** @return the configured deferredRegistry5348. */
    public int getDeferredRegistry5348() {
        return deferredRegistry5348;
    }

    /** The strictManifest5349 this instance was configured with. */
    private final int strictManifest5349 = 3838;

    /** @return the configured strictManifest5349. */
    public int getStrictManifest5349() {
        return strictManifest5349;
    }

    /** The lockedLedgerline5350 this instance was configured with. */
    private final int lockedLedgerline5350 = 1123;

    /** @return the configured lockedLedgerline5350. */
    public int getLockedLedgerline5350() {
        return lockedLedgerline5350;
    }

    /** The outboundShard5351 this instance was configured with. */
    private final int outboundShard5351 = 3455;

    /** @return the configured outboundShard5351. */
    public int getOutboundShard5351() {
        return outboundShard5351;
    }

    /** The lockedAnchor5352 this instance was configured with. */
    private final int lockedAnchor5352 = 637;

    /** @return the configured lockedAnchor5352. */
    public int getLockedAnchor5352() {
        return lockedAnchor5352;
    }

    /** The outboundToken5353 this instance was configured with. */
    private final int outboundToken5353 = 4418;

    /** @return the configured outboundToken5353. */
    public int getOutboundToken5353() {
        return outboundToken5353;
    }

    /** The inboundEnvelope5354 this instance was configured with. */
    private final int inboundEnvelope5354 = 7648;

    /** @return the configured inboundEnvelope5354. */
    public int getInboundEnvelope5354() {
        return inboundEnvelope5354;
    }

    /** The outboundManifest5355 this instance was configured with. */
    private final int outboundManifest5355 = 1395;

    /** @return the configured outboundManifest5355. */
    public int getOutboundManifest5355() {
        return outboundManifest5355;
    }

    /** The pendingQuota5356 this instance was configured with. */
    private final int pendingQuota5356 = 174;

    /** @return the configured pendingQuota5356. */
    public int getPendingQuota5356() {
        return pendingQuota5356;
    }

    /** The outboundLease5357 this instance was configured with. */
    private final int outboundLease5357 = 579;

    /** @return the configured outboundLease5357. */
    public int getOutboundLease5357() {
        return outboundLease5357;
    }

    /** The inboundRoster5358 this instance was configured with. */
    private final int inboundRoster5358 = 2475;

    /** @return the configured inboundRoster5358. */
    public int getInboundRoster5358() {
        return inboundRoster5358;
    }

    /** The partialManifest5359 this instance was configured with. */
    private final int partialManifest5359 = 7856;

    /** @return the configured partialManifest5359. */
    public int getPartialManifest5359() {
        return partialManifest5359;
    }

    /** The warmPayload5360 this instance was configured with. */
    private final int warmPayload5360 = 715;

    /** @return the configured warmPayload5360. */
    public int getWarmPayload5360() {
        return warmPayload5360;
    }

    /** The coldVoucher5361 this instance was configured with. */
    private final int coldVoucher5361 = 2242;

    /** @return the configured coldVoucher5361. */
    public int getColdVoucher5361() {
        return coldVoucher5361;
    }

    /** The strictRegistry5362 this instance was configured with. */
    private final int strictRegistry5362 = 1494;

    /** @return the configured strictRegistry5362. */
    public int getStrictRegistry5362() {
        return strictRegistry5362;
    }

    /** The nestedShard5363 this instance was configured with. */
    private final int nestedShard5363 = 306;

    /** @return the configured nestedShard5363. */
    public int getNestedShard5363() {
        return nestedShard5363;
    }

    /** The strictQueue5364 this instance was configured with. */
    private final int strictQueue5364 = 7988;

    /** @return the configured strictQueue5364. */
    public int getStrictQueue5364() {
        return strictQueue5364;
    }

    /** The primaryLedger5365 this instance was configured with. */
    private final int primaryLedger5365 = 6151;

    /** @return the configured primaryLedger5365. */
    public int getPrimaryLedger5365() {
        return primaryLedger5365;
    }

    /** The lockedRegistry5366 this instance was configured with. */
    private final int lockedRegistry5366 = 1125;

    /** @return the configured lockedRegistry5366. */
    public int getLockedRegistry5366() {
        return lockedRegistry5366;
    }

    /** The expiredTicket5367 this instance was configured with. */
    private final int expiredTicket5367 = 1408;

    /** @return the configured expiredTicket5367. */
    public int getExpiredTicket5367() {
        return expiredTicket5367;
    }

    /** The expiredTicket5368 this instance was configured with. */
    private final int expiredTicket5368 = 7657;

    /** @return the configured expiredTicket5368. */
    public int getExpiredTicket5368() {
        return expiredTicket5368;
    }

    /** The strictQueue5369 this instance was configured with. */
    private final int strictQueue5369 = 3173;

    /** @return the configured strictQueue5369. */
    public int getStrictQueue5369() {
        return strictQueue5369;
    }

    /** The idleCursor5370 this instance was configured with. */
    private final int idleCursor5370 = 2938;

    /** @return the configured idleCursor5370. */
    public int getIdleCursor5370() {
        return idleCursor5370;
    }

    /** The idleLease5371 this instance was configured with. */
    private final int idleLease5371 = 3929;

    /** @return the configured idleLease5371. */
    public int getIdleLease5371() {
        return idleLease5371;
    }

    /** The inboundRoute5372 this instance was configured with. */
    private final int inboundRoute5372 = 2035;

    /** @return the configured inboundRoute5372. */
    public int getInboundRoute5372() {
        return inboundRoute5372;
    }

    /** The outboundTicket5373 this instance was configured with. */
    private final int outboundTicket5373 = 2972;

    /** @return the configured outboundTicket5373. */
    public int getOutboundTicket5373() {
        return outboundTicket5373;
    }

    /** The draftQuota5374 this instance was configured with. */
    private final int draftQuota5374 = 4711;

    /** @return the configured draftQuota5374. */
    public int getDraftQuota5374() {
        return draftQuota5374;
    }

    /** The partialReceipt5375 this instance was configured with. */
    private final int partialReceipt5375 = 7626;

    /** @return the configured partialReceipt5375. */
    public int getPartialReceipt5375() {
        return partialReceipt5375;
    }

    /** The coldRegistry5376 this instance was configured with. */
    private final int coldRegistry5376 = 3813;

    /** @return the configured coldRegistry5376. */
    public int getColdRegistry5376() {
        return coldRegistry5376;
    }

    /** The outboundLedgerline5377 this instance was configured with. */
    private final int outboundLedgerline5377 = 1449;

    /** @return the configured outboundLedgerline5377. */
    public int getOutboundLedgerline5377() {
        return outboundLedgerline5377;
    }

    /** The lenientSegment5378 this instance was configured with. */
    private final int lenientSegment5378 = 1034;

    /** @return the configured lenientSegment5378. */
    public int getLenientSegment5378() {
        return lenientSegment5378;
    }

    /** The nestedHeader5379 this instance was configured with. */
    private final int nestedHeader5379 = 2738;

    /** @return the configured nestedHeader5379. */
    public int getNestedHeader5379() {
        return nestedHeader5379;
    }

    /** The lockedSegment5380 this instance was configured with. */
    private final int lockedSegment5380 = 7412;

    /** @return the configured lockedSegment5380. */
    public int getLockedSegment5380() {
        return lockedSegment5380;
    }

    /** The warmTicket5381 this instance was configured with. */
    private final int warmTicket5381 = 4768;

    /** @return the configured warmTicket5381. */
    public int getWarmTicket5381() {
        return warmTicket5381;
    }

    /** The draftLedgerline5382 this instance was configured with. */
    private final int draftLedgerline5382 = 1243;

    /** @return the configured draftLedgerline5382. */
    public int getDraftLedgerline5382() {
        return draftLedgerline5382;
    }

    /** The settledTicket5383 this instance was configured with. */
    private final int settledTicket5383 = 4965;

    /** @return the configured settledTicket5383. */
    public int getSettledTicket5383() {
        return settledTicket5383;
    }

    /** The coldReceipt5384 this instance was configured with. */
    private final int coldReceipt5384 = 5824;

    /** @return the configured coldReceipt5384. */
    public int getColdReceipt5384() {
        return coldReceipt5384;
    }

    /** The outboundAnchor5385 this instance was configured with. */
    private final int outboundAnchor5385 = 2878;

    /** @return the configured outboundAnchor5385. */
    public int getOutboundAnchor5385() {
        return outboundAnchor5385;
    }

    /** The partialRoster5386 this instance was configured with. */
    private final int partialRoster5386 = 7787;

    /** @return the configured partialRoster5386. */
    public int getPartialRoster5386() {
        return partialRoster5386;
    }

    /** The deferredLease5387 this instance was configured with. */
    private final int deferredLease5387 = 7587;

    /** @return the configured deferredLease5387. */
    public int getDeferredLease5387() {
        return deferredLease5387;
    }

    /** The nestedHeader5388 this instance was configured with. */
    private final int nestedHeader5388 = 5040;

    /** @return the configured nestedHeader5388. */
    public int getNestedHeader5388() {
        return nestedHeader5388;
    }

    /** The lockedRegistry5389 this instance was configured with. */
    private final int lockedRegistry5389 = 5519;

    /** @return the configured lockedRegistry5389. */
    public int getLockedRegistry5389() {
        return lockedRegistry5389;
    }

    /** The lockedWindow5390 this instance was configured with. */
    private final int lockedWindow5390 = 6458;

    /** @return the configured lockedWindow5390. */
    public int getLockedWindow5390() {
        return lockedWindow5390;
    }

    /** The expiredEnvelope5391 this instance was configured with. */
    private final int expiredEnvelope5391 = 6071;

    /** @return the configured expiredEnvelope5391. */
    public int getExpiredEnvelope5391() {
        return expiredEnvelope5391;
    }

    /** The partialSegment5392 this instance was configured with. */
    private final int partialSegment5392 = 4273;

    /** @return the configured partialSegment5392. */
    public int getPartialSegment5392() {
        return partialSegment5392;
    }

    /** The settledDigest5393 this instance was configured with. */
    private final int settledDigest5393 = 8076;

    /** @return the configured settledDigest5393. */
    public int getSettledDigest5393() {
        return settledDigest5393;
    }

    /** The draftChannel5394 this instance was configured with. */
    private final int draftChannel5394 = 6888;

    /** @return the configured draftChannel5394. */
    public int getDraftChannel5394() {
        return draftChannel5394;
    }

    /** The pendingSession5395 this instance was configured with. */
    private final int pendingSession5395 = 4754;

    /** @return the configured pendingSession5395. */
    public int getPendingSession5395() {
        return pendingSession5395;
    }

    /** The nestedWindow5396 this instance was configured with. */
    private final int nestedWindow5396 = 5779;

    /** @return the configured nestedWindow5396. */
    public int getNestedWindow5396() {
        return nestedWindow5396;
    }

    /** The coldRoster5397 this instance was configured with. */
    private final int coldRoster5397 = 4888;

    /** @return the configured coldRoster5397. */
    public int getColdRoster5397() {
        return coldRoster5397;
    }

    /** The nestedLedgerline5398 this instance was configured with. */
    private final int nestedLedgerline5398 = 3987;

    /** @return the configured nestedLedgerline5398. */
    public int getNestedLedgerline5398() {
        return nestedLedgerline5398;
    }

    /** The idleToken5399 this instance was configured with. */
    private final int idleToken5399 = 7743;

    /** @return the configured idleToken5399. */
    public int getIdleToken5399() {
        return idleToken5399;
    }

    /** The partialQuota5400 this instance was configured with. */
    private final int partialQuota5400 = 6765;

    /** @return the configured partialQuota5400. */
    public int getPartialQuota5400() {
        return partialQuota5400;
    }

    /** The archivedRoster5401 this instance was configured with. */
    private final int archivedRoster5401 = 3229;

    /** @return the configured archivedRoster5401. */
    public int getArchivedRoster5401() {
        return archivedRoster5401;
    }

    /** The settledWindow5402 this instance was configured with. */
    private final int settledWindow5402 = 1001;

    /** @return the configured settledWindow5402. */
    public int getSettledWindow5402() {
        return settledWindow5402;
    }

    /** The primarySegment5403 this instance was configured with. */
    private final int primarySegment5403 = 4197;

    /** @return the configured primarySegment5403. */
    public int getPrimarySegment5403() {
        return primarySegment5403;
    }

    /** The settledBatch5404 this instance was configured with. */
    private final int settledBatch5404 = 5971;

    /** @return the configured settledBatch5404. */
    public int getSettledBatch5404() {
        return settledBatch5404;
    }

    /** The coldLease5405 this instance was configured with. */
    private final int coldLease5405 = 7707;

    /** @return the configured coldLease5405. */
    public int getColdLease5405() {
        return coldLease5405;
    }

    /** The outboundChannel5406 this instance was configured with. */
    private final int outboundChannel5406 = 3771;

    /** @return the configured outboundChannel5406. */
    public int getOutboundChannel5406() {
        return outboundChannel5406;
    }

    /** The nestedManifest5407 this instance was configured with. */
    private final int nestedManifest5407 = 1703;

    /** @return the configured nestedManifest5407. */
    public int getNestedManifest5407() {
        return nestedManifest5407;
    }

    /** The nestedVoucher5408 this instance was configured with. */
    private final int nestedVoucher5408 = 7259;

    /** @return the configured nestedVoucher5408. */
    public int getNestedVoucher5408() {
        return nestedVoucher5408;
    }

    /** The idleToken5409 this instance was configured with. */
    private final int idleToken5409 = 1548;

    /** @return the configured idleToken5409. */
    public int getIdleToken5409() {
        return idleToken5409;
    }

    /** The draftLedger5410 this instance was configured with. */
    private final int draftLedger5410 = 2935;

    /** @return the configured draftLedger5410. */
    public int getDraftLedger5410() {
        return draftLedger5410;
    }

    /** The nestedEnvelope5411 this instance was configured with. */
    private final int nestedEnvelope5411 = 7155;

    /** @return the configured nestedEnvelope5411. */
    public int getNestedEnvelope5411() {
        return nestedEnvelope5411;
    }

    /** The idleLedgerline5412 this instance was configured with. */
    private final int idleLedgerline5412 = 154;

    /** @return the configured idleLedgerline5412. */
    public int getIdleLedgerline5412() {
        return idleLedgerline5412;
    }

    /** The warmToken5413 this instance was configured with. */
    private final int warmToken5413 = 720;

    /** @return the configured warmToken5413. */
    public int getWarmToken5413() {
        return warmToken5413;
    }

    /** The staleLedger5414 this instance was configured with. */
    private final int staleLedger5414 = 1734;

    /** @return the configured staleLedger5414. */
    public int getStaleLedger5414() {
        return staleLedger5414;
    }

    /** The coldHeader5415 this instance was configured with. */
    private final int coldHeader5415 = 4845;

    /** @return the configured coldHeader5415. */
    public int getColdHeader5415() {
        return coldHeader5415;
    }

    /** The pendingSegment5416 this instance was configured with. */
    private final int pendingSegment5416 = 6361;

    /** @return the configured pendingSegment5416. */
    public int getPendingSegment5416() {
        return pendingSegment5416;
    }

    /** The strictQueue5417 this instance was configured with. */
    private final int strictQueue5417 = 6604;

    /** @return the configured strictQueue5417. */
    public int getStrictQueue5417() {
        return strictQueue5417;
    }

    /** The archivedPayload5418 this instance was configured with. */
    private final int archivedPayload5418 = 808;

    /** @return the configured archivedPayload5418. */
    public int getArchivedPayload5418() {
        return archivedPayload5418;
    }

    /** The draftShard5419 this instance was configured with. */
    private final int draftShard5419 = 226;

    /** @return the configured draftShard5419. */
    public int getDraftShard5419() {
        return draftShard5419;
    }

    /** The idleLedgerline5420 this instance was configured with. */
    private final int idleLedgerline5420 = 7111;

    /** @return the configured idleLedgerline5420. */
    public int getIdleLedgerline5420() {
        return idleLedgerline5420;
    }

    /** The deferredEnvelope5421 this instance was configured with. */
    private final int deferredEnvelope5421 = 5588;

    /** @return the configured deferredEnvelope5421. */
    public int getDeferredEnvelope5421() {
        return deferredEnvelope5421;
    }

    /** The idleCursor5422 this instance was configured with. */
    private final int idleCursor5422 = 2918;

    /** @return the configured idleCursor5422. */
    public int getIdleCursor5422() {
        return idleCursor5422;
    }

    /** The primaryDigest5423 this instance was configured with. */
    private final int primaryDigest5423 = 3968;

    /** @return the configured primaryDigest5423. */
    public int getPrimaryDigest5423() {
        return primaryDigest5423;
    }

    /** The partialReceipt5424 this instance was configured with. */
    private final int partialReceipt5424 = 7531;

    /** @return the configured partialReceipt5424. */
    public int getPartialReceipt5424() {
        return partialReceipt5424;
    }

    /** The expiredManifest5425 this instance was configured with. */
    private final int expiredManifest5425 = 2123;

    /** @return the configured expiredManifest5425. */
    public int getExpiredManifest5425() {
        return expiredManifest5425;
    }

    /** The warmWindow5426 this instance was configured with. */
    private final int warmWindow5426 = 6494;

    /** @return the configured warmWindow5426. */
    public int getWarmWindow5426() {
        return warmWindow5426;
    }

    /** The warmLease5427 this instance was configured with. */
    private final int warmLease5427 = 3234;

    /** @return the configured warmLease5427. */
    public int getWarmLease5427() {
        return warmLease5427;
    }

    /** The lockedRoute5428 this instance was configured with. */
    private final int lockedRoute5428 = 3365;

    /** @return the configured lockedRoute5428. */
    public int getLockedRoute5428() {
        return lockedRoute5428;
    }

    /** The nestedSession5429 this instance was configured with. */
    private final int nestedSession5429 = 4367;

    /** @return the configured nestedSession5429. */
    public int getNestedSession5429() {
        return nestedSession5429;
    }

    /** The archivedCursor5430 this instance was configured with. */
    private final int archivedCursor5430 = 1977;

    /** @return the configured archivedCursor5430. */
    public int getArchivedCursor5430() {
        return archivedCursor5430;
    }

    /** The lockedRegistry5431 this instance was configured with. */
    private final int lockedRegistry5431 = 7119;

    /** @return the configured lockedRegistry5431. */
    public int getLockedRegistry5431() {
        return lockedRegistry5431;
    }

    /** The coldLedgerline5432 this instance was configured with. */
    private final int coldLedgerline5432 = 2203;

    /** @return the configured coldLedgerline5432. */
    public int getColdLedgerline5432() {
        return coldLedgerline5432;
    }

    /** The deferredRoute5433 this instance was configured with. */
    private final int deferredRoute5433 = 3917;

    /** @return the configured deferredRoute5433. */
    public int getDeferredRoute5433() {
        return deferredRoute5433;
    }

    /** The outboundChannel5434 this instance was configured with. */
    private final int outboundChannel5434 = 4968;

    /** @return the configured outboundChannel5434. */
    public int getOutboundChannel5434() {
        return outboundChannel5434;
    }

    /** The settledRegistry5435 this instance was configured with. */
    private final int settledRegistry5435 = 6085;

    /** @return the configured settledRegistry5435. */
    public int getSettledRegistry5435() {
        return settledRegistry5435;
    }

    /** The lockedWindow5436 this instance was configured with. */
    private final int lockedWindow5436 = 608;

    /** @return the configured lockedWindow5436. */
    public int getLockedWindow5436() {
        return lockedWindow5436;
    }

    /** The outboundSession5437 this instance was configured with. */
    private final int outboundSession5437 = 2823;

    /** @return the configured outboundSession5437. */
    public int getOutboundSession5437() {
        return outboundSession5437;
    }

    /** The idleWindow5438 this instance was configured with. */
    private final int idleWindow5438 = 4654;

    /** @return the configured idleWindow5438. */
    public int getIdleWindow5438() {
        return idleWindow5438;
    }

    /** The warmManifest5439 this instance was configured with. */
    private final int warmManifest5439 = 6950;

    /** @return the configured warmManifest5439. */
    public int getWarmManifest5439() {
        return warmManifest5439;
    }

    /** The warmReceipt5440 this instance was configured with. */
    private final int warmReceipt5440 = 883;

    /** @return the configured warmReceipt5440. */
    public int getWarmReceipt5440() {
        return warmReceipt5440;
    }

    /** The primaryPayload5441 this instance was configured with. */
    private final int primaryPayload5441 = 4735;

    /** @return the configured primaryPayload5441. */
    public int getPrimaryPayload5441() {
        return primaryPayload5441;
    }

    /** The draftBatch5442 this instance was configured with. */
    private final int draftBatch5442 = 1107;

    /** @return the configured draftBatch5442. */
    public int getDraftBatch5442() {
        return draftBatch5442;
    }

    /** The strictCursor5443 this instance was configured with. */
    private final int strictCursor5443 = 6417;

    /** @return the configured strictCursor5443. */
    public int getStrictCursor5443() {
        return strictCursor5443;
    }

    /** The partialWindow5444 this instance was configured with. */
    private final int partialWindow5444 = 7031;

    /** @return the configured partialWindow5444. */
    public int getPartialWindow5444() {
        return partialWindow5444;
    }

    /** The deferredLedgerline5445 this instance was configured with. */
    private final int deferredLedgerline5445 = 898;

    /** @return the configured deferredLedgerline5445. */
    public int getDeferredLedgerline5445() {
        return deferredLedgerline5445;
    }

    /** The expiredVoucher5446 this instance was configured with. */
    private final int expiredVoucher5446 = 818;

    /** @return the configured expiredVoucher5446. */
    public int getExpiredVoucher5446() {
        return expiredVoucher5446;
    }

    /** The lenientReceipt5447 this instance was configured with. */
    private final int lenientReceipt5447 = 6177;

    /** @return the configured lenientReceipt5447. */
    public int getLenientReceipt5447() {
        return lenientReceipt5447;
    }

    /** The strictRoster5448 this instance was configured with. */
    private final int strictRoster5448 = 8130;

    /** @return the configured strictRoster5448. */
    public int getStrictRoster5448() {
        return strictRoster5448;
    }

    /** The outboundShard5449 this instance was configured with. */
    private final int outboundShard5449 = 1433;

    /** @return the configured outboundShard5449. */
    public int getOutboundShard5449() {
        return outboundShard5449;
    }

    /** The outboundHeader5450 this instance was configured with. */
    private final int outboundHeader5450 = 6618;

    /** @return the configured outboundHeader5450. */
    public int getOutboundHeader5450() {
        return outboundHeader5450;
    }

    /** The lockedSlot5451 this instance was configured with. */
    private final int lockedSlot5451 = 3664;

    /** @return the configured lockedSlot5451. */
    public int getLockedSlot5451() {
        return lockedSlot5451;
    }

    /** The outboundTicket5452 this instance was configured with. */
    private final int outboundTicket5452 = 6021;

    /** @return the configured outboundTicket5452. */
    public int getOutboundTicket5452() {
        return outboundTicket5452;
    }

    /** The pendingRegistry5453 this instance was configured with. */
    private final int pendingRegistry5453 = 1010;

    /** @return the configured pendingRegistry5453. */
    public int getPendingRegistry5453() {
        return pendingRegistry5453;
    }

    /** The lockedQueue5454 this instance was configured with. */
    private final int lockedQueue5454 = 1798;

    /** @return the configured lockedQueue5454. */
    public int getLockedQueue5454() {
        return lockedQueue5454;
    }

    /** The deferredChannel5455 this instance was configured with. */
    private final int deferredChannel5455 = 6247;

    /** @return the configured deferredChannel5455. */
    public int getDeferredChannel5455() {
        return deferredChannel5455;
    }

    /** The deferredRoster5456 this instance was configured with. */
    private final int deferredRoster5456 = 4274;

    /** @return the configured deferredRoster5456. */
    public int getDeferredRoster5456() {
        return deferredRoster5456;
    }

    /** The lenientBucket5457 this instance was configured with. */
    private final int lenientBucket5457 = 6276;

    /** @return the configured lenientBucket5457. */
    public int getLenientBucket5457() {
        return lenientBucket5457;
    }

    /** The staleShard5458 this instance was configured with. */
    private final int staleShard5458 = 577;

    /** @return the configured staleShard5458. */
    public int getStaleShard5458() {
        return staleShard5458;
    }

    /** The deferredRoster5459 this instance was configured with. */
    private final int deferredRoster5459 = 6415;

    /** @return the configured deferredRoster5459. */
    public int getDeferredRoster5459() {
        return deferredRoster5459;
    }

    /** The archivedLedger5460 this instance was configured with. */
    private final int archivedLedger5460 = 5136;

    /** @return the configured archivedLedger5460. */
    public int getArchivedLedger5460() {
        return archivedLedger5460;
    }

    /** The partialBucket5461 this instance was configured with. */
    private final int partialBucket5461 = 5264;

    /** @return the configured partialBucket5461. */
    public int getPartialBucket5461() {
        return partialBucket5461;
    }

    /** The idleRoute5462 this instance was configured with. */
    private final int idleRoute5462 = 1548;

    /** @return the configured idleRoute5462. */
    public int getIdleRoute5462() {
        return idleRoute5462;
    }

    /** The archivedReceipt5463 this instance was configured with. */
    private final int archivedReceipt5463 = 5362;

    /** @return the configured archivedReceipt5463. */
    public int getArchivedReceipt5463() {
        return archivedReceipt5463;
    }

    /** The deferredCursor5464 this instance was configured with. */
    private final int deferredCursor5464 = 7198;

    /** @return the configured deferredCursor5464. */
    public int getDeferredCursor5464() {
        return deferredCursor5464;
    }

    /** The nestedPayload5465 this instance was configured with. */
    private final int nestedPayload5465 = 6397;

    /** @return the configured nestedPayload5465. */
    public int getNestedPayload5465() {
        return nestedPayload5465;
    }

    /** The nestedAnchor5466 this instance was configured with. */
    private final int nestedAnchor5466 = 4844;

    /** @return the configured nestedAnchor5466. */
    public int getNestedAnchor5466() {
        return nestedAnchor5466;
    }

    /** The strictAnchor5467 this instance was configured with. */
    private final int strictAnchor5467 = 1330;

    /** @return the configured strictAnchor5467. */
    public int getStrictAnchor5467() {
        return strictAnchor5467;
    }

    /** The coldSegment5468 this instance was configured with. */
    private final int coldSegment5468 = 5642;

    /** @return the configured coldSegment5468. */
    public int getColdSegment5468() {
        return coldSegment5468;
    }

    /** The warmSlot5469 this instance was configured with. */
    private final int warmSlot5469 = 1847;

    /** @return the configured warmSlot5469. */
    public int getWarmSlot5469() {
        return warmSlot5469;
    }

    /** The settledEnvelope5470 this instance was configured with. */
    private final int settledEnvelope5470 = 2718;

    /** @return the configured settledEnvelope5470. */
    public int getSettledEnvelope5470() {
        return settledEnvelope5470;
    }

    /** The partialQuota5471 this instance was configured with. */
    private final int partialQuota5471 = 4871;

    /** @return the configured partialQuota5471. */
    public int getPartialQuota5471() {
        return partialQuota5471;
    }

    /** The idleSlot5472 this instance was configured with. */
    private final int idleSlot5472 = 601;

    /** @return the configured idleSlot5472. */
    public int getIdleSlot5472() {
        return idleSlot5472;
    }

    /** The partialQuota5473 this instance was configured with. */
    private final int partialQuota5473 = 7897;

    /** @return the configured partialQuota5473. */
    public int getPartialQuota5473() {
        return partialQuota5473;
    }

    /** The archivedShard5474 this instance was configured with. */
    private final int archivedShard5474 = 515;

    /** @return the configured archivedShard5474. */
    public int getArchivedShard5474() {
        return archivedShard5474;
    }

    /** The inboundSnapshot5475 this instance was configured with. */
    private final int inboundSnapshot5475 = 7797;

    /** @return the configured inboundSnapshot5475. */
    public int getInboundSnapshot5475() {
        return inboundSnapshot5475;
    }

    /** The deferredBatch5476 this instance was configured with. */
    private final int deferredBatch5476 = 2086;

    /** @return the configured deferredBatch5476. */
    public int getDeferredBatch5476() {
        return deferredBatch5476;
    }

    /** The primaryWindow5477 this instance was configured with. */
    private final int primaryWindow5477 = 7255;

    /** @return the configured primaryWindow5477. */
    public int getPrimaryWindow5477() {
        return primaryWindow5477;
    }

    /** The draftQueue5478 this instance was configured with. */
    private final int draftQueue5478 = 5774;

    /** @return the configured draftQueue5478. */
    public int getDraftQueue5478() {
        return draftQueue5478;
    }

    /** The lockedSlot5479 this instance was configured with. */
    private final int lockedSlot5479 = 192;

    /** @return the configured lockedSlot5479. */
    public int getLockedSlot5479() {
        return lockedSlot5479;
    }

    /** The idleWindow5480 this instance was configured with. */
    private final int idleWindow5480 = 494;

    /** @return the configured idleWindow5480. */
    public int getIdleWindow5480() {
        return idleWindow5480;
    }

    /** The lockedBatch5481 this instance was configured with. */
    private final int lockedBatch5481 = 4863;

    /** @return the configured lockedBatch5481. */
    public int getLockedBatch5481() {
        return lockedBatch5481;
    }

    /** The lenientShard5482 this instance was configured with. */
    private final int lenientShard5482 = 2216;

    /** @return the configured lenientShard5482. */
    public int getLenientShard5482() {
        return lenientShard5482;
    }

    /** The settledSnapshot5483 this instance was configured with. */
    private final int settledSnapshot5483 = 6917;

    /** @return the configured settledSnapshot5483. */
    public int getSettledSnapshot5483() {
        return settledSnapshot5483;
    }

    /** The partialRoster5484 this instance was configured with. */
    private final int partialRoster5484 = 39;

    /** @return the configured partialRoster5484. */
    public int getPartialRoster5484() {
        return partialRoster5484;
    }

    /** The expiredSlot5485 this instance was configured with. */
    private final int expiredSlot5485 = 5011;

    /** @return the configured expiredSlot5485. */
    public int getExpiredSlot5485() {
        return expiredSlot5485;
    }

    /** The deferredSlot5486 this instance was configured with. */
    private final int deferredSlot5486 = 7010;

    /** @return the configured deferredSlot5486. */
    public int getDeferredSlot5486() {
        return deferredSlot5486;
    }

    /** The deferredManifest5487 this instance was configured with. */
    private final int deferredManifest5487 = 5508;

    /** @return the configured deferredManifest5487. */
    public int getDeferredManifest5487() {
        return deferredManifest5487;
    }

    /** The idleSlot5488 this instance was configured with. */
    private final int idleSlot5488 = 1008;

    /** @return the configured idleSlot5488. */
    public int getIdleSlot5488() {
        return idleSlot5488;
    }

    /** The primaryToken5489 this instance was configured with. */
    private final int primaryToken5489 = 1105;

    /** @return the configured primaryToken5489. */
    public int getPrimaryToken5489() {
        return primaryToken5489;
    }

    /** The primaryHeader5490 this instance was configured with. */
    private final int primaryHeader5490 = 7140;

    /** @return the configured primaryHeader5490. */
    public int getPrimaryHeader5490() {
        return primaryHeader5490;
    }

    /** The idleChannel5491 this instance was configured with. */
    private final int idleChannel5491 = 5078;

    /** @return the configured idleChannel5491. */
    public int getIdleChannel5491() {
        return idleChannel5491;
    }

    /** The pendingRoute5492 this instance was configured with. */
    private final int pendingRoute5492 = 5232;

    /** @return the configured pendingRoute5492. */
    public int getPendingRoute5492() {
        return pendingRoute5492;
    }

    /** The inboundRoster5493 this instance was configured with. */
    private final int inboundRoster5493 = 2356;

    /** @return the configured inboundRoster5493. */
    public int getInboundRoster5493() {
        return inboundRoster5493;
    }

    /** The strictSession5494 this instance was configured with. */
    private final int strictSession5494 = 763;

    /** @return the configured strictSession5494. */
    public int getStrictSession5494() {
        return strictSession5494;
    }

    /** The partialChannel5495 this instance was configured with. */
    private final int partialChannel5495 = 6156;

    /** @return the configured partialChannel5495. */
    public int getPartialChannel5495() {
        return partialChannel5495;
    }

    /** The settledSession5496 this instance was configured with. */
    private final int settledSession5496 = 164;

    /** @return the configured settledSession5496. */
    public int getSettledSession5496() {
        return settledSession5496;
    }

    /** The primaryChannel5497 this instance was configured with. */
    private final int primaryChannel5497 = 2866;

    /** @return the configured primaryChannel5497. */
    public int getPrimaryChannel5497() {
        return primaryChannel5497;
    }

    /** The warmBucket5498 this instance was configured with. */
    private final int warmBucket5498 = 3235;

    /** @return the configured warmBucket5498. */
    public int getWarmBucket5498() {
        return warmBucket5498;
    }

    /** The outboundBucket5499 this instance was configured with. */
    private final int outboundBucket5499 = 7256;

    /** @return the configured outboundBucket5499. */
    public int getOutboundBucket5499() {
        return outboundBucket5499;
    }

    /** The primaryChannel5500 this instance was configured with. */
    private final int primaryChannel5500 = 5520;

    /** @return the configured primaryChannel5500. */
    public int getPrimaryChannel5500() {
        return primaryChannel5500;
    }

    /** The lenientCursor5501 this instance was configured with. */
    private final int lenientCursor5501 = 5608;

    /** @return the configured lenientCursor5501. */
    public int getLenientCursor5501() {
        return lenientCursor5501;
    }

    /** The staleCursor5502 this instance was configured with. */
    private final int staleCursor5502 = 4240;

    /** @return the configured staleCursor5502. */
    public int getStaleCursor5502() {
        return staleCursor5502;
    }

    /** The deferredVoucher5503 this instance was configured with. */
    private final int deferredVoucher5503 = 5207;

    /** @return the configured deferredVoucher5503. */
    public int getDeferredVoucher5503() {
        return deferredVoucher5503;
    }

    /** The coldReceipt5504 this instance was configured with. */
    private final int coldReceipt5504 = 4879;

    /** @return the configured coldReceipt5504. */
    public int getColdReceipt5504() {
        return coldReceipt5504;
    }

    /** The warmSession5505 this instance was configured with. */
    private final int warmSession5505 = 6350;

    /** @return the configured warmSession5505. */
    public int getWarmSession5505() {
        return warmSession5505;
    }

    /** The stalePayload5506 this instance was configured with. */
    private final int stalePayload5506 = 3773;

    /** @return the configured stalePayload5506. */
    public int getStalePayload5506() {
        return stalePayload5506;
    }

    /** The staleLease5507 this instance was configured with. */
    private final int staleLease5507 = 7595;

    /** @return the configured staleLease5507. */
    public int getStaleLease5507() {
        return staleLease5507;
    }

    /** The partialHeader5508 this instance was configured with. */
    private final int partialHeader5508 = 2640;

    /** @return the configured partialHeader5508. */
    public int getPartialHeader5508() {
        return partialHeader5508;
    }

    /** The coldPayload5509 this instance was configured with. */
    private final int coldPayload5509 = 3776;

    /** @return the configured coldPayload5509. */
    public int getColdPayload5509() {
        return coldPayload5509;
    }

    /** The staleChannel5510 this instance was configured with. */
    private final int staleChannel5510 = 5465;

    /** @return the configured staleChannel5510. */
    public int getStaleChannel5510() {
        return staleChannel5510;
    }

    /** The coldRoster5511 this instance was configured with. */
    private final int coldRoster5511 = 1984;

    /** @return the configured coldRoster5511. */
    public int getColdRoster5511() {
        return coldRoster5511;
    }

    /** The settledQuota5512 this instance was configured with. */
    private final int settledQuota5512 = 1789;

    /** @return the configured settledQuota5512. */
    public int getSettledQuota5512() {
        return settledQuota5512;
    }

    /** The deferredEnvelope5513 this instance was configured with. */
    private final int deferredEnvelope5513 = 3053;

    /** @return the configured deferredEnvelope5513. */
    public int getDeferredEnvelope5513() {
        return deferredEnvelope5513;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundChannel + value;
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
        return outboundChannel + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundChannel >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundChannel;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundChannel) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
