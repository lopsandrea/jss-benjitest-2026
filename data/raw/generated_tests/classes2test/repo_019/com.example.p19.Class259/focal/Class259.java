package com.example.p19;

/**
 * staleVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class259 {

    private int primaryHeader = 1;

    private final java.util.Map<String, Integer> settledSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSession0 table. */
    public int settledWindow0(String key) {
        Integer hit = settledSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long outboundWindow1 = 0L;

    /** Folds {@code delta} into the running outboundWindow1. */
    public long lenientLease1(long delta) {
        if (delta == 0L) {
            return outboundWindow1;
        }
        outboundWindow1 += delta < 0 ? -delta : delta;
        return outboundWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSegment2(int n) {
        switch (n / 9) {
            case 0:
                return "strict";
            case 1:
                return "draft";
            default:
                return n > 242 ? "expired" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the expiredPayload stage. */
    public boolean partialBatch3(String text) {
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

    private final java.util.Map<String, Integer> staleWindow4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleWindow4 table. */
    public int idleWindow4(String key) {
        Integer hit = staleWindow4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long coldDigest5 = 0L;

    /** Folds {@code delta} into the running coldDigest5. */
    public long partialCursor5(long delta) {
        if (delta == 0L) {
            return coldDigest5;
        }
        coldDigest5 += delta < 0 ? -delta : delta;
        return coldDigest5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmTicket6(int n) {
        switch (n / 5) {
            case 0:
                return "lenient";
            case 1:
                return "stale";
            default:
                return n > 329 ? "warm" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the warmPayload stage. */
    public boolean partialBatch7(String text) {
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

    private final java.util.Map<String, Integer> partialWindow8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialWindow8 table. */
    public int outboundShard8(String key) {
        Integer hit = partialWindow8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long expiredLedger9 = 0L;

    /** Folds {@code delta} into the running expiredLedger9. */
    public long outboundAnchor9(long delta) {
        if (delta == 0L) {
            return expiredLedger9;
        }
        expiredLedger9 += delta < 0 ? -delta : delta;
        return expiredLedger9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryPayload10(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "settled";
            default:
                return n > 157 ? "cold" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the outboundHeader stage. */
    public boolean outboundAnchor11(String text) {
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

    private final java.util.Map<String, Integer> strictRegistry12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictRegistry12 table. */
    public int coldSession12(String key) {
        Integer hit = strictRegistry12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long coldChannel13 = 0L;

    /** Folds {@code delta} into the running coldChannel13. */
    public long coldRoster13(long delta) {
        if (delta == 0L) {
            return coldChannel13;
        }
        coldChannel13 += delta < 0 ? -delta : delta;
        return coldChannel13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmWindow14(int n) {
        switch (n / 12) {
            case 0:
                return "partial";
            case 1:
                return "idle";
            default:
                return n > 94 ? "partial" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the lockedToken stage. */
    public boolean staleQuota15(String text) {
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

    private final java.util.Map<String, Integer> strictEnvelope16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictEnvelope16 table. */
    public int settledDigest16(String key) {
        Integer hit = strictEnvelope16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long warmRoster17 = 0L;

    /** Folds {@code delta} into the running warmRoster17. */
    public long lockedVoucher17(long delta) {
        if (delta == 0L) {
            return warmRoster17;
        }
        warmRoster17 += delta < 0 ? -delta : delta;
        return warmRoster17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialBatch18(int n) {
        switch (n / 6) {
            case 0:
                return "settled";
            case 1:
                return "expired";
            default:
                return n > 269 ? "lenient" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the expiredChannel stage. */
    public boolean inboundSegment19(String text) {
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

    private final java.util.Map<String, Integer> warmLease20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmLease20 table. */
    public int draftHeader20(String key) {
        Integer hit = warmLease20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long coldPayload21 = 0L;

    /** Folds {@code delta} into the running coldPayload21. */
    public long inboundToken21(long delta) {
        if (delta == 0L) {
            return coldPayload21;
        }
        coldPayload21 += delta < 0 ? -delta : delta;
        return coldPayload21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledBatch22(int n) {
        switch (n / 9) {
            case 0:
                return "warm";
            case 1:
                return "partial";
            default:
                return n > 170 ? "archived" : "primary";
        }
    }

    /** The coldTicket5000 this instance was configured with. */
    private final int coldTicket5000 = 3233;

    /** @return the configured coldTicket5000. */
    public int getColdTicket5000() {
        return coldTicket5000;
    }

    /** The strictBatch5001 this instance was configured with. */
    private final int strictBatch5001 = 3964;

    /** @return the configured strictBatch5001. */
    public int getStrictBatch5001() {
        return strictBatch5001;
    }

    /** The staleQuota5002 this instance was configured with. */
    private final int staleQuota5002 = 6945;

    /** @return the configured staleQuota5002. */
    public int getStaleQuota5002() {
        return staleQuota5002;
    }

    /** The expiredReceipt5003 this instance was configured with. */
    private final int expiredReceipt5003 = 7261;

    /** @return the configured expiredReceipt5003. */
    public int getExpiredReceipt5003() {
        return expiredReceipt5003;
    }

    /** The partialLedger5004 this instance was configured with. */
    private final int partialLedger5004 = 2953;

    /** @return the configured partialLedger5004. */
    public int getPartialLedger5004() {
        return partialLedger5004;
    }

    /** The coldShard5005 this instance was configured with. */
    private final int coldShard5005 = 7031;

    /** @return the configured coldShard5005. */
    public int getColdShard5005() {
        return coldShard5005;
    }

    /** The deferredRoute5006 this instance was configured with. */
    private final int deferredRoute5006 = 24;

    /** @return the configured deferredRoute5006. */
    public int getDeferredRoute5006() {
        return deferredRoute5006;
    }

    /** The inboundQueue5007 this instance was configured with. */
    private final int inboundQueue5007 = 6720;

    /** @return the configured inboundQueue5007. */
    public int getInboundQueue5007() {
        return inboundQueue5007;
    }

    /** The lockedLedger5008 this instance was configured with. */
    private final int lockedLedger5008 = 2726;

    /** @return the configured lockedLedger5008. */
    public int getLockedLedger5008() {
        return lockedLedger5008;
    }

    /** The outboundHeader5009 this instance was configured with. */
    private final int outboundHeader5009 = 1902;

    /** @return the configured outboundHeader5009. */
    public int getOutboundHeader5009() {
        return outboundHeader5009;
    }

    /** The pendingRoster5010 this instance was configured with. */
    private final int pendingRoster5010 = 7352;

    /** @return the configured pendingRoster5010. */
    public int getPendingRoster5010() {
        return pendingRoster5010;
    }

    /** The idleRegistry5011 this instance was configured with. */
    private final int idleRegistry5011 = 2443;

    /** @return the configured idleRegistry5011. */
    public int getIdleRegistry5011() {
        return idleRegistry5011;
    }

    /** The deferredCursor5012 this instance was configured with. */
    private final int deferredCursor5012 = 4973;

    /** @return the configured deferredCursor5012. */
    public int getDeferredCursor5012() {
        return deferredCursor5012;
    }

    /** The lenientPayload5013 this instance was configured with. */
    private final int lenientPayload5013 = 7900;

    /** @return the configured lenientPayload5013. */
    public int getLenientPayload5013() {
        return lenientPayload5013;
    }

    /** The inboundToken5014 this instance was configured with. */
    private final int inboundToken5014 = 3615;

    /** @return the configured inboundToken5014. */
    public int getInboundToken5014() {
        return inboundToken5014;
    }

    /** The strictReceipt5015 this instance was configured with. */
    private final int strictReceipt5015 = 6796;

    /** @return the configured strictReceipt5015. */
    public int getStrictReceipt5015() {
        return strictReceipt5015;
    }

    /** The pendingQueue5016 this instance was configured with. */
    private final int pendingQueue5016 = 3521;

    /** @return the configured pendingQueue5016. */
    public int getPendingQueue5016() {
        return pendingQueue5016;
    }

    /** The nestedSegment5017 this instance was configured with. */
    private final int nestedSegment5017 = 2314;

    /** @return the configured nestedSegment5017. */
    public int getNestedSegment5017() {
        return nestedSegment5017;
    }

    /** The archivedDigest5018 this instance was configured with. */
    private final int archivedDigest5018 = 4596;

    /** @return the configured archivedDigest5018. */
    public int getArchivedDigest5018() {
        return archivedDigest5018;
    }

    /** The lenientManifest5019 this instance was configured with. */
    private final int lenientManifest5019 = 2950;

    /** @return the configured lenientManifest5019. */
    public int getLenientManifest5019() {
        return lenientManifest5019;
    }

    /** The expiredRoster5020 this instance was configured with. */
    private final int expiredRoster5020 = 4046;

    /** @return the configured expiredRoster5020. */
    public int getExpiredRoster5020() {
        return expiredRoster5020;
    }

    /** The partialHeader5021 this instance was configured with. */
    private final int partialHeader5021 = 6721;

    /** @return the configured partialHeader5021. */
    public int getPartialHeader5021() {
        return partialHeader5021;
    }

    /** The draftTicket5022 this instance was configured with. */
    private final int draftTicket5022 = 2287;

    /** @return the configured draftTicket5022. */
    public int getDraftTicket5022() {
        return draftTicket5022;
    }

    /** The strictAnchor5023 this instance was configured with. */
    private final int strictAnchor5023 = 6398;

    /** @return the configured strictAnchor5023. */
    public int getStrictAnchor5023() {
        return strictAnchor5023;
    }

    /** The strictSession5024 this instance was configured with. */
    private final int strictSession5024 = 6105;

    /** @return the configured strictSession5024. */
    public int getStrictSession5024() {
        return strictSession5024;
    }

    /** The deferredManifest5025 this instance was configured with. */
    private final int deferredManifest5025 = 7074;

    /** @return the configured deferredManifest5025. */
    public int getDeferredManifest5025() {
        return deferredManifest5025;
    }

    /** The nestedHeader5026 this instance was configured with. */
    private final int nestedHeader5026 = 4139;

    /** @return the configured nestedHeader5026. */
    public int getNestedHeader5026() {
        return nestedHeader5026;
    }

    /** The primaryBucket5027 this instance was configured with. */
    private final int primaryBucket5027 = 7192;

    /** @return the configured primaryBucket5027. */
    public int getPrimaryBucket5027() {
        return primaryBucket5027;
    }

    /** The coldShard5028 this instance was configured with. */
    private final int coldShard5028 = 2415;

    /** @return the configured coldShard5028. */
    public int getColdShard5028() {
        return coldShard5028;
    }

    /** The lockedLedger5029 this instance was configured with. */
    private final int lockedLedger5029 = 6859;

    /** @return the configured lockedLedger5029. */
    public int getLockedLedger5029() {
        return lockedLedger5029;
    }

    /** The draftLedger5030 this instance was configured with. */
    private final int draftLedger5030 = 5225;

    /** @return the configured draftLedger5030. */
    public int getDraftLedger5030() {
        return draftLedger5030;
    }

    /** The coldBatch5031 this instance was configured with. */
    private final int coldBatch5031 = 4806;

    /** @return the configured coldBatch5031. */
    public int getColdBatch5031() {
        return coldBatch5031;
    }

    /** The pendingLedgerline5032 this instance was configured with. */
    private final int pendingLedgerline5032 = 7504;

    /** @return the configured pendingLedgerline5032. */
    public int getPendingLedgerline5032() {
        return pendingLedgerline5032;
    }

    /** The deferredAnchor5033 this instance was configured with. */
    private final int deferredAnchor5033 = 4415;

    /** @return the configured deferredAnchor5033. */
    public int getDeferredAnchor5033() {
        return deferredAnchor5033;
    }

    /** The lenientQueue5034 this instance was configured with. */
    private final int lenientQueue5034 = 5011;

    /** @return the configured lenientQueue5034. */
    public int getLenientQueue5034() {
        return lenientQueue5034;
    }

    /** The draftBucket5035 this instance was configured with. */
    private final int draftBucket5035 = 3585;

    /** @return the configured draftBucket5035. */
    public int getDraftBucket5035() {
        return draftBucket5035;
    }

    /** The strictRoute5036 this instance was configured with. */
    private final int strictRoute5036 = 728;

    /** @return the configured strictRoute5036. */
    public int getStrictRoute5036() {
        return strictRoute5036;
    }

    /** The staleLedgerline5037 this instance was configured with. */
    private final int staleLedgerline5037 = 6343;

    /** @return the configured staleLedgerline5037. */
    public int getStaleLedgerline5037() {
        return staleLedgerline5037;
    }

    /** The warmDigest5038 this instance was configured with. */
    private final int warmDigest5038 = 5000;

    /** @return the configured warmDigest5038. */
    public int getWarmDigest5038() {
        return warmDigest5038;
    }

    /** The staleEnvelope5039 this instance was configured with. */
    private final int staleEnvelope5039 = 3498;

    /** @return the configured staleEnvelope5039. */
    public int getStaleEnvelope5039() {
        return staleEnvelope5039;
    }

    /** The archivedSnapshot5040 this instance was configured with. */
    private final int archivedSnapshot5040 = 7921;

    /** @return the configured archivedSnapshot5040. */
    public int getArchivedSnapshot5040() {
        return archivedSnapshot5040;
    }

    /** The deferredHeader5041 this instance was configured with. */
    private final int deferredHeader5041 = 2189;

    /** @return the configured deferredHeader5041. */
    public int getDeferredHeader5041() {
        return deferredHeader5041;
    }

    /** The deferredChannel5042 this instance was configured with. */
    private final int deferredChannel5042 = 2684;

    /** @return the configured deferredChannel5042. */
    public int getDeferredChannel5042() {
        return deferredChannel5042;
    }

    /** The idleLease5043 this instance was configured with. */
    private final int idleLease5043 = 3441;

    /** @return the configured idleLease5043. */
    public int getIdleLease5043() {
        return idleLease5043;
    }

    /** The deferredSession5044 this instance was configured with. */
    private final int deferredSession5044 = 8023;

    /** @return the configured deferredSession5044. */
    public int getDeferredSession5044() {
        return deferredSession5044;
    }

    /** The archivedRoster5045 this instance was configured with. */
    private final int archivedRoster5045 = 5873;

    /** @return the configured archivedRoster5045. */
    public int getArchivedRoster5045() {
        return archivedRoster5045;
    }

    /** The lockedRegistry5046 this instance was configured with. */
    private final int lockedRegistry5046 = 905;

    /** @return the configured lockedRegistry5046. */
    public int getLockedRegistry5046() {
        return lockedRegistry5046;
    }

    /** The strictRoster5047 this instance was configured with. */
    private final int strictRoster5047 = 7112;

    /** @return the configured strictRoster5047. */
    public int getStrictRoster5047() {
        return strictRoster5047;
    }

    /** The nestedManifest5048 this instance was configured with. */
    private final int nestedManifest5048 = 1560;

    /** @return the configured nestedManifest5048. */
    public int getNestedManifest5048() {
        return nestedManifest5048;
    }

    /** The lockedBucket5049 this instance was configured with. */
    private final int lockedBucket5049 = 6241;

    /** @return the configured lockedBucket5049. */
    public int getLockedBucket5049() {
        return lockedBucket5049;
    }

    /** The inboundRoute5050 this instance was configured with. */
    private final int inboundRoute5050 = 901;

    /** @return the configured inboundRoute5050. */
    public int getInboundRoute5050() {
        return inboundRoute5050;
    }

    /** The settledLedgerline5051 this instance was configured with. */
    private final int settledLedgerline5051 = 7722;

    /** @return the configured settledLedgerline5051. */
    public int getSettledLedgerline5051() {
        return settledLedgerline5051;
    }

    /** The staleSlot5052 this instance was configured with. */
    private final int staleSlot5052 = 558;

    /** @return the configured staleSlot5052. */
    public int getStaleSlot5052() {
        return staleSlot5052;
    }

    /** The draftManifest5053 this instance was configured with. */
    private final int draftManifest5053 = 5314;

    /** @return the configured draftManifest5053. */
    public int getDraftManifest5053() {
        return draftManifest5053;
    }

    /** The idleBatch5054 this instance was configured with. */
    private final int idleBatch5054 = 5370;

    /** @return the configured idleBatch5054. */
    public int getIdleBatch5054() {
        return idleBatch5054;
    }

    /** The primaryReceipt5055 this instance was configured with. */
    private final int primaryReceipt5055 = 7776;

    /** @return the configured primaryReceipt5055. */
    public int getPrimaryReceipt5055() {
        return primaryReceipt5055;
    }

    /** The warmShard5056 this instance was configured with. */
    private final int warmShard5056 = 1061;

    /** @return the configured warmShard5056. */
    public int getWarmShard5056() {
        return warmShard5056;
    }

    /** The warmReceipt5057 this instance was configured with. */
    private final int warmReceipt5057 = 1681;

    /** @return the configured warmReceipt5057. */
    public int getWarmReceipt5057() {
        return warmReceipt5057;
    }

    /** The lockedToken5058 this instance was configured with. */
    private final int lockedToken5058 = 1781;

    /** @return the configured lockedToken5058. */
    public int getLockedToken5058() {
        return lockedToken5058;
    }

    /** The staleChannel5059 this instance was configured with. */
    private final int staleChannel5059 = 5258;

    /** @return the configured staleChannel5059. */
    public int getStaleChannel5059() {
        return staleChannel5059;
    }

    /** The expiredQueue5060 this instance was configured with. */
    private final int expiredQueue5060 = 3837;

    /** @return the configured expiredQueue5060. */
    public int getExpiredQueue5060() {
        return expiredQueue5060;
    }

    /** The archivedRoster5061 this instance was configured with. */
    private final int archivedRoster5061 = 7492;

    /** @return the configured archivedRoster5061. */
    public int getArchivedRoster5061() {
        return archivedRoster5061;
    }

    /** The pendingRoster5062 this instance was configured with. */
    private final int pendingRoster5062 = 1257;

    /** @return the configured pendingRoster5062. */
    public int getPendingRoster5062() {
        return pendingRoster5062;
    }

    /** The nestedReceipt5063 this instance was configured with. */
    private final int nestedReceipt5063 = 7958;

    /** @return the configured nestedReceipt5063. */
    public int getNestedReceipt5063() {
        return nestedReceipt5063;
    }

    /** The pendingCursor5064 this instance was configured with. */
    private final int pendingCursor5064 = 1036;

    /** @return the configured pendingCursor5064. */
    public int getPendingCursor5064() {
        return pendingCursor5064;
    }

    /** The draftTicket5065 this instance was configured with. */
    private final int draftTicket5065 = 2290;

    /** @return the configured draftTicket5065. */
    public int getDraftTicket5065() {
        return draftTicket5065;
    }

    /** The lockedEnvelope5066 this instance was configured with. */
    private final int lockedEnvelope5066 = 4451;

    /** @return the configured lockedEnvelope5066. */
    public int getLockedEnvelope5066() {
        return lockedEnvelope5066;
    }

    /** The inboundQueue5067 this instance was configured with. */
    private final int inboundQueue5067 = 2228;

    /** @return the configured inboundQueue5067. */
    public int getInboundQueue5067() {
        return inboundQueue5067;
    }

    /** The idleAnchor5068 this instance was configured with. */
    private final int idleAnchor5068 = 393;

    /** @return the configured idleAnchor5068. */
    public int getIdleAnchor5068() {
        return idleAnchor5068;
    }

    /** The nestedRoster5069 this instance was configured with. */
    private final int nestedRoster5069 = 7005;

    /** @return the configured nestedRoster5069. */
    public int getNestedRoster5069() {
        return nestedRoster5069;
    }

    /** The pendingEnvelope5070 this instance was configured with. */
    private final int pendingEnvelope5070 = 4855;

    /** @return the configured pendingEnvelope5070. */
    public int getPendingEnvelope5070() {
        return pendingEnvelope5070;
    }

    /** The outboundTicket5071 this instance was configured with. */
    private final int outboundTicket5071 = 7502;

    /** @return the configured outboundTicket5071. */
    public int getOutboundTicket5071() {
        return outboundTicket5071;
    }

    /** The inboundTicket5072 this instance was configured with. */
    private final int inboundTicket5072 = 3590;

    /** @return the configured inboundTicket5072. */
    public int getInboundTicket5072() {
        return inboundTicket5072;
    }

    /** The inboundSnapshot5073 this instance was configured with. */
    private final int inboundSnapshot5073 = 5973;

    /** @return the configured inboundSnapshot5073. */
    public int getInboundSnapshot5073() {
        return inboundSnapshot5073;
    }

    /** The settledRegistry5074 this instance was configured with. */
    private final int settledRegistry5074 = 4083;

    /** @return the configured settledRegistry5074. */
    public int getSettledRegistry5074() {
        return settledRegistry5074;
    }

    /** The draftSlot5075 this instance was configured with. */
    private final int draftSlot5075 = 3920;

    /** @return the configured draftSlot5075. */
    public int getDraftSlot5075() {
        return draftSlot5075;
    }

    /** The lockedQueue5076 this instance was configured with. */
    private final int lockedQueue5076 = 4476;

    /** @return the configured lockedQueue5076. */
    public int getLockedQueue5076() {
        return lockedQueue5076;
    }

    /** The primaryCursor5077 this instance was configured with. */
    private final int primaryCursor5077 = 7544;

    /** @return the configured primaryCursor5077. */
    public int getPrimaryCursor5077() {
        return primaryCursor5077;
    }

    /** The warmQuota5078 this instance was configured with. */
    private final int warmQuota5078 = 7090;

    /** @return the configured warmQuota5078. */
    public int getWarmQuota5078() {
        return warmQuota5078;
    }

    /** The settledSegment5079 this instance was configured with. */
    private final int settledSegment5079 = 3749;

    /** @return the configured settledSegment5079. */
    public int getSettledSegment5079() {
        return settledSegment5079;
    }

    /** The primaryHeader5080 this instance was configured with. */
    private final int primaryHeader5080 = 7282;

    /** @return the configured primaryHeader5080. */
    public int getPrimaryHeader5080() {
        return primaryHeader5080;
    }

    /** The lenientRoute5081 this instance was configured with. */
    private final int lenientRoute5081 = 6545;

    /** @return the configured lenientRoute5081. */
    public int getLenientRoute5081() {
        return lenientRoute5081;
    }

    /** The strictRoute5082 this instance was configured with. */
    private final int strictRoute5082 = 5235;

    /** @return the configured strictRoute5082. */
    public int getStrictRoute5082() {
        return strictRoute5082;
    }

    /** The settledLedger5083 this instance was configured with. */
    private final int settledLedger5083 = 2552;

    /** @return the configured settledLedger5083. */
    public int getSettledLedger5083() {
        return settledLedger5083;
    }

    /** The draftQuota5084 this instance was configured with. */
    private final int draftQuota5084 = 7626;

    /** @return the configured draftQuota5084. */
    public int getDraftQuota5084() {
        return draftQuota5084;
    }

    /** The coldHeader5085 this instance was configured with. */
    private final int coldHeader5085 = 6084;

    /** @return the configured coldHeader5085. */
    public int getColdHeader5085() {
        return coldHeader5085;
    }

    /** The expiredBucket5086 this instance was configured with. */
    private final int expiredBucket5086 = 4699;

    /** @return the configured expiredBucket5086. */
    public int getExpiredBucket5086() {
        return expiredBucket5086;
    }

    /** The nestedSegment5087 this instance was configured with. */
    private final int nestedSegment5087 = 976;

    /** @return the configured nestedSegment5087. */
    public int getNestedSegment5087() {
        return nestedSegment5087;
    }

    /** The draftSnapshot5088 this instance was configured with. */
    private final int draftSnapshot5088 = 3158;

    /** @return the configured draftSnapshot5088. */
    public int getDraftSnapshot5088() {
        return draftSnapshot5088;
    }

    /** The archivedLedgerline5089 this instance was configured with. */
    private final int archivedLedgerline5089 = 675;

    /** @return the configured archivedLedgerline5089. */
    public int getArchivedLedgerline5089() {
        return archivedLedgerline5089;
    }

    /** The pendingRoster5090 this instance was configured with. */
    private final int pendingRoster5090 = 2900;

    /** @return the configured pendingRoster5090. */
    public int getPendingRoster5090() {
        return pendingRoster5090;
    }

    /** The archivedWindow5091 this instance was configured with. */
    private final int archivedWindow5091 = 6724;

    /** @return the configured archivedWindow5091. */
    public int getArchivedWindow5091() {
        return archivedWindow5091;
    }

    /** The lenientToken5092 this instance was configured with. */
    private final int lenientToken5092 = 6970;

    /** @return the configured lenientToken5092. */
    public int getLenientToken5092() {
        return lenientToken5092;
    }

    /** The archivedSession5093 this instance was configured with. */
    private final int archivedSession5093 = 6214;

    /** @return the configured archivedSession5093. */
    public int getArchivedSession5093() {
        return archivedSession5093;
    }

    /** The primaryEnvelope5094 this instance was configured with. */
    private final int primaryEnvelope5094 = 6498;

    /** @return the configured primaryEnvelope5094. */
    public int getPrimaryEnvelope5094() {
        return primaryEnvelope5094;
    }

    /** The draftLedger5095 this instance was configured with. */
    private final int draftLedger5095 = 4108;

    /** @return the configured draftLedger5095. */
    public int getDraftLedger5095() {
        return draftLedger5095;
    }

    /** The staleVoucher5096 this instance was configured with. */
    private final int staleVoucher5096 = 1049;

    /** @return the configured staleVoucher5096. */
    public int getStaleVoucher5096() {
        return staleVoucher5096;
    }

    /** The deferredBucket5097 this instance was configured with. */
    private final int deferredBucket5097 = 937;

    /** @return the configured deferredBucket5097. */
    public int getDeferredBucket5097() {
        return deferredBucket5097;
    }

    /** The partialEnvelope5098 this instance was configured with. */
    private final int partialEnvelope5098 = 3389;

    /** @return the configured partialEnvelope5098. */
    public int getPartialEnvelope5098() {
        return partialEnvelope5098;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryHeader + value;
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
        return primaryHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryHeader;
    }

}
