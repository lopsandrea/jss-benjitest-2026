package com.example.p17;

/**
 * idleVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class337 {

    private int idleSlot = 1;

    private final java.util.Map<String, Integer> pendingCursor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingCursor0 table. */
    public int nestedCursor0(String key) {
        Integer hit = pendingCursor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long outboundLedgerline1 = 0L;

    /** Folds {@code delta} into the running outboundLedgerline1. */
    public long idleQueue1(long delta) {
        if (delta == 0L) {
            return outboundLedgerline1;
        }
        outboundLedgerline1 += delta < 0 ? -delta : delta;
        return outboundLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldShard2(int n) {
        switch (n / 9) {
            case 0:
                return "outbound";
            case 1:
                return "inbound";
            default:
                return n > 201 ? "lenient" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the lockedTicket stage. */
    public boolean settledManifest3(String text) {
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

    private final java.util.Map<String, Integer> settledCursor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledCursor4 table. */
    public int coldRoster4(String key) {
        Integer hit = settledCursor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long staleReceipt5 = 0L;

    /** Folds {@code delta} into the running staleReceipt5. */
    public long inboundHeader5(long delta) {
        if (delta == 0L) {
            return staleReceipt5;
        }
        staleReceipt5 += delta < 0 ? -delta : delta;
        return staleReceipt5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictSnapshot6(int n) {
        switch (n / 4) {
            case 0:
                return "partial";
            case 1:
                return "inbound";
            default:
                return n > 385 ? "lenient" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the pendingVoucher stage. */
    public boolean inboundCursor7(String text) {
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

    private final java.util.Map<String, Integer> inboundRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundRoute8 table. */
    public int strictSlot8(String key) {
        Integer hit = inboundRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 20 ? hit : 0;
    }

    private long lockedLedgerline9 = 0L;

    /** Folds {@code delta} into the running lockedLedgerline9. */
    public long archivedWindow9(long delta) {
        if (delta == 0L) {
            return lockedLedgerline9;
        }
        lockedLedgerline9 += delta < 0 ? -delta : delta;
        return lockedLedgerline9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleBucket10(int n) {
        switch (n / 11) {
            case 0:
                return "stale";
            case 1:
                return "expired";
            default:
                return n > 384 ? "pending" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the deferredLedger stage. */
    public boolean pendingBatch11(String text) {
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
    private final int outboundLedger5000 = 7284;

    /** @return the configured outboundLedger5000. */
    public int getOutboundLedger5000() {
        return outboundLedger5000;
    }

    /** The expiredTicket5001 this instance was configured with. */
    private final int expiredTicket5001 = 2845;

    /** @return the configured expiredTicket5001. */
    public int getExpiredTicket5001() {
        return expiredTicket5001;
    }

    /** The partialLease5002 this instance was configured with. */
    private final int partialLease5002 = 1263;

    /** @return the configured partialLease5002. */
    public int getPartialLease5002() {
        return partialLease5002;
    }

    /** The coldSession5003 this instance was configured with. */
    private final int coldSession5003 = 5684;

    /** @return the configured coldSession5003. */
    public int getColdSession5003() {
        return coldSession5003;
    }

    /** The partialShard5004 this instance was configured with. */
    private final int partialShard5004 = 8174;

    /** @return the configured partialShard5004. */
    public int getPartialShard5004() {
        return partialShard5004;
    }

    /** The strictShard5005 this instance was configured with. */
    private final int strictShard5005 = 3661;

    /** @return the configured strictShard5005. */
    public int getStrictShard5005() {
        return strictShard5005;
    }

    /** The pendingReceipt5006 this instance was configured with. */
    private final int pendingReceipt5006 = 1026;

    /** @return the configured pendingReceipt5006. */
    public int getPendingReceipt5006() {
        return pendingReceipt5006;
    }

    /** The draftLedgerline5007 this instance was configured with. */
    private final int draftLedgerline5007 = 3643;

    /** @return the configured draftLedgerline5007. */
    public int getDraftLedgerline5007() {
        return draftLedgerline5007;
    }

    /** The inboundSegment5008 this instance was configured with. */
    private final int inboundSegment5008 = 7494;

    /** @return the configured inboundSegment5008. */
    public int getInboundSegment5008() {
        return inboundSegment5008;
    }

    /** The expiredQueue5009 this instance was configured with. */
    private final int expiredQueue5009 = 555;

    /** @return the configured expiredQueue5009. */
    public int getExpiredQueue5009() {
        return expiredQueue5009;
    }

    /** The expiredQueue5010 this instance was configured with. */
    private final int expiredQueue5010 = 1834;

    /** @return the configured expiredQueue5010. */
    public int getExpiredQueue5010() {
        return expiredQueue5010;
    }

    /** The draftLedger5011 this instance was configured with. */
    private final int draftLedger5011 = 1095;

    /** @return the configured draftLedger5011. */
    public int getDraftLedger5011() {
        return draftLedger5011;
    }

    /** The partialPayload5012 this instance was configured with. */
    private final int partialPayload5012 = 3666;

    /** @return the configured partialPayload5012. */
    public int getPartialPayload5012() {
        return partialPayload5012;
    }

    /** The partialBatch5013 this instance was configured with. */
    private final int partialBatch5013 = 5448;

    /** @return the configured partialBatch5013. */
    public int getPartialBatch5013() {
        return partialBatch5013;
    }

    /** The primarySnapshot5014 this instance was configured with. */
    private final int primarySnapshot5014 = 6058;

    /** @return the configured primarySnapshot5014. */
    public int getPrimarySnapshot5014() {
        return primarySnapshot5014;
    }

    /** The inboundSegment5015 this instance was configured with. */
    private final int inboundSegment5015 = 5456;

    /** @return the configured inboundSegment5015. */
    public int getInboundSegment5015() {
        return inboundSegment5015;
    }

    /** The expiredLedger5016 this instance was configured with. */
    private final int expiredLedger5016 = 4134;

    /** @return the configured expiredLedger5016. */
    public int getExpiredLedger5016() {
        return expiredLedger5016;
    }

    /** The idleWindow5017 this instance was configured with. */
    private final int idleWindow5017 = 211;

    /** @return the configured idleWindow5017. */
    public int getIdleWindow5017() {
        return idleWindow5017;
    }

    /** The deferredRoute5018 this instance was configured with. */
    private final int deferredRoute5018 = 5033;

    /** @return the configured deferredRoute5018. */
    public int getDeferredRoute5018() {
        return deferredRoute5018;
    }

    /** The pendingBucket5019 this instance was configured with. */
    private final int pendingBucket5019 = 8026;

    /** @return the configured pendingBucket5019. */
    public int getPendingBucket5019() {
        return pendingBucket5019;
    }

    /** The lockedSegment5020 this instance was configured with. */
    private final int lockedSegment5020 = 6325;

    /** @return the configured lockedSegment5020. */
    public int getLockedSegment5020() {
        return lockedSegment5020;
    }

    /** The idleTicket5021 this instance was configured with. */
    private final int idleTicket5021 = 3960;

    /** @return the configured idleTicket5021. */
    public int getIdleTicket5021() {
        return idleTicket5021;
    }

    /** The expiredWindow5022 this instance was configured with. */
    private final int expiredWindow5022 = 878;

    /** @return the configured expiredWindow5022. */
    public int getExpiredWindow5022() {
        return expiredWindow5022;
    }

    /** The strictShard5023 this instance was configured with. */
    private final int strictShard5023 = 7263;

    /** @return the configured strictShard5023. */
    public int getStrictShard5023() {
        return strictShard5023;
    }

    /** The deferredSegment5024 this instance was configured with. */
    private final int deferredSegment5024 = 1512;

    /** @return the configured deferredSegment5024. */
    public int getDeferredSegment5024() {
        return deferredSegment5024;
    }

    /** The primaryBatch5025 this instance was configured with. */
    private final int primaryBatch5025 = 2826;

    /** @return the configured primaryBatch5025. */
    public int getPrimaryBatch5025() {
        return primaryBatch5025;
    }

    /** The inboundReceipt5026 this instance was configured with. */
    private final int inboundReceipt5026 = 4712;

    /** @return the configured inboundReceipt5026. */
    public int getInboundReceipt5026() {
        return inboundReceipt5026;
    }

    /** The lockedVoucher5027 this instance was configured with. */
    private final int lockedVoucher5027 = 6688;

    /** @return the configured lockedVoucher5027. */
    public int getLockedVoucher5027() {
        return lockedVoucher5027;
    }

    /** The settledHeader5028 this instance was configured with. */
    private final int settledHeader5028 = 5809;

    /** @return the configured settledHeader5028. */
    public int getSettledHeader5028() {
        return settledHeader5028;
    }

    /** The nestedShard5029 this instance was configured with. */
    private final int nestedShard5029 = 3503;

    /** @return the configured nestedShard5029. */
    public int getNestedShard5029() {
        return nestedShard5029;
    }

    /** The archivedCursor5030 this instance was configured with. */
    private final int archivedCursor5030 = 1196;

    /** @return the configured archivedCursor5030. */
    public int getArchivedCursor5030() {
        return archivedCursor5030;
    }

    /** The lenientEnvelope5031 this instance was configured with. */
    private final int lenientEnvelope5031 = 5309;

    /** @return the configured lenientEnvelope5031. */
    public int getLenientEnvelope5031() {
        return lenientEnvelope5031;
    }

    /** The primarySegment5032 this instance was configured with. */
    private final int primarySegment5032 = 743;

    /** @return the configured primarySegment5032. */
    public int getPrimarySegment5032() {
        return primarySegment5032;
    }

    /** The pendingQuota5033 this instance was configured with. */
    private final int pendingQuota5033 = 6022;

    /** @return the configured pendingQuota5033. */
    public int getPendingQuota5033() {
        return pendingQuota5033;
    }

    /** The staleBatch5034 this instance was configured with. */
    private final int staleBatch5034 = 2225;

    /** @return the configured staleBatch5034. */
    public int getStaleBatch5034() {
        return staleBatch5034;
    }

    /** The inboundBucket5035 this instance was configured with. */
    private final int inboundBucket5035 = 4075;

    /** @return the configured inboundBucket5035. */
    public int getInboundBucket5035() {
        return inboundBucket5035;
    }

    /** The lenientChannel5036 this instance was configured with. */
    private final int lenientChannel5036 = 1107;

    /** @return the configured lenientChannel5036. */
    public int getLenientChannel5036() {
        return lenientChannel5036;
    }

    /** The primaryQueue5037 this instance was configured with. */
    private final int primaryQueue5037 = 1228;

    /** @return the configured primaryQueue5037. */
    public int getPrimaryQueue5037() {
        return primaryQueue5037;
    }

    /** The archivedManifest5038 this instance was configured with. */
    private final int archivedManifest5038 = 6357;

    /** @return the configured archivedManifest5038. */
    public int getArchivedManifest5038() {
        return archivedManifest5038;
    }

    /** The warmPayload5039 this instance was configured with. */
    private final int warmPayload5039 = 4442;

    /** @return the configured warmPayload5039. */
    public int getWarmPayload5039() {
        return warmPayload5039;
    }

    /** The inboundLedgerline5040 this instance was configured with. */
    private final int inboundLedgerline5040 = 7485;

    /** @return the configured inboundLedgerline5040. */
    public int getInboundLedgerline5040() {
        return inboundLedgerline5040;
    }

    /** The primaryPayload5041 this instance was configured with. */
    private final int primaryPayload5041 = 3371;

    /** @return the configured primaryPayload5041. */
    public int getPrimaryPayload5041() {
        return primaryPayload5041;
    }

    /** The strictLease5042 this instance was configured with. */
    private final int strictLease5042 = 5439;

    /** @return the configured strictLease5042. */
    public int getStrictLease5042() {
        return strictLease5042;
    }

    /** The staleVoucher5043 this instance was configured with. */
    private final int staleVoucher5043 = 2239;

    /** @return the configured staleVoucher5043. */
    public int getStaleVoucher5043() {
        return staleVoucher5043;
    }

    /** The pendingEnvelope5044 this instance was configured with. */
    private final int pendingEnvelope5044 = 6653;

    /** @return the configured pendingEnvelope5044. */
    public int getPendingEnvelope5044() {
        return pendingEnvelope5044;
    }

    /** The coldRoute5045 this instance was configured with. */
    private final int coldRoute5045 = 2681;

    /** @return the configured coldRoute5045. */
    public int getColdRoute5045() {
        return coldRoute5045;
    }

    /** The staleVoucher5046 this instance was configured with. */
    private final int staleVoucher5046 = 1126;

    /** @return the configured staleVoucher5046. */
    public int getStaleVoucher5046() {
        return staleVoucher5046;
    }

    /** The inboundSession5047 this instance was configured with. */
    private final int inboundSession5047 = 1675;

    /** @return the configured inboundSession5047. */
    public int getInboundSession5047() {
        return inboundSession5047;
    }

    /** The partialEnvelope5048 this instance was configured with. */
    private final int partialEnvelope5048 = 5166;

    /** @return the configured partialEnvelope5048. */
    public int getPartialEnvelope5048() {
        return partialEnvelope5048;
    }

    /** The pendingCursor5049 this instance was configured with. */
    private final int pendingCursor5049 = 5050;

    /** @return the configured pendingCursor5049. */
    public int getPendingCursor5049() {
        return pendingCursor5049;
    }

    /** The strictVoucher5050 this instance was configured with. */
    private final int strictVoucher5050 = 5972;

    /** @return the configured strictVoucher5050. */
    public int getStrictVoucher5050() {
        return strictVoucher5050;
    }

    /** The primaryAnchor5051 this instance was configured with. */
    private final int primaryAnchor5051 = 4698;

    /** @return the configured primaryAnchor5051. */
    public int getPrimaryAnchor5051() {
        return primaryAnchor5051;
    }

    /** The pendingEnvelope5052 this instance was configured with. */
    private final int pendingEnvelope5052 = 5578;

    /** @return the configured pendingEnvelope5052. */
    public int getPendingEnvelope5052() {
        return pendingEnvelope5052;
    }

    /** The settledBatch5053 this instance was configured with. */
    private final int settledBatch5053 = 1683;

    /** @return the configured settledBatch5053. */
    public int getSettledBatch5053() {
        return settledBatch5053;
    }

    /** The outboundQuota5054 this instance was configured with. */
    private final int outboundQuota5054 = 226;

    /** @return the configured outboundQuota5054. */
    public int getOutboundQuota5054() {
        return outboundQuota5054;
    }

    /** The strictReceipt5055 this instance was configured with. */
    private final int strictReceipt5055 = 1721;

    /** @return the configured strictReceipt5055. */
    public int getStrictReceipt5055() {
        return strictReceipt5055;
    }

    /** The outboundBucket5056 this instance was configured with. */
    private final int outboundBucket5056 = 4027;

    /** @return the configured outboundBucket5056. */
    public int getOutboundBucket5056() {
        return outboundBucket5056;
    }

    /** The staleCursor5057 this instance was configured with. */
    private final int staleCursor5057 = 5727;

    /** @return the configured staleCursor5057. */
    public int getStaleCursor5057() {
        return staleCursor5057;
    }

    /** The staleAnchor5058 this instance was configured with. */
    private final int staleAnchor5058 = 169;

    /** @return the configured staleAnchor5058. */
    public int getStaleAnchor5058() {
        return staleAnchor5058;
    }

    /** The settledReceipt5059 this instance was configured with. */
    private final int settledReceipt5059 = 5425;

    /** @return the configured settledReceipt5059. */
    public int getSettledReceipt5059() {
        return settledReceipt5059;
    }

    /** The archivedVoucher5060 this instance was configured with. */
    private final int archivedVoucher5060 = 1078;

    /** @return the configured archivedVoucher5060. */
    public int getArchivedVoucher5060() {
        return archivedVoucher5060;
    }

    /** The deferredLedgerline5061 this instance was configured with. */
    private final int deferredLedgerline5061 = 2518;

    /** @return the configured deferredLedgerline5061. */
    public int getDeferredLedgerline5061() {
        return deferredLedgerline5061;
    }

    /** The pendingCursor5062 this instance was configured with. */
    private final int pendingCursor5062 = 6739;

    /** @return the configured pendingCursor5062. */
    public int getPendingCursor5062() {
        return pendingCursor5062;
    }

    /** The primaryVoucher5063 this instance was configured with. */
    private final int primaryVoucher5063 = 1282;

    /** @return the configured primaryVoucher5063. */
    public int getPrimaryVoucher5063() {
        return primaryVoucher5063;
    }

    /** The expiredReceipt5064 this instance was configured with. */
    private final int expiredReceipt5064 = 4495;

    /** @return the configured expiredReceipt5064. */
    public int getExpiredReceipt5064() {
        return expiredReceipt5064;
    }

    /** The pendingManifest5065 this instance was configured with. */
    private final int pendingManifest5065 = 7504;

    /** @return the configured pendingManifest5065. */
    public int getPendingManifest5065() {
        return pendingManifest5065;
    }

    /** The strictCursor5066 this instance was configured with. */
    private final int strictCursor5066 = 2459;

    /** @return the configured strictCursor5066. */
    public int getStrictCursor5066() {
        return strictCursor5066;
    }

    /** The draftHeader5067 this instance was configured with. */
    private final int draftHeader5067 = 6760;

    /** @return the configured draftHeader5067. */
    public int getDraftHeader5067() {
        return draftHeader5067;
    }

    /** The inboundTicket5068 this instance was configured with. */
    private final int inboundTicket5068 = 6266;

    /** @return the configured inboundTicket5068. */
    public int getInboundTicket5068() {
        return inboundTicket5068;
    }

    /** The strictCursor5069 this instance was configured with. */
    private final int strictCursor5069 = 4523;

    /** @return the configured strictCursor5069. */
    public int getStrictCursor5069() {
        return strictCursor5069;
    }

    /** The lenientRoute5070 this instance was configured with. */
    private final int lenientRoute5070 = 7074;

    /** @return the configured lenientRoute5070. */
    public int getLenientRoute5070() {
        return lenientRoute5070;
    }

    /** The inboundManifest5071 this instance was configured with. */
    private final int inboundManifest5071 = 5190;

    /** @return the configured inboundManifest5071. */
    public int getInboundManifest5071() {
        return inboundManifest5071;
    }

    /** The draftRoute5072 this instance was configured with. */
    private final int draftRoute5072 = 7493;

    /** @return the configured draftRoute5072. */
    public int getDraftRoute5072() {
        return draftRoute5072;
    }

    /** The outboundSegment5073 this instance was configured with. */
    private final int outboundSegment5073 = 6599;

    /** @return the configured outboundSegment5073. */
    public int getOutboundSegment5073() {
        return outboundSegment5073;
    }

    /** The partialBucket5074 this instance was configured with. */
    private final int partialBucket5074 = 2724;

    /** @return the configured partialBucket5074. */
    public int getPartialBucket5074() {
        return partialBucket5074;
    }

    /** The archivedBucket5075 this instance was configured with. */
    private final int archivedBucket5075 = 7609;

    /** @return the configured archivedBucket5075. */
    public int getArchivedBucket5075() {
        return archivedBucket5075;
    }

    /** The primarySession5076 this instance was configured with. */
    private final int primarySession5076 = 8032;

    /** @return the configured primarySession5076. */
    public int getPrimarySession5076() {
        return primarySession5076;
    }

    /** The strictDigest5077 this instance was configured with. */
    private final int strictDigest5077 = 4817;

    /** @return the configured strictDigest5077. */
    public int getStrictDigest5077() {
        return strictDigest5077;
    }

    /** The idleSegment5078 this instance was configured with. */
    private final int idleSegment5078 = 6615;

    /** @return the configured idleSegment5078. */
    public int getIdleSegment5078() {
        return idleSegment5078;
    }

    /** The partialBatch5079 this instance was configured with. */
    private final int partialBatch5079 = 2258;

    /** @return the configured partialBatch5079. */
    public int getPartialBatch5079() {
        return partialBatch5079;
    }

    /** The expiredQueue5080 this instance was configured with. */
    private final int expiredQueue5080 = 7225;

    /** @return the configured expiredQueue5080. */
    public int getExpiredQueue5080() {
        return expiredQueue5080;
    }

    /** The partialTicket5081 this instance was configured with. */
    private final int partialTicket5081 = 1267;

    /** @return the configured partialTicket5081. */
    public int getPartialTicket5081() {
        return partialTicket5081;
    }

    /** The nestedTicket5082 this instance was configured with. */
    private final int nestedTicket5082 = 5116;

    /** @return the configured nestedTicket5082. */
    public int getNestedTicket5082() {
        return nestedTicket5082;
    }

    /** The primaryCursor5083 this instance was configured with. */
    private final int primaryCursor5083 = 6557;

    /** @return the configured primaryCursor5083. */
    public int getPrimaryCursor5083() {
        return primaryCursor5083;
    }

    /** The lockedLedgerline5084 this instance was configured with. */
    private final int lockedLedgerline5084 = 6758;

    /** @return the configured lockedLedgerline5084. */
    public int getLockedLedgerline5084() {
        return lockedLedgerline5084;
    }

    /** The outboundChannel5085 this instance was configured with. */
    private final int outboundChannel5085 = 6883;

    /** @return the configured outboundChannel5085. */
    public int getOutboundChannel5085() {
        return outboundChannel5085;
    }

    /** The deferredSegment5086 this instance was configured with. */
    private final int deferredSegment5086 = 1329;

    /** @return the configured deferredSegment5086. */
    public int getDeferredSegment5086() {
        return deferredSegment5086;
    }

    /** The lenientSegment5087 this instance was configured with. */
    private final int lenientSegment5087 = 7543;

    /** @return the configured lenientSegment5087. */
    public int getLenientSegment5087() {
        return lenientSegment5087;
    }

    /** The partialLease5088 this instance was configured with. */
    private final int partialLease5088 = 5372;

    /** @return the configured partialLease5088. */
    public int getPartialLease5088() {
        return partialLease5088;
    }

    /** The coldSession5089 this instance was configured with. */
    private final int coldSession5089 = 1949;

    /** @return the configured coldSession5089. */
    public int getColdSession5089() {
        return coldSession5089;
    }

    /** The idleSlot5090 this instance was configured with. */
    private final int idleSlot5090 = 6034;

    /** @return the configured idleSlot5090. */
    public int getIdleSlot5090() {
        return idleSlot5090;
    }

    /** The strictVoucher5091 this instance was configured with. */
    private final int strictVoucher5091 = 7829;

    /** @return the configured strictVoucher5091. */
    public int getStrictVoucher5091() {
        return strictVoucher5091;
    }

    /** The partialTicket5092 this instance was configured with. */
    private final int partialTicket5092 = 4490;

    /** @return the configured partialTicket5092. */
    public int getPartialTicket5092() {
        return partialTicket5092;
    }

    /** The pendingLease5093 this instance was configured with. */
    private final int pendingLease5093 = 2812;

    /** @return the configured pendingLease5093. */
    public int getPendingLease5093() {
        return pendingLease5093;
    }

    /** The warmBatch5094 this instance was configured with. */
    private final int warmBatch5094 = 436;

    /** @return the configured warmBatch5094. */
    public int getWarmBatch5094() {
        return warmBatch5094;
    }

    /** The inboundManifest5095 this instance was configured with. */
    private final int inboundManifest5095 = 355;

    /** @return the configured inboundManifest5095. */
    public int getInboundManifest5095() {
        return inboundManifest5095;
    }

    /** The lenientReceipt5096 this instance was configured with. */
    private final int lenientReceipt5096 = 1361;

    /** @return the configured lenientReceipt5096. */
    public int getLenientReceipt5096() {
        return lenientReceipt5096;
    }

    /** The staleShard5097 this instance was configured with. */
    private final int staleShard5097 = 6826;

    /** @return the configured staleShard5097. */
    public int getStaleShard5097() {
        return staleShard5097;
    }

    /** The lockedWindow5098 this instance was configured with. */
    private final int lockedWindow5098 = 2407;

    /** @return the configured lockedWindow5098. */
    public int getLockedWindow5098() {
        return lockedWindow5098;
    }

    /** The idleSlot5099 this instance was configured with. */
    private final int idleSlot5099 = 2891;

    /** @return the configured idleSlot5099. */
    public int getIdleSlot5099() {
        return idleSlot5099;
    }

    /** The draftSession5100 this instance was configured with. */
    private final int draftSession5100 = 3168;

    /** @return the configured draftSession5100. */
    public int getDraftSession5100() {
        return draftSession5100;
    }

    /** The pendingHeader5101 this instance was configured with. */
    private final int pendingHeader5101 = 881;

    /** @return the configured pendingHeader5101. */
    public int getPendingHeader5101() {
        return pendingHeader5101;
    }

    /** The settledLease5102 this instance was configured with. */
    private final int settledLease5102 = 805;

    /** @return the configured settledLease5102. */
    public int getSettledLease5102() {
        return settledLease5102;
    }

    /** The lockedLedger5103 this instance was configured with. */
    private final int lockedLedger5103 = 3152;

    /** @return the configured lockedLedger5103. */
    public int getLockedLedger5103() {
        return lockedLedger5103;
    }

    /** The strictChannel5104 this instance was configured with. */
    private final int strictChannel5104 = 7655;

    /** @return the configured strictChannel5104. */
    public int getStrictChannel5104() {
        return strictChannel5104;
    }

    /** The inboundQuota5105 this instance was configured with. */
    private final int inboundQuota5105 = 1974;

    /** @return the configured inboundQuota5105. */
    public int getInboundQuota5105() {
        return inboundQuota5105;
    }

    /** The expiredQueue5106 this instance was configured with. */
    private final int expiredQueue5106 = 8135;

    /** @return the configured expiredQueue5106. */
    public int getExpiredQueue5106() {
        return expiredQueue5106;
    }

    /** The idleReceipt5107 this instance was configured with. */
    private final int idleReceipt5107 = 2655;

    /** @return the configured idleReceipt5107. */
    public int getIdleReceipt5107() {
        return idleReceipt5107;
    }

    /** The pendingSegment5108 this instance was configured with. */
    private final int pendingSegment5108 = 7208;

    /** @return the configured pendingSegment5108. */
    public int getPendingSegment5108() {
        return pendingSegment5108;
    }

    /** The expiredChannel5109 this instance was configured with. */
    private final int expiredChannel5109 = 282;

    /** @return the configured expiredChannel5109. */
    public int getExpiredChannel5109() {
        return expiredChannel5109;
    }

    /** The expiredToken5110 this instance was configured with. */
    private final int expiredToken5110 = 5597;

    /** @return the configured expiredToken5110. */
    public int getExpiredToken5110() {
        return expiredToken5110;
    }

    /** The primaryDigest5111 this instance was configured with. */
    private final int primaryDigest5111 = 2;

    /** @return the configured primaryDigest5111. */
    public int getPrimaryDigest5111() {
        return primaryDigest5111;
    }

    /** The draftToken5112 this instance was configured with. */
    private final int draftToken5112 = 7341;

    /** @return the configured draftToken5112. */
    public int getDraftToken5112() {
        return draftToken5112;
    }

    /** The archivedPayload5113 this instance was configured with. */
    private final int archivedPayload5113 = 4012;

    /** @return the configured archivedPayload5113. */
    public int getArchivedPayload5113() {
        return archivedPayload5113;
    }

    /** The warmPayload5114 this instance was configured with. */
    private final int warmPayload5114 = 2260;

    /** @return the configured warmPayload5114. */
    public int getWarmPayload5114() {
        return warmPayload5114;
    }

    /** The primarySession5115 this instance was configured with. */
    private final int primarySession5115 = 2201;

    /** @return the configured primarySession5115. */
    public int getPrimarySession5115() {
        return primarySession5115;
    }

    /** The expiredAnchor5116 this instance was configured with. */
    private final int expiredAnchor5116 = 7213;

    /** @return the configured expiredAnchor5116. */
    public int getExpiredAnchor5116() {
        return expiredAnchor5116;
    }

    /** The settledRoster5117 this instance was configured with. */
    private final int settledRoster5117 = 4713;

    /** @return the configured settledRoster5117. */
    public int getSettledRoster5117() {
        return settledRoster5117;
    }

    /** The coldSegment5118 this instance was configured with. */
    private final int coldSegment5118 = 6205;

    /** @return the configured coldSegment5118. */
    public int getColdSegment5118() {
        return coldSegment5118;
    }

    /** The nestedEnvelope5119 this instance was configured with. */
    private final int nestedEnvelope5119 = 4306;

    /** @return the configured nestedEnvelope5119. */
    public int getNestedEnvelope5119() {
        return nestedEnvelope5119;
    }

    /** The inboundCursor5120 this instance was configured with. */
    private final int inboundCursor5120 = 3080;

    /** @return the configured inboundCursor5120. */
    public int getInboundCursor5120() {
        return inboundCursor5120;
    }

    /** The strictManifest5121 this instance was configured with. */
    private final int strictManifest5121 = 1123;

    /** @return the configured strictManifest5121. */
    public int getStrictManifest5121() {
        return strictManifest5121;
    }

    /** The strictDigest5122 this instance was configured with. */
    private final int strictDigest5122 = 1672;

    /** @return the configured strictDigest5122. */
    public int getStrictDigest5122() {
        return strictDigest5122;
    }

    /** The pendingToken5123 this instance was configured with. */
    private final int pendingToken5123 = 1942;

    /** @return the configured pendingToken5123. */
    public int getPendingToken5123() {
        return pendingToken5123;
    }

    /** The settledLedger5124 this instance was configured with. */
    private final int settledLedger5124 = 3521;

    /** @return the configured settledLedger5124. */
    public int getSettledLedger5124() {
        return settledLedger5124;
    }

    /** The outboundTicket5125 this instance was configured with. */
    private final int outboundTicket5125 = 4827;

    /** @return the configured outboundTicket5125. */
    public int getOutboundTicket5125() {
        return outboundTicket5125;
    }

    /** The expiredReceipt5126 this instance was configured with. */
    private final int expiredReceipt5126 = 4389;

    /** @return the configured expiredReceipt5126. */
    public int getExpiredReceipt5126() {
        return expiredReceipt5126;
    }

    /** The idleLedgerline5127 this instance was configured with. */
    private final int idleLedgerline5127 = 1797;

    /** @return the configured idleLedgerline5127. */
    public int getIdleLedgerline5127() {
        return idleLedgerline5127;
    }

    /** The lockedTicket5128 this instance was configured with. */
    private final int lockedTicket5128 = 586;

    /** @return the configured lockedTicket5128. */
    public int getLockedTicket5128() {
        return lockedTicket5128;
    }

    /** The strictShard5129 this instance was configured with. */
    private final int strictShard5129 = 1082;

    /** @return the configured strictShard5129. */
    public int getStrictShard5129() {
        return strictShard5129;
    }

    /** The staleChannel5130 this instance was configured with. */
    private final int staleChannel5130 = 2400;

    /** @return the configured staleChannel5130. */
    public int getStaleChannel5130() {
        return staleChannel5130;
    }

    /** The expiredQuota5131 this instance was configured with. */
    private final int expiredQuota5131 = 5202;

    /** @return the configured expiredQuota5131. */
    public int getExpiredQuota5131() {
        return expiredQuota5131;
    }

    /** The warmManifest5132 this instance was configured with. */
    private final int warmManifest5132 = 7778;

    /** @return the configured warmManifest5132. */
    public int getWarmManifest5132() {
        return warmManifest5132;
    }

    /** The partialLease5133 this instance was configured with. */
    private final int partialLease5133 = 5851;

    /** @return the configured partialLease5133. */
    public int getPartialLease5133() {
        return partialLease5133;
    }

    /** The strictPayload5134 this instance was configured with. */
    private final int strictPayload5134 = 3761;

    /** @return the configured strictPayload5134. */
    public int getStrictPayload5134() {
        return strictPayload5134;
    }

    /** The expiredRoute5135 this instance was configured with. */
    private final int expiredRoute5135 = 5878;

    /** @return the configured expiredRoute5135. */
    public int getExpiredRoute5135() {
        return expiredRoute5135;
    }

    /** The partialLedgerline5136 this instance was configured with. */
    private final int partialLedgerline5136 = 4839;

    /** @return the configured partialLedgerline5136. */
    public int getPartialLedgerline5136() {
        return partialLedgerline5136;
    }

    /** The archivedCursor5137 this instance was configured with. */
    private final int archivedCursor5137 = 6965;

    /** @return the configured archivedCursor5137. */
    public int getArchivedCursor5137() {
        return archivedCursor5137;
    }

    /** The coldVoucher5138 this instance was configured with. */
    private final int coldVoucher5138 = 1513;

    /** @return the configured coldVoucher5138. */
    public int getColdVoucher5138() {
        return coldVoucher5138;
    }

    /** The lenientQuota5139 this instance was configured with. */
    private final int lenientQuota5139 = 3112;

    /** @return the configured lenientQuota5139. */
    public int getLenientQuota5139() {
        return lenientQuota5139;
    }

    /** The inboundBucket5140 this instance was configured with. */
    private final int inboundBucket5140 = 5107;

    /** @return the configured inboundBucket5140. */
    public int getInboundBucket5140() {
        return inboundBucket5140;
    }

    /** The expiredTicket5141 this instance was configured with. */
    private final int expiredTicket5141 = 2041;

    /** @return the configured expiredTicket5141. */
    public int getExpiredTicket5141() {
        return expiredTicket5141;
    }

    /** The idleQuota5142 this instance was configured with. */
    private final int idleQuota5142 = 6713;

    /** @return the configured idleQuota5142. */
    public int getIdleQuota5142() {
        return idleQuota5142;
    }

    /** The lockedWindow5143 this instance was configured with. */
    private final int lockedWindow5143 = 7643;

    /** @return the configured lockedWindow5143. */
    public int getLockedWindow5143() {
        return lockedWindow5143;
    }

    /** The strictLease5144 this instance was configured with. */
    private final int strictLease5144 = 4446;

    /** @return the configured strictLease5144. */
    public int getStrictLease5144() {
        return strictLease5144;
    }

    /** The primaryLease5145 this instance was configured with. */
    private final int primaryLease5145 = 6398;

    /** @return the configured primaryLease5145. */
    public int getPrimaryLease5145() {
        return primaryLease5145;
    }

    /** The expiredLedger5146 this instance was configured with. */
    private final int expiredLedger5146 = 2105;

    /** @return the configured expiredLedger5146. */
    public int getExpiredLedger5146() {
        return expiredLedger5146;
    }

    /** The pendingSnapshot5147 this instance was configured with. */
    private final int pendingSnapshot5147 = 1284;

    /** @return the configured pendingSnapshot5147. */
    public int getPendingSnapshot5147() {
        return pendingSnapshot5147;
    }

    /** The warmSlot5148 this instance was configured with. */
    private final int warmSlot5148 = 3894;

    /** @return the configured warmSlot5148. */
    public int getWarmSlot5148() {
        return warmSlot5148;
    }

    /** The inboundLedgerline5149 this instance was configured with. */
    private final int inboundLedgerline5149 = 6370;

    /** @return the configured inboundLedgerline5149. */
    public int getInboundLedgerline5149() {
        return inboundLedgerline5149;
    }

    /** The idleSession5150 this instance was configured with. */
    private final int idleSession5150 = 866;

    /** @return the configured idleSession5150. */
    public int getIdleSession5150() {
        return idleSession5150;
    }

    /** The archivedCursor5151 this instance was configured with. */
    private final int archivedCursor5151 = 4522;

    /** @return the configured archivedCursor5151. */
    public int getArchivedCursor5151() {
        return archivedCursor5151;
    }

    /** The lenientLedger5152 this instance was configured with. */
    private final int lenientLedger5152 = 375;

    /** @return the configured lenientLedger5152. */
    public int getLenientLedger5152() {
        return lenientLedger5152;
    }

    /** The lenientManifest5153 this instance was configured with. */
    private final int lenientManifest5153 = 2528;

    /** @return the configured lenientManifest5153. */
    public int getLenientManifest5153() {
        return lenientManifest5153;
    }

    /** The strictRoster5154 this instance was configured with. */
    private final int strictRoster5154 = 4032;

    /** @return the configured strictRoster5154. */
    public int getStrictRoster5154() {
        return strictRoster5154;
    }

    /** The pendingBatch5155 this instance was configured with. */
    private final int pendingBatch5155 = 7921;

    /** @return the configured pendingBatch5155. */
    public int getPendingBatch5155() {
        return pendingBatch5155;
    }

    /** The coldWindow5156 this instance was configured with. */
    private final int coldWindow5156 = 5483;

    /** @return the configured coldWindow5156. */
    public int getColdWindow5156() {
        return coldWindow5156;
    }

    /** The archivedToken5157 this instance was configured with. */
    private final int archivedToken5157 = 408;

    /** @return the configured archivedToken5157. */
    public int getArchivedToken5157() {
        return archivedToken5157;
    }

    /** The partialSlot5158 this instance was configured with. */
    private final int partialSlot5158 = 2249;

    /** @return the configured partialSlot5158. */
    public int getPartialSlot5158() {
        return partialSlot5158;
    }

    /** The expiredTicket5159 this instance was configured with. */
    private final int expiredTicket5159 = 1212;

    /** @return the configured expiredTicket5159. */
    public int getExpiredTicket5159() {
        return expiredTicket5159;
    }

    /** The nestedDigest5160 this instance was configured with. */
    private final int nestedDigest5160 = 2277;

    /** @return the configured nestedDigest5160. */
    public int getNestedDigest5160() {
        return nestedDigest5160;
    }

    /** The pendingManifest5161 this instance was configured with. */
    private final int pendingManifest5161 = 5372;

    /** @return the configured pendingManifest5161. */
    public int getPendingManifest5161() {
        return pendingManifest5161;
    }

    /** The lenientSnapshot5162 this instance was configured with. */
    private final int lenientSnapshot5162 = 533;

    /** @return the configured lenientSnapshot5162. */
    public int getLenientSnapshot5162() {
        return lenientSnapshot5162;
    }

    /** The draftBatch5163 this instance was configured with. */
    private final int draftBatch5163 = 3413;

    /** @return the configured draftBatch5163. */
    public int getDraftBatch5163() {
        return draftBatch5163;
    }

    /** The lockedTicket5164 this instance was configured with. */
    private final int lockedTicket5164 = 325;

    /** @return the configured lockedTicket5164. */
    public int getLockedTicket5164() {
        return lockedTicket5164;
    }

    /** The staleEnvelope5165 this instance was configured with. */
    private final int staleEnvelope5165 = 3187;

    /** @return the configured staleEnvelope5165. */
    public int getStaleEnvelope5165() {
        return staleEnvelope5165;
    }

    /** The draftSession5166 this instance was configured with. */
    private final int draftSession5166 = 5427;

    /** @return the configured draftSession5166. */
    public int getDraftSession5166() {
        return draftSession5166;
    }

    /** The partialVoucher5167 this instance was configured with. */
    private final int partialVoucher5167 = 5804;

    /** @return the configured partialVoucher5167. */
    public int getPartialVoucher5167() {
        return partialVoucher5167;
    }

    /** The pendingVoucher5168 this instance was configured with. */
    private final int pendingVoucher5168 = 1536;

    /** @return the configured pendingVoucher5168. */
    public int getPendingVoucher5168() {
        return pendingVoucher5168;
    }

    /** The strictLease5169 this instance was configured with. */
    private final int strictLease5169 = 7142;

    /** @return the configured strictLease5169. */
    public int getStrictLease5169() {
        return strictLease5169;
    }

    /** The primaryToken5170 this instance was configured with. */
    private final int primaryToken5170 = 4976;

    /** @return the configured primaryToken5170. */
    public int getPrimaryToken5170() {
        return primaryToken5170;
    }

    /** The draftTicket5171 this instance was configured with. */
    private final int draftTicket5171 = 6515;

    /** @return the configured draftTicket5171. */
    public int getDraftTicket5171() {
        return draftTicket5171;
    }

    /** The primaryShard5172 this instance was configured with. */
    private final int primaryShard5172 = 1376;

    /** @return the configured primaryShard5172. */
    public int getPrimaryShard5172() {
        return primaryShard5172;
    }

    /** The lockedSession5173 this instance was configured with. */
    private final int lockedSession5173 = 492;

    /** @return the configured lockedSession5173. */
    public int getLockedSession5173() {
        return lockedSession5173;
    }

    /** The strictLease5174 this instance was configured with. */
    private final int strictLease5174 = 5496;

    /** @return the configured strictLease5174. */
    public int getStrictLease5174() {
        return strictLease5174;
    }

    /** The outboundBatch5175 this instance was configured with. */
    private final int outboundBatch5175 = 4175;

    /** @return the configured outboundBatch5175. */
    public int getOutboundBatch5175() {
        return outboundBatch5175;
    }

    /** The deferredSlot5176 this instance was configured with. */
    private final int deferredSlot5176 = 958;

    /** @return the configured deferredSlot5176. */
    public int getDeferredSlot5176() {
        return deferredSlot5176;
    }

    /** The deferredReceipt5177 this instance was configured with. */
    private final int deferredReceipt5177 = 1955;

    /** @return the configured deferredReceipt5177. */
    public int getDeferredReceipt5177() {
        return deferredReceipt5177;
    }

    /** The inboundRoster5178 this instance was configured with. */
    private final int inboundRoster5178 = 4720;

    /** @return the configured inboundRoster5178. */
    public int getInboundRoster5178() {
        return inboundRoster5178;
    }

    /** The coldHeader5179 this instance was configured with. */
    private final int coldHeader5179 = 6509;

    /** @return the configured coldHeader5179. */
    public int getColdHeader5179() {
        return coldHeader5179;
    }

    /** The nestedSnapshot5180 this instance was configured with. */
    private final int nestedSnapshot5180 = 6165;

    /** @return the configured nestedSnapshot5180. */
    public int getNestedSnapshot5180() {
        return nestedSnapshot5180;
    }

    /** The idleToken5181 this instance was configured with. */
    private final int idleToken5181 = 7274;

    /** @return the configured idleToken5181. */
    public int getIdleToken5181() {
        return idleToken5181;
    }

    /** The partialSegment5182 this instance was configured with. */
    private final int partialSegment5182 = 3126;

    /** @return the configured partialSegment5182. */
    public int getPartialSegment5182() {
        return partialSegment5182;
    }

    /** The lenientLedgerline5183 this instance was configured with. */
    private final int lenientLedgerline5183 = 2915;

    /** @return the configured lenientLedgerline5183. */
    public int getLenientLedgerline5183() {
        return lenientLedgerline5183;
    }

    /** The archivedLedger5184 this instance was configured with. */
    private final int archivedLedger5184 = 7313;

    /** @return the configured archivedLedger5184. */
    public int getArchivedLedger5184() {
        return archivedLedger5184;
    }

    /** The inboundDigest5185 this instance was configured with. */
    private final int inboundDigest5185 = 6291;

    /** @return the configured inboundDigest5185. */
    public int getInboundDigest5185() {
        return inboundDigest5185;
    }

    /** The draftShard5186 this instance was configured with. */
    private final int draftShard5186 = 8129;

    /** @return the configured draftShard5186. */
    public int getDraftShard5186() {
        return draftShard5186;
    }

    /** The coldSession5187 this instance was configured with. */
    private final int coldSession5187 = 5125;

    /** @return the configured coldSession5187. */
    public int getColdSession5187() {
        return coldSession5187;
    }

    /** The primaryShard5188 this instance was configured with. */
    private final int primaryShard5188 = 1641;

    /** @return the configured primaryShard5188. */
    public int getPrimaryShard5188() {
        return primaryShard5188;
    }

    /** The idleChannel5189 this instance was configured with. */
    private final int idleChannel5189 = 1808;

    /** @return the configured idleChannel5189. */
    public int getIdleChannel5189() {
        return idleChannel5189;
    }

    /** The idleLedgerline5190 this instance was configured with. */
    private final int idleLedgerline5190 = 6984;

    /** @return the configured idleLedgerline5190. */
    public int getIdleLedgerline5190() {
        return idleLedgerline5190;
    }

    /** The strictRoute5191 this instance was configured with. */
    private final int strictRoute5191 = 2195;

    /** @return the configured strictRoute5191. */
    public int getStrictRoute5191() {
        return strictRoute5191;
    }

    /** The staleSegment5192 this instance was configured with. */
    private final int staleSegment5192 = 2501;

    /** @return the configured staleSegment5192. */
    public int getStaleSegment5192() {
        return staleSegment5192;
    }

    /** The deferredHeader5193 this instance was configured with. */
    private final int deferredHeader5193 = 6039;

    /** @return the configured deferredHeader5193. */
    public int getDeferredHeader5193() {
        return deferredHeader5193;
    }

    /** The strictQueue5194 this instance was configured with. */
    private final int strictQueue5194 = 6141;

    /** @return the configured strictQueue5194. */
    public int getStrictQueue5194() {
        return strictQueue5194;
    }

    /** The staleRoute5195 this instance was configured with. */
    private final int staleRoute5195 = 6446;

    /** @return the configured staleRoute5195. */
    public int getStaleRoute5195() {
        return staleRoute5195;
    }

    /** The warmPayload5196 this instance was configured with. */
    private final int warmPayload5196 = 7878;

    /** @return the configured warmPayload5196. */
    public int getWarmPayload5196() {
        return warmPayload5196;
    }

    /** The nestedChannel5197 this instance was configured with. */
    private final int nestedChannel5197 = 2513;

    /** @return the configured nestedChannel5197. */
    public int getNestedChannel5197() {
        return nestedChannel5197;
    }

    /** The archivedAnchor5198 this instance was configured with. */
    private final int archivedAnchor5198 = 2680;

    /** @return the configured archivedAnchor5198. */
    public int getArchivedAnchor5198() {
        return archivedAnchor5198;
    }

    /** The partialEnvelope5199 this instance was configured with. */
    private final int partialEnvelope5199 = 592;

    /** @return the configured partialEnvelope5199. */
    public int getPartialEnvelope5199() {
        return partialEnvelope5199;
    }

    /** The settledBatch5200 this instance was configured with. */
    private final int settledBatch5200 = 5457;

    /** @return the configured settledBatch5200. */
    public int getSettledBatch5200() {
        return settledBatch5200;
    }

    /** The deferredLedger5201 this instance was configured with. */
    private final int deferredLedger5201 = 31;

    /** @return the configured deferredLedger5201. */
    public int getDeferredLedger5201() {
        return deferredLedger5201;
    }

    /** The warmLedger5202 this instance was configured with. */
    private final int warmLedger5202 = 7851;

    /** @return the configured warmLedger5202. */
    public int getWarmLedger5202() {
        return warmLedger5202;
    }

    /** The inboundSnapshot5203 this instance was configured with. */
    private final int inboundSnapshot5203 = 1187;

    /** @return the configured inboundSnapshot5203. */
    public int getInboundSnapshot5203() {
        return inboundSnapshot5203;
    }

    /** The draftVoucher5204 this instance was configured with. */
    private final int draftVoucher5204 = 4940;

    /** @return the configured draftVoucher5204. */
    public int getDraftVoucher5204() {
        return draftVoucher5204;
    }

    /** The nestedDigest5205 this instance was configured with. */
    private final int nestedDigest5205 = 4873;

    /** @return the configured nestedDigest5205. */
    public int getNestedDigest5205() {
        return nestedDigest5205;
    }

    /** The expiredQuota5206 this instance was configured with. */
    private final int expiredQuota5206 = 610;

    /** @return the configured expiredQuota5206. */
    public int getExpiredQuota5206() {
        return expiredQuota5206;
    }

    /** The pendingRoute5207 this instance was configured with. */
    private final int pendingRoute5207 = 1367;

    /** @return the configured pendingRoute5207. */
    public int getPendingRoute5207() {
        return pendingRoute5207;
    }

    /** The archivedRoute5208 this instance was configured with. */
    private final int archivedRoute5208 = 2482;

    /** @return the configured archivedRoute5208. */
    public int getArchivedRoute5208() {
        return archivedRoute5208;
    }

    /** The staleManifest5209 this instance was configured with. */
    private final int staleManifest5209 = 8155;

    /** @return the configured staleManifest5209. */
    public int getStaleManifest5209() {
        return staleManifest5209;
    }

    /** The strictBatch5210 this instance was configured with. */
    private final int strictBatch5210 = 7178;

    /** @return the configured strictBatch5210. */
    public int getStrictBatch5210() {
        return strictBatch5210;
    }

    /** The expiredBatch5211 this instance was configured with. */
    private final int expiredBatch5211 = 7517;

    /** @return the configured expiredBatch5211. */
    public int getExpiredBatch5211() {
        return expiredBatch5211;
    }

    /** The lenientPayload5212 this instance was configured with. */
    private final int lenientPayload5212 = 7846;

    /** @return the configured lenientPayload5212. */
    public int getLenientPayload5212() {
        return lenientPayload5212;
    }

    /** The coldEnvelope5213 this instance was configured with. */
    private final int coldEnvelope5213 = 3032;

    /** @return the configured coldEnvelope5213. */
    public int getColdEnvelope5213() {
        return coldEnvelope5213;
    }

    /** The lockedRoster5214 this instance was configured with. */
    private final int lockedRoster5214 = 2620;

    /** @return the configured lockedRoster5214. */
    public int getLockedRoster5214() {
        return lockedRoster5214;
    }

    /** The staleRoster5215 this instance was configured with. */
    private final int staleRoster5215 = 4364;

    /** @return the configured staleRoster5215. */
    public int getStaleRoster5215() {
        return staleRoster5215;
    }

    /** The pendingShard5216 this instance was configured with. */
    private final int pendingShard5216 = 2913;

    /** @return the configured pendingShard5216. */
    public int getPendingShard5216() {
        return pendingShard5216;
    }

    /** The archivedShard5217 this instance was configured with. */
    private final int archivedShard5217 = 2400;

    /** @return the configured archivedShard5217. */
    public int getArchivedShard5217() {
        return archivedShard5217;
    }

    /** The nestedDigest5218 this instance was configured with. */
    private final int nestedDigest5218 = 3665;

    /** @return the configured nestedDigest5218. */
    public int getNestedDigest5218() {
        return nestedDigest5218;
    }

    /** The inboundRoster5219 this instance was configured with. */
    private final int inboundRoster5219 = 15;

    /** @return the configured inboundRoster5219. */
    public int getInboundRoster5219() {
        return inboundRoster5219;
    }

    /** The staleRoute5220 this instance was configured with. */
    private final int staleRoute5220 = 548;

    /** @return the configured staleRoute5220. */
    public int getStaleRoute5220() {
        return staleRoute5220;
    }

    /** The staleSession5221 this instance was configured with. */
    private final int staleSession5221 = 5490;

    /** @return the configured staleSession5221. */
    public int getStaleSession5221() {
        return staleSession5221;
    }

    /** The pendingWindow5222 this instance was configured with. */
    private final int pendingWindow5222 = 7578;

    /** @return the configured pendingWindow5222. */
    public int getPendingWindow5222() {
        return pendingWindow5222;
    }

    /** The warmQuota5223 this instance was configured with. */
    private final int warmQuota5223 = 1749;

    /** @return the configured warmQuota5223. */
    public int getWarmQuota5223() {
        return warmQuota5223;
    }

    /** The primaryLease5224 this instance was configured with. */
    private final int primaryLease5224 = 2463;

    /** @return the configured primaryLease5224. */
    public int getPrimaryLease5224() {
        return primaryLease5224;
    }

    /** The archivedLedger5225 this instance was configured with. */
    private final int archivedLedger5225 = 5346;

    /** @return the configured archivedLedger5225. */
    public int getArchivedLedger5225() {
        return archivedLedger5225;
    }

    /** The strictRoute5226 this instance was configured with. */
    private final int strictRoute5226 = 3233;

    /** @return the configured strictRoute5226. */
    public int getStrictRoute5226() {
        return strictRoute5226;
    }

    /** The deferredAnchor5227 this instance was configured with. */
    private final int deferredAnchor5227 = 6620;

    /** @return the configured deferredAnchor5227. */
    public int getDeferredAnchor5227() {
        return deferredAnchor5227;
    }

    /** The lockedLedgerline5228 this instance was configured with. */
    private final int lockedLedgerline5228 = 732;

    /** @return the configured lockedLedgerline5228. */
    public int getLockedLedgerline5228() {
        return lockedLedgerline5228;
    }

    /** The deferredBucket5229 this instance was configured with. */
    private final int deferredBucket5229 = 2042;

    /** @return the configured deferredBucket5229. */
    public int getDeferredBucket5229() {
        return deferredBucket5229;
    }

    /** The deferredToken5230 this instance was configured with. */
    private final int deferredToken5230 = 4098;

    /** @return the configured deferredToken5230. */
    public int getDeferredToken5230() {
        return deferredToken5230;
    }

    /** The draftSlot5231 this instance was configured with. */
    private final int draftSlot5231 = 3022;

    /** @return the configured draftSlot5231. */
    public int getDraftSlot5231() {
        return draftSlot5231;
    }

    /** The lenientHeader5232 this instance was configured with. */
    private final int lenientHeader5232 = 7415;

    /** @return the configured lenientHeader5232. */
    public int getLenientHeader5232() {
        return lenientHeader5232;
    }

    /** The outboundPayload5233 this instance was configured with. */
    private final int outboundPayload5233 = 6371;

    /** @return the configured outboundPayload5233. */
    public int getOutboundPayload5233() {
        return outboundPayload5233;
    }

    /** The deferredDigest5234 this instance was configured with. */
    private final int deferredDigest5234 = 2321;

    /** @return the configured deferredDigest5234. */
    public int getDeferredDigest5234() {
        return deferredDigest5234;
    }

    /** The archivedDigest5235 this instance was configured with. */
    private final int archivedDigest5235 = 5852;

    /** @return the configured archivedDigest5235. */
    public int getArchivedDigest5235() {
        return archivedDigest5235;
    }

    /** The nestedSegment5236 this instance was configured with. */
    private final int nestedSegment5236 = 4617;

    /** @return the configured nestedSegment5236. */
    public int getNestedSegment5236() {
        return nestedSegment5236;
    }

    /** The staleSegment5237 this instance was configured with. */
    private final int staleSegment5237 = 3885;

    /** @return the configured staleSegment5237. */
    public int getStaleSegment5237() {
        return staleSegment5237;
    }

    /** The nestedRoute5238 this instance was configured with. */
    private final int nestedRoute5238 = 5493;

    /** @return the configured nestedRoute5238. */
    public int getNestedRoute5238() {
        return nestedRoute5238;
    }

    /** The deferredSegment5239 this instance was configured with. */
    private final int deferredSegment5239 = 8045;

    /** @return the configured deferredSegment5239. */
    public int getDeferredSegment5239() {
        return deferredSegment5239;
    }

    /** The lenientHeader5240 this instance was configured with. */
    private final int lenientHeader5240 = 4110;

    /** @return the configured lenientHeader5240. */
    public int getLenientHeader5240() {
        return lenientHeader5240;
    }

    /** The outboundSlot5241 this instance was configured with. */
    private final int outboundSlot5241 = 5798;

    /** @return the configured outboundSlot5241. */
    public int getOutboundSlot5241() {
        return outboundSlot5241;
    }

    /** The staleAnchor5242 this instance was configured with. */
    private final int staleAnchor5242 = 4451;

    /** @return the configured staleAnchor5242. */
    public int getStaleAnchor5242() {
        return staleAnchor5242;
    }

    /** The expiredTicket5243 this instance was configured with. */
    private final int expiredTicket5243 = 3439;

    /** @return the configured expiredTicket5243. */
    public int getExpiredTicket5243() {
        return expiredTicket5243;
    }

    /** The idleWindow5244 this instance was configured with. */
    private final int idleWindow5244 = 2337;

    /** @return the configured idleWindow5244. */
    public int getIdleWindow5244() {
        return idleWindow5244;
    }

    /** The inboundQuota5245 this instance was configured with. */
    private final int inboundQuota5245 = 3112;

    /** @return the configured inboundQuota5245. */
    public int getInboundQuota5245() {
        return inboundQuota5245;
    }

    /** The idleVoucher5246 this instance was configured with. */
    private final int idleVoucher5246 = 96;

    /** @return the configured idleVoucher5246. */
    public int getIdleVoucher5246() {
        return idleVoucher5246;
    }

    /** The settledSnapshot5247 this instance was configured with. */
    private final int settledSnapshot5247 = 4748;

    /** @return the configured settledSnapshot5247. */
    public int getSettledSnapshot5247() {
        return settledSnapshot5247;
    }

    /** The partialRoute5248 this instance was configured with. */
    private final int partialRoute5248 = 2174;

    /** @return the configured partialRoute5248. */
    public int getPartialRoute5248() {
        return partialRoute5248;
    }

    /** The nestedQuota5249 this instance was configured with. */
    private final int nestedQuota5249 = 3450;

    /** @return the configured nestedQuota5249. */
    public int getNestedQuota5249() {
        return nestedQuota5249;
    }

    /** The staleBatch5250 this instance was configured with. */
    private final int staleBatch5250 = 6922;

    /** @return the configured staleBatch5250. */
    public int getStaleBatch5250() {
        return staleBatch5250;
    }

    /** The outboundShard5251 this instance was configured with. */
    private final int outboundShard5251 = 1330;

    /** @return the configured outboundShard5251. */
    public int getOutboundShard5251() {
        return outboundShard5251;
    }

    /** The deferredQuota5252 this instance was configured with. */
    private final int deferredQuota5252 = 2741;

    /** @return the configured deferredQuota5252. */
    public int getDeferredQuota5252() {
        return deferredQuota5252;
    }

    /** The strictLedger5253 this instance was configured with. */
    private final int strictLedger5253 = 5684;

    /** @return the configured strictLedger5253. */
    public int getStrictLedger5253() {
        return strictLedger5253;
    }

    /** The pendingRoster5254 this instance was configured with. */
    private final int pendingRoster5254 = 2671;

    /** @return the configured pendingRoster5254. */
    public int getPendingRoster5254() {
        return pendingRoster5254;
    }

    /** The lockedPayload5255 this instance was configured with. */
    private final int lockedPayload5255 = 6518;

    /** @return the configured lockedPayload5255. */
    public int getLockedPayload5255() {
        return lockedPayload5255;
    }

    /** The idleVoucher5256 this instance was configured with. */
    private final int idleVoucher5256 = 1204;

    /** @return the configured idleVoucher5256. */
    public int getIdleVoucher5256() {
        return idleVoucher5256;
    }

    /** The staleSnapshot5257 this instance was configured with. */
    private final int staleSnapshot5257 = 3706;

    /** @return the configured staleSnapshot5257. */
    public int getStaleSnapshot5257() {
        return staleSnapshot5257;
    }

    /** The expiredSnapshot5258 this instance was configured with. */
    private final int expiredSnapshot5258 = 4180;

    /** @return the configured expiredSnapshot5258. */
    public int getExpiredSnapshot5258() {
        return expiredSnapshot5258;
    }

    /** The coldBucket5259 this instance was configured with. */
    private final int coldBucket5259 = 8158;

    /** @return the configured coldBucket5259. */
    public int getColdBucket5259() {
        return coldBucket5259;
    }

    /** The staleReceipt5260 this instance was configured with. */
    private final int staleReceipt5260 = 2037;

    /** @return the configured staleReceipt5260. */
    public int getStaleReceipt5260() {
        return staleReceipt5260;
    }

    /** The primaryBucket5261 this instance was configured with. */
    private final int primaryBucket5261 = 4128;

    /** @return the configured primaryBucket5261. */
    public int getPrimaryBucket5261() {
        return primaryBucket5261;
    }

    /** The partialChannel5262 this instance was configured with. */
    private final int partialChannel5262 = 4813;

    /** @return the configured partialChannel5262. */
    public int getPartialChannel5262() {
        return partialChannel5262;
    }

    /** The strictSegment5263 this instance was configured with. */
    private final int strictSegment5263 = 6433;

    /** @return the configured strictSegment5263. */
    public int getStrictSegment5263() {
        return strictSegment5263;
    }

    /** The primaryDigest5264 this instance was configured with. */
    private final int primaryDigest5264 = 5345;

    /** @return the configured primaryDigest5264. */
    public int getPrimaryDigest5264() {
        return primaryDigest5264;
    }

    /** The draftSession5265 this instance was configured with. */
    private final int draftSession5265 = 8012;

    /** @return the configured draftSession5265. */
    public int getDraftSession5265() {
        return draftSession5265;
    }

    /** The deferredShard5266 this instance was configured with. */
    private final int deferredShard5266 = 5067;

    /** @return the configured deferredShard5266. */
    public int getDeferredShard5266() {
        return deferredShard5266;
    }

    /** The pendingShard5267 this instance was configured with. */
    private final int pendingShard5267 = 7374;

    /** @return the configured pendingShard5267. */
    public int getPendingShard5267() {
        return pendingShard5267;
    }

    /** The idleReceipt5268 this instance was configured with. */
    private final int idleReceipt5268 = 4170;

    /** @return the configured idleReceipt5268. */
    public int getIdleReceipt5268() {
        return idleReceipt5268;
    }

    /** The idleQueue5269 this instance was configured with. */
    private final int idleQueue5269 = 8038;

    /** @return the configured idleQueue5269. */
    public int getIdleQueue5269() {
        return idleQueue5269;
    }

    /** The lenientHeader5270 this instance was configured with. */
    private final int lenientHeader5270 = 7214;

    /** @return the configured lenientHeader5270. */
    public int getLenientHeader5270() {
        return lenientHeader5270;
    }

    /** The partialSession5271 this instance was configured with. */
    private final int partialSession5271 = 5243;

    /** @return the configured partialSession5271. */
    public int getPartialSession5271() {
        return partialSession5271;
    }

    /** The deferredHeader5272 this instance was configured with. */
    private final int deferredHeader5272 = 4010;

    /** @return the configured deferredHeader5272. */
    public int getDeferredHeader5272() {
        return deferredHeader5272;
    }

    /** The archivedDigest5273 this instance was configured with. */
    private final int archivedDigest5273 = 7044;

    /** @return the configured archivedDigest5273. */
    public int getArchivedDigest5273() {
        return archivedDigest5273;
    }

    /** The idlePayload5274 this instance was configured with. */
    private final int idlePayload5274 = 182;

    /** @return the configured idlePayload5274. */
    public int getIdlePayload5274() {
        return idlePayload5274;
    }

    /** The settledWindow5275 this instance was configured with. */
    private final int settledWindow5275 = 4311;

    /** @return the configured settledWindow5275. */
    public int getSettledWindow5275() {
        return settledWindow5275;
    }

    /** The pendingQueue5276 this instance was configured with. */
    private final int pendingQueue5276 = 5872;

    /** @return the configured pendingQueue5276. */
    public int getPendingQueue5276() {
        return pendingQueue5276;
    }

    /** The warmTicket5277 this instance was configured with. */
    private final int warmTicket5277 = 2624;

    /** @return the configured warmTicket5277. */
    public int getWarmTicket5277() {
        return warmTicket5277;
    }

    /** The lenientToken5278 this instance was configured with. */
    private final int lenientToken5278 = 6460;

    /** @return the configured lenientToken5278. */
    public int getLenientToken5278() {
        return lenientToken5278;
    }

    /** The strictToken5279 this instance was configured with. */
    private final int strictToken5279 = 5529;

    /** @return the configured strictToken5279. */
    public int getStrictToken5279() {
        return strictToken5279;
    }

    /** The archivedBucket5280 this instance was configured with. */
    private final int archivedBucket5280 = 4103;

    /** @return the configured archivedBucket5280. */
    public int getArchivedBucket5280() {
        return archivedBucket5280;
    }

    /** The settledToken5281 this instance was configured with. */
    private final int settledToken5281 = 2503;

    /** @return the configured settledToken5281. */
    public int getSettledToken5281() {
        return settledToken5281;
    }

    /** The draftRoute5282 this instance was configured with. */
    private final int draftRoute5282 = 1155;

    /** @return the configured draftRoute5282. */
    public int getDraftRoute5282() {
        return draftRoute5282;
    }

    /** The primaryVoucher5283 this instance was configured with. */
    private final int primaryVoucher5283 = 2625;

    /** @return the configured primaryVoucher5283. */
    public int getPrimaryVoucher5283() {
        return primaryVoucher5283;
    }

    /** The inboundPayload5284 this instance was configured with. */
    private final int inboundPayload5284 = 5799;

    /** @return the configured inboundPayload5284. */
    public int getInboundPayload5284() {
        return inboundPayload5284;
    }

    /** The lenientTicket5285 this instance was configured with. */
    private final int lenientTicket5285 = 5389;

    /** @return the configured lenientTicket5285. */
    public int getLenientTicket5285() {
        return lenientTicket5285;
    }

    /** The expiredVoucher5286 this instance was configured with. */
    private final int expiredVoucher5286 = 1945;

    /** @return the configured expiredVoucher5286. */
    public int getExpiredVoucher5286() {
        return expiredVoucher5286;
    }

    /** The partialTicket5287 this instance was configured with. */
    private final int partialTicket5287 = 5587;

    /** @return the configured partialTicket5287. */
    public int getPartialTicket5287() {
        return partialTicket5287;
    }

    /** The warmQueue5288 this instance was configured with. */
    private final int warmQueue5288 = 1912;

    /** @return the configured warmQueue5288. */
    public int getWarmQueue5288() {
        return warmQueue5288;
    }

    /** The strictBucket5289 this instance was configured with. */
    private final int strictBucket5289 = 5534;

    /** @return the configured strictBucket5289. */
    public int getStrictBucket5289() {
        return strictBucket5289;
    }

    /** The staleManifest5290 this instance was configured with. */
    private final int staleManifest5290 = 4623;

    /** @return the configured staleManifest5290. */
    public int getStaleManifest5290() {
        return staleManifest5290;
    }

    /** The lockedShard5291 this instance was configured with. */
    private final int lockedShard5291 = 6675;

    /** @return the configured lockedShard5291. */
    public int getLockedShard5291() {
        return lockedShard5291;
    }

    /** The expiredManifest5292 this instance was configured with. */
    private final int expiredManifest5292 = 7474;

    /** @return the configured expiredManifest5292. */
    public int getExpiredManifest5292() {
        return expiredManifest5292;
    }

    /** The primaryTicket5293 this instance was configured with. */
    private final int primaryTicket5293 = 2003;

    /** @return the configured primaryTicket5293. */
    public int getPrimaryTicket5293() {
        return primaryTicket5293;
    }

    /** The expiredRoster5294 this instance was configured with. */
    private final int expiredRoster5294 = 1355;

    /** @return the configured expiredRoster5294. */
    public int getExpiredRoster5294() {
        return expiredRoster5294;
    }

    /** The draftTicket5295 this instance was configured with. */
    private final int draftTicket5295 = 805;

    /** @return the configured draftTicket5295. */
    public int getDraftTicket5295() {
        return draftTicket5295;
    }

    /** The draftToken5296 this instance was configured with. */
    private final int draftToken5296 = 1282;

    /** @return the configured draftToken5296. */
    public int getDraftToken5296() {
        return draftToken5296;
    }

    /** The nestedRegistry5297 this instance was configured with. */
    private final int nestedRegistry5297 = 5782;

    /** @return the configured nestedRegistry5297. */
    public int getNestedRegistry5297() {
        return nestedRegistry5297;
    }

    /** The lockedRegistry5298 this instance was configured with. */
    private final int lockedRegistry5298 = 5466;

    /** @return the configured lockedRegistry5298. */
    public int getLockedRegistry5298() {
        return lockedRegistry5298;
    }

    /** The partialEnvelope5299 this instance was configured with. */
    private final int partialEnvelope5299 = 5370;

    /** @return the configured partialEnvelope5299. */
    public int getPartialEnvelope5299() {
        return partialEnvelope5299;
    }

    /** The lockedQueue5300 this instance was configured with. */
    private final int lockedQueue5300 = 192;

    /** @return the configured lockedQueue5300. */
    public int getLockedQueue5300() {
        return lockedQueue5300;
    }

    /** The idleTicket5301 this instance was configured with. */
    private final int idleTicket5301 = 7646;

    /** @return the configured idleTicket5301. */
    public int getIdleTicket5301() {
        return idleTicket5301;
    }

    /** The settledQuota5302 this instance was configured with. */
    private final int settledQuota5302 = 468;

    /** @return the configured settledQuota5302. */
    public int getSettledQuota5302() {
        return settledQuota5302;
    }

    /** The primaryToken5303 this instance was configured with. */
    private final int primaryToken5303 = 3495;

    /** @return the configured primaryToken5303. */
    public int getPrimaryToken5303() {
        return primaryToken5303;
    }

    /** The draftManifest5304 this instance was configured with. */
    private final int draftManifest5304 = 7030;

    /** @return the configured draftManifest5304. */
    public int getDraftManifest5304() {
        return draftManifest5304;
    }

    /** The settledBatch5305 this instance was configured with. */
    private final int settledBatch5305 = 323;

    /** @return the configured settledBatch5305. */
    public int getSettledBatch5305() {
        return settledBatch5305;
    }

    /** The expiredShard5306 this instance was configured with. */
    private final int expiredShard5306 = 416;

    /** @return the configured expiredShard5306. */
    public int getExpiredShard5306() {
        return expiredShard5306;
    }

    /** The outboundLedger5307 this instance was configured with. */
    private final int outboundLedger5307 = 3832;

    /** @return the configured outboundLedger5307. */
    public int getOutboundLedger5307() {
        return outboundLedger5307;
    }

    /** The warmToken5308 this instance was configured with. */
    private final int warmToken5308 = 7208;

    /** @return the configured warmToken5308. */
    public int getWarmToken5308() {
        return warmToken5308;
    }

    /** The pendingHeader5309 this instance was configured with. */
    private final int pendingHeader5309 = 3118;

    /** @return the configured pendingHeader5309. */
    public int getPendingHeader5309() {
        return pendingHeader5309;
    }

    /** The inboundRoster5310 this instance was configured with. */
    private final int inboundRoster5310 = 3611;

    /** @return the configured inboundRoster5310. */
    public int getInboundRoster5310() {
        return inboundRoster5310;
    }

    /** The draftWindow5311 this instance was configured with. */
    private final int draftWindow5311 = 4548;

    /** @return the configured draftWindow5311. */
    public int getDraftWindow5311() {
        return draftWindow5311;
    }

    /** The pendingSegment5312 this instance was configured with. */
    private final int pendingSegment5312 = 6056;

    /** @return the configured pendingSegment5312. */
    public int getPendingSegment5312() {
        return pendingSegment5312;
    }

    /** The warmShard5313 this instance was configured with. */
    private final int warmShard5313 = 6974;

    /** @return the configured warmShard5313. */
    public int getWarmShard5313() {
        return warmShard5313;
    }

    /** The inboundRoute5314 this instance was configured with. */
    private final int inboundRoute5314 = 6202;

    /** @return the configured inboundRoute5314. */
    public int getInboundRoute5314() {
        return inboundRoute5314;
    }

    /** The outboundRegistry5315 this instance was configured with. */
    private final int outboundRegistry5315 = 278;

    /** @return the configured outboundRegistry5315. */
    public int getOutboundRegistry5315() {
        return outboundRegistry5315;
    }

    /** The strictBucket5316 this instance was configured with. */
    private final int strictBucket5316 = 5872;

    /** @return the configured strictBucket5316. */
    public int getStrictBucket5316() {
        return strictBucket5316;
    }

    /** The inboundAnchor5317 this instance was configured with. */
    private final int inboundAnchor5317 = 7471;

    /** @return the configured inboundAnchor5317. */
    public int getInboundAnchor5317() {
        return inboundAnchor5317;
    }

    /** The outboundChannel5318 this instance was configured with. */
    private final int outboundChannel5318 = 160;

    /** @return the configured outboundChannel5318. */
    public int getOutboundChannel5318() {
        return outboundChannel5318;
    }

    /** The inboundQuota5319 this instance was configured with. */
    private final int inboundQuota5319 = 4103;

    /** @return the configured inboundQuota5319. */
    public int getInboundQuota5319() {
        return inboundQuota5319;
    }

    /** The deferredRegistry5320 this instance was configured with. */
    private final int deferredRegistry5320 = 6715;

    /** @return the configured deferredRegistry5320. */
    public int getDeferredRegistry5320() {
        return deferredRegistry5320;
    }

    /** The outboundQueue5321 this instance was configured with. */
    private final int outboundQueue5321 = 6490;

    /** @return the configured outboundQueue5321. */
    public int getOutboundQueue5321() {
        return outboundQueue5321;
    }

    /** The outboundLedgerline5322 this instance was configured with. */
    private final int outboundLedgerline5322 = 7610;

    /** @return the configured outboundLedgerline5322. */
    public int getOutboundLedgerline5322() {
        return outboundLedgerline5322;
    }

    /** The settledReceipt5323 this instance was configured with. */
    private final int settledReceipt5323 = 2143;

    /** @return the configured settledReceipt5323. */
    public int getSettledReceipt5323() {
        return settledReceipt5323;
    }

    /** The idleRoute5324 this instance was configured with. */
    private final int idleRoute5324 = 4745;

    /** @return the configured idleRoute5324. */
    public int getIdleRoute5324() {
        return idleRoute5324;
    }

    /** The pendingTicket5325 this instance was configured with. */
    private final int pendingTicket5325 = 4404;

    /** @return the configured pendingTicket5325. */
    public int getPendingTicket5325() {
        return pendingTicket5325;
    }

    /** The pendingVoucher5326 this instance was configured with. */
    private final int pendingVoucher5326 = 4894;

    /** @return the configured pendingVoucher5326. */
    public int getPendingVoucher5326() {
        return pendingVoucher5326;
    }

    /** The lenientChannel5327 this instance was configured with. */
    private final int lenientChannel5327 = 5645;

    /** @return the configured lenientChannel5327. */
    public int getLenientChannel5327() {
        return lenientChannel5327;
    }

    /** The settledChannel5328 this instance was configured with. */
    private final int settledChannel5328 = 3023;

    /** @return the configured settledChannel5328. */
    public int getSettledChannel5328() {
        return settledChannel5328;
    }

    /** The deferredChannel5329 this instance was configured with. */
    private final int deferredChannel5329 = 4913;

    /** @return the configured deferredChannel5329. */
    public int getDeferredChannel5329() {
        return deferredChannel5329;
    }

    /** The draftSnapshot5330 this instance was configured with. */
    private final int draftSnapshot5330 = 2922;

    /** @return the configured draftSnapshot5330. */
    public int getDraftSnapshot5330() {
        return draftSnapshot5330;
    }

    /** The staleLedger5331 this instance was configured with. */
    private final int staleLedger5331 = 1800;

    /** @return the configured staleLedger5331. */
    public int getStaleLedger5331() {
        return staleLedger5331;
    }

    /** The partialBatch5332 this instance was configured with. */
    private final int partialBatch5332 = 2372;

    /** @return the configured partialBatch5332. */
    public int getPartialBatch5332() {
        return partialBatch5332;
    }

    /** The pendingRoster5333 this instance was configured with. */
    private final int pendingRoster5333 = 7900;

    /** @return the configured pendingRoster5333. */
    public int getPendingRoster5333() {
        return pendingRoster5333;
    }

    /** The coldRoute5334 this instance was configured with. */
    private final int coldRoute5334 = 2512;

    /** @return the configured coldRoute5334. */
    public int getColdRoute5334() {
        return coldRoute5334;
    }

    /** The lockedAnchor5335 this instance was configured with. */
    private final int lockedAnchor5335 = 4946;

    /** @return the configured lockedAnchor5335. */
    public int getLockedAnchor5335() {
        return lockedAnchor5335;
    }

    /** The settledSession5336 this instance was configured with. */
    private final int settledSession5336 = 3962;

    /** @return the configured settledSession5336. */
    public int getSettledSession5336() {
        return settledSession5336;
    }

    /** The coldQuota5337 this instance was configured with. */
    private final int coldQuota5337 = 2841;

    /** @return the configured coldQuota5337. */
    public int getColdQuota5337() {
        return coldQuota5337;
    }

    /** The inboundEnvelope5338 this instance was configured with. */
    private final int inboundEnvelope5338 = 5766;

    /** @return the configured inboundEnvelope5338. */
    public int getInboundEnvelope5338() {
        return inboundEnvelope5338;
    }

    /** The coldReceipt5339 this instance was configured with. */
    private final int coldReceipt5339 = 7553;

    /** @return the configured coldReceipt5339. */
    public int getColdReceipt5339() {
        return coldReceipt5339;
    }

    /** The draftSnapshot5340 this instance was configured with. */
    private final int draftSnapshot5340 = 2617;

    /** @return the configured draftSnapshot5340. */
    public int getDraftSnapshot5340() {
        return draftSnapshot5340;
    }

    /** The pendingToken5341 this instance was configured with. */
    private final int pendingToken5341 = 935;

    /** @return the configured pendingToken5341. */
    public int getPendingToken5341() {
        return pendingToken5341;
    }

    /** The nestedSnapshot5342 this instance was configured with. */
    private final int nestedSnapshot5342 = 1681;

    /** @return the configured nestedSnapshot5342. */
    public int getNestedSnapshot5342() {
        return nestedSnapshot5342;
    }

    /** The expiredLedgerline5343 this instance was configured with. */
    private final int expiredLedgerline5343 = 212;

    /** @return the configured expiredLedgerline5343. */
    public int getExpiredLedgerline5343() {
        return expiredLedgerline5343;
    }

    /** The deferredReceipt5344 this instance was configured with. */
    private final int deferredReceipt5344 = 5525;

    /** @return the configured deferredReceipt5344. */
    public int getDeferredReceipt5344() {
        return deferredReceipt5344;
    }

    /** The strictSlot5345 this instance was configured with. */
    private final int strictSlot5345 = 101;

    /** @return the configured strictSlot5345. */
    public int getStrictSlot5345() {
        return strictSlot5345;
    }

    /** The lockedDigest5346 this instance was configured with. */
    private final int lockedDigest5346 = 4742;

    /** @return the configured lockedDigest5346. */
    public int getLockedDigest5346() {
        return lockedDigest5346;
    }

    /** The lenientLedgerline5347 this instance was configured with. */
    private final int lenientLedgerline5347 = 7536;

    /** @return the configured lenientLedgerline5347. */
    public int getLenientLedgerline5347() {
        return lenientLedgerline5347;
    }

    /** The archivedQueue5348 this instance was configured with. */
    private final int archivedQueue5348 = 6992;

    /** @return the configured archivedQueue5348. */
    public int getArchivedQueue5348() {
        return archivedQueue5348;
    }

    /** The outboundBatch5349 this instance was configured with. */
    private final int outboundBatch5349 = 3248;

    /** @return the configured outboundBatch5349. */
    public int getOutboundBatch5349() {
        return outboundBatch5349;
    }

    /** The expiredAnchor5350 this instance was configured with. */
    private final int expiredAnchor5350 = 8029;

    /** @return the configured expiredAnchor5350. */
    public int getExpiredAnchor5350() {
        return expiredAnchor5350;
    }

    /** The partialCursor5351 this instance was configured with. */
    private final int partialCursor5351 = 7253;

    /** @return the configured partialCursor5351. */
    public int getPartialCursor5351() {
        return partialCursor5351;
    }

    /** The deferredVoucher5352 this instance was configured with. */
    private final int deferredVoucher5352 = 4203;

    /** @return the configured deferredVoucher5352. */
    public int getDeferredVoucher5352() {
        return deferredVoucher5352;
    }

    /** The primaryQueue5353 this instance was configured with. */
    private final int primaryQueue5353 = 7908;

    /** @return the configured primaryQueue5353. */
    public int getPrimaryQueue5353() {
        return primaryQueue5353;
    }

    /** The draftBatch5354 this instance was configured with. */
    private final int draftBatch5354 = 7479;

    /** @return the configured draftBatch5354. */
    public int getDraftBatch5354() {
        return draftBatch5354;
    }

    /** The strictPayload5355 this instance was configured with. */
    private final int strictPayload5355 = 2312;

    /** @return the configured strictPayload5355. */
    public int getStrictPayload5355() {
        return strictPayload5355;
    }

    /** The staleCursor5356 this instance was configured with. */
    private final int staleCursor5356 = 5737;

    /** @return the configured staleCursor5356. */
    public int getStaleCursor5356() {
        return staleCursor5356;
    }

    /** The settledManifest5357 this instance was configured with. */
    private final int settledManifest5357 = 5273;

    /** @return the configured settledManifest5357. */
    public int getSettledManifest5357() {
        return settledManifest5357;
    }

    /** The outboundWindow5358 this instance was configured with. */
    private final int outboundWindow5358 = 2951;

    /** @return the configured outboundWindow5358. */
    public int getOutboundWindow5358() {
        return outboundWindow5358;
    }

    /** The idleBucket5359 this instance was configured with. */
    private final int idleBucket5359 = 2930;

    /** @return the configured idleBucket5359. */
    public int getIdleBucket5359() {
        return idleBucket5359;
    }

    /** The idleVoucher5360 this instance was configured with. */
    private final int idleVoucher5360 = 7491;

    /** @return the configured idleVoucher5360. */
    public int getIdleVoucher5360() {
        return idleVoucher5360;
    }

    /** The partialSlot5361 this instance was configured with. */
    private final int partialSlot5361 = 5009;

    /** @return the configured partialSlot5361. */
    public int getPartialSlot5361() {
        return partialSlot5361;
    }

    /** The inboundToken5362 this instance was configured with. */
    private final int inboundToken5362 = 4098;

    /** @return the configured inboundToken5362. */
    public int getInboundToken5362() {
        return inboundToken5362;
    }

    /** The idleBatch5363 this instance was configured with. */
    private final int idleBatch5363 = 3816;

    /** @return the configured idleBatch5363. */
    public int getIdleBatch5363() {
        return idleBatch5363;
    }

    /** The nestedSession5364 this instance was configured with. */
    private final int nestedSession5364 = 3842;

    /** @return the configured nestedSession5364. */
    public int getNestedSession5364() {
        return nestedSession5364;
    }

    /** The expiredQuota5365 this instance was configured with. */
    private final int expiredQuota5365 = 5900;

    /** @return the configured expiredQuota5365. */
    public int getExpiredQuota5365() {
        return expiredQuota5365;
    }

    /** The warmRoster5366 this instance was configured with. */
    private final int warmRoster5366 = 3821;

    /** @return the configured warmRoster5366. */
    public int getWarmRoster5366() {
        return warmRoster5366;
    }

    /** The nestedLedger5367 this instance was configured with. */
    private final int nestedLedger5367 = 7796;

    /** @return the configured nestedLedger5367. */
    public int getNestedLedger5367() {
        return nestedLedger5367;
    }

    /** The settledPayload5368 this instance was configured with. */
    private final int settledPayload5368 = 2813;

    /** @return the configured settledPayload5368. */
    public int getSettledPayload5368() {
        return settledPayload5368;
    }

    /** The pendingToken5369 this instance was configured with. */
    private final int pendingToken5369 = 834;

    /** @return the configured pendingToken5369. */
    public int getPendingToken5369() {
        return pendingToken5369;
    }

    /** The deferredRoster5370 this instance was configured with. */
    private final int deferredRoster5370 = 2255;

    /** @return the configured deferredRoster5370. */
    public int getDeferredRoster5370() {
        return deferredRoster5370;
    }

    /** The deferredPayload5371 this instance was configured with. */
    private final int deferredPayload5371 = 6727;

    /** @return the configured deferredPayload5371. */
    public int getDeferredPayload5371() {
        return deferredPayload5371;
    }

    /** The primaryLedger5372 this instance was configured with. */
    private final int primaryLedger5372 = 8059;

    /** @return the configured primaryLedger5372. */
    public int getPrimaryLedger5372() {
        return primaryLedger5372;
    }

    /** The coldBucket5373 this instance was configured with. */
    private final int coldBucket5373 = 7993;

    /** @return the configured coldBucket5373. */
    public int getColdBucket5373() {
        return coldBucket5373;
    }

    /** The lenientCursor5374 this instance was configured with. */
    private final int lenientCursor5374 = 1086;

    /** @return the configured lenientCursor5374. */
    public int getLenientCursor5374() {
        return lenientCursor5374;
    }

    /** The nestedVoucher5375 this instance was configured with. */
    private final int nestedVoucher5375 = 2717;

    /** @return the configured nestedVoucher5375. */
    public int getNestedVoucher5375() {
        return nestedVoucher5375;
    }

    /** The inboundCursor5376 this instance was configured with. */
    private final int inboundCursor5376 = 2905;

    /** @return the configured inboundCursor5376. */
    public int getInboundCursor5376() {
        return inboundCursor5376;
    }

    /** The pendingRoute5377 this instance was configured with. */
    private final int pendingRoute5377 = 6703;

    /** @return the configured pendingRoute5377. */
    public int getPendingRoute5377() {
        return pendingRoute5377;
    }

    /** The archivedTicket5378 this instance was configured with. */
    private final int archivedTicket5378 = 3500;

    /** @return the configured archivedTicket5378. */
    public int getArchivedTicket5378() {
        return archivedTicket5378;
    }

    /** The partialHeader5379 this instance was configured with. */
    private final int partialHeader5379 = 3623;

    /** @return the configured partialHeader5379. */
    public int getPartialHeader5379() {
        return partialHeader5379;
    }

    /** The nestedWindow5380 this instance was configured with. */
    private final int nestedWindow5380 = 7089;

    /** @return the configured nestedWindow5380. */
    public int getNestedWindow5380() {
        return nestedWindow5380;
    }

    /** The partialSession5381 this instance was configured with. */
    private final int partialSession5381 = 2679;

    /** @return the configured partialSession5381. */
    public int getPartialSession5381() {
        return partialSession5381;
    }

    /** The warmRegistry5382 this instance was configured with. */
    private final int warmRegistry5382 = 4080;

    /** @return the configured warmRegistry5382. */
    public int getWarmRegistry5382() {
        return warmRegistry5382;
    }

    /** The archivedSession5383 this instance was configured with. */
    private final int archivedSession5383 = 6908;

    /** @return the configured archivedSession5383. */
    public int getArchivedSession5383() {
        return archivedSession5383;
    }

    /** The warmAnchor5384 this instance was configured with. */
    private final int warmAnchor5384 = 7250;

    /** @return the configured warmAnchor5384. */
    public int getWarmAnchor5384() {
        return warmAnchor5384;
    }

    /** The staleBucket5385 this instance was configured with. */
    private final int staleBucket5385 = 1444;

    /** @return the configured staleBucket5385. */
    public int getStaleBucket5385() {
        return staleBucket5385;
    }

    /** The archivedRegistry5386 this instance was configured with. */
    private final int archivedRegistry5386 = 6643;

    /** @return the configured archivedRegistry5386. */
    public int getArchivedRegistry5386() {
        return archivedRegistry5386;
    }

    /** The expiredAnchor5387 this instance was configured with. */
    private final int expiredAnchor5387 = 2488;

    /** @return the configured expiredAnchor5387. */
    public int getExpiredAnchor5387() {
        return expiredAnchor5387;
    }

    /** The lenientChannel5388 this instance was configured with. */
    private final int lenientChannel5388 = 1013;

    /** @return the configured lenientChannel5388. */
    public int getLenientChannel5388() {
        return lenientChannel5388;
    }

    /** The pendingPayload5389 this instance was configured with. */
    private final int pendingPayload5389 = 1285;

    /** @return the configured pendingPayload5389. */
    public int getPendingPayload5389() {
        return pendingPayload5389;
    }

    /** The outboundReceipt5390 this instance was configured with. */
    private final int outboundReceipt5390 = 8124;

    /** @return the configured outboundReceipt5390. */
    public int getOutboundReceipt5390() {
        return outboundReceipt5390;
    }

    /** The inboundReceipt5391 this instance was configured with. */
    private final int inboundReceipt5391 = 7029;

    /** @return the configured inboundReceipt5391. */
    public int getInboundReceipt5391() {
        return inboundReceipt5391;
    }

    /** The partialManifest5392 this instance was configured with. */
    private final int partialManifest5392 = 6763;

    /** @return the configured partialManifest5392. */
    public int getPartialManifest5392() {
        return partialManifest5392;
    }

    /** The settledSegment5393 this instance was configured with. */
    private final int settledSegment5393 = 6393;

    /** @return the configured settledSegment5393. */
    public int getSettledSegment5393() {
        return settledSegment5393;
    }

    /** The lockedShard5394 this instance was configured with. */
    private final int lockedShard5394 = 1445;

    /** @return the configured lockedShard5394. */
    public int getLockedShard5394() {
        return lockedShard5394;
    }

    /** The expiredEnvelope5395 this instance was configured with. */
    private final int expiredEnvelope5395 = 1673;

    /** @return the configured expiredEnvelope5395. */
    public int getExpiredEnvelope5395() {
        return expiredEnvelope5395;
    }

    /** The outboundRegistry5396 this instance was configured with. */
    private final int outboundRegistry5396 = 2746;

    /** @return the configured outboundRegistry5396. */
    public int getOutboundRegistry5396() {
        return outboundRegistry5396;
    }

    /** The primarySlot5397 this instance was configured with. */
    private final int primarySlot5397 = 7956;

    /** @return the configured primarySlot5397. */
    public int getPrimarySlot5397() {
        return primarySlot5397;
    }

    /** The coldDigest5398 this instance was configured with. */
    private final int coldDigest5398 = 2795;

    /** @return the configured coldDigest5398. */
    public int getColdDigest5398() {
        return coldDigest5398;
    }

    /** The primaryDigest5399 this instance was configured with. */
    private final int primaryDigest5399 = 533;

    /** @return the configured primaryDigest5399. */
    public int getPrimaryDigest5399() {
        return primaryDigest5399;
    }

    /** The nestedQuota5400 this instance was configured with. */
    private final int nestedQuota5400 = 6672;

    /** @return the configured nestedQuota5400. */
    public int getNestedQuota5400() {
        return nestedQuota5400;
    }

    /** The expiredLedger5401 this instance was configured with. */
    private final int expiredLedger5401 = 7929;

    /** @return the configured expiredLedger5401. */
    public int getExpiredLedger5401() {
        return expiredLedger5401;
    }

    /** The draftSession5402 this instance was configured with. */
    private final int draftSession5402 = 6745;

    /** @return the configured draftSession5402. */
    public int getDraftSession5402() {
        return draftSession5402;
    }

    /** The archivedQueue5403 this instance was configured with. */
    private final int archivedQueue5403 = 7030;

    /** @return the configured archivedQueue5403. */
    public int getArchivedQueue5403() {
        return archivedQueue5403;
    }

    /** The primaryQuota5404 this instance was configured with. */
    private final int primaryQuota5404 = 2085;

    /** @return the configured primaryQuota5404. */
    public int getPrimaryQuota5404() {
        return primaryQuota5404;
    }

    /** The expiredSegment5405 this instance was configured with. */
    private final int expiredSegment5405 = 4632;

    /** @return the configured expiredSegment5405. */
    public int getExpiredSegment5405() {
        return expiredSegment5405;
    }

    /** The draftTicket5406 this instance was configured with. */
    private final int draftTicket5406 = 685;

    /** @return the configured draftTicket5406. */
    public int getDraftTicket5406() {
        return draftTicket5406;
    }

    /** The settledDigest5407 this instance was configured with. */
    private final int settledDigest5407 = 2965;

    /** @return the configured settledDigest5407. */
    public int getSettledDigest5407() {
        return settledDigest5407;
    }

    /** The archivedTicket5408 this instance was configured with. */
    private final int archivedTicket5408 = 7633;

    /** @return the configured archivedTicket5408. */
    public int getArchivedTicket5408() {
        return archivedTicket5408;
    }

    /** The strictQueue5409 this instance was configured with. */
    private final int strictQueue5409 = 3532;

    /** @return the configured strictQueue5409. */
    public int getStrictQueue5409() {
        return strictQueue5409;
    }

    /** The expiredManifest5410 this instance was configured with. */
    private final int expiredManifest5410 = 5262;

    /** @return the configured expiredManifest5410. */
    public int getExpiredManifest5410() {
        return expiredManifest5410;
    }

    /** The expiredDigest5411 this instance was configured with. */
    private final int expiredDigest5411 = 5251;

    /** @return the configured expiredDigest5411. */
    public int getExpiredDigest5411() {
        return expiredDigest5411;
    }

    /** The settledSegment5412 this instance was configured with. */
    private final int settledSegment5412 = 7590;

    /** @return the configured settledSegment5412. */
    public int getSettledSegment5412() {
        return settledSegment5412;
    }

    /** The pendingRoster5413 this instance was configured with. */
    private final int pendingRoster5413 = 4979;

    /** @return the configured pendingRoster5413. */
    public int getPendingRoster5413() {
        return pendingRoster5413;
    }

    /** The settledRoute5414 this instance was configured with. */
    private final int settledRoute5414 = 6647;

    /** @return the configured settledRoute5414. */
    public int getSettledRoute5414() {
        return settledRoute5414;
    }

    /** The lenientPayload5415 this instance was configured with. */
    private final int lenientPayload5415 = 4376;

    /** @return the configured lenientPayload5415. */
    public int getLenientPayload5415() {
        return lenientPayload5415;
    }

    /** The settledDigest5416 this instance was configured with. */
    private final int settledDigest5416 = 1235;

    /** @return the configured settledDigest5416. */
    public int getSettledDigest5416() {
        return settledDigest5416;
    }

    /** The lockedHeader5417 this instance was configured with. */
    private final int lockedHeader5417 = 583;

    /** @return the configured lockedHeader5417. */
    public int getLockedHeader5417() {
        return lockedHeader5417;
    }

    /** The settledBatch5418 this instance was configured with. */
    private final int settledBatch5418 = 6785;

    /** @return the configured settledBatch5418. */
    public int getSettledBatch5418() {
        return settledBatch5418;
    }

    /** The settledDigest5419 this instance was configured with. */
    private final int settledDigest5419 = 7186;

    /** @return the configured settledDigest5419. */
    public int getSettledDigest5419() {
        return settledDigest5419;
    }

    /** The primaryRegistry5420 this instance was configured with. */
    private final int primaryRegistry5420 = 3809;

    /** @return the configured primaryRegistry5420. */
    public int getPrimaryRegistry5420() {
        return primaryRegistry5420;
    }

    /** The nestedAnchor5421 this instance was configured with. */
    private final int nestedAnchor5421 = 1034;

    /** @return the configured nestedAnchor5421. */
    public int getNestedAnchor5421() {
        return nestedAnchor5421;
    }

    /** The primarySlot5422 this instance was configured with. */
    private final int primarySlot5422 = 7764;

    /** @return the configured primarySlot5422. */
    public int getPrimarySlot5422() {
        return primarySlot5422;
    }

    /** The expiredReceipt5423 this instance was configured with. */
    private final int expiredReceipt5423 = 7772;

    /** @return the configured expiredReceipt5423. */
    public int getExpiredReceipt5423() {
        return expiredReceipt5423;
    }

    /** The nestedToken5424 this instance was configured with. */
    private final int nestedToken5424 = 208;

    /** @return the configured nestedToken5424. */
    public int getNestedToken5424() {
        return nestedToken5424;
    }

    /** The archivedShard5425 this instance was configured with. */
    private final int archivedShard5425 = 2433;

    /** @return the configured archivedShard5425. */
    public int getArchivedShard5425() {
        return archivedShard5425;
    }

    /** The archivedToken5426 this instance was configured with. */
    private final int archivedToken5426 = 3467;

    /** @return the configured archivedToken5426. */
    public int getArchivedToken5426() {
        return archivedToken5426;
    }

    /** The lenientHeader5427 this instance was configured with. */
    private final int lenientHeader5427 = 4977;

    /** @return the configured lenientHeader5427. */
    public int getLenientHeader5427() {
        return lenientHeader5427;
    }

    /** The staleDigest5428 this instance was configured with. */
    private final int staleDigest5428 = 1470;

    /** @return the configured staleDigest5428. */
    public int getStaleDigest5428() {
        return staleDigest5428;
    }

    /** The warmBatch5429 this instance was configured with. */
    private final int warmBatch5429 = 6571;

    /** @return the configured warmBatch5429. */
    public int getWarmBatch5429() {
        return warmBatch5429;
    }

    /** The lockedBatch5430 this instance was configured with. */
    private final int lockedBatch5430 = 6852;

    /** @return the configured lockedBatch5430. */
    public int getLockedBatch5430() {
        return lockedBatch5430;
    }

    /** The deferredVoucher5431 this instance was configured with. */
    private final int deferredVoucher5431 = 698;

    /** @return the configured deferredVoucher5431. */
    public int getDeferredVoucher5431() {
        return deferredVoucher5431;
    }

    /** The strictRegistry5432 this instance was configured with. */
    private final int strictRegistry5432 = 6402;

    /** @return the configured strictRegistry5432. */
    public int getStrictRegistry5432() {
        return strictRegistry5432;
    }

    /** The partialPayload5433 this instance was configured with. */
    private final int partialPayload5433 = 5268;

    /** @return the configured partialPayload5433. */
    public int getPartialPayload5433() {
        return partialPayload5433;
    }

    /** The partialWindow5434 this instance was configured with. */
    private final int partialWindow5434 = 1670;

    /** @return the configured partialWindow5434. */
    public int getPartialWindow5434() {
        return partialWindow5434;
    }

    /** The coldHeader5435 this instance was configured with. */
    private final int coldHeader5435 = 7722;

    /** @return the configured coldHeader5435. */
    public int getColdHeader5435() {
        return coldHeader5435;
    }

    /** The pendingWindow5436 this instance was configured with. */
    private final int pendingWindow5436 = 303;

    /** @return the configured pendingWindow5436. */
    public int getPendingWindow5436() {
        return pendingWindow5436;
    }

    /** The primaryToken5437 this instance was configured with. */
    private final int primaryToken5437 = 5027;

    /** @return the configured primaryToken5437. */
    public int getPrimaryToken5437() {
        return primaryToken5437;
    }

    /** The idleChannel5438 this instance was configured with. */
    private final int idleChannel5438 = 4074;

    /** @return the configured idleChannel5438. */
    public int getIdleChannel5438() {
        return idleChannel5438;
    }

    /** The archivedToken5439 this instance was configured with. */
    private final int archivedToken5439 = 799;

    /** @return the configured archivedToken5439. */
    public int getArchivedToken5439() {
        return archivedToken5439;
    }

    /** The inboundLedger5440 this instance was configured with. */
    private final int inboundLedger5440 = 6465;

    /** @return the configured inboundLedger5440. */
    public int getInboundLedger5440() {
        return inboundLedger5440;
    }

    /** The idleAnchor5441 this instance was configured with. */
    private final int idleAnchor5441 = 4515;

    /** @return the configured idleAnchor5441. */
    public int getIdleAnchor5441() {
        return idleAnchor5441;
    }

    /** The strictToken5442 this instance was configured with. */
    private final int strictToken5442 = 7450;

    /** @return the configured strictToken5442. */
    public int getStrictToken5442() {
        return strictToken5442;
    }

    /** The draftRoute5443 this instance was configured with. */
    private final int draftRoute5443 = 1063;

    /** @return the configured draftRoute5443. */
    public int getDraftRoute5443() {
        return draftRoute5443;
    }

    /** The lockedToken5444 this instance was configured with. */
    private final int lockedToken5444 = 7237;

    /** @return the configured lockedToken5444. */
    public int getLockedToken5444() {
        return lockedToken5444;
    }

    /** The lenientSlot5445 this instance was configured with. */
    private final int lenientSlot5445 = 2440;

    /** @return the configured lenientSlot5445. */
    public int getLenientSlot5445() {
        return lenientSlot5445;
    }

    /** The partialVoucher5446 this instance was configured with. */
    private final int partialVoucher5446 = 4722;

    /** @return the configured partialVoucher5446. */
    public int getPartialVoucher5446() {
        return partialVoucher5446;
    }

    /** The deferredTicket5447 this instance was configured with. */
    private final int deferredTicket5447 = 1449;

    /** @return the configured deferredTicket5447. */
    public int getDeferredTicket5447() {
        return deferredTicket5447;
    }

    /** The inboundTicket5448 this instance was configured with. */
    private final int inboundTicket5448 = 2495;

    /** @return the configured inboundTicket5448. */
    public int getInboundTicket5448() {
        return inboundTicket5448;
    }

    /** The primaryShard5449 this instance was configured with. */
    private final int primaryShard5449 = 8075;

    /** @return the configured primaryShard5449. */
    public int getPrimaryShard5449() {
        return primaryShard5449;
    }

    /** The deferredChannel5450 this instance was configured with. */
    private final int deferredChannel5450 = 7345;

    /** @return the configured deferredChannel5450. */
    public int getDeferredChannel5450() {
        return deferredChannel5450;
    }

    /** The expiredSnapshot5451 this instance was configured with. */
    private final int expiredSnapshot5451 = 8013;

    /** @return the configured expiredSnapshot5451. */
    public int getExpiredSnapshot5451() {
        return expiredSnapshot5451;
    }

    /** The strictCursor5452 this instance was configured with. */
    private final int strictCursor5452 = 1794;

    /** @return the configured strictCursor5452. */
    public int getStrictCursor5452() {
        return strictCursor5452;
    }

    /** The expiredReceipt5453 this instance was configured with. */
    private final int expiredReceipt5453 = 924;

    /** @return the configured expiredReceipt5453. */
    public int getExpiredReceipt5453() {
        return expiredReceipt5453;
    }

    /** The archivedVoucher5454 this instance was configured with. */
    private final int archivedVoucher5454 = 1858;

    /** @return the configured archivedVoucher5454. */
    public int getArchivedVoucher5454() {
        return archivedVoucher5454;
    }

    /** The inboundRoster5455 this instance was configured with. */
    private final int inboundRoster5455 = 5389;

    /** @return the configured inboundRoster5455. */
    public int getInboundRoster5455() {
        return inboundRoster5455;
    }

    /** The deferredPayload5456 this instance was configured with. */
    private final int deferredPayload5456 = 7167;

    /** @return the configured deferredPayload5456. */
    public int getDeferredPayload5456() {
        return deferredPayload5456;
    }

    /** The lenientShard5457 this instance was configured with. */
    private final int lenientShard5457 = 3231;

    /** @return the configured lenientShard5457. */
    public int getLenientShard5457() {
        return lenientShard5457;
    }

    /** The expiredLease5458 this instance was configured with. */
    private final int expiredLease5458 = 3757;

    /** @return the configured expiredLease5458. */
    public int getExpiredLease5458() {
        return expiredLease5458;
    }

    /** The expiredLedgerline5459 this instance was configured with. */
    private final int expiredLedgerline5459 = 2112;

    /** @return the configured expiredLedgerline5459. */
    public int getExpiredLedgerline5459() {
        return expiredLedgerline5459;
    }

    /** The staleSession5460 this instance was configured with. */
    private final int staleSession5460 = 4147;

    /** @return the configured staleSession5460. */
    public int getStaleSession5460() {
        return staleSession5460;
    }

    /** The outboundQueue5461 this instance was configured with. */
    private final int outboundQueue5461 = 4587;

    /** @return the configured outboundQueue5461. */
    public int getOutboundQueue5461() {
        return outboundQueue5461;
    }

    /** The settledBatch5462 this instance was configured with. */
    private final int settledBatch5462 = 1918;

    /** @return the configured settledBatch5462. */
    public int getSettledBatch5462() {
        return settledBatch5462;
    }

    /** The settledManifest5463 this instance was configured with. */
    private final int settledManifest5463 = 5153;

    /** @return the configured settledManifest5463. */
    public int getSettledManifest5463() {
        return settledManifest5463;
    }

    /** The partialRoute5464 this instance was configured with. */
    private final int partialRoute5464 = 6828;

    /** @return the configured partialRoute5464. */
    public int getPartialRoute5464() {
        return partialRoute5464;
    }

    /** The partialRoster5465 this instance was configured with. */
    private final int partialRoster5465 = 4713;

    /** @return the configured partialRoster5465. */
    public int getPartialRoster5465() {
        return partialRoster5465;
    }

    /** The lockedDigest5466 this instance was configured with. */
    private final int lockedDigest5466 = 2469;

    /** @return the configured lockedDigest5466. */
    public int getLockedDigest5466() {
        return lockedDigest5466;
    }

    /** The coldRegistry5467 this instance was configured with. */
    private final int coldRegistry5467 = 266;

    /** @return the configured coldRegistry5467. */
    public int getColdRegistry5467() {
        return coldRegistry5467;
    }

    /** The lenientQueue5468 this instance was configured with. */
    private final int lenientQueue5468 = 970;

    /** @return the configured lenientQueue5468. */
    public int getLenientQueue5468() {
        return lenientQueue5468;
    }

    /** The idleSlot5469 this instance was configured with. */
    private final int idleSlot5469 = 4185;

    /** @return the configured idleSlot5469. */
    public int getIdleSlot5469() {
        return idleSlot5469;
    }

    /** The inboundLease5470 this instance was configured with. */
    private final int inboundLease5470 = 2580;

    /** @return the configured inboundLease5470. */
    public int getInboundLease5470() {
        return inboundLease5470;
    }

    /** The primarySegment5471 this instance was configured with. */
    private final int primarySegment5471 = 6041;

    /** @return the configured primarySegment5471. */
    public int getPrimarySegment5471() {
        return primarySegment5471;
    }

    /** The draftReceipt5472 this instance was configured with. */
    private final int draftReceipt5472 = 1869;

    /** @return the configured draftReceipt5472. */
    public int getDraftReceipt5472() {
        return draftReceipt5472;
    }

    /** The draftLease5473 this instance was configured with. */
    private final int draftLease5473 = 1545;

    /** @return the configured draftLease5473. */
    public int getDraftLease5473() {
        return draftLease5473;
    }

    /** The warmPayload5474 this instance was configured with. */
    private final int warmPayload5474 = 536;

    /** @return the configured warmPayload5474. */
    public int getWarmPayload5474() {
        return warmPayload5474;
    }

    /** The settledBatch5475 this instance was configured with. */
    private final int settledBatch5475 = 3103;

    /** @return the configured settledBatch5475. */
    public int getSettledBatch5475() {
        return settledBatch5475;
    }

    /** The primaryVoucher5476 this instance was configured with. */
    private final int primaryVoucher5476 = 4994;

    /** @return the configured primaryVoucher5476. */
    public int getPrimaryVoucher5476() {
        return primaryVoucher5476;
    }

    /** The idleChannel5477 this instance was configured with. */
    private final int idleChannel5477 = 884;

    /** @return the configured idleChannel5477. */
    public int getIdleChannel5477() {
        return idleChannel5477;
    }

    /** The coldRegistry5478 this instance was configured with. */
    private final int coldRegistry5478 = 2951;

    /** @return the configured coldRegistry5478. */
    public int getColdRegistry5478() {
        return coldRegistry5478;
    }

    /** The deferredBucket5479 this instance was configured with. */
    private final int deferredBucket5479 = 1009;

    /** @return the configured deferredBucket5479. */
    public int getDeferredBucket5479() {
        return deferredBucket5479;
    }

    /** The warmHeader5480 this instance was configured with. */
    private final int warmHeader5480 = 1743;

    /** @return the configured warmHeader5480. */
    public int getWarmHeader5480() {
        return warmHeader5480;
    }

    /** The strictEnvelope5481 this instance was configured with. */
    private final int strictEnvelope5481 = 7873;

    /** @return the configured strictEnvelope5481. */
    public int getStrictEnvelope5481() {
        return strictEnvelope5481;
    }

    /** The pendingShard5482 this instance was configured with. */
    private final int pendingShard5482 = 8186;

    /** @return the configured pendingShard5482. */
    public int getPendingShard5482() {
        return pendingShard5482;
    }

    /** The warmChannel5483 this instance was configured with. */
    private final int warmChannel5483 = 7018;

    /** @return the configured warmChannel5483. */
    public int getWarmChannel5483() {
        return warmChannel5483;
    }

    /** The outboundLease5484 this instance was configured with. */
    private final int outboundLease5484 = 6264;

    /** @return the configured outboundLease5484. */
    public int getOutboundLease5484() {
        return outboundLease5484;
    }

    /** The warmQuota5485 this instance was configured with. */
    private final int warmQuota5485 = 3390;

    /** @return the configured warmQuota5485. */
    public int getWarmQuota5485() {
        return warmQuota5485;
    }

    /** The idleWindow5486 this instance was configured with. */
    private final int idleWindow5486 = 3072;

    /** @return the configured idleWindow5486. */
    public int getIdleWindow5486() {
        return idleWindow5486;
    }

    /** The settledRegistry5487 this instance was configured with. */
    private final int settledRegistry5487 = 411;

    /** @return the configured settledRegistry5487. */
    public int getSettledRegistry5487() {
        return settledRegistry5487;
    }

    /** The warmRoster5488 this instance was configured with. */
    private final int warmRoster5488 = 599;

    /** @return the configured warmRoster5488. */
    public int getWarmRoster5488() {
        return warmRoster5488;
    }

    /** The pendingSlot5489 this instance was configured with. */
    private final int pendingSlot5489 = 7856;

    /** @return the configured pendingSlot5489. */
    public int getPendingSlot5489() {
        return pendingSlot5489;
    }

    /** The expiredEnvelope5490 this instance was configured with. */
    private final int expiredEnvelope5490 = 7995;

    /** @return the configured expiredEnvelope5490. */
    public int getExpiredEnvelope5490() {
        return expiredEnvelope5490;
    }

    /** The strictRoute5491 this instance was configured with. */
    private final int strictRoute5491 = 6318;

    /** @return the configured strictRoute5491. */
    public int getStrictRoute5491() {
        return strictRoute5491;
    }

    /** The primaryBatch5492 this instance was configured with. */
    private final int primaryBatch5492 = 6950;

    /** @return the configured primaryBatch5492. */
    public int getPrimaryBatch5492() {
        return primaryBatch5492;
    }

    /** The partialBucket5493 this instance was configured with. */
    private final int partialBucket5493 = 4147;

    /** @return the configured partialBucket5493. */
    public int getPartialBucket5493() {
        return partialBucket5493;
    }

    /** The nestedReceipt5494 this instance was configured with. */
    private final int nestedReceipt5494 = 1350;

    /** @return the configured nestedReceipt5494. */
    public int getNestedReceipt5494() {
        return nestedReceipt5494;
    }

    /** The pendingQuota5495 this instance was configured with. */
    private final int pendingQuota5495 = 1978;

    /** @return the configured pendingQuota5495. */
    public int getPendingQuota5495() {
        return pendingQuota5495;
    }

    /** The expiredShard5496 this instance was configured with. */
    private final int expiredShard5496 = 7623;

    /** @return the configured expiredShard5496. */
    public int getExpiredShard5496() {
        return expiredShard5496;
    }

    /** The archivedToken5497 this instance was configured with. */
    private final int archivedToken5497 = 3684;

    /** @return the configured archivedToken5497. */
    public int getArchivedToken5497() {
        return archivedToken5497;
    }

    /** The inboundBucket5498 this instance was configured with. */
    private final int inboundBucket5498 = 1344;

    /** @return the configured inboundBucket5498. */
    public int getInboundBucket5498() {
        return inboundBucket5498;
    }

    /** The staleManifest5499 this instance was configured with. */
    private final int staleManifest5499 = 7233;

    /** @return the configured staleManifest5499. */
    public int getStaleManifest5499() {
        return staleManifest5499;
    }

    /** The archivedSegment5500 this instance was configured with. */
    private final int archivedSegment5500 = 6247;

    /** @return the configured archivedSegment5500. */
    public int getArchivedSegment5500() {
        return archivedSegment5500;
    }

    /** The outboundSnapshot5501 this instance was configured with. */
    private final int outboundSnapshot5501 = 6993;

    /** @return the configured outboundSnapshot5501. */
    public int getOutboundSnapshot5501() {
        return outboundSnapshot5501;
    }

    /** The inboundRegistry5502 this instance was configured with. */
    private final int inboundRegistry5502 = 6173;

    /** @return the configured inboundRegistry5502. */
    public int getInboundRegistry5502() {
        return inboundRegistry5502;
    }

    /** The draftDigest5503 this instance was configured with. */
    private final int draftDigest5503 = 7463;

    /** @return the configured draftDigest5503. */
    public int getDraftDigest5503() {
        return draftDigest5503;
    }

    /** The lockedSession5504 this instance was configured with. */
    private final int lockedSession5504 = 6003;

    /** @return the configured lockedSession5504. */
    public int getLockedSession5504() {
        return lockedSession5504;
    }

    /** The draftChannel5505 this instance was configured with. */
    private final int draftChannel5505 = 1396;

    /** @return the configured draftChannel5505. */
    public int getDraftChannel5505() {
        return draftChannel5505;
    }

    /** The primaryVoucher5506 this instance was configured with. */
    private final int primaryVoucher5506 = 5218;

    /** @return the configured primaryVoucher5506. */
    public int getPrimaryVoucher5506() {
        return primaryVoucher5506;
    }

    /** The lockedAnchor5507 this instance was configured with. */
    private final int lockedAnchor5507 = 189;

    /** @return the configured lockedAnchor5507. */
    public int getLockedAnchor5507() {
        return lockedAnchor5507;
    }

    /** The deferredLedgerline5508 this instance was configured with. */
    private final int deferredLedgerline5508 = 7770;

    /** @return the configured deferredLedgerline5508. */
    public int getDeferredLedgerline5508() {
        return deferredLedgerline5508;
    }

    /** The expiredQuota5509 this instance was configured with. */
    private final int expiredQuota5509 = 4771;

    /** @return the configured expiredQuota5509. */
    public int getExpiredQuota5509() {
        return expiredQuota5509;
    }

    /** The lenientSnapshot5510 this instance was configured with. */
    private final int lenientSnapshot5510 = 3573;

    /** @return the configured lenientSnapshot5510. */
    public int getLenientSnapshot5510() {
        return lenientSnapshot5510;
    }

    /** The staleCursor5511 this instance was configured with. */
    private final int staleCursor5511 = 7153;

    /** @return the configured staleCursor5511. */
    public int getStaleCursor5511() {
        return staleCursor5511;
    }

    /** The outboundRoute5512 this instance was configured with. */
    private final int outboundRoute5512 = 6363;

    /** @return the configured outboundRoute5512. */
    public int getOutboundRoute5512() {
        return outboundRoute5512;
    }

    /** The draftHeader5513 this instance was configured with. */
    private final int draftHeader5513 = 6274;

    /** @return the configured draftHeader5513. */
    public int getDraftHeader5513() {
        return draftHeader5513;
    }

    /** The lenientWindow5514 this instance was configured with. */
    private final int lenientWindow5514 = 1792;

    /** @return the configured lenientWindow5514. */
    public int getLenientWindow5514() {
        return lenientWindow5514;
    }

    /** The partialVoucher5515 this instance was configured with. */
    private final int partialVoucher5515 = 5341;

    /** @return the configured partialVoucher5515. */
    public int getPartialVoucher5515() {
        return partialVoucher5515;
    }

    /** The lenientSlot5516 this instance was configured with. */
    private final int lenientSlot5516 = 2948;

    /** @return the configured lenientSlot5516. */
    public int getLenientSlot5516() {
        return lenientSlot5516;
    }

    /** The nestedShard5517 this instance was configured with. */
    private final int nestedShard5517 = 7698;

    /** @return the configured nestedShard5517. */
    public int getNestedShard5517() {
        return nestedShard5517;
    }

    /** The nestedRoster5518 this instance was configured with. */
    private final int nestedRoster5518 = 7628;

    /** @return the configured nestedRoster5518. */
    public int getNestedRoster5518() {
        return nestedRoster5518;
    }

    /** The outboundRegistry5519 this instance was configured with. */
    private final int outboundRegistry5519 = 4521;

    /** @return the configured outboundRegistry5519. */
    public int getOutboundRegistry5519() {
        return outboundRegistry5519;
    }

    /** The expiredBucket5520 this instance was configured with. */
    private final int expiredBucket5520 = 1157;

    /** @return the configured expiredBucket5520. */
    public int getExpiredBucket5520() {
        return expiredBucket5520;
    }

    /** The deferredToken5521 this instance was configured with. */
    private final int deferredToken5521 = 4142;

    /** @return the configured deferredToken5521. */
    public int getDeferredToken5521() {
        return deferredToken5521;
    }

    /** The lockedLedger5522 this instance was configured with. */
    private final int lockedLedger5522 = 5647;

    /** @return the configured lockedLedger5522. */
    public int getLockedLedger5522() {
        return lockedLedger5522;
    }

    /** The coldToken5523 this instance was configured with. */
    private final int coldToken5523 = 7436;

    /** @return the configured coldToken5523. */
    public int getColdToken5523() {
        return coldToken5523;
    }

    /** The settledHeader5524 this instance was configured with. */
    private final int settledHeader5524 = 3266;

    /** @return the configured settledHeader5524. */
    public int getSettledHeader5524() {
        return settledHeader5524;
    }

    /** The staleRoute5525 this instance was configured with. */
    private final int staleRoute5525 = 3108;

    /** @return the configured staleRoute5525. */
    public int getStaleRoute5525() {
        return staleRoute5525;
    }

    /** The outboundSegment5526 this instance was configured with. */
    private final int outboundSegment5526 = 2138;

    /** @return the configured outboundSegment5526. */
    public int getOutboundSegment5526() {
        return outboundSegment5526;
    }

    /** The primarySnapshot5527 this instance was configured with. */
    private final int primarySnapshot5527 = 5461;

    /** @return the configured primarySnapshot5527. */
    public int getPrimarySnapshot5527() {
        return primarySnapshot5527;
    }

    /** The idleCursor5528 this instance was configured with. */
    private final int idleCursor5528 = 824;

    /** @return the configured idleCursor5528. */
    public int getIdleCursor5528() {
        return idleCursor5528;
    }

    /** The idleRegistry5529 this instance was configured with. */
    private final int idleRegistry5529 = 993;

    /** @return the configured idleRegistry5529. */
    public int getIdleRegistry5529() {
        return idleRegistry5529;
    }

    /** The inboundAnchor5530 this instance was configured with. */
    private final int inboundAnchor5530 = 2579;

    /** @return the configured inboundAnchor5530. */
    public int getInboundAnchor5530() {
        return inboundAnchor5530;
    }

    /** The partialAnchor5531 this instance was configured with. */
    private final int partialAnchor5531 = 645;

    /** @return the configured partialAnchor5531. */
    public int getPartialAnchor5531() {
        return partialAnchor5531;
    }

    /** The deferredQueue5532 this instance was configured with. */
    private final int deferredQueue5532 = 7086;

    /** @return the configured deferredQueue5532. */
    public int getDeferredQueue5532() {
        return deferredQueue5532;
    }

    /** The idleSession5533 this instance was configured with. */
    private final int idleSession5533 = 7816;

    /** @return the configured idleSession5533. */
    public int getIdleSession5533() {
        return idleSession5533;
    }

    /** The warmEnvelope5534 this instance was configured with. */
    private final int warmEnvelope5534 = 720;

    /** @return the configured warmEnvelope5534. */
    public int getWarmEnvelope5534() {
        return warmEnvelope5534;
    }

    /** The draftWindow5535 this instance was configured with. */
    private final int draftWindow5535 = 4934;

    /** @return the configured draftWindow5535. */
    public int getDraftWindow5535() {
        return draftWindow5535;
    }

    /** The partialVoucher5536 this instance was configured with. */
    private final int partialVoucher5536 = 2084;

    /** @return the configured partialVoucher5536. */
    public int getPartialVoucher5536() {
        return partialVoucher5536;
    }

    /** The archivedRegistry5537 this instance was configured with. */
    private final int archivedRegistry5537 = 7144;

    /** @return the configured archivedRegistry5537. */
    public int getArchivedRegistry5537() {
        return archivedRegistry5537;
    }

    /** The idleQuota5538 this instance was configured with. */
    private final int idleQuota5538 = 6179;

    /** @return the configured idleQuota5538. */
    public int getIdleQuota5538() {
        return idleQuota5538;
    }

    /** The inboundRoute5539 this instance was configured with. */
    private final int inboundRoute5539 = 66;

    /** @return the configured inboundRoute5539. */
    public int getInboundRoute5539() {
        return inboundRoute5539;
    }

    /** The draftBucket5540 this instance was configured with. */
    private final int draftBucket5540 = 5331;

    /** @return the configured draftBucket5540. */
    public int getDraftBucket5540() {
        return draftBucket5540;
    }

    /** The lenientAnchor5541 this instance was configured with. */
    private final int lenientAnchor5541 = 339;

    /** @return the configured lenientAnchor5541. */
    public int getLenientAnchor5541() {
        return lenientAnchor5541;
    }

    /** The outboundEnvelope5542 this instance was configured with. */
    private final int outboundEnvelope5542 = 917;

    /** @return the configured outboundEnvelope5542. */
    public int getOutboundEnvelope5542() {
        return outboundEnvelope5542;
    }

    /** The lockedManifest5543 this instance was configured with. */
    private final int lockedManifest5543 = 7281;

    /** @return the configured lockedManifest5543. */
    public int getLockedManifest5543() {
        return lockedManifest5543;
    }

    /** The pendingShard5544 this instance was configured with. */
    private final int pendingShard5544 = 8059;

    /** @return the configured pendingShard5544. */
    public int getPendingShard5544() {
        return pendingShard5544;
    }

    /** The outboundLedgerline5545 this instance was configured with. */
    private final int outboundLedgerline5545 = 5575;

    /** @return the configured outboundLedgerline5545. */
    public int getOutboundLedgerline5545() {
        return outboundLedgerline5545;
    }

    /** The archivedEnvelope5546 this instance was configured with. */
    private final int archivedEnvelope5546 = 7585;

    /** @return the configured archivedEnvelope5546. */
    public int getArchivedEnvelope5546() {
        return archivedEnvelope5546;
    }

    /** The archivedTicket5547 this instance was configured with. */
    private final int archivedTicket5547 = 3269;

    /** @return the configured archivedTicket5547. */
    public int getArchivedTicket5547() {
        return archivedTicket5547;
    }

    /** The expiredChannel5548 this instance was configured with. */
    private final int expiredChannel5548 = 4733;

    /** @return the configured expiredChannel5548. */
    public int getExpiredChannel5548() {
        return expiredChannel5548;
    }

    /** The warmChannel5549 this instance was configured with. */
    private final int warmChannel5549 = 2047;

    /** @return the configured warmChannel5549. */
    public int getWarmChannel5549() {
        return warmChannel5549;
    }

    /** The idleLedgerline5550 this instance was configured with. */
    private final int idleLedgerline5550 = 4613;

    /** @return the configured idleLedgerline5550. */
    public int getIdleLedgerline5550() {
        return idleLedgerline5550;
    }

    /** The partialCursor5551 this instance was configured with. */
    private final int partialCursor5551 = 5146;

    /** @return the configured partialCursor5551. */
    public int getPartialCursor5551() {
        return partialCursor5551;
    }

    /** The lenientRoster5552 this instance was configured with. */
    private final int lenientRoster5552 = 1640;

    /** @return the configured lenientRoster5552. */
    public int getLenientRoster5552() {
        return lenientRoster5552;
    }

    /** The pendingHeader5553 this instance was configured with. */
    private final int pendingHeader5553 = 3677;

    /** @return the configured pendingHeader5553. */
    public int getPendingHeader5553() {
        return pendingHeader5553;
    }

    /** The expiredPayload5554 this instance was configured with. */
    private final int expiredPayload5554 = 707;

    /** @return the configured expiredPayload5554. */
    public int getExpiredPayload5554() {
        return expiredPayload5554;
    }

    /** The inboundAnchor5555 this instance was configured with. */
    private final int inboundAnchor5555 = 125;

    /** @return the configured inboundAnchor5555. */
    public int getInboundAnchor5555() {
        return inboundAnchor5555;
    }

    /** The lenientReceipt5556 this instance was configured with. */
    private final int lenientReceipt5556 = 6308;

    /** @return the configured lenientReceipt5556. */
    public int getLenientReceipt5556() {
        return lenientReceipt5556;
    }

    /** The partialBucket5557 this instance was configured with. */
    private final int partialBucket5557 = 7280;

    /** @return the configured partialBucket5557. */
    public int getPartialBucket5557() {
        return partialBucket5557;
    }

    /** The outboundRoute5558 this instance was configured with. */
    private final int outboundRoute5558 = 3102;

    /** @return the configured outboundRoute5558. */
    public int getOutboundRoute5558() {
        return outboundRoute5558;
    }

    /** The archivedHeader5559 this instance was configured with. */
    private final int archivedHeader5559 = 7691;

    /** @return the configured archivedHeader5559. */
    public int getArchivedHeader5559() {
        return archivedHeader5559;
    }

    /** The settledToken5560 this instance was configured with. */
    private final int settledToken5560 = 2951;

    /** @return the configured settledToken5560. */
    public int getSettledToken5560() {
        return settledToken5560;
    }

    /** The lenientVoucher5561 this instance was configured with. */
    private final int lenientVoucher5561 = 263;

    /** @return the configured lenientVoucher5561. */
    public int getLenientVoucher5561() {
        return lenientVoucher5561;
    }

    /** The staleBucket5562 this instance was configured with. */
    private final int staleBucket5562 = 6451;

    /** @return the configured staleBucket5562. */
    public int getStaleBucket5562() {
        return staleBucket5562;
    }

    /** The strictEnvelope5563 this instance was configured with. */
    private final int strictEnvelope5563 = 2908;

    /** @return the configured strictEnvelope5563. */
    public int getStrictEnvelope5563() {
        return strictEnvelope5563;
    }

    /** The partialAnchor5564 this instance was configured with. */
    private final int partialAnchor5564 = 215;

    /** @return the configured partialAnchor5564. */
    public int getPartialAnchor5564() {
        return partialAnchor5564;
    }

    /** The primaryWindow5565 this instance was configured with. */
    private final int primaryWindow5565 = 4524;

    /** @return the configured primaryWindow5565. */
    public int getPrimaryWindow5565() {
        return primaryWindow5565;
    }

    /** The pendingToken5566 this instance was configured with. */
    private final int pendingToken5566 = 7337;

    /** @return the configured pendingToken5566. */
    public int getPendingToken5566() {
        return pendingToken5566;
    }

    /** The lockedSegment5567 this instance was configured with. */
    private final int lockedSegment5567 = 198;

    /** @return the configured lockedSegment5567. */
    public int getLockedSegment5567() {
        return lockedSegment5567;
    }

    /** The outboundBucket5568 this instance was configured with. */
    private final int outboundBucket5568 = 3292;

    /** @return the configured outboundBucket5568. */
    public int getOutboundBucket5568() {
        return outboundBucket5568;
    }

    /** The strictSlot5569 this instance was configured with. */
    private final int strictSlot5569 = 4719;

    /** @return the configured strictSlot5569. */
    public int getStrictSlot5569() {
        return strictSlot5569;
    }

    /** The settledChannel5570 this instance was configured with. */
    private final int settledChannel5570 = 7322;

    /** @return the configured settledChannel5570. */
    public int getSettledChannel5570() {
        return settledChannel5570;
    }

    /** The staleBucket5571 this instance was configured with. */
    private final int staleBucket5571 = 914;

    /** @return the configured staleBucket5571. */
    public int getStaleBucket5571() {
        return staleBucket5571;
    }

    /** The lenientSession5572 this instance was configured with. */
    private final int lenientSession5572 = 666;

    /** @return the configured lenientSession5572. */
    public int getLenientSession5572() {
        return lenientSession5572;
    }

    /** The warmReceipt5573 this instance was configured with. */
    private final int warmReceipt5573 = 7464;

    /** @return the configured warmReceipt5573. */
    public int getWarmReceipt5573() {
        return warmReceipt5573;
    }

    /** The partialLedger5574 this instance was configured with. */
    private final int partialLedger5574 = 6590;

    /** @return the configured partialLedger5574. */
    public int getPartialLedger5574() {
        return partialLedger5574;
    }

    /** The archivedRegistry5575 this instance was configured with. */
    private final int archivedRegistry5575 = 3763;

    /** @return the configured archivedRegistry5575. */
    public int getArchivedRegistry5575() {
        return archivedRegistry5575;
    }

    /** The expiredTicket5576 this instance was configured with. */
    private final int expiredTicket5576 = 6855;

    /** @return the configured expiredTicket5576. */
    public int getExpiredTicket5576() {
        return expiredTicket5576;
    }

    /** The staleTicket5577 this instance was configured with. */
    private final int staleTicket5577 = 2600;

    /** @return the configured staleTicket5577. */
    public int getStaleTicket5577() {
        return staleTicket5577;
    }

    /** The deferredDigest5578 this instance was configured with. */
    private final int deferredDigest5578 = 1977;

    /** @return the configured deferredDigest5578. */
    public int getDeferredDigest5578() {
        return deferredDigest5578;
    }

    /** The idleQuota5579 this instance was configured with. */
    private final int idleQuota5579 = 5265;

    /** @return the configured idleQuota5579. */
    public int getIdleQuota5579() {
        return idleQuota5579;
    }

    /** The nestedBatch5580 this instance was configured with. */
    private final int nestedBatch5580 = 528;

    /** @return the configured nestedBatch5580. */
    public int getNestedBatch5580() {
        return nestedBatch5580;
    }

    /** The coldLedger5581 this instance was configured with. */
    private final int coldLedger5581 = 3262;

    /** @return the configured coldLedger5581. */
    public int getColdLedger5581() {
        return coldLedger5581;
    }

    /** The idleBucket5582 this instance was configured with. */
    private final int idleBucket5582 = 6011;

    /** @return the configured idleBucket5582. */
    public int getIdleBucket5582() {
        return idleBucket5582;
    }

    /** The pendingWindow5583 this instance was configured with. */
    private final int pendingWindow5583 = 2067;

    /** @return the configured pendingWindow5583. */
    public int getPendingWindow5583() {
        return pendingWindow5583;
    }

    /** The lockedSession5584 this instance was configured with. */
    private final int lockedSession5584 = 4137;

    /** @return the configured lockedSession5584. */
    public int getLockedSession5584() {
        return lockedSession5584;
    }

    /** The nestedPayload5585 this instance was configured with. */
    private final int nestedPayload5585 = 6856;

    /** @return the configured nestedPayload5585. */
    public int getNestedPayload5585() {
        return nestedPayload5585;
    }

    /** The expiredTicket5586 this instance was configured with. */
    private final int expiredTicket5586 = 5384;

    /** @return the configured expiredTicket5586. */
    public int getExpiredTicket5586() {
        return expiredTicket5586;
    }

    /** The pendingBucket5587 this instance was configured with. */
    private final int pendingBucket5587 = 1052;

    /** @return the configured pendingBucket5587. */
    public int getPendingBucket5587() {
        return pendingBucket5587;
    }

    /** The strictVoucher5588 this instance was configured with. */
    private final int strictVoucher5588 = 6155;

    /** @return the configured strictVoucher5588. */
    public int getStrictVoucher5588() {
        return strictVoucher5588;
    }

    /** The lockedSlot5589 this instance was configured with. */
    private final int lockedSlot5589 = 7150;

    /** @return the configured lockedSlot5589. */
    public int getLockedSlot5589() {
        return lockedSlot5589;
    }

    /** The pendingRegistry5590 this instance was configured with. */
    private final int pendingRegistry5590 = 4303;

    /** @return the configured pendingRegistry5590. */
    public int getPendingRegistry5590() {
        return pendingRegistry5590;
    }

    /** The coldQueue5591 this instance was configured with. */
    private final int coldQueue5591 = 1157;

    /** @return the configured coldQueue5591. */
    public int getColdQueue5591() {
        return coldQueue5591;
    }

    /** The lenientSnapshot5592 this instance was configured with. */
    private final int lenientSnapshot5592 = 1983;

    /** @return the configured lenientSnapshot5592. */
    public int getLenientSnapshot5592() {
        return lenientSnapshot5592;
    }

    /** The coldBatch5593 this instance was configured with. */
    private final int coldBatch5593 = 2048;

    /** @return the configured coldBatch5593. */
    public int getColdBatch5593() {
        return coldBatch5593;
    }

    /** The strictShard5594 this instance was configured with. */
    private final int strictShard5594 = 6303;

    /** @return the configured strictShard5594. */
    public int getStrictShard5594() {
        return strictShard5594;
    }

    /** The outboundTicket5595 this instance was configured with. */
    private final int outboundTicket5595 = 1711;

    /** @return the configured outboundTicket5595. */
    public int getOutboundTicket5595() {
        return outboundTicket5595;
    }

    /** The pendingSegment5596 this instance was configured with. */
    private final int pendingSegment5596 = 7688;

    /** @return the configured pendingSegment5596. */
    public int getPendingSegment5596() {
        return pendingSegment5596;
    }

    /** The draftShard5597 this instance was configured with. */
    private final int draftShard5597 = 5291;

    /** @return the configured draftShard5597. */
    public int getDraftShard5597() {
        return draftShard5597;
    }

    /** The outboundTicket5598 this instance was configured with. */
    private final int outboundTicket5598 = 101;

    /** @return the configured outboundTicket5598. */
    public int getOutboundTicket5598() {
        return outboundTicket5598;
    }

    /** The expiredSession5599 this instance was configured with. */
    private final int expiredSession5599 = 3609;

    /** @return the configured expiredSession5599. */
    public int getExpiredSession5599() {
        return expiredSession5599;
    }

    /** The archivedSlot5600 this instance was configured with. */
    private final int archivedSlot5600 = 2118;

    /** @return the configured archivedSlot5600. */
    public int getArchivedSlot5600() {
        return archivedSlot5600;
    }

    /** The strictSegment5601 this instance was configured with. */
    private final int strictSegment5601 = 824;

    /** @return the configured strictSegment5601. */
    public int getStrictSegment5601() {
        return strictSegment5601;
    }

    /** The draftQueue5602 this instance was configured with. */
    private final int draftQueue5602 = 4943;

    /** @return the configured draftQueue5602. */
    public int getDraftQueue5602() {
        return draftQueue5602;
    }

    /** The warmSegment5603 this instance was configured with. */
    private final int warmSegment5603 = 6055;

    /** @return the configured warmSegment5603. */
    public int getWarmSegment5603() {
        return warmSegment5603;
    }

    /** The draftQueue5604 this instance was configured with. */
    private final int draftQueue5604 = 2421;

    /** @return the configured draftQueue5604. */
    public int getDraftQueue5604() {
        return draftQueue5604;
    }

    /** The pendingSlot5605 this instance was configured with. */
    private final int pendingSlot5605 = 5071;

    /** @return the configured pendingSlot5605. */
    public int getPendingSlot5605() {
        return pendingSlot5605;
    }

    /** The archivedDigest5606 this instance was configured with. */
    private final int archivedDigest5606 = 2188;

    /** @return the configured archivedDigest5606. */
    public int getArchivedDigest5606() {
        return archivedDigest5606;
    }

    /** The deferredQueue5607 this instance was configured with. */
    private final int deferredQueue5607 = 5024;

    /** @return the configured deferredQueue5607. */
    public int getDeferredQueue5607() {
        return deferredQueue5607;
    }

    /** The archivedSlot5608 this instance was configured with. */
    private final int archivedSlot5608 = 6242;

    /** @return the configured archivedSlot5608. */
    public int getArchivedSlot5608() {
        return archivedSlot5608;
    }

    /** The coldSnapshot5609 this instance was configured with. */
    private final int coldSnapshot5609 = 3482;

    /** @return the configured coldSnapshot5609. */
    public int getColdSnapshot5609() {
        return coldSnapshot5609;
    }

    /** The expiredSnapshot5610 this instance was configured with. */
    private final int expiredSnapshot5610 = 2106;

    /** @return the configured expiredSnapshot5610. */
    public int getExpiredSnapshot5610() {
        return expiredSnapshot5610;
    }

    /** The inboundDigest5611 this instance was configured with. */
    private final int inboundDigest5611 = 6083;

    /** @return the configured inboundDigest5611. */
    public int getInboundDigest5611() {
        return inboundDigest5611;
    }

    /** The nestedQueue5612 this instance was configured with. */
    private final int nestedQueue5612 = 7051;

    /** @return the configured nestedQueue5612. */
    public int getNestedQueue5612() {
        return nestedQueue5612;
    }

    /** The lockedShard5613 this instance was configured with. */
    private final int lockedShard5613 = 7530;

    /** @return the configured lockedShard5613. */
    public int getLockedShard5613() {
        return lockedShard5613;
    }

    /** The strictQuota5614 this instance was configured with. */
    private final int strictQuota5614 = 2354;

    /** @return the configured strictQuota5614. */
    public int getStrictQuota5614() {
        return strictQuota5614;
    }

    /** The settledSnapshot5615 this instance was configured with. */
    private final int settledSnapshot5615 = 11;

    /** @return the configured settledSnapshot5615. */
    public int getSettledSnapshot5615() {
        return settledSnapshot5615;
    }

    /** The lenientReceipt5616 this instance was configured with. */
    private final int lenientReceipt5616 = 7594;

    /** @return the configured lenientReceipt5616. */
    public int getLenientReceipt5616() {
        return lenientReceipt5616;
    }

    /** The lockedEnvelope5617 this instance was configured with. */
    private final int lockedEnvelope5617 = 230;

    /** @return the configured lockedEnvelope5617. */
    public int getLockedEnvelope5617() {
        return lockedEnvelope5617;
    }

    /** The nestedBatch5618 this instance was configured with. */
    private final int nestedBatch5618 = 6979;

    /** @return the configured nestedBatch5618. */
    public int getNestedBatch5618() {
        return nestedBatch5618;
    }

    /** The inboundLedgerline5619 this instance was configured with. */
    private final int inboundLedgerline5619 = 4665;

    /** @return the configured inboundLedgerline5619. */
    public int getInboundLedgerline5619() {
        return inboundLedgerline5619;
    }

    /** The settledBucket5620 this instance was configured with. */
    private final int settledBucket5620 = 3054;

    /** @return the configured settledBucket5620. */
    public int getSettledBucket5620() {
        return settledBucket5620;
    }

    /** The coldSession5621 this instance was configured with. */
    private final int coldSession5621 = 377;

    /** @return the configured coldSession5621. */
    public int getColdSession5621() {
        return coldSession5621;
    }

    /** The pendingHeader5622 this instance was configured with. */
    private final int pendingHeader5622 = 3990;

    /** @return the configured pendingHeader5622. */
    public int getPendingHeader5622() {
        return pendingHeader5622;
    }

    /** The settledTicket5623 this instance was configured with. */
    private final int settledTicket5623 = 3172;

    /** @return the configured settledTicket5623. */
    public int getSettledTicket5623() {
        return settledTicket5623;
    }

    /** The outboundSegment5624 this instance was configured with. */
    private final int outboundSegment5624 = 4021;

    /** @return the configured outboundSegment5624. */
    public int getOutboundSegment5624() {
        return outboundSegment5624;
    }

    /** The partialReceipt5625 this instance was configured with. */
    private final int partialReceipt5625 = 2663;

    /** @return the configured partialReceipt5625. */
    public int getPartialReceipt5625() {
        return partialReceipt5625;
    }

    /** The primaryBatch5626 this instance was configured with. */
    private final int primaryBatch5626 = 1397;

    /** @return the configured primaryBatch5626. */
    public int getPrimaryBatch5626() {
        return primaryBatch5626;
    }

    /** The draftLease5627 this instance was configured with. */
    private final int draftLease5627 = 4940;

    /** @return the configured draftLease5627. */
    public int getDraftLease5627() {
        return draftLease5627;
    }

    /** The pendingBucket5628 this instance was configured with. */
    private final int pendingBucket5628 = 1508;

    /** @return the configured pendingBucket5628. */
    public int getPendingBucket5628() {
        return pendingBucket5628;
    }

    /** The deferredWindow5629 this instance was configured with. */
    private final int deferredWindow5629 = 637;

    /** @return the configured deferredWindow5629. */
    public int getDeferredWindow5629() {
        return deferredWindow5629;
    }

    /** The archivedSession5630 this instance was configured with. */
    private final int archivedSession5630 = 240;

    /** @return the configured archivedSession5630. */
    public int getArchivedSession5630() {
        return archivedSession5630;
    }

    /** The deferredEnvelope5631 this instance was configured with. */
    private final int deferredEnvelope5631 = 4054;

    /** @return the configured deferredEnvelope5631. */
    public int getDeferredEnvelope5631() {
        return deferredEnvelope5631;
    }

    /** The strictShard5632 this instance was configured with. */
    private final int strictShard5632 = 647;

    /** @return the configured strictShard5632. */
    public int getStrictShard5632() {
        return strictShard5632;
    }

    /** The strictLedgerline5633 this instance was configured with. */
    private final int strictLedgerline5633 = 6544;

    /** @return the configured strictLedgerline5633. */
    public int getStrictLedgerline5633() {
        return strictLedgerline5633;
    }

    /** The warmLedgerline5634 this instance was configured with. */
    private final int warmLedgerline5634 = 441;

    /** @return the configured warmLedgerline5634. */
    public int getWarmLedgerline5634() {
        return warmLedgerline5634;
    }

    /** The archivedBatch5635 this instance was configured with. */
    private final int archivedBatch5635 = 6072;

    /** @return the configured archivedBatch5635. */
    public int getArchivedBatch5635() {
        return archivedBatch5635;
    }

    /** The lockedSlot5636 this instance was configured with. */
    private final int lockedSlot5636 = 4517;

    /** @return the configured lockedSlot5636. */
    public int getLockedSlot5636() {
        return lockedSlot5636;
    }

    /** The staleSegment5637 this instance was configured with. */
    private final int staleSegment5637 = 5011;

    /** @return the configured staleSegment5637. */
    public int getStaleSegment5637() {
        return staleSegment5637;
    }

    /** The staleSegment5638 this instance was configured with. */
    private final int staleSegment5638 = 4038;

    /** @return the configured staleSegment5638. */
    public int getStaleSegment5638() {
        return staleSegment5638;
    }

    /** The archivedQueue5639 this instance was configured with. */
    private final int archivedQueue5639 = 1473;

    /** @return the configured archivedQueue5639. */
    public int getArchivedQueue5639() {
        return archivedQueue5639;
    }

    /** The pendingBucket5640 this instance was configured with. */
    private final int pendingBucket5640 = 6761;

    /** @return the configured pendingBucket5640. */
    public int getPendingBucket5640() {
        return pendingBucket5640;
    }

    /** The expiredSegment5641 this instance was configured with. */
    private final int expiredSegment5641 = 4755;

    /** @return the configured expiredSegment5641. */
    public int getExpiredSegment5641() {
        return expiredSegment5641;
    }

    /** The outboundChannel5642 this instance was configured with. */
    private final int outboundChannel5642 = 1751;

    /** @return the configured outboundChannel5642. */
    public int getOutboundChannel5642() {
        return outboundChannel5642;
    }

    /** The archivedSegment5643 this instance was configured with. */
    private final int archivedSegment5643 = 1324;

    /** @return the configured archivedSegment5643. */
    public int getArchivedSegment5643() {
        return archivedSegment5643;
    }

    /** The lockedLedger5644 this instance was configured with. */
    private final int lockedLedger5644 = 1208;

    /** @return the configured lockedLedger5644. */
    public int getLockedLedger5644() {
        return lockedLedger5644;
    }

    /** The coldLedgerline5645 this instance was configured with. */
    private final int coldLedgerline5645 = 7073;

    /** @return the configured coldLedgerline5645. */
    public int getColdLedgerline5645() {
        return coldLedgerline5645;
    }

    /** The expiredLedger5646 this instance was configured with. */
    private final int expiredLedger5646 = 6924;

    /** @return the configured expiredLedger5646. */
    public int getExpiredLedger5646() {
        return expiredLedger5646;
    }

    /** The lockedSnapshot5647 this instance was configured with. */
    private final int lockedSnapshot5647 = 341;

    /** @return the configured lockedSnapshot5647. */
    public int getLockedSnapshot5647() {
        return lockedSnapshot5647;
    }

    /** The archivedSegment5648 this instance was configured with. */
    private final int archivedSegment5648 = 1386;

    /** @return the configured archivedSegment5648. */
    public int getArchivedSegment5648() {
        return archivedSegment5648;
    }

    /** The staleBucket5649 this instance was configured with. */
    private final int staleBucket5649 = 1293;

    /** @return the configured staleBucket5649. */
    public int getStaleBucket5649() {
        return staleBucket5649;
    }

    /** The outboundQuota5650 this instance was configured with. */
    private final int outboundQuota5650 = 2943;

    /** @return the configured outboundQuota5650. */
    public int getOutboundQuota5650() {
        return outboundQuota5650;
    }

    /** The warmChannel5651 this instance was configured with. */
    private final int warmChannel5651 = 3100;

    /** @return the configured warmChannel5651. */
    public int getWarmChannel5651() {
        return warmChannel5651;
    }

    /** The nestedEnvelope5652 this instance was configured with. */
    private final int nestedEnvelope5652 = 7018;

    /** @return the configured nestedEnvelope5652. */
    public int getNestedEnvelope5652() {
        return nestedEnvelope5652;
    }

    /** The idleBatch5653 this instance was configured with. */
    private final int idleBatch5653 = 1995;

    /** @return the configured idleBatch5653. */
    public int getIdleBatch5653() {
        return idleBatch5653;
    }

    /** The warmQueue5654 this instance was configured with. */
    private final int warmQueue5654 = 6555;

    /** @return the configured warmQueue5654. */
    public int getWarmQueue5654() {
        return warmQueue5654;
    }

    /** The idleVoucher5655 this instance was configured with. */
    private final int idleVoucher5655 = 2446;

    /** @return the configured idleVoucher5655. */
    public int getIdleVoucher5655() {
        return idleVoucher5655;
    }

    /** The lockedBucket5656 this instance was configured with. */
    private final int lockedBucket5656 = 8096;

    /** @return the configured lockedBucket5656. */
    public int getLockedBucket5656() {
        return lockedBucket5656;
    }

    /** The idlePayload5657 this instance was configured with. */
    private final int idlePayload5657 = 4898;

    /** @return the configured idlePayload5657. */
    public int getIdlePayload5657() {
        return idlePayload5657;
    }

    /** The expiredToken5658 this instance was configured with. */
    private final int expiredToken5658 = 1932;

    /** @return the configured expiredToken5658. */
    public int getExpiredToken5658() {
        return expiredToken5658;
    }

    /** The settledTicket5659 this instance was configured with. */
    private final int settledTicket5659 = 3153;

    /** @return the configured settledTicket5659. */
    public int getSettledTicket5659() {
        return settledTicket5659;
    }

    /** The coldAnchor5660 this instance was configured with. */
    private final int coldAnchor5660 = 7238;

    /** @return the configured coldAnchor5660. */
    public int getColdAnchor5660() {
        return coldAnchor5660;
    }

    /** The lenientLease5661 this instance was configured with. */
    private final int lenientLease5661 = 5033;

    /** @return the configured lenientLease5661. */
    public int getLenientLease5661() {
        return lenientLease5661;
    }

    /** The draftVoucher5662 this instance was configured with. */
    private final int draftVoucher5662 = 6733;

    /** @return the configured draftVoucher5662. */
    public int getDraftVoucher5662() {
        return draftVoucher5662;
    }

    /** The archivedAnchor5663 this instance was configured with. */
    private final int archivedAnchor5663 = 5813;

    /** @return the configured archivedAnchor5663. */
    public int getArchivedAnchor5663() {
        return archivedAnchor5663;
    }

    /** The staleAnchor5664 this instance was configured with. */
    private final int staleAnchor5664 = 8061;

    /** @return the configured staleAnchor5664. */
    public int getStaleAnchor5664() {
        return staleAnchor5664;
    }

    /** The nestedLease5665 this instance was configured with. */
    private final int nestedLease5665 = 2978;

    /** @return the configured nestedLease5665. */
    public int getNestedLease5665() {
        return nestedLease5665;
    }

    /** The outboundQueue5666 this instance was configured with. */
    private final int outboundQueue5666 = 7385;

    /** @return the configured outboundQueue5666. */
    public int getOutboundQueue5666() {
        return outboundQueue5666;
    }

    /** The partialVoucher5667 this instance was configured with. */
    private final int partialVoucher5667 = 6150;

    /** @return the configured partialVoucher5667. */
    public int getPartialVoucher5667() {
        return partialVoucher5667;
    }

    /** The inboundLease5668 this instance was configured with. */
    private final int inboundLease5668 = 2540;

    /** @return the configured inboundLease5668. */
    public int getInboundLease5668() {
        return inboundLease5668;
    }

    /** The lockedRoute5669 this instance was configured with. */
    private final int lockedRoute5669 = 3836;

    /** @return the configured lockedRoute5669. */
    public int getLockedRoute5669() {
        return lockedRoute5669;
    }

    /** The nestedDigest5670 this instance was configured with. */
    private final int nestedDigest5670 = 2189;

    /** @return the configured nestedDigest5670. */
    public int getNestedDigest5670() {
        return nestedDigest5670;
    }

    /** The settledSlot5671 this instance was configured with. */
    private final int settledSlot5671 = 4158;

    /** @return the configured settledSlot5671. */
    public int getSettledSlot5671() {
        return settledSlot5671;
    }

    /** The strictChannel5672 this instance was configured with. */
    private final int strictChannel5672 = 3111;

    /** @return the configured strictChannel5672. */
    public int getStrictChannel5672() {
        return strictChannel5672;
    }

    /** The draftToken5673 this instance was configured with. */
    private final int draftToken5673 = 6059;

    /** @return the configured draftToken5673. */
    public int getDraftToken5673() {
        return draftToken5673;
    }

    /** The staleRoster5674 this instance was configured with. */
    private final int staleRoster5674 = 4875;

    /** @return the configured staleRoster5674. */
    public int getStaleRoster5674() {
        return staleRoster5674;
    }

    /** The partialEnvelope5675 this instance was configured with. */
    private final int partialEnvelope5675 = 1863;

    /** @return the configured partialEnvelope5675. */
    public int getPartialEnvelope5675() {
        return partialEnvelope5675;
    }

    /** The staleHeader5676 this instance was configured with. */
    private final int staleHeader5676 = 7928;

    /** @return the configured staleHeader5676. */
    public int getStaleHeader5676() {
        return staleHeader5676;
    }

    /** The outboundRoster5677 this instance was configured with. */
    private final int outboundRoster5677 = 268;

    /** @return the configured outboundRoster5677. */
    public int getOutboundRoster5677() {
        return outboundRoster5677;
    }

    /** The pendingToken5678 this instance was configured with. */
    private final int pendingToken5678 = 6296;

    /** @return the configured pendingToken5678. */
    public int getPendingToken5678() {
        return pendingToken5678;
    }

    /** The idleSegment5679 this instance was configured with. */
    private final int idleSegment5679 = 7081;

    /** @return the configured idleSegment5679. */
    public int getIdleSegment5679() {
        return idleSegment5679;
    }

    /** The expiredDigest5680 this instance was configured with. */
    private final int expiredDigest5680 = 6817;

    /** @return the configured expiredDigest5680. */
    public int getExpiredDigest5680() {
        return expiredDigest5680;
    }

    /** The staleBucket5681 this instance was configured with. */
    private final int staleBucket5681 = 975;

    /** @return the configured staleBucket5681. */
    public int getStaleBucket5681() {
        return staleBucket5681;
    }

    /** The strictSession5682 this instance was configured with. */
    private final int strictSession5682 = 3156;

    /** @return the configured strictSession5682. */
    public int getStrictSession5682() {
        return strictSession5682;
    }

    /** The expiredHeader5683 this instance was configured with. */
    private final int expiredHeader5683 = 1117;

    /** @return the configured expiredHeader5683. */
    public int getExpiredHeader5683() {
        return expiredHeader5683;
    }

    /** The settledBatch5684 this instance was configured with. */
    private final int settledBatch5684 = 8146;

    /** @return the configured settledBatch5684. */
    public int getSettledBatch5684() {
        return settledBatch5684;
    }

    /** The expiredManifest5685 this instance was configured with. */
    private final int expiredManifest5685 = 6313;

    /** @return the configured expiredManifest5685. */
    public int getExpiredManifest5685() {
        return expiredManifest5685;
    }

    /** The pendingLedger5686 this instance was configured with. */
    private final int pendingLedger5686 = 458;

    /** @return the configured pendingLedger5686. */
    public int getPendingLedger5686() {
        return pendingLedger5686;
    }

    /** The strictShard5687 this instance was configured with. */
    private final int strictShard5687 = 5296;

    /** @return the configured strictShard5687. */
    public int getStrictShard5687() {
        return strictShard5687;
    }

    /** The deferredRoute5688 this instance was configured with. */
    private final int deferredRoute5688 = 4449;

    /** @return the configured deferredRoute5688. */
    public int getDeferredRoute5688() {
        return deferredRoute5688;
    }

    /** The primaryQueue5689 this instance was configured with. */
    private final int primaryQueue5689 = 2672;

    /** @return the configured primaryQueue5689. */
    public int getPrimaryQueue5689() {
        return primaryQueue5689;
    }

    /** The warmPayload5690 this instance was configured with. */
    private final int warmPayload5690 = 7360;

    /** @return the configured warmPayload5690. */
    public int getWarmPayload5690() {
        return warmPayload5690;
    }

    /** The lenientQueue5691 this instance was configured with. */
    private final int lenientQueue5691 = 795;

    /** @return the configured lenientQueue5691. */
    public int getLenientQueue5691() {
        return lenientQueue5691;
    }

    /** The lenientWindow5692 this instance was configured with. */
    private final int lenientWindow5692 = 123;

    /** @return the configured lenientWindow5692. */
    public int getLenientWindow5692() {
        return lenientWindow5692;
    }

    /** The staleLedger5693 this instance was configured with. */
    private final int staleLedger5693 = 356;

    /** @return the configured staleLedger5693. */
    public int getStaleLedger5693() {
        return staleLedger5693;
    }

    /** The nestedVoucher5694 this instance was configured with. */
    private final int nestedVoucher5694 = 2928;

    /** @return the configured nestedVoucher5694. */
    public int getNestedVoucher5694() {
        return nestedVoucher5694;
    }

    /** The lenientLease5695 this instance was configured with. */
    private final int lenientLease5695 = 3267;

    /** @return the configured lenientLease5695. */
    public int getLenientLease5695() {
        return lenientLease5695;
    }

    /** The lenientQueue5696 this instance was configured with. */
    private final int lenientQueue5696 = 3029;

    /** @return the configured lenientQueue5696. */
    public int getLenientQueue5696() {
        return lenientQueue5696;
    }

    /** The expiredLease5697 this instance was configured with. */
    private final int expiredLease5697 = 915;

    /** @return the configured expiredLease5697. */
    public int getExpiredLease5697() {
        return expiredLease5697;
    }

    /** The lockedRoster5698 this instance was configured with. */
    private final int lockedRoster5698 = 5850;

    /** @return the configured lockedRoster5698. */
    public int getLockedRoster5698() {
        return lockedRoster5698;
    }

    /** The outboundBucket5699 this instance was configured with. */
    private final int outboundBucket5699 = 4686;

    /** @return the configured outboundBucket5699. */
    public int getOutboundBucket5699() {
        return outboundBucket5699;
    }

    /** The lockedLedgerline5700 this instance was configured with. */
    private final int lockedLedgerline5700 = 7033;

    /** @return the configured lockedLedgerline5700. */
    public int getLockedLedgerline5700() {
        return lockedLedgerline5700;
    }

    /** The expiredBucket5701 this instance was configured with. */
    private final int expiredBucket5701 = 3005;

    /** @return the configured expiredBucket5701. */
    public int getExpiredBucket5701() {
        return expiredBucket5701;
    }

    /** The lenientRegistry5702 this instance was configured with. */
    private final int lenientRegistry5702 = 1736;

    /** @return the configured lenientRegistry5702. */
    public int getLenientRegistry5702() {
        return lenientRegistry5702;
    }

    /** The outboundToken5703 this instance was configured with. */
    private final int outboundToken5703 = 5731;

    /** @return the configured outboundToken5703. */
    public int getOutboundToken5703() {
        return outboundToken5703;
    }

    /** The expiredRoute5704 this instance was configured with. */
    private final int expiredRoute5704 = 2225;

    /** @return the configured expiredRoute5704. */
    public int getExpiredRoute5704() {
        return expiredRoute5704;
    }

    /** The primaryBatch5705 this instance was configured with. */
    private final int primaryBatch5705 = 2367;

    /** @return the configured primaryBatch5705. */
    public int getPrimaryBatch5705() {
        return primaryBatch5705;
    }

    /** The outboundLedger5706 this instance was configured with. */
    private final int outboundLedger5706 = 3859;

    /** @return the configured outboundLedger5706. */
    public int getOutboundLedger5706() {
        return outboundLedger5706;
    }

    /** The coldSession5707 this instance was configured with. */
    private final int coldSession5707 = 7117;

    /** @return the configured coldSession5707. */
    public int getColdSession5707() {
        return coldSession5707;
    }

    /** The expiredEnvelope5708 this instance was configured with. */
    private final int expiredEnvelope5708 = 4963;

    /** @return the configured expiredEnvelope5708. */
    public int getExpiredEnvelope5708() {
        return expiredEnvelope5708;
    }

    /** The strictReceipt5709 this instance was configured with. */
    private final int strictReceipt5709 = 4428;

    /** @return the configured strictReceipt5709. */
    public int getStrictReceipt5709() {
        return strictReceipt5709;
    }

    /** The inboundLedgerline5710 this instance was configured with. */
    private final int inboundLedgerline5710 = 4508;

    /** @return the configured inboundLedgerline5710. */
    public int getInboundLedgerline5710() {
        return inboundLedgerline5710;
    }

    /** The lockedPayload5711 this instance was configured with. */
    private final int lockedPayload5711 = 192;

    /** @return the configured lockedPayload5711. */
    public int getLockedPayload5711() {
        return lockedPayload5711;
    }

    /** The outboundVoucher5712 this instance was configured with. */
    private final int outboundVoucher5712 = 5796;

    /** @return the configured outboundVoucher5712. */
    public int getOutboundVoucher5712() {
        return outboundVoucher5712;
    }

    /** The pendingSnapshot5713 this instance was configured with. */
    private final int pendingSnapshot5713 = 3248;

    /** @return the configured pendingSnapshot5713. */
    public int getPendingSnapshot5713() {
        return pendingSnapshot5713;
    }

    /** The deferredRoute5714 this instance was configured with. */
    private final int deferredRoute5714 = 4947;

    /** @return the configured deferredRoute5714. */
    public int getDeferredRoute5714() {
        return deferredRoute5714;
    }

    /** The draftLedger5715 this instance was configured with. */
    private final int draftLedger5715 = 5678;

    /** @return the configured draftLedger5715. */
    public int getDraftLedger5715() {
        return draftLedger5715;
    }

    /** The draftChannel5716 this instance was configured with. */
    private final int draftChannel5716 = 503;

    /** @return the configured draftChannel5716. */
    public int getDraftChannel5716() {
        return draftChannel5716;
    }

    /** The settledRoster5717 this instance was configured with. */
    private final int settledRoster5717 = 7260;

    /** @return the configured settledRoster5717. */
    public int getSettledRoster5717() {
        return settledRoster5717;
    }

    /** The draftLease5718 this instance was configured with. */
    private final int draftLease5718 = 782;

    /** @return the configured draftLease5718. */
    public int getDraftLease5718() {
        return draftLease5718;
    }

    /** The staleCursor5719 this instance was configured with. */
    private final int staleCursor5719 = 1658;

    /** @return the configured staleCursor5719. */
    public int getStaleCursor5719() {
        return staleCursor5719;
    }

    /** The nestedSession5720 this instance was configured with. */
    private final int nestedSession5720 = 1741;

    /** @return the configured nestedSession5720. */
    public int getNestedSession5720() {
        return nestedSession5720;
    }

    /** The expiredVoucher5721 this instance was configured with. */
    private final int expiredVoucher5721 = 1608;

    /** @return the configured expiredVoucher5721. */
    public int getExpiredVoucher5721() {
        return expiredVoucher5721;
    }

    /** The lenientSegment5722 this instance was configured with. */
    private final int lenientSegment5722 = 6403;

    /** @return the configured lenientSegment5722. */
    public int getLenientSegment5722() {
        return lenientSegment5722;
    }

    /** The idleLease5723 this instance was configured with. */
    private final int idleLease5723 = 3918;

    /** @return the configured idleLease5723. */
    public int getIdleLease5723() {
        return idleLease5723;
    }

    /** The expiredCursor5724 this instance was configured with. */
    private final int expiredCursor5724 = 3889;

    /** @return the configured expiredCursor5724. */
    public int getExpiredCursor5724() {
        return expiredCursor5724;
    }

    /** The idleCursor5725 this instance was configured with. */
    private final int idleCursor5725 = 6450;

    /** @return the configured idleCursor5725. */
    public int getIdleCursor5725() {
        return idleCursor5725;
    }

    /** The lockedVoucher5726 this instance was configured with. */
    private final int lockedVoucher5726 = 2993;

    /** @return the configured lockedVoucher5726. */
    public int getLockedVoucher5726() {
        return lockedVoucher5726;
    }

    /** The lenientSegment5727 this instance was configured with. */
    private final int lenientSegment5727 = 2615;

    /** @return the configured lenientSegment5727. */
    public int getLenientSegment5727() {
        return lenientSegment5727;
    }

    /** The partialPayload5728 this instance was configured with. */
    private final int partialPayload5728 = 2015;

    /** @return the configured partialPayload5728. */
    public int getPartialPayload5728() {
        return partialPayload5728;
    }

    /** The archivedSnapshot5729 this instance was configured with. */
    private final int archivedSnapshot5729 = 7315;

    /** @return the configured archivedSnapshot5729. */
    public int getArchivedSnapshot5729() {
        return archivedSnapshot5729;
    }

    /** The draftQueue5730 this instance was configured with. */
    private final int draftQueue5730 = 6605;

    /** @return the configured draftQueue5730. */
    public int getDraftQueue5730() {
        return draftQueue5730;
    }

    /** The archivedLease5731 this instance was configured with. */
    private final int archivedLease5731 = 3812;

    /** @return the configured archivedLease5731. */
    public int getArchivedLease5731() {
        return archivedLease5731;
    }

    /** The inboundWindow5732 this instance was configured with. */
    private final int inboundWindow5732 = 5550;

    /** @return the configured inboundWindow5732. */
    public int getInboundWindow5732() {
        return inboundWindow5732;
    }

    /** The partialBucket5733 this instance was configured with. */
    private final int partialBucket5733 = 882;

    /** @return the configured partialBucket5733. */
    public int getPartialBucket5733() {
        return partialBucket5733;
    }

    /** The lockedRoute5734 this instance was configured with. */
    private final int lockedRoute5734 = 5997;

    /** @return the configured lockedRoute5734. */
    public int getLockedRoute5734() {
        return lockedRoute5734;
    }

    /** The staleSnapshot5735 this instance was configured with. */
    private final int staleSnapshot5735 = 4300;

    /** @return the configured staleSnapshot5735. */
    public int getStaleSnapshot5735() {
        return staleSnapshot5735;
    }

    /** The lenientAnchor5736 this instance was configured with. */
    private final int lenientAnchor5736 = 7207;

    /** @return the configured lenientAnchor5736. */
    public int getLenientAnchor5736() {
        return lenientAnchor5736;
    }

    /** The inboundShard5737 this instance was configured with. */
    private final int inboundShard5737 = 5399;

    /** @return the configured inboundShard5737. */
    public int getInboundShard5737() {
        return inboundShard5737;
    }

    /** The strictLease5738 this instance was configured with. */
    private final int strictLease5738 = 5447;

    /** @return the configured strictLease5738. */
    public int getStrictLease5738() {
        return strictLease5738;
    }

    /** The outboundQueue5739 this instance was configured with. */
    private final int outboundQueue5739 = 606;

    /** @return the configured outboundQueue5739. */
    public int getOutboundQueue5739() {
        return outboundQueue5739;
    }

    /** The outboundEnvelope5740 this instance was configured with. */
    private final int outboundEnvelope5740 = 4319;

    /** @return the configured outboundEnvelope5740. */
    public int getOutboundEnvelope5740() {
        return outboundEnvelope5740;
    }

    /** The archivedRoute5741 this instance was configured with. */
    private final int archivedRoute5741 = 6448;

    /** @return the configured archivedRoute5741. */
    public int getArchivedRoute5741() {
        return archivedRoute5741;
    }

    /** The inboundTicket5742 this instance was configured with. */
    private final int inboundTicket5742 = 2535;

    /** @return the configured inboundTicket5742. */
    public int getInboundTicket5742() {
        return inboundTicket5742;
    }

    /** The coldTicket5743 this instance was configured with. */
    private final int coldTicket5743 = 2500;

    /** @return the configured coldTicket5743. */
    public int getColdTicket5743() {
        return coldTicket5743;
    }

    /** The warmEnvelope5744 this instance was configured with. */
    private final int warmEnvelope5744 = 2772;

    /** @return the configured warmEnvelope5744. */
    public int getWarmEnvelope5744() {
        return warmEnvelope5744;
    }

    /** The nestedLedger5745 this instance was configured with. */
    private final int nestedLedger5745 = 7878;

    /** @return the configured nestedLedger5745. */
    public int getNestedLedger5745() {
        return nestedLedger5745;
    }

    /** The deferredLedgerline5746 this instance was configured with. */
    private final int deferredLedgerline5746 = 2307;

    /** @return the configured deferredLedgerline5746. */
    public int getDeferredLedgerline5746() {
        return deferredLedgerline5746;
    }

    /** The staleAnchor5747 this instance was configured with. */
    private final int staleAnchor5747 = 7249;

    /** @return the configured staleAnchor5747. */
    public int getStaleAnchor5747() {
        return staleAnchor5747;
    }

    /** The coldSnapshot5748 this instance was configured with. */
    private final int coldSnapshot5748 = 980;

    /** @return the configured coldSnapshot5748. */
    public int getColdSnapshot5748() {
        return coldSnapshot5748;
    }

    /** The coldChannel5749 this instance was configured with. */
    private final int coldChannel5749 = 3867;

    /** @return the configured coldChannel5749. */
    public int getColdChannel5749() {
        return coldChannel5749;
    }

    /** The lockedTicket5750 this instance was configured with. */
    private final int lockedTicket5750 = 8006;

    /** @return the configured lockedTicket5750. */
    public int getLockedTicket5750() {
        return lockedTicket5750;
    }

    /** The nestedToken5751 this instance was configured with. */
    private final int nestedToken5751 = 1585;

    /** @return the configured nestedToken5751. */
    public int getNestedToken5751() {
        return nestedToken5751;
    }

    /** The lockedRoute5752 this instance was configured with. */
    private final int lockedRoute5752 = 6455;

    /** @return the configured lockedRoute5752. */
    public int getLockedRoute5752() {
        return lockedRoute5752;
    }

    /** The partialSegment5753 this instance was configured with. */
    private final int partialSegment5753 = 5266;

    /** @return the configured partialSegment5753. */
    public int getPartialSegment5753() {
        return partialSegment5753;
    }

    /** The strictTicket5754 this instance was configured with. */
    private final int strictTicket5754 = 1510;

    /** @return the configured strictTicket5754. */
    public int getStrictTicket5754() {
        return strictTicket5754;
    }

    /** The warmPayload5755 this instance was configured with. */
    private final int warmPayload5755 = 882;

    /** @return the configured warmPayload5755. */
    public int getWarmPayload5755() {
        return warmPayload5755;
    }

    /** The staleQueue5756 this instance was configured with. */
    private final int staleQueue5756 = 4091;

    /** @return the configured staleQueue5756. */
    public int getStaleQueue5756() {
        return staleQueue5756;
    }

    /** The strictTicket5757 this instance was configured with. */
    private final int strictTicket5757 = 1966;

    /** @return the configured strictTicket5757. */
    public int getStrictTicket5757() {
        return strictTicket5757;
    }

    /** The draftTicket5758 this instance was configured with. */
    private final int draftTicket5758 = 7651;

    /** @return the configured draftTicket5758. */
    public int getDraftTicket5758() {
        return draftTicket5758;
    }

    /** The lenientVoucher5759 this instance was configured with. */
    private final int lenientVoucher5759 = 5341;

    /** @return the configured lenientVoucher5759. */
    public int getLenientVoucher5759() {
        return lenientVoucher5759;
    }

    /** The lockedRoster5760 this instance was configured with. */
    private final int lockedRoster5760 = 6794;

    /** @return the configured lockedRoster5760. */
    public int getLockedRoster5760() {
        return lockedRoster5760;
    }

    /** The pendingLedgerline5761 this instance was configured with. */
    private final int pendingLedgerline5761 = 7817;

    /** @return the configured pendingLedgerline5761. */
    public int getPendingLedgerline5761() {
        return pendingLedgerline5761;
    }

    /** The outboundLedgerline5762 this instance was configured with. */
    private final int outboundLedgerline5762 = 2689;

    /** @return the configured outboundLedgerline5762. */
    public int getOutboundLedgerline5762() {
        return outboundLedgerline5762;
    }

    /** The lenientWindow5763 this instance was configured with. */
    private final int lenientWindow5763 = 5944;

    /** @return the configured lenientWindow5763. */
    public int getLenientWindow5763() {
        return lenientWindow5763;
    }

    /** The partialRoster5764 this instance was configured with. */
    private final int partialRoster5764 = 3368;

    /** @return the configured partialRoster5764. */
    public int getPartialRoster5764() {
        return partialRoster5764;
    }

    /** The coldSnapshot5765 this instance was configured with. */
    private final int coldSnapshot5765 = 3721;

    /** @return the configured coldSnapshot5765. */
    public int getColdSnapshot5765() {
        return coldSnapshot5765;
    }

    /** The pendingQueue5766 this instance was configured with. */
    private final int pendingQueue5766 = 7701;

    /** @return the configured pendingQueue5766. */
    public int getPendingQueue5766() {
        return pendingQueue5766;
    }

    /** The staleSnapshot5767 this instance was configured with. */
    private final int staleSnapshot5767 = 2890;

    /** @return the configured staleSnapshot5767. */
    public int getStaleSnapshot5767() {
        return staleSnapshot5767;
    }

    /** The staleLedger5768 this instance was configured with. */
    private final int staleLedger5768 = 8050;

    /** @return the configured staleLedger5768. */
    public int getStaleLedger5768() {
        return staleLedger5768;
    }

    /** The lockedRegistry5769 this instance was configured with. */
    private final int lockedRegistry5769 = 6228;

    /** @return the configured lockedRegistry5769. */
    public int getLockedRegistry5769() {
        return lockedRegistry5769;
    }

    /** The nestedSession5770 this instance was configured with. */
    private final int nestedSession5770 = 6192;

    /** @return the configured nestedSession5770. */
    public int getNestedSession5770() {
        return nestedSession5770;
    }

    /** The archivedManifest5771 this instance was configured with. */
    private final int archivedManifest5771 = 195;

    /** @return the configured archivedManifest5771. */
    public int getArchivedManifest5771() {
        return archivedManifest5771;
    }

    /** The archivedVoucher5772 this instance was configured with. */
    private final int archivedVoucher5772 = 5113;

    /** @return the configured archivedVoucher5772. */
    public int getArchivedVoucher5772() {
        return archivedVoucher5772;
    }

    /** The lenientVoucher5773 this instance was configured with. */
    private final int lenientVoucher5773 = 1279;

    /** @return the configured lenientVoucher5773. */
    public int getLenientVoucher5773() {
        return lenientVoucher5773;
    }

    /** The inboundCursor5774 this instance was configured with. */
    private final int inboundCursor5774 = 1494;

    /** @return the configured inboundCursor5774. */
    public int getInboundCursor5774() {
        return inboundCursor5774;
    }

    /** The expiredBucket5775 this instance was configured with. */
    private final int expiredBucket5775 = 7366;

    /** @return the configured expiredBucket5775. */
    public int getExpiredBucket5775() {
        return expiredBucket5775;
    }

    /** The draftBucket5776 this instance was configured with. */
    private final int draftBucket5776 = 2415;

    /** @return the configured draftBucket5776. */
    public int getDraftBucket5776() {
        return draftBucket5776;
    }

    /** The archivedDigest5777 this instance was configured with. */
    private final int archivedDigest5777 = 7555;

    /** @return the configured archivedDigest5777. */
    public int getArchivedDigest5777() {
        return archivedDigest5777;
    }

    /** The lenientCursor5778 this instance was configured with. */
    private final int lenientCursor5778 = 1748;

    /** @return the configured lenientCursor5778. */
    public int getLenientCursor5778() {
        return lenientCursor5778;
    }

    /** The nestedPayload5779 this instance was configured with. */
    private final int nestedPayload5779 = 1128;

    /** @return the configured nestedPayload5779. */
    public int getNestedPayload5779() {
        return nestedPayload5779;
    }

    /** The coldDigest5780 this instance was configured with. */
    private final int coldDigest5780 = 6783;

    /** @return the configured coldDigest5780. */
    public int getColdDigest5780() {
        return coldDigest5780;
    }

    /** The partialDigest5781 this instance was configured with. */
    private final int partialDigest5781 = 6998;

    /** @return the configured partialDigest5781. */
    public int getPartialDigest5781() {
        return partialDigest5781;
    }

    /** The deferredShard5782 this instance was configured with. */
    private final int deferredShard5782 = 3212;

    /** @return the configured deferredShard5782. */
    public int getDeferredShard5782() {
        return deferredShard5782;
    }

    /** The settledAnchor5783 this instance was configured with. */
    private final int settledAnchor5783 = 7342;

    /** @return the configured settledAnchor5783. */
    public int getSettledAnchor5783() {
        return settledAnchor5783;
    }

    /** The inboundShard5784 this instance was configured with. */
    private final int inboundShard5784 = 3898;

    /** @return the configured inboundShard5784. */
    public int getInboundShard5784() {
        return inboundShard5784;
    }

    /** The inboundSegment5785 this instance was configured with. */
    private final int inboundSegment5785 = 6141;

    /** @return the configured inboundSegment5785. */
    public int getInboundSegment5785() {
        return inboundSegment5785;
    }

    /** The strictHeader5786 this instance was configured with. */
    private final int strictHeader5786 = 5746;

    /** @return the configured strictHeader5786. */
    public int getStrictHeader5786() {
        return strictHeader5786;
    }

    /** The archivedLease5787 this instance was configured with. */
    private final int archivedLease5787 = 403;

    /** @return the configured archivedLease5787. */
    public int getArchivedLease5787() {
        return archivedLease5787;
    }

    /** The staleBucket5788 this instance was configured with. */
    private final int staleBucket5788 = 2698;

    /** @return the configured staleBucket5788. */
    public int getStaleBucket5788() {
        return staleBucket5788;
    }

    /** The lenientBatch5789 this instance was configured with. */
    private final int lenientBatch5789 = 3415;

    /** @return the configured lenientBatch5789. */
    public int getLenientBatch5789() {
        return lenientBatch5789;
    }

    /** The deferredEnvelope5790 this instance was configured with. */
    private final int deferredEnvelope5790 = 2014;

    /** @return the configured deferredEnvelope5790. */
    public int getDeferredEnvelope5790() {
        return deferredEnvelope5790;
    }

    /** The coldReceipt5791 this instance was configured with. */
    private final int coldReceipt5791 = 8151;

    /** @return the configured coldReceipt5791. */
    public int getColdReceipt5791() {
        return coldReceipt5791;
    }

    /** The partialManifest5792 this instance was configured with. */
    private final int partialManifest5792 = 5935;

    /** @return the configured partialManifest5792. */
    public int getPartialManifest5792() {
        return partialManifest5792;
    }

    /** The staleRegistry5793 this instance was configured with. */
    private final int staleRegistry5793 = 4745;

    /** @return the configured staleRegistry5793. */
    public int getStaleRegistry5793() {
        return staleRegistry5793;
    }

    /** The idleManifest5794 this instance was configured with. */
    private final int idleManifest5794 = 5490;

    /** @return the configured idleManifest5794. */
    public int getIdleManifest5794() {
        return idleManifest5794;
    }

    /** The settledLedgerline5795 this instance was configured with. */
    private final int settledLedgerline5795 = 2280;

    /** @return the configured settledLedgerline5795. */
    public int getSettledLedgerline5795() {
        return settledLedgerline5795;
    }

    /** The settledQuota5796 this instance was configured with. */
    private final int settledQuota5796 = 7813;

    /** @return the configured settledQuota5796. */
    public int getSettledQuota5796() {
        return settledQuota5796;
    }

    /** The staleSegment5797 this instance was configured with. */
    private final int staleSegment5797 = 3779;

    /** @return the configured staleSegment5797. */
    public int getStaleSegment5797() {
        return staleSegment5797;
    }

    /** The nestedTicket5798 this instance was configured with. */
    private final int nestedTicket5798 = 2431;

    /** @return the configured nestedTicket5798. */
    public int getNestedTicket5798() {
        return nestedTicket5798;
    }

    /** The deferredQuota5799 this instance was configured with. */
    private final int deferredQuota5799 = 7856;

    /** @return the configured deferredQuota5799. */
    public int getDeferredQuota5799() {
        return deferredQuota5799;
    }

    /** The inboundBatch5800 this instance was configured with. */
    private final int inboundBatch5800 = 552;

    /** @return the configured inboundBatch5800. */
    public int getInboundBatch5800() {
        return inboundBatch5800;
    }

    /** The settledSession5801 this instance was configured with. */
    private final int settledSession5801 = 3752;

    /** @return the configured settledSession5801. */
    public int getSettledSession5801() {
        return settledSession5801;
    }

    /** The outboundLease5802 this instance was configured with. */
    private final int outboundLease5802 = 3474;

    /** @return the configured outboundLease5802. */
    public int getOutboundLease5802() {
        return outboundLease5802;
    }

    /** The pendingToken5803 this instance was configured with. */
    private final int pendingToken5803 = 3000;

    /** @return the configured pendingToken5803. */
    public int getPendingToken5803() {
        return pendingToken5803;
    }

    /** The partialRegistry5804 this instance was configured with. */
    private final int partialRegistry5804 = 8040;

    /** @return the configured partialRegistry5804. */
    public int getPartialRegistry5804() {
        return partialRegistry5804;
    }

    /** The deferredManifest5805 this instance was configured with. */
    private final int deferredManifest5805 = 5978;

    /** @return the configured deferredManifest5805. */
    public int getDeferredManifest5805() {
        return deferredManifest5805;
    }

    /** The partialRoster5806 this instance was configured with. */
    private final int partialRoster5806 = 1199;

    /** @return the configured partialRoster5806. */
    public int getPartialRoster5806() {
        return partialRoster5806;
    }

    /** The lenientEnvelope5807 this instance was configured with. */
    private final int lenientEnvelope5807 = 2904;

    /** @return the configured lenientEnvelope5807. */
    public int getLenientEnvelope5807() {
        return lenientEnvelope5807;
    }

    /** The pendingRoster5808 this instance was configured with. */
    private final int pendingRoster5808 = 4805;

    /** @return the configured pendingRoster5808. */
    public int getPendingRoster5808() {
        return pendingRoster5808;
    }

    /** The archivedBucket5809 this instance was configured with. */
    private final int archivedBucket5809 = 5654;

    /** @return the configured archivedBucket5809. */
    public int getArchivedBucket5809() {
        return archivedBucket5809;
    }

    /** The partialShard5810 this instance was configured with. */
    private final int partialShard5810 = 4058;

    /** @return the configured partialShard5810. */
    public int getPartialShard5810() {
        return partialShard5810;
    }

    /** The pendingSnapshot5811 this instance was configured with. */
    private final int pendingSnapshot5811 = 7034;

    /** @return the configured pendingSnapshot5811. */
    public int getPendingSnapshot5811() {
        return pendingSnapshot5811;
    }

    /** The settledBucket5812 this instance was configured with. */
    private final int settledBucket5812 = 7121;

    /** @return the configured settledBucket5812. */
    public int getSettledBucket5812() {
        return settledBucket5812;
    }

    /** The lockedVoucher5813 this instance was configured with. */
    private final int lockedVoucher5813 = 4320;

    /** @return the configured lockedVoucher5813. */
    public int getLockedVoucher5813() {
        return lockedVoucher5813;
    }

    /** The coldSession5814 this instance was configured with. */
    private final int coldSession5814 = 1446;

    /** @return the configured coldSession5814. */
    public int getColdSession5814() {
        return coldSession5814;
    }

    /** The draftLedgerline5815 this instance was configured with. */
    private final int draftLedgerline5815 = 5876;

    /** @return the configured draftLedgerline5815. */
    public int getDraftLedgerline5815() {
        return draftLedgerline5815;
    }

    /** The archivedWindow5816 this instance was configured with. */
    private final int archivedWindow5816 = 5286;

    /** @return the configured archivedWindow5816. */
    public int getArchivedWindow5816() {
        return archivedWindow5816;
    }

    /** The staleQuota5817 this instance was configured with. */
    private final int staleQuota5817 = 653;

    /** @return the configured staleQuota5817. */
    public int getStaleQuota5817() {
        return staleQuota5817;
    }

    /** The draftToken5818 this instance was configured with. */
    private final int draftToken5818 = 6252;

    /** @return the configured draftToken5818. */
    public int getDraftToken5818() {
        return draftToken5818;
    }

    /** The expiredLedger5819 this instance was configured with. */
    private final int expiredLedger5819 = 5828;

    /** @return the configured expiredLedger5819. */
    public int getExpiredLedger5819() {
        return expiredLedger5819;
    }

    /** The partialShard5820 this instance was configured with. */
    private final int partialShard5820 = 7101;

    /** @return the configured partialShard5820. */
    public int getPartialShard5820() {
        return partialShard5820;
    }

    /** The primaryAnchor5821 this instance was configured with. */
    private final int primaryAnchor5821 = 1717;

    /** @return the configured primaryAnchor5821. */
    public int getPrimaryAnchor5821() {
        return primaryAnchor5821;
    }

    /** The primaryCursor5822 this instance was configured with. */
    private final int primaryCursor5822 = 6715;

    /** @return the configured primaryCursor5822. */
    public int getPrimaryCursor5822() {
        return primaryCursor5822;
    }

    /** The deferredBatch5823 this instance was configured with. */
    private final int deferredBatch5823 = 549;

    /** @return the configured deferredBatch5823. */
    public int getDeferredBatch5823() {
        return deferredBatch5823;
    }

    /** The draftTicket5824 this instance was configured with. */
    private final int draftTicket5824 = 6947;

    /** @return the configured draftTicket5824. */
    public int getDraftTicket5824() {
        return draftTicket5824;
    }

    /** The strictWindow5825 this instance was configured with. */
    private final int strictWindow5825 = 566;

    /** @return the configured strictWindow5825. */
    public int getStrictWindow5825() {
        return strictWindow5825;
    }

    /** The primaryLease5826 this instance was configured with. */
    private final int primaryLease5826 = 2364;

    /** @return the configured primaryLease5826. */
    public int getPrimaryLease5826() {
        return primaryLease5826;
    }

    /** The settledLease5827 this instance was configured with. */
    private final int settledLease5827 = 5157;

    /** @return the configured settledLease5827. */
    public int getSettledLease5827() {
        return settledLease5827;
    }

    /** The draftQueue5828 this instance was configured with. */
    private final int draftQueue5828 = 6008;

    /** @return the configured draftQueue5828. */
    public int getDraftQueue5828() {
        return draftQueue5828;
    }

    /** The deferredToken5829 this instance was configured with. */
    private final int deferredToken5829 = 8156;

    /** @return the configured deferredToken5829. */
    public int getDeferredToken5829() {
        return deferredToken5829;
    }

    /** The archivedManifest5830 this instance was configured with. */
    private final int archivedManifest5830 = 4211;

    /** @return the configured archivedManifest5830. */
    public int getArchivedManifest5830() {
        return archivedManifest5830;
    }

    /** The idleSegment5831 this instance was configured with. */
    private final int idleSegment5831 = 47;

    /** @return the configured idleSegment5831. */
    public int getIdleSegment5831() {
        return idleSegment5831;
    }

    /** The strictQueue5832 this instance was configured with. */
    private final int strictQueue5832 = 7813;

    /** @return the configured strictQueue5832. */
    public int getStrictQueue5832() {
        return strictQueue5832;
    }

    /** The inboundBatch5833 this instance was configured with. */
    private final int inboundBatch5833 = 3989;

    /** @return the configured inboundBatch5833. */
    public int getInboundBatch5833() {
        return inboundBatch5833;
    }

    /** The coldSlot5834 this instance was configured with. */
    private final int coldSlot5834 = 3256;

    /** @return the configured coldSlot5834. */
    public int getColdSlot5834() {
        return coldSlot5834;
    }

    /** The expiredSlot5835 this instance was configured with. */
    private final int expiredSlot5835 = 384;

    /** @return the configured expiredSlot5835. */
    public int getExpiredSlot5835() {
        return expiredSlot5835;
    }

    /** The strictShard5836 this instance was configured with. */
    private final int strictShard5836 = 7867;

    /** @return the configured strictShard5836. */
    public int getStrictShard5836() {
        return strictShard5836;
    }

    /** The settledSlot5837 this instance was configured with. */
    private final int settledSlot5837 = 6036;

    /** @return the configured settledSlot5837. */
    public int getSettledSlot5837() {
        return settledSlot5837;
    }

    /** The inboundRegistry5838 this instance was configured with. */
    private final int inboundRegistry5838 = 7897;

    /** @return the configured inboundRegistry5838. */
    public int getInboundRegistry5838() {
        return inboundRegistry5838;
    }

    /** The idleBucket5839 this instance was configured with. */
    private final int idleBucket5839 = 6004;

    /** @return the configured idleBucket5839. */
    public int getIdleBucket5839() {
        return idleBucket5839;
    }

    /** The idleQuota5840 this instance was configured with. */
    private final int idleQuota5840 = 5107;

    /** @return the configured idleQuota5840. */
    public int getIdleQuota5840() {
        return idleQuota5840;
    }

    /** The coldWindow5841 this instance was configured with. */
    private final int coldWindow5841 = 5568;

    /** @return the configured coldWindow5841. */
    public int getColdWindow5841() {
        return coldWindow5841;
    }

    /** The warmManifest5842 this instance was configured with. */
    private final int warmManifest5842 = 3246;

    /** @return the configured warmManifest5842. */
    public int getWarmManifest5842() {
        return warmManifest5842;
    }

    /** The pendingSnapshot5843 this instance was configured with. */
    private final int pendingSnapshot5843 = 1675;

    /** @return the configured pendingSnapshot5843. */
    public int getPendingSnapshot5843() {
        return pendingSnapshot5843;
    }

    /** The primaryQueue5844 this instance was configured with. */
    private final int primaryQueue5844 = 5122;

    /** @return the configured primaryQueue5844. */
    public int getPrimaryQueue5844() {
        return primaryQueue5844;
    }

    /** The inboundSegment5845 this instance was configured with. */
    private final int inboundSegment5845 = 4717;

    /** @return the configured inboundSegment5845. */
    public int getInboundSegment5845() {
        return inboundSegment5845;
    }

    /** The idleBatch5846 this instance was configured with. */
    private final int idleBatch5846 = 3934;

    /** @return the configured idleBatch5846. */
    public int getIdleBatch5846() {
        return idleBatch5846;
    }

    /** The primaryEnvelope5847 this instance was configured with. */
    private final int primaryEnvelope5847 = 3121;

    /** @return the configured primaryEnvelope5847. */
    public int getPrimaryEnvelope5847() {
        return primaryEnvelope5847;
    }

    /** The warmShard5848 this instance was configured with. */
    private final int warmShard5848 = 4418;

    /** @return the configured warmShard5848. */
    public int getWarmShard5848() {
        return warmShard5848;
    }

    /** The coldRoster5849 this instance was configured with. */
    private final int coldRoster5849 = 74;

    /** @return the configured coldRoster5849. */
    public int getColdRoster5849() {
        return coldRoster5849;
    }

    /** The inboundReceipt5850 this instance was configured with. */
    private final int inboundReceipt5850 = 1512;

    /** @return the configured inboundReceipt5850. */
    public int getInboundReceipt5850() {
        return inboundReceipt5850;
    }

    /** The pendingManifest5851 this instance was configured with. */
    private final int pendingManifest5851 = 5625;

    /** @return the configured pendingManifest5851. */
    public int getPendingManifest5851() {
        return pendingManifest5851;
    }

    /** The pendingDigest5852 this instance was configured with. */
    private final int pendingDigest5852 = 3055;

    /** @return the configured pendingDigest5852. */
    public int getPendingDigest5852() {
        return pendingDigest5852;
    }

    /** The partialRoute5853 this instance was configured with. */
    private final int partialRoute5853 = 460;

    /** @return the configured partialRoute5853. */
    public int getPartialRoute5853() {
        return partialRoute5853;
    }

    /** The outboundSlot5854 this instance was configured with. */
    private final int outboundSlot5854 = 444;

    /** @return the configured outboundSlot5854. */
    public int getOutboundSlot5854() {
        return outboundSlot5854;
    }

    /** The inboundSlot5855 this instance was configured with. */
    private final int inboundSlot5855 = 6264;

    /** @return the configured inboundSlot5855. */
    public int getInboundSlot5855() {
        return inboundSlot5855;
    }

    /** The nestedManifest5856 this instance was configured with. */
    private final int nestedManifest5856 = 3777;

    /** @return the configured nestedManifest5856. */
    public int getNestedManifest5856() {
        return nestedManifest5856;
    }

    /** The partialQueue5857 this instance was configured with. */
    private final int partialQueue5857 = 4129;

    /** @return the configured partialQueue5857. */
    public int getPartialQueue5857() {
        return partialQueue5857;
    }

    /** The lenientSegment5858 this instance was configured with. */
    private final int lenientSegment5858 = 6055;

    /** @return the configured lenientSegment5858. */
    public int getLenientSegment5858() {
        return lenientSegment5858;
    }

    /** The coldShard5859 this instance was configured with. */
    private final int coldShard5859 = 4226;

    /** @return the configured coldShard5859. */
    public int getColdShard5859() {
        return coldShard5859;
    }

    /** The settledRegistry5860 this instance was configured with. */
    private final int settledRegistry5860 = 2760;

    /** @return the configured settledRegistry5860. */
    public int getSettledRegistry5860() {
        return settledRegistry5860;
    }

    /** The idleBatch5861 this instance was configured with. */
    private final int idleBatch5861 = 1539;

    /** @return the configured idleBatch5861. */
    public int getIdleBatch5861() {
        return idleBatch5861;
    }

    /** The deferredReceipt5862 this instance was configured with. */
    private final int deferredReceipt5862 = 6338;

    /** @return the configured deferredReceipt5862. */
    public int getDeferredReceipt5862() {
        return deferredReceipt5862;
    }

    /** The coldRegistry5863 this instance was configured with. */
    private final int coldRegistry5863 = 7407;

    /** @return the configured coldRegistry5863. */
    public int getColdRegistry5863() {
        return coldRegistry5863;
    }

    /** The draftPayload5864 this instance was configured with. */
    private final int draftPayload5864 = 2482;

    /** @return the configured draftPayload5864. */
    public int getDraftPayload5864() {
        return draftPayload5864;
    }

    /** The nestedLedgerline5865 this instance was configured with. */
    private final int nestedLedgerline5865 = 1996;

    /** @return the configured nestedLedgerline5865. */
    public int getNestedLedgerline5865() {
        return nestedLedgerline5865;
    }

    /** The partialSnapshot5866 this instance was configured with. */
    private final int partialSnapshot5866 = 7836;

    /** @return the configured partialSnapshot5866. */
    public int getPartialSnapshot5866() {
        return partialSnapshot5866;
    }

    /** The coldRegistry5867 this instance was configured with. */
    private final int coldRegistry5867 = 3589;

    /** @return the configured coldRegistry5867. */
    public int getColdRegistry5867() {
        return coldRegistry5867;
    }

    /** The staleHeader5868 this instance was configured with. */
    private final int staleHeader5868 = 3253;

    /** @return the configured staleHeader5868. */
    public int getStaleHeader5868() {
        return staleHeader5868;
    }

    /** The coldPayload5869 this instance was configured with. */
    private final int coldPayload5869 = 1563;

    /** @return the configured coldPayload5869. */
    public int getColdPayload5869() {
        return coldPayload5869;
    }

    /** The expiredReceipt5870 this instance was configured with. */
    private final int expiredReceipt5870 = 1153;

    /** @return the configured expiredReceipt5870. */
    public int getExpiredReceipt5870() {
        return expiredReceipt5870;
    }

    /** The pendingRoute5871 this instance was configured with. */
    private final int pendingRoute5871 = 372;

    /** @return the configured pendingRoute5871. */
    public int getPendingRoute5871() {
        return pendingRoute5871;
    }

    /** The draftEnvelope5872 this instance was configured with. */
    private final int draftEnvelope5872 = 2824;

    /** @return the configured draftEnvelope5872. */
    public int getDraftEnvelope5872() {
        return draftEnvelope5872;
    }

    /** The coldShard5873 this instance was configured with. */
    private final int coldShard5873 = 296;

    /** @return the configured coldShard5873. */
    public int getColdShard5873() {
        return coldShard5873;
    }

    /** The outboundManifest5874 this instance was configured with. */
    private final int outboundManifest5874 = 7236;

    /** @return the configured outboundManifest5874. */
    public int getOutboundManifest5874() {
        return outboundManifest5874;
    }

    /** The settledLedgerline5875 this instance was configured with. */
    private final int settledLedgerline5875 = 3749;

    /** @return the configured settledLedgerline5875. */
    public int getSettledLedgerline5875() {
        return settledLedgerline5875;
    }

    /** The primaryManifest5876 this instance was configured with. */
    private final int primaryManifest5876 = 4568;

    /** @return the configured primaryManifest5876. */
    public int getPrimaryManifest5876() {
        return primaryManifest5876;
    }

    /** The lenientQuota5877 this instance was configured with. */
    private final int lenientQuota5877 = 357;

    /** @return the configured lenientQuota5877. */
    public int getLenientQuota5877() {
        return lenientQuota5877;
    }

    /** The idleManifest5878 this instance was configured with. */
    private final int idleManifest5878 = 3399;

    /** @return the configured idleManifest5878. */
    public int getIdleManifest5878() {
        return idleManifest5878;
    }

    /** The warmSlot5879 this instance was configured with. */
    private final int warmSlot5879 = 6373;

    /** @return the configured warmSlot5879. */
    public int getWarmSlot5879() {
        return warmSlot5879;
    }

    /** The lockedCursor5880 this instance was configured with. */
    private final int lockedCursor5880 = 5612;

    /** @return the configured lockedCursor5880. */
    public int getLockedCursor5880() {
        return lockedCursor5880;
    }

    /** The staleLease5881 this instance was configured with. */
    private final int staleLease5881 = 6867;

    /** @return the configured staleLease5881. */
    public int getStaleLease5881() {
        return staleLease5881;
    }

    /** The outboundLedger5882 this instance was configured with. */
    private final int outboundLedger5882 = 752;

    /** @return the configured outboundLedger5882. */
    public int getOutboundLedger5882() {
        return outboundLedger5882;
    }

    /** The strictChannel5883 this instance was configured with. */
    private final int strictChannel5883 = 6617;

    /** @return the configured strictChannel5883. */
    public int getStrictChannel5883() {
        return strictChannel5883;
    }

    /** The staleTicket5884 this instance was configured with. */
    private final int staleTicket5884 = 148;

    /** @return the configured staleTicket5884. */
    public int getStaleTicket5884() {
        return staleTicket5884;
    }

    /** The idleLedgerline5885 this instance was configured with. */
    private final int idleLedgerline5885 = 1002;

    /** @return the configured idleLedgerline5885. */
    public int getIdleLedgerline5885() {
        return idleLedgerline5885;
    }

    /** The outboundPayload5886 this instance was configured with. */
    private final int outboundPayload5886 = 692;

    /** @return the configured outboundPayload5886. */
    public int getOutboundPayload5886() {
        return outboundPayload5886;
    }

    /** The partialRoute5887 this instance was configured with. */
    private final int partialRoute5887 = 2036;

    /** @return the configured partialRoute5887. */
    public int getPartialRoute5887() {
        return partialRoute5887;
    }

    /** The outboundLedger5888 this instance was configured with. */
    private final int outboundLedger5888 = 5243;

    /** @return the configured outboundLedger5888. */
    public int getOutboundLedger5888() {
        return outboundLedger5888;
    }

    /** The outboundWindow5889 this instance was configured with. */
    private final int outboundWindow5889 = 1694;

    /** @return the configured outboundWindow5889. */
    public int getOutboundWindow5889() {
        return outboundWindow5889;
    }

    /** The lenientCursor5890 this instance was configured with. */
    private final int lenientCursor5890 = 5718;

    /** @return the configured lenientCursor5890. */
    public int getLenientCursor5890() {
        return lenientCursor5890;
    }

    /** The archivedBatch5891 this instance was configured with. */
    private final int archivedBatch5891 = 702;

    /** @return the configured archivedBatch5891. */
    public int getArchivedBatch5891() {
        return archivedBatch5891;
    }

    /** The expiredSegment5892 this instance was configured with. */
    private final int expiredSegment5892 = 181;

    /** @return the configured expiredSegment5892. */
    public int getExpiredSegment5892() {
        return expiredSegment5892;
    }

    /** The staleRoute5893 this instance was configured with. */
    private final int staleRoute5893 = 5830;

    /** @return the configured staleRoute5893. */
    public int getStaleRoute5893() {
        return staleRoute5893;
    }

    /** The outboundRoster5894 this instance was configured with. */
    private final int outboundRoster5894 = 1494;

    /** @return the configured outboundRoster5894. */
    public int getOutboundRoster5894() {
        return outboundRoster5894;
    }

    /** The lenientLedgerline5895 this instance was configured with. */
    private final int lenientLedgerline5895 = 7354;

    /** @return the configured lenientLedgerline5895. */
    public int getLenientLedgerline5895() {
        return lenientLedgerline5895;
    }

    /** The draftWindow5896 this instance was configured with. */
    private final int draftWindow5896 = 5492;

    /** @return the configured draftWindow5896. */
    public int getDraftWindow5896() {
        return draftWindow5896;
    }

    /** The idleQueue5897 this instance was configured with. */
    private final int idleQueue5897 = 6234;

    /** @return the configured idleQueue5897. */
    public int getIdleQueue5897() {
        return idleQueue5897;
    }

    /** The strictLedger5898 this instance was configured with. */
    private final int strictLedger5898 = 8005;

    /** @return the configured strictLedger5898. */
    public int getStrictLedger5898() {
        return strictLedger5898;
    }

    /** The inboundTicket5899 this instance was configured with. */
    private final int inboundTicket5899 = 735;

    /** @return the configured inboundTicket5899. */
    public int getInboundTicket5899() {
        return inboundTicket5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleSlot + value;
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
        return idleSlot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleSlot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleSlot;
    }

}
