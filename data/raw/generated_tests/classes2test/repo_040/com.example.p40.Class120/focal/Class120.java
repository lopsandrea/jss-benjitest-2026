package com.example.p40;

/**
 * inboundHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class120 {

    private int archivedPayload = 1;

    private final java.util.Map<String, Integer> outboundVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundVoucher0 table. */
    public int staleAnchor0(String key) {
        Integer hit = outboundVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long expiredLease1 = 0L;

    /** Folds {@code delta} into the running expiredLease1. */
    public long strictLedgerline1(long delta) {
        if (delta == 0L) {
            return expiredLease1;
        }
        expiredLease1 += delta < 0 ? -delta : delta;
        return expiredLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedShard2(int n) {
        switch (n / 11) {
            case 0:
                return "stale";
            case 1:
                return "pending";
            default:
                return n > 118 ? "nested" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the strictQuota stage. */
    public boolean partialQuota3(String text) {
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

    private final java.util.Map<String, Integer> warmPayload4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmPayload4 table. */
    public int pendingBucket4(String key) {
        Integer hit = warmPayload4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long nestedLedger5 = 0L;

    /** Folds {@code delta} into the running nestedLedger5. */
    public long lenientRegistry5(long delta) {
        if (delta == 0L) {
            return nestedLedger5;
        }
        nestedLedger5 += delta < 0 ? -delta : delta;
        return nestedLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingAnchor6(int n) {
        switch (n / 3) {
            case 0:
                return "stale";
            case 1:
                return "nested";
            default:
                return n > 240 ? "lenient" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the pendingRoute stage. */
    public boolean pendingRoute7(String text) {
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

    private final java.util.Map<String, Integer> strictSegment8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictSegment8 table. */
    public int archivedQueue8(String key) {
        Integer hit = strictSegment8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long lenientQuota9 = 0L;

    /** Folds {@code delta} into the running lenientQuota9. */
    public long lockedBatch9(long delta) {
        if (delta == 0L) {
            return lenientQuota9;
        }
        lenientQuota9 += delta < 0 ? -delta : delta;
        return lenientQuota9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedgerline10(int n) {
        switch (n / 11) {
            case 0:
                return "cold";
            case 1:
                return "nested";
            default:
                return n > 223 ? "nested" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the strictLedgerline stage. */
    public boolean lockedHeader11(String text) {
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

    private final java.util.Map<String, Integer> inboundDigest12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundDigest12 table. */
    public int primaryLedgerline12(String key) {
        Integer hit = inboundDigest12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long pendingSlot13 = 0L;

    /** Folds {@code delta} into the running pendingSlot13. */
    public long strictRoster13(long delta) {
        if (delta == 0L) {
            return pendingSlot13;
        }
        pendingSlot13 += delta < 0 ? -delta : delta;
        return pendingSlot13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledToken14(int n) {
        switch (n / 11) {
            case 0:
                return "partial";
            case 1:
                return "nested";
            default:
                return n > 247 ? "primary" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the lockedAnchor stage. */
    public boolean deferredToken15(String text) {
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

    private final java.util.Map<String, Integer> partialSession16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialSession16 table. */
    public int strictAnchor16(String key) {
        Integer hit = partialSession16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long deferredDigest17 = 0L;

    /** Folds {@code delta} into the running deferredDigest17. */
    public long strictAnchor17(long delta) {
        if (delta == 0L) {
            return deferredDigest17;
        }
        deferredDigest17 += delta < 0 ? -delta : delta;
        return deferredDigest17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialDigest18(int n) {
        switch (n / 5) {
            case 0:
                return "cold";
            case 1:
                return "locked";
            default:
                return n > 86 ? "lenient" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the partialDigest stage. */
    public boolean expiredRoute19(String text) {
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

    private final java.util.Map<String, Integer> coldDigest20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldDigest20 table. */
    public int partialAnchor20(String key) {
        Integer hit = coldDigest20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long settledSegment21 = 0L;

    /** Folds {@code delta} into the running settledSegment21. */
    public long idleSegment21(long delta) {
        if (delta == 0L) {
            return settledSegment21;
        }
        settledSegment21 += delta < 0 ? -delta : delta;
        return settledSegment21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedManifest22(int n) {
        switch (n / 11) {
            case 0:
                return "locked";
            case 1:
                return "expired";
            default:
                return n > 343 ? "outbound" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the lenientRegistry stage. */
    public boolean staleCursor23(String text) {
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

    private final java.util.Map<String, Integer> strictRoster24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictRoster24 table. */
    public int inboundChannel24(String key) {
        Integer hit = strictRoster24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long settledManifest25 = 0L;

    /** Folds {@code delta} into the running settledManifest25. */
    public long pendingRegistry25(long delta) {
        if (delta == 0L) {
            return settledManifest25;
        }
        settledManifest25 += delta < 0 ? -delta : delta;
        return settledManifest25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientWindow26(int n) {
        switch (n / 12) {
            case 0:
                return "locked";
            case 1:
                return "pending";
            default:
                return n > 215 ? "outbound" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the partialSlot stage. */
    public boolean staleBucket27(String text) {
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

    private final java.util.Map<String, Integer> inboundSession28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSession28 table. */
    public int outboundCursor28(String key) {
        Integer hit = inboundSession28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long warmRoute29 = 0L;

    /** Folds {@code delta} into the running warmRoute29. */
    public long deferredDigest29(long delta) {
        if (delta == 0L) {
            return warmRoute29;
        }
        warmRoute29 += delta < 0 ? -delta : delta;
        return warmRoute29;
    }

    /** The primaryQueue5000 this instance was configured with. */
    private final int primaryQueue5000 = 58;

    /** @return the configured primaryQueue5000. */
    public int getPrimaryQueue5000() {
        return primaryQueue5000;
    }

    /** The draftBatch5001 this instance was configured with. */
    private final int draftBatch5001 = 852;

    /** @return the configured draftBatch5001. */
    public int getDraftBatch5001() {
        return draftBatch5001;
    }

    /** The inboundLedger5002 this instance was configured with. */
    private final int inboundLedger5002 = 3870;

    /** @return the configured inboundLedger5002. */
    public int getInboundLedger5002() {
        return inboundLedger5002;
    }

    /** The primaryVoucher5003 this instance was configured with. */
    private final int primaryVoucher5003 = 4420;

    /** @return the configured primaryVoucher5003. */
    public int getPrimaryVoucher5003() {
        return primaryVoucher5003;
    }

    /** The partialHeader5004 this instance was configured with. */
    private final int partialHeader5004 = 7734;

    /** @return the configured partialHeader5004. */
    public int getPartialHeader5004() {
        return partialHeader5004;
    }

    /** The staleWindow5005 this instance was configured with. */
    private final int staleWindow5005 = 2717;

    /** @return the configured staleWindow5005. */
    public int getStaleWindow5005() {
        return staleWindow5005;
    }

    /** The settledSnapshot5006 this instance was configured with. */
    private final int settledSnapshot5006 = 7166;

    /** @return the configured settledSnapshot5006. */
    public int getSettledSnapshot5006() {
        return settledSnapshot5006;
    }

    /** The lockedAnchor5007 this instance was configured with. */
    private final int lockedAnchor5007 = 5098;

    /** @return the configured lockedAnchor5007. */
    public int getLockedAnchor5007() {
        return lockedAnchor5007;
    }

    /** The settledRegistry5008 this instance was configured with. */
    private final int settledRegistry5008 = 6489;

    /** @return the configured settledRegistry5008. */
    public int getSettledRegistry5008() {
        return settledRegistry5008;
    }

    /** The staleWindow5009 this instance was configured with. */
    private final int staleWindow5009 = 2508;

    /** @return the configured staleWindow5009. */
    public int getStaleWindow5009() {
        return staleWindow5009;
    }

    /** The archivedChannel5010 this instance was configured with. */
    private final int archivedChannel5010 = 2053;

    /** @return the configured archivedChannel5010. */
    public int getArchivedChannel5010() {
        return archivedChannel5010;
    }

    /** The expiredChannel5011 this instance was configured with. */
    private final int expiredChannel5011 = 7157;

    /** @return the configured expiredChannel5011. */
    public int getExpiredChannel5011() {
        return expiredChannel5011;
    }

    /** The idleSnapshot5012 this instance was configured with. */
    private final int idleSnapshot5012 = 468;

    /** @return the configured idleSnapshot5012. */
    public int getIdleSnapshot5012() {
        return idleSnapshot5012;
    }

    /** The coldCursor5013 this instance was configured with. */
    private final int coldCursor5013 = 4521;

    /** @return the configured coldCursor5013. */
    public int getColdCursor5013() {
        return coldCursor5013;
    }

    /** The expiredEnvelope5014 this instance was configured with. */
    private final int expiredEnvelope5014 = 1019;

    /** @return the configured expiredEnvelope5014. */
    public int getExpiredEnvelope5014() {
        return expiredEnvelope5014;
    }

    /** The partialSession5015 this instance was configured with. */
    private final int partialSession5015 = 1031;

    /** @return the configured partialSession5015. */
    public int getPartialSession5015() {
        return partialSession5015;
    }

    /** The warmAnchor5016 this instance was configured with. */
    private final int warmAnchor5016 = 6658;

    /** @return the configured warmAnchor5016. */
    public int getWarmAnchor5016() {
        return warmAnchor5016;
    }

    /** The lenientBatch5017 this instance was configured with. */
    private final int lenientBatch5017 = 469;

    /** @return the configured lenientBatch5017. */
    public int getLenientBatch5017() {
        return lenientBatch5017;
    }

    /** The archivedAnchor5018 this instance was configured with. */
    private final int archivedAnchor5018 = 2713;

    /** @return the configured archivedAnchor5018. */
    public int getArchivedAnchor5018() {
        return archivedAnchor5018;
    }

    /** The strictRoute5019 this instance was configured with. */
    private final int strictRoute5019 = 1021;

    /** @return the configured strictRoute5019. */
    public int getStrictRoute5019() {
        return strictRoute5019;
    }

    /** The outboundReceipt5020 this instance was configured with. */
    private final int outboundReceipt5020 = 5612;

    /** @return the configured outboundReceipt5020. */
    public int getOutboundReceipt5020() {
        return outboundReceipt5020;
    }

    /** The strictLease5021 this instance was configured with. */
    private final int strictLease5021 = 3143;

    /** @return the configured strictLease5021. */
    public int getStrictLease5021() {
        return strictLease5021;
    }

    /** The idleBatch5022 this instance was configured with. */
    private final int idleBatch5022 = 2496;

    /** @return the configured idleBatch5022. */
    public int getIdleBatch5022() {
        return idleBatch5022;
    }

    /** The pendingLedgerline5023 this instance was configured with. */
    private final int pendingLedgerline5023 = 7470;

    /** @return the configured pendingLedgerline5023. */
    public int getPendingLedgerline5023() {
        return pendingLedgerline5023;
    }

    /** The coldQueue5024 this instance was configured with. */
    private final int coldQueue5024 = 1875;

    /** @return the configured coldQueue5024. */
    public int getColdQueue5024() {
        return coldQueue5024;
    }

    /** The partialBucket5025 this instance was configured with. */
    private final int partialBucket5025 = 274;

    /** @return the configured partialBucket5025. */
    public int getPartialBucket5025() {
        return partialBucket5025;
    }

    /** The lenientLease5026 this instance was configured with. */
    private final int lenientLease5026 = 620;

    /** @return the configured lenientLease5026. */
    public int getLenientLease5026() {
        return lenientLease5026;
    }

    /** The inboundEnvelope5027 this instance was configured with. */
    private final int inboundEnvelope5027 = 5489;

    /** @return the configured inboundEnvelope5027. */
    public int getInboundEnvelope5027() {
        return inboundEnvelope5027;
    }

    /** The inboundLedgerline5028 this instance was configured with. */
    private final int inboundLedgerline5028 = 7935;

    /** @return the configured inboundLedgerline5028. */
    public int getInboundLedgerline5028() {
        return inboundLedgerline5028;
    }

    /** The outboundLease5029 this instance was configured with. */
    private final int outboundLease5029 = 7737;

    /** @return the configured outboundLease5029. */
    public int getOutboundLease5029() {
        return outboundLease5029;
    }

    /** The pendingLedger5030 this instance was configured with. */
    private final int pendingLedger5030 = 5024;

    /** @return the configured pendingLedger5030. */
    public int getPendingLedger5030() {
        return pendingLedger5030;
    }

    /** The inboundQuota5031 this instance was configured with. */
    private final int inboundQuota5031 = 3404;

    /** @return the configured inboundQuota5031. */
    public int getInboundQuota5031() {
        return inboundQuota5031;
    }

    /** The lockedQuota5032 this instance was configured with. */
    private final int lockedQuota5032 = 4683;

    /** @return the configured lockedQuota5032. */
    public int getLockedQuota5032() {
        return lockedQuota5032;
    }

    /** The expiredBatch5033 this instance was configured with. */
    private final int expiredBatch5033 = 6985;

    /** @return the configured expiredBatch5033. */
    public int getExpiredBatch5033() {
        return expiredBatch5033;
    }

    /** The settledShard5034 this instance was configured with. */
    private final int settledShard5034 = 2996;

    /** @return the configured settledShard5034. */
    public int getSettledShard5034() {
        return settledShard5034;
    }

    /** The idleLedger5035 this instance was configured with. */
    private final int idleLedger5035 = 40;

    /** @return the configured idleLedger5035. */
    public int getIdleLedger5035() {
        return idleLedger5035;
    }

    /** The staleRoute5036 this instance was configured with. */
    private final int staleRoute5036 = 1843;

    /** @return the configured staleRoute5036. */
    public int getStaleRoute5036() {
        return staleRoute5036;
    }

    /** The coldVoucher5037 this instance was configured with. */
    private final int coldVoucher5037 = 6370;

    /** @return the configured coldVoucher5037. */
    public int getColdVoucher5037() {
        return coldVoucher5037;
    }

    /** The inboundQuota5038 this instance was configured with. */
    private final int inboundQuota5038 = 3153;

    /** @return the configured inboundQuota5038. */
    public int getInboundQuota5038() {
        return inboundQuota5038;
    }

    /** The lockedSnapshot5039 this instance was configured with. */
    private final int lockedSnapshot5039 = 4639;

    /** @return the configured lockedSnapshot5039. */
    public int getLockedSnapshot5039() {
        return lockedSnapshot5039;
    }

    /** The outboundAnchor5040 this instance was configured with. */
    private final int outboundAnchor5040 = 3562;

    /** @return the configured outboundAnchor5040. */
    public int getOutboundAnchor5040() {
        return outboundAnchor5040;
    }

    /** The coldTicket5041 this instance was configured with. */
    private final int coldTicket5041 = 2711;

    /** @return the configured coldTicket5041. */
    public int getColdTicket5041() {
        return coldTicket5041;
    }

    /** The deferredToken5042 this instance was configured with. */
    private final int deferredToken5042 = 2697;

    /** @return the configured deferredToken5042. */
    public int getDeferredToken5042() {
        return deferredToken5042;
    }

    /** The pendingLedgerline5043 this instance was configured with. */
    private final int pendingLedgerline5043 = 5958;

    /** @return the configured pendingLedgerline5043. */
    public int getPendingLedgerline5043() {
        return pendingLedgerline5043;
    }

    /** The pendingRoster5044 this instance was configured with. */
    private final int pendingRoster5044 = 3797;

    /** @return the configured pendingRoster5044. */
    public int getPendingRoster5044() {
        return pendingRoster5044;
    }

    /** The idleRegistry5045 this instance was configured with. */
    private final int idleRegistry5045 = 2120;

    /** @return the configured idleRegistry5045. */
    public int getIdleRegistry5045() {
        return idleRegistry5045;
    }

    /** The primaryRoute5046 this instance was configured with. */
    private final int primaryRoute5046 = 5104;

    /** @return the configured primaryRoute5046. */
    public int getPrimaryRoute5046() {
        return primaryRoute5046;
    }

    /** The idleReceipt5047 this instance was configured with. */
    private final int idleReceipt5047 = 6636;

    /** @return the configured idleReceipt5047. */
    public int getIdleReceipt5047() {
        return idleReceipt5047;
    }

    /** The warmSession5048 this instance was configured with. */
    private final int warmSession5048 = 3457;

    /** @return the configured warmSession5048. */
    public int getWarmSession5048() {
        return warmSession5048;
    }

    /** The archivedRegistry5049 this instance was configured with. */
    private final int archivedRegistry5049 = 5380;

    /** @return the configured archivedRegistry5049. */
    public int getArchivedRegistry5049() {
        return archivedRegistry5049;
    }

    /** The archivedRoute5050 this instance was configured with. */
    private final int archivedRoute5050 = 5855;

    /** @return the configured archivedRoute5050. */
    public int getArchivedRoute5050() {
        return archivedRoute5050;
    }

    /** The draftShard5051 this instance was configured with. */
    private final int draftShard5051 = 4693;

    /** @return the configured draftShard5051. */
    public int getDraftShard5051() {
        return draftShard5051;
    }

    /** The warmBucket5052 this instance was configured with. */
    private final int warmBucket5052 = 5542;

    /** @return the configured warmBucket5052. */
    public int getWarmBucket5052() {
        return warmBucket5052;
    }

    /** The staleManifest5053 this instance was configured with. */
    private final int staleManifest5053 = 7873;

    /** @return the configured staleManifest5053. */
    public int getStaleManifest5053() {
        return staleManifest5053;
    }

    /** The settledLedgerline5054 this instance was configured with. */
    private final int settledLedgerline5054 = 2757;

    /** @return the configured settledLedgerline5054. */
    public int getSettledLedgerline5054() {
        return settledLedgerline5054;
    }

    /** The deferredDigest5055 this instance was configured with. */
    private final int deferredDigest5055 = 6504;

    /** @return the configured deferredDigest5055. */
    public int getDeferredDigest5055() {
        return deferredDigest5055;
    }

    /** The staleRoute5056 this instance was configured with. */
    private final int staleRoute5056 = 280;

    /** @return the configured staleRoute5056. */
    public int getStaleRoute5056() {
        return staleRoute5056;
    }

    /** The primaryEnvelope5057 this instance was configured with. */
    private final int primaryEnvelope5057 = 1223;

    /** @return the configured primaryEnvelope5057. */
    public int getPrimaryEnvelope5057() {
        return primaryEnvelope5057;
    }

    /** The coldToken5058 this instance was configured with. */
    private final int coldToken5058 = 3834;

    /** @return the configured coldToken5058. */
    public int getColdToken5058() {
        return coldToken5058;
    }

    /** The lenientVoucher5059 this instance was configured with. */
    private final int lenientVoucher5059 = 6310;

    /** @return the configured lenientVoucher5059. */
    public int getLenientVoucher5059() {
        return lenientVoucher5059;
    }

    /** The partialVoucher5060 this instance was configured with. */
    private final int partialVoucher5060 = 353;

    /** @return the configured partialVoucher5060. */
    public int getPartialVoucher5060() {
        return partialVoucher5060;
    }

    /** The staleWindow5061 this instance was configured with. */
    private final int staleWindow5061 = 932;

    /** @return the configured staleWindow5061. */
    public int getStaleWindow5061() {
        return staleWindow5061;
    }

    /** The partialQuota5062 this instance was configured with. */
    private final int partialQuota5062 = 6663;

    /** @return the configured partialQuota5062. */
    public int getPartialQuota5062() {
        return partialQuota5062;
    }

    /** The archivedShard5063 this instance was configured with. */
    private final int archivedShard5063 = 365;

    /** @return the configured archivedShard5063. */
    public int getArchivedShard5063() {
        return archivedShard5063;
    }

    /** The expiredPayload5064 this instance was configured with. */
    private final int expiredPayload5064 = 3281;

    /** @return the configured expiredPayload5064. */
    public int getExpiredPayload5064() {
        return expiredPayload5064;
    }

    /** The archivedSegment5065 this instance was configured with. */
    private final int archivedSegment5065 = 960;

    /** @return the configured archivedSegment5065. */
    public int getArchivedSegment5065() {
        return archivedSegment5065;
    }

    /** The staleReceipt5066 this instance was configured with. */
    private final int staleReceipt5066 = 1148;

    /** @return the configured staleReceipt5066. */
    public int getStaleReceipt5066() {
        return staleReceipt5066;
    }

    /** The lenientSlot5067 this instance was configured with. */
    private final int lenientSlot5067 = 6064;

    /** @return the configured lenientSlot5067. */
    public int getLenientSlot5067() {
        return lenientSlot5067;
    }

    /** The pendingTicket5068 this instance was configured with. */
    private final int pendingTicket5068 = 7476;

    /** @return the configured pendingTicket5068. */
    public int getPendingTicket5068() {
        return pendingTicket5068;
    }

    /** The archivedRoute5069 this instance was configured with. */
    private final int archivedRoute5069 = 417;

    /** @return the configured archivedRoute5069. */
    public int getArchivedRoute5069() {
        return archivedRoute5069;
    }

    /** The coldRoute5070 this instance was configured with. */
    private final int coldRoute5070 = 4199;

    /** @return the configured coldRoute5070. */
    public int getColdRoute5070() {
        return coldRoute5070;
    }

    /** The outboundHeader5071 this instance was configured with. */
    private final int outboundHeader5071 = 357;

    /** @return the configured outboundHeader5071. */
    public int getOutboundHeader5071() {
        return outboundHeader5071;
    }

    /** The lenientSession5072 this instance was configured with. */
    private final int lenientSession5072 = 6616;

    /** @return the configured lenientSession5072. */
    public int getLenientSession5072() {
        return lenientSession5072;
    }

    /** The draftQueue5073 this instance was configured with. */
    private final int draftQueue5073 = 733;

    /** @return the configured draftQueue5073. */
    public int getDraftQueue5073() {
        return draftQueue5073;
    }

    /** The primaryHeader5074 this instance was configured with. */
    private final int primaryHeader5074 = 726;

    /** @return the configured primaryHeader5074. */
    public int getPrimaryHeader5074() {
        return primaryHeader5074;
    }

    /** The warmChannel5075 this instance was configured with. */
    private final int warmChannel5075 = 160;

    /** @return the configured warmChannel5075. */
    public int getWarmChannel5075() {
        return warmChannel5075;
    }

    /** The nestedSegment5076 this instance was configured with. */
    private final int nestedSegment5076 = 5627;

    /** @return the configured nestedSegment5076. */
    public int getNestedSegment5076() {
        return nestedSegment5076;
    }

    /** The nestedPayload5077 this instance was configured with. */
    private final int nestedPayload5077 = 3531;

    /** @return the configured nestedPayload5077. */
    public int getNestedPayload5077() {
        return nestedPayload5077;
    }

    /** The idleToken5078 this instance was configured with. */
    private final int idleToken5078 = 4789;

    /** @return the configured idleToken5078. */
    public int getIdleToken5078() {
        return idleToken5078;
    }

    /** The nestedVoucher5079 this instance was configured with. */
    private final int nestedVoucher5079 = 6941;

    /** @return the configured nestedVoucher5079. */
    public int getNestedVoucher5079() {
        return nestedVoucher5079;
    }

    /** The lockedRoute5080 this instance was configured with. */
    private final int lockedRoute5080 = 426;

    /** @return the configured lockedRoute5080. */
    public int getLockedRoute5080() {
        return lockedRoute5080;
    }

    /** The deferredHeader5081 this instance was configured with. */
    private final int deferredHeader5081 = 2605;

    /** @return the configured deferredHeader5081. */
    public int getDeferredHeader5081() {
        return deferredHeader5081;
    }

    /** The inboundQueue5082 this instance was configured with. */
    private final int inboundQueue5082 = 6614;

    /** @return the configured inboundQueue5082. */
    public int getInboundQueue5082() {
        return inboundQueue5082;
    }

    /** The coldToken5083 this instance was configured with. */
    private final int coldToken5083 = 6135;

    /** @return the configured coldToken5083. */
    public int getColdToken5083() {
        return coldToken5083;
    }

    /** The primaryLedgerline5084 this instance was configured with. */
    private final int primaryLedgerline5084 = 2519;

    /** @return the configured primaryLedgerline5084. */
    public int getPrimaryLedgerline5084() {
        return primaryLedgerline5084;
    }

    /** The warmBucket5085 this instance was configured with. */
    private final int warmBucket5085 = 2273;

    /** @return the configured warmBucket5085. */
    public int getWarmBucket5085() {
        return warmBucket5085;
    }

    /** The coldDigest5086 this instance was configured with. */
    private final int coldDigest5086 = 681;

    /** @return the configured coldDigest5086. */
    public int getColdDigest5086() {
        return coldDigest5086;
    }

    /** The staleVoucher5087 this instance was configured with. */
    private final int staleVoucher5087 = 7029;

    /** @return the configured staleVoucher5087. */
    public int getStaleVoucher5087() {
        return staleVoucher5087;
    }

    /** The lockedLease5088 this instance was configured with. */
    private final int lockedLease5088 = 1207;

    /** @return the configured lockedLease5088. */
    public int getLockedLease5088() {
        return lockedLease5088;
    }

    /** The warmReceipt5089 this instance was configured with. */
    private final int warmReceipt5089 = 1781;

    /** @return the configured warmReceipt5089. */
    public int getWarmReceipt5089() {
        return warmReceipt5089;
    }

    /** The strictRegistry5090 this instance was configured with. */
    private final int strictRegistry5090 = 7728;

    /** @return the configured strictRegistry5090. */
    public int getStrictRegistry5090() {
        return strictRegistry5090;
    }

    /** The deferredBucket5091 this instance was configured with. */
    private final int deferredBucket5091 = 4756;

    /** @return the configured deferredBucket5091. */
    public int getDeferredBucket5091() {
        return deferredBucket5091;
    }

    /** The nestedLedger5092 this instance was configured with. */
    private final int nestedLedger5092 = 1575;

    /** @return the configured nestedLedger5092. */
    public int getNestedLedger5092() {
        return nestedLedger5092;
    }

    /** The strictShard5093 this instance was configured with. */
    private final int strictShard5093 = 5308;

    /** @return the configured strictShard5093. */
    public int getStrictShard5093() {
        return strictShard5093;
    }

    /** The staleAnchor5094 this instance was configured with. */
    private final int staleAnchor5094 = 6539;

    /** @return the configured staleAnchor5094. */
    public int getStaleAnchor5094() {
        return staleAnchor5094;
    }

    /** The inboundHeader5095 this instance was configured with. */
    private final int inboundHeader5095 = 2352;

    /** @return the configured inboundHeader5095. */
    public int getInboundHeader5095() {
        return inboundHeader5095;
    }

    /** The settledVoucher5096 this instance was configured with. */
    private final int settledVoucher5096 = 1818;

    /** @return the configured settledVoucher5096. */
    public int getSettledVoucher5096() {
        return settledVoucher5096;
    }

    /** The staleQuota5097 this instance was configured with. */
    private final int staleQuota5097 = 7282;

    /** @return the configured staleQuota5097. */
    public int getStaleQuota5097() {
        return staleQuota5097;
    }

    /** The coldQuota5098 this instance was configured with. */
    private final int coldQuota5098 = 3227;

    /** @return the configured coldQuota5098. */
    public int getColdQuota5098() {
        return coldQuota5098;
    }

    /** The lockedQueue5099 this instance was configured with. */
    private final int lockedQueue5099 = 3972;

    /** @return the configured lockedQueue5099. */
    public int getLockedQueue5099() {
        return lockedQueue5099;
    }

    /** The settledAnchor5100 this instance was configured with. */
    private final int settledAnchor5100 = 449;

    /** @return the configured settledAnchor5100. */
    public int getSettledAnchor5100() {
        return settledAnchor5100;
    }

    /** The expiredSnapshot5101 this instance was configured with. */
    private final int expiredSnapshot5101 = 4356;

    /** @return the configured expiredSnapshot5101. */
    public int getExpiredSnapshot5101() {
        return expiredSnapshot5101;
    }

    /** The lockedRoster5102 this instance was configured with. */
    private final int lockedRoster5102 = 2786;

    /** @return the configured lockedRoster5102. */
    public int getLockedRoster5102() {
        return lockedRoster5102;
    }

    /** The strictPayload5103 this instance was configured with. */
    private final int strictPayload5103 = 1356;

    /** @return the configured strictPayload5103. */
    public int getStrictPayload5103() {
        return strictPayload5103;
    }

    /** The outboundBatch5104 this instance was configured with. */
    private final int outboundBatch5104 = 7316;

    /** @return the configured outboundBatch5104. */
    public int getOutboundBatch5104() {
        return outboundBatch5104;
    }

    /** The outboundSegment5105 this instance was configured with. */
    private final int outboundSegment5105 = 976;

    /** @return the configured outboundSegment5105. */
    public int getOutboundSegment5105() {
        return outboundSegment5105;
    }

    /** The nestedVoucher5106 this instance was configured with. */
    private final int nestedVoucher5106 = 4619;

    /** @return the configured nestedVoucher5106. */
    public int getNestedVoucher5106() {
        return nestedVoucher5106;
    }

    /** The inboundBatch5107 this instance was configured with. */
    private final int inboundBatch5107 = 6755;

    /** @return the configured inboundBatch5107. */
    public int getInboundBatch5107() {
        return inboundBatch5107;
    }

    /** The strictDigest5108 this instance was configured with. */
    private final int strictDigest5108 = 2262;

    /** @return the configured strictDigest5108. */
    public int getStrictDigest5108() {
        return strictDigest5108;
    }

    /** The archivedRegistry5109 this instance was configured with. */
    private final int archivedRegistry5109 = 5123;

    /** @return the configured archivedRegistry5109. */
    public int getArchivedRegistry5109() {
        return archivedRegistry5109;
    }

    /** The draftLedger5110 this instance was configured with. */
    private final int draftLedger5110 = 2621;

    /** @return the configured draftLedger5110. */
    public int getDraftLedger5110() {
        return draftLedger5110;
    }

    /** The lenientDigest5111 this instance was configured with. */
    private final int lenientDigest5111 = 8138;

    /** @return the configured lenientDigest5111. */
    public int getLenientDigest5111() {
        return lenientDigest5111;
    }

    /** The strictShard5112 this instance was configured with. */
    private final int strictShard5112 = 3333;

    /** @return the configured strictShard5112. */
    public int getStrictShard5112() {
        return strictShard5112;
    }

    /** The draftLedgerline5113 this instance was configured with. */
    private final int draftLedgerline5113 = 6192;

    /** @return the configured draftLedgerline5113. */
    public int getDraftLedgerline5113() {
        return draftLedgerline5113;
    }

    /** The deferredQuota5114 this instance was configured with. */
    private final int deferredQuota5114 = 325;

    /** @return the configured deferredQuota5114. */
    public int getDeferredQuota5114() {
        return deferredQuota5114;
    }

    /** The staleHeader5115 this instance was configured with. */
    private final int staleHeader5115 = 1475;

    /** @return the configured staleHeader5115. */
    public int getStaleHeader5115() {
        return staleHeader5115;
    }

    /** The outboundAnchor5116 this instance was configured with. */
    private final int outboundAnchor5116 = 5181;

    /** @return the configured outboundAnchor5116. */
    public int getOutboundAnchor5116() {
        return outboundAnchor5116;
    }

    /** The partialChannel5117 this instance was configured with. */
    private final int partialChannel5117 = 5623;

    /** @return the configured partialChannel5117. */
    public int getPartialChannel5117() {
        return partialChannel5117;
    }

    /** The primaryDigest5118 this instance was configured with. */
    private final int primaryDigest5118 = 2244;

    /** @return the configured primaryDigest5118. */
    public int getPrimaryDigest5118() {
        return primaryDigest5118;
    }

    /** The idleCursor5119 this instance was configured with. */
    private final int idleCursor5119 = 5412;

    /** @return the configured idleCursor5119. */
    public int getIdleCursor5119() {
        return idleCursor5119;
    }

    /** The idleCursor5120 this instance was configured with. */
    private final int idleCursor5120 = 3346;

    /** @return the configured idleCursor5120. */
    public int getIdleCursor5120() {
        return idleCursor5120;
    }

    /** The warmTicket5121 this instance was configured with. */
    private final int warmTicket5121 = 2939;

    /** @return the configured warmTicket5121. */
    public int getWarmTicket5121() {
        return warmTicket5121;
    }

    /** The warmShard5122 this instance was configured with. */
    private final int warmShard5122 = 4609;

    /** @return the configured warmShard5122. */
    public int getWarmShard5122() {
        return warmShard5122;
    }

    /** The staleReceipt5123 this instance was configured with. */
    private final int staleReceipt5123 = 7306;

    /** @return the configured staleReceipt5123. */
    public int getStaleReceipt5123() {
        return staleReceipt5123;
    }

    /** The warmPayload5124 this instance was configured with. */
    private final int warmPayload5124 = 6304;

    /** @return the configured warmPayload5124. */
    public int getWarmPayload5124() {
        return warmPayload5124;
    }

    /** The coldPayload5125 this instance was configured with. */
    private final int coldPayload5125 = 1193;

    /** @return the configured coldPayload5125. */
    public int getColdPayload5125() {
        return coldPayload5125;
    }

    /** The archivedRoster5126 this instance was configured with. */
    private final int archivedRoster5126 = 3648;

    /** @return the configured archivedRoster5126. */
    public int getArchivedRoster5126() {
        return archivedRoster5126;
    }

    /** The partialRoster5127 this instance was configured with. */
    private final int partialRoster5127 = 43;

    /** @return the configured partialRoster5127. */
    public int getPartialRoster5127() {
        return partialRoster5127;
    }

    /** The primaryCursor5128 this instance was configured with. */
    private final int primaryCursor5128 = 4157;

    /** @return the configured primaryCursor5128. */
    public int getPrimaryCursor5128() {
        return primaryCursor5128;
    }

    /** The deferredPayload5129 this instance was configured with. */
    private final int deferredPayload5129 = 2201;

    /** @return the configured deferredPayload5129. */
    public int getDeferredPayload5129() {
        return deferredPayload5129;
    }

    /** The archivedChannel5130 this instance was configured with. */
    private final int archivedChannel5130 = 3806;

    /** @return the configured archivedChannel5130. */
    public int getArchivedChannel5130() {
        return archivedChannel5130;
    }

    /** The warmRoute5131 this instance was configured with. */
    private final int warmRoute5131 = 4080;

    /** @return the configured warmRoute5131. */
    public int getWarmRoute5131() {
        return warmRoute5131;
    }

    /** The staleRoute5132 this instance was configured with. */
    private final int staleRoute5132 = 7595;

    /** @return the configured staleRoute5132. */
    public int getStaleRoute5132() {
        return staleRoute5132;
    }

    /** The warmEnvelope5133 this instance was configured with. */
    private final int warmEnvelope5133 = 3545;

    /** @return the configured warmEnvelope5133. */
    public int getWarmEnvelope5133() {
        return warmEnvelope5133;
    }

    /** The strictRoster5134 this instance was configured with. */
    private final int strictRoster5134 = 2715;

    /** @return the configured strictRoster5134. */
    public int getStrictRoster5134() {
        return strictRoster5134;
    }

    /** The idleShard5135 this instance was configured with. */
    private final int idleShard5135 = 6837;

    /** @return the configured idleShard5135. */
    public int getIdleShard5135() {
        return idleShard5135;
    }

    /** The pendingEnvelope5136 this instance was configured with. */
    private final int pendingEnvelope5136 = 47;

    /** @return the configured pendingEnvelope5136. */
    public int getPendingEnvelope5136() {
        return pendingEnvelope5136;
    }

    /** The nestedBucket5137 this instance was configured with. */
    private final int nestedBucket5137 = 318;

    /** @return the configured nestedBucket5137. */
    public int getNestedBucket5137() {
        return nestedBucket5137;
    }

    /** The strictRoster5138 this instance was configured with. */
    private final int strictRoster5138 = 3707;

    /** @return the configured strictRoster5138. */
    public int getStrictRoster5138() {
        return strictRoster5138;
    }

    /** The coldReceipt5139 this instance was configured with. */
    private final int coldReceipt5139 = 3038;

    /** @return the configured coldReceipt5139. */
    public int getColdReceipt5139() {
        return coldReceipt5139;
    }

    /** The coldReceipt5140 this instance was configured with. */
    private final int coldReceipt5140 = 2225;

    /** @return the configured coldReceipt5140. */
    public int getColdReceipt5140() {
        return coldReceipt5140;
    }

    /** The settledSlot5141 this instance was configured with. */
    private final int settledSlot5141 = 1668;

    /** @return the configured settledSlot5141. */
    public int getSettledSlot5141() {
        return settledSlot5141;
    }

    /** The outboundQuota5142 this instance was configured with. */
    private final int outboundQuota5142 = 816;

    /** @return the configured outboundQuota5142. */
    public int getOutboundQuota5142() {
        return outboundQuota5142;
    }

    /** The deferredLedger5143 this instance was configured with. */
    private final int deferredLedger5143 = 4287;

    /** @return the configured deferredLedger5143. */
    public int getDeferredLedger5143() {
        return deferredLedger5143;
    }

    /** The lenientBucket5144 this instance was configured with. */
    private final int lenientBucket5144 = 6400;

    /** @return the configured lenientBucket5144. */
    public int getLenientBucket5144() {
        return lenientBucket5144;
    }

    /** The draftPayload5145 this instance was configured with. */
    private final int draftPayload5145 = 2704;

    /** @return the configured draftPayload5145. */
    public int getDraftPayload5145() {
        return draftPayload5145;
    }

    /** The inboundLedgerline5146 this instance was configured with. */
    private final int inboundLedgerline5146 = 5074;

    /** @return the configured inboundLedgerline5146. */
    public int getInboundLedgerline5146() {
        return inboundLedgerline5146;
    }

    /** The primaryWindow5147 this instance was configured with. */
    private final int primaryWindow5147 = 1403;

    /** @return the configured primaryWindow5147. */
    public int getPrimaryWindow5147() {
        return primaryWindow5147;
    }

    /** The expiredQueue5148 this instance was configured with. */
    private final int expiredQueue5148 = 494;

    /** @return the configured expiredQueue5148. */
    public int getExpiredQueue5148() {
        return expiredQueue5148;
    }

    /** The strictRoster5149 this instance was configured with. */
    private final int strictRoster5149 = 8157;

    /** @return the configured strictRoster5149. */
    public int getStrictRoster5149() {
        return strictRoster5149;
    }

    /** The warmWindow5150 this instance was configured with. */
    private final int warmWindow5150 = 5651;

    /** @return the configured warmWindow5150. */
    public int getWarmWindow5150() {
        return warmWindow5150;
    }

    /** The primaryWindow5151 this instance was configured with. */
    private final int primaryWindow5151 = 3996;

    /** @return the configured primaryWindow5151. */
    public int getPrimaryWindow5151() {
        return primaryWindow5151;
    }

    /** The inboundPayload5152 this instance was configured with. */
    private final int inboundPayload5152 = 3954;

    /** @return the configured inboundPayload5152. */
    public int getInboundPayload5152() {
        return inboundPayload5152;
    }

    /** The draftLedgerline5153 this instance was configured with. */
    private final int draftLedgerline5153 = 1276;

    /** @return the configured draftLedgerline5153. */
    public int getDraftLedgerline5153() {
        return draftLedgerline5153;
    }

    /** The lenientLedger5154 this instance was configured with. */
    private final int lenientLedger5154 = 7888;

    /** @return the configured lenientLedger5154. */
    public int getLenientLedger5154() {
        return lenientLedger5154;
    }

    /** The inboundChannel5155 this instance was configured with. */
    private final int inboundChannel5155 = 1182;

    /** @return the configured inboundChannel5155. */
    public int getInboundChannel5155() {
        return inboundChannel5155;
    }

    /** The idleReceipt5156 this instance was configured with. */
    private final int idleReceipt5156 = 3648;

    /** @return the configured idleReceipt5156. */
    public int getIdleReceipt5156() {
        return idleReceipt5156;
    }

    /** The staleSession5157 this instance was configured with. */
    private final int staleSession5157 = 1089;

    /** @return the configured staleSession5157. */
    public int getStaleSession5157() {
        return staleSession5157;
    }

    /** The strictSnapshot5158 this instance was configured with. */
    private final int strictSnapshot5158 = 3407;

    /** @return the configured strictSnapshot5158. */
    public int getStrictSnapshot5158() {
        return strictSnapshot5158;
    }

    /** The archivedRegistry5159 this instance was configured with. */
    private final int archivedRegistry5159 = 171;

    /** @return the configured archivedRegistry5159. */
    public int getArchivedRegistry5159() {
        return archivedRegistry5159;
    }

    /** The idleShard5160 this instance was configured with. */
    private final int idleShard5160 = 5433;

    /** @return the configured idleShard5160. */
    public int getIdleShard5160() {
        return idleShard5160;
    }

    /** The inboundRoster5161 this instance was configured with. */
    private final int inboundRoster5161 = 1833;

    /** @return the configured inboundRoster5161. */
    public int getInboundRoster5161() {
        return inboundRoster5161;
    }

    /** The settledSnapshot5162 this instance was configured with. */
    private final int settledSnapshot5162 = 5480;

    /** @return the configured settledSnapshot5162. */
    public int getSettledSnapshot5162() {
        return settledSnapshot5162;
    }

    /** The expiredPayload5163 this instance was configured with. */
    private final int expiredPayload5163 = 4030;

    /** @return the configured expiredPayload5163. */
    public int getExpiredPayload5163() {
        return expiredPayload5163;
    }

    /** The primaryLease5164 this instance was configured with. */
    private final int primaryLease5164 = 4269;

    /** @return the configured primaryLease5164. */
    public int getPrimaryLease5164() {
        return primaryLease5164;
    }

    /** The lockedTicket5165 this instance was configured with. */
    private final int lockedTicket5165 = 7386;

    /** @return the configured lockedTicket5165. */
    public int getLockedTicket5165() {
        return lockedTicket5165;
    }

    /** The draftHeader5166 this instance was configured with. */
    private final int draftHeader5166 = 8025;

    /** @return the configured draftHeader5166. */
    public int getDraftHeader5166() {
        return draftHeader5166;
    }

    /** The lockedWindow5167 this instance was configured with. */
    private final int lockedWindow5167 = 7385;

    /** @return the configured lockedWindow5167. */
    public int getLockedWindow5167() {
        return lockedWindow5167;
    }

    /** The deferredToken5168 this instance was configured with. */
    private final int deferredToken5168 = 8186;

    /** @return the configured deferredToken5168. */
    public int getDeferredToken5168() {
        return deferredToken5168;
    }

    /** The primaryPayload5169 this instance was configured with. */
    private final int primaryPayload5169 = 522;

    /** @return the configured primaryPayload5169. */
    public int getPrimaryPayload5169() {
        return primaryPayload5169;
    }

    /** The outboundAnchor5170 this instance was configured with. */
    private final int outboundAnchor5170 = 2865;

    /** @return the configured outboundAnchor5170. */
    public int getOutboundAnchor5170() {
        return outboundAnchor5170;
    }

    /** The pendingRegistry5171 this instance was configured with. */
    private final int pendingRegistry5171 = 7014;

    /** @return the configured pendingRegistry5171. */
    public int getPendingRegistry5171() {
        return pendingRegistry5171;
    }

    /** The partialManifest5172 this instance was configured with. */
    private final int partialManifest5172 = 3787;

    /** @return the configured partialManifest5172. */
    public int getPartialManifest5172() {
        return partialManifest5172;
    }

    /** The lenientSegment5173 this instance was configured with. */
    private final int lenientSegment5173 = 2527;

    /** @return the configured lenientSegment5173. */
    public int getLenientSegment5173() {
        return lenientSegment5173;
    }

    /** The partialShard5174 this instance was configured with. */
    private final int partialShard5174 = 6217;

    /** @return the configured partialShard5174. */
    public int getPartialShard5174() {
        return partialShard5174;
    }

    /** The warmSnapshot5175 this instance was configured with. */
    private final int warmSnapshot5175 = 2771;

    /** @return the configured warmSnapshot5175. */
    public int getWarmSnapshot5175() {
        return warmSnapshot5175;
    }

    /** The partialChannel5176 this instance was configured with. */
    private final int partialChannel5176 = 7597;

    /** @return the configured partialChannel5176. */
    public int getPartialChannel5176() {
        return partialChannel5176;
    }

    /** The outboundLease5177 this instance was configured with. */
    private final int outboundLease5177 = 1483;

    /** @return the configured outboundLease5177. */
    public int getOutboundLease5177() {
        return outboundLease5177;
    }

    /** The outboundManifest5178 this instance was configured with. */
    private final int outboundManifest5178 = 118;

    /** @return the configured outboundManifest5178. */
    public int getOutboundManifest5178() {
        return outboundManifest5178;
    }

    /** The staleChannel5179 this instance was configured with. */
    private final int staleChannel5179 = 7699;

    /** @return the configured staleChannel5179. */
    public int getStaleChannel5179() {
        return staleChannel5179;
    }

    /** The inboundVoucher5180 this instance was configured with. */
    private final int inboundVoucher5180 = 8090;

    /** @return the configured inboundVoucher5180. */
    public int getInboundVoucher5180() {
        return inboundVoucher5180;
    }

    /** The warmShard5181 this instance was configured with. */
    private final int warmShard5181 = 284;

    /** @return the configured warmShard5181. */
    public int getWarmShard5181() {
        return warmShard5181;
    }

    /** The pendingQueue5182 this instance was configured with. */
    private final int pendingQueue5182 = 667;

    /** @return the configured pendingQueue5182. */
    public int getPendingQueue5182() {
        return pendingQueue5182;
    }

    /** The warmQueue5183 this instance was configured with. */
    private final int warmQueue5183 = 7635;

    /** @return the configured warmQueue5183. */
    public int getWarmQueue5183() {
        return warmQueue5183;
    }

    /** The staleLedgerline5184 this instance was configured with. */
    private final int staleLedgerline5184 = 6265;

    /** @return the configured staleLedgerline5184. */
    public int getStaleLedgerline5184() {
        return staleLedgerline5184;
    }

    /** The lockedToken5185 this instance was configured with. */
    private final int lockedToken5185 = 4202;

    /** @return the configured lockedToken5185. */
    public int getLockedToken5185() {
        return lockedToken5185;
    }

    /** The draftChannel5186 this instance was configured with. */
    private final int draftChannel5186 = 2937;

    /** @return the configured draftChannel5186. */
    public int getDraftChannel5186() {
        return draftChannel5186;
    }

    /** The lenientAnchor5187 this instance was configured with. */
    private final int lenientAnchor5187 = 5841;

    /** @return the configured lenientAnchor5187. */
    public int getLenientAnchor5187() {
        return lenientAnchor5187;
    }

    /** The expiredBatch5188 this instance was configured with. */
    private final int expiredBatch5188 = 3137;

    /** @return the configured expiredBatch5188. */
    public int getExpiredBatch5188() {
        return expiredBatch5188;
    }

    /** The idleRegistry5189 this instance was configured with. */
    private final int idleRegistry5189 = 1441;

    /** @return the configured idleRegistry5189. */
    public int getIdleRegistry5189() {
        return idleRegistry5189;
    }

    /** The strictVoucher5190 this instance was configured with. */
    private final int strictVoucher5190 = 2125;

    /** @return the configured strictVoucher5190. */
    public int getStrictVoucher5190() {
        return strictVoucher5190;
    }

    /** The idleCursor5191 this instance was configured with. */
    private final int idleCursor5191 = 4518;

    /** @return the configured idleCursor5191. */
    public int getIdleCursor5191() {
        return idleCursor5191;
    }

    /** The coldLedgerline5192 this instance was configured with. */
    private final int coldLedgerline5192 = 3167;

    /** @return the configured coldLedgerline5192. */
    public int getColdLedgerline5192() {
        return coldLedgerline5192;
    }

    /** The lenientRegistry5193 this instance was configured with. */
    private final int lenientRegistry5193 = 6306;

    /** @return the configured lenientRegistry5193. */
    public int getLenientRegistry5193() {
        return lenientRegistry5193;
    }

    /** The strictShard5194 this instance was configured with. */
    private final int strictShard5194 = 691;

    /** @return the configured strictShard5194. */
    public int getStrictShard5194() {
        return strictShard5194;
    }

    /** The nestedRoster5195 this instance was configured with. */
    private final int nestedRoster5195 = 4646;

    /** @return the configured nestedRoster5195. */
    public int getNestedRoster5195() {
        return nestedRoster5195;
    }

    /** The settledVoucher5196 this instance was configured with. */
    private final int settledVoucher5196 = 31;

    /** @return the configured settledVoucher5196. */
    public int getSettledVoucher5196() {
        return settledVoucher5196;
    }

    /** The lenientQueue5197 this instance was configured with. */
    private final int lenientQueue5197 = 2435;

    /** @return the configured lenientQueue5197. */
    public int getLenientQueue5197() {
        return lenientQueue5197;
    }

    /** The pendingLedger5198 this instance was configured with. */
    private final int pendingLedger5198 = 2252;

    /** @return the configured pendingLedger5198. */
    public int getPendingLedger5198() {
        return pendingLedger5198;
    }

    /** The warmAnchor5199 this instance was configured with. */
    private final int warmAnchor5199 = 2853;

    /** @return the configured warmAnchor5199. */
    public int getWarmAnchor5199() {
        return warmAnchor5199;
    }

    /** The strictWindow5200 this instance was configured with. */
    private final int strictWindow5200 = 2958;

    /** @return the configured strictWindow5200. */
    public int getStrictWindow5200() {
        return strictWindow5200;
    }

    /** The pendingRoute5201 this instance was configured with. */
    private final int pendingRoute5201 = 791;

    /** @return the configured pendingRoute5201. */
    public int getPendingRoute5201() {
        return pendingRoute5201;
    }

    /** The strictRoster5202 this instance was configured with. */
    private final int strictRoster5202 = 4404;

    /** @return the configured strictRoster5202. */
    public int getStrictRoster5202() {
        return strictRoster5202;
    }

    /** The strictCursor5203 this instance was configured with. */
    private final int strictCursor5203 = 7180;

    /** @return the configured strictCursor5203. */
    public int getStrictCursor5203() {
        return strictCursor5203;
    }

    /** The idleQuota5204 this instance was configured with. */
    private final int idleQuota5204 = 4319;

    /** @return the configured idleQuota5204. */
    public int getIdleQuota5204() {
        return idleQuota5204;
    }

    /** The warmCursor5205 this instance was configured with. */
    private final int warmCursor5205 = 7454;

    /** @return the configured warmCursor5205. */
    public int getWarmCursor5205() {
        return warmCursor5205;
    }

    /** The settledTicket5206 this instance was configured with. */
    private final int settledTicket5206 = 2799;

    /** @return the configured settledTicket5206. */
    public int getSettledTicket5206() {
        return settledTicket5206;
    }

    /** The nestedShard5207 this instance was configured with. */
    private final int nestedShard5207 = 1444;

    /** @return the configured nestedShard5207. */
    public int getNestedShard5207() {
        return nestedShard5207;
    }

    /** The lockedLedger5208 this instance was configured with. */
    private final int lockedLedger5208 = 1110;

    /** @return the configured lockedLedger5208. */
    public int getLockedLedger5208() {
        return lockedLedger5208;
    }

    /** The inboundBatch5209 this instance was configured with. */
    private final int inboundBatch5209 = 8108;

    /** @return the configured inboundBatch5209. */
    public int getInboundBatch5209() {
        return inboundBatch5209;
    }

    /** The deferredHeader5210 this instance was configured with. */
    private final int deferredHeader5210 = 1640;

    /** @return the configured deferredHeader5210. */
    public int getDeferredHeader5210() {
        return deferredHeader5210;
    }

    /** The settledBatch5211 this instance was configured with. */
    private final int settledBatch5211 = 6637;

    /** @return the configured settledBatch5211. */
    public int getSettledBatch5211() {
        return settledBatch5211;
    }

    /** The strictBucket5212 this instance was configured with. */
    private final int strictBucket5212 = 3658;

    /** @return the configured strictBucket5212. */
    public int getStrictBucket5212() {
        return strictBucket5212;
    }

    /** The settledWindow5213 this instance was configured with. */
    private final int settledWindow5213 = 4681;

    /** @return the configured settledWindow5213. */
    public int getSettledWindow5213() {
        return settledWindow5213;
    }

    /** The draftBatch5214 this instance was configured with. */
    private final int draftBatch5214 = 99;

    /** @return the configured draftBatch5214. */
    public int getDraftBatch5214() {
        return draftBatch5214;
    }

    /** The expiredEnvelope5215 this instance was configured with. */
    private final int expiredEnvelope5215 = 3964;

    /** @return the configured expiredEnvelope5215. */
    public int getExpiredEnvelope5215() {
        return expiredEnvelope5215;
    }

    /** The lenientManifest5216 this instance was configured with. */
    private final int lenientManifest5216 = 7918;

    /** @return the configured lenientManifest5216. */
    public int getLenientManifest5216() {
        return lenientManifest5216;
    }

    /** The coldQuota5217 this instance was configured with. */
    private final int coldQuota5217 = 1784;

    /** @return the configured coldQuota5217. */
    public int getColdQuota5217() {
        return coldQuota5217;
    }

    /** The pendingRegistry5218 this instance was configured with. */
    private final int pendingRegistry5218 = 4372;

    /** @return the configured pendingRegistry5218. */
    public int getPendingRegistry5218() {
        return pendingRegistry5218;
    }

    /** The expiredRegistry5219 this instance was configured with. */
    private final int expiredRegistry5219 = 4587;

    /** @return the configured expiredRegistry5219. */
    public int getExpiredRegistry5219() {
        return expiredRegistry5219;
    }

    /** The lockedLease5220 this instance was configured with. */
    private final int lockedLease5220 = 6691;

    /** @return the configured lockedLease5220. */
    public int getLockedLease5220() {
        return lockedLease5220;
    }

    /** The lockedLease5221 this instance was configured with. */
    private final int lockedLease5221 = 7271;

    /** @return the configured lockedLease5221. */
    public int getLockedLease5221() {
        return lockedLease5221;
    }

    /** The idleRoute5222 this instance was configured with. */
    private final int idleRoute5222 = 7904;

    /** @return the configured idleRoute5222. */
    public int getIdleRoute5222() {
        return idleRoute5222;
    }

    /** The inboundPayload5223 this instance was configured with. */
    private final int inboundPayload5223 = 1462;

    /** @return the configured inboundPayload5223. */
    public int getInboundPayload5223() {
        return inboundPayload5223;
    }

    /** The nestedAnchor5224 this instance was configured with. */
    private final int nestedAnchor5224 = 3891;

    /** @return the configured nestedAnchor5224. */
    public int getNestedAnchor5224() {
        return nestedAnchor5224;
    }

    /** The settledTicket5225 this instance was configured with. */
    private final int settledTicket5225 = 3718;

    /** @return the configured settledTicket5225. */
    public int getSettledTicket5225() {
        return settledTicket5225;
    }

    /** The expiredRoster5226 this instance was configured with. */
    private final int expiredRoster5226 = 4383;

    /** @return the configured expiredRoster5226. */
    public int getExpiredRoster5226() {
        return expiredRoster5226;
    }

    /** The deferredReceipt5227 this instance was configured with. */
    private final int deferredReceipt5227 = 2003;

    /** @return the configured deferredReceipt5227. */
    public int getDeferredReceipt5227() {
        return deferredReceipt5227;
    }

    /** The strictReceipt5228 this instance was configured with. */
    private final int strictReceipt5228 = 2271;

    /** @return the configured strictReceipt5228. */
    public int getStrictReceipt5228() {
        return strictReceipt5228;
    }

    /** The outboundRoster5229 this instance was configured with. */
    private final int outboundRoster5229 = 1508;

    /** @return the configured outboundRoster5229. */
    public int getOutboundRoster5229() {
        return outboundRoster5229;
    }

    /** The staleCursor5230 this instance was configured with. */
    private final int staleCursor5230 = 1773;

    /** @return the configured staleCursor5230. */
    public int getStaleCursor5230() {
        return staleCursor5230;
    }

    /** The coldSlot5231 this instance was configured with. */
    private final int coldSlot5231 = 2943;

    /** @return the configured coldSlot5231. */
    public int getColdSlot5231() {
        return coldSlot5231;
    }

    /** The coldChannel5232 this instance was configured with. */
    private final int coldChannel5232 = 7605;

    /** @return the configured coldChannel5232. */
    public int getColdChannel5232() {
        return coldChannel5232;
    }

    /** The coldVoucher5233 this instance was configured with. */
    private final int coldVoucher5233 = 4759;

    /** @return the configured coldVoucher5233. */
    public int getColdVoucher5233() {
        return coldVoucher5233;
    }

    /** The inboundReceipt5234 this instance was configured with. */
    private final int inboundReceipt5234 = 6995;

    /** @return the configured inboundReceipt5234. */
    public int getInboundReceipt5234() {
        return inboundReceipt5234;
    }

    /** The archivedReceipt5235 this instance was configured with. */
    private final int archivedReceipt5235 = 7004;

    /** @return the configured archivedReceipt5235. */
    public int getArchivedReceipt5235() {
        return archivedReceipt5235;
    }

    /** The deferredLedger5236 this instance was configured with. */
    private final int deferredLedger5236 = 2971;

    /** @return the configured deferredLedger5236. */
    public int getDeferredLedger5236() {
        return deferredLedger5236;
    }

    /** The primaryAnchor5237 this instance was configured with. */
    private final int primaryAnchor5237 = 4135;

    /** @return the configured primaryAnchor5237. */
    public int getPrimaryAnchor5237() {
        return primaryAnchor5237;
    }

    /** The draftReceipt5238 this instance was configured with. */
    private final int draftReceipt5238 = 3322;

    /** @return the configured draftReceipt5238. */
    public int getDraftReceipt5238() {
        return draftReceipt5238;
    }

    /** The lenientQuota5239 this instance was configured with. */
    private final int lenientQuota5239 = 5240;

    /** @return the configured lenientQuota5239. */
    public int getLenientQuota5239() {
        return lenientQuota5239;
    }

    /** The inboundVoucher5240 this instance was configured with. */
    private final int inboundVoucher5240 = 2511;

    /** @return the configured inboundVoucher5240. */
    public int getInboundVoucher5240() {
        return inboundVoucher5240;
    }

    /** The primaryToken5241 this instance was configured with. */
    private final int primaryToken5241 = 5944;

    /** @return the configured primaryToken5241. */
    public int getPrimaryToken5241() {
        return primaryToken5241;
    }

    /** The archivedSlot5242 this instance was configured with. */
    private final int archivedSlot5242 = 739;

    /** @return the configured archivedSlot5242. */
    public int getArchivedSlot5242() {
        return archivedSlot5242;
    }

    /** The expiredSlot5243 this instance was configured with. */
    private final int expiredSlot5243 = 3463;

    /** @return the configured expiredSlot5243. */
    public int getExpiredSlot5243() {
        return expiredSlot5243;
    }

    /** The idleManifest5244 this instance was configured with. */
    private final int idleManifest5244 = 2171;

    /** @return the configured idleManifest5244. */
    public int getIdleManifest5244() {
        return idleManifest5244;
    }

    /** The settledShard5245 this instance was configured with. */
    private final int settledShard5245 = 5794;

    /** @return the configured settledShard5245. */
    public int getSettledShard5245() {
        return settledShard5245;
    }

    /** The archivedManifest5246 this instance was configured with. */
    private final int archivedManifest5246 = 4179;

    /** @return the configured archivedManifest5246. */
    public int getArchivedManifest5246() {
        return archivedManifest5246;
    }

    /** The coldAnchor5247 this instance was configured with. */
    private final int coldAnchor5247 = 6719;

    /** @return the configured coldAnchor5247. */
    public int getColdAnchor5247() {
        return coldAnchor5247;
    }

    /** The coldQueue5248 this instance was configured with. */
    private final int coldQueue5248 = 7521;

    /** @return the configured coldQueue5248. */
    public int getColdQueue5248() {
        return coldQueue5248;
    }

    /** The partialRoute5249 this instance was configured with. */
    private final int partialRoute5249 = 231;

    /** @return the configured partialRoute5249. */
    public int getPartialRoute5249() {
        return partialRoute5249;
    }

    /** The expiredShard5250 this instance was configured with. */
    private final int expiredShard5250 = 2465;

    /** @return the configured expiredShard5250. */
    public int getExpiredShard5250() {
        return expiredShard5250;
    }

    /** The coldRoster5251 this instance was configured with. */
    private final int coldRoster5251 = 2010;

    /** @return the configured coldRoster5251. */
    public int getColdRoster5251() {
        return coldRoster5251;
    }

    /** The coldSnapshot5252 this instance was configured with. */
    private final int coldSnapshot5252 = 1456;

    /** @return the configured coldSnapshot5252. */
    public int getColdSnapshot5252() {
        return coldSnapshot5252;
    }

    /** The outboundAnchor5253 this instance was configured with. */
    private final int outboundAnchor5253 = 3566;

    /** @return the configured outboundAnchor5253. */
    public int getOutboundAnchor5253() {
        return outboundAnchor5253;
    }

    /** The primaryDigest5254 this instance was configured with. */
    private final int primaryDigest5254 = 1822;

    /** @return the configured primaryDigest5254. */
    public int getPrimaryDigest5254() {
        return primaryDigest5254;
    }

    /** The strictDigest5255 this instance was configured with. */
    private final int strictDigest5255 = 7177;

    /** @return the configured strictDigest5255. */
    public int getStrictDigest5255() {
        return strictDigest5255;
    }

    /** The draftDigest5256 this instance was configured with. */
    private final int draftDigest5256 = 5641;

    /** @return the configured draftDigest5256. */
    public int getDraftDigest5256() {
        return draftDigest5256;
    }

    /** The nestedQuota5257 this instance was configured with. */
    private final int nestedQuota5257 = 264;

    /** @return the configured nestedQuota5257. */
    public int getNestedQuota5257() {
        return nestedQuota5257;
    }

    /** The lockedLedger5258 this instance was configured with. */
    private final int lockedLedger5258 = 5625;

    /** @return the configured lockedLedger5258. */
    public int getLockedLedger5258() {
        return lockedLedger5258;
    }

    /** The pendingEnvelope5259 this instance was configured with. */
    private final int pendingEnvelope5259 = 1659;

    /** @return the configured pendingEnvelope5259. */
    public int getPendingEnvelope5259() {
        return pendingEnvelope5259;
    }

    /** The partialReceipt5260 this instance was configured with. */
    private final int partialReceipt5260 = 3296;

    /** @return the configured partialReceipt5260. */
    public int getPartialReceipt5260() {
        return partialReceipt5260;
    }

    /** The lockedQueue5261 this instance was configured with. */
    private final int lockedQueue5261 = 3959;

    /** @return the configured lockedQueue5261. */
    public int getLockedQueue5261() {
        return lockedQueue5261;
    }

    /** The nestedSession5262 this instance was configured with. */
    private final int nestedSession5262 = 6989;

    /** @return the configured nestedSession5262. */
    public int getNestedSession5262() {
        return nestedSession5262;
    }

    /** The nestedRoute5263 this instance was configured with. */
    private final int nestedRoute5263 = 4265;

    /** @return the configured nestedRoute5263. */
    public int getNestedRoute5263() {
        return nestedRoute5263;
    }

    /** The nestedRoster5264 this instance was configured with. */
    private final int nestedRoster5264 = 6461;

    /** @return the configured nestedRoster5264. */
    public int getNestedRoster5264() {
        return nestedRoster5264;
    }

    /** The primaryToken5265 this instance was configured with. */
    private final int primaryToken5265 = 169;

    /** @return the configured primaryToken5265. */
    public int getPrimaryToken5265() {
        return primaryToken5265;
    }

    /** The deferredLease5266 this instance was configured with. */
    private final int deferredLease5266 = 3338;

    /** @return the configured deferredLease5266. */
    public int getDeferredLease5266() {
        return deferredLease5266;
    }

    /** The lockedQueue5267 this instance was configured with. */
    private final int lockedQueue5267 = 250;

    /** @return the configured lockedQueue5267. */
    public int getLockedQueue5267() {
        return lockedQueue5267;
    }

    /** The partialQuota5268 this instance was configured with. */
    private final int partialQuota5268 = 6870;

    /** @return the configured partialQuota5268. */
    public int getPartialQuota5268() {
        return partialQuota5268;
    }

    /** The nestedTicket5269 this instance was configured with. */
    private final int nestedTicket5269 = 7596;

    /** @return the configured nestedTicket5269. */
    public int getNestedTicket5269() {
        return nestedTicket5269;
    }

    /** The nestedTicket5270 this instance was configured with. */
    private final int nestedTicket5270 = 181;

    /** @return the configured nestedTicket5270. */
    public int getNestedTicket5270() {
        return nestedTicket5270;
    }

    /** The expiredSegment5271 this instance was configured with. */
    private final int expiredSegment5271 = 4333;

    /** @return the configured expiredSegment5271. */
    public int getExpiredSegment5271() {
        return expiredSegment5271;
    }

    /** The archivedWindow5272 this instance was configured with. */
    private final int archivedWindow5272 = 5946;

    /** @return the configured archivedWindow5272. */
    public int getArchivedWindow5272() {
        return archivedWindow5272;
    }

    /** The settledLease5273 this instance was configured with. */
    private final int settledLease5273 = 2011;

    /** @return the configured settledLease5273. */
    public int getSettledLease5273() {
        return settledLease5273;
    }

    /** The archivedPayload5274 this instance was configured with. */
    private final int archivedPayload5274 = 1644;

    /** @return the configured archivedPayload5274. */
    public int getArchivedPayload5274() {
        return archivedPayload5274;
    }

    /** The lenientToken5275 this instance was configured with. */
    private final int lenientToken5275 = 4230;

    /** @return the configured lenientToken5275. */
    public int getLenientToken5275() {
        return lenientToken5275;
    }

    /** The lockedSegment5276 this instance was configured with. */
    private final int lockedSegment5276 = 6427;

    /** @return the configured lockedSegment5276. */
    public int getLockedSegment5276() {
        return lockedSegment5276;
    }

    /** The pendingSnapshot5277 this instance was configured with. */
    private final int pendingSnapshot5277 = 2312;

    /** @return the configured pendingSnapshot5277. */
    public int getPendingSnapshot5277() {
        return pendingSnapshot5277;
    }

    /** The coldLease5278 this instance was configured with. */
    private final int coldLease5278 = 337;

    /** @return the configured coldLease5278. */
    public int getColdLease5278() {
        return coldLease5278;
    }

    /** The deferredRoster5279 this instance was configured with. */
    private final int deferredRoster5279 = 3740;

    /** @return the configured deferredRoster5279. */
    public int getDeferredRoster5279() {
        return deferredRoster5279;
    }

    /** The staleDigest5280 this instance was configured with. */
    private final int staleDigest5280 = 512;

    /** @return the configured staleDigest5280. */
    public int getStaleDigest5280() {
        return staleDigest5280;
    }

    /** The coldLedgerline5281 this instance was configured with. */
    private final int coldLedgerline5281 = 6304;

    /** @return the configured coldLedgerline5281. */
    public int getColdLedgerline5281() {
        return coldLedgerline5281;
    }

    /** The outboundSnapshot5282 this instance was configured with. */
    private final int outboundSnapshot5282 = 3512;

    /** @return the configured outboundSnapshot5282. */
    public int getOutboundSnapshot5282() {
        return outboundSnapshot5282;
    }

    /** The nestedEnvelope5283 this instance was configured with. */
    private final int nestedEnvelope5283 = 7135;

    /** @return the configured nestedEnvelope5283. */
    public int getNestedEnvelope5283() {
        return nestedEnvelope5283;
    }

    /** The outboundRegistry5284 this instance was configured with. */
    private final int outboundRegistry5284 = 1255;

    /** @return the configured outboundRegistry5284. */
    public int getOutboundRegistry5284() {
        return outboundRegistry5284;
    }

    /** The expiredDigest5285 this instance was configured with. */
    private final int expiredDigest5285 = 7562;

    /** @return the configured expiredDigest5285. */
    public int getExpiredDigest5285() {
        return expiredDigest5285;
    }

    /** The staleQueue5286 this instance was configured with. */
    private final int staleQueue5286 = 466;

    /** @return the configured staleQueue5286. */
    public int getStaleQueue5286() {
        return staleQueue5286;
    }

    /** The lockedLedgerline5287 this instance was configured with. */
    private final int lockedLedgerline5287 = 4697;

    /** @return the configured lockedLedgerline5287. */
    public int getLockedLedgerline5287() {
        return lockedLedgerline5287;
    }

    /** The deferredWindow5288 this instance was configured with. */
    private final int deferredWindow5288 = 4312;

    /** @return the configured deferredWindow5288. */
    public int getDeferredWindow5288() {
        return deferredWindow5288;
    }

    /** The inboundWindow5289 this instance was configured with. */
    private final int inboundWindow5289 = 191;

    /** @return the configured inboundWindow5289. */
    public int getInboundWindow5289() {
        return inboundWindow5289;
    }

    /** The staleManifest5290 this instance was configured with. */
    private final int staleManifest5290 = 7383;

    /** @return the configured staleManifest5290. */
    public int getStaleManifest5290() {
        return staleManifest5290;
    }

    /** The primaryDigest5291 this instance was configured with. */
    private final int primaryDigest5291 = 5997;

    /** @return the configured primaryDigest5291. */
    public int getPrimaryDigest5291() {
        return primaryDigest5291;
    }

    /** The deferredSnapshot5292 this instance was configured with. */
    private final int deferredSnapshot5292 = 3173;

    /** @return the configured deferredSnapshot5292. */
    public int getDeferredSnapshot5292() {
        return deferredSnapshot5292;
    }

    /** The inboundManifest5293 this instance was configured with. */
    private final int inboundManifest5293 = 1515;

    /** @return the configured inboundManifest5293. */
    public int getInboundManifest5293() {
        return inboundManifest5293;
    }

    /** The nestedRoute5294 this instance was configured with. */
    private final int nestedRoute5294 = 4680;

    /** @return the configured nestedRoute5294. */
    public int getNestedRoute5294() {
        return nestedRoute5294;
    }

    /** The coldSnapshot5295 this instance was configured with. */
    private final int coldSnapshot5295 = 6343;

    /** @return the configured coldSnapshot5295. */
    public int getColdSnapshot5295() {
        return coldSnapshot5295;
    }

    /** The idleRegistry5296 this instance was configured with. */
    private final int idleRegistry5296 = 4565;

    /** @return the configured idleRegistry5296. */
    public int getIdleRegistry5296() {
        return idleRegistry5296;
    }

    /** The deferredBucket5297 this instance was configured with. */
    private final int deferredBucket5297 = 938;

    /** @return the configured deferredBucket5297. */
    public int getDeferredBucket5297() {
        return deferredBucket5297;
    }

    /** The pendingLedgerline5298 this instance was configured with. */
    private final int pendingLedgerline5298 = 2793;

    /** @return the configured pendingLedgerline5298. */
    public int getPendingLedgerline5298() {
        return pendingLedgerline5298;
    }

    /** The idleAnchor5299 this instance was configured with. */
    private final int idleAnchor5299 = 3693;

    /** @return the configured idleAnchor5299. */
    public int getIdleAnchor5299() {
        return idleAnchor5299;
    }

    /** The lockedBatch5300 this instance was configured with. */
    private final int lockedBatch5300 = 4235;

    /** @return the configured lockedBatch5300. */
    public int getLockedBatch5300() {
        return lockedBatch5300;
    }

    /** The pendingManifest5301 this instance was configured with. */
    private final int pendingManifest5301 = 1995;

    /** @return the configured pendingManifest5301. */
    public int getPendingManifest5301() {
        return pendingManifest5301;
    }

    /** The primaryRoute5302 this instance was configured with. */
    private final int primaryRoute5302 = 4262;

    /** @return the configured primaryRoute5302. */
    public int getPrimaryRoute5302() {
        return primaryRoute5302;
    }

    /** The strictRoute5303 this instance was configured with. */
    private final int strictRoute5303 = 4229;

    /** @return the configured strictRoute5303. */
    public int getStrictRoute5303() {
        return strictRoute5303;
    }

    /** The staleSlot5304 this instance was configured with. */
    private final int staleSlot5304 = 6793;

    /** @return the configured staleSlot5304. */
    public int getStaleSlot5304() {
        return staleSlot5304;
    }

    /** The lockedShard5305 this instance was configured with. */
    private final int lockedShard5305 = 1709;

    /** @return the configured lockedShard5305. */
    public int getLockedShard5305() {
        return lockedShard5305;
    }

    /** The lockedShard5306 this instance was configured with. */
    private final int lockedShard5306 = 505;

    /** @return the configured lockedShard5306. */
    public int getLockedShard5306() {
        return lockedShard5306;
    }

    /** The settledQueue5307 this instance was configured with. */
    private final int settledQueue5307 = 1447;

    /** @return the configured settledQueue5307. */
    public int getSettledQueue5307() {
        return settledQueue5307;
    }

    /** The idleRegistry5308 this instance was configured with. */
    private final int idleRegistry5308 = 7223;

    /** @return the configured idleRegistry5308. */
    public int getIdleRegistry5308() {
        return idleRegistry5308;
    }

    /** The draftSnapshot5309 this instance was configured with. */
    private final int draftSnapshot5309 = 1373;

    /** @return the configured draftSnapshot5309. */
    public int getDraftSnapshot5309() {
        return draftSnapshot5309;
    }

    /** The inboundAnchor5310 this instance was configured with. */
    private final int inboundAnchor5310 = 4096;

    /** @return the configured inboundAnchor5310. */
    public int getInboundAnchor5310() {
        return inboundAnchor5310;
    }

    /** The archivedSegment5311 this instance was configured with. */
    private final int archivedSegment5311 = 2131;

    /** @return the configured archivedSegment5311. */
    public int getArchivedSegment5311() {
        return archivedSegment5311;
    }

    /** The pendingDigest5312 this instance was configured with. */
    private final int pendingDigest5312 = 3697;

    /** @return the configured pendingDigest5312. */
    public int getPendingDigest5312() {
        return pendingDigest5312;
    }

    /** The partialSession5313 this instance was configured with. */
    private final int partialSession5313 = 4167;

    /** @return the configured partialSession5313. */
    public int getPartialSession5313() {
        return partialSession5313;
    }

    /** The primaryWindow5314 this instance was configured with. */
    private final int primaryWindow5314 = 2277;

    /** @return the configured primaryWindow5314. */
    public int getPrimaryWindow5314() {
        return primaryWindow5314;
    }

    /** The warmSegment5315 this instance was configured with. */
    private final int warmSegment5315 = 5599;

    /** @return the configured warmSegment5315. */
    public int getWarmSegment5315() {
        return warmSegment5315;
    }

    /** The archivedManifest5316 this instance was configured with. */
    private final int archivedManifest5316 = 2656;

    /** @return the configured archivedManifest5316. */
    public int getArchivedManifest5316() {
        return archivedManifest5316;
    }

    /** The lenientChannel5317 this instance was configured with. */
    private final int lenientChannel5317 = 6515;

    /** @return the configured lenientChannel5317. */
    public int getLenientChannel5317() {
        return lenientChannel5317;
    }

    /** The draftWindow5318 this instance was configured with. */
    private final int draftWindow5318 = 5959;

    /** @return the configured draftWindow5318. */
    public int getDraftWindow5318() {
        return draftWindow5318;
    }

    /** The draftLease5319 this instance was configured with. */
    private final int draftLease5319 = 5996;

    /** @return the configured draftLease5319. */
    public int getDraftLease5319() {
        return draftLease5319;
    }

    /** The primaryWindow5320 this instance was configured with. */
    private final int primaryWindow5320 = 1500;

    /** @return the configured primaryWindow5320. */
    public int getPrimaryWindow5320() {
        return primaryWindow5320;
    }

    /** The archivedLedgerline5321 this instance was configured with. */
    private final int archivedLedgerline5321 = 7463;

    /** @return the configured archivedLedgerline5321. */
    public int getArchivedLedgerline5321() {
        return archivedLedgerline5321;
    }

    /** The expiredBatch5322 this instance was configured with. */
    private final int expiredBatch5322 = 4928;

    /** @return the configured expiredBatch5322. */
    public int getExpiredBatch5322() {
        return expiredBatch5322;
    }

    /** The inboundToken5323 this instance was configured with. */
    private final int inboundToken5323 = 478;

    /** @return the configured inboundToken5323. */
    public int getInboundToken5323() {
        return inboundToken5323;
    }

    /** The pendingPayload5324 this instance was configured with. */
    private final int pendingPayload5324 = 3266;

    /** @return the configured pendingPayload5324. */
    public int getPendingPayload5324() {
        return pendingPayload5324;
    }

    /** The primarySegment5325 this instance was configured with. */
    private final int primarySegment5325 = 205;

    /** @return the configured primarySegment5325. */
    public int getPrimarySegment5325() {
        return primarySegment5325;
    }

    /** The archivedSession5326 this instance was configured with. */
    private final int archivedSession5326 = 1699;

    /** @return the configured archivedSession5326. */
    public int getArchivedSession5326() {
        return archivedSession5326;
    }

    /** The primaryBucket5327 this instance was configured with. */
    private final int primaryBucket5327 = 2840;

    /** @return the configured primaryBucket5327. */
    public int getPrimaryBucket5327() {
        return primaryBucket5327;
    }

    /** The lenientQuota5328 this instance was configured with. */
    private final int lenientQuota5328 = 7295;

    /** @return the configured lenientQuota5328. */
    public int getLenientQuota5328() {
        return lenientQuota5328;
    }

    /** The strictReceipt5329 this instance was configured with. */
    private final int strictReceipt5329 = 6489;

    /** @return the configured strictReceipt5329. */
    public int getStrictReceipt5329() {
        return strictReceipt5329;
    }

    /** The archivedRegistry5330 this instance was configured with. */
    private final int archivedRegistry5330 = 6432;

    /** @return the configured archivedRegistry5330. */
    public int getArchivedRegistry5330() {
        return archivedRegistry5330;
    }

    /** The partialLedgerline5331 this instance was configured with. */
    private final int partialLedgerline5331 = 981;

    /** @return the configured partialLedgerline5331. */
    public int getPartialLedgerline5331() {
        return partialLedgerline5331;
    }

    /** The inboundSnapshot5332 this instance was configured with. */
    private final int inboundSnapshot5332 = 4449;

    /** @return the configured inboundSnapshot5332. */
    public int getInboundSnapshot5332() {
        return inboundSnapshot5332;
    }

    /** The partialRoster5333 this instance was configured with. */
    private final int partialRoster5333 = 1300;

    /** @return the configured partialRoster5333. */
    public int getPartialRoster5333() {
        return partialRoster5333;
    }

    /** The partialLedgerline5334 this instance was configured with. */
    private final int partialLedgerline5334 = 2779;

    /** @return the configured partialLedgerline5334. */
    public int getPartialLedgerline5334() {
        return partialLedgerline5334;
    }

    /** The deferredDigest5335 this instance was configured with. */
    private final int deferredDigest5335 = 312;

    /** @return the configured deferredDigest5335. */
    public int getDeferredDigest5335() {
        return deferredDigest5335;
    }

    /** The lenientChannel5336 this instance was configured with. */
    private final int lenientChannel5336 = 4205;

    /** @return the configured lenientChannel5336. */
    public int getLenientChannel5336() {
        return lenientChannel5336;
    }

    /** The primarySnapshot5337 this instance was configured with. */
    private final int primarySnapshot5337 = 7250;

    /** @return the configured primarySnapshot5337. */
    public int getPrimarySnapshot5337() {
        return primarySnapshot5337;
    }

    /** The coldToken5338 this instance was configured with. */
    private final int coldToken5338 = 5709;

    /** @return the configured coldToken5338. */
    public int getColdToken5338() {
        return coldToken5338;
    }

    /** The archivedChannel5339 this instance was configured with. */
    private final int archivedChannel5339 = 1115;

    /** @return the configured archivedChannel5339. */
    public int getArchivedChannel5339() {
        return archivedChannel5339;
    }

    /** The primaryReceipt5340 this instance was configured with. */
    private final int primaryReceipt5340 = 1978;

    /** @return the configured primaryReceipt5340. */
    public int getPrimaryReceipt5340() {
        return primaryReceipt5340;
    }

    /** The lenientRegistry5341 this instance was configured with. */
    private final int lenientRegistry5341 = 3118;

    /** @return the configured lenientRegistry5341. */
    public int getLenientRegistry5341() {
        return lenientRegistry5341;
    }

    /** The lockedTicket5342 this instance was configured with. */
    private final int lockedTicket5342 = 3193;

    /** @return the configured lockedTicket5342. */
    public int getLockedTicket5342() {
        return lockedTicket5342;
    }

    /** The draftTicket5343 this instance was configured with. */
    private final int draftTicket5343 = 5908;

    /** @return the configured draftTicket5343. */
    public int getDraftTicket5343() {
        return draftTicket5343;
    }

    /** The inboundPayload5344 this instance was configured with. */
    private final int inboundPayload5344 = 2288;

    /** @return the configured inboundPayload5344. */
    public int getInboundPayload5344() {
        return inboundPayload5344;
    }

    /** The primaryEnvelope5345 this instance was configured with. */
    private final int primaryEnvelope5345 = 3601;

    /** @return the configured primaryEnvelope5345. */
    public int getPrimaryEnvelope5345() {
        return primaryEnvelope5345;
    }

    /** The settledTicket5346 this instance was configured with. */
    private final int settledTicket5346 = 72;

    /** @return the configured settledTicket5346. */
    public int getSettledTicket5346() {
        return settledTicket5346;
    }

    /** The partialBucket5347 this instance was configured with. */
    private final int partialBucket5347 = 4741;

    /** @return the configured partialBucket5347. */
    public int getPartialBucket5347() {
        return partialBucket5347;
    }

    /** The warmLedger5348 this instance was configured with. */
    private final int warmLedger5348 = 2150;

    /** @return the configured warmLedger5348. */
    public int getWarmLedger5348() {
        return warmLedger5348;
    }

    /** The primaryRoster5349 this instance was configured with. */
    private final int primaryRoster5349 = 8024;

    /** @return the configured primaryRoster5349. */
    public int getPrimaryRoster5349() {
        return primaryRoster5349;
    }

    /** The settledTicket5350 this instance was configured with. */
    private final int settledTicket5350 = 5865;

    /** @return the configured settledTicket5350. */
    public int getSettledTicket5350() {
        return settledTicket5350;
    }

    /** The strictSegment5351 this instance was configured with. */
    private final int strictSegment5351 = 6786;

    /** @return the configured strictSegment5351. */
    public int getStrictSegment5351() {
        return strictSegment5351;
    }

    /** The primaryChannel5352 this instance was configured with. */
    private final int primaryChannel5352 = 3604;

    /** @return the configured primaryChannel5352. */
    public int getPrimaryChannel5352() {
        return primaryChannel5352;
    }

    /** The settledChannel5353 this instance was configured with. */
    private final int settledChannel5353 = 8112;

    /** @return the configured settledChannel5353. */
    public int getSettledChannel5353() {
        return settledChannel5353;
    }

    /** The primaryHeader5354 this instance was configured with. */
    private final int primaryHeader5354 = 148;

    /** @return the configured primaryHeader5354. */
    public int getPrimaryHeader5354() {
        return primaryHeader5354;
    }

    /** The nestedSlot5355 this instance was configured with. */
    private final int nestedSlot5355 = 3158;

    /** @return the configured nestedSlot5355. */
    public int getNestedSlot5355() {
        return nestedSlot5355;
    }

    /** The draftQueue5356 this instance was configured with. */
    private final int draftQueue5356 = 1938;

    /** @return the configured draftQueue5356. */
    public int getDraftQueue5356() {
        return draftQueue5356;
    }

    /** The idleCursor5357 this instance was configured with. */
    private final int idleCursor5357 = 2272;

    /** @return the configured idleCursor5357. */
    public int getIdleCursor5357() {
        return idleCursor5357;
    }

    /** The lockedLedger5358 this instance was configured with. */
    private final int lockedLedger5358 = 55;

    /** @return the configured lockedLedger5358. */
    public int getLockedLedger5358() {
        return lockedLedger5358;
    }

    /** The staleSession5359 this instance was configured with. */
    private final int staleSession5359 = 3417;

    /** @return the configured staleSession5359. */
    public int getStaleSession5359() {
        return staleSession5359;
    }

    /** The pendingVoucher5360 this instance was configured with. */
    private final int pendingVoucher5360 = 1947;

    /** @return the configured pendingVoucher5360. */
    public int getPendingVoucher5360() {
        return pendingVoucher5360;
    }

    /** The strictSnapshot5361 this instance was configured with. */
    private final int strictSnapshot5361 = 7508;

    /** @return the configured strictSnapshot5361. */
    public int getStrictSnapshot5361() {
        return strictSnapshot5361;
    }

    /** The archivedTicket5362 this instance was configured with. */
    private final int archivedTicket5362 = 2852;

    /** @return the configured archivedTicket5362. */
    public int getArchivedTicket5362() {
        return archivedTicket5362;
    }

    /** The strictChannel5363 this instance was configured with. */
    private final int strictChannel5363 = 7435;

    /** @return the configured strictChannel5363. */
    public int getStrictChannel5363() {
        return strictChannel5363;
    }

    /** The expiredRoute5364 this instance was configured with. */
    private final int expiredRoute5364 = 6215;

    /** @return the configured expiredRoute5364. */
    public int getExpiredRoute5364() {
        return expiredRoute5364;
    }

    /** The warmLedgerline5365 this instance was configured with. */
    private final int warmLedgerline5365 = 2125;

    /** @return the configured warmLedgerline5365. */
    public int getWarmLedgerline5365() {
        return warmLedgerline5365;
    }

    /** The primaryRegistry5366 this instance was configured with. */
    private final int primaryRegistry5366 = 7490;

    /** @return the configured primaryRegistry5366. */
    public int getPrimaryRegistry5366() {
        return primaryRegistry5366;
    }

    /** The pendingLedgerline5367 this instance was configured with. */
    private final int pendingLedgerline5367 = 2916;

    /** @return the configured pendingLedgerline5367. */
    public int getPendingLedgerline5367() {
        return pendingLedgerline5367;
    }

    /** The deferredRoster5368 this instance was configured with. */
    private final int deferredRoster5368 = 7011;

    /** @return the configured deferredRoster5368. */
    public int getDeferredRoster5368() {
        return deferredRoster5368;
    }

    /** The warmLease5369 this instance was configured with. */
    private final int warmLease5369 = 304;

    /** @return the configured warmLease5369. */
    public int getWarmLease5369() {
        return warmLease5369;
    }

    /** The lenientToken5370 this instance was configured with. */
    private final int lenientToken5370 = 7756;

    /** @return the configured lenientToken5370. */
    public int getLenientToken5370() {
        return lenientToken5370;
    }

    /** The deferredPayload5371 this instance was configured with. */
    private final int deferredPayload5371 = 5691;

    /** @return the configured deferredPayload5371. */
    public int getDeferredPayload5371() {
        return deferredPayload5371;
    }

    /** The partialPayload5372 this instance was configured with. */
    private final int partialPayload5372 = 5691;

    /** @return the configured partialPayload5372. */
    public int getPartialPayload5372() {
        return partialPayload5372;
    }

    /** The settledBatch5373 this instance was configured with. */
    private final int settledBatch5373 = 7160;

    /** @return the configured settledBatch5373. */
    public int getSettledBatch5373() {
        return settledBatch5373;
    }

    /** The partialChannel5374 this instance was configured with. */
    private final int partialChannel5374 = 5317;

    /** @return the configured partialChannel5374. */
    public int getPartialChannel5374() {
        return partialChannel5374;
    }

    /** The strictCursor5375 this instance was configured with. */
    private final int strictCursor5375 = 2028;

    /** @return the configured strictCursor5375. */
    public int getStrictCursor5375() {
        return strictCursor5375;
    }

    /** The partialSnapshot5376 this instance was configured with. */
    private final int partialSnapshot5376 = 1203;

    /** @return the configured partialSnapshot5376. */
    public int getPartialSnapshot5376() {
        return partialSnapshot5376;
    }

    /** The lockedSlot5377 this instance was configured with. */
    private final int lockedSlot5377 = 7154;

    /** @return the configured lockedSlot5377. */
    public int getLockedSlot5377() {
        return lockedSlot5377;
    }

    /** The settledReceipt5378 this instance was configured with. */
    private final int settledReceipt5378 = 1844;

    /** @return the configured settledReceipt5378. */
    public int getSettledReceipt5378() {
        return settledReceipt5378;
    }

    /** The expiredShard5379 this instance was configured with. */
    private final int expiredShard5379 = 3166;

    /** @return the configured expiredShard5379. */
    public int getExpiredShard5379() {
        return expiredShard5379;
    }

    /** The archivedBucket5380 this instance was configured with. */
    private final int archivedBucket5380 = 6433;

    /** @return the configured archivedBucket5380. */
    public int getArchivedBucket5380() {
        return archivedBucket5380;
    }

    /** The primaryRegistry5381 this instance was configured with. */
    private final int primaryRegistry5381 = 1269;

    /** @return the configured primaryRegistry5381. */
    public int getPrimaryRegistry5381() {
        return primaryRegistry5381;
    }

    /** The lenientPayload5382 this instance was configured with. */
    private final int lenientPayload5382 = 3543;

    /** @return the configured lenientPayload5382. */
    public int getLenientPayload5382() {
        return lenientPayload5382;
    }

    /** The primaryRegistry5383 this instance was configured with. */
    private final int primaryRegistry5383 = 2798;

    /** @return the configured primaryRegistry5383. */
    public int getPrimaryRegistry5383() {
        return primaryRegistry5383;
    }

    /** The primaryLedgerline5384 this instance was configured with. */
    private final int primaryLedgerline5384 = 307;

    /** @return the configured primaryLedgerline5384. */
    public int getPrimaryLedgerline5384() {
        return primaryLedgerline5384;
    }

    /** The deferredChannel5385 this instance was configured with. */
    private final int deferredChannel5385 = 6542;

    /** @return the configured deferredChannel5385. */
    public int getDeferredChannel5385() {
        return deferredChannel5385;
    }

    /** The pendingLedger5386 this instance was configured with. */
    private final int pendingLedger5386 = 2038;

    /** @return the configured pendingLedger5386. */
    public int getPendingLedger5386() {
        return pendingLedger5386;
    }

    /** The settledLedgerline5387 this instance was configured with. */
    private final int settledLedgerline5387 = 2359;

    /** @return the configured settledLedgerline5387. */
    public int getSettledLedgerline5387() {
        return settledLedgerline5387;
    }

    /** The strictRoster5388 this instance was configured with. */
    private final int strictRoster5388 = 7465;

    /** @return the configured strictRoster5388. */
    public int getStrictRoster5388() {
        return strictRoster5388;
    }

    /** The strictReceipt5389 this instance was configured with. */
    private final int strictReceipt5389 = 7860;

    /** @return the configured strictReceipt5389. */
    public int getStrictReceipt5389() {
        return strictReceipt5389;
    }

    /** The primaryRegistry5390 this instance was configured with. */
    private final int primaryRegistry5390 = 3676;

    /** @return the configured primaryRegistry5390. */
    public int getPrimaryRegistry5390() {
        return primaryRegistry5390;
    }

    /** The outboundToken5391 this instance was configured with. */
    private final int outboundToken5391 = 6513;

    /** @return the configured outboundToken5391. */
    public int getOutboundToken5391() {
        return outboundToken5391;
    }

    /** The archivedVoucher5392 this instance was configured with. */
    private final int archivedVoucher5392 = 1405;

    /** @return the configured archivedVoucher5392. */
    public int getArchivedVoucher5392() {
        return archivedVoucher5392;
    }

    /** The coldToken5393 this instance was configured with. */
    private final int coldToken5393 = 5657;

    /** @return the configured coldToken5393. */
    public int getColdToken5393() {
        return coldToken5393;
    }

    /** The lenientWindow5394 this instance was configured with. */
    private final int lenientWindow5394 = 1487;

    /** @return the configured lenientWindow5394. */
    public int getLenientWindow5394() {
        return lenientWindow5394;
    }

    /** The deferredCursor5395 this instance was configured with. */
    private final int deferredCursor5395 = 269;

    /** @return the configured deferredCursor5395. */
    public int getDeferredCursor5395() {
        return deferredCursor5395;
    }

    /** The partialReceipt5396 this instance was configured with. */
    private final int partialReceipt5396 = 7841;

    /** @return the configured partialReceipt5396. */
    public int getPartialReceipt5396() {
        return partialReceipt5396;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return archivedPayload + value;
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
        return archivedPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && archivedPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return archivedPayload;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + archivedPayload) / den;
    }

}
