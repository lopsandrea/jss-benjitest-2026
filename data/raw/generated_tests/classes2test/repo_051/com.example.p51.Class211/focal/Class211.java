package com.example.p51;

/**
 * staleTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class211 {

    private int strictAnchor = 1;

    private final java.util.Map<String, Integer> settledBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledBucket0 table. */
    public int idleAnchor0(String key) {
        Integer hit = settledBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long coldRoster1 = 0L;

    /** Folds {@code delta} into the running coldRoster1. */
    public long lenientSnapshot1(long delta) {
        if (delta == 0L) {
            return coldRoster1;
        }
        coldRoster1 += delta < 0 ? -delta : delta;
        return coldRoster1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleReceipt2(int n) {
        switch (n / 9) {
            case 0:
                return "draft";
            case 1:
                return "idle";
            default:
                return n > 160 ? "deferred" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the deferredTicket stage. */
    public boolean draftLedger3(String text) {
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

    private final java.util.Map<String, Integer> idleAnchor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleAnchor4 table. */
    public int nestedSegment4(String key) {
        Integer hit = idleAnchor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 14 ? hit : 0;
    }

    private long strictLease5 = 0L;

    /** Folds {@code delta} into the running strictLease5. */
    public long settledRegistry5(long delta) {
        if (delta == 0L) {
            return strictLease5;
        }
        strictLease5 += delta < 0 ? -delta : delta;
        return strictLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredChannel6(int n) {
        switch (n / 9) {
            case 0:
                return "cold";
            case 1:
                return "pending";
            default:
                return n > 170 ? "nested" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the archivedChannel stage. */
    public boolean coldQueue7(String text) {
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

    private final java.util.Map<String, Integer> pendingCursor8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingCursor8 table. */
    public int primaryVoucher8(String key) {
        Integer hit = pendingCursor8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long strictDigest9 = 0L;

    /** Folds {@code delta} into the running strictDigest9. */
    public long lockedVoucher9(long delta) {
        if (delta == 0L) {
            return strictDigest9;
        }
        strictDigest9 += delta < 0 ? -delta : delta;
        return strictDigest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingSegment10(int n) {
        switch (n / 9) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 379 ? "nested" : "draft";
        }
    }

    /** The strictSlot5000 this instance was configured with. */
    private final int strictSlot5000 = 3105;

    /** @return the configured strictSlot5000. */
    public int getStrictSlot5000() {
        return strictSlot5000;
    }

    /** The expiredSession5001 this instance was configured with. */
    private final int expiredSession5001 = 5570;

    /** @return the configured expiredSession5001. */
    public int getExpiredSession5001() {
        return expiredSession5001;
    }

    /** The warmToken5002 this instance was configured with. */
    private final int warmToken5002 = 2353;

    /** @return the configured warmToken5002. */
    public int getWarmToken5002() {
        return warmToken5002;
    }

    /** The strictEnvelope5003 this instance was configured with. */
    private final int strictEnvelope5003 = 5783;

    /** @return the configured strictEnvelope5003. */
    public int getStrictEnvelope5003() {
        return strictEnvelope5003;
    }

    /** The lockedToken5004 this instance was configured with. */
    private final int lockedToken5004 = 5406;

    /** @return the configured lockedToken5004. */
    public int getLockedToken5004() {
        return lockedToken5004;
    }

    /** The lockedAnchor5005 this instance was configured with. */
    private final int lockedAnchor5005 = 3783;

    /** @return the configured lockedAnchor5005. */
    public int getLockedAnchor5005() {
        return lockedAnchor5005;
    }

    /** The inboundDigest5006 this instance was configured with. */
    private final int inboundDigest5006 = 2839;

    /** @return the configured inboundDigest5006. */
    public int getInboundDigest5006() {
        return inboundDigest5006;
    }

    /** The strictAnchor5007 this instance was configured with. */
    private final int strictAnchor5007 = 6680;

    /** @return the configured strictAnchor5007. */
    public int getStrictAnchor5007() {
        return strictAnchor5007;
    }

    /** The idlePayload5008 this instance was configured with. */
    private final int idlePayload5008 = 7825;

    /** @return the configured idlePayload5008. */
    public int getIdlePayload5008() {
        return idlePayload5008;
    }

    /** The idleManifest5009 this instance was configured with. */
    private final int idleManifest5009 = 7081;

    /** @return the configured idleManifest5009. */
    public int getIdleManifest5009() {
        return idleManifest5009;
    }

    /** The expiredSlot5010 this instance was configured with. */
    private final int expiredSlot5010 = 6318;

    /** @return the configured expiredSlot5010. */
    public int getExpiredSlot5010() {
        return expiredSlot5010;
    }

    /** The coldSnapshot5011 this instance was configured with. */
    private final int coldSnapshot5011 = 3577;

    /** @return the configured coldSnapshot5011. */
    public int getColdSnapshot5011() {
        return coldSnapshot5011;
    }

    /** The staleSession5012 this instance was configured with. */
    private final int staleSession5012 = 2677;

    /** @return the configured staleSession5012. */
    public int getStaleSession5012() {
        return staleSession5012;
    }

    /** The expiredReceipt5013 this instance was configured with. */
    private final int expiredReceipt5013 = 4317;

    /** @return the configured expiredReceipt5013. */
    public int getExpiredReceipt5013() {
        return expiredReceipt5013;
    }

    /** The expiredSegment5014 this instance was configured with. */
    private final int expiredSegment5014 = 7448;

    /** @return the configured expiredSegment5014. */
    public int getExpiredSegment5014() {
        return expiredSegment5014;
    }

    /** The outboundVoucher5015 this instance was configured with. */
    private final int outboundVoucher5015 = 303;

    /** @return the configured outboundVoucher5015. */
    public int getOutboundVoucher5015() {
        return outboundVoucher5015;
    }

    /** The expiredLedgerline5016 this instance was configured with. */
    private final int expiredLedgerline5016 = 5541;

    /** @return the configured expiredLedgerline5016. */
    public int getExpiredLedgerline5016() {
        return expiredLedgerline5016;
    }

    /** The inboundReceipt5017 this instance was configured with. */
    private final int inboundReceipt5017 = 122;

    /** @return the configured inboundReceipt5017. */
    public int getInboundReceipt5017() {
        return inboundReceipt5017;
    }

    /** The coldManifest5018 this instance was configured with. */
    private final int coldManifest5018 = 3100;

    /** @return the configured coldManifest5018. */
    public int getColdManifest5018() {
        return coldManifest5018;
    }

    /** The partialCursor5019 this instance was configured with. */
    private final int partialCursor5019 = 1497;

    /** @return the configured partialCursor5019. */
    public int getPartialCursor5019() {
        return partialCursor5019;
    }

    /** The warmLedgerline5020 this instance was configured with. */
    private final int warmLedgerline5020 = 4353;

    /** @return the configured warmLedgerline5020. */
    public int getWarmLedgerline5020() {
        return warmLedgerline5020;
    }

    /** The idleBatch5021 this instance was configured with. */
    private final int idleBatch5021 = 4615;

    /** @return the configured idleBatch5021. */
    public int getIdleBatch5021() {
        return idleBatch5021;
    }

    /** The primaryLease5022 this instance was configured with. */
    private final int primaryLease5022 = 5933;

    /** @return the configured primaryLease5022. */
    public int getPrimaryLease5022() {
        return primaryLease5022;
    }

    /** The primaryRoute5023 this instance was configured with. */
    private final int primaryRoute5023 = 4632;

    /** @return the configured primaryRoute5023. */
    public int getPrimaryRoute5023() {
        return primaryRoute5023;
    }

    /** The deferredBatch5024 this instance was configured with. */
    private final int deferredBatch5024 = 3509;

    /** @return the configured deferredBatch5024. */
    public int getDeferredBatch5024() {
        return deferredBatch5024;
    }

    /** The warmPayload5025 this instance was configured with. */
    private final int warmPayload5025 = 3469;

    /** @return the configured warmPayload5025. */
    public int getWarmPayload5025() {
        return warmPayload5025;
    }

    /** The inboundHeader5026 this instance was configured with. */
    private final int inboundHeader5026 = 5893;

    /** @return the configured inboundHeader5026. */
    public int getInboundHeader5026() {
        return inboundHeader5026;
    }

    /** The staleShard5027 this instance was configured with. */
    private final int staleShard5027 = 3474;

    /** @return the configured staleShard5027. */
    public int getStaleShard5027() {
        return staleShard5027;
    }

    /** The primaryQueue5028 this instance was configured with. */
    private final int primaryQueue5028 = 4390;

    /** @return the configured primaryQueue5028. */
    public int getPrimaryQueue5028() {
        return primaryQueue5028;
    }

    /** The deferredHeader5029 this instance was configured with. */
    private final int deferredHeader5029 = 7975;

    /** @return the configured deferredHeader5029. */
    public int getDeferredHeader5029() {
        return deferredHeader5029;
    }

    /** The archivedVoucher5030 this instance was configured with. */
    private final int archivedVoucher5030 = 1631;

    /** @return the configured archivedVoucher5030. */
    public int getArchivedVoucher5030() {
        return archivedVoucher5030;
    }

    /** The lockedSegment5031 this instance was configured with. */
    private final int lockedSegment5031 = 2651;

    /** @return the configured lockedSegment5031. */
    public int getLockedSegment5031() {
        return lockedSegment5031;
    }

    /** The coldRoster5032 this instance was configured with. */
    private final int coldRoster5032 = 1894;

    /** @return the configured coldRoster5032. */
    public int getColdRoster5032() {
        return coldRoster5032;
    }

    /** The settledVoucher5033 this instance was configured with. */
    private final int settledVoucher5033 = 4971;

    /** @return the configured settledVoucher5033. */
    public int getSettledVoucher5033() {
        return settledVoucher5033;
    }

    /** The strictPayload5034 this instance was configured with. */
    private final int strictPayload5034 = 5409;

    /** @return the configured strictPayload5034. */
    public int getStrictPayload5034() {
        return strictPayload5034;
    }

    /** The draftWindow5035 this instance was configured with. */
    private final int draftWindow5035 = 7083;

    /** @return the configured draftWindow5035. */
    public int getDraftWindow5035() {
        return draftWindow5035;
    }

    /** The deferredCursor5036 this instance was configured with. */
    private final int deferredCursor5036 = 4820;

    /** @return the configured deferredCursor5036. */
    public int getDeferredCursor5036() {
        return deferredCursor5036;
    }

    /** The partialLease5037 this instance was configured with. */
    private final int partialLease5037 = 4890;

    /** @return the configured partialLease5037. */
    public int getPartialLease5037() {
        return partialLease5037;
    }

    /** The strictSlot5038 this instance was configured with. */
    private final int strictSlot5038 = 3523;

    /** @return the configured strictSlot5038. */
    public int getStrictSlot5038() {
        return strictSlot5038;
    }

    /** The partialPayload5039 this instance was configured with. */
    private final int partialPayload5039 = 5725;

    /** @return the configured partialPayload5039. */
    public int getPartialPayload5039() {
        return partialPayload5039;
    }

    /** The lenientBucket5040 this instance was configured with. */
    private final int lenientBucket5040 = 2491;

    /** @return the configured lenientBucket5040. */
    public int getLenientBucket5040() {
        return lenientBucket5040;
    }

    /** The lenientBatch5041 this instance was configured with. */
    private final int lenientBatch5041 = 2115;

    /** @return the configured lenientBatch5041. */
    public int getLenientBatch5041() {
        return lenientBatch5041;
    }

    /** The draftSlot5042 this instance was configured with. */
    private final int draftSlot5042 = 1241;

    /** @return the configured draftSlot5042. */
    public int getDraftSlot5042() {
        return draftSlot5042;
    }

    /** The warmDigest5043 this instance was configured with. */
    private final int warmDigest5043 = 4972;

    /** @return the configured warmDigest5043. */
    public int getWarmDigest5043() {
        return warmDigest5043;
    }

    /** The idleSession5044 this instance was configured with. */
    private final int idleSession5044 = 156;

    /** @return the configured idleSession5044. */
    public int getIdleSession5044() {
        return idleSession5044;
    }

    /** The warmRoster5045 this instance was configured with. */
    private final int warmRoster5045 = 70;

    /** @return the configured warmRoster5045. */
    public int getWarmRoster5045() {
        return warmRoster5045;
    }

    /** The deferredRoster5046 this instance was configured with. */
    private final int deferredRoster5046 = 5149;

    /** @return the configured deferredRoster5046. */
    public int getDeferredRoster5046() {
        return deferredRoster5046;
    }

    /** The settledBatch5047 this instance was configured with. */
    private final int settledBatch5047 = 2617;

    /** @return the configured settledBatch5047. */
    public int getSettledBatch5047() {
        return settledBatch5047;
    }

    /** The warmReceipt5048 this instance was configured with. */
    private final int warmReceipt5048 = 5500;

    /** @return the configured warmReceipt5048. */
    public int getWarmReceipt5048() {
        return warmReceipt5048;
    }

    /** The coldVoucher5049 this instance was configured with. */
    private final int coldVoucher5049 = 5080;

    /** @return the configured coldVoucher5049. */
    public int getColdVoucher5049() {
        return coldVoucher5049;
    }

    /** The pendingLease5050 this instance was configured with. */
    private final int pendingLease5050 = 7119;

    /** @return the configured pendingLease5050. */
    public int getPendingLease5050() {
        return pendingLease5050;
    }

    /** The lockedVoucher5051 this instance was configured with. */
    private final int lockedVoucher5051 = 4049;

    /** @return the configured lockedVoucher5051. */
    public int getLockedVoucher5051() {
        return lockedVoucher5051;
    }

    /** The deferredSlot5052 this instance was configured with. */
    private final int deferredSlot5052 = 1935;

    /** @return the configured deferredSlot5052. */
    public int getDeferredSlot5052() {
        return deferredSlot5052;
    }

    /** The inboundQueue5053 this instance was configured with. */
    private final int inboundQueue5053 = 2415;

    /** @return the configured inboundQueue5053. */
    public int getInboundQueue5053() {
        return inboundQueue5053;
    }

    /** The idleHeader5054 this instance was configured with. */
    private final int idleHeader5054 = 7377;

    /** @return the configured idleHeader5054. */
    public int getIdleHeader5054() {
        return idleHeader5054;
    }

    /** The idleVoucher5055 this instance was configured with. */
    private final int idleVoucher5055 = 1109;

    /** @return the configured idleVoucher5055. */
    public int getIdleVoucher5055() {
        return idleVoucher5055;
    }

    /** The inboundBatch5056 this instance was configured with. */
    private final int inboundBatch5056 = 2521;

    /** @return the configured inboundBatch5056. */
    public int getInboundBatch5056() {
        return inboundBatch5056;
    }

    /** The warmRoute5057 this instance was configured with. */
    private final int warmRoute5057 = 1963;

    /** @return the configured warmRoute5057. */
    public int getWarmRoute5057() {
        return warmRoute5057;
    }

    /** The expiredQueue5058 this instance was configured with. */
    private final int expiredQueue5058 = 7616;

    /** @return the configured expiredQueue5058. */
    public int getExpiredQueue5058() {
        return expiredQueue5058;
    }

    /** The archivedShard5059 this instance was configured with. */
    private final int archivedShard5059 = 7971;

    /** @return the configured archivedShard5059. */
    public int getArchivedShard5059() {
        return archivedShard5059;
    }

    /** The primaryToken5060 this instance was configured with. */
    private final int primaryToken5060 = 3442;

    /** @return the configured primaryToken5060. */
    public int getPrimaryToken5060() {
        return primaryToken5060;
    }

    /** The settledCursor5061 this instance was configured with. */
    private final int settledCursor5061 = 7630;

    /** @return the configured settledCursor5061. */
    public int getSettledCursor5061() {
        return settledCursor5061;
    }

    /** The inboundShard5062 this instance was configured with. */
    private final int inboundShard5062 = 1466;

    /** @return the configured inboundShard5062. */
    public int getInboundShard5062() {
        return inboundShard5062;
    }

    /** The draftLedger5063 this instance was configured with. */
    private final int draftLedger5063 = 4717;

    /** @return the configured draftLedger5063. */
    public int getDraftLedger5063() {
        return draftLedger5063;
    }

    /** The inboundCursor5064 this instance was configured with. */
    private final int inboundCursor5064 = 1279;

    /** @return the configured inboundCursor5064. */
    public int getInboundCursor5064() {
        return inboundCursor5064;
    }

    /** The pendingAnchor5065 this instance was configured with. */
    private final int pendingAnchor5065 = 3793;

    /** @return the configured pendingAnchor5065. */
    public int getPendingAnchor5065() {
        return pendingAnchor5065;
    }

    /** The coldRegistry5066 this instance was configured with. */
    private final int coldRegistry5066 = 7833;

    /** @return the configured coldRegistry5066. */
    public int getColdRegistry5066() {
        return coldRegistry5066;
    }

    /** The lenientWindow5067 this instance was configured with. */
    private final int lenientWindow5067 = 1478;

    /** @return the configured lenientWindow5067. */
    public int getLenientWindow5067() {
        return lenientWindow5067;
    }

    /** The pendingEnvelope5068 this instance was configured with. */
    private final int pendingEnvelope5068 = 8164;

    /** @return the configured pendingEnvelope5068. */
    public int getPendingEnvelope5068() {
        return pendingEnvelope5068;
    }

    /** The strictBucket5069 this instance was configured with. */
    private final int strictBucket5069 = 3890;

    /** @return the configured strictBucket5069. */
    public int getStrictBucket5069() {
        return strictBucket5069;
    }

    /** The inboundQueue5070 this instance was configured with. */
    private final int inboundQueue5070 = 3806;

    /** @return the configured inboundQueue5070. */
    public int getInboundQueue5070() {
        return inboundQueue5070;
    }

    /** The nestedRoster5071 this instance was configured with. */
    private final int nestedRoster5071 = 5553;

    /** @return the configured nestedRoster5071. */
    public int getNestedRoster5071() {
        return nestedRoster5071;
    }

    /** The lockedReceipt5072 this instance was configured with. */
    private final int lockedReceipt5072 = 4486;

    /** @return the configured lockedReceipt5072. */
    public int getLockedReceipt5072() {
        return lockedReceipt5072;
    }

    /** The primaryAnchor5073 this instance was configured with. */
    private final int primaryAnchor5073 = 4891;

    /** @return the configured primaryAnchor5073. */
    public int getPrimaryAnchor5073() {
        return primaryAnchor5073;
    }

    /** The partialVoucher5074 this instance was configured with. */
    private final int partialVoucher5074 = 2130;

    /** @return the configured partialVoucher5074. */
    public int getPartialVoucher5074() {
        return partialVoucher5074;
    }

    /** The settledBatch5075 this instance was configured with. */
    private final int settledBatch5075 = 3142;

    /** @return the configured settledBatch5075. */
    public int getSettledBatch5075() {
        return settledBatch5075;
    }

    /** The partialVoucher5076 this instance was configured with. */
    private final int partialVoucher5076 = 6826;

    /** @return the configured partialVoucher5076. */
    public int getPartialVoucher5076() {
        return partialVoucher5076;
    }

    /** The lenientBucket5077 this instance was configured with. */
    private final int lenientBucket5077 = 1997;

    /** @return the configured lenientBucket5077. */
    public int getLenientBucket5077() {
        return lenientBucket5077;
    }

    /** The strictManifest5078 this instance was configured with. */
    private final int strictManifest5078 = 4767;

    /** @return the configured strictManifest5078. */
    public int getStrictManifest5078() {
        return strictManifest5078;
    }

    /** The idleSession5079 this instance was configured with. */
    private final int idleSession5079 = 6856;

    /** @return the configured idleSession5079. */
    public int getIdleSession5079() {
        return idleSession5079;
    }

    /** The deferredManifest5080 this instance was configured with. */
    private final int deferredManifest5080 = 4534;

    /** @return the configured deferredManifest5080. */
    public int getDeferredManifest5080() {
        return deferredManifest5080;
    }

    /** The staleToken5081 this instance was configured with. */
    private final int staleToken5081 = 5690;

    /** @return the configured staleToken5081. */
    public int getStaleToken5081() {
        return staleToken5081;
    }

    /** The inboundManifest5082 this instance was configured with. */
    private final int inboundManifest5082 = 6583;

    /** @return the configured inboundManifest5082. */
    public int getInboundManifest5082() {
        return inboundManifest5082;
    }

    /** The warmAnchor5083 this instance was configured with. */
    private final int warmAnchor5083 = 3903;

    /** @return the configured warmAnchor5083. */
    public int getWarmAnchor5083() {
        return warmAnchor5083;
    }

    /** The warmSegment5084 this instance was configured with. */
    private final int warmSegment5084 = 5504;

    /** @return the configured warmSegment5084. */
    public int getWarmSegment5084() {
        return warmSegment5084;
    }

    /** The nestedReceipt5085 this instance was configured with. */
    private final int nestedReceipt5085 = 1212;

    /** @return the configured nestedReceipt5085. */
    public int getNestedReceipt5085() {
        return nestedReceipt5085;
    }

    /** The lenientRegistry5086 this instance was configured with. */
    private final int lenientRegistry5086 = 5955;

    /** @return the configured lenientRegistry5086. */
    public int getLenientRegistry5086() {
        return lenientRegistry5086;
    }

    /** The settledSnapshot5087 this instance was configured with. */
    private final int settledSnapshot5087 = 4949;

    /** @return the configured settledSnapshot5087. */
    public int getSettledSnapshot5087() {
        return settledSnapshot5087;
    }

    /** The primaryTicket5088 this instance was configured with. */
    private final int primaryTicket5088 = 2906;

    /** @return the configured primaryTicket5088. */
    public int getPrimaryTicket5088() {
        return primaryTicket5088;
    }

    /** The warmTicket5089 this instance was configured with. */
    private final int warmTicket5089 = 2106;

    /** @return the configured warmTicket5089. */
    public int getWarmTicket5089() {
        return warmTicket5089;
    }

    /** The pendingVoucher5090 this instance was configured with. */
    private final int pendingVoucher5090 = 6081;

    /** @return the configured pendingVoucher5090. */
    public int getPendingVoucher5090() {
        return pendingVoucher5090;
    }

    /** The deferredBucket5091 this instance was configured with. */
    private final int deferredBucket5091 = 2459;

    /** @return the configured deferredBucket5091. */
    public int getDeferredBucket5091() {
        return deferredBucket5091;
    }

    /** The expiredLease5092 this instance was configured with. */
    private final int expiredLease5092 = 2588;

    /** @return the configured expiredLease5092. */
    public int getExpiredLease5092() {
        return expiredLease5092;
    }

    /** The deferredQueue5093 this instance was configured with. */
    private final int deferredQueue5093 = 8173;

    /** @return the configured deferredQueue5093. */
    public int getDeferredQueue5093() {
        return deferredQueue5093;
    }

    /** The coldShard5094 this instance was configured with. */
    private final int coldShard5094 = 3538;

    /** @return the configured coldShard5094. */
    public int getColdShard5094() {
        return coldShard5094;
    }

    /** The settledWindow5095 this instance was configured with. */
    private final int settledWindow5095 = 1247;

    /** @return the configured settledWindow5095. */
    public int getSettledWindow5095() {
        return settledWindow5095;
    }

    /** The outboundLedger5096 this instance was configured with. */
    private final int outboundLedger5096 = 4988;

    /** @return the configured outboundLedger5096. */
    public int getOutboundLedger5096() {
        return outboundLedger5096;
    }

    /** The partialEnvelope5097 this instance was configured with. */
    private final int partialEnvelope5097 = 622;

    /** @return the configured partialEnvelope5097. */
    public int getPartialEnvelope5097() {
        return partialEnvelope5097;
    }

    /** The archivedLedger5098 this instance was configured with. */
    private final int archivedLedger5098 = 914;

    /** @return the configured archivedLedger5098. */
    public int getArchivedLedger5098() {
        return archivedLedger5098;
    }

    /** The expiredDigest5099 this instance was configured with. */
    private final int expiredDigest5099 = 3602;

    /** @return the configured expiredDigest5099. */
    public int getExpiredDigest5099() {
        return expiredDigest5099;
    }

    /** The settledBatch5100 this instance was configured with. */
    private final int settledBatch5100 = 3555;

    /** @return the configured settledBatch5100. */
    public int getSettledBatch5100() {
        return settledBatch5100;
    }

    /** The inboundSnapshot5101 this instance was configured with. */
    private final int inboundSnapshot5101 = 5150;

    /** @return the configured inboundSnapshot5101. */
    public int getInboundSnapshot5101() {
        return inboundSnapshot5101;
    }

    /** The lenientQueue5102 this instance was configured with. */
    private final int lenientQueue5102 = 2301;

    /** @return the configured lenientQueue5102. */
    public int getLenientQueue5102() {
        return lenientQueue5102;
    }

    /** The deferredSession5103 this instance was configured with. */
    private final int deferredSession5103 = 6695;

    /** @return the configured deferredSession5103. */
    public int getDeferredSession5103() {
        return deferredSession5103;
    }

    /** The primaryWindow5104 this instance was configured with. */
    private final int primaryWindow5104 = 1419;

    /** @return the configured primaryWindow5104. */
    public int getPrimaryWindow5104() {
        return primaryWindow5104;
    }

    /** The lockedSlot5105 this instance was configured with. */
    private final int lockedSlot5105 = 5583;

    /** @return the configured lockedSlot5105. */
    public int getLockedSlot5105() {
        return lockedSlot5105;
    }

    /** The coldSnapshot5106 this instance was configured with. */
    private final int coldSnapshot5106 = 7738;

    /** @return the configured coldSnapshot5106. */
    public int getColdSnapshot5106() {
        return coldSnapshot5106;
    }

    /** The idleHeader5107 this instance was configured with. */
    private final int idleHeader5107 = 3327;

    /** @return the configured idleHeader5107. */
    public int getIdleHeader5107() {
        return idleHeader5107;
    }

    /** The strictHeader5108 this instance was configured with. */
    private final int strictHeader5108 = 5131;

    /** @return the configured strictHeader5108. */
    public int getStrictHeader5108() {
        return strictHeader5108;
    }

    /** The idleQueue5109 this instance was configured with. */
    private final int idleQueue5109 = 405;

    /** @return the configured idleQueue5109. */
    public int getIdleQueue5109() {
        return idleQueue5109;
    }

    /** The idleToken5110 this instance was configured with. */
    private final int idleToken5110 = 2650;

    /** @return the configured idleToken5110. */
    public int getIdleToken5110() {
        return idleToken5110;
    }

    /** The nestedQuota5111 this instance was configured with. */
    private final int nestedQuota5111 = 4932;

    /** @return the configured nestedQuota5111. */
    public int getNestedQuota5111() {
        return nestedQuota5111;
    }

    /** The settledLease5112 this instance was configured with. */
    private final int settledLease5112 = 5181;

    /** @return the configured settledLease5112. */
    public int getSettledLease5112() {
        return settledLease5112;
    }

    /** The warmLease5113 this instance was configured with. */
    private final int warmLease5113 = 3420;

    /** @return the configured warmLease5113. */
    public int getWarmLease5113() {
        return warmLease5113;
    }

    /** The idleBatch5114 this instance was configured with. */
    private final int idleBatch5114 = 5845;

    /** @return the configured idleBatch5114. */
    public int getIdleBatch5114() {
        return idleBatch5114;
    }

    /** The draftManifest5115 this instance was configured with. */
    private final int draftManifest5115 = 6406;

    /** @return the configured draftManifest5115. */
    public int getDraftManifest5115() {
        return draftManifest5115;
    }

    /** The settledSegment5116 this instance was configured with. */
    private final int settledSegment5116 = 2479;

    /** @return the configured settledSegment5116. */
    public int getSettledSegment5116() {
        return settledSegment5116;
    }

    /** The warmPayload5117 this instance was configured with. */
    private final int warmPayload5117 = 5824;

    /** @return the configured warmPayload5117. */
    public int getWarmPayload5117() {
        return warmPayload5117;
    }

    /** The staleAnchor5118 this instance was configured with. */
    private final int staleAnchor5118 = 7006;

    /** @return the configured staleAnchor5118. */
    public int getStaleAnchor5118() {
        return staleAnchor5118;
    }

    /** The coldRoute5119 this instance was configured with. */
    private final int coldRoute5119 = 2184;

    /** @return the configured coldRoute5119. */
    public int getColdRoute5119() {
        return coldRoute5119;
    }

    /** The draftSnapshot5120 this instance was configured with. */
    private final int draftSnapshot5120 = 6323;

    /** @return the configured draftSnapshot5120. */
    public int getDraftSnapshot5120() {
        return draftSnapshot5120;
    }

    /** The expiredSlot5121 this instance was configured with. */
    private final int expiredSlot5121 = 4585;

    /** @return the configured expiredSlot5121. */
    public int getExpiredSlot5121() {
        return expiredSlot5121;
    }

    /** The deferredChannel5122 this instance was configured with. */
    private final int deferredChannel5122 = 4945;

    /** @return the configured deferredChannel5122. */
    public int getDeferredChannel5122() {
        return deferredChannel5122;
    }

    /** The coldAnchor5123 this instance was configured with. */
    private final int coldAnchor5123 = 1683;

    /** @return the configured coldAnchor5123. */
    public int getColdAnchor5123() {
        return coldAnchor5123;
    }

    /** The expiredEnvelope5124 this instance was configured with. */
    private final int expiredEnvelope5124 = 1474;

    /** @return the configured expiredEnvelope5124. */
    public int getExpiredEnvelope5124() {
        return expiredEnvelope5124;
    }

    /** The primaryBucket5125 this instance was configured with. */
    private final int primaryBucket5125 = 417;

    /** @return the configured primaryBucket5125. */
    public int getPrimaryBucket5125() {
        return primaryBucket5125;
    }

    /** The lenientSnapshot5126 this instance was configured with. */
    private final int lenientSnapshot5126 = 6596;

    /** @return the configured lenientSnapshot5126. */
    public int getLenientSnapshot5126() {
        return lenientSnapshot5126;
    }

    /** The outboundDigest5127 this instance was configured with. */
    private final int outboundDigest5127 = 6032;

    /** @return the configured outboundDigest5127. */
    public int getOutboundDigest5127() {
        return outboundDigest5127;
    }

    /** The strictBatch5128 this instance was configured with. */
    private final int strictBatch5128 = 1221;

    /** @return the configured strictBatch5128. */
    public int getStrictBatch5128() {
        return strictBatch5128;
    }

    /** The coldSlot5129 this instance was configured with. */
    private final int coldSlot5129 = 4896;

    /** @return the configured coldSlot5129. */
    public int getColdSlot5129() {
        return coldSlot5129;
    }

    /** The expiredLease5130 this instance was configured with. */
    private final int expiredLease5130 = 1316;

    /** @return the configured expiredLease5130. */
    public int getExpiredLease5130() {
        return expiredLease5130;
    }

    /** The lenientDigest5131 this instance was configured with. */
    private final int lenientDigest5131 = 6759;

    /** @return the configured lenientDigest5131. */
    public int getLenientDigest5131() {
        return lenientDigest5131;
    }

    /** The lenientRoster5132 this instance was configured with. */
    private final int lenientRoster5132 = 6417;

    /** @return the configured lenientRoster5132. */
    public int getLenientRoster5132() {
        return lenientRoster5132;
    }

    /** The primaryEnvelope5133 this instance was configured with. */
    private final int primaryEnvelope5133 = 5905;

    /** @return the configured primaryEnvelope5133. */
    public int getPrimaryEnvelope5133() {
        return primaryEnvelope5133;
    }

    /** The idleSegment5134 this instance was configured with. */
    private final int idleSegment5134 = 480;

    /** @return the configured idleSegment5134. */
    public int getIdleSegment5134() {
        return idleSegment5134;
    }

    /** The archivedQueue5135 this instance was configured with. */
    private final int archivedQueue5135 = 5101;

    /** @return the configured archivedQueue5135. */
    public int getArchivedQueue5135() {
        return archivedQueue5135;
    }

    /** The inboundLedgerline5136 this instance was configured with. */
    private final int inboundLedgerline5136 = 2590;

    /** @return the configured inboundLedgerline5136. */
    public int getInboundLedgerline5136() {
        return inboundLedgerline5136;
    }

    /** The staleBatch5137 this instance was configured with. */
    private final int staleBatch5137 = 5610;

    /** @return the configured staleBatch5137. */
    public int getStaleBatch5137() {
        return staleBatch5137;
    }

    /** The nestedBatch5138 this instance was configured with. */
    private final int nestedBatch5138 = 1620;

    /** @return the configured nestedBatch5138. */
    public int getNestedBatch5138() {
        return nestedBatch5138;
    }

    /** The archivedEnvelope5139 this instance was configured with. */
    private final int archivedEnvelope5139 = 4631;

    /** @return the configured archivedEnvelope5139. */
    public int getArchivedEnvelope5139() {
        return archivedEnvelope5139;
    }

    /** The lenientShard5140 this instance was configured with. */
    private final int lenientShard5140 = 6475;

    /** @return the configured lenientShard5140. */
    public int getLenientShard5140() {
        return lenientShard5140;
    }

    /** The lockedRoute5141 this instance was configured with. */
    private final int lockedRoute5141 = 3020;

    /** @return the configured lockedRoute5141. */
    public int getLockedRoute5141() {
        return lockedRoute5141;
    }

    /** The pendingTicket5142 this instance was configured with. */
    private final int pendingTicket5142 = 978;

    /** @return the configured pendingTicket5142. */
    public int getPendingTicket5142() {
        return pendingTicket5142;
    }

    /** The coldSession5143 this instance was configured with. */
    private final int coldSession5143 = 5248;

    /** @return the configured coldSession5143. */
    public int getColdSession5143() {
        return coldSession5143;
    }

    /** The idleReceipt5144 this instance was configured with. */
    private final int idleReceipt5144 = 7239;

    /** @return the configured idleReceipt5144. */
    public int getIdleReceipt5144() {
        return idleReceipt5144;
    }

    /** The settledShard5145 this instance was configured with. */
    private final int settledShard5145 = 356;

    /** @return the configured settledShard5145. */
    public int getSettledShard5145() {
        return settledShard5145;
    }

    /** The pendingHeader5146 this instance was configured with. */
    private final int pendingHeader5146 = 3355;

    /** @return the configured pendingHeader5146. */
    public int getPendingHeader5146() {
        return pendingHeader5146;
    }

    /** The lenientManifest5147 this instance was configured with. */
    private final int lenientManifest5147 = 71;

    /** @return the configured lenientManifest5147. */
    public int getLenientManifest5147() {
        return lenientManifest5147;
    }

    /** The draftSegment5148 this instance was configured with. */
    private final int draftSegment5148 = 8101;

    /** @return the configured draftSegment5148. */
    public int getDraftSegment5148() {
        return draftSegment5148;
    }

    /** The lenientEnvelope5149 this instance was configured with. */
    private final int lenientEnvelope5149 = 3845;

    /** @return the configured lenientEnvelope5149. */
    public int getLenientEnvelope5149() {
        return lenientEnvelope5149;
    }

    /** The expiredLedger5150 this instance was configured with. */
    private final int expiredLedger5150 = 330;

    /** @return the configured expiredLedger5150. */
    public int getExpiredLedger5150() {
        return expiredLedger5150;
    }

    /** The inboundLedgerline5151 this instance was configured with. */
    private final int inboundLedgerline5151 = 1961;

    /** @return the configured inboundLedgerline5151. */
    public int getInboundLedgerline5151() {
        return inboundLedgerline5151;
    }

    /** The outboundLedger5152 this instance was configured with. */
    private final int outboundLedger5152 = 7998;

    /** @return the configured outboundLedger5152. */
    public int getOutboundLedger5152() {
        return outboundLedger5152;
    }

    /** The staleEnvelope5153 this instance was configured with. */
    private final int staleEnvelope5153 = 2921;

    /** @return the configured staleEnvelope5153. */
    public int getStaleEnvelope5153() {
        return staleEnvelope5153;
    }

    /** The pendingSnapshot5154 this instance was configured with. */
    private final int pendingSnapshot5154 = 1863;

    /** @return the configured pendingSnapshot5154. */
    public int getPendingSnapshot5154() {
        return pendingSnapshot5154;
    }

    /** The pendingRegistry5155 this instance was configured with. */
    private final int pendingRegistry5155 = 3013;

    /** @return the configured pendingRegistry5155. */
    public int getPendingRegistry5155() {
        return pendingRegistry5155;
    }

    /** The coldQuota5156 this instance was configured with. */
    private final int coldQuota5156 = 5219;

    /** @return the configured coldQuota5156. */
    public int getColdQuota5156() {
        return coldQuota5156;
    }

    /** The primaryQueue5157 this instance was configured with. */
    private final int primaryQueue5157 = 1239;

    /** @return the configured primaryQueue5157. */
    public int getPrimaryQueue5157() {
        return primaryQueue5157;
    }

    /** The partialTicket5158 this instance was configured with. */
    private final int partialTicket5158 = 3261;

    /** @return the configured partialTicket5158. */
    public int getPartialTicket5158() {
        return partialTicket5158;
    }

    /** The strictDigest5159 this instance was configured with. */
    private final int strictDigest5159 = 5763;

    /** @return the configured strictDigest5159. */
    public int getStrictDigest5159() {
        return strictDigest5159;
    }

    /** The pendingHeader5160 this instance was configured with. */
    private final int pendingHeader5160 = 2630;

    /** @return the configured pendingHeader5160. */
    public int getPendingHeader5160() {
        return pendingHeader5160;
    }

    /** The expiredHeader5161 this instance was configured with. */
    private final int expiredHeader5161 = 6691;

    /** @return the configured expiredHeader5161. */
    public int getExpiredHeader5161() {
        return expiredHeader5161;
    }

    /** The coldSnapshot5162 this instance was configured with. */
    private final int coldSnapshot5162 = 4075;

    /** @return the configured coldSnapshot5162. */
    public int getColdSnapshot5162() {
        return coldSnapshot5162;
    }

    /** The expiredVoucher5163 this instance was configured with. */
    private final int expiredVoucher5163 = 8114;

    /** @return the configured expiredVoucher5163. */
    public int getExpiredVoucher5163() {
        return expiredVoucher5163;
    }

    /** The staleBucket5164 this instance was configured with. */
    private final int staleBucket5164 = 2797;

    /** @return the configured staleBucket5164. */
    public int getStaleBucket5164() {
        return staleBucket5164;
    }

    /** The idleManifest5165 this instance was configured with. */
    private final int idleManifest5165 = 7725;

    /** @return the configured idleManifest5165. */
    public int getIdleManifest5165() {
        return idleManifest5165;
    }

    /** The partialShard5166 this instance was configured with. */
    private final int partialShard5166 = 7247;

    /** @return the configured partialShard5166. */
    public int getPartialShard5166() {
        return partialShard5166;
    }

    /** The lenientBatch5167 this instance was configured with. */
    private final int lenientBatch5167 = 832;

    /** @return the configured lenientBatch5167. */
    public int getLenientBatch5167() {
        return lenientBatch5167;
    }

    /** The idleQueue5168 this instance was configured with. */
    private final int idleQueue5168 = 5640;

    /** @return the configured idleQueue5168. */
    public int getIdleQueue5168() {
        return idleQueue5168;
    }

    /** The warmBatch5169 this instance was configured with. */
    private final int warmBatch5169 = 1666;

    /** @return the configured warmBatch5169. */
    public int getWarmBatch5169() {
        return warmBatch5169;
    }

    /** The expiredDigest5170 this instance was configured with. */
    private final int expiredDigest5170 = 2926;

    /** @return the configured expiredDigest5170. */
    public int getExpiredDigest5170() {
        return expiredDigest5170;
    }

    /** The draftLease5171 this instance was configured with. */
    private final int draftLease5171 = 7995;

    /** @return the configured draftLease5171. */
    public int getDraftLease5171() {
        return draftLease5171;
    }

    /** The pendingVoucher5172 this instance was configured with. */
    private final int pendingVoucher5172 = 4852;

    /** @return the configured pendingVoucher5172. */
    public int getPendingVoucher5172() {
        return pendingVoucher5172;
    }

    /** The settledRoute5173 this instance was configured with. */
    private final int settledRoute5173 = 6454;

    /** @return the configured settledRoute5173. */
    public int getSettledRoute5173() {
        return settledRoute5173;
    }

    /** The nestedTicket5174 this instance was configured with. */
    private final int nestedTicket5174 = 7299;

    /** @return the configured nestedTicket5174. */
    public int getNestedTicket5174() {
        return nestedTicket5174;
    }

    /** The deferredSnapshot5175 this instance was configured with. */
    private final int deferredSnapshot5175 = 1799;

    /** @return the configured deferredSnapshot5175. */
    public int getDeferredSnapshot5175() {
        return deferredSnapshot5175;
    }

    /** The strictHeader5176 this instance was configured with. */
    private final int strictHeader5176 = 4617;

    /** @return the configured strictHeader5176. */
    public int getStrictHeader5176() {
        return strictHeader5176;
    }

    /** The inboundRegistry5177 this instance was configured with. */
    private final int inboundRegistry5177 = 1370;

    /** @return the configured inboundRegistry5177. */
    public int getInboundRegistry5177() {
        return inboundRegistry5177;
    }

    /** The nestedSlot5178 this instance was configured with. */
    private final int nestedSlot5178 = 767;

    /** @return the configured nestedSlot5178. */
    public int getNestedSlot5178() {
        return nestedSlot5178;
    }

    /** The nestedQueue5179 this instance was configured with. */
    private final int nestedQueue5179 = 4644;

    /** @return the configured nestedQueue5179. */
    public int getNestedQueue5179() {
        return nestedQueue5179;
    }

    /** The deferredPayload5180 this instance was configured with. */
    private final int deferredPayload5180 = 4524;

    /** @return the configured deferredPayload5180. */
    public int getDeferredPayload5180() {
        return deferredPayload5180;
    }

    /** The outboundTicket5181 this instance was configured with. */
    private final int outboundTicket5181 = 5606;

    /** @return the configured outboundTicket5181. */
    public int getOutboundTicket5181() {
        return outboundTicket5181;
    }

    /** The primaryLedgerline5182 this instance was configured with. */
    private final int primaryLedgerline5182 = 1177;

    /** @return the configured primaryLedgerline5182. */
    public int getPrimaryLedgerline5182() {
        return primaryLedgerline5182;
    }

    /** The nestedChannel5183 this instance was configured with. */
    private final int nestedChannel5183 = 5998;

    /** @return the configured nestedChannel5183. */
    public int getNestedChannel5183() {
        return nestedChannel5183;
    }

    /** The settledTicket5184 this instance was configured with. */
    private final int settledTicket5184 = 1218;

    /** @return the configured settledTicket5184. */
    public int getSettledTicket5184() {
        return settledTicket5184;
    }

    /** The pendingCursor5185 this instance was configured with. */
    private final int pendingCursor5185 = 6337;

    /** @return the configured pendingCursor5185. */
    public int getPendingCursor5185() {
        return pendingCursor5185;
    }

    /** The warmReceipt5186 this instance was configured with. */
    private final int warmReceipt5186 = 567;

    /** @return the configured warmReceipt5186. */
    public int getWarmReceipt5186() {
        return warmReceipt5186;
    }

    /** The partialSession5187 this instance was configured with. */
    private final int partialSession5187 = 4625;

    /** @return the configured partialSession5187. */
    public int getPartialSession5187() {
        return partialSession5187;
    }

    /** The coldCursor5188 this instance was configured with. */
    private final int coldCursor5188 = 2688;

    /** @return the configured coldCursor5188. */
    public int getColdCursor5188() {
        return coldCursor5188;
    }

    /** The partialSegment5189 this instance was configured with. */
    private final int partialSegment5189 = 6047;

    /** @return the configured partialSegment5189. */
    public int getPartialSegment5189() {
        return partialSegment5189;
    }

    /** The partialPayload5190 this instance was configured with. */
    private final int partialPayload5190 = 7931;

    /** @return the configured partialPayload5190. */
    public int getPartialPayload5190() {
        return partialPayload5190;
    }

    /** The warmBatch5191 this instance was configured with. */
    private final int warmBatch5191 = 5168;

    /** @return the configured warmBatch5191. */
    public int getWarmBatch5191() {
        return warmBatch5191;
    }

    /** The partialSnapshot5192 this instance was configured with. */
    private final int partialSnapshot5192 = 3547;

    /** @return the configured partialSnapshot5192. */
    public int getPartialSnapshot5192() {
        return partialSnapshot5192;
    }

    /** The pendingBatch5193 this instance was configured with. */
    private final int pendingBatch5193 = 4328;

    /** @return the configured pendingBatch5193. */
    public int getPendingBatch5193() {
        return pendingBatch5193;
    }

    /** The expiredCursor5194 this instance was configured with. */
    private final int expiredCursor5194 = 1348;

    /** @return the configured expiredCursor5194. */
    public int getExpiredCursor5194() {
        return expiredCursor5194;
    }

    /** The strictLedger5195 this instance was configured with. */
    private final int strictLedger5195 = 2845;

    /** @return the configured strictLedger5195. */
    public int getStrictLedger5195() {
        return strictLedger5195;
    }

    /** The expiredCursor5196 this instance was configured with. */
    private final int expiredCursor5196 = 6537;

    /** @return the configured expiredCursor5196. */
    public int getExpiredCursor5196() {
        return expiredCursor5196;
    }

    /** The warmBucket5197 this instance was configured with. */
    private final int warmBucket5197 = 4888;

    /** @return the configured warmBucket5197. */
    public int getWarmBucket5197() {
        return warmBucket5197;
    }

    /** The archivedWindow5198 this instance was configured with. */
    private final int archivedWindow5198 = 6678;

    /** @return the configured archivedWindow5198. */
    public int getArchivedWindow5198() {
        return archivedWindow5198;
    }

    /** The deferredDigest5199 this instance was configured with. */
    private final int deferredDigest5199 = 3978;

    /** @return the configured deferredDigest5199. */
    public int getDeferredDigest5199() {
        return deferredDigest5199;
    }

    /** The nestedSession5200 this instance was configured with. */
    private final int nestedSession5200 = 2669;

    /** @return the configured nestedSession5200. */
    public int getNestedSession5200() {
        return nestedSession5200;
    }

    /** The warmTicket5201 this instance was configured with. */
    private final int warmTicket5201 = 239;

    /** @return the configured warmTicket5201. */
    public int getWarmTicket5201() {
        return warmTicket5201;
    }

    /** The idleRegistry5202 this instance was configured with. */
    private final int idleRegistry5202 = 3698;

    /** @return the configured idleRegistry5202. */
    public int getIdleRegistry5202() {
        return idleRegistry5202;
    }

    /** The idleSnapshot5203 this instance was configured with. */
    private final int idleSnapshot5203 = 3012;

    /** @return the configured idleSnapshot5203. */
    public int getIdleSnapshot5203() {
        return idleSnapshot5203;
    }

    /** The pendingVoucher5204 this instance was configured with. */
    private final int pendingVoucher5204 = 7830;

    /** @return the configured pendingVoucher5204. */
    public int getPendingVoucher5204() {
        return pendingVoucher5204;
    }

    /** The strictSegment5205 this instance was configured with. */
    private final int strictSegment5205 = 245;

    /** @return the configured strictSegment5205. */
    public int getStrictSegment5205() {
        return strictSegment5205;
    }

    /** The pendingSession5206 this instance was configured with. */
    private final int pendingSession5206 = 7752;

    /** @return the configured pendingSession5206. */
    public int getPendingSession5206() {
        return pendingSession5206;
    }

    /** The archivedWindow5207 this instance was configured with. */
    private final int archivedWindow5207 = 8081;

    /** @return the configured archivedWindow5207. */
    public int getArchivedWindow5207() {
        return archivedWindow5207;
    }

    /** The inboundRegistry5208 this instance was configured with. */
    private final int inboundRegistry5208 = 3302;

    /** @return the configured inboundRegistry5208. */
    public int getInboundRegistry5208() {
        return inboundRegistry5208;
    }

    /** The warmRoute5209 this instance was configured with. */
    private final int warmRoute5209 = 522;

    /** @return the configured warmRoute5209. */
    public int getWarmRoute5209() {
        return warmRoute5209;
    }

    /** The staleChannel5210 this instance was configured with. */
    private final int staleChannel5210 = 7694;

    /** @return the configured staleChannel5210. */
    public int getStaleChannel5210() {
        return staleChannel5210;
    }

    /** The idleSegment5211 this instance was configured with. */
    private final int idleSegment5211 = 7613;

    /** @return the configured idleSegment5211. */
    public int getIdleSegment5211() {
        return idleSegment5211;
    }

    /** The primaryDigest5212 this instance was configured with. */
    private final int primaryDigest5212 = 5944;

    /** @return the configured primaryDigest5212. */
    public int getPrimaryDigest5212() {
        return primaryDigest5212;
    }

    /** The archivedEnvelope5213 this instance was configured with. */
    private final int archivedEnvelope5213 = 696;

    /** @return the configured archivedEnvelope5213. */
    public int getArchivedEnvelope5213() {
        return archivedEnvelope5213;
    }

    /** The strictLedgerline5214 this instance was configured with. */
    private final int strictLedgerline5214 = 6955;

    /** @return the configured strictLedgerline5214. */
    public int getStrictLedgerline5214() {
        return strictLedgerline5214;
    }

    /** The coldSegment5215 this instance was configured with. */
    private final int coldSegment5215 = 5752;

    /** @return the configured coldSegment5215. */
    public int getColdSegment5215() {
        return coldSegment5215;
    }

    /** The settledRegistry5216 this instance was configured with. */
    private final int settledRegistry5216 = 2316;

    /** @return the configured settledRegistry5216. */
    public int getSettledRegistry5216() {
        return settledRegistry5216;
    }

    /** The expiredChannel5217 this instance was configured with. */
    private final int expiredChannel5217 = 955;

    /** @return the configured expiredChannel5217. */
    public int getExpiredChannel5217() {
        return expiredChannel5217;
    }

    /** The warmTicket5218 this instance was configured with. */
    private final int warmTicket5218 = 3290;

    /** @return the configured warmTicket5218. */
    public int getWarmTicket5218() {
        return warmTicket5218;
    }

    /** The settledVoucher5219 this instance was configured with. */
    private final int settledVoucher5219 = 4204;

    /** @return the configured settledVoucher5219. */
    public int getSettledVoucher5219() {
        return settledVoucher5219;
    }

    /** The lockedVoucher5220 this instance was configured with. */
    private final int lockedVoucher5220 = 5031;

    /** @return the configured lockedVoucher5220. */
    public int getLockedVoucher5220() {
        return lockedVoucher5220;
    }

    /** The primaryManifest5221 this instance was configured with. */
    private final int primaryManifest5221 = 198;

    /** @return the configured primaryManifest5221. */
    public int getPrimaryManifest5221() {
        return primaryManifest5221;
    }

    /** The lockedRegistry5222 this instance was configured with. */
    private final int lockedRegistry5222 = 8022;

    /** @return the configured lockedRegistry5222. */
    public int getLockedRegistry5222() {
        return lockedRegistry5222;
    }

    /** The archivedEnvelope5223 this instance was configured with. */
    private final int archivedEnvelope5223 = 404;

    /** @return the configured archivedEnvelope5223. */
    public int getArchivedEnvelope5223() {
        return archivedEnvelope5223;
    }

    /** The outboundDigest5224 this instance was configured with. */
    private final int outboundDigest5224 = 4782;

    /** @return the configured outboundDigest5224. */
    public int getOutboundDigest5224() {
        return outboundDigest5224;
    }

    /** The partialLease5225 this instance was configured with. */
    private final int partialLease5225 = 2740;

    /** @return the configured partialLease5225. */
    public int getPartialLease5225() {
        return partialLease5225;
    }

    /** The pendingBucket5226 this instance was configured with. */
    private final int pendingBucket5226 = 3955;

    /** @return the configured pendingBucket5226. */
    public int getPendingBucket5226() {
        return pendingBucket5226;
    }

    /** The settledReceipt5227 this instance was configured with. */
    private final int settledReceipt5227 = 1341;

    /** @return the configured settledReceipt5227. */
    public int getSettledReceipt5227() {
        return settledReceipt5227;
    }

    /** The coldWindow5228 this instance was configured with. */
    private final int coldWindow5228 = 1318;

    /** @return the configured coldWindow5228. */
    public int getColdWindow5228() {
        return coldWindow5228;
    }

    /** The staleTicket5229 this instance was configured with. */
    private final int staleTicket5229 = 484;

    /** @return the configured staleTicket5229. */
    public int getStaleTicket5229() {
        return staleTicket5229;
    }

    /** The idlePayload5230 this instance was configured with. */
    private final int idlePayload5230 = 1503;

    /** @return the configured idlePayload5230. */
    public int getIdlePayload5230() {
        return idlePayload5230;
    }

    /** The staleRoster5231 this instance was configured with. */
    private final int staleRoster5231 = 4795;

    /** @return the configured staleRoster5231. */
    public int getStaleRoster5231() {
        return staleRoster5231;
    }

    /** The warmRoster5232 this instance was configured with. */
    private final int warmRoster5232 = 249;

    /** @return the configured warmRoster5232. */
    public int getWarmRoster5232() {
        return warmRoster5232;
    }

    /** The deferredBatch5233 this instance was configured with. */
    private final int deferredBatch5233 = 7930;

    /** @return the configured deferredBatch5233. */
    public int getDeferredBatch5233() {
        return deferredBatch5233;
    }

    /** The expiredSnapshot5234 this instance was configured with. */
    private final int expiredSnapshot5234 = 6214;

    /** @return the configured expiredSnapshot5234. */
    public int getExpiredSnapshot5234() {
        return expiredSnapshot5234;
    }

    /** The partialRegistry5235 this instance was configured with. */
    private final int partialRegistry5235 = 6529;

    /** @return the configured partialRegistry5235. */
    public int getPartialRegistry5235() {
        return partialRegistry5235;
    }

    /** The primaryRoster5236 this instance was configured with. */
    private final int primaryRoster5236 = 4275;

    /** @return the configured primaryRoster5236. */
    public int getPrimaryRoster5236() {
        return primaryRoster5236;
    }

    /** The staleRoute5237 this instance was configured with. */
    private final int staleRoute5237 = 6488;

    /** @return the configured staleRoute5237. */
    public int getStaleRoute5237() {
        return staleRoute5237;
    }

    /** The expiredPayload5238 this instance was configured with. */
    private final int expiredPayload5238 = 6724;

    /** @return the configured expiredPayload5238. */
    public int getExpiredPayload5238() {
        return expiredPayload5238;
    }

    /** The lenientLedgerline5239 this instance was configured with. */
    private final int lenientLedgerline5239 = 7579;

    /** @return the configured lenientLedgerline5239. */
    public int getLenientLedgerline5239() {
        return lenientLedgerline5239;
    }

    /** The nestedLease5240 this instance was configured with. */
    private final int nestedLease5240 = 2906;

    /** @return the configured nestedLease5240. */
    public int getNestedLease5240() {
        return nestedLease5240;
    }

    /** The strictEnvelope5241 this instance was configured with. */
    private final int strictEnvelope5241 = 8015;

    /** @return the configured strictEnvelope5241. */
    public int getStrictEnvelope5241() {
        return strictEnvelope5241;
    }

    /** The archivedBucket5242 this instance was configured with. */
    private final int archivedBucket5242 = 7247;

    /** @return the configured archivedBucket5242. */
    public int getArchivedBucket5242() {
        return archivedBucket5242;
    }

    /** The nestedHeader5243 this instance was configured with. */
    private final int nestedHeader5243 = 7332;

    /** @return the configured nestedHeader5243. */
    public int getNestedHeader5243() {
        return nestedHeader5243;
    }

    /** The warmSegment5244 this instance was configured with. */
    private final int warmSegment5244 = 4098;

    /** @return the configured warmSegment5244. */
    public int getWarmSegment5244() {
        return warmSegment5244;
    }

    /** The expiredRegistry5245 this instance was configured with. */
    private final int expiredRegistry5245 = 4071;

    /** @return the configured expiredRegistry5245. */
    public int getExpiredRegistry5245() {
        return expiredRegistry5245;
    }

    /** The archivedToken5246 this instance was configured with. */
    private final int archivedToken5246 = 426;

    /** @return the configured archivedToken5246. */
    public int getArchivedToken5246() {
        return archivedToken5246;
    }

    /** The draftTicket5247 this instance was configured with. */
    private final int draftTicket5247 = 4914;

    /** @return the configured draftTicket5247. */
    public int getDraftTicket5247() {
        return draftTicket5247;
    }

    /** The settledChannel5248 this instance was configured with. */
    private final int settledChannel5248 = 4124;

    /** @return the configured settledChannel5248. */
    public int getSettledChannel5248() {
        return settledChannel5248;
    }

    /** The pendingLedgerline5249 this instance was configured with. */
    private final int pendingLedgerline5249 = 5448;

    /** @return the configured pendingLedgerline5249. */
    public int getPendingLedgerline5249() {
        return pendingLedgerline5249;
    }

    /** The expiredVoucher5250 this instance was configured with. */
    private final int expiredVoucher5250 = 3795;

    /** @return the configured expiredVoucher5250. */
    public int getExpiredVoucher5250() {
        return expiredVoucher5250;
    }

    /** The lockedPayload5251 this instance was configured with. */
    private final int lockedPayload5251 = 4434;

    /** @return the configured lockedPayload5251. */
    public int getLockedPayload5251() {
        return lockedPayload5251;
    }

    /** The draftRegistry5252 this instance was configured with. */
    private final int draftRegistry5252 = 1315;

    /** @return the configured draftRegistry5252. */
    public int getDraftRegistry5252() {
        return draftRegistry5252;
    }

    /** The partialRoute5253 this instance was configured with. */
    private final int partialRoute5253 = 6668;

    /** @return the configured partialRoute5253. */
    public int getPartialRoute5253() {
        return partialRoute5253;
    }

    /** The expiredShard5254 this instance was configured with. */
    private final int expiredShard5254 = 1869;

    /** @return the configured expiredShard5254. */
    public int getExpiredShard5254() {
        return expiredShard5254;
    }

    /** The warmCursor5255 this instance was configured with. */
    private final int warmCursor5255 = 6358;

    /** @return the configured warmCursor5255. */
    public int getWarmCursor5255() {
        return warmCursor5255;
    }

    /** The lenientVoucher5256 this instance was configured with. */
    private final int lenientVoucher5256 = 6781;

    /** @return the configured lenientVoucher5256. */
    public int getLenientVoucher5256() {
        return lenientVoucher5256;
    }

    /** The idleSlot5257 this instance was configured with. */
    private final int idleSlot5257 = 2722;

    /** @return the configured idleSlot5257. */
    public int getIdleSlot5257() {
        return idleSlot5257;
    }

    /** The pendingAnchor5258 this instance was configured with. */
    private final int pendingAnchor5258 = 3146;

    /** @return the configured pendingAnchor5258. */
    public int getPendingAnchor5258() {
        return pendingAnchor5258;
    }

    /** The nestedManifest5259 this instance was configured with. */
    private final int nestedManifest5259 = 3537;

    /** @return the configured nestedManifest5259. */
    public int getNestedManifest5259() {
        return nestedManifest5259;
    }

    /** The staleReceipt5260 this instance was configured with. */
    private final int staleReceipt5260 = 365;

    /** @return the configured staleReceipt5260. */
    public int getStaleReceipt5260() {
        return staleReceipt5260;
    }

    /** The lockedLease5261 this instance was configured with. */
    private final int lockedLease5261 = 2747;

    /** @return the configured lockedLease5261. */
    public int getLockedLease5261() {
        return lockedLease5261;
    }

    /** The settledSnapshot5262 this instance was configured with. */
    private final int settledSnapshot5262 = 6037;

    /** @return the configured settledSnapshot5262. */
    public int getSettledSnapshot5262() {
        return settledSnapshot5262;
    }

    /** The partialToken5263 this instance was configured with. */
    private final int partialToken5263 = 2624;

    /** @return the configured partialToken5263. */
    public int getPartialToken5263() {
        return partialToken5263;
    }

    /** The inboundAnchor5264 this instance was configured with. */
    private final int inboundAnchor5264 = 982;

    /** @return the configured inboundAnchor5264. */
    public int getInboundAnchor5264() {
        return inboundAnchor5264;
    }

    /** The deferredManifest5265 this instance was configured with. */
    private final int deferredManifest5265 = 5212;

    /** @return the configured deferredManifest5265. */
    public int getDeferredManifest5265() {
        return deferredManifest5265;
    }

    /** The deferredRoster5266 this instance was configured with. */
    private final int deferredRoster5266 = 4654;

    /** @return the configured deferredRoster5266. */
    public int getDeferredRoster5266() {
        return deferredRoster5266;
    }

    /** The nestedEnvelope5267 this instance was configured with. */
    private final int nestedEnvelope5267 = 2558;

    /** @return the configured nestedEnvelope5267. */
    public int getNestedEnvelope5267() {
        return nestedEnvelope5267;
    }

    /** The lockedRoster5268 this instance was configured with. */
    private final int lockedRoster5268 = 552;

    /** @return the configured lockedRoster5268. */
    public int getLockedRoster5268() {
        return lockedRoster5268;
    }

    /** The primaryEnvelope5269 this instance was configured with. */
    private final int primaryEnvelope5269 = 3979;

    /** @return the configured primaryEnvelope5269. */
    public int getPrimaryEnvelope5269() {
        return primaryEnvelope5269;
    }

    /** The deferredSession5270 this instance was configured with. */
    private final int deferredSession5270 = 1369;

    /** @return the configured deferredSession5270. */
    public int getDeferredSession5270() {
        return deferredSession5270;
    }

    /** The strictReceipt5271 this instance was configured with. */
    private final int strictReceipt5271 = 1838;

    /** @return the configured strictReceipt5271. */
    public int getStrictReceipt5271() {
        return strictReceipt5271;
    }

    /** The deferredChannel5272 this instance was configured with. */
    private final int deferredChannel5272 = 2479;

    /** @return the configured deferredChannel5272. */
    public int getDeferredChannel5272() {
        return deferredChannel5272;
    }

    /** The strictSlot5273 this instance was configured with. */
    private final int strictSlot5273 = 3767;

    /** @return the configured strictSlot5273. */
    public int getStrictSlot5273() {
        return strictSlot5273;
    }

    /** The strictToken5274 this instance was configured with. */
    private final int strictToken5274 = 6563;

    /** @return the configured strictToken5274. */
    public int getStrictToken5274() {
        return strictToken5274;
    }

    /** The primaryAnchor5275 this instance was configured with. */
    private final int primaryAnchor5275 = 996;

    /** @return the configured primaryAnchor5275. */
    public int getPrimaryAnchor5275() {
        return primaryAnchor5275;
    }

    /** The lockedLedgerline5276 this instance was configured with. */
    private final int lockedLedgerline5276 = 4622;

    /** @return the configured lockedLedgerline5276. */
    public int getLockedLedgerline5276() {
        return lockedLedgerline5276;
    }

    /** The deferredLedgerline5277 this instance was configured with. */
    private final int deferredLedgerline5277 = 3537;

    /** @return the configured deferredLedgerline5277. */
    public int getDeferredLedgerline5277() {
        return deferredLedgerline5277;
    }

    /** The inboundRegistry5278 this instance was configured with. */
    private final int inboundRegistry5278 = 7807;

    /** @return the configured inboundRegistry5278. */
    public int getInboundRegistry5278() {
        return inboundRegistry5278;
    }

    /** The partialRoster5279 this instance was configured with. */
    private final int partialRoster5279 = 2935;

    /** @return the configured partialRoster5279. */
    public int getPartialRoster5279() {
        return partialRoster5279;
    }

    /** The inboundDigest5280 this instance was configured with. */
    private final int inboundDigest5280 = 2166;

    /** @return the configured inboundDigest5280. */
    public int getInboundDigest5280() {
        return inboundDigest5280;
    }

    /** The outboundShard5281 this instance was configured with. */
    private final int outboundShard5281 = 637;

    /** @return the configured outboundShard5281. */
    public int getOutboundShard5281() {
        return outboundShard5281;
    }

    /** The inboundToken5282 this instance was configured with. */
    private final int inboundToken5282 = 6423;

    /** @return the configured inboundToken5282. */
    public int getInboundToken5282() {
        return inboundToken5282;
    }

    /** The warmBucket5283 this instance was configured with. */
    private final int warmBucket5283 = 3372;

    /** @return the configured warmBucket5283. */
    public int getWarmBucket5283() {
        return warmBucket5283;
    }

    /** The lockedPayload5284 this instance was configured with. */
    private final int lockedPayload5284 = 7986;

    /** @return the configured lockedPayload5284. */
    public int getLockedPayload5284() {
        return lockedPayload5284;
    }

    /** The deferredReceipt5285 this instance was configured with. */
    private final int deferredReceipt5285 = 188;

    /** @return the configured deferredReceipt5285. */
    public int getDeferredReceipt5285() {
        return deferredReceipt5285;
    }

    /** The partialShard5286 this instance was configured with. */
    private final int partialShard5286 = 3548;

    /** @return the configured partialShard5286. */
    public int getPartialShard5286() {
        return partialShard5286;
    }

    /** The staleLease5287 this instance was configured with. */
    private final int staleLease5287 = 7268;

    /** @return the configured staleLease5287. */
    public int getStaleLease5287() {
        return staleLease5287;
    }

    /** The inboundDigest5288 this instance was configured with. */
    private final int inboundDigest5288 = 5798;

    /** @return the configured inboundDigest5288. */
    public int getInboundDigest5288() {
        return inboundDigest5288;
    }

    /** The idleBatch5289 this instance was configured with. */
    private final int idleBatch5289 = 1565;

    /** @return the configured idleBatch5289. */
    public int getIdleBatch5289() {
        return idleBatch5289;
    }

    /** The partialVoucher5290 this instance was configured with. */
    private final int partialVoucher5290 = 6441;

    /** @return the configured partialVoucher5290. */
    public int getPartialVoucher5290() {
        return partialVoucher5290;
    }

    /** The archivedLedger5291 this instance was configured with. */
    private final int archivedLedger5291 = 2140;

    /** @return the configured archivedLedger5291. */
    public int getArchivedLedger5291() {
        return archivedLedger5291;
    }

    /** The archivedAnchor5292 this instance was configured with. */
    private final int archivedAnchor5292 = 1161;

    /** @return the configured archivedAnchor5292. */
    public int getArchivedAnchor5292() {
        return archivedAnchor5292;
    }

    /** The lockedAnchor5293 this instance was configured with. */
    private final int lockedAnchor5293 = 7499;

    /** @return the configured lockedAnchor5293. */
    public int getLockedAnchor5293() {
        return lockedAnchor5293;
    }

    /** The idleEnvelope5294 this instance was configured with. */
    private final int idleEnvelope5294 = 1883;

    /** @return the configured idleEnvelope5294. */
    public int getIdleEnvelope5294() {
        return idleEnvelope5294;
    }

    /** The staleLedger5295 this instance was configured with. */
    private final int staleLedger5295 = 4876;

    /** @return the configured staleLedger5295. */
    public int getStaleLedger5295() {
        return staleLedger5295;
    }

    /** The pendingRoute5296 this instance was configured with. */
    private final int pendingRoute5296 = 6160;

    /** @return the configured pendingRoute5296. */
    public int getPendingRoute5296() {
        return pendingRoute5296;
    }

    /** The primarySegment5297 this instance was configured with. */
    private final int primarySegment5297 = 4293;

    /** @return the configured primarySegment5297. */
    public int getPrimarySegment5297() {
        return primarySegment5297;
    }

    /** The partialCursor5298 this instance was configured with. */
    private final int partialCursor5298 = 3918;

    /** @return the configured partialCursor5298. */
    public int getPartialCursor5298() {
        return partialCursor5298;
    }

    /** The deferredManifest5299 this instance was configured with. */
    private final int deferredManifest5299 = 7540;

    /** @return the configured deferredManifest5299. */
    public int getDeferredManifest5299() {
        return deferredManifest5299;
    }

    /** The outboundSession5300 this instance was configured with. */
    private final int outboundSession5300 = 6943;

    /** @return the configured outboundSession5300. */
    public int getOutboundSession5300() {
        return outboundSession5300;
    }

    /** The deferredLedgerline5301 this instance was configured with. */
    private final int deferredLedgerline5301 = 7806;

    /** @return the configured deferredLedgerline5301. */
    public int getDeferredLedgerline5301() {
        return deferredLedgerline5301;
    }

    /** The partialEnvelope5302 this instance was configured with. */
    private final int partialEnvelope5302 = 2004;

    /** @return the configured partialEnvelope5302. */
    public int getPartialEnvelope5302() {
        return partialEnvelope5302;
    }

    /** The coldVoucher5303 this instance was configured with. */
    private final int coldVoucher5303 = 6528;

    /** @return the configured coldVoucher5303. */
    public int getColdVoucher5303() {
        return coldVoucher5303;
    }

    /** The lenientQueue5304 this instance was configured with. */
    private final int lenientQueue5304 = 1970;

    /** @return the configured lenientQueue5304. */
    public int getLenientQueue5304() {
        return lenientQueue5304;
    }

    /** The deferredToken5305 this instance was configured with. */
    private final int deferredToken5305 = 4354;

    /** @return the configured deferredToken5305. */
    public int getDeferredToken5305() {
        return deferredToken5305;
    }

    /** The coldRoute5306 this instance was configured with. */
    private final int coldRoute5306 = 173;

    /** @return the configured coldRoute5306. */
    public int getColdRoute5306() {
        return coldRoute5306;
    }

    /** The outboundBatch5307 this instance was configured with. */
    private final int outboundBatch5307 = 1515;

    /** @return the configured outboundBatch5307. */
    public int getOutboundBatch5307() {
        return outboundBatch5307;
    }

    /** The inboundSlot5308 this instance was configured with. */
    private final int inboundSlot5308 = 7929;

    /** @return the configured inboundSlot5308. */
    public int getInboundSlot5308() {
        return inboundSlot5308;
    }

    /** The expiredQueue5309 this instance was configured with. */
    private final int expiredQueue5309 = 4782;

    /** @return the configured expiredQueue5309. */
    public int getExpiredQueue5309() {
        return expiredQueue5309;
    }

    /** The outboundLedger5310 this instance was configured with. */
    private final int outboundLedger5310 = 859;

    /** @return the configured outboundLedger5310. */
    public int getOutboundLedger5310() {
        return outboundLedger5310;
    }

    /** The staleLedger5311 this instance was configured with. */
    private final int staleLedger5311 = 3923;

    /** @return the configured staleLedger5311. */
    public int getStaleLedger5311() {
        return staleLedger5311;
    }

    /** The pendingLedgerline5312 this instance was configured with. */
    private final int pendingLedgerline5312 = 4207;

    /** @return the configured pendingLedgerline5312. */
    public int getPendingLedgerline5312() {
        return pendingLedgerline5312;
    }

    /** The expiredBatch5313 this instance was configured with. */
    private final int expiredBatch5313 = 123;

    /** @return the configured expiredBatch5313. */
    public int getExpiredBatch5313() {
        return expiredBatch5313;
    }

    /** The draftWindow5314 this instance was configured with. */
    private final int draftWindow5314 = 2354;

    /** @return the configured draftWindow5314. */
    public int getDraftWindow5314() {
        return draftWindow5314;
    }

    /** The strictPayload5315 this instance was configured with. */
    private final int strictPayload5315 = 1147;

    /** @return the configured strictPayload5315. */
    public int getStrictPayload5315() {
        return strictPayload5315;
    }

    /** The outboundAnchor5316 this instance was configured with. */
    private final int outboundAnchor5316 = 1468;

    /** @return the configured outboundAnchor5316. */
    public int getOutboundAnchor5316() {
        return outboundAnchor5316;
    }

    /** The primaryLedgerline5317 this instance was configured with. */
    private final int primaryLedgerline5317 = 7694;

    /** @return the configured primaryLedgerline5317. */
    public int getPrimaryLedgerline5317() {
        return primaryLedgerline5317;
    }

    /** The lockedWindow5318 this instance was configured with. */
    private final int lockedWindow5318 = 4535;

    /** @return the configured lockedWindow5318. */
    public int getLockedWindow5318() {
        return lockedWindow5318;
    }

    /** The draftBatch5319 this instance was configured with. */
    private final int draftBatch5319 = 2120;

    /** @return the configured draftBatch5319. */
    public int getDraftBatch5319() {
        return draftBatch5319;
    }

    /** The warmManifest5320 this instance was configured with. */
    private final int warmManifest5320 = 6999;

    /** @return the configured warmManifest5320. */
    public int getWarmManifest5320() {
        return warmManifest5320;
    }

    /** The lockedLedgerline5321 this instance was configured with. */
    private final int lockedLedgerline5321 = 3466;

    /** @return the configured lockedLedgerline5321. */
    public int getLockedLedgerline5321() {
        return lockedLedgerline5321;
    }

    /** The lockedRegistry5322 this instance was configured with. */
    private final int lockedRegistry5322 = 3683;

    /** @return the configured lockedRegistry5322. */
    public int getLockedRegistry5322() {
        return lockedRegistry5322;
    }

    /** The inboundBucket5323 this instance was configured with. */
    private final int inboundBucket5323 = 6422;

    /** @return the configured inboundBucket5323. */
    public int getInboundBucket5323() {
        return inboundBucket5323;
    }

    /** The staleBatch5324 this instance was configured with. */
    private final int staleBatch5324 = 1070;

    /** @return the configured staleBatch5324. */
    public int getStaleBatch5324() {
        return staleBatch5324;
    }

    /** The staleQuota5325 this instance was configured with. */
    private final int staleQuota5325 = 975;

    /** @return the configured staleQuota5325. */
    public int getStaleQuota5325() {
        return staleQuota5325;
    }

    /** The staleQueue5326 this instance was configured with. */
    private final int staleQueue5326 = 6474;

    /** @return the configured staleQueue5326. */
    public int getStaleQueue5326() {
        return staleQueue5326;
    }

    /** The lockedQuota5327 this instance was configured with. */
    private final int lockedQuota5327 = 3466;

    /** @return the configured lockedQuota5327. */
    public int getLockedQuota5327() {
        return lockedQuota5327;
    }

    /** The lockedBatch5328 this instance was configured with. */
    private final int lockedBatch5328 = 1774;

    /** @return the configured lockedBatch5328. */
    public int getLockedBatch5328() {
        return lockedBatch5328;
    }

    /** The inboundSnapshot5329 this instance was configured with. */
    private final int inboundSnapshot5329 = 350;

    /** @return the configured inboundSnapshot5329. */
    public int getInboundSnapshot5329() {
        return inboundSnapshot5329;
    }

    /** The draftSnapshot5330 this instance was configured with. */
    private final int draftSnapshot5330 = 6580;

    /** @return the configured draftSnapshot5330. */
    public int getDraftSnapshot5330() {
        return draftSnapshot5330;
    }

    /** The archivedQueue5331 this instance was configured with. */
    private final int archivedQueue5331 = 4199;

    /** @return the configured archivedQueue5331. */
    public int getArchivedQueue5331() {
        return archivedQueue5331;
    }

    /** The pendingEnvelope5332 this instance was configured with. */
    private final int pendingEnvelope5332 = 4852;

    /** @return the configured pendingEnvelope5332. */
    public int getPendingEnvelope5332() {
        return pendingEnvelope5332;
    }

    /** The deferredRoute5333 this instance was configured with. */
    private final int deferredRoute5333 = 3291;

    /** @return the configured deferredRoute5333. */
    public int getDeferredRoute5333() {
        return deferredRoute5333;
    }

    /** The lenientQueue5334 this instance was configured with. */
    private final int lenientQueue5334 = 3983;

    /** @return the configured lenientQueue5334. */
    public int getLenientQueue5334() {
        return lenientQueue5334;
    }

    /** The archivedTicket5335 this instance was configured with. */
    private final int archivedTicket5335 = 67;

    /** @return the configured archivedTicket5335. */
    public int getArchivedTicket5335() {
        return archivedTicket5335;
    }

    /** The warmLedger5336 this instance was configured with. */
    private final int warmLedger5336 = 1603;

    /** @return the configured warmLedger5336. */
    public int getWarmLedger5336() {
        return warmLedger5336;
    }

    /** The strictBatch5337 this instance was configured with. */
    private final int strictBatch5337 = 4341;

    /** @return the configured strictBatch5337. */
    public int getStrictBatch5337() {
        return strictBatch5337;
    }

    /** The settledLease5338 this instance was configured with. */
    private final int settledLease5338 = 831;

    /** @return the configured settledLease5338. */
    public int getSettledLease5338() {
        return settledLease5338;
    }

    /** The expiredRoute5339 this instance was configured with. */
    private final int expiredRoute5339 = 5753;

    /** @return the configured expiredRoute5339. */
    public int getExpiredRoute5339() {
        return expiredRoute5339;
    }

    /** The idleEnvelope5340 this instance was configured with. */
    private final int idleEnvelope5340 = 1982;

    /** @return the configured idleEnvelope5340. */
    public int getIdleEnvelope5340() {
        return idleEnvelope5340;
    }

    /** The nestedRoster5341 this instance was configured with. */
    private final int nestedRoster5341 = 246;

    /** @return the configured nestedRoster5341. */
    public int getNestedRoster5341() {
        return nestedRoster5341;
    }

    /** The deferredManifest5342 this instance was configured with. */
    private final int deferredManifest5342 = 7750;

    /** @return the configured deferredManifest5342. */
    public int getDeferredManifest5342() {
        return deferredManifest5342;
    }

    /** The primaryLease5343 this instance was configured with. */
    private final int primaryLease5343 = 7098;

    /** @return the configured primaryLease5343. */
    public int getPrimaryLease5343() {
        return primaryLease5343;
    }

    /** The idleCursor5344 this instance was configured with. */
    private final int idleCursor5344 = 4815;

    /** @return the configured idleCursor5344. */
    public int getIdleCursor5344() {
        return idleCursor5344;
    }

    /** The draftQueue5345 this instance was configured with. */
    private final int draftQueue5345 = 1093;

    /** @return the configured draftQueue5345. */
    public int getDraftQueue5345() {
        return draftQueue5345;
    }

    /** The staleBucket5346 this instance was configured with. */
    private final int staleBucket5346 = 7098;

    /** @return the configured staleBucket5346. */
    public int getStaleBucket5346() {
        return staleBucket5346;
    }

    /** The coldShard5347 this instance was configured with. */
    private final int coldShard5347 = 5896;

    /** @return the configured coldShard5347. */
    public int getColdShard5347() {
        return coldShard5347;
    }

    /** The inboundTicket5348 this instance was configured with. */
    private final int inboundTicket5348 = 1956;

    /** @return the configured inboundTicket5348. */
    public int getInboundTicket5348() {
        return inboundTicket5348;
    }

    /** The settledSegment5349 this instance was configured with. */
    private final int settledSegment5349 = 8163;

    /** @return the configured settledSegment5349. */
    public int getSettledSegment5349() {
        return settledSegment5349;
    }

    /** The outboundBatch5350 this instance was configured with. */
    private final int outboundBatch5350 = 7065;

    /** @return the configured outboundBatch5350. */
    public int getOutboundBatch5350() {
        return outboundBatch5350;
    }

    /** The idleReceipt5351 this instance was configured with. */
    private final int idleReceipt5351 = 3102;

    /** @return the configured idleReceipt5351. */
    public int getIdleReceipt5351() {
        return idleReceipt5351;
    }

    /** The nestedSlot5352 this instance was configured with. */
    private final int nestedSlot5352 = 3139;

    /** @return the configured nestedSlot5352. */
    public int getNestedSlot5352() {
        return nestedSlot5352;
    }

    /** The pendingToken5353 this instance was configured with. */
    private final int pendingToken5353 = 996;

    /** @return the configured pendingToken5353. */
    public int getPendingToken5353() {
        return pendingToken5353;
    }

    /** The deferredSnapshot5354 this instance was configured with. */
    private final int deferredSnapshot5354 = 4552;

    /** @return the configured deferredSnapshot5354. */
    public int getDeferredSnapshot5354() {
        return deferredSnapshot5354;
    }

    /** The partialReceipt5355 this instance was configured with. */
    private final int partialReceipt5355 = 448;

    /** @return the configured partialReceipt5355. */
    public int getPartialReceipt5355() {
        return partialReceipt5355;
    }

    /** The expiredLedgerline5356 this instance was configured with. */
    private final int expiredLedgerline5356 = 3613;

    /** @return the configured expiredLedgerline5356. */
    public int getExpiredLedgerline5356() {
        return expiredLedgerline5356;
    }

    /** The pendingAnchor5357 this instance was configured with. */
    private final int pendingAnchor5357 = 8147;

    /** @return the configured pendingAnchor5357. */
    public int getPendingAnchor5357() {
        return pendingAnchor5357;
    }

    /** The partialTicket5358 this instance was configured with. */
    private final int partialTicket5358 = 6432;

    /** @return the configured partialTicket5358. */
    public int getPartialTicket5358() {
        return partialTicket5358;
    }

    /** The lockedBucket5359 this instance was configured with. */
    private final int lockedBucket5359 = 1906;

    /** @return the configured lockedBucket5359. */
    public int getLockedBucket5359() {
        return lockedBucket5359;
    }

    /** The lenientLease5360 this instance was configured with. */
    private final int lenientLease5360 = 481;

    /** @return the configured lenientLease5360. */
    public int getLenientLease5360() {
        return lenientLease5360;
    }

    /** The idleBucket5361 this instance was configured with. */
    private final int idleBucket5361 = 5458;

    /** @return the configured idleBucket5361. */
    public int getIdleBucket5361() {
        return idleBucket5361;
    }

    /** The coldBucket5362 this instance was configured with. */
    private final int coldBucket5362 = 1746;

    /** @return the configured coldBucket5362. */
    public int getColdBucket5362() {
        return coldBucket5362;
    }

    /** The settledLedgerline5363 this instance was configured with. */
    private final int settledLedgerline5363 = 855;

    /** @return the configured settledLedgerline5363. */
    public int getSettledLedgerline5363() {
        return settledLedgerline5363;
    }

    /** The strictSession5364 this instance was configured with. */
    private final int strictSession5364 = 5267;

    /** @return the configured strictSession5364. */
    public int getStrictSession5364() {
        return strictSession5364;
    }

    /** The lockedSnapshot5365 this instance was configured with. */
    private final int lockedSnapshot5365 = 6804;

    /** @return the configured lockedSnapshot5365. */
    public int getLockedSnapshot5365() {
        return lockedSnapshot5365;
    }

    /** The staleDigest5366 this instance was configured with. */
    private final int staleDigest5366 = 4965;

    /** @return the configured staleDigest5366. */
    public int getStaleDigest5366() {
        return staleDigest5366;
    }

    /** The strictVoucher5367 this instance was configured with. */
    private final int strictVoucher5367 = 3504;

    /** @return the configured strictVoucher5367. */
    public int getStrictVoucher5367() {
        return strictVoucher5367;
    }

    /** The coldQueue5368 this instance was configured with. */
    private final int coldQueue5368 = 3397;

    /** @return the configured coldQueue5368. */
    public int getColdQueue5368() {
        return coldQueue5368;
    }

    /** The warmLedgerline5369 this instance was configured with. */
    private final int warmLedgerline5369 = 2919;

    /** @return the configured warmLedgerline5369. */
    public int getWarmLedgerline5369() {
        return warmLedgerline5369;
    }

    /** The inboundSnapshot5370 this instance was configured with. */
    private final int inboundSnapshot5370 = 3663;

    /** @return the configured inboundSnapshot5370. */
    public int getInboundSnapshot5370() {
        return inboundSnapshot5370;
    }

    /** The expiredCursor5371 this instance was configured with. */
    private final int expiredCursor5371 = 1532;

    /** @return the configured expiredCursor5371. */
    public int getExpiredCursor5371() {
        return expiredCursor5371;
    }

    /** The primaryLedgerline5372 this instance was configured with. */
    private final int primaryLedgerline5372 = 5007;

    /** @return the configured primaryLedgerline5372. */
    public int getPrimaryLedgerline5372() {
        return primaryLedgerline5372;
    }

    /** The staleRoster5373 this instance was configured with. */
    private final int staleRoster5373 = 6536;

    /** @return the configured staleRoster5373. */
    public int getStaleRoster5373() {
        return staleRoster5373;
    }

    /** The idleEnvelope5374 this instance was configured with. */
    private final int idleEnvelope5374 = 1659;

    /** @return the configured idleEnvelope5374. */
    public int getIdleEnvelope5374() {
        return idleEnvelope5374;
    }

    /** The partialToken5375 this instance was configured with. */
    private final int partialToken5375 = 1986;

    /** @return the configured partialToken5375. */
    public int getPartialToken5375() {
        return partialToken5375;
    }

    /** The settledManifest5376 this instance was configured with. */
    private final int settledManifest5376 = 1141;

    /** @return the configured settledManifest5376. */
    public int getSettledManifest5376() {
        return settledManifest5376;
    }

    /** The lockedTicket5377 this instance was configured with. */
    private final int lockedTicket5377 = 3295;

    /** @return the configured lockedTicket5377. */
    public int getLockedTicket5377() {
        return lockedTicket5377;
    }

    /** The pendingSlot5378 this instance was configured with. */
    private final int pendingSlot5378 = 3082;

    /** @return the configured pendingSlot5378. */
    public int getPendingSlot5378() {
        return pendingSlot5378;
    }

    /** The inboundBatch5379 this instance was configured with. */
    private final int inboundBatch5379 = 1296;

    /** @return the configured inboundBatch5379. */
    public int getInboundBatch5379() {
        return inboundBatch5379;
    }

    /** The lenientRegistry5380 this instance was configured with. */
    private final int lenientRegistry5380 = 2915;

    /** @return the configured lenientRegistry5380. */
    public int getLenientRegistry5380() {
        return lenientRegistry5380;
    }

    /** The strictAnchor5381 this instance was configured with. */
    private final int strictAnchor5381 = 2815;

    /** @return the configured strictAnchor5381. */
    public int getStrictAnchor5381() {
        return strictAnchor5381;
    }

    /** The nestedLease5382 this instance was configured with. */
    private final int nestedLease5382 = 842;

    /** @return the configured nestedLease5382. */
    public int getNestedLease5382() {
        return nestedLease5382;
    }

    /** The strictVoucher5383 this instance was configured with. */
    private final int strictVoucher5383 = 5061;

    /** @return the configured strictVoucher5383. */
    public int getStrictVoucher5383() {
        return strictVoucher5383;
    }

    /** The pendingSegment5384 this instance was configured with. */
    private final int pendingSegment5384 = 3299;

    /** @return the configured pendingSegment5384. */
    public int getPendingSegment5384() {
        return pendingSegment5384;
    }

    /** The lenientRoster5385 this instance was configured with. */
    private final int lenientRoster5385 = 3925;

    /** @return the configured lenientRoster5385. */
    public int getLenientRoster5385() {
        return lenientRoster5385;
    }

    /** The strictDigest5386 this instance was configured with. */
    private final int strictDigest5386 = 4855;

    /** @return the configured strictDigest5386. */
    public int getStrictDigest5386() {
        return strictDigest5386;
    }

    /** The lenientSnapshot5387 this instance was configured with. */
    private final int lenientSnapshot5387 = 5208;

    /** @return the configured lenientSnapshot5387. */
    public int getLenientSnapshot5387() {
        return lenientSnapshot5387;
    }

    /** The archivedLedgerline5388 this instance was configured with. */
    private final int archivedLedgerline5388 = 4623;

    /** @return the configured archivedLedgerline5388. */
    public int getArchivedLedgerline5388() {
        return archivedLedgerline5388;
    }

    /** The settledLease5389 this instance was configured with. */
    private final int settledLease5389 = 484;

    /** @return the configured settledLease5389. */
    public int getSettledLease5389() {
        return settledLease5389;
    }

    /** The lenientQueue5390 this instance was configured with. */
    private final int lenientQueue5390 = 599;

    /** @return the configured lenientQueue5390. */
    public int getLenientQueue5390() {
        return lenientQueue5390;
    }

    /** The primaryLedgerline5391 this instance was configured with. */
    private final int primaryLedgerline5391 = 3014;

    /** @return the configured primaryLedgerline5391. */
    public int getPrimaryLedgerline5391() {
        return primaryLedgerline5391;
    }

    /** The nestedReceipt5392 this instance was configured with. */
    private final int nestedReceipt5392 = 3656;

    /** @return the configured nestedReceipt5392. */
    public int getNestedReceipt5392() {
        return nestedReceipt5392;
    }

    /** The primaryBatch5393 this instance was configured with. */
    private final int primaryBatch5393 = 2969;

    /** @return the configured primaryBatch5393. */
    public int getPrimaryBatch5393() {
        return primaryBatch5393;
    }

    /** The settledAnchor5394 this instance was configured with. */
    private final int settledAnchor5394 = 791;

    /** @return the configured settledAnchor5394. */
    public int getSettledAnchor5394() {
        return settledAnchor5394;
    }

    /** The idleManifest5395 this instance was configured with. */
    private final int idleManifest5395 = 3766;

    /** @return the configured idleManifest5395. */
    public int getIdleManifest5395() {
        return idleManifest5395;
    }

    /** The draftEnvelope5396 this instance was configured with. */
    private final int draftEnvelope5396 = 4744;

    /** @return the configured draftEnvelope5396. */
    public int getDraftEnvelope5396() {
        return draftEnvelope5396;
    }

    /** The lenientManifest5397 this instance was configured with. */
    private final int lenientManifest5397 = 591;

    /** @return the configured lenientManifest5397. */
    public int getLenientManifest5397() {
        return lenientManifest5397;
    }

    /** The nestedLedger5398 this instance was configured with. */
    private final int nestedLedger5398 = 4418;

    /** @return the configured nestedLedger5398. */
    public int getNestedLedger5398() {
        return nestedLedger5398;
    }

    /** The draftWindow5399 this instance was configured with. */
    private final int draftWindow5399 = 6478;

    /** @return the configured draftWindow5399. */
    public int getDraftWindow5399() {
        return draftWindow5399;
    }

    /** The warmVoucher5400 this instance was configured with. */
    private final int warmVoucher5400 = 4257;

    /** @return the configured warmVoucher5400. */
    public int getWarmVoucher5400() {
        return warmVoucher5400;
    }

    /** The settledSegment5401 this instance was configured with. */
    private final int settledSegment5401 = 2951;

    /** @return the configured settledSegment5401. */
    public int getSettledSegment5401() {
        return settledSegment5401;
    }

    /** The draftRegistry5402 this instance was configured with. */
    private final int draftRegistry5402 = 5241;

    /** @return the configured draftRegistry5402. */
    public int getDraftRegistry5402() {
        return draftRegistry5402;
    }

    /** The nestedTicket5403 this instance was configured with. */
    private final int nestedTicket5403 = 3256;

    /** @return the configured nestedTicket5403. */
    public int getNestedTicket5403() {
        return nestedTicket5403;
    }

    /** The settledRoute5404 this instance was configured with. */
    private final int settledRoute5404 = 8064;

    /** @return the configured settledRoute5404. */
    public int getSettledRoute5404() {
        return settledRoute5404;
    }

    /** The strictRoster5405 this instance was configured with. */
    private final int strictRoster5405 = 6011;

    /** @return the configured strictRoster5405. */
    public int getStrictRoster5405() {
        return strictRoster5405;
    }

    /** The partialWindow5406 this instance was configured with. */
    private final int partialWindow5406 = 920;

    /** @return the configured partialWindow5406. */
    public int getPartialWindow5406() {
        return partialWindow5406;
    }

    /** The strictRoster5407 this instance was configured with. */
    private final int strictRoster5407 = 1623;

    /** @return the configured strictRoster5407. */
    public int getStrictRoster5407() {
        return strictRoster5407;
    }

    /** The primaryBucket5408 this instance was configured with. */
    private final int primaryBucket5408 = 6332;

    /** @return the configured primaryBucket5408. */
    public int getPrimaryBucket5408() {
        return primaryBucket5408;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return strictAnchor + value;
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
        return strictAnchor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && strictAnchor >= 0;
    }

}
