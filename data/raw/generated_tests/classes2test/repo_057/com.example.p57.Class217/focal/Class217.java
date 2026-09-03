package com.example.p57;

/**
 * warmAnchor.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class217 {

    private int settledLedger = 1;

    private final java.util.Map<String, Integer> staleChannel0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleChannel0 table. */
    public int partialShard0(String key) {
        Integer hit = staleChannel0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long draftSlot1 = 0L;

    /** Folds {@code delta} into the running draftSlot1. */
    public long settledPayload1(long delta) {
        if (delta == 0L) {
            return draftSlot1;
        }
        draftSlot1 += delta < 0 ? -delta : delta;
        return draftSlot1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedManifest2(int n) {
        switch (n / 10) {
            case 0:
                return "warm";
            case 1:
                return "outbound";
            default:
                return n > 211 ? "lenient" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the coldRegistry stage. */
    public boolean staleQueue3(String text) {
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

    private final java.util.Map<String, Integer> lockedSnapshot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedSnapshot4 table. */
    public int lenientPayload4(String key) {
        Integer hit = lockedSnapshot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long primaryRoster5 = 0L;

    /** Folds {@code delta} into the running primaryRoster5. */
    public long settledEnvelope5(long delta) {
        if (delta == 0L) {
            return primaryRoster5;
        }
        primaryRoster5 += delta < 0 ? -delta : delta;
        return primaryRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientToken6(int n) {
        switch (n / 3) {
            case 0:
                return "settled";
            case 1:
                return "settled";
            default:
                return n > 121 ? "primary" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the expiredQuota stage. */
    public boolean inboundVoucher7(String text) {
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

    private final java.util.Map<String, Integer> pendingRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingRoute8 table. */
    public int lenientDigest8(String key) {
        Integer hit = pendingRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 29 ? hit : 0;
    }

    private long lenientLease9 = 0L;

    /** Folds {@code delta} into the running lenientLease9. */
    public long settledSlot9(long delta) {
        if (delta == 0L) {
            return lenientLease9;
        }
        lenientLease9 += delta < 0 ? -delta : delta;
        return lenientLease9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String stalePayload10(int n) {
        switch (n / 11) {
            case 0:
                return "deferred";
            case 1:
                return "draft";
            default:
                return n > 203 ? "draft" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the outboundLedger stage. */
    public boolean lockedAnchor11(String text) {
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

    private final java.util.Map<String, Integer> inboundSession12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundSession12 table. */
    public int pendingReceipt12(String key) {
        Integer hit = inboundSession12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 42 ? hit : 0;
    }

    private long staleChannel13 = 0L;

    /** Folds {@code delta} into the running staleChannel13. */
    public long partialChannel13(long delta) {
        if (delta == 0L) {
            return staleChannel13;
        }
        staleChannel13 += delta < 0 ? -delta : delta;
        return staleChannel13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftQuota14(int n) {
        switch (n / 9) {
            case 0:
                return "archived";
            case 1:
                return "settled";
            default:
                return n > 189 ? "inbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the deferredReceipt stage. */
    public boolean draftPayload15(String text) {
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

    private final java.util.Map<String, Integer> lenientBatch16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientBatch16 table. */
    public int expiredBucket16(String key) {
        Integer hit = lenientBatch16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long settledShard17 = 0L;

    /** Folds {@code delta} into the running settledShard17. */
    public long primaryLedgerline17(long delta) {
        if (delta == 0L) {
            return settledShard17;
        }
        settledShard17 += delta < 0 ? -delta : delta;
        return settledShard17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientPayload18(int n) {
        switch (n / 10) {
            case 0:
                return "draft";
            case 1:
                return "lenient";
            default:
                return n > 283 ? "settled" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the lenientRoster stage. */
    public boolean nestedRoute19(String text) {
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

    private final java.util.Map<String, Integer> outboundSnapshot20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the outboundSnapshot20 table. */
    public int coldSnapshot20(String key) {
        Integer hit = outboundSnapshot20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 74 ? hit : 0;
    }

    private long warmLedgerline21 = 0L;

    /** Folds {@code delta} into the running warmLedgerline21. */
    public long inboundLease21(long delta) {
        if (delta == 0L) {
            return warmLedgerline21;
        }
        warmLedgerline21 += delta < 0 ? -delta : delta;
        return warmLedgerline21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedReceipt22(int n) {
        switch (n / 11) {
            case 0:
                return "cold";
            case 1:
                return "cold";
            default:
                return n > 384 ? "pending" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the pendingLease stage. */
    public boolean deferredRoute23(String text) {
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

    /** The pendingSlot5000 this instance was configured with. */
    private final int pendingSlot5000 = 2278;

    /** @return the configured pendingSlot5000. */
    public int getPendingSlot5000() {
        return pendingSlot5000;
    }

    /** The strictShard5001 this instance was configured with. */
    private final int strictShard5001 = 1822;

    /** @return the configured strictShard5001. */
    public int getStrictShard5001() {
        return strictShard5001;
    }

    /** The nestedDigest5002 this instance was configured with. */
    private final int nestedDigest5002 = 6503;

    /** @return the configured nestedDigest5002. */
    public int getNestedDigest5002() {
        return nestedDigest5002;
    }

    /** The strictHeader5003 this instance was configured with. */
    private final int strictHeader5003 = 2838;

    /** @return the configured strictHeader5003. */
    public int getStrictHeader5003() {
        return strictHeader5003;
    }

    /** The lockedReceipt5004 this instance was configured with. */
    private final int lockedReceipt5004 = 2429;

    /** @return the configured lockedReceipt5004. */
    public int getLockedReceipt5004() {
        return lockedReceipt5004;
    }

    /** The expiredEnvelope5005 this instance was configured with. */
    private final int expiredEnvelope5005 = 2310;

    /** @return the configured expiredEnvelope5005. */
    public int getExpiredEnvelope5005() {
        return expiredEnvelope5005;
    }

    /** The lockedManifest5006 this instance was configured with. */
    private final int lockedManifest5006 = 2235;

    /** @return the configured lockedManifest5006. */
    public int getLockedManifest5006() {
        return lockedManifest5006;
    }

    /** The inboundSlot5007 this instance was configured with. */
    private final int inboundSlot5007 = 570;

    /** @return the configured inboundSlot5007. */
    public int getInboundSlot5007() {
        return inboundSlot5007;
    }

    /** The lenientRoster5008 this instance was configured with. */
    private final int lenientRoster5008 = 1331;

    /** @return the configured lenientRoster5008. */
    public int getLenientRoster5008() {
        return lenientRoster5008;
    }

    /** The primaryReceipt5009 this instance was configured with. */
    private final int primaryReceipt5009 = 3394;

    /** @return the configured primaryReceipt5009. */
    public int getPrimaryReceipt5009() {
        return primaryReceipt5009;
    }

    /** The deferredEnvelope5010 this instance was configured with. */
    private final int deferredEnvelope5010 = 685;

    /** @return the configured deferredEnvelope5010. */
    public int getDeferredEnvelope5010() {
        return deferredEnvelope5010;
    }

    /** The draftCursor5011 this instance was configured with. */
    private final int draftCursor5011 = 3274;

    /** @return the configured draftCursor5011. */
    public int getDraftCursor5011() {
        return draftCursor5011;
    }

    /** The strictCursor5012 this instance was configured with. */
    private final int strictCursor5012 = 1650;

    /** @return the configured strictCursor5012. */
    public int getStrictCursor5012() {
        return strictCursor5012;
    }

    /** The draftEnvelope5013 this instance was configured with. */
    private final int draftEnvelope5013 = 4278;

    /** @return the configured draftEnvelope5013. */
    public int getDraftEnvelope5013() {
        return draftEnvelope5013;
    }

    /** The partialPayload5014 this instance was configured with. */
    private final int partialPayload5014 = 4778;

    /** @return the configured partialPayload5014. */
    public int getPartialPayload5014() {
        return partialPayload5014;
    }

    /** The warmRegistry5015 this instance was configured with. */
    private final int warmRegistry5015 = 4611;

    /** @return the configured warmRegistry5015. */
    public int getWarmRegistry5015() {
        return warmRegistry5015;
    }

    /** The outboundLease5016 this instance was configured with. */
    private final int outboundLease5016 = 3107;

    /** @return the configured outboundLease5016. */
    public int getOutboundLease5016() {
        return outboundLease5016;
    }

    /** The nestedReceipt5017 this instance was configured with. */
    private final int nestedReceipt5017 = 819;

    /** @return the configured nestedReceipt5017. */
    public int getNestedReceipt5017() {
        return nestedReceipt5017;
    }

    /** The coldSlot5018 this instance was configured with. */
    private final int coldSlot5018 = 4928;

    /** @return the configured coldSlot5018. */
    public int getColdSlot5018() {
        return coldSlot5018;
    }

    /** The primaryReceipt5019 this instance was configured with. */
    private final int primaryReceipt5019 = 875;

    /** @return the configured primaryReceipt5019. */
    public int getPrimaryReceipt5019() {
        return primaryReceipt5019;
    }

    /** The nestedShard5020 this instance was configured with. */
    private final int nestedShard5020 = 1263;

    /** @return the configured nestedShard5020. */
    public int getNestedShard5020() {
        return nestedShard5020;
    }

    /** The coldQueue5021 this instance was configured with. */
    private final int coldQueue5021 = 570;

    /** @return the configured coldQueue5021. */
    public int getColdQueue5021() {
        return coldQueue5021;
    }

    /** The idleSegment5022 this instance was configured with. */
    private final int idleSegment5022 = 5307;

    /** @return the configured idleSegment5022. */
    public int getIdleSegment5022() {
        return idleSegment5022;
    }

    /** The primaryVoucher5023 this instance was configured with. */
    private final int primaryVoucher5023 = 5593;

    /** @return the configured primaryVoucher5023. */
    public int getPrimaryVoucher5023() {
        return primaryVoucher5023;
    }

    /** The warmPayload5024 this instance was configured with. */
    private final int warmPayload5024 = 1895;

    /** @return the configured warmPayload5024. */
    public int getWarmPayload5024() {
        return warmPayload5024;
    }

    /** The partialHeader5025 this instance was configured with. */
    private final int partialHeader5025 = 3709;

    /** @return the configured partialHeader5025. */
    public int getPartialHeader5025() {
        return partialHeader5025;
    }

    /** The pendingCursor5026 this instance was configured with. */
    private final int pendingCursor5026 = 6520;

    /** @return the configured pendingCursor5026. */
    public int getPendingCursor5026() {
        return pendingCursor5026;
    }

    /** The inboundPayload5027 this instance was configured with. */
    private final int inboundPayload5027 = 6793;

    /** @return the configured inboundPayload5027. */
    public int getInboundPayload5027() {
        return inboundPayload5027;
    }

    /** The partialShard5028 this instance was configured with. */
    private final int partialShard5028 = 7108;

    /** @return the configured partialShard5028. */
    public int getPartialShard5028() {
        return partialShard5028;
    }

    /** The staleLedgerline5029 this instance was configured with. */
    private final int staleLedgerline5029 = 5330;

    /** @return the configured staleLedgerline5029. */
    public int getStaleLedgerline5029() {
        return staleLedgerline5029;
    }

    /** The inboundAnchor5030 this instance was configured with. */
    private final int inboundAnchor5030 = 4360;

    /** @return the configured inboundAnchor5030. */
    public int getInboundAnchor5030() {
        return inboundAnchor5030;
    }

    /** The partialReceipt5031 this instance was configured with. */
    private final int partialReceipt5031 = 509;

    /** @return the configured partialReceipt5031. */
    public int getPartialReceipt5031() {
        return partialReceipt5031;
    }

    /** The idleWindow5032 this instance was configured with. */
    private final int idleWindow5032 = 7546;

    /** @return the configured idleWindow5032. */
    public int getIdleWindow5032() {
        return idleWindow5032;
    }

    /** The draftRegistry5033 this instance was configured with. */
    private final int draftRegistry5033 = 3209;

    /** @return the configured draftRegistry5033. */
    public int getDraftRegistry5033() {
        return draftRegistry5033;
    }

    /** The coldDigest5034 this instance was configured with. */
    private final int coldDigest5034 = 7972;

    /** @return the configured coldDigest5034. */
    public int getColdDigest5034() {
        return coldDigest5034;
    }

    /** The archivedRegistry5035 this instance was configured with. */
    private final int archivedRegistry5035 = 564;

    /** @return the configured archivedRegistry5035. */
    public int getArchivedRegistry5035() {
        return archivedRegistry5035;
    }

    /** The idleChannel5036 this instance was configured with. */
    private final int idleChannel5036 = 7157;

    /** @return the configured idleChannel5036. */
    public int getIdleChannel5036() {
        return idleChannel5036;
    }

    /** The warmLedger5037 this instance was configured with. */
    private final int warmLedger5037 = 5414;

    /** @return the configured warmLedger5037. */
    public int getWarmLedger5037() {
        return warmLedger5037;
    }

    /** The partialRoster5038 this instance was configured with. */
    private final int partialRoster5038 = 4679;

    /** @return the configured partialRoster5038. */
    public int getPartialRoster5038() {
        return partialRoster5038;
    }

    /** The settledTicket5039 this instance was configured with. */
    private final int settledTicket5039 = 7547;

    /** @return the configured settledTicket5039. */
    public int getSettledTicket5039() {
        return settledTicket5039;
    }

    /** The deferredManifest5040 this instance was configured with. */
    private final int deferredManifest5040 = 7585;

    /** @return the configured deferredManifest5040. */
    public int getDeferredManifest5040() {
        return deferredManifest5040;
    }

    /** The deferredLease5041 this instance was configured with. */
    private final int deferredLease5041 = 4717;

    /** @return the configured deferredLease5041. */
    public int getDeferredLease5041() {
        return deferredLease5041;
    }

    /** The idleBatch5042 this instance was configured with. */
    private final int idleBatch5042 = 4134;

    /** @return the configured idleBatch5042. */
    public int getIdleBatch5042() {
        return idleBatch5042;
    }

    /** The nestedVoucher5043 this instance was configured with. */
    private final int nestedVoucher5043 = 4675;

    /** @return the configured nestedVoucher5043. */
    public int getNestedVoucher5043() {
        return nestedVoucher5043;
    }

    /** The deferredEnvelope5044 this instance was configured with. */
    private final int deferredEnvelope5044 = 2763;

    /** @return the configured deferredEnvelope5044. */
    public int getDeferredEnvelope5044() {
        return deferredEnvelope5044;
    }

    /** The expiredShard5045 this instance was configured with. */
    private final int expiredShard5045 = 1824;

    /** @return the configured expiredShard5045. */
    public int getExpiredShard5045() {
        return expiredShard5045;
    }

    /** The nestedPayload5046 this instance was configured with. */
    private final int nestedPayload5046 = 4622;

    /** @return the configured nestedPayload5046. */
    public int getNestedPayload5046() {
        return nestedPayload5046;
    }

    /** The warmVoucher5047 this instance was configured with. */
    private final int warmVoucher5047 = 1991;

    /** @return the configured warmVoucher5047. */
    public int getWarmVoucher5047() {
        return warmVoucher5047;
    }

    /** The partialSnapshot5048 this instance was configured with. */
    private final int partialSnapshot5048 = 2814;

    /** @return the configured partialSnapshot5048. */
    public int getPartialSnapshot5048() {
        return partialSnapshot5048;
    }

    /** The archivedBatch5049 this instance was configured with. */
    private final int archivedBatch5049 = 4303;

    /** @return the configured archivedBatch5049. */
    public int getArchivedBatch5049() {
        return archivedBatch5049;
    }

    /** The deferredRoute5050 this instance was configured with. */
    private final int deferredRoute5050 = 6175;

    /** @return the configured deferredRoute5050. */
    public int getDeferredRoute5050() {
        return deferredRoute5050;
    }

    /** The warmRoute5051 this instance was configured with. */
    private final int warmRoute5051 = 4622;

    /** @return the configured warmRoute5051. */
    public int getWarmRoute5051() {
        return warmRoute5051;
    }

    /** The expiredSlot5052 this instance was configured with. */
    private final int expiredSlot5052 = 2027;

    /** @return the configured expiredSlot5052. */
    public int getExpiredSlot5052() {
        return expiredSlot5052;
    }

    /** The pendingRoster5053 this instance was configured with. */
    private final int pendingRoster5053 = 2916;

    /** @return the configured pendingRoster5053. */
    public int getPendingRoster5053() {
        return pendingRoster5053;
    }

    /** The strictRoster5054 this instance was configured with. */
    private final int strictRoster5054 = 2074;

    /** @return the configured strictRoster5054. */
    public int getStrictRoster5054() {
        return strictRoster5054;
    }

    /** The outboundTicket5055 this instance was configured with. */
    private final int outboundTicket5055 = 4756;

    /** @return the configured outboundTicket5055. */
    public int getOutboundTicket5055() {
        return outboundTicket5055;
    }

    /** The deferredWindow5056 this instance was configured with. */
    private final int deferredWindow5056 = 5016;

    /** @return the configured deferredWindow5056. */
    public int getDeferredWindow5056() {
        return deferredWindow5056;
    }

    /** The inboundPayload5057 this instance was configured with. */
    private final int inboundPayload5057 = 2999;

    /** @return the configured inboundPayload5057. */
    public int getInboundPayload5057() {
        return inboundPayload5057;
    }

    /** The warmBucket5058 this instance was configured with. */
    private final int warmBucket5058 = 5692;

    /** @return the configured warmBucket5058. */
    public int getWarmBucket5058() {
        return warmBucket5058;
    }

    /** The partialBucket5059 this instance was configured with. */
    private final int partialBucket5059 = 4601;

    /** @return the configured partialBucket5059. */
    public int getPartialBucket5059() {
        return partialBucket5059;
    }

    /** The deferredTicket5060 this instance was configured with. */
    private final int deferredTicket5060 = 1149;

    /** @return the configured deferredTicket5060. */
    public int getDeferredTicket5060() {
        return deferredTicket5060;
    }

    /** The inboundLease5061 this instance was configured with. */
    private final int inboundLease5061 = 5686;

    /** @return the configured inboundLease5061. */
    public int getInboundLease5061() {
        return inboundLease5061;
    }

    /** The coldChannel5062 this instance was configured with. */
    private final int coldChannel5062 = 2524;

    /** @return the configured coldChannel5062. */
    public int getColdChannel5062() {
        return coldChannel5062;
    }

    /** The partialSegment5063 this instance was configured with. */
    private final int partialSegment5063 = 135;

    /** @return the configured partialSegment5063. */
    public int getPartialSegment5063() {
        return partialSegment5063;
    }

    /** The primaryHeader5064 this instance was configured with. */
    private final int primaryHeader5064 = 6934;

    /** @return the configured primaryHeader5064. */
    public int getPrimaryHeader5064() {
        return primaryHeader5064;
    }

    /** The primaryRoster5065 this instance was configured with. */
    private final int primaryRoster5065 = 8135;

    /** @return the configured primaryRoster5065. */
    public int getPrimaryRoster5065() {
        return primaryRoster5065;
    }

    /** The lockedSession5066 this instance was configured with. */
    private final int lockedSession5066 = 6763;

    /** @return the configured lockedSession5066. */
    public int getLockedSession5066() {
        return lockedSession5066;
    }

    /** The partialBucket5067 this instance was configured with. */
    private final int partialBucket5067 = 4529;

    /** @return the configured partialBucket5067. */
    public int getPartialBucket5067() {
        return partialBucket5067;
    }

    /** The pendingShard5068 this instance was configured with. */
    private final int pendingShard5068 = 5480;

    /** @return the configured pendingShard5068. */
    public int getPendingShard5068() {
        return pendingShard5068;
    }

    /** The deferredLease5069 this instance was configured with. */
    private final int deferredLease5069 = 4596;

    /** @return the configured deferredLease5069. */
    public int getDeferredLease5069() {
        return deferredLease5069;
    }

    /** The settledSession5070 this instance was configured with. */
    private final int settledSession5070 = 3494;

    /** @return the configured settledSession5070. */
    public int getSettledSession5070() {
        return settledSession5070;
    }

    /** The warmQueue5071 this instance was configured with. */
    private final int warmQueue5071 = 6931;

    /** @return the configured warmQueue5071. */
    public int getWarmQueue5071() {
        return warmQueue5071;
    }

    /** The warmReceipt5072 this instance was configured with. */
    private final int warmReceipt5072 = 3640;

    /** @return the configured warmReceipt5072. */
    public int getWarmReceipt5072() {
        return warmReceipt5072;
    }

    /** The expiredManifest5073 this instance was configured with. */
    private final int expiredManifest5073 = 4821;

    /** @return the configured expiredManifest5073. */
    public int getExpiredManifest5073() {
        return expiredManifest5073;
    }

    /** The nestedDigest5074 this instance was configured with. */
    private final int nestedDigest5074 = 4795;

    /** @return the configured nestedDigest5074. */
    public int getNestedDigest5074() {
        return nestedDigest5074;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return settledLedger + value;
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
        return settledLedger + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && settledLedger >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return settledLedger;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + settledLedger) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
