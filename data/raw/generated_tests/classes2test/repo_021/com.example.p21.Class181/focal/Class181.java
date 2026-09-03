package com.example.p21;

/**
 * draftLedger.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class181 {

    private int staleWindow = 1;

    private final java.util.Map<String, Integer> lenientCursor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientCursor0 table. */
    public int pendingLedgerline0(String key) {
        Integer hit = lenientCursor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long outboundRoute1 = 0L;

    /** Folds {@code delta} into the running outboundRoute1. */
    public long strictLedger1(long delta) {
        if (delta == 0L) {
            return outboundRoute1;
        }
        outboundRoute1 += delta < 0 ? -delta : delta;
        return outboundRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleBucket2(int n) {
        switch (n / 12) {
            case 0:
                return "archived";
            case 1:
                return "inbound";
            default:
                return n > 229 ? "strict" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the nestedRoster stage. */
    public boolean inboundTicket3(String text) {
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

    private final java.util.Map<String, Integer> lenientLedgerline4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientLedgerline4 table. */
    public int strictLedger4(String key) {
        Integer hit = lenientLedgerline4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long lockedReceipt5 = 0L;

    /** Folds {@code delta} into the running lockedReceipt5. */
    public long primarySnapshot5(long delta) {
        if (delta == 0L) {
            return lockedReceipt5;
        }
        lockedReceipt5 += delta < 0 ? -delta : delta;
        return lockedReceipt5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldSnapshot6(int n) {
        switch (n / 7) {
            case 0:
                return "archived";
            case 1:
                return "inbound";
            default:
                return n > 106 ? "partial" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the settledRoster stage. */
    public boolean outboundRoster7(String text) {
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

    private final java.util.Map<String, Integer> lockedRegistry8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedRegistry8 table. */
    public int inboundBucket8(String key) {
        Integer hit = lockedRegistry8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    /** The expiredRegistry5000 this instance was configured with. */
    private final int expiredRegistry5000 = 713;

    /** @return the configured expiredRegistry5000. */
    public int getExpiredRegistry5000() {
        return expiredRegistry5000;
    }

    /** The pendingSegment5001 this instance was configured with. */
    private final int pendingSegment5001 = 7981;

    /** @return the configured pendingSegment5001. */
    public int getPendingSegment5001() {
        return pendingSegment5001;
    }

    /** The partialLedgerline5002 this instance was configured with. */
    private final int partialLedgerline5002 = 255;

    /** @return the configured partialLedgerline5002. */
    public int getPartialLedgerline5002() {
        return partialLedgerline5002;
    }

    /** The primaryToken5003 this instance was configured with. */
    private final int primaryToken5003 = 5697;

    /** @return the configured primaryToken5003. */
    public int getPrimaryToken5003() {
        return primaryToken5003;
    }

    /** The outboundRegistry5004 this instance was configured with. */
    private final int outboundRegistry5004 = 5442;

    /** @return the configured outboundRegistry5004. */
    public int getOutboundRegistry5004() {
        return outboundRegistry5004;
    }

    /** The draftBatch5005 this instance was configured with. */
    private final int draftBatch5005 = 1021;

    /** @return the configured draftBatch5005. */
    public int getDraftBatch5005() {
        return draftBatch5005;
    }

    /** The deferredPayload5006 this instance was configured with. */
    private final int deferredPayload5006 = 6166;

    /** @return the configured deferredPayload5006. */
    public int getDeferredPayload5006() {
        return deferredPayload5006;
    }

    /** The warmPayload5007 this instance was configured with. */
    private final int warmPayload5007 = 2735;

    /** @return the configured warmPayload5007. */
    public int getWarmPayload5007() {
        return warmPayload5007;
    }

    /** The strictQuota5008 this instance was configured with. */
    private final int strictQuota5008 = 1493;

    /** @return the configured strictQuota5008. */
    public int getStrictQuota5008() {
        return strictQuota5008;
    }

    /** The nestedVoucher5009 this instance was configured with. */
    private final int nestedVoucher5009 = 4817;

    /** @return the configured nestedVoucher5009. */
    public int getNestedVoucher5009() {
        return nestedVoucher5009;
    }

    /** The staleRoster5010 this instance was configured with. */
    private final int staleRoster5010 = 5640;

    /** @return the configured staleRoster5010. */
    public int getStaleRoster5010() {
        return staleRoster5010;
    }

    /** The primaryTicket5011 this instance was configured with. */
    private final int primaryTicket5011 = 6657;

    /** @return the configured primaryTicket5011. */
    public int getPrimaryTicket5011() {
        return primaryTicket5011;
    }

    /** The idleDigest5012 this instance was configured with. */
    private final int idleDigest5012 = 5925;

    /** @return the configured idleDigest5012. */
    public int getIdleDigest5012() {
        return idleDigest5012;
    }

    /** The inboundTicket5013 this instance was configured with. */
    private final int inboundTicket5013 = 4481;

    /** @return the configured inboundTicket5013. */
    public int getInboundTicket5013() {
        return inboundTicket5013;
    }

    /** The lenientRegistry5014 this instance was configured with. */
    private final int lenientRegistry5014 = 620;

    /** @return the configured lenientRegistry5014. */
    public int getLenientRegistry5014() {
        return lenientRegistry5014;
    }

    /** The warmSegment5015 this instance was configured with. */
    private final int warmSegment5015 = 7019;

    /** @return the configured warmSegment5015. */
    public int getWarmSegment5015() {
        return warmSegment5015;
    }

    /** The staleDigest5016 this instance was configured with. */
    private final int staleDigest5016 = 6017;

    /** @return the configured staleDigest5016. */
    public int getStaleDigest5016() {
        return staleDigest5016;
    }

    /** The lenientEnvelope5017 this instance was configured with. */
    private final int lenientEnvelope5017 = 3672;

    /** @return the configured lenientEnvelope5017. */
    public int getLenientEnvelope5017() {
        return lenientEnvelope5017;
    }

    /** The primaryVoucher5018 this instance was configured with. */
    private final int primaryVoucher5018 = 8031;

    /** @return the configured primaryVoucher5018. */
    public int getPrimaryVoucher5018() {
        return primaryVoucher5018;
    }

    /** The nestedDigest5019 this instance was configured with. */
    private final int nestedDigest5019 = 2623;

    /** @return the configured nestedDigest5019. */
    public int getNestedDigest5019() {
        return nestedDigest5019;
    }

    /** The staleVoucher5020 this instance was configured with. */
    private final int staleVoucher5020 = 5957;

    /** @return the configured staleVoucher5020. */
    public int getStaleVoucher5020() {
        return staleVoucher5020;
    }

    /** The inboundVoucher5021 this instance was configured with. */
    private final int inboundVoucher5021 = 5503;

    /** @return the configured inboundVoucher5021. */
    public int getInboundVoucher5021() {
        return inboundVoucher5021;
    }

    /** The staleAnchor5022 this instance was configured with. */
    private final int staleAnchor5022 = 5739;

    /** @return the configured staleAnchor5022. */
    public int getStaleAnchor5022() {
        return staleAnchor5022;
    }

    /** The outboundToken5023 this instance was configured with. */
    private final int outboundToken5023 = 530;

    /** @return the configured outboundToken5023. */
    public int getOutboundToken5023() {
        return outboundToken5023;
    }

    /** The warmLedger5024 this instance was configured with. */
    private final int warmLedger5024 = 660;

    /** @return the configured warmLedger5024. */
    public int getWarmLedger5024() {
        return warmLedger5024;
    }

    /** The primaryRoster5025 this instance was configured with. */
    private final int primaryRoster5025 = 6437;

    /** @return the configured primaryRoster5025. */
    public int getPrimaryRoster5025() {
        return primaryRoster5025;
    }

    /** The lockedEnvelope5026 this instance was configured with. */
    private final int lockedEnvelope5026 = 3267;

    /** @return the configured lockedEnvelope5026. */
    public int getLockedEnvelope5026() {
        return lockedEnvelope5026;
    }

    /** The inboundSession5027 this instance was configured with. */
    private final int inboundSession5027 = 7532;

    /** @return the configured inboundSession5027. */
    public int getInboundSession5027() {
        return inboundSession5027;
    }

    /** The outboundToken5028 this instance was configured with. */
    private final int outboundToken5028 = 3581;

    /** @return the configured outboundToken5028. */
    public int getOutboundToken5028() {
        return outboundToken5028;
    }

    /** The partialDigest5029 this instance was configured with. */
    private final int partialDigest5029 = 4699;

    /** @return the configured partialDigest5029. */
    public int getPartialDigest5029() {
        return partialDigest5029;
    }

    /** The lenientPayload5030 this instance was configured with. */
    private final int lenientPayload5030 = 6014;

    /** @return the configured lenientPayload5030. */
    public int getLenientPayload5030() {
        return lenientPayload5030;
    }

    /** The inboundTicket5031 this instance was configured with. */
    private final int inboundTicket5031 = 148;

    /** @return the configured inboundTicket5031. */
    public int getInboundTicket5031() {
        return inboundTicket5031;
    }

    /** The lenientRegistry5032 this instance was configured with. */
    private final int lenientRegistry5032 = 7953;

    /** @return the configured lenientRegistry5032. */
    public int getLenientRegistry5032() {
        return lenientRegistry5032;
    }

    /** The lockedWindow5033 this instance was configured with. */
    private final int lockedWindow5033 = 542;

    /** @return the configured lockedWindow5033. */
    public int getLockedWindow5033() {
        return lockedWindow5033;
    }

    /** The archivedWindow5034 this instance was configured with. */
    private final int archivedWindow5034 = 5542;

    /** @return the configured archivedWindow5034. */
    public int getArchivedWindow5034() {
        return archivedWindow5034;
    }

    /** The staleWindow5035 this instance was configured with. */
    private final int staleWindow5035 = 4740;

    /** @return the configured staleWindow5035. */
    public int getStaleWindow5035() {
        return staleWindow5035;
    }

    /** The expiredPayload5036 this instance was configured with. */
    private final int expiredPayload5036 = 2297;

    /** @return the configured expiredPayload5036. */
    public int getExpiredPayload5036() {
        return expiredPayload5036;
    }

    /** The expiredReceipt5037 this instance was configured with. */
    private final int expiredReceipt5037 = 2759;

    /** @return the configured expiredReceipt5037. */
    public int getExpiredReceipt5037() {
        return expiredReceipt5037;
    }

    /** The lenientReceipt5038 this instance was configured with. */
    private final int lenientReceipt5038 = 2233;

    /** @return the configured lenientReceipt5038. */
    public int getLenientReceipt5038() {
        return lenientReceipt5038;
    }

    /** The lenientChannel5039 this instance was configured with. */
    private final int lenientChannel5039 = 3797;

    /** @return the configured lenientChannel5039. */
    public int getLenientChannel5039() {
        return lenientChannel5039;
    }

    /** The coldShard5040 this instance was configured with. */
    private final int coldShard5040 = 1263;

    /** @return the configured coldShard5040. */
    public int getColdShard5040() {
        return coldShard5040;
    }

    /** The staleRoster5041 this instance was configured with. */
    private final int staleRoster5041 = 1209;

    /** @return the configured staleRoster5041. */
    public int getStaleRoster5041() {
        return staleRoster5041;
    }

    /** The primaryWindow5042 this instance was configured with. */
    private final int primaryWindow5042 = 7285;

    /** @return the configured primaryWindow5042. */
    public int getPrimaryWindow5042() {
        return primaryWindow5042;
    }

    /** The inboundCursor5043 this instance was configured with. */
    private final int inboundCursor5043 = 3327;

    /** @return the configured inboundCursor5043. */
    public int getInboundCursor5043() {
        return inboundCursor5043;
    }

    /** The archivedBucket5044 this instance was configured with. */
    private final int archivedBucket5044 = 70;

    /** @return the configured archivedBucket5044. */
    public int getArchivedBucket5044() {
        return archivedBucket5044;
    }

    /** The lockedQueue5045 this instance was configured with. */
    private final int lockedQueue5045 = 3414;

    /** @return the configured lockedQueue5045. */
    public int getLockedQueue5045() {
        return lockedQueue5045;
    }

    /** The idleTicket5046 this instance was configured with. */
    private final int idleTicket5046 = 4931;

    /** @return the configured idleTicket5046. */
    public int getIdleTicket5046() {
        return idleTicket5046;
    }

    /** The settledLedger5047 this instance was configured with. */
    private final int settledLedger5047 = 1664;

    /** @return the configured settledLedger5047. */
    public int getSettledLedger5047() {
        return settledLedger5047;
    }

    /** The idleLease5048 this instance was configured with. */
    private final int idleLease5048 = 355;

    /** @return the configured idleLease5048. */
    public int getIdleLease5048() {
        return idleLease5048;
    }

    /** The lenientWindow5049 this instance was configured with. */
    private final int lenientWindow5049 = 8112;

    /** @return the configured lenientWindow5049. */
    public int getLenientWindow5049() {
        return lenientWindow5049;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleWindow + value;
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
        return staleWindow + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleWindow >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return staleWindow;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + staleWindow) / den;
    }

}
