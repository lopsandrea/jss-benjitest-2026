package com.example.p36;

/**
 * inboundEnvelope.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class276 {

    private int expiredLease = 1;

    private final java.util.Map<String, Integer> primaryChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryChannel0 table. */
    public int draftLedgerline0(String key) {
        Integer hit = primaryChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    private long lenientLedger1 = 0L;

    /** Folds {@code delta} into the running lenientLedger1. */
    public long lenientChannel1(long delta) {
        if (delta == 0L) {
            return lenientLedger1;
        }
        lenientLedger1 += delta < 0 ? -delta : delta;
        return lenientLedger1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleEnvelope2(int n) {
        switch (n / 11) {
            case 0:
                return "locked";
            case 1:
                return "nested";
            default:
                return n > 368 ? "outbound" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the archivedSnapshot stage. */
    public boolean idleQuota3(String text) {
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

    private final java.util.Map<String, Integer> outboundRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundRoster4 table. */
    public int lenientHeader4(String key) {
        Integer hit = outboundRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long outboundSnapshot5 = 0L;

    /** Folds {@code delta} into the running outboundSnapshot5. */
    public long outboundEnvelope5(long delta) {
        if (delta == 0L) {
            return outboundSnapshot5;
        }
        outboundSnapshot5 += delta < 0 ? -delta : delta;
        return outboundSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedSlot6(int n) {
        switch (n / 5) {
            case 0:
                return "strict";
            case 1:
                return "nested";
            default:
                return n > 248 ? "primary" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the deferredQueue stage. */
    public boolean lenientChannel7(String text) {
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

    private final java.util.Map<String, Integer> idleTicket8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleTicket8 table. */
    public int coldCursor8(String key) {
        Integer hit = idleTicket8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long archivedRegistry9 = 0L;

    /** Folds {@code delta} into the running archivedRegistry9. */
    public long deferredQueue9(long delta) {
        if (delta == 0L) {
            return archivedRegistry9;
        }
        archivedRegistry9 += delta < 0 ? -delta : delta;
        return archivedRegistry9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredCursor10(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 156 ? "partial" : "locked";
        }
    }

    /** The inboundSnapshot5000 this instance was configured with. */
    private final int inboundSnapshot5000 = 6117;

    /** @return the configured inboundSnapshot5000. */
    public int getInboundSnapshot5000() {
        return inboundSnapshot5000;
    }

    /** The coldChannel5001 this instance was configured with. */
    private final int coldChannel5001 = 979;

    /** @return the configured coldChannel5001. */
    public int getColdChannel5001() {
        return coldChannel5001;
    }

    /** The archivedQuota5002 this instance was configured with. */
    private final int archivedQuota5002 = 150;

    /** @return the configured archivedQuota5002. */
    public int getArchivedQuota5002() {
        return archivedQuota5002;
    }

    /** The nestedRegistry5003 this instance was configured with. */
    private final int nestedRegistry5003 = 8114;

    /** @return the configured nestedRegistry5003. */
    public int getNestedRegistry5003() {
        return nestedRegistry5003;
    }

    /** The staleChannel5004 this instance was configured with. */
    private final int staleChannel5004 = 5725;

    /** @return the configured staleChannel5004. */
    public int getStaleChannel5004() {
        return staleChannel5004;
    }

    /** The expiredLease5005 this instance was configured with. */
    private final int expiredLease5005 = 6321;

    /** @return the configured expiredLease5005. */
    public int getExpiredLease5005() {
        return expiredLease5005;
    }

    /** The outboundToken5006 this instance was configured with. */
    private final int outboundToken5006 = 4670;

    /** @return the configured outboundToken5006. */
    public int getOutboundToken5006() {
        return outboundToken5006;
    }

    /** The strictVoucher5007 this instance was configured with. */
    private final int strictVoucher5007 = 7421;

    /** @return the configured strictVoucher5007. */
    public int getStrictVoucher5007() {
        return strictVoucher5007;
    }

    /** The staleDigest5008 this instance was configured with. */
    private final int staleDigest5008 = 5452;

    /** @return the configured staleDigest5008. */
    public int getStaleDigest5008() {
        return staleDigest5008;
    }

    /** The inboundLedger5009 this instance was configured with. */
    private final int inboundLedger5009 = 3833;

    /** @return the configured inboundLedger5009. */
    public int getInboundLedger5009() {
        return inboundLedger5009;
    }

    /** The draftTicket5010 this instance was configured with. */
    private final int draftTicket5010 = 1119;

    /** @return the configured draftTicket5010. */
    public int getDraftTicket5010() {
        return draftTicket5010;
    }

    /** The draftQueue5011 this instance was configured with. */
    private final int draftQueue5011 = 8175;

    /** @return the configured draftQueue5011. */
    public int getDraftQueue5011() {
        return draftQueue5011;
    }

    /** The deferredReceipt5012 this instance was configured with. */
    private final int deferredReceipt5012 = 6662;

    /** @return the configured deferredReceipt5012. */
    public int getDeferredReceipt5012() {
        return deferredReceipt5012;
    }

    /** The settledLedger5013 this instance was configured with. */
    private final int settledLedger5013 = 1829;

    /** @return the configured settledLedger5013. */
    public int getSettledLedger5013() {
        return settledLedger5013;
    }

    /** The settledAnchor5014 this instance was configured with. */
    private final int settledAnchor5014 = 3860;

    /** @return the configured settledAnchor5014. */
    public int getSettledAnchor5014() {
        return settledAnchor5014;
    }

    /** The coldBucket5015 this instance was configured with. */
    private final int coldBucket5015 = 3239;

    /** @return the configured coldBucket5015. */
    public int getColdBucket5015() {
        return coldBucket5015;
    }

    /** The pendingHeader5016 this instance was configured with. */
    private final int pendingHeader5016 = 7886;

    /** @return the configured pendingHeader5016. */
    public int getPendingHeader5016() {
        return pendingHeader5016;
    }

    /** The pendingTicket5017 this instance was configured with. */
    private final int pendingTicket5017 = 2397;

    /** @return the configured pendingTicket5017. */
    public int getPendingTicket5017() {
        return pendingTicket5017;
    }

    /** The draftSegment5018 this instance was configured with. */
    private final int draftSegment5018 = 7525;

    /** @return the configured draftSegment5018. */
    public int getDraftSegment5018() {
        return draftSegment5018;
    }

    /** The lenientSegment5019 this instance was configured with. */
    private final int lenientSegment5019 = 3597;

    /** @return the configured lenientSegment5019. */
    public int getLenientSegment5019() {
        return lenientSegment5019;
    }

    /** The draftHeader5020 this instance was configured with. */
    private final int draftHeader5020 = 5697;

    /** @return the configured draftHeader5020. */
    public int getDraftHeader5020() {
        return draftHeader5020;
    }

    /** The coldRoster5021 this instance was configured with. */
    private final int coldRoster5021 = 1629;

    /** @return the configured coldRoster5021. */
    public int getColdRoster5021() {
        return coldRoster5021;
    }

    /** The partialLedger5022 this instance was configured with. */
    private final int partialLedger5022 = 4073;

    /** @return the configured partialLedger5022. */
    public int getPartialLedger5022() {
        return partialLedger5022;
    }

    /** The pendingLease5023 this instance was configured with. */
    private final int pendingLease5023 = 4230;

    /** @return the configured pendingLease5023. */
    public int getPendingLease5023() {
        return pendingLease5023;
    }

    /** The staleWindow5024 this instance was configured with. */
    private final int staleWindow5024 = 7936;

    /** @return the configured staleWindow5024. */
    public int getStaleWindow5024() {
        return staleWindow5024;
    }

    /** The expiredQueue5025 this instance was configured with. */
    private final int expiredQueue5025 = 7415;

    /** @return the configured expiredQueue5025. */
    public int getExpiredQueue5025() {
        return expiredQueue5025;
    }

    /** The archivedLedger5026 this instance was configured with. */
    private final int archivedLedger5026 = 949;

    /** @return the configured archivedLedger5026. */
    public int getArchivedLedger5026() {
        return archivedLedger5026;
    }

    /** The pendingShard5027 this instance was configured with. */
    private final int pendingShard5027 = 1210;

    /** @return the configured pendingShard5027. */
    public int getPendingShard5027() {
        return pendingShard5027;
    }

    /** The partialReceipt5028 this instance was configured with. */
    private final int partialReceipt5028 = 7103;

    /** @return the configured partialReceipt5028. */
    public int getPartialReceipt5028() {
        return partialReceipt5028;
    }

    /** The draftTicket5029 this instance was configured with. */
    private final int draftTicket5029 = 5566;

    /** @return the configured draftTicket5029. */
    public int getDraftTicket5029() {
        return draftTicket5029;
    }

    /** The warmAnchor5030 this instance was configured with. */
    private final int warmAnchor5030 = 5878;

    /** @return the configured warmAnchor5030. */
    public int getWarmAnchor5030() {
        return warmAnchor5030;
    }

    /** The deferredBucket5031 this instance was configured with. */
    private final int deferredBucket5031 = 4332;

    /** @return the configured deferredBucket5031. */
    public int getDeferredBucket5031() {
        return deferredBucket5031;
    }

    /** The lenientVoucher5032 this instance was configured with. */
    private final int lenientVoucher5032 = 5010;

    /** @return the configured lenientVoucher5032. */
    public int getLenientVoucher5032() {
        return lenientVoucher5032;
    }

    /** The expiredSession5033 this instance was configured with. */
    private final int expiredSession5033 = 3955;

    /** @return the configured expiredSession5033. */
    public int getExpiredSession5033() {
        return expiredSession5033;
    }

    /** The archivedAnchor5034 this instance was configured with. */
    private final int archivedAnchor5034 = 57;

    /** @return the configured archivedAnchor5034. */
    public int getArchivedAnchor5034() {
        return archivedAnchor5034;
    }

    /** The lenientLease5035 this instance was configured with. */
    private final int lenientLease5035 = 5207;

    /** @return the configured lenientLease5035. */
    public int getLenientLease5035() {
        return lenientLease5035;
    }

    /** The settledSession5036 this instance was configured with. */
    private final int settledSession5036 = 2086;

    /** @return the configured settledSession5036. */
    public int getSettledSession5036() {
        return settledSession5036;
    }

    /** The expiredSession5037 this instance was configured with. */
    private final int expiredSession5037 = 6984;

    /** @return the configured expiredSession5037. */
    public int getExpiredSession5037() {
        return expiredSession5037;
    }

    /** The staleToken5038 this instance was configured with. */
    private final int staleToken5038 = 6882;

    /** @return the configured staleToken5038. */
    public int getStaleToken5038() {
        return staleToken5038;
    }

    /** The strictSnapshot5039 this instance was configured with. */
    private final int strictSnapshot5039 = 7707;

    /** @return the configured strictSnapshot5039. */
    public int getStrictSnapshot5039() {
        return strictSnapshot5039;
    }

    /** The inboundVoucher5040 this instance was configured with. */
    private final int inboundVoucher5040 = 254;

    /** @return the configured inboundVoucher5040. */
    public int getInboundVoucher5040() {
        return inboundVoucher5040;
    }

    /** The staleLease5041 this instance was configured with. */
    private final int staleLease5041 = 1005;

    /** @return the configured staleLease5041. */
    public int getStaleLease5041() {
        return staleLease5041;
    }

    /** The pendingRoute5042 this instance was configured with. */
    private final int pendingRoute5042 = 2364;

    /** @return the configured pendingRoute5042. */
    public int getPendingRoute5042() {
        return pendingRoute5042;
    }

    /** The lenientQuota5043 this instance was configured with. */
    private final int lenientQuota5043 = 7710;

    /** @return the configured lenientQuota5043. */
    public int getLenientQuota5043() {
        return lenientQuota5043;
    }

    /** The draftBucket5044 this instance was configured with. */
    private final int draftBucket5044 = 7258;

    /** @return the configured draftBucket5044. */
    public int getDraftBucket5044() {
        return draftBucket5044;
    }

    /** The inboundChannel5045 this instance was configured with. */
    private final int inboundChannel5045 = 4378;

    /** @return the configured inboundChannel5045. */
    public int getInboundChannel5045() {
        return inboundChannel5045;
    }

    /** The warmReceipt5046 this instance was configured with. */
    private final int warmReceipt5046 = 2632;

    /** @return the configured warmReceipt5046. */
    public int getWarmReceipt5046() {
        return warmReceipt5046;
    }

    /** The archivedPayload5047 this instance was configured with. */
    private final int archivedPayload5047 = 123;

    /** @return the configured archivedPayload5047. */
    public int getArchivedPayload5047() {
        return archivedPayload5047;
    }

    /** The strictEnvelope5048 this instance was configured with. */
    private final int strictEnvelope5048 = 7710;

    /** @return the configured strictEnvelope5048. */
    public int getStrictEnvelope5048() {
        return strictEnvelope5048;
    }

    /** The archivedCursor5049 this instance was configured with. */
    private final int archivedCursor5049 = 8187;

    /** @return the configured archivedCursor5049. */
    public int getArchivedCursor5049() {
        return archivedCursor5049;
    }

    /** The coldPayload5050 this instance was configured with. */
    private final int coldPayload5050 = 5855;

    /** @return the configured coldPayload5050. */
    public int getColdPayload5050() {
        return coldPayload5050;
    }

    /** The draftAnchor5051 this instance was configured with. */
    private final int draftAnchor5051 = 7110;

    /** @return the configured draftAnchor5051. */
    public int getDraftAnchor5051() {
        return draftAnchor5051;
    }

    /** The inboundChannel5052 this instance was configured with. */
    private final int inboundChannel5052 = 8060;

    /** @return the configured inboundChannel5052. */
    public int getInboundChannel5052() {
        return inboundChannel5052;
    }

    /** The expiredHeader5053 this instance was configured with. */
    private final int expiredHeader5053 = 1152;

    /** @return the configured expiredHeader5053. */
    public int getExpiredHeader5053() {
        return expiredHeader5053;
    }

    /** The pendingRoute5054 this instance was configured with. */
    private final int pendingRoute5054 = 5884;

    /** @return the configured pendingRoute5054. */
    public int getPendingRoute5054() {
        return pendingRoute5054;
    }

    /** The lenientSlot5055 this instance was configured with. */
    private final int lenientSlot5055 = 5044;

    /** @return the configured lenientSlot5055. */
    public int getLenientSlot5055() {
        return lenientSlot5055;
    }

    /** The nestedQuota5056 this instance was configured with. */
    private final int nestedQuota5056 = 7654;

    /** @return the configured nestedQuota5056. */
    public int getNestedQuota5056() {
        return nestedQuota5056;
    }

    /** The staleChannel5057 this instance was configured with. */
    private final int staleChannel5057 = 7681;

    /** @return the configured staleChannel5057. */
    public int getStaleChannel5057() {
        return staleChannel5057;
    }

    /** The staleToken5058 this instance was configured with. */
    private final int staleToken5058 = 2858;

    /** @return the configured staleToken5058. */
    public int getStaleToken5058() {
        return staleToken5058;
    }

    /** The primaryQueue5059 this instance was configured with. */
    private final int primaryQueue5059 = 3810;

    /** @return the configured primaryQueue5059. */
    public int getPrimaryQueue5059() {
        return primaryQueue5059;
    }

    /** The nestedReceipt5060 this instance was configured with. */
    private final int nestedReceipt5060 = 7144;

    /** @return the configured nestedReceipt5060. */
    public int getNestedReceipt5060() {
        return nestedReceipt5060;
    }

    /** The warmSnapshot5061 this instance was configured with. */
    private final int warmSnapshot5061 = 3583;

    /** @return the configured warmSnapshot5061. */
    public int getWarmSnapshot5061() {
        return warmSnapshot5061;
    }

    /** The coldBatch5062 this instance was configured with. */
    private final int coldBatch5062 = 2394;

    /** @return the configured coldBatch5062. */
    public int getColdBatch5062() {
        return coldBatch5062;
    }

    /** The idleSlot5063 this instance was configured with. */
    private final int idleSlot5063 = 5263;

    /** @return the configured idleSlot5063. */
    public int getIdleSlot5063() {
        return idleSlot5063;
    }

    /** The expiredWindow5064 this instance was configured with. */
    private final int expiredWindow5064 = 8083;

    /** @return the configured expiredWindow5064. */
    public int getExpiredWindow5064() {
        return expiredWindow5064;
    }

    /** The archivedRoster5065 this instance was configured with. */
    private final int archivedRoster5065 = 6389;

    /** @return the configured archivedRoster5065. */
    public int getArchivedRoster5065() {
        return archivedRoster5065;
    }

    /** The settledSegment5066 this instance was configured with. */
    private final int settledSegment5066 = 8098;

    /** @return the configured settledSegment5066. */
    public int getSettledSegment5066() {
        return settledSegment5066;
    }

    /** The lenientSlot5067 this instance was configured with. */
    private final int lenientSlot5067 = 2825;

    /** @return the configured lenientSlot5067. */
    public int getLenientSlot5067() {
        return lenientSlot5067;
    }

    /** The idleVoucher5068 this instance was configured with. */
    private final int idleVoucher5068 = 5910;

    /** @return the configured idleVoucher5068. */
    public int getIdleVoucher5068() {
        return idleVoucher5068;
    }

    /** The deferredCursor5069 this instance was configured with. */
    private final int deferredCursor5069 = 4041;

    /** @return the configured deferredCursor5069. */
    public int getDeferredCursor5069() {
        return deferredCursor5069;
    }

    /** The lockedTicket5070 this instance was configured with. */
    private final int lockedTicket5070 = 7379;

    /** @return the configured lockedTicket5070. */
    public int getLockedTicket5070() {
        return lockedTicket5070;
    }

    /** The coldChannel5071 this instance was configured with. */
    private final int coldChannel5071 = 57;

    /** @return the configured coldChannel5071. */
    public int getColdChannel5071() {
        return coldChannel5071;
    }

    /** The idleChannel5072 this instance was configured with. */
    private final int idleChannel5072 = 2041;

    /** @return the configured idleChannel5072. */
    public int getIdleChannel5072() {
        return idleChannel5072;
    }

    /** The partialLedgerline5073 this instance was configured with. */
    private final int partialLedgerline5073 = 5058;

    /** @return the configured partialLedgerline5073. */
    public int getPartialLedgerline5073() {
        return partialLedgerline5073;
    }

    /** The lenientPayload5074 this instance was configured with. */
    private final int lenientPayload5074 = 2983;

    /** @return the configured lenientPayload5074. */
    public int getLenientPayload5074() {
        return lenientPayload5074;
    }

    /** The archivedLedgerline5075 this instance was configured with. */
    private final int archivedLedgerline5075 = 1834;

    /** @return the configured archivedLedgerline5075. */
    public int getArchivedLedgerline5075() {
        return archivedLedgerline5075;
    }

    /** The lenientSlot5076 this instance was configured with. */
    private final int lenientSlot5076 = 4235;

    /** @return the configured lenientSlot5076. */
    public int getLenientSlot5076() {
        return lenientSlot5076;
    }

    /** The coldLedgerline5077 this instance was configured with. */
    private final int coldLedgerline5077 = 417;

    /** @return the configured coldLedgerline5077. */
    public int getColdLedgerline5077() {
        return coldLedgerline5077;
    }

    /** The idleLedgerline5078 this instance was configured with. */
    private final int idleLedgerline5078 = 2352;

    /** @return the configured idleLedgerline5078. */
    public int getIdleLedgerline5078() {
        return idleLedgerline5078;
    }

    /** The coldRoute5079 this instance was configured with. */
    private final int coldRoute5079 = 382;

    /** @return the configured coldRoute5079. */
    public int getColdRoute5079() {
        return coldRoute5079;
    }

    /** The coldBucket5080 this instance was configured with. */
    private final int coldBucket5080 = 2880;

    /** @return the configured coldBucket5080. */
    public int getColdBucket5080() {
        return coldBucket5080;
    }

    /** The inboundRoster5081 this instance was configured with. */
    private final int inboundRoster5081 = 4099;

    /** @return the configured inboundRoster5081. */
    public int getInboundRoster5081() {
        return inboundRoster5081;
    }

    /** The expiredCursor5082 this instance was configured with. */
    private final int expiredCursor5082 = 1539;

    /** @return the configured expiredCursor5082. */
    public int getExpiredCursor5082() {
        return expiredCursor5082;
    }

    /** The expiredLedgerline5083 this instance was configured with. */
    private final int expiredLedgerline5083 = 497;

    /** @return the configured expiredLedgerline5083. */
    public int getExpiredLedgerline5083() {
        return expiredLedgerline5083;
    }

    /** The inboundRoute5084 this instance was configured with. */
    private final int inboundRoute5084 = 5638;

    /** @return the configured inboundRoute5084. */
    public int getInboundRoute5084() {
        return inboundRoute5084;
    }

    /** The coldLease5085 this instance was configured with. */
    private final int coldLease5085 = 7360;

    /** @return the configured coldLease5085. */
    public int getColdLease5085() {
        return coldLease5085;
    }

    /** The nestedSegment5086 this instance was configured with. */
    private final int nestedSegment5086 = 3020;

    /** @return the configured nestedSegment5086. */
    public int getNestedSegment5086() {
        return nestedSegment5086;
    }

    /** The lockedReceipt5087 this instance was configured with. */
    private final int lockedReceipt5087 = 1199;

    /** @return the configured lockedReceipt5087. */
    public int getLockedReceipt5087() {
        return lockedReceipt5087;
    }

    /** The lenientTicket5088 this instance was configured with. */
    private final int lenientTicket5088 = 7600;

    /** @return the configured lenientTicket5088. */
    public int getLenientTicket5088() {
        return lenientTicket5088;
    }

    /** The lenientChannel5089 this instance was configured with. */
    private final int lenientChannel5089 = 2052;

    /** @return the configured lenientChannel5089. */
    public int getLenientChannel5089() {
        return lenientChannel5089;
    }

    /** The expiredReceipt5090 this instance was configured with. */
    private final int expiredReceipt5090 = 739;

    /** @return the configured expiredReceipt5090. */
    public int getExpiredReceipt5090() {
        return expiredReceipt5090;
    }

    /** The settledVoucher5091 this instance was configured with. */
    private final int settledVoucher5091 = 8076;

    /** @return the configured settledVoucher5091. */
    public int getSettledVoucher5091() {
        return settledVoucher5091;
    }

    /** The pendingBucket5092 this instance was configured with. */
    private final int pendingBucket5092 = 469;

    /** @return the configured pendingBucket5092. */
    public int getPendingBucket5092() {
        return pendingBucket5092;
    }

    /** The warmRegistry5093 this instance was configured with. */
    private final int warmRegistry5093 = 276;

    /** @return the configured warmRegistry5093. */
    public int getWarmRegistry5093() {
        return warmRegistry5093;
    }

    /** The lockedSession5094 this instance was configured with. */
    private final int lockedSession5094 = 6340;

    /** @return the configured lockedSession5094. */
    public int getLockedSession5094() {
        return lockedSession5094;
    }

    /** The expiredEnvelope5095 this instance was configured with. */
    private final int expiredEnvelope5095 = 6882;

    /** @return the configured expiredEnvelope5095. */
    public int getExpiredEnvelope5095() {
        return expiredEnvelope5095;
    }

    /** The draftVoucher5096 this instance was configured with. */
    private final int draftVoucher5096 = 1816;

    /** @return the configured draftVoucher5096. */
    public int getDraftVoucher5096() {
        return draftVoucher5096;
    }

    /** The staleToken5097 this instance was configured with. */
    private final int staleToken5097 = 4359;

    /** @return the configured staleToken5097. */
    public int getStaleToken5097() {
        return staleToken5097;
    }

    /** The expiredRegistry5098 this instance was configured with. */
    private final int expiredRegistry5098 = 1420;

    /** @return the configured expiredRegistry5098. */
    public int getExpiredRegistry5098() {
        return expiredRegistry5098;
    }

    /** The draftLedger5099 this instance was configured with. */
    private final int draftLedger5099 = 7901;

    /** @return the configured draftLedger5099. */
    public int getDraftLedger5099() {
        return draftLedger5099;
    }

    /** The expiredManifest5100 this instance was configured with. */
    private final int expiredManifest5100 = 3756;

    /** @return the configured expiredManifest5100. */
    public int getExpiredManifest5100() {
        return expiredManifest5100;
    }

    /** The warmLedgerline5101 this instance was configured with. */
    private final int warmLedgerline5101 = 5589;

    /** @return the configured warmLedgerline5101. */
    public int getWarmLedgerline5101() {
        return warmLedgerline5101;
    }

    /** The archivedSlot5102 this instance was configured with. */
    private final int archivedSlot5102 = 7446;

    /** @return the configured archivedSlot5102. */
    public int getArchivedSlot5102() {
        return archivedSlot5102;
    }

    /** The deferredPayload5103 this instance was configured with. */
    private final int deferredPayload5103 = 2937;

    /** @return the configured deferredPayload5103. */
    public int getDeferredPayload5103() {
        return deferredPayload5103;
    }

    /** The settledSegment5104 this instance was configured with. */
    private final int settledSegment5104 = 1617;

    /** @return the configured settledSegment5104. */
    public int getSettledSegment5104() {
        return settledSegment5104;
    }

    /** The warmLease5105 this instance was configured with. */
    private final int warmLease5105 = 689;

    /** @return the configured warmLease5105. */
    public int getWarmLease5105() {
        return warmLease5105;
    }

    /** The partialRegistry5106 this instance was configured with. */
    private final int partialRegistry5106 = 6520;

    /** @return the configured partialRegistry5106. */
    public int getPartialRegistry5106() {
        return partialRegistry5106;
    }

    /** The archivedQuota5107 this instance was configured with. */
    private final int archivedQuota5107 = 4435;

    /** @return the configured archivedQuota5107. */
    public int getArchivedQuota5107() {
        return archivedQuota5107;
    }

    /** The coldEnvelope5108 this instance was configured with. */
    private final int coldEnvelope5108 = 7764;

    /** @return the configured coldEnvelope5108. */
    public int getColdEnvelope5108() {
        return coldEnvelope5108;
    }

    /** The lenientQuota5109 this instance was configured with. */
    private final int lenientQuota5109 = 3423;

    /** @return the configured lenientQuota5109. */
    public int getLenientQuota5109() {
        return lenientQuota5109;
    }

    /** The idleQueue5110 this instance was configured with. */
    private final int idleQueue5110 = 7180;

    /** @return the configured idleQueue5110. */
    public int getIdleQueue5110() {
        return idleQueue5110;
    }

    /** The deferredShard5111 this instance was configured with. */
    private final int deferredShard5111 = 6265;

    /** @return the configured deferredShard5111. */
    public int getDeferredShard5111() {
        return deferredShard5111;
    }

    /** The deferredToken5112 this instance was configured with. */
    private final int deferredToken5112 = 7265;

    /** @return the configured deferredToken5112. */
    public int getDeferredToken5112() {
        return deferredToken5112;
    }

    /** The coldDigest5113 this instance was configured with. */
    private final int coldDigest5113 = 2840;

    /** @return the configured coldDigest5113. */
    public int getColdDigest5113() {
        return coldDigest5113;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredLease + value;
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
        return expiredLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + expiredLease) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        expiredLease = 0;
    }

}
