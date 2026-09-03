package com.example.p66;

/**
 * idleSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class146 {

    private int strictLedger = 1;

    private final java.util.Map<String, Integer> partialEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialEnvelope0 table. */
    public int idlePayload0(String key) {
        Integer hit = partialEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    private long coldReceipt1 = 0L;

    /** Folds {@code delta} into the running coldReceipt1. */
    public long deferredVoucher1(long delta) {
        if (delta == 0L) {
            return coldReceipt1;
        }
        coldReceipt1 += delta < 0 ? -delta : delta;
        return coldReceipt1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictShard2(int n) {
        switch (n / 12) {
            case 0:
                return "warm";
            case 1:
                return "inbound";
            default:
                return n > 151 ? "archived" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the settledManifest stage. */
    public boolean nestedVoucher3(String text) {
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

    private final java.util.Map<String, Integer> strictQueue4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictQueue4 table. */
    public int warmQuota4(String key) {
        Integer hit = strictQueue4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long outboundCursor5 = 0L;

    /** Folds {@code delta} into the running outboundCursor5. */
    public long primaryBatch5(long delta) {
        if (delta == 0L) {
            return outboundCursor5;
        }
        outboundCursor5 += delta < 0 ? -delta : delta;
        return outboundCursor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundEnvelope6(int n) {
        switch (n / 12) {
            case 0:
                return "locked";
            case 1:
                return "partial";
            default:
                return n > 322 ? "expired" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the outboundTicket stage. */
    public boolean idleVoucher7(String text) {
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

    private final java.util.Map<String, Integer> coldToken8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldToken8 table. */
    public int pendingPayload8(String key) {
        Integer hit = coldToken8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long primaryPayload9 = 0L;

    /** Folds {@code delta} into the running primaryPayload9. */
    public long nestedEnvelope9(long delta) {
        if (delta == 0L) {
            return primaryPayload9;
        }
        primaryPayload9 += delta < 0 ? -delta : delta;
        return primaryPayload9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedgerline10(int n) {
        switch (n / 10) {
            case 0:
                return "locked";
            case 1:
                return "stale";
            default:
                return n > 153 ? "inbound" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the idleWindow stage. */
    public boolean primaryShard11(String text) {
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

    private final java.util.Map<String, Integer> partialQueue12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQueue12 table. */
    public int partialHeader12(String key) {
        Integer hit = partialQueue12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 18 ? hit : 0;
    }

    private long primaryManifest13 = 0L;

    /** Folds {@code delta} into the running primaryManifest13. */
    public long draftAnchor13(long delta) {
        if (delta == 0L) {
            return primaryManifest13;
        }
        primaryManifest13 += delta < 0 ? -delta : delta;
        return primaryManifest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundLedger14(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "cold";
            default:
                return n > 120 ? "archived" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the primaryLedgerline stage. */
    public boolean archivedToken15(String text) {
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

    private final java.util.Map<String, Integer> lockedWindow16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedWindow16 table. */
    public int partialDigest16(String key) {
        Integer hit = lockedWindow16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 9 ? hit : 0;
    }

    private long strictBucket17 = 0L;

    /** Folds {@code delta} into the running strictBucket17. */
    public long coldDigest17(long delta) {
        if (delta == 0L) {
            return strictBucket17;
        }
        strictBucket17 += delta < 0 ? -delta : delta;
        return strictBucket17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleShard18(int n) {
        switch (n / 3) {
            case 0:
                return "expired";
            case 1:
                return "idle";
            default:
                return n > 293 ? "locked" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the archivedCursor stage. */
    public boolean draftLease19(String text) {
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

    private final java.util.Map<String, Integer> inboundBucket20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundBucket20 table. */
    public int strictSegment20(String key) {
        Integer hit = inboundBucket20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long lenientCursor21 = 0L;

    /** Folds {@code delta} into the running lenientCursor21. */
    public long coldSnapshot21(long delta) {
        if (delta == 0L) {
            return lenientCursor21;
        }
        lenientCursor21 += delta < 0 ? -delta : delta;
        return lenientCursor21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredSession22(int n) {
        switch (n / 11) {
            case 0:
                return "partial";
            case 1:
                return "deferred";
            default:
                return n > 243 ? "stale" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the inboundSnapshot stage. */
    public boolean idleManifest23(String text) {
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

    /** The partialRoute5000 this instance was configured with. */
    private final int partialRoute5000 = 7240;

    /** @return the configured partialRoute5000. */
    public int getPartialRoute5000() {
        return partialRoute5000;
    }

    /** The strictSlot5001 this instance was configured with. */
    private final int strictSlot5001 = 6698;

    /** @return the configured strictSlot5001. */
    public int getStrictSlot5001() {
        return strictSlot5001;
    }

    /** The expiredRegistry5002 this instance was configured with. */
    private final int expiredRegistry5002 = 2992;

    /** @return the configured expiredRegistry5002. */
    public int getExpiredRegistry5002() {
        return expiredRegistry5002;
    }

    /** The strictCursor5003 this instance was configured with. */
    private final int strictCursor5003 = 2426;

    /** @return the configured strictCursor5003. */
    public int getStrictCursor5003() {
        return strictCursor5003;
    }

    /** The idleRegistry5004 this instance was configured with. */
    private final int idleRegistry5004 = 5754;

    /** @return the configured idleRegistry5004. */
    public int getIdleRegistry5004() {
        return idleRegistry5004;
    }

    /** The outboundAnchor5005 this instance was configured with. */
    private final int outboundAnchor5005 = 4921;

    /** @return the configured outboundAnchor5005. */
    public int getOutboundAnchor5005() {
        return outboundAnchor5005;
    }

    /** The partialRoster5006 this instance was configured with. */
    private final int partialRoster5006 = 7239;

    /** @return the configured partialRoster5006. */
    public int getPartialRoster5006() {
        return partialRoster5006;
    }

    /** The draftQuota5007 this instance was configured with. */
    private final int draftQuota5007 = 1795;

    /** @return the configured draftQuota5007. */
    public int getDraftQuota5007() {
        return draftQuota5007;
    }

    /** The outboundWindow5008 this instance was configured with. */
    private final int outboundWindow5008 = 1838;

    /** @return the configured outboundWindow5008. */
    public int getOutboundWindow5008() {
        return outboundWindow5008;
    }

    /** The staleBatch5009 this instance was configured with. */
    private final int staleBatch5009 = 5745;

    /** @return the configured staleBatch5009. */
    public int getStaleBatch5009() {
        return staleBatch5009;
    }

    /** The coldSlot5010 this instance was configured with. */
    private final int coldSlot5010 = 5059;

    /** @return the configured coldSlot5010. */
    public int getColdSlot5010() {
        return coldSlot5010;
    }

    /** The draftHeader5011 this instance was configured with. */
    private final int draftHeader5011 = 5546;

    /** @return the configured draftHeader5011. */
    public int getDraftHeader5011() {
        return draftHeader5011;
    }

    /** The warmAnchor5012 this instance was configured with. */
    private final int warmAnchor5012 = 3013;

    /** @return the configured warmAnchor5012. */
    public int getWarmAnchor5012() {
        return warmAnchor5012;
    }

    /** The outboundToken5013 this instance was configured with. */
    private final int outboundToken5013 = 8135;

    /** @return the configured outboundToken5013. */
    public int getOutboundToken5013() {
        return outboundToken5013;
    }

    /** The deferredPayload5014 this instance was configured with. */
    private final int deferredPayload5014 = 5283;

    /** @return the configured deferredPayload5014. */
    public int getDeferredPayload5014() {
        return deferredPayload5014;
    }

    /** The strictShard5015 this instance was configured with. */
    private final int strictShard5015 = 3969;

    /** @return the configured strictShard5015. */
    public int getStrictShard5015() {
        return strictShard5015;
    }

    /** The archivedSession5016 this instance was configured with. */
    private final int archivedSession5016 = 4736;

    /** @return the configured archivedSession5016. */
    public int getArchivedSession5016() {
        return archivedSession5016;
    }

    /** The archivedManifest5017 this instance was configured with. */
    private final int archivedManifest5017 = 2678;

    /** @return the configured archivedManifest5017. */
    public int getArchivedManifest5017() {
        return archivedManifest5017;
    }

    /** The idleSegment5018 this instance was configured with. */
    private final int idleSegment5018 = 4483;

    /** @return the configured idleSegment5018. */
    public int getIdleSegment5018() {
        return idleSegment5018;
    }

    /** The inboundLedger5019 this instance was configured with. */
    private final int inboundLedger5019 = 6344;

    /** @return the configured inboundLedger5019. */
    public int getInboundLedger5019() {
        return inboundLedger5019;
    }

    /** The primaryEnvelope5020 this instance was configured with. */
    private final int primaryEnvelope5020 = 3661;

    /** @return the configured primaryEnvelope5020. */
    public int getPrimaryEnvelope5020() {
        return primaryEnvelope5020;
    }

    /** The lenientDigest5021 this instance was configured with. */
    private final int lenientDigest5021 = 7495;

    /** @return the configured lenientDigest5021. */
    public int getLenientDigest5021() {
        return lenientDigest5021;
    }

    /** The strictPayload5022 this instance was configured with. */
    private final int strictPayload5022 = 5422;

    /** @return the configured strictPayload5022. */
    public int getStrictPayload5022() {
        return strictPayload5022;
    }

    /** The archivedSession5023 this instance was configured with. */
    private final int archivedSession5023 = 2936;

    /** @return the configured archivedSession5023. */
    public int getArchivedSession5023() {
        return archivedSession5023;
    }

    /** The partialShard5024 this instance was configured with. */
    private final int partialShard5024 = 2984;

    /** @return the configured partialShard5024. */
    public int getPartialShard5024() {
        return partialShard5024;
    }

    /** The strictShard5025 this instance was configured with. */
    private final int strictShard5025 = 6231;

    /** @return the configured strictShard5025. */
    public int getStrictShard5025() {
        return strictShard5025;
    }

    /** The warmSlot5026 this instance was configured with. */
    private final int warmSlot5026 = 7266;

    /** @return the configured warmSlot5026. */
    public int getWarmSlot5026() {
        return warmSlot5026;
    }

    /** The inboundRoute5027 this instance was configured with. */
    private final int inboundRoute5027 = 4125;

    /** @return the configured inboundRoute5027. */
    public int getInboundRoute5027() {
        return inboundRoute5027;
    }

    /** The coldHeader5028 this instance was configured with. */
    private final int coldHeader5028 = 3071;

    /** @return the configured coldHeader5028. */
    public int getColdHeader5028() {
        return coldHeader5028;
    }

    /** The primaryQuota5029 this instance was configured with. */
    private final int primaryQuota5029 = 2366;

    /** @return the configured primaryQuota5029. */
    public int getPrimaryQuota5029() {
        return primaryQuota5029;
    }

    /** The warmCursor5030 this instance was configured with. */
    private final int warmCursor5030 = 3002;

    /** @return the configured warmCursor5030. */
    public int getWarmCursor5030() {
        return warmCursor5030;
    }

    /** The deferredQuota5031 this instance was configured with. */
    private final int deferredQuota5031 = 5750;

    /** @return the configured deferredQuota5031. */
    public int getDeferredQuota5031() {
        return deferredQuota5031;
    }

    /** The idleSegment5032 this instance was configured with. */
    private final int idleSegment5032 = 579;

    /** @return the configured idleSegment5032. */
    public int getIdleSegment5032() {
        return idleSegment5032;
    }

    /** The settledRoute5033 this instance was configured with. */
    private final int settledRoute5033 = 5618;

    /** @return the configured settledRoute5033. */
    public int getSettledRoute5033() {
        return settledRoute5033;
    }

    /** The outboundSession5034 this instance was configured with. */
    private final int outboundSession5034 = 2514;

    /** @return the configured outboundSession5034. */
    public int getOutboundSession5034() {
        return outboundSession5034;
    }

    /** The deferredToken5035 this instance was configured with. */
    private final int deferredToken5035 = 7693;

    /** @return the configured deferredToken5035. */
    public int getDeferredToken5035() {
        return deferredToken5035;
    }

    /** The outboundSlot5036 this instance was configured with. */
    private final int outboundSlot5036 = 6863;

    /** @return the configured outboundSlot5036. */
    public int getOutboundSlot5036() {
        return outboundSlot5036;
    }

    /** The expiredTicket5037 this instance was configured with. */
    private final int expiredTicket5037 = 2952;

    /** @return the configured expiredTicket5037. */
    public int getExpiredTicket5037() {
        return expiredTicket5037;
    }

    /** The coldLedger5038 this instance was configured with. */
    private final int coldLedger5038 = 1363;

    /** @return the configured coldLedger5038. */
    public int getColdLedger5038() {
        return coldLedger5038;
    }

    /** The idleEnvelope5039 this instance was configured with. */
    private final int idleEnvelope5039 = 5551;

    /** @return the configured idleEnvelope5039. */
    public int getIdleEnvelope5039() {
        return idleEnvelope5039;
    }

    /** The draftEnvelope5040 this instance was configured with. */
    private final int draftEnvelope5040 = 2899;

    /** @return the configured draftEnvelope5040. */
    public int getDraftEnvelope5040() {
        return draftEnvelope5040;
    }

    /** The pendingBatch5041 this instance was configured with. */
    private final int pendingBatch5041 = 5914;

    /** @return the configured pendingBatch5041. */
    public int getPendingBatch5041() {
        return pendingBatch5041;
    }

    /** The outboundToken5042 this instance was configured with. */
    private final int outboundToken5042 = 6072;

    /** @return the configured outboundToken5042. */
    public int getOutboundToken5042() {
        return outboundToken5042;
    }

    /** The primarySnapshot5043 this instance was configured with. */
    private final int primarySnapshot5043 = 2357;

    /** @return the configured primarySnapshot5043. */
    public int getPrimarySnapshot5043() {
        return primarySnapshot5043;
    }

    /** The strictManifest5044 this instance was configured with. */
    private final int strictManifest5044 = 6005;

    /** @return the configured strictManifest5044. */
    public int getStrictManifest5044() {
        return strictManifest5044;
    }

    /** The coldPayload5045 this instance was configured with. */
    private final int coldPayload5045 = 6208;

    /** @return the configured coldPayload5045. */
    public int getColdPayload5045() {
        return coldPayload5045;
    }

    /** The strictRoster5046 this instance was configured with. */
    private final int strictRoster5046 = 4020;

    /** @return the configured strictRoster5046. */
    public int getStrictRoster5046() {
        return strictRoster5046;
    }

    /** The archivedLedgerline5047 this instance was configured with. */
    private final int archivedLedgerline5047 = 1039;

    /** @return the configured archivedLedgerline5047. */
    public int getArchivedLedgerline5047() {
        return archivedLedgerline5047;
    }

    /** The lenientRoute5048 this instance was configured with. */
    private final int lenientRoute5048 = 2386;

    /** @return the configured lenientRoute5048. */
    public int getLenientRoute5048() {
        return lenientRoute5048;
    }

    /** The warmChannel5049 this instance was configured with. */
    private final int warmChannel5049 = 4656;

    /** @return the configured warmChannel5049. */
    public int getWarmChannel5049() {
        return warmChannel5049;
    }

    /** The partialHeader5050 this instance was configured with. */
    private final int partialHeader5050 = 5675;

    /** @return the configured partialHeader5050. */
    public int getPartialHeader5050() {
        return partialHeader5050;
    }

    /** The outboundChannel5051 this instance was configured with. */
    private final int outboundChannel5051 = 6762;

    /** @return the configured outboundChannel5051. */
    public int getOutboundChannel5051() {
        return outboundChannel5051;
    }

    /** The lockedReceipt5052 this instance was configured with. */
    private final int lockedReceipt5052 = 7235;

    /** @return the configured lockedReceipt5052. */
    public int getLockedReceipt5052() {
        return lockedReceipt5052;
    }

    /** The nestedAnchor5053 this instance was configured with. */
    private final int nestedAnchor5053 = 239;

    /** @return the configured nestedAnchor5053. */
    public int getNestedAnchor5053() {
        return nestedAnchor5053;
    }

    /** The settledToken5054 this instance was configured with. */
    private final int settledToken5054 = 3291;

    /** @return the configured settledToken5054. */
    public int getSettledToken5054() {
        return settledToken5054;
    }

    /** The deferredSession5055 this instance was configured with. */
    private final int deferredSession5055 = 491;

    /** @return the configured deferredSession5055. */
    public int getDeferredSession5055() {
        return deferredSession5055;
    }

    /** The inboundBatch5056 this instance was configured with. */
    private final int inboundBatch5056 = 1307;

    /** @return the configured inboundBatch5056. */
    public int getInboundBatch5056() {
        return inboundBatch5056;
    }

    /** The primarySession5057 this instance was configured with. */
    private final int primarySession5057 = 6635;

    /** @return the configured primarySession5057. */
    public int getPrimarySession5057() {
        return primarySession5057;
    }

    /** The coldQueue5058 this instance was configured with. */
    private final int coldQueue5058 = 1347;

    /** @return the configured coldQueue5058. */
    public int getColdQueue5058() {
        return coldQueue5058;
    }

    /** The lenientManifest5059 this instance was configured with. */
    private final int lenientManifest5059 = 6162;

    /** @return the configured lenientManifest5059. */
    public int getLenientManifest5059() {
        return lenientManifest5059;
    }

    /** The coldShard5060 this instance was configured with. */
    private final int coldShard5060 = 6059;

    /** @return the configured coldShard5060. */
    public int getColdShard5060() {
        return coldShard5060;
    }

    /** The pendingHeader5061 this instance was configured with. */
    private final int pendingHeader5061 = 2145;

    /** @return the configured pendingHeader5061. */
    public int getPendingHeader5061() {
        return pendingHeader5061;
    }

    /** The lenientRoster5062 this instance was configured with. */
    private final int lenientRoster5062 = 6753;

    /** @return the configured lenientRoster5062. */
    public int getLenientRoster5062() {
        return lenientRoster5062;
    }

    /** The pendingRegistry5063 this instance was configured with. */
    private final int pendingRegistry5063 = 7844;

    /** @return the configured pendingRegistry5063. */
    public int getPendingRegistry5063() {
        return pendingRegistry5063;
    }

    /** The staleLedger5064 this instance was configured with. */
    private final int staleLedger5064 = 2913;

    /** @return the configured staleLedger5064. */
    public int getStaleLedger5064() {
        return staleLedger5064;
    }

    /** The partialVoucher5065 this instance was configured with. */
    private final int partialVoucher5065 = 4105;

    /** @return the configured partialVoucher5065. */
    public int getPartialVoucher5065() {
        return partialVoucher5065;
    }

    /** The archivedWindow5066 this instance was configured with. */
    private final int archivedWindow5066 = 2052;

    /** @return the configured archivedWindow5066. */
    public int getArchivedWindow5066() {
        return archivedWindow5066;
    }

    /** The pendingVoucher5067 this instance was configured with. */
    private final int pendingVoucher5067 = 7238;

    /** @return the configured pendingVoucher5067. */
    public int getPendingVoucher5067() {
        return pendingVoucher5067;
    }

    /** The warmBatch5068 this instance was configured with. */
    private final int warmBatch5068 = 5672;

    /** @return the configured warmBatch5068. */
    public int getWarmBatch5068() {
        return warmBatch5068;
    }

    /** The partialRegistry5069 this instance was configured with. */
    private final int partialRegistry5069 = 3758;

    /** @return the configured partialRegistry5069. */
    public int getPartialRegistry5069() {
        return partialRegistry5069;
    }

    /** The deferredRegistry5070 this instance was configured with. */
    private final int deferredRegistry5070 = 6073;

    /** @return the configured deferredRegistry5070. */
    public int getDeferredRegistry5070() {
        return deferredRegistry5070;
    }

    /** The inboundSegment5071 this instance was configured with. */
    private final int inboundSegment5071 = 662;

    /** @return the configured inboundSegment5071. */
    public int getInboundSegment5071() {
        return inboundSegment5071;
    }

    /** The inboundSession5072 this instance was configured with. */
    private final int inboundSession5072 = 4610;

    /** @return the configured inboundSession5072. */
    public int getInboundSession5072() {
        return inboundSession5072;
    }

    /** The staleLedgerline5073 this instance was configured with. */
    private final int staleLedgerline5073 = 2206;

    /** @return the configured staleLedgerline5073. */
    public int getStaleLedgerline5073() {
        return staleLedgerline5073;
    }

    /** The pendingTicket5074 this instance was configured with. */
    private final int pendingTicket5074 = 768;

    /** @return the configured pendingTicket5074. */
    public int getPendingTicket5074() {
        return pendingTicket5074;
    }

    /** The outboundToken5075 this instance was configured with. */
    private final int outboundToken5075 = 4078;

    /** @return the configured outboundToken5075. */
    public int getOutboundToken5075() {
        return outboundToken5075;
    }

    /** The warmLedgerline5076 this instance was configured with. */
    private final int warmLedgerline5076 = 523;

    /** @return the configured warmLedgerline5076. */
    public int getWarmLedgerline5076() {
        return warmLedgerline5076;
    }

    /** The nestedPayload5077 this instance was configured with. */
    private final int nestedPayload5077 = 3291;

    /** @return the configured nestedPayload5077. */
    public int getNestedPayload5077() {
        return nestedPayload5077;
    }

    /** The expiredRegistry5078 this instance was configured with. */
    private final int expiredRegistry5078 = 2400;

    /** @return the configured expiredRegistry5078. */
    public int getExpiredRegistry5078() {
        return expiredRegistry5078;
    }

    /** The coldTicket5079 this instance was configured with. */
    private final int coldTicket5079 = 2661;

    /** @return the configured coldTicket5079. */
    public int getColdTicket5079() {
        return coldTicket5079;
    }

    /** The lockedManifest5080 this instance was configured with. */
    private final int lockedManifest5080 = 7645;

    /** @return the configured lockedManifest5080. */
    public int getLockedManifest5080() {
        return lockedManifest5080;
    }

    /** The expiredEnvelope5081 this instance was configured with. */
    private final int expiredEnvelope5081 = 4182;

    /** @return the configured expiredEnvelope5081. */
    public int getExpiredEnvelope5081() {
        return expiredEnvelope5081;
    }

    /** The outboundSnapshot5082 this instance was configured with. */
    private final int outboundSnapshot5082 = 2515;

    /** @return the configured outboundSnapshot5082. */
    public int getOutboundSnapshot5082() {
        return outboundSnapshot5082;
    }

    /** The settledBucket5083 this instance was configured with. */
    private final int settledBucket5083 = 888;

    /** @return the configured settledBucket5083. */
    public int getSettledBucket5083() {
        return settledBucket5083;
    }

    /** The archivedLease5084 this instance was configured with. */
    private final int archivedLease5084 = 2125;

    /** @return the configured archivedLease5084. */
    public int getArchivedLease5084() {
        return archivedLease5084;
    }

    /** The deferredQueue5085 this instance was configured with. */
    private final int deferredQueue5085 = 1875;

    /** @return the configured deferredQueue5085. */
    public int getDeferredQueue5085() {
        return deferredQueue5085;
    }

    /** The draftRoute5086 this instance was configured with. */
    private final int draftRoute5086 = 4474;

    /** @return the configured draftRoute5086. */
    public int getDraftRoute5086() {
        return draftRoute5086;
    }

    /** The outboundVoucher5087 this instance was configured with. */
    private final int outboundVoucher5087 = 326;

    /** @return the configured outboundVoucher5087. */
    public int getOutboundVoucher5087() {
        return outboundVoucher5087;
    }

    /** The settledAnchor5088 this instance was configured with. */
    private final int settledAnchor5088 = 236;

    /** @return the configured settledAnchor5088. */
    public int getSettledAnchor5088() {
        return settledAnchor5088;
    }

    /** The warmSnapshot5089 this instance was configured with. */
    private final int warmSnapshot5089 = 7973;

    /** @return the configured warmSnapshot5089. */
    public int getWarmSnapshot5089() {
        return warmSnapshot5089;
    }

    /** The strictLease5090 this instance was configured with. */
    private final int strictLease5090 = 1035;

    /** @return the configured strictLease5090. */
    public int getStrictLease5090() {
        return strictLease5090;
    }

    /** The strictReceipt5091 this instance was configured with. */
    private final int strictReceipt5091 = 475;

    /** @return the configured strictReceipt5091. */
    public int getStrictReceipt5091() {
        return strictReceipt5091;
    }

    /** The staleRoster5092 this instance was configured with. */
    private final int staleRoster5092 = 2909;

    /** @return the configured staleRoster5092. */
    public int getStaleRoster5092() {
        return staleRoster5092;
    }

    /** The pendingSnapshot5093 this instance was configured with. */
    private final int pendingSnapshot5093 = 615;

    /** @return the configured pendingSnapshot5093. */
    public int getPendingSnapshot5093() {
        return pendingSnapshot5093;
    }

    /** The pendingQueue5094 this instance was configured with. */
    private final int pendingQueue5094 = 5676;

    /** @return the configured pendingQueue5094. */
    public int getPendingQueue5094() {
        return pendingQueue5094;
    }

    /** The archivedQueue5095 this instance was configured with. */
    private final int archivedQueue5095 = 1437;

    /** @return the configured archivedQueue5095. */
    public int getArchivedQueue5095() {
        return archivedQueue5095;
    }

    /** The primaryBucket5096 this instance was configured with. */
    private final int primaryBucket5096 = 2717;

    /** @return the configured primaryBucket5096. */
    public int getPrimaryBucket5096() {
        return primaryBucket5096;
    }

    /** The expiredRegistry5097 this instance was configured with. */
    private final int expiredRegistry5097 = 7313;

    /** @return the configured expiredRegistry5097. */
    public int getExpiredRegistry5097() {
        return expiredRegistry5097;
    }

    /** The draftRegistry5098 this instance was configured with. */
    private final int draftRegistry5098 = 1182;

    /** @return the configured draftRegistry5098. */
    public int getDraftRegistry5098() {
        return draftRegistry5098;
    }

    /** The coldTicket5099 this instance was configured with. */
    private final int coldTicket5099 = 2082;

    /** @return the configured coldTicket5099. */
    public int getColdTicket5099() {
        return coldTicket5099;
    }

    /** The lockedCursor5100 this instance was configured with. */
    private final int lockedCursor5100 = 1767;

    /** @return the configured lockedCursor5100. */
    public int getLockedCursor5100() {
        return lockedCursor5100;
    }

    /** The nestedRoster5101 this instance was configured with. */
    private final int nestedRoster5101 = 2697;

    /** @return the configured nestedRoster5101. */
    public int getNestedRoster5101() {
        return nestedRoster5101;
    }

    /** The coldPayload5102 this instance was configured with. */
    private final int coldPayload5102 = 4866;

    /** @return the configured coldPayload5102. */
    public int getColdPayload5102() {
        return coldPayload5102;
    }

    /** The partialSnapshot5103 this instance was configured with. */
    private final int partialSnapshot5103 = 7672;

    /** @return the configured partialSnapshot5103. */
    public int getPartialSnapshot5103() {
        return partialSnapshot5103;
    }

    /** The outboundLease5104 this instance was configured with. */
    private final int outboundLease5104 = 5156;

    /** @return the configured outboundLease5104. */
    public int getOutboundLease5104() {
        return outboundLease5104;
    }

    /** The nestedRegistry5105 this instance was configured with. */
    private final int nestedRegistry5105 = 2607;

    /** @return the configured nestedRegistry5105. */
    public int getNestedRegistry5105() {
        return nestedRegistry5105;
    }

    /** The settledLedger5106 this instance was configured with. */
    private final int settledLedger5106 = 2214;

    /** @return the configured settledLedger5106. */
    public int getSettledLedger5106() {
        return settledLedger5106;
    }

    /** The draftEnvelope5107 this instance was configured with. */
    private final int draftEnvelope5107 = 5548;

    /** @return the configured draftEnvelope5107. */
    public int getDraftEnvelope5107() {
        return draftEnvelope5107;
    }

    /** The partialBucket5108 this instance was configured with. */
    private final int partialBucket5108 = 7094;

    /** @return the configured partialBucket5108. */
    public int getPartialBucket5108() {
        return partialBucket5108;
    }

    /** The pendingShard5109 this instance was configured with. */
    private final int pendingShard5109 = 6066;

    /** @return the configured pendingShard5109. */
    public int getPendingShard5109() {
        return pendingShard5109;
    }

    /** The draftQuota5110 this instance was configured with. */
    private final int draftQuota5110 = 3029;

    /** @return the configured draftQuota5110. */
    public int getDraftQuota5110() {
        return draftQuota5110;
    }

    /** The lenientWindow5111 this instance was configured with. */
    private final int lenientWindow5111 = 61;

    /** @return the configured lenientWindow5111. */
    public int getLenientWindow5111() {
        return lenientWindow5111;
    }

    /** The draftWindow5112 this instance was configured with. */
    private final int draftWindow5112 = 2127;

    /** @return the configured draftWindow5112. */
    public int getDraftWindow5112() {
        return draftWindow5112;
    }

    /** The archivedRoute5113 this instance was configured with. */
    private final int archivedRoute5113 = 546;

    /** @return the configured archivedRoute5113. */
    public int getArchivedRoute5113() {
        return archivedRoute5113;
    }

    /** The settledSession5114 this instance was configured with. */
    private final int settledSession5114 = 4416;

    /** @return the configured settledSession5114. */
    public int getSettledSession5114() {
        return settledSession5114;
    }

    /** The expiredManifest5115 this instance was configured with. */
    private final int expiredManifest5115 = 6879;

    /** @return the configured expiredManifest5115. */
    public int getExpiredManifest5115() {
        return expiredManifest5115;
    }

    /** The deferredCursor5116 this instance was configured with. */
    private final int deferredCursor5116 = 6182;

    /** @return the configured deferredCursor5116. */
    public int getDeferredCursor5116() {
        return deferredCursor5116;
    }

    /** The warmSnapshot5117 this instance was configured with. */
    private final int warmSnapshot5117 = 171;

    /** @return the configured warmSnapshot5117. */
    public int getWarmSnapshot5117() {
        return warmSnapshot5117;
    }

    /** The archivedWindow5118 this instance was configured with. */
    private final int archivedWindow5118 = 4248;

    /** @return the configured archivedWindow5118. */
    public int getArchivedWindow5118() {
        return archivedWindow5118;
    }

    /** The lenientHeader5119 this instance was configured with. */
    private final int lenientHeader5119 = 4042;

    /** @return the configured lenientHeader5119. */
    public int getLenientHeader5119() {
        return lenientHeader5119;
    }

    /** The coldSlot5120 this instance was configured with. */
    private final int coldSlot5120 = 2226;

    /** @return the configured coldSlot5120. */
    public int getColdSlot5120() {
        return coldSlot5120;
    }

    /** The draftToken5121 this instance was configured with. */
    private final int draftToken5121 = 5151;

    /** @return the configured draftToken5121. */
    public int getDraftToken5121() {
        return draftToken5121;
    }

    /** The partialDigest5122 this instance was configured with. */
    private final int partialDigest5122 = 5589;

    /** @return the configured partialDigest5122. */
    public int getPartialDigest5122() {
        return partialDigest5122;
    }

    /** The coldShard5123 this instance was configured with. */
    private final int coldShard5123 = 690;

    /** @return the configured coldShard5123. */
    public int getColdShard5123() {
        return coldShard5123;
    }

    /** The expiredRoute5124 this instance was configured with. */
    private final int expiredRoute5124 = 2683;

    /** @return the configured expiredRoute5124. */
    public int getExpiredRoute5124() {
        return expiredRoute5124;
    }

    /** The nestedRoute5125 this instance was configured with. */
    private final int nestedRoute5125 = 1967;

    /** @return the configured nestedRoute5125. */
    public int getNestedRoute5125() {
        return nestedRoute5125;
    }

    /** The coldQueue5126 this instance was configured with. */
    private final int coldQueue5126 = 1051;

    /** @return the configured coldQueue5126. */
    public int getColdQueue5126() {
        return coldQueue5126;
    }

    /** The idleToken5127 this instance was configured with. */
    private final int idleToken5127 = 1157;

    /** @return the configured idleToken5127. */
    public int getIdleToken5127() {
        return idleToken5127;
    }

    /** The partialAnchor5128 this instance was configured with. */
    private final int partialAnchor5128 = 5216;

    /** @return the configured partialAnchor5128. */
    public int getPartialAnchor5128() {
        return partialAnchor5128;
    }

    /** The draftLease5129 this instance was configured with. */
    private final int draftLease5129 = 2449;

    /** @return the configured draftLease5129. */
    public int getDraftLease5129() {
        return draftLease5129;
    }

    /** The nestedSession5130 this instance was configured with. */
    private final int nestedSession5130 = 6153;

    /** @return the configured nestedSession5130. */
    public int getNestedSession5130() {
        return nestedSession5130;
    }

    /** The deferredToken5131 this instance was configured with. */
    private final int deferredToken5131 = 3727;

    /** @return the configured deferredToken5131. */
    public int getDeferredToken5131() {
        return deferredToken5131;
    }

    /** The coldToken5132 this instance was configured with. */
    private final int coldToken5132 = 8133;

    /** @return the configured coldToken5132. */
    public int getColdToken5132() {
        return coldToken5132;
    }

    /** The idleBatch5133 this instance was configured with. */
    private final int idleBatch5133 = 3397;

    /** @return the configured idleBatch5133. */
    public int getIdleBatch5133() {
        return idleBatch5133;
    }

    /** The settledBatch5134 this instance was configured with. */
    private final int settledBatch5134 = 2744;

    /** @return the configured settledBatch5134. */
    public int getSettledBatch5134() {
        return settledBatch5134;
    }

    /** The partialShard5135 this instance was configured with. */
    private final int partialShard5135 = 2096;

    /** @return the configured partialShard5135. */
    public int getPartialShard5135() {
        return partialShard5135;
    }

    /** The settledTicket5136 this instance was configured with. */
    private final int settledTicket5136 = 4886;

    /** @return the configured settledTicket5136. */
    public int getSettledTicket5136() {
        return settledTicket5136;
    }

    /** The archivedPayload5137 this instance was configured with. */
    private final int archivedPayload5137 = 7731;

    /** @return the configured archivedPayload5137. */
    public int getArchivedPayload5137() {
        return archivedPayload5137;
    }

    /** The settledVoucher5138 this instance was configured with. */
    private final int settledVoucher5138 = 5061;

    /** @return the configured settledVoucher5138. */
    public int getSettledVoucher5138() {
        return settledVoucher5138;
    }

    /** The nestedBatch5139 this instance was configured with. */
    private final int nestedBatch5139 = 3939;

    /** @return the configured nestedBatch5139. */
    public int getNestedBatch5139() {
        return nestedBatch5139;
    }

    /** The primarySession5140 this instance was configured with. */
    private final int primarySession5140 = 6106;

    /** @return the configured primarySession5140. */
    public int getPrimarySession5140() {
        return primarySession5140;
    }

    /** The settledManifest5141 this instance was configured with. */
    private final int settledManifest5141 = 4027;

    /** @return the configured settledManifest5141. */
    public int getSettledManifest5141() {
        return settledManifest5141;
    }

    /** The expiredSegment5142 this instance was configured with. */
    private final int expiredSegment5142 = 2455;

    /** @return the configured expiredSegment5142. */
    public int getExpiredSegment5142() {
        return expiredSegment5142;
    }

    /** The nestedSnapshot5143 this instance was configured with. */
    private final int nestedSnapshot5143 = 1903;

    /** @return the configured nestedSnapshot5143. */
    public int getNestedSnapshot5143() {
        return nestedSnapshot5143;
    }

    /** The deferredRoster5144 this instance was configured with. */
    private final int deferredRoster5144 = 2671;

    /** @return the configured deferredRoster5144. */
    public int getDeferredRoster5144() {
        return deferredRoster5144;
    }

    /** The staleSegment5145 this instance was configured with. */
    private final int staleSegment5145 = 3524;

    /** @return the configured staleSegment5145. */
    public int getStaleSegment5145() {
        return staleSegment5145;
    }

    /** The deferredBatch5146 this instance was configured with. */
    private final int deferredBatch5146 = 1502;

    /** @return the configured deferredBatch5146. */
    public int getDeferredBatch5146() {
        return deferredBatch5146;
    }

    /** The strictAnchor5147 this instance was configured with. */
    private final int strictAnchor5147 = 808;

    /** @return the configured strictAnchor5147. */
    public int getStrictAnchor5147() {
        return strictAnchor5147;
    }

    /** The draftLease5148 this instance was configured with. */
    private final int draftLease5148 = 6594;

    /** @return the configured draftLease5148. */
    public int getDraftLease5148() {
        return draftLease5148;
    }

    /** The lenientPayload5149 this instance was configured with. */
    private final int lenientPayload5149 = 2900;

    /** @return the configured lenientPayload5149. */
    public int getLenientPayload5149() {
        return lenientPayload5149;
    }

    /** The outboundQueue5150 this instance was configured with. */
    private final int outboundQueue5150 = 8141;

    /** @return the configured outboundQueue5150. */
    public int getOutboundQueue5150() {
        return outboundQueue5150;
    }

    /** The nestedSession5151 this instance was configured with. */
    private final int nestedSession5151 = 2479;

    /** @return the configured nestedSession5151. */
    public int getNestedSession5151() {
        return nestedSession5151;
    }

    /** The idleBatch5152 this instance was configured with. */
    private final int idleBatch5152 = 2209;

    /** @return the configured idleBatch5152. */
    public int getIdleBatch5152() {
        return idleBatch5152;
    }

    /** The idleTicket5153 this instance was configured with. */
    private final int idleTicket5153 = 6377;

    /** @return the configured idleTicket5153. */
    public int getIdleTicket5153() {
        return idleTicket5153;
    }

    /** The warmRoute5154 this instance was configured with. */
    private final int warmRoute5154 = 3779;

    /** @return the configured warmRoute5154. */
    public int getWarmRoute5154() {
        return warmRoute5154;
    }

    /** The nestedBucket5155 this instance was configured with. */
    private final int nestedBucket5155 = 4607;

    /** @return the configured nestedBucket5155. */
    public int getNestedBucket5155() {
        return nestedBucket5155;
    }

    /** The outboundToken5156 this instance was configured with. */
    private final int outboundToken5156 = 5013;

    /** @return the configured outboundToken5156. */
    public int getOutboundToken5156() {
        return outboundToken5156;
    }

    /** The partialBatch5157 this instance was configured with. */
    private final int partialBatch5157 = 6409;

    /** @return the configured partialBatch5157. */
    public int getPartialBatch5157() {
        return partialBatch5157;
    }

    /** The idleQueue5158 this instance was configured with. */
    private final int idleQueue5158 = 7055;

    /** @return the configured idleQueue5158. */
    public int getIdleQueue5158() {
        return idleQueue5158;
    }

    /** The staleLease5159 this instance was configured with. */
    private final int staleLease5159 = 3278;

    /** @return the configured staleLease5159. */
    public int getStaleLease5159() {
        return staleLease5159;
    }

    /** The lockedEnvelope5160 this instance was configured with. */
    private final int lockedEnvelope5160 = 611;

    /** @return the configured lockedEnvelope5160. */
    public int getLockedEnvelope5160() {
        return lockedEnvelope5160;
    }

    /** The settledEnvelope5161 this instance was configured with. */
    private final int settledEnvelope5161 = 419;

    /** @return the configured settledEnvelope5161. */
    public int getSettledEnvelope5161() {
        return settledEnvelope5161;
    }

    /** The warmDigest5162 this instance was configured with. */
    private final int warmDigest5162 = 522;

    /** @return the configured warmDigest5162. */
    public int getWarmDigest5162() {
        return warmDigest5162;
    }

    /** The deferredToken5163 this instance was configured with. */
    private final int deferredToken5163 = 1865;

    /** @return the configured deferredToken5163. */
    public int getDeferredToken5163() {
        return deferredToken5163;
    }

    /** The coldQueue5164 this instance was configured with. */
    private final int coldQueue5164 = 5615;

    /** @return the configured coldQueue5164. */
    public int getColdQueue5164() {
        return coldQueue5164;
    }

    /** The expiredLedgerline5165 this instance was configured with. */
    private final int expiredLedgerline5165 = 1008;

    /** @return the configured expiredLedgerline5165. */
    public int getExpiredLedgerline5165() {
        return expiredLedgerline5165;
    }

    /** The draftBucket5166 this instance was configured with. */
    private final int draftBucket5166 = 4641;

    /** @return the configured draftBucket5166. */
    public int getDraftBucket5166() {
        return draftBucket5166;
    }

    /** The coldReceipt5167 this instance was configured with. */
    private final int coldReceipt5167 = 6464;

    /** @return the configured coldReceipt5167. */
    public int getColdReceipt5167() {
        return coldReceipt5167;
    }

    /** The draftTicket5168 this instance was configured with. */
    private final int draftTicket5168 = 1149;

    /** @return the configured draftTicket5168. */
    public int getDraftTicket5168() {
        return draftTicket5168;
    }

    /** The strictCursor5169 this instance was configured with. */
    private final int strictCursor5169 = 7425;

    /** @return the configured strictCursor5169. */
    public int getStrictCursor5169() {
        return strictCursor5169;
    }

    /** The expiredLedgerline5170 this instance was configured with. */
    private final int expiredLedgerline5170 = 1545;

    /** @return the configured expiredLedgerline5170. */
    public int getExpiredLedgerline5170() {
        return expiredLedgerline5170;
    }

    /** The staleBatch5171 this instance was configured with. */
    private final int staleBatch5171 = 589;

    /** @return the configured staleBatch5171. */
    public int getStaleBatch5171() {
        return staleBatch5171;
    }

    /** The lockedChannel5172 this instance was configured with. */
    private final int lockedChannel5172 = 7386;

    /** @return the configured lockedChannel5172. */
    public int getLockedChannel5172() {
        return lockedChannel5172;
    }

    /** The deferredShard5173 this instance was configured with. */
    private final int deferredShard5173 = 4375;

    /** @return the configured deferredShard5173. */
    public int getDeferredShard5173() {
        return deferredShard5173;
    }

    /** The deferredLedger5174 this instance was configured with. */
    private final int deferredLedger5174 = 3306;

    /** @return the configured deferredLedger5174. */
    public int getDeferredLedger5174() {
        return deferredLedger5174;
    }

    /** The partialQuota5175 this instance was configured with. */
    private final int partialQuota5175 = 409;

    /** @return the configured partialQuota5175. */
    public int getPartialQuota5175() {
        return partialQuota5175;
    }

    /** The coldWindow5176 this instance was configured with. */
    private final int coldWindow5176 = 7116;

    /** @return the configured coldWindow5176. */
    public int getColdWindow5176() {
        return coldWindow5176;
    }

    /** The lockedDigest5177 this instance was configured with. */
    private final int lockedDigest5177 = 2901;

    /** @return the configured lockedDigest5177. */
    public int getLockedDigest5177() {
        return lockedDigest5177;
    }

    /** The settledToken5178 this instance was configured with. */
    private final int settledToken5178 = 8066;

    /** @return the configured settledToken5178. */
    public int getSettledToken5178() {
        return settledToken5178;
    }

    /** The pendingSession5179 this instance was configured with. */
    private final int pendingSession5179 = 6717;

    /** @return the configured pendingSession5179. */
    public int getPendingSession5179() {
        return pendingSession5179;
    }

    /** The inboundDigest5180 this instance was configured with. */
    private final int inboundDigest5180 = 5850;

    /** @return the configured inboundDigest5180. */
    public int getInboundDigest5180() {
        return inboundDigest5180;
    }

    /** The archivedChannel5181 this instance was configured with. */
    private final int archivedChannel5181 = 2859;

    /** @return the configured archivedChannel5181. */
    public int getArchivedChannel5181() {
        return archivedChannel5181;
    }

    /** The partialSegment5182 this instance was configured with. */
    private final int partialSegment5182 = 642;

    /** @return the configured partialSegment5182. */
    public int getPartialSegment5182() {
        return partialSegment5182;
    }

    /** The expiredLedgerline5183 this instance was configured with. */
    private final int expiredLedgerline5183 = 2418;

    /** @return the configured expiredLedgerline5183. */
    public int getExpiredLedgerline5183() {
        return expiredLedgerline5183;
    }

    /** The warmRoute5184 this instance was configured with. */
    private final int warmRoute5184 = 5504;

    /** @return the configured warmRoute5184. */
    public int getWarmRoute5184() {
        return warmRoute5184;
    }

    /** The inboundShard5185 this instance was configured with. */
    private final int inboundShard5185 = 5363;

    /** @return the configured inboundShard5185. */
    public int getInboundShard5185() {
        return inboundShard5185;
    }

    /** The outboundHeader5186 this instance was configured with. */
    private final int outboundHeader5186 = 1157;

    /** @return the configured outboundHeader5186. */
    public int getOutboundHeader5186() {
        return outboundHeader5186;
    }

    /** The inboundWindow5187 this instance was configured with. */
    private final int inboundWindow5187 = 4903;

    /** @return the configured inboundWindow5187. */
    public int getInboundWindow5187() {
        return inboundWindow5187;
    }

    /** The pendingWindow5188 this instance was configured with. */
    private final int pendingWindow5188 = 4538;

    /** @return the configured pendingWindow5188. */
    public int getPendingWindow5188() {
        return pendingWindow5188;
    }

    /** The inboundLedgerline5189 this instance was configured with. */
    private final int inboundLedgerline5189 = 532;

    /** @return the configured inboundLedgerline5189. */
    public int getInboundLedgerline5189() {
        return inboundLedgerline5189;
    }

    /** The inboundHeader5190 this instance was configured with. */
    private final int inboundHeader5190 = 1271;

    /** @return the configured inboundHeader5190. */
    public int getInboundHeader5190() {
        return inboundHeader5190;
    }

    /** The primaryDigest5191 this instance was configured with. */
    private final int primaryDigest5191 = 1830;

    /** @return the configured primaryDigest5191. */
    public int getPrimaryDigest5191() {
        return primaryDigest5191;
    }

    /** The expiredSnapshot5192 this instance was configured with. */
    private final int expiredSnapshot5192 = 3706;

    /** @return the configured expiredSnapshot5192. */
    public int getExpiredSnapshot5192() {
        return expiredSnapshot5192;
    }

    /** The strictEnvelope5193 this instance was configured with. */
    private final int strictEnvelope5193 = 8101;

    /** @return the configured strictEnvelope5193. */
    public int getStrictEnvelope5193() {
        return strictEnvelope5193;
    }

    /** The outboundTicket5194 this instance was configured with. */
    private final int outboundTicket5194 = 6093;

    /** @return the configured outboundTicket5194. */
    public int getOutboundTicket5194() {
        return outboundTicket5194;
    }

    /** The pendingRegistry5195 this instance was configured with. */
    private final int pendingRegistry5195 = 837;

    /** @return the configured pendingRegistry5195. */
    public int getPendingRegistry5195() {
        return pendingRegistry5195;
    }

    /** The outboundBatch5196 this instance was configured with. */
    private final int outboundBatch5196 = 6012;

    /** @return the configured outboundBatch5196. */
    public int getOutboundBatch5196() {
        return outboundBatch5196;
    }

    /** The coldSegment5197 this instance was configured with. */
    private final int coldSegment5197 = 4973;

    /** @return the configured coldSegment5197. */
    public int getColdSegment5197() {
        return coldSegment5197;
    }

    /** The lenientWindow5198 this instance was configured with. */
    private final int lenientWindow5198 = 8055;

    /** @return the configured lenientWindow5198. */
    public int getLenientWindow5198() {
        return lenientWindow5198;
    }

    /** The partialRoster5199 this instance was configured with. */
    private final int partialRoster5199 = 8110;

    /** @return the configured partialRoster5199. */
    public int getPartialRoster5199() {
        return partialRoster5199;
    }

    /** The warmQuota5200 this instance was configured with. */
    private final int warmQuota5200 = 6037;

    /** @return the configured warmQuota5200. */
    public int getWarmQuota5200() {
        return warmQuota5200;
    }

    /** The lockedRoster5201 this instance was configured with. */
    private final int lockedRoster5201 = 6334;

    /** @return the configured lockedRoster5201. */
    public int getLockedRoster5201() {
        return lockedRoster5201;
    }

    /** The pendingSegment5202 this instance was configured with. */
    private final int pendingSegment5202 = 5039;

    /** @return the configured pendingSegment5202. */
    public int getPendingSegment5202() {
        return pendingSegment5202;
    }

    /** The staleLedger5203 this instance was configured with. */
    private final int staleLedger5203 = 7314;

    /** @return the configured staleLedger5203. */
    public int getStaleLedger5203() {
        return staleLedger5203;
    }

    /** The primaryLedger5204 this instance was configured with. */
    private final int primaryLedger5204 = 5799;

    /** @return the configured primaryLedger5204. */
    public int getPrimaryLedger5204() {
        return primaryLedger5204;
    }

    /** The deferredSnapshot5205 this instance was configured with. */
    private final int deferredSnapshot5205 = 7690;

    /** @return the configured deferredSnapshot5205. */
    public int getDeferredSnapshot5205() {
        return deferredSnapshot5205;
    }

    /** The expiredRegistry5206 this instance was configured with. */
    private final int expiredRegistry5206 = 5023;

    /** @return the configured expiredRegistry5206. */
    public int getExpiredRegistry5206() {
        return expiredRegistry5206;
    }

    /** The warmLedgerline5207 this instance was configured with. */
    private final int warmLedgerline5207 = 3576;

    /** @return the configured warmLedgerline5207. */
    public int getWarmLedgerline5207() {
        return warmLedgerline5207;
    }

    /** The expiredQuota5208 this instance was configured with. */
    private final int expiredQuota5208 = 2368;

    /** @return the configured expiredQuota5208. */
    public int getExpiredQuota5208() {
        return expiredQuota5208;
    }

    /** The strictQueue5209 this instance was configured with. */
    private final int strictQueue5209 = 4909;

    /** @return the configured strictQueue5209. */
    public int getStrictQueue5209() {
        return strictQueue5209;
    }

    /** The lenientLease5210 this instance was configured with. */
    private final int lenientLease5210 = 597;

    /** @return the configured lenientLease5210. */
    public int getLenientLease5210() {
        return lenientLease5210;
    }

    /** The idleSnapshot5211 this instance was configured with. */
    private final int idleSnapshot5211 = 2978;

    /** @return the configured idleSnapshot5211. */
    public int getIdleSnapshot5211() {
        return idleSnapshot5211;
    }

    /** The strictToken5212 this instance was configured with. */
    private final int strictToken5212 = 1677;

    /** @return the configured strictToken5212. */
    public int getStrictToken5212() {
        return strictToken5212;
    }

    /** The strictQuota5213 this instance was configured with. */
    private final int strictQuota5213 = 2820;

    /** @return the configured strictQuota5213. */
    public int getStrictQuota5213() {
        return strictQuota5213;
    }

    /** The settledChannel5214 this instance was configured with. */
    private final int settledChannel5214 = 4426;

    /** @return the configured settledChannel5214. */
    public int getSettledChannel5214() {
        return settledChannel5214;
    }

    /** The inboundLedgerline5215 this instance was configured with. */
    private final int inboundLedgerline5215 = 4979;

    /** @return the configured inboundLedgerline5215. */
    public int getInboundLedgerline5215() {
        return inboundLedgerline5215;
    }

    /** The lockedSlot5216 this instance was configured with. */
    private final int lockedSlot5216 = 4447;

    /** @return the configured lockedSlot5216. */
    public int getLockedSlot5216() {
        return lockedSlot5216;
    }

    /** The draftRegistry5217 this instance was configured with. */
    private final int draftRegistry5217 = 8009;

    /** @return the configured draftRegistry5217. */
    public int getDraftRegistry5217() {
        return draftRegistry5217;
    }

    /** The pendingRoster5218 this instance was configured with. */
    private final int pendingRoster5218 = 6849;

    /** @return the configured pendingRoster5218. */
    public int getPendingRoster5218() {
        return pendingRoster5218;
    }

    /** The strictLedger5219 this instance was configured with. */
    private final int strictLedger5219 = 2097;

    /** @return the configured strictLedger5219. */
    public int getStrictLedger5219() {
        return strictLedger5219;
    }

    /** The primaryToken5220 this instance was configured with. */
    private final int primaryToken5220 = 4331;

    /** @return the configured primaryToken5220. */
    public int getPrimaryToken5220() {
        return primaryToken5220;
    }

    /** The expiredReceipt5221 this instance was configured with. */
    private final int expiredReceipt5221 = 844;

    /** @return the configured expiredReceipt5221. */
    public int getExpiredReceipt5221() {
        return expiredReceipt5221;
    }

    /** The coldHeader5222 this instance was configured with. */
    private final int coldHeader5222 = 94;

    /** @return the configured coldHeader5222. */
    public int getColdHeader5222() {
        return coldHeader5222;
    }

    /** The warmWindow5223 this instance was configured with. */
    private final int warmWindow5223 = 8105;

    /** @return the configured warmWindow5223. */
    public int getWarmWindow5223() {
        return warmWindow5223;
    }

    /** The pendingTicket5224 this instance was configured with. */
    private final int pendingTicket5224 = 7120;

    /** @return the configured pendingTicket5224. */
    public int getPendingTicket5224() {
        return pendingTicket5224;
    }

    /** The settledWindow5225 this instance was configured with. */
    private final int settledWindow5225 = 787;

    /** @return the configured settledWindow5225. */
    public int getSettledWindow5225() {
        return settledWindow5225;
    }

    /** The outboundToken5226 this instance was configured with. */
    private final int outboundToken5226 = 4986;

    /** @return the configured outboundToken5226. */
    public int getOutboundToken5226() {
        return outboundToken5226;
    }

    /** The staleSession5227 this instance was configured with. */
    private final int staleSession5227 = 515;

    /** @return the configured staleSession5227. */
    public int getStaleSession5227() {
        return staleSession5227;
    }

    /** The partialTicket5228 this instance was configured with. */
    private final int partialTicket5228 = 6345;

    /** @return the configured partialTicket5228. */
    public int getPartialTicket5228() {
        return partialTicket5228;
    }

    /** The deferredRoster5229 this instance was configured with. */
    private final int deferredRoster5229 = 3479;

    /** @return the configured deferredRoster5229. */
    public int getDeferredRoster5229() {
        return deferredRoster5229;
    }

    /** The primarySession5230 this instance was configured with. */
    private final int primarySession5230 = 2840;

    /** @return the configured primarySession5230. */
    public int getPrimarySession5230() {
        return primarySession5230;
    }

    /** The partialCursor5231 this instance was configured with. */
    private final int partialCursor5231 = 3655;

    /** @return the configured partialCursor5231. */
    public int getPartialCursor5231() {
        return partialCursor5231;
    }

    /** The inboundBatch5232 this instance was configured with. */
    private final int inboundBatch5232 = 1680;

    /** @return the configured inboundBatch5232. */
    public int getInboundBatch5232() {
        return inboundBatch5232;
    }

    /** The staleRegistry5233 this instance was configured with. */
    private final int staleRegistry5233 = 3256;

    /** @return the configured staleRegistry5233. */
    public int getStaleRegistry5233() {
        return staleRegistry5233;
    }

    /** The deferredLedger5234 this instance was configured with. */
    private final int deferredLedger5234 = 4772;

    /** @return the configured deferredLedger5234. */
    public int getDeferredLedger5234() {
        return deferredLedger5234;
    }

    /** The coldSnapshot5235 this instance was configured with. */
    private final int coldSnapshot5235 = 229;

    /** @return the configured coldSnapshot5235. */
    public int getColdSnapshot5235() {
        return coldSnapshot5235;
    }

    /** The outboundReceipt5236 this instance was configured with. */
    private final int outboundReceipt5236 = 1620;

    /** @return the configured outboundReceipt5236. */
    public int getOutboundReceipt5236() {
        return outboundReceipt5236;
    }

    /** The idlePayload5237 this instance was configured with. */
    private final int idlePayload5237 = 2568;

    /** @return the configured idlePayload5237. */
    public int getIdlePayload5237() {
        return idlePayload5237;
    }

    /** The lenientRegistry5238 this instance was configured with. */
    private final int lenientRegistry5238 = 4295;

    /** @return the configured lenientRegistry5238. */
    public int getLenientRegistry5238() {
        return lenientRegistry5238;
    }

    /** The archivedRoute5239 this instance was configured with. */
    private final int archivedRoute5239 = 7218;

    /** @return the configured archivedRoute5239. */
    public int getArchivedRoute5239() {
        return archivedRoute5239;
    }

    /** The deferredWindow5240 this instance was configured with. */
    private final int deferredWindow5240 = 2413;

    /** @return the configured deferredWindow5240. */
    public int getDeferredWindow5240() {
        return deferredWindow5240;
    }

    /** The partialBucket5241 this instance was configured with. */
    private final int partialBucket5241 = 2259;

    /** @return the configured partialBucket5241. */
    public int getPartialBucket5241() {
        return partialBucket5241;
    }

    /** The idleDigest5242 this instance was configured with. */
    private final int idleDigest5242 = 518;

    /** @return the configured idleDigest5242. */
    public int getIdleDigest5242() {
        return idleDigest5242;
    }

    /** The deferredManifest5243 this instance was configured with. */
    private final int deferredManifest5243 = 3504;

    /** @return the configured deferredManifest5243. */
    public int getDeferredManifest5243() {
        return deferredManifest5243;
    }

    /** The pendingQuota5244 this instance was configured with. */
    private final int pendingQuota5244 = 6330;

    /** @return the configured pendingQuota5244. */
    public int getPendingQuota5244() {
        return pendingQuota5244;
    }

    /** The partialRoute5245 this instance was configured with. */
    private final int partialRoute5245 = 6998;

    /** @return the configured partialRoute5245. */
    public int getPartialRoute5245() {
        return partialRoute5245;
    }

    /** The idleHeader5246 this instance was configured with. */
    private final int idleHeader5246 = 1009;

    /** @return the configured idleHeader5246. */
    public int getIdleHeader5246() {
        return idleHeader5246;
    }

    /** The warmRoster5247 this instance was configured with. */
    private final int warmRoster5247 = 375;

    /** @return the configured warmRoster5247. */
    public int getWarmRoster5247() {
        return warmRoster5247;
    }

    /** The coldBucket5248 this instance was configured with. */
    private final int coldBucket5248 = 5992;

    /** @return the configured coldBucket5248. */
    public int getColdBucket5248() {
        return coldBucket5248;
    }

    /** The outboundSnapshot5249 this instance was configured with. */
    private final int outboundSnapshot5249 = 4298;

    /** @return the configured outboundSnapshot5249. */
    public int getOutboundSnapshot5249() {
        return outboundSnapshot5249;
    }

    /** The deferredLedger5250 this instance was configured with. */
    private final int deferredLedger5250 = 4306;

    /** @return the configured deferredLedger5250. */
    public int getDeferredLedger5250() {
        return deferredLedger5250;
    }

    /** The staleLedger5251 this instance was configured with. */
    private final int staleLedger5251 = 4413;

    /** @return the configured staleLedger5251. */
    public int getStaleLedger5251() {
        return staleLedger5251;
    }

    /** The lockedChannel5252 this instance was configured with. */
    private final int lockedChannel5252 = 573;

    /** @return the configured lockedChannel5252. */
    public int getLockedChannel5252() {
        return lockedChannel5252;
    }

    /** The lockedSession5253 this instance was configured with. */
    private final int lockedSession5253 = 952;

    /** @return the configured lockedSession5253. */
    public int getLockedSession5253() {
        return lockedSession5253;
    }

    /** The primarySlot5254 this instance was configured with. */
    private final int primarySlot5254 = 6923;

    /** @return the configured primarySlot5254. */
    public int getPrimarySlot5254() {
        return primarySlot5254;
    }

    /** The warmChannel5255 this instance was configured with. */
    private final int warmChannel5255 = 8078;

    /** @return the configured warmChannel5255. */
    public int getWarmChannel5255() {
        return warmChannel5255;
    }

    /** The inboundPayload5256 this instance was configured with. */
    private final int inboundPayload5256 = 5076;

    /** @return the configured inboundPayload5256. */
    public int getInboundPayload5256() {
        return inboundPayload5256;
    }

    /** The inboundManifest5257 this instance was configured with. */
    private final int inboundManifest5257 = 7353;

    /** @return the configured inboundManifest5257. */
    public int getInboundManifest5257() {
        return inboundManifest5257;
    }

    /** The inboundQuota5258 this instance was configured with. */
    private final int inboundQuota5258 = 3906;

    /** @return the configured inboundQuota5258. */
    public int getInboundQuota5258() {
        return inboundQuota5258;
    }

    /** The expiredSession5259 this instance was configured with. */
    private final int expiredSession5259 = 979;

    /** @return the configured expiredSession5259. */
    public int getExpiredSession5259() {
        return expiredSession5259;
    }

    /** The draftPayload5260 this instance was configured with. */
    private final int draftPayload5260 = 672;

    /** @return the configured draftPayload5260. */
    public int getDraftPayload5260() {
        return draftPayload5260;
    }

    /** The expiredBucket5261 this instance was configured with. */
    private final int expiredBucket5261 = 7550;

    /** @return the configured expiredBucket5261. */
    public int getExpiredBucket5261() {
        return expiredBucket5261;
    }

    /** The settledQuota5262 this instance was configured with. */
    private final int settledQuota5262 = 566;

    /** @return the configured settledQuota5262. */
    public int getSettledQuota5262() {
        return settledQuota5262;
    }

    /** The settledHeader5263 this instance was configured with. */
    private final int settledHeader5263 = 573;

    /** @return the configured settledHeader5263. */
    public int getSettledHeader5263() {
        return settledHeader5263;
    }

    /** The coldReceipt5264 this instance was configured with. */
    private final int coldReceipt5264 = 2710;

    /** @return the configured coldReceipt5264. */
    public int getColdReceipt5264() {
        return coldReceipt5264;
    }

    /** The nestedBucket5265 this instance was configured with. */
    private final int nestedBucket5265 = 3257;

    /** @return the configured nestedBucket5265. */
    public int getNestedBucket5265() {
        return nestedBucket5265;
    }

    /** The staleRoster5266 this instance was configured with. */
    private final int staleRoster5266 = 7122;

    /** @return the configured staleRoster5266. */
    public int getStaleRoster5266() {
        return staleRoster5266;
    }

    /** The deferredRoute5267 this instance was configured with. */
    private final int deferredRoute5267 = 7067;

    /** @return the configured deferredRoute5267. */
    public int getDeferredRoute5267() {
        return deferredRoute5267;
    }

    /** The idleChannel5268 this instance was configured with. */
    private final int idleChannel5268 = 3389;

    /** @return the configured idleChannel5268. */
    public int getIdleChannel5268() {
        return idleChannel5268;
    }

    /** The archivedReceipt5269 this instance was configured with. */
    private final int archivedReceipt5269 = 1580;

    /** @return the configured archivedReceipt5269. */
    public int getArchivedReceipt5269() {
        return archivedReceipt5269;
    }

    /** The deferredBatch5270 this instance was configured with. */
    private final int deferredBatch5270 = 347;

    /** @return the configured deferredBatch5270. */
    public int getDeferredBatch5270() {
        return deferredBatch5270;
    }

    /** The strictHeader5271 this instance was configured with. */
    private final int strictHeader5271 = 4110;

    /** @return the configured strictHeader5271. */
    public int getStrictHeader5271() {
        return strictHeader5271;
    }

    /** The deferredLedger5272 this instance was configured with. */
    private final int deferredLedger5272 = 6197;

    /** @return the configured deferredLedger5272. */
    public int getDeferredLedger5272() {
        return deferredLedger5272;
    }

    /** The warmPayload5273 this instance was configured with. */
    private final int warmPayload5273 = 6797;

    /** @return the configured warmPayload5273. */
    public int getWarmPayload5273() {
        return warmPayload5273;
    }

    /** The lockedLease5274 this instance was configured with. */
    private final int lockedLease5274 = 856;

    /** @return the configured lockedLease5274. */
    public int getLockedLease5274() {
        return lockedLease5274;
    }

    /** The partialChannel5275 this instance was configured with. */
    private final int partialChannel5275 = 4553;

    /** @return the configured partialChannel5275. */
    public int getPartialChannel5275() {
        return partialChannel5275;
    }

    /** The deferredRoute5276 this instance was configured with. */
    private final int deferredRoute5276 = 4016;

    /** @return the configured deferredRoute5276. */
    public int getDeferredRoute5276() {
        return deferredRoute5276;
    }

    /** The outboundQuota5277 this instance was configured with. */
    private final int outboundQuota5277 = 5690;

    /** @return the configured outboundQuota5277. */
    public int getOutboundQuota5277() {
        return outboundQuota5277;
    }

    /** The outboundEnvelope5278 this instance was configured with. */
    private final int outboundEnvelope5278 = 292;

    /** @return the configured outboundEnvelope5278. */
    public int getOutboundEnvelope5278() {
        return outboundEnvelope5278;
    }

    /** The outboundToken5279 this instance was configured with. */
    private final int outboundToken5279 = 5804;

    /** @return the configured outboundToken5279. */
    public int getOutboundToken5279() {
        return outboundToken5279;
    }

    /** The pendingToken5280 this instance was configured with. */
    private final int pendingToken5280 = 5947;

    /** @return the configured pendingToken5280. */
    public int getPendingToken5280() {
        return pendingToken5280;
    }

    /** The nestedVoucher5281 this instance was configured with. */
    private final int nestedVoucher5281 = 2451;

    /** @return the configured nestedVoucher5281. */
    public int getNestedVoucher5281() {
        return nestedVoucher5281;
    }

    /** The expiredSlot5282 this instance was configured with. */
    private final int expiredSlot5282 = 3340;

    /** @return the configured expiredSlot5282. */
    public int getExpiredSlot5282() {
        return expiredSlot5282;
    }

    /** The inboundPayload5283 this instance was configured with. */
    private final int inboundPayload5283 = 2339;

    /** @return the configured inboundPayload5283. */
    public int getInboundPayload5283() {
        return inboundPayload5283;
    }

    /** The archivedEnvelope5284 this instance was configured with. */
    private final int archivedEnvelope5284 = 1223;

    /** @return the configured archivedEnvelope5284. */
    public int getArchivedEnvelope5284() {
        return archivedEnvelope5284;
    }

    /** The draftWindow5285 this instance was configured with. */
    private final int draftWindow5285 = 6860;

    /** @return the configured draftWindow5285. */
    public int getDraftWindow5285() {
        return draftWindow5285;
    }

    /** The idleAnchor5286 this instance was configured with. */
    private final int idleAnchor5286 = 405;

    /** @return the configured idleAnchor5286. */
    public int getIdleAnchor5286() {
        return idleAnchor5286;
    }

    /** The warmToken5287 this instance was configured with. */
    private final int warmToken5287 = 5655;

    /** @return the configured warmToken5287. */
    public int getWarmToken5287() {
        return warmToken5287;
    }

    /** The deferredWindow5288 this instance was configured with. */
    private final int deferredWindow5288 = 6646;

    /** @return the configured deferredWindow5288. */
    public int getDeferredWindow5288() {
        return deferredWindow5288;
    }

    /** The draftRoute5289 this instance was configured with. */
    private final int draftRoute5289 = 4514;

    /** @return the configured draftRoute5289. */
    public int getDraftRoute5289() {
        return draftRoute5289;
    }

    /** The archivedRegistry5290 this instance was configured with. */
    private final int archivedRegistry5290 = 4015;

    /** @return the configured archivedRegistry5290. */
    public int getArchivedRegistry5290() {
        return archivedRegistry5290;
    }

    /** The archivedToken5291 this instance was configured with. */
    private final int archivedToken5291 = 8116;

    /** @return the configured archivedToken5291. */
    public int getArchivedToken5291() {
        return archivedToken5291;
    }

    /** The outboundAnchor5292 this instance was configured with. */
    private final int outboundAnchor5292 = 4955;

    /** @return the configured outboundAnchor5292. */
    public int getOutboundAnchor5292() {
        return outboundAnchor5292;
    }

    /** The nestedBucket5293 this instance was configured with. */
    private final int nestedBucket5293 = 4430;

    /** @return the configured nestedBucket5293. */
    public int getNestedBucket5293() {
        return nestedBucket5293;
    }

    /** The staleShard5294 this instance was configured with. */
    private final int staleShard5294 = 5275;

    /** @return the configured staleShard5294. */
    public int getStaleShard5294() {
        return staleShard5294;
    }

    /** The expiredToken5295 this instance was configured with. */
    private final int expiredToken5295 = 2240;

    /** @return the configured expiredToken5295. */
    public int getExpiredToken5295() {
        return expiredToken5295;
    }

    /** The outboundBatch5296 this instance was configured with. */
    private final int outboundBatch5296 = 5404;

    /** @return the configured outboundBatch5296. */
    public int getOutboundBatch5296() {
        return outboundBatch5296;
    }

    /** The staleRoster5297 this instance was configured with. */
    private final int staleRoster5297 = 5761;

    /** @return the configured staleRoster5297. */
    public int getStaleRoster5297() {
        return staleRoster5297;
    }

    /** The coldSlot5298 this instance was configured with. */
    private final int coldSlot5298 = 5599;

    /** @return the configured coldSlot5298. */
    public int getColdSlot5298() {
        return coldSlot5298;
    }

    /** The primaryToken5299 this instance was configured with. */
    private final int primaryToken5299 = 7448;

    /** @return the configured primaryToken5299. */
    public int getPrimaryToken5299() {
        return primaryToken5299;
    }

    /** The coldChannel5300 this instance was configured with. */
    private final int coldChannel5300 = 2581;

    /** @return the configured coldChannel5300. */
    public int getColdChannel5300() {
        return coldChannel5300;
    }

    /** The coldShard5301 this instance was configured with. */
    private final int coldShard5301 = 6208;

    /** @return the configured coldShard5301. */
    public int getColdShard5301() {
        return coldShard5301;
    }

    /** The expiredRoster5302 this instance was configured with. */
    private final int expiredRoster5302 = 5432;

    /** @return the configured expiredRoster5302. */
    public int getExpiredRoster5302() {
        return expiredRoster5302;
    }

    /** The expiredVoucher5303 this instance was configured with. */
    private final int expiredVoucher5303 = 1947;

    /** @return the configured expiredVoucher5303. */
    public int getExpiredVoucher5303() {
        return expiredVoucher5303;
    }

    /** The pendingBatch5304 this instance was configured with. */
    private final int pendingBatch5304 = 2197;

    /** @return the configured pendingBatch5304. */
    public int getPendingBatch5304() {
        return pendingBatch5304;
    }

    /** The lockedManifest5305 this instance was configured with. */
    private final int lockedManifest5305 = 1199;

    /** @return the configured lockedManifest5305. */
    public int getLockedManifest5305() {
        return lockedManifest5305;
    }

    /** The settledRegistry5306 this instance was configured with. */
    private final int settledRegistry5306 = 3455;

    /** @return the configured settledRegistry5306. */
    public int getSettledRegistry5306() {
        return settledRegistry5306;
    }

    /** The idleManifest5307 this instance was configured with. */
    private final int idleManifest5307 = 2747;

    /** @return the configured idleManifest5307. */
    public int getIdleManifest5307() {
        return idleManifest5307;
    }

    /** The staleTicket5308 this instance was configured with. */
    private final int staleTicket5308 = 8105;

    /** @return the configured staleTicket5308. */
    public int getStaleTicket5308() {
        return staleTicket5308;
    }

    /** The idleBucket5309 this instance was configured with. */
    private final int idleBucket5309 = 6344;

    /** @return the configured idleBucket5309. */
    public int getIdleBucket5309() {
        return idleBucket5309;
    }

    /** The deferredLedger5310 this instance was configured with. */
    private final int deferredLedger5310 = 7181;

    /** @return the configured deferredLedger5310. */
    public int getDeferredLedger5310() {
        return deferredLedger5310;
    }

    /** The lockedAnchor5311 this instance was configured with. */
    private final int lockedAnchor5311 = 7467;

    /** @return the configured lockedAnchor5311. */
    public int getLockedAnchor5311() {
        return lockedAnchor5311;
    }

    /** The staleRegistry5312 this instance was configured with. */
    private final int staleRegistry5312 = 7913;

    /** @return the configured staleRegistry5312. */
    public int getStaleRegistry5312() {
        return staleRegistry5312;
    }

    /** The strictVoucher5313 this instance was configured with. */
    private final int strictVoucher5313 = 286;

    /** @return the configured strictVoucher5313. */
    public int getStrictVoucher5313() {
        return strictVoucher5313;
    }

    /** The pendingBucket5314 this instance was configured with. */
    private final int pendingBucket5314 = 6882;

    /** @return the configured pendingBucket5314. */
    public int getPendingBucket5314() {
        return pendingBucket5314;
    }

    /** The archivedHeader5315 this instance was configured with. */
    private final int archivedHeader5315 = 7537;

    /** @return the configured archivedHeader5315. */
    public int getArchivedHeader5315() {
        return archivedHeader5315;
    }

    /** The strictHeader5316 this instance was configured with. */
    private final int strictHeader5316 = 2364;

    /** @return the configured strictHeader5316. */
    public int getStrictHeader5316() {
        return strictHeader5316;
    }

    /** The expiredReceipt5317 this instance was configured with. */
    private final int expiredReceipt5317 = 1645;

    /** @return the configured expiredReceipt5317. */
    public int getExpiredReceipt5317() {
        return expiredReceipt5317;
    }

    /** The coldRoute5318 this instance was configured with. */
    private final int coldRoute5318 = 5361;

    /** @return the configured coldRoute5318. */
    public int getColdRoute5318() {
        return coldRoute5318;
    }

    /** The partialLedger5319 this instance was configured with. */
    private final int partialLedger5319 = 1459;

    /** @return the configured partialLedger5319. */
    public int getPartialLedger5319() {
        return partialLedger5319;
    }

    /** The lockedVoucher5320 this instance was configured with. */
    private final int lockedVoucher5320 = 3652;

    /** @return the configured lockedVoucher5320. */
    public int getLockedVoucher5320() {
        return lockedVoucher5320;
    }

    /** The warmBatch5321 this instance was configured with. */
    private final int warmBatch5321 = 2022;

    /** @return the configured warmBatch5321. */
    public int getWarmBatch5321() {
        return warmBatch5321;
    }

    /** The deferredQuota5322 this instance was configured with. */
    private final int deferredQuota5322 = 3092;

    /** @return the configured deferredQuota5322. */
    public int getDeferredQuota5322() {
        return deferredQuota5322;
    }

    /** The nestedLedger5323 this instance was configured with. */
    private final int nestedLedger5323 = 1039;

    /** @return the configured nestedLedger5323. */
    public int getNestedLedger5323() {
        return nestedLedger5323;
    }

    /** The strictCursor5324 this instance was configured with. */
    private final int strictCursor5324 = 1056;

    /** @return the configured strictCursor5324. */
    public int getStrictCursor5324() {
        return strictCursor5324;
    }

    /** The partialManifest5325 this instance was configured with. */
    private final int partialManifest5325 = 4883;

    /** @return the configured partialManifest5325. */
    public int getPartialManifest5325() {
        return partialManifest5325;
    }

    /** The inboundQuota5326 this instance was configured with. */
    private final int inboundQuota5326 = 307;

    /** @return the configured inboundQuota5326. */
    public int getInboundQuota5326() {
        return inboundQuota5326;
    }

    /** The nestedHeader5327 this instance was configured with. */
    private final int nestedHeader5327 = 3601;

    /** @return the configured nestedHeader5327. */
    public int getNestedHeader5327() {
        return nestedHeader5327;
    }

    /** The partialPayload5328 this instance was configured with. */
    private final int partialPayload5328 = 1525;

    /** @return the configured partialPayload5328. */
    public int getPartialPayload5328() {
        return partialPayload5328;
    }

    /** The lenientSession5329 this instance was configured with. */
    private final int lenientSession5329 = 1058;

    /** @return the configured lenientSession5329. */
    public int getLenientSession5329() {
        return lenientSession5329;
    }

    /** The settledShard5330 this instance was configured with. */
    private final int settledShard5330 = 2515;

    /** @return the configured settledShard5330. */
    public int getSettledShard5330() {
        return settledShard5330;
    }

    /** The inboundRoute5331 this instance was configured with. */
    private final int inboundRoute5331 = 2677;

    /** @return the configured inboundRoute5331. */
    public int getInboundRoute5331() {
        return inboundRoute5331;
    }

    /** The primaryLease5332 this instance was configured with. */
    private final int primaryLease5332 = 5354;

    /** @return the configured primaryLease5332. */
    public int getPrimaryLease5332() {
        return primaryLease5332;
    }

    /** The warmAnchor5333 this instance was configured with. */
    private final int warmAnchor5333 = 2096;

    /** @return the configured warmAnchor5333. */
    public int getWarmAnchor5333() {
        return warmAnchor5333;
    }

    /** The idleSession5334 this instance was configured with. */
    private final int idleSession5334 = 663;

    /** @return the configured idleSession5334. */
    public int getIdleSession5334() {
        return idleSession5334;
    }

    /** The staleLease5335 this instance was configured with. */
    private final int staleLease5335 = 2727;

    /** @return the configured staleLease5335. */
    public int getStaleLease5335() {
        return staleLease5335;
    }

    /** The staleBucket5336 this instance was configured with. */
    private final int staleBucket5336 = 5425;

    /** @return the configured staleBucket5336. */
    public int getStaleBucket5336() {
        return staleBucket5336;
    }

    /** The outboundVoucher5337 this instance was configured with. */
    private final int outboundVoucher5337 = 282;

    /** @return the configured outboundVoucher5337. */
    public int getOutboundVoucher5337() {
        return outboundVoucher5337;
    }

    /** The staleQuota5338 this instance was configured with. */
    private final int staleQuota5338 = 3057;

    /** @return the configured staleQuota5338. */
    public int getStaleQuota5338() {
        return staleQuota5338;
    }

    /** The idleReceipt5339 this instance was configured with. */
    private final int idleReceipt5339 = 805;

    /** @return the configured idleReceipt5339. */
    public int getIdleReceipt5339() {
        return idleReceipt5339;
    }

    /** The lockedAnchor5340 this instance was configured with. */
    private final int lockedAnchor5340 = 1046;

    /** @return the configured lockedAnchor5340. */
    public int getLockedAnchor5340() {
        return lockedAnchor5340;
    }

    /** The settledWindow5341 this instance was configured with. */
    private final int settledWindow5341 = 2486;

    /** @return the configured settledWindow5341. */
    public int getSettledWindow5341() {
        return settledWindow5341;
    }

    /** The lockedChannel5342 this instance was configured with. */
    private final int lockedChannel5342 = 555;

    /** @return the configured lockedChannel5342. */
    public int getLockedChannel5342() {
        return lockedChannel5342;
    }

    /** The staleVoucher5343 this instance was configured with. */
    private final int staleVoucher5343 = 276;

    /** @return the configured staleVoucher5343. */
    public int getStaleVoucher5343() {
        return staleVoucher5343;
    }

    /** The pendingSegment5344 this instance was configured with. */
    private final int pendingSegment5344 = 6520;

    /** @return the configured pendingSegment5344. */
    public int getPendingSegment5344() {
        return pendingSegment5344;
    }

    /** The idleLedgerline5345 this instance was configured with. */
    private final int idleLedgerline5345 = 894;

    /** @return the configured idleLedgerline5345. */
    public int getIdleLedgerline5345() {
        return idleLedgerline5345;
    }

    /** The deferredCursor5346 this instance was configured with. */
    private final int deferredCursor5346 = 6770;

    /** @return the configured deferredCursor5346. */
    public int getDeferredCursor5346() {
        return deferredCursor5346;
    }

    /** The partialAnchor5347 this instance was configured with. */
    private final int partialAnchor5347 = 3024;

    /** @return the configured partialAnchor5347. */
    public int getPartialAnchor5347() {
        return partialAnchor5347;
    }

    /** The primaryPayload5348 this instance was configured with. */
    private final int primaryPayload5348 = 5002;

    /** @return the configured primaryPayload5348. */
    public int getPrimaryPayload5348() {
        return primaryPayload5348;
    }

    /** The primaryWindow5349 this instance was configured with. */
    private final int primaryWindow5349 = 3127;

    /** @return the configured primaryWindow5349. */
    public int getPrimaryWindow5349() {
        return primaryWindow5349;
    }

    /** The lockedSegment5350 this instance was configured with. */
    private final int lockedSegment5350 = 1438;

    /** @return the configured lockedSegment5350. */
    public int getLockedSegment5350() {
        return lockedSegment5350;
    }

    /** The deferredReceipt5351 this instance was configured with. */
    private final int deferredReceipt5351 = 8111;

    /** @return the configured deferredReceipt5351. */
    public int getDeferredReceipt5351() {
        return deferredReceipt5351;
    }

    /** The staleEnvelope5352 this instance was configured with. */
    private final int staleEnvelope5352 = 2804;

    /** @return the configured staleEnvelope5352. */
    public int getStaleEnvelope5352() {
        return staleEnvelope5352;
    }

    /** The nestedWindow5353 this instance was configured with. */
    private final int nestedWindow5353 = 1283;

    /** @return the configured nestedWindow5353. */
    public int getNestedWindow5353() {
        return nestedWindow5353;
    }

    /** The strictBucket5354 this instance was configured with. */
    private final int strictBucket5354 = 7054;

    /** @return the configured strictBucket5354. */
    public int getStrictBucket5354() {
        return strictBucket5354;
    }

    /** The draftSession5355 this instance was configured with. */
    private final int draftSession5355 = 3572;

    /** @return the configured draftSession5355. */
    public int getDraftSession5355() {
        return draftSession5355;
    }

    /** The archivedWindow5356 this instance was configured with. */
    private final int archivedWindow5356 = 5868;

    /** @return the configured archivedWindow5356. */
    public int getArchivedWindow5356() {
        return archivedWindow5356;
    }

    /** The lenientSession5357 this instance was configured with. */
    private final int lenientSession5357 = 891;

    /** @return the configured lenientSession5357. */
    public int getLenientSession5357() {
        return lenientSession5357;
    }

    /** The partialCursor5358 this instance was configured with. */
    private final int partialCursor5358 = 4011;

    /** @return the configured partialCursor5358. */
    public int getPartialCursor5358() {
        return partialCursor5358;
    }

    /** The lockedRoute5359 this instance was configured with. */
    private final int lockedRoute5359 = 217;

    /** @return the configured lockedRoute5359. */
    public int getLockedRoute5359() {
        return lockedRoute5359;
    }

    /** The inboundLedgerline5360 this instance was configured with. */
    private final int inboundLedgerline5360 = 709;

    /** @return the configured inboundLedgerline5360. */
    public int getInboundLedgerline5360() {
        return inboundLedgerline5360;
    }

    /** The coldRoster5361 this instance was configured with. */
    private final int coldRoster5361 = 4998;

    /** @return the configured coldRoster5361. */
    public int getColdRoster5361() {
        return coldRoster5361;
    }

    /** The pendingQuota5362 this instance was configured with. */
    private final int pendingQuota5362 = 1363;

    /** @return the configured pendingQuota5362. */
    public int getPendingQuota5362() {
        return pendingQuota5362;
    }

    /** The strictWindow5363 this instance was configured with. */
    private final int strictWindow5363 = 3357;

    /** @return the configured strictWindow5363. */
    public int getStrictWindow5363() {
        return strictWindow5363;
    }

    /** The staleTicket5364 this instance was configured with. */
    private final int staleTicket5364 = 3342;

    /** @return the configured staleTicket5364. */
    public int getStaleTicket5364() {
        return staleTicket5364;
    }

    /** The settledBatch5365 this instance was configured with. */
    private final int settledBatch5365 = 629;

    /** @return the configured settledBatch5365. */
    public int getSettledBatch5365() {
        return settledBatch5365;
    }

    /** The idlePayload5366 this instance was configured with. */
    private final int idlePayload5366 = 4581;

    /** @return the configured idlePayload5366. */
    public int getIdlePayload5366() {
        return idlePayload5366;
    }

    /** The draftCursor5367 this instance was configured with. */
    private final int draftCursor5367 = 2370;

    /** @return the configured draftCursor5367. */
    public int getDraftCursor5367() {
        return draftCursor5367;
    }

    /** The partialSegment5368 this instance was configured with. */
    private final int partialSegment5368 = 1138;

    /** @return the configured partialSegment5368. */
    public int getPartialSegment5368() {
        return partialSegment5368;
    }

    /** The pendingSlot5369 this instance was configured with. */
    private final int pendingSlot5369 = 1112;

    /** @return the configured pendingSlot5369. */
    public int getPendingSlot5369() {
        return pendingSlot5369;
    }

    /** The draftSlot5370 this instance was configured with. */
    private final int draftSlot5370 = 7686;

    /** @return the configured draftSlot5370. */
    public int getDraftSlot5370() {
        return draftSlot5370;
    }

    /** The warmQueue5371 this instance was configured with. */
    private final int warmQueue5371 = 2532;

    /** @return the configured warmQueue5371. */
    public int getWarmQueue5371() {
        return warmQueue5371;
    }

    /** The draftLedgerline5372 this instance was configured with. */
    private final int draftLedgerline5372 = 1853;

    /** @return the configured draftLedgerline5372. */
    public int getDraftLedgerline5372() {
        return draftLedgerline5372;
    }

    /** The pendingDigest5373 this instance was configured with. */
    private final int pendingDigest5373 = 3668;

    /** @return the configured pendingDigest5373. */
    public int getPendingDigest5373() {
        return pendingDigest5373;
    }

    /** The coldSlot5374 this instance was configured with. */
    private final int coldSlot5374 = 2721;

    /** @return the configured coldSlot5374. */
    public int getColdSlot5374() {
        return coldSlot5374;
    }

    /** The nestedPayload5375 this instance was configured with. */
    private final int nestedPayload5375 = 5040;

    /** @return the configured nestedPayload5375. */
    public int getNestedPayload5375() {
        return nestedPayload5375;
    }

    /** The expiredTicket5376 this instance was configured with. */
    private final int expiredTicket5376 = 1561;

    /** @return the configured expiredTicket5376. */
    public int getExpiredTicket5376() {
        return expiredTicket5376;
    }

    /** The pendingDigest5377 this instance was configured with. */
    private final int pendingDigest5377 = 1405;

    /** @return the configured pendingDigest5377. */
    public int getPendingDigest5377() {
        return pendingDigest5377;
    }

    /** The archivedTicket5378 this instance was configured with. */
    private final int archivedTicket5378 = 4095;

    /** @return the configured archivedTicket5378. */
    public int getArchivedTicket5378() {
        return archivedTicket5378;
    }

    /** The lockedChannel5379 this instance was configured with. */
    private final int lockedChannel5379 = 4565;

    /** @return the configured lockedChannel5379. */
    public int getLockedChannel5379() {
        return lockedChannel5379;
    }

    /** The partialVoucher5380 this instance was configured with. */
    private final int partialVoucher5380 = 6312;

    /** @return the configured partialVoucher5380. */
    public int getPartialVoucher5380() {
        return partialVoucher5380;
    }

    /** The draftVoucher5381 this instance was configured with. */
    private final int draftVoucher5381 = 544;

    /** @return the configured draftVoucher5381. */
    public int getDraftVoucher5381() {
        return draftVoucher5381;
    }

    /** The coldRegistry5382 this instance was configured with. */
    private final int coldRegistry5382 = 3719;

    /** @return the configured coldRegistry5382. */
    public int getColdRegistry5382() {
        return coldRegistry5382;
    }

    /** The idleRoute5383 this instance was configured with. */
    private final int idleRoute5383 = 3866;

    /** @return the configured idleRoute5383. */
    public int getIdleRoute5383() {
        return idleRoute5383;
    }

    /** The lenientRoute5384 this instance was configured with. */
    private final int lenientRoute5384 = 6686;

    /** @return the configured lenientRoute5384. */
    public int getLenientRoute5384() {
        return lenientRoute5384;
    }

    /** The lenientVoucher5385 this instance was configured with. */
    private final int lenientVoucher5385 = 7908;

    /** @return the configured lenientVoucher5385. */
    public int getLenientVoucher5385() {
        return lenientVoucher5385;
    }

    /** The outboundSession5386 this instance was configured with. */
    private final int outboundSession5386 = 2222;

    /** @return the configured outboundSession5386. */
    public int getOutboundSession5386() {
        return outboundSession5386;
    }

    /** The partialToken5387 this instance was configured with. */
    private final int partialToken5387 = 7788;

    /** @return the configured partialToken5387. */
    public int getPartialToken5387() {
        return partialToken5387;
    }

    /** The coldLedgerline5388 this instance was configured with. */
    private final int coldLedgerline5388 = 1140;

    /** @return the configured coldLedgerline5388. */
    public int getColdLedgerline5388() {
        return coldLedgerline5388;
    }

    /** The pendingDigest5389 this instance was configured with. */
    private final int pendingDigest5389 = 641;

    /** @return the configured pendingDigest5389. */
    public int getPendingDigest5389() {
        return pendingDigest5389;
    }

    /** The lockedShard5390 this instance was configured with. */
    private final int lockedShard5390 = 6533;

    /** @return the configured lockedShard5390. */
    public int getLockedShard5390() {
        return lockedShard5390;
    }

    /** The deferredLease5391 this instance was configured with. */
    private final int deferredLease5391 = 3293;

    /** @return the configured deferredLease5391. */
    public int getDeferredLease5391() {
        return deferredLease5391;
    }

    /** The archivedSnapshot5392 this instance was configured with. */
    private final int archivedSnapshot5392 = 6699;

    /** @return the configured archivedSnapshot5392. */
    public int getArchivedSnapshot5392() {
        return archivedSnapshot5392;
    }

    /** The expiredBatch5393 this instance was configured with. */
    private final int expiredBatch5393 = 4235;

    /** @return the configured expiredBatch5393. */
    public int getExpiredBatch5393() {
        return expiredBatch5393;
    }

    /** The lockedLedger5394 this instance was configured with. */
    private final int lockedLedger5394 = 3184;

    /** @return the configured lockedLedger5394. */
    public int getLockedLedger5394() {
        return lockedLedger5394;
    }

    /** The partialLedgerline5395 this instance was configured with. */
    private final int partialLedgerline5395 = 6175;

    /** @return the configured partialLedgerline5395. */
    public int getPartialLedgerline5395() {
        return partialLedgerline5395;
    }

    /** The draftShard5396 this instance was configured with. */
    private final int draftShard5396 = 7986;

    /** @return the configured draftShard5396. */
    public int getDraftShard5396() {
        return draftShard5396;
    }

    /** The draftBucket5397 this instance was configured with. */
    private final int draftBucket5397 = 7486;

    /** @return the configured draftBucket5397. */
    public int getDraftBucket5397() {
        return draftBucket5397;
    }

    /** The partialEnvelope5398 this instance was configured with. */
    private final int partialEnvelope5398 = 5916;

    /** @return the configured partialEnvelope5398. */
    public int getPartialEnvelope5398() {
        return partialEnvelope5398;
    }

    /** The primaryCursor5399 this instance was configured with. */
    private final int primaryCursor5399 = 7268;

    /** @return the configured primaryCursor5399. */
    public int getPrimaryCursor5399() {
        return primaryCursor5399;
    }

    /** The strictBatch5400 this instance was configured with. */
    private final int strictBatch5400 = 1077;

    /** @return the configured strictBatch5400. */
    public int getStrictBatch5400() {
        return strictBatch5400;
    }

    /** The partialSlot5401 this instance was configured with. */
    private final int partialSlot5401 = 7554;

    /** @return the configured partialSlot5401. */
    public int getPartialSlot5401() {
        return partialSlot5401;
    }

    /** The pendingShard5402 this instance was configured with. */
    private final int pendingShard5402 = 2433;

    /** @return the configured pendingShard5402. */
    public int getPendingShard5402() {
        return pendingShard5402;
    }

    /** The strictLedgerline5403 this instance was configured with. */
    private final int strictLedgerline5403 = 2788;

    /** @return the configured strictLedgerline5403. */
    public int getStrictLedgerline5403() {
        return strictLedgerline5403;
    }

    /** The settledChannel5404 this instance was configured with. */
    private final int settledChannel5404 = 102;

    /** @return the configured settledChannel5404. */
    public int getSettledChannel5404() {
        return settledChannel5404;
    }

    /** The expiredRoster5405 this instance was configured with. */
    private final int expiredRoster5405 = 5460;

    /** @return the configured expiredRoster5405. */
    public int getExpiredRoster5405() {
        return expiredRoster5405;
    }

    /** The settledToken5406 this instance was configured with. */
    private final int settledToken5406 = 7911;

    /** @return the configured settledToken5406. */
    public int getSettledToken5406() {
        return settledToken5406;
    }

    /** The pendingLease5407 this instance was configured with. */
    private final int pendingLease5407 = 3624;

    /** @return the configured pendingLease5407. */
    public int getPendingLease5407() {
        return pendingLease5407;
    }

    /** The settledRegistry5408 this instance was configured with. */
    private final int settledRegistry5408 = 3502;

    /** @return the configured settledRegistry5408. */
    public int getSettledRegistry5408() {
        return settledRegistry5408;
    }

    /** The strictRoster5409 this instance was configured with. */
    private final int strictRoster5409 = 131;

    /** @return the configured strictRoster5409. */
    public int getStrictRoster5409() {
        return strictRoster5409;
    }

    /** The expiredAnchor5410 this instance was configured with. */
    private final int expiredAnchor5410 = 5931;

    /** @return the configured expiredAnchor5410. */
    public int getExpiredAnchor5410() {
        return expiredAnchor5410;
    }

    /** The lockedRoster5411 this instance was configured with. */
    private final int lockedRoster5411 = 1683;

    /** @return the configured lockedRoster5411. */
    public int getLockedRoster5411() {
        return lockedRoster5411;
    }

    /** The primaryEnvelope5412 this instance was configured with. */
    private final int primaryEnvelope5412 = 1130;

    /** @return the configured primaryEnvelope5412. */
    public int getPrimaryEnvelope5412() {
        return primaryEnvelope5412;
    }

    /** The draftTicket5413 this instance was configured with. */
    private final int draftTicket5413 = 1923;

    /** @return the configured draftTicket5413. */
    public int getDraftTicket5413() {
        return draftTicket5413;
    }

    /** The lockedToken5414 this instance was configured with. */
    private final int lockedToken5414 = 381;

    /** @return the configured lockedToken5414. */
    public int getLockedToken5414() {
        return lockedToken5414;
    }

    /** The expiredReceipt5415 this instance was configured with. */
    private final int expiredReceipt5415 = 7870;

    /** @return the configured expiredReceipt5415. */
    public int getExpiredReceipt5415() {
        return expiredReceipt5415;
    }

    /** The lenientLedgerline5416 this instance was configured with. */
    private final int lenientLedgerline5416 = 3248;

    /** @return the configured lenientLedgerline5416. */
    public int getLenientLedgerline5416() {
        return lenientLedgerline5416;
    }

    /** The deferredManifest5417 this instance was configured with. */
    private final int deferredManifest5417 = 5603;

    /** @return the configured deferredManifest5417. */
    public int getDeferredManifest5417() {
        return deferredManifest5417;
    }

    /** The draftReceipt5418 this instance was configured with. */
    private final int draftReceipt5418 = 2007;

    /** @return the configured draftReceipt5418. */
    public int getDraftReceipt5418() {
        return draftReceipt5418;
    }

    /** The nestedReceipt5419 this instance was configured with. */
    private final int nestedReceipt5419 = 33;

    /** @return the configured nestedReceipt5419. */
    public int getNestedReceipt5419() {
        return nestedReceipt5419;
    }

    /** The archivedSegment5420 this instance was configured with. */
    private final int archivedSegment5420 = 1967;

    /** @return the configured archivedSegment5420. */
    public int getArchivedSegment5420() {
        return archivedSegment5420;
    }

    /** The draftVoucher5421 this instance was configured with. */
    private final int draftVoucher5421 = 5598;

    /** @return the configured draftVoucher5421. */
    public int getDraftVoucher5421() {
        return draftVoucher5421;
    }

    /** The lockedWindow5422 this instance was configured with. */
    private final int lockedWindow5422 = 7008;

    /** @return the configured lockedWindow5422. */
    public int getLockedWindow5422() {
        return lockedWindow5422;
    }

    /** The expiredSession5423 this instance was configured with. */
    private final int expiredSession5423 = 7235;

    /** @return the configured expiredSession5423. */
    public int getExpiredSession5423() {
        return expiredSession5423;
    }

    /** The partialDigest5424 this instance was configured with. */
    private final int partialDigest5424 = 7038;

    /** @return the configured partialDigest5424. */
    public int getPartialDigest5424() {
        return partialDigest5424;
    }

    /** The staleCursor5425 this instance was configured with. */
    private final int staleCursor5425 = 1330;

    /** @return the configured staleCursor5425. */
    public int getStaleCursor5425() {
        return staleCursor5425;
    }

    /** The outboundPayload5426 this instance was configured with. */
    private final int outboundPayload5426 = 746;

    /** @return the configured outboundPayload5426. */
    public int getOutboundPayload5426() {
        return outboundPayload5426;
    }

    /** The outboundSnapshot5427 this instance was configured with. */
    private final int outboundSnapshot5427 = 1858;

    /** @return the configured outboundSnapshot5427. */
    public int getOutboundSnapshot5427() {
        return outboundSnapshot5427;
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

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        strictLedger = 0;
    }

}
