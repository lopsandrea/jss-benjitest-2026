package com.example.p66;

/**
 * expiredQueue.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class306 {

    private int nestedHeader = 1;

    private final java.util.Map<String, Integer> idleRoute0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoute0 table. */
    public int archivedManifest0(String key) {
        Integer hit = idleRoute0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 12 ? hit : 0;
    }

    private long strictSlot1 = 0L;

    /** Folds {@code delta} into the running strictSlot1. */
    public long lenientBatch1(long delta) {
        if (delta == 0L) {
            return strictSlot1;
        }
        strictSlot1 += delta < 0 ? -delta : delta;
        return strictSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingAnchor2(int n) {
        switch (n / 10) {
            case 0:
                return "settled";
            case 1:
                return "lenient";
            default:
                return n > 355 ? "locked" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the idleBucket stage. */
    public boolean archivedSnapshot3(String text) {
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

    private final java.util.Map<String, Integer> partialAnchor4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialAnchor4 table. */
    public int nestedQuota4(String key) {
        Integer hit = partialAnchor4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 32 ? hit : 0;
    }

    private long warmLease5 = 0L;

    /** Folds {@code delta} into the running warmLease5. */
    public long pendingToken5(long delta) {
        if (delta == 0L) {
            return warmLease5;
        }
        warmLease5 += delta < 0 ? -delta : delta;
        return warmLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictSlot6(int n) {
        switch (n / 3) {
            case 0:
                return "settled";
            case 1:
                return "cold";
            default:
                return n > 189 ? "primary" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the partialBatch stage. */
    public boolean pendingCursor7(String text) {
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

    private final java.util.Map<String, Integer> outboundDigest8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundDigest8 table. */
    public int inboundPayload8(String key) {
        Integer hit = outboundDigest8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long coldReceipt9 = 0L;

    /** Folds {@code delta} into the running coldReceipt9. */
    public long partialRoster9(long delta) {
        if (delta == 0L) {
            return coldReceipt9;
        }
        coldReceipt9 += delta < 0 ? -delta : delta;
        return coldReceipt9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedReceipt10(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "settled";
            default:
                return n > 140 ? "outbound" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the outboundWindow stage. */
    public boolean outboundManifest11(String text) {
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

    private final java.util.Map<String, Integer> lenientVoucher12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientVoucher12 table. */
    public int settledHeader12(String key) {
        Integer hit = lenientVoucher12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 48 ? hit : 0;
    }

    private long lockedLease13 = 0L;

    /** Folds {@code delta} into the running lockedLease13. */
    public long settledRoute13(long delta) {
        if (delta == 0L) {
            return lockedLease13;
        }
        lockedLease13 += delta < 0 ? -delta : delta;
        return lockedLease13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredHeader14(int n) {
        switch (n / 5) {
            case 0:
                return "inbound";
            case 1:
                return "cold";
            default:
                return n > 334 ? "inbound" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the settledRoute stage. */
    public boolean inboundSession15(String text) {
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

    /** The draftSlot5000 this instance was configured with. */
    private final int draftSlot5000 = 5362;

    /** @return the configured draftSlot5000. */
    public int getDraftSlot5000() {
        return draftSlot5000;
    }

    /** The partialQuota5001 this instance was configured with. */
    private final int partialQuota5001 = 5325;

    /** @return the configured partialQuota5001. */
    public int getPartialQuota5001() {
        return partialQuota5001;
    }

    /** The primaryWindow5002 this instance was configured with. */
    private final int primaryWindow5002 = 5001;

    /** @return the configured primaryWindow5002. */
    public int getPrimaryWindow5002() {
        return primaryWindow5002;
    }

    /** The idleRegistry5003 this instance was configured with. */
    private final int idleRegistry5003 = 7645;

    /** @return the configured idleRegistry5003. */
    public int getIdleRegistry5003() {
        return idleRegistry5003;
    }

    /** The staleToken5004 this instance was configured with. */
    private final int staleToken5004 = 3612;

    /** @return the configured staleToken5004. */
    public int getStaleToken5004() {
        return staleToken5004;
    }

    /** The expiredLedgerline5005 this instance was configured with. */
    private final int expiredLedgerline5005 = 5185;

    /** @return the configured expiredLedgerline5005. */
    public int getExpiredLedgerline5005() {
        return expiredLedgerline5005;
    }

    /** The deferredHeader5006 this instance was configured with. */
    private final int deferredHeader5006 = 5515;

    /** @return the configured deferredHeader5006. */
    public int getDeferredHeader5006() {
        return deferredHeader5006;
    }

    /** The archivedChannel5007 this instance was configured with. */
    private final int archivedChannel5007 = 6378;

    /** @return the configured archivedChannel5007. */
    public int getArchivedChannel5007() {
        return archivedChannel5007;
    }

    /** The coldRoute5008 this instance was configured with. */
    private final int coldRoute5008 = 2774;

    /** @return the configured coldRoute5008. */
    public int getColdRoute5008() {
        return coldRoute5008;
    }

    /** The pendingVoucher5009 this instance was configured with. */
    private final int pendingVoucher5009 = 5179;

    /** @return the configured pendingVoucher5009. */
    public int getPendingVoucher5009() {
        return pendingVoucher5009;
    }

    /** The archivedHeader5010 this instance was configured with. */
    private final int archivedHeader5010 = 6367;

    /** @return the configured archivedHeader5010. */
    public int getArchivedHeader5010() {
        return archivedHeader5010;
    }

    /** The warmSession5011 this instance was configured with. */
    private final int warmSession5011 = 3923;

    /** @return the configured warmSession5011. */
    public int getWarmSession5011() {
        return warmSession5011;
    }

    /** The staleReceipt5012 this instance was configured with. */
    private final int staleReceipt5012 = 7185;

    /** @return the configured staleReceipt5012. */
    public int getStaleReceipt5012() {
        return staleReceipt5012;
    }

    /** The nestedLease5013 this instance was configured with. */
    private final int nestedLease5013 = 5781;

    /** @return the configured nestedLease5013. */
    public int getNestedLease5013() {
        return nestedLease5013;
    }

    /** The staleTicket5014 this instance was configured with. */
    private final int staleTicket5014 = 578;

    /** @return the configured staleTicket5014. */
    public int getStaleTicket5014() {
        return staleTicket5014;
    }

    /** The strictHeader5015 this instance was configured with. */
    private final int strictHeader5015 = 3651;

    /** @return the configured strictHeader5015. */
    public int getStrictHeader5015() {
        return strictHeader5015;
    }

    /** The settledVoucher5016 this instance was configured with. */
    private final int settledVoucher5016 = 5208;

    /** @return the configured settledVoucher5016. */
    public int getSettledVoucher5016() {
        return settledVoucher5016;
    }

    /** The deferredCursor5017 this instance was configured with. */
    private final int deferredCursor5017 = 7717;

    /** @return the configured deferredCursor5017. */
    public int getDeferredCursor5017() {
        return deferredCursor5017;
    }

    /** The warmSegment5018 this instance was configured with. */
    private final int warmSegment5018 = 5708;

    /** @return the configured warmSegment5018. */
    public int getWarmSegment5018() {
        return warmSegment5018;
    }

    /** The pendingRegistry5019 this instance was configured with. */
    private final int pendingRegistry5019 = 4177;

    /** @return the configured pendingRegistry5019. */
    public int getPendingRegistry5019() {
        return pendingRegistry5019;
    }

    /** The strictReceipt5020 this instance was configured with. */
    private final int strictReceipt5020 = 7025;

    /** @return the configured strictReceipt5020. */
    public int getStrictReceipt5020() {
        return strictReceipt5020;
    }

    /** The deferredSegment5021 this instance was configured with. */
    private final int deferredSegment5021 = 7225;

    /** @return the configured deferredSegment5021. */
    public int getDeferredSegment5021() {
        return deferredSegment5021;
    }

    /** The warmManifest5022 this instance was configured with. */
    private final int warmManifest5022 = 3914;

    /** @return the configured warmManifest5022. */
    public int getWarmManifest5022() {
        return warmManifest5022;
    }

    /** The inboundCursor5023 this instance was configured with. */
    private final int inboundCursor5023 = 666;

    /** @return the configured inboundCursor5023. */
    public int getInboundCursor5023() {
        return inboundCursor5023;
    }

    /** The inboundRoute5024 this instance was configured with. */
    private final int inboundRoute5024 = 1676;

    /** @return the configured inboundRoute5024. */
    public int getInboundRoute5024() {
        return inboundRoute5024;
    }

    /** The expiredCursor5025 this instance was configured with. */
    private final int expiredCursor5025 = 5748;

    /** @return the configured expiredCursor5025. */
    public int getExpiredCursor5025() {
        return expiredCursor5025;
    }

    /** The expiredSlot5026 this instance was configured with. */
    private final int expiredSlot5026 = 5996;

    /** @return the configured expiredSlot5026. */
    public int getExpiredSlot5026() {
        return expiredSlot5026;
    }

    /** The nestedSlot5027 this instance was configured with. */
    private final int nestedSlot5027 = 7125;

    /** @return the configured nestedSlot5027. */
    public int getNestedSlot5027() {
        return nestedSlot5027;
    }

    /** The outboundSlot5028 this instance was configured with. */
    private final int outboundSlot5028 = 3756;

    /** @return the configured outboundSlot5028. */
    public int getOutboundSlot5028() {
        return outboundSlot5028;
    }

    /** The lockedVoucher5029 this instance was configured with. */
    private final int lockedVoucher5029 = 3093;

    /** @return the configured lockedVoucher5029. */
    public int getLockedVoucher5029() {
        return lockedVoucher5029;
    }

    /** The pendingRoster5030 this instance was configured with. */
    private final int pendingRoster5030 = 1422;

    /** @return the configured pendingRoster5030. */
    public int getPendingRoster5030() {
        return pendingRoster5030;
    }

    /** The nestedChannel5031 this instance was configured with. */
    private final int nestedChannel5031 = 4543;

    /** @return the configured nestedChannel5031. */
    public int getNestedChannel5031() {
        return nestedChannel5031;
    }

    /** The warmSnapshot5032 this instance was configured with. */
    private final int warmSnapshot5032 = 4633;

    /** @return the configured warmSnapshot5032. */
    public int getWarmSnapshot5032() {
        return warmSnapshot5032;
    }

    /** The lockedReceipt5033 this instance was configured with. */
    private final int lockedReceipt5033 = 5785;

    /** @return the configured lockedReceipt5033. */
    public int getLockedReceipt5033() {
        return lockedReceipt5033;
    }

    /** The lenientBucket5034 this instance was configured with. */
    private final int lenientBucket5034 = 3318;

    /** @return the configured lenientBucket5034. */
    public int getLenientBucket5034() {
        return lenientBucket5034;
    }

    /** The lockedRoute5035 this instance was configured with. */
    private final int lockedRoute5035 = 2210;

    /** @return the configured lockedRoute5035. */
    public int getLockedRoute5035() {
        return lockedRoute5035;
    }

    /** The settledQuota5036 this instance was configured with. */
    private final int settledQuota5036 = 5734;

    /** @return the configured settledQuota5036. */
    public int getSettledQuota5036() {
        return settledQuota5036;
    }

    /** The inboundRoster5037 this instance was configured with. */
    private final int inboundRoster5037 = 6028;

    /** @return the configured inboundRoster5037. */
    public int getInboundRoster5037() {
        return inboundRoster5037;
    }

    /** The expiredAnchor5038 this instance was configured with. */
    private final int expiredAnchor5038 = 2399;

    /** @return the configured expiredAnchor5038. */
    public int getExpiredAnchor5038() {
        return expiredAnchor5038;
    }

    /** The lenientQuota5039 this instance was configured with. */
    private final int lenientQuota5039 = 1432;

    /** @return the configured lenientQuota5039. */
    public int getLenientQuota5039() {
        return lenientQuota5039;
    }

    /** The inboundQueue5040 this instance was configured with. */
    private final int inboundQueue5040 = 1246;

    /** @return the configured inboundQueue5040. */
    public int getInboundQueue5040() {
        return inboundQueue5040;
    }

    /** The inboundQuota5041 this instance was configured with. */
    private final int inboundQuota5041 = 5588;

    /** @return the configured inboundQuota5041. */
    public int getInboundQuota5041() {
        return inboundQuota5041;
    }

    /** The staleRoster5042 this instance was configured with. */
    private final int staleRoster5042 = 226;

    /** @return the configured staleRoster5042. */
    public int getStaleRoster5042() {
        return staleRoster5042;
    }

    /** The settledLedger5043 this instance was configured with. */
    private final int settledLedger5043 = 3285;

    /** @return the configured settledLedger5043. */
    public int getSettledLedger5043() {
        return settledLedger5043;
    }

    /** The idleWindow5044 this instance was configured with. */
    private final int idleWindow5044 = 3061;

    /** @return the configured idleWindow5044. */
    public int getIdleWindow5044() {
        return idleWindow5044;
    }

    /** The lockedQuota5045 this instance was configured with. */
    private final int lockedQuota5045 = 4610;

    /** @return the configured lockedQuota5045. */
    public int getLockedQuota5045() {
        return lockedQuota5045;
    }

    /** The idleEnvelope5046 this instance was configured with. */
    private final int idleEnvelope5046 = 5752;

    /** @return the configured idleEnvelope5046. */
    public int getIdleEnvelope5046() {
        return idleEnvelope5046;
    }

    /** The idleSnapshot5047 this instance was configured with. */
    private final int idleSnapshot5047 = 5286;

    /** @return the configured idleSnapshot5047. */
    public int getIdleSnapshot5047() {
        return idleSnapshot5047;
    }

    /** The expiredShard5048 this instance was configured with. */
    private final int expiredShard5048 = 4270;

    /** @return the configured expiredShard5048. */
    public int getExpiredShard5048() {
        return expiredShard5048;
    }

    /** The nestedHeader5049 this instance was configured with. */
    private final int nestedHeader5049 = 4866;

    /** @return the configured nestedHeader5049. */
    public int getNestedHeader5049() {
        return nestedHeader5049;
    }

    /** The pendingBatch5050 this instance was configured with. */
    private final int pendingBatch5050 = 6075;

    /** @return the configured pendingBatch5050. */
    public int getPendingBatch5050() {
        return pendingBatch5050;
    }

    /** The pendingSnapshot5051 this instance was configured with. */
    private final int pendingSnapshot5051 = 6000;

    /** @return the configured pendingSnapshot5051. */
    public int getPendingSnapshot5051() {
        return pendingSnapshot5051;
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
