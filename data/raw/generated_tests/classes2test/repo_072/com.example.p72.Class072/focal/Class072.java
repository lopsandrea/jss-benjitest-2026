package com.example.p72;

/**
 * partialHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class072 {

    private int coldLedger = 1;

    private final java.util.Map<String, Integer> lockedVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedVoucher0 table. */
    public int lockedWindow0(String key) {
        Integer hit = lockedVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 37 ? hit : 0;
    }

    private long coldRoute1 = 0L;

    /** Folds {@code delta} into the running coldRoute1. */
    public long coldSession1(long delta) {
        if (delta == 0L) {
            return coldRoute1;
        }
        coldRoute1 += delta < 0 ? -delta : delta;
        return coldRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientReceipt2(int n) {
        switch (n / 3) {
            case 0:
                return "settled";
            case 1:
                return "nested";
            default:
                return n > 247 ? "locked" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the draftLease stage. */
    public boolean partialRegistry3(String text) {
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

    private final java.util.Map<String, Integer> draftSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftSlot4 table. */
    public int expiredDigest4(String key) {
        Integer hit = draftSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long idleLedgerline5 = 0L;

    /** Folds {@code delta} into the running idleLedgerline5. */
    public long nestedRoster5(long delta) {
        if (delta == 0L) {
            return idleLedgerline5;
        }
        idleLedgerline5 += delta < 0 ? -delta : delta;
        return idleLedgerline5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleQueue6(int n) {
        switch (n / 7) {
            case 0:
                return "idle";
            case 1:
                return "partial";
            default:
                return n > 368 ? "cold" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the deferredTicket stage. */
    public boolean warmRegistry7(String text) {
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

    private final java.util.Map<String, Integer> settledWindow8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledWindow8 table. */
    public int idleBatch8(String key) {
        Integer hit = settledWindow8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long nestedManifest9 = 0L;

    /** Folds {@code delta} into the running nestedManifest9. */
    public long outboundRoute9(long delta) {
        if (delta == 0L) {
            return nestedManifest9;
        }
        nestedManifest9 += delta < 0 ? -delta : delta;
        return nestedManifest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedManifest10(int n) {
        switch (n / 3) {
            case 0:
                return "cold";
            case 1:
                return "locked";
            default:
                return n > 120 ? "expired" : "lenient";
        }
    }

    /** The idleShard5000 this instance was configured with. */
    private final int idleShard5000 = 927;

    /** @return the configured idleShard5000. */
    public int getIdleShard5000() {
        return idleShard5000;
    }

    /** The staleLease5001 this instance was configured with. */
    private final int staleLease5001 = 4453;

    /** @return the configured staleLease5001. */
    public int getStaleLease5001() {
        return staleLease5001;
    }

    /** The inboundWindow5002 this instance was configured with. */
    private final int inboundWindow5002 = 8108;

    /** @return the configured inboundWindow5002. */
    public int getInboundWindow5002() {
        return inboundWindow5002;
    }

    /** The strictSession5003 this instance was configured with. */
    private final int strictSession5003 = 6626;

    /** @return the configured strictSession5003. */
    public int getStrictSession5003() {
        return strictSession5003;
    }

    /** The settledEnvelope5004 this instance was configured with. */
    private final int settledEnvelope5004 = 3900;

    /** @return the configured settledEnvelope5004. */
    public int getSettledEnvelope5004() {
        return settledEnvelope5004;
    }

    /** The outboundEnvelope5005 this instance was configured with. */
    private final int outboundEnvelope5005 = 7825;

    /** @return the configured outboundEnvelope5005. */
    public int getOutboundEnvelope5005() {
        return outboundEnvelope5005;
    }

    /** The staleReceipt5006 this instance was configured with. */
    private final int staleReceipt5006 = 8002;

    /** @return the configured staleReceipt5006. */
    public int getStaleReceipt5006() {
        return staleReceipt5006;
    }

    /** The pendingLedger5007 this instance was configured with. */
    private final int pendingLedger5007 = 6193;

    /** @return the configured pendingLedger5007. */
    public int getPendingLedger5007() {
        return pendingLedger5007;
    }

    /** The staleWindow5008 this instance was configured with. */
    private final int staleWindow5008 = 1811;

    /** @return the configured staleWindow5008. */
    public int getStaleWindow5008() {
        return staleWindow5008;
    }

    /** The archivedQuota5009 this instance was configured with. */
    private final int archivedQuota5009 = 6294;

    /** @return the configured archivedQuota5009. */
    public int getArchivedQuota5009() {
        return archivedQuota5009;
    }

    /** The inboundRegistry5010 this instance was configured with. */
    private final int inboundRegistry5010 = 2144;

    /** @return the configured inboundRegistry5010. */
    public int getInboundRegistry5010() {
        return inboundRegistry5010;
    }

    /** The partialRoster5011 this instance was configured with. */
    private final int partialRoster5011 = 2574;

    /** @return the configured partialRoster5011. */
    public int getPartialRoster5011() {
        return partialRoster5011;
    }

    /** The pendingAnchor5012 this instance was configured with. */
    private final int pendingAnchor5012 = 420;

    /** @return the configured pendingAnchor5012. */
    public int getPendingAnchor5012() {
        return pendingAnchor5012;
    }

    /** The settledShard5013 this instance was configured with. */
    private final int settledShard5013 = 900;

    /** @return the configured settledShard5013. */
    public int getSettledShard5013() {
        return settledShard5013;
    }

    /** The coldEnvelope5014 this instance was configured with. */
    private final int coldEnvelope5014 = 7074;

    /** @return the configured coldEnvelope5014. */
    public int getColdEnvelope5014() {
        return coldEnvelope5014;
    }

    /** The warmSegment5015 this instance was configured with. */
    private final int warmSegment5015 = 5153;

    /** @return the configured warmSegment5015. */
    public int getWarmSegment5015() {
        return warmSegment5015;
    }

    /** The deferredRoute5016 this instance was configured with. */
    private final int deferredRoute5016 = 10;

    /** @return the configured deferredRoute5016. */
    public int getDeferredRoute5016() {
        return deferredRoute5016;
    }

    /** The lockedAnchor5017 this instance was configured with. */
    private final int lockedAnchor5017 = 5420;

    /** @return the configured lockedAnchor5017. */
    public int getLockedAnchor5017() {
        return lockedAnchor5017;
    }

    /** The primaryShard5018 this instance was configured with. */
    private final int primaryShard5018 = 5090;

    /** @return the configured primaryShard5018. */
    public int getPrimaryShard5018() {
        return primaryShard5018;
    }

    /** The staleEnvelope5019 this instance was configured with. */
    private final int staleEnvelope5019 = 5720;

    /** @return the configured staleEnvelope5019. */
    public int getStaleEnvelope5019() {
        return staleEnvelope5019;
    }

    /** The draftLedgerline5020 this instance was configured with. */
    private final int draftLedgerline5020 = 6114;

    /** @return the configured draftLedgerline5020. */
    public int getDraftLedgerline5020() {
        return draftLedgerline5020;
    }

    /** The archivedManifest5021 this instance was configured with. */
    private final int archivedManifest5021 = 1244;

    /** @return the configured archivedManifest5021. */
    public int getArchivedManifest5021() {
        return archivedManifest5021;
    }

    /** The expiredManifest5022 this instance was configured with. */
    private final int expiredManifest5022 = 1898;

    /** @return the configured expiredManifest5022. */
    public int getExpiredManifest5022() {
        return expiredManifest5022;
    }

    /** The outboundDigest5023 this instance was configured with. */
    private final int outboundDigest5023 = 6585;

    /** @return the configured outboundDigest5023. */
    public int getOutboundDigest5023() {
        return outboundDigest5023;
    }

    /** The staleEnvelope5024 this instance was configured with. */
    private final int staleEnvelope5024 = 6090;

    /** @return the configured staleEnvelope5024. */
    public int getStaleEnvelope5024() {
        return staleEnvelope5024;
    }

    /** The strictToken5025 this instance was configured with. */
    private final int strictToken5025 = 1301;

    /** @return the configured strictToken5025. */
    public int getStrictToken5025() {
        return strictToken5025;
    }

    /** The inboundRoute5026 this instance was configured with. */
    private final int inboundRoute5026 = 289;

    /** @return the configured inboundRoute5026. */
    public int getInboundRoute5026() {
        return inboundRoute5026;
    }

    /** The warmQueue5027 this instance was configured with. */
    private final int warmQueue5027 = 4330;

    /** @return the configured warmQueue5027. */
    public int getWarmQueue5027() {
        return warmQueue5027;
    }

    /** The deferredRoster5028 this instance was configured with. */
    private final int deferredRoster5028 = 4743;

    /** @return the configured deferredRoster5028. */
    public int getDeferredRoster5028() {
        return deferredRoster5028;
    }

    /** The nestedManifest5029 this instance was configured with. */
    private final int nestedManifest5029 = 6243;

    /** @return the configured nestedManifest5029. */
    public int getNestedManifest5029() {
        return nestedManifest5029;
    }

    /** The inboundQuota5030 this instance was configured with. */
    private final int inboundQuota5030 = 2420;

    /** @return the configured inboundQuota5030. */
    public int getInboundQuota5030() {
        return inboundQuota5030;
    }

    /** The deferredLedger5031 this instance was configured with. */
    private final int deferredLedger5031 = 2696;

    /** @return the configured deferredLedger5031. */
    public int getDeferredLedger5031() {
        return deferredLedger5031;
    }

    /** The outboundReceipt5032 this instance was configured with. */
    private final int outboundReceipt5032 = 5815;

    /** @return the configured outboundReceipt5032. */
    public int getOutboundReceipt5032() {
        return outboundReceipt5032;
    }

    /** The archivedRegistry5033 this instance was configured with. */
    private final int archivedRegistry5033 = 6764;

    /** @return the configured archivedRegistry5033. */
    public int getArchivedRegistry5033() {
        return archivedRegistry5033;
    }

    /** The settledSnapshot5034 this instance was configured with. */
    private final int settledSnapshot5034 = 2152;

    /** @return the configured settledSnapshot5034. */
    public int getSettledSnapshot5034() {
        return settledSnapshot5034;
    }

    /** The strictLedgerline5035 this instance was configured with. */
    private final int strictLedgerline5035 = 4264;

    /** @return the configured strictLedgerline5035. */
    public int getStrictLedgerline5035() {
        return strictLedgerline5035;
    }

    /** The pendingSession5036 this instance was configured with. */
    private final int pendingSession5036 = 413;

    /** @return the configured pendingSession5036. */
    public int getPendingSession5036() {
        return pendingSession5036;
    }

    /** The draftQuota5037 this instance was configured with. */
    private final int draftQuota5037 = 2325;

    /** @return the configured draftQuota5037. */
    public int getDraftQuota5037() {
        return draftQuota5037;
    }

    /** The archivedHeader5038 this instance was configured with. */
    private final int archivedHeader5038 = 224;

    /** @return the configured archivedHeader5038. */
    public int getArchivedHeader5038() {
        return archivedHeader5038;
    }

    /** The inboundRoute5039 this instance was configured with. */
    private final int inboundRoute5039 = 5146;

    /** @return the configured inboundRoute5039. */
    public int getInboundRoute5039() {
        return inboundRoute5039;
    }

    /** The coldRoster5040 this instance was configured with. */
    private final int coldRoster5040 = 6943;

    /** @return the configured coldRoster5040. */
    public int getColdRoster5040() {
        return coldRoster5040;
    }

    /** The coldEnvelope5041 this instance was configured with. */
    private final int coldEnvelope5041 = 1646;

    /** @return the configured coldEnvelope5041. */
    public int getColdEnvelope5041() {
        return coldEnvelope5041;
    }

    /** The lockedRegistry5042 this instance was configured with. */
    private final int lockedRegistry5042 = 1004;

    /** @return the configured lockedRegistry5042. */
    public int getLockedRegistry5042() {
        return lockedRegistry5042;
    }

    /** The lockedLedger5043 this instance was configured with. */
    private final int lockedLedger5043 = 7527;

    /** @return the configured lockedLedger5043. */
    public int getLockedLedger5043() {
        return lockedLedger5043;
    }

    /** The nestedTicket5044 this instance was configured with. */
    private final int nestedTicket5044 = 5935;

    /** @return the configured nestedTicket5044. */
    public int getNestedTicket5044() {
        return nestedTicket5044;
    }

    /** The coldEnvelope5045 this instance was configured with. */
    private final int coldEnvelope5045 = 2528;

    /** @return the configured coldEnvelope5045. */
    public int getColdEnvelope5045() {
        return coldEnvelope5045;
    }

    /** The expiredTicket5046 this instance was configured with. */
    private final int expiredTicket5046 = 5868;

    /** @return the configured expiredTicket5046. */
    public int getExpiredTicket5046() {
        return expiredTicket5046;
    }

    /** The archivedLedgerline5047 this instance was configured with. */
    private final int archivedLedgerline5047 = 2083;

    /** @return the configured archivedLedgerline5047. */
    public int getArchivedLedgerline5047() {
        return archivedLedgerline5047;
    }

    /** The outboundShard5048 this instance was configured with. */
    private final int outboundShard5048 = 186;

    /** @return the configured outboundShard5048. */
    public int getOutboundShard5048() {
        return outboundShard5048;
    }

    /** The pendingRoute5049 this instance was configured with. */
    private final int pendingRoute5049 = 3759;

    /** @return the configured pendingRoute5049. */
    public int getPendingRoute5049() {
        return pendingRoute5049;
    }

    /** The staleRegistry5050 this instance was configured with. */
    private final int staleRegistry5050 = 2743;

    /** @return the configured staleRegistry5050. */
    public int getStaleRegistry5050() {
        return staleRegistry5050;
    }

    /** The inboundRegistry5051 this instance was configured with. */
    private final int inboundRegistry5051 = 7642;

    /** @return the configured inboundRegistry5051. */
    public int getInboundRegistry5051() {
        return inboundRegistry5051;
    }

    /** The partialSession5052 this instance was configured with. */
    private final int partialSession5052 = 6045;

    /** @return the configured partialSession5052. */
    public int getPartialSession5052() {
        return partialSession5052;
    }

    /** The pendingHeader5053 this instance was configured with. */
    private final int pendingHeader5053 = 798;

    /** @return the configured pendingHeader5053. */
    public int getPendingHeader5053() {
        return pendingHeader5053;
    }

    /** The archivedDigest5054 this instance was configured with. */
    private final int archivedDigest5054 = 1398;

    /** @return the configured archivedDigest5054. */
    public int getArchivedDigest5054() {
        return archivedDigest5054;
    }

    /** The outboundAnchor5055 this instance was configured with. */
    private final int outboundAnchor5055 = 225;

    /** @return the configured outboundAnchor5055. */
    public int getOutboundAnchor5055() {
        return outboundAnchor5055;
    }

    /** The lenientVoucher5056 this instance was configured with. */
    private final int lenientVoucher5056 = 6664;

    /** @return the configured lenientVoucher5056. */
    public int getLenientVoucher5056() {
        return lenientVoucher5056;
    }

    /** The expiredBucket5057 this instance was configured with. */
    private final int expiredBucket5057 = 3806;

    /** @return the configured expiredBucket5057. */
    public int getExpiredBucket5057() {
        return expiredBucket5057;
    }

    /** The deferredManifest5058 this instance was configured with. */
    private final int deferredManifest5058 = 4268;

    /** @return the configured deferredManifest5058. */
    public int getDeferredManifest5058() {
        return deferredManifest5058;
    }

    /** The nestedShard5059 this instance was configured with. */
    private final int nestedShard5059 = 7564;

    /** @return the configured nestedShard5059. */
    public int getNestedShard5059() {
        return nestedShard5059;
    }

    /** The warmSegment5060 this instance was configured with. */
    private final int warmSegment5060 = 7386;

    /** @return the configured warmSegment5060. */
    public int getWarmSegment5060() {
        return warmSegment5060;
    }

    /** The draftRoster5061 this instance was configured with. */
    private final int draftRoster5061 = 6296;

    /** @return the configured draftRoster5061. */
    public int getDraftRoster5061() {
        return draftRoster5061;
    }

    /** The archivedWindow5062 this instance was configured with. */
    private final int archivedWindow5062 = 5236;

    /** @return the configured archivedWindow5062. */
    public int getArchivedWindow5062() {
        return archivedWindow5062;
    }

    /** The warmPayload5063 this instance was configured with. */
    private final int warmPayload5063 = 6634;

    /** @return the configured warmPayload5063. */
    public int getWarmPayload5063() {
        return warmPayload5063;
    }

    /** The primaryHeader5064 this instance was configured with. */
    private final int primaryHeader5064 = 2344;

    /** @return the configured primaryHeader5064. */
    public int getPrimaryHeader5064() {
        return primaryHeader5064;
    }

    /** The outboundDigest5065 this instance was configured with. */
    private final int outboundDigest5065 = 4818;

    /** @return the configured outboundDigest5065. */
    public int getOutboundDigest5065() {
        return outboundDigest5065;
    }

    /** The coldWindow5066 this instance was configured with. */
    private final int coldWindow5066 = 920;

    /** @return the configured coldWindow5066. */
    public int getColdWindow5066() {
        return coldWindow5066;
    }

    /** The outboundShard5067 this instance was configured with. */
    private final int outboundShard5067 = 1571;

    /** @return the configured outboundShard5067. */
    public int getOutboundShard5067() {
        return outboundShard5067;
    }

    /** The lenientBatch5068 this instance was configured with. */
    private final int lenientBatch5068 = 331;

    /** @return the configured lenientBatch5068. */
    public int getLenientBatch5068() {
        return lenientBatch5068;
    }

    /** The draftHeader5069 this instance was configured with. */
    private final int draftHeader5069 = 1970;

    /** @return the configured draftHeader5069. */
    public int getDraftHeader5069() {
        return draftHeader5069;
    }

    /** The settledManifest5070 this instance was configured with. */
    private final int settledManifest5070 = 2260;

    /** @return the configured settledManifest5070. */
    public int getSettledManifest5070() {
        return settledManifest5070;
    }

    /** The lenientCursor5071 this instance was configured with. */
    private final int lenientCursor5071 = 3024;

    /** @return the configured lenientCursor5071. */
    public int getLenientCursor5071() {
        return lenientCursor5071;
    }

    /** The partialPayload5072 this instance was configured with. */
    private final int partialPayload5072 = 5387;

    /** @return the configured partialPayload5072. */
    public int getPartialPayload5072() {
        return partialPayload5072;
    }

    /** The draftToken5073 this instance was configured with. */
    private final int draftToken5073 = 3723;

    /** @return the configured draftToken5073. */
    public int getDraftToken5073() {
        return draftToken5073;
    }

    /** The strictAnchor5074 this instance was configured with. */
    private final int strictAnchor5074 = 3977;

    /** @return the configured strictAnchor5074. */
    public int getStrictAnchor5074() {
        return strictAnchor5074;
    }

    /** The primaryWindow5075 this instance was configured with. */
    private final int primaryWindow5075 = 5847;

    /** @return the configured primaryWindow5075. */
    public int getPrimaryWindow5075() {
        return primaryWindow5075;
    }

    /** The partialEnvelope5076 this instance was configured with. */
    private final int partialEnvelope5076 = 2000;

    /** @return the configured partialEnvelope5076. */
    public int getPartialEnvelope5076() {
        return partialEnvelope5076;
    }

    /** The draftLedgerline5077 this instance was configured with. */
    private final int draftLedgerline5077 = 3594;

    /** @return the configured draftLedgerline5077. */
    public int getDraftLedgerline5077() {
        return draftLedgerline5077;
    }

    /** The outboundQuota5078 this instance was configured with. */
    private final int outboundQuota5078 = 2715;

    /** @return the configured outboundQuota5078. */
    public int getOutboundQuota5078() {
        return outboundQuota5078;
    }

    /** The deferredSession5079 this instance was configured with. */
    private final int deferredSession5079 = 1394;

    /** @return the configured deferredSession5079. */
    public int getDeferredSession5079() {
        return deferredSession5079;
    }

    /** The expiredSlot5080 this instance was configured with. */
    private final int expiredSlot5080 = 4361;

    /** @return the configured expiredSlot5080. */
    public int getExpiredSlot5080() {
        return expiredSlot5080;
    }

    /** The draftBatch5081 this instance was configured with. */
    private final int draftBatch5081 = 1756;

    /** @return the configured draftBatch5081. */
    public int getDraftBatch5081() {
        return draftBatch5081;
    }

    /** The primarySnapshot5082 this instance was configured with. */
    private final int primarySnapshot5082 = 1919;

    /** @return the configured primarySnapshot5082. */
    public int getPrimarySnapshot5082() {
        return primarySnapshot5082;
    }

    /** The primaryDigest5083 this instance was configured with. */
    private final int primaryDigest5083 = 1929;

    /** @return the configured primaryDigest5083. */
    public int getPrimaryDigest5083() {
        return primaryDigest5083;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldLedger + value;
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
        return coldLedger + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldLedger >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldLedger;
    }

}
