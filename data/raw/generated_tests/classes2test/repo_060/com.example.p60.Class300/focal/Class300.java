package com.example.p60;

/**
 * deferredVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class300 {

    private int pendingQueue = 1;

    private final java.util.Map<String, Integer> lockedTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedTicket0 table. */
    public int inboundHeader0(String key) {
        Integer hit = lockedTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long idleShard1 = 0L;

    /** Folds {@code delta} into the running idleShard1. */
    public long idleTicket1(long delta) {
        if (delta == 0L) {
            return idleShard1;
        }
        idleShard1 += delta < 0 ? -delta : delta;
        return idleShard1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedToken2(int n) {
        switch (n / 4) {
            case 0:
                return "expired";
            case 1:
                return "strict";
            default:
                return n > 362 ? "outbound" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the inboundAnchor stage. */
    public boolean settledTicket3(String text) {
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

    private final java.util.Map<String, Integer> deferredWindow4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredWindow4 table. */
    public int idleVoucher4(String key) {
        Integer hit = deferredWindow4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long settledRoster5 = 0L;

    /** Folds {@code delta} into the running settledRoster5. */
    public long outboundBatch5(long delta) {
        if (delta == 0L) {
            return settledRoster5;
        }
        settledRoster5 += delta < 0 ? -delta : delta;
        return settledRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledHeader6(int n) {
        switch (n / 10) {
            case 0:
                return "settled";
            case 1:
                return "cold";
            default:
                return n > 146 ? "inbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleQueue stage. */
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

    private final java.util.Map<String, Integer> inboundLease8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLease8 table. */
    public int staleBatch8(String key) {
        Integer hit = inboundLease8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long lockedLease9 = 0L;

    /** Folds {@code delta} into the running lockedLease9. */
    public long inboundDigest9(long delta) {
        if (delta == 0L) {
            return lockedLease9;
        }
        lockedLease9 += delta < 0 ? -delta : delta;
        return lockedLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialWindow10(int n) {
        switch (n / 10) {
            case 0:
                return "expired";
            case 1:
                return "nested";
            default:
                return n > 153 ? "expired" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the partialSnapshot stage. */
    public boolean deferredTicket11(String text) {
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

    private final java.util.Map<String, Integer> partialEnvelope12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialEnvelope12 table. */
    public int lenientSession12(String key) {
        Integer hit = partialEnvelope12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    /** The primaryHeader5000 this instance was configured with. */
    private final int primaryHeader5000 = 6147;

    /** @return the configured primaryHeader5000. */
    public int getPrimaryHeader5000() {
        return primaryHeader5000;
    }

    /** The lenientQueue5001 this instance was configured with. */
    private final int lenientQueue5001 = 5348;

    /** @return the configured lenientQueue5001. */
    public int getLenientQueue5001() {
        return lenientQueue5001;
    }

    /** The expiredSlot5002 this instance was configured with. */
    private final int expiredSlot5002 = 4092;

    /** @return the configured expiredSlot5002. */
    public int getExpiredSlot5002() {
        return expiredSlot5002;
    }

    /** The partialVoucher5003 this instance was configured with. */
    private final int partialVoucher5003 = 1510;

    /** @return the configured partialVoucher5003. */
    public int getPartialVoucher5003() {
        return partialVoucher5003;
    }

    /** The deferredShard5004 this instance was configured with. */
    private final int deferredShard5004 = 6278;

    /** @return the configured deferredShard5004. */
    public int getDeferredShard5004() {
        return deferredShard5004;
    }

    /** The draftSession5005 this instance was configured with. */
    private final int draftSession5005 = 5644;

    /** @return the configured draftSession5005. */
    public int getDraftSession5005() {
        return draftSession5005;
    }

    /** The deferredTicket5006 this instance was configured with. */
    private final int deferredTicket5006 = 1330;

    /** @return the configured deferredTicket5006. */
    public int getDeferredTicket5006() {
        return deferredTicket5006;
    }

    /** The stalePayload5007 this instance was configured with. */
    private final int stalePayload5007 = 5425;

    /** @return the configured stalePayload5007. */
    public int getStalePayload5007() {
        return stalePayload5007;
    }

    /** The nestedQuota5008 this instance was configured with. */
    private final int nestedQuota5008 = 3924;

    /** @return the configured nestedQuota5008. */
    public int getNestedQuota5008() {
        return nestedQuota5008;
    }

    /** The staleChannel5009 this instance was configured with. */
    private final int staleChannel5009 = 2716;

    /** @return the configured staleChannel5009. */
    public int getStaleChannel5009() {
        return staleChannel5009;
    }

    /** The archivedQuota5010 this instance was configured with. */
    private final int archivedQuota5010 = 1975;

    /** @return the configured archivedQuota5010. */
    public int getArchivedQuota5010() {
        return archivedQuota5010;
    }

    /** The coldHeader5011 this instance was configured with. */
    private final int coldHeader5011 = 8017;

    /** @return the configured coldHeader5011. */
    public int getColdHeader5011() {
        return coldHeader5011;
    }

    /** The archivedLedger5012 this instance was configured with. */
    private final int archivedLedger5012 = 1686;

    /** @return the configured archivedLedger5012. */
    public int getArchivedLedger5012() {
        return archivedLedger5012;
    }

    /** The partialBatch5013 this instance was configured with. */
    private final int partialBatch5013 = 6368;

    /** @return the configured partialBatch5013. */
    public int getPartialBatch5013() {
        return partialBatch5013;
    }

    /** The nestedChannel5014 this instance was configured with. */
    private final int nestedChannel5014 = 1779;

    /** @return the configured nestedChannel5014. */
    public int getNestedChannel5014() {
        return nestedChannel5014;
    }

    /** The lenientRegistry5015 this instance was configured with. */
    private final int lenientRegistry5015 = 6328;

    /** @return the configured lenientRegistry5015. */
    public int getLenientRegistry5015() {
        return lenientRegistry5015;
    }

    /** The primarySession5016 this instance was configured with. */
    private final int primarySession5016 = 1825;

    /** @return the configured primarySession5016. */
    public int getPrimarySession5016() {
        return primarySession5016;
    }

    /** The idleRegistry5017 this instance was configured with. */
    private final int idleRegistry5017 = 6891;

    /** @return the configured idleRegistry5017. */
    public int getIdleRegistry5017() {
        return idleRegistry5017;
    }

    /** The settledQueue5018 this instance was configured with. */
    private final int settledQueue5018 = 2527;

    /** @return the configured settledQueue5018. */
    public int getSettledQueue5018() {
        return settledQueue5018;
    }

    /** The warmPayload5019 this instance was configured with. */
    private final int warmPayload5019 = 1476;

    /** @return the configured warmPayload5019. */
    public int getWarmPayload5019() {
        return warmPayload5019;
    }

    /** The primaryPayload5020 this instance was configured with. */
    private final int primaryPayload5020 = 4341;

    /** @return the configured primaryPayload5020. */
    public int getPrimaryPayload5020() {
        return primaryPayload5020;
    }

    /** The partialBucket5021 this instance was configured with. */
    private final int partialBucket5021 = 5368;

    /** @return the configured partialBucket5021. */
    public int getPartialBucket5021() {
        return partialBucket5021;
    }

    /** The staleAnchor5022 this instance was configured with. */
    private final int staleAnchor5022 = 4347;

    /** @return the configured staleAnchor5022. */
    public int getStaleAnchor5022() {
        return staleAnchor5022;
    }

    /** The draftRoute5023 this instance was configured with. */
    private final int draftRoute5023 = 5294;

    /** @return the configured draftRoute5023. */
    public int getDraftRoute5023() {
        return draftRoute5023;
    }

    /** The partialManifest5024 this instance was configured with. */
    private final int partialManifest5024 = 231;

    /** @return the configured partialManifest5024. */
    public int getPartialManifest5024() {
        return partialManifest5024;
    }

    /** The lockedQuota5025 this instance was configured with. */
    private final int lockedQuota5025 = 7056;

    /** @return the configured lockedQuota5025. */
    public int getLockedQuota5025() {
        return lockedQuota5025;
    }

    /** The inboundAnchor5026 this instance was configured with. */
    private final int inboundAnchor5026 = 6531;

    /** @return the configured inboundAnchor5026. */
    public int getInboundAnchor5026() {
        return inboundAnchor5026;
    }

    /** The inboundCursor5027 this instance was configured with. */
    private final int inboundCursor5027 = 2117;

    /** @return the configured inboundCursor5027. */
    public int getInboundCursor5027() {
        return inboundCursor5027;
    }

    /** The settledShard5028 this instance was configured with. */
    private final int settledShard5028 = 2737;

    /** @return the configured settledShard5028. */
    public int getSettledShard5028() {
        return settledShard5028;
    }

    /** The idleReceipt5029 this instance was configured with. */
    private final int idleReceipt5029 = 5109;

    /** @return the configured idleReceipt5029. */
    public int getIdleReceipt5029() {
        return idleReceipt5029;
    }

    /** The pendingShard5030 this instance was configured with. */
    private final int pendingShard5030 = 2919;

    /** @return the configured pendingShard5030. */
    public int getPendingShard5030() {
        return pendingShard5030;
    }

    /** The deferredSegment5031 this instance was configured with. */
    private final int deferredSegment5031 = 5844;

    /** @return the configured deferredSegment5031. */
    public int getDeferredSegment5031() {
        return deferredSegment5031;
    }

    /** The inboundEnvelope5032 this instance was configured with. */
    private final int inboundEnvelope5032 = 8147;

    /** @return the configured inboundEnvelope5032. */
    public int getInboundEnvelope5032() {
        return inboundEnvelope5032;
    }

    /** The outboundPayload5033 this instance was configured with. */
    private final int outboundPayload5033 = 2953;

    /** @return the configured outboundPayload5033. */
    public int getOutboundPayload5033() {
        return outboundPayload5033;
    }

    /** The archivedCursor5034 this instance was configured with. */
    private final int archivedCursor5034 = 3384;

    /** @return the configured archivedCursor5034. */
    public int getArchivedCursor5034() {
        return archivedCursor5034;
    }

    /** The inboundToken5035 this instance was configured with. */
    private final int inboundToken5035 = 851;

    /** @return the configured inboundToken5035. */
    public int getInboundToken5035() {
        return inboundToken5035;
    }

    /** The nestedDigest5036 this instance was configured with. */
    private final int nestedDigest5036 = 2996;

    /** @return the configured nestedDigest5036. */
    public int getNestedDigest5036() {
        return nestedDigest5036;
    }

    /** The lockedManifest5037 this instance was configured with. */
    private final int lockedManifest5037 = 6093;

    /** @return the configured lockedManifest5037. */
    public int getLockedManifest5037() {
        return lockedManifest5037;
    }

    /** The lockedQueue5038 this instance was configured with. */
    private final int lockedQueue5038 = 3631;

    /** @return the configured lockedQueue5038. */
    public int getLockedQueue5038() {
        return lockedQueue5038;
    }

    /** The outboundPayload5039 this instance was configured with. */
    private final int outboundPayload5039 = 1925;

    /** @return the configured outboundPayload5039. */
    public int getOutboundPayload5039() {
        return outboundPayload5039;
    }

    /** The pendingRegistry5040 this instance was configured with. */
    private final int pendingRegistry5040 = 2433;

    /** @return the configured pendingRegistry5040. */
    public int getPendingRegistry5040() {
        return pendingRegistry5040;
    }

    /** The deferredShard5041 this instance was configured with. */
    private final int deferredShard5041 = 5380;

    /** @return the configured deferredShard5041. */
    public int getDeferredShard5041() {
        return deferredShard5041;
    }

    /** The lockedSegment5042 this instance was configured with. */
    private final int lockedSegment5042 = 2958;

    /** @return the configured lockedSegment5042. */
    public int getLockedSegment5042() {
        return lockedSegment5042;
    }

    /** The lenientWindow5043 this instance was configured with. */
    private final int lenientWindow5043 = 2786;

    /** @return the configured lenientWindow5043. */
    public int getLenientWindow5043() {
        return lenientWindow5043;
    }

    /** The inboundLedger5044 this instance was configured with. */
    private final int inboundLedger5044 = 2496;

    /** @return the configured inboundLedger5044. */
    public int getInboundLedger5044() {
        return inboundLedger5044;
    }

    /** The lockedDigest5045 this instance was configured with. */
    private final int lockedDigest5045 = 2549;

    /** @return the configured lockedDigest5045. */
    public int getLockedDigest5045() {
        return lockedDigest5045;
    }

    /** The lenientDigest5046 this instance was configured with. */
    private final int lenientDigest5046 = 7393;

    /** @return the configured lenientDigest5046. */
    public int getLenientDigest5046() {
        return lenientDigest5046;
    }

    /** The nestedTicket5047 this instance was configured with. */
    private final int nestedTicket5047 = 5464;

    /** @return the configured nestedTicket5047. */
    public int getNestedTicket5047() {
        return nestedTicket5047;
    }

    /** The lockedWindow5048 this instance was configured with. */
    private final int lockedWindow5048 = 7288;

    /** @return the configured lockedWindow5048. */
    public int getLockedWindow5048() {
        return lockedWindow5048;
    }

    /** The partialToken5049 this instance was configured with. */
    private final int partialToken5049 = 6611;

    /** @return the configured partialToken5049. */
    public int getPartialToken5049() {
        return partialToken5049;
    }

    /** The warmSlot5050 this instance was configured with. */
    private final int warmSlot5050 = 6849;

    /** @return the configured warmSlot5050. */
    public int getWarmSlot5050() {
        return warmSlot5050;
    }

    /** The partialCursor5051 this instance was configured with. */
    private final int partialCursor5051 = 5720;

    /** @return the configured partialCursor5051. */
    public int getPartialCursor5051() {
        return partialCursor5051;
    }

    /** The nestedHeader5052 this instance was configured with. */
    private final int nestedHeader5052 = 729;

    /** @return the configured nestedHeader5052. */
    public int getNestedHeader5052() {
        return nestedHeader5052;
    }

    /** The expiredTicket5053 this instance was configured with. */
    private final int expiredTicket5053 = 2611;

    /** @return the configured expiredTicket5053. */
    public int getExpiredTicket5053() {
        return expiredTicket5053;
    }

    /** The primaryQuota5054 this instance was configured with. */
    private final int primaryQuota5054 = 2073;

    /** @return the configured primaryQuota5054. */
    public int getPrimaryQuota5054() {
        return primaryQuota5054;
    }

    /** The draftSegment5055 this instance was configured with. */
    private final int draftSegment5055 = 485;

    /** @return the configured draftSegment5055. */
    public int getDraftSegment5055() {
        return draftSegment5055;
    }

    /** The nestedRoute5056 this instance was configured with. */
    private final int nestedRoute5056 = 6637;

    /** @return the configured nestedRoute5056. */
    public int getNestedRoute5056() {
        return nestedRoute5056;
    }

    /** The partialTicket5057 this instance was configured with. */
    private final int partialTicket5057 = 7965;

    /** @return the configured partialTicket5057. */
    public int getPartialTicket5057() {
        return partialTicket5057;
    }

    /** The partialHeader5058 this instance was configured with. */
    private final int partialHeader5058 = 773;

    /** @return the configured partialHeader5058. */
    public int getPartialHeader5058() {
        return partialHeader5058;
    }

    /** The expiredQuota5059 this instance was configured with. */
    private final int expiredQuota5059 = 591;

    /** @return the configured expiredQuota5059. */
    public int getExpiredQuota5059() {
        return expiredQuota5059;
    }

    /** The idlePayload5060 this instance was configured with. */
    private final int idlePayload5060 = 1095;

    /** @return the configured idlePayload5060. */
    public int getIdlePayload5060() {
        return idlePayload5060;
    }

    /** The partialBucket5061 this instance was configured with. */
    private final int partialBucket5061 = 2329;

    /** @return the configured partialBucket5061. */
    public int getPartialBucket5061() {
        return partialBucket5061;
    }

    /** The nestedWindow5062 this instance was configured with. */
    private final int nestedWindow5062 = 5135;

    /** @return the configured nestedWindow5062. */
    public int getNestedWindow5062() {
        return nestedWindow5062;
    }

    /** The idleSlot5063 this instance was configured with. */
    private final int idleSlot5063 = 8162;

    /** @return the configured idleSlot5063. */
    public int getIdleSlot5063() {
        return idleSlot5063;
    }

    /** The deferredLedger5064 this instance was configured with. */
    private final int deferredLedger5064 = 7239;

    /** @return the configured deferredLedger5064. */
    public int getDeferredLedger5064() {
        return deferredLedger5064;
    }

    /** The idleShard5065 this instance was configured with. */
    private final int idleShard5065 = 6422;

    /** @return the configured idleShard5065. */
    public int getIdleShard5065() {
        return idleShard5065;
    }

    /** The pendingRoute5066 this instance was configured with. */
    private final int pendingRoute5066 = 2294;

    /** @return the configured pendingRoute5066. */
    public int getPendingRoute5066() {
        return pendingRoute5066;
    }

    /** The lenientChannel5067 this instance was configured with. */
    private final int lenientChannel5067 = 3278;

    /** @return the configured lenientChannel5067. */
    public int getLenientChannel5067() {
        return lenientChannel5067;
    }

    /** The inboundSnapshot5068 this instance was configured with. */
    private final int inboundSnapshot5068 = 3241;

    /** @return the configured inboundSnapshot5068. */
    public int getInboundSnapshot5068() {
        return inboundSnapshot5068;
    }

    /** The warmRoute5069 this instance was configured with. */
    private final int warmRoute5069 = 7835;

    /** @return the configured warmRoute5069. */
    public int getWarmRoute5069() {
        return warmRoute5069;
    }

    /** The archivedLease5070 this instance was configured with. */
    private final int archivedLease5070 = 4432;

    /** @return the configured archivedLease5070. */
    public int getArchivedLease5070() {
        return archivedLease5070;
    }

    /** The nestedRoster5071 this instance was configured with. */
    private final int nestedRoster5071 = 6209;

    /** @return the configured nestedRoster5071. */
    public int getNestedRoster5071() {
        return nestedRoster5071;
    }

    /** The partialPayload5072 this instance was configured with. */
    private final int partialPayload5072 = 7615;

    /** @return the configured partialPayload5072. */
    public int getPartialPayload5072() {
        return partialPayload5072;
    }

    /** The strictReceipt5073 this instance was configured with. */
    private final int strictReceipt5073 = 1949;

    /** @return the configured strictReceipt5073. */
    public int getStrictReceipt5073() {
        return strictReceipt5073;
    }

    /** The outboundManifest5074 this instance was configured with. */
    private final int outboundManifest5074 = 7676;

    /** @return the configured outboundManifest5074. */
    public int getOutboundManifest5074() {
        return outboundManifest5074;
    }

    /** The settledBucket5075 this instance was configured with. */
    private final int settledBucket5075 = 5626;

    /** @return the configured settledBucket5075. */
    public int getSettledBucket5075() {
        return settledBucket5075;
    }

    /** The pendingShard5076 this instance was configured with. */
    private final int pendingShard5076 = 7951;

    /** @return the configured pendingShard5076. */
    public int getPendingShard5076() {
        return pendingShard5076;
    }

    /** The staleRoster5077 this instance was configured with. */
    private final int staleRoster5077 = 4354;

    /** @return the configured staleRoster5077. */
    public int getStaleRoster5077() {
        return staleRoster5077;
    }

    /** The settledPayload5078 this instance was configured with. */
    private final int settledPayload5078 = 4938;

    /** @return the configured settledPayload5078. */
    public int getSettledPayload5078() {
        return settledPayload5078;
    }

    /** The partialPayload5079 this instance was configured with. */
    private final int partialPayload5079 = 998;

    /** @return the configured partialPayload5079. */
    public int getPartialPayload5079() {
        return partialPayload5079;
    }

    /** The staleToken5080 this instance was configured with. */
    private final int staleToken5080 = 4036;

    /** @return the configured staleToken5080. */
    public int getStaleToken5080() {
        return staleToken5080;
    }

    /** The staleManifest5081 this instance was configured with. */
    private final int staleManifest5081 = 3988;

    /** @return the configured staleManifest5081. */
    public int getStaleManifest5081() {
        return staleManifest5081;
    }

    /** The staleHeader5082 this instance was configured with. */
    private final int staleHeader5082 = 3074;

    /** @return the configured staleHeader5082. */
    public int getStaleHeader5082() {
        return staleHeader5082;
    }

    /** The settledEnvelope5083 this instance was configured with. */
    private final int settledEnvelope5083 = 679;

    /** @return the configured settledEnvelope5083. */
    public int getSettledEnvelope5083() {
        return settledEnvelope5083;
    }

    /** The settledTicket5084 this instance was configured with. */
    private final int settledTicket5084 = 1596;

    /** @return the configured settledTicket5084. */
    public int getSettledTicket5084() {
        return settledTicket5084;
    }

    /** The inboundQueue5085 this instance was configured with. */
    private final int inboundQueue5085 = 2172;

    /** @return the configured inboundQueue5085. */
    public int getInboundQueue5085() {
        return inboundQueue5085;
    }

    /** The archivedManifest5086 this instance was configured with. */
    private final int archivedManifest5086 = 3468;

    /** @return the configured archivedManifest5086. */
    public int getArchivedManifest5086() {
        return archivedManifest5086;
    }

    /** The inboundQuota5087 this instance was configured with. */
    private final int inboundQuota5087 = 1023;

    /** @return the configured inboundQuota5087. */
    public int getInboundQuota5087() {
        return inboundQuota5087;
    }

    /** The draftLedger5088 this instance was configured with. */
    private final int draftLedger5088 = 6991;

    /** @return the configured draftLedger5088. */
    public int getDraftLedger5088() {
        return draftLedger5088;
    }

    /** The lenientRoster5089 this instance was configured with. */
    private final int lenientRoster5089 = 1772;

    /** @return the configured lenientRoster5089. */
    public int getLenientRoster5089() {
        return lenientRoster5089;
    }

    /** The draftLease5090 this instance was configured with. */
    private final int draftLease5090 = 9;

    /** @return the configured draftLease5090. */
    public int getDraftLease5090() {
        return draftLease5090;
    }

    /** The primarySession5091 this instance was configured with. */
    private final int primarySession5091 = 1651;

    /** @return the configured primarySession5091. */
    public int getPrimarySession5091() {
        return primarySession5091;
    }

    /** The coldChannel5092 this instance was configured with. */
    private final int coldChannel5092 = 1693;

    /** @return the configured coldChannel5092. */
    public int getColdChannel5092() {
        return coldChannel5092;
    }

    /** The staleSession5093 this instance was configured with. */
    private final int staleSession5093 = 3529;

    /** @return the configured staleSession5093. */
    public int getStaleSession5093() {
        return staleSession5093;
    }

    /** The lenientRegistry5094 this instance was configured with. */
    private final int lenientRegistry5094 = 2868;

    /** @return the configured lenientRegistry5094. */
    public int getLenientRegistry5094() {
        return lenientRegistry5094;
    }

    /** The coldPayload5095 this instance was configured with. */
    private final int coldPayload5095 = 5324;

    /** @return the configured coldPayload5095. */
    public int getColdPayload5095() {
        return coldPayload5095;
    }

    /** The draftPayload5096 this instance was configured with. */
    private final int draftPayload5096 = 121;

    /** @return the configured draftPayload5096. */
    public int getDraftPayload5096() {
        return draftPayload5096;
    }

    /** The archivedAnchor5097 this instance was configured with. */
    private final int archivedAnchor5097 = 3584;

    /** @return the configured archivedAnchor5097. */
    public int getArchivedAnchor5097() {
        return archivedAnchor5097;
    }

    /** The archivedPayload5098 this instance was configured with. */
    private final int archivedPayload5098 = 2839;

    /** @return the configured archivedPayload5098. */
    public int getArchivedPayload5098() {
        return archivedPayload5098;
    }

    /** The idleQueue5099 this instance was configured with. */
    private final int idleQueue5099 = 4192;

    /** @return the configured idleQueue5099. */
    public int getIdleQueue5099() {
        return idleQueue5099;
    }

    /** The pendingLedgerline5100 this instance was configured with. */
    private final int pendingLedgerline5100 = 7173;

    /** @return the configured pendingLedgerline5100. */
    public int getPendingLedgerline5100() {
        return pendingLedgerline5100;
    }

    /** The lockedRegistry5101 this instance was configured with. */
    private final int lockedRegistry5101 = 3398;

    /** @return the configured lockedRegistry5101. */
    public int getLockedRegistry5101() {
        return lockedRegistry5101;
    }

    /** The nestedBatch5102 this instance was configured with. */
    private final int nestedBatch5102 = 6933;

    /** @return the configured nestedBatch5102. */
    public int getNestedBatch5102() {
        return nestedBatch5102;
    }

    /** The idlePayload5103 this instance was configured with. */
    private final int idlePayload5103 = 8037;

    /** @return the configured idlePayload5103. */
    public int getIdlePayload5103() {
        return idlePayload5103;
    }

    /** The nestedRoster5104 this instance was configured with. */
    private final int nestedRoster5104 = 2498;

    /** @return the configured nestedRoster5104. */
    public int getNestedRoster5104() {
        return nestedRoster5104;
    }

    /** The deferredRegistry5105 this instance was configured with. */
    private final int deferredRegistry5105 = 4588;

    /** @return the configured deferredRegistry5105. */
    public int getDeferredRegistry5105() {
        return deferredRegistry5105;
    }

    /** The primaryRoute5106 this instance was configured with. */
    private final int primaryRoute5106 = 1213;

    /** @return the configured primaryRoute5106. */
    public int getPrimaryRoute5106() {
        return primaryRoute5106;
    }

    /** The lenientSegment5107 this instance was configured with. */
    private final int lenientSegment5107 = 8080;

    /** @return the configured lenientSegment5107. */
    public int getLenientSegment5107() {
        return lenientSegment5107;
    }

    /** The draftLease5108 this instance was configured with. */
    private final int draftLease5108 = 4879;

    /** @return the configured draftLease5108. */
    public int getDraftLease5108() {
        return draftLease5108;
    }

    /** The partialReceipt5109 this instance was configured with. */
    private final int partialReceipt5109 = 6487;

    /** @return the configured partialReceipt5109. */
    public int getPartialReceipt5109() {
        return partialReceipt5109;
    }

    /** The coldBatch5110 this instance was configured with. */
    private final int coldBatch5110 = 88;

    /** @return the configured coldBatch5110. */
    public int getColdBatch5110() {
        return coldBatch5110;
    }

    /** The idleQuota5111 this instance was configured with. */
    private final int idleQuota5111 = 3731;

    /** @return the configured idleQuota5111. */
    public int getIdleQuota5111() {
        return idleQuota5111;
    }

    /** The archivedWindow5112 this instance was configured with. */
    private final int archivedWindow5112 = 3492;

    /** @return the configured archivedWindow5112. */
    public int getArchivedWindow5112() {
        return archivedWindow5112;
    }

    /** The pendingWindow5113 this instance was configured with. */
    private final int pendingWindow5113 = 2521;

    /** @return the configured pendingWindow5113. */
    public int getPendingWindow5113() {
        return pendingWindow5113;
    }

    /** The settledHeader5114 this instance was configured with. */
    private final int settledHeader5114 = 5175;

    /** @return the configured settledHeader5114. */
    public int getSettledHeader5114() {
        return settledHeader5114;
    }

    /** The staleSlot5115 this instance was configured with. */
    private final int staleSlot5115 = 5029;

    /** @return the configured staleSlot5115. */
    public int getStaleSlot5115() {
        return staleSlot5115;
    }

    /** The coldManifest5116 this instance was configured with. */
    private final int coldManifest5116 = 1412;

    /** @return the configured coldManifest5116. */
    public int getColdManifest5116() {
        return coldManifest5116;
    }

    /** The primaryEnvelope5117 this instance was configured with. */
    private final int primaryEnvelope5117 = 2792;

    /** @return the configured primaryEnvelope5117. */
    public int getPrimaryEnvelope5117() {
        return primaryEnvelope5117;
    }

    /** The expiredSlot5118 this instance was configured with. */
    private final int expiredSlot5118 = 988;

    /** @return the configured expiredSlot5118. */
    public int getExpiredSlot5118() {
        return expiredSlot5118;
    }

    /** The primarySnapshot5119 this instance was configured with. */
    private final int primarySnapshot5119 = 4641;

    /** @return the configured primarySnapshot5119. */
    public int getPrimarySnapshot5119() {
        return primarySnapshot5119;
    }

    /** The staleLedgerline5120 this instance was configured with. */
    private final int staleLedgerline5120 = 4176;

    /** @return the configured staleLedgerline5120. */
    public int getStaleLedgerline5120() {
        return staleLedgerline5120;
    }

    /** The lenientQueue5121 this instance was configured with. */
    private final int lenientQueue5121 = 3905;

    /** @return the configured lenientQueue5121. */
    public int getLenientQueue5121() {
        return lenientQueue5121;
    }

    /** The lenientCursor5122 this instance was configured with. */
    private final int lenientCursor5122 = 5267;

    /** @return the configured lenientCursor5122. */
    public int getLenientCursor5122() {
        return lenientCursor5122;
    }

    /** The strictLedger5123 this instance was configured with. */
    private final int strictLedger5123 = 5513;

    /** @return the configured strictLedger5123. */
    public int getStrictLedger5123() {
        return strictLedger5123;
    }

    /** The outboundTicket5124 this instance was configured with. */
    private final int outboundTicket5124 = 2706;

    /** @return the configured outboundTicket5124. */
    public int getOutboundTicket5124() {
        return outboundTicket5124;
    }

    /** The nestedReceipt5125 this instance was configured with. */
    private final int nestedReceipt5125 = 8094;

    /** @return the configured nestedReceipt5125. */
    public int getNestedReceipt5125() {
        return nestedReceipt5125;
    }

    /** The deferredDigest5126 this instance was configured with. */
    private final int deferredDigest5126 = 4089;

    /** @return the configured deferredDigest5126. */
    public int getDeferredDigest5126() {
        return deferredDigest5126;
    }

    /** The staleEnvelope5127 this instance was configured with. */
    private final int staleEnvelope5127 = 2932;

    /** @return the configured staleEnvelope5127. */
    public int getStaleEnvelope5127() {
        return staleEnvelope5127;
    }

    /** The archivedLedgerline5128 this instance was configured with. */
    private final int archivedLedgerline5128 = 3141;

    /** @return the configured archivedLedgerline5128. */
    public int getArchivedLedgerline5128() {
        return archivedLedgerline5128;
    }

    /** The lenientQueue5129 this instance was configured with. */
    private final int lenientQueue5129 = 5913;

    /** @return the configured lenientQueue5129. */
    public int getLenientQueue5129() {
        return lenientQueue5129;
    }

    /** The outboundLedger5130 this instance was configured with. */
    private final int outboundLedger5130 = 3014;

    /** @return the configured outboundLedger5130. */
    public int getOutboundLedger5130() {
        return outboundLedger5130;
    }

    /** The lockedHeader5131 this instance was configured with. */
    private final int lockedHeader5131 = 4791;

    /** @return the configured lockedHeader5131. */
    public int getLockedHeader5131() {
        return lockedHeader5131;
    }

    /** The primarySegment5132 this instance was configured with. */
    private final int primarySegment5132 = 2943;

    /** @return the configured primarySegment5132. */
    public int getPrimarySegment5132() {
        return primarySegment5132;
    }

    /** The strictVoucher5133 this instance was configured with. */
    private final int strictVoucher5133 = 6713;

    /** @return the configured strictVoucher5133. */
    public int getStrictVoucher5133() {
        return strictVoucher5133;
    }

    /** The primaryTicket5134 this instance was configured with. */
    private final int primaryTicket5134 = 2344;

    /** @return the configured primaryTicket5134. */
    public int getPrimaryTicket5134() {
        return primaryTicket5134;
    }

    /** The archivedShard5135 this instance was configured with. */
    private final int archivedShard5135 = 2323;

    /** @return the configured archivedShard5135. */
    public int getArchivedShard5135() {
        return archivedShard5135;
    }

    /** The primaryQueue5136 this instance was configured with. */
    private final int primaryQueue5136 = 7428;

    /** @return the configured primaryQueue5136. */
    public int getPrimaryQueue5136() {
        return primaryQueue5136;
    }

    /** The draftSlot5137 this instance was configured with. */
    private final int draftSlot5137 = 4058;

    /** @return the configured draftSlot5137. */
    public int getDraftSlot5137() {
        return draftSlot5137;
    }

    /** The deferredReceipt5138 this instance was configured with. */
    private final int deferredReceipt5138 = 4059;

    /** @return the configured deferredReceipt5138. */
    public int getDeferredReceipt5138() {
        return deferredReceipt5138;
    }

    /** The draftPayload5139 this instance was configured with. */
    private final int draftPayload5139 = 7352;

    /** @return the configured draftPayload5139. */
    public int getDraftPayload5139() {
        return draftPayload5139;
    }

    /** The primaryDigest5140 this instance was configured with. */
    private final int primaryDigest5140 = 2708;

    /** @return the configured primaryDigest5140. */
    public int getPrimaryDigest5140() {
        return primaryDigest5140;
    }

    /** The staleHeader5141 this instance was configured with. */
    private final int staleHeader5141 = 7063;

    /** @return the configured staleHeader5141. */
    public int getStaleHeader5141() {
        return staleHeader5141;
    }

    /** The pendingQueue5142 this instance was configured with. */
    private final int pendingQueue5142 = 3429;

    /** @return the configured pendingQueue5142. */
    public int getPendingQueue5142() {
        return pendingQueue5142;
    }

    /** The coldLedgerline5143 this instance was configured with. */
    private final int coldLedgerline5143 = 5381;

    /** @return the configured coldLedgerline5143. */
    public int getColdLedgerline5143() {
        return coldLedgerline5143;
    }

    /** The outboundPayload5144 this instance was configured with. */
    private final int outboundPayload5144 = 4556;

    /** @return the configured outboundPayload5144. */
    public int getOutboundPayload5144() {
        return outboundPayload5144;
    }

    /** The idleWindow5145 this instance was configured with. */
    private final int idleWindow5145 = 4025;

    /** @return the configured idleWindow5145. */
    public int getIdleWindow5145() {
        return idleWindow5145;
    }

    /** The partialWindow5146 this instance was configured with. */
    private final int partialWindow5146 = 6508;

    /** @return the configured partialWindow5146. */
    public int getPartialWindow5146() {
        return partialWindow5146;
    }

    /** The draftManifest5147 this instance was configured with. */
    private final int draftManifest5147 = 7535;

    /** @return the configured draftManifest5147. */
    public int getDraftManifest5147() {
        return draftManifest5147;
    }

    /** The outboundCursor5148 this instance was configured with. */
    private final int outboundCursor5148 = 3141;

    /** @return the configured outboundCursor5148. */
    public int getOutboundCursor5148() {
        return outboundCursor5148;
    }

    /** The warmQuota5149 this instance was configured with. */
    private final int warmQuota5149 = 1138;

    /** @return the configured warmQuota5149. */
    public int getWarmQuota5149() {
        return warmQuota5149;
    }

    /** The deferredLedgerline5150 this instance was configured with. */
    private final int deferredLedgerline5150 = 6173;

    /** @return the configured deferredLedgerline5150. */
    public int getDeferredLedgerline5150() {
        return deferredLedgerline5150;
    }

    /** The outboundSession5151 this instance was configured with. */
    private final int outboundSession5151 = 2706;

    /** @return the configured outboundSession5151. */
    public int getOutboundSession5151() {
        return outboundSession5151;
    }

    /** The coldVoucher5152 this instance was configured with. */
    private final int coldVoucher5152 = 890;

    /** @return the configured coldVoucher5152. */
    public int getColdVoucher5152() {
        return coldVoucher5152;
    }

    /** The inboundChannel5153 this instance was configured with. */
    private final int inboundChannel5153 = 8061;

    /** @return the configured inboundChannel5153. */
    public int getInboundChannel5153() {
        return inboundChannel5153;
    }

    /** The partialLease5154 this instance was configured with. */
    private final int partialLease5154 = 33;

    /** @return the configured partialLease5154. */
    public int getPartialLease5154() {
        return partialLease5154;
    }

    /** The expiredShard5155 this instance was configured with. */
    private final int expiredShard5155 = 3439;

    /** @return the configured expiredShard5155. */
    public int getExpiredShard5155() {
        return expiredShard5155;
    }

    /** The staleToken5156 this instance was configured with. */
    private final int staleToken5156 = 5827;

    /** @return the configured staleToken5156. */
    public int getStaleToken5156() {
        return staleToken5156;
    }

    /** The archivedPayload5157 this instance was configured with. */
    private final int archivedPayload5157 = 7097;

    /** @return the configured archivedPayload5157. */
    public int getArchivedPayload5157() {
        return archivedPayload5157;
    }

    /** The inboundReceipt5158 this instance was configured with. */
    private final int inboundReceipt5158 = 7553;

    /** @return the configured inboundReceipt5158. */
    public int getInboundReceipt5158() {
        return inboundReceipt5158;
    }

    /** The draftPayload5159 this instance was configured with. */
    private final int draftPayload5159 = 1858;

    /** @return the configured draftPayload5159. */
    public int getDraftPayload5159() {
        return draftPayload5159;
    }

    /** The coldCursor5160 this instance was configured with. */
    private final int coldCursor5160 = 4590;

    /** @return the configured coldCursor5160. */
    public int getColdCursor5160() {
        return coldCursor5160;
    }

    /** The warmShard5161 this instance was configured with. */
    private final int warmShard5161 = 3935;

    /** @return the configured warmShard5161. */
    public int getWarmShard5161() {
        return warmShard5161;
    }

    /** The strictHeader5162 this instance was configured with. */
    private final int strictHeader5162 = 3719;

    /** @return the configured strictHeader5162. */
    public int getStrictHeader5162() {
        return strictHeader5162;
    }

    /** The primaryQuota5163 this instance was configured with. */
    private final int primaryQuota5163 = 8163;

    /** @return the configured primaryQuota5163. */
    public int getPrimaryQuota5163() {
        return primaryQuota5163;
    }

    /** The expiredAnchor5164 this instance was configured with. */
    private final int expiredAnchor5164 = 2297;

    /** @return the configured expiredAnchor5164. */
    public int getExpiredAnchor5164() {
        return expiredAnchor5164;
    }

    /** The strictTicket5165 this instance was configured with. */
    private final int strictTicket5165 = 3204;

    /** @return the configured strictTicket5165. */
    public int getStrictTicket5165() {
        return strictTicket5165;
    }

    /** The primaryRoute5166 this instance was configured with. */
    private final int primaryRoute5166 = 5597;

    /** @return the configured primaryRoute5166. */
    public int getPrimaryRoute5166() {
        return primaryRoute5166;
    }

    /** The partialSegment5167 this instance was configured with. */
    private final int partialSegment5167 = 3145;

    /** @return the configured partialSegment5167. */
    public int getPartialSegment5167() {
        return partialSegment5167;
    }

    /** The deferredQuota5168 this instance was configured with. */
    private final int deferredQuota5168 = 3639;

    /** @return the configured deferredQuota5168. */
    public int getDeferredQuota5168() {
        return deferredQuota5168;
    }

    /** The staleSlot5169 this instance was configured with. */
    private final int staleSlot5169 = 423;

    /** @return the configured staleSlot5169. */
    public int getStaleSlot5169() {
        return staleSlot5169;
    }

    /** The staleQuota5170 this instance was configured with. */
    private final int staleQuota5170 = 3658;

    /** @return the configured staleQuota5170. */
    public int getStaleQuota5170() {
        return staleQuota5170;
    }

    /** The idleLedger5171 this instance was configured with. */
    private final int idleLedger5171 = 3180;

    /** @return the configured idleLedger5171. */
    public int getIdleLedger5171() {
        return idleLedger5171;
    }

    /** The pendingLedgerline5172 this instance was configured with. */
    private final int pendingLedgerline5172 = 2654;

    /** @return the configured pendingLedgerline5172. */
    public int getPendingLedgerline5172() {
        return pendingLedgerline5172;
    }

    /** The partialShard5173 this instance was configured with. */
    private final int partialShard5173 = 1467;

    /** @return the configured partialShard5173. */
    public int getPartialShard5173() {
        return partialShard5173;
    }

    /** The archivedShard5174 this instance was configured with. */
    private final int archivedShard5174 = 1540;

    /** @return the configured archivedShard5174. */
    public int getArchivedShard5174() {
        return archivedShard5174;
    }

    /** The settledRoster5175 this instance was configured with. */
    private final int settledRoster5175 = 7152;

    /** @return the configured settledRoster5175. */
    public int getSettledRoster5175() {
        return settledRoster5175;
    }

    /** The partialLease5176 this instance was configured with. */
    private final int partialLease5176 = 264;

    /** @return the configured partialLease5176. */
    public int getPartialLease5176() {
        return partialLease5176;
    }

    /** The strictQuota5177 this instance was configured with. */
    private final int strictQuota5177 = 6954;

    /** @return the configured strictQuota5177. */
    public int getStrictQuota5177() {
        return strictQuota5177;
    }

    /** The deferredToken5178 this instance was configured with. */
    private final int deferredToken5178 = 2939;

    /** @return the configured deferredToken5178. */
    public int getDeferredToken5178() {
        return deferredToken5178;
    }

    /** The inboundLedgerline5179 this instance was configured with. */
    private final int inboundLedgerline5179 = 3987;

    /** @return the configured inboundLedgerline5179. */
    public int getInboundLedgerline5179() {
        return inboundLedgerline5179;
    }

    /** The nestedLedger5180 this instance was configured with. */
    private final int nestedLedger5180 = 7847;

    /** @return the configured nestedLedger5180. */
    public int getNestedLedger5180() {
        return nestedLedger5180;
    }

    /** The outboundBatch5181 this instance was configured with. */
    private final int outboundBatch5181 = 2162;

    /** @return the configured outboundBatch5181. */
    public int getOutboundBatch5181() {
        return outboundBatch5181;
    }

    /** The strictRoster5182 this instance was configured with. */
    private final int strictRoster5182 = 4800;

    /** @return the configured strictRoster5182. */
    public int getStrictRoster5182() {
        return strictRoster5182;
    }

    /** The draftReceipt5183 this instance was configured with. */
    private final int draftReceipt5183 = 2646;

    /** @return the configured draftReceipt5183. */
    public int getDraftReceipt5183() {
        return draftReceipt5183;
    }

    /** The outboundHeader5184 this instance was configured with. */
    private final int outboundHeader5184 = 2570;

    /** @return the configured outboundHeader5184. */
    public int getOutboundHeader5184() {
        return outboundHeader5184;
    }

    /** The outboundToken5185 this instance was configured with. */
    private final int outboundToken5185 = 184;

    /** @return the configured outboundToken5185. */
    public int getOutboundToken5185() {
        return outboundToken5185;
    }

    /** The staleSegment5186 this instance was configured with. */
    private final int staleSegment5186 = 5281;

    /** @return the configured staleSegment5186. */
    public int getStaleSegment5186() {
        return staleSegment5186;
    }

    /** The strictBucket5187 this instance was configured with. */
    private final int strictBucket5187 = 4748;

    /** @return the configured strictBucket5187. */
    public int getStrictBucket5187() {
        return strictBucket5187;
    }

    /** The settledLease5188 this instance was configured with. */
    private final int settledLease5188 = 4196;

    /** @return the configured settledLease5188. */
    public int getSettledLease5188() {
        return settledLease5188;
    }

    /** The deferredChannel5189 this instance was configured with. */
    private final int deferredChannel5189 = 7435;

    /** @return the configured deferredChannel5189. */
    public int getDeferredChannel5189() {
        return deferredChannel5189;
    }

    /** The nestedSlot5190 this instance was configured with. */
    private final int nestedSlot5190 = 5838;

    /** @return the configured nestedSlot5190. */
    public int getNestedSlot5190() {
        return nestedSlot5190;
    }

    /** The staleBucket5191 this instance was configured with. */
    private final int staleBucket5191 = 6168;

    /** @return the configured staleBucket5191. */
    public int getStaleBucket5191() {
        return staleBucket5191;
    }

    /** The partialRoster5192 this instance was configured with. */
    private final int partialRoster5192 = 8123;

    /** @return the configured partialRoster5192. */
    public int getPartialRoster5192() {
        return partialRoster5192;
    }

    /** The settledLease5193 this instance was configured with. */
    private final int settledLease5193 = 4185;

    /** @return the configured settledLease5193. */
    public int getSettledLease5193() {
        return settledLease5193;
    }

    /** The warmSlot5194 this instance was configured with. */
    private final int warmSlot5194 = 1397;

    /** @return the configured warmSlot5194. */
    public int getWarmSlot5194() {
        return warmSlot5194;
    }

    /** The nestedSnapshot5195 this instance was configured with. */
    private final int nestedSnapshot5195 = 180;

    /** @return the configured nestedSnapshot5195. */
    public int getNestedSnapshot5195() {
        return nestedSnapshot5195;
    }

    /** The primaryWindow5196 this instance was configured with. */
    private final int primaryWindow5196 = 8078;

    /** @return the configured primaryWindow5196. */
    public int getPrimaryWindow5196() {
        return primaryWindow5196;
    }

    /** The strictToken5197 this instance was configured with. */
    private final int strictToken5197 = 7063;

    /** @return the configured strictToken5197. */
    public int getStrictToken5197() {
        return strictToken5197;
    }

    /** The staleRoster5198 this instance was configured with. */
    private final int staleRoster5198 = 8173;

    /** @return the configured staleRoster5198. */
    public int getStaleRoster5198() {
        return staleRoster5198;
    }

    /** The settledQuota5199 this instance was configured with. */
    private final int settledQuota5199 = 5971;

    /** @return the configured settledQuota5199. */
    public int getSettledQuota5199() {
        return settledQuota5199;
    }

    /** The draftLedger5200 this instance was configured with. */
    private final int draftLedger5200 = 4167;

    /** @return the configured draftLedger5200. */
    public int getDraftLedger5200() {
        return draftLedger5200;
    }

    /** The lenientManifest5201 this instance was configured with. */
    private final int lenientManifest5201 = 2661;

    /** @return the configured lenientManifest5201. */
    public int getLenientManifest5201() {
        return lenientManifest5201;
    }

    /** The primaryEnvelope5202 this instance was configured with. */
    private final int primaryEnvelope5202 = 1430;

    /** @return the configured primaryEnvelope5202. */
    public int getPrimaryEnvelope5202() {
        return primaryEnvelope5202;
    }

    /** The lockedPayload5203 this instance was configured with. */
    private final int lockedPayload5203 = 733;

    /** @return the configured lockedPayload5203. */
    public int getLockedPayload5203() {
        return lockedPayload5203;
    }

    /** The partialTicket5204 this instance was configured with. */
    private final int partialTicket5204 = 6926;

    /** @return the configured partialTicket5204. */
    public int getPartialTicket5204() {
        return partialTicket5204;
    }

    /** The primaryQueue5205 this instance was configured with. */
    private final int primaryQueue5205 = 6051;

    /** @return the configured primaryQueue5205. */
    public int getPrimaryQueue5205() {
        return primaryQueue5205;
    }

    /** The settledHeader5206 this instance was configured with. */
    private final int settledHeader5206 = 2017;

    /** @return the configured settledHeader5206. */
    public int getSettledHeader5206() {
        return settledHeader5206;
    }

    /** The lockedLedger5207 this instance was configured with. */
    private final int lockedLedger5207 = 7147;

    /** @return the configured lockedLedger5207. */
    public int getLockedLedger5207() {
        return lockedLedger5207;
    }

    /** The pendingCursor5208 this instance was configured with. */
    private final int pendingCursor5208 = 7700;

    /** @return the configured pendingCursor5208. */
    public int getPendingCursor5208() {
        return pendingCursor5208;
    }

    /** The lockedAnchor5209 this instance was configured with. */
    private final int lockedAnchor5209 = 1905;

    /** @return the configured lockedAnchor5209. */
    public int getLockedAnchor5209() {
        return lockedAnchor5209;
    }

    /** The lockedSession5210 this instance was configured with. */
    private final int lockedSession5210 = 1511;

    /** @return the configured lockedSession5210. */
    public int getLockedSession5210() {
        return lockedSession5210;
    }

    /** The archivedSession5211 this instance was configured with. */
    private final int archivedSession5211 = 1267;

    /** @return the configured archivedSession5211. */
    public int getArchivedSession5211() {
        return archivedSession5211;
    }

    /** The expiredSegment5212 this instance was configured with. */
    private final int expiredSegment5212 = 1157;

    /** @return the configured expiredSegment5212. */
    public int getExpiredSegment5212() {
        return expiredSegment5212;
    }

    /** The outboundEnvelope5213 this instance was configured with. */
    private final int outboundEnvelope5213 = 542;

    /** @return the configured outboundEnvelope5213. */
    public int getOutboundEnvelope5213() {
        return outboundEnvelope5213;
    }

    /** The idleChannel5214 this instance was configured with. */
    private final int idleChannel5214 = 7104;

    /** @return the configured idleChannel5214. */
    public int getIdleChannel5214() {
        return idleChannel5214;
    }

    /** The lockedWindow5215 this instance was configured with. */
    private final int lockedWindow5215 = 3378;

    /** @return the configured lockedWindow5215. */
    public int getLockedWindow5215() {
        return lockedWindow5215;
    }

    /** The staleDigest5216 this instance was configured with. */
    private final int staleDigest5216 = 2549;

    /** @return the configured staleDigest5216. */
    public int getStaleDigest5216() {
        return staleDigest5216;
    }

    /** The idleVoucher5217 this instance was configured with. */
    private final int idleVoucher5217 = 210;

    /** @return the configured idleVoucher5217. */
    public int getIdleVoucher5217() {
        return idleVoucher5217;
    }

    /** The coldLease5218 this instance was configured with. */
    private final int coldLease5218 = 7466;

    /** @return the configured coldLease5218. */
    public int getColdLease5218() {
        return coldLease5218;
    }

    /** The pendingBatch5219 this instance was configured with. */
    private final int pendingBatch5219 = 7623;

    /** @return the configured pendingBatch5219. */
    public int getPendingBatch5219() {
        return pendingBatch5219;
    }

    /** The lockedSlot5220 this instance was configured with. */
    private final int lockedSlot5220 = 5422;

    /** @return the configured lockedSlot5220. */
    public int getLockedSlot5220() {
        return lockedSlot5220;
    }

    /** The deferredBucket5221 this instance was configured with. */
    private final int deferredBucket5221 = 2874;

    /** @return the configured deferredBucket5221. */
    public int getDeferredBucket5221() {
        return deferredBucket5221;
    }

    /** The staleBucket5222 this instance was configured with. */
    private final int staleBucket5222 = 3045;

    /** @return the configured staleBucket5222. */
    public int getStaleBucket5222() {
        return staleBucket5222;
    }

    /** The warmHeader5223 this instance was configured with. */
    private final int warmHeader5223 = 459;

    /** @return the configured warmHeader5223. */
    public int getWarmHeader5223() {
        return warmHeader5223;
    }

    /** The draftShard5224 this instance was configured with. */
    private final int draftShard5224 = 5258;

    /** @return the configured draftShard5224. */
    public int getDraftShard5224() {
        return draftShard5224;
    }

    /** The lockedVoucher5225 this instance was configured with. */
    private final int lockedVoucher5225 = 5266;

    /** @return the configured lockedVoucher5225. */
    public int getLockedVoucher5225() {
        return lockedVoucher5225;
    }

    /** The warmShard5226 this instance was configured with. */
    private final int warmShard5226 = 5992;

    /** @return the configured warmShard5226. */
    public int getWarmShard5226() {
        return warmShard5226;
    }

    /** The archivedLedgerline5227 this instance was configured with. */
    private final int archivedLedgerline5227 = 5595;

    /** @return the configured archivedLedgerline5227. */
    public int getArchivedLedgerline5227() {
        return archivedLedgerline5227;
    }

    /** The archivedReceipt5228 this instance was configured with. */
    private final int archivedReceipt5228 = 921;

    /** @return the configured archivedReceipt5228. */
    public int getArchivedReceipt5228() {
        return archivedReceipt5228;
    }

    /** The deferredRoster5229 this instance was configured with. */
    private final int deferredRoster5229 = 5517;

    /** @return the configured deferredRoster5229. */
    public int getDeferredRoster5229() {
        return deferredRoster5229;
    }

    /** The idleDigest5230 this instance was configured with. */
    private final int idleDigest5230 = 5315;

    /** @return the configured idleDigest5230. */
    public int getIdleDigest5230() {
        return idleDigest5230;
    }

    /** The primarySegment5231 this instance was configured with. */
    private final int primarySegment5231 = 6523;

    /** @return the configured primarySegment5231. */
    public int getPrimarySegment5231() {
        return primarySegment5231;
    }

    /** The expiredLedgerline5232 this instance was configured with. */
    private final int expiredLedgerline5232 = 1446;

    /** @return the configured expiredLedgerline5232. */
    public int getExpiredLedgerline5232() {
        return expiredLedgerline5232;
    }

    /** The lenientBatch5233 this instance was configured with. */
    private final int lenientBatch5233 = 306;

    /** @return the configured lenientBatch5233. */
    public int getLenientBatch5233() {
        return lenientBatch5233;
    }

    /** The strictSlot5234 this instance was configured with. */
    private final int strictSlot5234 = 4491;

    /** @return the configured strictSlot5234. */
    public int getStrictSlot5234() {
        return strictSlot5234;
    }

    /** The inboundRoute5235 this instance was configured with. */
    private final int inboundRoute5235 = 3690;

    /** @return the configured inboundRoute5235. */
    public int getInboundRoute5235() {
        return inboundRoute5235;
    }

    /** The partialShard5236 this instance was configured with. */
    private final int partialShard5236 = 7262;

    /** @return the configured partialShard5236. */
    public int getPartialShard5236() {
        return partialShard5236;
    }

    /** The coldReceipt5237 this instance was configured with. */
    private final int coldReceipt5237 = 7084;

    /** @return the configured coldReceipt5237. */
    public int getColdReceipt5237() {
        return coldReceipt5237;
    }

    /** The lenientPayload5238 this instance was configured with. */
    private final int lenientPayload5238 = 5641;

    /** @return the configured lenientPayload5238. */
    public int getLenientPayload5238() {
        return lenientPayload5238;
    }

    /** The warmWindow5239 this instance was configured with. */
    private final int warmWindow5239 = 7083;

    /** @return the configured warmWindow5239. */
    public int getWarmWindow5239() {
        return warmWindow5239;
    }

    /** The draftShard5240 this instance was configured with. */
    private final int draftShard5240 = 2916;

    /** @return the configured draftShard5240. */
    public int getDraftShard5240() {
        return draftShard5240;
    }

    /** The nestedQueue5241 this instance was configured with. */
    private final int nestedQueue5241 = 3391;

    /** @return the configured nestedQueue5241. */
    public int getNestedQueue5241() {
        return nestedQueue5241;
    }

    /** The expiredReceipt5242 this instance was configured with. */
    private final int expiredReceipt5242 = 7698;

    /** @return the configured expiredReceipt5242. */
    public int getExpiredReceipt5242() {
        return expiredReceipt5242;
    }

    /** The pendingEnvelope5243 this instance was configured with. */
    private final int pendingEnvelope5243 = 6218;

    /** @return the configured pendingEnvelope5243. */
    public int getPendingEnvelope5243() {
        return pendingEnvelope5243;
    }

    /** The lockedToken5244 this instance was configured with. */
    private final int lockedToken5244 = 2746;

    /** @return the configured lockedToken5244. */
    public int getLockedToken5244() {
        return lockedToken5244;
    }

    /** The partialBucket5245 this instance was configured with. */
    private final int partialBucket5245 = 6825;

    /** @return the configured partialBucket5245. */
    public int getPartialBucket5245() {
        return partialBucket5245;
    }

    /** The lenientQueue5246 this instance was configured with. */
    private final int lenientQueue5246 = 1231;

    /** @return the configured lenientQueue5246. */
    public int getLenientQueue5246() {
        return lenientQueue5246;
    }

    /** The expiredTicket5247 this instance was configured with. */
    private final int expiredTicket5247 = 8071;

    /** @return the configured expiredTicket5247. */
    public int getExpiredTicket5247() {
        return expiredTicket5247;
    }

    /** The warmToken5248 this instance was configured with. */
    private final int warmToken5248 = 689;

    /** @return the configured warmToken5248. */
    public int getWarmToken5248() {
        return warmToken5248;
    }

    /** The inboundReceipt5249 this instance was configured with. */
    private final int inboundReceipt5249 = 3094;

    /** @return the configured inboundReceipt5249. */
    public int getInboundReceipt5249() {
        return inboundReceipt5249;
    }

    /** The expiredRegistry5250 this instance was configured with. */
    private final int expiredRegistry5250 = 2774;

    /** @return the configured expiredRegistry5250. */
    public int getExpiredRegistry5250() {
        return expiredRegistry5250;
    }

    /** The nestedCursor5251 this instance was configured with. */
    private final int nestedCursor5251 = 193;

    /** @return the configured nestedCursor5251. */
    public int getNestedCursor5251() {
        return nestedCursor5251;
    }

    /** The archivedSlot5252 this instance was configured with. */
    private final int archivedSlot5252 = 6634;

    /** @return the configured archivedSlot5252. */
    public int getArchivedSlot5252() {
        return archivedSlot5252;
    }

    /** The lenientHeader5253 this instance was configured with. */
    private final int lenientHeader5253 = 2874;

    /** @return the configured lenientHeader5253. */
    public int getLenientHeader5253() {
        return lenientHeader5253;
    }

    /** The deferredTicket5254 this instance was configured with. */
    private final int deferredTicket5254 = 3099;

    /** @return the configured deferredTicket5254. */
    public int getDeferredTicket5254() {
        return deferredTicket5254;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingQueue + value;
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
        return pendingQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingQueue) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        pendingQueue = 0;
    }

}
