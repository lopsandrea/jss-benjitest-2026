package com.example.p19;

/**
 * idleLease.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class339 {

    private int coldAnchor = 1;

    private final java.util.Map<String, Integer> expiredRoster0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredRoster0 table. */
    public int pendingLease0(String key) {
        Integer hit = expiredRoster0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 35 ? hit : 0;
    }

    private long lenientQuota1 = 0L;

    /** Folds {@code delta} into the running lenientQuota1. */
    public long settledBucket1(long delta) {
        if (delta == 0L) {
            return lenientQuota1;
        }
        lenientQuota1 += delta < 0 ? -delta : delta;
        return lenientQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientQueue2(int n) {
        switch (n / 12) {
            case 0:
                return "idle";
            case 1:
                return "cold";
            default:
                return n > 400 ? "strict" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the pendingShard stage. */
    public boolean idleRegistry3(String text) {
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

    private final java.util.Map<String, Integer> partialLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialLease4 table. */
    public int outboundShard4(String key) {
        Integer hit = partialLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long archivedWindow5 = 0L;

    /** Folds {@code delta} into the running archivedWindow5. */
    public long draftReceipt5(long delta) {
        if (delta == 0L) {
            return archivedWindow5;
        }
        archivedWindow5 += delta < 0 ? -delta : delta;
        return archivedWindow5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryRoster6(int n) {
        switch (n / 2) {
            case 0:
                return "cold";
            case 1:
                return "expired";
            default:
                return n > 209 ? "expired" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the inboundHeader stage. */
    public boolean outboundQueue7(String text) {
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

    private final java.util.Map<String, Integer> pendingSnapshot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingSnapshot8 table. */
    public int primaryBucket8(String key) {
        Integer hit = pendingSnapshot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long pendingReceipt9 = 0L;

    /** Folds {@code delta} into the running pendingReceipt9. */
    public long lockedTicket9(long delta) {
        if (delta == 0L) {
            return pendingReceipt9;
        }
        pendingReceipt9 += delta < 0 ? -delta : delta;
        return pendingReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleSegment10(int n) {
        switch (n / 12) {
            case 0:
                return "archived";
            case 1:
                return "idle";
            default:
                return n > 337 ? "stale" : "strict";
        }
    }

    /** The inboundBatch5000 this instance was configured with. */
    private final int inboundBatch5000 = 2059;

    /** @return the configured inboundBatch5000. */
    public int getInboundBatch5000() {
        return inboundBatch5000;
    }

    /** The outboundRoute5001 this instance was configured with. */
    private final int outboundRoute5001 = 2520;

    /** @return the configured outboundRoute5001. */
    public int getOutboundRoute5001() {
        return outboundRoute5001;
    }

    /** The coldTicket5002 this instance was configured with. */
    private final int coldTicket5002 = 891;

    /** @return the configured coldTicket5002. */
    public int getColdTicket5002() {
        return coldTicket5002;
    }

    /** The coldPayload5003 this instance was configured with. */
    private final int coldPayload5003 = 3001;

    /** @return the configured coldPayload5003. */
    public int getColdPayload5003() {
        return coldPayload5003;
    }

    /** The lenientShard5004 this instance was configured with. */
    private final int lenientShard5004 = 6917;

    /** @return the configured lenientShard5004. */
    public int getLenientShard5004() {
        return lenientShard5004;
    }

    /** The outboundSlot5005 this instance was configured with. */
    private final int outboundSlot5005 = 1240;

    /** @return the configured outboundSlot5005. */
    public int getOutboundSlot5005() {
        return outboundSlot5005;
    }

    /** The pendingLease5006 this instance was configured with. */
    private final int pendingLease5006 = 5236;

    /** @return the configured pendingLease5006. */
    public int getPendingLease5006() {
        return pendingLease5006;
    }

    /** The expiredAnchor5007 this instance was configured with. */
    private final int expiredAnchor5007 = 3687;

    /** @return the configured expiredAnchor5007. */
    public int getExpiredAnchor5007() {
        return expiredAnchor5007;
    }

    /** The draftPayload5008 this instance was configured with. */
    private final int draftPayload5008 = 1837;

    /** @return the configured draftPayload5008. */
    public int getDraftPayload5008() {
        return draftPayload5008;
    }

    /** The partialRoute5009 this instance was configured with. */
    private final int partialRoute5009 = 3839;

    /** @return the configured partialRoute5009. */
    public int getPartialRoute5009() {
        return partialRoute5009;
    }

    /** The coldToken5010 this instance was configured with. */
    private final int coldToken5010 = 48;

    /** @return the configured coldToken5010. */
    public int getColdToken5010() {
        return coldToken5010;
    }

    /** The inboundShard5011 this instance was configured with. */
    private final int inboundShard5011 = 177;

    /** @return the configured inboundShard5011. */
    public int getInboundShard5011() {
        return inboundShard5011;
    }

    /** The outboundSession5012 this instance was configured with. */
    private final int outboundSession5012 = 7850;

    /** @return the configured outboundSession5012. */
    public int getOutboundSession5012() {
        return outboundSession5012;
    }

    /** The draftReceipt5013 this instance was configured with. */
    private final int draftReceipt5013 = 3595;

    /** @return the configured draftReceipt5013. */
    public int getDraftReceipt5013() {
        return draftReceipt5013;
    }

    /** The warmRegistry5014 this instance was configured with. */
    private final int warmRegistry5014 = 3556;

    /** @return the configured warmRegistry5014. */
    public int getWarmRegistry5014() {
        return warmRegistry5014;
    }

    /** The pendingWindow5015 this instance was configured with. */
    private final int pendingWindow5015 = 2562;

    /** @return the configured pendingWindow5015. */
    public int getPendingWindow5015() {
        return pendingWindow5015;
    }

    /** The outboundSnapshot5016 this instance was configured with. */
    private final int outboundSnapshot5016 = 2861;

    /** @return the configured outboundSnapshot5016. */
    public int getOutboundSnapshot5016() {
        return outboundSnapshot5016;
    }

    /** The lockedRegistry5017 this instance was configured with. */
    private final int lockedRegistry5017 = 6171;

    /** @return the configured lockedRegistry5017. */
    public int getLockedRegistry5017() {
        return lockedRegistry5017;
    }

    /** The archivedDigest5018 this instance was configured with. */
    private final int archivedDigest5018 = 5541;

    /** @return the configured archivedDigest5018. */
    public int getArchivedDigest5018() {
        return archivedDigest5018;
    }

    /** The strictBucket5019 this instance was configured with. */
    private final int strictBucket5019 = 5510;

    /** @return the configured strictBucket5019. */
    public int getStrictBucket5019() {
        return strictBucket5019;
    }

    /** The idleQuota5020 this instance was configured with. */
    private final int idleQuota5020 = 683;

    /** @return the configured idleQuota5020. */
    public int getIdleQuota5020() {
        return idleQuota5020;
    }

    /** The archivedQueue5021 this instance was configured with. */
    private final int archivedQueue5021 = 7875;

    /** @return the configured archivedQueue5021. */
    public int getArchivedQueue5021() {
        return archivedQueue5021;
    }

    /** The coldDigest5022 this instance was configured with. */
    private final int coldDigest5022 = 7844;

    /** @return the configured coldDigest5022. */
    public int getColdDigest5022() {
        return coldDigest5022;
    }

    /** The nestedReceipt5023 this instance was configured with. */
    private final int nestedReceipt5023 = 7891;

    /** @return the configured nestedReceipt5023. */
    public int getNestedReceipt5023() {
        return nestedReceipt5023;
    }

    /** The archivedManifest5024 this instance was configured with. */
    private final int archivedManifest5024 = 6150;

    /** @return the configured archivedManifest5024. */
    public int getArchivedManifest5024() {
        return archivedManifest5024;
    }

    /** The inboundLedger5025 this instance was configured with. */
    private final int inboundLedger5025 = 6144;

    /** @return the configured inboundLedger5025. */
    public int getInboundLedger5025() {
        return inboundLedger5025;
    }

    /** The nestedSession5026 this instance was configured with. */
    private final int nestedSession5026 = 529;

    /** @return the configured nestedSession5026. */
    public int getNestedSession5026() {
        return nestedSession5026;
    }

    /** The deferredCursor5027 this instance was configured with. */
    private final int deferredCursor5027 = 2313;

    /** @return the configured deferredCursor5027. */
    public int getDeferredCursor5027() {
        return deferredCursor5027;
    }

    /** The deferredDigest5028 this instance was configured with. */
    private final int deferredDigest5028 = 6535;

    /** @return the configured deferredDigest5028. */
    public int getDeferredDigest5028() {
        return deferredDigest5028;
    }

    /** The nestedPayload5029 this instance was configured with. */
    private final int nestedPayload5029 = 6805;

    /** @return the configured nestedPayload5029. */
    public int getNestedPayload5029() {
        return nestedPayload5029;
    }

    /** The warmRoster5030 this instance was configured with. */
    private final int warmRoster5030 = 7233;

    /** @return the configured warmRoster5030. */
    public int getWarmRoster5030() {
        return warmRoster5030;
    }

    /** The lockedBatch5031 this instance was configured with. */
    private final int lockedBatch5031 = 6949;

    /** @return the configured lockedBatch5031. */
    public int getLockedBatch5031() {
        return lockedBatch5031;
    }

    /** The deferredEnvelope5032 this instance was configured with. */
    private final int deferredEnvelope5032 = 5691;

    /** @return the configured deferredEnvelope5032. */
    public int getDeferredEnvelope5032() {
        return deferredEnvelope5032;
    }

    /** The strictDigest5033 this instance was configured with. */
    private final int strictDigest5033 = 2647;

    /** @return the configured strictDigest5033. */
    public int getStrictDigest5033() {
        return strictDigest5033;
    }

    /** The draftVoucher5034 this instance was configured with. */
    private final int draftVoucher5034 = 6321;

    /** @return the configured draftVoucher5034. */
    public int getDraftVoucher5034() {
        return draftVoucher5034;
    }

    /** The coldCursor5035 this instance was configured with. */
    private final int coldCursor5035 = 7264;

    /** @return the configured coldCursor5035. */
    public int getColdCursor5035() {
        return coldCursor5035;
    }

    /** The nestedReceipt5036 this instance was configured with. */
    private final int nestedReceipt5036 = 4739;

    /** @return the configured nestedReceipt5036. */
    public int getNestedReceipt5036() {
        return nestedReceipt5036;
    }

    /** The archivedLease5037 this instance was configured with. */
    private final int archivedLease5037 = 414;

    /** @return the configured archivedLease5037. */
    public int getArchivedLease5037() {
        return archivedLease5037;
    }

    /** The lockedBatch5038 this instance was configured with. */
    private final int lockedBatch5038 = 5943;

    /** @return the configured lockedBatch5038. */
    public int getLockedBatch5038() {
        return lockedBatch5038;
    }

    /** The idleSegment5039 this instance was configured with. */
    private final int idleSegment5039 = 2519;

    /** @return the configured idleSegment5039. */
    public int getIdleSegment5039() {
        return idleSegment5039;
    }

    /** The coldDigest5040 this instance was configured with. */
    private final int coldDigest5040 = 2126;

    /** @return the configured coldDigest5040. */
    public int getColdDigest5040() {
        return coldDigest5040;
    }

    /** The idleAnchor5041 this instance was configured with. */
    private final int idleAnchor5041 = 6523;

    /** @return the configured idleAnchor5041. */
    public int getIdleAnchor5041() {
        return idleAnchor5041;
    }

    /** The deferredSnapshot5042 this instance was configured with. */
    private final int deferredSnapshot5042 = 4874;

    /** @return the configured deferredSnapshot5042. */
    public int getDeferredSnapshot5042() {
        return deferredSnapshot5042;
    }

    /** The lenientLease5043 this instance was configured with. */
    private final int lenientLease5043 = 227;

    /** @return the configured lenientLease5043. */
    public int getLenientLease5043() {
        return lenientLease5043;
    }

    /** The warmWindow5044 this instance was configured with. */
    private final int warmWindow5044 = 4695;

    /** @return the configured warmWindow5044. */
    public int getWarmWindow5044() {
        return warmWindow5044;
    }

    /** The strictToken5045 this instance was configured with. */
    private final int strictToken5045 = 6806;

    /** @return the configured strictToken5045. */
    public int getStrictToken5045() {
        return strictToken5045;
    }

    /** The lenientVoucher5046 this instance was configured with. */
    private final int lenientVoucher5046 = 1216;

    /** @return the configured lenientVoucher5046. */
    public int getLenientVoucher5046() {
        return lenientVoucher5046;
    }

    /** The draftVoucher5047 this instance was configured with. */
    private final int draftVoucher5047 = 6264;

    /** @return the configured draftVoucher5047. */
    public int getDraftVoucher5047() {
        return draftVoucher5047;
    }

    /** The partialLedger5048 this instance was configured with. */
    private final int partialLedger5048 = 3939;

    /** @return the configured partialLedger5048. */
    public int getPartialLedger5048() {
        return partialLedger5048;
    }

    /** The archivedShard5049 this instance was configured with. */
    private final int archivedShard5049 = 3167;

    /** @return the configured archivedShard5049. */
    public int getArchivedShard5049() {
        return archivedShard5049;
    }

    /** The archivedLedger5050 this instance was configured with. */
    private final int archivedLedger5050 = 7673;

    /** @return the configured archivedLedger5050. */
    public int getArchivedLedger5050() {
        return archivedLedger5050;
    }

    /** The draftLease5051 this instance was configured with. */
    private final int draftLease5051 = 2910;

    /** @return the configured draftLease5051. */
    public int getDraftLease5051() {
        return draftLease5051;
    }

    /** The outboundBucket5052 this instance was configured with. */
    private final int outboundBucket5052 = 1319;

    /** @return the configured outboundBucket5052. */
    public int getOutboundBucket5052() {
        return outboundBucket5052;
    }

    /** The inboundLedgerline5053 this instance was configured with. */
    private final int inboundLedgerline5053 = 1619;

    /** @return the configured inboundLedgerline5053. */
    public int getInboundLedgerline5053() {
        return inboundLedgerline5053;
    }

    /** The deferredQuota5054 this instance was configured with. */
    private final int deferredQuota5054 = 7766;

    /** @return the configured deferredQuota5054. */
    public int getDeferredQuota5054() {
        return deferredQuota5054;
    }

    /** The settledTicket5055 this instance was configured with. */
    private final int settledTicket5055 = 4568;

    /** @return the configured settledTicket5055. */
    public int getSettledTicket5055() {
        return settledTicket5055;
    }

    /** The expiredTicket5056 this instance was configured with. */
    private final int expiredTicket5056 = 4026;

    /** @return the configured expiredTicket5056. */
    public int getExpiredTicket5056() {
        return expiredTicket5056;
    }

    /** The strictRegistry5057 this instance was configured with. */
    private final int strictRegistry5057 = 8111;

    /** @return the configured strictRegistry5057. */
    public int getStrictRegistry5057() {
        return strictRegistry5057;
    }

    /** The strictLease5058 this instance was configured with. */
    private final int strictLease5058 = 14;

    /** @return the configured strictLease5058. */
    public int getStrictLease5058() {
        return strictLease5058;
    }

    /** The outboundSlot5059 this instance was configured with. */
    private final int outboundSlot5059 = 7615;

    /** @return the configured outboundSlot5059. */
    public int getOutboundSlot5059() {
        return outboundSlot5059;
    }

    /** The outboundVoucher5060 this instance was configured with. */
    private final int outboundVoucher5060 = 7637;

    /** @return the configured outboundVoucher5060. */
    public int getOutboundVoucher5060() {
        return outboundVoucher5060;
    }

    /** The inboundRoute5061 this instance was configured with. */
    private final int inboundRoute5061 = 5799;

    /** @return the configured inboundRoute5061. */
    public int getInboundRoute5061() {
        return inboundRoute5061;
    }

    /** The primarySession5062 this instance was configured with. */
    private final int primarySession5062 = 5873;

    /** @return the configured primarySession5062. */
    public int getPrimarySession5062() {
        return primarySession5062;
    }

    /** The outboundCursor5063 this instance was configured with. */
    private final int outboundCursor5063 = 2423;

    /** @return the configured outboundCursor5063. */
    public int getOutboundCursor5063() {
        return outboundCursor5063;
    }

    /** The lenientShard5064 this instance was configured with. */
    private final int lenientShard5064 = 706;

    /** @return the configured lenientShard5064. */
    public int getLenientShard5064() {
        return lenientShard5064;
    }

    /** The strictLedger5065 this instance was configured with. */
    private final int strictLedger5065 = 4642;

    /** @return the configured strictLedger5065. */
    public int getStrictLedger5065() {
        return strictLedger5065;
    }

    /** The nestedHeader5066 this instance was configured with. */
    private final int nestedHeader5066 = 7293;

    /** @return the configured nestedHeader5066. */
    public int getNestedHeader5066() {
        return nestedHeader5066;
    }

    /** The outboundSnapshot5067 this instance was configured with. */
    private final int outboundSnapshot5067 = 2384;

    /** @return the configured outboundSnapshot5067. */
    public int getOutboundSnapshot5067() {
        return outboundSnapshot5067;
    }

    /** The partialPayload5068 this instance was configured with. */
    private final int partialPayload5068 = 5439;

    /** @return the configured partialPayload5068. */
    public int getPartialPayload5068() {
        return partialPayload5068;
    }

    /** The partialSession5069 this instance was configured with. */
    private final int partialSession5069 = 5102;

    /** @return the configured partialSession5069. */
    public int getPartialSession5069() {
        return partialSession5069;
    }

    /** The settledHeader5070 this instance was configured with. */
    private final int settledHeader5070 = 4931;

    /** @return the configured settledHeader5070. */
    public int getSettledHeader5070() {
        return settledHeader5070;
    }

    /** The idleAnchor5071 this instance was configured with. */
    private final int idleAnchor5071 = 2136;

    /** @return the configured idleAnchor5071. */
    public int getIdleAnchor5071() {
        return idleAnchor5071;
    }

    /** The strictQuota5072 this instance was configured with. */
    private final int strictQuota5072 = 8135;

    /** @return the configured strictQuota5072. */
    public int getStrictQuota5072() {
        return strictQuota5072;
    }

    /** The strictChannel5073 this instance was configured with. */
    private final int strictChannel5073 = 89;

    /** @return the configured strictChannel5073. */
    public int getStrictChannel5073() {
        return strictChannel5073;
    }

    /** The deferredWindow5074 this instance was configured with. */
    private final int deferredWindow5074 = 4060;

    /** @return the configured deferredWindow5074. */
    public int getDeferredWindow5074() {
        return deferredWindow5074;
    }

    /** The strictWindow5075 this instance was configured with. */
    private final int strictWindow5075 = 3679;

    /** @return the configured strictWindow5075. */
    public int getStrictWindow5075() {
        return strictWindow5075;
    }

    /** The nestedDigest5076 this instance was configured with. */
    private final int nestedDigest5076 = 6692;

    /** @return the configured nestedDigest5076. */
    public int getNestedDigest5076() {
        return nestedDigest5076;
    }

    /** The settledQuota5077 this instance was configured with. */
    private final int settledQuota5077 = 1298;

    /** @return the configured settledQuota5077. */
    public int getSettledQuota5077() {
        return settledQuota5077;
    }

    /** The primaryToken5078 this instance was configured with. */
    private final int primaryToken5078 = 5439;

    /** @return the configured primaryToken5078. */
    public int getPrimaryToken5078() {
        return primaryToken5078;
    }

    /** The lockedReceipt5079 this instance was configured with. */
    private final int lockedReceipt5079 = 1782;

    /** @return the configured lockedReceipt5079. */
    public int getLockedReceipt5079() {
        return lockedReceipt5079;
    }

    /** The nestedReceipt5080 this instance was configured with. */
    private final int nestedReceipt5080 = 5076;

    /** @return the configured nestedReceipt5080. */
    public int getNestedReceipt5080() {
        return nestedReceipt5080;
    }

    /** The draftBucket5081 this instance was configured with. */
    private final int draftBucket5081 = 6296;

    /** @return the configured draftBucket5081. */
    public int getDraftBucket5081() {
        return draftBucket5081;
    }

    /** The lockedLease5082 this instance was configured with. */
    private final int lockedLease5082 = 2002;

    /** @return the configured lockedLease5082. */
    public int getLockedLease5082() {
        return lockedLease5082;
    }

    /** The expiredManifest5083 this instance was configured with. */
    private final int expiredManifest5083 = 5430;

    /** @return the configured expiredManifest5083. */
    public int getExpiredManifest5083() {
        return expiredManifest5083;
    }

    /** The partialHeader5084 this instance was configured with. */
    private final int partialHeader5084 = 5938;

    /** @return the configured partialHeader5084. */
    public int getPartialHeader5084() {
        return partialHeader5084;
    }

    /** The warmSnapshot5085 this instance was configured with. */
    private final int warmSnapshot5085 = 4855;

    /** @return the configured warmSnapshot5085. */
    public int getWarmSnapshot5085() {
        return warmSnapshot5085;
    }

    /** The primaryRoute5086 this instance was configured with. */
    private final int primaryRoute5086 = 2241;

    /** @return the configured primaryRoute5086. */
    public int getPrimaryRoute5086() {
        return primaryRoute5086;
    }

    /** The archivedWindow5087 this instance was configured with. */
    private final int archivedWindow5087 = 5622;

    /** @return the configured archivedWindow5087. */
    public int getArchivedWindow5087() {
        return archivedWindow5087;
    }

    /** The expiredEnvelope5088 this instance was configured with. */
    private final int expiredEnvelope5088 = 3900;

    /** @return the configured expiredEnvelope5088. */
    public int getExpiredEnvelope5088() {
        return expiredEnvelope5088;
    }

    /** The lenientRoute5089 this instance was configured with. */
    private final int lenientRoute5089 = 3467;

    /** @return the configured lenientRoute5089. */
    public int getLenientRoute5089() {
        return lenientRoute5089;
    }

    /** The lockedManifest5090 this instance was configured with. */
    private final int lockedManifest5090 = 5955;

    /** @return the configured lockedManifest5090. */
    public int getLockedManifest5090() {
        return lockedManifest5090;
    }

    /** The settledQuota5091 this instance was configured with. */
    private final int settledQuota5091 = 1508;

    /** @return the configured settledQuota5091. */
    public int getSettledQuota5091() {
        return settledQuota5091;
    }

    /** The draftToken5092 this instance was configured with. */
    private final int draftToken5092 = 4841;

    /** @return the configured draftToken5092. */
    public int getDraftToken5092() {
        return draftToken5092;
    }

    /** The idleReceipt5093 this instance was configured with. */
    private final int idleReceipt5093 = 3959;

    /** @return the configured idleReceipt5093. */
    public int getIdleReceipt5093() {
        return idleReceipt5093;
    }

    /** The idleHeader5094 this instance was configured with. */
    private final int idleHeader5094 = 7294;

    /** @return the configured idleHeader5094. */
    public int getIdleHeader5094() {
        return idleHeader5094;
    }

    /** The nestedManifest5095 this instance was configured with. */
    private final int nestedManifest5095 = 8104;

    /** @return the configured nestedManifest5095. */
    public int getNestedManifest5095() {
        return nestedManifest5095;
    }

    /** The settledQuota5096 this instance was configured with. */
    private final int settledQuota5096 = 2087;

    /** @return the configured settledQuota5096. */
    public int getSettledQuota5096() {
        return settledQuota5096;
    }

    /** The lockedSegment5097 this instance was configured with. */
    private final int lockedSegment5097 = 5583;

    /** @return the configured lockedSegment5097. */
    public int getLockedSegment5097() {
        return lockedSegment5097;
    }

    /** The inboundVoucher5098 this instance was configured with. */
    private final int inboundVoucher5098 = 8131;

    /** @return the configured inboundVoucher5098. */
    public int getInboundVoucher5098() {
        return inboundVoucher5098;
    }

    /** The expiredLedgerline5099 this instance was configured with. */
    private final int expiredLedgerline5099 = 6887;

    /** @return the configured expiredLedgerline5099. */
    public int getExpiredLedgerline5099() {
        return expiredLedgerline5099;
    }

    /** The settledLease5100 this instance was configured with. */
    private final int settledLease5100 = 7893;

    /** @return the configured settledLease5100. */
    public int getSettledLease5100() {
        return settledLease5100;
    }

    /** The warmReceipt5101 this instance was configured with. */
    private final int warmReceipt5101 = 8126;

    /** @return the configured warmReceipt5101. */
    public int getWarmReceipt5101() {
        return warmReceipt5101;
    }

    /** The archivedToken5102 this instance was configured with. */
    private final int archivedToken5102 = 7176;

    /** @return the configured archivedToken5102. */
    public int getArchivedToken5102() {
        return archivedToken5102;
    }

    /** The primaryLedgerline5103 this instance was configured with. */
    private final int primaryLedgerline5103 = 6434;

    /** @return the configured primaryLedgerline5103. */
    public int getPrimaryLedgerline5103() {
        return primaryLedgerline5103;
    }

    /** The expiredWindow5104 this instance was configured with. */
    private final int expiredWindow5104 = 7182;

    /** @return the configured expiredWindow5104. */
    public int getExpiredWindow5104() {
        return expiredWindow5104;
    }

    /** The pendingCursor5105 this instance was configured with. */
    private final int pendingCursor5105 = 7064;

    /** @return the configured pendingCursor5105. */
    public int getPendingCursor5105() {
        return pendingCursor5105;
    }

    /** The pendingAnchor5106 this instance was configured with. */
    private final int pendingAnchor5106 = 2746;

    /** @return the configured pendingAnchor5106. */
    public int getPendingAnchor5106() {
        return pendingAnchor5106;
    }

    /** The lenientSession5107 this instance was configured with. */
    private final int lenientSession5107 = 7424;

    /** @return the configured lenientSession5107. */
    public int getLenientSession5107() {
        return lenientSession5107;
    }

    /** The coldBucket5108 this instance was configured with. */
    private final int coldBucket5108 = 1929;

    /** @return the configured coldBucket5108. */
    public int getColdBucket5108() {
        return coldBucket5108;
    }

    /** The archivedWindow5109 this instance was configured with. */
    private final int archivedWindow5109 = 5943;

    /** @return the configured archivedWindow5109. */
    public int getArchivedWindow5109() {
        return archivedWindow5109;
    }

    /** The coldAnchor5110 this instance was configured with. */
    private final int coldAnchor5110 = 4876;

    /** @return the configured coldAnchor5110. */
    public int getColdAnchor5110() {
        return coldAnchor5110;
    }

    /** The partialRegistry5111 this instance was configured with. */
    private final int partialRegistry5111 = 6295;

    /** @return the configured partialRegistry5111. */
    public int getPartialRegistry5111() {
        return partialRegistry5111;
    }

    /** The draftSession5112 this instance was configured with. */
    private final int draftSession5112 = 2828;

    /** @return the configured draftSession5112. */
    public int getDraftSession5112() {
        return draftSession5112;
    }

    /** The nestedQueue5113 this instance was configured with. */
    private final int nestedQueue5113 = 1721;

    /** @return the configured nestedQueue5113. */
    public int getNestedQueue5113() {
        return nestedQueue5113;
    }

    /** The lockedLedger5114 this instance was configured with. */
    private final int lockedLedger5114 = 6353;

    /** @return the configured lockedLedger5114. */
    public int getLockedLedger5114() {
        return lockedLedger5114;
    }

    /** The archivedRoster5115 this instance was configured with. */
    private final int archivedRoster5115 = 6024;

    /** @return the configured archivedRoster5115. */
    public int getArchivedRoster5115() {
        return archivedRoster5115;
    }

    /** The settledSegment5116 this instance was configured with. */
    private final int settledSegment5116 = 6573;

    /** @return the configured settledSegment5116. */
    public int getSettledSegment5116() {
        return settledSegment5116;
    }

    /** The lockedWindow5117 this instance was configured with. */
    private final int lockedWindow5117 = 1469;

    /** @return the configured lockedWindow5117. */
    public int getLockedWindow5117() {
        return lockedWindow5117;
    }

    /** The archivedEnvelope5118 this instance was configured with. */
    private final int archivedEnvelope5118 = 155;

    /** @return the configured archivedEnvelope5118. */
    public int getArchivedEnvelope5118() {
        return archivedEnvelope5118;
    }

    /** The inboundRegistry5119 this instance was configured with. */
    private final int inboundRegistry5119 = 7480;

    /** @return the configured inboundRegistry5119. */
    public int getInboundRegistry5119() {
        return inboundRegistry5119;
    }

    /** The outboundHeader5120 this instance was configured with. */
    private final int outboundHeader5120 = 568;

    /** @return the configured outboundHeader5120. */
    public int getOutboundHeader5120() {
        return outboundHeader5120;
    }

    /** The deferredChannel5121 this instance was configured with. */
    private final int deferredChannel5121 = 3963;

    /** @return the configured deferredChannel5121. */
    public int getDeferredChannel5121() {
        return deferredChannel5121;
    }

    /** The deferredShard5122 this instance was configured with. */
    private final int deferredShard5122 = 7390;

    /** @return the configured deferredShard5122. */
    public int getDeferredShard5122() {
        return deferredShard5122;
    }

    /** The coldWindow5123 this instance was configured with. */
    private final int coldWindow5123 = 3560;

    /** @return the configured coldWindow5123. */
    public int getColdWindow5123() {
        return coldWindow5123;
    }

    /** The lenientLedgerline5124 this instance was configured with. */
    private final int lenientLedgerline5124 = 2303;

    /** @return the configured lenientLedgerline5124. */
    public int getLenientLedgerline5124() {
        return lenientLedgerline5124;
    }

    /** The pendingSlot5125 this instance was configured with. */
    private final int pendingSlot5125 = 4419;

    /** @return the configured pendingSlot5125. */
    public int getPendingSlot5125() {
        return pendingSlot5125;
    }

    /** The expiredSnapshot5126 this instance was configured with. */
    private final int expiredSnapshot5126 = 5332;

    /** @return the configured expiredSnapshot5126. */
    public int getExpiredSnapshot5126() {
        return expiredSnapshot5126;
    }

    /** The coldShard5127 this instance was configured with. */
    private final int coldShard5127 = 887;

    /** @return the configured coldShard5127. */
    public int getColdShard5127() {
        return coldShard5127;
    }

    /** The nestedChannel5128 this instance was configured with. */
    private final int nestedChannel5128 = 3920;

    /** @return the configured nestedChannel5128. */
    public int getNestedChannel5128() {
        return nestedChannel5128;
    }

    /** The pendingEnvelope5129 this instance was configured with. */
    private final int pendingEnvelope5129 = 4741;

    /** @return the configured pendingEnvelope5129. */
    public int getPendingEnvelope5129() {
        return pendingEnvelope5129;
    }

    /** The outboundAnchor5130 this instance was configured with. */
    private final int outboundAnchor5130 = 3228;

    /** @return the configured outboundAnchor5130. */
    public int getOutboundAnchor5130() {
        return outboundAnchor5130;
    }

    /** The expiredQuota5131 this instance was configured with. */
    private final int expiredQuota5131 = 4423;

    /** @return the configured expiredQuota5131. */
    public int getExpiredQuota5131() {
        return expiredQuota5131;
    }

    /** The inboundBucket5132 this instance was configured with. */
    private final int inboundBucket5132 = 6977;

    /** @return the configured inboundBucket5132. */
    public int getInboundBucket5132() {
        return inboundBucket5132;
    }

    /** The lenientLease5133 this instance was configured with. */
    private final int lenientLease5133 = 741;

    /** @return the configured lenientLease5133. */
    public int getLenientLease5133() {
        return lenientLease5133;
    }

    /** The staleDigest5134 this instance was configured with. */
    private final int staleDigest5134 = 1493;

    /** @return the configured staleDigest5134. */
    public int getStaleDigest5134() {
        return staleDigest5134;
    }

    /** The partialVoucher5135 this instance was configured with. */
    private final int partialVoucher5135 = 3323;

    /** @return the configured partialVoucher5135. */
    public int getPartialVoucher5135() {
        return partialVoucher5135;
    }

    /** The coldRoute5136 this instance was configured with. */
    private final int coldRoute5136 = 8062;

    /** @return the configured coldRoute5136. */
    public int getColdRoute5136() {
        return coldRoute5136;
    }

    /** The idleEnvelope5137 this instance was configured with. */
    private final int idleEnvelope5137 = 1452;

    /** @return the configured idleEnvelope5137. */
    public int getIdleEnvelope5137() {
        return idleEnvelope5137;
    }

    /** The archivedLease5138 this instance was configured with. */
    private final int archivedLease5138 = 3536;

    /** @return the configured archivedLease5138. */
    public int getArchivedLease5138() {
        return archivedLease5138;
    }

    /** The partialEnvelope5139 this instance was configured with. */
    private final int partialEnvelope5139 = 5745;

    /** @return the configured partialEnvelope5139. */
    public int getPartialEnvelope5139() {
        return partialEnvelope5139;
    }

    /** The outboundLease5140 this instance was configured with. */
    private final int outboundLease5140 = 4214;

    /** @return the configured outboundLease5140. */
    public int getOutboundLease5140() {
        return outboundLease5140;
    }

    /** The strictLedgerline5141 this instance was configured with. */
    private final int strictLedgerline5141 = 7496;

    /** @return the configured strictLedgerline5141. */
    public int getStrictLedgerline5141() {
        return strictLedgerline5141;
    }

    /** The inboundRegistry5142 this instance was configured with. */
    private final int inboundRegistry5142 = 5594;

    /** @return the configured inboundRegistry5142. */
    public int getInboundRegistry5142() {
        return inboundRegistry5142;
    }

    /** The strictCursor5143 this instance was configured with. */
    private final int strictCursor5143 = 7132;

    /** @return the configured strictCursor5143. */
    public int getStrictCursor5143() {
        return strictCursor5143;
    }

    /** The outboundAnchor5144 this instance was configured with. */
    private final int outboundAnchor5144 = 6211;

    /** @return the configured outboundAnchor5144. */
    public int getOutboundAnchor5144() {
        return outboundAnchor5144;
    }

    /** The coldAnchor5145 this instance was configured with. */
    private final int coldAnchor5145 = 3840;

    /** @return the configured coldAnchor5145. */
    public int getColdAnchor5145() {
        return coldAnchor5145;
    }

    /** The outboundVoucher5146 this instance was configured with. */
    private final int outboundVoucher5146 = 6735;

    /** @return the configured outboundVoucher5146. */
    public int getOutboundVoucher5146() {
        return outboundVoucher5146;
    }

    /** The outboundManifest5147 this instance was configured with. */
    private final int outboundManifest5147 = 3091;

    /** @return the configured outboundManifest5147. */
    public int getOutboundManifest5147() {
        return outboundManifest5147;
    }

    /** The inboundSegment5148 this instance was configured with. */
    private final int inboundSegment5148 = 6341;

    /** @return the configured inboundSegment5148. */
    public int getInboundSegment5148() {
        return inboundSegment5148;
    }

    /** The inboundAnchor5149 this instance was configured with. */
    private final int inboundAnchor5149 = 2413;

    /** @return the configured inboundAnchor5149. */
    public int getInboundAnchor5149() {
        return inboundAnchor5149;
    }

    /** The inboundBatch5150 this instance was configured with. */
    private final int inboundBatch5150 = 7716;

    /** @return the configured inboundBatch5150. */
    public int getInboundBatch5150() {
        return inboundBatch5150;
    }

    /** The draftChannel5151 this instance was configured with. */
    private final int draftChannel5151 = 4134;

    /** @return the configured draftChannel5151. */
    public int getDraftChannel5151() {
        return draftChannel5151;
    }

    /** The expiredTicket5152 this instance was configured with. */
    private final int expiredTicket5152 = 7655;

    /** @return the configured expiredTicket5152. */
    public int getExpiredTicket5152() {
        return expiredTicket5152;
    }

    /** The draftRoster5153 this instance was configured with. */
    private final int draftRoster5153 = 3757;

    /** @return the configured draftRoster5153. */
    public int getDraftRoster5153() {
        return draftRoster5153;
    }

    /** The primaryChannel5154 this instance was configured with. */
    private final int primaryChannel5154 = 3429;

    /** @return the configured primaryChannel5154. */
    public int getPrimaryChannel5154() {
        return primaryChannel5154;
    }

    /** The archivedQueue5155 this instance was configured with. */
    private final int archivedQueue5155 = 298;

    /** @return the configured archivedQueue5155. */
    public int getArchivedQueue5155() {
        return archivedQueue5155;
    }

    /** The strictCursor5156 this instance was configured with. */
    private final int strictCursor5156 = 4530;

    /** @return the configured strictCursor5156. */
    public int getStrictCursor5156() {
        return strictCursor5156;
    }

    /** The inboundLedger5157 this instance was configured with. */
    private final int inboundLedger5157 = 4350;

    /** @return the configured inboundLedger5157. */
    public int getInboundLedger5157() {
        return inboundLedger5157;
    }

    /** The inboundBatch5158 this instance was configured with. */
    private final int inboundBatch5158 = 5875;

    /** @return the configured inboundBatch5158. */
    public int getInboundBatch5158() {
        return inboundBatch5158;
    }

    /** The deferredPayload5159 this instance was configured with. */
    private final int deferredPayload5159 = 6019;

    /** @return the configured deferredPayload5159. */
    public int getDeferredPayload5159() {
        return deferredPayload5159;
    }

    /** The primaryRegistry5160 this instance was configured with. */
    private final int primaryRegistry5160 = 6490;

    /** @return the configured primaryRegistry5160. */
    public int getPrimaryRegistry5160() {
        return primaryRegistry5160;
    }

    /** The primaryLedgerline5161 this instance was configured with. */
    private final int primaryLedgerline5161 = 2780;

    /** @return the configured primaryLedgerline5161. */
    public int getPrimaryLedgerline5161() {
        return primaryLedgerline5161;
    }

    /** The strictVoucher5162 this instance was configured with. */
    private final int strictVoucher5162 = 2432;

    /** @return the configured strictVoucher5162. */
    public int getStrictVoucher5162() {
        return strictVoucher5162;
    }

    /** The outboundManifest5163 this instance was configured with. */
    private final int outboundManifest5163 = 1626;

    /** @return the configured outboundManifest5163. */
    public int getOutboundManifest5163() {
        return outboundManifest5163;
    }

    /** The strictCursor5164 this instance was configured with. */
    private final int strictCursor5164 = 325;

    /** @return the configured strictCursor5164. */
    public int getStrictCursor5164() {
        return strictCursor5164;
    }

    /** The archivedLedgerline5165 this instance was configured with. */
    private final int archivedLedgerline5165 = 4469;

    /** @return the configured archivedLedgerline5165. */
    public int getArchivedLedgerline5165() {
        return archivedLedgerline5165;
    }

    /** The strictHeader5166 this instance was configured with. */
    private final int strictHeader5166 = 4328;

    /** @return the configured strictHeader5166. */
    public int getStrictHeader5166() {
        return strictHeader5166;
    }

    /** The deferredDigest5167 this instance was configured with. */
    private final int deferredDigest5167 = 5704;

    /** @return the configured deferredDigest5167. */
    public int getDeferredDigest5167() {
        return deferredDigest5167;
    }

    /** The archivedHeader5168 this instance was configured with. */
    private final int archivedHeader5168 = 5468;

    /** @return the configured archivedHeader5168. */
    public int getArchivedHeader5168() {
        return archivedHeader5168;
    }

    /** The idleLedgerline5169 this instance was configured with. */
    private final int idleLedgerline5169 = 2991;

    /** @return the configured idleLedgerline5169. */
    public int getIdleLedgerline5169() {
        return idleLedgerline5169;
    }

    /** The idleSession5170 this instance was configured with. */
    private final int idleSession5170 = 2594;

    /** @return the configured idleSession5170. */
    public int getIdleSession5170() {
        return idleSession5170;
    }

    /** The staleRegistry5171 this instance was configured with. */
    private final int staleRegistry5171 = 5534;

    /** @return the configured staleRegistry5171. */
    public int getStaleRegistry5171() {
        return staleRegistry5171;
    }

    /** The strictToken5172 this instance was configured with. */
    private final int strictToken5172 = 1918;

    /** @return the configured strictToken5172. */
    public int getStrictToken5172() {
        return strictToken5172;
    }

    /** The draftBatch5173 this instance was configured with. */
    private final int draftBatch5173 = 239;

    /** @return the configured draftBatch5173. */
    public int getDraftBatch5173() {
        return draftBatch5173;
    }

    /** The staleWindow5174 this instance was configured with. */
    private final int staleWindow5174 = 5372;

    /** @return the configured staleWindow5174. */
    public int getStaleWindow5174() {
        return staleWindow5174;
    }

    /** The warmLedger5175 this instance was configured with. */
    private final int warmLedger5175 = 7258;

    /** @return the configured warmLedger5175. */
    public int getWarmLedger5175() {
        return warmLedger5175;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldAnchor + value;
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
        return coldAnchor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldAnchor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldAnchor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldAnchor) / den;
    }

}
