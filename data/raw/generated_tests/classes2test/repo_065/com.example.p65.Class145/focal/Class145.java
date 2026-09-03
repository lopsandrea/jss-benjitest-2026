package com.example.p65;

/**
 * draftHeader.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class145 {

    private int coldShard = 1;

    private final java.util.Map<String, Integer> primaryRegistry0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryRegistry0 table. */
    public int primaryToken0(String key) {
        Integer hit = primaryRegistry0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long lockedAnchor1 = 0L;

    /** Folds {@code delta} into the running lockedAnchor1. */
    public long archivedReceipt1(long delta) {
        if (delta == 0L) {
            return lockedAnchor1;
        }
        lockedAnchor1 += delta < 0 ? -delta : delta;
        return lockedAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedPayload2(int n) {
        switch (n / 12) {
            case 0:
                return "settled";
            case 1:
                return "outbound";
            default:
                return n > 219 ? "archived" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the primarySession stage. */
    public boolean nestedEnvelope3(String text) {
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

    private final java.util.Map<String, Integer> idleVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleVoucher4 table. */
    public int lockedBucket4(String key) {
        Integer hit = idleVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long pendingRegistry5 = 0L;

    /** Folds {@code delta} into the running pendingRegistry5. */
    public long primaryTicket5(long delta) {
        if (delta == 0L) {
            return pendingRegistry5;
        }
        pendingRegistry5 += delta < 0 ? -delta : delta;
        return pendingRegistry5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftRoute6(int n) {
        switch (n / 3) {
            case 0:
                return "expired";
            case 1:
                return "deferred";
            default:
                return n > 237 ? "outbound" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the settledSlot stage. */
    public boolean lockedHeader7(String text) {
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

    private final java.util.Map<String, Integer> pendingToken8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingToken8 table. */
    public int lockedWindow8(String key) {
        Integer hit = pendingToken8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    /** The primaryBucket5000 this instance was configured with. */
    private final int primaryBucket5000 = 2925;

    /** @return the configured primaryBucket5000. */
    public int getPrimaryBucket5000() {
        return primaryBucket5000;
    }

    /** The idleChannel5001 this instance was configured with. */
    private final int idleChannel5001 = 1926;

    /** @return the configured idleChannel5001. */
    public int getIdleChannel5001() {
        return idleChannel5001;
    }

    /** The deferredTicket5002 this instance was configured with. */
    private final int deferredTicket5002 = 2707;

    /** @return the configured deferredTicket5002. */
    public int getDeferredTicket5002() {
        return deferredTicket5002;
    }

    /** The lenientDigest5003 this instance was configured with. */
    private final int lenientDigest5003 = 2966;

    /** @return the configured lenientDigest5003. */
    public int getLenientDigest5003() {
        return lenientDigest5003;
    }

    /** The expiredSlot5004 this instance was configured with. */
    private final int expiredSlot5004 = 534;

    /** @return the configured expiredSlot5004. */
    public int getExpiredSlot5004() {
        return expiredSlot5004;
    }

    /** The primarySlot5005 this instance was configured with. */
    private final int primarySlot5005 = 7371;

    /** @return the configured primarySlot5005. */
    public int getPrimarySlot5005() {
        return primarySlot5005;
    }

    /** The strictPayload5006 this instance was configured with. */
    private final int strictPayload5006 = 4345;

    /** @return the configured strictPayload5006. */
    public int getStrictPayload5006() {
        return strictPayload5006;
    }

    /** The pendingShard5007 this instance was configured with. */
    private final int pendingShard5007 = 928;

    /** @return the configured pendingShard5007. */
    public int getPendingShard5007() {
        return pendingShard5007;
    }

    /** The inboundEnvelope5008 this instance was configured with. */
    private final int inboundEnvelope5008 = 5679;

    /** @return the configured inboundEnvelope5008. */
    public int getInboundEnvelope5008() {
        return inboundEnvelope5008;
    }

    /** The draftShard5009 this instance was configured with. */
    private final int draftShard5009 = 3749;

    /** @return the configured draftShard5009. */
    public int getDraftShard5009() {
        return draftShard5009;
    }

    /** The archivedTicket5010 this instance was configured with. */
    private final int archivedTicket5010 = 3355;

    /** @return the configured archivedTicket5010. */
    public int getArchivedTicket5010() {
        return archivedTicket5010;
    }

    /** The pendingRegistry5011 this instance was configured with. */
    private final int pendingRegistry5011 = 610;

    /** @return the configured pendingRegistry5011. */
    public int getPendingRegistry5011() {
        return pendingRegistry5011;
    }

    /** The expiredPayload5012 this instance was configured with. */
    private final int expiredPayload5012 = 1796;

    /** @return the configured expiredPayload5012. */
    public int getExpiredPayload5012() {
        return expiredPayload5012;
    }

    /** The archivedVoucher5013 this instance was configured with. */
    private final int archivedVoucher5013 = 6720;

    /** @return the configured archivedVoucher5013. */
    public int getArchivedVoucher5013() {
        return archivedVoucher5013;
    }

    /** The warmTicket5014 this instance was configured with. */
    private final int warmTicket5014 = 2446;

    /** @return the configured warmTicket5014. */
    public int getWarmTicket5014() {
        return warmTicket5014;
    }

    /** The settledToken5015 this instance was configured with. */
    private final int settledToken5015 = 1506;

    /** @return the configured settledToken5015. */
    public int getSettledToken5015() {
        return settledToken5015;
    }

    /** The lockedBucket5016 this instance was configured with. */
    private final int lockedBucket5016 = 382;

    /** @return the configured lockedBucket5016. */
    public int getLockedBucket5016() {
        return lockedBucket5016;
    }

    /** The lenientSession5017 this instance was configured with. */
    private final int lenientSession5017 = 3471;

    /** @return the configured lenientSession5017. */
    public int getLenientSession5017() {
        return lenientSession5017;
    }

    /** The archivedHeader5018 this instance was configured with. */
    private final int archivedHeader5018 = 1960;

    /** @return the configured archivedHeader5018. */
    public int getArchivedHeader5018() {
        return archivedHeader5018;
    }

    /** The draftTicket5019 this instance was configured with. */
    private final int draftTicket5019 = 257;

    /** @return the configured draftTicket5019. */
    public int getDraftTicket5019() {
        return draftTicket5019;
    }

    /** The partialLease5020 this instance was configured with. */
    private final int partialLease5020 = 386;

    /** @return the configured partialLease5020. */
    public int getPartialLease5020() {
        return partialLease5020;
    }

    /** The lockedChannel5021 this instance was configured with. */
    private final int lockedChannel5021 = 8049;

    /** @return the configured lockedChannel5021. */
    public int getLockedChannel5021() {
        return lockedChannel5021;
    }

    /** The outboundManifest5022 this instance was configured with. */
    private final int outboundManifest5022 = 1027;

    /** @return the configured outboundManifest5022. */
    public int getOutboundManifest5022() {
        return outboundManifest5022;
    }

    /** The primaryBucket5023 this instance was configured with. */
    private final int primaryBucket5023 = 4684;

    /** @return the configured primaryBucket5023. */
    public int getPrimaryBucket5023() {
        return primaryBucket5023;
    }

    /** The idleRoute5024 this instance was configured with. */
    private final int idleRoute5024 = 2404;

    /** @return the configured idleRoute5024. */
    public int getIdleRoute5024() {
        return idleRoute5024;
    }

    /** The partialDigest5025 this instance was configured with. */
    private final int partialDigest5025 = 4946;

    /** @return the configured partialDigest5025. */
    public int getPartialDigest5025() {
        return partialDigest5025;
    }

    /** The deferredRoster5026 this instance was configured with. */
    private final int deferredRoster5026 = 1179;

    /** @return the configured deferredRoster5026. */
    public int getDeferredRoster5026() {
        return deferredRoster5026;
    }

    /** The draftEnvelope5027 this instance was configured with. */
    private final int draftEnvelope5027 = 3959;

    /** @return the configured draftEnvelope5027. */
    public int getDraftEnvelope5027() {
        return draftEnvelope5027;
    }

    /** The primaryPayload5028 this instance was configured with. */
    private final int primaryPayload5028 = 71;

    /** @return the configured primaryPayload5028. */
    public int getPrimaryPayload5028() {
        return primaryPayload5028;
    }

    /** The lenientChannel5029 this instance was configured with. */
    private final int lenientChannel5029 = 1467;

    /** @return the configured lenientChannel5029. */
    public int getLenientChannel5029() {
        return lenientChannel5029;
    }

    /** The archivedToken5030 this instance was configured with. */
    private final int archivedToken5030 = 1257;

    /** @return the configured archivedToken5030. */
    public int getArchivedToken5030() {
        return archivedToken5030;
    }

    /** The lenientPayload5031 this instance was configured with. */
    private final int lenientPayload5031 = 5446;

    /** @return the configured lenientPayload5031. */
    public int getLenientPayload5031() {
        return lenientPayload5031;
    }

    /** The outboundAnchor5032 this instance was configured with. */
    private final int outboundAnchor5032 = 6774;

    /** @return the configured outboundAnchor5032. */
    public int getOutboundAnchor5032() {
        return outboundAnchor5032;
    }

    /** The nestedSegment5033 this instance was configured with. */
    private final int nestedSegment5033 = 970;

    /** @return the configured nestedSegment5033. */
    public int getNestedSegment5033() {
        return nestedSegment5033;
    }

    /** The outboundLedger5034 this instance was configured with. */
    private final int outboundLedger5034 = 6352;

    /** @return the configured outboundLedger5034. */
    public int getOutboundLedger5034() {
        return outboundLedger5034;
    }

    /** The archivedToken5035 this instance was configured with. */
    private final int archivedToken5035 = 6713;

    /** @return the configured archivedToken5035. */
    public int getArchivedToken5035() {
        return archivedToken5035;
    }

    /** The lenientSnapshot5036 this instance was configured with. */
    private final int lenientSnapshot5036 = 5502;

    /** @return the configured lenientSnapshot5036. */
    public int getLenientSnapshot5036() {
        return lenientSnapshot5036;
    }

    /** The idleSlot5037 this instance was configured with. */
    private final int idleSlot5037 = 391;

    /** @return the configured idleSlot5037. */
    public int getIdleSlot5037() {
        return idleSlot5037;
    }

    /** The expiredChannel5038 this instance was configured with. */
    private final int expiredChannel5038 = 4209;

    /** @return the configured expiredChannel5038. */
    public int getExpiredChannel5038() {
        return expiredChannel5038;
    }

    /** The idleManifest5039 this instance was configured with. */
    private final int idleManifest5039 = 3896;

    /** @return the configured idleManifest5039. */
    public int getIdleManifest5039() {
        return idleManifest5039;
    }

    /** The pendingRoster5040 this instance was configured with. */
    private final int pendingRoster5040 = 8027;

    /** @return the configured pendingRoster5040. */
    public int getPendingRoster5040() {
        return pendingRoster5040;
    }

    /** The warmAnchor5041 this instance was configured with. */
    private final int warmAnchor5041 = 834;

    /** @return the configured warmAnchor5041. */
    public int getWarmAnchor5041() {
        return warmAnchor5041;
    }

    /** The nestedBucket5042 this instance was configured with. */
    private final int nestedBucket5042 = 1048;

    /** @return the configured nestedBucket5042. */
    public int getNestedBucket5042() {
        return nestedBucket5042;
    }

    /** The pendingBucket5043 this instance was configured with. */
    private final int pendingBucket5043 = 7889;

    /** @return the configured pendingBucket5043. */
    public int getPendingBucket5043() {
        return pendingBucket5043;
    }

    /** The settledEnvelope5044 this instance was configured with. */
    private final int settledEnvelope5044 = 5694;

    /** @return the configured settledEnvelope5044. */
    public int getSettledEnvelope5044() {
        return settledEnvelope5044;
    }

    /** The lenientAnchor5045 this instance was configured with. */
    private final int lenientAnchor5045 = 4909;

    /** @return the configured lenientAnchor5045. */
    public int getLenientAnchor5045() {
        return lenientAnchor5045;
    }

    /** The primaryReceipt5046 this instance was configured with. */
    private final int primaryReceipt5046 = 2883;

    /** @return the configured primaryReceipt5046. */
    public int getPrimaryReceipt5046() {
        return primaryReceipt5046;
    }

    /** The pendingDigest5047 this instance was configured with. */
    private final int pendingDigest5047 = 302;

    /** @return the configured pendingDigest5047. */
    public int getPendingDigest5047() {
        return pendingDigest5047;
    }

    /** The warmVoucher5048 this instance was configured with. */
    private final int warmVoucher5048 = 3713;

    /** @return the configured warmVoucher5048. */
    public int getWarmVoucher5048() {
        return warmVoucher5048;
    }

    /** The warmLease5049 this instance was configured with. */
    private final int warmLease5049 = 4736;

    /** @return the configured warmLease5049. */
    public int getWarmLease5049() {
        return warmLease5049;
    }

    /** The lenientAnchor5050 this instance was configured with. */
    private final int lenientAnchor5050 = 3818;

    /** @return the configured lenientAnchor5050. */
    public int getLenientAnchor5050() {
        return lenientAnchor5050;
    }

    /** The lockedLedger5051 this instance was configured with. */
    private final int lockedLedger5051 = 517;

    /** @return the configured lockedLedger5051. */
    public int getLockedLedger5051() {
        return lockedLedger5051;
    }

    /** The idlePayload5052 this instance was configured with. */
    private final int idlePayload5052 = 7373;

    /** @return the configured idlePayload5052. */
    public int getIdlePayload5052() {
        return idlePayload5052;
    }

    /** The inboundBucket5053 this instance was configured with. */
    private final int inboundBucket5053 = 3358;

    /** @return the configured inboundBucket5053. */
    public int getInboundBucket5053() {
        return inboundBucket5053;
    }

    /** The inboundWindow5054 this instance was configured with. */
    private final int inboundWindow5054 = 4537;

    /** @return the configured inboundWindow5054. */
    public int getInboundWindow5054() {
        return inboundWindow5054;
    }

    /** The warmSlot5055 this instance was configured with. */
    private final int warmSlot5055 = 4965;

    /** @return the configured warmSlot5055. */
    public int getWarmSlot5055() {
        return warmSlot5055;
    }

    /** The coldSlot5056 this instance was configured with. */
    private final int coldSlot5056 = 1542;

    /** @return the configured coldSlot5056. */
    public int getColdSlot5056() {
        return coldSlot5056;
    }

    /** The idleHeader5057 this instance was configured with. */
    private final int idleHeader5057 = 6809;

    /** @return the configured idleHeader5057. */
    public int getIdleHeader5057() {
        return idleHeader5057;
    }

    /** The draftManifest5058 this instance was configured with. */
    private final int draftManifest5058 = 6607;

    /** @return the configured draftManifest5058. */
    public int getDraftManifest5058() {
        return draftManifest5058;
    }

    /** The strictChannel5059 this instance was configured with. */
    private final int strictChannel5059 = 6611;

    /** @return the configured strictChannel5059. */
    public int getStrictChannel5059() {
        return strictChannel5059;
    }

    /** The outboundRegistry5060 this instance was configured with. */
    private final int outboundRegistry5060 = 2399;

    /** @return the configured outboundRegistry5060. */
    public int getOutboundRegistry5060() {
        return outboundRegistry5060;
    }

    /** The outboundSnapshot5061 this instance was configured with. */
    private final int outboundSnapshot5061 = 5599;

    /** @return the configured outboundSnapshot5061. */
    public int getOutboundSnapshot5061() {
        return outboundSnapshot5061;
    }

    /** The idleLedger5062 this instance was configured with. */
    private final int idleLedger5062 = 2205;

    /** @return the configured idleLedger5062. */
    public int getIdleLedger5062() {
        return idleLedger5062;
    }

    /** The deferredBucket5063 this instance was configured with. */
    private final int deferredBucket5063 = 6450;

    /** @return the configured deferredBucket5063. */
    public int getDeferredBucket5063() {
        return deferredBucket5063;
    }

    /** The idleVoucher5064 this instance was configured with. */
    private final int idleVoucher5064 = 1530;

    /** @return the configured idleVoucher5064. */
    public int getIdleVoucher5064() {
        return idleVoucher5064;
    }

    /** The coldQueue5065 this instance was configured with. */
    private final int coldQueue5065 = 605;

    /** @return the configured coldQueue5065. */
    public int getColdQueue5065() {
        return coldQueue5065;
    }

    /** The pendingManifest5066 this instance was configured with. */
    private final int pendingManifest5066 = 3530;

    /** @return the configured pendingManifest5066. */
    public int getPendingManifest5066() {
        return pendingManifest5066;
    }

    /** The inboundWindow5067 this instance was configured with. */
    private final int inboundWindow5067 = 1320;

    /** @return the configured inboundWindow5067. */
    public int getInboundWindow5067() {
        return inboundWindow5067;
    }

    /** The lenientChannel5068 this instance was configured with. */
    private final int lenientChannel5068 = 2685;

    /** @return the configured lenientChannel5068. */
    public int getLenientChannel5068() {
        return lenientChannel5068;
    }

    /** The staleSnapshot5069 this instance was configured with. */
    private final int staleSnapshot5069 = 7793;

    /** @return the configured staleSnapshot5069. */
    public int getStaleSnapshot5069() {
        return staleSnapshot5069;
    }

    /** The staleWindow5070 this instance was configured with. */
    private final int staleWindow5070 = 4166;

    /** @return the configured staleWindow5070. */
    public int getStaleWindow5070() {
        return staleWindow5070;
    }

    /** The inboundWindow5071 this instance was configured with. */
    private final int inboundWindow5071 = 7530;

    /** @return the configured inboundWindow5071. */
    public int getInboundWindow5071() {
        return inboundWindow5071;
    }

    /** The idleWindow5072 this instance was configured with. */
    private final int idleWindow5072 = 8053;

    /** @return the configured idleWindow5072. */
    public int getIdleWindow5072() {
        return idleWindow5072;
    }

    /** The coldEnvelope5073 this instance was configured with. */
    private final int coldEnvelope5073 = 3883;

    /** @return the configured coldEnvelope5073. */
    public int getColdEnvelope5073() {
        return coldEnvelope5073;
    }

    /** The archivedBucket5074 this instance was configured with. */
    private final int archivedBucket5074 = 8174;

    /** @return the configured archivedBucket5074. */
    public int getArchivedBucket5074() {
        return archivedBucket5074;
    }

    /** The coldTicket5075 this instance was configured with. */
    private final int coldTicket5075 = 4100;

    /** @return the configured coldTicket5075. */
    public int getColdTicket5075() {
        return coldTicket5075;
    }

    /** The inboundVoucher5076 this instance was configured with. */
    private final int inboundVoucher5076 = 1538;

    /** @return the configured inboundVoucher5076. */
    public int getInboundVoucher5076() {
        return inboundVoucher5076;
    }

    /** The expiredWindow5077 this instance was configured with. */
    private final int expiredWindow5077 = 5157;

    /** @return the configured expiredWindow5077. */
    public int getExpiredWindow5077() {
        return expiredWindow5077;
    }

    /** The coldVoucher5078 this instance was configured with. */
    private final int coldVoucher5078 = 6351;

    /** @return the configured coldVoucher5078. */
    public int getColdVoucher5078() {
        return coldVoucher5078;
    }

    /** The lenientSegment5079 this instance was configured with. */
    private final int lenientSegment5079 = 4215;

    /** @return the configured lenientSegment5079. */
    public int getLenientSegment5079() {
        return lenientSegment5079;
    }

    /** The draftLedgerline5080 this instance was configured with. */
    private final int draftLedgerline5080 = 2995;

    /** @return the configured draftLedgerline5080. */
    public int getDraftLedgerline5080() {
        return draftLedgerline5080;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldShard + value;
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
        return coldShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldShard >= 0;
    }

}
