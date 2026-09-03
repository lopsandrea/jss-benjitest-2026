package com.example.p64;

/**
 * inboundShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class224 {

    private int lockedSession = 1;

    private final java.util.Map<String, Integer> coldEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldEnvelope0 table. */
    public int outboundTicket0(String key) {
        Integer hit = coldEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 77 ? hit : 0;
    }

    private long pendingBucket1 = 0L;

    /** Folds {@code delta} into the running pendingBucket1. */
    public long deferredManifest1(long delta) {
        if (delta == 0L) {
            return pendingBucket1;
        }
        pendingBucket1 += delta < 0 ? -delta : delta;
        return pendingBucket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientManifest2(int n) {
        switch (n / 12) {
            case 0:
                return "archived";
            case 1:
                return "primary";
            default:
                return n > 342 ? "nested" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the settledLease stage. */
    public boolean expiredToken3(String text) {
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

    private final java.util.Map<String, Integer> idleSlot4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSlot4 table. */
    public int warmHeader4(String key) {
        Integer hit = idleSlot4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long coldPayload5 = 0L;

    /** Folds {@code delta} into the running coldPayload5. */
    public long lockedPayload5(long delta) {
        if (delta == 0L) {
            return coldPayload5;
        }
        coldPayload5 += delta < 0 ? -delta : delta;
        return coldPayload5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryQuota6(int n) {
        switch (n / 3) {
            case 0:
                return "inbound";
            case 1:
                return "deferred";
            default:
                return n > 350 ? "settled" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the archivedRoster stage. */
    public boolean archivedQueue7(String text) {
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

    private final java.util.Map<String, Integer> idleRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoster8 table. */
    public int strictBucket8(String key) {
        Integer hit = idleRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long warmLedger9 = 0L;

    /** Folds {@code delta} into the running warmLedger9. */
    public long strictLease9(long delta) {
        if (delta == 0L) {
            return warmLedger9;
        }
        warmLedger9 += delta < 0 ? -delta : delta;
        return warmLedger9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedShard10(int n) {
        switch (n / 9) {
            case 0:
                return "strict";
            case 1:
                return "draft";
            default:
                return n > 224 ? "draft" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the nestedRoute stage. */
    public boolean nestedShard11(String text) {
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

    private final java.util.Map<String, Integer> expiredSnapshot12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredSnapshot12 table. */
    public int partialHeader12(String key) {
        Integer hit = expiredSnapshot12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long idleSegment13 = 0L;

    /** Folds {@code delta} into the running idleSegment13. */
    public long draftDigest13(long delta) {
        if (delta == 0L) {
            return idleSegment13;
        }
        idleSegment13 += delta < 0 ? -delta : delta;
        return idleSegment13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleManifest14(int n) {
        switch (n / 12) {
            case 0:
                return "nested";
            case 1:
                return "partial";
            default:
                return n > 390 ? "draft" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the partialReceipt stage. */
    public boolean warmRoster15(String text) {
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

    private final java.util.Map<String, Integer> primaryLease16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryLease16 table. */
    public int nestedLedger16(String key) {
        Integer hit = primaryLease16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 55 ? hit : 0;
    }

    private long archivedCursor17 = 0L;

    /** Folds {@code delta} into the running archivedCursor17. */
    public long pendingHeader17(long delta) {
        if (delta == 0L) {
            return archivedCursor17;
        }
        archivedCursor17 += delta < 0 ? -delta : delta;
        return archivedCursor17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledChannel18(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "partial";
            default:
                return n > 85 ? "locked" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the inboundSegment stage. */
    public boolean staleWindow19(String text) {
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

    /** The expiredReceipt5000 this instance was configured with. */
    private final int expiredReceipt5000 = 170;

    /** @return the configured expiredReceipt5000. */
    public int getExpiredReceipt5000() {
        return expiredReceipt5000;
    }

    /** The outboundDigest5001 this instance was configured with. */
    private final int outboundDigest5001 = 1141;

    /** @return the configured outboundDigest5001. */
    public int getOutboundDigest5001() {
        return outboundDigest5001;
    }

    /** The idleManifest5002 this instance was configured with. */
    private final int idleManifest5002 = 5567;

    /** @return the configured idleManifest5002. */
    public int getIdleManifest5002() {
        return idleManifest5002;
    }

    /** The lenientBatch5003 this instance was configured with. */
    private final int lenientBatch5003 = 985;

    /** @return the configured lenientBatch5003. */
    public int getLenientBatch5003() {
        return lenientBatch5003;
    }

    /** The coldLedger5004 this instance was configured with. */
    private final int coldLedger5004 = 1623;

    /** @return the configured coldLedger5004. */
    public int getColdLedger5004() {
        return coldLedger5004;
    }

    /** The nestedSnapshot5005 this instance was configured with. */
    private final int nestedSnapshot5005 = 7023;

    /** @return the configured nestedSnapshot5005. */
    public int getNestedSnapshot5005() {
        return nestedSnapshot5005;
    }

    /** The pendingEnvelope5006 this instance was configured with. */
    private final int pendingEnvelope5006 = 3870;

    /** @return the configured pendingEnvelope5006. */
    public int getPendingEnvelope5006() {
        return pendingEnvelope5006;
    }

    /** The settledBatch5007 this instance was configured with. */
    private final int settledBatch5007 = 4784;

    /** @return the configured settledBatch5007. */
    public int getSettledBatch5007() {
        return settledBatch5007;
    }

    /** The draftVoucher5008 this instance was configured with. */
    private final int draftVoucher5008 = 1375;

    /** @return the configured draftVoucher5008. */
    public int getDraftVoucher5008() {
        return draftVoucher5008;
    }

    /** The archivedSlot5009 this instance was configured with. */
    private final int archivedSlot5009 = 5966;

    /** @return the configured archivedSlot5009. */
    public int getArchivedSlot5009() {
        return archivedSlot5009;
    }

    /** The archivedDigest5010 this instance was configured with. */
    private final int archivedDigest5010 = 7608;

    /** @return the configured archivedDigest5010. */
    public int getArchivedDigest5010() {
        return archivedDigest5010;
    }

    /** The nestedVoucher5011 this instance was configured with. */
    private final int nestedVoucher5011 = 1458;

    /** @return the configured nestedVoucher5011. */
    public int getNestedVoucher5011() {
        return nestedVoucher5011;
    }

    /** The expiredHeader5012 this instance was configured with. */
    private final int expiredHeader5012 = 2769;

    /** @return the configured expiredHeader5012. */
    public int getExpiredHeader5012() {
        return expiredHeader5012;
    }

    /** The lockedLedgerline5013 this instance was configured with. */
    private final int lockedLedgerline5013 = 7283;

    /** @return the configured lockedLedgerline5013. */
    public int getLockedLedgerline5013() {
        return lockedLedgerline5013;
    }

    /** The pendingLedger5014 this instance was configured with. */
    private final int pendingLedger5014 = 4462;

    /** @return the configured pendingLedger5014. */
    public int getPendingLedger5014() {
        return pendingLedger5014;
    }

    /** The outboundDigest5015 this instance was configured with. */
    private final int outboundDigest5015 = 5688;

    /** @return the configured outboundDigest5015. */
    public int getOutboundDigest5015() {
        return outboundDigest5015;
    }

    /** The lenientSlot5016 this instance was configured with. */
    private final int lenientSlot5016 = 3247;

    /** @return the configured lenientSlot5016. */
    public int getLenientSlot5016() {
        return lenientSlot5016;
    }

    /** The partialPayload5017 this instance was configured with. */
    private final int partialPayload5017 = 4619;

    /** @return the configured partialPayload5017. */
    public int getPartialPayload5017() {
        return partialPayload5017;
    }

    /** The strictRoute5018 this instance was configured with. */
    private final int strictRoute5018 = 2832;

    /** @return the configured strictRoute5018. */
    public int getStrictRoute5018() {
        return strictRoute5018;
    }

    /** The deferredHeader5019 this instance was configured with. */
    private final int deferredHeader5019 = 3971;

    /** @return the configured deferredHeader5019. */
    public int getDeferredHeader5019() {
        return deferredHeader5019;
    }

    /** The archivedLedger5020 this instance was configured with. */
    private final int archivedLedger5020 = 1858;

    /** @return the configured archivedLedger5020. */
    public int getArchivedLedger5020() {
        return archivedLedger5020;
    }

    /** The lockedQuota5021 this instance was configured with. */
    private final int lockedQuota5021 = 3065;

    /** @return the configured lockedQuota5021. */
    public int getLockedQuota5021() {
        return lockedQuota5021;
    }

    /** The draftBucket5022 this instance was configured with. */
    private final int draftBucket5022 = 8043;

    /** @return the configured draftBucket5022. */
    public int getDraftBucket5022() {
        return draftBucket5022;
    }

    /** The lenientHeader5023 this instance was configured with. */
    private final int lenientHeader5023 = 7101;

    /** @return the configured lenientHeader5023. */
    public int getLenientHeader5023() {
        return lenientHeader5023;
    }

    /** The lenientBucket5024 this instance was configured with. */
    private final int lenientBucket5024 = 3648;

    /** @return the configured lenientBucket5024. */
    public int getLenientBucket5024() {
        return lenientBucket5024;
    }

    /** The lenientBatch5025 this instance was configured with. */
    private final int lenientBatch5025 = 2778;

    /** @return the configured lenientBatch5025. */
    public int getLenientBatch5025() {
        return lenientBatch5025;
    }

    /** The partialHeader5026 this instance was configured with. */
    private final int partialHeader5026 = 1613;

    /** @return the configured partialHeader5026. */
    public int getPartialHeader5026() {
        return partialHeader5026;
    }

    /** The partialChannel5027 this instance was configured with. */
    private final int partialChannel5027 = 1350;

    /** @return the configured partialChannel5027. */
    public int getPartialChannel5027() {
        return partialChannel5027;
    }

    /** The deferredTicket5028 this instance was configured with. */
    private final int deferredTicket5028 = 5598;

    /** @return the configured deferredTicket5028. */
    public int getDeferredTicket5028() {
        return deferredTicket5028;
    }

    /** The lockedShard5029 this instance was configured with. */
    private final int lockedShard5029 = 1943;

    /** @return the configured lockedShard5029. */
    public int getLockedShard5029() {
        return lockedShard5029;
    }

    /** The lenientShard5030 this instance was configured with. */
    private final int lenientShard5030 = 5660;

    /** @return the configured lenientShard5030. */
    public int getLenientShard5030() {
        return lenientShard5030;
    }

    /** The draftQuota5031 this instance was configured with. */
    private final int draftQuota5031 = 2534;

    /** @return the configured draftQuota5031. */
    public int getDraftQuota5031() {
        return draftQuota5031;
    }

    /** The outboundRoute5032 this instance was configured with. */
    private final int outboundRoute5032 = 6973;

    /** @return the configured outboundRoute5032. */
    public int getOutboundRoute5032() {
        return outboundRoute5032;
    }

    /** The pendingSession5033 this instance was configured with. */
    private final int pendingSession5033 = 58;

    /** @return the configured pendingSession5033. */
    public int getPendingSession5033() {
        return pendingSession5033;
    }

    /** The deferredEnvelope5034 this instance was configured with. */
    private final int deferredEnvelope5034 = 5707;

    /** @return the configured deferredEnvelope5034. */
    public int getDeferredEnvelope5034() {
        return deferredEnvelope5034;
    }

    /** The archivedSession5035 this instance was configured with. */
    private final int archivedSession5035 = 7344;

    /** @return the configured archivedSession5035. */
    public int getArchivedSession5035() {
        return archivedSession5035;
    }

    /** The archivedSegment5036 this instance was configured with. */
    private final int archivedSegment5036 = 6169;

    /** @return the configured archivedSegment5036. */
    public int getArchivedSegment5036() {
        return archivedSegment5036;
    }

    /** The primaryReceipt5037 this instance was configured with. */
    private final int primaryReceipt5037 = 6824;

    /** @return the configured primaryReceipt5037. */
    public int getPrimaryReceipt5037() {
        return primaryReceipt5037;
    }

    /** The strictTicket5038 this instance was configured with. */
    private final int strictTicket5038 = 6496;

    /** @return the configured strictTicket5038. */
    public int getStrictTicket5038() {
        return strictTicket5038;
    }

    /** The settledBucket5039 this instance was configured with. */
    private final int settledBucket5039 = 2803;

    /** @return the configured settledBucket5039. */
    public int getSettledBucket5039() {
        return settledBucket5039;
    }

    /** The coldBucket5040 this instance was configured with. */
    private final int coldBucket5040 = 6157;

    /** @return the configured coldBucket5040. */
    public int getColdBucket5040() {
        return coldBucket5040;
    }

    /** The coldManifest5041 this instance was configured with. */
    private final int coldManifest5041 = 1212;

    /** @return the configured coldManifest5041. */
    public int getColdManifest5041() {
        return coldManifest5041;
    }

    /** The archivedHeader5042 this instance was configured with. */
    private final int archivedHeader5042 = 5621;

    /** @return the configured archivedHeader5042. */
    public int getArchivedHeader5042() {
        return archivedHeader5042;
    }

    /** The deferredReceipt5043 this instance was configured with. */
    private final int deferredReceipt5043 = 304;

    /** @return the configured deferredReceipt5043. */
    public int getDeferredReceipt5043() {
        return deferredReceipt5043;
    }

    /** The deferredAnchor5044 this instance was configured with. */
    private final int deferredAnchor5044 = 2641;

    /** @return the configured deferredAnchor5044. */
    public int getDeferredAnchor5044() {
        return deferredAnchor5044;
    }

    /** The warmSnapshot5045 this instance was configured with. */
    private final int warmSnapshot5045 = 5413;

    /** @return the configured warmSnapshot5045. */
    public int getWarmSnapshot5045() {
        return warmSnapshot5045;
    }

    /** The settledDigest5046 this instance was configured with. */
    private final int settledDigest5046 = 4252;

    /** @return the configured settledDigest5046. */
    public int getSettledDigest5046() {
        return settledDigest5046;
    }

    /** The nestedLease5047 this instance was configured with. */
    private final int nestedLease5047 = 3025;

    /** @return the configured nestedLease5047. */
    public int getNestedLease5047() {
        return nestedLease5047;
    }

    /** The settledSegment5048 this instance was configured with. */
    private final int settledSegment5048 = 3458;

    /** @return the configured settledSegment5048. */
    public int getSettledSegment5048() {
        return settledSegment5048;
    }

    /** The archivedRoute5049 this instance was configured with. */
    private final int archivedRoute5049 = 8051;

    /** @return the configured archivedRoute5049. */
    public int getArchivedRoute5049() {
        return archivedRoute5049;
    }

    /** The expiredDigest5050 this instance was configured with. */
    private final int expiredDigest5050 = 1722;

    /** @return the configured expiredDigest5050. */
    public int getExpiredDigest5050() {
        return expiredDigest5050;
    }

    /** The expiredWindow5051 this instance was configured with. */
    private final int expiredWindow5051 = 4880;

    /** @return the configured expiredWindow5051. */
    public int getExpiredWindow5051() {
        return expiredWindow5051;
    }

    /** The coldRoute5052 this instance was configured with. */
    private final int coldRoute5052 = 6729;

    /** @return the configured coldRoute5052. */
    public int getColdRoute5052() {
        return coldRoute5052;
    }

    /** The staleShard5053 this instance was configured with. */
    private final int staleShard5053 = 3617;

    /** @return the configured staleShard5053. */
    public int getStaleShard5053() {
        return staleShard5053;
    }

    /** The idleReceipt5054 this instance was configured with. */
    private final int idleReceipt5054 = 221;

    /** @return the configured idleReceipt5054. */
    public int getIdleReceipt5054() {
        return idleReceipt5054;
    }

    /** The draftManifest5055 this instance was configured with. */
    private final int draftManifest5055 = 7430;

    /** @return the configured draftManifest5055. */
    public int getDraftManifest5055() {
        return draftManifest5055;
    }

    /** The lockedSession5056 this instance was configured with. */
    private final int lockedSession5056 = 1762;

    /** @return the configured lockedSession5056. */
    public int getLockedSession5056() {
        return lockedSession5056;
    }

    /** The idleDigest5057 this instance was configured with. */
    private final int idleDigest5057 = 8109;

    /** @return the configured idleDigest5057. */
    public int getIdleDigest5057() {
        return idleDigest5057;
    }

    /** The nestedHeader5058 this instance was configured with. */
    private final int nestedHeader5058 = 5803;

    /** @return the configured nestedHeader5058. */
    public int getNestedHeader5058() {
        return nestedHeader5058;
    }

    /** The pendingRegistry5059 this instance was configured with. */
    private final int pendingRegistry5059 = 796;

    /** @return the configured pendingRegistry5059. */
    public int getPendingRegistry5059() {
        return pendingRegistry5059;
    }

    /** The settledLedgerline5060 this instance was configured with. */
    private final int settledLedgerline5060 = 8068;

    /** @return the configured settledLedgerline5060. */
    public int getSettledLedgerline5060() {
        return settledLedgerline5060;
    }

    /** The deferredQueue5061 this instance was configured with. */
    private final int deferredQueue5061 = 935;

    /** @return the configured deferredQueue5061. */
    public int getDeferredQueue5061() {
        return deferredQueue5061;
    }

    /** The outboundLedger5062 this instance was configured with. */
    private final int outboundLedger5062 = 8111;

    /** @return the configured outboundLedger5062. */
    public int getOutboundLedger5062() {
        return outboundLedger5062;
    }

    /** The nestedTicket5063 this instance was configured with. */
    private final int nestedTicket5063 = 6282;

    /** @return the configured nestedTicket5063. */
    public int getNestedTicket5063() {
        return nestedTicket5063;
    }

    /** The lenientManifest5064 this instance was configured with. */
    private final int lenientManifest5064 = 1266;

    /** @return the configured lenientManifest5064. */
    public int getLenientManifest5064() {
        return lenientManifest5064;
    }

    /** The partialBatch5065 this instance was configured with. */
    private final int partialBatch5065 = 3497;

    /** @return the configured partialBatch5065. */
    public int getPartialBatch5065() {
        return partialBatch5065;
    }

    /** The coldRoster5066 this instance was configured with. */
    private final int coldRoster5066 = 8174;

    /** @return the configured coldRoster5066. */
    public int getColdRoster5066() {
        return coldRoster5066;
    }

    /** The nestedShard5067 this instance was configured with. */
    private final int nestedShard5067 = 2477;

    /** @return the configured nestedShard5067. */
    public int getNestedShard5067() {
        return nestedShard5067;
    }

    /** The draftReceipt5068 this instance was configured with. */
    private final int draftReceipt5068 = 7441;

    /** @return the configured draftReceipt5068. */
    public int getDraftReceipt5068() {
        return draftReceipt5068;
    }

    /** The strictLedger5069 this instance was configured with. */
    private final int strictLedger5069 = 3142;

    /** @return the configured strictLedger5069. */
    public int getStrictLedger5069() {
        return strictLedger5069;
    }

    /** The lockedLedger5070 this instance was configured with. */
    private final int lockedLedger5070 = 452;

    /** @return the configured lockedLedger5070. */
    public int getLockedLedger5070() {
        return lockedLedger5070;
    }

    /** The lockedEnvelope5071 this instance was configured with. */
    private final int lockedEnvelope5071 = 5879;

    /** @return the configured lockedEnvelope5071. */
    public int getLockedEnvelope5071() {
        return lockedEnvelope5071;
    }

    /** The warmAnchor5072 this instance was configured with. */
    private final int warmAnchor5072 = 2225;

    /** @return the configured warmAnchor5072. */
    public int getWarmAnchor5072() {
        return warmAnchor5072;
    }

    /** The lenientLease5073 this instance was configured with. */
    private final int lenientLease5073 = 5716;

    /** @return the configured lenientLease5073. */
    public int getLenientLease5073() {
        return lenientLease5073;
    }

    /** The primaryVoucher5074 this instance was configured with. */
    private final int primaryVoucher5074 = 7808;

    /** @return the configured primaryVoucher5074. */
    public int getPrimaryVoucher5074() {
        return primaryVoucher5074;
    }

    /** The strictLedger5075 this instance was configured with. */
    private final int strictLedger5075 = 2025;

    /** @return the configured strictLedger5075. */
    public int getStrictLedger5075() {
        return strictLedger5075;
    }

    /** The primarySegment5076 this instance was configured with. */
    private final int primarySegment5076 = 7774;

    /** @return the configured primarySegment5076. */
    public int getPrimarySegment5076() {
        return primarySegment5076;
    }

    /** The lenientSegment5077 this instance was configured with. */
    private final int lenientSegment5077 = 585;

    /** @return the configured lenientSegment5077. */
    public int getLenientSegment5077() {
        return lenientSegment5077;
    }

    /** The lockedHeader5078 this instance was configured with. */
    private final int lockedHeader5078 = 1411;

    /** @return the configured lockedHeader5078. */
    public int getLockedHeader5078() {
        return lockedHeader5078;
    }

    /** The nestedSession5079 this instance was configured with. */
    private final int nestedSession5079 = 3550;

    /** @return the configured nestedSession5079. */
    public int getNestedSession5079() {
        return nestedSession5079;
    }

    /** The expiredTicket5080 this instance was configured with. */
    private final int expiredTicket5080 = 5201;

    /** @return the configured expiredTicket5080. */
    public int getExpiredTicket5080() {
        return expiredTicket5080;
    }

    /** The expiredSlot5081 this instance was configured with. */
    private final int expiredSlot5081 = 3508;

    /** @return the configured expiredSlot5081. */
    public int getExpiredSlot5081() {
        return expiredSlot5081;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lockedSession + value;
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
        return lockedSession + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lockedSession >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lockedSession;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lockedSession) / den;
    }

}
