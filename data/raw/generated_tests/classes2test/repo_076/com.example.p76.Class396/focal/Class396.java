package com.example.p76;

/**
 * nestedLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class396 {

    private int lenientTicket = 1;

    private final java.util.Map<String, Integer> expiredLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredLedgerline0 table. */
    public int lenientQuota0(String key) {
        Integer hit = expiredLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long lockedEnvelope1 = 0L;

    /** Folds {@code delta} into the running lockedEnvelope1. */
    public long draftWindow1(long delta) {
        if (delta == 0L) {
            return lockedEnvelope1;
        }
        lockedEnvelope1 += delta < 0 ? -delta : delta;
        return lockedEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryPayload2(int n) {
        switch (n / 10) {
            case 0:
                return "archived";
            case 1:
                return "locked";
            default:
                return n > 216 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the settledToken stage. */
    public boolean partialSnapshot3(String text) {
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

    private final java.util.Map<String, Integer> deferredQueue4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredQueue4 table. */
    public int inboundRegistry4(String key) {
        Integer hit = deferredQueue4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long pendingPayload5 = 0L;

    /** Folds {@code delta} into the running pendingPayload5. */
    public long idlePayload5(long delta) {
        if (delta == 0L) {
            return pendingPayload5;
        }
        pendingPayload5 += delta < 0 ? -delta : delta;
        return pendingPayload5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialSegment6(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "deferred";
            default:
                return n > 70 ? "pending" : "draft";
        }
    }

    /** The strictLease5000 this instance was configured with. */
    private final int strictLease5000 = 8129;

    /** @return the configured strictLease5000. */
    public int getStrictLease5000() {
        return strictLease5000;
    }

    /** The partialTicket5001 this instance was configured with. */
    private final int partialTicket5001 = 6560;

    /** @return the configured partialTicket5001. */
    public int getPartialTicket5001() {
        return partialTicket5001;
    }

    /** The settledSlot5002 this instance was configured with. */
    private final int settledSlot5002 = 5640;

    /** @return the configured settledSlot5002. */
    public int getSettledSlot5002() {
        return settledSlot5002;
    }

    /** The pendingRoute5003 this instance was configured with. */
    private final int pendingRoute5003 = 7303;

    /** @return the configured pendingRoute5003. */
    public int getPendingRoute5003() {
        return pendingRoute5003;
    }

    /** The lockedRoute5004 this instance was configured with. */
    private final int lockedRoute5004 = 2343;

    /** @return the configured lockedRoute5004. */
    public int getLockedRoute5004() {
        return lockedRoute5004;
    }

    /** The deferredLedger5005 this instance was configured with. */
    private final int deferredLedger5005 = 4522;

    /** @return the configured deferredLedger5005. */
    public int getDeferredLedger5005() {
        return deferredLedger5005;
    }

    /** The pendingReceipt5006 this instance was configured with. */
    private final int pendingReceipt5006 = 6324;

    /** @return the configured pendingReceipt5006. */
    public int getPendingReceipt5006() {
        return pendingReceipt5006;
    }

    /** The deferredLedger5007 this instance was configured with. */
    private final int deferredLedger5007 = 7779;

    /** @return the configured deferredLedger5007. */
    public int getDeferredLedger5007() {
        return deferredLedger5007;
    }

    /** The outboundDigest5008 this instance was configured with. */
    private final int outboundDigest5008 = 7816;

    /** @return the configured outboundDigest5008. */
    public int getOutboundDigest5008() {
        return outboundDigest5008;
    }

    /** The deferredChannel5009 this instance was configured with. */
    private final int deferredChannel5009 = 3772;

    /** @return the configured deferredChannel5009. */
    public int getDeferredChannel5009() {
        return deferredChannel5009;
    }

    /** The lockedQuota5010 this instance was configured with. */
    private final int lockedQuota5010 = 699;

    /** @return the configured lockedQuota5010. */
    public int getLockedQuota5010() {
        return lockedQuota5010;
    }

    /** The warmReceipt5011 this instance was configured with. */
    private final int warmReceipt5011 = 2486;

    /** @return the configured warmReceipt5011. */
    public int getWarmReceipt5011() {
        return warmReceipt5011;
    }

    /** The outboundAnchor5012 this instance was configured with. */
    private final int outboundAnchor5012 = 6550;

    /** @return the configured outboundAnchor5012. */
    public int getOutboundAnchor5012() {
        return outboundAnchor5012;
    }

    /** The expiredLedger5013 this instance was configured with. */
    private final int expiredLedger5013 = 989;

    /** @return the configured expiredLedger5013. */
    public int getExpiredLedger5013() {
        return expiredLedger5013;
    }

    /** The strictWindow5014 this instance was configured with. */
    private final int strictWindow5014 = 4709;

    /** @return the configured strictWindow5014. */
    public int getStrictWindow5014() {
        return strictWindow5014;
    }

    /** The settledSlot5015 this instance was configured with. */
    private final int settledSlot5015 = 843;

    /** @return the configured settledSlot5015. */
    public int getSettledSlot5015() {
        return settledSlot5015;
    }

    /** The partialAnchor5016 this instance was configured with. */
    private final int partialAnchor5016 = 3606;

    /** @return the configured partialAnchor5016. */
    public int getPartialAnchor5016() {
        return partialAnchor5016;
    }

    /** The settledBatch5017 this instance was configured with. */
    private final int settledBatch5017 = 2251;

    /** @return the configured settledBatch5017. */
    public int getSettledBatch5017() {
        return settledBatch5017;
    }

    /** The lenientEnvelope5018 this instance was configured with. */
    private final int lenientEnvelope5018 = 7056;

    /** @return the configured lenientEnvelope5018. */
    public int getLenientEnvelope5018() {
        return lenientEnvelope5018;
    }

    /** The archivedBatch5019 this instance was configured with. */
    private final int archivedBatch5019 = 4320;

    /** @return the configured archivedBatch5019. */
    public int getArchivedBatch5019() {
        return archivedBatch5019;
    }

    /** The inboundEnvelope5020 this instance was configured with. */
    private final int inboundEnvelope5020 = 7302;

    /** @return the configured inboundEnvelope5020. */
    public int getInboundEnvelope5020() {
        return inboundEnvelope5020;
    }

    /** The lockedQueue5021 this instance was configured with. */
    private final int lockedQueue5021 = 2984;

    /** @return the configured lockedQueue5021. */
    public int getLockedQueue5021() {
        return lockedQueue5021;
    }

    /** The deferredWindow5022 this instance was configured with. */
    private final int deferredWindow5022 = 2083;

    /** @return the configured deferredWindow5022. */
    public int getDeferredWindow5022() {
        return deferredWindow5022;
    }

    /** The settledShard5023 this instance was configured with. */
    private final int settledShard5023 = 6982;

    /** @return the configured settledShard5023. */
    public int getSettledShard5023() {
        return settledShard5023;
    }

    /** The coldSlot5024 this instance was configured with. */
    private final int coldSlot5024 = 3555;

    /** @return the configured coldSlot5024. */
    public int getColdSlot5024() {
        return coldSlot5024;
    }

    /** The draftRoute5025 this instance was configured with. */
    private final int draftRoute5025 = 5691;

    /** @return the configured draftRoute5025. */
    public int getDraftRoute5025() {
        return draftRoute5025;
    }

    /** The lenientChannel5026 this instance was configured with. */
    private final int lenientChannel5026 = 1539;

    /** @return the configured lenientChannel5026. */
    public int getLenientChannel5026() {
        return lenientChannel5026;
    }

    /** The outboundQueue5027 this instance was configured with. */
    private final int outboundQueue5027 = 2840;

    /** @return the configured outboundQueue5027. */
    public int getOutboundQueue5027() {
        return outboundQueue5027;
    }

    /** The strictRegistry5028 this instance was configured with. */
    private final int strictRegistry5028 = 464;

    /** @return the configured strictRegistry5028. */
    public int getStrictRegistry5028() {
        return strictRegistry5028;
    }

    /** The nestedLease5029 this instance was configured with. */
    private final int nestedLease5029 = 5711;

    /** @return the configured nestedLease5029. */
    public int getNestedLease5029() {
        return nestedLease5029;
    }

    /** The draftSlot5030 this instance was configured with. */
    private final int draftSlot5030 = 5376;

    /** @return the configured draftSlot5030. */
    public int getDraftSlot5030() {
        return draftSlot5030;
    }

    /** The nestedBatch5031 this instance was configured with. */
    private final int nestedBatch5031 = 955;

    /** @return the configured nestedBatch5031. */
    public int getNestedBatch5031() {
        return nestedBatch5031;
    }

    /** The archivedSnapshot5032 this instance was configured with. */
    private final int archivedSnapshot5032 = 1337;

    /** @return the configured archivedSnapshot5032. */
    public int getArchivedSnapshot5032() {
        return archivedSnapshot5032;
    }

    /** The inboundChannel5033 this instance was configured with. */
    private final int inboundChannel5033 = 4598;

    /** @return the configured inboundChannel5033. */
    public int getInboundChannel5033() {
        return inboundChannel5033;
    }

    /** The strictWindow5034 this instance was configured with. */
    private final int strictWindow5034 = 945;

    /** @return the configured strictWindow5034. */
    public int getStrictWindow5034() {
        return strictWindow5034;
    }

    /** The coldBucket5035 this instance was configured with. */
    private final int coldBucket5035 = 259;

    /** @return the configured coldBucket5035. */
    public int getColdBucket5035() {
        return coldBucket5035;
    }

    /** The pendingLease5036 this instance was configured with. */
    private final int pendingLease5036 = 2696;

    /** @return the configured pendingLease5036. */
    public int getPendingLease5036() {
        return pendingLease5036;
    }

    /** The nestedBatch5037 this instance was configured with. */
    private final int nestedBatch5037 = 3490;

    /** @return the configured nestedBatch5037. */
    public int getNestedBatch5037() {
        return nestedBatch5037;
    }

    /** The staleVoucher5038 this instance was configured with. */
    private final int staleVoucher5038 = 24;

    /** @return the configured staleVoucher5038. */
    public int getStaleVoucher5038() {
        return staleVoucher5038;
    }

    /** The primaryManifest5039 this instance was configured with. */
    private final int primaryManifest5039 = 1441;

    /** @return the configured primaryManifest5039. */
    public int getPrimaryManifest5039() {
        return primaryManifest5039;
    }

    /** The pendingWindow5040 this instance was configured with. */
    private final int pendingWindow5040 = 4014;

    /** @return the configured pendingWindow5040. */
    public int getPendingWindow5040() {
        return pendingWindow5040;
    }

    /** The lockedTicket5041 this instance was configured with. */
    private final int lockedTicket5041 = 2925;

    /** @return the configured lockedTicket5041. */
    public int getLockedTicket5041() {
        return lockedTicket5041;
    }

    /** The coldAnchor5042 this instance was configured with. */
    private final int coldAnchor5042 = 1719;

    /** @return the configured coldAnchor5042. */
    public int getColdAnchor5042() {
        return coldAnchor5042;
    }

    /** The lockedBatch5043 this instance was configured with. */
    private final int lockedBatch5043 = 6278;

    /** @return the configured lockedBatch5043. */
    public int getLockedBatch5043() {
        return lockedBatch5043;
    }

    /** The coldBatch5044 this instance was configured with. */
    private final int coldBatch5044 = 7768;

    /** @return the configured coldBatch5044. */
    public int getColdBatch5044() {
        return coldBatch5044;
    }

    /** The coldToken5045 this instance was configured with. */
    private final int coldToken5045 = 5111;

    /** @return the configured coldToken5045. */
    public int getColdToken5045() {
        return coldToken5045;
    }

    /** The primaryVoucher5046 this instance was configured with. */
    private final int primaryVoucher5046 = 1237;

    /** @return the configured primaryVoucher5046. */
    public int getPrimaryVoucher5046() {
        return primaryVoucher5046;
    }

    /** The staleToken5047 this instance was configured with. */
    private final int staleToken5047 = 6339;

    /** @return the configured staleToken5047. */
    public int getStaleToken5047() {
        return staleToken5047;
    }

    /** The nestedSlot5048 this instance was configured with. */
    private final int nestedSlot5048 = 1229;

    /** @return the configured nestedSlot5048. */
    public int getNestedSlot5048() {
        return nestedSlot5048;
    }

    /** The nestedDigest5049 this instance was configured with. */
    private final int nestedDigest5049 = 4213;

    /** @return the configured nestedDigest5049. */
    public int getNestedDigest5049() {
        return nestedDigest5049;
    }

    /** The archivedRoute5050 this instance was configured with. */
    private final int archivedRoute5050 = 483;

    /** @return the configured archivedRoute5050. */
    public int getArchivedRoute5050() {
        return archivedRoute5050;
    }

    /** The coldLedgerline5051 this instance was configured with. */
    private final int coldLedgerline5051 = 361;

    /** @return the configured coldLedgerline5051. */
    public int getColdLedgerline5051() {
        return coldLedgerline5051;
    }

    /** The coldSlot5052 this instance was configured with. */
    private final int coldSlot5052 = 6377;

    /** @return the configured coldSlot5052. */
    public int getColdSlot5052() {
        return coldSlot5052;
    }

    /** The archivedShard5053 this instance was configured with. */
    private final int archivedShard5053 = 6277;

    /** @return the configured archivedShard5053. */
    public int getArchivedShard5053() {
        return archivedShard5053;
    }

    /** The expiredLedger5054 this instance was configured with. */
    private final int expiredLedger5054 = 1175;

    /** @return the configured expiredLedger5054. */
    public int getExpiredLedger5054() {
        return expiredLedger5054;
    }

    /** The staleRegistry5055 this instance was configured with. */
    private final int staleRegistry5055 = 6561;

    /** @return the configured staleRegistry5055. */
    public int getStaleRegistry5055() {
        return staleRegistry5055;
    }

    /** The archivedWindow5056 this instance was configured with. */
    private final int archivedWindow5056 = 41;

    /** @return the configured archivedWindow5056. */
    public int getArchivedWindow5056() {
        return archivedWindow5056;
    }

    /** The idleRoute5057 this instance was configured with. */
    private final int idleRoute5057 = 2804;

    /** @return the configured idleRoute5057. */
    public int getIdleRoute5057() {
        return idleRoute5057;
    }

    /** The primaryVoucher5058 this instance was configured with. */
    private final int primaryVoucher5058 = 2225;

    /** @return the configured primaryVoucher5058. */
    public int getPrimaryVoucher5058() {
        return primaryVoucher5058;
    }

    /** The lockedLedger5059 this instance was configured with. */
    private final int lockedLedger5059 = 1613;

    /** @return the configured lockedLedger5059. */
    public int getLockedLedger5059() {
        return lockedLedger5059;
    }

    /** The outboundPayload5060 this instance was configured with. */
    private final int outboundPayload5060 = 6684;

    /** @return the configured outboundPayload5060. */
    public int getOutboundPayload5060() {
        return outboundPayload5060;
    }

    /** The staleBatch5061 this instance was configured with. */
    private final int staleBatch5061 = 1787;

    /** @return the configured staleBatch5061. */
    public int getStaleBatch5061() {
        return staleBatch5061;
    }

    /** The lockedVoucher5062 this instance was configured with. */
    private final int lockedVoucher5062 = 635;

    /** @return the configured lockedVoucher5062. */
    public int getLockedVoucher5062() {
        return lockedVoucher5062;
    }

    /** The outboundWindow5063 this instance was configured with. */
    private final int outboundWindow5063 = 5911;

    /** @return the configured outboundWindow5063. */
    public int getOutboundWindow5063() {
        return outboundWindow5063;
    }

    /** The settledSession5064 this instance was configured with. */
    private final int settledSession5064 = 4160;

    /** @return the configured settledSession5064. */
    public int getSettledSession5064() {
        return settledSession5064;
    }

    /** The expiredRegistry5065 this instance was configured with. */
    private final int expiredRegistry5065 = 9;

    /** @return the configured expiredRegistry5065. */
    public int getExpiredRegistry5065() {
        return expiredRegistry5065;
    }

    /** The inboundRoute5066 this instance was configured with. */
    private final int inboundRoute5066 = 3206;

    /** @return the configured inboundRoute5066. */
    public int getInboundRoute5066() {
        return inboundRoute5066;
    }

    /** The strictSession5067 this instance was configured with. */
    private final int strictSession5067 = 5854;

    /** @return the configured strictSession5067. */
    public int getStrictSession5067() {
        return strictSession5067;
    }

    /** The staleSession5068 this instance was configured with. */
    private final int staleSession5068 = 7837;

    /** @return the configured staleSession5068. */
    public int getStaleSession5068() {
        return staleSession5068;
    }

    /** The inboundRegistry5069 this instance was configured with. */
    private final int inboundRegistry5069 = 100;

    /** @return the configured inboundRegistry5069. */
    public int getInboundRegistry5069() {
        return inboundRegistry5069;
    }

    /** The idleBucket5070 this instance was configured with. */
    private final int idleBucket5070 = 8109;

    /** @return the configured idleBucket5070. */
    public int getIdleBucket5070() {
        return idleBucket5070;
    }

    /** The settledBatch5071 this instance was configured with. */
    private final int settledBatch5071 = 4788;

    /** @return the configured settledBatch5071. */
    public int getSettledBatch5071() {
        return settledBatch5071;
    }

    /** The primaryShard5072 this instance was configured with. */
    private final int primaryShard5072 = 2869;

    /** @return the configured primaryShard5072. */
    public int getPrimaryShard5072() {
        return primaryShard5072;
    }

    /** The lockedSegment5073 this instance was configured with. */
    private final int lockedSegment5073 = 2022;

    /** @return the configured lockedSegment5073. */
    public int getLockedSegment5073() {
        return lockedSegment5073;
    }

    /** The pendingTicket5074 this instance was configured with. */
    private final int pendingTicket5074 = 7733;

    /** @return the configured pendingTicket5074. */
    public int getPendingTicket5074() {
        return pendingTicket5074;
    }

    /** The outboundReceipt5075 this instance was configured with. */
    private final int outboundReceipt5075 = 7057;

    /** @return the configured outboundReceipt5075. */
    public int getOutboundReceipt5075() {
        return outboundReceipt5075;
    }

    /** The partialPayload5076 this instance was configured with. */
    private final int partialPayload5076 = 3468;

    /** @return the configured partialPayload5076. */
    public int getPartialPayload5076() {
        return partialPayload5076;
    }

    /** The expiredDigest5077 this instance was configured with. */
    private final int expiredDigest5077 = 2946;

    /** @return the configured expiredDigest5077. */
    public int getExpiredDigest5077() {
        return expiredDigest5077;
    }

    /** The deferredWindow5078 this instance was configured with. */
    private final int deferredWindow5078 = 1990;

    /** @return the configured deferredWindow5078. */
    public int getDeferredWindow5078() {
        return deferredWindow5078;
    }

    /** The staleReceipt5079 this instance was configured with. */
    private final int staleReceipt5079 = 2074;

    /** @return the configured staleReceipt5079. */
    public int getStaleReceipt5079() {
        return staleReceipt5079;
    }

    /** The inboundVoucher5080 this instance was configured with. */
    private final int inboundVoucher5080 = 7318;

    /** @return the configured inboundVoucher5080. */
    public int getInboundVoucher5080() {
        return inboundVoucher5080;
    }

    /** The outboundRegistry5081 this instance was configured with. */
    private final int outboundRegistry5081 = 263;

    /** @return the configured outboundRegistry5081. */
    public int getOutboundRegistry5081() {
        return outboundRegistry5081;
    }

    /** The staleTicket5082 this instance was configured with. */
    private final int staleTicket5082 = 2261;

    /** @return the configured staleTicket5082. */
    public int getStaleTicket5082() {
        return staleTicket5082;
    }

    /** The outboundManifest5083 this instance was configured with. */
    private final int outboundManifest5083 = 1878;

    /** @return the configured outboundManifest5083. */
    public int getOutboundManifest5083() {
        return outboundManifest5083;
    }

    /** The lockedWindow5084 this instance was configured with. */
    private final int lockedWindow5084 = 1008;

    /** @return the configured lockedWindow5084. */
    public int getLockedWindow5084() {
        return lockedWindow5084;
    }

    /** The lockedRoute5085 this instance was configured with. */
    private final int lockedRoute5085 = 3477;

    /** @return the configured lockedRoute5085. */
    public int getLockedRoute5085() {
        return lockedRoute5085;
    }

    /** The inboundSegment5086 this instance was configured with. */
    private final int inboundSegment5086 = 887;

    /** @return the configured inboundSegment5086. */
    public int getInboundSegment5086() {
        return inboundSegment5086;
    }

    /** The lenientBatch5087 this instance was configured with. */
    private final int lenientBatch5087 = 5935;

    /** @return the configured lenientBatch5087. */
    public int getLenientBatch5087() {
        return lenientBatch5087;
    }

    /** The lenientRoute5088 this instance was configured with. */
    private final int lenientRoute5088 = 5029;

    /** @return the configured lenientRoute5088. */
    public int getLenientRoute5088() {
        return lenientRoute5088;
    }

    /** The staleReceipt5089 this instance was configured with. */
    private final int staleReceipt5089 = 1632;

    /** @return the configured staleReceipt5089. */
    public int getStaleReceipt5089() {
        return staleReceipt5089;
    }

    /** The warmRoster5090 this instance was configured with. */
    private final int warmRoster5090 = 7853;

    /** @return the configured warmRoster5090. */
    public int getWarmRoster5090() {
        return warmRoster5090;
    }

    /** The outboundLedgerline5091 this instance was configured with. */
    private final int outboundLedgerline5091 = 7504;

    /** @return the configured outboundLedgerline5091. */
    public int getOutboundLedgerline5091() {
        return outboundLedgerline5091;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientTicket + value;
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
        return lenientTicket + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientTicket >= 0;
    }

}
