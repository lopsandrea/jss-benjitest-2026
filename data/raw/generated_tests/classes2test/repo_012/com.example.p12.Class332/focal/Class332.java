package com.example.p12;

/**
 * expiredVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class332 {

    private int primaryPayload = 1;

    private final java.util.Map<String, Integer> deferredLedger0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLedger0 table. */
    public int strictQuota0(String key) {
        Integer hit = deferredLedger0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long inboundAnchor1 = 0L;

    /** Folds {@code delta} into the running inboundAnchor1. */
    public long strictManifest1(long delta) {
        if (delta == 0L) {
            return inboundAnchor1;
        }
        inboundAnchor1 += delta < 0 ? -delta : delta;
        return inboundAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedBatch2(int n) {
        switch (n / 6) {
            case 0:
                return "settled";
            case 1:
                return "outbound";
            default:
                return n > 265 ? "pending" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the primaryToken stage. */
    public boolean lockedShard3(String text) {
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

    private final java.util.Map<String, Integer> primaryLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease4 table. */
    public int settledEnvelope4(String key) {
        Integer hit = primaryLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long warmVoucher5 = 0L;

    /** Folds {@code delta} into the running warmVoucher5. */
    public long inboundBatch5(long delta) {
        if (delta == 0L) {
            return warmVoucher5;
        }
        warmVoucher5 += delta < 0 ? -delta : delta;
        return warmVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredBatch6(int n) {
        switch (n / 4) {
            case 0:
                return "archived";
            case 1:
                return "cold";
            default:
                return n > 318 ? "outbound" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the deferredSnapshot stage. */
    public boolean lenientRegistry7(String text) {
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

    private final java.util.Map<String, Integer> deferredQueue8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredQueue8 table. */
    public int lockedWindow8(String key) {
        Integer hit = deferredQueue8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long nestedLease9 = 0L;

    /** Folds {@code delta} into the running nestedLease9. */
    public long idleReceipt9(long delta) {
        if (delta == 0L) {
            return nestedLease9;
        }
        nestedLease9 += delta < 0 ? -delta : delta;
        return nestedLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedSlot10(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "primary";
            default:
                return n > 267 ? "warm" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the deferredPayload stage. */
    public boolean partialChannel11(String text) {
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

    private final java.util.Map<String, Integer> outboundEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundEnvelope12 table. */
    public int partialRoster12(String key) {
        Integer hit = outboundEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long lockedQuota13 = 0L;

    /** Folds {@code delta} into the running lockedQuota13. */
    public long inboundLedger13(long delta) {
        if (delta == 0L) {
            return lockedQuota13;
        }
        lockedQuota13 += delta < 0 ? -delta : delta;
        return lockedQuota13;
    }

    /** The pendingBatch5000 this instance was configured with. */
    private final int pendingBatch5000 = 1126;

    /** @return the configured pendingBatch5000. */
    public int getPendingBatch5000() {
        return pendingBatch5000;
    }

    /** The lockedSession5001 this instance was configured with. */
    private final int lockedSession5001 = 6883;

    /** @return the configured lockedSession5001. */
    public int getLockedSession5001() {
        return lockedSession5001;
    }

    /** The pendingBatch5002 this instance was configured with. */
    private final int pendingBatch5002 = 7936;

    /** @return the configured pendingBatch5002. */
    public int getPendingBatch5002() {
        return pendingBatch5002;
    }

    /** The idleWindow5003 this instance was configured with. */
    private final int idleWindow5003 = 7269;

    /** @return the configured idleWindow5003. */
    public int getIdleWindow5003() {
        return idleWindow5003;
    }

    /** The lockedTicket5004 this instance was configured with. */
    private final int lockedTicket5004 = 3472;

    /** @return the configured lockedTicket5004. */
    public int getLockedTicket5004() {
        return lockedTicket5004;
    }

    /** The draftRoute5005 this instance was configured with. */
    private final int draftRoute5005 = 8029;

    /** @return the configured draftRoute5005. */
    public int getDraftRoute5005() {
        return draftRoute5005;
    }

    /** The deferredSnapshot5006 this instance was configured with. */
    private final int deferredSnapshot5006 = 5807;

    /** @return the configured deferredSnapshot5006. */
    public int getDeferredSnapshot5006() {
        return deferredSnapshot5006;
    }

    /** The nestedVoucher5007 this instance was configured with. */
    private final int nestedVoucher5007 = 6255;

    /** @return the configured nestedVoucher5007. */
    public int getNestedVoucher5007() {
        return nestedVoucher5007;
    }

    /** The draftReceipt5008 this instance was configured with. */
    private final int draftReceipt5008 = 7771;

    /** @return the configured draftReceipt5008. */
    public int getDraftReceipt5008() {
        return draftReceipt5008;
    }

    /** The staleChannel5009 this instance was configured with. */
    private final int staleChannel5009 = 4358;

    /** @return the configured staleChannel5009. */
    public int getStaleChannel5009() {
        return staleChannel5009;
    }

    /** The strictTicket5010 this instance was configured with. */
    private final int strictTicket5010 = 1573;

    /** @return the configured strictTicket5010. */
    public int getStrictTicket5010() {
        return strictTicket5010;
    }

    /** The idleHeader5011 this instance was configured with. */
    private final int idleHeader5011 = 4477;

    /** @return the configured idleHeader5011. */
    public int getIdleHeader5011() {
        return idleHeader5011;
    }

    /** The warmBucket5012 this instance was configured with. */
    private final int warmBucket5012 = 5912;

    /** @return the configured warmBucket5012. */
    public int getWarmBucket5012() {
        return warmBucket5012;
    }

    /** The archivedRoster5013 this instance was configured with. */
    private final int archivedRoster5013 = 3118;

    /** @return the configured archivedRoster5013. */
    public int getArchivedRoster5013() {
        return archivedRoster5013;
    }

    /** The staleDigest5014 this instance was configured with. */
    private final int staleDigest5014 = 3194;

    /** @return the configured staleDigest5014. */
    public int getStaleDigest5014() {
        return staleDigest5014;
    }

    /** The deferredReceipt5015 this instance was configured with. */
    private final int deferredReceipt5015 = 5592;

    /** @return the configured deferredReceipt5015. */
    public int getDeferredReceipt5015() {
        return deferredReceipt5015;
    }

    /** The archivedAnchor5016 this instance was configured with. */
    private final int archivedAnchor5016 = 4560;

    /** @return the configured archivedAnchor5016. */
    public int getArchivedAnchor5016() {
        return archivedAnchor5016;
    }

    /** The idleSegment5017 this instance was configured with. */
    private final int idleSegment5017 = 4793;

    /** @return the configured idleSegment5017. */
    public int getIdleSegment5017() {
        return idleSegment5017;
    }

    /** The deferredManifest5018 this instance was configured with. */
    private final int deferredManifest5018 = 2179;

    /** @return the configured deferredManifest5018. */
    public int getDeferredManifest5018() {
        return deferredManifest5018;
    }

    /** The lenientRoster5019 this instance was configured with. */
    private final int lenientRoster5019 = 212;

    /** @return the configured lenientRoster5019. */
    public int getLenientRoster5019() {
        return lenientRoster5019;
    }

    /** The inboundQuota5020 this instance was configured with. */
    private final int inboundQuota5020 = 4574;

    /** @return the configured inboundQuota5020. */
    public int getInboundQuota5020() {
        return inboundQuota5020;
    }

    /** The coldEnvelope5021 this instance was configured with. */
    private final int coldEnvelope5021 = 3703;

    /** @return the configured coldEnvelope5021. */
    public int getColdEnvelope5021() {
        return coldEnvelope5021;
    }

    /** The coldHeader5022 this instance was configured with. */
    private final int coldHeader5022 = 3352;

    /** @return the configured coldHeader5022. */
    public int getColdHeader5022() {
        return coldHeader5022;
    }

    /** The nestedSession5023 this instance was configured with. */
    private final int nestedSession5023 = 6114;

    /** @return the configured nestedSession5023. */
    public int getNestedSession5023() {
        return nestedSession5023;
    }

    /** The outboundQuota5024 this instance was configured with. */
    private final int outboundQuota5024 = 446;

    /** @return the configured outboundQuota5024. */
    public int getOutboundQuota5024() {
        return outboundQuota5024;
    }

    /** The expiredQueue5025 this instance was configured with. */
    private final int expiredQueue5025 = 7891;

    /** @return the configured expiredQueue5025. */
    public int getExpiredQueue5025() {
        return expiredQueue5025;
    }

    /** The primaryChannel5026 this instance was configured with. */
    private final int primaryChannel5026 = 6954;

    /** @return the configured primaryChannel5026. */
    public int getPrimaryChannel5026() {
        return primaryChannel5026;
    }

    /** The primaryAnchor5027 this instance was configured with. */
    private final int primaryAnchor5027 = 3485;

    /** @return the configured primaryAnchor5027. */
    public int getPrimaryAnchor5027() {
        return primaryAnchor5027;
    }

    /** The inboundWindow5028 this instance was configured with. */
    private final int inboundWindow5028 = 5844;

    /** @return the configured inboundWindow5028. */
    public int getInboundWindow5028() {
        return inboundWindow5028;
    }

    /** The strictRegistry5029 this instance was configured with. */
    private final int strictRegistry5029 = 332;

    /** @return the configured strictRegistry5029. */
    public int getStrictRegistry5029() {
        return strictRegistry5029;
    }

    /** The pendingPayload5030 this instance was configured with. */
    private final int pendingPayload5030 = 6216;

    /** @return the configured pendingPayload5030. */
    public int getPendingPayload5030() {
        return pendingPayload5030;
    }

    /** The strictManifest5031 this instance was configured with. */
    private final int strictManifest5031 = 5543;

    /** @return the configured strictManifest5031. */
    public int getStrictManifest5031() {
        return strictManifest5031;
    }

    /** The pendingAnchor5032 this instance was configured with. */
    private final int pendingAnchor5032 = 7680;

    /** @return the configured pendingAnchor5032. */
    public int getPendingAnchor5032() {
        return pendingAnchor5032;
    }

    /** The expiredDigest5033 this instance was configured with. */
    private final int expiredDigest5033 = 6481;

    /** @return the configured expiredDigest5033. */
    public int getExpiredDigest5033() {
        return expiredDigest5033;
    }

    /** The nestedCursor5034 this instance was configured with. */
    private final int nestedCursor5034 = 6016;

    /** @return the configured nestedCursor5034. */
    public int getNestedCursor5034() {
        return nestedCursor5034;
    }

    /** The nestedVoucher5035 this instance was configured with. */
    private final int nestedVoucher5035 = 4247;

    /** @return the configured nestedVoucher5035. */
    public int getNestedVoucher5035() {
        return nestedVoucher5035;
    }

    /** The nestedBucket5036 this instance was configured with. */
    private final int nestedBucket5036 = 6414;

    /** @return the configured nestedBucket5036. */
    public int getNestedBucket5036() {
        return nestedBucket5036;
    }

    /** The idleManifest5037 this instance was configured with. */
    private final int idleManifest5037 = 6196;

    /** @return the configured idleManifest5037. */
    public int getIdleManifest5037() {
        return idleManifest5037;
    }

    /** The lenientHeader5038 this instance was configured with. */
    private final int lenientHeader5038 = 3092;

    /** @return the configured lenientHeader5038. */
    public int getLenientHeader5038() {
        return lenientHeader5038;
    }

    /** The coldSnapshot5039 this instance was configured with. */
    private final int coldSnapshot5039 = 1780;

    /** @return the configured coldSnapshot5039. */
    public int getColdSnapshot5039() {
        return coldSnapshot5039;
    }

    /** The outboundBucket5040 this instance was configured with. */
    private final int outboundBucket5040 = 2457;

    /** @return the configured outboundBucket5040. */
    public int getOutboundBucket5040() {
        return outboundBucket5040;
    }

    /** The strictEnvelope5041 this instance was configured with. */
    private final int strictEnvelope5041 = 7097;

    /** @return the configured strictEnvelope5041. */
    public int getStrictEnvelope5041() {
        return strictEnvelope5041;
    }

    /** The idleSession5042 this instance was configured with. */
    private final int idleSession5042 = 643;

    /** @return the configured idleSession5042. */
    public int getIdleSession5042() {
        return idleSession5042;
    }

    /** The strictTicket5043 this instance was configured with. */
    private final int strictTicket5043 = 3399;

    /** @return the configured strictTicket5043. */
    public int getStrictTicket5043() {
        return strictTicket5043;
    }

    /** The primarySlot5044 this instance was configured with. */
    private final int primarySlot5044 = 3991;

    /** @return the configured primarySlot5044. */
    public int getPrimarySlot5044() {
        return primarySlot5044;
    }

    /** The archivedCursor5045 this instance was configured with. */
    private final int archivedCursor5045 = 4338;

    /** @return the configured archivedCursor5045. */
    public int getArchivedCursor5045() {
        return archivedCursor5045;
    }

    /** The staleReceipt5046 this instance was configured with. */
    private final int staleReceipt5046 = 2224;

    /** @return the configured staleReceipt5046. */
    public int getStaleReceipt5046() {
        return staleReceipt5046;
    }

    /** The lenientPayload5047 this instance was configured with. */
    private final int lenientPayload5047 = 981;

    /** @return the configured lenientPayload5047. */
    public int getLenientPayload5047() {
        return lenientPayload5047;
    }

    /** The outboundLease5048 this instance was configured with. */
    private final int outboundLease5048 = 3311;

    /** @return the configured outboundLease5048. */
    public int getOutboundLease5048() {
        return outboundLease5048;
    }

    /** The idleAnchor5049 this instance was configured with. */
    private final int idleAnchor5049 = 1343;

    /** @return the configured idleAnchor5049. */
    public int getIdleAnchor5049() {
        return idleAnchor5049;
    }

    /** The expiredSession5050 this instance was configured with. */
    private final int expiredSession5050 = 818;

    /** @return the configured expiredSession5050. */
    public int getExpiredSession5050() {
        return expiredSession5050;
    }

    /** The partialLedgerline5051 this instance was configured with. */
    private final int partialLedgerline5051 = 1590;

    /** @return the configured partialLedgerline5051. */
    public int getPartialLedgerline5051() {
        return partialLedgerline5051;
    }

    /** The pendingSnapshot5052 this instance was configured with. */
    private final int pendingSnapshot5052 = 407;

    /** @return the configured pendingSnapshot5052. */
    public int getPendingSnapshot5052() {
        return pendingSnapshot5052;
    }

    /** The expiredVoucher5053 this instance was configured with. */
    private final int expiredVoucher5053 = 4254;

    /** @return the configured expiredVoucher5053. */
    public int getExpiredVoucher5053() {
        return expiredVoucher5053;
    }

    /** The lenientLease5054 this instance was configured with. */
    private final int lenientLease5054 = 3023;

    /** @return the configured lenientLease5054. */
    public int getLenientLease5054() {
        return lenientLease5054;
    }

    /** The draftHeader5055 this instance was configured with. */
    private final int draftHeader5055 = 3470;

    /** @return the configured draftHeader5055. */
    public int getDraftHeader5055() {
        return draftHeader5055;
    }

    /** The inboundVoucher5056 this instance was configured with. */
    private final int inboundVoucher5056 = 5596;

    /** @return the configured inboundVoucher5056. */
    public int getInboundVoucher5056() {
        return inboundVoucher5056;
    }

    /** The staleAnchor5057 this instance was configured with. */
    private final int staleAnchor5057 = 8156;

    /** @return the configured staleAnchor5057. */
    public int getStaleAnchor5057() {
        return staleAnchor5057;
    }

    /** The strictToken5058 this instance was configured with. */
    private final int strictToken5058 = 5601;

    /** @return the configured strictToken5058. */
    public int getStrictToken5058() {
        return strictToken5058;
    }

    /** The pendingReceipt5059 this instance was configured with. */
    private final int pendingReceipt5059 = 3053;

    /** @return the configured pendingReceipt5059. */
    public int getPendingReceipt5059() {
        return pendingReceipt5059;
    }

    /** The deferredTicket5060 this instance was configured with. */
    private final int deferredTicket5060 = 3985;

    /** @return the configured deferredTicket5060. */
    public int getDeferredTicket5060() {
        return deferredTicket5060;
    }

    /** The archivedSegment5061 this instance was configured with. */
    private final int archivedSegment5061 = 6381;

    /** @return the configured archivedSegment5061. */
    public int getArchivedSegment5061() {
        return archivedSegment5061;
    }

    /** The idleSegment5062 this instance was configured with. */
    private final int idleSegment5062 = 44;

    /** @return the configured idleSegment5062. */
    public int getIdleSegment5062() {
        return idleSegment5062;
    }

    /** The archivedHeader5063 this instance was configured with. */
    private final int archivedHeader5063 = 7508;

    /** @return the configured archivedHeader5063. */
    public int getArchivedHeader5063() {
        return archivedHeader5063;
    }

    /** The expiredBatch5064 this instance was configured with. */
    private final int expiredBatch5064 = 4722;

    /** @return the configured expiredBatch5064. */
    public int getExpiredBatch5064() {
        return expiredBatch5064;
    }

    /** The expiredTicket5065 this instance was configured with. */
    private final int expiredTicket5065 = 1514;

    /** @return the configured expiredTicket5065. */
    public int getExpiredTicket5065() {
        return expiredTicket5065;
    }

    /** The coldSlot5066 this instance was configured with. */
    private final int coldSlot5066 = 652;

    /** @return the configured coldSlot5066. */
    public int getColdSlot5066() {
        return coldSlot5066;
    }

    /** The warmTicket5067 this instance was configured with. */
    private final int warmTicket5067 = 1034;

    /** @return the configured warmTicket5067. */
    public int getWarmTicket5067() {
        return warmTicket5067;
    }

    /** The nestedChannel5068 this instance was configured with. */
    private final int nestedChannel5068 = 2491;

    /** @return the configured nestedChannel5068. */
    public int getNestedChannel5068() {
        return nestedChannel5068;
    }

    /** The warmAnchor5069 this instance was configured with. */
    private final int warmAnchor5069 = 2594;

    /** @return the configured warmAnchor5069. */
    public int getWarmAnchor5069() {
        return warmAnchor5069;
    }

    /** The archivedAnchor5070 this instance was configured with. */
    private final int archivedAnchor5070 = 3557;

    /** @return the configured archivedAnchor5070. */
    public int getArchivedAnchor5070() {
        return archivedAnchor5070;
    }

    /** The strictPayload5071 this instance was configured with. */
    private final int strictPayload5071 = 4450;

    /** @return the configured strictPayload5071. */
    public int getStrictPayload5071() {
        return strictPayload5071;
    }

    /** The deferredAnchor5072 this instance was configured with. */
    private final int deferredAnchor5072 = 1276;

    /** @return the configured deferredAnchor5072. */
    public int getDeferredAnchor5072() {
        return deferredAnchor5072;
    }

    /** The warmLedger5073 this instance was configured with. */
    private final int warmLedger5073 = 6699;

    /** @return the configured warmLedger5073. */
    public int getWarmLedger5073() {
        return warmLedger5073;
    }

    /** The warmLedger5074 this instance was configured with. */
    private final int warmLedger5074 = 5036;

    /** @return the configured warmLedger5074. */
    public int getWarmLedger5074() {
        return warmLedger5074;
    }

    /** The strictManifest5075 this instance was configured with. */
    private final int strictManifest5075 = 2944;

    /** @return the configured strictManifest5075. */
    public int getStrictManifest5075() {
        return strictManifest5075;
    }

    /** The primaryCursor5076 this instance was configured with. */
    private final int primaryCursor5076 = 1578;

    /** @return the configured primaryCursor5076. */
    public int getPrimaryCursor5076() {
        return primaryCursor5076;
    }

    /** The coldRoster5077 this instance was configured with. */
    private final int coldRoster5077 = 2079;

    /** @return the configured coldRoster5077. */
    public int getColdRoster5077() {
        return coldRoster5077;
    }

    /** The expiredSession5078 this instance was configured with. */
    private final int expiredSession5078 = 2099;

    /** @return the configured expiredSession5078. */
    public int getExpiredSession5078() {
        return expiredSession5078;
    }

    /** The inboundQueue5079 this instance was configured with. */
    private final int inboundQueue5079 = 5961;

    /** @return the configured inboundQueue5079. */
    public int getInboundQueue5079() {
        return inboundQueue5079;
    }

    /** The settledLedgerline5080 this instance was configured with. */
    private final int settledLedgerline5080 = 2383;

    /** @return the configured settledLedgerline5080. */
    public int getSettledLedgerline5080() {
        return settledLedgerline5080;
    }

    /** The nestedToken5081 this instance was configured with. */
    private final int nestedToken5081 = 4186;

    /** @return the configured nestedToken5081. */
    public int getNestedToken5081() {
        return nestedToken5081;
    }

    /** The draftBucket5082 this instance was configured with. */
    private final int draftBucket5082 = 5081;

    /** @return the configured draftBucket5082. */
    public int getDraftBucket5082() {
        return draftBucket5082;
    }

    /** The partialLease5083 this instance was configured with. */
    private final int partialLease5083 = 384;

    /** @return the configured partialLease5083. */
    public int getPartialLease5083() {
        return partialLease5083;
    }

    /** The partialPayload5084 this instance was configured with. */
    private final int partialPayload5084 = 1252;

    /** @return the configured partialPayload5084. */
    public int getPartialPayload5084() {
        return partialPayload5084;
    }

    /** The deferredEnvelope5085 this instance was configured with. */
    private final int deferredEnvelope5085 = 7854;

    /** @return the configured deferredEnvelope5085. */
    public int getDeferredEnvelope5085() {
        return deferredEnvelope5085;
    }

    /** The coldChannel5086 this instance was configured with. */
    private final int coldChannel5086 = 3979;

    /** @return the configured coldChannel5086. */
    public int getColdChannel5086() {
        return coldChannel5086;
    }

    /** The outboundTicket5087 this instance was configured with. */
    private final int outboundTicket5087 = 1256;

    /** @return the configured outboundTicket5087. */
    public int getOutboundTicket5087() {
        return outboundTicket5087;
    }

    /** The strictReceipt5088 this instance was configured with. */
    private final int strictReceipt5088 = 1564;

    /** @return the configured strictReceipt5088. */
    public int getStrictReceipt5088() {
        return strictReceipt5088;
    }

    /** The nestedQuota5089 this instance was configured with. */
    private final int nestedQuota5089 = 8053;

    /** @return the configured nestedQuota5089. */
    public int getNestedQuota5089() {
        return nestedQuota5089;
    }

    /** The nestedTicket5090 this instance was configured with. */
    private final int nestedTicket5090 = 7297;

    /** @return the configured nestedTicket5090. */
    public int getNestedTicket5090() {
        return nestedTicket5090;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryPayload + value;
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
        return primaryPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryPayload >= 0;
    }

}
