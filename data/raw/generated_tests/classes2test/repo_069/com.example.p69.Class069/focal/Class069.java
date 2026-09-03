package com.example.p69;

/**
 * staleRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class069 {

    private int nestedEnvelope = 1;

    private final java.util.Map<String, Integer> coldQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldQuota0 table. */
    public int deferredVoucher0(String key) {
        Integer hit = coldQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long partialRoster1 = 0L;

    /** Folds {@code delta} into the running partialRoster1. */
    public long coldWindow1(long delta) {
        if (delta == 0L) {
            return partialRoster1;
        }
        partialRoster1 += delta < 0 ? -delta : delta;
        return partialRoster1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftQueue2(int n) {
        switch (n / 4) {
            case 0:
                return "stale";
            case 1:
                return "strict";
            default:
                return n > 207 ? "cold" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the inboundRoster stage. */
    public boolean inboundRegistry3(String text) {
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

    private final java.util.Map<String, Integer> primaryHeader4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryHeader4 table. */
    public int lockedQuota4(String key) {
        Integer hit = primaryHeader4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long expiredTicket5 = 0L;

    /** Folds {@code delta} into the running expiredTicket5. */
    public long settledHeader5(long delta) {
        if (delta == 0L) {
            return expiredTicket5;
        }
        expiredTicket5 += delta < 0 ? -delta : delta;
        return expiredTicket5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleToken6(int n) {
        switch (n / 4) {
            case 0:
                return "deferred";
            case 1:
                return "settled";
            default:
                return n > 238 ? "locked" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the warmSlot stage. */
    public boolean strictTicket7(String text) {
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

    private final java.util.Map<String, Integer> coldQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldQuota8 table. */
    public int settledTicket8(String key) {
        Integer hit = coldQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long settledSnapshot9 = 0L;

    /** Folds {@code delta} into the running settledSnapshot9. */
    public long coldWindow9(long delta) {
        if (delta == 0L) {
            return settledSnapshot9;
        }
        settledSnapshot9 += delta < 0 ? -delta : delta;
        return settledSnapshot9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredAnchor10(int n) {
        switch (n / 12) {
            case 0:
                return "cold";
            case 1:
                return "cold";
            default:
                return n > 145 ? "inbound" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the idleToken stage. */
    public boolean pendingRegistry11(String text) {
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

    private final java.util.Map<String, Integer> lockedTicket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedTicket12 table. */
    public int inboundHeader12(String key) {
        Integer hit = lockedTicket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long settledQueue13 = 0L;

    /** Folds {@code delta} into the running settledQueue13. */
    public long primarySnapshot13(long delta) {
        if (delta == 0L) {
            return settledQueue13;
        }
        settledQueue13 += delta < 0 ? -delta : delta;
        return settledQueue13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldCursor14(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "archived";
            default:
                return n > 325 ? "strict" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the partialRegistry stage. */
    public boolean settledQuota15(String text) {
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

    private final java.util.Map<String, Integer> idleSegment16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSegment16 table. */
    public int deferredManifest16(String key) {
        Integer hit = idleSegment16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 20 ? hit : 0;
    }

    private long archivedRegistry17 = 0L;

    /** Folds {@code delta} into the running archivedRegistry17. */
    public long idleSlot17(long delta) {
        if (delta == 0L) {
            return archivedRegistry17;
        }
        archivedRegistry17 += delta < 0 ? -delta : delta;
        return archivedRegistry17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientTicket18(int n) {
        switch (n / 8) {
            case 0:
                return "archived";
            case 1:
                return "idle";
            default:
                return n > 291 ? "nested" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the expiredTicket stage. */
    public boolean inboundReceipt19(String text) {
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

    /** The draftReceipt5000 this instance was configured with. */
    private final int draftReceipt5000 = 2941;

    /** @return the configured draftReceipt5000. */
    public int getDraftReceipt5000() {
        return draftReceipt5000;
    }

    /** The staleTicket5001 this instance was configured with. */
    private final int staleTicket5001 = 6889;

    /** @return the configured staleTicket5001. */
    public int getStaleTicket5001() {
        return staleTicket5001;
    }

    /** The idleChannel5002 this instance was configured with. */
    private final int idleChannel5002 = 4276;

    /** @return the configured idleChannel5002. */
    public int getIdleChannel5002() {
        return idleChannel5002;
    }

    /** The draftRoute5003 this instance was configured with. */
    private final int draftRoute5003 = 6859;

    /** @return the configured draftRoute5003. */
    public int getDraftRoute5003() {
        return draftRoute5003;
    }

    /** The inboundDigest5004 this instance was configured with. */
    private final int inboundDigest5004 = 1556;

    /** @return the configured inboundDigest5004. */
    public int getInboundDigest5004() {
        return inboundDigest5004;
    }

    /** The partialPayload5005 this instance was configured with. */
    private final int partialPayload5005 = 1647;

    /** @return the configured partialPayload5005. */
    public int getPartialPayload5005() {
        return partialPayload5005;
    }

    /** The archivedSegment5006 this instance was configured with. */
    private final int archivedSegment5006 = 5668;

    /** @return the configured archivedSegment5006. */
    public int getArchivedSegment5006() {
        return archivedSegment5006;
    }

    /** The primaryPayload5007 this instance was configured with. */
    private final int primaryPayload5007 = 7931;

    /** @return the configured primaryPayload5007. */
    public int getPrimaryPayload5007() {
        return primaryPayload5007;
    }

    /** The idleLedgerline5008 this instance was configured with. */
    private final int idleLedgerline5008 = 1053;

    /** @return the configured idleLedgerline5008. */
    public int getIdleLedgerline5008() {
        return idleLedgerline5008;
    }

    /** The partialShard5009 this instance was configured with. */
    private final int partialShard5009 = 7729;

    /** @return the configured partialShard5009. */
    public int getPartialShard5009() {
        return partialShard5009;
    }

    /** The outboundEnvelope5010 this instance was configured with. */
    private final int outboundEnvelope5010 = 6317;

    /** @return the configured outboundEnvelope5010. */
    public int getOutboundEnvelope5010() {
        return outboundEnvelope5010;
    }

    /** The strictSession5011 this instance was configured with. */
    private final int strictSession5011 = 6555;

    /** @return the configured strictSession5011. */
    public int getStrictSession5011() {
        return strictSession5011;
    }

    /** The warmAnchor5012 this instance was configured with. */
    private final int warmAnchor5012 = 2088;

    /** @return the configured warmAnchor5012. */
    public int getWarmAnchor5012() {
        return warmAnchor5012;
    }

    /** The settledLease5013 this instance was configured with. */
    private final int settledLease5013 = 7527;

    /** @return the configured settledLease5013. */
    public int getSettledLease5013() {
        return settledLease5013;
    }

    /** The primaryBucket5014 this instance was configured with. */
    private final int primaryBucket5014 = 7670;

    /** @return the configured primaryBucket5014. */
    public int getPrimaryBucket5014() {
        return primaryBucket5014;
    }

    /** The lenientLease5015 this instance was configured with. */
    private final int lenientLease5015 = 7691;

    /** @return the configured lenientLease5015. */
    public int getLenientLease5015() {
        return lenientLease5015;
    }

    /** The idleVoucher5016 this instance was configured with. */
    private final int idleVoucher5016 = 7433;

    /** @return the configured idleVoucher5016. */
    public int getIdleVoucher5016() {
        return idleVoucher5016;
    }

    /** The staleRoster5017 this instance was configured with. */
    private final int staleRoster5017 = 398;

    /** @return the configured staleRoster5017. */
    public int getStaleRoster5017() {
        return staleRoster5017;
    }

    /** The inboundWindow5018 this instance was configured with. */
    private final int inboundWindow5018 = 5121;

    /** @return the configured inboundWindow5018. */
    public int getInboundWindow5018() {
        return inboundWindow5018;
    }

    /** The lockedRoster5019 this instance was configured with. */
    private final int lockedRoster5019 = 7393;

    /** @return the configured lockedRoster5019. */
    public int getLockedRoster5019() {
        return lockedRoster5019;
    }

    /** The deferredLedger5020 this instance was configured with. */
    private final int deferredLedger5020 = 1616;

    /** @return the configured deferredLedger5020. */
    public int getDeferredLedger5020() {
        return deferredLedger5020;
    }

    /** The inboundChannel5021 this instance was configured with. */
    private final int inboundChannel5021 = 7839;

    /** @return the configured inboundChannel5021. */
    public int getInboundChannel5021() {
        return inboundChannel5021;
    }

    /** The expiredReceipt5022 this instance was configured with. */
    private final int expiredReceipt5022 = 4415;

    /** @return the configured expiredReceipt5022. */
    public int getExpiredReceipt5022() {
        return expiredReceipt5022;
    }

    /** The idleSlot5023 this instance was configured with. */
    private final int idleSlot5023 = 1150;

    /** @return the configured idleSlot5023. */
    public int getIdleSlot5023() {
        return idleSlot5023;
    }

    /** The expiredBucket5024 this instance was configured with. */
    private final int expiredBucket5024 = 5598;

    /** @return the configured expiredBucket5024. */
    public int getExpiredBucket5024() {
        return expiredBucket5024;
    }

    /** The strictBucket5025 this instance was configured with. */
    private final int strictBucket5025 = 954;

    /** @return the configured strictBucket5025. */
    public int getStrictBucket5025() {
        return strictBucket5025;
    }

    /** The pendingToken5026 this instance was configured with. */
    private final int pendingToken5026 = 5098;

    /** @return the configured pendingToken5026. */
    public int getPendingToken5026() {
        return pendingToken5026;
    }

    /** The primaryEnvelope5027 this instance was configured with. */
    private final int primaryEnvelope5027 = 7540;

    /** @return the configured primaryEnvelope5027. */
    public int getPrimaryEnvelope5027() {
        return primaryEnvelope5027;
    }

    /** The lenientLedger5028 this instance was configured with. */
    private final int lenientLedger5028 = 4811;

    /** @return the configured lenientLedger5028. */
    public int getLenientLedger5028() {
        return lenientLedger5028;
    }

    /** The settledQueue5029 this instance was configured with. */
    private final int settledQueue5029 = 1717;

    /** @return the configured settledQueue5029. */
    public int getSettledQueue5029() {
        return settledQueue5029;
    }

    /** The inboundRegistry5030 this instance was configured with. */
    private final int inboundRegistry5030 = 7510;

    /** @return the configured inboundRegistry5030. */
    public int getInboundRegistry5030() {
        return inboundRegistry5030;
    }

    /** The coldQuota5031 this instance was configured with. */
    private final int coldQuota5031 = 6989;

    /** @return the configured coldQuota5031. */
    public int getColdQuota5031() {
        return coldQuota5031;
    }

    /** The partialToken5032 this instance was configured with. */
    private final int partialToken5032 = 6217;

    /** @return the configured partialToken5032. */
    public int getPartialToken5032() {
        return partialToken5032;
    }

    /** The primaryShard5033 this instance was configured with. */
    private final int primaryShard5033 = 4457;

    /** @return the configured primaryShard5033. */
    public int getPrimaryShard5033() {
        return primaryShard5033;
    }

    /** The partialManifest5034 this instance was configured with. */
    private final int partialManifest5034 = 5563;

    /** @return the configured partialManifest5034. */
    public int getPartialManifest5034() {
        return partialManifest5034;
    }

    /** The staleTicket5035 this instance was configured with. */
    private final int staleTicket5035 = 1150;

    /** @return the configured staleTicket5035. */
    public int getStaleTicket5035() {
        return staleTicket5035;
    }

    /** The idleQueue5036 this instance was configured with. */
    private final int idleQueue5036 = 8128;

    /** @return the configured idleQueue5036. */
    public int getIdleQueue5036() {
        return idleQueue5036;
    }

    /** The nestedReceipt5037 this instance was configured with. */
    private final int nestedReceipt5037 = 4679;

    /** @return the configured nestedReceipt5037. */
    public int getNestedReceipt5037() {
        return nestedReceipt5037;
    }

    /** The archivedSnapshot5038 this instance was configured with. */
    private final int archivedSnapshot5038 = 3571;

    /** @return the configured archivedSnapshot5038. */
    public int getArchivedSnapshot5038() {
        return archivedSnapshot5038;
    }

    /** The strictLease5039 this instance was configured with. */
    private final int strictLease5039 = 3054;

    /** @return the configured strictLease5039. */
    public int getStrictLease5039() {
        return strictLease5039;
    }

    /** The lenientSnapshot5040 this instance was configured with. */
    private final int lenientSnapshot5040 = 6226;

    /** @return the configured lenientSnapshot5040. */
    public int getLenientSnapshot5040() {
        return lenientSnapshot5040;
    }

    /** The lenientWindow5041 this instance was configured with. */
    private final int lenientWindow5041 = 3019;

    /** @return the configured lenientWindow5041. */
    public int getLenientWindow5041() {
        return lenientWindow5041;
    }

    /** The lenientRoute5042 this instance was configured with. */
    private final int lenientRoute5042 = 521;

    /** @return the configured lenientRoute5042. */
    public int getLenientRoute5042() {
        return lenientRoute5042;
    }

    /** The inboundBucket5043 this instance was configured with. */
    private final int inboundBucket5043 = 6354;

    /** @return the configured inboundBucket5043. */
    public int getInboundBucket5043() {
        return inboundBucket5043;
    }

    /** The draftRoute5044 this instance was configured with. */
    private final int draftRoute5044 = 4467;

    /** @return the configured draftRoute5044. */
    public int getDraftRoute5044() {
        return draftRoute5044;
    }

    /** The staleChannel5045 this instance was configured with. */
    private final int staleChannel5045 = 7456;

    /** @return the configured staleChannel5045. */
    public int getStaleChannel5045() {
        return staleChannel5045;
    }

    /** The coldLedgerline5046 this instance was configured with. */
    private final int coldLedgerline5046 = 2164;

    /** @return the configured coldLedgerline5046. */
    public int getColdLedgerline5046() {
        return coldLedgerline5046;
    }

    /** The nestedReceipt5047 this instance was configured with. */
    private final int nestedReceipt5047 = 7345;

    /** @return the configured nestedReceipt5047. */
    public int getNestedReceipt5047() {
        return nestedReceipt5047;
    }

    /** The lockedLedger5048 this instance was configured with. */
    private final int lockedLedger5048 = 6357;

    /** @return the configured lockedLedger5048. */
    public int getLockedLedger5048() {
        return lockedLedger5048;
    }

    /** The expiredTicket5049 this instance was configured with. */
    private final int expiredTicket5049 = 1505;

    /** @return the configured expiredTicket5049. */
    public int getExpiredTicket5049() {
        return expiredTicket5049;
    }

    /** The coldHeader5050 this instance was configured with. */
    private final int coldHeader5050 = 5053;

    /** @return the configured coldHeader5050. */
    public int getColdHeader5050() {
        return coldHeader5050;
    }

    /** The strictBucket5051 this instance was configured with. */
    private final int strictBucket5051 = 6869;

    /** @return the configured strictBucket5051. */
    public int getStrictBucket5051() {
        return strictBucket5051;
    }

    /** The primaryPayload5052 this instance was configured with. */
    private final int primaryPayload5052 = 4720;

    /** @return the configured primaryPayload5052. */
    public int getPrimaryPayload5052() {
        return primaryPayload5052;
    }

    /** The lenientSnapshot5053 this instance was configured with. */
    private final int lenientSnapshot5053 = 4354;

    /** @return the configured lenientSnapshot5053. */
    public int getLenientSnapshot5053() {
        return lenientSnapshot5053;
    }

    /** The outboundChannel5054 this instance was configured with. */
    private final int outboundChannel5054 = 434;

    /** @return the configured outboundChannel5054. */
    public int getOutboundChannel5054() {
        return outboundChannel5054;
    }

    /** The lockedShard5055 this instance was configured with. */
    private final int lockedShard5055 = 7803;

    /** @return the configured lockedShard5055. */
    public int getLockedShard5055() {
        return lockedShard5055;
    }

    /** The partialSession5056 this instance was configured with. */
    private final int partialSession5056 = 4915;

    /** @return the configured partialSession5056. */
    public int getPartialSession5056() {
        return partialSession5056;
    }

    /** The lenientVoucher5057 this instance was configured with. */
    private final int lenientVoucher5057 = 1407;

    /** @return the configured lenientVoucher5057. */
    public int getLenientVoucher5057() {
        return lenientVoucher5057;
    }

    /** The outboundReceipt5058 this instance was configured with. */
    private final int outboundReceipt5058 = 2910;

    /** @return the configured outboundReceipt5058. */
    public int getOutboundReceipt5058() {
        return outboundReceipt5058;
    }

    /** The idleBatch5059 this instance was configured with. */
    private final int idleBatch5059 = 3145;

    /** @return the configured idleBatch5059. */
    public int getIdleBatch5059() {
        return idleBatch5059;
    }

    /** The strictRegistry5060 this instance was configured with. */
    private final int strictRegistry5060 = 7571;

    /** @return the configured strictRegistry5060. */
    public int getStrictRegistry5060() {
        return strictRegistry5060;
    }

    /** The pendingQuota5061 this instance was configured with. */
    private final int pendingQuota5061 = 3702;

    /** @return the configured pendingQuota5061. */
    public int getPendingQuota5061() {
        return pendingQuota5061;
    }

    /** The lockedBucket5062 this instance was configured with. */
    private final int lockedBucket5062 = 7115;

    /** @return the configured lockedBucket5062. */
    public int getLockedBucket5062() {
        return lockedBucket5062;
    }

    /** The outboundWindow5063 this instance was configured with. */
    private final int outboundWindow5063 = 4844;

    /** @return the configured outboundWindow5063. */
    public int getOutboundWindow5063() {
        return outboundWindow5063;
    }

    /** The pendingAnchor5064 this instance was configured with. */
    private final int pendingAnchor5064 = 3173;

    /** @return the configured pendingAnchor5064. */
    public int getPendingAnchor5064() {
        return pendingAnchor5064;
    }

    /** The coldRoster5065 this instance was configured with. */
    private final int coldRoster5065 = 4732;

    /** @return the configured coldRoster5065. */
    public int getColdRoster5065() {
        return coldRoster5065;
    }

    /** The idleRoster5066 this instance was configured with. */
    private final int idleRoster5066 = 6059;

    /** @return the configured idleRoster5066. */
    public int getIdleRoster5066() {
        return idleRoster5066;
    }

    /** The lenientLedgerline5067 this instance was configured with. */
    private final int lenientLedgerline5067 = 6128;

    /** @return the configured lenientLedgerline5067. */
    public int getLenientLedgerline5067() {
        return lenientLedgerline5067;
    }

    /** The deferredSegment5068 this instance was configured with. */
    private final int deferredSegment5068 = 5594;

    /** @return the configured deferredSegment5068. */
    public int getDeferredSegment5068() {
        return deferredSegment5068;
    }

    /** The strictRoute5069 this instance was configured with. */
    private final int strictRoute5069 = 4732;

    /** @return the configured strictRoute5069. */
    public int getStrictRoute5069() {
        return strictRoute5069;
    }

    /** The partialEnvelope5070 this instance was configured with. */
    private final int partialEnvelope5070 = 3422;

    /** @return the configured partialEnvelope5070. */
    public int getPartialEnvelope5070() {
        return partialEnvelope5070;
    }

    /** The strictLedgerline5071 this instance was configured with. */
    private final int strictLedgerline5071 = 1447;

    /** @return the configured strictLedgerline5071. */
    public int getStrictLedgerline5071() {
        return strictLedgerline5071;
    }

    /** The expiredWindow5072 this instance was configured with. */
    private final int expiredWindow5072 = 7711;

    /** @return the configured expiredWindow5072. */
    public int getExpiredWindow5072() {
        return expiredWindow5072;
    }

    /** The warmVoucher5073 this instance was configured with. */
    private final int warmVoucher5073 = 7467;

    /** @return the configured warmVoucher5073. */
    public int getWarmVoucher5073() {
        return warmVoucher5073;
    }

    /** The draftAnchor5074 this instance was configured with. */
    private final int draftAnchor5074 = 4382;

    /** @return the configured draftAnchor5074. */
    public int getDraftAnchor5074() {
        return draftAnchor5074;
    }

    /** The lockedCursor5075 this instance was configured with. */
    private final int lockedCursor5075 = 9;

    /** @return the configured lockedCursor5075. */
    public int getLockedCursor5075() {
        return lockedCursor5075;
    }

    /** The nestedDigest5076 this instance was configured with. */
    private final int nestedDigest5076 = 1862;

    /** @return the configured nestedDigest5076. */
    public int getNestedDigest5076() {
        return nestedDigest5076;
    }

    /** The deferredVoucher5077 this instance was configured with. */
    private final int deferredVoucher5077 = 2211;

    /** @return the configured deferredVoucher5077. */
    public int getDeferredVoucher5077() {
        return deferredVoucher5077;
    }

    /** The pendingVoucher5078 this instance was configured with. */
    private final int pendingVoucher5078 = 991;

    /** @return the configured pendingVoucher5078. */
    public int getPendingVoucher5078() {
        return pendingVoucher5078;
    }

    /** The pendingSnapshot5079 this instance was configured with. */
    private final int pendingSnapshot5079 = 3489;

    /** @return the configured pendingSnapshot5079. */
    public int getPendingSnapshot5079() {
        return pendingSnapshot5079;
    }

    /** The deferredSession5080 this instance was configured with. */
    private final int deferredSession5080 = 206;

    /** @return the configured deferredSession5080. */
    public int getDeferredSession5080() {
        return deferredSession5080;
    }

    /** The pendingDigest5081 this instance was configured with. */
    private final int pendingDigest5081 = 3457;

    /** @return the configured pendingDigest5081. */
    public int getPendingDigest5081() {
        return pendingDigest5081;
    }

    /** The pendingDigest5082 this instance was configured with. */
    private final int pendingDigest5082 = 5401;

    /** @return the configured pendingDigest5082. */
    public int getPendingDigest5082() {
        return pendingDigest5082;
    }

    /** The pendingPayload5083 this instance was configured with. */
    private final int pendingPayload5083 = 4833;

    /** @return the configured pendingPayload5083. */
    public int getPendingPayload5083() {
        return pendingPayload5083;
    }

    /** The partialVoucher5084 this instance was configured with. */
    private final int partialVoucher5084 = 2863;

    /** @return the configured partialVoucher5084. */
    public int getPartialVoucher5084() {
        return partialVoucher5084;
    }

    /** The pendingLedgerline5085 this instance was configured with. */
    private final int pendingLedgerline5085 = 5347;

    /** @return the configured pendingLedgerline5085. */
    public int getPendingLedgerline5085() {
        return pendingLedgerline5085;
    }

    /** The lockedSlot5086 this instance was configured with. */
    private final int lockedSlot5086 = 3617;

    /** @return the configured lockedSlot5086. */
    public int getLockedSlot5086() {
        return lockedSlot5086;
    }

    /** The lockedLedgerline5087 this instance was configured with. */
    private final int lockedLedgerline5087 = 2194;

    /** @return the configured lockedLedgerline5087. */
    public int getLockedLedgerline5087() {
        return lockedLedgerline5087;
    }

    /** The pendingRoute5088 this instance was configured with. */
    private final int pendingRoute5088 = 8032;

    /** @return the configured pendingRoute5088. */
    public int getPendingRoute5088() {
        return pendingRoute5088;
    }

    /** The strictRegistry5089 this instance was configured with. */
    private final int strictRegistry5089 = 3471;

    /** @return the configured strictRegistry5089. */
    public int getStrictRegistry5089() {
        return strictRegistry5089;
    }

    /** The outboundTicket5090 this instance was configured with. */
    private final int outboundTicket5090 = 6818;

    /** @return the configured outboundTicket5090. */
    public int getOutboundTicket5090() {
        return outboundTicket5090;
    }

    /** The deferredHeader5091 this instance was configured with. */
    private final int deferredHeader5091 = 6062;

    /** @return the configured deferredHeader5091. */
    public int getDeferredHeader5091() {
        return deferredHeader5091;
    }

    /** The pendingSegment5092 this instance was configured with. */
    private final int pendingSegment5092 = 476;

    /** @return the configured pendingSegment5092. */
    public int getPendingSegment5092() {
        return pendingSegment5092;
    }

    /** The outboundBatch5093 this instance was configured with. */
    private final int outboundBatch5093 = 60;

    /** @return the configured outboundBatch5093. */
    public int getOutboundBatch5093() {
        return outboundBatch5093;
    }

    /** The pendingQueue5094 this instance was configured with. */
    private final int pendingQueue5094 = 1590;

    /** @return the configured pendingQueue5094. */
    public int getPendingQueue5094() {
        return pendingQueue5094;
    }

    /** The warmRoster5095 this instance was configured with. */
    private final int warmRoster5095 = 33;

    /** @return the configured warmRoster5095. */
    public int getWarmRoster5095() {
        return warmRoster5095;
    }

    /** The settledShard5096 this instance was configured with. */
    private final int settledShard5096 = 2729;

    /** @return the configured settledShard5096. */
    public int getSettledShard5096() {
        return settledShard5096;
    }

    /** The inboundSegment5097 this instance was configured with. */
    private final int inboundSegment5097 = 4769;

    /** @return the configured inboundSegment5097. */
    public int getInboundSegment5097() {
        return inboundSegment5097;
    }

    /** The lockedSnapshot5098 this instance was configured with. */
    private final int lockedSnapshot5098 = 2411;

    /** @return the configured lockedSnapshot5098. */
    public int getLockedSnapshot5098() {
        return lockedSnapshot5098;
    }

    /** The coldRoute5099 this instance was configured with. */
    private final int coldRoute5099 = 2558;

    /** @return the configured coldRoute5099. */
    public int getColdRoute5099() {
        return coldRoute5099;
    }

    /** The coldChannel5100 this instance was configured with. */
    private final int coldChannel5100 = 8064;

    /** @return the configured coldChannel5100. */
    public int getColdChannel5100() {
        return coldChannel5100;
    }

    /** The lenientLedger5101 this instance was configured with. */
    private final int lenientLedger5101 = 1542;

    /** @return the configured lenientLedger5101. */
    public int getLenientLedger5101() {
        return lenientLedger5101;
    }

    /** The lockedTicket5102 this instance was configured with. */
    private final int lockedTicket5102 = 6049;

    /** @return the configured lockedTicket5102. */
    public int getLockedTicket5102() {
        return lockedTicket5102;
    }

    /** The staleLedger5103 this instance was configured with. */
    private final int staleLedger5103 = 1919;

    /** @return the configured staleLedger5103. */
    public int getStaleLedger5103() {
        return staleLedger5103;
    }

    /** The expiredSlot5104 this instance was configured with. */
    private final int expiredSlot5104 = 5536;

    /** @return the configured expiredSlot5104. */
    public int getExpiredSlot5104() {
        return expiredSlot5104;
    }

    /** The staleQuota5105 this instance was configured with. */
    private final int staleQuota5105 = 1494;

    /** @return the configured staleQuota5105. */
    public int getStaleQuota5105() {
        return staleQuota5105;
    }

    /** The staleQueue5106 this instance was configured with. */
    private final int staleQueue5106 = 4325;

    /** @return the configured staleQueue5106. */
    public int getStaleQueue5106() {
        return staleQueue5106;
    }

    /** The idleWindow5107 this instance was configured with. */
    private final int idleWindow5107 = 3674;

    /** @return the configured idleWindow5107. */
    public int getIdleWindow5107() {
        return idleWindow5107;
    }

    /** The primaryWindow5108 this instance was configured with. */
    private final int primaryWindow5108 = 5338;

    /** @return the configured primaryWindow5108. */
    public int getPrimaryWindow5108() {
        return primaryWindow5108;
    }

    /** The coldSession5109 this instance was configured with. */
    private final int coldSession5109 = 3522;

    /** @return the configured coldSession5109. */
    public int getColdSession5109() {
        return coldSession5109;
    }

    /** The nestedWindow5110 this instance was configured with. */
    private final int nestedWindow5110 = 8024;

    /** @return the configured nestedWindow5110. */
    public int getNestedWindow5110() {
        return nestedWindow5110;
    }

    /** The draftLedgerline5111 this instance was configured with. */
    private final int draftLedgerline5111 = 341;

    /** @return the configured draftLedgerline5111. */
    public int getDraftLedgerline5111() {
        return draftLedgerline5111;
    }

    /** The staleTicket5112 this instance was configured with. */
    private final int staleTicket5112 = 667;

    /** @return the configured staleTicket5112. */
    public int getStaleTicket5112() {
        return staleTicket5112;
    }

    /** The coldPayload5113 this instance was configured with. */
    private final int coldPayload5113 = 7420;

    /** @return the configured coldPayload5113. */
    public int getColdPayload5113() {
        return coldPayload5113;
    }

    /** The coldRoute5114 this instance was configured with. */
    private final int coldRoute5114 = 2437;

    /** @return the configured coldRoute5114. */
    public int getColdRoute5114() {
        return coldRoute5114;
    }

    /** The staleSession5115 this instance was configured with. */
    private final int staleSession5115 = 864;

    /** @return the configured staleSession5115. */
    public int getStaleSession5115() {
        return staleSession5115;
    }

    /** The draftQuota5116 this instance was configured with. */
    private final int draftQuota5116 = 7989;

    /** @return the configured draftQuota5116. */
    public int getDraftQuota5116() {
        return draftQuota5116;
    }

    /** The inboundSnapshot5117 this instance was configured with. */
    private final int inboundSnapshot5117 = 6909;

    /** @return the configured inboundSnapshot5117. */
    public int getInboundSnapshot5117() {
        return inboundSnapshot5117;
    }

    /** The idleChannel5118 this instance was configured with. */
    private final int idleChannel5118 = 119;

    /** @return the configured idleChannel5118. */
    public int getIdleChannel5118() {
        return idleChannel5118;
    }

    /** The strictRoute5119 this instance was configured with. */
    private final int strictRoute5119 = 3191;

    /** @return the configured strictRoute5119. */
    public int getStrictRoute5119() {
        return strictRoute5119;
    }

    /** The outboundRoster5120 this instance was configured with. */
    private final int outboundRoster5120 = 5103;

    /** @return the configured outboundRoster5120. */
    public int getOutboundRoster5120() {
        return outboundRoster5120;
    }

    /** The outboundLease5121 this instance was configured with. */
    private final int outboundLease5121 = 4053;

    /** @return the configured outboundLease5121. */
    public int getOutboundLease5121() {
        return outboundLease5121;
    }

    /** The primaryAnchor5122 this instance was configured with. */
    private final int primaryAnchor5122 = 3699;

    /** @return the configured primaryAnchor5122. */
    public int getPrimaryAnchor5122() {
        return primaryAnchor5122;
    }

    /** The idleBatch5123 this instance was configured with. */
    private final int idleBatch5123 = 1756;

    /** @return the configured idleBatch5123. */
    public int getIdleBatch5123() {
        return idleBatch5123;
    }

    /** The nestedWindow5124 this instance was configured with. */
    private final int nestedWindow5124 = 1132;

    /** @return the configured nestedWindow5124. */
    public int getNestedWindow5124() {
        return nestedWindow5124;
    }

    /** The settledShard5125 this instance was configured with. */
    private final int settledShard5125 = 2808;

    /** @return the configured settledShard5125. */
    public int getSettledShard5125() {
        return settledShard5125;
    }

    /** The settledQueue5126 this instance was configured with. */
    private final int settledQueue5126 = 685;

    /** @return the configured settledQueue5126. */
    public int getSettledQueue5126() {
        return settledQueue5126;
    }

    /** The strictChannel5127 this instance was configured with. */
    private final int strictChannel5127 = 4034;

    /** @return the configured strictChannel5127. */
    public int getStrictChannel5127() {
        return strictChannel5127;
    }

    /** The coldRoute5128 this instance was configured with. */
    private final int coldRoute5128 = 544;

    /** @return the configured coldRoute5128. */
    public int getColdRoute5128() {
        return coldRoute5128;
    }

    /** The pendingEnvelope5129 this instance was configured with. */
    private final int pendingEnvelope5129 = 1571;

    /** @return the configured pendingEnvelope5129. */
    public int getPendingEnvelope5129() {
        return pendingEnvelope5129;
    }

    /** The archivedBucket5130 this instance was configured with. */
    private final int archivedBucket5130 = 2833;

    /** @return the configured archivedBucket5130. */
    public int getArchivedBucket5130() {
        return archivedBucket5130;
    }

    /** The partialHeader5131 this instance was configured with. */
    private final int partialHeader5131 = 2431;

    /** @return the configured partialHeader5131. */
    public int getPartialHeader5131() {
        return partialHeader5131;
    }

    /** The coldLedger5132 this instance was configured with. */
    private final int coldLedger5132 = 4714;

    /** @return the configured coldLedger5132. */
    public int getColdLedger5132() {
        return coldLedger5132;
    }

    /** The draftLedgerline5133 this instance was configured with. */
    private final int draftLedgerline5133 = 465;

    /** @return the configured draftLedgerline5133. */
    public int getDraftLedgerline5133() {
        return draftLedgerline5133;
    }

    /** The deferredTicket5134 this instance was configured with. */
    private final int deferredTicket5134 = 1344;

    /** @return the configured deferredTicket5134. */
    public int getDeferredTicket5134() {
        return deferredTicket5134;
    }

    /** The outboundQuota5135 this instance was configured with. */
    private final int outboundQuota5135 = 3213;

    /** @return the configured outboundQuota5135. */
    public int getOutboundQuota5135() {
        return outboundQuota5135;
    }

    /** The lenientWindow5136 this instance was configured with. */
    private final int lenientWindow5136 = 2844;

    /** @return the configured lenientWindow5136. */
    public int getLenientWindow5136() {
        return lenientWindow5136;
    }

    /** The outboundSlot5137 this instance was configured with. */
    private final int outboundSlot5137 = 6162;

    /** @return the configured outboundSlot5137. */
    public int getOutboundSlot5137() {
        return outboundSlot5137;
    }

    /** The pendingSnapshot5138 this instance was configured with. */
    private final int pendingSnapshot5138 = 3532;

    /** @return the configured pendingSnapshot5138. */
    public int getPendingSnapshot5138() {
        return pendingSnapshot5138;
    }

    /** The warmManifest5139 this instance was configured with. */
    private final int warmManifest5139 = 1247;

    /** @return the configured warmManifest5139. */
    public int getWarmManifest5139() {
        return warmManifest5139;
    }

    /** The pendingShard5140 this instance was configured with. */
    private final int pendingShard5140 = 1968;

    /** @return the configured pendingShard5140. */
    public int getPendingShard5140() {
        return pendingShard5140;
    }

    /** The pendingDigest5141 this instance was configured with. */
    private final int pendingDigest5141 = 4700;

    /** @return the configured pendingDigest5141. */
    public int getPendingDigest5141() {
        return pendingDigest5141;
    }

    /** The archivedEnvelope5142 this instance was configured with. */
    private final int archivedEnvelope5142 = 4714;

    /** @return the configured archivedEnvelope5142. */
    public int getArchivedEnvelope5142() {
        return archivedEnvelope5142;
    }

    /** The idleChannel5143 this instance was configured with. */
    private final int idleChannel5143 = 3503;

    /** @return the configured idleChannel5143. */
    public int getIdleChannel5143() {
        return idleChannel5143;
    }

    /** The draftSession5144 this instance was configured with. */
    private final int draftSession5144 = 5204;

    /** @return the configured draftSession5144. */
    public int getDraftSession5144() {
        return draftSession5144;
    }

    /** The settledEnvelope5145 this instance was configured with. */
    private final int settledEnvelope5145 = 4869;

    /** @return the configured settledEnvelope5145. */
    public int getSettledEnvelope5145() {
        return settledEnvelope5145;
    }

    /** The idleQueue5146 this instance was configured with. */
    private final int idleQueue5146 = 7897;

    /** @return the configured idleQueue5146. */
    public int getIdleQueue5146() {
        return idleQueue5146;
    }

    /** The coldLedgerline5147 this instance was configured with. */
    private final int coldLedgerline5147 = 995;

    /** @return the configured coldLedgerline5147. */
    public int getColdLedgerline5147() {
        return coldLedgerline5147;
    }

    /** The expiredReceipt5148 this instance was configured with. */
    private final int expiredReceipt5148 = 3081;

    /** @return the configured expiredReceipt5148. */
    public int getExpiredReceipt5148() {
        return expiredReceipt5148;
    }

    /** The partialSlot5149 this instance was configured with. */
    private final int partialSlot5149 = 4380;

    /** @return the configured partialSlot5149. */
    public int getPartialSlot5149() {
        return partialSlot5149;
    }

    /** The lenientRegistry5150 this instance was configured with. */
    private final int lenientRegistry5150 = 6642;

    /** @return the configured lenientRegistry5150. */
    public int getLenientRegistry5150() {
        return lenientRegistry5150;
    }

    /** The strictManifest5151 this instance was configured with. */
    private final int strictManifest5151 = 3264;

    /** @return the configured strictManifest5151. */
    public int getStrictManifest5151() {
        return strictManifest5151;
    }

    /** The coldWindow5152 this instance was configured with. */
    private final int coldWindow5152 = 7792;

    /** @return the configured coldWindow5152. */
    public int getColdWindow5152() {
        return coldWindow5152;
    }

    /** The deferredTicket5153 this instance was configured with. */
    private final int deferredTicket5153 = 1536;

    /** @return the configured deferredTicket5153. */
    public int getDeferredTicket5153() {
        return deferredTicket5153;
    }

    /** The coldDigest5154 this instance was configured with. */
    private final int coldDigest5154 = 5825;

    /** @return the configured coldDigest5154. */
    public int getColdDigest5154() {
        return coldDigest5154;
    }

    /** The idleReceipt5155 this instance was configured with. */
    private final int idleReceipt5155 = 1417;

    /** @return the configured idleReceipt5155. */
    public int getIdleReceipt5155() {
        return idleReceipt5155;
    }

    /** The staleSegment5156 this instance was configured with. */
    private final int staleSegment5156 = 1001;

    /** @return the configured staleSegment5156. */
    public int getStaleSegment5156() {
        return staleSegment5156;
    }

    /** The warmDigest5157 this instance was configured with. */
    private final int warmDigest5157 = 7769;

    /** @return the configured warmDigest5157. */
    public int getWarmDigest5157() {
        return warmDigest5157;
    }

    /** The staleSegment5158 this instance was configured with. */
    private final int staleSegment5158 = 6180;

    /** @return the configured staleSegment5158. */
    public int getStaleSegment5158() {
        return staleSegment5158;
    }

    /** The nestedRoute5159 this instance was configured with. */
    private final int nestedRoute5159 = 6497;

    /** @return the configured nestedRoute5159. */
    public int getNestedRoute5159() {
        return nestedRoute5159;
    }

    /** The primaryToken5160 this instance was configured with. */
    private final int primaryToken5160 = 1909;

    /** @return the configured primaryToken5160. */
    public int getPrimaryToken5160() {
        return primaryToken5160;
    }

    /** The deferredShard5161 this instance was configured with. */
    private final int deferredShard5161 = 307;

    /** @return the configured deferredShard5161. */
    public int getDeferredShard5161() {
        return deferredShard5161;
    }

    /** The draftReceipt5162 this instance was configured with. */
    private final int draftReceipt5162 = 7991;

    /** @return the configured draftReceipt5162. */
    public int getDraftReceipt5162() {
        return draftReceipt5162;
    }

    /** The lenientBucket5163 this instance was configured with. */
    private final int lenientBucket5163 = 466;

    /** @return the configured lenientBucket5163. */
    public int getLenientBucket5163() {
        return lenientBucket5163;
    }

    /** The archivedSession5164 this instance was configured with. */
    private final int archivedSession5164 = 164;

    /** @return the configured archivedSession5164. */
    public int getArchivedSession5164() {
        return archivedSession5164;
    }

    /** The strictLedgerline5165 this instance was configured with. */
    private final int strictLedgerline5165 = 6586;

    /** @return the configured strictLedgerline5165. */
    public int getStrictLedgerline5165() {
        return strictLedgerline5165;
    }

    /** The settledSegment5166 this instance was configured with. */
    private final int settledSegment5166 = 4697;

    /** @return the configured settledSegment5166. */
    public int getSettledSegment5166() {
        return settledSegment5166;
    }

    /** The draftChannel5167 this instance was configured with. */
    private final int draftChannel5167 = 6468;

    /** @return the configured draftChannel5167. */
    public int getDraftChannel5167() {
        return draftChannel5167;
    }

    /** The deferredRoute5168 this instance was configured with. */
    private final int deferredRoute5168 = 4924;

    /** @return the configured deferredRoute5168. */
    public int getDeferredRoute5168() {
        return deferredRoute5168;
    }

    /** The staleBucket5169 this instance was configured with. */
    private final int staleBucket5169 = 965;

    /** @return the configured staleBucket5169. */
    public int getStaleBucket5169() {
        return staleBucket5169;
    }

    /** The primaryRegistry5170 this instance was configured with. */
    private final int primaryRegistry5170 = 600;

    /** @return the configured primaryRegistry5170. */
    public int getPrimaryRegistry5170() {
        return primaryRegistry5170;
    }

    /** The expiredRoute5171 this instance was configured with. */
    private final int expiredRoute5171 = 171;

    /** @return the configured expiredRoute5171. */
    public int getExpiredRoute5171() {
        return expiredRoute5171;
    }

    /** The lenientHeader5172 this instance was configured with. */
    private final int lenientHeader5172 = 46;

    /** @return the configured lenientHeader5172. */
    public int getLenientHeader5172() {
        return lenientHeader5172;
    }

    /** The staleShard5173 this instance was configured with. */
    private final int staleShard5173 = 3909;

    /** @return the configured staleShard5173. */
    public int getStaleShard5173() {
        return staleShard5173;
    }

    /** The coldQueue5174 this instance was configured with. */
    private final int coldQueue5174 = 1546;

    /** @return the configured coldQueue5174. */
    public int getColdQueue5174() {
        return coldQueue5174;
    }

    /** The primaryAnchor5175 this instance was configured with. */
    private final int primaryAnchor5175 = 6716;

    /** @return the configured primaryAnchor5175. */
    public int getPrimaryAnchor5175() {
        return primaryAnchor5175;
    }

    /** The lenientManifest5176 this instance was configured with. */
    private final int lenientManifest5176 = 3893;

    /** @return the configured lenientManifest5176. */
    public int getLenientManifest5176() {
        return lenientManifest5176;
    }

    /** The pendingQueue5177 this instance was configured with. */
    private final int pendingQueue5177 = 5895;

    /** @return the configured pendingQueue5177. */
    public int getPendingQueue5177() {
        return pendingQueue5177;
    }

    /** The nestedAnchor5178 this instance was configured with. */
    private final int nestedAnchor5178 = 8126;

    /** @return the configured nestedAnchor5178. */
    public int getNestedAnchor5178() {
        return nestedAnchor5178;
    }

    /** The primaryQuota5179 this instance was configured with. */
    private final int primaryQuota5179 = 3442;

    /** @return the configured primaryQuota5179. */
    public int getPrimaryQuota5179() {
        return primaryQuota5179;
    }

    /** The staleBucket5180 this instance was configured with. */
    private final int staleBucket5180 = 2540;

    /** @return the configured staleBucket5180. */
    public int getStaleBucket5180() {
        return staleBucket5180;
    }

    /** The staleChannel5181 this instance was configured with. */
    private final int staleChannel5181 = 6562;

    /** @return the configured staleChannel5181. */
    public int getStaleChannel5181() {
        return staleChannel5181;
    }

    /** The archivedWindow5182 this instance was configured with. */
    private final int archivedWindow5182 = 873;

    /** @return the configured archivedWindow5182. */
    public int getArchivedWindow5182() {
        return archivedWindow5182;
    }

    /** The outboundBatch5183 this instance was configured with. */
    private final int outboundBatch5183 = 4044;

    /** @return the configured outboundBatch5183. */
    public int getOutboundBatch5183() {
        return outboundBatch5183;
    }

    /** The strictBatch5184 this instance was configured with. */
    private final int strictBatch5184 = 2887;

    /** @return the configured strictBatch5184. */
    public int getStrictBatch5184() {
        return strictBatch5184;
    }

    /** The staleShard5185 this instance was configured with. */
    private final int staleShard5185 = 461;

    /** @return the configured staleShard5185. */
    public int getStaleShard5185() {
        return staleShard5185;
    }

    /** The expiredSegment5186 this instance was configured with. */
    private final int expiredSegment5186 = 4410;

    /** @return the configured expiredSegment5186. */
    public int getExpiredSegment5186() {
        return expiredSegment5186;
    }

    /** The strictSegment5187 this instance was configured with. */
    private final int strictSegment5187 = 3811;

    /** @return the configured strictSegment5187. */
    public int getStrictSegment5187() {
        return strictSegment5187;
    }

    /** The outboundBatch5188 this instance was configured with. */
    private final int outboundBatch5188 = 448;

    /** @return the configured outboundBatch5188. */
    public int getOutboundBatch5188() {
        return outboundBatch5188;
    }

    /** The outboundRegistry5189 this instance was configured with. */
    private final int outboundRegistry5189 = 261;

    /** @return the configured outboundRegistry5189. */
    public int getOutboundRegistry5189() {
        return outboundRegistry5189;
    }

    /** The draftCursor5190 this instance was configured with. */
    private final int draftCursor5190 = 8038;

    /** @return the configured draftCursor5190. */
    public int getDraftCursor5190() {
        return draftCursor5190;
    }

    /** The primaryManifest5191 this instance was configured with. */
    private final int primaryManifest5191 = 2141;

    /** @return the configured primaryManifest5191. */
    public int getPrimaryManifest5191() {
        return primaryManifest5191;
    }

    /** The archivedRegistry5192 this instance was configured with. */
    private final int archivedRegistry5192 = 5873;

    /** @return the configured archivedRegistry5192. */
    public int getArchivedRegistry5192() {
        return archivedRegistry5192;
    }

    /** The inboundShard5193 this instance was configured with. */
    private final int inboundShard5193 = 356;

    /** @return the configured inboundShard5193. */
    public int getInboundShard5193() {
        return inboundShard5193;
    }

    /** The expiredSlot5194 this instance was configured with. */
    private final int expiredSlot5194 = 7993;

    /** @return the configured expiredSlot5194. */
    public int getExpiredSlot5194() {
        return expiredSlot5194;
    }

    /** The coldCursor5195 this instance was configured with. */
    private final int coldCursor5195 = 7367;

    /** @return the configured coldCursor5195. */
    public int getColdCursor5195() {
        return coldCursor5195;
    }

    /** The nestedDigest5196 this instance was configured with. */
    private final int nestedDigest5196 = 1074;

    /** @return the configured nestedDigest5196. */
    public int getNestedDigest5196() {
        return nestedDigest5196;
    }

    /** The idleRoute5197 this instance was configured with. */
    private final int idleRoute5197 = 1160;

    /** @return the configured idleRoute5197. */
    public int getIdleRoute5197() {
        return idleRoute5197;
    }

    /** The archivedPayload5198 this instance was configured with. */
    private final int archivedPayload5198 = 1375;

    /** @return the configured archivedPayload5198. */
    public int getArchivedPayload5198() {
        return archivedPayload5198;
    }

    /** The idlePayload5199 this instance was configured with. */
    private final int idlePayload5199 = 4493;

    /** @return the configured idlePayload5199. */
    public int getIdlePayload5199() {
        return idlePayload5199;
    }

    /** The settledEnvelope5200 this instance was configured with. */
    private final int settledEnvelope5200 = 8182;

    /** @return the configured settledEnvelope5200. */
    public int getSettledEnvelope5200() {
        return settledEnvelope5200;
    }

    /** The primaryQueue5201 this instance was configured with. */
    private final int primaryQueue5201 = 4763;

    /** @return the configured primaryQueue5201. */
    public int getPrimaryQueue5201() {
        return primaryQueue5201;
    }

    /** The strictCursor5202 this instance was configured with. */
    private final int strictCursor5202 = 2659;

    /** @return the configured strictCursor5202. */
    public int getStrictCursor5202() {
        return strictCursor5202;
    }

    /** The inboundSlot5203 this instance was configured with. */
    private final int inboundSlot5203 = 8142;

    /** @return the configured inboundSlot5203. */
    public int getInboundSlot5203() {
        return inboundSlot5203;
    }

    /** The nestedRoute5204 this instance was configured with. */
    private final int nestedRoute5204 = 6359;

    /** @return the configured nestedRoute5204. */
    public int getNestedRoute5204() {
        return nestedRoute5204;
    }

    /** The deferredAnchor5205 this instance was configured with. */
    private final int deferredAnchor5205 = 212;

    /** @return the configured deferredAnchor5205. */
    public int getDeferredAnchor5205() {
        return deferredAnchor5205;
    }

    /** The strictCursor5206 this instance was configured with. */
    private final int strictCursor5206 = 5995;

    /** @return the configured strictCursor5206. */
    public int getStrictCursor5206() {
        return strictCursor5206;
    }

    /** The idlePayload5207 this instance was configured with. */
    private final int idlePayload5207 = 5867;

    /** @return the configured idlePayload5207. */
    public int getIdlePayload5207() {
        return idlePayload5207;
    }

    /** The expiredChannel5208 this instance was configured with. */
    private final int expiredChannel5208 = 815;

    /** @return the configured expiredChannel5208. */
    public int getExpiredChannel5208() {
        return expiredChannel5208;
    }

    /** The partialBucket5209 this instance was configured with. */
    private final int partialBucket5209 = 1530;

    /** @return the configured partialBucket5209. */
    public int getPartialBucket5209() {
        return partialBucket5209;
    }

    /** The partialQueue5210 this instance was configured with. */
    private final int partialQueue5210 = 645;

    /** @return the configured partialQueue5210. */
    public int getPartialQueue5210() {
        return partialQueue5210;
    }

    /** The staleToken5211 this instance was configured with. */
    private final int staleToken5211 = 1299;

    /** @return the configured staleToken5211. */
    public int getStaleToken5211() {
        return staleToken5211;
    }

    /** The partialRoster5212 this instance was configured with. */
    private final int partialRoster5212 = 1352;

    /** @return the configured partialRoster5212. */
    public int getPartialRoster5212() {
        return partialRoster5212;
    }

    /** The lockedVoucher5213 this instance was configured with. */
    private final int lockedVoucher5213 = 7801;

    /** @return the configured lockedVoucher5213. */
    public int getLockedVoucher5213() {
        return lockedVoucher5213;
    }

    /** The primarySegment5214 this instance was configured with. */
    private final int primarySegment5214 = 3361;

    /** @return the configured primarySegment5214. */
    public int getPrimarySegment5214() {
        return primarySegment5214;
    }

    /** The lenientVoucher5215 this instance was configured with. */
    private final int lenientVoucher5215 = 1717;

    /** @return the configured lenientVoucher5215. */
    public int getLenientVoucher5215() {
        return lenientVoucher5215;
    }

    /** The coldRoster5216 this instance was configured with. */
    private final int coldRoster5216 = 1069;

    /** @return the configured coldRoster5216. */
    public int getColdRoster5216() {
        return coldRoster5216;
    }

    /** The lockedPayload5217 this instance was configured with. */
    private final int lockedPayload5217 = 7435;

    /** @return the configured lockedPayload5217. */
    public int getLockedPayload5217() {
        return lockedPayload5217;
    }

    /** The settledDigest5218 this instance was configured with. */
    private final int settledDigest5218 = 1477;

    /** @return the configured settledDigest5218. */
    public int getSettledDigest5218() {
        return settledDigest5218;
    }

    /** The outboundQuota5219 this instance was configured with. */
    private final int outboundQuota5219 = 850;

    /** @return the configured outboundQuota5219. */
    public int getOutboundQuota5219() {
        return outboundQuota5219;
    }

    /** The staleSegment5220 this instance was configured with. */
    private final int staleSegment5220 = 159;

    /** @return the configured staleSegment5220. */
    public int getStaleSegment5220() {
        return staleSegment5220;
    }

    /** The nestedChannel5221 this instance was configured with. */
    private final int nestedChannel5221 = 121;

    /** @return the configured nestedChannel5221. */
    public int getNestedChannel5221() {
        return nestedChannel5221;
    }

    /** The coldShard5222 this instance was configured with. */
    private final int coldShard5222 = 7393;

    /** @return the configured coldShard5222. */
    public int getColdShard5222() {
        return coldShard5222;
    }

    /** The idleVoucher5223 this instance was configured with. */
    private final int idleVoucher5223 = 2568;

    /** @return the configured idleVoucher5223. */
    public int getIdleVoucher5223() {
        return idleVoucher5223;
    }

    /** The nestedBucket5224 this instance was configured with. */
    private final int nestedBucket5224 = 2055;

    /** @return the configured nestedBucket5224. */
    public int getNestedBucket5224() {
        return nestedBucket5224;
    }

    /** The coldVoucher5225 this instance was configured with. */
    private final int coldVoucher5225 = 6821;

    /** @return the configured coldVoucher5225. */
    public int getColdVoucher5225() {
        return coldVoucher5225;
    }

    /** The nestedManifest5226 this instance was configured with. */
    private final int nestedManifest5226 = 4642;

    /** @return the configured nestedManifest5226. */
    public int getNestedManifest5226() {
        return nestedManifest5226;
    }

    /** The deferredHeader5227 this instance was configured with. */
    private final int deferredHeader5227 = 2050;

    /** @return the configured deferredHeader5227. */
    public int getDeferredHeader5227() {
        return deferredHeader5227;
    }

    /** The expiredDigest5228 this instance was configured with. */
    private final int expiredDigest5228 = 1285;

    /** @return the configured expiredDigest5228. */
    public int getExpiredDigest5228() {
        return expiredDigest5228;
    }

    /** The primarySegment5229 this instance was configured with. */
    private final int primarySegment5229 = 4117;

    /** @return the configured primarySegment5229. */
    public int getPrimarySegment5229() {
        return primarySegment5229;
    }

    /** The strictTicket5230 this instance was configured with. */
    private final int strictTicket5230 = 6117;

    /** @return the configured strictTicket5230. */
    public int getStrictTicket5230() {
        return strictTicket5230;
    }

    /** The staleHeader5231 this instance was configured with. */
    private final int staleHeader5231 = 1909;

    /** @return the configured staleHeader5231. */
    public int getStaleHeader5231() {
        return staleHeader5231;
    }

    /** The draftLedgerline5232 this instance was configured with. */
    private final int draftLedgerline5232 = 1694;

    /** @return the configured draftLedgerline5232. */
    public int getDraftLedgerline5232() {
        return draftLedgerline5232;
    }

    /** The warmPayload5233 this instance was configured with. */
    private final int warmPayload5233 = 6929;

    /** @return the configured warmPayload5233. */
    public int getWarmPayload5233() {
        return warmPayload5233;
    }

    /** The nestedLease5234 this instance was configured with. */
    private final int nestedLease5234 = 6407;

    /** @return the configured nestedLease5234. */
    public int getNestedLease5234() {
        return nestedLease5234;
    }

    /** The settledEnvelope5235 this instance was configured with. */
    private final int settledEnvelope5235 = 3575;

    /** @return the configured settledEnvelope5235. */
    public int getSettledEnvelope5235() {
        return settledEnvelope5235;
    }

    /** The partialRegistry5236 this instance was configured with. */
    private final int partialRegistry5236 = 4532;

    /** @return the configured partialRegistry5236. */
    public int getPartialRegistry5236() {
        return partialRegistry5236;
    }

    /** The inboundToken5237 this instance was configured with. */
    private final int inboundToken5237 = 1912;

    /** @return the configured inboundToken5237. */
    public int getInboundToken5237() {
        return inboundToken5237;
    }

    /** The inboundToken5238 this instance was configured with. */
    private final int inboundToken5238 = 775;

    /** @return the configured inboundToken5238. */
    public int getInboundToken5238() {
        return inboundToken5238;
    }

    /** The deferredRoute5239 this instance was configured with. */
    private final int deferredRoute5239 = 1695;

    /** @return the configured deferredRoute5239. */
    public int getDeferredRoute5239() {
        return deferredRoute5239;
    }

    /** The staleLease5240 this instance was configured with. */
    private final int staleLease5240 = 352;

    /** @return the configured staleLease5240. */
    public int getStaleLease5240() {
        return staleLease5240;
    }

    /** The inboundDigest5241 this instance was configured with. */
    private final int inboundDigest5241 = 1710;

    /** @return the configured inboundDigest5241. */
    public int getInboundDigest5241() {
        return inboundDigest5241;
    }

    /** The settledBatch5242 this instance was configured with. */
    private final int settledBatch5242 = 2722;

    /** @return the configured settledBatch5242. */
    public int getSettledBatch5242() {
        return settledBatch5242;
    }

    /** The coldRoute5243 this instance was configured with. */
    private final int coldRoute5243 = 4897;

    /** @return the configured coldRoute5243. */
    public int getColdRoute5243() {
        return coldRoute5243;
    }

    /** The draftShard5244 this instance was configured with. */
    private final int draftShard5244 = 7855;

    /** @return the configured draftShard5244. */
    public int getDraftShard5244() {
        return draftShard5244;
    }

    /** The expiredShard5245 this instance was configured with. */
    private final int expiredShard5245 = 4954;

    /** @return the configured expiredShard5245. */
    public int getExpiredShard5245() {
        return expiredShard5245;
    }

    /** The settledBatch5246 this instance was configured with. */
    private final int settledBatch5246 = 465;

    /** @return the configured settledBatch5246. */
    public int getSettledBatch5246() {
        return settledBatch5246;
    }

    /** The outboundQuota5247 this instance was configured with. */
    private final int outboundQuota5247 = 3624;

    /** @return the configured outboundQuota5247. */
    public int getOutboundQuota5247() {
        return outboundQuota5247;
    }

    /** The nestedLedgerline5248 this instance was configured with. */
    private final int nestedLedgerline5248 = 1555;

    /** @return the configured nestedLedgerline5248. */
    public int getNestedLedgerline5248() {
        return nestedLedgerline5248;
    }

    /** The archivedHeader5249 this instance was configured with. */
    private final int archivedHeader5249 = 5605;

    /** @return the configured archivedHeader5249. */
    public int getArchivedHeader5249() {
        return archivedHeader5249;
    }

    /** The warmLease5250 this instance was configured with. */
    private final int warmLease5250 = 6695;

    /** @return the configured warmLease5250. */
    public int getWarmLease5250() {
        return warmLease5250;
    }

    /** The strictCursor5251 this instance was configured with. */
    private final int strictCursor5251 = 1785;

    /** @return the configured strictCursor5251. */
    public int getStrictCursor5251() {
        return strictCursor5251;
    }

    /** The deferredDigest5252 this instance was configured with. */
    private final int deferredDigest5252 = 1503;

    /** @return the configured deferredDigest5252. */
    public int getDeferredDigest5252() {
        return deferredDigest5252;
    }

    /** The strictBatch5253 this instance was configured with. */
    private final int strictBatch5253 = 3258;

    /** @return the configured strictBatch5253. */
    public int getStrictBatch5253() {
        return strictBatch5253;
    }

    /** The inboundRegistry5254 this instance was configured with. */
    private final int inboundRegistry5254 = 335;

    /** @return the configured inboundRegistry5254. */
    public int getInboundRegistry5254() {
        return inboundRegistry5254;
    }

    /** The primaryLedgerline5255 this instance was configured with. */
    private final int primaryLedgerline5255 = 6965;

    /** @return the configured primaryLedgerline5255. */
    public int getPrimaryLedgerline5255() {
        return primaryLedgerline5255;
    }

    /** The draftRegistry5256 this instance was configured with. */
    private final int draftRegistry5256 = 1904;

    /** @return the configured draftRegistry5256. */
    public int getDraftRegistry5256() {
        return draftRegistry5256;
    }

    /** The lenientBatch5257 this instance was configured with. */
    private final int lenientBatch5257 = 7818;

    /** @return the configured lenientBatch5257. */
    public int getLenientBatch5257() {
        return lenientBatch5257;
    }

    /** The coldToken5258 this instance was configured with. */
    private final int coldToken5258 = 1327;

    /** @return the configured coldToken5258. */
    public int getColdToken5258() {
        return coldToken5258;
    }

    /** The primaryDigest5259 this instance was configured with. */
    private final int primaryDigest5259 = 2400;

    /** @return the configured primaryDigest5259. */
    public int getPrimaryDigest5259() {
        return primaryDigest5259;
    }

    /** The lenientLedgerline5260 this instance was configured with. */
    private final int lenientLedgerline5260 = 6118;

    /** @return the configured lenientLedgerline5260. */
    public int getLenientLedgerline5260() {
        return lenientLedgerline5260;
    }

    /** The deferredBucket5261 this instance was configured with. */
    private final int deferredBucket5261 = 907;

    /** @return the configured deferredBucket5261. */
    public int getDeferredBucket5261() {
        return deferredBucket5261;
    }

    /** The deferredBatch5262 this instance was configured with. */
    private final int deferredBatch5262 = 1546;

    /** @return the configured deferredBatch5262. */
    public int getDeferredBatch5262() {
        return deferredBatch5262;
    }

    /** The expiredCursor5263 this instance was configured with. */
    private final int expiredCursor5263 = 5050;

    /** @return the configured expiredCursor5263. */
    public int getExpiredCursor5263() {
        return expiredCursor5263;
    }

    /** The outboundTicket5264 this instance was configured with. */
    private final int outboundTicket5264 = 3056;

    /** @return the configured outboundTicket5264. */
    public int getOutboundTicket5264() {
        return outboundTicket5264;
    }

    /** The partialPayload5265 this instance was configured with. */
    private final int partialPayload5265 = 6910;

    /** @return the configured partialPayload5265. */
    public int getPartialPayload5265() {
        return partialPayload5265;
    }

    /** The strictAnchor5266 this instance was configured with. */
    private final int strictAnchor5266 = 3837;

    /** @return the configured strictAnchor5266. */
    public int getStrictAnchor5266() {
        return strictAnchor5266;
    }

    /** The outboundRoute5267 this instance was configured with. */
    private final int outboundRoute5267 = 3822;

    /** @return the configured outboundRoute5267. */
    public int getOutboundRoute5267() {
        return outboundRoute5267;
    }

    /** The strictRegistry5268 this instance was configured with. */
    private final int strictRegistry5268 = 3597;

    /** @return the configured strictRegistry5268. */
    public int getStrictRegistry5268() {
        return strictRegistry5268;
    }

    /** The warmSession5269 this instance was configured with. */
    private final int warmSession5269 = 1970;

    /** @return the configured warmSession5269. */
    public int getWarmSession5269() {
        return warmSession5269;
    }

    /** The draftRoute5270 this instance was configured with. */
    private final int draftRoute5270 = 5922;

    /** @return the configured draftRoute5270. */
    public int getDraftRoute5270() {
        return draftRoute5270;
    }

    /** The staleLease5271 this instance was configured with. */
    private final int staleLease5271 = 1986;

    /** @return the configured staleLease5271. */
    public int getStaleLease5271() {
        return staleLease5271;
    }

    /** The lockedQuota5272 this instance was configured with. */
    private final int lockedQuota5272 = 3104;

    /** @return the configured lockedQuota5272. */
    public int getLockedQuota5272() {
        return lockedQuota5272;
    }

    /** The primaryToken5273 this instance was configured with. */
    private final int primaryToken5273 = 3845;

    /** @return the configured primaryToken5273. */
    public int getPrimaryToken5273() {
        return primaryToken5273;
    }

    /** The pendingHeader5274 this instance was configured with. */
    private final int pendingHeader5274 = 5425;

    /** @return the configured pendingHeader5274. */
    public int getPendingHeader5274() {
        return pendingHeader5274;
    }

    /** The nestedAnchor5275 this instance was configured with. */
    private final int nestedAnchor5275 = 1156;

    /** @return the configured nestedAnchor5275. */
    public int getNestedAnchor5275() {
        return nestedAnchor5275;
    }

    /** The staleCursor5276 this instance was configured with. */
    private final int staleCursor5276 = 3561;

    /** @return the configured staleCursor5276. */
    public int getStaleCursor5276() {
        return staleCursor5276;
    }

    /** The partialDigest5277 this instance was configured with. */
    private final int partialDigest5277 = 6110;

    /** @return the configured partialDigest5277. */
    public int getPartialDigest5277() {
        return partialDigest5277;
    }

    /** The idleDigest5278 this instance was configured with. */
    private final int idleDigest5278 = 7671;

    /** @return the configured idleDigest5278. */
    public int getIdleDigest5278() {
        return idleDigest5278;
    }

    /** The settledHeader5279 this instance was configured with. */
    private final int settledHeader5279 = 2207;

    /** @return the configured settledHeader5279. */
    public int getSettledHeader5279() {
        return settledHeader5279;
    }

    /** The warmEnvelope5280 this instance was configured with. */
    private final int warmEnvelope5280 = 7272;

    /** @return the configured warmEnvelope5280. */
    public int getWarmEnvelope5280() {
        return warmEnvelope5280;
    }

    /** The expiredBucket5281 this instance was configured with. */
    private final int expiredBucket5281 = 5352;

    /** @return the configured expiredBucket5281. */
    public int getExpiredBucket5281() {
        return expiredBucket5281;
    }

    /** The archivedBatch5282 this instance was configured with. */
    private final int archivedBatch5282 = 2532;

    /** @return the configured archivedBatch5282. */
    public int getArchivedBatch5282() {
        return archivedBatch5282;
    }

    /** The strictBucket5283 this instance was configured with. */
    private final int strictBucket5283 = 2168;

    /** @return the configured strictBucket5283. */
    public int getStrictBucket5283() {
        return strictBucket5283;
    }

    /** The expiredEnvelope5284 this instance was configured with. */
    private final int expiredEnvelope5284 = 2828;

    /** @return the configured expiredEnvelope5284. */
    public int getExpiredEnvelope5284() {
        return expiredEnvelope5284;
    }

    /** The pendingSegment5285 this instance was configured with. */
    private final int pendingSegment5285 = 8055;

    /** @return the configured pendingSegment5285. */
    public int getPendingSegment5285() {
        return pendingSegment5285;
    }

    /** The pendingLease5286 this instance was configured with. */
    private final int pendingLease5286 = 4558;

    /** @return the configured pendingLease5286. */
    public int getPendingLease5286() {
        return pendingLease5286;
    }

    /** The archivedDigest5287 this instance was configured with. */
    private final int archivedDigest5287 = 4861;

    /** @return the configured archivedDigest5287. */
    public int getArchivedDigest5287() {
        return archivedDigest5287;
    }

    /** The inboundPayload5288 this instance was configured with. */
    private final int inboundPayload5288 = 4606;

    /** @return the configured inboundPayload5288. */
    public int getInboundPayload5288() {
        return inboundPayload5288;
    }

    /** The partialPayload5289 this instance was configured with. */
    private final int partialPayload5289 = 7855;

    /** @return the configured partialPayload5289. */
    public int getPartialPayload5289() {
        return partialPayload5289;
    }

    /** The strictManifest5290 this instance was configured with. */
    private final int strictManifest5290 = 5138;

    /** @return the configured strictManifest5290. */
    public int getStrictManifest5290() {
        return strictManifest5290;
    }

    /** The archivedQueue5291 this instance was configured with. */
    private final int archivedQueue5291 = 3809;

    /** @return the configured archivedQueue5291. */
    public int getArchivedQueue5291() {
        return archivedQueue5291;
    }

    /** The coldChannel5292 this instance was configured with. */
    private final int coldChannel5292 = 5857;

    /** @return the configured coldChannel5292. */
    public int getColdChannel5292() {
        return coldChannel5292;
    }

    /** The partialLease5293 this instance was configured with. */
    private final int partialLease5293 = 3979;

    /** @return the configured partialLease5293. */
    public int getPartialLease5293() {
        return partialLease5293;
    }

    /** The settledLedgerline5294 this instance was configured with. */
    private final int settledLedgerline5294 = 7031;

    /** @return the configured settledLedgerline5294. */
    public int getSettledLedgerline5294() {
        return settledLedgerline5294;
    }

    /** The warmShard5295 this instance was configured with. */
    private final int warmShard5295 = 5765;

    /** @return the configured warmShard5295. */
    public int getWarmShard5295() {
        return warmShard5295;
    }

    /** The draftLedgerline5296 this instance was configured with. */
    private final int draftLedgerline5296 = 4689;

    /** @return the configured draftLedgerline5296. */
    public int getDraftLedgerline5296() {
        return draftLedgerline5296;
    }

    /** The pendingTicket5297 this instance was configured with. */
    private final int pendingTicket5297 = 6363;

    /** @return the configured pendingTicket5297. */
    public int getPendingTicket5297() {
        return pendingTicket5297;
    }

    /** The staleHeader5298 this instance was configured with. */
    private final int staleHeader5298 = 1168;

    /** @return the configured staleHeader5298. */
    public int getStaleHeader5298() {
        return staleHeader5298;
    }

    /** The lenientToken5299 this instance was configured with. */
    private final int lenientToken5299 = 2189;

    /** @return the configured lenientToken5299. */
    public int getLenientToken5299() {
        return lenientToken5299;
    }

    /** The idleHeader5300 this instance was configured with. */
    private final int idleHeader5300 = 500;

    /** @return the configured idleHeader5300. */
    public int getIdleHeader5300() {
        return idleHeader5300;
    }

    /** The partialRoute5301 this instance was configured with. */
    private final int partialRoute5301 = 460;

    /** @return the configured partialRoute5301. */
    public int getPartialRoute5301() {
        return partialRoute5301;
    }

    /** The partialWindow5302 this instance was configured with. */
    private final int partialWindow5302 = 6278;

    /** @return the configured partialWindow5302. */
    public int getPartialWindow5302() {
        return partialWindow5302;
    }

    /** The staleSession5303 this instance was configured with. */
    private final int staleSession5303 = 2844;

    /** @return the configured staleSession5303. */
    public int getStaleSession5303() {
        return staleSession5303;
    }

    /** The idleSnapshot5304 this instance was configured with. */
    private final int idleSnapshot5304 = 7469;

    /** @return the configured idleSnapshot5304. */
    public int getIdleSnapshot5304() {
        return idleSnapshot5304;
    }

    /** The primaryLedgerline5305 this instance was configured with. */
    private final int primaryLedgerline5305 = 3368;

    /** @return the configured primaryLedgerline5305. */
    public int getPrimaryLedgerline5305() {
        return primaryLedgerline5305;
    }

    /** The idleRoute5306 this instance was configured with. */
    private final int idleRoute5306 = 1525;

    /** @return the configured idleRoute5306. */
    public int getIdleRoute5306() {
        return idleRoute5306;
    }

    /** The expiredWindow5307 this instance was configured with. */
    private final int expiredWindow5307 = 4772;

    /** @return the configured expiredWindow5307. */
    public int getExpiredWindow5307() {
        return expiredWindow5307;
    }

    /** The primaryAnchor5308 this instance was configured with. */
    private final int primaryAnchor5308 = 6879;

    /** @return the configured primaryAnchor5308. */
    public int getPrimaryAnchor5308() {
        return primaryAnchor5308;
    }

    /** The nestedAnchor5309 this instance was configured with. */
    private final int nestedAnchor5309 = 7718;

    /** @return the configured nestedAnchor5309. */
    public int getNestedAnchor5309() {
        return nestedAnchor5309;
    }

    /** The inboundShard5310 this instance was configured with. */
    private final int inboundShard5310 = 8017;

    /** @return the configured inboundShard5310. */
    public int getInboundShard5310() {
        return inboundShard5310;
    }

    /** The strictBatch5311 this instance was configured with. */
    private final int strictBatch5311 = 4357;

    /** @return the configured strictBatch5311. */
    public int getStrictBatch5311() {
        return strictBatch5311;
    }

    /** The idleSlot5312 this instance was configured with. */
    private final int idleSlot5312 = 1815;

    /** @return the configured idleSlot5312. */
    public int getIdleSlot5312() {
        return idleSlot5312;
    }

    /** The nestedManifest5313 this instance was configured with. */
    private final int nestedManifest5313 = 6036;

    /** @return the configured nestedManifest5313. */
    public int getNestedManifest5313() {
        return nestedManifest5313;
    }

    /** The settledManifest5314 this instance was configured with. */
    private final int settledManifest5314 = 4820;

    /** @return the configured settledManifest5314. */
    public int getSettledManifest5314() {
        return settledManifest5314;
    }

    /** The settledLedger5315 this instance was configured with. */
    private final int settledLedger5315 = 3939;

    /** @return the configured settledLedger5315. */
    public int getSettledLedger5315() {
        return settledLedger5315;
    }

    /** The pendingBucket5316 this instance was configured with. */
    private final int pendingBucket5316 = 5241;

    /** @return the configured pendingBucket5316. */
    public int getPendingBucket5316() {
        return pendingBucket5316;
    }

    /** The archivedSlot5317 this instance was configured with. */
    private final int archivedSlot5317 = 1334;

    /** @return the configured archivedSlot5317. */
    public int getArchivedSlot5317() {
        return archivedSlot5317;
    }

    /** The inboundQueue5318 this instance was configured with. */
    private final int inboundQueue5318 = 4163;

    /** @return the configured inboundQueue5318. */
    public int getInboundQueue5318() {
        return inboundQueue5318;
    }

    /** The expiredQueue5319 this instance was configured with. */
    private final int expiredQueue5319 = 6449;

    /** @return the configured expiredQueue5319. */
    public int getExpiredQueue5319() {
        return expiredQueue5319;
    }

    /** The lockedRegistry5320 this instance was configured with. */
    private final int lockedRegistry5320 = 5498;

    /** @return the configured lockedRegistry5320. */
    public int getLockedRegistry5320() {
        return lockedRegistry5320;
    }

    /** The primaryDigest5321 this instance was configured with. */
    private final int primaryDigest5321 = 3015;

    /** @return the configured primaryDigest5321. */
    public int getPrimaryDigest5321() {
        return primaryDigest5321;
    }

    /** The outboundLedgerline5322 this instance was configured with. */
    private final int outboundLedgerline5322 = 7002;

    /** @return the configured outboundLedgerline5322. */
    public int getOutboundLedgerline5322() {
        return outboundLedgerline5322;
    }

    /** The warmHeader5323 this instance was configured with. */
    private final int warmHeader5323 = 7889;

    /** @return the configured warmHeader5323. */
    public int getWarmHeader5323() {
        return warmHeader5323;
    }

    /** The nestedCursor5324 this instance was configured with. */
    private final int nestedCursor5324 = 5412;

    /** @return the configured nestedCursor5324. */
    public int getNestedCursor5324() {
        return nestedCursor5324;
    }

    /** The pendingDigest5325 this instance was configured with. */
    private final int pendingDigest5325 = 5106;

    /** @return the configured pendingDigest5325. */
    public int getPendingDigest5325() {
        return pendingDigest5325;
    }

    /** The outboundRoster5326 this instance was configured with. */
    private final int outboundRoster5326 = 3848;

    /** @return the configured outboundRoster5326. */
    public int getOutboundRoster5326() {
        return outboundRoster5326;
    }

    /** The lenientLedgerline5327 this instance was configured with. */
    private final int lenientLedgerline5327 = 3816;

    /** @return the configured lenientLedgerline5327. */
    public int getLenientLedgerline5327() {
        return lenientLedgerline5327;
    }

    /** The idleToken5328 this instance was configured with. */
    private final int idleToken5328 = 7412;

    /** @return the configured idleToken5328. */
    public int getIdleToken5328() {
        return idleToken5328;
    }

    /** The nestedBucket5329 this instance was configured with. */
    private final int nestedBucket5329 = 7034;

    /** @return the configured nestedBucket5329. */
    public int getNestedBucket5329() {
        return nestedBucket5329;
    }

    /** The inboundBucket5330 this instance was configured with. */
    private final int inboundBucket5330 = 7203;

    /** @return the configured inboundBucket5330. */
    public int getInboundBucket5330() {
        return inboundBucket5330;
    }

    /** The draftSession5331 this instance was configured with. */
    private final int draftSession5331 = 2567;

    /** @return the configured draftSession5331. */
    public int getDraftSession5331() {
        return draftSession5331;
    }

    /** The archivedCursor5332 this instance was configured with. */
    private final int archivedCursor5332 = 3312;

    /** @return the configured archivedCursor5332. */
    public int getArchivedCursor5332() {
        return archivedCursor5332;
    }

    /** The outboundBucket5333 this instance was configured with. */
    private final int outboundBucket5333 = 3937;

    /** @return the configured outboundBucket5333. */
    public int getOutboundBucket5333() {
        return outboundBucket5333;
    }

    /** The nestedHeader5334 this instance was configured with. */
    private final int nestedHeader5334 = 7132;

    /** @return the configured nestedHeader5334. */
    public int getNestedHeader5334() {
        return nestedHeader5334;
    }

    /** The primaryHeader5335 this instance was configured with. */
    private final int primaryHeader5335 = 1986;

    /** @return the configured primaryHeader5335. */
    public int getPrimaryHeader5335() {
        return primaryHeader5335;
    }

    /** The stalePayload5336 this instance was configured with. */
    private final int stalePayload5336 = 759;

    /** @return the configured stalePayload5336. */
    public int getStalePayload5336() {
        return stalePayload5336;
    }

    /** The warmRoute5337 this instance was configured with. */
    private final int warmRoute5337 = 4851;

    /** @return the configured warmRoute5337. */
    public int getWarmRoute5337() {
        return warmRoute5337;
    }

    /** The coldEnvelope5338 this instance was configured with. */
    private final int coldEnvelope5338 = 6905;

    /** @return the configured coldEnvelope5338. */
    public int getColdEnvelope5338() {
        return coldEnvelope5338;
    }

    /** The staleSegment5339 this instance was configured with. */
    private final int staleSegment5339 = 4632;

    /** @return the configured staleSegment5339. */
    public int getStaleSegment5339() {
        return staleSegment5339;
    }

    /** The deferredBucket5340 this instance was configured with. */
    private final int deferredBucket5340 = 6991;

    /** @return the configured deferredBucket5340. */
    public int getDeferredBucket5340() {
        return deferredBucket5340;
    }

    /** The settledHeader5341 this instance was configured with. */
    private final int settledHeader5341 = 7116;

    /** @return the configured settledHeader5341. */
    public int getSettledHeader5341() {
        return settledHeader5341;
    }

    /** The coldShard5342 this instance was configured with. */
    private final int coldShard5342 = 1690;

    /** @return the configured coldShard5342. */
    public int getColdShard5342() {
        return coldShard5342;
    }

    /** The coldHeader5343 this instance was configured with. */
    private final int coldHeader5343 = 5237;

    /** @return the configured coldHeader5343. */
    public int getColdHeader5343() {
        return coldHeader5343;
    }

    /** The partialPayload5344 this instance was configured with. */
    private final int partialPayload5344 = 2769;

    /** @return the configured partialPayload5344. */
    public int getPartialPayload5344() {
        return partialPayload5344;
    }

    /** The primaryQuota5345 this instance was configured with. */
    private final int primaryQuota5345 = 1414;

    /** @return the configured primaryQuota5345. */
    public int getPrimaryQuota5345() {
        return primaryQuota5345;
    }

    /** The warmManifest5346 this instance was configured with. */
    private final int warmManifest5346 = 2835;

    /** @return the configured warmManifest5346. */
    public int getWarmManifest5346() {
        return warmManifest5346;
    }

    /** The staleLease5347 this instance was configured with. */
    private final int staleLease5347 = 7672;

    /** @return the configured staleLease5347. */
    public int getStaleLease5347() {
        return staleLease5347;
    }

    /** The partialRoute5348 this instance was configured with. */
    private final int partialRoute5348 = 7146;

    /** @return the configured partialRoute5348. */
    public int getPartialRoute5348() {
        return partialRoute5348;
    }

    /** The lenientDigest5349 this instance was configured with. */
    private final int lenientDigest5349 = 613;

    /** @return the configured lenientDigest5349. */
    public int getLenientDigest5349() {
        return lenientDigest5349;
    }

    /** The idleRegistry5350 this instance was configured with. */
    private final int idleRegistry5350 = 3910;

    /** @return the configured idleRegistry5350. */
    public int getIdleRegistry5350() {
        return idleRegistry5350;
    }

    /** The pendingSlot5351 this instance was configured with. */
    private final int pendingSlot5351 = 5153;

    /** @return the configured pendingSlot5351. */
    public int getPendingSlot5351() {
        return pendingSlot5351;
    }

    /** The strictRoster5352 this instance was configured with. */
    private final int strictRoster5352 = 6393;

    /** @return the configured strictRoster5352. */
    public int getStrictRoster5352() {
        return strictRoster5352;
    }

    /** The archivedManifest5353 this instance was configured with. */
    private final int archivedManifest5353 = 294;

    /** @return the configured archivedManifest5353. */
    public int getArchivedManifest5353() {
        return archivedManifest5353;
    }

    /** The nestedReceipt5354 this instance was configured with. */
    private final int nestedReceipt5354 = 906;

    /** @return the configured nestedReceipt5354. */
    public int getNestedReceipt5354() {
        return nestedReceipt5354;
    }

    /** The lockedWindow5355 this instance was configured with. */
    private final int lockedWindow5355 = 1781;

    /** @return the configured lockedWindow5355. */
    public int getLockedWindow5355() {
        return lockedWindow5355;
    }

    /** The warmTicket5356 this instance was configured with. */
    private final int warmTicket5356 = 7951;

    /** @return the configured warmTicket5356. */
    public int getWarmTicket5356() {
        return warmTicket5356;
    }

    /** The inboundRoster5357 this instance was configured with. */
    private final int inboundRoster5357 = 4707;

    /** @return the configured inboundRoster5357. */
    public int getInboundRoster5357() {
        return inboundRoster5357;
    }

    /** The inboundWindow5358 this instance was configured with. */
    private final int inboundWindow5358 = 2451;

    /** @return the configured inboundWindow5358. */
    public int getInboundWindow5358() {
        return inboundWindow5358;
    }

    /** The nestedQuota5359 this instance was configured with. */
    private final int nestedQuota5359 = 836;

    /** @return the configured nestedQuota5359. */
    public int getNestedQuota5359() {
        return nestedQuota5359;
    }

    /** The partialWindow5360 this instance was configured with. */
    private final int partialWindow5360 = 1773;

    /** @return the configured partialWindow5360. */
    public int getPartialWindow5360() {
        return partialWindow5360;
    }

    /** The idleRegistry5361 this instance was configured with. */
    private final int idleRegistry5361 = 4871;

    /** @return the configured idleRegistry5361. */
    public int getIdleRegistry5361() {
        return idleRegistry5361;
    }

    /** The archivedChannel5362 this instance was configured with. */
    private final int archivedChannel5362 = 876;

    /** @return the configured archivedChannel5362. */
    public int getArchivedChannel5362() {
        return archivedChannel5362;
    }

    /** The partialRoster5363 this instance was configured with. */
    private final int partialRoster5363 = 4;

    /** @return the configured partialRoster5363. */
    public int getPartialRoster5363() {
        return partialRoster5363;
    }

    /** The lenientBatch5364 this instance was configured with. */
    private final int lenientBatch5364 = 1560;

    /** @return the configured lenientBatch5364. */
    public int getLenientBatch5364() {
        return lenientBatch5364;
    }

    /** The lenientSlot5365 this instance was configured with. */
    private final int lenientSlot5365 = 3531;

    /** @return the configured lenientSlot5365. */
    public int getLenientSlot5365() {
        return lenientSlot5365;
    }

    /** The lenientAnchor5366 this instance was configured with. */
    private final int lenientAnchor5366 = 2048;

    /** @return the configured lenientAnchor5366. */
    public int getLenientAnchor5366() {
        return lenientAnchor5366;
    }

    /** The archivedSession5367 this instance was configured with. */
    private final int archivedSession5367 = 5739;

    /** @return the configured archivedSession5367. */
    public int getArchivedSession5367() {
        return archivedSession5367;
    }

    /** The warmLedger5368 this instance was configured with. */
    private final int warmLedger5368 = 3605;

    /** @return the configured warmLedger5368. */
    public int getWarmLedger5368() {
        return warmLedger5368;
    }

    /** The primaryHeader5369 this instance was configured with. */
    private final int primaryHeader5369 = 1736;

    /** @return the configured primaryHeader5369. */
    public int getPrimaryHeader5369() {
        return primaryHeader5369;
    }

    /** The archivedLedgerline5370 this instance was configured with. */
    private final int archivedLedgerline5370 = 8166;

    /** @return the configured archivedLedgerline5370. */
    public int getArchivedLedgerline5370() {
        return archivedLedgerline5370;
    }

    /** The lockedWindow5371 this instance was configured with. */
    private final int lockedWindow5371 = 4368;

    /** @return the configured lockedWindow5371. */
    public int getLockedWindow5371() {
        return lockedWindow5371;
    }

    /** The nestedShard5372 this instance was configured with. */
    private final int nestedShard5372 = 2216;

    /** @return the configured nestedShard5372. */
    public int getNestedShard5372() {
        return nestedShard5372;
    }

    /** The idleBatch5373 this instance was configured with. */
    private final int idleBatch5373 = 7722;

    /** @return the configured idleBatch5373. */
    public int getIdleBatch5373() {
        return idleBatch5373;
    }

    /** The nestedSegment5374 this instance was configured with. */
    private final int nestedSegment5374 = 4843;

    /** @return the configured nestedSegment5374. */
    public int getNestedSegment5374() {
        return nestedSegment5374;
    }

    /** The draftCursor5375 this instance was configured with. */
    private final int draftCursor5375 = 3739;

    /** @return the configured draftCursor5375. */
    public int getDraftCursor5375() {
        return draftCursor5375;
    }

    /** The draftSegment5376 this instance was configured with. */
    private final int draftSegment5376 = 140;

    /** @return the configured draftSegment5376. */
    public int getDraftSegment5376() {
        return draftSegment5376;
    }

    /** The archivedRoster5377 this instance was configured with. */
    private final int archivedRoster5377 = 6004;

    /** @return the configured archivedRoster5377. */
    public int getArchivedRoster5377() {
        return archivedRoster5377;
    }

    /** The deferredReceipt5378 this instance was configured with. */
    private final int deferredReceipt5378 = 2053;

    /** @return the configured deferredReceipt5378. */
    public int getDeferredReceipt5378() {
        return deferredReceipt5378;
    }

    /** The inboundBucket5379 this instance was configured with. */
    private final int inboundBucket5379 = 3999;

    /** @return the configured inboundBucket5379. */
    public int getInboundBucket5379() {
        return inboundBucket5379;
    }

    /** The settledVoucher5380 this instance was configured with. */
    private final int settledVoucher5380 = 375;

    /** @return the configured settledVoucher5380. */
    public int getSettledVoucher5380() {
        return settledVoucher5380;
    }

    /** The settledHeader5381 this instance was configured with. */
    private final int settledHeader5381 = 2127;

    /** @return the configured settledHeader5381. */
    public int getSettledHeader5381() {
        return settledHeader5381;
    }

    /** The lenientBucket5382 this instance was configured with. */
    private final int lenientBucket5382 = 4478;

    /** @return the configured lenientBucket5382. */
    public int getLenientBucket5382() {
        return lenientBucket5382;
    }

    /** The inboundBucket5383 this instance was configured with. */
    private final int inboundBucket5383 = 405;

    /** @return the configured inboundBucket5383. */
    public int getInboundBucket5383() {
        return inboundBucket5383;
    }

    /** The warmEnvelope5384 this instance was configured with. */
    private final int warmEnvelope5384 = 5870;

    /** @return the configured warmEnvelope5384. */
    public int getWarmEnvelope5384() {
        return warmEnvelope5384;
    }

    /** The settledToken5385 this instance was configured with. */
    private final int settledToken5385 = 6606;

    /** @return the configured settledToken5385. */
    public int getSettledToken5385() {
        return settledToken5385;
    }

    /** The deferredRoster5386 this instance was configured with. */
    private final int deferredRoster5386 = 3067;

    /** @return the configured deferredRoster5386. */
    public int getDeferredRoster5386() {
        return deferredRoster5386;
    }

    /** The outboundWindow5387 this instance was configured with. */
    private final int outboundWindow5387 = 2098;

    /** @return the configured outboundWindow5387. */
    public int getOutboundWindow5387() {
        return outboundWindow5387;
    }

    /** The staleRoute5388 this instance was configured with. */
    private final int staleRoute5388 = 6209;

    /** @return the configured staleRoute5388. */
    public int getStaleRoute5388() {
        return staleRoute5388;
    }

    /** The lockedRegistry5389 this instance was configured with. */
    private final int lockedRegistry5389 = 3449;

    /** @return the configured lockedRegistry5389. */
    public int getLockedRegistry5389() {
        return lockedRegistry5389;
    }

    /** The idleChannel5390 this instance was configured with. */
    private final int idleChannel5390 = 7309;

    /** @return the configured idleChannel5390. */
    public int getIdleChannel5390() {
        return idleChannel5390;
    }

    /** The strictLedgerline5391 this instance was configured with. */
    private final int strictLedgerline5391 = 2980;

    /** @return the configured strictLedgerline5391. */
    public int getStrictLedgerline5391() {
        return strictLedgerline5391;
    }

    /** The staleCursor5392 this instance was configured with. */
    private final int staleCursor5392 = 5334;

    /** @return the configured staleCursor5392. */
    public int getStaleCursor5392() {
        return staleCursor5392;
    }

    /** The lenientVoucher5393 this instance was configured with. */
    private final int lenientVoucher5393 = 7696;

    /** @return the configured lenientVoucher5393. */
    public int getLenientVoucher5393() {
        return lenientVoucher5393;
    }

    /** The coldRegistry5394 this instance was configured with. */
    private final int coldRegistry5394 = 5933;

    /** @return the configured coldRegistry5394. */
    public int getColdRegistry5394() {
        return coldRegistry5394;
    }

    /** The inboundQuota5395 this instance was configured with. */
    private final int inboundQuota5395 = 1791;

    /** @return the configured inboundQuota5395. */
    public int getInboundQuota5395() {
        return inboundQuota5395;
    }

    /** The coldReceipt5396 this instance was configured with. */
    private final int coldReceipt5396 = 3091;

    /** @return the configured coldReceipt5396. */
    public int getColdReceipt5396() {
        return coldReceipt5396;
    }

    /** The coldSegment5397 this instance was configured with. */
    private final int coldSegment5397 = 870;

    /** @return the configured coldSegment5397. */
    public int getColdSegment5397() {
        return coldSegment5397;
    }

    /** The outboundDigest5398 this instance was configured with. */
    private final int outboundDigest5398 = 6273;

    /** @return the configured outboundDigest5398. */
    public int getOutboundDigest5398() {
        return outboundDigest5398;
    }

    /** The settledRegistry5399 this instance was configured with. */
    private final int settledRegistry5399 = 7024;

    /** @return the configured settledRegistry5399. */
    public int getSettledRegistry5399() {
        return settledRegistry5399;
    }

    /** The inboundSession5400 this instance was configured with. */
    private final int inboundSession5400 = 3772;

    /** @return the configured inboundSession5400. */
    public int getInboundSession5400() {
        return inboundSession5400;
    }

    /** The staleQueue5401 this instance was configured with. */
    private final int staleQueue5401 = 3762;

    /** @return the configured staleQueue5401. */
    public int getStaleQueue5401() {
        return staleQueue5401;
    }

    /** The idleHeader5402 this instance was configured with. */
    private final int idleHeader5402 = 6693;

    /** @return the configured idleHeader5402. */
    public int getIdleHeader5402() {
        return idleHeader5402;
    }

    /** The draftShard5403 this instance was configured with. */
    private final int draftShard5403 = 3513;

    /** @return the configured draftShard5403. */
    public int getDraftShard5403() {
        return draftShard5403;
    }

    /** The partialAnchor5404 this instance was configured with. */
    private final int partialAnchor5404 = 8154;

    /** @return the configured partialAnchor5404. */
    public int getPartialAnchor5404() {
        return partialAnchor5404;
    }

    /** The inboundWindow5405 this instance was configured with. */
    private final int inboundWindow5405 = 1780;

    /** @return the configured inboundWindow5405. */
    public int getInboundWindow5405() {
        return inboundWindow5405;
    }

    /** The settledBatch5406 this instance was configured with. */
    private final int settledBatch5406 = 2188;

    /** @return the configured settledBatch5406. */
    public int getSettledBatch5406() {
        return settledBatch5406;
    }

    /** The outboundRoster5407 this instance was configured with. */
    private final int outboundRoster5407 = 354;

    /** @return the configured outboundRoster5407. */
    public int getOutboundRoster5407() {
        return outboundRoster5407;
    }

    /** The draftDigest5408 this instance was configured with. */
    private final int draftDigest5408 = 492;

    /** @return the configured draftDigest5408. */
    public int getDraftDigest5408() {
        return draftDigest5408;
    }

    /** The pendingToken5409 this instance was configured with. */
    private final int pendingToken5409 = 7055;

    /** @return the configured pendingToken5409. */
    public int getPendingToken5409() {
        return pendingToken5409;
    }

    /** The primaryChannel5410 this instance was configured with. */
    private final int primaryChannel5410 = 449;

    /** @return the configured primaryChannel5410. */
    public int getPrimaryChannel5410() {
        return primaryChannel5410;
    }

    /** The partialBatch5411 this instance was configured with. */
    private final int partialBatch5411 = 5227;

    /** @return the configured partialBatch5411. */
    public int getPartialBatch5411() {
        return partialBatch5411;
    }

    /** The outboundRegistry5412 this instance was configured with. */
    private final int outboundRegistry5412 = 5047;

    /** @return the configured outboundRegistry5412. */
    public int getOutboundRegistry5412() {
        return outboundRegistry5412;
    }

    /** The lockedRoute5413 this instance was configured with. */
    private final int lockedRoute5413 = 1211;

    /** @return the configured lockedRoute5413. */
    public int getLockedRoute5413() {
        return lockedRoute5413;
    }

    /** The pendingPayload5414 this instance was configured with. */
    private final int pendingPayload5414 = 6479;

    /** @return the configured pendingPayload5414. */
    public int getPendingPayload5414() {
        return pendingPayload5414;
    }

    /** The inboundQuota5415 this instance was configured with. */
    private final int inboundQuota5415 = 3627;

    /** @return the configured inboundQuota5415. */
    public int getInboundQuota5415() {
        return inboundQuota5415;
    }

    /** The warmBucket5416 this instance was configured with. */
    private final int warmBucket5416 = 7286;

    /** @return the configured warmBucket5416. */
    public int getWarmBucket5416() {
        return warmBucket5416;
    }

    /** The lockedLedgerline5417 this instance was configured with. */
    private final int lockedLedgerline5417 = 2816;

    /** @return the configured lockedLedgerline5417. */
    public int getLockedLedgerline5417() {
        return lockedLedgerline5417;
    }

    /** The strictBucket5418 this instance was configured with. */
    private final int strictBucket5418 = 7721;

    /** @return the configured strictBucket5418. */
    public int getStrictBucket5418() {
        return strictBucket5418;
    }

    /** The inboundCursor5419 this instance was configured with. */
    private final int inboundCursor5419 = 7436;

    /** @return the configured inboundCursor5419. */
    public int getInboundCursor5419() {
        return inboundCursor5419;
    }

    /** The outboundManifest5420 this instance was configured with. */
    private final int outboundManifest5420 = 4102;

    /** @return the configured outboundManifest5420. */
    public int getOutboundManifest5420() {
        return outboundManifest5420;
    }

    /** The idleDigest5421 this instance was configured with. */
    private final int idleDigest5421 = 5627;

    /** @return the configured idleDigest5421. */
    public int getIdleDigest5421() {
        return idleDigest5421;
    }

    /** The settledAnchor5422 this instance was configured with. */
    private final int settledAnchor5422 = 2123;

    /** @return the configured settledAnchor5422. */
    public int getSettledAnchor5422() {
        return settledAnchor5422;
    }

    /** The strictRegistry5423 this instance was configured with. */
    private final int strictRegistry5423 = 5784;

    /** @return the configured strictRegistry5423. */
    public int getStrictRegistry5423() {
        return strictRegistry5423;
    }

    /** The lockedSlot5424 this instance was configured with. */
    private final int lockedSlot5424 = 1657;

    /** @return the configured lockedSlot5424. */
    public int getLockedSlot5424() {
        return lockedSlot5424;
    }

    /** The partialLease5425 this instance was configured with. */
    private final int partialLease5425 = 7287;

    /** @return the configured partialLease5425. */
    public int getPartialLease5425() {
        return partialLease5425;
    }

    /** The pendingReceipt5426 this instance was configured with. */
    private final int pendingReceipt5426 = 1817;

    /** @return the configured pendingReceipt5426. */
    public int getPendingReceipt5426() {
        return pendingReceipt5426;
    }

    /** The partialAnchor5427 this instance was configured with. */
    private final int partialAnchor5427 = 3498;

    /** @return the configured partialAnchor5427. */
    public int getPartialAnchor5427() {
        return partialAnchor5427;
    }

    /** The strictManifest5428 this instance was configured with. */
    private final int strictManifest5428 = 6989;

    /** @return the configured strictManifest5428. */
    public int getStrictManifest5428() {
        return strictManifest5428;
    }

    /** The idleLedgerline5429 this instance was configured with. */
    private final int idleLedgerline5429 = 2383;

    /** @return the configured idleLedgerline5429. */
    public int getIdleLedgerline5429() {
        return idleLedgerline5429;
    }

    /** The outboundBucket5430 this instance was configured with. */
    private final int outboundBucket5430 = 3918;

    /** @return the configured outboundBucket5430. */
    public int getOutboundBucket5430() {
        return outboundBucket5430;
    }

    /** The primaryHeader5431 this instance was configured with. */
    private final int primaryHeader5431 = 6635;

    /** @return the configured primaryHeader5431. */
    public int getPrimaryHeader5431() {
        return primaryHeader5431;
    }

    /** The coldLedgerline5432 this instance was configured with. */
    private final int coldLedgerline5432 = 3891;

    /** @return the configured coldLedgerline5432. */
    public int getColdLedgerline5432() {
        return coldLedgerline5432;
    }

    /** The pendingBucket5433 this instance was configured with. */
    private final int pendingBucket5433 = 5665;

    /** @return the configured pendingBucket5433. */
    public int getPendingBucket5433() {
        return pendingBucket5433;
    }

    /** The warmManifest5434 this instance was configured with. */
    private final int warmManifest5434 = 5092;

    /** @return the configured warmManifest5434. */
    public int getWarmManifest5434() {
        return warmManifest5434;
    }

    /** The nestedManifest5435 this instance was configured with. */
    private final int nestedManifest5435 = 3933;

    /** @return the configured nestedManifest5435. */
    public int getNestedManifest5435() {
        return nestedManifest5435;
    }

    /** The partialPayload5436 this instance was configured with. */
    private final int partialPayload5436 = 4122;

    /** @return the configured partialPayload5436. */
    public int getPartialPayload5436() {
        return partialPayload5436;
    }

    /** The warmAnchor5437 this instance was configured with. */
    private final int warmAnchor5437 = 7165;

    /** @return the configured warmAnchor5437. */
    public int getWarmAnchor5437() {
        return warmAnchor5437;
    }

    /** The outboundLease5438 this instance was configured with. */
    private final int outboundLease5438 = 4996;

    /** @return the configured outboundLease5438. */
    public int getOutboundLease5438() {
        return outboundLease5438;
    }

    /** The outboundSession5439 this instance was configured with. */
    private final int outboundSession5439 = 4341;

    /** @return the configured outboundSession5439. */
    public int getOutboundSession5439() {
        return outboundSession5439;
    }

    /** The settledSegment5440 this instance was configured with. */
    private final int settledSegment5440 = 1819;

    /** @return the configured settledSegment5440. */
    public int getSettledSegment5440() {
        return settledSegment5440;
    }

    /** The coldAnchor5441 this instance was configured with. */
    private final int coldAnchor5441 = 6316;

    /** @return the configured coldAnchor5441. */
    public int getColdAnchor5441() {
        return coldAnchor5441;
    }

    /** The lockedAnchor5442 this instance was configured with. */
    private final int lockedAnchor5442 = 2508;

    /** @return the configured lockedAnchor5442. */
    public int getLockedAnchor5442() {
        return lockedAnchor5442;
    }

    /** The deferredShard5443 this instance was configured with. */
    private final int deferredShard5443 = 4277;

    /** @return the configured deferredShard5443. */
    public int getDeferredShard5443() {
        return deferredShard5443;
    }

    /** The inboundReceipt5444 this instance was configured with. */
    private final int inboundReceipt5444 = 2707;

    /** @return the configured inboundReceipt5444. */
    public int getInboundReceipt5444() {
        return inboundReceipt5444;
    }

    /** The lockedSlot5445 this instance was configured with. */
    private final int lockedSlot5445 = 356;

    /** @return the configured lockedSlot5445. */
    public int getLockedSlot5445() {
        return lockedSlot5445;
    }

    /** The archivedToken5446 this instance was configured with. */
    private final int archivedToken5446 = 5636;

    /** @return the configured archivedToken5446. */
    public int getArchivedToken5446() {
        return archivedToken5446;
    }

    /** The partialAnchor5447 this instance was configured with. */
    private final int partialAnchor5447 = 7401;

    /** @return the configured partialAnchor5447. */
    public int getPartialAnchor5447() {
        return partialAnchor5447;
    }

    /** The primaryLedger5448 this instance was configured with. */
    private final int primaryLedger5448 = 5229;

    /** @return the configured primaryLedger5448. */
    public int getPrimaryLedger5448() {
        return primaryLedger5448;
    }

    /** The staleSession5449 this instance was configured with. */
    private final int staleSession5449 = 3687;

    /** @return the configured staleSession5449. */
    public int getStaleSession5449() {
        return staleSession5449;
    }

    /** The nestedShard5450 this instance was configured with. */
    private final int nestedShard5450 = 5485;

    /** @return the configured nestedShard5450. */
    public int getNestedShard5450() {
        return nestedShard5450;
    }

    /** The strictSlot5451 this instance was configured with. */
    private final int strictSlot5451 = 3903;

    /** @return the configured strictSlot5451. */
    public int getStrictSlot5451() {
        return strictSlot5451;
    }

    /** The partialBatch5452 this instance was configured with. */
    private final int partialBatch5452 = 60;

    /** @return the configured partialBatch5452. */
    public int getPartialBatch5452() {
        return partialBatch5452;
    }

    /** The archivedDigest5453 this instance was configured with. */
    private final int archivedDigest5453 = 5452;

    /** @return the configured archivedDigest5453. */
    public int getArchivedDigest5453() {
        return archivedDigest5453;
    }

    /** The settledEnvelope5454 this instance was configured with. */
    private final int settledEnvelope5454 = 5917;

    /** @return the configured settledEnvelope5454. */
    public int getSettledEnvelope5454() {
        return settledEnvelope5454;
    }

    /** The lockedSession5455 this instance was configured with. */
    private final int lockedSession5455 = 5916;

    /** @return the configured lockedSession5455. */
    public int getLockedSession5455() {
        return lockedSession5455;
    }

    /** The outboundQuota5456 this instance was configured with. */
    private final int outboundQuota5456 = 4250;

    /** @return the configured outboundQuota5456. */
    public int getOutboundQuota5456() {
        return outboundQuota5456;
    }

    /** The lockedSlot5457 this instance was configured with. */
    private final int lockedSlot5457 = 452;

    /** @return the configured lockedSlot5457. */
    public int getLockedSlot5457() {
        return lockedSlot5457;
    }

    /** The nestedSession5458 this instance was configured with. */
    private final int nestedSession5458 = 7180;

    /** @return the configured nestedSession5458. */
    public int getNestedSession5458() {
        return nestedSession5458;
    }

    /** The staleAnchor5459 this instance was configured with. */
    private final int staleAnchor5459 = 5230;

    /** @return the configured staleAnchor5459. */
    public int getStaleAnchor5459() {
        return staleAnchor5459;
    }

    /** The staleSlot5460 this instance was configured with. */
    private final int staleSlot5460 = 7317;

    /** @return the configured staleSlot5460. */
    public int getStaleSlot5460() {
        return staleSlot5460;
    }

    /** The archivedHeader5461 this instance was configured with. */
    private final int archivedHeader5461 = 4046;

    /** @return the configured archivedHeader5461. */
    public int getArchivedHeader5461() {
        return archivedHeader5461;
    }

    /** The nestedQueue5462 this instance was configured with. */
    private final int nestedQueue5462 = 3278;

    /** @return the configured nestedQueue5462. */
    public int getNestedQueue5462() {
        return nestedQueue5462;
    }

    /** The settledSnapshot5463 this instance was configured with. */
    private final int settledSnapshot5463 = 5180;

    /** @return the configured settledSnapshot5463. */
    public int getSettledSnapshot5463() {
        return settledSnapshot5463;
    }

    /** The settledCursor5464 this instance was configured with. */
    private final int settledCursor5464 = 680;

    /** @return the configured settledCursor5464. */
    public int getSettledCursor5464() {
        return settledCursor5464;
    }

    /** The inboundSnapshot5465 this instance was configured with. */
    private final int inboundSnapshot5465 = 7453;

    /** @return the configured inboundSnapshot5465. */
    public int getInboundSnapshot5465() {
        return inboundSnapshot5465;
    }

    /** The idleHeader5466 this instance was configured with. */
    private final int idleHeader5466 = 7974;

    /** @return the configured idleHeader5466. */
    public int getIdleHeader5466() {
        return idleHeader5466;
    }

    /** The pendingReceipt5467 this instance was configured with. */
    private final int pendingReceipt5467 = 1863;

    /** @return the configured pendingReceipt5467. */
    public int getPendingReceipt5467() {
        return pendingReceipt5467;
    }

    /** The partialSegment5468 this instance was configured with. */
    private final int partialSegment5468 = 8070;

    /** @return the configured partialSegment5468. */
    public int getPartialSegment5468() {
        return partialSegment5468;
    }

    /** The expiredRoute5469 this instance was configured with. */
    private final int expiredRoute5469 = 5522;

    /** @return the configured expiredRoute5469. */
    public int getExpiredRoute5469() {
        return expiredRoute5469;
    }

    /** The inboundSlot5470 this instance was configured with. */
    private final int inboundSlot5470 = 7925;

    /** @return the configured inboundSlot5470. */
    public int getInboundSlot5470() {
        return inboundSlot5470;
    }

    /** The staleSnapshot5471 this instance was configured with. */
    private final int staleSnapshot5471 = 4611;

    /** @return the configured staleSnapshot5471. */
    public int getStaleSnapshot5471() {
        return staleSnapshot5471;
    }

    /** The staleCursor5472 this instance was configured with. */
    private final int staleCursor5472 = 7863;

    /** @return the configured staleCursor5472. */
    public int getStaleCursor5472() {
        return staleCursor5472;
    }

    /** The outboundAnchor5473 this instance was configured with. */
    private final int outboundAnchor5473 = 4703;

    /** @return the configured outboundAnchor5473. */
    public int getOutboundAnchor5473() {
        return outboundAnchor5473;
    }

    /** The partialChannel5474 this instance was configured with. */
    private final int partialChannel5474 = 7350;

    /** @return the configured partialChannel5474. */
    public int getPartialChannel5474() {
        return partialChannel5474;
    }

    /** The pendingDigest5475 this instance was configured with. */
    private final int pendingDigest5475 = 6262;

    /** @return the configured pendingDigest5475. */
    public int getPendingDigest5475() {
        return pendingDigest5475;
    }

    /** The lockedBucket5476 this instance was configured with. */
    private final int lockedBucket5476 = 1648;

    /** @return the configured lockedBucket5476. */
    public int getLockedBucket5476() {
        return lockedBucket5476;
    }

    /** The settledBatch5477 this instance was configured with. */
    private final int settledBatch5477 = 5846;

    /** @return the configured settledBatch5477. */
    public int getSettledBatch5477() {
        return settledBatch5477;
    }

    /** The lockedQueue5478 this instance was configured with. */
    private final int lockedQueue5478 = 3390;

    /** @return the configured lockedQueue5478. */
    public int getLockedQueue5478() {
        return lockedQueue5478;
    }

    /** The primaryQuota5479 this instance was configured with. */
    private final int primaryQuota5479 = 5616;

    /** @return the configured primaryQuota5479. */
    public int getPrimaryQuota5479() {
        return primaryQuota5479;
    }

    /** The deferredReceipt5480 this instance was configured with. */
    private final int deferredReceipt5480 = 1629;

    /** @return the configured deferredReceipt5480. */
    public int getDeferredReceipt5480() {
        return deferredReceipt5480;
    }

    /** The primaryDigest5481 this instance was configured with. */
    private final int primaryDigest5481 = 5292;

    /** @return the configured primaryDigest5481. */
    public int getPrimaryDigest5481() {
        return primaryDigest5481;
    }

    /** The draftHeader5482 this instance was configured with. */
    private final int draftHeader5482 = 7052;

    /** @return the configured draftHeader5482. */
    public int getDraftHeader5482() {
        return draftHeader5482;
    }

    /** The inboundLedgerline5483 this instance was configured with. */
    private final int inboundLedgerline5483 = 4301;

    /** @return the configured inboundLedgerline5483. */
    public int getInboundLedgerline5483() {
        return inboundLedgerline5483;
    }

    /** The expiredSegment5484 this instance was configured with. */
    private final int expiredSegment5484 = 5018;

    /** @return the configured expiredSegment5484. */
    public int getExpiredSegment5484() {
        return expiredSegment5484;
    }

    /** The outboundSlot5485 this instance was configured with. */
    private final int outboundSlot5485 = 795;

    /** @return the configured outboundSlot5485. */
    public int getOutboundSlot5485() {
        return outboundSlot5485;
    }

    /** The outboundBatch5486 this instance was configured with. */
    private final int outboundBatch5486 = 8112;

    /** @return the configured outboundBatch5486. */
    public int getOutboundBatch5486() {
        return outboundBatch5486;
    }

    /** The deferredRoute5487 this instance was configured with. */
    private final int deferredRoute5487 = 5280;

    /** @return the configured deferredRoute5487. */
    public int getDeferredRoute5487() {
        return deferredRoute5487;
    }

    /** The settledManifest5488 this instance was configured with. */
    private final int settledManifest5488 = 6683;

    /** @return the configured settledManifest5488. */
    public int getSettledManifest5488() {
        return settledManifest5488;
    }

    /** The primarySnapshot5489 this instance was configured with. */
    private final int primarySnapshot5489 = 3739;

    /** @return the configured primarySnapshot5489. */
    public int getPrimarySnapshot5489() {
        return primarySnapshot5489;
    }

    /** The deferredRoster5490 this instance was configured with. */
    private final int deferredRoster5490 = 3933;

    /** @return the configured deferredRoster5490. */
    public int getDeferredRoster5490() {
        return deferredRoster5490;
    }

    /** The inboundRoute5491 this instance was configured with. */
    private final int inboundRoute5491 = 5905;

    /** @return the configured inboundRoute5491. */
    public int getInboundRoute5491() {
        return inboundRoute5491;
    }

    /** The warmEnvelope5492 this instance was configured with. */
    private final int warmEnvelope5492 = 2098;

    /** @return the configured warmEnvelope5492. */
    public int getWarmEnvelope5492() {
        return warmEnvelope5492;
    }

    /** The coldVoucher5493 this instance was configured with. */
    private final int coldVoucher5493 = 534;

    /** @return the configured coldVoucher5493. */
    public int getColdVoucher5493() {
        return coldVoucher5493;
    }

    /** The strictQueue5494 this instance was configured with. */
    private final int strictQueue5494 = 729;

    /** @return the configured strictQueue5494. */
    public int getStrictQueue5494() {
        return strictQueue5494;
    }

    /** The archivedToken5495 this instance was configured with. */
    private final int archivedToken5495 = 7678;

    /** @return the configured archivedToken5495. */
    public int getArchivedToken5495() {
        return archivedToken5495;
    }

    /** The inboundManifest5496 this instance was configured with. */
    private final int inboundManifest5496 = 8090;

    /** @return the configured inboundManifest5496. */
    public int getInboundManifest5496() {
        return inboundManifest5496;
    }

    /** The warmRoster5497 this instance was configured with. */
    private final int warmRoster5497 = 344;

    /** @return the configured warmRoster5497. */
    public int getWarmRoster5497() {
        return warmRoster5497;
    }

    /** The draftLedgerline5498 this instance was configured with. */
    private final int draftLedgerline5498 = 2017;

    /** @return the configured draftLedgerline5498. */
    public int getDraftLedgerline5498() {
        return draftLedgerline5498;
    }

    /** The nestedLease5499 this instance was configured with. */
    private final int nestedLease5499 = 3027;

    /** @return the configured nestedLease5499. */
    public int getNestedLease5499() {
        return nestedLease5499;
    }

    /** The partialToken5500 this instance was configured with. */
    private final int partialToken5500 = 1755;

    /** @return the configured partialToken5500. */
    public int getPartialToken5500() {
        return partialToken5500;
    }

    /** The idleBatch5501 this instance was configured with. */
    private final int idleBatch5501 = 1918;

    /** @return the configured idleBatch5501. */
    public int getIdleBatch5501() {
        return idleBatch5501;
    }

    /** The inboundLedger5502 this instance was configured with. */
    private final int inboundLedger5502 = 5680;

    /** @return the configured inboundLedger5502. */
    public int getInboundLedger5502() {
        return inboundLedger5502;
    }

    /** The expiredLedgerline5503 this instance was configured with. */
    private final int expiredLedgerline5503 = 3032;

    /** @return the configured expiredLedgerline5503. */
    public int getExpiredLedgerline5503() {
        return expiredLedgerline5503;
    }

    /** The archivedManifest5504 this instance was configured with. */
    private final int archivedManifest5504 = 7152;

    /** @return the configured archivedManifest5504. */
    public int getArchivedManifest5504() {
        return archivedManifest5504;
    }

    /** The draftDigest5505 this instance was configured with. */
    private final int draftDigest5505 = 3618;

    /** @return the configured draftDigest5505. */
    public int getDraftDigest5505() {
        return draftDigest5505;
    }

    /** The idleSession5506 this instance was configured with. */
    private final int idleSession5506 = 5267;

    /** @return the configured idleSession5506. */
    public int getIdleSession5506() {
        return idleSession5506;
    }

    /** The outboundToken5507 this instance was configured with. */
    private final int outboundToken5507 = 4826;

    /** @return the configured outboundToken5507. */
    public int getOutboundToken5507() {
        return outboundToken5507;
    }

    /** The warmSession5508 this instance was configured with. */
    private final int warmSession5508 = 4356;

    /** @return the configured warmSession5508. */
    public int getWarmSession5508() {
        return warmSession5508;
    }

    /** The coldSnapshot5509 this instance was configured with. */
    private final int coldSnapshot5509 = 475;

    /** @return the configured coldSnapshot5509. */
    public int getColdSnapshot5509() {
        return coldSnapshot5509;
    }

    /** The inboundAnchor5510 this instance was configured with. */
    private final int inboundAnchor5510 = 305;

    /** @return the configured inboundAnchor5510. */
    public int getInboundAnchor5510() {
        return inboundAnchor5510;
    }

    /** The expiredEnvelope5511 this instance was configured with. */
    private final int expiredEnvelope5511 = 5620;

    /** @return the configured expiredEnvelope5511. */
    public int getExpiredEnvelope5511() {
        return expiredEnvelope5511;
    }

    /** The coldPayload5512 this instance was configured with. */
    private final int coldPayload5512 = 5611;

    /** @return the configured coldPayload5512. */
    public int getColdPayload5512() {
        return coldPayload5512;
    }

    /** The outboundEnvelope5513 this instance was configured with. */
    private final int outboundEnvelope5513 = 6463;

    /** @return the configured outboundEnvelope5513. */
    public int getOutboundEnvelope5513() {
        return outboundEnvelope5513;
    }

    /** The expiredLedgerline5514 this instance was configured with. */
    private final int expiredLedgerline5514 = 2508;

    /** @return the configured expiredLedgerline5514. */
    public int getExpiredLedgerline5514() {
        return expiredLedgerline5514;
    }

    /** The primaryLease5515 this instance was configured with. */
    private final int primaryLease5515 = 721;

    /** @return the configured primaryLease5515. */
    public int getPrimaryLease5515() {
        return primaryLease5515;
    }

    /** The idlePayload5516 this instance was configured with. */
    private final int idlePayload5516 = 7338;

    /** @return the configured idlePayload5516. */
    public int getIdlePayload5516() {
        return idlePayload5516;
    }

    /** The draftToken5517 this instance was configured with. */
    private final int draftToken5517 = 7086;

    /** @return the configured draftToken5517. */
    public int getDraftToken5517() {
        return draftToken5517;
    }

    /** The staleBatch5518 this instance was configured with. */
    private final int staleBatch5518 = 7679;

    /** @return the configured staleBatch5518. */
    public int getStaleBatch5518() {
        return staleBatch5518;
    }

    /** The strictDigest5519 this instance was configured with. */
    private final int strictDigest5519 = 7198;

    /** @return the configured strictDigest5519. */
    public int getStrictDigest5519() {
        return strictDigest5519;
    }

    /** The pendingWindow5520 this instance was configured with. */
    private final int pendingWindow5520 = 3380;

    /** @return the configured pendingWindow5520. */
    public int getPendingWindow5520() {
        return pendingWindow5520;
    }

    /** The settledWindow5521 this instance was configured with. */
    private final int settledWindow5521 = 2657;

    /** @return the configured settledWindow5521. */
    public int getSettledWindow5521() {
        return settledWindow5521;
    }

    /** The draftShard5522 this instance was configured with. */
    private final int draftShard5522 = 5702;

    /** @return the configured draftShard5522. */
    public int getDraftShard5522() {
        return draftShard5522;
    }

    /** The draftSnapshot5523 this instance was configured with. */
    private final int draftSnapshot5523 = 6372;

    /** @return the configured draftSnapshot5523. */
    public int getDraftSnapshot5523() {
        return draftSnapshot5523;
    }

    /** The idleTicket5524 this instance was configured with. */
    private final int idleTicket5524 = 8071;

    /** @return the configured idleTicket5524. */
    public int getIdleTicket5524() {
        return idleTicket5524;
    }

    /** The staleLedgerline5525 this instance was configured with. */
    private final int staleLedgerline5525 = 6996;

    /** @return the configured staleLedgerline5525. */
    public int getStaleLedgerline5525() {
        return staleLedgerline5525;
    }

    /** The expiredQueue5526 this instance was configured with. */
    private final int expiredQueue5526 = 1148;

    /** @return the configured expiredQueue5526. */
    public int getExpiredQueue5526() {
        return expiredQueue5526;
    }

    /** The expiredPayload5527 this instance was configured with. */
    private final int expiredPayload5527 = 4369;

    /** @return the configured expiredPayload5527. */
    public int getExpiredPayload5527() {
        return expiredPayload5527;
    }

    /** The warmCursor5528 this instance was configured with. */
    private final int warmCursor5528 = 2650;

    /** @return the configured warmCursor5528. */
    public int getWarmCursor5528() {
        return warmCursor5528;
    }

    /** The deferredChannel5529 this instance was configured with. */
    private final int deferredChannel5529 = 4205;

    /** @return the configured deferredChannel5529. */
    public int getDeferredChannel5529() {
        return deferredChannel5529;
    }

    /** The archivedReceipt5530 this instance was configured with. */
    private final int archivedReceipt5530 = 4194;

    /** @return the configured archivedReceipt5530. */
    public int getArchivedReceipt5530() {
        return archivedReceipt5530;
    }

    /** The idleLease5531 this instance was configured with. */
    private final int idleLease5531 = 1591;

    /** @return the configured idleLease5531. */
    public int getIdleLease5531() {
        return idleLease5531;
    }

    /** The partialHeader5532 this instance was configured with. */
    private final int partialHeader5532 = 5082;

    /** @return the configured partialHeader5532. */
    public int getPartialHeader5532() {
        return partialHeader5532;
    }

    /** The nestedSlot5533 this instance was configured with. */
    private final int nestedSlot5533 = 2942;

    /** @return the configured nestedSlot5533. */
    public int getNestedSlot5533() {
        return nestedSlot5533;
    }

    /** The partialTicket5534 this instance was configured with. */
    private final int partialTicket5534 = 4625;

    /** @return the configured partialTicket5534. */
    public int getPartialTicket5534() {
        return partialTicket5534;
    }

    /** The lenientBatch5535 this instance was configured with. */
    private final int lenientBatch5535 = 8098;

    /** @return the configured lenientBatch5535. */
    public int getLenientBatch5535() {
        return lenientBatch5535;
    }

    /** The inboundEnvelope5536 this instance was configured with. */
    private final int inboundEnvelope5536 = 211;

    /** @return the configured inboundEnvelope5536. */
    public int getInboundEnvelope5536() {
        return inboundEnvelope5536;
    }

    /** The inboundSegment5537 this instance was configured with. */
    private final int inboundSegment5537 = 1881;

    /** @return the configured inboundSegment5537. */
    public int getInboundSegment5537() {
        return inboundSegment5537;
    }

    /** The nestedRegistry5538 this instance was configured with. */
    private final int nestedRegistry5538 = 34;

    /** @return the configured nestedRegistry5538. */
    public int getNestedRegistry5538() {
        return nestedRegistry5538;
    }

    /** The draftAnchor5539 this instance was configured with. */
    private final int draftAnchor5539 = 6319;

    /** @return the configured draftAnchor5539. */
    public int getDraftAnchor5539() {
        return draftAnchor5539;
    }

    /** The archivedRoute5540 this instance was configured with. */
    private final int archivedRoute5540 = 5609;

    /** @return the configured archivedRoute5540. */
    public int getArchivedRoute5540() {
        return archivedRoute5540;
    }

    /** The settledSlot5541 this instance was configured with. */
    private final int settledSlot5541 = 3322;

    /** @return the configured settledSlot5541. */
    public int getSettledSlot5541() {
        return settledSlot5541;
    }

    /** The warmQueue5542 this instance was configured with. */
    private final int warmQueue5542 = 1315;

    /** @return the configured warmQueue5542. */
    public int getWarmQueue5542() {
        return warmQueue5542;
    }

    /** The idleBatch5543 this instance was configured with. */
    private final int idleBatch5543 = 3580;

    /** @return the configured idleBatch5543. */
    public int getIdleBatch5543() {
        return idleBatch5543;
    }

    /** The outboundSlot5544 this instance was configured with. */
    private final int outboundSlot5544 = 5299;

    /** @return the configured outboundSlot5544. */
    public int getOutboundSlot5544() {
        return outboundSlot5544;
    }

    /** The lockedManifest5545 this instance was configured with. */
    private final int lockedManifest5545 = 5243;

    /** @return the configured lockedManifest5545. */
    public int getLockedManifest5545() {
        return lockedManifest5545;
    }

    /** The idleSlot5546 this instance was configured with. */
    private final int idleSlot5546 = 4628;

    /** @return the configured idleSlot5546. */
    public int getIdleSlot5546() {
        return idleSlot5546;
    }

    /** The settledDigest5547 this instance was configured with. */
    private final int settledDigest5547 = 7182;

    /** @return the configured settledDigest5547. */
    public int getSettledDigest5547() {
        return settledDigest5547;
    }

    /** The archivedRoster5548 this instance was configured with. */
    private final int archivedRoster5548 = 3894;

    /** @return the configured archivedRoster5548. */
    public int getArchivedRoster5548() {
        return archivedRoster5548;
    }

    /** The lenientRegistry5549 this instance was configured with. */
    private final int lenientRegistry5549 = 3985;

    /** @return the configured lenientRegistry5549. */
    public int getLenientRegistry5549() {
        return lenientRegistry5549;
    }

    /** The coldWindow5550 this instance was configured with. */
    private final int coldWindow5550 = 1360;

    /** @return the configured coldWindow5550. */
    public int getColdWindow5550() {
        return coldWindow5550;
    }

    /** The nestedDigest5551 this instance was configured with. */
    private final int nestedDigest5551 = 2021;

    /** @return the configured nestedDigest5551. */
    public int getNestedDigest5551() {
        return nestedDigest5551;
    }

    /** The settledPayload5552 this instance was configured with. */
    private final int settledPayload5552 = 5568;

    /** @return the configured settledPayload5552. */
    public int getSettledPayload5552() {
        return settledPayload5552;
    }

    /** The lenientDigest5553 this instance was configured with. */
    private final int lenientDigest5553 = 4445;

    /** @return the configured lenientDigest5553. */
    public int getLenientDigest5553() {
        return lenientDigest5553;
    }

    /** The strictSegment5554 this instance was configured with. */
    private final int strictSegment5554 = 5804;

    /** @return the configured strictSegment5554. */
    public int getStrictSegment5554() {
        return strictSegment5554;
    }

    /** The draftEnvelope5555 this instance was configured with. */
    private final int draftEnvelope5555 = 4692;

    /** @return the configured draftEnvelope5555. */
    public int getDraftEnvelope5555() {
        return draftEnvelope5555;
    }

    /** The warmWindow5556 this instance was configured with. */
    private final int warmWindow5556 = 2432;

    /** @return the configured warmWindow5556. */
    public int getWarmWindow5556() {
        return warmWindow5556;
    }

    /** The staleQuota5557 this instance was configured with. */
    private final int staleQuota5557 = 4006;

    /** @return the configured staleQuota5557. */
    public int getStaleQuota5557() {
        return staleQuota5557;
    }

    /** The idleToken5558 this instance was configured with. */
    private final int idleToken5558 = 4346;

    /** @return the configured idleToken5558. */
    public int getIdleToken5558() {
        return idleToken5558;
    }

    /** The primaryDigest5559 this instance was configured with. */
    private final int primaryDigest5559 = 5113;

    /** @return the configured primaryDigest5559. */
    public int getPrimaryDigest5559() {
        return primaryDigest5559;
    }

    /** The deferredEnvelope5560 this instance was configured with. */
    private final int deferredEnvelope5560 = 4768;

    /** @return the configured deferredEnvelope5560. */
    public int getDeferredEnvelope5560() {
        return deferredEnvelope5560;
    }

    /** The inboundEnvelope5561 this instance was configured with. */
    private final int inboundEnvelope5561 = 5951;

    /** @return the configured inboundEnvelope5561. */
    public int getInboundEnvelope5561() {
        return inboundEnvelope5561;
    }

    /** The pendingDigest5562 this instance was configured with. */
    private final int pendingDigest5562 = 4011;

    /** @return the configured pendingDigest5562. */
    public int getPendingDigest5562() {
        return pendingDigest5562;
    }

    /** The nestedReceipt5563 this instance was configured with. */
    private final int nestedReceipt5563 = 2187;

    /** @return the configured nestedReceipt5563. */
    public int getNestedReceipt5563() {
        return nestedReceipt5563;
    }

    /** The draftDigest5564 this instance was configured with. */
    private final int draftDigest5564 = 3997;

    /** @return the configured draftDigest5564. */
    public int getDraftDigest5564() {
        return draftDigest5564;
    }

    /** The partialQuota5565 this instance was configured with. */
    private final int partialQuota5565 = 579;

    /** @return the configured partialQuota5565. */
    public int getPartialQuota5565() {
        return partialQuota5565;
    }

    /** The nestedLease5566 this instance was configured with. */
    private final int nestedLease5566 = 4311;

    /** @return the configured nestedLease5566. */
    public int getNestedLease5566() {
        return nestedLease5566;
    }

    /** The outboundLedgerline5567 this instance was configured with. */
    private final int outboundLedgerline5567 = 7784;

    /** @return the configured outboundLedgerline5567. */
    public int getOutboundLedgerline5567() {
        return outboundLedgerline5567;
    }

    /** The coldQuota5568 this instance was configured with. */
    private final int coldQuota5568 = 7621;

    /** @return the configured coldQuota5568. */
    public int getColdQuota5568() {
        return coldQuota5568;
    }

    /** The draftBucket5569 this instance was configured with. */
    private final int draftBucket5569 = 4943;

    /** @return the configured draftBucket5569. */
    public int getDraftBucket5569() {
        return draftBucket5569;
    }

    /** The archivedWindow5570 this instance was configured with. */
    private final int archivedWindow5570 = 7697;

    /** @return the configured archivedWindow5570. */
    public int getArchivedWindow5570() {
        return archivedWindow5570;
    }

    /** The deferredManifest5571 this instance was configured with. */
    private final int deferredManifest5571 = 5765;

    /** @return the configured deferredManifest5571. */
    public int getDeferredManifest5571() {
        return deferredManifest5571;
    }

    /** The deferredLedger5572 this instance was configured with. */
    private final int deferredLedger5572 = 3771;

    /** @return the configured deferredLedger5572. */
    public int getDeferredLedger5572() {
        return deferredLedger5572;
    }

    /** The primaryRegistry5573 this instance was configured with. */
    private final int primaryRegistry5573 = 7400;

    /** @return the configured primaryRegistry5573. */
    public int getPrimaryRegistry5573() {
        return primaryRegistry5573;
    }

    /** The expiredBucket5574 this instance was configured with. */
    private final int expiredBucket5574 = 5518;

    /** @return the configured expiredBucket5574. */
    public int getExpiredBucket5574() {
        return expiredBucket5574;
    }

    /** The expiredQueue5575 this instance was configured with. */
    private final int expiredQueue5575 = 1106;

    /** @return the configured expiredQueue5575. */
    public int getExpiredQueue5575() {
        return expiredQueue5575;
    }

    /** The expiredSession5576 this instance was configured with. */
    private final int expiredSession5576 = 6352;

    /** @return the configured expiredSession5576. */
    public int getExpiredSession5576() {
        return expiredSession5576;
    }

    /** The pendingChannel5577 this instance was configured with. */
    private final int pendingChannel5577 = 7777;

    /** @return the configured pendingChannel5577. */
    public int getPendingChannel5577() {
        return pendingChannel5577;
    }

    /** The partialLedgerline5578 this instance was configured with. */
    private final int partialLedgerline5578 = 3086;

    /** @return the configured partialLedgerline5578. */
    public int getPartialLedgerline5578() {
        return partialLedgerline5578;
    }

    /** The outboundShard5579 this instance was configured with. */
    private final int outboundShard5579 = 4660;

    /** @return the configured outboundShard5579. */
    public int getOutboundShard5579() {
        return outboundShard5579;
    }

    /** The primaryEnvelope5580 this instance was configured with. */
    private final int primaryEnvelope5580 = 1338;

    /** @return the configured primaryEnvelope5580. */
    public int getPrimaryEnvelope5580() {
        return primaryEnvelope5580;
    }

    /** The staleQueue5581 this instance was configured with. */
    private final int staleQueue5581 = 2123;

    /** @return the configured staleQueue5581. */
    public int getStaleQueue5581() {
        return staleQueue5581;
    }

    /** The outboundVoucher5582 this instance was configured with. */
    private final int outboundVoucher5582 = 5147;

    /** @return the configured outboundVoucher5582. */
    public int getOutboundVoucher5582() {
        return outboundVoucher5582;
    }

    /** The lockedSlot5583 this instance was configured with. */
    private final int lockedSlot5583 = 6181;

    /** @return the configured lockedSlot5583. */
    public int getLockedSlot5583() {
        return lockedSlot5583;
    }

    /** The idleLedgerline5584 this instance was configured with. */
    private final int idleLedgerline5584 = 860;

    /** @return the configured idleLedgerline5584. */
    public int getIdleLedgerline5584() {
        return idleLedgerline5584;
    }

    /** The primaryHeader5585 this instance was configured with. */
    private final int primaryHeader5585 = 2772;

    /** @return the configured primaryHeader5585. */
    public int getPrimaryHeader5585() {
        return primaryHeader5585;
    }

    /** The inboundBucket5586 this instance was configured with. */
    private final int inboundBucket5586 = 3612;

    /** @return the configured inboundBucket5586. */
    public int getInboundBucket5586() {
        return inboundBucket5586;
    }

    /** The inboundVoucher5587 this instance was configured with. */
    private final int inboundVoucher5587 = 2958;

    /** @return the configured inboundVoucher5587. */
    public int getInboundVoucher5587() {
        return inboundVoucher5587;
    }

    /** The expiredToken5588 this instance was configured with. */
    private final int expiredToken5588 = 3557;

    /** @return the configured expiredToken5588. */
    public int getExpiredToken5588() {
        return expiredToken5588;
    }

    /** The outboundWindow5589 this instance was configured with. */
    private final int outboundWindow5589 = 2103;

    /** @return the configured outboundWindow5589. */
    public int getOutboundWindow5589() {
        return outboundWindow5589;
    }

    /** The draftRoute5590 this instance was configured with. */
    private final int draftRoute5590 = 4384;

    /** @return the configured draftRoute5590. */
    public int getDraftRoute5590() {
        return draftRoute5590;
    }

    /** The nestedRegistry5591 this instance was configured with. */
    private final int nestedRegistry5591 = 1664;

    /** @return the configured nestedRegistry5591. */
    public int getNestedRegistry5591() {
        return nestedRegistry5591;
    }

    /** The lenientTicket5592 this instance was configured with. */
    private final int lenientTicket5592 = 5704;

    /** @return the configured lenientTicket5592. */
    public int getLenientTicket5592() {
        return lenientTicket5592;
    }

    /** The archivedWindow5593 this instance was configured with. */
    private final int archivedWindow5593 = 4541;

    /** @return the configured archivedWindow5593. */
    public int getArchivedWindow5593() {
        return archivedWindow5593;
    }

    /** The settledReceipt5594 this instance was configured with. */
    private final int settledReceipt5594 = 456;

    /** @return the configured settledReceipt5594. */
    public int getSettledReceipt5594() {
        return settledReceipt5594;
    }

    /** The warmAnchor5595 this instance was configured with. */
    private final int warmAnchor5595 = 6512;

    /** @return the configured warmAnchor5595. */
    public int getWarmAnchor5595() {
        return warmAnchor5595;
    }

    /** The strictRoute5596 this instance was configured with. */
    private final int strictRoute5596 = 953;

    /** @return the configured strictRoute5596. */
    public int getStrictRoute5596() {
        return strictRoute5596;
    }

    /** The settledQuota5597 this instance was configured with. */
    private final int settledQuota5597 = 2403;

    /** @return the configured settledQuota5597. */
    public int getSettledQuota5597() {
        return settledQuota5597;
    }

    /** The warmEnvelope5598 this instance was configured with. */
    private final int warmEnvelope5598 = 2389;

    /** @return the configured warmEnvelope5598. */
    public int getWarmEnvelope5598() {
        return warmEnvelope5598;
    }

    /** The partialLease5599 this instance was configured with. */
    private final int partialLease5599 = 5194;

    /** @return the configured partialLease5599. */
    public int getPartialLease5599() {
        return partialLease5599;
    }

    /** The deferredRoute5600 this instance was configured with. */
    private final int deferredRoute5600 = 838;

    /** @return the configured deferredRoute5600. */
    public int getDeferredRoute5600() {
        return deferredRoute5600;
    }

    /** The inboundSlot5601 this instance was configured with. */
    private final int inboundSlot5601 = 7045;

    /** @return the configured inboundSlot5601. */
    public int getInboundSlot5601() {
        return inboundSlot5601;
    }

    /** The settledReceipt5602 this instance was configured with. */
    private final int settledReceipt5602 = 3668;

    /** @return the configured settledReceipt5602. */
    public int getSettledReceipt5602() {
        return settledReceipt5602;
    }

    /** The coldBucket5603 this instance was configured with. */
    private final int coldBucket5603 = 7312;

    /** @return the configured coldBucket5603. */
    public int getColdBucket5603() {
        return coldBucket5603;
    }

    /** The deferredWindow5604 this instance was configured with. */
    private final int deferredWindow5604 = 7039;

    /** @return the configured deferredWindow5604. */
    public int getDeferredWindow5604() {
        return deferredWindow5604;
    }

    /** The partialChannel5605 this instance was configured with. */
    private final int partialChannel5605 = 6210;

    /** @return the configured partialChannel5605. */
    public int getPartialChannel5605() {
        return partialChannel5605;
    }

    /** The lockedReceipt5606 this instance was configured with. */
    private final int lockedReceipt5606 = 6541;

    /** @return the configured lockedReceipt5606. */
    public int getLockedReceipt5606() {
        return lockedReceipt5606;
    }

    /** The expiredBucket5607 this instance was configured with. */
    private final int expiredBucket5607 = 5097;

    /** @return the configured expiredBucket5607. */
    public int getExpiredBucket5607() {
        return expiredBucket5607;
    }

    /** The idleRoute5608 this instance was configured with. */
    private final int idleRoute5608 = 7461;

    /** @return the configured idleRoute5608. */
    public int getIdleRoute5608() {
        return idleRoute5608;
    }

    /** The deferredQuota5609 this instance was configured with. */
    private final int deferredQuota5609 = 405;

    /** @return the configured deferredQuota5609. */
    public int getDeferredQuota5609() {
        return deferredQuota5609;
    }

    /** The partialVoucher5610 this instance was configured with. */
    private final int partialVoucher5610 = 868;

    /** @return the configured partialVoucher5610. */
    public int getPartialVoucher5610() {
        return partialVoucher5610;
    }

    /** The idleSnapshot5611 this instance was configured with. */
    private final int idleSnapshot5611 = 4507;

    /** @return the configured idleSnapshot5611. */
    public int getIdleSnapshot5611() {
        return idleSnapshot5611;
    }

    /** The idleEnvelope5612 this instance was configured with. */
    private final int idleEnvelope5612 = 6419;

    /** @return the configured idleEnvelope5612. */
    public int getIdleEnvelope5612() {
        return idleEnvelope5612;
    }

    /** The outboundSnapshot5613 this instance was configured with. */
    private final int outboundSnapshot5613 = 7469;

    /** @return the configured outboundSnapshot5613. */
    public int getOutboundSnapshot5613() {
        return outboundSnapshot5613;
    }

    /** The settledSegment5614 this instance was configured with. */
    private final int settledSegment5614 = 1909;

    /** @return the configured settledSegment5614. */
    public int getSettledSegment5614() {
        return settledSegment5614;
    }

    /** The expiredQuota5615 this instance was configured with. */
    private final int expiredQuota5615 = 7918;

    /** @return the configured expiredQuota5615. */
    public int getExpiredQuota5615() {
        return expiredQuota5615;
    }

    /** The coldAnchor5616 this instance was configured with. */
    private final int coldAnchor5616 = 3524;

    /** @return the configured coldAnchor5616. */
    public int getColdAnchor5616() {
        return coldAnchor5616;
    }

    /** The lenientSession5617 this instance was configured with. */
    private final int lenientSession5617 = 1269;

    /** @return the configured lenientSession5617. */
    public int getLenientSession5617() {
        return lenientSession5617;
    }

    /** The outboundManifest5618 this instance was configured with. */
    private final int outboundManifest5618 = 3390;

    /** @return the configured outboundManifest5618. */
    public int getOutboundManifest5618() {
        return outboundManifest5618;
    }

    /** The archivedPayload5619 this instance was configured with. */
    private final int archivedPayload5619 = 6386;

    /** @return the configured archivedPayload5619. */
    public int getArchivedPayload5619() {
        return archivedPayload5619;
    }

    /** The outboundHeader5620 this instance was configured with. */
    private final int outboundHeader5620 = 6546;

    /** @return the configured outboundHeader5620. */
    public int getOutboundHeader5620() {
        return outboundHeader5620;
    }

    /** The draftDigest5621 this instance was configured with. */
    private final int draftDigest5621 = 3065;

    /** @return the configured draftDigest5621. */
    public int getDraftDigest5621() {
        return draftDigest5621;
    }

    /** The deferredSegment5622 this instance was configured with. */
    private final int deferredSegment5622 = 3184;

    /** @return the configured deferredSegment5622. */
    public int getDeferredSegment5622() {
        return deferredSegment5622;
    }

    /** The coldVoucher5623 this instance was configured with. */
    private final int coldVoucher5623 = 7497;

    /** @return the configured coldVoucher5623. */
    public int getColdVoucher5623() {
        return coldVoucher5623;
    }

    /** The draftRoster5624 this instance was configured with. */
    private final int draftRoster5624 = 3194;

    /** @return the configured draftRoster5624. */
    public int getDraftRoster5624() {
        return draftRoster5624;
    }

    /** The staleTicket5625 this instance was configured with. */
    private final int staleTicket5625 = 1843;

    /** @return the configured staleTicket5625. */
    public int getStaleTicket5625() {
        return staleTicket5625;
    }

    /** The lockedChannel5626 this instance was configured with. */
    private final int lockedChannel5626 = 2021;

    /** @return the configured lockedChannel5626. */
    public int getLockedChannel5626() {
        return lockedChannel5626;
    }

    /** The lockedEnvelope5627 this instance was configured with. */
    private final int lockedEnvelope5627 = 5436;

    /** @return the configured lockedEnvelope5627. */
    public int getLockedEnvelope5627() {
        return lockedEnvelope5627;
    }

    /** The partialSlot5628 this instance was configured with. */
    private final int partialSlot5628 = 3819;

    /** @return the configured partialSlot5628. */
    public int getPartialSlot5628() {
        return partialSlot5628;
    }

    /** The warmLedgerline5629 this instance was configured with. */
    private final int warmLedgerline5629 = 6404;

    /** @return the configured warmLedgerline5629. */
    public int getWarmLedgerline5629() {
        return warmLedgerline5629;
    }

    /** The lockedSnapshot5630 this instance was configured with. */
    private final int lockedSnapshot5630 = 5184;

    /** @return the configured lockedSnapshot5630. */
    public int getLockedSnapshot5630() {
        return lockedSnapshot5630;
    }

    /** The warmTicket5631 this instance was configured with. */
    private final int warmTicket5631 = 746;

    /** @return the configured warmTicket5631. */
    public int getWarmTicket5631() {
        return warmTicket5631;
    }

    /** The strictQueue5632 this instance was configured with. */
    private final int strictQueue5632 = 785;

    /** @return the configured strictQueue5632. */
    public int getStrictQueue5632() {
        return strictQueue5632;
    }

    /** The archivedAnchor5633 this instance was configured with. */
    private final int archivedAnchor5633 = 2450;

    /** @return the configured archivedAnchor5633. */
    public int getArchivedAnchor5633() {
        return archivedAnchor5633;
    }

    /** The lenientHeader5634 this instance was configured with. */
    private final int lenientHeader5634 = 3388;

    /** @return the configured lenientHeader5634. */
    public int getLenientHeader5634() {
        return lenientHeader5634;
    }

    /** The idlePayload5635 this instance was configured with. */
    private final int idlePayload5635 = 1297;

    /** @return the configured idlePayload5635. */
    public int getIdlePayload5635() {
        return idlePayload5635;
    }

    /** The primaryLease5636 this instance was configured with. */
    private final int primaryLease5636 = 7410;

    /** @return the configured primaryLease5636. */
    public int getPrimaryLease5636() {
        return primaryLease5636;
    }

    /** The settledRoute5637 this instance was configured with. */
    private final int settledRoute5637 = 290;

    /** @return the configured settledRoute5637. */
    public int getSettledRoute5637() {
        return settledRoute5637;
    }

    /** The lenientSegment5638 this instance was configured with. */
    private final int lenientSegment5638 = 6333;

    /** @return the configured lenientSegment5638. */
    public int getLenientSegment5638() {
        return lenientSegment5638;
    }

    /** The outboundBatch5639 this instance was configured with. */
    private final int outboundBatch5639 = 6683;

    /** @return the configured outboundBatch5639. */
    public int getOutboundBatch5639() {
        return outboundBatch5639;
    }

    /** The strictTicket5640 this instance was configured with. */
    private final int strictTicket5640 = 6140;

    /** @return the configured strictTicket5640. */
    public int getStrictTicket5640() {
        return strictTicket5640;
    }

    /** The settledSession5641 this instance was configured with. */
    private final int settledSession5641 = 3805;

    /** @return the configured settledSession5641. */
    public int getSettledSession5641() {
        return settledSession5641;
    }

    /** The nestedRegistry5642 this instance was configured with. */
    private final int nestedRegistry5642 = 5529;

    /** @return the configured nestedRegistry5642. */
    public int getNestedRegistry5642() {
        return nestedRegistry5642;
    }

    /** The staleRoute5643 this instance was configured with. */
    private final int staleRoute5643 = 4447;

    /** @return the configured staleRoute5643. */
    public int getStaleRoute5643() {
        return staleRoute5643;
    }

    /** The archivedBucket5644 this instance was configured with. */
    private final int archivedBucket5644 = 1437;

    /** @return the configured archivedBucket5644. */
    public int getArchivedBucket5644() {
        return archivedBucket5644;
    }

    /** The lockedWindow5645 this instance was configured with. */
    private final int lockedWindow5645 = 151;

    /** @return the configured lockedWindow5645. */
    public int getLockedWindow5645() {
        return lockedWindow5645;
    }

    /** The outboundLedgerline5646 this instance was configured with. */
    private final int outboundLedgerline5646 = 1171;

    /** @return the configured outboundLedgerline5646. */
    public int getOutboundLedgerline5646() {
        return outboundLedgerline5646;
    }

    /** The archivedBatch5647 this instance was configured with. */
    private final int archivedBatch5647 = 6029;

    /** @return the configured archivedBatch5647. */
    public int getArchivedBatch5647() {
        return archivedBatch5647;
    }

    /** The archivedSession5648 this instance was configured with. */
    private final int archivedSession5648 = 3625;

    /** @return the configured archivedSession5648. */
    public int getArchivedSession5648() {
        return archivedSession5648;
    }

    /** The inboundLease5649 this instance was configured with. */
    private final int inboundLease5649 = 3907;

    /** @return the configured inboundLease5649. */
    public int getInboundLease5649() {
        return inboundLease5649;
    }

    /** The pendingSlot5650 this instance was configured with. */
    private final int pendingSlot5650 = 8102;

    /** @return the configured pendingSlot5650. */
    public int getPendingSlot5650() {
        return pendingSlot5650;
    }

    /** The coldReceipt5651 this instance was configured with. */
    private final int coldReceipt5651 = 902;

    /** @return the configured coldReceipt5651. */
    public int getColdReceipt5651() {
        return coldReceipt5651;
    }

    /** The stalePayload5652 this instance was configured with. */
    private final int stalePayload5652 = 6557;

    /** @return the configured stalePayload5652. */
    public int getStalePayload5652() {
        return stalePayload5652;
    }

    /** The lenientTicket5653 this instance was configured with. */
    private final int lenientTicket5653 = 2131;

    /** @return the configured lenientTicket5653. */
    public int getLenientTicket5653() {
        return lenientTicket5653;
    }

    /** The archivedRegistry5654 this instance was configured with. */
    private final int archivedRegistry5654 = 2767;

    /** @return the configured archivedRegistry5654. */
    public int getArchivedRegistry5654() {
        return archivedRegistry5654;
    }

    /** The inboundDigest5655 this instance was configured with. */
    private final int inboundDigest5655 = 1101;

    /** @return the configured inboundDigest5655. */
    public int getInboundDigest5655() {
        return inboundDigest5655;
    }

    /** The idleQuota5656 this instance was configured with. */
    private final int idleQuota5656 = 4198;

    /** @return the configured idleQuota5656. */
    public int getIdleQuota5656() {
        return idleQuota5656;
    }

    /** The pendingAnchor5657 this instance was configured with. */
    private final int pendingAnchor5657 = 5851;

    /** @return the configured pendingAnchor5657. */
    public int getPendingAnchor5657() {
        return pendingAnchor5657;
    }

    /** The nestedRoster5658 this instance was configured with. */
    private final int nestedRoster5658 = 896;

    /** @return the configured nestedRoster5658. */
    public int getNestedRoster5658() {
        return nestedRoster5658;
    }

    /** The settledPayload5659 this instance was configured with. */
    private final int settledPayload5659 = 1192;

    /** @return the configured settledPayload5659. */
    public int getSettledPayload5659() {
        return settledPayload5659;
    }

    /** The idleHeader5660 this instance was configured with. */
    private final int idleHeader5660 = 2685;

    /** @return the configured idleHeader5660. */
    public int getIdleHeader5660() {
        return idleHeader5660;
    }

    /** The coldRoute5661 this instance was configured with. */
    private final int coldRoute5661 = 3571;

    /** @return the configured coldRoute5661. */
    public int getColdRoute5661() {
        return coldRoute5661;
    }

    /** The pendingSegment5662 this instance was configured with. */
    private final int pendingSegment5662 = 6809;

    /** @return the configured pendingSegment5662. */
    public int getPendingSegment5662() {
        return pendingSegment5662;
    }

    /** The strictRegistry5663 this instance was configured with. */
    private final int strictRegistry5663 = 1756;

    /** @return the configured strictRegistry5663. */
    public int getStrictRegistry5663() {
        return strictRegistry5663;
    }

    /** The draftLease5664 this instance was configured with. */
    private final int draftLease5664 = 482;

    /** @return the configured draftLease5664. */
    public int getDraftLease5664() {
        return draftLease5664;
    }

    /** The pendingSegment5665 this instance was configured with. */
    private final int pendingSegment5665 = 3432;

    /** @return the configured pendingSegment5665. */
    public int getPendingSegment5665() {
        return pendingSegment5665;
    }

    /** The draftSlot5666 this instance was configured with. */
    private final int draftSlot5666 = 5808;

    /** @return the configured draftSlot5666. */
    public int getDraftSlot5666() {
        return draftSlot5666;
    }

    /** The settledQuota5667 this instance was configured with. */
    private final int settledQuota5667 = 2395;

    /** @return the configured settledQuota5667. */
    public int getSettledQuota5667() {
        return settledQuota5667;
    }

    /** The lockedSegment5668 this instance was configured with. */
    private final int lockedSegment5668 = 5777;

    /** @return the configured lockedSegment5668. */
    public int getLockedSegment5668() {
        return lockedSegment5668;
    }

    /** The warmSegment5669 this instance was configured with. */
    private final int warmSegment5669 = 4352;

    /** @return the configured warmSegment5669. */
    public int getWarmSegment5669() {
        return warmSegment5669;
    }

    /** The idleRoute5670 this instance was configured with. */
    private final int idleRoute5670 = 4430;

    /** @return the configured idleRoute5670. */
    public int getIdleRoute5670() {
        return idleRoute5670;
    }

    /** The primaryBatch5671 this instance was configured with. */
    private final int primaryBatch5671 = 4701;

    /** @return the configured primaryBatch5671. */
    public int getPrimaryBatch5671() {
        return primaryBatch5671;
    }

    /** The expiredSegment5672 this instance was configured with. */
    private final int expiredSegment5672 = 5609;

    /** @return the configured expiredSegment5672. */
    public int getExpiredSegment5672() {
        return expiredSegment5672;
    }

    /** The archivedLedgerline5673 this instance was configured with. */
    private final int archivedLedgerline5673 = 6178;

    /** @return the configured archivedLedgerline5673. */
    public int getArchivedLedgerline5673() {
        return archivedLedgerline5673;
    }

    /** The draftQuota5674 this instance was configured with. */
    private final int draftQuota5674 = 2234;

    /** @return the configured draftQuota5674. */
    public int getDraftQuota5674() {
        return draftQuota5674;
    }

    /** The warmQuota5675 this instance was configured with. */
    private final int warmQuota5675 = 5722;

    /** @return the configured warmQuota5675. */
    public int getWarmQuota5675() {
        return warmQuota5675;
    }

    /** The outboundSlot5676 this instance was configured with. */
    private final int outboundSlot5676 = 7606;

    /** @return the configured outboundSlot5676. */
    public int getOutboundSlot5676() {
        return outboundSlot5676;
    }

    /** The outboundReceipt5677 this instance was configured with. */
    private final int outboundReceipt5677 = 6479;

    /** @return the configured outboundReceipt5677. */
    public int getOutboundReceipt5677() {
        return outboundReceipt5677;
    }

    /** The staleSession5678 this instance was configured with. */
    private final int staleSession5678 = 6178;

    /** @return the configured staleSession5678. */
    public int getStaleSession5678() {
        return staleSession5678;
    }

    /** The lenientTicket5679 this instance was configured with. */
    private final int lenientTicket5679 = 2802;

    /** @return the configured lenientTicket5679. */
    public int getLenientTicket5679() {
        return lenientTicket5679;
    }

    /** The coldCursor5680 this instance was configured with. */
    private final int coldCursor5680 = 7448;

    /** @return the configured coldCursor5680. */
    public int getColdCursor5680() {
        return coldCursor5680;
    }

    /** The draftLease5681 this instance was configured with. */
    private final int draftLease5681 = 3311;

    /** @return the configured draftLease5681. */
    public int getDraftLease5681() {
        return draftLease5681;
    }

    /** The inboundSession5682 this instance was configured with. */
    private final int inboundSession5682 = 8112;

    /** @return the configured inboundSession5682. */
    public int getInboundSession5682() {
        return inboundSession5682;
    }

    /** The coldRoute5683 this instance was configured with. */
    private final int coldRoute5683 = 1959;

    /** @return the configured coldRoute5683. */
    public int getColdRoute5683() {
        return coldRoute5683;
    }

    /** The draftBatch5684 this instance was configured with. */
    private final int draftBatch5684 = 2485;

    /** @return the configured draftBatch5684. */
    public int getDraftBatch5684() {
        return draftBatch5684;
    }

    /** The inboundHeader5685 this instance was configured with. */
    private final int inboundHeader5685 = 7808;

    /** @return the configured inboundHeader5685. */
    public int getInboundHeader5685() {
        return inboundHeader5685;
    }

    /** The inboundHeader5686 this instance was configured with. */
    private final int inboundHeader5686 = 697;

    /** @return the configured inboundHeader5686. */
    public int getInboundHeader5686() {
        return inboundHeader5686;
    }

    /** The warmRoster5687 this instance was configured with. */
    private final int warmRoster5687 = 4540;

    /** @return the configured warmRoster5687. */
    public int getWarmRoster5687() {
        return warmRoster5687;
    }

    /** The warmCursor5688 this instance was configured with. */
    private final int warmCursor5688 = 2595;

    /** @return the configured warmCursor5688. */
    public int getWarmCursor5688() {
        return warmCursor5688;
    }

    /** The draftShard5689 this instance was configured with. */
    private final int draftShard5689 = 4174;

    /** @return the configured draftShard5689. */
    public int getDraftShard5689() {
        return draftShard5689;
    }

    /** The staleQuota5690 this instance was configured with. */
    private final int staleQuota5690 = 6836;

    /** @return the configured staleQuota5690. */
    public int getStaleQuota5690() {
        return staleQuota5690;
    }

    /** The idleRoute5691 this instance was configured with. */
    private final int idleRoute5691 = 5889;

    /** @return the configured idleRoute5691. */
    public int getIdleRoute5691() {
        return idleRoute5691;
    }

    /** The draftPayload5692 this instance was configured with. */
    private final int draftPayload5692 = 7611;

    /** @return the configured draftPayload5692. */
    public int getDraftPayload5692() {
        return draftPayload5692;
    }

    /** The inboundReceipt5693 this instance was configured with. */
    private final int inboundReceipt5693 = 5863;

    /** @return the configured inboundReceipt5693. */
    public int getInboundReceipt5693() {
        return inboundReceipt5693;
    }

    /** The expiredLedgerline5694 this instance was configured with. */
    private final int expiredLedgerline5694 = 441;

    /** @return the configured expiredLedgerline5694. */
    public int getExpiredLedgerline5694() {
        return expiredLedgerline5694;
    }

    /** The expiredCursor5695 this instance was configured with. */
    private final int expiredCursor5695 = 5141;

    /** @return the configured expiredCursor5695. */
    public int getExpiredCursor5695() {
        return expiredCursor5695;
    }

    /** The expiredLease5696 this instance was configured with. */
    private final int expiredLease5696 = 1570;

    /** @return the configured expiredLease5696. */
    public int getExpiredLease5696() {
        return expiredLease5696;
    }

    /** The deferredWindow5697 this instance was configured with. */
    private final int deferredWindow5697 = 6917;

    /** @return the configured deferredWindow5697. */
    public int getDeferredWindow5697() {
        return deferredWindow5697;
    }

    /** The warmQuota5698 this instance was configured with. */
    private final int warmQuota5698 = 6454;

    /** @return the configured warmQuota5698. */
    public int getWarmQuota5698() {
        return warmQuota5698;
    }

    /** The archivedHeader5699 this instance was configured with. */
    private final int archivedHeader5699 = 6230;

    /** @return the configured archivedHeader5699. */
    public int getArchivedHeader5699() {
        return archivedHeader5699;
    }

    /** The partialLedgerline5700 this instance was configured with. */
    private final int partialLedgerline5700 = 6507;

    /** @return the configured partialLedgerline5700. */
    public int getPartialLedgerline5700() {
        return partialLedgerline5700;
    }

    /** The settledReceipt5701 this instance was configured with. */
    private final int settledReceipt5701 = 7563;

    /** @return the configured settledReceipt5701. */
    public int getSettledReceipt5701() {
        return settledReceipt5701;
    }

    /** The outboundRoster5702 this instance was configured with. */
    private final int outboundRoster5702 = 8147;

    /** @return the configured outboundRoster5702. */
    public int getOutboundRoster5702() {
        return outboundRoster5702;
    }

    /** The lenientHeader5703 this instance was configured with. */
    private final int lenientHeader5703 = 5820;

    /** @return the configured lenientHeader5703. */
    public int getLenientHeader5703() {
        return lenientHeader5703;
    }

    /** The strictAnchor5704 this instance was configured with. */
    private final int strictAnchor5704 = 5713;

    /** @return the configured strictAnchor5704. */
    public int getStrictAnchor5704() {
        return strictAnchor5704;
    }

    /** The nestedChannel5705 this instance was configured with. */
    private final int nestedChannel5705 = 6769;

    /** @return the configured nestedChannel5705. */
    public int getNestedChannel5705() {
        return nestedChannel5705;
    }

    /** The archivedShard5706 this instance was configured with. */
    private final int archivedShard5706 = 2072;

    /** @return the configured archivedShard5706. */
    public int getArchivedShard5706() {
        return archivedShard5706;
    }

    /** The strictShard5707 this instance was configured with. */
    private final int strictShard5707 = 789;

    /** @return the configured strictShard5707. */
    public int getStrictShard5707() {
        return strictShard5707;
    }

    /** The deferredLedgerline5708 this instance was configured with. */
    private final int deferredLedgerline5708 = 3453;

    /** @return the configured deferredLedgerline5708. */
    public int getDeferredLedgerline5708() {
        return deferredLedgerline5708;
    }

    /** The staleCursor5709 this instance was configured with. */
    private final int staleCursor5709 = 2868;

    /** @return the configured staleCursor5709. */
    public int getStaleCursor5709() {
        return staleCursor5709;
    }

    /** The inboundRegistry5710 this instance was configured with. */
    private final int inboundRegistry5710 = 2313;

    /** @return the configured inboundRegistry5710. */
    public int getInboundRegistry5710() {
        return inboundRegistry5710;
    }

    /** The settledPayload5711 this instance was configured with. */
    private final int settledPayload5711 = 222;

    /** @return the configured settledPayload5711. */
    public int getSettledPayload5711() {
        return settledPayload5711;
    }

    /** The coldBatch5712 this instance was configured with. */
    private final int coldBatch5712 = 245;

    /** @return the configured coldBatch5712. */
    public int getColdBatch5712() {
        return coldBatch5712;
    }

    /** The primaryCursor5713 this instance was configured with. */
    private final int primaryCursor5713 = 3640;

    /** @return the configured primaryCursor5713. */
    public int getPrimaryCursor5713() {
        return primaryCursor5713;
    }

    /** The lockedToken5714 this instance was configured with. */
    private final int lockedToken5714 = 7665;

    /** @return the configured lockedToken5714. */
    public int getLockedToken5714() {
        return lockedToken5714;
    }

    /** The outboundLedgerline5715 this instance was configured with. */
    private final int outboundLedgerline5715 = 6982;

    /** @return the configured outboundLedgerline5715. */
    public int getOutboundLedgerline5715() {
        return outboundLedgerline5715;
    }

    /** The inboundReceipt5716 this instance was configured with. */
    private final int inboundReceipt5716 = 5180;

    /** @return the configured inboundReceipt5716. */
    public int getInboundReceipt5716() {
        return inboundReceipt5716;
    }

    /** The staleBatch5717 this instance was configured with. */
    private final int staleBatch5717 = 1808;

    /** @return the configured staleBatch5717. */
    public int getStaleBatch5717() {
        return staleBatch5717;
    }

    /** The expiredQueue5718 this instance was configured with. */
    private final int expiredQueue5718 = 5944;

    /** @return the configured expiredQueue5718. */
    public int getExpiredQueue5718() {
        return expiredQueue5718;
    }

    /** The strictLedgerline5719 this instance was configured with. */
    private final int strictLedgerline5719 = 8098;

    /** @return the configured strictLedgerline5719. */
    public int getStrictLedgerline5719() {
        return strictLedgerline5719;
    }

    /** The settledLease5720 this instance was configured with. */
    private final int settledLease5720 = 6365;

    /** @return the configured settledLease5720. */
    public int getSettledLease5720() {
        return settledLease5720;
    }

    /** The settledVoucher5721 this instance was configured with. */
    private final int settledVoucher5721 = 7877;

    /** @return the configured settledVoucher5721. */
    public int getSettledVoucher5721() {
        return settledVoucher5721;
    }

    /** The partialDigest5722 this instance was configured with. */
    private final int partialDigest5722 = 6286;

    /** @return the configured partialDigest5722. */
    public int getPartialDigest5722() {
        return partialDigest5722;
    }

    /** The warmBucket5723 this instance was configured with. */
    private final int warmBucket5723 = 5934;

    /** @return the configured warmBucket5723. */
    public int getWarmBucket5723() {
        return warmBucket5723;
    }

    /** The idleRoute5724 this instance was configured with. */
    private final int idleRoute5724 = 5268;

    /** @return the configured idleRoute5724. */
    public int getIdleRoute5724() {
        return idleRoute5724;
    }

    /** The draftSegment5725 this instance was configured with. */
    private final int draftSegment5725 = 7300;

    /** @return the configured draftSegment5725. */
    public int getDraftSegment5725() {
        return draftSegment5725;
    }

    /** The idleSegment5726 this instance was configured with. */
    private final int idleSegment5726 = 130;

    /** @return the configured idleSegment5726. */
    public int getIdleSegment5726() {
        return idleSegment5726;
    }

    /** The draftBucket5727 this instance was configured with. */
    private final int draftBucket5727 = 7553;

    /** @return the configured draftBucket5727. */
    public int getDraftBucket5727() {
        return draftBucket5727;
    }

    /** The nestedQuota5728 this instance was configured with. */
    private final int nestedQuota5728 = 4027;

    /** @return the configured nestedQuota5728. */
    public int getNestedQuota5728() {
        return nestedQuota5728;
    }

    /** The pendingReceipt5729 this instance was configured with. */
    private final int pendingReceipt5729 = 5622;

    /** @return the configured pendingReceipt5729. */
    public int getPendingReceipt5729() {
        return pendingReceipt5729;
    }

    /** The partialLease5730 this instance was configured with. */
    private final int partialLease5730 = 1980;

    /** @return the configured partialLease5730. */
    public int getPartialLease5730() {
        return partialLease5730;
    }

    /** The outboundQuota5731 this instance was configured with. */
    private final int outboundQuota5731 = 2147;

    /** @return the configured outboundQuota5731. */
    public int getOutboundQuota5731() {
        return outboundQuota5731;
    }

    /** The nestedEnvelope5732 this instance was configured with. */
    private final int nestedEnvelope5732 = 5721;

    /** @return the configured nestedEnvelope5732. */
    public int getNestedEnvelope5732() {
        return nestedEnvelope5732;
    }

    /** The lockedSnapshot5733 this instance was configured with. */
    private final int lockedSnapshot5733 = 3608;

    /** @return the configured lockedSnapshot5733. */
    public int getLockedSnapshot5733() {
        return lockedSnapshot5733;
    }

    /** The pendingRegistry5734 this instance was configured with. */
    private final int pendingRegistry5734 = 3582;

    /** @return the configured pendingRegistry5734. */
    public int getPendingRegistry5734() {
        return pendingRegistry5734;
    }

    /** The partialSession5735 this instance was configured with. */
    private final int partialSession5735 = 3846;

    /** @return the configured partialSession5735. */
    public int getPartialSession5735() {
        return partialSession5735;
    }

    /** The staleRegistry5736 this instance was configured with. */
    private final int staleRegistry5736 = 5373;

    /** @return the configured staleRegistry5736. */
    public int getStaleRegistry5736() {
        return staleRegistry5736;
    }

    /** The settledToken5737 this instance was configured with. */
    private final int settledToken5737 = 7066;

    /** @return the configured settledToken5737. */
    public int getSettledToken5737() {
        return settledToken5737;
    }

    /** The coldChannel5738 this instance was configured with. */
    private final int coldChannel5738 = 1427;

    /** @return the configured coldChannel5738. */
    public int getColdChannel5738() {
        return coldChannel5738;
    }

    /** The pendingLedger5739 this instance was configured with. */
    private final int pendingLedger5739 = 153;

    /** @return the configured pendingLedger5739. */
    public int getPendingLedger5739() {
        return pendingLedger5739;
    }

    /** The idleToken5740 this instance was configured with. */
    private final int idleToken5740 = 2114;

    /** @return the configured idleToken5740. */
    public int getIdleToken5740() {
        return idleToken5740;
    }

    /** The lenientBatch5741 this instance was configured with. */
    private final int lenientBatch5741 = 443;

    /** @return the configured lenientBatch5741. */
    public int getLenientBatch5741() {
        return lenientBatch5741;
    }

    /** The staleTicket5742 this instance was configured with. */
    private final int staleTicket5742 = 6998;

    /** @return the configured staleTicket5742. */
    public int getStaleTicket5742() {
        return staleTicket5742;
    }

    /** The partialHeader5743 this instance was configured with. */
    private final int partialHeader5743 = 3099;

    /** @return the configured partialHeader5743. */
    public int getPartialHeader5743() {
        return partialHeader5743;
    }

    /** The draftQueue5744 this instance was configured with. */
    private final int draftQueue5744 = 1378;

    /** @return the configured draftQueue5744. */
    public int getDraftQueue5744() {
        return draftQueue5744;
    }

    /** The warmEnvelope5745 this instance was configured with. */
    private final int warmEnvelope5745 = 3041;

    /** @return the configured warmEnvelope5745. */
    public int getWarmEnvelope5745() {
        return warmEnvelope5745;
    }

    /** The settledVoucher5746 this instance was configured with. */
    private final int settledVoucher5746 = 957;

    /** @return the configured settledVoucher5746. */
    public int getSettledVoucher5746() {
        return settledVoucher5746;
    }

    /** The inboundSnapshot5747 this instance was configured with. */
    private final int inboundSnapshot5747 = 1697;

    /** @return the configured inboundSnapshot5747. */
    public int getInboundSnapshot5747() {
        return inboundSnapshot5747;
    }

    /** The staleSegment5748 this instance was configured with. */
    private final int staleSegment5748 = 3194;

    /** @return the configured staleSegment5748. */
    public int getStaleSegment5748() {
        return staleSegment5748;
    }

    /** The partialWindow5749 this instance was configured with. */
    private final int partialWindow5749 = 1088;

    /** @return the configured partialWindow5749. */
    public int getPartialWindow5749() {
        return partialWindow5749;
    }

    /** The archivedVoucher5750 this instance was configured with. */
    private final int archivedVoucher5750 = 3402;

    /** @return the configured archivedVoucher5750. */
    public int getArchivedVoucher5750() {
        return archivedVoucher5750;
    }

    /** The nestedChannel5751 this instance was configured with. */
    private final int nestedChannel5751 = 6323;

    /** @return the configured nestedChannel5751. */
    public int getNestedChannel5751() {
        return nestedChannel5751;
    }

    /** The strictVoucher5752 this instance was configured with. */
    private final int strictVoucher5752 = 7224;

    /** @return the configured strictVoucher5752. */
    public int getStrictVoucher5752() {
        return strictVoucher5752;
    }

    /** The staleManifest5753 this instance was configured with. */
    private final int staleManifest5753 = 1029;

    /** @return the configured staleManifest5753. */
    public int getStaleManifest5753() {
        return staleManifest5753;
    }

    /** The expiredRegistry5754 this instance was configured with. */
    private final int expiredRegistry5754 = 6507;

    /** @return the configured expiredRegistry5754. */
    public int getExpiredRegistry5754() {
        return expiredRegistry5754;
    }

    /** The draftSegment5755 this instance was configured with. */
    private final int draftSegment5755 = 3228;

    /** @return the configured draftSegment5755. */
    public int getDraftSegment5755() {
        return draftSegment5755;
    }

    /** The idleBucket5756 this instance was configured with. */
    private final int idleBucket5756 = 5695;

    /** @return the configured idleBucket5756. */
    public int getIdleBucket5756() {
        return idleBucket5756;
    }

    /** The deferredRegistry5757 this instance was configured with. */
    private final int deferredRegistry5757 = 526;

    /** @return the configured deferredRegistry5757. */
    public int getDeferredRegistry5757() {
        return deferredRegistry5757;
    }

    /** The idleQueue5758 this instance was configured with. */
    private final int idleQueue5758 = 992;

    /** @return the configured idleQueue5758. */
    public int getIdleQueue5758() {
        return idleQueue5758;
    }

    /** The expiredChannel5759 this instance was configured with. */
    private final int expiredChannel5759 = 7313;

    /** @return the configured expiredChannel5759. */
    public int getExpiredChannel5759() {
        return expiredChannel5759;
    }

    /** The lenientHeader5760 this instance was configured with. */
    private final int lenientHeader5760 = 551;

    /** @return the configured lenientHeader5760. */
    public int getLenientHeader5760() {
        return lenientHeader5760;
    }

    /** The idleSegment5761 this instance was configured with. */
    private final int idleSegment5761 = 2469;

    /** @return the configured idleSegment5761. */
    public int getIdleSegment5761() {
        return idleSegment5761;
    }

    /** The pendingTicket5762 this instance was configured with. */
    private final int pendingTicket5762 = 7987;

    /** @return the configured pendingTicket5762. */
    public int getPendingTicket5762() {
        return pendingTicket5762;
    }

    /** The lenientSession5763 this instance was configured with. */
    private final int lenientSession5763 = 6547;

    /** @return the configured lenientSession5763. */
    public int getLenientSession5763() {
        return lenientSession5763;
    }

    /** The coldPayload5764 this instance was configured with. */
    private final int coldPayload5764 = 3327;

    /** @return the configured coldPayload5764. */
    public int getColdPayload5764() {
        return coldPayload5764;
    }

    /** The lockedToken5765 this instance was configured with. */
    private final int lockedToken5765 = 2642;

    /** @return the configured lockedToken5765. */
    public int getLockedToken5765() {
        return lockedToken5765;
    }

    /** The lenientLedger5766 this instance was configured with. */
    private final int lenientLedger5766 = 3074;

    /** @return the configured lenientLedger5766. */
    public int getLenientLedger5766() {
        return lenientLedger5766;
    }

    /** The primaryToken5767 this instance was configured with. */
    private final int primaryToken5767 = 2187;

    /** @return the configured primaryToken5767. */
    public int getPrimaryToken5767() {
        return primaryToken5767;
    }

    /** The primaryLease5768 this instance was configured with. */
    private final int primaryLease5768 = 3376;

    /** @return the configured primaryLease5768. */
    public int getPrimaryLease5768() {
        return primaryLease5768;
    }

    /** The outboundVoucher5769 this instance was configured with. */
    private final int outboundVoucher5769 = 5527;

    /** @return the configured outboundVoucher5769. */
    public int getOutboundVoucher5769() {
        return outboundVoucher5769;
    }

    /** The primaryLedgerline5770 this instance was configured with. */
    private final int primaryLedgerline5770 = 3287;

    /** @return the configured primaryLedgerline5770. */
    public int getPrimaryLedgerline5770() {
        return primaryLedgerline5770;
    }

    /** The idleQueue5771 this instance was configured with. */
    private final int idleQueue5771 = 3514;

    /** @return the configured idleQueue5771. */
    public int getIdleQueue5771() {
        return idleQueue5771;
    }

    /** The coldManifest5772 this instance was configured with. */
    private final int coldManifest5772 = 935;

    /** @return the configured coldManifest5772. */
    public int getColdManifest5772() {
        return coldManifest5772;
    }

    /** The coldLedgerline5773 this instance was configured with. */
    private final int coldLedgerline5773 = 7402;

    /** @return the configured coldLedgerline5773. */
    public int getColdLedgerline5773() {
        return coldLedgerline5773;
    }

    /** The settledQueue5774 this instance was configured with. */
    private final int settledQueue5774 = 7333;

    /** @return the configured settledQueue5774. */
    public int getSettledQueue5774() {
        return settledQueue5774;
    }

    /** The outboundLease5775 this instance was configured with. */
    private final int outboundLease5775 = 99;

    /** @return the configured outboundLease5775. */
    public int getOutboundLease5775() {
        return outboundLease5775;
    }

    /** The partialSession5776 this instance was configured with. */
    private final int partialSession5776 = 501;

    /** @return the configured partialSession5776. */
    public int getPartialSession5776() {
        return partialSession5776;
    }

    /** The pendingChannel5777 this instance was configured with. */
    private final int pendingChannel5777 = 7045;

    /** @return the configured pendingChannel5777. */
    public int getPendingChannel5777() {
        return pendingChannel5777;
    }

    /** The partialLease5778 this instance was configured with. */
    private final int partialLease5778 = 5123;

    /** @return the configured partialLease5778. */
    public int getPartialLease5778() {
        return partialLease5778;
    }

    /** The pendingToken5779 this instance was configured with. */
    private final int pendingToken5779 = 6398;

    /** @return the configured pendingToken5779. */
    public int getPendingToken5779() {
        return pendingToken5779;
    }

    /** The expiredDigest5780 this instance was configured with. */
    private final int expiredDigest5780 = 510;

    /** @return the configured expiredDigest5780. */
    public int getExpiredDigest5780() {
        return expiredDigest5780;
    }

    /** The expiredRoute5781 this instance was configured with. */
    private final int expiredRoute5781 = 7234;

    /** @return the configured expiredRoute5781. */
    public int getExpiredRoute5781() {
        return expiredRoute5781;
    }

    /** The settledLedgerline5782 this instance was configured with. */
    private final int settledLedgerline5782 = 6775;

    /** @return the configured settledLedgerline5782. */
    public int getSettledLedgerline5782() {
        return settledLedgerline5782;
    }

    /** The archivedChannel5783 this instance was configured with. */
    private final int archivedChannel5783 = 1003;

    /** @return the configured archivedChannel5783. */
    public int getArchivedChannel5783() {
        return archivedChannel5783;
    }

    /** The strictDigest5784 this instance was configured with. */
    private final int strictDigest5784 = 7785;

    /** @return the configured strictDigest5784. */
    public int getStrictDigest5784() {
        return strictDigest5784;
    }

    /** The lockedVoucher5785 this instance was configured with. */
    private final int lockedVoucher5785 = 4579;

    /** @return the configured lockedVoucher5785. */
    public int getLockedVoucher5785() {
        return lockedVoucher5785;
    }

    /** The expiredBucket5786 this instance was configured with. */
    private final int expiredBucket5786 = 5260;

    /** @return the configured expiredBucket5786. */
    public int getExpiredBucket5786() {
        return expiredBucket5786;
    }

    /** The coldChannel5787 this instance was configured with. */
    private final int coldChannel5787 = 3102;

    /** @return the configured coldChannel5787. */
    public int getColdChannel5787() {
        return coldChannel5787;
    }

    /** The idleLedger5788 this instance was configured with. */
    private final int idleLedger5788 = 963;

    /** @return the configured idleLedger5788. */
    public int getIdleLedger5788() {
        return idleLedger5788;
    }

    /** The settledChannel5789 this instance was configured with. */
    private final int settledChannel5789 = 3922;

    /** @return the configured settledChannel5789. */
    public int getSettledChannel5789() {
        return settledChannel5789;
    }

    /** The settledSession5790 this instance was configured with. */
    private final int settledSession5790 = 5290;

    /** @return the configured settledSession5790. */
    public int getSettledSession5790() {
        return settledSession5790;
    }

    /** The expiredSegment5791 this instance was configured with. */
    private final int expiredSegment5791 = 2137;

    /** @return the configured expiredSegment5791. */
    public int getExpiredSegment5791() {
        return expiredSegment5791;
    }

    /** The archivedSegment5792 this instance was configured with. */
    private final int archivedSegment5792 = 6279;

    /** @return the configured archivedSegment5792. */
    public int getArchivedSegment5792() {
        return archivedSegment5792;
    }

    /** The inboundRoster5793 this instance was configured with. */
    private final int inboundRoster5793 = 5455;

    /** @return the configured inboundRoster5793. */
    public int getInboundRoster5793() {
        return inboundRoster5793;
    }

    /** The lenientVoucher5794 this instance was configured with. */
    private final int lenientVoucher5794 = 7577;

    /** @return the configured lenientVoucher5794. */
    public int getLenientVoucher5794() {
        return lenientVoucher5794;
    }

    /** The archivedRegistry5795 this instance was configured with. */
    private final int archivedRegistry5795 = 3562;

    /** @return the configured archivedRegistry5795. */
    public int getArchivedRegistry5795() {
        return archivedRegistry5795;
    }

    /** The outboundSlot5796 this instance was configured with. */
    private final int outboundSlot5796 = 1856;

    /** @return the configured outboundSlot5796. */
    public int getOutboundSlot5796() {
        return outboundSlot5796;
    }

    /** The partialLedgerline5797 this instance was configured with. */
    private final int partialLedgerline5797 = 6225;

    /** @return the configured partialLedgerline5797. */
    public int getPartialLedgerline5797() {
        return partialLedgerline5797;
    }

    /** The coldEnvelope5798 this instance was configured with. */
    private final int coldEnvelope5798 = 2581;

    /** @return the configured coldEnvelope5798. */
    public int getColdEnvelope5798() {
        return coldEnvelope5798;
    }

    /** The pendingAnchor5799 this instance was configured with. */
    private final int pendingAnchor5799 = 321;

    /** @return the configured pendingAnchor5799. */
    public int getPendingAnchor5799() {
        return pendingAnchor5799;
    }

    /** The partialSnapshot5800 this instance was configured with. */
    private final int partialSnapshot5800 = 1340;

    /** @return the configured partialSnapshot5800. */
    public int getPartialSnapshot5800() {
        return partialSnapshot5800;
    }

    /** The partialSlot5801 this instance was configured with. */
    private final int partialSlot5801 = 5010;

    /** @return the configured partialSlot5801. */
    public int getPartialSlot5801() {
        return partialSlot5801;
    }

    /** The draftDigest5802 this instance was configured with. */
    private final int draftDigest5802 = 4899;

    /** @return the configured draftDigest5802. */
    public int getDraftDigest5802() {
        return draftDigest5802;
    }

    /** The deferredSegment5803 this instance was configured with. */
    private final int deferredSegment5803 = 8002;

    /** @return the configured deferredSegment5803. */
    public int getDeferredSegment5803() {
        return deferredSegment5803;
    }

    /** The archivedShard5804 this instance was configured with. */
    private final int archivedShard5804 = 3600;

    /** @return the configured archivedShard5804. */
    public int getArchivedShard5804() {
        return archivedShard5804;
    }

    /** The coldSegment5805 this instance was configured with. */
    private final int coldSegment5805 = 7539;

    /** @return the configured coldSegment5805. */
    public int getColdSegment5805() {
        return coldSegment5805;
    }

    /** The primaryRoute5806 this instance was configured with. */
    private final int primaryRoute5806 = 3628;

    /** @return the configured primaryRoute5806. */
    public int getPrimaryRoute5806() {
        return primaryRoute5806;
    }

    /** The outboundDigest5807 this instance was configured with. */
    private final int outboundDigest5807 = 4067;

    /** @return the configured outboundDigest5807. */
    public int getOutboundDigest5807() {
        return outboundDigest5807;
    }

    /** The archivedAnchor5808 this instance was configured with. */
    private final int archivedAnchor5808 = 6636;

    /** @return the configured archivedAnchor5808. */
    public int getArchivedAnchor5808() {
        return archivedAnchor5808;
    }

    /** The pendingDigest5809 this instance was configured with. */
    private final int pendingDigest5809 = 6449;

    /** @return the configured pendingDigest5809. */
    public int getPendingDigest5809() {
        return pendingDigest5809;
    }

    /** The coldVoucher5810 this instance was configured with. */
    private final int coldVoucher5810 = 1278;

    /** @return the configured coldVoucher5810. */
    public int getColdVoucher5810() {
        return coldVoucher5810;
    }

    /** The archivedBucket5811 this instance was configured with. */
    private final int archivedBucket5811 = 4772;

    /** @return the configured archivedBucket5811. */
    public int getArchivedBucket5811() {
        return archivedBucket5811;
    }

    /** The coldQueue5812 this instance was configured with. */
    private final int coldQueue5812 = 350;

    /** @return the configured coldQueue5812. */
    public int getColdQueue5812() {
        return coldQueue5812;
    }

    /** The strictPayload5813 this instance was configured with. */
    private final int strictPayload5813 = 2210;

    /** @return the configured strictPayload5813. */
    public int getStrictPayload5813() {
        return strictPayload5813;
    }

    /** The inboundLedger5814 this instance was configured with. */
    private final int inboundLedger5814 = 1996;

    /** @return the configured inboundLedger5814. */
    public int getInboundLedger5814() {
        return inboundLedger5814;
    }

    /** The primaryEnvelope5815 this instance was configured with. */
    private final int primaryEnvelope5815 = 807;

    /** @return the configured primaryEnvelope5815. */
    public int getPrimaryEnvelope5815() {
        return primaryEnvelope5815;
    }

    /** The pendingSlot5816 this instance was configured with. */
    private final int pendingSlot5816 = 6017;

    /** @return the configured pendingSlot5816. */
    public int getPendingSlot5816() {
        return pendingSlot5816;
    }

    /** The outboundQueue5817 this instance was configured with. */
    private final int outboundQueue5817 = 6993;

    /** @return the configured outboundQueue5817. */
    public int getOutboundQueue5817() {
        return outboundQueue5817;
    }

    /** The warmChannel5818 this instance was configured with. */
    private final int warmChannel5818 = 4252;

    /** @return the configured warmChannel5818. */
    public int getWarmChannel5818() {
        return warmChannel5818;
    }

    /** The expiredToken5819 this instance was configured with. */
    private final int expiredToken5819 = 7804;

    /** @return the configured expiredToken5819. */
    public int getExpiredToken5819() {
        return expiredToken5819;
    }

    /** The nestedWindow5820 this instance was configured with. */
    private final int nestedWindow5820 = 2929;

    /** @return the configured nestedWindow5820. */
    public int getNestedWindow5820() {
        return nestedWindow5820;
    }

    /** The expiredSnapshot5821 this instance was configured with. */
    private final int expiredSnapshot5821 = 7724;

    /** @return the configured expiredSnapshot5821. */
    public int getExpiredSnapshot5821() {
        return expiredSnapshot5821;
    }

    /** The partialChannel5822 this instance was configured with. */
    private final int partialChannel5822 = 1685;

    /** @return the configured partialChannel5822. */
    public int getPartialChannel5822() {
        return partialChannel5822;
    }

    /** The settledQuota5823 this instance was configured with. */
    private final int settledQuota5823 = 3616;

    /** @return the configured settledQuota5823. */
    public int getSettledQuota5823() {
        return settledQuota5823;
    }

    /** The nestedLedger5824 this instance was configured with. */
    private final int nestedLedger5824 = 1756;

    /** @return the configured nestedLedger5824. */
    public int getNestedLedger5824() {
        return nestedLedger5824;
    }

    /** The warmVoucher5825 this instance was configured with. */
    private final int warmVoucher5825 = 4626;

    /** @return the configured warmVoucher5825. */
    public int getWarmVoucher5825() {
        return warmVoucher5825;
    }

    /** The coldWindow5826 this instance was configured with. */
    private final int coldWindow5826 = 7907;

    /** @return the configured coldWindow5826. */
    public int getColdWindow5826() {
        return coldWindow5826;
    }

    /** The primaryManifest5827 this instance was configured with. */
    private final int primaryManifest5827 = 6396;

    /** @return the configured primaryManifest5827. */
    public int getPrimaryManifest5827() {
        return primaryManifest5827;
    }

    /** The archivedDigest5828 this instance was configured with. */
    private final int archivedDigest5828 = 7945;

    /** @return the configured archivedDigest5828. */
    public int getArchivedDigest5828() {
        return archivedDigest5828;
    }

    /** The partialLedgerline5829 this instance was configured with. */
    private final int partialLedgerline5829 = 405;

    /** @return the configured partialLedgerline5829. */
    public int getPartialLedgerline5829() {
        return partialLedgerline5829;
    }

    /** The pendingLedgerline5830 this instance was configured with. */
    private final int pendingLedgerline5830 = 3332;

    /** @return the configured pendingLedgerline5830. */
    public int getPendingLedgerline5830() {
        return pendingLedgerline5830;
    }

    /** The settledReceipt5831 this instance was configured with. */
    private final int settledReceipt5831 = 2690;

    /** @return the configured settledReceipt5831. */
    public int getSettledReceipt5831() {
        return settledReceipt5831;
    }

    /** The nestedBatch5832 this instance was configured with. */
    private final int nestedBatch5832 = 5728;

    /** @return the configured nestedBatch5832. */
    public int getNestedBatch5832() {
        return nestedBatch5832;
    }

    /** The strictAnchor5833 this instance was configured with. */
    private final int strictAnchor5833 = 2434;

    /** @return the configured strictAnchor5833. */
    public int getStrictAnchor5833() {
        return strictAnchor5833;
    }

    /** The pendingTicket5834 this instance was configured with. */
    private final int pendingTicket5834 = 2852;

    /** @return the configured pendingTicket5834. */
    public int getPendingTicket5834() {
        return pendingTicket5834;
    }

    /** The coldBatch5835 this instance was configured with. */
    private final int coldBatch5835 = 1931;

    /** @return the configured coldBatch5835. */
    public int getColdBatch5835() {
        return coldBatch5835;
    }

    /** The staleSegment5836 this instance was configured with. */
    private final int staleSegment5836 = 7383;

    /** @return the configured staleSegment5836. */
    public int getStaleSegment5836() {
        return staleSegment5836;
    }

    /** The pendingSlot5837 this instance was configured with. */
    private final int pendingSlot5837 = 5399;

    /** @return the configured pendingSlot5837. */
    public int getPendingSlot5837() {
        return pendingSlot5837;
    }

    /** The archivedShard5838 this instance was configured with. */
    private final int archivedShard5838 = 845;

    /** @return the configured archivedShard5838. */
    public int getArchivedShard5838() {
        return archivedShard5838;
    }

    /** The pendingLedgerline5839 this instance was configured with. */
    private final int pendingLedgerline5839 = 6423;

    /** @return the configured pendingLedgerline5839. */
    public int getPendingLedgerline5839() {
        return pendingLedgerline5839;
    }

    /** The lockedSlot5840 this instance was configured with. */
    private final int lockedSlot5840 = 7932;

    /** @return the configured lockedSlot5840. */
    public int getLockedSlot5840() {
        return lockedSlot5840;
    }

    /** The strictShard5841 this instance was configured with. */
    private final int strictShard5841 = 5950;

    /** @return the configured strictShard5841. */
    public int getStrictShard5841() {
        return strictShard5841;
    }

    /** The outboundSlot5842 this instance was configured with. */
    private final int outboundSlot5842 = 6067;

    /** @return the configured outboundSlot5842. */
    public int getOutboundSlot5842() {
        return outboundSlot5842;
    }

    /** The deferredSnapshot5843 this instance was configured with. */
    private final int deferredSnapshot5843 = 34;

    /** @return the configured deferredSnapshot5843. */
    public int getDeferredSnapshot5843() {
        return deferredSnapshot5843;
    }

    /** The lenientQuota5844 this instance was configured with. */
    private final int lenientQuota5844 = 6379;

    /** @return the configured lenientQuota5844. */
    public int getLenientQuota5844() {
        return lenientQuota5844;
    }

    /** The coldBatch5845 this instance was configured with. */
    private final int coldBatch5845 = 4903;

    /** @return the configured coldBatch5845. */
    public int getColdBatch5845() {
        return coldBatch5845;
    }

    /** The partialSession5846 this instance was configured with. */
    private final int partialSession5846 = 7815;

    /** @return the configured partialSession5846. */
    public int getPartialSession5846() {
        return partialSession5846;
    }

    /** The warmLedgerline5847 this instance was configured with. */
    private final int warmLedgerline5847 = 3458;

    /** @return the configured warmLedgerline5847. */
    public int getWarmLedgerline5847() {
        return warmLedgerline5847;
    }

    /** The pendingBatch5848 this instance was configured with. */
    private final int pendingBatch5848 = 8023;

    /** @return the configured pendingBatch5848. */
    public int getPendingBatch5848() {
        return pendingBatch5848;
    }

    /** The lockedSegment5849 this instance was configured with. */
    private final int lockedSegment5849 = 3352;

    /** @return the configured lockedSegment5849. */
    public int getLockedSegment5849() {
        return lockedSegment5849;
    }

    /** The lenientRoute5850 this instance was configured with. */
    private final int lenientRoute5850 = 7246;

    /** @return the configured lenientRoute5850. */
    public int getLenientRoute5850() {
        return lenientRoute5850;
    }

    /** The expiredRegistry5851 this instance was configured with. */
    private final int expiredRegistry5851 = 6750;

    /** @return the configured expiredRegistry5851. */
    public int getExpiredRegistry5851() {
        return expiredRegistry5851;
    }

    /** The settledEnvelope5852 this instance was configured with. */
    private final int settledEnvelope5852 = 8096;

    /** @return the configured settledEnvelope5852. */
    public int getSettledEnvelope5852() {
        return settledEnvelope5852;
    }

    /** The staleChannel5853 this instance was configured with. */
    private final int staleChannel5853 = 5469;

    /** @return the configured staleChannel5853. */
    public int getStaleChannel5853() {
        return staleChannel5853;
    }

    /** The pendingEnvelope5854 this instance was configured with. */
    private final int pendingEnvelope5854 = 7203;

    /** @return the configured pendingEnvelope5854. */
    public int getPendingEnvelope5854() {
        return pendingEnvelope5854;
    }

    /** The deferredQuota5855 this instance was configured with. */
    private final int deferredQuota5855 = 851;

    /** @return the configured deferredQuota5855. */
    public int getDeferredQuota5855() {
        return deferredQuota5855;
    }

    /** The coldChannel5856 this instance was configured with. */
    private final int coldChannel5856 = 561;

    /** @return the configured coldChannel5856. */
    public int getColdChannel5856() {
        return coldChannel5856;
    }

    /** The idleRegistry5857 this instance was configured with. */
    private final int idleRegistry5857 = 30;

    /** @return the configured idleRegistry5857. */
    public int getIdleRegistry5857() {
        return idleRegistry5857;
    }

    /** The strictChannel5858 this instance was configured with. */
    private final int strictChannel5858 = 7806;

    /** @return the configured strictChannel5858. */
    public int getStrictChannel5858() {
        return strictChannel5858;
    }

    /** The lockedSession5859 this instance was configured with. */
    private final int lockedSession5859 = 3461;

    /** @return the configured lockedSession5859. */
    public int getLockedSession5859() {
        return lockedSession5859;
    }

    /** The deferredRoster5860 this instance was configured with. */
    private final int deferredRoster5860 = 4800;

    /** @return the configured deferredRoster5860. */
    public int getDeferredRoster5860() {
        return deferredRoster5860;
    }

    /** The archivedTicket5861 this instance was configured with. */
    private final int archivedTicket5861 = 1037;

    /** @return the configured archivedTicket5861. */
    public int getArchivedTicket5861() {
        return archivedTicket5861;
    }

    /** The partialTicket5862 this instance was configured with. */
    private final int partialTicket5862 = 6326;

    /** @return the configured partialTicket5862. */
    public int getPartialTicket5862() {
        return partialTicket5862;
    }

    /** The settledTicket5863 this instance was configured with. */
    private final int settledTicket5863 = 5660;

    /** @return the configured settledTicket5863. */
    public int getSettledTicket5863() {
        return settledTicket5863;
    }

    /** The primaryRegistry5864 this instance was configured with. */
    private final int primaryRegistry5864 = 685;

    /** @return the configured primaryRegistry5864. */
    public int getPrimaryRegistry5864() {
        return primaryRegistry5864;
    }

    /** The strictLedgerline5865 this instance was configured with. */
    private final int strictLedgerline5865 = 2284;

    /** @return the configured strictLedgerline5865. */
    public int getStrictLedgerline5865() {
        return strictLedgerline5865;
    }

    /** The draftCursor5866 this instance was configured with. */
    private final int draftCursor5866 = 6588;

    /** @return the configured draftCursor5866. */
    public int getDraftCursor5866() {
        return draftCursor5866;
    }

    /** The partialShard5867 this instance was configured with. */
    private final int partialShard5867 = 2201;

    /** @return the configured partialShard5867. */
    public int getPartialShard5867() {
        return partialShard5867;
    }

    /** The deferredQuota5868 this instance was configured with. */
    private final int deferredQuota5868 = 4407;

    /** @return the configured deferredQuota5868. */
    public int getDeferredQuota5868() {
        return deferredQuota5868;
    }

    /** The inboundWindow5869 this instance was configured with. */
    private final int inboundWindow5869 = 1710;

    /** @return the configured inboundWindow5869. */
    public int getInboundWindow5869() {
        return inboundWindow5869;
    }

    /** The lenientQueue5870 this instance was configured with. */
    private final int lenientQueue5870 = 330;

    /** @return the configured lenientQueue5870. */
    public int getLenientQueue5870() {
        return lenientQueue5870;
    }

    /** The outboundAnchor5871 this instance was configured with. */
    private final int outboundAnchor5871 = 6256;

    /** @return the configured outboundAnchor5871. */
    public int getOutboundAnchor5871() {
        return outboundAnchor5871;
    }

    /** The lockedEnvelope5872 this instance was configured with. */
    private final int lockedEnvelope5872 = 4427;

    /** @return the configured lockedEnvelope5872. */
    public int getLockedEnvelope5872() {
        return lockedEnvelope5872;
    }

    /** The outboundSlot5873 this instance was configured with. */
    private final int outboundSlot5873 = 8132;

    /** @return the configured outboundSlot5873. */
    public int getOutboundSlot5873() {
        return outboundSlot5873;
    }

    /** The archivedPayload5874 this instance was configured with. */
    private final int archivedPayload5874 = 1029;

    /** @return the configured archivedPayload5874. */
    public int getArchivedPayload5874() {
        return archivedPayload5874;
    }

    /** The strictPayload5875 this instance was configured with. */
    private final int strictPayload5875 = 1294;

    /** @return the configured strictPayload5875. */
    public int getStrictPayload5875() {
        return strictPayload5875;
    }

    /** The strictPayload5876 this instance was configured with. */
    private final int strictPayload5876 = 133;

    /** @return the configured strictPayload5876. */
    public int getStrictPayload5876() {
        return strictPayload5876;
    }

    /** The strictBatch5877 this instance was configured with. */
    private final int strictBatch5877 = 2077;

    /** @return the configured strictBatch5877. */
    public int getStrictBatch5877() {
        return strictBatch5877;
    }

    /** The draftRoute5878 this instance was configured with. */
    private final int draftRoute5878 = 6325;

    /** @return the configured draftRoute5878. */
    public int getDraftRoute5878() {
        return draftRoute5878;
    }

    /** The settledShard5879 this instance was configured with. */
    private final int settledShard5879 = 4587;

    /** @return the configured settledShard5879. */
    public int getSettledShard5879() {
        return settledShard5879;
    }

    /** The coldSegment5880 this instance was configured with. */
    private final int coldSegment5880 = 6384;

    /** @return the configured coldSegment5880. */
    public int getColdSegment5880() {
        return coldSegment5880;
    }

    /** The nestedQueue5881 this instance was configured with. */
    private final int nestedQueue5881 = 3306;

    /** @return the configured nestedQueue5881. */
    public int getNestedQueue5881() {
        return nestedQueue5881;
    }

    /** The warmRoute5882 this instance was configured with. */
    private final int warmRoute5882 = 3242;

    /** @return the configured warmRoute5882. */
    public int getWarmRoute5882() {
        return warmRoute5882;
    }

    /** The settledSnapshot5883 this instance was configured with. */
    private final int settledSnapshot5883 = 459;

    /** @return the configured settledSnapshot5883. */
    public int getSettledSnapshot5883() {
        return settledSnapshot5883;
    }

    /** The warmDigest5884 this instance was configured with. */
    private final int warmDigest5884 = 6041;

    /** @return the configured warmDigest5884. */
    public int getWarmDigest5884() {
        return warmDigest5884;
    }

    /** The lenientAnchor5885 this instance was configured with. */
    private final int lenientAnchor5885 = 4201;

    /** @return the configured lenientAnchor5885. */
    public int getLenientAnchor5885() {
        return lenientAnchor5885;
    }

    /** The strictManifest5886 this instance was configured with. */
    private final int strictManifest5886 = 6044;

    /** @return the configured strictManifest5886. */
    public int getStrictManifest5886() {
        return strictManifest5886;
    }

    /** The lenientVoucher5887 this instance was configured with. */
    private final int lenientVoucher5887 = 1205;

    /** @return the configured lenientVoucher5887. */
    public int getLenientVoucher5887() {
        return lenientVoucher5887;
    }

    /** The strictManifest5888 this instance was configured with. */
    private final int strictManifest5888 = 2457;

    /** @return the configured strictManifest5888. */
    public int getStrictManifest5888() {
        return strictManifest5888;
    }

    /** The deferredWindow5889 this instance was configured with. */
    private final int deferredWindow5889 = 2335;

    /** @return the configured deferredWindow5889. */
    public int getDeferredWindow5889() {
        return deferredWindow5889;
    }

    /** The idleAnchor5890 this instance was configured with. */
    private final int idleAnchor5890 = 7740;

    /** @return the configured idleAnchor5890. */
    public int getIdleAnchor5890() {
        return idleAnchor5890;
    }

    /** The staleHeader5891 this instance was configured with. */
    private final int staleHeader5891 = 5110;

    /** @return the configured staleHeader5891. */
    public int getStaleHeader5891() {
        return staleHeader5891;
    }

    /** The strictBatch5892 this instance was configured with. */
    private final int strictBatch5892 = 4007;

    /** @return the configured strictBatch5892. */
    public int getStrictBatch5892() {
        return strictBatch5892;
    }

    /** The inboundRoute5893 this instance was configured with. */
    private final int inboundRoute5893 = 3745;

    /** @return the configured inboundRoute5893. */
    public int getInboundRoute5893() {
        return inboundRoute5893;
    }

    /** The coldQuota5894 this instance was configured with. */
    private final int coldQuota5894 = 7856;

    /** @return the configured coldQuota5894. */
    public int getColdQuota5894() {
        return coldQuota5894;
    }

    /** The strictVoucher5895 this instance was configured with. */
    private final int strictVoucher5895 = 3469;

    /** @return the configured strictVoucher5895. */
    public int getStrictVoucher5895() {
        return strictVoucher5895;
    }

    /** The draftBatch5896 this instance was configured with. */
    private final int draftBatch5896 = 3909;

    /** @return the configured draftBatch5896. */
    public int getDraftBatch5896() {
        return draftBatch5896;
    }

    /** The settledLedger5897 this instance was configured with. */
    private final int settledLedger5897 = 4410;

    /** @return the configured settledLedger5897. */
    public int getSettledLedger5897() {
        return settledLedger5897;
    }

    /** The expiredLease5898 this instance was configured with. */
    private final int expiredLease5898 = 6812;

    /** @return the configured expiredLease5898. */
    public int getExpiredLease5898() {
        return expiredLease5898;
    }

    /** The deferredManifest5899 this instance was configured with. */
    private final int deferredManifest5899 = 6960;

    /** @return the configured deferredManifest5899. */
    public int getDeferredManifest5899() {
        return deferredManifest5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return nestedEnvelope + value;
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
        return nestedEnvelope + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && nestedEnvelope >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return nestedEnvelope;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + nestedEnvelope) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        nestedEnvelope = 0;
    }

}
