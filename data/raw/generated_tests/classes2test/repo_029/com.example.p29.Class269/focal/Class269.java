package com.example.p29;

/**
 * expiredLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class269 {

    private int lenientSegment = 1;

    private final java.util.Map<String, Integer> outboundLedgerline0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundLedgerline0 table. */
    public int warmPayload0(String key) {
        Integer hit = outboundLedgerline0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long nestedChannel1 = 0L;

    /** Folds {@code delta} into the running nestedChannel1. */
    public long nestedVoucher1(long delta) {
        if (delta == 0L) {
            return nestedChannel1;
        }
        nestedChannel1 += delta < 0 ? -delta : delta;
        return nestedChannel1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingBucket2(int n) {
        switch (n / 11) {
            case 0:
                return "locked";
            case 1:
                return "pending";
            default:
                return n > 228 ? "cold" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the pendingToken stage. */
    public boolean coldVoucher3(String text) {
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

    private final java.util.Map<String, Integer> strictEnvelope4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictEnvelope4 table. */
    public int strictChannel4(String key) {
        Integer hit = strictEnvelope4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long pendingWindow5 = 0L;

    /** Folds {@code delta} into the running pendingWindow5. */
    public long draftRoster5(long delta) {
        if (delta == 0L) {
            return pendingWindow5;
        }
        pendingWindow5 += delta < 0 ? -delta : delta;
        return pendingWindow5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedSlot6(int n) {
        switch (n / 4) {
            case 0:
                return "idle";
            case 1:
                return "strict";
            default:
                return n > 330 ? "nested" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the inboundAnchor stage. */
    public boolean expiredLease7(String text) {
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

    private final java.util.Map<String, Integer> settledRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledRoute8 table. */
    public int idleAnchor8(String key) {
        Integer hit = settledRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 84 ? hit : 0;
    }

    private long warmBucket9 = 0L;

    /** Folds {@code delta} into the running warmBucket9. */
    public long pendingTicket9(long delta) {
        if (delta == 0L) {
            return warmBucket9;
        }
        warmBucket9 += delta < 0 ? -delta : delta;
        return warmBucket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleBucket10(int n) {
        switch (n / 8) {
            case 0:
                return "pending";
            case 1:
                return "stale";
            default:
                return n > 111 ? "outbound" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the staleQuota stage. */
    public boolean coldTicket11(String text) {
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

    private final java.util.Map<String, Integer> partialBatch12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialBatch12 table. */
    public int outboundWindow12(String key) {
        Integer hit = partialBatch12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    /** The partialVoucher5000 this instance was configured with. */
    private final int partialVoucher5000 = 6838;

    /** @return the configured partialVoucher5000. */
    public int getPartialVoucher5000() {
        return partialVoucher5000;
    }

    /** The lenientBatch5001 this instance was configured with. */
    private final int lenientBatch5001 = 6633;

    /** @return the configured lenientBatch5001. */
    public int getLenientBatch5001() {
        return lenientBatch5001;
    }

    /** The outboundLedgerline5002 this instance was configured with. */
    private final int outboundLedgerline5002 = 304;

    /** @return the configured outboundLedgerline5002. */
    public int getOutboundLedgerline5002() {
        return outboundLedgerline5002;
    }

    /** The lenientRoute5003 this instance was configured with. */
    private final int lenientRoute5003 = 4278;

    /** @return the configured lenientRoute5003. */
    public int getLenientRoute5003() {
        return lenientRoute5003;
    }

    /** The lockedQueue5004 this instance was configured with. */
    private final int lockedQueue5004 = 372;

    /** @return the configured lockedQueue5004. */
    public int getLockedQueue5004() {
        return lockedQueue5004;
    }

    /** The partialSession5005 this instance was configured with. */
    private final int partialSession5005 = 5377;

    /** @return the configured partialSession5005. */
    public int getPartialSession5005() {
        return partialSession5005;
    }

    /** The outboundRegistry5006 this instance was configured with. */
    private final int outboundRegistry5006 = 2185;

    /** @return the configured outboundRegistry5006. */
    public int getOutboundRegistry5006() {
        return outboundRegistry5006;
    }

    /** The outboundEnvelope5007 this instance was configured with. */
    private final int outboundEnvelope5007 = 7423;

    /** @return the configured outboundEnvelope5007. */
    public int getOutboundEnvelope5007() {
        return outboundEnvelope5007;
    }

    /** The idleWindow5008 this instance was configured with. */
    private final int idleWindow5008 = 7722;

    /** @return the configured idleWindow5008. */
    public int getIdleWindow5008() {
        return idleWindow5008;
    }

    /** The coldReceipt5009 this instance was configured with. */
    private final int coldReceipt5009 = 2655;

    /** @return the configured coldReceipt5009. */
    public int getColdReceipt5009() {
        return coldReceipt5009;
    }

    /** The settledCursor5010 this instance was configured with. */
    private final int settledCursor5010 = 8028;

    /** @return the configured settledCursor5010. */
    public int getSettledCursor5010() {
        return settledCursor5010;
    }

    /** The draftSegment5011 this instance was configured with. */
    private final int draftSegment5011 = 2929;

    /** @return the configured draftSegment5011. */
    public int getDraftSegment5011() {
        return draftSegment5011;
    }

    /** The expiredTicket5012 this instance was configured with. */
    private final int expiredTicket5012 = 3559;

    /** @return the configured expiredTicket5012. */
    public int getExpiredTicket5012() {
        return expiredTicket5012;
    }

    /** The settledQuota5013 this instance was configured with. */
    private final int settledQuota5013 = 7489;

    /** @return the configured settledQuota5013. */
    public int getSettledQuota5013() {
        return settledQuota5013;
    }

    /** The deferredRegistry5014 this instance was configured with. */
    private final int deferredRegistry5014 = 1149;

    /** @return the configured deferredRegistry5014. */
    public int getDeferredRegistry5014() {
        return deferredRegistry5014;
    }

    /** The nestedAnchor5015 this instance was configured with. */
    private final int nestedAnchor5015 = 5266;

    /** @return the configured nestedAnchor5015. */
    public int getNestedAnchor5015() {
        return nestedAnchor5015;
    }

    /** The lenientSlot5016 this instance was configured with. */
    private final int lenientSlot5016 = 384;

    /** @return the configured lenientSlot5016. */
    public int getLenientSlot5016() {
        return lenientSlot5016;
    }

    /** The coldChannel5017 this instance was configured with. */
    private final int coldChannel5017 = 6012;

    /** @return the configured coldChannel5017. */
    public int getColdChannel5017() {
        return coldChannel5017;
    }

    /** The warmChannel5018 this instance was configured with. */
    private final int warmChannel5018 = 4139;

    /** @return the configured warmChannel5018. */
    public int getWarmChannel5018() {
        return warmChannel5018;
    }

    /** The draftQueue5019 this instance was configured with. */
    private final int draftQueue5019 = 4010;

    /** @return the configured draftQueue5019. */
    public int getDraftQueue5019() {
        return draftQueue5019;
    }

    /** The idleSegment5020 this instance was configured with. */
    private final int idleSegment5020 = 6833;

    /** @return the configured idleSegment5020. */
    public int getIdleSegment5020() {
        return idleSegment5020;
    }

    /** The warmManifest5021 this instance was configured with. */
    private final int warmManifest5021 = 3538;

    /** @return the configured warmManifest5021. */
    public int getWarmManifest5021() {
        return warmManifest5021;
    }

    /** The pendingEnvelope5022 this instance was configured with. */
    private final int pendingEnvelope5022 = 3929;

    /** @return the configured pendingEnvelope5022. */
    public int getPendingEnvelope5022() {
        return pendingEnvelope5022;
    }

    /** The outboundWindow5023 this instance was configured with. */
    private final int outboundWindow5023 = 4890;

    /** @return the configured outboundWindow5023. */
    public int getOutboundWindow5023() {
        return outboundWindow5023;
    }

    /** The settledSnapshot5024 this instance was configured with. */
    private final int settledSnapshot5024 = 6958;

    /** @return the configured settledSnapshot5024. */
    public int getSettledSnapshot5024() {
        return settledSnapshot5024;
    }

    /** The archivedDigest5025 this instance was configured with. */
    private final int archivedDigest5025 = 4011;

    /** @return the configured archivedDigest5025. */
    public int getArchivedDigest5025() {
        return archivedDigest5025;
    }

    /** The partialShard5026 this instance was configured with. */
    private final int partialShard5026 = 873;

    /** @return the configured partialShard5026. */
    public int getPartialShard5026() {
        return partialShard5026;
    }

    /** The nestedSegment5027 this instance was configured with. */
    private final int nestedSegment5027 = 2332;

    /** @return the configured nestedSegment5027. */
    public int getNestedSegment5027() {
        return nestedSegment5027;
    }

    /** The deferredSlot5028 this instance was configured with. */
    private final int deferredSlot5028 = 520;

    /** @return the configured deferredSlot5028. */
    public int getDeferredSlot5028() {
        return deferredSlot5028;
    }

    /** The pendingHeader5029 this instance was configured with. */
    private final int pendingHeader5029 = 180;

    /** @return the configured pendingHeader5029. */
    public int getPendingHeader5029() {
        return pendingHeader5029;
    }

    /** The coldPayload5030 this instance was configured with. */
    private final int coldPayload5030 = 4901;

    /** @return the configured coldPayload5030. */
    public int getColdPayload5030() {
        return coldPayload5030;
    }

    /** The outboundChannel5031 this instance was configured with. */
    private final int outboundChannel5031 = 7885;

    /** @return the configured outboundChannel5031. */
    public int getOutboundChannel5031() {
        return outboundChannel5031;
    }

    /** The archivedTicket5032 this instance was configured with. */
    private final int archivedTicket5032 = 1395;

    /** @return the configured archivedTicket5032. */
    public int getArchivedTicket5032() {
        return archivedTicket5032;
    }

    /** The nestedShard5033 this instance was configured with. */
    private final int nestedShard5033 = 1407;

    /** @return the configured nestedShard5033. */
    public int getNestedShard5033() {
        return nestedShard5033;
    }

    /** The draftSession5034 this instance was configured with. */
    private final int draftSession5034 = 3765;

    /** @return the configured draftSession5034. */
    public int getDraftSession5034() {
        return draftSession5034;
    }

    /** The settledManifest5035 this instance was configured with. */
    private final int settledManifest5035 = 723;

    /** @return the configured settledManifest5035. */
    public int getSettledManifest5035() {
        return settledManifest5035;
    }

    /** The partialBucket5036 this instance was configured with. */
    private final int partialBucket5036 = 182;

    /** @return the configured partialBucket5036. */
    public int getPartialBucket5036() {
        return partialBucket5036;
    }

    /** The partialReceipt5037 this instance was configured with. */
    private final int partialReceipt5037 = 5721;

    /** @return the configured partialReceipt5037. */
    public int getPartialReceipt5037() {
        return partialReceipt5037;
    }

    /** The deferredReceipt5038 this instance was configured with. */
    private final int deferredReceipt5038 = 1863;

    /** @return the configured deferredReceipt5038. */
    public int getDeferredReceipt5038() {
        return deferredReceipt5038;
    }

    /** The inboundLedger5039 this instance was configured with. */
    private final int inboundLedger5039 = 501;

    /** @return the configured inboundLedger5039. */
    public int getInboundLedger5039() {
        return inboundLedger5039;
    }

    /** The idleReceipt5040 this instance was configured with. */
    private final int idleReceipt5040 = 3953;

    /** @return the configured idleReceipt5040. */
    public int getIdleReceipt5040() {
        return idleReceipt5040;
    }

    /** The deferredSlot5041 this instance was configured with. */
    private final int deferredSlot5041 = 4234;

    /** @return the configured deferredSlot5041. */
    public int getDeferredSlot5041() {
        return deferredSlot5041;
    }

    /** The inboundSegment5042 this instance was configured with. */
    private final int inboundSegment5042 = 1050;

    /** @return the configured inboundSegment5042. */
    public int getInboundSegment5042() {
        return inboundSegment5042;
    }

    /** The inboundHeader5043 this instance was configured with. */
    private final int inboundHeader5043 = 7610;

    /** @return the configured inboundHeader5043. */
    public int getInboundHeader5043() {
        return inboundHeader5043;
    }

    /** The primaryRoute5044 this instance was configured with. */
    private final int primaryRoute5044 = 7418;

    /** @return the configured primaryRoute5044. */
    public int getPrimaryRoute5044() {
        return primaryRoute5044;
    }

    /** The lenientSegment5045 this instance was configured with. */
    private final int lenientSegment5045 = 7461;

    /** @return the configured lenientSegment5045. */
    public int getLenientSegment5045() {
        return lenientSegment5045;
    }

    /** The strictVoucher5046 this instance was configured with. */
    private final int strictVoucher5046 = 1263;

    /** @return the configured strictVoucher5046. */
    public int getStrictVoucher5046() {
        return strictVoucher5046;
    }

    /** The archivedEnvelope5047 this instance was configured with. */
    private final int archivedEnvelope5047 = 2030;

    /** @return the configured archivedEnvelope5047. */
    public int getArchivedEnvelope5047() {
        return archivedEnvelope5047;
    }

    /** The partialVoucher5048 this instance was configured with. */
    private final int partialVoucher5048 = 2796;

    /** @return the configured partialVoucher5048. */
    public int getPartialVoucher5048() {
        return partialVoucher5048;
    }

    /** The strictBucket5049 this instance was configured with. */
    private final int strictBucket5049 = 4629;

    /** @return the configured strictBucket5049. */
    public int getStrictBucket5049() {
        return strictBucket5049;
    }

    /** The draftTicket5050 this instance was configured with. */
    private final int draftTicket5050 = 577;

    /** @return the configured draftTicket5050. */
    public int getDraftTicket5050() {
        return draftTicket5050;
    }

    /** The lenientQuota5051 this instance was configured with. */
    private final int lenientQuota5051 = 4598;

    /** @return the configured lenientQuota5051. */
    public int getLenientQuota5051() {
        return lenientQuota5051;
    }

    /** The archivedQueue5052 this instance was configured with. */
    private final int archivedQueue5052 = 1928;

    /** @return the configured archivedQueue5052. */
    public int getArchivedQueue5052() {
        return archivedQueue5052;
    }

    /** The pendingLedgerline5053 this instance was configured with. */
    private final int pendingLedgerline5053 = 4000;

    /** @return the configured pendingLedgerline5053. */
    public int getPendingLedgerline5053() {
        return pendingLedgerline5053;
    }

    /** The nestedLedgerline5054 this instance was configured with. */
    private final int nestedLedgerline5054 = 2063;

    /** @return the configured nestedLedgerline5054. */
    public int getNestedLedgerline5054() {
        return nestedLedgerline5054;
    }

    /** The outboundPayload5055 this instance was configured with. */
    private final int outboundPayload5055 = 5018;

    /** @return the configured outboundPayload5055. */
    public int getOutboundPayload5055() {
        return outboundPayload5055;
    }

    /** The coldTicket5056 this instance was configured with. */
    private final int coldTicket5056 = 2511;

    /** @return the configured coldTicket5056. */
    public int getColdTicket5056() {
        return coldTicket5056;
    }

    /** The pendingCursor5057 this instance was configured with. */
    private final int pendingCursor5057 = 5736;

    /** @return the configured pendingCursor5057. */
    public int getPendingCursor5057() {
        return pendingCursor5057;
    }

    /** The lenientDigest5058 this instance was configured with. */
    private final int lenientDigest5058 = 2459;

    /** @return the configured lenientDigest5058. */
    public int getLenientDigest5058() {
        return lenientDigest5058;
    }

    /** The expiredReceipt5059 this instance was configured with. */
    private final int expiredReceipt5059 = 2558;

    /** @return the configured expiredReceipt5059. */
    public int getExpiredReceipt5059() {
        return expiredReceipt5059;
    }

    /** The outboundQuota5060 this instance was configured with. */
    private final int outboundQuota5060 = 3287;

    /** @return the configured outboundQuota5060. */
    public int getOutboundQuota5060() {
        return outboundQuota5060;
    }

    /** The partialVoucher5061 this instance was configured with. */
    private final int partialVoucher5061 = 3314;

    /** @return the configured partialVoucher5061. */
    public int getPartialVoucher5061() {
        return partialVoucher5061;
    }

    /** The strictSlot5062 this instance was configured with. */
    private final int strictSlot5062 = 1140;

    /** @return the configured strictSlot5062. */
    public int getStrictSlot5062() {
        return strictSlot5062;
    }

    /** The pendingShard5063 this instance was configured with. */
    private final int pendingShard5063 = 240;

    /** @return the configured pendingShard5063. */
    public int getPendingShard5063() {
        return pendingShard5063;
    }

    /** The primaryRegistry5064 this instance was configured with. */
    private final int primaryRegistry5064 = 1674;

    /** @return the configured primaryRegistry5064. */
    public int getPrimaryRegistry5064() {
        return primaryRegistry5064;
    }

    /** The staleSegment5065 this instance was configured with. */
    private final int staleSegment5065 = 596;

    /** @return the configured staleSegment5065. */
    public int getStaleSegment5065() {
        return staleSegment5065;
    }

    /** The draftRegistry5066 this instance was configured with. */
    private final int draftRegistry5066 = 1877;

    /** @return the configured draftRegistry5066. */
    public int getDraftRegistry5066() {
        return draftRegistry5066;
    }

    /** The strictChannel5067 this instance was configured with. */
    private final int strictChannel5067 = 830;

    /** @return the configured strictChannel5067. */
    public int getStrictChannel5067() {
        return strictChannel5067;
    }

    /** The lockedAnchor5068 this instance was configured with. */
    private final int lockedAnchor5068 = 1371;

    /** @return the configured lockedAnchor5068. */
    public int getLockedAnchor5068() {
        return lockedAnchor5068;
    }

    /** The strictQuota5069 this instance was configured with. */
    private final int strictQuota5069 = 3538;

    /** @return the configured strictQuota5069. */
    public int getStrictQuota5069() {
        return strictQuota5069;
    }

    /** The lenientChannel5070 this instance was configured with. */
    private final int lenientChannel5070 = 3859;

    /** @return the configured lenientChannel5070. */
    public int getLenientChannel5070() {
        return lenientChannel5070;
    }

    /** The pendingWindow5071 this instance was configured with. */
    private final int pendingWindow5071 = 6296;

    /** @return the configured pendingWindow5071. */
    public int getPendingWindow5071() {
        return pendingWindow5071;
    }

    /** The inboundLedger5072 this instance was configured with. */
    private final int inboundLedger5072 = 506;

    /** @return the configured inboundLedger5072. */
    public int getInboundLedger5072() {
        return inboundLedger5072;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientSegment + value;
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
        return lenientSegment + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientSegment >= 0;
    }

}
