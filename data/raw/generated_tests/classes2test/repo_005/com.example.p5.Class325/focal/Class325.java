package com.example.p5;

/**
 * partialSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class325 {

    private int outboundLedgerline = 1;

    private final java.util.Map<String, Integer> partialQueue0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQueue0 table. */
    public int nestedEnvelope0(String key) {
        Integer hit = partialQueue0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long expiredRoute1 = 0L;

    /** Folds {@code delta} into the running expiredRoute1. */
    public long archivedQueue1(long delta) {
        if (delta == 0L) {
            return expiredRoute1;
        }
        expiredRoute1 += delta < 0 ? -delta : delta;
        return expiredRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftLedgerline2(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "stale";
            default:
                return n > 76 ? "outbound" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the partialTicket stage. */
    public boolean nestedShard3(String text) {
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

    private final java.util.Map<String, Integer> strictAnchor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictAnchor4 table. */
    public int pendingSegment4(String key) {
        Integer hit = strictAnchor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long partialCursor5 = 0L;

    /** Folds {@code delta} into the running partialCursor5. */
    public long warmPayload5(long delta) {
        if (delta == 0L) {
            return partialCursor5;
        }
        partialCursor5 += delta < 0 ? -delta : delta;
        return partialCursor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundManifest6(int n) {
        switch (n / 8) {
            case 0:
                return "strict";
            case 1:
                return "stale";
            default:
                return n > 85 ? "stale" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the inboundSlot stage. */
    public boolean inboundSegment7(String text) {
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

    private final java.util.Map<String, Integer> idleSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSession8 table. */
    public int settledChannel8(String key) {
        Integer hit = idleSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 81 ? hit : 0;
    }

    private long outboundWindow9 = 0L;

    /** Folds {@code delta} into the running outboundWindow9. */
    public long staleManifest9(long delta) {
        if (delta == 0L) {
            return outboundWindow9;
        }
        outboundWindow9 += delta < 0 ? -delta : delta;
        return outboundWindow9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingPayload10(int n) {
        switch (n / 8) {
            case 0:
                return "strict";
            case 1:
                return "partial";
            default:
                return n > 238 ? "partial" : "inbound";
        }
    }

    /** The inboundSnapshot5000 this instance was configured with. */
    private final int inboundSnapshot5000 = 229;

    /** @return the configured inboundSnapshot5000. */
    public int getInboundSnapshot5000() {
        return inboundSnapshot5000;
    }

    /** The lockedTicket5001 this instance was configured with. */
    private final int lockedTicket5001 = 5734;

    /** @return the configured lockedTicket5001. */
    public int getLockedTicket5001() {
        return lockedTicket5001;
    }

    /** The coldManifest5002 this instance was configured with. */
    private final int coldManifest5002 = 3723;

    /** @return the configured coldManifest5002. */
    public int getColdManifest5002() {
        return coldManifest5002;
    }

    /** The deferredPayload5003 this instance was configured with. */
    private final int deferredPayload5003 = 5950;

    /** @return the configured deferredPayload5003. */
    public int getDeferredPayload5003() {
        return deferredPayload5003;
    }

    /** The lenientSnapshot5004 this instance was configured with. */
    private final int lenientSnapshot5004 = 5193;

    /** @return the configured lenientSnapshot5004. */
    public int getLenientSnapshot5004() {
        return lenientSnapshot5004;
    }

    /** The primaryRoster5005 this instance was configured with. */
    private final int primaryRoster5005 = 163;

    /** @return the configured primaryRoster5005. */
    public int getPrimaryRoster5005() {
        return primaryRoster5005;
    }

    /** The partialRegistry5006 this instance was configured with. */
    private final int partialRegistry5006 = 1351;

    /** @return the configured partialRegistry5006. */
    public int getPartialRegistry5006() {
        return partialRegistry5006;
    }

    /** The primaryPayload5007 this instance was configured with. */
    private final int primaryPayload5007 = 8066;

    /** @return the configured primaryPayload5007. */
    public int getPrimaryPayload5007() {
        return primaryPayload5007;
    }

    /** The inboundSession5008 this instance was configured with. */
    private final int inboundSession5008 = 7425;

    /** @return the configured inboundSession5008. */
    public int getInboundSession5008() {
        return inboundSession5008;
    }

    /** The expiredBucket5009 this instance was configured with. */
    private final int expiredBucket5009 = 1721;

    /** @return the configured expiredBucket5009. */
    public int getExpiredBucket5009() {
        return expiredBucket5009;
    }

    /** The primarySession5010 this instance was configured with. */
    private final int primarySession5010 = 158;

    /** @return the configured primarySession5010. */
    public int getPrimarySession5010() {
        return primarySession5010;
    }

    /** The settledRegistry5011 this instance was configured with. */
    private final int settledRegistry5011 = 4478;

    /** @return the configured settledRegistry5011. */
    public int getSettledRegistry5011() {
        return settledRegistry5011;
    }

    /** The staleToken5012 this instance was configured with. */
    private final int staleToken5012 = 1724;

    /** @return the configured staleToken5012. */
    public int getStaleToken5012() {
        return staleToken5012;
    }

    /** The archivedLedger5013 this instance was configured with. */
    private final int archivedLedger5013 = 5100;

    /** @return the configured archivedLedger5013. */
    public int getArchivedLedger5013() {
        return archivedLedger5013;
    }

    /** The settledVoucher5014 this instance was configured with. */
    private final int settledVoucher5014 = 4579;

    /** @return the configured settledVoucher5014. */
    public int getSettledVoucher5014() {
        return settledVoucher5014;
    }

    /** The nestedLedger5015 this instance was configured with. */
    private final int nestedLedger5015 = 4257;

    /** @return the configured nestedLedger5015. */
    public int getNestedLedger5015() {
        return nestedLedger5015;
    }

    /** The deferredBatch5016 this instance was configured with. */
    private final int deferredBatch5016 = 7693;

    /** @return the configured deferredBatch5016. */
    public int getDeferredBatch5016() {
        return deferredBatch5016;
    }

    /** The pendingBatch5017 this instance was configured with. */
    private final int pendingBatch5017 = 4908;

    /** @return the configured pendingBatch5017. */
    public int getPendingBatch5017() {
        return pendingBatch5017;
    }

    /** The staleRegistry5018 this instance was configured with. */
    private final int staleRegistry5018 = 7422;

    /** @return the configured staleRegistry5018. */
    public int getStaleRegistry5018() {
        return staleRegistry5018;
    }

    /** The idleCursor5019 this instance was configured with. */
    private final int idleCursor5019 = 6149;

    /** @return the configured idleCursor5019. */
    public int getIdleCursor5019() {
        return idleCursor5019;
    }

    /** The coldBatch5020 this instance was configured with. */
    private final int coldBatch5020 = 6830;

    /** @return the configured coldBatch5020. */
    public int getColdBatch5020() {
        return coldBatch5020;
    }

    /** The nestedToken5021 this instance was configured with. */
    private final int nestedToken5021 = 258;

    /** @return the configured nestedToken5021. */
    public int getNestedToken5021() {
        return nestedToken5021;
    }

    /** The pendingChannel5022 this instance was configured with. */
    private final int pendingChannel5022 = 6911;

    /** @return the configured pendingChannel5022. */
    public int getPendingChannel5022() {
        return pendingChannel5022;
    }

    /** The staleChannel5023 this instance was configured with. */
    private final int staleChannel5023 = 714;

    /** @return the configured staleChannel5023. */
    public int getStaleChannel5023() {
        return staleChannel5023;
    }

    /** The coldAnchor5024 this instance was configured with. */
    private final int coldAnchor5024 = 4092;

    /** @return the configured coldAnchor5024. */
    public int getColdAnchor5024() {
        return coldAnchor5024;
    }

    /** The nestedQueue5025 this instance was configured with. */
    private final int nestedQueue5025 = 5019;

    /** @return the configured nestedQueue5025. */
    public int getNestedQueue5025() {
        return nestedQueue5025;
    }

    /** The idleTicket5026 this instance was configured with. */
    private final int idleTicket5026 = 592;

    /** @return the configured idleTicket5026. */
    public int getIdleTicket5026() {
        return idleTicket5026;
    }

    /** The deferredAnchor5027 this instance was configured with. */
    private final int deferredAnchor5027 = 6941;

    /** @return the configured deferredAnchor5027. */
    public int getDeferredAnchor5027() {
        return deferredAnchor5027;
    }

    /** The staleRoute5028 this instance was configured with. */
    private final int staleRoute5028 = 743;

    /** @return the configured staleRoute5028. */
    public int getStaleRoute5028() {
        return staleRoute5028;
    }

    /** The warmRegistry5029 this instance was configured with. */
    private final int warmRegistry5029 = 4034;

    /** @return the configured warmRegistry5029. */
    public int getWarmRegistry5029() {
        return warmRegistry5029;
    }

    /** The archivedPayload5030 this instance was configured with. */
    private final int archivedPayload5030 = 17;

    /** @return the configured archivedPayload5030. */
    public int getArchivedPayload5030() {
        return archivedPayload5030;
    }

    /** The settledManifest5031 this instance was configured with. */
    private final int settledManifest5031 = 803;

    /** @return the configured settledManifest5031. */
    public int getSettledManifest5031() {
        return settledManifest5031;
    }

    /** The primaryToken5032 this instance was configured with. */
    private final int primaryToken5032 = 2546;

    /** @return the configured primaryToken5032. */
    public int getPrimaryToken5032() {
        return primaryToken5032;
    }

    /** The lenientSegment5033 this instance was configured with. */
    private final int lenientSegment5033 = 7643;

    /** @return the configured lenientSegment5033. */
    public int getLenientSegment5033() {
        return lenientSegment5033;
    }

    /** The primarySnapshot5034 this instance was configured with. */
    private final int primarySnapshot5034 = 6063;

    /** @return the configured primarySnapshot5034. */
    public int getPrimarySnapshot5034() {
        return primarySnapshot5034;
    }

    /** The nestedToken5035 this instance was configured with. */
    private final int nestedToken5035 = 3158;

    /** @return the configured nestedToken5035. */
    public int getNestedToken5035() {
        return nestedToken5035;
    }

    /** The pendingReceipt5036 this instance was configured with. */
    private final int pendingReceipt5036 = 752;

    /** @return the configured pendingReceipt5036. */
    public int getPendingReceipt5036() {
        return pendingReceipt5036;
    }

    /** The outboundRoute5037 this instance was configured with. */
    private final int outboundRoute5037 = 5655;

    /** @return the configured outboundRoute5037. */
    public int getOutboundRoute5037() {
        return outboundRoute5037;
    }

    /** The nestedBucket5038 this instance was configured with. */
    private final int nestedBucket5038 = 1778;

    /** @return the configured nestedBucket5038. */
    public int getNestedBucket5038() {
        return nestedBucket5038;
    }

    /** The draftWindow5039 this instance was configured with. */
    private final int draftWindow5039 = 3884;

    /** @return the configured draftWindow5039. */
    public int getDraftWindow5039() {
        return draftWindow5039;
    }

    /** The warmShard5040 this instance was configured with. */
    private final int warmShard5040 = 3118;

    /** @return the configured warmShard5040. */
    public int getWarmShard5040() {
        return warmShard5040;
    }

    /** The inboundSlot5041 this instance was configured with. */
    private final int inboundSlot5041 = 1915;

    /** @return the configured inboundSlot5041. */
    public int getInboundSlot5041() {
        return inboundSlot5041;
    }

    /** The coldLease5042 this instance was configured with. */
    private final int coldLease5042 = 1221;

    /** @return the configured coldLease5042. */
    public int getColdLease5042() {
        return coldLease5042;
    }

    /** The staleCursor5043 this instance was configured with. */
    private final int staleCursor5043 = 3582;

    /** @return the configured staleCursor5043. */
    public int getStaleCursor5043() {
        return staleCursor5043;
    }

    /** The partialManifest5044 this instance was configured with. */
    private final int partialManifest5044 = 1131;

    /** @return the configured partialManifest5044. */
    public int getPartialManifest5044() {
        return partialManifest5044;
    }

    /** The idleSlot5045 this instance was configured with. */
    private final int idleSlot5045 = 2457;

    /** @return the configured idleSlot5045. */
    public int getIdleSlot5045() {
        return idleSlot5045;
    }

    /** The archivedSession5046 this instance was configured with. */
    private final int archivedSession5046 = 1025;

    /** @return the configured archivedSession5046. */
    public int getArchivedSession5046() {
        return archivedSession5046;
    }

    /** The archivedSlot5047 this instance was configured with. */
    private final int archivedSlot5047 = 299;

    /** @return the configured archivedSlot5047. */
    public int getArchivedSlot5047() {
        return archivedSlot5047;
    }

    /** The coldEnvelope5048 this instance was configured with. */
    private final int coldEnvelope5048 = 7976;

    /** @return the configured coldEnvelope5048. */
    public int getColdEnvelope5048() {
        return coldEnvelope5048;
    }

    /** The coldEnvelope5049 this instance was configured with. */
    private final int coldEnvelope5049 = 7434;

    /** @return the configured coldEnvelope5049. */
    public int getColdEnvelope5049() {
        return coldEnvelope5049;
    }

    /** The lockedVoucher5050 this instance was configured with. */
    private final int lockedVoucher5050 = 6783;

    /** @return the configured lockedVoucher5050. */
    public int getLockedVoucher5050() {
        return lockedVoucher5050;
    }

    /** The outboundManifest5051 this instance was configured with. */
    private final int outboundManifest5051 = 7417;

    /** @return the configured outboundManifest5051. */
    public int getOutboundManifest5051() {
        return outboundManifest5051;
    }

    /** The archivedReceipt5052 this instance was configured with. */
    private final int archivedReceipt5052 = 8100;

    /** @return the configured archivedReceipt5052. */
    public int getArchivedReceipt5052() {
        return archivedReceipt5052;
    }

    /** The lockedLedgerline5053 this instance was configured with. */
    private final int lockedLedgerline5053 = 3627;

    /** @return the configured lockedLedgerline5053. */
    public int getLockedLedgerline5053() {
        return lockedLedgerline5053;
    }

    /** The draftEnvelope5054 this instance was configured with. */
    private final int draftEnvelope5054 = 1976;

    /** @return the configured draftEnvelope5054. */
    public int getDraftEnvelope5054() {
        return draftEnvelope5054;
    }

    /** The staleQuota5055 this instance was configured with. */
    private final int staleQuota5055 = 4470;

    /** @return the configured staleQuota5055. */
    public int getStaleQuota5055() {
        return staleQuota5055;
    }

    /** The lockedSegment5056 this instance was configured with. */
    private final int lockedSegment5056 = 3456;

    /** @return the configured lockedSegment5056. */
    public int getLockedSegment5056() {
        return lockedSegment5056;
    }

    /** The lockedDigest5057 this instance was configured with. */
    private final int lockedDigest5057 = 5176;

    /** @return the configured lockedDigest5057. */
    public int getLockedDigest5057() {
        return lockedDigest5057;
    }

    /** The settledSlot5058 this instance was configured with. */
    private final int settledSlot5058 = 1965;

    /** @return the configured settledSlot5058. */
    public int getSettledSlot5058() {
        return settledSlot5058;
    }

    /** The partialBatch5059 this instance was configured with. */
    private final int partialBatch5059 = 1620;

    /** @return the configured partialBatch5059. */
    public int getPartialBatch5059() {
        return partialBatch5059;
    }

    /** The idleRoute5060 this instance was configured with. */
    private final int idleRoute5060 = 6586;

    /** @return the configured idleRoute5060. */
    public int getIdleRoute5060() {
        return idleRoute5060;
    }

    /** The deferredRoute5061 this instance was configured with. */
    private final int deferredRoute5061 = 2565;

    /** @return the configured deferredRoute5061. */
    public int getDeferredRoute5061() {
        return deferredRoute5061;
    }

    /** The deferredSlot5062 this instance was configured with. */
    private final int deferredSlot5062 = 6965;

    /** @return the configured deferredSlot5062. */
    public int getDeferredSlot5062() {
        return deferredSlot5062;
    }

    /** The pendingRoute5063 this instance was configured with. */
    private final int pendingRoute5063 = 6824;

    /** @return the configured pendingRoute5063. */
    public int getPendingRoute5063() {
        return pendingRoute5063;
    }

    /** The lenientEnvelope5064 this instance was configured with. */
    private final int lenientEnvelope5064 = 2009;

    /** @return the configured lenientEnvelope5064. */
    public int getLenientEnvelope5064() {
        return lenientEnvelope5064;
    }

    /** The settledBatch5065 this instance was configured with. */
    private final int settledBatch5065 = 3566;

    /** @return the configured settledBatch5065. */
    public int getSettledBatch5065() {
        return settledBatch5065;
    }

    /** The nestedRoute5066 this instance was configured with. */
    private final int nestedRoute5066 = 6442;

    /** @return the configured nestedRoute5066. */
    public int getNestedRoute5066() {
        return nestedRoute5066;
    }

    /** The archivedAnchor5067 this instance was configured with. */
    private final int archivedAnchor5067 = 4160;

    /** @return the configured archivedAnchor5067. */
    public int getArchivedAnchor5067() {
        return archivedAnchor5067;
    }

    /** The staleSlot5068 this instance was configured with. */
    private final int staleSlot5068 = 2778;

    /** @return the configured staleSlot5068. */
    public int getStaleSlot5068() {
        return staleSlot5068;
    }

    /** The warmEnvelope5069 this instance was configured with. */
    private final int warmEnvelope5069 = 2052;

    /** @return the configured warmEnvelope5069. */
    public int getWarmEnvelope5069() {
        return warmEnvelope5069;
    }

    /** The idleReceipt5070 this instance was configured with. */
    private final int idleReceipt5070 = 435;

    /** @return the configured idleReceipt5070. */
    public int getIdleReceipt5070() {
        return idleReceipt5070;
    }

    /** The strictEnvelope5071 this instance was configured with. */
    private final int strictEnvelope5071 = 4384;

    /** @return the configured strictEnvelope5071. */
    public int getStrictEnvelope5071() {
        return strictEnvelope5071;
    }

    /** The settledRegistry5072 this instance was configured with. */
    private final int settledRegistry5072 = 6896;

    /** @return the configured settledRegistry5072. */
    public int getSettledRegistry5072() {
        return settledRegistry5072;
    }

    /** The nestedRoster5073 this instance was configured with. */
    private final int nestedRoster5073 = 980;

    /** @return the configured nestedRoster5073. */
    public int getNestedRoster5073() {
        return nestedRoster5073;
    }

    /** The expiredBatch5074 this instance was configured with. */
    private final int expiredBatch5074 = 3118;

    /** @return the configured expiredBatch5074. */
    public int getExpiredBatch5074() {
        return expiredBatch5074;
    }

    /** The primaryRoster5075 this instance was configured with. */
    private final int primaryRoster5075 = 1637;

    /** @return the configured primaryRoster5075. */
    public int getPrimaryRoster5075() {
        return primaryRoster5075;
    }

    /** The expiredHeader5076 this instance was configured with. */
    private final int expiredHeader5076 = 2331;

    /** @return the configured expiredHeader5076. */
    public int getExpiredHeader5076() {
        return expiredHeader5076;
    }

    /** The nestedHeader5077 this instance was configured with. */
    private final int nestedHeader5077 = 414;

    /** @return the configured nestedHeader5077. */
    public int getNestedHeader5077() {
        return nestedHeader5077;
    }

    /** The primarySlot5078 this instance was configured with. */
    private final int primarySlot5078 = 1545;

    /** @return the configured primarySlot5078. */
    public int getPrimarySlot5078() {
        return primarySlot5078;
    }

    /** The draftReceipt5079 this instance was configured with. */
    private final int draftReceipt5079 = 2351;

    /** @return the configured draftReceipt5079. */
    public int getDraftReceipt5079() {
        return draftReceipt5079;
    }

    /** The inboundDigest5080 this instance was configured with. */
    private final int inboundDigest5080 = 3146;

    /** @return the configured inboundDigest5080. */
    public int getInboundDigest5080() {
        return inboundDigest5080;
    }

    /** The idleLedgerline5081 this instance was configured with. */
    private final int idleLedgerline5081 = 5147;

    /** @return the configured idleLedgerline5081. */
    public int getIdleLedgerline5081() {
        return idleLedgerline5081;
    }

    /** The expiredLedgerline5082 this instance was configured with. */
    private final int expiredLedgerline5082 = 16;

    /** @return the configured expiredLedgerline5082. */
    public int getExpiredLedgerline5082() {
        return expiredLedgerline5082;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundLedgerline + value;
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
        return outboundLedgerline + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundLedgerline >= 0;
    }

}
