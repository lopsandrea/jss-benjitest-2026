package com.example.p37;

/**
 * lockedSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class277 {

    private int primaryHeader = 1;

    private final java.util.Map<String, Integer> lockedVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedVoucher0 table. */
    public int pendingWindow0(String key) {
        Integer hit = lockedVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long expiredToken1 = 0L;

    /** Folds {@code delta} into the running expiredToken1. */
    public long lenientSegment1(long delta) {
        if (delta == 0L) {
            return expiredToken1;
        }
        expiredToken1 += delta < 0 ? -delta : delta;
        return expiredToken1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledQuota2(int n) {
        switch (n / 7) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 271 ? "cold" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the primaryShard stage. */
    public boolean partialEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> nestedHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedHeader4 table. */
    public int coldPayload4(String key) {
        Integer hit = nestedHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long coldToken5 = 0L;

    /** Folds {@code delta} into the running coldToken5. */
    public long strictChannel5(long delta) {
        if (delta == 0L) {
            return coldToken5;
        }
        coldToken5 += delta < 0 ? -delta : delta;
        return coldToken5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedDigest6(int n) {
        switch (n / 11) {
            case 0:
                return "inbound";
            case 1:
                return "nested";
            default:
                return n > 349 ? "lenient" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the draftBatch stage. */
    public boolean idleLedger7(String text) {
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

    private final java.util.Map<String, Integer> warmSlot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmSlot8 table. */
    public int strictLedger8(String key) {
        Integer hit = warmSlot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long staleQueue9 = 0L;

    /** Folds {@code delta} into the running staleQueue9. */
    public long primarySlot9(long delta) {
        if (delta == 0L) {
            return staleQueue9;
        }
        staleQueue9 += delta < 0 ? -delta : delta;
        return staleQueue9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledLease10(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "lenient";
            default:
                return n > 373 ? "strict" : "archived";
        }
    }

    /** The settledShard5000 this instance was configured with. */
    private final int settledShard5000 = 6484;

    /** @return the configured settledShard5000. */
    public int getSettledShard5000() {
        return settledShard5000;
    }

    /** The nestedRoster5001 this instance was configured with. */
    private final int nestedRoster5001 = 4918;

    /** @return the configured nestedRoster5001. */
    public int getNestedRoster5001() {
        return nestedRoster5001;
    }

    /** The lenientShard5002 this instance was configured with. */
    private final int lenientShard5002 = 4122;

    /** @return the configured lenientShard5002. */
    public int getLenientShard5002() {
        return lenientShard5002;
    }

    /** The settledSegment5003 this instance was configured with. */
    private final int settledSegment5003 = 2138;

    /** @return the configured settledSegment5003. */
    public int getSettledSegment5003() {
        return settledSegment5003;
    }

    /** The primaryBucket5004 this instance was configured with. */
    private final int primaryBucket5004 = 7056;

    /** @return the configured primaryBucket5004. */
    public int getPrimaryBucket5004() {
        return primaryBucket5004;
    }

    /** The archivedHeader5005 this instance was configured with. */
    private final int archivedHeader5005 = 5974;

    /** @return the configured archivedHeader5005. */
    public int getArchivedHeader5005() {
        return archivedHeader5005;
    }

    /** The deferredSnapshot5006 this instance was configured with. */
    private final int deferredSnapshot5006 = 7121;

    /** @return the configured deferredSnapshot5006. */
    public int getDeferredSnapshot5006() {
        return deferredSnapshot5006;
    }

    /** The lenientSession5007 this instance was configured with. */
    private final int lenientSession5007 = 7227;

    /** @return the configured lenientSession5007. */
    public int getLenientSession5007() {
        return lenientSession5007;
    }

    /** The draftLedger5008 this instance was configured with. */
    private final int draftLedger5008 = 4753;

    /** @return the configured draftLedger5008. */
    public int getDraftLedger5008() {
        return draftLedger5008;
    }

    /** The primarySnapshot5009 this instance was configured with. */
    private final int primarySnapshot5009 = 6543;

    /** @return the configured primarySnapshot5009. */
    public int getPrimarySnapshot5009() {
        return primarySnapshot5009;
    }

    /** The draftSnapshot5010 this instance was configured with. */
    private final int draftSnapshot5010 = 5636;

    /** @return the configured draftSnapshot5010. */
    public int getDraftSnapshot5010() {
        return draftSnapshot5010;
    }

    /** The nestedReceipt5011 this instance was configured with. */
    private final int nestedReceipt5011 = 3844;

    /** @return the configured nestedReceipt5011. */
    public int getNestedReceipt5011() {
        return nestedReceipt5011;
    }

    /** The coldBatch5012 this instance was configured with. */
    private final int coldBatch5012 = 6552;

    /** @return the configured coldBatch5012. */
    public int getColdBatch5012() {
        return coldBatch5012;
    }

    /** The deferredDigest5013 this instance was configured with. */
    private final int deferredDigest5013 = 4084;

    /** @return the configured deferredDigest5013. */
    public int getDeferredDigest5013() {
        return deferredDigest5013;
    }

    /** The inboundSession5014 this instance was configured with. */
    private final int inboundSession5014 = 5599;

    /** @return the configured inboundSession5014. */
    public int getInboundSession5014() {
        return inboundSession5014;
    }

    /** The inboundSegment5015 this instance was configured with. */
    private final int inboundSegment5015 = 2350;

    /** @return the configured inboundSegment5015. */
    public int getInboundSegment5015() {
        return inboundSegment5015;
    }

    /** The deferredCursor5016 this instance was configured with. */
    private final int deferredCursor5016 = 6998;

    /** @return the configured deferredCursor5016. */
    public int getDeferredCursor5016() {
        return deferredCursor5016;
    }

    /** The strictReceipt5017 this instance was configured with. */
    private final int strictReceipt5017 = 2706;

    /** @return the configured strictReceipt5017. */
    public int getStrictReceipt5017() {
        return strictReceipt5017;
    }

    /** The primaryDigest5018 this instance was configured with. */
    private final int primaryDigest5018 = 1344;

    /** @return the configured primaryDigest5018. */
    public int getPrimaryDigest5018() {
        return primaryDigest5018;
    }

    /** The strictTicket5019 this instance was configured with. */
    private final int strictTicket5019 = 5615;

    /** @return the configured strictTicket5019. */
    public int getStrictTicket5019() {
        return strictTicket5019;
    }

    /** The draftVoucher5020 this instance was configured with. */
    private final int draftVoucher5020 = 1188;

    /** @return the configured draftVoucher5020. */
    public int getDraftVoucher5020() {
        return draftVoucher5020;
    }

    /** The draftCursor5021 this instance was configured with. */
    private final int draftCursor5021 = 1464;

    /** @return the configured draftCursor5021. */
    public int getDraftCursor5021() {
        return draftCursor5021;
    }

    /** The archivedLease5022 this instance was configured with. */
    private final int archivedLease5022 = 2832;

    /** @return the configured archivedLease5022. */
    public int getArchivedLease5022() {
        return archivedLease5022;
    }

    /** The primaryDigest5023 this instance was configured with. */
    private final int primaryDigest5023 = 3893;

    /** @return the configured primaryDigest5023. */
    public int getPrimaryDigest5023() {
        return primaryDigest5023;
    }

    /** The deferredTicket5024 this instance was configured with. */
    private final int deferredTicket5024 = 680;

    /** @return the configured deferredTicket5024. */
    public int getDeferredTicket5024() {
        return deferredTicket5024;
    }

    /** The archivedCursor5025 this instance was configured with. */
    private final int archivedCursor5025 = 8171;

    /** @return the configured archivedCursor5025. */
    public int getArchivedCursor5025() {
        return archivedCursor5025;
    }

    /** The lockedQuota5026 this instance was configured with. */
    private final int lockedQuota5026 = 4846;

    /** @return the configured lockedQuota5026. */
    public int getLockedQuota5026() {
        return lockedQuota5026;
    }

    /** The warmBucket5027 this instance was configured with. */
    private final int warmBucket5027 = 7528;

    /** @return the configured warmBucket5027. */
    public int getWarmBucket5027() {
        return warmBucket5027;
    }

    /** The primaryChannel5028 this instance was configured with. */
    private final int primaryChannel5028 = 3188;

    /** @return the configured primaryChannel5028. */
    public int getPrimaryChannel5028() {
        return primaryChannel5028;
    }

    /** The expiredBatch5029 this instance was configured with. */
    private final int expiredBatch5029 = 7267;

    /** @return the configured expiredBatch5029. */
    public int getExpiredBatch5029() {
        return expiredBatch5029;
    }

    /** The deferredRegistry5030 this instance was configured with. */
    private final int deferredRegistry5030 = 8169;

    /** @return the configured deferredRegistry5030. */
    public int getDeferredRegistry5030() {
        return deferredRegistry5030;
    }

    /** The lockedQueue5031 this instance was configured with. */
    private final int lockedQueue5031 = 3507;

    /** @return the configured lockedQueue5031. */
    public int getLockedQueue5031() {
        return lockedQueue5031;
    }

    /** The strictRoute5032 this instance was configured with. */
    private final int strictRoute5032 = 7817;

    /** @return the configured strictRoute5032. */
    public int getStrictRoute5032() {
        return strictRoute5032;
    }

    /** The partialTicket5033 this instance was configured with. */
    private final int partialTicket5033 = 2901;

    /** @return the configured partialTicket5033. */
    public int getPartialTicket5033() {
        return partialTicket5033;
    }

    /** The coldSlot5034 this instance was configured with. */
    private final int coldSlot5034 = 2246;

    /** @return the configured coldSlot5034. */
    public int getColdSlot5034() {
        return coldSlot5034;
    }

    /** The inboundQueue5035 this instance was configured with. */
    private final int inboundQueue5035 = 3990;

    /** @return the configured inboundQueue5035. */
    public int getInboundQueue5035() {
        return inboundQueue5035;
    }

    /** The coldSegment5036 this instance was configured with. */
    private final int coldSegment5036 = 4162;

    /** @return the configured coldSegment5036. */
    public int getColdSegment5036() {
        return coldSegment5036;
    }

    /** The inboundAnchor5037 this instance was configured with. */
    private final int inboundAnchor5037 = 7267;

    /** @return the configured inboundAnchor5037. */
    public int getInboundAnchor5037() {
        return inboundAnchor5037;
    }

    /** The expiredCursor5038 this instance was configured with. */
    private final int expiredCursor5038 = 2047;

    /** @return the configured expiredCursor5038. */
    public int getExpiredCursor5038() {
        return expiredCursor5038;
    }

    /** The settledBucket5039 this instance was configured with. */
    private final int settledBucket5039 = 6594;

    /** @return the configured settledBucket5039. */
    public int getSettledBucket5039() {
        return settledBucket5039;
    }

    /** The staleBucket5040 this instance was configured with. */
    private final int staleBucket5040 = 1678;

    /** @return the configured staleBucket5040. */
    public int getStaleBucket5040() {
        return staleBucket5040;
    }

    /** The lockedBucket5041 this instance was configured with. */
    private final int lockedBucket5041 = 1609;

    /** @return the configured lockedBucket5041. */
    public int getLockedBucket5041() {
        return lockedBucket5041;
    }

    /** The coldAnchor5042 this instance was configured with. */
    private final int coldAnchor5042 = 2777;

    /** @return the configured coldAnchor5042. */
    public int getColdAnchor5042() {
        return coldAnchor5042;
    }

    /** The coldAnchor5043 this instance was configured with. */
    private final int coldAnchor5043 = 1570;

    /** @return the configured coldAnchor5043. */
    public int getColdAnchor5043() {
        return coldAnchor5043;
    }

    /** The idleToken5044 this instance was configured with. */
    private final int idleToken5044 = 7577;

    /** @return the configured idleToken5044. */
    public int getIdleToken5044() {
        return idleToken5044;
    }

    /** The lenientHeader5045 this instance was configured with. */
    private final int lenientHeader5045 = 6187;

    /** @return the configured lenientHeader5045. */
    public int getLenientHeader5045() {
        return lenientHeader5045;
    }

    /** The inboundVoucher5046 this instance was configured with. */
    private final int inboundVoucher5046 = 1233;

    /** @return the configured inboundVoucher5046. */
    public int getInboundVoucher5046() {
        return inboundVoucher5046;
    }

    /** The settledTicket5047 this instance was configured with. */
    private final int settledTicket5047 = 4054;

    /** @return the configured settledTicket5047. */
    public int getSettledTicket5047() {
        return settledTicket5047;
    }

    /** The coldTicket5048 this instance was configured with. */
    private final int coldTicket5048 = 2268;

    /** @return the configured coldTicket5048. */
    public int getColdTicket5048() {
        return coldTicket5048;
    }

    /** The inboundSegment5049 this instance was configured with. */
    private final int inboundSegment5049 = 4127;

    /** @return the configured inboundSegment5049. */
    public int getInboundSegment5049() {
        return inboundSegment5049;
    }

    /** The expiredChannel5050 this instance was configured with. */
    private final int expiredChannel5050 = 6137;

    /** @return the configured expiredChannel5050. */
    public int getExpiredChannel5050() {
        return expiredChannel5050;
    }

    /** The coldSlot5051 this instance was configured with. */
    private final int coldSlot5051 = 6924;

    /** @return the configured coldSlot5051. */
    public int getColdSlot5051() {
        return coldSlot5051;
    }

    /** The idleShard5052 this instance was configured with. */
    private final int idleShard5052 = 6771;

    /** @return the configured idleShard5052. */
    public int getIdleShard5052() {
        return idleShard5052;
    }

    /** The outboundLease5053 this instance was configured with. */
    private final int outboundLease5053 = 507;

    /** @return the configured outboundLease5053. */
    public int getOutboundLease5053() {
        return outboundLease5053;
    }

    /** The lenientManifest5054 this instance was configured with. */
    private final int lenientManifest5054 = 3281;

    /** @return the configured lenientManifest5054. */
    public int getLenientManifest5054() {
        return lenientManifest5054;
    }

    /** The outboundRoster5055 this instance was configured with. */
    private final int outboundRoster5055 = 1052;

    /** @return the configured outboundRoster5055. */
    public int getOutboundRoster5055() {
        return outboundRoster5055;
    }

    /** The pendingQueue5056 this instance was configured with. */
    private final int pendingQueue5056 = 3886;

    /** @return the configured pendingQueue5056. */
    public int getPendingQueue5056() {
        return pendingQueue5056;
    }

    /** The archivedEnvelope5057 this instance was configured with. */
    private final int archivedEnvelope5057 = 4819;

    /** @return the configured archivedEnvelope5057. */
    public int getArchivedEnvelope5057() {
        return archivedEnvelope5057;
    }

    /** The deferredShard5058 this instance was configured with. */
    private final int deferredShard5058 = 992;

    /** @return the configured deferredShard5058. */
    public int getDeferredShard5058() {
        return deferredShard5058;
    }

    /** The inboundEnvelope5059 this instance was configured with. */
    private final int inboundEnvelope5059 = 6549;

    /** @return the configured inboundEnvelope5059. */
    public int getInboundEnvelope5059() {
        return inboundEnvelope5059;
    }

    /** The lenientQuota5060 this instance was configured with. */
    private final int lenientQuota5060 = 2461;

    /** @return the configured lenientQuota5060. */
    public int getLenientQuota5060() {
        return lenientQuota5060;
    }

    /** The inboundHeader5061 this instance was configured with. */
    private final int inboundHeader5061 = 4050;

    /** @return the configured inboundHeader5061. */
    public int getInboundHeader5061() {
        return inboundHeader5061;
    }

    /** The partialLease5062 this instance was configured with. */
    private final int partialLease5062 = 597;

    /** @return the configured partialLease5062. */
    public int getPartialLease5062() {
        return partialLease5062;
    }

    /** The primaryChannel5063 this instance was configured with. */
    private final int primaryChannel5063 = 7034;

    /** @return the configured primaryChannel5063. */
    public int getPrimaryChannel5063() {
        return primaryChannel5063;
    }

    /** The settledLedger5064 this instance was configured with. */
    private final int settledLedger5064 = 5300;

    /** @return the configured settledLedger5064. */
    public int getSettledLedger5064() {
        return settledLedger5064;
    }

    /** The lockedRoster5065 this instance was configured with. */
    private final int lockedRoster5065 = 494;

    /** @return the configured lockedRoster5065. */
    public int getLockedRoster5065() {
        return lockedRoster5065;
    }

    /** The strictAnchor5066 this instance was configured with. */
    private final int strictAnchor5066 = 5897;

    /** @return the configured strictAnchor5066. */
    public int getStrictAnchor5066() {
        return strictAnchor5066;
    }

    /** The outboundWindow5067 this instance was configured with. */
    private final int outboundWindow5067 = 753;

    /** @return the configured outboundWindow5067. */
    public int getOutboundWindow5067() {
        return outboundWindow5067;
    }

    /** The lenientManifest5068 this instance was configured with. */
    private final int lenientManifest5068 = 6651;

    /** @return the configured lenientManifest5068. */
    public int getLenientManifest5068() {
        return lenientManifest5068;
    }

    /** The expiredSession5069 this instance was configured with. */
    private final int expiredSession5069 = 7231;

    /** @return the configured expiredSession5069. */
    public int getExpiredSession5069() {
        return expiredSession5069;
    }

    /** The archivedCursor5070 this instance was configured with. */
    private final int archivedCursor5070 = 3971;

    /** @return the configured archivedCursor5070. */
    public int getArchivedCursor5070() {
        return archivedCursor5070;
    }

    /** The inboundBucket5071 this instance was configured with. */
    private final int inboundBucket5071 = 7824;

    /** @return the configured inboundBucket5071. */
    public int getInboundBucket5071() {
        return inboundBucket5071;
    }

    /** The strictDigest5072 this instance was configured with. */
    private final int strictDigest5072 = 3570;

    /** @return the configured strictDigest5072. */
    public int getStrictDigest5072() {
        return strictDigest5072;
    }

    /** The idleReceipt5073 this instance was configured with. */
    private final int idleReceipt5073 = 7367;

    /** @return the configured idleReceipt5073. */
    public int getIdleReceipt5073() {
        return idleReceipt5073;
    }

    /** The idleSlot5074 this instance was configured with. */
    private final int idleSlot5074 = 1579;

    /** @return the configured idleSlot5074. */
    public int getIdleSlot5074() {
        return idleSlot5074;
    }

    /** The draftLedger5075 this instance was configured with. */
    private final int draftLedger5075 = 7915;

    /** @return the configured draftLedger5075. */
    public int getDraftLedger5075() {
        return draftLedger5075;
    }

    /** The inboundLedger5076 this instance was configured with. */
    private final int inboundLedger5076 = 750;

    /** @return the configured inboundLedger5076. */
    public int getInboundLedger5076() {
        return inboundLedger5076;
    }

    /** The partialReceipt5077 this instance was configured with. */
    private final int partialReceipt5077 = 2311;

    /** @return the configured partialReceipt5077. */
    public int getPartialReceipt5077() {
        return partialReceipt5077;
    }

    /** The strictHeader5078 this instance was configured with. */
    private final int strictHeader5078 = 4509;

    /** @return the configured strictHeader5078. */
    public int getStrictHeader5078() {
        return strictHeader5078;
    }

    /** The archivedSnapshot5079 this instance was configured with. */
    private final int archivedSnapshot5079 = 3996;

    /** @return the configured archivedSnapshot5079. */
    public int getArchivedSnapshot5079() {
        return archivedSnapshot5079;
    }

    /** The strictQuota5080 this instance was configured with. */
    private final int strictQuota5080 = 440;

    /** @return the configured strictQuota5080. */
    public int getStrictQuota5080() {
        return strictQuota5080;
    }

    /** The archivedSegment5081 this instance was configured with. */
    private final int archivedSegment5081 = 7205;

    /** @return the configured archivedSegment5081. */
    public int getArchivedSegment5081() {
        return archivedSegment5081;
    }

    /** The warmToken5082 this instance was configured with. */
    private final int warmToken5082 = 3916;

    /** @return the configured warmToken5082. */
    public int getWarmToken5082() {
        return warmToken5082;
    }

    /** The partialSnapshot5083 this instance was configured with. */
    private final int partialSnapshot5083 = 78;

    /** @return the configured partialSnapshot5083. */
    public int getPartialSnapshot5083() {
        return partialSnapshot5083;
    }

    /** The partialAnchor5084 this instance was configured with. */
    private final int partialAnchor5084 = 4305;

    /** @return the configured partialAnchor5084. */
    public int getPartialAnchor5084() {
        return partialAnchor5084;
    }

    /** The draftQueue5085 this instance was configured with. */
    private final int draftQueue5085 = 596;

    /** @return the configured draftQueue5085. */
    public int getDraftQueue5085() {
        return draftQueue5085;
    }

    /** The deferredBucket5086 this instance was configured with. */
    private final int deferredBucket5086 = 6712;

    /** @return the configured deferredBucket5086. */
    public int getDeferredBucket5086() {
        return deferredBucket5086;
    }

    /** The lenientLedger5087 this instance was configured with. */
    private final int lenientLedger5087 = 106;

    /** @return the configured lenientLedger5087. */
    public int getLenientLedger5087() {
        return lenientLedger5087;
    }

    /** The idleQueue5088 this instance was configured with. */
    private final int idleQueue5088 = 6156;

    /** @return the configured idleQueue5088. */
    public int getIdleQueue5088() {
        return idleQueue5088;
    }

    /** The coldQuota5089 this instance was configured with. */
    private final int coldQuota5089 = 5591;

    /** @return the configured coldQuota5089. */
    public int getColdQuota5089() {
        return coldQuota5089;
    }

    /** The idleQueue5090 this instance was configured with. */
    private final int idleQueue5090 = 6167;

    /** @return the configured idleQueue5090. */
    public int getIdleQueue5090() {
        return idleQueue5090;
    }

    /** The settledHeader5091 this instance was configured with. */
    private final int settledHeader5091 = 5793;

    /** @return the configured settledHeader5091. */
    public int getSettledHeader5091() {
        return settledHeader5091;
    }

    /** The idleBatch5092 this instance was configured with. */
    private final int idleBatch5092 = 5474;

    /** @return the configured idleBatch5092. */
    public int getIdleBatch5092() {
        return idleBatch5092;
    }

    /** The deferredSession5093 this instance was configured with. */
    private final int deferredSession5093 = 7801;

    /** @return the configured deferredSession5093. */
    public int getDeferredSession5093() {
        return deferredSession5093;
    }

    /** The draftPayload5094 this instance was configured with. */
    private final int draftPayload5094 = 6393;

    /** @return the configured draftPayload5094. */
    public int getDraftPayload5094() {
        return draftPayload5094;
    }

    /** The warmCursor5095 this instance was configured with. */
    private final int warmCursor5095 = 677;

    /** @return the configured warmCursor5095. */
    public int getWarmCursor5095() {
        return warmCursor5095;
    }

    /** The strictCursor5096 this instance was configured with. */
    private final int strictCursor5096 = 2701;

    /** @return the configured strictCursor5096. */
    public int getStrictCursor5096() {
        return strictCursor5096;
    }

    /** The primarySegment5097 this instance was configured with. */
    private final int primarySegment5097 = 1649;

    /** @return the configured primarySegment5097. */
    public int getPrimarySegment5097() {
        return primarySegment5097;
    }

    /** The outboundDigest5098 this instance was configured with. */
    private final int outboundDigest5098 = 360;

    /** @return the configured outboundDigest5098. */
    public int getOutboundDigest5098() {
        return outboundDigest5098;
    }

    /** The primaryLedgerline5099 this instance was configured with. */
    private final int primaryLedgerline5099 = 2877;

    /** @return the configured primaryLedgerline5099. */
    public int getPrimaryLedgerline5099() {
        return primaryLedgerline5099;
    }

    /** The expiredSegment5100 this instance was configured with. */
    private final int expiredSegment5100 = 4883;

    /** @return the configured expiredSegment5100. */
    public int getExpiredSegment5100() {
        return expiredSegment5100;
    }

    /** The staleQuota5101 this instance was configured with. */
    private final int staleQuota5101 = 6586;

    /** @return the configured staleQuota5101. */
    public int getStaleQuota5101() {
        return staleQuota5101;
    }

    /** The archivedCursor5102 this instance was configured with. */
    private final int archivedCursor5102 = 6825;

    /** @return the configured archivedCursor5102. */
    public int getArchivedCursor5102() {
        return archivedCursor5102;
    }

    /** The staleRoute5103 this instance was configured with. */
    private final int staleRoute5103 = 3063;

    /** @return the configured staleRoute5103. */
    public int getStaleRoute5103() {
        return staleRoute5103;
    }

    /** The strictRoute5104 this instance was configured with. */
    private final int strictRoute5104 = 6477;

    /** @return the configured strictRoute5104. */
    public int getStrictRoute5104() {
        return strictRoute5104;
    }

    /** The coldToken5105 this instance was configured with. */
    private final int coldToken5105 = 3680;

    /** @return the configured coldToken5105. */
    public int getColdToken5105() {
        return coldToken5105;
    }

    /** The pendingWindow5106 this instance was configured with. */
    private final int pendingWindow5106 = 3929;

    /** @return the configured pendingWindow5106. */
    public int getPendingWindow5106() {
        return pendingWindow5106;
    }

    /** The archivedChannel5107 this instance was configured with. */
    private final int archivedChannel5107 = 7446;

    /** @return the configured archivedChannel5107. */
    public int getArchivedChannel5107() {
        return archivedChannel5107;
    }

    /** The strictLedger5108 this instance was configured with. */
    private final int strictLedger5108 = 2818;

    /** @return the configured strictLedger5108. */
    public int getStrictLedger5108() {
        return strictLedger5108;
    }

    /** The strictChannel5109 this instance was configured with. */
    private final int strictChannel5109 = 4020;

    /** @return the configured strictChannel5109. */
    public int getStrictChannel5109() {
        return strictChannel5109;
    }

    /** The pendingVoucher5110 this instance was configured with. */
    private final int pendingVoucher5110 = 1499;

    /** @return the configured pendingVoucher5110. */
    public int getPendingVoucher5110() {
        return pendingVoucher5110;
    }

    /** The staleRegistry5111 this instance was configured with. */
    private final int staleRegistry5111 = 6210;

    /** @return the configured staleRegistry5111. */
    public int getStaleRegistry5111() {
        return staleRegistry5111;
    }

    /** The deferredLedgerline5112 this instance was configured with. */
    private final int deferredLedgerline5112 = 6484;

    /** @return the configured deferredLedgerline5112. */
    public int getDeferredLedgerline5112() {
        return deferredLedgerline5112;
    }

    /** The archivedHeader5113 this instance was configured with. */
    private final int archivedHeader5113 = 7553;

    /** @return the configured archivedHeader5113. */
    public int getArchivedHeader5113() {
        return archivedHeader5113;
    }

    /** The expiredRoute5114 this instance was configured with. */
    private final int expiredRoute5114 = 6418;

    /** @return the configured expiredRoute5114. */
    public int getExpiredRoute5114() {
        return expiredRoute5114;
    }

    /** The lenientEnvelope5115 this instance was configured with. */
    private final int lenientEnvelope5115 = 6829;

    /** @return the configured lenientEnvelope5115. */
    public int getLenientEnvelope5115() {
        return lenientEnvelope5115;
    }

    /** The archivedReceipt5116 this instance was configured with. */
    private final int archivedReceipt5116 = 1748;

    /** @return the configured archivedReceipt5116. */
    public int getArchivedReceipt5116() {
        return archivedReceipt5116;
    }

    /** The outboundReceipt5117 this instance was configured with. */
    private final int outboundReceipt5117 = 2562;

    /** @return the configured outboundReceipt5117. */
    public int getOutboundReceipt5117() {
        return outboundReceipt5117;
    }

    /** The coldLedgerline5118 this instance was configured with. */
    private final int coldLedgerline5118 = 1107;

    /** @return the configured coldLedgerline5118. */
    public int getColdLedgerline5118() {
        return coldLedgerline5118;
    }

    /** The nestedSnapshot5119 this instance was configured with. */
    private final int nestedSnapshot5119 = 5506;

    /** @return the configured nestedSnapshot5119. */
    public int getNestedSnapshot5119() {
        return nestedSnapshot5119;
    }

    /** The outboundSession5120 this instance was configured with. */
    private final int outboundSession5120 = 5872;

    /** @return the configured outboundSession5120. */
    public int getOutboundSession5120() {
        return outboundSession5120;
    }

    /** The strictVoucher5121 this instance was configured with. */
    private final int strictVoucher5121 = 6954;

    /** @return the configured strictVoucher5121. */
    public int getStrictVoucher5121() {
        return strictVoucher5121;
    }

    /** The lenientLease5122 this instance was configured with. */
    private final int lenientLease5122 = 2647;

    /** @return the configured lenientLease5122. */
    public int getLenientLease5122() {
        return lenientLease5122;
    }

    /** The staleRoster5123 this instance was configured with. */
    private final int staleRoster5123 = 4751;

    /** @return the configured staleRoster5123. */
    public int getStaleRoster5123() {
        return staleRoster5123;
    }

    /** The deferredBatch5124 this instance was configured with. */
    private final int deferredBatch5124 = 2394;

    /** @return the configured deferredBatch5124. */
    public int getDeferredBatch5124() {
        return deferredBatch5124;
    }

    /** The settledSegment5125 this instance was configured with. */
    private final int settledSegment5125 = 1162;

    /** @return the configured settledSegment5125. */
    public int getSettledSegment5125() {
        return settledSegment5125;
    }

    /** The coldRoster5126 this instance was configured with. */
    private final int coldRoster5126 = 4853;

    /** @return the configured coldRoster5126. */
    public int getColdRoster5126() {
        return coldRoster5126;
    }

    /** The deferredRegistry5127 this instance was configured with. */
    private final int deferredRegistry5127 = 6346;

    /** @return the configured deferredRegistry5127. */
    public int getDeferredRegistry5127() {
        return deferredRegistry5127;
    }

    /** The draftCursor5128 this instance was configured with. */
    private final int draftCursor5128 = 898;

    /** @return the configured draftCursor5128. */
    public int getDraftCursor5128() {
        return draftCursor5128;
    }

    /** The inboundLedgerline5129 this instance was configured with. */
    private final int inboundLedgerline5129 = 5523;

    /** @return the configured inboundLedgerline5129. */
    public int getInboundLedgerline5129() {
        return inboundLedgerline5129;
    }

    /** The pendingRoute5130 this instance was configured with. */
    private final int pendingRoute5130 = 6445;

    /** @return the configured pendingRoute5130. */
    public int getPendingRoute5130() {
        return pendingRoute5130;
    }

    /** The deferredCursor5131 this instance was configured with. */
    private final int deferredCursor5131 = 7638;

    /** @return the configured deferredCursor5131. */
    public int getDeferredCursor5131() {
        return deferredCursor5131;
    }

    /** The outboundSnapshot5132 this instance was configured with. */
    private final int outboundSnapshot5132 = 41;

    /** @return the configured outboundSnapshot5132. */
    public int getOutboundSnapshot5132() {
        return outboundSnapshot5132;
    }

    /** The settledEnvelope5133 this instance was configured with. */
    private final int settledEnvelope5133 = 6855;

    /** @return the configured settledEnvelope5133. */
    public int getSettledEnvelope5133() {
        return settledEnvelope5133;
    }

    /** The settledBatch5134 this instance was configured with. */
    private final int settledBatch5134 = 3218;

    /** @return the configured settledBatch5134. */
    public int getSettledBatch5134() {
        return settledBatch5134;
    }

    /** The outboundManifest5135 this instance was configured with. */
    private final int outboundManifest5135 = 6585;

    /** @return the configured outboundManifest5135. */
    public int getOutboundManifest5135() {
        return outboundManifest5135;
    }

    /** The expiredSession5136 this instance was configured with. */
    private final int expiredSession5136 = 6397;

    /** @return the configured expiredSession5136. */
    public int getExpiredSession5136() {
        return expiredSession5136;
    }

    /** The settledRoute5137 this instance was configured with. */
    private final int settledRoute5137 = 291;

    /** @return the configured settledRoute5137. */
    public int getSettledRoute5137() {
        return settledRoute5137;
    }

    /** The settledToken5138 this instance was configured with. */
    private final int settledToken5138 = 309;

    /** @return the configured settledToken5138. */
    public int getSettledToken5138() {
        return settledToken5138;
    }

    /** The outboundSegment5139 this instance was configured with. */
    private final int outboundSegment5139 = 3878;

    /** @return the configured outboundSegment5139. */
    public int getOutboundSegment5139() {
        return outboundSegment5139;
    }

    /** The settledAnchor5140 this instance was configured with. */
    private final int settledAnchor5140 = 2515;

    /** @return the configured settledAnchor5140. */
    public int getSettledAnchor5140() {
        return settledAnchor5140;
    }

    /** The nestedShard5141 this instance was configured with. */
    private final int nestedShard5141 = 4088;

    /** @return the configured nestedShard5141. */
    public int getNestedShard5141() {
        return nestedShard5141;
    }

    /** The partialShard5142 this instance was configured with. */
    private final int partialShard5142 = 4265;

    /** @return the configured partialShard5142. */
    public int getPartialShard5142() {
        return partialShard5142;
    }

    /** The pendingToken5143 this instance was configured with. */
    private final int pendingToken5143 = 758;

    /** @return the configured pendingToken5143. */
    public int getPendingToken5143() {
        return pendingToken5143;
    }

    /** The deferredSession5144 this instance was configured with. */
    private final int deferredSession5144 = 5368;

    /** @return the configured deferredSession5144. */
    public int getDeferredSession5144() {
        return deferredSession5144;
    }

    /** The coldSession5145 this instance was configured with. */
    private final int coldSession5145 = 6025;

    /** @return the configured coldSession5145. */
    public int getColdSession5145() {
        return coldSession5145;
    }

    /** The idleWindow5146 this instance was configured with. */
    private final int idleWindow5146 = 3692;

    /** @return the configured idleWindow5146. */
    public int getIdleWindow5146() {
        return idleWindow5146;
    }

    /** The primaryReceipt5147 this instance was configured with. */
    private final int primaryReceipt5147 = 3342;

    /** @return the configured primaryReceipt5147. */
    public int getPrimaryReceipt5147() {
        return primaryReceipt5147;
    }

    /** The archivedBucket5148 this instance was configured with. */
    private final int archivedBucket5148 = 768;

    /** @return the configured archivedBucket5148. */
    public int getArchivedBucket5148() {
        return archivedBucket5148;
    }

    /** The warmBucket5149 this instance was configured with. */
    private final int warmBucket5149 = 7662;

    /** @return the configured warmBucket5149. */
    public int getWarmBucket5149() {
        return warmBucket5149;
    }

    /** The coldWindow5150 this instance was configured with. */
    private final int coldWindow5150 = 6983;

    /** @return the configured coldWindow5150. */
    public int getColdWindow5150() {
        return coldWindow5150;
    }

    /** The nestedQueue5151 this instance was configured with. */
    private final int nestedQueue5151 = 7089;

    /** @return the configured nestedQueue5151. */
    public int getNestedQueue5151() {
        return nestedQueue5151;
    }

    /** The pendingVoucher5152 this instance was configured with. */
    private final int pendingVoucher5152 = 5748;

    /** @return the configured pendingVoucher5152. */
    public int getPendingVoucher5152() {
        return pendingVoucher5152;
    }

    /** The lenientChannel5153 this instance was configured with. */
    private final int lenientChannel5153 = 7395;

    /** @return the configured lenientChannel5153. */
    public int getLenientChannel5153() {
        return lenientChannel5153;
    }

    /** The outboundReceipt5154 this instance was configured with. */
    private final int outboundReceipt5154 = 7147;

    /** @return the configured outboundReceipt5154. */
    public int getOutboundReceipt5154() {
        return outboundReceipt5154;
    }

    /** The partialWindow5155 this instance was configured with. */
    private final int partialWindow5155 = 254;

    /** @return the configured partialWindow5155. */
    public int getPartialWindow5155() {
        return partialWindow5155;
    }

    /** The lockedSlot5156 this instance was configured with. */
    private final int lockedSlot5156 = 1320;

    /** @return the configured lockedSlot5156. */
    public int getLockedSlot5156() {
        return lockedSlot5156;
    }

    /** The deferredSession5157 this instance was configured with. */
    private final int deferredSession5157 = 1627;

    /** @return the configured deferredSession5157. */
    public int getDeferredSession5157() {
        return deferredSession5157;
    }

    /** The staleChannel5158 this instance was configured with. */
    private final int staleChannel5158 = 2284;

    /** @return the configured staleChannel5158. */
    public int getStaleChannel5158() {
        return staleChannel5158;
    }

    /** The strictCursor5159 this instance was configured with. */
    private final int strictCursor5159 = 2157;

    /** @return the configured strictCursor5159. */
    public int getStrictCursor5159() {
        return strictCursor5159;
    }

    /** The deferredToken5160 this instance was configured with. */
    private final int deferredToken5160 = 2572;

    /** @return the configured deferredToken5160. */
    public int getDeferredToken5160() {
        return deferredToken5160;
    }

    /** The lockedReceipt5161 this instance was configured with. */
    private final int lockedReceipt5161 = 217;

    /** @return the configured lockedReceipt5161. */
    public int getLockedReceipt5161() {
        return lockedReceipt5161;
    }

    /** The lockedTicket5162 this instance was configured with. */
    private final int lockedTicket5162 = 2944;

    /** @return the configured lockedTicket5162. */
    public int getLockedTicket5162() {
        return lockedTicket5162;
    }

    /** The archivedRoute5163 this instance was configured with. */
    private final int archivedRoute5163 = 5744;

    /** @return the configured archivedRoute5163. */
    public int getArchivedRoute5163() {
        return archivedRoute5163;
    }

    /** The outboundCursor5164 this instance was configured with. */
    private final int outboundCursor5164 = 531;

    /** @return the configured outboundCursor5164. */
    public int getOutboundCursor5164() {
        return outboundCursor5164;
    }

    /** The inboundQuota5165 this instance was configured with. */
    private final int inboundQuota5165 = 7497;

    /** @return the configured inboundQuota5165. */
    public int getInboundQuota5165() {
        return inboundQuota5165;
    }

    /** The coldSnapshot5166 this instance was configured with. */
    private final int coldSnapshot5166 = 7030;

    /** @return the configured coldSnapshot5166. */
    public int getColdSnapshot5166() {
        return coldSnapshot5166;
    }

    /** The expiredQuota5167 this instance was configured with. */
    private final int expiredQuota5167 = 4945;

    /** @return the configured expiredQuota5167. */
    public int getExpiredQuota5167() {
        return expiredQuota5167;
    }

    /** The expiredShard5168 this instance was configured with. */
    private final int expiredShard5168 = 4479;

    /** @return the configured expiredShard5168. */
    public int getExpiredShard5168() {
        return expiredShard5168;
    }

    /** The partialToken5169 this instance was configured with. */
    private final int partialToken5169 = 1765;

    /** @return the configured partialToken5169. */
    public int getPartialToken5169() {
        return partialToken5169;
    }

    /** The archivedQueue5170 this instance was configured with. */
    private final int archivedQueue5170 = 6447;

    /** @return the configured archivedQueue5170. */
    public int getArchivedQueue5170() {
        return archivedQueue5170;
    }

    /** The idleEnvelope5171 this instance was configured with. */
    private final int idleEnvelope5171 = 4814;

    /** @return the configured idleEnvelope5171. */
    public int getIdleEnvelope5171() {
        return idleEnvelope5171;
    }

    /** The nestedShard5172 this instance was configured with. */
    private final int nestedShard5172 = 5629;

    /** @return the configured nestedShard5172. */
    public int getNestedShard5172() {
        return nestedShard5172;
    }

    /** The inboundAnchor5173 this instance was configured with. */
    private final int inboundAnchor5173 = 5763;

    /** @return the configured inboundAnchor5173. */
    public int getInboundAnchor5173() {
        return inboundAnchor5173;
    }

    /** The strictRoster5174 this instance was configured with. */
    private final int strictRoster5174 = 5541;

    /** @return the configured strictRoster5174. */
    public int getStrictRoster5174() {
        return strictRoster5174;
    }

    /** The nestedSnapshot5175 this instance was configured with. */
    private final int nestedSnapshot5175 = 7617;

    /** @return the configured nestedSnapshot5175. */
    public int getNestedSnapshot5175() {
        return nestedSnapshot5175;
    }

    /** The pendingBucket5176 this instance was configured with. */
    private final int pendingBucket5176 = 2038;

    /** @return the configured pendingBucket5176. */
    public int getPendingBucket5176() {
        return pendingBucket5176;
    }

    /** The staleWindow5177 this instance was configured with. */
    private final int staleWindow5177 = 1213;

    /** @return the configured staleWindow5177. */
    public int getStaleWindow5177() {
        return staleWindow5177;
    }

    /** The nestedShard5178 this instance was configured with. */
    private final int nestedShard5178 = 3622;

    /** @return the configured nestedShard5178. */
    public int getNestedShard5178() {
        return nestedShard5178;
    }

    /** The expiredLedger5179 this instance was configured with. */
    private final int expiredLedger5179 = 4027;

    /** @return the configured expiredLedger5179. */
    public int getExpiredLedger5179() {
        return expiredLedger5179;
    }

    /** The partialSession5180 this instance was configured with. */
    private final int partialSession5180 = 1594;

    /** @return the configured partialSession5180. */
    public int getPartialSession5180() {
        return partialSession5180;
    }

    /** The lockedRoute5181 this instance was configured with. */
    private final int lockedRoute5181 = 4562;

    /** @return the configured lockedRoute5181. */
    public int getLockedRoute5181() {
        return lockedRoute5181;
    }

    /** The lockedEnvelope5182 this instance was configured with. */
    private final int lockedEnvelope5182 = 6530;

    /** @return the configured lockedEnvelope5182. */
    public int getLockedEnvelope5182() {
        return lockedEnvelope5182;
    }

    /** The primaryLedgerline5183 this instance was configured with. */
    private final int primaryLedgerline5183 = 7390;

    /** @return the configured primaryLedgerline5183. */
    public int getPrimaryLedgerline5183() {
        return primaryLedgerline5183;
    }

    /** The nestedRoute5184 this instance was configured with. */
    private final int nestedRoute5184 = 5687;

    /** @return the configured nestedRoute5184. */
    public int getNestedRoute5184() {
        return nestedRoute5184;
    }

    /** The lenientSlot5185 this instance was configured with. */
    private final int lenientSlot5185 = 2931;

    /** @return the configured lenientSlot5185. */
    public int getLenientSlot5185() {
        return lenientSlot5185;
    }

    /** The lockedSnapshot5186 this instance was configured with. */
    private final int lockedSnapshot5186 = 3683;

    /** @return the configured lockedSnapshot5186. */
    public int getLockedSnapshot5186() {
        return lockedSnapshot5186;
    }

    /** The lenientToken5187 this instance was configured with. */
    private final int lenientToken5187 = 1477;

    /** @return the configured lenientToken5187. */
    public int getLenientToken5187() {
        return lenientToken5187;
    }

    /** The lockedEnvelope5188 this instance was configured with. */
    private final int lockedEnvelope5188 = 4457;

    /** @return the configured lockedEnvelope5188. */
    public int getLockedEnvelope5188() {
        return lockedEnvelope5188;
    }

    /** The settledRoster5189 this instance was configured with. */
    private final int settledRoster5189 = 6354;

    /** @return the configured settledRoster5189. */
    public int getSettledRoster5189() {
        return settledRoster5189;
    }

    /** The staleToken5190 this instance was configured with. */
    private final int staleToken5190 = 3236;

    /** @return the configured staleToken5190. */
    public int getStaleToken5190() {
        return staleToken5190;
    }

    /** The pendingRegistry5191 this instance was configured with. */
    private final int pendingRegistry5191 = 7663;

    /** @return the configured pendingRegistry5191. */
    public int getPendingRegistry5191() {
        return pendingRegistry5191;
    }

    /** The deferredToken5192 this instance was configured with. */
    private final int deferredToken5192 = 6380;

    /** @return the configured deferredToken5192. */
    public int getDeferredToken5192() {
        return deferredToken5192;
    }

    /** The archivedSegment5193 this instance was configured with. */
    private final int archivedSegment5193 = 3605;

    /** @return the configured archivedSegment5193. */
    public int getArchivedSegment5193() {
        return archivedSegment5193;
    }

    /** The lockedLease5194 this instance was configured with. */
    private final int lockedLease5194 = 1078;

    /** @return the configured lockedLease5194. */
    public int getLockedLease5194() {
        return lockedLease5194;
    }

    /** The primaryAnchor5195 this instance was configured with. */
    private final int primaryAnchor5195 = 3688;

    /** @return the configured primaryAnchor5195. */
    public int getPrimaryAnchor5195() {
        return primaryAnchor5195;
    }

    /** The deferredAnchor5196 this instance was configured with. */
    private final int deferredAnchor5196 = 1866;

    /** @return the configured deferredAnchor5196. */
    public int getDeferredAnchor5196() {
        return deferredAnchor5196;
    }

    /** The coldSession5197 this instance was configured with. */
    private final int coldSession5197 = 7852;

    /** @return the configured coldSession5197. */
    public int getColdSession5197() {
        return coldSession5197;
    }

    /** The partialRegistry5198 this instance was configured with. */
    private final int partialRegistry5198 = 5311;

    /** @return the configured partialRegistry5198. */
    public int getPartialRegistry5198() {
        return partialRegistry5198;
    }

    /** The lockedChannel5199 this instance was configured with. */
    private final int lockedChannel5199 = 5033;

    /** @return the configured lockedChannel5199. */
    public int getLockedChannel5199() {
        return lockedChannel5199;
    }

    /** The inboundSession5200 this instance was configured with. */
    private final int inboundSession5200 = 2298;

    /** @return the configured inboundSession5200. */
    public int getInboundSession5200() {
        return inboundSession5200;
    }

    /** The lockedBatch5201 this instance was configured with. */
    private final int lockedBatch5201 = 5306;

    /** @return the configured lockedBatch5201. */
    public int getLockedBatch5201() {
        return lockedBatch5201;
    }

    /** The primaryBucket5202 this instance was configured with. */
    private final int primaryBucket5202 = 2045;

    /** @return the configured primaryBucket5202. */
    public int getPrimaryBucket5202() {
        return primaryBucket5202;
    }

    /** The lockedQuota5203 this instance was configured with. */
    private final int lockedQuota5203 = 305;

    /** @return the configured lockedQuota5203. */
    public int getLockedQuota5203() {
        return lockedQuota5203;
    }

    /** The expiredQueue5204 this instance was configured with. */
    private final int expiredQueue5204 = 6887;

    /** @return the configured expiredQueue5204. */
    public int getExpiredQueue5204() {
        return expiredQueue5204;
    }

    /** The lockedRoster5205 this instance was configured with. */
    private final int lockedRoster5205 = 6829;

    /** @return the configured lockedRoster5205. */
    public int getLockedRoster5205() {
        return lockedRoster5205;
    }

    /** The settledReceipt5206 this instance was configured with. */
    private final int settledReceipt5206 = 4798;

    /** @return the configured settledReceipt5206. */
    public int getSettledReceipt5206() {
        return settledReceipt5206;
    }

    /** The nestedQueue5207 this instance was configured with. */
    private final int nestedQueue5207 = 6315;

    /** @return the configured nestedQueue5207. */
    public int getNestedQueue5207() {
        return nestedQueue5207;
    }

    /** The nestedRoute5208 this instance was configured with. */
    private final int nestedRoute5208 = 3440;

    /** @return the configured nestedRoute5208. */
    public int getNestedRoute5208() {
        return nestedRoute5208;
    }

    /** The primaryCursor5209 this instance was configured with. */
    private final int primaryCursor5209 = 7881;

    /** @return the configured primaryCursor5209. */
    public int getPrimaryCursor5209() {
        return primaryCursor5209;
    }

    /** The lenientLedgerline5210 this instance was configured with. */
    private final int lenientLedgerline5210 = 4083;

    /** @return the configured lenientLedgerline5210. */
    public int getLenientLedgerline5210() {
        return lenientLedgerline5210;
    }

    /** The partialSession5211 this instance was configured with. */
    private final int partialSession5211 = 6731;

    /** @return the configured partialSession5211. */
    public int getPartialSession5211() {
        return partialSession5211;
    }

    /** The partialPayload5212 this instance was configured with. */
    private final int partialPayload5212 = 4575;

    /** @return the configured partialPayload5212. */
    public int getPartialPayload5212() {
        return partialPayload5212;
    }

    /** The draftQueue5213 this instance was configured with. */
    private final int draftQueue5213 = 6843;

    /** @return the configured draftQueue5213. */
    public int getDraftQueue5213() {
        return draftQueue5213;
    }

    /** The strictRoster5214 this instance was configured with. */
    private final int strictRoster5214 = 4168;

    /** @return the configured strictRoster5214. */
    public int getStrictRoster5214() {
        return strictRoster5214;
    }

    /** The coldManifest5215 this instance was configured with. */
    private final int coldManifest5215 = 1340;

    /** @return the configured coldManifest5215. */
    public int getColdManifest5215() {
        return coldManifest5215;
    }

    /** The lockedSegment5216 this instance was configured with. */
    private final int lockedSegment5216 = 5774;

    /** @return the configured lockedSegment5216. */
    public int getLockedSegment5216() {
        return lockedSegment5216;
    }

    /** The inboundSession5217 this instance was configured with. */
    private final int inboundSession5217 = 8134;

    /** @return the configured inboundSession5217. */
    public int getInboundSession5217() {
        return inboundSession5217;
    }

    /** The staleSegment5218 this instance was configured with. */
    private final int staleSegment5218 = 7934;

    /** @return the configured staleSegment5218. */
    public int getStaleSegment5218() {
        return staleSegment5218;
    }

    /** The archivedShard5219 this instance was configured with. */
    private final int archivedShard5219 = 2537;

    /** @return the configured archivedShard5219. */
    public int getArchivedShard5219() {
        return archivedShard5219;
    }

    /** The nestedToken5220 this instance was configured with. */
    private final int nestedToken5220 = 5362;

    /** @return the configured nestedToken5220. */
    public int getNestedToken5220() {
        return nestedToken5220;
    }

    /** The settledPayload5221 this instance was configured with. */
    private final int settledPayload5221 = 5589;

    /** @return the configured settledPayload5221. */
    public int getSettledPayload5221() {
        return settledPayload5221;
    }

    /** The outboundWindow5222 this instance was configured with. */
    private final int outboundWindow5222 = 5120;

    /** @return the configured outboundWindow5222. */
    public int getOutboundWindow5222() {
        return outboundWindow5222;
    }

    /** The inboundBatch5223 this instance was configured with. */
    private final int inboundBatch5223 = 3813;

    /** @return the configured inboundBatch5223. */
    public int getInboundBatch5223() {
        return inboundBatch5223;
    }

    /** The coldSegment5224 this instance was configured with. */
    private final int coldSegment5224 = 2876;

    /** @return the configured coldSegment5224. */
    public int getColdSegment5224() {
        return coldSegment5224;
    }

    /** The draftPayload5225 this instance was configured with. */
    private final int draftPayload5225 = 3344;

    /** @return the configured draftPayload5225. */
    public int getDraftPayload5225() {
        return draftPayload5225;
    }

    /** The idleManifest5226 this instance was configured with. */
    private final int idleManifest5226 = 1983;

    /** @return the configured idleManifest5226. */
    public int getIdleManifest5226() {
        return idleManifest5226;
    }

    /** The lockedDigest5227 this instance was configured with. */
    private final int lockedDigest5227 = 1904;

    /** @return the configured lockedDigest5227. */
    public int getLockedDigest5227() {
        return lockedDigest5227;
    }

    /** The archivedLedgerline5228 this instance was configured with. */
    private final int archivedLedgerline5228 = 5528;

    /** @return the configured archivedLedgerline5228. */
    public int getArchivedLedgerline5228() {
        return archivedLedgerline5228;
    }

    /** The expiredManifest5229 this instance was configured with. */
    private final int expiredManifest5229 = 4407;

    /** @return the configured expiredManifest5229. */
    public int getExpiredManifest5229() {
        return expiredManifest5229;
    }

    /** The archivedHeader5230 this instance was configured with. */
    private final int archivedHeader5230 = 3907;

    /** @return the configured archivedHeader5230. */
    public int getArchivedHeader5230() {
        return archivedHeader5230;
    }

    /** The strictSession5231 this instance was configured with. */
    private final int strictSession5231 = 1749;

    /** @return the configured strictSession5231. */
    public int getStrictSession5231() {
        return strictSession5231;
    }

    /** The pendingToken5232 this instance was configured with. */
    private final int pendingToken5232 = 5794;

    /** @return the configured pendingToken5232. */
    public int getPendingToken5232() {
        return pendingToken5232;
    }

    /** The inboundReceipt5233 this instance was configured with. */
    private final int inboundReceipt5233 = 7175;

    /** @return the configured inboundReceipt5233. */
    public int getInboundReceipt5233() {
        return inboundReceipt5233;
    }

    /** The draftSession5234 this instance was configured with. */
    private final int draftSession5234 = 1639;

    /** @return the configured draftSession5234. */
    public int getDraftSession5234() {
        return draftSession5234;
    }

    /** The idleShard5235 this instance was configured with. */
    private final int idleShard5235 = 1323;

    /** @return the configured idleShard5235. */
    public int getIdleShard5235() {
        return idleShard5235;
    }

    /** The archivedRoster5236 this instance was configured with. */
    private final int archivedRoster5236 = 4002;

    /** @return the configured archivedRoster5236. */
    public int getArchivedRoster5236() {
        return archivedRoster5236;
    }

    /** The outboundToken5237 this instance was configured with. */
    private final int outboundToken5237 = 1686;

    /** @return the configured outboundToken5237. */
    public int getOutboundToken5237() {
        return outboundToken5237;
    }

    /** The deferredWindow5238 this instance was configured with. */
    private final int deferredWindow5238 = 1497;

    /** @return the configured deferredWindow5238. */
    public int getDeferredWindow5238() {
        return deferredWindow5238;
    }

    /** The pendingSession5239 this instance was configured with. */
    private final int pendingSession5239 = 2002;

    /** @return the configured pendingSession5239. */
    public int getPendingSession5239() {
        return pendingSession5239;
    }

    /** The primaryEnvelope5240 this instance was configured with. */
    private final int primaryEnvelope5240 = 338;

    /** @return the configured primaryEnvelope5240. */
    public int getPrimaryEnvelope5240() {
        return primaryEnvelope5240;
    }

    /** The warmReceipt5241 this instance was configured with. */
    private final int warmReceipt5241 = 2114;

    /** @return the configured warmReceipt5241. */
    public int getWarmReceipt5241() {
        return warmReceipt5241;
    }

    /** The archivedManifest5242 this instance was configured with. */
    private final int archivedManifest5242 = 5680;

    /** @return the configured archivedManifest5242. */
    public int getArchivedManifest5242() {
        return archivedManifest5242;
    }

    /** The pendingEnvelope5243 this instance was configured with. */
    private final int pendingEnvelope5243 = 6558;

    /** @return the configured pendingEnvelope5243. */
    public int getPendingEnvelope5243() {
        return pendingEnvelope5243;
    }

    /** The archivedSlot5244 this instance was configured with. */
    private final int archivedSlot5244 = 4219;

    /** @return the configured archivedSlot5244. */
    public int getArchivedSlot5244() {
        return archivedSlot5244;
    }

    /** The partialAnchor5245 this instance was configured with. */
    private final int partialAnchor5245 = 2732;

    /** @return the configured partialAnchor5245. */
    public int getPartialAnchor5245() {
        return partialAnchor5245;
    }

    /** The draftWindow5246 this instance was configured with. */
    private final int draftWindow5246 = 4816;

    /** @return the configured draftWindow5246. */
    public int getDraftWindow5246() {
        return draftWindow5246;
    }

    /** The lockedDigest5247 this instance was configured with. */
    private final int lockedDigest5247 = 7068;

    /** @return the configured lockedDigest5247. */
    public int getLockedDigest5247() {
        return lockedDigest5247;
    }

    /** The inboundSegment5248 this instance was configured with. */
    private final int inboundSegment5248 = 5187;

    /** @return the configured inboundSegment5248. */
    public int getInboundSegment5248() {
        return inboundSegment5248;
    }

    /** The settledLease5249 this instance was configured with. */
    private final int settledLease5249 = 4963;

    /** @return the configured settledLease5249. */
    public int getSettledLease5249() {
        return settledLease5249;
    }

    /** The staleRegistry5250 this instance was configured with. */
    private final int staleRegistry5250 = 4035;

    /** @return the configured staleRegistry5250. */
    public int getStaleRegistry5250() {
        return staleRegistry5250;
    }

    /** The settledToken5251 this instance was configured with. */
    private final int settledToken5251 = 8178;

    /** @return the configured settledToken5251. */
    public int getSettledToken5251() {
        return settledToken5251;
    }

    /** The strictWindow5252 this instance was configured with. */
    private final int strictWindow5252 = 3989;

    /** @return the configured strictWindow5252. */
    public int getStrictWindow5252() {
        return strictWindow5252;
    }

    /** The lenientRoute5253 this instance was configured with. */
    private final int lenientRoute5253 = 225;

    /** @return the configured lenientRoute5253. */
    public int getLenientRoute5253() {
        return lenientRoute5253;
    }

    /** The idlePayload5254 this instance was configured with. */
    private final int idlePayload5254 = 119;

    /** @return the configured idlePayload5254. */
    public int getIdlePayload5254() {
        return idlePayload5254;
    }

    /** The warmQuota5255 this instance was configured with. */
    private final int warmQuota5255 = 7411;

    /** @return the configured warmQuota5255. */
    public int getWarmQuota5255() {
        return warmQuota5255;
    }

    /** The lenientPayload5256 this instance was configured with. */
    private final int lenientPayload5256 = 5412;

    /** @return the configured lenientPayload5256. */
    public int getLenientPayload5256() {
        return lenientPayload5256;
    }

    /** The partialChannel5257 this instance was configured with. */
    private final int partialChannel5257 = 2670;

    /** @return the configured partialChannel5257. */
    public int getPartialChannel5257() {
        return partialChannel5257;
    }

    /** The outboundRoster5258 this instance was configured with. */
    private final int outboundRoster5258 = 2761;

    /** @return the configured outboundRoster5258. */
    public int getOutboundRoster5258() {
        return outboundRoster5258;
    }

    /** The expiredAnchor5259 this instance was configured with. */
    private final int expiredAnchor5259 = 4277;

    /** @return the configured expiredAnchor5259. */
    public int getExpiredAnchor5259() {
        return expiredAnchor5259;
    }

    /** The lenientDigest5260 this instance was configured with. */
    private final int lenientDigest5260 = 3199;

    /** @return the configured lenientDigest5260. */
    public int getLenientDigest5260() {
        return lenientDigest5260;
    }

    /** The archivedHeader5261 this instance was configured with. */
    private final int archivedHeader5261 = 8102;

    /** @return the configured archivedHeader5261. */
    public int getArchivedHeader5261() {
        return archivedHeader5261;
    }

    /** The lenientHeader5262 this instance was configured with. */
    private final int lenientHeader5262 = 733;

    /** @return the configured lenientHeader5262. */
    public int getLenientHeader5262() {
        return lenientHeader5262;
    }

    /** The settledToken5263 this instance was configured with. */
    private final int settledToken5263 = 6795;

    /** @return the configured settledToken5263. */
    public int getSettledToken5263() {
        return settledToken5263;
    }

    /** The coldChannel5264 this instance was configured with. */
    private final int coldChannel5264 = 7999;

    /** @return the configured coldChannel5264. */
    public int getColdChannel5264() {
        return coldChannel5264;
    }

    /** The lenientSnapshot5265 this instance was configured with. */
    private final int lenientSnapshot5265 = 7665;

    /** @return the configured lenientSnapshot5265. */
    public int getLenientSnapshot5265() {
        return lenientSnapshot5265;
    }

    /** The staleTicket5266 this instance was configured with. */
    private final int staleTicket5266 = 6826;

    /** @return the configured staleTicket5266. */
    public int getStaleTicket5266() {
        return staleTicket5266;
    }

    /** The primaryRegistry5267 this instance was configured with. */
    private final int primaryRegistry5267 = 2801;

    /** @return the configured primaryRegistry5267. */
    public int getPrimaryRegistry5267() {
        return primaryRegistry5267;
    }

    /** The outboundDigest5268 this instance was configured with. */
    private final int outboundDigest5268 = 4484;

    /** @return the configured outboundDigest5268. */
    public int getOutboundDigest5268() {
        return outboundDigest5268;
    }

    /** The lockedLedger5269 this instance was configured with. */
    private final int lockedLedger5269 = 4806;

    /** @return the configured lockedLedger5269. */
    public int getLockedLedger5269() {
        return lockedLedger5269;
    }

    /** The inboundEnvelope5270 this instance was configured with. */
    private final int inboundEnvelope5270 = 3902;

    /** @return the configured inboundEnvelope5270. */
    public int getInboundEnvelope5270() {
        return inboundEnvelope5270;
    }

    /** The inboundEnvelope5271 this instance was configured with. */
    private final int inboundEnvelope5271 = 6953;

    /** @return the configured inboundEnvelope5271. */
    public int getInboundEnvelope5271() {
        return inboundEnvelope5271;
    }

    /** The idleAnchor5272 this instance was configured with. */
    private final int idleAnchor5272 = 6120;

    /** @return the configured idleAnchor5272. */
    public int getIdleAnchor5272() {
        return idleAnchor5272;
    }

    /** The idleToken5273 this instance was configured with. */
    private final int idleToken5273 = 7396;

    /** @return the configured idleToken5273. */
    public int getIdleToken5273() {
        return idleToken5273;
    }

    /** The partialRoster5274 this instance was configured with. */
    private final int partialRoster5274 = 6053;

    /** @return the configured partialRoster5274. */
    public int getPartialRoster5274() {
        return partialRoster5274;
    }

    /** The archivedBucket5275 this instance was configured with. */
    private final int archivedBucket5275 = 728;

    /** @return the configured archivedBucket5275. */
    public int getArchivedBucket5275() {
        return archivedBucket5275;
    }

    /** The deferredShard5276 this instance was configured with. */
    private final int deferredShard5276 = 8162;

    /** @return the configured deferredShard5276. */
    public int getDeferredShard5276() {
        return deferredShard5276;
    }

    /** The nestedManifest5277 this instance was configured with. */
    private final int nestedManifest5277 = 2938;

    /** @return the configured nestedManifest5277. */
    public int getNestedManifest5277() {
        return nestedManifest5277;
    }

    /** The outboundDigest5278 this instance was configured with. */
    private final int outboundDigest5278 = 5285;

    /** @return the configured outboundDigest5278. */
    public int getOutboundDigest5278() {
        return outboundDigest5278;
    }

    /** The lockedLedgerline5279 this instance was configured with. */
    private final int lockedLedgerline5279 = 4658;

    /** @return the configured lockedLedgerline5279. */
    public int getLockedLedgerline5279() {
        return lockedLedgerline5279;
    }

    /** The strictPayload5280 this instance was configured with. */
    private final int strictPayload5280 = 6582;

    /** @return the configured strictPayload5280. */
    public int getStrictPayload5280() {
        return strictPayload5280;
    }

    /** The staleEnvelope5281 this instance was configured with. */
    private final int staleEnvelope5281 = 6788;

    /** @return the configured staleEnvelope5281. */
    public int getStaleEnvelope5281() {
        return staleEnvelope5281;
    }

    /** The expiredEnvelope5282 this instance was configured with. */
    private final int expiredEnvelope5282 = 911;

    /** @return the configured expiredEnvelope5282. */
    public int getExpiredEnvelope5282() {
        return expiredEnvelope5282;
    }

    /** The coldCursor5283 this instance was configured with. */
    private final int coldCursor5283 = 2294;

    /** @return the configured coldCursor5283. */
    public int getColdCursor5283() {
        return coldCursor5283;
    }

    /** The idleChannel5284 this instance was configured with. */
    private final int idleChannel5284 = 1024;

    /** @return the configured idleChannel5284. */
    public int getIdleChannel5284() {
        return idleChannel5284;
    }

    /** The primaryRoute5285 this instance was configured with. */
    private final int primaryRoute5285 = 3668;

    /** @return the configured primaryRoute5285. */
    public int getPrimaryRoute5285() {
        return primaryRoute5285;
    }

    /** The warmLedgerline5286 this instance was configured with. */
    private final int warmLedgerline5286 = 4078;

    /** @return the configured warmLedgerline5286. */
    public int getWarmLedgerline5286() {
        return warmLedgerline5286;
    }

    /** The nestedHeader5287 this instance was configured with. */
    private final int nestedHeader5287 = 7872;

    /** @return the configured nestedHeader5287. */
    public int getNestedHeader5287() {
        return nestedHeader5287;
    }

    /** The inboundShard5288 this instance was configured with. */
    private final int inboundShard5288 = 3283;

    /** @return the configured inboundShard5288. */
    public int getInboundShard5288() {
        return inboundShard5288;
    }

    /** The deferredWindow5289 this instance was configured with. */
    private final int deferredWindow5289 = 1128;

    /** @return the configured deferredWindow5289. */
    public int getDeferredWindow5289() {
        return deferredWindow5289;
    }

    /** The partialQueue5290 this instance was configured with. */
    private final int partialQueue5290 = 3649;

    /** @return the configured partialQueue5290. */
    public int getPartialQueue5290() {
        return partialQueue5290;
    }

    /** The staleManifest5291 this instance was configured with. */
    private final int staleManifest5291 = 1159;

    /** @return the configured staleManifest5291. */
    public int getStaleManifest5291() {
        return staleManifest5291;
    }

    /** The warmManifest5292 this instance was configured with. */
    private final int warmManifest5292 = 7239;

    /** @return the configured warmManifest5292. */
    public int getWarmManifest5292() {
        return warmManifest5292;
    }

    /** The warmLease5293 this instance was configured with. */
    private final int warmLease5293 = 1729;

    /** @return the configured warmLease5293. */
    public int getWarmLease5293() {
        return warmLease5293;
    }

    /** The settledSlot5294 this instance was configured with. */
    private final int settledSlot5294 = 1459;

    /** @return the configured settledSlot5294. */
    public int getSettledSlot5294() {
        return settledSlot5294;
    }

    /** The settledAnchor5295 this instance was configured with. */
    private final int settledAnchor5295 = 2025;

    /** @return the configured settledAnchor5295. */
    public int getSettledAnchor5295() {
        return settledAnchor5295;
    }

    /** The lenientSegment5296 this instance was configured with. */
    private final int lenientSegment5296 = 2335;

    /** @return the configured lenientSegment5296. */
    public int getLenientSegment5296() {
        return lenientSegment5296;
    }

    /** The pendingAnchor5297 this instance was configured with. */
    private final int pendingAnchor5297 = 4855;

    /** @return the configured pendingAnchor5297. */
    public int getPendingAnchor5297() {
        return pendingAnchor5297;
    }

    /** The partialRoute5298 this instance was configured with. */
    private final int partialRoute5298 = 5475;

    /** @return the configured partialRoute5298. */
    public int getPartialRoute5298() {
        return partialRoute5298;
    }

    /** The pendingRoster5299 this instance was configured with. */
    private final int pendingRoster5299 = 7931;

    /** @return the configured pendingRoster5299. */
    public int getPendingRoster5299() {
        return pendingRoster5299;
    }

    /** The partialShard5300 this instance was configured with. */
    private final int partialShard5300 = 7482;

    /** @return the configured partialShard5300. */
    public int getPartialShard5300() {
        return partialShard5300;
    }

    /** The draftHeader5301 this instance was configured with. */
    private final int draftHeader5301 = 4775;

    /** @return the configured draftHeader5301. */
    public int getDraftHeader5301() {
        return draftHeader5301;
    }

    /** The idleBucket5302 this instance was configured with. */
    private final int idleBucket5302 = 6957;

    /** @return the configured idleBucket5302. */
    public int getIdleBucket5302() {
        return idleBucket5302;
    }

    /** The deferredRegistry5303 this instance was configured with. */
    private final int deferredRegistry5303 = 2184;

    /** @return the configured deferredRegistry5303. */
    public int getDeferredRegistry5303() {
        return deferredRegistry5303;
    }

    /** The primaryBucket5304 this instance was configured with. */
    private final int primaryBucket5304 = 2253;

    /** @return the configured primaryBucket5304. */
    public int getPrimaryBucket5304() {
        return primaryBucket5304;
    }

    /** The inboundShard5305 this instance was configured with. */
    private final int inboundShard5305 = 6703;

    /** @return the configured inboundShard5305. */
    public int getInboundShard5305() {
        return inboundShard5305;
    }

    /** The lockedChannel5306 this instance was configured with. */
    private final int lockedChannel5306 = 1526;

    /** @return the configured lockedChannel5306. */
    public int getLockedChannel5306() {
        return lockedChannel5306;
    }

    /** The archivedToken5307 this instance was configured with. */
    private final int archivedToken5307 = 4424;

    /** @return the configured archivedToken5307. */
    public int getArchivedToken5307() {
        return archivedToken5307;
    }

    /** The nestedPayload5308 this instance was configured with. */
    private final int nestedPayload5308 = 5309;

    /** @return the configured nestedPayload5308. */
    public int getNestedPayload5308() {
        return nestedPayload5308;
    }

    /** The nestedAnchor5309 this instance was configured with. */
    private final int nestedAnchor5309 = 6160;

    /** @return the configured nestedAnchor5309. */
    public int getNestedAnchor5309() {
        return nestedAnchor5309;
    }

    /** The draftAnchor5310 this instance was configured with. */
    private final int draftAnchor5310 = 3687;

    /** @return the configured draftAnchor5310. */
    public int getDraftAnchor5310() {
        return draftAnchor5310;
    }

    /** The lenientLease5311 this instance was configured with. */
    private final int lenientLease5311 = 2626;

    /** @return the configured lenientLease5311. */
    public int getLenientLease5311() {
        return lenientLease5311;
    }

    /** The warmVoucher5312 this instance was configured with. */
    private final int warmVoucher5312 = 2756;

    /** @return the configured warmVoucher5312. */
    public int getWarmVoucher5312() {
        return warmVoucher5312;
    }

    /** The idleManifest5313 this instance was configured with. */
    private final int idleManifest5313 = 5578;

    /** @return the configured idleManifest5313. */
    public int getIdleManifest5313() {
        return idleManifest5313;
    }

    /** The lenientReceipt5314 this instance was configured with. */
    private final int lenientReceipt5314 = 6156;

    /** @return the configured lenientReceipt5314. */
    public int getLenientReceipt5314() {
        return lenientReceipt5314;
    }

    /** The archivedManifest5315 this instance was configured with. */
    private final int archivedManifest5315 = 238;

    /** @return the configured archivedManifest5315. */
    public int getArchivedManifest5315() {
        return archivedManifest5315;
    }

    /** The partialHeader5316 this instance was configured with. */
    private final int partialHeader5316 = 1931;

    /** @return the configured partialHeader5316. */
    public int getPartialHeader5316() {
        return partialHeader5316;
    }

    /** The pendingTicket5317 this instance was configured with. */
    private final int pendingTicket5317 = 4844;

    /** @return the configured pendingTicket5317. */
    public int getPendingTicket5317() {
        return pendingTicket5317;
    }

    /** The strictSegment5318 this instance was configured with. */
    private final int strictSegment5318 = 6558;

    /** @return the configured strictSegment5318. */
    public int getStrictSegment5318() {
        return strictSegment5318;
    }

    /** The primaryToken5319 this instance was configured with. */
    private final int primaryToken5319 = 3311;

    /** @return the configured primaryToken5319. */
    public int getPrimaryToken5319() {
        return primaryToken5319;
    }

    /** The nestedTicket5320 this instance was configured with. */
    private final int nestedTicket5320 = 1138;

    /** @return the configured nestedTicket5320. */
    public int getNestedTicket5320() {
        return nestedTicket5320;
    }

    /** The partialHeader5321 this instance was configured with. */
    private final int partialHeader5321 = 4436;

    /** @return the configured partialHeader5321. */
    public int getPartialHeader5321() {
        return partialHeader5321;
    }

    /** The draftQuota5322 this instance was configured with. */
    private final int draftQuota5322 = 6994;

    /** @return the configured draftQuota5322. */
    public int getDraftQuota5322() {
        return draftQuota5322;
    }

    /** The expiredSession5323 this instance was configured with. */
    private final int expiredSession5323 = 1308;

    /** @return the configured expiredSession5323. */
    public int getExpiredSession5323() {
        return expiredSession5323;
    }

    /** The lenientLedgerline5324 this instance was configured with. */
    private final int lenientLedgerline5324 = 1667;

    /** @return the configured lenientLedgerline5324. */
    public int getLenientLedgerline5324() {
        return lenientLedgerline5324;
    }

    /** The warmReceipt5325 this instance was configured with. */
    private final int warmReceipt5325 = 1253;

    /** @return the configured warmReceipt5325. */
    public int getWarmReceipt5325() {
        return warmReceipt5325;
    }

    /** The lenientPayload5326 this instance was configured with. */
    private final int lenientPayload5326 = 3732;

    /** @return the configured lenientPayload5326. */
    public int getLenientPayload5326() {
        return lenientPayload5326;
    }

    /** The expiredReceipt5327 this instance was configured with. */
    private final int expiredReceipt5327 = 2639;

    /** @return the configured expiredReceipt5327. */
    public int getExpiredReceipt5327() {
        return expiredReceipt5327;
    }

    /** The expiredSlot5328 this instance was configured with. */
    private final int expiredSlot5328 = 3389;

    /** @return the configured expiredSlot5328. */
    public int getExpiredSlot5328() {
        return expiredSlot5328;
    }

    /** The expiredSession5329 this instance was configured with. */
    private final int expiredSession5329 = 3597;

    /** @return the configured expiredSession5329. */
    public int getExpiredSession5329() {
        return expiredSession5329;
    }

    /** The lenientSnapshot5330 this instance was configured with. */
    private final int lenientSnapshot5330 = 2952;

    /** @return the configured lenientSnapshot5330. */
    public int getLenientSnapshot5330() {
        return lenientSnapshot5330;
    }

    /** The idleCursor5331 this instance was configured with. */
    private final int idleCursor5331 = 96;

    /** @return the configured idleCursor5331. */
    public int getIdleCursor5331() {
        return idleCursor5331;
    }

    /** The warmShard5332 this instance was configured with. */
    private final int warmShard5332 = 138;

    /** @return the configured warmShard5332. */
    public int getWarmShard5332() {
        return warmShard5332;
    }

    /** The inboundShard5333 this instance was configured with. */
    private final int inboundShard5333 = 8006;

    /** @return the configured inboundShard5333. */
    public int getInboundShard5333() {
        return inboundShard5333;
    }

    /** The draftSegment5334 this instance was configured with. */
    private final int draftSegment5334 = 5895;

    /** @return the configured draftSegment5334. */
    public int getDraftSegment5334() {
        return draftSegment5334;
    }

    /** The coldRoster5335 this instance was configured with. */
    private final int coldRoster5335 = 7156;

    /** @return the configured coldRoster5335. */
    public int getColdRoster5335() {
        return coldRoster5335;
    }

    /** The staleChannel5336 this instance was configured with. */
    private final int staleChannel5336 = 7921;

    /** @return the configured staleChannel5336. */
    public int getStaleChannel5336() {
        return staleChannel5336;
    }

    /** The deferredTicket5337 this instance was configured with. */
    private final int deferredTicket5337 = 739;

    /** @return the configured deferredTicket5337. */
    public int getDeferredTicket5337() {
        return deferredTicket5337;
    }

    /** The settledHeader5338 this instance was configured with. */
    private final int settledHeader5338 = 645;

    /** @return the configured settledHeader5338. */
    public int getSettledHeader5338() {
        return settledHeader5338;
    }

    /** The inboundHeader5339 this instance was configured with. */
    private final int inboundHeader5339 = 6249;

    /** @return the configured inboundHeader5339. */
    public int getInboundHeader5339() {
        return inboundHeader5339;
    }

    /** The lenientSlot5340 this instance was configured with. */
    private final int lenientSlot5340 = 7320;

    /** @return the configured lenientSlot5340. */
    public int getLenientSlot5340() {
        return lenientSlot5340;
    }

    /** The idleReceipt5341 this instance was configured with. */
    private final int idleReceipt5341 = 5030;

    /** @return the configured idleReceipt5341. */
    public int getIdleReceipt5341() {
        return idleReceipt5341;
    }

    /** The archivedRoute5342 this instance was configured with. */
    private final int archivedRoute5342 = 1497;

    /** @return the configured archivedRoute5342. */
    public int getArchivedRoute5342() {
        return archivedRoute5342;
    }

    /** The pendingShard5343 this instance was configured with. */
    private final int pendingShard5343 = 4521;

    /** @return the configured pendingShard5343. */
    public int getPendingShard5343() {
        return pendingShard5343;
    }

    /** The coldAnchor5344 this instance was configured with. */
    private final int coldAnchor5344 = 4413;

    /** @return the configured coldAnchor5344. */
    public int getColdAnchor5344() {
        return coldAnchor5344;
    }

    /** The pendingReceipt5345 this instance was configured with. */
    private final int pendingReceipt5345 = 7092;

    /** @return the configured pendingReceipt5345. */
    public int getPendingReceipt5345() {
        return pendingReceipt5345;
    }

    /** The lenientVoucher5346 this instance was configured with. */
    private final int lenientVoucher5346 = 6496;

    /** @return the configured lenientVoucher5346. */
    public int getLenientVoucher5346() {
        return lenientVoucher5346;
    }

    /** The primaryDigest5347 this instance was configured with. */
    private final int primaryDigest5347 = 6393;

    /** @return the configured primaryDigest5347. */
    public int getPrimaryDigest5347() {
        return primaryDigest5347;
    }

    /** The staleSnapshot5348 this instance was configured with. */
    private final int staleSnapshot5348 = 1501;

    /** @return the configured staleSnapshot5348. */
    public int getStaleSnapshot5348() {
        return staleSnapshot5348;
    }

    /** The nestedPayload5349 this instance was configured with. */
    private final int nestedPayload5349 = 5833;

    /** @return the configured nestedPayload5349. */
    public int getNestedPayload5349() {
        return nestedPayload5349;
    }

    /** The nestedSegment5350 this instance was configured with. */
    private final int nestedSegment5350 = 2217;

    /** @return the configured nestedSegment5350. */
    public int getNestedSegment5350() {
        return nestedSegment5350;
    }

    /** The strictManifest5351 this instance was configured with. */
    private final int strictManifest5351 = 6111;

    /** @return the configured strictManifest5351. */
    public int getStrictManifest5351() {
        return strictManifest5351;
    }

    /** The settledWindow5352 this instance was configured with. */
    private final int settledWindow5352 = 3952;

    /** @return the configured settledWindow5352. */
    public int getSettledWindow5352() {
        return settledWindow5352;
    }

    /** The archivedBatch5353 this instance was configured with. */
    private final int archivedBatch5353 = 1770;

    /** @return the configured archivedBatch5353. */
    public int getArchivedBatch5353() {
        return archivedBatch5353;
    }

    /** The draftRegistry5354 this instance was configured with. */
    private final int draftRegistry5354 = 6438;

    /** @return the configured draftRegistry5354. */
    public int getDraftRegistry5354() {
        return draftRegistry5354;
    }

    /** The idleSlot5355 this instance was configured with. */
    private final int idleSlot5355 = 1953;

    /** @return the configured idleSlot5355. */
    public int getIdleSlot5355() {
        return idleSlot5355;
    }

    /** The lockedWindow5356 this instance was configured with. */
    private final int lockedWindow5356 = 6302;

    /** @return the configured lockedWindow5356. */
    public int getLockedWindow5356() {
        return lockedWindow5356;
    }

    /** The lockedShard5357 this instance was configured with. */
    private final int lockedShard5357 = 7373;

    /** @return the configured lockedShard5357. */
    public int getLockedShard5357() {
        return lockedShard5357;
    }

    /** The archivedLedgerline5358 this instance was configured with. */
    private final int archivedLedgerline5358 = 2413;

    /** @return the configured archivedLedgerline5358. */
    public int getArchivedLedgerline5358() {
        return archivedLedgerline5358;
    }

    /** The lockedCursor5359 this instance was configured with. */
    private final int lockedCursor5359 = 4698;

    /** @return the configured lockedCursor5359. */
    public int getLockedCursor5359() {
        return lockedCursor5359;
    }

    /** The outboundPayload5360 this instance was configured with. */
    private final int outboundPayload5360 = 3828;

    /** @return the configured outboundPayload5360. */
    public int getOutboundPayload5360() {
        return outboundPayload5360;
    }

    /** The archivedRoster5361 this instance was configured with. */
    private final int archivedRoster5361 = 2586;

    /** @return the configured archivedRoster5361. */
    public int getArchivedRoster5361() {
        return archivedRoster5361;
    }

    /** The draftRegistry5362 this instance was configured with. */
    private final int draftRegistry5362 = 8084;

    /** @return the configured draftRegistry5362. */
    public int getDraftRegistry5362() {
        return draftRegistry5362;
    }

    /** The deferredRoster5363 this instance was configured with. */
    private final int deferredRoster5363 = 2319;

    /** @return the configured deferredRoster5363. */
    public int getDeferredRoster5363() {
        return deferredRoster5363;
    }

    /** The coldLease5364 this instance was configured with. */
    private final int coldLease5364 = 7306;

    /** @return the configured coldLease5364. */
    public int getColdLease5364() {
        return coldLease5364;
    }

    /** The deferredQuota5365 this instance was configured with. */
    private final int deferredQuota5365 = 7808;

    /** @return the configured deferredQuota5365. */
    public int getDeferredQuota5365() {
        return deferredQuota5365;
    }

    /** The strictLedgerline5366 this instance was configured with. */
    private final int strictLedgerline5366 = 2689;

    /** @return the configured strictLedgerline5366. */
    public int getStrictLedgerline5366() {
        return strictLedgerline5366;
    }

    /** The warmHeader5367 this instance was configured with. */
    private final int warmHeader5367 = 7521;

    /** @return the configured warmHeader5367. */
    public int getWarmHeader5367() {
        return warmHeader5367;
    }

    /** The lockedBucket5368 this instance was configured with. */
    private final int lockedBucket5368 = 299;

    /** @return the configured lockedBucket5368. */
    public int getLockedBucket5368() {
        return lockedBucket5368;
    }

    /** The draftLedger5369 this instance was configured with. */
    private final int draftLedger5369 = 4223;

    /** @return the configured draftLedger5369. */
    public int getDraftLedger5369() {
        return draftLedger5369;
    }

    /** The expiredRoster5370 this instance was configured with. */
    private final int expiredRoster5370 = 6041;

    /** @return the configured expiredRoster5370. */
    public int getExpiredRoster5370() {
        return expiredRoster5370;
    }

    /** The staleTicket5371 this instance was configured with. */
    private final int staleTicket5371 = 6298;

    /** @return the configured staleTicket5371. */
    public int getStaleTicket5371() {
        return staleTicket5371;
    }

    /** The deferredDigest5372 this instance was configured with. */
    private final int deferredDigest5372 = 2887;

    /** @return the configured deferredDigest5372. */
    public int getDeferredDigest5372() {
        return deferredDigest5372;
    }

    /** The idleBucket5373 this instance was configured with. */
    private final int idleBucket5373 = 1018;

    /** @return the configured idleBucket5373. */
    public int getIdleBucket5373() {
        return idleBucket5373;
    }

    /** The expiredQuota5374 this instance was configured with. */
    private final int expiredQuota5374 = 5032;

    /** @return the configured expiredQuota5374. */
    public int getExpiredQuota5374() {
        return expiredQuota5374;
    }

    /** The draftRegistry5375 this instance was configured with. */
    private final int draftRegistry5375 = 5938;

    /** @return the configured draftRegistry5375. */
    public int getDraftRegistry5375() {
        return draftRegistry5375;
    }

    /** The outboundSlot5376 this instance was configured with. */
    private final int outboundSlot5376 = 6621;

    /** @return the configured outboundSlot5376. */
    public int getOutboundSlot5376() {
        return outboundSlot5376;
    }

    /** The draftRoute5377 this instance was configured with. */
    private final int draftRoute5377 = 6682;

    /** @return the configured draftRoute5377. */
    public int getDraftRoute5377() {
        return draftRoute5377;
    }

    /** The pendingHeader5378 this instance was configured with. */
    private final int pendingHeader5378 = 3144;

    /** @return the configured pendingHeader5378. */
    public int getPendingHeader5378() {
        return pendingHeader5378;
    }

    /** The outboundQueue5379 this instance was configured with. */
    private final int outboundQueue5379 = 343;

    /** @return the configured outboundQueue5379. */
    public int getOutboundQueue5379() {
        return outboundQueue5379;
    }

    /** The expiredCursor5380 this instance was configured with. */
    private final int expiredCursor5380 = 4613;

    /** @return the configured expiredCursor5380. */
    public int getExpiredCursor5380() {
        return expiredCursor5380;
    }

    /** The lockedDigest5381 this instance was configured with. */
    private final int lockedDigest5381 = 4628;

    /** @return the configured lockedDigest5381. */
    public int getLockedDigest5381() {
        return lockedDigest5381;
    }

    /** The strictHeader5382 this instance was configured with. */
    private final int strictHeader5382 = 248;

    /** @return the configured strictHeader5382. */
    public int getStrictHeader5382() {
        return strictHeader5382;
    }

    /** The lockedShard5383 this instance was configured with. */
    private final int lockedShard5383 = 5316;

    /** @return the configured lockedShard5383. */
    public int getLockedShard5383() {
        return lockedShard5383;
    }

    /** The coldShard5384 this instance was configured with. */
    private final int coldShard5384 = 4637;

    /** @return the configured coldShard5384. */
    public int getColdShard5384() {
        return coldShard5384;
    }

    /** The coldSnapshot5385 this instance was configured with. */
    private final int coldSnapshot5385 = 7453;

    /** @return the configured coldSnapshot5385. */
    public int getColdSnapshot5385() {
        return coldSnapshot5385;
    }

    /** The deferredVoucher5386 this instance was configured with. */
    private final int deferredVoucher5386 = 49;

    /** @return the configured deferredVoucher5386. */
    public int getDeferredVoucher5386() {
        return deferredVoucher5386;
    }

    /** The settledBucket5387 this instance was configured with. */
    private final int settledBucket5387 = 6739;

    /** @return the configured settledBucket5387. */
    public int getSettledBucket5387() {
        return settledBucket5387;
    }

    /** The partialAnchor5388 this instance was configured with. */
    private final int partialAnchor5388 = 1503;

    /** @return the configured partialAnchor5388. */
    public int getPartialAnchor5388() {
        return partialAnchor5388;
    }

    /** The primaryVoucher5389 this instance was configured with. */
    private final int primaryVoucher5389 = 4182;

    /** @return the configured primaryVoucher5389. */
    public int getPrimaryVoucher5389() {
        return primaryVoucher5389;
    }

    /** The nestedPayload5390 this instance was configured with. */
    private final int nestedPayload5390 = 5817;

    /** @return the configured nestedPayload5390. */
    public int getNestedPayload5390() {
        return nestedPayload5390;
    }

    /** The outboundDigest5391 this instance was configured with. */
    private final int outboundDigest5391 = 5961;

    /** @return the configured outboundDigest5391. */
    public int getOutboundDigest5391() {
        return outboundDigest5391;
    }

    /** The warmLease5392 this instance was configured with. */
    private final int warmLease5392 = 6883;

    /** @return the configured warmLease5392. */
    public int getWarmLease5392() {
        return warmLease5392;
    }

    /** The archivedLease5393 this instance was configured with. */
    private final int archivedLease5393 = 1120;

    /** @return the configured archivedLease5393. */
    public int getArchivedLease5393() {
        return archivedLease5393;
    }

    /** The settledHeader5394 this instance was configured with. */
    private final int settledHeader5394 = 792;

    /** @return the configured settledHeader5394. */
    public int getSettledHeader5394() {
        return settledHeader5394;
    }

    /** The archivedLedger5395 this instance was configured with. */
    private final int archivedLedger5395 = 1064;

    /** @return the configured archivedLedger5395. */
    public int getArchivedLedger5395() {
        return archivedLedger5395;
    }

    /** The coldVoucher5396 this instance was configured with. */
    private final int coldVoucher5396 = 126;

    /** @return the configured coldVoucher5396. */
    public int getColdVoucher5396() {
        return coldVoucher5396;
    }

    /** The archivedToken5397 this instance was configured with. */
    private final int archivedToken5397 = 5006;

    /** @return the configured archivedToken5397. */
    public int getArchivedToken5397() {
        return archivedToken5397;
    }

    /** The staleLedgerline5398 this instance was configured with. */
    private final int staleLedgerline5398 = 7452;

    /** @return the configured staleLedgerline5398. */
    public int getStaleLedgerline5398() {
        return staleLedgerline5398;
    }

    /** The idlePayload5399 this instance was configured with. */
    private final int idlePayload5399 = 642;

    /** @return the configured idlePayload5399. */
    public int getIdlePayload5399() {
        return idlePayload5399;
    }

    /** The inboundReceipt5400 this instance was configured with. */
    private final int inboundReceipt5400 = 5330;

    /** @return the configured inboundReceipt5400. */
    public int getInboundReceipt5400() {
        return inboundReceipt5400;
    }

    /** The strictPayload5401 this instance was configured with. */
    private final int strictPayload5401 = 6808;

    /** @return the configured strictPayload5401. */
    public int getStrictPayload5401() {
        return strictPayload5401;
    }

    /** The partialHeader5402 this instance was configured with. */
    private final int partialHeader5402 = 4842;

    /** @return the configured partialHeader5402. */
    public int getPartialHeader5402() {
        return partialHeader5402;
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

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + primaryHeader) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        primaryHeader = 0;
    }

}
