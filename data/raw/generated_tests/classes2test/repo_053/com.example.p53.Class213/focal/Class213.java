package com.example.p53;

/**
 * draftShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class213 {

    private int idleVoucher = 1;

    private final java.util.Map<String, Integer> nestedAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedAnchor0 table. */
    public int settledAnchor0(String key) {
        Integer hit = nestedAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long coldLedger1 = 0L;

    /** Folds {@code delta} into the running coldLedger1. */
    public long inboundPayload1(long delta) {
        if (delta == 0L) {
            return coldLedger1;
        }
        coldLedger1 += delta < 0 ? -delta : delta;
        return coldLedger1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedReceipt2(int n) {
        switch (n / 3) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 276 ? "cold" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the outboundBucket stage. */
    public boolean strictLease3(String text) {
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

    private final java.util.Map<String, Integer> staleRegistry4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleRegistry4 table. */
    public int warmSession4(String key) {
        Integer hit = staleRegistry4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long nestedRoute5 = 0L;

    /** Folds {@code delta} into the running nestedRoute5. */
    public long warmShard5(long delta) {
        if (delta == 0L) {
            return nestedRoute5;
        }
        nestedRoute5 += delta < 0 ? -delta : delta;
        return nestedRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftDigest6(int n) {
        switch (n / 11) {
            case 0:
                return "stale";
            case 1:
                return "idle";
            default:
                return n > 310 ? "strict" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the outboundSession stage. */
    public boolean deferredQueue7(String text) {
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

    private final java.util.Map<String, Integer> archivedQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedQuota8 table. */
    public int archivedLease8(String key) {
        Integer hit = archivedQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long partialChannel9 = 0L;

    /** Folds {@code delta} into the running partialChannel9. */
    public long lockedReceipt9(long delta) {
        if (delta == 0L) {
            return partialChannel9;
        }
        partialChannel9 += delta < 0 ? -delta : delta;
        return partialChannel9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftBucket10(int n) {
        switch (n / 8) {
            case 0:
                return "idle";
            case 1:
                return "archived";
            default:
                return n > 330 ? "expired" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the expiredSlot stage. */
    public boolean archivedManifest11(String text) {
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

    /** The archivedDigest5000 this instance was configured with. */
    private final int archivedDigest5000 = 3578;

    /** @return the configured archivedDigest5000. */
    public int getArchivedDigest5000() {
        return archivedDigest5000;
    }

    /** The partialLease5001 this instance was configured with. */
    private final int partialLease5001 = 6063;

    /** @return the configured partialLease5001. */
    public int getPartialLease5001() {
        return partialLease5001;
    }

    /** The coldRegistry5002 this instance was configured with. */
    private final int coldRegistry5002 = 4590;

    /** @return the configured coldRegistry5002. */
    public int getColdRegistry5002() {
        return coldRegistry5002;
    }

    /** The partialManifest5003 this instance was configured with. */
    private final int partialManifest5003 = 7825;

    /** @return the configured partialManifest5003. */
    public int getPartialManifest5003() {
        return partialManifest5003;
    }

    /** The settledBucket5004 this instance was configured with. */
    private final int settledBucket5004 = 6284;

    /** @return the configured settledBucket5004. */
    public int getSettledBucket5004() {
        return settledBucket5004;
    }

    /** The primaryLedger5005 this instance was configured with. */
    private final int primaryLedger5005 = 6628;

    /** @return the configured primaryLedger5005. */
    public int getPrimaryLedger5005() {
        return primaryLedger5005;
    }

    /** The coldRoute5006 this instance was configured with. */
    private final int coldRoute5006 = 3195;

    /** @return the configured coldRoute5006. */
    public int getColdRoute5006() {
        return coldRoute5006;
    }

    /** The primaryLedgerline5007 this instance was configured with. */
    private final int primaryLedgerline5007 = 924;

    /** @return the configured primaryLedgerline5007. */
    public int getPrimaryLedgerline5007() {
        return primaryLedgerline5007;
    }

    /** The pendingToken5008 this instance was configured with. */
    private final int pendingToken5008 = 6632;

    /** @return the configured pendingToken5008. */
    public int getPendingToken5008() {
        return pendingToken5008;
    }

    /** The warmCursor5009 this instance was configured with. */
    private final int warmCursor5009 = 547;

    /** @return the configured warmCursor5009. */
    public int getWarmCursor5009() {
        return warmCursor5009;
    }

    /** The outboundShard5010 this instance was configured with. */
    private final int outboundShard5010 = 2283;

    /** @return the configured outboundShard5010. */
    public int getOutboundShard5010() {
        return outboundShard5010;
    }

    /** The idleLease5011 this instance was configured with. */
    private final int idleLease5011 = 293;

    /** @return the configured idleLease5011. */
    public int getIdleLease5011() {
        return idleLease5011;
    }

    /** The warmAnchor5012 this instance was configured with. */
    private final int warmAnchor5012 = 5683;

    /** @return the configured warmAnchor5012. */
    public int getWarmAnchor5012() {
        return warmAnchor5012;
    }

    /** The strictShard5013 this instance was configured with. */
    private final int strictShard5013 = 7667;

    /** @return the configured strictShard5013. */
    public int getStrictShard5013() {
        return strictShard5013;
    }

    /** The idleReceipt5014 this instance was configured with. */
    private final int idleReceipt5014 = 2110;

    /** @return the configured idleReceipt5014. */
    public int getIdleReceipt5014() {
        return idleReceipt5014;
    }

    /** The nestedQueue5015 this instance was configured with. */
    private final int nestedQueue5015 = 4185;

    /** @return the configured nestedQueue5015. */
    public int getNestedQueue5015() {
        return nestedQueue5015;
    }

    /** The archivedChannel5016 this instance was configured with. */
    private final int archivedChannel5016 = 3206;

    /** @return the configured archivedChannel5016. */
    public int getArchivedChannel5016() {
        return archivedChannel5016;
    }

    /** The lenientRegistry5017 this instance was configured with. */
    private final int lenientRegistry5017 = 724;

    /** @return the configured lenientRegistry5017. */
    public int getLenientRegistry5017() {
        return lenientRegistry5017;
    }

    /** The settledAnchor5018 this instance was configured with. */
    private final int settledAnchor5018 = 6588;

    /** @return the configured settledAnchor5018. */
    public int getSettledAnchor5018() {
        return settledAnchor5018;
    }

    /** The idleBatch5019 this instance was configured with. */
    private final int idleBatch5019 = 3917;

    /** @return the configured idleBatch5019. */
    public int getIdleBatch5019() {
        return idleBatch5019;
    }

    /** The expiredBatch5020 this instance was configured with. */
    private final int expiredBatch5020 = 6148;

    /** @return the configured expiredBatch5020. */
    public int getExpiredBatch5020() {
        return expiredBatch5020;
    }

    /** The coldPayload5021 this instance was configured with. */
    private final int coldPayload5021 = 3472;

    /** @return the configured coldPayload5021. */
    public int getColdPayload5021() {
        return coldPayload5021;
    }

    /** The settledRegistry5022 this instance was configured with. */
    private final int settledRegistry5022 = 4185;

    /** @return the configured settledRegistry5022. */
    public int getSettledRegistry5022() {
        return settledRegistry5022;
    }

    /** The strictShard5023 this instance was configured with. */
    private final int strictShard5023 = 2185;

    /** @return the configured strictShard5023. */
    public int getStrictShard5023() {
        return strictShard5023;
    }

    /** The staleSnapshot5024 this instance was configured with. */
    private final int staleSnapshot5024 = 6523;

    /** @return the configured staleSnapshot5024. */
    public int getStaleSnapshot5024() {
        return staleSnapshot5024;
    }

    /** The lockedQuota5025 this instance was configured with. */
    private final int lockedQuota5025 = 5976;

    /** @return the configured lockedQuota5025. */
    public int getLockedQuota5025() {
        return lockedQuota5025;
    }

    /** The archivedToken5026 this instance was configured with. */
    private final int archivedToken5026 = 6354;

    /** @return the configured archivedToken5026. */
    public int getArchivedToken5026() {
        return archivedToken5026;
    }

    /** The primarySession5027 this instance was configured with. */
    private final int primarySession5027 = 2442;

    /** @return the configured primarySession5027. */
    public int getPrimarySession5027() {
        return primarySession5027;
    }

    /** The expiredVoucher5028 this instance was configured with. */
    private final int expiredVoucher5028 = 5912;

    /** @return the configured expiredVoucher5028. */
    public int getExpiredVoucher5028() {
        return expiredVoucher5028;
    }

    /** The expiredQueue5029 this instance was configured with. */
    private final int expiredQueue5029 = 3901;

    /** @return the configured expiredQueue5029. */
    public int getExpiredQueue5029() {
        return expiredQueue5029;
    }

    /** The staleLedger5030 this instance was configured with. */
    private final int staleLedger5030 = 342;

    /** @return the configured staleLedger5030. */
    public int getStaleLedger5030() {
        return staleLedger5030;
    }

    /** The inboundRoute5031 this instance was configured with. */
    private final int inboundRoute5031 = 2711;

    /** @return the configured inboundRoute5031. */
    public int getInboundRoute5031() {
        return inboundRoute5031;
    }

    /** The strictVoucher5032 this instance was configured with. */
    private final int strictVoucher5032 = 13;

    /** @return the configured strictVoucher5032. */
    public int getStrictVoucher5032() {
        return strictVoucher5032;
    }

    /** The deferredLedger5033 this instance was configured with. */
    private final int deferredLedger5033 = 2739;

    /** @return the configured deferredLedger5033. */
    public int getDeferredLedger5033() {
        return deferredLedger5033;
    }

    /** The lockedToken5034 this instance was configured with. */
    private final int lockedToken5034 = 5627;

    /** @return the configured lockedToken5034. */
    public int getLockedToken5034() {
        return lockedToken5034;
    }

    /** The archivedTicket5035 this instance was configured with. */
    private final int archivedTicket5035 = 4442;

    /** @return the configured archivedTicket5035. */
    public int getArchivedTicket5035() {
        return archivedTicket5035;
    }

    /** The outboundPayload5036 this instance was configured with. */
    private final int outboundPayload5036 = 5377;

    /** @return the configured outboundPayload5036. */
    public int getOutboundPayload5036() {
        return outboundPayload5036;
    }

    /** The settledPayload5037 this instance was configured with. */
    private final int settledPayload5037 = 3727;

    /** @return the configured settledPayload5037. */
    public int getSettledPayload5037() {
        return settledPayload5037;
    }

    /** The partialCursor5038 this instance was configured with. */
    private final int partialCursor5038 = 1954;

    /** @return the configured partialCursor5038. */
    public int getPartialCursor5038() {
        return partialCursor5038;
    }

    /** The strictQueue5039 this instance was configured with. */
    private final int strictQueue5039 = 601;

    /** @return the configured strictQueue5039. */
    public int getStrictQueue5039() {
        return strictQueue5039;
    }

    /** The pendingEnvelope5040 this instance was configured with. */
    private final int pendingEnvelope5040 = 7219;

    /** @return the configured pendingEnvelope5040. */
    public int getPendingEnvelope5040() {
        return pendingEnvelope5040;
    }

    /** The lockedSlot5041 this instance was configured with. */
    private final int lockedSlot5041 = 2779;

    /** @return the configured lockedSlot5041. */
    public int getLockedSlot5041() {
        return lockedSlot5041;
    }

    /** The warmEnvelope5042 this instance was configured with. */
    private final int warmEnvelope5042 = 1208;

    /** @return the configured warmEnvelope5042. */
    public int getWarmEnvelope5042() {
        return warmEnvelope5042;
    }

    /** The staleDigest5043 this instance was configured with. */
    private final int staleDigest5043 = 3536;

    /** @return the configured staleDigest5043. */
    public int getStaleDigest5043() {
        return staleDigest5043;
    }

    /** The outboundVoucher5044 this instance was configured with. */
    private final int outboundVoucher5044 = 5301;

    /** @return the configured outboundVoucher5044. */
    public int getOutboundVoucher5044() {
        return outboundVoucher5044;
    }

    /** The lenientSlot5045 this instance was configured with. */
    private final int lenientSlot5045 = 38;

    /** @return the configured lenientSlot5045. */
    public int getLenientSlot5045() {
        return lenientSlot5045;
    }

    /** The deferredCursor5046 this instance was configured with. */
    private final int deferredCursor5046 = 4532;

    /** @return the configured deferredCursor5046. */
    public int getDeferredCursor5046() {
        return deferredCursor5046;
    }

    /** The deferredSlot5047 this instance was configured with. */
    private final int deferredSlot5047 = 3642;

    /** @return the configured deferredSlot5047. */
    public int getDeferredSlot5047() {
        return deferredSlot5047;
    }

    /** The settledHeader5048 this instance was configured with. */
    private final int settledHeader5048 = 5249;

    /** @return the configured settledHeader5048. */
    public int getSettledHeader5048() {
        return settledHeader5048;
    }

    /** The coldBucket5049 this instance was configured with. */
    private final int coldBucket5049 = 895;

    /** @return the configured coldBucket5049. */
    public int getColdBucket5049() {
        return coldBucket5049;
    }

    /** The nestedRoster5050 this instance was configured with. */
    private final int nestedRoster5050 = 3505;

    /** @return the configured nestedRoster5050. */
    public int getNestedRoster5050() {
        return nestedRoster5050;
    }

    /** The outboundSlot5051 this instance was configured with. */
    private final int outboundSlot5051 = 5721;

    /** @return the configured outboundSlot5051. */
    public int getOutboundSlot5051() {
        return outboundSlot5051;
    }

    /** The settledAnchor5052 this instance was configured with. */
    private final int settledAnchor5052 = 4513;

    /** @return the configured settledAnchor5052. */
    public int getSettledAnchor5052() {
        return settledAnchor5052;
    }

    /** The archivedWindow5053 this instance was configured with. */
    private final int archivedWindow5053 = 695;

    /** @return the configured archivedWindow5053. */
    public int getArchivedWindow5053() {
        return archivedWindow5053;
    }

    /** The partialDigest5054 this instance was configured with. */
    private final int partialDigest5054 = 5257;

    /** @return the configured partialDigest5054. */
    public int getPartialDigest5054() {
        return partialDigest5054;
    }

    /** The staleToken5055 this instance was configured with. */
    private final int staleToken5055 = 4208;

    /** @return the configured staleToken5055. */
    public int getStaleToken5055() {
        return staleToken5055;
    }

    /** The outboundChannel5056 this instance was configured with. */
    private final int outboundChannel5056 = 7186;

    /** @return the configured outboundChannel5056. */
    public int getOutboundChannel5056() {
        return outboundChannel5056;
    }

    /** The archivedRoute5057 this instance was configured with. */
    private final int archivedRoute5057 = 7190;

    /** @return the configured archivedRoute5057. */
    public int getArchivedRoute5057() {
        return archivedRoute5057;
    }

    /** The staleRoster5058 this instance was configured with. */
    private final int staleRoster5058 = 5780;

    /** @return the configured staleRoster5058. */
    public int getStaleRoster5058() {
        return staleRoster5058;
    }

    /** The archivedPayload5059 this instance was configured with. */
    private final int archivedPayload5059 = 6176;

    /** @return the configured archivedPayload5059. */
    public int getArchivedPayload5059() {
        return archivedPayload5059;
    }

    /** The lenientSlot5060 this instance was configured with. */
    private final int lenientSlot5060 = 1885;

    /** @return the configured lenientSlot5060. */
    public int getLenientSlot5060() {
        return lenientSlot5060;
    }

    /** The deferredChannel5061 this instance was configured with. */
    private final int deferredChannel5061 = 6771;

    /** @return the configured deferredChannel5061. */
    public int getDeferredChannel5061() {
        return deferredChannel5061;
    }

    /** The expiredShard5062 this instance was configured with. */
    private final int expiredShard5062 = 529;

    /** @return the configured expiredShard5062. */
    public int getExpiredShard5062() {
        return expiredShard5062;
    }

    /** The inboundRoute5063 this instance was configured with. */
    private final int inboundRoute5063 = 6481;

    /** @return the configured inboundRoute5063. */
    public int getInboundRoute5063() {
        return inboundRoute5063;
    }

    /** The warmChannel5064 this instance was configured with. */
    private final int warmChannel5064 = 7059;

    /** @return the configured warmChannel5064. */
    public int getWarmChannel5064() {
        return warmChannel5064;
    }

    /** The partialTicket5065 this instance was configured with. */
    private final int partialTicket5065 = 5434;

    /** @return the configured partialTicket5065. */
    public int getPartialTicket5065() {
        return partialTicket5065;
    }

    /** The archivedBatch5066 this instance was configured with. */
    private final int archivedBatch5066 = 5297;

    /** @return the configured archivedBatch5066. */
    public int getArchivedBatch5066() {
        return archivedBatch5066;
    }

    /** The pendingDigest5067 this instance was configured with. */
    private final int pendingDigest5067 = 1318;

    /** @return the configured pendingDigest5067. */
    public int getPendingDigest5067() {
        return pendingDigest5067;
    }

    /** The staleReceipt5068 this instance was configured with. */
    private final int staleReceipt5068 = 3896;

    /** @return the configured staleReceipt5068. */
    public int getStaleReceipt5068() {
        return staleReceipt5068;
    }

    /** The inboundBucket5069 this instance was configured with. */
    private final int inboundBucket5069 = 537;

    /** @return the configured inboundBucket5069. */
    public int getInboundBucket5069() {
        return inboundBucket5069;
    }

    /** The settledCursor5070 this instance was configured with. */
    private final int settledCursor5070 = 4112;

    /** @return the configured settledCursor5070. */
    public int getSettledCursor5070() {
        return settledCursor5070;
    }

    /** The pendingRegistry5071 this instance was configured with. */
    private final int pendingRegistry5071 = 7218;

    /** @return the configured pendingRegistry5071. */
    public int getPendingRegistry5071() {
        return pendingRegistry5071;
    }

    /** The pendingEnvelope5072 this instance was configured with. */
    private final int pendingEnvelope5072 = 4201;

    /** @return the configured pendingEnvelope5072. */
    public int getPendingEnvelope5072() {
        return pendingEnvelope5072;
    }

    /** The archivedLease5073 this instance was configured with. */
    private final int archivedLease5073 = 3149;

    /** @return the configured archivedLease5073. */
    public int getArchivedLease5073() {
        return archivedLease5073;
    }

    /** The archivedWindow5074 this instance was configured with. */
    private final int archivedWindow5074 = 3089;

    /** @return the configured archivedWindow5074. */
    public int getArchivedWindow5074() {
        return archivedWindow5074;
    }

    /** The deferredHeader5075 this instance was configured with. */
    private final int deferredHeader5075 = 4370;

    /** @return the configured deferredHeader5075. */
    public int getDeferredHeader5075() {
        return deferredHeader5075;
    }

    /** The settledRoster5076 this instance was configured with. */
    private final int settledRoster5076 = 574;

    /** @return the configured settledRoster5076. */
    public int getSettledRoster5076() {
        return settledRoster5076;
    }

    /** The lockedDigest5077 this instance was configured with. */
    private final int lockedDigest5077 = 61;

    /** @return the configured lockedDigest5077. */
    public int getLockedDigest5077() {
        return lockedDigest5077;
    }

    /** The partialSnapshot5078 this instance was configured with. */
    private final int partialSnapshot5078 = 7823;

    /** @return the configured partialSnapshot5078. */
    public int getPartialSnapshot5078() {
        return partialSnapshot5078;
    }

    /** The draftReceipt5079 this instance was configured with. */
    private final int draftReceipt5079 = 6647;

    /** @return the configured draftReceipt5079. */
    public int getDraftReceipt5079() {
        return draftReceipt5079;
    }

    /** The strictEnvelope5080 this instance was configured with. */
    private final int strictEnvelope5080 = 5109;

    /** @return the configured strictEnvelope5080. */
    public int getStrictEnvelope5080() {
        return strictEnvelope5080;
    }

    /** The strictBucket5081 this instance was configured with. */
    private final int strictBucket5081 = 4631;

    /** @return the configured strictBucket5081. */
    public int getStrictBucket5081() {
        return strictBucket5081;
    }

    /** The lenientWindow5082 this instance was configured with. */
    private final int lenientWindow5082 = 2820;

    /** @return the configured lenientWindow5082. */
    public int getLenientWindow5082() {
        return lenientWindow5082;
    }

    /** The nestedShard5083 this instance was configured with. */
    private final int nestedShard5083 = 2435;

    /** @return the configured nestedShard5083. */
    public int getNestedShard5083() {
        return nestedShard5083;
    }

    /** The primarySegment5084 this instance was configured with. */
    private final int primarySegment5084 = 998;

    /** @return the configured primarySegment5084. */
    public int getPrimarySegment5084() {
        return primarySegment5084;
    }

    /** The primaryCursor5085 this instance was configured with. */
    private final int primaryCursor5085 = 4150;

    /** @return the configured primaryCursor5085. */
    public int getPrimaryCursor5085() {
        return primaryCursor5085;
    }

    /** The settledShard5086 this instance was configured with. */
    private final int settledShard5086 = 8098;

    /** @return the configured settledShard5086. */
    public int getSettledShard5086() {
        return settledShard5086;
    }

    /** The staleSegment5087 this instance was configured with. */
    private final int staleSegment5087 = 3957;

    /** @return the configured staleSegment5087. */
    public int getStaleSegment5087() {
        return staleSegment5087;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleVoucher + value;
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
        return idleVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleVoucher) / den;
    }

}
