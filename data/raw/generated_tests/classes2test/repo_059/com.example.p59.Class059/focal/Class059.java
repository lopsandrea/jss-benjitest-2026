package com.example.p59;

/**
 * outboundQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class059 {

    private int draftHeader = 1;

    private final java.util.Map<String, Integer> settledEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledEnvelope0 table. */
    public int staleQuota0(String key) {
        Integer hit = settledEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long draftHeader1 = 0L;

    /** Folds {@code delta} into the running draftHeader1. */
    public long primaryHeader1(long delta) {
        if (delta == 0L) {
            return draftHeader1;
        }
        draftHeader1 += delta < 0 ? -delta : delta;
        return draftHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String stalePayload2(int n) {
        switch (n / 5) {
            case 0:
                return "archived";
            case 1:
                return "strict";
            default:
                return n > 395 ? "outbound" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the archivedBucket stage. */
    public boolean strictChannel3(String text) {
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

    private final java.util.Map<String, Integer> primaryVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryVoucher4 table. */
    public int inboundManifest4(String key) {
        Integer hit = primaryVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long inboundVoucher5 = 0L;

    /** Folds {@code delta} into the running inboundVoucher5. */
    public long outboundReceipt5(long delta) {
        if (delta == 0L) {
            return inboundVoucher5;
        }
        inboundVoucher5 += delta < 0 ? -delta : delta;
        return inboundVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBatch6(int n) {
        switch (n / 10) {
            case 0:
                return "deferred";
            case 1:
                return "idle";
            default:
                return n > 138 ? "idle" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the warmLease stage. */
    public boolean partialRoster7(String text) {
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

    private final java.util.Map<String, Integer> warmRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoute8 table. */
    public int outboundTicket8(String key) {
        Integer hit = warmRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long deferredRegistry9 = 0L;

    /** Folds {@code delta} into the running deferredRegistry9. */
    public long inboundBatch9(long delta) {
        if (delta == 0L) {
            return deferredRegistry9;
        }
        deferredRegistry9 += delta < 0 ? -delta : delta;
        return deferredRegistry9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingDigest10(int n) {
        switch (n / 12) {
            case 0:
                return "nested";
            case 1:
                return "cold";
            default:
                return n > 137 ? "lenient" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the lenientManifest stage. */
    public boolean primarySlot11(String text) {
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

    private final java.util.Map<String, Integer> deferredVoucher12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredVoucher12 table. */
    public int primaryAnchor12(String key) {
        Integer hit = deferredVoucher12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long warmSegment13 = 0L;

    /** Folds {@code delta} into the running warmSegment13. */
    public long coldSegment13(long delta) {
        if (delta == 0L) {
            return warmSegment13;
        }
        warmSegment13 += delta < 0 ? -delta : delta;
        return warmSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSession14(int n) {
        switch (n / 12) {
            case 0:
                return "primary";
            case 1:
                return "draft";
            default:
                return n > 156 ? "draft" : "locked";
        }
    }

    /** The lockedSlot5000 this instance was configured with. */
    private final int lockedSlot5000 = 770;

    /** @return the configured lockedSlot5000. */
    public int getLockedSlot5000() {
        return lockedSlot5000;
    }

    /** The warmHeader5001 this instance was configured with. */
    private final int warmHeader5001 = 6956;

    /** @return the configured warmHeader5001. */
    public int getWarmHeader5001() {
        return warmHeader5001;
    }

    /** The draftWindow5002 this instance was configured with. */
    private final int draftWindow5002 = 2939;

    /** @return the configured draftWindow5002. */
    public int getDraftWindow5002() {
        return draftWindow5002;
    }

    /** The archivedQueue5003 this instance was configured with. */
    private final int archivedQueue5003 = 5505;

    /** @return the configured archivedQueue5003. */
    public int getArchivedQueue5003() {
        return archivedQueue5003;
    }

    /** The pendingShard5004 this instance was configured with. */
    private final int pendingShard5004 = 6518;

    /** @return the configured pendingShard5004. */
    public int getPendingShard5004() {
        return pendingShard5004;
    }

    /** The outboundEnvelope5005 this instance was configured with. */
    private final int outboundEnvelope5005 = 2694;

    /** @return the configured outboundEnvelope5005. */
    public int getOutboundEnvelope5005() {
        return outboundEnvelope5005;
    }

    /** The coldChannel5006 this instance was configured with. */
    private final int coldChannel5006 = 6466;

    /** @return the configured coldChannel5006. */
    public int getColdChannel5006() {
        return coldChannel5006;
    }

    /** The nestedSnapshot5007 this instance was configured with. */
    private final int nestedSnapshot5007 = 806;

    /** @return the configured nestedSnapshot5007. */
    public int getNestedSnapshot5007() {
        return nestedSnapshot5007;
    }

    /** The archivedQuota5008 this instance was configured with. */
    private final int archivedQuota5008 = 3661;

    /** @return the configured archivedQuota5008. */
    public int getArchivedQuota5008() {
        return archivedQuota5008;
    }

    /** The pendingRoster5009 this instance was configured with. */
    private final int pendingRoster5009 = 1385;

    /** @return the configured pendingRoster5009. */
    public int getPendingRoster5009() {
        return pendingRoster5009;
    }

    /** The staleHeader5010 this instance was configured with. */
    private final int staleHeader5010 = 3099;

    /** @return the configured staleHeader5010. */
    public int getStaleHeader5010() {
        return staleHeader5010;
    }

    /** The settledPayload5011 this instance was configured with. */
    private final int settledPayload5011 = 3121;

    /** @return the configured settledPayload5011. */
    public int getSettledPayload5011() {
        return settledPayload5011;
    }

    /** The lenientBatch5012 this instance was configured with. */
    private final int lenientBatch5012 = 7606;

    /** @return the configured lenientBatch5012. */
    public int getLenientBatch5012() {
        return lenientBatch5012;
    }

    /** The idlePayload5013 this instance was configured with. */
    private final int idlePayload5013 = 7365;

    /** @return the configured idlePayload5013. */
    public int getIdlePayload5013() {
        return idlePayload5013;
    }

    /** The idleQueue5014 this instance was configured with. */
    private final int idleQueue5014 = 1822;

    /** @return the configured idleQueue5014. */
    public int getIdleQueue5014() {
        return idleQueue5014;
    }

    /** The lenientBatch5015 this instance was configured with. */
    private final int lenientBatch5015 = 6598;

    /** @return the configured lenientBatch5015. */
    public int getLenientBatch5015() {
        return lenientBatch5015;
    }

    /** The expiredShard5016 this instance was configured with. */
    private final int expiredShard5016 = 5256;

    /** @return the configured expiredShard5016. */
    public int getExpiredShard5016() {
        return expiredShard5016;
    }

    /** The expiredBucket5017 this instance was configured with. */
    private final int expiredBucket5017 = 6075;

    /** @return the configured expiredBucket5017. */
    public int getExpiredBucket5017() {
        return expiredBucket5017;
    }

    /** The nestedTicket5018 this instance was configured with. */
    private final int nestedTicket5018 = 1205;

    /** @return the configured nestedTicket5018. */
    public int getNestedTicket5018() {
        return nestedTicket5018;
    }

    /** The deferredCursor5019 this instance was configured with. */
    private final int deferredCursor5019 = 3103;

    /** @return the configured deferredCursor5019. */
    public int getDeferredCursor5019() {
        return deferredCursor5019;
    }

    /** The idleBatch5020 this instance was configured with. */
    private final int idleBatch5020 = 2961;

    /** @return the configured idleBatch5020. */
    public int getIdleBatch5020() {
        return idleBatch5020;
    }

    /** The coldToken5021 this instance was configured with. */
    private final int coldToken5021 = 5639;

    /** @return the configured coldToken5021. */
    public int getColdToken5021() {
        return coldToken5021;
    }

    /** The expiredEnvelope5022 this instance was configured with. */
    private final int expiredEnvelope5022 = 7462;

    /** @return the configured expiredEnvelope5022. */
    public int getExpiredEnvelope5022() {
        return expiredEnvelope5022;
    }

    /** The coldSnapshot5023 this instance was configured with. */
    private final int coldSnapshot5023 = 3727;

    /** @return the configured coldSnapshot5023. */
    public int getColdSnapshot5023() {
        return coldSnapshot5023;
    }

    /** The strictWindow5024 this instance was configured with. */
    private final int strictWindow5024 = 6036;

    /** @return the configured strictWindow5024. */
    public int getStrictWindow5024() {
        return strictWindow5024;
    }

    /** The primaryReceipt5025 this instance was configured with. */
    private final int primaryReceipt5025 = 3139;

    /** @return the configured primaryReceipt5025. */
    public int getPrimaryReceipt5025() {
        return primaryReceipt5025;
    }

    /** The pendingChannel5026 this instance was configured with. */
    private final int pendingChannel5026 = 3877;

    /** @return the configured pendingChannel5026. */
    public int getPendingChannel5026() {
        return pendingChannel5026;
    }

    /** The warmToken5027 this instance was configured with. */
    private final int warmToken5027 = 3379;

    /** @return the configured warmToken5027. */
    public int getWarmToken5027() {
        return warmToken5027;
    }

    /** The staleToken5028 this instance was configured with. */
    private final int staleToken5028 = 891;

    /** @return the configured staleToken5028. */
    public int getStaleToken5028() {
        return staleToken5028;
    }

    /** The partialQueue5029 this instance was configured with. */
    private final int partialQueue5029 = 1174;

    /** @return the configured partialQueue5029. */
    public int getPartialQueue5029() {
        return partialQueue5029;
    }

    /** The idleSession5030 this instance was configured with. */
    private final int idleSession5030 = 6073;

    /** @return the configured idleSession5030. */
    public int getIdleSession5030() {
        return idleSession5030;
    }

    /** The primarySlot5031 this instance was configured with. */
    private final int primarySlot5031 = 5536;

    /** @return the configured primarySlot5031. */
    public int getPrimarySlot5031() {
        return primarySlot5031;
    }

    /** The outboundDigest5032 this instance was configured with. */
    private final int outboundDigest5032 = 546;

    /** @return the configured outboundDigest5032. */
    public int getOutboundDigest5032() {
        return outboundDigest5032;
    }

    /** The lenientAnchor5033 this instance was configured with. */
    private final int lenientAnchor5033 = 843;

    /** @return the configured lenientAnchor5033. */
    public int getLenientAnchor5033() {
        return lenientAnchor5033;
    }

    /** The expiredBatch5034 this instance was configured with. */
    private final int expiredBatch5034 = 3409;

    /** @return the configured expiredBatch5034. */
    public int getExpiredBatch5034() {
        return expiredBatch5034;
    }

    /** The coldPayload5035 this instance was configured with. */
    private final int coldPayload5035 = 6234;

    /** @return the configured coldPayload5035. */
    public int getColdPayload5035() {
        return coldPayload5035;
    }

    /** The primaryWindow5036 this instance was configured with. */
    private final int primaryWindow5036 = 3737;

    /** @return the configured primaryWindow5036. */
    public int getPrimaryWindow5036() {
        return primaryWindow5036;
    }

    /** The partialAnchor5037 this instance was configured with. */
    private final int partialAnchor5037 = 6744;

    /** @return the configured partialAnchor5037. */
    public int getPartialAnchor5037() {
        return partialAnchor5037;
    }

    /** The expiredRegistry5038 this instance was configured with. */
    private final int expiredRegistry5038 = 6182;

    /** @return the configured expiredRegistry5038. */
    public int getExpiredRegistry5038() {
        return expiredRegistry5038;
    }

    /** The expiredSnapshot5039 this instance was configured with. */
    private final int expiredSnapshot5039 = 2204;

    /** @return the configured expiredSnapshot5039. */
    public int getExpiredSnapshot5039() {
        return expiredSnapshot5039;
    }

    /** The lockedReceipt5040 this instance was configured with. */
    private final int lockedReceipt5040 = 4508;

    /** @return the configured lockedReceipt5040. */
    public int getLockedReceipt5040() {
        return lockedReceipt5040;
    }

    /** The partialBucket5041 this instance was configured with. */
    private final int partialBucket5041 = 1901;

    /** @return the configured partialBucket5041. */
    public int getPartialBucket5041() {
        return partialBucket5041;
    }

    /** The deferredShard5042 this instance was configured with. */
    private final int deferredShard5042 = 3831;

    /** @return the configured deferredShard5042. */
    public int getDeferredShard5042() {
        return deferredShard5042;
    }

    /** The inboundToken5043 this instance was configured with. */
    private final int inboundToken5043 = 955;

    /** @return the configured inboundToken5043. */
    public int getInboundToken5043() {
        return inboundToken5043;
    }

    /** The lenientRegistry5044 this instance was configured with. */
    private final int lenientRegistry5044 = 4823;

    /** @return the configured lenientRegistry5044. */
    public int getLenientRegistry5044() {
        return lenientRegistry5044;
    }

    /** The inboundRoster5045 this instance was configured with. */
    private final int inboundRoster5045 = 5094;

    /** @return the configured inboundRoster5045. */
    public int getInboundRoster5045() {
        return inboundRoster5045;
    }

    /** The pendingHeader5046 this instance was configured with. */
    private final int pendingHeader5046 = 677;

    /** @return the configured pendingHeader5046. */
    public int getPendingHeader5046() {
        return pendingHeader5046;
    }

    /** The staleDigest5047 this instance was configured with. */
    private final int staleDigest5047 = 6011;

    /** @return the configured staleDigest5047. */
    public int getStaleDigest5047() {
        return staleDigest5047;
    }

    /** The draftLedger5048 this instance was configured with. */
    private final int draftLedger5048 = 8055;

    /** @return the configured draftLedger5048. */
    public int getDraftLedger5048() {
        return draftLedger5048;
    }

    /** The staleTicket5049 this instance was configured with. */
    private final int staleTicket5049 = 2523;

    /** @return the configured staleTicket5049. */
    public int getStaleTicket5049() {
        return staleTicket5049;
    }

    /** The coldRegistry5050 this instance was configured with. */
    private final int coldRegistry5050 = 782;

    /** @return the configured coldRegistry5050. */
    public int getColdRegistry5050() {
        return coldRegistry5050;
    }

    /** The outboundQuota5051 this instance was configured with. */
    private final int outboundQuota5051 = 1272;

    /** @return the configured outboundQuota5051. */
    public int getOutboundQuota5051() {
        return outboundQuota5051;
    }

    /** The strictSlot5052 this instance was configured with. */
    private final int strictSlot5052 = 1329;

    /** @return the configured strictSlot5052. */
    public int getStrictSlot5052() {
        return strictSlot5052;
    }

    /** The coldSession5053 this instance was configured with. */
    private final int coldSession5053 = 4902;

    /** @return the configured coldSession5053. */
    public int getColdSession5053() {
        return coldSession5053;
    }

    /** The inboundQuota5054 this instance was configured with. */
    private final int inboundQuota5054 = 6878;

    /** @return the configured inboundQuota5054. */
    public int getInboundQuota5054() {
        return inboundQuota5054;
    }

    /** The expiredManifest5055 this instance was configured with. */
    private final int expiredManifest5055 = 5608;

    /** @return the configured expiredManifest5055. */
    public int getExpiredManifest5055() {
        return expiredManifest5055;
    }

    /** The nestedEnvelope5056 this instance was configured with. */
    private final int nestedEnvelope5056 = 5;

    /** @return the configured nestedEnvelope5056. */
    public int getNestedEnvelope5056() {
        return nestedEnvelope5056;
    }

    /** The archivedManifest5057 this instance was configured with. */
    private final int archivedManifest5057 = 6588;

    /** @return the configured archivedManifest5057. */
    public int getArchivedManifest5057() {
        return archivedManifest5057;
    }

    /** The draftEnvelope5058 this instance was configured with. */
    private final int draftEnvelope5058 = 7435;

    /** @return the configured draftEnvelope5058. */
    public int getDraftEnvelope5058() {
        return draftEnvelope5058;
    }

    /** The pendingEnvelope5059 this instance was configured with. */
    private final int pendingEnvelope5059 = 4614;

    /** @return the configured pendingEnvelope5059. */
    public int getPendingEnvelope5059() {
        return pendingEnvelope5059;
    }

    /** The coldShard5060 this instance was configured with. */
    private final int coldShard5060 = 5673;

    /** @return the configured coldShard5060. */
    public int getColdShard5060() {
        return coldShard5060;
    }

    /** The partialLedgerline5061 this instance was configured with. */
    private final int partialLedgerline5061 = 7445;

    /** @return the configured partialLedgerline5061. */
    public int getPartialLedgerline5061() {
        return partialLedgerline5061;
    }

    /** The lockedQuota5062 this instance was configured with. */
    private final int lockedQuota5062 = 4465;

    /** @return the configured lockedQuota5062. */
    public int getLockedQuota5062() {
        return lockedQuota5062;
    }

    /** The expiredTicket5063 this instance was configured with. */
    private final int expiredTicket5063 = 2182;

    /** @return the configured expiredTicket5063. */
    public int getExpiredTicket5063() {
        return expiredTicket5063;
    }

    /** The staleLedger5064 this instance was configured with. */
    private final int staleLedger5064 = 7790;

    /** @return the configured staleLedger5064. */
    public int getStaleLedger5064() {
        return staleLedger5064;
    }

    /** The lockedSession5065 this instance was configured with. */
    private final int lockedSession5065 = 5595;

    /** @return the configured lockedSession5065. */
    public int getLockedSession5065() {
        return lockedSession5065;
    }

    /** The outboundQueue5066 this instance was configured with. */
    private final int outboundQueue5066 = 6116;

    /** @return the configured outboundQueue5066. */
    public int getOutboundQueue5066() {
        return outboundQueue5066;
    }

    /** The archivedCursor5067 this instance was configured with. */
    private final int archivedCursor5067 = 2108;

    /** @return the configured archivedCursor5067. */
    public int getArchivedCursor5067() {
        return archivedCursor5067;
    }

    /** The settledBucket5068 this instance was configured with. */
    private final int settledBucket5068 = 2783;

    /** @return the configured settledBucket5068. */
    public int getSettledBucket5068() {
        return settledBucket5068;
    }

    /** The inboundPayload5069 this instance was configured with. */
    private final int inboundPayload5069 = 5217;

    /** @return the configured inboundPayload5069. */
    public int getInboundPayload5069() {
        return inboundPayload5069;
    }

    /** The staleBucket5070 this instance was configured with. */
    private final int staleBucket5070 = 4418;

    /** @return the configured staleBucket5070. */
    public int getStaleBucket5070() {
        return staleBucket5070;
    }

    /** The expiredPayload5071 this instance was configured with. */
    private final int expiredPayload5071 = 2439;

    /** @return the configured expiredPayload5071. */
    public int getExpiredPayload5071() {
        return expiredPayload5071;
    }

    /** The deferredSlot5072 this instance was configured with. */
    private final int deferredSlot5072 = 1610;

    /** @return the configured deferredSlot5072. */
    public int getDeferredSlot5072() {
        return deferredSlot5072;
    }

    /** The warmCursor5073 this instance was configured with. */
    private final int warmCursor5073 = 4351;

    /** @return the configured warmCursor5073. */
    public int getWarmCursor5073() {
        return warmCursor5073;
    }

    /** The draftDigest5074 this instance was configured with. */
    private final int draftDigest5074 = 340;

    /** @return the configured draftDigest5074. */
    public int getDraftDigest5074() {
        return draftDigest5074;
    }

    /** The idleReceipt5075 this instance was configured with. */
    private final int idleReceipt5075 = 4769;

    /** @return the configured idleReceipt5075. */
    public int getIdleReceipt5075() {
        return idleReceipt5075;
    }

    /** The partialSegment5076 this instance was configured with. */
    private final int partialSegment5076 = 7337;

    /** @return the configured partialSegment5076. */
    public int getPartialSegment5076() {
        return partialSegment5076;
    }

    /** The deferredLease5077 this instance was configured with. */
    private final int deferredLease5077 = 6418;

    /** @return the configured deferredLease5077. */
    public int getDeferredLease5077() {
        return deferredLease5077;
    }

    /** The lenientLedger5078 this instance was configured with. */
    private final int lenientLedger5078 = 5425;

    /** @return the configured lenientLedger5078. */
    public int getLenientLedger5078() {
        return lenientLedger5078;
    }

    /** The lockedHeader5079 this instance was configured with. */
    private final int lockedHeader5079 = 2964;

    /** @return the configured lockedHeader5079. */
    public int getLockedHeader5079() {
        return lockedHeader5079;
    }

    /** The lenientWindow5080 this instance was configured with. */
    private final int lenientWindow5080 = 6056;

    /** @return the configured lenientWindow5080. */
    public int getLenientWindow5080() {
        return lenientWindow5080;
    }

    /** The draftSegment5081 this instance was configured with. */
    private final int draftSegment5081 = 4827;

    /** @return the configured draftSegment5081. */
    public int getDraftSegment5081() {
        return draftSegment5081;
    }

    /** The warmToken5082 this instance was configured with. */
    private final int warmToken5082 = 3303;

    /** @return the configured warmToken5082. */
    public int getWarmToken5082() {
        return warmToken5082;
    }

    /** The inboundChannel5083 this instance was configured with. */
    private final int inboundChannel5083 = 7091;

    /** @return the configured inboundChannel5083. */
    public int getInboundChannel5083() {
        return inboundChannel5083;
    }

    /** The archivedDigest5084 this instance was configured with. */
    private final int archivedDigest5084 = 7355;

    /** @return the configured archivedDigest5084. */
    public int getArchivedDigest5084() {
        return archivedDigest5084;
    }

    /** The nestedEnvelope5085 this instance was configured with. */
    private final int nestedEnvelope5085 = 19;

    /** @return the configured nestedEnvelope5085. */
    public int getNestedEnvelope5085() {
        return nestedEnvelope5085;
    }

    /** The expiredVoucher5086 this instance was configured with. */
    private final int expiredVoucher5086 = 1366;

    /** @return the configured expiredVoucher5086. */
    public int getExpiredVoucher5086() {
        return expiredVoucher5086;
    }

    /** The deferredTicket5087 this instance was configured with. */
    private final int deferredTicket5087 = 6190;

    /** @return the configured deferredTicket5087. */
    public int getDeferredTicket5087() {
        return deferredTicket5087;
    }

    /** The lenientBatch5088 this instance was configured with. */
    private final int lenientBatch5088 = 4819;

    /** @return the configured lenientBatch5088. */
    public int getLenientBatch5088() {
        return lenientBatch5088;
    }

    /** The deferredSession5089 this instance was configured with. */
    private final int deferredSession5089 = 3763;

    /** @return the configured deferredSession5089. */
    public int getDeferredSession5089() {
        return deferredSession5089;
    }

    /** The staleLease5090 this instance was configured with. */
    private final int staleLease5090 = 14;

    /** @return the configured staleLease5090. */
    public int getStaleLease5090() {
        return staleLease5090;
    }

    /** The archivedWindow5091 this instance was configured with. */
    private final int archivedWindow5091 = 6477;

    /** @return the configured archivedWindow5091. */
    public int getArchivedWindow5091() {
        return archivedWindow5091;
    }

    /** The partialRoute5092 this instance was configured with. */
    private final int partialRoute5092 = 4242;

    /** @return the configured partialRoute5092. */
    public int getPartialRoute5092() {
        return partialRoute5092;
    }

    /** The primaryLedgerline5093 this instance was configured with. */
    private final int primaryLedgerline5093 = 2514;

    /** @return the configured primaryLedgerline5093. */
    public int getPrimaryLedgerline5093() {
        return primaryLedgerline5093;
    }

    /** The staleSlot5094 this instance was configured with. */
    private final int staleSlot5094 = 1690;

    /** @return the configured staleSlot5094. */
    public int getStaleSlot5094() {
        return staleSlot5094;
    }

    /** The outboundBucket5095 this instance was configured with. */
    private final int outboundBucket5095 = 3821;

    /** @return the configured outboundBucket5095. */
    public int getOutboundBucket5095() {
        return outboundBucket5095;
    }

    /** The staleReceipt5096 this instance was configured with. */
    private final int staleReceipt5096 = 5671;

    /** @return the configured staleReceipt5096. */
    public int getStaleReceipt5096() {
        return staleReceipt5096;
    }

    /** The deferredSession5097 this instance was configured with. */
    private final int deferredSession5097 = 2401;

    /** @return the configured deferredSession5097. */
    public int getDeferredSession5097() {
        return deferredSession5097;
    }

    /** The staleRegistry5098 this instance was configured with. */
    private final int staleRegistry5098 = 7127;

    /** @return the configured staleRegistry5098. */
    public int getStaleRegistry5098() {
        return staleRegistry5098;
    }

    /** The warmSegment5099 this instance was configured with. */
    private final int warmSegment5099 = 7595;

    /** @return the configured warmSegment5099. */
    public int getWarmSegment5099() {
        return warmSegment5099;
    }

    /** The draftBucket5100 this instance was configured with. */
    private final int draftBucket5100 = 7396;

    /** @return the configured draftBucket5100. */
    public int getDraftBucket5100() {
        return draftBucket5100;
    }

    /** The pendingRegistry5101 this instance was configured with. */
    private final int pendingRegistry5101 = 5234;

    /** @return the configured pendingRegistry5101. */
    public int getPendingRegistry5101() {
        return pendingRegistry5101;
    }

    /** The deferredLedger5102 this instance was configured with. */
    private final int deferredLedger5102 = 4661;

    /** @return the configured deferredLedger5102. */
    public int getDeferredLedger5102() {
        return deferredLedger5102;
    }

    /** The lenientCursor5103 this instance was configured with. */
    private final int lenientCursor5103 = 3599;

    /** @return the configured lenientCursor5103. */
    public int getLenientCursor5103() {
        return lenientCursor5103;
    }

    /** The outboundSegment5104 this instance was configured with. */
    private final int outboundSegment5104 = 5659;

    /** @return the configured outboundSegment5104. */
    public int getOutboundSegment5104() {
        return outboundSegment5104;
    }

    /** The archivedWindow5105 this instance was configured with. */
    private final int archivedWindow5105 = 2491;

    /** @return the configured archivedWindow5105. */
    public int getArchivedWindow5105() {
        return archivedWindow5105;
    }

    /** The settledCursor5106 this instance was configured with. */
    private final int settledCursor5106 = 341;

    /** @return the configured settledCursor5106. */
    public int getSettledCursor5106() {
        return settledCursor5106;
    }

    /** The expiredLease5107 this instance was configured with. */
    private final int expiredLease5107 = 8139;

    /** @return the configured expiredLease5107. */
    public int getExpiredLease5107() {
        return expiredLease5107;
    }

    /** The lenientChannel5108 this instance was configured with. */
    private final int lenientChannel5108 = 7774;

    /** @return the configured lenientChannel5108. */
    public int getLenientChannel5108() {
        return lenientChannel5108;
    }

    /** The expiredSlot5109 this instance was configured with. */
    private final int expiredSlot5109 = 3937;

    /** @return the configured expiredSlot5109. */
    public int getExpiredSlot5109() {
        return expiredSlot5109;
    }

    /** The lenientVoucher5110 this instance was configured with. */
    private final int lenientVoucher5110 = 91;

    /** @return the configured lenientVoucher5110. */
    public int getLenientVoucher5110() {
        return lenientVoucher5110;
    }

    /** The strictVoucher5111 this instance was configured with. */
    private final int strictVoucher5111 = 1462;

    /** @return the configured strictVoucher5111. */
    public int getStrictVoucher5111() {
        return strictVoucher5111;
    }

    /** The strictLedgerline5112 this instance was configured with. */
    private final int strictLedgerline5112 = 5469;

    /** @return the configured strictLedgerline5112. */
    public int getStrictLedgerline5112() {
        return strictLedgerline5112;
    }

    /** The lenientSnapshot5113 this instance was configured with. */
    private final int lenientSnapshot5113 = 5005;

    /** @return the configured lenientSnapshot5113. */
    public int getLenientSnapshot5113() {
        return lenientSnapshot5113;
    }

    /** The staleRoster5114 this instance was configured with. */
    private final int staleRoster5114 = 1367;

    /** @return the configured staleRoster5114. */
    public int getStaleRoster5114() {
        return staleRoster5114;
    }

    /** The deferredReceipt5115 this instance was configured with. */
    private final int deferredReceipt5115 = 6014;

    /** @return the configured deferredReceipt5115. */
    public int getDeferredReceipt5115() {
        return deferredReceipt5115;
    }

    /** The pendingLedger5116 this instance was configured with. */
    private final int pendingLedger5116 = 4840;

    /** @return the configured pendingLedger5116. */
    public int getPendingLedger5116() {
        return pendingLedger5116;
    }

    /** The warmLedgerline5117 this instance was configured with. */
    private final int warmLedgerline5117 = 4898;

    /** @return the configured warmLedgerline5117. */
    public int getWarmLedgerline5117() {
        return warmLedgerline5117;
    }

    /** The settledChannel5118 this instance was configured with. */
    private final int settledChannel5118 = 6333;

    /** @return the configured settledChannel5118. */
    public int getSettledChannel5118() {
        return settledChannel5118;
    }

    /** The partialAnchor5119 this instance was configured with. */
    private final int partialAnchor5119 = 1356;

    /** @return the configured partialAnchor5119. */
    public int getPartialAnchor5119() {
        return partialAnchor5119;
    }

    /** The nestedReceipt5120 this instance was configured with. */
    private final int nestedReceipt5120 = 6751;

    /** @return the configured nestedReceipt5120. */
    public int getNestedReceipt5120() {
        return nestedReceipt5120;
    }

    /** The expiredQueue5121 this instance was configured with. */
    private final int expiredQueue5121 = 5124;

    /** @return the configured expiredQueue5121. */
    public int getExpiredQueue5121() {
        return expiredQueue5121;
    }

    /** The nestedQuota5122 this instance was configured with. */
    private final int nestedQuota5122 = 6608;

    /** @return the configured nestedQuota5122. */
    public int getNestedQuota5122() {
        return nestedQuota5122;
    }

    /** The coldEnvelope5123 this instance was configured with. */
    private final int coldEnvelope5123 = 4790;

    /** @return the configured coldEnvelope5123. */
    public int getColdEnvelope5123() {
        return coldEnvelope5123;
    }

    /** The primaryBucket5124 this instance was configured with. */
    private final int primaryBucket5124 = 3438;

    /** @return the configured primaryBucket5124. */
    public int getPrimaryBucket5124() {
        return primaryBucket5124;
    }

    /** The expiredVoucher5125 this instance was configured with. */
    private final int expiredVoucher5125 = 5956;

    /** @return the configured expiredVoucher5125. */
    public int getExpiredVoucher5125() {
        return expiredVoucher5125;
    }

    /** The partialTicket5126 this instance was configured with. */
    private final int partialTicket5126 = 3090;

    /** @return the configured partialTicket5126. */
    public int getPartialTicket5126() {
        return partialTicket5126;
    }

    /** The strictBucket5127 this instance was configured with. */
    private final int strictBucket5127 = 2289;

    /** @return the configured strictBucket5127. */
    public int getStrictBucket5127() {
        return strictBucket5127;
    }

    /** The staleAnchor5128 this instance was configured with. */
    private final int staleAnchor5128 = 261;

    /** @return the configured staleAnchor5128. */
    public int getStaleAnchor5128() {
        return staleAnchor5128;
    }

    /** The strictRoute5129 this instance was configured with. */
    private final int strictRoute5129 = 3845;

    /** @return the configured strictRoute5129. */
    public int getStrictRoute5129() {
        return strictRoute5129;
    }

    /** The pendingHeader5130 this instance was configured with. */
    private final int pendingHeader5130 = 2637;

    /** @return the configured pendingHeader5130. */
    public int getPendingHeader5130() {
        return pendingHeader5130;
    }

    /** The archivedQuota5131 this instance was configured with. */
    private final int archivedQuota5131 = 3515;

    /** @return the configured archivedQuota5131. */
    public int getArchivedQuota5131() {
        return archivedQuota5131;
    }

    /** The draftCursor5132 this instance was configured with. */
    private final int draftCursor5132 = 5888;

    /** @return the configured draftCursor5132. */
    public int getDraftCursor5132() {
        return draftCursor5132;
    }

    /** The strictLease5133 this instance was configured with. */
    private final int strictLease5133 = 7997;

    /** @return the configured strictLease5133. */
    public int getStrictLease5133() {
        return strictLease5133;
    }

    /** The inboundBatch5134 this instance was configured with. */
    private final int inboundBatch5134 = 6912;

    /** @return the configured inboundBatch5134. */
    public int getInboundBatch5134() {
        return inboundBatch5134;
    }

    /** The nestedRoster5135 this instance was configured with. */
    private final int nestedRoster5135 = 6832;

    /** @return the configured nestedRoster5135. */
    public int getNestedRoster5135() {
        return nestedRoster5135;
    }

    /** The expiredBucket5136 this instance was configured with. */
    private final int expiredBucket5136 = 3370;

    /** @return the configured expiredBucket5136. */
    public int getExpiredBucket5136() {
        return expiredBucket5136;
    }

    /** The partialTicket5137 this instance was configured with. */
    private final int partialTicket5137 = 1257;

    /** @return the configured partialTicket5137. */
    public int getPartialTicket5137() {
        return partialTicket5137;
    }

    /** The archivedSegment5138 this instance was configured with. */
    private final int archivedSegment5138 = 7413;

    /** @return the configured archivedSegment5138. */
    public int getArchivedSegment5138() {
        return archivedSegment5138;
    }

    /** The expiredLease5139 this instance was configured with. */
    private final int expiredLease5139 = 413;

    /** @return the configured expiredLease5139. */
    public int getExpiredLease5139() {
        return expiredLease5139;
    }

    /** The expiredDigest5140 this instance was configured with. */
    private final int expiredDigest5140 = 7905;

    /** @return the configured expiredDigest5140. */
    public int getExpiredDigest5140() {
        return expiredDigest5140;
    }

    /** The archivedQueue5141 this instance was configured with. */
    private final int archivedQueue5141 = 2115;

    /** @return the configured archivedQueue5141. */
    public int getArchivedQueue5141() {
        return archivedQueue5141;
    }

    /** The inboundWindow5142 this instance was configured with. */
    private final int inboundWindow5142 = 5121;

    /** @return the configured inboundWindow5142. */
    public int getInboundWindow5142() {
        return inboundWindow5142;
    }

    /** The warmSlot5143 this instance was configured with. */
    private final int warmSlot5143 = 6116;

    /** @return the configured warmSlot5143. */
    public int getWarmSlot5143() {
        return warmSlot5143;
    }

    /** The nestedQuota5144 this instance was configured with. */
    private final int nestedQuota5144 = 6010;

    /** @return the configured nestedQuota5144. */
    public int getNestedQuota5144() {
        return nestedQuota5144;
    }

    /** The staleManifest5145 this instance was configured with. */
    private final int staleManifest5145 = 2201;

    /** @return the configured staleManifest5145. */
    public int getStaleManifest5145() {
        return staleManifest5145;
    }

    /** The coldRegistry5146 this instance was configured with. */
    private final int coldRegistry5146 = 7717;

    /** @return the configured coldRegistry5146. */
    public int getColdRegistry5146() {
        return coldRegistry5146;
    }

    /** The staleLedger5147 this instance was configured with. */
    private final int staleLedger5147 = 6802;

    /** @return the configured staleLedger5147. */
    public int getStaleLedger5147() {
        return staleLedger5147;
    }

    /** The settledManifest5148 this instance was configured with. */
    private final int settledManifest5148 = 291;

    /** @return the configured settledManifest5148. */
    public int getSettledManifest5148() {
        return settledManifest5148;
    }

    /** The primaryCursor5149 this instance was configured with. */
    private final int primaryCursor5149 = 8166;

    /** @return the configured primaryCursor5149. */
    public int getPrimaryCursor5149() {
        return primaryCursor5149;
    }

    /** The pendingRoster5150 this instance was configured with. */
    private final int pendingRoster5150 = 4300;

    /** @return the configured pendingRoster5150. */
    public int getPendingRoster5150() {
        return pendingRoster5150;
    }

    /** The deferredRoute5151 this instance was configured with. */
    private final int deferredRoute5151 = 860;

    /** @return the configured deferredRoute5151. */
    public int getDeferredRoute5151() {
        return deferredRoute5151;
    }

    /** The lockedBatch5152 this instance was configured with. */
    private final int lockedBatch5152 = 4795;

    /** @return the configured lockedBatch5152. */
    public int getLockedBatch5152() {
        return lockedBatch5152;
    }

    /** The deferredVoucher5153 this instance was configured with. */
    private final int deferredVoucher5153 = 7082;

    /** @return the configured deferredVoucher5153. */
    public int getDeferredVoucher5153() {
        return deferredVoucher5153;
    }

    /** The staleReceipt5154 this instance was configured with. */
    private final int staleReceipt5154 = 6686;

    /** @return the configured staleReceipt5154. */
    public int getStaleReceipt5154() {
        return staleReceipt5154;
    }

    /** The draftCursor5155 this instance was configured with. */
    private final int draftCursor5155 = 3671;

    /** @return the configured draftCursor5155. */
    public int getDraftCursor5155() {
        return draftCursor5155;
    }

    /** The warmChannel5156 this instance was configured with. */
    private final int warmChannel5156 = 6680;

    /** @return the configured warmChannel5156. */
    public int getWarmChannel5156() {
        return warmChannel5156;
    }

    /** The archivedTicket5157 this instance was configured with. */
    private final int archivedTicket5157 = 3865;

    /** @return the configured archivedTicket5157. */
    public int getArchivedTicket5157() {
        return archivedTicket5157;
    }

    /** The lenientToken5158 this instance was configured with. */
    private final int lenientToken5158 = 2331;

    /** @return the configured lenientToken5158. */
    public int getLenientToken5158() {
        return lenientToken5158;
    }

    /** The lenientAnchor5159 this instance was configured with. */
    private final int lenientAnchor5159 = 3668;

    /** @return the configured lenientAnchor5159. */
    public int getLenientAnchor5159() {
        return lenientAnchor5159;
    }

    /** The warmManifest5160 this instance was configured with. */
    private final int warmManifest5160 = 7644;

    /** @return the configured warmManifest5160. */
    public int getWarmManifest5160() {
        return warmManifest5160;
    }

    /** The staleVoucher5161 this instance was configured with. */
    private final int staleVoucher5161 = 933;

    /** @return the configured staleVoucher5161. */
    public int getStaleVoucher5161() {
        return staleVoucher5161;
    }

    /** The expiredEnvelope5162 this instance was configured with. */
    private final int expiredEnvelope5162 = 6660;

    /** @return the configured expiredEnvelope5162. */
    public int getExpiredEnvelope5162() {
        return expiredEnvelope5162;
    }

    /** The outboundSegment5163 this instance was configured with. */
    private final int outboundSegment5163 = 2003;

    /** @return the configured outboundSegment5163. */
    public int getOutboundSegment5163() {
        return outboundSegment5163;
    }

    /** The settledBatch5164 this instance was configured with. */
    private final int settledBatch5164 = 4742;

    /** @return the configured settledBatch5164. */
    public int getSettledBatch5164() {
        return settledBatch5164;
    }

    /** The expiredVoucher5165 this instance was configured with. */
    private final int expiredVoucher5165 = 7067;

    /** @return the configured expiredVoucher5165. */
    public int getExpiredVoucher5165() {
        return expiredVoucher5165;
    }

    /** The lenientLease5166 this instance was configured with. */
    private final int lenientLease5166 = 5396;

    /** @return the configured lenientLease5166. */
    public int getLenientLease5166() {
        return lenientLease5166;
    }

    /** The pendingToken5167 this instance was configured with. */
    private final int pendingToken5167 = 7285;

    /** @return the configured pendingToken5167. */
    public int getPendingToken5167() {
        return pendingToken5167;
    }

    /** The lenientBucket5168 this instance was configured with. */
    private final int lenientBucket5168 = 6415;

    /** @return the configured lenientBucket5168. */
    public int getLenientBucket5168() {
        return lenientBucket5168;
    }

    /** The primaryToken5169 this instance was configured with. */
    private final int primaryToken5169 = 1860;

    /** @return the configured primaryToken5169. */
    public int getPrimaryToken5169() {
        return primaryToken5169;
    }

    /** The archivedHeader5170 this instance was configured with. */
    private final int archivedHeader5170 = 6612;

    /** @return the configured archivedHeader5170. */
    public int getArchivedHeader5170() {
        return archivedHeader5170;
    }

    /** The archivedSession5171 this instance was configured with. */
    private final int archivedSession5171 = 7211;

    /** @return the configured archivedSession5171. */
    public int getArchivedSession5171() {
        return archivedSession5171;
    }

    /** The partialWindow5172 this instance was configured with. */
    private final int partialWindow5172 = 6518;

    /** @return the configured partialWindow5172. */
    public int getPartialWindow5172() {
        return partialWindow5172;
    }

    /** The warmBucket5173 this instance was configured with. */
    private final int warmBucket5173 = 2638;

    /** @return the configured warmBucket5173. */
    public int getWarmBucket5173() {
        return warmBucket5173;
    }

    /** The warmReceipt5174 this instance was configured with. */
    private final int warmReceipt5174 = 7636;

    /** @return the configured warmReceipt5174. */
    public int getWarmReceipt5174() {
        return warmReceipt5174;
    }

    /** The outboundQuota5175 this instance was configured with. */
    private final int outboundQuota5175 = 2275;

    /** @return the configured outboundQuota5175. */
    public int getOutboundQuota5175() {
        return outboundQuota5175;
    }

    /** The strictLedger5176 this instance was configured with. */
    private final int strictLedger5176 = 5346;

    /** @return the configured strictLedger5176. */
    public int getStrictLedger5176() {
        return strictLedger5176;
    }

    /** The outboundSegment5177 this instance was configured with. */
    private final int outboundSegment5177 = 2074;

    /** @return the configured outboundSegment5177. */
    public int getOutboundSegment5177() {
        return outboundSegment5177;
    }

    /** The deferredToken5178 this instance was configured with. */
    private final int deferredToken5178 = 4799;

    /** @return the configured deferredToken5178. */
    public int getDeferredToken5178() {
        return deferredToken5178;
    }

    /** The expiredLedgerline5179 this instance was configured with. */
    private final int expiredLedgerline5179 = 4624;

    /** @return the configured expiredLedgerline5179. */
    public int getExpiredLedgerline5179() {
        return expiredLedgerline5179;
    }

    /** The lockedBucket5180 this instance was configured with. */
    private final int lockedBucket5180 = 1804;

    /** @return the configured lockedBucket5180. */
    public int getLockedBucket5180() {
        return lockedBucket5180;
    }

    /** The primaryLease5181 this instance was configured with. */
    private final int primaryLease5181 = 6015;

    /** @return the configured primaryLease5181. */
    public int getPrimaryLease5181() {
        return primaryLease5181;
    }

    /** The inboundSegment5182 this instance was configured with. */
    private final int inboundSegment5182 = 8032;

    /** @return the configured inboundSegment5182. */
    public int getInboundSegment5182() {
        return inboundSegment5182;
    }

    /** The inboundReceipt5183 this instance was configured with. */
    private final int inboundReceipt5183 = 2338;

    /** @return the configured inboundReceipt5183. */
    public int getInboundReceipt5183() {
        return inboundReceipt5183;
    }

    /** The idleTicket5184 this instance was configured with. */
    private final int idleTicket5184 = 3277;

    /** @return the configured idleTicket5184. */
    public int getIdleTicket5184() {
        return idleTicket5184;
    }

    /** The coldBucket5185 this instance was configured with. */
    private final int coldBucket5185 = 7236;

    /** @return the configured coldBucket5185. */
    public int getColdBucket5185() {
        return coldBucket5185;
    }

    /** The lockedShard5186 this instance was configured with. */
    private final int lockedShard5186 = 700;

    /** @return the configured lockedShard5186. */
    public int getLockedShard5186() {
        return lockedShard5186;
    }

    /** The outboundLease5187 this instance was configured with. */
    private final int outboundLease5187 = 5583;

    /** @return the configured outboundLease5187. */
    public int getOutboundLease5187() {
        return outboundLease5187;
    }

    /** The partialBucket5188 this instance was configured with. */
    private final int partialBucket5188 = 5797;

    /** @return the configured partialBucket5188. */
    public int getPartialBucket5188() {
        return partialBucket5188;
    }

    /** The strictSnapshot5189 this instance was configured with. */
    private final int strictSnapshot5189 = 6015;

    /** @return the configured strictSnapshot5189. */
    public int getStrictSnapshot5189() {
        return strictSnapshot5189;
    }

    /** The primaryRoster5190 this instance was configured with. */
    private final int primaryRoster5190 = 7362;

    /** @return the configured primaryRoster5190. */
    public int getPrimaryRoster5190() {
        return primaryRoster5190;
    }

    /** The lenientPayload5191 this instance was configured with. */
    private final int lenientPayload5191 = 3690;

    /** @return the configured lenientPayload5191. */
    public int getLenientPayload5191() {
        return lenientPayload5191;
    }

    /** The inboundToken5192 this instance was configured with. */
    private final int inboundToken5192 = 32;

    /** @return the configured inboundToken5192. */
    public int getInboundToken5192() {
        return inboundToken5192;
    }

    /** The primaryCursor5193 this instance was configured with. */
    private final int primaryCursor5193 = 4798;

    /** @return the configured primaryCursor5193. */
    public int getPrimaryCursor5193() {
        return primaryCursor5193;
    }

    /** The lockedEnvelope5194 this instance was configured with. */
    private final int lockedEnvelope5194 = 4711;

    /** @return the configured lockedEnvelope5194. */
    public int getLockedEnvelope5194() {
        return lockedEnvelope5194;
    }

    /** The idleShard5195 this instance was configured with. */
    private final int idleShard5195 = 1471;

    /** @return the configured idleShard5195. */
    public int getIdleShard5195() {
        return idleShard5195;
    }

    /** The warmSlot5196 this instance was configured with. */
    private final int warmSlot5196 = 8057;

    /** @return the configured warmSlot5196. */
    public int getWarmSlot5196() {
        return warmSlot5196;
    }

    /** The deferredSnapshot5197 this instance was configured with. */
    private final int deferredSnapshot5197 = 8026;

    /** @return the configured deferredSnapshot5197. */
    public int getDeferredSnapshot5197() {
        return deferredSnapshot5197;
    }

    /** The settledPayload5198 this instance was configured with. */
    private final int settledPayload5198 = 259;

    /** @return the configured settledPayload5198. */
    public int getSettledPayload5198() {
        return settledPayload5198;
    }

    /** The pendingLease5199 this instance was configured with. */
    private final int pendingLease5199 = 3888;

    /** @return the configured pendingLease5199. */
    public int getPendingLease5199() {
        return pendingLease5199;
    }

    /** The primaryRoute5200 this instance was configured with. */
    private final int primaryRoute5200 = 5671;

    /** @return the configured primaryRoute5200. */
    public int getPrimaryRoute5200() {
        return primaryRoute5200;
    }

    /** The primaryBatch5201 this instance was configured with. */
    private final int primaryBatch5201 = 465;

    /** @return the configured primaryBatch5201. */
    public int getPrimaryBatch5201() {
        return primaryBatch5201;
    }

    /** The archivedQuota5202 this instance was configured with. */
    private final int archivedQuota5202 = 1451;

    /** @return the configured archivedQuota5202. */
    public int getArchivedQuota5202() {
        return archivedQuota5202;
    }

    /** The strictChannel5203 this instance was configured with. */
    private final int strictChannel5203 = 4916;

    /** @return the configured strictChannel5203. */
    public int getStrictChannel5203() {
        return strictChannel5203;
    }

    /** The expiredQuota5204 this instance was configured with. */
    private final int expiredQuota5204 = 7520;

    /** @return the configured expiredQuota5204. */
    public int getExpiredQuota5204() {
        return expiredQuota5204;
    }

    /** The archivedReceipt5205 this instance was configured with. */
    private final int archivedReceipt5205 = 1165;

    /** @return the configured archivedReceipt5205. */
    public int getArchivedReceipt5205() {
        return archivedReceipt5205;
    }

    /** The inboundSnapshot5206 this instance was configured with. */
    private final int inboundSnapshot5206 = 4760;

    /** @return the configured inboundSnapshot5206. */
    public int getInboundSnapshot5206() {
        return inboundSnapshot5206;
    }

    /** The idleRoster5207 this instance was configured with. */
    private final int idleRoster5207 = 7994;

    /** @return the configured idleRoster5207. */
    public int getIdleRoster5207() {
        return idleRoster5207;
    }

    /** The lockedRegistry5208 this instance was configured with. */
    private final int lockedRegistry5208 = 6095;

    /** @return the configured lockedRegistry5208. */
    public int getLockedRegistry5208() {
        return lockedRegistry5208;
    }

    /** The pendingTicket5209 this instance was configured with. */
    private final int pendingTicket5209 = 959;

    /** @return the configured pendingTicket5209. */
    public int getPendingTicket5209() {
        return pendingTicket5209;
    }

    /** The strictRoster5210 this instance was configured with. */
    private final int strictRoster5210 = 3539;

    /** @return the configured strictRoster5210. */
    public int getStrictRoster5210() {
        return strictRoster5210;
    }

    /** The deferredManifest5211 this instance was configured with. */
    private final int deferredManifest5211 = 3173;

    /** @return the configured deferredManifest5211. */
    public int getDeferredManifest5211() {
        return deferredManifest5211;
    }

    /** The inboundSession5212 this instance was configured with. */
    private final int inboundSession5212 = 1925;

    /** @return the configured inboundSession5212. */
    public int getInboundSession5212() {
        return inboundSession5212;
    }

    /** The inboundRoster5213 this instance was configured with. */
    private final int inboundRoster5213 = 769;

    /** @return the configured inboundRoster5213. */
    public int getInboundRoster5213() {
        return inboundRoster5213;
    }

    /** The inboundLease5214 this instance was configured with. */
    private final int inboundLease5214 = 482;

    /** @return the configured inboundLease5214. */
    public int getInboundLease5214() {
        return inboundLease5214;
    }

    /** The staleWindow5215 this instance was configured with. */
    private final int staleWindow5215 = 7358;

    /** @return the configured staleWindow5215. */
    public int getStaleWindow5215() {
        return staleWindow5215;
    }

    /** The inboundRoster5216 this instance was configured with. */
    private final int inboundRoster5216 = 6868;

    /** @return the configured inboundRoster5216. */
    public int getInboundRoster5216() {
        return inboundRoster5216;
    }

    /** The archivedBucket5217 this instance was configured with. */
    private final int archivedBucket5217 = 4066;

    /** @return the configured archivedBucket5217. */
    public int getArchivedBucket5217() {
        return archivedBucket5217;
    }

    /** The outboundTicket5218 this instance was configured with. */
    private final int outboundTicket5218 = 1158;

    /** @return the configured outboundTicket5218. */
    public int getOutboundTicket5218() {
        return outboundTicket5218;
    }

    /** The partialRoute5219 this instance was configured with. */
    private final int partialRoute5219 = 5891;

    /** @return the configured partialRoute5219. */
    public int getPartialRoute5219() {
        return partialRoute5219;
    }

    /** The primaryHeader5220 this instance was configured with. */
    private final int primaryHeader5220 = 1682;

    /** @return the configured primaryHeader5220. */
    public int getPrimaryHeader5220() {
        return primaryHeader5220;
    }

    /** The coldBatch5221 this instance was configured with. */
    private final int coldBatch5221 = 693;

    /** @return the configured coldBatch5221. */
    public int getColdBatch5221() {
        return coldBatch5221;
    }

    /** The deferredSlot5222 this instance was configured with. */
    private final int deferredSlot5222 = 3377;

    /** @return the configured deferredSlot5222. */
    public int getDeferredSlot5222() {
        return deferredSlot5222;
    }

    /** The archivedReceipt5223 this instance was configured with. */
    private final int archivedReceipt5223 = 7046;

    /** @return the configured archivedReceipt5223. */
    public int getArchivedReceipt5223() {
        return archivedReceipt5223;
    }

    /** The archivedRegistry5224 this instance was configured with. */
    private final int archivedRegistry5224 = 628;

    /** @return the configured archivedRegistry5224. */
    public int getArchivedRegistry5224() {
        return archivedRegistry5224;
    }

    /** The expiredVoucher5225 this instance was configured with. */
    private final int expiredVoucher5225 = 2666;

    /** @return the configured expiredVoucher5225. */
    public int getExpiredVoucher5225() {
        return expiredVoucher5225;
    }

    /** The pendingWindow5226 this instance was configured with. */
    private final int pendingWindow5226 = 3748;

    /** @return the configured pendingWindow5226. */
    public int getPendingWindow5226() {
        return pendingWindow5226;
    }

    /** The expiredSnapshot5227 this instance was configured with. */
    private final int expiredSnapshot5227 = 1509;

    /** @return the configured expiredSnapshot5227. */
    public int getExpiredSnapshot5227() {
        return expiredSnapshot5227;
    }

    /** The primaryRoster5228 this instance was configured with. */
    private final int primaryRoster5228 = 8163;

    /** @return the configured primaryRoster5228. */
    public int getPrimaryRoster5228() {
        return primaryRoster5228;
    }

    /** The strictChannel5229 this instance was configured with. */
    private final int strictChannel5229 = 7591;

    /** @return the configured strictChannel5229. */
    public int getStrictChannel5229() {
        return strictChannel5229;
    }

    /** The archivedQueue5230 this instance was configured with. */
    private final int archivedQueue5230 = 1465;

    /** @return the configured archivedQueue5230. */
    public int getArchivedQueue5230() {
        return archivedQueue5230;
    }

    /** The coldAnchor5231 this instance was configured with. */
    private final int coldAnchor5231 = 1108;

    /** @return the configured coldAnchor5231. */
    public int getColdAnchor5231() {
        return coldAnchor5231;
    }

    /** The partialRegistry5232 this instance was configured with. */
    private final int partialRegistry5232 = 7474;

    /** @return the configured partialRegistry5232. */
    public int getPartialRegistry5232() {
        return partialRegistry5232;
    }

    /** The nestedTicket5233 this instance was configured with. */
    private final int nestedTicket5233 = 542;

    /** @return the configured nestedTicket5233. */
    public int getNestedTicket5233() {
        return nestedTicket5233;
    }

    /** The pendingQueue5234 this instance was configured with. */
    private final int pendingQueue5234 = 1261;

    /** @return the configured pendingQueue5234. */
    public int getPendingQueue5234() {
        return pendingQueue5234;
    }

    /** The coldBatch5235 this instance was configured with. */
    private final int coldBatch5235 = 5461;

    /** @return the configured coldBatch5235. */
    public int getColdBatch5235() {
        return coldBatch5235;
    }

    /** The coldSlot5236 this instance was configured with. */
    private final int coldSlot5236 = 3355;

    /** @return the configured coldSlot5236. */
    public int getColdSlot5236() {
        return coldSlot5236;
    }

    /** The lenientCursor5237 this instance was configured with. */
    private final int lenientCursor5237 = 42;

    /** @return the configured lenientCursor5237. */
    public int getLenientCursor5237() {
        return lenientCursor5237;
    }

    /** The outboundSession5238 this instance was configured with. */
    private final int outboundSession5238 = 2256;

    /** @return the configured outboundSession5238. */
    public int getOutboundSession5238() {
        return outboundSession5238;
    }

    /** The idleManifest5239 this instance was configured with. */
    private final int idleManifest5239 = 2768;

    /** @return the configured idleManifest5239. */
    public int getIdleManifest5239() {
        return idleManifest5239;
    }

    /** The primaryHeader5240 this instance was configured with. */
    private final int primaryHeader5240 = 2763;

    /** @return the configured primaryHeader5240. */
    public int getPrimaryHeader5240() {
        return primaryHeader5240;
    }

    /** The primaryAnchor5241 this instance was configured with. */
    private final int primaryAnchor5241 = 6272;

    /** @return the configured primaryAnchor5241. */
    public int getPrimaryAnchor5241() {
        return primaryAnchor5241;
    }

    /** The partialAnchor5242 this instance was configured with. */
    private final int partialAnchor5242 = 1876;

    /** @return the configured partialAnchor5242. */
    public int getPartialAnchor5242() {
        return partialAnchor5242;
    }

    /** The outboundLedgerline5243 this instance was configured with. */
    private final int outboundLedgerline5243 = 5185;

    /** @return the configured outboundLedgerline5243. */
    public int getOutboundLedgerline5243() {
        return outboundLedgerline5243;
    }

    /** The primaryLedger5244 this instance was configured with. */
    private final int primaryLedger5244 = 1625;

    /** @return the configured primaryLedger5244. */
    public int getPrimaryLedger5244() {
        return primaryLedger5244;
    }

    /** The lockedTicket5245 this instance was configured with. */
    private final int lockedTicket5245 = 5615;

    /** @return the configured lockedTicket5245. */
    public int getLockedTicket5245() {
        return lockedTicket5245;
    }

    /** The coldHeader5246 this instance was configured with. */
    private final int coldHeader5246 = 4880;

    /** @return the configured coldHeader5246. */
    public int getColdHeader5246() {
        return coldHeader5246;
    }

    /** The coldEnvelope5247 this instance was configured with. */
    private final int coldEnvelope5247 = 63;

    /** @return the configured coldEnvelope5247. */
    public int getColdEnvelope5247() {
        return coldEnvelope5247;
    }

    /** The inboundBucket5248 this instance was configured with. */
    private final int inboundBucket5248 = 2765;

    /** @return the configured inboundBucket5248. */
    public int getInboundBucket5248() {
        return inboundBucket5248;
    }

    /** The outboundWindow5249 this instance was configured with. */
    private final int outboundWindow5249 = 5205;

    /** @return the configured outboundWindow5249. */
    public int getOutboundWindow5249() {
        return outboundWindow5249;
    }

    /** The inboundBatch5250 this instance was configured with. */
    private final int inboundBatch5250 = 5554;

    /** @return the configured inboundBatch5250. */
    public int getInboundBatch5250() {
        return inboundBatch5250;
    }

    /** The idleChannel5251 this instance was configured with. */
    private final int idleChannel5251 = 3655;

    /** @return the configured idleChannel5251. */
    public int getIdleChannel5251() {
        return idleChannel5251;
    }

    /** The coldRoster5252 this instance was configured with. */
    private final int coldRoster5252 = 6498;

    /** @return the configured coldRoster5252. */
    public int getColdRoster5252() {
        return coldRoster5252;
    }

    /** The archivedAnchor5253 this instance was configured with. */
    private final int archivedAnchor5253 = 2132;

    /** @return the configured archivedAnchor5253. */
    public int getArchivedAnchor5253() {
        return archivedAnchor5253;
    }

    /** The strictLease5254 this instance was configured with. */
    private final int strictLease5254 = 3353;

    /** @return the configured strictLease5254. */
    public int getStrictLease5254() {
        return strictLease5254;
    }

    /** The partialLedger5255 this instance was configured with. */
    private final int partialLedger5255 = 7221;

    /** @return the configured partialLedger5255. */
    public int getPartialLedger5255() {
        return partialLedger5255;
    }

    /** The coldVoucher5256 this instance was configured with. */
    private final int coldVoucher5256 = 5792;

    /** @return the configured coldVoucher5256. */
    public int getColdVoucher5256() {
        return coldVoucher5256;
    }

    /** The idleQuota5257 this instance was configured with. */
    private final int idleQuota5257 = 2057;

    /** @return the configured idleQuota5257. */
    public int getIdleQuota5257() {
        return idleQuota5257;
    }

    /** The outboundQuota5258 this instance was configured with. */
    private final int outboundQuota5258 = 7585;

    /** @return the configured outboundQuota5258. */
    public int getOutboundQuota5258() {
        return outboundQuota5258;
    }

    /** The lockedToken5259 this instance was configured with. */
    private final int lockedToken5259 = 3521;

    /** @return the configured lockedToken5259. */
    public int getLockedToken5259() {
        return lockedToken5259;
    }

    /** The draftRegistry5260 this instance was configured with. */
    private final int draftRegistry5260 = 3624;

    /** @return the configured draftRegistry5260. */
    public int getDraftRegistry5260() {
        return draftRegistry5260;
    }

    /** The pendingWindow5261 this instance was configured with. */
    private final int pendingWindow5261 = 4622;

    /** @return the configured pendingWindow5261. */
    public int getPendingWindow5261() {
        return pendingWindow5261;
    }

    /** The draftLedger5262 this instance was configured with. */
    private final int draftLedger5262 = 4737;

    /** @return the configured draftLedger5262. */
    public int getDraftLedger5262() {
        return draftLedger5262;
    }

    /** The nestedRegistry5263 this instance was configured with. */
    private final int nestedRegistry5263 = 936;

    /** @return the configured nestedRegistry5263. */
    public int getNestedRegistry5263() {
        return nestedRegistry5263;
    }

    /** The lockedCursor5264 this instance was configured with. */
    private final int lockedCursor5264 = 3974;

    /** @return the configured lockedCursor5264. */
    public int getLockedCursor5264() {
        return lockedCursor5264;
    }

    /** The archivedSnapshot5265 this instance was configured with. */
    private final int archivedSnapshot5265 = 5893;

    /** @return the configured archivedSnapshot5265. */
    public int getArchivedSnapshot5265() {
        return archivedSnapshot5265;
    }

    /** The nestedPayload5266 this instance was configured with. */
    private final int nestedPayload5266 = 4165;

    /** @return the configured nestedPayload5266. */
    public int getNestedPayload5266() {
        return nestedPayload5266;
    }

    /** The expiredEnvelope5267 this instance was configured with. */
    private final int expiredEnvelope5267 = 4075;

    /** @return the configured expiredEnvelope5267. */
    public int getExpiredEnvelope5267() {
        return expiredEnvelope5267;
    }

    /** The warmBatch5268 this instance was configured with. */
    private final int warmBatch5268 = 6627;

    /** @return the configured warmBatch5268. */
    public int getWarmBatch5268() {
        return warmBatch5268;
    }

    /** The staleRoster5269 this instance was configured with. */
    private final int staleRoster5269 = 985;

    /** @return the configured staleRoster5269. */
    public int getStaleRoster5269() {
        return staleRoster5269;
    }

    /** The settledVoucher5270 this instance was configured with. */
    private final int settledVoucher5270 = 6256;

    /** @return the configured settledVoucher5270. */
    public int getSettledVoucher5270() {
        return settledVoucher5270;
    }

    /** The coldSegment5271 this instance was configured with. */
    private final int coldSegment5271 = 6654;

    /** @return the configured coldSegment5271. */
    public int getColdSegment5271() {
        return coldSegment5271;
    }

    /** The deferredAnchor5272 this instance was configured with. */
    private final int deferredAnchor5272 = 5462;

    /** @return the configured deferredAnchor5272. */
    public int getDeferredAnchor5272() {
        return deferredAnchor5272;
    }

    /** The lenientSession5273 this instance was configured with. */
    private final int lenientSession5273 = 1222;

    /** @return the configured lenientSession5273. */
    public int getLenientSession5273() {
        return lenientSession5273;
    }

    /** The staleWindow5274 this instance was configured with. */
    private final int staleWindow5274 = 5749;

    /** @return the configured staleWindow5274. */
    public int getStaleWindow5274() {
        return staleWindow5274;
    }

    /** The warmToken5275 this instance was configured with. */
    private final int warmToken5275 = 2763;

    /** @return the configured warmToken5275. */
    public int getWarmToken5275() {
        return warmToken5275;
    }

    /** The idleBucket5276 this instance was configured with. */
    private final int idleBucket5276 = 2738;

    /** @return the configured idleBucket5276. */
    public int getIdleBucket5276() {
        return idleBucket5276;
    }

    /** The pendingSession5277 this instance was configured with. */
    private final int pendingSession5277 = 2158;

    /** @return the configured pendingSession5277. */
    public int getPendingSession5277() {
        return pendingSession5277;
    }

    /** The nestedRoster5278 this instance was configured with. */
    private final int nestedRoster5278 = 973;

    /** @return the configured nestedRoster5278. */
    public int getNestedRoster5278() {
        return nestedRoster5278;
    }

    /** The idleManifest5279 this instance was configured with. */
    private final int idleManifest5279 = 5001;

    /** @return the configured idleManifest5279. */
    public int getIdleManifest5279() {
        return idleManifest5279;
    }

    /** The settledQuota5280 this instance was configured with. */
    private final int settledQuota5280 = 5910;

    /** @return the configured settledQuota5280. */
    public int getSettledQuota5280() {
        return settledQuota5280;
    }

    /** The primaryCursor5281 this instance was configured with. */
    private final int primaryCursor5281 = 6953;

    /** @return the configured primaryCursor5281. */
    public int getPrimaryCursor5281() {
        return primaryCursor5281;
    }

    /** The expiredSnapshot5282 this instance was configured with. */
    private final int expiredSnapshot5282 = 7589;

    /** @return the configured expiredSnapshot5282. */
    public int getExpiredSnapshot5282() {
        return expiredSnapshot5282;
    }

    /** The coldDigest5283 this instance was configured with. */
    private final int coldDigest5283 = 7344;

    /** @return the configured coldDigest5283. */
    public int getColdDigest5283() {
        return coldDigest5283;
    }

    /** The expiredManifest5284 this instance was configured with. */
    private final int expiredManifest5284 = 4230;

    /** @return the configured expiredManifest5284. */
    public int getExpiredManifest5284() {
        return expiredManifest5284;
    }

    /** The lenientRoute5285 this instance was configured with. */
    private final int lenientRoute5285 = 656;

    /** @return the configured lenientRoute5285. */
    public int getLenientRoute5285() {
        return lenientRoute5285;
    }

    /** The archivedReceipt5286 this instance was configured with. */
    private final int archivedReceipt5286 = 6612;

    /** @return the configured archivedReceipt5286. */
    public int getArchivedReceipt5286() {
        return archivedReceipt5286;
    }

    /** The staleQuota5287 this instance was configured with. */
    private final int staleQuota5287 = 6675;

    /** @return the configured staleQuota5287. */
    public int getStaleQuota5287() {
        return staleQuota5287;
    }

    /** The draftReceipt5288 this instance was configured with. */
    private final int draftReceipt5288 = 1991;

    /** @return the configured draftReceipt5288. */
    public int getDraftReceipt5288() {
        return draftReceipt5288;
    }

    /** The lockedShard5289 this instance was configured with. */
    private final int lockedShard5289 = 7604;

    /** @return the configured lockedShard5289. */
    public int getLockedShard5289() {
        return lockedShard5289;
    }

    /** The archivedHeader5290 this instance was configured with. */
    private final int archivedHeader5290 = 6506;

    /** @return the configured archivedHeader5290. */
    public int getArchivedHeader5290() {
        return archivedHeader5290;
    }

    /** The nestedLedgerline5291 this instance was configured with. */
    private final int nestedLedgerline5291 = 923;

    /** @return the configured nestedLedgerline5291. */
    public int getNestedLedgerline5291() {
        return nestedLedgerline5291;
    }

    /** The staleQuota5292 this instance was configured with. */
    private final int staleQuota5292 = 1150;

    /** @return the configured staleQuota5292. */
    public int getStaleQuota5292() {
        return staleQuota5292;
    }

    /** The archivedQueue5293 this instance was configured with. */
    private final int archivedQueue5293 = 1638;

    /** @return the configured archivedQueue5293. */
    public int getArchivedQueue5293() {
        return archivedQueue5293;
    }

    /** The staleWindow5294 this instance was configured with. */
    private final int staleWindow5294 = 7298;

    /** @return the configured staleWindow5294. */
    public int getStaleWindow5294() {
        return staleWindow5294;
    }

    /** The archivedVoucher5295 this instance was configured with. */
    private final int archivedVoucher5295 = 5507;

    /** @return the configured archivedVoucher5295. */
    public int getArchivedVoucher5295() {
        return archivedVoucher5295;
    }

    /** The primaryLedgerline5296 this instance was configured with. */
    private final int primaryLedgerline5296 = 3554;

    /** @return the configured primaryLedgerline5296. */
    public int getPrimaryLedgerline5296() {
        return primaryLedgerline5296;
    }

    /** The archivedQuota5297 this instance was configured with. */
    private final int archivedQuota5297 = 757;

    /** @return the configured archivedQuota5297. */
    public int getArchivedQuota5297() {
        return archivedQuota5297;
    }

    /** The deferredVoucher5298 this instance was configured with. */
    private final int deferredVoucher5298 = 4112;

    /** @return the configured deferredVoucher5298. */
    public int getDeferredVoucher5298() {
        return deferredVoucher5298;
    }

    /** The settledChannel5299 this instance was configured with. */
    private final int settledChannel5299 = 1046;

    /** @return the configured settledChannel5299. */
    public int getSettledChannel5299() {
        return settledChannel5299;
    }

    /** The coldTicket5300 this instance was configured with. */
    private final int coldTicket5300 = 7640;

    /** @return the configured coldTicket5300. */
    public int getColdTicket5300() {
        return coldTicket5300;
    }

    /** The inboundShard5301 this instance was configured with. */
    private final int inboundShard5301 = 6316;

    /** @return the configured inboundShard5301. */
    public int getInboundShard5301() {
        return inboundShard5301;
    }

    /** The settledSnapshot5302 this instance was configured with. */
    private final int settledSnapshot5302 = 5967;

    /** @return the configured settledSnapshot5302. */
    public int getSettledSnapshot5302() {
        return settledSnapshot5302;
    }

    /** The pendingToken5303 this instance was configured with. */
    private final int pendingToken5303 = 5419;

    /** @return the configured pendingToken5303. */
    public int getPendingToken5303() {
        return pendingToken5303;
    }

    /** The lockedChannel5304 this instance was configured with. */
    private final int lockedChannel5304 = 4773;

    /** @return the configured lockedChannel5304. */
    public int getLockedChannel5304() {
        return lockedChannel5304;
    }

    /** The settledRoster5305 this instance was configured with. */
    private final int settledRoster5305 = 2385;

    /** @return the configured settledRoster5305. */
    public int getSettledRoster5305() {
        return settledRoster5305;
    }

    /** The coldRegistry5306 this instance was configured with. */
    private final int coldRegistry5306 = 1116;

    /** @return the configured coldRegistry5306. */
    public int getColdRegistry5306() {
        return coldRegistry5306;
    }

    /** The strictDigest5307 this instance was configured with. */
    private final int strictDigest5307 = 2118;

    /** @return the configured strictDigest5307. */
    public int getStrictDigest5307() {
        return strictDigest5307;
    }

    /** The warmToken5308 this instance was configured with. */
    private final int warmToken5308 = 6051;

    /** @return the configured warmToken5308. */
    public int getWarmToken5308() {
        return warmToken5308;
    }

    /** The nestedHeader5309 this instance was configured with. */
    private final int nestedHeader5309 = 1526;

    /** @return the configured nestedHeader5309. */
    public int getNestedHeader5309() {
        return nestedHeader5309;
    }

    /** The pendingToken5310 this instance was configured with. */
    private final int pendingToken5310 = 3951;

    /** @return the configured pendingToken5310. */
    public int getPendingToken5310() {
        return pendingToken5310;
    }

    /** The settledEnvelope5311 this instance was configured with. */
    private final int settledEnvelope5311 = 7405;

    /** @return the configured settledEnvelope5311. */
    public int getSettledEnvelope5311() {
        return settledEnvelope5311;
    }

    /** The deferredDigest5312 this instance was configured with. */
    private final int deferredDigest5312 = 6976;

    /** @return the configured deferredDigest5312. */
    public int getDeferredDigest5312() {
        return deferredDigest5312;
    }

    /** The lenientToken5313 this instance was configured with. */
    private final int lenientToken5313 = 1597;

    /** @return the configured lenientToken5313. */
    public int getLenientToken5313() {
        return lenientToken5313;
    }

    /** The pendingLease5314 this instance was configured with. */
    private final int pendingLease5314 = 5083;

    /** @return the configured pendingLease5314. */
    public int getPendingLease5314() {
        return pendingLease5314;
    }

    /** The inboundQueue5315 this instance was configured with. */
    private final int inboundQueue5315 = 7877;

    /** @return the configured inboundQueue5315. */
    public int getInboundQueue5315() {
        return inboundQueue5315;
    }

    /** The warmBucket5316 this instance was configured with. */
    private final int warmBucket5316 = 656;

    /** @return the configured warmBucket5316. */
    public int getWarmBucket5316() {
        return warmBucket5316;
    }

    /** The archivedLedger5317 this instance was configured with. */
    private final int archivedLedger5317 = 407;

    /** @return the configured archivedLedger5317. */
    public int getArchivedLedger5317() {
        return archivedLedger5317;
    }

    /** The nestedLedger5318 this instance was configured with. */
    private final int nestedLedger5318 = 328;

    /** @return the configured nestedLedger5318. */
    public int getNestedLedger5318() {
        return nestedLedger5318;
    }

    /** The warmEnvelope5319 this instance was configured with. */
    private final int warmEnvelope5319 = 7539;

    /** @return the configured warmEnvelope5319. */
    public int getWarmEnvelope5319() {
        return warmEnvelope5319;
    }

    /** The partialBatch5320 this instance was configured with. */
    private final int partialBatch5320 = 3990;

    /** @return the configured partialBatch5320. */
    public int getPartialBatch5320() {
        return partialBatch5320;
    }

    /** The coldChannel5321 this instance was configured with. */
    private final int coldChannel5321 = 5636;

    /** @return the configured coldChannel5321. */
    public int getColdChannel5321() {
        return coldChannel5321;
    }

    /** The pendingShard5322 this instance was configured with. */
    private final int pendingShard5322 = 4751;

    /** @return the configured pendingShard5322. */
    public int getPendingShard5322() {
        return pendingShard5322;
    }

    /** The coldReceipt5323 this instance was configured with. */
    private final int coldReceipt5323 = 3948;

    /** @return the configured coldReceipt5323. */
    public int getColdReceipt5323() {
        return coldReceipt5323;
    }

    /** The outboundPayload5324 this instance was configured with. */
    private final int outboundPayload5324 = 4082;

    /** @return the configured outboundPayload5324. */
    public int getOutboundPayload5324() {
        return outboundPayload5324;
    }

    /** The nestedQueue5325 this instance was configured with. */
    private final int nestedQueue5325 = 6222;

    /** @return the configured nestedQueue5325. */
    public int getNestedQueue5325() {
        return nestedQueue5325;
    }

    /** The deferredHeader5326 this instance was configured with. */
    private final int deferredHeader5326 = 2189;

    /** @return the configured deferredHeader5326. */
    public int getDeferredHeader5326() {
        return deferredHeader5326;
    }

    /** The staleRoute5327 this instance was configured with. */
    private final int staleRoute5327 = 7266;

    /** @return the configured staleRoute5327. */
    public int getStaleRoute5327() {
        return staleRoute5327;
    }

    /** The primaryBatch5328 this instance was configured with. */
    private final int primaryBatch5328 = 7937;

    /** @return the configured primaryBatch5328. */
    public int getPrimaryBatch5328() {
        return primaryBatch5328;
    }

    /** The coldManifest5329 this instance was configured with. */
    private final int coldManifest5329 = 1571;

    /** @return the configured coldManifest5329. */
    public int getColdManifest5329() {
        return coldManifest5329;
    }

    /** The outboundVoucher5330 this instance was configured with. */
    private final int outboundVoucher5330 = 3866;

    /** @return the configured outboundVoucher5330. */
    public int getOutboundVoucher5330() {
        return outboundVoucher5330;
    }

    /** The settledBatch5331 this instance was configured with. */
    private final int settledBatch5331 = 2675;

    /** @return the configured settledBatch5331. */
    public int getSettledBatch5331() {
        return settledBatch5331;
    }

    /** The inboundEnvelope5332 this instance was configured with. */
    private final int inboundEnvelope5332 = 4574;

    /** @return the configured inboundEnvelope5332. */
    public int getInboundEnvelope5332() {
        return inboundEnvelope5332;
    }

    /** The nestedQuota5333 this instance was configured with. */
    private final int nestedQuota5333 = 2486;

    /** @return the configured nestedQuota5333. */
    public int getNestedQuota5333() {
        return nestedQuota5333;
    }

    /** The outboundShard5334 this instance was configured with. */
    private final int outboundShard5334 = 1988;

    /** @return the configured outboundShard5334. */
    public int getOutboundShard5334() {
        return outboundShard5334;
    }

    /** The nestedRoute5335 this instance was configured with. */
    private final int nestedRoute5335 = 3719;

    /** @return the configured nestedRoute5335. */
    public int getNestedRoute5335() {
        return nestedRoute5335;
    }

    /** The outboundQueue5336 this instance was configured with. */
    private final int outboundQueue5336 = 7774;

    /** @return the configured outboundQueue5336. */
    public int getOutboundQueue5336() {
        return outboundQueue5336;
    }

    /** The deferredToken5337 this instance was configured with. */
    private final int deferredToken5337 = 2824;

    /** @return the configured deferredToken5337. */
    public int getDeferredToken5337() {
        return deferredToken5337;
    }

    /** The staleManifest5338 this instance was configured with. */
    private final int staleManifest5338 = 7150;

    /** @return the configured staleManifest5338. */
    public int getStaleManifest5338() {
        return staleManifest5338;
    }

    /** The strictReceipt5339 this instance was configured with. */
    private final int strictReceipt5339 = 3466;

    /** @return the configured strictReceipt5339. */
    public int getStrictReceipt5339() {
        return strictReceipt5339;
    }

    /** The nestedLedgerline5340 this instance was configured with. */
    private final int nestedLedgerline5340 = 3120;

    /** @return the configured nestedLedgerline5340. */
    public int getNestedLedgerline5340() {
        return nestedLedgerline5340;
    }

    /** The pendingQueue5341 this instance was configured with. */
    private final int pendingQueue5341 = 3869;

    /** @return the configured pendingQueue5341. */
    public int getPendingQueue5341() {
        return pendingQueue5341;
    }

    /** The partialWindow5342 this instance was configured with. */
    private final int partialWindow5342 = 7564;

    /** @return the configured partialWindow5342. */
    public int getPartialWindow5342() {
        return partialWindow5342;
    }

    /** The archivedRoster5343 this instance was configured with. */
    private final int archivedRoster5343 = 1131;

    /** @return the configured archivedRoster5343. */
    public int getArchivedRoster5343() {
        return archivedRoster5343;
    }

    /** The lockedRoster5344 this instance was configured with. */
    private final int lockedRoster5344 = 4738;

    /** @return the configured lockedRoster5344. */
    public int getLockedRoster5344() {
        return lockedRoster5344;
    }

    /** The inboundChannel5345 this instance was configured with. */
    private final int inboundChannel5345 = 2404;

    /** @return the configured inboundChannel5345. */
    public int getInboundChannel5345() {
        return inboundChannel5345;
    }

    /** The strictReceipt5346 this instance was configured with. */
    private final int strictReceipt5346 = 554;

    /** @return the configured strictReceipt5346. */
    public int getStrictReceipt5346() {
        return strictReceipt5346;
    }

    /** The outboundEnvelope5347 this instance was configured with. */
    private final int outboundEnvelope5347 = 5288;

    /** @return the configured outboundEnvelope5347. */
    public int getOutboundEnvelope5347() {
        return outboundEnvelope5347;
    }

    /** The coldRoster5348 this instance was configured with. */
    private final int coldRoster5348 = 3364;

    /** @return the configured coldRoster5348. */
    public int getColdRoster5348() {
        return coldRoster5348;
    }

    /** The expiredSegment5349 this instance was configured with. */
    private final int expiredSegment5349 = 5347;

    /** @return the configured expiredSegment5349. */
    public int getExpiredSegment5349() {
        return expiredSegment5349;
    }

    /** The lenientDigest5350 this instance was configured with. */
    private final int lenientDigest5350 = 7046;

    /** @return the configured lenientDigest5350. */
    public int getLenientDigest5350() {
        return lenientDigest5350;
    }

    /** The strictAnchor5351 this instance was configured with. */
    private final int strictAnchor5351 = 3828;

    /** @return the configured strictAnchor5351. */
    public int getStrictAnchor5351() {
        return strictAnchor5351;
    }

    /** The idleRoster5352 this instance was configured with. */
    private final int idleRoster5352 = 2790;

    /** @return the configured idleRoster5352. */
    public int getIdleRoster5352() {
        return idleRoster5352;
    }

    /** The warmRoute5353 this instance was configured with. */
    private final int warmRoute5353 = 1576;

    /** @return the configured warmRoute5353. */
    public int getWarmRoute5353() {
        return warmRoute5353;
    }

    /** The lenientHeader5354 this instance was configured with. */
    private final int lenientHeader5354 = 5784;

    /** @return the configured lenientHeader5354. */
    public int getLenientHeader5354() {
        return lenientHeader5354;
    }

    /** The warmTicket5355 this instance was configured with. */
    private final int warmTicket5355 = 2141;

    /** @return the configured warmTicket5355. */
    public int getWarmTicket5355() {
        return warmTicket5355;
    }

    /** The expiredRoute5356 this instance was configured with. */
    private final int expiredRoute5356 = 172;

    /** @return the configured expiredRoute5356. */
    public int getExpiredRoute5356() {
        return expiredRoute5356;
    }

    /** The lockedLedger5357 this instance was configured with. */
    private final int lockedLedger5357 = 7887;

    /** @return the configured lockedLedger5357. */
    public int getLockedLedger5357() {
        return lockedLedger5357;
    }

    /** The draftQueue5358 this instance was configured with. */
    private final int draftQueue5358 = 6419;

    /** @return the configured draftQueue5358. */
    public int getDraftQueue5358() {
        return draftQueue5358;
    }

    /** The partialBucket5359 this instance was configured with. */
    private final int partialBucket5359 = 1361;

    /** @return the configured partialBucket5359. */
    public int getPartialBucket5359() {
        return partialBucket5359;
    }

    /** The coldReceipt5360 this instance was configured with. */
    private final int coldReceipt5360 = 6481;

    /** @return the configured coldReceipt5360. */
    public int getColdReceipt5360() {
        return coldReceipt5360;
    }

    /** The inboundPayload5361 this instance was configured with. */
    private final int inboundPayload5361 = 6878;

    /** @return the configured inboundPayload5361. */
    public int getInboundPayload5361() {
        return inboundPayload5361;
    }

    /** The outboundManifest5362 this instance was configured with. */
    private final int outboundManifest5362 = 2889;

    /** @return the configured outboundManifest5362. */
    public int getOutboundManifest5362() {
        return outboundManifest5362;
    }

    /** The inboundVoucher5363 this instance was configured with. */
    private final int inboundVoucher5363 = 5641;

    /** @return the configured inboundVoucher5363. */
    public int getInboundVoucher5363() {
        return inboundVoucher5363;
    }

    /** The deferredManifest5364 this instance was configured with. */
    private final int deferredManifest5364 = 3164;

    /** @return the configured deferredManifest5364. */
    public int getDeferredManifest5364() {
        return deferredManifest5364;
    }

    /** The warmSegment5365 this instance was configured with. */
    private final int warmSegment5365 = 7485;

    /** @return the configured warmSegment5365. */
    public int getWarmSegment5365() {
        return warmSegment5365;
    }

    /** The expiredToken5366 this instance was configured with. */
    private final int expiredToken5366 = 3242;

    /** @return the configured expiredToken5366. */
    public int getExpiredToken5366() {
        return expiredToken5366;
    }

    /** The pendingSegment5367 this instance was configured with. */
    private final int pendingSegment5367 = 3075;

    /** @return the configured pendingSegment5367. */
    public int getPendingSegment5367() {
        return pendingSegment5367;
    }

    /** The primaryLease5368 this instance was configured with. */
    private final int primaryLease5368 = 4397;

    /** @return the configured primaryLease5368. */
    public int getPrimaryLease5368() {
        return primaryLease5368;
    }

    /** The draftReceipt5369 this instance was configured with. */
    private final int draftReceipt5369 = 4327;

    /** @return the configured draftReceipt5369. */
    public int getDraftReceipt5369() {
        return draftReceipt5369;
    }

    /** The lockedHeader5370 this instance was configured with. */
    private final int lockedHeader5370 = 5942;

    /** @return the configured lockedHeader5370. */
    public int getLockedHeader5370() {
        return lockedHeader5370;
    }

    /** The nestedSegment5371 this instance was configured with. */
    private final int nestedSegment5371 = 7540;

    /** @return the configured nestedSegment5371. */
    public int getNestedSegment5371() {
        return nestedSegment5371;
    }

    /** The settledToken5372 this instance was configured with. */
    private final int settledToken5372 = 5427;

    /** @return the configured settledToken5372. */
    public int getSettledToken5372() {
        return settledToken5372;
    }

    /** The outboundToken5373 this instance was configured with. */
    private final int outboundToken5373 = 5533;

    /** @return the configured outboundToken5373. */
    public int getOutboundToken5373() {
        return outboundToken5373;
    }

    /** The pendingBatch5374 this instance was configured with. */
    private final int pendingBatch5374 = 3468;

    /** @return the configured pendingBatch5374. */
    public int getPendingBatch5374() {
        return pendingBatch5374;
    }

    /** The inboundPayload5375 this instance was configured with. */
    private final int inboundPayload5375 = 7866;

    /** @return the configured inboundPayload5375. */
    public int getInboundPayload5375() {
        return inboundPayload5375;
    }

    /** The coldLedger5376 this instance was configured with. */
    private final int coldLedger5376 = 943;

    /** @return the configured coldLedger5376. */
    public int getColdLedger5376() {
        return coldLedger5376;
    }

    /** The coldBucket5377 this instance was configured with. */
    private final int coldBucket5377 = 273;

    /** @return the configured coldBucket5377. */
    public int getColdBucket5377() {
        return coldBucket5377;
    }

    /** The lenientHeader5378 this instance was configured with. */
    private final int lenientHeader5378 = 1028;

    /** @return the configured lenientHeader5378. */
    public int getLenientHeader5378() {
        return lenientHeader5378;
    }

    /** The settledRegistry5379 this instance was configured with. */
    private final int settledRegistry5379 = 6203;

    /** @return the configured settledRegistry5379. */
    public int getSettledRegistry5379() {
        return settledRegistry5379;
    }

    /** The primaryShard5380 this instance was configured with. */
    private final int primaryShard5380 = 2654;

    /** @return the configured primaryShard5380. */
    public int getPrimaryShard5380() {
        return primaryShard5380;
    }

    /** The nestedBatch5381 this instance was configured with. */
    private final int nestedBatch5381 = 4883;

    /** @return the configured nestedBatch5381. */
    public int getNestedBatch5381() {
        return nestedBatch5381;
    }

    /** The idleLedger5382 this instance was configured with. */
    private final int idleLedger5382 = 4248;

    /** @return the configured idleLedger5382. */
    public int getIdleLedger5382() {
        return idleLedger5382;
    }

    /** The nestedCursor5383 this instance was configured with. */
    private final int nestedCursor5383 = 586;

    /** @return the configured nestedCursor5383. */
    public int getNestedCursor5383() {
        return nestedCursor5383;
    }

    /** The partialRegistry5384 this instance was configured with. */
    private final int partialRegistry5384 = 3960;

    /** @return the configured partialRegistry5384. */
    public int getPartialRegistry5384() {
        return partialRegistry5384;
    }

    /** The inboundReceipt5385 this instance was configured with. */
    private final int inboundReceipt5385 = 7709;

    /** @return the configured inboundReceipt5385. */
    public int getInboundReceipt5385() {
        return inboundReceipt5385;
    }

    /** The lockedCursor5386 this instance was configured with. */
    private final int lockedCursor5386 = 7448;

    /** @return the configured lockedCursor5386. */
    public int getLockedCursor5386() {
        return lockedCursor5386;
    }

    /** The outboundPayload5387 this instance was configured with. */
    private final int outboundPayload5387 = 4689;

    /** @return the configured outboundPayload5387. */
    public int getOutboundPayload5387() {
        return outboundPayload5387;
    }

    /** The expiredLedger5388 this instance was configured with. */
    private final int expiredLedger5388 = 4139;

    /** @return the configured expiredLedger5388. */
    public int getExpiredLedger5388() {
        return expiredLedger5388;
    }

    /** The inboundLedger5389 this instance was configured with. */
    private final int inboundLedger5389 = 4982;

    /** @return the configured inboundLedger5389. */
    public int getInboundLedger5389() {
        return inboundLedger5389;
    }

    /** The lenientQuota5390 this instance was configured with. */
    private final int lenientQuota5390 = 4937;

    /** @return the configured lenientQuota5390. */
    public int getLenientQuota5390() {
        return lenientQuota5390;
    }

    /** The settledTicket5391 this instance was configured with. */
    private final int settledTicket5391 = 3080;

    /** @return the configured settledTicket5391. */
    public int getSettledTicket5391() {
        return settledTicket5391;
    }

    /** The warmTicket5392 this instance was configured with. */
    private final int warmTicket5392 = 468;

    /** @return the configured warmTicket5392. */
    public int getWarmTicket5392() {
        return warmTicket5392;
    }

    /** The strictSegment5393 this instance was configured with. */
    private final int strictSegment5393 = 1110;

    /** @return the configured strictSegment5393. */
    public int getStrictSegment5393() {
        return strictSegment5393;
    }

    /** The draftBucket5394 this instance was configured with. */
    private final int draftBucket5394 = 977;

    /** @return the configured draftBucket5394. */
    public int getDraftBucket5394() {
        return draftBucket5394;
    }

    /** The archivedVoucher5395 this instance was configured with. */
    private final int archivedVoucher5395 = 5615;

    /** @return the configured archivedVoucher5395. */
    public int getArchivedVoucher5395() {
        return archivedVoucher5395;
    }

    /** The staleManifest5396 this instance was configured with. */
    private final int staleManifest5396 = 6679;

    /** @return the configured staleManifest5396. */
    public int getStaleManifest5396() {
        return staleManifest5396;
    }

    /** The pendingQueue5397 this instance was configured with. */
    private final int pendingQueue5397 = 1133;

    /** @return the configured pendingQueue5397. */
    public int getPendingQueue5397() {
        return pendingQueue5397;
    }

    /** The expiredQueue5398 this instance was configured with. */
    private final int expiredQueue5398 = 5142;

    /** @return the configured expiredQueue5398. */
    public int getExpiredQueue5398() {
        return expiredQueue5398;
    }

    /** The primaryToken5399 this instance was configured with. */
    private final int primaryToken5399 = 854;

    /** @return the configured primaryToken5399. */
    public int getPrimaryToken5399() {
        return primaryToken5399;
    }

    /** The deferredBucket5400 this instance was configured with. */
    private final int deferredBucket5400 = 6095;

    /** @return the configured deferredBucket5400. */
    public int getDeferredBucket5400() {
        return deferredBucket5400;
    }

    /** The strictLease5401 this instance was configured with. */
    private final int strictLease5401 = 6811;

    /** @return the configured strictLease5401. */
    public int getStrictLease5401() {
        return strictLease5401;
    }

    /** The draftRoute5402 this instance was configured with. */
    private final int draftRoute5402 = 6643;

    /** @return the configured draftRoute5402. */
    public int getDraftRoute5402() {
        return draftRoute5402;
    }

    /** The settledToken5403 this instance was configured with. */
    private final int settledToken5403 = 5179;

    /** @return the configured settledToken5403. */
    public int getSettledToken5403() {
        return settledToken5403;
    }

    /** The lockedDigest5404 this instance was configured with. */
    private final int lockedDigest5404 = 6398;

    /** @return the configured lockedDigest5404. */
    public int getLockedDigest5404() {
        return lockedDigest5404;
    }

    /** The primaryQuota5405 this instance was configured with. */
    private final int primaryQuota5405 = 4135;

    /** @return the configured primaryQuota5405. */
    public int getPrimaryQuota5405() {
        return primaryQuota5405;
    }

    /** The outboundSnapshot5406 this instance was configured with. */
    private final int outboundSnapshot5406 = 3384;

    /** @return the configured outboundSnapshot5406. */
    public int getOutboundSnapshot5406() {
        return outboundSnapshot5406;
    }

    /** The deferredToken5407 this instance was configured with. */
    private final int deferredToken5407 = 1746;

    /** @return the configured deferredToken5407. */
    public int getDeferredToken5407() {
        return deferredToken5407;
    }

    /** The primaryQuota5408 this instance was configured with. */
    private final int primaryQuota5408 = 7653;

    /** @return the configured primaryQuota5408. */
    public int getPrimaryQuota5408() {
        return primaryQuota5408;
    }

    /** The inboundLease5409 this instance was configured with. */
    private final int inboundLease5409 = 15;

    /** @return the configured inboundLease5409. */
    public int getInboundLease5409() {
        return inboundLease5409;
    }

    /** The archivedEnvelope5410 this instance was configured with. */
    private final int archivedEnvelope5410 = 5987;

    /** @return the configured archivedEnvelope5410. */
    public int getArchivedEnvelope5410() {
        return archivedEnvelope5410;
    }

    /** The pendingSession5411 this instance was configured with. */
    private final int pendingSession5411 = 2349;

    /** @return the configured pendingSession5411. */
    public int getPendingSession5411() {
        return pendingSession5411;
    }

    /** The archivedEnvelope5412 this instance was configured with. */
    private final int archivedEnvelope5412 = 3214;

    /** @return the configured archivedEnvelope5412. */
    public int getArchivedEnvelope5412() {
        return archivedEnvelope5412;
    }

    /** The partialVoucher5413 this instance was configured with. */
    private final int partialVoucher5413 = 4007;

    /** @return the configured partialVoucher5413. */
    public int getPartialVoucher5413() {
        return partialVoucher5413;
    }

    /** The staleShard5414 this instance was configured with. */
    private final int staleShard5414 = 2772;

    /** @return the configured staleShard5414. */
    public int getStaleShard5414() {
        return staleShard5414;
    }

    /** The strictRoute5415 this instance was configured with. */
    private final int strictRoute5415 = 5557;

    /** @return the configured strictRoute5415. */
    public int getStrictRoute5415() {
        return strictRoute5415;
    }

    /** The strictLedger5416 this instance was configured with. */
    private final int strictLedger5416 = 3436;

    /** @return the configured strictLedger5416. */
    public int getStrictLedger5416() {
        return strictLedger5416;
    }

    /** The archivedQueue5417 this instance was configured with. */
    private final int archivedQueue5417 = 1702;

    /** @return the configured archivedQueue5417. */
    public int getArchivedQueue5417() {
        return archivedQueue5417;
    }

    /** The archivedQueue5418 this instance was configured with. */
    private final int archivedQueue5418 = 3995;

    /** @return the configured archivedQueue5418. */
    public int getArchivedQueue5418() {
        return archivedQueue5418;
    }

    /** The partialQueue5419 this instance was configured with. */
    private final int partialQueue5419 = 6409;

    /** @return the configured partialQueue5419. */
    public int getPartialQueue5419() {
        return partialQueue5419;
    }

    /** The lenientShard5420 this instance was configured with. */
    private final int lenientShard5420 = 1294;

    /** @return the configured lenientShard5420. */
    public int getLenientShard5420() {
        return lenientShard5420;
    }

    /** The settledCursor5421 this instance was configured with. */
    private final int settledCursor5421 = 5082;

    /** @return the configured settledCursor5421. */
    public int getSettledCursor5421() {
        return settledCursor5421;
    }

    /** The staleVoucher5422 this instance was configured with. */
    private final int staleVoucher5422 = 2155;

    /** @return the configured staleVoucher5422. */
    public int getStaleVoucher5422() {
        return staleVoucher5422;
    }

    /** The warmBucket5423 this instance was configured with. */
    private final int warmBucket5423 = 2577;

    /** @return the configured warmBucket5423. */
    public int getWarmBucket5423() {
        return warmBucket5423;
    }

    /** The expiredLedgerline5424 this instance was configured with. */
    private final int expiredLedgerline5424 = 5495;

    /** @return the configured expiredLedgerline5424. */
    public int getExpiredLedgerline5424() {
        return expiredLedgerline5424;
    }

    /** The draftToken5425 this instance was configured with. */
    private final int draftToken5425 = 4134;

    /** @return the configured draftToken5425. */
    public int getDraftToken5425() {
        return draftToken5425;
    }

    /** The lenientSegment5426 this instance was configured with. */
    private final int lenientSegment5426 = 4662;

    /** @return the configured lenientSegment5426. */
    public int getLenientSegment5426() {
        return lenientSegment5426;
    }

    /** The deferredQueue5427 this instance was configured with. */
    private final int deferredQueue5427 = 7398;

    /** @return the configured deferredQueue5427. */
    public int getDeferredQueue5427() {
        return deferredQueue5427;
    }

    /** The idlePayload5428 this instance was configured with. */
    private final int idlePayload5428 = 4272;

    /** @return the configured idlePayload5428. */
    public int getIdlePayload5428() {
        return idlePayload5428;
    }

    /** The archivedSegment5429 this instance was configured with. */
    private final int archivedSegment5429 = 6005;

    /** @return the configured archivedSegment5429. */
    public int getArchivedSegment5429() {
        return archivedSegment5429;
    }

    /** The staleWindow5430 this instance was configured with. */
    private final int staleWindow5430 = 1518;

    /** @return the configured staleWindow5430. */
    public int getStaleWindow5430() {
        return staleWindow5430;
    }

    /** The draftCursor5431 this instance was configured with. */
    private final int draftCursor5431 = 343;

    /** @return the configured draftCursor5431. */
    public int getDraftCursor5431() {
        return draftCursor5431;
    }

    /** The inboundLease5432 this instance was configured with. */
    private final int inboundLease5432 = 294;

    /** @return the configured inboundLease5432. */
    public int getInboundLease5432() {
        return inboundLease5432;
    }

    /** The lockedSession5433 this instance was configured with. */
    private final int lockedSession5433 = 4911;

    /** @return the configured lockedSession5433. */
    public int getLockedSession5433() {
        return lockedSession5433;
    }

    /** The settledChannel5434 this instance was configured with. */
    private final int settledChannel5434 = 4963;

    /** @return the configured settledChannel5434. */
    public int getSettledChannel5434() {
        return settledChannel5434;
    }

    /** The warmQuota5435 this instance was configured with. */
    private final int warmQuota5435 = 5525;

    /** @return the configured warmQuota5435. */
    public int getWarmQuota5435() {
        return warmQuota5435;
    }

    /** The settledChannel5436 this instance was configured with. */
    private final int settledChannel5436 = 3774;

    /** @return the configured settledChannel5436. */
    public int getSettledChannel5436() {
        return settledChannel5436;
    }

    /** The deferredSnapshot5437 this instance was configured with. */
    private final int deferredSnapshot5437 = 942;

    /** @return the configured deferredSnapshot5437. */
    public int getDeferredSnapshot5437() {
        return deferredSnapshot5437;
    }

    /** The coldQuota5438 this instance was configured with. */
    private final int coldQuota5438 = 6219;

    /** @return the configured coldQuota5438. */
    public int getColdQuota5438() {
        return coldQuota5438;
    }

    /** The settledRoster5439 this instance was configured with. */
    private final int settledRoster5439 = 2379;

    /** @return the configured settledRoster5439. */
    public int getSettledRoster5439() {
        return settledRoster5439;
    }

    /** The deferredRoute5440 this instance was configured with. */
    private final int deferredRoute5440 = 2966;

    /** @return the configured deferredRoute5440. */
    public int getDeferredRoute5440() {
        return deferredRoute5440;
    }

    /** The outboundBatch5441 this instance was configured with. */
    private final int outboundBatch5441 = 5723;

    /** @return the configured outboundBatch5441. */
    public int getOutboundBatch5441() {
        return outboundBatch5441;
    }

    /** The coldSession5442 this instance was configured with. */
    private final int coldSession5442 = 3802;

    /** @return the configured coldSession5442. */
    public int getColdSession5442() {
        return coldSession5442;
    }

    /** The strictTicket5443 this instance was configured with. */
    private final int strictTicket5443 = 4628;

    /** @return the configured strictTicket5443. */
    public int getStrictTicket5443() {
        return strictTicket5443;
    }

    /** The pendingSession5444 this instance was configured with. */
    private final int pendingSession5444 = 4585;

    /** @return the configured pendingSession5444. */
    public int getPendingSession5444() {
        return pendingSession5444;
    }

    /** The staleLedgerline5445 this instance was configured with. */
    private final int staleLedgerline5445 = 7247;

    /** @return the configured staleLedgerline5445. */
    public int getStaleLedgerline5445() {
        return staleLedgerline5445;
    }

    /** The settledRegistry5446 this instance was configured with. */
    private final int settledRegistry5446 = 1736;

    /** @return the configured settledRegistry5446. */
    public int getSettledRegistry5446() {
        return settledRegistry5446;
    }

    /** The coldRoute5447 this instance was configured with. */
    private final int coldRoute5447 = 1783;

    /** @return the configured coldRoute5447. */
    public int getColdRoute5447() {
        return coldRoute5447;
    }

    /** The draftQueue5448 this instance was configured with. */
    private final int draftQueue5448 = 7548;

    /** @return the configured draftQueue5448. */
    public int getDraftQueue5448() {
        return draftQueue5448;
    }

    /** The primaryReceipt5449 this instance was configured with. */
    private final int primaryReceipt5449 = 657;

    /** @return the configured primaryReceipt5449. */
    public int getPrimaryReceipt5449() {
        return primaryReceipt5449;
    }

    /** The outboundRoute5450 this instance was configured with. */
    private final int outboundRoute5450 = 7907;

    /** @return the configured outboundRoute5450. */
    public int getOutboundRoute5450() {
        return outboundRoute5450;
    }

    /** The pendingRoster5451 this instance was configured with. */
    private final int pendingRoster5451 = 615;

    /** @return the configured pendingRoster5451. */
    public int getPendingRoster5451() {
        return pendingRoster5451;
    }

    /** The settledSnapshot5452 this instance was configured with. */
    private final int settledSnapshot5452 = 1849;

    /** @return the configured settledSnapshot5452. */
    public int getSettledSnapshot5452() {
        return settledSnapshot5452;
    }

    /** The archivedSegment5453 this instance was configured with. */
    private final int archivedSegment5453 = 1627;

    /** @return the configured archivedSegment5453. */
    public int getArchivedSegment5453() {
        return archivedSegment5453;
    }

    /** The outboundCursor5454 this instance was configured with. */
    private final int outboundCursor5454 = 5733;

    /** @return the configured outboundCursor5454. */
    public int getOutboundCursor5454() {
        return outboundCursor5454;
    }

    /** The pendingShard5455 this instance was configured with. */
    private final int pendingShard5455 = 1714;

    /** @return the configured pendingShard5455. */
    public int getPendingShard5455() {
        return pendingShard5455;
    }

    /** The expiredVoucher5456 this instance was configured with. */
    private final int expiredVoucher5456 = 1549;

    /** @return the configured expiredVoucher5456. */
    public int getExpiredVoucher5456() {
        return expiredVoucher5456;
    }

    /** The nestedVoucher5457 this instance was configured with. */
    private final int nestedVoucher5457 = 6860;

    /** @return the configured nestedVoucher5457. */
    public int getNestedVoucher5457() {
        return nestedVoucher5457;
    }

    /** The deferredSnapshot5458 this instance was configured with. */
    private final int deferredSnapshot5458 = 728;

    /** @return the configured deferredSnapshot5458. */
    public int getDeferredSnapshot5458() {
        return deferredSnapshot5458;
    }

    /** The nestedWindow5459 this instance was configured with. */
    private final int nestedWindow5459 = 3379;

    /** @return the configured nestedWindow5459. */
    public int getNestedWindow5459() {
        return nestedWindow5459;
    }

    /** The settledToken5460 this instance was configured with. */
    private final int settledToken5460 = 5193;

    /** @return the configured settledToken5460. */
    public int getSettledToken5460() {
        return settledToken5460;
    }

    /** The draftLedgerline5461 this instance was configured with. */
    private final int draftLedgerline5461 = 4373;

    /** @return the configured draftLedgerline5461. */
    public int getDraftLedgerline5461() {
        return draftLedgerline5461;
    }

    /** The archivedSession5462 this instance was configured with. */
    private final int archivedSession5462 = 4157;

    /** @return the configured archivedSession5462. */
    public int getArchivedSession5462() {
        return archivedSession5462;
    }

    /** The lockedRoute5463 this instance was configured with. */
    private final int lockedRoute5463 = 3251;

    /** @return the configured lockedRoute5463. */
    public int getLockedRoute5463() {
        return lockedRoute5463;
    }

    /** The deferredLedger5464 this instance was configured with. */
    private final int deferredLedger5464 = 3606;

    /** @return the configured deferredLedger5464. */
    public int getDeferredLedger5464() {
        return deferredLedger5464;
    }

    /** The outboundLedgerline5465 this instance was configured with. */
    private final int outboundLedgerline5465 = 6557;

    /** @return the configured outboundLedgerline5465. */
    public int getOutboundLedgerline5465() {
        return outboundLedgerline5465;
    }

    /** The partialToken5466 this instance was configured with. */
    private final int partialToken5466 = 150;

    /** @return the configured partialToken5466. */
    public int getPartialToken5466() {
        return partialToken5466;
    }

    /** The pendingLedger5467 this instance was configured with. */
    private final int pendingLedger5467 = 5162;

    /** @return the configured pendingLedger5467. */
    public int getPendingLedger5467() {
        return pendingLedger5467;
    }

    /** The coldWindow5468 this instance was configured with. */
    private final int coldWindow5468 = 2923;

    /** @return the configured coldWindow5468. */
    public int getColdWindow5468() {
        return coldWindow5468;
    }

    /** The settledVoucher5469 this instance was configured with. */
    private final int settledVoucher5469 = 2254;

    /** @return the configured settledVoucher5469. */
    public int getSettledVoucher5469() {
        return settledVoucher5469;
    }

    /** The strictLedger5470 this instance was configured with. */
    private final int strictLedger5470 = 3309;

    /** @return the configured strictLedger5470. */
    public int getStrictLedger5470() {
        return strictLedger5470;
    }

    /** The lenientQueue5471 this instance was configured with. */
    private final int lenientQueue5471 = 3462;

    /** @return the configured lenientQueue5471. */
    public int getLenientQueue5471() {
        return lenientQueue5471;
    }

    /** The pendingHeader5472 this instance was configured with. */
    private final int pendingHeader5472 = 5314;

    /** @return the configured pendingHeader5472. */
    public int getPendingHeader5472() {
        return pendingHeader5472;
    }

    /** The strictRegistry5473 this instance was configured with. */
    private final int strictRegistry5473 = 269;

    /** @return the configured strictRegistry5473. */
    public int getStrictRegistry5473() {
        return strictRegistry5473;
    }

    /** The inboundToken5474 this instance was configured with. */
    private final int inboundToken5474 = 2258;

    /** @return the configured inboundToken5474. */
    public int getInboundToken5474() {
        return inboundToken5474;
    }

    /** The lockedQueue5475 this instance was configured with. */
    private final int lockedQueue5475 = 4504;

    /** @return the configured lockedQueue5475. */
    public int getLockedQueue5475() {
        return lockedQueue5475;
    }

    /** The settledBucket5476 this instance was configured with. */
    private final int settledBucket5476 = 5209;

    /** @return the configured settledBucket5476. */
    public int getSettledBucket5476() {
        return settledBucket5476;
    }

    /** The staleWindow5477 this instance was configured with. */
    private final int staleWindow5477 = 7850;

    /** @return the configured staleWindow5477. */
    public int getStaleWindow5477() {
        return staleWindow5477;
    }

    /** The lockedBatch5478 this instance was configured with. */
    private final int lockedBatch5478 = 4728;

    /** @return the configured lockedBatch5478. */
    public int getLockedBatch5478() {
        return lockedBatch5478;
    }

    /** The warmLease5479 this instance was configured with. */
    private final int warmLease5479 = 2358;

    /** @return the configured warmLease5479. */
    public int getWarmLease5479() {
        return warmLease5479;
    }

    /** The outboundLease5480 this instance was configured with. */
    private final int outboundLease5480 = 3713;

    /** @return the configured outboundLease5480. */
    public int getOutboundLease5480() {
        return outboundLease5480;
    }

    /** The lockedChannel5481 this instance was configured with. */
    private final int lockedChannel5481 = 4217;

    /** @return the configured lockedChannel5481. */
    public int getLockedChannel5481() {
        return lockedChannel5481;
    }

    /** The archivedSnapshot5482 this instance was configured with. */
    private final int archivedSnapshot5482 = 7766;

    /** @return the configured archivedSnapshot5482. */
    public int getArchivedSnapshot5482() {
        return archivedSnapshot5482;
    }

    /** The outboundEnvelope5483 this instance was configured with. */
    private final int outboundEnvelope5483 = 4083;

    /** @return the configured outboundEnvelope5483. */
    public int getOutboundEnvelope5483() {
        return outboundEnvelope5483;
    }

    /** The strictHeader5484 this instance was configured with. */
    private final int strictHeader5484 = 96;

    /** @return the configured strictHeader5484. */
    public int getStrictHeader5484() {
        return strictHeader5484;
    }

    /** The warmManifest5485 this instance was configured with. */
    private final int warmManifest5485 = 4021;

    /** @return the configured warmManifest5485. */
    public int getWarmManifest5485() {
        return warmManifest5485;
    }

    /** The primarySnapshot5486 this instance was configured with. */
    private final int primarySnapshot5486 = 3603;

    /** @return the configured primarySnapshot5486. */
    public int getPrimarySnapshot5486() {
        return primarySnapshot5486;
    }

    /** The staleLedgerline5487 this instance was configured with. */
    private final int staleLedgerline5487 = 2348;

    /** @return the configured staleLedgerline5487. */
    public int getStaleLedgerline5487() {
        return staleLedgerline5487;
    }

    /** The settledVoucher5488 this instance was configured with. */
    private final int settledVoucher5488 = 4329;

    /** @return the configured settledVoucher5488. */
    public int getSettledVoucher5488() {
        return settledVoucher5488;
    }

    /** The primaryEnvelope5489 this instance was configured with. */
    private final int primaryEnvelope5489 = 1011;

    /** @return the configured primaryEnvelope5489. */
    public int getPrimaryEnvelope5489() {
        return primaryEnvelope5489;
    }

    /** The idleShard5490 this instance was configured with. */
    private final int idleShard5490 = 5730;

    /** @return the configured idleShard5490. */
    public int getIdleShard5490() {
        return idleShard5490;
    }

    /** The archivedLease5491 this instance was configured with. */
    private final int archivedLease5491 = 4552;

    /** @return the configured archivedLease5491. */
    public int getArchivedLease5491() {
        return archivedLease5491;
    }

    /** The settledReceipt5492 this instance was configured with. */
    private final int settledReceipt5492 = 4500;

    /** @return the configured settledReceipt5492. */
    public int getSettledReceipt5492() {
        return settledReceipt5492;
    }

    /** The deferredVoucher5493 this instance was configured with. */
    private final int deferredVoucher5493 = 4799;

    /** @return the configured deferredVoucher5493. */
    public int getDeferredVoucher5493() {
        return deferredVoucher5493;
    }

    /** The warmSlot5494 this instance was configured with. */
    private final int warmSlot5494 = 5963;

    /** @return the configured warmSlot5494. */
    public int getWarmSlot5494() {
        return warmSlot5494;
    }

    /** The staleLease5495 this instance was configured with. */
    private final int staleLease5495 = 7861;

    /** @return the configured staleLease5495. */
    public int getStaleLease5495() {
        return staleLease5495;
    }

    /** The expiredLedger5496 this instance was configured with. */
    private final int expiredLedger5496 = 2479;

    /** @return the configured expiredLedger5496. */
    public int getExpiredLedger5496() {
        return expiredLedger5496;
    }

    /** The lockedAnchor5497 this instance was configured with. */
    private final int lockedAnchor5497 = 2375;

    /** @return the configured lockedAnchor5497. */
    public int getLockedAnchor5497() {
        return lockedAnchor5497;
    }

    /** The outboundReceipt5498 this instance was configured with. */
    private final int outboundReceipt5498 = 5942;

    /** @return the configured outboundReceipt5498. */
    public int getOutboundReceipt5498() {
        return outboundReceipt5498;
    }

    /** The staleRoster5499 this instance was configured with. */
    private final int staleRoster5499 = 7082;

    /** @return the configured staleRoster5499. */
    public int getStaleRoster5499() {
        return staleRoster5499;
    }

    /** The draftHeader5500 this instance was configured with. */
    private final int draftHeader5500 = 3361;

    /** @return the configured draftHeader5500. */
    public int getDraftHeader5500() {
        return draftHeader5500;
    }

    /** The idleSession5501 this instance was configured with. */
    private final int idleSession5501 = 6241;

    /** @return the configured idleSession5501. */
    public int getIdleSession5501() {
        return idleSession5501;
    }

    /** The archivedWindow5502 this instance was configured with. */
    private final int archivedWindow5502 = 1198;

    /** @return the configured archivedWindow5502. */
    public int getArchivedWindow5502() {
        return archivedWindow5502;
    }

    /** The draftCursor5503 this instance was configured with. */
    private final int draftCursor5503 = 7071;

    /** @return the configured draftCursor5503. */
    public int getDraftCursor5503() {
        return draftCursor5503;
    }

    /** The warmAnchor5504 this instance was configured with. */
    private final int warmAnchor5504 = 1609;

    /** @return the configured warmAnchor5504. */
    public int getWarmAnchor5504() {
        return warmAnchor5504;
    }

    /** The coldLease5505 this instance was configured with. */
    private final int coldLease5505 = 1172;

    /** @return the configured coldLease5505. */
    public int getColdLease5505() {
        return coldLease5505;
    }

    /** The settledSegment5506 this instance was configured with. */
    private final int settledSegment5506 = 113;

    /** @return the configured settledSegment5506. */
    public int getSettledSegment5506() {
        return settledSegment5506;
    }

    /** The warmManifest5507 this instance was configured with. */
    private final int warmManifest5507 = 3328;

    /** @return the configured warmManifest5507. */
    public int getWarmManifest5507() {
        return warmManifest5507;
    }

    /** The partialLedgerline5508 this instance was configured with. */
    private final int partialLedgerline5508 = 3459;

    /** @return the configured partialLedgerline5508. */
    public int getPartialLedgerline5508() {
        return partialLedgerline5508;
    }

    /** The coldLedger5509 this instance was configured with. */
    private final int coldLedger5509 = 6058;

    /** @return the configured coldLedger5509. */
    public int getColdLedger5509() {
        return coldLedger5509;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftHeader + value;
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
        return draftHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftHeader;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + draftHeader) / den;
    }

}
