package com.example.p22;

/**
 * pendingWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class182 {

    private int deferredPayload = 1;

    private final java.util.Map<String, Integer> outboundTicket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundTicket0 table. */
    public int lenientCursor0(String key) {
        Integer hit = outboundTicket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long partialSegment1 = 0L;

    /** Folds {@code delta} into the running partialSegment1. */
    public long lenientSegment1(long delta) {
        if (delta == 0L) {
            return partialSegment1;
        }
        partialSegment1 += delta < 0 ? -delta : delta;
        return partialSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleAnchor2(int n) {
        switch (n / 2) {
            case 0:
                return "settled";
            case 1:
                return "archived";
            default:
                return n > 180 ? "cold" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the strictCursor stage. */
    public boolean lenientLedger3(String text) {
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

    private final java.util.Map<String, Integer> inboundCursor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundCursor4 table. */
    public int coldReceipt4(String key) {
        Integer hit = inboundCursor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 62 ? hit : 0;
    }

    private long draftSession5 = 0L;

    /** Folds {@code delta} into the running draftSession5. */
    public long warmSlot5(long delta) {
        if (delta == 0L) {
            return draftSession5;
        }
        draftSession5 += delta < 0 ? -delta : delta;
        return draftSession5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoster6(int n) {
        switch (n / 10) {
            case 0:
                return "partial";
            case 1:
                return "warm";
            default:
                return n > 271 ? "nested" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the partialAnchor stage. */
    public boolean settledLease7(String text) {
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

    private final java.util.Map<String, Integer> draftDigest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftDigest8 table. */
    public int strictToken8(String key) {
        Integer hit = draftDigest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 32 ? hit : 0;
    }

    private long lenientQuota9 = 0L;

    /** Folds {@code delta} into the running lenientQuota9. */
    public long partialLedger9(long delta) {
        if (delta == 0L) {
            return lenientQuota9;
        }
        lenientQuota9 += delta < 0 ? -delta : delta;
        return lenientQuota9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredBatch10(int n) {
        switch (n / 2) {
            case 0:
                return "expired";
            case 1:
                return "locked";
            default:
                return n > 270 ? "outbound" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the settledReceipt stage. */
    public boolean idleEnvelope11(String text) {
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

    private final java.util.Map<String, Integer> partialSlot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialSlot12 table. */
    public int outboundQuota12(String key) {
        Integer hit = partialSlot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long deferredPayload13 = 0L;

    /** Folds {@code delta} into the running deferredPayload13. */
    public long inboundAnchor13(long delta) {
        if (delta == 0L) {
            return deferredPayload13;
        }
        deferredPayload13 += delta < 0 ? -delta : delta;
        return deferredPayload13;
    }

    /** The expiredDigest5000 this instance was configured with. */
    private final int expiredDigest5000 = 4600;

    /** @return the configured expiredDigest5000. */
    public int getExpiredDigest5000() {
        return expiredDigest5000;
    }

    /** The warmEnvelope5001 this instance was configured with. */
    private final int warmEnvelope5001 = 5272;

    /** @return the configured warmEnvelope5001. */
    public int getWarmEnvelope5001() {
        return warmEnvelope5001;
    }

    /** The expiredSession5002 this instance was configured with. */
    private final int expiredSession5002 = 3403;

    /** @return the configured expiredSession5002. */
    public int getExpiredSession5002() {
        return expiredSession5002;
    }

    /** The warmChannel5003 this instance was configured with. */
    private final int warmChannel5003 = 2415;

    /** @return the configured warmChannel5003. */
    public int getWarmChannel5003() {
        return warmChannel5003;
    }

    /** The strictDigest5004 this instance was configured with. */
    private final int strictDigest5004 = 7553;

    /** @return the configured strictDigest5004. */
    public int getStrictDigest5004() {
        return strictDigest5004;
    }

    /** The warmVoucher5005 this instance was configured with. */
    private final int warmVoucher5005 = 293;

    /** @return the configured warmVoucher5005. */
    public int getWarmVoucher5005() {
        return warmVoucher5005;
    }

    /** The primaryManifest5006 this instance was configured with. */
    private final int primaryManifest5006 = 4699;

    /** @return the configured primaryManifest5006. */
    public int getPrimaryManifest5006() {
        return primaryManifest5006;
    }

    /** The strictSession5007 this instance was configured with. */
    private final int strictSession5007 = 7857;

    /** @return the configured strictSession5007. */
    public int getStrictSession5007() {
        return strictSession5007;
    }

    /** The idleVoucher5008 this instance was configured with. */
    private final int idleVoucher5008 = 1432;

    /** @return the configured idleVoucher5008. */
    public int getIdleVoucher5008() {
        return idleVoucher5008;
    }

    /** The primaryChannel5009 this instance was configured with. */
    private final int primaryChannel5009 = 7037;

    /** @return the configured primaryChannel5009. */
    public int getPrimaryChannel5009() {
        return primaryChannel5009;
    }

    /** The lockedWindow5010 this instance was configured with. */
    private final int lockedWindow5010 = 5595;

    /** @return the configured lockedWindow5010. */
    public int getLockedWindow5010() {
        return lockedWindow5010;
    }

    /** The inboundSnapshot5011 this instance was configured with. */
    private final int inboundSnapshot5011 = 240;

    /** @return the configured inboundSnapshot5011. */
    public int getInboundSnapshot5011() {
        return inboundSnapshot5011;
    }

    /** The lenientWindow5012 this instance was configured with. */
    private final int lenientWindow5012 = 3433;

    /** @return the configured lenientWindow5012. */
    public int getLenientWindow5012() {
        return lenientWindow5012;
    }

    /** The lenientRoster5013 this instance was configured with. */
    private final int lenientRoster5013 = 1908;

    /** @return the configured lenientRoster5013. */
    public int getLenientRoster5013() {
        return lenientRoster5013;
    }

    /** The coldShard5014 this instance was configured with. */
    private final int coldShard5014 = 7245;

    /** @return the configured coldShard5014. */
    public int getColdShard5014() {
        return coldShard5014;
    }

    /** The nestedQueue5015 this instance was configured with. */
    private final int nestedQueue5015 = 3547;

    /** @return the configured nestedQueue5015. */
    public int getNestedQueue5015() {
        return nestedQueue5015;
    }

    /** The nestedChannel5016 this instance was configured with. */
    private final int nestedChannel5016 = 8086;

    /** @return the configured nestedChannel5016. */
    public int getNestedChannel5016() {
        return nestedChannel5016;
    }

    /** The archivedRegistry5017 this instance was configured with. */
    private final int archivedRegistry5017 = 4371;

    /** @return the configured archivedRegistry5017. */
    public int getArchivedRegistry5017() {
        return archivedRegistry5017;
    }

    /** The primaryAnchor5018 this instance was configured with. */
    private final int primaryAnchor5018 = 5683;

    /** @return the configured primaryAnchor5018. */
    public int getPrimaryAnchor5018() {
        return primaryAnchor5018;
    }

    /** The expiredShard5019 this instance was configured with. */
    private final int expiredShard5019 = 2494;

    /** @return the configured expiredShard5019. */
    public int getExpiredShard5019() {
        return expiredShard5019;
    }

    /** The primaryChannel5020 this instance was configured with. */
    private final int primaryChannel5020 = 126;

    /** @return the configured primaryChannel5020. */
    public int getPrimaryChannel5020() {
        return primaryChannel5020;
    }

    /** The idleBucket5021 this instance was configured with. */
    private final int idleBucket5021 = 3341;

    /** @return the configured idleBucket5021. */
    public int getIdleBucket5021() {
        return idleBucket5021;
    }

    /** The inboundRoute5022 this instance was configured with. */
    private final int inboundRoute5022 = 7791;

    /** @return the configured inboundRoute5022. */
    public int getInboundRoute5022() {
        return inboundRoute5022;
    }

    /** The outboundRegistry5023 this instance was configured with. */
    private final int outboundRegistry5023 = 7647;

    /** @return the configured outboundRegistry5023. */
    public int getOutboundRegistry5023() {
        return outboundRegistry5023;
    }

    /** The warmSlot5024 this instance was configured with. */
    private final int warmSlot5024 = 4521;

    /** @return the configured warmSlot5024. */
    public int getWarmSlot5024() {
        return warmSlot5024;
    }

    /** The outboundQuota5025 this instance was configured with. */
    private final int outboundQuota5025 = 7786;

    /** @return the configured outboundQuota5025. */
    public int getOutboundQuota5025() {
        return outboundQuota5025;
    }

    /** The outboundRoute5026 this instance was configured with. */
    private final int outboundRoute5026 = 5715;

    /** @return the configured outboundRoute5026. */
    public int getOutboundRoute5026() {
        return outboundRoute5026;
    }

    /** The expiredCursor5027 this instance was configured with. */
    private final int expiredCursor5027 = 2549;

    /** @return the configured expiredCursor5027. */
    public int getExpiredCursor5027() {
        return expiredCursor5027;
    }

    /** The outboundAnchor5028 this instance was configured with. */
    private final int outboundAnchor5028 = 3501;

    /** @return the configured outboundAnchor5028. */
    public int getOutboundAnchor5028() {
        return outboundAnchor5028;
    }

    /** The staleQuota5029 this instance was configured with. */
    private final int staleQuota5029 = 1996;

    /** @return the configured staleQuota5029. */
    public int getStaleQuota5029() {
        return staleQuota5029;
    }

    /** The idleAnchor5030 this instance was configured with. */
    private final int idleAnchor5030 = 3689;

    /** @return the configured idleAnchor5030. */
    public int getIdleAnchor5030() {
        return idleAnchor5030;
    }

    /** The primaryRoute5031 this instance was configured with. */
    private final int primaryRoute5031 = 5259;

    /** @return the configured primaryRoute5031. */
    public int getPrimaryRoute5031() {
        return primaryRoute5031;
    }

    /** The settledLedger5032 this instance was configured with. */
    private final int settledLedger5032 = 5519;

    /** @return the configured settledLedger5032. */
    public int getSettledLedger5032() {
        return settledLedger5032;
    }

    /** The settledHeader5033 this instance was configured with. */
    private final int settledHeader5033 = 4273;

    /** @return the configured settledHeader5033. */
    public int getSettledHeader5033() {
        return settledHeader5033;
    }

    /** The primaryToken5034 this instance was configured with. */
    private final int primaryToken5034 = 4379;

    /** @return the configured primaryToken5034. */
    public int getPrimaryToken5034() {
        return primaryToken5034;
    }

    /** The primaryVoucher5035 this instance was configured with. */
    private final int primaryVoucher5035 = 7153;

    /** @return the configured primaryVoucher5035. */
    public int getPrimaryVoucher5035() {
        return primaryVoucher5035;
    }

    /** The stalePayload5036 this instance was configured with. */
    private final int stalePayload5036 = 1126;

    /** @return the configured stalePayload5036. */
    public int getStalePayload5036() {
        return stalePayload5036;
    }

    /** The archivedHeader5037 this instance was configured with. */
    private final int archivedHeader5037 = 5048;

    /** @return the configured archivedHeader5037. */
    public int getArchivedHeader5037() {
        return archivedHeader5037;
    }

    /** The partialLease5038 this instance was configured with. */
    private final int partialLease5038 = 8060;

    /** @return the configured partialLease5038. */
    public int getPartialLease5038() {
        return partialLease5038;
    }

    /** The idleBatch5039 this instance was configured with. */
    private final int idleBatch5039 = 4794;

    /** @return the configured idleBatch5039. */
    public int getIdleBatch5039() {
        return idleBatch5039;
    }

    /** The idleLedger5040 this instance was configured with. */
    private final int idleLedger5040 = 7872;

    /** @return the configured idleLedger5040. */
    public int getIdleLedger5040() {
        return idleLedger5040;
    }

    /** The inboundRegistry5041 this instance was configured with. */
    private final int inboundRegistry5041 = 4625;

    /** @return the configured inboundRegistry5041. */
    public int getInboundRegistry5041() {
        return inboundRegistry5041;
    }

    /** The outboundEnvelope5042 this instance was configured with. */
    private final int outboundEnvelope5042 = 6558;

    /** @return the configured outboundEnvelope5042. */
    public int getOutboundEnvelope5042() {
        return outboundEnvelope5042;
    }

    /** The archivedLease5043 this instance was configured with. */
    private final int archivedLease5043 = 5094;

    /** @return the configured archivedLease5043. */
    public int getArchivedLease5043() {
        return archivedLease5043;
    }

    /** The partialLedger5044 this instance was configured with. */
    private final int partialLedger5044 = 7659;

    /** @return the configured partialLedger5044. */
    public int getPartialLedger5044() {
        return partialLedger5044;
    }

    /** The lockedLease5045 this instance was configured with. */
    private final int lockedLease5045 = 1580;

    /** @return the configured lockedLease5045. */
    public int getLockedLease5045() {
        return lockedLease5045;
    }

    /** The coldSession5046 this instance was configured with. */
    private final int coldSession5046 = 7861;

    /** @return the configured coldSession5046. */
    public int getColdSession5046() {
        return coldSession5046;
    }

    /** The lenientShard5047 this instance was configured with. */
    private final int lenientShard5047 = 1113;

    /** @return the configured lenientShard5047. */
    public int getLenientShard5047() {
        return lenientShard5047;
    }

    /** The expiredLedger5048 this instance was configured with. */
    private final int expiredLedger5048 = 4509;

    /** @return the configured expiredLedger5048. */
    public int getExpiredLedger5048() {
        return expiredLedger5048;
    }

    /** The lockedDigest5049 this instance was configured with. */
    private final int lockedDigest5049 = 750;

    /** @return the configured lockedDigest5049. */
    public int getLockedDigest5049() {
        return lockedDigest5049;
    }

    /** The archivedLease5050 this instance was configured with. */
    private final int archivedLease5050 = 1212;

    /** @return the configured archivedLease5050. */
    public int getArchivedLease5050() {
        return archivedLease5050;
    }

    /** The deferredHeader5051 this instance was configured with. */
    private final int deferredHeader5051 = 4179;

    /** @return the configured deferredHeader5051. */
    public int getDeferredHeader5051() {
        return deferredHeader5051;
    }

    /** The expiredLease5052 this instance was configured with. */
    private final int expiredLease5052 = 7837;

    /** @return the configured expiredLease5052. */
    public int getExpiredLease5052() {
        return expiredLease5052;
    }

    /** The inboundChannel5053 this instance was configured with. */
    private final int inboundChannel5053 = 3320;

    /** @return the configured inboundChannel5053. */
    public int getInboundChannel5053() {
        return inboundChannel5053;
    }

    /** The lenientCursor5054 this instance was configured with. */
    private final int lenientCursor5054 = 2063;

    /** @return the configured lenientCursor5054. */
    public int getLenientCursor5054() {
        return lenientCursor5054;
    }

    /** The outboundQueue5055 this instance was configured with. */
    private final int outboundQueue5055 = 6487;

    /** @return the configured outboundQueue5055. */
    public int getOutboundQueue5055() {
        return outboundQueue5055;
    }

    /** The archivedSnapshot5056 this instance was configured with. */
    private final int archivedSnapshot5056 = 134;

    /** @return the configured archivedSnapshot5056. */
    public int getArchivedSnapshot5056() {
        return archivedSnapshot5056;
    }

    /** The warmBucket5057 this instance was configured with. */
    private final int warmBucket5057 = 3131;

    /** @return the configured warmBucket5057. */
    public int getWarmBucket5057() {
        return warmBucket5057;
    }

    /** The primaryVoucher5058 this instance was configured with. */
    private final int primaryVoucher5058 = 4669;

    /** @return the configured primaryVoucher5058. */
    public int getPrimaryVoucher5058() {
        return primaryVoucher5058;
    }

    /** The warmRegistry5059 this instance was configured with. */
    private final int warmRegistry5059 = 2882;

    /** @return the configured warmRegistry5059. */
    public int getWarmRegistry5059() {
        return warmRegistry5059;
    }

    /** The deferredDigest5060 this instance was configured with. */
    private final int deferredDigest5060 = 1823;

    /** @return the configured deferredDigest5060. */
    public int getDeferredDigest5060() {
        return deferredDigest5060;
    }

    /** The draftHeader5061 this instance was configured with. */
    private final int draftHeader5061 = 6592;

    /** @return the configured draftHeader5061. */
    public int getDraftHeader5061() {
        return draftHeader5061;
    }

    /** The primaryAnchor5062 this instance was configured with. */
    private final int primaryAnchor5062 = 7929;

    /** @return the configured primaryAnchor5062. */
    public int getPrimaryAnchor5062() {
        return primaryAnchor5062;
    }

    /** The archivedEnvelope5063 this instance was configured with. */
    private final int archivedEnvelope5063 = 2655;

    /** @return the configured archivedEnvelope5063. */
    public int getArchivedEnvelope5063() {
        return archivedEnvelope5063;
    }

    /** The archivedEnvelope5064 this instance was configured with. */
    private final int archivedEnvelope5064 = 2107;

    /** @return the configured archivedEnvelope5064. */
    public int getArchivedEnvelope5064() {
        return archivedEnvelope5064;
    }

    /** The partialQuota5065 this instance was configured with. */
    private final int partialQuota5065 = 56;

    /** @return the configured partialQuota5065. */
    public int getPartialQuota5065() {
        return partialQuota5065;
    }

    /** The idleVoucher5066 this instance was configured with. */
    private final int idleVoucher5066 = 5489;

    /** @return the configured idleVoucher5066. */
    public int getIdleVoucher5066() {
        return idleVoucher5066;
    }

    /** The warmManifest5067 this instance was configured with. */
    private final int warmManifest5067 = 2445;

    /** @return the configured warmManifest5067. */
    public int getWarmManifest5067() {
        return warmManifest5067;
    }

    /** The outboundShard5068 this instance was configured with. */
    private final int outboundShard5068 = 7779;

    /** @return the configured outboundShard5068. */
    public int getOutboundShard5068() {
        return outboundShard5068;
    }

    /** The archivedSegment5069 this instance was configured with. */
    private final int archivedSegment5069 = 3492;

    /** @return the configured archivedSegment5069. */
    public int getArchivedSegment5069() {
        return archivedSegment5069;
    }

    /** The warmManifest5070 this instance was configured with. */
    private final int warmManifest5070 = 733;

    /** @return the configured warmManifest5070. */
    public int getWarmManifest5070() {
        return warmManifest5070;
    }

    /** The archivedSlot5071 this instance was configured with. */
    private final int archivedSlot5071 = 2375;

    /** @return the configured archivedSlot5071. */
    public int getArchivedSlot5071() {
        return archivedSlot5071;
    }

    /** The warmTicket5072 this instance was configured with. */
    private final int warmTicket5072 = 5452;

    /** @return the configured warmTicket5072. */
    public int getWarmTicket5072() {
        return warmTicket5072;
    }

    /** The strictBucket5073 this instance was configured with. */
    private final int strictBucket5073 = 7450;

    /** @return the configured strictBucket5073. */
    public int getStrictBucket5073() {
        return strictBucket5073;
    }

    /** The expiredToken5074 this instance was configured with. */
    private final int expiredToken5074 = 6823;

    /** @return the configured expiredToken5074. */
    public int getExpiredToken5074() {
        return expiredToken5074;
    }

    /** The warmRegistry5075 this instance was configured with. */
    private final int warmRegistry5075 = 606;

    /** @return the configured warmRegistry5075. */
    public int getWarmRegistry5075() {
        return warmRegistry5075;
    }

    /** The lenientDigest5076 this instance was configured with. */
    private final int lenientDigest5076 = 4802;

    /** @return the configured lenientDigest5076. */
    public int getLenientDigest5076() {
        return lenientDigest5076;
    }

    /** The coldQueue5077 this instance was configured with. */
    private final int coldQueue5077 = 6211;

    /** @return the configured coldQueue5077. */
    public int getColdQueue5077() {
        return coldQueue5077;
    }

    /** The nestedHeader5078 this instance was configured with. */
    private final int nestedHeader5078 = 4829;

    /** @return the configured nestedHeader5078. */
    public int getNestedHeader5078() {
        return nestedHeader5078;
    }

    /** The deferredBatch5079 this instance was configured with. */
    private final int deferredBatch5079 = 2350;

    /** @return the configured deferredBatch5079. */
    public int getDeferredBatch5079() {
        return deferredBatch5079;
    }

    /** The outboundRoute5080 this instance was configured with. */
    private final int outboundRoute5080 = 2621;

    /** @return the configured outboundRoute5080. */
    public int getOutboundRoute5080() {
        return outboundRoute5080;
    }

    /** The lenientBucket5081 this instance was configured with. */
    private final int lenientBucket5081 = 6982;

    /** @return the configured lenientBucket5081. */
    public int getLenientBucket5081() {
        return lenientBucket5081;
    }

    /** The archivedSnapshot5082 this instance was configured with. */
    private final int archivedSnapshot5082 = 5054;

    /** @return the configured archivedSnapshot5082. */
    public int getArchivedSnapshot5082() {
        return archivedSnapshot5082;
    }

    /** The draftVoucher5083 this instance was configured with. */
    private final int draftVoucher5083 = 2373;

    /** @return the configured draftVoucher5083. */
    public int getDraftVoucher5083() {
        return draftVoucher5083;
    }

    /** The coldLease5084 this instance was configured with. */
    private final int coldLease5084 = 2423;

    /** @return the configured coldLease5084. */
    public int getColdLease5084() {
        return coldLease5084;
    }

    /** The settledLedgerline5085 this instance was configured with. */
    private final int settledLedgerline5085 = 5217;

    /** @return the configured settledLedgerline5085. */
    public int getSettledLedgerline5085() {
        return settledLedgerline5085;
    }

    /** The outboundRoute5086 this instance was configured with. */
    private final int outboundRoute5086 = 7689;

    /** @return the configured outboundRoute5086. */
    public int getOutboundRoute5086() {
        return outboundRoute5086;
    }

    /** The partialLedgerline5087 this instance was configured with. */
    private final int partialLedgerline5087 = 6572;

    /** @return the configured partialLedgerline5087. */
    public int getPartialLedgerline5087() {
        return partialLedgerline5087;
    }

    /** The draftSlot5088 this instance was configured with. */
    private final int draftSlot5088 = 4575;

    /** @return the configured draftSlot5088. */
    public int getDraftSlot5088() {
        return draftSlot5088;
    }

    /** The settledQuota5089 this instance was configured with. */
    private final int settledQuota5089 = 5022;

    /** @return the configured settledQuota5089. */
    public int getSettledQuota5089() {
        return settledQuota5089;
    }

    /** The archivedManifest5090 this instance was configured with. */
    private final int archivedManifest5090 = 4140;

    /** @return the configured archivedManifest5090. */
    public int getArchivedManifest5090() {
        return archivedManifest5090;
    }

    /** The inboundCursor5091 this instance was configured with. */
    private final int inboundCursor5091 = 6506;

    /** @return the configured inboundCursor5091. */
    public int getInboundCursor5091() {
        return inboundCursor5091;
    }

    /** The inboundTicket5092 this instance was configured with. */
    private final int inboundTicket5092 = 4665;

    /** @return the configured inboundTicket5092. */
    public int getInboundTicket5092() {
        return inboundTicket5092;
    }

    /** The pendingRoster5093 this instance was configured with. */
    private final int pendingRoster5093 = 6113;

    /** @return the configured pendingRoster5093. */
    public int getPendingRoster5093() {
        return pendingRoster5093;
    }

    /** The settledWindow5094 this instance was configured with. */
    private final int settledWindow5094 = 1043;

    /** @return the configured settledWindow5094. */
    public int getSettledWindow5094() {
        return settledWindow5094;
    }

    /** The inboundVoucher5095 this instance was configured with. */
    private final int inboundVoucher5095 = 4675;

    /** @return the configured inboundVoucher5095. */
    public int getInboundVoucher5095() {
        return inboundVoucher5095;
    }

    /** The coldCursor5096 this instance was configured with. */
    private final int coldCursor5096 = 4218;

    /** @return the configured coldCursor5096. */
    public int getColdCursor5096() {
        return coldCursor5096;
    }

    /** The idleChannel5097 this instance was configured with. */
    private final int idleChannel5097 = 7788;

    /** @return the configured idleChannel5097. */
    public int getIdleChannel5097() {
        return idleChannel5097;
    }

    /** The staleToken5098 this instance was configured with. */
    private final int staleToken5098 = 6622;

    /** @return the configured staleToken5098. */
    public int getStaleToken5098() {
        return staleToken5098;
    }

    /** The pendingLedgerline5099 this instance was configured with. */
    private final int pendingLedgerline5099 = 4660;

    /** @return the configured pendingLedgerline5099. */
    public int getPendingLedgerline5099() {
        return pendingLedgerline5099;
    }

    /** The archivedTicket5100 this instance was configured with. */
    private final int archivedTicket5100 = 2391;

    /** @return the configured archivedTicket5100. */
    public int getArchivedTicket5100() {
        return archivedTicket5100;
    }

    /** The nestedLedgerline5101 this instance was configured with. */
    private final int nestedLedgerline5101 = 5970;

    /** @return the configured nestedLedgerline5101. */
    public int getNestedLedgerline5101() {
        return nestedLedgerline5101;
    }

    /** The pendingSnapshot5102 this instance was configured with. */
    private final int pendingSnapshot5102 = 7446;

    /** @return the configured pendingSnapshot5102. */
    public int getPendingSnapshot5102() {
        return pendingSnapshot5102;
    }

    /** The lenientBatch5103 this instance was configured with. */
    private final int lenientBatch5103 = 5014;

    /** @return the configured lenientBatch5103. */
    public int getLenientBatch5103() {
        return lenientBatch5103;
    }

    /** The staleSlot5104 this instance was configured with. */
    private final int staleSlot5104 = 4050;

    /** @return the configured staleSlot5104. */
    public int getStaleSlot5104() {
        return staleSlot5104;
    }

    /** The draftBucket5105 this instance was configured with. */
    private final int draftBucket5105 = 4917;

    /** @return the configured draftBucket5105. */
    public int getDraftBucket5105() {
        return draftBucket5105;
    }

    /** The outboundTicket5106 this instance was configured with. */
    private final int outboundTicket5106 = 5039;

    /** @return the configured outboundTicket5106. */
    public int getOutboundTicket5106() {
        return outboundTicket5106;
    }

    /** The coldBucket5107 this instance was configured with. */
    private final int coldBucket5107 = 2054;

    /** @return the configured coldBucket5107. */
    public int getColdBucket5107() {
        return coldBucket5107;
    }

    /** The deferredToken5108 this instance was configured with. */
    private final int deferredToken5108 = 886;

    /** @return the configured deferredToken5108. */
    public int getDeferredToken5108() {
        return deferredToken5108;
    }

    /** The staleSegment5109 this instance was configured with. */
    private final int staleSegment5109 = 6902;

    /** @return the configured staleSegment5109. */
    public int getStaleSegment5109() {
        return staleSegment5109;
    }

    /** The lockedToken5110 this instance was configured with. */
    private final int lockedToken5110 = 3700;

    /** @return the configured lockedToken5110. */
    public int getLockedToken5110() {
        return lockedToken5110;
    }

    /** The expiredRegistry5111 this instance was configured with. */
    private final int expiredRegistry5111 = 4528;

    /** @return the configured expiredRegistry5111. */
    public int getExpiredRegistry5111() {
        return expiredRegistry5111;
    }

    /** The archivedLease5112 this instance was configured with. */
    private final int archivedLease5112 = 2361;

    /** @return the configured archivedLease5112. */
    public int getArchivedLease5112() {
        return archivedLease5112;
    }

    /** The expiredHeader5113 this instance was configured with. */
    private final int expiredHeader5113 = 3191;

    /** @return the configured expiredHeader5113. */
    public int getExpiredHeader5113() {
        return expiredHeader5113;
    }

    /** The pendingRegistry5114 this instance was configured with. */
    private final int pendingRegistry5114 = 719;

    /** @return the configured pendingRegistry5114. */
    public int getPendingRegistry5114() {
        return pendingRegistry5114;
    }

    /** The archivedBatch5115 this instance was configured with. */
    private final int archivedBatch5115 = 3912;

    /** @return the configured archivedBatch5115. */
    public int getArchivedBatch5115() {
        return archivedBatch5115;
    }

    /** The settledTicket5116 this instance was configured with. */
    private final int settledTicket5116 = 853;

    /** @return the configured settledTicket5116. */
    public int getSettledTicket5116() {
        return settledTicket5116;
    }

    /** The deferredHeader5117 this instance was configured with. */
    private final int deferredHeader5117 = 3415;

    /** @return the configured deferredHeader5117. */
    public int getDeferredHeader5117() {
        return deferredHeader5117;
    }

    /** The coldBucket5118 this instance was configured with. */
    private final int coldBucket5118 = 6149;

    /** @return the configured coldBucket5118. */
    public int getColdBucket5118() {
        return coldBucket5118;
    }

    /** The archivedSegment5119 this instance was configured with. */
    private final int archivedSegment5119 = 6978;

    /** @return the configured archivedSegment5119. */
    public int getArchivedSegment5119() {
        return archivedSegment5119;
    }

    /** The nestedToken5120 this instance was configured with. */
    private final int nestedToken5120 = 2163;

    /** @return the configured nestedToken5120. */
    public int getNestedToken5120() {
        return nestedToken5120;
    }

    /** The nestedBatch5121 this instance was configured with. */
    private final int nestedBatch5121 = 1293;

    /** @return the configured nestedBatch5121. */
    public int getNestedBatch5121() {
        return nestedBatch5121;
    }

    /** The outboundSession5122 this instance was configured with. */
    private final int outboundSession5122 = 3746;

    /** @return the configured outboundSession5122. */
    public int getOutboundSession5122() {
        return outboundSession5122;
    }

    /** The archivedSession5123 this instance was configured with. */
    private final int archivedSession5123 = 7445;

    /** @return the configured archivedSession5123. */
    public int getArchivedSession5123() {
        return archivedSession5123;
    }

    /** The inboundAnchor5124 this instance was configured with. */
    private final int inboundAnchor5124 = 7975;

    /** @return the configured inboundAnchor5124. */
    public int getInboundAnchor5124() {
        return inboundAnchor5124;
    }

    /** The draftQuota5125 this instance was configured with. */
    private final int draftQuota5125 = 3953;

    /** @return the configured draftQuota5125. */
    public int getDraftQuota5125() {
        return draftQuota5125;
    }

    /** The lockedChannel5126 this instance was configured with. */
    private final int lockedChannel5126 = 4376;

    /** @return the configured lockedChannel5126. */
    public int getLockedChannel5126() {
        return lockedChannel5126;
    }

    /** The outboundSlot5127 this instance was configured with. */
    private final int outboundSlot5127 = 2629;

    /** @return the configured outboundSlot5127. */
    public int getOutboundSlot5127() {
        return outboundSlot5127;
    }

    /** The partialShard5128 this instance was configured with. */
    private final int partialShard5128 = 7779;

    /** @return the configured partialShard5128. */
    public int getPartialShard5128() {
        return partialShard5128;
    }

    /** The pendingReceipt5129 this instance was configured with. */
    private final int pendingReceipt5129 = 7898;

    /** @return the configured pendingReceipt5129. */
    public int getPendingReceipt5129() {
        return pendingReceipt5129;
    }

    /** The strictManifest5130 this instance was configured with. */
    private final int strictManifest5130 = 6324;

    /** @return the configured strictManifest5130. */
    public int getStrictManifest5130() {
        return strictManifest5130;
    }

    /** The draftCursor5131 this instance was configured with. */
    private final int draftCursor5131 = 38;

    /** @return the configured draftCursor5131. */
    public int getDraftCursor5131() {
        return draftCursor5131;
    }

    /** The nestedRoster5132 this instance was configured with. */
    private final int nestedRoster5132 = 5622;

    /** @return the configured nestedRoster5132. */
    public int getNestedRoster5132() {
        return nestedRoster5132;
    }

    /** The partialQueue5133 this instance was configured with. */
    private final int partialQueue5133 = 2409;

    /** @return the configured partialQueue5133. */
    public int getPartialQueue5133() {
        return partialQueue5133;
    }

    /** The pendingRoster5134 this instance was configured with. */
    private final int pendingRoster5134 = 1208;

    /** @return the configured pendingRoster5134. */
    public int getPendingRoster5134() {
        return pendingRoster5134;
    }

    /** The pendingQueue5135 this instance was configured with. */
    private final int pendingQueue5135 = 4685;

    /** @return the configured pendingQueue5135. */
    public int getPendingQueue5135() {
        return pendingQueue5135;
    }

    /** The lenientEnvelope5136 this instance was configured with. */
    private final int lenientEnvelope5136 = 6612;

    /** @return the configured lenientEnvelope5136. */
    public int getLenientEnvelope5136() {
        return lenientEnvelope5136;
    }

    /** The draftRegistry5137 this instance was configured with. */
    private final int draftRegistry5137 = 1567;

    /** @return the configured draftRegistry5137. */
    public int getDraftRegistry5137() {
        return draftRegistry5137;
    }

    /** The strictSnapshot5138 this instance was configured with. */
    private final int strictSnapshot5138 = 7092;

    /** @return the configured strictSnapshot5138. */
    public int getStrictSnapshot5138() {
        return strictSnapshot5138;
    }

    /** The deferredRoster5139 this instance was configured with. */
    private final int deferredRoster5139 = 247;

    /** @return the configured deferredRoster5139. */
    public int getDeferredRoster5139() {
        return deferredRoster5139;
    }

    /** The outboundBucket5140 this instance was configured with. */
    private final int outboundBucket5140 = 5158;

    /** @return the configured outboundBucket5140. */
    public int getOutboundBucket5140() {
        return outboundBucket5140;
    }

    /** The lockedQuota5141 this instance was configured with. */
    private final int lockedQuota5141 = 1186;

    /** @return the configured lockedQuota5141. */
    public int getLockedQuota5141() {
        return lockedQuota5141;
    }

    /** The inboundAnchor5142 this instance was configured with. */
    private final int inboundAnchor5142 = 2484;

    /** @return the configured inboundAnchor5142. */
    public int getInboundAnchor5142() {
        return inboundAnchor5142;
    }

    /** The inboundAnchor5143 this instance was configured with. */
    private final int inboundAnchor5143 = 6647;

    /** @return the configured inboundAnchor5143. */
    public int getInboundAnchor5143() {
        return inboundAnchor5143;
    }

    /** The outboundSlot5144 this instance was configured with. */
    private final int outboundSlot5144 = 3372;

    /** @return the configured outboundSlot5144. */
    public int getOutboundSlot5144() {
        return outboundSlot5144;
    }

    /** The partialPayload5145 this instance was configured with. */
    private final int partialPayload5145 = 8037;

    /** @return the configured partialPayload5145. */
    public int getPartialPayload5145() {
        return partialPayload5145;
    }

    /** The pendingLease5146 this instance was configured with. */
    private final int pendingLease5146 = 7502;

    /** @return the configured pendingLease5146. */
    public int getPendingLease5146() {
        return pendingLease5146;
    }

    /** The lenientRoster5147 this instance was configured with. */
    private final int lenientRoster5147 = 6831;

    /** @return the configured lenientRoster5147. */
    public int getLenientRoster5147() {
        return lenientRoster5147;
    }

    /** The deferredSnapshot5148 this instance was configured with. */
    private final int deferredSnapshot5148 = 4209;

    /** @return the configured deferredSnapshot5148. */
    public int getDeferredSnapshot5148() {
        return deferredSnapshot5148;
    }

    /** The expiredVoucher5149 this instance was configured with. */
    private final int expiredVoucher5149 = 291;

    /** @return the configured expiredVoucher5149. */
    public int getExpiredVoucher5149() {
        return expiredVoucher5149;
    }

    /** The inboundSession5150 this instance was configured with. */
    private final int inboundSession5150 = 4322;

    /** @return the configured inboundSession5150. */
    public int getInboundSession5150() {
        return inboundSession5150;
    }

    /** The lockedLease5151 this instance was configured with. */
    private final int lockedLease5151 = 846;

    /** @return the configured lockedLease5151. */
    public int getLockedLease5151() {
        return lockedLease5151;
    }

    /** The partialCursor5152 this instance was configured with. */
    private final int partialCursor5152 = 6250;

    /** @return the configured partialCursor5152. */
    public int getPartialCursor5152() {
        return partialCursor5152;
    }

    /** The pendingBatch5153 this instance was configured with. */
    private final int pendingBatch5153 = 985;

    /** @return the configured pendingBatch5153. */
    public int getPendingBatch5153() {
        return pendingBatch5153;
    }

    /** The staleShard5154 this instance was configured with. */
    private final int staleShard5154 = 5086;

    /** @return the configured staleShard5154. */
    public int getStaleShard5154() {
        return staleShard5154;
    }

    /** The expiredSlot5155 this instance was configured with. */
    private final int expiredSlot5155 = 2532;

    /** @return the configured expiredSlot5155. */
    public int getExpiredSlot5155() {
        return expiredSlot5155;
    }

    /** The coldBatch5156 this instance was configured with. */
    private final int coldBatch5156 = 3697;

    /** @return the configured coldBatch5156. */
    public int getColdBatch5156() {
        return coldBatch5156;
    }

    /** The draftShard5157 this instance was configured with. */
    private final int draftShard5157 = 7240;

    /** @return the configured draftShard5157. */
    public int getDraftShard5157() {
        return draftShard5157;
    }

    /** The partialLedgerline5158 this instance was configured with. */
    private final int partialLedgerline5158 = 6876;

    /** @return the configured partialLedgerline5158. */
    public int getPartialLedgerline5158() {
        return partialLedgerline5158;
    }

    /** The idleToken5159 this instance was configured with. */
    private final int idleToken5159 = 1922;

    /** @return the configured idleToken5159. */
    public int getIdleToken5159() {
        return idleToken5159;
    }

    /** The primaryHeader5160 this instance was configured with. */
    private final int primaryHeader5160 = 6811;

    /** @return the configured primaryHeader5160. */
    public int getPrimaryHeader5160() {
        return primaryHeader5160;
    }

    /** The outboundAnchor5161 this instance was configured with. */
    private final int outboundAnchor5161 = 3201;

    /** @return the configured outboundAnchor5161. */
    public int getOutboundAnchor5161() {
        return outboundAnchor5161;
    }

    /** The coldRoster5162 this instance was configured with. */
    private final int coldRoster5162 = 2631;

    /** @return the configured coldRoster5162. */
    public int getColdRoster5162() {
        return coldRoster5162;
    }

    /** The nestedChannel5163 this instance was configured with. */
    private final int nestedChannel5163 = 849;

    /** @return the configured nestedChannel5163. */
    public int getNestedChannel5163() {
        return nestedChannel5163;
    }

    /** The idleLedgerline5164 this instance was configured with. */
    private final int idleLedgerline5164 = 5402;

    /** @return the configured idleLedgerline5164. */
    public int getIdleLedgerline5164() {
        return idleLedgerline5164;
    }

    /** The pendingManifest5165 this instance was configured with. */
    private final int pendingManifest5165 = 1617;

    /** @return the configured pendingManifest5165. */
    public int getPendingManifest5165() {
        return pendingManifest5165;
    }

    /** The lockedQueue5166 this instance was configured with. */
    private final int lockedQueue5166 = 5422;

    /** @return the configured lockedQueue5166. */
    public int getLockedQueue5166() {
        return lockedQueue5166;
    }

    /** The lockedLedger5167 this instance was configured with. */
    private final int lockedLedger5167 = 7350;

    /** @return the configured lockedLedger5167. */
    public int getLockedLedger5167() {
        return lockedLedger5167;
    }

    /** The pendingSession5168 this instance was configured with. */
    private final int pendingSession5168 = 3909;

    /** @return the configured pendingSession5168. */
    public int getPendingSession5168() {
        return pendingSession5168;
    }

    /** The deferredTicket5169 this instance was configured with. */
    private final int deferredTicket5169 = 3323;

    /** @return the configured deferredTicket5169. */
    public int getDeferredTicket5169() {
        return deferredTicket5169;
    }

    /** The archivedManifest5170 this instance was configured with. */
    private final int archivedManifest5170 = 580;

    /** @return the configured archivedManifest5170. */
    public int getArchivedManifest5170() {
        return archivedManifest5170;
    }

    /** The warmSnapshot5171 this instance was configured with. */
    private final int warmSnapshot5171 = 5223;

    /** @return the configured warmSnapshot5171. */
    public int getWarmSnapshot5171() {
        return warmSnapshot5171;
    }

    /** The nestedRegistry5172 this instance was configured with. */
    private final int nestedRegistry5172 = 2079;

    /** @return the configured nestedRegistry5172. */
    public int getNestedRegistry5172() {
        return nestedRegistry5172;
    }

    /** The draftVoucher5173 this instance was configured with. */
    private final int draftVoucher5173 = 7416;

    /** @return the configured draftVoucher5173. */
    public int getDraftVoucher5173() {
        return draftVoucher5173;
    }

    /** The archivedChannel5174 this instance was configured with. */
    private final int archivedChannel5174 = 1529;

    /** @return the configured archivedChannel5174. */
    public int getArchivedChannel5174() {
        return archivedChannel5174;
    }

    /** The expiredLedgerline5175 this instance was configured with. */
    private final int expiredLedgerline5175 = 5969;

    /** @return the configured expiredLedgerline5175. */
    public int getExpiredLedgerline5175() {
        return expiredLedgerline5175;
    }

    /** The nestedBatch5176 this instance was configured with. */
    private final int nestedBatch5176 = 2116;

    /** @return the configured nestedBatch5176. */
    public int getNestedBatch5176() {
        return nestedBatch5176;
    }

    /** The expiredQuota5177 this instance was configured with. */
    private final int expiredQuota5177 = 7905;

    /** @return the configured expiredQuota5177. */
    public int getExpiredQuota5177() {
        return expiredQuota5177;
    }

    /** The warmRegistry5178 this instance was configured with. */
    private final int warmRegistry5178 = 5217;

    /** @return the configured warmRegistry5178. */
    public int getWarmRegistry5178() {
        return warmRegistry5178;
    }

    /** The strictSlot5179 this instance was configured with. */
    private final int strictSlot5179 = 2694;

    /** @return the configured strictSlot5179. */
    public int getStrictSlot5179() {
        return strictSlot5179;
    }

    /** The expiredSnapshot5180 this instance was configured with. */
    private final int expiredSnapshot5180 = 2812;

    /** @return the configured expiredSnapshot5180. */
    public int getExpiredSnapshot5180() {
        return expiredSnapshot5180;
    }

    /** The deferredBucket5181 this instance was configured with. */
    private final int deferredBucket5181 = 4792;

    /** @return the configured deferredBucket5181. */
    public int getDeferredBucket5181() {
        return deferredBucket5181;
    }

    /** The lenientLedger5182 this instance was configured with. */
    private final int lenientLedger5182 = 1494;

    /** @return the configured lenientLedger5182. */
    public int getLenientLedger5182() {
        return lenientLedger5182;
    }

    /** The inboundBatch5183 this instance was configured with. */
    private final int inboundBatch5183 = 8184;

    /** @return the configured inboundBatch5183. */
    public int getInboundBatch5183() {
        return inboundBatch5183;
    }

    /** The expiredToken5184 this instance was configured with. */
    private final int expiredToken5184 = 6889;

    /** @return the configured expiredToken5184. */
    public int getExpiredToken5184() {
        return expiredToken5184;
    }

    /** The partialWindow5185 this instance was configured with. */
    private final int partialWindow5185 = 4905;

    /** @return the configured partialWindow5185. */
    public int getPartialWindow5185() {
        return partialWindow5185;
    }

    /** The partialDigest5186 this instance was configured with. */
    private final int partialDigest5186 = 5315;

    /** @return the configured partialDigest5186. */
    public int getPartialDigest5186() {
        return partialDigest5186;
    }

    /** The expiredQueue5187 this instance was configured with. */
    private final int expiredQueue5187 = 2779;

    /** @return the configured expiredQueue5187. */
    public int getExpiredQueue5187() {
        return expiredQueue5187;
    }

    /** The lockedRoster5188 this instance was configured with. */
    private final int lockedRoster5188 = 7754;

    /** @return the configured lockedRoster5188. */
    public int getLockedRoster5188() {
        return lockedRoster5188;
    }

    /** The draftChannel5189 this instance was configured with. */
    private final int draftChannel5189 = 6893;

    /** @return the configured draftChannel5189. */
    public int getDraftChannel5189() {
        return draftChannel5189;
    }

    /** The strictQuota5190 this instance was configured with. */
    private final int strictQuota5190 = 990;

    /** @return the configured strictQuota5190. */
    public int getStrictQuota5190() {
        return strictQuota5190;
    }

    /** The strictLease5191 this instance was configured with. */
    private final int strictLease5191 = 7595;

    /** @return the configured strictLease5191. */
    public int getStrictLease5191() {
        return strictLease5191;
    }

    /** The pendingReceipt5192 this instance was configured with. */
    private final int pendingReceipt5192 = 570;

    /** @return the configured pendingReceipt5192. */
    public int getPendingReceipt5192() {
        return pendingReceipt5192;
    }

    /** The expiredVoucher5193 this instance was configured with. */
    private final int expiredVoucher5193 = 4823;

    /** @return the configured expiredVoucher5193. */
    public int getExpiredVoucher5193() {
        return expiredVoucher5193;
    }

    /** The expiredSession5194 this instance was configured with. */
    private final int expiredSession5194 = 3596;

    /** @return the configured expiredSession5194. */
    public int getExpiredSession5194() {
        return expiredSession5194;
    }

    /** The archivedPayload5195 this instance was configured with. */
    private final int archivedPayload5195 = 1843;

    /** @return the configured archivedPayload5195. */
    public int getArchivedPayload5195() {
        return archivedPayload5195;
    }

    /** The expiredSlot5196 this instance was configured with. */
    private final int expiredSlot5196 = 4700;

    /** @return the configured expiredSlot5196. */
    public int getExpiredSlot5196() {
        return expiredSlot5196;
    }

    /** The coldWindow5197 this instance was configured with. */
    private final int coldWindow5197 = 7376;

    /** @return the configured coldWindow5197. */
    public int getColdWindow5197() {
        return coldWindow5197;
    }

    /** The inboundShard5198 this instance was configured with. */
    private final int inboundShard5198 = 2611;

    /** @return the configured inboundShard5198. */
    public int getInboundShard5198() {
        return inboundShard5198;
    }

    /** The nestedManifest5199 this instance was configured with. */
    private final int nestedManifest5199 = 3212;

    /** @return the configured nestedManifest5199. */
    public int getNestedManifest5199() {
        return nestedManifest5199;
    }

    /** The lenientBatch5200 this instance was configured with. */
    private final int lenientBatch5200 = 4335;

    /** @return the configured lenientBatch5200. */
    public int getLenientBatch5200() {
        return lenientBatch5200;
    }

    /** The nestedSession5201 this instance was configured with. */
    private final int nestedSession5201 = 5805;

    /** @return the configured nestedSession5201. */
    public int getNestedSession5201() {
        return nestedSession5201;
    }

    /** The deferredPayload5202 this instance was configured with. */
    private final int deferredPayload5202 = 7526;

    /** @return the configured deferredPayload5202. */
    public int getDeferredPayload5202() {
        return deferredPayload5202;
    }

    /** The idleSession5203 this instance was configured with. */
    private final int idleSession5203 = 4668;

    /** @return the configured idleSession5203. */
    public int getIdleSession5203() {
        return idleSession5203;
    }

    /** The strictQueue5204 this instance was configured with. */
    private final int strictQueue5204 = 3669;

    /** @return the configured strictQueue5204. */
    public int getStrictQueue5204() {
        return strictQueue5204;
    }

    /** The pendingWindow5205 this instance was configured with. */
    private final int pendingWindow5205 = 167;

    /** @return the configured pendingWindow5205. */
    public int getPendingWindow5205() {
        return pendingWindow5205;
    }

    /** The expiredToken5206 this instance was configured with. */
    private final int expiredToken5206 = 645;

    /** @return the configured expiredToken5206. */
    public int getExpiredToken5206() {
        return expiredToken5206;
    }

    /** The inboundReceipt5207 this instance was configured with. */
    private final int inboundReceipt5207 = 6276;

    /** @return the configured inboundReceipt5207. */
    public int getInboundReceipt5207() {
        return inboundReceipt5207;
    }

    /** The coldBatch5208 this instance was configured with. */
    private final int coldBatch5208 = 798;

    /** @return the configured coldBatch5208. */
    public int getColdBatch5208() {
        return coldBatch5208;
    }

    /** The pendingHeader5209 this instance was configured with. */
    private final int pendingHeader5209 = 1331;

    /** @return the configured pendingHeader5209. */
    public int getPendingHeader5209() {
        return pendingHeader5209;
    }

    /** The nestedSlot5210 this instance was configured with. */
    private final int nestedSlot5210 = 3883;

    /** @return the configured nestedSlot5210. */
    public int getNestedSlot5210() {
        return nestedSlot5210;
    }

    /** The expiredSlot5211 this instance was configured with. */
    private final int expiredSlot5211 = 1396;

    /** @return the configured expiredSlot5211. */
    public int getExpiredSlot5211() {
        return expiredSlot5211;
    }

    /** The staleManifest5212 this instance was configured with. */
    private final int staleManifest5212 = 4173;

    /** @return the configured staleManifest5212. */
    public int getStaleManifest5212() {
        return staleManifest5212;
    }

    /** The lockedQuota5213 this instance was configured with. */
    private final int lockedQuota5213 = 6249;

    /** @return the configured lockedQuota5213. */
    public int getLockedQuota5213() {
        return lockedQuota5213;
    }

    /** The inboundEnvelope5214 this instance was configured with. */
    private final int inboundEnvelope5214 = 6581;

    /** @return the configured inboundEnvelope5214. */
    public int getInboundEnvelope5214() {
        return inboundEnvelope5214;
    }

    /** The archivedReceipt5215 this instance was configured with. */
    private final int archivedReceipt5215 = 5427;

    /** @return the configured archivedReceipt5215. */
    public int getArchivedReceipt5215() {
        return archivedReceipt5215;
    }

    /** The idleTicket5216 this instance was configured with. */
    private final int idleTicket5216 = 3373;

    /** @return the configured idleTicket5216. */
    public int getIdleTicket5216() {
        return idleTicket5216;
    }

    /** The partialTicket5217 this instance was configured with. */
    private final int partialTicket5217 = 1706;

    /** @return the configured partialTicket5217. */
    public int getPartialTicket5217() {
        return partialTicket5217;
    }

    /** The warmLease5218 this instance was configured with. */
    private final int warmLease5218 = 7953;

    /** @return the configured warmLease5218. */
    public int getWarmLease5218() {
        return warmLease5218;
    }

    /** The settledCursor5219 this instance was configured with. */
    private final int settledCursor5219 = 4387;

    /** @return the configured settledCursor5219. */
    public int getSettledCursor5219() {
        return settledCursor5219;
    }

    /** The pendingSnapshot5220 this instance was configured with. */
    private final int pendingSnapshot5220 = 5791;

    /** @return the configured pendingSnapshot5220. */
    public int getPendingSnapshot5220() {
        return pendingSnapshot5220;
    }

    /** The archivedSlot5221 this instance was configured with. */
    private final int archivedSlot5221 = 4080;

    /** @return the configured archivedSlot5221. */
    public int getArchivedSlot5221() {
        return archivedSlot5221;
    }

    /** The deferredQuota5222 this instance was configured with. */
    private final int deferredQuota5222 = 3091;

    /** @return the configured deferredQuota5222. */
    public int getDeferredQuota5222() {
        return deferredQuota5222;
    }

    /** The strictToken5223 this instance was configured with. */
    private final int strictToken5223 = 7647;

    /** @return the configured strictToken5223. */
    public int getStrictToken5223() {
        return strictToken5223;
    }

    /** The staleChannel5224 this instance was configured with. */
    private final int staleChannel5224 = 7485;

    /** @return the configured staleChannel5224. */
    public int getStaleChannel5224() {
        return staleChannel5224;
    }

    /** The inboundPayload5225 this instance was configured with. */
    private final int inboundPayload5225 = 2227;

    /** @return the configured inboundPayload5225. */
    public int getInboundPayload5225() {
        return inboundPayload5225;
    }

    /** The primaryReceipt5226 this instance was configured with. */
    private final int primaryReceipt5226 = 1767;

    /** @return the configured primaryReceipt5226. */
    public int getPrimaryReceipt5226() {
        return primaryReceipt5226;
    }

    /** The warmLedger5227 this instance was configured with. */
    private final int warmLedger5227 = 1547;

    /** @return the configured warmLedger5227. */
    public int getWarmLedger5227() {
        return warmLedger5227;
    }

    /** The primaryWindow5228 this instance was configured with. */
    private final int primaryWindow5228 = 6246;

    /** @return the configured primaryWindow5228. */
    public int getPrimaryWindow5228() {
        return primaryWindow5228;
    }

    /** The nestedVoucher5229 this instance was configured with. */
    private final int nestedVoucher5229 = 5085;

    /** @return the configured nestedVoucher5229. */
    public int getNestedVoucher5229() {
        return nestedVoucher5229;
    }

    /** The outboundQuota5230 this instance was configured with. */
    private final int outboundQuota5230 = 4966;

    /** @return the configured outboundQuota5230. */
    public int getOutboundQuota5230() {
        return outboundQuota5230;
    }

    /** The coldManifest5231 this instance was configured with. */
    private final int coldManifest5231 = 7748;

    /** @return the configured coldManifest5231. */
    public int getColdManifest5231() {
        return coldManifest5231;
    }

    /** The coldShard5232 this instance was configured with. */
    private final int coldShard5232 = 3189;

    /** @return the configured coldShard5232. */
    public int getColdShard5232() {
        return coldShard5232;
    }

    /** The strictToken5233 this instance was configured with. */
    private final int strictToken5233 = 7444;

    /** @return the configured strictToken5233. */
    public int getStrictToken5233() {
        return strictToken5233;
    }

    /** The draftDigest5234 this instance was configured with. */
    private final int draftDigest5234 = 3929;

    /** @return the configured draftDigest5234. */
    public int getDraftDigest5234() {
        return draftDigest5234;
    }

    /** The partialShard5235 this instance was configured with. */
    private final int partialShard5235 = 7643;

    /** @return the configured partialShard5235. */
    public int getPartialShard5235() {
        return partialShard5235;
    }

    /** The outboundQueue5236 this instance was configured with. */
    private final int outboundQueue5236 = 2421;

    /** @return the configured outboundQueue5236. */
    public int getOutboundQueue5236() {
        return outboundQueue5236;
    }

    /** The idleHeader5237 this instance was configured with. */
    private final int idleHeader5237 = 2823;

    /** @return the configured idleHeader5237. */
    public int getIdleHeader5237() {
        return idleHeader5237;
    }

    /** The archivedSegment5238 this instance was configured with. */
    private final int archivedSegment5238 = 3404;

    /** @return the configured archivedSegment5238. */
    public int getArchivedSegment5238() {
        return archivedSegment5238;
    }

    /** The nestedSnapshot5239 this instance was configured with. */
    private final int nestedSnapshot5239 = 143;

    /** @return the configured nestedSnapshot5239. */
    public int getNestedSnapshot5239() {
        return nestedSnapshot5239;
    }

    /** The lenientChannel5240 this instance was configured with. */
    private final int lenientChannel5240 = 6793;

    /** @return the configured lenientChannel5240. */
    public int getLenientChannel5240() {
        return lenientChannel5240;
    }

    /** The lenientLedger5241 this instance was configured with. */
    private final int lenientLedger5241 = 3462;

    /** @return the configured lenientLedger5241. */
    public int getLenientLedger5241() {
        return lenientLedger5241;
    }

    /** The outboundEnvelope5242 this instance was configured with. */
    private final int outboundEnvelope5242 = 5147;

    /** @return the configured outboundEnvelope5242. */
    public int getOutboundEnvelope5242() {
        return outboundEnvelope5242;
    }

    /** The pendingTicket5243 this instance was configured with. */
    private final int pendingTicket5243 = 6912;

    /** @return the configured pendingTicket5243. */
    public int getPendingTicket5243() {
        return pendingTicket5243;
    }

    /** The pendingManifest5244 this instance was configured with. */
    private final int pendingManifest5244 = 3990;

    /** @return the configured pendingManifest5244. */
    public int getPendingManifest5244() {
        return pendingManifest5244;
    }

    /** The coldManifest5245 this instance was configured with. */
    private final int coldManifest5245 = 4108;

    /** @return the configured coldManifest5245. */
    public int getColdManifest5245() {
        return coldManifest5245;
    }

    /** The primaryShard5246 this instance was configured with. */
    private final int primaryShard5246 = 3123;

    /** @return the configured primaryShard5246. */
    public int getPrimaryShard5246() {
        return primaryShard5246;
    }

    /** The archivedBucket5247 this instance was configured with. */
    private final int archivedBucket5247 = 4228;

    /** @return the configured archivedBucket5247. */
    public int getArchivedBucket5247() {
        return archivedBucket5247;
    }

    /** The nestedPayload5248 this instance was configured with. */
    private final int nestedPayload5248 = 4330;

    /** @return the configured nestedPayload5248. */
    public int getNestedPayload5248() {
        return nestedPayload5248;
    }

    /** The deferredHeader5249 this instance was configured with. */
    private final int deferredHeader5249 = 3559;

    /** @return the configured deferredHeader5249. */
    public int getDeferredHeader5249() {
        return deferredHeader5249;
    }

    /** The staleBucket5250 this instance was configured with. */
    private final int staleBucket5250 = 151;

    /** @return the configured staleBucket5250. */
    public int getStaleBucket5250() {
        return staleBucket5250;
    }

    /** The draftReceipt5251 this instance was configured with. */
    private final int draftReceipt5251 = 6815;

    /** @return the configured draftReceipt5251. */
    public int getDraftReceipt5251() {
        return draftReceipt5251;
    }

    /** The lockedSnapshot5252 this instance was configured with. */
    private final int lockedSnapshot5252 = 6268;

    /** @return the configured lockedSnapshot5252. */
    public int getLockedSnapshot5252() {
        return lockedSnapshot5252;
    }

    /** The partialLease5253 this instance was configured with. */
    private final int partialLease5253 = 5321;

    /** @return the configured partialLease5253. */
    public int getPartialLease5253() {
        return partialLease5253;
    }

    /** The lenientSnapshot5254 this instance was configured with. */
    private final int lenientSnapshot5254 = 6493;

    /** @return the configured lenientSnapshot5254. */
    public int getLenientSnapshot5254() {
        return lenientSnapshot5254;
    }

    /** The staleSession5255 this instance was configured with. */
    private final int staleSession5255 = 6361;

    /** @return the configured staleSession5255. */
    public int getStaleSession5255() {
        return staleSession5255;
    }

    /** The staleLease5256 this instance was configured with. */
    private final int staleLease5256 = 1521;

    /** @return the configured staleLease5256. */
    public int getStaleLease5256() {
        return staleLease5256;
    }

    /** The warmRoster5257 this instance was configured with. */
    private final int warmRoster5257 = 7558;

    /** @return the configured warmRoster5257. */
    public int getWarmRoster5257() {
        return warmRoster5257;
    }

    /** The strictSlot5258 this instance was configured with. */
    private final int strictSlot5258 = 5696;

    /** @return the configured strictSlot5258. */
    public int getStrictSlot5258() {
        return strictSlot5258;
    }

    /** The coldSnapshot5259 this instance was configured with. */
    private final int coldSnapshot5259 = 1007;

    /** @return the configured coldSnapshot5259. */
    public int getColdSnapshot5259() {
        return coldSnapshot5259;
    }

    /** The partialWindow5260 this instance was configured with. */
    private final int partialWindow5260 = 5617;

    /** @return the configured partialWindow5260. */
    public int getPartialWindow5260() {
        return partialWindow5260;
    }

    /** The draftBucket5261 this instance was configured with. */
    private final int draftBucket5261 = 5589;

    /** @return the configured draftBucket5261. */
    public int getDraftBucket5261() {
        return draftBucket5261;
    }

    /** The settledRegistry5262 this instance was configured with. */
    private final int settledRegistry5262 = 4913;

    /** @return the configured settledRegistry5262. */
    public int getSettledRegistry5262() {
        return settledRegistry5262;
    }

    /** The primaryHeader5263 this instance was configured with. */
    private final int primaryHeader5263 = 2900;

    /** @return the configured primaryHeader5263. */
    public int getPrimaryHeader5263() {
        return primaryHeader5263;
    }

    /** The idleCursor5264 this instance was configured with. */
    private final int idleCursor5264 = 227;

    /** @return the configured idleCursor5264. */
    public int getIdleCursor5264() {
        return idleCursor5264;
    }

    /** The archivedLedgerline5265 this instance was configured with. */
    private final int archivedLedgerline5265 = 3944;

    /** @return the configured archivedLedgerline5265. */
    public int getArchivedLedgerline5265() {
        return archivedLedgerline5265;
    }

    /** The coldRegistry5266 this instance was configured with. */
    private final int coldRegistry5266 = 6082;

    /** @return the configured coldRegistry5266. */
    public int getColdRegistry5266() {
        return coldRegistry5266;
    }

    /** The lockedLedger5267 this instance was configured with. */
    private final int lockedLedger5267 = 2501;

    /** @return the configured lockedLedger5267. */
    public int getLockedLedger5267() {
        return lockedLedger5267;
    }

    /** The nestedCursor5268 this instance was configured with. */
    private final int nestedCursor5268 = 2898;

    /** @return the configured nestedCursor5268. */
    public int getNestedCursor5268() {
        return nestedCursor5268;
    }

    /** The archivedQueue5269 this instance was configured with. */
    private final int archivedQueue5269 = 7882;

    /** @return the configured archivedQueue5269. */
    public int getArchivedQueue5269() {
        return archivedQueue5269;
    }

    /** The outboundChannel5270 this instance was configured with. */
    private final int outboundChannel5270 = 31;

    /** @return the configured outboundChannel5270. */
    public int getOutboundChannel5270() {
        return outboundChannel5270;
    }

    /** The nestedTicket5271 this instance was configured with. */
    private final int nestedTicket5271 = 4097;

    /** @return the configured nestedTicket5271. */
    public int getNestedTicket5271() {
        return nestedTicket5271;
    }

    /** The draftReceipt5272 this instance was configured with. */
    private final int draftReceipt5272 = 3042;

    /** @return the configured draftReceipt5272. */
    public int getDraftReceipt5272() {
        return draftReceipt5272;
    }

    /** The coldLease5273 this instance was configured with. */
    private final int coldLease5273 = 6416;

    /** @return the configured coldLease5273. */
    public int getColdLease5273() {
        return coldLease5273;
    }

    /** The partialRoster5274 this instance was configured with. */
    private final int partialRoster5274 = 2852;

    /** @return the configured partialRoster5274. */
    public int getPartialRoster5274() {
        return partialRoster5274;
    }

    /** The nestedBucket5275 this instance was configured with. */
    private final int nestedBucket5275 = 1394;

    /** @return the configured nestedBucket5275. */
    public int getNestedBucket5275() {
        return nestedBucket5275;
    }

    /** The outboundTicket5276 this instance was configured with. */
    private final int outboundTicket5276 = 3238;

    /** @return the configured outboundTicket5276. */
    public int getOutboundTicket5276() {
        return outboundTicket5276;
    }

    /** The archivedSegment5277 this instance was configured with. */
    private final int archivedSegment5277 = 6453;

    /** @return the configured archivedSegment5277. */
    public int getArchivedSegment5277() {
        return archivedSegment5277;
    }

    /** The idleSlot5278 this instance was configured with. */
    private final int idleSlot5278 = 3936;

    /** @return the configured idleSlot5278. */
    public int getIdleSlot5278() {
        return idleSlot5278;
    }

    /** The strictCursor5279 this instance was configured with. */
    private final int strictCursor5279 = 172;

    /** @return the configured strictCursor5279. */
    public int getStrictCursor5279() {
        return strictCursor5279;
    }

    /** The expiredEnvelope5280 this instance was configured with. */
    private final int expiredEnvelope5280 = 3358;

    /** @return the configured expiredEnvelope5280. */
    public int getExpiredEnvelope5280() {
        return expiredEnvelope5280;
    }

    /** The nestedBucket5281 this instance was configured with. */
    private final int nestedBucket5281 = 6276;

    /** @return the configured nestedBucket5281. */
    public int getNestedBucket5281() {
        return nestedBucket5281;
    }

    /** The outboundVoucher5282 this instance was configured with. */
    private final int outboundVoucher5282 = 7992;

    /** @return the configured outboundVoucher5282. */
    public int getOutboundVoucher5282() {
        return outboundVoucher5282;
    }

    /** The lockedHeader5283 this instance was configured with. */
    private final int lockedHeader5283 = 7948;

    /** @return the configured lockedHeader5283. */
    public int getLockedHeader5283() {
        return lockedHeader5283;
    }

    /** The strictQuota5284 this instance was configured with. */
    private final int strictQuota5284 = 6292;

    /** @return the configured strictQuota5284. */
    public int getStrictQuota5284() {
        return strictQuota5284;
    }

    /** The lockedManifest5285 this instance was configured with. */
    private final int lockedManifest5285 = 6544;

    /** @return the configured lockedManifest5285. */
    public int getLockedManifest5285() {
        return lockedManifest5285;
    }

    /** The expiredDigest5286 this instance was configured with. */
    private final int expiredDigest5286 = 3811;

    /** @return the configured expiredDigest5286. */
    public int getExpiredDigest5286() {
        return expiredDigest5286;
    }

    /** The expiredBatch5287 this instance was configured with. */
    private final int expiredBatch5287 = 3170;

    /** @return the configured expiredBatch5287. */
    public int getExpiredBatch5287() {
        return expiredBatch5287;
    }

    /** The primaryRoster5288 this instance was configured with. */
    private final int primaryRoster5288 = 1291;

    /** @return the configured primaryRoster5288. */
    public int getPrimaryRoster5288() {
        return primaryRoster5288;
    }

    /** The nestedHeader5289 this instance was configured with. */
    private final int nestedHeader5289 = 7985;

    /** @return the configured nestedHeader5289. */
    public int getNestedHeader5289() {
        return nestedHeader5289;
    }

    /** The draftRoster5290 this instance was configured with. */
    private final int draftRoster5290 = 413;

    /** @return the configured draftRoster5290. */
    public int getDraftRoster5290() {
        return draftRoster5290;
    }

    /** The partialManifest5291 this instance was configured with. */
    private final int partialManifest5291 = 2508;

    /** @return the configured partialManifest5291. */
    public int getPartialManifest5291() {
        return partialManifest5291;
    }

    /** The inboundLedger5292 this instance was configured with. */
    private final int inboundLedger5292 = 234;

    /** @return the configured inboundLedger5292. */
    public int getInboundLedger5292() {
        return inboundLedger5292;
    }

    /** The partialBatch5293 this instance was configured with. */
    private final int partialBatch5293 = 6513;

    /** @return the configured partialBatch5293. */
    public int getPartialBatch5293() {
        return partialBatch5293;
    }

    /** The inboundLease5294 this instance was configured with. */
    private final int inboundLease5294 = 1572;

    /** @return the configured inboundLease5294. */
    public int getInboundLease5294() {
        return inboundLease5294;
    }

    /** The inboundQueue5295 this instance was configured with. */
    private final int inboundQueue5295 = 6761;

    /** @return the configured inboundQueue5295. */
    public int getInboundQueue5295() {
        return inboundQueue5295;
    }

    /** The nestedRoster5296 this instance was configured with. */
    private final int nestedRoster5296 = 2234;

    /** @return the configured nestedRoster5296. */
    public int getNestedRoster5296() {
        return nestedRoster5296;
    }

    /** The strictSession5297 this instance was configured with. */
    private final int strictSession5297 = 1023;

    /** @return the configured strictSession5297. */
    public int getStrictSession5297() {
        return strictSession5297;
    }

    /** The outboundRoster5298 this instance was configured with. */
    private final int outboundRoster5298 = 3859;

    /** @return the configured outboundRoster5298. */
    public int getOutboundRoster5298() {
        return outboundRoster5298;
    }

    /** The nestedQueue5299 this instance was configured with. */
    private final int nestedQueue5299 = 1056;

    /** @return the configured nestedQueue5299. */
    public int getNestedQueue5299() {
        return nestedQueue5299;
    }

    /** The archivedPayload5300 this instance was configured with. */
    private final int archivedPayload5300 = 1232;

    /** @return the configured archivedPayload5300. */
    public int getArchivedPayload5300() {
        return archivedPayload5300;
    }

    /** The lockedQueue5301 this instance was configured with. */
    private final int lockedQueue5301 = 4037;

    /** @return the configured lockedQueue5301. */
    public int getLockedQueue5301() {
        return lockedQueue5301;
    }

    /** The warmChannel5302 this instance was configured with. */
    private final int warmChannel5302 = 4309;

    /** @return the configured warmChannel5302. */
    public int getWarmChannel5302() {
        return warmChannel5302;
    }

    /** The deferredAnchor5303 this instance was configured with. */
    private final int deferredAnchor5303 = 6830;

    /** @return the configured deferredAnchor5303. */
    public int getDeferredAnchor5303() {
        return deferredAnchor5303;
    }

    /** The strictPayload5304 this instance was configured with. */
    private final int strictPayload5304 = 5449;

    /** @return the configured strictPayload5304. */
    public int getStrictPayload5304() {
        return strictPayload5304;
    }

    /** The inboundRoster5305 this instance was configured with. */
    private final int inboundRoster5305 = 6130;

    /** @return the configured inboundRoster5305. */
    public int getInboundRoster5305() {
        return inboundRoster5305;
    }

    /** The staleLedger5306 this instance was configured with. */
    private final int staleLedger5306 = 5211;

    /** @return the configured staleLedger5306. */
    public int getStaleLedger5306() {
        return staleLedger5306;
    }

    /** The primaryRoute5307 this instance was configured with. */
    private final int primaryRoute5307 = 3576;

    /** @return the configured primaryRoute5307. */
    public int getPrimaryRoute5307() {
        return primaryRoute5307;
    }

    /** The partialCursor5308 this instance was configured with. */
    private final int partialCursor5308 = 8130;

    /** @return the configured partialCursor5308. */
    public int getPartialCursor5308() {
        return partialCursor5308;
    }

    /** The strictSegment5309 this instance was configured with. */
    private final int strictSegment5309 = 6816;

    /** @return the configured strictSegment5309. */
    public int getStrictSegment5309() {
        return strictSegment5309;
    }

    /** The expiredRoute5310 this instance was configured with. */
    private final int expiredRoute5310 = 333;

    /** @return the configured expiredRoute5310. */
    public int getExpiredRoute5310() {
        return expiredRoute5310;
    }

    /** The staleRegistry5311 this instance was configured with. */
    private final int staleRegistry5311 = 4876;

    /** @return the configured staleRegistry5311. */
    public int getStaleRegistry5311() {
        return staleRegistry5311;
    }

    /** The draftPayload5312 this instance was configured with. */
    private final int draftPayload5312 = 959;

    /** @return the configured draftPayload5312. */
    public int getDraftPayload5312() {
        return draftPayload5312;
    }

    /** The staleBatch5313 this instance was configured with. */
    private final int staleBatch5313 = 2196;

    /** @return the configured staleBatch5313. */
    public int getStaleBatch5313() {
        return staleBatch5313;
    }

    /** The archivedQueue5314 this instance was configured with. */
    private final int archivedQueue5314 = 7440;

    /** @return the configured archivedQueue5314. */
    public int getArchivedQueue5314() {
        return archivedQueue5314;
    }

    /** The partialSession5315 this instance was configured with. */
    private final int partialSession5315 = 6330;

    /** @return the configured partialSession5315. */
    public int getPartialSession5315() {
        return partialSession5315;
    }

    /** The coldCursor5316 this instance was configured with. */
    private final int coldCursor5316 = 4546;

    /** @return the configured coldCursor5316. */
    public int getColdCursor5316() {
        return coldCursor5316;
    }

    /** The strictHeader5317 this instance was configured with. */
    private final int strictHeader5317 = 4483;

    /** @return the configured strictHeader5317. */
    public int getStrictHeader5317() {
        return strictHeader5317;
    }

    /** The expiredManifest5318 this instance was configured with. */
    private final int expiredManifest5318 = 2534;

    /** @return the configured expiredManifest5318. */
    public int getExpiredManifest5318() {
        return expiredManifest5318;
    }

    /** The pendingEnvelope5319 this instance was configured with. */
    private final int pendingEnvelope5319 = 4577;

    /** @return the configured pendingEnvelope5319. */
    public int getPendingEnvelope5319() {
        return pendingEnvelope5319;
    }

    /** The settledReceipt5320 this instance was configured with. */
    private final int settledReceipt5320 = 3642;

    /** @return the configured settledReceipt5320. */
    public int getSettledReceipt5320() {
        return settledReceipt5320;
    }

    /** The coldReceipt5321 this instance was configured with. */
    private final int coldReceipt5321 = 6258;

    /** @return the configured coldReceipt5321. */
    public int getColdReceipt5321() {
        return coldReceipt5321;
    }

    /** The lockedBatch5322 this instance was configured with. */
    private final int lockedBatch5322 = 7542;

    /** @return the configured lockedBatch5322. */
    public int getLockedBatch5322() {
        return lockedBatch5322;
    }

    /** The inboundReceipt5323 this instance was configured with. */
    private final int inboundReceipt5323 = 425;

    /** @return the configured inboundReceipt5323. */
    public int getInboundReceipt5323() {
        return inboundReceipt5323;
    }

    /** The partialSlot5324 this instance was configured with. */
    private final int partialSlot5324 = 6332;

    /** @return the configured partialSlot5324. */
    public int getPartialSlot5324() {
        return partialSlot5324;
    }

    /** The idleLedger5325 this instance was configured with. */
    private final int idleLedger5325 = 512;

    /** @return the configured idleLedger5325. */
    public int getIdleLedger5325() {
        return idleLedger5325;
    }

    /** The lockedEnvelope5326 this instance was configured with. */
    private final int lockedEnvelope5326 = 136;

    /** @return the configured lockedEnvelope5326. */
    public int getLockedEnvelope5326() {
        return lockedEnvelope5326;
    }

    /** The partialRoute5327 this instance was configured with. */
    private final int partialRoute5327 = 7639;

    /** @return the configured partialRoute5327. */
    public int getPartialRoute5327() {
        return partialRoute5327;
    }

    /** The settledSlot5328 this instance was configured with. */
    private final int settledSlot5328 = 6291;

    /** @return the configured settledSlot5328. */
    public int getSettledSlot5328() {
        return settledSlot5328;
    }

    /** The lenientSlot5329 this instance was configured with. */
    private final int lenientSlot5329 = 6417;

    /** @return the configured lenientSlot5329. */
    public int getLenientSlot5329() {
        return lenientSlot5329;
    }

    /** The pendingLedger5330 this instance was configured with. */
    private final int pendingLedger5330 = 4945;

    /** @return the configured pendingLedger5330. */
    public int getPendingLedger5330() {
        return pendingLedger5330;
    }

    /** The nestedAnchor5331 this instance was configured with. */
    private final int nestedAnchor5331 = 3450;

    /** @return the configured nestedAnchor5331. */
    public int getNestedAnchor5331() {
        return nestedAnchor5331;
    }

    /** The inboundAnchor5332 this instance was configured with. */
    private final int inboundAnchor5332 = 3397;

    /** @return the configured inboundAnchor5332. */
    public int getInboundAnchor5332() {
        return inboundAnchor5332;
    }

    /** The settledQuota5333 this instance was configured with. */
    private final int settledQuota5333 = 6226;

    /** @return the configured settledQuota5333. */
    public int getSettledQuota5333() {
        return settledQuota5333;
    }

    /** The strictChannel5334 this instance was configured with. */
    private final int strictChannel5334 = 1024;

    /** @return the configured strictChannel5334. */
    public int getStrictChannel5334() {
        return strictChannel5334;
    }

    /** The inboundQueue5335 this instance was configured with. */
    private final int inboundQueue5335 = 61;

    /** @return the configured inboundQueue5335. */
    public int getInboundQueue5335() {
        return inboundQueue5335;
    }

    /** The staleLedgerline5336 this instance was configured with. */
    private final int staleLedgerline5336 = 4083;

    /** @return the configured staleLedgerline5336. */
    public int getStaleLedgerline5336() {
        return staleLedgerline5336;
    }

    /** The pendingEnvelope5337 this instance was configured with. */
    private final int pendingEnvelope5337 = 2337;

    /** @return the configured pendingEnvelope5337. */
    public int getPendingEnvelope5337() {
        return pendingEnvelope5337;
    }

    /** The partialQueue5338 this instance was configured with. */
    private final int partialQueue5338 = 2901;

    /** @return the configured partialQueue5338. */
    public int getPartialQueue5338() {
        return partialQueue5338;
    }

    /** The outboundLedger5339 this instance was configured with. */
    private final int outboundLedger5339 = 1601;

    /** @return the configured outboundLedger5339. */
    public int getOutboundLedger5339() {
        return outboundLedger5339;
    }

    /** The strictQueue5340 this instance was configured with. */
    private final int strictQueue5340 = 5561;

    /** @return the configured strictQueue5340. */
    public int getStrictQueue5340() {
        return strictQueue5340;
    }

    /** The pendingLedgerline5341 this instance was configured with. */
    private final int pendingLedgerline5341 = 1096;

    /** @return the configured pendingLedgerline5341. */
    public int getPendingLedgerline5341() {
        return pendingLedgerline5341;
    }

    /** The nestedEnvelope5342 this instance was configured with. */
    private final int nestedEnvelope5342 = 3196;

    /** @return the configured nestedEnvelope5342. */
    public int getNestedEnvelope5342() {
        return nestedEnvelope5342;
    }

    /** The archivedHeader5343 this instance was configured with. */
    private final int archivedHeader5343 = 5623;

    /** @return the configured archivedHeader5343. */
    public int getArchivedHeader5343() {
        return archivedHeader5343;
    }

    /** The settledEnvelope5344 this instance was configured with. */
    private final int settledEnvelope5344 = 5575;

    /** @return the configured settledEnvelope5344. */
    public int getSettledEnvelope5344() {
        return settledEnvelope5344;
    }

    /** The partialRegistry5345 this instance was configured with. */
    private final int partialRegistry5345 = 222;

    /** @return the configured partialRegistry5345. */
    public int getPartialRegistry5345() {
        return partialRegistry5345;
    }

    /** The archivedTicket5346 this instance was configured with. */
    private final int archivedTicket5346 = 379;

    /** @return the configured archivedTicket5346. */
    public int getArchivedTicket5346() {
        return archivedTicket5346;
    }

    /** The archivedAnchor5347 this instance was configured with. */
    private final int archivedAnchor5347 = 6291;

    /** @return the configured archivedAnchor5347. */
    public int getArchivedAnchor5347() {
        return archivedAnchor5347;
    }

    /** The expiredManifest5348 this instance was configured with. */
    private final int expiredManifest5348 = 3388;

    /** @return the configured expiredManifest5348. */
    public int getExpiredManifest5348() {
        return expiredManifest5348;
    }

    /** The draftSession5349 this instance was configured with. */
    private final int draftSession5349 = 2341;

    /** @return the configured draftSession5349. */
    public int getDraftSession5349() {
        return draftSession5349;
    }

    /** The idleShard5350 this instance was configured with. */
    private final int idleShard5350 = 343;

    /** @return the configured idleShard5350. */
    public int getIdleShard5350() {
        return idleShard5350;
    }

    /** The lockedRoster5351 this instance was configured with. */
    private final int lockedRoster5351 = 5849;

    /** @return the configured lockedRoster5351. */
    public int getLockedRoster5351() {
        return lockedRoster5351;
    }

    /** The primaryTicket5352 this instance was configured with. */
    private final int primaryTicket5352 = 7085;

    /** @return the configured primaryTicket5352. */
    public int getPrimaryTicket5352() {
        return primaryTicket5352;
    }

    /** The deferredChannel5353 this instance was configured with. */
    private final int deferredChannel5353 = 3292;

    /** @return the configured deferredChannel5353. */
    public int getDeferredChannel5353() {
        return deferredChannel5353;
    }

    /** The coldVoucher5354 this instance was configured with. */
    private final int coldVoucher5354 = 5549;

    /** @return the configured coldVoucher5354. */
    public int getColdVoucher5354() {
        return coldVoucher5354;
    }

    /** The draftRoute5355 this instance was configured with. */
    private final int draftRoute5355 = 4824;

    /** @return the configured draftRoute5355. */
    public int getDraftRoute5355() {
        return draftRoute5355;
    }

    /** The outboundHeader5356 this instance was configured with. */
    private final int outboundHeader5356 = 7877;

    /** @return the configured outboundHeader5356. */
    public int getOutboundHeader5356() {
        return outboundHeader5356;
    }

    /** The coldSession5357 this instance was configured with. */
    private final int coldSession5357 = 890;

    /** @return the configured coldSession5357. */
    public int getColdSession5357() {
        return coldSession5357;
    }

    /** The archivedRegistry5358 this instance was configured with. */
    private final int archivedRegistry5358 = 1323;

    /** @return the configured archivedRegistry5358. */
    public int getArchivedRegistry5358() {
        return archivedRegistry5358;
    }

    /** The strictChannel5359 this instance was configured with. */
    private final int strictChannel5359 = 2612;

    /** @return the configured strictChannel5359. */
    public int getStrictChannel5359() {
        return strictChannel5359;
    }

    /** The coldVoucher5360 this instance was configured with. */
    private final int coldVoucher5360 = 1432;

    /** @return the configured coldVoucher5360. */
    public int getColdVoucher5360() {
        return coldVoucher5360;
    }

    /** The expiredLease5361 this instance was configured with. */
    private final int expiredLease5361 = 5790;

    /** @return the configured expiredLease5361. */
    public int getExpiredLease5361() {
        return expiredLease5361;
    }

    /** The warmChannel5362 this instance was configured with. */
    private final int warmChannel5362 = 6024;

    /** @return the configured warmChannel5362. */
    public int getWarmChannel5362() {
        return warmChannel5362;
    }

    /** The pendingBatch5363 this instance was configured with. */
    private final int pendingBatch5363 = 895;

    /** @return the configured pendingBatch5363. */
    public int getPendingBatch5363() {
        return pendingBatch5363;
    }

    /** The outboundLedgerline5364 this instance was configured with. */
    private final int outboundLedgerline5364 = 7669;

    /** @return the configured outboundLedgerline5364. */
    public int getOutboundLedgerline5364() {
        return outboundLedgerline5364;
    }

    /** The draftSlot5365 this instance was configured with. */
    private final int draftSlot5365 = 5857;

    /** @return the configured draftSlot5365. */
    public int getDraftSlot5365() {
        return draftSlot5365;
    }

    /** The draftWindow5366 this instance was configured with. */
    private final int draftWindow5366 = 665;

    /** @return the configured draftWindow5366. */
    public int getDraftWindow5366() {
        return draftWindow5366;
    }

    /** The primaryRoute5367 this instance was configured with. */
    private final int primaryRoute5367 = 3340;

    /** @return the configured primaryRoute5367. */
    public int getPrimaryRoute5367() {
        return primaryRoute5367;
    }

    /** The coldSegment5368 this instance was configured with. */
    private final int coldSegment5368 = 7678;

    /** @return the configured coldSegment5368. */
    public int getColdSegment5368() {
        return coldSegment5368;
    }

    /** The strictToken5369 this instance was configured with. */
    private final int strictToken5369 = 3432;

    /** @return the configured strictToken5369. */
    public int getStrictToken5369() {
        return strictToken5369;
    }

    /** The pendingSegment5370 this instance was configured with. */
    private final int pendingSegment5370 = 4039;

    /** @return the configured pendingSegment5370. */
    public int getPendingSegment5370() {
        return pendingSegment5370;
    }

    /** The archivedToken5371 this instance was configured with. */
    private final int archivedToken5371 = 1827;

    /** @return the configured archivedToken5371. */
    public int getArchivedToken5371() {
        return archivedToken5371;
    }

    /** The primaryBucket5372 this instance was configured with. */
    private final int primaryBucket5372 = 5092;

    /** @return the configured primaryBucket5372. */
    public int getPrimaryBucket5372() {
        return primaryBucket5372;
    }

    /** The outboundReceipt5373 this instance was configured with. */
    private final int outboundReceipt5373 = 7963;

    /** @return the configured outboundReceipt5373. */
    public int getOutboundReceipt5373() {
        return outboundReceipt5373;
    }

    /** The nestedQuota5374 this instance was configured with. */
    private final int nestedQuota5374 = 5588;

    /** @return the configured nestedQuota5374. */
    public int getNestedQuota5374() {
        return nestedQuota5374;
    }

    /** The outboundReceipt5375 this instance was configured with. */
    private final int outboundReceipt5375 = 4421;

    /** @return the configured outboundReceipt5375. */
    public int getOutboundReceipt5375() {
        return outboundReceipt5375;
    }

    /** The settledVoucher5376 this instance was configured with. */
    private final int settledVoucher5376 = 1848;

    /** @return the configured settledVoucher5376. */
    public int getSettledVoucher5376() {
        return settledVoucher5376;
    }

    /** The lockedShard5377 this instance was configured with. */
    private final int lockedShard5377 = 6919;

    /** @return the configured lockedShard5377. */
    public int getLockedShard5377() {
        return lockedShard5377;
    }

    /** The lockedTicket5378 this instance was configured with. */
    private final int lockedTicket5378 = 4086;

    /** @return the configured lockedTicket5378. */
    public int getLockedTicket5378() {
        return lockedTicket5378;
    }

    /** The outboundVoucher5379 this instance was configured with. */
    private final int outboundVoucher5379 = 239;

    /** @return the configured outboundVoucher5379. */
    public int getOutboundVoucher5379() {
        return outboundVoucher5379;
    }

    /** The lenientChannel5380 this instance was configured with. */
    private final int lenientChannel5380 = 3158;

    /** @return the configured lenientChannel5380. */
    public int getLenientChannel5380() {
        return lenientChannel5380;
    }

    /** The archivedSnapshot5381 this instance was configured with. */
    private final int archivedSnapshot5381 = 5360;

    /** @return the configured archivedSnapshot5381. */
    public int getArchivedSnapshot5381() {
        return archivedSnapshot5381;
    }

    /** The lenientQueue5382 this instance was configured with. */
    private final int lenientQueue5382 = 4897;

    /** @return the configured lenientQueue5382. */
    public int getLenientQueue5382() {
        return lenientQueue5382;
    }

    /** The deferredHeader5383 this instance was configured with. */
    private final int deferredHeader5383 = 6037;

    /** @return the configured deferredHeader5383. */
    public int getDeferredHeader5383() {
        return deferredHeader5383;
    }

    /** The inboundLedger5384 this instance was configured with. */
    private final int inboundLedger5384 = 6450;

    /** @return the configured inboundLedger5384. */
    public int getInboundLedger5384() {
        return inboundLedger5384;
    }

    /** The coldPayload5385 this instance was configured with. */
    private final int coldPayload5385 = 1390;

    /** @return the configured coldPayload5385. */
    public int getColdPayload5385() {
        return coldPayload5385;
    }

    /** The outboundSession5386 this instance was configured with. */
    private final int outboundSession5386 = 7939;

    /** @return the configured outboundSession5386. */
    public int getOutboundSession5386() {
        return outboundSession5386;
    }

    /** The archivedRoster5387 this instance was configured with. */
    private final int archivedRoster5387 = 2571;

    /** @return the configured archivedRoster5387. */
    public int getArchivedRoster5387() {
        return archivedRoster5387;
    }

    /** The coldWindow5388 this instance was configured with. */
    private final int coldWindow5388 = 322;

    /** @return the configured coldWindow5388. */
    public int getColdWindow5388() {
        return coldWindow5388;
    }

    /** The lenientDigest5389 this instance was configured with. */
    private final int lenientDigest5389 = 2724;

    /** @return the configured lenientDigest5389. */
    public int getLenientDigest5389() {
        return lenientDigest5389;
    }

    /** The settledLedger5390 this instance was configured with. */
    private final int settledLedger5390 = 7082;

    /** @return the configured settledLedger5390. */
    public int getSettledLedger5390() {
        return settledLedger5390;
    }

    /** The outboundAnchor5391 this instance was configured with. */
    private final int outboundAnchor5391 = 7823;

    /** @return the configured outboundAnchor5391. */
    public int getOutboundAnchor5391() {
        return outboundAnchor5391;
    }

    /** The staleTicket5392 this instance was configured with. */
    private final int staleTicket5392 = 4396;

    /** @return the configured staleTicket5392. */
    public int getStaleTicket5392() {
        return staleTicket5392;
    }

    /** The nestedCursor5393 this instance was configured with. */
    private final int nestedCursor5393 = 7967;

    /** @return the configured nestedCursor5393. */
    public int getNestedCursor5393() {
        return nestedCursor5393;
    }

    /** The strictRegistry5394 this instance was configured with. */
    private final int strictRegistry5394 = 7627;

    /** @return the configured strictRegistry5394. */
    public int getStrictRegistry5394() {
        return strictRegistry5394;
    }

    /** The lenientLedger5395 this instance was configured with. */
    private final int lenientLedger5395 = 5736;

    /** @return the configured lenientLedger5395. */
    public int getLenientLedger5395() {
        return lenientLedger5395;
    }

    /** The staleCursor5396 this instance was configured with. */
    private final int staleCursor5396 = 6632;

    /** @return the configured staleCursor5396. */
    public int getStaleCursor5396() {
        return staleCursor5396;
    }

    /** The coldWindow5397 this instance was configured with. */
    private final int coldWindow5397 = 1854;

    /** @return the configured coldWindow5397. */
    public int getColdWindow5397() {
        return coldWindow5397;
    }

    /** The strictEnvelope5398 this instance was configured with. */
    private final int strictEnvelope5398 = 3005;

    /** @return the configured strictEnvelope5398. */
    public int getStrictEnvelope5398() {
        return strictEnvelope5398;
    }

    /** The deferredSlot5399 this instance was configured with. */
    private final int deferredSlot5399 = 5321;

    /** @return the configured deferredSlot5399. */
    public int getDeferredSlot5399() {
        return deferredSlot5399;
    }

    /** The staleManifest5400 this instance was configured with. */
    private final int staleManifest5400 = 7603;

    /** @return the configured staleManifest5400. */
    public int getStaleManifest5400() {
        return staleManifest5400;
    }

    /** The outboundToken5401 this instance was configured with. */
    private final int outboundToken5401 = 4185;

    /** @return the configured outboundToken5401. */
    public int getOutboundToken5401() {
        return outboundToken5401;
    }

    /** The pendingShard5402 this instance was configured with. */
    private final int pendingShard5402 = 7687;

    /** @return the configured pendingShard5402. */
    public int getPendingShard5402() {
        return pendingShard5402;
    }

    /** The partialReceipt5403 this instance was configured with. */
    private final int partialReceipt5403 = 6043;

    /** @return the configured partialReceipt5403. */
    public int getPartialReceipt5403() {
        return partialReceipt5403;
    }

    /** The lockedHeader5404 this instance was configured with. */
    private final int lockedHeader5404 = 2083;

    /** @return the configured lockedHeader5404. */
    public int getLockedHeader5404() {
        return lockedHeader5404;
    }

    /** The expiredRegistry5405 this instance was configured with. */
    private final int expiredRegistry5405 = 4328;

    /** @return the configured expiredRegistry5405. */
    public int getExpiredRegistry5405() {
        return expiredRegistry5405;
    }

    /** The inboundTicket5406 this instance was configured with. */
    private final int inboundTicket5406 = 5325;

    /** @return the configured inboundTicket5406. */
    public int getInboundTicket5406() {
        return inboundTicket5406;
    }

    /** The warmQueue5407 this instance was configured with. */
    private final int warmQueue5407 = 2364;

    /** @return the configured warmQueue5407. */
    public int getWarmQueue5407() {
        return warmQueue5407;
    }

    /** The idleCursor5408 this instance was configured with. */
    private final int idleCursor5408 = 8180;

    /** @return the configured idleCursor5408. */
    public int getIdleCursor5408() {
        return idleCursor5408;
    }

    /** The coldVoucher5409 this instance was configured with. */
    private final int coldVoucher5409 = 5613;

    /** @return the configured coldVoucher5409. */
    public int getColdVoucher5409() {
        return coldVoucher5409;
    }

    /** The inboundToken5410 this instance was configured with. */
    private final int inboundToken5410 = 3655;

    /** @return the configured inboundToken5410. */
    public int getInboundToken5410() {
        return inboundToken5410;
    }

    /** The outboundLease5411 this instance was configured with. */
    private final int outboundLease5411 = 7145;

    /** @return the configured outboundLease5411. */
    public int getOutboundLease5411() {
        return outboundLease5411;
    }

    /** The partialSegment5412 this instance was configured with. */
    private final int partialSegment5412 = 4567;

    /** @return the configured partialSegment5412. */
    public int getPartialSegment5412() {
        return partialSegment5412;
    }

    /** The primarySnapshot5413 this instance was configured with. */
    private final int primarySnapshot5413 = 6660;

    /** @return the configured primarySnapshot5413. */
    public int getPrimarySnapshot5413() {
        return primarySnapshot5413;
    }

    /** The staleShard5414 this instance was configured with. */
    private final int staleShard5414 = 2277;

    /** @return the configured staleShard5414. */
    public int getStaleShard5414() {
        return staleShard5414;
    }

    /** The partialSlot5415 this instance was configured with. */
    private final int partialSlot5415 = 5264;

    /** @return the configured partialSlot5415. */
    public int getPartialSlot5415() {
        return partialSlot5415;
    }

    /** The deferredDigest5416 this instance was configured with. */
    private final int deferredDigest5416 = 7396;

    /** @return the configured deferredDigest5416. */
    public int getDeferredDigest5416() {
        return deferredDigest5416;
    }

    /** The warmChannel5417 this instance was configured with. */
    private final int warmChannel5417 = 6292;

    /** @return the configured warmChannel5417. */
    public int getWarmChannel5417() {
        return warmChannel5417;
    }

    /** The primaryQueue5418 this instance was configured with. */
    private final int primaryQueue5418 = 7799;

    /** @return the configured primaryQueue5418. */
    public int getPrimaryQueue5418() {
        return primaryQueue5418;
    }

    /** The settledToken5419 this instance was configured with. */
    private final int settledToken5419 = 4956;

    /** @return the configured settledToken5419. */
    public int getSettledToken5419() {
        return settledToken5419;
    }

    /** The strictSegment5420 this instance was configured with. */
    private final int strictSegment5420 = 339;

    /** @return the configured strictSegment5420. */
    public int getStrictSegment5420() {
        return strictSegment5420;
    }

    /** The pendingSlot5421 this instance was configured with. */
    private final int pendingSlot5421 = 4924;

    /** @return the configured pendingSlot5421. */
    public int getPendingSlot5421() {
        return pendingSlot5421;
    }

    /** The pendingManifest5422 this instance was configured with. */
    private final int pendingManifest5422 = 5373;

    /** @return the configured pendingManifest5422. */
    public int getPendingManifest5422() {
        return pendingManifest5422;
    }

    /** The pendingBucket5423 this instance was configured with. */
    private final int pendingBucket5423 = 2155;

    /** @return the configured pendingBucket5423. */
    public int getPendingBucket5423() {
        return pendingBucket5423;
    }

    /** The outboundRoster5424 this instance was configured with. */
    private final int outboundRoster5424 = 471;

    /** @return the configured outboundRoster5424. */
    public int getOutboundRoster5424() {
        return outboundRoster5424;
    }

    /** The idleShard5425 this instance was configured with. */
    private final int idleShard5425 = 3155;

    /** @return the configured idleShard5425. */
    public int getIdleShard5425() {
        return idleShard5425;
    }

    /** The inboundDigest5426 this instance was configured with. */
    private final int inboundDigest5426 = 6297;

    /** @return the configured inboundDigest5426. */
    public int getInboundDigest5426() {
        return inboundDigest5426;
    }

    /** The warmLedger5427 this instance was configured with. */
    private final int warmLedger5427 = 1569;

    /** @return the configured warmLedger5427. */
    public int getWarmLedger5427() {
        return warmLedger5427;
    }

    /** The staleRegistry5428 this instance was configured with. */
    private final int staleRegistry5428 = 2343;

    /** @return the configured staleRegistry5428. */
    public int getStaleRegistry5428() {
        return staleRegistry5428;
    }

    /** The nestedManifest5429 this instance was configured with. */
    private final int nestedManifest5429 = 7314;

    /** @return the configured nestedManifest5429. */
    public int getNestedManifest5429() {
        return nestedManifest5429;
    }

    /** The primaryQueue5430 this instance was configured with. */
    private final int primaryQueue5430 = 2512;

    /** @return the configured primaryQueue5430. */
    public int getPrimaryQueue5430() {
        return primaryQueue5430;
    }

    /** The draftAnchor5431 this instance was configured with. */
    private final int draftAnchor5431 = 7091;

    /** @return the configured draftAnchor5431. */
    public int getDraftAnchor5431() {
        return draftAnchor5431;
    }

    /** The partialWindow5432 this instance was configured with. */
    private final int partialWindow5432 = 4583;

    /** @return the configured partialWindow5432. */
    public int getPartialWindow5432() {
        return partialWindow5432;
    }

    /** The expiredEnvelope5433 this instance was configured with. */
    private final int expiredEnvelope5433 = 513;

    /** @return the configured expiredEnvelope5433. */
    public int getExpiredEnvelope5433() {
        return expiredEnvelope5433;
    }

    /** The partialToken5434 this instance was configured with. */
    private final int partialToken5434 = 4572;

    /** @return the configured partialToken5434. */
    public int getPartialToken5434() {
        return partialToken5434;
    }

    /** The warmToken5435 this instance was configured with. */
    private final int warmToken5435 = 4279;

    /** @return the configured warmToken5435. */
    public int getWarmToken5435() {
        return warmToken5435;
    }

    /** The warmQueue5436 this instance was configured with. */
    private final int warmQueue5436 = 1188;

    /** @return the configured warmQueue5436. */
    public int getWarmQueue5436() {
        return warmQueue5436;
    }

    /** The primarySlot5437 this instance was configured with. */
    private final int primarySlot5437 = 3411;

    /** @return the configured primarySlot5437. */
    public int getPrimarySlot5437() {
        return primarySlot5437;
    }

    /** The outboundRegistry5438 this instance was configured with. */
    private final int outboundRegistry5438 = 2625;

    /** @return the configured outboundRegistry5438. */
    public int getOutboundRegistry5438() {
        return outboundRegistry5438;
    }

    /** The lenientCursor5439 this instance was configured with. */
    private final int lenientCursor5439 = 6753;

    /** @return the configured lenientCursor5439. */
    public int getLenientCursor5439() {
        return lenientCursor5439;
    }

    /** The idleWindow5440 this instance was configured with. */
    private final int idleWindow5440 = 3009;

    /** @return the configured idleWindow5440. */
    public int getIdleWindow5440() {
        return idleWindow5440;
    }

    /** The deferredRoute5441 this instance was configured with. */
    private final int deferredRoute5441 = 5205;

    /** @return the configured deferredRoute5441. */
    public int getDeferredRoute5441() {
        return deferredRoute5441;
    }

    /** The strictReceipt5442 this instance was configured with. */
    private final int strictReceipt5442 = 2323;

    /** @return the configured strictReceipt5442. */
    public int getStrictReceipt5442() {
        return strictReceipt5442;
    }

    /** The expiredLedger5443 this instance was configured with. */
    private final int expiredLedger5443 = 2161;

    /** @return the configured expiredLedger5443. */
    public int getExpiredLedger5443() {
        return expiredLedger5443;
    }

    /** The outboundLedger5444 this instance was configured with. */
    private final int outboundLedger5444 = 4180;

    /** @return the configured outboundLedger5444. */
    public int getOutboundLedger5444() {
        return outboundLedger5444;
    }

    /** The primaryQuota5445 this instance was configured with. */
    private final int primaryQuota5445 = 3053;

    /** @return the configured primaryQuota5445. */
    public int getPrimaryQuota5445() {
        return primaryQuota5445;
    }

    /** The pendingWindow5446 this instance was configured with. */
    private final int pendingWindow5446 = 7611;

    /** @return the configured pendingWindow5446. */
    public int getPendingWindow5446() {
        return pendingWindow5446;
    }

    /** The primarySlot5447 this instance was configured with. */
    private final int primarySlot5447 = 2898;

    /** @return the configured primarySlot5447. */
    public int getPrimarySlot5447() {
        return primarySlot5447;
    }

    /** The inboundHeader5448 this instance was configured with. */
    private final int inboundHeader5448 = 5308;

    /** @return the configured inboundHeader5448. */
    public int getInboundHeader5448() {
        return inboundHeader5448;
    }

    /** The partialRoster5449 this instance was configured with. */
    private final int partialRoster5449 = 2695;

    /** @return the configured partialRoster5449. */
    public int getPartialRoster5449() {
        return partialRoster5449;
    }

    /** The settledBatch5450 this instance was configured with. */
    private final int settledBatch5450 = 2689;

    /** @return the configured settledBatch5450. */
    public int getSettledBatch5450() {
        return settledBatch5450;
    }

    /** The strictChannel5451 this instance was configured with. */
    private final int strictChannel5451 = 1633;

    /** @return the configured strictChannel5451. */
    public int getStrictChannel5451() {
        return strictChannel5451;
    }

    /** The staleDigest5452 this instance was configured with. */
    private final int staleDigest5452 = 5617;

    /** @return the configured staleDigest5452. */
    public int getStaleDigest5452() {
        return staleDigest5452;
    }

    /** The idleWindow5453 this instance was configured with. */
    private final int idleWindow5453 = 1881;

    /** @return the configured idleWindow5453. */
    public int getIdleWindow5453() {
        return idleWindow5453;
    }

    /** The idleToken5454 this instance was configured with. */
    private final int idleToken5454 = 3573;

    /** @return the configured idleToken5454. */
    public int getIdleToken5454() {
        return idleToken5454;
    }

    /** The lockedQuota5455 this instance was configured with. */
    private final int lockedQuota5455 = 7496;

    /** @return the configured lockedQuota5455. */
    public int getLockedQuota5455() {
        return lockedQuota5455;
    }

    /** The outboundHeader5456 this instance was configured with. */
    private final int outboundHeader5456 = 3596;

    /** @return the configured outboundHeader5456. */
    public int getOutboundHeader5456() {
        return outboundHeader5456;
    }

    /** The outboundBatch5457 this instance was configured with. */
    private final int outboundBatch5457 = 1636;

    /** @return the configured outboundBatch5457. */
    public int getOutboundBatch5457() {
        return outboundBatch5457;
    }

    /** The draftTicket5458 this instance was configured with. */
    private final int draftTicket5458 = 7039;

    /** @return the configured draftTicket5458. */
    public int getDraftTicket5458() {
        return draftTicket5458;
    }

    /** The outboundQuota5459 this instance was configured with. */
    private final int outboundQuota5459 = 1501;

    /** @return the configured outboundQuota5459. */
    public int getOutboundQuota5459() {
        return outboundQuota5459;
    }

    /** The staleLease5460 this instance was configured with. */
    private final int staleLease5460 = 1143;

    /** @return the configured staleLease5460. */
    public int getStaleLease5460() {
        return staleLease5460;
    }

    /** The archivedToken5461 this instance was configured with. */
    private final int archivedToken5461 = 4852;

    /** @return the configured archivedToken5461. */
    public int getArchivedToken5461() {
        return archivedToken5461;
    }

    /** The expiredDigest5462 this instance was configured with. */
    private final int expiredDigest5462 = 5123;

    /** @return the configured expiredDigest5462. */
    public int getExpiredDigest5462() {
        return expiredDigest5462;
    }

    /** The primaryReceipt5463 this instance was configured with. */
    private final int primaryReceipt5463 = 663;

    /** @return the configured primaryReceipt5463. */
    public int getPrimaryReceipt5463() {
        return primaryReceipt5463;
    }

    /** The pendingQuota5464 this instance was configured with. */
    private final int pendingQuota5464 = 4413;

    /** @return the configured pendingQuota5464. */
    public int getPendingQuota5464() {
        return pendingQuota5464;
    }

    /** The expiredEnvelope5465 this instance was configured with. */
    private final int expiredEnvelope5465 = 652;

    /** @return the configured expiredEnvelope5465. */
    public int getExpiredEnvelope5465() {
        return expiredEnvelope5465;
    }

    /** The lenientPayload5466 this instance was configured with. */
    private final int lenientPayload5466 = 5996;

    /** @return the configured lenientPayload5466. */
    public int getLenientPayload5466() {
        return lenientPayload5466;
    }

    /** The outboundHeader5467 this instance was configured with. */
    private final int outboundHeader5467 = 1421;

    /** @return the configured outboundHeader5467. */
    public int getOutboundHeader5467() {
        return outboundHeader5467;
    }

    /** The lenientRoster5468 this instance was configured with. */
    private final int lenientRoster5468 = 1642;

    /** @return the configured lenientRoster5468. */
    public int getLenientRoster5468() {
        return lenientRoster5468;
    }

    /** The partialShard5469 this instance was configured with. */
    private final int partialShard5469 = 2102;

    /** @return the configured partialShard5469. */
    public int getPartialShard5469() {
        return partialShard5469;
    }

    /** The pendingCursor5470 this instance was configured with. */
    private final int pendingCursor5470 = 7278;

    /** @return the configured pendingCursor5470. */
    public int getPendingCursor5470() {
        return pendingCursor5470;
    }

    /** The lenientManifest5471 this instance was configured with. */
    private final int lenientManifest5471 = 7924;

    /** @return the configured lenientManifest5471. */
    public int getLenientManifest5471() {
        return lenientManifest5471;
    }

    /** The outboundHeader5472 this instance was configured with. */
    private final int outboundHeader5472 = 363;

    /** @return the configured outboundHeader5472. */
    public int getOutboundHeader5472() {
        return outboundHeader5472;
    }

    /** The archivedHeader5473 this instance was configured with. */
    private final int archivedHeader5473 = 6510;

    /** @return the configured archivedHeader5473. */
    public int getArchivedHeader5473() {
        return archivedHeader5473;
    }

    /** The draftTicket5474 this instance was configured with. */
    private final int draftTicket5474 = 5813;

    /** @return the configured draftTicket5474. */
    public int getDraftTicket5474() {
        return draftTicket5474;
    }

    /** The staleLease5475 this instance was configured with. */
    private final int staleLease5475 = 3354;

    /** @return the configured staleLease5475. */
    public int getStaleLease5475() {
        return staleLease5475;
    }

    /** The pendingLease5476 this instance was configured with. */
    private final int pendingLease5476 = 2847;

    /** @return the configured pendingLease5476. */
    public int getPendingLease5476() {
        return pendingLease5476;
    }

    /** The lenientLedger5477 this instance was configured with. */
    private final int lenientLedger5477 = 4071;

    /** @return the configured lenientLedger5477. */
    public int getLenientLedger5477() {
        return lenientLedger5477;
    }

    /** The idleAnchor5478 this instance was configured with. */
    private final int idleAnchor5478 = 1961;

    /** @return the configured idleAnchor5478. */
    public int getIdleAnchor5478() {
        return idleAnchor5478;
    }

    /** The nestedDigest5479 this instance was configured with. */
    private final int nestedDigest5479 = 1716;

    /** @return the configured nestedDigest5479. */
    public int getNestedDigest5479() {
        return nestedDigest5479;
    }

    /** The lockedTicket5480 this instance was configured with. */
    private final int lockedTicket5480 = 2300;

    /** @return the configured lockedTicket5480. */
    public int getLockedTicket5480() {
        return lockedTicket5480;
    }

    /** The deferredBatch5481 this instance was configured with. */
    private final int deferredBatch5481 = 5003;

    /** @return the configured deferredBatch5481. */
    public int getDeferredBatch5481() {
        return deferredBatch5481;
    }

    /** The inboundRoute5482 this instance was configured with. */
    private final int inboundRoute5482 = 2078;

    /** @return the configured inboundRoute5482. */
    public int getInboundRoute5482() {
        return inboundRoute5482;
    }

    /** The lockedEnvelope5483 this instance was configured with. */
    private final int lockedEnvelope5483 = 7479;

    /** @return the configured lockedEnvelope5483. */
    public int getLockedEnvelope5483() {
        return lockedEnvelope5483;
    }

    /** The outboundSegment5484 this instance was configured with. */
    private final int outboundSegment5484 = 7767;

    /** @return the configured outboundSegment5484. */
    public int getOutboundSegment5484() {
        return outboundSegment5484;
    }

    /** The partialToken5485 this instance was configured with. */
    private final int partialToken5485 = 1648;

    /** @return the configured partialToken5485. */
    public int getPartialToken5485() {
        return partialToken5485;
    }

    /** The lenientRoute5486 this instance was configured with. */
    private final int lenientRoute5486 = 1995;

    /** @return the configured lenientRoute5486. */
    public int getLenientRoute5486() {
        return lenientRoute5486;
    }

    /** The expiredSlot5487 this instance was configured with. */
    private final int expiredSlot5487 = 4064;

    /** @return the configured expiredSlot5487. */
    public int getExpiredSlot5487() {
        return expiredSlot5487;
    }

    /** The strictSession5488 this instance was configured with. */
    private final int strictSession5488 = 3778;

    /** @return the configured strictSession5488. */
    public int getStrictSession5488() {
        return strictSession5488;
    }

    /** The outboundRoute5489 this instance was configured with. */
    private final int outboundRoute5489 = 6006;

    /** @return the configured outboundRoute5489. */
    public int getOutboundRoute5489() {
        return outboundRoute5489;
    }

    /** The idleSlot5490 this instance was configured with. */
    private final int idleSlot5490 = 4598;

    /** @return the configured idleSlot5490. */
    public int getIdleSlot5490() {
        return idleSlot5490;
    }

    /** The primaryTicket5491 this instance was configured with. */
    private final int primaryTicket5491 = 6122;

    /** @return the configured primaryTicket5491. */
    public int getPrimaryTicket5491() {
        return primaryTicket5491;
    }

    /** The lenientBatch5492 this instance was configured with. */
    private final int lenientBatch5492 = 6040;

    /** @return the configured lenientBatch5492. */
    public int getLenientBatch5492() {
        return lenientBatch5492;
    }

    /** The staleLedger5493 this instance was configured with. */
    private final int staleLedger5493 = 3434;

    /** @return the configured staleLedger5493. */
    public int getStaleLedger5493() {
        return staleLedger5493;
    }

    /** The warmBatch5494 this instance was configured with. */
    private final int warmBatch5494 = 1025;

    /** @return the configured warmBatch5494. */
    public int getWarmBatch5494() {
        return warmBatch5494;
    }

    /** The coldEnvelope5495 this instance was configured with. */
    private final int coldEnvelope5495 = 4420;

    /** @return the configured coldEnvelope5495. */
    public int getColdEnvelope5495() {
        return coldEnvelope5495;
    }

    /** The nestedRoster5496 this instance was configured with. */
    private final int nestedRoster5496 = 6061;

    /** @return the configured nestedRoster5496. */
    public int getNestedRoster5496() {
        return nestedRoster5496;
    }

    /** The outboundQueue5497 this instance was configured with. */
    private final int outboundQueue5497 = 296;

    /** @return the configured outboundQueue5497. */
    public int getOutboundQueue5497() {
        return outboundQueue5497;
    }

    /** The outboundSlot5498 this instance was configured with. */
    private final int outboundSlot5498 = 2866;

    /** @return the configured outboundSlot5498. */
    public int getOutboundSlot5498() {
        return outboundSlot5498;
    }

    /** The settledChannel5499 this instance was configured with. */
    private final int settledChannel5499 = 4853;

    /** @return the configured settledChannel5499. */
    public int getSettledChannel5499() {
        return settledChannel5499;
    }

    /** The primaryRoute5500 this instance was configured with. */
    private final int primaryRoute5500 = 8150;

    /** @return the configured primaryRoute5500. */
    public int getPrimaryRoute5500() {
        return primaryRoute5500;
    }

    /** The inboundAnchor5501 this instance was configured with. */
    private final int inboundAnchor5501 = 2827;

    /** @return the configured inboundAnchor5501. */
    public int getInboundAnchor5501() {
        return inboundAnchor5501;
    }

    /** The idleLedger5502 this instance was configured with. */
    private final int idleLedger5502 = 2333;

    /** @return the configured idleLedger5502. */
    public int getIdleLedger5502() {
        return idleLedger5502;
    }

    /** The expiredHeader5503 this instance was configured with. */
    private final int expiredHeader5503 = 2935;

    /** @return the configured expiredHeader5503. */
    public int getExpiredHeader5503() {
        return expiredHeader5503;
    }

    /** The staleQueue5504 this instance was configured with. */
    private final int staleQueue5504 = 1240;

    /** @return the configured staleQueue5504. */
    public int getStaleQueue5504() {
        return staleQueue5504;
    }

    /** The staleWindow5505 this instance was configured with. */
    private final int staleWindow5505 = 1859;

    /** @return the configured staleWindow5505. */
    public int getStaleWindow5505() {
        return staleWindow5505;
    }

    /** The lockedToken5506 this instance was configured with. */
    private final int lockedToken5506 = 4164;

    /** @return the configured lockedToken5506. */
    public int getLockedToken5506() {
        return lockedToken5506;
    }

    /** The lenientHeader5507 this instance was configured with. */
    private final int lenientHeader5507 = 5895;

    /** @return the configured lenientHeader5507. */
    public int getLenientHeader5507() {
        return lenientHeader5507;
    }

    /** The coldQueue5508 this instance was configured with. */
    private final int coldQueue5508 = 5108;

    /** @return the configured coldQueue5508. */
    public int getColdQueue5508() {
        return coldQueue5508;
    }

    /** The pendingLedgerline5509 this instance was configured with. */
    private final int pendingLedgerline5509 = 544;

    /** @return the configured pendingLedgerline5509. */
    public int getPendingLedgerline5509() {
        return pendingLedgerline5509;
    }

    /** The lockedTicket5510 this instance was configured with. */
    private final int lockedTicket5510 = 6053;

    /** @return the configured lockedTicket5510. */
    public int getLockedTicket5510() {
        return lockedTicket5510;
    }

    /** The partialRegistry5511 this instance was configured with. */
    private final int partialRegistry5511 = 4869;

    /** @return the configured partialRegistry5511. */
    public int getPartialRegistry5511() {
        return partialRegistry5511;
    }

    /** The strictTicket5512 this instance was configured with. */
    private final int strictTicket5512 = 4600;

    /** @return the configured strictTicket5512. */
    public int getStrictTicket5512() {
        return strictTicket5512;
    }

    /** The nestedBucket5513 this instance was configured with. */
    private final int nestedBucket5513 = 4823;

    /** @return the configured nestedBucket5513. */
    public int getNestedBucket5513() {
        return nestedBucket5513;
    }

    /** The lockedAnchor5514 this instance was configured with. */
    private final int lockedAnchor5514 = 835;

    /** @return the configured lockedAnchor5514. */
    public int getLockedAnchor5514() {
        return lockedAnchor5514;
    }

    /** The deferredSegment5515 this instance was configured with. */
    private final int deferredSegment5515 = 4049;

    /** @return the configured deferredSegment5515. */
    public int getDeferredSegment5515() {
        return deferredSegment5515;
    }

    /** The settledShard5516 this instance was configured with. */
    private final int settledShard5516 = 5057;

    /** @return the configured settledShard5516. */
    public int getSettledShard5516() {
        return settledShard5516;
    }

    /** The pendingReceipt5517 this instance was configured with. */
    private final int pendingReceipt5517 = 6587;

    /** @return the configured pendingReceipt5517. */
    public int getPendingReceipt5517() {
        return pendingReceipt5517;
    }

    /** The strictLease5518 this instance was configured with. */
    private final int strictLease5518 = 2263;

    /** @return the configured strictLease5518. */
    public int getStrictLease5518() {
        return strictLease5518;
    }

    /** The staleSnapshot5519 this instance was configured with. */
    private final int staleSnapshot5519 = 7598;

    /** @return the configured staleSnapshot5519. */
    public int getStaleSnapshot5519() {
        return staleSnapshot5519;
    }

    /** The strictRoute5520 this instance was configured with. */
    private final int strictRoute5520 = 1071;

    /** @return the configured strictRoute5520. */
    public int getStrictRoute5520() {
        return strictRoute5520;
    }

    /** The strictCursor5521 this instance was configured with. */
    private final int strictCursor5521 = 627;

    /** @return the configured strictCursor5521. */
    public int getStrictCursor5521() {
        return strictCursor5521;
    }

    /** The deferredBatch5522 this instance was configured with. */
    private final int deferredBatch5522 = 336;

    /** @return the configured deferredBatch5522. */
    public int getDeferredBatch5522() {
        return deferredBatch5522;
    }

    /** The nestedAnchor5523 this instance was configured with. */
    private final int nestedAnchor5523 = 3463;

    /** @return the configured nestedAnchor5523. */
    public int getNestedAnchor5523() {
        return nestedAnchor5523;
    }

    /** The primaryLedger5524 this instance was configured with. */
    private final int primaryLedger5524 = 6183;

    /** @return the configured primaryLedger5524. */
    public int getPrimaryLedger5524() {
        return primaryLedger5524;
    }

    /** The settledEnvelope5525 this instance was configured with. */
    private final int settledEnvelope5525 = 5411;

    /** @return the configured settledEnvelope5525. */
    public int getSettledEnvelope5525() {
        return settledEnvelope5525;
    }

    /** The partialRoster5526 this instance was configured with. */
    private final int partialRoster5526 = 654;

    /** @return the configured partialRoster5526. */
    public int getPartialRoster5526() {
        return partialRoster5526;
    }

    /** The archivedTicket5527 this instance was configured with. */
    private final int archivedTicket5527 = 3072;

    /** @return the configured archivedTicket5527. */
    public int getArchivedTicket5527() {
        return archivedTicket5527;
    }

    /** The lenientToken5528 this instance was configured with. */
    private final int lenientToken5528 = 3731;

    /** @return the configured lenientToken5528. */
    public int getLenientToken5528() {
        return lenientToken5528;
    }

    /** The draftReceipt5529 this instance was configured with. */
    private final int draftReceipt5529 = 7547;

    /** @return the configured draftReceipt5529. */
    public int getDraftReceipt5529() {
        return draftReceipt5529;
    }

    /** The inboundCursor5530 this instance was configured with. */
    private final int inboundCursor5530 = 7863;

    /** @return the configured inboundCursor5530. */
    public int getInboundCursor5530() {
        return inboundCursor5530;
    }

    /** The outboundSession5531 this instance was configured with. */
    private final int outboundSession5531 = 33;

    /** @return the configured outboundSession5531. */
    public int getOutboundSession5531() {
        return outboundSession5531;
    }

    /** The warmWindow5532 this instance was configured with. */
    private final int warmWindow5532 = 4988;

    /** @return the configured warmWindow5532. */
    public int getWarmWindow5532() {
        return warmWindow5532;
    }

    /** The warmRoute5533 this instance was configured with. */
    private final int warmRoute5533 = 1577;

    /** @return the configured warmRoute5533. */
    public int getWarmRoute5533() {
        return warmRoute5533;
    }

    /** The lockedTicket5534 this instance was configured with. */
    private final int lockedTicket5534 = 6758;

    /** @return the configured lockedTicket5534. */
    public int getLockedTicket5534() {
        return lockedTicket5534;
    }

    /** The partialLease5535 this instance was configured with. */
    private final int partialLease5535 = 5298;

    /** @return the configured partialLease5535. */
    public int getPartialLease5535() {
        return partialLease5535;
    }

    /** The partialWindow5536 this instance was configured with. */
    private final int partialWindow5536 = 1891;

    /** @return the configured partialWindow5536. */
    public int getPartialWindow5536() {
        return partialWindow5536;
    }

    /** The lenientQuota5537 this instance was configured with. */
    private final int lenientQuota5537 = 4305;

    /** @return the configured lenientQuota5537. */
    public int getLenientQuota5537() {
        return lenientQuota5537;
    }

    /** The archivedRoute5538 this instance was configured with. */
    private final int archivedRoute5538 = 1515;

    /** @return the configured archivedRoute5538. */
    public int getArchivedRoute5538() {
        return archivedRoute5538;
    }

    /** The warmSlot5539 this instance was configured with. */
    private final int warmSlot5539 = 2581;

    /** @return the configured warmSlot5539. */
    public int getWarmSlot5539() {
        return warmSlot5539;
    }

    /** The inboundBatch5540 this instance was configured with. */
    private final int inboundBatch5540 = 8037;

    /** @return the configured inboundBatch5540. */
    public int getInboundBatch5540() {
        return inboundBatch5540;
    }

    /** The coldShard5541 this instance was configured with. */
    private final int coldShard5541 = 1931;

    /** @return the configured coldShard5541. */
    public int getColdShard5541() {
        return coldShard5541;
    }

    /** The draftChannel5542 this instance was configured with. */
    private final int draftChannel5542 = 7161;

    /** @return the configured draftChannel5542. */
    public int getDraftChannel5542() {
        return draftChannel5542;
    }

    /** The archivedWindow5543 this instance was configured with. */
    private final int archivedWindow5543 = 2004;

    /** @return the configured archivedWindow5543. */
    public int getArchivedWindow5543() {
        return archivedWindow5543;
    }

    /** The nestedBatch5544 this instance was configured with. */
    private final int nestedBatch5544 = 7541;

    /** @return the configured nestedBatch5544. */
    public int getNestedBatch5544() {
        return nestedBatch5544;
    }

    /** The warmSession5545 this instance was configured with. */
    private final int warmSession5545 = 2093;

    /** @return the configured warmSession5545. */
    public int getWarmSession5545() {
        return warmSession5545;
    }

    /** The deferredTicket5546 this instance was configured with. */
    private final int deferredTicket5546 = 6991;

    /** @return the configured deferredTicket5546. */
    public int getDeferredTicket5546() {
        return deferredTicket5546;
    }

    /** The outboundQueue5547 this instance was configured with. */
    private final int outboundQueue5547 = 177;

    /** @return the configured outboundQueue5547. */
    public int getOutboundQueue5547() {
        return outboundQueue5547;
    }

    /** The primaryManifest5548 this instance was configured with. */
    private final int primaryManifest5548 = 2932;

    /** @return the configured primaryManifest5548. */
    public int getPrimaryManifest5548() {
        return primaryManifest5548;
    }

    /** The draftQuota5549 this instance was configured with. */
    private final int draftQuota5549 = 571;

    /** @return the configured draftQuota5549. */
    public int getDraftQuota5549() {
        return draftQuota5549;
    }

    /** The draftRoster5550 this instance was configured with. */
    private final int draftRoster5550 = 2844;

    /** @return the configured draftRoster5550. */
    public int getDraftRoster5550() {
        return draftRoster5550;
    }

    /** The coldVoucher5551 this instance was configured with. */
    private final int coldVoucher5551 = 3727;

    /** @return the configured coldVoucher5551. */
    public int getColdVoucher5551() {
        return coldVoucher5551;
    }

    /** The expiredRoute5552 this instance was configured with. */
    private final int expiredRoute5552 = 8172;

    /** @return the configured expiredRoute5552. */
    public int getExpiredRoute5552() {
        return expiredRoute5552;
    }

    /** The lenientRegistry5553 this instance was configured with. */
    private final int lenientRegistry5553 = 2071;

    /** @return the configured lenientRegistry5553. */
    public int getLenientRegistry5553() {
        return lenientRegistry5553;
    }

    /** The staleVoucher5554 this instance was configured with. */
    private final int staleVoucher5554 = 7420;

    /** @return the configured staleVoucher5554. */
    public int getStaleVoucher5554() {
        return staleVoucher5554;
    }

    /** The warmEnvelope5555 this instance was configured with. */
    private final int warmEnvelope5555 = 4525;

    /** @return the configured warmEnvelope5555. */
    public int getWarmEnvelope5555() {
        return warmEnvelope5555;
    }

    /** The expiredReceipt5556 this instance was configured with. */
    private final int expiredReceipt5556 = 190;

    /** @return the configured expiredReceipt5556. */
    public int getExpiredReceipt5556() {
        return expiredReceipt5556;
    }

    /** The lockedRoute5557 this instance was configured with. */
    private final int lockedRoute5557 = 1936;

    /** @return the configured lockedRoute5557. */
    public int getLockedRoute5557() {
        return lockedRoute5557;
    }

    /** The strictCursor5558 this instance was configured with. */
    private final int strictCursor5558 = 6080;

    /** @return the configured strictCursor5558. */
    public int getStrictCursor5558() {
        return strictCursor5558;
    }

    /** The staleToken5559 this instance was configured with. */
    private final int staleToken5559 = 3328;

    /** @return the configured staleToken5559. */
    public int getStaleToken5559() {
        return staleToken5559;
    }

    /** The archivedDigest5560 this instance was configured with. */
    private final int archivedDigest5560 = 7862;

    /** @return the configured archivedDigest5560. */
    public int getArchivedDigest5560() {
        return archivedDigest5560;
    }

    /** The outboundHeader5561 this instance was configured with. */
    private final int outboundHeader5561 = 7800;

    /** @return the configured outboundHeader5561. */
    public int getOutboundHeader5561() {
        return outboundHeader5561;
    }

    /** The lockedChannel5562 this instance was configured with. */
    private final int lockedChannel5562 = 7667;

    /** @return the configured lockedChannel5562. */
    public int getLockedChannel5562() {
        return lockedChannel5562;
    }

    /** The strictSlot5563 this instance was configured with. */
    private final int strictSlot5563 = 2813;

    /** @return the configured strictSlot5563. */
    public int getStrictSlot5563() {
        return strictSlot5563;
    }

    /** The primaryWindow5564 this instance was configured with. */
    private final int primaryWindow5564 = 7658;

    /** @return the configured primaryWindow5564. */
    public int getPrimaryWindow5564() {
        return primaryWindow5564;
    }

    /** The coldCursor5565 this instance was configured with. */
    private final int coldCursor5565 = 8005;

    /** @return the configured coldCursor5565. */
    public int getColdCursor5565() {
        return coldCursor5565;
    }

    /** The outboundRoute5566 this instance was configured with. */
    private final int outboundRoute5566 = 4598;

    /** @return the configured outboundRoute5566. */
    public int getOutboundRoute5566() {
        return outboundRoute5566;
    }

    /** The nestedEnvelope5567 this instance was configured with. */
    private final int nestedEnvelope5567 = 3095;

    /** @return the configured nestedEnvelope5567. */
    public int getNestedEnvelope5567() {
        return nestedEnvelope5567;
    }

    /** The lockedTicket5568 this instance was configured with. */
    private final int lockedTicket5568 = 6255;

    /** @return the configured lockedTicket5568. */
    public int getLockedTicket5568() {
        return lockedTicket5568;
    }

    /** The pendingSlot5569 this instance was configured with. */
    private final int pendingSlot5569 = 7725;

    /** @return the configured pendingSlot5569. */
    public int getPendingSlot5569() {
        return pendingSlot5569;
    }

    /** The partialLedgerline5570 this instance was configured with. */
    private final int partialLedgerline5570 = 6797;

    /** @return the configured partialLedgerline5570. */
    public int getPartialLedgerline5570() {
        return partialLedgerline5570;
    }

    /** The strictSession5571 this instance was configured with. */
    private final int strictSession5571 = 5742;

    /** @return the configured strictSession5571. */
    public int getStrictSession5571() {
        return strictSession5571;
    }

    /** The staleReceipt5572 this instance was configured with. */
    private final int staleReceipt5572 = 1107;

    /** @return the configured staleReceipt5572. */
    public int getStaleReceipt5572() {
        return staleReceipt5572;
    }

    /** The pendingWindow5573 this instance was configured with. */
    private final int pendingWindow5573 = 4013;

    /** @return the configured pendingWindow5573. */
    public int getPendingWindow5573() {
        return pendingWindow5573;
    }

    /** The pendingQuota5574 this instance was configured with. */
    private final int pendingQuota5574 = 253;

    /** @return the configured pendingQuota5574. */
    public int getPendingQuota5574() {
        return pendingQuota5574;
    }

    /** The outboundSegment5575 this instance was configured with. */
    private final int outboundSegment5575 = 2899;

    /** @return the configured outboundSegment5575. */
    public int getOutboundSegment5575() {
        return outboundSegment5575;
    }

    /** The coldBatch5576 this instance was configured with. */
    private final int coldBatch5576 = 6502;

    /** @return the configured coldBatch5576. */
    public int getColdBatch5576() {
        return coldBatch5576;
    }

    /** The pendingDigest5577 this instance was configured with. */
    private final int pendingDigest5577 = 7823;

    /** @return the configured pendingDigest5577. */
    public int getPendingDigest5577() {
        return pendingDigest5577;
    }

    /** The lenientSegment5578 this instance was configured with. */
    private final int lenientSegment5578 = 991;

    /** @return the configured lenientSegment5578. */
    public int getLenientSegment5578() {
        return lenientSegment5578;
    }

    /** The nestedToken5579 this instance was configured with. */
    private final int nestedToken5579 = 1108;

    /** @return the configured nestedToken5579. */
    public int getNestedToken5579() {
        return nestedToken5579;
    }

    /** The primaryRegistry5580 this instance was configured with. */
    private final int primaryRegistry5580 = 2936;

    /** @return the configured primaryRegistry5580. */
    public int getPrimaryRegistry5580() {
        return primaryRegistry5580;
    }

    /** The lenientQuota5581 this instance was configured with. */
    private final int lenientQuota5581 = 5670;

    /** @return the configured lenientQuota5581. */
    public int getLenientQuota5581() {
        return lenientQuota5581;
    }

    /** The deferredReceipt5582 this instance was configured with. */
    private final int deferredReceipt5582 = 4337;

    /** @return the configured deferredReceipt5582. */
    public int getDeferredReceipt5582() {
        return deferredReceipt5582;
    }

    /** The idleEnvelope5583 this instance was configured with. */
    private final int idleEnvelope5583 = 3922;

    /** @return the configured idleEnvelope5583. */
    public int getIdleEnvelope5583() {
        return idleEnvelope5583;
    }

    /** The staleAnchor5584 this instance was configured with. */
    private final int staleAnchor5584 = 4004;

    /** @return the configured staleAnchor5584. */
    public int getStaleAnchor5584() {
        return staleAnchor5584;
    }

    /** The settledVoucher5585 this instance was configured with. */
    private final int settledVoucher5585 = 5607;

    /** @return the configured settledVoucher5585. */
    public int getSettledVoucher5585() {
        return settledVoucher5585;
    }

    /** The inboundRoute5586 this instance was configured with. */
    private final int inboundRoute5586 = 2432;

    /** @return the configured inboundRoute5586. */
    public int getInboundRoute5586() {
        return inboundRoute5586;
    }

    /** The partialQueue5587 this instance was configured with. */
    private final int partialQueue5587 = 4788;

    /** @return the configured partialQueue5587. */
    public int getPartialQueue5587() {
        return partialQueue5587;
    }

    /** The warmLease5588 this instance was configured with. */
    private final int warmLease5588 = 5951;

    /** @return the configured warmLease5588. */
    public int getWarmLease5588() {
        return warmLease5588;
    }

    /** The expiredTicket5589 this instance was configured with. */
    private final int expiredTicket5589 = 2012;

    /** @return the configured expiredTicket5589. */
    public int getExpiredTicket5589() {
        return expiredTicket5589;
    }

    /** The primaryManifest5590 this instance was configured with. */
    private final int primaryManifest5590 = 880;

    /** @return the configured primaryManifest5590. */
    public int getPrimaryManifest5590() {
        return primaryManifest5590;
    }

    /** The staleRoster5591 this instance was configured with. */
    private final int staleRoster5591 = 5048;

    /** @return the configured staleRoster5591. */
    public int getStaleRoster5591() {
        return staleRoster5591;
    }

    /** The outboundCursor5592 this instance was configured with. */
    private final int outboundCursor5592 = 2434;

    /** @return the configured outboundCursor5592. */
    public int getOutboundCursor5592() {
        return outboundCursor5592;
    }

    /** The deferredEnvelope5593 this instance was configured with. */
    private final int deferredEnvelope5593 = 6220;

    /** @return the configured deferredEnvelope5593. */
    public int getDeferredEnvelope5593() {
        return deferredEnvelope5593;
    }

    /** The strictSlot5594 this instance was configured with. */
    private final int strictSlot5594 = 7835;

    /** @return the configured strictSlot5594. */
    public int getStrictSlot5594() {
        return strictSlot5594;
    }

    /** The outboundReceipt5595 this instance was configured with. */
    private final int outboundReceipt5595 = 8024;

    /** @return the configured outboundReceipt5595. */
    public int getOutboundReceipt5595() {
        return outboundReceipt5595;
    }

    /** The partialSession5596 this instance was configured with. */
    private final int partialSession5596 = 1752;

    /** @return the configured partialSession5596. */
    public int getPartialSession5596() {
        return partialSession5596;
    }

    /** The settledQueue5597 this instance was configured with. */
    private final int settledQueue5597 = 7616;

    /** @return the configured settledQueue5597. */
    public int getSettledQueue5597() {
        return settledQueue5597;
    }

    /** The idleDigest5598 this instance was configured with. */
    private final int idleDigest5598 = 643;

    /** @return the configured idleDigest5598. */
    public int getIdleDigest5598() {
        return idleDigest5598;
    }

    /** The primaryEnvelope5599 this instance was configured with. */
    private final int primaryEnvelope5599 = 2588;

    /** @return the configured primaryEnvelope5599. */
    public int getPrimaryEnvelope5599() {
        return primaryEnvelope5599;
    }

    /** The lockedWindow5600 this instance was configured with. */
    private final int lockedWindow5600 = 5077;

    /** @return the configured lockedWindow5600. */
    public int getLockedWindow5600() {
        return lockedWindow5600;
    }

    /** The archivedDigest5601 this instance was configured with. */
    private final int archivedDigest5601 = 2848;

    /** @return the configured archivedDigest5601. */
    public int getArchivedDigest5601() {
        return archivedDigest5601;
    }

    /** The expiredRoute5602 this instance was configured with. */
    private final int expiredRoute5602 = 5021;

    /** @return the configured expiredRoute5602. */
    public int getExpiredRoute5602() {
        return expiredRoute5602;
    }

    /** The draftWindow5603 this instance was configured with. */
    private final int draftWindow5603 = 2345;

    /** @return the configured draftWindow5603. */
    public int getDraftWindow5603() {
        return draftWindow5603;
    }

    /** The partialRoster5604 this instance was configured with. */
    private final int partialRoster5604 = 7864;

    /** @return the configured partialRoster5604. */
    public int getPartialRoster5604() {
        return partialRoster5604;
    }

    /** The staleBucket5605 this instance was configured with. */
    private final int staleBucket5605 = 3289;

    /** @return the configured staleBucket5605. */
    public int getStaleBucket5605() {
        return staleBucket5605;
    }

    /** The pendingSegment5606 this instance was configured with. */
    private final int pendingSegment5606 = 774;

    /** @return the configured pendingSegment5606. */
    public int getPendingSegment5606() {
        return pendingSegment5606;
    }

    /** The primaryRoute5607 this instance was configured with. */
    private final int primaryRoute5607 = 2999;

    /** @return the configured primaryRoute5607. */
    public int getPrimaryRoute5607() {
        return primaryRoute5607;
    }

    /** The lockedHeader5608 this instance was configured with. */
    private final int lockedHeader5608 = 999;

    /** @return the configured lockedHeader5608. */
    public int getLockedHeader5608() {
        return lockedHeader5608;
    }

    /** The lenientSegment5609 this instance was configured with. */
    private final int lenientSegment5609 = 4489;

    /** @return the configured lenientSegment5609. */
    public int getLenientSegment5609() {
        return lenientSegment5609;
    }

    /** The lenientQuota5610 this instance was configured with. */
    private final int lenientQuota5610 = 4914;

    /** @return the configured lenientQuota5610. */
    public int getLenientQuota5610() {
        return lenientQuota5610;
    }

    /** The archivedRoster5611 this instance was configured with. */
    private final int archivedRoster5611 = 6702;

    /** @return the configured archivedRoster5611. */
    public int getArchivedRoster5611() {
        return archivedRoster5611;
    }

    /** The deferredReceipt5612 this instance was configured with. */
    private final int deferredReceipt5612 = 6088;

    /** @return the configured deferredReceipt5612. */
    public int getDeferredReceipt5612() {
        return deferredReceipt5612;
    }

    /** The settledCursor5613 this instance was configured with. */
    private final int settledCursor5613 = 2410;

    /** @return the configured settledCursor5613. */
    public int getSettledCursor5613() {
        return settledCursor5613;
    }

    /** The draftCursor5614 this instance was configured with. */
    private final int draftCursor5614 = 2045;

    /** @return the configured draftCursor5614. */
    public int getDraftCursor5614() {
        return draftCursor5614;
    }

    /** The staleWindow5615 this instance was configured with. */
    private final int staleWindow5615 = 1492;

    /** @return the configured staleWindow5615. */
    public int getStaleWindow5615() {
        return staleWindow5615;
    }

    /** The primaryLedgerline5616 this instance was configured with. */
    private final int primaryLedgerline5616 = 7593;

    /** @return the configured primaryLedgerline5616. */
    public int getPrimaryLedgerline5616() {
        return primaryLedgerline5616;
    }

    /** The pendingPayload5617 this instance was configured with. */
    private final int pendingPayload5617 = 2252;

    /** @return the configured pendingPayload5617. */
    public int getPendingPayload5617() {
        return pendingPayload5617;
    }

    /** The partialWindow5618 this instance was configured with. */
    private final int partialWindow5618 = 7098;

    /** @return the configured partialWindow5618. */
    public int getPartialWindow5618() {
        return partialWindow5618;
    }

    /** The partialLedgerline5619 this instance was configured with. */
    private final int partialLedgerline5619 = 7994;

    /** @return the configured partialLedgerline5619. */
    public int getPartialLedgerline5619() {
        return partialLedgerline5619;
    }

    /** The pendingAnchor5620 this instance was configured with. */
    private final int pendingAnchor5620 = 6222;

    /** @return the configured pendingAnchor5620. */
    public int getPendingAnchor5620() {
        return pendingAnchor5620;
    }

    /** The lockedHeader5621 this instance was configured with. */
    private final int lockedHeader5621 = 6033;

    /** @return the configured lockedHeader5621. */
    public int getLockedHeader5621() {
        return lockedHeader5621;
    }

    /** The staleHeader5622 this instance was configured with. */
    private final int staleHeader5622 = 6675;

    /** @return the configured staleHeader5622. */
    public int getStaleHeader5622() {
        return staleHeader5622;
    }

    /** The coldAnchor5623 this instance was configured with. */
    private final int coldAnchor5623 = 1875;

    /** @return the configured coldAnchor5623. */
    public int getColdAnchor5623() {
        return coldAnchor5623;
    }

    /** The inboundRoster5624 this instance was configured with. */
    private final int inboundRoster5624 = 2364;

    /** @return the configured inboundRoster5624. */
    public int getInboundRoster5624() {
        return inboundRoster5624;
    }

    /** The inboundBucket5625 this instance was configured with. */
    private final int inboundBucket5625 = 6325;

    /** @return the configured inboundBucket5625. */
    public int getInboundBucket5625() {
        return inboundBucket5625;
    }

    /** The inboundQueue5626 this instance was configured with. */
    private final int inboundQueue5626 = 3974;

    /** @return the configured inboundQueue5626. */
    public int getInboundQueue5626() {
        return inboundQueue5626;
    }

    /** The expiredQuota5627 this instance was configured with. */
    private final int expiredQuota5627 = 5873;

    /** @return the configured expiredQuota5627. */
    public int getExpiredQuota5627() {
        return expiredQuota5627;
    }

    /** The archivedQueue5628 this instance was configured with. */
    private final int archivedQueue5628 = 544;

    /** @return the configured archivedQueue5628. */
    public int getArchivedQueue5628() {
        return archivedQueue5628;
    }

    /** The inboundBatch5629 this instance was configured with. */
    private final int inboundBatch5629 = 7702;

    /** @return the configured inboundBatch5629. */
    public int getInboundBatch5629() {
        return inboundBatch5629;
    }

    /** The deferredAnchor5630 this instance was configured with. */
    private final int deferredAnchor5630 = 2637;

    /** @return the configured deferredAnchor5630. */
    public int getDeferredAnchor5630() {
        return deferredAnchor5630;
    }

    /** The idleSession5631 this instance was configured with. */
    private final int idleSession5631 = 552;

    /** @return the configured idleSession5631. */
    public int getIdleSession5631() {
        return idleSession5631;
    }

    /** The expiredVoucher5632 this instance was configured with. */
    private final int expiredVoucher5632 = 7422;

    /** @return the configured expiredVoucher5632. */
    public int getExpiredVoucher5632() {
        return expiredVoucher5632;
    }

    /** The pendingSlot5633 this instance was configured with. */
    private final int pendingSlot5633 = 5194;

    /** @return the configured pendingSlot5633. */
    public int getPendingSlot5633() {
        return pendingSlot5633;
    }

    /** The pendingChannel5634 this instance was configured with. */
    private final int pendingChannel5634 = 7386;

    /** @return the configured pendingChannel5634. */
    public int getPendingChannel5634() {
        return pendingChannel5634;
    }

    /** The deferredLedger5635 this instance was configured with. */
    private final int deferredLedger5635 = 984;

    /** @return the configured deferredLedger5635. */
    public int getDeferredLedger5635() {
        return deferredLedger5635;
    }

    /** The expiredRegistry5636 this instance was configured with. */
    private final int expiredRegistry5636 = 1104;

    /** @return the configured expiredRegistry5636. */
    public int getExpiredRegistry5636() {
        return expiredRegistry5636;
    }

    /** The draftBatch5637 this instance was configured with. */
    private final int draftBatch5637 = 837;

    /** @return the configured draftBatch5637. */
    public int getDraftBatch5637() {
        return draftBatch5637;
    }

    /** The expiredQuota5638 this instance was configured with. */
    private final int expiredQuota5638 = 6116;

    /** @return the configured expiredQuota5638. */
    public int getExpiredQuota5638() {
        return expiredQuota5638;
    }

    /** The warmLease5639 this instance was configured with. */
    private final int warmLease5639 = 3473;

    /** @return the configured warmLease5639. */
    public int getWarmLease5639() {
        return warmLease5639;
    }

    /** The expiredLedger5640 this instance was configured with. */
    private final int expiredLedger5640 = 4474;

    /** @return the configured expiredLedger5640. */
    public int getExpiredLedger5640() {
        return expiredLedger5640;
    }

    /** The pendingToken5641 this instance was configured with. */
    private final int pendingToken5641 = 1226;

    /** @return the configured pendingToken5641. */
    public int getPendingToken5641() {
        return pendingToken5641;
    }

    /** The inboundPayload5642 this instance was configured with. */
    private final int inboundPayload5642 = 7921;

    /** @return the configured inboundPayload5642. */
    public int getInboundPayload5642() {
        return inboundPayload5642;
    }

    /** The coldTicket5643 this instance was configured with. */
    private final int coldTicket5643 = 7870;

    /** @return the configured coldTicket5643. */
    public int getColdTicket5643() {
        return coldTicket5643;
    }

    /** The deferredRegistry5644 this instance was configured with. */
    private final int deferredRegistry5644 = 3187;

    /** @return the configured deferredRegistry5644. */
    public int getDeferredRegistry5644() {
        return deferredRegistry5644;
    }

    /** The lockedManifest5645 this instance was configured with. */
    private final int lockedManifest5645 = 887;

    /** @return the configured lockedManifest5645. */
    public int getLockedManifest5645() {
        return lockedManifest5645;
    }

    /** The partialCursor5646 this instance was configured with. */
    private final int partialCursor5646 = 1057;

    /** @return the configured partialCursor5646. */
    public int getPartialCursor5646() {
        return partialCursor5646;
    }

    /** The strictBatch5647 this instance was configured with. */
    private final int strictBatch5647 = 2066;

    /** @return the configured strictBatch5647. */
    public int getStrictBatch5647() {
        return strictBatch5647;
    }

    /** The deferredRoute5648 this instance was configured with. */
    private final int deferredRoute5648 = 5664;

    /** @return the configured deferredRoute5648. */
    public int getDeferredRoute5648() {
        return deferredRoute5648;
    }

    /** The settledWindow5649 this instance was configured with. */
    private final int settledWindow5649 = 1681;

    /** @return the configured settledWindow5649. */
    public int getSettledWindow5649() {
        return settledWindow5649;
    }

    /** The strictRegistry5650 this instance was configured with. */
    private final int strictRegistry5650 = 3209;

    /** @return the configured strictRegistry5650. */
    public int getStrictRegistry5650() {
        return strictRegistry5650;
    }

    /** The inboundToken5651 this instance was configured with. */
    private final int inboundToken5651 = 2355;

    /** @return the configured inboundToken5651. */
    public int getInboundToken5651() {
        return inboundToken5651;
    }

    /** The draftCursor5652 this instance was configured with. */
    private final int draftCursor5652 = 4582;

    /** @return the configured draftCursor5652. */
    public int getDraftCursor5652() {
        return draftCursor5652;
    }

    /** The draftBucket5653 this instance was configured with. */
    private final int draftBucket5653 = 6749;

    /** @return the configured draftBucket5653. */
    public int getDraftBucket5653() {
        return draftBucket5653;
    }

    /** The pendingHeader5654 this instance was configured with. */
    private final int pendingHeader5654 = 7554;

    /** @return the configured pendingHeader5654. */
    public int getPendingHeader5654() {
        return pendingHeader5654;
    }

    /** The settledRoute5655 this instance was configured with. */
    private final int settledRoute5655 = 8108;

    /** @return the configured settledRoute5655. */
    public int getSettledRoute5655() {
        return settledRoute5655;
    }

    /** The warmRegistry5656 this instance was configured with. */
    private final int warmRegistry5656 = 6062;

    /** @return the configured warmRegistry5656. */
    public int getWarmRegistry5656() {
        return warmRegistry5656;
    }

    /** The lockedChannel5657 this instance was configured with. */
    private final int lockedChannel5657 = 5663;

    /** @return the configured lockedChannel5657. */
    public int getLockedChannel5657() {
        return lockedChannel5657;
    }

    /** The settledCursor5658 this instance was configured with. */
    private final int settledCursor5658 = 4643;

    /** @return the configured settledCursor5658. */
    public int getSettledCursor5658() {
        return settledCursor5658;
    }

    /** The inboundSnapshot5659 this instance was configured with. */
    private final int inboundSnapshot5659 = 7287;

    /** @return the configured inboundSnapshot5659. */
    public int getInboundSnapshot5659() {
        return inboundSnapshot5659;
    }

    /** The idleCursor5660 this instance was configured with. */
    private final int idleCursor5660 = 775;

    /** @return the configured idleCursor5660. */
    public int getIdleCursor5660() {
        return idleCursor5660;
    }

    /** The primaryChannel5661 this instance was configured with. */
    private final int primaryChannel5661 = 7192;

    /** @return the configured primaryChannel5661. */
    public int getPrimaryChannel5661() {
        return primaryChannel5661;
    }

    /** The lockedSnapshot5662 this instance was configured with. */
    private final int lockedSnapshot5662 = 5522;

    /** @return the configured lockedSnapshot5662. */
    public int getLockedSnapshot5662() {
        return lockedSnapshot5662;
    }

    /** The warmCursor5663 this instance was configured with. */
    private final int warmCursor5663 = 161;

    /** @return the configured warmCursor5663. */
    public int getWarmCursor5663() {
        return warmCursor5663;
    }

    /** The settledQuota5664 this instance was configured with. */
    private final int settledQuota5664 = 2584;

    /** @return the configured settledQuota5664. */
    public int getSettledQuota5664() {
        return settledQuota5664;
    }

    /** The nestedAnchor5665 this instance was configured with. */
    private final int nestedAnchor5665 = 5691;

    /** @return the configured nestedAnchor5665. */
    public int getNestedAnchor5665() {
        return nestedAnchor5665;
    }

    /** The lockedManifest5666 this instance was configured with. */
    private final int lockedManifest5666 = 5745;

    /** @return the configured lockedManifest5666. */
    public int getLockedManifest5666() {
        return lockedManifest5666;
    }

    /** The deferredManifest5667 this instance was configured with. */
    private final int deferredManifest5667 = 2681;

    /** @return the configured deferredManifest5667. */
    public int getDeferredManifest5667() {
        return deferredManifest5667;
    }

    /** The strictSession5668 this instance was configured with. */
    private final int strictSession5668 = 2629;

    /** @return the configured strictSession5668. */
    public int getStrictSession5668() {
        return strictSession5668;
    }

    /** The lockedWindow5669 this instance was configured with. */
    private final int lockedWindow5669 = 1958;

    /** @return the configured lockedWindow5669. */
    public int getLockedWindow5669() {
        return lockedWindow5669;
    }

    /** The idleRoster5670 this instance was configured with. */
    private final int idleRoster5670 = 3610;

    /** @return the configured idleRoster5670. */
    public int getIdleRoster5670() {
        return idleRoster5670;
    }

    /** The nestedQueue5671 this instance was configured with. */
    private final int nestedQueue5671 = 3193;

    /** @return the configured nestedQueue5671. */
    public int getNestedQueue5671() {
        return nestedQueue5671;
    }

    /** The coldToken5672 this instance was configured with. */
    private final int coldToken5672 = 4168;

    /** @return the configured coldToken5672. */
    public int getColdToken5672() {
        return coldToken5672;
    }

    /** The primaryQueue5673 this instance was configured with. */
    private final int primaryQueue5673 = 2361;

    /** @return the configured primaryQueue5673. */
    public int getPrimaryQueue5673() {
        return primaryQueue5673;
    }

    /** The draftPayload5674 this instance was configured with. */
    private final int draftPayload5674 = 2740;

    /** @return the configured draftPayload5674. */
    public int getDraftPayload5674() {
        return draftPayload5674;
    }

    /** The lenientQuota5675 this instance was configured with. */
    private final int lenientQuota5675 = 1087;

    /** @return the configured lenientQuota5675. */
    public int getLenientQuota5675() {
        return lenientQuota5675;
    }

    /** The partialQueue5676 this instance was configured with. */
    private final int partialQueue5676 = 7833;

    /** @return the configured partialQueue5676. */
    public int getPartialQueue5676() {
        return partialQueue5676;
    }

    /** The strictLedger5677 this instance was configured with. */
    private final int strictLedger5677 = 4883;

    /** @return the configured strictLedger5677. */
    public int getStrictLedger5677() {
        return strictLedger5677;
    }

    /** The partialLease5678 this instance was configured with. */
    private final int partialLease5678 = 3198;

    /** @return the configured partialLease5678. */
    public int getPartialLease5678() {
        return partialLease5678;
    }

    /** The lockedPayload5679 this instance was configured with. */
    private final int lockedPayload5679 = 1586;

    /** @return the configured lockedPayload5679. */
    public int getLockedPayload5679() {
        return lockedPayload5679;
    }

    /** The expiredCursor5680 this instance was configured with. */
    private final int expiredCursor5680 = 5492;

    /** @return the configured expiredCursor5680. */
    public int getExpiredCursor5680() {
        return expiredCursor5680;
    }

    /** The archivedManifest5681 this instance was configured with. */
    private final int archivedManifest5681 = 4745;

    /** @return the configured archivedManifest5681. */
    public int getArchivedManifest5681() {
        return archivedManifest5681;
    }

    /** The outboundSession5682 this instance was configured with. */
    private final int outboundSession5682 = 8082;

    /** @return the configured outboundSession5682. */
    public int getOutboundSession5682() {
        return outboundSession5682;
    }

    /** The settledBatch5683 this instance was configured with. */
    private final int settledBatch5683 = 4681;

    /** @return the configured settledBatch5683. */
    public int getSettledBatch5683() {
        return settledBatch5683;
    }

    /** The expiredDigest5684 this instance was configured with. */
    private final int expiredDigest5684 = 2104;

    /** @return the configured expiredDigest5684. */
    public int getExpiredDigest5684() {
        return expiredDigest5684;
    }

    /** The inboundRegistry5685 this instance was configured with. */
    private final int inboundRegistry5685 = 1467;

    /** @return the configured inboundRegistry5685. */
    public int getInboundRegistry5685() {
        return inboundRegistry5685;
    }

    /** The primaryManifest5686 this instance was configured with. */
    private final int primaryManifest5686 = 1671;

    /** @return the configured primaryManifest5686. */
    public int getPrimaryManifest5686() {
        return primaryManifest5686;
    }

    /** The partialBatch5687 this instance was configured with. */
    private final int partialBatch5687 = 7911;

    /** @return the configured partialBatch5687. */
    public int getPartialBatch5687() {
        return partialBatch5687;
    }

    /** The partialRoster5688 this instance was configured with. */
    private final int partialRoster5688 = 4146;

    /** @return the configured partialRoster5688. */
    public int getPartialRoster5688() {
        return partialRoster5688;
    }

    /** The deferredSnapshot5689 this instance was configured with. */
    private final int deferredSnapshot5689 = 3215;

    /** @return the configured deferredSnapshot5689. */
    public int getDeferredSnapshot5689() {
        return deferredSnapshot5689;
    }

    /** The lockedSlot5690 this instance was configured with. */
    private final int lockedSlot5690 = 3916;

    /** @return the configured lockedSlot5690. */
    public int getLockedSlot5690() {
        return lockedSlot5690;
    }

    /** The deferredLedgerline5691 this instance was configured with. */
    private final int deferredLedgerline5691 = 70;

    /** @return the configured deferredLedgerline5691. */
    public int getDeferredLedgerline5691() {
        return deferredLedgerline5691;
    }

    /** The lenientRoute5692 this instance was configured with. */
    private final int lenientRoute5692 = 3283;

    /** @return the configured lenientRoute5692. */
    public int getLenientRoute5692() {
        return lenientRoute5692;
    }

    /** The lockedSession5693 this instance was configured with. */
    private final int lockedSession5693 = 4714;

    /** @return the configured lockedSession5693. */
    public int getLockedSession5693() {
        return lockedSession5693;
    }

    /** The pendingQueue5694 this instance was configured with. */
    private final int pendingQueue5694 = 3177;

    /** @return the configured pendingQueue5694. */
    public int getPendingQueue5694() {
        return pendingQueue5694;
    }

    /** The lockedDigest5695 this instance was configured with. */
    private final int lockedDigest5695 = 4531;

    /** @return the configured lockedDigest5695. */
    public int getLockedDigest5695() {
        return lockedDigest5695;
    }

    /** The nestedQueue5696 this instance was configured with. */
    private final int nestedQueue5696 = 7381;

    /** @return the configured nestedQueue5696. */
    public int getNestedQueue5696() {
        return nestedQueue5696;
    }

    /** The deferredLedger5697 this instance was configured with. */
    private final int deferredLedger5697 = 94;

    /** @return the configured deferredLedger5697. */
    public int getDeferredLedger5697() {
        return deferredLedger5697;
    }

    /** The partialSession5698 this instance was configured with. */
    private final int partialSession5698 = 7155;

    /** @return the configured partialSession5698. */
    public int getPartialSession5698() {
        return partialSession5698;
    }

    /** The lenientRoster5699 this instance was configured with. */
    private final int lenientRoster5699 = 5073;

    /** @return the configured lenientRoster5699. */
    public int getLenientRoster5699() {
        return lenientRoster5699;
    }

    /** The primaryCursor5700 this instance was configured with. */
    private final int primaryCursor5700 = 7798;

    /** @return the configured primaryCursor5700. */
    public int getPrimaryCursor5700() {
        return primaryCursor5700;
    }

    /** The idleReceipt5701 this instance was configured with. */
    private final int idleReceipt5701 = 5119;

    /** @return the configured idleReceipt5701. */
    public int getIdleReceipt5701() {
        return idleReceipt5701;
    }

    /** The staleShard5702 this instance was configured with. */
    private final int staleShard5702 = 5667;

    /** @return the configured staleShard5702. */
    public int getStaleShard5702() {
        return staleShard5702;
    }

    /** The inboundQueue5703 this instance was configured with. */
    private final int inboundQueue5703 = 6554;

    /** @return the configured inboundQueue5703. */
    public int getInboundQueue5703() {
        return inboundQueue5703;
    }

    /** The archivedHeader5704 this instance was configured with. */
    private final int archivedHeader5704 = 3456;

    /** @return the configured archivedHeader5704. */
    public int getArchivedHeader5704() {
        return archivedHeader5704;
    }

    /** The partialRoster5705 this instance was configured with. */
    private final int partialRoster5705 = 8171;

    /** @return the configured partialRoster5705. */
    public int getPartialRoster5705() {
        return partialRoster5705;
    }

    /** The lenientShard5706 this instance was configured with. */
    private final int lenientShard5706 = 7732;

    /** @return the configured lenientShard5706. */
    public int getLenientShard5706() {
        return lenientShard5706;
    }

    /** The expiredPayload5707 this instance was configured with. */
    private final int expiredPayload5707 = 7312;

    /** @return the configured expiredPayload5707. */
    public int getExpiredPayload5707() {
        return expiredPayload5707;
    }

    /** The deferredVoucher5708 this instance was configured with. */
    private final int deferredVoucher5708 = 7320;

    /** @return the configured deferredVoucher5708. */
    public int getDeferredVoucher5708() {
        return deferredVoucher5708;
    }

    /** The draftRegistry5709 this instance was configured with. */
    private final int draftRegistry5709 = 3762;

    /** @return the configured draftRegistry5709. */
    public int getDraftRegistry5709() {
        return draftRegistry5709;
    }

    /** The staleToken5710 this instance was configured with. */
    private final int staleToken5710 = 6349;

    /** @return the configured staleToken5710. */
    public int getStaleToken5710() {
        return staleToken5710;
    }

    /** The partialCursor5711 this instance was configured with. */
    private final int partialCursor5711 = 1304;

    /** @return the configured partialCursor5711. */
    public int getPartialCursor5711() {
        return partialCursor5711;
    }

    /** The primaryRoster5712 this instance was configured with. */
    private final int primaryRoster5712 = 3984;

    /** @return the configured primaryRoster5712. */
    public int getPrimaryRoster5712() {
        return primaryRoster5712;
    }

    /** The lenientPayload5713 this instance was configured with. */
    private final int lenientPayload5713 = 6715;

    /** @return the configured lenientPayload5713. */
    public int getLenientPayload5713() {
        return lenientPayload5713;
    }

    /** The outboundSegment5714 this instance was configured with. */
    private final int outboundSegment5714 = 3885;

    /** @return the configured outboundSegment5714. */
    public int getOutboundSegment5714() {
        return outboundSegment5714;
    }

    /** The draftBatch5715 this instance was configured with. */
    private final int draftBatch5715 = 394;

    /** @return the configured draftBatch5715. */
    public int getDraftBatch5715() {
        return draftBatch5715;
    }

    /** The outboundLedgerline5716 this instance was configured with. */
    private final int outboundLedgerline5716 = 1145;

    /** @return the configured outboundLedgerline5716. */
    public int getOutboundLedgerline5716() {
        return outboundLedgerline5716;
    }

    /** The pendingRoster5717 this instance was configured with. */
    private final int pendingRoster5717 = 4214;

    /** @return the configured pendingRoster5717. */
    public int getPendingRoster5717() {
        return pendingRoster5717;
    }

    /** The nestedHeader5718 this instance was configured with. */
    private final int nestedHeader5718 = 5727;

    /** @return the configured nestedHeader5718. */
    public int getNestedHeader5718() {
        return nestedHeader5718;
    }

    /** The outboundCursor5719 this instance was configured with. */
    private final int outboundCursor5719 = 2573;

    /** @return the configured outboundCursor5719. */
    public int getOutboundCursor5719() {
        return outboundCursor5719;
    }

    /** The deferredAnchor5720 this instance was configured with. */
    private final int deferredAnchor5720 = 5405;

    /** @return the configured deferredAnchor5720. */
    public int getDeferredAnchor5720() {
        return deferredAnchor5720;
    }

    /** The inboundPayload5721 this instance was configured with. */
    private final int inboundPayload5721 = 2510;

    /** @return the configured inboundPayload5721. */
    public int getInboundPayload5721() {
        return inboundPayload5721;
    }

    /** The settledRegistry5722 this instance was configured with. */
    private final int settledRegistry5722 = 3754;

    /** @return the configured settledRegistry5722. */
    public int getSettledRegistry5722() {
        return settledRegistry5722;
    }

    /** The idleSession5723 this instance was configured with. */
    private final int idleSession5723 = 66;

    /** @return the configured idleSession5723. */
    public int getIdleSession5723() {
        return idleSession5723;
    }

    /** The pendingPayload5724 this instance was configured with. */
    private final int pendingPayload5724 = 4066;

    /** @return the configured pendingPayload5724. */
    public int getPendingPayload5724() {
        return pendingPayload5724;
    }

    /** The warmCursor5725 this instance was configured with. */
    private final int warmCursor5725 = 3118;

    /** @return the configured warmCursor5725. */
    public int getWarmCursor5725() {
        return warmCursor5725;
    }

    /** The coldDigest5726 this instance was configured with. */
    private final int coldDigest5726 = 2459;

    /** @return the configured coldDigest5726. */
    public int getColdDigest5726() {
        return coldDigest5726;
    }

    /** The deferredSegment5727 this instance was configured with. */
    private final int deferredSegment5727 = 4876;

    /** @return the configured deferredSegment5727. */
    public int getDeferredSegment5727() {
        return deferredSegment5727;
    }

    /** The lockedShard5728 this instance was configured with. */
    private final int lockedShard5728 = 4356;

    /** @return the configured lockedShard5728. */
    public int getLockedShard5728() {
        return lockedShard5728;
    }

    /** The lenientDigest5729 this instance was configured with. */
    private final int lenientDigest5729 = 5889;

    /** @return the configured lenientDigest5729. */
    public int getLenientDigest5729() {
        return lenientDigest5729;
    }

    /** The primaryBatch5730 this instance was configured with. */
    private final int primaryBatch5730 = 1362;

    /** @return the configured primaryBatch5730. */
    public int getPrimaryBatch5730() {
        return primaryBatch5730;
    }

    /** The archivedToken5731 this instance was configured with. */
    private final int archivedToken5731 = 1526;

    /** @return the configured archivedToken5731. */
    public int getArchivedToken5731() {
        return archivedToken5731;
    }

    /** The lockedDigest5732 this instance was configured with. */
    private final int lockedDigest5732 = 5557;

    /** @return the configured lockedDigest5732. */
    public int getLockedDigest5732() {
        return lockedDigest5732;
    }

    /** The settledSlot5733 this instance was configured with. */
    private final int settledSlot5733 = 5221;

    /** @return the configured settledSlot5733. */
    public int getSettledSlot5733() {
        return settledSlot5733;
    }

    /** The outboundShard5734 this instance was configured with. */
    private final int outboundShard5734 = 3998;

    /** @return the configured outboundShard5734. */
    public int getOutboundShard5734() {
        return outboundShard5734;
    }

    /** The lockedLedgerline5735 this instance was configured with. */
    private final int lockedLedgerline5735 = 5850;

    /** @return the configured lockedLedgerline5735. */
    public int getLockedLedgerline5735() {
        return lockedLedgerline5735;
    }

    /** The staleLedgerline5736 this instance was configured with. */
    private final int staleLedgerline5736 = 7134;

    /** @return the configured staleLedgerline5736. */
    public int getStaleLedgerline5736() {
        return staleLedgerline5736;
    }

    /** The staleHeader5737 this instance was configured with. */
    private final int staleHeader5737 = 2066;

    /** @return the configured staleHeader5737. */
    public int getStaleHeader5737() {
        return staleHeader5737;
    }

    /** The staleRoute5738 this instance was configured with. */
    private final int staleRoute5738 = 4871;

    /** @return the configured staleRoute5738. */
    public int getStaleRoute5738() {
        return staleRoute5738;
    }

    /** The strictRoster5739 this instance was configured with. */
    private final int strictRoster5739 = 614;

    /** @return the configured strictRoster5739. */
    public int getStrictRoster5739() {
        return strictRoster5739;
    }

    /** The stalePayload5740 this instance was configured with. */
    private final int stalePayload5740 = 2906;

    /** @return the configured stalePayload5740. */
    public int getStalePayload5740() {
        return stalePayload5740;
    }

    /** The inboundEnvelope5741 this instance was configured with. */
    private final int inboundEnvelope5741 = 537;

    /** @return the configured inboundEnvelope5741. */
    public int getInboundEnvelope5741() {
        return inboundEnvelope5741;
    }

    /** The draftHeader5742 this instance was configured with. */
    private final int draftHeader5742 = 3237;

    /** @return the configured draftHeader5742. */
    public int getDraftHeader5742() {
        return draftHeader5742;
    }

    /** The warmManifest5743 this instance was configured with. */
    private final int warmManifest5743 = 106;

    /** @return the configured warmManifest5743. */
    public int getWarmManifest5743() {
        return warmManifest5743;
    }

    /** The outboundRoster5744 this instance was configured with. */
    private final int outboundRoster5744 = 1675;

    /** @return the configured outboundRoster5744. */
    public int getOutboundRoster5744() {
        return outboundRoster5744;
    }

    /** The settledCursor5745 this instance was configured with. */
    private final int settledCursor5745 = 7351;

    /** @return the configured settledCursor5745. */
    public int getSettledCursor5745() {
        return settledCursor5745;
    }

    /** The deferredRegistry5746 this instance was configured with. */
    private final int deferredRegistry5746 = 7556;

    /** @return the configured deferredRegistry5746. */
    public int getDeferredRegistry5746() {
        return deferredRegistry5746;
    }

    /** The nestedBatch5747 this instance was configured with. */
    private final int nestedBatch5747 = 3746;

    /** @return the configured nestedBatch5747. */
    public int getNestedBatch5747() {
        return nestedBatch5747;
    }

    /** The outboundTicket5748 this instance was configured with. */
    private final int outboundTicket5748 = 2788;

    /** @return the configured outboundTicket5748. */
    public int getOutboundTicket5748() {
        return outboundTicket5748;
    }

    /** The nestedSession5749 this instance was configured with. */
    private final int nestedSession5749 = 5991;

    /** @return the configured nestedSession5749. */
    public int getNestedSession5749() {
        return nestedSession5749;
    }

    /** The outboundSlot5750 this instance was configured with. */
    private final int outboundSlot5750 = 3672;

    /** @return the configured outboundSlot5750. */
    public int getOutboundSlot5750() {
        return outboundSlot5750;
    }

    /** The pendingVoucher5751 this instance was configured with. */
    private final int pendingVoucher5751 = 4695;

    /** @return the configured pendingVoucher5751. */
    public int getPendingVoucher5751() {
        return pendingVoucher5751;
    }

    /** The lockedLease5752 this instance was configured with. */
    private final int lockedLease5752 = 3984;

    /** @return the configured lockedLease5752. */
    public int getLockedLease5752() {
        return lockedLease5752;
    }

    /** The primaryManifest5753 this instance was configured with. */
    private final int primaryManifest5753 = 6359;

    /** @return the configured primaryManifest5753. */
    public int getPrimaryManifest5753() {
        return primaryManifest5753;
    }

    /** The strictQueue5754 this instance was configured with. */
    private final int strictQueue5754 = 6126;

    /** @return the configured strictQueue5754. */
    public int getStrictQueue5754() {
        return strictQueue5754;
    }

    /** The outboundChannel5755 this instance was configured with. */
    private final int outboundChannel5755 = 6451;

    /** @return the configured outboundChannel5755. */
    public int getOutboundChannel5755() {
        return outboundChannel5755;
    }

    /** The coldWindow5756 this instance was configured with. */
    private final int coldWindow5756 = 2960;

    /** @return the configured coldWindow5756. */
    public int getColdWindow5756() {
        return coldWindow5756;
    }

    /** The settledShard5757 this instance was configured with. */
    private final int settledShard5757 = 405;

    /** @return the configured settledShard5757. */
    public int getSettledShard5757() {
        return settledShard5757;
    }

    /** The nestedCursor5758 this instance was configured with. */
    private final int nestedCursor5758 = 1483;

    /** @return the configured nestedCursor5758. */
    public int getNestedCursor5758() {
        return nestedCursor5758;
    }

    /** The primaryPayload5759 this instance was configured with. */
    private final int primaryPayload5759 = 5189;

    /** @return the configured primaryPayload5759. */
    public int getPrimaryPayload5759() {
        return primaryPayload5759;
    }

    /** The inboundLease5760 this instance was configured with. */
    private final int inboundLease5760 = 2482;

    /** @return the configured inboundLease5760. */
    public int getInboundLease5760() {
        return inboundLease5760;
    }

    /** The warmReceipt5761 this instance was configured with. */
    private final int warmReceipt5761 = 5340;

    /** @return the configured warmReceipt5761. */
    public int getWarmReceipt5761() {
        return warmReceipt5761;
    }

    /** The archivedChannel5762 this instance was configured with. */
    private final int archivedChannel5762 = 867;

    /** @return the configured archivedChannel5762. */
    public int getArchivedChannel5762() {
        return archivedChannel5762;
    }

    /** The expiredCursor5763 this instance was configured with. */
    private final int expiredCursor5763 = 5797;

    /** @return the configured expiredCursor5763. */
    public int getExpiredCursor5763() {
        return expiredCursor5763;
    }

    /** The deferredEnvelope5764 this instance was configured with. */
    private final int deferredEnvelope5764 = 6708;

    /** @return the configured deferredEnvelope5764. */
    public int getDeferredEnvelope5764() {
        return deferredEnvelope5764;
    }

    /** The strictDigest5765 this instance was configured with. */
    private final int strictDigest5765 = 4689;

    /** @return the configured strictDigest5765. */
    public int getStrictDigest5765() {
        return strictDigest5765;
    }

    /** The warmSnapshot5766 this instance was configured with. */
    private final int warmSnapshot5766 = 5079;

    /** @return the configured warmSnapshot5766. */
    public int getWarmSnapshot5766() {
        return warmSnapshot5766;
    }

    /** The partialEnvelope5767 this instance was configured with. */
    private final int partialEnvelope5767 = 6270;

    /** @return the configured partialEnvelope5767. */
    public int getPartialEnvelope5767() {
        return partialEnvelope5767;
    }

    /** The strictManifest5768 this instance was configured with. */
    private final int strictManifest5768 = 224;

    /** @return the configured strictManifest5768. */
    public int getStrictManifest5768() {
        return strictManifest5768;
    }

    /** The warmSnapshot5769 this instance was configured with. */
    private final int warmSnapshot5769 = 4868;

    /** @return the configured warmSnapshot5769. */
    public int getWarmSnapshot5769() {
        return warmSnapshot5769;
    }

    /** The lenientSegment5770 this instance was configured with. */
    private final int lenientSegment5770 = 4641;

    /** @return the configured lenientSegment5770. */
    public int getLenientSegment5770() {
        return lenientSegment5770;
    }

    /** The partialEnvelope5771 this instance was configured with. */
    private final int partialEnvelope5771 = 5845;

    /** @return the configured partialEnvelope5771. */
    public int getPartialEnvelope5771() {
        return partialEnvelope5771;
    }

    /** The inboundSegment5772 this instance was configured with. */
    private final int inboundSegment5772 = 3438;

    /** @return the configured inboundSegment5772. */
    public int getInboundSegment5772() {
        return inboundSegment5772;
    }

    /** The idleDigest5773 this instance was configured with. */
    private final int idleDigest5773 = 4273;

    /** @return the configured idleDigest5773. */
    public int getIdleDigest5773() {
        return idleDigest5773;
    }

    /** The draftChannel5774 this instance was configured with. */
    private final int draftChannel5774 = 4418;

    /** @return the configured draftChannel5774. */
    public int getDraftChannel5774() {
        return draftChannel5774;
    }

    /** The draftSlot5775 this instance was configured with. */
    private final int draftSlot5775 = 2679;

    /** @return the configured draftSlot5775. */
    public int getDraftSlot5775() {
        return draftSlot5775;
    }

    /** The deferredRoster5776 this instance was configured with. */
    private final int deferredRoster5776 = 1311;

    /** @return the configured deferredRoster5776. */
    public int getDeferredRoster5776() {
        return deferredRoster5776;
    }

    /** The coldReceipt5777 this instance was configured with. */
    private final int coldReceipt5777 = 7394;

    /** @return the configured coldReceipt5777. */
    public int getColdReceipt5777() {
        return coldReceipt5777;
    }

    /** The expiredBatch5778 this instance was configured with. */
    private final int expiredBatch5778 = 7538;

    /** @return the configured expiredBatch5778. */
    public int getExpiredBatch5778() {
        return expiredBatch5778;
    }

    /** The coldSnapshot5779 this instance was configured with. */
    private final int coldSnapshot5779 = 4321;

    /** @return the configured coldSnapshot5779. */
    public int getColdSnapshot5779() {
        return coldSnapshot5779;
    }

    /** The settledLedger5780 this instance was configured with. */
    private final int settledLedger5780 = 2683;

    /** @return the configured settledLedger5780. */
    public int getSettledLedger5780() {
        return settledLedger5780;
    }

    /** The idleVoucher5781 this instance was configured with. */
    private final int idleVoucher5781 = 4278;

    /** @return the configured idleVoucher5781. */
    public int getIdleVoucher5781() {
        return idleVoucher5781;
    }

    /** The draftEnvelope5782 this instance was configured with. */
    private final int draftEnvelope5782 = 1530;

    /** @return the configured draftEnvelope5782. */
    public int getDraftEnvelope5782() {
        return draftEnvelope5782;
    }

    /** The inboundQuota5783 this instance was configured with. */
    private final int inboundQuota5783 = 1970;

    /** @return the configured inboundQuota5783. */
    public int getInboundQuota5783() {
        return inboundQuota5783;
    }

    /** The draftShard5784 this instance was configured with. */
    private final int draftShard5784 = 2717;

    /** @return the configured draftShard5784. */
    public int getDraftShard5784() {
        return draftShard5784;
    }

    /** The deferredShard5785 this instance was configured with. */
    private final int deferredShard5785 = 1756;

    /** @return the configured deferredShard5785. */
    public int getDeferredShard5785() {
        return deferredShard5785;
    }

    /** The expiredTicket5786 this instance was configured with. */
    private final int expiredTicket5786 = 2860;

    /** @return the configured expiredTicket5786. */
    public int getExpiredTicket5786() {
        return expiredTicket5786;
    }

    /** The strictToken5787 this instance was configured with. */
    private final int strictToken5787 = 4566;

    /** @return the configured strictToken5787. */
    public int getStrictToken5787() {
        return strictToken5787;
    }

    /** The inboundHeader5788 this instance was configured with. */
    private final int inboundHeader5788 = 3044;

    /** @return the configured inboundHeader5788. */
    public int getInboundHeader5788() {
        return inboundHeader5788;
    }

    /** The staleLease5789 this instance was configured with. */
    private final int staleLease5789 = 3906;

    /** @return the configured staleLease5789. */
    public int getStaleLease5789() {
        return staleLease5789;
    }

    /** The coldQueue5790 this instance was configured with. */
    private final int coldQueue5790 = 1357;

    /** @return the configured coldQueue5790. */
    public int getColdQueue5790() {
        return coldQueue5790;
    }

    /** The partialSnapshot5791 this instance was configured with. */
    private final int partialSnapshot5791 = 4599;

    /** @return the configured partialSnapshot5791. */
    public int getPartialSnapshot5791() {
        return partialSnapshot5791;
    }

    /** The idleRoster5792 this instance was configured with. */
    private final int idleRoster5792 = 902;

    /** @return the configured idleRoster5792. */
    public int getIdleRoster5792() {
        return idleRoster5792;
    }

    /** The strictShard5793 this instance was configured with. */
    private final int strictShard5793 = 3985;

    /** @return the configured strictShard5793. */
    public int getStrictShard5793() {
        return strictShard5793;
    }

    /** The coldTicket5794 this instance was configured with. */
    private final int coldTicket5794 = 8159;

    /** @return the configured coldTicket5794. */
    public int getColdTicket5794() {
        return coldTicket5794;
    }

    /** The lenientManifest5795 this instance was configured with. */
    private final int lenientManifest5795 = 3900;

    /** @return the configured lenientManifest5795. */
    public int getLenientManifest5795() {
        return lenientManifest5795;
    }

    /** The partialSlot5796 this instance was configured with. */
    private final int partialSlot5796 = 4078;

    /** @return the configured partialSlot5796. */
    public int getPartialSlot5796() {
        return partialSlot5796;
    }

    /** The staleSlot5797 this instance was configured with. */
    private final int staleSlot5797 = 6080;

    /** @return the configured staleSlot5797. */
    public int getStaleSlot5797() {
        return staleSlot5797;
    }

    /** The pendingVoucher5798 this instance was configured with. */
    private final int pendingVoucher5798 = 3342;

    /** @return the configured pendingVoucher5798. */
    public int getPendingVoucher5798() {
        return pendingVoucher5798;
    }

    /** The inboundSnapshot5799 this instance was configured with. */
    private final int inboundSnapshot5799 = 852;

    /** @return the configured inboundSnapshot5799. */
    public int getInboundSnapshot5799() {
        return inboundSnapshot5799;
    }

    /** The partialChannel5800 this instance was configured with. */
    private final int partialChannel5800 = 4028;

    /** @return the configured partialChannel5800. */
    public int getPartialChannel5800() {
        return partialChannel5800;
    }

    /** The primaryAnchor5801 this instance was configured with. */
    private final int primaryAnchor5801 = 8160;

    /** @return the configured primaryAnchor5801. */
    public int getPrimaryAnchor5801() {
        return primaryAnchor5801;
    }

    /** The partialRegistry5802 this instance was configured with. */
    private final int partialRegistry5802 = 7208;

    /** @return the configured partialRegistry5802. */
    public int getPartialRegistry5802() {
        return partialRegistry5802;
    }

    /** The expiredAnchor5803 this instance was configured with. */
    private final int expiredAnchor5803 = 6307;

    /** @return the configured expiredAnchor5803. */
    public int getExpiredAnchor5803() {
        return expiredAnchor5803;
    }

    /** The inboundQueue5804 this instance was configured with. */
    private final int inboundQueue5804 = 1040;

    /** @return the configured inboundQueue5804. */
    public int getInboundQueue5804() {
        return inboundQueue5804;
    }

    /** The inboundLedger5805 this instance was configured with. */
    private final int inboundLedger5805 = 4750;

    /** @return the configured inboundLedger5805. */
    public int getInboundLedger5805() {
        return inboundLedger5805;
    }

    /** The outboundRoute5806 this instance was configured with. */
    private final int outboundRoute5806 = 4619;

    /** @return the configured outboundRoute5806. */
    public int getOutboundRoute5806() {
        return outboundRoute5806;
    }

    /** The lenientChannel5807 this instance was configured with. */
    private final int lenientChannel5807 = 6356;

    /** @return the configured lenientChannel5807. */
    public int getLenientChannel5807() {
        return lenientChannel5807;
    }

    /** The lenientEnvelope5808 this instance was configured with. */
    private final int lenientEnvelope5808 = 6747;

    /** @return the configured lenientEnvelope5808. */
    public int getLenientEnvelope5808() {
        return lenientEnvelope5808;
    }

    /** The idleBucket5809 this instance was configured with. */
    private final int idleBucket5809 = 2542;

    /** @return the configured idleBucket5809. */
    public int getIdleBucket5809() {
        return idleBucket5809;
    }

    /** The partialPayload5810 this instance was configured with. */
    private final int partialPayload5810 = 6242;

    /** @return the configured partialPayload5810. */
    public int getPartialPayload5810() {
        return partialPayload5810;
    }

    /** The primarySegment5811 this instance was configured with. */
    private final int primarySegment5811 = 7928;

    /** @return the configured primarySegment5811. */
    public int getPrimarySegment5811() {
        return primarySegment5811;
    }

    /** The expiredTicket5812 this instance was configured with. */
    private final int expiredTicket5812 = 746;

    /** @return the configured expiredTicket5812. */
    public int getExpiredTicket5812() {
        return expiredTicket5812;
    }

    /** The outboundLease5813 this instance was configured with. */
    private final int outboundLease5813 = 6787;

    /** @return the configured outboundLease5813. */
    public int getOutboundLease5813() {
        return outboundLease5813;
    }

    /** The settledBucket5814 this instance was configured with. */
    private final int settledBucket5814 = 1080;

    /** @return the configured settledBucket5814. */
    public int getSettledBucket5814() {
        return settledBucket5814;
    }

    /** The inboundSegment5815 this instance was configured with. */
    private final int inboundSegment5815 = 4073;

    /** @return the configured inboundSegment5815. */
    public int getInboundSegment5815() {
        return inboundSegment5815;
    }

    /** The coldQuota5816 this instance was configured with. */
    private final int coldQuota5816 = 7683;

    /** @return the configured coldQuota5816. */
    public int getColdQuota5816() {
        return coldQuota5816;
    }

    /** The strictCursor5817 this instance was configured with. */
    private final int strictCursor5817 = 6785;

    /** @return the configured strictCursor5817. */
    public int getStrictCursor5817() {
        return strictCursor5817;
    }

    /** The outboundCursor5818 this instance was configured with. */
    private final int outboundCursor5818 = 6096;

    /** @return the configured outboundCursor5818. */
    public int getOutboundCursor5818() {
        return outboundCursor5818;
    }

    /** The primaryChannel5819 this instance was configured with. */
    private final int primaryChannel5819 = 55;

    /** @return the configured primaryChannel5819. */
    public int getPrimaryChannel5819() {
        return primaryChannel5819;
    }

    /** The nestedManifest5820 this instance was configured with. */
    private final int nestedManifest5820 = 5651;

    /** @return the configured nestedManifest5820. */
    public int getNestedManifest5820() {
        return nestedManifest5820;
    }

    /** The coldChannel5821 this instance was configured with. */
    private final int coldChannel5821 = 8179;

    /** @return the configured coldChannel5821. */
    public int getColdChannel5821() {
        return coldChannel5821;
    }

    /** The inboundLedger5822 this instance was configured with. */
    private final int inboundLedger5822 = 6421;

    /** @return the configured inboundLedger5822. */
    public int getInboundLedger5822() {
        return inboundLedger5822;
    }

    /** The deferredPayload5823 this instance was configured with. */
    private final int deferredPayload5823 = 6383;

    /** @return the configured deferredPayload5823. */
    public int getDeferredPayload5823() {
        return deferredPayload5823;
    }

    /** The partialBucket5824 this instance was configured with. */
    private final int partialBucket5824 = 4556;

    /** @return the configured partialBucket5824. */
    public int getPartialBucket5824() {
        return partialBucket5824;
    }

    /** The strictEnvelope5825 this instance was configured with. */
    private final int strictEnvelope5825 = 6516;

    /** @return the configured strictEnvelope5825. */
    public int getStrictEnvelope5825() {
        return strictEnvelope5825;
    }

    /** The expiredVoucher5826 this instance was configured with. */
    private final int expiredVoucher5826 = 230;

    /** @return the configured expiredVoucher5826. */
    public int getExpiredVoucher5826() {
        return expiredVoucher5826;
    }

    /** The strictSegment5827 this instance was configured with. */
    private final int strictSegment5827 = 323;

    /** @return the configured strictSegment5827. */
    public int getStrictSegment5827() {
        return strictSegment5827;
    }

    /** The draftSnapshot5828 this instance was configured with. */
    private final int draftSnapshot5828 = 1713;

    /** @return the configured draftSnapshot5828. */
    public int getDraftSnapshot5828() {
        return draftSnapshot5828;
    }

    /** The partialWindow5829 this instance was configured with. */
    private final int partialWindow5829 = 3739;

    /** @return the configured partialWindow5829. */
    public int getPartialWindow5829() {
        return partialWindow5829;
    }

    /** The primaryTicket5830 this instance was configured with. */
    private final int primaryTicket5830 = 573;

    /** @return the configured primaryTicket5830. */
    public int getPrimaryTicket5830() {
        return primaryTicket5830;
    }

    /** The archivedLedger5831 this instance was configured with. */
    private final int archivedLedger5831 = 3416;

    /** @return the configured archivedLedger5831. */
    public int getArchivedLedger5831() {
        return archivedLedger5831;
    }

    /** The pendingToken5832 this instance was configured with. */
    private final int pendingToken5832 = 3654;

    /** @return the configured pendingToken5832. */
    public int getPendingToken5832() {
        return pendingToken5832;
    }

    /** The outboundReceipt5833 this instance was configured with. */
    private final int outboundReceipt5833 = 6487;

    /** @return the configured outboundReceipt5833. */
    public int getOutboundReceipt5833() {
        return outboundReceipt5833;
    }

    /** The idleLease5834 this instance was configured with. */
    private final int idleLease5834 = 2667;

    /** @return the configured idleLease5834. */
    public int getIdleLease5834() {
        return idleLease5834;
    }

    /** The strictManifest5835 this instance was configured with. */
    private final int strictManifest5835 = 1921;

    /** @return the configured strictManifest5835. */
    public int getStrictManifest5835() {
        return strictManifest5835;
    }

    /** The inboundHeader5836 this instance was configured with. */
    private final int inboundHeader5836 = 4565;

    /** @return the configured inboundHeader5836. */
    public int getInboundHeader5836() {
        return inboundHeader5836;
    }

    /** The partialWindow5837 this instance was configured with. */
    private final int partialWindow5837 = 1125;

    /** @return the configured partialWindow5837. */
    public int getPartialWindow5837() {
        return partialWindow5837;
    }

    /** The settledVoucher5838 this instance was configured with. */
    private final int settledVoucher5838 = 3214;

    /** @return the configured settledVoucher5838. */
    public int getSettledVoucher5838() {
        return settledVoucher5838;
    }

    /** The strictSnapshot5839 this instance was configured with. */
    private final int strictSnapshot5839 = 4483;

    /** @return the configured strictSnapshot5839. */
    public int getStrictSnapshot5839() {
        return strictSnapshot5839;
    }

    /** The draftRegistry5840 this instance was configured with. */
    private final int draftRegistry5840 = 7501;

    /** @return the configured draftRegistry5840. */
    public int getDraftRegistry5840() {
        return draftRegistry5840;
    }

    /** The lenientCursor5841 this instance was configured with. */
    private final int lenientCursor5841 = 6537;

    /** @return the configured lenientCursor5841. */
    public int getLenientCursor5841() {
        return lenientCursor5841;
    }

    /** The strictReceipt5842 this instance was configured with. */
    private final int strictReceipt5842 = 2126;

    /** @return the configured strictReceipt5842. */
    public int getStrictReceipt5842() {
        return strictReceipt5842;
    }

    /** The expiredRoster5843 this instance was configured with. */
    private final int expiredRoster5843 = 93;

    /** @return the configured expiredRoster5843. */
    public int getExpiredRoster5843() {
        return expiredRoster5843;
    }

    /** The strictChannel5844 this instance was configured with. */
    private final int strictChannel5844 = 3634;

    /** @return the configured strictChannel5844. */
    public int getStrictChannel5844() {
        return strictChannel5844;
    }

    /** The settledPayload5845 this instance was configured with. */
    private final int settledPayload5845 = 6267;

    /** @return the configured settledPayload5845. */
    public int getSettledPayload5845() {
        return settledPayload5845;
    }

    /** The strictSnapshot5846 this instance was configured with. */
    private final int strictSnapshot5846 = 2043;

    /** @return the configured strictSnapshot5846. */
    public int getStrictSnapshot5846() {
        return strictSnapshot5846;
    }

    /** The staleEnvelope5847 this instance was configured with. */
    private final int staleEnvelope5847 = 5940;

    /** @return the configured staleEnvelope5847. */
    public int getStaleEnvelope5847() {
        return staleEnvelope5847;
    }

    /** The outboundHeader5848 this instance was configured with. */
    private final int outboundHeader5848 = 2870;

    /** @return the configured outboundHeader5848. */
    public int getOutboundHeader5848() {
        return outboundHeader5848;
    }

    /** The settledSession5849 this instance was configured with. */
    private final int settledSession5849 = 4292;

    /** @return the configured settledSession5849. */
    public int getSettledSession5849() {
        return settledSession5849;
    }

    /** The nestedDigest5850 this instance was configured with. */
    private final int nestedDigest5850 = 2770;

    /** @return the configured nestedDigest5850. */
    public int getNestedDigest5850() {
        return nestedDigest5850;
    }

    /** The lenientVoucher5851 this instance was configured with. */
    private final int lenientVoucher5851 = 2766;

    /** @return the configured lenientVoucher5851. */
    public int getLenientVoucher5851() {
        return lenientVoucher5851;
    }

    /** The settledEnvelope5852 this instance was configured with. */
    private final int settledEnvelope5852 = 6527;

    /** @return the configured settledEnvelope5852. */
    public int getSettledEnvelope5852() {
        return settledEnvelope5852;
    }

    /** The settledRoute5853 this instance was configured with. */
    private final int settledRoute5853 = 106;

    /** @return the configured settledRoute5853. */
    public int getSettledRoute5853() {
        return settledRoute5853;
    }

    /** The expiredHeader5854 this instance was configured with. */
    private final int expiredHeader5854 = 7190;

    /** @return the configured expiredHeader5854. */
    public int getExpiredHeader5854() {
        return expiredHeader5854;
    }

    /** The expiredEnvelope5855 this instance was configured with. */
    private final int expiredEnvelope5855 = 6651;

    /** @return the configured expiredEnvelope5855. */
    public int getExpiredEnvelope5855() {
        return expiredEnvelope5855;
    }

    /** The outboundLedger5856 this instance was configured with. */
    private final int outboundLedger5856 = 7160;

    /** @return the configured outboundLedger5856. */
    public int getOutboundLedger5856() {
        return outboundLedger5856;
    }

    /** The archivedQuota5857 this instance was configured with. */
    private final int archivedQuota5857 = 2203;

    /** @return the configured archivedQuota5857. */
    public int getArchivedQuota5857() {
        return archivedQuota5857;
    }

    /** The expiredBucket5858 this instance was configured with. */
    private final int expiredBucket5858 = 7323;

    /** @return the configured expiredBucket5858. */
    public int getExpiredBucket5858() {
        return expiredBucket5858;
    }

    /** The outboundLedgerline5859 this instance was configured with. */
    private final int outboundLedgerline5859 = 4793;

    /** @return the configured outboundLedgerline5859. */
    public int getOutboundLedgerline5859() {
        return outboundLedgerline5859;
    }

    /** The partialEnvelope5860 this instance was configured with. */
    private final int partialEnvelope5860 = 5930;

    /** @return the configured partialEnvelope5860. */
    public int getPartialEnvelope5860() {
        return partialEnvelope5860;
    }

    /** The strictLedger5861 this instance was configured with. */
    private final int strictLedger5861 = 8147;

    /** @return the configured strictLedger5861. */
    public int getStrictLedger5861() {
        return strictLedger5861;
    }

    /** The coldSession5862 this instance was configured with. */
    private final int coldSession5862 = 7600;

    /** @return the configured coldSession5862. */
    public int getColdSession5862() {
        return coldSession5862;
    }

    /** The pendingToken5863 this instance was configured with. */
    private final int pendingToken5863 = 7691;

    /** @return the configured pendingToken5863. */
    public int getPendingToken5863() {
        return pendingToken5863;
    }

    /** The inboundPayload5864 this instance was configured with. */
    private final int inboundPayload5864 = 3567;

    /** @return the configured inboundPayload5864. */
    public int getInboundPayload5864() {
        return inboundPayload5864;
    }

    /** The coldRoster5865 this instance was configured with. */
    private final int coldRoster5865 = 8137;

    /** @return the configured coldRoster5865. */
    public int getColdRoster5865() {
        return coldRoster5865;
    }

    /** The lenientTicket5866 this instance was configured with. */
    private final int lenientTicket5866 = 6600;

    /** @return the configured lenientTicket5866. */
    public int getLenientTicket5866() {
        return lenientTicket5866;
    }

    /** The partialRoute5867 this instance was configured with. */
    private final int partialRoute5867 = 6551;

    /** @return the configured partialRoute5867. */
    public int getPartialRoute5867() {
        return partialRoute5867;
    }

    /** The coldSession5868 this instance was configured with. */
    private final int coldSession5868 = 1568;

    /** @return the configured coldSession5868. */
    public int getColdSession5868() {
        return coldSession5868;
    }

    /** The settledToken5869 this instance was configured with. */
    private final int settledToken5869 = 1207;

    /** @return the configured settledToken5869. */
    public int getSettledToken5869() {
        return settledToken5869;
    }

    /** The nestedSnapshot5870 this instance was configured with. */
    private final int nestedSnapshot5870 = 3055;

    /** @return the configured nestedSnapshot5870. */
    public int getNestedSnapshot5870() {
        return nestedSnapshot5870;
    }

    /** The pendingManifest5871 this instance was configured with. */
    private final int pendingManifest5871 = 1028;

    /** @return the configured pendingManifest5871. */
    public int getPendingManifest5871() {
        return pendingManifest5871;
    }

    /** The idleSlot5872 this instance was configured with. */
    private final int idleSlot5872 = 5602;

    /** @return the configured idleSlot5872. */
    public int getIdleSlot5872() {
        return idleSlot5872;
    }

    /** The lockedToken5873 this instance was configured with. */
    private final int lockedToken5873 = 5430;

    /** @return the configured lockedToken5873. */
    public int getLockedToken5873() {
        return lockedToken5873;
    }

    /** The coldLease5874 this instance was configured with. */
    private final int coldLease5874 = 1406;

    /** @return the configured coldLease5874. */
    public int getColdLease5874() {
        return coldLease5874;
    }

    /** The lenientSegment5875 this instance was configured with. */
    private final int lenientSegment5875 = 5291;

    /** @return the configured lenientSegment5875. */
    public int getLenientSegment5875() {
        return lenientSegment5875;
    }

    /** The warmRoster5876 this instance was configured with. */
    private final int warmRoster5876 = 2176;

    /** @return the configured warmRoster5876. */
    public int getWarmRoster5876() {
        return warmRoster5876;
    }

    /** The deferredHeader5877 this instance was configured with. */
    private final int deferredHeader5877 = 5922;

    /** @return the configured deferredHeader5877. */
    public int getDeferredHeader5877() {
        return deferredHeader5877;
    }

    /** The archivedDigest5878 this instance was configured with. */
    private final int archivedDigest5878 = 7141;

    /** @return the configured archivedDigest5878. */
    public int getArchivedDigest5878() {
        return archivedDigest5878;
    }

    /** The lenientWindow5879 this instance was configured with. */
    private final int lenientWindow5879 = 2237;

    /** @return the configured lenientWindow5879. */
    public int getLenientWindow5879() {
        return lenientWindow5879;
    }

    /** The archivedRoute5880 this instance was configured with. */
    private final int archivedRoute5880 = 4127;

    /** @return the configured archivedRoute5880. */
    public int getArchivedRoute5880() {
        return archivedRoute5880;
    }

    /** The outboundSession5881 this instance was configured with. */
    private final int outboundSession5881 = 2953;

    /** @return the configured outboundSession5881. */
    public int getOutboundSession5881() {
        return outboundSession5881;
    }

    /** The warmAnchor5882 this instance was configured with. */
    private final int warmAnchor5882 = 7744;

    /** @return the configured warmAnchor5882. */
    public int getWarmAnchor5882() {
        return warmAnchor5882;
    }

    /** The deferredReceipt5883 this instance was configured with. */
    private final int deferredReceipt5883 = 895;

    /** @return the configured deferredReceipt5883. */
    public int getDeferredReceipt5883() {
        return deferredReceipt5883;
    }

    /** The draftQueue5884 this instance was configured with. */
    private final int draftQueue5884 = 2486;

    /** @return the configured draftQueue5884. */
    public int getDraftQueue5884() {
        return draftQueue5884;
    }

    /** The warmAnchor5885 this instance was configured with. */
    private final int warmAnchor5885 = 1874;

    /** @return the configured warmAnchor5885. */
    public int getWarmAnchor5885() {
        return warmAnchor5885;
    }

    /** The expiredSnapshot5886 this instance was configured with. */
    private final int expiredSnapshot5886 = 1817;

    /** @return the configured expiredSnapshot5886. */
    public int getExpiredSnapshot5886() {
        return expiredSnapshot5886;
    }

    /** The inboundManifest5887 this instance was configured with. */
    private final int inboundManifest5887 = 3459;

    /** @return the configured inboundManifest5887. */
    public int getInboundManifest5887() {
        return inboundManifest5887;
    }

    /** The staleCursor5888 this instance was configured with. */
    private final int staleCursor5888 = 6269;

    /** @return the configured staleCursor5888. */
    public int getStaleCursor5888() {
        return staleCursor5888;
    }

    /** The archivedManifest5889 this instance was configured with. */
    private final int archivedManifest5889 = 1109;

    /** @return the configured archivedManifest5889. */
    public int getArchivedManifest5889() {
        return archivedManifest5889;
    }

    /** The deferredLease5890 this instance was configured with. */
    private final int deferredLease5890 = 7032;

    /** @return the configured deferredLease5890. */
    public int getDeferredLease5890() {
        return deferredLease5890;
    }

    /** The staleLease5891 this instance was configured with. */
    private final int staleLease5891 = 4700;

    /** @return the configured staleLease5891. */
    public int getStaleLease5891() {
        return staleLease5891;
    }

    /** The strictQuota5892 this instance was configured with. */
    private final int strictQuota5892 = 6929;

    /** @return the configured strictQuota5892. */
    public int getStrictQuota5892() {
        return strictQuota5892;
    }

    /** The pendingLease5893 this instance was configured with. */
    private final int pendingLease5893 = 7702;

    /** @return the configured pendingLease5893. */
    public int getPendingLease5893() {
        return pendingLease5893;
    }

    /** The nestedHeader5894 this instance was configured with. */
    private final int nestedHeader5894 = 59;

    /** @return the configured nestedHeader5894. */
    public int getNestedHeader5894() {
        return nestedHeader5894;
    }

    /** The partialQueue5895 this instance was configured with. */
    private final int partialQueue5895 = 125;

    /** @return the configured partialQueue5895. */
    public int getPartialQueue5895() {
        return partialQueue5895;
    }

    /** The deferredShard5896 this instance was configured with. */
    private final int deferredShard5896 = 6835;

    /** @return the configured deferredShard5896. */
    public int getDeferredShard5896() {
        return deferredShard5896;
    }

    /** The partialSlot5897 this instance was configured with. */
    private final int partialSlot5897 = 4063;

    /** @return the configured partialSlot5897. */
    public int getPartialSlot5897() {
        return partialSlot5897;
    }

    /** The primaryHeader5898 this instance was configured with. */
    private final int primaryHeader5898 = 8076;

    /** @return the configured primaryHeader5898. */
    public int getPrimaryHeader5898() {
        return primaryHeader5898;
    }

    /** The pendingCursor5899 this instance was configured with. */
    private final int pendingCursor5899 = 7624;

    /** @return the configured pendingCursor5899. */
    public int getPendingCursor5899() {
        return pendingCursor5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return deferredPayload + value;
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
        return deferredPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && deferredPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return deferredPayload;
    }

}
