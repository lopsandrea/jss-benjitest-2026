package com.example.p31;

/**
 * warmManifest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class031 {

    private int strictLedger = 1;

    private final java.util.Map<String, Integer> staleLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleLedgerline0 table. */
    public int archivedSnapshot0(String key) {
        Integer hit = staleLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long idleCursor1 = 0L;

    /** Folds {@code delta} into the running idleCursor1. */
    public long archivedSegment1(long delta) {
        if (delta == 0L) {
            return idleCursor1;
        }
        idleCursor1 += delta < 0 ? -delta : delta;
        return idleCursor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientBucket2(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 134 ? "primary" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the lockedReceipt stage. */
    public boolean deferredBucket3(String text) {
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

    private final java.util.Map<String, Integer> staleVoucher4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleVoucher4 table. */
    public int partialQuota4(String key) {
        Integer hit = staleVoucher4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long nestedToken5 = 0L;

    /** Folds {@code delta} into the running nestedToken5. */
    public long nestedToken5(long delta) {
        if (delta == 0L) {
            return nestedToken5;
        }
        nestedToken5 += delta < 0 ? -delta : delta;
        return nestedToken5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredRegistry6(int n) {
        switch (n / 6) {
            case 0:
                return "locked";
            case 1:
                return "pending";
            default:
                return n > 398 ? "locked" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the pendingSlot stage. */
    public boolean expiredRegistry7(String text) {
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

    private final java.util.Map<String, Integer> nestedQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedQuota8 table. */
    public int staleAnchor8(String key) {
        Integer hit = nestedQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long staleSession9 = 0L;

    /** Folds {@code delta} into the running staleSession9. */
    public long draftLedger9(long delta) {
        if (delta == 0L) {
            return staleSession9;
        }
        staleSession9 += delta < 0 ? -delta : delta;
        return staleSession9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredBucket10(int n) {
        switch (n / 10) {
            case 0:
                return "primary";
            case 1:
                return "inbound";
            default:
                return n > 62 ? "idle" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the primaryReceipt stage. */
    public boolean warmTicket11(String text) {
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

    private final java.util.Map<String, Integer> warmShard12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmShard12 table. */
    public int coldRegistry12(String key) {
        Integer hit = warmShard12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 38 ? hit : 0;
    }

    private long nestedSession13 = 0L;

    /** Folds {@code delta} into the running nestedSession13. */
    public long warmSegment13(long delta) {
        if (delta == 0L) {
            return nestedSession13;
        }
        nestedSession13 += delta < 0 ? -delta : delta;
        return nestedSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredQuota14(int n) {
        switch (n / 8) {
            case 0:
                return "warm";
            case 1:
                return "warm";
            default:
                return n > 377 ? "partial" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the warmSnapshot stage. */
    public boolean primaryToken15(String text) {
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

    /** The expiredCursor5000 this instance was configured with. */
    private final int expiredCursor5000 = 5188;

    /** @return the configured expiredCursor5000. */
    public int getExpiredCursor5000() {
        return expiredCursor5000;
    }

    /** The draftEnvelope5001 this instance was configured with. */
    private final int draftEnvelope5001 = 1759;

    /** @return the configured draftEnvelope5001. */
    public int getDraftEnvelope5001() {
        return draftEnvelope5001;
    }

    /** The draftShard5002 this instance was configured with. */
    private final int draftShard5002 = 6428;

    /** @return the configured draftShard5002. */
    public int getDraftShard5002() {
        return draftShard5002;
    }

    /** The archivedVoucher5003 this instance was configured with. */
    private final int archivedVoucher5003 = 6717;

    /** @return the configured archivedVoucher5003. */
    public int getArchivedVoucher5003() {
        return archivedVoucher5003;
    }

    /** The draftPayload5004 this instance was configured with. */
    private final int draftPayload5004 = 4050;

    /** @return the configured draftPayload5004. */
    public int getDraftPayload5004() {
        return draftPayload5004;
    }

    /** The strictBucket5005 this instance was configured with. */
    private final int strictBucket5005 = 548;

    /** @return the configured strictBucket5005. */
    public int getStrictBucket5005() {
        return strictBucket5005;
    }

    /** The outboundEnvelope5006 this instance was configured with. */
    private final int outboundEnvelope5006 = 5330;

    /** @return the configured outboundEnvelope5006. */
    public int getOutboundEnvelope5006() {
        return outboundEnvelope5006;
    }

    /** The primaryBucket5007 this instance was configured with. */
    private final int primaryBucket5007 = 8022;

    /** @return the configured primaryBucket5007. */
    public int getPrimaryBucket5007() {
        return primaryBucket5007;
    }

    /** The archivedManifest5008 this instance was configured with. */
    private final int archivedManifest5008 = 6980;

    /** @return the configured archivedManifest5008. */
    public int getArchivedManifest5008() {
        return archivedManifest5008;
    }

    /** The strictSegment5009 this instance was configured with. */
    private final int strictSegment5009 = 5027;

    /** @return the configured strictSegment5009. */
    public int getStrictSegment5009() {
        return strictSegment5009;
    }

    /** The outboundCursor5010 this instance was configured with. */
    private final int outboundCursor5010 = 93;

    /** @return the configured outboundCursor5010. */
    public int getOutboundCursor5010() {
        return outboundCursor5010;
    }

    /** The outboundLease5011 this instance was configured with. */
    private final int outboundLease5011 = 7228;

    /** @return the configured outboundLease5011. */
    public int getOutboundLease5011() {
        return outboundLease5011;
    }

    /** The lenientCursor5012 this instance was configured with. */
    private final int lenientCursor5012 = 5566;

    /** @return the configured lenientCursor5012. */
    public int getLenientCursor5012() {
        return lenientCursor5012;
    }

    /** The staleEnvelope5013 this instance was configured with. */
    private final int staleEnvelope5013 = 5785;

    /** @return the configured staleEnvelope5013. */
    public int getStaleEnvelope5013() {
        return staleEnvelope5013;
    }

    /** The settledShard5014 this instance was configured with. */
    private final int settledShard5014 = 386;

    /** @return the configured settledShard5014. */
    public int getSettledShard5014() {
        return settledShard5014;
    }

    /** The deferredQuota5015 this instance was configured with. */
    private final int deferredQuota5015 = 3269;

    /** @return the configured deferredQuota5015. */
    public int getDeferredQuota5015() {
        return deferredQuota5015;
    }

    /** The lenientRegistry5016 this instance was configured with. */
    private final int lenientRegistry5016 = 7696;

    /** @return the configured lenientRegistry5016. */
    public int getLenientRegistry5016() {
        return lenientRegistry5016;
    }

    /** The nestedBatch5017 this instance was configured with. */
    private final int nestedBatch5017 = 7287;

    /** @return the configured nestedBatch5017. */
    public int getNestedBatch5017() {
        return nestedBatch5017;
    }

    /** The idleSnapshot5018 this instance was configured with. */
    private final int idleSnapshot5018 = 6335;

    /** @return the configured idleSnapshot5018. */
    public int getIdleSnapshot5018() {
        return idleSnapshot5018;
    }

    /** The partialSession5019 this instance was configured with. */
    private final int partialSession5019 = 954;

    /** @return the configured partialSession5019. */
    public int getPartialSession5019() {
        return partialSession5019;
    }

    /** The coldRoster5020 this instance was configured with. */
    private final int coldRoster5020 = 665;

    /** @return the configured coldRoster5020. */
    public int getColdRoster5020() {
        return coldRoster5020;
    }

    /** The coldSnapshot5021 this instance was configured with. */
    private final int coldSnapshot5021 = 6844;

    /** @return the configured coldSnapshot5021. */
    public int getColdSnapshot5021() {
        return coldSnapshot5021;
    }

    /** The lenientReceipt5022 this instance was configured with. */
    private final int lenientReceipt5022 = 6645;

    /** @return the configured lenientReceipt5022. */
    public int getLenientReceipt5022() {
        return lenientReceipt5022;
    }

    /** The lenientReceipt5023 this instance was configured with. */
    private final int lenientReceipt5023 = 4998;

    /** @return the configured lenientReceipt5023. */
    public int getLenientReceipt5023() {
        return lenientReceipt5023;
    }

    /** The coldSnapshot5024 this instance was configured with. */
    private final int coldSnapshot5024 = 3255;

    /** @return the configured coldSnapshot5024. */
    public int getColdSnapshot5024() {
        return coldSnapshot5024;
    }

    /** The outboundLease5025 this instance was configured with. */
    private final int outboundLease5025 = 2164;

    /** @return the configured outboundLease5025. */
    public int getOutboundLease5025() {
        return outboundLease5025;
    }

    /** The partialRoute5026 this instance was configured with. */
    private final int partialRoute5026 = 5612;

    /** @return the configured partialRoute5026. */
    public int getPartialRoute5026() {
        return partialRoute5026;
    }

    /** The lenientSession5027 this instance was configured with. */
    private final int lenientSession5027 = 1422;

    /** @return the configured lenientSession5027. */
    public int getLenientSession5027() {
        return lenientSession5027;
    }

    /** The settledBatch5028 this instance was configured with. */
    private final int settledBatch5028 = 2323;

    /** @return the configured settledBatch5028. */
    public int getSettledBatch5028() {
        return settledBatch5028;
    }

    /** The archivedLedger5029 this instance was configured with. */
    private final int archivedLedger5029 = 1645;

    /** @return the configured archivedLedger5029. */
    public int getArchivedLedger5029() {
        return archivedLedger5029;
    }

    /** The expiredHeader5030 this instance was configured with. */
    private final int expiredHeader5030 = 6085;

    /** @return the configured expiredHeader5030. */
    public int getExpiredHeader5030() {
        return expiredHeader5030;
    }

    /** The strictBucket5031 this instance was configured with. */
    private final int strictBucket5031 = 7998;

    /** @return the configured strictBucket5031. */
    public int getStrictBucket5031() {
        return strictBucket5031;
    }

    /** The partialDigest5032 this instance was configured with. */
    private final int partialDigest5032 = 7913;

    /** @return the configured partialDigest5032. */
    public int getPartialDigest5032() {
        return partialDigest5032;
    }

    /** The lenientLedgerline5033 this instance was configured with. */
    private final int lenientLedgerline5033 = 3372;

    /** @return the configured lenientLedgerline5033. */
    public int getLenientLedgerline5033() {
        return lenientLedgerline5033;
    }

    /** The strictPayload5034 this instance was configured with. */
    private final int strictPayload5034 = 6458;

    /** @return the configured strictPayload5034. */
    public int getStrictPayload5034() {
        return strictPayload5034;
    }

    /** The stalePayload5035 this instance was configured with. */
    private final int stalePayload5035 = 3350;

    /** @return the configured stalePayload5035. */
    public int getStalePayload5035() {
        return stalePayload5035;
    }

    /** The primaryBucket5036 this instance was configured with. */
    private final int primaryBucket5036 = 7971;

    /** @return the configured primaryBucket5036. */
    public int getPrimaryBucket5036() {
        return primaryBucket5036;
    }

    /** The inboundDigest5037 this instance was configured with. */
    private final int inboundDigest5037 = 4405;

    /** @return the configured inboundDigest5037. */
    public int getInboundDigest5037() {
        return inboundDigest5037;
    }

    /** The idlePayload5038 this instance was configured with. */
    private final int idlePayload5038 = 2118;

    /** @return the configured idlePayload5038. */
    public int getIdlePayload5038() {
        return idlePayload5038;
    }

    /** The settledShard5039 this instance was configured with. */
    private final int settledShard5039 = 6131;

    /** @return the configured settledShard5039. */
    public int getSettledShard5039() {
        return settledShard5039;
    }

    /** The settledRoster5040 this instance was configured with. */
    private final int settledRoster5040 = 5630;

    /** @return the configured settledRoster5040. */
    public int getSettledRoster5040() {
        return settledRoster5040;
    }

    /** The archivedQueue5041 this instance was configured with. */
    private final int archivedQueue5041 = 1235;

    /** @return the configured archivedQueue5041. */
    public int getArchivedQueue5041() {
        return archivedQueue5041;
    }

    /** The lockedLease5042 this instance was configured with. */
    private final int lockedLease5042 = 6952;

    /** @return the configured lockedLease5042. */
    public int getLockedLease5042() {
        return lockedLease5042;
    }

    /** The strictBatch5043 this instance was configured with. */
    private final int strictBatch5043 = 1776;

    /** @return the configured strictBatch5043. */
    public int getStrictBatch5043() {
        return strictBatch5043;
    }

    /** The expiredSegment5044 this instance was configured with. */
    private final int expiredSegment5044 = 2775;

    /** @return the configured expiredSegment5044. */
    public int getExpiredSegment5044() {
        return expiredSegment5044;
    }

    /** The inboundSlot5045 this instance was configured with. */
    private final int inboundSlot5045 = 5253;

    /** @return the configured inboundSlot5045. */
    public int getInboundSlot5045() {
        return inboundSlot5045;
    }

    /** The nestedWindow5046 this instance was configured with. */
    private final int nestedWindow5046 = 6311;

    /** @return the configured nestedWindow5046. */
    public int getNestedWindow5046() {
        return nestedWindow5046;
    }

    /** The partialDigest5047 this instance was configured with. */
    private final int partialDigest5047 = 4386;

    /** @return the configured partialDigest5047. */
    public int getPartialDigest5047() {
        return partialDigest5047;
    }

    /** The nestedQuota5048 this instance was configured with. */
    private final int nestedQuota5048 = 6749;

    /** @return the configured nestedQuota5048. */
    public int getNestedQuota5048() {
        return nestedQuota5048;
    }

    /** The expiredLedgerline5049 this instance was configured with. */
    private final int expiredLedgerline5049 = 1919;

    /** @return the configured expiredLedgerline5049. */
    public int getExpiredLedgerline5049() {
        return expiredLedgerline5049;
    }

    /** The nestedRoster5050 this instance was configured with. */
    private final int nestedRoster5050 = 1547;

    /** @return the configured nestedRoster5050. */
    public int getNestedRoster5050() {
        return nestedRoster5050;
    }

    /** The nestedToken5051 this instance was configured with. */
    private final int nestedToken5051 = 2076;

    /** @return the configured nestedToken5051. */
    public int getNestedToken5051() {
        return nestedToken5051;
    }

    /** The strictLease5052 this instance was configured with. */
    private final int strictLease5052 = 2424;

    /** @return the configured strictLease5052. */
    public int getStrictLease5052() {
        return strictLease5052;
    }

    /** The deferredHeader5053 this instance was configured with. */
    private final int deferredHeader5053 = 5105;

    /** @return the configured deferredHeader5053. */
    public int getDeferredHeader5053() {
        return deferredHeader5053;
    }

    /** The lenientSlot5054 this instance was configured with. */
    private final int lenientSlot5054 = 1987;

    /** @return the configured lenientSlot5054. */
    public int getLenientSlot5054() {
        return lenientSlot5054;
    }

    /** The idleSlot5055 this instance was configured with. */
    private final int idleSlot5055 = 1827;

    /** @return the configured idleSlot5055. */
    public int getIdleSlot5055() {
        return idleSlot5055;
    }

    /** The deferredLedgerline5056 this instance was configured with. */
    private final int deferredLedgerline5056 = 5138;

    /** @return the configured deferredLedgerline5056. */
    public int getDeferredLedgerline5056() {
        return deferredLedgerline5056;
    }

    /** The nestedWindow5057 this instance was configured with. */
    private final int nestedWindow5057 = 2355;

    /** @return the configured nestedWindow5057. */
    public int getNestedWindow5057() {
        return nestedWindow5057;
    }

    /** The deferredLedgerline5058 this instance was configured with. */
    private final int deferredLedgerline5058 = 506;

    /** @return the configured deferredLedgerline5058. */
    public int getDeferredLedgerline5058() {
        return deferredLedgerline5058;
    }

    /** The outboundToken5059 this instance was configured with. */
    private final int outboundToken5059 = 1269;

    /** @return the configured outboundToken5059. */
    public int getOutboundToken5059() {
        return outboundToken5059;
    }

    /** The coldEnvelope5060 this instance was configured with. */
    private final int coldEnvelope5060 = 6681;

    /** @return the configured coldEnvelope5060. */
    public int getColdEnvelope5060() {
        return coldEnvelope5060;
    }

    /** The warmQuota5061 this instance was configured with. */
    private final int warmQuota5061 = 4277;

    /** @return the configured warmQuota5061. */
    public int getWarmQuota5061() {
        return warmQuota5061;
    }

    /** The outboundToken5062 this instance was configured with. */
    private final int outboundToken5062 = 586;

    /** @return the configured outboundToken5062. */
    public int getOutboundToken5062() {
        return outboundToken5062;
    }

    /** The pendingRegistry5063 this instance was configured with. */
    private final int pendingRegistry5063 = 5606;

    /** @return the configured pendingRegistry5063. */
    public int getPendingRegistry5063() {
        return pendingRegistry5063;
    }

    /** The nestedSlot5064 this instance was configured with. */
    private final int nestedSlot5064 = 1944;

    /** @return the configured nestedSlot5064. */
    public int getNestedSlot5064() {
        return nestedSlot5064;
    }

    /** The inboundRoute5065 this instance was configured with. */
    private final int inboundRoute5065 = 5964;

    /** @return the configured inboundRoute5065. */
    public int getInboundRoute5065() {
        return inboundRoute5065;
    }

    /** The nestedShard5066 this instance was configured with. */
    private final int nestedShard5066 = 3386;

    /** @return the configured nestedShard5066. */
    public int getNestedShard5066() {
        return nestedShard5066;
    }

    /** The lenientLease5067 this instance was configured with. */
    private final int lenientLease5067 = 352;

    /** @return the configured lenientLease5067. */
    public int getLenientLease5067() {
        return lenientLease5067;
    }

    /** The lenientAnchor5068 this instance was configured with. */
    private final int lenientAnchor5068 = 6160;

    /** @return the configured lenientAnchor5068. */
    public int getLenientAnchor5068() {
        return lenientAnchor5068;
    }

    /** The partialTicket5069 this instance was configured with. */
    private final int partialTicket5069 = 1046;

    /** @return the configured partialTicket5069. */
    public int getPartialTicket5069() {
        return partialTicket5069;
    }

    /** The draftSegment5070 this instance was configured with. */
    private final int draftSegment5070 = 4285;

    /** @return the configured draftSegment5070. */
    public int getDraftSegment5070() {
        return draftSegment5070;
    }

    /** The expiredLease5071 this instance was configured with. */
    private final int expiredLease5071 = 4820;

    /** @return the configured expiredLease5071. */
    public int getExpiredLease5071() {
        return expiredLease5071;
    }

    /** The deferredSession5072 this instance was configured with. */
    private final int deferredSession5072 = 3924;

    /** @return the configured deferredSession5072. */
    public int getDeferredSession5072() {
        return deferredSession5072;
    }

    /** The settledQuota5073 this instance was configured with. */
    private final int settledQuota5073 = 5253;

    /** @return the configured settledQuota5073. */
    public int getSettledQuota5073() {
        return settledQuota5073;
    }

    /** The primaryPayload5074 this instance was configured with. */
    private final int primaryPayload5074 = 4255;

    /** @return the configured primaryPayload5074. */
    public int getPrimaryPayload5074() {
        return primaryPayload5074;
    }

    /** The nestedReceipt5075 this instance was configured with. */
    private final int nestedReceipt5075 = 8105;

    /** @return the configured nestedReceipt5075. */
    public int getNestedReceipt5075() {
        return nestedReceipt5075;
    }

    /** The strictBatch5076 this instance was configured with. */
    private final int strictBatch5076 = 2084;

    /** @return the configured strictBatch5076. */
    public int getStrictBatch5076() {
        return strictBatch5076;
    }

    /** The inboundDigest5077 this instance was configured with. */
    private final int inboundDigest5077 = 6780;

    /** @return the configured inboundDigest5077. */
    public int getInboundDigest5077() {
        return inboundDigest5077;
    }

    /** The expiredSnapshot5078 this instance was configured with. */
    private final int expiredSnapshot5078 = 5148;

    /** @return the configured expiredSnapshot5078. */
    public int getExpiredSnapshot5078() {
        return expiredSnapshot5078;
    }

    /** The staleBatch5079 this instance was configured with. */
    private final int staleBatch5079 = 5839;

    /** @return the configured staleBatch5079. */
    public int getStaleBatch5079() {
        return staleBatch5079;
    }

    /** The idleVoucher5080 this instance was configured with. */
    private final int idleVoucher5080 = 7300;

    /** @return the configured idleVoucher5080. */
    public int getIdleVoucher5080() {
        return idleVoucher5080;
    }

    /** The draftSegment5081 this instance was configured with. */
    private final int draftSegment5081 = 5116;

    /** @return the configured draftSegment5081. */
    public int getDraftSegment5081() {
        return draftSegment5081;
    }

    /** The expiredReceipt5082 this instance was configured with. */
    private final int expiredReceipt5082 = 101;

    /** @return the configured expiredReceipt5082. */
    public int getExpiredReceipt5082() {
        return expiredReceipt5082;
    }

    /** The coldVoucher5083 this instance was configured with. */
    private final int coldVoucher5083 = 3034;

    /** @return the configured coldVoucher5083. */
    public int getColdVoucher5083() {
        return coldVoucher5083;
    }

    /** The partialRoute5084 this instance was configured with. */
    private final int partialRoute5084 = 7476;

    /** @return the configured partialRoute5084. */
    public int getPartialRoute5084() {
        return partialRoute5084;
    }

    /** The expiredCursor5085 this instance was configured with. */
    private final int expiredCursor5085 = 744;

    /** @return the configured expiredCursor5085. */
    public int getExpiredCursor5085() {
        return expiredCursor5085;
    }

    /** The coldChannel5086 this instance was configured with. */
    private final int coldChannel5086 = 4915;

    /** @return the configured coldChannel5086. */
    public int getColdChannel5086() {
        return coldChannel5086;
    }

    /** The draftTicket5087 this instance was configured with. */
    private final int draftTicket5087 = 1983;

    /** @return the configured draftTicket5087. */
    public int getDraftTicket5087() {
        return draftTicket5087;
    }

    /** The coldLease5088 this instance was configured with. */
    private final int coldLease5088 = 2082;

    /** @return the configured coldLease5088. */
    public int getColdLease5088() {
        return coldLease5088;
    }

    /** The staleToken5089 this instance was configured with. */
    private final int staleToken5089 = 3722;

    /** @return the configured staleToken5089. */
    public int getStaleToken5089() {
        return staleToken5089;
    }

    /** The staleSnapshot5090 this instance was configured with. */
    private final int staleSnapshot5090 = 3659;

    /** @return the configured staleSnapshot5090. */
    public int getStaleSnapshot5090() {
        return staleSnapshot5090;
    }

    /** The warmDigest5091 this instance was configured with. */
    private final int warmDigest5091 = 4259;

    /** @return the configured warmDigest5091. */
    public int getWarmDigest5091() {
        return warmDigest5091;
    }

    /** The inboundLedger5092 this instance was configured with. */
    private final int inboundLedger5092 = 7051;

    /** @return the configured inboundLedger5092. */
    public int getInboundLedger5092() {
        return inboundLedger5092;
    }

    /** The inboundAnchor5093 this instance was configured with. */
    private final int inboundAnchor5093 = 6770;

    /** @return the configured inboundAnchor5093. */
    public int getInboundAnchor5093() {
        return inboundAnchor5093;
    }

    /** The pendingHeader5094 this instance was configured with. */
    private final int pendingHeader5094 = 4733;

    /** @return the configured pendingHeader5094. */
    public int getPendingHeader5094() {
        return pendingHeader5094;
    }

    /** The lockedManifest5095 this instance was configured with. */
    private final int lockedManifest5095 = 2598;

    /** @return the configured lockedManifest5095. */
    public int getLockedManifest5095() {
        return lockedManifest5095;
    }

    /** The pendingReceipt5096 this instance was configured with. */
    private final int pendingReceipt5096 = 1276;

    /** @return the configured pendingReceipt5096. */
    public int getPendingReceipt5096() {
        return pendingReceipt5096;
    }

    /** The coldSnapshot5097 this instance was configured with. */
    private final int coldSnapshot5097 = 1530;

    /** @return the configured coldSnapshot5097. */
    public int getColdSnapshot5097() {
        return coldSnapshot5097;
    }

    /** The expiredBatch5098 this instance was configured with. */
    private final int expiredBatch5098 = 1059;

    /** @return the configured expiredBatch5098. */
    public int getExpiredBatch5098() {
        return expiredBatch5098;
    }

    /** The inboundRegistry5099 this instance was configured with. */
    private final int inboundRegistry5099 = 3918;

    /** @return the configured inboundRegistry5099. */
    public int getInboundRegistry5099() {
        return inboundRegistry5099;
    }

    /** The lenientPayload5100 this instance was configured with. */
    private final int lenientPayload5100 = 1027;

    /** @return the configured lenientPayload5100. */
    public int getLenientPayload5100() {
        return lenientPayload5100;
    }

    /** The lockedSlot5101 this instance was configured with. */
    private final int lockedSlot5101 = 5123;

    /** @return the configured lockedSlot5101. */
    public int getLockedSlot5101() {
        return lockedSlot5101;
    }

    /** The draftVoucher5102 this instance was configured with. */
    private final int draftVoucher5102 = 5018;

    /** @return the configured draftVoucher5102. */
    public int getDraftVoucher5102() {
        return draftVoucher5102;
    }

    /** The draftShard5103 this instance was configured with. */
    private final int draftShard5103 = 2927;

    /** @return the configured draftShard5103. */
    public int getDraftShard5103() {
        return draftShard5103;
    }

    /** The settledLedgerline5104 this instance was configured with. */
    private final int settledLedgerline5104 = 6700;

    /** @return the configured settledLedgerline5104. */
    public int getSettledLedgerline5104() {
        return settledLedgerline5104;
    }

    /** The staleCursor5105 this instance was configured with. */
    private final int staleCursor5105 = 1112;

    /** @return the configured staleCursor5105. */
    public int getStaleCursor5105() {
        return staleCursor5105;
    }

    /** The draftQueue5106 this instance was configured with. */
    private final int draftQueue5106 = 1536;

    /** @return the configured draftQueue5106. */
    public int getDraftQueue5106() {
        return draftQueue5106;
    }

    /** The primaryReceipt5107 this instance was configured with. */
    private final int primaryReceipt5107 = 2078;

    /** @return the configured primaryReceipt5107. */
    public int getPrimaryReceipt5107() {
        return primaryReceipt5107;
    }

    /** The settledRegistry5108 this instance was configured with. */
    private final int settledRegistry5108 = 5422;

    /** @return the configured settledRegistry5108. */
    public int getSettledRegistry5108() {
        return settledRegistry5108;
    }

    /** The deferredQuota5109 this instance was configured with. */
    private final int deferredQuota5109 = 2585;

    /** @return the configured deferredQuota5109. */
    public int getDeferredQuota5109() {
        return deferredQuota5109;
    }

    /** The idleLease5110 this instance was configured with. */
    private final int idleLease5110 = 6384;

    /** @return the configured idleLease5110. */
    public int getIdleLease5110() {
        return idleLease5110;
    }

    /** The outboundCursor5111 this instance was configured with. */
    private final int outboundCursor5111 = 5255;

    /** @return the configured outboundCursor5111. */
    public int getOutboundCursor5111() {
        return outboundCursor5111;
    }

    /** The archivedSession5112 this instance was configured with. */
    private final int archivedSession5112 = 5122;

    /** @return the configured archivedSession5112. */
    public int getArchivedSession5112() {
        return archivedSession5112;
    }

    /** The strictEnvelope5113 this instance was configured with. */
    private final int strictEnvelope5113 = 1774;

    /** @return the configured strictEnvelope5113. */
    public int getStrictEnvelope5113() {
        return strictEnvelope5113;
    }

    /** The archivedRoster5114 this instance was configured with. */
    private final int archivedRoster5114 = 4243;

    /** @return the configured archivedRoster5114. */
    public int getArchivedRoster5114() {
        return archivedRoster5114;
    }

    /** The archivedCursor5115 this instance was configured with. */
    private final int archivedCursor5115 = 5074;

    /** @return the configured archivedCursor5115. */
    public int getArchivedCursor5115() {
        return archivedCursor5115;
    }

    /** The settledSlot5116 this instance was configured with. */
    private final int settledSlot5116 = 6708;

    /** @return the configured settledSlot5116. */
    public int getSettledSlot5116() {
        return settledSlot5116;
    }

    /** The outboundBatch5117 this instance was configured with. */
    private final int outboundBatch5117 = 6919;

    /** @return the configured outboundBatch5117. */
    public int getOutboundBatch5117() {
        return outboundBatch5117;
    }

    /** The pendingToken5118 this instance was configured with. */
    private final int pendingToken5118 = 506;

    /** @return the configured pendingToken5118. */
    public int getPendingToken5118() {
        return pendingToken5118;
    }

    /** The outboundQuota5119 this instance was configured with. */
    private final int outboundQuota5119 = 579;

    /** @return the configured outboundQuota5119. */
    public int getOutboundQuota5119() {
        return outboundQuota5119;
    }

    /** The lockedSlot5120 this instance was configured with. */
    private final int lockedSlot5120 = 5901;

    /** @return the configured lockedSlot5120. */
    public int getLockedSlot5120() {
        return lockedSlot5120;
    }

    /** The idleLedgerline5121 this instance was configured with. */
    private final int idleLedgerline5121 = 4189;

    /** @return the configured idleLedgerline5121. */
    public int getIdleLedgerline5121() {
        return idleLedgerline5121;
    }

    /** The nestedRoute5122 this instance was configured with. */
    private final int nestedRoute5122 = 3150;

    /** @return the configured nestedRoute5122. */
    public int getNestedRoute5122() {
        return nestedRoute5122;
    }

    /** The coldRegistry5123 this instance was configured with. */
    private final int coldRegistry5123 = 4179;

    /** @return the configured coldRegistry5123. */
    public int getColdRegistry5123() {
        return coldRegistry5123;
    }

    /** The nestedAnchor5124 this instance was configured with. */
    private final int nestedAnchor5124 = 7447;

    /** @return the configured nestedAnchor5124. */
    public int getNestedAnchor5124() {
        return nestedAnchor5124;
    }

    /** The draftTicket5125 this instance was configured with. */
    private final int draftTicket5125 = 3509;

    /** @return the configured draftTicket5125. */
    public int getDraftTicket5125() {
        return draftTicket5125;
    }

    /** The inboundReceipt5126 this instance was configured with. */
    private final int inboundReceipt5126 = 4303;

    /** @return the configured inboundReceipt5126. */
    public int getInboundReceipt5126() {
        return inboundReceipt5126;
    }

    /** The outboundAnchor5127 this instance was configured with. */
    private final int outboundAnchor5127 = 6015;

    /** @return the configured outboundAnchor5127. */
    public int getOutboundAnchor5127() {
        return outboundAnchor5127;
    }

    /** The staleManifest5128 this instance was configured with. */
    private final int staleManifest5128 = 5052;

    /** @return the configured staleManifest5128. */
    public int getStaleManifest5128() {
        return staleManifest5128;
    }

    /** The strictLedger5129 this instance was configured with. */
    private final int strictLedger5129 = 1148;

    /** @return the configured strictLedger5129. */
    public int getStrictLedger5129() {
        return strictLedger5129;
    }

    /** The settledRoute5130 this instance was configured with. */
    private final int settledRoute5130 = 3240;

    /** @return the configured settledRoute5130. */
    public int getSettledRoute5130() {
        return settledRoute5130;
    }

    /** The lenientManifest5131 this instance was configured with. */
    private final int lenientManifest5131 = 6608;

    /** @return the configured lenientManifest5131. */
    public int getLenientManifest5131() {
        return lenientManifest5131;
    }

    /** The coldLedgerline5132 this instance was configured with. */
    private final int coldLedgerline5132 = 2364;

    /** @return the configured coldLedgerline5132. */
    public int getColdLedgerline5132() {
        return coldLedgerline5132;
    }

    /** The archivedDigest5133 this instance was configured with. */
    private final int archivedDigest5133 = 5129;

    /** @return the configured archivedDigest5133. */
    public int getArchivedDigest5133() {
        return archivedDigest5133;
    }

    /** The lenientShard5134 this instance was configured with. */
    private final int lenientShard5134 = 1686;

    /** @return the configured lenientShard5134. */
    public int getLenientShard5134() {
        return lenientShard5134;
    }

    /** The draftEnvelope5135 this instance was configured with. */
    private final int draftEnvelope5135 = 5338;

    /** @return the configured draftEnvelope5135. */
    public int getDraftEnvelope5135() {
        return draftEnvelope5135;
    }

    /** The settledToken5136 this instance was configured with. */
    private final int settledToken5136 = 3421;

    /** @return the configured settledToken5136. */
    public int getSettledToken5136() {
        return settledToken5136;
    }

    /** The warmCursor5137 this instance was configured with. */
    private final int warmCursor5137 = 1860;

    /** @return the configured warmCursor5137. */
    public int getWarmCursor5137() {
        return warmCursor5137;
    }

    /** The staleShard5138 this instance was configured with. */
    private final int staleShard5138 = 4719;

    /** @return the configured staleShard5138. */
    public int getStaleShard5138() {
        return staleShard5138;
    }

    /** The nestedDigest5139 this instance was configured with. */
    private final int nestedDigest5139 = 1097;

    /** @return the configured nestedDigest5139. */
    public int getNestedDigest5139() {
        return nestedDigest5139;
    }

    /** The coldHeader5140 this instance was configured with. */
    private final int coldHeader5140 = 3035;

    /** @return the configured coldHeader5140. */
    public int getColdHeader5140() {
        return coldHeader5140;
    }

    /** The partialSegment5141 this instance was configured with. */
    private final int partialSegment5141 = 5135;

    /** @return the configured partialSegment5141. */
    public int getPartialSegment5141() {
        return partialSegment5141;
    }

    /** The nestedRoute5142 this instance was configured with. */
    private final int nestedRoute5142 = 3974;

    /** @return the configured nestedRoute5142. */
    public int getNestedRoute5142() {
        return nestedRoute5142;
    }

    /** The primaryRoster5143 this instance was configured with. */
    private final int primaryRoster5143 = 4307;

    /** @return the configured primaryRoster5143. */
    public int getPrimaryRoster5143() {
        return primaryRoster5143;
    }

    /** The nestedSegment5144 this instance was configured with. */
    private final int nestedSegment5144 = 4606;

    /** @return the configured nestedSegment5144. */
    public int getNestedSegment5144() {
        return nestedSegment5144;
    }

    /** The draftAnchor5145 this instance was configured with. */
    private final int draftAnchor5145 = 3039;

    /** @return the configured draftAnchor5145. */
    public int getDraftAnchor5145() {
        return draftAnchor5145;
    }

    /** The settledBucket5146 this instance was configured with. */
    private final int settledBucket5146 = 708;

    /** @return the configured settledBucket5146. */
    public int getSettledBucket5146() {
        return settledBucket5146;
    }

    /** The idlePayload5147 this instance was configured with. */
    private final int idlePayload5147 = 1155;

    /** @return the configured idlePayload5147. */
    public int getIdlePayload5147() {
        return idlePayload5147;
    }

    /** The primaryManifest5148 this instance was configured with. */
    private final int primaryManifest5148 = 270;

    /** @return the configured primaryManifest5148. */
    public int getPrimaryManifest5148() {
        return primaryManifest5148;
    }

    /** The lockedQuota5149 this instance was configured with. */
    private final int lockedQuota5149 = 202;

    /** @return the configured lockedQuota5149. */
    public int getLockedQuota5149() {
        return lockedQuota5149;
    }

    /** The partialDigest5150 this instance was configured with. */
    private final int partialDigest5150 = 7454;

    /** @return the configured partialDigest5150. */
    public int getPartialDigest5150() {
        return partialDigest5150;
    }

    /** The warmPayload5151 this instance was configured with. */
    private final int warmPayload5151 = 7004;

    /** @return the configured warmPayload5151. */
    public int getWarmPayload5151() {
        return warmPayload5151;
    }

    /** The expiredWindow5152 this instance was configured with. */
    private final int expiredWindow5152 = 4465;

    /** @return the configured expiredWindow5152. */
    public int getExpiredWindow5152() {
        return expiredWindow5152;
    }

    /** The lockedSnapshot5153 this instance was configured with. */
    private final int lockedSnapshot5153 = 7526;

    /** @return the configured lockedSnapshot5153. */
    public int getLockedSnapshot5153() {
        return lockedSnapshot5153;
    }

    /** The nestedBatch5154 this instance was configured with. */
    private final int nestedBatch5154 = 7188;

    /** @return the configured nestedBatch5154. */
    public int getNestedBatch5154() {
        return nestedBatch5154;
    }

    /** The deferredSnapshot5155 this instance was configured with. */
    private final int deferredSnapshot5155 = 4033;

    /** @return the configured deferredSnapshot5155. */
    public int getDeferredSnapshot5155() {
        return deferredSnapshot5155;
    }

    /** The partialToken5156 this instance was configured with. */
    private final int partialToken5156 = 4282;

    /** @return the configured partialToken5156. */
    public int getPartialToken5156() {
        return partialToken5156;
    }

    /** The coldCursor5157 this instance was configured with. */
    private final int coldCursor5157 = 5940;

    /** @return the configured coldCursor5157. */
    public int getColdCursor5157() {
        return coldCursor5157;
    }

    /** The expiredSession5158 this instance was configured with. */
    private final int expiredSession5158 = 8158;

    /** @return the configured expiredSession5158. */
    public int getExpiredSession5158() {
        return expiredSession5158;
    }

    /** The idleSnapshot5159 this instance was configured with. */
    private final int idleSnapshot5159 = 2902;

    /** @return the configured idleSnapshot5159. */
    public int getIdleSnapshot5159() {
        return idleSnapshot5159;
    }

    /** The coldQuota5160 this instance was configured with. */
    private final int coldQuota5160 = 1003;

    /** @return the configured coldQuota5160. */
    public int getColdQuota5160() {
        return coldQuota5160;
    }

    /** The outboundRoster5161 this instance was configured with. */
    private final int outboundRoster5161 = 6506;

    /** @return the configured outboundRoster5161. */
    public int getOutboundRoster5161() {
        return outboundRoster5161;
    }

    /** The warmManifest5162 this instance was configured with. */
    private final int warmManifest5162 = 7955;

    /** @return the configured warmManifest5162. */
    public int getWarmManifest5162() {
        return warmManifest5162;
    }

    /** The primarySlot5163 this instance was configured with. */
    private final int primarySlot5163 = 4431;

    /** @return the configured primarySlot5163. */
    public int getPrimarySlot5163() {
        return primarySlot5163;
    }

    /** The settledQuota5164 this instance was configured with. */
    private final int settledQuota5164 = 5218;

    /** @return the configured settledQuota5164. */
    public int getSettledQuota5164() {
        return settledQuota5164;
    }

    /** The settledChannel5165 this instance was configured with. */
    private final int settledChannel5165 = 4679;

    /** @return the configured settledChannel5165. */
    public int getSettledChannel5165() {
        return settledChannel5165;
    }

    /** The idleLedger5166 this instance was configured with. */
    private final int idleLedger5166 = 6001;

    /** @return the configured idleLedger5166. */
    public int getIdleLedger5166() {
        return idleLedger5166;
    }

    /** The primaryHeader5167 this instance was configured with. */
    private final int primaryHeader5167 = 3442;

    /** @return the configured primaryHeader5167. */
    public int getPrimaryHeader5167() {
        return primaryHeader5167;
    }

    /** The lockedRoute5168 this instance was configured with. */
    private final int lockedRoute5168 = 3271;

    /** @return the configured lockedRoute5168. */
    public int getLockedRoute5168() {
        return lockedRoute5168;
    }

    /** The archivedManifest5169 this instance was configured with. */
    private final int archivedManifest5169 = 1115;

    /** @return the configured archivedManifest5169. */
    public int getArchivedManifest5169() {
        return archivedManifest5169;
    }

    /** The lockedToken5170 this instance was configured with. */
    private final int lockedToken5170 = 7488;

    /** @return the configured lockedToken5170. */
    public int getLockedToken5170() {
        return lockedToken5170;
    }

    /** The pendingSession5171 this instance was configured with. */
    private final int pendingSession5171 = 4501;

    /** @return the configured pendingSession5171. */
    public int getPendingSession5171() {
        return pendingSession5171;
    }

    /** The draftVoucher5172 this instance was configured with. */
    private final int draftVoucher5172 = 7933;

    /** @return the configured draftVoucher5172. */
    public int getDraftVoucher5172() {
        return draftVoucher5172;
    }

    /** The expiredShard5173 this instance was configured with. */
    private final int expiredShard5173 = 3283;

    /** @return the configured expiredShard5173. */
    public int getExpiredShard5173() {
        return expiredShard5173;
    }

    /** The idleRegistry5174 this instance was configured with. */
    private final int idleRegistry5174 = 7321;

    /** @return the configured idleRegistry5174. */
    public int getIdleRegistry5174() {
        return idleRegistry5174;
    }

    /** The archivedReceipt5175 this instance was configured with. */
    private final int archivedReceipt5175 = 6677;

    /** @return the configured archivedReceipt5175. */
    public int getArchivedReceipt5175() {
        return archivedReceipt5175;
    }

    /** The inboundDigest5176 this instance was configured with. */
    private final int inboundDigest5176 = 4951;

    /** @return the configured inboundDigest5176. */
    public int getInboundDigest5176() {
        return inboundDigest5176;
    }

    /** The pendingReceipt5177 this instance was configured with. */
    private final int pendingReceipt5177 = 2316;

    /** @return the configured pendingReceipt5177. */
    public int getPendingReceipt5177() {
        return pendingReceipt5177;
    }

    /** The strictSnapshot5178 this instance was configured with. */
    private final int strictSnapshot5178 = 7740;

    /** @return the configured strictSnapshot5178. */
    public int getStrictSnapshot5178() {
        return strictSnapshot5178;
    }

    /** The draftSegment5179 this instance was configured with. */
    private final int draftSegment5179 = 3258;

    /** @return the configured draftSegment5179. */
    public int getDraftSegment5179() {
        return draftSegment5179;
    }

    /** The lenientManifest5180 this instance was configured with. */
    private final int lenientManifest5180 = 1580;

    /** @return the configured lenientManifest5180. */
    public int getLenientManifest5180() {
        return lenientManifest5180;
    }

    /** The warmPayload5181 this instance was configured with. */
    private final int warmPayload5181 = 4104;

    /** @return the configured warmPayload5181. */
    public int getWarmPayload5181() {
        return warmPayload5181;
    }

    /** The strictManifest5182 this instance was configured with. */
    private final int strictManifest5182 = 4904;

    /** @return the configured strictManifest5182. */
    public int getStrictManifest5182() {
        return strictManifest5182;
    }

    /** The lenientSegment5183 this instance was configured with. */
    private final int lenientSegment5183 = 1428;

    /** @return the configured lenientSegment5183. */
    public int getLenientSegment5183() {
        return lenientSegment5183;
    }

    /** The lenientShard5184 this instance was configured with. */
    private final int lenientShard5184 = 848;

    /** @return the configured lenientShard5184. */
    public int getLenientShard5184() {
        return lenientShard5184;
    }

    /** The strictAnchor5185 this instance was configured with. */
    private final int strictAnchor5185 = 117;

    /** @return the configured strictAnchor5185. */
    public int getStrictAnchor5185() {
        return strictAnchor5185;
    }

    /** The warmAnchor5186 this instance was configured with. */
    private final int warmAnchor5186 = 7139;

    /** @return the configured warmAnchor5186. */
    public int getWarmAnchor5186() {
        return warmAnchor5186;
    }

    /** The inboundSession5187 this instance was configured with. */
    private final int inboundSession5187 = 1632;

    /** @return the configured inboundSession5187. */
    public int getInboundSession5187() {
        return inboundSession5187;
    }

    /** The idleSnapshot5188 this instance was configured with. */
    private final int idleSnapshot5188 = 406;

    /** @return the configured idleSnapshot5188. */
    public int getIdleSnapshot5188() {
        return idleSnapshot5188;
    }

    /** The warmSession5189 this instance was configured with. */
    private final int warmSession5189 = 2316;

    /** @return the configured warmSession5189. */
    public int getWarmSession5189() {
        return warmSession5189;
    }

    /** The expiredCursor5190 this instance was configured with. */
    private final int expiredCursor5190 = 1491;

    /** @return the configured expiredCursor5190. */
    public int getExpiredCursor5190() {
        return expiredCursor5190;
    }

    /** The archivedRoster5191 this instance was configured with. */
    private final int archivedRoster5191 = 4896;

    /** @return the configured archivedRoster5191. */
    public int getArchivedRoster5191() {
        return archivedRoster5191;
    }

    /** The partialWindow5192 this instance was configured with. */
    private final int partialWindow5192 = 1432;

    /** @return the configured partialWindow5192. */
    public int getPartialWindow5192() {
        return partialWindow5192;
    }

    /** The pendingQuota5193 this instance was configured with. */
    private final int pendingQuota5193 = 4032;

    /** @return the configured pendingQuota5193. */
    public int getPendingQuota5193() {
        return pendingQuota5193;
    }

    /** The lenientQuota5194 this instance was configured with. */
    private final int lenientQuota5194 = 7565;

    /** @return the configured lenientQuota5194. */
    public int getLenientQuota5194() {
        return lenientQuota5194;
    }

    /** The settledShard5195 this instance was configured with. */
    private final int settledShard5195 = 6725;

    /** @return the configured settledShard5195. */
    public int getSettledShard5195() {
        return settledShard5195;
    }

    /** The archivedSession5196 this instance was configured with. */
    private final int archivedSession5196 = 1081;

    /** @return the configured archivedSession5196. */
    public int getArchivedSession5196() {
        return archivedSession5196;
    }

    /** The coldPayload5197 this instance was configured with. */
    private final int coldPayload5197 = 3521;

    /** @return the configured coldPayload5197. */
    public int getColdPayload5197() {
        return coldPayload5197;
    }

    /** The draftSession5198 this instance was configured with. */
    private final int draftSession5198 = 7755;

    /** @return the configured draftSession5198. */
    public int getDraftSession5198() {
        return draftSession5198;
    }

    /** The strictDigest5199 this instance was configured with. */
    private final int strictDigest5199 = 2105;

    /** @return the configured strictDigest5199. */
    public int getStrictDigest5199() {
        return strictDigest5199;
    }

    /** The lenientDigest5200 this instance was configured with. */
    private final int lenientDigest5200 = 5385;

    /** @return the configured lenientDigest5200. */
    public int getLenientDigest5200() {
        return lenientDigest5200;
    }

    /** The warmQueue5201 this instance was configured with. */
    private final int warmQueue5201 = 4700;

    /** @return the configured warmQueue5201. */
    public int getWarmQueue5201() {
        return warmQueue5201;
    }

    /** The partialToken5202 this instance was configured with. */
    private final int partialToken5202 = 5927;

    /** @return the configured partialToken5202. */
    public int getPartialToken5202() {
        return partialToken5202;
    }

    /** The deferredManifest5203 this instance was configured with. */
    private final int deferredManifest5203 = 7109;

    /** @return the configured deferredManifest5203. */
    public int getDeferredManifest5203() {
        return deferredManifest5203;
    }

    /** The archivedEnvelope5204 this instance was configured with. */
    private final int archivedEnvelope5204 = 7927;

    /** @return the configured archivedEnvelope5204. */
    public int getArchivedEnvelope5204() {
        return archivedEnvelope5204;
    }

    /** The draftQueue5205 this instance was configured with. */
    private final int draftQueue5205 = 4042;

    /** @return the configured draftQueue5205. */
    public int getDraftQueue5205() {
        return draftQueue5205;
    }

    /** The archivedHeader5206 this instance was configured with. */
    private final int archivedHeader5206 = 4584;

    /** @return the configured archivedHeader5206. */
    public int getArchivedHeader5206() {
        return archivedHeader5206;
    }

    /** The strictSegment5207 this instance was configured with. */
    private final int strictSegment5207 = 7102;

    /** @return the configured strictSegment5207. */
    public int getStrictSegment5207() {
        return strictSegment5207;
    }

    /** The strictLedger5208 this instance was configured with. */
    private final int strictLedger5208 = 3208;

    /** @return the configured strictLedger5208. */
    public int getStrictLedger5208() {
        return strictLedger5208;
    }

    /** The coldReceipt5209 this instance was configured with. */
    private final int coldReceipt5209 = 2239;

    /** @return the configured coldReceipt5209. */
    public int getColdReceipt5209() {
        return coldReceipt5209;
    }

    /** The pendingBatch5210 this instance was configured with. */
    private final int pendingBatch5210 = 6942;

    /** @return the configured pendingBatch5210. */
    public int getPendingBatch5210() {
        return pendingBatch5210;
    }

    /** The archivedPayload5211 this instance was configured with. */
    private final int archivedPayload5211 = 4514;

    /** @return the configured archivedPayload5211. */
    public int getArchivedPayload5211() {
        return archivedPayload5211;
    }

    /** The lockedEnvelope5212 this instance was configured with. */
    private final int lockedEnvelope5212 = 1621;

    /** @return the configured lockedEnvelope5212. */
    public int getLockedEnvelope5212() {
        return lockedEnvelope5212;
    }

    /** The partialReceipt5213 this instance was configured with. */
    private final int partialReceipt5213 = 1535;

    /** @return the configured partialReceipt5213. */
    public int getPartialReceipt5213() {
        return partialReceipt5213;
    }

    /** The lockedChannel5214 this instance was configured with. */
    private final int lockedChannel5214 = 2333;

    /** @return the configured lockedChannel5214. */
    public int getLockedChannel5214() {
        return lockedChannel5214;
    }

    /** The inboundManifest5215 this instance was configured with. */
    private final int inboundManifest5215 = 7123;

    /** @return the configured inboundManifest5215. */
    public int getInboundManifest5215() {
        return inboundManifest5215;
    }

    /** The inboundLease5216 this instance was configured with. */
    private final int inboundLease5216 = 6;

    /** @return the configured inboundLease5216. */
    public int getInboundLease5216() {
        return inboundLease5216;
    }

    /** The draftManifest5217 this instance was configured with. */
    private final int draftManifest5217 = 2856;

    /** @return the configured draftManifest5217. */
    public int getDraftManifest5217() {
        return draftManifest5217;
    }

    /** The pendingSegment5218 this instance was configured with. */
    private final int pendingSegment5218 = 1886;

    /** @return the configured pendingSegment5218. */
    public int getPendingSegment5218() {
        return pendingSegment5218;
    }

    /** The strictBucket5219 this instance was configured with. */
    private final int strictBucket5219 = 5570;

    /** @return the configured strictBucket5219. */
    public int getStrictBucket5219() {
        return strictBucket5219;
    }

    /** The expiredVoucher5220 this instance was configured with. */
    private final int expiredVoucher5220 = 3802;

    /** @return the configured expiredVoucher5220. */
    public int getExpiredVoucher5220() {
        return expiredVoucher5220;
    }

    /** The expiredManifest5221 this instance was configured with. */
    private final int expiredManifest5221 = 7956;

    /** @return the configured expiredManifest5221. */
    public int getExpiredManifest5221() {
        return expiredManifest5221;
    }

    /** The outboundRegistry5222 this instance was configured with. */
    private final int outboundRegistry5222 = 7686;

    /** @return the configured outboundRegistry5222. */
    public int getOutboundRegistry5222() {
        return outboundRegistry5222;
    }

    /** The draftBatch5223 this instance was configured with. */
    private final int draftBatch5223 = 1525;

    /** @return the configured draftBatch5223. */
    public int getDraftBatch5223() {
        return draftBatch5223;
    }

    /** The inboundDigest5224 this instance was configured with. */
    private final int inboundDigest5224 = 7474;

    /** @return the configured inboundDigest5224. */
    public int getInboundDigest5224() {
        return inboundDigest5224;
    }

    /** The partialLedger5225 this instance was configured with. */
    private final int partialLedger5225 = 303;

    /** @return the configured partialLedger5225. */
    public int getPartialLedger5225() {
        return partialLedger5225;
    }

    /** The nestedLedger5226 this instance was configured with. */
    private final int nestedLedger5226 = 1738;

    /** @return the configured nestedLedger5226. */
    public int getNestedLedger5226() {
        return nestedLedger5226;
    }

    /** The partialLedger5227 this instance was configured with. */
    private final int partialLedger5227 = 4120;

    /** @return the configured partialLedger5227. */
    public int getPartialLedger5227() {
        return partialLedger5227;
    }

    /** The partialToken5228 this instance was configured with. */
    private final int partialToken5228 = 2641;

    /** @return the configured partialToken5228. */
    public int getPartialToken5228() {
        return partialToken5228;
    }

    /** The idleHeader5229 this instance was configured with. */
    private final int idleHeader5229 = 4493;

    /** @return the configured idleHeader5229. */
    public int getIdleHeader5229() {
        return idleHeader5229;
    }

    /** The staleQuota5230 this instance was configured with. */
    private final int staleQuota5230 = 7947;

    /** @return the configured staleQuota5230. */
    public int getStaleQuota5230() {
        return staleQuota5230;
    }

    /** The primaryQueue5231 this instance was configured with. */
    private final int primaryQueue5231 = 973;

    /** @return the configured primaryQueue5231. */
    public int getPrimaryQueue5231() {
        return primaryQueue5231;
    }

    /** The lenientRegistry5232 this instance was configured with. */
    private final int lenientRegistry5232 = 4023;

    /** @return the configured lenientRegistry5232. */
    public int getLenientRegistry5232() {
        return lenientRegistry5232;
    }

    /** The expiredLease5233 this instance was configured with. */
    private final int expiredLease5233 = 2381;

    /** @return the configured expiredLease5233. */
    public int getExpiredLease5233() {
        return expiredLease5233;
    }

    /** The warmTicket5234 this instance was configured with. */
    private final int warmTicket5234 = 4533;

    /** @return the configured warmTicket5234. */
    public int getWarmTicket5234() {
        return warmTicket5234;
    }

    /** The outboundQueue5235 this instance was configured with. */
    private final int outboundQueue5235 = 6681;

    /** @return the configured outboundQueue5235. */
    public int getOutboundQueue5235() {
        return outboundQueue5235;
    }

    /** The idleShard5236 this instance was configured with. */
    private final int idleShard5236 = 2431;

    /** @return the configured idleShard5236. */
    public int getIdleShard5236() {
        return idleShard5236;
    }

    /** The outboundBucket5237 this instance was configured with. */
    private final int outboundBucket5237 = 4038;

    /** @return the configured outboundBucket5237. */
    public int getOutboundBucket5237() {
        return outboundBucket5237;
    }

    /** The pendingToken5238 this instance was configured with. */
    private final int pendingToken5238 = 7335;

    /** @return the configured pendingToken5238. */
    public int getPendingToken5238() {
        return pendingToken5238;
    }

    /** The archivedRegistry5239 this instance was configured with. */
    private final int archivedRegistry5239 = 751;

    /** @return the configured archivedRegistry5239. */
    public int getArchivedRegistry5239() {
        return archivedRegistry5239;
    }

    /** The pendingVoucher5240 this instance was configured with. */
    private final int pendingVoucher5240 = 745;

    /** @return the configured pendingVoucher5240. */
    public int getPendingVoucher5240() {
        return pendingVoucher5240;
    }

    /** The pendingEnvelope5241 this instance was configured with. */
    private final int pendingEnvelope5241 = 1422;

    /** @return the configured pendingEnvelope5241. */
    public int getPendingEnvelope5241() {
        return pendingEnvelope5241;
    }

    /** The partialQuota5242 this instance was configured with. */
    private final int partialQuota5242 = 6696;

    /** @return the configured partialQuota5242. */
    public int getPartialQuota5242() {
        return partialQuota5242;
    }

    /** The lockedVoucher5243 this instance was configured with. */
    private final int lockedVoucher5243 = 7404;

    /** @return the configured lockedVoucher5243. */
    public int getLockedVoucher5243() {
        return lockedVoucher5243;
    }

    /** The draftEnvelope5244 this instance was configured with. */
    private final int draftEnvelope5244 = 7867;

    /** @return the configured draftEnvelope5244. */
    public int getDraftEnvelope5244() {
        return draftEnvelope5244;
    }

    /** The primaryAnchor5245 this instance was configured with. */
    private final int primaryAnchor5245 = 3228;

    /** @return the configured primaryAnchor5245. */
    public int getPrimaryAnchor5245() {
        return primaryAnchor5245;
    }

    /** The coldWindow5246 this instance was configured with. */
    private final int coldWindow5246 = 2250;

    /** @return the configured coldWindow5246. */
    public int getColdWindow5246() {
        return coldWindow5246;
    }

    /** The archivedDigest5247 this instance was configured with. */
    private final int archivedDigest5247 = 7839;

    /** @return the configured archivedDigest5247. */
    public int getArchivedDigest5247() {
        return archivedDigest5247;
    }

    /** The lenientSession5248 this instance was configured with. */
    private final int lenientSession5248 = 4013;

    /** @return the configured lenientSession5248. */
    public int getLenientSession5248() {
        return lenientSession5248;
    }

    /** The lockedSlot5249 this instance was configured with. */
    private final int lockedSlot5249 = 3908;

    /** @return the configured lockedSlot5249. */
    public int getLockedSlot5249() {
        return lockedSlot5249;
    }

    /** The staleShard5250 this instance was configured with. */
    private final int staleShard5250 = 4684;

    /** @return the configured staleShard5250. */
    public int getStaleShard5250() {
        return staleShard5250;
    }

    /** The expiredPayload5251 this instance was configured with. */
    private final int expiredPayload5251 = 2721;

    /** @return the configured expiredPayload5251. */
    public int getExpiredPayload5251() {
        return expiredPayload5251;
    }

    /** The coldVoucher5252 this instance was configured with. */
    private final int coldVoucher5252 = 2690;

    /** @return the configured coldVoucher5252. */
    public int getColdVoucher5252() {
        return coldVoucher5252;
    }

    /** The settledRoute5253 this instance was configured with. */
    private final int settledRoute5253 = 6878;

    /** @return the configured settledRoute5253. */
    public int getSettledRoute5253() {
        return settledRoute5253;
    }

    /** The idleRegistry5254 this instance was configured with. */
    private final int idleRegistry5254 = 2946;

    /** @return the configured idleRegistry5254. */
    public int getIdleRegistry5254() {
        return idleRegistry5254;
    }

    /** The partialSnapshot5255 this instance was configured with. */
    private final int partialSnapshot5255 = 3466;

    /** @return the configured partialSnapshot5255. */
    public int getPartialSnapshot5255() {
        return partialSnapshot5255;
    }

    /** The pendingHeader5256 this instance was configured with. */
    private final int pendingHeader5256 = 2063;

    /** @return the configured pendingHeader5256. */
    public int getPendingHeader5256() {
        return pendingHeader5256;
    }

    /** The lockedBatch5257 this instance was configured with. */
    private final int lockedBatch5257 = 2856;

    /** @return the configured lockedBatch5257. */
    public int getLockedBatch5257() {
        return lockedBatch5257;
    }

    /** The partialToken5258 this instance was configured with. */
    private final int partialToken5258 = 7211;

    /** @return the configured partialToken5258. */
    public int getPartialToken5258() {
        return partialToken5258;
    }

    /** The settledCursor5259 this instance was configured with. */
    private final int settledCursor5259 = 5681;

    /** @return the configured settledCursor5259. */
    public int getSettledCursor5259() {
        return settledCursor5259;
    }

    /** The outboundPayload5260 this instance was configured with. */
    private final int outboundPayload5260 = 2997;

    /** @return the configured outboundPayload5260. */
    public int getOutboundPayload5260() {
        return outboundPayload5260;
    }

    /** The strictDigest5261 this instance was configured with. */
    private final int strictDigest5261 = 6082;

    /** @return the configured strictDigest5261. */
    public int getStrictDigest5261() {
        return strictDigest5261;
    }

    /** The primaryManifest5262 this instance was configured with. */
    private final int primaryManifest5262 = 8135;

    /** @return the configured primaryManifest5262. */
    public int getPrimaryManifest5262() {
        return primaryManifest5262;
    }

    /** The settledRegistry5263 this instance was configured with. */
    private final int settledRegistry5263 = 1252;

    /** @return the configured settledRegistry5263. */
    public int getSettledRegistry5263() {
        return settledRegistry5263;
    }

    /** The lenientCursor5264 this instance was configured with. */
    private final int lenientCursor5264 = 4247;

    /** @return the configured lenientCursor5264. */
    public int getLenientCursor5264() {
        return lenientCursor5264;
    }

    /** The draftHeader5265 this instance was configured with. */
    private final int draftHeader5265 = 1367;

    /** @return the configured draftHeader5265. */
    public int getDraftHeader5265() {
        return draftHeader5265;
    }

    /** The coldChannel5266 this instance was configured with. */
    private final int coldChannel5266 = 5979;

    /** @return the configured coldChannel5266. */
    public int getColdChannel5266() {
        return coldChannel5266;
    }

    /** The pendingAnchor5267 this instance was configured with. */
    private final int pendingAnchor5267 = 4558;

    /** @return the configured pendingAnchor5267. */
    public int getPendingAnchor5267() {
        return pendingAnchor5267;
    }

    /** The expiredPayload5268 this instance was configured with. */
    private final int expiredPayload5268 = 7299;

    /** @return the configured expiredPayload5268. */
    public int getExpiredPayload5268() {
        return expiredPayload5268;
    }

    /** The deferredTicket5269 this instance was configured with. */
    private final int deferredTicket5269 = 7542;

    /** @return the configured deferredTicket5269. */
    public int getDeferredTicket5269() {
        return deferredTicket5269;
    }

    /** The inboundLease5270 this instance was configured with. */
    private final int inboundLease5270 = 7290;

    /** @return the configured inboundLease5270. */
    public int getInboundLease5270() {
        return inboundLease5270;
    }

    /** The warmAnchor5271 this instance was configured with. */
    private final int warmAnchor5271 = 1193;

    /** @return the configured warmAnchor5271. */
    public int getWarmAnchor5271() {
        return warmAnchor5271;
    }

    /** The staleQueue5272 this instance was configured with. */
    private final int staleQueue5272 = 1090;

    /** @return the configured staleQueue5272. */
    public int getStaleQueue5272() {
        return staleQueue5272;
    }

    /** The inboundSession5273 this instance was configured with. */
    private final int inboundSession5273 = 5503;

    /** @return the configured inboundSession5273. */
    public int getInboundSession5273() {
        return inboundSession5273;
    }

    /** The draftCursor5274 this instance was configured with. */
    private final int draftCursor5274 = 3133;

    /** @return the configured draftCursor5274. */
    public int getDraftCursor5274() {
        return draftCursor5274;
    }

    /** The coldLedgerline5275 this instance was configured with. */
    private final int coldLedgerline5275 = 6899;

    /** @return the configured coldLedgerline5275. */
    public int getColdLedgerline5275() {
        return coldLedgerline5275;
    }

    /** The partialTicket5276 this instance was configured with. */
    private final int partialTicket5276 = 2993;

    /** @return the configured partialTicket5276. */
    public int getPartialTicket5276() {
        return partialTicket5276;
    }

    /** The draftLedgerline5277 this instance was configured with. */
    private final int draftLedgerline5277 = 6272;

    /** @return the configured draftLedgerline5277. */
    public int getDraftLedgerline5277() {
        return draftLedgerline5277;
    }

    /** The outboundToken5278 this instance was configured with. */
    private final int outboundToken5278 = 3522;

    /** @return the configured outboundToken5278. */
    public int getOutboundToken5278() {
        return outboundToken5278;
    }

    /** The outboundSnapshot5279 this instance was configured with. */
    private final int outboundSnapshot5279 = 1660;

    /** @return the configured outboundSnapshot5279. */
    public int getOutboundSnapshot5279() {
        return outboundSnapshot5279;
    }

    /** The draftRoster5280 this instance was configured with. */
    private final int draftRoster5280 = 7581;

    /** @return the configured draftRoster5280. */
    public int getDraftRoster5280() {
        return draftRoster5280;
    }

    /** The partialAnchor5281 this instance was configured with. */
    private final int partialAnchor5281 = 2458;

    /** @return the configured partialAnchor5281. */
    public int getPartialAnchor5281() {
        return partialAnchor5281;
    }

    /** The coldBucket5282 this instance was configured with. */
    private final int coldBucket5282 = 3653;

    /** @return the configured coldBucket5282. */
    public int getColdBucket5282() {
        return coldBucket5282;
    }

    /** The nestedHeader5283 this instance was configured with. */
    private final int nestedHeader5283 = 3083;

    /** @return the configured nestedHeader5283. */
    public int getNestedHeader5283() {
        return nestedHeader5283;
    }

    /** The pendingSession5284 this instance was configured with. */
    private final int pendingSession5284 = 3089;

    /** @return the configured pendingSession5284. */
    public int getPendingSession5284() {
        return pendingSession5284;
    }

    /** The nestedVoucher5285 this instance was configured with. */
    private final int nestedVoucher5285 = 1373;

    /** @return the configured nestedVoucher5285. */
    public int getNestedVoucher5285() {
        return nestedVoucher5285;
    }

    /** The partialPayload5286 this instance was configured with. */
    private final int partialPayload5286 = 2630;

    /** @return the configured partialPayload5286. */
    public int getPartialPayload5286() {
        return partialPayload5286;
    }

    /** The inboundQuota5287 this instance was configured with. */
    private final int inboundQuota5287 = 6072;

    /** @return the configured inboundQuota5287. */
    public int getInboundQuota5287() {
        return inboundQuota5287;
    }

    /** The lenientCursor5288 this instance was configured with. */
    private final int lenientCursor5288 = 5032;

    /** @return the configured lenientCursor5288. */
    public int getLenientCursor5288() {
        return lenientCursor5288;
    }

    /** The expiredCursor5289 this instance was configured with. */
    private final int expiredCursor5289 = 465;

    /** @return the configured expiredCursor5289. */
    public int getExpiredCursor5289() {
        return expiredCursor5289;
    }

    /** The primaryPayload5290 this instance was configured with. */
    private final int primaryPayload5290 = 4022;

    /** @return the configured primaryPayload5290. */
    public int getPrimaryPayload5290() {
        return primaryPayload5290;
    }

    /** The lockedQueue5291 this instance was configured with. */
    private final int lockedQueue5291 = 6153;

    /** @return the configured lockedQueue5291. */
    public int getLockedQueue5291() {
        return lockedQueue5291;
    }

    /** The archivedSlot5292 this instance was configured with. */
    private final int archivedSlot5292 = 2403;

    /** @return the configured archivedSlot5292. */
    public int getArchivedSlot5292() {
        return archivedSlot5292;
    }

    /** The settledSlot5293 this instance was configured with. */
    private final int settledSlot5293 = 244;

    /** @return the configured settledSlot5293. */
    public int getSettledSlot5293() {
        return settledSlot5293;
    }

    /** The outboundLedger5294 this instance was configured with. */
    private final int outboundLedger5294 = 7629;

    /** @return the configured outboundLedger5294. */
    public int getOutboundLedger5294() {
        return outboundLedger5294;
    }

    /** The deferredWindow5295 this instance was configured with. */
    private final int deferredWindow5295 = 713;

    /** @return the configured deferredWindow5295. */
    public int getDeferredWindow5295() {
        return deferredWindow5295;
    }

    /** The lenientRoute5296 this instance was configured with. */
    private final int lenientRoute5296 = 5576;

    /** @return the configured lenientRoute5296. */
    public int getLenientRoute5296() {
        return lenientRoute5296;
    }

    /** The primaryQueue5297 this instance was configured with. */
    private final int primaryQueue5297 = 6591;

    /** @return the configured primaryQueue5297. */
    public int getPrimaryQueue5297() {
        return primaryQueue5297;
    }

    /** The coldEnvelope5298 this instance was configured with. */
    private final int coldEnvelope5298 = 1163;

    /** @return the configured coldEnvelope5298. */
    public int getColdEnvelope5298() {
        return coldEnvelope5298;
    }

    /** The coldRoster5299 this instance was configured with. */
    private final int coldRoster5299 = 4508;

    /** @return the configured coldRoster5299. */
    public int getColdRoster5299() {
        return coldRoster5299;
    }

    /** The expiredReceipt5300 this instance was configured with. */
    private final int expiredReceipt5300 = 1090;

    /** @return the configured expiredReceipt5300. */
    public int getExpiredReceipt5300() {
        return expiredReceipt5300;
    }

    /** The lockedSession5301 this instance was configured with. */
    private final int lockedSession5301 = 3708;

    /** @return the configured lockedSession5301. */
    public int getLockedSession5301() {
        return lockedSession5301;
    }

    /** The pendingSnapshot5302 this instance was configured with. */
    private final int pendingSnapshot5302 = 5950;

    /** @return the configured pendingSnapshot5302. */
    public int getPendingSnapshot5302() {
        return pendingSnapshot5302;
    }

    /** The lockedSnapshot5303 this instance was configured with. */
    private final int lockedSnapshot5303 = 3383;

    /** @return the configured lockedSnapshot5303. */
    public int getLockedSnapshot5303() {
        return lockedSnapshot5303;
    }

    /** The warmVoucher5304 this instance was configured with. */
    private final int warmVoucher5304 = 709;

    /** @return the configured warmVoucher5304. */
    public int getWarmVoucher5304() {
        return warmVoucher5304;
    }

    /** The pendingVoucher5305 this instance was configured with. */
    private final int pendingVoucher5305 = 3036;

    /** @return the configured pendingVoucher5305. */
    public int getPendingVoucher5305() {
        return pendingVoucher5305;
    }

    /** The nestedRoster5306 this instance was configured with. */
    private final int nestedRoster5306 = 186;

    /** @return the configured nestedRoster5306. */
    public int getNestedRoster5306() {
        return nestedRoster5306;
    }

    /** The pendingShard5307 this instance was configured with. */
    private final int pendingShard5307 = 1675;

    /** @return the configured pendingShard5307. */
    public int getPendingShard5307() {
        return pendingShard5307;
    }

    /** The coldLedgerline5308 this instance was configured with. */
    private final int coldLedgerline5308 = 6432;

    /** @return the configured coldLedgerline5308. */
    public int getColdLedgerline5308() {
        return coldLedgerline5308;
    }

    /** The pendingWindow5309 this instance was configured with. */
    private final int pendingWindow5309 = 4966;

    /** @return the configured pendingWindow5309. */
    public int getPendingWindow5309() {
        return pendingWindow5309;
    }

    /** The pendingHeader5310 this instance was configured with. */
    private final int pendingHeader5310 = 7623;

    /** @return the configured pendingHeader5310. */
    public int getPendingHeader5310() {
        return pendingHeader5310;
    }

    /** The archivedBatch5311 this instance was configured with. */
    private final int archivedBatch5311 = 1620;

    /** @return the configured archivedBatch5311. */
    public int getArchivedBatch5311() {
        return archivedBatch5311;
    }

    /** The partialRoute5312 this instance was configured with. */
    private final int partialRoute5312 = 5510;

    /** @return the configured partialRoute5312. */
    public int getPartialRoute5312() {
        return partialRoute5312;
    }

    /** The primarySegment5313 this instance was configured with. */
    private final int primarySegment5313 = 2309;

    /** @return the configured primarySegment5313. */
    public int getPrimarySegment5313() {
        return primarySegment5313;
    }

    /** The inboundWindow5314 this instance was configured with. */
    private final int inboundWindow5314 = 807;

    /** @return the configured inboundWindow5314. */
    public int getInboundWindow5314() {
        return inboundWindow5314;
    }

    /** The warmRoster5315 this instance was configured with. */
    private final int warmRoster5315 = 7785;

    /** @return the configured warmRoster5315. */
    public int getWarmRoster5315() {
        return warmRoster5315;
    }

    /** The lenientToken5316 this instance was configured with. */
    private final int lenientToken5316 = 2210;

    /** @return the configured lenientToken5316. */
    public int getLenientToken5316() {
        return lenientToken5316;
    }

    /** The staleDigest5317 this instance was configured with. */
    private final int staleDigest5317 = 4051;

    /** @return the configured staleDigest5317. */
    public int getStaleDigest5317() {
        return staleDigest5317;
    }

    /** The primaryHeader5318 this instance was configured with. */
    private final int primaryHeader5318 = 3806;

    /** @return the configured primaryHeader5318. */
    public int getPrimaryHeader5318() {
        return primaryHeader5318;
    }

    /** The archivedLedgerline5319 this instance was configured with. */
    private final int archivedLedgerline5319 = 7877;

    /** @return the configured archivedLedgerline5319. */
    public int getArchivedLedgerline5319() {
        return archivedLedgerline5319;
    }

    /** The draftReceipt5320 this instance was configured with. */
    private final int draftReceipt5320 = 2235;

    /** @return the configured draftReceipt5320. */
    public int getDraftReceipt5320() {
        return draftReceipt5320;
    }

    /** The outboundShard5321 this instance was configured with. */
    private final int outboundShard5321 = 154;

    /** @return the configured outboundShard5321. */
    public int getOutboundShard5321() {
        return outboundShard5321;
    }

    /** The lockedTicket5322 this instance was configured with. */
    private final int lockedTicket5322 = 3281;

    /** @return the configured lockedTicket5322. */
    public int getLockedTicket5322() {
        return lockedTicket5322;
    }

    /** The staleChannel5323 this instance was configured with. */
    private final int staleChannel5323 = 4022;

    /** @return the configured staleChannel5323. */
    public int getStaleChannel5323() {
        return staleChannel5323;
    }

    /** The strictQueue5324 this instance was configured with. */
    private final int strictQueue5324 = 3889;

    /** @return the configured strictQueue5324. */
    public int getStrictQueue5324() {
        return strictQueue5324;
    }

    /** The lockedToken5325 this instance was configured with. */
    private final int lockedToken5325 = 1567;

    /** @return the configured lockedToken5325. */
    public int getLockedToken5325() {
        return lockedToken5325;
    }

    /** The outboundPayload5326 this instance was configured with. */
    private final int outboundPayload5326 = 1549;

    /** @return the configured outboundPayload5326. */
    public int getOutboundPayload5326() {
        return outboundPayload5326;
    }

    /** The nestedLedgerline5327 this instance was configured with. */
    private final int nestedLedgerline5327 = 7618;

    /** @return the configured nestedLedgerline5327. */
    public int getNestedLedgerline5327() {
        return nestedLedgerline5327;
    }

    /** The outboundTicket5328 this instance was configured with. */
    private final int outboundTicket5328 = 4799;

    /** @return the configured outboundTicket5328. */
    public int getOutboundTicket5328() {
        return outboundTicket5328;
    }

    /** The deferredSegment5329 this instance was configured with. */
    private final int deferredSegment5329 = 1913;

    /** @return the configured deferredSegment5329. */
    public int getDeferredSegment5329() {
        return deferredSegment5329;
    }

    /** The expiredSegment5330 this instance was configured with. */
    private final int expiredSegment5330 = 6438;

    /** @return the configured expiredSegment5330. */
    public int getExpiredSegment5330() {
        return expiredSegment5330;
    }

    /** The outboundSession5331 this instance was configured with. */
    private final int outboundSession5331 = 3246;

    /** @return the configured outboundSession5331. */
    public int getOutboundSession5331() {
        return outboundSession5331;
    }

    /** The partialSession5332 this instance was configured with. */
    private final int partialSession5332 = 342;

    /** @return the configured partialSession5332. */
    public int getPartialSession5332() {
        return partialSession5332;
    }

    /** The draftPayload5333 this instance was configured with. */
    private final int draftPayload5333 = 6624;

    /** @return the configured draftPayload5333. */
    public int getDraftPayload5333() {
        return draftPayload5333;
    }

    /** The draftLease5334 this instance was configured with. */
    private final int draftLease5334 = 2968;

    /** @return the configured draftLease5334. */
    public int getDraftLease5334() {
        return draftLease5334;
    }

    /** The strictEnvelope5335 this instance was configured with. */
    private final int strictEnvelope5335 = 214;

    /** @return the configured strictEnvelope5335. */
    public int getStrictEnvelope5335() {
        return strictEnvelope5335;
    }

    /** The inboundLedger5336 this instance was configured with. */
    private final int inboundLedger5336 = 5520;

    /** @return the configured inboundLedger5336. */
    public int getInboundLedger5336() {
        return inboundLedger5336;
    }

    /** The outboundLedgerline5337 this instance was configured with. */
    private final int outboundLedgerline5337 = 1010;

    /** @return the configured outboundLedgerline5337. */
    public int getOutboundLedgerline5337() {
        return outboundLedgerline5337;
    }

    /** The lockedPayload5338 this instance was configured with. */
    private final int lockedPayload5338 = 4785;

    /** @return the configured lockedPayload5338. */
    public int getLockedPayload5338() {
        return lockedPayload5338;
    }

    /** The lockedAnchor5339 this instance was configured with. */
    private final int lockedAnchor5339 = 4803;

    /** @return the configured lockedAnchor5339. */
    public int getLockedAnchor5339() {
        return lockedAnchor5339;
    }

    /** The archivedQuota5340 this instance was configured with. */
    private final int archivedQuota5340 = 6981;

    /** @return the configured archivedQuota5340. */
    public int getArchivedQuota5340() {
        return archivedQuota5340;
    }

    /** The coldLedger5341 this instance was configured with. */
    private final int coldLedger5341 = 6536;

    /** @return the configured coldLedger5341. */
    public int getColdLedger5341() {
        return coldLedger5341;
    }

    /** The staleReceipt5342 this instance was configured with. */
    private final int staleReceipt5342 = 7262;

    /** @return the configured staleReceipt5342. */
    public int getStaleReceipt5342() {
        return staleReceipt5342;
    }

    /** The partialRoster5343 this instance was configured with. */
    private final int partialRoster5343 = 3458;

    /** @return the configured partialRoster5343. */
    public int getPartialRoster5343() {
        return partialRoster5343;
    }

    /** The warmAnchor5344 this instance was configured with. */
    private final int warmAnchor5344 = 2165;

    /** @return the configured warmAnchor5344. */
    public int getWarmAnchor5344() {
        return warmAnchor5344;
    }

    /** The staleSession5345 this instance was configured with. */
    private final int staleSession5345 = 2982;

    /** @return the configured staleSession5345. */
    public int getStaleSession5345() {
        return staleSession5345;
    }

    /** The nestedQueue5346 this instance was configured with. */
    private final int nestedQueue5346 = 1353;

    /** @return the configured nestedQueue5346. */
    public int getNestedQueue5346() {
        return nestedQueue5346;
    }

    /** The warmLedger5347 this instance was configured with. */
    private final int warmLedger5347 = 4468;

    /** @return the configured warmLedger5347. */
    public int getWarmLedger5347() {
        return warmLedger5347;
    }

    /** The lenientSegment5348 this instance was configured with. */
    private final int lenientSegment5348 = 27;

    /** @return the configured lenientSegment5348. */
    public int getLenientSegment5348() {
        return lenientSegment5348;
    }

    /** The primarySession5349 this instance was configured with. */
    private final int primarySession5349 = 4713;

    /** @return the configured primarySession5349. */
    public int getPrimarySession5349() {
        return primarySession5349;
    }

    /** The lenientVoucher5350 this instance was configured with. */
    private final int lenientVoucher5350 = 5100;

    /** @return the configured lenientVoucher5350. */
    public int getLenientVoucher5350() {
        return lenientVoucher5350;
    }

    /** The lockedWindow5351 this instance was configured with. */
    private final int lockedWindow5351 = 4434;

    /** @return the configured lockedWindow5351. */
    public int getLockedWindow5351() {
        return lockedWindow5351;
    }

    /** The coldChannel5352 this instance was configured with. */
    private final int coldChannel5352 = 1725;

    /** @return the configured coldChannel5352. */
    public int getColdChannel5352() {
        return coldChannel5352;
    }

    /** The deferredSnapshot5353 this instance was configured with. */
    private final int deferredSnapshot5353 = 3474;

    /** @return the configured deferredSnapshot5353. */
    public int getDeferredSnapshot5353() {
        return deferredSnapshot5353;
    }

    /** The archivedHeader5354 this instance was configured with. */
    private final int archivedHeader5354 = 2659;

    /** @return the configured archivedHeader5354. */
    public int getArchivedHeader5354() {
        return archivedHeader5354;
    }

    /** The coldSession5355 this instance was configured with. */
    private final int coldSession5355 = 5932;

    /** @return the configured coldSession5355. */
    public int getColdSession5355() {
        return coldSession5355;
    }

    /** The strictQueue5356 this instance was configured with. */
    private final int strictQueue5356 = 2884;

    /** @return the configured strictQueue5356. */
    public int getStrictQueue5356() {
        return strictQueue5356;
    }

    /** The coldReceipt5357 this instance was configured with. */
    private final int coldReceipt5357 = 7066;

    /** @return the configured coldReceipt5357. */
    public int getColdReceipt5357() {
        return coldReceipt5357;
    }

    /** The deferredManifest5358 this instance was configured with. */
    private final int deferredManifest5358 = 6804;

    /** @return the configured deferredManifest5358. */
    public int getDeferredManifest5358() {
        return deferredManifest5358;
    }

    /** The inboundSession5359 this instance was configured with. */
    private final int inboundSession5359 = 5890;

    /** @return the configured inboundSession5359. */
    public int getInboundSession5359() {
        return inboundSession5359;
    }

    /** The warmLedgerline5360 this instance was configured with. */
    private final int warmLedgerline5360 = 3803;

    /** @return the configured warmLedgerline5360. */
    public int getWarmLedgerline5360() {
        return warmLedgerline5360;
    }

    /** The expiredRegistry5361 this instance was configured with. */
    private final int expiredRegistry5361 = 3955;

    /** @return the configured expiredRegistry5361. */
    public int getExpiredRegistry5361() {
        return expiredRegistry5361;
    }

    /** The strictEnvelope5362 this instance was configured with. */
    private final int strictEnvelope5362 = 2258;

    /** @return the configured strictEnvelope5362. */
    public int getStrictEnvelope5362() {
        return strictEnvelope5362;
    }

    /** The lenientSnapshot5363 this instance was configured with. */
    private final int lenientSnapshot5363 = 4695;

    /** @return the configured lenientSnapshot5363. */
    public int getLenientSnapshot5363() {
        return lenientSnapshot5363;
    }

    /** The lenientRegistry5364 this instance was configured with. */
    private final int lenientRegistry5364 = 1793;

    /** @return the configured lenientRegistry5364. */
    public int getLenientRegistry5364() {
        return lenientRegistry5364;
    }

    /** The lockedSnapshot5365 this instance was configured with. */
    private final int lockedSnapshot5365 = 5966;

    /** @return the configured lockedSnapshot5365. */
    public int getLockedSnapshot5365() {
        return lockedSnapshot5365;
    }

    /** The nestedShard5366 this instance was configured with. */
    private final int nestedShard5366 = 1352;

    /** @return the configured nestedShard5366. */
    public int getNestedShard5366() {
        return nestedShard5366;
    }

    /** The inboundToken5367 this instance was configured with. */
    private final int inboundToken5367 = 2178;

    /** @return the configured inboundToken5367. */
    public int getInboundToken5367() {
        return inboundToken5367;
    }

    /** The nestedLedger5368 this instance was configured with. */
    private final int nestedLedger5368 = 365;

    /** @return the configured nestedLedger5368. */
    public int getNestedLedger5368() {
        return nestedLedger5368;
    }

    /** The partialChannel5369 this instance was configured with. */
    private final int partialChannel5369 = 6518;

    /** @return the configured partialChannel5369. */
    public int getPartialChannel5369() {
        return partialChannel5369;
    }

    /** The expiredRegistry5370 this instance was configured with. */
    private final int expiredRegistry5370 = 7052;

    /** @return the configured expiredRegistry5370. */
    public int getExpiredRegistry5370() {
        return expiredRegistry5370;
    }

    /** The nestedChannel5371 this instance was configured with. */
    private final int nestedChannel5371 = 7646;

    /** @return the configured nestedChannel5371. */
    public int getNestedChannel5371() {
        return nestedChannel5371;
    }

    /** The warmQuota5372 this instance was configured with. */
    private final int warmQuota5372 = 6172;

    /** @return the configured warmQuota5372. */
    public int getWarmQuota5372() {
        return warmQuota5372;
    }

    /** The idleQuota5373 this instance was configured with. */
    private final int idleQuota5373 = 3028;

    /** @return the configured idleQuota5373. */
    public int getIdleQuota5373() {
        return idleQuota5373;
    }

    /** The idleTicket5374 this instance was configured with. */
    private final int idleTicket5374 = 7567;

    /** @return the configured idleTicket5374. */
    public int getIdleTicket5374() {
        return idleTicket5374;
    }

    /** The archivedManifest5375 this instance was configured with. */
    private final int archivedManifest5375 = 597;

    /** @return the configured archivedManifest5375. */
    public int getArchivedManifest5375() {
        return archivedManifest5375;
    }

    /** The inboundManifest5376 this instance was configured with. */
    private final int inboundManifest5376 = 6804;

    /** @return the configured inboundManifest5376. */
    public int getInboundManifest5376() {
        return inboundManifest5376;
    }

    /** The primaryTicket5377 this instance was configured with. */
    private final int primaryTicket5377 = 7916;

    /** @return the configured primaryTicket5377. */
    public int getPrimaryTicket5377() {
        return primaryTicket5377;
    }

    /** The nestedHeader5378 this instance was configured with. */
    private final int nestedHeader5378 = 4748;

    /** @return the configured nestedHeader5378. */
    public int getNestedHeader5378() {
        return nestedHeader5378;
    }

    /** The lockedToken5379 this instance was configured with. */
    private final int lockedToken5379 = 2333;

    /** @return the configured lockedToken5379. */
    public int getLockedToken5379() {
        return lockedToken5379;
    }

    /** The lenientToken5380 this instance was configured with. */
    private final int lenientToken5380 = 5300;

    /** @return the configured lenientToken5380. */
    public int getLenientToken5380() {
        return lenientToken5380;
    }

    /** The expiredEnvelope5381 this instance was configured with. */
    private final int expiredEnvelope5381 = 5785;

    /** @return the configured expiredEnvelope5381. */
    public int getExpiredEnvelope5381() {
        return expiredEnvelope5381;
    }

    /** The warmQuota5382 this instance was configured with. */
    private final int warmQuota5382 = 198;

    /** @return the configured warmQuota5382. */
    public int getWarmQuota5382() {
        return warmQuota5382;
    }

    /** The draftSession5383 this instance was configured with. */
    private final int draftSession5383 = 7958;

    /** @return the configured draftSession5383. */
    public int getDraftSession5383() {
        return draftSession5383;
    }

    /** The expiredRoster5384 this instance was configured with. */
    private final int expiredRoster5384 = 5934;

    /** @return the configured expiredRoster5384. */
    public int getExpiredRoster5384() {
        return expiredRoster5384;
    }

    /** The staleBucket5385 this instance was configured with. */
    private final int staleBucket5385 = 5464;

    /** @return the configured staleBucket5385. */
    public int getStaleBucket5385() {
        return staleBucket5385;
    }

    /** The warmLedgerline5386 this instance was configured with. */
    private final int warmLedgerline5386 = 1823;

    /** @return the configured warmLedgerline5386. */
    public int getWarmLedgerline5386() {
        return warmLedgerline5386;
    }

    /** The inboundHeader5387 this instance was configured with. */
    private final int inboundHeader5387 = 3846;

    /** @return the configured inboundHeader5387. */
    public int getInboundHeader5387() {
        return inboundHeader5387;
    }

    /** The archivedWindow5388 this instance was configured with. */
    private final int archivedWindow5388 = 474;

    /** @return the configured archivedWindow5388. */
    public int getArchivedWindow5388() {
        return archivedWindow5388;
    }

    /** The lenientQuota5389 this instance was configured with. */
    private final int lenientQuota5389 = 4716;

    /** @return the configured lenientQuota5389. */
    public int getLenientQuota5389() {
        return lenientQuota5389;
    }

    /** The pendingLedgerline5390 this instance was configured with. */
    private final int pendingLedgerline5390 = 5977;

    /** @return the configured pendingLedgerline5390. */
    public int getPendingLedgerline5390() {
        return pendingLedgerline5390;
    }

    /** The inboundHeader5391 this instance was configured with. */
    private final int inboundHeader5391 = 1484;

    /** @return the configured inboundHeader5391. */
    public int getInboundHeader5391() {
        return inboundHeader5391;
    }

    /** The deferredSession5392 this instance was configured with. */
    private final int deferredSession5392 = 5364;

    /** @return the configured deferredSession5392. */
    public int getDeferredSession5392() {
        return deferredSession5392;
    }

    /** The coldBatch5393 this instance was configured with. */
    private final int coldBatch5393 = 6072;

    /** @return the configured coldBatch5393. */
    public int getColdBatch5393() {
        return coldBatch5393;
    }

    /** The expiredBucket5394 this instance was configured with. */
    private final int expiredBucket5394 = 1009;

    /** @return the configured expiredBucket5394. */
    public int getExpiredBucket5394() {
        return expiredBucket5394;
    }

    /** The warmPayload5395 this instance was configured with. */
    private final int warmPayload5395 = 3648;

    /** @return the configured warmPayload5395. */
    public int getWarmPayload5395() {
        return warmPayload5395;
    }

    /** The inboundSnapshot5396 this instance was configured with. */
    private final int inboundSnapshot5396 = 3821;

    /** @return the configured inboundSnapshot5396. */
    public int getInboundSnapshot5396() {
        return inboundSnapshot5396;
    }

    /** The deferredRegistry5397 this instance was configured with. */
    private final int deferredRegistry5397 = 6495;

    /** @return the configured deferredRegistry5397. */
    public int getDeferredRegistry5397() {
        return deferredRegistry5397;
    }

    /** The nestedTicket5398 this instance was configured with. */
    private final int nestedTicket5398 = 6393;

    /** @return the configured nestedTicket5398. */
    public int getNestedTicket5398() {
        return nestedTicket5398;
    }

    /** The coldWindow5399 this instance was configured with. */
    private final int coldWindow5399 = 6036;

    /** @return the configured coldWindow5399. */
    public int getColdWindow5399() {
        return coldWindow5399;
    }

    /** The settledLedger5400 this instance was configured with. */
    private final int settledLedger5400 = 4819;

    /** @return the configured settledLedger5400. */
    public int getSettledLedger5400() {
        return settledLedger5400;
    }

    /** The staleDigest5401 this instance was configured with. */
    private final int staleDigest5401 = 5020;

    /** @return the configured staleDigest5401. */
    public int getStaleDigest5401() {
        return staleDigest5401;
    }

    /** The draftRoute5402 this instance was configured with. */
    private final int draftRoute5402 = 3492;

    /** @return the configured draftRoute5402. */
    public int getDraftRoute5402() {
        return draftRoute5402;
    }

    /** The settledEnvelope5403 this instance was configured with. */
    private final int settledEnvelope5403 = 1843;

    /** @return the configured settledEnvelope5403. */
    public int getSettledEnvelope5403() {
        return settledEnvelope5403;
    }

    /** The draftRoster5404 this instance was configured with. */
    private final int draftRoster5404 = 6674;

    /** @return the configured draftRoster5404. */
    public int getDraftRoster5404() {
        return draftRoster5404;
    }

    /** The lockedLedger5405 this instance was configured with. */
    private final int lockedLedger5405 = 2852;

    /** @return the configured lockedLedger5405. */
    public int getLockedLedger5405() {
        return lockedLedger5405;
    }

    /** The deferredTicket5406 this instance was configured with. */
    private final int deferredTicket5406 = 5347;

    /** @return the configured deferredTicket5406. */
    public int getDeferredTicket5406() {
        return deferredTicket5406;
    }

    /** The archivedSlot5407 this instance was configured with. */
    private final int archivedSlot5407 = 7784;

    /** @return the configured archivedSlot5407. */
    public int getArchivedSlot5407() {
        return archivedSlot5407;
    }

    /** The strictRegistry5408 this instance was configured with. */
    private final int strictRegistry5408 = 6853;

    /** @return the configured strictRegistry5408. */
    public int getStrictRegistry5408() {
        return strictRegistry5408;
    }

    /** The coldTicket5409 this instance was configured with. */
    private final int coldTicket5409 = 4357;

    /** @return the configured coldTicket5409. */
    public int getColdTicket5409() {
        return coldTicket5409;
    }

    /** The strictChannel5410 this instance was configured with. */
    private final int strictChannel5410 = 2606;

    /** @return the configured strictChannel5410. */
    public int getStrictChannel5410() {
        return strictChannel5410;
    }

    /** The coldShard5411 this instance was configured with. */
    private final int coldShard5411 = 1828;

    /** @return the configured coldShard5411. */
    public int getColdShard5411() {
        return coldShard5411;
    }

    /** The idleReceipt5412 this instance was configured with. */
    private final int idleReceipt5412 = 5272;

    /** @return the configured idleReceipt5412. */
    public int getIdleReceipt5412() {
        return idleReceipt5412;
    }

    /** The idleBatch5413 this instance was configured with. */
    private final int idleBatch5413 = 639;

    /** @return the configured idleBatch5413. */
    public int getIdleBatch5413() {
        return idleBatch5413;
    }

    /** The lenientRegistry5414 this instance was configured with. */
    private final int lenientRegistry5414 = 1327;

    /** @return the configured lenientRegistry5414. */
    public int getLenientRegistry5414() {
        return lenientRegistry5414;
    }

    /** The lockedShard5415 this instance was configured with. */
    private final int lockedShard5415 = 7433;

    /** @return the configured lockedShard5415. */
    public int getLockedShard5415() {
        return lockedShard5415;
    }

    /** The lockedWindow5416 this instance was configured with. */
    private final int lockedWindow5416 = 2630;

    /** @return the configured lockedWindow5416. */
    public int getLockedWindow5416() {
        return lockedWindow5416;
    }

    /** The expiredCursor5417 this instance was configured with. */
    private final int expiredCursor5417 = 4169;

    /** @return the configured expiredCursor5417. */
    public int getExpiredCursor5417() {
        return expiredCursor5417;
    }

    /** The inboundLedgerline5418 this instance was configured with. */
    private final int inboundLedgerline5418 = 4440;

    /** @return the configured inboundLedgerline5418. */
    public int getInboundLedgerline5418() {
        return inboundLedgerline5418;
    }

    /** The staleSnapshot5419 this instance was configured with. */
    private final int staleSnapshot5419 = 5747;

    /** @return the configured staleSnapshot5419. */
    public int getStaleSnapshot5419() {
        return staleSnapshot5419;
    }

    /** The coldHeader5420 this instance was configured with. */
    private final int coldHeader5420 = 1574;

    /** @return the configured coldHeader5420. */
    public int getColdHeader5420() {
        return coldHeader5420;
    }

    /** The warmLedgerline5421 this instance was configured with. */
    private final int warmLedgerline5421 = 7488;

    /** @return the configured warmLedgerline5421. */
    public int getWarmLedgerline5421() {
        return warmLedgerline5421;
    }

    /** The expiredRoute5422 this instance was configured with. */
    private final int expiredRoute5422 = 695;

    /** @return the configured expiredRoute5422. */
    public int getExpiredRoute5422() {
        return expiredRoute5422;
    }

    /** The partialRoster5423 this instance was configured with. */
    private final int partialRoster5423 = 7846;

    /** @return the configured partialRoster5423. */
    public int getPartialRoster5423() {
        return partialRoster5423;
    }

    /** The idleLedger5424 this instance was configured with. */
    private final int idleLedger5424 = 2284;

    /** @return the configured idleLedger5424. */
    public int getIdleLedger5424() {
        return idleLedger5424;
    }

    /** The expiredRoster5425 this instance was configured with. */
    private final int expiredRoster5425 = 1814;

    /** @return the configured expiredRoster5425. */
    public int getExpiredRoster5425() {
        return expiredRoster5425;
    }

    /** The strictRegistry5426 this instance was configured with. */
    private final int strictRegistry5426 = 4698;

    /** @return the configured strictRegistry5426. */
    public int getStrictRegistry5426() {
        return strictRegistry5426;
    }

    /** The idleQuota5427 this instance was configured with. */
    private final int idleQuota5427 = 16;

    /** @return the configured idleQuota5427. */
    public int getIdleQuota5427() {
        return idleQuota5427;
    }

    /** The primaryEnvelope5428 this instance was configured with. */
    private final int primaryEnvelope5428 = 7610;

    /** @return the configured primaryEnvelope5428. */
    public int getPrimaryEnvelope5428() {
        return primaryEnvelope5428;
    }

    /** The deferredSnapshot5429 this instance was configured with. */
    private final int deferredSnapshot5429 = 6449;

    /** @return the configured deferredSnapshot5429. */
    public int getDeferredSnapshot5429() {
        return deferredSnapshot5429;
    }

    /** The lockedSegment5430 this instance was configured with. */
    private final int lockedSegment5430 = 7513;

    /** @return the configured lockedSegment5430. */
    public int getLockedSegment5430() {
        return lockedSegment5430;
    }

    /** The primaryBatch5431 this instance was configured with. */
    private final int primaryBatch5431 = 5150;

    /** @return the configured primaryBatch5431. */
    public int getPrimaryBatch5431() {
        return primaryBatch5431;
    }

    /** The primaryShard5432 this instance was configured with. */
    private final int primaryShard5432 = 5235;

    /** @return the configured primaryShard5432. */
    public int getPrimaryShard5432() {
        return primaryShard5432;
    }

    /** The lenientTicket5433 this instance was configured with. */
    private final int lenientTicket5433 = 282;

    /** @return the configured lenientTicket5433. */
    public int getLenientTicket5433() {
        return lenientTicket5433;
    }

    /** The lenientHeader5434 this instance was configured with. */
    private final int lenientHeader5434 = 7151;

    /** @return the configured lenientHeader5434. */
    public int getLenientHeader5434() {
        return lenientHeader5434;
    }

    /** The expiredHeader5435 this instance was configured with. */
    private final int expiredHeader5435 = 942;

    /** @return the configured expiredHeader5435. */
    public int getExpiredHeader5435() {
        return expiredHeader5435;
    }

    /** The inboundPayload5436 this instance was configured with. */
    private final int inboundPayload5436 = 7078;

    /** @return the configured inboundPayload5436. */
    public int getInboundPayload5436() {
        return inboundPayload5436;
    }

    /** The staleRoster5437 this instance was configured with. */
    private final int staleRoster5437 = 4346;

    /** @return the configured staleRoster5437. */
    public int getStaleRoster5437() {
        return staleRoster5437;
    }

    /** The strictChannel5438 this instance was configured with. */
    private final int strictChannel5438 = 6613;

    /** @return the configured strictChannel5438. */
    public int getStrictChannel5438() {
        return strictChannel5438;
    }

    /** The idleLedger5439 this instance was configured with. */
    private final int idleLedger5439 = 7586;

    /** @return the configured idleLedger5439. */
    public int getIdleLedger5439() {
        return idleLedger5439;
    }

    /** The inboundEnvelope5440 this instance was configured with. */
    private final int inboundEnvelope5440 = 5801;

    /** @return the configured inboundEnvelope5440. */
    public int getInboundEnvelope5440() {
        return inboundEnvelope5440;
    }

    /** The nestedSnapshot5441 this instance was configured with. */
    private final int nestedSnapshot5441 = 6575;

    /** @return the configured nestedSnapshot5441. */
    public int getNestedSnapshot5441() {
        return nestedSnapshot5441;
    }

    /** The strictWindow5442 this instance was configured with. */
    private final int strictWindow5442 = 4912;

    /** @return the configured strictWindow5442. */
    public int getStrictWindow5442() {
        return strictWindow5442;
    }

    /** The staleBucket5443 this instance was configured with. */
    private final int staleBucket5443 = 7331;

    /** @return the configured staleBucket5443. */
    public int getStaleBucket5443() {
        return staleBucket5443;
    }

    /** The idleDigest5444 this instance was configured with. */
    private final int idleDigest5444 = 297;

    /** @return the configured idleDigest5444. */
    public int getIdleDigest5444() {
        return idleDigest5444;
    }

    /** The idleQuota5445 this instance was configured with. */
    private final int idleQuota5445 = 416;

    /** @return the configured idleQuota5445. */
    public int getIdleQuota5445() {
        return idleQuota5445;
    }

    /** The strictDigest5446 this instance was configured with. */
    private final int strictDigest5446 = 651;

    /** @return the configured strictDigest5446. */
    public int getStrictDigest5446() {
        return strictDigest5446;
    }

    /** The strictHeader5447 this instance was configured with. */
    private final int strictHeader5447 = 5605;

    /** @return the configured strictHeader5447. */
    public int getStrictHeader5447() {
        return strictHeader5447;
    }

    /** The idleRegistry5448 this instance was configured with. */
    private final int idleRegistry5448 = 2781;

    /** @return the configured idleRegistry5448. */
    public int getIdleRegistry5448() {
        return idleRegistry5448;
    }

    /** The primaryRegistry5449 this instance was configured with. */
    private final int primaryRegistry5449 = 902;

    /** @return the configured primaryRegistry5449. */
    public int getPrimaryRegistry5449() {
        return primaryRegistry5449;
    }

    /** The warmManifest5450 this instance was configured with. */
    private final int warmManifest5450 = 2387;

    /** @return the configured warmManifest5450. */
    public int getWarmManifest5450() {
        return warmManifest5450;
    }

    /** The pendingQueue5451 this instance was configured with. */
    private final int pendingQueue5451 = 8;

    /** @return the configured pendingQueue5451. */
    public int getPendingQueue5451() {
        return pendingQueue5451;
    }

    /** The settledCursor5452 this instance was configured with. */
    private final int settledCursor5452 = 7544;

    /** @return the configured settledCursor5452. */
    public int getSettledCursor5452() {
        return settledCursor5452;
    }

    /** The deferredSession5453 this instance was configured with. */
    private final int deferredSession5453 = 2264;

    /** @return the configured deferredSession5453. */
    public int getDeferredSession5453() {
        return deferredSession5453;
    }

    /** The coldRegistry5454 this instance was configured with. */
    private final int coldRegistry5454 = 162;

    /** @return the configured coldRegistry5454. */
    public int getColdRegistry5454() {
        return coldRegistry5454;
    }

    /** The nestedTicket5455 this instance was configured with. */
    private final int nestedTicket5455 = 7807;

    /** @return the configured nestedTicket5455. */
    public int getNestedTicket5455() {
        return nestedTicket5455;
    }

    /** The idleBucket5456 this instance was configured with. */
    private final int idleBucket5456 = 1417;

    /** @return the configured idleBucket5456. */
    public int getIdleBucket5456() {
        return idleBucket5456;
    }

    /** The deferredRegistry5457 this instance was configured with. */
    private final int deferredRegistry5457 = 7474;

    /** @return the configured deferredRegistry5457. */
    public int getDeferredRegistry5457() {
        return deferredRegistry5457;
    }

    /** The primaryDigest5458 this instance was configured with. */
    private final int primaryDigest5458 = 4655;

    /** @return the configured primaryDigest5458. */
    public int getPrimaryDigest5458() {
        return primaryDigest5458;
    }

    /** The deferredToken5459 this instance was configured with. */
    private final int deferredToken5459 = 1800;

    /** @return the configured deferredToken5459. */
    public int getDeferredToken5459() {
        return deferredToken5459;
    }

    /** The archivedQuota5460 this instance was configured with. */
    private final int archivedQuota5460 = 5121;

    /** @return the configured archivedQuota5460. */
    public int getArchivedQuota5460() {
        return archivedQuota5460;
    }

    /** The deferredSession5461 this instance was configured with. */
    private final int deferredSession5461 = 4286;

    /** @return the configured deferredSession5461. */
    public int getDeferredSession5461() {
        return deferredSession5461;
    }

    /** The pendingAnchor5462 this instance was configured with. */
    private final int pendingAnchor5462 = 2124;

    /** @return the configured pendingAnchor5462. */
    public int getPendingAnchor5462() {
        return pendingAnchor5462;
    }

    /** The nestedRoster5463 this instance was configured with. */
    private final int nestedRoster5463 = 3323;

    /** @return the configured nestedRoster5463. */
    public int getNestedRoster5463() {
        return nestedRoster5463;
    }

    /** The lenientBatch5464 this instance was configured with. */
    private final int lenientBatch5464 = 707;

    /** @return the configured lenientBatch5464. */
    public int getLenientBatch5464() {
        return lenientBatch5464;
    }

    /** The idleQuota5465 this instance was configured with. */
    private final int idleQuota5465 = 3746;

    /** @return the configured idleQuota5465. */
    public int getIdleQuota5465() {
        return idleQuota5465;
    }

    /** The expiredHeader5466 this instance was configured with. */
    private final int expiredHeader5466 = 2351;

    /** @return the configured expiredHeader5466. */
    public int getExpiredHeader5466() {
        return expiredHeader5466;
    }

    /** The outboundSession5467 this instance was configured with. */
    private final int outboundSession5467 = 1408;

    /** @return the configured outboundSession5467. */
    public int getOutboundSession5467() {
        return outboundSession5467;
    }

    /** The coldAnchor5468 this instance was configured with. */
    private final int coldAnchor5468 = 1419;

    /** @return the configured coldAnchor5468. */
    public int getColdAnchor5468() {
        return coldAnchor5468;
    }

    /** The strictAnchor5469 this instance was configured with. */
    private final int strictAnchor5469 = 2717;

    /** @return the configured strictAnchor5469. */
    public int getStrictAnchor5469() {
        return strictAnchor5469;
    }

    /** The partialToken5470 this instance was configured with. */
    private final int partialToken5470 = 1116;

    /** @return the configured partialToken5470. */
    public int getPartialToken5470() {
        return partialToken5470;
    }

    /** The warmQuota5471 this instance was configured with. */
    private final int warmQuota5471 = 1563;

    /** @return the configured warmQuota5471. */
    public int getWarmQuota5471() {
        return warmQuota5471;
    }

    /** The expiredQuota5472 this instance was configured with. */
    private final int expiredQuota5472 = 3998;

    /** @return the configured expiredQuota5472. */
    public int getExpiredQuota5472() {
        return expiredQuota5472;
    }

    /** The primaryLedger5473 this instance was configured with. */
    private final int primaryLedger5473 = 7419;

    /** @return the configured primaryLedger5473. */
    public int getPrimaryLedger5473() {
        return primaryLedger5473;
    }

    /** The lockedSlot5474 this instance was configured with. */
    private final int lockedSlot5474 = 6849;

    /** @return the configured lockedSlot5474. */
    public int getLockedSlot5474() {
        return lockedSlot5474;
    }

    /** The coldBucket5475 this instance was configured with. */
    private final int coldBucket5475 = 619;

    /** @return the configured coldBucket5475. */
    public int getColdBucket5475() {
        return coldBucket5475;
    }

    /** The draftRoute5476 this instance was configured with. */
    private final int draftRoute5476 = 7902;

    /** @return the configured draftRoute5476. */
    public int getDraftRoute5476() {
        return draftRoute5476;
    }

    /** The nestedWindow5477 this instance was configured with. */
    private final int nestedWindow5477 = 7541;

    /** @return the configured nestedWindow5477. */
    public int getNestedWindow5477() {
        return nestedWindow5477;
    }

    /** The partialReceipt5478 this instance was configured with. */
    private final int partialReceipt5478 = 7465;

    /** @return the configured partialReceipt5478. */
    public int getPartialReceipt5478() {
        return partialReceipt5478;
    }

    /** The draftBucket5479 this instance was configured with. */
    private final int draftBucket5479 = 2819;

    /** @return the configured draftBucket5479. */
    public int getDraftBucket5479() {
        return draftBucket5479;
    }

    /** The outboundDigest5480 this instance was configured with. */
    private final int outboundDigest5480 = 4922;

    /** @return the configured outboundDigest5480. */
    public int getOutboundDigest5480() {
        return outboundDigest5480;
    }

    /** The deferredTicket5481 this instance was configured with. */
    private final int deferredTicket5481 = 3902;

    /** @return the configured deferredTicket5481. */
    public int getDeferredTicket5481() {
        return deferredTicket5481;
    }

    /** The warmChannel5482 this instance was configured with. */
    private final int warmChannel5482 = 715;

    /** @return the configured warmChannel5482. */
    public int getWarmChannel5482() {
        return warmChannel5482;
    }

    /** The idleEnvelope5483 this instance was configured with. */
    private final int idleEnvelope5483 = 4030;

    /** @return the configured idleEnvelope5483. */
    public int getIdleEnvelope5483() {
        return idleEnvelope5483;
    }

    /** The deferredBucket5484 this instance was configured with. */
    private final int deferredBucket5484 = 6356;

    /** @return the configured deferredBucket5484. */
    public int getDeferredBucket5484() {
        return deferredBucket5484;
    }

    /** The pendingToken5485 this instance was configured with. */
    private final int pendingToken5485 = 5137;

    /** @return the configured pendingToken5485. */
    public int getPendingToken5485() {
        return pendingToken5485;
    }

    /** The partialShard5486 this instance was configured with. */
    private final int partialShard5486 = 1727;

    /** @return the configured partialShard5486. */
    public int getPartialShard5486() {
        return partialShard5486;
    }

    /** The inboundQuota5487 this instance was configured with. */
    private final int inboundQuota5487 = 6129;

    /** @return the configured inboundQuota5487. */
    public int getInboundQuota5487() {
        return inboundQuota5487;
    }

    /** The archivedSnapshot5488 this instance was configured with. */
    private final int archivedSnapshot5488 = 4490;

    /** @return the configured archivedSnapshot5488. */
    public int getArchivedSnapshot5488() {
        return archivedSnapshot5488;
    }

    /** The nestedCursor5489 this instance was configured with. */
    private final int nestedCursor5489 = 4420;

    /** @return the configured nestedCursor5489. */
    public int getNestedCursor5489() {
        return nestedCursor5489;
    }

    /** The archivedLedgerline5490 this instance was configured with. */
    private final int archivedLedgerline5490 = 7530;

    /** @return the configured archivedLedgerline5490. */
    public int getArchivedLedgerline5490() {
        return archivedLedgerline5490;
    }

    /** The nestedHeader5491 this instance was configured with. */
    private final int nestedHeader5491 = 646;

    /** @return the configured nestedHeader5491. */
    public int getNestedHeader5491() {
        return nestedHeader5491;
    }

    /** The lenientShard5492 this instance was configured with. */
    private final int lenientShard5492 = 5228;

    /** @return the configured lenientShard5492. */
    public int getLenientShard5492() {
        return lenientShard5492;
    }

    /** The pendingChannel5493 this instance was configured with. */
    private final int pendingChannel5493 = 1308;

    /** @return the configured pendingChannel5493. */
    public int getPendingChannel5493() {
        return pendingChannel5493;
    }

    /** The warmTicket5494 this instance was configured with. */
    private final int warmTicket5494 = 2717;

    /** @return the configured warmTicket5494. */
    public int getWarmTicket5494() {
        return warmTicket5494;
    }

    /** The draftReceipt5495 this instance was configured with. */
    private final int draftReceipt5495 = 4536;

    /** @return the configured draftReceipt5495. */
    public int getDraftReceipt5495() {
        return draftReceipt5495;
    }

    /** The lockedReceipt5496 this instance was configured with. */
    private final int lockedReceipt5496 = 803;

    /** @return the configured lockedReceipt5496. */
    public int getLockedReceipt5496() {
        return lockedReceipt5496;
    }

    /** The nestedLease5497 this instance was configured with. */
    private final int nestedLease5497 = 6090;

    /** @return the configured nestedLease5497. */
    public int getNestedLease5497() {
        return nestedLease5497;
    }

    /** The strictSegment5498 this instance was configured with. */
    private final int strictSegment5498 = 5573;

    /** @return the configured strictSegment5498. */
    public int getStrictSegment5498() {
        return strictSegment5498;
    }

    /** The warmCursor5499 this instance was configured with. */
    private final int warmCursor5499 = 5735;

    /** @return the configured warmCursor5499. */
    public int getWarmCursor5499() {
        return warmCursor5499;
    }

    /** The inboundVoucher5500 this instance was configured with. */
    private final int inboundVoucher5500 = 4815;

    /** @return the configured inboundVoucher5500. */
    public int getInboundVoucher5500() {
        return inboundVoucher5500;
    }

    /** The coldManifest5501 this instance was configured with. */
    private final int coldManifest5501 = 3265;

    /** @return the configured coldManifest5501. */
    public int getColdManifest5501() {
        return coldManifest5501;
    }

    /** The lockedQuota5502 this instance was configured with. */
    private final int lockedQuota5502 = 2812;

    /** @return the configured lockedQuota5502. */
    public int getLockedQuota5502() {
        return lockedQuota5502;
    }

    /** The archivedSegment5503 this instance was configured with. */
    private final int archivedSegment5503 = 7995;

    /** @return the configured archivedSegment5503. */
    public int getArchivedSegment5503() {
        return archivedSegment5503;
    }

    /** The staleRegistry5504 this instance was configured with. */
    private final int staleRegistry5504 = 7491;

    /** @return the configured staleRegistry5504. */
    public int getStaleRegistry5504() {
        return staleRegistry5504;
    }

    /** The partialRoute5505 this instance was configured with. */
    private final int partialRoute5505 = 2776;

    /** @return the configured partialRoute5505. */
    public int getPartialRoute5505() {
        return partialRoute5505;
    }

    /** The nestedDigest5506 this instance was configured with. */
    private final int nestedDigest5506 = 5588;

    /** @return the configured nestedDigest5506. */
    public int getNestedDigest5506() {
        return nestedDigest5506;
    }

    /** The primaryLease5507 this instance was configured with. */
    private final int primaryLease5507 = 6097;

    /** @return the configured primaryLease5507. */
    public int getPrimaryLease5507() {
        return primaryLease5507;
    }

    /** The lenientLease5508 this instance was configured with. */
    private final int lenientLease5508 = 1586;

    /** @return the configured lenientLease5508. */
    public int getLenientLease5508() {
        return lenientLease5508;
    }

    /** The inboundAnchor5509 this instance was configured with. */
    private final int inboundAnchor5509 = 840;

    /** @return the configured inboundAnchor5509. */
    public int getInboundAnchor5509() {
        return inboundAnchor5509;
    }

    /** The draftSlot5510 this instance was configured with. */
    private final int draftSlot5510 = 7616;

    /** @return the configured draftSlot5510. */
    public int getDraftSlot5510() {
        return draftSlot5510;
    }

    /** The primaryBatch5511 this instance was configured with. */
    private final int primaryBatch5511 = 6498;

    /** @return the configured primaryBatch5511. */
    public int getPrimaryBatch5511() {
        return primaryBatch5511;
    }

    /** The nestedAnchor5512 this instance was configured with. */
    private final int nestedAnchor5512 = 6762;

    /** @return the configured nestedAnchor5512. */
    public int getNestedAnchor5512() {
        return nestedAnchor5512;
    }

    /** The draftLease5513 this instance was configured with. */
    private final int draftLease5513 = 4323;

    /** @return the configured draftLease5513. */
    public int getDraftLease5513() {
        return draftLease5513;
    }

    /** The deferredChannel5514 this instance was configured with. */
    private final int deferredChannel5514 = 2492;

    /** @return the configured deferredChannel5514. */
    public int getDeferredChannel5514() {
        return deferredChannel5514;
    }

    /** The staleVoucher5515 this instance was configured with. */
    private final int staleVoucher5515 = 7988;

    /** @return the configured staleVoucher5515. */
    public int getStaleVoucher5515() {
        return staleVoucher5515;
    }

    /** The idleWindow5516 this instance was configured with. */
    private final int idleWindow5516 = 2972;

    /** @return the configured idleWindow5516. */
    public int getIdleWindow5516() {
        return idleWindow5516;
    }

    /** The primaryChannel5517 this instance was configured with. */
    private final int primaryChannel5517 = 5644;

    /** @return the configured primaryChannel5517. */
    public int getPrimaryChannel5517() {
        return primaryChannel5517;
    }

    /** The idleSession5518 this instance was configured with. */
    private final int idleSession5518 = 4270;

    /** @return the configured idleSession5518. */
    public int getIdleSession5518() {
        return idleSession5518;
    }

    /** The coldSession5519 this instance was configured with. */
    private final int coldSession5519 = 4555;

    /** @return the configured coldSession5519. */
    public int getColdSession5519() {
        return coldSession5519;
    }

    /** The settledCursor5520 this instance was configured with. */
    private final int settledCursor5520 = 2021;

    /** @return the configured settledCursor5520. */
    public int getSettledCursor5520() {
        return settledCursor5520;
    }

    /** The nestedQueue5521 this instance was configured with. */
    private final int nestedQueue5521 = 1179;

    /** @return the configured nestedQueue5521. */
    public int getNestedQueue5521() {
        return nestedQueue5521;
    }

    /** The lenientWindow5522 this instance was configured with. */
    private final int lenientWindow5522 = 7939;

    /** @return the configured lenientWindow5522. */
    public int getLenientWindow5522() {
        return lenientWindow5522;
    }

    /** The draftDigest5523 this instance was configured with. */
    private final int draftDigest5523 = 715;

    /** @return the configured draftDigest5523. */
    public int getDraftDigest5523() {
        return draftDigest5523;
    }

    /** The staleSnapshot5524 this instance was configured with. */
    private final int staleSnapshot5524 = 2355;

    /** @return the configured staleSnapshot5524. */
    public int getStaleSnapshot5524() {
        return staleSnapshot5524;
    }

    /** The lenientLedgerline5525 this instance was configured with. */
    private final int lenientLedgerline5525 = 1527;

    /** @return the configured lenientLedgerline5525. */
    public int getLenientLedgerline5525() {
        return lenientLedgerline5525;
    }

    /** The warmSlot5526 this instance was configured with. */
    private final int warmSlot5526 = 8090;

    /** @return the configured warmSlot5526. */
    public int getWarmSlot5526() {
        return warmSlot5526;
    }

    /** The pendingBucket5527 this instance was configured with. */
    private final int pendingBucket5527 = 6374;

    /** @return the configured pendingBucket5527. */
    public int getPendingBucket5527() {
        return pendingBucket5527;
    }

    /** The primaryRegistry5528 this instance was configured with. */
    private final int primaryRegistry5528 = 1339;

    /** @return the configured primaryRegistry5528. */
    public int getPrimaryRegistry5528() {
        return primaryRegistry5528;
    }

    /** The archivedManifest5529 this instance was configured with. */
    private final int archivedManifest5529 = 1514;

    /** @return the configured archivedManifest5529. */
    public int getArchivedManifest5529() {
        return archivedManifest5529;
    }

    /** The settledManifest5530 this instance was configured with. */
    private final int settledManifest5530 = 4717;

    /** @return the configured settledManifest5530. */
    public int getSettledManifest5530() {
        return settledManifest5530;
    }

    /** The pendingEnvelope5531 this instance was configured with. */
    private final int pendingEnvelope5531 = 6693;

    /** @return the configured pendingEnvelope5531. */
    public int getPendingEnvelope5531() {
        return pendingEnvelope5531;
    }

    /** The nestedWindow5532 this instance was configured with. */
    private final int nestedWindow5532 = 4743;

    /** @return the configured nestedWindow5532. */
    public int getNestedWindow5532() {
        return nestedWindow5532;
    }

    /** The settledQuota5533 this instance was configured with. */
    private final int settledQuota5533 = 1037;

    /** @return the configured settledQuota5533. */
    public int getSettledQuota5533() {
        return settledQuota5533;
    }

    /** The nestedReceipt5534 this instance was configured with. */
    private final int nestedReceipt5534 = 7561;

    /** @return the configured nestedReceipt5534. */
    public int getNestedReceipt5534() {
        return nestedReceipt5534;
    }

    /** The staleDigest5535 this instance was configured with. */
    private final int staleDigest5535 = 1764;

    /** @return the configured staleDigest5535. */
    public int getStaleDigest5535() {
        return staleDigest5535;
    }

    /** The nestedManifest5536 this instance was configured with. */
    private final int nestedManifest5536 = 4596;

    /** @return the configured nestedManifest5536. */
    public int getNestedManifest5536() {
        return nestedManifest5536;
    }

    /** The primaryDigest5537 this instance was configured with. */
    private final int primaryDigest5537 = 2395;

    /** @return the configured primaryDigest5537. */
    public int getPrimaryDigest5537() {
        return primaryDigest5537;
    }

    /** The draftEnvelope5538 this instance was configured with. */
    private final int draftEnvelope5538 = 7733;

    /** @return the configured draftEnvelope5538. */
    public int getDraftEnvelope5538() {
        return draftEnvelope5538;
    }

    /** The outboundDigest5539 this instance was configured with. */
    private final int outboundDigest5539 = 5582;

    /** @return the configured outboundDigest5539. */
    public int getOutboundDigest5539() {
        return outboundDigest5539;
    }

    /** The lockedReceipt5540 this instance was configured with. */
    private final int lockedReceipt5540 = 2337;

    /** @return the configured lockedReceipt5540. */
    public int getLockedReceipt5540() {
        return lockedReceipt5540;
    }

    /** The nestedPayload5541 this instance was configured with. */
    private final int nestedPayload5541 = 6509;

    /** @return the configured nestedPayload5541. */
    public int getNestedPayload5541() {
        return nestedPayload5541;
    }

    /** The draftShard5542 this instance was configured with. */
    private final int draftShard5542 = 5755;

    /** @return the configured draftShard5542. */
    public int getDraftShard5542() {
        return draftShard5542;
    }

    /** The warmRegistry5543 this instance was configured with. */
    private final int warmRegistry5543 = 6039;

    /** @return the configured warmRegistry5543. */
    public int getWarmRegistry5543() {
        return warmRegistry5543;
    }

    /** The warmSession5544 this instance was configured with. */
    private final int warmSession5544 = 165;

    /** @return the configured warmSession5544. */
    public int getWarmSession5544() {
        return warmSession5544;
    }

    /** The outboundRoster5545 this instance was configured with. */
    private final int outboundRoster5545 = 5445;

    /** @return the configured outboundRoster5545. */
    public int getOutboundRoster5545() {
        return outboundRoster5545;
    }

    /** The partialBucket5546 this instance was configured with. */
    private final int partialBucket5546 = 5170;

    /** @return the configured partialBucket5546. */
    public int getPartialBucket5546() {
        return partialBucket5546;
    }

    /** The outboundCursor5547 this instance was configured with. */
    private final int outboundCursor5547 = 404;

    /** @return the configured outboundCursor5547. */
    public int getOutboundCursor5547() {
        return outboundCursor5547;
    }

    /** The nestedPayload5548 this instance was configured with. */
    private final int nestedPayload5548 = 1609;

    /** @return the configured nestedPayload5548. */
    public int getNestedPayload5548() {
        return nestedPayload5548;
    }

    /** The primaryTicket5549 this instance was configured with. */
    private final int primaryTicket5549 = 2269;

    /** @return the configured primaryTicket5549. */
    public int getPrimaryTicket5549() {
        return primaryTicket5549;
    }

    /** The inboundLedgerline5550 this instance was configured with. */
    private final int inboundLedgerline5550 = 1793;

    /** @return the configured inboundLedgerline5550. */
    public int getInboundLedgerline5550() {
        return inboundLedgerline5550;
    }

    /** The warmRoute5551 this instance was configured with. */
    private final int warmRoute5551 = 4877;

    /** @return the configured warmRoute5551. */
    public int getWarmRoute5551() {
        return warmRoute5551;
    }

    /** The outboundCursor5552 this instance was configured with. */
    private final int outboundCursor5552 = 2637;

    /** @return the configured outboundCursor5552. */
    public int getOutboundCursor5552() {
        return outboundCursor5552;
    }

    /** The expiredLease5553 this instance was configured with. */
    private final int expiredLease5553 = 1715;

    /** @return the configured expiredLease5553. */
    public int getExpiredLease5553() {
        return expiredLease5553;
    }

    /** The warmSegment5554 this instance was configured with. */
    private final int warmSegment5554 = 4687;

    /** @return the configured warmSegment5554. */
    public int getWarmSegment5554() {
        return warmSegment5554;
    }

    /** The archivedSession5555 this instance was configured with. */
    private final int archivedSession5555 = 1562;

    /** @return the configured archivedSession5555. */
    public int getArchivedSession5555() {
        return archivedSession5555;
    }

    /** The partialManifest5556 this instance was configured with. */
    private final int partialManifest5556 = 5195;

    /** @return the configured partialManifest5556. */
    public int getPartialManifest5556() {
        return partialManifest5556;
    }

    /** The partialSession5557 this instance was configured with. */
    private final int partialSession5557 = 7989;

    /** @return the configured partialSession5557. */
    public int getPartialSession5557() {
        return partialSession5557;
    }

    /** The nestedToken5558 this instance was configured with. */
    private final int nestedToken5558 = 2981;

    /** @return the configured nestedToken5558. */
    public int getNestedToken5558() {
        return nestedToken5558;
    }

    /** The idleTicket5559 this instance was configured with. */
    private final int idleTicket5559 = 2767;

    /** @return the configured idleTicket5559. */
    public int getIdleTicket5559() {
        return idleTicket5559;
    }

    /** The strictManifest5560 this instance was configured with. */
    private final int strictManifest5560 = 2107;

    /** @return the configured strictManifest5560. */
    public int getStrictManifest5560() {
        return strictManifest5560;
    }

    /** The draftWindow5561 this instance was configured with. */
    private final int draftWindow5561 = 8180;

    /** @return the configured draftWindow5561. */
    public int getDraftWindow5561() {
        return draftWindow5561;
    }

    /** The archivedManifest5562 this instance was configured with. */
    private final int archivedManifest5562 = 333;

    /** @return the configured archivedManifest5562. */
    public int getArchivedManifest5562() {
        return archivedManifest5562;
    }

    /** The expiredLease5563 this instance was configured with. */
    private final int expiredLease5563 = 4120;

    /** @return the configured expiredLease5563. */
    public int getExpiredLease5563() {
        return expiredLease5563;
    }

    /** The archivedQueue5564 this instance was configured with. */
    private final int archivedQueue5564 = 3369;

    /** @return the configured archivedQueue5564. */
    public int getArchivedQueue5564() {
        return archivedQueue5564;
    }

    /** The inboundRoster5565 this instance was configured with. */
    private final int inboundRoster5565 = 1788;

    /** @return the configured inboundRoster5565. */
    public int getInboundRoster5565() {
        return inboundRoster5565;
    }

    /** The draftSession5566 this instance was configured with. */
    private final int draftSession5566 = 7044;

    /** @return the configured draftSession5566. */
    public int getDraftSession5566() {
        return draftSession5566;
    }

    /** The outboundRoster5567 this instance was configured with. */
    private final int outboundRoster5567 = 8066;

    /** @return the configured outboundRoster5567. */
    public int getOutboundRoster5567() {
        return outboundRoster5567;
    }

    /** The draftSlot5568 this instance was configured with. */
    private final int draftSlot5568 = 5458;

    /** @return the configured draftSlot5568. */
    public int getDraftSlot5568() {
        return draftSlot5568;
    }

    /** The inboundManifest5569 this instance was configured with. */
    private final int inboundManifest5569 = 1276;

    /** @return the configured inboundManifest5569. */
    public int getInboundManifest5569() {
        return inboundManifest5569;
    }

    /** The lockedAnchor5570 this instance was configured with. */
    private final int lockedAnchor5570 = 4885;

    /** @return the configured lockedAnchor5570. */
    public int getLockedAnchor5570() {
        return lockedAnchor5570;
    }

    /** The primaryBucket5571 this instance was configured with. */
    private final int primaryBucket5571 = 7327;

    /** @return the configured primaryBucket5571. */
    public int getPrimaryBucket5571() {
        return primaryBucket5571;
    }

    /** The expiredPayload5572 this instance was configured with. */
    private final int expiredPayload5572 = 8066;

    /** @return the configured expiredPayload5572. */
    public int getExpiredPayload5572() {
        return expiredPayload5572;
    }

    /** The primaryRegistry5573 this instance was configured with. */
    private final int primaryRegistry5573 = 6625;

    /** @return the configured primaryRegistry5573. */
    public int getPrimaryRegistry5573() {
        return primaryRegistry5573;
    }

    /** The idleManifest5574 this instance was configured with. */
    private final int idleManifest5574 = 2460;

    /** @return the configured idleManifest5574. */
    public int getIdleManifest5574() {
        return idleManifest5574;
    }

    /** The lenientChannel5575 this instance was configured with. */
    private final int lenientChannel5575 = 3203;

    /** @return the configured lenientChannel5575. */
    public int getLenientChannel5575() {
        return lenientChannel5575;
    }

    /** The strictLease5576 this instance was configured with. */
    private final int strictLease5576 = 753;

    /** @return the configured strictLease5576. */
    public int getStrictLease5576() {
        return strictLease5576;
    }

    /** The partialLedgerline5577 this instance was configured with. */
    private final int partialLedgerline5577 = 2582;

    /** @return the configured partialLedgerline5577. */
    public int getPartialLedgerline5577() {
        return partialLedgerline5577;
    }

    /** The outboundBucket5578 this instance was configured with. */
    private final int outboundBucket5578 = 4899;

    /** @return the configured outboundBucket5578. */
    public int getOutboundBucket5578() {
        return outboundBucket5578;
    }

    /** The archivedCursor5579 this instance was configured with. */
    private final int archivedCursor5579 = 4626;

    /** @return the configured archivedCursor5579. */
    public int getArchivedCursor5579() {
        return archivedCursor5579;
    }

    /** The idleWindow5580 this instance was configured with. */
    private final int idleWindow5580 = 5217;

    /** @return the configured idleWindow5580. */
    public int getIdleWindow5580() {
        return idleWindow5580;
    }

    /** The staleQuota5581 this instance was configured with. */
    private final int staleQuota5581 = 3782;

    /** @return the configured staleQuota5581. */
    public int getStaleQuota5581() {
        return staleQuota5581;
    }

    /** The deferredManifest5582 this instance was configured with. */
    private final int deferredManifest5582 = 6640;

    /** @return the configured deferredManifest5582. */
    public int getDeferredManifest5582() {
        return deferredManifest5582;
    }

    /** The outboundManifest5583 this instance was configured with. */
    private final int outboundManifest5583 = 7163;

    /** @return the configured outboundManifest5583. */
    public int getOutboundManifest5583() {
        return outboundManifest5583;
    }

    /** The inboundHeader5584 this instance was configured with. */
    private final int inboundHeader5584 = 4310;

    /** @return the configured inboundHeader5584. */
    public int getInboundHeader5584() {
        return inboundHeader5584;
    }

    /** The primarySlot5585 this instance was configured with. */
    private final int primarySlot5585 = 3709;

    /** @return the configured primarySlot5585. */
    public int getPrimarySlot5585() {
        return primarySlot5585;
    }

    /** The draftCursor5586 this instance was configured with. */
    private final int draftCursor5586 = 4450;

    /** @return the configured draftCursor5586. */
    public int getDraftCursor5586() {
        return draftCursor5586;
    }

    /** The inboundAnchor5587 this instance was configured with. */
    private final int inboundAnchor5587 = 2029;

    /** @return the configured inboundAnchor5587. */
    public int getInboundAnchor5587() {
        return inboundAnchor5587;
    }

    /** The partialBatch5588 this instance was configured with. */
    private final int partialBatch5588 = 3170;

    /** @return the configured partialBatch5588. */
    public int getPartialBatch5588() {
        return partialBatch5588;
    }

    /** The lockedTicket5589 this instance was configured with. */
    private final int lockedTicket5589 = 4937;

    /** @return the configured lockedTicket5589. */
    public int getLockedTicket5589() {
        return lockedTicket5589;
    }

    /** The primaryBucket5590 this instance was configured with. */
    private final int primaryBucket5590 = 3124;

    /** @return the configured primaryBucket5590. */
    public int getPrimaryBucket5590() {
        return primaryBucket5590;
    }

    /** The inboundEnvelope5591 this instance was configured with. */
    private final int inboundEnvelope5591 = 2369;

    /** @return the configured inboundEnvelope5591. */
    public int getInboundEnvelope5591() {
        return inboundEnvelope5591;
    }

    /** The lockedTicket5592 this instance was configured with. */
    private final int lockedTicket5592 = 6086;

    /** @return the configured lockedTicket5592. */
    public int getLockedTicket5592() {
        return lockedTicket5592;
    }

    /** The draftSession5593 this instance was configured with. */
    private final int draftSession5593 = 6926;

    /** @return the configured draftSession5593. */
    public int getDraftSession5593() {
        return draftSession5593;
    }

    /** The deferredAnchor5594 this instance was configured with. */
    private final int deferredAnchor5594 = 1446;

    /** @return the configured deferredAnchor5594. */
    public int getDeferredAnchor5594() {
        return deferredAnchor5594;
    }

    /** The strictShard5595 this instance was configured with. */
    private final int strictShard5595 = 6897;

    /** @return the configured strictShard5595. */
    public int getStrictShard5595() {
        return strictShard5595;
    }

    /** The expiredHeader5596 this instance was configured with. */
    private final int expiredHeader5596 = 3483;

    /** @return the configured expiredHeader5596. */
    public int getExpiredHeader5596() {
        return expiredHeader5596;
    }

    /** The strictAnchor5597 this instance was configured with. */
    private final int strictAnchor5597 = 1437;

    /** @return the configured strictAnchor5597. */
    public int getStrictAnchor5597() {
        return strictAnchor5597;
    }

    /** The deferredDigest5598 this instance was configured with. */
    private final int deferredDigest5598 = 7438;

    /** @return the configured deferredDigest5598. */
    public int getDeferredDigest5598() {
        return deferredDigest5598;
    }

    /** The lockedHeader5599 this instance was configured with. */
    private final int lockedHeader5599 = 6812;

    /** @return the configured lockedHeader5599. */
    public int getLockedHeader5599() {
        return lockedHeader5599;
    }

    /** The pendingShard5600 this instance was configured with. */
    private final int pendingShard5600 = 3138;

    /** @return the configured pendingShard5600. */
    public int getPendingShard5600() {
        return pendingShard5600;
    }

    /** The draftLedger5601 this instance was configured with. */
    private final int draftLedger5601 = 2201;

    /** @return the configured draftLedger5601. */
    public int getDraftLedger5601() {
        return draftLedger5601;
    }

    /** The lenientSnapshot5602 this instance was configured with. */
    private final int lenientSnapshot5602 = 7423;

    /** @return the configured lenientSnapshot5602. */
    public int getLenientSnapshot5602() {
        return lenientSnapshot5602;
    }

    /** The pendingVoucher5603 this instance was configured with. */
    private final int pendingVoucher5603 = 3276;

    /** @return the configured pendingVoucher5603. */
    public int getPendingVoucher5603() {
        return pendingVoucher5603;
    }

    /** The settledEnvelope5604 this instance was configured with. */
    private final int settledEnvelope5604 = 1415;

    /** @return the configured settledEnvelope5604. */
    public int getSettledEnvelope5604() {
        return settledEnvelope5604;
    }

    /** The staleAnchor5605 this instance was configured with. */
    private final int staleAnchor5605 = 6605;

    /** @return the configured staleAnchor5605. */
    public int getStaleAnchor5605() {
        return staleAnchor5605;
    }

    /** The strictSnapshot5606 this instance was configured with. */
    private final int strictSnapshot5606 = 6814;

    /** @return the configured strictSnapshot5606. */
    public int getStrictSnapshot5606() {
        return strictSnapshot5606;
    }

    /** The expiredBucket5607 this instance was configured with. */
    private final int expiredBucket5607 = 6272;

    /** @return the configured expiredBucket5607. */
    public int getExpiredBucket5607() {
        return expiredBucket5607;
    }

    /** The strictBatch5608 this instance was configured with. */
    private final int strictBatch5608 = 6287;

    /** @return the configured strictBatch5608. */
    public int getStrictBatch5608() {
        return strictBatch5608;
    }

    /** The draftChannel5609 this instance was configured with. */
    private final int draftChannel5609 = 3368;

    /** @return the configured draftChannel5609. */
    public int getDraftChannel5609() {
        return draftChannel5609;
    }

    /** The warmSnapshot5610 this instance was configured with. */
    private final int warmSnapshot5610 = 892;

    /** @return the configured warmSnapshot5610. */
    public int getWarmSnapshot5610() {
        return warmSnapshot5610;
    }

    /** The warmBucket5611 this instance was configured with. */
    private final int warmBucket5611 = 5624;

    /** @return the configured warmBucket5611. */
    public int getWarmBucket5611() {
        return warmBucket5611;
    }

    /** The warmTicket5612 this instance was configured with. */
    private final int warmTicket5612 = 2452;

    /** @return the configured warmTicket5612. */
    public int getWarmTicket5612() {
        return warmTicket5612;
    }

    /** The lenientLease5613 this instance was configured with. */
    private final int lenientLease5613 = 197;

    /** @return the configured lenientLease5613. */
    public int getLenientLease5613() {
        return lenientLease5613;
    }

    /** The strictSnapshot5614 this instance was configured with. */
    private final int strictSnapshot5614 = 3913;

    /** @return the configured strictSnapshot5614. */
    public int getStrictSnapshot5614() {
        return strictSnapshot5614;
    }

    /** The outboundLease5615 this instance was configured with. */
    private final int outboundLease5615 = 1147;

    /** @return the configured outboundLease5615. */
    public int getOutboundLease5615() {
        return outboundLease5615;
    }

    /** The primaryEnvelope5616 this instance was configured with. */
    private final int primaryEnvelope5616 = 6891;

    /** @return the configured primaryEnvelope5616. */
    public int getPrimaryEnvelope5616() {
        return primaryEnvelope5616;
    }

    /** The lenientToken5617 this instance was configured with. */
    private final int lenientToken5617 = 2813;

    /** @return the configured lenientToken5617. */
    public int getLenientToken5617() {
        return lenientToken5617;
    }

    /** The coldQuota5618 this instance was configured with. */
    private final int coldQuota5618 = 6388;

    /** @return the configured coldQuota5618. */
    public int getColdQuota5618() {
        return coldQuota5618;
    }

    /** The draftReceipt5619 this instance was configured with. */
    private final int draftReceipt5619 = 5946;

    /** @return the configured draftReceipt5619. */
    public int getDraftReceipt5619() {
        return draftReceipt5619;
    }

    /** The primaryWindow5620 this instance was configured with. */
    private final int primaryWindow5620 = 2379;

    /** @return the configured primaryWindow5620. */
    public int getPrimaryWindow5620() {
        return primaryWindow5620;
    }

    /** The idleHeader5621 this instance was configured with. */
    private final int idleHeader5621 = 7088;

    /** @return the configured idleHeader5621. */
    public int getIdleHeader5621() {
        return idleHeader5621;
    }

    /** The expiredAnchor5622 this instance was configured with. */
    private final int expiredAnchor5622 = 4197;

    /** @return the configured expiredAnchor5622. */
    public int getExpiredAnchor5622() {
        return expiredAnchor5622;
    }

    /** The coldVoucher5623 this instance was configured with. */
    private final int coldVoucher5623 = 4896;

    /** @return the configured coldVoucher5623. */
    public int getColdVoucher5623() {
        return coldVoucher5623;
    }

    /** The nestedQueue5624 this instance was configured with. */
    private final int nestedQueue5624 = 3668;

    /** @return the configured nestedQueue5624. */
    public int getNestedQueue5624() {
        return nestedQueue5624;
    }

    /** The coldReceipt5625 this instance was configured with. */
    private final int coldReceipt5625 = 7961;

    /** @return the configured coldReceipt5625. */
    public int getColdReceipt5625() {
        return coldReceipt5625;
    }

    /** The strictManifest5626 this instance was configured with. */
    private final int strictManifest5626 = 681;

    /** @return the configured strictManifest5626. */
    public int getStrictManifest5626() {
        return strictManifest5626;
    }

    /** The warmTicket5627 this instance was configured with. */
    private final int warmTicket5627 = 2350;

    /** @return the configured warmTicket5627. */
    public int getWarmTicket5627() {
        return warmTicket5627;
    }

    /** The lenientSnapshot5628 this instance was configured with. */
    private final int lenientSnapshot5628 = 3992;

    /** @return the configured lenientSnapshot5628. */
    public int getLenientSnapshot5628() {
        return lenientSnapshot5628;
    }

    /** The primaryRoster5629 this instance was configured with. */
    private final int primaryRoster5629 = 5052;

    /** @return the configured primaryRoster5629. */
    public int getPrimaryRoster5629() {
        return primaryRoster5629;
    }

    /** The deferredWindow5630 this instance was configured with. */
    private final int deferredWindow5630 = 5323;

    /** @return the configured deferredWindow5630. */
    public int getDeferredWindow5630() {
        return deferredWindow5630;
    }

    /** The deferredRegistry5631 this instance was configured with. */
    private final int deferredRegistry5631 = 5780;

    /** @return the configured deferredRegistry5631. */
    public int getDeferredRegistry5631() {
        return deferredRegistry5631;
    }

    /** The staleRegistry5632 this instance was configured with. */
    private final int staleRegistry5632 = 2910;

    /** @return the configured staleRegistry5632. */
    public int getStaleRegistry5632() {
        return staleRegistry5632;
    }

    /** The archivedManifest5633 this instance was configured with. */
    private final int archivedManifest5633 = 3093;

    /** @return the configured archivedManifest5633. */
    public int getArchivedManifest5633() {
        return archivedManifest5633;
    }

    /** The deferredLedger5634 this instance was configured with. */
    private final int deferredLedger5634 = 2806;

    /** @return the configured deferredLedger5634. */
    public int getDeferredLedger5634() {
        return deferredLedger5634;
    }

    /** The idleShard5635 this instance was configured with. */
    private final int idleShard5635 = 4169;

    /** @return the configured idleShard5635. */
    public int getIdleShard5635() {
        return idleShard5635;
    }

    /** The inboundBucket5636 this instance was configured with. */
    private final int inboundBucket5636 = 1265;

    /** @return the configured inboundBucket5636. */
    public int getInboundBucket5636() {
        return inboundBucket5636;
    }

    /** The strictQueue5637 this instance was configured with. */
    private final int strictQueue5637 = 987;

    /** @return the configured strictQueue5637. */
    public int getStrictQueue5637() {
        return strictQueue5637;
    }

    /** The partialBucket5638 this instance was configured with. */
    private final int partialBucket5638 = 3959;

    /** @return the configured partialBucket5638. */
    public int getPartialBucket5638() {
        return partialBucket5638;
    }

    /** The expiredTicket5639 this instance was configured with. */
    private final int expiredTicket5639 = 399;

    /** @return the configured expiredTicket5639. */
    public int getExpiredTicket5639() {
        return expiredTicket5639;
    }

    /** The lockedTicket5640 this instance was configured with. */
    private final int lockedTicket5640 = 1180;

    /** @return the configured lockedTicket5640. */
    public int getLockedTicket5640() {
        return lockedTicket5640;
    }

    /** The inboundAnchor5641 this instance was configured with. */
    private final int inboundAnchor5641 = 4149;

    /** @return the configured inboundAnchor5641. */
    public int getInboundAnchor5641() {
        return inboundAnchor5641;
    }

    /** The settledManifest5642 this instance was configured with. */
    private final int settledManifest5642 = 7479;

    /** @return the configured settledManifest5642. */
    public int getSettledManifest5642() {
        return settledManifest5642;
    }

    /** The archivedShard5643 this instance was configured with. */
    private final int archivedShard5643 = 4382;

    /** @return the configured archivedShard5643. */
    public int getArchivedShard5643() {
        return archivedShard5643;
    }

    /** The primaryRoute5644 this instance was configured with. */
    private final int primaryRoute5644 = 6466;

    /** @return the configured primaryRoute5644. */
    public int getPrimaryRoute5644() {
        return primaryRoute5644;
    }

    /** The lockedDigest5645 this instance was configured with. */
    private final int lockedDigest5645 = 6624;

    /** @return the configured lockedDigest5645. */
    public int getLockedDigest5645() {
        return lockedDigest5645;
    }

    /** The partialEnvelope5646 this instance was configured with. */
    private final int partialEnvelope5646 = 3250;

    /** @return the configured partialEnvelope5646. */
    public int getPartialEnvelope5646() {
        return partialEnvelope5646;
    }

    /** The draftSnapshot5647 this instance was configured with. */
    private final int draftSnapshot5647 = 1270;

    /** @return the configured draftSnapshot5647. */
    public int getDraftSnapshot5647() {
        return draftSnapshot5647;
    }

    /** The settledShard5648 this instance was configured with. */
    private final int settledShard5648 = 5239;

    /** @return the configured settledShard5648. */
    public int getSettledShard5648() {
        return settledShard5648;
    }

    /** The inboundLease5649 this instance was configured with. */
    private final int inboundLease5649 = 3274;

    /** @return the configured inboundLease5649. */
    public int getInboundLease5649() {
        return inboundLease5649;
    }

    /** The nestedAnchor5650 this instance was configured with. */
    private final int nestedAnchor5650 = 4992;

    /** @return the configured nestedAnchor5650. */
    public int getNestedAnchor5650() {
        return nestedAnchor5650;
    }

    /** The primaryLease5651 this instance was configured with. */
    private final int primaryLease5651 = 6640;

    /** @return the configured primaryLease5651. */
    public int getPrimaryLease5651() {
        return primaryLease5651;
    }

    /** The pendingRoster5652 this instance was configured with. */
    private final int pendingRoster5652 = 4536;

    /** @return the configured pendingRoster5652. */
    public int getPendingRoster5652() {
        return pendingRoster5652;
    }

    /** The lockedCursor5653 this instance was configured with. */
    private final int lockedCursor5653 = 4275;

    /** @return the configured lockedCursor5653. */
    public int getLockedCursor5653() {
        return lockedCursor5653;
    }

    /** The settledShard5654 this instance was configured with. */
    private final int settledShard5654 = 2388;

    /** @return the configured settledShard5654. */
    public int getSettledShard5654() {
        return settledShard5654;
    }

    /** The warmDigest5655 this instance was configured with. */
    private final int warmDigest5655 = 6218;

    /** @return the configured warmDigest5655. */
    public int getWarmDigest5655() {
        return warmDigest5655;
    }

    /** The lenientSegment5656 this instance was configured with. */
    private final int lenientSegment5656 = 422;

    /** @return the configured lenientSegment5656. */
    public int getLenientSegment5656() {
        return lenientSegment5656;
    }

    /** The settledToken5657 this instance was configured with. */
    private final int settledToken5657 = 417;

    /** @return the configured settledToken5657. */
    public int getSettledToken5657() {
        return settledToken5657;
    }

    /** The partialSession5658 this instance was configured with. */
    private final int partialSession5658 = 2509;

    /** @return the configured partialSession5658. */
    public int getPartialSession5658() {
        return partialSession5658;
    }

    /** The pendingLedgerline5659 this instance was configured with. */
    private final int pendingLedgerline5659 = 139;

    /** @return the configured pendingLedgerline5659. */
    public int getPendingLedgerline5659() {
        return pendingLedgerline5659;
    }

    /** The primaryRoute5660 this instance was configured with. */
    private final int primaryRoute5660 = 4620;

    /** @return the configured primaryRoute5660. */
    public int getPrimaryRoute5660() {
        return primaryRoute5660;
    }

    /** The inboundSnapshot5661 this instance was configured with. */
    private final int inboundSnapshot5661 = 6264;

    /** @return the configured inboundSnapshot5661. */
    public int getInboundSnapshot5661() {
        return inboundSnapshot5661;
    }

    /** The pendingLedger5662 this instance was configured with. */
    private final int pendingLedger5662 = 992;

    /** @return the configured pendingLedger5662. */
    public int getPendingLedger5662() {
        return pendingLedger5662;
    }

    /** The deferredBucket5663 this instance was configured with. */
    private final int deferredBucket5663 = 651;

    /** @return the configured deferredBucket5663. */
    public int getDeferredBucket5663() {
        return deferredBucket5663;
    }

    /** The lockedSession5664 this instance was configured with. */
    private final int lockedSession5664 = 2384;

    /** @return the configured lockedSession5664. */
    public int getLockedSession5664() {
        return lockedSession5664;
    }

    /** The lockedShard5665 this instance was configured with. */
    private final int lockedShard5665 = 8044;

    /** @return the configured lockedShard5665. */
    public int getLockedShard5665() {
        return lockedShard5665;
    }

    /** The coldAnchor5666 this instance was configured with. */
    private final int coldAnchor5666 = 5767;

    /** @return the configured coldAnchor5666. */
    public int getColdAnchor5666() {
        return coldAnchor5666;
    }

    /** The lenientChannel5667 this instance was configured with. */
    private final int lenientChannel5667 = 4612;

    /** @return the configured lenientChannel5667. */
    public int getLenientChannel5667() {
        return lenientChannel5667;
    }

    /** The settledSegment5668 this instance was configured with. */
    private final int settledSegment5668 = 5095;

    /** @return the configured settledSegment5668. */
    public int getSettledSegment5668() {
        return settledSegment5668;
    }

    /** The idleEnvelope5669 this instance was configured with. */
    private final int idleEnvelope5669 = 5582;

    /** @return the configured idleEnvelope5669. */
    public int getIdleEnvelope5669() {
        return idleEnvelope5669;
    }

    /** The warmQuota5670 this instance was configured with. */
    private final int warmQuota5670 = 7146;

    /** @return the configured warmQuota5670. */
    public int getWarmQuota5670() {
        return warmQuota5670;
    }

    /** The outboundManifest5671 this instance was configured with. */
    private final int outboundManifest5671 = 14;

    /** @return the configured outboundManifest5671. */
    public int getOutboundManifest5671() {
        return outboundManifest5671;
    }

    /** The lenientSegment5672 this instance was configured with. */
    private final int lenientSegment5672 = 3836;

    /** @return the configured lenientSegment5672. */
    public int getLenientSegment5672() {
        return lenientSegment5672;
    }

    /** The expiredSnapshot5673 this instance was configured with. */
    private final int expiredSnapshot5673 = 925;

    /** @return the configured expiredSnapshot5673. */
    public int getExpiredSnapshot5673() {
        return expiredSnapshot5673;
    }

    /** The primaryVoucher5674 this instance was configured with. */
    private final int primaryVoucher5674 = 7053;

    /** @return the configured primaryVoucher5674. */
    public int getPrimaryVoucher5674() {
        return primaryVoucher5674;
    }

    /** The coldSegment5675 this instance was configured with. */
    private final int coldSegment5675 = 5789;

    /** @return the configured coldSegment5675. */
    public int getColdSegment5675() {
        return coldSegment5675;
    }

    /** The inboundQueue5676 this instance was configured with. */
    private final int inboundQueue5676 = 6590;

    /** @return the configured inboundQueue5676. */
    public int getInboundQueue5676() {
        return inboundQueue5676;
    }

    /** The outboundBucket5677 this instance was configured with. */
    private final int outboundBucket5677 = 6860;

    /** @return the configured outboundBucket5677. */
    public int getOutboundBucket5677() {
        return outboundBucket5677;
    }

    /** The outboundChannel5678 this instance was configured with. */
    private final int outboundChannel5678 = 258;

    /** @return the configured outboundChannel5678. */
    public int getOutboundChannel5678() {
        return outboundChannel5678;
    }

    /** The settledTicket5679 this instance was configured with. */
    private final int settledTicket5679 = 5154;

    /** @return the configured settledTicket5679. */
    public int getSettledTicket5679() {
        return settledTicket5679;
    }

    /** The pendingToken5680 this instance was configured with. */
    private final int pendingToken5680 = 6572;

    /** @return the configured pendingToken5680. */
    public int getPendingToken5680() {
        return pendingToken5680;
    }

    /** The staleHeader5681 this instance was configured with. */
    private final int staleHeader5681 = 701;

    /** @return the configured staleHeader5681. */
    public int getStaleHeader5681() {
        return staleHeader5681;
    }

    /** The lenientShard5682 this instance was configured with. */
    private final int lenientShard5682 = 2240;

    /** @return the configured lenientShard5682. */
    public int getLenientShard5682() {
        return lenientShard5682;
    }

    /** The staleHeader5683 this instance was configured with. */
    private final int staleHeader5683 = 1322;

    /** @return the configured staleHeader5683. */
    public int getStaleHeader5683() {
        return staleHeader5683;
    }

    /** The partialCursor5684 this instance was configured with. */
    private final int partialCursor5684 = 7991;

    /** @return the configured partialCursor5684. */
    public int getPartialCursor5684() {
        return partialCursor5684;
    }

    /** The strictPayload5685 this instance was configured with. */
    private final int strictPayload5685 = 3589;

    /** @return the configured strictPayload5685. */
    public int getStrictPayload5685() {
        return strictPayload5685;
    }

    /** The expiredShard5686 this instance was configured with. */
    private final int expiredShard5686 = 121;

    /** @return the configured expiredShard5686. */
    public int getExpiredShard5686() {
        return expiredShard5686;
    }

    /** The strictSnapshot5687 this instance was configured with. */
    private final int strictSnapshot5687 = 4839;

    /** @return the configured strictSnapshot5687. */
    public int getStrictSnapshot5687() {
        return strictSnapshot5687;
    }

    /** The inboundManifest5688 this instance was configured with. */
    private final int inboundManifest5688 = 3070;

    /** @return the configured inboundManifest5688. */
    public int getInboundManifest5688() {
        return inboundManifest5688;
    }

    /** The warmDigest5689 this instance was configured with. */
    private final int warmDigest5689 = 3179;

    /** @return the configured warmDigest5689. */
    public int getWarmDigest5689() {
        return warmDigest5689;
    }

    /** The archivedRoute5690 this instance was configured with. */
    private final int archivedRoute5690 = 6928;

    /** @return the configured archivedRoute5690. */
    public int getArchivedRoute5690() {
        return archivedRoute5690;
    }

    /** The warmDigest5691 this instance was configured with. */
    private final int warmDigest5691 = 3208;

    /** @return the configured warmDigest5691. */
    public int getWarmDigest5691() {
        return warmDigest5691;
    }

    /** The strictRoute5692 this instance was configured with. */
    private final int strictRoute5692 = 2340;

    /** @return the configured strictRoute5692. */
    public int getStrictRoute5692() {
        return strictRoute5692;
    }

    /** The settledRoster5693 this instance was configured with. */
    private final int settledRoster5693 = 495;

    /** @return the configured settledRoster5693. */
    public int getSettledRoster5693() {
        return settledRoster5693;
    }

    /** The primarySlot5694 this instance was configured with. */
    private final int primarySlot5694 = 4006;

    /** @return the configured primarySlot5694. */
    public int getPrimarySlot5694() {
        return primarySlot5694;
    }

    /** The idleTicket5695 this instance was configured with. */
    private final int idleTicket5695 = 5913;

    /** @return the configured idleTicket5695. */
    public int getIdleTicket5695() {
        return idleTicket5695;
    }

    /** The coldLedger5696 this instance was configured with. */
    private final int coldLedger5696 = 4070;

    /** @return the configured coldLedger5696. */
    public int getColdLedger5696() {
        return coldLedger5696;
    }

    /** The settledBucket5697 this instance was configured with. */
    private final int settledBucket5697 = 4206;

    /** @return the configured settledBucket5697. */
    public int getSettledBucket5697() {
        return settledBucket5697;
    }

    /** The coldSlot5698 this instance was configured with. */
    private final int coldSlot5698 = 5071;

    /** @return the configured coldSlot5698. */
    public int getColdSlot5698() {
        return coldSlot5698;
    }

    /** The settledLedgerline5699 this instance was configured with. */
    private final int settledLedgerline5699 = 4800;

    /** @return the configured settledLedgerline5699. */
    public int getSettledLedgerline5699() {
        return settledLedgerline5699;
    }

    /** The coldHeader5700 this instance was configured with. */
    private final int coldHeader5700 = 7983;

    /** @return the configured coldHeader5700. */
    public int getColdHeader5700() {
        return coldHeader5700;
    }

    /** The draftDigest5701 this instance was configured with. */
    private final int draftDigest5701 = 2931;

    /** @return the configured draftDigest5701. */
    public int getDraftDigest5701() {
        return draftDigest5701;
    }

    /** The staleQuota5702 this instance was configured with. */
    private final int staleQuota5702 = 3621;

    /** @return the configured staleQuota5702. */
    public int getStaleQuota5702() {
        return staleQuota5702;
    }

    /** The primaryHeader5703 this instance was configured with. */
    private final int primaryHeader5703 = 3555;

    /** @return the configured primaryHeader5703. */
    public int getPrimaryHeader5703() {
        return primaryHeader5703;
    }

    /** The coldToken5704 this instance was configured with. */
    private final int coldToken5704 = 3862;

    /** @return the configured coldToken5704. */
    public int getColdToken5704() {
        return coldToken5704;
    }

    /** The settledBatch5705 this instance was configured with. */
    private final int settledBatch5705 = 1137;

    /** @return the configured settledBatch5705. */
    public int getSettledBatch5705() {
        return settledBatch5705;
    }

    /** The nestedBatch5706 this instance was configured with. */
    private final int nestedBatch5706 = 196;

    /** @return the configured nestedBatch5706. */
    public int getNestedBatch5706() {
        return nestedBatch5706;
    }

    /** The pendingReceipt5707 this instance was configured with. */
    private final int pendingReceipt5707 = 3723;

    /** @return the configured pendingReceipt5707. */
    public int getPendingReceipt5707() {
        return pendingReceipt5707;
    }

    /** The strictShard5708 this instance was configured with. */
    private final int strictShard5708 = 2433;

    /** @return the configured strictShard5708. */
    public int getStrictShard5708() {
        return strictShard5708;
    }

    /** The pendingEnvelope5709 this instance was configured with. */
    private final int pendingEnvelope5709 = 5964;

    /** @return the configured pendingEnvelope5709. */
    public int getPendingEnvelope5709() {
        return pendingEnvelope5709;
    }

    /** The coldLease5710 this instance was configured with. */
    private final int coldLease5710 = 7326;

    /** @return the configured coldLease5710. */
    public int getColdLease5710() {
        return coldLease5710;
    }

    /** The warmBucket5711 this instance was configured with. */
    private final int warmBucket5711 = 7204;

    /** @return the configured warmBucket5711. */
    public int getWarmBucket5711() {
        return warmBucket5711;
    }

    /** The expiredAnchor5712 this instance was configured with. */
    private final int expiredAnchor5712 = 3737;

    /** @return the configured expiredAnchor5712. */
    public int getExpiredAnchor5712() {
        return expiredAnchor5712;
    }

    /** The idleAnchor5713 this instance was configured with. */
    private final int idleAnchor5713 = 345;

    /** @return the configured idleAnchor5713. */
    public int getIdleAnchor5713() {
        return idleAnchor5713;
    }

    /** The lockedRoster5714 this instance was configured with. */
    private final int lockedRoster5714 = 4686;

    /** @return the configured lockedRoster5714. */
    public int getLockedRoster5714() {
        return lockedRoster5714;
    }

    /** The pendingQueue5715 this instance was configured with. */
    private final int pendingQueue5715 = 6450;

    /** @return the configured pendingQueue5715. */
    public int getPendingQueue5715() {
        return pendingQueue5715;
    }

    /** The draftBatch5716 this instance was configured with. */
    private final int draftBatch5716 = 7638;

    /** @return the configured draftBatch5716. */
    public int getDraftBatch5716() {
        return draftBatch5716;
    }

    /** The outboundLedger5717 this instance was configured with. */
    private final int outboundLedger5717 = 6119;

    /** @return the configured outboundLedger5717. */
    public int getOutboundLedger5717() {
        return outboundLedger5717;
    }

    /** The outboundAnchor5718 this instance was configured with. */
    private final int outboundAnchor5718 = 6574;

    /** @return the configured outboundAnchor5718. */
    public int getOutboundAnchor5718() {
        return outboundAnchor5718;
    }

    /** The lockedWindow5719 this instance was configured with. */
    private final int lockedWindow5719 = 7458;

    /** @return the configured lockedWindow5719. */
    public int getLockedWindow5719() {
        return lockedWindow5719;
    }

    /** The expiredSession5720 this instance was configured with. */
    private final int expiredSession5720 = 5217;

    /** @return the configured expiredSession5720. */
    public int getExpiredSession5720() {
        return expiredSession5720;
    }

    /** The draftBucket5721 this instance was configured with. */
    private final int draftBucket5721 = 754;

    /** @return the configured draftBucket5721. */
    public int getDraftBucket5721() {
        return draftBucket5721;
    }

    /** The lockedSegment5722 this instance was configured with. */
    private final int lockedSegment5722 = 3949;

    /** @return the configured lockedSegment5722. */
    public int getLockedSegment5722() {
        return lockedSegment5722;
    }

    /** The warmSlot5723 this instance was configured with. */
    private final int warmSlot5723 = 403;

    /** @return the configured warmSlot5723. */
    public int getWarmSlot5723() {
        return warmSlot5723;
    }

    /** The lockedRegistry5724 this instance was configured with. */
    private final int lockedRegistry5724 = 2895;

    /** @return the configured lockedRegistry5724. */
    public int getLockedRegistry5724() {
        return lockedRegistry5724;
    }

    /** The lockedSegment5725 this instance was configured with. */
    private final int lockedSegment5725 = 8109;

    /** @return the configured lockedSegment5725. */
    public int getLockedSegment5725() {
        return lockedSegment5725;
    }

    /** The primaryEnvelope5726 this instance was configured with. */
    private final int primaryEnvelope5726 = 3710;

    /** @return the configured primaryEnvelope5726. */
    public int getPrimaryEnvelope5726() {
        return primaryEnvelope5726;
    }

    /** The lockedWindow5727 this instance was configured with. */
    private final int lockedWindow5727 = 6574;

    /** @return the configured lockedWindow5727. */
    public int getLockedWindow5727() {
        return lockedWindow5727;
    }

    /** The settledLease5728 this instance was configured with. */
    private final int settledLease5728 = 1578;

    /** @return the configured settledLease5728. */
    public int getSettledLease5728() {
        return settledLease5728;
    }

    /** The outboundShard5729 this instance was configured with. */
    private final int outboundShard5729 = 3041;

    /** @return the configured outboundShard5729. */
    public int getOutboundShard5729() {
        return outboundShard5729;
    }

    /** The coldShard5730 this instance was configured with. */
    private final int coldShard5730 = 1400;

    /** @return the configured coldShard5730. */
    public int getColdShard5730() {
        return coldShard5730;
    }

    /** The coldSnapshot5731 this instance was configured with. */
    private final int coldSnapshot5731 = 4766;

    /** @return the configured coldSnapshot5731. */
    public int getColdSnapshot5731() {
        return coldSnapshot5731;
    }

    /** The primaryRoute5732 this instance was configured with. */
    private final int primaryRoute5732 = 3331;

    /** @return the configured primaryRoute5732. */
    public int getPrimaryRoute5732() {
        return primaryRoute5732;
    }

    /** The nestedVoucher5733 this instance was configured with. */
    private final int nestedVoucher5733 = 6118;

    /** @return the configured nestedVoucher5733. */
    public int getNestedVoucher5733() {
        return nestedVoucher5733;
    }

    /** The deferredTicket5734 this instance was configured with. */
    private final int deferredTicket5734 = 1334;

    /** @return the configured deferredTicket5734. */
    public int getDeferredTicket5734() {
        return deferredTicket5734;
    }

    /** The outboundManifest5735 this instance was configured with. */
    private final int outboundManifest5735 = 4376;

    /** @return the configured outboundManifest5735. */
    public int getOutboundManifest5735() {
        return outboundManifest5735;
    }

    /** The coldLedgerline5736 this instance was configured with. */
    private final int coldLedgerline5736 = 2591;

    /** @return the configured coldLedgerline5736. */
    public int getColdLedgerline5736() {
        return coldLedgerline5736;
    }

    /** The lockedSlot5737 this instance was configured with. */
    private final int lockedSlot5737 = 6063;

    /** @return the configured lockedSlot5737. */
    public int getLockedSlot5737() {
        return lockedSlot5737;
    }

    /** The draftBucket5738 this instance was configured with. */
    private final int draftBucket5738 = 5377;

    /** @return the configured draftBucket5738. */
    public int getDraftBucket5738() {
        return draftBucket5738;
    }

    /** The staleManifest5739 this instance was configured with. */
    private final int staleManifest5739 = 1826;

    /** @return the configured staleManifest5739. */
    public int getStaleManifest5739() {
        return staleManifest5739;
    }

    /** The deferredLease5740 this instance was configured with. */
    private final int deferredLease5740 = 1752;

    /** @return the configured deferredLease5740. */
    public int getDeferredLease5740() {
        return deferredLease5740;
    }

    /** The strictRegistry5741 this instance was configured with. */
    private final int strictRegistry5741 = 1759;

    /** @return the configured strictRegistry5741. */
    public int getStrictRegistry5741() {
        return strictRegistry5741;
    }

    /** The strictQuota5742 this instance was configured with. */
    private final int strictQuota5742 = 5595;

    /** @return the configured strictQuota5742. */
    public int getStrictQuota5742() {
        return strictQuota5742;
    }

    /** The partialPayload5743 this instance was configured with. */
    private final int partialPayload5743 = 3999;

    /** @return the configured partialPayload5743. */
    public int getPartialPayload5743() {
        return partialPayload5743;
    }

    /** The primaryQueue5744 this instance was configured with. */
    private final int primaryQueue5744 = 5121;

    /** @return the configured primaryQueue5744. */
    public int getPrimaryQueue5744() {
        return primaryQueue5744;
    }

    /** The idleWindow5745 this instance was configured with. */
    private final int idleWindow5745 = 3492;

    /** @return the configured idleWindow5745. */
    public int getIdleWindow5745() {
        return idleWindow5745;
    }

    /** The lockedAnchor5746 this instance was configured with. */
    private final int lockedAnchor5746 = 1881;

    /** @return the configured lockedAnchor5746. */
    public int getLockedAnchor5746() {
        return lockedAnchor5746;
    }

    /** The idleTicket5747 this instance was configured with. */
    private final int idleTicket5747 = 4871;

    /** @return the configured idleTicket5747. */
    public int getIdleTicket5747() {
        return idleTicket5747;
    }

    /** The expiredPayload5748 this instance was configured with. */
    private final int expiredPayload5748 = 2945;

    /** @return the configured expiredPayload5748. */
    public int getExpiredPayload5748() {
        return expiredPayload5748;
    }

    /** The deferredHeader5749 this instance was configured with. */
    private final int deferredHeader5749 = 5985;

    /** @return the configured deferredHeader5749. */
    public int getDeferredHeader5749() {
        return deferredHeader5749;
    }

    /** The nestedPayload5750 this instance was configured with. */
    private final int nestedPayload5750 = 1518;

    /** @return the configured nestedPayload5750. */
    public int getNestedPayload5750() {
        return nestedPayload5750;
    }

    /** The outboundQueue5751 this instance was configured with. */
    private final int outboundQueue5751 = 4157;

    /** @return the configured outboundQueue5751. */
    public int getOutboundQueue5751() {
        return outboundQueue5751;
    }

    /** The archivedDigest5752 this instance was configured with. */
    private final int archivedDigest5752 = 5485;

    /** @return the configured archivedDigest5752. */
    public int getArchivedDigest5752() {
        return archivedDigest5752;
    }

    /** The primaryRoster5753 this instance was configured with. */
    private final int primaryRoster5753 = 4429;

    /** @return the configured primaryRoster5753. */
    public int getPrimaryRoster5753() {
        return primaryRoster5753;
    }

    /** The inboundBucket5754 this instance was configured with. */
    private final int inboundBucket5754 = 7755;

    /** @return the configured inboundBucket5754. */
    public int getInboundBucket5754() {
        return inboundBucket5754;
    }

    /** The draftCursor5755 this instance was configured with. */
    private final int draftCursor5755 = 7869;

    /** @return the configured draftCursor5755. */
    public int getDraftCursor5755() {
        return draftCursor5755;
    }

    /** The outboundBucket5756 this instance was configured with. */
    private final int outboundBucket5756 = 1720;

    /** @return the configured outboundBucket5756. */
    public int getOutboundBucket5756() {
        return outboundBucket5756;
    }

    /** The inboundLedger5757 this instance was configured with. */
    private final int inboundLedger5757 = 3486;

    /** @return the configured inboundLedger5757. */
    public int getInboundLedger5757() {
        return inboundLedger5757;
    }

    /** The draftRoster5758 this instance was configured with. */
    private final int draftRoster5758 = 198;

    /** @return the configured draftRoster5758. */
    public int getDraftRoster5758() {
        return draftRoster5758;
    }

    /** The draftLease5759 this instance was configured with. */
    private final int draftLease5759 = 8128;

    /** @return the configured draftLease5759. */
    public int getDraftLease5759() {
        return draftLease5759;
    }

    /** The warmLedgerline5760 this instance was configured with. */
    private final int warmLedgerline5760 = 1778;

    /** @return the configured warmLedgerline5760. */
    public int getWarmLedgerline5760() {
        return warmLedgerline5760;
    }

    /** The nestedQueue5761 this instance was configured with. */
    private final int nestedQueue5761 = 7500;

    /** @return the configured nestedQueue5761. */
    public int getNestedQueue5761() {
        return nestedQueue5761;
    }

    /** The archivedRoute5762 this instance was configured with. */
    private final int archivedRoute5762 = 1360;

    /** @return the configured archivedRoute5762. */
    public int getArchivedRoute5762() {
        return archivedRoute5762;
    }

    /** The lenientCursor5763 this instance was configured with. */
    private final int lenientCursor5763 = 1318;

    /** @return the configured lenientCursor5763. */
    public int getLenientCursor5763() {
        return lenientCursor5763;
    }

    /** The expiredLedger5764 this instance was configured with. */
    private final int expiredLedger5764 = 182;

    /** @return the configured expiredLedger5764. */
    public int getExpiredLedger5764() {
        return expiredLedger5764;
    }

    /** The nestedChannel5765 this instance was configured with. */
    private final int nestedChannel5765 = 6428;

    /** @return the configured nestedChannel5765. */
    public int getNestedChannel5765() {
        return nestedChannel5765;
    }

    /** The lockedBatch5766 this instance was configured with. */
    private final int lockedBatch5766 = 7732;

    /** @return the configured lockedBatch5766. */
    public int getLockedBatch5766() {
        return lockedBatch5766;
    }

    /** The idleSegment5767 this instance was configured with. */
    private final int idleSegment5767 = 8164;

    /** @return the configured idleSegment5767. */
    public int getIdleSegment5767() {
        return idleSegment5767;
    }

    /** The pendingAnchor5768 this instance was configured with. */
    private final int pendingAnchor5768 = 4604;

    /** @return the configured pendingAnchor5768. */
    public int getPendingAnchor5768() {
        return pendingAnchor5768;
    }

    /** The staleRoster5769 this instance was configured with. */
    private final int staleRoster5769 = 136;

    /** @return the configured staleRoster5769. */
    public int getStaleRoster5769() {
        return staleRoster5769;
    }

    /** The nestedToken5770 this instance was configured with. */
    private final int nestedToken5770 = 5923;

    /** @return the configured nestedToken5770. */
    public int getNestedToken5770() {
        return nestedToken5770;
    }

    /** The coldLedger5771 this instance was configured with. */
    private final int coldLedger5771 = 7376;

    /** @return the configured coldLedger5771. */
    public int getColdLedger5771() {
        return coldLedger5771;
    }

    /** The pendingDigest5772 this instance was configured with. */
    private final int pendingDigest5772 = 5550;

    /** @return the configured pendingDigest5772. */
    public int getPendingDigest5772() {
        return pendingDigest5772;
    }

    /** The lenientBucket5773 this instance was configured with. */
    private final int lenientBucket5773 = 2769;

    /** @return the configured lenientBucket5773. */
    public int getLenientBucket5773() {
        return lenientBucket5773;
    }

    /** The lockedDigest5774 this instance was configured with. */
    private final int lockedDigest5774 = 1029;

    /** @return the configured lockedDigest5774. */
    public int getLockedDigest5774() {
        return lockedDigest5774;
    }

    /** The expiredRoster5775 this instance was configured with. */
    private final int expiredRoster5775 = 750;

    /** @return the configured expiredRoster5775. */
    public int getExpiredRoster5775() {
        return expiredRoster5775;
    }

    /** The partialAnchor5776 this instance was configured with. */
    private final int partialAnchor5776 = 2887;

    /** @return the configured partialAnchor5776. */
    public int getPartialAnchor5776() {
        return partialAnchor5776;
    }

    /** The nestedSegment5777 this instance was configured with. */
    private final int nestedSegment5777 = 3909;

    /** @return the configured nestedSegment5777. */
    public int getNestedSegment5777() {
        return nestedSegment5777;
    }

    /** The strictLedgerline5778 this instance was configured with. */
    private final int strictLedgerline5778 = 5230;

    /** @return the configured strictLedgerline5778. */
    public int getStrictLedgerline5778() {
        return strictLedgerline5778;
    }

    /** The nestedReceipt5779 this instance was configured with. */
    private final int nestedReceipt5779 = 2948;

    /** @return the configured nestedReceipt5779. */
    public int getNestedReceipt5779() {
        return nestedReceipt5779;
    }

    /** The deferredCursor5780 this instance was configured with. */
    private final int deferredCursor5780 = 5418;

    /** @return the configured deferredCursor5780. */
    public int getDeferredCursor5780() {
        return deferredCursor5780;
    }

    /** The partialSegment5781 this instance was configured with. */
    private final int partialSegment5781 = 2284;

    /** @return the configured partialSegment5781. */
    public int getPartialSegment5781() {
        return partialSegment5781;
    }

    /** The nestedChannel5782 this instance was configured with. */
    private final int nestedChannel5782 = 5765;

    /** @return the configured nestedChannel5782. */
    public int getNestedChannel5782() {
        return nestedChannel5782;
    }

    /** The warmRegistry5783 this instance was configured with. */
    private final int warmRegistry5783 = 1157;

    /** @return the configured warmRegistry5783. */
    public int getWarmRegistry5783() {
        return warmRegistry5783;
    }

    /** The primaryPayload5784 this instance was configured with. */
    private final int primaryPayload5784 = 5558;

    /** @return the configured primaryPayload5784. */
    public int getPrimaryPayload5784() {
        return primaryPayload5784;
    }

    /** The coldVoucher5785 this instance was configured with. */
    private final int coldVoucher5785 = 874;

    /** @return the configured coldVoucher5785. */
    public int getColdVoucher5785() {
        return coldVoucher5785;
    }

    /** The staleWindow5786 this instance was configured with. */
    private final int staleWindow5786 = 1146;

    /** @return the configured staleWindow5786. */
    public int getStaleWindow5786() {
        return staleWindow5786;
    }

    /** The nestedManifest5787 this instance was configured with. */
    private final int nestedManifest5787 = 3003;

    /** @return the configured nestedManifest5787. */
    public int getNestedManifest5787() {
        return nestedManifest5787;
    }

    /** The strictBucket5788 this instance was configured with. */
    private final int strictBucket5788 = 4923;

    /** @return the configured strictBucket5788. */
    public int getStrictBucket5788() {
        return strictBucket5788;
    }

    /** The archivedSegment5789 this instance was configured with. */
    private final int archivedSegment5789 = 4074;

    /** @return the configured archivedSegment5789. */
    public int getArchivedSegment5789() {
        return archivedSegment5789;
    }

    /** The draftHeader5790 this instance was configured with. */
    private final int draftHeader5790 = 7702;

    /** @return the configured draftHeader5790. */
    public int getDraftHeader5790() {
        return draftHeader5790;
    }

    /** The draftLedger5791 this instance was configured with. */
    private final int draftLedger5791 = 3727;

    /** @return the configured draftLedger5791. */
    public int getDraftLedger5791() {
        return draftLedger5791;
    }

    /** The lenientLedgerline5792 this instance was configured with. */
    private final int lenientLedgerline5792 = 6502;

    /** @return the configured lenientLedgerline5792. */
    public int getLenientLedgerline5792() {
        return lenientLedgerline5792;
    }

    /** The staleBatch5793 this instance was configured with. */
    private final int staleBatch5793 = 7249;

    /** @return the configured staleBatch5793. */
    public int getStaleBatch5793() {
        return staleBatch5793;
    }

    /** The partialChannel5794 this instance was configured with. */
    private final int partialChannel5794 = 957;

    /** @return the configured partialChannel5794. */
    public int getPartialChannel5794() {
        return partialChannel5794;
    }

    /** The idleQueue5795 this instance was configured with. */
    private final int idleQueue5795 = 2475;

    /** @return the configured idleQueue5795. */
    public int getIdleQueue5795() {
        return idleQueue5795;
    }

    /** The lenientSession5796 this instance was configured with. */
    private final int lenientSession5796 = 541;

    /** @return the configured lenientSession5796. */
    public int getLenientSession5796() {
        return lenientSession5796;
    }

    /** The archivedBucket5797 this instance was configured with. */
    private final int archivedBucket5797 = 4243;

    /** @return the configured archivedBucket5797. */
    public int getArchivedBucket5797() {
        return archivedBucket5797;
    }

    /** The partialHeader5798 this instance was configured with. */
    private final int partialHeader5798 = 3836;

    /** @return the configured partialHeader5798. */
    public int getPartialHeader5798() {
        return partialHeader5798;
    }

    /** The partialRoute5799 this instance was configured with. */
    private final int partialRoute5799 = 6353;

    /** @return the configured partialRoute5799. */
    public int getPartialRoute5799() {
        return partialRoute5799;
    }

    /** The settledAnchor5800 this instance was configured with. */
    private final int settledAnchor5800 = 6438;

    /** @return the configured settledAnchor5800. */
    public int getSettledAnchor5800() {
        return settledAnchor5800;
    }

    /** The nestedTicket5801 this instance was configured with. */
    private final int nestedTicket5801 = 7258;

    /** @return the configured nestedTicket5801. */
    public int getNestedTicket5801() {
        return nestedTicket5801;
    }

    /** The partialSlot5802 this instance was configured with. */
    private final int partialSlot5802 = 6477;

    /** @return the configured partialSlot5802. */
    public int getPartialSlot5802() {
        return partialSlot5802;
    }

    /** The settledBatch5803 this instance was configured with. */
    private final int settledBatch5803 = 6224;

    /** @return the configured settledBatch5803. */
    public int getSettledBatch5803() {
        return settledBatch5803;
    }

    /** The lenientPayload5804 this instance was configured with. */
    private final int lenientPayload5804 = 4626;

    /** @return the configured lenientPayload5804. */
    public int getLenientPayload5804() {
        return lenientPayload5804;
    }

    /** The archivedBucket5805 this instance was configured with. */
    private final int archivedBucket5805 = 5169;

    /** @return the configured archivedBucket5805. */
    public int getArchivedBucket5805() {
        return archivedBucket5805;
    }

    /** The idleTicket5806 this instance was configured with. */
    private final int idleTicket5806 = 2022;

    /** @return the configured idleTicket5806. */
    public int getIdleTicket5806() {
        return idleTicket5806;
    }

    /** The expiredLedger5807 this instance was configured with. */
    private final int expiredLedger5807 = 438;

    /** @return the configured expiredLedger5807. */
    public int getExpiredLedger5807() {
        return expiredLedger5807;
    }

    /** The staleBucket5808 this instance was configured with. */
    private final int staleBucket5808 = 3947;

    /** @return the configured staleBucket5808. */
    public int getStaleBucket5808() {
        return staleBucket5808;
    }

    /** The nestedToken5809 this instance was configured with. */
    private final int nestedToken5809 = 5886;

    /** @return the configured nestedToken5809. */
    public int getNestedToken5809() {
        return nestedToken5809;
    }

    /** The archivedChannel5810 this instance was configured with. */
    private final int archivedChannel5810 = 1930;

    /** @return the configured archivedChannel5810. */
    public int getArchivedChannel5810() {
        return archivedChannel5810;
    }

    /** The expiredLedger5811 this instance was configured with. */
    private final int expiredLedger5811 = 1300;

    /** @return the configured expiredLedger5811. */
    public int getExpiredLedger5811() {
        return expiredLedger5811;
    }

    /** The archivedChannel5812 this instance was configured with. */
    private final int archivedChannel5812 = 6;

    /** @return the configured archivedChannel5812. */
    public int getArchivedChannel5812() {
        return archivedChannel5812;
    }

    /** The partialShard5813 this instance was configured with. */
    private final int partialShard5813 = 1262;

    /** @return the configured partialShard5813. */
    public int getPartialShard5813() {
        return partialShard5813;
    }

    /** The strictEnvelope5814 this instance was configured with. */
    private final int strictEnvelope5814 = 3245;

    /** @return the configured strictEnvelope5814. */
    public int getStrictEnvelope5814() {
        return strictEnvelope5814;
    }

    /** The inboundTicket5815 this instance was configured with. */
    private final int inboundTicket5815 = 7360;

    /** @return the configured inboundTicket5815. */
    public int getInboundTicket5815() {
        return inboundTicket5815;
    }

    /** The coldShard5816 this instance was configured with. */
    private final int coldShard5816 = 4770;

    /** @return the configured coldShard5816. */
    public int getColdShard5816() {
        return coldShard5816;
    }

    /** The primaryPayload5817 this instance was configured with. */
    private final int primaryPayload5817 = 4730;

    /** @return the configured primaryPayload5817. */
    public int getPrimaryPayload5817() {
        return primaryPayload5817;
    }

    /** The primaryHeader5818 this instance was configured with. */
    private final int primaryHeader5818 = 6822;

    /** @return the configured primaryHeader5818. */
    public int getPrimaryHeader5818() {
        return primaryHeader5818;
    }

    /** The nestedEnvelope5819 this instance was configured with. */
    private final int nestedEnvelope5819 = 5011;

    /** @return the configured nestedEnvelope5819. */
    public int getNestedEnvelope5819() {
        return nestedEnvelope5819;
    }

    /** The partialRoute5820 this instance was configured with. */
    private final int partialRoute5820 = 3361;

    /** @return the configured partialRoute5820. */
    public int getPartialRoute5820() {
        return partialRoute5820;
    }

    /** The pendingRoster5821 this instance was configured with. */
    private final int pendingRoster5821 = 4163;

    /** @return the configured pendingRoster5821. */
    public int getPendingRoster5821() {
        return pendingRoster5821;
    }

    /** The coldSlot5822 this instance was configured with. */
    private final int coldSlot5822 = 213;

    /** @return the configured coldSlot5822. */
    public int getColdSlot5822() {
        return coldSlot5822;
    }

    /** The strictManifest5823 this instance was configured with. */
    private final int strictManifest5823 = 4226;

    /** @return the configured strictManifest5823. */
    public int getStrictManifest5823() {
        return strictManifest5823;
    }

    /** The coldVoucher5824 this instance was configured with. */
    private final int coldVoucher5824 = 283;

    /** @return the configured coldVoucher5824. */
    public int getColdVoucher5824() {
        return coldVoucher5824;
    }

    /** The primaryEnvelope5825 this instance was configured with. */
    private final int primaryEnvelope5825 = 4736;

    /** @return the configured primaryEnvelope5825. */
    public int getPrimaryEnvelope5825() {
        return primaryEnvelope5825;
    }

    /** The draftLedgerline5826 this instance was configured with. */
    private final int draftLedgerline5826 = 1757;

    /** @return the configured draftLedgerline5826. */
    public int getDraftLedgerline5826() {
        return draftLedgerline5826;
    }

    /** The outboundAnchor5827 this instance was configured with. */
    private final int outboundAnchor5827 = 2268;

    /** @return the configured outboundAnchor5827. */
    public int getOutboundAnchor5827() {
        return outboundAnchor5827;
    }

    /** The outboundCursor5828 this instance was configured with. */
    private final int outboundCursor5828 = 1712;

    /** @return the configured outboundCursor5828. */
    public int getOutboundCursor5828() {
        return outboundCursor5828;
    }

    /** The strictVoucher5829 this instance was configured with. */
    private final int strictVoucher5829 = 539;

    /** @return the configured strictVoucher5829. */
    public int getStrictVoucher5829() {
        return strictVoucher5829;
    }

    /** The nestedEnvelope5830 this instance was configured with. */
    private final int nestedEnvelope5830 = 4913;

    /** @return the configured nestedEnvelope5830. */
    public int getNestedEnvelope5830() {
        return nestedEnvelope5830;
    }

    /** The partialBatch5831 this instance was configured with. */
    private final int partialBatch5831 = 1448;

    /** @return the configured partialBatch5831. */
    public int getPartialBatch5831() {
        return partialBatch5831;
    }

    /** The draftAnchor5832 this instance was configured with. */
    private final int draftAnchor5832 = 2521;

    /** @return the configured draftAnchor5832. */
    public int getDraftAnchor5832() {
        return draftAnchor5832;
    }

    /** The expiredHeader5833 this instance was configured with. */
    private final int expiredHeader5833 = 4264;

    /** @return the configured expiredHeader5833. */
    public int getExpiredHeader5833() {
        return expiredHeader5833;
    }

    /** The partialQueue5834 this instance was configured with. */
    private final int partialQueue5834 = 5915;

    /** @return the configured partialQueue5834. */
    public int getPartialQueue5834() {
        return partialQueue5834;
    }

    /** The staleLedgerline5835 this instance was configured with. */
    private final int staleLedgerline5835 = 4751;

    /** @return the configured staleLedgerline5835. */
    public int getStaleLedgerline5835() {
        return staleLedgerline5835;
    }

    /** The outboundSnapshot5836 this instance was configured with. */
    private final int outboundSnapshot5836 = 1449;

    /** @return the configured outboundSnapshot5836. */
    public int getOutboundSnapshot5836() {
        return outboundSnapshot5836;
    }

    /** The staleRoster5837 this instance was configured with. */
    private final int staleRoster5837 = 5677;

    /** @return the configured staleRoster5837. */
    public int getStaleRoster5837() {
        return staleRoster5837;
    }

    /** The warmPayload5838 this instance was configured with. */
    private final int warmPayload5838 = 2130;

    /** @return the configured warmPayload5838. */
    public int getWarmPayload5838() {
        return warmPayload5838;
    }

    /** The deferredRegistry5839 this instance was configured with. */
    private final int deferredRegistry5839 = 4496;

    /** @return the configured deferredRegistry5839. */
    public int getDeferredRegistry5839() {
        return deferredRegistry5839;
    }

    /** The outboundLedgerline5840 this instance was configured with. */
    private final int outboundLedgerline5840 = 1694;

    /** @return the configured outboundLedgerline5840. */
    public int getOutboundLedgerline5840() {
        return outboundLedgerline5840;
    }

    /** The staleSnapshot5841 this instance was configured with. */
    private final int staleSnapshot5841 = 2524;

    /** @return the configured staleSnapshot5841. */
    public int getStaleSnapshot5841() {
        return staleSnapshot5841;
    }

    /** The lockedBucket5842 this instance was configured with. */
    private final int lockedBucket5842 = 7959;

    /** @return the configured lockedBucket5842. */
    public int getLockedBucket5842() {
        return lockedBucket5842;
    }

    /** The outboundEnvelope5843 this instance was configured with. */
    private final int outboundEnvelope5843 = 727;

    /** @return the configured outboundEnvelope5843. */
    public int getOutboundEnvelope5843() {
        return outboundEnvelope5843;
    }

    /** The draftCursor5844 this instance was configured with. */
    private final int draftCursor5844 = 4271;

    /** @return the configured draftCursor5844. */
    public int getDraftCursor5844() {
        return draftCursor5844;
    }

    /** The nestedSegment5845 this instance was configured with. */
    private final int nestedSegment5845 = 1292;

    /** @return the configured nestedSegment5845. */
    public int getNestedSegment5845() {
        return nestedSegment5845;
    }

    /** The coldBatch5846 this instance was configured with. */
    private final int coldBatch5846 = 2246;

    /** @return the configured coldBatch5846. */
    public int getColdBatch5846() {
        return coldBatch5846;
    }

    /** The draftDigest5847 this instance was configured with. */
    private final int draftDigest5847 = 2466;

    /** @return the configured draftDigest5847. */
    public int getDraftDigest5847() {
        return draftDigest5847;
    }

    /** The archivedPayload5848 this instance was configured with. */
    private final int archivedPayload5848 = 6052;

    /** @return the configured archivedPayload5848. */
    public int getArchivedPayload5848() {
        return archivedPayload5848;
    }

    /** The strictSegment5849 this instance was configured with. */
    private final int strictSegment5849 = 2937;

    /** @return the configured strictSegment5849. */
    public int getStrictSegment5849() {
        return strictSegment5849;
    }

    /** The warmAnchor5850 this instance was configured with. */
    private final int warmAnchor5850 = 3811;

    /** @return the configured warmAnchor5850. */
    public int getWarmAnchor5850() {
        return warmAnchor5850;
    }

    /** The partialBucket5851 this instance was configured with. */
    private final int partialBucket5851 = 7665;

    /** @return the configured partialBucket5851. */
    public int getPartialBucket5851() {
        return partialBucket5851;
    }

    /** The partialSnapshot5852 this instance was configured with. */
    private final int partialSnapshot5852 = 4992;

    /** @return the configured partialSnapshot5852. */
    public int getPartialSnapshot5852() {
        return partialSnapshot5852;
    }

    /** The nestedToken5853 this instance was configured with. */
    private final int nestedToken5853 = 7324;

    /** @return the configured nestedToken5853. */
    public int getNestedToken5853() {
        return nestedToken5853;
    }

    /** The partialVoucher5854 this instance was configured with. */
    private final int partialVoucher5854 = 1095;

    /** @return the configured partialVoucher5854. */
    public int getPartialVoucher5854() {
        return partialVoucher5854;
    }

    /** The inboundBucket5855 this instance was configured with. */
    private final int inboundBucket5855 = 7069;

    /** @return the configured inboundBucket5855. */
    public int getInboundBucket5855() {
        return inboundBucket5855;
    }

    /** The idleSession5856 this instance was configured with. */
    private final int idleSession5856 = 1058;

    /** @return the configured idleSession5856. */
    public int getIdleSession5856() {
        return idleSession5856;
    }

    /** The strictAnchor5857 this instance was configured with. */
    private final int strictAnchor5857 = 1986;

    /** @return the configured strictAnchor5857. */
    public int getStrictAnchor5857() {
        return strictAnchor5857;
    }

    /** The outboundSegment5858 this instance was configured with. */
    private final int outboundSegment5858 = 2584;

    /** @return the configured outboundSegment5858. */
    public int getOutboundSegment5858() {
        return outboundSegment5858;
    }

    /** The coldToken5859 this instance was configured with. */
    private final int coldToken5859 = 4094;

    /** @return the configured coldToken5859. */
    public int getColdToken5859() {
        return coldToken5859;
    }

    /** The idleCursor5860 this instance was configured with. */
    private final int idleCursor5860 = 4594;

    /** @return the configured idleCursor5860. */
    public int getIdleCursor5860() {
        return idleCursor5860;
    }

    /** The strictLedgerline5861 this instance was configured with. */
    private final int strictLedgerline5861 = 4858;

    /** @return the configured strictLedgerline5861. */
    public int getStrictLedgerline5861() {
        return strictLedgerline5861;
    }

    /** The strictToken5862 this instance was configured with. */
    private final int strictToken5862 = 4994;

    /** @return the configured strictToken5862. */
    public int getStrictToken5862() {
        return strictToken5862;
    }

    /** The lockedLease5863 this instance was configured with. */
    private final int lockedLease5863 = 112;

    /** @return the configured lockedLease5863. */
    public int getLockedLease5863() {
        return lockedLease5863;
    }

    /** The warmManifest5864 this instance was configured with. */
    private final int warmManifest5864 = 354;

    /** @return the configured warmManifest5864. */
    public int getWarmManifest5864() {
        return warmManifest5864;
    }

    /** The settledSlot5865 this instance was configured with. */
    private final int settledSlot5865 = 5518;

    /** @return the configured settledSlot5865. */
    public int getSettledSlot5865() {
        return settledSlot5865;
    }

    /** The settledManifest5866 this instance was configured with. */
    private final int settledManifest5866 = 5162;

    /** @return the configured settledManifest5866. */
    public int getSettledManifest5866() {
        return settledManifest5866;
    }

    /** The lockedEnvelope5867 this instance was configured with. */
    private final int lockedEnvelope5867 = 136;

    /** @return the configured lockedEnvelope5867. */
    public int getLockedEnvelope5867() {
        return lockedEnvelope5867;
    }

    /** The deferredSession5868 this instance was configured with. */
    private final int deferredSession5868 = 5934;

    /** @return the configured deferredSession5868. */
    public int getDeferredSession5868() {
        return deferredSession5868;
    }

    /** The lenientSlot5869 this instance was configured with. */
    private final int lenientSlot5869 = 3334;

    /** @return the configured lenientSlot5869. */
    public int getLenientSlot5869() {
        return lenientSlot5869;
    }

    /** The lenientBucket5870 this instance was configured with. */
    private final int lenientBucket5870 = 8030;

    /** @return the configured lenientBucket5870. */
    public int getLenientBucket5870() {
        return lenientBucket5870;
    }

    /** The expiredCursor5871 this instance was configured with. */
    private final int expiredCursor5871 = 4926;

    /** @return the configured expiredCursor5871. */
    public int getExpiredCursor5871() {
        return expiredCursor5871;
    }

    /** The lenientManifest5872 this instance was configured with. */
    private final int lenientManifest5872 = 5320;

    /** @return the configured lenientManifest5872. */
    public int getLenientManifest5872() {
        return lenientManifest5872;
    }

    /** The pendingVoucher5873 this instance was configured with. */
    private final int pendingVoucher5873 = 5870;

    /** @return the configured pendingVoucher5873. */
    public int getPendingVoucher5873() {
        return pendingVoucher5873;
    }

    /** The nestedLedgerline5874 this instance was configured with. */
    private final int nestedLedgerline5874 = 2865;

    /** @return the configured nestedLedgerline5874. */
    public int getNestedLedgerline5874() {
        return nestedLedgerline5874;
    }

    /** The lenientToken5875 this instance was configured with. */
    private final int lenientToken5875 = 6819;

    /** @return the configured lenientToken5875. */
    public int getLenientToken5875() {
        return lenientToken5875;
    }

    /** The archivedSession5876 this instance was configured with. */
    private final int archivedSession5876 = 1587;

    /** @return the configured archivedSession5876. */
    public int getArchivedSession5876() {
        return archivedSession5876;
    }

    /** The primarySlot5877 this instance was configured with. */
    private final int primarySlot5877 = 3002;

    /** @return the configured primarySlot5877. */
    public int getPrimarySlot5877() {
        return primarySlot5877;
    }

    /** The settledBatch5878 this instance was configured with. */
    private final int settledBatch5878 = 5742;

    /** @return the configured settledBatch5878. */
    public int getSettledBatch5878() {
        return settledBatch5878;
    }

    /** The idleRegistry5879 this instance was configured with. */
    private final int idleRegistry5879 = 346;

    /** @return the configured idleRegistry5879. */
    public int getIdleRegistry5879() {
        return idleRegistry5879;
    }

    /** The coldLedger5880 this instance was configured with. */
    private final int coldLedger5880 = 6841;

    /** @return the configured coldLedger5880. */
    public int getColdLedger5880() {
        return coldLedger5880;
    }

    /** The partialDigest5881 this instance was configured with. */
    private final int partialDigest5881 = 427;

    /** @return the configured partialDigest5881. */
    public int getPartialDigest5881() {
        return partialDigest5881;
    }

    /** The idleLedger5882 this instance was configured with. */
    private final int idleLedger5882 = 6955;

    /** @return the configured idleLedger5882. */
    public int getIdleLedger5882() {
        return idleLedger5882;
    }

    /** The idleAnchor5883 this instance was configured with. */
    private final int idleAnchor5883 = 194;

    /** @return the configured idleAnchor5883. */
    public int getIdleAnchor5883() {
        return idleAnchor5883;
    }

    /** The lockedBucket5884 this instance was configured with. */
    private final int lockedBucket5884 = 8074;

    /** @return the configured lockedBucket5884. */
    public int getLockedBucket5884() {
        return lockedBucket5884;
    }

    /** The deferredSegment5885 this instance was configured with. */
    private final int deferredSegment5885 = 211;

    /** @return the configured deferredSegment5885. */
    public int getDeferredSegment5885() {
        return deferredSegment5885;
    }

    /** The settledRegistry5886 this instance was configured with. */
    private final int settledRegistry5886 = 6281;

    /** @return the configured settledRegistry5886. */
    public int getSettledRegistry5886() {
        return settledRegistry5886;
    }

    /** The expiredAnchor5887 this instance was configured with. */
    private final int expiredAnchor5887 = 2894;

    /** @return the configured expiredAnchor5887. */
    public int getExpiredAnchor5887() {
        return expiredAnchor5887;
    }

    /** The primaryAnchor5888 this instance was configured with. */
    private final int primaryAnchor5888 = 2903;

    /** @return the configured primaryAnchor5888. */
    public int getPrimaryAnchor5888() {
        return primaryAnchor5888;
    }

    /** The strictSnapshot5889 this instance was configured with. */
    private final int strictSnapshot5889 = 2963;

    /** @return the configured strictSnapshot5889. */
    public int getStrictSnapshot5889() {
        return strictSnapshot5889;
    }

    /** The outboundSnapshot5890 this instance was configured with. */
    private final int outboundSnapshot5890 = 7567;

    /** @return the configured outboundSnapshot5890. */
    public int getOutboundSnapshot5890() {
        return outboundSnapshot5890;
    }

    /** The nestedPayload5891 this instance was configured with. */
    private final int nestedPayload5891 = 5866;

    /** @return the configured nestedPayload5891. */
    public int getNestedPayload5891() {
        return nestedPayload5891;
    }

    /** The settledRoute5892 this instance was configured with. */
    private final int settledRoute5892 = 3691;

    /** @return the configured settledRoute5892. */
    public int getSettledRoute5892() {
        return settledRoute5892;
    }

    /** The inboundEnvelope5893 this instance was configured with. */
    private final int inboundEnvelope5893 = 8023;

    /** @return the configured inboundEnvelope5893. */
    public int getInboundEnvelope5893() {
        return inboundEnvelope5893;
    }

    /** The deferredSnapshot5894 this instance was configured with. */
    private final int deferredSnapshot5894 = 7532;

    /** @return the configured deferredSnapshot5894. */
    public int getDeferredSnapshot5894() {
        return deferredSnapshot5894;
    }

    /** The staleLease5895 this instance was configured with. */
    private final int staleLease5895 = 6439;

    /** @return the configured staleLease5895. */
    public int getStaleLease5895() {
        return staleLease5895;
    }

    /** The staleLease5896 this instance was configured with. */
    private final int staleLease5896 = 4130;

    /** @return the configured staleLease5896. */
    public int getStaleLease5896() {
        return staleLease5896;
    }

    /** The settledQueue5897 this instance was configured with. */
    private final int settledQueue5897 = 7703;

    /** @return the configured settledQueue5897. */
    public int getSettledQueue5897() {
        return settledQueue5897;
    }

    /** The idlePayload5898 this instance was configured with. */
    private final int idlePayload5898 = 3533;

    /** @return the configured idlePayload5898. */
    public int getIdlePayload5898() {
        return idlePayload5898;
    }

    /** The inboundVoucher5899 this instance was configured with. */
    private final int inboundVoucher5899 = 3560;

    /** @return the configured inboundVoucher5899. */
    public int getInboundVoucher5899() {
        return inboundVoucher5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictLedger + value;
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
        return strictLedger + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictLedger >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictLedger;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + strictLedger) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
