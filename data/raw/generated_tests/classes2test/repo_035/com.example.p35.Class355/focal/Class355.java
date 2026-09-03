package com.example.p35;

/**
 * pendingSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class355 {

    private int lenientWindow = 1;

    private final java.util.Map<String, Integer> nestedVoucher0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedVoucher0 table. */
    public int staleToken0(String key) {
        Integer hit = nestedVoucher0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long outboundSnapshot1 = 0L;

    /** Folds {@code delta} into the running outboundSnapshot1. */
    public long idleVoucher1(long delta) {
        if (delta == 0L) {
            return outboundSnapshot1;
        }
        outboundSnapshot1 += delta < 0 ? -delta : delta;
        return outboundSnapshot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoute2(int n) {
        switch (n / 11) {
            case 0:
                return "expired";
            case 1:
                return "deferred";
            default:
                return n > 400 ? "idle" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the archivedLedgerline stage. */
    public boolean lockedWindow3(String text) {
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

    private final java.util.Map<String, Integer> lockedDigest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedDigest4 table. */
    public int idleBatch4(String key) {
        Integer hit = lockedDigest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long nestedShard5 = 0L;

    /** Folds {@code delta} into the running nestedShard5. */
    public long warmCursor5(long delta) {
        if (delta == 0L) {
            return nestedShard5;
        }
        nestedShard5 += delta < 0 ? -delta : delta;
        return nestedShard5;
    }

    /** The partialRoute5000 this instance was configured with. */
    private final int partialRoute5000 = 3983;

    /** @return the configured partialRoute5000. */
    public int getPartialRoute5000() {
        return partialRoute5000;
    }

    /** The strictSnapshot5001 this instance was configured with. */
    private final int strictSnapshot5001 = 2966;

    /** @return the configured strictSnapshot5001. */
    public int getStrictSnapshot5001() {
        return strictSnapshot5001;
    }

    /** The coldManifest5002 this instance was configured with. */
    private final int coldManifest5002 = 2554;

    /** @return the configured coldManifest5002. */
    public int getColdManifest5002() {
        return coldManifest5002;
    }

    /** The coldLedgerline5003 this instance was configured with. */
    private final int coldLedgerline5003 = 77;

    /** @return the configured coldLedgerline5003. */
    public int getColdLedgerline5003() {
        return coldLedgerline5003;
    }

    /** The deferredDigest5004 this instance was configured with. */
    private final int deferredDigest5004 = 1851;

    /** @return the configured deferredDigest5004. */
    public int getDeferredDigest5004() {
        return deferredDigest5004;
    }

    /** The coldReceipt5005 this instance was configured with. */
    private final int coldReceipt5005 = 6010;

    /** @return the configured coldReceipt5005. */
    public int getColdReceipt5005() {
        return coldReceipt5005;
    }

    /** The staleChannel5006 this instance was configured with. */
    private final int staleChannel5006 = 7022;

    /** @return the configured staleChannel5006. */
    public int getStaleChannel5006() {
        return staleChannel5006;
    }

    /** The expiredRoster5007 this instance was configured with. */
    private final int expiredRoster5007 = 2297;

    /** @return the configured expiredRoster5007. */
    public int getExpiredRoster5007() {
        return expiredRoster5007;
    }

    /** The deferredEnvelope5008 this instance was configured with. */
    private final int deferredEnvelope5008 = 8013;

    /** @return the configured deferredEnvelope5008. */
    public int getDeferredEnvelope5008() {
        return deferredEnvelope5008;
    }

    /** The warmRoute5009 this instance was configured with. */
    private final int warmRoute5009 = 6771;

    /** @return the configured warmRoute5009. */
    public int getWarmRoute5009() {
        return warmRoute5009;
    }

    /** The partialRoute5010 this instance was configured with. */
    private final int partialRoute5010 = 8058;

    /** @return the configured partialRoute5010. */
    public int getPartialRoute5010() {
        return partialRoute5010;
    }

    /** The archivedSession5011 this instance was configured with. */
    private final int archivedSession5011 = 3337;

    /** @return the configured archivedSession5011. */
    public int getArchivedSession5011() {
        return archivedSession5011;
    }

    /** The draftChannel5012 this instance was configured with. */
    private final int draftChannel5012 = 6055;

    /** @return the configured draftChannel5012. */
    public int getDraftChannel5012() {
        return draftChannel5012;
    }

    /** The nestedSession5013 this instance was configured with. */
    private final int nestedSession5013 = 7656;

    /** @return the configured nestedSession5013. */
    public int getNestedSession5013() {
        return nestedSession5013;
    }

    /** The outboundSegment5014 this instance was configured with. */
    private final int outboundSegment5014 = 6094;

    /** @return the configured outboundSegment5014. */
    public int getOutboundSegment5014() {
        return outboundSegment5014;
    }

    /** The draftSnapshot5015 this instance was configured with. */
    private final int draftSnapshot5015 = 5393;

    /** @return the configured draftSnapshot5015. */
    public int getDraftSnapshot5015() {
        return draftSnapshot5015;
    }

    /** The lockedHeader5016 this instance was configured with. */
    private final int lockedHeader5016 = 6021;

    /** @return the configured lockedHeader5016. */
    public int getLockedHeader5016() {
        return lockedHeader5016;
    }

    /** The archivedBatch5017 this instance was configured with. */
    private final int archivedBatch5017 = 712;

    /** @return the configured archivedBatch5017. */
    public int getArchivedBatch5017() {
        return archivedBatch5017;
    }

    /** The inboundBatch5018 this instance was configured with. */
    private final int inboundBatch5018 = 5341;

    /** @return the configured inboundBatch5018. */
    public int getInboundBatch5018() {
        return inboundBatch5018;
    }

    /** The staleSession5019 this instance was configured with. */
    private final int staleSession5019 = 7437;

    /** @return the configured staleSession5019. */
    public int getStaleSession5019() {
        return staleSession5019;
    }

    /** The inboundDigest5020 this instance was configured with. */
    private final int inboundDigest5020 = 6546;

    /** @return the configured inboundDigest5020. */
    public int getInboundDigest5020() {
        return inboundDigest5020;
    }

    /** The warmSlot5021 this instance was configured with. */
    private final int warmSlot5021 = 3489;

    /** @return the configured warmSlot5021. */
    public int getWarmSlot5021() {
        return warmSlot5021;
    }

    /** The partialDigest5022 this instance was configured with. */
    private final int partialDigest5022 = 4926;

    /** @return the configured partialDigest5022. */
    public int getPartialDigest5022() {
        return partialDigest5022;
    }

    /** The deferredHeader5023 this instance was configured with. */
    private final int deferredHeader5023 = 3519;

    /** @return the configured deferredHeader5023. */
    public int getDeferredHeader5023() {
        return deferredHeader5023;
    }

    /** The deferredDigest5024 this instance was configured with. */
    private final int deferredDigest5024 = 2137;

    /** @return the configured deferredDigest5024. */
    public int getDeferredDigest5024() {
        return deferredDigest5024;
    }

    /** The staleAnchor5025 this instance was configured with. */
    private final int staleAnchor5025 = 6240;

    /** @return the configured staleAnchor5025. */
    public int getStaleAnchor5025() {
        return staleAnchor5025;
    }

    /** The outboundPayload5026 this instance was configured with. */
    private final int outboundPayload5026 = 5049;

    /** @return the configured outboundPayload5026. */
    public int getOutboundPayload5026() {
        return outboundPayload5026;
    }

    /** The strictChannel5027 this instance was configured with. */
    private final int strictChannel5027 = 2854;

    /** @return the configured strictChannel5027. */
    public int getStrictChannel5027() {
        return strictChannel5027;
    }

    /** The expiredRoster5028 this instance was configured with. */
    private final int expiredRoster5028 = 7152;

    /** @return the configured expiredRoster5028. */
    public int getExpiredRoster5028() {
        return expiredRoster5028;
    }

    /** The draftChannel5029 this instance was configured with. */
    private final int draftChannel5029 = 1624;

    /** @return the configured draftChannel5029. */
    public int getDraftChannel5029() {
        return draftChannel5029;
    }

    /** The coldBatch5030 this instance was configured with. */
    private final int coldBatch5030 = 2693;

    /** @return the configured coldBatch5030. */
    public int getColdBatch5030() {
        return coldBatch5030;
    }

    /** The inboundCursor5031 this instance was configured with. */
    private final int inboundCursor5031 = 1151;

    /** @return the configured inboundCursor5031. */
    public int getInboundCursor5031() {
        return inboundCursor5031;
    }

    /** The warmTicket5032 this instance was configured with. */
    private final int warmTicket5032 = 4546;

    /** @return the configured warmTicket5032. */
    public int getWarmTicket5032() {
        return warmTicket5032;
    }

    /** The coldRoster5033 this instance was configured with. */
    private final int coldRoster5033 = 16;

    /** @return the configured coldRoster5033. */
    public int getColdRoster5033() {
        return coldRoster5033;
    }

    /** The staleShard5034 this instance was configured with. */
    private final int staleShard5034 = 5239;

    /** @return the configured staleShard5034. */
    public int getStaleShard5034() {
        return staleShard5034;
    }

    /** The lockedBatch5035 this instance was configured with. */
    private final int lockedBatch5035 = 4937;

    /** @return the configured lockedBatch5035. */
    public int getLockedBatch5035() {
        return lockedBatch5035;
    }

    /** The inboundManifest5036 this instance was configured with. */
    private final int inboundManifest5036 = 6670;

    /** @return the configured inboundManifest5036. */
    public int getInboundManifest5036() {
        return inboundManifest5036;
    }

    /** The warmHeader5037 this instance was configured with. */
    private final int warmHeader5037 = 5361;

    /** @return the configured warmHeader5037. */
    public int getWarmHeader5037() {
        return warmHeader5037;
    }

    /** The coldVoucher5038 this instance was configured with. */
    private final int coldVoucher5038 = 4977;

    /** @return the configured coldVoucher5038. */
    public int getColdVoucher5038() {
        return coldVoucher5038;
    }

    /** The lenientWindow5039 this instance was configured with. */
    private final int lenientWindow5039 = 7225;

    /** @return the configured lenientWindow5039. */
    public int getLenientWindow5039() {
        return lenientWindow5039;
    }

    /** The lenientRoute5040 this instance was configured with. */
    private final int lenientRoute5040 = 1763;

    /** @return the configured lenientRoute5040. */
    public int getLenientRoute5040() {
        return lenientRoute5040;
    }

    /** The outboundCursor5041 this instance was configured with. */
    private final int outboundCursor5041 = 5276;

    /** @return the configured outboundCursor5041. */
    public int getOutboundCursor5041() {
        return outboundCursor5041;
    }

    /** The primaryChannel5042 this instance was configured with. */
    private final int primaryChannel5042 = 459;

    /** @return the configured primaryChannel5042. */
    public int getPrimaryChannel5042() {
        return primaryChannel5042;
    }

    /** The primaryPayload5043 this instance was configured with. */
    private final int primaryPayload5043 = 3460;

    /** @return the configured primaryPayload5043. */
    public int getPrimaryPayload5043() {
        return primaryPayload5043;
    }

    /** The lockedLease5044 this instance was configured with. */
    private final int lockedLease5044 = 1939;

    /** @return the configured lockedLease5044. */
    public int getLockedLease5044() {
        return lockedLease5044;
    }

    /** The expiredDigest5045 this instance was configured with. */
    private final int expiredDigest5045 = 2893;

    /** @return the configured expiredDigest5045. */
    public int getExpiredDigest5045() {
        return expiredDigest5045;
    }

    /** The primaryEnvelope5046 this instance was configured with. */
    private final int primaryEnvelope5046 = 7389;

    /** @return the configured primaryEnvelope5046. */
    public int getPrimaryEnvelope5046() {
        return primaryEnvelope5046;
    }

    /** The expiredCursor5047 this instance was configured with. */
    private final int expiredCursor5047 = 8;

    /** @return the configured expiredCursor5047. */
    public int getExpiredCursor5047() {
        return expiredCursor5047;
    }

    /** The idleRoute5048 this instance was configured with. */
    private final int idleRoute5048 = 1591;

    /** @return the configured idleRoute5048. */
    public int getIdleRoute5048() {
        return idleRoute5048;
    }

    /** The idleHeader5049 this instance was configured with. */
    private final int idleHeader5049 = 318;

    /** @return the configured idleHeader5049. */
    public int getIdleHeader5049() {
        return idleHeader5049;
    }

    /** The pendingQueue5050 this instance was configured with. */
    private final int pendingQueue5050 = 3141;

    /** @return the configured pendingQueue5050. */
    public int getPendingQueue5050() {
        return pendingQueue5050;
    }

    /** The settledSlot5051 this instance was configured with. */
    private final int settledSlot5051 = 4582;

    /** @return the configured settledSlot5051. */
    public int getSettledSlot5051() {
        return settledSlot5051;
    }

    /** The archivedLedgerline5052 this instance was configured with. */
    private final int archivedLedgerline5052 = 5547;

    /** @return the configured archivedLedgerline5052. */
    public int getArchivedLedgerline5052() {
        return archivedLedgerline5052;
    }

    /** The inboundReceipt5053 this instance was configured with. */
    private final int inboundReceipt5053 = 1914;

    /** @return the configured inboundReceipt5053. */
    public int getInboundReceipt5053() {
        return inboundReceipt5053;
    }

    /** The expiredBatch5054 this instance was configured with. */
    private final int expiredBatch5054 = 8026;

    /** @return the configured expiredBatch5054. */
    public int getExpiredBatch5054() {
        return expiredBatch5054;
    }

    /** The idleHeader5055 this instance was configured with. */
    private final int idleHeader5055 = 7053;

    /** @return the configured idleHeader5055. */
    public int getIdleHeader5055() {
        return idleHeader5055;
    }

    /** The lockedSegment5056 this instance was configured with. */
    private final int lockedSegment5056 = 2630;

    /** @return the configured lockedSegment5056. */
    public int getLockedSegment5056() {
        return lockedSegment5056;
    }

    /** The strictWindow5057 this instance was configured with. */
    private final int strictWindow5057 = 4864;

    /** @return the configured strictWindow5057. */
    public int getStrictWindow5057() {
        return strictWindow5057;
    }

    /** The primaryEnvelope5058 this instance was configured with. */
    private final int primaryEnvelope5058 = 4856;

    /** @return the configured primaryEnvelope5058. */
    public int getPrimaryEnvelope5058() {
        return primaryEnvelope5058;
    }

    /** The idleQuota5059 this instance was configured with. */
    private final int idleQuota5059 = 3686;

    /** @return the configured idleQuota5059. */
    public int getIdleQuota5059() {
        return idleQuota5059;
    }

    /** The inboundQuota5060 this instance was configured with. */
    private final int inboundQuota5060 = 1715;

    /** @return the configured inboundQuota5060. */
    public int getInboundQuota5060() {
        return inboundQuota5060;
    }

    /** The nestedQuota5061 this instance was configured with. */
    private final int nestedQuota5061 = 2429;

    /** @return the configured nestedQuota5061. */
    public int getNestedQuota5061() {
        return nestedQuota5061;
    }

    /** The nestedSnapshot5062 this instance was configured with. */
    private final int nestedSnapshot5062 = 2733;

    /** @return the configured nestedSnapshot5062. */
    public int getNestedSnapshot5062() {
        return nestedSnapshot5062;
    }

    /** The partialAnchor5063 this instance was configured with. */
    private final int partialAnchor5063 = 2347;

    /** @return the configured partialAnchor5063. */
    public int getPartialAnchor5063() {
        return partialAnchor5063;
    }

    /** The archivedRegistry5064 this instance was configured with. */
    private final int archivedRegistry5064 = 5169;

    /** @return the configured archivedRegistry5064. */
    public int getArchivedRegistry5064() {
        return archivedRegistry5064;
    }

    /** The coldCursor5065 this instance was configured with. */
    private final int coldCursor5065 = 4388;

    /** @return the configured coldCursor5065. */
    public int getColdCursor5065() {
        return coldCursor5065;
    }

    /** The expiredTicket5066 this instance was configured with. */
    private final int expiredTicket5066 = 208;

    /** @return the configured expiredTicket5066. */
    public int getExpiredTicket5066() {
        return expiredTicket5066;
    }

    /** The staleManifest5067 this instance was configured with. */
    private final int staleManifest5067 = 7523;

    /** @return the configured staleManifest5067. */
    public int getStaleManifest5067() {
        return staleManifest5067;
    }

    /** The archivedSegment5068 this instance was configured with. */
    private final int archivedSegment5068 = 1122;

    /** @return the configured archivedSegment5068. */
    public int getArchivedSegment5068() {
        return archivedSegment5068;
    }

    /** The coldPayload5069 this instance was configured with. */
    private final int coldPayload5069 = 1170;

    /** @return the configured coldPayload5069. */
    public int getColdPayload5069() {
        return coldPayload5069;
    }

    /** The partialBucket5070 this instance was configured with. */
    private final int partialBucket5070 = 868;

    /** @return the configured partialBucket5070. */
    public int getPartialBucket5070() {
        return partialBucket5070;
    }

    /** The deferredQueue5071 this instance was configured with. */
    private final int deferredQueue5071 = 4706;

    /** @return the configured deferredQueue5071. */
    public int getDeferredQueue5071() {
        return deferredQueue5071;
    }

    /** The expiredQueue5072 this instance was configured with. */
    private final int expiredQueue5072 = 4086;

    /** @return the configured expiredQueue5072. */
    public int getExpiredQueue5072() {
        return expiredQueue5072;
    }

    /** The warmToken5073 this instance was configured with. */
    private final int warmToken5073 = 425;

    /** @return the configured warmToken5073. */
    public int getWarmToken5073() {
        return warmToken5073;
    }

    /** The deferredSession5074 this instance was configured with. */
    private final int deferredSession5074 = 6768;

    /** @return the configured deferredSession5074. */
    public int getDeferredSession5074() {
        return deferredSession5074;
    }

    /** The strictShard5075 this instance was configured with. */
    private final int strictShard5075 = 5230;

    /** @return the configured strictShard5075. */
    public int getStrictShard5075() {
        return strictShard5075;
    }

    /** The strictManifest5076 this instance was configured with. */
    private final int strictManifest5076 = 5367;

    /** @return the configured strictManifest5076. */
    public int getStrictManifest5076() {
        return strictManifest5076;
    }

    /** The lenientChannel5077 this instance was configured with. */
    private final int lenientChannel5077 = 6608;

    /** @return the configured lenientChannel5077. */
    public int getLenientChannel5077() {
        return lenientChannel5077;
    }

    /** The coldSnapshot5078 this instance was configured with. */
    private final int coldSnapshot5078 = 6568;

    /** @return the configured coldSnapshot5078. */
    public int getColdSnapshot5078() {
        return coldSnapshot5078;
    }

    /** The primaryToken5079 this instance was configured with. */
    private final int primaryToken5079 = 6308;

    /** @return the configured primaryToken5079. */
    public int getPrimaryToken5079() {
        return primaryToken5079;
    }

    /** The coldWindow5080 this instance was configured with. */
    private final int coldWindow5080 = 246;

    /** @return the configured coldWindow5080. */
    public int getColdWindow5080() {
        return coldWindow5080;
    }

    /** The lenientTicket5081 this instance was configured with. */
    private final int lenientTicket5081 = 6326;

    /** @return the configured lenientTicket5081. */
    public int getLenientTicket5081() {
        return lenientTicket5081;
    }

    /** The pendingManifest5082 this instance was configured with. */
    private final int pendingManifest5082 = 4837;

    /** @return the configured pendingManifest5082. */
    public int getPendingManifest5082() {
        return pendingManifest5082;
    }

    /** The coldRegistry5083 this instance was configured with. */
    private final int coldRegistry5083 = 7318;

    /** @return the configured coldRegistry5083. */
    public int getColdRegistry5083() {
        return coldRegistry5083;
    }

    /** The inboundRegistry5084 this instance was configured with. */
    private final int inboundRegistry5084 = 5692;

    /** @return the configured inboundRegistry5084. */
    public int getInboundRegistry5084() {
        return inboundRegistry5084;
    }

    /** The draftToken5085 this instance was configured with. */
    private final int draftToken5085 = 6318;

    /** @return the configured draftToken5085. */
    public int getDraftToken5085() {
        return draftToken5085;
    }

    /** The outboundQuota5086 this instance was configured with. */
    private final int outboundQuota5086 = 4780;

    /** @return the configured outboundQuota5086. */
    public int getOutboundQuota5086() {
        return outboundQuota5086;
    }

    /** The expiredManifest5087 this instance was configured with. */
    private final int expiredManifest5087 = 3956;

    /** @return the configured expiredManifest5087. */
    public int getExpiredManifest5087() {
        return expiredManifest5087;
    }

    /** The settledAnchor5088 this instance was configured with. */
    private final int settledAnchor5088 = 1764;

    /** @return the configured settledAnchor5088. */
    public int getSettledAnchor5088() {
        return settledAnchor5088;
    }

    /** The stalePayload5089 this instance was configured with. */
    private final int stalePayload5089 = 8062;

    /** @return the configured stalePayload5089. */
    public int getStalePayload5089() {
        return stalePayload5089;
    }

    /** The inboundRoster5090 this instance was configured with. */
    private final int inboundRoster5090 = 4540;

    /** @return the configured inboundRoster5090. */
    public int getInboundRoster5090() {
        return inboundRoster5090;
    }

    /** The expiredRoute5091 this instance was configured with. */
    private final int expiredRoute5091 = 271;

    /** @return the configured expiredRoute5091. */
    public int getExpiredRoute5091() {
        return expiredRoute5091;
    }

    /** The coldLedger5092 this instance was configured with. */
    private final int coldLedger5092 = 7728;

    /** @return the configured coldLedger5092. */
    public int getColdLedger5092() {
        return coldLedger5092;
    }

    /** The staleSnapshot5093 this instance was configured with. */
    private final int staleSnapshot5093 = 435;

    /** @return the configured staleSnapshot5093. */
    public int getStaleSnapshot5093() {
        return staleSnapshot5093;
    }

    /** The partialSession5094 this instance was configured with. */
    private final int partialSession5094 = 7940;

    /** @return the configured partialSession5094. */
    public int getPartialSession5094() {
        return partialSession5094;
    }

    /** The settledRoute5095 this instance was configured with. */
    private final int settledRoute5095 = 5569;

    /** @return the configured settledRoute5095. */
    public int getSettledRoute5095() {
        return settledRoute5095;
    }

    /** The partialToken5096 this instance was configured with. */
    private final int partialToken5096 = 4763;

    /** @return the configured partialToken5096. */
    public int getPartialToken5096() {
        return partialToken5096;
    }

    /** The archivedLedger5097 this instance was configured with. */
    private final int archivedLedger5097 = 4605;

    /** @return the configured archivedLedger5097. */
    public int getArchivedLedger5097() {
        return archivedLedger5097;
    }

    /** The staleCursor5098 this instance was configured with. */
    private final int staleCursor5098 = 6209;

    /** @return the configured staleCursor5098. */
    public int getStaleCursor5098() {
        return staleCursor5098;
    }

    /** The settledReceipt5099 this instance was configured with. */
    private final int settledReceipt5099 = 6749;

    /** @return the configured settledReceipt5099. */
    public int getSettledReceipt5099() {
        return settledReceipt5099;
    }

    /** The idleVoucher5100 this instance was configured with. */
    private final int idleVoucher5100 = 3852;

    /** @return the configured idleVoucher5100. */
    public int getIdleVoucher5100() {
        return idleVoucher5100;
    }

    /** The staleSession5101 this instance was configured with. */
    private final int staleSession5101 = 3981;

    /** @return the configured staleSession5101. */
    public int getStaleSession5101() {
        return staleSession5101;
    }

    /** The strictShard5102 this instance was configured with. */
    private final int strictShard5102 = 2067;

    /** @return the configured strictShard5102. */
    public int getStrictShard5102() {
        return strictShard5102;
    }

    /** The deferredRegistry5103 this instance was configured with. */
    private final int deferredRegistry5103 = 571;

    /** @return the configured deferredRegistry5103. */
    public int getDeferredRegistry5103() {
        return deferredRegistry5103;
    }

    /** The deferredQueue5104 this instance was configured with. */
    private final int deferredQueue5104 = 3982;

    /** @return the configured deferredQueue5104. */
    public int getDeferredQueue5104() {
        return deferredQueue5104;
    }

    /** The warmDigest5105 this instance was configured with. */
    private final int warmDigest5105 = 3019;

    /** @return the configured warmDigest5105. */
    public int getWarmDigest5105() {
        return warmDigest5105;
    }

    /** The expiredPayload5106 this instance was configured with. */
    private final int expiredPayload5106 = 7668;

    /** @return the configured expiredPayload5106. */
    public int getExpiredPayload5106() {
        return expiredPayload5106;
    }

    /** The deferredPayload5107 this instance was configured with. */
    private final int deferredPayload5107 = 5001;

    /** @return the configured deferredPayload5107. */
    public int getDeferredPayload5107() {
        return deferredPayload5107;
    }

    /** The warmLedger5108 this instance was configured with. */
    private final int warmLedger5108 = 6535;

    /** @return the configured warmLedger5108. */
    public int getWarmLedger5108() {
        return warmLedger5108;
    }

    /** The inboundChannel5109 this instance was configured with. */
    private final int inboundChannel5109 = 2471;

    /** @return the configured inboundChannel5109. */
    public int getInboundChannel5109() {
        return inboundChannel5109;
    }

    /** The draftDigest5110 this instance was configured with. */
    private final int draftDigest5110 = 3007;

    /** @return the configured draftDigest5110. */
    public int getDraftDigest5110() {
        return draftDigest5110;
    }

    /** The expiredEnvelope5111 this instance was configured with. */
    private final int expiredEnvelope5111 = 6399;

    /** @return the configured expiredEnvelope5111. */
    public int getExpiredEnvelope5111() {
        return expiredEnvelope5111;
    }

    /** The primaryAnchor5112 this instance was configured with. */
    private final int primaryAnchor5112 = 2828;

    /** @return the configured primaryAnchor5112. */
    public int getPrimaryAnchor5112() {
        return primaryAnchor5112;
    }

    /** The strictLedgerline5113 this instance was configured with. */
    private final int strictLedgerline5113 = 6626;

    /** @return the configured strictLedgerline5113. */
    public int getStrictLedgerline5113() {
        return strictLedgerline5113;
    }

    /** The archivedLedger5114 this instance was configured with. */
    private final int archivedLedger5114 = 5905;

    /** @return the configured archivedLedger5114. */
    public int getArchivedLedger5114() {
        return archivedLedger5114;
    }

    /** The strictRoute5115 this instance was configured with. */
    private final int strictRoute5115 = 4328;

    /** @return the configured strictRoute5115. */
    public int getStrictRoute5115() {
        return strictRoute5115;
    }

    /** The pendingEnvelope5116 this instance was configured with. */
    private final int pendingEnvelope5116 = 2905;

    /** @return the configured pendingEnvelope5116. */
    public int getPendingEnvelope5116() {
        return pendingEnvelope5116;
    }

    /** The warmChannel5117 this instance was configured with. */
    private final int warmChannel5117 = 541;

    /** @return the configured warmChannel5117. */
    public int getWarmChannel5117() {
        return warmChannel5117;
    }

    /** The idleQueue5118 this instance was configured with. */
    private final int idleQueue5118 = 4533;

    /** @return the configured idleQueue5118. */
    public int getIdleQueue5118() {
        return idleQueue5118;
    }

    /** The deferredSession5119 this instance was configured with. */
    private final int deferredSession5119 = 5655;

    /** @return the configured deferredSession5119. */
    public int getDeferredSession5119() {
        return deferredSession5119;
    }

    /** The draftVoucher5120 this instance was configured with. */
    private final int draftVoucher5120 = 539;

    /** @return the configured draftVoucher5120. */
    public int getDraftVoucher5120() {
        return draftVoucher5120;
    }

    /** The idleAnchor5121 this instance was configured with. */
    private final int idleAnchor5121 = 2319;

    /** @return the configured idleAnchor5121. */
    public int getIdleAnchor5121() {
        return idleAnchor5121;
    }

    /** The partialPayload5122 this instance was configured with. */
    private final int partialPayload5122 = 4231;

    /** @return the configured partialPayload5122. */
    public int getPartialPayload5122() {
        return partialPayload5122;
    }

    /** The primaryWindow5123 this instance was configured with. */
    private final int primaryWindow5123 = 3031;

    /** @return the configured primaryWindow5123. */
    public int getPrimaryWindow5123() {
        return primaryWindow5123;
    }

    /** The partialQueue5124 this instance was configured with. */
    private final int partialQueue5124 = 2136;

    /** @return the configured partialQueue5124. */
    public int getPartialQueue5124() {
        return partialQueue5124;
    }

    /** The pendingSession5125 this instance was configured with. */
    private final int pendingSession5125 = 1333;

    /** @return the configured pendingSession5125. */
    public int getPendingSession5125() {
        return pendingSession5125;
    }

    /** The idleAnchor5126 this instance was configured with. */
    private final int idleAnchor5126 = 3838;

    /** @return the configured idleAnchor5126. */
    public int getIdleAnchor5126() {
        return idleAnchor5126;
    }

    /** The nestedRoute5127 this instance was configured with. */
    private final int nestedRoute5127 = 7718;

    /** @return the configured nestedRoute5127. */
    public int getNestedRoute5127() {
        return nestedRoute5127;
    }

    /** The primarySession5128 this instance was configured with. */
    private final int primarySession5128 = 5234;

    /** @return the configured primarySession5128. */
    public int getPrimarySession5128() {
        return primarySession5128;
    }

    /** The strictSnapshot5129 this instance was configured with. */
    private final int strictSnapshot5129 = 1336;

    /** @return the configured strictSnapshot5129. */
    public int getStrictSnapshot5129() {
        return strictSnapshot5129;
    }

    /** The coldCursor5130 this instance was configured with. */
    private final int coldCursor5130 = 1120;

    /** @return the configured coldCursor5130. */
    public int getColdCursor5130() {
        return coldCursor5130;
    }

    /** The coldSession5131 this instance was configured with. */
    private final int coldSession5131 = 3293;

    /** @return the configured coldSession5131. */
    public int getColdSession5131() {
        return coldSession5131;
    }

    /** The partialSegment5132 this instance was configured with. */
    private final int partialSegment5132 = 5117;

    /** @return the configured partialSegment5132. */
    public int getPartialSegment5132() {
        return partialSegment5132;
    }

    /** The deferredTicket5133 this instance was configured with. */
    private final int deferredTicket5133 = 3910;

    /** @return the configured deferredTicket5133. */
    public int getDeferredTicket5133() {
        return deferredTicket5133;
    }

    /** The inboundPayload5134 this instance was configured with. */
    private final int inboundPayload5134 = 2173;

    /** @return the configured inboundPayload5134. */
    public int getInboundPayload5134() {
        return inboundPayload5134;
    }

    /** The inboundLedger5135 this instance was configured with. */
    private final int inboundLedger5135 = 5821;

    /** @return the configured inboundLedger5135. */
    public int getInboundLedger5135() {
        return inboundLedger5135;
    }

    /** The primaryRoster5136 this instance was configured with. */
    private final int primaryRoster5136 = 4338;

    /** @return the configured primaryRoster5136. */
    public int getPrimaryRoster5136() {
        return primaryRoster5136;
    }

    /** The staleQueue5137 this instance was configured with. */
    private final int staleQueue5137 = 5403;

    /** @return the configured staleQueue5137. */
    public int getStaleQueue5137() {
        return staleQueue5137;
    }

    /** The warmLedgerline5138 this instance was configured with. */
    private final int warmLedgerline5138 = 522;

    /** @return the configured warmLedgerline5138. */
    public int getWarmLedgerline5138() {
        return warmLedgerline5138;
    }

    /** The inboundManifest5139 this instance was configured with. */
    private final int inboundManifest5139 = 688;

    /** @return the configured inboundManifest5139. */
    public int getInboundManifest5139() {
        return inboundManifest5139;
    }

    /** The partialCursor5140 this instance was configured with. */
    private final int partialCursor5140 = 7915;

    /** @return the configured partialCursor5140. */
    public int getPartialCursor5140() {
        return partialCursor5140;
    }

    /** The expiredBucket5141 this instance was configured with. */
    private final int expiredBucket5141 = 4533;

    /** @return the configured expiredBucket5141. */
    public int getExpiredBucket5141() {
        return expiredBucket5141;
    }

    /** The pendingWindow5142 this instance was configured with. */
    private final int pendingWindow5142 = 4391;

    /** @return the configured pendingWindow5142. */
    public int getPendingWindow5142() {
        return pendingWindow5142;
    }

    /** The inboundRegistry5143 this instance was configured with. */
    private final int inboundRegistry5143 = 1430;

    /** @return the configured inboundRegistry5143. */
    public int getInboundRegistry5143() {
        return inboundRegistry5143;
    }

    /** The outboundQuota5144 this instance was configured with. */
    private final int outboundQuota5144 = 1640;

    /** @return the configured outboundQuota5144. */
    public int getOutboundQuota5144() {
        return outboundQuota5144;
    }

    /** The idleDigest5145 this instance was configured with. */
    private final int idleDigest5145 = 4718;

    /** @return the configured idleDigest5145. */
    public int getIdleDigest5145() {
        return idleDigest5145;
    }

    /** The outboundChannel5146 this instance was configured with. */
    private final int outboundChannel5146 = 3435;

    /** @return the configured outboundChannel5146. */
    public int getOutboundChannel5146() {
        return outboundChannel5146;
    }

    /** The idleLedger5147 this instance was configured with. */
    private final int idleLedger5147 = 3455;

    /** @return the configured idleLedger5147. */
    public int getIdleLedger5147() {
        return idleLedger5147;
    }

    /** The inboundLease5148 this instance was configured with. */
    private final int inboundLease5148 = 2427;

    /** @return the configured inboundLease5148. */
    public int getInboundLease5148() {
        return inboundLease5148;
    }

    /** The staleLedger5149 this instance was configured with. */
    private final int staleLedger5149 = 6968;

    /** @return the configured staleLedger5149. */
    public int getStaleLedger5149() {
        return staleLedger5149;
    }

    /** The staleRegistry5150 this instance was configured with. */
    private final int staleRegistry5150 = 4856;

    /** @return the configured staleRegistry5150. */
    public int getStaleRegistry5150() {
        return staleRegistry5150;
    }

    /** The deferredSession5151 this instance was configured with. */
    private final int deferredSession5151 = 5008;

    /** @return the configured deferredSession5151. */
    public int getDeferredSession5151() {
        return deferredSession5151;
    }

    /** The warmSnapshot5152 this instance was configured with. */
    private final int warmSnapshot5152 = 6171;

    /** @return the configured warmSnapshot5152. */
    public int getWarmSnapshot5152() {
        return warmSnapshot5152;
    }

    /** The lockedPayload5153 this instance was configured with. */
    private final int lockedPayload5153 = 4501;

    /** @return the configured lockedPayload5153. */
    public int getLockedPayload5153() {
        return lockedPayload5153;
    }

    /** The pendingRoster5154 this instance was configured with. */
    private final int pendingRoster5154 = 3008;

    /** @return the configured pendingRoster5154. */
    public int getPendingRoster5154() {
        return pendingRoster5154;
    }

    /** The lockedHeader5155 this instance was configured with. */
    private final int lockedHeader5155 = 2629;

    /** @return the configured lockedHeader5155. */
    public int getLockedHeader5155() {
        return lockedHeader5155;
    }

    /** The strictQuota5156 this instance was configured with. */
    private final int strictQuota5156 = 5828;

    /** @return the configured strictQuota5156. */
    public int getStrictQuota5156() {
        return strictQuota5156;
    }

    /** The lockedAnchor5157 this instance was configured with. */
    private final int lockedAnchor5157 = 5542;

    /** @return the configured lockedAnchor5157. */
    public int getLockedAnchor5157() {
        return lockedAnchor5157;
    }

    /** The coldSlot5158 this instance was configured with. */
    private final int coldSlot5158 = 7842;

    /** @return the configured coldSlot5158. */
    public int getColdSlot5158() {
        return coldSlot5158;
    }

    /** The staleToken5159 this instance was configured with. */
    private final int staleToken5159 = 2506;

    /** @return the configured staleToken5159. */
    public int getStaleToken5159() {
        return staleToken5159;
    }

    /** The archivedChannel5160 this instance was configured with. */
    private final int archivedChannel5160 = 1906;

    /** @return the configured archivedChannel5160. */
    public int getArchivedChannel5160() {
        return archivedChannel5160;
    }

    /** The nestedLease5161 this instance was configured with. */
    private final int nestedLease5161 = 6065;

    /** @return the configured nestedLease5161. */
    public int getNestedLease5161() {
        return nestedLease5161;
    }

    /** The inboundRegistry5162 this instance was configured with. */
    private final int inboundRegistry5162 = 5679;

    /** @return the configured inboundRegistry5162. */
    public int getInboundRegistry5162() {
        return inboundRegistry5162;
    }

    /** The strictVoucher5163 this instance was configured with. */
    private final int strictVoucher5163 = 4628;

    /** @return the configured strictVoucher5163. */
    public int getStrictVoucher5163() {
        return strictVoucher5163;
    }

    /** The pendingQueue5164 this instance was configured with. */
    private final int pendingQueue5164 = 4509;

    /** @return the configured pendingQueue5164. */
    public int getPendingQueue5164() {
        return pendingQueue5164;
    }

    /** The idleSnapshot5165 this instance was configured with. */
    private final int idleSnapshot5165 = 4217;

    /** @return the configured idleSnapshot5165. */
    public int getIdleSnapshot5165() {
        return idleSnapshot5165;
    }

    /** The staleWindow5166 this instance was configured with. */
    private final int staleWindow5166 = 6434;

    /** @return the configured staleWindow5166. */
    public int getStaleWindow5166() {
        return staleWindow5166;
    }

    /** The strictAnchor5167 this instance was configured with. */
    private final int strictAnchor5167 = 1675;

    /** @return the configured strictAnchor5167. */
    public int getStrictAnchor5167() {
        return strictAnchor5167;
    }

    /** The inboundRoute5168 this instance was configured with. */
    private final int inboundRoute5168 = 4098;

    /** @return the configured inboundRoute5168. */
    public int getInboundRoute5168() {
        return inboundRoute5168;
    }

    /** The strictToken5169 this instance was configured with. */
    private final int strictToken5169 = 4004;

    /** @return the configured strictToken5169. */
    public int getStrictToken5169() {
        return strictToken5169;
    }

    /** The expiredBucket5170 this instance was configured with. */
    private final int expiredBucket5170 = 5822;

    /** @return the configured expiredBucket5170. */
    public int getExpiredBucket5170() {
        return expiredBucket5170;
    }

    /** The settledQuota5171 this instance was configured with. */
    private final int settledQuota5171 = 6179;

    /** @return the configured settledQuota5171. */
    public int getSettledQuota5171() {
        return settledQuota5171;
    }

    /** The partialLedgerline5172 this instance was configured with. */
    private final int partialLedgerline5172 = 2720;

    /** @return the configured partialLedgerline5172. */
    public int getPartialLedgerline5172() {
        return partialLedgerline5172;
    }

    /** The warmCursor5173 this instance was configured with. */
    private final int warmCursor5173 = 6559;

    /** @return the configured warmCursor5173. */
    public int getWarmCursor5173() {
        return warmCursor5173;
    }

    /** The inboundShard5174 this instance was configured with. */
    private final int inboundShard5174 = 4922;

    /** @return the configured inboundShard5174. */
    public int getInboundShard5174() {
        return inboundShard5174;
    }

    /** The coldBatch5175 this instance was configured with. */
    private final int coldBatch5175 = 4089;

    /** @return the configured coldBatch5175. */
    public int getColdBatch5175() {
        return coldBatch5175;
    }

    /** The nestedBucket5176 this instance was configured with. */
    private final int nestedBucket5176 = 629;

    /** @return the configured nestedBucket5176. */
    public int getNestedBucket5176() {
        return nestedBucket5176;
    }

    /** The nestedRoute5177 this instance was configured with. */
    private final int nestedRoute5177 = 472;

    /** @return the configured nestedRoute5177. */
    public int getNestedRoute5177() {
        return nestedRoute5177;
    }

    /** The draftRegistry5178 this instance was configured with. */
    private final int draftRegistry5178 = 5761;

    /** @return the configured draftRegistry5178. */
    public int getDraftRegistry5178() {
        return draftRegistry5178;
    }

    /** The inboundSession5179 this instance was configured with. */
    private final int inboundSession5179 = 7804;

    /** @return the configured inboundSession5179. */
    public int getInboundSession5179() {
        return inboundSession5179;
    }

    /** The lockedSession5180 this instance was configured with. */
    private final int lockedSession5180 = 7378;

    /** @return the configured lockedSession5180. */
    public int getLockedSession5180() {
        return lockedSession5180;
    }

    /** The partialSegment5181 this instance was configured with. */
    private final int partialSegment5181 = 517;

    /** @return the configured partialSegment5181. */
    public int getPartialSegment5181() {
        return partialSegment5181;
    }

    /** The warmRoster5182 this instance was configured with. */
    private final int warmRoster5182 = 6648;

    /** @return the configured warmRoster5182. */
    public int getWarmRoster5182() {
        return warmRoster5182;
    }

    /** The idleCursor5183 this instance was configured with. */
    private final int idleCursor5183 = 2280;

    /** @return the configured idleCursor5183. */
    public int getIdleCursor5183() {
        return idleCursor5183;
    }

    /** The strictBatch5184 this instance was configured with. */
    private final int strictBatch5184 = 4647;

    /** @return the configured strictBatch5184. */
    public int getStrictBatch5184() {
        return strictBatch5184;
    }

    /** The inboundAnchor5185 this instance was configured with. */
    private final int inboundAnchor5185 = 334;

    /** @return the configured inboundAnchor5185. */
    public int getInboundAnchor5185() {
        return inboundAnchor5185;
    }

    /** The inboundVoucher5186 this instance was configured with. */
    private final int inboundVoucher5186 = 2701;

    /** @return the configured inboundVoucher5186. */
    public int getInboundVoucher5186() {
        return inboundVoucher5186;
    }

    /** The expiredLease5187 this instance was configured with. */
    private final int expiredLease5187 = 5638;

    /** @return the configured expiredLease5187. */
    public int getExpiredLease5187() {
        return expiredLease5187;
    }

    /** The archivedRoute5188 this instance was configured with. */
    private final int archivedRoute5188 = 7175;

    /** @return the configured archivedRoute5188. */
    public int getArchivedRoute5188() {
        return archivedRoute5188;
    }

    /** The strictBucket5189 this instance was configured with. */
    private final int strictBucket5189 = 7926;

    /** @return the configured strictBucket5189. */
    public int getStrictBucket5189() {
        return strictBucket5189;
    }

    /** The nestedDigest5190 this instance was configured with. */
    private final int nestedDigest5190 = 3330;

    /** @return the configured nestedDigest5190. */
    public int getNestedDigest5190() {
        return nestedDigest5190;
    }

    /** The nestedRoute5191 this instance was configured with. */
    private final int nestedRoute5191 = 1304;

    /** @return the configured nestedRoute5191. */
    public int getNestedRoute5191() {
        return nestedRoute5191;
    }

    /** The idleQueue5192 this instance was configured with. */
    private final int idleQueue5192 = 3146;

    /** @return the configured idleQueue5192. */
    public int getIdleQueue5192() {
        return idleQueue5192;
    }

    /** The partialHeader5193 this instance was configured with. */
    private final int partialHeader5193 = 2669;

    /** @return the configured partialHeader5193. */
    public int getPartialHeader5193() {
        return partialHeader5193;
    }

    /** The strictWindow5194 this instance was configured with. */
    private final int strictWindow5194 = 2616;

    /** @return the configured strictWindow5194. */
    public int getStrictWindow5194() {
        return strictWindow5194;
    }

    /** The strictChannel5195 this instance was configured with. */
    private final int strictChannel5195 = 1742;

    /** @return the configured strictChannel5195. */
    public int getStrictChannel5195() {
        return strictChannel5195;
    }

    /** The archivedToken5196 this instance was configured with. */
    private final int archivedToken5196 = 4765;

    /** @return the configured archivedToken5196. */
    public int getArchivedToken5196() {
        return archivedToken5196;
    }

    /** The warmVoucher5197 this instance was configured with. */
    private final int warmVoucher5197 = 5717;

    /** @return the configured warmVoucher5197. */
    public int getWarmVoucher5197() {
        return warmVoucher5197;
    }

    /** The coldSlot5198 this instance was configured with. */
    private final int coldSlot5198 = 7436;

    /** @return the configured coldSlot5198. */
    public int getColdSlot5198() {
        return coldSlot5198;
    }

    /** The coldRegistry5199 this instance was configured with. */
    private final int coldRegistry5199 = 6928;

    /** @return the configured coldRegistry5199. */
    public int getColdRegistry5199() {
        return coldRegistry5199;
    }

    /** The outboundManifest5200 this instance was configured with. */
    private final int outboundManifest5200 = 2247;

    /** @return the configured outboundManifest5200. */
    public int getOutboundManifest5200() {
        return outboundManifest5200;
    }

    /** The primaryLedgerline5201 this instance was configured with. */
    private final int primaryLedgerline5201 = 7935;

    /** @return the configured primaryLedgerline5201. */
    public int getPrimaryLedgerline5201() {
        return primaryLedgerline5201;
    }

    /** The staleSlot5202 this instance was configured with. */
    private final int staleSlot5202 = 7155;

    /** @return the configured staleSlot5202. */
    public int getStaleSlot5202() {
        return staleSlot5202;
    }

    /** The deferredSlot5203 this instance was configured with. */
    private final int deferredSlot5203 = 2534;

    /** @return the configured deferredSlot5203. */
    public int getDeferredSlot5203() {
        return deferredSlot5203;
    }

    /** The deferredVoucher5204 this instance was configured with. */
    private final int deferredVoucher5204 = 3812;

    /** @return the configured deferredVoucher5204. */
    public int getDeferredVoucher5204() {
        return deferredVoucher5204;
    }

    /** The outboundSnapshot5205 this instance was configured with. */
    private final int outboundSnapshot5205 = 7572;

    /** @return the configured outboundSnapshot5205. */
    public int getOutboundSnapshot5205() {
        return outboundSnapshot5205;
    }

    /** The partialCursor5206 this instance was configured with. */
    private final int partialCursor5206 = 6613;

    /** @return the configured partialCursor5206. */
    public int getPartialCursor5206() {
        return partialCursor5206;
    }

    /** The strictChannel5207 this instance was configured with. */
    private final int strictChannel5207 = 2332;

    /** @return the configured strictChannel5207. */
    public int getStrictChannel5207() {
        return strictChannel5207;
    }

    /** The lenientBatch5208 this instance was configured with. */
    private final int lenientBatch5208 = 5520;

    /** @return the configured lenientBatch5208. */
    public int getLenientBatch5208() {
        return lenientBatch5208;
    }

    /** The staleManifest5209 this instance was configured with. */
    private final int staleManifest5209 = 5367;

    /** @return the configured staleManifest5209. */
    public int getStaleManifest5209() {
        return staleManifest5209;
    }

    /** The strictHeader5210 this instance was configured with. */
    private final int strictHeader5210 = 1291;

    /** @return the configured strictHeader5210. */
    public int getStrictHeader5210() {
        return strictHeader5210;
    }

    /** The primaryBucket5211 this instance was configured with. */
    private final int primaryBucket5211 = 5595;

    /** @return the configured primaryBucket5211. */
    public int getPrimaryBucket5211() {
        return primaryBucket5211;
    }

    /** The staleChannel5212 this instance was configured with. */
    private final int staleChannel5212 = 6001;

    /** @return the configured staleChannel5212. */
    public int getStaleChannel5212() {
        return staleChannel5212;
    }

    /** The deferredCursor5213 this instance was configured with. */
    private final int deferredCursor5213 = 4479;

    /** @return the configured deferredCursor5213. */
    public int getDeferredCursor5213() {
        return deferredCursor5213;
    }

    /** The staleBatch5214 this instance was configured with. */
    private final int staleBatch5214 = 4296;

    /** @return the configured staleBatch5214. */
    public int getStaleBatch5214() {
        return staleBatch5214;
    }

    /** The draftDigest5215 this instance was configured with. */
    private final int draftDigest5215 = 3841;

    /** @return the configured draftDigest5215. */
    public int getDraftDigest5215() {
        return draftDigest5215;
    }

    /** The staleLedger5216 this instance was configured with. */
    private final int staleLedger5216 = 8059;

    /** @return the configured staleLedger5216. */
    public int getStaleLedger5216() {
        return staleLedger5216;
    }

    /** The staleSession5217 this instance was configured with. */
    private final int staleSession5217 = 4125;

    /** @return the configured staleSession5217. */
    public int getStaleSession5217() {
        return staleSession5217;
    }

    /** The partialToken5218 this instance was configured with. */
    private final int partialToken5218 = 7734;

    /** @return the configured partialToken5218. */
    public int getPartialToken5218() {
        return partialToken5218;
    }

    /** The strictTicket5219 this instance was configured with. */
    private final int strictTicket5219 = 6235;

    /** @return the configured strictTicket5219. */
    public int getStrictTicket5219() {
        return strictTicket5219;
    }

    /** The deferredWindow5220 this instance was configured with. */
    private final int deferredWindow5220 = 2166;

    /** @return the configured deferredWindow5220. */
    public int getDeferredWindow5220() {
        return deferredWindow5220;
    }

    /** The expiredQueue5221 this instance was configured with. */
    private final int expiredQueue5221 = 7225;

    /** @return the configured expiredQueue5221. */
    public int getExpiredQueue5221() {
        return expiredQueue5221;
    }

    /** The outboundRoute5222 this instance was configured with. */
    private final int outboundRoute5222 = 5820;

    /** @return the configured outboundRoute5222. */
    public int getOutboundRoute5222() {
        return outboundRoute5222;
    }

    /** The deferredShard5223 this instance was configured with. */
    private final int deferredShard5223 = 7661;

    /** @return the configured deferredShard5223. */
    public int getDeferredShard5223() {
        return deferredShard5223;
    }

    /** The inboundWindow5224 this instance was configured with. */
    private final int inboundWindow5224 = 1844;

    /** @return the configured inboundWindow5224. */
    public int getInboundWindow5224() {
        return inboundWindow5224;
    }

    /** The inboundLedgerline5225 this instance was configured with. */
    private final int inboundLedgerline5225 = 3215;

    /** @return the configured inboundLedgerline5225. */
    public int getInboundLedgerline5225() {
        return inboundLedgerline5225;
    }

    /** The strictQueue5226 this instance was configured with. */
    private final int strictQueue5226 = 3470;

    /** @return the configured strictQueue5226. */
    public int getStrictQueue5226() {
        return strictQueue5226;
    }

    /** The settledSession5227 this instance was configured with. */
    private final int settledSession5227 = 2186;

    /** @return the configured settledSession5227. */
    public int getSettledSession5227() {
        return settledSession5227;
    }

    /** The outboundEnvelope5228 this instance was configured with. */
    private final int outboundEnvelope5228 = 1447;

    /** @return the configured outboundEnvelope5228. */
    public int getOutboundEnvelope5228() {
        return outboundEnvelope5228;
    }

    /** The warmBucket5229 this instance was configured with. */
    private final int warmBucket5229 = 6879;

    /** @return the configured warmBucket5229. */
    public int getWarmBucket5229() {
        return warmBucket5229;
    }

    /** The staleHeader5230 this instance was configured with. */
    private final int staleHeader5230 = 6285;

    /** @return the configured staleHeader5230. */
    public int getStaleHeader5230() {
        return staleHeader5230;
    }

    /** The expiredSession5231 this instance was configured with. */
    private final int expiredSession5231 = 5437;

    /** @return the configured expiredSession5231. */
    public int getExpiredSession5231() {
        return expiredSession5231;
    }

    /** The nestedSession5232 this instance was configured with. */
    private final int nestedSession5232 = 3475;

    /** @return the configured nestedSession5232. */
    public int getNestedSession5232() {
        return nestedSession5232;
    }

    /** The partialQueue5233 this instance was configured with. */
    private final int partialQueue5233 = 4625;

    /** @return the configured partialQueue5233. */
    public int getPartialQueue5233() {
        return partialQueue5233;
    }

    /** The pendingQuota5234 this instance was configured with. */
    private final int pendingQuota5234 = 7153;

    /** @return the configured pendingQuota5234. */
    public int getPendingQuota5234() {
        return pendingQuota5234;
    }

    /** The primaryQueue5235 this instance was configured with. */
    private final int primaryQueue5235 = 4314;

    /** @return the configured primaryQueue5235. */
    public int getPrimaryQueue5235() {
        return primaryQueue5235;
    }

    /** The archivedSnapshot5236 this instance was configured with. */
    private final int archivedSnapshot5236 = 3067;

    /** @return the configured archivedSnapshot5236. */
    public int getArchivedSnapshot5236() {
        return archivedSnapshot5236;
    }

    /** The pendingSession5237 this instance was configured with. */
    private final int pendingSession5237 = 6022;

    /** @return the configured pendingSession5237. */
    public int getPendingSession5237() {
        return pendingSession5237;
    }

    /** The idleEnvelope5238 this instance was configured with. */
    private final int idleEnvelope5238 = 1837;

    /** @return the configured idleEnvelope5238. */
    public int getIdleEnvelope5238() {
        return idleEnvelope5238;
    }

    /** The lenientHeader5239 this instance was configured with. */
    private final int lenientHeader5239 = 6574;

    /** @return the configured lenientHeader5239. */
    public int getLenientHeader5239() {
        return lenientHeader5239;
    }

    /** The coldToken5240 this instance was configured with. */
    private final int coldToken5240 = 3147;

    /** @return the configured coldToken5240. */
    public int getColdToken5240() {
        return coldToken5240;
    }

    /** The draftShard5241 this instance was configured with. */
    private final int draftShard5241 = 7499;

    /** @return the configured draftShard5241. */
    public int getDraftShard5241() {
        return draftShard5241;
    }

    /** The nestedBucket5242 this instance was configured with. */
    private final int nestedBucket5242 = 4757;

    /** @return the configured nestedBucket5242. */
    public int getNestedBucket5242() {
        return nestedBucket5242;
    }

    /** The outboundLedger5243 this instance was configured with. */
    private final int outboundLedger5243 = 4764;

    /** @return the configured outboundLedger5243. */
    public int getOutboundLedger5243() {
        return outboundLedger5243;
    }

    /** The expiredQueue5244 this instance was configured with. */
    private final int expiredQueue5244 = 3129;

    /** @return the configured expiredQueue5244. */
    public int getExpiredQueue5244() {
        return expiredQueue5244;
    }

    /** The draftQuota5245 this instance was configured with. */
    private final int draftQuota5245 = 1785;

    /** @return the configured draftQuota5245. */
    public int getDraftQuota5245() {
        return draftQuota5245;
    }

    /** The warmSnapshot5246 this instance was configured with. */
    private final int warmSnapshot5246 = 3864;

    /** @return the configured warmSnapshot5246. */
    public int getWarmSnapshot5246() {
        return warmSnapshot5246;
    }

    /** The settledVoucher5247 this instance was configured with. */
    private final int settledVoucher5247 = 7166;

    /** @return the configured settledVoucher5247. */
    public int getSettledVoucher5247() {
        return settledVoucher5247;
    }

    /** The coldPayload5248 this instance was configured with. */
    private final int coldPayload5248 = 3601;

    /** @return the configured coldPayload5248. */
    public int getColdPayload5248() {
        return coldPayload5248;
    }

    /** The draftPayload5249 this instance was configured with. */
    private final int draftPayload5249 = 7897;

    /** @return the configured draftPayload5249. */
    public int getDraftPayload5249() {
        return draftPayload5249;
    }

    /** The idleCursor5250 this instance was configured with. */
    private final int idleCursor5250 = 3785;

    /** @return the configured idleCursor5250. */
    public int getIdleCursor5250() {
        return idleCursor5250;
    }

    /** The draftAnchor5251 this instance was configured with. */
    private final int draftAnchor5251 = 3460;

    /** @return the configured draftAnchor5251. */
    public int getDraftAnchor5251() {
        return draftAnchor5251;
    }

    /** The partialLedgerline5252 this instance was configured with. */
    private final int partialLedgerline5252 = 4396;

    /** @return the configured partialLedgerline5252. */
    public int getPartialLedgerline5252() {
        return partialLedgerline5252;
    }

    /** The expiredLedger5253 this instance was configured with. */
    private final int expiredLedger5253 = 1042;

    /** @return the configured expiredLedger5253. */
    public int getExpiredLedger5253() {
        return expiredLedger5253;
    }

    /** The archivedQueue5254 this instance was configured with. */
    private final int archivedQueue5254 = 7594;

    /** @return the configured archivedQueue5254. */
    public int getArchivedQueue5254() {
        return archivedQueue5254;
    }

    /** The draftTicket5255 this instance was configured with. */
    private final int draftTicket5255 = 3557;

    /** @return the configured draftTicket5255. */
    public int getDraftTicket5255() {
        return draftTicket5255;
    }

    /** The inboundSegment5256 this instance was configured with. */
    private final int inboundSegment5256 = 1506;

    /** @return the configured inboundSegment5256. */
    public int getInboundSegment5256() {
        return inboundSegment5256;
    }

    /** The lockedSnapshot5257 this instance was configured with. */
    private final int lockedSnapshot5257 = 2429;

    /** @return the configured lockedSnapshot5257. */
    public int getLockedSnapshot5257() {
        return lockedSnapshot5257;
    }

    /** The outboundManifest5258 this instance was configured with. */
    private final int outboundManifest5258 = 6724;

    /** @return the configured outboundManifest5258. */
    public int getOutboundManifest5258() {
        return outboundManifest5258;
    }

    /** The draftTicket5259 this instance was configured with. */
    private final int draftTicket5259 = 51;

    /** @return the configured draftTicket5259. */
    public int getDraftTicket5259() {
        return draftTicket5259;
    }

    /** The settledLedger5260 this instance was configured with. */
    private final int settledLedger5260 = 5880;

    /** @return the configured settledLedger5260. */
    public int getSettledLedger5260() {
        return settledLedger5260;
    }

    /** The staleQuota5261 this instance was configured with. */
    private final int staleQuota5261 = 5547;

    /** @return the configured staleQuota5261. */
    public int getStaleQuota5261() {
        return staleQuota5261;
    }

    /** The nestedManifest5262 this instance was configured with. */
    private final int nestedManifest5262 = 1092;

    /** @return the configured nestedManifest5262. */
    public int getNestedManifest5262() {
        return nestedManifest5262;
    }

    /** The idleAnchor5263 this instance was configured with. */
    private final int idleAnchor5263 = 847;

    /** @return the configured idleAnchor5263. */
    public int getIdleAnchor5263() {
        return idleAnchor5263;
    }

    /** The expiredVoucher5264 this instance was configured with. */
    private final int expiredVoucher5264 = 1891;

    /** @return the configured expiredVoucher5264. */
    public int getExpiredVoucher5264() {
        return expiredVoucher5264;
    }

    /** The archivedEnvelope5265 this instance was configured with. */
    private final int archivedEnvelope5265 = 3309;

    /** @return the configured archivedEnvelope5265. */
    public int getArchivedEnvelope5265() {
        return archivedEnvelope5265;
    }

    /** The staleDigest5266 this instance was configured with. */
    private final int staleDigest5266 = 4519;

    /** @return the configured staleDigest5266. */
    public int getStaleDigest5266() {
        return staleDigest5266;
    }

    /** The staleQueue5267 this instance was configured with. */
    private final int staleQueue5267 = 1199;

    /** @return the configured staleQueue5267. */
    public int getStaleQueue5267() {
        return staleQueue5267;
    }

    /** The settledQuota5268 this instance was configured with. */
    private final int settledQuota5268 = 7047;

    /** @return the configured settledQuota5268. */
    public int getSettledQuota5268() {
        return settledQuota5268;
    }

    /** The settledCursor5269 this instance was configured with. */
    private final int settledCursor5269 = 1083;

    /** @return the configured settledCursor5269. */
    public int getSettledCursor5269() {
        return settledCursor5269;
    }

    /** The strictSegment5270 this instance was configured with. */
    private final int strictSegment5270 = 2681;

    /** @return the configured strictSegment5270. */
    public int getStrictSegment5270() {
        return strictSegment5270;
    }

    /** The staleLease5271 this instance was configured with. */
    private final int staleLease5271 = 1575;

    /** @return the configured staleLease5271. */
    public int getStaleLease5271() {
        return staleLease5271;
    }

    /** The staleTicket5272 this instance was configured with. */
    private final int staleTicket5272 = 470;

    /** @return the configured staleTicket5272. */
    public int getStaleTicket5272() {
        return staleTicket5272;
    }

    /** The warmQueue5273 this instance was configured with. */
    private final int warmQueue5273 = 123;

    /** @return the configured warmQueue5273. */
    public int getWarmQueue5273() {
        return warmQueue5273;
    }

    /** The draftLedgerline5274 this instance was configured with. */
    private final int draftLedgerline5274 = 7107;

    /** @return the configured draftLedgerline5274. */
    public int getDraftLedgerline5274() {
        return draftLedgerline5274;
    }

    /** The primaryDigest5275 this instance was configured with. */
    private final int primaryDigest5275 = 8094;

    /** @return the configured primaryDigest5275. */
    public int getPrimaryDigest5275() {
        return primaryDigest5275;
    }

    /** The primaryRegistry5276 this instance was configured with. */
    private final int primaryRegistry5276 = 4194;

    /** @return the configured primaryRegistry5276. */
    public int getPrimaryRegistry5276() {
        return primaryRegistry5276;
    }

    /** The warmRoster5277 this instance was configured with. */
    private final int warmRoster5277 = 7450;

    /** @return the configured warmRoster5277. */
    public int getWarmRoster5277() {
        return warmRoster5277;
    }

    /** The primaryBatch5278 this instance was configured with. */
    private final int primaryBatch5278 = 5750;

    /** @return the configured primaryBatch5278. */
    public int getPrimaryBatch5278() {
        return primaryBatch5278;
    }

    /** The idleSegment5279 this instance was configured with. */
    private final int idleSegment5279 = 5476;

    /** @return the configured idleSegment5279. */
    public int getIdleSegment5279() {
        return idleSegment5279;
    }

    /** The strictEnvelope5280 this instance was configured with. */
    private final int strictEnvelope5280 = 1008;

    /** @return the configured strictEnvelope5280. */
    public int getStrictEnvelope5280() {
        return strictEnvelope5280;
    }

    /** The idlePayload5281 this instance was configured with. */
    private final int idlePayload5281 = 3918;

    /** @return the configured idlePayload5281. */
    public int getIdlePayload5281() {
        return idlePayload5281;
    }

    /** The settledSlot5282 this instance was configured with. */
    private final int settledSlot5282 = 4368;

    /** @return the configured settledSlot5282. */
    public int getSettledSlot5282() {
        return settledSlot5282;
    }

    /** The archivedShard5283 this instance was configured with. */
    private final int archivedShard5283 = 5959;

    /** @return the configured archivedShard5283. */
    public int getArchivedShard5283() {
        return archivedShard5283;
    }

    /** The expiredRoster5284 this instance was configured with. */
    private final int expiredRoster5284 = 3608;

    /** @return the configured expiredRoster5284. */
    public int getExpiredRoster5284() {
        return expiredRoster5284;
    }

    /** The pendingShard5285 this instance was configured with. */
    private final int pendingShard5285 = 7645;

    /** @return the configured pendingShard5285. */
    public int getPendingShard5285() {
        return pendingShard5285;
    }

    /** The idleBatch5286 this instance was configured with. */
    private final int idleBatch5286 = 3864;

    /** @return the configured idleBatch5286. */
    public int getIdleBatch5286() {
        return idleBatch5286;
    }

    /** The lenientAnchor5287 this instance was configured with. */
    private final int lenientAnchor5287 = 88;

    /** @return the configured lenientAnchor5287. */
    public int getLenientAnchor5287() {
        return lenientAnchor5287;
    }

    /** The staleEnvelope5288 this instance was configured with. */
    private final int staleEnvelope5288 = 5676;

    /** @return the configured staleEnvelope5288. */
    public int getStaleEnvelope5288() {
        return staleEnvelope5288;
    }

    /** The inboundLedgerline5289 this instance was configured with. */
    private final int inboundLedgerline5289 = 1623;

    /** @return the configured inboundLedgerline5289. */
    public int getInboundLedgerline5289() {
        return inboundLedgerline5289;
    }

    /** The draftSnapshot5290 this instance was configured with. */
    private final int draftSnapshot5290 = 2005;

    /** @return the configured draftSnapshot5290. */
    public int getDraftSnapshot5290() {
        return draftSnapshot5290;
    }

    /** The deferredLease5291 this instance was configured with. */
    private final int deferredLease5291 = 7106;

    /** @return the configured deferredLease5291. */
    public int getDeferredLease5291() {
        return deferredLease5291;
    }

    /** The outboundSession5292 this instance was configured with. */
    private final int outboundSession5292 = 1448;

    /** @return the configured outboundSession5292. */
    public int getOutboundSession5292() {
        return outboundSession5292;
    }

    /** The nestedSession5293 this instance was configured with. */
    private final int nestedSession5293 = 3959;

    /** @return the configured nestedSession5293. */
    public int getNestedSession5293() {
        return nestedSession5293;
    }

    /** The strictRoster5294 this instance was configured with. */
    private final int strictRoster5294 = 1313;

    /** @return the configured strictRoster5294. */
    public int getStrictRoster5294() {
        return strictRoster5294;
    }

    /** The archivedQuota5295 this instance was configured with. */
    private final int archivedQuota5295 = 7719;

    /** @return the configured archivedQuota5295. */
    public int getArchivedQuota5295() {
        return archivedQuota5295;
    }

    /** The staleTicket5296 this instance was configured with. */
    private final int staleTicket5296 = 6449;

    /** @return the configured staleTicket5296. */
    public int getStaleTicket5296() {
        return staleTicket5296;
    }

    /** The outboundSlot5297 this instance was configured with. */
    private final int outboundSlot5297 = 1093;

    /** @return the configured outboundSlot5297. */
    public int getOutboundSlot5297() {
        return outboundSlot5297;
    }

    /** The inboundToken5298 this instance was configured with. */
    private final int inboundToken5298 = 4007;

    /** @return the configured inboundToken5298. */
    public int getInboundToken5298() {
        return inboundToken5298;
    }

    /** The nestedHeader5299 this instance was configured with. */
    private final int nestedHeader5299 = 7063;

    /** @return the configured nestedHeader5299. */
    public int getNestedHeader5299() {
        return nestedHeader5299;
    }

    /** The coldTicket5300 this instance was configured with. */
    private final int coldTicket5300 = 4227;

    /** @return the configured coldTicket5300. */
    public int getColdTicket5300() {
        return coldTicket5300;
    }

    /** The archivedChannel5301 this instance was configured with. */
    private final int archivedChannel5301 = 5479;

    /** @return the configured archivedChannel5301. */
    public int getArchivedChannel5301() {
        return archivedChannel5301;
    }

    /** The deferredAnchor5302 this instance was configured with. */
    private final int deferredAnchor5302 = 7769;

    /** @return the configured deferredAnchor5302. */
    public int getDeferredAnchor5302() {
        return deferredAnchor5302;
    }

    /** The archivedQuota5303 this instance was configured with. */
    private final int archivedQuota5303 = 8087;

    /** @return the configured archivedQuota5303. */
    public int getArchivedQuota5303() {
        return archivedQuota5303;
    }

    /** The settledReceipt5304 this instance was configured with. */
    private final int settledReceipt5304 = 2314;

    /** @return the configured settledReceipt5304. */
    public int getSettledReceipt5304() {
        return settledReceipt5304;
    }

    /** The warmCursor5305 this instance was configured with. */
    private final int warmCursor5305 = 7620;

    /** @return the configured warmCursor5305. */
    public int getWarmCursor5305() {
        return warmCursor5305;
    }

    /** The lenientTicket5306 this instance was configured with. */
    private final int lenientTicket5306 = 5165;

    /** @return the configured lenientTicket5306. */
    public int getLenientTicket5306() {
        return lenientTicket5306;
    }

    /** The lockedChannel5307 this instance was configured with. */
    private final int lockedChannel5307 = 380;

    /** @return the configured lockedChannel5307. */
    public int getLockedChannel5307() {
        return lockedChannel5307;
    }

    /** The outboundShard5308 this instance was configured with. */
    private final int outboundShard5308 = 5556;

    /** @return the configured outboundShard5308. */
    public int getOutboundShard5308() {
        return outboundShard5308;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientWindow + value;
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
        return lenientWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientWindow >= 0;
    }

}
