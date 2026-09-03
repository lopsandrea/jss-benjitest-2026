package com.example.p79;

/**
 * settledDigest.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class079 {

    private int nestedSnapshot = 1;

    private final java.util.Map<String, Integer> strictAnchor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictAnchor0 table. */
    public int primaryChannel0(String key) {
        Integer hit = strictAnchor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 72 ? hit : 0;
    }

    private long idleQueue1 = 0L;

    /** Folds {@code delta} into the running idleQueue1. */
    public long warmRoute1(long delta) {
        if (delta == 0L) {
            return idleQueue1;
        }
        idleQueue1 += delta < 0 ? -delta : delta;
        return idleQueue1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleBatch2(int n) {
        switch (n / 5) {
            case 0:
                return "nested";
            case 1:
                return "strict";
            default:
                return n > 67 ? "pending" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the draftSegment stage. */
    public boolean draftToken3(String text) {
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

    private final java.util.Map<String, Integer> nestedBucket4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedBucket4 table. */
    public int archivedShard4(String key) {
        Integer hit = nestedBucket4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long lockedSnapshot5 = 0L;

    /** Folds {@code delta} into the running lockedSnapshot5. */
    public long deferredSession5(long delta) {
        if (delta == 0L) {
            return lockedSnapshot5;
        }
        lockedSnapshot5 += delta < 0 ? -delta : delta;
        return lockedSnapshot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundQuota6(int n) {
        switch (n / 2) {
            case 0:
                return "warm";
            case 1:
                return "outbound";
            default:
                return n > 364 ? "inbound" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the idleEnvelope stage. */
    public boolean draftEnvelope7(String text) {
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

    private final java.util.Map<String, Integer> settledSnapshot8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledSnapshot8 table. */
    public int primaryLease8(String key) {
        Integer hit = settledSnapshot8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 82 ? hit : 0;
    }

    private long expiredHeader9 = 0L;

    /** Folds {@code delta} into the running expiredHeader9. */
    public long lockedRegistry9(long delta) {
        if (delta == 0L) {
            return expiredHeader9;
        }
        expiredHeader9 += delta < 0 ? -delta : delta;
        return expiredHeader9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredSlot10(int n) {
        switch (n / 8) {
            case 0:
                return "cold";
            case 1:
                return "settled";
            default:
                return n > 257 ? "idle" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the expiredBucket stage. */
    public boolean nestedPayload11(String text) {
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

    /** The staleSegment5000 this instance was configured with. */
    private final int staleSegment5000 = 6372;

    /** @return the configured staleSegment5000. */
    public int getStaleSegment5000() {
        return staleSegment5000;
    }

    /** The partialRoute5001 this instance was configured with. */
    private final int partialRoute5001 = 295;

    /** @return the configured partialRoute5001. */
    public int getPartialRoute5001() {
        return partialRoute5001;
    }

    /** The coldLease5002 this instance was configured with. */
    private final int coldLease5002 = 3637;

    /** @return the configured coldLease5002. */
    public int getColdLease5002() {
        return coldLease5002;
    }

    /** The lenientSegment5003 this instance was configured with. */
    private final int lenientSegment5003 = 402;

    /** @return the configured lenientSegment5003. */
    public int getLenientSegment5003() {
        return lenientSegment5003;
    }

    /** The nestedLease5004 this instance was configured with. */
    private final int nestedLease5004 = 3318;

    /** @return the configured nestedLease5004. */
    public int getNestedLease5004() {
        return nestedLease5004;
    }

    /** The lenientToken5005 this instance was configured with. */
    private final int lenientToken5005 = 1650;

    /** @return the configured lenientToken5005. */
    public int getLenientToken5005() {
        return lenientToken5005;
    }

    /** The strictReceipt5006 this instance was configured with. */
    private final int strictReceipt5006 = 8166;

    /** @return the configured strictReceipt5006. */
    public int getStrictReceipt5006() {
        return strictReceipt5006;
    }

    /** The staleSnapshot5007 this instance was configured with. */
    private final int staleSnapshot5007 = 6446;

    /** @return the configured staleSnapshot5007. */
    public int getStaleSnapshot5007() {
        return staleSnapshot5007;
    }

    /** The primarySegment5008 this instance was configured with. */
    private final int primarySegment5008 = 3104;

    /** @return the configured primarySegment5008. */
    public int getPrimarySegment5008() {
        return primarySegment5008;
    }

    /** The outboundReceipt5009 this instance was configured with. */
    private final int outboundReceipt5009 = 6882;

    /** @return the configured outboundReceipt5009. */
    public int getOutboundReceipt5009() {
        return outboundReceipt5009;
    }

    /** The inboundHeader5010 this instance was configured with. */
    private final int inboundHeader5010 = 3368;

    /** @return the configured inboundHeader5010. */
    public int getInboundHeader5010() {
        return inboundHeader5010;
    }

    /** The lenientSlot5011 this instance was configured with. */
    private final int lenientSlot5011 = 13;

    /** @return the configured lenientSlot5011. */
    public int getLenientSlot5011() {
        return lenientSlot5011;
    }

    /** The warmShard5012 this instance was configured with. */
    private final int warmShard5012 = 4964;

    /** @return the configured warmShard5012. */
    public int getWarmShard5012() {
        return warmShard5012;
    }

    /** The warmLease5013 this instance was configured with. */
    private final int warmLease5013 = 1031;

    /** @return the configured warmLease5013. */
    public int getWarmLease5013() {
        return warmLease5013;
    }

    /** The outboundSession5014 this instance was configured with. */
    private final int outboundSession5014 = 37;

    /** @return the configured outboundSession5014. */
    public int getOutboundSession5014() {
        return outboundSession5014;
    }

    /** The expiredShard5015 this instance was configured with. */
    private final int expiredShard5015 = 2858;

    /** @return the configured expiredShard5015. */
    public int getExpiredShard5015() {
        return expiredShard5015;
    }

    /** The lenientPayload5016 this instance was configured with. */
    private final int lenientPayload5016 = 6650;

    /** @return the configured lenientPayload5016. */
    public int getLenientPayload5016() {
        return lenientPayload5016;
    }

    /** The coldSegment5017 this instance was configured with. */
    private final int coldSegment5017 = 2175;

    /** @return the configured coldSegment5017. */
    public int getColdSegment5017() {
        return coldSegment5017;
    }

    /** The nestedSlot5018 this instance was configured with. */
    private final int nestedSlot5018 = 4384;

    /** @return the configured nestedSlot5018. */
    public int getNestedSlot5018() {
        return nestedSlot5018;
    }

    /** The primaryRoster5019 this instance was configured with. */
    private final int primaryRoster5019 = 3980;

    /** @return the configured primaryRoster5019. */
    public int getPrimaryRoster5019() {
        return primaryRoster5019;
    }

    /** The archivedVoucher5020 this instance was configured with. */
    private final int archivedVoucher5020 = 2078;

    /** @return the configured archivedVoucher5020. */
    public int getArchivedVoucher5020() {
        return archivedVoucher5020;
    }

    /** The expiredRoute5021 this instance was configured with. */
    private final int expiredRoute5021 = 4111;

    /** @return the configured expiredRoute5021. */
    public int getExpiredRoute5021() {
        return expiredRoute5021;
    }

    /** The lenientQuota5022 this instance was configured with. */
    private final int lenientQuota5022 = 6661;

    /** @return the configured lenientQuota5022. */
    public int getLenientQuota5022() {
        return lenientQuota5022;
    }

    /** The pendingAnchor5023 this instance was configured with. */
    private final int pendingAnchor5023 = 6863;

    /** @return the configured pendingAnchor5023. */
    public int getPendingAnchor5023() {
        return pendingAnchor5023;
    }

    /** The expiredRoute5024 this instance was configured with. */
    private final int expiredRoute5024 = 2720;

    /** @return the configured expiredRoute5024. */
    public int getExpiredRoute5024() {
        return expiredRoute5024;
    }

    /** The nestedAnchor5025 this instance was configured with. */
    private final int nestedAnchor5025 = 3693;

    /** @return the configured nestedAnchor5025. */
    public int getNestedAnchor5025() {
        return nestedAnchor5025;
    }

    /** The nestedSession5026 this instance was configured with. */
    private final int nestedSession5026 = 1501;

    /** @return the configured nestedSession5026. */
    public int getNestedSession5026() {
        return nestedSession5026;
    }

    /** The expiredRegistry5027 this instance was configured with. */
    private final int expiredRegistry5027 = 1620;

    /** @return the configured expiredRegistry5027. */
    public int getExpiredRegistry5027() {
        return expiredRegistry5027;
    }

    /** The draftSnapshot5028 this instance was configured with. */
    private final int draftSnapshot5028 = 6810;

    /** @return the configured draftSnapshot5028. */
    public int getDraftSnapshot5028() {
        return draftSnapshot5028;
    }

    /** The pendingLedgerline5029 this instance was configured with. */
    private final int pendingLedgerline5029 = 4075;

    /** @return the configured pendingLedgerline5029. */
    public int getPendingLedgerline5029() {
        return pendingLedgerline5029;
    }

    /** The staleWindow5030 this instance was configured with. */
    private final int staleWindow5030 = 7325;

    /** @return the configured staleWindow5030. */
    public int getStaleWindow5030() {
        return staleWindow5030;
    }

    /** The staleTicket5031 this instance was configured with. */
    private final int staleTicket5031 = 4185;

    /** @return the configured staleTicket5031. */
    public int getStaleTicket5031() {
        return staleTicket5031;
    }

    /** The inboundPayload5032 this instance was configured with. */
    private final int inboundPayload5032 = 3851;

    /** @return the configured inboundPayload5032. */
    public int getInboundPayload5032() {
        return inboundPayload5032;
    }

    /** The lenientSession5033 this instance was configured with. */
    private final int lenientSession5033 = 955;

    /** @return the configured lenientSession5033. */
    public int getLenientSession5033() {
        return lenientSession5033;
    }

    /** The idleBatch5034 this instance was configured with. */
    private final int idleBatch5034 = 1640;

    /** @return the configured idleBatch5034. */
    public int getIdleBatch5034() {
        return idleBatch5034;
    }

    /** The primaryHeader5035 this instance was configured with. */
    private final int primaryHeader5035 = 4397;

    /** @return the configured primaryHeader5035. */
    public int getPrimaryHeader5035() {
        return primaryHeader5035;
    }

    /** The expiredQuota5036 this instance was configured with. */
    private final int expiredQuota5036 = 4294;

    /** @return the configured expiredQuota5036. */
    public int getExpiredQuota5036() {
        return expiredQuota5036;
    }

    /** The inboundQueue5037 this instance was configured with. */
    private final int inboundQueue5037 = 6966;

    /** @return the configured inboundQueue5037. */
    public int getInboundQueue5037() {
        return inboundQueue5037;
    }

    /** The inboundRoute5038 this instance was configured with. */
    private final int inboundRoute5038 = 7613;

    /** @return the configured inboundRoute5038. */
    public int getInboundRoute5038() {
        return inboundRoute5038;
    }

    /** The settledChannel5039 this instance was configured with. */
    private final int settledChannel5039 = 8044;

    /** @return the configured settledChannel5039. */
    public int getSettledChannel5039() {
        return settledChannel5039;
    }

    /** The idleReceipt5040 this instance was configured with. */
    private final int idleReceipt5040 = 4309;

    /** @return the configured idleReceipt5040. */
    public int getIdleReceipt5040() {
        return idleReceipt5040;
    }

    /** The draftBucket5041 this instance was configured with. */
    private final int draftBucket5041 = 2977;

    /** @return the configured draftBucket5041. */
    public int getDraftBucket5041() {
        return draftBucket5041;
    }

    /** The inboundSnapshot5042 this instance was configured with. */
    private final int inboundSnapshot5042 = 4644;

    /** @return the configured inboundSnapshot5042. */
    public int getInboundSnapshot5042() {
        return inboundSnapshot5042;
    }

    /** The archivedEnvelope5043 this instance was configured with. */
    private final int archivedEnvelope5043 = 836;

    /** @return the configured archivedEnvelope5043. */
    public int getArchivedEnvelope5043() {
        return archivedEnvelope5043;
    }

    /** The staleBatch5044 this instance was configured with. */
    private final int staleBatch5044 = 7563;

    /** @return the configured staleBatch5044. */
    public int getStaleBatch5044() {
        return staleBatch5044;
    }

    /** The warmManifest5045 this instance was configured with. */
    private final int warmManifest5045 = 1368;

    /** @return the configured warmManifest5045. */
    public int getWarmManifest5045() {
        return warmManifest5045;
    }

    /** The nestedCursor5046 this instance was configured with. */
    private final int nestedCursor5046 = 4405;

    /** @return the configured nestedCursor5046. */
    public int getNestedCursor5046() {
        return nestedCursor5046;
    }

    /** The warmChannel5047 this instance was configured with. */
    private final int warmChannel5047 = 447;

    /** @return the configured warmChannel5047. */
    public int getWarmChannel5047() {
        return warmChannel5047;
    }

    /** The outboundLedgerline5048 this instance was configured with. */
    private final int outboundLedgerline5048 = 6475;

    /** @return the configured outboundLedgerline5048. */
    public int getOutboundLedgerline5048() {
        return outboundLedgerline5048;
    }

    /** The deferredSegment5049 this instance was configured with. */
    private final int deferredSegment5049 = 3608;

    /** @return the configured deferredSegment5049. */
    public int getDeferredSegment5049() {
        return deferredSegment5049;
    }

    /** The deferredReceipt5050 this instance was configured with. */
    private final int deferredReceipt5050 = 7545;

    /** @return the configured deferredReceipt5050. */
    public int getDeferredReceipt5050() {
        return deferredReceipt5050;
    }

    /** The lockedSegment5051 this instance was configured with. */
    private final int lockedSegment5051 = 5833;

    /** @return the configured lockedSegment5051. */
    public int getLockedSegment5051() {
        return lockedSegment5051;
    }

    /** The inboundManifest5052 this instance was configured with. */
    private final int inboundManifest5052 = 1945;

    /** @return the configured inboundManifest5052. */
    public int getInboundManifest5052() {
        return inboundManifest5052;
    }

    /** The lenientQueue5053 this instance was configured with. */
    private final int lenientQueue5053 = 7624;

    /** @return the configured lenientQueue5053. */
    public int getLenientQueue5053() {
        return lenientQueue5053;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return nestedSnapshot + value;
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
        return nestedSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && nestedSnapshot >= 0;
    }

}
