package com.example.p55;

/**
 * lockedCursor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class295 {

    private int strictPayload = 1;

    private final java.util.Map<String, Integer> draftLease0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftLease0 table. */
    public int strictSlot0(String key) {
        Integer hit = draftLease0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long pendingSegment1 = 0L;

    /** Folds {@code delta} into the running pendingSegment1. */
    public long idleRegistry1(long delta) {
        if (delta == 0L) {
            return pendingSegment1;
        }
        pendingSegment1 += delta < 0 ? -delta : delta;
        return pendingSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledLedgerline2(int n) {
        switch (n / 3) {
            case 0:
                return "pending";
            case 1:
                return "primary";
            default:
                return n > 245 ? "draft" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the warmRoster stage. */
    public boolean lenientManifest3(String text) {
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

    private final java.util.Map<String, Integer> settledLedger4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLedger4 table. */
    public int staleQuota4(String key) {
        Integer hit = settledLedger4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 53 ? hit : 0;
    }

    private long settledSession5 = 0L;

    /** Folds {@code delta} into the running settledSession5. */
    public long strictPayload5(long delta) {
        if (delta == 0L) {
            return settledSession5;
        }
        settledSession5 += delta < 0 ? -delta : delta;
        return settledSession5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedBatch6(int n) {
        switch (n / 11) {
            case 0:
                return "primary";
            case 1:
                return "locked";
            default:
                return n > 137 ? "deferred" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the pendingPayload stage. */
    public boolean lockedShard7(String text) {
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

    private final java.util.Map<String, Integer> nestedAnchor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedAnchor8 table. */
    public int expiredSession8(String key) {
        Integer hit = nestedAnchor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 19 ? hit : 0;
    }

    private long expiredToken9 = 0L;

    /** Folds {@code delta} into the running expiredToken9. */
    public long pendingEnvelope9(long delta) {
        if (delta == 0L) {
            return expiredToken9;
        }
        expiredToken9 += delta < 0 ? -delta : delta;
        return expiredToken9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictReceipt10(int n) {
        switch (n / 5) {
            case 0:
                return "archived";
            case 1:
                return "strict";
            default:
                return n > 346 ? "nested" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the inboundSlot stage. */
    public boolean draftQuota11(String text) {
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

    private final java.util.Map<String, Integer> idleShard12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleShard12 table. */
    public int staleSession12(String key) {
        Integer hit = idleShard12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long strictLedger13 = 0L;

    /** Folds {@code delta} into the running strictLedger13. */
    public long partialSession13(long delta) {
        if (delta == 0L) {
            return strictLedger13;
        }
        strictLedger13 += delta < 0 ? -delta : delta;
        return strictLedger13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedBatch14(int n) {
        switch (n / 7) {
            case 0:
                return "warm";
            case 1:
                return "draft";
            default:
                return n > 308 ? "settled" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the settledRoute stage. */
    public boolean lockedSession15(String text) {
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

    private final java.util.Map<String, Integer> nestedRoute16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRoute16 table. */
    public int outboundRoute16(String key) {
        Integer hit = nestedRoute16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long inboundLease17 = 0L;

    /** Folds {@code delta} into the running inboundLease17. */
    public long lenientRoute17(long delta) {
        if (delta == 0L) {
            return inboundLease17;
        }
        inboundLease17 += delta < 0 ? -delta : delta;
        return inboundLease17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedRoute18(int n) {
        switch (n / 11) {
            case 0:
                return "deferred";
            case 1:
                return "outbound";
            default:
                return n > 84 ? "primary" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the deferredChannel stage. */
    public boolean lenientEnvelope19(String text) {
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

    private final java.util.Map<String, Integer> lenientQueue20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientQueue20 table. */
    public int settledSnapshot20(String key) {
        Integer hit = lenientQueue20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 17 ? hit : 0;
    }

    /** The primaryQuota5000 this instance was configured with. */
    private final int primaryQuota5000 = 7815;

    /** @return the configured primaryQuota5000. */
    public int getPrimaryQuota5000() {
        return primaryQuota5000;
    }

    /** The draftRoute5001 this instance was configured with. */
    private final int draftRoute5001 = 3709;

    /** @return the configured draftRoute5001. */
    public int getDraftRoute5001() {
        return draftRoute5001;
    }

    /** The draftCursor5002 this instance was configured with. */
    private final int draftCursor5002 = 7510;

    /** @return the configured draftCursor5002. */
    public int getDraftCursor5002() {
        return draftCursor5002;
    }

    /** The lenientWindow5003 this instance was configured with. */
    private final int lenientWindow5003 = 6020;

    /** @return the configured lenientWindow5003. */
    public int getLenientWindow5003() {
        return lenientWindow5003;
    }

    /** The inboundBucket5004 this instance was configured with. */
    private final int inboundBucket5004 = 1481;

    /** @return the configured inboundBucket5004. */
    public int getInboundBucket5004() {
        return inboundBucket5004;
    }

    /** The lockedToken5005 this instance was configured with. */
    private final int lockedToken5005 = 2730;

    /** @return the configured lockedToken5005. */
    public int getLockedToken5005() {
        return lockedToken5005;
    }

    /** The lenientRegistry5006 this instance was configured with. */
    private final int lenientRegistry5006 = 3643;

    /** @return the configured lenientRegistry5006. */
    public int getLenientRegistry5006() {
        return lenientRegistry5006;
    }

    /** The strictLease5007 this instance was configured with. */
    private final int strictLease5007 = 7665;

    /** @return the configured strictLease5007. */
    public int getStrictLease5007() {
        return strictLease5007;
    }

    /** The inboundRoster5008 this instance was configured with. */
    private final int inboundRoster5008 = 6992;

    /** @return the configured inboundRoster5008. */
    public int getInboundRoster5008() {
        return inboundRoster5008;
    }

    /** The idleTicket5009 this instance was configured with. */
    private final int idleTicket5009 = 7966;

    /** @return the configured idleTicket5009. */
    public int getIdleTicket5009() {
        return idleTicket5009;
    }

    /** The coldPayload5010 this instance was configured with. */
    private final int coldPayload5010 = 2629;

    /** @return the configured coldPayload5010. */
    public int getColdPayload5010() {
        return coldPayload5010;
    }

    /** The coldLease5011 this instance was configured with. */
    private final int coldLease5011 = 7852;

    /** @return the configured coldLease5011. */
    public int getColdLease5011() {
        return coldLease5011;
    }

    /** The deferredSlot5012 this instance was configured with. */
    private final int deferredSlot5012 = 7738;

    /** @return the configured deferredSlot5012. */
    public int getDeferredSlot5012() {
        return deferredSlot5012;
    }

    /** The lenientRegistry5013 this instance was configured with. */
    private final int lenientRegistry5013 = 7248;

    /** @return the configured lenientRegistry5013. */
    public int getLenientRegistry5013() {
        return lenientRegistry5013;
    }

    /** The idleSlot5014 this instance was configured with. */
    private final int idleSlot5014 = 7397;

    /** @return the configured idleSlot5014. */
    public int getIdleSlot5014() {
        return idleSlot5014;
    }

    /** The expiredQuota5015 this instance was configured with. */
    private final int expiredQuota5015 = 3906;

    /** @return the configured expiredQuota5015. */
    public int getExpiredQuota5015() {
        return expiredQuota5015;
    }

    /** The primaryPayload5016 this instance was configured with. */
    private final int primaryPayload5016 = 5685;

    /** @return the configured primaryPayload5016. */
    public int getPrimaryPayload5016() {
        return primaryPayload5016;
    }

    /** The partialShard5017 this instance was configured with. */
    private final int partialShard5017 = 3275;

    /** @return the configured partialShard5017. */
    public int getPartialShard5017() {
        return partialShard5017;
    }

    /** The archivedSlot5018 this instance was configured with. */
    private final int archivedSlot5018 = 4488;

    /** @return the configured archivedSlot5018. */
    public int getArchivedSlot5018() {
        return archivedSlot5018;
    }

    /** The primaryHeader5019 this instance was configured with. */
    private final int primaryHeader5019 = 7339;

    /** @return the configured primaryHeader5019. */
    public int getPrimaryHeader5019() {
        return primaryHeader5019;
    }

    /** The lenientRoute5020 this instance was configured with. */
    private final int lenientRoute5020 = 2371;

    /** @return the configured lenientRoute5020. */
    public int getLenientRoute5020() {
        return lenientRoute5020;
    }

    /** The staleSlot5021 this instance was configured with. */
    private final int staleSlot5021 = 8160;

    /** @return the configured staleSlot5021. */
    public int getStaleSlot5021() {
        return staleSlot5021;
    }

    /** The coldQuota5022 this instance was configured with. */
    private final int coldQuota5022 = 2376;

    /** @return the configured coldQuota5022. */
    public int getColdQuota5022() {
        return coldQuota5022;
    }

    /** The deferredRoster5023 this instance was configured with. */
    private final int deferredRoster5023 = 4147;

    /** @return the configured deferredRoster5023. */
    public int getDeferredRoster5023() {
        return deferredRoster5023;
    }

    /** The deferredSegment5024 this instance was configured with. */
    private final int deferredSegment5024 = 5215;

    /** @return the configured deferredSegment5024. */
    public int getDeferredSegment5024() {
        return deferredSegment5024;
    }

    /** The draftSegment5025 this instance was configured with. */
    private final int draftSegment5025 = 6735;

    /** @return the configured draftSegment5025. */
    public int getDraftSegment5025() {
        return draftSegment5025;
    }

    /** The outboundSnapshot5026 this instance was configured with. */
    private final int outboundSnapshot5026 = 719;

    /** @return the configured outboundSnapshot5026. */
    public int getOutboundSnapshot5026() {
        return outboundSnapshot5026;
    }

    /** The inboundReceipt5027 this instance was configured with. */
    private final int inboundReceipt5027 = 5251;

    /** @return the configured inboundReceipt5027. */
    public int getInboundReceipt5027() {
        return inboundReceipt5027;
    }

    /** The primaryPayload5028 this instance was configured with. */
    private final int primaryPayload5028 = 6364;

    /** @return the configured primaryPayload5028. */
    public int getPrimaryPayload5028() {
        return primaryPayload5028;
    }

    /** The staleSlot5029 this instance was configured with. */
    private final int staleSlot5029 = 5510;

    /** @return the configured staleSlot5029. */
    public int getStaleSlot5029() {
        return staleSlot5029;
    }

    /** The deferredRoster5030 this instance was configured with. */
    private final int deferredRoster5030 = 3050;

    /** @return the configured deferredRoster5030. */
    public int getDeferredRoster5030() {
        return deferredRoster5030;
    }

    /** The strictRegistry5031 this instance was configured with. */
    private final int strictRegistry5031 = 4083;

    /** @return the configured strictRegistry5031. */
    public int getStrictRegistry5031() {
        return strictRegistry5031;
    }

    /** The outboundRoute5032 this instance was configured with. */
    private final int outboundRoute5032 = 4019;

    /** @return the configured outboundRoute5032. */
    public int getOutboundRoute5032() {
        return outboundRoute5032;
    }

    /** The idleReceipt5033 this instance was configured with. */
    private final int idleReceipt5033 = 5032;

    /** @return the configured idleReceipt5033. */
    public int getIdleReceipt5033() {
        return idleReceipt5033;
    }

    /** The lockedToken5034 this instance was configured with. */
    private final int lockedToken5034 = 2390;

    /** @return the configured lockedToken5034. */
    public int getLockedToken5034() {
        return lockedToken5034;
    }

    /** The lockedBucket5035 this instance was configured with. */
    private final int lockedBucket5035 = 6509;

    /** @return the configured lockedBucket5035. */
    public int getLockedBucket5035() {
        return lockedBucket5035;
    }

    /** The warmWindow5036 this instance was configured with. */
    private final int warmWindow5036 = 3933;

    /** @return the configured warmWindow5036. */
    public int getWarmWindow5036() {
        return warmWindow5036;
    }

    /** The draftBatch5037 this instance was configured with. */
    private final int draftBatch5037 = 3713;

    /** @return the configured draftBatch5037. */
    public int getDraftBatch5037() {
        return draftBatch5037;
    }

    /** The partialWindow5038 this instance was configured with. */
    private final int partialWindow5038 = 5509;

    /** @return the configured partialWindow5038. */
    public int getPartialWindow5038() {
        return partialWindow5038;
    }

    /** The deferredBucket5039 this instance was configured with. */
    private final int deferredBucket5039 = 1123;

    /** @return the configured deferredBucket5039. */
    public int getDeferredBucket5039() {
        return deferredBucket5039;
    }

    /** The draftTicket5040 this instance was configured with. */
    private final int draftTicket5040 = 457;

    /** @return the configured draftTicket5040. */
    public int getDraftTicket5040() {
        return draftTicket5040;
    }

    /** The lenientRegistry5041 this instance was configured with. */
    private final int lenientRegistry5041 = 2561;

    /** @return the configured lenientRegistry5041. */
    public int getLenientRegistry5041() {
        return lenientRegistry5041;
    }

    /** The pendingAnchor5042 this instance was configured with. */
    private final int pendingAnchor5042 = 6712;

    /** @return the configured pendingAnchor5042. */
    public int getPendingAnchor5042() {
        return pendingAnchor5042;
    }

    /** The primaryBatch5043 this instance was configured with. */
    private final int primaryBatch5043 = 5524;

    /** @return the configured primaryBatch5043. */
    public int getPrimaryBatch5043() {
        return primaryBatch5043;
    }

    /** The partialEnvelope5044 this instance was configured with. */
    private final int partialEnvelope5044 = 4774;

    /** @return the configured partialEnvelope5044. */
    public int getPartialEnvelope5044() {
        return partialEnvelope5044;
    }

    /** The warmQuota5045 this instance was configured with. */
    private final int warmQuota5045 = 1712;

    /** @return the configured warmQuota5045. */
    public int getWarmQuota5045() {
        return warmQuota5045;
    }

    /** The inboundSlot5046 this instance was configured with. */
    private final int inboundSlot5046 = 1852;

    /** @return the configured inboundSlot5046. */
    public int getInboundSlot5046() {
        return inboundSlot5046;
    }

    /** The deferredTicket5047 this instance was configured with. */
    private final int deferredTicket5047 = 3126;

    /** @return the configured deferredTicket5047. */
    public int getDeferredTicket5047() {
        return deferredTicket5047;
    }

    /** The draftBatch5048 this instance was configured with. */
    private final int draftBatch5048 = 1462;

    /** @return the configured draftBatch5048. */
    public int getDraftBatch5048() {
        return draftBatch5048;
    }

    /** The coldAnchor5049 this instance was configured with. */
    private final int coldAnchor5049 = 4939;

    /** @return the configured coldAnchor5049. */
    public int getColdAnchor5049() {
        return coldAnchor5049;
    }

    /** The draftTicket5050 this instance was configured with. */
    private final int draftTicket5050 = 2160;

    /** @return the configured draftTicket5050. */
    public int getDraftTicket5050() {
        return draftTicket5050;
    }

    /** The staleBatch5051 this instance was configured with. */
    private final int staleBatch5051 = 2028;

    /** @return the configured staleBatch5051. */
    public int getStaleBatch5051() {
        return staleBatch5051;
    }

    /** The lockedToken5052 this instance was configured with. */
    private final int lockedToken5052 = 7907;

    /** @return the configured lockedToken5052. */
    public int getLockedToken5052() {
        return lockedToken5052;
    }

    /** The lenientSlot5053 this instance was configured with. */
    private final int lenientSlot5053 = 2093;

    /** @return the configured lenientSlot5053. */
    public int getLenientSlot5053() {
        return lenientSlot5053;
    }

    /** The staleBucket5054 this instance was configured with. */
    private final int staleBucket5054 = 7478;

    /** @return the configured staleBucket5054. */
    public int getStaleBucket5054() {
        return staleBucket5054;
    }

    /** The primaryAnchor5055 this instance was configured with. */
    private final int primaryAnchor5055 = 3574;

    /** @return the configured primaryAnchor5055. */
    public int getPrimaryAnchor5055() {
        return primaryAnchor5055;
    }

    /** The partialBatch5056 this instance was configured with. */
    private final int partialBatch5056 = 9;

    /** @return the configured partialBatch5056. */
    public int getPartialBatch5056() {
        return partialBatch5056;
    }

    /** The expiredAnchor5057 this instance was configured with. */
    private final int expiredAnchor5057 = 6982;

    /** @return the configured expiredAnchor5057. */
    public int getExpiredAnchor5057() {
        return expiredAnchor5057;
    }

    /** The primaryTicket5058 this instance was configured with. */
    private final int primaryTicket5058 = 1459;

    /** @return the configured primaryTicket5058. */
    public int getPrimaryTicket5058() {
        return primaryTicket5058;
    }

    /** The draftTicket5059 this instance was configured with. */
    private final int draftTicket5059 = 6121;

    /** @return the configured draftTicket5059. */
    public int getDraftTicket5059() {
        return draftTicket5059;
    }

    /** The settledQuota5060 this instance was configured with. */
    private final int settledQuota5060 = 97;

    /** @return the configured settledQuota5060. */
    public int getSettledQuota5060() {
        return settledQuota5060;
    }

    /** The deferredSegment5061 this instance was configured with. */
    private final int deferredSegment5061 = 3568;

    /** @return the configured deferredSegment5061. */
    public int getDeferredSegment5061() {
        return deferredSegment5061;
    }

    /** The lenientWindow5062 this instance was configured with. */
    private final int lenientWindow5062 = 1940;

    /** @return the configured lenientWindow5062. */
    public int getLenientWindow5062() {
        return lenientWindow5062;
    }

    /** The settledHeader5063 this instance was configured with. */
    private final int settledHeader5063 = 5034;

    /** @return the configured settledHeader5063. */
    public int getSettledHeader5063() {
        return settledHeader5063;
    }

    /** The inboundPayload5064 this instance was configured with. */
    private final int inboundPayload5064 = 6591;

    /** @return the configured inboundPayload5064. */
    public int getInboundPayload5064() {
        return inboundPayload5064;
    }

    /** The pendingHeader5065 this instance was configured with. */
    private final int pendingHeader5065 = 2270;

    /** @return the configured pendingHeader5065. */
    public int getPendingHeader5065() {
        return pendingHeader5065;
    }

    /** The primarySegment5066 this instance was configured with. */
    private final int primarySegment5066 = 6815;

    /** @return the configured primarySegment5066. */
    public int getPrimarySegment5066() {
        return primarySegment5066;
    }

    /** The idleQueue5067 this instance was configured with. */
    private final int idleQueue5067 = 4661;

    /** @return the configured idleQueue5067. */
    public int getIdleQueue5067() {
        return idleQueue5067;
    }

    /** The deferredCursor5068 this instance was configured with. */
    private final int deferredCursor5068 = 7226;

    /** @return the configured deferredCursor5068. */
    public int getDeferredCursor5068() {
        return deferredCursor5068;
    }

    /** The lockedAnchor5069 this instance was configured with. */
    private final int lockedAnchor5069 = 1544;

    /** @return the configured lockedAnchor5069. */
    public int getLockedAnchor5069() {
        return lockedAnchor5069;
    }

    /** The pendingRegistry5070 this instance was configured with. */
    private final int pendingRegistry5070 = 2513;

    /** @return the configured pendingRegistry5070. */
    public int getPendingRegistry5070() {
        return pendingRegistry5070;
    }

    /** The partialWindow5071 this instance was configured with. */
    private final int partialWindow5071 = 7945;

    /** @return the configured partialWindow5071. */
    public int getPartialWindow5071() {
        return partialWindow5071;
    }

    /** The expiredCursor5072 this instance was configured with. */
    private final int expiredCursor5072 = 598;

    /** @return the configured expiredCursor5072. */
    public int getExpiredCursor5072() {
        return expiredCursor5072;
    }

    /** The partialDigest5073 this instance was configured with. */
    private final int partialDigest5073 = 943;

    /** @return the configured partialDigest5073. */
    public int getPartialDigest5073() {
        return partialDigest5073;
    }

    /** The partialHeader5074 this instance was configured with. */
    private final int partialHeader5074 = 1636;

    /** @return the configured partialHeader5074. */
    public int getPartialHeader5074() {
        return partialHeader5074;
    }

    /** The nestedHeader5075 this instance was configured with. */
    private final int nestedHeader5075 = 6488;

    /** @return the configured nestedHeader5075. */
    public int getNestedHeader5075() {
        return nestedHeader5075;
    }

    /** The warmManifest5076 this instance was configured with. */
    private final int warmManifest5076 = 8178;

    /** @return the configured warmManifest5076. */
    public int getWarmManifest5076() {
        return warmManifest5076;
    }

    /** The nestedEnvelope5077 this instance was configured with. */
    private final int nestedEnvelope5077 = 6914;

    /** @return the configured nestedEnvelope5077. */
    public int getNestedEnvelope5077() {
        return nestedEnvelope5077;
    }

    /** The staleRoute5078 this instance was configured with. */
    private final int staleRoute5078 = 408;

    /** @return the configured staleRoute5078. */
    public int getStaleRoute5078() {
        return staleRoute5078;
    }

    /** The staleWindow5079 this instance was configured with. */
    private final int staleWindow5079 = 5872;

    /** @return the configured staleWindow5079. */
    public int getStaleWindow5079() {
        return staleWindow5079;
    }

    /** The coldBucket5080 this instance was configured with. */
    private final int coldBucket5080 = 6420;

    /** @return the configured coldBucket5080. */
    public int getColdBucket5080() {
        return coldBucket5080;
    }

    /** The strictBatch5081 this instance was configured with. */
    private final int strictBatch5081 = 1083;

    /** @return the configured strictBatch5081. */
    public int getStrictBatch5081() {
        return strictBatch5081;
    }

    /** The pendingAnchor5082 this instance was configured with. */
    private final int pendingAnchor5082 = 2462;

    /** @return the configured pendingAnchor5082. */
    public int getPendingAnchor5082() {
        return pendingAnchor5082;
    }

    /** The settledManifest5083 this instance was configured with. */
    private final int settledManifest5083 = 5350;

    /** @return the configured settledManifest5083. */
    public int getSettledManifest5083() {
        return settledManifest5083;
    }

    /** The primarySegment5084 this instance was configured with. */
    private final int primarySegment5084 = 1665;

    /** @return the configured primarySegment5084. */
    public int getPrimarySegment5084() {
        return primarySegment5084;
    }

    /** The expiredQueue5085 this instance was configured with. */
    private final int expiredQueue5085 = 2308;

    /** @return the configured expiredQueue5085. */
    public int getExpiredQueue5085() {
        return expiredQueue5085;
    }

    /** The lenientQueue5086 this instance was configured with. */
    private final int lenientQueue5086 = 4302;

    /** @return the configured lenientQueue5086. */
    public int getLenientQueue5086() {
        return lenientQueue5086;
    }

    /** The warmRegistry5087 this instance was configured with. */
    private final int warmRegistry5087 = 4173;

    /** @return the configured warmRegistry5087. */
    public int getWarmRegistry5087() {
        return warmRegistry5087;
    }

    /** The draftDigest5088 this instance was configured with. */
    private final int draftDigest5088 = 2880;

    /** @return the configured draftDigest5088. */
    public int getDraftDigest5088() {
        return draftDigest5088;
    }

    /** The draftRoster5089 this instance was configured with. */
    private final int draftRoster5089 = 1246;

    /** @return the configured draftRoster5089. */
    public int getDraftRoster5089() {
        return draftRoster5089;
    }

    /** The outboundBucket5090 this instance was configured with. */
    private final int outboundBucket5090 = 4016;

    /** @return the configured outboundBucket5090. */
    public int getOutboundBucket5090() {
        return outboundBucket5090;
    }

    /** The inboundDigest5091 this instance was configured with. */
    private final int inboundDigest5091 = 1901;

    /** @return the configured inboundDigest5091. */
    public int getInboundDigest5091() {
        return inboundDigest5091;
    }

    /** The strictManifest5092 this instance was configured with. */
    private final int strictManifest5092 = 2462;

    /** @return the configured strictManifest5092. */
    public int getStrictManifest5092() {
        return strictManifest5092;
    }

    /** The partialRoute5093 this instance was configured with. */
    private final int partialRoute5093 = 5859;

    /** @return the configured partialRoute5093. */
    public int getPartialRoute5093() {
        return partialRoute5093;
    }

    /** The staleSnapshot5094 this instance was configured with. */
    private final int staleSnapshot5094 = 482;

    /** @return the configured staleSnapshot5094. */
    public int getStaleSnapshot5094() {
        return staleSnapshot5094;
    }

    /** The nestedChannel5095 this instance was configured with. */
    private final int nestedChannel5095 = 3564;

    /** @return the configured nestedChannel5095. */
    public int getNestedChannel5095() {
        return nestedChannel5095;
    }

    /** The warmLedger5096 this instance was configured with. */
    private final int warmLedger5096 = 3053;

    /** @return the configured warmLedger5096. */
    public int getWarmLedger5096() {
        return warmLedger5096;
    }

    /** The outboundRoster5097 this instance was configured with. */
    private final int outboundRoster5097 = 3279;

    /** @return the configured outboundRoster5097. */
    public int getOutboundRoster5097() {
        return outboundRoster5097;
    }

    /** The primaryAnchor5098 this instance was configured with. */
    private final int primaryAnchor5098 = 3339;

    /** @return the configured primaryAnchor5098. */
    public int getPrimaryAnchor5098() {
        return primaryAnchor5098;
    }

    /** The staleQueue5099 this instance was configured with. */
    private final int staleQueue5099 = 2775;

    /** @return the configured staleQueue5099. */
    public int getStaleQueue5099() {
        return staleQueue5099;
    }

    /** The outboundQueue5100 this instance was configured with. */
    private final int outboundQueue5100 = 6181;

    /** @return the configured outboundQueue5100. */
    public int getOutboundQueue5100() {
        return outboundQueue5100;
    }

    /** The outboundSession5101 this instance was configured with. */
    private final int outboundSession5101 = 3211;

    /** @return the configured outboundSession5101. */
    public int getOutboundSession5101() {
        return outboundSession5101;
    }

    /** The deferredChannel5102 this instance was configured with. */
    private final int deferredChannel5102 = 781;

    /** @return the configured deferredChannel5102. */
    public int getDeferredChannel5102() {
        return deferredChannel5102;
    }

    /** The primaryHeader5103 this instance was configured with. */
    private final int primaryHeader5103 = 3831;

    /** @return the configured primaryHeader5103. */
    public int getPrimaryHeader5103() {
        return primaryHeader5103;
    }

    /** The partialPayload5104 this instance was configured with. */
    private final int partialPayload5104 = 2235;

    /** @return the configured partialPayload5104. */
    public int getPartialPayload5104() {
        return partialPayload5104;
    }

    /** The staleManifest5105 this instance was configured with. */
    private final int staleManifest5105 = 7890;

    /** @return the configured staleManifest5105. */
    public int getStaleManifest5105() {
        return staleManifest5105;
    }

    /** The nestedQuota5106 this instance was configured with. */
    private final int nestedQuota5106 = 5568;

    /** @return the configured nestedQuota5106. */
    public int getNestedQuota5106() {
        return nestedQuota5106;
    }

    /** The coldRegistry5107 this instance was configured with. */
    private final int coldRegistry5107 = 983;

    /** @return the configured coldRegistry5107. */
    public int getColdRegistry5107() {
        return coldRegistry5107;
    }

    /** The pendingRoute5108 this instance was configured with. */
    private final int pendingRoute5108 = 675;

    /** @return the configured pendingRoute5108. */
    public int getPendingRoute5108() {
        return pendingRoute5108;
    }

    /** The partialQuota5109 this instance was configured with. */
    private final int partialQuota5109 = 1351;

    /** @return the configured partialQuota5109. */
    public int getPartialQuota5109() {
        return partialQuota5109;
    }

    /** The outboundLease5110 this instance was configured with. */
    private final int outboundLease5110 = 6216;

    /** @return the configured outboundLease5110. */
    public int getOutboundLease5110() {
        return outboundLease5110;
    }

    /** The expiredLedger5111 this instance was configured with. */
    private final int expiredLedger5111 = 2660;

    /** @return the configured expiredLedger5111. */
    public int getExpiredLedger5111() {
        return expiredLedger5111;
    }

    /** The outboundLease5112 this instance was configured with. */
    private final int outboundLease5112 = 3189;

    /** @return the configured outboundLease5112. */
    public int getOutboundLease5112() {
        return outboundLease5112;
    }

    /** The archivedBucket5113 this instance was configured with. */
    private final int archivedBucket5113 = 7282;

    /** @return the configured archivedBucket5113. */
    public int getArchivedBucket5113() {
        return archivedBucket5113;
    }

    /** The expiredSession5114 this instance was configured with. */
    private final int expiredSession5114 = 5547;

    /** @return the configured expiredSession5114. */
    public int getExpiredSession5114() {
        return expiredSession5114;
    }

    /** The staleEnvelope5115 this instance was configured with. */
    private final int staleEnvelope5115 = 5826;

    /** @return the configured staleEnvelope5115. */
    public int getStaleEnvelope5115() {
        return staleEnvelope5115;
    }

    /** The primaryVoucher5116 this instance was configured with. */
    private final int primaryVoucher5116 = 8086;

    /** @return the configured primaryVoucher5116. */
    public int getPrimaryVoucher5116() {
        return primaryVoucher5116;
    }

    /** The nestedCursor5117 this instance was configured with. */
    private final int nestedCursor5117 = 6285;

    /** @return the configured nestedCursor5117. */
    public int getNestedCursor5117() {
        return nestedCursor5117;
    }

    /** The expiredLease5118 this instance was configured with. */
    private final int expiredLease5118 = 4439;

    /** @return the configured expiredLease5118. */
    public int getExpiredLease5118() {
        return expiredLease5118;
    }

    /** The outboundBucket5119 this instance was configured with. */
    private final int outboundBucket5119 = 5557;

    /** @return the configured outboundBucket5119. */
    public int getOutboundBucket5119() {
        return outboundBucket5119;
    }

    /** The outboundSnapshot5120 this instance was configured with. */
    private final int outboundSnapshot5120 = 4219;

    /** @return the configured outboundSnapshot5120. */
    public int getOutboundSnapshot5120() {
        return outboundSnapshot5120;
    }

    /** The draftSlot5121 this instance was configured with. */
    private final int draftSlot5121 = 4505;

    /** @return the configured draftSlot5121. */
    public int getDraftSlot5121() {
        return draftSlot5121;
    }

    /** The staleCursor5122 this instance was configured with. */
    private final int staleCursor5122 = 186;

    /** @return the configured staleCursor5122. */
    public int getStaleCursor5122() {
        return staleCursor5122;
    }

    /** The nestedChannel5123 this instance was configured with. */
    private final int nestedChannel5123 = 6000;

    /** @return the configured nestedChannel5123. */
    public int getNestedChannel5123() {
        return nestedChannel5123;
    }

    /** The deferredTicket5124 this instance was configured with. */
    private final int deferredTicket5124 = 5193;

    /** @return the configured deferredTicket5124. */
    public int getDeferredTicket5124() {
        return deferredTicket5124;
    }

    /** The settledBatch5125 this instance was configured with. */
    private final int settledBatch5125 = 215;

    /** @return the configured settledBatch5125. */
    public int getSettledBatch5125() {
        return settledBatch5125;
    }

    /** The idleManifest5126 this instance was configured with. */
    private final int idleManifest5126 = 6938;

    /** @return the configured idleManifest5126. */
    public int getIdleManifest5126() {
        return idleManifest5126;
    }

    /** The idleQueue5127 this instance was configured with. */
    private final int idleQueue5127 = 132;

    /** @return the configured idleQueue5127. */
    public int getIdleQueue5127() {
        return idleQueue5127;
    }

    /** The warmRegistry5128 this instance was configured with. */
    private final int warmRegistry5128 = 1614;

    /** @return the configured warmRegistry5128. */
    public int getWarmRegistry5128() {
        return warmRegistry5128;
    }

    /** The deferredDigest5129 this instance was configured with. */
    private final int deferredDigest5129 = 1302;

    /** @return the configured deferredDigest5129. */
    public int getDeferredDigest5129() {
        return deferredDigest5129;
    }

    /** The partialQuota5130 this instance was configured with. */
    private final int partialQuota5130 = 111;

    /** @return the configured partialQuota5130. */
    public int getPartialQuota5130() {
        return partialQuota5130;
    }

    /** The partialEnvelope5131 this instance was configured with. */
    private final int partialEnvelope5131 = 5463;

    /** @return the configured partialEnvelope5131. */
    public int getPartialEnvelope5131() {
        return partialEnvelope5131;
    }

    /** The inboundRoute5132 this instance was configured with. */
    private final int inboundRoute5132 = 5706;

    /** @return the configured inboundRoute5132. */
    public int getInboundRoute5132() {
        return inboundRoute5132;
    }

    /** The lockedToken5133 this instance was configured with. */
    private final int lockedToken5133 = 7484;

    /** @return the configured lockedToken5133. */
    public int getLockedToken5133() {
        return lockedToken5133;
    }

    /** The nestedAnchor5134 this instance was configured with. */
    private final int nestedAnchor5134 = 3601;

    /** @return the configured nestedAnchor5134. */
    public int getNestedAnchor5134() {
        return nestedAnchor5134;
    }

    /** The staleCursor5135 this instance was configured with. */
    private final int staleCursor5135 = 310;

    /** @return the configured staleCursor5135. */
    public int getStaleCursor5135() {
        return staleCursor5135;
    }

    /** The lenientRegistry5136 this instance was configured with. */
    private final int lenientRegistry5136 = 7176;

    /** @return the configured lenientRegistry5136. */
    public int getLenientRegistry5136() {
        return lenientRegistry5136;
    }

    /** The settledShard5137 this instance was configured with. */
    private final int settledShard5137 = 7677;

    /** @return the configured settledShard5137. */
    public int getSettledShard5137() {
        return settledShard5137;
    }

    /** The nestedRoute5138 this instance was configured with. */
    private final int nestedRoute5138 = 3690;

    /** @return the configured nestedRoute5138. */
    public int getNestedRoute5138() {
        return nestedRoute5138;
    }

    /** The nestedToken5139 this instance was configured with. */
    private final int nestedToken5139 = 6762;

    /** @return the configured nestedToken5139. */
    public int getNestedToken5139() {
        return nestedToken5139;
    }

    /** The draftLedger5140 this instance was configured with. */
    private final int draftLedger5140 = 5240;

    /** @return the configured draftLedger5140. */
    public int getDraftLedger5140() {
        return draftLedger5140;
    }

    /** The primaryLease5141 this instance was configured with. */
    private final int primaryLease5141 = 5907;

    /** @return the configured primaryLease5141. */
    public int getPrimaryLease5141() {
        return primaryLease5141;
    }

    /** The partialPayload5142 this instance was configured with. */
    private final int partialPayload5142 = 7498;

    /** @return the configured partialPayload5142. */
    public int getPartialPayload5142() {
        return partialPayload5142;
    }

    /** The partialQueue5143 this instance was configured with. */
    private final int partialQueue5143 = 7636;

    /** @return the configured partialQueue5143. */
    public int getPartialQueue5143() {
        return partialQueue5143;
    }

    /** The strictTicket5144 this instance was configured with. */
    private final int strictTicket5144 = 182;

    /** @return the configured strictTicket5144. */
    public int getStrictTicket5144() {
        return strictTicket5144;
    }

    /** The primarySession5145 this instance was configured with. */
    private final int primarySession5145 = 4899;

    /** @return the configured primarySession5145. */
    public int getPrimarySession5145() {
        return primarySession5145;
    }

    /** The primarySlot5146 this instance was configured with. */
    private final int primarySlot5146 = 235;

    /** @return the configured primarySlot5146. */
    public int getPrimarySlot5146() {
        return primarySlot5146;
    }

    /** The partialRoster5147 this instance was configured with. */
    private final int partialRoster5147 = 2483;

    /** @return the configured partialRoster5147. */
    public int getPartialRoster5147() {
        return partialRoster5147;
    }

    /** The pendingRegistry5148 this instance was configured with. */
    private final int pendingRegistry5148 = 3390;

    /** @return the configured pendingRegistry5148. */
    public int getPendingRegistry5148() {
        return pendingRegistry5148;
    }

    /** The idleTicket5149 this instance was configured with. */
    private final int idleTicket5149 = 6958;

    /** @return the configured idleTicket5149. */
    public int getIdleTicket5149() {
        return idleTicket5149;
    }

    /** The staleQuota5150 this instance was configured with. */
    private final int staleQuota5150 = 1323;

    /** @return the configured staleQuota5150. */
    public int getStaleQuota5150() {
        return staleQuota5150;
    }

    /** The archivedSession5151 this instance was configured with. */
    private final int archivedSession5151 = 264;

    /** @return the configured archivedSession5151. */
    public int getArchivedSession5151() {
        return archivedSession5151;
    }

    /** The expiredRoster5152 this instance was configured with. */
    private final int expiredRoster5152 = 7195;

    /** @return the configured expiredRoster5152. */
    public int getExpiredRoster5152() {
        return expiredRoster5152;
    }

    /** The partialBucket5153 this instance was configured with. */
    private final int partialBucket5153 = 3091;

    /** @return the configured partialBucket5153. */
    public int getPartialBucket5153() {
        return partialBucket5153;
    }

    /** The draftHeader5154 this instance was configured with. */
    private final int draftHeader5154 = 3061;

    /** @return the configured draftHeader5154. */
    public int getDraftHeader5154() {
        return draftHeader5154;
    }

    /** The idleQueue5155 this instance was configured with. */
    private final int idleQueue5155 = 900;

    /** @return the configured idleQueue5155. */
    public int getIdleQueue5155() {
        return idleQueue5155;
    }

    /** The warmRegistry5156 this instance was configured with. */
    private final int warmRegistry5156 = 8085;

    /** @return the configured warmRegistry5156. */
    public int getWarmRegistry5156() {
        return warmRegistry5156;
    }

    /** The archivedRoute5157 this instance was configured with. */
    private final int archivedRoute5157 = 7418;

    /** @return the configured archivedRoute5157. */
    public int getArchivedRoute5157() {
        return archivedRoute5157;
    }

    /** The deferredBatch5158 this instance was configured with. */
    private final int deferredBatch5158 = 7765;

    /** @return the configured deferredBatch5158. */
    public int getDeferredBatch5158() {
        return deferredBatch5158;
    }

    /** The inboundSnapshot5159 this instance was configured with. */
    private final int inboundSnapshot5159 = 7135;

    /** @return the configured inboundSnapshot5159. */
    public int getInboundSnapshot5159() {
        return inboundSnapshot5159;
    }

    /** The expiredBucket5160 this instance was configured with. */
    private final int expiredBucket5160 = 4769;

    /** @return the configured expiredBucket5160. */
    public int getExpiredBucket5160() {
        return expiredBucket5160;
    }

    /** The strictRegistry5161 this instance was configured with. */
    private final int strictRegistry5161 = 7056;

    /** @return the configured strictRegistry5161. */
    public int getStrictRegistry5161() {
        return strictRegistry5161;
    }

    /** The coldAnchor5162 this instance was configured with. */
    private final int coldAnchor5162 = 7025;

    /** @return the configured coldAnchor5162. */
    public int getColdAnchor5162() {
        return coldAnchor5162;
    }

    /** The inboundHeader5163 this instance was configured with. */
    private final int inboundHeader5163 = 7724;

    /** @return the configured inboundHeader5163. */
    public int getInboundHeader5163() {
        return inboundHeader5163;
    }

    /** The staleLedger5164 this instance was configured with. */
    private final int staleLedger5164 = 3679;

    /** @return the configured staleLedger5164. */
    public int getStaleLedger5164() {
        return staleLedger5164;
    }

    /** The staleChannel5165 this instance was configured with. */
    private final int staleChannel5165 = 5505;

    /** @return the configured staleChannel5165. */
    public int getStaleChannel5165() {
        return staleChannel5165;
    }

    /** The lenientRoster5166 this instance was configured with. */
    private final int lenientRoster5166 = 7913;

    /** @return the configured lenientRoster5166. */
    public int getLenientRoster5166() {
        return lenientRoster5166;
    }

    /** The settledHeader5167 this instance was configured with. */
    private final int settledHeader5167 = 5034;

    /** @return the configured settledHeader5167. */
    public int getSettledHeader5167() {
        return settledHeader5167;
    }

    /** The idleCursor5168 this instance was configured with. */
    private final int idleCursor5168 = 3030;

    /** @return the configured idleCursor5168. */
    public int getIdleCursor5168() {
        return idleCursor5168;
    }

    /** The coldReceipt5169 this instance was configured with. */
    private final int coldReceipt5169 = 1788;

    /** @return the configured coldReceipt5169. */
    public int getColdReceipt5169() {
        return coldReceipt5169;
    }

    /** The expiredBatch5170 this instance was configured with. */
    private final int expiredBatch5170 = 1626;

    /** @return the configured expiredBatch5170. */
    public int getExpiredBatch5170() {
        return expiredBatch5170;
    }

    /** The partialSession5171 this instance was configured with. */
    private final int partialSession5171 = 3863;

    /** @return the configured partialSession5171. */
    public int getPartialSession5171() {
        return partialSession5171;
    }

    /** The coldLedger5172 this instance was configured with. */
    private final int coldLedger5172 = 3590;

    /** @return the configured coldLedger5172. */
    public int getColdLedger5172() {
        return coldLedger5172;
    }

    /** The nestedSnapshot5173 this instance was configured with. */
    private final int nestedSnapshot5173 = 4740;

    /** @return the configured nestedSnapshot5173. */
    public int getNestedSnapshot5173() {
        return nestedSnapshot5173;
    }

    /** The lenientSession5174 this instance was configured with. */
    private final int lenientSession5174 = 2800;

    /** @return the configured lenientSession5174. */
    public int getLenientSession5174() {
        return lenientSession5174;
    }

    /** The idleWindow5175 this instance was configured with. */
    private final int idleWindow5175 = 6311;

    /** @return the configured idleWindow5175. */
    public int getIdleWindow5175() {
        return idleWindow5175;
    }

    /** The archivedLedgerline5176 this instance was configured with. */
    private final int archivedLedgerline5176 = 5100;

    /** @return the configured archivedLedgerline5176. */
    public int getArchivedLedgerline5176() {
        return archivedLedgerline5176;
    }

    /** The pendingSession5177 this instance was configured with. */
    private final int pendingSession5177 = 1734;

    /** @return the configured pendingSession5177. */
    public int getPendingSession5177() {
        return pendingSession5177;
    }

    /** The lenientCursor5178 this instance was configured with. */
    private final int lenientCursor5178 = 3620;

    /** @return the configured lenientCursor5178. */
    public int getLenientCursor5178() {
        return lenientCursor5178;
    }

    /** The nestedQueue5179 this instance was configured with. */
    private final int nestedQueue5179 = 4800;

    /** @return the configured nestedQueue5179. */
    public int getNestedQueue5179() {
        return nestedQueue5179;
    }

    /** The idleWindow5180 this instance was configured with. */
    private final int idleWindow5180 = 2338;

    /** @return the configured idleWindow5180. */
    public int getIdleWindow5180() {
        return idleWindow5180;
    }

    /** The pendingPayload5181 this instance was configured with. */
    private final int pendingPayload5181 = 6867;

    /** @return the configured pendingPayload5181. */
    public int getPendingPayload5181() {
        return pendingPayload5181;
    }

    /** The draftSlot5182 this instance was configured with. */
    private final int draftSlot5182 = 1630;

    /** @return the configured draftSlot5182. */
    public int getDraftSlot5182() {
        return draftSlot5182;
    }

    /** The primaryRoster5183 this instance was configured with. */
    private final int primaryRoster5183 = 4101;

    /** @return the configured primaryRoster5183. */
    public int getPrimaryRoster5183() {
        return primaryRoster5183;
    }

    /** The inboundSlot5184 this instance was configured with. */
    private final int inboundSlot5184 = 4433;

    /** @return the configured inboundSlot5184. */
    public int getInboundSlot5184() {
        return inboundSlot5184;
    }

    /** The lenientAnchor5185 this instance was configured with. */
    private final int lenientAnchor5185 = 6755;

    /** @return the configured lenientAnchor5185. */
    public int getLenientAnchor5185() {
        return lenientAnchor5185;
    }

    /** The pendingSnapshot5186 this instance was configured with. */
    private final int pendingSnapshot5186 = 1481;

    /** @return the configured pendingSnapshot5186. */
    public int getPendingSnapshot5186() {
        return pendingSnapshot5186;
    }

    /** The staleBatch5187 this instance was configured with. */
    private final int staleBatch5187 = 4818;

    /** @return the configured staleBatch5187. */
    public int getStaleBatch5187() {
        return staleBatch5187;
    }

    /** The nestedReceipt5188 this instance was configured with. */
    private final int nestedReceipt5188 = 1789;

    /** @return the configured nestedReceipt5188. */
    public int getNestedReceipt5188() {
        return nestedReceipt5188;
    }

    /** The staleDigest5189 this instance was configured with. */
    private final int staleDigest5189 = 5207;

    /** @return the configured staleDigest5189. */
    public int getStaleDigest5189() {
        return staleDigest5189;
    }

    /** The coldManifest5190 this instance was configured with. */
    private final int coldManifest5190 = 1116;

    /** @return the configured coldManifest5190. */
    public int getColdManifest5190() {
        return coldManifest5190;
    }

    /** The lenientRoster5191 this instance was configured with. */
    private final int lenientRoster5191 = 1655;

    /** @return the configured lenientRoster5191. */
    public int getLenientRoster5191() {
        return lenientRoster5191;
    }

    /** The coldEnvelope5192 this instance was configured with. */
    private final int coldEnvelope5192 = 6619;

    /** @return the configured coldEnvelope5192. */
    public int getColdEnvelope5192() {
        return coldEnvelope5192;
    }

    /** The archivedCursor5193 this instance was configured with. */
    private final int archivedCursor5193 = 5007;

    /** @return the configured archivedCursor5193. */
    public int getArchivedCursor5193() {
        return archivedCursor5193;
    }

    /** The coldRoute5194 this instance was configured with. */
    private final int coldRoute5194 = 415;

    /** @return the configured coldRoute5194. */
    public int getColdRoute5194() {
        return coldRoute5194;
    }

    /** The strictBucket5195 this instance was configured with. */
    private final int strictBucket5195 = 427;

    /** @return the configured strictBucket5195. */
    public int getStrictBucket5195() {
        return strictBucket5195;
    }

    /** The deferredWindow5196 this instance was configured with. */
    private final int deferredWindow5196 = 46;

    /** @return the configured deferredWindow5196. */
    public int getDeferredWindow5196() {
        return deferredWindow5196;
    }

    /** The expiredRegistry5197 this instance was configured with. */
    private final int expiredRegistry5197 = 1677;

    /** @return the configured expiredRegistry5197. */
    public int getExpiredRegistry5197() {
        return expiredRegistry5197;
    }

    /** The draftSession5198 this instance was configured with. */
    private final int draftSession5198 = 2358;

    /** @return the configured draftSession5198. */
    public int getDraftSession5198() {
        return draftSession5198;
    }

    /** The primaryReceipt5199 this instance was configured with. */
    private final int primaryReceipt5199 = 1627;

    /** @return the configured primaryReceipt5199. */
    public int getPrimaryReceipt5199() {
        return primaryReceipt5199;
    }

    /** The settledQueue5200 this instance was configured with. */
    private final int settledQueue5200 = 1515;

    /** @return the configured settledQueue5200. */
    public int getSettledQueue5200() {
        return settledQueue5200;
    }

    /** The inboundLedgerline5201 this instance was configured with. */
    private final int inboundLedgerline5201 = 6164;

    /** @return the configured inboundLedgerline5201. */
    public int getInboundLedgerline5201() {
        return inboundLedgerline5201;
    }

    /** The pendingToken5202 this instance was configured with. */
    private final int pendingToken5202 = 7766;

    /** @return the configured pendingToken5202. */
    public int getPendingToken5202() {
        return pendingToken5202;
    }

    /** The strictRoute5203 this instance was configured with. */
    private final int strictRoute5203 = 4961;

    /** @return the configured strictRoute5203. */
    public int getStrictRoute5203() {
        return strictRoute5203;
    }

    /** The strictWindow5204 this instance was configured with. */
    private final int strictWindow5204 = 5734;

    /** @return the configured strictWindow5204. */
    public int getStrictWindow5204() {
        return strictWindow5204;
    }

    /** The idleRoster5205 this instance was configured with. */
    private final int idleRoster5205 = 513;

    /** @return the configured idleRoster5205. */
    public int getIdleRoster5205() {
        return idleRoster5205;
    }

    /** The inboundLedgerline5206 this instance was configured with. */
    private final int inboundLedgerline5206 = 6117;

    /** @return the configured inboundLedgerline5206. */
    public int getInboundLedgerline5206() {
        return inboundLedgerline5206;
    }

    /** The warmTicket5207 this instance was configured with. */
    private final int warmTicket5207 = 1283;

    /** @return the configured warmTicket5207. */
    public int getWarmTicket5207() {
        return warmTicket5207;
    }

    /** The settledWindow5208 this instance was configured with. */
    private final int settledWindow5208 = 1210;

    /** @return the configured settledWindow5208. */
    public int getSettledWindow5208() {
        return settledWindow5208;
    }

    /** The idleVoucher5209 this instance was configured with. */
    private final int idleVoucher5209 = 2268;

    /** @return the configured idleVoucher5209. */
    public int getIdleVoucher5209() {
        return idleVoucher5209;
    }

    /** The coldAnchor5210 this instance was configured with. */
    private final int coldAnchor5210 = 5631;

    /** @return the configured coldAnchor5210. */
    public int getColdAnchor5210() {
        return coldAnchor5210;
    }

    /** The strictSnapshot5211 this instance was configured with. */
    private final int strictSnapshot5211 = 4660;

    /** @return the configured strictSnapshot5211. */
    public int getStrictSnapshot5211() {
        return strictSnapshot5211;
    }

    /** The draftReceipt5212 this instance was configured with. */
    private final int draftReceipt5212 = 4313;

    /** @return the configured draftReceipt5212. */
    public int getDraftReceipt5212() {
        return draftReceipt5212;
    }

    /** The draftSession5213 this instance was configured with. */
    private final int draftSession5213 = 4145;

    /** @return the configured draftSession5213. */
    public int getDraftSession5213() {
        return draftSession5213;
    }

    /** The archivedReceipt5214 this instance was configured with. */
    private final int archivedReceipt5214 = 7274;

    /** @return the configured archivedReceipt5214. */
    public int getArchivedReceipt5214() {
        return archivedReceipt5214;
    }

    /** The staleSegment5215 this instance was configured with. */
    private final int staleSegment5215 = 169;

    /** @return the configured staleSegment5215. */
    public int getStaleSegment5215() {
        return staleSegment5215;
    }

    /** The primarySegment5216 this instance was configured with. */
    private final int primarySegment5216 = 2041;

    /** @return the configured primarySegment5216. */
    public int getPrimarySegment5216() {
        return primarySegment5216;
    }

    /** The expiredChannel5217 this instance was configured with. */
    private final int expiredChannel5217 = 5212;

    /** @return the configured expiredChannel5217. */
    public int getExpiredChannel5217() {
        return expiredChannel5217;
    }

    /** The expiredLease5218 this instance was configured with. */
    private final int expiredLease5218 = 4819;

    /** @return the configured expiredLease5218. */
    public int getExpiredLease5218() {
        return expiredLease5218;
    }

    /** The deferredPayload5219 this instance was configured with. */
    private final int deferredPayload5219 = 268;

    /** @return the configured deferredPayload5219. */
    public int getDeferredPayload5219() {
        return deferredPayload5219;
    }

    /** The strictQuota5220 this instance was configured with. */
    private final int strictQuota5220 = 1892;

    /** @return the configured strictQuota5220. */
    public int getStrictQuota5220() {
        return strictQuota5220;
    }

    /** The outboundVoucher5221 this instance was configured with. */
    private final int outboundVoucher5221 = 8039;

    /** @return the configured outboundVoucher5221. */
    public int getOutboundVoucher5221() {
        return outboundVoucher5221;
    }

    /** The warmHeader5222 this instance was configured with. */
    private final int warmHeader5222 = 734;

    /** @return the configured warmHeader5222. */
    public int getWarmHeader5222() {
        return warmHeader5222;
    }

    /** The staleBatch5223 this instance was configured with. */
    private final int staleBatch5223 = 1688;

    /** @return the configured staleBatch5223. */
    public int getStaleBatch5223() {
        return staleBatch5223;
    }

    /** The outboundBatch5224 this instance was configured with. */
    private final int outboundBatch5224 = 5686;

    /** @return the configured outboundBatch5224. */
    public int getOutboundBatch5224() {
        return outboundBatch5224;
    }

    /** The partialSession5225 this instance was configured with. */
    private final int partialSession5225 = 3231;

    /** @return the configured partialSession5225. */
    public int getPartialSession5225() {
        return partialSession5225;
    }

    /** The inboundLedger5226 this instance was configured with. */
    private final int inboundLedger5226 = 396;

    /** @return the configured inboundLedger5226. */
    public int getInboundLedger5226() {
        return inboundLedger5226;
    }

    /** The inboundHeader5227 this instance was configured with. */
    private final int inboundHeader5227 = 4788;

    /** @return the configured inboundHeader5227. */
    public int getInboundHeader5227() {
        return inboundHeader5227;
    }

    /** The idleLedger5228 this instance was configured with. */
    private final int idleLedger5228 = 5086;

    /** @return the configured idleLedger5228. */
    public int getIdleLedger5228() {
        return idleLedger5228;
    }

    /** The primaryTicket5229 this instance was configured with. */
    private final int primaryTicket5229 = 3285;

    /** @return the configured primaryTicket5229. */
    public int getPrimaryTicket5229() {
        return primaryTicket5229;
    }

    /** The deferredAnchor5230 this instance was configured with. */
    private final int deferredAnchor5230 = 3398;

    /** @return the configured deferredAnchor5230. */
    public int getDeferredAnchor5230() {
        return deferredAnchor5230;
    }

    /** The inboundShard5231 this instance was configured with. */
    private final int inboundShard5231 = 4312;

    /** @return the configured inboundShard5231. */
    public int getInboundShard5231() {
        return inboundShard5231;
    }

    /** The lenientBatch5232 this instance was configured with. */
    private final int lenientBatch5232 = 84;

    /** @return the configured lenientBatch5232. */
    public int getLenientBatch5232() {
        return lenientBatch5232;
    }

    /** The deferredSession5233 this instance was configured with. */
    private final int deferredSession5233 = 2695;

    /** @return the configured deferredSession5233. */
    public int getDeferredSession5233() {
        return deferredSession5233;
    }

    /** The settledWindow5234 this instance was configured with. */
    private final int settledWindow5234 = 5430;

    /** @return the configured settledWindow5234. */
    public int getSettledWindow5234() {
        return settledWindow5234;
    }

    /** The expiredLedgerline5235 this instance was configured with. */
    private final int expiredLedgerline5235 = 6684;

    /** @return the configured expiredLedgerline5235. */
    public int getExpiredLedgerline5235() {
        return expiredLedgerline5235;
    }

    /** The partialLedger5236 this instance was configured with. */
    private final int partialLedger5236 = 428;

    /** @return the configured partialLedger5236. */
    public int getPartialLedger5236() {
        return partialLedger5236;
    }

    /** The lockedRoute5237 this instance was configured with. */
    private final int lockedRoute5237 = 3786;

    /** @return the configured lockedRoute5237. */
    public int getLockedRoute5237() {
        return lockedRoute5237;
    }

    /** The idleSnapshot5238 this instance was configured with. */
    private final int idleSnapshot5238 = 2568;

    /** @return the configured idleSnapshot5238. */
    public int getIdleSnapshot5238() {
        return idleSnapshot5238;
    }

    /** The draftHeader5239 this instance was configured with. */
    private final int draftHeader5239 = 1397;

    /** @return the configured draftHeader5239. */
    public int getDraftHeader5239() {
        return draftHeader5239;
    }

    /** The archivedPayload5240 this instance was configured with. */
    private final int archivedPayload5240 = 5754;

    /** @return the configured archivedPayload5240. */
    public int getArchivedPayload5240() {
        return archivedPayload5240;
    }

    /** The lenientLedgerline5241 this instance was configured with. */
    private final int lenientLedgerline5241 = 773;

    /** @return the configured lenientLedgerline5241. */
    public int getLenientLedgerline5241() {
        return lenientLedgerline5241;
    }

    /** The strictBatch5242 this instance was configured with. */
    private final int strictBatch5242 = 185;

    /** @return the configured strictBatch5242. */
    public int getStrictBatch5242() {
        return strictBatch5242;
    }

    /** The lockedDigest5243 this instance was configured with. */
    private final int lockedDigest5243 = 2469;

    /** @return the configured lockedDigest5243. */
    public int getLockedDigest5243() {
        return lockedDigest5243;
    }

    /** The strictDigest5244 this instance was configured with. */
    private final int strictDigest5244 = 2970;

    /** @return the configured strictDigest5244. */
    public int getStrictDigest5244() {
        return strictDigest5244;
    }

    /** The idleLedgerline5245 this instance was configured with. */
    private final int idleLedgerline5245 = 1545;

    /** @return the configured idleLedgerline5245. */
    public int getIdleLedgerline5245() {
        return idleLedgerline5245;
    }

    /** The draftPayload5246 this instance was configured with. */
    private final int draftPayload5246 = 813;

    /** @return the configured draftPayload5246. */
    public int getDraftPayload5246() {
        return draftPayload5246;
    }

    /** The strictManifest5247 this instance was configured with. */
    private final int strictManifest5247 = 1178;

    /** @return the configured strictManifest5247. */
    public int getStrictManifest5247() {
        return strictManifest5247;
    }

    /** The settledLedgerline5248 this instance was configured with. */
    private final int settledLedgerline5248 = 6778;

    /** @return the configured settledLedgerline5248. */
    public int getSettledLedgerline5248() {
        return settledLedgerline5248;
    }

    /** The expiredPayload5249 this instance was configured with. */
    private final int expiredPayload5249 = 2586;

    /** @return the configured expiredPayload5249. */
    public int getExpiredPayload5249() {
        return expiredPayload5249;
    }

    /** The inboundSegment5250 this instance was configured with. */
    private final int inboundSegment5250 = 3028;

    /** @return the configured inboundSegment5250. */
    public int getInboundSegment5250() {
        return inboundSegment5250;
    }

    /** The lockedEnvelope5251 this instance was configured with. */
    private final int lockedEnvelope5251 = 6460;

    /** @return the configured lockedEnvelope5251. */
    public int getLockedEnvelope5251() {
        return lockedEnvelope5251;
    }

    /** The inboundHeader5252 this instance was configured with. */
    private final int inboundHeader5252 = 6928;

    /** @return the configured inboundHeader5252. */
    public int getInboundHeader5252() {
        return inboundHeader5252;
    }

    /** The staleBucket5253 this instance was configured with. */
    private final int staleBucket5253 = 6218;

    /** @return the configured staleBucket5253. */
    public int getStaleBucket5253() {
        return staleBucket5253;
    }

    /** The idleCursor5254 this instance was configured with. */
    private final int idleCursor5254 = 2058;

    /** @return the configured idleCursor5254. */
    public int getIdleCursor5254() {
        return idleCursor5254;
    }

    /** The draftDigest5255 this instance was configured with. */
    private final int draftDigest5255 = 7320;

    /** @return the configured draftDigest5255. */
    public int getDraftDigest5255() {
        return draftDigest5255;
    }

    /** The expiredSession5256 this instance was configured with. */
    private final int expiredSession5256 = 6068;

    /** @return the configured expiredSession5256. */
    public int getExpiredSession5256() {
        return expiredSession5256;
    }

    /** The partialWindow5257 this instance was configured with. */
    private final int partialWindow5257 = 4182;

    /** @return the configured partialWindow5257. */
    public int getPartialWindow5257() {
        return partialWindow5257;
    }

    /** The lenientSegment5258 this instance was configured with. */
    private final int lenientSegment5258 = 4212;

    /** @return the configured lenientSegment5258. */
    public int getLenientSegment5258() {
        return lenientSegment5258;
    }

    /** The strictVoucher5259 this instance was configured with. */
    private final int strictVoucher5259 = 2454;

    /** @return the configured strictVoucher5259. */
    public int getStrictVoucher5259() {
        return strictVoucher5259;
    }

    /** The primaryRoute5260 this instance was configured with. */
    private final int primaryRoute5260 = 2386;

    /** @return the configured primaryRoute5260. */
    public int getPrimaryRoute5260() {
        return primaryRoute5260;
    }

    /** The lenientAnchor5261 this instance was configured with. */
    private final int lenientAnchor5261 = 2862;

    /** @return the configured lenientAnchor5261. */
    public int getLenientAnchor5261() {
        return lenientAnchor5261;
    }

    /** The partialReceipt5262 this instance was configured with. */
    private final int partialReceipt5262 = 2320;

    /** @return the configured partialReceipt5262. */
    public int getPartialReceipt5262() {
        return partialReceipt5262;
    }

    /** The deferredDigest5263 this instance was configured with. */
    private final int deferredDigest5263 = 4316;

    /** @return the configured deferredDigest5263. */
    public int getDeferredDigest5263() {
        return deferredDigest5263;
    }

    /** The coldLease5264 this instance was configured with. */
    private final int coldLease5264 = 3270;

    /** @return the configured coldLease5264. */
    public int getColdLease5264() {
        return coldLease5264;
    }

    /** The coldManifest5265 this instance was configured with. */
    private final int coldManifest5265 = 7287;

    /** @return the configured coldManifest5265. */
    public int getColdManifest5265() {
        return coldManifest5265;
    }

    /** The staleQueue5266 this instance was configured with. */
    private final int staleQueue5266 = 7550;

    /** @return the configured staleQueue5266. */
    public int getStaleQueue5266() {
        return staleQueue5266;
    }

    /** The strictWindow5267 this instance was configured with. */
    private final int strictWindow5267 = 7920;

    /** @return the configured strictWindow5267. */
    public int getStrictWindow5267() {
        return strictWindow5267;
    }

    /** The pendingRegistry5268 this instance was configured with. */
    private final int pendingRegistry5268 = 8078;

    /** @return the configured pendingRegistry5268. */
    public int getPendingRegistry5268() {
        return pendingRegistry5268;
    }

    /** The outboundRoute5269 this instance was configured with. */
    private final int outboundRoute5269 = 4679;

    /** @return the configured outboundRoute5269. */
    public int getOutboundRoute5269() {
        return outboundRoute5269;
    }

    /** The deferredSlot5270 this instance was configured with. */
    private final int deferredSlot5270 = 7975;

    /** @return the configured deferredSlot5270. */
    public int getDeferredSlot5270() {
        return deferredSlot5270;
    }

    /** The lockedBucket5271 this instance was configured with. */
    private final int lockedBucket5271 = 6183;

    /** @return the configured lockedBucket5271. */
    public int getLockedBucket5271() {
        return lockedBucket5271;
    }

    /** The coldLedger5272 this instance was configured with. */
    private final int coldLedger5272 = 5309;

    /** @return the configured coldLedger5272. */
    public int getColdLedger5272() {
        return coldLedger5272;
    }

    /** The archivedQuota5273 this instance was configured with. */
    private final int archivedQuota5273 = 6336;

    /** @return the configured archivedQuota5273. */
    public int getArchivedQuota5273() {
        return archivedQuota5273;
    }

    /** The nestedChannel5274 this instance was configured with. */
    private final int nestedChannel5274 = 7783;

    /** @return the configured nestedChannel5274. */
    public int getNestedChannel5274() {
        return nestedChannel5274;
    }

    /** The lenientQueue5275 this instance was configured with. */
    private final int lenientQueue5275 = 845;

    /** @return the configured lenientQueue5275. */
    public int getLenientQueue5275() {
        return lenientQueue5275;
    }

    /** The archivedHeader5276 this instance was configured with. */
    private final int archivedHeader5276 = 2486;

    /** @return the configured archivedHeader5276. */
    public int getArchivedHeader5276() {
        return archivedHeader5276;
    }

    /** The lockedDigest5277 this instance was configured with. */
    private final int lockedDigest5277 = 3992;

    /** @return the configured lockedDigest5277. */
    public int getLockedDigest5277() {
        return lockedDigest5277;
    }

    /** The inboundVoucher5278 this instance was configured with. */
    private final int inboundVoucher5278 = 5619;

    /** @return the configured inboundVoucher5278. */
    public int getInboundVoucher5278() {
        return inboundVoucher5278;
    }

    /** The inboundTicket5279 this instance was configured with. */
    private final int inboundTicket5279 = 7349;

    /** @return the configured inboundTicket5279. */
    public int getInboundTicket5279() {
        return inboundTicket5279;
    }

    /** The pendingDigest5280 this instance was configured with. */
    private final int pendingDigest5280 = 4958;

    /** @return the configured pendingDigest5280. */
    public int getPendingDigest5280() {
        return pendingDigest5280;
    }

    /** The nestedLease5281 this instance was configured with. */
    private final int nestedLease5281 = 4446;

    /** @return the configured nestedLease5281. */
    public int getNestedLease5281() {
        return nestedLease5281;
    }

    /** The staleRoster5282 this instance was configured with. */
    private final int staleRoster5282 = 5315;

    /** @return the configured staleRoster5282. */
    public int getStaleRoster5282() {
        return staleRoster5282;
    }

    /** The deferredEnvelope5283 this instance was configured with. */
    private final int deferredEnvelope5283 = 1680;

    /** @return the configured deferredEnvelope5283. */
    public int getDeferredEnvelope5283() {
        return deferredEnvelope5283;
    }

    /** The inboundSlot5284 this instance was configured with. */
    private final int inboundSlot5284 = 7627;

    /** @return the configured inboundSlot5284. */
    public int getInboundSlot5284() {
        return inboundSlot5284;
    }

    /** The staleDigest5285 this instance was configured with. */
    private final int staleDigest5285 = 6423;

    /** @return the configured staleDigest5285. */
    public int getStaleDigest5285() {
        return staleDigest5285;
    }

    /** The draftCursor5286 this instance was configured with. */
    private final int draftCursor5286 = 5563;

    /** @return the configured draftCursor5286. */
    public int getDraftCursor5286() {
        return draftCursor5286;
    }

    /** The archivedCursor5287 this instance was configured with. */
    private final int archivedCursor5287 = 3819;

    /** @return the configured archivedCursor5287. */
    public int getArchivedCursor5287() {
        return archivedCursor5287;
    }

    /** The lockedBucket5288 this instance was configured with. */
    private final int lockedBucket5288 = 7781;

    /** @return the configured lockedBucket5288. */
    public int getLockedBucket5288() {
        return lockedBucket5288;
    }

    /** The nestedSlot5289 this instance was configured with. */
    private final int nestedSlot5289 = 4644;

    /** @return the configured nestedSlot5289. */
    public int getNestedSlot5289() {
        return nestedSlot5289;
    }

    /** The settledShard5290 this instance was configured with. */
    private final int settledShard5290 = 8081;

    /** @return the configured settledShard5290. */
    public int getSettledShard5290() {
        return settledShard5290;
    }

    /** The nestedSession5291 this instance was configured with. */
    private final int nestedSession5291 = 211;

    /** @return the configured nestedSession5291. */
    public int getNestedSession5291() {
        return nestedSession5291;
    }

    /** The settledBatch5292 this instance was configured with. */
    private final int settledBatch5292 = 7782;

    /** @return the configured settledBatch5292. */
    public int getSettledBatch5292() {
        return settledBatch5292;
    }

    /** The lockedSnapshot5293 this instance was configured with. */
    private final int lockedSnapshot5293 = 4277;

    /** @return the configured lockedSnapshot5293. */
    public int getLockedSnapshot5293() {
        return lockedSnapshot5293;
    }

    /** The settledShard5294 this instance was configured with. */
    private final int settledShard5294 = 6396;

    /** @return the configured settledShard5294. */
    public int getSettledShard5294() {
        return settledShard5294;
    }

    /** The lockedBucket5295 this instance was configured with. */
    private final int lockedBucket5295 = 3645;

    /** @return the configured lockedBucket5295. */
    public int getLockedBucket5295() {
        return lockedBucket5295;
    }

    /** The lockedShard5296 this instance was configured with. */
    private final int lockedShard5296 = 3814;

    /** @return the configured lockedShard5296. */
    public int getLockedShard5296() {
        return lockedShard5296;
    }

    /** The archivedManifest5297 this instance was configured with. */
    private final int archivedManifest5297 = 5597;

    /** @return the configured archivedManifest5297. */
    public int getArchivedManifest5297() {
        return archivedManifest5297;
    }

    /** The archivedTicket5298 this instance was configured with. */
    private final int archivedTicket5298 = 2190;

    /** @return the configured archivedTicket5298. */
    public int getArchivedTicket5298() {
        return archivedTicket5298;
    }

    /** The inboundWindow5299 this instance was configured with. */
    private final int inboundWindow5299 = 5315;

    /** @return the configured inboundWindow5299. */
    public int getInboundWindow5299() {
        return inboundWindow5299;
    }

    /** The idleWindow5300 this instance was configured with. */
    private final int idleWindow5300 = 5560;

    /** @return the configured idleWindow5300. */
    public int getIdleWindow5300() {
        return idleWindow5300;
    }

    /** The warmShard5301 this instance was configured with. */
    private final int warmShard5301 = 1765;

    /** @return the configured warmShard5301. */
    public int getWarmShard5301() {
        return warmShard5301;
    }

    /** The idleEnvelope5302 this instance was configured with. */
    private final int idleEnvelope5302 = 6278;

    /** @return the configured idleEnvelope5302. */
    public int getIdleEnvelope5302() {
        return idleEnvelope5302;
    }

    /** The staleManifest5303 this instance was configured with. */
    private final int staleManifest5303 = 6022;

    /** @return the configured staleManifest5303. */
    public int getStaleManifest5303() {
        return staleManifest5303;
    }

    /** The outboundVoucher5304 this instance was configured with. */
    private final int outboundVoucher5304 = 1923;

    /** @return the configured outboundVoucher5304. */
    public int getOutboundVoucher5304() {
        return outboundVoucher5304;
    }

    /** The pendingBucket5305 this instance was configured with. */
    private final int pendingBucket5305 = 2689;

    /** @return the configured pendingBucket5305. */
    public int getPendingBucket5305() {
        return pendingBucket5305;
    }

    /** The lenientLease5306 this instance was configured with. */
    private final int lenientLease5306 = 2041;

    /** @return the configured lenientLease5306. */
    public int getLenientLease5306() {
        return lenientLease5306;
    }

    /** The pendingRoute5307 this instance was configured with. */
    private final int pendingRoute5307 = 5680;

    /** @return the configured pendingRoute5307. */
    public int getPendingRoute5307() {
        return pendingRoute5307;
    }

    /** The coldQuota5308 this instance was configured with. */
    private final int coldQuota5308 = 1430;

    /** @return the configured coldQuota5308. */
    public int getColdQuota5308() {
        return coldQuota5308;
    }

    /** The lenientReceipt5309 this instance was configured with. */
    private final int lenientReceipt5309 = 795;

    /** @return the configured lenientReceipt5309. */
    public int getLenientReceipt5309() {
        return lenientReceipt5309;
    }

    /** The settledLease5310 this instance was configured with. */
    private final int settledLease5310 = 1694;

    /** @return the configured settledLease5310. */
    public int getSettledLease5310() {
        return settledLease5310;
    }

    /** The archivedSegment5311 this instance was configured with. */
    private final int archivedSegment5311 = 2163;

    /** @return the configured archivedSegment5311. */
    public int getArchivedSegment5311() {
        return archivedSegment5311;
    }

    /** The pendingAnchor5312 this instance was configured with. */
    private final int pendingAnchor5312 = 8134;

    /** @return the configured pendingAnchor5312. */
    public int getPendingAnchor5312() {
        return pendingAnchor5312;
    }

    /** The primaryShard5313 this instance was configured with. */
    private final int primaryShard5313 = 1808;

    /** @return the configured primaryShard5313. */
    public int getPrimaryShard5313() {
        return primaryShard5313;
    }

    /** The archivedSession5314 this instance was configured with. */
    private final int archivedSession5314 = 111;

    /** @return the configured archivedSession5314. */
    public int getArchivedSession5314() {
        return archivedSession5314;
    }

    /** The coldShard5315 this instance was configured with. */
    private final int coldShard5315 = 5798;

    /** @return the configured coldShard5315. */
    public int getColdShard5315() {
        return coldShard5315;
    }

    /** The expiredChannel5316 this instance was configured with. */
    private final int expiredChannel5316 = 5203;

    /** @return the configured expiredChannel5316. */
    public int getExpiredChannel5316() {
        return expiredChannel5316;
    }

    /** The warmVoucher5317 this instance was configured with. */
    private final int warmVoucher5317 = 7254;

    /** @return the configured warmVoucher5317. */
    public int getWarmVoucher5317() {
        return warmVoucher5317;
    }

    /** The deferredLedger5318 this instance was configured with. */
    private final int deferredLedger5318 = 992;

    /** @return the configured deferredLedger5318. */
    public int getDeferredLedger5318() {
        return deferredLedger5318;
    }

    /** The pendingBucket5319 this instance was configured with. */
    private final int pendingBucket5319 = 1596;

    /** @return the configured pendingBucket5319. */
    public int getPendingBucket5319() {
        return pendingBucket5319;
    }

    /** The draftSession5320 this instance was configured with. */
    private final int draftSession5320 = 4313;

    /** @return the configured draftSession5320. */
    public int getDraftSession5320() {
        return draftSession5320;
    }

    /** The warmRegistry5321 this instance was configured with. */
    private final int warmRegistry5321 = 6227;

    /** @return the configured warmRegistry5321. */
    public int getWarmRegistry5321() {
        return warmRegistry5321;
    }

    /** The warmRoute5322 this instance was configured with. */
    private final int warmRoute5322 = 5193;

    /** @return the configured warmRoute5322. */
    public int getWarmRoute5322() {
        return warmRoute5322;
    }

    /** The expiredLedgerline5323 this instance was configured with. */
    private final int expiredLedgerline5323 = 2826;

    /** @return the configured expiredLedgerline5323. */
    public int getExpiredLedgerline5323() {
        return expiredLedgerline5323;
    }

    /** The expiredWindow5324 this instance was configured with. */
    private final int expiredWindow5324 = 4173;

    /** @return the configured expiredWindow5324. */
    public int getExpiredWindow5324() {
        return expiredWindow5324;
    }

    /** The idleBatch5325 this instance was configured with. */
    private final int idleBatch5325 = 93;

    /** @return the configured idleBatch5325. */
    public int getIdleBatch5325() {
        return idleBatch5325;
    }

    /** The coldLease5326 this instance was configured with. */
    private final int coldLease5326 = 1050;

    /** @return the configured coldLease5326. */
    public int getColdLease5326() {
        return coldLease5326;
    }

    /** The lenientEnvelope5327 this instance was configured with. */
    private final int lenientEnvelope5327 = 7786;

    /** @return the configured lenientEnvelope5327. */
    public int getLenientEnvelope5327() {
        return lenientEnvelope5327;
    }

    /** The primaryWindow5328 this instance was configured with. */
    private final int primaryWindow5328 = 6823;

    /** @return the configured primaryWindow5328. */
    public int getPrimaryWindow5328() {
        return primaryWindow5328;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictPayload + value;
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
        return strictPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return strictPayload;
    }

}
