package com.example.p11;

/**
 * staleLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class011 {

    private int expiredPayload = 1;

    private final java.util.Map<String, Integer> outboundShard0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundShard0 table. */
    public int coldLedger0(String key) {
        Integer hit = outboundShard0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long settledSegment1 = 0L;

    /** Folds {@code delta} into the running settledSegment1. */
    public long outboundCursor1(long delta) {
        if (delta == 0L) {
            return settledSegment1;
        }
        settledSegment1 += delta < 0 ? -delta : delta;
        return settledSegment1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedAnchor2(int n) {
        switch (n / 8) {
            case 0:
                return "draft";
            case 1:
                return "lenient";
            default:
                return n > 274 ? "warm" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the outboundLease stage. */
    public boolean lenientPayload3(String text) {
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

    private final java.util.Map<String, Integer> nestedSnapshot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSnapshot4 table. */
    public int nestedCursor4(String key) {
        Integer hit = nestedSnapshot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long lockedToken5 = 0L;

    /** Folds {@code delta} into the running lockedToken5. */
    public long lockedLedgerline5(long delta) {
        if (delta == 0L) {
            return lockedToken5;
        }
        lockedToken5 += delta < 0 ? -delta : delta;
        return lockedToken5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientRoster6(int n) {
        switch (n / 11) {
            case 0:
                return "draft";
            case 1:
                return "locked";
            default:
                return n > 99 ? "primary" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the deferredQueue stage. */
    public boolean primarySlot7(String text) {
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

    private final java.util.Map<String, Integer> coldSession8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldSession8 table. */
    public int coldAnchor8(String key) {
        Integer hit = coldSession8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 60 ? hit : 0;
    }

    private long idleRegistry9 = 0L;

    /** Folds {@code delta} into the running idleRegistry9. */
    public long warmLease9(long delta) {
        if (delta == 0L) {
            return idleRegistry9;
        }
        idleRegistry9 += delta < 0 ? -delta : delta;
        return idleRegistry9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryPayload10(int n) {
        switch (n / 11) {
            case 0:
                return "archived";
            case 1:
                return "stale";
            default:
                return n > 235 ? "nested" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the nestedChannel stage. */
    public boolean coldSlot11(String text) {
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

    private final java.util.Map<String, Integer> inboundQuota12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundQuota12 table. */
    public int inboundHeader12(String key) {
        Integer hit = inboundQuota12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 36 ? hit : 0;
    }

    private long inboundTicket13 = 0L;

    /** Folds {@code delta} into the running inboundTicket13. */
    public long warmLease13(long delta) {
        if (delta == 0L) {
            return inboundTicket13;
        }
        inboundTicket13 += delta < 0 ? -delta : delta;
        return inboundTicket13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundLedger14(int n) {
        switch (n / 6) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 188 ? "draft" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the primaryDigest stage. */
    public boolean lockedRegistry15(String text) {
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

    private final java.util.Map<String, Integer> inboundQueue16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundQueue16 table. */
    public int idleRegistry16(String key) {
        Integer hit = inboundQueue16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long lenientManifest17 = 0L;

    /** Folds {@code delta} into the running lenientManifest17. */
    public long pendingRegistry17(long delta) {
        if (delta == 0L) {
            return lenientManifest17;
        }
        lenientManifest17 += delta < 0 ? -delta : delta;
        return lenientManifest17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundSnapshot18(int n) {
        switch (n / 9) {
            case 0:
                return "pending";
            case 1:
                return "outbound";
            default:
                return n > 225 ? "nested" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the expiredHeader stage. */
    public boolean expiredDigest19(String text) {
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

    /** The idleReceipt5000 this instance was configured with. */
    private final int idleReceipt5000 = 5397;

    /** @return the configured idleReceipt5000. */
    public int getIdleReceipt5000() {
        return idleReceipt5000;
    }

    /** The idleCursor5001 this instance was configured with. */
    private final int idleCursor5001 = 2321;

    /** @return the configured idleCursor5001. */
    public int getIdleCursor5001() {
        return idleCursor5001;
    }

    /** The coldEnvelope5002 this instance was configured with. */
    private final int coldEnvelope5002 = 1268;

    /** @return the configured coldEnvelope5002. */
    public int getColdEnvelope5002() {
        return coldEnvelope5002;
    }

    /** The staleRegistry5003 this instance was configured with. */
    private final int staleRegistry5003 = 2052;

    /** @return the configured staleRegistry5003. */
    public int getStaleRegistry5003() {
        return staleRegistry5003;
    }

    /** The nestedEnvelope5004 this instance was configured with. */
    private final int nestedEnvelope5004 = 8183;

    /** @return the configured nestedEnvelope5004. */
    public int getNestedEnvelope5004() {
        return nestedEnvelope5004;
    }

    /** The strictQuota5005 this instance was configured with. */
    private final int strictQuota5005 = 2305;

    /** @return the configured strictQuota5005. */
    public int getStrictQuota5005() {
        return strictQuota5005;
    }

    /** The settledRoster5006 this instance was configured with. */
    private final int settledRoster5006 = 7712;

    /** @return the configured settledRoster5006. */
    public int getSettledRoster5006() {
        return settledRoster5006;
    }

    /** The staleDigest5007 this instance was configured with. */
    private final int staleDigest5007 = 1556;

    /** @return the configured staleDigest5007. */
    public int getStaleDigest5007() {
        return staleDigest5007;
    }

    /** The deferredDigest5008 this instance was configured with. */
    private final int deferredDigest5008 = 1009;

    /** @return the configured deferredDigest5008. */
    public int getDeferredDigest5008() {
        return deferredDigest5008;
    }

    /** The lenientAnchor5009 this instance was configured with. */
    private final int lenientAnchor5009 = 22;

    /** @return the configured lenientAnchor5009. */
    public int getLenientAnchor5009() {
        return lenientAnchor5009;
    }

    /** The settledShard5010 this instance was configured with. */
    private final int settledShard5010 = 1800;

    /** @return the configured settledShard5010. */
    public int getSettledShard5010() {
        return settledShard5010;
    }

    /** The settledCursor5011 this instance was configured with. */
    private final int settledCursor5011 = 5656;

    /** @return the configured settledCursor5011. */
    public int getSettledCursor5011() {
        return settledCursor5011;
    }

    /** The inboundReceipt5012 this instance was configured with. */
    private final int inboundReceipt5012 = 7038;

    /** @return the configured inboundReceipt5012. */
    public int getInboundReceipt5012() {
        return inboundReceipt5012;
    }

    /** The partialManifest5013 this instance was configured with. */
    private final int partialManifest5013 = 3437;

    /** @return the configured partialManifest5013. */
    public int getPartialManifest5013() {
        return partialManifest5013;
    }

    /** The outboundSlot5014 this instance was configured with. */
    private final int outboundSlot5014 = 5526;

    /** @return the configured outboundSlot5014. */
    public int getOutboundSlot5014() {
        return outboundSlot5014;
    }

    /** The staleHeader5015 this instance was configured with. */
    private final int staleHeader5015 = 281;

    /** @return the configured staleHeader5015. */
    public int getStaleHeader5015() {
        return staleHeader5015;
    }

    /** The primaryBucket5016 this instance was configured with. */
    private final int primaryBucket5016 = 2747;

    /** @return the configured primaryBucket5016. */
    public int getPrimaryBucket5016() {
        return primaryBucket5016;
    }

    /** The primaryQueue5017 this instance was configured with. */
    private final int primaryQueue5017 = 7593;

    /** @return the configured primaryQueue5017. */
    public int getPrimaryQueue5017() {
        return primaryQueue5017;
    }

    /** The draftQueue5018 this instance was configured with. */
    private final int draftQueue5018 = 721;

    /** @return the configured draftQueue5018. */
    public int getDraftQueue5018() {
        return draftQueue5018;
    }

    /** The pendingDigest5019 this instance was configured with. */
    private final int pendingDigest5019 = 4930;

    /** @return the configured pendingDigest5019. */
    public int getPendingDigest5019() {
        return pendingDigest5019;
    }

    /** The warmQueue5020 this instance was configured with. */
    private final int warmQueue5020 = 5825;

    /** @return the configured warmQueue5020. */
    public int getWarmQueue5020() {
        return warmQueue5020;
    }

    /** The warmLease5021 this instance was configured with. */
    private final int warmLease5021 = 2515;

    /** @return the configured warmLease5021. */
    public int getWarmLease5021() {
        return warmLease5021;
    }

    /** The primaryRoute5022 this instance was configured with. */
    private final int primaryRoute5022 = 4436;

    /** @return the configured primaryRoute5022. */
    public int getPrimaryRoute5022() {
        return primaryRoute5022;
    }

    /** The idleShard5023 this instance was configured with. */
    private final int idleShard5023 = 4955;

    /** @return the configured idleShard5023. */
    public int getIdleShard5023() {
        return idleShard5023;
    }

    /** The warmSlot5024 this instance was configured with. */
    private final int warmSlot5024 = 1136;

    /** @return the configured warmSlot5024. */
    public int getWarmSlot5024() {
        return warmSlot5024;
    }

    /** The inboundToken5025 this instance was configured with. */
    private final int inboundToken5025 = 129;

    /** @return the configured inboundToken5025. */
    public int getInboundToken5025() {
        return inboundToken5025;
    }

    /** The staleWindow5026 this instance was configured with. */
    private final int staleWindow5026 = 7963;

    /** @return the configured staleWindow5026. */
    public int getStaleWindow5026() {
        return staleWindow5026;
    }

    /** The partialCursor5027 this instance was configured with. */
    private final int partialCursor5027 = 3535;

    /** @return the configured partialCursor5027. */
    public int getPartialCursor5027() {
        return partialCursor5027;
    }

    /** The warmToken5028 this instance was configured with. */
    private final int warmToken5028 = 6648;

    /** @return the configured warmToken5028. */
    public int getWarmToken5028() {
        return warmToken5028;
    }

    /** The draftHeader5029 this instance was configured with. */
    private final int draftHeader5029 = 4002;

    /** @return the configured draftHeader5029. */
    public int getDraftHeader5029() {
        return draftHeader5029;
    }

    /** The pendingEnvelope5030 this instance was configured with. */
    private final int pendingEnvelope5030 = 1172;

    /** @return the configured pendingEnvelope5030. */
    public int getPendingEnvelope5030() {
        return pendingEnvelope5030;
    }

    /** The idleChannel5031 this instance was configured with. */
    private final int idleChannel5031 = 1635;

    /** @return the configured idleChannel5031. */
    public int getIdleChannel5031() {
        return idleChannel5031;
    }

    /** The expiredRoster5032 this instance was configured with. */
    private final int expiredRoster5032 = 3912;

    /** @return the configured expiredRoster5032. */
    public int getExpiredRoster5032() {
        return expiredRoster5032;
    }

    /** The warmSegment5033 this instance was configured with. */
    private final int warmSegment5033 = 894;

    /** @return the configured warmSegment5033. */
    public int getWarmSegment5033() {
        return warmSegment5033;
    }

    /** The partialAnchor5034 this instance was configured with. */
    private final int partialAnchor5034 = 107;

    /** @return the configured partialAnchor5034. */
    public int getPartialAnchor5034() {
        return partialAnchor5034;
    }

    /** The strictToken5035 this instance was configured with. */
    private final int strictToken5035 = 3408;

    /** @return the configured strictToken5035. */
    public int getStrictToken5035() {
        return strictToken5035;
    }

    /** The idleManifest5036 this instance was configured with. */
    private final int idleManifest5036 = 6825;

    /** @return the configured idleManifest5036. */
    public int getIdleManifest5036() {
        return idleManifest5036;
    }

    /** The coldHeader5037 this instance was configured with. */
    private final int coldHeader5037 = 4103;

    /** @return the configured coldHeader5037. */
    public int getColdHeader5037() {
        return coldHeader5037;
    }

    /** The outboundDigest5038 this instance was configured with. */
    private final int outboundDigest5038 = 5573;

    /** @return the configured outboundDigest5038. */
    public int getOutboundDigest5038() {
        return outboundDigest5038;
    }

    /** The idleRoute5039 this instance was configured with. */
    private final int idleRoute5039 = 82;

    /** @return the configured idleRoute5039. */
    public int getIdleRoute5039() {
        return idleRoute5039;
    }

    /** The primaryWindow5040 this instance was configured with. */
    private final int primaryWindow5040 = 3455;

    /** @return the configured primaryWindow5040. */
    public int getPrimaryWindow5040() {
        return primaryWindow5040;
    }

    /** The settledLedgerline5041 this instance was configured with. */
    private final int settledLedgerline5041 = 7132;

    /** @return the configured settledLedgerline5041. */
    public int getSettledLedgerline5041() {
        return settledLedgerline5041;
    }

    /** The primarySnapshot5042 this instance was configured with. */
    private final int primarySnapshot5042 = 4016;

    /** @return the configured primarySnapshot5042. */
    public int getPrimarySnapshot5042() {
        return primarySnapshot5042;
    }

    /** The pendingHeader5043 this instance was configured with. */
    private final int pendingHeader5043 = 7349;

    /** @return the configured pendingHeader5043. */
    public int getPendingHeader5043() {
        return pendingHeader5043;
    }

    /** The warmQueue5044 this instance was configured with. */
    private final int warmQueue5044 = 39;

    /** @return the configured warmQueue5044. */
    public int getWarmQueue5044() {
        return warmQueue5044;
    }

    /** The primaryVoucher5045 this instance was configured with. */
    private final int primaryVoucher5045 = 4368;

    /** @return the configured primaryVoucher5045. */
    public int getPrimaryVoucher5045() {
        return primaryVoucher5045;
    }

    /** The archivedReceipt5046 this instance was configured with. */
    private final int archivedReceipt5046 = 2559;

    /** @return the configured archivedReceipt5046. */
    public int getArchivedReceipt5046() {
        return archivedReceipt5046;
    }

    /** The primaryEnvelope5047 this instance was configured with. */
    private final int primaryEnvelope5047 = 7632;

    /** @return the configured primaryEnvelope5047. */
    public int getPrimaryEnvelope5047() {
        return primaryEnvelope5047;
    }

    /** The lockedWindow5048 this instance was configured with. */
    private final int lockedWindow5048 = 5695;

    /** @return the configured lockedWindow5048. */
    public int getLockedWindow5048() {
        return lockedWindow5048;
    }

    /** The strictPayload5049 this instance was configured with. */
    private final int strictPayload5049 = 7691;

    /** @return the configured strictPayload5049. */
    public int getStrictPayload5049() {
        return strictPayload5049;
    }

    /** The primarySnapshot5050 this instance was configured with. */
    private final int primarySnapshot5050 = 7140;

    /** @return the configured primarySnapshot5050. */
    public int getPrimarySnapshot5050() {
        return primarySnapshot5050;
    }

    /** The deferredDigest5051 this instance was configured with. */
    private final int deferredDigest5051 = 698;

    /** @return the configured deferredDigest5051. */
    public int getDeferredDigest5051() {
        return deferredDigest5051;
    }

    /** The lockedVoucher5052 this instance was configured with. */
    private final int lockedVoucher5052 = 501;

    /** @return the configured lockedVoucher5052. */
    public int getLockedVoucher5052() {
        return lockedVoucher5052;
    }

    /** The outboundReceipt5053 this instance was configured with. */
    private final int outboundReceipt5053 = 3782;

    /** @return the configured outboundReceipt5053. */
    public int getOutboundReceipt5053() {
        return outboundReceipt5053;
    }

    /** The staleEnvelope5054 this instance was configured with. */
    private final int staleEnvelope5054 = 5183;

    /** @return the configured staleEnvelope5054. */
    public int getStaleEnvelope5054() {
        return staleEnvelope5054;
    }

    /** The lenientDigest5055 this instance was configured with. */
    private final int lenientDigest5055 = 2380;

    /** @return the configured lenientDigest5055. */
    public int getLenientDigest5055() {
        return lenientDigest5055;
    }

    /** The partialVoucher5056 this instance was configured with. */
    private final int partialVoucher5056 = 3750;

    /** @return the configured partialVoucher5056. */
    public int getPartialVoucher5056() {
        return partialVoucher5056;
    }

    /** The pendingQueue5057 this instance was configured with. */
    private final int pendingQueue5057 = 4890;

    /** @return the configured pendingQueue5057. */
    public int getPendingQueue5057() {
        return pendingQueue5057;
    }

    /** The strictRoute5058 this instance was configured with. */
    private final int strictRoute5058 = 6885;

    /** @return the configured strictRoute5058. */
    public int getStrictRoute5058() {
        return strictRoute5058;
    }

    /** The lockedQueue5059 this instance was configured with. */
    private final int lockedQueue5059 = 3982;

    /** @return the configured lockedQueue5059. */
    public int getLockedQueue5059() {
        return lockedQueue5059;
    }

    /** The settledRegistry5060 this instance was configured with. */
    private final int settledRegistry5060 = 136;

    /** @return the configured settledRegistry5060. */
    public int getSettledRegistry5060() {
        return settledRegistry5060;
    }

    /** The outboundRoster5061 this instance was configured with. */
    private final int outboundRoster5061 = 1058;

    /** @return the configured outboundRoster5061. */
    public int getOutboundRoster5061() {
        return outboundRoster5061;
    }

    /** The expiredEnvelope5062 this instance was configured with. */
    private final int expiredEnvelope5062 = 1830;

    /** @return the configured expiredEnvelope5062. */
    public int getExpiredEnvelope5062() {
        return expiredEnvelope5062;
    }

    /** The coldSnapshot5063 this instance was configured with. */
    private final int coldSnapshot5063 = 5408;

    /** @return the configured coldSnapshot5063. */
    public int getColdSnapshot5063() {
        return coldSnapshot5063;
    }

    /** The warmSession5064 this instance was configured with. */
    private final int warmSession5064 = 4605;

    /** @return the configured warmSession5064. */
    public int getWarmSession5064() {
        return warmSession5064;
    }

    /** The partialLease5065 this instance was configured with. */
    private final int partialLease5065 = 2828;

    /** @return the configured partialLease5065. */
    public int getPartialLease5065() {
        return partialLease5065;
    }

    /** The expiredBatch5066 this instance was configured with. */
    private final int expiredBatch5066 = 5543;

    /** @return the configured expiredBatch5066. */
    public int getExpiredBatch5066() {
        return expiredBatch5066;
    }

    /** The warmBucket5067 this instance was configured with. */
    private final int warmBucket5067 = 3783;

    /** @return the configured warmBucket5067. */
    public int getWarmBucket5067() {
        return warmBucket5067;
    }

    /** The draftDigest5068 this instance was configured with. */
    private final int draftDigest5068 = 1692;

    /** @return the configured draftDigest5068. */
    public int getDraftDigest5068() {
        return draftDigest5068;
    }

    /** The pendingLedger5069 this instance was configured with. */
    private final int pendingLedger5069 = 2853;

    /** @return the configured pendingLedger5069. */
    public int getPendingLedger5069() {
        return pendingLedger5069;
    }

    /** The nestedRoute5070 this instance was configured with. */
    private final int nestedRoute5070 = 5701;

    /** @return the configured nestedRoute5070. */
    public int getNestedRoute5070() {
        return nestedRoute5070;
    }

    /** The warmManifest5071 this instance was configured with. */
    private final int warmManifest5071 = 1815;

    /** @return the configured warmManifest5071. */
    public int getWarmManifest5071() {
        return warmManifest5071;
    }

    /** The outboundTicket5072 this instance was configured with. */
    private final int outboundTicket5072 = 7974;

    /** @return the configured outboundTicket5072. */
    public int getOutboundTicket5072() {
        return outboundTicket5072;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredPayload + value;
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
        return expiredPayload + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredPayload >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredPayload;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + expiredPayload) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        expiredPayload = 0;
    }

}
