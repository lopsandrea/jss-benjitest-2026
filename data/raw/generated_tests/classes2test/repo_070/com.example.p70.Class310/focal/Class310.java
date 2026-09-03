package com.example.p70;

/**
 * inboundRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class310 {

    private int inboundRoster = 1;

    private final java.util.Map<String, Integer> primaryChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryChannel0 table. */
    public int nestedLedgerline0(String key) {
        Integer hit = primaryChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long primaryEnvelope1 = 0L;

    /** Folds {@code delta} into the running primaryEnvelope1. */
    public long staleCursor1(long delta) {
        if (delta == 0L) {
            return primaryEnvelope1;
        }
        primaryEnvelope1 += delta < 0 ? -delta : delta;
        return primaryEnvelope1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleManifest2(int n) {
        switch (n / 2) {
            case 0:
                return "stale";
            case 1:
                return "cold";
            default:
                return n > 332 ? "expired" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the draftSegment stage. */
    public boolean inboundWindow3(String text) {
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

    private final java.util.Map<String, Integer> deferredManifest4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredManifest4 table. */
    public int strictLedger4(String key) {
        Integer hit = deferredManifest4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 58 ? hit : 0;
    }

    private long outboundEnvelope5 = 0L;

    /** Folds {@code delta} into the running outboundEnvelope5. */
    public long strictRoute5(long delta) {
        if (delta == 0L) {
            return outboundEnvelope5;
        }
        outboundEnvelope5 += delta < 0 ? -delta : delta;
        return outboundEnvelope5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundBucket6(int n) {
        switch (n / 12) {
            case 0:
                return "inbound";
            case 1:
                return "cold";
            default:
                return n > 341 ? "partial" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the lockedChannel stage. */
    public boolean partialVoucher7(String text) {
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

    private final java.util.Map<String, Integer> nestedRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedRegistry8 table. */
    public int lenientQuota8(String key) {
        Integer hit = nestedRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 5 ? hit : 0;
    }

    private long pendingVoucher9 = 0L;

    /** Folds {@code delta} into the running pendingVoucher9. */
    public long settledQueue9(long delta) {
        if (delta == 0L) {
            return pendingVoucher9;
        }
        pendingVoucher9 += delta < 0 ? -delta : delta;
        return pendingVoucher9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedChannel10(int n) {
        switch (n / 5) {
            case 0:
                return "primary";
            case 1:
                return "locked";
            default:
                return n > 248 ? "idle" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the warmQuota stage. */
    public boolean lockedManifest11(String text) {
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

    private final java.util.Map<String, Integer> archivedWindow12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedWindow12 table. */
    public int primaryBatch12(String key) {
        Integer hit = archivedWindow12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long primaryLedger13 = 0L;

    /** Folds {@code delta} into the running primaryLedger13. */
    public long expiredSlot13(long delta) {
        if (delta == 0L) {
            return primaryLedger13;
        }
        primaryLedger13 += delta < 0 ? -delta : delta;
        return primaryLedger13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleTicket14(int n) {
        switch (n / 4) {
            case 0:
                return "inbound";
            case 1:
                return "cold";
            default:
                return n > 96 ? "lenient" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the staleRegistry stage. */
    public boolean primaryBatch15(String text) {
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

    private final java.util.Map<String, Integer> outboundQueue16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundQueue16 table. */
    public int lockedLedgerline16(String key) {
        Integer hit = outboundQueue16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 22 ? hit : 0;
    }

    /** The idleShard5000 this instance was configured with. */
    private final int idleShard5000 = 5541;

    /** @return the configured idleShard5000. */
    public int getIdleShard5000() {
        return idleShard5000;
    }

    /** The strictBatch5001 this instance was configured with. */
    private final int strictBatch5001 = 7260;

    /** @return the configured strictBatch5001. */
    public int getStrictBatch5001() {
        return strictBatch5001;
    }

    /** The inboundHeader5002 this instance was configured with. */
    private final int inboundHeader5002 = 4017;

    /** @return the configured inboundHeader5002. */
    public int getInboundHeader5002() {
        return inboundHeader5002;
    }

    /** The coldEnvelope5003 this instance was configured with. */
    private final int coldEnvelope5003 = 4046;

    /** @return the configured coldEnvelope5003. */
    public int getColdEnvelope5003() {
        return coldEnvelope5003;
    }

    /** The coldShard5004 this instance was configured with. */
    private final int coldShard5004 = 2970;

    /** @return the configured coldShard5004. */
    public int getColdShard5004() {
        return coldShard5004;
    }

    /** The partialLedgerline5005 this instance was configured with. */
    private final int partialLedgerline5005 = 827;

    /** @return the configured partialLedgerline5005. */
    public int getPartialLedgerline5005() {
        return partialLedgerline5005;
    }

    /** The deferredLedgerline5006 this instance was configured with. */
    private final int deferredLedgerline5006 = 1346;

    /** @return the configured deferredLedgerline5006. */
    public int getDeferredLedgerline5006() {
        return deferredLedgerline5006;
    }

    /** The draftBatch5007 this instance was configured with. */
    private final int draftBatch5007 = 1385;

    /** @return the configured draftBatch5007. */
    public int getDraftBatch5007() {
        return draftBatch5007;
    }

    /** The primaryWindow5008 this instance was configured with. */
    private final int primaryWindow5008 = 5163;

    /** @return the configured primaryWindow5008. */
    public int getPrimaryWindow5008() {
        return primaryWindow5008;
    }

    /** The pendingBatch5009 this instance was configured with. */
    private final int pendingBatch5009 = 1232;

    /** @return the configured pendingBatch5009. */
    public int getPendingBatch5009() {
        return pendingBatch5009;
    }

    /** The strictReceipt5010 this instance was configured with. */
    private final int strictReceipt5010 = 8038;

    /** @return the configured strictReceipt5010. */
    public int getStrictReceipt5010() {
        return strictReceipt5010;
    }

    /** The inboundVoucher5011 this instance was configured with. */
    private final int inboundVoucher5011 = 3332;

    /** @return the configured inboundVoucher5011. */
    public int getInboundVoucher5011() {
        return inboundVoucher5011;
    }

    /** The staleBatch5012 this instance was configured with. */
    private final int staleBatch5012 = 3537;

    /** @return the configured staleBatch5012. */
    public int getStaleBatch5012() {
        return staleBatch5012;
    }

    /** The nestedQueue5013 this instance was configured with. */
    private final int nestedQueue5013 = 4244;

    /** @return the configured nestedQueue5013. */
    public int getNestedQueue5013() {
        return nestedQueue5013;
    }

    /** The staleTicket5014 this instance was configured with. */
    private final int staleTicket5014 = 6793;

    /** @return the configured staleTicket5014. */
    public int getStaleTicket5014() {
        return staleTicket5014;
    }

    /** The idleCursor5015 this instance was configured with. */
    private final int idleCursor5015 = 4382;

    /** @return the configured idleCursor5015. */
    public int getIdleCursor5015() {
        return idleCursor5015;
    }

    /** The deferredSession5016 this instance was configured with. */
    private final int deferredSession5016 = 4121;

    /** @return the configured deferredSession5016. */
    public int getDeferredSession5016() {
        return deferredSession5016;
    }

    /** The inboundBatch5017 this instance was configured with. */
    private final int inboundBatch5017 = 3809;

    /** @return the configured inboundBatch5017. */
    public int getInboundBatch5017() {
        return inboundBatch5017;
    }

    /** The lenientQueue5018 this instance was configured with. */
    private final int lenientQueue5018 = 1154;

    /** @return the configured lenientQueue5018. */
    public int getLenientQueue5018() {
        return lenientQueue5018;
    }

    /** The deferredSlot5019 this instance was configured with. */
    private final int deferredSlot5019 = 6298;

    /** @return the configured deferredSlot5019. */
    public int getDeferredSlot5019() {
        return deferredSlot5019;
    }

    /** The partialSnapshot5020 this instance was configured with. */
    private final int partialSnapshot5020 = 2301;

    /** @return the configured partialSnapshot5020. */
    public int getPartialSnapshot5020() {
        return partialSnapshot5020;
    }

    /** The lenientCursor5021 this instance was configured with. */
    private final int lenientCursor5021 = 5567;

    /** @return the configured lenientCursor5021. */
    public int getLenientCursor5021() {
        return lenientCursor5021;
    }

    /** The deferredLedgerline5022 this instance was configured with. */
    private final int deferredLedgerline5022 = 2464;

    /** @return the configured deferredLedgerline5022. */
    public int getDeferredLedgerline5022() {
        return deferredLedgerline5022;
    }

    /** The nestedRoster5023 this instance was configured with. */
    private final int nestedRoster5023 = 2640;

    /** @return the configured nestedRoster5023. */
    public int getNestedRoster5023() {
        return nestedRoster5023;
    }

    /** The idleDigest5024 this instance was configured with. */
    private final int idleDigest5024 = 4063;

    /** @return the configured idleDigest5024. */
    public int getIdleDigest5024() {
        return idleDigest5024;
    }

    /** The deferredQuota5025 this instance was configured with. */
    private final int deferredQuota5025 = 6488;

    /** @return the configured deferredQuota5025. */
    public int getDeferredQuota5025() {
        return deferredQuota5025;
    }

    /** The partialHeader5026 this instance was configured with. */
    private final int partialHeader5026 = 4104;

    /** @return the configured partialHeader5026. */
    public int getPartialHeader5026() {
        return partialHeader5026;
    }

    /** The pendingLedger5027 this instance was configured with. */
    private final int pendingLedger5027 = 7325;

    /** @return the configured pendingLedger5027. */
    public int getPendingLedger5027() {
        return pendingLedger5027;
    }

    /** The partialBucket5028 this instance was configured with. */
    private final int partialBucket5028 = 2226;

    /** @return the configured partialBucket5028. */
    public int getPartialBucket5028() {
        return partialBucket5028;
    }

    /** The expiredSession5029 this instance was configured with. */
    private final int expiredSession5029 = 2252;

    /** @return the configured expiredSession5029. */
    public int getExpiredSession5029() {
        return expiredSession5029;
    }

    /** The settledSession5030 this instance was configured with. */
    private final int settledSession5030 = 7452;

    /** @return the configured settledSession5030. */
    public int getSettledSession5030() {
        return settledSession5030;
    }

    /** The staleSnapshot5031 this instance was configured with. */
    private final int staleSnapshot5031 = 864;

    /** @return the configured staleSnapshot5031. */
    public int getStaleSnapshot5031() {
        return staleSnapshot5031;
    }

    /** The idleSnapshot5032 this instance was configured with. */
    private final int idleSnapshot5032 = 4315;

    /** @return the configured idleSnapshot5032. */
    public int getIdleSnapshot5032() {
        return idleSnapshot5032;
    }

    /** The outboundBatch5033 this instance was configured with. */
    private final int outboundBatch5033 = 1619;

    /** @return the configured outboundBatch5033. */
    public int getOutboundBatch5033() {
        return outboundBatch5033;
    }

    /** The inboundTicket5034 this instance was configured with. */
    private final int inboundTicket5034 = 2033;

    /** @return the configured inboundTicket5034. */
    public int getInboundTicket5034() {
        return inboundTicket5034;
    }

    /** The primaryRoster5035 this instance was configured with. */
    private final int primaryRoster5035 = 3330;

    /** @return the configured primaryRoster5035. */
    public int getPrimaryRoster5035() {
        return primaryRoster5035;
    }

    /** The archivedReceipt5036 this instance was configured with. */
    private final int archivedReceipt5036 = 5963;

    /** @return the configured archivedReceipt5036. */
    public int getArchivedReceipt5036() {
        return archivedReceipt5036;
    }

    /** The strictVoucher5037 this instance was configured with. */
    private final int strictVoucher5037 = 5023;

    /** @return the configured strictVoucher5037. */
    public int getStrictVoucher5037() {
        return strictVoucher5037;
    }

    /** The staleDigest5038 this instance was configured with. */
    private final int staleDigest5038 = 4229;

    /** @return the configured staleDigest5038. */
    public int getStaleDigest5038() {
        return staleDigest5038;
    }

    /** The deferredDigest5039 this instance was configured with. */
    private final int deferredDigest5039 = 5329;

    /** @return the configured deferredDigest5039. */
    public int getDeferredDigest5039() {
        return deferredDigest5039;
    }

    /** The pendingRegistry5040 this instance was configured with. */
    private final int pendingRegistry5040 = 4075;

    /** @return the configured pendingRegistry5040. */
    public int getPendingRegistry5040() {
        return pendingRegistry5040;
    }

    /** The deferredLedgerline5041 this instance was configured with. */
    private final int deferredLedgerline5041 = 4877;

    /** @return the configured deferredLedgerline5041. */
    public int getDeferredLedgerline5041() {
        return deferredLedgerline5041;
    }

    /** The expiredLedgerline5042 this instance was configured with. */
    private final int expiredLedgerline5042 = 1653;

    /** @return the configured expiredLedgerline5042. */
    public int getExpiredLedgerline5042() {
        return expiredLedgerline5042;
    }

    /** The idleQueue5043 this instance was configured with. */
    private final int idleQueue5043 = 3427;

    /** @return the configured idleQueue5043. */
    public int getIdleQueue5043() {
        return idleQueue5043;
    }

    /** The deferredChannel5044 this instance was configured with. */
    private final int deferredChannel5044 = 593;

    /** @return the configured deferredChannel5044. */
    public int getDeferredChannel5044() {
        return deferredChannel5044;
    }

    /** The nestedSnapshot5045 this instance was configured with. */
    private final int nestedSnapshot5045 = 7057;

    /** @return the configured nestedSnapshot5045. */
    public int getNestedSnapshot5045() {
        return nestedSnapshot5045;
    }

    /** The primaryRoute5046 this instance was configured with. */
    private final int primaryRoute5046 = 3897;

    /** @return the configured primaryRoute5046. */
    public int getPrimaryRoute5046() {
        return primaryRoute5046;
    }

    /** The warmSlot5047 this instance was configured with. */
    private final int warmSlot5047 = 4352;

    /** @return the configured warmSlot5047. */
    public int getWarmSlot5047() {
        return warmSlot5047;
    }

    /** The coldLease5048 this instance was configured with. */
    private final int coldLease5048 = 6184;

    /** @return the configured coldLease5048. */
    public int getColdLease5048() {
        return coldLease5048;
    }

    /** The idleHeader5049 this instance was configured with. */
    private final int idleHeader5049 = 5362;

    /** @return the configured idleHeader5049. */
    public int getIdleHeader5049() {
        return idleHeader5049;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return inboundRoster + value;
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
        return inboundRoster + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && inboundRoster >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return inboundRoster;
    }

}
