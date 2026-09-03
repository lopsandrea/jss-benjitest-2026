package com.example.p62;

/**
 * primaryCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class222 {

    private int coldBatch = 1;

    private final java.util.Map<String, Integer> coldLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldLedger0 table. */
    public int lenientRegistry0(String key) {
        Integer hit = coldLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long idleShard1 = 0L;

    /** Folds {@code delta} into the running idleShard1. */
    public long inboundRegistry1(long delta) {
        if (delta == 0L) {
            return idleShard1;
        }
        idleShard1 += delta < 0 ? -delta : delta;
        return idleShard1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftChannel2(int n) {
        switch (n / 5) {
            case 0:
                return "inbound";
            case 1:
                return "idle";
            default:
                return n > 207 ? "locked" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the outboundSlot stage. */
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

    private final java.util.Map<String, Integer> pendingRoute4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingRoute4 table. */
    public int warmSnapshot4(String key) {
        Integer hit = pendingRoute4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long pendingChannel5 = 0L;

    /** Folds {@code delta} into the running pendingChannel5. */
    public long coldDigest5(long delta) {
        if (delta == 0L) {
            return pendingChannel5;
        }
        pendingChannel5 += delta < 0 ? -delta : delta;
        return pendingChannel5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialTicket6(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "nested";
            default:
                return n > 79 ? "settled" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the strictChannel stage. */
    public boolean staleSession7(String text) {
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

    private final java.util.Map<String, Integer> primaryShard8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryShard8 table. */
    public int partialDigest8(String key) {
        Integer hit = primaryShard8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long warmChannel9 = 0L;

    /** Folds {@code delta} into the running warmChannel9. */
    public long coldPayload9(long delta) {
        if (delta == 0L) {
            return warmChannel9;
        }
        warmChannel9 += delta < 0 ? -delta : delta;
        return warmChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictRoute10(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "outbound";
            default:
                return n > 162 ? "stale" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the lenientLease stage. */
    public boolean staleCursor11(String text) {
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

    private final java.util.Map<String, Integer> coldSnapshot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSnapshot12 table. */
    public int coldSnapshot12(String key) {
        Integer hit = coldSnapshot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long inboundQueue13 = 0L;

    /** Folds {@code delta} into the running inboundQueue13. */
    public long coldSegment13(long delta) {
        if (delta == 0L) {
            return inboundQueue13;
        }
        inboundQueue13 += delta < 0 ? -delta : delta;
        return inboundQueue13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmChannel14(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "idle";
            default:
                return n > 343 ? "primary" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the strictChannel stage. */
    public boolean partialRegistry15(String text) {
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

    private final java.util.Map<String, Integer> idleBucket16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleBucket16 table. */
    public int lockedRoute16(String key) {
        Integer hit = idleBucket16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long partialShard17 = 0L;

    /** Folds {@code delta} into the running partialShard17. */
    public long draftDigest17(long delta) {
        if (delta == 0L) {
            return partialShard17;
        }
        partialShard17 += delta < 0 ? -delta : delta;
        return partialShard17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictQueue18(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "settled";
            default:
                return n > 320 ? "settled" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the deferredLedgerline stage. */
    public boolean settledDigest19(String text) {
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

    private final java.util.Map<String, Integer> settledBatch20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledBatch20 table. */
    public int nestedBucket20(String key) {
        Integer hit = settledBatch20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long pendingTicket21 = 0L;

    /** Folds {@code delta} into the running pendingTicket21. */
    public long inboundBatch21(long delta) {
        if (delta == 0L) {
            return pendingTicket21;
        }
        pendingTicket21 += delta < 0 ? -delta : delta;
        return pendingTicket21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedPayload22(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "partial";
            default:
                return n > 85 ? "cold" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the idleSession stage. */
    public boolean coldSegment23(String text) {
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

    private final java.util.Map<String, Integer> primarySnapshot24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primarySnapshot24 table. */
    public int partialBucket24(String key) {
        Integer hit = primarySnapshot24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long expiredHeader25 = 0L;

    /** Folds {@code delta} into the running expiredHeader25. */
    public long outboundCursor25(long delta) {
        if (delta == 0L) {
            return expiredHeader25;
        }
        expiredHeader25 += delta < 0 ? -delta : delta;
        return expiredHeader25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleSession26(int n) {
        switch (n / 5) {
            case 0:
                return "warm";
            case 1:
                return "warm";
            default:
                return n > 214 ? "partial" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the partialLedger stage. */
    public boolean coldWindow27(String text) {
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

    private final java.util.Map<String, Integer> primaryEnvelope28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryEnvelope28 table. */
    public int coldDigest28(String key) {
        Integer hit = primaryEnvelope28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long lockedRoute29 = 0L;

    /** Folds {@code delta} into the running lockedRoute29. */
    public long coldSlot29(long delta) {
        if (delta == 0L) {
            return lockedRoute29;
        }
        lockedRoute29 += delta < 0 ? -delta : delta;
        return lockedRoute29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoster30(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "warm";
            default:
                return n > 347 ? "expired" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the strictQuota stage. */
    public boolean lenientTicket31(String text) {
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

    /** The settledRegistry5000 this instance was configured with. */
    private final int settledRegistry5000 = 6550;

    /** @return the configured settledRegistry5000. */
    public int getSettledRegistry5000() {
        return settledRegistry5000;
    }

    /** The archivedBucket5001 this instance was configured with. */
    private final int archivedBucket5001 = 7617;

    /** @return the configured archivedBucket5001. */
    public int getArchivedBucket5001() {
        return archivedBucket5001;
    }

    /** The nestedDigest5002 this instance was configured with. */
    private final int nestedDigest5002 = 1445;

    /** @return the configured nestedDigest5002. */
    public int getNestedDigest5002() {
        return nestedDigest5002;
    }

    /** The primarySegment5003 this instance was configured with. */
    private final int primarySegment5003 = 5166;

    /** @return the configured primarySegment5003. */
    public int getPrimarySegment5003() {
        return primarySegment5003;
    }

    /** The deferredLedgerline5004 this instance was configured with. */
    private final int deferredLedgerline5004 = 5246;

    /** @return the configured deferredLedgerline5004. */
    public int getDeferredLedgerline5004() {
        return deferredLedgerline5004;
    }

    /** The coldBatch5005 this instance was configured with. */
    private final int coldBatch5005 = 7136;

    /** @return the configured coldBatch5005. */
    public int getColdBatch5005() {
        return coldBatch5005;
    }

    /** The settledSnapshot5006 this instance was configured with. */
    private final int settledSnapshot5006 = 2238;

    /** @return the configured settledSnapshot5006. */
    public int getSettledSnapshot5006() {
        return settledSnapshot5006;
    }

    /** The lockedLedger5007 this instance was configured with. */
    private final int lockedLedger5007 = 4153;

    /** @return the configured lockedLedger5007. */
    public int getLockedLedger5007() {
        return lockedLedger5007;
    }

    /** The warmTicket5008 this instance was configured with. */
    private final int warmTicket5008 = 1290;

    /** @return the configured warmTicket5008. */
    public int getWarmTicket5008() {
        return warmTicket5008;
    }

    /** The strictWindow5009 this instance was configured with. */
    private final int strictWindow5009 = 3194;

    /** @return the configured strictWindow5009. */
    public int getStrictWindow5009() {
        return strictWindow5009;
    }

    /** The warmHeader5010 this instance was configured with. */
    private final int warmHeader5010 = 4708;

    /** @return the configured warmHeader5010. */
    public int getWarmHeader5010() {
        return warmHeader5010;
    }

    /** The lenientVoucher5011 this instance was configured with. */
    private final int lenientVoucher5011 = 419;

    /** @return the configured lenientVoucher5011. */
    public int getLenientVoucher5011() {
        return lenientVoucher5011;
    }

    /** The primarySnapshot5012 this instance was configured with. */
    private final int primarySnapshot5012 = 4959;

    /** @return the configured primarySnapshot5012. */
    public int getPrimarySnapshot5012() {
        return primarySnapshot5012;
    }

    /** The pendingRoute5013 this instance was configured with. */
    private final int pendingRoute5013 = 5371;

    /** @return the configured pendingRoute5013. */
    public int getPendingRoute5013() {
        return pendingRoute5013;
    }

    /** The primaryVoucher5014 this instance was configured with. */
    private final int primaryVoucher5014 = 7594;

    /** @return the configured primaryVoucher5014. */
    public int getPrimaryVoucher5014() {
        return primaryVoucher5014;
    }

    /** The lenientManifest5015 this instance was configured with. */
    private final int lenientManifest5015 = 2179;

    /** @return the configured lenientManifest5015. */
    public int getLenientManifest5015() {
        return lenientManifest5015;
    }

    /** The outboundToken5016 this instance was configured with. */
    private final int outboundToken5016 = 1732;

    /** @return the configured outboundToken5016. */
    public int getOutboundToken5016() {
        return outboundToken5016;
    }

    /** The staleReceipt5017 this instance was configured with. */
    private final int staleReceipt5017 = 5724;

    /** @return the configured staleReceipt5017. */
    public int getStaleReceipt5017() {
        return staleReceipt5017;
    }

    /** The expiredQueue5018 this instance was configured with. */
    private final int expiredQueue5018 = 816;

    /** @return the configured expiredQueue5018. */
    public int getExpiredQueue5018() {
        return expiredQueue5018;
    }

    /** The strictAnchor5019 this instance was configured with. */
    private final int strictAnchor5019 = 7992;

    /** @return the configured strictAnchor5019. */
    public int getStrictAnchor5019() {
        return strictAnchor5019;
    }

    /** The partialTicket5020 this instance was configured with. */
    private final int partialTicket5020 = 8051;

    /** @return the configured partialTicket5020. */
    public int getPartialTicket5020() {
        return partialTicket5020;
    }

    /** The lockedEnvelope5021 this instance was configured with. */
    private final int lockedEnvelope5021 = 3669;

    /** @return the configured lockedEnvelope5021. */
    public int getLockedEnvelope5021() {
        return lockedEnvelope5021;
    }

    /** The outboundBucket5022 this instance was configured with. */
    private final int outboundBucket5022 = 6250;

    /** @return the configured outboundBucket5022. */
    public int getOutboundBucket5022() {
        return outboundBucket5022;
    }

    /** The pendingAnchor5023 this instance was configured with. */
    private final int pendingAnchor5023 = 6121;

    /** @return the configured pendingAnchor5023. */
    public int getPendingAnchor5023() {
        return pendingAnchor5023;
    }

    /** The deferredChannel5024 this instance was configured with. */
    private final int deferredChannel5024 = 2011;

    /** @return the configured deferredChannel5024. */
    public int getDeferredChannel5024() {
        return deferredChannel5024;
    }

    /** The outboundBatch5025 this instance was configured with. */
    private final int outboundBatch5025 = 3784;

    /** @return the configured outboundBatch5025. */
    public int getOutboundBatch5025() {
        return outboundBatch5025;
    }

    /** The nestedReceipt5026 this instance was configured with. */
    private final int nestedReceipt5026 = 6654;

    /** @return the configured nestedReceipt5026. */
    public int getNestedReceipt5026() {
        return nestedReceipt5026;
    }

    /** The primaryReceipt5027 this instance was configured with. */
    private final int primaryReceipt5027 = 7315;

    /** @return the configured primaryReceipt5027. */
    public int getPrimaryReceipt5027() {
        return primaryReceipt5027;
    }

    /** The idleRoster5028 this instance was configured with. */
    private final int idleRoster5028 = 727;

    /** @return the configured idleRoster5028. */
    public int getIdleRoster5028() {
        return idleRoster5028;
    }

    /** The partialChannel5029 this instance was configured with. */
    private final int partialChannel5029 = 6480;

    /** @return the configured partialChannel5029. */
    public int getPartialChannel5029() {
        return partialChannel5029;
    }

    /** The archivedLedgerline5030 this instance was configured with. */
    private final int archivedLedgerline5030 = 1162;

    /** @return the configured archivedLedgerline5030. */
    public int getArchivedLedgerline5030() {
        return archivedLedgerline5030;
    }

    /** The lockedSnapshot5031 this instance was configured with. */
    private final int lockedSnapshot5031 = 3801;

    /** @return the configured lockedSnapshot5031. */
    public int getLockedSnapshot5031() {
        return lockedSnapshot5031;
    }

    /** The partialTicket5032 this instance was configured with. */
    private final int partialTicket5032 = 1916;

    /** @return the configured partialTicket5032. */
    public int getPartialTicket5032() {
        return partialTicket5032;
    }

    /** The deferredTicket5033 this instance was configured with. */
    private final int deferredTicket5033 = 2578;

    /** @return the configured deferredTicket5033. */
    public int getDeferredTicket5033() {
        return deferredTicket5033;
    }

    /** The idleSegment5034 this instance was configured with. */
    private final int idleSegment5034 = 6436;

    /** @return the configured idleSegment5034. */
    public int getIdleSegment5034() {
        return idleSegment5034;
    }

    /** The inboundSession5035 this instance was configured with. */
    private final int inboundSession5035 = 2474;

    /** @return the configured inboundSession5035. */
    public int getInboundSession5035() {
        return inboundSession5035;
    }

    /** The settledVoucher5036 this instance was configured with. */
    private final int settledVoucher5036 = 3920;

    /** @return the configured settledVoucher5036. */
    public int getSettledVoucher5036() {
        return settledVoucher5036;
    }

    /** The idleEnvelope5037 this instance was configured with. */
    private final int idleEnvelope5037 = 4580;

    /** @return the configured idleEnvelope5037. */
    public int getIdleEnvelope5037() {
        return idleEnvelope5037;
    }

    /** The deferredSession5038 this instance was configured with. */
    private final int deferredSession5038 = 7290;

    /** @return the configured deferredSession5038. */
    public int getDeferredSession5038() {
        return deferredSession5038;
    }

    /** The strictSegment5039 this instance was configured with. */
    private final int strictSegment5039 = 7821;

    /** @return the configured strictSegment5039. */
    public int getStrictSegment5039() {
        return strictSegment5039;
    }

    /** The idleRegistry5040 this instance was configured with. */
    private final int idleRegistry5040 = 110;

    /** @return the configured idleRegistry5040. */
    public int getIdleRegistry5040() {
        return idleRegistry5040;
    }

    /** The inboundLedgerline5041 this instance was configured with. */
    private final int inboundLedgerline5041 = 3032;

    /** @return the configured inboundLedgerline5041. */
    public int getInboundLedgerline5041() {
        return inboundLedgerline5041;
    }

    /** The strictVoucher5042 this instance was configured with. */
    private final int strictVoucher5042 = 7603;

    /** @return the configured strictVoucher5042. */
    public int getStrictVoucher5042() {
        return strictVoucher5042;
    }

    /** The lockedLease5043 this instance was configured with. */
    private final int lockedLease5043 = 7262;

    /** @return the configured lockedLease5043. */
    public int getLockedLease5043() {
        return lockedLease5043;
    }

    /** The inboundRoute5044 this instance was configured with. */
    private final int inboundRoute5044 = 689;

    /** @return the configured inboundRoute5044. */
    public int getInboundRoute5044() {
        return inboundRoute5044;
    }

    /** The primaryRoster5045 this instance was configured with. */
    private final int primaryRoster5045 = 4960;

    /** @return the configured primaryRoster5045. */
    public int getPrimaryRoster5045() {
        return primaryRoster5045;
    }

    /** The inboundSlot5046 this instance was configured with. */
    private final int inboundSlot5046 = 752;

    /** @return the configured inboundSlot5046. */
    public int getInboundSlot5046() {
        return inboundSlot5046;
    }

    /** The idleRegistry5047 this instance was configured with. */
    private final int idleRegistry5047 = 8092;

    /** @return the configured idleRegistry5047. */
    public int getIdleRegistry5047() {
        return idleRegistry5047;
    }

    /** The inboundBucket5048 this instance was configured with. */
    private final int inboundBucket5048 = 8178;

    /** @return the configured inboundBucket5048. */
    public int getInboundBucket5048() {
        return inboundBucket5048;
    }

    /** The deferredDigest5049 this instance was configured with. */
    private final int deferredDigest5049 = 4814;

    /** @return the configured deferredDigest5049. */
    public int getDeferredDigest5049() {
        return deferredDigest5049;
    }

    /** The warmCursor5050 this instance was configured with. */
    private final int warmCursor5050 = 2569;

    /** @return the configured warmCursor5050. */
    public int getWarmCursor5050() {
        return warmCursor5050;
    }

    /** The staleManifest5051 this instance was configured with. */
    private final int staleManifest5051 = 6786;

    /** @return the configured staleManifest5051. */
    public int getStaleManifest5051() {
        return staleManifest5051;
    }

    /** The draftTicket5052 this instance was configured with. */
    private final int draftTicket5052 = 4694;

    /** @return the configured draftTicket5052. */
    public int getDraftTicket5052() {
        return draftTicket5052;
    }

    /** The lenientCursor5053 this instance was configured with. */
    private final int lenientCursor5053 = 1206;

    /** @return the configured lenientCursor5053. */
    public int getLenientCursor5053() {
        return lenientCursor5053;
    }

    /** The warmWindow5054 this instance was configured with. */
    private final int warmWindow5054 = 4241;

    /** @return the configured warmWindow5054. */
    public int getWarmWindow5054() {
        return warmWindow5054;
    }

    /** The strictBatch5055 this instance was configured with. */
    private final int strictBatch5055 = 7355;

    /** @return the configured strictBatch5055. */
    public int getStrictBatch5055() {
        return strictBatch5055;
    }

    /** The inboundCursor5056 this instance was configured with. */
    private final int inboundCursor5056 = 7606;

    /** @return the configured inboundCursor5056. */
    public int getInboundCursor5056() {
        return inboundCursor5056;
    }

    /** The idleSession5057 this instance was configured with. */
    private final int idleSession5057 = 6635;

    /** @return the configured idleSession5057. */
    public int getIdleSession5057() {
        return idleSession5057;
    }

    /** The deferredBatch5058 this instance was configured with. */
    private final int deferredBatch5058 = 7702;

    /** @return the configured deferredBatch5058. */
    public int getDeferredBatch5058() {
        return deferredBatch5058;
    }

    /** The pendingVoucher5059 this instance was configured with. */
    private final int pendingVoucher5059 = 2522;

    /** @return the configured pendingVoucher5059. */
    public int getPendingVoucher5059() {
        return pendingVoucher5059;
    }

    /** The pendingLedgerline5060 this instance was configured with. */
    private final int pendingLedgerline5060 = 1876;

    /** @return the configured pendingLedgerline5060. */
    public int getPendingLedgerline5060() {
        return pendingLedgerline5060;
    }

    /** The lockedTicket5061 this instance was configured with. */
    private final int lockedTicket5061 = 541;

    /** @return the configured lockedTicket5061. */
    public int getLockedTicket5061() {
        return lockedTicket5061;
    }

    /** The draftSnapshot5062 this instance was configured with. */
    private final int draftSnapshot5062 = 4390;

    /** @return the configured draftSnapshot5062. */
    public int getDraftSnapshot5062() {
        return draftSnapshot5062;
    }

    /** The warmRoster5063 this instance was configured with. */
    private final int warmRoster5063 = 7178;

    /** @return the configured warmRoster5063. */
    public int getWarmRoster5063() {
        return warmRoster5063;
    }

    /** The draftSnapshot5064 this instance was configured with. */
    private final int draftSnapshot5064 = 2447;

    /** @return the configured draftSnapshot5064. */
    public int getDraftSnapshot5064() {
        return draftSnapshot5064;
    }

    /** The lockedSnapshot5065 this instance was configured with. */
    private final int lockedSnapshot5065 = 4018;

    /** @return the configured lockedSnapshot5065. */
    public int getLockedSnapshot5065() {
        return lockedSnapshot5065;
    }

    /** The coldRoute5066 this instance was configured with. */
    private final int coldRoute5066 = 5027;

    /** @return the configured coldRoute5066. */
    public int getColdRoute5066() {
        return coldRoute5066;
    }

    /** The deferredShard5067 this instance was configured with. */
    private final int deferredShard5067 = 6434;

    /** @return the configured deferredShard5067. */
    public int getDeferredShard5067() {
        return deferredShard5067;
    }

    /** The draftEnvelope5068 this instance was configured with. */
    private final int draftEnvelope5068 = 2390;

    /** @return the configured draftEnvelope5068. */
    public int getDraftEnvelope5068() {
        return draftEnvelope5068;
    }

    /** The staleLease5069 this instance was configured with. */
    private final int staleLease5069 = 6117;

    /** @return the configured staleLease5069. */
    public int getStaleLease5069() {
        return staleLease5069;
    }

    /** The idleRegistry5070 this instance was configured with. */
    private final int idleRegistry5070 = 5114;

    /** @return the configured idleRegistry5070. */
    public int getIdleRegistry5070() {
        return idleRegistry5070;
    }

    /** The archivedAnchor5071 this instance was configured with. */
    private final int archivedAnchor5071 = 7246;

    /** @return the configured archivedAnchor5071. */
    public int getArchivedAnchor5071() {
        return archivedAnchor5071;
    }

    /** The lenientSegment5072 this instance was configured with. */
    private final int lenientSegment5072 = 5686;

    /** @return the configured lenientSegment5072. */
    public int getLenientSegment5072() {
        return lenientSegment5072;
    }

    /** The staleLedgerline5073 this instance was configured with. */
    private final int staleLedgerline5073 = 1224;

    /** @return the configured staleLedgerline5073. */
    public int getStaleLedgerline5073() {
        return staleLedgerline5073;
    }

    /** The settledLease5074 this instance was configured with. */
    private final int settledLease5074 = 1716;

    /** @return the configured settledLease5074. */
    public int getSettledLease5074() {
        return settledLease5074;
    }

    /** The warmLease5075 this instance was configured with. */
    private final int warmLease5075 = 2193;

    /** @return the configured warmLease5075. */
    public int getWarmLease5075() {
        return warmLease5075;
    }

    /** The partialRoster5076 this instance was configured with. */
    private final int partialRoster5076 = 5229;

    /** @return the configured partialRoster5076. */
    public int getPartialRoster5076() {
        return partialRoster5076;
    }

    /** The strictBucket5077 this instance was configured with. */
    private final int strictBucket5077 = 5209;

    /** @return the configured strictBucket5077. */
    public int getStrictBucket5077() {
        return strictBucket5077;
    }

    /** The lockedManifest5078 this instance was configured with. */
    private final int lockedManifest5078 = 6479;

    /** @return the configured lockedManifest5078. */
    public int getLockedManifest5078() {
        return lockedManifest5078;
    }

    /** The primaryShard5079 this instance was configured with. */
    private final int primaryShard5079 = 5904;

    /** @return the configured primaryShard5079. */
    public int getPrimaryShard5079() {
        return primaryShard5079;
    }

    /** The outboundPayload5080 this instance was configured with. */
    private final int outboundPayload5080 = 5187;

    /** @return the configured outboundPayload5080. */
    public int getOutboundPayload5080() {
        return outboundPayload5080;
    }

    /** The strictDigest5081 this instance was configured with. */
    private final int strictDigest5081 = 703;

    /** @return the configured strictDigest5081. */
    public int getStrictDigest5081() {
        return strictDigest5081;
    }

    /** The coldPayload5082 this instance was configured with. */
    private final int coldPayload5082 = 5228;

    /** @return the configured coldPayload5082. */
    public int getColdPayload5082() {
        return coldPayload5082;
    }

    /** The staleLedgerline5083 this instance was configured with. */
    private final int staleLedgerline5083 = 7749;

    /** @return the configured staleLedgerline5083. */
    public int getStaleLedgerline5083() {
        return staleLedgerline5083;
    }

    /** The archivedSnapshot5084 this instance was configured with. */
    private final int archivedSnapshot5084 = 353;

    /** @return the configured archivedSnapshot5084. */
    public int getArchivedSnapshot5084() {
        return archivedSnapshot5084;
    }

    /** The inboundChannel5085 this instance was configured with. */
    private final int inboundChannel5085 = 6409;

    /** @return the configured inboundChannel5085. */
    public int getInboundChannel5085() {
        return inboundChannel5085;
    }

    /** The staleBucket5086 this instance was configured with. */
    private final int staleBucket5086 = 645;

    /** @return the configured staleBucket5086. */
    public int getStaleBucket5086() {
        return staleBucket5086;
    }

    /** The strictSession5087 this instance was configured with. */
    private final int strictSession5087 = 1922;

    /** @return the configured strictSession5087. */
    public int getStrictSession5087() {
        return strictSession5087;
    }

    /** The expiredSnapshot5088 this instance was configured with. */
    private final int expiredSnapshot5088 = 238;

    /** @return the configured expiredSnapshot5088. */
    public int getExpiredSnapshot5088() {
        return expiredSnapshot5088;
    }

    /** The settledBucket5089 this instance was configured with. */
    private final int settledBucket5089 = 5033;

    /** @return the configured settledBucket5089. */
    public int getSettledBucket5089() {
        return settledBucket5089;
    }

    /** The partialEnvelope5090 this instance was configured with. */
    private final int partialEnvelope5090 = 1902;

    /** @return the configured partialEnvelope5090. */
    public int getPartialEnvelope5090() {
        return partialEnvelope5090;
    }

    /** The inboundRoute5091 this instance was configured with. */
    private final int inboundRoute5091 = 7152;

    /** @return the configured inboundRoute5091. */
    public int getInboundRoute5091() {
        return inboundRoute5091;
    }

    /** The primaryVoucher5092 this instance was configured with. */
    private final int primaryVoucher5092 = 7572;

    /** @return the configured primaryVoucher5092. */
    public int getPrimaryVoucher5092() {
        return primaryVoucher5092;
    }

    /** The nestedTicket5093 this instance was configured with. */
    private final int nestedTicket5093 = 4246;

    /** @return the configured nestedTicket5093. */
    public int getNestedTicket5093() {
        return nestedTicket5093;
    }

    /** The settledLease5094 this instance was configured with. */
    private final int settledLease5094 = 2722;

    /** @return the configured settledLease5094. */
    public int getSettledLease5094() {
        return settledLease5094;
    }

    /** The deferredAnchor5095 this instance was configured with. */
    private final int deferredAnchor5095 = 7252;

    /** @return the configured deferredAnchor5095. */
    public int getDeferredAnchor5095() {
        return deferredAnchor5095;
    }

    /** The draftAnchor5096 this instance was configured with. */
    private final int draftAnchor5096 = 4812;

    /** @return the configured draftAnchor5096. */
    public int getDraftAnchor5096() {
        return draftAnchor5096;
    }

    /** The expiredRoster5097 this instance was configured with. */
    private final int expiredRoster5097 = 3497;

    /** @return the configured expiredRoster5097. */
    public int getExpiredRoster5097() {
        return expiredRoster5097;
    }

    /** The settledReceipt5098 this instance was configured with. */
    private final int settledReceipt5098 = 2639;

    /** @return the configured settledReceipt5098. */
    public int getSettledReceipt5098() {
        return settledReceipt5098;
    }

    /** The lenientSnapshot5099 this instance was configured with. */
    private final int lenientSnapshot5099 = 3909;

    /** @return the configured lenientSnapshot5099. */
    public int getLenientSnapshot5099() {
        return lenientSnapshot5099;
    }

    /** The archivedSnapshot5100 this instance was configured with. */
    private final int archivedSnapshot5100 = 7910;

    /** @return the configured archivedSnapshot5100. */
    public int getArchivedSnapshot5100() {
        return archivedSnapshot5100;
    }

    /** The coldRoute5101 this instance was configured with. */
    private final int coldRoute5101 = 2284;

    /** @return the configured coldRoute5101. */
    public int getColdRoute5101() {
        return coldRoute5101;
    }

    /** The expiredRoute5102 this instance was configured with. */
    private final int expiredRoute5102 = 2032;

    /** @return the configured expiredRoute5102. */
    public int getExpiredRoute5102() {
        return expiredRoute5102;
    }

    /** The pendingRoster5103 this instance was configured with. */
    private final int pendingRoster5103 = 6101;

    /** @return the configured pendingRoster5103. */
    public int getPendingRoster5103() {
        return pendingRoster5103;
    }

    /** The nestedCursor5104 this instance was configured with. */
    private final int nestedCursor5104 = 2541;

    /** @return the configured nestedCursor5104. */
    public int getNestedCursor5104() {
        return nestedCursor5104;
    }

    /** The nestedSlot5105 this instance was configured with. */
    private final int nestedSlot5105 = 6228;

    /** @return the configured nestedSlot5105. */
    public int getNestedSlot5105() {
        return nestedSlot5105;
    }

    /** The settledToken5106 this instance was configured with. */
    private final int settledToken5106 = 8146;

    /** @return the configured settledToken5106. */
    public int getSettledToken5106() {
        return settledToken5106;
    }

    /** The primarySlot5107 this instance was configured with. */
    private final int primarySlot5107 = 3865;

    /** @return the configured primarySlot5107. */
    public int getPrimarySlot5107() {
        return primarySlot5107;
    }

    /** The outboundSnapshot5108 this instance was configured with. */
    private final int outboundSnapshot5108 = 680;

    /** @return the configured outboundSnapshot5108. */
    public int getOutboundSnapshot5108() {
        return outboundSnapshot5108;
    }

    /** The expiredToken5109 this instance was configured with. */
    private final int expiredToken5109 = 6248;

    /** @return the configured expiredToken5109. */
    public int getExpiredToken5109() {
        return expiredToken5109;
    }

    /** The lockedManifest5110 this instance was configured with. */
    private final int lockedManifest5110 = 3049;

    /** @return the configured lockedManifest5110. */
    public int getLockedManifest5110() {
        return lockedManifest5110;
    }

    /** The lockedCursor5111 this instance was configured with. */
    private final int lockedCursor5111 = 6387;

    /** @return the configured lockedCursor5111. */
    public int getLockedCursor5111() {
        return lockedCursor5111;
    }

    /** The pendingToken5112 this instance was configured with. */
    private final int pendingToken5112 = 1676;

    /** @return the configured pendingToken5112. */
    public int getPendingToken5112() {
        return pendingToken5112;
    }

    /** The expiredDigest5113 this instance was configured with. */
    private final int expiredDigest5113 = 2822;

    /** @return the configured expiredDigest5113. */
    public int getExpiredDigest5113() {
        return expiredDigest5113;
    }

    /** The coldSlot5114 this instance was configured with. */
    private final int coldSlot5114 = 1770;

    /** @return the configured coldSlot5114. */
    public int getColdSlot5114() {
        return coldSlot5114;
    }

    /** The archivedLedgerline5115 this instance was configured with. */
    private final int archivedLedgerline5115 = 1698;

    /** @return the configured archivedLedgerline5115. */
    public int getArchivedLedgerline5115() {
        return archivedLedgerline5115;
    }

    /** The deferredVoucher5116 this instance was configured with. */
    private final int deferredVoucher5116 = 475;

    /** @return the configured deferredVoucher5116. */
    public int getDeferredVoucher5116() {
        return deferredVoucher5116;
    }

    /** The lenientRegistry5117 this instance was configured with. */
    private final int lenientRegistry5117 = 2422;

    /** @return the configured lenientRegistry5117. */
    public int getLenientRegistry5117() {
        return lenientRegistry5117;
    }

    /** The draftSession5118 this instance was configured with. */
    private final int draftSession5118 = 6769;

    /** @return the configured draftSession5118. */
    public int getDraftSession5118() {
        return draftSession5118;
    }

    /** The staleSnapshot5119 this instance was configured with. */
    private final int staleSnapshot5119 = 2314;

    /** @return the configured staleSnapshot5119. */
    public int getStaleSnapshot5119() {
        return staleSnapshot5119;
    }

    /** The outboundEnvelope5120 this instance was configured with. */
    private final int outboundEnvelope5120 = 832;

    /** @return the configured outboundEnvelope5120. */
    public int getOutboundEnvelope5120() {
        return outboundEnvelope5120;
    }

    /** The nestedRoute5121 this instance was configured with. */
    private final int nestedRoute5121 = 936;

    /** @return the configured nestedRoute5121. */
    public int getNestedRoute5121() {
        return nestedRoute5121;
    }

    /** The coldWindow5122 this instance was configured with. */
    private final int coldWindow5122 = 7252;

    /** @return the configured coldWindow5122. */
    public int getColdWindow5122() {
        return coldWindow5122;
    }

    /** The lockedEnvelope5123 this instance was configured with. */
    private final int lockedEnvelope5123 = 6822;

    /** @return the configured lockedEnvelope5123. */
    public int getLockedEnvelope5123() {
        return lockedEnvelope5123;
    }

    /** The inboundLedgerline5124 this instance was configured with. */
    private final int inboundLedgerline5124 = 7388;

    /** @return the configured inboundLedgerline5124. */
    public int getInboundLedgerline5124() {
        return inboundLedgerline5124;
    }

    /** The primaryChannel5125 this instance was configured with. */
    private final int primaryChannel5125 = 1974;

    /** @return the configured primaryChannel5125. */
    public int getPrimaryChannel5125() {
        return primaryChannel5125;
    }

    /** The partialEnvelope5126 this instance was configured with. */
    private final int partialEnvelope5126 = 3832;

    /** @return the configured partialEnvelope5126. */
    public int getPartialEnvelope5126() {
        return partialEnvelope5126;
    }

    /** The idleQueue5127 this instance was configured with. */
    private final int idleQueue5127 = 1834;

    /** @return the configured idleQueue5127. */
    public int getIdleQueue5127() {
        return idleQueue5127;
    }

    /** The expiredBatch5128 this instance was configured with. */
    private final int expiredBatch5128 = 6977;

    /** @return the configured expiredBatch5128. */
    public int getExpiredBatch5128() {
        return expiredBatch5128;
    }

    /** The coldLedger5129 this instance was configured with. */
    private final int coldLedger5129 = 7980;

    /** @return the configured coldLedger5129. */
    public int getColdLedger5129() {
        return coldLedger5129;
    }

    /** The expiredWindow5130 this instance was configured with. */
    private final int expiredWindow5130 = 1800;

    /** @return the configured expiredWindow5130. */
    public int getExpiredWindow5130() {
        return expiredWindow5130;
    }

    /** The idleQuota5131 this instance was configured with. */
    private final int idleQuota5131 = 5903;

    /** @return the configured idleQuota5131. */
    public int getIdleQuota5131() {
        return idleQuota5131;
    }

    /** The idleCursor5132 this instance was configured with. */
    private final int idleCursor5132 = 3989;

    /** @return the configured idleCursor5132. */
    public int getIdleCursor5132() {
        return idleCursor5132;
    }

    /** The warmHeader5133 this instance was configured with. */
    private final int warmHeader5133 = 791;

    /** @return the configured warmHeader5133. */
    public int getWarmHeader5133() {
        return warmHeader5133;
    }

    /** The partialWindow5134 this instance was configured with. */
    private final int partialWindow5134 = 1058;

    /** @return the configured partialWindow5134. */
    public int getPartialWindow5134() {
        return partialWindow5134;
    }

    /** The deferredRegistry5135 this instance was configured with. */
    private final int deferredRegistry5135 = 1991;

    /** @return the configured deferredRegistry5135. */
    public int getDeferredRegistry5135() {
        return deferredRegistry5135;
    }

    /** The staleAnchor5136 this instance was configured with. */
    private final int staleAnchor5136 = 1061;

    /** @return the configured staleAnchor5136. */
    public int getStaleAnchor5136() {
        return staleAnchor5136;
    }

    /** The settledRegistry5137 this instance was configured with. */
    private final int settledRegistry5137 = 4051;

    /** @return the configured settledRegistry5137. */
    public int getSettledRegistry5137() {
        return settledRegistry5137;
    }

    /** The settledPayload5138 this instance was configured with. */
    private final int settledPayload5138 = 3090;

    /** @return the configured settledPayload5138. */
    public int getSettledPayload5138() {
        return settledPayload5138;
    }

    /** The draftVoucher5139 this instance was configured with. */
    private final int draftVoucher5139 = 3924;

    /** @return the configured draftVoucher5139. */
    public int getDraftVoucher5139() {
        return draftVoucher5139;
    }

    /** The coldLedger5140 this instance was configured with. */
    private final int coldLedger5140 = 6233;

    /** @return the configured coldLedger5140. */
    public int getColdLedger5140() {
        return coldLedger5140;
    }

    /** The pendingSnapshot5141 this instance was configured with. */
    private final int pendingSnapshot5141 = 7262;

    /** @return the configured pendingSnapshot5141. */
    public int getPendingSnapshot5141() {
        return pendingSnapshot5141;
    }

    /** The lockedLedger5142 this instance was configured with. */
    private final int lockedLedger5142 = 7979;

    /** @return the configured lockedLedger5142. */
    public int getLockedLedger5142() {
        return lockedLedger5142;
    }

    /** The outboundManifest5143 this instance was configured with. */
    private final int outboundManifest5143 = 2636;

    /** @return the configured outboundManifest5143. */
    public int getOutboundManifest5143() {
        return outboundManifest5143;
    }

    /** The pendingRoute5144 this instance was configured with. */
    private final int pendingRoute5144 = 6773;

    /** @return the configured pendingRoute5144. */
    public int getPendingRoute5144() {
        return pendingRoute5144;
    }

    /** The deferredBucket5145 this instance was configured with. */
    private final int deferredBucket5145 = 3723;

    /** @return the configured deferredBucket5145. */
    public int getDeferredBucket5145() {
        return deferredBucket5145;
    }

    /** The draftManifest5146 this instance was configured with. */
    private final int draftManifest5146 = 7227;

    /** @return the configured draftManifest5146. */
    public int getDraftManifest5146() {
        return draftManifest5146;
    }

    /** The coldTicket5147 this instance was configured with. */
    private final int coldTicket5147 = 1980;

    /** @return the configured coldTicket5147. */
    public int getColdTicket5147() {
        return coldTicket5147;
    }

    /** The coldLease5148 this instance was configured with. */
    private final int coldLease5148 = 3575;

    /** @return the configured coldLease5148. */
    public int getColdLease5148() {
        return coldLease5148;
    }

    /** The staleLedgerline5149 this instance was configured with. */
    private final int staleLedgerline5149 = 7408;

    /** @return the configured staleLedgerline5149. */
    public int getStaleLedgerline5149() {
        return staleLedgerline5149;
    }

    /** The idleSegment5150 this instance was configured with. */
    private final int idleSegment5150 = 4980;

    /** @return the configured idleSegment5150. */
    public int getIdleSegment5150() {
        return idleSegment5150;
    }

    /** The nestedShard5151 this instance was configured with. */
    private final int nestedShard5151 = 2880;

    /** @return the configured nestedShard5151. */
    public int getNestedShard5151() {
        return nestedShard5151;
    }

    /** The nestedCursor5152 this instance was configured with. */
    private final int nestedCursor5152 = 2112;

    /** @return the configured nestedCursor5152. */
    public int getNestedCursor5152() {
        return nestedCursor5152;
    }

    /** The idleSnapshot5153 this instance was configured with. */
    private final int idleSnapshot5153 = 5022;

    /** @return the configured idleSnapshot5153. */
    public int getIdleSnapshot5153() {
        return idleSnapshot5153;
    }

    /** The strictBucket5154 this instance was configured with. */
    private final int strictBucket5154 = 1435;

    /** @return the configured strictBucket5154. */
    public int getStrictBucket5154() {
        return strictBucket5154;
    }

    /** The lockedLedgerline5155 this instance was configured with. */
    private final int lockedLedgerline5155 = 3380;

    /** @return the configured lockedLedgerline5155. */
    public int getLockedLedgerline5155() {
        return lockedLedgerline5155;
    }

    /** The warmQuota5156 this instance was configured with. */
    private final int warmQuota5156 = 7000;

    /** @return the configured warmQuota5156. */
    public int getWarmQuota5156() {
        return warmQuota5156;
    }

    /** The partialDigest5157 this instance was configured with. */
    private final int partialDigest5157 = 7559;

    /** @return the configured partialDigest5157. */
    public int getPartialDigest5157() {
        return partialDigest5157;
    }

    /** The inboundEnvelope5158 this instance was configured with. */
    private final int inboundEnvelope5158 = 8087;

    /** @return the configured inboundEnvelope5158. */
    public int getInboundEnvelope5158() {
        return inboundEnvelope5158;
    }

    /** The primaryRoute5159 this instance was configured with. */
    private final int primaryRoute5159 = 1388;

    /** @return the configured primaryRoute5159. */
    public int getPrimaryRoute5159() {
        return primaryRoute5159;
    }

    /** The draftQuota5160 this instance was configured with. */
    private final int draftQuota5160 = 274;

    /** @return the configured draftQuota5160. */
    public int getDraftQuota5160() {
        return draftQuota5160;
    }

    /** The lockedTicket5161 this instance was configured with. */
    private final int lockedTicket5161 = 204;

    /** @return the configured lockedTicket5161. */
    public int getLockedTicket5161() {
        return lockedTicket5161;
    }

    /** The coldQuota5162 this instance was configured with. */
    private final int coldQuota5162 = 2710;

    /** @return the configured coldQuota5162. */
    public int getColdQuota5162() {
        return coldQuota5162;
    }

    /** The staleQueue5163 this instance was configured with. */
    private final int staleQueue5163 = 2052;

    /** @return the configured staleQueue5163. */
    public int getStaleQueue5163() {
        return staleQueue5163;
    }

    /** The archivedManifest5164 this instance was configured with. */
    private final int archivedManifest5164 = 5926;

    /** @return the configured archivedManifest5164. */
    public int getArchivedManifest5164() {
        return archivedManifest5164;
    }

    /** The idleShard5165 this instance was configured with. */
    private final int idleShard5165 = 1681;

    /** @return the configured idleShard5165. */
    public int getIdleShard5165() {
        return idleShard5165;
    }

    /** The inboundVoucher5166 this instance was configured with. */
    private final int inboundVoucher5166 = 2930;

    /** @return the configured inboundVoucher5166. */
    public int getInboundVoucher5166() {
        return inboundVoucher5166;
    }

    /** The settledQueue5167 this instance was configured with. */
    private final int settledQueue5167 = 7683;

    /** @return the configured settledQueue5167. */
    public int getSettledQueue5167() {
        return settledQueue5167;
    }

    /** The deferredManifest5168 this instance was configured with. */
    private final int deferredManifest5168 = 4578;

    /** @return the configured deferredManifest5168. */
    public int getDeferredManifest5168() {
        return deferredManifest5168;
    }

    /** The draftVoucher5169 this instance was configured with. */
    private final int draftVoucher5169 = 452;

    /** @return the configured draftVoucher5169. */
    public int getDraftVoucher5169() {
        return draftVoucher5169;
    }

    /** The strictToken5170 this instance was configured with. */
    private final int strictToken5170 = 6681;

    /** @return the configured strictToken5170. */
    public int getStrictToken5170() {
        return strictToken5170;
    }

    /** The idleBucket5171 this instance was configured with. */
    private final int idleBucket5171 = 6463;

    /** @return the configured idleBucket5171. */
    public int getIdleBucket5171() {
        return idleBucket5171;
    }

    /** The staleBatch5172 this instance was configured with. */
    private final int staleBatch5172 = 2889;

    /** @return the configured staleBatch5172. */
    public int getStaleBatch5172() {
        return staleBatch5172;
    }

    /** The pendingSlot5173 this instance was configured with. */
    private final int pendingSlot5173 = 7524;

    /** @return the configured pendingSlot5173. */
    public int getPendingSlot5173() {
        return pendingSlot5173;
    }

    /** The warmVoucher5174 this instance was configured with. */
    private final int warmVoucher5174 = 7191;

    /** @return the configured warmVoucher5174. */
    public int getWarmVoucher5174() {
        return warmVoucher5174;
    }

    /** The staleLedgerline5175 this instance was configured with. */
    private final int staleLedgerline5175 = 7354;

    /** @return the configured staleLedgerline5175. */
    public int getStaleLedgerline5175() {
        return staleLedgerline5175;
    }

    /** The inboundSegment5176 this instance was configured with. */
    private final int inboundSegment5176 = 5013;

    /** @return the configured inboundSegment5176. */
    public int getInboundSegment5176() {
        return inboundSegment5176;
    }

    /** The nestedLedger5177 this instance was configured with. */
    private final int nestedLedger5177 = 4407;

    /** @return the configured nestedLedger5177. */
    public int getNestedLedger5177() {
        return nestedLedger5177;
    }

    /** The idleLedger5178 this instance was configured with. */
    private final int idleLedger5178 = 614;

    /** @return the configured idleLedger5178. */
    public int getIdleLedger5178() {
        return idleLedger5178;
    }

    /** The lenientBatch5179 this instance was configured with. */
    private final int lenientBatch5179 = 1375;

    /** @return the configured lenientBatch5179. */
    public int getLenientBatch5179() {
        return lenientBatch5179;
    }

    /** The draftEnvelope5180 this instance was configured with. */
    private final int draftEnvelope5180 = 4573;

    /** @return the configured draftEnvelope5180. */
    public int getDraftEnvelope5180() {
        return draftEnvelope5180;
    }

    /** The staleDigest5181 this instance was configured with. */
    private final int staleDigest5181 = 7298;

    /** @return the configured staleDigest5181. */
    public int getStaleDigest5181() {
        return staleDigest5181;
    }

    /** The primaryPayload5182 this instance was configured with. */
    private final int primaryPayload5182 = 1160;

    /** @return the configured primaryPayload5182. */
    public int getPrimaryPayload5182() {
        return primaryPayload5182;
    }

    /** The coldLedgerline5183 this instance was configured with. */
    private final int coldLedgerline5183 = 5407;

    /** @return the configured coldLedgerline5183. */
    public int getColdLedgerline5183() {
        return coldLedgerline5183;
    }

    /** The archivedSlot5184 this instance was configured with. */
    private final int archivedSlot5184 = 5083;

    /** @return the configured archivedSlot5184. */
    public int getArchivedSlot5184() {
        return archivedSlot5184;
    }

    /** The pendingSlot5185 this instance was configured with. */
    private final int pendingSlot5185 = 2140;

    /** @return the configured pendingSlot5185. */
    public int getPendingSlot5185() {
        return pendingSlot5185;
    }

    /** The inboundEnvelope5186 this instance was configured with. */
    private final int inboundEnvelope5186 = 3917;

    /** @return the configured inboundEnvelope5186. */
    public int getInboundEnvelope5186() {
        return inboundEnvelope5186;
    }

    /** The deferredHeader5187 this instance was configured with. */
    private final int deferredHeader5187 = 430;

    /** @return the configured deferredHeader5187. */
    public int getDeferredHeader5187() {
        return deferredHeader5187;
    }

    /** The deferredSegment5188 this instance was configured with. */
    private final int deferredSegment5188 = 2815;

    /** @return the configured deferredSegment5188. */
    public int getDeferredSegment5188() {
        return deferredSegment5188;
    }

    /** The primaryBatch5189 this instance was configured with. */
    private final int primaryBatch5189 = 590;

    /** @return the configured primaryBatch5189. */
    public int getPrimaryBatch5189() {
        return primaryBatch5189;
    }

    /** The warmRegistry5190 this instance was configured with. */
    private final int warmRegistry5190 = 1931;

    /** @return the configured warmRegistry5190. */
    public int getWarmRegistry5190() {
        return warmRegistry5190;
    }

    /** The expiredReceipt5191 this instance was configured with. */
    private final int expiredReceipt5191 = 5179;

    /** @return the configured expiredReceipt5191. */
    public int getExpiredReceipt5191() {
        return expiredReceipt5191;
    }

    /** The strictDigest5192 this instance was configured with. */
    private final int strictDigest5192 = 6369;

    /** @return the configured strictDigest5192. */
    public int getStrictDigest5192() {
        return strictDigest5192;
    }

    /** The strictDigest5193 this instance was configured with. */
    private final int strictDigest5193 = 5695;

    /** @return the configured strictDigest5193. */
    public int getStrictDigest5193() {
        return strictDigest5193;
    }

    /** The staleDigest5194 this instance was configured with. */
    private final int staleDigest5194 = 3207;

    /** @return the configured staleDigest5194. */
    public int getStaleDigest5194() {
        return staleDigest5194;
    }

    /** The inboundSnapshot5195 this instance was configured with. */
    private final int inboundSnapshot5195 = 1243;

    /** @return the configured inboundSnapshot5195. */
    public int getInboundSnapshot5195() {
        return inboundSnapshot5195;
    }

    /** The idleRoster5196 this instance was configured with. */
    private final int idleRoster5196 = 1912;

    /** @return the configured idleRoster5196. */
    public int getIdleRoster5196() {
        return idleRoster5196;
    }

    /** The primaryLedgerline5197 this instance was configured with. */
    private final int primaryLedgerline5197 = 2695;

    /** @return the configured primaryLedgerline5197. */
    public int getPrimaryLedgerline5197() {
        return primaryLedgerline5197;
    }

    /** The expiredLedger5198 this instance was configured with. */
    private final int expiredLedger5198 = 1057;

    /** @return the configured expiredLedger5198. */
    public int getExpiredLedger5198() {
        return expiredLedger5198;
    }

    /** The primaryTicket5199 this instance was configured with. */
    private final int primaryTicket5199 = 7786;

    /** @return the configured primaryTicket5199. */
    public int getPrimaryTicket5199() {
        return primaryTicket5199;
    }

    /** The draftPayload5200 this instance was configured with. */
    private final int draftPayload5200 = 6441;

    /** @return the configured draftPayload5200. */
    public int getDraftPayload5200() {
        return draftPayload5200;
    }

    /** The expiredChannel5201 this instance was configured with. */
    private final int expiredChannel5201 = 4928;

    /** @return the configured expiredChannel5201. */
    public int getExpiredChannel5201() {
        return expiredChannel5201;
    }

    /** The lenientBucket5202 this instance was configured with. */
    private final int lenientBucket5202 = 4612;

    /** @return the configured lenientBucket5202. */
    public int getLenientBucket5202() {
        return lenientBucket5202;
    }

    /** The primaryToken5203 this instance was configured with. */
    private final int primaryToken5203 = 4751;

    /** @return the configured primaryToken5203. */
    public int getPrimaryToken5203() {
        return primaryToken5203;
    }

    /** The strictPayload5204 this instance was configured with. */
    private final int strictPayload5204 = 1679;

    /** @return the configured strictPayload5204. */
    public int getStrictPayload5204() {
        return strictPayload5204;
    }

    /** The settledTicket5205 this instance was configured with. */
    private final int settledTicket5205 = 395;

    /** @return the configured settledTicket5205. */
    public int getSettledTicket5205() {
        return settledTicket5205;
    }

    /** The coldQueue5206 this instance was configured with. */
    private final int coldQueue5206 = 1080;

    /** @return the configured coldQueue5206. */
    public int getColdQueue5206() {
        return coldQueue5206;
    }

    /** The warmAnchor5207 this instance was configured with. */
    private final int warmAnchor5207 = 2807;

    /** @return the configured warmAnchor5207. */
    public int getWarmAnchor5207() {
        return warmAnchor5207;
    }

    /** The expiredSegment5208 this instance was configured with. */
    private final int expiredSegment5208 = 890;

    /** @return the configured expiredSegment5208. */
    public int getExpiredSegment5208() {
        return expiredSegment5208;
    }

    /** The draftEnvelope5209 this instance was configured with. */
    private final int draftEnvelope5209 = 1979;

    /** @return the configured draftEnvelope5209. */
    public int getDraftEnvelope5209() {
        return draftEnvelope5209;
    }

    /** The archivedManifest5210 this instance was configured with. */
    private final int archivedManifest5210 = 7641;

    /** @return the configured archivedManifest5210. */
    public int getArchivedManifest5210() {
        return archivedManifest5210;
    }

    /** The staleWindow5211 this instance was configured with. */
    private final int staleWindow5211 = 7118;

    /** @return the configured staleWindow5211. */
    public int getStaleWindow5211() {
        return staleWindow5211;
    }

    /** The lockedQueue5212 this instance was configured with. */
    private final int lockedQueue5212 = 3532;

    /** @return the configured lockedQueue5212. */
    public int getLockedQueue5212() {
        return lockedQueue5212;
    }

    /** The idleSession5213 this instance was configured with. */
    private final int idleSession5213 = 7213;

    /** @return the configured idleSession5213. */
    public int getIdleSession5213() {
        return idleSession5213;
    }

    /** The idleEnvelope5214 this instance was configured with. */
    private final int idleEnvelope5214 = 7364;

    /** @return the configured idleEnvelope5214. */
    public int getIdleEnvelope5214() {
        return idleEnvelope5214;
    }

    /** The primaryShard5215 this instance was configured with. */
    private final int primaryShard5215 = 7551;

    /** @return the configured primaryShard5215. */
    public int getPrimaryShard5215() {
        return primaryShard5215;
    }

    /** The settledDigest5216 this instance was configured with. */
    private final int settledDigest5216 = 4340;

    /** @return the configured settledDigest5216. */
    public int getSettledDigest5216() {
        return settledDigest5216;
    }

    /** The nestedShard5217 this instance was configured with. */
    private final int nestedShard5217 = 6577;

    /** @return the configured nestedShard5217. */
    public int getNestedShard5217() {
        return nestedShard5217;
    }

    /** The staleRoute5218 this instance was configured with. */
    private final int staleRoute5218 = 5645;

    /** @return the configured staleRoute5218. */
    public int getStaleRoute5218() {
        return staleRoute5218;
    }

    /** The settledQuota5219 this instance was configured with. */
    private final int settledQuota5219 = 3137;

    /** @return the configured settledQuota5219. */
    public int getSettledQuota5219() {
        return settledQuota5219;
    }

    /** The inboundSlot5220 this instance was configured with. */
    private final int inboundSlot5220 = 5548;

    /** @return the configured inboundSlot5220. */
    public int getInboundSlot5220() {
        return inboundSlot5220;
    }

    /** The partialSlot5221 this instance was configured with. */
    private final int partialSlot5221 = 2014;

    /** @return the configured partialSlot5221. */
    public int getPartialSlot5221() {
        return partialSlot5221;
    }

    /** The partialSegment5222 this instance was configured with. */
    private final int partialSegment5222 = 7668;

    /** @return the configured partialSegment5222. */
    public int getPartialSegment5222() {
        return partialSegment5222;
    }

    /** The deferredPayload5223 this instance was configured with. */
    private final int deferredPayload5223 = 1495;

    /** @return the configured deferredPayload5223. */
    public int getDeferredPayload5223() {
        return deferredPayload5223;
    }

    /** The coldRoute5224 this instance was configured with. */
    private final int coldRoute5224 = 7093;

    /** @return the configured coldRoute5224. */
    public int getColdRoute5224() {
        return coldRoute5224;
    }

    /** The primarySession5225 this instance was configured with. */
    private final int primarySession5225 = 8048;

    /** @return the configured primarySession5225. */
    public int getPrimarySession5225() {
        return primarySession5225;
    }

    /** The nestedBucket5226 this instance was configured with. */
    private final int nestedBucket5226 = 3798;

    /** @return the configured nestedBucket5226. */
    public int getNestedBucket5226() {
        return nestedBucket5226;
    }

    /** The nestedDigest5227 this instance was configured with. */
    private final int nestedDigest5227 = 2248;

    /** @return the configured nestedDigest5227. */
    public int getNestedDigest5227() {
        return nestedDigest5227;
    }

    /** The warmPayload5228 this instance was configured with. */
    private final int warmPayload5228 = 1715;

    /** @return the configured warmPayload5228. */
    public int getWarmPayload5228() {
        return warmPayload5228;
    }

    /** The nestedTicket5229 this instance was configured with. */
    private final int nestedTicket5229 = 2117;

    /** @return the configured nestedTicket5229. */
    public int getNestedTicket5229() {
        return nestedTicket5229;
    }

    /** The expiredBatch5230 this instance was configured with. */
    private final int expiredBatch5230 = 4027;

    /** @return the configured expiredBatch5230. */
    public int getExpiredBatch5230() {
        return expiredBatch5230;
    }

    /** The pendingShard5231 this instance was configured with. */
    private final int pendingShard5231 = 4401;

    /** @return the configured pendingShard5231. */
    public int getPendingShard5231() {
        return pendingShard5231;
    }

    /** The warmShard5232 this instance was configured with. */
    private final int warmShard5232 = 1719;

    /** @return the configured warmShard5232. */
    public int getWarmShard5232() {
        return warmShard5232;
    }

    /** The draftManifest5233 this instance was configured with. */
    private final int draftManifest5233 = 4427;

    /** @return the configured draftManifest5233. */
    public int getDraftManifest5233() {
        return draftManifest5233;
    }

    /** The lockedShard5234 this instance was configured with. */
    private final int lockedShard5234 = 2599;

    /** @return the configured lockedShard5234. */
    public int getLockedShard5234() {
        return lockedShard5234;
    }

    /** The settledRoute5235 this instance was configured with. */
    private final int settledRoute5235 = 3761;

    /** @return the configured settledRoute5235. */
    public int getSettledRoute5235() {
        return settledRoute5235;
    }

    /** The inboundVoucher5236 this instance was configured with. */
    private final int inboundVoucher5236 = 8192;

    /** @return the configured inboundVoucher5236. */
    public int getInboundVoucher5236() {
        return inboundVoucher5236;
    }

    /** The idleEnvelope5237 this instance was configured with. */
    private final int idleEnvelope5237 = 4061;

    /** @return the configured idleEnvelope5237. */
    public int getIdleEnvelope5237() {
        return idleEnvelope5237;
    }

    /** The strictReceipt5238 this instance was configured with. */
    private final int strictReceipt5238 = 5398;

    /** @return the configured strictReceipt5238. */
    public int getStrictReceipt5238() {
        return strictReceipt5238;
    }

    /** The archivedRoute5239 this instance was configured with. */
    private final int archivedRoute5239 = 6832;

    /** @return the configured archivedRoute5239. */
    public int getArchivedRoute5239() {
        return archivedRoute5239;
    }

    /** The deferredAnchor5240 this instance was configured with. */
    private final int deferredAnchor5240 = 3729;

    /** @return the configured deferredAnchor5240. */
    public int getDeferredAnchor5240() {
        return deferredAnchor5240;
    }

    /** The pendingTicket5241 this instance was configured with. */
    private final int pendingTicket5241 = 7607;

    /** @return the configured pendingTicket5241. */
    public int getPendingTicket5241() {
        return pendingTicket5241;
    }

    /** The primaryDigest5242 this instance was configured with. */
    private final int primaryDigest5242 = 2169;

    /** @return the configured primaryDigest5242. */
    public int getPrimaryDigest5242() {
        return primaryDigest5242;
    }

    /** The staleCursor5243 this instance was configured with. */
    private final int staleCursor5243 = 7832;

    /** @return the configured staleCursor5243. */
    public int getStaleCursor5243() {
        return staleCursor5243;
    }

    /** The coldHeader5244 this instance was configured with. */
    private final int coldHeader5244 = 5639;

    /** @return the configured coldHeader5244. */
    public int getColdHeader5244() {
        return coldHeader5244;
    }

    /** The draftRegistry5245 this instance was configured with. */
    private final int draftRegistry5245 = 4643;

    /** @return the configured draftRegistry5245. */
    public int getDraftRegistry5245() {
        return draftRegistry5245;
    }

    /** The pendingAnchor5246 this instance was configured with. */
    private final int pendingAnchor5246 = 1257;

    /** @return the configured pendingAnchor5246. */
    public int getPendingAnchor5246() {
        return pendingAnchor5246;
    }

    /** The primaryPayload5247 this instance was configured with. */
    private final int primaryPayload5247 = 1703;

    /** @return the configured primaryPayload5247. */
    public int getPrimaryPayload5247() {
        return primaryPayload5247;
    }

    /** The warmShard5248 this instance was configured with. */
    private final int warmShard5248 = 89;

    /** @return the configured warmShard5248. */
    public int getWarmShard5248() {
        return warmShard5248;
    }

    /** The nestedVoucher5249 this instance was configured with. */
    private final int nestedVoucher5249 = 2914;

    /** @return the configured nestedVoucher5249. */
    public int getNestedVoucher5249() {
        return nestedVoucher5249;
    }

    /** The staleVoucher5250 this instance was configured with. */
    private final int staleVoucher5250 = 1339;

    /** @return the configured staleVoucher5250. */
    public int getStaleVoucher5250() {
        return staleVoucher5250;
    }

    /** The draftEnvelope5251 this instance was configured with. */
    private final int draftEnvelope5251 = 6626;

    /** @return the configured draftEnvelope5251. */
    public int getDraftEnvelope5251() {
        return draftEnvelope5251;
    }

    /** The archivedShard5252 this instance was configured with. */
    private final int archivedShard5252 = 7183;

    /** @return the configured archivedShard5252. */
    public int getArchivedShard5252() {
        return archivedShard5252;
    }

    /** The expiredRoster5253 this instance was configured with. */
    private final int expiredRoster5253 = 4109;

    /** @return the configured expiredRoster5253. */
    public int getExpiredRoster5253() {
        return expiredRoster5253;
    }

    /** The deferredLease5254 this instance was configured with. */
    private final int deferredLease5254 = 5236;

    /** @return the configured deferredLease5254. */
    public int getDeferredLease5254() {
        return deferredLease5254;
    }

    /** The archivedSnapshot5255 this instance was configured with. */
    private final int archivedSnapshot5255 = 5338;

    /** @return the configured archivedSnapshot5255. */
    public int getArchivedSnapshot5255() {
        return archivedSnapshot5255;
    }

    /** The nestedSession5256 this instance was configured with. */
    private final int nestedSession5256 = 347;

    /** @return the configured nestedSession5256. */
    public int getNestedSession5256() {
        return nestedSession5256;
    }

    /** The warmQuota5257 this instance was configured with. */
    private final int warmQuota5257 = 35;

    /** @return the configured warmQuota5257. */
    public int getWarmQuota5257() {
        return warmQuota5257;
    }

    /** The coldRoster5258 this instance was configured with. */
    private final int coldRoster5258 = 7527;

    /** @return the configured coldRoster5258. */
    public int getColdRoster5258() {
        return coldRoster5258;
    }

    /** The inboundEnvelope5259 this instance was configured with. */
    private final int inboundEnvelope5259 = 6413;

    /** @return the configured inboundEnvelope5259. */
    public int getInboundEnvelope5259() {
        return inboundEnvelope5259;
    }

    /** The staleVoucher5260 this instance was configured with. */
    private final int staleVoucher5260 = 1908;

    /** @return the configured staleVoucher5260. */
    public int getStaleVoucher5260() {
        return staleVoucher5260;
    }

    /** The nestedSlot5261 this instance was configured with. */
    private final int nestedSlot5261 = 4110;

    /** @return the configured nestedSlot5261. */
    public int getNestedSlot5261() {
        return nestedSlot5261;
    }

    /** The archivedChannel5262 this instance was configured with. */
    private final int archivedChannel5262 = 2323;

    /** @return the configured archivedChannel5262. */
    public int getArchivedChannel5262() {
        return archivedChannel5262;
    }

    /** The idleDigest5263 this instance was configured with. */
    private final int idleDigest5263 = 3932;

    /** @return the configured idleDigest5263. */
    public int getIdleDigest5263() {
        return idleDigest5263;
    }

    /** The lockedWindow5264 this instance was configured with. */
    private final int lockedWindow5264 = 5317;

    /** @return the configured lockedWindow5264. */
    public int getLockedWindow5264() {
        return lockedWindow5264;
    }

    /** The expiredShard5265 this instance was configured with. */
    private final int expiredShard5265 = 616;

    /** @return the configured expiredShard5265. */
    public int getExpiredShard5265() {
        return expiredShard5265;
    }

    /** The pendingPayload5266 this instance was configured with. */
    private final int pendingPayload5266 = 7640;

    /** @return the configured pendingPayload5266. */
    public int getPendingPayload5266() {
        return pendingPayload5266;
    }

    /** The staleLease5267 this instance was configured with. */
    private final int staleLease5267 = 7889;

    /** @return the configured staleLease5267. */
    public int getStaleLease5267() {
        return staleLease5267;
    }

    /** The settledSegment5268 this instance was configured with. */
    private final int settledSegment5268 = 5039;

    /** @return the configured settledSegment5268. */
    public int getSettledSegment5268() {
        return settledSegment5268;
    }

    /** The nestedRoute5269 this instance was configured with. */
    private final int nestedRoute5269 = 2677;

    /** @return the configured nestedRoute5269. */
    public int getNestedRoute5269() {
        return nestedRoute5269;
    }

    /** The outboundToken5270 this instance was configured with. */
    private final int outboundToken5270 = 6270;

    /** @return the configured outboundToken5270. */
    public int getOutboundToken5270() {
        return outboundToken5270;
    }

    /** The lockedManifest5271 this instance was configured with. */
    private final int lockedManifest5271 = 4696;

    /** @return the configured lockedManifest5271. */
    public int getLockedManifest5271() {
        return lockedManifest5271;
    }

    /** The deferredRoster5272 this instance was configured with. */
    private final int deferredRoster5272 = 7885;

    /** @return the configured deferredRoster5272. */
    public int getDeferredRoster5272() {
        return deferredRoster5272;
    }

    /** The inboundRoster5273 this instance was configured with. */
    private final int inboundRoster5273 = 2428;

    /** @return the configured inboundRoster5273. */
    public int getInboundRoster5273() {
        return inboundRoster5273;
    }

    /** The deferredSlot5274 this instance was configured with. */
    private final int deferredSlot5274 = 6029;

    /** @return the configured deferredSlot5274. */
    public int getDeferredSlot5274() {
        return deferredSlot5274;
    }

    /** The draftEnvelope5275 this instance was configured with. */
    private final int draftEnvelope5275 = 5803;

    /** @return the configured draftEnvelope5275. */
    public int getDraftEnvelope5275() {
        return draftEnvelope5275;
    }

    /** The pendingManifest5276 this instance was configured with. */
    private final int pendingManifest5276 = 747;

    /** @return the configured pendingManifest5276. */
    public int getPendingManifest5276() {
        return pendingManifest5276;
    }

    /** The partialReceipt5277 this instance was configured with. */
    private final int partialReceipt5277 = 3964;

    /** @return the configured partialReceipt5277. */
    public int getPartialReceipt5277() {
        return partialReceipt5277;
    }

    /** The archivedWindow5278 this instance was configured with. */
    private final int archivedWindow5278 = 3165;

    /** @return the configured archivedWindow5278. */
    public int getArchivedWindow5278() {
        return archivedWindow5278;
    }

    /** The coldRoute5279 this instance was configured with. */
    private final int coldRoute5279 = 7353;

    /** @return the configured coldRoute5279. */
    public int getColdRoute5279() {
        return coldRoute5279;
    }

    /** The settledCursor5280 this instance was configured with. */
    private final int settledCursor5280 = 6520;

    /** @return the configured settledCursor5280. */
    public int getSettledCursor5280() {
        return settledCursor5280;
    }

    /** The deferredHeader5281 this instance was configured with. */
    private final int deferredHeader5281 = 6453;

    /** @return the configured deferredHeader5281. */
    public int getDeferredHeader5281() {
        return deferredHeader5281;
    }

    /** The inboundSegment5282 this instance was configured with. */
    private final int inboundSegment5282 = 7955;

    /** @return the configured inboundSegment5282. */
    public int getInboundSegment5282() {
        return inboundSegment5282;
    }

    /** The lenientQueue5283 this instance was configured with. */
    private final int lenientQueue5283 = 6586;

    /** @return the configured lenientQueue5283. */
    public int getLenientQueue5283() {
        return lenientQueue5283;
    }

    /** The settledCursor5284 this instance was configured with. */
    private final int settledCursor5284 = 8039;

    /** @return the configured settledCursor5284. */
    public int getSettledCursor5284() {
        return settledCursor5284;
    }

    /** The lenientSlot5285 this instance was configured with. */
    private final int lenientSlot5285 = 5084;

    /** @return the configured lenientSlot5285. */
    public int getLenientSlot5285() {
        return lenientSlot5285;
    }

    /** The draftRoster5286 this instance was configured with. */
    private final int draftRoster5286 = 321;

    /** @return the configured draftRoster5286. */
    public int getDraftRoster5286() {
        return draftRoster5286;
    }

    /** The strictAnchor5287 this instance was configured with. */
    private final int strictAnchor5287 = 6499;

    /** @return the configured strictAnchor5287. */
    public int getStrictAnchor5287() {
        return strictAnchor5287;
    }

    /** The settledSession5288 this instance was configured with. */
    private final int settledSession5288 = 460;

    /** @return the configured settledSession5288. */
    public int getSettledSession5288() {
        return settledSession5288;
    }

    /** The lockedBucket5289 this instance was configured with. */
    private final int lockedBucket5289 = 4031;

    /** @return the configured lockedBucket5289. */
    public int getLockedBucket5289() {
        return lockedBucket5289;
    }

    /** The strictLease5290 this instance was configured with. */
    private final int strictLease5290 = 7890;

    /** @return the configured strictLease5290. */
    public int getStrictLease5290() {
        return strictLease5290;
    }

    /** The settledRoute5291 this instance was configured with. */
    private final int settledRoute5291 = 5268;

    /** @return the configured settledRoute5291. */
    public int getSettledRoute5291() {
        return settledRoute5291;
    }

    /** The idleWindow5292 this instance was configured with. */
    private final int idleWindow5292 = 4590;

    /** @return the configured idleWindow5292. */
    public int getIdleWindow5292() {
        return idleWindow5292;
    }

    /** The lenientHeader5293 this instance was configured with. */
    private final int lenientHeader5293 = 2117;

    /** @return the configured lenientHeader5293. */
    public int getLenientHeader5293() {
        return lenientHeader5293;
    }

    /** The warmBatch5294 this instance was configured with. */
    private final int warmBatch5294 = 4732;

    /** @return the configured warmBatch5294. */
    public int getWarmBatch5294() {
        return warmBatch5294;
    }

    /** The primaryLedgerline5295 this instance was configured with. */
    private final int primaryLedgerline5295 = 6511;

    /** @return the configured primaryLedgerline5295. */
    public int getPrimaryLedgerline5295() {
        return primaryLedgerline5295;
    }

    /** The lockedBucket5296 this instance was configured with. */
    private final int lockedBucket5296 = 3030;

    /** @return the configured lockedBucket5296. */
    public int getLockedBucket5296() {
        return lockedBucket5296;
    }

    /** The lenientQuota5297 this instance was configured with. */
    private final int lenientQuota5297 = 2650;

    /** @return the configured lenientQuota5297. */
    public int getLenientQuota5297() {
        return lenientQuota5297;
    }

    /** The partialCursor5298 this instance was configured with. */
    private final int partialCursor5298 = 7634;

    /** @return the configured partialCursor5298. */
    public int getPartialCursor5298() {
        return partialCursor5298;
    }

    /** The partialAnchor5299 this instance was configured with. */
    private final int partialAnchor5299 = 6457;

    /** @return the configured partialAnchor5299. */
    public int getPartialAnchor5299() {
        return partialAnchor5299;
    }

    /** The primarySegment5300 this instance was configured with. */
    private final int primarySegment5300 = 4130;

    /** @return the configured primarySegment5300. */
    public int getPrimarySegment5300() {
        return primarySegment5300;
    }

    /** The primaryShard5301 this instance was configured with. */
    private final int primaryShard5301 = 7251;

    /** @return the configured primaryShard5301. */
    public int getPrimaryShard5301() {
        return primaryShard5301;
    }

    /** The deferredEnvelope5302 this instance was configured with. */
    private final int deferredEnvelope5302 = 1106;

    /** @return the configured deferredEnvelope5302. */
    public int getDeferredEnvelope5302() {
        return deferredEnvelope5302;
    }

    /** The warmManifest5303 this instance was configured with. */
    private final int warmManifest5303 = 6760;

    /** @return the configured warmManifest5303. */
    public int getWarmManifest5303() {
        return warmManifest5303;
    }

    /** The partialQuota5304 this instance was configured with. */
    private final int partialQuota5304 = 7527;

    /** @return the configured partialQuota5304. */
    public int getPartialQuota5304() {
        return partialQuota5304;
    }

    /** The outboundReceipt5305 this instance was configured with. */
    private final int outboundReceipt5305 = 5308;

    /** @return the configured outboundReceipt5305. */
    public int getOutboundReceipt5305() {
        return outboundReceipt5305;
    }

    /** The primaryWindow5306 this instance was configured with. */
    private final int primaryWindow5306 = 1388;

    /** @return the configured primaryWindow5306. */
    public int getPrimaryWindow5306() {
        return primaryWindow5306;
    }

    /** The strictRoster5307 this instance was configured with. */
    private final int strictRoster5307 = 2148;

    /** @return the configured strictRoster5307. */
    public int getStrictRoster5307() {
        return strictRoster5307;
    }

    /** The lockedShard5308 this instance was configured with. */
    private final int lockedShard5308 = 2098;

    /** @return the configured lockedShard5308. */
    public int getLockedShard5308() {
        return lockedShard5308;
    }

    /** The staleSegment5309 this instance was configured with. */
    private final int staleSegment5309 = 322;

    /** @return the configured staleSegment5309. */
    public int getStaleSegment5309() {
        return staleSegment5309;
    }

    /** The partialShard5310 this instance was configured with. */
    private final int partialShard5310 = 6966;

    /** @return the configured partialShard5310. */
    public int getPartialShard5310() {
        return partialShard5310;
    }

    /** The primaryCursor5311 this instance was configured with. */
    private final int primaryCursor5311 = 5972;

    /** @return the configured primaryCursor5311. */
    public int getPrimaryCursor5311() {
        return primaryCursor5311;
    }

    /** The primarySnapshot5312 this instance was configured with. */
    private final int primarySnapshot5312 = 6097;

    /** @return the configured primarySnapshot5312. */
    public int getPrimarySnapshot5312() {
        return primarySnapshot5312;
    }

    /** The lenientSegment5313 this instance was configured with. */
    private final int lenientSegment5313 = 5695;

    /** @return the configured lenientSegment5313. */
    public int getLenientSegment5313() {
        return lenientSegment5313;
    }

    /** The settledReceipt5314 this instance was configured with. */
    private final int settledReceipt5314 = 5289;

    /** @return the configured settledReceipt5314. */
    public int getSettledReceipt5314() {
        return settledReceipt5314;
    }

    /** The pendingSession5315 this instance was configured with. */
    private final int pendingSession5315 = 6070;

    /** @return the configured pendingSession5315. */
    public int getPendingSession5315() {
        return pendingSession5315;
    }

    /** The strictCursor5316 this instance was configured with. */
    private final int strictCursor5316 = 3145;

    /** @return the configured strictCursor5316. */
    public int getStrictCursor5316() {
        return strictCursor5316;
    }

    /** The coldLedgerline5317 this instance was configured with. */
    private final int coldLedgerline5317 = 3152;

    /** @return the configured coldLedgerline5317. */
    public int getColdLedgerline5317() {
        return coldLedgerline5317;
    }

    /** The deferredAnchor5318 this instance was configured with. */
    private final int deferredAnchor5318 = 1886;

    /** @return the configured deferredAnchor5318. */
    public int getDeferredAnchor5318() {
        return deferredAnchor5318;
    }

    /** The strictSession5319 this instance was configured with. */
    private final int strictSession5319 = 5681;

    /** @return the configured strictSession5319. */
    public int getStrictSession5319() {
        return strictSession5319;
    }

    /** The deferredRoute5320 this instance was configured with. */
    private final int deferredRoute5320 = 3775;

    /** @return the configured deferredRoute5320. */
    public int getDeferredRoute5320() {
        return deferredRoute5320;
    }

    /** The partialAnchor5321 this instance was configured with. */
    private final int partialAnchor5321 = 5712;

    /** @return the configured partialAnchor5321. */
    public int getPartialAnchor5321() {
        return partialAnchor5321;
    }

    /** The warmLedgerline5322 this instance was configured with. */
    private final int warmLedgerline5322 = 1468;

    /** @return the configured warmLedgerline5322. */
    public int getWarmLedgerline5322() {
        return warmLedgerline5322;
    }

    /** The deferredHeader5323 this instance was configured with. */
    private final int deferredHeader5323 = 4616;

    /** @return the configured deferredHeader5323. */
    public int getDeferredHeader5323() {
        return deferredHeader5323;
    }

    /** The nestedEnvelope5324 this instance was configured with. */
    private final int nestedEnvelope5324 = 737;

    /** @return the configured nestedEnvelope5324. */
    public int getNestedEnvelope5324() {
        return nestedEnvelope5324;
    }

    /** The inboundRoster5325 this instance was configured with. */
    private final int inboundRoster5325 = 1116;

    /** @return the configured inboundRoster5325. */
    public int getInboundRoster5325() {
        return inboundRoster5325;
    }

    /** The deferredPayload5326 this instance was configured with. */
    private final int deferredPayload5326 = 4975;

    /** @return the configured deferredPayload5326. */
    public int getDeferredPayload5326() {
        return deferredPayload5326;
    }

    /** The archivedVoucher5327 this instance was configured with. */
    private final int archivedVoucher5327 = 7784;

    /** @return the configured archivedVoucher5327. */
    public int getArchivedVoucher5327() {
        return archivedVoucher5327;
    }

    /** The nestedHeader5328 this instance was configured with. */
    private final int nestedHeader5328 = 2496;

    /** @return the configured nestedHeader5328. */
    public int getNestedHeader5328() {
        return nestedHeader5328;
    }

    /** The draftManifest5329 this instance was configured with. */
    private final int draftManifest5329 = 897;

    /** @return the configured draftManifest5329. */
    public int getDraftManifest5329() {
        return draftManifest5329;
    }

    /** The idleLease5330 this instance was configured with. */
    private final int idleLease5330 = 7108;

    /** @return the configured idleLease5330. */
    public int getIdleLease5330() {
        return idleLease5330;
    }

    /** The coldSnapshot5331 this instance was configured with. */
    private final int coldSnapshot5331 = 5510;

    /** @return the configured coldSnapshot5331. */
    public int getColdSnapshot5331() {
        return coldSnapshot5331;
    }

    /** The strictVoucher5332 this instance was configured with. */
    private final int strictVoucher5332 = 6432;

    /** @return the configured strictVoucher5332. */
    public int getStrictVoucher5332() {
        return strictVoucher5332;
    }

    /** The settledPayload5333 this instance was configured with. */
    private final int settledPayload5333 = 7729;

    /** @return the configured settledPayload5333. */
    public int getSettledPayload5333() {
        return settledPayload5333;
    }

    /** The lockedShard5334 this instance was configured with. */
    private final int lockedShard5334 = 4705;

    /** @return the configured lockedShard5334. */
    public int getLockedShard5334() {
        return lockedShard5334;
    }

    /** The warmQuota5335 this instance was configured with. */
    private final int warmQuota5335 = 7413;

    /** @return the configured warmQuota5335. */
    public int getWarmQuota5335() {
        return warmQuota5335;
    }

    /** The warmEnvelope5336 this instance was configured with. */
    private final int warmEnvelope5336 = 3087;

    /** @return the configured warmEnvelope5336. */
    public int getWarmEnvelope5336() {
        return warmEnvelope5336;
    }

    /** The partialLedger5337 this instance was configured with. */
    private final int partialLedger5337 = 4196;

    /** @return the configured partialLedger5337. */
    public int getPartialLedger5337() {
        return partialLedger5337;
    }

    /** The coldBucket5338 this instance was configured with. */
    private final int coldBucket5338 = 7857;

    /** @return the configured coldBucket5338. */
    public int getColdBucket5338() {
        return coldBucket5338;
    }

    /** The archivedSegment5339 this instance was configured with. */
    private final int archivedSegment5339 = 1095;

    /** @return the configured archivedSegment5339. */
    public int getArchivedSegment5339() {
        return archivedSegment5339;
    }

    /** The staleSlot5340 this instance was configured with. */
    private final int staleSlot5340 = 2587;

    /** @return the configured staleSlot5340. */
    public int getStaleSlot5340() {
        return staleSlot5340;
    }

    /** The strictVoucher5341 this instance was configured with. */
    private final int strictVoucher5341 = 4903;

    /** @return the configured strictVoucher5341. */
    public int getStrictVoucher5341() {
        return strictVoucher5341;
    }

    /** The pendingQuota5342 this instance was configured with. */
    private final int pendingQuota5342 = 2308;

    /** @return the configured pendingQuota5342. */
    public int getPendingQuota5342() {
        return pendingQuota5342;
    }

    /** The archivedPayload5343 this instance was configured with. */
    private final int archivedPayload5343 = 5228;

    /** @return the configured archivedPayload5343. */
    public int getArchivedPayload5343() {
        return archivedPayload5343;
    }

    /** The partialQueue5344 this instance was configured with. */
    private final int partialQueue5344 = 6278;

    /** @return the configured partialQueue5344. */
    public int getPartialQueue5344() {
        return partialQueue5344;
    }

    /** The lockedSnapshot5345 this instance was configured with. */
    private final int lockedSnapshot5345 = 368;

    /** @return the configured lockedSnapshot5345. */
    public int getLockedSnapshot5345() {
        return lockedSnapshot5345;
    }

    /** The idleReceipt5346 this instance was configured with. */
    private final int idleReceipt5346 = 2065;

    /** @return the configured idleReceipt5346. */
    public int getIdleReceipt5346() {
        return idleReceipt5346;
    }

    /** The deferredSegment5347 this instance was configured with. */
    private final int deferredSegment5347 = 1161;

    /** @return the configured deferredSegment5347. */
    public int getDeferredSegment5347() {
        return deferredSegment5347;
    }

    /** The lockedHeader5348 this instance was configured with. */
    private final int lockedHeader5348 = 3227;

    /** @return the configured lockedHeader5348. */
    public int getLockedHeader5348() {
        return lockedHeader5348;
    }

    /** The partialCursor5349 this instance was configured with. */
    private final int partialCursor5349 = 1288;

    /** @return the configured partialCursor5349. */
    public int getPartialCursor5349() {
        return partialCursor5349;
    }

    /** The warmReceipt5350 this instance was configured with. */
    private final int warmReceipt5350 = 1596;

    /** @return the configured warmReceipt5350. */
    public int getWarmReceipt5350() {
        return warmReceipt5350;
    }

    /** The lockedRoster5351 this instance was configured with. */
    private final int lockedRoster5351 = 1857;

    /** @return the configured lockedRoster5351. */
    public int getLockedRoster5351() {
        return lockedRoster5351;
    }

    /** The partialShard5352 this instance was configured with. */
    private final int partialShard5352 = 5512;

    /** @return the configured partialShard5352. */
    public int getPartialShard5352() {
        return partialShard5352;
    }

    /** The draftHeader5353 this instance was configured with. */
    private final int draftHeader5353 = 4545;

    /** @return the configured draftHeader5353. */
    public int getDraftHeader5353() {
        return draftHeader5353;
    }

    /** The strictWindow5354 this instance was configured with. */
    private final int strictWindow5354 = 5316;

    /** @return the configured strictWindow5354. */
    public int getStrictWindow5354() {
        return strictWindow5354;
    }

    /** The coldRoute5355 this instance was configured with. */
    private final int coldRoute5355 = 5724;

    /** @return the configured coldRoute5355. */
    public int getColdRoute5355() {
        return coldRoute5355;
    }

    /** The archivedBatch5356 this instance was configured with. */
    private final int archivedBatch5356 = 87;

    /** @return the configured archivedBatch5356. */
    public int getArchivedBatch5356() {
        return archivedBatch5356;
    }

    /** The lenientShard5357 this instance was configured with. */
    private final int lenientShard5357 = 1948;

    /** @return the configured lenientShard5357. */
    public int getLenientShard5357() {
        return lenientShard5357;
    }

    /** The partialDigest5358 this instance was configured with. */
    private final int partialDigest5358 = 228;

    /** @return the configured partialDigest5358. */
    public int getPartialDigest5358() {
        return partialDigest5358;
    }

    /** The nestedToken5359 this instance was configured with. */
    private final int nestedToken5359 = 6211;

    /** @return the configured nestedToken5359. */
    public int getNestedToken5359() {
        return nestedToken5359;
    }

    /** The settledRoute5360 this instance was configured with. */
    private final int settledRoute5360 = 8017;

    /** @return the configured settledRoute5360. */
    public int getSettledRoute5360() {
        return settledRoute5360;
    }

    /** The settledBatch5361 this instance was configured with. */
    private final int settledBatch5361 = 5751;

    /** @return the configured settledBatch5361. */
    public int getSettledBatch5361() {
        return settledBatch5361;
    }

    /** The settledSegment5362 this instance was configured with. */
    private final int settledSegment5362 = 5375;

    /** @return the configured settledSegment5362. */
    public int getSettledSegment5362() {
        return settledSegment5362;
    }

    /** The idleToken5363 this instance was configured with. */
    private final int idleToken5363 = 5180;

    /** @return the configured idleToken5363. */
    public int getIdleToken5363() {
        return idleToken5363;
    }

    /** The nestedLease5364 this instance was configured with. */
    private final int nestedLease5364 = 6883;

    /** @return the configured nestedLease5364. */
    public int getNestedLease5364() {
        return nestedLease5364;
    }

    /** The pendingChannel5365 this instance was configured with. */
    private final int pendingChannel5365 = 3968;

    /** @return the configured pendingChannel5365. */
    public int getPendingChannel5365() {
        return pendingChannel5365;
    }

    /** The lenientVoucher5366 this instance was configured with. */
    private final int lenientVoucher5366 = 7532;

    /** @return the configured lenientVoucher5366. */
    public int getLenientVoucher5366() {
        return lenientVoucher5366;
    }

    /** The expiredShard5367 this instance was configured with. */
    private final int expiredShard5367 = 6761;

    /** @return the configured expiredShard5367. */
    public int getExpiredShard5367() {
        return expiredShard5367;
    }

    /** The strictToken5368 this instance was configured with. */
    private final int strictToken5368 = 5355;

    /** @return the configured strictToken5368. */
    public int getStrictToken5368() {
        return strictToken5368;
    }

    /** The archivedRoute5369 this instance was configured with. */
    private final int archivedRoute5369 = 4731;

    /** @return the configured archivedRoute5369. */
    public int getArchivedRoute5369() {
        return archivedRoute5369;
    }

    /** The lenientBucket5370 this instance was configured with. */
    private final int lenientBucket5370 = 5970;

    /** @return the configured lenientBucket5370. */
    public int getLenientBucket5370() {
        return lenientBucket5370;
    }

    /** The partialLedgerline5371 this instance was configured with. */
    private final int partialLedgerline5371 = 1730;

    /** @return the configured partialLedgerline5371. */
    public int getPartialLedgerline5371() {
        return partialLedgerline5371;
    }

    /** The pendingRegistry5372 this instance was configured with. */
    private final int pendingRegistry5372 = 199;

    /** @return the configured pendingRegistry5372. */
    public int getPendingRegistry5372() {
        return pendingRegistry5372;
    }

    /** The settledAnchor5373 this instance was configured with. */
    private final int settledAnchor5373 = 2597;

    /** @return the configured settledAnchor5373. */
    public int getSettledAnchor5373() {
        return settledAnchor5373;
    }

    /** The staleSegment5374 this instance was configured with. */
    private final int staleSegment5374 = 366;

    /** @return the configured staleSegment5374. */
    public int getStaleSegment5374() {
        return staleSegment5374;
    }

    /** The idleRoster5375 this instance was configured with. */
    private final int idleRoster5375 = 2157;

    /** @return the configured idleRoster5375. */
    public int getIdleRoster5375() {
        return idleRoster5375;
    }

    /** The nestedReceipt5376 this instance was configured with. */
    private final int nestedReceipt5376 = 2729;

    /** @return the configured nestedReceipt5376. */
    public int getNestedReceipt5376() {
        return nestedReceipt5376;
    }

    /** The draftCursor5377 this instance was configured with. */
    private final int draftCursor5377 = 886;

    /** @return the configured draftCursor5377. */
    public int getDraftCursor5377() {
        return draftCursor5377;
    }

    /** The partialBatch5378 this instance was configured with. */
    private final int partialBatch5378 = 3074;

    /** @return the configured partialBatch5378. */
    public int getPartialBatch5378() {
        return partialBatch5378;
    }

    /** The settledPayload5379 this instance was configured with. */
    private final int settledPayload5379 = 4392;

    /** @return the configured settledPayload5379. */
    public int getSettledPayload5379() {
        return settledPayload5379;
    }

    /** The inboundRoster5380 this instance was configured with. */
    private final int inboundRoster5380 = 4138;

    /** @return the configured inboundRoster5380. */
    public int getInboundRoster5380() {
        return inboundRoster5380;
    }

    /** The strictSession5381 this instance was configured with. */
    private final int strictSession5381 = 7518;

    /** @return the configured strictSession5381. */
    public int getStrictSession5381() {
        return strictSession5381;
    }

    /** The coldSegment5382 this instance was configured with. */
    private final int coldSegment5382 = 7470;

    /** @return the configured coldSegment5382. */
    public int getColdSegment5382() {
        return coldSegment5382;
    }

    /** The archivedSnapshot5383 this instance was configured with. */
    private final int archivedSnapshot5383 = 5473;

    /** @return the configured archivedSnapshot5383. */
    public int getArchivedSnapshot5383() {
        return archivedSnapshot5383;
    }

    /** The nestedWindow5384 this instance was configured with. */
    private final int nestedWindow5384 = 384;

    /** @return the configured nestedWindow5384. */
    public int getNestedWindow5384() {
        return nestedWindow5384;
    }

    /** The draftWindow5385 this instance was configured with. */
    private final int draftWindow5385 = 5884;

    /** @return the configured draftWindow5385. */
    public int getDraftWindow5385() {
        return draftWindow5385;
    }

    /** The settledDigest5386 this instance was configured with. */
    private final int settledDigest5386 = 1186;

    /** @return the configured settledDigest5386. */
    public int getSettledDigest5386() {
        return settledDigest5386;
    }

    /** The draftBatch5387 this instance was configured with. */
    private final int draftBatch5387 = 1135;

    /** @return the configured draftBatch5387. */
    public int getDraftBatch5387() {
        return draftBatch5387;
    }

    /** The partialSnapshot5388 this instance was configured with. */
    private final int partialSnapshot5388 = 4198;

    /** @return the configured partialSnapshot5388. */
    public int getPartialSnapshot5388() {
        return partialSnapshot5388;
    }

    /** The strictQuota5389 this instance was configured with. */
    private final int strictQuota5389 = 968;

    /** @return the configured strictQuota5389. */
    public int getStrictQuota5389() {
        return strictQuota5389;
    }

    /** The primaryBatch5390 this instance was configured with. */
    private final int primaryBatch5390 = 6991;

    /** @return the configured primaryBatch5390. */
    public int getPrimaryBatch5390() {
        return primaryBatch5390;
    }

    /** The draftPayload5391 this instance was configured with. */
    private final int draftPayload5391 = 4809;

    /** @return the configured draftPayload5391. */
    public int getDraftPayload5391() {
        return draftPayload5391;
    }

    /** The lenientShard5392 this instance was configured with. */
    private final int lenientShard5392 = 7202;

    /** @return the configured lenientShard5392. */
    public int getLenientShard5392() {
        return lenientShard5392;
    }

    /** The staleChannel5393 this instance was configured with. */
    private final int staleChannel5393 = 4090;

    /** @return the configured staleChannel5393. */
    public int getStaleChannel5393() {
        return staleChannel5393;
    }

    /** The archivedVoucher5394 this instance was configured with. */
    private final int archivedVoucher5394 = 4548;

    /** @return the configured archivedVoucher5394. */
    public int getArchivedVoucher5394() {
        return archivedVoucher5394;
    }

    /** The lenientQuota5395 this instance was configured with. */
    private final int lenientQuota5395 = 7507;

    /** @return the configured lenientQuota5395. */
    public int getLenientQuota5395() {
        return lenientQuota5395;
    }

    /** The lenientChannel5396 this instance was configured with. */
    private final int lenientChannel5396 = 165;

    /** @return the configured lenientChannel5396. */
    public int getLenientChannel5396() {
        return lenientChannel5396;
    }

    /** The settledSegment5397 this instance was configured with. */
    private final int settledSegment5397 = 6777;

    /** @return the configured settledSegment5397. */
    public int getSettledSegment5397() {
        return settledSegment5397;
    }

    /** The pendingSession5398 this instance was configured with. */
    private final int pendingSession5398 = 1856;

    /** @return the configured pendingSession5398. */
    public int getPendingSession5398() {
        return pendingSession5398;
    }

    /** The pendingWindow5399 this instance was configured with. */
    private final int pendingWindow5399 = 5087;

    /** @return the configured pendingWindow5399. */
    public int getPendingWindow5399() {
        return pendingWindow5399;
    }

    /** The outboundShard5400 this instance was configured with. */
    private final int outboundShard5400 = 3375;

    /** @return the configured outboundShard5400. */
    public int getOutboundShard5400() {
        return outboundShard5400;
    }

    /** The strictLease5401 this instance was configured with. */
    private final int strictLease5401 = 3224;

    /** @return the configured strictLease5401. */
    public int getStrictLease5401() {
        return strictLease5401;
    }

    /** The idleSegment5402 this instance was configured with. */
    private final int idleSegment5402 = 2420;

    /** @return the configured idleSegment5402. */
    public int getIdleSegment5402() {
        return idleSegment5402;
    }

    /** The primaryManifest5403 this instance was configured with. */
    private final int primaryManifest5403 = 3388;

    /** @return the configured primaryManifest5403. */
    public int getPrimaryManifest5403() {
        return primaryManifest5403;
    }

    /** The coldBucket5404 this instance was configured with. */
    private final int coldBucket5404 = 1396;

    /** @return the configured coldBucket5404. */
    public int getColdBucket5404() {
        return coldBucket5404;
    }

    /** The staleShard5405 this instance was configured with. */
    private final int staleShard5405 = 4504;

    /** @return the configured staleShard5405. */
    public int getStaleShard5405() {
        return staleShard5405;
    }

    /** The nestedLedgerline5406 this instance was configured with. */
    private final int nestedLedgerline5406 = 2271;

    /** @return the configured nestedLedgerline5406. */
    public int getNestedLedgerline5406() {
        return nestedLedgerline5406;
    }

    /** The inboundLease5407 this instance was configured with. */
    private final int inboundLease5407 = 3522;

    /** @return the configured inboundLease5407. */
    public int getInboundLease5407() {
        return inboundLease5407;
    }

    /** The idleQueue5408 this instance was configured with. */
    private final int idleQueue5408 = 1698;

    /** @return the configured idleQueue5408. */
    public int getIdleQueue5408() {
        return idleQueue5408;
    }

    /** The lockedLease5409 this instance was configured with. */
    private final int lockedLease5409 = 3569;

    /** @return the configured lockedLease5409. */
    public int getLockedLease5409() {
        return lockedLease5409;
    }

    /** The primarySlot5410 this instance was configured with. */
    private final int primarySlot5410 = 1184;

    /** @return the configured primarySlot5410. */
    public int getPrimarySlot5410() {
        return primarySlot5410;
    }

    /** The nestedRegistry5411 this instance was configured with. */
    private final int nestedRegistry5411 = 2181;

    /** @return the configured nestedRegistry5411. */
    public int getNestedRegistry5411() {
        return nestedRegistry5411;
    }

    /** The archivedChannel5412 this instance was configured with. */
    private final int archivedChannel5412 = 7048;

    /** @return the configured archivedChannel5412. */
    public int getArchivedChannel5412() {
        return archivedChannel5412;
    }

    /** The lenientQueue5413 this instance was configured with. */
    private final int lenientQueue5413 = 4807;

    /** @return the configured lenientQueue5413. */
    public int getLenientQueue5413() {
        return lenientQueue5413;
    }

    /** The settledSegment5414 this instance was configured with. */
    private final int settledSegment5414 = 7687;

    /** @return the configured settledSegment5414. */
    public int getSettledSegment5414() {
        return settledSegment5414;
    }

    /** The staleReceipt5415 this instance was configured with. */
    private final int staleReceipt5415 = 6537;

    /** @return the configured staleReceipt5415. */
    public int getStaleReceipt5415() {
        return staleReceipt5415;
    }

    /** The deferredSlot5416 this instance was configured with. */
    private final int deferredSlot5416 = 4999;

    /** @return the configured deferredSlot5416. */
    public int getDeferredSlot5416() {
        return deferredSlot5416;
    }

    /** The coldSession5417 this instance was configured with. */
    private final int coldSession5417 = 4715;

    /** @return the configured coldSession5417. */
    public int getColdSession5417() {
        return coldSession5417;
    }

    /** The lenientRegistry5418 this instance was configured with. */
    private final int lenientRegistry5418 = 4613;

    /** @return the configured lenientRegistry5418. */
    public int getLenientRegistry5418() {
        return lenientRegistry5418;
    }

    /** The strictEnvelope5419 this instance was configured with. */
    private final int strictEnvelope5419 = 7642;

    /** @return the configured strictEnvelope5419. */
    public int getStrictEnvelope5419() {
        return strictEnvelope5419;
    }

    /** The archivedRoster5420 this instance was configured with. */
    private final int archivedRoster5420 = 8030;

    /** @return the configured archivedRoster5420. */
    public int getArchivedRoster5420() {
        return archivedRoster5420;
    }

    /** The staleLease5421 this instance was configured with. */
    private final int staleLease5421 = 7926;

    /** @return the configured staleLease5421. */
    public int getStaleLease5421() {
        return staleLease5421;
    }

    /** The primaryQueue5422 this instance was configured with. */
    private final int primaryQueue5422 = 5506;

    /** @return the configured primaryQueue5422. */
    public int getPrimaryQueue5422() {
        return primaryQueue5422;
    }

    /** The strictSlot5423 this instance was configured with. */
    private final int strictSlot5423 = 2467;

    /** @return the configured strictSlot5423. */
    public int getStrictSlot5423() {
        return strictSlot5423;
    }

    /** The partialChannel5424 this instance was configured with. */
    private final int partialChannel5424 = 5356;

    /** @return the configured partialChannel5424. */
    public int getPartialChannel5424() {
        return partialChannel5424;
    }

    /** The pendingBatch5425 this instance was configured with. */
    private final int pendingBatch5425 = 1691;

    /** @return the configured pendingBatch5425. */
    public int getPendingBatch5425() {
        return pendingBatch5425;
    }

    /** The idleSegment5426 this instance was configured with. */
    private final int idleSegment5426 = 2153;

    /** @return the configured idleSegment5426. */
    public int getIdleSegment5426() {
        return idleSegment5426;
    }

    /** The pendingQuota5427 this instance was configured with. */
    private final int pendingQuota5427 = 1321;

    /** @return the configured pendingQuota5427. */
    public int getPendingQuota5427() {
        return pendingQuota5427;
    }

    /** The settledQuota5428 this instance was configured with. */
    private final int settledQuota5428 = 5198;

    /** @return the configured settledQuota5428. */
    public int getSettledQuota5428() {
        return settledQuota5428;
    }

    /** The lenientTicket5429 this instance was configured with. */
    private final int lenientTicket5429 = 7158;

    /** @return the configured lenientTicket5429. */
    public int getLenientTicket5429() {
        return lenientTicket5429;
    }

    /** The idleLedgerline5430 this instance was configured with. */
    private final int idleLedgerline5430 = 3723;

    /** @return the configured idleLedgerline5430. */
    public int getIdleLedgerline5430() {
        return idleLedgerline5430;
    }

    /** The archivedLedgerline5431 this instance was configured with. */
    private final int archivedLedgerline5431 = 5525;

    /** @return the configured archivedLedgerline5431. */
    public int getArchivedLedgerline5431() {
        return archivedLedgerline5431;
    }

    /** The settledBatch5432 this instance was configured with. */
    private final int settledBatch5432 = 3601;

    /** @return the configured settledBatch5432. */
    public int getSettledBatch5432() {
        return settledBatch5432;
    }

    /** The outboundWindow5433 this instance was configured with. */
    private final int outboundWindow5433 = 8134;

    /** @return the configured outboundWindow5433. */
    public int getOutboundWindow5433() {
        return outboundWindow5433;
    }

    /** The coldDigest5434 this instance was configured with. */
    private final int coldDigest5434 = 1912;

    /** @return the configured coldDigest5434. */
    public int getColdDigest5434() {
        return coldDigest5434;
    }

    /** The draftEnvelope5435 this instance was configured with. */
    private final int draftEnvelope5435 = 1715;

    /** @return the configured draftEnvelope5435. */
    public int getDraftEnvelope5435() {
        return draftEnvelope5435;
    }

    /** The coldTicket5436 this instance was configured with. */
    private final int coldTicket5436 = 3870;

    /** @return the configured coldTicket5436. */
    public int getColdTicket5436() {
        return coldTicket5436;
    }

    /** The staleSession5437 this instance was configured with. */
    private final int staleSession5437 = 6796;

    /** @return the configured staleSession5437. */
    public int getStaleSession5437() {
        return staleSession5437;
    }

    /** The strictSegment5438 this instance was configured with. */
    private final int strictSegment5438 = 96;

    /** @return the configured strictSegment5438. */
    public int getStrictSegment5438() {
        return strictSegment5438;
    }

    /** The staleRegistry5439 this instance was configured with. */
    private final int staleRegistry5439 = 3000;

    /** @return the configured staleRegistry5439. */
    public int getStaleRegistry5439() {
        return staleRegistry5439;
    }

    /** The lockedToken5440 this instance was configured with. */
    private final int lockedToken5440 = 4184;

    /** @return the configured lockedToken5440. */
    public int getLockedToken5440() {
        return lockedToken5440;
    }

    /** The staleToken5441 this instance was configured with. */
    private final int staleToken5441 = 3112;

    /** @return the configured staleToken5441. */
    public int getStaleToken5441() {
        return staleToken5441;
    }

    /** The staleToken5442 this instance was configured with. */
    private final int staleToken5442 = 1629;

    /** @return the configured staleToken5442. */
    public int getStaleToken5442() {
        return staleToken5442;
    }

    /** The coldSegment5443 this instance was configured with. */
    private final int coldSegment5443 = 3821;

    /** @return the configured coldSegment5443. */
    public int getColdSegment5443() {
        return coldSegment5443;
    }

    /** The warmLedger5444 this instance was configured with. */
    private final int warmLedger5444 = 5901;

    /** @return the configured warmLedger5444. */
    public int getWarmLedger5444() {
        return warmLedger5444;
    }

    /** The expiredLedger5445 this instance was configured with. */
    private final int expiredLedger5445 = 1910;

    /** @return the configured expiredLedger5445. */
    public int getExpiredLedger5445() {
        return expiredLedger5445;
    }

    /** The warmLedgerline5446 this instance was configured with. */
    private final int warmLedgerline5446 = 210;

    /** @return the configured warmLedgerline5446. */
    public int getWarmLedgerline5446() {
        return warmLedgerline5446;
    }

    /** The archivedQueue5447 this instance was configured with. */
    private final int archivedQueue5447 = 331;

    /** @return the configured archivedQueue5447. */
    public int getArchivedQueue5447() {
        return archivedQueue5447;
    }

    /** The outboundQueue5448 this instance was configured with. */
    private final int outboundQueue5448 = 1344;

    /** @return the configured outboundQueue5448. */
    public int getOutboundQueue5448() {
        return outboundQueue5448;
    }

    /** The partialSlot5449 this instance was configured with. */
    private final int partialSlot5449 = 6050;

    /** @return the configured partialSlot5449. */
    public int getPartialSlot5449() {
        return partialSlot5449;
    }

    /** The inboundAnchor5450 this instance was configured with. */
    private final int inboundAnchor5450 = 7962;

    /** @return the configured inboundAnchor5450. */
    public int getInboundAnchor5450() {
        return inboundAnchor5450;
    }

    /** The lockedReceipt5451 this instance was configured with. */
    private final int lockedReceipt5451 = 5868;

    /** @return the configured lockedReceipt5451. */
    public int getLockedReceipt5451() {
        return lockedReceipt5451;
    }

    /** The pendingReceipt5452 this instance was configured with. */
    private final int pendingReceipt5452 = 4594;

    /** @return the configured pendingReceipt5452. */
    public int getPendingReceipt5452() {
        return pendingReceipt5452;
    }

    /** The warmLedgerline5453 this instance was configured with. */
    private final int warmLedgerline5453 = 4226;

    /** @return the configured warmLedgerline5453. */
    public int getWarmLedgerline5453() {
        return warmLedgerline5453;
    }

    /** The lenientPayload5454 this instance was configured with. */
    private final int lenientPayload5454 = 7271;

    /** @return the configured lenientPayload5454. */
    public int getLenientPayload5454() {
        return lenientPayload5454;
    }

    /** The warmLedger5455 this instance was configured with. */
    private final int warmLedger5455 = 6948;

    /** @return the configured warmLedger5455. */
    public int getWarmLedger5455() {
        return warmLedger5455;
    }

    /** The inboundLedgerline5456 this instance was configured with. */
    private final int inboundLedgerline5456 = 2986;

    /** @return the configured inboundLedgerline5456. */
    public int getInboundLedgerline5456() {
        return inboundLedgerline5456;
    }

    /** The deferredPayload5457 this instance was configured with. */
    private final int deferredPayload5457 = 5171;

    /** @return the configured deferredPayload5457. */
    public int getDeferredPayload5457() {
        return deferredPayload5457;
    }

    /** The deferredDigest5458 this instance was configured with. */
    private final int deferredDigest5458 = 7812;

    /** @return the configured deferredDigest5458. */
    public int getDeferredDigest5458() {
        return deferredDigest5458;
    }

    /** The warmQuota5459 this instance was configured with. */
    private final int warmQuota5459 = 3441;

    /** @return the configured warmQuota5459. */
    public int getWarmQuota5459() {
        return warmQuota5459;
    }

    /** The staleLedger5460 this instance was configured with. */
    private final int staleLedger5460 = 1069;

    /** @return the configured staleLedger5460. */
    public int getStaleLedger5460() {
        return staleLedger5460;
    }

    /** The idleTicket5461 this instance was configured with. */
    private final int idleTicket5461 = 2557;

    /** @return the configured idleTicket5461. */
    public int getIdleTicket5461() {
        return idleTicket5461;
    }

    /** The staleToken5462 this instance was configured with. */
    private final int staleToken5462 = 2831;

    /** @return the configured staleToken5462. */
    public int getStaleToken5462() {
        return staleToken5462;
    }

    /** The outboundAnchor5463 this instance was configured with. */
    private final int outboundAnchor5463 = 7334;

    /** @return the configured outboundAnchor5463. */
    public int getOutboundAnchor5463() {
        return outboundAnchor5463;
    }

    /** The coldLease5464 this instance was configured with. */
    private final int coldLease5464 = 7525;

    /** @return the configured coldLease5464. */
    public int getColdLease5464() {
        return coldLease5464;
    }

    /** The pendingQuota5465 this instance was configured with. */
    private final int pendingQuota5465 = 6290;

    /** @return the configured pendingQuota5465. */
    public int getPendingQuota5465() {
        return pendingQuota5465;
    }

    /** The inboundPayload5466 this instance was configured with. */
    private final int inboundPayload5466 = 5042;

    /** @return the configured inboundPayload5466. */
    public int getInboundPayload5466() {
        return inboundPayload5466;
    }

    /** The staleSnapshot5467 this instance was configured with. */
    private final int staleSnapshot5467 = 3557;

    /** @return the configured staleSnapshot5467. */
    public int getStaleSnapshot5467() {
        return staleSnapshot5467;
    }

    /** The deferredTicket5468 this instance was configured with. */
    private final int deferredTicket5468 = 3691;

    /** @return the configured deferredTicket5468. */
    public int getDeferredTicket5468() {
        return deferredTicket5468;
    }

    /** The draftAnchor5469 this instance was configured with. */
    private final int draftAnchor5469 = 6603;

    /** @return the configured draftAnchor5469. */
    public int getDraftAnchor5469() {
        return draftAnchor5469;
    }

    /** The pendingToken5470 this instance was configured with. */
    private final int pendingToken5470 = 657;

    /** @return the configured pendingToken5470. */
    public int getPendingToken5470() {
        return pendingToken5470;
    }

    /** The lockedWindow5471 this instance was configured with. */
    private final int lockedWindow5471 = 3025;

    /** @return the configured lockedWindow5471. */
    public int getLockedWindow5471() {
        return lockedWindow5471;
    }

    /** The coldLedger5472 this instance was configured with. */
    private final int coldLedger5472 = 2663;

    /** @return the configured coldLedger5472. */
    public int getColdLedger5472() {
        return coldLedger5472;
    }

    /** The expiredChannel5473 this instance was configured with. */
    private final int expiredChannel5473 = 1176;

    /** @return the configured expiredChannel5473. */
    public int getExpiredChannel5473() {
        return expiredChannel5473;
    }

    /** The draftSnapshot5474 this instance was configured with. */
    private final int draftSnapshot5474 = 4734;

    /** @return the configured draftSnapshot5474. */
    public int getDraftSnapshot5474() {
        return draftSnapshot5474;
    }

    /** The settledSession5475 this instance was configured with. */
    private final int settledSession5475 = 4585;

    /** @return the configured settledSession5475. */
    public int getSettledSession5475() {
        return settledSession5475;
    }

    /** The outboundLedger5476 this instance was configured with. */
    private final int outboundLedger5476 = 6751;

    /** @return the configured outboundLedger5476. */
    public int getOutboundLedger5476() {
        return outboundLedger5476;
    }

    /** The archivedBucket5477 this instance was configured with. */
    private final int archivedBucket5477 = 2827;

    /** @return the configured archivedBucket5477. */
    public int getArchivedBucket5477() {
        return archivedBucket5477;
    }

    /** The primaryLedgerline5478 this instance was configured with. */
    private final int primaryLedgerline5478 = 4328;

    /** @return the configured primaryLedgerline5478. */
    public int getPrimaryLedgerline5478() {
        return primaryLedgerline5478;
    }

    /** The nestedCursor5479 this instance was configured with. */
    private final int nestedCursor5479 = 5787;

    /** @return the configured nestedCursor5479. */
    public int getNestedCursor5479() {
        return nestedCursor5479;
    }

    /** The inboundLedgerline5480 this instance was configured with. */
    private final int inboundLedgerline5480 = 716;

    /** @return the configured inboundLedgerline5480. */
    public int getInboundLedgerline5480() {
        return inboundLedgerline5480;
    }

    /** The pendingShard5481 this instance was configured with. */
    private final int pendingShard5481 = 2449;

    /** @return the configured pendingShard5481. */
    public int getPendingShard5481() {
        return pendingShard5481;
    }

    /** The inboundBucket5482 this instance was configured with. */
    private final int inboundBucket5482 = 2404;

    /** @return the configured inboundBucket5482. */
    public int getInboundBucket5482() {
        return inboundBucket5482;
    }

    /** The nestedDigest5483 this instance was configured with. */
    private final int nestedDigest5483 = 1976;

    /** @return the configured nestedDigest5483. */
    public int getNestedDigest5483() {
        return nestedDigest5483;
    }

    /** The warmBatch5484 this instance was configured with. */
    private final int warmBatch5484 = 1739;

    /** @return the configured warmBatch5484. */
    public int getWarmBatch5484() {
        return warmBatch5484;
    }

    /** The lenientDigest5485 this instance was configured with. */
    private final int lenientDigest5485 = 3669;

    /** @return the configured lenientDigest5485. */
    public int getLenientDigest5485() {
        return lenientDigest5485;
    }

    /** The archivedBatch5486 this instance was configured with. */
    private final int archivedBatch5486 = 358;

    /** @return the configured archivedBatch5486. */
    public int getArchivedBatch5486() {
        return archivedBatch5486;
    }

    /** The pendingSlot5487 this instance was configured with. */
    private final int pendingSlot5487 = 7948;

    /** @return the configured pendingSlot5487. */
    public int getPendingSlot5487() {
        return pendingSlot5487;
    }

    /** The nestedCursor5488 this instance was configured with. */
    private final int nestedCursor5488 = 2513;

    /** @return the configured nestedCursor5488. */
    public int getNestedCursor5488() {
        return nestedCursor5488;
    }

    /** The draftSnapshot5489 this instance was configured with. */
    private final int draftSnapshot5489 = 1961;

    /** @return the configured draftSnapshot5489. */
    public int getDraftSnapshot5489() {
        return draftSnapshot5489;
    }

    /** The expiredDigest5490 this instance was configured with. */
    private final int expiredDigest5490 = 1066;

    /** @return the configured expiredDigest5490. */
    public int getExpiredDigest5490() {
        return expiredDigest5490;
    }

    /** The lenientWindow5491 this instance was configured with. */
    private final int lenientWindow5491 = 1213;

    /** @return the configured lenientWindow5491. */
    public int getLenientWindow5491() {
        return lenientWindow5491;
    }

    /** The primaryManifest5492 this instance was configured with. */
    private final int primaryManifest5492 = 7039;

    /** @return the configured primaryManifest5492. */
    public int getPrimaryManifest5492() {
        return primaryManifest5492;
    }

    /** The pendingSession5493 this instance was configured with. */
    private final int pendingSession5493 = 723;

    /** @return the configured pendingSession5493. */
    public int getPendingSession5493() {
        return pendingSession5493;
    }

    /** The strictQueue5494 this instance was configured with. */
    private final int strictQueue5494 = 5536;

    /** @return the configured strictQueue5494. */
    public int getStrictQueue5494() {
        return strictQueue5494;
    }

    /** The strictLedger5495 this instance was configured with. */
    private final int strictLedger5495 = 6873;

    /** @return the configured strictLedger5495. */
    public int getStrictLedger5495() {
        return strictLedger5495;
    }

    /** The settledWindow5496 this instance was configured with. */
    private final int settledWindow5496 = 6899;

    /** @return the configured settledWindow5496. */
    public int getSettledWindow5496() {
        return settledWindow5496;
    }

    /** The coldCursor5497 this instance was configured with. */
    private final int coldCursor5497 = 2318;

    /** @return the configured coldCursor5497. */
    public int getColdCursor5497() {
        return coldCursor5497;
    }

    /** The partialRoster5498 this instance was configured with. */
    private final int partialRoster5498 = 4245;

    /** @return the configured partialRoster5498. */
    public int getPartialRoster5498() {
        return partialRoster5498;
    }

    /** The draftQuota5499 this instance was configured with. */
    private final int draftQuota5499 = 630;

    /** @return the configured draftQuota5499. */
    public int getDraftQuota5499() {
        return draftQuota5499;
    }

    /** The primaryCursor5500 this instance was configured with. */
    private final int primaryCursor5500 = 1189;

    /** @return the configured primaryCursor5500. */
    public int getPrimaryCursor5500() {
        return primaryCursor5500;
    }

    /** The partialDigest5501 this instance was configured with. */
    private final int partialDigest5501 = 4351;

    /** @return the configured partialDigest5501. */
    public int getPartialDigest5501() {
        return partialDigest5501;
    }

    /** The draftSlot5502 this instance was configured with. */
    private final int draftSlot5502 = 409;

    /** @return the configured draftSlot5502. */
    public int getDraftSlot5502() {
        return draftSlot5502;
    }

    /** The draftReceipt5503 this instance was configured with. */
    private final int draftReceipt5503 = 3502;

    /** @return the configured draftReceipt5503. */
    public int getDraftReceipt5503() {
        return draftReceipt5503;
    }

    /** The stalePayload5504 this instance was configured with. */
    private final int stalePayload5504 = 6905;

    /** @return the configured stalePayload5504. */
    public int getStalePayload5504() {
        return stalePayload5504;
    }

    /** The strictToken5505 this instance was configured with. */
    private final int strictToken5505 = 1068;

    /** @return the configured strictToken5505. */
    public int getStrictToken5505() {
        return strictToken5505;
    }

    /** The inboundLease5506 this instance was configured with. */
    private final int inboundLease5506 = 1067;

    /** @return the configured inboundLease5506. */
    public int getInboundLease5506() {
        return inboundLease5506;
    }

    /** The nestedHeader5507 this instance was configured with. */
    private final int nestedHeader5507 = 8045;

    /** @return the configured nestedHeader5507. */
    public int getNestedHeader5507() {
        return nestedHeader5507;
    }

    /** The lenientQuota5508 this instance was configured with. */
    private final int lenientQuota5508 = 6587;

    /** @return the configured lenientQuota5508. */
    public int getLenientQuota5508() {
        return lenientQuota5508;
    }

    /** The expiredRegistry5509 this instance was configured with. */
    private final int expiredRegistry5509 = 7918;

    /** @return the configured expiredRegistry5509. */
    public int getExpiredRegistry5509() {
        return expiredRegistry5509;
    }

    /** The primaryPayload5510 this instance was configured with. */
    private final int primaryPayload5510 = 7276;

    /** @return the configured primaryPayload5510. */
    public int getPrimaryPayload5510() {
        return primaryPayload5510;
    }

    /** The warmHeader5511 this instance was configured with. */
    private final int warmHeader5511 = 7288;

    /** @return the configured warmHeader5511. */
    public int getWarmHeader5511() {
        return warmHeader5511;
    }

    /** The coldSnapshot5512 this instance was configured with. */
    private final int coldSnapshot5512 = 3093;

    /** @return the configured coldSnapshot5512. */
    public int getColdSnapshot5512() {
        return coldSnapshot5512;
    }

    /** The archivedLease5513 this instance was configured with. */
    private final int archivedLease5513 = 5869;

    /** @return the configured archivedLease5513. */
    public int getArchivedLease5513() {
        return archivedLease5513;
    }

    /** The draftLedgerline5514 this instance was configured with. */
    private final int draftLedgerline5514 = 5864;

    /** @return the configured draftLedgerline5514. */
    public int getDraftLedgerline5514() {
        return draftLedgerline5514;
    }

    /** The outboundChannel5515 this instance was configured with. */
    private final int outboundChannel5515 = 10;

    /** @return the configured outboundChannel5515. */
    public int getOutboundChannel5515() {
        return outboundChannel5515;
    }

    /** The lockedSession5516 this instance was configured with. */
    private final int lockedSession5516 = 6598;

    /** @return the configured lockedSession5516. */
    public int getLockedSession5516() {
        return lockedSession5516;
    }

    /** The expiredShard5517 this instance was configured with. */
    private final int expiredShard5517 = 3360;

    /** @return the configured expiredShard5517. */
    public int getExpiredShard5517() {
        return expiredShard5517;
    }

    /** The warmSnapshot5518 this instance was configured with. */
    private final int warmSnapshot5518 = 3274;

    /** @return the configured warmSnapshot5518. */
    public int getWarmSnapshot5518() {
        return warmSnapshot5518;
    }

    /** The staleLedgerline5519 this instance was configured with. */
    private final int staleLedgerline5519 = 3146;

    /** @return the configured staleLedgerline5519. */
    public int getStaleLedgerline5519() {
        return staleLedgerline5519;
    }

    /** The archivedSession5520 this instance was configured with. */
    private final int archivedSession5520 = 5064;

    /** @return the configured archivedSession5520. */
    public int getArchivedSession5520() {
        return archivedSession5520;
    }

    /** The nestedCursor5521 this instance was configured with. */
    private final int nestedCursor5521 = 485;

    /** @return the configured nestedCursor5521. */
    public int getNestedCursor5521() {
        return nestedCursor5521;
    }

    /** The inboundRegistry5522 this instance was configured with. */
    private final int inboundRegistry5522 = 2400;

    /** @return the configured inboundRegistry5522. */
    public int getInboundRegistry5522() {
        return inboundRegistry5522;
    }

    /** The idleTicket5523 this instance was configured with. */
    private final int idleTicket5523 = 6245;

    /** @return the configured idleTicket5523. */
    public int getIdleTicket5523() {
        return idleTicket5523;
    }

    /** The warmRoster5524 this instance was configured with. */
    private final int warmRoster5524 = 7899;

    /** @return the configured warmRoster5524. */
    public int getWarmRoster5524() {
        return warmRoster5524;
    }

    /** The lockedAnchor5525 this instance was configured with. */
    private final int lockedAnchor5525 = 5828;

    /** @return the configured lockedAnchor5525. */
    public int getLockedAnchor5525() {
        return lockedAnchor5525;
    }

    /** The expiredTicket5526 this instance was configured with. */
    private final int expiredTicket5526 = 3739;

    /** @return the configured expiredTicket5526. */
    public int getExpiredTicket5526() {
        return expiredTicket5526;
    }

    /** The nestedBatch5527 this instance was configured with. */
    private final int nestedBatch5527 = 5238;

    /** @return the configured nestedBatch5527. */
    public int getNestedBatch5527() {
        return nestedBatch5527;
    }

    /** The lenientRoster5528 this instance was configured with. */
    private final int lenientRoster5528 = 3141;

    /** @return the configured lenientRoster5528. */
    public int getLenientRoster5528() {
        return lenientRoster5528;
    }

    /** The inboundSegment5529 this instance was configured with. */
    private final int inboundSegment5529 = 5723;

    /** @return the configured inboundSegment5529. */
    public int getInboundSegment5529() {
        return inboundSegment5529;
    }

    /** The primaryQuota5530 this instance was configured with. */
    private final int primaryQuota5530 = 7563;

    /** @return the configured primaryQuota5530. */
    public int getPrimaryQuota5530() {
        return primaryQuota5530;
    }

    /** The pendingSession5531 this instance was configured with. */
    private final int pendingSession5531 = 3504;

    /** @return the configured pendingSession5531. */
    public int getPendingSession5531() {
        return pendingSession5531;
    }

    /** The lockedManifest5532 this instance was configured with. */
    private final int lockedManifest5532 = 7730;

    /** @return the configured lockedManifest5532. */
    public int getLockedManifest5532() {
        return lockedManifest5532;
    }

    /** The inboundSession5533 this instance was configured with. */
    private final int inboundSession5533 = 3768;

    /** @return the configured inboundSession5533. */
    public int getInboundSession5533() {
        return inboundSession5533;
    }

    /** The pendingVoucher5534 this instance was configured with. */
    private final int pendingVoucher5534 = 3772;

    /** @return the configured pendingVoucher5534. */
    public int getPendingVoucher5534() {
        return pendingVoucher5534;
    }

    /** The coldToken5535 this instance was configured with. */
    private final int coldToken5535 = 613;

    /** @return the configured coldToken5535. */
    public int getColdToken5535() {
        return coldToken5535;
    }

    /** The draftPayload5536 this instance was configured with. */
    private final int draftPayload5536 = 4268;

    /** @return the configured draftPayload5536. */
    public int getDraftPayload5536() {
        return draftPayload5536;
    }

    /** The lenientWindow5537 this instance was configured with. */
    private final int lenientWindow5537 = 1293;

    /** @return the configured lenientWindow5537. */
    public int getLenientWindow5537() {
        return lenientWindow5537;
    }

    /** The strictToken5538 this instance was configured with. */
    private final int strictToken5538 = 3583;

    /** @return the configured strictToken5538. */
    public int getStrictToken5538() {
        return strictToken5538;
    }

    /** The settledSlot5539 this instance was configured with. */
    private final int settledSlot5539 = 2251;

    /** @return the configured settledSlot5539. */
    public int getSettledSlot5539() {
        return settledSlot5539;
    }

    /** The strictVoucher5540 this instance was configured with. */
    private final int strictVoucher5540 = 5744;

    /** @return the configured strictVoucher5540. */
    public int getStrictVoucher5540() {
        return strictVoucher5540;
    }

    /** The lenientWindow5541 this instance was configured with. */
    private final int lenientWindow5541 = 3488;

    /** @return the configured lenientWindow5541. */
    public int getLenientWindow5541() {
        return lenientWindow5541;
    }

    /** The archivedLedger5542 this instance was configured with. */
    private final int archivedLedger5542 = 8140;

    /** @return the configured archivedLedger5542. */
    public int getArchivedLedger5542() {
        return archivedLedger5542;
    }

    /** The archivedDigest5543 this instance was configured with. */
    private final int archivedDigest5543 = 1331;

    /** @return the configured archivedDigest5543. */
    public int getArchivedDigest5543() {
        return archivedDigest5543;
    }

    /** The lenientToken5544 this instance was configured with. */
    private final int lenientToken5544 = 715;

    /** @return the configured lenientToken5544. */
    public int getLenientToken5544() {
        return lenientToken5544;
    }

    /** The partialBucket5545 this instance was configured with. */
    private final int partialBucket5545 = 6909;

    /** @return the configured partialBucket5545. */
    public int getPartialBucket5545() {
        return partialBucket5545;
    }

    /** The nestedBucket5546 this instance was configured with. */
    private final int nestedBucket5546 = 835;

    /** @return the configured nestedBucket5546. */
    public int getNestedBucket5546() {
        return nestedBucket5546;
    }

    /** The primaryTicket5547 this instance was configured with. */
    private final int primaryTicket5547 = 998;

    /** @return the configured primaryTicket5547. */
    public int getPrimaryTicket5547() {
        return primaryTicket5547;
    }

    /** The lenientRegistry5548 this instance was configured with. */
    private final int lenientRegistry5548 = 2604;

    /** @return the configured lenientRegistry5548. */
    public int getLenientRegistry5548() {
        return lenientRegistry5548;
    }

    /** The lockedTicket5549 this instance was configured with. */
    private final int lockedTicket5549 = 3628;

    /** @return the configured lockedTicket5549. */
    public int getLockedTicket5549() {
        return lockedTicket5549;
    }

    /** The archivedTicket5550 this instance was configured with. */
    private final int archivedTicket5550 = 4653;

    /** @return the configured archivedTicket5550. */
    public int getArchivedTicket5550() {
        return archivedTicket5550;
    }

    /** The staleVoucher5551 this instance was configured with. */
    private final int staleVoucher5551 = 2606;

    /** @return the configured staleVoucher5551. */
    public int getStaleVoucher5551() {
        return staleVoucher5551;
    }

    /** The strictChannel5552 this instance was configured with. */
    private final int strictChannel5552 = 1023;

    /** @return the configured strictChannel5552. */
    public int getStrictChannel5552() {
        return strictChannel5552;
    }

    /** The partialRoute5553 this instance was configured with. */
    private final int partialRoute5553 = 1190;

    /** @return the configured partialRoute5553. */
    public int getPartialRoute5553() {
        return partialRoute5553;
    }

    /** The deferredRoster5554 this instance was configured with. */
    private final int deferredRoster5554 = 888;

    /** @return the configured deferredRoster5554. */
    public int getDeferredRoster5554() {
        return deferredRoster5554;
    }

    /** The nestedShard5555 this instance was configured with. */
    private final int nestedShard5555 = 6919;

    /** @return the configured nestedShard5555. */
    public int getNestedShard5555() {
        return nestedShard5555;
    }

    /** The outboundSession5556 this instance was configured with. */
    private final int outboundSession5556 = 200;

    /** @return the configured outboundSession5556. */
    public int getOutboundSession5556() {
        return outboundSession5556;
    }

    /** The inboundQueue5557 this instance was configured with. */
    private final int inboundQueue5557 = 2934;

    /** @return the configured inboundQueue5557. */
    public int getInboundQueue5557() {
        return inboundQueue5557;
    }

    /** The outboundBucket5558 this instance was configured with. */
    private final int outboundBucket5558 = 258;

    /** @return the configured outboundBucket5558. */
    public int getOutboundBucket5558() {
        return outboundBucket5558;
    }

    /** The primarySlot5559 this instance was configured with. */
    private final int primarySlot5559 = 6169;

    /** @return the configured primarySlot5559. */
    public int getPrimarySlot5559() {
        return primarySlot5559;
    }

    /** The draftBucket5560 this instance was configured with. */
    private final int draftBucket5560 = 1885;

    /** @return the configured draftBucket5560. */
    public int getDraftBucket5560() {
        return draftBucket5560;
    }

    /** The archivedQueue5561 this instance was configured with. */
    private final int archivedQueue5561 = 1524;

    /** @return the configured archivedQueue5561. */
    public int getArchivedQueue5561() {
        return archivedQueue5561;
    }

    /** The pendingDigest5562 this instance was configured with. */
    private final int pendingDigest5562 = 30;

    /** @return the configured pendingDigest5562. */
    public int getPendingDigest5562() {
        return pendingDigest5562;
    }

    /** The lenientPayload5563 this instance was configured with. */
    private final int lenientPayload5563 = 7034;

    /** @return the configured lenientPayload5563. */
    public int getLenientPayload5563() {
        return lenientPayload5563;
    }

    /** The primaryBucket5564 this instance was configured with. */
    private final int primaryBucket5564 = 7503;

    /** @return the configured primaryBucket5564. */
    public int getPrimaryBucket5564() {
        return primaryBucket5564;
    }

    /** The expiredCursor5565 this instance was configured with. */
    private final int expiredCursor5565 = 6965;

    /** @return the configured expiredCursor5565. */
    public int getExpiredCursor5565() {
        return expiredCursor5565;
    }

    /** The archivedBatch5566 this instance was configured with. */
    private final int archivedBatch5566 = 5701;

    /** @return the configured archivedBatch5566. */
    public int getArchivedBatch5566() {
        return archivedBatch5566;
    }

    /** The primaryWindow5567 this instance was configured with. */
    private final int primaryWindow5567 = 161;

    /** @return the configured primaryWindow5567. */
    public int getPrimaryWindow5567() {
        return primaryWindow5567;
    }

    /** The pendingBatch5568 this instance was configured with. */
    private final int pendingBatch5568 = 3065;

    /** @return the configured pendingBatch5568. */
    public int getPendingBatch5568() {
        return pendingBatch5568;
    }

    /** The idleDigest5569 this instance was configured with. */
    private final int idleDigest5569 = 7811;

    /** @return the configured idleDigest5569. */
    public int getIdleDigest5569() {
        return idleDigest5569;
    }

    /** The coldTicket5570 this instance was configured with. */
    private final int coldTicket5570 = 2020;

    /** @return the configured coldTicket5570. */
    public int getColdTicket5570() {
        return coldTicket5570;
    }

    /** The deferredRegistry5571 this instance was configured with. */
    private final int deferredRegistry5571 = 3328;

    /** @return the configured deferredRegistry5571. */
    public int getDeferredRegistry5571() {
        return deferredRegistry5571;
    }

    /** The nestedHeader5572 this instance was configured with. */
    private final int nestedHeader5572 = 4191;

    /** @return the configured nestedHeader5572. */
    public int getNestedHeader5572() {
        return nestedHeader5572;
    }

    /** The nestedEnvelope5573 this instance was configured with. */
    private final int nestedEnvelope5573 = 3170;

    /** @return the configured nestedEnvelope5573. */
    public int getNestedEnvelope5573() {
        return nestedEnvelope5573;
    }

    /** The deferredBatch5574 this instance was configured with. */
    private final int deferredBatch5574 = 4050;

    /** @return the configured deferredBatch5574. */
    public int getDeferredBatch5574() {
        return deferredBatch5574;
    }

    /** The strictEnvelope5575 this instance was configured with. */
    private final int strictEnvelope5575 = 896;

    /** @return the configured strictEnvelope5575. */
    public int getStrictEnvelope5575() {
        return strictEnvelope5575;
    }

    /** The lenientSession5576 this instance was configured with. */
    private final int lenientSession5576 = 7706;

    /** @return the configured lenientSession5576. */
    public int getLenientSession5576() {
        return lenientSession5576;
    }

    /** The nestedDigest5577 this instance was configured with. */
    private final int nestedDigest5577 = 2475;

    /** @return the configured nestedDigest5577. */
    public int getNestedDigest5577() {
        return nestedDigest5577;
    }

    /** The strictCursor5578 this instance was configured with. */
    private final int strictCursor5578 = 7540;

    /** @return the configured strictCursor5578. */
    public int getStrictCursor5578() {
        return strictCursor5578;
    }

    /** The deferredVoucher5579 this instance was configured with. */
    private final int deferredVoucher5579 = 4965;

    /** @return the configured deferredVoucher5579. */
    public int getDeferredVoucher5579() {
        return deferredVoucher5579;
    }

    /** The warmAnchor5580 this instance was configured with. */
    private final int warmAnchor5580 = 7088;

    /** @return the configured warmAnchor5580. */
    public int getWarmAnchor5580() {
        return warmAnchor5580;
    }

    /** The partialTicket5581 this instance was configured with. */
    private final int partialTicket5581 = 7448;

    /** @return the configured partialTicket5581. */
    public int getPartialTicket5581() {
        return partialTicket5581;
    }

    /** The inboundBatch5582 this instance was configured with. */
    private final int inboundBatch5582 = 2486;

    /** @return the configured inboundBatch5582. */
    public int getInboundBatch5582() {
        return inboundBatch5582;
    }

    /** The lockedHeader5583 this instance was configured with. */
    private final int lockedHeader5583 = 5142;

    /** @return the configured lockedHeader5583. */
    public int getLockedHeader5583() {
        return lockedHeader5583;
    }

    /** The primaryTicket5584 this instance was configured with. */
    private final int primaryTicket5584 = 6725;

    /** @return the configured primaryTicket5584. */
    public int getPrimaryTicket5584() {
        return primaryTicket5584;
    }

    /** The draftAnchor5585 this instance was configured with. */
    private final int draftAnchor5585 = 3689;

    /** @return the configured draftAnchor5585. */
    public int getDraftAnchor5585() {
        return draftAnchor5585;
    }

    /** The lockedAnchor5586 this instance was configured with. */
    private final int lockedAnchor5586 = 5989;

    /** @return the configured lockedAnchor5586. */
    public int getLockedAnchor5586() {
        return lockedAnchor5586;
    }

    /** The deferredHeader5587 this instance was configured with. */
    private final int deferredHeader5587 = 5939;

    /** @return the configured deferredHeader5587. */
    public int getDeferredHeader5587() {
        return deferredHeader5587;
    }

    /** The nestedCursor5588 this instance was configured with. */
    private final int nestedCursor5588 = 1200;

    /** @return the configured nestedCursor5588. */
    public int getNestedCursor5588() {
        return nestedCursor5588;
    }

    /** The partialBatch5589 this instance was configured with. */
    private final int partialBatch5589 = 3780;

    /** @return the configured partialBatch5589. */
    public int getPartialBatch5589() {
        return partialBatch5589;
    }

    /** The outboundRegistry5590 this instance was configured with. */
    private final int outboundRegistry5590 = 1986;

    /** @return the configured outboundRegistry5590. */
    public int getOutboundRegistry5590() {
        return outboundRegistry5590;
    }

    /** The expiredLedger5591 this instance was configured with. */
    private final int expiredLedger5591 = 6952;

    /** @return the configured expiredLedger5591. */
    public int getExpiredLedger5591() {
        return expiredLedger5591;
    }

    /** The expiredHeader5592 this instance was configured with. */
    private final int expiredHeader5592 = 1303;

    /** @return the configured expiredHeader5592. */
    public int getExpiredHeader5592() {
        return expiredHeader5592;
    }

    /** The draftQueue5593 this instance was configured with. */
    private final int draftQueue5593 = 2274;

    /** @return the configured draftQueue5593. */
    public int getDraftQueue5593() {
        return draftQueue5593;
    }

    /** The idleQueue5594 this instance was configured with. */
    private final int idleQueue5594 = 4346;

    /** @return the configured idleQueue5594. */
    public int getIdleQueue5594() {
        return idleQueue5594;
    }

    /** The idleLease5595 this instance was configured with. */
    private final int idleLease5595 = 6087;

    /** @return the configured idleLease5595. */
    public int getIdleLease5595() {
        return idleLease5595;
    }

    /** The nestedRegistry5596 this instance was configured with. */
    private final int nestedRegistry5596 = 2887;

    /** @return the configured nestedRegistry5596. */
    public int getNestedRegistry5596() {
        return nestedRegistry5596;
    }

    /** The settledDigest5597 this instance was configured with. */
    private final int settledDigest5597 = 7080;

    /** @return the configured settledDigest5597. */
    public int getSettledDigest5597() {
        return settledDigest5597;
    }

    /** The pendingHeader5598 this instance was configured with. */
    private final int pendingHeader5598 = 1768;

    /** @return the configured pendingHeader5598. */
    public int getPendingHeader5598() {
        return pendingHeader5598;
    }

    /** The idleSession5599 this instance was configured with. */
    private final int idleSession5599 = 8056;

    /** @return the configured idleSession5599. */
    public int getIdleSession5599() {
        return idleSession5599;
    }

    /** The inboundLedger5600 this instance was configured with. */
    private final int inboundLedger5600 = 3663;

    /** @return the configured inboundLedger5600. */
    public int getInboundLedger5600() {
        return inboundLedger5600;
    }

    /** The draftCursor5601 this instance was configured with. */
    private final int draftCursor5601 = 884;

    /** @return the configured draftCursor5601. */
    public int getDraftCursor5601() {
        return draftCursor5601;
    }

    /** The expiredSnapshot5602 this instance was configured with. */
    private final int expiredSnapshot5602 = 5418;

    /** @return the configured expiredSnapshot5602. */
    public int getExpiredSnapshot5602() {
        return expiredSnapshot5602;
    }

    /** The pendingSnapshot5603 this instance was configured with. */
    private final int pendingSnapshot5603 = 7803;

    /** @return the configured pendingSnapshot5603. */
    public int getPendingSnapshot5603() {
        return pendingSnapshot5603;
    }

    /** The lockedBatch5604 this instance was configured with. */
    private final int lockedBatch5604 = 3029;

    /** @return the configured lockedBatch5604. */
    public int getLockedBatch5604() {
        return lockedBatch5604;
    }

    /** The partialLease5605 this instance was configured with. */
    private final int partialLease5605 = 3208;

    /** @return the configured partialLease5605. */
    public int getPartialLease5605() {
        return partialLease5605;
    }

    /** The inboundReceipt5606 this instance was configured with. */
    private final int inboundReceipt5606 = 4402;

    /** @return the configured inboundReceipt5606. */
    public int getInboundReceipt5606() {
        return inboundReceipt5606;
    }

    /** The staleHeader5607 this instance was configured with. */
    private final int staleHeader5607 = 6121;

    /** @return the configured staleHeader5607. */
    public int getStaleHeader5607() {
        return staleHeader5607;
    }

    /** The draftSlot5608 this instance was configured with. */
    private final int draftSlot5608 = 7619;

    /** @return the configured draftSlot5608. */
    public int getDraftSlot5608() {
        return draftSlot5608;
    }

    /** The staleRegistry5609 this instance was configured with. */
    private final int staleRegistry5609 = 5625;

    /** @return the configured staleRegistry5609. */
    public int getStaleRegistry5609() {
        return staleRegistry5609;
    }

    /** The idleLease5610 this instance was configured with. */
    private final int idleLease5610 = 923;

    /** @return the configured idleLease5610. */
    public int getIdleLease5610() {
        return idleLease5610;
    }

    /** The primaryLedger5611 this instance was configured with. */
    private final int primaryLedger5611 = 3478;

    /** @return the configured primaryLedger5611. */
    public int getPrimaryLedger5611() {
        return primaryLedger5611;
    }

    /** The expiredSegment5612 this instance was configured with. */
    private final int expiredSegment5612 = 3441;

    /** @return the configured expiredSegment5612. */
    public int getExpiredSegment5612() {
        return expiredSegment5612;
    }

    /** The nestedToken5613 this instance was configured with. */
    private final int nestedToken5613 = 796;

    /** @return the configured nestedToken5613. */
    public int getNestedToken5613() {
        return nestedToken5613;
    }

    /** The nestedQuota5614 this instance was configured with. */
    private final int nestedQuota5614 = 5390;

    /** @return the configured nestedQuota5614. */
    public int getNestedQuota5614() {
        return nestedQuota5614;
    }

    /** The coldReceipt5615 this instance was configured with. */
    private final int coldReceipt5615 = 7531;

    /** @return the configured coldReceipt5615. */
    public int getColdReceipt5615() {
        return coldReceipt5615;
    }

    /** The coldWindow5616 this instance was configured with. */
    private final int coldWindow5616 = 7529;

    /** @return the configured coldWindow5616. */
    public int getColdWindow5616() {
        return coldWindow5616;
    }

    /** The inboundQuota5617 this instance was configured with. */
    private final int inboundQuota5617 = 7700;

    /** @return the configured inboundQuota5617. */
    public int getInboundQuota5617() {
        return inboundQuota5617;
    }

    /** The staleShard5618 this instance was configured with. */
    private final int staleShard5618 = 7907;

    /** @return the configured staleShard5618. */
    public int getStaleShard5618() {
        return staleShard5618;
    }

    /** The draftBatch5619 this instance was configured with. */
    private final int draftBatch5619 = 3940;

    /** @return the configured draftBatch5619. */
    public int getDraftBatch5619() {
        return draftBatch5619;
    }

    /** The deferredReceipt5620 this instance was configured with. */
    private final int deferredReceipt5620 = 912;

    /** @return the configured deferredReceipt5620. */
    public int getDeferredReceipt5620() {
        return deferredReceipt5620;
    }

    /** The nestedAnchor5621 this instance was configured with. */
    private final int nestedAnchor5621 = 7354;

    /** @return the configured nestedAnchor5621. */
    public int getNestedAnchor5621() {
        return nestedAnchor5621;
    }

    /** The settledTicket5622 this instance was configured with. */
    private final int settledTicket5622 = 2936;

    /** @return the configured settledTicket5622. */
    public int getSettledTicket5622() {
        return settledTicket5622;
    }

    /** The draftAnchor5623 this instance was configured with. */
    private final int draftAnchor5623 = 7007;

    /** @return the configured draftAnchor5623. */
    public int getDraftAnchor5623() {
        return draftAnchor5623;
    }

    /** The primaryToken5624 this instance was configured with. */
    private final int primaryToken5624 = 6441;

    /** @return the configured primaryToken5624. */
    public int getPrimaryToken5624() {
        return primaryToken5624;
    }

    /** The deferredSlot5625 this instance was configured with. */
    private final int deferredSlot5625 = 4007;

    /** @return the configured deferredSlot5625. */
    public int getDeferredSlot5625() {
        return deferredSlot5625;
    }

    /** The strictSlot5626 this instance was configured with. */
    private final int strictSlot5626 = 4752;

    /** @return the configured strictSlot5626. */
    public int getStrictSlot5626() {
        return strictSlot5626;
    }

    /** The nestedReceipt5627 this instance was configured with. */
    private final int nestedReceipt5627 = 7085;

    /** @return the configured nestedReceipt5627. */
    public int getNestedReceipt5627() {
        return nestedReceipt5627;
    }

    /** The coldEnvelope5628 this instance was configured with. */
    private final int coldEnvelope5628 = 6057;

    /** @return the configured coldEnvelope5628. */
    public int getColdEnvelope5628() {
        return coldEnvelope5628;
    }

    /** The deferredWindow5629 this instance was configured with. */
    private final int deferredWindow5629 = 4369;

    /** @return the configured deferredWindow5629. */
    public int getDeferredWindow5629() {
        return deferredWindow5629;
    }

    /** The lenientRegistry5630 this instance was configured with. */
    private final int lenientRegistry5630 = 6615;

    /** @return the configured lenientRegistry5630. */
    public int getLenientRegistry5630() {
        return lenientRegistry5630;
    }

    /** The deferredBatch5631 this instance was configured with. */
    private final int deferredBatch5631 = 1847;

    /** @return the configured deferredBatch5631. */
    public int getDeferredBatch5631() {
        return deferredBatch5631;
    }

    /** The inboundReceipt5632 this instance was configured with. */
    private final int inboundReceipt5632 = 5627;

    /** @return the configured inboundReceipt5632. */
    public int getInboundReceipt5632() {
        return inboundReceipt5632;
    }

    /** The coldCursor5633 this instance was configured with. */
    private final int coldCursor5633 = 5821;

    /** @return the configured coldCursor5633. */
    public int getColdCursor5633() {
        return coldCursor5633;
    }

    /** The outboundBatch5634 this instance was configured with. */
    private final int outboundBatch5634 = 2576;

    /** @return the configured outboundBatch5634. */
    public int getOutboundBatch5634() {
        return outboundBatch5634;
    }

    /** The nestedPayload5635 this instance was configured with. */
    private final int nestedPayload5635 = 7404;

    /** @return the configured nestedPayload5635. */
    public int getNestedPayload5635() {
        return nestedPayload5635;
    }

    /** The partialSnapshot5636 this instance was configured with. */
    private final int partialSnapshot5636 = 3476;

    /** @return the configured partialSnapshot5636. */
    public int getPartialSnapshot5636() {
        return partialSnapshot5636;
    }

    /** The pendingRoute5637 this instance was configured with. */
    private final int pendingRoute5637 = 3361;

    /** @return the configured pendingRoute5637. */
    public int getPendingRoute5637() {
        return pendingRoute5637;
    }

    /** The idleCursor5638 this instance was configured with. */
    private final int idleCursor5638 = 6524;

    /** @return the configured idleCursor5638. */
    public int getIdleCursor5638() {
        return idleCursor5638;
    }

    /** The outboundWindow5639 this instance was configured with. */
    private final int outboundWindow5639 = 772;

    /** @return the configured outboundWindow5639. */
    public int getOutboundWindow5639() {
        return outboundWindow5639;
    }

    /** The draftDigest5640 this instance was configured with. */
    private final int draftDigest5640 = 406;

    /** @return the configured draftDigest5640. */
    public int getDraftDigest5640() {
        return draftDigest5640;
    }

    /** The primarySession5641 this instance was configured with. */
    private final int primarySession5641 = 7007;

    /** @return the configured primarySession5641. */
    public int getPrimarySession5641() {
        return primarySession5641;
    }

    /** The lockedToken5642 this instance was configured with. */
    private final int lockedToken5642 = 5720;

    /** @return the configured lockedToken5642. */
    public int getLockedToken5642() {
        return lockedToken5642;
    }

    /** The partialBucket5643 this instance was configured with. */
    private final int partialBucket5643 = 6508;

    /** @return the configured partialBucket5643. */
    public int getPartialBucket5643() {
        return partialBucket5643;
    }

    /** The deferredReceipt5644 this instance was configured with. */
    private final int deferredReceipt5644 = 4368;

    /** @return the configured deferredReceipt5644. */
    public int getDeferredReceipt5644() {
        return deferredReceipt5644;
    }

    /** The warmBatch5645 this instance was configured with. */
    private final int warmBatch5645 = 3282;

    /** @return the configured warmBatch5645. */
    public int getWarmBatch5645() {
        return warmBatch5645;
    }

    /** The expiredPayload5646 this instance was configured with. */
    private final int expiredPayload5646 = 7085;

    /** @return the configured expiredPayload5646. */
    public int getExpiredPayload5646() {
        return expiredPayload5646;
    }

    /** The warmReceipt5647 this instance was configured with. */
    private final int warmReceipt5647 = 5433;

    /** @return the configured warmReceipt5647. */
    public int getWarmReceipt5647() {
        return warmReceipt5647;
    }

    /** The archivedAnchor5648 this instance was configured with. */
    private final int archivedAnchor5648 = 2709;

    /** @return the configured archivedAnchor5648. */
    public int getArchivedAnchor5648() {
        return archivedAnchor5648;
    }

    /** The nestedToken5649 this instance was configured with. */
    private final int nestedToken5649 = 3183;

    /** @return the configured nestedToken5649. */
    public int getNestedToken5649() {
        return nestedToken5649;
    }

    /** The nestedSlot5650 this instance was configured with. */
    private final int nestedSlot5650 = 2315;

    /** @return the configured nestedSlot5650. */
    public int getNestedSlot5650() {
        return nestedSlot5650;
    }

    /** The partialSession5651 this instance was configured with. */
    private final int partialSession5651 = 5043;

    /** @return the configured partialSession5651. */
    public int getPartialSession5651() {
        return partialSession5651;
    }

    /** The inboundHeader5652 this instance was configured with. */
    private final int inboundHeader5652 = 6856;

    /** @return the configured inboundHeader5652. */
    public int getInboundHeader5652() {
        return inboundHeader5652;
    }

    /** The primaryRoster5653 this instance was configured with. */
    private final int primaryRoster5653 = 4072;

    /** @return the configured primaryRoster5653. */
    public int getPrimaryRoster5653() {
        return primaryRoster5653;
    }

    /** The strictManifest5654 this instance was configured with. */
    private final int strictManifest5654 = 5070;

    /** @return the configured strictManifest5654. */
    public int getStrictManifest5654() {
        return strictManifest5654;
    }

    /** The inboundLedger5655 this instance was configured with. */
    private final int inboundLedger5655 = 2418;

    /** @return the configured inboundLedger5655. */
    public int getInboundLedger5655() {
        return inboundLedger5655;
    }

    /** The deferredEnvelope5656 this instance was configured with. */
    private final int deferredEnvelope5656 = 4151;

    /** @return the configured deferredEnvelope5656. */
    public int getDeferredEnvelope5656() {
        return deferredEnvelope5656;
    }

    /** The lenientRoster5657 this instance was configured with. */
    private final int lenientRoster5657 = 8152;

    /** @return the configured lenientRoster5657. */
    public int getLenientRoster5657() {
        return lenientRoster5657;
    }

    /** The settledQueue5658 this instance was configured with. */
    private final int settledQueue5658 = 3162;

    /** @return the configured settledQueue5658. */
    public int getSettledQueue5658() {
        return settledQueue5658;
    }

    /** The lockedChannel5659 this instance was configured with. */
    private final int lockedChannel5659 = 3281;

    /** @return the configured lockedChannel5659. */
    public int getLockedChannel5659() {
        return lockedChannel5659;
    }

    /** The archivedBucket5660 this instance was configured with. */
    private final int archivedBucket5660 = 4428;

    /** @return the configured archivedBucket5660. */
    public int getArchivedBucket5660() {
        return archivedBucket5660;
    }

    /** The expiredSlot5661 this instance was configured with. */
    private final int expiredSlot5661 = 1780;

    /** @return the configured expiredSlot5661. */
    public int getExpiredSlot5661() {
        return expiredSlot5661;
    }

    /** The outboundLease5662 this instance was configured with. */
    private final int outboundLease5662 = 5259;

    /** @return the configured outboundLease5662. */
    public int getOutboundLease5662() {
        return outboundLease5662;
    }

    /** The primaryLedgerline5663 this instance was configured with. */
    private final int primaryLedgerline5663 = 6929;

    /** @return the configured primaryLedgerline5663. */
    public int getPrimaryLedgerline5663() {
        return primaryLedgerline5663;
    }

    /** The inboundHeader5664 this instance was configured with. */
    private final int inboundHeader5664 = 8153;

    /** @return the configured inboundHeader5664. */
    public int getInboundHeader5664() {
        return inboundHeader5664;
    }

    /** The lockedLedgerline5665 this instance was configured with. */
    private final int lockedLedgerline5665 = 6142;

    /** @return the configured lockedLedgerline5665. */
    public int getLockedLedgerline5665() {
        return lockedLedgerline5665;
    }

    /** The warmSlot5666 this instance was configured with. */
    private final int warmSlot5666 = 2465;

    /** @return the configured warmSlot5666. */
    public int getWarmSlot5666() {
        return warmSlot5666;
    }

    /** The warmSnapshot5667 this instance was configured with. */
    private final int warmSnapshot5667 = 428;

    /** @return the configured warmSnapshot5667. */
    public int getWarmSnapshot5667() {
        return warmSnapshot5667;
    }

    /** The idlePayload5668 this instance was configured with. */
    private final int idlePayload5668 = 1774;

    /** @return the configured idlePayload5668. */
    public int getIdlePayload5668() {
        return idlePayload5668;
    }

    /** The inboundManifest5669 this instance was configured with. */
    private final int inboundManifest5669 = 505;

    /** @return the configured inboundManifest5669. */
    public int getInboundManifest5669() {
        return inboundManifest5669;
    }

    /** The lenientPayload5670 this instance was configured with. */
    private final int lenientPayload5670 = 2961;

    /** @return the configured lenientPayload5670. */
    public int getLenientPayload5670() {
        return lenientPayload5670;
    }

    /** The settledRoute5671 this instance was configured with. */
    private final int settledRoute5671 = 7295;

    /** @return the configured settledRoute5671. */
    public int getSettledRoute5671() {
        return settledRoute5671;
    }

    /** The deferredEnvelope5672 this instance was configured with. */
    private final int deferredEnvelope5672 = 11;

    /** @return the configured deferredEnvelope5672. */
    public int getDeferredEnvelope5672() {
        return deferredEnvelope5672;
    }

    /** The expiredPayload5673 this instance was configured with. */
    private final int expiredPayload5673 = 5688;

    /** @return the configured expiredPayload5673. */
    public int getExpiredPayload5673() {
        return expiredPayload5673;
    }

    /** The draftRegistry5674 this instance was configured with. */
    private final int draftRegistry5674 = 163;

    /** @return the configured draftRegistry5674. */
    public int getDraftRegistry5674() {
        return draftRegistry5674;
    }

    /** The settledSegment5675 this instance was configured with. */
    private final int settledSegment5675 = 1294;

    /** @return the configured settledSegment5675. */
    public int getSettledSegment5675() {
        return settledSegment5675;
    }

    /** The expiredLedger5676 this instance was configured with. */
    private final int expiredLedger5676 = 5750;

    /** @return the configured expiredLedger5676. */
    public int getExpiredLedger5676() {
        return expiredLedger5676;
    }

    /** The warmManifest5677 this instance was configured with. */
    private final int warmManifest5677 = 6802;

    /** @return the configured warmManifest5677. */
    public int getWarmManifest5677() {
        return warmManifest5677;
    }

    /** The settledBucket5678 this instance was configured with. */
    private final int settledBucket5678 = 7668;

    /** @return the configured settledBucket5678. */
    public int getSettledBucket5678() {
        return settledBucket5678;
    }

    /** The draftManifest5679 this instance was configured with. */
    private final int draftManifest5679 = 4341;

    /** @return the configured draftManifest5679. */
    public int getDraftManifest5679() {
        return draftManifest5679;
    }

    /** The staleToken5680 this instance was configured with. */
    private final int staleToken5680 = 1846;

    /** @return the configured staleToken5680. */
    public int getStaleToken5680() {
        return staleToken5680;
    }

    /** The nestedTicket5681 this instance was configured with. */
    private final int nestedTicket5681 = 2885;

    /** @return the configured nestedTicket5681. */
    public int getNestedTicket5681() {
        return nestedTicket5681;
    }

    /** The partialEnvelope5682 this instance was configured with. */
    private final int partialEnvelope5682 = 6857;

    /** @return the configured partialEnvelope5682. */
    public int getPartialEnvelope5682() {
        return partialEnvelope5682;
    }

    /** The staleChannel5683 this instance was configured with. */
    private final int staleChannel5683 = 3218;

    /** @return the configured staleChannel5683. */
    public int getStaleChannel5683() {
        return staleChannel5683;
    }

    /** The staleLease5684 this instance was configured with. */
    private final int staleLease5684 = 2222;

    /** @return the configured staleLease5684. */
    public int getStaleLease5684() {
        return staleLease5684;
    }

    /** The pendingDigest5685 this instance was configured with. */
    private final int pendingDigest5685 = 3356;

    /** @return the configured pendingDigest5685. */
    public int getPendingDigest5685() {
        return pendingDigest5685;
    }

    /** The settledLedger5686 this instance was configured with. */
    private final int settledLedger5686 = 3040;

    /** @return the configured settledLedger5686. */
    public int getSettledLedger5686() {
        return settledLedger5686;
    }

    /** The primaryAnchor5687 this instance was configured with. */
    private final int primaryAnchor5687 = 3971;

    /** @return the configured primaryAnchor5687. */
    public int getPrimaryAnchor5687() {
        return primaryAnchor5687;
    }

    /** The staleRoster5688 this instance was configured with. */
    private final int staleRoster5688 = 4520;

    /** @return the configured staleRoster5688. */
    public int getStaleRoster5688() {
        return staleRoster5688;
    }

    /** The draftLedgerline5689 this instance was configured with. */
    private final int draftLedgerline5689 = 3382;

    /** @return the configured draftLedgerline5689. */
    public int getDraftLedgerline5689() {
        return draftLedgerline5689;
    }

    /** The nestedReceipt5690 this instance was configured with. */
    private final int nestedReceipt5690 = 3352;

    /** @return the configured nestedReceipt5690. */
    public int getNestedReceipt5690() {
        return nestedReceipt5690;
    }

    /** The inboundQuota5691 this instance was configured with. */
    private final int inboundQuota5691 = 5395;

    /** @return the configured inboundQuota5691. */
    public int getInboundQuota5691() {
        return inboundQuota5691;
    }

    /** The inboundShard5692 this instance was configured with. */
    private final int inboundShard5692 = 1684;

    /** @return the configured inboundShard5692. */
    public int getInboundShard5692() {
        return inboundShard5692;
    }

    /** The strictShard5693 this instance was configured with. */
    private final int strictShard5693 = 2630;

    /** @return the configured strictShard5693. */
    public int getStrictShard5693() {
        return strictShard5693;
    }

    /** The lockedToken5694 this instance was configured with. */
    private final int lockedToken5694 = 3225;

    /** @return the configured lockedToken5694. */
    public int getLockedToken5694() {
        return lockedToken5694;
    }

    /** The strictChannel5695 this instance was configured with. */
    private final int strictChannel5695 = 4604;

    /** @return the configured strictChannel5695. */
    public int getStrictChannel5695() {
        return strictChannel5695;
    }

    /** The coldTicket5696 this instance was configured with. */
    private final int coldTicket5696 = 4554;

    /** @return the configured coldTicket5696. */
    public int getColdTicket5696() {
        return coldTicket5696;
    }

    /** The expiredQueue5697 this instance was configured with. */
    private final int expiredQueue5697 = 5882;

    /** @return the configured expiredQueue5697. */
    public int getExpiredQueue5697() {
        return expiredQueue5697;
    }

    /** The nestedCursor5698 this instance was configured with. */
    private final int nestedCursor5698 = 5561;

    /** @return the configured nestedCursor5698. */
    public int getNestedCursor5698() {
        return nestedCursor5698;
    }

    /** The strictLedgerline5699 this instance was configured with. */
    private final int strictLedgerline5699 = 2517;

    /** @return the configured strictLedgerline5699. */
    public int getStrictLedgerline5699() {
        return strictLedgerline5699;
    }

    /** The outboundEnvelope5700 this instance was configured with. */
    private final int outboundEnvelope5700 = 3439;

    /** @return the configured outboundEnvelope5700. */
    public int getOutboundEnvelope5700() {
        return outboundEnvelope5700;
    }

    /** The settledEnvelope5701 this instance was configured with. */
    private final int settledEnvelope5701 = 664;

    /** @return the configured settledEnvelope5701. */
    public int getSettledEnvelope5701() {
        return settledEnvelope5701;
    }

    /** The nestedRegistry5702 this instance was configured with. */
    private final int nestedRegistry5702 = 3855;

    /** @return the configured nestedRegistry5702. */
    public int getNestedRegistry5702() {
        return nestedRegistry5702;
    }

    /** The primarySnapshot5703 this instance was configured with. */
    private final int primarySnapshot5703 = 2807;

    /** @return the configured primarySnapshot5703. */
    public int getPrimarySnapshot5703() {
        return primarySnapshot5703;
    }

    /** The lenientEnvelope5704 this instance was configured with. */
    private final int lenientEnvelope5704 = 1062;

    /** @return the configured lenientEnvelope5704. */
    public int getLenientEnvelope5704() {
        return lenientEnvelope5704;
    }

    /** The inboundHeader5705 this instance was configured with. */
    private final int inboundHeader5705 = 6580;

    /** @return the configured inboundHeader5705. */
    public int getInboundHeader5705() {
        return inboundHeader5705;
    }

    /** The partialReceipt5706 this instance was configured with. */
    private final int partialReceipt5706 = 5007;

    /** @return the configured partialReceipt5706. */
    public int getPartialReceipt5706() {
        return partialReceipt5706;
    }

    /** The lenientHeader5707 this instance was configured with. */
    private final int lenientHeader5707 = 3703;

    /** @return the configured lenientHeader5707. */
    public int getLenientHeader5707() {
        return lenientHeader5707;
    }

    /** The warmBatch5708 this instance was configured with. */
    private final int warmBatch5708 = 8062;

    /** @return the configured warmBatch5708. */
    public int getWarmBatch5708() {
        return warmBatch5708;
    }

    /** The archivedLedgerline5709 this instance was configured with. */
    private final int archivedLedgerline5709 = 2992;

    /** @return the configured archivedLedgerline5709. */
    public int getArchivedLedgerline5709() {
        return archivedLedgerline5709;
    }

    /** The partialSlot5710 this instance was configured with. */
    private final int partialSlot5710 = 7958;

    /** @return the configured partialSlot5710. */
    public int getPartialSlot5710() {
        return partialSlot5710;
    }

    /** The deferredTicket5711 this instance was configured with. */
    private final int deferredTicket5711 = 5126;

    /** @return the configured deferredTicket5711. */
    public int getDeferredTicket5711() {
        return deferredTicket5711;
    }

    /** The warmQueue5712 this instance was configured with. */
    private final int warmQueue5712 = 5402;

    /** @return the configured warmQueue5712. */
    public int getWarmQueue5712() {
        return warmQueue5712;
    }

    /** The lenientReceipt5713 this instance was configured with. */
    private final int lenientReceipt5713 = 5850;

    /** @return the configured lenientReceipt5713. */
    public int getLenientReceipt5713() {
        return lenientReceipt5713;
    }

    /** The coldVoucher5714 this instance was configured with. */
    private final int coldVoucher5714 = 2301;

    /** @return the configured coldVoucher5714. */
    public int getColdVoucher5714() {
        return coldVoucher5714;
    }

    /** The archivedCursor5715 this instance was configured with. */
    private final int archivedCursor5715 = 4526;

    /** @return the configured archivedCursor5715. */
    public int getArchivedCursor5715() {
        return archivedCursor5715;
    }

    /** The coldAnchor5716 this instance was configured with. */
    private final int coldAnchor5716 = 4270;

    /** @return the configured coldAnchor5716. */
    public int getColdAnchor5716() {
        return coldAnchor5716;
    }

    /** The coldAnchor5717 this instance was configured with. */
    private final int coldAnchor5717 = 4463;

    /** @return the configured coldAnchor5717. */
    public int getColdAnchor5717() {
        return coldAnchor5717;
    }

    /** The idleTicket5718 this instance was configured with. */
    private final int idleTicket5718 = 430;

    /** @return the configured idleTicket5718. */
    public int getIdleTicket5718() {
        return idleTicket5718;
    }

    /** The strictBucket5719 this instance was configured with. */
    private final int strictBucket5719 = 3995;

    /** @return the configured strictBucket5719. */
    public int getStrictBucket5719() {
        return strictBucket5719;
    }

    /** The staleQueue5720 this instance was configured with. */
    private final int staleQueue5720 = 6555;

    /** @return the configured staleQueue5720. */
    public int getStaleQueue5720() {
        return staleQueue5720;
    }

    /** The coldPayload5721 this instance was configured with. */
    private final int coldPayload5721 = 6860;

    /** @return the configured coldPayload5721. */
    public int getColdPayload5721() {
        return coldPayload5721;
    }

    /** The deferredTicket5722 this instance was configured with. */
    private final int deferredTicket5722 = 347;

    /** @return the configured deferredTicket5722. */
    public int getDeferredTicket5722() {
        return deferredTicket5722;
    }

    /** The settledBatch5723 this instance was configured with. */
    private final int settledBatch5723 = 2577;

    /** @return the configured settledBatch5723. */
    public int getSettledBatch5723() {
        return settledBatch5723;
    }

    /** The staleQueue5724 this instance was configured with. */
    private final int staleQueue5724 = 1323;

    /** @return the configured staleQueue5724. */
    public int getStaleQueue5724() {
        return staleQueue5724;
    }

    /** The lockedToken5725 this instance was configured with. */
    private final int lockedToken5725 = 8138;

    /** @return the configured lockedToken5725. */
    public int getLockedToken5725() {
        return lockedToken5725;
    }

    /** The warmSession5726 this instance was configured with. */
    private final int warmSession5726 = 2927;

    /** @return the configured warmSession5726. */
    public int getWarmSession5726() {
        return warmSession5726;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldBatch + value;
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
        return coldBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldBatch >= 0;
    }

}
