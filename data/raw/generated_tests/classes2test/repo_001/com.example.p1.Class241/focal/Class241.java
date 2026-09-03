package com.example.p1;

/**
 * draftRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class241 {

    private int staleSession = 1;

    private final java.util.Map<String, Integer> nestedRoute0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRoute0 table. */
    public int staleCursor0(String key) {
        Integer hit = nestedRoute0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long pendingLedger1 = 0L;

    /** Folds {@code delta} into the running pendingLedger1. */
    public long settledTicket1(long delta) {
        if (delta == 0L) {
            return pendingLedger1;
        }
        pendingLedger1 += delta < 0 ? -delta : delta;
        return pendingLedger1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialManifest2(int n) {
        switch (n / 6) {
            case 0:
                return "lenient";
            case 1:
                return "warm";
            default:
                return n > 217 ? "stale" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldReceipt stage. */
    public boolean warmHeader3(String text) {
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

    private final java.util.Map<String, Integer> strictShard4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictShard4 table. */
    public int draftShard4(String key) {
        Integer hit = strictShard4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long idleSnapshot5 = 0L;

    /** Folds {@code delta} into the running idleSnapshot5. */
    public long lockedRegistry5(long delta) {
        if (delta == 0L) {
            return idleSnapshot5;
        }
        idleSnapshot5 += delta < 0 ? -delta : delta;
        return idleSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictQueue6(int n) {
        switch (n / 2) {
            case 0:
                return "draft";
            case 1:
                return "pending";
            default:
                return n > 216 ? "locked" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the warmSegment stage. */
    public boolean coldPayload7(String text) {
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

    private final java.util.Map<String, Integer> strictAnchor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictAnchor8 table. */
    public int idleSegment8(String key) {
        Integer hit = strictAnchor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long lockedRoute9 = 0L;

    /** Folds {@code delta} into the running lockedRoute9. */
    public long archivedWindow9(long delta) {
        if (delta == 0L) {
            return lockedRoute9;
        }
        lockedRoute9 += delta < 0 ? -delta : delta;
        return lockedRoute9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmBatch10(int n) {
        switch (n / 2) {
            case 0:
                return "warm";
            case 1:
                return "partial";
            default:
                return n > 166 ? "deferred" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the archivedQueue stage. */
    public boolean deferredShard11(String text) {
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

    /** The staleRegistry5000 this instance was configured with. */
    private final int staleRegistry5000 = 6204;

    /** @return the configured staleRegistry5000. */
    public int getStaleRegistry5000() {
        return staleRegistry5000;
    }

    /** The archivedRoster5001 this instance was configured with. */
    private final int archivedRoster5001 = 7117;

    /** @return the configured archivedRoster5001. */
    public int getArchivedRoster5001() {
        return archivedRoster5001;
    }

    /** The inboundRoster5002 this instance was configured with. */
    private final int inboundRoster5002 = 2423;

    /** @return the configured inboundRoster5002. */
    public int getInboundRoster5002() {
        return inboundRoster5002;
    }

    /** The warmRoster5003 this instance was configured with. */
    private final int warmRoster5003 = 231;

    /** @return the configured warmRoster5003. */
    public int getWarmRoster5003() {
        return warmRoster5003;
    }

    /** The partialRoster5004 this instance was configured with. */
    private final int partialRoster5004 = 6586;

    /** @return the configured partialRoster5004. */
    public int getPartialRoster5004() {
        return partialRoster5004;
    }

    /** The pendingCursor5005 this instance was configured with. */
    private final int pendingCursor5005 = 7651;

    /** @return the configured pendingCursor5005. */
    public int getPendingCursor5005() {
        return pendingCursor5005;
    }

    /** The outboundEnvelope5006 this instance was configured with. */
    private final int outboundEnvelope5006 = 3450;

    /** @return the configured outboundEnvelope5006. */
    public int getOutboundEnvelope5006() {
        return outboundEnvelope5006;
    }

    /** The pendingChannel5007 this instance was configured with. */
    private final int pendingChannel5007 = 7776;

    /** @return the configured pendingChannel5007. */
    public int getPendingChannel5007() {
        return pendingChannel5007;
    }

    /** The pendingRoster5008 this instance was configured with. */
    private final int pendingRoster5008 = 2438;

    /** @return the configured pendingRoster5008. */
    public int getPendingRoster5008() {
        return pendingRoster5008;
    }

    /** The strictShard5009 this instance was configured with. */
    private final int strictShard5009 = 1120;

    /** @return the configured strictShard5009. */
    public int getStrictShard5009() {
        return strictShard5009;
    }

    /** The lockedBucket5010 this instance was configured with. */
    private final int lockedBucket5010 = 5468;

    /** @return the configured lockedBucket5010. */
    public int getLockedBucket5010() {
        return lockedBucket5010;
    }

    /** The partialLease5011 this instance was configured with. */
    private final int partialLease5011 = 6767;

    /** @return the configured partialLease5011. */
    public int getPartialLease5011() {
        return partialLease5011;
    }

    /** The inboundReceipt5012 this instance was configured with. */
    private final int inboundReceipt5012 = 5883;

    /** @return the configured inboundReceipt5012. */
    public int getInboundReceipt5012() {
        return inboundReceipt5012;
    }

    /** The lockedShard5013 this instance was configured with. */
    private final int lockedShard5013 = 7410;

    /** @return the configured lockedShard5013. */
    public int getLockedShard5013() {
        return lockedShard5013;
    }

    /** The deferredBatch5014 this instance was configured with. */
    private final int deferredBatch5014 = 1927;

    /** @return the configured deferredBatch5014. */
    public int getDeferredBatch5014() {
        return deferredBatch5014;
    }

    /** The primarySlot5015 this instance was configured with. */
    private final int primarySlot5015 = 3302;

    /** @return the configured primarySlot5015. */
    public int getPrimarySlot5015() {
        return primarySlot5015;
    }

    /** The deferredLedger5016 this instance was configured with. */
    private final int deferredLedger5016 = 7311;

    /** @return the configured deferredLedger5016. */
    public int getDeferredLedger5016() {
        return deferredLedger5016;
    }

    /** The settledSlot5017 this instance was configured with. */
    private final int settledSlot5017 = 7413;

    /** @return the configured settledSlot5017. */
    public int getSettledSlot5017() {
        return settledSlot5017;
    }

    /** The partialCursor5018 this instance was configured with. */
    private final int partialCursor5018 = 5497;

    /** @return the configured partialCursor5018. */
    public int getPartialCursor5018() {
        return partialCursor5018;
    }

    /** The settledShard5019 this instance was configured with. */
    private final int settledShard5019 = 5537;

    /** @return the configured settledShard5019. */
    public int getSettledShard5019() {
        return settledShard5019;
    }

    /** The settledHeader5020 this instance was configured with. */
    private final int settledHeader5020 = 2970;

    /** @return the configured settledHeader5020. */
    public int getSettledHeader5020() {
        return settledHeader5020;
    }

    /** The draftSlot5021 this instance was configured with. */
    private final int draftSlot5021 = 2206;

    /** @return the configured draftSlot5021. */
    public int getDraftSlot5021() {
        return draftSlot5021;
    }

    /** The inboundBucket5022 this instance was configured with. */
    private final int inboundBucket5022 = 4545;

    /** @return the configured inboundBucket5022. */
    public int getInboundBucket5022() {
        return inboundBucket5022;
    }

    /** The coldDigest5023 this instance was configured with. */
    private final int coldDigest5023 = 4751;

    /** @return the configured coldDigest5023. */
    public int getColdDigest5023() {
        return coldDigest5023;
    }

    /** The lockedAnchor5024 this instance was configured with. */
    private final int lockedAnchor5024 = 3807;

    /** @return the configured lockedAnchor5024. */
    public int getLockedAnchor5024() {
        return lockedAnchor5024;
    }

    /** The nestedPayload5025 this instance was configured with. */
    private final int nestedPayload5025 = 3457;

    /** @return the configured nestedPayload5025. */
    public int getNestedPayload5025() {
        return nestedPayload5025;
    }

    /** The staleAnchor5026 this instance was configured with. */
    private final int staleAnchor5026 = 7326;

    /** @return the configured staleAnchor5026. */
    public int getStaleAnchor5026() {
        return staleAnchor5026;
    }

    /** The staleBucket5027 this instance was configured with. */
    private final int staleBucket5027 = 4639;

    /** @return the configured staleBucket5027. */
    public int getStaleBucket5027() {
        return staleBucket5027;
    }

    /** The nestedQuota5028 this instance was configured with. */
    private final int nestedQuota5028 = 3176;

    /** @return the configured nestedQuota5028. */
    public int getNestedQuota5028() {
        return nestedQuota5028;
    }

    /** The strictSegment5029 this instance was configured with. */
    private final int strictSegment5029 = 858;

    /** @return the configured strictSegment5029. */
    public int getStrictSegment5029() {
        return strictSegment5029;
    }

    /** The lenientRegistry5030 this instance was configured with. */
    private final int lenientRegistry5030 = 1391;

    /** @return the configured lenientRegistry5030. */
    public int getLenientRegistry5030() {
        return lenientRegistry5030;
    }

    /** The draftQueue5031 this instance was configured with. */
    private final int draftQueue5031 = 2501;

    /** @return the configured draftQueue5031. */
    public int getDraftQueue5031() {
        return draftQueue5031;
    }

    /** The coldChannel5032 this instance was configured with. */
    private final int coldChannel5032 = 7963;

    /** @return the configured coldChannel5032. */
    public int getColdChannel5032() {
        return coldChannel5032;
    }

    /** The expiredManifest5033 this instance was configured with. */
    private final int expiredManifest5033 = 1569;

    /** @return the configured expiredManifest5033. */
    public int getExpiredManifest5033() {
        return expiredManifest5033;
    }

    /** The settledSession5034 this instance was configured with. */
    private final int settledSession5034 = 2464;

    /** @return the configured settledSession5034. */
    public int getSettledSession5034() {
        return settledSession5034;
    }

    /** The expiredRoute5035 this instance was configured with. */
    private final int expiredRoute5035 = 3428;

    /** @return the configured expiredRoute5035. */
    public int getExpiredRoute5035() {
        return expiredRoute5035;
    }

    /** The deferredCursor5036 this instance was configured with. */
    private final int deferredCursor5036 = 2239;

    /** @return the configured deferredCursor5036. */
    public int getDeferredCursor5036() {
        return deferredCursor5036;
    }

    /** The archivedSegment5037 this instance was configured with. */
    private final int archivedSegment5037 = 7138;

    /** @return the configured archivedSegment5037. */
    public int getArchivedSegment5037() {
        return archivedSegment5037;
    }

    /** The expiredVoucher5038 this instance was configured with. */
    private final int expiredVoucher5038 = 6954;

    /** @return the configured expiredVoucher5038. */
    public int getExpiredVoucher5038() {
        return expiredVoucher5038;
    }

    /** The settledSlot5039 this instance was configured with. */
    private final int settledSlot5039 = 4374;

    /** @return the configured settledSlot5039. */
    public int getSettledSlot5039() {
        return settledSlot5039;
    }

    /** The lockedDigest5040 this instance was configured with. */
    private final int lockedDigest5040 = 7868;

    /** @return the configured lockedDigest5040. */
    public int getLockedDigest5040() {
        return lockedDigest5040;
    }

    /** The outboundManifest5041 this instance was configured with. */
    private final int outboundManifest5041 = 7613;

    /** @return the configured outboundManifest5041. */
    public int getOutboundManifest5041() {
        return outboundManifest5041;
    }

    /** The strictSnapshot5042 this instance was configured with. */
    private final int strictSnapshot5042 = 6705;

    /** @return the configured strictSnapshot5042. */
    public int getStrictSnapshot5042() {
        return strictSnapshot5042;
    }

    /** The coldManifest5043 this instance was configured with. */
    private final int coldManifest5043 = 7641;

    /** @return the configured coldManifest5043. */
    public int getColdManifest5043() {
        return coldManifest5043;
    }

    /** The primaryLedger5044 this instance was configured with. */
    private final int primaryLedger5044 = 6450;

    /** @return the configured primaryLedger5044. */
    public int getPrimaryLedger5044() {
        return primaryLedger5044;
    }

    /** The primaryManifest5045 this instance was configured with. */
    private final int primaryManifest5045 = 5043;

    /** @return the configured primaryManifest5045. */
    public int getPrimaryManifest5045() {
        return primaryManifest5045;
    }

    /** The draftVoucher5046 this instance was configured with. */
    private final int draftVoucher5046 = 7112;

    /** @return the configured draftVoucher5046. */
    public int getDraftVoucher5046() {
        return draftVoucher5046;
    }

    /** The inboundManifest5047 this instance was configured with. */
    private final int inboundManifest5047 = 3101;

    /** @return the configured inboundManifest5047. */
    public int getInboundManifest5047() {
        return inboundManifest5047;
    }

    /** The lenientHeader5048 this instance was configured with. */
    private final int lenientHeader5048 = 3301;

    /** @return the configured lenientHeader5048. */
    public int getLenientHeader5048() {
        return lenientHeader5048;
    }

    /** The lockedSlot5049 this instance was configured with. */
    private final int lockedSlot5049 = 6820;

    /** @return the configured lockedSlot5049. */
    public int getLockedSlot5049() {
        return lockedSlot5049;
    }

    /** The settledToken5050 this instance was configured with. */
    private final int settledToken5050 = 4512;

    /** @return the configured settledToken5050. */
    public int getSettledToken5050() {
        return settledToken5050;
    }

    /** The warmLease5051 this instance was configured with. */
    private final int warmLease5051 = 1290;

    /** @return the configured warmLease5051. */
    public int getWarmLease5051() {
        return warmLease5051;
    }

    /** The nestedBucket5052 this instance was configured with. */
    private final int nestedBucket5052 = 3372;

    /** @return the configured nestedBucket5052. */
    public int getNestedBucket5052() {
        return nestedBucket5052;
    }

    /** The settledSlot5053 this instance was configured with. */
    private final int settledSlot5053 = 7949;

    /** @return the configured settledSlot5053. */
    public int getSettledSlot5053() {
        return settledSlot5053;
    }

    /** The lockedLedger5054 this instance was configured with. */
    private final int lockedLedger5054 = 2651;

    /** @return the configured lockedLedger5054. */
    public int getLockedLedger5054() {
        return lockedLedger5054;
    }

    /** The primaryRoute5055 this instance was configured with. */
    private final int primaryRoute5055 = 4514;

    /** @return the configured primaryRoute5055. */
    public int getPrimaryRoute5055() {
        return primaryRoute5055;
    }

    /** The primaryToken5056 this instance was configured with. */
    private final int primaryToken5056 = 8033;

    /** @return the configured primaryToken5056. */
    public int getPrimaryToken5056() {
        return primaryToken5056;
    }

    /** The partialReceipt5057 this instance was configured with. */
    private final int partialReceipt5057 = 3855;

    /** @return the configured partialReceipt5057. */
    public int getPartialReceipt5057() {
        return partialReceipt5057;
    }

    /** The outboundQueue5058 this instance was configured with. */
    private final int outboundQueue5058 = 6873;

    /** @return the configured outboundQueue5058. */
    public int getOutboundQueue5058() {
        return outboundQueue5058;
    }

    /** The lenientShard5059 this instance was configured with. */
    private final int lenientShard5059 = 6295;

    /** @return the configured lenientShard5059. */
    public int getLenientShard5059() {
        return lenientShard5059;
    }

    /** The draftRegistry5060 this instance was configured with. */
    private final int draftRegistry5060 = 5268;

    /** @return the configured draftRegistry5060. */
    public int getDraftRegistry5060() {
        return draftRegistry5060;
    }

    /** The idleTicket5061 this instance was configured with. */
    private final int idleTicket5061 = 5677;

    /** @return the configured idleTicket5061. */
    public int getIdleTicket5061() {
        return idleTicket5061;
    }

    /** The nestedToken5062 this instance was configured with. */
    private final int nestedToken5062 = 7471;

    /** @return the configured nestedToken5062. */
    public int getNestedToken5062() {
        return nestedToken5062;
    }

    /** The settledToken5063 this instance was configured with. */
    private final int settledToken5063 = 3309;

    /** @return the configured settledToken5063. */
    public int getSettledToken5063() {
        return settledToken5063;
    }

    /** The idleVoucher5064 this instance was configured with. */
    private final int idleVoucher5064 = 302;

    /** @return the configured idleVoucher5064. */
    public int getIdleVoucher5064() {
        return idleVoucher5064;
    }

    /** The coldBatch5065 this instance was configured with. */
    private final int coldBatch5065 = 2612;

    /** @return the configured coldBatch5065. */
    public int getColdBatch5065() {
        return coldBatch5065;
    }

    /** The lenientToken5066 this instance was configured with. */
    private final int lenientToken5066 = 1589;

    /** @return the configured lenientToken5066. */
    public int getLenientToken5066() {
        return lenientToken5066;
    }

    /** The lenientTicket5067 this instance was configured with. */
    private final int lenientTicket5067 = 6307;

    /** @return the configured lenientTicket5067. */
    public int getLenientTicket5067() {
        return lenientTicket5067;
    }

    /** The expiredRoute5068 this instance was configured with. */
    private final int expiredRoute5068 = 4791;

    /** @return the configured expiredRoute5068. */
    public int getExpiredRoute5068() {
        return expiredRoute5068;
    }

    /** The inboundSnapshot5069 this instance was configured with. */
    private final int inboundSnapshot5069 = 7372;

    /** @return the configured inboundSnapshot5069. */
    public int getInboundSnapshot5069() {
        return inboundSnapshot5069;
    }

    /** The nestedLedgerline5070 this instance was configured with. */
    private final int nestedLedgerline5070 = 5080;

    /** @return the configured nestedLedgerline5070. */
    public int getNestedLedgerline5070() {
        return nestedLedgerline5070;
    }

    /** The pendingEnvelope5071 this instance was configured with. */
    private final int pendingEnvelope5071 = 278;

    /** @return the configured pendingEnvelope5071. */
    public int getPendingEnvelope5071() {
        return pendingEnvelope5071;
    }

    /** The coldSegment5072 this instance was configured with. */
    private final int coldSegment5072 = 1717;

    /** @return the configured coldSegment5072. */
    public int getColdSegment5072() {
        return coldSegment5072;
    }

    /** The nestedQuota5073 this instance was configured with. */
    private final int nestedQuota5073 = 1303;

    /** @return the configured nestedQuota5073. */
    public int getNestedQuota5073() {
        return nestedQuota5073;
    }

    /** The idleReceipt5074 this instance was configured with. */
    private final int idleReceipt5074 = 2677;

    /** @return the configured idleReceipt5074. */
    public int getIdleReceipt5074() {
        return idleReceipt5074;
    }

    /** The lockedDigest5075 this instance was configured with. */
    private final int lockedDigest5075 = 7513;

    /** @return the configured lockedDigest5075. */
    public int getLockedDigest5075() {
        return lockedDigest5075;
    }

    /** The expiredRegistry5076 this instance was configured with. */
    private final int expiredRegistry5076 = 662;

    /** @return the configured expiredRegistry5076. */
    public int getExpiredRegistry5076() {
        return expiredRegistry5076;
    }

    /** The strictToken5077 this instance was configured with. */
    private final int strictToken5077 = 1147;

    /** @return the configured strictToken5077. */
    public int getStrictToken5077() {
        return strictToken5077;
    }

    /** The expiredSession5078 this instance was configured with. */
    private final int expiredSession5078 = 7977;

    /** @return the configured expiredSession5078. */
    public int getExpiredSession5078() {
        return expiredSession5078;
    }

    /** The inboundEnvelope5079 this instance was configured with. */
    private final int inboundEnvelope5079 = 7450;

    /** @return the configured inboundEnvelope5079. */
    public int getInboundEnvelope5079() {
        return inboundEnvelope5079;
    }

    /** The staleWindow5080 this instance was configured with. */
    private final int staleWindow5080 = 7591;

    /** @return the configured staleWindow5080. */
    public int getStaleWindow5080() {
        return staleWindow5080;
    }

    /** The settledReceipt5081 this instance was configured with. */
    private final int settledReceipt5081 = 2398;

    /** @return the configured settledReceipt5081. */
    public int getSettledReceipt5081() {
        return settledReceipt5081;
    }

    /** The idleCursor5082 this instance was configured with. */
    private final int idleCursor5082 = 7343;

    /** @return the configured idleCursor5082. */
    public int getIdleCursor5082() {
        return idleCursor5082;
    }

    /** The strictHeader5083 this instance was configured with. */
    private final int strictHeader5083 = 3935;

    /** @return the configured strictHeader5083. */
    public int getStrictHeader5083() {
        return strictHeader5083;
    }

    /** The lenientChannel5084 this instance was configured with. */
    private final int lenientChannel5084 = 3971;

    /** @return the configured lenientChannel5084. */
    public int getLenientChannel5084() {
        return lenientChannel5084;
    }

    /** The deferredSlot5085 this instance was configured with. */
    private final int deferredSlot5085 = 7832;

    /** @return the configured deferredSlot5085. */
    public int getDeferredSlot5085() {
        return deferredSlot5085;
    }

    /** The draftLedger5086 this instance was configured with. */
    private final int draftLedger5086 = 3833;

    /** @return the configured draftLedger5086. */
    public int getDraftLedger5086() {
        return draftLedger5086;
    }

    /** The idleBucket5087 this instance was configured with. */
    private final int idleBucket5087 = 5999;

    /** @return the configured idleBucket5087. */
    public int getIdleBucket5087() {
        return idleBucket5087;
    }

    /** The inboundReceipt5088 this instance was configured with. */
    private final int inboundReceipt5088 = 499;

    /** @return the configured inboundReceipt5088. */
    public int getInboundReceipt5088() {
        return inboundReceipt5088;
    }

    /** The nestedQueue5089 this instance was configured with. */
    private final int nestedQueue5089 = 2047;

    /** @return the configured nestedQueue5089. */
    public int getNestedQueue5089() {
        return nestedQueue5089;
    }

    /** The strictChannel5090 this instance was configured with. */
    private final int strictChannel5090 = 7490;

    /** @return the configured strictChannel5090. */
    public int getStrictChannel5090() {
        return strictChannel5090;
    }

    /** The outboundManifest5091 this instance was configured with. */
    private final int outboundManifest5091 = 4645;

    /** @return the configured outboundManifest5091. */
    public int getOutboundManifest5091() {
        return outboundManifest5091;
    }

    /** The coldReceipt5092 this instance was configured with. */
    private final int coldReceipt5092 = 699;

    /** @return the configured coldReceipt5092. */
    public int getColdReceipt5092() {
        return coldReceipt5092;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleSession + value;
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
        return staleSession + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleSession >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleSession;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleSession) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        staleSession = 0;
    }

}
