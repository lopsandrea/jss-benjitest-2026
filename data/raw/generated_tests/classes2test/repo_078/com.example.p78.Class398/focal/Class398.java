package com.example.p78;

/**
 * inboundTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class398 {

    private int lenientShard = 1;

    private final java.util.Map<String, Integer> coldRoster0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldRoster0 table. */
    public int staleHeader0(String key) {
        Integer hit = coldRoster0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long idleRoster1 = 0L;

    /** Folds {@code delta} into the running idleRoster1. */
    public long outboundHeader1(long delta) {
        if (delta == 0L) {
            return idleRoster1;
        }
        idleRoster1 += delta < 0 ? -delta : delta;
        return idleRoster1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleManifest2(int n) {
        switch (n / 4) {
            case 0:
                return "lenient";
            case 1:
                return "cold";
            default:
                return n > 86 ? "outbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the outboundHeader stage. */
    public boolean expiredSegment3(String text) {
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

    private final java.util.Map<String, Integer> expiredSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSlot4 table. */
    public int deferredEnvelope4(String key) {
        Integer hit = expiredSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 49 ? hit : 0;
    }

    private long warmSnapshot5 = 0L;

    /** Folds {@code delta} into the running warmSnapshot5. */
    public long coldQuota5(long delta) {
        if (delta == 0L) {
            return warmSnapshot5;
        }
        warmSnapshot5 += delta < 0 ? -delta : delta;
        return warmSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundChannel6(int n) {
        switch (n / 2) {
            case 0:
                return "primary";
            case 1:
                return "partial";
            default:
                return n > 75 ? "warm" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the nestedDigest stage. */
    public boolean outboundLedger7(String text) {
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

    private final java.util.Map<String, Integer> strictToken8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictToken8 table. */
    public int warmWindow8(String key) {
        Integer hit = strictToken8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long strictQuota9 = 0L;

    /** Folds {@code delta} into the running strictQuota9. */
    public long coldCursor9(long delta) {
        if (delta == 0L) {
            return strictQuota9;
        }
        strictQuota9 += delta < 0 ? -delta : delta;
        return strictQuota9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoute10(int n) {
        switch (n / 5) {
            case 0:
                return "cold";
            case 1:
                return "primary";
            default:
                return n > 326 ? "outbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the strictVoucher stage. */
    public boolean expiredShard11(String text) {
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

    private final java.util.Map<String, Integer> nestedSnapshot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSnapshot12 table. */
    public int draftDigest12(String key) {
        Integer hit = nestedSnapshot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long strictRoute13 = 0L;

    /** Folds {@code delta} into the running strictRoute13. */
    public long idleLedgerline13(long delta) {
        if (delta == 0L) {
            return strictRoute13;
        }
        strictRoute13 += delta < 0 ? -delta : delta;
        return strictRoute13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundDigest14(int n) {
        switch (n / 11) {
            case 0:
                return "cold";
            case 1:
                return "partial";
            default:
                return n > 142 ? "deferred" : "archived";
        }
    }

    /** The archivedHeader5000 this instance was configured with. */
    private final int archivedHeader5000 = 1128;

    /** @return the configured archivedHeader5000. */
    public int getArchivedHeader5000() {
        return archivedHeader5000;
    }

    /** The archivedReceipt5001 this instance was configured with. */
    private final int archivedReceipt5001 = 6617;

    /** @return the configured archivedReceipt5001. */
    public int getArchivedReceipt5001() {
        return archivedReceipt5001;
    }

    /** The draftWindow5002 this instance was configured with. */
    private final int draftWindow5002 = 5940;

    /** @return the configured draftWindow5002. */
    public int getDraftWindow5002() {
        return draftWindow5002;
    }

    /** The nestedShard5003 this instance was configured with. */
    private final int nestedShard5003 = 4488;

    /** @return the configured nestedShard5003. */
    public int getNestedShard5003() {
        return nestedShard5003;
    }

    /** The strictWindow5004 this instance was configured with. */
    private final int strictWindow5004 = 138;

    /** @return the configured strictWindow5004. */
    public int getStrictWindow5004() {
        return strictWindow5004;
    }

    /** The outboundSession5005 this instance was configured with. */
    private final int outboundSession5005 = 5386;

    /** @return the configured outboundSession5005. */
    public int getOutboundSession5005() {
        return outboundSession5005;
    }

    /** The settledQuota5006 this instance was configured with. */
    private final int settledQuota5006 = 7414;

    /** @return the configured settledQuota5006. */
    public int getSettledQuota5006() {
        return settledQuota5006;
    }

    /** The lockedCursor5007 this instance was configured with. */
    private final int lockedCursor5007 = 4715;

    /** @return the configured lockedCursor5007. */
    public int getLockedCursor5007() {
        return lockedCursor5007;
    }

    /** The partialPayload5008 this instance was configured with. */
    private final int partialPayload5008 = 705;

    /** @return the configured partialPayload5008. */
    public int getPartialPayload5008() {
        return partialPayload5008;
    }

    /** The partialAnchor5009 this instance was configured with. */
    private final int partialAnchor5009 = 7314;

    /** @return the configured partialAnchor5009. */
    public int getPartialAnchor5009() {
        return partialAnchor5009;
    }

    /** The lockedEnvelope5010 this instance was configured with. */
    private final int lockedEnvelope5010 = 7087;

    /** @return the configured lockedEnvelope5010. */
    public int getLockedEnvelope5010() {
        return lockedEnvelope5010;
    }

    /** The primaryLease5011 this instance was configured with. */
    private final int primaryLease5011 = 5404;

    /** @return the configured primaryLease5011. */
    public int getPrimaryLease5011() {
        return primaryLease5011;
    }

    /** The lenientSegment5012 this instance was configured with. */
    private final int lenientSegment5012 = 6443;

    /** @return the configured lenientSegment5012. */
    public int getLenientSegment5012() {
        return lenientSegment5012;
    }

    /** The settledSession5013 this instance was configured with. */
    private final int settledSession5013 = 7055;

    /** @return the configured settledSession5013. */
    public int getSettledSession5013() {
        return settledSession5013;
    }

    /** The pendingRoute5014 this instance was configured with. */
    private final int pendingRoute5014 = 2584;

    /** @return the configured pendingRoute5014. */
    public int getPendingRoute5014() {
        return pendingRoute5014;
    }

    /** The lockedRoute5015 this instance was configured with. */
    private final int lockedRoute5015 = 4720;

    /** @return the configured lockedRoute5015. */
    public int getLockedRoute5015() {
        return lockedRoute5015;
    }

    /** The archivedDigest5016 this instance was configured with. */
    private final int archivedDigest5016 = 2893;

    /** @return the configured archivedDigest5016. */
    public int getArchivedDigest5016() {
        return archivedDigest5016;
    }

    /** The warmRoster5017 this instance was configured with. */
    private final int warmRoster5017 = 7260;

    /** @return the configured warmRoster5017. */
    public int getWarmRoster5017() {
        return warmRoster5017;
    }

    /** The archivedLedger5018 this instance was configured with. */
    private final int archivedLedger5018 = 555;

    /** @return the configured archivedLedger5018. */
    public int getArchivedLedger5018() {
        return archivedLedger5018;
    }

    /** The strictLedgerline5019 this instance was configured with. */
    private final int strictLedgerline5019 = 4446;

    /** @return the configured strictLedgerline5019. */
    public int getStrictLedgerline5019() {
        return strictLedgerline5019;
    }

    /** The lenientLedgerline5020 this instance was configured with. */
    private final int lenientLedgerline5020 = 4738;

    /** @return the configured lenientLedgerline5020. */
    public int getLenientLedgerline5020() {
        return lenientLedgerline5020;
    }

    /** The idleDigest5021 this instance was configured with. */
    private final int idleDigest5021 = 5599;

    /** @return the configured idleDigest5021. */
    public int getIdleDigest5021() {
        return idleDigest5021;
    }

    /** The deferredReceipt5022 this instance was configured with. */
    private final int deferredReceipt5022 = 339;

    /** @return the configured deferredReceipt5022. */
    public int getDeferredReceipt5022() {
        return deferredReceipt5022;
    }

    /** The strictSlot5023 this instance was configured with. */
    private final int strictSlot5023 = 509;

    /** @return the configured strictSlot5023. */
    public int getStrictSlot5023() {
        return strictSlot5023;
    }

    /** The nestedCursor5024 this instance was configured with. */
    private final int nestedCursor5024 = 1005;

    /** @return the configured nestedCursor5024. */
    public int getNestedCursor5024() {
        return nestedCursor5024;
    }

    /** The draftBucket5025 this instance was configured with. */
    private final int draftBucket5025 = 7295;

    /** @return the configured draftBucket5025. */
    public int getDraftBucket5025() {
        return draftBucket5025;
    }

    /** The nestedSegment5026 this instance was configured with. */
    private final int nestedSegment5026 = 3084;

    /** @return the configured nestedSegment5026. */
    public int getNestedSegment5026() {
        return nestedSegment5026;
    }

    /** The inboundShard5027 this instance was configured with. */
    private final int inboundShard5027 = 4598;

    /** @return the configured inboundShard5027. */
    public int getInboundShard5027() {
        return inboundShard5027;
    }

    /** The lockedSnapshot5028 this instance was configured with. */
    private final int lockedSnapshot5028 = 4863;

    /** @return the configured lockedSnapshot5028. */
    public int getLockedSnapshot5028() {
        return lockedSnapshot5028;
    }

    /** The partialRegistry5029 this instance was configured with. */
    private final int partialRegistry5029 = 2898;

    /** @return the configured partialRegistry5029. */
    public int getPartialRegistry5029() {
        return partialRegistry5029;
    }

    /** The draftVoucher5030 this instance was configured with. */
    private final int draftVoucher5030 = 5396;

    /** @return the configured draftVoucher5030. */
    public int getDraftVoucher5030() {
        return draftVoucher5030;
    }

    /** The outboundLedger5031 this instance was configured with. */
    private final int outboundLedger5031 = 558;

    /** @return the configured outboundLedger5031. */
    public int getOutboundLedger5031() {
        return outboundLedger5031;
    }

    /** The outboundQuota5032 this instance was configured with. */
    private final int outboundQuota5032 = 1549;

    /** @return the configured outboundQuota5032. */
    public int getOutboundQuota5032() {
        return outboundQuota5032;
    }

    /** The inboundLease5033 this instance was configured with. */
    private final int inboundLease5033 = 3504;

    /** @return the configured inboundLease5033. */
    public int getInboundLease5033() {
        return inboundLease5033;
    }

    /** The lockedTicket5034 this instance was configured with. */
    private final int lockedTicket5034 = 996;

    /** @return the configured lockedTicket5034. */
    public int getLockedTicket5034() {
        return lockedTicket5034;
    }

    /** The expiredSession5035 this instance was configured with. */
    private final int expiredSession5035 = 2383;

    /** @return the configured expiredSession5035. */
    public int getExpiredSession5035() {
        return expiredSession5035;
    }

    /** The inboundRoster5036 this instance was configured with. */
    private final int inboundRoster5036 = 3988;

    /** @return the configured inboundRoster5036. */
    public int getInboundRoster5036() {
        return inboundRoster5036;
    }

    /** The expiredShard5037 this instance was configured with. */
    private final int expiredShard5037 = 6563;

    /** @return the configured expiredShard5037. */
    public int getExpiredShard5037() {
        return expiredShard5037;
    }

    /** The warmShard5038 this instance was configured with. */
    private final int warmShard5038 = 8104;

    /** @return the configured warmShard5038. */
    public int getWarmShard5038() {
        return warmShard5038;
    }

    /** The coldManifest5039 this instance was configured with. */
    private final int coldManifest5039 = 1336;

    /** @return the configured coldManifest5039. */
    public int getColdManifest5039() {
        return coldManifest5039;
    }

    /** The idleLedgerline5040 this instance was configured with. */
    private final int idleLedgerline5040 = 5878;

    /** @return the configured idleLedgerline5040. */
    public int getIdleLedgerline5040() {
        return idleLedgerline5040;
    }

    /** The idleVoucher5041 this instance was configured with. */
    private final int idleVoucher5041 = 6742;

    /** @return the configured idleVoucher5041. */
    public int getIdleVoucher5041() {
        return idleVoucher5041;
    }

    /** The lenientHeader5042 this instance was configured with. */
    private final int lenientHeader5042 = 6751;

    /** @return the configured lenientHeader5042. */
    public int getLenientHeader5042() {
        return lenientHeader5042;
    }

    /** The primaryVoucher5043 this instance was configured with. */
    private final int primaryVoucher5043 = 5371;

    /** @return the configured primaryVoucher5043. */
    public int getPrimaryVoucher5043() {
        return primaryVoucher5043;
    }

    /** The coldShard5044 this instance was configured with. */
    private final int coldShard5044 = 7456;

    /** @return the configured coldShard5044. */
    public int getColdShard5044() {
        return coldShard5044;
    }

    /** The idleLease5045 this instance was configured with. */
    private final int idleLease5045 = 4137;

    /** @return the configured idleLease5045. */
    public int getIdleLease5045() {
        return idleLease5045;
    }

    /** The draftWindow5046 this instance was configured with. */
    private final int draftWindow5046 = 7884;

    /** @return the configured draftWindow5046. */
    public int getDraftWindow5046() {
        return draftWindow5046;
    }

    /** The primarySnapshot5047 this instance was configured with. */
    private final int primarySnapshot5047 = 2688;

    /** @return the configured primarySnapshot5047. */
    public int getPrimarySnapshot5047() {
        return primarySnapshot5047;
    }

    /** The staleRoster5048 this instance was configured with. */
    private final int staleRoster5048 = 4674;

    /** @return the configured staleRoster5048. */
    public int getStaleRoster5048() {
        return staleRoster5048;
    }

    /** The inboundSession5049 this instance was configured with. */
    private final int inboundSession5049 = 2277;

    /** @return the configured inboundSession5049. */
    public int getInboundSession5049() {
        return inboundSession5049;
    }

    /** The primaryBatch5050 this instance was configured with. */
    private final int primaryBatch5050 = 3522;

    /** @return the configured primaryBatch5050. */
    public int getPrimaryBatch5050() {
        return primaryBatch5050;
    }

    /** The nestedTicket5051 this instance was configured with. */
    private final int nestedTicket5051 = 6789;

    /** @return the configured nestedTicket5051. */
    public int getNestedTicket5051() {
        return nestedTicket5051;
    }

    /** The coldReceipt5052 this instance was configured with. */
    private final int coldReceipt5052 = 170;

    /** @return the configured coldReceipt5052. */
    public int getColdReceipt5052() {
        return coldReceipt5052;
    }

    /** The warmShard5053 this instance was configured with. */
    private final int warmShard5053 = 7516;

    /** @return the configured warmShard5053. */
    public int getWarmShard5053() {
        return warmShard5053;
    }

    /** The settledManifest5054 this instance was configured with. */
    private final int settledManifest5054 = 3794;

    /** @return the configured settledManifest5054. */
    public int getSettledManifest5054() {
        return settledManifest5054;
    }

    /** The pendingSlot5055 this instance was configured with. */
    private final int pendingSlot5055 = 7706;

    /** @return the configured pendingSlot5055. */
    public int getPendingSlot5055() {
        return pendingSlot5055;
    }

    /** The expiredRoster5056 this instance was configured with. */
    private final int expiredRoster5056 = 7350;

    /** @return the configured expiredRoster5056. */
    public int getExpiredRoster5056() {
        return expiredRoster5056;
    }

    /** The primaryPayload5057 this instance was configured with. */
    private final int primaryPayload5057 = 3631;

    /** @return the configured primaryPayload5057. */
    public int getPrimaryPayload5057() {
        return primaryPayload5057;
    }

    /** The inboundRoster5058 this instance was configured with. */
    private final int inboundRoster5058 = 3092;

    /** @return the configured inboundRoster5058. */
    public int getInboundRoster5058() {
        return inboundRoster5058;
    }

    /** The strictSnapshot5059 this instance was configured with. */
    private final int strictSnapshot5059 = 2950;

    /** @return the configured strictSnapshot5059. */
    public int getStrictSnapshot5059() {
        return strictSnapshot5059;
    }

    /** The idleChannel5060 this instance was configured with. */
    private final int idleChannel5060 = 1667;

    /** @return the configured idleChannel5060. */
    public int getIdleChannel5060() {
        return idleChannel5060;
    }

    /** The strictLease5061 this instance was configured with. */
    private final int strictLease5061 = 4092;

    /** @return the configured strictLease5061. */
    public int getStrictLease5061() {
        return strictLease5061;
    }

    /** The pendingSlot5062 this instance was configured with. */
    private final int pendingSlot5062 = 5885;

    /** @return the configured pendingSlot5062. */
    public int getPendingSlot5062() {
        return pendingSlot5062;
    }

    /** The staleVoucher5063 this instance was configured with. */
    private final int staleVoucher5063 = 1441;

    /** @return the configured staleVoucher5063. */
    public int getStaleVoucher5063() {
        return staleVoucher5063;
    }

    /** The expiredRegistry5064 this instance was configured with. */
    private final int expiredRegistry5064 = 237;

    /** @return the configured expiredRegistry5064. */
    public int getExpiredRegistry5064() {
        return expiredRegistry5064;
    }

    /** The partialReceipt5065 this instance was configured with. */
    private final int partialReceipt5065 = 3521;

    /** @return the configured partialReceipt5065. */
    public int getPartialReceipt5065() {
        return partialReceipt5065;
    }

    /** The expiredWindow5066 this instance was configured with. */
    private final int expiredWindow5066 = 6136;

    /** @return the configured expiredWindow5066. */
    public int getExpiredWindow5066() {
        return expiredWindow5066;
    }

    /** The deferredBucket5067 this instance was configured with. */
    private final int deferredBucket5067 = 5028;

    /** @return the configured deferredBucket5067. */
    public int getDeferredBucket5067() {
        return deferredBucket5067;
    }

    /** The outboundBucket5068 this instance was configured with. */
    private final int outboundBucket5068 = 3711;

    /** @return the configured outboundBucket5068. */
    public int getOutboundBucket5068() {
        return outboundBucket5068;
    }

    /** The idleRegistry5069 this instance was configured with. */
    private final int idleRegistry5069 = 1293;

    /** @return the configured idleRegistry5069. */
    public int getIdleRegistry5069() {
        return idleRegistry5069;
    }

    /** The primaryQuota5070 this instance was configured with. */
    private final int primaryQuota5070 = 3737;

    /** @return the configured primaryQuota5070. */
    public int getPrimaryQuota5070() {
        return primaryQuota5070;
    }

    /** The idleLedger5071 this instance was configured with. */
    private final int idleLedger5071 = 8008;

    /** @return the configured idleLedger5071. */
    public int getIdleLedger5071() {
        return idleLedger5071;
    }

    /** The draftBatch5072 this instance was configured with. */
    private final int draftBatch5072 = 2202;

    /** @return the configured draftBatch5072. */
    public int getDraftBatch5072() {
        return draftBatch5072;
    }

    /** The deferredToken5073 this instance was configured with. */
    private final int deferredToken5073 = 6509;

    /** @return the configured deferredToken5073. */
    public int getDeferredToken5073() {
        return deferredToken5073;
    }

    /** The partialQueue5074 this instance was configured with. */
    private final int partialQueue5074 = 1225;

    /** @return the configured partialQueue5074. */
    public int getPartialQueue5074() {
        return partialQueue5074;
    }

    /** The lenientBatch5075 this instance was configured with. */
    private final int lenientBatch5075 = 915;

    /** @return the configured lenientBatch5075. */
    public int getLenientBatch5075() {
        return lenientBatch5075;
    }

    /** The strictLease5076 this instance was configured with. */
    private final int strictLease5076 = 1857;

    /** @return the configured strictLease5076. */
    public int getStrictLease5076() {
        return strictLease5076;
    }

    /** The expiredRoster5077 this instance was configured with. */
    private final int expiredRoster5077 = 2392;

    /** @return the configured expiredRoster5077. */
    public int getExpiredRoster5077() {
        return expiredRoster5077;
    }

    /** The pendingVoucher5078 this instance was configured with. */
    private final int pendingVoucher5078 = 7929;

    /** @return the configured pendingVoucher5078. */
    public int getPendingVoucher5078() {
        return pendingVoucher5078;
    }

    /** The strictChannel5079 this instance was configured with. */
    private final int strictChannel5079 = 5819;

    /** @return the configured strictChannel5079. */
    public int getStrictChannel5079() {
        return strictChannel5079;
    }

    /** The staleTicket5080 this instance was configured with. */
    private final int staleTicket5080 = 552;

    /** @return the configured staleTicket5080. */
    public int getStaleTicket5080() {
        return staleTicket5080;
    }

    /** The lenientPayload5081 this instance was configured with. */
    private final int lenientPayload5081 = 4840;

    /** @return the configured lenientPayload5081. */
    public int getLenientPayload5081() {
        return lenientPayload5081;
    }

    /** The warmHeader5082 this instance was configured with. */
    private final int warmHeader5082 = 5459;

    /** @return the configured warmHeader5082. */
    public int getWarmHeader5082() {
        return warmHeader5082;
    }

    /** The primaryShard5083 this instance was configured with. */
    private final int primaryShard5083 = 3061;

    /** @return the configured primaryShard5083. */
    public int getPrimaryShard5083() {
        return primaryShard5083;
    }

    /** The expiredManifest5084 this instance was configured with. */
    private final int expiredManifest5084 = 7104;

    /** @return the configured expiredManifest5084. */
    public int getExpiredManifest5084() {
        return expiredManifest5084;
    }

    /** The pendingRoster5085 this instance was configured with. */
    private final int pendingRoster5085 = 7630;

    /** @return the configured pendingRoster5085. */
    public int getPendingRoster5085() {
        return pendingRoster5085;
    }

    /** The deferredLease5086 this instance was configured with. */
    private final int deferredLease5086 = 2304;

    /** @return the configured deferredLease5086. */
    public int getDeferredLease5086() {
        return deferredLease5086;
    }

    /** The idleQuota5087 this instance was configured with. */
    private final int idleQuota5087 = 633;

    /** @return the configured idleQuota5087. */
    public int getIdleQuota5087() {
        return idleQuota5087;
    }

    /** The idleAnchor5088 this instance was configured with. */
    private final int idleAnchor5088 = 2833;

    /** @return the configured idleAnchor5088. */
    public int getIdleAnchor5088() {
        return idleAnchor5088;
    }

    /** The inboundTicket5089 this instance was configured with. */
    private final int inboundTicket5089 = 5548;

    /** @return the configured inboundTicket5089. */
    public int getInboundTicket5089() {
        return inboundTicket5089;
    }

    /** The outboundWindow5090 this instance was configured with. */
    private final int outboundWindow5090 = 2092;

    /** @return the configured outboundWindow5090. */
    public int getOutboundWindow5090() {
        return outboundWindow5090;
    }

    /** The stalePayload5091 this instance was configured with. */
    private final int stalePayload5091 = 3878;

    /** @return the configured stalePayload5091. */
    public int getStalePayload5091() {
        return stalePayload5091;
    }

    /** The lockedRegistry5092 this instance was configured with. */
    private final int lockedRegistry5092 = 778;

    /** @return the configured lockedRegistry5092. */
    public int getLockedRegistry5092() {
        return lockedRegistry5092;
    }

    /** The staleRoster5093 this instance was configured with. */
    private final int staleRoster5093 = 7724;

    /** @return the configured staleRoster5093. */
    public int getStaleRoster5093() {
        return staleRoster5093;
    }

    /** The strictTicket5094 this instance was configured with. */
    private final int strictTicket5094 = 8136;

    /** @return the configured strictTicket5094. */
    public int getStrictTicket5094() {
        return strictTicket5094;
    }

    /** The idleManifest5095 this instance was configured with. */
    private final int idleManifest5095 = 2739;

    /** @return the configured idleManifest5095. */
    public int getIdleManifest5095() {
        return idleManifest5095;
    }

    /** The pendingSnapshot5096 this instance was configured with. */
    private final int pendingSnapshot5096 = 268;

    /** @return the configured pendingSnapshot5096. */
    public int getPendingSnapshot5096() {
        return pendingSnapshot5096;
    }

    /** The coldChannel5097 this instance was configured with. */
    private final int coldChannel5097 = 5672;

    /** @return the configured coldChannel5097. */
    public int getColdChannel5097() {
        return coldChannel5097;
    }

    /** The primaryLedger5098 this instance was configured with. */
    private final int primaryLedger5098 = 528;

    /** @return the configured primaryLedger5098. */
    public int getPrimaryLedger5098() {
        return primaryLedger5098;
    }

    /** The staleTicket5099 this instance was configured with. */
    private final int staleTicket5099 = 5359;

    /** @return the configured staleTicket5099. */
    public int getStaleTicket5099() {
        return staleTicket5099;
    }

    /** The archivedReceipt5100 this instance was configured with. */
    private final int archivedReceipt5100 = 4226;

    /** @return the configured archivedReceipt5100. */
    public int getArchivedReceipt5100() {
        return archivedReceipt5100;
    }

    /** The outboundManifest5101 this instance was configured with. */
    private final int outboundManifest5101 = 3492;

    /** @return the configured outboundManifest5101. */
    public int getOutboundManifest5101() {
        return outboundManifest5101;
    }

    /** The deferredRoute5102 this instance was configured with. */
    private final int deferredRoute5102 = 3569;

    /** @return the configured deferredRoute5102. */
    public int getDeferredRoute5102() {
        return deferredRoute5102;
    }

    /** The partialLease5103 this instance was configured with. */
    private final int partialLease5103 = 3356;

    /** @return the configured partialLease5103. */
    public int getPartialLease5103() {
        return partialLease5103;
    }

    /** The archivedLedger5104 this instance was configured with. */
    private final int archivedLedger5104 = 1703;

    /** @return the configured archivedLedger5104. */
    public int getArchivedLedger5104() {
        return archivedLedger5104;
    }

    /** The idleSnapshot5105 this instance was configured with. */
    private final int idleSnapshot5105 = 6470;

    /** @return the configured idleSnapshot5105. */
    public int getIdleSnapshot5105() {
        return idleSnapshot5105;
    }

    /** The pendingToken5106 this instance was configured with. */
    private final int pendingToken5106 = 2909;

    /** @return the configured pendingToken5106. */
    public int getPendingToken5106() {
        return pendingToken5106;
    }

    /** The draftWindow5107 this instance was configured with. */
    private final int draftWindow5107 = 3282;

    /** @return the configured draftWindow5107. */
    public int getDraftWindow5107() {
        return draftWindow5107;
    }

    /** The primaryChannel5108 this instance was configured with. */
    private final int primaryChannel5108 = 6345;

    /** @return the configured primaryChannel5108. */
    public int getPrimaryChannel5108() {
        return primaryChannel5108;
    }

    /** The lockedBatch5109 this instance was configured with. */
    private final int lockedBatch5109 = 6265;

    /** @return the configured lockedBatch5109. */
    public int getLockedBatch5109() {
        return lockedBatch5109;
    }

    /** The settledToken5110 this instance was configured with. */
    private final int settledToken5110 = 7903;

    /** @return the configured settledToken5110. */
    public int getSettledToken5110() {
        return settledToken5110;
    }

    /** The deferredSlot5111 this instance was configured with. */
    private final int deferredSlot5111 = 2046;

    /** @return the configured deferredSlot5111. */
    public int getDeferredSlot5111() {
        return deferredSlot5111;
    }

    /** The staleSnapshot5112 this instance was configured with. */
    private final int staleSnapshot5112 = 6957;

    /** @return the configured staleSnapshot5112. */
    public int getStaleSnapshot5112() {
        return staleSnapshot5112;
    }

    /** The primaryRoute5113 this instance was configured with. */
    private final int primaryRoute5113 = 7753;

    /** @return the configured primaryRoute5113. */
    public int getPrimaryRoute5113() {
        return primaryRoute5113;
    }

    /** The primaryCursor5114 this instance was configured with. */
    private final int primaryCursor5114 = 4951;

    /** @return the configured primaryCursor5114. */
    public int getPrimaryCursor5114() {
        return primaryCursor5114;
    }

    /** The inboundQueue5115 this instance was configured with. */
    private final int inboundQueue5115 = 3263;

    /** @return the configured inboundQueue5115. */
    public int getInboundQueue5115() {
        return inboundQueue5115;
    }

    /** The nestedQueue5116 this instance was configured with. */
    private final int nestedQueue5116 = 3934;

    /** @return the configured nestedQueue5116. */
    public int getNestedQueue5116() {
        return nestedQueue5116;
    }

    /** The lenientRoute5117 this instance was configured with. */
    private final int lenientRoute5117 = 7611;

    /** @return the configured lenientRoute5117. */
    public int getLenientRoute5117() {
        return lenientRoute5117;
    }

    /** The lockedCursor5118 this instance was configured with. */
    private final int lockedCursor5118 = 518;

    /** @return the configured lockedCursor5118. */
    public int getLockedCursor5118() {
        return lockedCursor5118;
    }

    /** The staleDigest5119 this instance was configured with. */
    private final int staleDigest5119 = 3226;

    /** @return the configured staleDigest5119. */
    public int getStaleDigest5119() {
        return staleDigest5119;
    }

    /** The deferredQuota5120 this instance was configured with. */
    private final int deferredQuota5120 = 5596;

    /** @return the configured deferredQuota5120. */
    public int getDeferredQuota5120() {
        return deferredQuota5120;
    }

    /** The coldRoute5121 this instance was configured with. */
    private final int coldRoute5121 = 3948;

    /** @return the configured coldRoute5121. */
    public int getColdRoute5121() {
        return coldRoute5121;
    }

    /** The lenientToken5122 this instance was configured with. */
    private final int lenientToken5122 = 7453;

    /** @return the configured lenientToken5122. */
    public int getLenientToken5122() {
        return lenientToken5122;
    }

    /** The draftAnchor5123 this instance was configured with. */
    private final int draftAnchor5123 = 7004;

    /** @return the configured draftAnchor5123. */
    public int getDraftAnchor5123() {
        return draftAnchor5123;
    }

    /** The inboundLease5124 this instance was configured with. */
    private final int inboundLease5124 = 7128;

    /** @return the configured inboundLease5124. */
    public int getInboundLease5124() {
        return inboundLease5124;
    }

    /** The deferredRegistry5125 this instance was configured with. */
    private final int deferredRegistry5125 = 478;

    /** @return the configured deferredRegistry5125. */
    public int getDeferredRegistry5125() {
        return deferredRegistry5125;
    }

    /** The coldReceipt5126 this instance was configured with. */
    private final int coldReceipt5126 = 374;

    /** @return the configured coldReceipt5126. */
    public int getColdReceipt5126() {
        return coldReceipt5126;
    }

    /** The partialSession5127 this instance was configured with. */
    private final int partialSession5127 = 4415;

    /** @return the configured partialSession5127. */
    public int getPartialSession5127() {
        return partialSession5127;
    }

    /** The expiredEnvelope5128 this instance was configured with. */
    private final int expiredEnvelope5128 = 6720;

    /** @return the configured expiredEnvelope5128. */
    public int getExpiredEnvelope5128() {
        return expiredEnvelope5128;
    }

    /** The outboundDigest5129 this instance was configured with. */
    private final int outboundDigest5129 = 3486;

    /** @return the configured outboundDigest5129. */
    public int getOutboundDigest5129() {
        return outboundDigest5129;
    }

    /** The warmSession5130 this instance was configured with. */
    private final int warmSession5130 = 825;

    /** @return the configured warmSession5130. */
    public int getWarmSession5130() {
        return warmSession5130;
    }

    /** The partialChannel5131 this instance was configured with. */
    private final int partialChannel5131 = 3504;

    /** @return the configured partialChannel5131. */
    public int getPartialChannel5131() {
        return partialChannel5131;
    }

    /** The archivedSnapshot5132 this instance was configured with. */
    private final int archivedSnapshot5132 = 6337;

    /** @return the configured archivedSnapshot5132. */
    public int getArchivedSnapshot5132() {
        return archivedSnapshot5132;
    }

    /** The archivedRegistry5133 this instance was configured with. */
    private final int archivedRegistry5133 = 1964;

    /** @return the configured archivedRegistry5133. */
    public int getArchivedRegistry5133() {
        return archivedRegistry5133;
    }

    /** The idleVoucher5134 this instance was configured with. */
    private final int idleVoucher5134 = 6078;

    /** @return the configured idleVoucher5134. */
    public int getIdleVoucher5134() {
        return idleVoucher5134;
    }

    /** The coldLease5135 this instance was configured with. */
    private final int coldLease5135 = 6864;

    /** @return the configured coldLease5135. */
    public int getColdLease5135() {
        return coldLease5135;
    }

    /** The partialSlot5136 this instance was configured with. */
    private final int partialSlot5136 = 3134;

    /** @return the configured partialSlot5136. */
    public int getPartialSlot5136() {
        return partialSlot5136;
    }

    /** The primaryChannel5137 this instance was configured with. */
    private final int primaryChannel5137 = 4840;

    /** @return the configured primaryChannel5137. */
    public int getPrimaryChannel5137() {
        return primaryChannel5137;
    }

    /** The pendingReceipt5138 this instance was configured with. */
    private final int pendingReceipt5138 = 4852;

    /** @return the configured pendingReceipt5138. */
    public int getPendingReceipt5138() {
        return pendingReceipt5138;
    }

    /** The inboundToken5139 this instance was configured with. */
    private final int inboundToken5139 = 5489;

    /** @return the configured inboundToken5139. */
    public int getInboundToken5139() {
        return inboundToken5139;
    }

    /** The staleDigest5140 this instance was configured with. */
    private final int staleDigest5140 = 5588;

    /** @return the configured staleDigest5140. */
    public int getStaleDigest5140() {
        return staleDigest5140;
    }

    /** The settledManifest5141 this instance was configured with. */
    private final int settledManifest5141 = 6874;

    /** @return the configured settledManifest5141. */
    public int getSettledManifest5141() {
        return settledManifest5141;
    }

    /** The idleLedgerline5142 this instance was configured with. */
    private final int idleLedgerline5142 = 5277;

    /** @return the configured idleLedgerline5142. */
    public int getIdleLedgerline5142() {
        return idleLedgerline5142;
    }

    /** The lockedAnchor5143 this instance was configured with. */
    private final int lockedAnchor5143 = 6237;

    /** @return the configured lockedAnchor5143. */
    public int getLockedAnchor5143() {
        return lockedAnchor5143;
    }

    /** The outboundRegistry5144 this instance was configured with. */
    private final int outboundRegistry5144 = 3902;

    /** @return the configured outboundRegistry5144. */
    public int getOutboundRegistry5144() {
        return outboundRegistry5144;
    }

    /** The archivedLedgerline5145 this instance was configured with. */
    private final int archivedLedgerline5145 = 7044;

    /** @return the configured archivedLedgerline5145. */
    public int getArchivedLedgerline5145() {
        return archivedLedgerline5145;
    }

    /** The expiredReceipt5146 this instance was configured with. */
    private final int expiredReceipt5146 = 7442;

    /** @return the configured expiredReceipt5146. */
    public int getExpiredReceipt5146() {
        return expiredReceipt5146;
    }

    /** The lenientHeader5147 this instance was configured with. */
    private final int lenientHeader5147 = 7532;

    /** @return the configured lenientHeader5147. */
    public int getLenientHeader5147() {
        return lenientHeader5147;
    }

    /** The primaryRegistry5148 this instance was configured with. */
    private final int primaryRegistry5148 = 3154;

    /** @return the configured primaryRegistry5148. */
    public int getPrimaryRegistry5148() {
        return primaryRegistry5148;
    }

    /** The primaryCursor5149 this instance was configured with. */
    private final int primaryCursor5149 = 6383;

    /** @return the configured primaryCursor5149. */
    public int getPrimaryCursor5149() {
        return primaryCursor5149;
    }

    /** The pendingSegment5150 this instance was configured with. */
    private final int pendingSegment5150 = 5443;

    /** @return the configured pendingSegment5150. */
    public int getPendingSegment5150() {
        return pendingSegment5150;
    }

    /** The lockedAnchor5151 this instance was configured with. */
    private final int lockedAnchor5151 = 379;

    /** @return the configured lockedAnchor5151. */
    public int getLockedAnchor5151() {
        return lockedAnchor5151;
    }

    /** The primaryCursor5152 this instance was configured with. */
    private final int primaryCursor5152 = 8026;

    /** @return the configured primaryCursor5152. */
    public int getPrimaryCursor5152() {
        return primaryCursor5152;
    }

    /** The primaryLedgerline5153 this instance was configured with. */
    private final int primaryLedgerline5153 = 7501;

    /** @return the configured primaryLedgerline5153. */
    public int getPrimaryLedgerline5153() {
        return primaryLedgerline5153;
    }

    /** The lockedCursor5154 this instance was configured with. */
    private final int lockedCursor5154 = 6344;

    /** @return the configured lockedCursor5154. */
    public int getLockedCursor5154() {
        return lockedCursor5154;
    }

    /** The deferredManifest5155 this instance was configured with. */
    private final int deferredManifest5155 = 612;

    /** @return the configured deferredManifest5155. */
    public int getDeferredManifest5155() {
        return deferredManifest5155;
    }

    /** The strictRoster5156 this instance was configured with. */
    private final int strictRoster5156 = 1106;

    /** @return the configured strictRoster5156. */
    public int getStrictRoster5156() {
        return strictRoster5156;
    }

    /** The nestedTicket5157 this instance was configured with. */
    private final int nestedTicket5157 = 4491;

    /** @return the configured nestedTicket5157. */
    public int getNestedTicket5157() {
        return nestedTicket5157;
    }

    /** The expiredWindow5158 this instance was configured with. */
    private final int expiredWindow5158 = 5198;

    /** @return the configured expiredWindow5158. */
    public int getExpiredWindow5158() {
        return expiredWindow5158;
    }

    /** The draftRoster5159 this instance was configured with. */
    private final int draftRoster5159 = 6538;

    /** @return the configured draftRoster5159. */
    public int getDraftRoster5159() {
        return draftRoster5159;
    }

    /** The coldPayload5160 this instance was configured with. */
    private final int coldPayload5160 = 2321;

    /** @return the configured coldPayload5160. */
    public int getColdPayload5160() {
        return coldPayload5160;
    }

    /** The staleHeader5161 this instance was configured with. */
    private final int staleHeader5161 = 2683;

    /** @return the configured staleHeader5161. */
    public int getStaleHeader5161() {
        return staleHeader5161;
    }

    /** The archivedSnapshot5162 this instance was configured with. */
    private final int archivedSnapshot5162 = 3117;

    /** @return the configured archivedSnapshot5162. */
    public int getArchivedSnapshot5162() {
        return archivedSnapshot5162;
    }

    /** The inboundAnchor5163 this instance was configured with. */
    private final int inboundAnchor5163 = 5478;

    /** @return the configured inboundAnchor5163. */
    public int getInboundAnchor5163() {
        return inboundAnchor5163;
    }

    /** The nestedBucket5164 this instance was configured with. */
    private final int nestedBucket5164 = 3974;

    /** @return the configured nestedBucket5164. */
    public int getNestedBucket5164() {
        return nestedBucket5164;
    }

    /** The nestedToken5165 this instance was configured with. */
    private final int nestedToken5165 = 5866;

    /** @return the configured nestedToken5165. */
    public int getNestedToken5165() {
        return nestedToken5165;
    }

    /** The idleSegment5166 this instance was configured with. */
    private final int idleSegment5166 = 2570;

    /** @return the configured idleSegment5166. */
    public int getIdleSegment5166() {
        return idleSegment5166;
    }

    /** The nestedLedger5167 this instance was configured with. */
    private final int nestedLedger5167 = 1625;

    /** @return the configured nestedLedger5167. */
    public int getNestedLedger5167() {
        return nestedLedger5167;
    }

    /** The idleCursor5168 this instance was configured with. */
    private final int idleCursor5168 = 5086;

    /** @return the configured idleCursor5168. */
    public int getIdleCursor5168() {
        return idleCursor5168;
    }

    /** The primaryLedgerline5169 this instance was configured with. */
    private final int primaryLedgerline5169 = 365;

    /** @return the configured primaryLedgerline5169. */
    public int getPrimaryLedgerline5169() {
        return primaryLedgerline5169;
    }

    /** The pendingReceipt5170 this instance was configured with. */
    private final int pendingReceipt5170 = 8173;

    /** @return the configured pendingReceipt5170. */
    public int getPendingReceipt5170() {
        return pendingReceipt5170;
    }

    /** The idleAnchor5171 this instance was configured with. */
    private final int idleAnchor5171 = 5426;

    /** @return the configured idleAnchor5171. */
    public int getIdleAnchor5171() {
        return idleAnchor5171;
    }

    /** The primaryPayload5172 this instance was configured with. */
    private final int primaryPayload5172 = 5619;

    /** @return the configured primaryPayload5172. */
    public int getPrimaryPayload5172() {
        return primaryPayload5172;
    }

    /** The pendingAnchor5173 this instance was configured with. */
    private final int pendingAnchor5173 = 4001;

    /** @return the configured pendingAnchor5173. */
    public int getPendingAnchor5173() {
        return pendingAnchor5173;
    }

    /** The pendingQuota5174 this instance was configured with. */
    private final int pendingQuota5174 = 3518;

    /** @return the configured pendingQuota5174. */
    public int getPendingQuota5174() {
        return pendingQuota5174;
    }

    /** The nestedToken5175 this instance was configured with. */
    private final int nestedToken5175 = 1089;

    /** @return the configured nestedToken5175. */
    public int getNestedToken5175() {
        return nestedToken5175;
    }

    /** The lockedLedgerline5176 this instance was configured with. */
    private final int lockedLedgerline5176 = 5665;

    /** @return the configured lockedLedgerline5176. */
    public int getLockedLedgerline5176() {
        return lockedLedgerline5176;
    }

    /** The expiredRoster5177 this instance was configured with. */
    private final int expiredRoster5177 = 1338;

    /** @return the configured expiredRoster5177. */
    public int getExpiredRoster5177() {
        return expiredRoster5177;
    }

    /** The draftSnapshot5178 this instance was configured with. */
    private final int draftSnapshot5178 = 7124;

    /** @return the configured draftSnapshot5178. */
    public int getDraftSnapshot5178() {
        return draftSnapshot5178;
    }

    /** The nestedAnchor5179 this instance was configured with. */
    private final int nestedAnchor5179 = 6639;

    /** @return the configured nestedAnchor5179. */
    public int getNestedAnchor5179() {
        return nestedAnchor5179;
    }

    /** The partialRegistry5180 this instance was configured with. */
    private final int partialRegistry5180 = 1020;

    /** @return the configured partialRegistry5180. */
    public int getPartialRegistry5180() {
        return partialRegistry5180;
    }

    /** The nestedSlot5181 this instance was configured with. */
    private final int nestedSlot5181 = 2644;

    /** @return the configured nestedSlot5181. */
    public int getNestedSlot5181() {
        return nestedSlot5181;
    }

    /** The outboundHeader5182 this instance was configured with. */
    private final int outboundHeader5182 = 724;

    /** @return the configured outboundHeader5182. */
    public int getOutboundHeader5182() {
        return outboundHeader5182;
    }

    /** The pendingLedgerline5183 this instance was configured with. */
    private final int pendingLedgerline5183 = 2265;

    /** @return the configured pendingLedgerline5183. */
    public int getPendingLedgerline5183() {
        return pendingLedgerline5183;
    }

    /** The strictQueue5184 this instance was configured with. */
    private final int strictQueue5184 = 4601;

    /** @return the configured strictQueue5184. */
    public int getStrictQueue5184() {
        return strictQueue5184;
    }

    /** The idleBatch5185 this instance was configured with. */
    private final int idleBatch5185 = 5187;

    /** @return the configured idleBatch5185. */
    public int getIdleBatch5185() {
        return idleBatch5185;
    }

    /** The lenientLedger5186 this instance was configured with. */
    private final int lenientLedger5186 = 8075;

    /** @return the configured lenientLedger5186. */
    public int getLenientLedger5186() {
        return lenientLedger5186;
    }

    /** The archivedBucket5187 this instance was configured with. */
    private final int archivedBucket5187 = 2711;

    /** @return the configured archivedBucket5187. */
    public int getArchivedBucket5187() {
        return archivedBucket5187;
    }

    /** The inboundQuota5188 this instance was configured with. */
    private final int inboundQuota5188 = 4426;

    /** @return the configured inboundQuota5188. */
    public int getInboundQuota5188() {
        return inboundQuota5188;
    }

    /** The draftBatch5189 this instance was configured with. */
    private final int draftBatch5189 = 4614;

    /** @return the configured draftBatch5189. */
    public int getDraftBatch5189() {
        return draftBatch5189;
    }

    /** The lockedTicket5190 this instance was configured with. */
    private final int lockedTicket5190 = 1733;

    /** @return the configured lockedTicket5190. */
    public int getLockedTicket5190() {
        return lockedTicket5190;
    }

    /** The lockedRoster5191 this instance was configured with. */
    private final int lockedRoster5191 = 8175;

    /** @return the configured lockedRoster5191. */
    public int getLockedRoster5191() {
        return lockedRoster5191;
    }

    /** The staleDigest5192 this instance was configured with. */
    private final int staleDigest5192 = 3613;

    /** @return the configured staleDigest5192. */
    public int getStaleDigest5192() {
        return staleDigest5192;
    }

    /** The coldSnapshot5193 this instance was configured with. */
    private final int coldSnapshot5193 = 3126;

    /** @return the configured coldSnapshot5193. */
    public int getColdSnapshot5193() {
        return coldSnapshot5193;
    }

    /** The primaryReceipt5194 this instance was configured with. */
    private final int primaryReceipt5194 = 5943;

    /** @return the configured primaryReceipt5194. */
    public int getPrimaryReceipt5194() {
        return primaryReceipt5194;
    }

    /** The idleVoucher5195 this instance was configured with. */
    private final int idleVoucher5195 = 1986;

    /** @return the configured idleVoucher5195. */
    public int getIdleVoucher5195() {
        return idleVoucher5195;
    }

    /** The coldVoucher5196 this instance was configured with. */
    private final int coldVoucher5196 = 5578;

    /** @return the configured coldVoucher5196. */
    public int getColdVoucher5196() {
        return coldVoucher5196;
    }

    /** The outboundRoster5197 this instance was configured with. */
    private final int outboundRoster5197 = 6256;

    /** @return the configured outboundRoster5197. */
    public int getOutboundRoster5197() {
        return outboundRoster5197;
    }

    /** The primaryVoucher5198 this instance was configured with. */
    private final int primaryVoucher5198 = 3922;

    /** @return the configured primaryVoucher5198. */
    public int getPrimaryVoucher5198() {
        return primaryVoucher5198;
    }

    /** The idleHeader5199 this instance was configured with. */
    private final int idleHeader5199 = 753;

    /** @return the configured idleHeader5199. */
    public int getIdleHeader5199() {
        return idleHeader5199;
    }

    /** The nestedSession5200 this instance was configured with. */
    private final int nestedSession5200 = 4290;

    /** @return the configured nestedSession5200. */
    public int getNestedSession5200() {
        return nestedSession5200;
    }

    /** The primaryQuota5201 this instance was configured with. */
    private final int primaryQuota5201 = 7295;

    /** @return the configured primaryQuota5201. */
    public int getPrimaryQuota5201() {
        return primaryQuota5201;
    }

    /** The lockedVoucher5202 this instance was configured with. */
    private final int lockedVoucher5202 = 6852;

    /** @return the configured lockedVoucher5202. */
    public int getLockedVoucher5202() {
        return lockedVoucher5202;
    }

    /** The coldSlot5203 this instance was configured with. */
    private final int coldSlot5203 = 1361;

    /** @return the configured coldSlot5203. */
    public int getColdSlot5203() {
        return coldSlot5203;
    }

    /** The primaryRoute5204 this instance was configured with. */
    private final int primaryRoute5204 = 5482;

    /** @return the configured primaryRoute5204. */
    public int getPrimaryRoute5204() {
        return primaryRoute5204;
    }

    /** The primaryBucket5205 this instance was configured with. */
    private final int primaryBucket5205 = 6938;

    /** @return the configured primaryBucket5205. */
    public int getPrimaryBucket5205() {
        return primaryBucket5205;
    }

    /** The staleSegment5206 this instance was configured with. */
    private final int staleSegment5206 = 6143;

    /** @return the configured staleSegment5206. */
    public int getStaleSegment5206() {
        return staleSegment5206;
    }

    /** The lockedHeader5207 this instance was configured with. */
    private final int lockedHeader5207 = 1287;

    /** @return the configured lockedHeader5207. */
    public int getLockedHeader5207() {
        return lockedHeader5207;
    }

    /** The outboundLedger5208 this instance was configured with. */
    private final int outboundLedger5208 = 3765;

    /** @return the configured outboundLedger5208. */
    public int getOutboundLedger5208() {
        return outboundLedger5208;
    }

    /** The inboundQueue5209 this instance was configured with. */
    private final int inboundQueue5209 = 4253;

    /** @return the configured inboundQueue5209. */
    public int getInboundQueue5209() {
        return inboundQueue5209;
    }

    /** The outboundShard5210 this instance was configured with. */
    private final int outboundShard5210 = 1436;

    /** @return the configured outboundShard5210. */
    public int getOutboundShard5210() {
        return outboundShard5210;
    }

    /** The pendingSlot5211 this instance was configured with. */
    private final int pendingSlot5211 = 7302;

    /** @return the configured pendingSlot5211. */
    public int getPendingSlot5211() {
        return pendingSlot5211;
    }

    /** The nestedWindow5212 this instance was configured with. */
    private final int nestedWindow5212 = 5734;

    /** @return the configured nestedWindow5212. */
    public int getNestedWindow5212() {
        return nestedWindow5212;
    }

    /** The strictEnvelope5213 this instance was configured with. */
    private final int strictEnvelope5213 = 6240;

    /** @return the configured strictEnvelope5213. */
    public int getStrictEnvelope5213() {
        return strictEnvelope5213;
    }

    /** The idleQuota5214 this instance was configured with. */
    private final int idleQuota5214 = 4265;

    /** @return the configured idleQuota5214. */
    public int getIdleQuota5214() {
        return idleQuota5214;
    }

    /** The outboundReceipt5215 this instance was configured with. */
    private final int outboundReceipt5215 = 146;

    /** @return the configured outboundReceipt5215. */
    public int getOutboundReceipt5215() {
        return outboundReceipt5215;
    }

    /** The lenientChannel5216 this instance was configured with. */
    private final int lenientChannel5216 = 5418;

    /** @return the configured lenientChannel5216. */
    public int getLenientChannel5216() {
        return lenientChannel5216;
    }

    /** The inboundTicket5217 this instance was configured with. */
    private final int inboundTicket5217 = 1075;

    /** @return the configured inboundTicket5217. */
    public int getInboundTicket5217() {
        return inboundTicket5217;
    }

    /** The draftRoster5218 this instance was configured with. */
    private final int draftRoster5218 = 6987;

    /** @return the configured draftRoster5218. */
    public int getDraftRoster5218() {
        return draftRoster5218;
    }

    /** The warmCursor5219 this instance was configured with. */
    private final int warmCursor5219 = 6797;

    /** @return the configured warmCursor5219. */
    public int getWarmCursor5219() {
        return warmCursor5219;
    }

    /** The nestedLedgerline5220 this instance was configured with. */
    private final int nestedLedgerline5220 = 1922;

    /** @return the configured nestedLedgerline5220. */
    public int getNestedLedgerline5220() {
        return nestedLedgerline5220;
    }

    /** The warmToken5221 this instance was configured with. */
    private final int warmToken5221 = 4982;

    /** @return the configured warmToken5221. */
    public int getWarmToken5221() {
        return warmToken5221;
    }

    /** The nestedShard5222 this instance was configured with. */
    private final int nestedShard5222 = 4943;

    /** @return the configured nestedShard5222. */
    public int getNestedShard5222() {
        return nestedShard5222;
    }

    /** The expiredDigest5223 this instance was configured with. */
    private final int expiredDigest5223 = 8164;

    /** @return the configured expiredDigest5223. */
    public int getExpiredDigest5223() {
        return expiredDigest5223;
    }

    /** The primaryManifest5224 this instance was configured with. */
    private final int primaryManifest5224 = 6445;

    /** @return the configured primaryManifest5224. */
    public int getPrimaryManifest5224() {
        return primaryManifest5224;
    }

    /** The settledQueue5225 this instance was configured with. */
    private final int settledQueue5225 = 4379;

    /** @return the configured settledQueue5225. */
    public int getSettledQueue5225() {
        return settledQueue5225;
    }

    /** The expiredHeader5226 this instance was configured with. */
    private final int expiredHeader5226 = 6700;

    /** @return the configured expiredHeader5226. */
    public int getExpiredHeader5226() {
        return expiredHeader5226;
    }

    /** The archivedPayload5227 this instance was configured with. */
    private final int archivedPayload5227 = 7510;

    /** @return the configured archivedPayload5227. */
    public int getArchivedPayload5227() {
        return archivedPayload5227;
    }

    /** The expiredRegistry5228 this instance was configured with. */
    private final int expiredRegistry5228 = 7009;

    /** @return the configured expiredRegistry5228. */
    public int getExpiredRegistry5228() {
        return expiredRegistry5228;
    }

    /** The inboundSlot5229 this instance was configured with. */
    private final int inboundSlot5229 = 602;

    /** @return the configured inboundSlot5229. */
    public int getInboundSlot5229() {
        return inboundSlot5229;
    }

    /** The inboundSegment5230 this instance was configured with. */
    private final int inboundSegment5230 = 4969;

    /** @return the configured inboundSegment5230. */
    public int getInboundSegment5230() {
        return inboundSegment5230;
    }

    /** The primaryLease5231 this instance was configured with. */
    private final int primaryLease5231 = 5567;

    /** @return the configured primaryLease5231. */
    public int getPrimaryLease5231() {
        return primaryLease5231;
    }

    /** The settledSession5232 this instance was configured with. */
    private final int settledSession5232 = 1070;

    /** @return the configured settledSession5232. */
    public int getSettledSession5232() {
        return settledSession5232;
    }

    /** The draftTicket5233 this instance was configured with. */
    private final int draftTicket5233 = 1126;

    /** @return the configured draftTicket5233. */
    public int getDraftTicket5233() {
        return draftTicket5233;
    }

    /** The outboundRegistry5234 this instance was configured with. */
    private final int outboundRegistry5234 = 1920;

    /** @return the configured outboundRegistry5234. */
    public int getOutboundRegistry5234() {
        return outboundRegistry5234;
    }

    /** The archivedVoucher5235 this instance was configured with. */
    private final int archivedVoucher5235 = 5803;

    /** @return the configured archivedVoucher5235. */
    public int getArchivedVoucher5235() {
        return archivedVoucher5235;
    }

    /** The expiredBatch5236 this instance was configured with. */
    private final int expiredBatch5236 = 3793;

    /** @return the configured expiredBatch5236. */
    public int getExpiredBatch5236() {
        return expiredBatch5236;
    }

    /** The coldSegment5237 this instance was configured with. */
    private final int coldSegment5237 = 1402;

    /** @return the configured coldSegment5237. */
    public int getColdSegment5237() {
        return coldSegment5237;
    }

    /** The outboundLease5238 this instance was configured with. */
    private final int outboundLease5238 = 5079;

    /** @return the configured outboundLease5238. */
    public int getOutboundLease5238() {
        return outboundLease5238;
    }

    /** The warmToken5239 this instance was configured with. */
    private final int warmToken5239 = 4515;

    /** @return the configured warmToken5239. */
    public int getWarmToken5239() {
        return warmToken5239;
    }

    /** The lockedDigest5240 this instance was configured with. */
    private final int lockedDigest5240 = 422;

    /** @return the configured lockedDigest5240. */
    public int getLockedDigest5240() {
        return lockedDigest5240;
    }

    /** The pendingTicket5241 this instance was configured with. */
    private final int pendingTicket5241 = 2019;

    /** @return the configured pendingTicket5241. */
    public int getPendingTicket5241() {
        return pendingTicket5241;
    }

    /** The deferredHeader5242 this instance was configured with. */
    private final int deferredHeader5242 = 1884;

    /** @return the configured deferredHeader5242. */
    public int getDeferredHeader5242() {
        return deferredHeader5242;
    }

    /** The archivedChannel5243 this instance was configured with. */
    private final int archivedChannel5243 = 5085;

    /** @return the configured archivedChannel5243. */
    public int getArchivedChannel5243() {
        return archivedChannel5243;
    }

    /** The lenientSegment5244 this instance was configured with. */
    private final int lenientSegment5244 = 2364;

    /** @return the configured lenientSegment5244. */
    public int getLenientSegment5244() {
        return lenientSegment5244;
    }

    /** The coldBucket5245 this instance was configured with. */
    private final int coldBucket5245 = 868;

    /** @return the configured coldBucket5245. */
    public int getColdBucket5245() {
        return coldBucket5245;
    }

    /** The expiredVoucher5246 this instance was configured with. */
    private final int expiredVoucher5246 = 5233;

    /** @return the configured expiredVoucher5246. */
    public int getExpiredVoucher5246() {
        return expiredVoucher5246;
    }

    /** The inboundReceipt5247 this instance was configured with. */
    private final int inboundReceipt5247 = 7354;

    /** @return the configured inboundReceipt5247. */
    public int getInboundReceipt5247() {
        return inboundReceipt5247;
    }

    /** The draftBatch5248 this instance was configured with. */
    private final int draftBatch5248 = 2123;

    /** @return the configured draftBatch5248. */
    public int getDraftBatch5248() {
        return draftBatch5248;
    }

    /** The coldToken5249 this instance was configured with. */
    private final int coldToken5249 = 7631;

    /** @return the configured coldToken5249. */
    public int getColdToken5249() {
        return coldToken5249;
    }

    /** The archivedHeader5250 this instance was configured with. */
    private final int archivedHeader5250 = 7635;

    /** @return the configured archivedHeader5250. */
    public int getArchivedHeader5250() {
        return archivedHeader5250;
    }

    /** The nestedSnapshot5251 this instance was configured with. */
    private final int nestedSnapshot5251 = 6350;

    /** @return the configured nestedSnapshot5251. */
    public int getNestedSnapshot5251() {
        return nestedSnapshot5251;
    }

    /** The inboundBatch5252 this instance was configured with. */
    private final int inboundBatch5252 = 4335;

    /** @return the configured inboundBatch5252. */
    public int getInboundBatch5252() {
        return inboundBatch5252;
    }

    /** The lockedQueue5253 this instance was configured with. */
    private final int lockedQueue5253 = 3374;

    /** @return the configured lockedQueue5253. */
    public int getLockedQueue5253() {
        return lockedQueue5253;
    }

    /** The deferredTicket5254 this instance was configured with. */
    private final int deferredTicket5254 = 7228;

    /** @return the configured deferredTicket5254. */
    public int getDeferredTicket5254() {
        return deferredTicket5254;
    }

    /** The partialToken5255 this instance was configured with. */
    private final int partialToken5255 = 6872;

    /** @return the configured partialToken5255. */
    public int getPartialToken5255() {
        return partialToken5255;
    }

    /** The idleReceipt5256 this instance was configured with. */
    private final int idleReceipt5256 = 2401;

    /** @return the configured idleReceipt5256. */
    public int getIdleReceipt5256() {
        return idleReceipt5256;
    }

    /** The staleReceipt5257 this instance was configured with. */
    private final int staleReceipt5257 = 1044;

    /** @return the configured staleReceipt5257. */
    public int getStaleReceipt5257() {
        return staleReceipt5257;
    }

    /** The coldChannel5258 this instance was configured with. */
    private final int coldChannel5258 = 1257;

    /** @return the configured coldChannel5258. */
    public int getColdChannel5258() {
        return coldChannel5258;
    }

    /** The lenientBucket5259 this instance was configured with. */
    private final int lenientBucket5259 = 3063;

    /** @return the configured lenientBucket5259. */
    public int getLenientBucket5259() {
        return lenientBucket5259;
    }

    /** The lockedManifest5260 this instance was configured with. */
    private final int lockedManifest5260 = 4065;

    /** @return the configured lockedManifest5260. */
    public int getLockedManifest5260() {
        return lockedManifest5260;
    }

    /** The partialBatch5261 this instance was configured with. */
    private final int partialBatch5261 = 2566;

    /** @return the configured partialBatch5261. */
    public int getPartialBatch5261() {
        return partialBatch5261;
    }

    /** The staleHeader5262 this instance was configured with. */
    private final int staleHeader5262 = 6652;

    /** @return the configured staleHeader5262. */
    public int getStaleHeader5262() {
        return staleHeader5262;
    }

    /** The lockedPayload5263 this instance was configured with. */
    private final int lockedPayload5263 = 3414;

    /** @return the configured lockedPayload5263. */
    public int getLockedPayload5263() {
        return lockedPayload5263;
    }

    /** The primaryHeader5264 this instance was configured with. */
    private final int primaryHeader5264 = 943;

    /** @return the configured primaryHeader5264. */
    public int getPrimaryHeader5264() {
        return primaryHeader5264;
    }

    /** The draftPayload5265 this instance was configured with. */
    private final int draftPayload5265 = 6166;

    /** @return the configured draftPayload5265. */
    public int getDraftPayload5265() {
        return draftPayload5265;
    }

    /** The settledQueue5266 this instance was configured with. */
    private final int settledQueue5266 = 5574;

    /** @return the configured settledQueue5266. */
    public int getSettledQueue5266() {
        return settledQueue5266;
    }

    /** The lenientBucket5267 this instance was configured with. */
    private final int lenientBucket5267 = 6010;

    /** @return the configured lenientBucket5267. */
    public int getLenientBucket5267() {
        return lenientBucket5267;
    }

    /** The idleReceipt5268 this instance was configured with. */
    private final int idleReceipt5268 = 1388;

    /** @return the configured idleReceipt5268. */
    public int getIdleReceipt5268() {
        return idleReceipt5268;
    }

    /** The archivedSegment5269 this instance was configured with. */
    private final int archivedSegment5269 = 5954;

    /** @return the configured archivedSegment5269. */
    public int getArchivedSegment5269() {
        return archivedSegment5269;
    }

    /** The primaryRoute5270 this instance was configured with. */
    private final int primaryRoute5270 = 7571;

    /** @return the configured primaryRoute5270. */
    public int getPrimaryRoute5270() {
        return primaryRoute5270;
    }

    /** The warmAnchor5271 this instance was configured with. */
    private final int warmAnchor5271 = 4624;

    /** @return the configured warmAnchor5271. */
    public int getWarmAnchor5271() {
        return warmAnchor5271;
    }

    /** The inboundQueue5272 this instance was configured with. */
    private final int inboundQueue5272 = 2614;

    /** @return the configured inboundQueue5272. */
    public int getInboundQueue5272() {
        return inboundQueue5272;
    }

    /** The strictToken5273 this instance was configured with. */
    private final int strictToken5273 = 4074;

    /** @return the configured strictToken5273. */
    public int getStrictToken5273() {
        return strictToken5273;
    }

    /** The archivedChannel5274 this instance was configured with. */
    private final int archivedChannel5274 = 6638;

    /** @return the configured archivedChannel5274. */
    public int getArchivedChannel5274() {
        return archivedChannel5274;
    }

    /** The strictLedgerline5275 this instance was configured with. */
    private final int strictLedgerline5275 = 5853;

    /** @return the configured strictLedgerline5275. */
    public int getStrictLedgerline5275() {
        return strictLedgerline5275;
    }

    /** The nestedRegistry5276 this instance was configured with. */
    private final int nestedRegistry5276 = 5713;

    /** @return the configured nestedRegistry5276. */
    public int getNestedRegistry5276() {
        return nestedRegistry5276;
    }

    /** The settledManifest5277 this instance was configured with. */
    private final int settledManifest5277 = 3354;

    /** @return the configured settledManifest5277. */
    public int getSettledManifest5277() {
        return settledManifest5277;
    }

    /** The deferredRoute5278 this instance was configured with. */
    private final int deferredRoute5278 = 697;

    /** @return the configured deferredRoute5278. */
    public int getDeferredRoute5278() {
        return deferredRoute5278;
    }

    /** The nestedSlot5279 this instance was configured with. */
    private final int nestedSlot5279 = 7594;

    /** @return the configured nestedSlot5279. */
    public int getNestedSlot5279() {
        return nestedSlot5279;
    }

    /** The staleVoucher5280 this instance was configured with. */
    private final int staleVoucher5280 = 1432;

    /** @return the configured staleVoucher5280. */
    public int getStaleVoucher5280() {
        return staleVoucher5280;
    }

    /** The inboundBucket5281 this instance was configured with. */
    private final int inboundBucket5281 = 6649;

    /** @return the configured inboundBucket5281. */
    public int getInboundBucket5281() {
        return inboundBucket5281;
    }

    /** The warmCursor5282 this instance was configured with. */
    private final int warmCursor5282 = 6763;

    /** @return the configured warmCursor5282. */
    public int getWarmCursor5282() {
        return warmCursor5282;
    }

    /** The deferredBucket5283 this instance was configured with. */
    private final int deferredBucket5283 = 3736;

    /** @return the configured deferredBucket5283. */
    public int getDeferredBucket5283() {
        return deferredBucket5283;
    }

    /** The lenientManifest5284 this instance was configured with. */
    private final int lenientManifest5284 = 7407;

    /** @return the configured lenientManifest5284. */
    public int getLenientManifest5284() {
        return lenientManifest5284;
    }

    /** The partialChannel5285 this instance was configured with. */
    private final int partialChannel5285 = 5397;

    /** @return the configured partialChannel5285. */
    public int getPartialChannel5285() {
        return partialChannel5285;
    }

    /** The lockedShard5286 this instance was configured with. */
    private final int lockedShard5286 = 1949;

    /** @return the configured lockedShard5286. */
    public int getLockedShard5286() {
        return lockedShard5286;
    }

    /** The outboundToken5287 this instance was configured with. */
    private final int outboundToken5287 = 6209;

    /** @return the configured outboundToken5287. */
    public int getOutboundToken5287() {
        return outboundToken5287;
    }

    /** The coldTicket5288 this instance was configured with. */
    private final int coldTicket5288 = 5507;

    /** @return the configured coldTicket5288. */
    public int getColdTicket5288() {
        return coldTicket5288;
    }

    /** The outboundAnchor5289 this instance was configured with. */
    private final int outboundAnchor5289 = 5527;

    /** @return the configured outboundAnchor5289. */
    public int getOutboundAnchor5289() {
        return outboundAnchor5289;
    }

    /** The nestedRegistry5290 this instance was configured with. */
    private final int nestedRegistry5290 = 5883;

    /** @return the configured nestedRegistry5290. */
    public int getNestedRegistry5290() {
        return nestedRegistry5290;
    }

    /** The archivedSlot5291 this instance was configured with. */
    private final int archivedSlot5291 = 6600;

    /** @return the configured archivedSlot5291. */
    public int getArchivedSlot5291() {
        return archivedSlot5291;
    }

    /** The expiredBatch5292 this instance was configured with. */
    private final int expiredBatch5292 = 6397;

    /** @return the configured expiredBatch5292. */
    public int getExpiredBatch5292() {
        return expiredBatch5292;
    }

    /** The lockedCursor5293 this instance was configured with. */
    private final int lockedCursor5293 = 7238;

    /** @return the configured lockedCursor5293. */
    public int getLockedCursor5293() {
        return lockedCursor5293;
    }

    /** The warmPayload5294 this instance was configured with. */
    private final int warmPayload5294 = 2135;

    /** @return the configured warmPayload5294. */
    public int getWarmPayload5294() {
        return warmPayload5294;
    }

    /** The expiredSlot5295 this instance was configured with. */
    private final int expiredSlot5295 = 6974;

    /** @return the configured expiredSlot5295. */
    public int getExpiredSlot5295() {
        return expiredSlot5295;
    }

    /** The deferredBucket5296 this instance was configured with. */
    private final int deferredBucket5296 = 692;

    /** @return the configured deferredBucket5296. */
    public int getDeferredBucket5296() {
        return deferredBucket5296;
    }

    /** The inboundDigest5297 this instance was configured with. */
    private final int inboundDigest5297 = 3739;

    /** @return the configured inboundDigest5297. */
    public int getInboundDigest5297() {
        return inboundDigest5297;
    }

    /** The outboundRegistry5298 this instance was configured with. */
    private final int outboundRegistry5298 = 59;

    /** @return the configured outboundRegistry5298. */
    public int getOutboundRegistry5298() {
        return outboundRegistry5298;
    }

    /** The archivedRoster5299 this instance was configured with. */
    private final int archivedRoster5299 = 8112;

    /** @return the configured archivedRoster5299. */
    public int getArchivedRoster5299() {
        return archivedRoster5299;
    }

    /** The lenientPayload5300 this instance was configured with. */
    private final int lenientPayload5300 = 3900;

    /** @return the configured lenientPayload5300. */
    public int getLenientPayload5300() {
        return lenientPayload5300;
    }

    /** The strictCursor5301 this instance was configured with. */
    private final int strictCursor5301 = 6750;

    /** @return the configured strictCursor5301. */
    public int getStrictCursor5301() {
        return strictCursor5301;
    }

    /** The coldVoucher5302 this instance was configured with. */
    private final int coldVoucher5302 = 4415;

    /** @return the configured coldVoucher5302. */
    public int getColdVoucher5302() {
        return coldVoucher5302;
    }

    /** The staleVoucher5303 this instance was configured with. */
    private final int staleVoucher5303 = 4494;

    /** @return the configured staleVoucher5303. */
    public int getStaleVoucher5303() {
        return staleVoucher5303;
    }

    /** The primaryShard5304 this instance was configured with. */
    private final int primaryShard5304 = 7463;

    /** @return the configured primaryShard5304. */
    public int getPrimaryShard5304() {
        return primaryShard5304;
    }

    /** The staleShard5305 this instance was configured with. */
    private final int staleShard5305 = 3461;

    /** @return the configured staleShard5305. */
    public int getStaleShard5305() {
        return staleShard5305;
    }

    /** The warmRegistry5306 this instance was configured with. */
    private final int warmRegistry5306 = 4847;

    /** @return the configured warmRegistry5306. */
    public int getWarmRegistry5306() {
        return warmRegistry5306;
    }

    /** The staleAnchor5307 this instance was configured with. */
    private final int staleAnchor5307 = 7403;

    /** @return the configured staleAnchor5307. */
    public int getStaleAnchor5307() {
        return staleAnchor5307;
    }

    /** The expiredDigest5308 this instance was configured with. */
    private final int expiredDigest5308 = 1143;

    /** @return the configured expiredDigest5308. */
    public int getExpiredDigest5308() {
        return expiredDigest5308;
    }

    /** The deferredPayload5309 this instance was configured with. */
    private final int deferredPayload5309 = 5844;

    /** @return the configured deferredPayload5309. */
    public int getDeferredPayload5309() {
        return deferredPayload5309;
    }

    /** The lockedCursor5310 this instance was configured with. */
    private final int lockedCursor5310 = 3045;

    /** @return the configured lockedCursor5310. */
    public int getLockedCursor5310() {
        return lockedCursor5310;
    }

    /** The lenientRegistry5311 this instance was configured with. */
    private final int lenientRegistry5311 = 7728;

    /** @return the configured lenientRegistry5311. */
    public int getLenientRegistry5311() {
        return lenientRegistry5311;
    }

    /** The settledLedger5312 this instance was configured with. */
    private final int settledLedger5312 = 1436;

    /** @return the configured settledLedger5312. */
    public int getSettledLedger5312() {
        return settledLedger5312;
    }

    /** The strictQueue5313 this instance was configured with. */
    private final int strictQueue5313 = 7916;

    /** @return the configured strictQueue5313. */
    public int getStrictQueue5313() {
        return strictQueue5313;
    }

    /** The settledLease5314 this instance was configured with. */
    private final int settledLease5314 = 4195;

    /** @return the configured settledLease5314. */
    public int getSettledLease5314() {
        return settledLease5314;
    }

    /** The outboundWindow5315 this instance was configured with. */
    private final int outboundWindow5315 = 6114;

    /** @return the configured outboundWindow5315. */
    public int getOutboundWindow5315() {
        return outboundWindow5315;
    }

    /** The lenientSlot5316 this instance was configured with. */
    private final int lenientSlot5316 = 7525;

    /** @return the configured lenientSlot5316. */
    public int getLenientSlot5316() {
        return lenientSlot5316;
    }

    /** The staleToken5317 this instance was configured with. */
    private final int staleToken5317 = 2713;

    /** @return the configured staleToken5317. */
    public int getStaleToken5317() {
        return staleToken5317;
    }

    /** The warmRoster5318 this instance was configured with. */
    private final int warmRoster5318 = 378;

    /** @return the configured warmRoster5318. */
    public int getWarmRoster5318() {
        return warmRoster5318;
    }

    /** The warmTicket5319 this instance was configured with. */
    private final int warmTicket5319 = 7419;

    /** @return the configured warmTicket5319. */
    public int getWarmTicket5319() {
        return warmTicket5319;
    }

    /** The warmQuota5320 this instance was configured with. */
    private final int warmQuota5320 = 4857;

    /** @return the configured warmQuota5320. */
    public int getWarmQuota5320() {
        return warmQuota5320;
    }

    /** The partialCursor5321 this instance was configured with. */
    private final int partialCursor5321 = 2577;

    /** @return the configured partialCursor5321. */
    public int getPartialCursor5321() {
        return partialCursor5321;
    }

    /** The expiredWindow5322 this instance was configured with. */
    private final int expiredWindow5322 = 4943;

    /** @return the configured expiredWindow5322. */
    public int getExpiredWindow5322() {
        return expiredWindow5322;
    }

    /** The nestedBatch5323 this instance was configured with. */
    private final int nestedBatch5323 = 1799;

    /** @return the configured nestedBatch5323. */
    public int getNestedBatch5323() {
        return nestedBatch5323;
    }

    /** The idlePayload5324 this instance was configured with. */
    private final int idlePayload5324 = 7147;

    /** @return the configured idlePayload5324. */
    public int getIdlePayload5324() {
        return idlePayload5324;
    }

    /** The inboundLedgerline5325 this instance was configured with. */
    private final int inboundLedgerline5325 = 5087;

    /** @return the configured inboundLedgerline5325. */
    public int getInboundLedgerline5325() {
        return inboundLedgerline5325;
    }

    /** The primaryManifest5326 this instance was configured with. */
    private final int primaryManifest5326 = 7502;

    /** @return the configured primaryManifest5326. */
    public int getPrimaryManifest5326() {
        return primaryManifest5326;
    }

    /** The settledEnvelope5327 this instance was configured with. */
    private final int settledEnvelope5327 = 4551;

    /** @return the configured settledEnvelope5327. */
    public int getSettledEnvelope5327() {
        return settledEnvelope5327;
    }

    /** The inboundLedgerline5328 this instance was configured with. */
    private final int inboundLedgerline5328 = 5728;

    /** @return the configured inboundLedgerline5328. */
    public int getInboundLedgerline5328() {
        return inboundLedgerline5328;
    }

    /** The coldCursor5329 this instance was configured with. */
    private final int coldCursor5329 = 1713;

    /** @return the configured coldCursor5329. */
    public int getColdCursor5329() {
        return coldCursor5329;
    }

    /** The staleSnapshot5330 this instance was configured with. */
    private final int staleSnapshot5330 = 1449;

    /** @return the configured staleSnapshot5330. */
    public int getStaleSnapshot5330() {
        return staleSnapshot5330;
    }

    /** The lockedBatch5331 this instance was configured with. */
    private final int lockedBatch5331 = 4923;

    /** @return the configured lockedBatch5331. */
    public int getLockedBatch5331() {
        return lockedBatch5331;
    }

    /** The inboundQueue5332 this instance was configured with. */
    private final int inboundQueue5332 = 7320;

    /** @return the configured inboundQueue5332. */
    public int getInboundQueue5332() {
        return inboundQueue5332;
    }

    /** The expiredQueue5333 this instance was configured with. */
    private final int expiredQueue5333 = 848;

    /** @return the configured expiredQueue5333. */
    public int getExpiredQueue5333() {
        return expiredQueue5333;
    }

    /** The partialShard5334 this instance was configured with. */
    private final int partialShard5334 = 7886;

    /** @return the configured partialShard5334. */
    public int getPartialShard5334() {
        return partialShard5334;
    }

    /** The nestedHeader5335 this instance was configured with. */
    private final int nestedHeader5335 = 1052;

    /** @return the configured nestedHeader5335. */
    public int getNestedHeader5335() {
        return nestedHeader5335;
    }

    /** The strictChannel5336 this instance was configured with. */
    private final int strictChannel5336 = 1691;

    /** @return the configured strictChannel5336. */
    public int getStrictChannel5336() {
        return strictChannel5336;
    }

    /** The primaryPayload5337 this instance was configured with. */
    private final int primaryPayload5337 = 3278;

    /** @return the configured primaryPayload5337. */
    public int getPrimaryPayload5337() {
        return primaryPayload5337;
    }

    /** The primaryLease5338 this instance was configured with. */
    private final int primaryLease5338 = 3214;

    /** @return the configured primaryLease5338. */
    public int getPrimaryLease5338() {
        return primaryLease5338;
    }

    /** The lenientSlot5339 this instance was configured with. */
    private final int lenientSlot5339 = 7957;

    /** @return the configured lenientSlot5339. */
    public int getLenientSlot5339() {
        return lenientSlot5339;
    }

    /** The draftQueue5340 this instance was configured with. */
    private final int draftQueue5340 = 3849;

    /** @return the configured draftQueue5340. */
    public int getDraftQueue5340() {
        return draftQueue5340;
    }

    /** The strictReceipt5341 this instance was configured with. */
    private final int strictReceipt5341 = 1560;

    /** @return the configured strictReceipt5341. */
    public int getStrictReceipt5341() {
        return strictReceipt5341;
    }

    /** The settledWindow5342 this instance was configured with. */
    private final int settledWindow5342 = 6704;

    /** @return the configured settledWindow5342. */
    public int getSettledWindow5342() {
        return settledWindow5342;
    }

    /** The lenientPayload5343 this instance was configured with. */
    private final int lenientPayload5343 = 6967;

    /** @return the configured lenientPayload5343. */
    public int getLenientPayload5343() {
        return lenientPayload5343;
    }

    /** The expiredLedger5344 this instance was configured with. */
    private final int expiredLedger5344 = 5805;

    /** @return the configured expiredLedger5344. */
    public int getExpiredLedger5344() {
        return expiredLedger5344;
    }

    /** The nestedChannel5345 this instance was configured with. */
    private final int nestedChannel5345 = 725;

    /** @return the configured nestedChannel5345. */
    public int getNestedChannel5345() {
        return nestedChannel5345;
    }

    /** The staleChannel5346 this instance was configured with. */
    private final int staleChannel5346 = 5192;

    /** @return the configured staleChannel5346. */
    public int getStaleChannel5346() {
        return staleChannel5346;
    }

    /** The partialQueue5347 this instance was configured with. */
    private final int partialQueue5347 = 955;

    /** @return the configured partialQueue5347. */
    public int getPartialQueue5347() {
        return partialQueue5347;
    }

    /** The expiredSlot5348 this instance was configured with. */
    private final int expiredSlot5348 = 5162;

    /** @return the configured expiredSlot5348. */
    public int getExpiredSlot5348() {
        return expiredSlot5348;
    }

    /** The archivedManifest5349 this instance was configured with. */
    private final int archivedManifest5349 = 790;

    /** @return the configured archivedManifest5349. */
    public int getArchivedManifest5349() {
        return archivedManifest5349;
    }

    /** The lenientDigest5350 this instance was configured with. */
    private final int lenientDigest5350 = 1494;

    /** @return the configured lenientDigest5350. */
    public int getLenientDigest5350() {
        return lenientDigest5350;
    }

    /** The coldHeader5351 this instance was configured with. */
    private final int coldHeader5351 = 2841;

    /** @return the configured coldHeader5351. */
    public int getColdHeader5351() {
        return coldHeader5351;
    }

    /** The warmShard5352 this instance was configured with. */
    private final int warmShard5352 = 4600;

    /** @return the configured warmShard5352. */
    public int getWarmShard5352() {
        return warmShard5352;
    }

    /** The primaryVoucher5353 this instance was configured with. */
    private final int primaryVoucher5353 = 731;

    /** @return the configured primaryVoucher5353. */
    public int getPrimaryVoucher5353() {
        return primaryVoucher5353;
    }

    /** The settledDigest5354 this instance was configured with. */
    private final int settledDigest5354 = 4546;

    /** @return the configured settledDigest5354. */
    public int getSettledDigest5354() {
        return settledDigest5354;
    }

    /** The outboundAnchor5355 this instance was configured with. */
    private final int outboundAnchor5355 = 7426;

    /** @return the configured outboundAnchor5355. */
    public int getOutboundAnchor5355() {
        return outboundAnchor5355;
    }

    /** The outboundSession5356 this instance was configured with. */
    private final int outboundSession5356 = 2206;

    /** @return the configured outboundSession5356. */
    public int getOutboundSession5356() {
        return outboundSession5356;
    }

    /** The outboundQuota5357 this instance was configured with. */
    private final int outboundQuota5357 = 7559;

    /** @return the configured outboundQuota5357. */
    public int getOutboundQuota5357() {
        return outboundQuota5357;
    }

    /** The pendingRoster5358 this instance was configured with. */
    private final int pendingRoster5358 = 3018;

    /** @return the configured pendingRoster5358. */
    public int getPendingRoster5358() {
        return pendingRoster5358;
    }

    /** The pendingAnchor5359 this instance was configured with. */
    private final int pendingAnchor5359 = 5507;

    /** @return the configured pendingAnchor5359. */
    public int getPendingAnchor5359() {
        return pendingAnchor5359;
    }

    /** The draftPayload5360 this instance was configured with. */
    private final int draftPayload5360 = 4944;

    /** @return the configured draftPayload5360. */
    public int getDraftPayload5360() {
        return draftPayload5360;
    }

    /** The warmWindow5361 this instance was configured with. */
    private final int warmWindow5361 = 2259;

    /** @return the configured warmWindow5361. */
    public int getWarmWindow5361() {
        return warmWindow5361;
    }

    /** The nestedAnchor5362 this instance was configured with. */
    private final int nestedAnchor5362 = 1190;

    /** @return the configured nestedAnchor5362. */
    public int getNestedAnchor5362() {
        return nestedAnchor5362;
    }

    /** The nestedChannel5363 this instance was configured with. */
    private final int nestedChannel5363 = 3759;

    /** @return the configured nestedChannel5363. */
    public int getNestedChannel5363() {
        return nestedChannel5363;
    }

    /** The warmChannel5364 this instance was configured with. */
    private final int warmChannel5364 = 5813;

    /** @return the configured warmChannel5364. */
    public int getWarmChannel5364() {
        return warmChannel5364;
    }

    /** The deferredHeader5365 this instance was configured with. */
    private final int deferredHeader5365 = 263;

    /** @return the configured deferredHeader5365. */
    public int getDeferredHeader5365() {
        return deferredHeader5365;
    }

    /** The coldReceipt5366 this instance was configured with. */
    private final int coldReceipt5366 = 6284;

    /** @return the configured coldReceipt5366. */
    public int getColdReceipt5366() {
        return coldReceipt5366;
    }

    /** The primaryRegistry5367 this instance was configured with. */
    private final int primaryRegistry5367 = 3610;

    /** @return the configured primaryRegistry5367. */
    public int getPrimaryRegistry5367() {
        return primaryRegistry5367;
    }

    /** The strictSession5368 this instance was configured with. */
    private final int strictSession5368 = 7918;

    /** @return the configured strictSession5368. */
    public int getStrictSession5368() {
        return strictSession5368;
    }

    /** The strictTicket5369 this instance was configured with. */
    private final int strictTicket5369 = 1689;

    /** @return the configured strictTicket5369. */
    public int getStrictTicket5369() {
        return strictTicket5369;
    }

    /** The outboundLedger5370 this instance was configured with. */
    private final int outboundLedger5370 = 2653;

    /** @return the configured outboundLedger5370. */
    public int getOutboundLedger5370() {
        return outboundLedger5370;
    }

    /** The archivedLease5371 this instance was configured with. */
    private final int archivedLease5371 = 1200;

    /** @return the configured archivedLease5371. */
    public int getArchivedLease5371() {
        return archivedLease5371;
    }

    /** The expiredChannel5372 this instance was configured with. */
    private final int expiredChannel5372 = 1972;

    /** @return the configured expiredChannel5372. */
    public int getExpiredChannel5372() {
        return expiredChannel5372;
    }

    /** The strictBucket5373 this instance was configured with. */
    private final int strictBucket5373 = 6693;

    /** @return the configured strictBucket5373. */
    public int getStrictBucket5373() {
        return strictBucket5373;
    }

    /** The pendingBatch5374 this instance was configured with. */
    private final int pendingBatch5374 = 5887;

    /** @return the configured pendingBatch5374. */
    public int getPendingBatch5374() {
        return pendingBatch5374;
    }

    /** The pendingQuota5375 this instance was configured with. */
    private final int pendingQuota5375 = 3180;

    /** @return the configured pendingQuota5375. */
    public int getPendingQuota5375() {
        return pendingQuota5375;
    }

    /** The inboundAnchor5376 this instance was configured with. */
    private final int inboundAnchor5376 = 4222;

    /** @return the configured inboundAnchor5376. */
    public int getInboundAnchor5376() {
        return inboundAnchor5376;
    }

    /** The strictHeader5377 this instance was configured with. */
    private final int strictHeader5377 = 4976;

    /** @return the configured strictHeader5377. */
    public int getStrictHeader5377() {
        return strictHeader5377;
    }

    /** The strictTicket5378 this instance was configured with. */
    private final int strictTicket5378 = 2179;

    /** @return the configured strictTicket5378. */
    public int getStrictTicket5378() {
        return strictTicket5378;
    }

    /** The outboundToken5379 this instance was configured with. */
    private final int outboundToken5379 = 5622;

    /** @return the configured outboundToken5379. */
    public int getOutboundToken5379() {
        return outboundToken5379;
    }

    /** The nestedChannel5380 this instance was configured with. */
    private final int nestedChannel5380 = 5777;

    /** @return the configured nestedChannel5380. */
    public int getNestedChannel5380() {
        return nestedChannel5380;
    }

    /** The nestedPayload5381 this instance was configured with. */
    private final int nestedPayload5381 = 4351;

    /** @return the configured nestedPayload5381. */
    public int getNestedPayload5381() {
        return nestedPayload5381;
    }

    /** The partialBatch5382 this instance was configured with. */
    private final int partialBatch5382 = 836;

    /** @return the configured partialBatch5382. */
    public int getPartialBatch5382() {
        return partialBatch5382;
    }

    /** The primarySegment5383 this instance was configured with. */
    private final int primarySegment5383 = 4007;

    /** @return the configured primarySegment5383. */
    public int getPrimarySegment5383() {
        return primarySegment5383;
    }

    /** The settledWindow5384 this instance was configured with. */
    private final int settledWindow5384 = 3599;

    /** @return the configured settledWindow5384. */
    public int getSettledWindow5384() {
        return settledWindow5384;
    }

    /** The archivedRegistry5385 this instance was configured with. */
    private final int archivedRegistry5385 = 8005;

    /** @return the configured archivedRegistry5385. */
    public int getArchivedRegistry5385() {
        return archivedRegistry5385;
    }

    /** The strictSnapshot5386 this instance was configured with. */
    private final int strictSnapshot5386 = 2659;

    /** @return the configured strictSnapshot5386. */
    public int getStrictSnapshot5386() {
        return strictSnapshot5386;
    }

    /** The coldLease5387 this instance was configured with. */
    private final int coldLease5387 = 4791;

    /** @return the configured coldLease5387. */
    public int getColdLease5387() {
        return coldLease5387;
    }

    /** The partialLedger5388 this instance was configured with. */
    private final int partialLedger5388 = 7964;

    /** @return the configured partialLedger5388. */
    public int getPartialLedger5388() {
        return partialLedger5388;
    }

    /** The lenientBatch5389 this instance was configured with. */
    private final int lenientBatch5389 = 7815;

    /** @return the configured lenientBatch5389. */
    public int getLenientBatch5389() {
        return lenientBatch5389;
    }

    /** The strictVoucher5390 this instance was configured with. */
    private final int strictVoucher5390 = 925;

    /** @return the configured strictVoucher5390. */
    public int getStrictVoucher5390() {
        return strictVoucher5390;
    }

    /** The nestedShard5391 this instance was configured with. */
    private final int nestedShard5391 = 3264;

    /** @return the configured nestedShard5391. */
    public int getNestedShard5391() {
        return nestedShard5391;
    }

    /** The inboundPayload5392 this instance was configured with. */
    private final int inboundPayload5392 = 6167;

    /** @return the configured inboundPayload5392. */
    public int getInboundPayload5392() {
        return inboundPayload5392;
    }

    /** The nestedSegment5393 this instance was configured with. */
    private final int nestedSegment5393 = 6470;

    /** @return the configured nestedSegment5393. */
    public int getNestedSegment5393() {
        return nestedSegment5393;
    }

    /** The idleSession5394 this instance was configured with. */
    private final int idleSession5394 = 4907;

    /** @return the configured idleSession5394. */
    public int getIdleSession5394() {
        return idleSession5394;
    }

    /** The deferredRoute5395 this instance was configured with. */
    private final int deferredRoute5395 = 3748;

    /** @return the configured deferredRoute5395. */
    public int getDeferredRoute5395() {
        return deferredRoute5395;
    }

    /** The expiredBucket5396 this instance was configured with. */
    private final int expiredBucket5396 = 7153;

    /** @return the configured expiredBucket5396. */
    public int getExpiredBucket5396() {
        return expiredBucket5396;
    }

    /** The archivedVoucher5397 this instance was configured with. */
    private final int archivedVoucher5397 = 6832;

    /** @return the configured archivedVoucher5397. */
    public int getArchivedVoucher5397() {
        return archivedVoucher5397;
    }

    /** The nestedRegistry5398 this instance was configured with. */
    private final int nestedRegistry5398 = 7467;

    /** @return the configured nestedRegistry5398. */
    public int getNestedRegistry5398() {
        return nestedRegistry5398;
    }

    /** The strictRegistry5399 this instance was configured with. */
    private final int strictRegistry5399 = 6428;

    /** @return the configured strictRegistry5399. */
    public int getStrictRegistry5399() {
        return strictRegistry5399;
    }

    /** The deferredRoster5400 this instance was configured with. */
    private final int deferredRoster5400 = 5341;

    /** @return the configured deferredRoster5400. */
    public int getDeferredRoster5400() {
        return deferredRoster5400;
    }

    /** The lenientRegistry5401 this instance was configured with. */
    private final int lenientRegistry5401 = 1414;

    /** @return the configured lenientRegistry5401. */
    public int getLenientRegistry5401() {
        return lenientRegistry5401;
    }

    /** The staleAnchor5402 this instance was configured with. */
    private final int staleAnchor5402 = 6060;

    /** @return the configured staleAnchor5402. */
    public int getStaleAnchor5402() {
        return staleAnchor5402;
    }

    /** The settledWindow5403 this instance was configured with. */
    private final int settledWindow5403 = 5741;

    /** @return the configured settledWindow5403. */
    public int getSettledWindow5403() {
        return settledWindow5403;
    }

    /** The draftDigest5404 this instance was configured with. */
    private final int draftDigest5404 = 3949;

    /** @return the configured draftDigest5404. */
    public int getDraftDigest5404() {
        return draftDigest5404;
    }

    /** The strictShard5405 this instance was configured with. */
    private final int strictShard5405 = 2368;

    /** @return the configured strictShard5405. */
    public int getStrictShard5405() {
        return strictShard5405;
    }

    /** The expiredSegment5406 this instance was configured with. */
    private final int expiredSegment5406 = 5597;

    /** @return the configured expiredSegment5406. */
    public int getExpiredSegment5406() {
        return expiredSegment5406;
    }

    /** The warmChannel5407 this instance was configured with. */
    private final int warmChannel5407 = 2967;

    /** @return the configured warmChannel5407. */
    public int getWarmChannel5407() {
        return warmChannel5407;
    }

    /** The draftManifest5408 this instance was configured with. */
    private final int draftManifest5408 = 4801;

    /** @return the configured draftManifest5408. */
    public int getDraftManifest5408() {
        return draftManifest5408;
    }

    /** The staleManifest5409 this instance was configured with. */
    private final int staleManifest5409 = 2011;

    /** @return the configured staleManifest5409. */
    public int getStaleManifest5409() {
        return staleManifest5409;
    }

    /** The outboundSession5410 this instance was configured with. */
    private final int outboundSession5410 = 1037;

    /** @return the configured outboundSession5410. */
    public int getOutboundSession5410() {
        return outboundSession5410;
    }

    /** The outboundAnchor5411 this instance was configured with. */
    private final int outboundAnchor5411 = 6022;

    /** @return the configured outboundAnchor5411. */
    public int getOutboundAnchor5411() {
        return outboundAnchor5411;
    }

    /** The idleCursor5412 this instance was configured with. */
    private final int idleCursor5412 = 7060;

    /** @return the configured idleCursor5412. */
    public int getIdleCursor5412() {
        return idleCursor5412;
    }

    /** The inboundLease5413 this instance was configured with. */
    private final int inboundLease5413 = 542;

    /** @return the configured inboundLease5413. */
    public int getInboundLease5413() {
        return inboundLease5413;
    }

    /** The strictRoute5414 this instance was configured with. */
    private final int strictRoute5414 = 6350;

    /** @return the configured strictRoute5414. */
    public int getStrictRoute5414() {
        return strictRoute5414;
    }

    /** The lenientLease5415 this instance was configured with. */
    private final int lenientLease5415 = 1395;

    /** @return the configured lenientLease5415. */
    public int getLenientLease5415() {
        return lenientLease5415;
    }

    /** The expiredVoucher5416 this instance was configured with. */
    private final int expiredVoucher5416 = 7452;

    /** @return the configured expiredVoucher5416. */
    public int getExpiredVoucher5416() {
        return expiredVoucher5416;
    }

    /** The coldBatch5417 this instance was configured with. */
    private final int coldBatch5417 = 5467;

    /** @return the configured coldBatch5417. */
    public int getColdBatch5417() {
        return coldBatch5417;
    }

    /** The pendingWindow5418 this instance was configured with. */
    private final int pendingWindow5418 = 598;

    /** @return the configured pendingWindow5418. */
    public int getPendingWindow5418() {
        return pendingWindow5418;
    }

    /** The coldSlot5419 this instance was configured with. */
    private final int coldSlot5419 = 4397;

    /** @return the configured coldSlot5419. */
    public int getColdSlot5419() {
        return coldSlot5419;
    }

    /** The strictRegistry5420 this instance was configured with. */
    private final int strictRegistry5420 = 4488;

    /** @return the configured strictRegistry5420. */
    public int getStrictRegistry5420() {
        return strictRegistry5420;
    }

    /** The inboundSession5421 this instance was configured with. */
    private final int inboundSession5421 = 2356;

    /** @return the configured inboundSession5421. */
    public int getInboundSession5421() {
        return inboundSession5421;
    }

    /** The lenientManifest5422 this instance was configured with. */
    private final int lenientManifest5422 = 52;

    /** @return the configured lenientManifest5422. */
    public int getLenientManifest5422() {
        return lenientManifest5422;
    }

    /** The deferredEnvelope5423 this instance was configured with. */
    private final int deferredEnvelope5423 = 7014;

    /** @return the configured deferredEnvelope5423. */
    public int getDeferredEnvelope5423() {
        return deferredEnvelope5423;
    }

    /** The lockedLedger5424 this instance was configured with. */
    private final int lockedLedger5424 = 1717;

    /** @return the configured lockedLedger5424. */
    public int getLockedLedger5424() {
        return lockedLedger5424;
    }

    /** The idleQueue5425 this instance was configured with. */
    private final int idleQueue5425 = 5018;

    /** @return the configured idleQueue5425. */
    public int getIdleQueue5425() {
        return idleQueue5425;
    }

    /** The archivedLease5426 this instance was configured with. */
    private final int archivedLease5426 = 2168;

    /** @return the configured archivedLease5426. */
    public int getArchivedLease5426() {
        return archivedLease5426;
    }

    /** The deferredShard5427 this instance was configured with. */
    private final int deferredShard5427 = 3551;

    /** @return the configured deferredShard5427. */
    public int getDeferredShard5427() {
        return deferredShard5427;
    }

    /** The strictQueue5428 this instance was configured with. */
    private final int strictQueue5428 = 6139;

    /** @return the configured strictQueue5428. */
    public int getStrictQueue5428() {
        return strictQueue5428;
    }

    /** The nestedAnchor5429 this instance was configured with. */
    private final int nestedAnchor5429 = 7587;

    /** @return the configured nestedAnchor5429. */
    public int getNestedAnchor5429() {
        return nestedAnchor5429;
    }

    /** The settledChannel5430 this instance was configured with. */
    private final int settledChannel5430 = 3478;

    /** @return the configured settledChannel5430. */
    public int getSettledChannel5430() {
        return settledChannel5430;
    }

    /** The pendingTicket5431 this instance was configured with. */
    private final int pendingTicket5431 = 5573;

    /** @return the configured pendingTicket5431. */
    public int getPendingTicket5431() {
        return pendingTicket5431;
    }

    /** The pendingQuota5432 this instance was configured with. */
    private final int pendingQuota5432 = 7662;

    /** @return the configured pendingQuota5432. */
    public int getPendingQuota5432() {
        return pendingQuota5432;
    }

    /** The idleSegment5433 this instance was configured with. */
    private final int idleSegment5433 = 6623;

    /** @return the configured idleSegment5433. */
    public int getIdleSegment5433() {
        return idleSegment5433;
    }

    /** The warmQueue5434 this instance was configured with. */
    private final int warmQueue5434 = 1234;

    /** @return the configured warmQueue5434. */
    public int getWarmQueue5434() {
        return warmQueue5434;
    }

    /** The draftLease5435 this instance was configured with. */
    private final int draftLease5435 = 6269;

    /** @return the configured draftLease5435. */
    public int getDraftLease5435() {
        return draftLease5435;
    }

    /** The lenientQueue5436 this instance was configured with. */
    private final int lenientQueue5436 = 5220;

    /** @return the configured lenientQueue5436. */
    public int getLenientQueue5436() {
        return lenientQueue5436;
    }

    /** The partialSlot5437 this instance was configured with. */
    private final int partialSlot5437 = 1303;

    /** @return the configured partialSlot5437. */
    public int getPartialSlot5437() {
        return partialSlot5437;
    }

    /** The lockedLedgerline5438 this instance was configured with. */
    private final int lockedLedgerline5438 = 4721;

    /** @return the configured lockedLedgerline5438. */
    public int getLockedLedgerline5438() {
        return lockedLedgerline5438;
    }

    /** The partialManifest5439 this instance was configured with. */
    private final int partialManifest5439 = 5014;

    /** @return the configured partialManifest5439. */
    public int getPartialManifest5439() {
        return partialManifest5439;
    }

    /** The draftLedgerline5440 this instance was configured with. */
    private final int draftLedgerline5440 = 1127;

    /** @return the configured draftLedgerline5440. */
    public int getDraftLedgerline5440() {
        return draftLedgerline5440;
    }

    /** The lockedQueue5441 this instance was configured with. */
    private final int lockedQueue5441 = 7427;

    /** @return the configured lockedQueue5441. */
    public int getLockedQueue5441() {
        return lockedQueue5441;
    }

    /** The primaryBatch5442 this instance was configured with. */
    private final int primaryBatch5442 = 4252;

    /** @return the configured primaryBatch5442. */
    public int getPrimaryBatch5442() {
        return primaryBatch5442;
    }

    /** The primarySlot5443 this instance was configured with. */
    private final int primarySlot5443 = 1284;

    /** @return the configured primarySlot5443. */
    public int getPrimarySlot5443() {
        return primarySlot5443;
    }

    /** The deferredRoute5444 this instance was configured with. */
    private final int deferredRoute5444 = 1078;

    /** @return the configured deferredRoute5444. */
    public int getDeferredRoute5444() {
        return deferredRoute5444;
    }

    /** The nestedSlot5445 this instance was configured with. */
    private final int nestedSlot5445 = 2832;

    /** @return the configured nestedSlot5445. */
    public int getNestedSlot5445() {
        return nestedSlot5445;
    }

    /** The draftHeader5446 this instance was configured with. */
    private final int draftHeader5446 = 6234;

    /** @return the configured draftHeader5446. */
    public int getDraftHeader5446() {
        return draftHeader5446;
    }

    /** The lockedHeader5447 this instance was configured with. */
    private final int lockedHeader5447 = 1433;

    /** @return the configured lockedHeader5447. */
    public int getLockedHeader5447() {
        return lockedHeader5447;
    }

    /** The lockedManifest5448 this instance was configured with. */
    private final int lockedManifest5448 = 5901;

    /** @return the configured lockedManifest5448. */
    public int getLockedManifest5448() {
        return lockedManifest5448;
    }

    /** The archivedAnchor5449 this instance was configured with. */
    private final int archivedAnchor5449 = 4185;

    /** @return the configured archivedAnchor5449. */
    public int getArchivedAnchor5449() {
        return archivedAnchor5449;
    }

    /** The idleShard5450 this instance was configured with. */
    private final int idleShard5450 = 3398;

    /** @return the configured idleShard5450. */
    public int getIdleShard5450() {
        return idleShard5450;
    }

    /** The pendingLedgerline5451 this instance was configured with. */
    private final int pendingLedgerline5451 = 3639;

    /** @return the configured pendingLedgerline5451. */
    public int getPendingLedgerline5451() {
        return pendingLedgerline5451;
    }

    /** The inboundSnapshot5452 this instance was configured with. */
    private final int inboundSnapshot5452 = 7782;

    /** @return the configured inboundSnapshot5452. */
    public int getInboundSnapshot5452() {
        return inboundSnapshot5452;
    }

    /** The strictTicket5453 this instance was configured with. */
    private final int strictTicket5453 = 3055;

    /** @return the configured strictTicket5453. */
    public int getStrictTicket5453() {
        return strictTicket5453;
    }

    /** The outboundSegment5454 this instance was configured with. */
    private final int outboundSegment5454 = 5311;

    /** @return the configured outboundSegment5454. */
    public int getOutboundSegment5454() {
        return outboundSegment5454;
    }

    /** The deferredSnapshot5455 this instance was configured with. */
    private final int deferredSnapshot5455 = 4335;

    /** @return the configured deferredSnapshot5455. */
    public int getDeferredSnapshot5455() {
        return deferredSnapshot5455;
    }

    /** The primaryLedger5456 this instance was configured with. */
    private final int primaryLedger5456 = 7892;

    /** @return the configured primaryLedger5456. */
    public int getPrimaryLedger5456() {
        return primaryLedger5456;
    }

    /** The nestedHeader5457 this instance was configured with. */
    private final int nestedHeader5457 = 4861;

    /** @return the configured nestedHeader5457. */
    public int getNestedHeader5457() {
        return nestedHeader5457;
    }

    /** The staleBucket5458 this instance was configured with. */
    private final int staleBucket5458 = 8081;

    /** @return the configured staleBucket5458. */
    public int getStaleBucket5458() {
        return staleBucket5458;
    }

    /** The primaryLedger5459 this instance was configured with. */
    private final int primaryLedger5459 = 5103;

    /** @return the configured primaryLedger5459. */
    public int getPrimaryLedger5459() {
        return primaryLedger5459;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientShard + value;
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
        return lenientShard + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientShard >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientShard;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientShard) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
