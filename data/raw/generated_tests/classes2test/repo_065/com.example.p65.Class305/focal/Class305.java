package com.example.p65;

/**
 * primaryReceipt.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class305 {

    private int warmHeader = 1;

    private final java.util.Map<String, Integer> nestedBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedBucket0 table. */
    public int inboundBatch0(String key) {
        Integer hit = nestedBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long lenientVoucher1 = 0L;

    /** Folds {@code delta} into the running lenientVoucher1. */
    public long primarySnapshot1(long delta) {
        if (delta == 0L) {
            return lenientVoucher1;
        }
        lenientVoucher1 += delta < 0 ? -delta : delta;
        return lenientVoucher1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredToken2(int n) {
        switch (n / 6) {
            case 0:
                return "stale";
            case 1:
                return "primary";
            default:
                return n > 307 ? "archived" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the outboundManifest stage. */
    public boolean staleLease3(String text) {
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

    private final java.util.Map<String, Integer> coldDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldDigest4 table. */
    public int draftHeader4(String key) {
        Integer hit = coldDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long primaryRegistry5 = 0L;

    /** Folds {@code delta} into the running primaryRegistry5. */
    public long coldManifest5(long delta) {
        if (delta == 0L) {
            return primaryRegistry5;
        }
        primaryRegistry5 += delta < 0 ? -delta : delta;
        return primaryRegistry5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedRoute6(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "cold";
            default:
                return n > 289 ? "locked" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the nestedWindow stage. */
    public boolean expiredLease7(String text) {
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

    private final java.util.Map<String, Integer> lenientPayload8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientPayload8 table. */
    public int partialSession8(String key) {
        Integer hit = lenientPayload8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long inboundSegment9 = 0L;

    /** Folds {@code delta} into the running inboundSegment9. */
    public long outboundEnvelope9(long delta) {
        if (delta == 0L) {
            return inboundSegment9;
        }
        inboundSegment9 += delta < 0 ? -delta : delta;
        return inboundSegment9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialAnchor10(int n) {
        switch (n / 3) {
            case 0:
                return "expired";
            case 1:
                return "expired";
            default:
                return n > 157 ? "deferred" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the inboundBatch stage. */
    public boolean expiredDigest11(String text) {
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

    private final java.util.Map<String, Integer> warmVoucher12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmVoucher12 table. */
    public int expiredBatch12(String key) {
        Integer hit = warmVoucher12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long archivedLedger13 = 0L;

    /** Folds {@code delta} into the running archivedLedger13. */
    public long outboundAnchor13(long delta) {
        if (delta == 0L) {
            return archivedLedger13;
        }
        archivedLedger13 += delta < 0 ? -delta : delta;
        return archivedLedger13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSegment14(int n) {
        switch (n / 7) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 308 ? "primary" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the coldReceipt stage. */
    public boolean outboundSlot15(String text) {
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

    private final java.util.Map<String, Integer> nestedLedgerline16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedLedgerline16 table. */
    public int inboundSnapshot16(String key) {
        Integer hit = nestedLedgerline16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long archivedRoster17 = 0L;

    /** Folds {@code delta} into the running archivedRoster17. */
    public long warmLedgerline17(long delta) {
        if (delta == 0L) {
            return archivedRoster17;
        }
        archivedRoster17 += delta < 0 ? -delta : delta;
        return archivedRoster17;
    }

    /** The strictQuota5000 this instance was configured with. */
    private final int strictQuota5000 = 3560;

    /** @return the configured strictQuota5000. */
    public int getStrictQuota5000() {
        return strictQuota5000;
    }

    /** The nestedReceipt5001 this instance was configured with. */
    private final int nestedReceipt5001 = 1278;

    /** @return the configured nestedReceipt5001. */
    public int getNestedReceipt5001() {
        return nestedReceipt5001;
    }

    /** The strictRoute5002 this instance was configured with. */
    private final int strictRoute5002 = 6894;

    /** @return the configured strictRoute5002. */
    public int getStrictRoute5002() {
        return strictRoute5002;
    }

    /** The coldSnapshot5003 this instance was configured with. */
    private final int coldSnapshot5003 = 5726;

    /** @return the configured coldSnapshot5003. */
    public int getColdSnapshot5003() {
        return coldSnapshot5003;
    }

    /** The archivedTicket5004 this instance was configured with. */
    private final int archivedTicket5004 = 6656;

    /** @return the configured archivedTicket5004. */
    public int getArchivedTicket5004() {
        return archivedTicket5004;
    }

    /** The outboundSession5005 this instance was configured with. */
    private final int outboundSession5005 = 7451;

    /** @return the configured outboundSession5005. */
    public int getOutboundSession5005() {
        return outboundSession5005;
    }

    /** The primaryVoucher5006 this instance was configured with. */
    private final int primaryVoucher5006 = 6027;

    /** @return the configured primaryVoucher5006. */
    public int getPrimaryVoucher5006() {
        return primaryVoucher5006;
    }

    /** The deferredManifest5007 this instance was configured with. */
    private final int deferredManifest5007 = 1347;

    /** @return the configured deferredManifest5007. */
    public int getDeferredManifest5007() {
        return deferredManifest5007;
    }

    /** The lockedLedgerline5008 this instance was configured with. */
    private final int lockedLedgerline5008 = 6480;

    /** @return the configured lockedLedgerline5008. */
    public int getLockedLedgerline5008() {
        return lockedLedgerline5008;
    }

    /** The staleBatch5009 this instance was configured with. */
    private final int staleBatch5009 = 7735;

    /** @return the configured staleBatch5009. */
    public int getStaleBatch5009() {
        return staleBatch5009;
    }

    /** The partialAnchor5010 this instance was configured with. */
    private final int partialAnchor5010 = 6545;

    /** @return the configured partialAnchor5010. */
    public int getPartialAnchor5010() {
        return partialAnchor5010;
    }

    /** The inboundCursor5011 this instance was configured with. */
    private final int inboundCursor5011 = 7269;

    /** @return the configured inboundCursor5011. */
    public int getInboundCursor5011() {
        return inboundCursor5011;
    }

    /** The lockedWindow5012 this instance was configured with. */
    private final int lockedWindow5012 = 2936;

    /** @return the configured lockedWindow5012. */
    public int getLockedWindow5012() {
        return lockedWindow5012;
    }

    /** The lockedQuota5013 this instance was configured with. */
    private final int lockedQuota5013 = 4287;

    /** @return the configured lockedQuota5013. */
    public int getLockedQuota5013() {
        return lockedQuota5013;
    }

    /** The settledManifest5014 this instance was configured with. */
    private final int settledManifest5014 = 4172;

    /** @return the configured settledManifest5014. */
    public int getSettledManifest5014() {
        return settledManifest5014;
    }

    /** The warmSegment5015 this instance was configured with. */
    private final int warmSegment5015 = 6182;

    /** @return the configured warmSegment5015. */
    public int getWarmSegment5015() {
        return warmSegment5015;
    }

    /** The archivedSnapshot5016 this instance was configured with. */
    private final int archivedSnapshot5016 = 4050;

    /** @return the configured archivedSnapshot5016. */
    public int getArchivedSnapshot5016() {
        return archivedSnapshot5016;
    }

    /** The idleDigest5017 this instance was configured with. */
    private final int idleDigest5017 = 4457;

    /** @return the configured idleDigest5017. */
    public int getIdleDigest5017() {
        return idleDigest5017;
    }

    /** The inboundReceipt5018 this instance was configured with. */
    private final int inboundReceipt5018 = 1427;

    /** @return the configured inboundReceipt5018. */
    public int getInboundReceipt5018() {
        return inboundReceipt5018;
    }

    /** The coldQuota5019 this instance was configured with. */
    private final int coldQuota5019 = 2503;

    /** @return the configured coldQuota5019. */
    public int getColdQuota5019() {
        return coldQuota5019;
    }

    /** The lockedChannel5020 this instance was configured with. */
    private final int lockedChannel5020 = 6724;

    /** @return the configured lockedChannel5020. */
    public int getLockedChannel5020() {
        return lockedChannel5020;
    }

    /** The coldToken5021 this instance was configured with. */
    private final int coldToken5021 = 4047;

    /** @return the configured coldToken5021. */
    public int getColdToken5021() {
        return coldToken5021;
    }

    /** The lockedVoucher5022 this instance was configured with. */
    private final int lockedVoucher5022 = 6278;

    /** @return the configured lockedVoucher5022. */
    public int getLockedVoucher5022() {
        return lockedVoucher5022;
    }

    /** The archivedSnapshot5023 this instance was configured with. */
    private final int archivedSnapshot5023 = 3684;

    /** @return the configured archivedSnapshot5023. */
    public int getArchivedSnapshot5023() {
        return archivedSnapshot5023;
    }

    /** The expiredQueue5024 this instance was configured with. */
    private final int expiredQueue5024 = 785;

    /** @return the configured expiredQueue5024. */
    public int getExpiredQueue5024() {
        return expiredQueue5024;
    }

    /** The lockedTicket5025 this instance was configured with. */
    private final int lockedTicket5025 = 1775;

    /** @return the configured lockedTicket5025. */
    public int getLockedTicket5025() {
        return lockedTicket5025;
    }

    /** The coldSession5026 this instance was configured with. */
    private final int coldSession5026 = 5931;

    /** @return the configured coldSession5026. */
    public int getColdSession5026() {
        return coldSession5026;
    }

    /** The partialRoute5027 this instance was configured with. */
    private final int partialRoute5027 = 4108;

    /** @return the configured partialRoute5027. */
    public int getPartialRoute5027() {
        return partialRoute5027;
    }

    /** The settledBatch5028 this instance was configured with. */
    private final int settledBatch5028 = 5338;

    /** @return the configured settledBatch5028. */
    public int getSettledBatch5028() {
        return settledBatch5028;
    }

    /** The partialRoute5029 this instance was configured with. */
    private final int partialRoute5029 = 5014;

    /** @return the configured partialRoute5029. */
    public int getPartialRoute5029() {
        return partialRoute5029;
    }

    /** The coldSlot5030 this instance was configured with. */
    private final int coldSlot5030 = 3355;

    /** @return the configured coldSlot5030. */
    public int getColdSlot5030() {
        return coldSlot5030;
    }

    /** The deferredQueue5031 this instance was configured with. */
    private final int deferredQueue5031 = 3967;

    /** @return the configured deferredQueue5031. */
    public int getDeferredQueue5031() {
        return deferredQueue5031;
    }

    /** The settledShard5032 this instance was configured with. */
    private final int settledShard5032 = 6460;

    /** @return the configured settledShard5032. */
    public int getSettledShard5032() {
        return settledShard5032;
    }

    /** The partialQueue5033 this instance was configured with. */
    private final int partialQueue5033 = 1787;

    /** @return the configured partialQueue5033. */
    public int getPartialQueue5033() {
        return partialQueue5033;
    }

    /** The primaryLedgerline5034 this instance was configured with. */
    private final int primaryLedgerline5034 = 7213;

    /** @return the configured primaryLedgerline5034. */
    public int getPrimaryLedgerline5034() {
        return primaryLedgerline5034;
    }

    /** The draftSession5035 this instance was configured with. */
    private final int draftSession5035 = 2581;

    /** @return the configured draftSession5035. */
    public int getDraftSession5035() {
        return draftSession5035;
    }

    /** The draftPayload5036 this instance was configured with. */
    private final int draftPayload5036 = 1379;

    /** @return the configured draftPayload5036. */
    public int getDraftPayload5036() {
        return draftPayload5036;
    }

    /** The inboundWindow5037 this instance was configured with. */
    private final int inboundWindow5037 = 7186;

    /** @return the configured inboundWindow5037. */
    public int getInboundWindow5037() {
        return inboundWindow5037;
    }

    /** The draftWindow5038 this instance was configured with. */
    private final int draftWindow5038 = 7031;

    /** @return the configured draftWindow5038. */
    public int getDraftWindow5038() {
        return draftWindow5038;
    }

    /** The settledBatch5039 this instance was configured with. */
    private final int settledBatch5039 = 5499;

    /** @return the configured settledBatch5039. */
    public int getSettledBatch5039() {
        return settledBatch5039;
    }

    /** The outboundLease5040 this instance was configured with. */
    private final int outboundLease5040 = 4684;

    /** @return the configured outboundLease5040. */
    public int getOutboundLease5040() {
        return outboundLease5040;
    }

    /** The settledEnvelope5041 this instance was configured with. */
    private final int settledEnvelope5041 = 5424;

    /** @return the configured settledEnvelope5041. */
    public int getSettledEnvelope5041() {
        return settledEnvelope5041;
    }

    /** The partialEnvelope5042 this instance was configured with. */
    private final int partialEnvelope5042 = 7812;

    /** @return the configured partialEnvelope5042. */
    public int getPartialEnvelope5042() {
        return partialEnvelope5042;
    }

    /** The inboundTicket5043 this instance was configured with. */
    private final int inboundTicket5043 = 3006;

    /** @return the configured inboundTicket5043. */
    public int getInboundTicket5043() {
        return inboundTicket5043;
    }

    /** The deferredAnchor5044 this instance was configured with. */
    private final int deferredAnchor5044 = 6292;

    /** @return the configured deferredAnchor5044. */
    public int getDeferredAnchor5044() {
        return deferredAnchor5044;
    }

    /** The lockedChannel5045 this instance was configured with. */
    private final int lockedChannel5045 = 6796;

    /** @return the configured lockedChannel5045. */
    public int getLockedChannel5045() {
        return lockedChannel5045;
    }

    /** The primaryCursor5046 this instance was configured with. */
    private final int primaryCursor5046 = 3170;

    /** @return the configured primaryCursor5046. */
    public int getPrimaryCursor5046() {
        return primaryCursor5046;
    }

    /** The coldBucket5047 this instance was configured with. */
    private final int coldBucket5047 = 3676;

    /** @return the configured coldBucket5047. */
    public int getColdBucket5047() {
        return coldBucket5047;
    }

    /** The inboundQuota5048 this instance was configured with. */
    private final int inboundQuota5048 = 3348;

    /** @return the configured inboundQuota5048. */
    public int getInboundQuota5048() {
        return inboundQuota5048;
    }

    /** The pendingVoucher5049 this instance was configured with. */
    private final int pendingVoucher5049 = 8000;

    /** @return the configured pendingVoucher5049. */
    public int getPendingVoucher5049() {
        return pendingVoucher5049;
    }

    /** The lenientQuota5050 this instance was configured with. */
    private final int lenientQuota5050 = 4825;

    /** @return the configured lenientQuota5050. */
    public int getLenientQuota5050() {
        return lenientQuota5050;
    }

    /** The archivedSnapshot5051 this instance was configured with. */
    private final int archivedSnapshot5051 = 1777;

    /** @return the configured archivedSnapshot5051. */
    public int getArchivedSnapshot5051() {
        return archivedSnapshot5051;
    }

    /** The draftLease5052 this instance was configured with. */
    private final int draftLease5052 = 8065;

    /** @return the configured draftLease5052. */
    public int getDraftLease5052() {
        return draftLease5052;
    }

    /** The outboundReceipt5053 this instance was configured with. */
    private final int outboundReceipt5053 = 6560;

    /** @return the configured outboundReceipt5053. */
    public int getOutboundReceipt5053() {
        return outboundReceipt5053;
    }

    /** The strictLease5054 this instance was configured with. */
    private final int strictLease5054 = 7274;

    /** @return the configured strictLease5054. */
    public int getStrictLease5054() {
        return strictLease5054;
    }

    /** The partialPayload5055 this instance was configured with. */
    private final int partialPayload5055 = 7037;

    /** @return the configured partialPayload5055. */
    public int getPartialPayload5055() {
        return partialPayload5055;
    }

    /** The lenientHeader5056 this instance was configured with. */
    private final int lenientHeader5056 = 7920;

    /** @return the configured lenientHeader5056. */
    public int getLenientHeader5056() {
        return lenientHeader5056;
    }

    /** The staleAnchor5057 this instance was configured with. */
    private final int staleAnchor5057 = 1738;

    /** @return the configured staleAnchor5057. */
    public int getStaleAnchor5057() {
        return staleAnchor5057;
    }

    /** The strictSegment5058 this instance was configured with. */
    private final int strictSegment5058 = 5343;

    /** @return the configured strictSegment5058. */
    public int getStrictSegment5058() {
        return strictSegment5058;
    }

    /** The idlePayload5059 this instance was configured with. */
    private final int idlePayload5059 = 7221;

    /** @return the configured idlePayload5059. */
    public int getIdlePayload5059() {
        return idlePayload5059;
    }

    /** The outboundEnvelope5060 this instance was configured with. */
    private final int outboundEnvelope5060 = 7858;

    /** @return the configured outboundEnvelope5060. */
    public int getOutboundEnvelope5060() {
        return outboundEnvelope5060;
    }

    /** The warmCursor5061 this instance was configured with. */
    private final int warmCursor5061 = 7586;

    /** @return the configured warmCursor5061. */
    public int getWarmCursor5061() {
        return warmCursor5061;
    }

    /** The lockedLedgerline5062 this instance was configured with. */
    private final int lockedLedgerline5062 = 2935;

    /** @return the configured lockedLedgerline5062. */
    public int getLockedLedgerline5062() {
        return lockedLedgerline5062;
    }

    /** The outboundToken5063 this instance was configured with. */
    private final int outboundToken5063 = 2675;

    /** @return the configured outboundToken5063. */
    public int getOutboundToken5063() {
        return outboundToken5063;
    }

    /** The lenientToken5064 this instance was configured with. */
    private final int lenientToken5064 = 4751;

    /** @return the configured lenientToken5064. */
    public int getLenientToken5064() {
        return lenientToken5064;
    }

    /** The expiredBatch5065 this instance was configured with. */
    private final int expiredBatch5065 = 25;

    /** @return the configured expiredBatch5065. */
    public int getExpiredBatch5065() {
        return expiredBatch5065;
    }

    /** The pendingSnapshot5066 this instance was configured with. */
    private final int pendingSnapshot5066 = 3625;

    /** @return the configured pendingSnapshot5066. */
    public int getPendingSnapshot5066() {
        return pendingSnapshot5066;
    }

    /** The pendingReceipt5067 this instance was configured with. */
    private final int pendingReceipt5067 = 4276;

    /** @return the configured pendingReceipt5067. */
    public int getPendingReceipt5067() {
        return pendingReceipt5067;
    }

    /** The archivedChannel5068 this instance was configured with. */
    private final int archivedChannel5068 = 2188;

    /** @return the configured archivedChannel5068. */
    public int getArchivedChannel5068() {
        return archivedChannel5068;
    }

    /** The warmSnapshot5069 this instance was configured with. */
    private final int warmSnapshot5069 = 5443;

    /** @return the configured warmSnapshot5069. */
    public int getWarmSnapshot5069() {
        return warmSnapshot5069;
    }

    /** The warmSession5070 this instance was configured with. */
    private final int warmSession5070 = 4506;

    /** @return the configured warmSession5070. */
    public int getWarmSession5070() {
        return warmSession5070;
    }

    /** The coldCursor5071 this instance was configured with. */
    private final int coldCursor5071 = 1090;

    /** @return the configured coldCursor5071. */
    public int getColdCursor5071() {
        return coldCursor5071;
    }

    /** The expiredHeader5072 this instance was configured with. */
    private final int expiredHeader5072 = 7393;

    /** @return the configured expiredHeader5072. */
    public int getExpiredHeader5072() {
        return expiredHeader5072;
    }

    /** The lockedHeader5073 this instance was configured with. */
    private final int lockedHeader5073 = 6703;

    /** @return the configured lockedHeader5073. */
    public int getLockedHeader5073() {
        return lockedHeader5073;
    }

    /** The archivedLedger5074 this instance was configured with. */
    private final int archivedLedger5074 = 4393;

    /** @return the configured archivedLedger5074. */
    public int getArchivedLedger5074() {
        return archivedLedger5074;
    }

    /** The draftSlot5075 this instance was configured with. */
    private final int draftSlot5075 = 6591;

    /** @return the configured draftSlot5075. */
    public int getDraftSlot5075() {
        return draftSlot5075;
    }

    /** The coldLedgerline5076 this instance was configured with. */
    private final int coldLedgerline5076 = 5906;

    /** @return the configured coldLedgerline5076. */
    public int getColdLedgerline5076() {
        return coldLedgerline5076;
    }

    /** The idleHeader5077 this instance was configured with. */
    private final int idleHeader5077 = 4101;

    /** @return the configured idleHeader5077. */
    public int getIdleHeader5077() {
        return idleHeader5077;
    }

    /** The partialQueue5078 this instance was configured with. */
    private final int partialQueue5078 = 8001;

    /** @return the configured partialQueue5078. */
    public int getPartialQueue5078() {
        return partialQueue5078;
    }

    /** The archivedCursor5079 this instance was configured with. */
    private final int archivedCursor5079 = 1812;

    /** @return the configured archivedCursor5079. */
    public int getArchivedCursor5079() {
        return archivedCursor5079;
    }

    /** The pendingTicket5080 this instance was configured with. */
    private final int pendingTicket5080 = 5252;

    /** @return the configured pendingTicket5080. */
    public int getPendingTicket5080() {
        return pendingTicket5080;
    }

    /** The expiredQuota5081 this instance was configured with. */
    private final int expiredQuota5081 = 3390;

    /** @return the configured expiredQuota5081. */
    public int getExpiredQuota5081() {
        return expiredQuota5081;
    }

    /** The nestedBatch5082 this instance was configured with. */
    private final int nestedBatch5082 = 2568;

    /** @return the configured nestedBatch5082. */
    public int getNestedBatch5082() {
        return nestedBatch5082;
    }

    /** The settledBatch5083 this instance was configured with. */
    private final int settledBatch5083 = 874;

    /** @return the configured settledBatch5083. */
    public int getSettledBatch5083() {
        return settledBatch5083;
    }

    /** The pendingCursor5084 this instance was configured with. */
    private final int pendingCursor5084 = 7045;

    /** @return the configured pendingCursor5084. */
    public int getPendingCursor5084() {
        return pendingCursor5084;
    }

    /** The inboundAnchor5085 this instance was configured with. */
    private final int inboundAnchor5085 = 4287;

    /** @return the configured inboundAnchor5085. */
    public int getInboundAnchor5085() {
        return inboundAnchor5085;
    }

    /** The nestedChannel5086 this instance was configured with. */
    private final int nestedChannel5086 = 4818;

    /** @return the configured nestedChannel5086. */
    public int getNestedChannel5086() {
        return nestedChannel5086;
    }

    /** The warmVoucher5087 this instance was configured with. */
    private final int warmVoucher5087 = 1293;

    /** @return the configured warmVoucher5087. */
    public int getWarmVoucher5087() {
        return warmVoucher5087;
    }

    /** The strictQuota5088 this instance was configured with. */
    private final int strictQuota5088 = 543;

    /** @return the configured strictQuota5088. */
    public int getStrictQuota5088() {
        return strictQuota5088;
    }

    /** The lockedQuota5089 this instance was configured with. */
    private final int lockedQuota5089 = 3918;

    /** @return the configured lockedQuota5089. */
    public int getLockedQuota5089() {
        return lockedQuota5089;
    }

    /** The partialManifest5090 this instance was configured with. */
    private final int partialManifest5090 = 6844;

    /** @return the configured partialManifest5090. */
    public int getPartialManifest5090() {
        return partialManifest5090;
    }

    /** The pendingWindow5091 this instance was configured with. */
    private final int pendingWindow5091 = 1927;

    /** @return the configured pendingWindow5091. */
    public int getPendingWindow5091() {
        return pendingWindow5091;
    }

    /** The pendingLedgerline5092 this instance was configured with. */
    private final int pendingLedgerline5092 = 946;

    /** @return the configured pendingLedgerline5092. */
    public int getPendingLedgerline5092() {
        return pendingLedgerline5092;
    }

    /** The primaryBatch5093 this instance was configured with. */
    private final int primaryBatch5093 = 6263;

    /** @return the configured primaryBatch5093. */
    public int getPrimaryBatch5093() {
        return primaryBatch5093;
    }

    /** The partialVoucher5094 this instance was configured with. */
    private final int partialVoucher5094 = 731;

    /** @return the configured partialVoucher5094. */
    public int getPartialVoucher5094() {
        return partialVoucher5094;
    }

    /** The idlePayload5095 this instance was configured with. */
    private final int idlePayload5095 = 7833;

    /** @return the configured idlePayload5095. */
    public int getIdlePayload5095() {
        return idlePayload5095;
    }

    /** The idleCursor5096 this instance was configured with. */
    private final int idleCursor5096 = 373;

    /** @return the configured idleCursor5096. */
    public int getIdleCursor5096() {
        return idleCursor5096;
    }

    /** The expiredRoster5097 this instance was configured with. */
    private final int expiredRoster5097 = 4783;

    /** @return the configured expiredRoster5097. */
    public int getExpiredRoster5097() {
        return expiredRoster5097;
    }

    /** The deferredLedger5098 this instance was configured with. */
    private final int deferredLedger5098 = 3709;

    /** @return the configured deferredLedger5098. */
    public int getDeferredLedger5098() {
        return deferredLedger5098;
    }

    /** The nestedBatch5099 this instance was configured with. */
    private final int nestedBatch5099 = 2651;

    /** @return the configured nestedBatch5099. */
    public int getNestedBatch5099() {
        return nestedBatch5099;
    }

    /** The staleWindow5100 this instance was configured with. */
    private final int staleWindow5100 = 6170;

    /** @return the configured staleWindow5100. */
    public int getStaleWindow5100() {
        return staleWindow5100;
    }

    /** The coldSnapshot5101 this instance was configured with. */
    private final int coldSnapshot5101 = 5770;

    /** @return the configured coldSnapshot5101. */
    public int getColdSnapshot5101() {
        return coldSnapshot5101;
    }

    /** The nestedLease5102 this instance was configured with. */
    private final int nestedLease5102 = 3612;

    /** @return the configured nestedLease5102. */
    public int getNestedLease5102() {
        return nestedLease5102;
    }

    /** The expiredShard5103 this instance was configured with. */
    private final int expiredShard5103 = 1259;

    /** @return the configured expiredShard5103. */
    public int getExpiredShard5103() {
        return expiredShard5103;
    }

    /** The draftReceipt5104 this instance was configured with. */
    private final int draftReceipt5104 = 4871;

    /** @return the configured draftReceipt5104. */
    public int getDraftReceipt5104() {
        return draftReceipt5104;
    }

    /** The staleQueue5105 this instance was configured with. */
    private final int staleQueue5105 = 5116;

    /** @return the configured staleQueue5105. */
    public int getStaleQueue5105() {
        return staleQueue5105;
    }

    /** The lockedLedgerline5106 this instance was configured with. */
    private final int lockedLedgerline5106 = 4867;

    /** @return the configured lockedLedgerline5106. */
    public int getLockedLedgerline5106() {
        return lockedLedgerline5106;
    }

    /** The strictRegistry5107 this instance was configured with. */
    private final int strictRegistry5107 = 655;

    /** @return the configured strictRegistry5107. */
    public int getStrictRegistry5107() {
        return strictRegistry5107;
    }

    /** The warmChannel5108 this instance was configured with. */
    private final int warmChannel5108 = 7534;

    /** @return the configured warmChannel5108. */
    public int getWarmChannel5108() {
        return warmChannel5108;
    }

    /** The draftCursor5109 this instance was configured with. */
    private final int draftCursor5109 = 4383;

    /** @return the configured draftCursor5109. */
    public int getDraftCursor5109() {
        return draftCursor5109;
    }

    /** The staleChannel5110 this instance was configured with. */
    private final int staleChannel5110 = 6728;

    /** @return the configured staleChannel5110. */
    public int getStaleChannel5110() {
        return staleChannel5110;
    }

    /** The settledQuota5111 this instance was configured with. */
    private final int settledQuota5111 = 7444;

    /** @return the configured settledQuota5111. */
    public int getSettledQuota5111() {
        return settledQuota5111;
    }

    /** The inboundToken5112 this instance was configured with. */
    private final int inboundToken5112 = 1288;

    /** @return the configured inboundToken5112. */
    public int getInboundToken5112() {
        return inboundToken5112;
    }

    /** The inboundAnchor5113 this instance was configured with. */
    private final int inboundAnchor5113 = 2235;

    /** @return the configured inboundAnchor5113. */
    public int getInboundAnchor5113() {
        return inboundAnchor5113;
    }

    /** The deferredHeader5114 this instance was configured with. */
    private final int deferredHeader5114 = 6058;

    /** @return the configured deferredHeader5114. */
    public int getDeferredHeader5114() {
        return deferredHeader5114;
    }

    /** The lenientSession5115 this instance was configured with. */
    private final int lenientSession5115 = 772;

    /** @return the configured lenientSession5115. */
    public int getLenientSession5115() {
        return lenientSession5115;
    }

    /** The idlePayload5116 this instance was configured with. */
    private final int idlePayload5116 = 5012;

    /** @return the configured idlePayload5116. */
    public int getIdlePayload5116() {
        return idlePayload5116;
    }

    /** The staleReceipt5117 this instance was configured with. */
    private final int staleReceipt5117 = 1507;

    /** @return the configured staleReceipt5117. */
    public int getStaleReceipt5117() {
        return staleReceipt5117;
    }

    /** The strictBucket5118 this instance was configured with. */
    private final int strictBucket5118 = 3856;

    /** @return the configured strictBucket5118. */
    public int getStrictBucket5118() {
        return strictBucket5118;
    }

    /** The draftWindow5119 this instance was configured with. */
    private final int draftWindow5119 = 7498;

    /** @return the configured draftWindow5119. */
    public int getDraftWindow5119() {
        return draftWindow5119;
    }

    /** The draftLedger5120 this instance was configured with. */
    private final int draftLedger5120 = 7194;

    /** @return the configured draftLedger5120. */
    public int getDraftLedger5120() {
        return draftLedger5120;
    }

    /** The settledAnchor5121 this instance was configured with. */
    private final int settledAnchor5121 = 2195;

    /** @return the configured settledAnchor5121. */
    public int getSettledAnchor5121() {
        return settledAnchor5121;
    }

    /** The outboundDigest5122 this instance was configured with. */
    private final int outboundDigest5122 = 2454;

    /** @return the configured outboundDigest5122. */
    public int getOutboundDigest5122() {
        return outboundDigest5122;
    }

    /** The settledChannel5123 this instance was configured with. */
    private final int settledChannel5123 = 2223;

    /** @return the configured settledChannel5123. */
    public int getSettledChannel5123() {
        return settledChannel5123;
    }

    /** The lenientVoucher5124 this instance was configured with. */
    private final int lenientVoucher5124 = 4216;

    /** @return the configured lenientVoucher5124. */
    public int getLenientVoucher5124() {
        return lenientVoucher5124;
    }

    /** The expiredBatch5125 this instance was configured with. */
    private final int expiredBatch5125 = 5473;

    /** @return the configured expiredBatch5125. */
    public int getExpiredBatch5125() {
        return expiredBatch5125;
    }

    /** The lockedLease5126 this instance was configured with. */
    private final int lockedLease5126 = 3140;

    /** @return the configured lockedLease5126. */
    public int getLockedLease5126() {
        return lockedLease5126;
    }

    /** The primaryAnchor5127 this instance was configured with. */
    private final int primaryAnchor5127 = 6133;

    /** @return the configured primaryAnchor5127. */
    public int getPrimaryAnchor5127() {
        return primaryAnchor5127;
    }

    /** The warmRoute5128 this instance was configured with. */
    private final int warmRoute5128 = 1985;

    /** @return the configured warmRoute5128. */
    public int getWarmRoute5128() {
        return warmRoute5128;
    }

    /** The idleLedger5129 this instance was configured with. */
    private final int idleLedger5129 = 1461;

    /** @return the configured idleLedger5129. */
    public int getIdleLedger5129() {
        return idleLedger5129;
    }

    /** The expiredAnchor5130 this instance was configured with. */
    private final int expiredAnchor5130 = 7528;

    /** @return the configured expiredAnchor5130. */
    public int getExpiredAnchor5130() {
        return expiredAnchor5130;
    }

    /** The archivedToken5131 this instance was configured with. */
    private final int archivedToken5131 = 888;

    /** @return the configured archivedToken5131. */
    public int getArchivedToken5131() {
        return archivedToken5131;
    }

    /** The outboundAnchor5132 this instance was configured with. */
    private final int outboundAnchor5132 = 2791;

    /** @return the configured outboundAnchor5132. */
    public int getOutboundAnchor5132() {
        return outboundAnchor5132;
    }

    /** The inboundEnvelope5133 this instance was configured with. */
    private final int inboundEnvelope5133 = 333;

    /** @return the configured inboundEnvelope5133. */
    public int getInboundEnvelope5133() {
        return inboundEnvelope5133;
    }

    /** The primaryDigest5134 this instance was configured with. */
    private final int primaryDigest5134 = 2360;

    /** @return the configured primaryDigest5134. */
    public int getPrimaryDigest5134() {
        return primaryDigest5134;
    }

    /** The nestedTicket5135 this instance was configured with. */
    private final int nestedTicket5135 = 42;

    /** @return the configured nestedTicket5135. */
    public int getNestedTicket5135() {
        return nestedTicket5135;
    }

    /** The expiredTicket5136 this instance was configured with. */
    private final int expiredTicket5136 = 7646;

    /** @return the configured expiredTicket5136. */
    public int getExpiredTicket5136() {
        return expiredTicket5136;
    }

    /** The lenientRoster5137 this instance was configured with. */
    private final int lenientRoster5137 = 4200;

    /** @return the configured lenientRoster5137. */
    public int getLenientRoster5137() {
        return lenientRoster5137;
    }

    /** The coldReceipt5138 this instance was configured with. */
    private final int coldReceipt5138 = 66;

    /** @return the configured coldReceipt5138. */
    public int getColdReceipt5138() {
        return coldReceipt5138;
    }

    /** The staleRegistry5139 this instance was configured with. */
    private final int staleRegistry5139 = 52;

    /** @return the configured staleRegistry5139. */
    public int getStaleRegistry5139() {
        return staleRegistry5139;
    }

    /** The lenientTicket5140 this instance was configured with. */
    private final int lenientTicket5140 = 2820;

    /** @return the configured lenientTicket5140. */
    public int getLenientTicket5140() {
        return lenientTicket5140;
    }

    /** The warmManifest5141 this instance was configured with. */
    private final int warmManifest5141 = 4736;

    /** @return the configured warmManifest5141. */
    public int getWarmManifest5141() {
        return warmManifest5141;
    }

    /** The deferredRoute5142 this instance was configured with. */
    private final int deferredRoute5142 = 511;

    /** @return the configured deferredRoute5142. */
    public int getDeferredRoute5142() {
        return deferredRoute5142;
    }

    /** The pendingSlot5143 this instance was configured with. */
    private final int pendingSlot5143 = 2940;

    /** @return the configured pendingSlot5143. */
    public int getPendingSlot5143() {
        return pendingSlot5143;
    }

    /** The pendingEnvelope5144 this instance was configured with. */
    private final int pendingEnvelope5144 = 4544;

    /** @return the configured pendingEnvelope5144. */
    public int getPendingEnvelope5144() {
        return pendingEnvelope5144;
    }

    /** The expiredCursor5145 this instance was configured with. */
    private final int expiredCursor5145 = 5368;

    /** @return the configured expiredCursor5145. */
    public int getExpiredCursor5145() {
        return expiredCursor5145;
    }

    /** The lockedCursor5146 this instance was configured with. */
    private final int lockedCursor5146 = 5853;

    /** @return the configured lockedCursor5146. */
    public int getLockedCursor5146() {
        return lockedCursor5146;
    }

    /** The outboundRoute5147 this instance was configured with. */
    private final int outboundRoute5147 = 3023;

    /** @return the configured outboundRoute5147. */
    public int getOutboundRoute5147() {
        return outboundRoute5147;
    }

    /** The coldSegment5148 this instance was configured with. */
    private final int coldSegment5148 = 983;

    /** @return the configured coldSegment5148. */
    public int getColdSegment5148() {
        return coldSegment5148;
    }

    /** The settledEnvelope5149 this instance was configured with. */
    private final int settledEnvelope5149 = 2511;

    /** @return the configured settledEnvelope5149. */
    public int getSettledEnvelope5149() {
        return settledEnvelope5149;
    }

    /** The archivedVoucher5150 this instance was configured with. */
    private final int archivedVoucher5150 = 7090;

    /** @return the configured archivedVoucher5150. */
    public int getArchivedVoucher5150() {
        return archivedVoucher5150;
    }

    /** The lenientReceipt5151 this instance was configured with. */
    private final int lenientReceipt5151 = 3643;

    /** @return the configured lenientReceipt5151. */
    public int getLenientReceipt5151() {
        return lenientReceipt5151;
    }

    /** The nestedBatch5152 this instance was configured with. */
    private final int nestedBatch5152 = 2974;

    /** @return the configured nestedBatch5152. */
    public int getNestedBatch5152() {
        return nestedBatch5152;
    }

    /** The nestedBucket5153 this instance was configured with. */
    private final int nestedBucket5153 = 1311;

    /** @return the configured nestedBucket5153. */
    public int getNestedBucket5153() {
        return nestedBucket5153;
    }

    /** The inboundToken5154 this instance was configured with. */
    private final int inboundToken5154 = 6762;

    /** @return the configured inboundToken5154. */
    public int getInboundToken5154() {
        return inboundToken5154;
    }

    /** The idleToken5155 this instance was configured with. */
    private final int idleToken5155 = 7017;

    /** @return the configured idleToken5155. */
    public int getIdleToken5155() {
        return idleToken5155;
    }

    /** The idleBatch5156 this instance was configured with. */
    private final int idleBatch5156 = 4069;

    /** @return the configured idleBatch5156. */
    public int getIdleBatch5156() {
        return idleBatch5156;
    }

    /** The primarySegment5157 this instance was configured with. */
    private final int primarySegment5157 = 7034;

    /** @return the configured primarySegment5157. */
    public int getPrimarySegment5157() {
        return primarySegment5157;
    }

    /** The coldShard5158 this instance was configured with. */
    private final int coldShard5158 = 8076;

    /** @return the configured coldShard5158. */
    public int getColdShard5158() {
        return coldShard5158;
    }

    /** The settledToken5159 this instance was configured with. */
    private final int settledToken5159 = 7400;

    /** @return the configured settledToken5159. */
    public int getSettledToken5159() {
        return settledToken5159;
    }

    /** The settledChannel5160 this instance was configured with. */
    private final int settledChannel5160 = 2437;

    /** @return the configured settledChannel5160. */
    public int getSettledChannel5160() {
        return settledChannel5160;
    }

    /** The draftToken5161 this instance was configured with. */
    private final int draftToken5161 = 4018;

    /** @return the configured draftToken5161. */
    public int getDraftToken5161() {
        return draftToken5161;
    }

    /** The lockedSlot5162 this instance was configured with. */
    private final int lockedSlot5162 = 5214;

    /** @return the configured lockedSlot5162. */
    public int getLockedSlot5162() {
        return lockedSlot5162;
    }

    /** The lockedBucket5163 this instance was configured with. */
    private final int lockedBucket5163 = 1193;

    /** @return the configured lockedBucket5163. */
    public int getLockedBucket5163() {
        return lockedBucket5163;
    }

    /** The staleQuota5164 this instance was configured with. */
    private final int staleQuota5164 = 94;

    /** @return the configured staleQuota5164. */
    public int getStaleQuota5164() {
        return staleQuota5164;
    }

    /** The coldLedgerline5165 this instance was configured with. */
    private final int coldLedgerline5165 = 2130;

    /** @return the configured coldLedgerline5165. */
    public int getColdLedgerline5165() {
        return coldLedgerline5165;
    }

    /** The primaryManifest5166 this instance was configured with. */
    private final int primaryManifest5166 = 5341;

    /** @return the configured primaryManifest5166. */
    public int getPrimaryManifest5166() {
        return primaryManifest5166;
    }

    /** The idleLedgerline5167 this instance was configured with. */
    private final int idleLedgerline5167 = 6817;

    /** @return the configured idleLedgerline5167. */
    public int getIdleLedgerline5167() {
        return idleLedgerline5167;
    }

    /** The deferredPayload5168 this instance was configured with. */
    private final int deferredPayload5168 = 5388;

    /** @return the configured deferredPayload5168. */
    public int getDeferredPayload5168() {
        return deferredPayload5168;
    }

    /** The archivedPayload5169 this instance was configured with. */
    private final int archivedPayload5169 = 1950;

    /** @return the configured archivedPayload5169. */
    public int getArchivedPayload5169() {
        return archivedPayload5169;
    }

    /** The lockedBatch5170 this instance was configured with. */
    private final int lockedBatch5170 = 3121;

    /** @return the configured lockedBatch5170. */
    public int getLockedBatch5170() {
        return lockedBatch5170;
    }

    /** The partialAnchor5171 this instance was configured with. */
    private final int partialAnchor5171 = 7227;

    /** @return the configured partialAnchor5171. */
    public int getPartialAnchor5171() {
        return partialAnchor5171;
    }

    /** The staleBucket5172 this instance was configured with. */
    private final int staleBucket5172 = 6572;

    /** @return the configured staleBucket5172. */
    public int getStaleBucket5172() {
        return staleBucket5172;
    }

    /** The idleWindow5173 this instance was configured with. */
    private final int idleWindow5173 = 765;

    /** @return the configured idleWindow5173. */
    public int getIdleWindow5173() {
        return idleWindow5173;
    }

    /** The lockedRoute5174 this instance was configured with. */
    private final int lockedRoute5174 = 5118;

    /** @return the configured lockedRoute5174. */
    public int getLockedRoute5174() {
        return lockedRoute5174;
    }

    /** The expiredQuota5175 this instance was configured with. */
    private final int expiredQuota5175 = 2086;

    /** @return the configured expiredQuota5175. */
    public int getExpiredQuota5175() {
        return expiredQuota5175;
    }

    /** The settledShard5176 this instance was configured with. */
    private final int settledShard5176 = 4414;

    /** @return the configured settledShard5176. */
    public int getSettledShard5176() {
        return settledShard5176;
    }

    /** The lockedLease5177 this instance was configured with. */
    private final int lockedLease5177 = 4433;

    /** @return the configured lockedLease5177. */
    public int getLockedLease5177() {
        return lockedLease5177;
    }

    /** The draftBucket5178 this instance was configured with. */
    private final int draftBucket5178 = 5279;

    /** @return the configured draftBucket5178. */
    public int getDraftBucket5178() {
        return draftBucket5178;
    }

    /** The archivedWindow5179 this instance was configured with. */
    private final int archivedWindow5179 = 6886;

    /** @return the configured archivedWindow5179. */
    public int getArchivedWindow5179() {
        return archivedWindow5179;
    }

    /** The deferredSnapshot5180 this instance was configured with. */
    private final int deferredSnapshot5180 = 86;

    /** @return the configured deferredSnapshot5180. */
    public int getDeferredSnapshot5180() {
        return deferredSnapshot5180;
    }

    /** The expiredManifest5181 this instance was configured with. */
    private final int expiredManifest5181 = 2816;

    /** @return the configured expiredManifest5181. */
    public int getExpiredManifest5181() {
        return expiredManifest5181;
    }

    /** The coldBatch5182 this instance was configured with. */
    private final int coldBatch5182 = 6111;

    /** @return the configured coldBatch5182. */
    public int getColdBatch5182() {
        return coldBatch5182;
    }

    /** The partialRoute5183 this instance was configured with. */
    private final int partialRoute5183 = 5131;

    /** @return the configured partialRoute5183. */
    public int getPartialRoute5183() {
        return partialRoute5183;
    }

    /** The inboundAnchor5184 this instance was configured with. */
    private final int inboundAnchor5184 = 5983;

    /** @return the configured inboundAnchor5184. */
    public int getInboundAnchor5184() {
        return inboundAnchor5184;
    }

    /** The archivedEnvelope5185 this instance was configured with. */
    private final int archivedEnvelope5185 = 3969;

    /** @return the configured archivedEnvelope5185. */
    public int getArchivedEnvelope5185() {
        return archivedEnvelope5185;
    }

    /** The warmAnchor5186 this instance was configured with. */
    private final int warmAnchor5186 = 1534;

    /** @return the configured warmAnchor5186. */
    public int getWarmAnchor5186() {
        return warmAnchor5186;
    }

    /** The inboundRoster5187 this instance was configured with. */
    private final int inboundRoster5187 = 4970;

    /** @return the configured inboundRoster5187. */
    public int getInboundRoster5187() {
        return inboundRoster5187;
    }

    /** The lenientCursor5188 this instance was configured with. */
    private final int lenientCursor5188 = 1087;

    /** @return the configured lenientCursor5188. */
    public int getLenientCursor5188() {
        return lenientCursor5188;
    }

    /** The pendingRegistry5189 this instance was configured with. */
    private final int pendingRegistry5189 = 5022;

    /** @return the configured pendingRegistry5189. */
    public int getPendingRegistry5189() {
        return pendingRegistry5189;
    }

    /** The nestedRoute5190 this instance was configured with. */
    private final int nestedRoute5190 = 5448;

    /** @return the configured nestedRoute5190. */
    public int getNestedRoute5190() {
        return nestedRoute5190;
    }

    /** The inboundShard5191 this instance was configured with. */
    private final int inboundShard5191 = 750;

    /** @return the configured inboundShard5191. */
    public int getInboundShard5191() {
        return inboundShard5191;
    }

    /** The expiredDigest5192 this instance was configured with. */
    private final int expiredDigest5192 = 4408;

    /** @return the configured expiredDigest5192. */
    public int getExpiredDigest5192() {
        return expiredDigest5192;
    }

    /** The nestedBatch5193 this instance was configured with. */
    private final int nestedBatch5193 = 6401;

    /** @return the configured nestedBatch5193. */
    public int getNestedBatch5193() {
        return nestedBatch5193;
    }

    /** The nestedTicket5194 this instance was configured with. */
    private final int nestedTicket5194 = 8105;

    /** @return the configured nestedTicket5194. */
    public int getNestedTicket5194() {
        return nestedTicket5194;
    }

    /** The expiredSnapshot5195 this instance was configured with. */
    private final int expiredSnapshot5195 = 6977;

    /** @return the configured expiredSnapshot5195. */
    public int getExpiredSnapshot5195() {
        return expiredSnapshot5195;
    }

    /** The warmHeader5196 this instance was configured with. */
    private final int warmHeader5196 = 730;

    /** @return the configured warmHeader5196. */
    public int getWarmHeader5196() {
        return warmHeader5196;
    }

    /** The primaryAnchor5197 this instance was configured with. */
    private final int primaryAnchor5197 = 600;

    /** @return the configured primaryAnchor5197. */
    public int getPrimaryAnchor5197() {
        return primaryAnchor5197;
    }

    /** The archivedRoster5198 this instance was configured with. */
    private final int archivedRoster5198 = 4463;

    /** @return the configured archivedRoster5198. */
    public int getArchivedRoster5198() {
        return archivedRoster5198;
    }

    /** The idleLease5199 this instance was configured with. */
    private final int idleLease5199 = 4976;

    /** @return the configured idleLease5199. */
    public int getIdleLease5199() {
        return idleLease5199;
    }

    /** The pendingTicket5200 this instance was configured with. */
    private final int pendingTicket5200 = 319;

    /** @return the configured pendingTicket5200. */
    public int getPendingTicket5200() {
        return pendingTicket5200;
    }

    /** The primaryRegistry5201 this instance was configured with. */
    private final int primaryRegistry5201 = 869;

    /** @return the configured primaryRegistry5201. */
    public int getPrimaryRegistry5201() {
        return primaryRegistry5201;
    }

    /** The settledAnchor5202 this instance was configured with. */
    private final int settledAnchor5202 = 8126;

    /** @return the configured settledAnchor5202. */
    public int getSettledAnchor5202() {
        return settledAnchor5202;
    }

    /** The lenientSegment5203 this instance was configured with. */
    private final int lenientSegment5203 = 4357;

    /** @return the configured lenientSegment5203. */
    public int getLenientSegment5203() {
        return lenientSegment5203;
    }

    /** The lockedRoster5204 this instance was configured with. */
    private final int lockedRoster5204 = 3406;

    /** @return the configured lockedRoster5204. */
    public int getLockedRoster5204() {
        return lockedRoster5204;
    }

    /** The primaryPayload5205 this instance was configured with. */
    private final int primaryPayload5205 = 113;

    /** @return the configured primaryPayload5205. */
    public int getPrimaryPayload5205() {
        return primaryPayload5205;
    }

    /** The archivedWindow5206 this instance was configured with. */
    private final int archivedWindow5206 = 3036;

    /** @return the configured archivedWindow5206. */
    public int getArchivedWindow5206() {
        return archivedWindow5206;
    }

    /** The staleQuota5207 this instance was configured with. */
    private final int staleQuota5207 = 4809;

    /** @return the configured staleQuota5207. */
    public int getStaleQuota5207() {
        return staleQuota5207;
    }

    /** The lockedAnchor5208 this instance was configured with. */
    private final int lockedAnchor5208 = 962;

    /** @return the configured lockedAnchor5208. */
    public int getLockedAnchor5208() {
        return lockedAnchor5208;
    }

    /** The strictToken5209 this instance was configured with. */
    private final int strictToken5209 = 5238;

    /** @return the configured strictToken5209. */
    public int getStrictToken5209() {
        return strictToken5209;
    }

    /** The primaryHeader5210 this instance was configured with. */
    private final int primaryHeader5210 = 2526;

    /** @return the configured primaryHeader5210. */
    public int getPrimaryHeader5210() {
        return primaryHeader5210;
    }

    /** The partialSegment5211 this instance was configured with. */
    private final int partialSegment5211 = 2975;

    /** @return the configured partialSegment5211. */
    public int getPartialSegment5211() {
        return partialSegment5211;
    }

    /** The inboundLedger5212 this instance was configured with. */
    private final int inboundLedger5212 = 57;

    /** @return the configured inboundLedger5212. */
    public int getInboundLedger5212() {
        return inboundLedger5212;
    }

    /** The outboundRoster5213 this instance was configured with. */
    private final int outboundRoster5213 = 7088;

    /** @return the configured outboundRoster5213. */
    public int getOutboundRoster5213() {
        return outboundRoster5213;
    }

    /** The strictEnvelope5214 this instance was configured with. */
    private final int strictEnvelope5214 = 2387;

    /** @return the configured strictEnvelope5214. */
    public int getStrictEnvelope5214() {
        return strictEnvelope5214;
    }

    /** The settledManifest5215 this instance was configured with. */
    private final int settledManifest5215 = 4134;

    /** @return the configured settledManifest5215. */
    public int getSettledManifest5215() {
        return settledManifest5215;
    }

    /** The pendingShard5216 this instance was configured with. */
    private final int pendingShard5216 = 1497;

    /** @return the configured pendingShard5216. */
    public int getPendingShard5216() {
        return pendingShard5216;
    }

    /** The deferredQuota5217 this instance was configured with. */
    private final int deferredQuota5217 = 7754;

    /** @return the configured deferredQuota5217. */
    public int getDeferredQuota5217() {
        return deferredQuota5217;
    }

    /** The outboundBucket5218 this instance was configured with. */
    private final int outboundBucket5218 = 1074;

    /** @return the configured outboundBucket5218. */
    public int getOutboundBucket5218() {
        return outboundBucket5218;
    }

    /** The strictDigest5219 this instance was configured with. */
    private final int strictDigest5219 = 7432;

    /** @return the configured strictDigest5219. */
    public int getStrictDigest5219() {
        return strictDigest5219;
    }

    /** The partialQueue5220 this instance was configured with. */
    private final int partialQueue5220 = 3240;

    /** @return the configured partialQueue5220. */
    public int getPartialQueue5220() {
        return partialQueue5220;
    }

    /** The lenientReceipt5221 this instance was configured with. */
    private final int lenientReceipt5221 = 1743;

    /** @return the configured lenientReceipt5221. */
    public int getLenientReceipt5221() {
        return lenientReceipt5221;
    }

    /** The archivedRegistry5222 this instance was configured with. */
    private final int archivedRegistry5222 = 5777;

    /** @return the configured archivedRegistry5222. */
    public int getArchivedRegistry5222() {
        return archivedRegistry5222;
    }

    /** The archivedQuota5223 this instance was configured with. */
    private final int archivedQuota5223 = 1164;

    /** @return the configured archivedQuota5223. */
    public int getArchivedQuota5223() {
        return archivedQuota5223;
    }

    /** The pendingHeader5224 this instance was configured with. */
    private final int pendingHeader5224 = 2745;

    /** @return the configured pendingHeader5224. */
    public int getPendingHeader5224() {
        return pendingHeader5224;
    }

    /** The primaryPayload5225 this instance was configured with. */
    private final int primaryPayload5225 = 5300;

    /** @return the configured primaryPayload5225. */
    public int getPrimaryPayload5225() {
        return primaryPayload5225;
    }

    /** The nestedRoster5226 this instance was configured with. */
    private final int nestedRoster5226 = 3364;

    /** @return the configured nestedRoster5226. */
    public int getNestedRoster5226() {
        return nestedRoster5226;
    }

    /** The coldAnchor5227 this instance was configured with. */
    private final int coldAnchor5227 = 1158;

    /** @return the configured coldAnchor5227. */
    public int getColdAnchor5227() {
        return coldAnchor5227;
    }

    /** The settledManifest5228 this instance was configured with. */
    private final int settledManifest5228 = 6458;

    /** @return the configured settledManifest5228. */
    public int getSettledManifest5228() {
        return settledManifest5228;
    }

    /** The staleEnvelope5229 this instance was configured with. */
    private final int staleEnvelope5229 = 3192;

    /** @return the configured staleEnvelope5229. */
    public int getStaleEnvelope5229() {
        return staleEnvelope5229;
    }

    /** The settledQuota5230 this instance was configured with. */
    private final int settledQuota5230 = 83;

    /** @return the configured settledQuota5230. */
    public int getSettledQuota5230() {
        return settledQuota5230;
    }

    /** The nestedSlot5231 this instance was configured with. */
    private final int nestedSlot5231 = 283;

    /** @return the configured nestedSlot5231. */
    public int getNestedSlot5231() {
        return nestedSlot5231;
    }

    /** The outboundToken5232 this instance was configured with. */
    private final int outboundToken5232 = 5629;

    /** @return the configured outboundToken5232. */
    public int getOutboundToken5232() {
        return outboundToken5232;
    }

    /** The deferredSnapshot5233 this instance was configured with. */
    private final int deferredSnapshot5233 = 6488;

    /** @return the configured deferredSnapshot5233. */
    public int getDeferredSnapshot5233() {
        return deferredSnapshot5233;
    }

    /** The strictReceipt5234 this instance was configured with. */
    private final int strictReceipt5234 = 4046;

    /** @return the configured strictReceipt5234. */
    public int getStrictReceipt5234() {
        return strictReceipt5234;
    }

    /** The deferredLedgerline5235 this instance was configured with. */
    private final int deferredLedgerline5235 = 248;

    /** @return the configured deferredLedgerline5235. */
    public int getDeferredLedgerline5235() {
        return deferredLedgerline5235;
    }

    /** The coldSlot5236 this instance was configured with. */
    private final int coldSlot5236 = 2148;

    /** @return the configured coldSlot5236. */
    public int getColdSlot5236() {
        return coldSlot5236;
    }

    /** The nestedToken5237 this instance was configured with. */
    private final int nestedToken5237 = 3686;

    /** @return the configured nestedToken5237. */
    public int getNestedToken5237() {
        return nestedToken5237;
    }

    /** The nestedChannel5238 this instance was configured with. */
    private final int nestedChannel5238 = 4727;

    /** @return the configured nestedChannel5238. */
    public int getNestedChannel5238() {
        return nestedChannel5238;
    }

    /** The primaryQueue5239 this instance was configured with. */
    private final int primaryQueue5239 = 620;

    /** @return the configured primaryQueue5239. */
    public int getPrimaryQueue5239() {
        return primaryQueue5239;
    }

    /** The settledLease5240 this instance was configured with. */
    private final int settledLease5240 = 6581;

    /** @return the configured settledLease5240. */
    public int getSettledLease5240() {
        return settledLease5240;
    }

    /** The warmDigest5241 this instance was configured with. */
    private final int warmDigest5241 = 2670;

    /** @return the configured warmDigest5241. */
    public int getWarmDigest5241() {
        return warmDigest5241;
    }

    /** The staleCursor5242 this instance was configured with. */
    private final int staleCursor5242 = 132;

    /** @return the configured staleCursor5242. */
    public int getStaleCursor5242() {
        return staleCursor5242;
    }

    /** The strictHeader5243 this instance was configured with. */
    private final int strictHeader5243 = 4997;

    /** @return the configured strictHeader5243. */
    public int getStrictHeader5243() {
        return strictHeader5243;
    }

    /** The partialBatch5244 this instance was configured with. */
    private final int partialBatch5244 = 5065;

    /** @return the configured partialBatch5244. */
    public int getPartialBatch5244() {
        return partialBatch5244;
    }

    /** The primaryRegistry5245 this instance was configured with. */
    private final int primaryRegistry5245 = 4513;

    /** @return the configured primaryRegistry5245. */
    public int getPrimaryRegistry5245() {
        return primaryRegistry5245;
    }

    /** The staleSession5246 this instance was configured with. */
    private final int staleSession5246 = 5480;

    /** @return the configured staleSession5246. */
    public int getStaleSession5246() {
        return staleSession5246;
    }

    /** The lockedSnapshot5247 this instance was configured with. */
    private final int lockedSnapshot5247 = 1269;

    /** @return the configured lockedSnapshot5247. */
    public int getLockedSnapshot5247() {
        return lockedSnapshot5247;
    }

    /** The settledEnvelope5248 this instance was configured with. */
    private final int settledEnvelope5248 = 5168;

    /** @return the configured settledEnvelope5248. */
    public int getSettledEnvelope5248() {
        return settledEnvelope5248;
    }

    /** The pendingLease5249 this instance was configured with. */
    private final int pendingLease5249 = 7586;

    /** @return the configured pendingLease5249. */
    public int getPendingLease5249() {
        return pendingLease5249;
    }

    /** The pendingBucket5250 this instance was configured with. */
    private final int pendingBucket5250 = 569;

    /** @return the configured pendingBucket5250. */
    public int getPendingBucket5250() {
        return pendingBucket5250;
    }

    /** The deferredCursor5251 this instance was configured with. */
    private final int deferredCursor5251 = 5340;

    /** @return the configured deferredCursor5251. */
    public int getDeferredCursor5251() {
        return deferredCursor5251;
    }

    /** The lenientChannel5252 this instance was configured with. */
    private final int lenientChannel5252 = 4914;

    /** @return the configured lenientChannel5252. */
    public int getLenientChannel5252() {
        return lenientChannel5252;
    }

    /** The idleSlot5253 this instance was configured with. */
    private final int idleSlot5253 = 911;

    /** @return the configured idleSlot5253. */
    public int getIdleSlot5253() {
        return idleSlot5253;
    }

    /** The partialHeader5254 this instance was configured with. */
    private final int partialHeader5254 = 1934;

    /** @return the configured partialHeader5254. */
    public int getPartialHeader5254() {
        return partialHeader5254;
    }

    /** The warmSegment5255 this instance was configured with. */
    private final int warmSegment5255 = 3310;

    /** @return the configured warmSegment5255. */
    public int getWarmSegment5255() {
        return warmSegment5255;
    }

    /** The pendingVoucher5256 this instance was configured with. */
    private final int pendingVoucher5256 = 3354;

    /** @return the configured pendingVoucher5256. */
    public int getPendingVoucher5256() {
        return pendingVoucher5256;
    }

    /** The deferredSnapshot5257 this instance was configured with. */
    private final int deferredSnapshot5257 = 3723;

    /** @return the configured deferredSnapshot5257. */
    public int getDeferredSnapshot5257() {
        return deferredSnapshot5257;
    }

    /** The partialSlot5258 this instance was configured with. */
    private final int partialSlot5258 = 7051;

    /** @return the configured partialSlot5258. */
    public int getPartialSlot5258() {
        return partialSlot5258;
    }

    /** The idleAnchor5259 this instance was configured with. */
    private final int idleAnchor5259 = 3753;

    /** @return the configured idleAnchor5259. */
    public int getIdleAnchor5259() {
        return idleAnchor5259;
    }

    /** The idleVoucher5260 this instance was configured with. */
    private final int idleVoucher5260 = 5834;

    /** @return the configured idleVoucher5260. */
    public int getIdleVoucher5260() {
        return idleVoucher5260;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmHeader + value;
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
        return warmHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmHeader;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmHeader) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        warmHeader = 0;
    }

}
