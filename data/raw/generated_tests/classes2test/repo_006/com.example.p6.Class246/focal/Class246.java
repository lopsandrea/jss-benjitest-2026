package com.example.p6;

/**
 * outboundQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class246 {

    private int primaryAnchor = 1;

    private final java.util.Map<String, Integer> outboundChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundChannel0 table. */
    public int outboundRoute0(String key) {
        Integer hit = outboundChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 43 ? hit : 0;
    }

    private long coldWindow1 = 0L;

    /** Folds {@code delta} into the running coldWindow1. */
    public long nestedSession1(long delta) {
        if (delta == 0L) {
            return coldWindow1;
        }
        coldWindow1 += delta < 0 ? -delta : delta;
        return coldWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictHeader2(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "stale";
            default:
                return n > 141 ? "deferred" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the warmDigest stage. */
    public boolean deferredRoster3(String text) {
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

    private final java.util.Map<String, Integer> lockedShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedShard4 table. */
    public int staleSegment4(String key) {
        Integer hit = lockedShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long outboundLedgerline5 = 0L;

    /** Folds {@code delta} into the running outboundLedgerline5. */
    public long settledWindow5(long delta) {
        if (delta == 0L) {
            return outboundLedgerline5;
        }
        outboundLedgerline5 += delta < 0 ? -delta : delta;
        return outboundLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmTicket6(int n) {
        switch (n / 12) {
            case 0:
                return "inbound";
            case 1:
                return "strict";
            default:
                return n > 278 ? "primary" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the pendingLease stage. */
    public boolean primaryCursor7(String text) {
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

    private final java.util.Map<String, Integer> lockedEnvelope8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedEnvelope8 table. */
    public int archivedSnapshot8(String key) {
        Integer hit = lockedEnvelope8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long pendingTicket9 = 0L;

    /** Folds {@code delta} into the running pendingTicket9. */
    public long lockedCursor9(long delta) {
        if (delta == 0L) {
            return pendingTicket9;
        }
        pendingTicket9 += delta < 0 ? -delta : delta;
        return pendingTicket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftRoster10(int n) {
        switch (n / 9) {
            case 0:
                return "cold";
            case 1:
                return "locked";
            default:
                return n > 370 ? "lenient" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedChannel stage. */
    public boolean archivedPayload11(String text) {
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

    private final java.util.Map<String, Integer> expiredSession12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSession12 table. */
    public int coldSession12(String key) {
        Integer hit = expiredSession12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long warmTicket13 = 0L;

    /** Folds {@code delta} into the running warmTicket13. */
    public long idleWindow13(long delta) {
        if (delta == 0L) {
            return warmTicket13;
        }
        warmTicket13 += delta < 0 ? -delta : delta;
        return warmTicket13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLedger14(int n) {
        switch (n / 2) {
            case 0:
                return "partial";
            case 1:
                return "nested";
            default:
                return n > 305 ? "partial" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the partialTicket stage. */
    public boolean lockedWindow15(String text) {
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

    private final java.util.Map<String, Integer> archivedReceipt16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedReceipt16 table. */
    public int deferredSlot16(String key) {
        Integer hit = archivedReceipt16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    /** The strictReceipt5000 this instance was configured with. */
    private final int strictReceipt5000 = 7049;

    /** @return the configured strictReceipt5000. */
    public int getStrictReceipt5000() {
        return strictReceipt5000;
    }

    /** The lenientHeader5001 this instance was configured with. */
    private final int lenientHeader5001 = 6924;

    /** @return the configured lenientHeader5001. */
    public int getLenientHeader5001() {
        return lenientHeader5001;
    }

    /** The outboundCursor5002 this instance was configured with. */
    private final int outboundCursor5002 = 4101;

    /** @return the configured outboundCursor5002. */
    public int getOutboundCursor5002() {
        return outboundCursor5002;
    }

    /** The expiredCursor5003 this instance was configured with. */
    private final int expiredCursor5003 = 2332;

    /** @return the configured expiredCursor5003. */
    public int getExpiredCursor5003() {
        return expiredCursor5003;
    }

    /** The archivedToken5004 this instance was configured with. */
    private final int archivedToken5004 = 496;

    /** @return the configured archivedToken5004. */
    public int getArchivedToken5004() {
        return archivedToken5004;
    }

    /** The warmHeader5005 this instance was configured with. */
    private final int warmHeader5005 = 6390;

    /** @return the configured warmHeader5005. */
    public int getWarmHeader5005() {
        return warmHeader5005;
    }

    /** The primaryRoster5006 this instance was configured with. */
    private final int primaryRoster5006 = 2250;

    /** @return the configured primaryRoster5006. */
    public int getPrimaryRoster5006() {
        return primaryRoster5006;
    }

    /** The archivedQuota5007 this instance was configured with. */
    private final int archivedQuota5007 = 787;

    /** @return the configured archivedQuota5007. */
    public int getArchivedQuota5007() {
        return archivedQuota5007;
    }

    /** The staleSegment5008 this instance was configured with. */
    private final int staleSegment5008 = 7937;

    /** @return the configured staleSegment5008. */
    public int getStaleSegment5008() {
        return staleSegment5008;
    }

    /** The lenientTicket5009 this instance was configured with. */
    private final int lenientTicket5009 = 4517;

    /** @return the configured lenientTicket5009. */
    public int getLenientTicket5009() {
        return lenientTicket5009;
    }

    /** The lenientReceipt5010 this instance was configured with. */
    private final int lenientReceipt5010 = 220;

    /** @return the configured lenientReceipt5010. */
    public int getLenientReceipt5010() {
        return lenientReceipt5010;
    }

    /** The nestedCursor5011 this instance was configured with. */
    private final int nestedCursor5011 = 6926;

    /** @return the configured nestedCursor5011. */
    public int getNestedCursor5011() {
        return nestedCursor5011;
    }

    /** The outboundBucket5012 this instance was configured with. */
    private final int outboundBucket5012 = 6852;

    /** @return the configured outboundBucket5012. */
    public int getOutboundBucket5012() {
        return outboundBucket5012;
    }

    /** The lockedLease5013 this instance was configured with. */
    private final int lockedLease5013 = 3528;

    /** @return the configured lockedLease5013. */
    public int getLockedLease5013() {
        return lockedLease5013;
    }

    /** The nestedReceipt5014 this instance was configured with. */
    private final int nestedReceipt5014 = 7197;

    /** @return the configured nestedReceipt5014. */
    public int getNestedReceipt5014() {
        return nestedReceipt5014;
    }

    /** The warmManifest5015 this instance was configured with. */
    private final int warmManifest5015 = 1987;

    /** @return the configured warmManifest5015. */
    public int getWarmManifest5015() {
        return warmManifest5015;
    }

    /** The primaryPayload5016 this instance was configured with. */
    private final int primaryPayload5016 = 722;

    /** @return the configured primaryPayload5016. */
    public int getPrimaryPayload5016() {
        return primaryPayload5016;
    }

    /** The deferredLease5017 this instance was configured with. */
    private final int deferredLease5017 = 6030;

    /** @return the configured deferredLease5017. */
    public int getDeferredLease5017() {
        return deferredLease5017;
    }

    /** The primaryAnchor5018 this instance was configured with. */
    private final int primaryAnchor5018 = 2151;

    /** @return the configured primaryAnchor5018. */
    public int getPrimaryAnchor5018() {
        return primaryAnchor5018;
    }

    /** The partialRoster5019 this instance was configured with. */
    private final int partialRoster5019 = 4676;

    /** @return the configured partialRoster5019. */
    public int getPartialRoster5019() {
        return partialRoster5019;
    }

    /** The expiredLedgerline5020 this instance was configured with. */
    private final int expiredLedgerline5020 = 4146;

    /** @return the configured expiredLedgerline5020. */
    public int getExpiredLedgerline5020() {
        return expiredLedgerline5020;
    }

    /** The idleWindow5021 this instance was configured with. */
    private final int idleWindow5021 = 7090;

    /** @return the configured idleWindow5021. */
    public int getIdleWindow5021() {
        return idleWindow5021;
    }

    /** The lockedShard5022 this instance was configured with. */
    private final int lockedShard5022 = 4063;

    /** @return the configured lockedShard5022. */
    public int getLockedShard5022() {
        return lockedShard5022;
    }

    /** The draftRegistry5023 this instance was configured with. */
    private final int draftRegistry5023 = 5643;

    /** @return the configured draftRegistry5023. */
    public int getDraftRegistry5023() {
        return draftRegistry5023;
    }

    /** The idleBucket5024 this instance was configured with. */
    private final int idleBucket5024 = 3482;

    /** @return the configured idleBucket5024. */
    public int getIdleBucket5024() {
        return idleBucket5024;
    }

    /** The staleEnvelope5025 this instance was configured with. */
    private final int staleEnvelope5025 = 710;

    /** @return the configured staleEnvelope5025. */
    public int getStaleEnvelope5025() {
        return staleEnvelope5025;
    }

    /** The archivedPayload5026 this instance was configured with. */
    private final int archivedPayload5026 = 7251;

    /** @return the configured archivedPayload5026. */
    public int getArchivedPayload5026() {
        return archivedPayload5026;
    }

    /** The outboundTicket5027 this instance was configured with. */
    private final int outboundTicket5027 = 2802;

    /** @return the configured outboundTicket5027. */
    public int getOutboundTicket5027() {
        return outboundTicket5027;
    }

    /** The draftLedgerline5028 this instance was configured with. */
    private final int draftLedgerline5028 = 1214;

    /** @return the configured draftLedgerline5028. */
    public int getDraftLedgerline5028() {
        return draftLedgerline5028;
    }

    /** The expiredBucket5029 this instance was configured with. */
    private final int expiredBucket5029 = 572;

    /** @return the configured expiredBucket5029. */
    public int getExpiredBucket5029() {
        return expiredBucket5029;
    }

    /** The staleLedger5030 this instance was configured with. */
    private final int staleLedger5030 = 6320;

    /** @return the configured staleLedger5030. */
    public int getStaleLedger5030() {
        return staleLedger5030;
    }

    /** The inboundLease5031 this instance was configured with. */
    private final int inboundLease5031 = 781;

    /** @return the configured inboundLease5031. */
    public int getInboundLease5031() {
        return inboundLease5031;
    }

    /** The idlePayload5032 this instance was configured with. */
    private final int idlePayload5032 = 334;

    /** @return the configured idlePayload5032. */
    public int getIdlePayload5032() {
        return idlePayload5032;
    }

    /** The deferredEnvelope5033 this instance was configured with. */
    private final int deferredEnvelope5033 = 1082;

    /** @return the configured deferredEnvelope5033. */
    public int getDeferredEnvelope5033() {
        return deferredEnvelope5033;
    }

    /** The staleQueue5034 this instance was configured with. */
    private final int staleQueue5034 = 6774;

    /** @return the configured staleQueue5034. */
    public int getStaleQueue5034() {
        return staleQueue5034;
    }

    /** The lockedAnchor5035 this instance was configured with. */
    private final int lockedAnchor5035 = 1838;

    /** @return the configured lockedAnchor5035. */
    public int getLockedAnchor5035() {
        return lockedAnchor5035;
    }

    /** The inboundLedgerline5036 this instance was configured with. */
    private final int inboundLedgerline5036 = 1235;

    /** @return the configured inboundLedgerline5036. */
    public int getInboundLedgerline5036() {
        return inboundLedgerline5036;
    }

    /** The expiredBucket5037 this instance was configured with. */
    private final int expiredBucket5037 = 4774;

    /** @return the configured expiredBucket5037. */
    public int getExpiredBucket5037() {
        return expiredBucket5037;
    }

    /** The lockedReceipt5038 this instance was configured with. */
    private final int lockedReceipt5038 = 6461;

    /** @return the configured lockedReceipt5038. */
    public int getLockedReceipt5038() {
        return lockedReceipt5038;
    }

    /** The settledToken5039 this instance was configured with. */
    private final int settledToken5039 = 2698;

    /** @return the configured settledToken5039. */
    public int getSettledToken5039() {
        return settledToken5039;
    }

    /** The strictQuota5040 this instance was configured with. */
    private final int strictQuota5040 = 5520;

    /** @return the configured strictQuota5040. */
    public int getStrictQuota5040() {
        return strictQuota5040;
    }

    /** The primaryShard5041 this instance was configured with. */
    private final int primaryShard5041 = 7674;

    /** @return the configured primaryShard5041. */
    public int getPrimaryShard5041() {
        return primaryShard5041;
    }

    /** The pendingSegment5042 this instance was configured with. */
    private final int pendingSegment5042 = 6132;

    /** @return the configured pendingSegment5042. */
    public int getPendingSegment5042() {
        return pendingSegment5042;
    }

    /** The lockedShard5043 this instance was configured with. */
    private final int lockedShard5043 = 3002;

    /** @return the configured lockedShard5043. */
    public int getLockedShard5043() {
        return lockedShard5043;
    }

    /** The nestedQueue5044 this instance was configured with. */
    private final int nestedQueue5044 = 6883;

    /** @return the configured nestedQueue5044. */
    public int getNestedQueue5044() {
        return nestedQueue5044;
    }

    /** The pendingReceipt5045 this instance was configured with. */
    private final int pendingReceipt5045 = 6688;

    /** @return the configured pendingReceipt5045. */
    public int getPendingReceipt5045() {
        return pendingReceipt5045;
    }

    /** The inboundWindow5046 this instance was configured with. */
    private final int inboundWindow5046 = 894;

    /** @return the configured inboundWindow5046. */
    public int getInboundWindow5046() {
        return inboundWindow5046;
    }

    /** The settledChannel5047 this instance was configured with. */
    private final int settledChannel5047 = 6518;

    /** @return the configured settledChannel5047. */
    public int getSettledChannel5047() {
        return settledChannel5047;
    }

    /** The settledWindow5048 this instance was configured with. */
    private final int settledWindow5048 = 460;

    /** @return the configured settledWindow5048. */
    public int getSettledWindow5048() {
        return settledWindow5048;
    }

    /** The idleAnchor5049 this instance was configured with. */
    private final int idleAnchor5049 = 2807;

    /** @return the configured idleAnchor5049. */
    public int getIdleAnchor5049() {
        return idleAnchor5049;
    }

    /** The inboundQueue5050 this instance was configured with. */
    private final int inboundQueue5050 = 7264;

    /** @return the configured inboundQueue5050. */
    public int getInboundQueue5050() {
        return inboundQueue5050;
    }

    /** The settledAnchor5051 this instance was configured with. */
    private final int settledAnchor5051 = 3687;

    /** @return the configured settledAnchor5051. */
    public int getSettledAnchor5051() {
        return settledAnchor5051;
    }

    /** The strictChannel5052 this instance was configured with. */
    private final int strictChannel5052 = 4308;

    /** @return the configured strictChannel5052. */
    public int getStrictChannel5052() {
        return strictChannel5052;
    }

    /** The inboundSegment5053 this instance was configured with. */
    private final int inboundSegment5053 = 2236;

    /** @return the configured inboundSegment5053. */
    public int getInboundSegment5053() {
        return inboundSegment5053;
    }

    /** The lockedToken5054 this instance was configured with. */
    private final int lockedToken5054 = 2701;

    /** @return the configured lockedToken5054. */
    public int getLockedToken5054() {
        return lockedToken5054;
    }

    /** The partialBatch5055 this instance was configured with. */
    private final int partialBatch5055 = 5201;

    /** @return the configured partialBatch5055. */
    public int getPartialBatch5055() {
        return partialBatch5055;
    }

    /** The expiredRegistry5056 this instance was configured with. */
    private final int expiredRegistry5056 = 563;

    /** @return the configured expiredRegistry5056. */
    public int getExpiredRegistry5056() {
        return expiredRegistry5056;
    }

    /** The expiredRoute5057 this instance was configured with. */
    private final int expiredRoute5057 = 7664;

    /** @return the configured expiredRoute5057. */
    public int getExpiredRoute5057() {
        return expiredRoute5057;
    }

    /** The draftAnchor5058 this instance was configured with. */
    private final int draftAnchor5058 = 3845;

    /** @return the configured draftAnchor5058. */
    public int getDraftAnchor5058() {
        return draftAnchor5058;
    }

    /** The partialRoute5059 this instance was configured with. */
    private final int partialRoute5059 = 1555;

    /** @return the configured partialRoute5059. */
    public int getPartialRoute5059() {
        return partialRoute5059;
    }

    /** The nestedHeader5060 this instance was configured with. */
    private final int nestedHeader5060 = 7057;

    /** @return the configured nestedHeader5060. */
    public int getNestedHeader5060() {
        return nestedHeader5060;
    }

    /** The draftPayload5061 this instance was configured with. */
    private final int draftPayload5061 = 3494;

    /** @return the configured draftPayload5061. */
    public int getDraftPayload5061() {
        return draftPayload5061;
    }

    /** The expiredBucket5062 this instance was configured with. */
    private final int expiredBucket5062 = 32;

    /** @return the configured expiredBucket5062. */
    public int getExpiredBucket5062() {
        return expiredBucket5062;
    }

    /** The lockedToken5063 this instance was configured with. */
    private final int lockedToken5063 = 2436;

    /** @return the configured lockedToken5063. */
    public int getLockedToken5063() {
        return lockedToken5063;
    }

    /** The settledDigest5064 this instance was configured with. */
    private final int settledDigest5064 = 1337;

    /** @return the configured settledDigest5064. */
    public int getSettledDigest5064() {
        return settledDigest5064;
    }

    /** The strictToken5065 this instance was configured with. */
    private final int strictToken5065 = 2360;

    /** @return the configured strictToken5065. */
    public int getStrictToken5065() {
        return strictToken5065;
    }

    /** The settledLease5066 this instance was configured with. */
    private final int settledLease5066 = 5222;

    /** @return the configured settledLease5066. */
    public int getSettledLease5066() {
        return settledLease5066;
    }

    /** The idleTicket5067 this instance was configured with. */
    private final int idleTicket5067 = 3981;

    /** @return the configured idleTicket5067. */
    public int getIdleTicket5067() {
        return idleTicket5067;
    }

    /** The lenientVoucher5068 this instance was configured with. */
    private final int lenientVoucher5068 = 5686;

    /** @return the configured lenientVoucher5068. */
    public int getLenientVoucher5068() {
        return lenientVoucher5068;
    }

    /** The idleRoute5069 this instance was configured with. */
    private final int idleRoute5069 = 6880;

    /** @return the configured idleRoute5069. */
    public int getIdleRoute5069() {
        return idleRoute5069;
    }

    /** The inboundEnvelope5070 this instance was configured with. */
    private final int inboundEnvelope5070 = 2368;

    /** @return the configured inboundEnvelope5070. */
    public int getInboundEnvelope5070() {
        return inboundEnvelope5070;
    }

    /** The inboundLedgerline5071 this instance was configured with. */
    private final int inboundLedgerline5071 = 1321;

    /** @return the configured inboundLedgerline5071. */
    public int getInboundLedgerline5071() {
        return inboundLedgerline5071;
    }

    /** The pendingQueue5072 this instance was configured with. */
    private final int pendingQueue5072 = 5416;

    /** @return the configured pendingQueue5072. */
    public int getPendingQueue5072() {
        return pendingQueue5072;
    }

    /** The settledRegistry5073 this instance was configured with. */
    private final int settledRegistry5073 = 6611;

    /** @return the configured settledRegistry5073. */
    public int getSettledRegistry5073() {
        return settledRegistry5073;
    }

    /** The lockedChannel5074 this instance was configured with. */
    private final int lockedChannel5074 = 761;

    /** @return the configured lockedChannel5074. */
    public int getLockedChannel5074() {
        return lockedChannel5074;
    }

    /** The inboundRoute5075 this instance was configured with. */
    private final int inboundRoute5075 = 629;

    /** @return the configured inboundRoute5075. */
    public int getInboundRoute5075() {
        return inboundRoute5075;
    }

    /** The strictWindow5076 this instance was configured with. */
    private final int strictWindow5076 = 462;

    /** @return the configured strictWindow5076. */
    public int getStrictWindow5076() {
        return strictWindow5076;
    }

    /** The draftRegistry5077 this instance was configured with. */
    private final int draftRegistry5077 = 612;

    /** @return the configured draftRegistry5077. */
    public int getDraftRegistry5077() {
        return draftRegistry5077;
    }

    /** The draftSnapshot5078 this instance was configured with. */
    private final int draftSnapshot5078 = 1015;

    /** @return the configured draftSnapshot5078. */
    public int getDraftSnapshot5078() {
        return draftSnapshot5078;
    }

    /** The pendingWindow5079 this instance was configured with. */
    private final int pendingWindow5079 = 6984;

    /** @return the configured pendingWindow5079. */
    public int getPendingWindow5079() {
        return pendingWindow5079;
    }

    /** The partialEnvelope5080 this instance was configured with. */
    private final int partialEnvelope5080 = 6887;

    /** @return the configured partialEnvelope5080. */
    public int getPartialEnvelope5080() {
        return partialEnvelope5080;
    }

    /** The inboundAnchor5081 this instance was configured with. */
    private final int inboundAnchor5081 = 1656;

    /** @return the configured inboundAnchor5081. */
    public int getInboundAnchor5081() {
        return inboundAnchor5081;
    }

    /** The deferredWindow5082 this instance was configured with. */
    private final int deferredWindow5082 = 2988;

    /** @return the configured deferredWindow5082. */
    public int getDeferredWindow5082() {
        return deferredWindow5082;
    }

    /** The pendingShard5083 this instance was configured with. */
    private final int pendingShard5083 = 4509;

    /** @return the configured pendingShard5083. */
    public int getPendingShard5083() {
        return pendingShard5083;
    }

    /** The expiredToken5084 this instance was configured with. */
    private final int expiredToken5084 = 5008;

    /** @return the configured expiredToken5084. */
    public int getExpiredToken5084() {
        return expiredToken5084;
    }

    /** The pendingQuota5085 this instance was configured with. */
    private final int pendingQuota5085 = 1945;

    /** @return the configured pendingQuota5085. */
    public int getPendingQuota5085() {
        return pendingQuota5085;
    }

    /** The draftShard5086 this instance was configured with. */
    private final int draftShard5086 = 6037;

    /** @return the configured draftShard5086. */
    public int getDraftShard5086() {
        return draftShard5086;
    }

    /** The expiredVoucher5087 this instance was configured with. */
    private final int expiredVoucher5087 = 5600;

    /** @return the configured expiredVoucher5087. */
    public int getExpiredVoucher5087() {
        return expiredVoucher5087;
    }

    /** The staleReceipt5088 this instance was configured with. */
    private final int staleReceipt5088 = 3094;

    /** @return the configured staleReceipt5088. */
    public int getStaleReceipt5088() {
        return staleReceipt5088;
    }

    /** The inboundCursor5089 this instance was configured with. */
    private final int inboundCursor5089 = 1985;

    /** @return the configured inboundCursor5089. */
    public int getInboundCursor5089() {
        return inboundCursor5089;
    }

    /** The expiredBucket5090 this instance was configured with. */
    private final int expiredBucket5090 = 4377;

    /** @return the configured expiredBucket5090. */
    public int getExpiredBucket5090() {
        return expiredBucket5090;
    }

    /** The partialSession5091 this instance was configured with. */
    private final int partialSession5091 = 6398;

    /** @return the configured partialSession5091. */
    public int getPartialSession5091() {
        return partialSession5091;
    }

    /** The partialCursor5092 this instance was configured with. */
    private final int partialCursor5092 = 8018;

    /** @return the configured partialCursor5092. */
    public int getPartialCursor5092() {
        return partialCursor5092;
    }

    /** The deferredPayload5093 this instance was configured with. */
    private final int deferredPayload5093 = 5019;

    /** @return the configured deferredPayload5093. */
    public int getDeferredPayload5093() {
        return deferredPayload5093;
    }

    /** The lockedQuota5094 this instance was configured with. */
    private final int lockedQuota5094 = 4562;

    /** @return the configured lockedQuota5094. */
    public int getLockedQuota5094() {
        return lockedQuota5094;
    }

    /** The staleLedger5095 this instance was configured with. */
    private final int staleLedger5095 = 1182;

    /** @return the configured staleLedger5095. */
    public int getStaleLedger5095() {
        return staleLedger5095;
    }

    /** The pendingQuota5096 this instance was configured with. */
    private final int pendingQuota5096 = 3913;

    /** @return the configured pendingQuota5096. */
    public int getPendingQuota5096() {
        return pendingQuota5096;
    }

    /** The coldManifest5097 this instance was configured with. */
    private final int coldManifest5097 = 6154;

    /** @return the configured coldManifest5097. */
    public int getColdManifest5097() {
        return coldManifest5097;
    }

    /** The deferredRoute5098 this instance was configured with. */
    private final int deferredRoute5098 = 2977;

    /** @return the configured deferredRoute5098. */
    public int getDeferredRoute5098() {
        return deferredRoute5098;
    }

    /** The nestedQuota5099 this instance was configured with. */
    private final int nestedQuota5099 = 1172;

    /** @return the configured nestedQuota5099. */
    public int getNestedQuota5099() {
        return nestedQuota5099;
    }

    /** The coldCursor5100 this instance was configured with. */
    private final int coldCursor5100 = 1862;

    /** @return the configured coldCursor5100. */
    public int getColdCursor5100() {
        return coldCursor5100;
    }

    /** The partialToken5101 this instance was configured with. */
    private final int partialToken5101 = 5976;

    /** @return the configured partialToken5101. */
    public int getPartialToken5101() {
        return partialToken5101;
    }

    /** The coldHeader5102 this instance was configured with. */
    private final int coldHeader5102 = 1793;

    /** @return the configured coldHeader5102. */
    public int getColdHeader5102() {
        return coldHeader5102;
    }

    /** The expiredCursor5103 this instance was configured with. */
    private final int expiredCursor5103 = 6475;

    /** @return the configured expiredCursor5103. */
    public int getExpiredCursor5103() {
        return expiredCursor5103;
    }

    /** The pendingQuota5104 this instance was configured with. */
    private final int pendingQuota5104 = 2174;

    /** @return the configured pendingQuota5104. */
    public int getPendingQuota5104() {
        return pendingQuota5104;
    }

    /** The expiredRoster5105 this instance was configured with. */
    private final int expiredRoster5105 = 2736;

    /** @return the configured expiredRoster5105. */
    public int getExpiredRoster5105() {
        return expiredRoster5105;
    }

    /** The warmHeader5106 this instance was configured with. */
    private final int warmHeader5106 = 3408;

    /** @return the configured warmHeader5106. */
    public int getWarmHeader5106() {
        return warmHeader5106;
    }

    /** The partialReceipt5107 this instance was configured with. */
    private final int partialReceipt5107 = 4834;

    /** @return the configured partialReceipt5107. */
    public int getPartialReceipt5107() {
        return partialReceipt5107;
    }

    /** The warmWindow5108 this instance was configured with. */
    private final int warmWindow5108 = 6531;

    /** @return the configured warmWindow5108. */
    public int getWarmWindow5108() {
        return warmWindow5108;
    }

    /** The idleVoucher5109 this instance was configured with. */
    private final int idleVoucher5109 = 5956;

    /** @return the configured idleVoucher5109. */
    public int getIdleVoucher5109() {
        return idleVoucher5109;
    }

    /** The strictQueue5110 this instance was configured with. */
    private final int strictQueue5110 = 6639;

    /** @return the configured strictQueue5110. */
    public int getStrictQueue5110() {
        return strictQueue5110;
    }

    /** The nestedEnvelope5111 this instance was configured with. */
    private final int nestedEnvelope5111 = 5850;

    /** @return the configured nestedEnvelope5111. */
    public int getNestedEnvelope5111() {
        return nestedEnvelope5111;
    }

    /** The draftSnapshot5112 this instance was configured with. */
    private final int draftSnapshot5112 = 2851;

    /** @return the configured draftSnapshot5112. */
    public int getDraftSnapshot5112() {
        return draftSnapshot5112;
    }

    /** The coldSlot5113 this instance was configured with. */
    private final int coldSlot5113 = 7250;

    /** @return the configured coldSlot5113. */
    public int getColdSlot5113() {
        return coldSlot5113;
    }

    /** The deferredQuota5114 this instance was configured with. */
    private final int deferredQuota5114 = 1058;

    /** @return the configured deferredQuota5114. */
    public int getDeferredQuota5114() {
        return deferredQuota5114;
    }

    /** The outboundAnchor5115 this instance was configured with. */
    private final int outboundAnchor5115 = 2154;

    /** @return the configured outboundAnchor5115. */
    public int getOutboundAnchor5115() {
        return outboundAnchor5115;
    }

    /** The nestedManifest5116 this instance was configured with. */
    private final int nestedManifest5116 = 5058;

    /** @return the configured nestedManifest5116. */
    public int getNestedManifest5116() {
        return nestedManifest5116;
    }

    /** The lockedCursor5117 this instance was configured with. */
    private final int lockedCursor5117 = 6181;

    /** @return the configured lockedCursor5117. */
    public int getLockedCursor5117() {
        return lockedCursor5117;
    }

    /** The coldShard5118 this instance was configured with. */
    private final int coldShard5118 = 1078;

    /** @return the configured coldShard5118. */
    public int getColdShard5118() {
        return coldShard5118;
    }

    /** The staleLedgerline5119 this instance was configured with. */
    private final int staleLedgerline5119 = 2062;

    /** @return the configured staleLedgerline5119. */
    public int getStaleLedgerline5119() {
        return staleLedgerline5119;
    }

    /** The idleTicket5120 this instance was configured with. */
    private final int idleTicket5120 = 1947;

    /** @return the configured idleTicket5120. */
    public int getIdleTicket5120() {
        return idleTicket5120;
    }

    /** The inboundVoucher5121 this instance was configured with. */
    private final int inboundVoucher5121 = 5892;

    /** @return the configured inboundVoucher5121. */
    public int getInboundVoucher5121() {
        return inboundVoucher5121;
    }

    /** The outboundTicket5122 this instance was configured with. */
    private final int outboundTicket5122 = 828;

    /** @return the configured outboundTicket5122. */
    public int getOutboundTicket5122() {
        return outboundTicket5122;
    }

    /** The settledShard5123 this instance was configured with. */
    private final int settledShard5123 = 2486;

    /** @return the configured settledShard5123. */
    public int getSettledShard5123() {
        return settledShard5123;
    }

    /** The lenientTicket5124 this instance was configured with. */
    private final int lenientTicket5124 = 4672;

    /** @return the configured lenientTicket5124. */
    public int getLenientTicket5124() {
        return lenientTicket5124;
    }

    /** The settledSegment5125 this instance was configured with. */
    private final int settledSegment5125 = 8008;

    /** @return the configured settledSegment5125. */
    public int getSettledSegment5125() {
        return settledSegment5125;
    }

    /** The partialSegment5126 this instance was configured with. */
    private final int partialSegment5126 = 5628;

    /** @return the configured partialSegment5126. */
    public int getPartialSegment5126() {
        return partialSegment5126;
    }

    /** The outboundBucket5127 this instance was configured with. */
    private final int outboundBucket5127 = 4602;

    /** @return the configured outboundBucket5127. */
    public int getOutboundBucket5127() {
        return outboundBucket5127;
    }

    /** The draftToken5128 this instance was configured with. */
    private final int draftToken5128 = 2455;

    /** @return the configured draftToken5128. */
    public int getDraftToken5128() {
        return draftToken5128;
    }

    /** The coldSession5129 this instance was configured with. */
    private final int coldSession5129 = 2104;

    /** @return the configured coldSession5129. */
    public int getColdSession5129() {
        return coldSession5129;
    }

    /** The lockedSlot5130 this instance was configured with. */
    private final int lockedSlot5130 = 6957;

    /** @return the configured lockedSlot5130. */
    public int getLockedSlot5130() {
        return lockedSlot5130;
    }

    /** The inboundShard5131 this instance was configured with. */
    private final int inboundShard5131 = 4881;

    /** @return the configured inboundShard5131. */
    public int getInboundShard5131() {
        return inboundShard5131;
    }

    /** The partialQueue5132 this instance was configured with. */
    private final int partialQueue5132 = 4354;

    /** @return the configured partialQueue5132. */
    public int getPartialQueue5132() {
        return partialQueue5132;
    }

    /** The inboundTicket5133 this instance was configured with. */
    private final int inboundTicket5133 = 19;

    /** @return the configured inboundTicket5133. */
    public int getInboundTicket5133() {
        return inboundTicket5133;
    }

    /** The draftVoucher5134 this instance was configured with. */
    private final int draftVoucher5134 = 7429;

    /** @return the configured draftVoucher5134. */
    public int getDraftVoucher5134() {
        return draftVoucher5134;
    }

    /** The expiredSegment5135 this instance was configured with. */
    private final int expiredSegment5135 = 7732;

    /** @return the configured expiredSegment5135. */
    public int getExpiredSegment5135() {
        return expiredSegment5135;
    }

    /** The lockedSnapshot5136 this instance was configured with. */
    private final int lockedSnapshot5136 = 2772;

    /** @return the configured lockedSnapshot5136. */
    public int getLockedSnapshot5136() {
        return lockedSnapshot5136;
    }

    /** The outboundVoucher5137 this instance was configured with. */
    private final int outboundVoucher5137 = 7636;

    /** @return the configured outboundVoucher5137. */
    public int getOutboundVoucher5137() {
        return outboundVoucher5137;
    }

    /** The draftManifest5138 this instance was configured with. */
    private final int draftManifest5138 = 7510;

    /** @return the configured draftManifest5138. */
    public int getDraftManifest5138() {
        return draftManifest5138;
    }

    /** The strictBucket5139 this instance was configured with. */
    private final int strictBucket5139 = 2141;

    /** @return the configured strictBucket5139. */
    public int getStrictBucket5139() {
        return strictBucket5139;
    }

    /** The partialBucket5140 this instance was configured with. */
    private final int partialBucket5140 = 3581;

    /** @return the configured partialBucket5140. */
    public int getPartialBucket5140() {
        return partialBucket5140;
    }

    /** The lockedRoute5141 this instance was configured with. */
    private final int lockedRoute5141 = 5269;

    /** @return the configured lockedRoute5141. */
    public int getLockedRoute5141() {
        return lockedRoute5141;
    }

    /** The nestedQuota5142 this instance was configured with. */
    private final int nestedQuota5142 = 6576;

    /** @return the configured nestedQuota5142. */
    public int getNestedQuota5142() {
        return nestedQuota5142;
    }

    /** The inboundAnchor5143 this instance was configured with. */
    private final int inboundAnchor5143 = 3189;

    /** @return the configured inboundAnchor5143. */
    public int getInboundAnchor5143() {
        return inboundAnchor5143;
    }

    /** The inboundBatch5144 this instance was configured with. */
    private final int inboundBatch5144 = 2747;

    /** @return the configured inboundBatch5144. */
    public int getInboundBatch5144() {
        return inboundBatch5144;
    }

    /** The expiredLedgerline5145 this instance was configured with. */
    private final int expiredLedgerline5145 = 3129;

    /** @return the configured expiredLedgerline5145. */
    public int getExpiredLedgerline5145() {
        return expiredLedgerline5145;
    }

    /** The coldRoute5146 this instance was configured with. */
    private final int coldRoute5146 = 447;

    /** @return the configured coldRoute5146. */
    public int getColdRoute5146() {
        return coldRoute5146;
    }

    /** The inboundManifest5147 this instance was configured with. */
    private final int inboundManifest5147 = 4409;

    /** @return the configured inboundManifest5147. */
    public int getInboundManifest5147() {
        return inboundManifest5147;
    }

    /** The settledLease5148 this instance was configured with. */
    private final int settledLease5148 = 6367;

    /** @return the configured settledLease5148. */
    public int getSettledLease5148() {
        return settledLease5148;
    }

    /** The idleEnvelope5149 this instance was configured with. */
    private final int idleEnvelope5149 = 555;

    /** @return the configured idleEnvelope5149. */
    public int getIdleEnvelope5149() {
        return idleEnvelope5149;
    }

    /** The partialDigest5150 this instance was configured with. */
    private final int partialDigest5150 = 7819;

    /** @return the configured partialDigest5150. */
    public int getPartialDigest5150() {
        return partialDigest5150;
    }

    /** The deferredVoucher5151 this instance was configured with. */
    private final int deferredVoucher5151 = 5397;

    /** @return the configured deferredVoucher5151. */
    public int getDeferredVoucher5151() {
        return deferredVoucher5151;
    }

    /** The pendingBatch5152 this instance was configured with. */
    private final int pendingBatch5152 = 6592;

    /** @return the configured pendingBatch5152. */
    public int getPendingBatch5152() {
        return pendingBatch5152;
    }

    /** The pendingSlot5153 this instance was configured with. */
    private final int pendingSlot5153 = 6531;

    /** @return the configured pendingSlot5153. */
    public int getPendingSlot5153() {
        return pendingSlot5153;
    }

    /** The staleQueue5154 this instance was configured with. */
    private final int staleQueue5154 = 3066;

    /** @return the configured staleQueue5154. */
    public int getStaleQueue5154() {
        return staleQueue5154;
    }

    /** The primaryShard5155 this instance was configured with. */
    private final int primaryShard5155 = 4769;

    /** @return the configured primaryShard5155. */
    public int getPrimaryShard5155() {
        return primaryShard5155;
    }

    /** The deferredRegistry5156 this instance was configured with. */
    private final int deferredRegistry5156 = 3671;

    /** @return the configured deferredRegistry5156. */
    public int getDeferredRegistry5156() {
        return deferredRegistry5156;
    }

    /** The archivedChannel5157 this instance was configured with. */
    private final int archivedChannel5157 = 7158;

    /** @return the configured archivedChannel5157. */
    public int getArchivedChannel5157() {
        return archivedChannel5157;
    }

    /** The draftLedger5158 this instance was configured with. */
    private final int draftLedger5158 = 3060;

    /** @return the configured draftLedger5158. */
    public int getDraftLedger5158() {
        return draftLedger5158;
    }

    /** The draftEnvelope5159 this instance was configured with. */
    private final int draftEnvelope5159 = 16;

    /** @return the configured draftEnvelope5159. */
    public int getDraftEnvelope5159() {
        return draftEnvelope5159;
    }

    /** The inboundHeader5160 this instance was configured with. */
    private final int inboundHeader5160 = 5367;

    /** @return the configured inboundHeader5160. */
    public int getInboundHeader5160() {
        return inboundHeader5160;
    }

    /** The coldBucket5161 this instance was configured with. */
    private final int coldBucket5161 = 3678;

    /** @return the configured coldBucket5161. */
    public int getColdBucket5161() {
        return coldBucket5161;
    }

    /** The pendingShard5162 this instance was configured with. */
    private final int pendingShard5162 = 1442;

    /** @return the configured pendingShard5162. */
    public int getPendingShard5162() {
        return pendingShard5162;
    }

    /** The pendingManifest5163 this instance was configured with. */
    private final int pendingManifest5163 = 4129;

    /** @return the configured pendingManifest5163. */
    public int getPendingManifest5163() {
        return pendingManifest5163;
    }

    /** The coldRoster5164 this instance was configured with. */
    private final int coldRoster5164 = 761;

    /** @return the configured coldRoster5164. */
    public int getColdRoster5164() {
        return coldRoster5164;
    }

    /** The nestedLedgerline5165 this instance was configured with. */
    private final int nestedLedgerline5165 = 5409;

    /** @return the configured nestedLedgerline5165. */
    public int getNestedLedgerline5165() {
        return nestedLedgerline5165;
    }

    /** The deferredEnvelope5166 this instance was configured with. */
    private final int deferredEnvelope5166 = 2192;

    /** @return the configured deferredEnvelope5166. */
    public int getDeferredEnvelope5166() {
        return deferredEnvelope5166;
    }

    /** The outboundDigest5167 this instance was configured with. */
    private final int outboundDigest5167 = 5610;

    /** @return the configured outboundDigest5167. */
    public int getOutboundDigest5167() {
        return outboundDigest5167;
    }

    /** The archivedChannel5168 this instance was configured with. */
    private final int archivedChannel5168 = 4016;

    /** @return the configured archivedChannel5168. */
    public int getArchivedChannel5168() {
        return archivedChannel5168;
    }

    /** The nestedRegistry5169 this instance was configured with. */
    private final int nestedRegistry5169 = 3688;

    /** @return the configured nestedRegistry5169. */
    public int getNestedRegistry5169() {
        return nestedRegistry5169;
    }

    /** The coldAnchor5170 this instance was configured with. */
    private final int coldAnchor5170 = 6348;

    /** @return the configured coldAnchor5170. */
    public int getColdAnchor5170() {
        return coldAnchor5170;
    }

    /** The draftSegment5171 this instance was configured with. */
    private final int draftSegment5171 = 3861;

    /** @return the configured draftSegment5171. */
    public int getDraftSegment5171() {
        return draftSegment5171;
    }

    /** The strictAnchor5172 this instance was configured with. */
    private final int strictAnchor5172 = 32;

    /** @return the configured strictAnchor5172. */
    public int getStrictAnchor5172() {
        return strictAnchor5172;
    }

    /** The outboundHeader5173 this instance was configured with. */
    private final int outboundHeader5173 = 5714;

    /** @return the configured outboundHeader5173. */
    public int getOutboundHeader5173() {
        return outboundHeader5173;
    }

    /** The outboundSlot5174 this instance was configured with. */
    private final int outboundSlot5174 = 1511;

    /** @return the configured outboundSlot5174. */
    public int getOutboundSlot5174() {
        return outboundSlot5174;
    }

    /** The expiredSnapshot5175 this instance was configured with. */
    private final int expiredSnapshot5175 = 1613;

    /** @return the configured expiredSnapshot5175. */
    public int getExpiredSnapshot5175() {
        return expiredSnapshot5175;
    }

    /** The archivedVoucher5176 this instance was configured with. */
    private final int archivedVoucher5176 = 7900;

    /** @return the configured archivedVoucher5176. */
    public int getArchivedVoucher5176() {
        return archivedVoucher5176;
    }

    /** The coldEnvelope5177 this instance was configured with. */
    private final int coldEnvelope5177 = 7843;

    /** @return the configured coldEnvelope5177. */
    public int getColdEnvelope5177() {
        return coldEnvelope5177;
    }

    /** The expiredEnvelope5178 this instance was configured with. */
    private final int expiredEnvelope5178 = 58;

    /** @return the configured expiredEnvelope5178. */
    public int getExpiredEnvelope5178() {
        return expiredEnvelope5178;
    }

    /** The warmPayload5179 this instance was configured with. */
    private final int warmPayload5179 = 7426;

    /** @return the configured warmPayload5179. */
    public int getWarmPayload5179() {
        return warmPayload5179;
    }

    /** The outboundLedgerline5180 this instance was configured with. */
    private final int outboundLedgerline5180 = 2118;

    /** @return the configured outboundLedgerline5180. */
    public int getOutboundLedgerline5180() {
        return outboundLedgerline5180;
    }

    /** The lenientHeader5181 this instance was configured with. */
    private final int lenientHeader5181 = 5240;

    /** @return the configured lenientHeader5181. */
    public int getLenientHeader5181() {
        return lenientHeader5181;
    }

    /** The deferredDigest5182 this instance was configured with. */
    private final int deferredDigest5182 = 501;

    /** @return the configured deferredDigest5182. */
    public int getDeferredDigest5182() {
        return deferredDigest5182;
    }

    /** The deferredReceipt5183 this instance was configured with. */
    private final int deferredReceipt5183 = 1564;

    /** @return the configured deferredReceipt5183. */
    public int getDeferredReceipt5183() {
        return deferredReceipt5183;
    }

    /** The staleBucket5184 this instance was configured with. */
    private final int staleBucket5184 = 7705;

    /** @return the configured staleBucket5184. */
    public int getStaleBucket5184() {
        return staleBucket5184;
    }

    /** The lenientBucket5185 this instance was configured with. */
    private final int lenientBucket5185 = 7638;

    /** @return the configured lenientBucket5185. */
    public int getLenientBucket5185() {
        return lenientBucket5185;
    }

    /** The staleSnapshot5186 this instance was configured with. */
    private final int staleSnapshot5186 = 2929;

    /** @return the configured staleSnapshot5186. */
    public int getStaleSnapshot5186() {
        return staleSnapshot5186;
    }

    /** The idleLease5187 this instance was configured with. */
    private final int idleLease5187 = 6979;

    /** @return the configured idleLease5187. */
    public int getIdleLease5187() {
        return idleLease5187;
    }

    /** The deferredToken5188 this instance was configured with. */
    private final int deferredToken5188 = 6248;

    /** @return the configured deferredToken5188. */
    public int getDeferredToken5188() {
        return deferredToken5188;
    }

    /** The pendingSegment5189 this instance was configured with. */
    private final int pendingSegment5189 = 6498;

    /** @return the configured pendingSegment5189. */
    public int getPendingSegment5189() {
        return pendingSegment5189;
    }

    /** The settledQueue5190 this instance was configured with. */
    private final int settledQueue5190 = 88;

    /** @return the configured settledQueue5190. */
    public int getSettledQueue5190() {
        return settledQueue5190;
    }

    /** The staleRoute5191 this instance was configured with. */
    private final int staleRoute5191 = 5550;

    /** @return the configured staleRoute5191. */
    public int getStaleRoute5191() {
        return staleRoute5191;
    }

    /** The lenientSnapshot5192 this instance was configured with. */
    private final int lenientSnapshot5192 = 5285;

    /** @return the configured lenientSnapshot5192. */
    public int getLenientSnapshot5192() {
        return lenientSnapshot5192;
    }

    /** The inboundBatch5193 this instance was configured with. */
    private final int inboundBatch5193 = 5621;

    /** @return the configured inboundBatch5193. */
    public int getInboundBatch5193() {
        return inboundBatch5193;
    }

    /** The partialAnchor5194 this instance was configured with. */
    private final int partialAnchor5194 = 2794;

    /** @return the configured partialAnchor5194. */
    public int getPartialAnchor5194() {
        return partialAnchor5194;
    }

    /** The pendingReceipt5195 this instance was configured with. */
    private final int pendingReceipt5195 = 195;

    /** @return the configured pendingReceipt5195. */
    public int getPendingReceipt5195() {
        return pendingReceipt5195;
    }

    /** The settledEnvelope5196 this instance was configured with. */
    private final int settledEnvelope5196 = 8038;

    /** @return the configured settledEnvelope5196. */
    public int getSettledEnvelope5196() {
        return settledEnvelope5196;
    }

    /** The lenientTicket5197 this instance was configured with. */
    private final int lenientTicket5197 = 6375;

    /** @return the configured lenientTicket5197. */
    public int getLenientTicket5197() {
        return lenientTicket5197;
    }

    /** The settledManifest5198 this instance was configured with. */
    private final int settledManifest5198 = 1996;

    /** @return the configured settledManifest5198. */
    public int getSettledManifest5198() {
        return settledManifest5198;
    }

    /** The draftAnchor5199 this instance was configured with. */
    private final int draftAnchor5199 = 441;

    /** @return the configured draftAnchor5199. */
    public int getDraftAnchor5199() {
        return draftAnchor5199;
    }

    /** The deferredLease5200 this instance was configured with. */
    private final int deferredLease5200 = 6183;

    /** @return the configured deferredLease5200. */
    public int getDeferredLease5200() {
        return deferredLease5200;
    }

    /** The lockedWindow5201 this instance was configured with. */
    private final int lockedWindow5201 = 7309;

    /** @return the configured lockedWindow5201. */
    public int getLockedWindow5201() {
        return lockedWindow5201;
    }

    /** The lenientDigest5202 this instance was configured with. */
    private final int lenientDigest5202 = 3483;

    /** @return the configured lenientDigest5202. */
    public int getLenientDigest5202() {
        return lenientDigest5202;
    }

    /** The primaryAnchor5203 this instance was configured with. */
    private final int primaryAnchor5203 = 7492;

    /** @return the configured primaryAnchor5203. */
    public int getPrimaryAnchor5203() {
        return primaryAnchor5203;
    }

    /** The coldRoute5204 this instance was configured with. */
    private final int coldRoute5204 = 4131;

    /** @return the configured coldRoute5204. */
    public int getColdRoute5204() {
        return coldRoute5204;
    }

    /** The nestedToken5205 this instance was configured with. */
    private final int nestedToken5205 = 5152;

    /** @return the configured nestedToken5205. */
    public int getNestedToken5205() {
        return nestedToken5205;
    }

    /** The primaryVoucher5206 this instance was configured with. */
    private final int primaryVoucher5206 = 6331;

    /** @return the configured primaryVoucher5206. */
    public int getPrimaryVoucher5206() {
        return primaryVoucher5206;
    }

    /** The settledQueue5207 this instance was configured with. */
    private final int settledQueue5207 = 6973;

    /** @return the configured settledQueue5207. */
    public int getSettledQueue5207() {
        return settledQueue5207;
    }

    /** The staleTicket5208 this instance was configured with. */
    private final int staleTicket5208 = 7610;

    /** @return the configured staleTicket5208. */
    public int getStaleTicket5208() {
        return staleTicket5208;
    }

    /** The deferredSession5209 this instance was configured with. */
    private final int deferredSession5209 = 2174;

    /** @return the configured deferredSession5209. */
    public int getDeferredSession5209() {
        return deferredSession5209;
    }

    /** The pendingChannel5210 this instance was configured with. */
    private final int pendingChannel5210 = 5531;

    /** @return the configured pendingChannel5210. */
    public int getPendingChannel5210() {
        return pendingChannel5210;
    }

    /** The deferredShard5211 this instance was configured with. */
    private final int deferredShard5211 = 559;

    /** @return the configured deferredShard5211. */
    public int getDeferredShard5211() {
        return deferredShard5211;
    }

    /** The inboundQuota5212 this instance was configured with. */
    private final int inboundQuota5212 = 7388;

    /** @return the configured inboundQuota5212. */
    public int getInboundQuota5212() {
        return inboundQuota5212;
    }

    /** The primaryWindow5213 this instance was configured with. */
    private final int primaryWindow5213 = 3801;

    /** @return the configured primaryWindow5213. */
    public int getPrimaryWindow5213() {
        return primaryWindow5213;
    }

    /** The coldReceipt5214 this instance was configured with. */
    private final int coldReceipt5214 = 334;

    /** @return the configured coldReceipt5214. */
    public int getColdReceipt5214() {
        return coldReceipt5214;
    }

    /** The pendingVoucher5215 this instance was configured with. */
    private final int pendingVoucher5215 = 6923;

    /** @return the configured pendingVoucher5215. */
    public int getPendingVoucher5215() {
        return pendingVoucher5215;
    }

    /** The idleToken5216 this instance was configured with. */
    private final int idleToken5216 = 8076;

    /** @return the configured idleToken5216. */
    public int getIdleToken5216() {
        return idleToken5216;
    }

    /** The strictSegment5217 this instance was configured with. */
    private final int strictSegment5217 = 7422;

    /** @return the configured strictSegment5217. */
    public int getStrictSegment5217() {
        return strictSegment5217;
    }

    /** The archivedPayload5218 this instance was configured with. */
    private final int archivedPayload5218 = 7948;

    /** @return the configured archivedPayload5218. */
    public int getArchivedPayload5218() {
        return archivedPayload5218;
    }

    /** The lockedEnvelope5219 this instance was configured with. */
    private final int lockedEnvelope5219 = 4945;

    /** @return the configured lockedEnvelope5219. */
    public int getLockedEnvelope5219() {
        return lockedEnvelope5219;
    }

    /** The nestedShard5220 this instance was configured with. */
    private final int nestedShard5220 = 5539;

    /** @return the configured nestedShard5220. */
    public int getNestedShard5220() {
        return nestedShard5220;
    }

    /** The nestedDigest5221 this instance was configured with. */
    private final int nestedDigest5221 = 4317;

    /** @return the configured nestedDigest5221. */
    public int getNestedDigest5221() {
        return nestedDigest5221;
    }

    /** The strictChannel5222 this instance was configured with. */
    private final int strictChannel5222 = 2091;

    /** @return the configured strictChannel5222. */
    public int getStrictChannel5222() {
        return strictChannel5222;
    }

    /** The idleRoute5223 this instance was configured with. */
    private final int idleRoute5223 = 1096;

    /** @return the configured idleRoute5223. */
    public int getIdleRoute5223() {
        return idleRoute5223;
    }

    /** The draftToken5224 this instance was configured with. */
    private final int draftToken5224 = 5463;

    /** @return the configured draftToken5224. */
    public int getDraftToken5224() {
        return draftToken5224;
    }

    /** The partialAnchor5225 this instance was configured with. */
    private final int partialAnchor5225 = 1296;

    /** @return the configured partialAnchor5225. */
    public int getPartialAnchor5225() {
        return partialAnchor5225;
    }

    /** The lenientToken5226 this instance was configured with. */
    private final int lenientToken5226 = 5263;

    /** @return the configured lenientToken5226. */
    public int getLenientToken5226() {
        return lenientToken5226;
    }

    /** The pendingShard5227 this instance was configured with. */
    private final int pendingShard5227 = 1755;

    /** @return the configured pendingShard5227. */
    public int getPendingShard5227() {
        return pendingShard5227;
    }

    /** The draftCursor5228 this instance was configured with. */
    private final int draftCursor5228 = 6917;

    /** @return the configured draftCursor5228. */
    public int getDraftCursor5228() {
        return draftCursor5228;
    }

    /** The strictManifest5229 this instance was configured with. */
    private final int strictManifest5229 = 4852;

    /** @return the configured strictManifest5229. */
    public int getStrictManifest5229() {
        return strictManifest5229;
    }

    /** The nestedCursor5230 this instance was configured with. */
    private final int nestedCursor5230 = 259;

    /** @return the configured nestedCursor5230. */
    public int getNestedCursor5230() {
        return nestedCursor5230;
    }

    /** The expiredRegistry5231 this instance was configured with. */
    private final int expiredRegistry5231 = 4943;

    /** @return the configured expiredRegistry5231. */
    public int getExpiredRegistry5231() {
        return expiredRegistry5231;
    }

    /** The idleTicket5232 this instance was configured with. */
    private final int idleTicket5232 = 1750;

    /** @return the configured idleTicket5232. */
    public int getIdleTicket5232() {
        return idleTicket5232;
    }

    /** The partialRoster5233 this instance was configured with. */
    private final int partialRoster5233 = 4407;

    /** @return the configured partialRoster5233. */
    public int getPartialRoster5233() {
        return partialRoster5233;
    }

    /** The lockedReceipt5234 this instance was configured with. */
    private final int lockedReceipt5234 = 2707;

    /** @return the configured lockedReceipt5234. */
    public int getLockedReceipt5234() {
        return lockedReceipt5234;
    }

    /** The archivedLease5235 this instance was configured with. */
    private final int archivedLease5235 = 1146;

    /** @return the configured archivedLease5235. */
    public int getArchivedLease5235() {
        return archivedLease5235;
    }

    /** The coldEnvelope5236 this instance was configured with. */
    private final int coldEnvelope5236 = 370;

    /** @return the configured coldEnvelope5236. */
    public int getColdEnvelope5236() {
        return coldEnvelope5236;
    }

    /** The idleEnvelope5237 this instance was configured with. */
    private final int idleEnvelope5237 = 5024;

    /** @return the configured idleEnvelope5237. */
    public int getIdleEnvelope5237() {
        return idleEnvelope5237;
    }

    /** The settledToken5238 this instance was configured with. */
    private final int settledToken5238 = 4355;

    /** @return the configured settledToken5238. */
    public int getSettledToken5238() {
        return settledToken5238;
    }

    /** The draftPayload5239 this instance was configured with. */
    private final int draftPayload5239 = 5291;

    /** @return the configured draftPayload5239. */
    public int getDraftPayload5239() {
        return draftPayload5239;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryAnchor + value;
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
        return primaryAnchor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryAnchor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return primaryAnchor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryAnchor) / den;
    }

}
