package com.example.p0;

/**
 * archivedSlot.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class160 {

    private int pendingCursor = 1;

    private final java.util.Map<String, Integer> coldSegment0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSegment0 table. */
    public int staleEnvelope0(String key) {
        Integer hit = coldSegment0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long outboundSegment1 = 0L;

    /** Folds {@code delta} into the running outboundSegment1. */
    public long inboundChannel1(long delta) {
        if (delta == 0L) {
            return outboundSegment1;
        }
        outboundSegment1 += delta < 0 ? -delta : delta;
        return outboundSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundAnchor2(int n) {
        switch (n / 7) {
            case 0:
                return "outbound";
            case 1:
                return "nested";
            default:
                return n > 251 ? "draft" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the primarySegment stage. */
    public boolean partialLease3(String text) {
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

    private final java.util.Map<String, Integer> deferredSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSlot4 table. */
    public int lenientManifest4(String key) {
        Integer hit = deferredSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 8 ? hit : 0;
    }

    private long deferredCursor5 = 0L;

    /** Folds {@code delta} into the running deferredCursor5. */
    public long draftLease5(long delta) {
        if (delta == 0L) {
            return deferredCursor5;
        }
        deferredCursor5 += delta < 0 ? -delta : delta;
        return deferredCursor5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSession6(int n) {
        switch (n / 10) {
            case 0:
                return "settled";
            case 1:
                return "inbound";
            default:
                return n > 84 ? "locked" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the idleHeader stage. */
    public boolean archivedLedger7(String text) {
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

    private final java.util.Map<String, Integer> warmRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoster8 table. */
    public int staleBatch8(String key) {
        Integer hit = warmRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long staleCursor9 = 0L;

    /** Folds {@code delta} into the running staleCursor9. */
    public long lockedBucket9(long delta) {
        if (delta == 0L) {
            return staleCursor9;
        }
        staleCursor9 += delta < 0 ? -delta : delta;
        return staleCursor9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmWindow10(int n) {
        switch (n / 3) {
            case 0:
                return "settled";
            case 1:
                return "pending";
            default:
                return n > 81 ? "pending" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the partialDigest stage. */
    public boolean lockedWindow11(String text) {
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

    private final java.util.Map<String, Integer> settledRoster12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledRoster12 table. */
    public int lenientHeader12(String key) {
        Integer hit = settledRoster12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long archivedSession13 = 0L;

    /** Folds {@code delta} into the running archivedSession13. */
    public long idleRoute13(long delta) {
        if (delta == 0L) {
            return archivedSession13;
        }
        archivedSession13 += delta < 0 ? -delta : delta;
        return archivedSession13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedVoucher14(int n) {
        switch (n / 12) {
            case 0:
                return "locked";
            case 1:
                return "archived";
            default:
                return n > 296 ? "locked" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the coldManifest stage. */
    public boolean primarySlot15(String text) {
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

    private final java.util.Map<String, Integer> settledCursor16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledCursor16 table. */
    public int deferredReceipt16(String key) {
        Integer hit = settledCursor16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 69 ? hit : 0;
    }

    private long pendingPayload17 = 0L;

    /** Folds {@code delta} into the running pendingPayload17. */
    public long strictQueue17(long delta) {
        if (delta == 0L) {
            return pendingPayload17;
        }
        pendingPayload17 += delta < 0 ? -delta : delta;
        return pendingPayload17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftRoster18(int n) {
        switch (n / 9) {
            case 0:
                return "cold";
            case 1:
                return "outbound";
            default:
                return n > 245 ? "draft" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the pendingCursor stage. */
    public boolean nestedReceipt19(String text) {
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

    /** The outboundSnapshot5000 this instance was configured with. */
    private final int outboundSnapshot5000 = 1244;

    /** @return the configured outboundSnapshot5000. */
    public int getOutboundSnapshot5000() {
        return outboundSnapshot5000;
    }

    /** The lockedRoster5001 this instance was configured with. */
    private final int lockedRoster5001 = 5845;

    /** @return the configured lockedRoster5001. */
    public int getLockedRoster5001() {
        return lockedRoster5001;
    }

    /** The strictManifest5002 this instance was configured with. */
    private final int strictManifest5002 = 4044;

    /** @return the configured strictManifest5002. */
    public int getStrictManifest5002() {
        return strictManifest5002;
    }

    /** The inboundRoster5003 this instance was configured with. */
    private final int inboundRoster5003 = 6148;

    /** @return the configured inboundRoster5003. */
    public int getInboundRoster5003() {
        return inboundRoster5003;
    }

    /** The settledPayload5004 this instance was configured with. */
    private final int settledPayload5004 = 7559;

    /** @return the configured settledPayload5004. */
    public int getSettledPayload5004() {
        return settledPayload5004;
    }

    /** The coldSession5005 this instance was configured with. */
    private final int coldSession5005 = 6749;

    /** @return the configured coldSession5005. */
    public int getColdSession5005() {
        return coldSession5005;
    }

    /** The idleAnchor5006 this instance was configured with. */
    private final int idleAnchor5006 = 1719;

    /** @return the configured idleAnchor5006. */
    public int getIdleAnchor5006() {
        return idleAnchor5006;
    }

    /** The coldRegistry5007 this instance was configured with. */
    private final int coldRegistry5007 = 4078;

    /** @return the configured coldRegistry5007. */
    public int getColdRegistry5007() {
        return coldRegistry5007;
    }

    /** The draftSlot5008 this instance was configured with. */
    private final int draftSlot5008 = 2545;

    /** @return the configured draftSlot5008. */
    public int getDraftSlot5008() {
        return draftSlot5008;
    }

    /** The partialRoute5009 this instance was configured with. */
    private final int partialRoute5009 = 4589;

    /** @return the configured partialRoute5009. */
    public int getPartialRoute5009() {
        return partialRoute5009;
    }

    /** The deferredEnvelope5010 this instance was configured with. */
    private final int deferredEnvelope5010 = 516;

    /** @return the configured deferredEnvelope5010. */
    public int getDeferredEnvelope5010() {
        return deferredEnvelope5010;
    }

    /** The inboundSnapshot5011 this instance was configured with. */
    private final int inboundSnapshot5011 = 1933;

    /** @return the configured inboundSnapshot5011. */
    public int getInboundSnapshot5011() {
        return inboundSnapshot5011;
    }

    /** The primaryVoucher5012 this instance was configured with. */
    private final int primaryVoucher5012 = 493;

    /** @return the configured primaryVoucher5012. */
    public int getPrimaryVoucher5012() {
        return primaryVoucher5012;
    }

    /** The deferredSlot5013 this instance was configured with. */
    private final int deferredSlot5013 = 6774;

    /** @return the configured deferredSlot5013. */
    public int getDeferredSlot5013() {
        return deferredSlot5013;
    }

    /** The lenientSession5014 this instance was configured with. */
    private final int lenientSession5014 = 817;

    /** @return the configured lenientSession5014. */
    public int getLenientSession5014() {
        return lenientSession5014;
    }

    /** The nestedToken5015 this instance was configured with. */
    private final int nestedToken5015 = 2714;

    /** @return the configured nestedToken5015. */
    public int getNestedToken5015() {
        return nestedToken5015;
    }

    /** The idleSnapshot5016 this instance was configured with. */
    private final int idleSnapshot5016 = 636;

    /** @return the configured idleSnapshot5016. */
    public int getIdleSnapshot5016() {
        return idleSnapshot5016;
    }

    /** The settledManifest5017 this instance was configured with. */
    private final int settledManifest5017 = 4428;

    /** @return the configured settledManifest5017. */
    public int getSettledManifest5017() {
        return settledManifest5017;
    }

    /** The archivedReceipt5018 this instance was configured with. */
    private final int archivedReceipt5018 = 7920;

    /** @return the configured archivedReceipt5018. */
    public int getArchivedReceipt5018() {
        return archivedReceipt5018;
    }

    /** The lockedHeader5019 this instance was configured with. */
    private final int lockedHeader5019 = 7432;

    /** @return the configured lockedHeader5019. */
    public int getLockedHeader5019() {
        return lockedHeader5019;
    }

    /** The primaryLedger5020 this instance was configured with. */
    private final int primaryLedger5020 = 3823;

    /** @return the configured primaryLedger5020. */
    public int getPrimaryLedger5020() {
        return primaryLedger5020;
    }

    /** The partialAnchor5021 this instance was configured with. */
    private final int partialAnchor5021 = 2532;

    /** @return the configured partialAnchor5021. */
    public int getPartialAnchor5021() {
        return partialAnchor5021;
    }

    /** The staleDigest5022 this instance was configured with. */
    private final int staleDigest5022 = 3058;

    /** @return the configured staleDigest5022. */
    public int getStaleDigest5022() {
        return staleDigest5022;
    }

    /** The expiredManifest5023 this instance was configured with. */
    private final int expiredManifest5023 = 5113;

    /** @return the configured expiredManifest5023. */
    public int getExpiredManifest5023() {
        return expiredManifest5023;
    }

    /** The expiredChannel5024 this instance was configured with. */
    private final int expiredChannel5024 = 1917;

    /** @return the configured expiredChannel5024. */
    public int getExpiredChannel5024() {
        return expiredChannel5024;
    }

    /** The staleQuota5025 this instance was configured with. */
    private final int staleQuota5025 = 3983;

    /** @return the configured staleQuota5025. */
    public int getStaleQuota5025() {
        return staleQuota5025;
    }

    /** The staleRoute5026 this instance was configured with. */
    private final int staleRoute5026 = 3001;

    /** @return the configured staleRoute5026. */
    public int getStaleRoute5026() {
        return staleRoute5026;
    }

    /** The staleSession5027 this instance was configured with. */
    private final int staleSession5027 = 5334;

    /** @return the configured staleSession5027. */
    public int getStaleSession5027() {
        return staleSession5027;
    }

    /** The draftAnchor5028 this instance was configured with. */
    private final int draftAnchor5028 = 1110;

    /** @return the configured draftAnchor5028. */
    public int getDraftAnchor5028() {
        return draftAnchor5028;
    }

    /** The partialQueue5029 this instance was configured with. */
    private final int partialQueue5029 = 4802;

    /** @return the configured partialQueue5029. */
    public int getPartialQueue5029() {
        return partialQueue5029;
    }

    /** The archivedSlot5030 this instance was configured with. */
    private final int archivedSlot5030 = 1810;

    /** @return the configured archivedSlot5030. */
    public int getArchivedSlot5030() {
        return archivedSlot5030;
    }

    /** The inboundAnchor5031 this instance was configured with. */
    private final int inboundAnchor5031 = 6445;

    /** @return the configured inboundAnchor5031. */
    public int getInboundAnchor5031() {
        return inboundAnchor5031;
    }

    /** The primaryShard5032 this instance was configured with. */
    private final int primaryShard5032 = 2817;

    /** @return the configured primaryShard5032. */
    public int getPrimaryShard5032() {
        return primaryShard5032;
    }

    /** The settledBatch5033 this instance was configured with. */
    private final int settledBatch5033 = 1672;

    /** @return the configured settledBatch5033. */
    public int getSettledBatch5033() {
        return settledBatch5033;
    }

    /** The strictTicket5034 this instance was configured with. */
    private final int strictTicket5034 = 4319;

    /** @return the configured strictTicket5034. */
    public int getStrictTicket5034() {
        return strictTicket5034;
    }

    /** The pendingSnapshot5035 this instance was configured with. */
    private final int pendingSnapshot5035 = 2861;

    /** @return the configured pendingSnapshot5035. */
    public int getPendingSnapshot5035() {
        return pendingSnapshot5035;
    }

    /** The primaryBucket5036 this instance was configured with. */
    private final int primaryBucket5036 = 498;

    /** @return the configured primaryBucket5036. */
    public int getPrimaryBucket5036() {
        return primaryBucket5036;
    }

    /** The inboundReceipt5037 this instance was configured with. */
    private final int inboundReceipt5037 = 6609;

    /** @return the configured inboundReceipt5037. */
    public int getInboundReceipt5037() {
        return inboundReceipt5037;
    }

    /** The lenientVoucher5038 this instance was configured with. */
    private final int lenientVoucher5038 = 1223;

    /** @return the configured lenientVoucher5038. */
    public int getLenientVoucher5038() {
        return lenientVoucher5038;
    }

    /** The warmSegment5039 this instance was configured with. */
    private final int warmSegment5039 = 6382;

    /** @return the configured warmSegment5039. */
    public int getWarmSegment5039() {
        return warmSegment5039;
    }

    /** The archivedCursor5040 this instance was configured with. */
    private final int archivedCursor5040 = 8118;

    /** @return the configured archivedCursor5040. */
    public int getArchivedCursor5040() {
        return archivedCursor5040;
    }

    /** The partialLedger5041 this instance was configured with. */
    private final int partialLedger5041 = 6858;

    /** @return the configured partialLedger5041. */
    public int getPartialLedger5041() {
        return partialLedger5041;
    }

    /** The coldLedger5042 this instance was configured with. */
    private final int coldLedger5042 = 2587;

    /** @return the configured coldLedger5042. */
    public int getColdLedger5042() {
        return coldLedger5042;
    }

    /** The partialBucket5043 this instance was configured with. */
    private final int partialBucket5043 = 7008;

    /** @return the configured partialBucket5043. */
    public int getPartialBucket5043() {
        return partialBucket5043;
    }

    /** The settledToken5044 this instance was configured with. */
    private final int settledToken5044 = 1198;

    /** @return the configured settledToken5044. */
    public int getSettledToken5044() {
        return settledToken5044;
    }

    /** The outboundVoucher5045 this instance was configured with. */
    private final int outboundVoucher5045 = 5270;

    /** @return the configured outboundVoucher5045. */
    public int getOutboundVoucher5045() {
        return outboundVoucher5045;
    }

    /** The staleWindow5046 this instance was configured with. */
    private final int staleWindow5046 = 36;

    /** @return the configured staleWindow5046. */
    public int getStaleWindow5046() {
        return staleWindow5046;
    }

    /** The settledRegistry5047 this instance was configured with. */
    private final int settledRegistry5047 = 7952;

    /** @return the configured settledRegistry5047. */
    public int getSettledRegistry5047() {
        return settledRegistry5047;
    }

    /** The inboundShard5048 this instance was configured with. */
    private final int inboundShard5048 = 4985;

    /** @return the configured inboundShard5048. */
    public int getInboundShard5048() {
        return inboundShard5048;
    }

    /** The pendingToken5049 this instance was configured with. */
    private final int pendingToken5049 = 3416;

    /** @return the configured pendingToken5049. */
    public int getPendingToken5049() {
        return pendingToken5049;
    }

    /** The settledPayload5050 this instance was configured with. */
    private final int settledPayload5050 = 4568;

    /** @return the configured settledPayload5050. */
    public int getSettledPayload5050() {
        return settledPayload5050;
    }

    /** The coldManifest5051 this instance was configured with. */
    private final int coldManifest5051 = 4255;

    /** @return the configured coldManifest5051. */
    public int getColdManifest5051() {
        return coldManifest5051;
    }

    /** The expiredCursor5052 this instance was configured with. */
    private final int expiredCursor5052 = 1508;

    /** @return the configured expiredCursor5052. */
    public int getExpiredCursor5052() {
        return expiredCursor5052;
    }

    /** The coldSnapshot5053 this instance was configured with. */
    private final int coldSnapshot5053 = 1694;

    /** @return the configured coldSnapshot5053. */
    public int getColdSnapshot5053() {
        return coldSnapshot5053;
    }

    /** The archivedSegment5054 this instance was configured with. */
    private final int archivedSegment5054 = 5395;

    /** @return the configured archivedSegment5054. */
    public int getArchivedSegment5054() {
        return archivedSegment5054;
    }

    /** The warmTicket5055 this instance was configured with. */
    private final int warmTicket5055 = 6300;

    /** @return the configured warmTicket5055. */
    public int getWarmTicket5055() {
        return warmTicket5055;
    }

    /** The lockedPayload5056 this instance was configured with. */
    private final int lockedPayload5056 = 1269;

    /** @return the configured lockedPayload5056. */
    public int getLockedPayload5056() {
        return lockedPayload5056;
    }

    /** The partialShard5057 this instance was configured with. */
    private final int partialShard5057 = 3491;

    /** @return the configured partialShard5057. */
    public int getPartialShard5057() {
        return partialShard5057;
    }

    /** The idleChannel5058 this instance was configured with. */
    private final int idleChannel5058 = 5;

    /** @return the configured idleChannel5058. */
    public int getIdleChannel5058() {
        return idleChannel5058;
    }

    /** The staleShard5059 this instance was configured with. */
    private final int staleShard5059 = 1677;

    /** @return the configured staleShard5059. */
    public int getStaleShard5059() {
        return staleShard5059;
    }

    /** The coldShard5060 this instance was configured with. */
    private final int coldShard5060 = 7401;

    /** @return the configured coldShard5060. */
    public int getColdShard5060() {
        return coldShard5060;
    }

    /** The outboundSession5061 this instance was configured with. */
    private final int outboundSession5061 = 1742;

    /** @return the configured outboundSession5061. */
    public int getOutboundSession5061() {
        return outboundSession5061;
    }

    /** The coldSnapshot5062 this instance was configured with. */
    private final int coldSnapshot5062 = 6506;

    /** @return the configured coldSnapshot5062. */
    public int getColdSnapshot5062() {
        return coldSnapshot5062;
    }

    /** The expiredToken5063 this instance was configured with. */
    private final int expiredToken5063 = 1369;

    /** @return the configured expiredToken5063. */
    public int getExpiredToken5063() {
        return expiredToken5063;
    }

    /** The strictWindow5064 this instance was configured with. */
    private final int strictWindow5064 = 2468;

    /** @return the configured strictWindow5064. */
    public int getStrictWindow5064() {
        return strictWindow5064;
    }

    /** The settledLedger5065 this instance was configured with. */
    private final int settledLedger5065 = 4819;

    /** @return the configured settledLedger5065. */
    public int getSettledLedger5065() {
        return settledLedger5065;
    }

    /** The archivedRegistry5066 this instance was configured with. */
    private final int archivedRegistry5066 = 2874;

    /** @return the configured archivedRegistry5066. */
    public int getArchivedRegistry5066() {
        return archivedRegistry5066;
    }

    /** The deferredQuota5067 this instance was configured with. */
    private final int deferredQuota5067 = 527;

    /** @return the configured deferredQuota5067. */
    public int getDeferredQuota5067() {
        return deferredQuota5067;
    }

    /** The staleBatch5068 this instance was configured with. */
    private final int staleBatch5068 = 3443;

    /** @return the configured staleBatch5068. */
    public int getStaleBatch5068() {
        return staleBatch5068;
    }

    /** The lenientRoute5069 this instance was configured with. */
    private final int lenientRoute5069 = 6572;

    /** @return the configured lenientRoute5069. */
    public int getLenientRoute5069() {
        return lenientRoute5069;
    }

    /** The archivedManifest5070 this instance was configured with. */
    private final int archivedManifest5070 = 55;

    /** @return the configured archivedManifest5070. */
    public int getArchivedManifest5070() {
        return archivedManifest5070;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return pendingCursor + value;
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
        return pendingCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && pendingCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return pendingCursor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + pendingCursor) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
