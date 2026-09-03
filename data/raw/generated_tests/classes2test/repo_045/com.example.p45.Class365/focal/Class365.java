package com.example.p45;

/**
 * partialQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class365 {

    private int warmRoute = 1;

    private final java.util.Map<String, Integer> pendingAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingAnchor0 table. */
    public int lockedSession0(String key) {
        Integer hit = pendingAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long idleLease1 = 0L;

    /** Folds {@code delta} into the running idleLease1. */
    public long inboundRegistry1(long delta) {
        if (delta == 0L) {
            return idleLease1;
        }
        idleLease1 += delta < 0 ? -delta : delta;
        return idleLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleRoster2(int n) {
        switch (n / 4) {
            case 0:
                return "idle";
            case 1:
                return "strict";
            default:
                return n > 211 ? "draft" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the coldManifest stage. */
    public boolean coldAnchor3(String text) {
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

    private final java.util.Map<String, Integer> warmSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot4 table. */
    public int strictBucket4(String key) {
        Integer hit = warmSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long partialQueue5 = 0L;

    /** Folds {@code delta} into the running partialQueue5. */
    public long nestedEnvelope5(long delta) {
        if (delta == 0L) {
            return partialQueue5;
        }
        partialQueue5 += delta < 0 ? -delta : delta;
        return partialQueue5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldWindow6(int n) {
        switch (n / 7) {
            case 0:
                return "settled";
            case 1:
                return "expired";
            default:
                return n > 191 ? "warm" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the expiredSlot stage. */
    public boolean draftToken7(String text) {
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

    private final java.util.Map<String, Integer> idleWindow8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleWindow8 table. */
    public int settledSegment8(String key) {
        Integer hit = idleWindow8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long coldDigest9 = 0L;

    /** Folds {@code delta} into the running coldDigest9. */
    public long coldDigest9(long delta) {
        if (delta == 0L) {
            return coldDigest9;
        }
        coldDigest9 += delta < 0 ? -delta : delta;
        return coldDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleSession10(int n) {
        switch (n / 9) {
            case 0:
                return "primary";
            case 1:
                return "idle";
            default:
                return n > 262 ? "strict" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the pendingManifest stage. */
    public boolean deferredLease11(String text) {
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

    private final java.util.Map<String, Integer> draftSnapshot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSnapshot12 table. */
    public int staleManifest12(String key) {
        Integer hit = draftSnapshot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 89 ? hit : 0;
    }

    private long strictShard13 = 0L;

    /** Folds {@code delta} into the running strictShard13. */
    public long primaryPayload13(long delta) {
        if (delta == 0L) {
            return strictShard13;
        }
        strictShard13 += delta < 0 ? -delta : delta;
        return strictShard13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedShard14(int n) {
        switch (n / 6) {
            case 0:
                return "pending";
            case 1:
                return "stale";
            default:
                return n > 130 ? "expired" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the coldTicket stage. */
    public boolean pendingManifest15(String text) {
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

    private final java.util.Map<String, Integer> archivedRoute16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedRoute16 table. */
    public int inboundBucket16(String key) {
        Integer hit = archivedRoute16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long staleChannel17 = 0L;

    /** Folds {@code delta} into the running staleChannel17. */
    public long warmLedgerline17(long delta) {
        if (delta == 0L) {
            return staleChannel17;
        }
        staleChannel17 += delta < 0 ? -delta : delta;
        return staleChannel17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftCursor18(int n) {
        switch (n / 4) {
            case 0:
                return "locked";
            case 1:
                return "draft";
            default:
                return n > 155 ? "draft" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the strictLedger stage. */
    public boolean primaryRoster19(String text) {
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

    private final java.util.Map<String, Integer> settledSnapshot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSnapshot20 table. */
    public int pendingLedger20(String key) {
        Integer hit = settledSnapshot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long staleBucket21 = 0L;

    /** Folds {@code delta} into the running staleBucket21. */
    public long strictLease21(long delta) {
        if (delta == 0L) {
            return staleBucket21;
        }
        staleBucket21 += delta < 0 ? -delta : delta;
        return staleBucket21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundQueue22(int n) {
        switch (n / 2) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 207 ? "nested" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the pendingToken stage. */
    public boolean deferredSlot23(String text) {
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

    private final java.util.Map<String, Integer> coldShard24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldShard24 table. */
    public int staleSession24(String key) {
        Integer hit = coldShard24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long settledBucket25 = 0L;

    /** Folds {@code delta} into the running settledBucket25. */
    public long warmLease25(long delta) {
        if (delta == 0L) {
            return settledBucket25;
        }
        settledBucket25 += delta < 0 ? -delta : delta;
        return settledBucket25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmChannel26(int n) {
        switch (n / 11) {
            case 0:
                return "stale";
            case 1:
                return "expired";
            default:
                return n > 332 ? "warm" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the lenientRoster stage. */
    public boolean primaryManifest27(String text) {
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

    private final java.util.Map<String, Integer> outboundReceipt28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundReceipt28 table. */
    public int partialQueue28(String key) {
        Integer hit = outboundReceipt28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long expiredChannel29 = 0L;

    /** Folds {@code delta} into the running expiredChannel29. */
    public long pendingLedger29(long delta) {
        if (delta == 0L) {
            return expiredChannel29;
        }
        expiredChannel29 += delta < 0 ? -delta : delta;
        return expiredChannel29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleQuota30(int n) {
        switch (n / 2) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 104 ? "deferred" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the inboundManifest stage. */
    public boolean settledRoute31(String text) {
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

    private final java.util.Map<String, Integer> idleLedgerline32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleLedgerline32 table. */
    public int expiredLease32(String key) {
        Integer hit = idleLedgerline32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long staleWindow33 = 0L;

    /** Folds {@code delta} into the running staleWindow33. */
    public long idleSegment33(long delta) {
        if (delta == 0L) {
            return staleWindow33;
        }
        staleWindow33 += delta < 0 ? -delta : delta;
        return staleWindow33;
    }

    /** The strictToken5000 this instance was configured with. */
    private final int strictToken5000 = 6671;

    /** @return the configured strictToken5000. */
    public int getStrictToken5000() {
        return strictToken5000;
    }

    /** The settledRoute5001 this instance was configured with. */
    private final int settledRoute5001 = 582;

    /** @return the configured settledRoute5001. */
    public int getSettledRoute5001() {
        return settledRoute5001;
    }

    /** The strictReceipt5002 this instance was configured with. */
    private final int strictReceipt5002 = 1735;

    /** @return the configured strictReceipt5002. */
    public int getStrictReceipt5002() {
        return strictReceipt5002;
    }

    /** The lockedTicket5003 this instance was configured with. */
    private final int lockedTicket5003 = 5203;

    /** @return the configured lockedTicket5003. */
    public int getLockedTicket5003() {
        return lockedTicket5003;
    }

    /** The pendingWindow5004 this instance was configured with. */
    private final int pendingWindow5004 = 7324;

    /** @return the configured pendingWindow5004. */
    public int getPendingWindow5004() {
        return pendingWindow5004;
    }

    /** The lockedDigest5005 this instance was configured with. */
    private final int lockedDigest5005 = 8096;

    /** @return the configured lockedDigest5005. */
    public int getLockedDigest5005() {
        return lockedDigest5005;
    }

    /** The primaryRegistry5006 this instance was configured with. */
    private final int primaryRegistry5006 = 162;

    /** @return the configured primaryRegistry5006. */
    public int getPrimaryRegistry5006() {
        return primaryRegistry5006;
    }

    /** The partialSegment5007 this instance was configured with. */
    private final int partialSegment5007 = 6428;

    /** @return the configured partialSegment5007. */
    public int getPartialSegment5007() {
        return partialSegment5007;
    }

    /** The inboundDigest5008 this instance was configured with. */
    private final int inboundDigest5008 = 942;

    /** @return the configured inboundDigest5008. */
    public int getInboundDigest5008() {
        return inboundDigest5008;
    }

    /** The settledBatch5009 this instance was configured with. */
    private final int settledBatch5009 = 3192;

    /** @return the configured settledBatch5009. */
    public int getSettledBatch5009() {
        return settledBatch5009;
    }

    /** The expiredSegment5010 this instance was configured with. */
    private final int expiredSegment5010 = 6291;

    /** @return the configured expiredSegment5010. */
    public int getExpiredSegment5010() {
        return expiredSegment5010;
    }

    /** The lockedWindow5011 this instance was configured with. */
    private final int lockedWindow5011 = 1833;

    /** @return the configured lockedWindow5011. */
    public int getLockedWindow5011() {
        return lockedWindow5011;
    }

    /** The partialChannel5012 this instance was configured with. */
    private final int partialChannel5012 = 7987;

    /** @return the configured partialChannel5012. */
    public int getPartialChannel5012() {
        return partialChannel5012;
    }

    /** The primaryLedger5013 this instance was configured with. */
    private final int primaryLedger5013 = 785;

    /** @return the configured primaryLedger5013. */
    public int getPrimaryLedger5013() {
        return primaryLedger5013;
    }

    /** The staleQueue5014 this instance was configured with. */
    private final int staleQueue5014 = 7429;

    /** @return the configured staleQueue5014. */
    public int getStaleQueue5014() {
        return staleQueue5014;
    }

    /** The primaryShard5015 this instance was configured with. */
    private final int primaryShard5015 = 6494;

    /** @return the configured primaryShard5015. */
    public int getPrimaryShard5015() {
        return primaryShard5015;
    }

    /** The nestedSegment5016 this instance was configured with. */
    private final int nestedSegment5016 = 4751;

    /** @return the configured nestedSegment5016. */
    public int getNestedSegment5016() {
        return nestedSegment5016;
    }

    /** The lenientSlot5017 this instance was configured with. */
    private final int lenientSlot5017 = 267;

    /** @return the configured lenientSlot5017. */
    public int getLenientSlot5017() {
        return lenientSlot5017;
    }

    /** The nestedRegistry5018 this instance was configured with. */
    private final int nestedRegistry5018 = 276;

    /** @return the configured nestedRegistry5018. */
    public int getNestedRegistry5018() {
        return nestedRegistry5018;
    }

    /** The primaryQuota5019 this instance was configured with. */
    private final int primaryQuota5019 = 2712;

    /** @return the configured primaryQuota5019. */
    public int getPrimaryQuota5019() {
        return primaryQuota5019;
    }

    /** The primaryBucket5020 this instance was configured with. */
    private final int primaryBucket5020 = 309;

    /** @return the configured primaryBucket5020. */
    public int getPrimaryBucket5020() {
        return primaryBucket5020;
    }

    /** The deferredLedgerline5021 this instance was configured with. */
    private final int deferredLedgerline5021 = 4321;

    /** @return the configured deferredLedgerline5021. */
    public int getDeferredLedgerline5021() {
        return deferredLedgerline5021;
    }

    /** The primaryRegistry5022 this instance was configured with. */
    private final int primaryRegistry5022 = 7862;

    /** @return the configured primaryRegistry5022. */
    public int getPrimaryRegistry5022() {
        return primaryRegistry5022;
    }

    /** The expiredRoute5023 this instance was configured with. */
    private final int expiredRoute5023 = 3902;

    /** @return the configured expiredRoute5023. */
    public int getExpiredRoute5023() {
        return expiredRoute5023;
    }

    /** The draftChannel5024 this instance was configured with. */
    private final int draftChannel5024 = 1570;

    /** @return the configured draftChannel5024. */
    public int getDraftChannel5024() {
        return draftChannel5024;
    }

    /** The staleQuota5025 this instance was configured with. */
    private final int staleQuota5025 = 7034;

    /** @return the configured staleQuota5025. */
    public int getStaleQuota5025() {
        return staleQuota5025;
    }

    /** The coldVoucher5026 this instance was configured with. */
    private final int coldVoucher5026 = 3409;

    /** @return the configured coldVoucher5026. */
    public int getColdVoucher5026() {
        return coldVoucher5026;
    }

    /** The draftTicket5027 this instance was configured with. */
    private final int draftTicket5027 = 5447;

    /** @return the configured draftTicket5027. */
    public int getDraftTicket5027() {
        return draftTicket5027;
    }

    /** The pendingToken5028 this instance was configured with. */
    private final int pendingToken5028 = 853;

    /** @return the configured pendingToken5028. */
    public int getPendingToken5028() {
        return pendingToken5028;
    }

    /** The settledBatch5029 this instance was configured with. */
    private final int settledBatch5029 = 1282;

    /** @return the configured settledBatch5029. */
    public int getSettledBatch5029() {
        return settledBatch5029;
    }

    /** The inboundBucket5030 this instance was configured with. */
    private final int inboundBucket5030 = 3166;

    /** @return the configured inboundBucket5030. */
    public int getInboundBucket5030() {
        return inboundBucket5030;
    }

    /** The draftSlot5031 this instance was configured with. */
    private final int draftSlot5031 = 3442;

    /** @return the configured draftSlot5031. */
    public int getDraftSlot5031() {
        return draftSlot5031;
    }

    /** The warmSegment5032 this instance was configured with. */
    private final int warmSegment5032 = 4332;

    /** @return the configured warmSegment5032. */
    public int getWarmSegment5032() {
        return warmSegment5032;
    }

    /** The warmHeader5033 this instance was configured with. */
    private final int warmHeader5033 = 2045;

    /** @return the configured warmHeader5033. */
    public int getWarmHeader5033() {
        return warmHeader5033;
    }

    /** The warmRegistry5034 this instance was configured with. */
    private final int warmRegistry5034 = 876;

    /** @return the configured warmRegistry5034. */
    public int getWarmRegistry5034() {
        return warmRegistry5034;
    }

    /** The pendingBucket5035 this instance was configured with. */
    private final int pendingBucket5035 = 7209;

    /** @return the configured pendingBucket5035. */
    public int getPendingBucket5035() {
        return pendingBucket5035;
    }

    /** The settledDigest5036 this instance was configured with. */
    private final int settledDigest5036 = 3525;

    /** @return the configured settledDigest5036. */
    public int getSettledDigest5036() {
        return settledDigest5036;
    }

    /** The warmLedger5037 this instance was configured with. */
    private final int warmLedger5037 = 2374;

    /** @return the configured warmLedger5037. */
    public int getWarmLedger5037() {
        return warmLedger5037;
    }

    /** The partialBucket5038 this instance was configured with. */
    private final int partialBucket5038 = 4186;

    /** @return the configured partialBucket5038. */
    public int getPartialBucket5038() {
        return partialBucket5038;
    }

    /** The lockedChannel5039 this instance was configured with. */
    private final int lockedChannel5039 = 256;

    /** @return the configured lockedChannel5039. */
    public int getLockedChannel5039() {
        return lockedChannel5039;
    }

    /** The staleLedgerline5040 this instance was configured with. */
    private final int staleLedgerline5040 = 5517;

    /** @return the configured staleLedgerline5040. */
    public int getStaleLedgerline5040() {
        return staleLedgerline5040;
    }

    /** The inboundEnvelope5041 this instance was configured with. */
    private final int inboundEnvelope5041 = 1700;

    /** @return the configured inboundEnvelope5041. */
    public int getInboundEnvelope5041() {
        return inboundEnvelope5041;
    }

    /** The inboundWindow5042 this instance was configured with. */
    private final int inboundWindow5042 = 3531;

    /** @return the configured inboundWindow5042. */
    public int getInboundWindow5042() {
        return inboundWindow5042;
    }

    /** The primaryBucket5043 this instance was configured with. */
    private final int primaryBucket5043 = 4954;

    /** @return the configured primaryBucket5043. */
    public int getPrimaryBucket5043() {
        return primaryBucket5043;
    }

    /** The lockedSession5044 this instance was configured with. */
    private final int lockedSession5044 = 4017;

    /** @return the configured lockedSession5044. */
    public int getLockedSession5044() {
        return lockedSession5044;
    }

    /** The primarySlot5045 this instance was configured with. */
    private final int primarySlot5045 = 4776;

    /** @return the configured primarySlot5045. */
    public int getPrimarySlot5045() {
        return primarySlot5045;
    }

    /** The pendingSnapshot5046 this instance was configured with. */
    private final int pendingSnapshot5046 = 5019;

    /** @return the configured pendingSnapshot5046. */
    public int getPendingSnapshot5046() {
        return pendingSnapshot5046;
    }

    /** The inboundRoster5047 this instance was configured with. */
    private final int inboundRoster5047 = 625;

    /** @return the configured inboundRoster5047. */
    public int getInboundRoster5047() {
        return inboundRoster5047;
    }

    /** The primaryPayload5048 this instance was configured with. */
    private final int primaryPayload5048 = 320;

    /** @return the configured primaryPayload5048. */
    public int getPrimaryPayload5048() {
        return primaryPayload5048;
    }

    /** The staleQueue5049 this instance was configured with. */
    private final int staleQueue5049 = 7317;

    /** @return the configured staleQueue5049. */
    public int getStaleQueue5049() {
        return staleQueue5049;
    }

    /** The expiredHeader5050 this instance was configured with. */
    private final int expiredHeader5050 = 3269;

    /** @return the configured expiredHeader5050. */
    public int getExpiredHeader5050() {
        return expiredHeader5050;
    }

    /** The deferredToken5051 this instance was configured with. */
    private final int deferredToken5051 = 5320;

    /** @return the configured deferredToken5051. */
    public int getDeferredToken5051() {
        return deferredToken5051;
    }

    /** The idleSession5052 this instance was configured with. */
    private final int idleSession5052 = 165;

    /** @return the configured idleSession5052. */
    public int getIdleSession5052() {
        return idleSession5052;
    }

    /** The draftBucket5053 this instance was configured with. */
    private final int draftBucket5053 = 1210;

    /** @return the configured draftBucket5053. */
    public int getDraftBucket5053() {
        return draftBucket5053;
    }

    /** The outboundAnchor5054 this instance was configured with. */
    private final int outboundAnchor5054 = 1788;

    /** @return the configured outboundAnchor5054. */
    public int getOutboundAnchor5054() {
        return outboundAnchor5054;
    }

    /** The inboundSlot5055 this instance was configured with. */
    private final int inboundSlot5055 = 410;

    /** @return the configured inboundSlot5055. */
    public int getInboundSlot5055() {
        return inboundSlot5055;
    }

    /** The inboundEnvelope5056 this instance was configured with. */
    private final int inboundEnvelope5056 = 8054;

    /** @return the configured inboundEnvelope5056. */
    public int getInboundEnvelope5056() {
        return inboundEnvelope5056;
    }

    /** The outboundShard5057 this instance was configured with. */
    private final int outboundShard5057 = 782;

    /** @return the configured outboundShard5057. */
    public int getOutboundShard5057() {
        return outboundShard5057;
    }

    /** The inboundLedger5058 this instance was configured with. */
    private final int inboundLedger5058 = 859;

    /** @return the configured inboundLedger5058. */
    public int getInboundLedger5058() {
        return inboundLedger5058;
    }

    /** The lenientSlot5059 this instance was configured with. */
    private final int lenientSlot5059 = 4382;

    /** @return the configured lenientSlot5059. */
    public int getLenientSlot5059() {
        return lenientSlot5059;
    }

    /** The lockedWindow5060 this instance was configured with. */
    private final int lockedWindow5060 = 4103;

    /** @return the configured lockedWindow5060. */
    public int getLockedWindow5060() {
        return lockedWindow5060;
    }

    /** The partialPayload5061 this instance was configured with. */
    private final int partialPayload5061 = 7840;

    /** @return the configured partialPayload5061. */
    public int getPartialPayload5061() {
        return partialPayload5061;
    }

    /** The outboundAnchor5062 this instance was configured with. */
    private final int outboundAnchor5062 = 7123;

    /** @return the configured outboundAnchor5062. */
    public int getOutboundAnchor5062() {
        return outboundAnchor5062;
    }

    /** The partialShard5063 this instance was configured with. */
    private final int partialShard5063 = 1864;

    /** @return the configured partialShard5063. */
    public int getPartialShard5063() {
        return partialShard5063;
    }

    /** The coldSlot5064 this instance was configured with. */
    private final int coldSlot5064 = 4559;

    /** @return the configured coldSlot5064. */
    public int getColdSlot5064() {
        return coldSlot5064;
    }

    /** The partialSession5065 this instance was configured with. */
    private final int partialSession5065 = 5168;

    /** @return the configured partialSession5065. */
    public int getPartialSession5065() {
        return partialSession5065;
    }

    /** The outboundManifest5066 this instance was configured with. */
    private final int outboundManifest5066 = 4304;

    /** @return the configured outboundManifest5066. */
    public int getOutboundManifest5066() {
        return outboundManifest5066;
    }

    /** The lenientShard5067 this instance was configured with. */
    private final int lenientShard5067 = 4560;

    /** @return the configured lenientShard5067. */
    public int getLenientShard5067() {
        return lenientShard5067;
    }

    /** The archivedVoucher5068 this instance was configured with. */
    private final int archivedVoucher5068 = 6259;

    /** @return the configured archivedVoucher5068. */
    public int getArchivedVoucher5068() {
        return archivedVoucher5068;
    }

    /** The lockedBucket5069 this instance was configured with. */
    private final int lockedBucket5069 = 221;

    /** @return the configured lockedBucket5069. */
    public int getLockedBucket5069() {
        return lockedBucket5069;
    }

    /** The pendingLedger5070 this instance was configured with. */
    private final int pendingLedger5070 = 4042;

    /** @return the configured pendingLedger5070. */
    public int getPendingLedger5070() {
        return pendingLedger5070;
    }

    /** The archivedSession5071 this instance was configured with. */
    private final int archivedSession5071 = 5664;

    /** @return the configured archivedSession5071. */
    public int getArchivedSession5071() {
        return archivedSession5071;
    }

    /** The warmSlot5072 this instance was configured with. */
    private final int warmSlot5072 = 2731;

    /** @return the configured warmSlot5072. */
    public int getWarmSlot5072() {
        return warmSlot5072;
    }

    /** The inboundAnchor5073 this instance was configured with. */
    private final int inboundAnchor5073 = 7674;

    /** @return the configured inboundAnchor5073. */
    public int getInboundAnchor5073() {
        return inboundAnchor5073;
    }

    /** The archivedSnapshot5074 this instance was configured with. */
    private final int archivedSnapshot5074 = 3855;

    /** @return the configured archivedSnapshot5074. */
    public int getArchivedSnapshot5074() {
        return archivedSnapshot5074;
    }

    /** The draftLease5075 this instance was configured with. */
    private final int draftLease5075 = 5554;

    /** @return the configured draftLease5075. */
    public int getDraftLease5075() {
        return draftLease5075;
    }

    /** The expiredPayload5076 this instance was configured with. */
    private final int expiredPayload5076 = 4508;

    /** @return the configured expiredPayload5076. */
    public int getExpiredPayload5076() {
        return expiredPayload5076;
    }

    /** The deferredShard5077 this instance was configured with. */
    private final int deferredShard5077 = 4846;

    /** @return the configured deferredShard5077. */
    public int getDeferredShard5077() {
        return deferredShard5077;
    }

    /** The coldShard5078 this instance was configured with. */
    private final int coldShard5078 = 3018;

    /** @return the configured coldShard5078. */
    public int getColdShard5078() {
        return coldShard5078;
    }

    /** The draftSegment5079 this instance was configured with. */
    private final int draftSegment5079 = 870;

    /** @return the configured draftSegment5079. */
    public int getDraftSegment5079() {
        return draftSegment5079;
    }

    /** The lockedChannel5080 this instance was configured with. */
    private final int lockedChannel5080 = 4;

    /** @return the configured lockedChannel5080. */
    public int getLockedChannel5080() {
        return lockedChannel5080;
    }

    /** The primaryTicket5081 this instance was configured with. */
    private final int primaryTicket5081 = 4472;

    /** @return the configured primaryTicket5081. */
    public int getPrimaryTicket5081() {
        return primaryTicket5081;
    }

    /** The partialToken5082 this instance was configured with. */
    private final int partialToken5082 = 5339;

    /** @return the configured partialToken5082. */
    public int getPartialToken5082() {
        return partialToken5082;
    }

    /** The expiredSession5083 this instance was configured with. */
    private final int expiredSession5083 = 6573;

    /** @return the configured expiredSession5083. */
    public int getExpiredSession5083() {
        return expiredSession5083;
    }

    /** The lenientDigest5084 this instance was configured with. */
    private final int lenientDigest5084 = 4857;

    /** @return the configured lenientDigest5084. */
    public int getLenientDigest5084() {
        return lenientDigest5084;
    }

    /** The draftEnvelope5085 this instance was configured with. */
    private final int draftEnvelope5085 = 4222;

    /** @return the configured draftEnvelope5085. */
    public int getDraftEnvelope5085() {
        return draftEnvelope5085;
    }

    /** The staleQueue5086 this instance was configured with. */
    private final int staleQueue5086 = 3569;

    /** @return the configured staleQueue5086. */
    public int getStaleQueue5086() {
        return staleQueue5086;
    }

    /** The expiredCursor5087 this instance was configured with. */
    private final int expiredCursor5087 = 5974;

    /** @return the configured expiredCursor5087. */
    public int getExpiredCursor5087() {
        return expiredCursor5087;
    }

    /** The lenientChannel5088 this instance was configured with. */
    private final int lenientChannel5088 = 4801;

    /** @return the configured lenientChannel5088. */
    public int getLenientChannel5088() {
        return lenientChannel5088;
    }

    /** The coldRegistry5089 this instance was configured with. */
    private final int coldRegistry5089 = 5631;

    /** @return the configured coldRegistry5089. */
    public int getColdRegistry5089() {
        return coldRegistry5089;
    }

    /** The outboundSlot5090 this instance was configured with. */
    private final int outboundSlot5090 = 6243;

    /** @return the configured outboundSlot5090. */
    public int getOutboundSlot5090() {
        return outboundSlot5090;
    }

    /** The archivedLedgerline5091 this instance was configured with. */
    private final int archivedLedgerline5091 = 7973;

    /** @return the configured archivedLedgerline5091. */
    public int getArchivedLedgerline5091() {
        return archivedLedgerline5091;
    }

    /** The deferredBucket5092 this instance was configured with. */
    private final int deferredBucket5092 = 1590;

    /** @return the configured deferredBucket5092. */
    public int getDeferredBucket5092() {
        return deferredBucket5092;
    }

    /** The lenientRoute5093 this instance was configured with. */
    private final int lenientRoute5093 = 8036;

    /** @return the configured lenientRoute5093. */
    public int getLenientRoute5093() {
        return lenientRoute5093;
    }

    /** The inboundLedgerline5094 this instance was configured with. */
    private final int inboundLedgerline5094 = 6569;

    /** @return the configured inboundLedgerline5094. */
    public int getInboundLedgerline5094() {
        return inboundLedgerline5094;
    }

    /** The archivedSegment5095 this instance was configured with. */
    private final int archivedSegment5095 = 5920;

    /** @return the configured archivedSegment5095. */
    public int getArchivedSegment5095() {
        return archivedSegment5095;
    }

    /** The staleEnvelope5096 this instance was configured with. */
    private final int staleEnvelope5096 = 6656;

    /** @return the configured staleEnvelope5096. */
    public int getStaleEnvelope5096() {
        return staleEnvelope5096;
    }

    /** The outboundSession5097 this instance was configured with. */
    private final int outboundSession5097 = 2965;

    /** @return the configured outboundSession5097. */
    public int getOutboundSession5097() {
        return outboundSession5097;
    }

    /** The outboundChannel5098 this instance was configured with. */
    private final int outboundChannel5098 = 7105;

    /** @return the configured outboundChannel5098. */
    public int getOutboundChannel5098() {
        return outboundChannel5098;
    }

    /** The staleRegistry5099 this instance was configured with. */
    private final int staleRegistry5099 = 7056;

    /** @return the configured staleRegistry5099. */
    public int getStaleRegistry5099() {
        return staleRegistry5099;
    }

    /** The warmSnapshot5100 this instance was configured with. */
    private final int warmSnapshot5100 = 7533;

    /** @return the configured warmSnapshot5100. */
    public int getWarmSnapshot5100() {
        return warmSnapshot5100;
    }

    /** The expiredSnapshot5101 this instance was configured with. */
    private final int expiredSnapshot5101 = 5186;

    /** @return the configured expiredSnapshot5101. */
    public int getExpiredSnapshot5101() {
        return expiredSnapshot5101;
    }

    /** The coldCursor5102 this instance was configured with. */
    private final int coldCursor5102 = 3566;

    /** @return the configured coldCursor5102. */
    public int getColdCursor5102() {
        return coldCursor5102;
    }

    /** The nestedSnapshot5103 this instance was configured with. */
    private final int nestedSnapshot5103 = 2211;

    /** @return the configured nestedSnapshot5103. */
    public int getNestedSnapshot5103() {
        return nestedSnapshot5103;
    }

    /** The nestedPayload5104 this instance was configured with. */
    private final int nestedPayload5104 = 2439;

    /** @return the configured nestedPayload5104. */
    public int getNestedPayload5104() {
        return nestedPayload5104;
    }

    /** The settledQuota5105 this instance was configured with. */
    private final int settledQuota5105 = 5557;

    /** @return the configured settledQuota5105. */
    public int getSettledQuota5105() {
        return settledQuota5105;
    }

    /** The lockedVoucher5106 this instance was configured with. */
    private final int lockedVoucher5106 = 2164;

    /** @return the configured lockedVoucher5106. */
    public int getLockedVoucher5106() {
        return lockedVoucher5106;
    }

    /** The lenientManifest5107 this instance was configured with. */
    private final int lenientManifest5107 = 1103;

    /** @return the configured lenientManifest5107. */
    public int getLenientManifest5107() {
        return lenientManifest5107;
    }

    /** The warmPayload5108 this instance was configured with. */
    private final int warmPayload5108 = 5571;

    /** @return the configured warmPayload5108. */
    public int getWarmPayload5108() {
        return warmPayload5108;
    }

    /** The settledSession5109 this instance was configured with. */
    private final int settledSession5109 = 5861;

    /** @return the configured settledSession5109. */
    public int getSettledSession5109() {
        return settledSession5109;
    }

    /** The expiredTicket5110 this instance was configured with. */
    private final int expiredTicket5110 = 3567;

    /** @return the configured expiredTicket5110. */
    public int getExpiredTicket5110() {
        return expiredTicket5110;
    }

    /** The nestedShard5111 this instance was configured with. */
    private final int nestedShard5111 = 199;

    /** @return the configured nestedShard5111. */
    public int getNestedShard5111() {
        return nestedShard5111;
    }

    /** The primaryReceipt5112 this instance was configured with. */
    private final int primaryReceipt5112 = 5426;

    /** @return the configured primaryReceipt5112. */
    public int getPrimaryReceipt5112() {
        return primaryReceipt5112;
    }

    /** The idleRoster5113 this instance was configured with. */
    private final int idleRoster5113 = 6570;

    /** @return the configured idleRoster5113. */
    public int getIdleRoster5113() {
        return idleRoster5113;
    }

    /** The archivedManifest5114 this instance was configured with. */
    private final int archivedManifest5114 = 3600;

    /** @return the configured archivedManifest5114. */
    public int getArchivedManifest5114() {
        return archivedManifest5114;
    }

    /** The draftBatch5115 this instance was configured with. */
    private final int draftBatch5115 = 1648;

    /** @return the configured draftBatch5115. */
    public int getDraftBatch5115() {
        return draftBatch5115;
    }

    /** The settledQuota5116 this instance was configured with. */
    private final int settledQuota5116 = 2934;

    /** @return the configured settledQuota5116. */
    public int getSettledQuota5116() {
        return settledQuota5116;
    }

    /** The outboundSlot5117 this instance was configured with. */
    private final int outboundSlot5117 = 1808;

    /** @return the configured outboundSlot5117. */
    public int getOutboundSlot5117() {
        return outboundSlot5117;
    }

    /** The deferredManifest5118 this instance was configured with. */
    private final int deferredManifest5118 = 1959;

    /** @return the configured deferredManifest5118. */
    public int getDeferredManifest5118() {
        return deferredManifest5118;
    }

    /** The idleRoute5119 this instance was configured with. */
    private final int idleRoute5119 = 4068;

    /** @return the configured idleRoute5119. */
    public int getIdleRoute5119() {
        return idleRoute5119;
    }

    /** The idleTicket5120 this instance was configured with. */
    private final int idleTicket5120 = 2450;

    /** @return the configured idleTicket5120. */
    public int getIdleTicket5120() {
        return idleTicket5120;
    }

    /** The settledLedger5121 this instance was configured with. */
    private final int settledLedger5121 = 7591;

    /** @return the configured settledLedger5121. */
    public int getSettledLedger5121() {
        return settledLedger5121;
    }

    /** The expiredRoster5122 this instance was configured with. */
    private final int expiredRoster5122 = 4682;

    /** @return the configured expiredRoster5122. */
    public int getExpiredRoster5122() {
        return expiredRoster5122;
    }

    /** The idleSlot5123 this instance was configured with. */
    private final int idleSlot5123 = 1537;

    /** @return the configured idleSlot5123. */
    public int getIdleSlot5123() {
        return idleSlot5123;
    }

    /** The strictShard5124 this instance was configured with. */
    private final int strictShard5124 = 3693;

    /** @return the configured strictShard5124. */
    public int getStrictShard5124() {
        return strictShard5124;
    }

    /** The idleLease5125 this instance was configured with. */
    private final int idleLease5125 = 7572;

    /** @return the configured idleLease5125. */
    public int getIdleLease5125() {
        return idleLease5125;
    }

    /** The primaryManifest5126 this instance was configured with. */
    private final int primaryManifest5126 = 4335;

    /** @return the configured primaryManifest5126. */
    public int getPrimaryManifest5126() {
        return primaryManifest5126;
    }

    /** The deferredShard5127 this instance was configured with. */
    private final int deferredShard5127 = 3760;

    /** @return the configured deferredShard5127. */
    public int getDeferredShard5127() {
        return deferredShard5127;
    }

    /** The strictVoucher5128 this instance was configured with. */
    private final int strictVoucher5128 = 4362;

    /** @return the configured strictVoucher5128. */
    public int getStrictVoucher5128() {
        return strictVoucher5128;
    }

    /** The inboundLedgerline5129 this instance was configured with. */
    private final int inboundLedgerline5129 = 7894;

    /** @return the configured inboundLedgerline5129. */
    public int getInboundLedgerline5129() {
        return inboundLedgerline5129;
    }

    /** The settledSegment5130 this instance was configured with. */
    private final int settledSegment5130 = 1102;

    /** @return the configured settledSegment5130. */
    public int getSettledSegment5130() {
        return settledSegment5130;
    }

    /** The archivedReceipt5131 this instance was configured with. */
    private final int archivedReceipt5131 = 1019;

    /** @return the configured archivedReceipt5131. */
    public int getArchivedReceipt5131() {
        return archivedReceipt5131;
    }

    /** The pendingRoute5132 this instance was configured with. */
    private final int pendingRoute5132 = 7049;

    /** @return the configured pendingRoute5132. */
    public int getPendingRoute5132() {
        return pendingRoute5132;
    }

    /** The settledTicket5133 this instance was configured with. */
    private final int settledTicket5133 = 7439;

    /** @return the configured settledTicket5133. */
    public int getSettledTicket5133() {
        return settledTicket5133;
    }

    /** The settledCursor5134 this instance was configured with. */
    private final int settledCursor5134 = 352;

    /** @return the configured settledCursor5134. */
    public int getSettledCursor5134() {
        return settledCursor5134;
    }

    /** The coldHeader5135 this instance was configured with. */
    private final int coldHeader5135 = 5885;

    /** @return the configured coldHeader5135. */
    public int getColdHeader5135() {
        return coldHeader5135;
    }

    /** The archivedRoute5136 this instance was configured with. */
    private final int archivedRoute5136 = 1917;

    /** @return the configured archivedRoute5136. */
    public int getArchivedRoute5136() {
        return archivedRoute5136;
    }

    /** The expiredReceipt5137 this instance was configured with. */
    private final int expiredReceipt5137 = 242;

    /** @return the configured expiredReceipt5137. */
    public int getExpiredReceipt5137() {
        return expiredReceipt5137;
    }

    /** The strictRoster5138 this instance was configured with. */
    private final int strictRoster5138 = 6199;

    /** @return the configured strictRoster5138. */
    public int getStrictRoster5138() {
        return strictRoster5138;
    }

    /** The partialVoucher5139 this instance was configured with. */
    private final int partialVoucher5139 = 7177;

    /** @return the configured partialVoucher5139. */
    public int getPartialVoucher5139() {
        return partialVoucher5139;
    }

    /** The idleReceipt5140 this instance was configured with. */
    private final int idleReceipt5140 = 7435;

    /** @return the configured idleReceipt5140. */
    public int getIdleReceipt5140() {
        return idleReceipt5140;
    }

    /** The draftTicket5141 this instance was configured with. */
    private final int draftTicket5141 = 6789;

    /** @return the configured draftTicket5141. */
    public int getDraftTicket5141() {
        return draftTicket5141;
    }

    /** The coldShard5142 this instance was configured with. */
    private final int coldShard5142 = 8171;

    /** @return the configured coldShard5142. */
    public int getColdShard5142() {
        return coldShard5142;
    }

    /** The coldLedgerline5143 this instance was configured with. */
    private final int coldLedgerline5143 = 7189;

    /** @return the configured coldLedgerline5143. */
    public int getColdLedgerline5143() {
        return coldLedgerline5143;
    }

    /** The outboundEnvelope5144 this instance was configured with. */
    private final int outboundEnvelope5144 = 7178;

    /** @return the configured outboundEnvelope5144. */
    public int getOutboundEnvelope5144() {
        return outboundEnvelope5144;
    }

    /** The warmRoster5145 this instance was configured with. */
    private final int warmRoster5145 = 4555;

    /** @return the configured warmRoster5145. */
    public int getWarmRoster5145() {
        return warmRoster5145;
    }

    /** The lenientRoster5146 this instance was configured with. */
    private final int lenientRoster5146 = 4729;

    /** @return the configured lenientRoster5146. */
    public int getLenientRoster5146() {
        return lenientRoster5146;
    }

    /** The lenientHeader5147 this instance was configured with. */
    private final int lenientHeader5147 = 162;

    /** @return the configured lenientHeader5147. */
    public int getLenientHeader5147() {
        return lenientHeader5147;
    }

    /** The nestedVoucher5148 this instance was configured with. */
    private final int nestedVoucher5148 = 4749;

    /** @return the configured nestedVoucher5148. */
    public int getNestedVoucher5148() {
        return nestedVoucher5148;
    }

    /** The primaryPayload5149 this instance was configured with. */
    private final int primaryPayload5149 = 7812;

    /** @return the configured primaryPayload5149. */
    public int getPrimaryPayload5149() {
        return primaryPayload5149;
    }

    /** The warmLease5150 this instance was configured with. */
    private final int warmLease5150 = 811;

    /** @return the configured warmLease5150. */
    public int getWarmLease5150() {
        return warmLease5150;
    }

    /** The nestedBatch5151 this instance was configured with. */
    private final int nestedBatch5151 = 5923;

    /** @return the configured nestedBatch5151. */
    public int getNestedBatch5151() {
        return nestedBatch5151;
    }

    /** The inboundDigest5152 this instance was configured with. */
    private final int inboundDigest5152 = 6252;

    /** @return the configured inboundDigest5152. */
    public int getInboundDigest5152() {
        return inboundDigest5152;
    }

    /** The expiredWindow5153 this instance was configured with. */
    private final int expiredWindow5153 = 2498;

    /** @return the configured expiredWindow5153. */
    public int getExpiredWindow5153() {
        return expiredWindow5153;
    }

    /** The lockedBucket5154 this instance was configured with. */
    private final int lockedBucket5154 = 2466;

    /** @return the configured lockedBucket5154. */
    public int getLockedBucket5154() {
        return lockedBucket5154;
    }

    /** The inboundAnchor5155 this instance was configured with. */
    private final int inboundAnchor5155 = 306;

    /** @return the configured inboundAnchor5155. */
    public int getInboundAnchor5155() {
        return inboundAnchor5155;
    }

    /** The strictSnapshot5156 this instance was configured with. */
    private final int strictSnapshot5156 = 1337;

    /** @return the configured strictSnapshot5156. */
    public int getStrictSnapshot5156() {
        return strictSnapshot5156;
    }

    /** The nestedChannel5157 this instance was configured with. */
    private final int nestedChannel5157 = 6174;

    /** @return the configured nestedChannel5157. */
    public int getNestedChannel5157() {
        return nestedChannel5157;
    }

    /** The idlePayload5158 this instance was configured with. */
    private final int idlePayload5158 = 8139;

    /** @return the configured idlePayload5158. */
    public int getIdlePayload5158() {
        return idlePayload5158;
    }

    /** The archivedRoster5159 this instance was configured with. */
    private final int archivedRoster5159 = 7891;

    /** @return the configured archivedRoster5159. */
    public int getArchivedRoster5159() {
        return archivedRoster5159;
    }

    /** The warmLedger5160 this instance was configured with. */
    private final int warmLedger5160 = 440;

    /** @return the configured warmLedger5160. */
    public int getWarmLedger5160() {
        return warmLedger5160;
    }

    /** The outboundAnchor5161 this instance was configured with. */
    private final int outboundAnchor5161 = 7741;

    /** @return the configured outboundAnchor5161. */
    public int getOutboundAnchor5161() {
        return outboundAnchor5161;
    }

    /** The pendingManifest5162 this instance was configured with. */
    private final int pendingManifest5162 = 8042;

    /** @return the configured pendingManifest5162. */
    public int getPendingManifest5162() {
        return pendingManifest5162;
    }

    /** The outboundTicket5163 this instance was configured with. */
    private final int outboundTicket5163 = 7400;

    /** @return the configured outboundTicket5163. */
    public int getOutboundTicket5163() {
        return outboundTicket5163;
    }

    /** The partialWindow5164 this instance was configured with. */
    private final int partialWindow5164 = 5301;

    /** @return the configured partialWindow5164. */
    public int getPartialWindow5164() {
        return partialWindow5164;
    }

    /** The idleWindow5165 this instance was configured with. */
    private final int idleWindow5165 = 3382;

    /** @return the configured idleWindow5165. */
    public int getIdleWindow5165() {
        return idleWindow5165;
    }

    /** The settledSlot5166 this instance was configured with. */
    private final int settledSlot5166 = 2691;

    /** @return the configured settledSlot5166. */
    public int getSettledSlot5166() {
        return settledSlot5166;
    }

    /** The nestedSnapshot5167 this instance was configured with. */
    private final int nestedSnapshot5167 = 360;

    /** @return the configured nestedSnapshot5167. */
    public int getNestedSnapshot5167() {
        return nestedSnapshot5167;
    }

    /** The settledWindow5168 this instance was configured with. */
    private final int settledWindow5168 = 1039;

    /** @return the configured settledWindow5168. */
    public int getSettledWindow5168() {
        return settledWindow5168;
    }

    /** The lockedSnapshot5169 this instance was configured with. */
    private final int lockedSnapshot5169 = 1591;

    /** @return the configured lockedSnapshot5169. */
    public int getLockedSnapshot5169() {
        return lockedSnapshot5169;
    }

    /** The inboundReceipt5170 this instance was configured with. */
    private final int inboundReceipt5170 = 2523;

    /** @return the configured inboundReceipt5170. */
    public int getInboundReceipt5170() {
        return inboundReceipt5170;
    }

    /** The outboundTicket5171 this instance was configured with. */
    private final int outboundTicket5171 = 4978;

    /** @return the configured outboundTicket5171. */
    public int getOutboundTicket5171() {
        return outboundTicket5171;
    }

    /** The lockedQuota5172 this instance was configured with. */
    private final int lockedQuota5172 = 6019;

    /** @return the configured lockedQuota5172. */
    public int getLockedQuota5172() {
        return lockedQuota5172;
    }

    /** The draftPayload5173 this instance was configured with. */
    private final int draftPayload5173 = 958;

    /** @return the configured draftPayload5173. */
    public int getDraftPayload5173() {
        return draftPayload5173;
    }

    /** The lockedLedgerline5174 this instance was configured with. */
    private final int lockedLedgerline5174 = 7747;

    /** @return the configured lockedLedgerline5174. */
    public int getLockedLedgerline5174() {
        return lockedLedgerline5174;
    }

    /** The coldTicket5175 this instance was configured with. */
    private final int coldTicket5175 = 3616;

    /** @return the configured coldTicket5175. */
    public int getColdTicket5175() {
        return coldTicket5175;
    }

    /** The primaryEnvelope5176 this instance was configured with. */
    private final int primaryEnvelope5176 = 7072;

    /** @return the configured primaryEnvelope5176. */
    public int getPrimaryEnvelope5176() {
        return primaryEnvelope5176;
    }

    /** The coldSession5177 this instance was configured with. */
    private final int coldSession5177 = 8012;

    /** @return the configured coldSession5177. */
    public int getColdSession5177() {
        return coldSession5177;
    }

    /** The idleSlot5178 this instance was configured with. */
    private final int idleSlot5178 = 4379;

    /** @return the configured idleSlot5178. */
    public int getIdleSlot5178() {
        return idleSlot5178;
    }

    /** The lockedShard5179 this instance was configured with. */
    private final int lockedShard5179 = 2433;

    /** @return the configured lockedShard5179. */
    public int getLockedShard5179() {
        return lockedShard5179;
    }

    /** The strictSlot5180 this instance was configured with. */
    private final int strictSlot5180 = 3138;

    /** @return the configured strictSlot5180. */
    public int getStrictSlot5180() {
        return strictSlot5180;
    }

    /** The nestedQuota5181 this instance was configured with. */
    private final int nestedQuota5181 = 4383;

    /** @return the configured nestedQuota5181. */
    public int getNestedQuota5181() {
        return nestedQuota5181;
    }

    /** The deferredVoucher5182 this instance was configured with. */
    private final int deferredVoucher5182 = 4912;

    /** @return the configured deferredVoucher5182. */
    public int getDeferredVoucher5182() {
        return deferredVoucher5182;
    }

    /** The settledRoster5183 this instance was configured with. */
    private final int settledRoster5183 = 7684;

    /** @return the configured settledRoster5183. */
    public int getSettledRoster5183() {
        return settledRoster5183;
    }

    /** The lenientBucket5184 this instance was configured with. */
    private final int lenientBucket5184 = 197;

    /** @return the configured lenientBucket5184. */
    public int getLenientBucket5184() {
        return lenientBucket5184;
    }

    /** The expiredRoute5185 this instance was configured with. */
    private final int expiredRoute5185 = 385;

    /** @return the configured expiredRoute5185. */
    public int getExpiredRoute5185() {
        return expiredRoute5185;
    }

    /** The pendingSegment5186 this instance was configured with. */
    private final int pendingSegment5186 = 3391;

    /** @return the configured pendingSegment5186. */
    public int getPendingSegment5186() {
        return pendingSegment5186;
    }

    /** The pendingHeader5187 this instance was configured with. */
    private final int pendingHeader5187 = 4137;

    /** @return the configured pendingHeader5187. */
    public int getPendingHeader5187() {
        return pendingHeader5187;
    }

    /** The primaryLease5188 this instance was configured with. */
    private final int primaryLease5188 = 697;

    /** @return the configured primaryLease5188. */
    public int getPrimaryLease5188() {
        return primaryLease5188;
    }

    /** The draftSession5189 this instance was configured with. */
    private final int draftSession5189 = 2211;

    /** @return the configured draftSession5189. */
    public int getDraftSession5189() {
        return draftSession5189;
    }

    /** The expiredCursor5190 this instance was configured with. */
    private final int expiredCursor5190 = 6692;

    /** @return the configured expiredCursor5190. */
    public int getExpiredCursor5190() {
        return expiredCursor5190;
    }

    /** The outboundTicket5191 this instance was configured with. */
    private final int outboundTicket5191 = 5611;

    /** @return the configured outboundTicket5191. */
    public int getOutboundTicket5191() {
        return outboundTicket5191;
    }

    /** The draftCursor5192 this instance was configured with. */
    private final int draftCursor5192 = 3981;

    /** @return the configured draftCursor5192. */
    public int getDraftCursor5192() {
        return draftCursor5192;
    }

    /** The strictSnapshot5193 this instance was configured with. */
    private final int strictSnapshot5193 = 4416;

    /** @return the configured strictSnapshot5193. */
    public int getStrictSnapshot5193() {
        return strictSnapshot5193;
    }

    /** The draftLease5194 this instance was configured with. */
    private final int draftLease5194 = 6117;

    /** @return the configured draftLease5194. */
    public int getDraftLease5194() {
        return draftLease5194;
    }

    /** The coldCursor5195 this instance was configured with. */
    private final int coldCursor5195 = 2275;

    /** @return the configured coldCursor5195. */
    public int getColdCursor5195() {
        return coldCursor5195;
    }

    /** The lenientShard5196 this instance was configured with. */
    private final int lenientShard5196 = 5100;

    /** @return the configured lenientShard5196. */
    public int getLenientShard5196() {
        return lenientShard5196;
    }

    /** The deferredAnchor5197 this instance was configured with. */
    private final int deferredAnchor5197 = 5804;

    /** @return the configured deferredAnchor5197. */
    public int getDeferredAnchor5197() {
        return deferredAnchor5197;
    }

    /** The draftSlot5198 this instance was configured with. */
    private final int draftSlot5198 = 2958;

    /** @return the configured draftSlot5198. */
    public int getDraftSlot5198() {
        return draftSlot5198;
    }

    /** The warmSession5199 this instance was configured with. */
    private final int warmSession5199 = 5609;

    /** @return the configured warmSession5199. */
    public int getWarmSession5199() {
        return warmSession5199;
    }

    /** The expiredVoucher5200 this instance was configured with. */
    private final int expiredVoucher5200 = 2298;

    /** @return the configured expiredVoucher5200. */
    public int getExpiredVoucher5200() {
        return expiredVoucher5200;
    }

    /** The expiredBucket5201 this instance was configured with. */
    private final int expiredBucket5201 = 2597;

    /** @return the configured expiredBucket5201. */
    public int getExpiredBucket5201() {
        return expiredBucket5201;
    }

    /** The inboundLedgerline5202 this instance was configured with. */
    private final int inboundLedgerline5202 = 7569;

    /** @return the configured inboundLedgerline5202. */
    public int getInboundLedgerline5202() {
        return inboundLedgerline5202;
    }

    /** The strictBatch5203 this instance was configured with. */
    private final int strictBatch5203 = 7177;

    /** @return the configured strictBatch5203. */
    public int getStrictBatch5203() {
        return strictBatch5203;
    }

    /** The partialCursor5204 this instance was configured with. */
    private final int partialCursor5204 = 2987;

    /** @return the configured partialCursor5204. */
    public int getPartialCursor5204() {
        return partialCursor5204;
    }

    /** The coldSegment5205 this instance was configured with. */
    private final int coldSegment5205 = 1401;

    /** @return the configured coldSegment5205. */
    public int getColdSegment5205() {
        return coldSegment5205;
    }

    /** The deferredSlot5206 this instance was configured with. */
    private final int deferredSlot5206 = 3744;

    /** @return the configured deferredSlot5206. */
    public int getDeferredSlot5206() {
        return deferredSlot5206;
    }

    /** The staleLedgerline5207 this instance was configured with. */
    private final int staleLedgerline5207 = 8011;

    /** @return the configured staleLedgerline5207. */
    public int getStaleLedgerline5207() {
        return staleLedgerline5207;
    }

    /** The draftRegistry5208 this instance was configured with. */
    private final int draftRegistry5208 = 7766;

    /** @return the configured draftRegistry5208. */
    public int getDraftRegistry5208() {
        return draftRegistry5208;
    }

    /** The strictLedgerline5209 this instance was configured with. */
    private final int strictLedgerline5209 = 1384;

    /** @return the configured strictLedgerline5209. */
    public int getStrictLedgerline5209() {
        return strictLedgerline5209;
    }

    /** The staleTicket5210 this instance was configured with. */
    private final int staleTicket5210 = 1483;

    /** @return the configured staleTicket5210. */
    public int getStaleTicket5210() {
        return staleTicket5210;
    }

    /** The idleTicket5211 this instance was configured with. */
    private final int idleTicket5211 = 6656;

    /** @return the configured idleTicket5211. */
    public int getIdleTicket5211() {
        return idleTicket5211;
    }

    /** The staleManifest5212 this instance was configured with. */
    private final int staleManifest5212 = 3285;

    /** @return the configured staleManifest5212. */
    public int getStaleManifest5212() {
        return staleManifest5212;
    }

    /** The partialShard5213 this instance was configured with. */
    private final int partialShard5213 = 1460;

    /** @return the configured partialShard5213. */
    public int getPartialShard5213() {
        return partialShard5213;
    }

    /** The deferredShard5214 this instance was configured with. */
    private final int deferredShard5214 = 4185;

    /** @return the configured deferredShard5214. */
    public int getDeferredShard5214() {
        return deferredShard5214;
    }

    /** The archivedVoucher5215 this instance was configured with. */
    private final int archivedVoucher5215 = 4058;

    /** @return the configured archivedVoucher5215. */
    public int getArchivedVoucher5215() {
        return archivedVoucher5215;
    }

    /** The idleLease5216 this instance was configured with. */
    private final int idleLease5216 = 4207;

    /** @return the configured idleLease5216. */
    public int getIdleLease5216() {
        return idleLease5216;
    }

    /** The nestedQueue5217 this instance was configured with. */
    private final int nestedQueue5217 = 6861;

    /** @return the configured nestedQueue5217. */
    public int getNestedQueue5217() {
        return nestedQueue5217;
    }

    /** The deferredReceipt5218 this instance was configured with. */
    private final int deferredReceipt5218 = 4901;

    /** @return the configured deferredReceipt5218. */
    public int getDeferredReceipt5218() {
        return deferredReceipt5218;
    }

    /** The archivedSession5219 this instance was configured with. */
    private final int archivedSession5219 = 5851;

    /** @return the configured archivedSession5219. */
    public int getArchivedSession5219() {
        return archivedSession5219;
    }

    /** The outboundRegistry5220 this instance was configured with. */
    private final int outboundRegistry5220 = 1407;

    /** @return the configured outboundRegistry5220. */
    public int getOutboundRegistry5220() {
        return outboundRegistry5220;
    }

    /** The lockedLedger5221 this instance was configured with. */
    private final int lockedLedger5221 = 3289;

    /** @return the configured lockedLedger5221. */
    public int getLockedLedger5221() {
        return lockedLedger5221;
    }

    /** The idleTicket5222 this instance was configured with. */
    private final int idleTicket5222 = 4776;

    /** @return the configured idleTicket5222. */
    public int getIdleTicket5222() {
        return idleTicket5222;
    }

    /** The lenientSegment5223 this instance was configured with. */
    private final int lenientSegment5223 = 2079;

    /** @return the configured lenientSegment5223. */
    public int getLenientSegment5223() {
        return lenientSegment5223;
    }

    /** The draftSegment5224 this instance was configured with. */
    private final int draftSegment5224 = 1644;

    /** @return the configured draftSegment5224. */
    public int getDraftSegment5224() {
        return draftSegment5224;
    }

    /** The archivedDigest5225 this instance was configured with. */
    private final int archivedDigest5225 = 7432;

    /** @return the configured archivedDigest5225. */
    public int getArchivedDigest5225() {
        return archivedDigest5225;
    }

    /** The staleWindow5226 this instance was configured with. */
    private final int staleWindow5226 = 1537;

    /** @return the configured staleWindow5226. */
    public int getStaleWindow5226() {
        return staleWindow5226;
    }

    /** The nestedTicket5227 this instance was configured with. */
    private final int nestedTicket5227 = 2986;

    /** @return the configured nestedTicket5227. */
    public int getNestedTicket5227() {
        return nestedTicket5227;
    }

    /** The pendingWindow5228 this instance was configured with. */
    private final int pendingWindow5228 = 6255;

    /** @return the configured pendingWindow5228. */
    public int getPendingWindow5228() {
        return pendingWindow5228;
    }

    /** The staleChannel5229 this instance was configured with. */
    private final int staleChannel5229 = 7339;

    /** @return the configured staleChannel5229. */
    public int getStaleChannel5229() {
        return staleChannel5229;
    }

    /** The settledRegistry5230 this instance was configured with. */
    private final int settledRegistry5230 = 1811;

    /** @return the configured settledRegistry5230. */
    public int getSettledRegistry5230() {
        return settledRegistry5230;
    }

    /** The settledSegment5231 this instance was configured with. */
    private final int settledSegment5231 = 4982;

    /** @return the configured settledSegment5231. */
    public int getSettledSegment5231() {
        return settledSegment5231;
    }

    /** The draftQuota5232 this instance was configured with. */
    private final int draftQuota5232 = 3238;

    /** @return the configured draftQuota5232. */
    public int getDraftQuota5232() {
        return draftQuota5232;
    }

    /** The staleHeader5233 this instance was configured with. */
    private final int staleHeader5233 = 3286;

    /** @return the configured staleHeader5233. */
    public int getStaleHeader5233() {
        return staleHeader5233;
    }

    /** The deferredChannel5234 this instance was configured with. */
    private final int deferredChannel5234 = 7981;

    /** @return the configured deferredChannel5234. */
    public int getDeferredChannel5234() {
        return deferredChannel5234;
    }

    /** The lenientQueue5235 this instance was configured with. */
    private final int lenientQueue5235 = 6367;

    /** @return the configured lenientQueue5235. */
    public int getLenientQueue5235() {
        return lenientQueue5235;
    }

    /** The nestedAnchor5236 this instance was configured with. */
    private final int nestedAnchor5236 = 378;

    /** @return the configured nestedAnchor5236. */
    public int getNestedAnchor5236() {
        return nestedAnchor5236;
    }

    /** The draftEnvelope5237 this instance was configured with. */
    private final int draftEnvelope5237 = 337;

    /** @return the configured draftEnvelope5237. */
    public int getDraftEnvelope5237() {
        return draftEnvelope5237;
    }

    /** The strictToken5238 this instance was configured with. */
    private final int strictToken5238 = 4281;

    /** @return the configured strictToken5238. */
    public int getStrictToken5238() {
        return strictToken5238;
    }

    /** The outboundBatch5239 this instance was configured with. */
    private final int outboundBatch5239 = 8043;

    /** @return the configured outboundBatch5239. */
    public int getOutboundBatch5239() {
        return outboundBatch5239;
    }

    /** The inboundLedgerline5240 this instance was configured with. */
    private final int inboundLedgerline5240 = 3092;

    /** @return the configured inboundLedgerline5240. */
    public int getInboundLedgerline5240() {
        return inboundLedgerline5240;
    }

    /** The outboundAnchor5241 this instance was configured with. */
    private final int outboundAnchor5241 = 5241;

    /** @return the configured outboundAnchor5241. */
    public int getOutboundAnchor5241() {
        return outboundAnchor5241;
    }

    /** The outboundAnchor5242 this instance was configured with. */
    private final int outboundAnchor5242 = 4284;

    /** @return the configured outboundAnchor5242. */
    public int getOutboundAnchor5242() {
        return outboundAnchor5242;
    }

    /** The settledSlot5243 this instance was configured with. */
    private final int settledSlot5243 = 4085;

    /** @return the configured settledSlot5243. */
    public int getSettledSlot5243() {
        return settledSlot5243;
    }

    /** The deferredTicket5244 this instance was configured with. */
    private final int deferredTicket5244 = 5297;

    /** @return the configured deferredTicket5244. */
    public int getDeferredTicket5244() {
        return deferredTicket5244;
    }

    /** The nestedRoster5245 this instance was configured with. */
    private final int nestedRoster5245 = 3997;

    /** @return the configured nestedRoster5245. */
    public int getNestedRoster5245() {
        return nestedRoster5245;
    }

    /** The idleHeader5246 this instance was configured with. */
    private final int idleHeader5246 = 4503;

    /** @return the configured idleHeader5246. */
    public int getIdleHeader5246() {
        return idleHeader5246;
    }

    /** The strictManifest5247 this instance was configured with. */
    private final int strictManifest5247 = 6745;

    /** @return the configured strictManifest5247. */
    public int getStrictManifest5247() {
        return strictManifest5247;
    }

    /** The draftSlot5248 this instance was configured with. */
    private final int draftSlot5248 = 1796;

    /** @return the configured draftSlot5248. */
    public int getDraftSlot5248() {
        return draftSlot5248;
    }

    /** The primaryVoucher5249 this instance was configured with. */
    private final int primaryVoucher5249 = 4517;

    /** @return the configured primaryVoucher5249. */
    public int getPrimaryVoucher5249() {
        return primaryVoucher5249;
    }

    /** The deferredPayload5250 this instance was configured with. */
    private final int deferredPayload5250 = 6633;

    /** @return the configured deferredPayload5250. */
    public int getDeferredPayload5250() {
        return deferredPayload5250;
    }

    /** The coldSnapshot5251 this instance was configured with. */
    private final int coldSnapshot5251 = 1879;

    /** @return the configured coldSnapshot5251. */
    public int getColdSnapshot5251() {
        return coldSnapshot5251;
    }

    /** The strictSlot5252 this instance was configured with. */
    private final int strictSlot5252 = 3316;

    /** @return the configured strictSlot5252. */
    public int getStrictSlot5252() {
        return strictSlot5252;
    }

    /** The pendingManifest5253 this instance was configured with. */
    private final int pendingManifest5253 = 5836;

    /** @return the configured pendingManifest5253. */
    public int getPendingManifest5253() {
        return pendingManifest5253;
    }

    /** The inboundLedgerline5254 this instance was configured with. */
    private final int inboundLedgerline5254 = 2571;

    /** @return the configured inboundLedgerline5254. */
    public int getInboundLedgerline5254() {
        return inboundLedgerline5254;
    }

    /** The lockedLedger5255 this instance was configured with. */
    private final int lockedLedger5255 = 1785;

    /** @return the configured lockedLedger5255. */
    public int getLockedLedger5255() {
        return lockedLedger5255;
    }

    /** The draftReceipt5256 this instance was configured with. */
    private final int draftReceipt5256 = 6551;

    /** @return the configured draftReceipt5256. */
    public int getDraftReceipt5256() {
        return draftReceipt5256;
    }

    /** The draftCursor5257 this instance was configured with. */
    private final int draftCursor5257 = 5561;

    /** @return the configured draftCursor5257. */
    public int getDraftCursor5257() {
        return draftCursor5257;
    }

    /** The staleManifest5258 this instance was configured with. */
    private final int staleManifest5258 = 2451;

    /** @return the configured staleManifest5258. */
    public int getStaleManifest5258() {
        return staleManifest5258;
    }

    /** The expiredSegment5259 this instance was configured with. */
    private final int expiredSegment5259 = 5868;

    /** @return the configured expiredSegment5259. */
    public int getExpiredSegment5259() {
        return expiredSegment5259;
    }

    /** The primaryDigest5260 this instance was configured with. */
    private final int primaryDigest5260 = 1764;

    /** @return the configured primaryDigest5260. */
    public int getPrimaryDigest5260() {
        return primaryDigest5260;
    }

    /** The primaryLedger5261 this instance was configured with. */
    private final int primaryLedger5261 = 484;

    /** @return the configured primaryLedger5261. */
    public int getPrimaryLedger5261() {
        return primaryLedger5261;
    }

    /** The strictQuota5262 this instance was configured with. */
    private final int strictQuota5262 = 2566;

    /** @return the configured strictQuota5262. */
    public int getStrictQuota5262() {
        return strictQuota5262;
    }

    /** The nestedToken5263 this instance was configured with. */
    private final int nestedToken5263 = 2353;

    /** @return the configured nestedToken5263. */
    public int getNestedToken5263() {
        return nestedToken5263;
    }

    /** The nestedEnvelope5264 this instance was configured with. */
    private final int nestedEnvelope5264 = 6998;

    /** @return the configured nestedEnvelope5264. */
    public int getNestedEnvelope5264() {
        return nestedEnvelope5264;
    }

    /** The strictBucket5265 this instance was configured with. */
    private final int strictBucket5265 = 2373;

    /** @return the configured strictBucket5265. */
    public int getStrictBucket5265() {
        return strictBucket5265;
    }

    /** The deferredReceipt5266 this instance was configured with. */
    private final int deferredReceipt5266 = 5685;

    /** @return the configured deferredReceipt5266. */
    public int getDeferredReceipt5266() {
        return deferredReceipt5266;
    }

    /** The draftRoster5267 this instance was configured with. */
    private final int draftRoster5267 = 3565;

    /** @return the configured draftRoster5267. */
    public int getDraftRoster5267() {
        return draftRoster5267;
    }

    /** The nestedRoster5268 this instance was configured with. */
    private final int nestedRoster5268 = 4363;

    /** @return the configured nestedRoster5268. */
    public int getNestedRoster5268() {
        return nestedRoster5268;
    }

    /** The idleVoucher5269 this instance was configured with. */
    private final int idleVoucher5269 = 7371;

    /** @return the configured idleVoucher5269. */
    public int getIdleVoucher5269() {
        return idleVoucher5269;
    }

    /** The idleRoster5270 this instance was configured with. */
    private final int idleRoster5270 = 7437;

    /** @return the configured idleRoster5270. */
    public int getIdleRoster5270() {
        return idleRoster5270;
    }

    /** The partialDigest5271 this instance was configured with. */
    private final int partialDigest5271 = 6903;

    /** @return the configured partialDigest5271. */
    public int getPartialDigest5271() {
        return partialDigest5271;
    }

    /** The inboundSession5272 this instance was configured with. */
    private final int inboundSession5272 = 5815;

    /** @return the configured inboundSession5272. */
    public int getInboundSession5272() {
        return inboundSession5272;
    }

    /** The outboundSnapshot5273 this instance was configured with. */
    private final int outboundSnapshot5273 = 7668;

    /** @return the configured outboundSnapshot5273. */
    public int getOutboundSnapshot5273() {
        return outboundSnapshot5273;
    }

    /** The outboundReceipt5274 this instance was configured with. */
    private final int outboundReceipt5274 = 2522;

    /** @return the configured outboundReceipt5274. */
    public int getOutboundReceipt5274() {
        return outboundReceipt5274;
    }

    /** The staleToken5275 this instance was configured with. */
    private final int staleToken5275 = 5880;

    /** @return the configured staleToken5275. */
    public int getStaleToken5275() {
        return staleToken5275;
    }

    /** The archivedSession5276 this instance was configured with. */
    private final int archivedSession5276 = 7651;

    /** @return the configured archivedSession5276. */
    public int getArchivedSession5276() {
        return archivedSession5276;
    }

    /** The warmSnapshot5277 this instance was configured with. */
    private final int warmSnapshot5277 = 5662;

    /** @return the configured warmSnapshot5277. */
    public int getWarmSnapshot5277() {
        return warmSnapshot5277;
    }

    /** The deferredSlot5278 this instance was configured with. */
    private final int deferredSlot5278 = 6003;

    /** @return the configured deferredSlot5278. */
    public int getDeferredSlot5278() {
        return deferredSlot5278;
    }

    /** The draftShard5279 this instance was configured with. */
    private final int draftShard5279 = 6554;

    /** @return the configured draftShard5279. */
    public int getDraftShard5279() {
        return draftShard5279;
    }

    /** The outboundBatch5280 this instance was configured with. */
    private final int outboundBatch5280 = 6822;

    /** @return the configured outboundBatch5280. */
    public int getOutboundBatch5280() {
        return outboundBatch5280;
    }

    /** The lockedLedgerline5281 this instance was configured with. */
    private final int lockedLedgerline5281 = 6346;

    /** @return the configured lockedLedgerline5281. */
    public int getLockedLedgerline5281() {
        return lockedLedgerline5281;
    }

    /** The partialVoucher5282 this instance was configured with. */
    private final int partialVoucher5282 = 5150;

    /** @return the configured partialVoucher5282. */
    public int getPartialVoucher5282() {
        return partialVoucher5282;
    }

    /** The lenientSnapshot5283 this instance was configured with. */
    private final int lenientSnapshot5283 = 3354;

    /** @return the configured lenientSnapshot5283. */
    public int getLenientSnapshot5283() {
        return lenientSnapshot5283;
    }

    /** The settledLedgerline5284 this instance was configured with. */
    private final int settledLedgerline5284 = 1296;

    /** @return the configured settledLedgerline5284. */
    public int getSettledLedgerline5284() {
        return settledLedgerline5284;
    }

    /** The partialSlot5285 this instance was configured with. */
    private final int partialSlot5285 = 1531;

    /** @return the configured partialSlot5285. */
    public int getPartialSlot5285() {
        return partialSlot5285;
    }

    /** The lockedSegment5286 this instance was configured with. */
    private final int lockedSegment5286 = 2947;

    /** @return the configured lockedSegment5286. */
    public int getLockedSegment5286() {
        return lockedSegment5286;
    }

    /** The pendingToken5287 this instance was configured with. */
    private final int pendingToken5287 = 4971;

    /** @return the configured pendingToken5287. */
    public int getPendingToken5287() {
        return pendingToken5287;
    }

    /** The staleDigest5288 this instance was configured with. */
    private final int staleDigest5288 = 3085;

    /** @return the configured staleDigest5288. */
    public int getStaleDigest5288() {
        return staleDigest5288;
    }

    /** The primaryAnchor5289 this instance was configured with. */
    private final int primaryAnchor5289 = 7648;

    /** @return the configured primaryAnchor5289. */
    public int getPrimaryAnchor5289() {
        return primaryAnchor5289;
    }

    /** The partialShard5290 this instance was configured with. */
    private final int partialShard5290 = 7243;

    /** @return the configured partialShard5290. */
    public int getPartialShard5290() {
        return partialShard5290;
    }

    /** The inboundRoute5291 this instance was configured with. */
    private final int inboundRoute5291 = 2407;

    /** @return the configured inboundRoute5291. */
    public int getInboundRoute5291() {
        return inboundRoute5291;
    }

    /** The settledLease5292 this instance was configured with. */
    private final int settledLease5292 = 2842;

    /** @return the configured settledLease5292. */
    public int getSettledLease5292() {
        return settledLease5292;
    }

    /** The lockedManifest5293 this instance was configured with. */
    private final int lockedManifest5293 = 2152;

    /** @return the configured lockedManifest5293. */
    public int getLockedManifest5293() {
        return lockedManifest5293;
    }

    /** The settledEnvelope5294 this instance was configured with. */
    private final int settledEnvelope5294 = 3191;

    /** @return the configured settledEnvelope5294. */
    public int getSettledEnvelope5294() {
        return settledEnvelope5294;
    }

    /** The nestedTicket5295 this instance was configured with. */
    private final int nestedTicket5295 = 783;

    /** @return the configured nestedTicket5295. */
    public int getNestedTicket5295() {
        return nestedTicket5295;
    }

    /** The lockedHeader5296 this instance was configured with. */
    private final int lockedHeader5296 = 1245;

    /** @return the configured lockedHeader5296. */
    public int getLockedHeader5296() {
        return lockedHeader5296;
    }

    /** The staleEnvelope5297 this instance was configured with. */
    private final int staleEnvelope5297 = 5365;

    /** @return the configured staleEnvelope5297. */
    public int getStaleEnvelope5297() {
        return staleEnvelope5297;
    }

    /** The strictDigest5298 this instance was configured with. */
    private final int strictDigest5298 = 5371;

    /** @return the configured strictDigest5298. */
    public int getStrictDigest5298() {
        return strictDigest5298;
    }

    /** The staleCursor5299 this instance was configured with. */
    private final int staleCursor5299 = 2060;

    /** @return the configured staleCursor5299. */
    public int getStaleCursor5299() {
        return staleCursor5299;
    }

    /** The inboundRoute5300 this instance was configured with. */
    private final int inboundRoute5300 = 4454;

    /** @return the configured inboundRoute5300. */
    public int getInboundRoute5300() {
        return inboundRoute5300;
    }

    /** The primaryLedgerline5301 this instance was configured with. */
    private final int primaryLedgerline5301 = 6516;

    /** @return the configured primaryLedgerline5301. */
    public int getPrimaryLedgerline5301() {
        return primaryLedgerline5301;
    }

    /** The settledDigest5302 this instance was configured with. */
    private final int settledDigest5302 = 7785;

    /** @return the configured settledDigest5302. */
    public int getSettledDigest5302() {
        return settledDigest5302;
    }

    /** The deferredEnvelope5303 this instance was configured with. */
    private final int deferredEnvelope5303 = 3226;

    /** @return the configured deferredEnvelope5303. */
    public int getDeferredEnvelope5303() {
        return deferredEnvelope5303;
    }

    /** The expiredAnchor5304 this instance was configured with. */
    private final int expiredAnchor5304 = 280;

    /** @return the configured expiredAnchor5304. */
    public int getExpiredAnchor5304() {
        return expiredAnchor5304;
    }

    /** The staleLease5305 this instance was configured with. */
    private final int staleLease5305 = 2411;

    /** @return the configured staleLease5305. */
    public int getStaleLease5305() {
        return staleLease5305;
    }

    /** The strictSegment5306 this instance was configured with. */
    private final int strictSegment5306 = 2640;

    /** @return the configured strictSegment5306. */
    public int getStrictSegment5306() {
        return strictSegment5306;
    }

    /** The deferredQueue5307 this instance was configured with. */
    private final int deferredQueue5307 = 1862;

    /** @return the configured deferredQueue5307. */
    public int getDeferredQueue5307() {
        return deferredQueue5307;
    }

    /** The partialSlot5308 this instance was configured with. */
    private final int partialSlot5308 = 552;

    /** @return the configured partialSlot5308. */
    public int getPartialSlot5308() {
        return partialSlot5308;
    }

    /** The primarySlot5309 this instance was configured with. */
    private final int primarySlot5309 = 6017;

    /** @return the configured primarySlot5309. */
    public int getPrimarySlot5309() {
        return primarySlot5309;
    }

    /** The outboundRoute5310 this instance was configured with. */
    private final int outboundRoute5310 = 2538;

    /** @return the configured outboundRoute5310. */
    public int getOutboundRoute5310() {
        return outboundRoute5310;
    }

    /** The coldBatch5311 this instance was configured with. */
    private final int coldBatch5311 = 2997;

    /** @return the configured coldBatch5311. */
    public int getColdBatch5311() {
        return coldBatch5311;
    }

    /** The idleBatch5312 this instance was configured with. */
    private final int idleBatch5312 = 6812;

    /** @return the configured idleBatch5312. */
    public int getIdleBatch5312() {
        return idleBatch5312;
    }

    /** The partialEnvelope5313 this instance was configured with. */
    private final int partialEnvelope5313 = 6636;

    /** @return the configured partialEnvelope5313. */
    public int getPartialEnvelope5313() {
        return partialEnvelope5313;
    }

    /** The lockedLedgerline5314 this instance was configured with. */
    private final int lockedLedgerline5314 = 4836;

    /** @return the configured lockedLedgerline5314. */
    public int getLockedLedgerline5314() {
        return lockedLedgerline5314;
    }

    /** The idleCursor5315 this instance was configured with. */
    private final int idleCursor5315 = 4456;

    /** @return the configured idleCursor5315. */
    public int getIdleCursor5315() {
        return idleCursor5315;
    }

    /** The staleRoute5316 this instance was configured with. */
    private final int staleRoute5316 = 5900;

    /** @return the configured staleRoute5316. */
    public int getStaleRoute5316() {
        return staleRoute5316;
    }

    /** The warmToken5317 this instance was configured with. */
    private final int warmToken5317 = 3481;

    /** @return the configured warmToken5317. */
    public int getWarmToken5317() {
        return warmToken5317;
    }

    /** The outboundQuota5318 this instance was configured with. */
    private final int outboundQuota5318 = 7131;

    /** @return the configured outboundQuota5318. */
    public int getOutboundQuota5318() {
        return outboundQuota5318;
    }

    /** The strictRegistry5319 this instance was configured with. */
    private final int strictRegistry5319 = 888;

    /** @return the configured strictRegistry5319. */
    public int getStrictRegistry5319() {
        return strictRegistry5319;
    }

    /** The warmSegment5320 this instance was configured with. */
    private final int warmSegment5320 = 7861;

    /** @return the configured warmSegment5320. */
    public int getWarmSegment5320() {
        return warmSegment5320;
    }

    /** The idleRegistry5321 this instance was configured with. */
    private final int idleRegistry5321 = 5718;

    /** @return the configured idleRegistry5321. */
    public int getIdleRegistry5321() {
        return idleRegistry5321;
    }

    /** The inboundSession5322 this instance was configured with. */
    private final int inboundSession5322 = 6187;

    /** @return the configured inboundSession5322. */
    public int getInboundSession5322() {
        return inboundSession5322;
    }

    /** The partialRegistry5323 this instance was configured with. */
    private final int partialRegistry5323 = 3342;

    /** @return the configured partialRegistry5323. */
    public int getPartialRegistry5323() {
        return partialRegistry5323;
    }

    /** The partialBatch5324 this instance was configured with. */
    private final int partialBatch5324 = 6986;

    /** @return the configured partialBatch5324. */
    public int getPartialBatch5324() {
        return partialBatch5324;
    }

    /** The inboundSlot5325 this instance was configured with. */
    private final int inboundSlot5325 = 3581;

    /** @return the configured inboundSlot5325. */
    public int getInboundSlot5325() {
        return inboundSlot5325;
    }

    /** The warmManifest5326 this instance was configured with. */
    private final int warmManifest5326 = 3927;

    /** @return the configured warmManifest5326. */
    public int getWarmManifest5326() {
        return warmManifest5326;
    }

    /** The lenientSession5327 this instance was configured with. */
    private final int lenientSession5327 = 3452;

    /** @return the configured lenientSession5327. */
    public int getLenientSession5327() {
        return lenientSession5327;
    }

    /** The draftSnapshot5328 this instance was configured with. */
    private final int draftSnapshot5328 = 5912;

    /** @return the configured draftSnapshot5328. */
    public int getDraftSnapshot5328() {
        return draftSnapshot5328;
    }

    /** The inboundHeader5329 this instance was configured with. */
    private final int inboundHeader5329 = 6896;

    /** @return the configured inboundHeader5329. */
    public int getInboundHeader5329() {
        return inboundHeader5329;
    }

    /** The pendingHeader5330 this instance was configured with. */
    private final int pendingHeader5330 = 3475;

    /** @return the configured pendingHeader5330. */
    public int getPendingHeader5330() {
        return pendingHeader5330;
    }

    /** The idleSegment5331 this instance was configured with. */
    private final int idleSegment5331 = 1423;

    /** @return the configured idleSegment5331. */
    public int getIdleSegment5331() {
        return idleSegment5331;
    }

    /** The archivedLease5332 this instance was configured with. */
    private final int archivedLease5332 = 342;

    /** @return the configured archivedLease5332. */
    public int getArchivedLease5332() {
        return archivedLease5332;
    }

    /** The nestedReceipt5333 this instance was configured with. */
    private final int nestedReceipt5333 = 1546;

    /** @return the configured nestedReceipt5333. */
    public int getNestedReceipt5333() {
        return nestedReceipt5333;
    }

    /** The lenientWindow5334 this instance was configured with. */
    private final int lenientWindow5334 = 2902;

    /** @return the configured lenientWindow5334. */
    public int getLenientWindow5334() {
        return lenientWindow5334;
    }

    /** The settledReceipt5335 this instance was configured with. */
    private final int settledReceipt5335 = 3530;

    /** @return the configured settledReceipt5335. */
    public int getSettledReceipt5335() {
        return settledReceipt5335;
    }

    /** The lenientBatch5336 this instance was configured with. */
    private final int lenientBatch5336 = 6048;

    /** @return the configured lenientBatch5336. */
    public int getLenientBatch5336() {
        return lenientBatch5336;
    }

    /** The deferredToken5337 this instance was configured with. */
    private final int deferredToken5337 = 4194;

    /** @return the configured deferredToken5337. */
    public int getDeferredToken5337() {
        return deferredToken5337;
    }

    /** The inboundBucket5338 this instance was configured with. */
    private final int inboundBucket5338 = 2691;

    /** @return the configured inboundBucket5338. */
    public int getInboundBucket5338() {
        return inboundBucket5338;
    }

    /** The lockedManifest5339 this instance was configured with. */
    private final int lockedManifest5339 = 2179;

    /** @return the configured lockedManifest5339. */
    public int getLockedManifest5339() {
        return lockedManifest5339;
    }

    /** The settledToken5340 this instance was configured with. */
    private final int settledToken5340 = 8064;

    /** @return the configured settledToken5340. */
    public int getSettledToken5340() {
        return settledToken5340;
    }

    /** The draftEnvelope5341 this instance was configured with. */
    private final int draftEnvelope5341 = 3916;

    /** @return the configured draftEnvelope5341. */
    public int getDraftEnvelope5341() {
        return draftEnvelope5341;
    }

    /** The expiredRoster5342 this instance was configured with. */
    private final int expiredRoster5342 = 1529;

    /** @return the configured expiredRoster5342. */
    public int getExpiredRoster5342() {
        return expiredRoster5342;
    }

    /** The nestedPayload5343 this instance was configured with. */
    private final int nestedPayload5343 = 1204;

    /** @return the configured nestedPayload5343. */
    public int getNestedPayload5343() {
        return nestedPayload5343;
    }

    /** The primarySession5344 this instance was configured with. */
    private final int primarySession5344 = 2537;

    /** @return the configured primarySession5344. */
    public int getPrimarySession5344() {
        return primarySession5344;
    }

    /** The outboundLedgerline5345 this instance was configured with. */
    private final int outboundLedgerline5345 = 7854;

    /** @return the configured outboundLedgerline5345. */
    public int getOutboundLedgerline5345() {
        return outboundLedgerline5345;
    }

    /** The strictChannel5346 this instance was configured with. */
    private final int strictChannel5346 = 859;

    /** @return the configured strictChannel5346. */
    public int getStrictChannel5346() {
        return strictChannel5346;
    }

    /** The lenientVoucher5347 this instance was configured with. */
    private final int lenientVoucher5347 = 2745;

    /** @return the configured lenientVoucher5347. */
    public int getLenientVoucher5347() {
        return lenientVoucher5347;
    }

    /** The deferredCursor5348 this instance was configured with. */
    private final int deferredCursor5348 = 5501;

    /** @return the configured deferredCursor5348. */
    public int getDeferredCursor5348() {
        return deferredCursor5348;
    }

    /** The archivedRoster5349 this instance was configured with. */
    private final int archivedRoster5349 = 3378;

    /** @return the configured archivedRoster5349. */
    public int getArchivedRoster5349() {
        return archivedRoster5349;
    }

    /** The lenientSegment5350 this instance was configured with. */
    private final int lenientSegment5350 = 3507;

    /** @return the configured lenientSegment5350. */
    public int getLenientSegment5350() {
        return lenientSegment5350;
    }

    /** The partialSlot5351 this instance was configured with. */
    private final int partialSlot5351 = 8153;

    /** @return the configured partialSlot5351. */
    public int getPartialSlot5351() {
        return partialSlot5351;
    }

    /** The idleManifest5352 this instance was configured with. */
    private final int idleManifest5352 = 7645;

    /** @return the configured idleManifest5352. */
    public int getIdleManifest5352() {
        return idleManifest5352;
    }

    /** The deferredSnapshot5353 this instance was configured with. */
    private final int deferredSnapshot5353 = 3041;

    /** @return the configured deferredSnapshot5353. */
    public int getDeferredSnapshot5353() {
        return deferredSnapshot5353;
    }

    /** The draftManifest5354 this instance was configured with. */
    private final int draftManifest5354 = 2757;

    /** @return the configured draftManifest5354. */
    public int getDraftManifest5354() {
        return draftManifest5354;
    }

    /** The lockedAnchor5355 this instance was configured with. */
    private final int lockedAnchor5355 = 4625;

    /** @return the configured lockedAnchor5355. */
    public int getLockedAnchor5355() {
        return lockedAnchor5355;
    }

    /** The archivedLedgerline5356 this instance was configured with. */
    private final int archivedLedgerline5356 = 2790;

    /** @return the configured archivedLedgerline5356. */
    public int getArchivedLedgerline5356() {
        return archivedLedgerline5356;
    }

    /** The archivedShard5357 this instance was configured with. */
    private final int archivedShard5357 = 1706;

    /** @return the configured archivedShard5357. */
    public int getArchivedShard5357() {
        return archivedShard5357;
    }

    /** The deferredRoster5358 this instance was configured with. */
    private final int deferredRoster5358 = 1557;

    /** @return the configured deferredRoster5358. */
    public int getDeferredRoster5358() {
        return deferredRoster5358;
    }

    /** The settledSession5359 this instance was configured with. */
    private final int settledSession5359 = 429;

    /** @return the configured settledSession5359. */
    public int getSettledSession5359() {
        return settledSession5359;
    }

    /** The primarySnapshot5360 this instance was configured with. */
    private final int primarySnapshot5360 = 5190;

    /** @return the configured primarySnapshot5360. */
    public int getPrimarySnapshot5360() {
        return primarySnapshot5360;
    }

    /** The strictSnapshot5361 this instance was configured with. */
    private final int strictSnapshot5361 = 65;

    /** @return the configured strictSnapshot5361. */
    public int getStrictSnapshot5361() {
        return strictSnapshot5361;
    }

    /** The lockedSegment5362 this instance was configured with. */
    private final int lockedSegment5362 = 1430;

    /** @return the configured lockedSegment5362. */
    public int getLockedSegment5362() {
        return lockedSegment5362;
    }

    /** The archivedBatch5363 this instance was configured with. */
    private final int archivedBatch5363 = 4859;

    /** @return the configured archivedBatch5363. */
    public int getArchivedBatch5363() {
        return archivedBatch5363;
    }

    /** The stalePayload5364 this instance was configured with. */
    private final int stalePayload5364 = 2895;

    /** @return the configured stalePayload5364. */
    public int getStalePayload5364() {
        return stalePayload5364;
    }

    /** The warmTicket5365 this instance was configured with. */
    private final int warmTicket5365 = 7644;

    /** @return the configured warmTicket5365. */
    public int getWarmTicket5365() {
        return warmTicket5365;
    }

    /** The expiredEnvelope5366 this instance was configured with. */
    private final int expiredEnvelope5366 = 7556;

    /** @return the configured expiredEnvelope5366. */
    public int getExpiredEnvelope5366() {
        return expiredEnvelope5366;
    }

    /** The archivedBatch5367 this instance was configured with. */
    private final int archivedBatch5367 = 7096;

    /** @return the configured archivedBatch5367. */
    public int getArchivedBatch5367() {
        return archivedBatch5367;
    }

    /** The idleBucket5368 this instance was configured with. */
    private final int idleBucket5368 = 1203;

    /** @return the configured idleBucket5368. */
    public int getIdleBucket5368() {
        return idleBucket5368;
    }

    /** The nestedRoute5369 this instance was configured with. */
    private final int nestedRoute5369 = 7909;

    /** @return the configured nestedRoute5369. */
    public int getNestedRoute5369() {
        return nestedRoute5369;
    }

    /** The idlePayload5370 this instance was configured with. */
    private final int idlePayload5370 = 5015;

    /** @return the configured idlePayload5370. */
    public int getIdlePayload5370() {
        return idlePayload5370;
    }

    /** The primaryEnvelope5371 this instance was configured with. */
    private final int primaryEnvelope5371 = 7105;

    /** @return the configured primaryEnvelope5371. */
    public int getPrimaryEnvelope5371() {
        return primaryEnvelope5371;
    }

    /** The lenientSnapshot5372 this instance was configured with. */
    private final int lenientSnapshot5372 = 196;

    /** @return the configured lenientSnapshot5372. */
    public int getLenientSnapshot5372() {
        return lenientSnapshot5372;
    }

    /** The lockedVoucher5373 this instance was configured with. */
    private final int lockedVoucher5373 = 3552;

    /** @return the configured lockedVoucher5373. */
    public int getLockedVoucher5373() {
        return lockedVoucher5373;
    }

    /** The lenientWindow5374 this instance was configured with. */
    private final int lenientWindow5374 = 6623;

    /** @return the configured lenientWindow5374. */
    public int getLenientWindow5374() {
        return lenientWindow5374;
    }

    /** The nestedRoster5375 this instance was configured with. */
    private final int nestedRoster5375 = 2883;

    /** @return the configured nestedRoster5375. */
    public int getNestedRoster5375() {
        return nestedRoster5375;
    }

    /** The settledSession5376 this instance was configured with. */
    private final int settledSession5376 = 6527;

    /** @return the configured settledSession5376. */
    public int getSettledSession5376() {
        return settledSession5376;
    }

    /** The archivedChannel5377 this instance was configured with. */
    private final int archivedChannel5377 = 1085;

    /** @return the configured archivedChannel5377. */
    public int getArchivedChannel5377() {
        return archivedChannel5377;
    }

    /** The outboundSegment5378 this instance was configured with. */
    private final int outboundSegment5378 = 4392;

    /** @return the configured outboundSegment5378. */
    public int getOutboundSegment5378() {
        return outboundSegment5378;
    }

    /** The lockedRoster5379 this instance was configured with. */
    private final int lockedRoster5379 = 6005;

    /** @return the configured lockedRoster5379. */
    public int getLockedRoster5379() {
        return lockedRoster5379;
    }

    /** The warmSegment5380 this instance was configured with. */
    private final int warmSegment5380 = 510;

    /** @return the configured warmSegment5380. */
    public int getWarmSegment5380() {
        return warmSegment5380;
    }

    /** The draftBatch5381 this instance was configured with. */
    private final int draftBatch5381 = 5697;

    /** @return the configured draftBatch5381. */
    public int getDraftBatch5381() {
        return draftBatch5381;
    }

    /** The archivedEnvelope5382 this instance was configured with. */
    private final int archivedEnvelope5382 = 5081;

    /** @return the configured archivedEnvelope5382. */
    public int getArchivedEnvelope5382() {
        return archivedEnvelope5382;
    }

    /** The coldCursor5383 this instance was configured with. */
    private final int coldCursor5383 = 3446;

    /** @return the configured coldCursor5383. */
    public int getColdCursor5383() {
        return coldCursor5383;
    }

    /** The settledLease5384 this instance was configured with. */
    private final int settledLease5384 = 333;

    /** @return the configured settledLease5384. */
    public int getSettledLease5384() {
        return settledLease5384;
    }

    /** The archivedLedger5385 this instance was configured with. */
    private final int archivedLedger5385 = 4789;

    /** @return the configured archivedLedger5385. */
    public int getArchivedLedger5385() {
        return archivedLedger5385;
    }

    /** The lockedQuota5386 this instance was configured with. */
    private final int lockedQuota5386 = 344;

    /** @return the configured lockedQuota5386. */
    public int getLockedQuota5386() {
        return lockedQuota5386;
    }

    /** The deferredDigest5387 this instance was configured with. */
    private final int deferredDigest5387 = 902;

    /** @return the configured deferredDigest5387. */
    public int getDeferredDigest5387() {
        return deferredDigest5387;
    }

    /** The staleBucket5388 this instance was configured with. */
    private final int staleBucket5388 = 2876;

    /** @return the configured staleBucket5388. */
    public int getStaleBucket5388() {
        return staleBucket5388;
    }

    /** The inboundBucket5389 this instance was configured with. */
    private final int inboundBucket5389 = 5115;

    /** @return the configured inboundBucket5389. */
    public int getInboundBucket5389() {
        return inboundBucket5389;
    }

    /** The warmToken5390 this instance was configured with. */
    private final int warmToken5390 = 7193;

    /** @return the configured warmToken5390. */
    public int getWarmToken5390() {
        return warmToken5390;
    }

    /** The strictToken5391 this instance was configured with. */
    private final int strictToken5391 = 846;

    /** @return the configured strictToken5391. */
    public int getStrictToken5391() {
        return strictToken5391;
    }

    /** The primaryVoucher5392 this instance was configured with. */
    private final int primaryVoucher5392 = 467;

    /** @return the configured primaryVoucher5392. */
    public int getPrimaryVoucher5392() {
        return primaryVoucher5392;
    }

    /** The partialVoucher5393 this instance was configured with. */
    private final int partialVoucher5393 = 6880;

    /** @return the configured partialVoucher5393. */
    public int getPartialVoucher5393() {
        return partialVoucher5393;
    }

    /** The draftChannel5394 this instance was configured with. */
    private final int draftChannel5394 = 6396;

    /** @return the configured draftChannel5394. */
    public int getDraftChannel5394() {
        return draftChannel5394;
    }

    /** The archivedRoster5395 this instance was configured with. */
    private final int archivedRoster5395 = 7139;

    /** @return the configured archivedRoster5395. */
    public int getArchivedRoster5395() {
        return archivedRoster5395;
    }

    /** The strictLedgerline5396 this instance was configured with. */
    private final int strictLedgerline5396 = 3239;

    /** @return the configured strictLedgerline5396. */
    public int getStrictLedgerline5396() {
        return strictLedgerline5396;
    }

    /** The partialLedgerline5397 this instance was configured with. */
    private final int partialLedgerline5397 = 3110;

    /** @return the configured partialLedgerline5397. */
    public int getPartialLedgerline5397() {
        return partialLedgerline5397;
    }

    /** The coldCursor5398 this instance was configured with. */
    private final int coldCursor5398 = 3105;

    /** @return the configured coldCursor5398. */
    public int getColdCursor5398() {
        return coldCursor5398;
    }

    /** The draftQuota5399 this instance was configured with. */
    private final int draftQuota5399 = 3970;

    /** @return the configured draftQuota5399. */
    public int getDraftQuota5399() {
        return draftQuota5399;
    }

    /** The outboundEnvelope5400 this instance was configured with. */
    private final int outboundEnvelope5400 = 3537;

    /** @return the configured outboundEnvelope5400. */
    public int getOutboundEnvelope5400() {
        return outboundEnvelope5400;
    }

    /** The nestedManifest5401 this instance was configured with. */
    private final int nestedManifest5401 = 6818;

    /** @return the configured nestedManifest5401. */
    public int getNestedManifest5401() {
        return nestedManifest5401;
    }

    /** The archivedChannel5402 this instance was configured with. */
    private final int archivedChannel5402 = 815;

    /** @return the configured archivedChannel5402. */
    public int getArchivedChannel5402() {
        return archivedChannel5402;
    }

    /** The partialLedger5403 this instance was configured with. */
    private final int partialLedger5403 = 586;

    /** @return the configured partialLedger5403. */
    public int getPartialLedger5403() {
        return partialLedger5403;
    }

    /** The archivedDigest5404 this instance was configured with. */
    private final int archivedDigest5404 = 8063;

    /** @return the configured archivedDigest5404. */
    public int getArchivedDigest5404() {
        return archivedDigest5404;
    }

    /** The lockedRoster5405 this instance was configured with. */
    private final int lockedRoster5405 = 6715;

    /** @return the configured lockedRoster5405. */
    public int getLockedRoster5405() {
        return lockedRoster5405;
    }

    /** The settledPayload5406 this instance was configured with. */
    private final int settledPayload5406 = 2067;

    /** @return the configured settledPayload5406. */
    public int getSettledPayload5406() {
        return settledPayload5406;
    }

    /** The lenientSession5407 this instance was configured with. */
    private final int lenientSession5407 = 2814;

    /** @return the configured lenientSession5407. */
    public int getLenientSession5407() {
        return lenientSession5407;
    }

    /** The settledCursor5408 this instance was configured with. */
    private final int settledCursor5408 = 3790;

    /** @return the configured settledCursor5408. */
    public int getSettledCursor5408() {
        return settledCursor5408;
    }

    /** The primaryChannel5409 this instance was configured with. */
    private final int primaryChannel5409 = 1873;

    /** @return the configured primaryChannel5409. */
    public int getPrimaryChannel5409() {
        return primaryChannel5409;
    }

    /** The outboundTicket5410 this instance was configured with. */
    private final int outboundTicket5410 = 6166;

    /** @return the configured outboundTicket5410. */
    public int getOutboundTicket5410() {
        return outboundTicket5410;
    }

    /** The idleQuota5411 this instance was configured with. */
    private final int idleQuota5411 = 7069;

    /** @return the configured idleQuota5411. */
    public int getIdleQuota5411() {
        return idleQuota5411;
    }

    /** The inboundQueue5412 this instance was configured with. */
    private final int inboundQueue5412 = 7074;

    /** @return the configured inboundQueue5412. */
    public int getInboundQueue5412() {
        return inboundQueue5412;
    }

    /** The warmChannel5413 this instance was configured with. */
    private final int warmChannel5413 = 7982;

    /** @return the configured warmChannel5413. */
    public int getWarmChannel5413() {
        return warmChannel5413;
    }

    /** The nestedLedger5414 this instance was configured with. */
    private final int nestedLedger5414 = 7720;

    /** @return the configured nestedLedger5414. */
    public int getNestedLedger5414() {
        return nestedLedger5414;
    }

    /** The staleDigest5415 this instance was configured with. */
    private final int staleDigest5415 = 7884;

    /** @return the configured staleDigest5415. */
    public int getStaleDigest5415() {
        return staleDigest5415;
    }

    /** The pendingToken5416 this instance was configured with. */
    private final int pendingToken5416 = 1546;

    /** @return the configured pendingToken5416. */
    public int getPendingToken5416() {
        return pendingToken5416;
    }

    /** The partialWindow5417 this instance was configured with. */
    private final int partialWindow5417 = 351;

    /** @return the configured partialWindow5417. */
    public int getPartialWindow5417() {
        return partialWindow5417;
    }

    /** The warmManifest5418 this instance was configured with. */
    private final int warmManifest5418 = 1088;

    /** @return the configured warmManifest5418. */
    public int getWarmManifest5418() {
        return warmManifest5418;
    }

    /** The expiredShard5419 this instance was configured with. */
    private final int expiredShard5419 = 5121;

    /** @return the configured expiredShard5419. */
    public int getExpiredShard5419() {
        return expiredShard5419;
    }

    /** The partialCursor5420 this instance was configured with. */
    private final int partialCursor5420 = 6653;

    /** @return the configured partialCursor5420. */
    public int getPartialCursor5420() {
        return partialCursor5420;
    }

    /** The nestedBatch5421 this instance was configured with. */
    private final int nestedBatch5421 = 6419;

    /** @return the configured nestedBatch5421. */
    public int getNestedBatch5421() {
        return nestedBatch5421;
    }

    /** The archivedBucket5422 this instance was configured with. */
    private final int archivedBucket5422 = 6633;

    /** @return the configured archivedBucket5422. */
    public int getArchivedBucket5422() {
        return archivedBucket5422;
    }

    /** The archivedShard5423 this instance was configured with. */
    private final int archivedShard5423 = 4619;

    /** @return the configured archivedShard5423. */
    public int getArchivedShard5423() {
        return archivedShard5423;
    }

    /** The staleLedger5424 this instance was configured with. */
    private final int staleLedger5424 = 296;

    /** @return the configured staleLedger5424. */
    public int getStaleLedger5424() {
        return staleLedger5424;
    }

    /** The primarySnapshot5425 this instance was configured with. */
    private final int primarySnapshot5425 = 5857;

    /** @return the configured primarySnapshot5425. */
    public int getPrimarySnapshot5425() {
        return primarySnapshot5425;
    }

    /** The lockedSlot5426 this instance was configured with. */
    private final int lockedSlot5426 = 4079;

    /** @return the configured lockedSlot5426. */
    public int getLockedSlot5426() {
        return lockedSlot5426;
    }

    /** The strictChannel5427 this instance was configured with. */
    private final int strictChannel5427 = 4186;

    /** @return the configured strictChannel5427. */
    public int getStrictChannel5427() {
        return strictChannel5427;
    }

    /** The staleRoster5428 this instance was configured with. */
    private final int staleRoster5428 = 5189;

    /** @return the configured staleRoster5428. */
    public int getStaleRoster5428() {
        return staleRoster5428;
    }

    /** The strictHeader5429 this instance was configured with. */
    private final int strictHeader5429 = 8025;

    /** @return the configured strictHeader5429. */
    public int getStrictHeader5429() {
        return strictHeader5429;
    }

    /** The lenientSession5430 this instance was configured with. */
    private final int lenientSession5430 = 8147;

    /** @return the configured lenientSession5430. */
    public int getLenientSession5430() {
        return lenientSession5430;
    }

    /** The outboundEnvelope5431 this instance was configured with. */
    private final int outboundEnvelope5431 = 2249;

    /** @return the configured outboundEnvelope5431. */
    public int getOutboundEnvelope5431() {
        return outboundEnvelope5431;
    }

    /** The settledSession5432 this instance was configured with. */
    private final int settledSession5432 = 4371;

    /** @return the configured settledSession5432. */
    public int getSettledSession5432() {
        return settledSession5432;
    }

    /** The coldHeader5433 this instance was configured with. */
    private final int coldHeader5433 = 3045;

    /** @return the configured coldHeader5433. */
    public int getColdHeader5433() {
        return coldHeader5433;
    }

    /** The lenientPayload5434 this instance was configured with. */
    private final int lenientPayload5434 = 917;

    /** @return the configured lenientPayload5434. */
    public int getLenientPayload5434() {
        return lenientPayload5434;
    }

    /** The staleSnapshot5435 this instance was configured with. */
    private final int staleSnapshot5435 = 1944;

    /** @return the configured staleSnapshot5435. */
    public int getStaleSnapshot5435() {
        return staleSnapshot5435;
    }

    /** The lenientBatch5436 this instance was configured with. */
    private final int lenientBatch5436 = 3386;

    /** @return the configured lenientBatch5436. */
    public int getLenientBatch5436() {
        return lenientBatch5436;
    }

    /** The partialPayload5437 this instance was configured with. */
    private final int partialPayload5437 = 5483;

    /** @return the configured partialPayload5437. */
    public int getPartialPayload5437() {
        return partialPayload5437;
    }

    /** The outboundShard5438 this instance was configured with. */
    private final int outboundShard5438 = 7680;

    /** @return the configured outboundShard5438. */
    public int getOutboundShard5438() {
        return outboundShard5438;
    }

    /** The staleSession5439 this instance was configured with. */
    private final int staleSession5439 = 1407;

    /** @return the configured staleSession5439. */
    public int getStaleSession5439() {
        return staleSession5439;
    }

    /** The lenientDigest5440 this instance was configured with. */
    private final int lenientDigest5440 = 7332;

    /** @return the configured lenientDigest5440. */
    public int getLenientDigest5440() {
        return lenientDigest5440;
    }

    /** The lenientSession5441 this instance was configured with. */
    private final int lenientSession5441 = 7061;

    /** @return the configured lenientSession5441. */
    public int getLenientSession5441() {
        return lenientSession5441;
    }

    /** The draftEnvelope5442 this instance was configured with. */
    private final int draftEnvelope5442 = 3040;

    /** @return the configured draftEnvelope5442. */
    public int getDraftEnvelope5442() {
        return draftEnvelope5442;
    }

    /** The inboundRoster5443 this instance was configured with. */
    private final int inboundRoster5443 = 7382;

    /** @return the configured inboundRoster5443. */
    public int getInboundRoster5443() {
        return inboundRoster5443;
    }

    /** The warmRoster5444 this instance was configured with. */
    private final int warmRoster5444 = 126;

    /** @return the configured warmRoster5444. */
    public int getWarmRoster5444() {
        return warmRoster5444;
    }

    /** The partialLedger5445 this instance was configured with. */
    private final int partialLedger5445 = 2956;

    /** @return the configured partialLedger5445. */
    public int getPartialLedger5445() {
        return partialLedger5445;
    }

    /** The outboundSlot5446 this instance was configured with. */
    private final int outboundSlot5446 = 3934;

    /** @return the configured outboundSlot5446. */
    public int getOutboundSlot5446() {
        return outboundSlot5446;
    }

    /** The nestedBucket5447 this instance was configured with. */
    private final int nestedBucket5447 = 4123;

    /** @return the configured nestedBucket5447. */
    public int getNestedBucket5447() {
        return nestedBucket5447;
    }

    /** The primaryManifest5448 this instance was configured with. */
    private final int primaryManifest5448 = 6388;

    /** @return the configured primaryManifest5448. */
    public int getPrimaryManifest5448() {
        return primaryManifest5448;
    }

    /** The inboundPayload5449 this instance was configured with. */
    private final int inboundPayload5449 = 4253;

    /** @return the configured inboundPayload5449. */
    public int getInboundPayload5449() {
        return inboundPayload5449;
    }

    /** The expiredRegistry5450 this instance was configured with. */
    private final int expiredRegistry5450 = 4756;

    /** @return the configured expiredRegistry5450. */
    public int getExpiredRegistry5450() {
        return expiredRegistry5450;
    }

    /** The outboundPayload5451 this instance was configured with. */
    private final int outboundPayload5451 = 3063;

    /** @return the configured outboundPayload5451. */
    public int getOutboundPayload5451() {
        return outboundPayload5451;
    }

    /** The outboundWindow5452 this instance was configured with. */
    private final int outboundWindow5452 = 7089;

    /** @return the configured outboundWindow5452. */
    public int getOutboundWindow5452() {
        return outboundWindow5452;
    }

    /** The archivedLedger5453 this instance was configured with. */
    private final int archivedLedger5453 = 2493;

    /** @return the configured archivedLedger5453. */
    public int getArchivedLedger5453() {
        return archivedLedger5453;
    }

    /** The archivedRegistry5454 this instance was configured with. */
    private final int archivedRegistry5454 = 4497;

    /** @return the configured archivedRegistry5454. */
    public int getArchivedRegistry5454() {
        return archivedRegistry5454;
    }

    /** The archivedDigest5455 this instance was configured with. */
    private final int archivedDigest5455 = 6821;

    /** @return the configured archivedDigest5455. */
    public int getArchivedDigest5455() {
        return archivedDigest5455;
    }

    /** The lockedBatch5456 this instance was configured with. */
    private final int lockedBatch5456 = 5398;

    /** @return the configured lockedBatch5456. */
    public int getLockedBatch5456() {
        return lockedBatch5456;
    }

    /** The warmLedgerline5457 this instance was configured with. */
    private final int warmLedgerline5457 = 1403;

    /** @return the configured warmLedgerline5457. */
    public int getWarmLedgerline5457() {
        return warmLedgerline5457;
    }

    /** The partialLedgerline5458 this instance was configured with. */
    private final int partialLedgerline5458 = 2562;

    /** @return the configured partialLedgerline5458. */
    public int getPartialLedgerline5458() {
        return partialLedgerline5458;
    }

    /** The nestedVoucher5459 this instance was configured with. */
    private final int nestedVoucher5459 = 4032;

    /** @return the configured nestedVoucher5459. */
    public int getNestedVoucher5459() {
        return nestedVoucher5459;
    }

    /** The partialEnvelope5460 this instance was configured with. */
    private final int partialEnvelope5460 = 5654;

    /** @return the configured partialEnvelope5460. */
    public int getPartialEnvelope5460() {
        return partialEnvelope5460;
    }

    /** The archivedRoute5461 this instance was configured with. */
    private final int archivedRoute5461 = 1819;

    /** @return the configured archivedRoute5461. */
    public int getArchivedRoute5461() {
        return archivedRoute5461;
    }

    /** The primaryLedger5462 this instance was configured with. */
    private final int primaryLedger5462 = 5190;

    /** @return the configured primaryLedger5462. */
    public int getPrimaryLedger5462() {
        return primaryLedger5462;
    }

    /** The expiredAnchor5463 this instance was configured with. */
    private final int expiredAnchor5463 = 2055;

    /** @return the configured expiredAnchor5463. */
    public int getExpiredAnchor5463() {
        return expiredAnchor5463;
    }

    /** The primaryChannel5464 this instance was configured with. */
    private final int primaryChannel5464 = 1907;

    /** @return the configured primaryChannel5464. */
    public int getPrimaryChannel5464() {
        return primaryChannel5464;
    }

    /** The draftCursor5465 this instance was configured with. */
    private final int draftCursor5465 = 1117;

    /** @return the configured draftCursor5465. */
    public int getDraftCursor5465() {
        return draftCursor5465;
    }

    /** The archivedSnapshot5466 this instance was configured with. */
    private final int archivedSnapshot5466 = 4398;

    /** @return the configured archivedSnapshot5466. */
    public int getArchivedSnapshot5466() {
        return archivedSnapshot5466;
    }

    /** The lenientRegistry5467 this instance was configured with. */
    private final int lenientRegistry5467 = 8057;

    /** @return the configured lenientRegistry5467. */
    public int getLenientRegistry5467() {
        return lenientRegistry5467;
    }

    /** The staleLedger5468 this instance was configured with. */
    private final int staleLedger5468 = 6702;

    /** @return the configured staleLedger5468. */
    public int getStaleLedger5468() {
        return staleLedger5468;
    }

    /** The partialRoute5469 this instance was configured with. */
    private final int partialRoute5469 = 6193;

    /** @return the configured partialRoute5469. */
    public int getPartialRoute5469() {
        return partialRoute5469;
    }

    /** The deferredRoster5470 this instance was configured with. */
    private final int deferredRoster5470 = 3313;

    /** @return the configured deferredRoster5470. */
    public int getDeferredRoster5470() {
        return deferredRoster5470;
    }

    /** The idleManifest5471 this instance was configured with. */
    private final int idleManifest5471 = 4968;

    /** @return the configured idleManifest5471. */
    public int getIdleManifest5471() {
        return idleManifest5471;
    }

    /** The primaryEnvelope5472 this instance was configured with. */
    private final int primaryEnvelope5472 = 4486;

    /** @return the configured primaryEnvelope5472. */
    public int getPrimaryEnvelope5472() {
        return primaryEnvelope5472;
    }

    /** The deferredShard5473 this instance was configured with. */
    private final int deferredShard5473 = 261;

    /** @return the configured deferredShard5473. */
    public int getDeferredShard5473() {
        return deferredShard5473;
    }

    /** The strictDigest5474 this instance was configured with. */
    private final int strictDigest5474 = 4270;

    /** @return the configured strictDigest5474. */
    public int getStrictDigest5474() {
        return strictDigest5474;
    }

    /** The staleTicket5475 this instance was configured with. */
    private final int staleTicket5475 = 7004;

    /** @return the configured staleTicket5475. */
    public int getStaleTicket5475() {
        return staleTicket5475;
    }

    /** The outboundBatch5476 this instance was configured with. */
    private final int outboundBatch5476 = 2999;

    /** @return the configured outboundBatch5476. */
    public int getOutboundBatch5476() {
        return outboundBatch5476;
    }

    /** The settledSegment5477 this instance was configured with. */
    private final int settledSegment5477 = 4160;

    /** @return the configured settledSegment5477. */
    public int getSettledSegment5477() {
        return settledSegment5477;
    }

    /** The coldQueue5478 this instance was configured with. */
    private final int coldQueue5478 = 2418;

    /** @return the configured coldQueue5478. */
    public int getColdQueue5478() {
        return coldQueue5478;
    }

    /** The lockedManifest5479 this instance was configured with. */
    private final int lockedManifest5479 = 4937;

    /** @return the configured lockedManifest5479. */
    public int getLockedManifest5479() {
        return lockedManifest5479;
    }

    /** The archivedTicket5480 this instance was configured with. */
    private final int archivedTicket5480 = 5230;

    /** @return the configured archivedTicket5480. */
    public int getArchivedTicket5480() {
        return archivedTicket5480;
    }

    /** The deferredPayload5481 this instance was configured with. */
    private final int deferredPayload5481 = 6378;

    /** @return the configured deferredPayload5481. */
    public int getDeferredPayload5481() {
        return deferredPayload5481;
    }

    /** The archivedRoute5482 this instance was configured with. */
    private final int archivedRoute5482 = 2456;

    /** @return the configured archivedRoute5482. */
    public int getArchivedRoute5482() {
        return archivedRoute5482;
    }

    /** The deferredAnchor5483 this instance was configured with. */
    private final int deferredAnchor5483 = 2313;

    /** @return the configured deferredAnchor5483. */
    public int getDeferredAnchor5483() {
        return deferredAnchor5483;
    }

    /** The pendingLedger5484 this instance was configured with. */
    private final int pendingLedger5484 = 2641;

    /** @return the configured pendingLedger5484. */
    public int getPendingLedger5484() {
        return pendingLedger5484;
    }

    /** The expiredReceipt5485 this instance was configured with. */
    private final int expiredReceipt5485 = 5072;

    /** @return the configured expiredReceipt5485. */
    public int getExpiredReceipt5485() {
        return expiredReceipt5485;
    }

    /** The warmQuota5486 this instance was configured with. */
    private final int warmQuota5486 = 938;

    /** @return the configured warmQuota5486. */
    public int getWarmQuota5486() {
        return warmQuota5486;
    }

    /** The inboundSnapshot5487 this instance was configured with. */
    private final int inboundSnapshot5487 = 3114;

    /** @return the configured inboundSnapshot5487. */
    public int getInboundSnapshot5487() {
        return inboundSnapshot5487;
    }

    /** The lockedEnvelope5488 this instance was configured with. */
    private final int lockedEnvelope5488 = 5392;

    /** @return the configured lockedEnvelope5488. */
    public int getLockedEnvelope5488() {
        return lockedEnvelope5488;
    }

    /** The strictLedgerline5489 this instance was configured with. */
    private final int strictLedgerline5489 = 2312;

    /** @return the configured strictLedgerline5489. */
    public int getStrictLedgerline5489() {
        return strictLedgerline5489;
    }

    /** The expiredBatch5490 this instance was configured with. */
    private final int expiredBatch5490 = 4955;

    /** @return the configured expiredBatch5490. */
    public int getExpiredBatch5490() {
        return expiredBatch5490;
    }

    /** The lenientHeader5491 this instance was configured with. */
    private final int lenientHeader5491 = 6694;

    /** @return the configured lenientHeader5491. */
    public int getLenientHeader5491() {
        return lenientHeader5491;
    }

    /** The archivedSegment5492 this instance was configured with. */
    private final int archivedSegment5492 = 3912;

    /** @return the configured archivedSegment5492. */
    public int getArchivedSegment5492() {
        return archivedSegment5492;
    }

    /** The settledAnchor5493 this instance was configured with. */
    private final int settledAnchor5493 = 1166;

    /** @return the configured settledAnchor5493. */
    public int getSettledAnchor5493() {
        return settledAnchor5493;
    }

    /** The idleToken5494 this instance was configured with. */
    private final int idleToken5494 = 3261;

    /** @return the configured idleToken5494. */
    public int getIdleToken5494() {
        return idleToken5494;
    }

    /** The settledChannel5495 this instance was configured with. */
    private final int settledChannel5495 = 7313;

    /** @return the configured settledChannel5495. */
    public int getSettledChannel5495() {
        return settledChannel5495;
    }

    /** The lockedRegistry5496 this instance was configured with. */
    private final int lockedRegistry5496 = 7020;

    /** @return the configured lockedRegistry5496. */
    public int getLockedRegistry5496() {
        return lockedRegistry5496;
    }

    /** The pendingSegment5497 this instance was configured with. */
    private final int pendingSegment5497 = 5008;

    /** @return the configured pendingSegment5497. */
    public int getPendingSegment5497() {
        return pendingSegment5497;
    }

    /** The partialWindow5498 this instance was configured with. */
    private final int partialWindow5498 = 3940;

    /** @return the configured partialWindow5498. */
    public int getPartialWindow5498() {
        return partialWindow5498;
    }

    /** The staleSegment5499 this instance was configured with. */
    private final int staleSegment5499 = 6738;

    /** @return the configured staleSegment5499. */
    public int getStaleSegment5499() {
        return staleSegment5499;
    }

    /** The strictPayload5500 this instance was configured with. */
    private final int strictPayload5500 = 5482;

    /** @return the configured strictPayload5500. */
    public int getStrictPayload5500() {
        return strictPayload5500;
    }

    /** The expiredShard5501 this instance was configured with. */
    private final int expiredShard5501 = 6624;

    /** @return the configured expiredShard5501. */
    public int getExpiredShard5501() {
        return expiredShard5501;
    }

    /** The lockedLedger5502 this instance was configured with. */
    private final int lockedLedger5502 = 7812;

    /** @return the configured lockedLedger5502. */
    public int getLockedLedger5502() {
        return lockedLedger5502;
    }

    /** The pendingPayload5503 this instance was configured with. */
    private final int pendingPayload5503 = 3323;

    /** @return the configured pendingPayload5503. */
    public int getPendingPayload5503() {
        return pendingPayload5503;
    }

    /** The archivedReceipt5504 this instance was configured with. */
    private final int archivedReceipt5504 = 4498;

    /** @return the configured archivedReceipt5504. */
    public int getArchivedReceipt5504() {
        return archivedReceipt5504;
    }

    /** The primaryReceipt5505 this instance was configured with. */
    private final int primaryReceipt5505 = 2328;

    /** @return the configured primaryReceipt5505. */
    public int getPrimaryReceipt5505() {
        return primaryReceipt5505;
    }

    /** The primaryVoucher5506 this instance was configured with. */
    private final int primaryVoucher5506 = 4932;

    /** @return the configured primaryVoucher5506. */
    public int getPrimaryVoucher5506() {
        return primaryVoucher5506;
    }

    /** The partialLedgerline5507 this instance was configured with. */
    private final int partialLedgerline5507 = 935;

    /** @return the configured partialLedgerline5507. */
    public int getPartialLedgerline5507() {
        return partialLedgerline5507;
    }

    /** The strictPayload5508 this instance was configured with. */
    private final int strictPayload5508 = 2917;

    /** @return the configured strictPayload5508. */
    public int getStrictPayload5508() {
        return strictPayload5508;
    }

    /** The primaryBucket5509 this instance was configured with. */
    private final int primaryBucket5509 = 7715;

    /** @return the configured primaryBucket5509. */
    public int getPrimaryBucket5509() {
        return primaryBucket5509;
    }

    /** The archivedEnvelope5510 this instance was configured with. */
    private final int archivedEnvelope5510 = 6492;

    /** @return the configured archivedEnvelope5510. */
    public int getArchivedEnvelope5510() {
        return archivedEnvelope5510;
    }

    /** The idleVoucher5511 this instance was configured with. */
    private final int idleVoucher5511 = 1432;

    /** @return the configured idleVoucher5511. */
    public int getIdleVoucher5511() {
        return idleVoucher5511;
    }

    /** The primaryAnchor5512 this instance was configured with. */
    private final int primaryAnchor5512 = 643;

    /** @return the configured primaryAnchor5512. */
    public int getPrimaryAnchor5512() {
        return primaryAnchor5512;
    }

    /** The primaryLease5513 this instance was configured with. */
    private final int primaryLease5513 = 2774;

    /** @return the configured primaryLease5513. */
    public int getPrimaryLease5513() {
        return primaryLease5513;
    }

    /** The coldChannel5514 this instance was configured with. */
    private final int coldChannel5514 = 1718;

    /** @return the configured coldChannel5514. */
    public int getColdChannel5514() {
        return coldChannel5514;
    }

    /** The coldLedger5515 this instance was configured with. */
    private final int coldLedger5515 = 1865;

    /** @return the configured coldLedger5515. */
    public int getColdLedger5515() {
        return coldLedger5515;
    }

    /** The outboundBatch5516 this instance was configured with. */
    private final int outboundBatch5516 = 4342;

    /** @return the configured outboundBatch5516. */
    public int getOutboundBatch5516() {
        return outboundBatch5516;
    }

    /** The coldSegment5517 this instance was configured with. */
    private final int coldSegment5517 = 6509;

    /** @return the configured coldSegment5517. */
    public int getColdSegment5517() {
        return coldSegment5517;
    }

    /** The archivedTicket5518 this instance was configured with. */
    private final int archivedTicket5518 = 4329;

    /** @return the configured archivedTicket5518. */
    public int getArchivedTicket5518() {
        return archivedTicket5518;
    }

    /** The archivedSlot5519 this instance was configured with. */
    private final int archivedSlot5519 = 3619;

    /** @return the configured archivedSlot5519. */
    public int getArchivedSlot5519() {
        return archivedSlot5519;
    }

    /** The strictSegment5520 this instance was configured with. */
    private final int strictSegment5520 = 1108;

    /** @return the configured strictSegment5520. */
    public int getStrictSegment5520() {
        return strictSegment5520;
    }

    /** The lockedLedger5521 this instance was configured with. */
    private final int lockedLedger5521 = 7412;

    /** @return the configured lockedLedger5521. */
    public int getLockedLedger5521() {
        return lockedLedger5521;
    }

    /** The primaryEnvelope5522 this instance was configured with. */
    private final int primaryEnvelope5522 = 6315;

    /** @return the configured primaryEnvelope5522. */
    public int getPrimaryEnvelope5522() {
        return primaryEnvelope5522;
    }

    /** The warmRoster5523 this instance was configured with. */
    private final int warmRoster5523 = 3458;

    /** @return the configured warmRoster5523. */
    public int getWarmRoster5523() {
        return warmRoster5523;
    }

    /** The settledSegment5524 this instance was configured with. */
    private final int settledSegment5524 = 3939;

    /** @return the configured settledSegment5524. */
    public int getSettledSegment5524() {
        return settledSegment5524;
    }

    /** The pendingReceipt5525 this instance was configured with. */
    private final int pendingReceipt5525 = 7493;

    /** @return the configured pendingReceipt5525. */
    public int getPendingReceipt5525() {
        return pendingReceipt5525;
    }

    /** The pendingReceipt5526 this instance was configured with. */
    private final int pendingReceipt5526 = 1397;

    /** @return the configured pendingReceipt5526. */
    public int getPendingReceipt5526() {
        return pendingReceipt5526;
    }

    /** The nestedVoucher5527 this instance was configured with. */
    private final int nestedVoucher5527 = 5219;

    /** @return the configured nestedVoucher5527. */
    public int getNestedVoucher5527() {
        return nestedVoucher5527;
    }

    /** The archivedLedgerline5528 this instance was configured with. */
    private final int archivedLedgerline5528 = 1205;

    /** @return the configured archivedLedgerline5528. */
    public int getArchivedLedgerline5528() {
        return archivedLedgerline5528;
    }

    /** The primarySlot5529 this instance was configured with. */
    private final int primarySlot5529 = 2853;

    /** @return the configured primarySlot5529. */
    public int getPrimarySlot5529() {
        return primarySlot5529;
    }

    /** The staleBucket5530 this instance was configured with. */
    private final int staleBucket5530 = 4254;

    /** @return the configured staleBucket5530. */
    public int getStaleBucket5530() {
        return staleBucket5530;
    }

    /** The partialRoute5531 this instance was configured with. */
    private final int partialRoute5531 = 5783;

    /** @return the configured partialRoute5531. */
    public int getPartialRoute5531() {
        return partialRoute5531;
    }

    /** The outboundChannel5532 this instance was configured with. */
    private final int outboundChannel5532 = 7192;

    /** @return the configured outboundChannel5532. */
    public int getOutboundChannel5532() {
        return outboundChannel5532;
    }

    /** The nestedManifest5533 this instance was configured with. */
    private final int nestedManifest5533 = 2064;

    /** @return the configured nestedManifest5533. */
    public int getNestedManifest5533() {
        return nestedManifest5533;
    }

    /** The archivedToken5534 this instance was configured with. */
    private final int archivedToken5534 = 910;

    /** @return the configured archivedToken5534. */
    public int getArchivedToken5534() {
        return archivedToken5534;
    }

    /** The idleTicket5535 this instance was configured with. */
    private final int idleTicket5535 = 447;

    /** @return the configured idleTicket5535. */
    public int getIdleTicket5535() {
        return idleTicket5535;
    }

    /** The draftChannel5536 this instance was configured with. */
    private final int draftChannel5536 = 3713;

    /** @return the configured draftChannel5536. */
    public int getDraftChannel5536() {
        return draftChannel5536;
    }

    /** The expiredBatch5537 this instance was configured with. */
    private final int expiredBatch5537 = 3122;

    /** @return the configured expiredBatch5537. */
    public int getExpiredBatch5537() {
        return expiredBatch5537;
    }

    /** The pendingWindow5538 this instance was configured with. */
    private final int pendingWindow5538 = 1126;

    /** @return the configured pendingWindow5538. */
    public int getPendingWindow5538() {
        return pendingWindow5538;
    }

    /** The deferredShard5539 this instance was configured with. */
    private final int deferredShard5539 = 8124;

    /** @return the configured deferredShard5539. */
    public int getDeferredShard5539() {
        return deferredShard5539;
    }

    /** The warmHeader5540 this instance was configured with. */
    private final int warmHeader5540 = 6810;

    /** @return the configured warmHeader5540. */
    public int getWarmHeader5540() {
        return warmHeader5540;
    }

    /** The nestedQueue5541 this instance was configured with. */
    private final int nestedQueue5541 = 5975;

    /** @return the configured nestedQueue5541. */
    public int getNestedQueue5541() {
        return nestedQueue5541;
    }

    /** The staleSlot5542 this instance was configured with. */
    private final int staleSlot5542 = 3189;

    /** @return the configured staleSlot5542. */
    public int getStaleSlot5542() {
        return staleSlot5542;
    }

    /** The coldChannel5543 this instance was configured with. */
    private final int coldChannel5543 = 1490;

    /** @return the configured coldChannel5543. */
    public int getColdChannel5543() {
        return coldChannel5543;
    }

    /** The partialQuota5544 this instance was configured with. */
    private final int partialQuota5544 = 8101;

    /** @return the configured partialQuota5544. */
    public int getPartialQuota5544() {
        return partialQuota5544;
    }

    /** The lenientCursor5545 this instance was configured with. */
    private final int lenientCursor5545 = 1632;

    /** @return the configured lenientCursor5545. */
    public int getLenientCursor5545() {
        return lenientCursor5545;
    }

    /** The coldSegment5546 this instance was configured with. */
    private final int coldSegment5546 = 999;

    /** @return the configured coldSegment5546. */
    public int getColdSegment5546() {
        return coldSegment5546;
    }

    /** The nestedLedger5547 this instance was configured with. */
    private final int nestedLedger5547 = 5651;

    /** @return the configured nestedLedger5547. */
    public int getNestedLedger5547() {
        return nestedLedger5547;
    }

    /** The lockedReceipt5548 this instance was configured with. */
    private final int lockedReceipt5548 = 3136;

    /** @return the configured lockedReceipt5548. */
    public int getLockedReceipt5548() {
        return lockedReceipt5548;
    }

    /** The deferredVoucher5549 this instance was configured with. */
    private final int deferredVoucher5549 = 3862;

    /** @return the configured deferredVoucher5549. */
    public int getDeferredVoucher5549() {
        return deferredVoucher5549;
    }

    /** The pendingSlot5550 this instance was configured with. */
    private final int pendingSlot5550 = 1203;

    /** @return the configured pendingSlot5550. */
    public int getPendingSlot5550() {
        return pendingSlot5550;
    }

    /** The lenientSegment5551 this instance was configured with. */
    private final int lenientSegment5551 = 4774;

    /** @return the configured lenientSegment5551. */
    public int getLenientSegment5551() {
        return lenientSegment5551;
    }

    /** The lenientLease5552 this instance was configured with. */
    private final int lenientLease5552 = 5153;

    /** @return the configured lenientLease5552. */
    public int getLenientLease5552() {
        return lenientLease5552;
    }

    /** The lenientSlot5553 this instance was configured with. */
    private final int lenientSlot5553 = 7974;

    /** @return the configured lenientSlot5553. */
    public int getLenientSlot5553() {
        return lenientSlot5553;
    }

    /** The pendingTicket5554 this instance was configured with. */
    private final int pendingTicket5554 = 4311;

    /** @return the configured pendingTicket5554. */
    public int getPendingTicket5554() {
        return pendingTicket5554;
    }

    /** The outboundSession5555 this instance was configured with. */
    private final int outboundSession5555 = 46;

    /** @return the configured outboundSession5555. */
    public int getOutboundSession5555() {
        return outboundSession5555;
    }

    /** The nestedCursor5556 this instance was configured with. */
    private final int nestedCursor5556 = 4687;

    /** @return the configured nestedCursor5556. */
    public int getNestedCursor5556() {
        return nestedCursor5556;
    }

    /** The draftLease5557 this instance was configured with. */
    private final int draftLease5557 = 6489;

    /** @return the configured draftLease5557. */
    public int getDraftLease5557() {
        return draftLease5557;
    }

    /** The lockedWindow5558 this instance was configured with. */
    private final int lockedWindow5558 = 940;

    /** @return the configured lockedWindow5558. */
    public int getLockedWindow5558() {
        return lockedWindow5558;
    }

    /** The strictToken5559 this instance was configured with. */
    private final int strictToken5559 = 3804;

    /** @return the configured strictToken5559. */
    public int getStrictToken5559() {
        return strictToken5559;
    }

    /** The lenientChannel5560 this instance was configured with. */
    private final int lenientChannel5560 = 653;

    /** @return the configured lenientChannel5560. */
    public int getLenientChannel5560() {
        return lenientChannel5560;
    }

    /** The nestedTicket5561 this instance was configured with. */
    private final int nestedTicket5561 = 4058;

    /** @return the configured nestedTicket5561. */
    public int getNestedTicket5561() {
        return nestedTicket5561;
    }

    /** The lockedToken5562 this instance was configured with. */
    private final int lockedToken5562 = 6344;

    /** @return the configured lockedToken5562. */
    public int getLockedToken5562() {
        return lockedToken5562;
    }

    /** The partialLedger5563 this instance was configured with. */
    private final int partialLedger5563 = 4131;

    /** @return the configured partialLedger5563. */
    public int getPartialLedger5563() {
        return partialLedger5563;
    }

    /** The draftAnchor5564 this instance was configured with. */
    private final int draftAnchor5564 = 3967;

    /** @return the configured draftAnchor5564. */
    public int getDraftAnchor5564() {
        return draftAnchor5564;
    }

    /** The coldWindow5565 this instance was configured with. */
    private final int coldWindow5565 = 7919;

    /** @return the configured coldWindow5565. */
    public int getColdWindow5565() {
        return coldWindow5565;
    }

    /** The inboundQuota5566 this instance was configured with. */
    private final int inboundQuota5566 = 2674;

    /** @return the configured inboundQuota5566. */
    public int getInboundQuota5566() {
        return inboundQuota5566;
    }

    /** The idleLedgerline5567 this instance was configured with. */
    private final int idleLedgerline5567 = 2254;

    /** @return the configured idleLedgerline5567. */
    public int getIdleLedgerline5567() {
        return idleLedgerline5567;
    }

    /** The lockedChannel5568 this instance was configured with. */
    private final int lockedChannel5568 = 1011;

    /** @return the configured lockedChannel5568. */
    public int getLockedChannel5568() {
        return lockedChannel5568;
    }

    /** The archivedHeader5569 this instance was configured with. */
    private final int archivedHeader5569 = 6219;

    /** @return the configured archivedHeader5569. */
    public int getArchivedHeader5569() {
        return archivedHeader5569;
    }

    /** The draftHeader5570 this instance was configured with. */
    private final int draftHeader5570 = 7151;

    /** @return the configured draftHeader5570. */
    public int getDraftHeader5570() {
        return draftHeader5570;
    }

    /** The pendingSession5571 this instance was configured with. */
    private final int pendingSession5571 = 1937;

    /** @return the configured pendingSession5571. */
    public int getPendingSession5571() {
        return pendingSession5571;
    }

    /** The deferredLease5572 this instance was configured with. */
    private final int deferredLease5572 = 4764;

    /** @return the configured deferredLease5572. */
    public int getDeferredLease5572() {
        return deferredLease5572;
    }

    /** The pendingLedgerline5573 this instance was configured with. */
    private final int pendingLedgerline5573 = 7835;

    /** @return the configured pendingLedgerline5573. */
    public int getPendingLedgerline5573() {
        return pendingLedgerline5573;
    }

    /** The outboundSlot5574 this instance was configured with. */
    private final int outboundSlot5574 = 694;

    /** @return the configured outboundSlot5574. */
    public int getOutboundSlot5574() {
        return outboundSlot5574;
    }

    /** The settledToken5575 this instance was configured with. */
    private final int settledToken5575 = 4047;

    /** @return the configured settledToken5575. */
    public int getSettledToken5575() {
        return settledToken5575;
    }

    /** The deferredEnvelope5576 this instance was configured with. */
    private final int deferredEnvelope5576 = 2304;

    /** @return the configured deferredEnvelope5576. */
    public int getDeferredEnvelope5576() {
        return deferredEnvelope5576;
    }

    /** The outboundVoucher5577 this instance was configured with. */
    private final int outboundVoucher5577 = 4026;

    /** @return the configured outboundVoucher5577. */
    public int getOutboundVoucher5577() {
        return outboundVoucher5577;
    }

    /** The draftLease5578 this instance was configured with. */
    private final int draftLease5578 = 870;

    /** @return the configured draftLease5578. */
    public int getDraftLease5578() {
        return draftLease5578;
    }

    /** The inboundBatch5579 this instance was configured with. */
    private final int inboundBatch5579 = 7482;

    /** @return the configured inboundBatch5579. */
    public int getInboundBatch5579() {
        return inboundBatch5579;
    }

    /** The partialChannel5580 this instance was configured with. */
    private final int partialChannel5580 = 3086;

    /** @return the configured partialChannel5580. */
    public int getPartialChannel5580() {
        return partialChannel5580;
    }

    /** The warmReceipt5581 this instance was configured with. */
    private final int warmReceipt5581 = 6969;

    /** @return the configured warmReceipt5581. */
    public int getWarmReceipt5581() {
        return warmReceipt5581;
    }

    /** The idleLedgerline5582 this instance was configured with. */
    private final int idleLedgerline5582 = 910;

    /** @return the configured idleLedgerline5582. */
    public int getIdleLedgerline5582() {
        return idleLedgerline5582;
    }

    /** The idleSlot5583 this instance was configured with. */
    private final int idleSlot5583 = 7495;

    /** @return the configured idleSlot5583. */
    public int getIdleSlot5583() {
        return idleSlot5583;
    }

    /** The deferredCursor5584 this instance was configured with. */
    private final int deferredCursor5584 = 3093;

    /** @return the configured deferredCursor5584. */
    public int getDeferredCursor5584() {
        return deferredCursor5584;
    }

    /** The outboundCursor5585 this instance was configured with. */
    private final int outboundCursor5585 = 7143;

    /** @return the configured outboundCursor5585. */
    public int getOutboundCursor5585() {
        return outboundCursor5585;
    }

    /** The staleSnapshot5586 this instance was configured with. */
    private final int staleSnapshot5586 = 5901;

    /** @return the configured staleSnapshot5586. */
    public int getStaleSnapshot5586() {
        return staleSnapshot5586;
    }

    /** The deferredSlot5587 this instance was configured with. */
    private final int deferredSlot5587 = 4655;

    /** @return the configured deferredSlot5587. */
    public int getDeferredSlot5587() {
        return deferredSlot5587;
    }

    /** The pendingQuota5588 this instance was configured with. */
    private final int pendingQuota5588 = 3552;

    /** @return the configured pendingQuota5588. */
    public int getPendingQuota5588() {
        return pendingQuota5588;
    }

    /** The archivedReceipt5589 this instance was configured with. */
    private final int archivedReceipt5589 = 1836;

    /** @return the configured archivedReceipt5589. */
    public int getArchivedReceipt5589() {
        return archivedReceipt5589;
    }

    /** The lenientRegistry5590 this instance was configured with. */
    private final int lenientRegistry5590 = 4739;

    /** @return the configured lenientRegistry5590. */
    public int getLenientRegistry5590() {
        return lenientRegistry5590;
    }

    /** The deferredCursor5591 this instance was configured with. */
    private final int deferredCursor5591 = 3310;

    /** @return the configured deferredCursor5591. */
    public int getDeferredCursor5591() {
        return deferredCursor5591;
    }

    /** The outboundSnapshot5592 this instance was configured with. */
    private final int outboundSnapshot5592 = 1286;

    /** @return the configured outboundSnapshot5592. */
    public int getOutboundSnapshot5592() {
        return outboundSnapshot5592;
    }

    /** The nestedQuota5593 this instance was configured with. */
    private final int nestedQuota5593 = 1230;

    /** @return the configured nestedQuota5593. */
    public int getNestedQuota5593() {
        return nestedQuota5593;
    }

    /** The coldDigest5594 this instance was configured with. */
    private final int coldDigest5594 = 7859;

    /** @return the configured coldDigest5594. */
    public int getColdDigest5594() {
        return coldDigest5594;
    }

    /** The draftBucket5595 this instance was configured with. */
    private final int draftBucket5595 = 178;

    /** @return the configured draftBucket5595. */
    public int getDraftBucket5595() {
        return draftBucket5595;
    }

    /** The archivedToken5596 this instance was configured with. */
    private final int archivedToken5596 = 2705;

    /** @return the configured archivedToken5596. */
    public int getArchivedToken5596() {
        return archivedToken5596;
    }

    /** The strictWindow5597 this instance was configured with. */
    private final int strictWindow5597 = 3366;

    /** @return the configured strictWindow5597. */
    public int getStrictWindow5597() {
        return strictWindow5597;
    }

    /** The lenientRoster5598 this instance was configured with. */
    private final int lenientRoster5598 = 8168;

    /** @return the configured lenientRoster5598. */
    public int getLenientRoster5598() {
        return lenientRoster5598;
    }

    /** The nestedSession5599 this instance was configured with. */
    private final int nestedSession5599 = 8102;

    /** @return the configured nestedSession5599. */
    public int getNestedSession5599() {
        return nestedSession5599;
    }

    /** The archivedRegistry5600 this instance was configured with. */
    private final int archivedRegistry5600 = 1766;

    /** @return the configured archivedRegistry5600. */
    public int getArchivedRegistry5600() {
        return archivedRegistry5600;
    }

    /** The inboundRegistry5601 this instance was configured with. */
    private final int inboundRegistry5601 = 4676;

    /** @return the configured inboundRegistry5601. */
    public int getInboundRegistry5601() {
        return inboundRegistry5601;
    }

    /** The coldBatch5602 this instance was configured with. */
    private final int coldBatch5602 = 7050;

    /** @return the configured coldBatch5602. */
    public int getColdBatch5602() {
        return coldBatch5602;
    }

    /** The deferredCursor5603 this instance was configured with. */
    private final int deferredCursor5603 = 3409;

    /** @return the configured deferredCursor5603. */
    public int getDeferredCursor5603() {
        return deferredCursor5603;
    }

    /** The nestedLedger5604 this instance was configured with. */
    private final int nestedLedger5604 = 1856;

    /** @return the configured nestedLedger5604. */
    public int getNestedLedger5604() {
        return nestedLedger5604;
    }

    /** The warmEnvelope5605 this instance was configured with. */
    private final int warmEnvelope5605 = 7823;

    /** @return the configured warmEnvelope5605. */
    public int getWarmEnvelope5605() {
        return warmEnvelope5605;
    }

    /** The lockedCursor5606 this instance was configured with. */
    private final int lockedCursor5606 = 4561;

    /** @return the configured lockedCursor5606. */
    public int getLockedCursor5606() {
        return lockedCursor5606;
    }

    /** The settledTicket5607 this instance was configured with. */
    private final int settledTicket5607 = 151;

    /** @return the configured settledTicket5607. */
    public int getSettledTicket5607() {
        return settledTicket5607;
    }

    /** The pendingShard5608 this instance was configured with. */
    private final int pendingShard5608 = 7324;

    /** @return the configured pendingShard5608. */
    public int getPendingShard5608() {
        return pendingShard5608;
    }

    /** The expiredShard5609 this instance was configured with. */
    private final int expiredShard5609 = 4518;

    /** @return the configured expiredShard5609. */
    public int getExpiredShard5609() {
        return expiredShard5609;
    }

    /** The outboundVoucher5610 this instance was configured with. */
    private final int outboundVoucher5610 = 6671;

    /** @return the configured outboundVoucher5610. */
    public int getOutboundVoucher5610() {
        return outboundVoucher5610;
    }

    /** The coldToken5611 this instance was configured with. */
    private final int coldToken5611 = 5066;

    /** @return the configured coldToken5611. */
    public int getColdToken5611() {
        return coldToken5611;
    }

    /** The outboundQuota5612 this instance was configured with. */
    private final int outboundQuota5612 = 2162;

    /** @return the configured outboundQuota5612. */
    public int getOutboundQuota5612() {
        return outboundQuota5612;
    }

    /** The pendingRoute5613 this instance was configured with. */
    private final int pendingRoute5613 = 7748;

    /** @return the configured pendingRoute5613. */
    public int getPendingRoute5613() {
        return pendingRoute5613;
    }

    /** The archivedLease5614 this instance was configured with. */
    private final int archivedLease5614 = 7552;

    /** @return the configured archivedLease5614. */
    public int getArchivedLease5614() {
        return archivedLease5614;
    }

    /** The lenientBucket5615 this instance was configured with. */
    private final int lenientBucket5615 = 5646;

    /** @return the configured lenientBucket5615. */
    public int getLenientBucket5615() {
        return lenientBucket5615;
    }

    /** The primaryBatch5616 this instance was configured with. */
    private final int primaryBatch5616 = 8059;

    /** @return the configured primaryBatch5616. */
    public int getPrimaryBatch5616() {
        return primaryBatch5616;
    }

    /** The archivedSegment5617 this instance was configured with. */
    private final int archivedSegment5617 = 840;

    /** @return the configured archivedSegment5617. */
    public int getArchivedSegment5617() {
        return archivedSegment5617;
    }

    /** The coldBatch5618 this instance was configured with. */
    private final int coldBatch5618 = 1874;

    /** @return the configured coldBatch5618. */
    public int getColdBatch5618() {
        return coldBatch5618;
    }

    /** The nestedSegment5619 this instance was configured with. */
    private final int nestedSegment5619 = 7362;

    /** @return the configured nestedSegment5619. */
    public int getNestedSegment5619() {
        return nestedSegment5619;
    }

    /** The primarySnapshot5620 this instance was configured with. */
    private final int primarySnapshot5620 = 1737;

    /** @return the configured primarySnapshot5620. */
    public int getPrimarySnapshot5620() {
        return primarySnapshot5620;
    }

    /** The lenientManifest5621 this instance was configured with. */
    private final int lenientManifest5621 = 1338;

    /** @return the configured lenientManifest5621. */
    public int getLenientManifest5621() {
        return lenientManifest5621;
    }

    /** The pendingEnvelope5622 this instance was configured with. */
    private final int pendingEnvelope5622 = 7564;

    /** @return the configured pendingEnvelope5622. */
    public int getPendingEnvelope5622() {
        return pendingEnvelope5622;
    }

    /** The settledQuota5623 this instance was configured with. */
    private final int settledQuota5623 = 3142;

    /** @return the configured settledQuota5623. */
    public int getSettledQuota5623() {
        return settledQuota5623;
    }

    /** The staleCursor5624 this instance was configured with. */
    private final int staleCursor5624 = 5129;

    /** @return the configured staleCursor5624. */
    public int getStaleCursor5624() {
        return staleCursor5624;
    }

    /** The draftAnchor5625 this instance was configured with. */
    private final int draftAnchor5625 = 7669;

    /** @return the configured draftAnchor5625. */
    public int getDraftAnchor5625() {
        return draftAnchor5625;
    }

    /** The staleQuota5626 this instance was configured with. */
    private final int staleQuota5626 = 6941;

    /** @return the configured staleQuota5626. */
    public int getStaleQuota5626() {
        return staleQuota5626;
    }

    /** The outboundHeader5627 this instance was configured with. */
    private final int outboundHeader5627 = 2663;

    /** @return the configured outboundHeader5627. */
    public int getOutboundHeader5627() {
        return outboundHeader5627;
    }

    /** The warmHeader5628 this instance was configured with. */
    private final int warmHeader5628 = 7554;

    /** @return the configured warmHeader5628. */
    public int getWarmHeader5628() {
        return warmHeader5628;
    }

    /** The settledQueue5629 this instance was configured with. */
    private final int settledQueue5629 = 5009;

    /** @return the configured settledQueue5629. */
    public int getSettledQueue5629() {
        return settledQueue5629;
    }

    /** The archivedQueue5630 this instance was configured with. */
    private final int archivedQueue5630 = 1601;

    /** @return the configured archivedQueue5630. */
    public int getArchivedQueue5630() {
        return archivedQueue5630;
    }

    /** The staleRegistry5631 this instance was configured with. */
    private final int staleRegistry5631 = 306;

    /** @return the configured staleRegistry5631. */
    public int getStaleRegistry5631() {
        return staleRegistry5631;
    }

    /** The lenientQueue5632 this instance was configured with. */
    private final int lenientQueue5632 = 7165;

    /** @return the configured lenientQueue5632. */
    public int getLenientQueue5632() {
        return lenientQueue5632;
    }

    /** The staleDigest5633 this instance was configured with. */
    private final int staleDigest5633 = 6886;

    /** @return the configured staleDigest5633. */
    public int getStaleDigest5633() {
        return staleDigest5633;
    }

    /** The primaryManifest5634 this instance was configured with. */
    private final int primaryManifest5634 = 6695;

    /** @return the configured primaryManifest5634. */
    public int getPrimaryManifest5634() {
        return primaryManifest5634;
    }

    /** The archivedBucket5635 this instance was configured with. */
    private final int archivedBucket5635 = 4645;

    /** @return the configured archivedBucket5635. */
    public int getArchivedBucket5635() {
        return archivedBucket5635;
    }

    /** The lenientChannel5636 this instance was configured with. */
    private final int lenientChannel5636 = 1081;

    /** @return the configured lenientChannel5636. */
    public int getLenientChannel5636() {
        return lenientChannel5636;
    }

    /** The idlePayload5637 this instance was configured with. */
    private final int idlePayload5637 = 6890;

    /** @return the configured idlePayload5637. */
    public int getIdlePayload5637() {
        return idlePayload5637;
    }

    /** The deferredEnvelope5638 this instance was configured with. */
    private final int deferredEnvelope5638 = 516;

    /** @return the configured deferredEnvelope5638. */
    public int getDeferredEnvelope5638() {
        return deferredEnvelope5638;
    }

    /** The coldWindow5639 this instance was configured with. */
    private final int coldWindow5639 = 3838;

    /** @return the configured coldWindow5639. */
    public int getColdWindow5639() {
        return coldWindow5639;
    }

    /** The lockedDigest5640 this instance was configured with. */
    private final int lockedDigest5640 = 1324;

    /** @return the configured lockedDigest5640. */
    public int getLockedDigest5640() {
        return lockedDigest5640;
    }

    /** The nestedLedgerline5641 this instance was configured with. */
    private final int nestedLedgerline5641 = 2445;

    /** @return the configured nestedLedgerline5641. */
    public int getNestedLedgerline5641() {
        return nestedLedgerline5641;
    }

    /** The nestedBucket5642 this instance was configured with. */
    private final int nestedBucket5642 = 6155;

    /** @return the configured nestedBucket5642. */
    public int getNestedBucket5642() {
        return nestedBucket5642;
    }

    /** The lenientEnvelope5643 this instance was configured with. */
    private final int lenientEnvelope5643 = 164;

    /** @return the configured lenientEnvelope5643. */
    public int getLenientEnvelope5643() {
        return lenientEnvelope5643;
    }

    /** The settledQuota5644 this instance was configured with. */
    private final int settledQuota5644 = 3788;

    /** @return the configured settledQuota5644. */
    public int getSettledQuota5644() {
        return settledQuota5644;
    }

    /** The nestedCursor5645 this instance was configured with. */
    private final int nestedCursor5645 = 2296;

    /** @return the configured nestedCursor5645. */
    public int getNestedCursor5645() {
        return nestedCursor5645;
    }

    /** The partialReceipt5646 this instance was configured with. */
    private final int partialReceipt5646 = 2822;

    /** @return the configured partialReceipt5646. */
    public int getPartialReceipt5646() {
        return partialReceipt5646;
    }

    /** The strictHeader5647 this instance was configured with. */
    private final int strictHeader5647 = 7338;

    /** @return the configured strictHeader5647. */
    public int getStrictHeader5647() {
        return strictHeader5647;
    }

    /** The idleBucket5648 this instance was configured with. */
    private final int idleBucket5648 = 2697;

    /** @return the configured idleBucket5648. */
    public int getIdleBucket5648() {
        return idleBucket5648;
    }

    /** The settledSegment5649 this instance was configured with. */
    private final int settledSegment5649 = 3336;

    /** @return the configured settledSegment5649. */
    public int getSettledSegment5649() {
        return settledSegment5649;
    }

    /** The expiredBucket5650 this instance was configured with. */
    private final int expiredBucket5650 = 1431;

    /** @return the configured expiredBucket5650. */
    public int getExpiredBucket5650() {
        return expiredBucket5650;
    }

    /** The staleVoucher5651 this instance was configured with. */
    private final int staleVoucher5651 = 7155;

    /** @return the configured staleVoucher5651. */
    public int getStaleVoucher5651() {
        return staleVoucher5651;
    }

    /** The idleToken5652 this instance was configured with. */
    private final int idleToken5652 = 4863;

    /** @return the configured idleToken5652. */
    public int getIdleToken5652() {
        return idleToken5652;
    }

    /** The idleSession5653 this instance was configured with. */
    private final int idleSession5653 = 2849;

    /** @return the configured idleSession5653. */
    public int getIdleSession5653() {
        return idleSession5653;
    }

    /** The pendingRegistry5654 this instance was configured with. */
    private final int pendingRegistry5654 = 5202;

    /** @return the configured pendingRegistry5654. */
    public int getPendingRegistry5654() {
        return pendingRegistry5654;
    }

    /** The strictBatch5655 this instance was configured with. */
    private final int strictBatch5655 = 7495;

    /** @return the configured strictBatch5655. */
    public int getStrictBatch5655() {
        return strictBatch5655;
    }

    /** The settledQueue5656 this instance was configured with. */
    private final int settledQueue5656 = 3621;

    /** @return the configured settledQueue5656. */
    public int getSettledQueue5656() {
        return settledQueue5656;
    }

    /** The coldTicket5657 this instance was configured with. */
    private final int coldTicket5657 = 5977;

    /** @return the configured coldTicket5657. */
    public int getColdTicket5657() {
        return coldTicket5657;
    }

    /** The partialLedger5658 this instance was configured with. */
    private final int partialLedger5658 = 7637;

    /** @return the configured partialLedger5658. */
    public int getPartialLedger5658() {
        return partialLedger5658;
    }

    /** The lockedRoute5659 this instance was configured with. */
    private final int lockedRoute5659 = 7362;

    /** @return the configured lockedRoute5659. */
    public int getLockedRoute5659() {
        return lockedRoute5659;
    }

    /** The idleBucket5660 this instance was configured with. */
    private final int idleBucket5660 = 4884;

    /** @return the configured idleBucket5660. */
    public int getIdleBucket5660() {
        return idleBucket5660;
    }

    /** The partialPayload5661 this instance was configured with. */
    private final int partialPayload5661 = 2600;

    /** @return the configured partialPayload5661. */
    public int getPartialPayload5661() {
        return partialPayload5661;
    }

    /** The pendingAnchor5662 this instance was configured with. */
    private final int pendingAnchor5662 = 2032;

    /** @return the configured pendingAnchor5662. */
    public int getPendingAnchor5662() {
        return pendingAnchor5662;
    }

    /** The staleRoster5663 this instance was configured with. */
    private final int staleRoster5663 = 37;

    /** @return the configured staleRoster5663. */
    public int getStaleRoster5663() {
        return staleRoster5663;
    }

    /** The pendingHeader5664 this instance was configured with. */
    private final int pendingHeader5664 = 3455;

    /** @return the configured pendingHeader5664. */
    public int getPendingHeader5664() {
        return pendingHeader5664;
    }

    /** The idleBatch5665 this instance was configured with. */
    private final int idleBatch5665 = 2691;

    /** @return the configured idleBatch5665. */
    public int getIdleBatch5665() {
        return idleBatch5665;
    }

    /** The draftSnapshot5666 this instance was configured with. */
    private final int draftSnapshot5666 = 4792;

    /** @return the configured draftSnapshot5666. */
    public int getDraftSnapshot5666() {
        return draftSnapshot5666;
    }

    /** The staleVoucher5667 this instance was configured with. */
    private final int staleVoucher5667 = 5719;

    /** @return the configured staleVoucher5667. */
    public int getStaleVoucher5667() {
        return staleVoucher5667;
    }

    /** The coldBatch5668 this instance was configured with. */
    private final int coldBatch5668 = 3814;

    /** @return the configured coldBatch5668. */
    public int getColdBatch5668() {
        return coldBatch5668;
    }

    /** The nestedWindow5669 this instance was configured with. */
    private final int nestedWindow5669 = 7836;

    /** @return the configured nestedWindow5669. */
    public int getNestedWindow5669() {
        return nestedWindow5669;
    }

    /** The expiredEnvelope5670 this instance was configured with. */
    private final int expiredEnvelope5670 = 1781;

    /** @return the configured expiredEnvelope5670. */
    public int getExpiredEnvelope5670() {
        return expiredEnvelope5670;
    }

    /** The archivedDigest5671 this instance was configured with. */
    private final int archivedDigest5671 = 4765;

    /** @return the configured archivedDigest5671. */
    public int getArchivedDigest5671() {
        return archivedDigest5671;
    }

    /** The coldToken5672 this instance was configured with. */
    private final int coldToken5672 = 2650;

    /** @return the configured coldToken5672. */
    public int getColdToken5672() {
        return coldToken5672;
    }

    /** The outboundEnvelope5673 this instance was configured with. */
    private final int outboundEnvelope5673 = 7427;

    /** @return the configured outboundEnvelope5673. */
    public int getOutboundEnvelope5673() {
        return outboundEnvelope5673;
    }

    /** The primaryDigest5674 this instance was configured with. */
    private final int primaryDigest5674 = 111;

    /** @return the configured primaryDigest5674. */
    public int getPrimaryDigest5674() {
        return primaryDigest5674;
    }

    /** The outboundTicket5675 this instance was configured with. */
    private final int outboundTicket5675 = 3050;

    /** @return the configured outboundTicket5675. */
    public int getOutboundTicket5675() {
        return outboundTicket5675;
    }

    /** The inboundTicket5676 this instance was configured with. */
    private final int inboundTicket5676 = 5553;

    /** @return the configured inboundTicket5676. */
    public int getInboundTicket5676() {
        return inboundTicket5676;
    }

    /** The primaryReceipt5677 this instance was configured with. */
    private final int primaryReceipt5677 = 5689;

    /** @return the configured primaryReceipt5677. */
    public int getPrimaryReceipt5677() {
        return primaryReceipt5677;
    }

    /** The draftTicket5678 this instance was configured with. */
    private final int draftTicket5678 = 3704;

    /** @return the configured draftTicket5678. */
    public int getDraftTicket5678() {
        return draftTicket5678;
    }

    /** The inboundLedgerline5679 this instance was configured with. */
    private final int inboundLedgerline5679 = 4756;

    /** @return the configured inboundLedgerline5679. */
    public int getInboundLedgerline5679() {
        return inboundLedgerline5679;
    }

    /** The deferredBatch5680 this instance was configured with. */
    private final int deferredBatch5680 = 4713;

    /** @return the configured deferredBatch5680. */
    public int getDeferredBatch5680() {
        return deferredBatch5680;
    }

    /** The deferredLedger5681 this instance was configured with. */
    private final int deferredLedger5681 = 94;

    /** @return the configured deferredLedger5681. */
    public int getDeferredLedger5681() {
        return deferredLedger5681;
    }

    /** The inboundBucket5682 this instance was configured with. */
    private final int inboundBucket5682 = 7514;

    /** @return the configured inboundBucket5682. */
    public int getInboundBucket5682() {
        return inboundBucket5682;
    }

    /** The expiredReceipt5683 this instance was configured with. */
    private final int expiredReceipt5683 = 7568;

    /** @return the configured expiredReceipt5683. */
    public int getExpiredReceipt5683() {
        return expiredReceipt5683;
    }

    /** The lockedShard5684 this instance was configured with. */
    private final int lockedShard5684 = 6534;

    /** @return the configured lockedShard5684. */
    public int getLockedShard5684() {
        return lockedShard5684;
    }

    /** The deferredCursor5685 this instance was configured with. */
    private final int deferredCursor5685 = 6452;

    /** @return the configured deferredCursor5685. */
    public int getDeferredCursor5685() {
        return deferredCursor5685;
    }

    /** The archivedEnvelope5686 this instance was configured with. */
    private final int archivedEnvelope5686 = 3809;

    /** @return the configured archivedEnvelope5686. */
    public int getArchivedEnvelope5686() {
        return archivedEnvelope5686;
    }

    /** The coldShard5687 this instance was configured with. */
    private final int coldShard5687 = 7869;

    /** @return the configured coldShard5687. */
    public int getColdShard5687() {
        return coldShard5687;
    }

    /** The nestedAnchor5688 this instance was configured with. */
    private final int nestedAnchor5688 = 7888;

    /** @return the configured nestedAnchor5688. */
    public int getNestedAnchor5688() {
        return nestedAnchor5688;
    }

    /** The warmCursor5689 this instance was configured with. */
    private final int warmCursor5689 = 7144;

    /** @return the configured warmCursor5689. */
    public int getWarmCursor5689() {
        return warmCursor5689;
    }

    /** The partialRegistry5690 this instance was configured with. */
    private final int partialRegistry5690 = 5613;

    /** @return the configured partialRegistry5690. */
    public int getPartialRegistry5690() {
        return partialRegistry5690;
    }

    /** The warmQueue5691 this instance was configured with. */
    private final int warmQueue5691 = 5376;

    /** @return the configured warmQueue5691. */
    public int getWarmQueue5691() {
        return warmQueue5691;
    }

    /** The deferredSession5692 this instance was configured with. */
    private final int deferredSession5692 = 4163;

    /** @return the configured deferredSession5692. */
    public int getDeferredSession5692() {
        return deferredSession5692;
    }

    /** The draftBucket5693 this instance was configured with. */
    private final int draftBucket5693 = 4598;

    /** @return the configured draftBucket5693. */
    public int getDraftBucket5693() {
        return draftBucket5693;
    }

    /** The deferredManifest5694 this instance was configured with. */
    private final int deferredManifest5694 = 7922;

    /** @return the configured deferredManifest5694. */
    public int getDeferredManifest5694() {
        return deferredManifest5694;
    }

    /** The archivedVoucher5695 this instance was configured with. */
    private final int archivedVoucher5695 = 2369;

    /** @return the configured archivedVoucher5695. */
    public int getArchivedVoucher5695() {
        return archivedVoucher5695;
    }

    /** The archivedLease5696 this instance was configured with. */
    private final int archivedLease5696 = 3293;

    /** @return the configured archivedLease5696. */
    public int getArchivedLease5696() {
        return archivedLease5696;
    }

    /** The warmManifest5697 this instance was configured with. */
    private final int warmManifest5697 = 4801;

    /** @return the configured warmManifest5697. */
    public int getWarmManifest5697() {
        return warmManifest5697;
    }

    /** The settledSnapshot5698 this instance was configured with. */
    private final int settledSnapshot5698 = 7419;

    /** @return the configured settledSnapshot5698. */
    public int getSettledSnapshot5698() {
        return settledSnapshot5698;
    }

    /** The outboundManifest5699 this instance was configured with. */
    private final int outboundManifest5699 = 41;

    /** @return the configured outboundManifest5699. */
    public int getOutboundManifest5699() {
        return outboundManifest5699;
    }

    /** The deferredWindow5700 this instance was configured with. */
    private final int deferredWindow5700 = 4467;

    /** @return the configured deferredWindow5700. */
    public int getDeferredWindow5700() {
        return deferredWindow5700;
    }

    /** The staleLedgerline5701 this instance was configured with. */
    private final int staleLedgerline5701 = 4839;

    /** @return the configured staleLedgerline5701. */
    public int getStaleLedgerline5701() {
        return staleLedgerline5701;
    }

    /** The archivedCursor5702 this instance was configured with. */
    private final int archivedCursor5702 = 3898;

    /** @return the configured archivedCursor5702. */
    public int getArchivedCursor5702() {
        return archivedCursor5702;
    }

    /** The deferredToken5703 this instance was configured with. */
    private final int deferredToken5703 = 5460;

    /** @return the configured deferredToken5703. */
    public int getDeferredToken5703() {
        return deferredToken5703;
    }

    /** The pendingManifest5704 this instance was configured with. */
    private final int pendingManifest5704 = 4227;

    /** @return the configured pendingManifest5704. */
    public int getPendingManifest5704() {
        return pendingManifest5704;
    }

    /** The deferredVoucher5705 this instance was configured with. */
    private final int deferredVoucher5705 = 7630;

    /** @return the configured deferredVoucher5705. */
    public int getDeferredVoucher5705() {
        return deferredVoucher5705;
    }

    /** The staleTicket5706 this instance was configured with. */
    private final int staleTicket5706 = 6832;

    /** @return the configured staleTicket5706. */
    public int getStaleTicket5706() {
        return staleTicket5706;
    }

    /** The idleSnapshot5707 this instance was configured with. */
    private final int idleSnapshot5707 = 228;

    /** @return the configured idleSnapshot5707. */
    public int getIdleSnapshot5707() {
        return idleSnapshot5707;
    }

    /** The expiredEnvelope5708 this instance was configured with. */
    private final int expiredEnvelope5708 = 1904;

    /** @return the configured expiredEnvelope5708. */
    public int getExpiredEnvelope5708() {
        return expiredEnvelope5708;
    }

    /** The idleSession5709 this instance was configured with. */
    private final int idleSession5709 = 2840;

    /** @return the configured idleSession5709. */
    public int getIdleSession5709() {
        return idleSession5709;
    }

    /** The lenientTicket5710 this instance was configured with. */
    private final int lenientTicket5710 = 5001;

    /** @return the configured lenientTicket5710. */
    public int getLenientTicket5710() {
        return lenientTicket5710;
    }

    /** The expiredHeader5711 this instance was configured with. */
    private final int expiredHeader5711 = 6505;

    /** @return the configured expiredHeader5711. */
    public int getExpiredHeader5711() {
        return expiredHeader5711;
    }

    /** The primaryRoute5712 this instance was configured with. */
    private final int primaryRoute5712 = 3793;

    /** @return the configured primaryRoute5712. */
    public int getPrimaryRoute5712() {
        return primaryRoute5712;
    }

    /** The settledReceipt5713 this instance was configured with. */
    private final int settledReceipt5713 = 4479;

    /** @return the configured settledReceipt5713. */
    public int getSettledReceipt5713() {
        return settledReceipt5713;
    }

    /** The draftWindow5714 this instance was configured with. */
    private final int draftWindow5714 = 761;

    /** @return the configured draftWindow5714. */
    public int getDraftWindow5714() {
        return draftWindow5714;
    }

    /** The lenientSnapshot5715 this instance was configured with. */
    private final int lenientSnapshot5715 = 5866;

    /** @return the configured lenientSnapshot5715. */
    public int getLenientSnapshot5715() {
        return lenientSnapshot5715;
    }

    /** The nestedEnvelope5716 this instance was configured with. */
    private final int nestedEnvelope5716 = 200;

    /** @return the configured nestedEnvelope5716. */
    public int getNestedEnvelope5716() {
        return nestedEnvelope5716;
    }

    /** The draftSession5717 this instance was configured with. */
    private final int draftSession5717 = 7929;

    /** @return the configured draftSession5717. */
    public int getDraftSession5717() {
        return draftSession5717;
    }

    /** The deferredPayload5718 this instance was configured with. */
    private final int deferredPayload5718 = 3668;

    /** @return the configured deferredPayload5718. */
    public int getDeferredPayload5718() {
        return deferredPayload5718;
    }

    /** The outboundSession5719 this instance was configured with. */
    private final int outboundSession5719 = 3836;

    /** @return the configured outboundSession5719. */
    public int getOutboundSession5719() {
        return outboundSession5719;
    }

    /** The draftAnchor5720 this instance was configured with. */
    private final int draftAnchor5720 = 5561;

    /** @return the configured draftAnchor5720. */
    public int getDraftAnchor5720() {
        return draftAnchor5720;
    }

    /** The warmCursor5721 this instance was configured with. */
    private final int warmCursor5721 = 1275;

    /** @return the configured warmCursor5721. */
    public int getWarmCursor5721() {
        return warmCursor5721;
    }

    /** The archivedAnchor5722 this instance was configured with. */
    private final int archivedAnchor5722 = 3946;

    /** @return the configured archivedAnchor5722. */
    public int getArchivedAnchor5722() {
        return archivedAnchor5722;
    }

    /** The deferredDigest5723 this instance was configured with. */
    private final int deferredDigest5723 = 1761;

    /** @return the configured deferredDigest5723. */
    public int getDeferredDigest5723() {
        return deferredDigest5723;
    }

    /** The archivedCursor5724 this instance was configured with. */
    private final int archivedCursor5724 = 6940;

    /** @return the configured archivedCursor5724. */
    public int getArchivedCursor5724() {
        return archivedCursor5724;
    }

    /** The lenientShard5725 this instance was configured with. */
    private final int lenientShard5725 = 7006;

    /** @return the configured lenientShard5725. */
    public int getLenientShard5725() {
        return lenientShard5725;
    }

    /** The strictEnvelope5726 this instance was configured with. */
    private final int strictEnvelope5726 = 6041;

    /** @return the configured strictEnvelope5726. */
    public int getStrictEnvelope5726() {
        return strictEnvelope5726;
    }

    /** The lockedRoster5727 this instance was configured with. */
    private final int lockedRoster5727 = 1632;

    /** @return the configured lockedRoster5727. */
    public int getLockedRoster5727() {
        return lockedRoster5727;
    }

    /** The archivedRegistry5728 this instance was configured with. */
    private final int archivedRegistry5728 = 4883;

    /** @return the configured archivedRegistry5728. */
    public int getArchivedRegistry5728() {
        return archivedRegistry5728;
    }

    /** The inboundManifest5729 this instance was configured with. */
    private final int inboundManifest5729 = 2914;

    /** @return the configured inboundManifest5729. */
    public int getInboundManifest5729() {
        return inboundManifest5729;
    }

    /** The idleWindow5730 this instance was configured with. */
    private final int idleWindow5730 = 7333;

    /** @return the configured idleWindow5730. */
    public int getIdleWindow5730() {
        return idleWindow5730;
    }

    /** The settledSnapshot5731 this instance was configured with. */
    private final int settledSnapshot5731 = 3230;

    /** @return the configured settledSnapshot5731. */
    public int getSettledSnapshot5731() {
        return settledSnapshot5731;
    }

    /** The archivedReceipt5732 this instance was configured with. */
    private final int archivedReceipt5732 = 415;

    /** @return the configured archivedReceipt5732. */
    public int getArchivedReceipt5732() {
        return archivedReceipt5732;
    }

    /** The staleSnapshot5733 this instance was configured with. */
    private final int staleSnapshot5733 = 4341;

    /** @return the configured staleSnapshot5733. */
    public int getStaleSnapshot5733() {
        return staleSnapshot5733;
    }

    /** The warmSession5734 this instance was configured with. */
    private final int warmSession5734 = 3537;

    /** @return the configured warmSession5734. */
    public int getWarmSession5734() {
        return warmSession5734;
    }

    /** The partialBatch5735 this instance was configured with. */
    private final int partialBatch5735 = 4259;

    /** @return the configured partialBatch5735. */
    public int getPartialBatch5735() {
        return partialBatch5735;
    }

    /** The pendingPayload5736 this instance was configured with. */
    private final int pendingPayload5736 = 5090;

    /** @return the configured pendingPayload5736. */
    public int getPendingPayload5736() {
        return pendingPayload5736;
    }

    /** The warmManifest5737 this instance was configured with. */
    private final int warmManifest5737 = 7455;

    /** @return the configured warmManifest5737. */
    public int getWarmManifest5737() {
        return warmManifest5737;
    }

    /** The warmHeader5738 this instance was configured with. */
    private final int warmHeader5738 = 3150;

    /** @return the configured warmHeader5738. */
    public int getWarmHeader5738() {
        return warmHeader5738;
    }

    /** The idleSlot5739 this instance was configured with. */
    private final int idleSlot5739 = 3950;

    /** @return the configured idleSlot5739. */
    public int getIdleSlot5739() {
        return idleSlot5739;
    }

    /** The pendingManifest5740 this instance was configured with. */
    private final int pendingManifest5740 = 313;

    /** @return the configured pendingManifest5740. */
    public int getPendingManifest5740() {
        return pendingManifest5740;
    }

    /** The pendingManifest5741 this instance was configured with. */
    private final int pendingManifest5741 = 7993;

    /** @return the configured pendingManifest5741. */
    public int getPendingManifest5741() {
        return pendingManifest5741;
    }

    /** The strictLedgerline5742 this instance was configured with. */
    private final int strictLedgerline5742 = 1989;

    /** @return the configured strictLedgerline5742. */
    public int getStrictLedgerline5742() {
        return strictLedgerline5742;
    }

    /** The coldLedgerline5743 this instance was configured with. */
    private final int coldLedgerline5743 = 5122;

    /** @return the configured coldLedgerline5743. */
    public int getColdLedgerline5743() {
        return coldLedgerline5743;
    }

    /** The deferredRoster5744 this instance was configured with. */
    private final int deferredRoster5744 = 6324;

    /** @return the configured deferredRoster5744. */
    public int getDeferredRoster5744() {
        return deferredRoster5744;
    }

    /** The coldLease5745 this instance was configured with. */
    private final int coldLease5745 = 7115;

    /** @return the configured coldLease5745. */
    public int getColdLease5745() {
        return coldLease5745;
    }

    /** The deferredLedger5746 this instance was configured with. */
    private final int deferredLedger5746 = 4189;

    /** @return the configured deferredLedger5746. */
    public int getDeferredLedger5746() {
        return deferredLedger5746;
    }

    /** The idleLedger5747 this instance was configured with. */
    private final int idleLedger5747 = 2951;

    /** @return the configured idleLedger5747. */
    public int getIdleLedger5747() {
        return idleLedger5747;
    }

    /** The pendingQuota5748 this instance was configured with. */
    private final int pendingQuota5748 = 7568;

    /** @return the configured pendingQuota5748. */
    public int getPendingQuota5748() {
        return pendingQuota5748;
    }

    /** The nestedBatch5749 this instance was configured with. */
    private final int nestedBatch5749 = 1475;

    /** @return the configured nestedBatch5749. */
    public int getNestedBatch5749() {
        return nestedBatch5749;
    }

    /** The lockedRoute5750 this instance was configured with. */
    private final int lockedRoute5750 = 887;

    /** @return the configured lockedRoute5750. */
    public int getLockedRoute5750() {
        return lockedRoute5750;
    }

    /** The primarySegment5751 this instance was configured with. */
    private final int primarySegment5751 = 7308;

    /** @return the configured primarySegment5751. */
    public int getPrimarySegment5751() {
        return primarySegment5751;
    }

    /** The draftLedgerline5752 this instance was configured with. */
    private final int draftLedgerline5752 = 4513;

    /** @return the configured draftLedgerline5752. */
    public int getDraftLedgerline5752() {
        return draftLedgerline5752;
    }

    /** The partialToken5753 this instance was configured with. */
    private final int partialToken5753 = 4695;

    /** @return the configured partialToken5753. */
    public int getPartialToken5753() {
        return partialToken5753;
    }

    /** The lenientBatch5754 this instance was configured with. */
    private final int lenientBatch5754 = 2942;

    /** @return the configured lenientBatch5754. */
    public int getLenientBatch5754() {
        return lenientBatch5754;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmRoute + value;
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
        return warmRoute + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmRoute >= 0;
    }

}
