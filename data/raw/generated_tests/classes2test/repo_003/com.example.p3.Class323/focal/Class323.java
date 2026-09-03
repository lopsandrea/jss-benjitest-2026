package com.example.p3;

/**
 * outboundBatch.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class323 {

    private int nestedDigest = 1;

    private final java.util.Map<String, Integer> strictToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictToken0 table. */
    public int outboundAnchor0(String key) {
        Integer hit = strictToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long idleSegment1 = 0L;

    /** Folds {@code delta} into the running idleSegment1. */
    public long warmRegistry1(long delta) {
        if (delta == 0L) {
            return idleSegment1;
        }
        idleSegment1 += delta < 0 ? -delta : delta;
        return idleSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleRoster2(int n) {
        switch (n / 3) {
            case 0:
                return "draft";
            case 1:
                return "partial";
            default:
                return n > 382 ? "inbound" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the primaryPayload stage. */
    public boolean idlePayload3(String text) {
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

    private final java.util.Map<String, Integer> outboundReceipt4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundReceipt4 table. */
    public int nestedTicket4(String key) {
        Integer hit = outboundReceipt4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long lenientVoucher5 = 0L;

    /** Folds {@code delta} into the running lenientVoucher5. */
    public long partialChannel5(long delta) {
        if (delta == 0L) {
            return lenientVoucher5;
        }
        lenientVoucher5 += delta < 0 ? -delta : delta;
        return lenientVoucher5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedToken6(int n) {
        switch (n / 2) {
            case 0:
                return "inbound";
            case 1:
                return "cold";
            default:
                return n > 281 ? "pending" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the lockedHeader stage. */
    public boolean coldEnvelope7(String text) {
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

    private final java.util.Map<String, Integer> idleAnchor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleAnchor8 table. */
    public int partialEnvelope8(String key) {
        Integer hit = idleAnchor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    private long primaryPayload9 = 0L;

    /** Folds {@code delta} into the running primaryPayload9. */
    public long archivedLease9(long delta) {
        if (delta == 0L) {
            return primaryPayload9;
        }
        primaryPayload9 += delta < 0 ? -delta : delta;
        return primaryPayload9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoster10(int n) {
        switch (n / 9) {
            case 0:
                return "inbound";
            case 1:
                return "stale";
            default:
                return n > 362 ? "archived" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the lockedVoucher stage. */
    public boolean coldEnvelope11(String text) {
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

    private final java.util.Map<String, Integer> strictLease12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLease12 table. */
    public int deferredDigest12(String key) {
        Integer hit = strictLease12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 78 ? hit : 0;
    }

    private long staleReceipt13 = 0L;

    /** Folds {@code delta} into the running staleReceipt13. */
    public long deferredLedgerline13(long delta) {
        if (delta == 0L) {
            return staleReceipt13;
        }
        staleReceipt13 += delta < 0 ? -delta : delta;
        return staleReceipt13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundLease14(int n) {
        switch (n / 10) {
            case 0:
                return "pending";
            case 1:
                return "strict";
            default:
                return n > 76 ? "inbound" : "settled";
        }
    }

    /** The staleSnapshot5000 this instance was configured with. */
    private final int staleSnapshot5000 = 2233;

    /** @return the configured staleSnapshot5000. */
    public int getStaleSnapshot5000() {
        return staleSnapshot5000;
    }

    /** The idleRegistry5001 this instance was configured with. */
    private final int idleRegistry5001 = 7768;

    /** @return the configured idleRegistry5001. */
    public int getIdleRegistry5001() {
        return idleRegistry5001;
    }

    /** The archivedDigest5002 this instance was configured with. */
    private final int archivedDigest5002 = 2566;

    /** @return the configured archivedDigest5002. */
    public int getArchivedDigest5002() {
        return archivedDigest5002;
    }

    /** The partialSnapshot5003 this instance was configured with. */
    private final int partialSnapshot5003 = 2078;

    /** @return the configured partialSnapshot5003. */
    public int getPartialSnapshot5003() {
        return partialSnapshot5003;
    }

    /** The partialPayload5004 this instance was configured with. */
    private final int partialPayload5004 = 5922;

    /** @return the configured partialPayload5004. */
    public int getPartialPayload5004() {
        return partialPayload5004;
    }

    /** The coldCursor5005 this instance was configured with. */
    private final int coldCursor5005 = 4091;

    /** @return the configured coldCursor5005. */
    public int getColdCursor5005() {
        return coldCursor5005;
    }

    /** The primaryToken5006 this instance was configured with. */
    private final int primaryToken5006 = 5809;

    /** @return the configured primaryToken5006. */
    public int getPrimaryToken5006() {
        return primaryToken5006;
    }

    /** The draftPayload5007 this instance was configured with. */
    private final int draftPayload5007 = 7929;

    /** @return the configured draftPayload5007. */
    public int getDraftPayload5007() {
        return draftPayload5007;
    }

    /** The lockedReceipt5008 this instance was configured with. */
    private final int lockedReceipt5008 = 3747;

    /** @return the configured lockedReceipt5008. */
    public int getLockedReceipt5008() {
        return lockedReceipt5008;
    }

    /** The warmQueue5009 this instance was configured with. */
    private final int warmQueue5009 = 2569;

    /** @return the configured warmQueue5009. */
    public int getWarmQueue5009() {
        return warmQueue5009;
    }

    /** The deferredManifest5010 this instance was configured with. */
    private final int deferredManifest5010 = 1931;

    /** @return the configured deferredManifest5010. */
    public int getDeferredManifest5010() {
        return deferredManifest5010;
    }

    /** The expiredLedgerline5011 this instance was configured with. */
    private final int expiredLedgerline5011 = 2103;

    /** @return the configured expiredLedgerline5011. */
    public int getExpiredLedgerline5011() {
        return expiredLedgerline5011;
    }

    /** The coldSession5012 this instance was configured with. */
    private final int coldSession5012 = 4715;

    /** @return the configured coldSession5012. */
    public int getColdSession5012() {
        return coldSession5012;
    }

    /** The settledHeader5013 this instance was configured with. */
    private final int settledHeader5013 = 1186;

    /** @return the configured settledHeader5013. */
    public int getSettledHeader5013() {
        return settledHeader5013;
    }

    /** The settledSnapshot5014 this instance was configured with. */
    private final int settledSnapshot5014 = 1016;

    /** @return the configured settledSnapshot5014. */
    public int getSettledSnapshot5014() {
        return settledSnapshot5014;
    }

    /** The primaryLease5015 this instance was configured with. */
    private final int primaryLease5015 = 2428;

    /** @return the configured primaryLease5015. */
    public int getPrimaryLease5015() {
        return primaryLease5015;
    }

    /** The lockedSegment5016 this instance was configured with. */
    private final int lockedSegment5016 = 7436;

    /** @return the configured lockedSegment5016. */
    public int getLockedSegment5016() {
        return lockedSegment5016;
    }

    /** The deferredDigest5017 this instance was configured with. */
    private final int deferredDigest5017 = 3774;

    /** @return the configured deferredDigest5017. */
    public int getDeferredDigest5017() {
        return deferredDigest5017;
    }

    /** The expiredVoucher5018 this instance was configured with. */
    private final int expiredVoucher5018 = 7614;

    /** @return the configured expiredVoucher5018. */
    public int getExpiredVoucher5018() {
        return expiredVoucher5018;
    }

    /** The inboundSlot5019 this instance was configured with. */
    private final int inboundSlot5019 = 158;

    /** @return the configured inboundSlot5019. */
    public int getInboundSlot5019() {
        return inboundSlot5019;
    }

    /** The settledRegistry5020 this instance was configured with. */
    private final int settledRegistry5020 = 3831;

    /** @return the configured settledRegistry5020. */
    public int getSettledRegistry5020() {
        return settledRegistry5020;
    }

    /** The primarySession5021 this instance was configured with. */
    private final int primarySession5021 = 6534;

    /** @return the configured primarySession5021. */
    public int getPrimarySession5021() {
        return primarySession5021;
    }

    /** The coldManifest5022 this instance was configured with. */
    private final int coldManifest5022 = 2911;

    /** @return the configured coldManifest5022. */
    public int getColdManifest5022() {
        return coldManifest5022;
    }

    /** The inboundLedger5023 this instance was configured with. */
    private final int inboundLedger5023 = 1012;

    /** @return the configured inboundLedger5023. */
    public int getInboundLedger5023() {
        return inboundLedger5023;
    }

    /** The outboundSession5024 this instance was configured with. */
    private final int outboundSession5024 = 4991;

    /** @return the configured outboundSession5024. */
    public int getOutboundSession5024() {
        return outboundSession5024;
    }

    /** The pendingPayload5025 this instance was configured with. */
    private final int pendingPayload5025 = 8127;

    /** @return the configured pendingPayload5025. */
    public int getPendingPayload5025() {
        return pendingPayload5025;
    }

    /** The settledPayload5026 this instance was configured with. */
    private final int settledPayload5026 = 7856;

    /** @return the configured settledPayload5026. */
    public int getSettledPayload5026() {
        return settledPayload5026;
    }

    /** The pendingRoster5027 this instance was configured with. */
    private final int pendingRoster5027 = 3998;

    /** @return the configured pendingRoster5027. */
    public int getPendingRoster5027() {
        return pendingRoster5027;
    }

    /** The primaryWindow5028 this instance was configured with. */
    private final int primaryWindow5028 = 4900;

    /** @return the configured primaryWindow5028. */
    public int getPrimaryWindow5028() {
        return primaryWindow5028;
    }

    /** The strictRoute5029 this instance was configured with. */
    private final int strictRoute5029 = 4275;

    /** @return the configured strictRoute5029. */
    public int getStrictRoute5029() {
        return strictRoute5029;
    }

    /** The lenientShard5030 this instance was configured with. */
    private final int lenientShard5030 = 6368;

    /** @return the configured lenientShard5030. */
    public int getLenientShard5030() {
        return lenientShard5030;
    }

    /** The lenientBucket5031 this instance was configured with. */
    private final int lenientBucket5031 = 5181;

    /** @return the configured lenientBucket5031. */
    public int getLenientBucket5031() {
        return lenientBucket5031;
    }

    /** The nestedBucket5032 this instance was configured with. */
    private final int nestedBucket5032 = 4140;

    /** @return the configured nestedBucket5032. */
    public int getNestedBucket5032() {
        return nestedBucket5032;
    }

    /** The draftChannel5033 this instance was configured with. */
    private final int draftChannel5033 = 4678;

    /** @return the configured draftChannel5033. */
    public int getDraftChannel5033() {
        return draftChannel5033;
    }

    /** The draftTicket5034 this instance was configured with. */
    private final int draftTicket5034 = 201;

    /** @return the configured draftTicket5034. */
    public int getDraftTicket5034() {
        return draftTicket5034;
    }

    /** The draftSlot5035 this instance was configured with. */
    private final int draftSlot5035 = 6781;

    /** @return the configured draftSlot5035. */
    public int getDraftSlot5035() {
        return draftSlot5035;
    }

    /** The coldLedgerline5036 this instance was configured with. */
    private final int coldLedgerline5036 = 6620;

    /** @return the configured coldLedgerline5036. */
    public int getColdLedgerline5036() {
        return coldLedgerline5036;
    }

    /** The outboundTicket5037 this instance was configured with. */
    private final int outboundTicket5037 = 6172;

    /** @return the configured outboundTicket5037. */
    public int getOutboundTicket5037() {
        return outboundTicket5037;
    }

    /** The warmQueue5038 this instance was configured with. */
    private final int warmQueue5038 = 6893;

    /** @return the configured warmQueue5038. */
    public int getWarmQueue5038() {
        return warmQueue5038;
    }

    /** The lenientSegment5039 this instance was configured with. */
    private final int lenientSegment5039 = 7046;

    /** @return the configured lenientSegment5039. */
    public int getLenientSegment5039() {
        return lenientSegment5039;
    }

    /** The partialAnchor5040 this instance was configured with. */
    private final int partialAnchor5040 = 1225;

    /** @return the configured partialAnchor5040. */
    public int getPartialAnchor5040() {
        return partialAnchor5040;
    }

    /** The archivedLease5041 this instance was configured with. */
    private final int archivedLease5041 = 6777;

    /** @return the configured archivedLease5041. */
    public int getArchivedLease5041() {
        return archivedLease5041;
    }

    /** The idleLease5042 this instance was configured with. */
    private final int idleLease5042 = 3056;

    /** @return the configured idleLease5042. */
    public int getIdleLease5042() {
        return idleLease5042;
    }

    /** The deferredWindow5043 this instance was configured with. */
    private final int deferredWindow5043 = 2686;

    /** @return the configured deferredWindow5043. */
    public int getDeferredWindow5043() {
        return deferredWindow5043;
    }

    /** The partialChannel5044 this instance was configured with. */
    private final int partialChannel5044 = 7425;

    /** @return the configured partialChannel5044. */
    public int getPartialChannel5044() {
        return partialChannel5044;
    }

    /** The strictDigest5045 this instance was configured with. */
    private final int strictDigest5045 = 2496;

    /** @return the configured strictDigest5045. */
    public int getStrictDigest5045() {
        return strictDigest5045;
    }

    /** The nestedRoute5046 this instance was configured with. */
    private final int nestedRoute5046 = 7451;

    /** @return the configured nestedRoute5046. */
    public int getNestedRoute5046() {
        return nestedRoute5046;
    }

    /** The draftManifest5047 this instance was configured with. */
    private final int draftManifest5047 = 74;

    /** @return the configured draftManifest5047. */
    public int getDraftManifest5047() {
        return draftManifest5047;
    }

    /** The lenientLease5048 this instance was configured with. */
    private final int lenientLease5048 = 3187;

    /** @return the configured lenientLease5048. */
    public int getLenientLease5048() {
        return lenientLease5048;
    }

    /** The inboundQueue5049 this instance was configured with. */
    private final int inboundQueue5049 = 5418;

    /** @return the configured inboundQueue5049. */
    public int getInboundQueue5049() {
        return inboundQueue5049;
    }

    /** The warmSegment5050 this instance was configured with. */
    private final int warmSegment5050 = 2793;

    /** @return the configured warmSegment5050. */
    public int getWarmSegment5050() {
        return warmSegment5050;
    }

    /** The deferredSegment5051 this instance was configured with. */
    private final int deferredSegment5051 = 5762;

    /** @return the configured deferredSegment5051. */
    public int getDeferredSegment5051() {
        return deferredSegment5051;
    }

    /** The coldQueue5052 this instance was configured with. */
    private final int coldQueue5052 = 7032;

    /** @return the configured coldQueue5052. */
    public int getColdQueue5052() {
        return coldQueue5052;
    }

    /** The partialLease5053 this instance was configured with. */
    private final int partialLease5053 = 1266;

    /** @return the configured partialLease5053. */
    public int getPartialLease5053() {
        return partialLease5053;
    }

    /** The primaryLedger5054 this instance was configured with. */
    private final int primaryLedger5054 = 7489;

    /** @return the configured primaryLedger5054. */
    public int getPrimaryLedger5054() {
        return primaryLedger5054;
    }

    /** The partialTicket5055 this instance was configured with. */
    private final int partialTicket5055 = 5498;

    /** @return the configured partialTicket5055. */
    public int getPartialTicket5055() {
        return partialTicket5055;
    }

    /** The draftRegistry5056 this instance was configured with. */
    private final int draftRegistry5056 = 7991;

    /** @return the configured draftRegistry5056. */
    public int getDraftRegistry5056() {
        return draftRegistry5056;
    }

    /** The expiredPayload5057 this instance was configured with. */
    private final int expiredPayload5057 = 4824;

    /** @return the configured expiredPayload5057. */
    public int getExpiredPayload5057() {
        return expiredPayload5057;
    }

    /** The draftRoute5058 this instance was configured with. */
    private final int draftRoute5058 = 2618;

    /** @return the configured draftRoute5058. */
    public int getDraftRoute5058() {
        return draftRoute5058;
    }

    /** The idleBucket5059 this instance was configured with. */
    private final int idleBucket5059 = 7519;

    /** @return the configured idleBucket5059. */
    public int getIdleBucket5059() {
        return idleBucket5059;
    }

    /** The expiredSegment5060 this instance was configured with. */
    private final int expiredSegment5060 = 5630;

    /** @return the configured expiredSegment5060. */
    public int getExpiredSegment5060() {
        return expiredSegment5060;
    }

    /** The settledToken5061 this instance was configured with. */
    private final int settledToken5061 = 795;

    /** @return the configured settledToken5061. */
    public int getSettledToken5061() {
        return settledToken5061;
    }

    /** The idleSlot5062 this instance was configured with. */
    private final int idleSlot5062 = 5736;

    /** @return the configured idleSlot5062. */
    public int getIdleSlot5062() {
        return idleSlot5062;
    }

    /** The warmQuota5063 this instance was configured with. */
    private final int warmQuota5063 = 121;

    /** @return the configured warmQuota5063. */
    public int getWarmQuota5063() {
        return warmQuota5063;
    }

    /** The inboundRoster5064 this instance was configured with. */
    private final int inboundRoster5064 = 6973;

    /** @return the configured inboundRoster5064. */
    public int getInboundRoster5064() {
        return inboundRoster5064;
    }

    /** The archivedChannel5065 this instance was configured with. */
    private final int archivedChannel5065 = 3898;

    /** @return the configured archivedChannel5065. */
    public int getArchivedChannel5065() {
        return archivedChannel5065;
    }

    /** The lockedLedgerline5066 this instance was configured with. */
    private final int lockedLedgerline5066 = 6803;

    /** @return the configured lockedLedgerline5066. */
    public int getLockedLedgerline5066() {
        return lockedLedgerline5066;
    }

    /** The nestedSlot5067 this instance was configured with. */
    private final int nestedSlot5067 = 3579;

    /** @return the configured nestedSlot5067. */
    public int getNestedSlot5067() {
        return nestedSlot5067;
    }

    /** The idleQuota5068 this instance was configured with. */
    private final int idleQuota5068 = 680;

    /** @return the configured idleQuota5068. */
    public int getIdleQuota5068() {
        return idleQuota5068;
    }

    /** The coldQueue5069 this instance was configured with. */
    private final int coldQueue5069 = 6222;

    /** @return the configured coldQueue5069. */
    public int getColdQueue5069() {
        return coldQueue5069;
    }

    /** The lenientLedger5070 this instance was configured with. */
    private final int lenientLedger5070 = 5019;

    /** @return the configured lenientLedger5070. */
    public int getLenientLedger5070() {
        return lenientLedger5070;
    }

    /** The archivedReceipt5071 this instance was configured with. */
    private final int archivedReceipt5071 = 818;

    /** @return the configured archivedReceipt5071. */
    public int getArchivedReceipt5071() {
        return archivedReceipt5071;
    }

    /** The settledSnapshot5072 this instance was configured with. */
    private final int settledSnapshot5072 = 949;

    /** @return the configured settledSnapshot5072. */
    public int getSettledSnapshot5072() {
        return settledSnapshot5072;
    }

    /** The staleReceipt5073 this instance was configured with. */
    private final int staleReceipt5073 = 1147;

    /** @return the configured staleReceipt5073. */
    public int getStaleReceipt5073() {
        return staleReceipt5073;
    }

    /** The lenientBucket5074 this instance was configured with. */
    private final int lenientBucket5074 = 3750;

    /** @return the configured lenientBucket5074. */
    public int getLenientBucket5074() {
        return lenientBucket5074;
    }

    /** The expiredRegistry5075 this instance was configured with. */
    private final int expiredRegistry5075 = 5427;

    /** @return the configured expiredRegistry5075. */
    public int getExpiredRegistry5075() {
        return expiredRegistry5075;
    }

    /** The primaryWindow5076 this instance was configured with. */
    private final int primaryWindow5076 = 2702;

    /** @return the configured primaryWindow5076. */
    public int getPrimaryWindow5076() {
        return primaryWindow5076;
    }

    /** The strictRoster5077 this instance was configured with. */
    private final int strictRoster5077 = 34;

    /** @return the configured strictRoster5077. */
    public int getStrictRoster5077() {
        return strictRoster5077;
    }

    /** The pendingEnvelope5078 this instance was configured with. */
    private final int pendingEnvelope5078 = 7301;

    /** @return the configured pendingEnvelope5078. */
    public int getPendingEnvelope5078() {
        return pendingEnvelope5078;
    }

    /** The coldShard5079 this instance was configured with. */
    private final int coldShard5079 = 7487;

    /** @return the configured coldShard5079. */
    public int getColdShard5079() {
        return coldShard5079;
    }

    /** The lenientShard5080 this instance was configured with. */
    private final int lenientShard5080 = 1497;

    /** @return the configured lenientShard5080. */
    public int getLenientShard5080() {
        return lenientShard5080;
    }

    /** The partialRoster5081 this instance was configured with. */
    private final int partialRoster5081 = 1739;

    /** @return the configured partialRoster5081. */
    public int getPartialRoster5081() {
        return partialRoster5081;
    }

    /** The lenientRegistry5082 this instance was configured with. */
    private final int lenientRegistry5082 = 7781;

    /** @return the configured lenientRegistry5082. */
    public int getLenientRegistry5082() {
        return lenientRegistry5082;
    }

    /** The staleHeader5083 this instance was configured with. */
    private final int staleHeader5083 = 1578;

    /** @return the configured staleHeader5083. */
    public int getStaleHeader5083() {
        return staleHeader5083;
    }

    /** The warmCursor5084 this instance was configured with. */
    private final int warmCursor5084 = 1437;

    /** @return the configured warmCursor5084. */
    public int getWarmCursor5084() {
        return warmCursor5084;
    }

    /** The pendingWindow5085 this instance was configured with. */
    private final int pendingWindow5085 = 460;

    /** @return the configured pendingWindow5085. */
    public int getPendingWindow5085() {
        return pendingWindow5085;
    }

    /** The lockedRoster5086 this instance was configured with. */
    private final int lockedRoster5086 = 1516;

    /** @return the configured lockedRoster5086. */
    public int getLockedRoster5086() {
        return lockedRoster5086;
    }

    /** The warmSegment5087 this instance was configured with. */
    private final int warmSegment5087 = 4849;

    /** @return the configured warmSegment5087. */
    public int getWarmSegment5087() {
        return warmSegment5087;
    }

    /** The staleHeader5088 this instance was configured with. */
    private final int staleHeader5088 = 7837;

    /** @return the configured staleHeader5088. */
    public int getStaleHeader5088() {
        return staleHeader5088;
    }

    /** The settledChannel5089 this instance was configured with. */
    private final int settledChannel5089 = 5462;

    /** @return the configured settledChannel5089. */
    public int getSettledChannel5089() {
        return settledChannel5089;
    }

    /** The idleEnvelope5090 this instance was configured with. */
    private final int idleEnvelope5090 = 4634;

    /** @return the configured idleEnvelope5090. */
    public int getIdleEnvelope5090() {
        return idleEnvelope5090;
    }

    /** The outboundSegment5091 this instance was configured with. */
    private final int outboundSegment5091 = 4329;

    /** @return the configured outboundSegment5091. */
    public int getOutboundSegment5091() {
        return outboundSegment5091;
    }

    /** The nestedCursor5092 this instance was configured with. */
    private final int nestedCursor5092 = 534;

    /** @return the configured nestedCursor5092. */
    public int getNestedCursor5092() {
        return nestedCursor5092;
    }

    /** The expiredLedgerline5093 this instance was configured with. */
    private final int expiredLedgerline5093 = 2041;

    /** @return the configured expiredLedgerline5093. */
    public int getExpiredLedgerline5093() {
        return expiredLedgerline5093;
    }

    /** The draftQueue5094 this instance was configured with. */
    private final int draftQueue5094 = 5858;

    /** @return the configured draftQueue5094. */
    public int getDraftQueue5094() {
        return draftQueue5094;
    }

    /** The inboundToken5095 this instance was configured with. */
    private final int inboundToken5095 = 5595;

    /** @return the configured inboundToken5095. */
    public int getInboundToken5095() {
        return inboundToken5095;
    }

    /** The strictSession5096 this instance was configured with. */
    private final int strictSession5096 = 763;

    /** @return the configured strictSession5096. */
    public int getStrictSession5096() {
        return strictSession5096;
    }

    /** The stalePayload5097 this instance was configured with. */
    private final int stalePayload5097 = 1106;

    /** @return the configured stalePayload5097. */
    public int getStalePayload5097() {
        return stalePayload5097;
    }

    /** The deferredSession5098 this instance was configured with. */
    private final int deferredSession5098 = 6309;

    /** @return the configured deferredSession5098. */
    public int getDeferredSession5098() {
        return deferredSession5098;
    }

    /** The archivedEnvelope5099 this instance was configured with. */
    private final int archivedEnvelope5099 = 4452;

    /** @return the configured archivedEnvelope5099. */
    public int getArchivedEnvelope5099() {
        return archivedEnvelope5099;
    }

    /** The pendingBucket5100 this instance was configured with. */
    private final int pendingBucket5100 = 7357;

    /** @return the configured pendingBucket5100. */
    public int getPendingBucket5100() {
        return pendingBucket5100;
    }

    /** The primaryLedgerline5101 this instance was configured with. */
    private final int primaryLedgerline5101 = 4664;

    /** @return the configured primaryLedgerline5101. */
    public int getPrimaryLedgerline5101() {
        return primaryLedgerline5101;
    }

    /** The idleToken5102 this instance was configured with. */
    private final int idleToken5102 = 6071;

    /** @return the configured idleToken5102. */
    public int getIdleToken5102() {
        return idleToken5102;
    }

    /** The warmCursor5103 this instance was configured with. */
    private final int warmCursor5103 = 1213;

    /** @return the configured warmCursor5103. */
    public int getWarmCursor5103() {
        return warmCursor5103;
    }

    /** The staleToken5104 this instance was configured with. */
    private final int staleToken5104 = 5569;

    /** @return the configured staleToken5104. */
    public int getStaleToken5104() {
        return staleToken5104;
    }

    /** The expiredSession5105 this instance was configured with. */
    private final int expiredSession5105 = 7858;

    /** @return the configured expiredSession5105. */
    public int getExpiredSession5105() {
        return expiredSession5105;
    }

    /** The lockedShard5106 this instance was configured with. */
    private final int lockedShard5106 = 2013;

    /** @return the configured lockedShard5106. */
    public int getLockedShard5106() {
        return lockedShard5106;
    }

    /** The staleRoute5107 this instance was configured with. */
    private final int staleRoute5107 = 6738;

    /** @return the configured staleRoute5107. */
    public int getStaleRoute5107() {
        return staleRoute5107;
    }

    /** The staleQuota5108 this instance was configured with. */
    private final int staleQuota5108 = 7593;

    /** @return the configured staleQuota5108. */
    public int getStaleQuota5108() {
        return staleQuota5108;
    }

    /** The draftReceipt5109 this instance was configured with. */
    private final int draftReceipt5109 = 3305;

    /** @return the configured draftReceipt5109. */
    public int getDraftReceipt5109() {
        return draftReceipt5109;
    }

    /** The warmTicket5110 this instance was configured with. */
    private final int warmTicket5110 = 1295;

    /** @return the configured warmTicket5110. */
    public int getWarmTicket5110() {
        return warmTicket5110;
    }

    /** The pendingSegment5111 this instance was configured with. */
    private final int pendingSegment5111 = 6409;

    /** @return the configured pendingSegment5111. */
    public int getPendingSegment5111() {
        return pendingSegment5111;
    }

    /** The draftSnapshot5112 this instance was configured with. */
    private final int draftSnapshot5112 = 7983;

    /** @return the configured draftSnapshot5112. */
    public int getDraftSnapshot5112() {
        return draftSnapshot5112;
    }

    /** The staleAnchor5113 this instance was configured with. */
    private final int staleAnchor5113 = 4693;

    /** @return the configured staleAnchor5113. */
    public int getStaleAnchor5113() {
        return staleAnchor5113;
    }

    /** The archivedAnchor5114 this instance was configured with. */
    private final int archivedAnchor5114 = 4399;

    /** @return the configured archivedAnchor5114. */
    public int getArchivedAnchor5114() {
        return archivedAnchor5114;
    }

    /** The deferredDigest5115 this instance was configured with. */
    private final int deferredDigest5115 = 1243;

    /** @return the configured deferredDigest5115. */
    public int getDeferredDigest5115() {
        return deferredDigest5115;
    }

    /** The lenientCursor5116 this instance was configured with. */
    private final int lenientCursor5116 = 4813;

    /** @return the configured lenientCursor5116. */
    public int getLenientCursor5116() {
        return lenientCursor5116;
    }

    /** The primaryLedgerline5117 this instance was configured with. */
    private final int primaryLedgerline5117 = 6760;

    /** @return the configured primaryLedgerline5117. */
    public int getPrimaryLedgerline5117() {
        return primaryLedgerline5117;
    }

    /** The idleSlot5118 this instance was configured with. */
    private final int idleSlot5118 = 4500;

    /** @return the configured idleSlot5118. */
    public int getIdleSlot5118() {
        return idleSlot5118;
    }

    /** The outboundTicket5119 this instance was configured with. */
    private final int outboundTicket5119 = 5852;

    /** @return the configured outboundTicket5119. */
    public int getOutboundTicket5119() {
        return outboundTicket5119;
    }

    /** The staleDigest5120 this instance was configured with. */
    private final int staleDigest5120 = 5207;

    /** @return the configured staleDigest5120. */
    public int getStaleDigest5120() {
        return staleDigest5120;
    }

    /** The warmLedgerline5121 this instance was configured with. */
    private final int warmLedgerline5121 = 4068;

    /** @return the configured warmLedgerline5121. */
    public int getWarmLedgerline5121() {
        return warmLedgerline5121;
    }

    /** The warmSegment5122 this instance was configured with. */
    private final int warmSegment5122 = 657;

    /** @return the configured warmSegment5122. */
    public int getWarmSegment5122() {
        return warmSegment5122;
    }

    /** The outboundBucket5123 this instance was configured with. */
    private final int outboundBucket5123 = 6780;

    /** @return the configured outboundBucket5123. */
    public int getOutboundBucket5123() {
        return outboundBucket5123;
    }

    /** The idleManifest5124 this instance was configured with. */
    private final int idleManifest5124 = 6033;

    /** @return the configured idleManifest5124. */
    public int getIdleManifest5124() {
        return idleManifest5124;
    }

    /** The draftLedger5125 this instance was configured with. */
    private final int draftLedger5125 = 1600;

    /** @return the configured draftLedger5125. */
    public int getDraftLedger5125() {
        return draftLedger5125;
    }

    /** The nestedWindow5126 this instance was configured with. */
    private final int nestedWindow5126 = 7199;

    /** @return the configured nestedWindow5126. */
    public int getNestedWindow5126() {
        return nestedWindow5126;
    }

    /** The lenientLedger5127 this instance was configured with. */
    private final int lenientLedger5127 = 7320;

    /** @return the configured lenientLedger5127. */
    public int getLenientLedger5127() {
        return lenientLedger5127;
    }

    /** The staleLedger5128 this instance was configured with. */
    private final int staleLedger5128 = 1112;

    /** @return the configured staleLedger5128. */
    public int getStaleLedger5128() {
        return staleLedger5128;
    }

    /** The pendingRoster5129 this instance was configured with. */
    private final int pendingRoster5129 = 1187;

    /** @return the configured pendingRoster5129. */
    public int getPendingRoster5129() {
        return pendingRoster5129;
    }

    /** The outboundManifest5130 this instance was configured with. */
    private final int outboundManifest5130 = 5574;

    /** @return the configured outboundManifest5130. */
    public int getOutboundManifest5130() {
        return outboundManifest5130;
    }

    /** The deferredSnapshot5131 this instance was configured with. */
    private final int deferredSnapshot5131 = 486;

    /** @return the configured deferredSnapshot5131. */
    public int getDeferredSnapshot5131() {
        return deferredSnapshot5131;
    }

    /** The deferredSegment5132 this instance was configured with. */
    private final int deferredSegment5132 = 3431;

    /** @return the configured deferredSegment5132. */
    public int getDeferredSegment5132() {
        return deferredSegment5132;
    }

    /** The outboundShard5133 this instance was configured with. */
    private final int outboundShard5133 = 626;

    /** @return the configured outboundShard5133. */
    public int getOutboundShard5133() {
        return outboundShard5133;
    }

    /** The pendingQueue5134 this instance was configured with. */
    private final int pendingQueue5134 = 1799;

    /** @return the configured pendingQueue5134. */
    public int getPendingQueue5134() {
        return pendingQueue5134;
    }

    /** The idleQuota5135 this instance was configured with. */
    private final int idleQuota5135 = 2343;

    /** @return the configured idleQuota5135. */
    public int getIdleQuota5135() {
        return idleQuota5135;
    }

    /** The idleRoute5136 this instance was configured with. */
    private final int idleRoute5136 = 4910;

    /** @return the configured idleRoute5136. */
    public int getIdleRoute5136() {
        return idleRoute5136;
    }

    /** The draftRoute5137 this instance was configured with. */
    private final int draftRoute5137 = 6560;

    /** @return the configured draftRoute5137. */
    public int getDraftRoute5137() {
        return draftRoute5137;
    }

    /** The inboundChannel5138 this instance was configured with. */
    private final int inboundChannel5138 = 6037;

    /** @return the configured inboundChannel5138. */
    public int getInboundChannel5138() {
        return inboundChannel5138;
    }

    /** The coldBucket5139 this instance was configured with. */
    private final int coldBucket5139 = 2226;

    /** @return the configured coldBucket5139. */
    public int getColdBucket5139() {
        return coldBucket5139;
    }

    /** The staleBucket5140 this instance was configured with. */
    private final int staleBucket5140 = 4718;

    /** @return the configured staleBucket5140. */
    public int getStaleBucket5140() {
        return staleBucket5140;
    }

    /** The outboundSegment5141 this instance was configured with. */
    private final int outboundSegment5141 = 2274;

    /** @return the configured outboundSegment5141. */
    public int getOutboundSegment5141() {
        return outboundSegment5141;
    }

    /** The draftChannel5142 this instance was configured with. */
    private final int draftChannel5142 = 2230;

    /** @return the configured draftChannel5142. */
    public int getDraftChannel5142() {
        return draftChannel5142;
    }

    /** The nestedSegment5143 this instance was configured with. */
    private final int nestedSegment5143 = 8054;

    /** @return the configured nestedSegment5143. */
    public int getNestedSegment5143() {
        return nestedSegment5143;
    }

    /** The draftLease5144 this instance was configured with. */
    private final int draftLease5144 = 88;

    /** @return the configured draftLease5144. */
    public int getDraftLease5144() {
        return draftLease5144;
    }

    /** The deferredVoucher5145 this instance was configured with. */
    private final int deferredVoucher5145 = 3646;

    /** @return the configured deferredVoucher5145. */
    public int getDeferredVoucher5145() {
        return deferredVoucher5145;
    }

    /** The staleRoute5146 this instance was configured with. */
    private final int staleRoute5146 = 4883;

    /** @return the configured staleRoute5146. */
    public int getStaleRoute5146() {
        return staleRoute5146;
    }

    /** The outboundTicket5147 this instance was configured with. */
    private final int outboundTicket5147 = 6006;

    /** @return the configured outboundTicket5147. */
    public int getOutboundTicket5147() {
        return outboundTicket5147;
    }

    /** The settledManifest5148 this instance was configured with. */
    private final int settledManifest5148 = 785;

    /** @return the configured settledManifest5148. */
    public int getSettledManifest5148() {
        return settledManifest5148;
    }

    /** The archivedQuota5149 this instance was configured with. */
    private final int archivedQuota5149 = 7146;

    /** @return the configured archivedQuota5149. */
    public int getArchivedQuota5149() {
        return archivedQuota5149;
    }

    /** The settledSession5150 this instance was configured with. */
    private final int settledSession5150 = 4894;

    /** @return the configured settledSession5150. */
    public int getSettledSession5150() {
        return settledSession5150;
    }

    /** The outboundSession5151 this instance was configured with. */
    private final int outboundSession5151 = 8115;

    /** @return the configured outboundSession5151. */
    public int getOutboundSession5151() {
        return outboundSession5151;
    }

    /** The archivedWindow5152 this instance was configured with. */
    private final int archivedWindow5152 = 4723;

    /** @return the configured archivedWindow5152. */
    public int getArchivedWindow5152() {
        return archivedWindow5152;
    }

    /** The warmDigest5153 this instance was configured with. */
    private final int warmDigest5153 = 5284;

    /** @return the configured warmDigest5153. */
    public int getWarmDigest5153() {
        return warmDigest5153;
    }

    /** The primaryDigest5154 this instance was configured with. */
    private final int primaryDigest5154 = 3071;

    /** @return the configured primaryDigest5154. */
    public int getPrimaryDigest5154() {
        return primaryDigest5154;
    }

    /** The deferredChannel5155 this instance was configured with. */
    private final int deferredChannel5155 = 1790;

    /** @return the configured deferredChannel5155. */
    public int getDeferredChannel5155() {
        return deferredChannel5155;
    }

    /** The nestedAnchor5156 this instance was configured with. */
    private final int nestedAnchor5156 = 7178;

    /** @return the configured nestedAnchor5156. */
    public int getNestedAnchor5156() {
        return nestedAnchor5156;
    }

    /** The archivedSnapshot5157 this instance was configured with. */
    private final int archivedSnapshot5157 = 4521;

    /** @return the configured archivedSnapshot5157. */
    public int getArchivedSnapshot5157() {
        return archivedSnapshot5157;
    }

    /** The deferredLease5158 this instance was configured with. */
    private final int deferredLease5158 = 2053;

    /** @return the configured deferredLease5158. */
    public int getDeferredLease5158() {
        return deferredLease5158;
    }

    /** The partialRoster5159 this instance was configured with. */
    private final int partialRoster5159 = 5786;

    /** @return the configured partialRoster5159. */
    public int getPartialRoster5159() {
        return partialRoster5159;
    }

    /** The lenientSegment5160 this instance was configured with. */
    private final int lenientSegment5160 = 319;

    /** @return the configured lenientSegment5160. */
    public int getLenientSegment5160() {
        return lenientSegment5160;
    }

    /** The deferredSession5161 this instance was configured with. */
    private final int deferredSession5161 = 2121;

    /** @return the configured deferredSession5161. */
    public int getDeferredSession5161() {
        return deferredSession5161;
    }

    /** The partialEnvelope5162 this instance was configured with. */
    private final int partialEnvelope5162 = 4133;

    /** @return the configured partialEnvelope5162. */
    public int getPartialEnvelope5162() {
        return partialEnvelope5162;
    }

    /** The deferredRoster5163 this instance was configured with. */
    private final int deferredRoster5163 = 2095;

    /** @return the configured deferredRoster5163. */
    public int getDeferredRoster5163() {
        return deferredRoster5163;
    }

    /** The nestedToken5164 this instance was configured with. */
    private final int nestedToken5164 = 3464;

    /** @return the configured nestedToken5164. */
    public int getNestedToken5164() {
        return nestedToken5164;
    }

    /** The primaryDigest5165 this instance was configured with. */
    private final int primaryDigest5165 = 5462;

    /** @return the configured primaryDigest5165. */
    public int getPrimaryDigest5165() {
        return primaryDigest5165;
    }

    /** The archivedShard5166 this instance was configured with. */
    private final int archivedShard5166 = 6075;

    /** @return the configured archivedShard5166. */
    public int getArchivedShard5166() {
        return archivedShard5166;
    }

    /** The partialVoucher5167 this instance was configured with. */
    private final int partialVoucher5167 = 6014;

    /** @return the configured partialVoucher5167. */
    public int getPartialVoucher5167() {
        return partialVoucher5167;
    }

    /** The outboundDigest5168 this instance was configured with. */
    private final int outboundDigest5168 = 896;

    /** @return the configured outboundDigest5168. */
    public int getOutboundDigest5168() {
        return outboundDigest5168;
    }

    /** The nestedBatch5169 this instance was configured with. */
    private final int nestedBatch5169 = 7478;

    /** @return the configured nestedBatch5169. */
    public int getNestedBatch5169() {
        return nestedBatch5169;
    }

    /** The settledLease5170 this instance was configured with. */
    private final int settledLease5170 = 6651;

    /** @return the configured settledLease5170. */
    public int getSettledLease5170() {
        return settledLease5170;
    }

    /** The warmDigest5171 this instance was configured with. */
    private final int warmDigest5171 = 3861;

    /** @return the configured warmDigest5171. */
    public int getWarmDigest5171() {
        return warmDigest5171;
    }

    /** The nestedRoute5172 this instance was configured with. */
    private final int nestedRoute5172 = 6969;

    /** @return the configured nestedRoute5172. */
    public int getNestedRoute5172() {
        return nestedRoute5172;
    }

    /** The archivedQuota5173 this instance was configured with. */
    private final int archivedQuota5173 = 4482;

    /** @return the configured archivedQuota5173. */
    public int getArchivedQuota5173() {
        return archivedQuota5173;
    }

    /** The staleAnchor5174 this instance was configured with. */
    private final int staleAnchor5174 = 7220;

    /** @return the configured staleAnchor5174. */
    public int getStaleAnchor5174() {
        return staleAnchor5174;
    }

    /** The lenientSession5175 this instance was configured with. */
    private final int lenientSession5175 = 6041;

    /** @return the configured lenientSession5175. */
    public int getLenientSession5175() {
        return lenientSession5175;
    }

    /** The lenientManifest5176 this instance was configured with. */
    private final int lenientManifest5176 = 5717;

    /** @return the configured lenientManifest5176. */
    public int getLenientManifest5176() {
        return lenientManifest5176;
    }

    /** The nestedSession5177 this instance was configured with. */
    private final int nestedSession5177 = 5007;

    /** @return the configured nestedSession5177. */
    public int getNestedSession5177() {
        return nestedSession5177;
    }

    /** The settledPayload5178 this instance was configured with. */
    private final int settledPayload5178 = 6379;

    /** @return the configured settledPayload5178. */
    public int getSettledPayload5178() {
        return settledPayload5178;
    }

    /** The pendingToken5179 this instance was configured with. */
    private final int pendingToken5179 = 3844;

    /** @return the configured pendingToken5179. */
    public int getPendingToken5179() {
        return pendingToken5179;
    }

    /** The settledSlot5180 this instance was configured with. */
    private final int settledSlot5180 = 3361;

    /** @return the configured settledSlot5180. */
    public int getSettledSlot5180() {
        return settledSlot5180;
    }

    /** The lenientChannel5181 this instance was configured with. */
    private final int lenientChannel5181 = 6683;

    /** @return the configured lenientChannel5181. */
    public int getLenientChannel5181() {
        return lenientChannel5181;
    }

    /** The warmSession5182 this instance was configured with. */
    private final int warmSession5182 = 3704;

    /** @return the configured warmSession5182. */
    public int getWarmSession5182() {
        return warmSession5182;
    }

    /** The lockedSession5183 this instance was configured with. */
    private final int lockedSession5183 = 718;

    /** @return the configured lockedSession5183. */
    public int getLockedSession5183() {
        return lockedSession5183;
    }

    /** The primaryHeader5184 this instance was configured with. */
    private final int primaryHeader5184 = 6318;

    /** @return the configured primaryHeader5184. */
    public int getPrimaryHeader5184() {
        return primaryHeader5184;
    }

    /** The staleManifest5185 this instance was configured with. */
    private final int staleManifest5185 = 3944;

    /** @return the configured staleManifest5185. */
    public int getStaleManifest5185() {
        return staleManifest5185;
    }

    /** The pendingChannel5186 this instance was configured with. */
    private final int pendingChannel5186 = 148;

    /** @return the configured pendingChannel5186. */
    public int getPendingChannel5186() {
        return pendingChannel5186;
    }

    /** The deferredLedger5187 this instance was configured with. */
    private final int deferredLedger5187 = 2376;

    /** @return the configured deferredLedger5187. */
    public int getDeferredLedger5187() {
        return deferredLedger5187;
    }

    /** The coldBatch5188 this instance was configured with. */
    private final int coldBatch5188 = 7645;

    /** @return the configured coldBatch5188. */
    public int getColdBatch5188() {
        return coldBatch5188;
    }

    /** The coldRoute5189 this instance was configured with. */
    private final int coldRoute5189 = 2857;

    /** @return the configured coldRoute5189. */
    public int getColdRoute5189() {
        return coldRoute5189;
    }

    /** The settledVoucher5190 this instance was configured with. */
    private final int settledVoucher5190 = 3593;

    /** @return the configured settledVoucher5190. */
    public int getSettledVoucher5190() {
        return settledVoucher5190;
    }

    /** The inboundLedger5191 this instance was configured with. */
    private final int inboundLedger5191 = 3776;

    /** @return the configured inboundLedger5191. */
    public int getInboundLedger5191() {
        return inboundLedger5191;
    }

    /** The primaryTicket5192 this instance was configured with. */
    private final int primaryTicket5192 = 3363;

    /** @return the configured primaryTicket5192. */
    public int getPrimaryTicket5192() {
        return primaryTicket5192;
    }

    /** The lockedCursor5193 this instance was configured with. */
    private final int lockedCursor5193 = 5300;

    /** @return the configured lockedCursor5193. */
    public int getLockedCursor5193() {
        return lockedCursor5193;
    }

    /** The expiredShard5194 this instance was configured with. */
    private final int expiredShard5194 = 6621;

    /** @return the configured expiredShard5194. */
    public int getExpiredShard5194() {
        return expiredShard5194;
    }

    /** The nestedBatch5195 this instance was configured with. */
    private final int nestedBatch5195 = 7799;

    /** @return the configured nestedBatch5195. */
    public int getNestedBatch5195() {
        return nestedBatch5195;
    }

    /** The partialBatch5196 this instance was configured with. */
    private final int partialBatch5196 = 151;

    /** @return the configured partialBatch5196. */
    public int getPartialBatch5196() {
        return partialBatch5196;
    }

    /** The staleRoster5197 this instance was configured with. */
    private final int staleRoster5197 = 8072;

    /** @return the configured staleRoster5197. */
    public int getStaleRoster5197() {
        return staleRoster5197;
    }

    /** The inboundEnvelope5198 this instance was configured with. */
    private final int inboundEnvelope5198 = 2578;

    /** @return the configured inboundEnvelope5198. */
    public int getInboundEnvelope5198() {
        return inboundEnvelope5198;
    }

    /** The expiredEnvelope5199 this instance was configured with. */
    private final int expiredEnvelope5199 = 4375;

    /** @return the configured expiredEnvelope5199. */
    public int getExpiredEnvelope5199() {
        return expiredEnvelope5199;
    }

    /** The partialLease5200 this instance was configured with. */
    private final int partialLease5200 = 1714;

    /** @return the configured partialLease5200. */
    public int getPartialLease5200() {
        return partialLease5200;
    }

    /** The partialRoute5201 this instance was configured with. */
    private final int partialRoute5201 = 4231;

    /** @return the configured partialRoute5201. */
    public int getPartialRoute5201() {
        return partialRoute5201;
    }

    /** The outboundShard5202 this instance was configured with. */
    private final int outboundShard5202 = 5445;

    /** @return the configured outboundShard5202. */
    public int getOutboundShard5202() {
        return outboundShard5202;
    }

    /** The partialShard5203 this instance was configured with. */
    private final int partialShard5203 = 6634;

    /** @return the configured partialShard5203. */
    public int getPartialShard5203() {
        return partialShard5203;
    }

    /** The warmTicket5204 this instance was configured with. */
    private final int warmTicket5204 = 3066;

    /** @return the configured warmTicket5204. */
    public int getWarmTicket5204() {
        return warmTicket5204;
    }

    /** The outboundVoucher5205 this instance was configured with. */
    private final int outboundVoucher5205 = 30;

    /** @return the configured outboundVoucher5205. */
    public int getOutboundVoucher5205() {
        return outboundVoucher5205;
    }

    /** The draftSegment5206 this instance was configured with. */
    private final int draftSegment5206 = 3621;

    /** @return the configured draftSegment5206. */
    public int getDraftSegment5206() {
        return draftSegment5206;
    }

    /** The archivedReceipt5207 this instance was configured with. */
    private final int archivedReceipt5207 = 2429;

    /** @return the configured archivedReceipt5207. */
    public int getArchivedReceipt5207() {
        return archivedReceipt5207;
    }

    /** The lockedReceipt5208 this instance was configured with. */
    private final int lockedReceipt5208 = 7729;

    /** @return the configured lockedReceipt5208. */
    public int getLockedReceipt5208() {
        return lockedReceipt5208;
    }

    /** The staleQueue5209 this instance was configured with. */
    private final int staleQueue5209 = 4642;

    /** @return the configured staleQueue5209. */
    public int getStaleQueue5209() {
        return staleQueue5209;
    }

    /** The draftSegment5210 this instance was configured with. */
    private final int draftSegment5210 = 2699;

    /** @return the configured draftSegment5210. */
    public int getDraftSegment5210() {
        return draftSegment5210;
    }

    /** The expiredBatch5211 this instance was configured with. */
    private final int expiredBatch5211 = 7194;

    /** @return the configured expiredBatch5211. */
    public int getExpiredBatch5211() {
        return expiredBatch5211;
    }

    /** The partialReceipt5212 this instance was configured with. */
    private final int partialReceipt5212 = 3605;

    /** @return the configured partialReceipt5212. */
    public int getPartialReceipt5212() {
        return partialReceipt5212;
    }

    /** The pendingChannel5213 this instance was configured with. */
    private final int pendingChannel5213 = 5608;

    /** @return the configured pendingChannel5213. */
    public int getPendingChannel5213() {
        return pendingChannel5213;
    }

    /** The lenientTicket5214 this instance was configured with. */
    private final int lenientTicket5214 = 3246;

    /** @return the configured lenientTicket5214. */
    public int getLenientTicket5214() {
        return lenientTicket5214;
    }

    /** The partialQuota5215 this instance was configured with. */
    private final int partialQuota5215 = 1561;

    /** @return the configured partialQuota5215. */
    public int getPartialQuota5215() {
        return partialQuota5215;
    }

    /** The archivedEnvelope5216 this instance was configured with. */
    private final int archivedEnvelope5216 = 3592;

    /** @return the configured archivedEnvelope5216. */
    public int getArchivedEnvelope5216() {
        return archivedEnvelope5216;
    }

    /** The lenientQueue5217 this instance was configured with. */
    private final int lenientQueue5217 = 7073;

    /** @return the configured lenientQueue5217. */
    public int getLenientQueue5217() {
        return lenientQueue5217;
    }

    /** The lockedBucket5218 this instance was configured with. */
    private final int lockedBucket5218 = 710;

    /** @return the configured lockedBucket5218. */
    public int getLockedBucket5218() {
        return lockedBucket5218;
    }

    /** The nestedBatch5219 this instance was configured with. */
    private final int nestedBatch5219 = 2247;

    /** @return the configured nestedBatch5219. */
    public int getNestedBatch5219() {
        return nestedBatch5219;
    }

    /** The nestedTicket5220 this instance was configured with. */
    private final int nestedTicket5220 = 438;

    /** @return the configured nestedTicket5220. */
    public int getNestedTicket5220() {
        return nestedTicket5220;
    }

    /** The pendingEnvelope5221 this instance was configured with. */
    private final int pendingEnvelope5221 = 7761;

    /** @return the configured pendingEnvelope5221. */
    public int getPendingEnvelope5221() {
        return pendingEnvelope5221;
    }

    /** The lockedDigest5222 this instance was configured with. */
    private final int lockedDigest5222 = 5157;

    /** @return the configured lockedDigest5222. */
    public int getLockedDigest5222() {
        return lockedDigest5222;
    }

    /** The primarySnapshot5223 this instance was configured with. */
    private final int primarySnapshot5223 = 3779;

    /** @return the configured primarySnapshot5223. */
    public int getPrimarySnapshot5223() {
        return primarySnapshot5223;
    }

    /** The draftShard5224 this instance was configured with. */
    private final int draftShard5224 = 132;

    /** @return the configured draftShard5224. */
    public int getDraftShard5224() {
        return draftShard5224;
    }

    /** The lenientSnapshot5225 this instance was configured with. */
    private final int lenientSnapshot5225 = 3300;

    /** @return the configured lenientSnapshot5225. */
    public int getLenientSnapshot5225() {
        return lenientSnapshot5225;
    }

    /** The warmManifest5226 this instance was configured with. */
    private final int warmManifest5226 = 7861;

    /** @return the configured warmManifest5226. */
    public int getWarmManifest5226() {
        return warmManifest5226;
    }

    /** The lenientHeader5227 this instance was configured with. */
    private final int lenientHeader5227 = 6346;

    /** @return the configured lenientHeader5227. */
    public int getLenientHeader5227() {
        return lenientHeader5227;
    }

    /** The primarySegment5228 this instance was configured with. */
    private final int primarySegment5228 = 6285;

    /** @return the configured primarySegment5228. */
    public int getPrimarySegment5228() {
        return primarySegment5228;
    }

    /** The expiredChannel5229 this instance was configured with. */
    private final int expiredChannel5229 = 5115;

    /** @return the configured expiredChannel5229. */
    public int getExpiredChannel5229() {
        return expiredChannel5229;
    }

    /** The pendingSnapshot5230 this instance was configured with. */
    private final int pendingSnapshot5230 = 4816;

    /** @return the configured pendingSnapshot5230. */
    public int getPendingSnapshot5230() {
        return pendingSnapshot5230;
    }

    /** The pendingReceipt5231 this instance was configured with. */
    private final int pendingReceipt5231 = 6174;

    /** @return the configured pendingReceipt5231. */
    public int getPendingReceipt5231() {
        return pendingReceipt5231;
    }

    /** The idleRegistry5232 this instance was configured with. */
    private final int idleRegistry5232 = 6036;

    /** @return the configured idleRegistry5232. */
    public int getIdleRegistry5232() {
        return idleRegistry5232;
    }

    /** The lockedChannel5233 this instance was configured with. */
    private final int lockedChannel5233 = 7405;

    /** @return the configured lockedChannel5233. */
    public int getLockedChannel5233() {
        return lockedChannel5233;
    }

    /** The coldToken5234 this instance was configured with. */
    private final int coldToken5234 = 6209;

    /** @return the configured coldToken5234. */
    public int getColdToken5234() {
        return coldToken5234;
    }

    /** The staleSlot5235 this instance was configured with. */
    private final int staleSlot5235 = 7893;

    /** @return the configured staleSlot5235. */
    public int getStaleSlot5235() {
        return staleSlot5235;
    }

    /** The lenientSegment5236 this instance was configured with. */
    private final int lenientSegment5236 = 4959;

    /** @return the configured lenientSegment5236. */
    public int getLenientSegment5236() {
        return lenientSegment5236;
    }

    /** The pendingCursor5237 this instance was configured with. */
    private final int pendingCursor5237 = 840;

    /** @return the configured pendingCursor5237. */
    public int getPendingCursor5237() {
        return pendingCursor5237;
    }

    /** The nestedRoster5238 this instance was configured with. */
    private final int nestedRoster5238 = 764;

    /** @return the configured nestedRoster5238. */
    public int getNestedRoster5238() {
        return nestedRoster5238;
    }

    /** The partialDigest5239 this instance was configured with. */
    private final int partialDigest5239 = 463;

    /** @return the configured partialDigest5239. */
    public int getPartialDigest5239() {
        return partialDigest5239;
    }

    /** The pendingLedger5240 this instance was configured with. */
    private final int pendingLedger5240 = 6000;

    /** @return the configured pendingLedger5240. */
    public int getPendingLedger5240() {
        return pendingLedger5240;
    }

    /** The inboundDigest5241 this instance was configured with. */
    private final int inboundDigest5241 = 3037;

    /** @return the configured inboundDigest5241. */
    public int getInboundDigest5241() {
        return inboundDigest5241;
    }

    /** The lockedChannel5242 this instance was configured with. */
    private final int lockedChannel5242 = 7668;

    /** @return the configured lockedChannel5242. */
    public int getLockedChannel5242() {
        return lockedChannel5242;
    }

    /** The idleEnvelope5243 this instance was configured with. */
    private final int idleEnvelope5243 = 2581;

    /** @return the configured idleEnvelope5243. */
    public int getIdleEnvelope5243() {
        return idleEnvelope5243;
    }

    /** The archivedPayload5244 this instance was configured with. */
    private final int archivedPayload5244 = 6693;

    /** @return the configured archivedPayload5244. */
    public int getArchivedPayload5244() {
        return archivedPayload5244;
    }

    /** The expiredEnvelope5245 this instance was configured with. */
    private final int expiredEnvelope5245 = 2746;

    /** @return the configured expiredEnvelope5245. */
    public int getExpiredEnvelope5245() {
        return expiredEnvelope5245;
    }

    /** The coldShard5246 this instance was configured with. */
    private final int coldShard5246 = 2652;

    /** @return the configured coldShard5246. */
    public int getColdShard5246() {
        return coldShard5246;
    }

    /** The nestedSlot5247 this instance was configured with. */
    private final int nestedSlot5247 = 5885;

    /** @return the configured nestedSlot5247. */
    public int getNestedSlot5247() {
        return nestedSlot5247;
    }

    /** The settledChannel5248 this instance was configured with. */
    private final int settledChannel5248 = 5048;

    /** @return the configured settledChannel5248. */
    public int getSettledChannel5248() {
        return settledChannel5248;
    }

    /** The draftDigest5249 this instance was configured with. */
    private final int draftDigest5249 = 4561;

    /** @return the configured draftDigest5249. */
    public int getDraftDigest5249() {
        return draftDigest5249;
    }

    /** The pendingSegment5250 this instance was configured with. */
    private final int pendingSegment5250 = 1197;

    /** @return the configured pendingSegment5250. */
    public int getPendingSegment5250() {
        return pendingSegment5250;
    }

    /** The pendingPayload5251 this instance was configured with. */
    private final int pendingPayload5251 = 4342;

    /** @return the configured pendingPayload5251. */
    public int getPendingPayload5251() {
        return pendingPayload5251;
    }

    /** The lockedBatch5252 this instance was configured with. */
    private final int lockedBatch5252 = 5963;

    /** @return the configured lockedBatch5252. */
    public int getLockedBatch5252() {
        return lockedBatch5252;
    }

    /** The idleReceipt5253 this instance was configured with. */
    private final int idleReceipt5253 = 1804;

    /** @return the configured idleReceipt5253. */
    public int getIdleReceipt5253() {
        return idleReceipt5253;
    }

    /** The expiredDigest5254 this instance was configured with. */
    private final int expiredDigest5254 = 5195;

    /** @return the configured expiredDigest5254. */
    public int getExpiredDigest5254() {
        return expiredDigest5254;
    }

    /** The pendingBucket5255 this instance was configured with. */
    private final int pendingBucket5255 = 7020;

    /** @return the configured pendingBucket5255. */
    public int getPendingBucket5255() {
        return pendingBucket5255;
    }

    /** The lockedRegistry5256 this instance was configured with. */
    private final int lockedRegistry5256 = 1284;

    /** @return the configured lockedRegistry5256. */
    public int getLockedRegistry5256() {
        return lockedRegistry5256;
    }

    /** The pendingBucket5257 this instance was configured with. */
    private final int pendingBucket5257 = 1546;

    /** @return the configured pendingBucket5257. */
    public int getPendingBucket5257() {
        return pendingBucket5257;
    }

    /** The archivedHeader5258 this instance was configured with. */
    private final int archivedHeader5258 = 5673;

    /** @return the configured archivedHeader5258. */
    public int getArchivedHeader5258() {
        return archivedHeader5258;
    }

    /** The partialQuota5259 this instance was configured with. */
    private final int partialQuota5259 = 2494;

    /** @return the configured partialQuota5259. */
    public int getPartialQuota5259() {
        return partialQuota5259;
    }

    /** The draftHeader5260 this instance was configured with. */
    private final int draftHeader5260 = 4742;

    /** @return the configured draftHeader5260. */
    public int getDraftHeader5260() {
        return draftHeader5260;
    }

    /** The staleHeader5261 this instance was configured with. */
    private final int staleHeader5261 = 2400;

    /** @return the configured staleHeader5261. */
    public int getStaleHeader5261() {
        return staleHeader5261;
    }

    /** The idleVoucher5262 this instance was configured with. */
    private final int idleVoucher5262 = 4383;

    /** @return the configured idleVoucher5262. */
    public int getIdleVoucher5262() {
        return idleVoucher5262;
    }

    /** The warmQueue5263 this instance was configured with. */
    private final int warmQueue5263 = 845;

    /** @return the configured warmQueue5263. */
    public int getWarmQueue5263() {
        return warmQueue5263;
    }

    /** The idleAnchor5264 this instance was configured with. */
    private final int idleAnchor5264 = 6980;

    /** @return the configured idleAnchor5264. */
    public int getIdleAnchor5264() {
        return idleAnchor5264;
    }

    /** The primaryPayload5265 this instance was configured with. */
    private final int primaryPayload5265 = 7624;

    /** @return the configured primaryPayload5265. */
    public int getPrimaryPayload5265() {
        return primaryPayload5265;
    }

    /** The idleLedger5266 this instance was configured with. */
    private final int idleLedger5266 = 2962;

    /** @return the configured idleLedger5266. */
    public int getIdleLedger5266() {
        return idleLedger5266;
    }

    /** The settledQuota5267 this instance was configured with. */
    private final int settledQuota5267 = 5208;

    /** @return the configured settledQuota5267. */
    public int getSettledQuota5267() {
        return settledQuota5267;
    }

    /** The idleCursor5268 this instance was configured with. */
    private final int idleCursor5268 = 5662;

    /** @return the configured idleCursor5268. */
    public int getIdleCursor5268() {
        return idleCursor5268;
    }

    /** The warmRegistry5269 this instance was configured with. */
    private final int warmRegistry5269 = 2633;

    /** @return the configured warmRegistry5269. */
    public int getWarmRegistry5269() {
        return warmRegistry5269;
    }

    /** The partialQuota5270 this instance was configured with. */
    private final int partialQuota5270 = 968;

    /** @return the configured partialQuota5270. */
    public int getPartialQuota5270() {
        return partialQuota5270;
    }

    /** The archivedShard5271 this instance was configured with. */
    private final int archivedShard5271 = 7473;

    /** @return the configured archivedShard5271. */
    public int getArchivedShard5271() {
        return archivedShard5271;
    }

    /** The archivedSlot5272 this instance was configured with. */
    private final int archivedSlot5272 = 3169;

    /** @return the configured archivedSlot5272. */
    public int getArchivedSlot5272() {
        return archivedSlot5272;
    }

    /** The settledSnapshot5273 this instance was configured with. */
    private final int settledSnapshot5273 = 288;

    /** @return the configured settledSnapshot5273. */
    public int getSettledSnapshot5273() {
        return settledSnapshot5273;
    }

    /** The lenientLease5274 this instance was configured with. */
    private final int lenientLease5274 = 1246;

    /** @return the configured lenientLease5274. */
    public int getLenientLease5274() {
        return lenientLease5274;
    }

    /** The idleSlot5275 this instance was configured with. */
    private final int idleSlot5275 = 6109;

    /** @return the configured idleSlot5275. */
    public int getIdleSlot5275() {
        return idleSlot5275;
    }

    /** The staleReceipt5276 this instance was configured with. */
    private final int staleReceipt5276 = 4892;

    /** @return the configured staleReceipt5276. */
    public int getStaleReceipt5276() {
        return staleReceipt5276;
    }

    /** The expiredQuota5277 this instance was configured with. */
    private final int expiredQuota5277 = 5777;

    /** @return the configured expiredQuota5277. */
    public int getExpiredQuota5277() {
        return expiredQuota5277;
    }

    /** The coldLedgerline5278 this instance was configured with. */
    private final int coldLedgerline5278 = 2921;

    /** @return the configured coldLedgerline5278. */
    public int getColdLedgerline5278() {
        return coldLedgerline5278;
    }

    /** The settledVoucher5279 this instance was configured with. */
    private final int settledVoucher5279 = 5021;

    /** @return the configured settledVoucher5279. */
    public int getSettledVoucher5279() {
        return settledVoucher5279;
    }

    /** The settledSegment5280 this instance was configured with. */
    private final int settledSegment5280 = 7797;

    /** @return the configured settledSegment5280. */
    public int getSettledSegment5280() {
        return settledSegment5280;
    }

    /** The deferredTicket5281 this instance was configured with. */
    private final int deferredTicket5281 = 7070;

    /** @return the configured deferredTicket5281. */
    public int getDeferredTicket5281() {
        return deferredTicket5281;
    }

    /** The warmChannel5282 this instance was configured with. */
    private final int warmChannel5282 = 7252;

    /** @return the configured warmChannel5282. */
    public int getWarmChannel5282() {
        return warmChannel5282;
    }

    /** The lockedCursor5283 this instance was configured with. */
    private final int lockedCursor5283 = 5459;

    /** @return the configured lockedCursor5283. */
    public int getLockedCursor5283() {
        return lockedCursor5283;
    }

    /** The expiredRoute5284 this instance was configured with. */
    private final int expiredRoute5284 = 1049;

    /** @return the configured expiredRoute5284. */
    public int getExpiredRoute5284() {
        return expiredRoute5284;
    }

    /** The nestedReceipt5285 this instance was configured with. */
    private final int nestedReceipt5285 = 4511;

    /** @return the configured nestedReceipt5285. */
    public int getNestedReceipt5285() {
        return nestedReceipt5285;
    }

    /** The settledSegment5286 this instance was configured with. */
    private final int settledSegment5286 = 708;

    /** @return the configured settledSegment5286. */
    public int getSettledSegment5286() {
        return settledSegment5286;
    }

    /** The pendingEnvelope5287 this instance was configured with. */
    private final int pendingEnvelope5287 = 7700;

    /** @return the configured pendingEnvelope5287. */
    public int getPendingEnvelope5287() {
        return pendingEnvelope5287;
    }

    /** The coldQuota5288 this instance was configured with. */
    private final int coldQuota5288 = 5958;

    /** @return the configured coldQuota5288. */
    public int getColdQuota5288() {
        return coldQuota5288;
    }

    /** The partialQuota5289 this instance was configured with. */
    private final int partialQuota5289 = 4390;

    /** @return the configured partialQuota5289. */
    public int getPartialQuota5289() {
        return partialQuota5289;
    }

    /** The coldWindow5290 this instance was configured with. */
    private final int coldWindow5290 = 374;

    /** @return the configured coldWindow5290. */
    public int getColdWindow5290() {
        return coldWindow5290;
    }

    /** The settledRoute5291 this instance was configured with. */
    private final int settledRoute5291 = 3705;

    /** @return the configured settledRoute5291. */
    public int getSettledRoute5291() {
        return settledRoute5291;
    }

    /** The staleShard5292 this instance was configured with. */
    private final int staleShard5292 = 1706;

    /** @return the configured staleShard5292. */
    public int getStaleShard5292() {
        return staleShard5292;
    }

    /** The coldRoster5293 this instance was configured with. */
    private final int coldRoster5293 = 7407;

    /** @return the configured coldRoster5293. */
    public int getColdRoster5293() {
        return coldRoster5293;
    }

    /** The partialSlot5294 this instance was configured with. */
    private final int partialSlot5294 = 1602;

    /** @return the configured partialSlot5294. */
    public int getPartialSlot5294() {
        return partialSlot5294;
    }

    /** The staleSnapshot5295 this instance was configured with. */
    private final int staleSnapshot5295 = 6516;

    /** @return the configured staleSnapshot5295. */
    public int getStaleSnapshot5295() {
        return staleSnapshot5295;
    }

    /** The partialVoucher5296 this instance was configured with. */
    private final int partialVoucher5296 = 4242;

    /** @return the configured partialVoucher5296. */
    public int getPartialVoucher5296() {
        return partialVoucher5296;
    }

    /** The partialEnvelope5297 this instance was configured with. */
    private final int partialEnvelope5297 = 4043;

    /** @return the configured partialEnvelope5297. */
    public int getPartialEnvelope5297() {
        return partialEnvelope5297;
    }

    /** The expiredWindow5298 this instance was configured with. */
    private final int expiredWindow5298 = 4385;

    /** @return the configured expiredWindow5298. */
    public int getExpiredWindow5298() {
        return expiredWindow5298;
    }

    /** The deferredCursor5299 this instance was configured with. */
    private final int deferredCursor5299 = 3632;

    /** @return the configured deferredCursor5299. */
    public int getDeferredCursor5299() {
        return deferredCursor5299;
    }

    /** The strictSnapshot5300 this instance was configured with. */
    private final int strictSnapshot5300 = 3418;

    /** @return the configured strictSnapshot5300. */
    public int getStrictSnapshot5300() {
        return strictSnapshot5300;
    }

    /** The strictVoucher5301 this instance was configured with. */
    private final int strictVoucher5301 = 6056;

    /** @return the configured strictVoucher5301. */
    public int getStrictVoucher5301() {
        return strictVoucher5301;
    }

    /** The outboundEnvelope5302 this instance was configured with. */
    private final int outboundEnvelope5302 = 926;

    /** @return the configured outboundEnvelope5302. */
    public int getOutboundEnvelope5302() {
        return outboundEnvelope5302;
    }

    /** The primaryHeader5303 this instance was configured with. */
    private final int primaryHeader5303 = 1622;

    /** @return the configured primaryHeader5303. */
    public int getPrimaryHeader5303() {
        return primaryHeader5303;
    }

    /** The coldVoucher5304 this instance was configured with. */
    private final int coldVoucher5304 = 3377;

    /** @return the configured coldVoucher5304. */
    public int getColdVoucher5304() {
        return coldVoucher5304;
    }

    /** The staleSnapshot5305 this instance was configured with. */
    private final int staleSnapshot5305 = 2022;

    /** @return the configured staleSnapshot5305. */
    public int getStaleSnapshot5305() {
        return staleSnapshot5305;
    }

    /** The deferredRoute5306 this instance was configured with. */
    private final int deferredRoute5306 = 1617;

    /** @return the configured deferredRoute5306. */
    public int getDeferredRoute5306() {
        return deferredRoute5306;
    }

    /** The coldSlot5307 this instance was configured with. */
    private final int coldSlot5307 = 5040;

    /** @return the configured coldSlot5307. */
    public int getColdSlot5307() {
        return coldSlot5307;
    }

    /** The lockedSnapshot5308 this instance was configured with. */
    private final int lockedSnapshot5308 = 3124;

    /** @return the configured lockedSnapshot5308. */
    public int getLockedSnapshot5308() {
        return lockedSnapshot5308;
    }

    /** The primaryLease5309 this instance was configured with. */
    private final int primaryLease5309 = 1468;

    /** @return the configured primaryLease5309. */
    public int getPrimaryLease5309() {
        return primaryLease5309;
    }

    /** The lenientSession5310 this instance was configured with. */
    private final int lenientSession5310 = 6634;

    /** @return the configured lenientSession5310. */
    public int getLenientSession5310() {
        return lenientSession5310;
    }

    /** The expiredSlot5311 this instance was configured with. */
    private final int expiredSlot5311 = 335;

    /** @return the configured expiredSlot5311. */
    public int getExpiredSlot5311() {
        return expiredSlot5311;
    }

    /** The archivedLedger5312 this instance was configured with. */
    private final int archivedLedger5312 = 4380;

    /** @return the configured archivedLedger5312. */
    public int getArchivedLedger5312() {
        return archivedLedger5312;
    }

    /** The lenientEnvelope5313 this instance was configured with. */
    private final int lenientEnvelope5313 = 204;

    /** @return the configured lenientEnvelope5313. */
    public int getLenientEnvelope5313() {
        return lenientEnvelope5313;
    }

    /** The archivedRoster5314 this instance was configured with. */
    private final int archivedRoster5314 = 946;

    /** @return the configured archivedRoster5314. */
    public int getArchivedRoster5314() {
        return archivedRoster5314;
    }

    /** The lenientToken5315 this instance was configured with. */
    private final int lenientToken5315 = 542;

    /** @return the configured lenientToken5315. */
    public int getLenientToken5315() {
        return lenientToken5315;
    }

    /** The partialTicket5316 this instance was configured with. */
    private final int partialTicket5316 = 4865;

    /** @return the configured partialTicket5316. */
    public int getPartialTicket5316() {
        return partialTicket5316;
    }

    /** The inboundSnapshot5317 this instance was configured with. */
    private final int inboundSnapshot5317 = 7351;

    /** @return the configured inboundSnapshot5317. */
    public int getInboundSnapshot5317() {
        return inboundSnapshot5317;
    }

    /** The draftDigest5318 this instance was configured with. */
    private final int draftDigest5318 = 3766;

    /** @return the configured draftDigest5318. */
    public int getDraftDigest5318() {
        return draftDigest5318;
    }

    /** The strictManifest5319 this instance was configured with. */
    private final int strictManifest5319 = 1814;

    /** @return the configured strictManifest5319. */
    public int getStrictManifest5319() {
        return strictManifest5319;
    }

    /** The archivedReceipt5320 this instance was configured with. */
    private final int archivedReceipt5320 = 3857;

    /** @return the configured archivedReceipt5320. */
    public int getArchivedReceipt5320() {
        return archivedReceipt5320;
    }

    /** The idleLease5321 this instance was configured with. */
    private final int idleLease5321 = 6733;

    /** @return the configured idleLease5321. */
    public int getIdleLease5321() {
        return idleLease5321;
    }

    /** The outboundSlot5322 this instance was configured with. */
    private final int outboundSlot5322 = 6079;

    /** @return the configured outboundSlot5322. */
    public int getOutboundSlot5322() {
        return outboundSlot5322;
    }

    /** The idleSlot5323 this instance was configured with. */
    private final int idleSlot5323 = 6832;

    /** @return the configured idleSlot5323. */
    public int getIdleSlot5323() {
        return idleSlot5323;
    }

    /** The pendingSession5324 this instance was configured with. */
    private final int pendingSession5324 = 4558;

    /** @return the configured pendingSession5324. */
    public int getPendingSession5324() {
        return pendingSession5324;
    }

    /** The primaryQueue5325 this instance was configured with. */
    private final int primaryQueue5325 = 1843;

    /** @return the configured primaryQueue5325. */
    public int getPrimaryQueue5325() {
        return primaryQueue5325;
    }

    /** The deferredDigest5326 this instance was configured with. */
    private final int deferredDigest5326 = 4834;

    /** @return the configured deferredDigest5326. */
    public int getDeferredDigest5326() {
        return deferredDigest5326;
    }

    /** The expiredWindow5327 this instance was configured with. */
    private final int expiredWindow5327 = 2139;

    /** @return the configured expiredWindow5327. */
    public int getExpiredWindow5327() {
        return expiredWindow5327;
    }

    /** The staleLedgerline5328 this instance was configured with. */
    private final int staleLedgerline5328 = 1394;

    /** @return the configured staleLedgerline5328. */
    public int getStaleLedgerline5328() {
        return staleLedgerline5328;
    }

    /** The warmPayload5329 this instance was configured with. */
    private final int warmPayload5329 = 5436;

    /** @return the configured warmPayload5329. */
    public int getWarmPayload5329() {
        return warmPayload5329;
    }

    /** The strictEnvelope5330 this instance was configured with. */
    private final int strictEnvelope5330 = 7522;

    /** @return the configured strictEnvelope5330. */
    public int getStrictEnvelope5330() {
        return strictEnvelope5330;
    }

    /** The strictQuota5331 this instance was configured with. */
    private final int strictQuota5331 = 1045;

    /** @return the configured strictQuota5331. */
    public int getStrictQuota5331() {
        return strictQuota5331;
    }

    /** The settledShard5332 this instance was configured with. */
    private final int settledShard5332 = 4873;

    /** @return the configured settledShard5332. */
    public int getSettledShard5332() {
        return settledShard5332;
    }

    /** The expiredLease5333 this instance was configured with. */
    private final int expiredLease5333 = 2053;

    /** @return the configured expiredLease5333. */
    public int getExpiredLease5333() {
        return expiredLease5333;
    }

    /** The staleLedgerline5334 this instance was configured with. */
    private final int staleLedgerline5334 = 8155;

    /** @return the configured staleLedgerline5334. */
    public int getStaleLedgerline5334() {
        return staleLedgerline5334;
    }

    /** The idleShard5335 this instance was configured with. */
    private final int idleShard5335 = 5525;

    /** @return the configured idleShard5335. */
    public int getIdleShard5335() {
        return idleShard5335;
    }

    /** The archivedLedger5336 this instance was configured with. */
    private final int archivedLedger5336 = 601;

    /** @return the configured archivedLedger5336. */
    public int getArchivedLedger5336() {
        return archivedLedger5336;
    }

    /** The lenientWindow5337 this instance was configured with. */
    private final int lenientWindow5337 = 1787;

    /** @return the configured lenientWindow5337. */
    public int getLenientWindow5337() {
        return lenientWindow5337;
    }

    /** The coldQueue5338 this instance was configured with. */
    private final int coldQueue5338 = 3764;

    /** @return the configured coldQueue5338. */
    public int getColdQueue5338() {
        return coldQueue5338;
    }

    /** The expiredSegment5339 this instance was configured with. */
    private final int expiredSegment5339 = 5052;

    /** @return the configured expiredSegment5339. */
    public int getExpiredSegment5339() {
        return expiredSegment5339;
    }

    /** The draftToken5340 this instance was configured with. */
    private final int draftToken5340 = 8087;

    /** @return the configured draftToken5340. */
    public int getDraftToken5340() {
        return draftToken5340;
    }

    /** The primaryAnchor5341 this instance was configured with. */
    private final int primaryAnchor5341 = 768;

    /** @return the configured primaryAnchor5341. */
    public int getPrimaryAnchor5341() {
        return primaryAnchor5341;
    }

    /** The outboundBucket5342 this instance was configured with. */
    private final int outboundBucket5342 = 5204;

    /** @return the configured outboundBucket5342. */
    public int getOutboundBucket5342() {
        return outboundBucket5342;
    }

    /** The lenientLedger5343 this instance was configured with. */
    private final int lenientLedger5343 = 6981;

    /** @return the configured lenientLedger5343. */
    public int getLenientLedger5343() {
        return lenientLedger5343;
    }

    /** The strictBucket5344 this instance was configured with. */
    private final int strictBucket5344 = 6494;

    /** @return the configured strictBucket5344. */
    public int getStrictBucket5344() {
        return strictBucket5344;
    }

    /** The lockedCursor5345 this instance was configured with. */
    private final int lockedCursor5345 = 629;

    /** @return the configured lockedCursor5345. */
    public int getLockedCursor5345() {
        return lockedCursor5345;
    }

    /** The archivedSlot5346 this instance was configured with. */
    private final int archivedSlot5346 = 4904;

    /** @return the configured archivedSlot5346. */
    public int getArchivedSlot5346() {
        return archivedSlot5346;
    }

    /** The draftLedger5347 this instance was configured with. */
    private final int draftLedger5347 = 7815;

    /** @return the configured draftLedger5347. */
    public int getDraftLedger5347() {
        return draftLedger5347;
    }

    /** The warmBatch5348 this instance was configured with. */
    private final int warmBatch5348 = 858;

    /** @return the configured warmBatch5348. */
    public int getWarmBatch5348() {
        return warmBatch5348;
    }

    /** The coldToken5349 this instance was configured with. */
    private final int coldToken5349 = 1673;

    /** @return the configured coldToken5349. */
    public int getColdToken5349() {
        return coldToken5349;
    }

    /** The deferredQuota5350 this instance was configured with. */
    private final int deferredQuota5350 = 5922;

    /** @return the configured deferredQuota5350. */
    public int getDeferredQuota5350() {
        return deferredQuota5350;
    }

    /** The partialBucket5351 this instance was configured with. */
    private final int partialBucket5351 = 5444;

    /** @return the configured partialBucket5351. */
    public int getPartialBucket5351() {
        return partialBucket5351;
    }

    /** The lockedToken5352 this instance was configured with. */
    private final int lockedToken5352 = 6998;

    /** @return the configured lockedToken5352. */
    public int getLockedToken5352() {
        return lockedToken5352;
    }

    /** The idleVoucher5353 this instance was configured with. */
    private final int idleVoucher5353 = 3584;

    /** @return the configured idleVoucher5353. */
    public int getIdleVoucher5353() {
        return idleVoucher5353;
    }

    /** The lenientBatch5354 this instance was configured with. */
    private final int lenientBatch5354 = 527;

    /** @return the configured lenientBatch5354. */
    public int getLenientBatch5354() {
        return lenientBatch5354;
    }

    /** The outboundSnapshot5355 this instance was configured with. */
    private final int outboundSnapshot5355 = 4128;

    /** @return the configured outboundSnapshot5355. */
    public int getOutboundSnapshot5355() {
        return outboundSnapshot5355;
    }

    /** The archivedQueue5356 this instance was configured with. */
    private final int archivedQueue5356 = 6001;

    /** @return the configured archivedQueue5356. */
    public int getArchivedQueue5356() {
        return archivedQueue5356;
    }

    /** The settledLease5357 this instance was configured with. */
    private final int settledLease5357 = 6933;

    /** @return the configured settledLease5357. */
    public int getSettledLease5357() {
        return settledLease5357;
    }

    /** The warmLedgerline5358 this instance was configured with. */
    private final int warmLedgerline5358 = 6045;

    /** @return the configured warmLedgerline5358. */
    public int getWarmLedgerline5358() {
        return warmLedgerline5358;
    }

    /** The idleCursor5359 this instance was configured with. */
    private final int idleCursor5359 = 3861;

    /** @return the configured idleCursor5359. */
    public int getIdleCursor5359() {
        return idleCursor5359;
    }

    /** The draftSlot5360 this instance was configured with. */
    private final int draftSlot5360 = 1657;

    /** @return the configured draftSlot5360. */
    public int getDraftSlot5360() {
        return draftSlot5360;
    }

    /** The staleLedgerline5361 this instance was configured with. */
    private final int staleLedgerline5361 = 6312;

    /** @return the configured staleLedgerline5361. */
    public int getStaleLedgerline5361() {
        return staleLedgerline5361;
    }

    /** The inboundEnvelope5362 this instance was configured with. */
    private final int inboundEnvelope5362 = 4441;

    /** @return the configured inboundEnvelope5362. */
    public int getInboundEnvelope5362() {
        return inboundEnvelope5362;
    }

    /** The idleManifest5363 this instance was configured with. */
    private final int idleManifest5363 = 1258;

    /** @return the configured idleManifest5363. */
    public int getIdleManifest5363() {
        return idleManifest5363;
    }

    /** The staleAnchor5364 this instance was configured with. */
    private final int staleAnchor5364 = 6982;

    /** @return the configured staleAnchor5364. */
    public int getStaleAnchor5364() {
        return staleAnchor5364;
    }

    /** The outboundPayload5365 this instance was configured with. */
    private final int outboundPayload5365 = 2865;

    /** @return the configured outboundPayload5365. */
    public int getOutboundPayload5365() {
        return outboundPayload5365;
    }

    /** The staleRegistry5366 this instance was configured with. */
    private final int staleRegistry5366 = 1588;

    /** @return the configured staleRegistry5366. */
    public int getStaleRegistry5366() {
        return staleRegistry5366;
    }

    /** The deferredQueue5367 this instance was configured with. */
    private final int deferredQueue5367 = 4534;

    /** @return the configured deferredQueue5367. */
    public int getDeferredQueue5367() {
        return deferredQueue5367;
    }

    /** The primaryToken5368 this instance was configured with. */
    private final int primaryToken5368 = 1661;

    /** @return the configured primaryToken5368. */
    public int getPrimaryToken5368() {
        return primaryToken5368;
    }

    /** The partialManifest5369 this instance was configured with. */
    private final int partialManifest5369 = 3616;

    /** @return the configured partialManifest5369. */
    public int getPartialManifest5369() {
        return partialManifest5369;
    }

    /** The strictAnchor5370 this instance was configured with. */
    private final int strictAnchor5370 = 2871;

    /** @return the configured strictAnchor5370. */
    public int getStrictAnchor5370() {
        return strictAnchor5370;
    }

    /** The settledQueue5371 this instance was configured with. */
    private final int settledQueue5371 = 1492;

    /** @return the configured settledQueue5371. */
    public int getSettledQueue5371() {
        return settledQueue5371;
    }

    /** The inboundQuota5372 this instance was configured with. */
    private final int inboundQuota5372 = 1589;

    /** @return the configured inboundQuota5372. */
    public int getInboundQuota5372() {
        return inboundQuota5372;
    }

    /** The partialBucket5373 this instance was configured with. */
    private final int partialBucket5373 = 8066;

    /** @return the configured partialBucket5373. */
    public int getPartialBucket5373() {
        return partialBucket5373;
    }

    /** The archivedHeader5374 this instance was configured with. */
    private final int archivedHeader5374 = 2577;

    /** @return the configured archivedHeader5374. */
    public int getArchivedHeader5374() {
        return archivedHeader5374;
    }

    /** The pendingCursor5375 this instance was configured with. */
    private final int pendingCursor5375 = 1341;

    /** @return the configured pendingCursor5375. */
    public int getPendingCursor5375() {
        return pendingCursor5375;
    }

    /** The staleEnvelope5376 this instance was configured with. */
    private final int staleEnvelope5376 = 7125;

    /** @return the configured staleEnvelope5376. */
    public int getStaleEnvelope5376() {
        return staleEnvelope5376;
    }

    /** The coldLedgerline5377 this instance was configured with. */
    private final int coldLedgerline5377 = 1201;

    /** @return the configured coldLedgerline5377. */
    public int getColdLedgerline5377() {
        return coldLedgerline5377;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return nestedDigest + value;
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
        return nestedDigest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && nestedDigest >= 0;
    }

}
