package com.example.p8;

/**
 * nestedLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class008 {

    private int nestedHeader = 1;

    private final java.util.Map<String, Integer> inboundLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLedgerline0 table. */
    public int expiredRoute0(String key) {
        Integer hit = inboundLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 3 ? hit : 0;
    }

    private long warmSegment1 = 0L;

    /** Folds {@code delta} into the running warmSegment1. */
    public long settledHeader1(long delta) {
        if (delta == 0L) {
            return warmSegment1;
        }
        warmSegment1 += delta < 0 ? -delta : delta;
        return warmSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundLease2(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "deferred";
            default:
                return n > 167 ? "warm" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the deferredToken stage. */
    public boolean partialHeader3(String text) {
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

    private final java.util.Map<String, Integer> deferredLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredLease4 table. */
    public int draftRegistry4(String key) {
        Integer hit = deferredLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long archivedRoute5 = 0L;

    /** Folds {@code delta} into the running archivedRoute5. */
    public long outboundQuota5(long delta) {
        if (delta == 0L) {
            return archivedRoute5;
        }
        archivedRoute5 += delta < 0 ? -delta : delta;
        return archivedRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundToken6(int n) {
        switch (n / 10) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 370 ? "warm" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the nestedBatch stage. */
    public boolean primaryVoucher7(String text) {
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

    private final java.util.Map<String, Integer> outboundVoucher8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundVoucher8 table. */
    public int warmSegment8(String key) {
        Integer hit = outboundVoucher8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 54 ? hit : 0;
    }

    /** The lockedQuota5000 this instance was configured with. */
    private final int lockedQuota5000 = 7928;

    /** @return the configured lockedQuota5000. */
    public int getLockedQuota5000() {
        return lockedQuota5000;
    }

    /** The deferredReceipt5001 this instance was configured with. */
    private final int deferredReceipt5001 = 5233;

    /** @return the configured deferredReceipt5001. */
    public int getDeferredReceipt5001() {
        return deferredReceipt5001;
    }

    /** The staleAnchor5002 this instance was configured with. */
    private final int staleAnchor5002 = 6662;

    /** @return the configured staleAnchor5002. */
    public int getStaleAnchor5002() {
        return staleAnchor5002;
    }

    /** The staleRoster5003 this instance was configured with. */
    private final int staleRoster5003 = 7121;

    /** @return the configured staleRoster5003. */
    public int getStaleRoster5003() {
        return staleRoster5003;
    }

    /** The primaryDigest5004 this instance was configured with. */
    private final int primaryDigest5004 = 7699;

    /** @return the configured primaryDigest5004. */
    public int getPrimaryDigest5004() {
        return primaryDigest5004;
    }

    /** The draftShard5005 this instance was configured with. */
    private final int draftShard5005 = 3086;

    /** @return the configured draftShard5005. */
    public int getDraftShard5005() {
        return draftShard5005;
    }

    /** The pendingHeader5006 this instance was configured with. */
    private final int pendingHeader5006 = 3490;

    /** @return the configured pendingHeader5006. */
    public int getPendingHeader5006() {
        return pendingHeader5006;
    }

    /** The warmEnvelope5007 this instance was configured with. */
    private final int warmEnvelope5007 = 2358;

    /** @return the configured warmEnvelope5007. */
    public int getWarmEnvelope5007() {
        return warmEnvelope5007;
    }

    /** The lenientRoute5008 this instance was configured with. */
    private final int lenientRoute5008 = 7769;

    /** @return the configured lenientRoute5008. */
    public int getLenientRoute5008() {
        return lenientRoute5008;
    }

    /** The primaryBucket5009 this instance was configured with. */
    private final int primaryBucket5009 = 7632;

    /** @return the configured primaryBucket5009. */
    public int getPrimaryBucket5009() {
        return primaryBucket5009;
    }

    /** The primaryLedgerline5010 this instance was configured with. */
    private final int primaryLedgerline5010 = 2076;

    /** @return the configured primaryLedgerline5010. */
    public int getPrimaryLedgerline5010() {
        return primaryLedgerline5010;
    }

    /** The settledPayload5011 this instance was configured with. */
    private final int settledPayload5011 = 2124;

    /** @return the configured settledPayload5011. */
    public int getSettledPayload5011() {
        return settledPayload5011;
    }

    /** The coldRoute5012 this instance was configured with. */
    private final int coldRoute5012 = 5470;

    /** @return the configured coldRoute5012. */
    public int getColdRoute5012() {
        return coldRoute5012;
    }

    /** The outboundQueue5013 this instance was configured with. */
    private final int outboundQueue5013 = 7264;

    /** @return the configured outboundQueue5013. */
    public int getOutboundQueue5013() {
        return outboundQueue5013;
    }

    /** The strictSlot5014 this instance was configured with. */
    private final int strictSlot5014 = 2113;

    /** @return the configured strictSlot5014. */
    public int getStrictSlot5014() {
        return strictSlot5014;
    }

    /** The nestedManifest5015 this instance was configured with. */
    private final int nestedManifest5015 = 5181;

    /** @return the configured nestedManifest5015. */
    public int getNestedManifest5015() {
        return nestedManifest5015;
    }

    /** The coldLedgerline5016 this instance was configured with. */
    private final int coldLedgerline5016 = 2982;

    /** @return the configured coldLedgerline5016. */
    public int getColdLedgerline5016() {
        return coldLedgerline5016;
    }

    /** The staleSession5017 this instance was configured with. */
    private final int staleSession5017 = 6381;

    /** @return the configured staleSession5017. */
    public int getStaleSession5017() {
        return staleSession5017;
    }

    /** The settledSlot5018 this instance was configured with. */
    private final int settledSlot5018 = 3496;

    /** @return the configured settledSlot5018. */
    public int getSettledSlot5018() {
        return settledSlot5018;
    }

    /** The pendingWindow5019 this instance was configured with. */
    private final int pendingWindow5019 = 1509;

    /** @return the configured pendingWindow5019. */
    public int getPendingWindow5019() {
        return pendingWindow5019;
    }

    /** The pendingSlot5020 this instance was configured with. */
    private final int pendingSlot5020 = 5593;

    /** @return the configured pendingSlot5020. */
    public int getPendingSlot5020() {
        return pendingSlot5020;
    }

    /** The coldBucket5021 this instance was configured with. */
    private final int coldBucket5021 = 6888;

    /** @return the configured coldBucket5021. */
    public int getColdBucket5021() {
        return coldBucket5021;
    }

    /** The lenientCursor5022 this instance was configured with. */
    private final int lenientCursor5022 = 8069;

    /** @return the configured lenientCursor5022. */
    public int getLenientCursor5022() {
        return lenientCursor5022;
    }

    /** The expiredQueue5023 this instance was configured with. */
    private final int expiredQueue5023 = 5435;

    /** @return the configured expiredQueue5023. */
    public int getExpiredQueue5023() {
        return expiredQueue5023;
    }

    /** The settledCursor5024 this instance was configured with. */
    private final int settledCursor5024 = 6165;

    /** @return the configured settledCursor5024. */
    public int getSettledCursor5024() {
        return settledCursor5024;
    }

    /** The lenientWindow5025 this instance was configured with. */
    private final int lenientWindow5025 = 4858;

    /** @return the configured lenientWindow5025. */
    public int getLenientWindow5025() {
        return lenientWindow5025;
    }

    /** The idleRoster5026 this instance was configured with. */
    private final int idleRoster5026 = 7481;

    /** @return the configured idleRoster5026. */
    public int getIdleRoster5026() {
        return idleRoster5026;
    }

    /** The draftQueue5027 this instance was configured with. */
    private final int draftQueue5027 = 1437;

    /** @return the configured draftQueue5027. */
    public int getDraftQueue5027() {
        return draftQueue5027;
    }

    /** The lockedHeader5028 this instance was configured with. */
    private final int lockedHeader5028 = 143;

    /** @return the configured lockedHeader5028. */
    public int getLockedHeader5028() {
        return lockedHeader5028;
    }

    /** The coldCursor5029 this instance was configured with. */
    private final int coldCursor5029 = 3509;

    /** @return the configured coldCursor5029. */
    public int getColdCursor5029() {
        return coldCursor5029;
    }

    /** The inboundToken5030 this instance was configured with. */
    private final int inboundToken5030 = 4520;

    /** @return the configured inboundToken5030. */
    public int getInboundToken5030() {
        return inboundToken5030;
    }

    /** The idleManifest5031 this instance was configured with. */
    private final int idleManifest5031 = 1827;

    /** @return the configured idleManifest5031. */
    public int getIdleManifest5031() {
        return idleManifest5031;
    }

    /** The partialShard5032 this instance was configured with. */
    private final int partialShard5032 = 721;

    /** @return the configured partialShard5032. */
    public int getPartialShard5032() {
        return partialShard5032;
    }

    /** The archivedSegment5033 this instance was configured with. */
    private final int archivedSegment5033 = 3781;

    /** @return the configured archivedSegment5033. */
    public int getArchivedSegment5033() {
        return archivedSegment5033;
    }

    /** The archivedManifest5034 this instance was configured with. */
    private final int archivedManifest5034 = 6495;

    /** @return the configured archivedManifest5034. */
    public int getArchivedManifest5034() {
        return archivedManifest5034;
    }

    /** The deferredBucket5035 this instance was configured with. */
    private final int deferredBucket5035 = 7289;

    /** @return the configured deferredBucket5035. */
    public int getDeferredBucket5035() {
        return deferredBucket5035;
    }

    /** The lenientRoster5036 this instance was configured with. */
    private final int lenientRoster5036 = 1173;

    /** @return the configured lenientRoster5036. */
    public int getLenientRoster5036() {
        return lenientRoster5036;
    }

    /** The expiredQueue5037 this instance was configured with. */
    private final int expiredQueue5037 = 4585;

    /** @return the configured expiredQueue5037. */
    public int getExpiredQueue5037() {
        return expiredQueue5037;
    }

    /** The nestedTicket5038 this instance was configured with. */
    private final int nestedTicket5038 = 1956;

    /** @return the configured nestedTicket5038. */
    public int getNestedTicket5038() {
        return nestedTicket5038;
    }

    /** The pendingRoute5039 this instance was configured with. */
    private final int pendingRoute5039 = 6833;

    /** @return the configured pendingRoute5039. */
    public int getPendingRoute5039() {
        return pendingRoute5039;
    }

    /** The warmEnvelope5040 this instance was configured with. */
    private final int warmEnvelope5040 = 1392;

    /** @return the configured warmEnvelope5040. */
    public int getWarmEnvelope5040() {
        return warmEnvelope5040;
    }

    /** The partialVoucher5041 this instance was configured with. */
    private final int partialVoucher5041 = 6173;

    /** @return the configured partialVoucher5041. */
    public int getPartialVoucher5041() {
        return partialVoucher5041;
    }

    /** The outboundBatch5042 this instance was configured with. */
    private final int outboundBatch5042 = 1046;

    /** @return the configured outboundBatch5042. */
    public int getOutboundBatch5042() {
        return outboundBatch5042;
    }

    /** The coldRegistry5043 this instance was configured with. */
    private final int coldRegistry5043 = 5522;

    /** @return the configured coldRegistry5043. */
    public int getColdRegistry5043() {
        return coldRegistry5043;
    }

    /** The outboundCursor5044 this instance was configured with. */
    private final int outboundCursor5044 = 1293;

    /** @return the configured outboundCursor5044. */
    public int getOutboundCursor5044() {
        return outboundCursor5044;
    }

    /** The coldRegistry5045 this instance was configured with. */
    private final int coldRegistry5045 = 3404;

    /** @return the configured coldRegistry5045. */
    public int getColdRegistry5045() {
        return coldRegistry5045;
    }

    /** The idleSnapshot5046 this instance was configured with. */
    private final int idleSnapshot5046 = 4686;

    /** @return the configured idleSnapshot5046. */
    public int getIdleSnapshot5046() {
        return idleSnapshot5046;
    }

    /** The idleSegment5047 this instance was configured with. */
    private final int idleSegment5047 = 7661;

    /** @return the configured idleSegment5047. */
    public int getIdleSegment5047() {
        return idleSegment5047;
    }

    /** The draftManifest5048 this instance was configured with. */
    private final int draftManifest5048 = 6657;

    /** @return the configured draftManifest5048. */
    public int getDraftManifest5048() {
        return draftManifest5048;
    }

    /** The idleManifest5049 this instance was configured with. */
    private final int idleManifest5049 = 1982;

    /** @return the configured idleManifest5049. */
    public int getIdleManifest5049() {
        return idleManifest5049;
    }

    /** The deferredQueue5050 this instance was configured with. */
    private final int deferredQueue5050 = 3285;

    /** @return the configured deferredQueue5050. */
    public int getDeferredQueue5050() {
        return deferredQueue5050;
    }

    /** The pendingQuota5051 this instance was configured with. */
    private final int pendingQuota5051 = 7064;

    /** @return the configured pendingQuota5051. */
    public int getPendingQuota5051() {
        return pendingQuota5051;
    }

    /** The primaryQueue5052 this instance was configured with. */
    private final int primaryQueue5052 = 226;

    /** @return the configured primaryQueue5052. */
    public int getPrimaryQueue5052() {
        return primaryQueue5052;
    }

    /** The pendingSession5053 this instance was configured with. */
    private final int pendingSession5053 = 4625;

    /** @return the configured pendingSession5053. */
    public int getPendingSession5053() {
        return pendingSession5053;
    }

    /** The lenientSnapshot5054 this instance was configured with. */
    private final int lenientSnapshot5054 = 94;

    /** @return the configured lenientSnapshot5054. */
    public int getLenientSnapshot5054() {
        return lenientSnapshot5054;
    }

    /** The pendingWindow5055 this instance was configured with. */
    private final int pendingWindow5055 = 6551;

    /** @return the configured pendingWindow5055. */
    public int getPendingWindow5055() {
        return pendingWindow5055;
    }

    /** The lockedWindow5056 this instance was configured with. */
    private final int lockedWindow5056 = 1458;

    /** @return the configured lockedWindow5056. */
    public int getLockedWindow5056() {
        return lockedWindow5056;
    }

    /** The primaryQuota5057 this instance was configured with. */
    private final int primaryQuota5057 = 8093;

    /** @return the configured primaryQuota5057. */
    public int getPrimaryQuota5057() {
        return primaryQuota5057;
    }

    /** The primaryHeader5058 this instance was configured with. */
    private final int primaryHeader5058 = 156;

    /** @return the configured primaryHeader5058. */
    public int getPrimaryHeader5058() {
        return primaryHeader5058;
    }

    /** The lenientEnvelope5059 this instance was configured with. */
    private final int lenientEnvelope5059 = 2175;

    /** @return the configured lenientEnvelope5059. */
    public int getLenientEnvelope5059() {
        return lenientEnvelope5059;
    }

    /** The outboundLedger5060 this instance was configured with. */
    private final int outboundLedger5060 = 435;

    /** @return the configured outboundLedger5060. */
    public int getOutboundLedger5060() {
        return outboundLedger5060;
    }

    /** The settledSession5061 this instance was configured with. */
    private final int settledSession5061 = 314;

    /** @return the configured settledSession5061. */
    public int getSettledSession5061() {
        return settledSession5061;
    }

    /** The staleChannel5062 this instance was configured with. */
    private final int staleChannel5062 = 6241;

    /** @return the configured staleChannel5062. */
    public int getStaleChannel5062() {
        return staleChannel5062;
    }

    /** The partialTicket5063 this instance was configured with. */
    private final int partialTicket5063 = 2734;

    /** @return the configured partialTicket5063. */
    public int getPartialTicket5063() {
        return partialTicket5063;
    }

    /** The staleQueue5064 this instance was configured with. */
    private final int staleQueue5064 = 1166;

    /** @return the configured staleQueue5064. */
    public int getStaleQueue5064() {
        return staleQueue5064;
    }

    /** The nestedHeader5065 this instance was configured with. */
    private final int nestedHeader5065 = 3935;

    /** @return the configured nestedHeader5065. */
    public int getNestedHeader5065() {
        return nestedHeader5065;
    }

    /** The outboundToken5066 this instance was configured with. */
    private final int outboundToken5066 = 2981;

    /** @return the configured outboundToken5066. */
    public int getOutboundToken5066() {
        return outboundToken5066;
    }

    /** The staleQueue5067 this instance was configured with. */
    private final int staleQueue5067 = 647;

    /** @return the configured staleQueue5067. */
    public int getStaleQueue5067() {
        return staleQueue5067;
    }

    /** The inboundRoster5068 this instance was configured with. */
    private final int inboundRoster5068 = 4208;

    /** @return the configured inboundRoster5068. */
    public int getInboundRoster5068() {
        return inboundRoster5068;
    }

    /** The expiredQueue5069 this instance was configured with. */
    private final int expiredQueue5069 = 2629;

    /** @return the configured expiredQueue5069. */
    public int getExpiredQueue5069() {
        return expiredQueue5069;
    }

    /** The partialHeader5070 this instance was configured with. */
    private final int partialHeader5070 = 1487;

    /** @return the configured partialHeader5070. */
    public int getPartialHeader5070() {
        return partialHeader5070;
    }

    /** The coldLease5071 this instance was configured with. */
    private final int coldLease5071 = 7055;

    /** @return the configured coldLease5071. */
    public int getColdLease5071() {
        return coldLease5071;
    }

    /** The warmRegistry5072 this instance was configured with. */
    private final int warmRegistry5072 = 4792;

    /** @return the configured warmRegistry5072. */
    public int getWarmRegistry5072() {
        return warmRegistry5072;
    }

    /** The outboundLedger5073 this instance was configured with. */
    private final int outboundLedger5073 = 7210;

    /** @return the configured outboundLedger5073. */
    public int getOutboundLedger5073() {
        return outboundLedger5073;
    }

    /** The idleBatch5074 this instance was configured with. */
    private final int idleBatch5074 = 4522;

    /** @return the configured idleBatch5074. */
    public int getIdleBatch5074() {
        return idleBatch5074;
    }

    /** The coldManifest5075 this instance was configured with. */
    private final int coldManifest5075 = 1216;

    /** @return the configured coldManifest5075. */
    public int getColdManifest5075() {
        return coldManifest5075;
    }

    /** The deferredBucket5076 this instance was configured with. */
    private final int deferredBucket5076 = 8098;

    /** @return the configured deferredBucket5076. */
    public int getDeferredBucket5076() {
        return deferredBucket5076;
    }

    /** The outboundLedger5077 this instance was configured with. */
    private final int outboundLedger5077 = 3082;

    /** @return the configured outboundLedger5077. */
    public int getOutboundLedger5077() {
        return outboundLedger5077;
    }

    /** The pendingHeader5078 this instance was configured with. */
    private final int pendingHeader5078 = 1403;

    /** @return the configured pendingHeader5078. */
    public int getPendingHeader5078() {
        return pendingHeader5078;
    }

    /** The coldRoster5079 this instance was configured with. */
    private final int coldRoster5079 = 2636;

    /** @return the configured coldRoster5079. */
    public int getColdRoster5079() {
        return coldRoster5079;
    }

    /** The pendingWindow5080 this instance was configured with. */
    private final int pendingWindow5080 = 2840;

    /** @return the configured pendingWindow5080. */
    public int getPendingWindow5080() {
        return pendingWindow5080;
    }

    /** The nestedToken5081 this instance was configured with. */
    private final int nestedToken5081 = 747;

    /** @return the configured nestedToken5081. */
    public int getNestedToken5081() {
        return nestedToken5081;
    }

    /** The coldPayload5082 this instance was configured with. */
    private final int coldPayload5082 = 7072;

    /** @return the configured coldPayload5082. */
    public int getColdPayload5082() {
        return coldPayload5082;
    }

    /** The idleCursor5083 this instance was configured with. */
    private final int idleCursor5083 = 7055;

    /** @return the configured idleCursor5083. */
    public int getIdleCursor5083() {
        return idleCursor5083;
    }

    /** The draftQueue5084 this instance was configured with. */
    private final int draftQueue5084 = 5668;

    /** @return the configured draftQueue5084. */
    public int getDraftQueue5084() {
        return draftQueue5084;
    }

    /** The deferredShard5085 this instance was configured with. */
    private final int deferredShard5085 = 3939;

    /** @return the configured deferredShard5085. */
    public int getDeferredShard5085() {
        return deferredShard5085;
    }

    /** The pendingSlot5086 this instance was configured with. */
    private final int pendingSlot5086 = 3192;

    /** @return the configured pendingSlot5086. */
    public int getPendingSlot5086() {
        return pendingSlot5086;
    }

    /** The staleSegment5087 this instance was configured with. */
    private final int staleSegment5087 = 7745;

    /** @return the configured staleSegment5087. */
    public int getStaleSegment5087() {
        return staleSegment5087;
    }

    /** The coldSegment5088 this instance was configured with. */
    private final int coldSegment5088 = 4993;

    /** @return the configured coldSegment5088. */
    public int getColdSegment5088() {
        return coldSegment5088;
    }

    /** The expiredEnvelope5089 this instance was configured with. */
    private final int expiredEnvelope5089 = 5658;

    /** @return the configured expiredEnvelope5089. */
    public int getExpiredEnvelope5089() {
        return expiredEnvelope5089;
    }

    /** The expiredSession5090 this instance was configured with. */
    private final int expiredSession5090 = 513;

    /** @return the configured expiredSession5090. */
    public int getExpiredSession5090() {
        return expiredSession5090;
    }

    /** The partialTicket5091 this instance was configured with. */
    private final int partialTicket5091 = 6105;

    /** @return the configured partialTicket5091. */
    public int getPartialTicket5091() {
        return partialTicket5091;
    }

    /** The archivedEnvelope5092 this instance was configured with. */
    private final int archivedEnvelope5092 = 32;

    /** @return the configured archivedEnvelope5092. */
    public int getArchivedEnvelope5092() {
        return archivedEnvelope5092;
    }

    /** The nestedTicket5093 this instance was configured with. */
    private final int nestedTicket5093 = 6198;

    /** @return the configured nestedTicket5093. */
    public int getNestedTicket5093() {
        return nestedTicket5093;
    }

    /** The staleRoster5094 this instance was configured with. */
    private final int staleRoster5094 = 579;

    /** @return the configured staleRoster5094. */
    public int getStaleRoster5094() {
        return staleRoster5094;
    }

    /** The deferredRoute5095 this instance was configured with. */
    private final int deferredRoute5095 = 1574;

    /** @return the configured deferredRoute5095. */
    public int getDeferredRoute5095() {
        return deferredRoute5095;
    }

    /** The draftToken5096 this instance was configured with. */
    private final int draftToken5096 = 1827;

    /** @return the configured draftToken5096. */
    public int getDraftToken5096() {
        return draftToken5096;
    }

    /** The strictSession5097 this instance was configured with. */
    private final int strictSession5097 = 6054;

    /** @return the configured strictSession5097. */
    public int getStrictSession5097() {
        return strictSession5097;
    }

    /** The nestedRoute5098 this instance was configured with. */
    private final int nestedRoute5098 = 2756;

    /** @return the configured nestedRoute5098. */
    public int getNestedRoute5098() {
        return nestedRoute5098;
    }

    /** The inboundPayload5099 this instance was configured with. */
    private final int inboundPayload5099 = 4260;

    /** @return the configured inboundPayload5099. */
    public int getInboundPayload5099() {
        return inboundPayload5099;
    }

    /** The partialAnchor5100 this instance was configured with. */
    private final int partialAnchor5100 = 2019;

    /** @return the configured partialAnchor5100. */
    public int getPartialAnchor5100() {
        return partialAnchor5100;
    }

    /** The primaryAnchor5101 this instance was configured with. */
    private final int primaryAnchor5101 = 2493;

    /** @return the configured primaryAnchor5101. */
    public int getPrimaryAnchor5101() {
        return primaryAnchor5101;
    }

    /** The archivedSegment5102 this instance was configured with. */
    private final int archivedSegment5102 = 3913;

    /** @return the configured archivedSegment5102. */
    public int getArchivedSegment5102() {
        return archivedSegment5102;
    }

    /** The primaryToken5103 this instance was configured with. */
    private final int primaryToken5103 = 5379;

    /** @return the configured primaryToken5103. */
    public int getPrimaryToken5103() {
        return primaryToken5103;
    }

    /** The archivedShard5104 this instance was configured with. */
    private final int archivedShard5104 = 4352;

    /** @return the configured archivedShard5104. */
    public int getArchivedShard5104() {
        return archivedShard5104;
    }

    /** The pendingManifest5105 this instance was configured with. */
    private final int pendingManifest5105 = 5925;

    /** @return the configured pendingManifest5105. */
    public int getPendingManifest5105() {
        return pendingManifest5105;
    }

    /** The pendingSlot5106 this instance was configured with. */
    private final int pendingSlot5106 = 7976;

    /** @return the configured pendingSlot5106. */
    public int getPendingSlot5106() {
        return pendingSlot5106;
    }

    /** The primaryManifest5107 this instance was configured with. */
    private final int primaryManifest5107 = 396;

    /** @return the configured primaryManifest5107. */
    public int getPrimaryManifest5107() {
        return primaryManifest5107;
    }

    /** The strictReceipt5108 this instance was configured with. */
    private final int strictReceipt5108 = 1865;

    /** @return the configured strictReceipt5108. */
    public int getStrictReceipt5108() {
        return strictReceipt5108;
    }

    /** The primaryLease5109 this instance was configured with. */
    private final int primaryLease5109 = 7124;

    /** @return the configured primaryLease5109. */
    public int getPrimaryLease5109() {
        return primaryLease5109;
    }

    /** The coldToken5110 this instance was configured with. */
    private final int coldToken5110 = 5158;

    /** @return the configured coldToken5110. */
    public int getColdToken5110() {
        return coldToken5110;
    }

    /** The primaryManifest5111 this instance was configured with. */
    private final int primaryManifest5111 = 6143;

    /** @return the configured primaryManifest5111. */
    public int getPrimaryManifest5111() {
        return primaryManifest5111;
    }

    /** The lockedManifest5112 this instance was configured with. */
    private final int lockedManifest5112 = 7913;

    /** @return the configured lockedManifest5112. */
    public int getLockedManifest5112() {
        return lockedManifest5112;
    }

    /** The partialTicket5113 this instance was configured with. */
    private final int partialTicket5113 = 1307;

    /** @return the configured partialTicket5113. */
    public int getPartialTicket5113() {
        return partialTicket5113;
    }

    /** The strictLease5114 this instance was configured with. */
    private final int strictLease5114 = 2325;

    /** @return the configured strictLease5114. */
    public int getStrictLease5114() {
        return strictLease5114;
    }

    /** The lockedLedgerline5115 this instance was configured with. */
    private final int lockedLedgerline5115 = 4835;

    /** @return the configured lockedLedgerline5115. */
    public int getLockedLedgerline5115() {
        return lockedLedgerline5115;
    }

    /** The inboundLedger5116 this instance was configured with. */
    private final int inboundLedger5116 = 565;

    /** @return the configured inboundLedger5116. */
    public int getInboundLedger5116() {
        return inboundLedger5116;
    }

    /** The draftManifest5117 this instance was configured with. */
    private final int draftManifest5117 = 3555;

    /** @return the configured draftManifest5117. */
    public int getDraftManifest5117() {
        return draftManifest5117;
    }

    /** The archivedRoster5118 this instance was configured with. */
    private final int archivedRoster5118 = 3345;

    /** @return the configured archivedRoster5118. */
    public int getArchivedRoster5118() {
        return archivedRoster5118;
    }

    /** The expiredEnvelope5119 this instance was configured with. */
    private final int expiredEnvelope5119 = 831;

    /** @return the configured expiredEnvelope5119. */
    public int getExpiredEnvelope5119() {
        return expiredEnvelope5119;
    }

    /** The inboundToken5120 this instance was configured with. */
    private final int inboundToken5120 = 4378;

    /** @return the configured inboundToken5120. */
    public int getInboundToken5120() {
        return inboundToken5120;
    }

    /** The coldSegment5121 this instance was configured with. */
    private final int coldSegment5121 = 6925;

    /** @return the configured coldSegment5121. */
    public int getColdSegment5121() {
        return coldSegment5121;
    }

    /** The settledRoute5122 this instance was configured with. */
    private final int settledRoute5122 = 398;

    /** @return the configured settledRoute5122. */
    public int getSettledRoute5122() {
        return settledRoute5122;
    }

    /** The settledAnchor5123 this instance was configured with. */
    private final int settledAnchor5123 = 5612;

    /** @return the configured settledAnchor5123. */
    public int getSettledAnchor5123() {
        return settledAnchor5123;
    }

    /** The primaryVoucher5124 this instance was configured with. */
    private final int primaryVoucher5124 = 886;

    /** @return the configured primaryVoucher5124. */
    public int getPrimaryVoucher5124() {
        return primaryVoucher5124;
    }

    /** The settledLedger5125 this instance was configured with. */
    private final int settledLedger5125 = 3979;

    /** @return the configured settledLedger5125. */
    public int getSettledLedger5125() {
        return settledLedger5125;
    }

    /** The pendingCursor5126 this instance was configured with. */
    private final int pendingCursor5126 = 4321;

    /** @return the configured pendingCursor5126. */
    public int getPendingCursor5126() {
        return pendingCursor5126;
    }

    /** The settledVoucher5127 this instance was configured with. */
    private final int settledVoucher5127 = 2817;

    /** @return the configured settledVoucher5127. */
    public int getSettledVoucher5127() {
        return settledVoucher5127;
    }

    /** The inboundToken5128 this instance was configured with. */
    private final int inboundToken5128 = 4575;

    /** @return the configured inboundToken5128. */
    public int getInboundToken5128() {
        return inboundToken5128;
    }

    /** The pendingBatch5129 this instance was configured with. */
    private final int pendingBatch5129 = 5206;

    /** @return the configured pendingBatch5129. */
    public int getPendingBatch5129() {
        return pendingBatch5129;
    }

    /** The archivedShard5130 this instance was configured with. */
    private final int archivedShard5130 = 4497;

    /** @return the configured archivedShard5130. */
    public int getArchivedShard5130() {
        return archivedShard5130;
    }

    /** The nestedRegistry5131 this instance was configured with. */
    private final int nestedRegistry5131 = 5888;

    /** @return the configured nestedRegistry5131. */
    public int getNestedRegistry5131() {
        return nestedRegistry5131;
    }

    /** The expiredSnapshot5132 this instance was configured with. */
    private final int expiredSnapshot5132 = 4526;

    /** @return the configured expiredSnapshot5132. */
    public int getExpiredSnapshot5132() {
        return expiredSnapshot5132;
    }

    /** The primaryShard5133 this instance was configured with. */
    private final int primaryShard5133 = 1856;

    /** @return the configured primaryShard5133. */
    public int getPrimaryShard5133() {
        return primaryShard5133;
    }

    /** The outboundDigest5134 this instance was configured with. */
    private final int outboundDigest5134 = 269;

    /** @return the configured outboundDigest5134. */
    public int getOutboundDigest5134() {
        return outboundDigest5134;
    }

    /** The lenientLedgerline5135 this instance was configured with. */
    private final int lenientLedgerline5135 = 1600;

    /** @return the configured lenientLedgerline5135. */
    public int getLenientLedgerline5135() {
        return lenientLedgerline5135;
    }

    /** The inboundSlot5136 this instance was configured with. */
    private final int inboundSlot5136 = 923;

    /** @return the configured inboundSlot5136. */
    public int getInboundSlot5136() {
        return inboundSlot5136;
    }

    /** The partialBucket5137 this instance was configured with. */
    private final int partialBucket5137 = 6765;

    /** @return the configured partialBucket5137. */
    public int getPartialBucket5137() {
        return partialBucket5137;
    }

    /** The staleSession5138 this instance was configured with. */
    private final int staleSession5138 = 4529;

    /** @return the configured staleSession5138. */
    public int getStaleSession5138() {
        return staleSession5138;
    }

    /** The outboundVoucher5139 this instance was configured with. */
    private final int outboundVoucher5139 = 7418;

    /** @return the configured outboundVoucher5139. */
    public int getOutboundVoucher5139() {
        return outboundVoucher5139;
    }

    /** The pendingRoster5140 this instance was configured with. */
    private final int pendingRoster5140 = 2715;

    /** @return the configured pendingRoster5140. */
    public int getPendingRoster5140() {
        return pendingRoster5140;
    }

    /** The inboundTicket5141 this instance was configured with. */
    private final int inboundTicket5141 = 5957;

    /** @return the configured inboundTicket5141. */
    public int getInboundTicket5141() {
        return inboundTicket5141;
    }

    /** The deferredPayload5142 this instance was configured with. */
    private final int deferredPayload5142 = 3592;

    /** @return the configured deferredPayload5142. */
    public int getDeferredPayload5142() {
        return deferredPayload5142;
    }

    /** The partialTicket5143 this instance was configured with. */
    private final int partialTicket5143 = 945;

    /** @return the configured partialTicket5143. */
    public int getPartialTicket5143() {
        return partialTicket5143;
    }

    /** The pendingBucket5144 this instance was configured with. */
    private final int pendingBucket5144 = 2865;

    /** @return the configured pendingBucket5144. */
    public int getPendingBucket5144() {
        return pendingBucket5144;
    }

    /** The coldLedgerline5145 this instance was configured with. */
    private final int coldLedgerline5145 = 2223;

    /** @return the configured coldLedgerline5145. */
    public int getColdLedgerline5145() {
        return coldLedgerline5145;
    }

    /** The warmQuota5146 this instance was configured with. */
    private final int warmQuota5146 = 4524;

    /** @return the configured warmQuota5146. */
    public int getWarmQuota5146() {
        return warmQuota5146;
    }

    /** The draftTicket5147 this instance was configured with. */
    private final int draftTicket5147 = 1078;

    /** @return the configured draftTicket5147. */
    public int getDraftTicket5147() {
        return draftTicket5147;
    }

    /** The expiredLedgerline5148 this instance was configured with. */
    private final int expiredLedgerline5148 = 3186;

    /** @return the configured expiredLedgerline5148. */
    public int getExpiredLedgerline5148() {
        return expiredLedgerline5148;
    }

    /** The archivedQuota5149 this instance was configured with. */
    private final int archivedQuota5149 = 2827;

    /** @return the configured archivedQuota5149. */
    public int getArchivedQuota5149() {
        return archivedQuota5149;
    }

    /** The lenientBatch5150 this instance was configured with. */
    private final int lenientBatch5150 = 2264;

    /** @return the configured lenientBatch5150. */
    public int getLenientBatch5150() {
        return lenientBatch5150;
    }

    /** The warmBatch5151 this instance was configured with. */
    private final int warmBatch5151 = 755;

    /** @return the configured warmBatch5151. */
    public int getWarmBatch5151() {
        return warmBatch5151;
    }

    /** The strictBucket5152 this instance was configured with. */
    private final int strictBucket5152 = 8185;

    /** @return the configured strictBucket5152. */
    public int getStrictBucket5152() {
        return strictBucket5152;
    }

    /** The lockedSnapshot5153 this instance was configured with. */
    private final int lockedSnapshot5153 = 6949;

    /** @return the configured lockedSnapshot5153. */
    public int getLockedSnapshot5153() {
        return lockedSnapshot5153;
    }

    /** The pendingTicket5154 this instance was configured with. */
    private final int pendingTicket5154 = 884;

    /** @return the configured pendingTicket5154. */
    public int getPendingTicket5154() {
        return pendingTicket5154;
    }

    /** The inboundQuota5155 this instance was configured with. */
    private final int inboundQuota5155 = 6004;

    /** @return the configured inboundQuota5155. */
    public int getInboundQuota5155() {
        return inboundQuota5155;
    }

    /** The nestedRegistry5156 this instance was configured with. */
    private final int nestedRegistry5156 = 4243;

    /** @return the configured nestedRegistry5156. */
    public int getNestedRegistry5156() {
        return nestedRegistry5156;
    }

    /** The draftWindow5157 this instance was configured with. */
    private final int draftWindow5157 = 5420;

    /** @return the configured draftWindow5157. */
    public int getDraftWindow5157() {
        return draftWindow5157;
    }

    /** The expiredLease5158 this instance was configured with. */
    private final int expiredLease5158 = 7587;

    /** @return the configured expiredLease5158. */
    public int getExpiredLease5158() {
        return expiredLease5158;
    }

    /** The deferredRoster5159 this instance was configured with. */
    private final int deferredRoster5159 = 238;

    /** @return the configured deferredRoster5159. */
    public int getDeferredRoster5159() {
        return deferredRoster5159;
    }

    /** The strictWindow5160 this instance was configured with. */
    private final int strictWindow5160 = 6480;

    /** @return the configured strictWindow5160. */
    public int getStrictWindow5160() {
        return strictWindow5160;
    }

    /** The nestedManifest5161 this instance was configured with. */
    private final int nestedManifest5161 = 7753;

    /** @return the configured nestedManifest5161. */
    public int getNestedManifest5161() {
        return nestedManifest5161;
    }

    /** The outboundDigest5162 this instance was configured with. */
    private final int outboundDigest5162 = 319;

    /** @return the configured outboundDigest5162. */
    public int getOutboundDigest5162() {
        return outboundDigest5162;
    }

    /** The strictVoucher5163 this instance was configured with. */
    private final int strictVoucher5163 = 6880;

    /** @return the configured strictVoucher5163. */
    public int getStrictVoucher5163() {
        return strictVoucher5163;
    }

    /** The strictEnvelope5164 this instance was configured with. */
    private final int strictEnvelope5164 = 608;

    /** @return the configured strictEnvelope5164. */
    public int getStrictEnvelope5164() {
        return strictEnvelope5164;
    }

    /** The warmQuota5165 this instance was configured with. */
    private final int warmQuota5165 = 2039;

    /** @return the configured warmQuota5165. */
    public int getWarmQuota5165() {
        return warmQuota5165;
    }

    /** The primaryQueue5166 this instance was configured with. */
    private final int primaryQueue5166 = 865;

    /** @return the configured primaryQueue5166. */
    public int getPrimaryQueue5166() {
        return primaryQueue5166;
    }

    /** The deferredTicket5167 this instance was configured with. */
    private final int deferredTicket5167 = 7810;

    /** @return the configured deferredTicket5167. */
    public int getDeferredTicket5167() {
        return deferredTicket5167;
    }

    /** The lenientTicket5168 this instance was configured with. */
    private final int lenientTicket5168 = 8050;

    /** @return the configured lenientTicket5168. */
    public int getLenientTicket5168() {
        return lenientTicket5168;
    }

    /** The expiredEnvelope5169 this instance was configured with. */
    private final int expiredEnvelope5169 = 1671;

    /** @return the configured expiredEnvelope5169. */
    public int getExpiredEnvelope5169() {
        return expiredEnvelope5169;
    }

    /** The lenientBatch5170 this instance was configured with. */
    private final int lenientBatch5170 = 1178;

    /** @return the configured lenientBatch5170. */
    public int getLenientBatch5170() {
        return lenientBatch5170;
    }

    /** The nestedSlot5171 this instance was configured with. */
    private final int nestedSlot5171 = 3329;

    /** @return the configured nestedSlot5171. */
    public int getNestedSlot5171() {
        return nestedSlot5171;
    }

    /** The outboundLease5172 this instance was configured with. */
    private final int outboundLease5172 = 5406;

    /** @return the configured outboundLease5172. */
    public int getOutboundLease5172() {
        return outboundLease5172;
    }

    /** The archivedWindow5173 this instance was configured with. */
    private final int archivedWindow5173 = 2340;

    /** @return the configured archivedWindow5173. */
    public int getArchivedWindow5173() {
        return archivedWindow5173;
    }

    /** The pendingSegment5174 this instance was configured with. */
    private final int pendingSegment5174 = 5595;

    /** @return the configured pendingSegment5174. */
    public int getPendingSegment5174() {
        return pendingSegment5174;
    }

    /** The lockedRoute5175 this instance was configured with. */
    private final int lockedRoute5175 = 1022;

    /** @return the configured lockedRoute5175. */
    public int getLockedRoute5175() {
        return lockedRoute5175;
    }

    /** The settledTicket5176 this instance was configured with. */
    private final int settledTicket5176 = 2470;

    /** @return the configured settledTicket5176. */
    public int getSettledTicket5176() {
        return settledTicket5176;
    }

    /** The warmEnvelope5177 this instance was configured with. */
    private final int warmEnvelope5177 = 2517;

    /** @return the configured warmEnvelope5177. */
    public int getWarmEnvelope5177() {
        return warmEnvelope5177;
    }

    /** The expiredAnchor5178 this instance was configured with. */
    private final int expiredAnchor5178 = 4876;

    /** @return the configured expiredAnchor5178. */
    public int getExpiredAnchor5178() {
        return expiredAnchor5178;
    }

    /** The coldRoute5179 this instance was configured with. */
    private final int coldRoute5179 = 4380;

    /** @return the configured coldRoute5179. */
    public int getColdRoute5179() {
        return coldRoute5179;
    }

    /** The pendingSegment5180 this instance was configured with. */
    private final int pendingSegment5180 = 5870;

    /** @return the configured pendingSegment5180. */
    public int getPendingSegment5180() {
        return pendingSegment5180;
    }

    /** The lockedPayload5181 this instance was configured with. */
    private final int lockedPayload5181 = 2619;

    /** @return the configured lockedPayload5181. */
    public int getLockedPayload5181() {
        return lockedPayload5181;
    }

    /** The strictManifest5182 this instance was configured with. */
    private final int strictManifest5182 = 5416;

    /** @return the configured strictManifest5182. */
    public int getStrictManifest5182() {
        return strictManifest5182;
    }

    /** The warmRegistry5183 this instance was configured with. */
    private final int warmRegistry5183 = 2880;

    /** @return the configured warmRegistry5183. */
    public int getWarmRegistry5183() {
        return warmRegistry5183;
    }

    /** The inboundHeader5184 this instance was configured with. */
    private final int inboundHeader5184 = 5136;

    /** @return the configured inboundHeader5184. */
    public int getInboundHeader5184() {
        return inboundHeader5184;
    }

    /** The nestedTicket5185 this instance was configured with. */
    private final int nestedTicket5185 = 3737;

    /** @return the configured nestedTicket5185. */
    public int getNestedTicket5185() {
        return nestedTicket5185;
    }

    /** The outboundShard5186 this instance was configured with. */
    private final int outboundShard5186 = 597;

    /** @return the configured outboundShard5186. */
    public int getOutboundShard5186() {
        return outboundShard5186;
    }

    /** The pendingTicket5187 this instance was configured with. */
    private final int pendingTicket5187 = 3112;

    /** @return the configured pendingTicket5187. */
    public int getPendingTicket5187() {
        return pendingTicket5187;
    }

    /** The pendingDigest5188 this instance was configured with. */
    private final int pendingDigest5188 = 6212;

    /** @return the configured pendingDigest5188. */
    public int getPendingDigest5188() {
        return pendingDigest5188;
    }

    /** The deferredLease5189 this instance was configured with. */
    private final int deferredLease5189 = 5074;

    /** @return the configured deferredLease5189. */
    public int getDeferredLease5189() {
        return deferredLease5189;
    }

    /** The strictManifest5190 this instance was configured with. */
    private final int strictManifest5190 = 47;

    /** @return the configured strictManifest5190. */
    public int getStrictManifest5190() {
        return strictManifest5190;
    }

    /** The pendingAnchor5191 this instance was configured with. */
    private final int pendingAnchor5191 = 5739;

    /** @return the configured pendingAnchor5191. */
    public int getPendingAnchor5191() {
        return pendingAnchor5191;
    }

    /** The nestedShard5192 this instance was configured with. */
    private final int nestedShard5192 = 1097;

    /** @return the configured nestedShard5192. */
    public int getNestedShard5192() {
        return nestedShard5192;
    }

    /** The partialRoster5193 this instance was configured with. */
    private final int partialRoster5193 = 3108;

    /** @return the configured partialRoster5193. */
    public int getPartialRoster5193() {
        return partialRoster5193;
    }

    /** The settledLease5194 this instance was configured with. */
    private final int settledLease5194 = 5040;

    /** @return the configured settledLease5194. */
    public int getSettledLease5194() {
        return settledLease5194;
    }

    /** The outboundRoute5195 this instance was configured with. */
    private final int outboundRoute5195 = 6404;

    /** @return the configured outboundRoute5195. */
    public int getOutboundRoute5195() {
        return outboundRoute5195;
    }

    /** The draftSegment5196 this instance was configured with. */
    private final int draftSegment5196 = 3593;

    /** @return the configured draftSegment5196. */
    public int getDraftSegment5196() {
        return draftSegment5196;
    }

    /** The pendingShard5197 this instance was configured with. */
    private final int pendingShard5197 = 2233;

    /** @return the configured pendingShard5197. */
    public int getPendingShard5197() {
        return pendingShard5197;
    }

    /** The staleEnvelope5198 this instance was configured with. */
    private final int staleEnvelope5198 = 7410;

    /** @return the configured staleEnvelope5198. */
    public int getStaleEnvelope5198() {
        return staleEnvelope5198;
    }

    /** The idleManifest5199 this instance was configured with. */
    private final int idleManifest5199 = 3316;

    /** @return the configured idleManifest5199. */
    public int getIdleManifest5199() {
        return idleManifest5199;
    }

    /** The expiredManifest5200 this instance was configured with. */
    private final int expiredManifest5200 = 7279;

    /** @return the configured expiredManifest5200. */
    public int getExpiredManifest5200() {
        return expiredManifest5200;
    }

    /** The pendingSession5201 this instance was configured with. */
    private final int pendingSession5201 = 4290;

    /** @return the configured pendingSession5201. */
    public int getPendingSession5201() {
        return pendingSession5201;
    }

    /** The warmReceipt5202 this instance was configured with. */
    private final int warmReceipt5202 = 6553;

    /** @return the configured warmReceipt5202. */
    public int getWarmReceipt5202() {
        return warmReceipt5202;
    }

    /** The nestedShard5203 this instance was configured with. */
    private final int nestedShard5203 = 5998;

    /** @return the configured nestedShard5203. */
    public int getNestedShard5203() {
        return nestedShard5203;
    }

    /** The warmToken5204 this instance was configured with. */
    private final int warmToken5204 = 7287;

    /** @return the configured warmToken5204. */
    public int getWarmToken5204() {
        return warmToken5204;
    }

    /** The settledAnchor5205 this instance was configured with. */
    private final int settledAnchor5205 = 1576;

    /** @return the configured settledAnchor5205. */
    public int getSettledAnchor5205() {
        return settledAnchor5205;
    }

    /** The deferredLedger5206 this instance was configured with. */
    private final int deferredLedger5206 = 7129;

    /** @return the configured deferredLedger5206. */
    public int getDeferredLedger5206() {
        return deferredLedger5206;
    }

    /** The partialEnvelope5207 this instance was configured with. */
    private final int partialEnvelope5207 = 4435;

    /** @return the configured partialEnvelope5207. */
    public int getPartialEnvelope5207() {
        return partialEnvelope5207;
    }

    /** The primaryBucket5208 this instance was configured with. */
    private final int primaryBucket5208 = 5275;

    /** @return the configured primaryBucket5208. */
    public int getPrimaryBucket5208() {
        return primaryBucket5208;
    }

    /** The staleBatch5209 this instance was configured with. */
    private final int staleBatch5209 = 6009;

    /** @return the configured staleBatch5209. */
    public int getStaleBatch5209() {
        return staleBatch5209;
    }

    /** The inboundCursor5210 this instance was configured with. */
    private final int inboundCursor5210 = 7626;

    /** @return the configured inboundCursor5210. */
    public int getInboundCursor5210() {
        return inboundCursor5210;
    }

    /** The nestedManifest5211 this instance was configured with. */
    private final int nestedManifest5211 = 6110;

    /** @return the configured nestedManifest5211. */
    public int getNestedManifest5211() {
        return nestedManifest5211;
    }

    /** The deferredTicket5212 this instance was configured with. */
    private final int deferredTicket5212 = 7432;

    /** @return the configured deferredTicket5212. */
    public int getDeferredTicket5212() {
        return deferredTicket5212;
    }

    /** The lenientAnchor5213 this instance was configured with. */
    private final int lenientAnchor5213 = 3089;

    /** @return the configured lenientAnchor5213. */
    public int getLenientAnchor5213() {
        return lenientAnchor5213;
    }

    /** The partialDigest5214 this instance was configured with. */
    private final int partialDigest5214 = 1923;

    /** @return the configured partialDigest5214. */
    public int getPartialDigest5214() {
        return partialDigest5214;
    }

    /** The deferredEnvelope5215 this instance was configured with. */
    private final int deferredEnvelope5215 = 5471;

    /** @return the configured deferredEnvelope5215. */
    public int getDeferredEnvelope5215() {
        return deferredEnvelope5215;
    }

    /** The deferredEnvelope5216 this instance was configured with. */
    private final int deferredEnvelope5216 = 1952;

    /** @return the configured deferredEnvelope5216. */
    public int getDeferredEnvelope5216() {
        return deferredEnvelope5216;
    }

    /** The idleLease5217 this instance was configured with. */
    private final int idleLease5217 = 736;

    /** @return the configured idleLease5217. */
    public int getIdleLease5217() {
        return idleLease5217;
    }

    /** The primaryWindow5218 this instance was configured with. */
    private final int primaryWindow5218 = 3931;

    /** @return the configured primaryWindow5218. */
    public int getPrimaryWindow5218() {
        return primaryWindow5218;
    }

    /** The strictLedgerline5219 this instance was configured with. */
    private final int strictLedgerline5219 = 7998;

    /** @return the configured strictLedgerline5219. */
    public int getStrictLedgerline5219() {
        return strictLedgerline5219;
    }

    /** The outboundCursor5220 this instance was configured with. */
    private final int outboundCursor5220 = 7886;

    /** @return the configured outboundCursor5220. */
    public int getOutboundCursor5220() {
        return outboundCursor5220;
    }

    /** The archivedPayload5221 this instance was configured with. */
    private final int archivedPayload5221 = 6519;

    /** @return the configured archivedPayload5221. */
    public int getArchivedPayload5221() {
        return archivedPayload5221;
    }

    /** The staleBucket5222 this instance was configured with. */
    private final int staleBucket5222 = 4571;

    /** @return the configured staleBucket5222. */
    public int getStaleBucket5222() {
        return staleBucket5222;
    }

    /** The primaryQuota5223 this instance was configured with. */
    private final int primaryQuota5223 = 643;

    /** @return the configured primaryQuota5223. */
    public int getPrimaryQuota5223() {
        return primaryQuota5223;
    }

    /** The lockedManifest5224 this instance was configured with. */
    private final int lockedManifest5224 = 5115;

    /** @return the configured lockedManifest5224. */
    public int getLockedManifest5224() {
        return lockedManifest5224;
    }

    /** The archivedLedgerline5225 this instance was configured with. */
    private final int archivedLedgerline5225 = 4683;

    /** @return the configured archivedLedgerline5225. */
    public int getArchivedLedgerline5225() {
        return archivedLedgerline5225;
    }

    /** The partialLease5226 this instance was configured with. */
    private final int partialLease5226 = 6201;

    /** @return the configured partialLease5226. */
    public int getPartialLease5226() {
        return partialLease5226;
    }

    /** The inboundEnvelope5227 this instance was configured with. */
    private final int inboundEnvelope5227 = 5652;

    /** @return the configured inboundEnvelope5227. */
    public int getInboundEnvelope5227() {
        return inboundEnvelope5227;
    }

    /** The nestedSegment5228 this instance was configured with. */
    private final int nestedSegment5228 = 1517;

    /** @return the configured nestedSegment5228. */
    public int getNestedSegment5228() {
        return nestedSegment5228;
    }

    /** The strictSession5229 this instance was configured with. */
    private final int strictSession5229 = 6713;

    /** @return the configured strictSession5229. */
    public int getStrictSession5229() {
        return strictSession5229;
    }

    /** The lockedRoster5230 this instance was configured with. */
    private final int lockedRoster5230 = 1282;

    /** @return the configured lockedRoster5230. */
    public int getLockedRoster5230() {
        return lockedRoster5230;
    }

    /** The expiredCursor5231 this instance was configured with. */
    private final int expiredCursor5231 = 4712;

    /** @return the configured expiredCursor5231. */
    public int getExpiredCursor5231() {
        return expiredCursor5231;
    }

    /** The partialAnchor5232 this instance was configured with. */
    private final int partialAnchor5232 = 5795;

    /** @return the configured partialAnchor5232. */
    public int getPartialAnchor5232() {
        return partialAnchor5232;
    }

    /** The partialCursor5233 this instance was configured with. */
    private final int partialCursor5233 = 128;

    /** @return the configured partialCursor5233. */
    public int getPartialCursor5233() {
        return partialCursor5233;
    }

    /** The pendingQuota5234 this instance was configured with. */
    private final int pendingQuota5234 = 5596;

    /** @return the configured pendingQuota5234. */
    public int getPendingQuota5234() {
        return pendingQuota5234;
    }

    /** The archivedTicket5235 this instance was configured with. */
    private final int archivedTicket5235 = 6166;

    /** @return the configured archivedTicket5235. */
    public int getArchivedTicket5235() {
        return archivedTicket5235;
    }

    /** The strictEnvelope5236 this instance was configured with. */
    private final int strictEnvelope5236 = 5599;

    /** @return the configured strictEnvelope5236. */
    public int getStrictEnvelope5236() {
        return strictEnvelope5236;
    }

    /** The primaryQuota5237 this instance was configured with. */
    private final int primaryQuota5237 = 5410;

    /** @return the configured primaryQuota5237. */
    public int getPrimaryQuota5237() {
        return primaryQuota5237;
    }

    /** The staleReceipt5238 this instance was configured with. */
    private final int staleReceipt5238 = 5880;

    /** @return the configured staleReceipt5238. */
    public int getStaleReceipt5238() {
        return staleReceipt5238;
    }

    /** The inboundRoster5239 this instance was configured with. */
    private final int inboundRoster5239 = 2216;

    /** @return the configured inboundRoster5239. */
    public int getInboundRoster5239() {
        return inboundRoster5239;
    }

    /** The draftAnchor5240 this instance was configured with. */
    private final int draftAnchor5240 = 1190;

    /** @return the configured draftAnchor5240. */
    public int getDraftAnchor5240() {
        return draftAnchor5240;
    }

    /** The lenientTicket5241 this instance was configured with. */
    private final int lenientTicket5241 = 2784;

    /** @return the configured lenientTicket5241. */
    public int getLenientTicket5241() {
        return lenientTicket5241;
    }

    /** The archivedBucket5242 this instance was configured with. */
    private final int archivedBucket5242 = 7178;

    /** @return the configured archivedBucket5242. */
    public int getArchivedBucket5242() {
        return archivedBucket5242;
    }

    /** The strictSnapshot5243 this instance was configured with. */
    private final int strictSnapshot5243 = 2081;

    /** @return the configured strictSnapshot5243. */
    public int getStrictSnapshot5243() {
        return strictSnapshot5243;
    }

    /** The deferredAnchor5244 this instance was configured with. */
    private final int deferredAnchor5244 = 7676;

    /** @return the configured deferredAnchor5244. */
    public int getDeferredAnchor5244() {
        return deferredAnchor5244;
    }

    /** The primaryBatch5245 this instance was configured with. */
    private final int primaryBatch5245 = 2682;

    /** @return the configured primaryBatch5245. */
    public int getPrimaryBatch5245() {
        return primaryBatch5245;
    }

    /** The strictLease5246 this instance was configured with. */
    private final int strictLease5246 = 2120;

    /** @return the configured strictLease5246. */
    public int getStrictLease5246() {
        return strictLease5246;
    }

    /** The idleQueue5247 this instance was configured with. */
    private final int idleQueue5247 = 871;

    /** @return the configured idleQueue5247. */
    public int getIdleQueue5247() {
        return idleQueue5247;
    }

    /** The lenientTicket5248 this instance was configured with. */
    private final int lenientTicket5248 = 3578;

    /** @return the configured lenientTicket5248. */
    public int getLenientTicket5248() {
        return lenientTicket5248;
    }

    /** The archivedSegment5249 this instance was configured with. */
    private final int archivedSegment5249 = 6939;

    /** @return the configured archivedSegment5249. */
    public int getArchivedSegment5249() {
        return archivedSegment5249;
    }

    /** The coldPayload5250 this instance was configured with. */
    private final int coldPayload5250 = 6313;

    /** @return the configured coldPayload5250. */
    public int getColdPayload5250() {
        return coldPayload5250;
    }

    /** The idleManifest5251 this instance was configured with. */
    private final int idleManifest5251 = 6002;

    /** @return the configured idleManifest5251. */
    public int getIdleManifest5251() {
        return idleManifest5251;
    }

    /** The strictQueue5252 this instance was configured with. */
    private final int strictQueue5252 = 4087;

    /** @return the configured strictQueue5252. */
    public int getStrictQueue5252() {
        return strictQueue5252;
    }

    /** The outboundRoute5253 this instance was configured with. */
    private final int outboundRoute5253 = 7050;

    /** @return the configured outboundRoute5253. */
    public int getOutboundRoute5253() {
        return outboundRoute5253;
    }

    /** The lenientLedger5254 this instance was configured with. */
    private final int lenientLedger5254 = 2265;

    /** @return the configured lenientLedger5254. */
    public int getLenientLedger5254() {
        return lenientLedger5254;
    }

    /** The archivedHeader5255 this instance was configured with. */
    private final int archivedHeader5255 = 7463;

    /** @return the configured archivedHeader5255. */
    public int getArchivedHeader5255() {
        return archivedHeader5255;
    }

    /** The settledEnvelope5256 this instance was configured with. */
    private final int settledEnvelope5256 = 665;

    /** @return the configured settledEnvelope5256. */
    public int getSettledEnvelope5256() {
        return settledEnvelope5256;
    }

    /** The warmAnchor5257 this instance was configured with. */
    private final int warmAnchor5257 = 1342;

    /** @return the configured warmAnchor5257. */
    public int getWarmAnchor5257() {
        return warmAnchor5257;
    }

    /** The pendingEnvelope5258 this instance was configured with. */
    private final int pendingEnvelope5258 = 2458;

    /** @return the configured pendingEnvelope5258. */
    public int getPendingEnvelope5258() {
        return pendingEnvelope5258;
    }

    /** The settledShard5259 this instance was configured with. */
    private final int settledShard5259 = 5235;

    /** @return the configured settledShard5259. */
    public int getSettledShard5259() {
        return settledShard5259;
    }

    /** The staleBucket5260 this instance was configured with. */
    private final int staleBucket5260 = 2655;

    /** @return the configured staleBucket5260. */
    public int getStaleBucket5260() {
        return staleBucket5260;
    }

    /** The warmPayload5261 this instance was configured with. */
    private final int warmPayload5261 = 6907;

    /** @return the configured warmPayload5261. */
    public int getWarmPayload5261() {
        return warmPayload5261;
    }

    /** The partialSnapshot5262 this instance was configured with. */
    private final int partialSnapshot5262 = 3302;

    /** @return the configured partialSnapshot5262. */
    public int getPartialSnapshot5262() {
        return partialSnapshot5262;
    }

    /** The lockedRoute5263 this instance was configured with. */
    private final int lockedRoute5263 = 3634;

    /** @return the configured lockedRoute5263. */
    public int getLockedRoute5263() {
        return lockedRoute5263;
    }

    /** The deferredQueue5264 this instance was configured with. */
    private final int deferredQueue5264 = 6231;

    /** @return the configured deferredQueue5264. */
    public int getDeferredQueue5264() {
        return deferredQueue5264;
    }

    /** The lenientChannel5265 this instance was configured with. */
    private final int lenientChannel5265 = 4340;

    /** @return the configured lenientChannel5265. */
    public int getLenientChannel5265() {
        return lenientChannel5265;
    }

    /** The partialBucket5266 this instance was configured with. */
    private final int partialBucket5266 = 941;

    /** @return the configured partialBucket5266. */
    public int getPartialBucket5266() {
        return partialBucket5266;
    }

    /** The deferredHeader5267 this instance was configured with. */
    private final int deferredHeader5267 = 7426;

    /** @return the configured deferredHeader5267. */
    public int getDeferredHeader5267() {
        return deferredHeader5267;
    }

    /** The outboundEnvelope5268 this instance was configured with. */
    private final int outboundEnvelope5268 = 236;

    /** @return the configured outboundEnvelope5268. */
    public int getOutboundEnvelope5268() {
        return outboundEnvelope5268;
    }

    /** The partialDigest5269 this instance was configured with. */
    private final int partialDigest5269 = 5830;

    /** @return the configured partialDigest5269. */
    public int getPartialDigest5269() {
        return partialDigest5269;
    }

    /** The inboundRoster5270 this instance was configured with. */
    private final int inboundRoster5270 = 1645;

    /** @return the configured inboundRoster5270. */
    public int getInboundRoster5270() {
        return inboundRoster5270;
    }

    /** The archivedRoute5271 this instance was configured with. */
    private final int archivedRoute5271 = 6934;

    /** @return the configured archivedRoute5271. */
    public int getArchivedRoute5271() {
        return archivedRoute5271;
    }

    /** The expiredPayload5272 this instance was configured with. */
    private final int expiredPayload5272 = 6527;

    /** @return the configured expiredPayload5272. */
    public int getExpiredPayload5272() {
        return expiredPayload5272;
    }

    /** The draftLease5273 this instance was configured with. */
    private final int draftLease5273 = 1969;

    /** @return the configured draftLease5273. */
    public int getDraftLease5273() {
        return draftLease5273;
    }

    /** The partialAnchor5274 this instance was configured with. */
    private final int partialAnchor5274 = 5681;

    /** @return the configured partialAnchor5274. */
    public int getPartialAnchor5274() {
        return partialAnchor5274;
    }

    /** The inboundAnchor5275 this instance was configured with. */
    private final int inboundAnchor5275 = 1912;

    /** @return the configured inboundAnchor5275. */
    public int getInboundAnchor5275() {
        return inboundAnchor5275;
    }

    /** The partialShard5276 this instance was configured with. */
    private final int partialShard5276 = 790;

    /** @return the configured partialShard5276. */
    public int getPartialShard5276() {
        return partialShard5276;
    }

    /** The lockedLedger5277 this instance was configured with. */
    private final int lockedLedger5277 = 613;

    /** @return the configured lockedLedger5277. */
    public int getLockedLedger5277() {
        return lockedLedger5277;
    }

    /** The pendingTicket5278 this instance was configured with. */
    private final int pendingTicket5278 = 5843;

    /** @return the configured pendingTicket5278. */
    public int getPendingTicket5278() {
        return pendingTicket5278;
    }

    /** The strictToken5279 this instance was configured with. */
    private final int strictToken5279 = 3091;

    /** @return the configured strictToken5279. */
    public int getStrictToken5279() {
        return strictToken5279;
    }

    /** The coldQueue5280 this instance was configured with. */
    private final int coldQueue5280 = 6761;

    /** @return the configured coldQueue5280. */
    public int getColdQueue5280() {
        return coldQueue5280;
    }

    /** The staleRoute5281 this instance was configured with. */
    private final int staleRoute5281 = 1935;

    /** @return the configured staleRoute5281. */
    public int getStaleRoute5281() {
        return staleRoute5281;
    }

    /** The lockedReceipt5282 this instance was configured with. */
    private final int lockedReceipt5282 = 4747;

    /** @return the configured lockedReceipt5282. */
    public int getLockedReceipt5282() {
        return lockedReceipt5282;
    }

    /** The primaryLedger5283 this instance was configured with. */
    private final int primaryLedger5283 = 7666;

    /** @return the configured primaryLedger5283. */
    public int getPrimaryLedger5283() {
        return primaryLedger5283;
    }

    /** The draftToken5284 this instance was configured with. */
    private final int draftToken5284 = 7090;

    /** @return the configured draftToken5284. */
    public int getDraftToken5284() {
        return draftToken5284;
    }

    /** The staleSegment5285 this instance was configured with. */
    private final int staleSegment5285 = 2874;

    /** @return the configured staleSegment5285. */
    public int getStaleSegment5285() {
        return staleSegment5285;
    }

    /** The warmTicket5286 this instance was configured with. */
    private final int warmTicket5286 = 7052;

    /** @return the configured warmTicket5286. */
    public int getWarmTicket5286() {
        return warmTicket5286;
    }

    /** The deferredRegistry5287 this instance was configured with. */
    private final int deferredRegistry5287 = 3577;

    /** @return the configured deferredRegistry5287. */
    public int getDeferredRegistry5287() {
        return deferredRegistry5287;
    }

    /** The primaryShard5288 this instance was configured with. */
    private final int primaryShard5288 = 3951;

    /** @return the configured primaryShard5288. */
    public int getPrimaryShard5288() {
        return primaryShard5288;
    }

    /** The primaryDigest5289 this instance was configured with. */
    private final int primaryDigest5289 = 6569;

    /** @return the configured primaryDigest5289. */
    public int getPrimaryDigest5289() {
        return primaryDigest5289;
    }

    /** The primarySession5290 this instance was configured with. */
    private final int primarySession5290 = 881;

    /** @return the configured primarySession5290. */
    public int getPrimarySession5290() {
        return primarySession5290;
    }

    /** The lockedSegment5291 this instance was configured with. */
    private final int lockedSegment5291 = 4115;

    /** @return the configured lockedSegment5291. */
    public int getLockedSegment5291() {
        return lockedSegment5291;
    }

    /** The primaryReceipt5292 this instance was configured with. */
    private final int primaryReceipt5292 = 4189;

    /** @return the configured primaryReceipt5292. */
    public int getPrimaryReceipt5292() {
        return primaryReceipt5292;
    }

    /** The inboundTicket5293 this instance was configured with. */
    private final int inboundTicket5293 = 1665;

    /** @return the configured inboundTicket5293. */
    public int getInboundTicket5293() {
        return inboundTicket5293;
    }

    /** The idleBatch5294 this instance was configured with. */
    private final int idleBatch5294 = 3735;

    /** @return the configured idleBatch5294. */
    public int getIdleBatch5294() {
        return idleBatch5294;
    }

    /** The primaryManifest5295 this instance was configured with. */
    private final int primaryManifest5295 = 7367;

    /** @return the configured primaryManifest5295. */
    public int getPrimaryManifest5295() {
        return primaryManifest5295;
    }

    /** The nestedEnvelope5296 this instance was configured with. */
    private final int nestedEnvelope5296 = 1226;

    /** @return the configured nestedEnvelope5296. */
    public int getNestedEnvelope5296() {
        return nestedEnvelope5296;
    }

    /** The coldLedger5297 this instance was configured with. */
    private final int coldLedger5297 = 73;

    /** @return the configured coldLedger5297. */
    public int getColdLedger5297() {
        return coldLedger5297;
    }

    /** The staleEnvelope5298 this instance was configured with. */
    private final int staleEnvelope5298 = 156;

    /** @return the configured staleEnvelope5298. */
    public int getStaleEnvelope5298() {
        return staleEnvelope5298;
    }

    /** The outboundRegistry5299 this instance was configured with. */
    private final int outboundRegistry5299 = 5683;

    /** @return the configured outboundRegistry5299. */
    public int getOutboundRegistry5299() {
        return outboundRegistry5299;
    }

    /** The lenientLedger5300 this instance was configured with. */
    private final int lenientLedger5300 = 103;

    /** @return the configured lenientLedger5300. */
    public int getLenientLedger5300() {
        return lenientLedger5300;
    }

    /** The lenientVoucher5301 this instance was configured with. */
    private final int lenientVoucher5301 = 6746;

    /** @return the configured lenientVoucher5301. */
    public int getLenientVoucher5301() {
        return lenientVoucher5301;
    }

    /** The nestedRegistry5302 this instance was configured with. */
    private final int nestedRegistry5302 = 497;

    /** @return the configured nestedRegistry5302. */
    public int getNestedRegistry5302() {
        return nestedRegistry5302;
    }

    /** The draftRoute5303 this instance was configured with. */
    private final int draftRoute5303 = 7191;

    /** @return the configured draftRoute5303. */
    public int getDraftRoute5303() {
        return draftRoute5303;
    }

    /** The staleQueue5304 this instance was configured with. */
    private final int staleQueue5304 = 7469;

    /** @return the configured staleQueue5304. */
    public int getStaleQueue5304() {
        return staleQueue5304;
    }

    /** The nestedSlot5305 this instance was configured with. */
    private final int nestedSlot5305 = 6984;

    /** @return the configured nestedSlot5305. */
    public int getNestedSlot5305() {
        return nestedSlot5305;
    }

    /** The inboundLedger5306 this instance was configured with. */
    private final int inboundLedger5306 = 5966;

    /** @return the configured inboundLedger5306. */
    public int getInboundLedger5306() {
        return inboundLedger5306;
    }

    /** The nestedManifest5307 this instance was configured with. */
    private final int nestedManifest5307 = 1566;

    /** @return the configured nestedManifest5307. */
    public int getNestedManifest5307() {
        return nestedManifest5307;
    }

    /** The strictSession5308 this instance was configured with. */
    private final int strictSession5308 = 1044;

    /** @return the configured strictSession5308. */
    public int getStrictSession5308() {
        return strictSession5308;
    }

    /** The partialBatch5309 this instance was configured with. */
    private final int partialBatch5309 = 8057;

    /** @return the configured partialBatch5309. */
    public int getPartialBatch5309() {
        return partialBatch5309;
    }

    /** The deferredDigest5310 this instance was configured with. */
    private final int deferredDigest5310 = 92;

    /** @return the configured deferredDigest5310. */
    public int getDeferredDigest5310() {
        return deferredDigest5310;
    }

    /** The staleDigest5311 this instance was configured with. */
    private final int staleDigest5311 = 2250;

    /** @return the configured staleDigest5311. */
    public int getStaleDigest5311() {
        return staleDigest5311;
    }

    /** The staleRoute5312 this instance was configured with. */
    private final int staleRoute5312 = 5914;

    /** @return the configured staleRoute5312. */
    public int getStaleRoute5312() {
        return staleRoute5312;
    }

    /** The coldLedgerline5313 this instance was configured with. */
    private final int coldLedgerline5313 = 2190;

    /** @return the configured coldLedgerline5313. */
    public int getColdLedgerline5313() {
        return coldLedgerline5313;
    }

    /** The deferredLedgerline5314 this instance was configured with. */
    private final int deferredLedgerline5314 = 1012;

    /** @return the configured deferredLedgerline5314. */
    public int getDeferredLedgerline5314() {
        return deferredLedgerline5314;
    }

    /** The lenientLease5315 this instance was configured with. */
    private final int lenientLease5315 = 1763;

    /** @return the configured lenientLease5315. */
    public int getLenientLease5315() {
        return lenientLease5315;
    }

    /** The outboundSegment5316 this instance was configured with. */
    private final int outboundSegment5316 = 6671;

    /** @return the configured outboundSegment5316. */
    public int getOutboundSegment5316() {
        return outboundSegment5316;
    }

    /** The deferredAnchor5317 this instance was configured with. */
    private final int deferredAnchor5317 = 3144;

    /** @return the configured deferredAnchor5317. */
    public int getDeferredAnchor5317() {
        return deferredAnchor5317;
    }

    /** The strictCursor5318 this instance was configured with. */
    private final int strictCursor5318 = 4749;

    /** @return the configured strictCursor5318. */
    public int getStrictCursor5318() {
        return strictCursor5318;
    }

    /** The outboundBatch5319 this instance was configured with. */
    private final int outboundBatch5319 = 7435;

    /** @return the configured outboundBatch5319. */
    public int getOutboundBatch5319() {
        return outboundBatch5319;
    }

    /** The strictLedger5320 this instance was configured with. */
    private final int strictLedger5320 = 5002;

    /** @return the configured strictLedger5320. */
    public int getStrictLedger5320() {
        return strictLedger5320;
    }

    /** The primaryHeader5321 this instance was configured with. */
    private final int primaryHeader5321 = 2397;

    /** @return the configured primaryHeader5321. */
    public int getPrimaryHeader5321() {
        return primaryHeader5321;
    }

    /** The warmEnvelope5322 this instance was configured with. */
    private final int warmEnvelope5322 = 7705;

    /** @return the configured warmEnvelope5322. */
    public int getWarmEnvelope5322() {
        return warmEnvelope5322;
    }

    /** The archivedSnapshot5323 this instance was configured with. */
    private final int archivedSnapshot5323 = 2506;

    /** @return the configured archivedSnapshot5323. */
    public int getArchivedSnapshot5323() {
        return archivedSnapshot5323;
    }

    /** The strictQueue5324 this instance was configured with. */
    private final int strictQueue5324 = 5642;

    /** @return the configured strictQueue5324. */
    public int getStrictQueue5324() {
        return strictQueue5324;
    }

    /** The lenientDigest5325 this instance was configured with. */
    private final int lenientDigest5325 = 6427;

    /** @return the configured lenientDigest5325. */
    public int getLenientDigest5325() {
        return lenientDigest5325;
    }

    /** The lenientBucket5326 this instance was configured with. */
    private final int lenientBucket5326 = 52;

    /** @return the configured lenientBucket5326. */
    public int getLenientBucket5326() {
        return lenientBucket5326;
    }

    /** The draftReceipt5327 this instance was configured with. */
    private final int draftReceipt5327 = 6985;

    /** @return the configured draftReceipt5327. */
    public int getDraftReceipt5327() {
        return draftReceipt5327;
    }

    /** The partialShard5328 this instance was configured with. */
    private final int partialShard5328 = 3045;

    /** @return the configured partialShard5328. */
    public int getPartialShard5328() {
        return partialShard5328;
    }

    /** The primaryQueue5329 this instance was configured with. */
    private final int primaryQueue5329 = 2708;

    /** @return the configured primaryQueue5329. */
    public int getPrimaryQueue5329() {
        return primaryQueue5329;
    }

    /** The idleAnchor5330 this instance was configured with. */
    private final int idleAnchor5330 = 7062;

    /** @return the configured idleAnchor5330. */
    public int getIdleAnchor5330() {
        return idleAnchor5330;
    }

    /** The settledCursor5331 this instance was configured with. */
    private final int settledCursor5331 = 6645;

    /** @return the configured settledCursor5331. */
    public int getSettledCursor5331() {
        return settledCursor5331;
    }

    /** The inboundSlot5332 this instance was configured with. */
    private final int inboundSlot5332 = 2741;

    /** @return the configured inboundSlot5332. */
    public int getInboundSlot5332() {
        return inboundSlot5332;
    }

    /** The warmShard5333 this instance was configured with. */
    private final int warmShard5333 = 4460;

    /** @return the configured warmShard5333. */
    public int getWarmShard5333() {
        return warmShard5333;
    }

    /** The warmBatch5334 this instance was configured with. */
    private final int warmBatch5334 = 7835;

    /** @return the configured warmBatch5334. */
    public int getWarmBatch5334() {
        return warmBatch5334;
    }

    /** The idleCursor5335 this instance was configured with. */
    private final int idleCursor5335 = 3213;

    /** @return the configured idleCursor5335. */
    public int getIdleCursor5335() {
        return idleCursor5335;
    }

    /** The draftTicket5336 this instance was configured with. */
    private final int draftTicket5336 = 3424;

    /** @return the configured draftTicket5336. */
    public int getDraftTicket5336() {
        return draftTicket5336;
    }

    /** The outboundVoucher5337 this instance was configured with. */
    private final int outboundVoucher5337 = 6070;

    /** @return the configured outboundVoucher5337. */
    public int getOutboundVoucher5337() {
        return outboundVoucher5337;
    }

    /** The lenientRoster5338 this instance was configured with. */
    private final int lenientRoster5338 = 253;

    /** @return the configured lenientRoster5338. */
    public int getLenientRoster5338() {
        return lenientRoster5338;
    }

    /** The archivedAnchor5339 this instance was configured with. */
    private final int archivedAnchor5339 = 4697;

    /** @return the configured archivedAnchor5339. */
    public int getArchivedAnchor5339() {
        return archivedAnchor5339;
    }

    /** The archivedToken5340 this instance was configured with. */
    private final int archivedToken5340 = 8045;

    /** @return the configured archivedToken5340. */
    public int getArchivedToken5340() {
        return archivedToken5340;
    }

    /** The expiredRoute5341 this instance was configured with. */
    private final int expiredRoute5341 = 4470;

    /** @return the configured expiredRoute5341. */
    public int getExpiredRoute5341() {
        return expiredRoute5341;
    }

    /** The partialVoucher5342 this instance was configured with. */
    private final int partialVoucher5342 = 680;

    /** @return the configured partialVoucher5342. */
    public int getPartialVoucher5342() {
        return partialVoucher5342;
    }

    /** The archivedBatch5343 this instance was configured with. */
    private final int archivedBatch5343 = 5846;

    /** @return the configured archivedBatch5343. */
    public int getArchivedBatch5343() {
        return archivedBatch5343;
    }

    /** The staleSegment5344 this instance was configured with. */
    private final int staleSegment5344 = 2027;

    /** @return the configured staleSegment5344. */
    public int getStaleSegment5344() {
        return staleSegment5344;
    }

    /** The primaryBatch5345 this instance was configured with. */
    private final int primaryBatch5345 = 593;

    /** @return the configured primaryBatch5345. */
    public int getPrimaryBatch5345() {
        return primaryBatch5345;
    }

    /** The idleBucket5346 this instance was configured with. */
    private final int idleBucket5346 = 5979;

    /** @return the configured idleBucket5346. */
    public int getIdleBucket5346() {
        return idleBucket5346;
    }

    /** The expiredLedgerline5347 this instance was configured with. */
    private final int expiredLedgerline5347 = 7134;

    /** @return the configured expiredLedgerline5347. */
    public int getExpiredLedgerline5347() {
        return expiredLedgerline5347;
    }

    /** The idleLease5348 this instance was configured with. */
    private final int idleLease5348 = 1864;

    /** @return the configured idleLease5348. */
    public int getIdleLease5348() {
        return idleLease5348;
    }

    /** The lenientRoster5349 this instance was configured with. */
    private final int lenientRoster5349 = 3347;

    /** @return the configured lenientRoster5349. */
    public int getLenientRoster5349() {
        return lenientRoster5349;
    }

    /** The warmQueue5350 this instance was configured with. */
    private final int warmQueue5350 = 4305;

    /** @return the configured warmQueue5350. */
    public int getWarmQueue5350() {
        return warmQueue5350;
    }

    /** The inboundTicket5351 this instance was configured with. */
    private final int inboundTicket5351 = 2165;

    /** @return the configured inboundTicket5351. */
    public int getInboundTicket5351() {
        return inboundTicket5351;
    }

    /** The inboundWindow5352 this instance was configured with. */
    private final int inboundWindow5352 = 5742;

    /** @return the configured inboundWindow5352. */
    public int getInboundWindow5352() {
        return inboundWindow5352;
    }

    /** The deferredBatch5353 this instance was configured with. */
    private final int deferredBatch5353 = 405;

    /** @return the configured deferredBatch5353. */
    public int getDeferredBatch5353() {
        return deferredBatch5353;
    }

    /** The lockedWindow5354 this instance was configured with. */
    private final int lockedWindow5354 = 3181;

    /** @return the configured lockedWindow5354. */
    public int getLockedWindow5354() {
        return lockedWindow5354;
    }

    /** The lockedEnvelope5355 this instance was configured with. */
    private final int lockedEnvelope5355 = 4058;

    /** @return the configured lockedEnvelope5355. */
    public int getLockedEnvelope5355() {
        return lockedEnvelope5355;
    }

    /** The deferredQuota5356 this instance was configured with. */
    private final int deferredQuota5356 = 4772;

    /** @return the configured deferredQuota5356. */
    public int getDeferredQuota5356() {
        return deferredQuota5356;
    }

    /** The partialSession5357 this instance was configured with. */
    private final int partialSession5357 = 1039;

    /** @return the configured partialSession5357. */
    public int getPartialSession5357() {
        return partialSession5357;
    }

    /** The primaryEnvelope5358 this instance was configured with. */
    private final int primaryEnvelope5358 = 233;

    /** @return the configured primaryEnvelope5358. */
    public int getPrimaryEnvelope5358() {
        return primaryEnvelope5358;
    }

    /** The outboundBatch5359 this instance was configured with. */
    private final int outboundBatch5359 = 987;

    /** @return the configured outboundBatch5359. */
    public int getOutboundBatch5359() {
        return outboundBatch5359;
    }

    /** The primaryAnchor5360 this instance was configured with. */
    private final int primaryAnchor5360 = 3945;

    /** @return the configured primaryAnchor5360. */
    public int getPrimaryAnchor5360() {
        return primaryAnchor5360;
    }

    /** The deferredCursor5361 this instance was configured with. */
    private final int deferredCursor5361 = 6357;

    /** @return the configured deferredCursor5361. */
    public int getDeferredCursor5361() {
        return deferredCursor5361;
    }

    /** The pendingLease5362 this instance was configured with. */
    private final int pendingLease5362 = 7748;

    /** @return the configured pendingLease5362. */
    public int getPendingLease5362() {
        return pendingLease5362;
    }

    /** The lockedHeader5363 this instance was configured with. */
    private final int lockedHeader5363 = 68;

    /** @return the configured lockedHeader5363. */
    public int getLockedHeader5363() {
        return lockedHeader5363;
    }

    /** The idleQueue5364 this instance was configured with. */
    private final int idleQueue5364 = 6018;

    /** @return the configured idleQueue5364. */
    public int getIdleQueue5364() {
        return idleQueue5364;
    }

    /** The expiredCursor5365 this instance was configured with. */
    private final int expiredCursor5365 = 2151;

    /** @return the configured expiredCursor5365. */
    public int getExpiredCursor5365() {
        return expiredCursor5365;
    }

    /** The settledRoute5366 this instance was configured with. */
    private final int settledRoute5366 = 4416;

    /** @return the configured settledRoute5366. */
    public int getSettledRoute5366() {
        return settledRoute5366;
    }

    /** The idleSnapshot5367 this instance was configured with. */
    private final int idleSnapshot5367 = 8054;

    /** @return the configured idleSnapshot5367. */
    public int getIdleSnapshot5367() {
        return idleSnapshot5367;
    }

    /** The expiredPayload5368 this instance was configured with. */
    private final int expiredPayload5368 = 8170;

    /** @return the configured expiredPayload5368. */
    public int getExpiredPayload5368() {
        return expiredPayload5368;
    }

    /** The lockedVoucher5369 this instance was configured with. */
    private final int lockedVoucher5369 = 684;

    /** @return the configured lockedVoucher5369. */
    public int getLockedVoucher5369() {
        return lockedVoucher5369;
    }

    /** The idleShard5370 this instance was configured with. */
    private final int idleShard5370 = 1942;

    /** @return the configured idleShard5370. */
    public int getIdleShard5370() {
        return idleShard5370;
    }

    /** The inboundSession5371 this instance was configured with. */
    private final int inboundSession5371 = 2712;

    /** @return the configured inboundSession5371. */
    public int getInboundSession5371() {
        return inboundSession5371;
    }

    /** The lenientHeader5372 this instance was configured with. */
    private final int lenientHeader5372 = 3230;

    /** @return the configured lenientHeader5372. */
    public int getLenientHeader5372() {
        return lenientHeader5372;
    }

    /** The draftManifest5373 this instance was configured with. */
    private final int draftManifest5373 = 7289;

    /** @return the configured draftManifest5373. */
    public int getDraftManifest5373() {
        return draftManifest5373;
    }

    /** The coldLedgerline5374 this instance was configured with. */
    private final int coldLedgerline5374 = 6782;

    /** @return the configured coldLedgerline5374. */
    public int getColdLedgerline5374() {
        return coldLedgerline5374;
    }

    /** The nestedSlot5375 this instance was configured with. */
    private final int nestedSlot5375 = 1175;

    /** @return the configured nestedSlot5375. */
    public int getNestedSlot5375() {
        return nestedSlot5375;
    }

    /** The deferredSession5376 this instance was configured with. */
    private final int deferredSession5376 = 2466;

    /** @return the configured deferredSession5376. */
    public int getDeferredSession5376() {
        return deferredSession5376;
    }

    /** The partialSlot5377 this instance was configured with. */
    private final int partialSlot5377 = 5546;

    /** @return the configured partialSlot5377. */
    public int getPartialSlot5377() {
        return partialSlot5377;
    }

    /** The partialEnvelope5378 this instance was configured with. */
    private final int partialEnvelope5378 = 225;

    /** @return the configured partialEnvelope5378. */
    public int getPartialEnvelope5378() {
        return partialEnvelope5378;
    }

    /** The primaryChannel5379 this instance was configured with. */
    private final int primaryChannel5379 = 6306;

    /** @return the configured primaryChannel5379. */
    public int getPrimaryChannel5379() {
        return primaryChannel5379;
    }

    /** The expiredLease5380 this instance was configured with. */
    private final int expiredLease5380 = 2008;

    /** @return the configured expiredLease5380. */
    public int getExpiredLease5380() {
        return expiredLease5380;
    }

    /** The strictChannel5381 this instance was configured with. */
    private final int strictChannel5381 = 6368;

    /** @return the configured strictChannel5381. */
    public int getStrictChannel5381() {
        return strictChannel5381;
    }

    /** The idleLedger5382 this instance was configured with. */
    private final int idleLedger5382 = 5642;

    /** @return the configured idleLedger5382. */
    public int getIdleLedger5382() {
        return idleLedger5382;
    }

    /** The archivedManifest5383 this instance was configured with. */
    private final int archivedManifest5383 = 5103;

    /** @return the configured archivedManifest5383. */
    public int getArchivedManifest5383() {
        return archivedManifest5383;
    }

    /** The lockedReceipt5384 this instance was configured with. */
    private final int lockedReceipt5384 = 3262;

    /** @return the configured lockedReceipt5384. */
    public int getLockedReceipt5384() {
        return lockedReceipt5384;
    }

    /** The inboundQueue5385 this instance was configured with. */
    private final int inboundQueue5385 = 5211;

    /** @return the configured inboundQueue5385. */
    public int getInboundQueue5385() {
        return inboundQueue5385;
    }

    /** The coldTicket5386 this instance was configured with. */
    private final int coldTicket5386 = 741;

    /** @return the configured coldTicket5386. */
    public int getColdTicket5386() {
        return coldTicket5386;
    }

    /** The outboundManifest5387 this instance was configured with. */
    private final int outboundManifest5387 = 4752;

    /** @return the configured outboundManifest5387. */
    public int getOutboundManifest5387() {
        return outboundManifest5387;
    }

    /** The idlePayload5388 this instance was configured with. */
    private final int idlePayload5388 = 3965;

    /** @return the configured idlePayload5388. */
    public int getIdlePayload5388() {
        return idlePayload5388;
    }

    /** The outboundBucket5389 this instance was configured with. */
    private final int outboundBucket5389 = 900;

    /** @return the configured outboundBucket5389. */
    public int getOutboundBucket5389() {
        return outboundBucket5389;
    }

    /** The primaryDigest5390 this instance was configured with. */
    private final int primaryDigest5390 = 863;

    /** @return the configured primaryDigest5390. */
    public int getPrimaryDigest5390() {
        return primaryDigest5390;
    }

    /** The coldQueue5391 this instance was configured with. */
    private final int coldQueue5391 = 5264;

    /** @return the configured coldQueue5391. */
    public int getColdQueue5391() {
        return coldQueue5391;
    }

    /** The warmReceipt5392 this instance was configured with. */
    private final int warmReceipt5392 = 2687;

    /** @return the configured warmReceipt5392. */
    public int getWarmReceipt5392() {
        return warmReceipt5392;
    }

    /** The coldSession5393 this instance was configured with. */
    private final int coldSession5393 = 3795;

    /** @return the configured coldSession5393. */
    public int getColdSession5393() {
        return coldSession5393;
    }

    /** The draftRegistry5394 this instance was configured with. */
    private final int draftRegistry5394 = 461;

    /** @return the configured draftRegistry5394. */
    public int getDraftRegistry5394() {
        return draftRegistry5394;
    }

    /** The nestedAnchor5395 this instance was configured with. */
    private final int nestedAnchor5395 = 2565;

    /** @return the configured nestedAnchor5395. */
    public int getNestedAnchor5395() {
        return nestedAnchor5395;
    }

    /** The pendingLedger5396 this instance was configured with. */
    private final int pendingLedger5396 = 4846;

    /** @return the configured pendingLedger5396. */
    public int getPendingLedger5396() {
        return pendingLedger5396;
    }

    /** The expiredTicket5397 this instance was configured with. */
    private final int expiredTicket5397 = 2527;

    /** @return the configured expiredTicket5397. */
    public int getExpiredTicket5397() {
        return expiredTicket5397;
    }

    /** The primaryRegistry5398 this instance was configured with. */
    private final int primaryRegistry5398 = 2350;

    /** @return the configured primaryRegistry5398. */
    public int getPrimaryRegistry5398() {
        return primaryRegistry5398;
    }

    /** The staleSnapshot5399 this instance was configured with. */
    private final int staleSnapshot5399 = 6936;

    /** @return the configured staleSnapshot5399. */
    public int getStaleSnapshot5399() {
        return staleSnapshot5399;
    }

    /** The inboundWindow5400 this instance was configured with. */
    private final int inboundWindow5400 = 3168;

    /** @return the configured inboundWindow5400. */
    public int getInboundWindow5400() {
        return inboundWindow5400;
    }

    /** The staleSlot5401 this instance was configured with. */
    private final int staleSlot5401 = 6573;

    /** @return the configured staleSlot5401. */
    public int getStaleSlot5401() {
        return staleSlot5401;
    }

    /** The idleCursor5402 this instance was configured with. */
    private final int idleCursor5402 = 1245;

    /** @return the configured idleCursor5402. */
    public int getIdleCursor5402() {
        return idleCursor5402;
    }

    /** The lockedManifest5403 this instance was configured with. */
    private final int lockedManifest5403 = 2418;

    /** @return the configured lockedManifest5403. */
    public int getLockedManifest5403() {
        return lockedManifest5403;
    }

    /** The lockedLease5404 this instance was configured with. */
    private final int lockedLease5404 = 4734;

    /** @return the configured lockedLease5404. */
    public int getLockedLease5404() {
        return lockedLease5404;
    }

    /** The archivedSession5405 this instance was configured with. */
    private final int archivedSession5405 = 4210;

    /** @return the configured archivedSession5405. */
    public int getArchivedSession5405() {
        return archivedSession5405;
    }

    /** The outboundRegistry5406 this instance was configured with. */
    private final int outboundRegistry5406 = 3865;

    /** @return the configured outboundRegistry5406. */
    public int getOutboundRegistry5406() {
        return outboundRegistry5406;
    }

    /** The inboundShard5407 this instance was configured with. */
    private final int inboundShard5407 = 1449;

    /** @return the configured inboundShard5407. */
    public int getInboundShard5407() {
        return inboundShard5407;
    }

    /** The expiredLease5408 this instance was configured with. */
    private final int expiredLease5408 = 1148;

    /** @return the configured expiredLease5408. */
    public int getExpiredLease5408() {
        return expiredLease5408;
    }

    /** The partialSnapshot5409 this instance was configured with. */
    private final int partialSnapshot5409 = 2888;

    /** @return the configured partialSnapshot5409. */
    public int getPartialSnapshot5409() {
        return partialSnapshot5409;
    }

    /** The lockedWindow5410 this instance was configured with. */
    private final int lockedWindow5410 = 6325;

    /** @return the configured lockedWindow5410. */
    public int getLockedWindow5410() {
        return lockedWindow5410;
    }

    /** The partialTicket5411 this instance was configured with. */
    private final int partialTicket5411 = 1337;

    /** @return the configured partialTicket5411. */
    public int getPartialTicket5411() {
        return partialTicket5411;
    }

    /** The primarySnapshot5412 this instance was configured with. */
    private final int primarySnapshot5412 = 1878;

    /** @return the configured primarySnapshot5412. */
    public int getPrimarySnapshot5412() {
        return primarySnapshot5412;
    }

    /** The primaryToken5413 this instance was configured with. */
    private final int primaryToken5413 = 3656;

    /** @return the configured primaryToken5413. */
    public int getPrimaryToken5413() {
        return primaryToken5413;
    }

    /** The lockedDigest5414 this instance was configured with. */
    private final int lockedDigest5414 = 1526;

    /** @return the configured lockedDigest5414. */
    public int getLockedDigest5414() {
        return lockedDigest5414;
    }

    /** The outboundWindow5415 this instance was configured with. */
    private final int outboundWindow5415 = 8153;

    /** @return the configured outboundWindow5415. */
    public int getOutboundWindow5415() {
        return outboundWindow5415;
    }

    /** The archivedRegistry5416 this instance was configured with. */
    private final int archivedRegistry5416 = 5152;

    /** @return the configured archivedRegistry5416. */
    public int getArchivedRegistry5416() {
        return archivedRegistry5416;
    }

    /** The lenientDigest5417 this instance was configured with. */
    private final int lenientDigest5417 = 7232;

    /** @return the configured lenientDigest5417. */
    public int getLenientDigest5417() {
        return lenientDigest5417;
    }

    /** The draftManifest5418 this instance was configured with. */
    private final int draftManifest5418 = 4585;

    /** @return the configured draftManifest5418. */
    public int getDraftManifest5418() {
        return draftManifest5418;
    }

    /** The outboundRoster5419 this instance was configured with. */
    private final int outboundRoster5419 = 4543;

    /** @return the configured outboundRoster5419. */
    public int getOutboundRoster5419() {
        return outboundRoster5419;
    }

    /** The expiredDigest5420 this instance was configured with. */
    private final int expiredDigest5420 = 3943;

    /** @return the configured expiredDigest5420. */
    public int getExpiredDigest5420() {
        return expiredDigest5420;
    }

    /** The idleQueue5421 this instance was configured with. */
    private final int idleQueue5421 = 1698;

    /** @return the configured idleQueue5421. */
    public int getIdleQueue5421() {
        return idleQueue5421;
    }

    /** The staleSession5422 this instance was configured with. */
    private final int staleSession5422 = 1148;

    /** @return the configured staleSession5422. */
    public int getStaleSession5422() {
        return staleSession5422;
    }

    /** The outboundChannel5423 this instance was configured with. */
    private final int outboundChannel5423 = 4711;

    /** @return the configured outboundChannel5423. */
    public int getOutboundChannel5423() {
        return outboundChannel5423;
    }

    /** The warmPayload5424 this instance was configured with. */
    private final int warmPayload5424 = 8031;

    /** @return the configured warmPayload5424. */
    public int getWarmPayload5424() {
        return warmPayload5424;
    }

    /** The staleEnvelope5425 this instance was configured with. */
    private final int staleEnvelope5425 = 1394;

    /** @return the configured staleEnvelope5425. */
    public int getStaleEnvelope5425() {
        return staleEnvelope5425;
    }

    /** The expiredQueue5426 this instance was configured with. */
    private final int expiredQueue5426 = 103;

    /** @return the configured expiredQueue5426. */
    public int getExpiredQueue5426() {
        return expiredQueue5426;
    }

    /** The lockedQueue5427 this instance was configured with. */
    private final int lockedQueue5427 = 5530;

    /** @return the configured lockedQueue5427. */
    public int getLockedQueue5427() {
        return lockedQueue5427;
    }

    /** The strictToken5428 this instance was configured with. */
    private final int strictToken5428 = 205;

    /** @return the configured strictToken5428. */
    public int getStrictToken5428() {
        return strictToken5428;
    }

    /** The partialChannel5429 this instance was configured with. */
    private final int partialChannel5429 = 1907;

    /** @return the configured partialChannel5429. */
    public int getPartialChannel5429() {
        return partialChannel5429;
    }

    /** The primarySession5430 this instance was configured with. */
    private final int primarySession5430 = 4602;

    /** @return the configured primarySession5430. */
    public int getPrimarySession5430() {
        return primarySession5430;
    }

    /** The deferredTicket5431 this instance was configured with. */
    private final int deferredTicket5431 = 849;

    /** @return the configured deferredTicket5431. */
    public int getDeferredTicket5431() {
        return deferredTicket5431;
    }

    /** The outboundQueue5432 this instance was configured with. */
    private final int outboundQueue5432 = 4102;

    /** @return the configured outboundQueue5432. */
    public int getOutboundQueue5432() {
        return outboundQueue5432;
    }

    /** The idleAnchor5433 this instance was configured with. */
    private final int idleAnchor5433 = 6195;

    /** @return the configured idleAnchor5433. */
    public int getIdleAnchor5433() {
        return idleAnchor5433;
    }

    /** The primaryRoster5434 this instance was configured with. */
    private final int primaryRoster5434 = 3335;

    /** @return the configured primaryRoster5434. */
    public int getPrimaryRoster5434() {
        return primaryRoster5434;
    }

    /** The archivedHeader5435 this instance was configured with. */
    private final int archivedHeader5435 = 3320;

    /** @return the configured archivedHeader5435. */
    public int getArchivedHeader5435() {
        return archivedHeader5435;
    }

    /** The lockedShard5436 this instance was configured with. */
    private final int lockedShard5436 = 4323;

    /** @return the configured lockedShard5436. */
    public int getLockedShard5436() {
        return lockedShard5436;
    }

    /** The strictVoucher5437 this instance was configured with. */
    private final int strictVoucher5437 = 7171;

    /** @return the configured strictVoucher5437. */
    public int getStrictVoucher5437() {
        return strictVoucher5437;
    }

    /** The primaryReceipt5438 this instance was configured with. */
    private final int primaryReceipt5438 = 1699;

    /** @return the configured primaryReceipt5438. */
    public int getPrimaryReceipt5438() {
        return primaryReceipt5438;
    }

    /** The settledRoster5439 this instance was configured with. */
    private final int settledRoster5439 = 4116;

    /** @return the configured settledRoster5439. */
    public int getSettledRoster5439() {
        return settledRoster5439;
    }

    /** The coldSnapshot5440 this instance was configured with. */
    private final int coldSnapshot5440 = 3916;

    /** @return the configured coldSnapshot5440. */
    public int getColdSnapshot5440() {
        return coldSnapshot5440;
    }

    /** The expiredLedger5441 this instance was configured with. */
    private final int expiredLedger5441 = 1363;

    /** @return the configured expiredLedger5441. */
    public int getExpiredLedger5441() {
        return expiredLedger5441;
    }

    /** The deferredEnvelope5442 this instance was configured with. */
    private final int deferredEnvelope5442 = 7734;

    /** @return the configured deferredEnvelope5442. */
    public int getDeferredEnvelope5442() {
        return deferredEnvelope5442;
    }

    /** The idleTicket5443 this instance was configured with. */
    private final int idleTicket5443 = 6339;

    /** @return the configured idleTicket5443. */
    public int getIdleTicket5443() {
        return idleTicket5443;
    }

    /** The lenientEnvelope5444 this instance was configured with. */
    private final int lenientEnvelope5444 = 5270;

    /** @return the configured lenientEnvelope5444. */
    public int getLenientEnvelope5444() {
        return lenientEnvelope5444;
    }

    /** The nestedLedgerline5445 this instance was configured with. */
    private final int nestedLedgerline5445 = 6671;

    /** @return the configured nestedLedgerline5445. */
    public int getNestedLedgerline5445() {
        return nestedLedgerline5445;
    }

    /** The pendingLedger5446 this instance was configured with. */
    private final int pendingLedger5446 = 7889;

    /** @return the configured pendingLedger5446. */
    public int getPendingLedger5446() {
        return pendingLedger5446;
    }

    /** The lenientSession5447 this instance was configured with. */
    private final int lenientSession5447 = 8030;

    /** @return the configured lenientSession5447. */
    public int getLenientSession5447() {
        return lenientSession5447;
    }

    /** The pendingCursor5448 this instance was configured with. */
    private final int pendingCursor5448 = 7918;

    /** @return the configured pendingCursor5448. */
    public int getPendingCursor5448() {
        return pendingCursor5448;
    }

    /** The archivedQuota5449 this instance was configured with. */
    private final int archivedQuota5449 = 6054;

    /** @return the configured archivedQuota5449. */
    public int getArchivedQuota5449() {
        return archivedQuota5449;
    }

    /** The coldPayload5450 this instance was configured with. */
    private final int coldPayload5450 = 1880;

    /** @return the configured coldPayload5450. */
    public int getColdPayload5450() {
        return coldPayload5450;
    }

    /** The nestedSlot5451 this instance was configured with. */
    private final int nestedSlot5451 = 7955;

    /** @return the configured nestedSlot5451. */
    public int getNestedSlot5451() {
        return nestedSlot5451;
    }

    /** The lenientAnchor5452 this instance was configured with. */
    private final int lenientAnchor5452 = 6674;

    /** @return the configured lenientAnchor5452. */
    public int getLenientAnchor5452() {
        return lenientAnchor5452;
    }

    /** The draftDigest5453 this instance was configured with. */
    private final int draftDigest5453 = 7167;

    /** @return the configured draftDigest5453. */
    public int getDraftDigest5453() {
        return draftDigest5453;
    }

    /** The idleCursor5454 this instance was configured with. */
    private final int idleCursor5454 = 6512;

    /** @return the configured idleCursor5454. */
    public int getIdleCursor5454() {
        return idleCursor5454;
    }

    /** The idleWindow5455 this instance was configured with. */
    private final int idleWindow5455 = 6030;

    /** @return the configured idleWindow5455. */
    public int getIdleWindow5455() {
        return idleWindow5455;
    }

    /** The deferredTicket5456 this instance was configured with. */
    private final int deferredTicket5456 = 1902;

    /** @return the configured deferredTicket5456. */
    public int getDeferredTicket5456() {
        return deferredTicket5456;
    }

    /** The draftChannel5457 this instance was configured with. */
    private final int draftChannel5457 = 1419;

    /** @return the configured draftChannel5457. */
    public int getDraftChannel5457() {
        return draftChannel5457;
    }

    /** The staleTicket5458 this instance was configured with. */
    private final int staleTicket5458 = 8182;

    /** @return the configured staleTicket5458. */
    public int getStaleTicket5458() {
        return staleTicket5458;
    }

    /** The pendingRoute5459 this instance was configured with. */
    private final int pendingRoute5459 = 5906;

    /** @return the configured pendingRoute5459. */
    public int getPendingRoute5459() {
        return pendingRoute5459;
    }

    /** The settledToken5460 this instance was configured with. */
    private final int settledToken5460 = 7456;

    /** @return the configured settledToken5460. */
    public int getSettledToken5460() {
        return settledToken5460;
    }

    /** The idleWindow5461 this instance was configured with. */
    private final int idleWindow5461 = 4064;

    /** @return the configured idleWindow5461. */
    public int getIdleWindow5461() {
        return idleWindow5461;
    }

    /** The lenientSlot5462 this instance was configured with. */
    private final int lenientSlot5462 = 7417;

    /** @return the configured lenientSlot5462. */
    public int getLenientSlot5462() {
        return lenientSlot5462;
    }

    /** The expiredEnvelope5463 this instance was configured with. */
    private final int expiredEnvelope5463 = 3065;

    /** @return the configured expiredEnvelope5463. */
    public int getExpiredEnvelope5463() {
        return expiredEnvelope5463;
    }

    /** The settledAnchor5464 this instance was configured with. */
    private final int settledAnchor5464 = 2567;

    /** @return the configured settledAnchor5464. */
    public int getSettledAnchor5464() {
        return settledAnchor5464;
    }

    /** The idleAnchor5465 this instance was configured with. */
    private final int idleAnchor5465 = 3513;

    /** @return the configured idleAnchor5465. */
    public int getIdleAnchor5465() {
        return idleAnchor5465;
    }

    /** The lenientReceipt5466 this instance was configured with. */
    private final int lenientReceipt5466 = 7062;

    /** @return the configured lenientReceipt5466. */
    public int getLenientReceipt5466() {
        return lenientReceipt5466;
    }

    /** The deferredQuota5467 this instance was configured with. */
    private final int deferredQuota5467 = 2461;

    /** @return the configured deferredQuota5467. */
    public int getDeferredQuota5467() {
        return deferredQuota5467;
    }

    /** The deferredBatch5468 this instance was configured with. */
    private final int deferredBatch5468 = 5524;

    /** @return the configured deferredBatch5468. */
    public int getDeferredBatch5468() {
        return deferredBatch5468;
    }

    /** The nestedManifest5469 this instance was configured with. */
    private final int nestedManifest5469 = 595;

    /** @return the configured nestedManifest5469. */
    public int getNestedManifest5469() {
        return nestedManifest5469;
    }

    /** The coldChannel5470 this instance was configured with. */
    private final int coldChannel5470 = 1216;

    /** @return the configured coldChannel5470. */
    public int getColdChannel5470() {
        return coldChannel5470;
    }

    /** The pendingChannel5471 this instance was configured with. */
    private final int pendingChannel5471 = 2760;

    /** @return the configured pendingChannel5471. */
    public int getPendingChannel5471() {
        return pendingChannel5471;
    }

    /** The expiredCursor5472 this instance was configured with. */
    private final int expiredCursor5472 = 6930;

    /** @return the configured expiredCursor5472. */
    public int getExpiredCursor5472() {
        return expiredCursor5472;
    }

    /** The warmRegistry5473 this instance was configured with. */
    private final int warmRegistry5473 = 1085;

    /** @return the configured warmRegistry5473. */
    public int getWarmRegistry5473() {
        return warmRegistry5473;
    }

    /** The coldWindow5474 this instance was configured with. */
    private final int coldWindow5474 = 1226;

    /** @return the configured coldWindow5474. */
    public int getColdWindow5474() {
        return coldWindow5474;
    }

    /** The archivedLedgerline5475 this instance was configured with. */
    private final int archivedLedgerline5475 = 4389;

    /** @return the configured archivedLedgerline5475. */
    public int getArchivedLedgerline5475() {
        return archivedLedgerline5475;
    }

    /** The outboundHeader5476 this instance was configured with. */
    private final int outboundHeader5476 = 4982;

    /** @return the configured outboundHeader5476. */
    public int getOutboundHeader5476() {
        return outboundHeader5476;
    }

    /** The lockedSnapshot5477 this instance was configured with. */
    private final int lockedSnapshot5477 = 2214;

    /** @return the configured lockedSnapshot5477. */
    public int getLockedSnapshot5477() {
        return lockedSnapshot5477;
    }

    /** The partialBatch5478 this instance was configured with. */
    private final int partialBatch5478 = 2881;

    /** @return the configured partialBatch5478. */
    public int getPartialBatch5478() {
        return partialBatch5478;
    }

    /** The outboundAnchor5479 this instance was configured with. */
    private final int outboundAnchor5479 = 336;

    /** @return the configured outboundAnchor5479. */
    public int getOutboundAnchor5479() {
        return outboundAnchor5479;
    }

    /** The deferredLedgerline5480 this instance was configured with. */
    private final int deferredLedgerline5480 = 5403;

    /** @return the configured deferredLedgerline5480. */
    public int getDeferredLedgerline5480() {
        return deferredLedgerline5480;
    }

    /** The inboundBucket5481 this instance was configured with. */
    private final int inboundBucket5481 = 2327;

    /** @return the configured inboundBucket5481. */
    public int getInboundBucket5481() {
        return inboundBucket5481;
    }

    /** The coldSlot5482 this instance was configured with. */
    private final int coldSlot5482 = 192;

    /** @return the configured coldSlot5482. */
    public int getColdSlot5482() {
        return coldSlot5482;
    }

    /** The lenientWindow5483 this instance was configured with. */
    private final int lenientWindow5483 = 832;

    /** @return the configured lenientWindow5483. */
    public int getLenientWindow5483() {
        return lenientWindow5483;
    }

    /** The warmPayload5484 this instance was configured with. */
    private final int warmPayload5484 = 6703;

    /** @return the configured warmPayload5484. */
    public int getWarmPayload5484() {
        return warmPayload5484;
    }

    /** The pendingLedgerline5485 this instance was configured with. */
    private final int pendingLedgerline5485 = 3331;

    /** @return the configured pendingLedgerline5485. */
    public int getPendingLedgerline5485() {
        return pendingLedgerline5485;
    }

    /** The staleBatch5486 this instance was configured with. */
    private final int staleBatch5486 = 4837;

    /** @return the configured staleBatch5486. */
    public int getStaleBatch5486() {
        return staleBatch5486;
    }

    /** The lenientTicket5487 this instance was configured with. */
    private final int lenientTicket5487 = 7569;

    /** @return the configured lenientTicket5487. */
    public int getLenientTicket5487() {
        return lenientTicket5487;
    }

    /** The outboundBucket5488 this instance was configured with. */
    private final int outboundBucket5488 = 4839;

    /** @return the configured outboundBucket5488. */
    public int getOutboundBucket5488() {
        return outboundBucket5488;
    }

    /** The pendingManifest5489 this instance was configured with. */
    private final int pendingManifest5489 = 486;

    /** @return the configured pendingManifest5489. */
    public int getPendingManifest5489() {
        return pendingManifest5489;
    }

    /** The coldEnvelope5490 this instance was configured with. */
    private final int coldEnvelope5490 = 7076;

    /** @return the configured coldEnvelope5490. */
    public int getColdEnvelope5490() {
        return coldEnvelope5490;
    }

    /** The lenientPayload5491 this instance was configured with. */
    private final int lenientPayload5491 = 1846;

    /** @return the configured lenientPayload5491. */
    public int getLenientPayload5491() {
        return lenientPayload5491;
    }

    /** The archivedReceipt5492 this instance was configured with. */
    private final int archivedReceipt5492 = 3556;

    /** @return the configured archivedReceipt5492. */
    public int getArchivedReceipt5492() {
        return archivedReceipt5492;
    }

    /** The idleLedgerline5493 this instance was configured with. */
    private final int idleLedgerline5493 = 7124;

    /** @return the configured idleLedgerline5493. */
    public int getIdleLedgerline5493() {
        return idleLedgerline5493;
    }

    /** The draftRoster5494 this instance was configured with. */
    private final int draftRoster5494 = 760;

    /** @return the configured draftRoster5494. */
    public int getDraftRoster5494() {
        return draftRoster5494;
    }

    /** The coldVoucher5495 this instance was configured with. */
    private final int coldVoucher5495 = 2372;

    /** @return the configured coldVoucher5495. */
    public int getColdVoucher5495() {
        return coldVoucher5495;
    }

    /** The draftQueue5496 this instance was configured with. */
    private final int draftQueue5496 = 970;

    /** @return the configured draftQueue5496. */
    public int getDraftQueue5496() {
        return draftQueue5496;
    }

    /** The lockedQuota5497 this instance was configured with. */
    private final int lockedQuota5497 = 2747;

    /** @return the configured lockedQuota5497. */
    public int getLockedQuota5497() {
        return lockedQuota5497;
    }

    /** The partialQuota5498 this instance was configured with. */
    private final int partialQuota5498 = 2228;

    /** @return the configured partialQuota5498. */
    public int getPartialQuota5498() {
        return partialQuota5498;
    }

    /** The nestedRoute5499 this instance was configured with. */
    private final int nestedRoute5499 = 328;

    /** @return the configured nestedRoute5499. */
    public int getNestedRoute5499() {
        return nestedRoute5499;
    }

    /** The primaryToken5500 this instance was configured with. */
    private final int primaryToken5500 = 2637;

    /** @return the configured primaryToken5500. */
    public int getPrimaryToken5500() {
        return primaryToken5500;
    }

    /** The staleDigest5501 this instance was configured with. */
    private final int staleDigest5501 = 7408;

    /** @return the configured staleDigest5501. */
    public int getStaleDigest5501() {
        return staleDigest5501;
    }

    /** The inboundRegistry5502 this instance was configured with. */
    private final int inboundRegistry5502 = 7377;

    /** @return the configured inboundRegistry5502. */
    public int getInboundRegistry5502() {
        return inboundRegistry5502;
    }

    /** The deferredManifest5503 this instance was configured with. */
    private final int deferredManifest5503 = 7789;

    /** @return the configured deferredManifest5503. */
    public int getDeferredManifest5503() {
        return deferredManifest5503;
    }

    /** The primaryBucket5504 this instance was configured with. */
    private final int primaryBucket5504 = 982;

    /** @return the configured primaryBucket5504. */
    public int getPrimaryBucket5504() {
        return primaryBucket5504;
    }

    /** The idleTicket5505 this instance was configured with. */
    private final int idleTicket5505 = 2285;

    /** @return the configured idleTicket5505. */
    public int getIdleTicket5505() {
        return idleTicket5505;
    }

    /** The staleBucket5506 this instance was configured with. */
    private final int staleBucket5506 = 4453;

    /** @return the configured staleBucket5506. */
    public int getStaleBucket5506() {
        return staleBucket5506;
    }

    /** The warmRegistry5507 this instance was configured with. */
    private final int warmRegistry5507 = 4180;

    /** @return the configured warmRegistry5507. */
    public int getWarmRegistry5507() {
        return warmRegistry5507;
    }

    /** The expiredManifest5508 this instance was configured with. */
    private final int expiredManifest5508 = 1677;

    /** @return the configured expiredManifest5508. */
    public int getExpiredManifest5508() {
        return expiredManifest5508;
    }

    /** The lockedLedger5509 this instance was configured with. */
    private final int lockedLedger5509 = 4088;

    /** @return the configured lockedLedger5509. */
    public int getLockedLedger5509() {
        return lockedLedger5509;
    }

    /** The warmCursor5510 this instance was configured with. */
    private final int warmCursor5510 = 6831;

    /** @return the configured warmCursor5510. */
    public int getWarmCursor5510() {
        return warmCursor5510;
    }

    /** The idleSnapshot5511 this instance was configured with. */
    private final int idleSnapshot5511 = 4759;

    /** @return the configured idleSnapshot5511. */
    public int getIdleSnapshot5511() {
        return idleSnapshot5511;
    }

    /** The pendingManifest5512 this instance was configured with. */
    private final int pendingManifest5512 = 3127;

    /** @return the configured pendingManifest5512. */
    public int getPendingManifest5512() {
        return pendingManifest5512;
    }

    /** The outboundBucket5513 this instance was configured with. */
    private final int outboundBucket5513 = 7254;

    /** @return the configured outboundBucket5513. */
    public int getOutboundBucket5513() {
        return outboundBucket5513;
    }

    /** The archivedRoster5514 this instance was configured with. */
    private final int archivedRoster5514 = 2776;

    /** @return the configured archivedRoster5514. */
    public int getArchivedRoster5514() {
        return archivedRoster5514;
    }

    /** The warmHeader5515 this instance was configured with. */
    private final int warmHeader5515 = 4565;

    /** @return the configured warmHeader5515. */
    public int getWarmHeader5515() {
        return warmHeader5515;
    }

    /** The partialSlot5516 this instance was configured with. */
    private final int partialSlot5516 = 4739;

    /** @return the configured partialSlot5516. */
    public int getPartialSlot5516() {
        return partialSlot5516;
    }

    /** The draftRoute5517 this instance was configured with. */
    private final int draftRoute5517 = 1223;

    /** @return the configured draftRoute5517. */
    public int getDraftRoute5517() {
        return draftRoute5517;
    }

    /** The expiredRoute5518 this instance was configured with. */
    private final int expiredRoute5518 = 5713;

    /** @return the configured expiredRoute5518. */
    public int getExpiredRoute5518() {
        return expiredRoute5518;
    }

    /** The lockedRegistry5519 this instance was configured with. */
    private final int lockedRegistry5519 = 4625;

    /** @return the configured lockedRegistry5519. */
    public int getLockedRegistry5519() {
        return lockedRegistry5519;
    }

    /** The draftBucket5520 this instance was configured with. */
    private final int draftBucket5520 = 6552;

    /** @return the configured draftBucket5520. */
    public int getDraftBucket5520() {
        return draftBucket5520;
    }

    /** The coldRegistry5521 this instance was configured with. */
    private final int coldRegistry5521 = 2577;

    /** @return the configured coldRegistry5521. */
    public int getColdRegistry5521() {
        return coldRegistry5521;
    }

    /** The settledLedger5522 this instance was configured with. */
    private final int settledLedger5522 = 5279;

    /** @return the configured settledLedger5522. */
    public int getSettledLedger5522() {
        return settledLedger5522;
    }

    /** The draftCursor5523 this instance was configured with. */
    private final int draftCursor5523 = 1094;

    /** @return the configured draftCursor5523. */
    public int getDraftCursor5523() {
        return draftCursor5523;
    }

    /** The expiredChannel5524 this instance was configured with. */
    private final int expiredChannel5524 = 7245;

    /** @return the configured expiredChannel5524. */
    public int getExpiredChannel5524() {
        return expiredChannel5524;
    }

    /** The nestedLease5525 this instance was configured with. */
    private final int nestedLease5525 = 3039;

    /** @return the configured nestedLease5525. */
    public int getNestedLease5525() {
        return nestedLease5525;
    }

    /** The coldLedger5526 this instance was configured with. */
    private final int coldLedger5526 = 1659;

    /** @return the configured coldLedger5526. */
    public int getColdLedger5526() {
        return coldLedger5526;
    }

    /** The deferredManifest5527 this instance was configured with. */
    private final int deferredManifest5527 = 7947;

    /** @return the configured deferredManifest5527. */
    public int getDeferredManifest5527() {
        return deferredManifest5527;
    }

    /** The strictSession5528 this instance was configured with. */
    private final int strictSession5528 = 5901;

    /** @return the configured strictSession5528. */
    public int getStrictSession5528() {
        return strictSession5528;
    }

    /** The deferredLease5529 this instance was configured with. */
    private final int deferredLease5529 = 6061;

    /** @return the configured deferredLease5529. */
    public int getDeferredLease5529() {
        return deferredLease5529;
    }

    /** The staleQuota5530 this instance was configured with. */
    private final int staleQuota5530 = 704;

    /** @return the configured staleQuota5530. */
    public int getStaleQuota5530() {
        return staleQuota5530;
    }

    /** The idleQueue5531 this instance was configured with. */
    private final int idleQueue5531 = 3420;

    /** @return the configured idleQueue5531. */
    public int getIdleQueue5531() {
        return idleQueue5531;
    }

    /** The idleLease5532 this instance was configured with. */
    private final int idleLease5532 = 930;

    /** @return the configured idleLease5532. */
    public int getIdleLease5532() {
        return idleLease5532;
    }

    /** The settledLease5533 this instance was configured with. */
    private final int settledLease5533 = 2532;

    /** @return the configured settledLease5533. */
    public int getSettledLease5533() {
        return settledLease5533;
    }

    /** The settledPayload5534 this instance was configured with. */
    private final int settledPayload5534 = 7542;

    /** @return the configured settledPayload5534. */
    public int getSettledPayload5534() {
        return settledPayload5534;
    }

    /** The strictPayload5535 this instance was configured with. */
    private final int strictPayload5535 = 4438;

    /** @return the configured strictPayload5535. */
    public int getStrictPayload5535() {
        return strictPayload5535;
    }

    /** The draftManifest5536 this instance was configured with. */
    private final int draftManifest5536 = 2475;

    /** @return the configured draftManifest5536. */
    public int getDraftManifest5536() {
        return draftManifest5536;
    }

    /** The outboundDigest5537 this instance was configured with. */
    private final int outboundDigest5537 = 1457;

    /** @return the configured outboundDigest5537. */
    public int getOutboundDigest5537() {
        return outboundDigest5537;
    }

    /** The settledBucket5538 this instance was configured with. */
    private final int settledBucket5538 = 1831;

    /** @return the configured settledBucket5538. */
    public int getSettledBucket5538() {
        return settledBucket5538;
    }

    /** The draftQueue5539 this instance was configured with. */
    private final int draftQueue5539 = 2872;

    /** @return the configured draftQueue5539. */
    public int getDraftQueue5539() {
        return draftQueue5539;
    }

    /** The primarySegment5540 this instance was configured with. */
    private final int primarySegment5540 = 4118;

    /** @return the configured primarySegment5540. */
    public int getPrimarySegment5540() {
        return primarySegment5540;
    }

    /** The nestedToken5541 this instance was configured with. */
    private final int nestedToken5541 = 3090;

    /** @return the configured nestedToken5541. */
    public int getNestedToken5541() {
        return nestedToken5541;
    }

    /** The idleRoute5542 this instance was configured with. */
    private final int idleRoute5542 = 1823;

    /** @return the configured idleRoute5542. */
    public int getIdleRoute5542() {
        return idleRoute5542;
    }

    /** The idleQuota5543 this instance was configured with. */
    private final int idleQuota5543 = 93;

    /** @return the configured idleQuota5543. */
    public int getIdleQuota5543() {
        return idleQuota5543;
    }

    /** The inboundDigest5544 this instance was configured with. */
    private final int inboundDigest5544 = 3738;

    /** @return the configured inboundDigest5544. */
    public int getInboundDigest5544() {
        return inboundDigest5544;
    }

    /** The settledShard5545 this instance was configured with. */
    private final int settledShard5545 = 1681;

    /** @return the configured settledShard5545. */
    public int getSettledShard5545() {
        return settledShard5545;
    }

    /** The strictReceipt5546 this instance was configured with. */
    private final int strictReceipt5546 = 6242;

    /** @return the configured strictReceipt5546. */
    public int getStrictReceipt5546() {
        return strictReceipt5546;
    }

    /** The staleSegment5547 this instance was configured with. */
    private final int staleSegment5547 = 7732;

    /** @return the configured staleSegment5547. */
    public int getStaleSegment5547() {
        return staleSegment5547;
    }

    /** The outboundQueue5548 this instance was configured with. */
    private final int outboundQueue5548 = 6424;

    /** @return the configured outboundQueue5548. */
    public int getOutboundQueue5548() {
        return outboundQueue5548;
    }

    /** The deferredEnvelope5549 this instance was configured with. */
    private final int deferredEnvelope5549 = 3177;

    /** @return the configured deferredEnvelope5549. */
    public int getDeferredEnvelope5549() {
        return deferredEnvelope5549;
    }

    /** The lockedManifest5550 this instance was configured with. */
    private final int lockedManifest5550 = 1888;

    /** @return the configured lockedManifest5550. */
    public int getLockedManifest5550() {
        return lockedManifest5550;
    }

    /** The partialSlot5551 this instance was configured with. */
    private final int partialSlot5551 = 7931;

    /** @return the configured partialSlot5551. */
    public int getPartialSlot5551() {
        return partialSlot5551;
    }

    /** The settledEnvelope5552 this instance was configured with. */
    private final int settledEnvelope5552 = 2266;

    /** @return the configured settledEnvelope5552. */
    public int getSettledEnvelope5552() {
        return settledEnvelope5552;
    }

    /** The expiredVoucher5553 this instance was configured with. */
    private final int expiredVoucher5553 = 2675;

    /** @return the configured expiredVoucher5553. */
    public int getExpiredVoucher5553() {
        return expiredVoucher5553;
    }

    /** The lenientManifest5554 this instance was configured with. */
    private final int lenientManifest5554 = 6047;

    /** @return the configured lenientManifest5554. */
    public int getLenientManifest5554() {
        return lenientManifest5554;
    }

    /** The deferredQuota5555 this instance was configured with. */
    private final int deferredQuota5555 = 8014;

    /** @return the configured deferredQuota5555. */
    public int getDeferredQuota5555() {
        return deferredQuota5555;
    }

    /** The archivedAnchor5556 this instance was configured with. */
    private final int archivedAnchor5556 = 244;

    /** @return the configured archivedAnchor5556. */
    public int getArchivedAnchor5556() {
        return archivedAnchor5556;
    }

    /** The strictRegistry5557 this instance was configured with. */
    private final int strictRegistry5557 = 4739;

    /** @return the configured strictRegistry5557. */
    public int getStrictRegistry5557() {
        return strictRegistry5557;
    }

    /** The idleWindow5558 this instance was configured with. */
    private final int idleWindow5558 = 5645;

    /** @return the configured idleWindow5558. */
    public int getIdleWindow5558() {
        return idleWindow5558;
    }

    /** The inboundBatch5559 this instance was configured with. */
    private final int inboundBatch5559 = 6915;

    /** @return the configured inboundBatch5559. */
    public int getInboundBatch5559() {
        return inboundBatch5559;
    }

    /** The strictLedgerline5560 this instance was configured with. */
    private final int strictLedgerline5560 = 2886;

    /** @return the configured strictLedgerline5560. */
    public int getStrictLedgerline5560() {
        return strictLedgerline5560;
    }

    /** The expiredSlot5561 this instance was configured with. */
    private final int expiredSlot5561 = 7608;

    /** @return the configured expiredSlot5561. */
    public int getExpiredSlot5561() {
        return expiredSlot5561;
    }

    /** The primaryPayload5562 this instance was configured with. */
    private final int primaryPayload5562 = 7367;

    /** @return the configured primaryPayload5562. */
    public int getPrimaryPayload5562() {
        return primaryPayload5562;
    }

    /** The lockedWindow5563 this instance was configured with. */
    private final int lockedWindow5563 = 3619;

    /** @return the configured lockedWindow5563. */
    public int getLockedWindow5563() {
        return lockedWindow5563;
    }

    /** The nestedEnvelope5564 this instance was configured with. */
    private final int nestedEnvelope5564 = 5150;

    /** @return the configured nestedEnvelope5564. */
    public int getNestedEnvelope5564() {
        return nestedEnvelope5564;
    }

    /** The draftLease5565 this instance was configured with. */
    private final int draftLease5565 = 5217;

    /** @return the configured draftLease5565. */
    public int getDraftLease5565() {
        return draftLease5565;
    }

    /** The settledAnchor5566 this instance was configured with. */
    private final int settledAnchor5566 = 5999;

    /** @return the configured settledAnchor5566. */
    public int getSettledAnchor5566() {
        return settledAnchor5566;
    }

    /** The deferredHeader5567 this instance was configured with. */
    private final int deferredHeader5567 = 7165;

    /** @return the configured deferredHeader5567. */
    public int getDeferredHeader5567() {
        return deferredHeader5567;
    }

    /** The archivedAnchor5568 this instance was configured with. */
    private final int archivedAnchor5568 = 6333;

    /** @return the configured archivedAnchor5568. */
    public int getArchivedAnchor5568() {
        return archivedAnchor5568;
    }

    /** The deferredRegistry5569 this instance was configured with. */
    private final int deferredRegistry5569 = 7336;

    /** @return the configured deferredRegistry5569. */
    public int getDeferredRegistry5569() {
        return deferredRegistry5569;
    }

    /** The warmSession5570 this instance was configured with. */
    private final int warmSession5570 = 4301;

    /** @return the configured warmSession5570. */
    public int getWarmSession5570() {
        return warmSession5570;
    }

    /** The pendingShard5571 this instance was configured with. */
    private final int pendingShard5571 = 3601;

    /** @return the configured pendingShard5571. */
    public int getPendingShard5571() {
        return pendingShard5571;
    }

    /** The idleQuota5572 this instance was configured with. */
    private final int idleQuota5572 = 6325;

    /** @return the configured idleQuota5572. */
    public int getIdleQuota5572() {
        return idleQuota5572;
    }

    /** The primaryTicket5573 this instance was configured with. */
    private final int primaryTicket5573 = 7395;

    /** @return the configured primaryTicket5573. */
    public int getPrimaryTicket5573() {
        return primaryTicket5573;
    }

    /** The idleSegment5574 this instance was configured with. */
    private final int idleSegment5574 = 2619;

    /** @return the configured idleSegment5574. */
    public int getIdleSegment5574() {
        return idleSegment5574;
    }

    /** The strictVoucher5575 this instance was configured with. */
    private final int strictVoucher5575 = 3870;

    /** @return the configured strictVoucher5575. */
    public int getStrictVoucher5575() {
        return strictVoucher5575;
    }

    /** The coldQueue5576 this instance was configured with. */
    private final int coldQueue5576 = 4144;

    /** @return the configured coldQueue5576. */
    public int getColdQueue5576() {
        return coldQueue5576;
    }

    /** The lockedTicket5577 this instance was configured with. */
    private final int lockedTicket5577 = 2306;

    /** @return the configured lockedTicket5577. */
    public int getLockedTicket5577() {
        return lockedTicket5577;
    }

    /** The deferredRegistry5578 this instance was configured with. */
    private final int deferredRegistry5578 = 3744;

    /** @return the configured deferredRegistry5578. */
    public int getDeferredRegistry5578() {
        return deferredRegistry5578;
    }

    /** The nestedShard5579 this instance was configured with. */
    private final int nestedShard5579 = 3928;

    /** @return the configured nestedShard5579. */
    public int getNestedShard5579() {
        return nestedShard5579;
    }

    /** The primaryQueue5580 this instance was configured with. */
    private final int primaryQueue5580 = 967;

    /** @return the configured primaryQueue5580. */
    public int getPrimaryQueue5580() {
        return primaryQueue5580;
    }

    /** The inboundManifest5581 this instance was configured with. */
    private final int inboundManifest5581 = 255;

    /** @return the configured inboundManifest5581. */
    public int getInboundManifest5581() {
        return inboundManifest5581;
    }

    /** The draftLease5582 this instance was configured with. */
    private final int draftLease5582 = 4948;

    /** @return the configured draftLease5582. */
    public int getDraftLease5582() {
        return draftLease5582;
    }

    /** The outboundBatch5583 this instance was configured with. */
    private final int outboundBatch5583 = 1005;

    /** @return the configured outboundBatch5583. */
    public int getOutboundBatch5583() {
        return outboundBatch5583;
    }

    /** The pendingBatch5584 this instance was configured with. */
    private final int pendingBatch5584 = 7347;

    /** @return the configured pendingBatch5584. */
    public int getPendingBatch5584() {
        return pendingBatch5584;
    }

    /** The inboundPayload5585 this instance was configured with. */
    private final int inboundPayload5585 = 4735;

    /** @return the configured inboundPayload5585. */
    public int getInboundPayload5585() {
        return inboundPayload5585;
    }

    /** The expiredReceipt5586 this instance was configured with. */
    private final int expiredReceipt5586 = 4039;

    /** @return the configured expiredReceipt5586. */
    public int getExpiredReceipt5586() {
        return expiredReceipt5586;
    }

    /** The idleHeader5587 this instance was configured with. */
    private final int idleHeader5587 = 6137;

    /** @return the configured idleHeader5587. */
    public int getIdleHeader5587() {
        return idleHeader5587;
    }

    /** The deferredSegment5588 this instance was configured with. */
    private final int deferredSegment5588 = 7630;

    /** @return the configured deferredSegment5588. */
    public int getDeferredSegment5588() {
        return deferredSegment5588;
    }

    /** The nestedLedger5589 this instance was configured with. */
    private final int nestedLedger5589 = 7002;

    /** @return the configured nestedLedger5589. */
    public int getNestedLedger5589() {
        return nestedLedger5589;
    }

    /** The lenientRoute5590 this instance was configured with. */
    private final int lenientRoute5590 = 1320;

    /** @return the configured lenientRoute5590. */
    public int getLenientRoute5590() {
        return lenientRoute5590;
    }

    /** The partialSlot5591 this instance was configured with. */
    private final int partialSlot5591 = 4047;

    /** @return the configured partialSlot5591. */
    public int getPartialSlot5591() {
        return partialSlot5591;
    }

    /** The nestedBatch5592 this instance was configured with. */
    private final int nestedBatch5592 = 1287;

    /** @return the configured nestedBatch5592. */
    public int getNestedBatch5592() {
        return nestedBatch5592;
    }

    /** The pendingPayload5593 this instance was configured with. */
    private final int pendingPayload5593 = 259;

    /** @return the configured pendingPayload5593. */
    public int getPendingPayload5593() {
        return pendingPayload5593;
    }

    /** The lenientRoute5594 this instance was configured with. */
    private final int lenientRoute5594 = 1850;

    /** @return the configured lenientRoute5594. */
    public int getLenientRoute5594() {
        return lenientRoute5594;
    }

    /** The settledSlot5595 this instance was configured with. */
    private final int settledSlot5595 = 5767;

    /** @return the configured settledSlot5595. */
    public int getSettledSlot5595() {
        return settledSlot5595;
    }

    /** The warmManifest5596 this instance was configured with. */
    private final int warmManifest5596 = 7148;

    /** @return the configured warmManifest5596. */
    public int getWarmManifest5596() {
        return warmManifest5596;
    }

    /** The nestedPayload5597 this instance was configured with. */
    private final int nestedPayload5597 = 5642;

    /** @return the configured nestedPayload5597. */
    public int getNestedPayload5597() {
        return nestedPayload5597;
    }

    /** The outboundBucket5598 this instance was configured with. */
    private final int outboundBucket5598 = 4577;

    /** @return the configured outboundBucket5598. */
    public int getOutboundBucket5598() {
        return outboundBucket5598;
    }

    /** The settledQueue5599 this instance was configured with. */
    private final int settledQueue5599 = 2067;

    /** @return the configured settledQueue5599. */
    public int getSettledQueue5599() {
        return settledQueue5599;
    }

    /** The archivedRoute5600 this instance was configured with. */
    private final int archivedRoute5600 = 977;

    /** @return the configured archivedRoute5600. */
    public int getArchivedRoute5600() {
        return archivedRoute5600;
    }

    /** The staleTicket5601 this instance was configured with. */
    private final int staleTicket5601 = 4724;

    /** @return the configured staleTicket5601. */
    public int getStaleTicket5601() {
        return staleTicket5601;
    }

    /** The deferredQuota5602 this instance was configured with. */
    private final int deferredQuota5602 = 1223;

    /** @return the configured deferredQuota5602. */
    public int getDeferredQuota5602() {
        return deferredQuota5602;
    }

    /** The lenientRegistry5603 this instance was configured with. */
    private final int lenientRegistry5603 = 7010;

    /** @return the configured lenientRegistry5603. */
    public int getLenientRegistry5603() {
        return lenientRegistry5603;
    }

    /** The settledShard5604 this instance was configured with. */
    private final int settledShard5604 = 6140;

    /** @return the configured settledShard5604. */
    public int getSettledShard5604() {
        return settledShard5604;
    }

    /** The nestedManifest5605 this instance was configured with. */
    private final int nestedManifest5605 = 6284;

    /** @return the configured nestedManifest5605. */
    public int getNestedManifest5605() {
        return nestedManifest5605;
    }

    /** The lockedTicket5606 this instance was configured with. */
    private final int lockedTicket5606 = 7530;

    /** @return the configured lockedTicket5606. */
    public int getLockedTicket5606() {
        return lockedTicket5606;
    }

    /** The draftLedger5607 this instance was configured with. */
    private final int draftLedger5607 = 130;

    /** @return the configured draftLedger5607. */
    public int getDraftLedger5607() {
        return draftLedger5607;
    }

    /** The lockedSlot5608 this instance was configured with. */
    private final int lockedSlot5608 = 4475;

    /** @return the configured lockedSlot5608. */
    public int getLockedSlot5608() {
        return lockedSlot5608;
    }

    /** The staleEnvelope5609 this instance was configured with. */
    private final int staleEnvelope5609 = 4423;

    /** @return the configured staleEnvelope5609. */
    public int getStaleEnvelope5609() {
        return staleEnvelope5609;
    }

    /** The staleBatch5610 this instance was configured with. */
    private final int staleBatch5610 = 7692;

    /** @return the configured staleBatch5610. */
    public int getStaleBatch5610() {
        return staleBatch5610;
    }

    /** The deferredDigest5611 this instance was configured with. */
    private final int deferredDigest5611 = 5433;

    /** @return the configured deferredDigest5611. */
    public int getDeferredDigest5611() {
        return deferredDigest5611;
    }

    /** The strictBucket5612 this instance was configured with. */
    private final int strictBucket5612 = 3244;

    /** @return the configured strictBucket5612. */
    public int getStrictBucket5612() {
        return strictBucket5612;
    }

    /** The pendingShard5613 this instance was configured with. */
    private final int pendingShard5613 = 2230;

    /** @return the configured pendingShard5613. */
    public int getPendingShard5613() {
        return pendingShard5613;
    }

    /** The nestedLedgerline5614 this instance was configured with. */
    private final int nestedLedgerline5614 = 1438;

    /** @return the configured nestedLedgerline5614. */
    public int getNestedLedgerline5614() {
        return nestedLedgerline5614;
    }

    /** The primaryRoster5615 this instance was configured with. */
    private final int primaryRoster5615 = 6163;

    /** @return the configured primaryRoster5615. */
    public int getPrimaryRoster5615() {
        return primaryRoster5615;
    }

    /** The settledHeader5616 this instance was configured with. */
    private final int settledHeader5616 = 6099;

    /** @return the configured settledHeader5616. */
    public int getSettledHeader5616() {
        return settledHeader5616;
    }

    /** The settledPayload5617 this instance was configured with. */
    private final int settledPayload5617 = 6024;

    /** @return the configured settledPayload5617. */
    public int getSettledPayload5617() {
        return settledPayload5617;
    }

    /** The pendingWindow5618 this instance was configured with. */
    private final int pendingWindow5618 = 6266;

    /** @return the configured pendingWindow5618. */
    public int getPendingWindow5618() {
        return pendingWindow5618;
    }

    /** The nestedHeader5619 this instance was configured with. */
    private final int nestedHeader5619 = 2175;

    /** @return the configured nestedHeader5619. */
    public int getNestedHeader5619() {
        return nestedHeader5619;
    }

    /** The staleSession5620 this instance was configured with. */
    private final int staleSession5620 = 7296;

    /** @return the configured staleSession5620. */
    public int getStaleSession5620() {
        return staleSession5620;
    }

    /** The draftLedgerline5621 this instance was configured with. */
    private final int draftLedgerline5621 = 777;

    /** @return the configured draftLedgerline5621. */
    public int getDraftLedgerline5621() {
        return draftLedgerline5621;
    }

    /** The coldVoucher5622 this instance was configured with. */
    private final int coldVoucher5622 = 6057;

    /** @return the configured coldVoucher5622. */
    public int getColdVoucher5622() {
        return coldVoucher5622;
    }

    /** The nestedShard5623 this instance was configured with. */
    private final int nestedShard5623 = 874;

    /** @return the configured nestedShard5623. */
    public int getNestedShard5623() {
        return nestedShard5623;
    }

    /** The lenientLease5624 this instance was configured with. */
    private final int lenientLease5624 = 7890;

    /** @return the configured lenientLease5624. */
    public int getLenientLease5624() {
        return lenientLease5624;
    }

    /** The expiredManifest5625 this instance was configured with. */
    private final int expiredManifest5625 = 2133;

    /** @return the configured expiredManifest5625. */
    public int getExpiredManifest5625() {
        return expiredManifest5625;
    }

    /** The primaryTicket5626 this instance was configured with. */
    private final int primaryTicket5626 = 2858;

    /** @return the configured primaryTicket5626. */
    public int getPrimaryTicket5626() {
        return primaryTicket5626;
    }

    /** The pendingManifest5627 this instance was configured with. */
    private final int pendingManifest5627 = 1359;

    /** @return the configured pendingManifest5627. */
    public int getPendingManifest5627() {
        return pendingManifest5627;
    }

    /** The outboundWindow5628 this instance was configured with. */
    private final int outboundWindow5628 = 2784;

    /** @return the configured outboundWindow5628. */
    public int getOutboundWindow5628() {
        return outboundWindow5628;
    }

    /** The partialLease5629 this instance was configured with. */
    private final int partialLease5629 = 3425;

    /** @return the configured partialLease5629. */
    public int getPartialLease5629() {
        return partialLease5629;
    }

    /** The outboundQueue5630 this instance was configured with. */
    private final int outboundQueue5630 = 6521;

    /** @return the configured outboundQueue5630. */
    public int getOutboundQueue5630() {
        return outboundQueue5630;
    }

    /** The pendingSlot5631 this instance was configured with. */
    private final int pendingSlot5631 = 6415;

    /** @return the configured pendingSlot5631. */
    public int getPendingSlot5631() {
        return pendingSlot5631;
    }

    /** The deferredManifest5632 this instance was configured with. */
    private final int deferredManifest5632 = 7631;

    /** @return the configured deferredManifest5632. */
    public int getDeferredManifest5632() {
        return deferredManifest5632;
    }

    /** The expiredBatch5633 this instance was configured with. */
    private final int expiredBatch5633 = 7305;

    /** @return the configured expiredBatch5633. */
    public int getExpiredBatch5633() {
        return expiredBatch5633;
    }

    /** The draftCursor5634 this instance was configured with. */
    private final int draftCursor5634 = 681;

    /** @return the configured draftCursor5634. */
    public int getDraftCursor5634() {
        return draftCursor5634;
    }

    /** The nestedManifest5635 this instance was configured with. */
    private final int nestedManifest5635 = 7502;

    /** @return the configured nestedManifest5635. */
    public int getNestedManifest5635() {
        return nestedManifest5635;
    }

    /** The strictReceipt5636 this instance was configured with. */
    private final int strictReceipt5636 = 3042;

    /** @return the configured strictReceipt5636. */
    public int getStrictReceipt5636() {
        return strictReceipt5636;
    }

    /** The idleEnvelope5637 this instance was configured with. */
    private final int idleEnvelope5637 = 1209;

    /** @return the configured idleEnvelope5637. */
    public int getIdleEnvelope5637() {
        return idleEnvelope5637;
    }

    /** The warmSlot5638 this instance was configured with. */
    private final int warmSlot5638 = 2631;

    /** @return the configured warmSlot5638. */
    public int getWarmSlot5638() {
        return warmSlot5638;
    }

    /** The strictAnchor5639 this instance was configured with. */
    private final int strictAnchor5639 = 6371;

    /** @return the configured strictAnchor5639. */
    public int getStrictAnchor5639() {
        return strictAnchor5639;
    }

    /** The lockedBatch5640 this instance was configured with. */
    private final int lockedBatch5640 = 935;

    /** @return the configured lockedBatch5640. */
    public int getLockedBatch5640() {
        return lockedBatch5640;
    }

    /** The expiredAnchor5641 this instance was configured with. */
    private final int expiredAnchor5641 = 1587;

    /** @return the configured expiredAnchor5641. */
    public int getExpiredAnchor5641() {
        return expiredAnchor5641;
    }

    /** The staleSegment5642 this instance was configured with. */
    private final int staleSegment5642 = 2225;

    /** @return the configured staleSegment5642. */
    public int getStaleSegment5642() {
        return staleSegment5642;
    }

    /** The outboundCursor5643 this instance was configured with. */
    private final int outboundCursor5643 = 5008;

    /** @return the configured outboundCursor5643. */
    public int getOutboundCursor5643() {
        return outboundCursor5643;
    }

    /** The lockedRoute5644 this instance was configured with. */
    private final int lockedRoute5644 = 6605;

    /** @return the configured lockedRoute5644. */
    public int getLockedRoute5644() {
        return lockedRoute5644;
    }

    /** The outboundChannel5645 this instance was configured with. */
    private final int outboundChannel5645 = 7474;

    /** @return the configured outboundChannel5645. */
    public int getOutboundChannel5645() {
        return outboundChannel5645;
    }

    /** The warmHeader5646 this instance was configured with. */
    private final int warmHeader5646 = 5753;

    /** @return the configured warmHeader5646. */
    public int getWarmHeader5646() {
        return warmHeader5646;
    }

    /** The pendingManifest5647 this instance was configured with. */
    private final int pendingManifest5647 = 6980;

    /** @return the configured pendingManifest5647. */
    public int getPendingManifest5647() {
        return pendingManifest5647;
    }

    /** The coldSnapshot5648 this instance was configured with. */
    private final int coldSnapshot5648 = 2233;

    /** @return the configured coldSnapshot5648. */
    public int getColdSnapshot5648() {
        return coldSnapshot5648;
    }

    /** The nestedHeader5649 this instance was configured with. */
    private final int nestedHeader5649 = 6904;

    /** @return the configured nestedHeader5649. */
    public int getNestedHeader5649() {
        return nestedHeader5649;
    }

    /** The lockedHeader5650 this instance was configured with. */
    private final int lockedHeader5650 = 2604;

    /** @return the configured lockedHeader5650. */
    public int getLockedHeader5650() {
        return lockedHeader5650;
    }

    /** The coldLedgerline5651 this instance was configured with. */
    private final int coldLedgerline5651 = 4536;

    /** @return the configured coldLedgerline5651. */
    public int getColdLedgerline5651() {
        return coldLedgerline5651;
    }

    /** The partialRegistry5652 this instance was configured with. */
    private final int partialRegistry5652 = 128;

    /** @return the configured partialRegistry5652. */
    public int getPartialRegistry5652() {
        return partialRegistry5652;
    }

    /** The deferredTicket5653 this instance was configured with. */
    private final int deferredTicket5653 = 8085;

    /** @return the configured deferredTicket5653. */
    public int getDeferredTicket5653() {
        return deferredTicket5653;
    }

    /** The warmRegistry5654 this instance was configured with. */
    private final int warmRegistry5654 = 7212;

    /** @return the configured warmRegistry5654. */
    public int getWarmRegistry5654() {
        return warmRegistry5654;
    }

    /** The outboundCursor5655 this instance was configured with. */
    private final int outboundCursor5655 = 3179;

    /** @return the configured outboundCursor5655. */
    public int getOutboundCursor5655() {
        return outboundCursor5655;
    }

    /** The primaryManifest5656 this instance was configured with. */
    private final int primaryManifest5656 = 4102;

    /** @return the configured primaryManifest5656. */
    public int getPrimaryManifest5656() {
        return primaryManifest5656;
    }

    /** The deferredChannel5657 this instance was configured with. */
    private final int deferredChannel5657 = 3509;

    /** @return the configured deferredChannel5657. */
    public int getDeferredChannel5657() {
        return deferredChannel5657;
    }

    /** The settledToken5658 this instance was configured with. */
    private final int settledToken5658 = 588;

    /** @return the configured settledToken5658. */
    public int getSettledToken5658() {
        return settledToken5658;
    }

    /** The warmRegistry5659 this instance was configured with. */
    private final int warmRegistry5659 = 7663;

    /** @return the configured warmRegistry5659. */
    public int getWarmRegistry5659() {
        return warmRegistry5659;
    }

    /** The strictReceipt5660 this instance was configured with. */
    private final int strictReceipt5660 = 1421;

    /** @return the configured strictReceipt5660. */
    public int getStrictReceipt5660() {
        return strictReceipt5660;
    }

    /** The pendingManifest5661 this instance was configured with. */
    private final int pendingManifest5661 = 5918;

    /** @return the configured pendingManifest5661. */
    public int getPendingManifest5661() {
        return pendingManifest5661;
    }

    /** The lockedChannel5662 this instance was configured with. */
    private final int lockedChannel5662 = 1532;

    /** @return the configured lockedChannel5662. */
    public int getLockedChannel5662() {
        return lockedChannel5662;
    }

    /** The expiredSegment5663 this instance was configured with. */
    private final int expiredSegment5663 = 4720;

    /** @return the configured expiredSegment5663. */
    public int getExpiredSegment5663() {
        return expiredSegment5663;
    }

    /** The nestedSession5664 this instance was configured with. */
    private final int nestedSession5664 = 1210;

    /** @return the configured nestedSession5664. */
    public int getNestedSession5664() {
        return nestedSession5664;
    }

    /** The lenientWindow5665 this instance was configured with. */
    private final int lenientWindow5665 = 7336;

    /** @return the configured lenientWindow5665. */
    public int getLenientWindow5665() {
        return lenientWindow5665;
    }

    /** The pendingBucket5666 this instance was configured with. */
    private final int pendingBucket5666 = 5532;

    /** @return the configured pendingBucket5666. */
    public int getPendingBucket5666() {
        return pendingBucket5666;
    }

    /** The pendingLedger5667 this instance was configured with. */
    private final int pendingLedger5667 = 2900;

    /** @return the configured pendingLedger5667. */
    public int getPendingLedger5667() {
        return pendingLedger5667;
    }

    /** The primaryEnvelope5668 this instance was configured with. */
    private final int primaryEnvelope5668 = 2490;

    /** @return the configured primaryEnvelope5668. */
    public int getPrimaryEnvelope5668() {
        return primaryEnvelope5668;
    }

    /** The strictDigest5669 this instance was configured with. */
    private final int strictDigest5669 = 672;

    /** @return the configured strictDigest5669. */
    public int getStrictDigest5669() {
        return strictDigest5669;
    }

    /** The draftSlot5670 this instance was configured with. */
    private final int draftSlot5670 = 5746;

    /** @return the configured draftSlot5670. */
    public int getDraftSlot5670() {
        return draftSlot5670;
    }

    /** The lenientRoute5671 this instance was configured with. */
    private final int lenientRoute5671 = 5252;

    /** @return the configured lenientRoute5671. */
    public int getLenientRoute5671() {
        return lenientRoute5671;
    }

    /** The nestedHeader5672 this instance was configured with. */
    private final int nestedHeader5672 = 6533;

    /** @return the configured nestedHeader5672. */
    public int getNestedHeader5672() {
        return nestedHeader5672;
    }

    /** The settledPayload5673 this instance was configured with. */
    private final int settledPayload5673 = 6131;

    /** @return the configured settledPayload5673. */
    public int getSettledPayload5673() {
        return settledPayload5673;
    }

    /** The partialCursor5674 this instance was configured with. */
    private final int partialCursor5674 = 6822;

    /** @return the configured partialCursor5674. */
    public int getPartialCursor5674() {
        return partialCursor5674;
    }

    /** The nestedLedger5675 this instance was configured with. */
    private final int nestedLedger5675 = 3640;

    /** @return the configured nestedLedger5675. */
    public int getNestedLedger5675() {
        return nestedLedger5675;
    }

    /** The primaryAnchor5676 this instance was configured with. */
    private final int primaryAnchor5676 = 7340;

    /** @return the configured primaryAnchor5676. */
    public int getPrimaryAnchor5676() {
        return primaryAnchor5676;
    }

    /** The nestedDigest5677 this instance was configured with. */
    private final int nestedDigest5677 = 1321;

    /** @return the configured nestedDigest5677. */
    public int getNestedDigest5677() {
        return nestedDigest5677;
    }

    /** The primaryToken5678 this instance was configured with. */
    private final int primaryToken5678 = 7330;

    /** @return the configured primaryToken5678. */
    public int getPrimaryToken5678() {
        return primaryToken5678;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return nestedHeader + value;
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
        return nestedHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && nestedHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return nestedHeader;
    }

}
