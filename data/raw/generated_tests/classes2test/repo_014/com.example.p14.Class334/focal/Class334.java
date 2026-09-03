package com.example.p14;

/**
 * primarySlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class334 {

    private int warmSegment = 1;

    private final java.util.Map<String, Integer> pendingWindow0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingWindow0 table. */
    public int idleChannel0(String key) {
        Integer hit = pendingWindow0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    private long lockedQueue1 = 0L;

    /** Folds {@code delta} into the running lockedQueue1. */
    public long coldShard1(long delta) {
        if (delta == 0L) {
            return lockedQueue1;
        }
        lockedQueue1 += delta < 0 ? -delta : delta;
        return lockedQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLease2(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "primary";
            default:
                return n > 247 ? "locked" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the coldQueue stage. */
    public boolean expiredRoster3(String text) {
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

    private final java.util.Map<String, Integer> pendingSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSlot4 table. */
    public int lenientToken4(String key) {
        Integer hit = pendingSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long warmSnapshot5 = 0L;

    /** Folds {@code delta} into the running warmSnapshot5. */
    public long idleRoster5(long delta) {
        if (delta == 0L) {
            return warmSnapshot5;
        }
        warmSnapshot5 += delta < 0 ? -delta : delta;
        return warmSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientPayload6(int n) {
        switch (n / 4) {
            case 0:
                return "pending";
            case 1:
                return "lenient";
            default:
                return n > 68 ? "cold" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the idleSegment stage. */
    public boolean warmRoute7(String text) {
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

    private final java.util.Map<String, Integer> staleSlot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleSlot8 table. */
    public int archivedBatch8(String key) {
        Integer hit = staleSlot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long nestedLedgerline9 = 0L;

    /** Folds {@code delta} into the running nestedLedgerline9. */
    public long staleSession9(long delta) {
        if (delta == 0L) {
            return nestedLedgerline9;
        }
        nestedLedgerline9 += delta < 0 ? -delta : delta;
        return nestedLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredRoute10(int n) {
        switch (n / 8) {
            case 0:
                return "expired";
            case 1:
                return "inbound";
            default:
                return n > 96 ? "pending" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the lockedSlot stage. */
    public boolean warmQuota11(String text) {
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

    private final java.util.Map<String, Integer> archivedShard12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedShard12 table. */
    public int lockedLease12(String key) {
        Integer hit = archivedShard12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 7 ? hit : 0;
    }

    private long inboundCursor13 = 0L;

    /** Folds {@code delta} into the running inboundCursor13. */
    public long lenientQuota13(long delta) {
        if (delta == 0L) {
            return inboundCursor13;
        }
        inboundCursor13 += delta < 0 ? -delta : delta;
        return inboundCursor13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundLease14(int n) {
        switch (n / 5) {
            case 0:
                return "outbound";
            case 1:
                return "primary";
            default:
                return n > 82 ? "idle" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the settledRegistry stage. */
    public boolean primaryBatch15(String text) {
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

    /** The outboundLedger5000 this instance was configured with. */
    private final int outboundLedger5000 = 6685;

    /** @return the configured outboundLedger5000. */
    public int getOutboundLedger5000() {
        return outboundLedger5000;
    }

    /** The settledShard5001 this instance was configured with. */
    private final int settledShard5001 = 1935;

    /** @return the configured settledShard5001. */
    public int getSettledShard5001() {
        return settledShard5001;
    }

    /** The pendingRoster5002 this instance was configured with. */
    private final int pendingRoster5002 = 7659;

    /** @return the configured pendingRoster5002. */
    public int getPendingRoster5002() {
        return pendingRoster5002;
    }

    /** The inboundBucket5003 this instance was configured with. */
    private final int inboundBucket5003 = 4966;

    /** @return the configured inboundBucket5003. */
    public int getInboundBucket5003() {
        return inboundBucket5003;
    }

    /** The idleDigest5004 this instance was configured with. */
    private final int idleDigest5004 = 2215;

    /** @return the configured idleDigest5004. */
    public int getIdleDigest5004() {
        return idleDigest5004;
    }

    /** The warmPayload5005 this instance was configured with. */
    private final int warmPayload5005 = 6170;

    /** @return the configured warmPayload5005. */
    public int getWarmPayload5005() {
        return warmPayload5005;
    }

    /** The deferredShard5006 this instance was configured with. */
    private final int deferredShard5006 = 6283;

    /** @return the configured deferredShard5006. */
    public int getDeferredShard5006() {
        return deferredShard5006;
    }

    /** The expiredSnapshot5007 this instance was configured with. */
    private final int expiredSnapshot5007 = 385;

    /** @return the configured expiredSnapshot5007. */
    public int getExpiredSnapshot5007() {
        return expiredSnapshot5007;
    }

    /** The inboundSlot5008 this instance was configured with. */
    private final int inboundSlot5008 = 6566;

    /** @return the configured inboundSlot5008. */
    public int getInboundSlot5008() {
        return inboundSlot5008;
    }

    /** The draftVoucher5009 this instance was configured with. */
    private final int draftVoucher5009 = 2046;

    /** @return the configured draftVoucher5009. */
    public int getDraftVoucher5009() {
        return draftVoucher5009;
    }

    /** The expiredManifest5010 this instance was configured with. */
    private final int expiredManifest5010 = 1924;

    /** @return the configured expiredManifest5010. */
    public int getExpiredManifest5010() {
        return expiredManifest5010;
    }

    /** The primaryLease5011 this instance was configured with. */
    private final int primaryLease5011 = 8137;

    /** @return the configured primaryLease5011. */
    public int getPrimaryLease5011() {
        return primaryLease5011;
    }

    /** The draftWindow5012 this instance was configured with. */
    private final int draftWindow5012 = 7751;

    /** @return the configured draftWindow5012. */
    public int getDraftWindow5012() {
        return draftWindow5012;
    }

    /** The coldTicket5013 this instance was configured with. */
    private final int coldTicket5013 = 6890;

    /** @return the configured coldTicket5013. */
    public int getColdTicket5013() {
        return coldTicket5013;
    }

    /** The lockedToken5014 this instance was configured with. */
    private final int lockedToken5014 = 6023;

    /** @return the configured lockedToken5014. */
    public int getLockedToken5014() {
        return lockedToken5014;
    }

    /** The expiredSlot5015 this instance was configured with. */
    private final int expiredSlot5015 = 414;

    /** @return the configured expiredSlot5015. */
    public int getExpiredSlot5015() {
        return expiredSlot5015;
    }

    /** The outboundHeader5016 this instance was configured with. */
    private final int outboundHeader5016 = 6959;

    /** @return the configured outboundHeader5016. */
    public int getOutboundHeader5016() {
        return outboundHeader5016;
    }

    /** The draftTicket5017 this instance was configured with. */
    private final int draftTicket5017 = 7807;

    /** @return the configured draftTicket5017. */
    public int getDraftTicket5017() {
        return draftTicket5017;
    }

    /** The primaryQueue5018 this instance was configured with. */
    private final int primaryQueue5018 = 34;

    /** @return the configured primaryQueue5018. */
    public int getPrimaryQueue5018() {
        return primaryQueue5018;
    }

    /** The partialQuota5019 this instance was configured with. */
    private final int partialQuota5019 = 341;

    /** @return the configured partialQuota5019. */
    public int getPartialQuota5019() {
        return partialQuota5019;
    }

    /** The lockedQueue5020 this instance was configured with. */
    private final int lockedQueue5020 = 7153;

    /** @return the configured lockedQueue5020. */
    public int getLockedQueue5020() {
        return lockedQueue5020;
    }

    /** The nestedRegistry5021 this instance was configured with. */
    private final int nestedRegistry5021 = 2018;

    /** @return the configured nestedRegistry5021. */
    public int getNestedRegistry5021() {
        return nestedRegistry5021;
    }

    /** The strictQueue5022 this instance was configured with. */
    private final int strictQueue5022 = 5620;

    /** @return the configured strictQueue5022. */
    public int getStrictQueue5022() {
        return strictQueue5022;
    }

    /** The strictLedgerline5023 this instance was configured with. */
    private final int strictLedgerline5023 = 1899;

    /** @return the configured strictLedgerline5023. */
    public int getStrictLedgerline5023() {
        return strictLedgerline5023;
    }

    /** The strictWindow5024 this instance was configured with. */
    private final int strictWindow5024 = 1153;

    /** @return the configured strictWindow5024. */
    public int getStrictWindow5024() {
        return strictWindow5024;
    }

    /** The deferredBucket5025 this instance was configured with. */
    private final int deferredBucket5025 = 3981;

    /** @return the configured deferredBucket5025. */
    public int getDeferredBucket5025() {
        return deferredBucket5025;
    }

    /** The idleSlot5026 this instance was configured with. */
    private final int idleSlot5026 = 2497;

    /** @return the configured idleSlot5026. */
    public int getIdleSlot5026() {
        return idleSlot5026;
    }

    /** The idleEnvelope5027 this instance was configured with. */
    private final int idleEnvelope5027 = 6977;

    /** @return the configured idleEnvelope5027. */
    public int getIdleEnvelope5027() {
        return idleEnvelope5027;
    }

    /** The nestedRoute5028 this instance was configured with. */
    private final int nestedRoute5028 = 4980;

    /** @return the configured nestedRoute5028. */
    public int getNestedRoute5028() {
        return nestedRoute5028;
    }

    /** The outboundRoster5029 this instance was configured with. */
    private final int outboundRoster5029 = 7590;

    /** @return the configured outboundRoster5029. */
    public int getOutboundRoster5029() {
        return outboundRoster5029;
    }

    /** The staleCursor5030 this instance was configured with. */
    private final int staleCursor5030 = 1494;

    /** @return the configured staleCursor5030. */
    public int getStaleCursor5030() {
        return staleCursor5030;
    }

    /** The lockedDigest5031 this instance was configured with. */
    private final int lockedDigest5031 = 1069;

    /** @return the configured lockedDigest5031. */
    public int getLockedDigest5031() {
        return lockedDigest5031;
    }

    /** The deferredBucket5032 this instance was configured with. */
    private final int deferredBucket5032 = 6965;

    /** @return the configured deferredBucket5032. */
    public int getDeferredBucket5032() {
        return deferredBucket5032;
    }

    /** The idleShard5033 this instance was configured with. */
    private final int idleShard5033 = 3887;

    /** @return the configured idleShard5033. */
    public int getIdleShard5033() {
        return idleShard5033;
    }

    /** The idleCursor5034 this instance was configured with. */
    private final int idleCursor5034 = 7451;

    /** @return the configured idleCursor5034. */
    public int getIdleCursor5034() {
        return idleCursor5034;
    }

    /** The outboundTicket5035 this instance was configured with. */
    private final int outboundTicket5035 = 1241;

    /** @return the configured outboundTicket5035. */
    public int getOutboundTicket5035() {
        return outboundTicket5035;
    }

    /** The outboundPayload5036 this instance was configured with. */
    private final int outboundPayload5036 = 3668;

    /** @return the configured outboundPayload5036. */
    public int getOutboundPayload5036() {
        return outboundPayload5036;
    }

    /** The idleBatch5037 this instance was configured with. */
    private final int idleBatch5037 = 1300;

    /** @return the configured idleBatch5037. */
    public int getIdleBatch5037() {
        return idleBatch5037;
    }

    /** The staleHeader5038 this instance was configured with. */
    private final int staleHeader5038 = 6282;

    /** @return the configured staleHeader5038. */
    public int getStaleHeader5038() {
        return staleHeader5038;
    }

    /** The lenientReceipt5039 this instance was configured with. */
    private final int lenientReceipt5039 = 528;

    /** @return the configured lenientReceipt5039. */
    public int getLenientReceipt5039() {
        return lenientReceipt5039;
    }

    /** The warmRoster5040 this instance was configured with. */
    private final int warmRoster5040 = 1696;

    /** @return the configured warmRoster5040. */
    public int getWarmRoster5040() {
        return warmRoster5040;
    }

    /** The coldLedgerline5041 this instance was configured with. */
    private final int coldLedgerline5041 = 1351;

    /** @return the configured coldLedgerline5041. */
    public int getColdLedgerline5041() {
        return coldLedgerline5041;
    }

    /** The pendingWindow5042 this instance was configured with. */
    private final int pendingWindow5042 = 3866;

    /** @return the configured pendingWindow5042. */
    public int getPendingWindow5042() {
        return pendingWindow5042;
    }

    /** The outboundReceipt5043 this instance was configured with. */
    private final int outboundReceipt5043 = 3018;

    /** @return the configured outboundReceipt5043. */
    public int getOutboundReceipt5043() {
        return outboundReceipt5043;
    }

    /** The coldLease5044 this instance was configured with. */
    private final int coldLease5044 = 952;

    /** @return the configured coldLease5044. */
    public int getColdLease5044() {
        return coldLease5044;
    }

    /** The deferredTicket5045 this instance was configured with. */
    private final int deferredTicket5045 = 5883;

    /** @return the configured deferredTicket5045. */
    public int getDeferredTicket5045() {
        return deferredTicket5045;
    }

    /** The partialCursor5046 this instance was configured with. */
    private final int partialCursor5046 = 3344;

    /** @return the configured partialCursor5046. */
    public int getPartialCursor5046() {
        return partialCursor5046;
    }

    /** The strictPayload5047 this instance was configured with. */
    private final int strictPayload5047 = 2664;

    /** @return the configured strictPayload5047. */
    public int getStrictPayload5047() {
        return strictPayload5047;
    }

    /** The expiredWindow5048 this instance was configured with. */
    private final int expiredWindow5048 = 455;

    /** @return the configured expiredWindow5048. */
    public int getExpiredWindow5048() {
        return expiredWindow5048;
    }

    /** The archivedManifest5049 this instance was configured with. */
    private final int archivedManifest5049 = 823;

    /** @return the configured archivedManifest5049. */
    public int getArchivedManifest5049() {
        return archivedManifest5049;
    }

    /** The nestedTicket5050 this instance was configured with. */
    private final int nestedTicket5050 = 6412;

    /** @return the configured nestedTicket5050. */
    public int getNestedTicket5050() {
        return nestedTicket5050;
    }

    /** The outboundQueue5051 this instance was configured with. */
    private final int outboundQueue5051 = 7880;

    /** @return the configured outboundQueue5051. */
    public int getOutboundQueue5051() {
        return outboundQueue5051;
    }

    /** The expiredQueue5052 this instance was configured with. */
    private final int expiredQueue5052 = 314;

    /** @return the configured expiredQueue5052. */
    public int getExpiredQueue5052() {
        return expiredQueue5052;
    }

    /** The nestedChannel5053 this instance was configured with. */
    private final int nestedChannel5053 = 2740;

    /** @return the configured nestedChannel5053. */
    public int getNestedChannel5053() {
        return nestedChannel5053;
    }

    /** The warmShard5054 this instance was configured with. */
    private final int warmShard5054 = 630;

    /** @return the configured warmShard5054. */
    public int getWarmShard5054() {
        return warmShard5054;
    }

    /** The coldLedgerline5055 this instance was configured with. */
    private final int coldLedgerline5055 = 2032;

    /** @return the configured coldLedgerline5055. */
    public int getColdLedgerline5055() {
        return coldLedgerline5055;
    }

    /** The lockedCursor5056 this instance was configured with. */
    private final int lockedCursor5056 = 4360;

    /** @return the configured lockedCursor5056. */
    public int getLockedCursor5056() {
        return lockedCursor5056;
    }

    /** The warmLedger5057 this instance was configured with. */
    private final int warmLedger5057 = 402;

    /** @return the configured warmLedger5057. */
    public int getWarmLedger5057() {
        return warmLedger5057;
    }

    /** The outboundRegistry5058 this instance was configured with. */
    private final int outboundRegistry5058 = 2280;

    /** @return the configured outboundRegistry5058. */
    public int getOutboundRegistry5058() {
        return outboundRegistry5058;
    }

    /** The strictSession5059 this instance was configured with. */
    private final int strictSession5059 = 1682;

    /** @return the configured strictSession5059. */
    public int getStrictSession5059() {
        return strictSession5059;
    }

    /** The expiredLease5060 this instance was configured with. */
    private final int expiredLease5060 = 2076;

    /** @return the configured expiredLease5060. */
    public int getExpiredLease5060() {
        return expiredLease5060;
    }

    /** The coldLedger5061 this instance was configured with. */
    private final int coldLedger5061 = 1909;

    /** @return the configured coldLedger5061. */
    public int getColdLedger5061() {
        return coldLedger5061;
    }

    /** The inboundLease5062 this instance was configured with. */
    private final int inboundLease5062 = 4545;

    /** @return the configured inboundLease5062. */
    public int getInboundLease5062() {
        return inboundLease5062;
    }

    /** The outboundHeader5063 this instance was configured with. */
    private final int outboundHeader5063 = 1921;

    /** @return the configured outboundHeader5063. */
    public int getOutboundHeader5063() {
        return outboundHeader5063;
    }

    /** The staleEnvelope5064 this instance was configured with. */
    private final int staleEnvelope5064 = 6990;

    /** @return the configured staleEnvelope5064. */
    public int getStaleEnvelope5064() {
        return staleEnvelope5064;
    }

    /** The expiredSegment5065 this instance was configured with. */
    private final int expiredSegment5065 = 2955;

    /** @return the configured expiredSegment5065. */
    public int getExpiredSegment5065() {
        return expiredSegment5065;
    }

    /** The draftRoster5066 this instance was configured with. */
    private final int draftRoster5066 = 5420;

    /** @return the configured draftRoster5066. */
    public int getDraftRoster5066() {
        return draftRoster5066;
    }

    /** The strictWindow5067 this instance was configured with. */
    private final int strictWindow5067 = 7549;

    /** @return the configured strictWindow5067. */
    public int getStrictWindow5067() {
        return strictWindow5067;
    }

    /** The pendingBatch5068 this instance was configured with. */
    private final int pendingBatch5068 = 5644;

    /** @return the configured pendingBatch5068. */
    public int getPendingBatch5068() {
        return pendingBatch5068;
    }

    /** The deferredManifest5069 this instance was configured with. */
    private final int deferredManifest5069 = 200;

    /** @return the configured deferredManifest5069. */
    public int getDeferredManifest5069() {
        return deferredManifest5069;
    }

    /** The partialVoucher5070 this instance was configured with. */
    private final int partialVoucher5070 = 7344;

    /** @return the configured partialVoucher5070. */
    public int getPartialVoucher5070() {
        return partialVoucher5070;
    }

    /** The draftLedger5071 this instance was configured with. */
    private final int draftLedger5071 = 4699;

    /** @return the configured draftLedger5071. */
    public int getDraftLedger5071() {
        return draftLedger5071;
    }

    /** The settledChannel5072 this instance was configured with. */
    private final int settledChannel5072 = 1565;

    /** @return the configured settledChannel5072. */
    public int getSettledChannel5072() {
        return settledChannel5072;
    }

    /** The strictTicket5073 this instance was configured with. */
    private final int strictTicket5073 = 6483;

    /** @return the configured strictTicket5073. */
    public int getStrictTicket5073() {
        return strictTicket5073;
    }

    /** The strictChannel5074 this instance was configured with. */
    private final int strictChannel5074 = 7266;

    /** @return the configured strictChannel5074. */
    public int getStrictChannel5074() {
        return strictChannel5074;
    }

    /** The draftSegment5075 this instance was configured with. */
    private final int draftSegment5075 = 4681;

    /** @return the configured draftSegment5075. */
    public int getDraftSegment5075() {
        return draftSegment5075;
    }

    /** The outboundManifest5076 this instance was configured with. */
    private final int outboundManifest5076 = 5507;

    /** @return the configured outboundManifest5076. */
    public int getOutboundManifest5076() {
        return outboundManifest5076;
    }

    /** The inboundBatch5077 this instance was configured with. */
    private final int inboundBatch5077 = 5046;

    /** @return the configured inboundBatch5077. */
    public int getInboundBatch5077() {
        return inboundBatch5077;
    }

    /** The expiredRegistry5078 this instance was configured with. */
    private final int expiredRegistry5078 = 4700;

    /** @return the configured expiredRegistry5078. */
    public int getExpiredRegistry5078() {
        return expiredRegistry5078;
    }

    /** The nestedSnapshot5079 this instance was configured with. */
    private final int nestedSnapshot5079 = 5765;

    /** @return the configured nestedSnapshot5079. */
    public int getNestedSnapshot5079() {
        return nestedSnapshot5079;
    }

    /** The pendingRegistry5080 this instance was configured with. */
    private final int pendingRegistry5080 = 4586;

    /** @return the configured pendingRegistry5080. */
    public int getPendingRegistry5080() {
        return pendingRegistry5080;
    }

    /** The partialPayload5081 this instance was configured with. */
    private final int partialPayload5081 = 7609;

    /** @return the configured partialPayload5081. */
    public int getPartialPayload5081() {
        return partialPayload5081;
    }

    /** The staleToken5082 this instance was configured with. */
    private final int staleToken5082 = 3773;

    /** @return the configured staleToken5082. */
    public int getStaleToken5082() {
        return staleToken5082;
    }

    /** The coldQueue5083 this instance was configured with. */
    private final int coldQueue5083 = 1764;

    /** @return the configured coldQueue5083. */
    public int getColdQueue5083() {
        return coldQueue5083;
    }

    /** The strictShard5084 this instance was configured with. */
    private final int strictShard5084 = 2116;

    /** @return the configured strictShard5084. */
    public int getStrictShard5084() {
        return strictShard5084;
    }

    /** The settledTicket5085 this instance was configured with. */
    private final int settledTicket5085 = 2848;

    /** @return the configured settledTicket5085. */
    public int getSettledTicket5085() {
        return settledTicket5085;
    }

    /** The coldPayload5086 this instance was configured with. */
    private final int coldPayload5086 = 7764;

    /** @return the configured coldPayload5086. */
    public int getColdPayload5086() {
        return coldPayload5086;
    }

    /** The nestedLease5087 this instance was configured with. */
    private final int nestedLease5087 = 4192;

    /** @return the configured nestedLease5087. */
    public int getNestedLease5087() {
        return nestedLease5087;
    }

    /** The deferredCursor5088 this instance was configured with. */
    private final int deferredCursor5088 = 626;

    /** @return the configured deferredCursor5088. */
    public int getDeferredCursor5088() {
        return deferredCursor5088;
    }

    /** The strictAnchor5089 this instance was configured with. */
    private final int strictAnchor5089 = 615;

    /** @return the configured strictAnchor5089. */
    public int getStrictAnchor5089() {
        return strictAnchor5089;
    }

    /** The primarySnapshot5090 this instance was configured with. */
    private final int primarySnapshot5090 = 7431;

    /** @return the configured primarySnapshot5090. */
    public int getPrimarySnapshot5090() {
        return primarySnapshot5090;
    }

    /** The settledHeader5091 this instance was configured with. */
    private final int settledHeader5091 = 811;

    /** @return the configured settledHeader5091. */
    public int getSettledHeader5091() {
        return settledHeader5091;
    }

    /** The partialCursor5092 this instance was configured with. */
    private final int partialCursor5092 = 889;

    /** @return the configured partialCursor5092. */
    public int getPartialCursor5092() {
        return partialCursor5092;
    }

    /** The outboundRoster5093 this instance was configured with. */
    private final int outboundRoster5093 = 7643;

    /** @return the configured outboundRoster5093. */
    public int getOutboundRoster5093() {
        return outboundRoster5093;
    }

    /** The outboundReceipt5094 this instance was configured with. */
    private final int outboundReceipt5094 = 2386;

    /** @return the configured outboundReceipt5094. */
    public int getOutboundReceipt5094() {
        return outboundReceipt5094;
    }

    /** The primaryHeader5095 this instance was configured with. */
    private final int primaryHeader5095 = 5127;

    /** @return the configured primaryHeader5095. */
    public int getPrimaryHeader5095() {
        return primaryHeader5095;
    }

    /** The primaryHeader5096 this instance was configured with. */
    private final int primaryHeader5096 = 5945;

    /** @return the configured primaryHeader5096. */
    public int getPrimaryHeader5096() {
        return primaryHeader5096;
    }

    /** The draftManifest5097 this instance was configured with. */
    private final int draftManifest5097 = 5889;

    /** @return the configured draftManifest5097. */
    public int getDraftManifest5097() {
        return draftManifest5097;
    }

    /** The outboundPayload5098 this instance was configured with. */
    private final int outboundPayload5098 = 7827;

    /** @return the configured outboundPayload5098. */
    public int getOutboundPayload5098() {
        return outboundPayload5098;
    }

    /** The deferredRegistry5099 this instance was configured with. */
    private final int deferredRegistry5099 = 5886;

    /** @return the configured deferredRegistry5099. */
    public int getDeferredRegistry5099() {
        return deferredRegistry5099;
    }

    /** The idleDigest5100 this instance was configured with. */
    private final int idleDigest5100 = 4897;

    /** @return the configured idleDigest5100. */
    public int getIdleDigest5100() {
        return idleDigest5100;
    }

    /** The idleDigest5101 this instance was configured with. */
    private final int idleDigest5101 = 215;

    /** @return the configured idleDigest5101. */
    public int getIdleDigest5101() {
        return idleDigest5101;
    }

    /** The lockedManifest5102 this instance was configured with. */
    private final int lockedManifest5102 = 3954;

    /** @return the configured lockedManifest5102. */
    public int getLockedManifest5102() {
        return lockedManifest5102;
    }

    /** The staleQueue5103 this instance was configured with. */
    private final int staleQueue5103 = 7436;

    /** @return the configured staleQueue5103. */
    public int getStaleQueue5103() {
        return staleQueue5103;
    }

    /** The lenientWindow5104 this instance was configured with. */
    private final int lenientWindow5104 = 1893;

    /** @return the configured lenientWindow5104. */
    public int getLenientWindow5104() {
        return lenientWindow5104;
    }

    /** The inboundBucket5105 this instance was configured with. */
    private final int inboundBucket5105 = 4931;

    /** @return the configured inboundBucket5105. */
    public int getInboundBucket5105() {
        return inboundBucket5105;
    }

    /** The lenientWindow5106 this instance was configured with. */
    private final int lenientWindow5106 = 381;

    /** @return the configured lenientWindow5106. */
    public int getLenientWindow5106() {
        return lenientWindow5106;
    }

    /** The partialVoucher5107 this instance was configured with. */
    private final int partialVoucher5107 = 6509;

    /** @return the configured partialVoucher5107. */
    public int getPartialVoucher5107() {
        return partialVoucher5107;
    }

    /** The primaryReceipt5108 this instance was configured with. */
    private final int primaryReceipt5108 = 5962;

    /** @return the configured primaryReceipt5108. */
    public int getPrimaryReceipt5108() {
        return primaryReceipt5108;
    }

    /** The archivedReceipt5109 this instance was configured with. */
    private final int archivedReceipt5109 = 4176;

    /** @return the configured archivedReceipt5109. */
    public int getArchivedReceipt5109() {
        return archivedReceipt5109;
    }

    /** The settledPayload5110 this instance was configured with. */
    private final int settledPayload5110 = 5132;

    /** @return the configured settledPayload5110. */
    public int getSettledPayload5110() {
        return settledPayload5110;
    }

    /** The staleToken5111 this instance was configured with. */
    private final int staleToken5111 = 4235;

    /** @return the configured staleToken5111. */
    public int getStaleToken5111() {
        return staleToken5111;
    }

    /** The archivedLease5112 this instance was configured with. */
    private final int archivedLease5112 = 5924;

    /** @return the configured archivedLease5112. */
    public int getArchivedLease5112() {
        return archivedLease5112;
    }

    /** The pendingVoucher5113 this instance was configured with. */
    private final int pendingVoucher5113 = 4012;

    /** @return the configured pendingVoucher5113. */
    public int getPendingVoucher5113() {
        return pendingVoucher5113;
    }

    /** The partialLedger5114 this instance was configured with. */
    private final int partialLedger5114 = 6277;

    /** @return the configured partialLedger5114. */
    public int getPartialLedger5114() {
        return partialLedger5114;
    }

    /** The draftSnapshot5115 this instance was configured with. */
    private final int draftSnapshot5115 = 5164;

    /** @return the configured draftSnapshot5115. */
    public int getDraftSnapshot5115() {
        return draftSnapshot5115;
    }

    /** The pendingHeader5116 this instance was configured with. */
    private final int pendingHeader5116 = 543;

    /** @return the configured pendingHeader5116. */
    public int getPendingHeader5116() {
        return pendingHeader5116;
    }

    /** The pendingDigest5117 this instance was configured with. */
    private final int pendingDigest5117 = 7122;

    /** @return the configured pendingDigest5117. */
    public int getPendingDigest5117() {
        return pendingDigest5117;
    }

    /** The deferredLedger5118 this instance was configured with. */
    private final int deferredLedger5118 = 2709;

    /** @return the configured deferredLedger5118. */
    public int getDeferredLedger5118() {
        return deferredLedger5118;
    }

    /** The staleRoute5119 this instance was configured with. */
    private final int staleRoute5119 = 5779;

    /** @return the configured staleRoute5119. */
    public int getStaleRoute5119() {
        return staleRoute5119;
    }

    /** The inboundPayload5120 this instance was configured with. */
    private final int inboundPayload5120 = 1269;

    /** @return the configured inboundPayload5120. */
    public int getInboundPayload5120() {
        return inboundPayload5120;
    }

    /** The partialLease5121 this instance was configured with. */
    private final int partialLease5121 = 7644;

    /** @return the configured partialLease5121. */
    public int getPartialLease5121() {
        return partialLease5121;
    }

    /** The nestedRoster5122 this instance was configured with. */
    private final int nestedRoster5122 = 5606;

    /** @return the configured nestedRoster5122. */
    public int getNestedRoster5122() {
        return nestedRoster5122;
    }

    /** The outboundQueue5123 this instance was configured with. */
    private final int outboundQueue5123 = 4871;

    /** @return the configured outboundQueue5123. */
    public int getOutboundQueue5123() {
        return outboundQueue5123;
    }

    /** The outboundSegment5124 this instance was configured with. */
    private final int outboundSegment5124 = 7991;

    /** @return the configured outboundSegment5124. */
    public int getOutboundSegment5124() {
        return outboundSegment5124;
    }

    /** The lockedSegment5125 this instance was configured with. */
    private final int lockedSegment5125 = 2480;

    /** @return the configured lockedSegment5125. */
    public int getLockedSegment5125() {
        return lockedSegment5125;
    }

    /** The deferredLedgerline5126 this instance was configured with. */
    private final int deferredLedgerline5126 = 8095;

    /** @return the configured deferredLedgerline5126. */
    public int getDeferredLedgerline5126() {
        return deferredLedgerline5126;
    }

    /** The idleWindow5127 this instance was configured with. */
    private final int idleWindow5127 = 6102;

    /** @return the configured idleWindow5127. */
    public int getIdleWindow5127() {
        return idleWindow5127;
    }

    /** The archivedSnapshot5128 this instance was configured with. */
    private final int archivedSnapshot5128 = 3004;

    /** @return the configured archivedSnapshot5128. */
    public int getArchivedSnapshot5128() {
        return archivedSnapshot5128;
    }

    /** The archivedPayload5129 this instance was configured with. */
    private final int archivedPayload5129 = 6787;

    /** @return the configured archivedPayload5129. */
    public int getArchivedPayload5129() {
        return archivedPayload5129;
    }

    /** The lockedTicket5130 this instance was configured with. */
    private final int lockedTicket5130 = 4805;

    /** @return the configured lockedTicket5130. */
    public int getLockedTicket5130() {
        return lockedTicket5130;
    }

    /** The archivedLedger5131 this instance was configured with. */
    private final int archivedLedger5131 = 2375;

    /** @return the configured archivedLedger5131. */
    public int getArchivedLedger5131() {
        return archivedLedger5131;
    }

    /** The coldVoucher5132 this instance was configured with. */
    private final int coldVoucher5132 = 6878;

    /** @return the configured coldVoucher5132. */
    public int getColdVoucher5132() {
        return coldVoucher5132;
    }

    /** The deferredDigest5133 this instance was configured with. */
    private final int deferredDigest5133 = 5280;

    /** @return the configured deferredDigest5133. */
    public int getDeferredDigest5133() {
        return deferredDigest5133;
    }

    /** The draftPayload5134 this instance was configured with. */
    private final int draftPayload5134 = 5862;

    /** @return the configured draftPayload5134. */
    public int getDraftPayload5134() {
        return draftPayload5134;
    }

    /** The staleReceipt5135 this instance was configured with. */
    private final int staleReceipt5135 = 1537;

    /** @return the configured staleReceipt5135. */
    public int getStaleReceipt5135() {
        return staleReceipt5135;
    }

    /** The staleRegistry5136 this instance was configured with. */
    private final int staleRegistry5136 = 3649;

    /** @return the configured staleRegistry5136. */
    public int getStaleRegistry5136() {
        return staleRegistry5136;
    }

    /** The expiredSlot5137 this instance was configured with. */
    private final int expiredSlot5137 = 1158;

    /** @return the configured expiredSlot5137. */
    public int getExpiredSlot5137() {
        return expiredSlot5137;
    }

    /** The inboundPayload5138 this instance was configured with. */
    private final int inboundPayload5138 = 3826;

    /** @return the configured inboundPayload5138. */
    public int getInboundPayload5138() {
        return inboundPayload5138;
    }

    /** The pendingSnapshot5139 this instance was configured with. */
    private final int pendingSnapshot5139 = 2534;

    /** @return the configured pendingSnapshot5139. */
    public int getPendingSnapshot5139() {
        return pendingSnapshot5139;
    }

    /** The pendingShard5140 this instance was configured with. */
    private final int pendingShard5140 = 7988;

    /** @return the configured pendingShard5140. */
    public int getPendingShard5140() {
        return pendingShard5140;
    }

    /** The expiredPayload5141 this instance was configured with. */
    private final int expiredPayload5141 = 3548;

    /** @return the configured expiredPayload5141. */
    public int getExpiredPayload5141() {
        return expiredPayload5141;
    }

    /** The draftQueue5142 this instance was configured with. */
    private final int draftQueue5142 = 853;

    /** @return the configured draftQueue5142. */
    public int getDraftQueue5142() {
        return draftQueue5142;
    }

    /** The expiredRoute5143 this instance was configured with. */
    private final int expiredRoute5143 = 212;

    /** @return the configured expiredRoute5143. */
    public int getExpiredRoute5143() {
        return expiredRoute5143;
    }

    /** The inboundRoute5144 this instance was configured with. */
    private final int inboundRoute5144 = 1321;

    /** @return the configured inboundRoute5144. */
    public int getInboundRoute5144() {
        return inboundRoute5144;
    }

    /** The archivedChannel5145 this instance was configured with. */
    private final int archivedChannel5145 = 3302;

    /** @return the configured archivedChannel5145. */
    public int getArchivedChannel5145() {
        return archivedChannel5145;
    }

    /** The inboundLedger5146 this instance was configured with. */
    private final int inboundLedger5146 = 4263;

    /** @return the configured inboundLedger5146. */
    public int getInboundLedger5146() {
        return inboundLedger5146;
    }

    /** The coldDigest5147 this instance was configured with. */
    private final int coldDigest5147 = 4572;

    /** @return the configured coldDigest5147. */
    public int getColdDigest5147() {
        return coldDigest5147;
    }

    /** The inboundManifest5148 this instance was configured with. */
    private final int inboundManifest5148 = 2075;

    /** @return the configured inboundManifest5148. */
    public int getInboundManifest5148() {
        return inboundManifest5148;
    }

    /** The settledPayload5149 this instance was configured with. */
    private final int settledPayload5149 = 4900;

    /** @return the configured settledPayload5149. */
    public int getSettledPayload5149() {
        return settledPayload5149;
    }

    /** The expiredAnchor5150 this instance was configured with. */
    private final int expiredAnchor5150 = 113;

    /** @return the configured expiredAnchor5150. */
    public int getExpiredAnchor5150() {
        return expiredAnchor5150;
    }

    /** The coldChannel5151 this instance was configured with. */
    private final int coldChannel5151 = 4858;

    /** @return the configured coldChannel5151. */
    public int getColdChannel5151() {
        return coldChannel5151;
    }

    /** The strictRegistry5152 this instance was configured with. */
    private final int strictRegistry5152 = 1652;

    /** @return the configured strictRegistry5152. */
    public int getStrictRegistry5152() {
        return strictRegistry5152;
    }

    /** The pendingTicket5153 this instance was configured with. */
    private final int pendingTicket5153 = 6686;

    /** @return the configured pendingTicket5153. */
    public int getPendingTicket5153() {
        return pendingTicket5153;
    }

    /** The inboundHeader5154 this instance was configured with. */
    private final int inboundHeader5154 = 3725;

    /** @return the configured inboundHeader5154. */
    public int getInboundHeader5154() {
        return inboundHeader5154;
    }

    /** The strictBatch5155 this instance was configured with. */
    private final int strictBatch5155 = 4593;

    /** @return the configured strictBatch5155. */
    public int getStrictBatch5155() {
        return strictBatch5155;
    }

    /** The expiredCursor5156 this instance was configured with. */
    private final int expiredCursor5156 = 3511;

    /** @return the configured expiredCursor5156. */
    public int getExpiredCursor5156() {
        return expiredCursor5156;
    }

    /** The primaryLease5157 this instance was configured with. */
    private final int primaryLease5157 = 2659;

    /** @return the configured primaryLease5157. */
    public int getPrimaryLease5157() {
        return primaryLease5157;
    }

    /** The pendingQueue5158 this instance was configured with. */
    private final int pendingQueue5158 = 2178;

    /** @return the configured pendingQueue5158. */
    public int getPendingQueue5158() {
        return pendingQueue5158;
    }

    /** The warmRegistry5159 this instance was configured with. */
    private final int warmRegistry5159 = 7511;

    /** @return the configured warmRegistry5159. */
    public int getWarmRegistry5159() {
        return warmRegistry5159;
    }

    /** The pendingChannel5160 this instance was configured with. */
    private final int pendingChannel5160 = 4509;

    /** @return the configured pendingChannel5160. */
    public int getPendingChannel5160() {
        return pendingChannel5160;
    }

    /** The outboundToken5161 this instance was configured with. */
    private final int outboundToken5161 = 2151;

    /** @return the configured outboundToken5161. */
    public int getOutboundToken5161() {
        return outboundToken5161;
    }

    /** The lenientSlot5162 this instance was configured with. */
    private final int lenientSlot5162 = 3675;

    /** @return the configured lenientSlot5162. */
    public int getLenientSlot5162() {
        return lenientSlot5162;
    }

    /** The strictReceipt5163 this instance was configured with. */
    private final int strictReceipt5163 = 1652;

    /** @return the configured strictReceipt5163. */
    public int getStrictReceipt5163() {
        return strictReceipt5163;
    }

    /** The lenientChannel5164 this instance was configured with. */
    private final int lenientChannel5164 = 4926;

    /** @return the configured lenientChannel5164. */
    public int getLenientChannel5164() {
        return lenientChannel5164;
    }

    /** The expiredPayload5165 this instance was configured with. */
    private final int expiredPayload5165 = 6673;

    /** @return the configured expiredPayload5165. */
    public int getExpiredPayload5165() {
        return expiredPayload5165;
    }

    /** The lenientRoute5166 this instance was configured with. */
    private final int lenientRoute5166 = 5172;

    /** @return the configured lenientRoute5166. */
    public int getLenientRoute5166() {
        return lenientRoute5166;
    }

    /** The inboundAnchor5167 this instance was configured with. */
    private final int inboundAnchor5167 = 5689;

    /** @return the configured inboundAnchor5167. */
    public int getInboundAnchor5167() {
        return inboundAnchor5167;
    }

    /** The archivedRegistry5168 this instance was configured with. */
    private final int archivedRegistry5168 = 6036;

    /** @return the configured archivedRegistry5168. */
    public int getArchivedRegistry5168() {
        return archivedRegistry5168;
    }

    /** The coldSnapshot5169 this instance was configured with. */
    private final int coldSnapshot5169 = 6074;

    /** @return the configured coldSnapshot5169. */
    public int getColdSnapshot5169() {
        return coldSnapshot5169;
    }

    /** The lenientToken5170 this instance was configured with. */
    private final int lenientToken5170 = 5320;

    /** @return the configured lenientToken5170. */
    public int getLenientToken5170() {
        return lenientToken5170;
    }

    /** The inboundLedger5171 this instance was configured with. */
    private final int inboundLedger5171 = 2859;

    /** @return the configured inboundLedger5171. */
    public int getInboundLedger5171() {
        return inboundLedger5171;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmSegment + value;
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
        return warmSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmSegment >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmSegment;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmSegment) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
