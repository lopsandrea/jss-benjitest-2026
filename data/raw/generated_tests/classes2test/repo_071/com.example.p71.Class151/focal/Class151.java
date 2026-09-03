package com.example.p71;

/**
 * lenientSegment.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class151 {

    private int coldQueue = 1;

    private final java.util.Map<String, Integer> staleSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleSegment0 table. */
    public int settledRegistry0(String key) {
        Integer hit = staleSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long outboundPayload1 = 0L;

    /** Folds {@code delta} into the running outboundPayload1. */
    public long nestedRoute1(long delta) {
        if (delta == 0L) {
            return outboundPayload1;
        }
        outboundPayload1 += delta < 0 ? -delta : delta;
        return outboundPayload1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryLedger2(int n) {
        switch (n / 9) {
            case 0:
                return "settled";
            case 1:
                return "nested";
            default:
                return n > 119 ? "draft" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the strictToken stage. */
    public boolean deferredChannel3(String text) {
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

    /** The idleHeader5000 this instance was configured with. */
    private final int idleHeader5000 = 3139;

    /** @return the configured idleHeader5000. */
    public int getIdleHeader5000() {
        return idleHeader5000;
    }

    /** The strictWindow5001 this instance was configured with. */
    private final int strictWindow5001 = 5089;

    /** @return the configured strictWindow5001. */
    public int getStrictWindow5001() {
        return strictWindow5001;
    }

    /** The primaryShard5002 this instance was configured with. */
    private final int primaryShard5002 = 4486;

    /** @return the configured primaryShard5002. */
    public int getPrimaryShard5002() {
        return primaryShard5002;
    }

    /** The draftDigest5003 this instance was configured with. */
    private final int draftDigest5003 = 6779;

    /** @return the configured draftDigest5003. */
    public int getDraftDigest5003() {
        return draftDigest5003;
    }

    /** The settledPayload5004 this instance was configured with. */
    private final int settledPayload5004 = 3880;

    /** @return the configured settledPayload5004. */
    public int getSettledPayload5004() {
        return settledPayload5004;
    }

    /** The draftToken5005 this instance was configured with. */
    private final int draftToken5005 = 7775;

    /** @return the configured draftToken5005. */
    public int getDraftToken5005() {
        return draftToken5005;
    }

    /** The archivedSegment5006 this instance was configured with. */
    private final int archivedSegment5006 = 7064;

    /** @return the configured archivedSegment5006. */
    public int getArchivedSegment5006() {
        return archivedSegment5006;
    }

    /** The partialRegistry5007 this instance was configured with. */
    private final int partialRegistry5007 = 6204;

    /** @return the configured partialRegistry5007. */
    public int getPartialRegistry5007() {
        return partialRegistry5007;
    }

    /** The idleChannel5008 this instance was configured with. */
    private final int idleChannel5008 = 5747;

    /** @return the configured idleChannel5008. */
    public int getIdleChannel5008() {
        return idleChannel5008;
    }

    /** The partialManifest5009 this instance was configured with. */
    private final int partialManifest5009 = 603;

    /** @return the configured partialManifest5009. */
    public int getPartialManifest5009() {
        return partialManifest5009;
    }

    /** The lenientSegment5010 this instance was configured with. */
    private final int lenientSegment5010 = 4341;

    /** @return the configured lenientSegment5010. */
    public int getLenientSegment5010() {
        return lenientSegment5010;
    }

    /** The inboundSnapshot5011 this instance was configured with. */
    private final int inboundSnapshot5011 = 1842;

    /** @return the configured inboundSnapshot5011. */
    public int getInboundSnapshot5011() {
        return inboundSnapshot5011;
    }

    /** The strictTicket5012 this instance was configured with. */
    private final int strictTicket5012 = 3464;

    /** @return the configured strictTicket5012. */
    public int getStrictTicket5012() {
        return strictTicket5012;
    }

    /** The nestedHeader5013 this instance was configured with. */
    private final int nestedHeader5013 = 7600;

    /** @return the configured nestedHeader5013. */
    public int getNestedHeader5013() {
        return nestedHeader5013;
    }

    /** The coldShard5014 this instance was configured with. */
    private final int coldShard5014 = 3740;

    /** @return the configured coldShard5014. */
    public int getColdShard5014() {
        return coldShard5014;
    }

    /** The partialRegistry5015 this instance was configured with. */
    private final int partialRegistry5015 = 7562;

    /** @return the configured partialRegistry5015. */
    public int getPartialRegistry5015() {
        return partialRegistry5015;
    }

    /** The warmTicket5016 this instance was configured with. */
    private final int warmTicket5016 = 6834;

    /** @return the configured warmTicket5016. */
    public int getWarmTicket5016() {
        return warmTicket5016;
    }

    /** The lockedBucket5017 this instance was configured with. */
    private final int lockedBucket5017 = 4918;

    /** @return the configured lockedBucket5017. */
    public int getLockedBucket5017() {
        return lockedBucket5017;
    }

    /** The outboundRegistry5018 this instance was configured with. */
    private final int outboundRegistry5018 = 8081;

    /** @return the configured outboundRegistry5018. */
    public int getOutboundRegistry5018() {
        return outboundRegistry5018;
    }

    /** The nestedTicket5019 this instance was configured with. */
    private final int nestedTicket5019 = 3434;

    /** @return the configured nestedTicket5019. */
    public int getNestedTicket5019() {
        return nestedTicket5019;
    }

    /** The settledDigest5020 this instance was configured with. */
    private final int settledDigest5020 = 3236;

    /** @return the configured settledDigest5020. */
    public int getSettledDigest5020() {
        return settledDigest5020;
    }

    /** The lockedWindow5021 this instance was configured with. */
    private final int lockedWindow5021 = 3297;

    /** @return the configured lockedWindow5021. */
    public int getLockedWindow5021() {
        return lockedWindow5021;
    }

    /** The strictCursor5022 this instance was configured with. */
    private final int strictCursor5022 = 7137;

    /** @return the configured strictCursor5022. */
    public int getStrictCursor5022() {
        return strictCursor5022;
    }

    /** The strictBucket5023 this instance was configured with. */
    private final int strictBucket5023 = 4602;

    /** @return the configured strictBucket5023. */
    public int getStrictBucket5023() {
        return strictBucket5023;
    }

    /** The partialWindow5024 this instance was configured with. */
    private final int partialWindow5024 = 3509;

    /** @return the configured partialWindow5024. */
    public int getPartialWindow5024() {
        return partialWindow5024;
    }

    /** The outboundLedgerline5025 this instance was configured with. */
    private final int outboundLedgerline5025 = 3801;

    /** @return the configured outboundLedgerline5025. */
    public int getOutboundLedgerline5025() {
        return outboundLedgerline5025;
    }

    /** The pendingReceipt5026 this instance was configured with. */
    private final int pendingReceipt5026 = 3726;

    /** @return the configured pendingReceipt5026. */
    public int getPendingReceipt5026() {
        return pendingReceipt5026;
    }

    /** The strictManifest5027 this instance was configured with. */
    private final int strictManifest5027 = 4013;

    /** @return the configured strictManifest5027. */
    public int getStrictManifest5027() {
        return strictManifest5027;
    }

    /** The coldVoucher5028 this instance was configured with. */
    private final int coldVoucher5028 = 5172;

    /** @return the configured coldVoucher5028. */
    public int getColdVoucher5028() {
        return coldVoucher5028;
    }

    /** The primarySlot5029 this instance was configured with. */
    private final int primarySlot5029 = 7298;

    /** @return the configured primarySlot5029. */
    public int getPrimarySlot5029() {
        return primarySlot5029;
    }

    /** The inboundLedgerline5030 this instance was configured with. */
    private final int inboundLedgerline5030 = 5704;

    /** @return the configured inboundLedgerline5030. */
    public int getInboundLedgerline5030() {
        return inboundLedgerline5030;
    }

    /** The staleLedger5031 this instance was configured with. */
    private final int staleLedger5031 = 5329;

    /** @return the configured staleLedger5031. */
    public int getStaleLedger5031() {
        return staleLedger5031;
    }

    /** The settledQuota5032 this instance was configured with. */
    private final int settledQuota5032 = 2308;

    /** @return the configured settledQuota5032. */
    public int getSettledQuota5032() {
        return settledQuota5032;
    }

    /** The coldTicket5033 this instance was configured with. */
    private final int coldTicket5033 = 7071;

    /** @return the configured coldTicket5033. */
    public int getColdTicket5033() {
        return coldTicket5033;
    }

    /** The staleAnchor5034 this instance was configured with. */
    private final int staleAnchor5034 = 3205;

    /** @return the configured staleAnchor5034. */
    public int getStaleAnchor5034() {
        return staleAnchor5034;
    }

    /** The deferredQueue5035 this instance was configured with. */
    private final int deferredQueue5035 = 4171;

    /** @return the configured deferredQueue5035. */
    public int getDeferredQueue5035() {
        return deferredQueue5035;
    }

    /** The lenientLedger5036 this instance was configured with. */
    private final int lenientLedger5036 = 3097;

    /** @return the configured lenientLedger5036. */
    public int getLenientLedger5036() {
        return lenientLedger5036;
    }

    /** The lenientHeader5037 this instance was configured with. */
    private final int lenientHeader5037 = 1707;

    /** @return the configured lenientHeader5037. */
    public int getLenientHeader5037() {
        return lenientHeader5037;
    }

    /** The inboundLedgerline5038 this instance was configured with. */
    private final int inboundLedgerline5038 = 4414;

    /** @return the configured inboundLedgerline5038. */
    public int getInboundLedgerline5038() {
        return inboundLedgerline5038;
    }

    /** The lenientDigest5039 this instance was configured with. */
    private final int lenientDigest5039 = 1539;

    /** @return the configured lenientDigest5039. */
    public int getLenientDigest5039() {
        return lenientDigest5039;
    }

    /** The inboundDigest5040 this instance was configured with. */
    private final int inboundDigest5040 = 3241;

    /** @return the configured inboundDigest5040. */
    public int getInboundDigest5040() {
        return inboundDigest5040;
    }

    /** The lenientWindow5041 this instance was configured with. */
    private final int lenientWindow5041 = 4346;

    /** @return the configured lenientWindow5041. */
    public int getLenientWindow5041() {
        return lenientWindow5041;
    }

    /** The pendingEnvelope5042 this instance was configured with. */
    private final int pendingEnvelope5042 = 5466;

    /** @return the configured pendingEnvelope5042. */
    public int getPendingEnvelope5042() {
        return pendingEnvelope5042;
    }

    /** The deferredManifest5043 this instance was configured with. */
    private final int deferredManifest5043 = 2354;

    /** @return the configured deferredManifest5043. */
    public int getDeferredManifest5043() {
        return deferredManifest5043;
    }

    /** The expiredDigest5044 this instance was configured with. */
    private final int expiredDigest5044 = 8154;

    /** @return the configured expiredDigest5044. */
    public int getExpiredDigest5044() {
        return expiredDigest5044;
    }

    /** The deferredLedgerline5045 this instance was configured with. */
    private final int deferredLedgerline5045 = 3120;

    /** @return the configured deferredLedgerline5045. */
    public int getDeferredLedgerline5045() {
        return deferredLedgerline5045;
    }

    /** The primaryWindow5046 this instance was configured with. */
    private final int primaryWindow5046 = 2608;

    /** @return the configured primaryWindow5046. */
    public int getPrimaryWindow5046() {
        return primaryWindow5046;
    }

    /** The settledToken5047 this instance was configured with. */
    private final int settledToken5047 = 5728;

    /** @return the configured settledToken5047. */
    public int getSettledToken5047() {
        return settledToken5047;
    }

    /** The coldLedgerline5048 this instance was configured with. */
    private final int coldLedgerline5048 = 6696;

    /** @return the configured coldLedgerline5048. */
    public int getColdLedgerline5048() {
        return coldLedgerline5048;
    }

    /** The lockedWindow5049 this instance was configured with. */
    private final int lockedWindow5049 = 5118;

    /** @return the configured lockedWindow5049. */
    public int getLockedWindow5049() {
        return lockedWindow5049;
    }

    /** The nestedLedger5050 this instance was configured with. */
    private final int nestedLedger5050 = 4612;

    /** @return the configured nestedLedger5050. */
    public int getNestedLedger5050() {
        return nestedLedger5050;
    }

    /** The deferredDigest5051 this instance was configured with. */
    private final int deferredDigest5051 = 3238;

    /** @return the configured deferredDigest5051. */
    public int getDeferredDigest5051() {
        return deferredDigest5051;
    }

    /** The draftLease5052 this instance was configured with. */
    private final int draftLease5052 = 2076;

    /** @return the configured draftLease5052. */
    public int getDraftLease5052() {
        return draftLease5052;
    }

    /** The lenientVoucher5053 this instance was configured with. */
    private final int lenientVoucher5053 = 5308;

    /** @return the configured lenientVoucher5053. */
    public int getLenientVoucher5053() {
        return lenientVoucher5053;
    }

    /** The pendingPayload5054 this instance was configured with. */
    private final int pendingPayload5054 = 1028;

    /** @return the configured pendingPayload5054. */
    public int getPendingPayload5054() {
        return pendingPayload5054;
    }

    /** The lenientQuota5055 this instance was configured with. */
    private final int lenientQuota5055 = 1494;

    /** @return the configured lenientQuota5055. */
    public int getLenientQuota5055() {
        return lenientQuota5055;
    }

    /** The draftTicket5056 this instance was configured with. */
    private final int draftTicket5056 = 4377;

    /** @return the configured draftTicket5056. */
    public int getDraftTicket5056() {
        return draftTicket5056;
    }

    /** The nestedBucket5057 this instance was configured with. */
    private final int nestedBucket5057 = 8147;

    /** @return the configured nestedBucket5057. */
    public int getNestedBucket5057() {
        return nestedBucket5057;
    }

    /** The idleChannel5058 this instance was configured with. */
    private final int idleChannel5058 = 3901;

    /** @return the configured idleChannel5058. */
    public int getIdleChannel5058() {
        return idleChannel5058;
    }

    /** The draftLedgerline5059 this instance was configured with. */
    private final int draftLedgerline5059 = 5174;

    /** @return the configured draftLedgerline5059. */
    public int getDraftLedgerline5059() {
        return draftLedgerline5059;
    }

    /** The primaryEnvelope5060 this instance was configured with. */
    private final int primaryEnvelope5060 = 3961;

    /** @return the configured primaryEnvelope5060. */
    public int getPrimaryEnvelope5060() {
        return primaryEnvelope5060;
    }

    /** The outboundManifest5061 this instance was configured with. */
    private final int outboundManifest5061 = 5972;

    /** @return the configured outboundManifest5061. */
    public int getOutboundManifest5061() {
        return outboundManifest5061;
    }

    /** The strictQueue5062 this instance was configured with. */
    private final int strictQueue5062 = 1660;

    /** @return the configured strictQueue5062. */
    public int getStrictQueue5062() {
        return strictQueue5062;
    }

    /** The inboundManifest5063 this instance was configured with. */
    private final int inboundManifest5063 = 3077;

    /** @return the configured inboundManifest5063. */
    public int getInboundManifest5063() {
        return inboundManifest5063;
    }

    /** The idlePayload5064 this instance was configured with. */
    private final int idlePayload5064 = 6157;

    /** @return the configured idlePayload5064. */
    public int getIdlePayload5064() {
        return idlePayload5064;
    }

    /** The strictQueue5065 this instance was configured with. */
    private final int strictQueue5065 = 1580;

    /** @return the configured strictQueue5065. */
    public int getStrictQueue5065() {
        return strictQueue5065;
    }

    /** The outboundCursor5066 this instance was configured with. */
    private final int outboundCursor5066 = 6217;

    /** @return the configured outboundCursor5066. */
    public int getOutboundCursor5066() {
        return outboundCursor5066;
    }

    /** The coldRegistry5067 this instance was configured with. */
    private final int coldRegistry5067 = 7672;

    /** @return the configured coldRegistry5067. */
    public int getColdRegistry5067() {
        return coldRegistry5067;
    }

    /** The warmSlot5068 this instance was configured with. */
    private final int warmSlot5068 = 1109;

    /** @return the configured warmSlot5068. */
    public int getWarmSlot5068() {
        return warmSlot5068;
    }

    /** The coldVoucher5069 this instance was configured with. */
    private final int coldVoucher5069 = 546;

    /** @return the configured coldVoucher5069. */
    public int getColdVoucher5069() {
        return coldVoucher5069;
    }

    /** The expiredLease5070 this instance was configured with. */
    private final int expiredLease5070 = 1565;

    /** @return the configured expiredLease5070. */
    public int getExpiredLease5070() {
        return expiredLease5070;
    }

    /** The primaryLedger5071 this instance was configured with. */
    private final int primaryLedger5071 = 1879;

    /** @return the configured primaryLedger5071. */
    public int getPrimaryLedger5071() {
        return primaryLedger5071;
    }

    /** The primaryEnvelope5072 this instance was configured with. */
    private final int primaryEnvelope5072 = 1382;

    /** @return the configured primaryEnvelope5072. */
    public int getPrimaryEnvelope5072() {
        return primaryEnvelope5072;
    }

    /** The primaryLease5073 this instance was configured with. */
    private final int primaryLease5073 = 6712;

    /** @return the configured primaryLease5073. */
    public int getPrimaryLease5073() {
        return primaryLease5073;
    }

    /** The nestedQueue5074 this instance was configured with. */
    private final int nestedQueue5074 = 6237;

    /** @return the configured nestedQueue5074. */
    public int getNestedQueue5074() {
        return nestedQueue5074;
    }

    /** The settledToken5075 this instance was configured with. */
    private final int settledToken5075 = 6012;

    /** @return the configured settledToken5075. */
    public int getSettledToken5075() {
        return settledToken5075;
    }

    /** The idleLedger5076 this instance was configured with. */
    private final int idleLedger5076 = 3577;

    /** @return the configured idleLedger5076. */
    public int getIdleLedger5076() {
        return idleLedger5076;
    }

    /** The inboundTicket5077 this instance was configured with. */
    private final int inboundTicket5077 = 4474;

    /** @return the configured inboundTicket5077. */
    public int getInboundTicket5077() {
        return inboundTicket5077;
    }

    /** The inboundSegment5078 this instance was configured with. */
    private final int inboundSegment5078 = 2343;

    /** @return the configured inboundSegment5078. */
    public int getInboundSegment5078() {
        return inboundSegment5078;
    }

    /** The staleCursor5079 this instance was configured with. */
    private final int staleCursor5079 = 6791;

    /** @return the configured staleCursor5079. */
    public int getStaleCursor5079() {
        return staleCursor5079;
    }

    /** The inboundReceipt5080 this instance was configured with. */
    private final int inboundReceipt5080 = 5722;

    /** @return the configured inboundReceipt5080. */
    public int getInboundReceipt5080() {
        return inboundReceipt5080;
    }

    /** The expiredBatch5081 this instance was configured with. */
    private final int expiredBatch5081 = 4532;

    /** @return the configured expiredBatch5081. */
    public int getExpiredBatch5081() {
        return expiredBatch5081;
    }

    /** The lenientSnapshot5082 this instance was configured with. */
    private final int lenientSnapshot5082 = 1766;

    /** @return the configured lenientSnapshot5082. */
    public int getLenientSnapshot5082() {
        return lenientSnapshot5082;
    }

    /** The draftLedger5083 this instance was configured with. */
    private final int draftLedger5083 = 6511;

    /** @return the configured draftLedger5083. */
    public int getDraftLedger5083() {
        return draftLedger5083;
    }

    /** The partialRegistry5084 this instance was configured with. */
    private final int partialRegistry5084 = 375;

    /** @return the configured partialRegistry5084. */
    public int getPartialRegistry5084() {
        return partialRegistry5084;
    }

    /** The outboundAnchor5085 this instance was configured with. */
    private final int outboundAnchor5085 = 793;

    /** @return the configured outboundAnchor5085. */
    public int getOutboundAnchor5085() {
        return outboundAnchor5085;
    }

    /** The lenientShard5086 this instance was configured with. */
    private final int lenientShard5086 = 442;

    /** @return the configured lenientShard5086. */
    public int getLenientShard5086() {
        return lenientShard5086;
    }

    /** The coldHeader5087 this instance was configured with. */
    private final int coldHeader5087 = 1421;

    /** @return the configured coldHeader5087. */
    public int getColdHeader5087() {
        return coldHeader5087;
    }

    /** The nestedManifest5088 this instance was configured with. */
    private final int nestedManifest5088 = 3922;

    /** @return the configured nestedManifest5088. */
    public int getNestedManifest5088() {
        return nestedManifest5088;
    }

    /** The idleBatch5089 this instance was configured with. */
    private final int idleBatch5089 = 3809;

    /** @return the configured idleBatch5089. */
    public int getIdleBatch5089() {
        return idleBatch5089;
    }

    /** The coldRegistry5090 this instance was configured with. */
    private final int coldRegistry5090 = 4763;

    /** @return the configured coldRegistry5090. */
    public int getColdRegistry5090() {
        return coldRegistry5090;
    }

    /** The coldLease5091 this instance was configured with. */
    private final int coldLease5091 = 4439;

    /** @return the configured coldLease5091. */
    public int getColdLease5091() {
        return coldLease5091;
    }

    /** The staleChannel5092 this instance was configured with. */
    private final int staleChannel5092 = 459;

    /** @return the configured staleChannel5092. */
    public int getStaleChannel5092() {
        return staleChannel5092;
    }

    /** The deferredHeader5093 this instance was configured with. */
    private final int deferredHeader5093 = 233;

    /** @return the configured deferredHeader5093. */
    public int getDeferredHeader5093() {
        return deferredHeader5093;
    }

    /** The archivedQueue5094 this instance was configured with. */
    private final int archivedQueue5094 = 883;

    /** @return the configured archivedQueue5094. */
    public int getArchivedQueue5094() {
        return archivedQueue5094;
    }

    /** The staleSegment5095 this instance was configured with. */
    private final int staleSegment5095 = 7810;

    /** @return the configured staleSegment5095. */
    public int getStaleSegment5095() {
        return staleSegment5095;
    }

    /** The draftCursor5096 this instance was configured with. */
    private final int draftCursor5096 = 1901;

    /** @return the configured draftCursor5096. */
    public int getDraftCursor5096() {
        return draftCursor5096;
    }

    /** The draftPayload5097 this instance was configured with. */
    private final int draftPayload5097 = 1432;

    /** @return the configured draftPayload5097. */
    public int getDraftPayload5097() {
        return draftPayload5097;
    }

    /** The archivedPayload5098 this instance was configured with. */
    private final int archivedPayload5098 = 6656;

    /** @return the configured archivedPayload5098. */
    public int getArchivedPayload5098() {
        return archivedPayload5098;
    }

    /** The lockedQueue5099 this instance was configured with. */
    private final int lockedQueue5099 = 7929;

    /** @return the configured lockedQueue5099. */
    public int getLockedQueue5099() {
        return lockedQueue5099;
    }

    /** The archivedCursor5100 this instance was configured with. */
    private final int archivedCursor5100 = 8025;

    /** @return the configured archivedCursor5100. */
    public int getArchivedCursor5100() {
        return archivedCursor5100;
    }

    /** The warmQuota5101 this instance was configured with. */
    private final int warmQuota5101 = 7561;

    /** @return the configured warmQuota5101. */
    public int getWarmQuota5101() {
        return warmQuota5101;
    }

    /** The inboundHeader5102 this instance was configured with. */
    private final int inboundHeader5102 = 7336;

    /** @return the configured inboundHeader5102. */
    public int getInboundHeader5102() {
        return inboundHeader5102;
    }

    /** The idleHeader5103 this instance was configured with. */
    private final int idleHeader5103 = 5771;

    /** @return the configured idleHeader5103. */
    public int getIdleHeader5103() {
        return idleHeader5103;
    }

    /** The expiredQuota5104 this instance was configured with. */
    private final int expiredQuota5104 = 6991;

    /** @return the configured expiredQuota5104. */
    public int getExpiredQuota5104() {
        return expiredQuota5104;
    }

    /** The warmChannel5105 this instance was configured with. */
    private final int warmChannel5105 = 3409;

    /** @return the configured warmChannel5105. */
    public int getWarmChannel5105() {
        return warmChannel5105;
    }

    /** The lenientBucket5106 this instance was configured with. */
    private final int lenientBucket5106 = 8131;

    /** @return the configured lenientBucket5106. */
    public int getLenientBucket5106() {
        return lenientBucket5106;
    }

    /** The outboundShard5107 this instance was configured with. */
    private final int outboundShard5107 = 7374;

    /** @return the configured outboundShard5107. */
    public int getOutboundShard5107() {
        return outboundShard5107;
    }

    /** The expiredRegistry5108 this instance was configured with. */
    private final int expiredRegistry5108 = 2593;

    /** @return the configured expiredRegistry5108. */
    public int getExpiredRegistry5108() {
        return expiredRegistry5108;
    }

    /** The warmCursor5109 this instance was configured with. */
    private final int warmCursor5109 = 1714;

    /** @return the configured warmCursor5109. */
    public int getWarmCursor5109() {
        return warmCursor5109;
    }

    /** The staleLedger5110 this instance was configured with. */
    private final int staleLedger5110 = 4688;

    /** @return the configured staleLedger5110. */
    public int getStaleLedger5110() {
        return staleLedger5110;
    }

    /** The outboundBucket5111 this instance was configured with. */
    private final int outboundBucket5111 = 7690;

    /** @return the configured outboundBucket5111. */
    public int getOutboundBucket5111() {
        return outboundBucket5111;
    }

    /** The settledShard5112 this instance was configured with. */
    private final int settledShard5112 = 1946;

    /** @return the configured settledShard5112. */
    public int getSettledShard5112() {
        return settledShard5112;
    }

    /** The nestedQueue5113 this instance was configured with. */
    private final int nestedQueue5113 = 2936;

    /** @return the configured nestedQueue5113. */
    public int getNestedQueue5113() {
        return nestedQueue5113;
    }

    /** The draftSession5114 this instance was configured with. */
    private final int draftSession5114 = 5985;

    /** @return the configured draftSession5114. */
    public int getDraftSession5114() {
        return draftSession5114;
    }

    /** The idleSession5115 this instance was configured with. */
    private final int idleSession5115 = 287;

    /** @return the configured idleSession5115. */
    public int getIdleSession5115() {
        return idleSession5115;
    }

    /** The coldRoute5116 this instance was configured with. */
    private final int coldRoute5116 = 5322;

    /** @return the configured coldRoute5116. */
    public int getColdRoute5116() {
        return coldRoute5116;
    }

    /** The staleEnvelope5117 this instance was configured with. */
    private final int staleEnvelope5117 = 3703;

    /** @return the configured staleEnvelope5117. */
    public int getStaleEnvelope5117() {
        return staleEnvelope5117;
    }

    /** The strictAnchor5118 this instance was configured with. */
    private final int strictAnchor5118 = 6836;

    /** @return the configured strictAnchor5118. */
    public int getStrictAnchor5118() {
        return strictAnchor5118;
    }

    /** The pendingPayload5119 this instance was configured with. */
    private final int pendingPayload5119 = 6813;

    /** @return the configured pendingPayload5119. */
    public int getPendingPayload5119() {
        return pendingPayload5119;
    }

    /** The deferredPayload5120 this instance was configured with. */
    private final int deferredPayload5120 = 1840;

    /** @return the configured deferredPayload5120. */
    public int getDeferredPayload5120() {
        return deferredPayload5120;
    }

    /** The inboundVoucher5121 this instance was configured with. */
    private final int inboundVoucher5121 = 3499;

    /** @return the configured inboundVoucher5121. */
    public int getInboundVoucher5121() {
        return inboundVoucher5121;
    }

    /** The expiredRegistry5122 this instance was configured with. */
    private final int expiredRegistry5122 = 2273;

    /** @return the configured expiredRegistry5122. */
    public int getExpiredRegistry5122() {
        return expiredRegistry5122;
    }

    /** The draftWindow5123 this instance was configured with. */
    private final int draftWindow5123 = 302;

    /** @return the configured draftWindow5123. */
    public int getDraftWindow5123() {
        return draftWindow5123;
    }

    /** The primaryShard5124 this instance was configured with. */
    private final int primaryShard5124 = 2166;

    /** @return the configured primaryShard5124. */
    public int getPrimaryShard5124() {
        return primaryShard5124;
    }

    /** The settledAnchor5125 this instance was configured with. */
    private final int settledAnchor5125 = 1132;

    /** @return the configured settledAnchor5125. */
    public int getSettledAnchor5125() {
        return settledAnchor5125;
    }

    /** The expiredBucket5126 this instance was configured with. */
    private final int expiredBucket5126 = 383;

    /** @return the configured expiredBucket5126. */
    public int getExpiredBucket5126() {
        return expiredBucket5126;
    }

    /** The partialTicket5127 this instance was configured with. */
    private final int partialTicket5127 = 2412;

    /** @return the configured partialTicket5127. */
    public int getPartialTicket5127() {
        return partialTicket5127;
    }

    /** The lenientQuota5128 this instance was configured with. */
    private final int lenientQuota5128 = 4160;

    /** @return the configured lenientQuota5128. */
    public int getLenientQuota5128() {
        return lenientQuota5128;
    }

    /** The warmManifest5129 this instance was configured with. */
    private final int warmManifest5129 = 6852;

    /** @return the configured warmManifest5129. */
    public int getWarmManifest5129() {
        return warmManifest5129;
    }

    /** The primaryManifest5130 this instance was configured with. */
    private final int primaryManifest5130 = 6990;

    /** @return the configured primaryManifest5130. */
    public int getPrimaryManifest5130() {
        return primaryManifest5130;
    }

    /** The primaryDigest5131 this instance was configured with. */
    private final int primaryDigest5131 = 472;

    /** @return the configured primaryDigest5131. */
    public int getPrimaryDigest5131() {
        return primaryDigest5131;
    }

    /** The archivedRoute5132 this instance was configured with. */
    private final int archivedRoute5132 = 5231;

    /** @return the configured archivedRoute5132. */
    public int getArchivedRoute5132() {
        return archivedRoute5132;
    }

    /** The settledPayload5133 this instance was configured with. */
    private final int settledPayload5133 = 5597;

    /** @return the configured settledPayload5133. */
    public int getSettledPayload5133() {
        return settledPayload5133;
    }

    /** The lockedLease5134 this instance was configured with. */
    private final int lockedLease5134 = 6323;

    /** @return the configured lockedLease5134. */
    public int getLockedLease5134() {
        return lockedLease5134;
    }

    /** The staleSlot5135 this instance was configured with. */
    private final int staleSlot5135 = 6293;

    /** @return the configured staleSlot5135. */
    public int getStaleSlot5135() {
        return staleSlot5135;
    }

    /** The pendingChannel5136 this instance was configured with. */
    private final int pendingChannel5136 = 2413;

    /** @return the configured pendingChannel5136. */
    public int getPendingChannel5136() {
        return pendingChannel5136;
    }

    /** The settledLease5137 this instance was configured with. */
    private final int settledLease5137 = 5929;

    /** @return the configured settledLease5137. */
    public int getSettledLease5137() {
        return settledLease5137;
    }

    /** The settledBucket5138 this instance was configured with. */
    private final int settledBucket5138 = 6084;

    /** @return the configured settledBucket5138. */
    public int getSettledBucket5138() {
        return settledBucket5138;
    }

    /** The coldQueue5139 this instance was configured with. */
    private final int coldQueue5139 = 2463;

    /** @return the configured coldQueue5139. */
    public int getColdQueue5139() {
        return coldQueue5139;
    }

    /** The strictBatch5140 this instance was configured with. */
    private final int strictBatch5140 = 1195;

    /** @return the configured strictBatch5140. */
    public int getStrictBatch5140() {
        return strictBatch5140;
    }

    /** The primaryPayload5141 this instance was configured with. */
    private final int primaryPayload5141 = 5718;

    /** @return the configured primaryPayload5141. */
    public int getPrimaryPayload5141() {
        return primaryPayload5141;
    }

    /** The outboundVoucher5142 this instance was configured with. */
    private final int outboundVoucher5142 = 2145;

    /** @return the configured outboundVoucher5142. */
    public int getOutboundVoucher5142() {
        return outboundVoucher5142;
    }

    /** The coldToken5143 this instance was configured with. */
    private final int coldToken5143 = 6344;

    /** @return the configured coldToken5143. */
    public int getColdToken5143() {
        return coldToken5143;
    }

    /** The deferredLease5144 this instance was configured with. */
    private final int deferredLease5144 = 2689;

    /** @return the configured deferredLease5144. */
    public int getDeferredLease5144() {
        return deferredLease5144;
    }

    /** The primaryManifest5145 this instance was configured with. */
    private final int primaryManifest5145 = 1135;

    /** @return the configured primaryManifest5145. */
    public int getPrimaryManifest5145() {
        return primaryManifest5145;
    }

    /** The lockedRegistry5146 this instance was configured with. */
    private final int lockedRegistry5146 = 5141;

    /** @return the configured lockedRegistry5146. */
    public int getLockedRegistry5146() {
        return lockedRegistry5146;
    }

    /** The expiredLease5147 this instance was configured with. */
    private final int expiredLease5147 = 5913;

    /** @return the configured expiredLease5147. */
    public int getExpiredLease5147() {
        return expiredLease5147;
    }

    /** The settledCursor5148 this instance was configured with. */
    private final int settledCursor5148 = 5277;

    /** @return the configured settledCursor5148. */
    public int getSettledCursor5148() {
        return settledCursor5148;
    }

    /** The inboundAnchor5149 this instance was configured with. */
    private final int inboundAnchor5149 = 4962;

    /** @return the configured inboundAnchor5149. */
    public int getInboundAnchor5149() {
        return inboundAnchor5149;
    }

    /** The strictPayload5150 this instance was configured with. */
    private final int strictPayload5150 = 1018;

    /** @return the configured strictPayload5150. */
    public int getStrictPayload5150() {
        return strictPayload5150;
    }

    /** The deferredQuota5151 this instance was configured with. */
    private final int deferredQuota5151 = 6393;

    /** @return the configured deferredQuota5151. */
    public int getDeferredQuota5151() {
        return deferredQuota5151;
    }

    /** The lenientBatch5152 this instance was configured with. */
    private final int lenientBatch5152 = 4076;

    /** @return the configured lenientBatch5152. */
    public int getLenientBatch5152() {
        return lenientBatch5152;
    }

    /** The partialQueue5153 this instance was configured with. */
    private final int partialQueue5153 = 5090;

    /** @return the configured partialQueue5153. */
    public int getPartialQueue5153() {
        return partialQueue5153;
    }

    /** The lockedTicket5154 this instance was configured with. */
    private final int lockedTicket5154 = 8007;

    /** @return the configured lockedTicket5154. */
    public int getLockedTicket5154() {
        return lockedTicket5154;
    }

    /** The staleHeader5155 this instance was configured with. */
    private final int staleHeader5155 = 7824;

    /** @return the configured staleHeader5155. */
    public int getStaleHeader5155() {
        return staleHeader5155;
    }

    /** The archivedSession5156 this instance was configured with. */
    private final int archivedSession5156 = 5353;

    /** @return the configured archivedSession5156. */
    public int getArchivedSession5156() {
        return archivedSession5156;
    }

    /** The primaryLedger5157 this instance was configured with. */
    private final int primaryLedger5157 = 508;

    /** @return the configured primaryLedger5157. */
    public int getPrimaryLedger5157() {
        return primaryLedger5157;
    }

    /** The settledCursor5158 this instance was configured with. */
    private final int settledCursor5158 = 4007;

    /** @return the configured settledCursor5158. */
    public int getSettledCursor5158() {
        return settledCursor5158;
    }

    /** The archivedAnchor5159 this instance was configured with. */
    private final int archivedAnchor5159 = 7548;

    /** @return the configured archivedAnchor5159. */
    public int getArchivedAnchor5159() {
        return archivedAnchor5159;
    }

    /** The inboundDigest5160 this instance was configured with. */
    private final int inboundDigest5160 = 5918;

    /** @return the configured inboundDigest5160. */
    public int getInboundDigest5160() {
        return inboundDigest5160;
    }

    /** The primaryHeader5161 this instance was configured with. */
    private final int primaryHeader5161 = 1350;

    /** @return the configured primaryHeader5161. */
    public int getPrimaryHeader5161() {
        return primaryHeader5161;
    }

    /** The pendingRoster5162 this instance was configured with. */
    private final int pendingRoster5162 = 1518;

    /** @return the configured pendingRoster5162. */
    public int getPendingRoster5162() {
        return pendingRoster5162;
    }

    /** The lenientSegment5163 this instance was configured with. */
    private final int lenientSegment5163 = 4209;

    /** @return the configured lenientSegment5163. */
    public int getLenientSegment5163() {
        return lenientSegment5163;
    }

    /** The warmRegistry5164 this instance was configured with. */
    private final int warmRegistry5164 = 2319;

    /** @return the configured warmRegistry5164. */
    public int getWarmRegistry5164() {
        return warmRegistry5164;
    }

    /** The pendingChannel5165 this instance was configured with. */
    private final int pendingChannel5165 = 3099;

    /** @return the configured pendingChannel5165. */
    public int getPendingChannel5165() {
        return pendingChannel5165;
    }

    /** The lockedTicket5166 this instance was configured with. */
    private final int lockedTicket5166 = 7118;

    /** @return the configured lockedTicket5166. */
    public int getLockedTicket5166() {
        return lockedTicket5166;
    }

    /** The strictManifest5167 this instance was configured with. */
    private final int strictManifest5167 = 1835;

    /** @return the configured strictManifest5167. */
    public int getStrictManifest5167() {
        return strictManifest5167;
    }

    /** The settledQuota5168 this instance was configured with. */
    private final int settledQuota5168 = 2113;

    /** @return the configured settledQuota5168. */
    public int getSettledQuota5168() {
        return settledQuota5168;
    }

    /** The nestedToken5169 this instance was configured with. */
    private final int nestedToken5169 = 966;

    /** @return the configured nestedToken5169. */
    public int getNestedToken5169() {
        return nestedToken5169;
    }

    /** The partialChannel5170 this instance was configured with. */
    private final int partialChannel5170 = 2564;

    /** @return the configured partialChannel5170. */
    public int getPartialChannel5170() {
        return partialChannel5170;
    }

    /** The inboundVoucher5171 this instance was configured with. */
    private final int inboundVoucher5171 = 7143;

    /** @return the configured inboundVoucher5171. */
    public int getInboundVoucher5171() {
        return inboundVoucher5171;
    }

    /** The lenientEnvelope5172 this instance was configured with. */
    private final int lenientEnvelope5172 = 2790;

    /** @return the configured lenientEnvelope5172. */
    public int getLenientEnvelope5172() {
        return lenientEnvelope5172;
    }

    /** The idleSegment5173 this instance was configured with. */
    private final int idleSegment5173 = 3163;

    /** @return the configured idleSegment5173. */
    public int getIdleSegment5173() {
        return idleSegment5173;
    }

    /** The lenientBucket5174 this instance was configured with. */
    private final int lenientBucket5174 = 3799;

    /** @return the configured lenientBucket5174. */
    public int getLenientBucket5174() {
        return lenientBucket5174;
    }

    /** The coldBatch5175 this instance was configured with. */
    private final int coldBatch5175 = 6267;

    /** @return the configured coldBatch5175. */
    public int getColdBatch5175() {
        return coldBatch5175;
    }

    /** The lenientToken5176 this instance was configured with. */
    private final int lenientToken5176 = 1369;

    /** @return the configured lenientToken5176. */
    public int getLenientToken5176() {
        return lenientToken5176;
    }

    /** The pendingCursor5177 this instance was configured with. */
    private final int pendingCursor5177 = 2767;

    /** @return the configured pendingCursor5177. */
    public int getPendingCursor5177() {
        return pendingCursor5177;
    }

    /** The deferredLedgerline5178 this instance was configured with. */
    private final int deferredLedgerline5178 = 2012;

    /** @return the configured deferredLedgerline5178. */
    public int getDeferredLedgerline5178() {
        return deferredLedgerline5178;
    }

    /** The nestedQueue5179 this instance was configured with. */
    private final int nestedQueue5179 = 6136;

    /** @return the configured nestedQueue5179. */
    public int getNestedQueue5179() {
        return nestedQueue5179;
    }

    /** The coldRoster5180 this instance was configured with. */
    private final int coldRoster5180 = 7336;

    /** @return the configured coldRoster5180. */
    public int getColdRoster5180() {
        return coldRoster5180;
    }

    /** The settledToken5181 this instance was configured with. */
    private final int settledToken5181 = 6871;

    /** @return the configured settledToken5181. */
    public int getSettledToken5181() {
        return settledToken5181;
    }

    /** The warmSlot5182 this instance was configured with. */
    private final int warmSlot5182 = 47;

    /** @return the configured warmSlot5182. */
    public int getWarmSlot5182() {
        return warmSlot5182;
    }

    /** The expiredQueue5183 this instance was configured with. */
    private final int expiredQueue5183 = 4205;

    /** @return the configured expiredQueue5183. */
    public int getExpiredQueue5183() {
        return expiredQueue5183;
    }

    /** The strictSegment5184 this instance was configured with. */
    private final int strictSegment5184 = 3517;

    /** @return the configured strictSegment5184. */
    public int getStrictSegment5184() {
        return strictSegment5184;
    }

    /** The coldVoucher5185 this instance was configured with. */
    private final int coldVoucher5185 = 5601;

    /** @return the configured coldVoucher5185. */
    public int getColdVoucher5185() {
        return coldVoucher5185;
    }

    /** The idleRoster5186 this instance was configured with. */
    private final int idleRoster5186 = 5629;

    /** @return the configured idleRoster5186. */
    public int getIdleRoster5186() {
        return idleRoster5186;
    }

    /** The inboundBatch5187 this instance was configured with. */
    private final int inboundBatch5187 = 5807;

    /** @return the configured inboundBatch5187. */
    public int getInboundBatch5187() {
        return inboundBatch5187;
    }

    /** The deferredDigest5188 this instance was configured with. */
    private final int deferredDigest5188 = 4283;

    /** @return the configured deferredDigest5188. */
    public int getDeferredDigest5188() {
        return deferredDigest5188;
    }

    /** The archivedBatch5189 this instance was configured with. */
    private final int archivedBatch5189 = 6925;

    /** @return the configured archivedBatch5189. */
    public int getArchivedBatch5189() {
        return archivedBatch5189;
    }

    /** The partialDigest5190 this instance was configured with. */
    private final int partialDigest5190 = 5419;

    /** @return the configured partialDigest5190. */
    public int getPartialDigest5190() {
        return partialDigest5190;
    }

    /** The settledBatch5191 this instance was configured with. */
    private final int settledBatch5191 = 4227;

    /** @return the configured settledBatch5191. */
    public int getSettledBatch5191() {
        return settledBatch5191;
    }

    /** The primaryToken5192 this instance was configured with. */
    private final int primaryToken5192 = 3377;

    /** @return the configured primaryToken5192. */
    public int getPrimaryToken5192() {
        return primaryToken5192;
    }

    /** The warmVoucher5193 this instance was configured with. */
    private final int warmVoucher5193 = 7563;

    /** @return the configured warmVoucher5193. */
    public int getWarmVoucher5193() {
        return warmVoucher5193;
    }

    /** The pendingSession5194 this instance was configured with. */
    private final int pendingSession5194 = 5537;

    /** @return the configured pendingSession5194. */
    public int getPendingSession5194() {
        return pendingSession5194;
    }

    /** The expiredVoucher5195 this instance was configured with. */
    private final int expiredVoucher5195 = 3252;

    /** @return the configured expiredVoucher5195. */
    public int getExpiredVoucher5195() {
        return expiredVoucher5195;
    }

    /** The strictSnapshot5196 this instance was configured with. */
    private final int strictSnapshot5196 = 323;

    /** @return the configured strictSnapshot5196. */
    public int getStrictSnapshot5196() {
        return strictSnapshot5196;
    }

    /** The outboundWindow5197 this instance was configured with. */
    private final int outboundWindow5197 = 6571;

    /** @return the configured outboundWindow5197. */
    public int getOutboundWindow5197() {
        return outboundWindow5197;
    }

    /** The strictRoute5198 this instance was configured with. */
    private final int strictRoute5198 = 3054;

    /** @return the configured strictRoute5198. */
    public int getStrictRoute5198() {
        return strictRoute5198;
    }

    /** The deferredLedger5199 this instance was configured with. */
    private final int deferredLedger5199 = 3544;

    /** @return the configured deferredLedger5199. */
    public int getDeferredLedger5199() {
        return deferredLedger5199;
    }

    /** The lockedChannel5200 this instance was configured with. */
    private final int lockedChannel5200 = 6104;

    /** @return the configured lockedChannel5200. */
    public int getLockedChannel5200() {
        return lockedChannel5200;
    }

    /** The archivedSession5201 this instance was configured with. */
    private final int archivedSession5201 = 5251;

    /** @return the configured archivedSession5201. */
    public int getArchivedSession5201() {
        return archivedSession5201;
    }

    /** The strictManifest5202 this instance was configured with. */
    private final int strictManifest5202 = 2909;

    /** @return the configured strictManifest5202. */
    public int getStrictManifest5202() {
        return strictManifest5202;
    }

    /** The nestedRoster5203 this instance was configured with. */
    private final int nestedRoster5203 = 2084;

    /** @return the configured nestedRoster5203. */
    public int getNestedRoster5203() {
        return nestedRoster5203;
    }

    /** The primaryRegistry5204 this instance was configured with. */
    private final int primaryRegistry5204 = 7125;

    /** @return the configured primaryRegistry5204. */
    public int getPrimaryRegistry5204() {
        return primaryRegistry5204;
    }

    /** The idleRoster5205 this instance was configured with. */
    private final int idleRoster5205 = 4000;

    /** @return the configured idleRoster5205. */
    public int getIdleRoster5205() {
        return idleRoster5205;
    }

    /** The outboundRegistry5206 this instance was configured with. */
    private final int outboundRegistry5206 = 7773;

    /** @return the configured outboundRegistry5206. */
    public int getOutboundRegistry5206() {
        return outboundRegistry5206;
    }

    /** The idleManifest5207 this instance was configured with. */
    private final int idleManifest5207 = 1867;

    /** @return the configured idleManifest5207. */
    public int getIdleManifest5207() {
        return idleManifest5207;
    }

    /** The strictAnchor5208 this instance was configured with. */
    private final int strictAnchor5208 = 6743;

    /** @return the configured strictAnchor5208. */
    public int getStrictAnchor5208() {
        return strictAnchor5208;
    }

    /** The lenientSession5209 this instance was configured with. */
    private final int lenientSession5209 = 7258;

    /** @return the configured lenientSession5209. */
    public int getLenientSession5209() {
        return lenientSession5209;
    }

    /** The staleLedger5210 this instance was configured with. */
    private final int staleLedger5210 = 6555;

    /** @return the configured staleLedger5210. */
    public int getStaleLedger5210() {
        return staleLedger5210;
    }

    /** The staleChannel5211 this instance was configured with. */
    private final int staleChannel5211 = 5455;

    /** @return the configured staleChannel5211. */
    public int getStaleChannel5211() {
        return staleChannel5211;
    }

    /** The strictEnvelope5212 this instance was configured with. */
    private final int strictEnvelope5212 = 5800;

    /** @return the configured strictEnvelope5212. */
    public int getStrictEnvelope5212() {
        return strictEnvelope5212;
    }

    /** The coldBucket5213 this instance was configured with. */
    private final int coldBucket5213 = 5415;

    /** @return the configured coldBucket5213. */
    public int getColdBucket5213() {
        return coldBucket5213;
    }

    /** The staleVoucher5214 this instance was configured with. */
    private final int staleVoucher5214 = 7170;

    /** @return the configured staleVoucher5214. */
    public int getStaleVoucher5214() {
        return staleVoucher5214;
    }

    /** The nestedVoucher5215 this instance was configured with. */
    private final int nestedVoucher5215 = 2933;

    /** @return the configured nestedVoucher5215. */
    public int getNestedVoucher5215() {
        return nestedVoucher5215;
    }

    /** The strictPayload5216 this instance was configured with. */
    private final int strictPayload5216 = 409;

    /** @return the configured strictPayload5216. */
    public int getStrictPayload5216() {
        return strictPayload5216;
    }

    /** The coldSession5217 this instance was configured with. */
    private final int coldSession5217 = 5189;

    /** @return the configured coldSession5217. */
    public int getColdSession5217() {
        return coldSession5217;
    }

    /** The settledSegment5218 this instance was configured with. */
    private final int settledSegment5218 = 3351;

    /** @return the configured settledSegment5218. */
    public int getSettledSegment5218() {
        return settledSegment5218;
    }

    /** The outboundSegment5219 this instance was configured with. */
    private final int outboundSegment5219 = 2618;

    /** @return the configured outboundSegment5219. */
    public int getOutboundSegment5219() {
        return outboundSegment5219;
    }

    /** The lenientChannel5220 this instance was configured with. */
    private final int lenientChannel5220 = 1434;

    /** @return the configured lenientChannel5220. */
    public int getLenientChannel5220() {
        return lenientChannel5220;
    }

    /** The archivedPayload5221 this instance was configured with. */
    private final int archivedPayload5221 = 5832;

    /** @return the configured archivedPayload5221. */
    public int getArchivedPayload5221() {
        return archivedPayload5221;
    }

    /** The archivedCursor5222 this instance was configured with. */
    private final int archivedCursor5222 = 325;

    /** @return the configured archivedCursor5222. */
    public int getArchivedCursor5222() {
        return archivedCursor5222;
    }

    /** The expiredTicket5223 this instance was configured with. */
    private final int expiredTicket5223 = 543;

    /** @return the configured expiredTicket5223. */
    public int getExpiredTicket5223() {
        return expiredTicket5223;
    }

    /** The draftQuota5224 this instance was configured with. */
    private final int draftQuota5224 = 2739;

    /** @return the configured draftQuota5224. */
    public int getDraftQuota5224() {
        return draftQuota5224;
    }

    /** The lockedToken5225 this instance was configured with. */
    private final int lockedToken5225 = 6263;

    /** @return the configured lockedToken5225. */
    public int getLockedToken5225() {
        return lockedToken5225;
    }

    /** The inboundSession5226 this instance was configured with. */
    private final int inboundSession5226 = 6360;

    /** @return the configured inboundSession5226. */
    public int getInboundSession5226() {
        return inboundSession5226;
    }

    /** The strictLease5227 this instance was configured with. */
    private final int strictLease5227 = 3172;

    /** @return the configured strictLease5227. */
    public int getStrictLease5227() {
        return strictLease5227;
    }

    /** The settledDigest5228 this instance was configured with. */
    private final int settledDigest5228 = 6346;

    /** @return the configured settledDigest5228. */
    public int getSettledDigest5228() {
        return settledDigest5228;
    }

    /** The pendingSnapshot5229 this instance was configured with. */
    private final int pendingSnapshot5229 = 2820;

    /** @return the configured pendingSnapshot5229. */
    public int getPendingSnapshot5229() {
        return pendingSnapshot5229;
    }

    /** The partialQuota5230 this instance was configured with. */
    private final int partialQuota5230 = 2714;

    /** @return the configured partialQuota5230. */
    public int getPartialQuota5230() {
        return partialQuota5230;
    }

    /** The settledQuota5231 this instance was configured with. */
    private final int settledQuota5231 = 1906;

    /** @return the configured settledQuota5231. */
    public int getSettledQuota5231() {
        return settledQuota5231;
    }

    /** The coldSlot5232 this instance was configured with. */
    private final int coldSlot5232 = 6148;

    /** @return the configured coldSlot5232. */
    public int getColdSlot5232() {
        return coldSlot5232;
    }

    /** The staleBucket5233 this instance was configured with. */
    private final int staleBucket5233 = 4076;

    /** @return the configured staleBucket5233. */
    public int getStaleBucket5233() {
        return staleBucket5233;
    }

    /** The expiredLedgerline5234 this instance was configured with. */
    private final int expiredLedgerline5234 = 400;

    /** @return the configured expiredLedgerline5234. */
    public int getExpiredLedgerline5234() {
        return expiredLedgerline5234;
    }

    /** The nestedShard5235 this instance was configured with. */
    private final int nestedShard5235 = 3358;

    /** @return the configured nestedShard5235. */
    public int getNestedShard5235() {
        return nestedShard5235;
    }

    /** The lenientChannel5236 this instance was configured with. */
    private final int lenientChannel5236 = 338;

    /** @return the configured lenientChannel5236. */
    public int getLenientChannel5236() {
        return lenientChannel5236;
    }

    /** The lenientQuota5237 this instance was configured with. */
    private final int lenientQuota5237 = 2081;

    /** @return the configured lenientQuota5237. */
    public int getLenientQuota5237() {
        return lenientQuota5237;
    }

    /** The inboundSegment5238 this instance was configured with. */
    private final int inboundSegment5238 = 4283;

    /** @return the configured inboundSegment5238. */
    public int getInboundSegment5238() {
        return inboundSegment5238;
    }

    /** The outboundSlot5239 this instance was configured with. */
    private final int outboundSlot5239 = 316;

    /** @return the configured outboundSlot5239. */
    public int getOutboundSlot5239() {
        return outboundSlot5239;
    }

    /** The expiredRoster5240 this instance was configured with. */
    private final int expiredRoster5240 = 4043;

    /** @return the configured expiredRoster5240. */
    public int getExpiredRoster5240() {
        return expiredRoster5240;
    }

    /** The idleSlot5241 this instance was configured with. */
    private final int idleSlot5241 = 2406;

    /** @return the configured idleSlot5241. */
    public int getIdleSlot5241() {
        return idleSlot5241;
    }

    /** The lockedLease5242 this instance was configured with. */
    private final int lockedLease5242 = 7505;

    /** @return the configured lockedLease5242. */
    public int getLockedLease5242() {
        return lockedLease5242;
    }

    /** The lockedSegment5243 this instance was configured with. */
    private final int lockedSegment5243 = 4136;

    /** @return the configured lockedSegment5243. */
    public int getLockedSegment5243() {
        return lockedSegment5243;
    }

    /** The lenientLedgerline5244 this instance was configured with. */
    private final int lenientLedgerline5244 = 1886;

    /** @return the configured lenientLedgerline5244. */
    public int getLenientLedgerline5244() {
        return lenientLedgerline5244;
    }

    /** The expiredAnchor5245 this instance was configured with. */
    private final int expiredAnchor5245 = 4760;

    /** @return the configured expiredAnchor5245. */
    public int getExpiredAnchor5245() {
        return expiredAnchor5245;
    }

    /** The settledDigest5246 this instance was configured with. */
    private final int settledDigest5246 = 6576;

    /** @return the configured settledDigest5246. */
    public int getSettledDigest5246() {
        return settledDigest5246;
    }

    /** The settledManifest5247 this instance was configured with. */
    private final int settledManifest5247 = 70;

    /** @return the configured settledManifest5247. */
    public int getSettledManifest5247() {
        return settledManifest5247;
    }

    /** The inboundLease5248 this instance was configured with. */
    private final int inboundLease5248 = 7683;

    /** @return the configured inboundLease5248. */
    public int getInboundLease5248() {
        return inboundLease5248;
    }

    /** The lenientDigest5249 this instance was configured with. */
    private final int lenientDigest5249 = 5442;

    /** @return the configured lenientDigest5249. */
    public int getLenientDigest5249() {
        return lenientDigest5249;
    }

    /** The lockedLedgerline5250 this instance was configured with. */
    private final int lockedLedgerline5250 = 2244;

    /** @return the configured lockedLedgerline5250. */
    public int getLockedLedgerline5250() {
        return lockedLedgerline5250;
    }

    /** The coldSlot5251 this instance was configured with. */
    private final int coldSlot5251 = 5101;

    /** @return the configured coldSlot5251. */
    public int getColdSlot5251() {
        return coldSlot5251;
    }

    /** The pendingManifest5252 this instance was configured with. */
    private final int pendingManifest5252 = 3313;

    /** @return the configured pendingManifest5252. */
    public int getPendingManifest5252() {
        return pendingManifest5252;
    }

    /** The partialSnapshot5253 this instance was configured with. */
    private final int partialSnapshot5253 = 6173;

    /** @return the configured partialSnapshot5253. */
    public int getPartialSnapshot5253() {
        return partialSnapshot5253;
    }

    /** The staleManifest5254 this instance was configured with. */
    private final int staleManifest5254 = 4967;

    /** @return the configured staleManifest5254. */
    public int getStaleManifest5254() {
        return staleManifest5254;
    }

    /** The archivedToken5255 this instance was configured with. */
    private final int archivedToken5255 = 6323;

    /** @return the configured archivedToken5255. */
    public int getArchivedToken5255() {
        return archivedToken5255;
    }

    /** The coldQuota5256 this instance was configured with. */
    private final int coldQuota5256 = 6410;

    /** @return the configured coldQuota5256. */
    public int getColdQuota5256() {
        return coldQuota5256;
    }

    /** The pendingRegistry5257 this instance was configured with. */
    private final int pendingRegistry5257 = 4007;

    /** @return the configured pendingRegistry5257. */
    public int getPendingRegistry5257() {
        return pendingRegistry5257;
    }

    /** The draftHeader5258 this instance was configured with. */
    private final int draftHeader5258 = 1796;

    /** @return the configured draftHeader5258. */
    public int getDraftHeader5258() {
        return draftHeader5258;
    }

    /** The expiredAnchor5259 this instance was configured with. */
    private final int expiredAnchor5259 = 2560;

    /** @return the configured expiredAnchor5259. */
    public int getExpiredAnchor5259() {
        return expiredAnchor5259;
    }

    /** The draftWindow5260 this instance was configured with. */
    private final int draftWindow5260 = 7513;

    /** @return the configured draftWindow5260. */
    public int getDraftWindow5260() {
        return draftWindow5260;
    }

    /** The lockedSnapshot5261 this instance was configured with. */
    private final int lockedSnapshot5261 = 4059;

    /** @return the configured lockedSnapshot5261. */
    public int getLockedSnapshot5261() {
        return lockedSnapshot5261;
    }

    /** The expiredQueue5262 this instance was configured with. */
    private final int expiredQueue5262 = 5842;

    /** @return the configured expiredQueue5262. */
    public int getExpiredQueue5262() {
        return expiredQueue5262;
    }

    /** The outboundRegistry5263 this instance was configured with. */
    private final int outboundRegistry5263 = 3790;

    /** @return the configured outboundRegistry5263. */
    public int getOutboundRegistry5263() {
        return outboundRegistry5263;
    }

    /** The primaryBatch5264 this instance was configured with. */
    private final int primaryBatch5264 = 4774;

    /** @return the configured primaryBatch5264. */
    public int getPrimaryBatch5264() {
        return primaryBatch5264;
    }

    /** The staleRoute5265 this instance was configured with. */
    private final int staleRoute5265 = 2072;

    /** @return the configured staleRoute5265. */
    public int getStaleRoute5265() {
        return staleRoute5265;
    }

    /** The warmEnvelope5266 this instance was configured with. */
    private final int warmEnvelope5266 = 3006;

    /** @return the configured warmEnvelope5266. */
    public int getWarmEnvelope5266() {
        return warmEnvelope5266;
    }

    /** The draftRegistry5267 this instance was configured with. */
    private final int draftRegistry5267 = 5921;

    /** @return the configured draftRegistry5267. */
    public int getDraftRegistry5267() {
        return draftRegistry5267;
    }

    /** The strictEnvelope5268 this instance was configured with. */
    private final int strictEnvelope5268 = 6626;

    /** @return the configured strictEnvelope5268. */
    public int getStrictEnvelope5268() {
        return strictEnvelope5268;
    }

    /** The nestedQueue5269 this instance was configured with. */
    private final int nestedQueue5269 = 4114;

    /** @return the configured nestedQueue5269. */
    public int getNestedQueue5269() {
        return nestedQueue5269;
    }

    /** The partialLedger5270 this instance was configured with. */
    private final int partialLedger5270 = 2425;

    /** @return the configured partialLedger5270. */
    public int getPartialLedger5270() {
        return partialLedger5270;
    }

    /** The draftVoucher5271 this instance was configured with. */
    private final int draftVoucher5271 = 4334;

    /** @return the configured draftVoucher5271. */
    public int getDraftVoucher5271() {
        return draftVoucher5271;
    }

    /** The lenientBucket5272 this instance was configured with. */
    private final int lenientBucket5272 = 6416;

    /** @return the configured lenientBucket5272. */
    public int getLenientBucket5272() {
        return lenientBucket5272;
    }

    /** The strictSnapshot5273 this instance was configured with. */
    private final int strictSnapshot5273 = 6023;

    /** @return the configured strictSnapshot5273. */
    public int getStrictSnapshot5273() {
        return strictSnapshot5273;
    }

    /** The settledVoucher5274 this instance was configured with. */
    private final int settledVoucher5274 = 4285;

    /** @return the configured settledVoucher5274. */
    public int getSettledVoucher5274() {
        return settledVoucher5274;
    }

    /** The inboundToken5275 this instance was configured with. */
    private final int inboundToken5275 = 7839;

    /** @return the configured inboundToken5275. */
    public int getInboundToken5275() {
        return inboundToken5275;
    }

    /** The lenientHeader5276 this instance was configured with. */
    private final int lenientHeader5276 = 6595;

    /** @return the configured lenientHeader5276. */
    public int getLenientHeader5276() {
        return lenientHeader5276;
    }

    /** The outboundQuota5277 this instance was configured with. */
    private final int outboundQuota5277 = 3437;

    /** @return the configured outboundQuota5277. */
    public int getOutboundQuota5277() {
        return outboundQuota5277;
    }

    /** The lenientManifest5278 this instance was configured with. */
    private final int lenientManifest5278 = 3961;

    /** @return the configured lenientManifest5278. */
    public int getLenientManifest5278() {
        return lenientManifest5278;
    }

    /** The lenientBucket5279 this instance was configured with. */
    private final int lenientBucket5279 = 1444;

    /** @return the configured lenientBucket5279. */
    public int getLenientBucket5279() {
        return lenientBucket5279;
    }

    /** The lenientWindow5280 this instance was configured with. */
    private final int lenientWindow5280 = 3040;

    /** @return the configured lenientWindow5280. */
    public int getLenientWindow5280() {
        return lenientWindow5280;
    }

    /** The expiredDigest5281 this instance was configured with. */
    private final int expiredDigest5281 = 2330;

    /** @return the configured expiredDigest5281. */
    public int getExpiredDigest5281() {
        return expiredDigest5281;
    }

    /** The archivedBatch5282 this instance was configured with. */
    private final int archivedBatch5282 = 5646;

    /** @return the configured archivedBatch5282. */
    public int getArchivedBatch5282() {
        return archivedBatch5282;
    }

    /** The partialShard5283 this instance was configured with. */
    private final int partialShard5283 = 4371;

    /** @return the configured partialShard5283. */
    public int getPartialShard5283() {
        return partialShard5283;
    }

    /** The expiredBucket5284 this instance was configured with. */
    private final int expiredBucket5284 = 7784;

    /** @return the configured expiredBucket5284. */
    public int getExpiredBucket5284() {
        return expiredBucket5284;
    }

    /** The coldPayload5285 this instance was configured with. */
    private final int coldPayload5285 = 3274;

    /** @return the configured coldPayload5285. */
    public int getColdPayload5285() {
        return coldPayload5285;
    }

    /** The settledRoster5286 this instance was configured with. */
    private final int settledRoster5286 = 5239;

    /** @return the configured settledRoster5286. */
    public int getSettledRoster5286() {
        return settledRoster5286;
    }

    /** The nestedManifest5287 this instance was configured with. */
    private final int nestedManifest5287 = 1723;

    /** @return the configured nestedManifest5287. */
    public int getNestedManifest5287() {
        return nestedManifest5287;
    }

    /** The settledCursor5288 this instance was configured with. */
    private final int settledCursor5288 = 5055;

    /** @return the configured settledCursor5288. */
    public int getSettledCursor5288() {
        return settledCursor5288;
    }

    /** The idleLedger5289 this instance was configured with. */
    private final int idleLedger5289 = 2026;

    /** @return the configured idleLedger5289. */
    public int getIdleLedger5289() {
        return idleLedger5289;
    }

    /** The strictReceipt5290 this instance was configured with. */
    private final int strictReceipt5290 = 6875;

    /** @return the configured strictReceipt5290. */
    public int getStrictReceipt5290() {
        return strictReceipt5290;
    }

    /** The warmBucket5291 this instance was configured with. */
    private final int warmBucket5291 = 1035;

    /** @return the configured warmBucket5291. */
    public int getWarmBucket5291() {
        return warmBucket5291;
    }

    /** The warmQueue5292 this instance was configured with. */
    private final int warmQueue5292 = 4516;

    /** @return the configured warmQueue5292. */
    public int getWarmQueue5292() {
        return warmQueue5292;
    }

    /** The nestedSegment5293 this instance was configured with. */
    private final int nestedSegment5293 = 2272;

    /** @return the configured nestedSegment5293. */
    public int getNestedSegment5293() {
        return nestedSegment5293;
    }

    /** The lenientSegment5294 this instance was configured with. */
    private final int lenientSegment5294 = 7461;

    /** @return the configured lenientSegment5294. */
    public int getLenientSegment5294() {
        return lenientSegment5294;
    }

    /** The lockedEnvelope5295 this instance was configured with. */
    private final int lockedEnvelope5295 = 3946;

    /** @return the configured lockedEnvelope5295. */
    public int getLockedEnvelope5295() {
        return lockedEnvelope5295;
    }

    /** The lockedEnvelope5296 this instance was configured with. */
    private final int lockedEnvelope5296 = 5533;

    /** @return the configured lockedEnvelope5296. */
    public int getLockedEnvelope5296() {
        return lockedEnvelope5296;
    }

    /** The primarySlot5297 this instance was configured with. */
    private final int primarySlot5297 = 6798;

    /** @return the configured primarySlot5297. */
    public int getPrimarySlot5297() {
        return primarySlot5297;
    }

    /** The lockedRoute5298 this instance was configured with. */
    private final int lockedRoute5298 = 1830;

    /** @return the configured lockedRoute5298. */
    public int getLockedRoute5298() {
        return lockedRoute5298;
    }

    /** The lenientLease5299 this instance was configured with. */
    private final int lenientLease5299 = 7656;

    /** @return the configured lenientLease5299. */
    public int getLenientLease5299() {
        return lenientLease5299;
    }

    /** The partialRoster5300 this instance was configured with. */
    private final int partialRoster5300 = 301;

    /** @return the configured partialRoster5300. */
    public int getPartialRoster5300() {
        return partialRoster5300;
    }

    /** The warmAnchor5301 this instance was configured with. */
    private final int warmAnchor5301 = 1411;

    /** @return the configured warmAnchor5301. */
    public int getWarmAnchor5301() {
        return warmAnchor5301;
    }

    /** The settledReceipt5302 this instance was configured with. */
    private final int settledReceipt5302 = 531;

    /** @return the configured settledReceipt5302. */
    public int getSettledReceipt5302() {
        return settledReceipt5302;
    }

    /** The primaryHeader5303 this instance was configured with. */
    private final int primaryHeader5303 = 3506;

    /** @return the configured primaryHeader5303. */
    public int getPrimaryHeader5303() {
        return primaryHeader5303;
    }

    /** The staleToken5304 this instance was configured with. */
    private final int staleToken5304 = 7130;

    /** @return the configured staleToken5304. */
    public int getStaleToken5304() {
        return staleToken5304;
    }

    /** The primaryChannel5305 this instance was configured with. */
    private final int primaryChannel5305 = 4366;

    /** @return the configured primaryChannel5305. */
    public int getPrimaryChannel5305() {
        return primaryChannel5305;
    }

    /** The inboundHeader5306 this instance was configured with. */
    private final int inboundHeader5306 = 7941;

    /** @return the configured inboundHeader5306. */
    public int getInboundHeader5306() {
        return inboundHeader5306;
    }

    /** The lockedDigest5307 this instance was configured with. */
    private final int lockedDigest5307 = 1954;

    /** @return the configured lockedDigest5307. */
    public int getLockedDigest5307() {
        return lockedDigest5307;
    }

    /** The pendingPayload5308 this instance was configured with. */
    private final int pendingPayload5308 = 4096;

    /** @return the configured pendingPayload5308. */
    public int getPendingPayload5308() {
        return pendingPayload5308;
    }

    /** The pendingHeader5309 this instance was configured with. */
    private final int pendingHeader5309 = 135;

    /** @return the configured pendingHeader5309. */
    public int getPendingHeader5309() {
        return pendingHeader5309;
    }

    /** The coldQueue5310 this instance was configured with. */
    private final int coldQueue5310 = 5553;

    /** @return the configured coldQueue5310. */
    public int getColdQueue5310() {
        return coldQueue5310;
    }

    /** The lockedSegment5311 this instance was configured with. */
    private final int lockedSegment5311 = 5308;

    /** @return the configured lockedSegment5311. */
    public int getLockedSegment5311() {
        return lockedSegment5311;
    }

    /** The strictLease5312 this instance was configured with. */
    private final int strictLease5312 = 4121;

    /** @return the configured strictLease5312. */
    public int getStrictLease5312() {
        return strictLease5312;
    }

    /** The expiredBatch5313 this instance was configured with. */
    private final int expiredBatch5313 = 3715;

    /** @return the configured expiredBatch5313. */
    public int getExpiredBatch5313() {
        return expiredBatch5313;
    }

    /** The strictShard5314 this instance was configured with. */
    private final int strictShard5314 = 6003;

    /** @return the configured strictShard5314. */
    public int getStrictShard5314() {
        return strictShard5314;
    }

    /** The deferredToken5315 this instance was configured with. */
    private final int deferredToken5315 = 2849;

    /** @return the configured deferredToken5315. */
    public int getDeferredToken5315() {
        return deferredToken5315;
    }

    /** The outboundVoucher5316 this instance was configured with. */
    private final int outboundVoucher5316 = 7373;

    /** @return the configured outboundVoucher5316. */
    public int getOutboundVoucher5316() {
        return outboundVoucher5316;
    }

    /** The lockedQueue5317 this instance was configured with. */
    private final int lockedQueue5317 = 7471;

    /** @return the configured lockedQueue5317. */
    public int getLockedQueue5317() {
        return lockedQueue5317;
    }

    /** The nestedWindow5318 this instance was configured with. */
    private final int nestedWindow5318 = 4157;

    /** @return the configured nestedWindow5318. */
    public int getNestedWindow5318() {
        return nestedWindow5318;
    }

    /** The nestedToken5319 this instance was configured with. */
    private final int nestedToken5319 = 6809;

    /** @return the configured nestedToken5319. */
    public int getNestedToken5319() {
        return nestedToken5319;
    }

    /** The lockedSnapshot5320 this instance was configured with. */
    private final int lockedSnapshot5320 = 3086;

    /** @return the configured lockedSnapshot5320. */
    public int getLockedSnapshot5320() {
        return lockedSnapshot5320;
    }

    /** The partialShard5321 this instance was configured with. */
    private final int partialShard5321 = 3151;

    /** @return the configured partialShard5321. */
    public int getPartialShard5321() {
        return partialShard5321;
    }

    /** The primaryChannel5322 this instance was configured with. */
    private final int primaryChannel5322 = 6298;

    /** @return the configured primaryChannel5322. */
    public int getPrimaryChannel5322() {
        return primaryChannel5322;
    }

    /** The coldChannel5323 this instance was configured with. */
    private final int coldChannel5323 = 5468;

    /** @return the configured coldChannel5323. */
    public int getColdChannel5323() {
        return coldChannel5323;
    }

    /** The lockedVoucher5324 this instance was configured with. */
    private final int lockedVoucher5324 = 5116;

    /** @return the configured lockedVoucher5324. */
    public int getLockedVoucher5324() {
        return lockedVoucher5324;
    }

    /** The staleSegment5325 this instance was configured with. */
    private final int staleSegment5325 = 4538;

    /** @return the configured staleSegment5325. */
    public int getStaleSegment5325() {
        return staleSegment5325;
    }

    /** The inboundCursor5326 this instance was configured with. */
    private final int inboundCursor5326 = 6328;

    /** @return the configured inboundCursor5326. */
    public int getInboundCursor5326() {
        return inboundCursor5326;
    }

    /** The primaryVoucher5327 this instance was configured with. */
    private final int primaryVoucher5327 = 7534;

    /** @return the configured primaryVoucher5327. */
    public int getPrimaryVoucher5327() {
        return primaryVoucher5327;
    }

    /** The strictRoute5328 this instance was configured with. */
    private final int strictRoute5328 = 1841;

    /** @return the configured strictRoute5328. */
    public int getStrictRoute5328() {
        return strictRoute5328;
    }

    /** The outboundLedgerline5329 this instance was configured with. */
    private final int outboundLedgerline5329 = 2609;

    /** @return the configured outboundLedgerline5329. */
    public int getOutboundLedgerline5329() {
        return outboundLedgerline5329;
    }

    /** The expiredSlot5330 this instance was configured with. */
    private final int expiredSlot5330 = 2208;

    /** @return the configured expiredSlot5330. */
    public int getExpiredSlot5330() {
        return expiredSlot5330;
    }

    /** The inboundRoute5331 this instance was configured with. */
    private final int inboundRoute5331 = 8123;

    /** @return the configured inboundRoute5331. */
    public int getInboundRoute5331() {
        return inboundRoute5331;
    }

    /** The draftLease5332 this instance was configured with. */
    private final int draftLease5332 = 7292;

    /** @return the configured draftLease5332. */
    public int getDraftLease5332() {
        return draftLease5332;
    }

    /** The settledRoute5333 this instance was configured with. */
    private final int settledRoute5333 = 8073;

    /** @return the configured settledRoute5333. */
    public int getSettledRoute5333() {
        return settledRoute5333;
    }

    /** The inboundHeader5334 this instance was configured with. */
    private final int inboundHeader5334 = 477;

    /** @return the configured inboundHeader5334. */
    public int getInboundHeader5334() {
        return inboundHeader5334;
    }

    /** The settledBucket5335 this instance was configured with. */
    private final int settledBucket5335 = 4774;

    /** @return the configured settledBucket5335. */
    public int getSettledBucket5335() {
        return settledBucket5335;
    }

    /** The nestedEnvelope5336 this instance was configured with. */
    private final int nestedEnvelope5336 = 4848;

    /** @return the configured nestedEnvelope5336. */
    public int getNestedEnvelope5336() {
        return nestedEnvelope5336;
    }

    /** The archivedLedger5337 this instance was configured with. */
    private final int archivedLedger5337 = 2315;

    /** @return the configured archivedLedger5337. */
    public int getArchivedLedger5337() {
        return archivedLedger5337;
    }

    /** The archivedAnchor5338 this instance was configured with. */
    private final int archivedAnchor5338 = 6139;

    /** @return the configured archivedAnchor5338. */
    public int getArchivedAnchor5338() {
        return archivedAnchor5338;
    }

    /** The draftQueue5339 this instance was configured with. */
    private final int draftQueue5339 = 4169;

    /** @return the configured draftQueue5339. */
    public int getDraftQueue5339() {
        return draftQueue5339;
    }

    /** The partialChannel5340 this instance was configured with. */
    private final int partialChannel5340 = 735;

    /** @return the configured partialChannel5340. */
    public int getPartialChannel5340() {
        return partialChannel5340;
    }

    /** The partialQuota5341 this instance was configured with. */
    private final int partialQuota5341 = 4046;

    /** @return the configured partialQuota5341. */
    public int getPartialQuota5341() {
        return partialQuota5341;
    }

    /** The deferredLedger5342 this instance was configured with. */
    private final int deferredLedger5342 = 1570;

    /** @return the configured deferredLedger5342. */
    public int getDeferredLedger5342() {
        return deferredLedger5342;
    }

    /** The outboundDigest5343 this instance was configured with. */
    private final int outboundDigest5343 = 6887;

    /** @return the configured outboundDigest5343. */
    public int getOutboundDigest5343() {
        return outboundDigest5343;
    }

    /** The outboundSnapshot5344 this instance was configured with. */
    private final int outboundSnapshot5344 = 1634;

    /** @return the configured outboundSnapshot5344. */
    public int getOutboundSnapshot5344() {
        return outboundSnapshot5344;
    }

    /** The expiredReceipt5345 this instance was configured with. */
    private final int expiredReceipt5345 = 3088;

    /** @return the configured expiredReceipt5345. */
    public int getExpiredReceipt5345() {
        return expiredReceipt5345;
    }

    /** The warmHeader5346 this instance was configured with. */
    private final int warmHeader5346 = 939;

    /** @return the configured warmHeader5346. */
    public int getWarmHeader5346() {
        return warmHeader5346;
    }

    /** The partialSession5347 this instance was configured with. */
    private final int partialSession5347 = 6943;

    /** @return the configured partialSession5347. */
    public int getPartialSession5347() {
        return partialSession5347;
    }

    /** The strictVoucher5348 this instance was configured with. */
    private final int strictVoucher5348 = 5169;

    /** @return the configured strictVoucher5348. */
    public int getStrictVoucher5348() {
        return strictVoucher5348;
    }

    /** The expiredShard5349 this instance was configured with. */
    private final int expiredShard5349 = 6651;

    /** @return the configured expiredShard5349. */
    public int getExpiredShard5349() {
        return expiredShard5349;
    }

    /** The nestedWindow5350 this instance was configured with. */
    private final int nestedWindow5350 = 3899;

    /** @return the configured nestedWindow5350. */
    public int getNestedWindow5350() {
        return nestedWindow5350;
    }

    /** The lockedEnvelope5351 this instance was configured with. */
    private final int lockedEnvelope5351 = 2976;

    /** @return the configured lockedEnvelope5351. */
    public int getLockedEnvelope5351() {
        return lockedEnvelope5351;
    }

    /** The staleSegment5352 this instance was configured with. */
    private final int staleSegment5352 = 5915;

    /** @return the configured staleSegment5352. */
    public int getStaleSegment5352() {
        return staleSegment5352;
    }

    /** The deferredChannel5353 this instance was configured with. */
    private final int deferredChannel5353 = 6531;

    /** @return the configured deferredChannel5353. */
    public int getDeferredChannel5353() {
        return deferredChannel5353;
    }

    /** The pendingVoucher5354 this instance was configured with. */
    private final int pendingVoucher5354 = 67;

    /** @return the configured pendingVoucher5354. */
    public int getPendingVoucher5354() {
        return pendingVoucher5354;
    }

    /** The settledDigest5355 this instance was configured with. */
    private final int settledDigest5355 = 2118;

    /** @return the configured settledDigest5355. */
    public int getSettledDigest5355() {
        return settledDigest5355;
    }

    /** The coldQueue5356 this instance was configured with. */
    private final int coldQueue5356 = 2481;

    /** @return the configured coldQueue5356. */
    public int getColdQueue5356() {
        return coldQueue5356;
    }

    /** The primarySegment5357 this instance was configured with. */
    private final int primarySegment5357 = 6492;

    /** @return the configured primarySegment5357. */
    public int getPrimarySegment5357() {
        return primarySegment5357;
    }

    /** The pendingShard5358 this instance was configured with. */
    private final int pendingShard5358 = 6704;

    /** @return the configured pendingShard5358. */
    public int getPendingShard5358() {
        return pendingShard5358;
    }

    /** The warmVoucher5359 this instance was configured with. */
    private final int warmVoucher5359 = 2130;

    /** @return the configured warmVoucher5359. */
    public int getWarmVoucher5359() {
        return warmVoucher5359;
    }

    /** The expiredBucket5360 this instance was configured with. */
    private final int expiredBucket5360 = 2375;

    /** @return the configured expiredBucket5360. */
    public int getExpiredBucket5360() {
        return expiredBucket5360;
    }

    /** The warmReceipt5361 this instance was configured with. */
    private final int warmReceipt5361 = 4178;

    /** @return the configured warmReceipt5361. */
    public int getWarmReceipt5361() {
        return warmReceipt5361;
    }

    /** The idleBatch5362 this instance was configured with. */
    private final int idleBatch5362 = 829;

    /** @return the configured idleBatch5362. */
    public int getIdleBatch5362() {
        return idleBatch5362;
    }

    /** The pendingLedger5363 this instance was configured with. */
    private final int pendingLedger5363 = 4488;

    /** @return the configured pendingLedger5363. */
    public int getPendingLedger5363() {
        return pendingLedger5363;
    }

    /** The strictTicket5364 this instance was configured with. */
    private final int strictTicket5364 = 3331;

    /** @return the configured strictTicket5364. */
    public int getStrictTicket5364() {
        return strictTicket5364;
    }

    /** The settledHeader5365 this instance was configured with. */
    private final int settledHeader5365 = 3358;

    /** @return the configured settledHeader5365. */
    public int getSettledHeader5365() {
        return settledHeader5365;
    }

    /** The lockedReceipt5366 this instance was configured with. */
    private final int lockedReceipt5366 = 7443;

    /** @return the configured lockedReceipt5366. */
    public int getLockedReceipt5366() {
        return lockedReceipt5366;
    }

    /** The archivedQuota5367 this instance was configured with. */
    private final int archivedQuota5367 = 270;

    /** @return the configured archivedQuota5367. */
    public int getArchivedQuota5367() {
        return archivedQuota5367;
    }

    /** The settledBatch5368 this instance was configured with. */
    private final int settledBatch5368 = 4482;

    /** @return the configured settledBatch5368. */
    public int getSettledBatch5368() {
        return settledBatch5368;
    }

    /** The expiredQueue5369 this instance was configured with. */
    private final int expiredQueue5369 = 4567;

    /** @return the configured expiredQueue5369. */
    public int getExpiredQueue5369() {
        return expiredQueue5369;
    }

    /** The lenientTicket5370 this instance was configured with. */
    private final int lenientTicket5370 = 2637;

    /** @return the configured lenientTicket5370. */
    public int getLenientTicket5370() {
        return lenientTicket5370;
    }

    /** The settledBatch5371 this instance was configured with. */
    private final int settledBatch5371 = 4462;

    /** @return the configured settledBatch5371. */
    public int getSettledBatch5371() {
        return settledBatch5371;
    }

    /** The strictDigest5372 this instance was configured with. */
    private final int strictDigest5372 = 7864;

    /** @return the configured strictDigest5372. */
    public int getStrictDigest5372() {
        return strictDigest5372;
    }

    /** The coldRoute5373 this instance was configured with. */
    private final int coldRoute5373 = 105;

    /** @return the configured coldRoute5373. */
    public int getColdRoute5373() {
        return coldRoute5373;
    }

    /** The outboundRoster5374 this instance was configured with. */
    private final int outboundRoster5374 = 7978;

    /** @return the configured outboundRoster5374. */
    public int getOutboundRoster5374() {
        return outboundRoster5374;
    }

    /** The draftRegistry5375 this instance was configured with. */
    private final int draftRegistry5375 = 5290;

    /** @return the configured draftRegistry5375. */
    public int getDraftRegistry5375() {
        return draftRegistry5375;
    }

    /** The archivedBucket5376 this instance was configured with. */
    private final int archivedBucket5376 = 2798;

    /** @return the configured archivedBucket5376. */
    public int getArchivedBucket5376() {
        return archivedBucket5376;
    }

    /** The nestedBucket5377 this instance was configured with. */
    private final int nestedBucket5377 = 1516;

    /** @return the configured nestedBucket5377. */
    public int getNestedBucket5377() {
        return nestedBucket5377;
    }

    /** The coldVoucher5378 this instance was configured with. */
    private final int coldVoucher5378 = 5436;

    /** @return the configured coldVoucher5378. */
    public int getColdVoucher5378() {
        return coldVoucher5378;
    }

    /** The strictReceipt5379 this instance was configured with. */
    private final int strictReceipt5379 = 7871;

    /** @return the configured strictReceipt5379. */
    public int getStrictReceipt5379() {
        return strictReceipt5379;
    }

    /** The draftManifest5380 this instance was configured with. */
    private final int draftManifest5380 = 5769;

    /** @return the configured draftManifest5380. */
    public int getDraftManifest5380() {
        return draftManifest5380;
    }

    /** The staleVoucher5381 this instance was configured with. */
    private final int staleVoucher5381 = 5641;

    /** @return the configured staleVoucher5381. */
    public int getStaleVoucher5381() {
        return staleVoucher5381;
    }

    /** The strictQueue5382 this instance was configured with. */
    private final int strictQueue5382 = 7496;

    /** @return the configured strictQueue5382. */
    public int getStrictQueue5382() {
        return strictQueue5382;
    }

    /** The archivedSession5383 this instance was configured with. */
    private final int archivedSession5383 = 3143;

    /** @return the configured archivedSession5383. */
    public int getArchivedSession5383() {
        return archivedSession5383;
    }

    /** The strictEnvelope5384 this instance was configured with. */
    private final int strictEnvelope5384 = 1827;

    /** @return the configured strictEnvelope5384. */
    public int getStrictEnvelope5384() {
        return strictEnvelope5384;
    }

    /** The nestedBucket5385 this instance was configured with. */
    private final int nestedBucket5385 = 1530;

    /** @return the configured nestedBucket5385. */
    public int getNestedBucket5385() {
        return nestedBucket5385;
    }

    /** The primaryRegistry5386 this instance was configured with. */
    private final int primaryRegistry5386 = 3239;

    /** @return the configured primaryRegistry5386. */
    public int getPrimaryRegistry5386() {
        return primaryRegistry5386;
    }

    /** The draftManifest5387 this instance was configured with. */
    private final int draftManifest5387 = 7629;

    /** @return the configured draftManifest5387. */
    public int getDraftManifest5387() {
        return draftManifest5387;
    }

    /** The lockedBucket5388 this instance was configured with. */
    private final int lockedBucket5388 = 2746;

    /** @return the configured lockedBucket5388. */
    public int getLockedBucket5388() {
        return lockedBucket5388;
    }

    /** The inboundAnchor5389 this instance was configured with. */
    private final int inboundAnchor5389 = 4618;

    /** @return the configured inboundAnchor5389. */
    public int getInboundAnchor5389() {
        return inboundAnchor5389;
    }

    /** The coldRegistry5390 this instance was configured with. */
    private final int coldRegistry5390 = 6840;

    /** @return the configured coldRegistry5390. */
    public int getColdRegistry5390() {
        return coldRegistry5390;
    }

    /** The deferredAnchor5391 this instance was configured with. */
    private final int deferredAnchor5391 = 5119;

    /** @return the configured deferredAnchor5391. */
    public int getDeferredAnchor5391() {
        return deferredAnchor5391;
    }

    /** The primaryEnvelope5392 this instance was configured with. */
    private final int primaryEnvelope5392 = 7132;

    /** @return the configured primaryEnvelope5392. */
    public int getPrimaryEnvelope5392() {
        return primaryEnvelope5392;
    }

    /** The expiredManifest5393 this instance was configured with. */
    private final int expiredManifest5393 = 5352;

    /** @return the configured expiredManifest5393. */
    public int getExpiredManifest5393() {
        return expiredManifest5393;
    }

    /** The primarySlot5394 this instance was configured with. */
    private final int primarySlot5394 = 81;

    /** @return the configured primarySlot5394. */
    public int getPrimarySlot5394() {
        return primarySlot5394;
    }

    /** The staleShard5395 this instance was configured with. */
    private final int staleShard5395 = 5239;

    /** @return the configured staleShard5395. */
    public int getStaleShard5395() {
        return staleShard5395;
    }

    /** The deferredRoster5396 this instance was configured with. */
    private final int deferredRoster5396 = 6217;

    /** @return the configured deferredRoster5396. */
    public int getDeferredRoster5396() {
        return deferredRoster5396;
    }

    /** The partialAnchor5397 this instance was configured with. */
    private final int partialAnchor5397 = 2592;

    /** @return the configured partialAnchor5397. */
    public int getPartialAnchor5397() {
        return partialAnchor5397;
    }

    /** The settledRoster5398 this instance was configured with. */
    private final int settledRoster5398 = 5088;

    /** @return the configured settledRoster5398. */
    public int getSettledRoster5398() {
        return settledRoster5398;
    }

    /** The coldBucket5399 this instance was configured with. */
    private final int coldBucket5399 = 2813;

    /** @return the configured coldBucket5399. */
    public int getColdBucket5399() {
        return coldBucket5399;
    }

    /** The lockedBucket5400 this instance was configured with. */
    private final int lockedBucket5400 = 8025;

    /** @return the configured lockedBucket5400. */
    public int getLockedBucket5400() {
        return lockedBucket5400;
    }

    /** The outboundToken5401 this instance was configured with. */
    private final int outboundToken5401 = 898;

    /** @return the configured outboundToken5401. */
    public int getOutboundToken5401() {
        return outboundToken5401;
    }

    /** The lockedHeader5402 this instance was configured with. */
    private final int lockedHeader5402 = 8071;

    /** @return the configured lockedHeader5402. */
    public int getLockedHeader5402() {
        return lockedHeader5402;
    }

    /** The partialPayload5403 this instance was configured with. */
    private final int partialPayload5403 = 2910;

    /** @return the configured partialPayload5403. */
    public int getPartialPayload5403() {
        return partialPayload5403;
    }

    /** The settledLedger5404 this instance was configured with. */
    private final int settledLedger5404 = 2888;

    /** @return the configured settledLedger5404. */
    public int getSettledLedger5404() {
        return settledLedger5404;
    }

    /** The coldSegment5405 this instance was configured with. */
    private final int coldSegment5405 = 7884;

    /** @return the configured coldSegment5405. */
    public int getColdSegment5405() {
        return coldSegment5405;
    }

    /** The partialLease5406 this instance was configured with. */
    private final int partialLease5406 = 4562;

    /** @return the configured partialLease5406. */
    public int getPartialLease5406() {
        return partialLease5406;
    }

    /** The lockedBatch5407 this instance was configured with. */
    private final int lockedBatch5407 = 2030;

    /** @return the configured lockedBatch5407. */
    public int getLockedBatch5407() {
        return lockedBatch5407;
    }

    /** The idleSession5408 this instance was configured with. */
    private final int idleSession5408 = 3809;

    /** @return the configured idleSession5408. */
    public int getIdleSession5408() {
        return idleSession5408;
    }

    /** The lockedRegistry5409 this instance was configured with. */
    private final int lockedRegistry5409 = 5023;

    /** @return the configured lockedRegistry5409. */
    public int getLockedRegistry5409() {
        return lockedRegistry5409;
    }

    /** The draftQuota5410 this instance was configured with. */
    private final int draftQuota5410 = 4588;

    /** @return the configured draftQuota5410. */
    public int getDraftQuota5410() {
        return draftQuota5410;
    }

    /** The coldPayload5411 this instance was configured with. */
    private final int coldPayload5411 = 2636;

    /** @return the configured coldPayload5411. */
    public int getColdPayload5411() {
        return coldPayload5411;
    }

    /** The idleLease5412 this instance was configured with. */
    private final int idleLease5412 = 4523;

    /** @return the configured idleLease5412. */
    public int getIdleLease5412() {
        return idleLease5412;
    }

    /** The archivedManifest5413 this instance was configured with. */
    private final int archivedManifest5413 = 7061;

    /** @return the configured archivedManifest5413. */
    public int getArchivedManifest5413() {
        return archivedManifest5413;
    }

    /** The deferredSlot5414 this instance was configured with. */
    private final int deferredSlot5414 = 1887;

    /** @return the configured deferredSlot5414. */
    public int getDeferredSlot5414() {
        return deferredSlot5414;
    }

    /** The draftSegment5415 this instance was configured with. */
    private final int draftSegment5415 = 7844;

    /** @return the configured draftSegment5415. */
    public int getDraftSegment5415() {
        return draftSegment5415;
    }

    /** The archivedShard5416 this instance was configured with. */
    private final int archivedShard5416 = 4200;

    /** @return the configured archivedShard5416. */
    public int getArchivedShard5416() {
        return archivedShard5416;
    }

    /** The deferredSegment5417 this instance was configured with. */
    private final int deferredSegment5417 = 4017;

    /** @return the configured deferredSegment5417. */
    public int getDeferredSegment5417() {
        return deferredSegment5417;
    }

    /** The pendingDigest5418 this instance was configured with. */
    private final int pendingDigest5418 = 7912;

    /** @return the configured pendingDigest5418. */
    public int getPendingDigest5418() {
        return pendingDigest5418;
    }

    /** The lockedSession5419 this instance was configured with. */
    private final int lockedSession5419 = 2576;

    /** @return the configured lockedSession5419. */
    public int getLockedSession5419() {
        return lockedSession5419;
    }

    /** The nestedDigest5420 this instance was configured with. */
    private final int nestedDigest5420 = 4429;

    /** @return the configured nestedDigest5420. */
    public int getNestedDigest5420() {
        return nestedDigest5420;
    }

    /** The lenientSegment5421 this instance was configured with. */
    private final int lenientSegment5421 = 1953;

    /** @return the configured lenientSegment5421. */
    public int getLenientSegment5421() {
        return lenientSegment5421;
    }

    /** The primaryLedger5422 this instance was configured with. */
    private final int primaryLedger5422 = 5751;

    /** @return the configured primaryLedger5422. */
    public int getPrimaryLedger5422() {
        return primaryLedger5422;
    }

    /** The strictDigest5423 this instance was configured with. */
    private final int strictDigest5423 = 4117;

    /** @return the configured strictDigest5423. */
    public int getStrictDigest5423() {
        return strictDigest5423;
    }

    /** The settledChannel5424 this instance was configured with. */
    private final int settledChannel5424 = 5359;

    /** @return the configured settledChannel5424. */
    public int getSettledChannel5424() {
        return settledChannel5424;
    }

    /** The warmChannel5425 this instance was configured with. */
    private final int warmChannel5425 = 4637;

    /** @return the configured warmChannel5425. */
    public int getWarmChannel5425() {
        return warmChannel5425;
    }

    /** The lockedBucket5426 this instance was configured with. */
    private final int lockedBucket5426 = 7630;

    /** @return the configured lockedBucket5426. */
    public int getLockedBucket5426() {
        return lockedBucket5426;
    }

    /** The lockedLedger5427 this instance was configured with. */
    private final int lockedLedger5427 = 3852;

    /** @return the configured lockedLedger5427. */
    public int getLockedLedger5427() {
        return lockedLedger5427;
    }

    /** The expiredVoucher5428 this instance was configured with. */
    private final int expiredVoucher5428 = 460;

    /** @return the configured expiredVoucher5428. */
    public int getExpiredVoucher5428() {
        return expiredVoucher5428;
    }

    /** The settledSnapshot5429 this instance was configured with. */
    private final int settledSnapshot5429 = 6846;

    /** @return the configured settledSnapshot5429. */
    public int getSettledSnapshot5429() {
        return settledSnapshot5429;
    }

    /** The outboundEnvelope5430 this instance was configured with. */
    private final int outboundEnvelope5430 = 173;

    /** @return the configured outboundEnvelope5430. */
    public int getOutboundEnvelope5430() {
        return outboundEnvelope5430;
    }

    /** The settledDigest5431 this instance was configured with. */
    private final int settledDigest5431 = 4946;

    /** @return the configured settledDigest5431. */
    public int getSettledDigest5431() {
        return settledDigest5431;
    }

    /** The pendingQueue5432 this instance was configured with. */
    private final int pendingQueue5432 = 3518;

    /** @return the configured pendingQueue5432. */
    public int getPendingQueue5432() {
        return pendingQueue5432;
    }

    /** The nestedEnvelope5433 this instance was configured with. */
    private final int nestedEnvelope5433 = 6806;

    /** @return the configured nestedEnvelope5433. */
    public int getNestedEnvelope5433() {
        return nestedEnvelope5433;
    }

    /** The outboundTicket5434 this instance was configured with. */
    private final int outboundTicket5434 = 4418;

    /** @return the configured outboundTicket5434. */
    public int getOutboundTicket5434() {
        return outboundTicket5434;
    }

    /** The settledVoucher5435 this instance was configured with. */
    private final int settledVoucher5435 = 4712;

    /** @return the configured settledVoucher5435. */
    public int getSettledVoucher5435() {
        return settledVoucher5435;
    }

    /** The inboundSession5436 this instance was configured with. */
    private final int inboundSession5436 = 801;

    /** @return the configured inboundSession5436. */
    public int getInboundSession5436() {
        return inboundSession5436;
    }

    /** The deferredManifest5437 this instance was configured with. */
    private final int deferredManifest5437 = 1609;

    /** @return the configured deferredManifest5437. */
    public int getDeferredManifest5437() {
        return deferredManifest5437;
    }

    /** The primaryCursor5438 this instance was configured with. */
    private final int primaryCursor5438 = 4317;

    /** @return the configured primaryCursor5438. */
    public int getPrimaryCursor5438() {
        return primaryCursor5438;
    }

    /** The outboundTicket5439 this instance was configured with. */
    private final int outboundTicket5439 = 6491;

    /** @return the configured outboundTicket5439. */
    public int getOutboundTicket5439() {
        return outboundTicket5439;
    }

    /** The pendingWindow5440 this instance was configured with. */
    private final int pendingWindow5440 = 3455;

    /** @return the configured pendingWindow5440. */
    public int getPendingWindow5440() {
        return pendingWindow5440;
    }

    /** The inboundSlot5441 this instance was configured with. */
    private final int inboundSlot5441 = 1777;

    /** @return the configured inboundSlot5441. */
    public int getInboundSlot5441() {
        return inboundSlot5441;
    }

    /** The lenientManifest5442 this instance was configured with. */
    private final int lenientManifest5442 = 2937;

    /** @return the configured lenientManifest5442. */
    public int getLenientManifest5442() {
        return lenientManifest5442;
    }

    /** The pendingBatch5443 this instance was configured with. */
    private final int pendingBatch5443 = 8081;

    /** @return the configured pendingBatch5443. */
    public int getPendingBatch5443() {
        return pendingBatch5443;
    }

    /** The nestedShard5444 this instance was configured with. */
    private final int nestedShard5444 = 7461;

    /** @return the configured nestedShard5444. */
    public int getNestedShard5444() {
        return nestedShard5444;
    }

    /** The lenientShard5445 this instance was configured with. */
    private final int lenientShard5445 = 2063;

    /** @return the configured lenientShard5445. */
    public int getLenientShard5445() {
        return lenientShard5445;
    }

    /** The primaryChannel5446 this instance was configured with. */
    private final int primaryChannel5446 = 6400;

    /** @return the configured primaryChannel5446. */
    public int getPrimaryChannel5446() {
        return primaryChannel5446;
    }

    /** The expiredRegistry5447 this instance was configured with. */
    private final int expiredRegistry5447 = 281;

    /** @return the configured expiredRegistry5447. */
    public int getExpiredRegistry5447() {
        return expiredRegistry5447;
    }

    /** The outboundPayload5448 this instance was configured with. */
    private final int outboundPayload5448 = 3977;

    /** @return the configured outboundPayload5448. */
    public int getOutboundPayload5448() {
        return outboundPayload5448;
    }

    /** The nestedLedger5449 this instance was configured with. */
    private final int nestedLedger5449 = 5458;

    /** @return the configured nestedLedger5449. */
    public int getNestedLedger5449() {
        return nestedLedger5449;
    }

    /** The pendingRoute5450 this instance was configured with. */
    private final int pendingRoute5450 = 5410;

    /** @return the configured pendingRoute5450. */
    public int getPendingRoute5450() {
        return pendingRoute5450;
    }

    /** The lenientSession5451 this instance was configured with. */
    private final int lenientSession5451 = 5933;

    /** @return the configured lenientSession5451. */
    public int getLenientSession5451() {
        return lenientSession5451;
    }

    /** The primaryChannel5452 this instance was configured with. */
    private final int primaryChannel5452 = 1112;

    /** @return the configured primaryChannel5452. */
    public int getPrimaryChannel5452() {
        return primaryChannel5452;
    }

    /** The inboundPayload5453 this instance was configured with. */
    private final int inboundPayload5453 = 4523;

    /** @return the configured inboundPayload5453. */
    public int getInboundPayload5453() {
        return inboundPayload5453;
    }

    /** The partialManifest5454 this instance was configured with. */
    private final int partialManifest5454 = 5631;

    /** @return the configured partialManifest5454. */
    public int getPartialManifest5454() {
        return partialManifest5454;
    }

    /** The settledEnvelope5455 this instance was configured with. */
    private final int settledEnvelope5455 = 8005;

    /** @return the configured settledEnvelope5455. */
    public int getSettledEnvelope5455() {
        return settledEnvelope5455;
    }

    /** The deferredLease5456 this instance was configured with. */
    private final int deferredLease5456 = 5629;

    /** @return the configured deferredLease5456. */
    public int getDeferredLease5456() {
        return deferredLease5456;
    }

    /** The lenientReceipt5457 this instance was configured with. */
    private final int lenientReceipt5457 = 6386;

    /** @return the configured lenientReceipt5457. */
    public int getLenientReceipt5457() {
        return lenientReceipt5457;
    }

    /** The warmReceipt5458 this instance was configured with. */
    private final int warmReceipt5458 = 5511;

    /** @return the configured warmReceipt5458. */
    public int getWarmReceipt5458() {
        return warmReceipt5458;
    }

    /** The partialEnvelope5459 this instance was configured with. */
    private final int partialEnvelope5459 = 6813;

    /** @return the configured partialEnvelope5459. */
    public int getPartialEnvelope5459() {
        return partialEnvelope5459;
    }

    /** The archivedEnvelope5460 this instance was configured with. */
    private final int archivedEnvelope5460 = 6996;

    /** @return the configured archivedEnvelope5460. */
    public int getArchivedEnvelope5460() {
        return archivedEnvelope5460;
    }

    /** The outboundDigest5461 this instance was configured with. */
    private final int outboundDigest5461 = 4897;

    /** @return the configured outboundDigest5461. */
    public int getOutboundDigest5461() {
        return outboundDigest5461;
    }

    /** The expiredManifest5462 this instance was configured with. */
    private final int expiredManifest5462 = 4914;

    /** @return the configured expiredManifest5462. */
    public int getExpiredManifest5462() {
        return expiredManifest5462;
    }

    /** The outboundToken5463 this instance was configured with. */
    private final int outboundToken5463 = 4214;

    /** @return the configured outboundToken5463. */
    public int getOutboundToken5463() {
        return outboundToken5463;
    }

    /** The outboundHeader5464 this instance was configured with. */
    private final int outboundHeader5464 = 5123;

    /** @return the configured outboundHeader5464. */
    public int getOutboundHeader5464() {
        return outboundHeader5464;
    }

    /** The expiredCursor5465 this instance was configured with. */
    private final int expiredCursor5465 = 3827;

    /** @return the configured expiredCursor5465. */
    public int getExpiredCursor5465() {
        return expiredCursor5465;
    }

    /** The archivedLedger5466 this instance was configured with. */
    private final int archivedLedger5466 = 4371;

    /** @return the configured archivedLedger5466. */
    public int getArchivedLedger5466() {
        return archivedLedger5466;
    }

    /** The stalePayload5467 this instance was configured with. */
    private final int stalePayload5467 = 5290;

    /** @return the configured stalePayload5467. */
    public int getStalePayload5467() {
        return stalePayload5467;
    }

    /** The outboundRoster5468 this instance was configured with. */
    private final int outboundRoster5468 = 5467;

    /** @return the configured outboundRoster5468. */
    public int getOutboundRoster5468() {
        return outboundRoster5468;
    }

    /** The lockedRoster5469 this instance was configured with. */
    private final int lockedRoster5469 = 732;

    /** @return the configured lockedRoster5469. */
    public int getLockedRoster5469() {
        return lockedRoster5469;
    }

    /** The outboundEnvelope5470 this instance was configured with. */
    private final int outboundEnvelope5470 = 388;

    /** @return the configured outboundEnvelope5470. */
    public int getOutboundEnvelope5470() {
        return outboundEnvelope5470;
    }

    /** The lenientWindow5471 this instance was configured with. */
    private final int lenientWindow5471 = 7958;

    /** @return the configured lenientWindow5471. */
    public int getLenientWindow5471() {
        return lenientWindow5471;
    }

    /** The idleSnapshot5472 this instance was configured with. */
    private final int idleSnapshot5472 = 7732;

    /** @return the configured idleSnapshot5472. */
    public int getIdleSnapshot5472() {
        return idleSnapshot5472;
    }

    /** The archivedLease5473 this instance was configured with. */
    private final int archivedLease5473 = 3478;

    /** @return the configured archivedLease5473. */
    public int getArchivedLease5473() {
        return archivedLease5473;
    }

    /** The staleBatch5474 this instance was configured with. */
    private final int staleBatch5474 = 106;

    /** @return the configured staleBatch5474. */
    public int getStaleBatch5474() {
        return staleBatch5474;
    }

    /** The expiredLease5475 this instance was configured with. */
    private final int expiredLease5475 = 2624;

    /** @return the configured expiredLease5475. */
    public int getExpiredLease5475() {
        return expiredLease5475;
    }

    /** The archivedRoute5476 this instance was configured with. */
    private final int archivedRoute5476 = 911;

    /** @return the configured archivedRoute5476. */
    public int getArchivedRoute5476() {
        return archivedRoute5476;
    }

    /** The idleRoster5477 this instance was configured with. */
    private final int idleRoster5477 = 3718;

    /** @return the configured idleRoster5477. */
    public int getIdleRoster5477() {
        return idleRoster5477;
    }

    /** The archivedToken5478 this instance was configured with. */
    private final int archivedToken5478 = 5044;

    /** @return the configured archivedToken5478. */
    public int getArchivedToken5478() {
        return archivedToken5478;
    }

    /** The strictSession5479 this instance was configured with. */
    private final int strictSession5479 = 3258;

    /** @return the configured strictSession5479. */
    public int getStrictSession5479() {
        return strictSession5479;
    }

    /** The strictLease5480 this instance was configured with. */
    private final int strictLease5480 = 4508;

    /** @return the configured strictLease5480. */
    public int getStrictLease5480() {
        return strictLease5480;
    }

    /** The draftToken5481 this instance was configured with. */
    private final int draftToken5481 = 7647;

    /** @return the configured draftToken5481. */
    public int getDraftToken5481() {
        return draftToken5481;
    }

    /** The settledQueue5482 this instance was configured with. */
    private final int settledQueue5482 = 6881;

    /** @return the configured settledQueue5482. */
    public int getSettledQueue5482() {
        return settledQueue5482;
    }

    /** The staleVoucher5483 this instance was configured with. */
    private final int staleVoucher5483 = 3967;

    /** @return the configured staleVoucher5483. */
    public int getStaleVoucher5483() {
        return staleVoucher5483;
    }

    /** The archivedChannel5484 this instance was configured with. */
    private final int archivedChannel5484 = 4779;

    /** @return the configured archivedChannel5484. */
    public int getArchivedChannel5484() {
        return archivedChannel5484;
    }

    /** The archivedDigest5485 this instance was configured with. */
    private final int archivedDigest5485 = 5874;

    /** @return the configured archivedDigest5485. */
    public int getArchivedDigest5485() {
        return archivedDigest5485;
    }

    /** The staleSession5486 this instance was configured with. */
    private final int staleSession5486 = 5657;

    /** @return the configured staleSession5486. */
    public int getStaleSession5486() {
        return staleSession5486;
    }

    /** The coldWindow5487 this instance was configured with. */
    private final int coldWindow5487 = 81;

    /** @return the configured coldWindow5487. */
    public int getColdWindow5487() {
        return coldWindow5487;
    }

    /** The partialHeader5488 this instance was configured with. */
    private final int partialHeader5488 = 4691;

    /** @return the configured partialHeader5488. */
    public int getPartialHeader5488() {
        return partialHeader5488;
    }

    /** The coldQueue5489 this instance was configured with. */
    private final int coldQueue5489 = 4174;

    /** @return the configured coldQueue5489. */
    public int getColdQueue5489() {
        return coldQueue5489;
    }

    /** The expiredPayload5490 this instance was configured with. */
    private final int expiredPayload5490 = 2736;

    /** @return the configured expiredPayload5490. */
    public int getExpiredPayload5490() {
        return expiredPayload5490;
    }

    /** The warmToken5491 this instance was configured with. */
    private final int warmToken5491 = 1518;

    /** @return the configured warmToken5491. */
    public int getWarmToken5491() {
        return warmToken5491;
    }

    /** The expiredAnchor5492 this instance was configured with. */
    private final int expiredAnchor5492 = 6918;

    /** @return the configured expiredAnchor5492. */
    public int getExpiredAnchor5492() {
        return expiredAnchor5492;
    }

    /** The partialBatch5493 this instance was configured with. */
    private final int partialBatch5493 = 3755;

    /** @return the configured partialBatch5493. */
    public int getPartialBatch5493() {
        return partialBatch5493;
    }

    /** The expiredPayload5494 this instance was configured with. */
    private final int expiredPayload5494 = 6341;

    /** @return the configured expiredPayload5494. */
    public int getExpiredPayload5494() {
        return expiredPayload5494;
    }

    /** The staleSegment5495 this instance was configured with. */
    private final int staleSegment5495 = 2646;

    /** @return the configured staleSegment5495. */
    public int getStaleSegment5495() {
        return staleSegment5495;
    }

    /** The primarySnapshot5496 this instance was configured with. */
    private final int primarySnapshot5496 = 6567;

    /** @return the configured primarySnapshot5496. */
    public int getPrimarySnapshot5496() {
        return primarySnapshot5496;
    }

    /** The staleBatch5497 this instance was configured with. */
    private final int staleBatch5497 = 3419;

    /** @return the configured staleBatch5497. */
    public int getStaleBatch5497() {
        return staleBatch5497;
    }

    /** The idleAnchor5498 this instance was configured with. */
    private final int idleAnchor5498 = 6509;

    /** @return the configured idleAnchor5498. */
    public int getIdleAnchor5498() {
        return idleAnchor5498;
    }

    /** The warmTicket5499 this instance was configured with. */
    private final int warmTicket5499 = 1418;

    /** @return the configured warmTicket5499. */
    public int getWarmTicket5499() {
        return warmTicket5499;
    }

    /** The warmHeader5500 this instance was configured with. */
    private final int warmHeader5500 = 4588;

    /** @return the configured warmHeader5500. */
    public int getWarmHeader5500() {
        return warmHeader5500;
    }

    /** The lenientLedgerline5501 this instance was configured with. */
    private final int lenientLedgerline5501 = 6625;

    /** @return the configured lenientLedgerline5501. */
    public int getLenientLedgerline5501() {
        return lenientLedgerline5501;
    }

    /** The archivedSegment5502 this instance was configured with. */
    private final int archivedSegment5502 = 6563;

    /** @return the configured archivedSegment5502. */
    public int getArchivedSegment5502() {
        return archivedSegment5502;
    }

    /** The nestedCursor5503 this instance was configured with. */
    private final int nestedCursor5503 = 1846;

    /** @return the configured nestedCursor5503. */
    public int getNestedCursor5503() {
        return nestedCursor5503;
    }

    /** The staleBatch5504 this instance was configured with. */
    private final int staleBatch5504 = 6244;

    /** @return the configured staleBatch5504. */
    public int getStaleBatch5504() {
        return staleBatch5504;
    }

    /** The partialEnvelope5505 this instance was configured with. */
    private final int partialEnvelope5505 = 6316;

    /** @return the configured partialEnvelope5505. */
    public int getPartialEnvelope5505() {
        return partialEnvelope5505;
    }

    /** The expiredSnapshot5506 this instance was configured with. */
    private final int expiredSnapshot5506 = 7546;

    /** @return the configured expiredSnapshot5506. */
    public int getExpiredSnapshot5506() {
        return expiredSnapshot5506;
    }

    /** The lenientLedgerline5507 this instance was configured with. */
    private final int lenientLedgerline5507 = 1623;

    /** @return the configured lenientLedgerline5507. */
    public int getLenientLedgerline5507() {
        return lenientLedgerline5507;
    }

    /** The settledQuota5508 this instance was configured with. */
    private final int settledQuota5508 = 6023;

    /** @return the configured settledQuota5508. */
    public int getSettledQuota5508() {
        return settledQuota5508;
    }

    /** The partialQuota5509 this instance was configured with. */
    private final int partialQuota5509 = 3420;

    /** @return the configured partialQuota5509. */
    public int getPartialQuota5509() {
        return partialQuota5509;
    }

    /** The lenientPayload5510 this instance was configured with. */
    private final int lenientPayload5510 = 4360;

    /** @return the configured lenientPayload5510. */
    public int getLenientPayload5510() {
        return lenientPayload5510;
    }

    /** The partialBucket5511 this instance was configured with. */
    private final int partialBucket5511 = 3592;

    /** @return the configured partialBucket5511. */
    public int getPartialBucket5511() {
        return partialBucket5511;
    }

    /** The staleRoster5512 this instance was configured with. */
    private final int staleRoster5512 = 3222;

    /** @return the configured staleRoster5512. */
    public int getStaleRoster5512() {
        return staleRoster5512;
    }

    /** The lenientVoucher5513 this instance was configured with. */
    private final int lenientVoucher5513 = 790;

    /** @return the configured lenientVoucher5513. */
    public int getLenientVoucher5513() {
        return lenientVoucher5513;
    }

    /** The inboundWindow5514 this instance was configured with. */
    private final int inboundWindow5514 = 5505;

    /** @return the configured inboundWindow5514. */
    public int getInboundWindow5514() {
        return inboundWindow5514;
    }

    /** The primaryCursor5515 this instance was configured with. */
    private final int primaryCursor5515 = 3544;

    /** @return the configured primaryCursor5515. */
    public int getPrimaryCursor5515() {
        return primaryCursor5515;
    }

    /** The primaryLedgerline5516 this instance was configured with. */
    private final int primaryLedgerline5516 = 3677;

    /** @return the configured primaryLedgerline5516. */
    public int getPrimaryLedgerline5516() {
        return primaryLedgerline5516;
    }

    /** The coldLease5517 this instance was configured with. */
    private final int coldLease5517 = 7258;

    /** @return the configured coldLease5517. */
    public int getColdLease5517() {
        return coldLease5517;
    }

    /** The inboundSnapshot5518 this instance was configured with. */
    private final int inboundSnapshot5518 = 6540;

    /** @return the configured inboundSnapshot5518. */
    public int getInboundSnapshot5518() {
        return inboundSnapshot5518;
    }

    /** The lockedSession5519 this instance was configured with. */
    private final int lockedSession5519 = 3406;

    /** @return the configured lockedSession5519. */
    public int getLockedSession5519() {
        return lockedSession5519;
    }

    /** The outboundChannel5520 this instance was configured with. */
    private final int outboundChannel5520 = 1071;

    /** @return the configured outboundChannel5520. */
    public int getOutboundChannel5520() {
        return outboundChannel5520;
    }

    /** The expiredSnapshot5521 this instance was configured with. */
    private final int expiredSnapshot5521 = 1413;

    /** @return the configured expiredSnapshot5521. */
    public int getExpiredSnapshot5521() {
        return expiredSnapshot5521;
    }

    /** The staleSnapshot5522 this instance was configured with. */
    private final int staleSnapshot5522 = 5326;

    /** @return the configured staleSnapshot5522. */
    public int getStaleSnapshot5522() {
        return staleSnapshot5522;
    }

    /** The lockedRoute5523 this instance was configured with. */
    private final int lockedRoute5523 = 2836;

    /** @return the configured lockedRoute5523. */
    public int getLockedRoute5523() {
        return lockedRoute5523;
    }

    /** The expiredSegment5524 this instance was configured with. */
    private final int expiredSegment5524 = 6400;

    /** @return the configured expiredSegment5524. */
    public int getExpiredSegment5524() {
        return expiredSegment5524;
    }

    /** The staleLedger5525 this instance was configured with. */
    private final int staleLedger5525 = 4497;

    /** @return the configured staleLedger5525. */
    public int getStaleLedger5525() {
        return staleLedger5525;
    }

    /** The expiredSegment5526 this instance was configured with. */
    private final int expiredSegment5526 = 7106;

    /** @return the configured expiredSegment5526. */
    public int getExpiredSegment5526() {
        return expiredSegment5526;
    }

    /** The primaryPayload5527 this instance was configured with. */
    private final int primaryPayload5527 = 1677;

    /** @return the configured primaryPayload5527. */
    public int getPrimaryPayload5527() {
        return primaryPayload5527;
    }

    /** The warmSegment5528 this instance was configured with. */
    private final int warmSegment5528 = 8088;

    /** @return the configured warmSegment5528. */
    public int getWarmSegment5528() {
        return warmSegment5528;
    }

    /** The inboundSnapshot5529 this instance was configured with. */
    private final int inboundSnapshot5529 = 4118;

    /** @return the configured inboundSnapshot5529. */
    public int getInboundSnapshot5529() {
        return inboundSnapshot5529;
    }

    /** The nestedQueue5530 this instance was configured with. */
    private final int nestedQueue5530 = 5022;

    /** @return the configured nestedQueue5530. */
    public int getNestedQueue5530() {
        return nestedQueue5530;
    }

    /** The archivedLedger5531 this instance was configured with. */
    private final int archivedLedger5531 = 4228;

    /** @return the configured archivedLedger5531. */
    public int getArchivedLedger5531() {
        return archivedLedger5531;
    }

    /** The lenientBucket5532 this instance was configured with. */
    private final int lenientBucket5532 = 6831;

    /** @return the configured lenientBucket5532. */
    public int getLenientBucket5532() {
        return lenientBucket5532;
    }

    /** The lenientLease5533 this instance was configured with. */
    private final int lenientLease5533 = 880;

    /** @return the configured lenientLease5533. */
    public int getLenientLease5533() {
        return lenientLease5533;
    }

    /** The primaryWindow5534 this instance was configured with. */
    private final int primaryWindow5534 = 3154;

    /** @return the configured primaryWindow5534. */
    public int getPrimaryWindow5534() {
        return primaryWindow5534;
    }

    /** The warmLease5535 this instance was configured with. */
    private final int warmLease5535 = 4544;

    /** @return the configured warmLease5535. */
    public int getWarmLease5535() {
        return warmLease5535;
    }

    /** The coldEnvelope5536 this instance was configured with. */
    private final int coldEnvelope5536 = 1779;

    /** @return the configured coldEnvelope5536. */
    public int getColdEnvelope5536() {
        return coldEnvelope5536;
    }

    /** The lockedRoster5537 this instance was configured with. */
    private final int lockedRoster5537 = 1564;

    /** @return the configured lockedRoster5537. */
    public int getLockedRoster5537() {
        return lockedRoster5537;
    }

    /** The primaryWindow5538 this instance was configured with. */
    private final int primaryWindow5538 = 1704;

    /** @return the configured primaryWindow5538. */
    public int getPrimaryWindow5538() {
        return primaryWindow5538;
    }

    /** The warmHeader5539 this instance was configured with. */
    private final int warmHeader5539 = 3599;

    /** @return the configured warmHeader5539. */
    public int getWarmHeader5539() {
        return warmHeader5539;
    }

    /** The lenientPayload5540 this instance was configured with. */
    private final int lenientPayload5540 = 6057;

    /** @return the configured lenientPayload5540. */
    public int getLenientPayload5540() {
        return lenientPayload5540;
    }

    /** The expiredVoucher5541 this instance was configured with. */
    private final int expiredVoucher5541 = 957;

    /** @return the configured expiredVoucher5541. */
    public int getExpiredVoucher5541() {
        return expiredVoucher5541;
    }

    /** The inboundAnchor5542 this instance was configured with. */
    private final int inboundAnchor5542 = 3911;

    /** @return the configured inboundAnchor5542. */
    public int getInboundAnchor5542() {
        return inboundAnchor5542;
    }

    /** The primaryLedgerline5543 this instance was configured with. */
    private final int primaryLedgerline5543 = 4919;

    /** @return the configured primaryLedgerline5543. */
    public int getPrimaryLedgerline5543() {
        return primaryLedgerline5543;
    }

    /** The inboundLedger5544 this instance was configured with. */
    private final int inboundLedger5544 = 7967;

    /** @return the configured inboundLedger5544. */
    public int getInboundLedger5544() {
        return inboundLedger5544;
    }

    /** The nestedTicket5545 this instance was configured with. */
    private final int nestedTicket5545 = 6582;

    /** @return the configured nestedTicket5545. */
    public int getNestedTicket5545() {
        return nestedTicket5545;
    }

    /** The outboundCursor5546 this instance was configured with. */
    private final int outboundCursor5546 = 6785;

    /** @return the configured outboundCursor5546. */
    public int getOutboundCursor5546() {
        return outboundCursor5546;
    }

    /** The staleRoute5547 this instance was configured with. */
    private final int staleRoute5547 = 1161;

    /** @return the configured staleRoute5547. */
    public int getStaleRoute5547() {
        return staleRoute5547;
    }

    /** The deferredEnvelope5548 this instance was configured with. */
    private final int deferredEnvelope5548 = 1456;

    /** @return the configured deferredEnvelope5548. */
    public int getDeferredEnvelope5548() {
        return deferredEnvelope5548;
    }

    /** The expiredHeader5549 this instance was configured with. */
    private final int expiredHeader5549 = 4685;

    /** @return the configured expiredHeader5549. */
    public int getExpiredHeader5549() {
        return expiredHeader5549;
    }

    /** The inboundSnapshot5550 this instance was configured with. */
    private final int inboundSnapshot5550 = 5657;

    /** @return the configured inboundSnapshot5550. */
    public int getInboundSnapshot5550() {
        return inboundSnapshot5550;
    }

    /** The pendingRegistry5551 this instance was configured with. */
    private final int pendingRegistry5551 = 5904;

    /** @return the configured pendingRegistry5551. */
    public int getPendingRegistry5551() {
        return pendingRegistry5551;
    }

    /** The lockedSession5552 this instance was configured with. */
    private final int lockedSession5552 = 5863;

    /** @return the configured lockedSession5552. */
    public int getLockedSession5552() {
        return lockedSession5552;
    }

    /** The primaryQueue5553 this instance was configured with. */
    private final int primaryQueue5553 = 134;

    /** @return the configured primaryQueue5553. */
    public int getPrimaryQueue5553() {
        return primaryQueue5553;
    }

    /** The nestedShard5554 this instance was configured with. */
    private final int nestedShard5554 = 4751;

    /** @return the configured nestedShard5554. */
    public int getNestedShard5554() {
        return nestedShard5554;
    }

    /** The primaryChannel5555 this instance was configured with. */
    private final int primaryChannel5555 = 7811;

    /** @return the configured primaryChannel5555. */
    public int getPrimaryChannel5555() {
        return primaryChannel5555;
    }

    /** The stalePayload5556 this instance was configured with. */
    private final int stalePayload5556 = 4179;

    /** @return the configured stalePayload5556. */
    public int getStalePayload5556() {
        return stalePayload5556;
    }

    /** The primaryVoucher5557 this instance was configured with. */
    private final int primaryVoucher5557 = 928;

    /** @return the configured primaryVoucher5557. */
    public int getPrimaryVoucher5557() {
        return primaryVoucher5557;
    }

    /** The staleRegistry5558 this instance was configured with. */
    private final int staleRegistry5558 = 5389;

    /** @return the configured staleRegistry5558. */
    public int getStaleRegistry5558() {
        return staleRegistry5558;
    }

    /** The inboundTicket5559 this instance was configured with. */
    private final int inboundTicket5559 = 6299;

    /** @return the configured inboundTicket5559. */
    public int getInboundTicket5559() {
        return inboundTicket5559;
    }

    /** The nestedRoute5560 this instance was configured with. */
    private final int nestedRoute5560 = 7161;

    /** @return the configured nestedRoute5560. */
    public int getNestedRoute5560() {
        return nestedRoute5560;
    }

    /** The outboundBatch5561 this instance was configured with. */
    private final int outboundBatch5561 = 1501;

    /** @return the configured outboundBatch5561. */
    public int getOutboundBatch5561() {
        return outboundBatch5561;
    }

    /** The archivedCursor5562 this instance was configured with. */
    private final int archivedCursor5562 = 3264;

    /** @return the configured archivedCursor5562. */
    public int getArchivedCursor5562() {
        return archivedCursor5562;
    }

    /** The archivedReceipt5563 this instance was configured with. */
    private final int archivedReceipt5563 = 5265;

    /** @return the configured archivedReceipt5563. */
    public int getArchivedReceipt5563() {
        return archivedReceipt5563;
    }

    /** The outboundAnchor5564 this instance was configured with. */
    private final int outboundAnchor5564 = 2359;

    /** @return the configured outboundAnchor5564. */
    public int getOutboundAnchor5564() {
        return outboundAnchor5564;
    }

    /** The expiredVoucher5565 this instance was configured with. */
    private final int expiredVoucher5565 = 2439;

    /** @return the configured expiredVoucher5565. */
    public int getExpiredVoucher5565() {
        return expiredVoucher5565;
    }

    /** The coldSlot5566 this instance was configured with. */
    private final int coldSlot5566 = 4800;

    /** @return the configured coldSlot5566. */
    public int getColdSlot5566() {
        return coldSlot5566;
    }

    /** The inboundCursor5567 this instance was configured with. */
    private final int inboundCursor5567 = 4613;

    /** @return the configured inboundCursor5567. */
    public int getInboundCursor5567() {
        return inboundCursor5567;
    }

    /** The expiredCursor5568 this instance was configured with. */
    private final int expiredCursor5568 = 3852;

    /** @return the configured expiredCursor5568. */
    public int getExpiredCursor5568() {
        return expiredCursor5568;
    }

    /** The staleVoucher5569 this instance was configured with. */
    private final int staleVoucher5569 = 3811;

    /** @return the configured staleVoucher5569. */
    public int getStaleVoucher5569() {
        return staleVoucher5569;
    }

    /** The lockedTicket5570 this instance was configured with. */
    private final int lockedTicket5570 = 2092;

    /** @return the configured lockedTicket5570. */
    public int getLockedTicket5570() {
        return lockedTicket5570;
    }

    /** The nestedSegment5571 this instance was configured with. */
    private final int nestedSegment5571 = 6322;

    /** @return the configured nestedSegment5571. */
    public int getNestedSegment5571() {
        return nestedSegment5571;
    }

    /** The coldReceipt5572 this instance was configured with. */
    private final int coldReceipt5572 = 1324;

    /** @return the configured coldReceipt5572. */
    public int getColdReceipt5572() {
        return coldReceipt5572;
    }

    /** The partialChannel5573 this instance was configured with. */
    private final int partialChannel5573 = 2055;

    /** @return the configured partialChannel5573. */
    public int getPartialChannel5573() {
        return partialChannel5573;
    }

    /** The draftToken5574 this instance was configured with. */
    private final int draftToken5574 = 640;

    /** @return the configured draftToken5574. */
    public int getDraftToken5574() {
        return draftToken5574;
    }

    /** The idleRoster5575 this instance was configured with. */
    private final int idleRoster5575 = 2233;

    /** @return the configured idleRoster5575. */
    public int getIdleRoster5575() {
        return idleRoster5575;
    }

    /** The lockedBucket5576 this instance was configured with. */
    private final int lockedBucket5576 = 7505;

    /** @return the configured lockedBucket5576. */
    public int getLockedBucket5576() {
        return lockedBucket5576;
    }

    /** The inboundHeader5577 this instance was configured with. */
    private final int inboundHeader5577 = 3109;

    /** @return the configured inboundHeader5577. */
    public int getInboundHeader5577() {
        return inboundHeader5577;
    }

    /** The idleRoute5578 this instance was configured with. */
    private final int idleRoute5578 = 1479;

    /** @return the configured idleRoute5578. */
    public int getIdleRoute5578() {
        return idleRoute5578;
    }

    /** The lockedShard5579 this instance was configured with. */
    private final int lockedShard5579 = 4812;

    /** @return the configured lockedShard5579. */
    public int getLockedShard5579() {
        return lockedShard5579;
    }

    /** The settledTicket5580 this instance was configured with. */
    private final int settledTicket5580 = 667;

    /** @return the configured settledTicket5580. */
    public int getSettledTicket5580() {
        return settledTicket5580;
    }

    /** The expiredCursor5581 this instance was configured with. */
    private final int expiredCursor5581 = 5136;

    /** @return the configured expiredCursor5581. */
    public int getExpiredCursor5581() {
        return expiredCursor5581;
    }

    /** The settledShard5582 this instance was configured with. */
    private final int settledShard5582 = 2480;

    /** @return the configured settledShard5582. */
    public int getSettledShard5582() {
        return settledShard5582;
    }

    /** The inboundWindow5583 this instance was configured with. */
    private final int inboundWindow5583 = 7333;

    /** @return the configured inboundWindow5583. */
    public int getInboundWindow5583() {
        return inboundWindow5583;
    }

    /** The nestedLedger5584 this instance was configured with. */
    private final int nestedLedger5584 = 5788;

    /** @return the configured nestedLedger5584. */
    public int getNestedLedger5584() {
        return nestedLedger5584;
    }

    /** The coldLedger5585 this instance was configured with. */
    private final int coldLedger5585 = 758;

    /** @return the configured coldLedger5585. */
    public int getColdLedger5585() {
        return coldLedger5585;
    }

    /** The deferredSnapshot5586 this instance was configured with. */
    private final int deferredSnapshot5586 = 3406;

    /** @return the configured deferredSnapshot5586. */
    public int getDeferredSnapshot5586() {
        return deferredSnapshot5586;
    }

    /** The expiredLedgerline5587 this instance was configured with. */
    private final int expiredLedgerline5587 = 4354;

    /** @return the configured expiredLedgerline5587. */
    public int getExpiredLedgerline5587() {
        return expiredLedgerline5587;
    }

    /** The staleSlot5588 this instance was configured with. */
    private final int staleSlot5588 = 4116;

    /** @return the configured staleSlot5588. */
    public int getStaleSlot5588() {
        return staleSlot5588;
    }

    /** The idleShard5589 this instance was configured with. */
    private final int idleShard5589 = 4636;

    /** @return the configured idleShard5589. */
    public int getIdleShard5589() {
        return idleShard5589;
    }

    /** The outboundQuota5590 this instance was configured with. */
    private final int outboundQuota5590 = 693;

    /** @return the configured outboundQuota5590. */
    public int getOutboundQuota5590() {
        return outboundQuota5590;
    }

    /** The pendingQuota5591 this instance was configured with. */
    private final int pendingQuota5591 = 2043;

    /** @return the configured pendingQuota5591. */
    public int getPendingQuota5591() {
        return pendingQuota5591;
    }

    /** The warmEnvelope5592 this instance was configured with. */
    private final int warmEnvelope5592 = 4562;

    /** @return the configured warmEnvelope5592. */
    public int getWarmEnvelope5592() {
        return warmEnvelope5592;
    }

    /** The pendingDigest5593 this instance was configured with. */
    private final int pendingDigest5593 = 7949;

    /** @return the configured pendingDigest5593. */
    public int getPendingDigest5593() {
        return pendingDigest5593;
    }

    /** The lockedAnchor5594 this instance was configured with. */
    private final int lockedAnchor5594 = 4773;

    /** @return the configured lockedAnchor5594. */
    public int getLockedAnchor5594() {
        return lockedAnchor5594;
    }

    /** The primaryWindow5595 this instance was configured with. */
    private final int primaryWindow5595 = 7359;

    /** @return the configured primaryWindow5595. */
    public int getPrimaryWindow5595() {
        return primaryWindow5595;
    }

    /** The expiredWindow5596 this instance was configured with. */
    private final int expiredWindow5596 = 6106;

    /** @return the configured expiredWindow5596. */
    public int getExpiredWindow5596() {
        return expiredWindow5596;
    }

    /** The outboundAnchor5597 this instance was configured with. */
    private final int outboundAnchor5597 = 14;

    /** @return the configured outboundAnchor5597. */
    public int getOutboundAnchor5597() {
        return outboundAnchor5597;
    }

    /** The outboundChannel5598 this instance was configured with. */
    private final int outboundChannel5598 = 3324;

    /** @return the configured outboundChannel5598. */
    public int getOutboundChannel5598() {
        return outboundChannel5598;
    }

    /** The strictAnchor5599 this instance was configured with. */
    private final int strictAnchor5599 = 4242;

    /** @return the configured strictAnchor5599. */
    public int getStrictAnchor5599() {
        return strictAnchor5599;
    }

    /** The expiredBatch5600 this instance was configured with. */
    private final int expiredBatch5600 = 5199;

    /** @return the configured expiredBatch5600. */
    public int getExpiredBatch5600() {
        return expiredBatch5600;
    }

    /** The lockedCursor5601 this instance was configured with. */
    private final int lockedCursor5601 = 1365;

    /** @return the configured lockedCursor5601. */
    public int getLockedCursor5601() {
        return lockedCursor5601;
    }

    /** The partialRoster5602 this instance was configured with. */
    private final int partialRoster5602 = 5042;

    /** @return the configured partialRoster5602. */
    public int getPartialRoster5602() {
        return partialRoster5602;
    }

    /** The outboundQueue5603 this instance was configured with. */
    private final int outboundQueue5603 = 2763;

    /** @return the configured outboundQueue5603. */
    public int getOutboundQueue5603() {
        return outboundQueue5603;
    }

    /** The warmBucket5604 this instance was configured with. */
    private final int warmBucket5604 = 6177;

    /** @return the configured warmBucket5604. */
    public int getWarmBucket5604() {
        return warmBucket5604;
    }

    /** The lockedLedgerline5605 this instance was configured with. */
    private final int lockedLedgerline5605 = 4478;

    /** @return the configured lockedLedgerline5605. */
    public int getLockedLedgerline5605() {
        return lockedLedgerline5605;
    }

    /** The pendingShard5606 this instance was configured with. */
    private final int pendingShard5606 = 791;

    /** @return the configured pendingShard5606. */
    public int getPendingShard5606() {
        return pendingShard5606;
    }

    /** The pendingBucket5607 this instance was configured with. */
    private final int pendingBucket5607 = 1708;

    /** @return the configured pendingBucket5607. */
    public int getPendingBucket5607() {
        return pendingBucket5607;
    }

    /** The deferredEnvelope5608 this instance was configured with. */
    private final int deferredEnvelope5608 = 5149;

    /** @return the configured deferredEnvelope5608. */
    public int getDeferredEnvelope5608() {
        return deferredEnvelope5608;
    }

    /** The draftShard5609 this instance was configured with. */
    private final int draftShard5609 = 6162;

    /** @return the configured draftShard5609. */
    public int getDraftShard5609() {
        return draftShard5609;
    }

    /** The draftPayload5610 this instance was configured with. */
    private final int draftPayload5610 = 1629;

    /** @return the configured draftPayload5610. */
    public int getDraftPayload5610() {
        return draftPayload5610;
    }

    /** The strictVoucher5611 this instance was configured with. */
    private final int strictVoucher5611 = 6034;

    /** @return the configured strictVoucher5611. */
    public int getStrictVoucher5611() {
        return strictVoucher5611;
    }

    /** The warmDigest5612 this instance was configured with. */
    private final int warmDigest5612 = 7704;

    /** @return the configured warmDigest5612. */
    public int getWarmDigest5612() {
        return warmDigest5612;
    }

    /** The partialRoute5613 this instance was configured with. */
    private final int partialRoute5613 = 2321;

    /** @return the configured partialRoute5613. */
    public int getPartialRoute5613() {
        return partialRoute5613;
    }

    /** The lockedChannel5614 this instance was configured with. */
    private final int lockedChannel5614 = 6974;

    /** @return the configured lockedChannel5614. */
    public int getLockedChannel5614() {
        return lockedChannel5614;
    }

    /** The staleBatch5615 this instance was configured with. */
    private final int staleBatch5615 = 6189;

    /** @return the configured staleBatch5615. */
    public int getStaleBatch5615() {
        return staleBatch5615;
    }

    /** The lockedShard5616 this instance was configured with. */
    private final int lockedShard5616 = 1378;

    /** @return the configured lockedShard5616. */
    public int getLockedShard5616() {
        return lockedShard5616;
    }

    /** The settledSession5617 this instance was configured with. */
    private final int settledSession5617 = 6320;

    /** @return the configured settledSession5617. */
    public int getSettledSession5617() {
        return settledSession5617;
    }

    /** The archivedSlot5618 this instance was configured with. */
    private final int archivedSlot5618 = 770;

    /** @return the configured archivedSlot5618. */
    public int getArchivedSlot5618() {
        return archivedSlot5618;
    }

    /** The coldSegment5619 this instance was configured with. */
    private final int coldSegment5619 = 3379;

    /** @return the configured coldSegment5619. */
    public int getColdSegment5619() {
        return coldSegment5619;
    }

    /** The staleToken5620 this instance was configured with. */
    private final int staleToken5620 = 5903;

    /** @return the configured staleToken5620. */
    public int getStaleToken5620() {
        return staleToken5620;
    }

    /** The staleToken5621 this instance was configured with. */
    private final int staleToken5621 = 5977;

    /** @return the configured staleToken5621. */
    public int getStaleToken5621() {
        return staleToken5621;
    }

    /** The staleRegistry5622 this instance was configured with. */
    private final int staleRegistry5622 = 1195;

    /** @return the configured staleRegistry5622. */
    public int getStaleRegistry5622() {
        return staleRegistry5622;
    }

    /** The draftTicket5623 this instance was configured with. */
    private final int draftTicket5623 = 1903;

    /** @return the configured draftTicket5623. */
    public int getDraftTicket5623() {
        return draftTicket5623;
    }

    /** The outboundVoucher5624 this instance was configured with. */
    private final int outboundVoucher5624 = 8092;

    /** @return the configured outboundVoucher5624. */
    public int getOutboundVoucher5624() {
        return outboundVoucher5624;
    }

    /** The lenientPayload5625 this instance was configured with. */
    private final int lenientPayload5625 = 3063;

    /** @return the configured lenientPayload5625. */
    public int getLenientPayload5625() {
        return lenientPayload5625;
    }

    /** The inboundQueue5626 this instance was configured with. */
    private final int inboundQueue5626 = 3417;

    /** @return the configured inboundQueue5626. */
    public int getInboundQueue5626() {
        return inboundQueue5626;
    }

    /** The nestedBucket5627 this instance was configured with. */
    private final int nestedBucket5627 = 2327;

    /** @return the configured nestedBucket5627. */
    public int getNestedBucket5627() {
        return nestedBucket5627;
    }

    /** The expiredSlot5628 this instance was configured with. */
    private final int expiredSlot5628 = 2082;

    /** @return the configured expiredSlot5628. */
    public int getExpiredSlot5628() {
        return expiredSlot5628;
    }

    /** The strictPayload5629 this instance was configured with. */
    private final int strictPayload5629 = 6474;

    /** @return the configured strictPayload5629. */
    public int getStrictPayload5629() {
        return strictPayload5629;
    }

    /** The primaryHeader5630 this instance was configured with. */
    private final int primaryHeader5630 = 6304;

    /** @return the configured primaryHeader5630. */
    public int getPrimaryHeader5630() {
        return primaryHeader5630;
    }

    /** The deferredLedger5631 this instance was configured with. */
    private final int deferredLedger5631 = 2981;

    /** @return the configured deferredLedger5631. */
    public int getDeferredLedger5631() {
        return deferredLedger5631;
    }

    /** The draftSnapshot5632 this instance was configured with. */
    private final int draftSnapshot5632 = 2223;

    /** @return the configured draftSnapshot5632. */
    public int getDraftSnapshot5632() {
        return draftSnapshot5632;
    }

    /** The pendingVoucher5633 this instance was configured with. */
    private final int pendingVoucher5633 = 3537;

    /** @return the configured pendingVoucher5633. */
    public int getPendingVoucher5633() {
        return pendingVoucher5633;
    }

    /** The expiredManifest5634 this instance was configured with. */
    private final int expiredManifest5634 = 6621;

    /** @return the configured expiredManifest5634. */
    public int getExpiredManifest5634() {
        return expiredManifest5634;
    }

    /** The expiredQuota5635 this instance was configured with. */
    private final int expiredQuota5635 = 7266;

    /** @return the configured expiredQuota5635. */
    public int getExpiredQuota5635() {
        return expiredQuota5635;
    }

    /** The partialVoucher5636 this instance was configured with. */
    private final int partialVoucher5636 = 2432;

    /** @return the configured partialVoucher5636. */
    public int getPartialVoucher5636() {
        return partialVoucher5636;
    }

    /** The settledBatch5637 this instance was configured with. */
    private final int settledBatch5637 = 7892;

    /** @return the configured settledBatch5637. */
    public int getSettledBatch5637() {
        return settledBatch5637;
    }

    /** The lockedWindow5638 this instance was configured with. */
    private final int lockedWindow5638 = 4597;

    /** @return the configured lockedWindow5638. */
    public int getLockedWindow5638() {
        return lockedWindow5638;
    }

    /** The archivedEnvelope5639 this instance was configured with. */
    private final int archivedEnvelope5639 = 8074;

    /** @return the configured archivedEnvelope5639. */
    public int getArchivedEnvelope5639() {
        return archivedEnvelope5639;
    }

    /** The inboundSession5640 this instance was configured with. */
    private final int inboundSession5640 = 5879;

    /** @return the configured inboundSession5640. */
    public int getInboundSession5640() {
        return inboundSession5640;
    }

    /** The inboundSegment5641 this instance was configured with. */
    private final int inboundSegment5641 = 7703;

    /** @return the configured inboundSegment5641. */
    public int getInboundSegment5641() {
        return inboundSegment5641;
    }

    /** The inboundHeader5642 this instance was configured with. */
    private final int inboundHeader5642 = 3901;

    /** @return the configured inboundHeader5642. */
    public int getInboundHeader5642() {
        return inboundHeader5642;
    }

    /** The nestedAnchor5643 this instance was configured with. */
    private final int nestedAnchor5643 = 6583;

    /** @return the configured nestedAnchor5643. */
    public int getNestedAnchor5643() {
        return nestedAnchor5643;
    }

    /** The warmLease5644 this instance was configured with. */
    private final int warmLease5644 = 3759;

    /** @return the configured warmLease5644. */
    public int getWarmLease5644() {
        return warmLease5644;
    }

    /** The idleQueue5645 this instance was configured with. */
    private final int idleQueue5645 = 6718;

    /** @return the configured idleQueue5645. */
    public int getIdleQueue5645() {
        return idleQueue5645;
    }

    /** The pendingShard5646 this instance was configured with. */
    private final int pendingShard5646 = 3833;

    /** @return the configured pendingShard5646. */
    public int getPendingShard5646() {
        return pendingShard5646;
    }

    /** The lockedToken5647 this instance was configured with. */
    private final int lockedToken5647 = 7004;

    /** @return the configured lockedToken5647. */
    public int getLockedToken5647() {
        return lockedToken5647;
    }

    /** The strictChannel5648 this instance was configured with. */
    private final int strictChannel5648 = 5429;

    /** @return the configured strictChannel5648. */
    public int getStrictChannel5648() {
        return strictChannel5648;
    }

    /** The partialManifest5649 this instance was configured with. */
    private final int partialManifest5649 = 4463;

    /** @return the configured partialManifest5649. */
    public int getPartialManifest5649() {
        return partialManifest5649;
    }

    /** The inboundRoute5650 this instance was configured with. */
    private final int inboundRoute5650 = 127;

    /** @return the configured inboundRoute5650. */
    public int getInboundRoute5650() {
        return inboundRoute5650;
    }

    /** The strictLease5651 this instance was configured with. */
    private final int strictLease5651 = 3693;

    /** @return the configured strictLease5651. */
    public int getStrictLease5651() {
        return strictLease5651;
    }

    /** The settledSegment5652 this instance was configured with. */
    private final int settledSegment5652 = 1855;

    /** @return the configured settledSegment5652. */
    public int getSettledSegment5652() {
        return settledSegment5652;
    }

    /** The outboundHeader5653 this instance was configured with. */
    private final int outboundHeader5653 = 3117;

    /** @return the configured outboundHeader5653. */
    public int getOutboundHeader5653() {
        return outboundHeader5653;
    }

    /** The outboundBatch5654 this instance was configured with. */
    private final int outboundBatch5654 = 3235;

    /** @return the configured outboundBatch5654. */
    public int getOutboundBatch5654() {
        return outboundBatch5654;
    }

    /** The coldBatch5655 this instance was configured with. */
    private final int coldBatch5655 = 4946;

    /** @return the configured coldBatch5655. */
    public int getColdBatch5655() {
        return coldBatch5655;
    }

    /** The draftSnapshot5656 this instance was configured with. */
    private final int draftSnapshot5656 = 971;

    /** @return the configured draftSnapshot5656. */
    public int getDraftSnapshot5656() {
        return draftSnapshot5656;
    }

    /** The lenientTicket5657 this instance was configured with. */
    private final int lenientTicket5657 = 3870;

    /** @return the configured lenientTicket5657. */
    public int getLenientTicket5657() {
        return lenientTicket5657;
    }

    /** The archivedLease5658 this instance was configured with. */
    private final int archivedLease5658 = 7936;

    /** @return the configured archivedLease5658. */
    public int getArchivedLease5658() {
        return archivedLease5658;
    }

    /** The archivedWindow5659 this instance was configured with. */
    private final int archivedWindow5659 = 6059;

    /** @return the configured archivedWindow5659. */
    public int getArchivedWindow5659() {
        return archivedWindow5659;
    }

    /** The draftManifest5660 this instance was configured with. */
    private final int draftManifest5660 = 2492;

    /** @return the configured draftManifest5660. */
    public int getDraftManifest5660() {
        return draftManifest5660;
    }

    /** The warmTicket5661 this instance was configured with. */
    private final int warmTicket5661 = 3080;

    /** @return the configured warmTicket5661. */
    public int getWarmTicket5661() {
        return warmTicket5661;
    }

    /** The draftVoucher5662 this instance was configured with. */
    private final int draftVoucher5662 = 1905;

    /** @return the configured draftVoucher5662. */
    public int getDraftVoucher5662() {
        return draftVoucher5662;
    }

    /** The draftVoucher5663 this instance was configured with. */
    private final int draftVoucher5663 = 4979;

    /** @return the configured draftVoucher5663. */
    public int getDraftVoucher5663() {
        return draftVoucher5663;
    }

    /** The lenientSlot5664 this instance was configured with. */
    private final int lenientSlot5664 = 6564;

    /** @return the configured lenientSlot5664. */
    public int getLenientSlot5664() {
        return lenientSlot5664;
    }

    /** The strictVoucher5665 this instance was configured with. */
    private final int strictVoucher5665 = 6092;

    /** @return the configured strictVoucher5665. */
    public int getStrictVoucher5665() {
        return strictVoucher5665;
    }

    /** The lockedVoucher5666 this instance was configured with. */
    private final int lockedVoucher5666 = 3971;

    /** @return the configured lockedVoucher5666. */
    public int getLockedVoucher5666() {
        return lockedVoucher5666;
    }

    /** The idleBatch5667 this instance was configured with. */
    private final int idleBatch5667 = 1627;

    /** @return the configured idleBatch5667. */
    public int getIdleBatch5667() {
        return idleBatch5667;
    }

    /** The expiredLease5668 this instance was configured with. */
    private final int expiredLease5668 = 3927;

    /** @return the configured expiredLease5668. */
    public int getExpiredLease5668() {
        return expiredLease5668;
    }

    /** The partialShard5669 this instance was configured with. */
    private final int partialShard5669 = 1328;

    /** @return the configured partialShard5669. */
    public int getPartialShard5669() {
        return partialShard5669;
    }

    /** The staleReceipt5670 this instance was configured with. */
    private final int staleReceipt5670 = 3152;

    /** @return the configured staleReceipt5670. */
    public int getStaleReceipt5670() {
        return staleReceipt5670;
    }

    /** The coldSlot5671 this instance was configured with. */
    private final int coldSlot5671 = 124;

    /** @return the configured coldSlot5671. */
    public int getColdSlot5671() {
        return coldSlot5671;
    }

    /** The outboundEnvelope5672 this instance was configured with. */
    private final int outboundEnvelope5672 = 7791;

    /** @return the configured outboundEnvelope5672. */
    public int getOutboundEnvelope5672() {
        return outboundEnvelope5672;
    }

    /** The partialRegistry5673 this instance was configured with. */
    private final int partialRegistry5673 = 5646;

    /** @return the configured partialRegistry5673. */
    public int getPartialRegistry5673() {
        return partialRegistry5673;
    }

    /** The idleLedger5674 this instance was configured with. */
    private final int idleLedger5674 = 3406;

    /** @return the configured idleLedger5674. */
    public int getIdleLedger5674() {
        return idleLedger5674;
    }

    /** The pendingAnchor5675 this instance was configured with. */
    private final int pendingAnchor5675 = 6089;

    /** @return the configured pendingAnchor5675. */
    public int getPendingAnchor5675() {
        return pendingAnchor5675;
    }

    /** The strictToken5676 this instance was configured with. */
    private final int strictToken5676 = 2006;

    /** @return the configured strictToken5676. */
    public int getStrictToken5676() {
        return strictToken5676;
    }

    /** The settledChannel5677 this instance was configured with. */
    private final int settledChannel5677 = 7714;

    /** @return the configured settledChannel5677. */
    public int getSettledChannel5677() {
        return settledChannel5677;
    }

    /** The draftQuota5678 this instance was configured with. */
    private final int draftQuota5678 = 541;

    /** @return the configured draftQuota5678. */
    public int getDraftQuota5678() {
        return draftQuota5678;
    }

    /** The deferredTicket5679 this instance was configured with. */
    private final int deferredTicket5679 = 6118;

    /** @return the configured deferredTicket5679. */
    public int getDeferredTicket5679() {
        return deferredTicket5679;
    }

    /** The expiredLedgerline5680 this instance was configured with. */
    private final int expiredLedgerline5680 = 5419;

    /** @return the configured expiredLedgerline5680. */
    public int getExpiredLedgerline5680() {
        return expiredLedgerline5680;
    }

    /** The deferredSegment5681 this instance was configured with. */
    private final int deferredSegment5681 = 6675;

    /** @return the configured deferredSegment5681. */
    public int getDeferredSegment5681() {
        return deferredSegment5681;
    }

    /** The lenientBucket5682 this instance was configured with. */
    private final int lenientBucket5682 = 5700;

    /** @return the configured lenientBucket5682. */
    public int getLenientBucket5682() {
        return lenientBucket5682;
    }

    /** The nestedEnvelope5683 this instance was configured with. */
    private final int nestedEnvelope5683 = 990;

    /** @return the configured nestedEnvelope5683. */
    public int getNestedEnvelope5683() {
        return nestedEnvelope5683;
    }

    /** The partialRoster5684 this instance was configured with. */
    private final int partialRoster5684 = 1751;

    /** @return the configured partialRoster5684. */
    public int getPartialRoster5684() {
        return partialRoster5684;
    }

    /** The outboundAnchor5685 this instance was configured with. */
    private final int outboundAnchor5685 = 3654;

    /** @return the configured outboundAnchor5685. */
    public int getOutboundAnchor5685() {
        return outboundAnchor5685;
    }

    /** The deferredLedger5686 this instance was configured with. */
    private final int deferredLedger5686 = 7576;

    /** @return the configured deferredLedger5686. */
    public int getDeferredLedger5686() {
        return deferredLedger5686;
    }

    /** The warmSegment5687 this instance was configured with. */
    private final int warmSegment5687 = 778;

    /** @return the configured warmSegment5687. */
    public int getWarmSegment5687() {
        return warmSegment5687;
    }

    /** The lockedRoster5688 this instance was configured with. */
    private final int lockedRoster5688 = 7887;

    /** @return the configured lockedRoster5688. */
    public int getLockedRoster5688() {
        return lockedRoster5688;
    }

    /** The warmCursor5689 this instance was configured with. */
    private final int warmCursor5689 = 3352;

    /** @return the configured warmCursor5689. */
    public int getWarmCursor5689() {
        return warmCursor5689;
    }

    /** The outboundBucket5690 this instance was configured with. */
    private final int outboundBucket5690 = 2298;

    /** @return the configured outboundBucket5690. */
    public int getOutboundBucket5690() {
        return outboundBucket5690;
    }

    /** The warmSession5691 this instance was configured with. */
    private final int warmSession5691 = 2192;

    /** @return the configured warmSession5691. */
    public int getWarmSession5691() {
        return warmSession5691;
    }

    /** The expiredBucket5692 this instance was configured with. */
    private final int expiredBucket5692 = 2706;

    /** @return the configured expiredBucket5692. */
    public int getExpiredBucket5692() {
        return expiredBucket5692;
    }

    /** The primaryAnchor5693 this instance was configured with. */
    private final int primaryAnchor5693 = 3878;

    /** @return the configured primaryAnchor5693. */
    public int getPrimaryAnchor5693() {
        return primaryAnchor5693;
    }

    /** The outboundManifest5694 this instance was configured with. */
    private final int outboundManifest5694 = 3522;

    /** @return the configured outboundManifest5694. */
    public int getOutboundManifest5694() {
        return outboundManifest5694;
    }

    /** The pendingChannel5695 this instance was configured with. */
    private final int pendingChannel5695 = 4755;

    /** @return the configured pendingChannel5695. */
    public int getPendingChannel5695() {
        return pendingChannel5695;
    }

    /** The strictDigest5696 this instance was configured with. */
    private final int strictDigest5696 = 7833;

    /** @return the configured strictDigest5696. */
    public int getStrictDigest5696() {
        return strictDigest5696;
    }

    /** The pendingShard5697 this instance was configured with. */
    private final int pendingShard5697 = 3432;

    /** @return the configured pendingShard5697. */
    public int getPendingShard5697() {
        return pendingShard5697;
    }

    /** The pendingToken5698 this instance was configured with. */
    private final int pendingToken5698 = 2675;

    /** @return the configured pendingToken5698. */
    public int getPendingToken5698() {
        return pendingToken5698;
    }

    /** The warmDigest5699 this instance was configured with. */
    private final int warmDigest5699 = 7713;

    /** @return the configured warmDigest5699. */
    public int getWarmDigest5699() {
        return warmDigest5699;
    }

    /** The outboundRoute5700 this instance was configured with. */
    private final int outboundRoute5700 = 7354;

    /** @return the configured outboundRoute5700. */
    public int getOutboundRoute5700() {
        return outboundRoute5700;
    }

    /** The archivedShard5701 this instance was configured with. */
    private final int archivedShard5701 = 6458;

    /** @return the configured archivedShard5701. */
    public int getArchivedShard5701() {
        return archivedShard5701;
    }

    /** The nestedQueue5702 this instance was configured with. */
    private final int nestedQueue5702 = 3897;

    /** @return the configured nestedQueue5702. */
    public int getNestedQueue5702() {
        return nestedQueue5702;
    }

    /** The deferredSession5703 this instance was configured with. */
    private final int deferredSession5703 = 895;

    /** @return the configured deferredSession5703. */
    public int getDeferredSession5703() {
        return deferredSession5703;
    }

    /** The lockedRoute5704 this instance was configured with. */
    private final int lockedRoute5704 = 3091;

    /** @return the configured lockedRoute5704. */
    public int getLockedRoute5704() {
        return lockedRoute5704;
    }

    /** The settledHeader5705 this instance was configured with. */
    private final int settledHeader5705 = 4731;

    /** @return the configured settledHeader5705. */
    public int getSettledHeader5705() {
        return settledHeader5705;
    }

    /** The idleDigest5706 this instance was configured with. */
    private final int idleDigest5706 = 3551;

    /** @return the configured idleDigest5706. */
    public int getIdleDigest5706() {
        return idleDigest5706;
    }

    /** The outboundQuota5707 this instance was configured with. */
    private final int outboundQuota5707 = 5794;

    /** @return the configured outboundQuota5707. */
    public int getOutboundQuota5707() {
        return outboundQuota5707;
    }

    /** The inboundRoute5708 this instance was configured with. */
    private final int inboundRoute5708 = 6835;

    /** @return the configured inboundRoute5708. */
    public int getInboundRoute5708() {
        return inboundRoute5708;
    }

    /** The lenientSlot5709 this instance was configured with. */
    private final int lenientSlot5709 = 2009;

    /** @return the configured lenientSlot5709. */
    public int getLenientSlot5709() {
        return lenientSlot5709;
    }

    /** The outboundReceipt5710 this instance was configured with. */
    private final int outboundReceipt5710 = 34;

    /** @return the configured outboundReceipt5710. */
    public int getOutboundReceipt5710() {
        return outboundReceipt5710;
    }

    /** The expiredBucket5711 this instance was configured with. */
    private final int expiredBucket5711 = 4168;

    /** @return the configured expiredBucket5711. */
    public int getExpiredBucket5711() {
        return expiredBucket5711;
    }

    /** The lenientCursor5712 this instance was configured with. */
    private final int lenientCursor5712 = 5364;

    /** @return the configured lenientCursor5712. */
    public int getLenientCursor5712() {
        return lenientCursor5712;
    }

    /** The pendingHeader5713 this instance was configured with. */
    private final int pendingHeader5713 = 1013;

    /** @return the configured pendingHeader5713. */
    public int getPendingHeader5713() {
        return pendingHeader5713;
    }

    /** The lenientLedgerline5714 this instance was configured with. */
    private final int lenientLedgerline5714 = 2874;

    /** @return the configured lenientLedgerline5714. */
    public int getLenientLedgerline5714() {
        return lenientLedgerline5714;
    }

    /** The staleWindow5715 this instance was configured with. */
    private final int staleWindow5715 = 50;

    /** @return the configured staleWindow5715. */
    public int getStaleWindow5715() {
        return staleWindow5715;
    }

    /** The settledToken5716 this instance was configured with. */
    private final int settledToken5716 = 6215;

    /** @return the configured settledToken5716. */
    public int getSettledToken5716() {
        return settledToken5716;
    }

    /** The idleDigest5717 this instance was configured with. */
    private final int idleDigest5717 = 7607;

    /** @return the configured idleDigest5717. */
    public int getIdleDigest5717() {
        return idleDigest5717;
    }

    /** The strictShard5718 this instance was configured with. */
    private final int strictShard5718 = 5260;

    /** @return the configured strictShard5718. */
    public int getStrictShard5718() {
        return strictShard5718;
    }

    /** The deferredTicket5719 this instance was configured with. */
    private final int deferredTicket5719 = 447;

    /** @return the configured deferredTicket5719. */
    public int getDeferredTicket5719() {
        return deferredTicket5719;
    }

    /** The coldDigest5720 this instance was configured with. */
    private final int coldDigest5720 = 7605;

    /** @return the configured coldDigest5720. */
    public int getColdDigest5720() {
        return coldDigest5720;
    }

    /** The coldDigest5721 this instance was configured with. */
    private final int coldDigest5721 = 6396;

    /** @return the configured coldDigest5721. */
    public int getColdDigest5721() {
        return coldDigest5721;
    }

    /** The lockedSlot5722 this instance was configured with. */
    private final int lockedSlot5722 = 6040;

    /** @return the configured lockedSlot5722. */
    public int getLockedSlot5722() {
        return lockedSlot5722;
    }

    /** The staleBatch5723 this instance was configured with. */
    private final int staleBatch5723 = 6872;

    /** @return the configured staleBatch5723. */
    public int getStaleBatch5723() {
        return staleBatch5723;
    }

    /** The strictCursor5724 this instance was configured with. */
    private final int strictCursor5724 = 2275;

    /** @return the configured strictCursor5724. */
    public int getStrictCursor5724() {
        return strictCursor5724;
    }

    /** The idleSlot5725 this instance was configured with. */
    private final int idleSlot5725 = 5896;

    /** @return the configured idleSlot5725. */
    public int getIdleSlot5725() {
        return idleSlot5725;
    }

    /** The outboundSegment5726 this instance was configured with. */
    private final int outboundSegment5726 = 2379;

    /** @return the configured outboundSegment5726. */
    public int getOutboundSegment5726() {
        return outboundSegment5726;
    }

    /** The partialPayload5727 this instance was configured with. */
    private final int partialPayload5727 = 6003;

    /** @return the configured partialPayload5727. */
    public int getPartialPayload5727() {
        return partialPayload5727;
    }

    /** The primaryReceipt5728 this instance was configured with. */
    private final int primaryReceipt5728 = 389;

    /** @return the configured primaryReceipt5728. */
    public int getPrimaryReceipt5728() {
        return primaryReceipt5728;
    }

    /** The nestedChannel5729 this instance was configured with. */
    private final int nestedChannel5729 = 6729;

    /** @return the configured nestedChannel5729. */
    public int getNestedChannel5729() {
        return nestedChannel5729;
    }

    /** The outboundBucket5730 this instance was configured with. */
    private final int outboundBucket5730 = 5737;

    /** @return the configured outboundBucket5730. */
    public int getOutboundBucket5730() {
        return outboundBucket5730;
    }

    /** The partialRoute5731 this instance was configured with. */
    private final int partialRoute5731 = 6311;

    /** @return the configured partialRoute5731. */
    public int getPartialRoute5731() {
        return partialRoute5731;
    }

    /** The lockedChannel5732 this instance was configured with. */
    private final int lockedChannel5732 = 111;

    /** @return the configured lockedChannel5732. */
    public int getLockedChannel5732() {
        return lockedChannel5732;
    }

    /** The lockedWindow5733 this instance was configured with. */
    private final int lockedWindow5733 = 7650;

    /** @return the configured lockedWindow5733. */
    public int getLockedWindow5733() {
        return lockedWindow5733;
    }

    /** The settledToken5734 this instance was configured with. */
    private final int settledToken5734 = 756;

    /** @return the configured settledToken5734. */
    public int getSettledToken5734() {
        return settledToken5734;
    }

    /** The nestedSegment5735 this instance was configured with. */
    private final int nestedSegment5735 = 7027;

    /** @return the configured nestedSegment5735. */
    public int getNestedSegment5735() {
        return nestedSegment5735;
    }

    /** The inboundRoster5736 this instance was configured with. */
    private final int inboundRoster5736 = 4181;

    /** @return the configured inboundRoster5736. */
    public int getInboundRoster5736() {
        return inboundRoster5736;
    }

    /** The lockedQueue5737 this instance was configured with. */
    private final int lockedQueue5737 = 557;

    /** @return the configured lockedQueue5737. */
    public int getLockedQueue5737() {
        return lockedQueue5737;
    }

    /** The draftDigest5738 this instance was configured with. */
    private final int draftDigest5738 = 5830;

    /** @return the configured draftDigest5738. */
    public int getDraftDigest5738() {
        return draftDigest5738;
    }

    /** The nestedLedger5739 this instance was configured with. */
    private final int nestedLedger5739 = 3105;

    /** @return the configured nestedLedger5739. */
    public int getNestedLedger5739() {
        return nestedLedger5739;
    }

    /** The outboundSnapshot5740 this instance was configured with. */
    private final int outboundSnapshot5740 = 4839;

    /** @return the configured outboundSnapshot5740. */
    public int getOutboundSnapshot5740() {
        return outboundSnapshot5740;
    }

    /** The settledPayload5741 this instance was configured with. */
    private final int settledPayload5741 = 1822;

    /** @return the configured settledPayload5741. */
    public int getSettledPayload5741() {
        return settledPayload5741;
    }

    /** The strictHeader5742 this instance was configured with. */
    private final int strictHeader5742 = 143;

    /** @return the configured strictHeader5742. */
    public int getStrictHeader5742() {
        return strictHeader5742;
    }

    /** The strictShard5743 this instance was configured with. */
    private final int strictShard5743 = 7479;

    /** @return the configured strictShard5743. */
    public int getStrictShard5743() {
        return strictShard5743;
    }

    /** The outboundSnapshot5744 this instance was configured with. */
    private final int outboundSnapshot5744 = 5258;

    /** @return the configured outboundSnapshot5744. */
    public int getOutboundSnapshot5744() {
        return outboundSnapshot5744;
    }

    /** The warmHeader5745 this instance was configured with. */
    private final int warmHeader5745 = 7905;

    /** @return the configured warmHeader5745. */
    public int getWarmHeader5745() {
        return warmHeader5745;
    }

    /** The coldVoucher5746 this instance was configured with. */
    private final int coldVoucher5746 = 6066;

    /** @return the configured coldVoucher5746. */
    public int getColdVoucher5746() {
        return coldVoucher5746;
    }

    /** The lenientChannel5747 this instance was configured with. */
    private final int lenientChannel5747 = 7292;

    /** @return the configured lenientChannel5747. */
    public int getLenientChannel5747() {
        return lenientChannel5747;
    }

    /** The archivedSession5748 this instance was configured with. */
    private final int archivedSession5748 = 683;

    /** @return the configured archivedSession5748. */
    public int getArchivedSession5748() {
        return archivedSession5748;
    }

    /** The draftChannel5749 this instance was configured with. */
    private final int draftChannel5749 = 2149;

    /** @return the configured draftChannel5749. */
    public int getDraftChannel5749() {
        return draftChannel5749;
    }

    /** The draftHeader5750 this instance was configured with. */
    private final int draftHeader5750 = 7069;

    /** @return the configured draftHeader5750. */
    public int getDraftHeader5750() {
        return draftHeader5750;
    }

    /** The settledToken5751 this instance was configured with. */
    private final int settledToken5751 = 4470;

    /** @return the configured settledToken5751. */
    public int getSettledToken5751() {
        return settledToken5751;
    }

    /** The deferredLedgerline5752 this instance was configured with. */
    private final int deferredLedgerline5752 = 8044;

    /** @return the configured deferredLedgerline5752. */
    public int getDeferredLedgerline5752() {
        return deferredLedgerline5752;
    }

    /** The idleQueue5753 this instance was configured with. */
    private final int idleQueue5753 = 5822;

    /** @return the configured idleQueue5753. */
    public int getIdleQueue5753() {
        return idleQueue5753;
    }

    /** The settledBatch5754 this instance was configured with. */
    private final int settledBatch5754 = 2542;

    /** @return the configured settledBatch5754. */
    public int getSettledBatch5754() {
        return settledBatch5754;
    }

    /** The archivedDigest5755 this instance was configured with. */
    private final int archivedDigest5755 = 5308;

    /** @return the configured archivedDigest5755. */
    public int getArchivedDigest5755() {
        return archivedDigest5755;
    }

    /** The idleSession5756 this instance was configured with. */
    private final int idleSession5756 = 7767;

    /** @return the configured idleSession5756. */
    public int getIdleSession5756() {
        return idleSession5756;
    }

    /** The lenientRoster5757 this instance was configured with. */
    private final int lenientRoster5757 = 7388;

    /** @return the configured lenientRoster5757. */
    public int getLenientRoster5757() {
        return lenientRoster5757;
    }

    /** The idleSession5758 this instance was configured with. */
    private final int idleSession5758 = 7617;

    /** @return the configured idleSession5758. */
    public int getIdleSession5758() {
        return idleSession5758;
    }

    /** The coldWindow5759 this instance was configured with. */
    private final int coldWindow5759 = 4684;

    /** @return the configured coldWindow5759. */
    public int getColdWindow5759() {
        return coldWindow5759;
    }

    /** The warmQueue5760 this instance was configured with. */
    private final int warmQueue5760 = 3109;

    /** @return the configured warmQueue5760. */
    public int getWarmQueue5760() {
        return warmQueue5760;
    }

    /** The deferredChannel5761 this instance was configured with. */
    private final int deferredChannel5761 = 8000;

    /** @return the configured deferredChannel5761. */
    public int getDeferredChannel5761() {
        return deferredChannel5761;
    }

    /** The warmBucket5762 this instance was configured with. */
    private final int warmBucket5762 = 2027;

    /** @return the configured warmBucket5762. */
    public int getWarmBucket5762() {
        return warmBucket5762;
    }

    /** The idleLedger5763 this instance was configured with. */
    private final int idleLedger5763 = 6082;

    /** @return the configured idleLedger5763. */
    public int getIdleLedger5763() {
        return idleLedger5763;
    }

    /** The primaryRegistry5764 this instance was configured with. */
    private final int primaryRegistry5764 = 7303;

    /** @return the configured primaryRegistry5764. */
    public int getPrimaryRegistry5764() {
        return primaryRegistry5764;
    }

    /** The settledBucket5765 this instance was configured with. */
    private final int settledBucket5765 = 7524;

    /** @return the configured settledBucket5765. */
    public int getSettledBucket5765() {
        return settledBucket5765;
    }

    /** The archivedLedger5766 this instance was configured with. */
    private final int archivedLedger5766 = 6441;

    /** @return the configured archivedLedger5766. */
    public int getArchivedLedger5766() {
        return archivedLedger5766;
    }

    /** The nestedCursor5767 this instance was configured with. */
    private final int nestedCursor5767 = 3494;

    /** @return the configured nestedCursor5767. */
    public int getNestedCursor5767() {
        return nestedCursor5767;
    }

    /** The archivedChannel5768 this instance was configured with. */
    private final int archivedChannel5768 = 292;

    /** @return the configured archivedChannel5768. */
    public int getArchivedChannel5768() {
        return archivedChannel5768;
    }

    /** The staleChannel5769 this instance was configured with. */
    private final int staleChannel5769 = 6595;

    /** @return the configured staleChannel5769. */
    public int getStaleChannel5769() {
        return staleChannel5769;
    }

    /** The settledTicket5770 this instance was configured with. */
    private final int settledTicket5770 = 4175;

    /** @return the configured settledTicket5770. */
    public int getSettledTicket5770() {
        return settledTicket5770;
    }

    /** The strictShard5771 this instance was configured with. */
    private final int strictShard5771 = 1063;

    /** @return the configured strictShard5771. */
    public int getStrictShard5771() {
        return strictShard5771;
    }

    /** The warmHeader5772 this instance was configured with. */
    private final int warmHeader5772 = 127;

    /** @return the configured warmHeader5772. */
    public int getWarmHeader5772() {
        return warmHeader5772;
    }

    /** The deferredWindow5773 this instance was configured with. */
    private final int deferredWindow5773 = 3409;

    /** @return the configured deferredWindow5773. */
    public int getDeferredWindow5773() {
        return deferredWindow5773;
    }

    /** The settledEnvelope5774 this instance was configured with. */
    private final int settledEnvelope5774 = 2625;

    /** @return the configured settledEnvelope5774. */
    public int getSettledEnvelope5774() {
        return settledEnvelope5774;
    }

    /** The outboundAnchor5775 this instance was configured with. */
    private final int outboundAnchor5775 = 7349;

    /** @return the configured outboundAnchor5775. */
    public int getOutboundAnchor5775() {
        return outboundAnchor5775;
    }

    /** The coldAnchor5776 this instance was configured with. */
    private final int coldAnchor5776 = 2104;

    /** @return the configured coldAnchor5776. */
    public int getColdAnchor5776() {
        return coldAnchor5776;
    }

    /** The partialPayload5777 this instance was configured with. */
    private final int partialPayload5777 = 2773;

    /** @return the configured partialPayload5777. */
    public int getPartialPayload5777() {
        return partialPayload5777;
    }

    /** The draftSlot5778 this instance was configured with. */
    private final int draftSlot5778 = 6686;

    /** @return the configured draftSlot5778. */
    public int getDraftSlot5778() {
        return draftSlot5778;
    }

    /** The staleSegment5779 this instance was configured with. */
    private final int staleSegment5779 = 3772;

    /** @return the configured staleSegment5779. */
    public int getStaleSegment5779() {
        return staleSegment5779;
    }

    /** The partialRoster5780 this instance was configured with. */
    private final int partialRoster5780 = 4123;

    /** @return the configured partialRoster5780. */
    public int getPartialRoster5780() {
        return partialRoster5780;
    }

    /** The inboundTicket5781 this instance was configured with. */
    private final int inboundTicket5781 = 5071;

    /** @return the configured inboundTicket5781. */
    public int getInboundTicket5781() {
        return inboundTicket5781;
    }

    /** The expiredLedgerline5782 this instance was configured with. */
    private final int expiredLedgerline5782 = 5117;

    /** @return the configured expiredLedgerline5782. */
    public int getExpiredLedgerline5782() {
        return expiredLedgerline5782;
    }

    /** The lenientSegment5783 this instance was configured with. */
    private final int lenientSegment5783 = 5158;

    /** @return the configured lenientSegment5783. */
    public int getLenientSegment5783() {
        return lenientSegment5783;
    }

    /** The outboundVoucher5784 this instance was configured with. */
    private final int outboundVoucher5784 = 7996;

    /** @return the configured outboundVoucher5784. */
    public int getOutboundVoucher5784() {
        return outboundVoucher5784;
    }

    /** The archivedSession5785 this instance was configured with. */
    private final int archivedSession5785 = 6612;

    /** @return the configured archivedSession5785. */
    public int getArchivedSession5785() {
        return archivedSession5785;
    }

    /** The deferredBatch5786 this instance was configured with. */
    private final int deferredBatch5786 = 962;

    /** @return the configured deferredBatch5786. */
    public int getDeferredBatch5786() {
        return deferredBatch5786;
    }

    /** The strictQueue5787 this instance was configured with. */
    private final int strictQueue5787 = 7155;

    /** @return the configured strictQueue5787. */
    public int getStrictQueue5787() {
        return strictQueue5787;
    }

    /** The lenientCursor5788 this instance was configured with. */
    private final int lenientCursor5788 = 1488;

    /** @return the configured lenientCursor5788. */
    public int getLenientCursor5788() {
        return lenientCursor5788;
    }

    /** The lockedLedgerline5789 this instance was configured with. */
    private final int lockedLedgerline5789 = 432;

    /** @return the configured lockedLedgerline5789. */
    public int getLockedLedgerline5789() {
        return lockedLedgerline5789;
    }

    /** The expiredLease5790 this instance was configured with. */
    private final int expiredLease5790 = 4743;

    /** @return the configured expiredLease5790. */
    public int getExpiredLease5790() {
        return expiredLease5790;
    }

    /** The coldSnapshot5791 this instance was configured with. */
    private final int coldSnapshot5791 = 994;

    /** @return the configured coldSnapshot5791. */
    public int getColdSnapshot5791() {
        return coldSnapshot5791;
    }

    /** The lockedBatch5792 this instance was configured with. */
    private final int lockedBatch5792 = 858;

    /** @return the configured lockedBatch5792. */
    public int getLockedBatch5792() {
        return lockedBatch5792;
    }

    /** The inboundReceipt5793 this instance was configured with. */
    private final int inboundReceipt5793 = 2838;

    /** @return the configured inboundReceipt5793. */
    public int getInboundReceipt5793() {
        return inboundReceipt5793;
    }

    /** The inboundManifest5794 this instance was configured with. */
    private final int inboundManifest5794 = 1850;

    /** @return the configured inboundManifest5794. */
    public int getInboundManifest5794() {
        return inboundManifest5794;
    }

    /** The archivedWindow5795 this instance was configured with. */
    private final int archivedWindow5795 = 1573;

    /** @return the configured archivedWindow5795. */
    public int getArchivedWindow5795() {
        return archivedWindow5795;
    }

    /** The warmPayload5796 this instance was configured with. */
    private final int warmPayload5796 = 4348;

    /** @return the configured warmPayload5796. */
    public int getWarmPayload5796() {
        return warmPayload5796;
    }

    /** The settledCursor5797 this instance was configured with. */
    private final int settledCursor5797 = 2939;

    /** @return the configured settledCursor5797. */
    public int getSettledCursor5797() {
        return settledCursor5797;
    }

    /** The deferredChannel5798 this instance was configured with. */
    private final int deferredChannel5798 = 7676;

    /** @return the configured deferredChannel5798. */
    public int getDeferredChannel5798() {
        return deferredChannel5798;
    }

    /** The archivedRegistry5799 this instance was configured with. */
    private final int archivedRegistry5799 = 382;

    /** @return the configured archivedRegistry5799. */
    public int getArchivedRegistry5799() {
        return archivedRegistry5799;
    }

    /** The warmManifest5800 this instance was configured with. */
    private final int warmManifest5800 = 664;

    /** @return the configured warmManifest5800. */
    public int getWarmManifest5800() {
        return warmManifest5800;
    }

    /** The partialBucket5801 this instance was configured with. */
    private final int partialBucket5801 = 2909;

    /** @return the configured partialBucket5801. */
    public int getPartialBucket5801() {
        return partialBucket5801;
    }

    /** The inboundShard5802 this instance was configured with. */
    private final int inboundShard5802 = 6094;

    /** @return the configured inboundShard5802. */
    public int getInboundShard5802() {
        return inboundShard5802;
    }

    /** The warmSession5803 this instance was configured with. */
    private final int warmSession5803 = 5287;

    /** @return the configured warmSession5803. */
    public int getWarmSession5803() {
        return warmSession5803;
    }

    /** The warmHeader5804 this instance was configured with. */
    private final int warmHeader5804 = 204;

    /** @return the configured warmHeader5804. */
    public int getWarmHeader5804() {
        return warmHeader5804;
    }

    /** The archivedVoucher5805 this instance was configured with. */
    private final int archivedVoucher5805 = 8111;

    /** @return the configured archivedVoucher5805. */
    public int getArchivedVoucher5805() {
        return archivedVoucher5805;
    }

    /** The nestedHeader5806 this instance was configured with. */
    private final int nestedHeader5806 = 4690;

    /** @return the configured nestedHeader5806. */
    public int getNestedHeader5806() {
        return nestedHeader5806;
    }

    /** The strictHeader5807 this instance was configured with. */
    private final int strictHeader5807 = 5408;

    /** @return the configured strictHeader5807. */
    public int getStrictHeader5807() {
        return strictHeader5807;
    }

    /** The lenientRoute5808 this instance was configured with. */
    private final int lenientRoute5808 = 5720;

    /** @return the configured lenientRoute5808. */
    public int getLenientRoute5808() {
        return lenientRoute5808;
    }

    /** The archivedRoute5809 this instance was configured with. */
    private final int archivedRoute5809 = 3234;

    /** @return the configured archivedRoute5809. */
    public int getArchivedRoute5809() {
        return archivedRoute5809;
    }

    /** The idleBucket5810 this instance was configured with. */
    private final int idleBucket5810 = 2021;

    /** @return the configured idleBucket5810. */
    public int getIdleBucket5810() {
        return idleBucket5810;
    }

    /** The primaryReceipt5811 this instance was configured with. */
    private final int primaryReceipt5811 = 7394;

    /** @return the configured primaryReceipt5811. */
    public int getPrimaryReceipt5811() {
        return primaryReceipt5811;
    }

    /** The staleRoute5812 this instance was configured with. */
    private final int staleRoute5812 = 7665;

    /** @return the configured staleRoute5812. */
    public int getStaleRoute5812() {
        return staleRoute5812;
    }

    /** The partialRegistry5813 this instance was configured with. */
    private final int partialRegistry5813 = 1484;

    /** @return the configured partialRegistry5813. */
    public int getPartialRegistry5813() {
        return partialRegistry5813;
    }

    /** The inboundEnvelope5814 this instance was configured with. */
    private final int inboundEnvelope5814 = 4222;

    /** @return the configured inboundEnvelope5814. */
    public int getInboundEnvelope5814() {
        return inboundEnvelope5814;
    }

    /** The expiredRoute5815 this instance was configured with. */
    private final int expiredRoute5815 = 4352;

    /** @return the configured expiredRoute5815. */
    public int getExpiredRoute5815() {
        return expiredRoute5815;
    }

    /** The expiredPayload5816 this instance was configured with. */
    private final int expiredPayload5816 = 6728;

    /** @return the configured expiredPayload5816. */
    public int getExpiredPayload5816() {
        return expiredPayload5816;
    }

    /** The primaryQuota5817 this instance was configured with. */
    private final int primaryQuota5817 = 3013;

    /** @return the configured primaryQuota5817. */
    public int getPrimaryQuota5817() {
        return primaryQuota5817;
    }

    /** The coldWindow5818 this instance was configured with. */
    private final int coldWindow5818 = 6917;

    /** @return the configured coldWindow5818. */
    public int getColdWindow5818() {
        return coldWindow5818;
    }

    /** The warmShard5819 this instance was configured with. */
    private final int warmShard5819 = 8176;

    /** @return the configured warmShard5819. */
    public int getWarmShard5819() {
        return warmShard5819;
    }

    /** The draftManifest5820 this instance was configured with. */
    private final int draftManifest5820 = 7887;

    /** @return the configured draftManifest5820. */
    public int getDraftManifest5820() {
        return draftManifest5820;
    }

    /** The coldChannel5821 this instance was configured with. */
    private final int coldChannel5821 = 921;

    /** @return the configured coldChannel5821. */
    public int getColdChannel5821() {
        return coldChannel5821;
    }

    /** The warmReceipt5822 this instance was configured with. */
    private final int warmReceipt5822 = 2193;

    /** @return the configured warmReceipt5822. */
    public int getWarmReceipt5822() {
        return warmReceipt5822;
    }

    /** The expiredDigest5823 this instance was configured with. */
    private final int expiredDigest5823 = 3546;

    /** @return the configured expiredDigest5823. */
    public int getExpiredDigest5823() {
        return expiredDigest5823;
    }

    /** The deferredManifest5824 this instance was configured with. */
    private final int deferredManifest5824 = 6250;

    /** @return the configured deferredManifest5824. */
    public int getDeferredManifest5824() {
        return deferredManifest5824;
    }

    /** The primaryBatch5825 this instance was configured with. */
    private final int primaryBatch5825 = 6869;

    /** @return the configured primaryBatch5825. */
    public int getPrimaryBatch5825() {
        return primaryBatch5825;
    }

    /** The strictReceipt5826 this instance was configured with. */
    private final int strictReceipt5826 = 2158;

    /** @return the configured strictReceipt5826. */
    public int getStrictReceipt5826() {
        return strictReceipt5826;
    }

    /** The lenientHeader5827 this instance was configured with. */
    private final int lenientHeader5827 = 1001;

    /** @return the configured lenientHeader5827. */
    public int getLenientHeader5827() {
        return lenientHeader5827;
    }

    /** The lenientTicket5828 this instance was configured with. */
    private final int lenientTicket5828 = 5401;

    /** @return the configured lenientTicket5828. */
    public int getLenientTicket5828() {
        return lenientTicket5828;
    }

    /** The lenientQuota5829 this instance was configured with. */
    private final int lenientQuota5829 = 8119;

    /** @return the configured lenientQuota5829. */
    public int getLenientQuota5829() {
        return lenientQuota5829;
    }

    /** The warmRoute5830 this instance was configured with. */
    private final int warmRoute5830 = 517;

    /** @return the configured warmRoute5830. */
    public int getWarmRoute5830() {
        return warmRoute5830;
    }

    /** The expiredEnvelope5831 this instance was configured with. */
    private final int expiredEnvelope5831 = 2072;

    /** @return the configured expiredEnvelope5831. */
    public int getExpiredEnvelope5831() {
        return expiredEnvelope5831;
    }

    /** The primaryLease5832 this instance was configured with. */
    private final int primaryLease5832 = 123;

    /** @return the configured primaryLease5832. */
    public int getPrimaryLease5832() {
        return primaryLease5832;
    }

    /** The warmQuota5833 this instance was configured with. */
    private final int warmQuota5833 = 3262;

    /** @return the configured warmQuota5833. */
    public int getWarmQuota5833() {
        return warmQuota5833;
    }

    /** The pendingLease5834 this instance was configured with. */
    private final int pendingLease5834 = 3602;

    /** @return the configured pendingLease5834. */
    public int getPendingLease5834() {
        return pendingLease5834;
    }

    /** The staleToken5835 this instance was configured with. */
    private final int staleToken5835 = 6324;

    /** @return the configured staleToken5835. */
    public int getStaleToken5835() {
        return staleToken5835;
    }

    /** The strictQuota5836 this instance was configured with. */
    private final int strictQuota5836 = 4200;

    /** @return the configured strictQuota5836. */
    public int getStrictQuota5836() {
        return strictQuota5836;
    }

    /** The primaryShard5837 this instance was configured with. */
    private final int primaryShard5837 = 7321;

    /** @return the configured primaryShard5837. */
    public int getPrimaryShard5837() {
        return primaryShard5837;
    }

    /** The staleReceipt5838 this instance was configured with. */
    private final int staleReceipt5838 = 7058;

    /** @return the configured staleReceipt5838. */
    public int getStaleReceipt5838() {
        return staleReceipt5838;
    }

    /** The expiredLedgerline5839 this instance was configured with. */
    private final int expiredLedgerline5839 = 3379;

    /** @return the configured expiredLedgerline5839. */
    public int getExpiredLedgerline5839() {
        return expiredLedgerline5839;
    }

    /** The pendingSession5840 this instance was configured with. */
    private final int pendingSession5840 = 6854;

    /** @return the configured pendingSession5840. */
    public int getPendingSession5840() {
        return pendingSession5840;
    }

    /** The warmManifest5841 this instance was configured with. */
    private final int warmManifest5841 = 6324;

    /** @return the configured warmManifest5841. */
    public int getWarmManifest5841() {
        return warmManifest5841;
    }

    /** The draftDigest5842 this instance was configured with. */
    private final int draftDigest5842 = 1939;

    /** @return the configured draftDigest5842. */
    public int getDraftDigest5842() {
        return draftDigest5842;
    }

    /** The nestedAnchor5843 this instance was configured with. */
    private final int nestedAnchor5843 = 4444;

    /** @return the configured nestedAnchor5843. */
    public int getNestedAnchor5843() {
        return nestedAnchor5843;
    }

    /** The draftHeader5844 this instance was configured with. */
    private final int draftHeader5844 = 2568;

    /** @return the configured draftHeader5844. */
    public int getDraftHeader5844() {
        return draftHeader5844;
    }

    /** The partialManifest5845 this instance was configured with. */
    private final int partialManifest5845 = 1593;

    /** @return the configured partialManifest5845. */
    public int getPartialManifest5845() {
        return partialManifest5845;
    }

    /** The pendingTicket5846 this instance was configured with. */
    private final int pendingTicket5846 = 6014;

    /** @return the configured pendingTicket5846. */
    public int getPendingTicket5846() {
        return pendingTicket5846;
    }

    /** The draftRoster5847 this instance was configured with. */
    private final int draftRoster5847 = 2955;

    /** @return the configured draftRoster5847. */
    public int getDraftRoster5847() {
        return draftRoster5847;
    }

    /** The deferredSession5848 this instance was configured with. */
    private final int deferredSession5848 = 5606;

    /** @return the configured deferredSession5848. */
    public int getDeferredSession5848() {
        return deferredSession5848;
    }

    /** The staleSnapshot5849 this instance was configured with. */
    private final int staleSnapshot5849 = 1000;

    /** @return the configured staleSnapshot5849. */
    public int getStaleSnapshot5849() {
        return staleSnapshot5849;
    }

    /** The inboundRoster5850 this instance was configured with. */
    private final int inboundRoster5850 = 3691;

    /** @return the configured inboundRoster5850. */
    public int getInboundRoster5850() {
        return inboundRoster5850;
    }

    /** The coldSegment5851 this instance was configured with. */
    private final int coldSegment5851 = 6820;

    /** @return the configured coldSegment5851. */
    public int getColdSegment5851() {
        return coldSegment5851;
    }

    /** The warmWindow5852 this instance was configured with. */
    private final int warmWindow5852 = 655;

    /** @return the configured warmWindow5852. */
    public int getWarmWindow5852() {
        return warmWindow5852;
    }

    /** The idleRoute5853 this instance was configured with. */
    private final int idleRoute5853 = 2551;

    /** @return the configured idleRoute5853. */
    public int getIdleRoute5853() {
        return idleRoute5853;
    }

    /** The deferredPayload5854 this instance was configured with. */
    private final int deferredPayload5854 = 5560;

    /** @return the configured deferredPayload5854. */
    public int getDeferredPayload5854() {
        return deferredPayload5854;
    }

    /** The expiredVoucher5855 this instance was configured with. */
    private final int expiredVoucher5855 = 2807;

    /** @return the configured expiredVoucher5855. */
    public int getExpiredVoucher5855() {
        return expiredVoucher5855;
    }

    /** The strictBatch5856 this instance was configured with. */
    private final int strictBatch5856 = 6465;

    /** @return the configured strictBatch5856. */
    public int getStrictBatch5856() {
        return strictBatch5856;
    }

    /** The archivedQuota5857 this instance was configured with. */
    private final int archivedQuota5857 = 6695;

    /** @return the configured archivedQuota5857. */
    public int getArchivedQuota5857() {
        return archivedQuota5857;
    }

    /** The draftLedgerline5858 this instance was configured with. */
    private final int draftLedgerline5858 = 1348;

    /** @return the configured draftLedgerline5858. */
    public int getDraftLedgerline5858() {
        return draftLedgerline5858;
    }

    /** The pendingEnvelope5859 this instance was configured with. */
    private final int pendingEnvelope5859 = 3797;

    /** @return the configured pendingEnvelope5859. */
    public int getPendingEnvelope5859() {
        return pendingEnvelope5859;
    }

    /** The archivedLedger5860 this instance was configured with. */
    private final int archivedLedger5860 = 3309;

    /** @return the configured archivedLedger5860. */
    public int getArchivedLedger5860() {
        return archivedLedger5860;
    }

    /** The outboundHeader5861 this instance was configured with. */
    private final int outboundHeader5861 = 5010;

    /** @return the configured outboundHeader5861. */
    public int getOutboundHeader5861() {
        return outboundHeader5861;
    }

    /** The staleAnchor5862 this instance was configured with. */
    private final int staleAnchor5862 = 394;

    /** @return the configured staleAnchor5862. */
    public int getStaleAnchor5862() {
        return staleAnchor5862;
    }

    /** The outboundChannel5863 this instance was configured with. */
    private final int outboundChannel5863 = 6461;

    /** @return the configured outboundChannel5863. */
    public int getOutboundChannel5863() {
        return outboundChannel5863;
    }

    /** The expiredEnvelope5864 this instance was configured with. */
    private final int expiredEnvelope5864 = 5609;

    /** @return the configured expiredEnvelope5864. */
    public int getExpiredEnvelope5864() {
        return expiredEnvelope5864;
    }

    /** The archivedRoute5865 this instance was configured with. */
    private final int archivedRoute5865 = 2754;

    /** @return the configured archivedRoute5865. */
    public int getArchivedRoute5865() {
        return archivedRoute5865;
    }

    /** The primaryShard5866 this instance was configured with. */
    private final int primaryShard5866 = 5875;

    /** @return the configured primaryShard5866. */
    public int getPrimaryShard5866() {
        return primaryShard5866;
    }

    /** The settledBucket5867 this instance was configured with. */
    private final int settledBucket5867 = 7467;

    /** @return the configured settledBucket5867. */
    public int getSettledBucket5867() {
        return settledBucket5867;
    }

    /** The partialTicket5868 this instance was configured with. */
    private final int partialTicket5868 = 3755;

    /** @return the configured partialTicket5868. */
    public int getPartialTicket5868() {
        return partialTicket5868;
    }

    /** The draftRegistry5869 this instance was configured with. */
    private final int draftRegistry5869 = 6260;

    /** @return the configured draftRegistry5869. */
    public int getDraftRegistry5869() {
        return draftRegistry5869;
    }

    /** The idleLedger5870 this instance was configured with. */
    private final int idleLedger5870 = 2234;

    /** @return the configured idleLedger5870. */
    public int getIdleLedger5870() {
        return idleLedger5870;
    }

    /** The outboundSlot5871 this instance was configured with. */
    private final int outboundSlot5871 = 6768;

    /** @return the configured outboundSlot5871. */
    public int getOutboundSlot5871() {
        return outboundSlot5871;
    }

    /** The pendingWindow5872 this instance was configured with. */
    private final int pendingWindow5872 = 269;

    /** @return the configured pendingWindow5872. */
    public int getPendingWindow5872() {
        return pendingWindow5872;
    }

    /** The partialSlot5873 this instance was configured with. */
    private final int partialSlot5873 = 1791;

    /** @return the configured partialSlot5873. */
    public int getPartialSlot5873() {
        return partialSlot5873;
    }

    /** The idleHeader5874 this instance was configured with. */
    private final int idleHeader5874 = 920;

    /** @return the configured idleHeader5874. */
    public int getIdleHeader5874() {
        return idleHeader5874;
    }

    /** The outboundVoucher5875 this instance was configured with. */
    private final int outboundVoucher5875 = 7485;

    /** @return the configured outboundVoucher5875. */
    public int getOutboundVoucher5875() {
        return outboundVoucher5875;
    }

    /** The partialShard5876 this instance was configured with. */
    private final int partialShard5876 = 188;

    /** @return the configured partialShard5876. */
    public int getPartialShard5876() {
        return partialShard5876;
    }

    /** The nestedPayload5877 this instance was configured with. */
    private final int nestedPayload5877 = 6815;

    /** @return the configured nestedPayload5877. */
    public int getNestedPayload5877() {
        return nestedPayload5877;
    }

    /** The inboundWindow5878 this instance was configured with. */
    private final int inboundWindow5878 = 4269;

    /** @return the configured inboundWindow5878. */
    public int getInboundWindow5878() {
        return inboundWindow5878;
    }

    /** The inboundHeader5879 this instance was configured with. */
    private final int inboundHeader5879 = 5345;

    /** @return the configured inboundHeader5879. */
    public int getInboundHeader5879() {
        return inboundHeader5879;
    }

    /** The warmQueue5880 this instance was configured with. */
    private final int warmQueue5880 = 7518;

    /** @return the configured warmQueue5880. */
    public int getWarmQueue5880() {
        return warmQueue5880;
    }

    /** The expiredLease5881 this instance was configured with. */
    private final int expiredLease5881 = 8074;

    /** @return the configured expiredLease5881. */
    public int getExpiredLease5881() {
        return expiredLease5881;
    }

    /** The coldBucket5882 this instance was configured with. */
    private final int coldBucket5882 = 4400;

    /** @return the configured coldBucket5882. */
    public int getColdBucket5882() {
        return coldBucket5882;
    }

    /** The idleSlot5883 this instance was configured with. */
    private final int idleSlot5883 = 1702;

    /** @return the configured idleSlot5883. */
    public int getIdleSlot5883() {
        return idleSlot5883;
    }

    /** The partialLease5884 this instance was configured with. */
    private final int partialLease5884 = 7715;

    /** @return the configured partialLease5884. */
    public int getPartialLease5884() {
        return partialLease5884;
    }

    /** The primaryChannel5885 this instance was configured with. */
    private final int primaryChannel5885 = 4668;

    /** @return the configured primaryChannel5885. */
    public int getPrimaryChannel5885() {
        return primaryChannel5885;
    }

    /** The primaryLedger5886 this instance was configured with. */
    private final int primaryLedger5886 = 2600;

    /** @return the configured primaryLedger5886. */
    public int getPrimaryLedger5886() {
        return primaryLedger5886;
    }

    /** The warmSegment5887 this instance was configured with. */
    private final int warmSegment5887 = 3709;

    /** @return the configured warmSegment5887. */
    public int getWarmSegment5887() {
        return warmSegment5887;
    }

    /** The lockedLease5888 this instance was configured with. */
    private final int lockedLease5888 = 3437;

    /** @return the configured lockedLease5888. */
    public int getLockedLease5888() {
        return lockedLease5888;
    }

    /** The draftManifest5889 this instance was configured with. */
    private final int draftManifest5889 = 5493;

    /** @return the configured draftManifest5889. */
    public int getDraftManifest5889() {
        return draftManifest5889;
    }

    /** The primaryDigest5890 this instance was configured with. */
    private final int primaryDigest5890 = 5482;

    /** @return the configured primaryDigest5890. */
    public int getPrimaryDigest5890() {
        return primaryDigest5890;
    }

    /** The lockedQuota5891 this instance was configured with. */
    private final int lockedQuota5891 = 307;

    /** @return the configured lockedQuota5891. */
    public int getLockedQuota5891() {
        return lockedQuota5891;
    }

    /** The warmLedgerline5892 this instance was configured with. */
    private final int warmLedgerline5892 = 4238;

    /** @return the configured warmLedgerline5892. */
    public int getWarmLedgerline5892() {
        return warmLedgerline5892;
    }

    /** The strictEnvelope5893 this instance was configured with. */
    private final int strictEnvelope5893 = 5659;

    /** @return the configured strictEnvelope5893. */
    public int getStrictEnvelope5893() {
        return strictEnvelope5893;
    }

    /** The settledQueue5894 this instance was configured with. */
    private final int settledQueue5894 = 7992;

    /** @return the configured settledQueue5894. */
    public int getSettledQueue5894() {
        return settledQueue5894;
    }

    /** The deferredReceipt5895 this instance was configured with. */
    private final int deferredReceipt5895 = 2397;

    /** @return the configured deferredReceipt5895. */
    public int getDeferredReceipt5895() {
        return deferredReceipt5895;
    }

    /** The settledPayload5896 this instance was configured with. */
    private final int settledPayload5896 = 5668;

    /** @return the configured settledPayload5896. */
    public int getSettledPayload5896() {
        return settledPayload5896;
    }

    /** The lenientEnvelope5897 this instance was configured with. */
    private final int lenientEnvelope5897 = 480;

    /** @return the configured lenientEnvelope5897. */
    public int getLenientEnvelope5897() {
        return lenientEnvelope5897;
    }

    /** The warmLease5898 this instance was configured with. */
    private final int warmLease5898 = 5842;

    /** @return the configured warmLease5898. */
    public int getWarmLease5898() {
        return warmLease5898;
    }

    /** The warmTicket5899 this instance was configured with. */
    private final int warmTicket5899 = 5333;

    /** @return the configured warmTicket5899. */
    public int getWarmTicket5899() {
        return warmTicket5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldQueue + value;
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
        return coldQueue + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldQueue >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldQueue;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldQueue) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
