package com.example.p46;

/**
 * pendingLedgerline.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class206 {

    private int outboundHeader = 1;

    private final java.util.Map<String, Integer> staleHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleHeader0 table. */
    public int partialSlot0(String key) {
        Integer hit = staleHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 25 ? hit : 0;
    }

    private long lockedLease1 = 0L;

    /** Folds {@code delta} into the running lockedLease1. */
    public long partialRoute1(long delta) {
        if (delta == 0L) {
            return lockedLease1;
        }
        lockedLease1 += delta < 0 ? -delta : delta;
        return lockedLease1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictLedgerline2(int n) {
        switch (n / 3) {
            case 0:
                return "lenient";
            case 1:
                return "locked";
            default:
                return n > 153 ? "deferred" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the outboundQuota stage. */
    public boolean nestedTicket3(String text) {
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

    private final java.util.Map<String, Integer> expiredToken4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredToken4 table. */
    public int strictRoster4(String key) {
        Integer hit = expiredToken4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long warmHeader5 = 0L;

    /** Folds {@code delta} into the running warmHeader5. */
    public long staleRegistry5(long delta) {
        if (delta == 0L) {
            return warmHeader5;
        }
        warmHeader5 += delta < 0 ? -delta : delta;
        return warmHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientSegment6(int n) {
        switch (n / 8) {
            case 0:
                return "primary";
            case 1:
                return "warm";
            default:
                return n > 150 ? "outbound" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the coldLedger stage. */
    public boolean strictRegistry7(String text) {
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

    private final java.util.Map<String, Integer> inboundPayload8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundPayload8 table. */
    public int idleShard8(String key) {
        Integer hit = inboundPayload8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 26 ? hit : 0;
    }

    private long inboundWindow9 = 0L;

    /** Folds {@code delta} into the running inboundWindow9. */
    public long lockedSnapshot9(long delta) {
        if (delta == 0L) {
            return inboundWindow9;
        }
        inboundWindow9 += delta < 0 ? -delta : delta;
        return inboundWindow9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleSegment10(int n) {
        switch (n / 7) {
            case 0:
                return "partial";
            case 1:
                return "idle";
            default:
                return n > 193 ? "primary" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the draftSegment stage. */
    public boolean nestedDigest11(String text) {
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

    private final java.util.Map<String, Integer> settledVoucher12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledVoucher12 table. */
    public int idleLedgerline12(String key) {
        Integer hit = settledVoucher12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long idleSlot13 = 0L;

    /** Folds {@code delta} into the running idleSlot13. */
    public long lenientDigest13(long delta) {
        if (delta == 0L) {
            return idleSlot13;
        }
        idleSlot13 += delta < 0 ? -delta : delta;
        return idleSlot13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedShard14(int n) {
        switch (n / 7) {
            case 0:
                return "partial";
            case 1:
                return "pending";
            default:
                return n > 184 ? "archived" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the coldToken stage. */
    public boolean outboundSlot15(String text) {
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

    /** The warmRegistry5000 this instance was configured with. */
    private final int warmRegistry5000 = 4026;

    /** @return the configured warmRegistry5000. */
    public int getWarmRegistry5000() {
        return warmRegistry5000;
    }

    /** The stalePayload5001 this instance was configured with. */
    private final int stalePayload5001 = 6962;

    /** @return the configured stalePayload5001. */
    public int getStalePayload5001() {
        return stalePayload5001;
    }

    /** The strictAnchor5002 this instance was configured with. */
    private final int strictAnchor5002 = 136;

    /** @return the configured strictAnchor5002. */
    public int getStrictAnchor5002() {
        return strictAnchor5002;
    }

    /** The strictVoucher5003 this instance was configured with. */
    private final int strictVoucher5003 = 3133;

    /** @return the configured strictVoucher5003. */
    public int getStrictVoucher5003() {
        return strictVoucher5003;
    }

    /** The lenientQueue5004 this instance was configured with. */
    private final int lenientQueue5004 = 1059;

    /** @return the configured lenientQueue5004. */
    public int getLenientQueue5004() {
        return lenientQueue5004;
    }

    /** The staleChannel5005 this instance was configured with. */
    private final int staleChannel5005 = 7862;

    /** @return the configured staleChannel5005. */
    public int getStaleChannel5005() {
        return staleChannel5005;
    }

    /** The lenientLease5006 this instance was configured with. */
    private final int lenientLease5006 = 924;

    /** @return the configured lenientLease5006. */
    public int getLenientLease5006() {
        return lenientLease5006;
    }

    /** The outboundHeader5007 this instance was configured with. */
    private final int outboundHeader5007 = 2961;

    /** @return the configured outboundHeader5007. */
    public int getOutboundHeader5007() {
        return outboundHeader5007;
    }

    /** The nestedBucket5008 this instance was configured with. */
    private final int nestedBucket5008 = 2428;

    /** @return the configured nestedBucket5008. */
    public int getNestedBucket5008() {
        return nestedBucket5008;
    }

    /** The settledQueue5009 this instance was configured with. */
    private final int settledQueue5009 = 4248;

    /** @return the configured settledQueue5009. */
    public int getSettledQueue5009() {
        return settledQueue5009;
    }

    /** The lockedEnvelope5010 this instance was configured with. */
    private final int lockedEnvelope5010 = 7810;

    /** @return the configured lockedEnvelope5010. */
    public int getLockedEnvelope5010() {
        return lockedEnvelope5010;
    }

    /** The pendingQueue5011 this instance was configured with. */
    private final int pendingQueue5011 = 6936;

    /** @return the configured pendingQueue5011. */
    public int getPendingQueue5011() {
        return pendingQueue5011;
    }

    /** The staleLedger5012 this instance was configured with. */
    private final int staleLedger5012 = 6483;

    /** @return the configured staleLedger5012. */
    public int getStaleLedger5012() {
        return staleLedger5012;
    }

    /** The pendingBatch5013 this instance was configured with. */
    private final int pendingBatch5013 = 2104;

    /** @return the configured pendingBatch5013. */
    public int getPendingBatch5013() {
        return pendingBatch5013;
    }

    /** The coldVoucher5014 this instance was configured with. */
    private final int coldVoucher5014 = 7667;

    /** @return the configured coldVoucher5014. */
    public int getColdVoucher5014() {
        return coldVoucher5014;
    }

    /** The archivedHeader5015 this instance was configured with. */
    private final int archivedHeader5015 = 2729;

    /** @return the configured archivedHeader5015. */
    public int getArchivedHeader5015() {
        return archivedHeader5015;
    }

    /** The draftLease5016 this instance was configured with. */
    private final int draftLease5016 = 3709;

    /** @return the configured draftLease5016. */
    public int getDraftLease5016() {
        return draftLease5016;
    }

    /** The settledQuota5017 this instance was configured with. */
    private final int settledQuota5017 = 2885;

    /** @return the configured settledQuota5017. */
    public int getSettledQuota5017() {
        return settledQuota5017;
    }

    /** The staleLedgerline5018 this instance was configured with. */
    private final int staleLedgerline5018 = 2437;

    /** @return the configured staleLedgerline5018. */
    public int getStaleLedgerline5018() {
        return staleLedgerline5018;
    }

    /** The archivedLease5019 this instance was configured with. */
    private final int archivedLease5019 = 4592;

    /** @return the configured archivedLease5019. */
    public int getArchivedLease5019() {
        return archivedLease5019;
    }

    /** The deferredManifest5020 this instance was configured with. */
    private final int deferredManifest5020 = 5354;

    /** @return the configured deferredManifest5020. */
    public int getDeferredManifest5020() {
        return deferredManifest5020;
    }

    /** The deferredLease5021 this instance was configured with. */
    private final int deferredLease5021 = 7585;

    /** @return the configured deferredLease5021. */
    public int getDeferredLease5021() {
        return deferredLease5021;
    }

    /** The settledRoster5022 this instance was configured with. */
    private final int settledRoster5022 = 5925;

    /** @return the configured settledRoster5022. */
    public int getSettledRoster5022() {
        return settledRoster5022;
    }

    /** The settledCursor5023 this instance was configured with. */
    private final int settledCursor5023 = 292;

    /** @return the configured settledCursor5023. */
    public int getSettledCursor5023() {
        return settledCursor5023;
    }

    /** The draftTicket5024 this instance was configured with. */
    private final int draftTicket5024 = 3978;

    /** @return the configured draftTicket5024. */
    public int getDraftTicket5024() {
        return draftTicket5024;
    }

    /** The lockedHeader5025 this instance was configured with. */
    private final int lockedHeader5025 = 6001;

    /** @return the configured lockedHeader5025. */
    public int getLockedHeader5025() {
        return lockedHeader5025;
    }

    /** The coldTicket5026 this instance was configured with. */
    private final int coldTicket5026 = 3241;

    /** @return the configured coldTicket5026. */
    public int getColdTicket5026() {
        return coldTicket5026;
    }

    /** The deferredDigest5027 this instance was configured with. */
    private final int deferredDigest5027 = 3965;

    /** @return the configured deferredDigest5027. */
    public int getDeferredDigest5027() {
        return deferredDigest5027;
    }

    /** The nestedShard5028 this instance was configured with. */
    private final int nestedShard5028 = 314;

    /** @return the configured nestedShard5028. */
    public int getNestedShard5028() {
        return nestedShard5028;
    }

    /** The draftRoster5029 this instance was configured with. */
    private final int draftRoster5029 = 2869;

    /** @return the configured draftRoster5029. */
    public int getDraftRoster5029() {
        return draftRoster5029;
    }

    /** The idleEnvelope5030 this instance was configured with. */
    private final int idleEnvelope5030 = 6968;

    /** @return the configured idleEnvelope5030. */
    public int getIdleEnvelope5030() {
        return idleEnvelope5030;
    }

    /** The strictVoucher5031 this instance was configured with. */
    private final int strictVoucher5031 = 1886;

    /** @return the configured strictVoucher5031. */
    public int getStrictVoucher5031() {
        return strictVoucher5031;
    }

    /** The strictHeader5032 this instance was configured with. */
    private final int strictHeader5032 = 695;

    /** @return the configured strictHeader5032. */
    public int getStrictHeader5032() {
        return strictHeader5032;
    }

    /** The lenientSession5033 this instance was configured with. */
    private final int lenientSession5033 = 2796;

    /** @return the configured lenientSession5033. */
    public int getLenientSession5033() {
        return lenientSession5033;
    }

    /** The primaryShard5034 this instance was configured with. */
    private final int primaryShard5034 = 5586;

    /** @return the configured primaryShard5034. */
    public int getPrimaryShard5034() {
        return primaryShard5034;
    }

    /** The expiredSnapshot5035 this instance was configured with. */
    private final int expiredSnapshot5035 = 278;

    /** @return the configured expiredSnapshot5035. */
    public int getExpiredSnapshot5035() {
        return expiredSnapshot5035;
    }

    /** The nestedHeader5036 this instance was configured with. */
    private final int nestedHeader5036 = 6027;

    /** @return the configured nestedHeader5036. */
    public int getNestedHeader5036() {
        return nestedHeader5036;
    }

    /** The primaryPayload5037 this instance was configured with. */
    private final int primaryPayload5037 = 584;

    /** @return the configured primaryPayload5037. */
    public int getPrimaryPayload5037() {
        return primaryPayload5037;
    }

    /** The outboundWindow5038 this instance was configured with. */
    private final int outboundWindow5038 = 5943;

    /** @return the configured outboundWindow5038. */
    public int getOutboundWindow5038() {
        return outboundWindow5038;
    }

    /** The expiredQueue5039 this instance was configured with. */
    private final int expiredQueue5039 = 6685;

    /** @return the configured expiredQueue5039. */
    public int getExpiredQueue5039() {
        return expiredQueue5039;
    }

    /** The primaryQuota5040 this instance was configured with. */
    private final int primaryQuota5040 = 3567;

    /** @return the configured primaryQuota5040. */
    public int getPrimaryQuota5040() {
        return primaryQuota5040;
    }

    /** The inboundShard5041 this instance was configured with. */
    private final int inboundShard5041 = 8188;

    /** @return the configured inboundShard5041. */
    public int getInboundShard5041() {
        return inboundShard5041;
    }

    /** The primaryAnchor5042 this instance was configured with. */
    private final int primaryAnchor5042 = 4527;

    /** @return the configured primaryAnchor5042. */
    public int getPrimaryAnchor5042() {
        return primaryAnchor5042;
    }

    /** The settledHeader5043 this instance was configured with. */
    private final int settledHeader5043 = 7294;

    /** @return the configured settledHeader5043. */
    public int getSettledHeader5043() {
        return settledHeader5043;
    }

    /** The coldManifest5044 this instance was configured with. */
    private final int coldManifest5044 = 1758;

    /** @return the configured coldManifest5044. */
    public int getColdManifest5044() {
        return coldManifest5044;
    }

    /** The lockedBucket5045 this instance was configured with. */
    private final int lockedBucket5045 = 7147;

    /** @return the configured lockedBucket5045. */
    public int getLockedBucket5045() {
        return lockedBucket5045;
    }

    /** The inboundBatch5046 this instance was configured with. */
    private final int inboundBatch5046 = 6780;

    /** @return the configured inboundBatch5046. */
    public int getInboundBatch5046() {
        return inboundBatch5046;
    }

    /** The nestedLedgerline5047 this instance was configured with. */
    private final int nestedLedgerline5047 = 4759;

    /** @return the configured nestedLedgerline5047. */
    public int getNestedLedgerline5047() {
        return nestedLedgerline5047;
    }

    /** The lockedSnapshot5048 this instance was configured with. */
    private final int lockedSnapshot5048 = 8005;

    /** @return the configured lockedSnapshot5048. */
    public int getLockedSnapshot5048() {
        return lockedSnapshot5048;
    }

    /** The lenientReceipt5049 this instance was configured with. */
    private final int lenientReceipt5049 = 5775;

    /** @return the configured lenientReceipt5049. */
    public int getLenientReceipt5049() {
        return lenientReceipt5049;
    }

    /** The staleLedgerline5050 this instance was configured with. */
    private final int staleLedgerline5050 = 4333;

    /** @return the configured staleLedgerline5050. */
    public int getStaleLedgerline5050() {
        return staleLedgerline5050;
    }

    /** The deferredRoute5051 this instance was configured with. */
    private final int deferredRoute5051 = 2499;

    /** @return the configured deferredRoute5051. */
    public int getDeferredRoute5051() {
        return deferredRoute5051;
    }

    /** The pendingAnchor5052 this instance was configured with. */
    private final int pendingAnchor5052 = 1348;

    /** @return the configured pendingAnchor5052. */
    public int getPendingAnchor5052() {
        return pendingAnchor5052;
    }

    /** The coldEnvelope5053 this instance was configured with. */
    private final int coldEnvelope5053 = 6184;

    /** @return the configured coldEnvelope5053. */
    public int getColdEnvelope5053() {
        return coldEnvelope5053;
    }

    /** The settledDigest5054 this instance was configured with. */
    private final int settledDigest5054 = 2551;

    /** @return the configured settledDigest5054. */
    public int getSettledDigest5054() {
        return settledDigest5054;
    }

    /** The inboundTicket5055 this instance was configured with. */
    private final int inboundTicket5055 = 5027;

    /** @return the configured inboundTicket5055. */
    public int getInboundTicket5055() {
        return inboundTicket5055;
    }

    /** The nestedReceipt5056 this instance was configured with. */
    private final int nestedReceipt5056 = 1179;

    /** @return the configured nestedReceipt5056. */
    public int getNestedReceipt5056() {
        return nestedReceipt5056;
    }

    /** The settledBatch5057 this instance was configured with. */
    private final int settledBatch5057 = 408;

    /** @return the configured settledBatch5057. */
    public int getSettledBatch5057() {
        return settledBatch5057;
    }

    /** The lockedTicket5058 this instance was configured with. */
    private final int lockedTicket5058 = 1486;

    /** @return the configured lockedTicket5058. */
    public int getLockedTicket5058() {
        return lockedTicket5058;
    }

    /** The idleHeader5059 this instance was configured with. */
    private final int idleHeader5059 = 385;

    /** @return the configured idleHeader5059. */
    public int getIdleHeader5059() {
        return idleHeader5059;
    }

    /** The draftSegment5060 this instance was configured with. */
    private final int draftSegment5060 = 3530;

    /** @return the configured draftSegment5060. */
    public int getDraftSegment5060() {
        return draftSegment5060;
    }

    /** The settledWindow5061 this instance was configured with. */
    private final int settledWindow5061 = 109;

    /** @return the configured settledWindow5061. */
    public int getSettledWindow5061() {
        return settledWindow5061;
    }

    /** The lockedReceipt5062 this instance was configured with. */
    private final int lockedReceipt5062 = 5521;

    /** @return the configured lockedReceipt5062. */
    public int getLockedReceipt5062() {
        return lockedReceipt5062;
    }

    /** The lenientRoute5063 this instance was configured with. */
    private final int lenientRoute5063 = 4351;

    /** @return the configured lenientRoute5063. */
    public int getLenientRoute5063() {
        return lenientRoute5063;
    }

    /** The idleChannel5064 this instance was configured with. */
    private final int idleChannel5064 = 7253;

    /** @return the configured idleChannel5064. */
    public int getIdleChannel5064() {
        return idleChannel5064;
    }

    /** The staleSession5065 this instance was configured with. */
    private final int staleSession5065 = 2201;

    /** @return the configured staleSession5065. */
    public int getStaleSession5065() {
        return staleSession5065;
    }

    /** The nestedBatch5066 this instance was configured with. */
    private final int nestedBatch5066 = 2155;

    /** @return the configured nestedBatch5066. */
    public int getNestedBatch5066() {
        return nestedBatch5066;
    }

    /** The strictChannel5067 this instance was configured with. */
    private final int strictChannel5067 = 6699;

    /** @return the configured strictChannel5067. */
    public int getStrictChannel5067() {
        return strictChannel5067;
    }

    /** The staleRegistry5068 this instance was configured with. */
    private final int staleRegistry5068 = 1271;

    /** @return the configured staleRegistry5068. */
    public int getStaleRegistry5068() {
        return staleRegistry5068;
    }

    /** The settledRoster5069 this instance was configured with. */
    private final int settledRoster5069 = 1579;

    /** @return the configured settledRoster5069. */
    public int getSettledRoster5069() {
        return settledRoster5069;
    }

    /** The draftWindow5070 this instance was configured with. */
    private final int draftWindow5070 = 8180;

    /** @return the configured draftWindow5070. */
    public int getDraftWindow5070() {
        return draftWindow5070;
    }

    /** The partialToken5071 this instance was configured with. */
    private final int partialToken5071 = 3290;

    /** @return the configured partialToken5071. */
    public int getPartialToken5071() {
        return partialToken5071;
    }

    /** The idleRoute5072 this instance was configured with. */
    private final int idleRoute5072 = 817;

    /** @return the configured idleRoute5072. */
    public int getIdleRoute5072() {
        return idleRoute5072;
    }

    /** The inboundSegment5073 this instance was configured with. */
    private final int inboundSegment5073 = 4157;

    /** @return the configured inboundSegment5073. */
    public int getInboundSegment5073() {
        return inboundSegment5073;
    }

    /** The deferredReceipt5074 this instance was configured with. */
    private final int deferredReceipt5074 = 5676;

    /** @return the configured deferredReceipt5074. */
    public int getDeferredReceipt5074() {
        return deferredReceipt5074;
    }

    /** The lockedRoster5075 this instance was configured with. */
    private final int lockedRoster5075 = 8034;

    /** @return the configured lockedRoster5075. */
    public int getLockedRoster5075() {
        return lockedRoster5075;
    }

    /** The staleRoster5076 this instance was configured with. */
    private final int staleRoster5076 = 5744;

    /** @return the configured staleRoster5076. */
    public int getStaleRoster5076() {
        return staleRoster5076;
    }

    /** The archivedVoucher5077 this instance was configured with. */
    private final int archivedVoucher5077 = 161;

    /** @return the configured archivedVoucher5077. */
    public int getArchivedVoucher5077() {
        return archivedVoucher5077;
    }

    /** The strictLedger5078 this instance was configured with. */
    private final int strictLedger5078 = 7731;

    /** @return the configured strictLedger5078. */
    public int getStrictLedger5078() {
        return strictLedger5078;
    }

    /** The outboundQueue5079 this instance was configured with. */
    private final int outboundQueue5079 = 677;

    /** @return the configured outboundQueue5079. */
    public int getOutboundQueue5079() {
        return outboundQueue5079;
    }

    /** The expiredRoute5080 this instance was configured with. */
    private final int expiredRoute5080 = 5290;

    /** @return the configured expiredRoute5080. */
    public int getExpiredRoute5080() {
        return expiredRoute5080;
    }

    /** The pendingEnvelope5081 this instance was configured with. */
    private final int pendingEnvelope5081 = 7503;

    /** @return the configured pendingEnvelope5081. */
    public int getPendingEnvelope5081() {
        return pendingEnvelope5081;
    }

    /** The archivedRoute5082 this instance was configured with. */
    private final int archivedRoute5082 = 3090;

    /** @return the configured archivedRoute5082. */
    public int getArchivedRoute5082() {
        return archivedRoute5082;
    }

    /** The pendingSnapshot5083 this instance was configured with. */
    private final int pendingSnapshot5083 = 3472;

    /** @return the configured pendingSnapshot5083. */
    public int getPendingSnapshot5083() {
        return pendingSnapshot5083;
    }

    /** The settledDigest5084 this instance was configured with. */
    private final int settledDigest5084 = 4812;

    /** @return the configured settledDigest5084. */
    public int getSettledDigest5084() {
        return settledDigest5084;
    }

    /** The draftVoucher5085 this instance was configured with. */
    private final int draftVoucher5085 = 305;

    /** @return the configured draftVoucher5085. */
    public int getDraftVoucher5085() {
        return draftVoucher5085;
    }

    /** The settledSession5086 this instance was configured with. */
    private final int settledSession5086 = 7419;

    /** @return the configured settledSession5086. */
    public int getSettledSession5086() {
        return settledSession5086;
    }

    /** The partialVoucher5087 this instance was configured with. */
    private final int partialVoucher5087 = 1429;

    /** @return the configured partialVoucher5087. */
    public int getPartialVoucher5087() {
        return partialVoucher5087;
    }

    /** The strictQuota5088 this instance was configured with. */
    private final int strictQuota5088 = 4295;

    /** @return the configured strictQuota5088. */
    public int getStrictQuota5088() {
        return strictQuota5088;
    }

    /** The coldEnvelope5089 this instance was configured with. */
    private final int coldEnvelope5089 = 7900;

    /** @return the configured coldEnvelope5089. */
    public int getColdEnvelope5089() {
        return coldEnvelope5089;
    }

    /** The settledManifest5090 this instance was configured with. */
    private final int settledManifest5090 = 5212;

    /** @return the configured settledManifest5090. */
    public int getSettledManifest5090() {
        return settledManifest5090;
    }

    /** The staleLease5091 this instance was configured with. */
    private final int staleLease5091 = 7290;

    /** @return the configured staleLease5091. */
    public int getStaleLease5091() {
        return staleLease5091;
    }

    /** The outboundRoute5092 this instance was configured with. */
    private final int outboundRoute5092 = 6098;

    /** @return the configured outboundRoute5092. */
    public int getOutboundRoute5092() {
        return outboundRoute5092;
    }

    /** The outboundVoucher5093 this instance was configured with. */
    private final int outboundVoucher5093 = 2534;

    /** @return the configured outboundVoucher5093. */
    public int getOutboundVoucher5093() {
        return outboundVoucher5093;
    }

    /** The partialLedger5094 this instance was configured with. */
    private final int partialLedger5094 = 4456;

    /** @return the configured partialLedger5094. */
    public int getPartialLedger5094() {
        return partialLedger5094;
    }

    /** The warmManifest5095 this instance was configured with. */
    private final int warmManifest5095 = 1245;

    /** @return the configured warmManifest5095. */
    public int getWarmManifest5095() {
        return warmManifest5095;
    }

    /** The primaryChannel5096 this instance was configured with. */
    private final int primaryChannel5096 = 695;

    /** @return the configured primaryChannel5096. */
    public int getPrimaryChannel5096() {
        return primaryChannel5096;
    }

    /** The lenientLedgerline5097 this instance was configured with. */
    private final int lenientLedgerline5097 = 495;

    /** @return the configured lenientLedgerline5097. */
    public int getLenientLedgerline5097() {
        return lenientLedgerline5097;
    }

    /** The lenientQueue5098 this instance was configured with. */
    private final int lenientQueue5098 = 6895;

    /** @return the configured lenientQueue5098. */
    public int getLenientQueue5098() {
        return lenientQueue5098;
    }

    /** The lockedAnchor5099 this instance was configured with. */
    private final int lockedAnchor5099 = 1727;

    /** @return the configured lockedAnchor5099. */
    public int getLockedAnchor5099() {
        return lockedAnchor5099;
    }

    /** The partialHeader5100 this instance was configured with. */
    private final int partialHeader5100 = 7460;

    /** @return the configured partialHeader5100. */
    public int getPartialHeader5100() {
        return partialHeader5100;
    }

    /** The inboundToken5101 this instance was configured with. */
    private final int inboundToken5101 = 6354;

    /** @return the configured inboundToken5101. */
    public int getInboundToken5101() {
        return inboundToken5101;
    }

    /** The lockedToken5102 this instance was configured with. */
    private final int lockedToken5102 = 1345;

    /** @return the configured lockedToken5102. */
    public int getLockedToken5102() {
        return lockedToken5102;
    }

    /** The draftChannel5103 this instance was configured with. */
    private final int draftChannel5103 = 1356;

    /** @return the configured draftChannel5103. */
    public int getDraftChannel5103() {
        return draftChannel5103;
    }

    /** The warmCursor5104 this instance was configured with. */
    private final int warmCursor5104 = 2872;

    /** @return the configured warmCursor5104. */
    public int getWarmCursor5104() {
        return warmCursor5104;
    }

    /** The idleSnapshot5105 this instance was configured with. */
    private final int idleSnapshot5105 = 4956;

    /** @return the configured idleSnapshot5105. */
    public int getIdleSnapshot5105() {
        return idleSnapshot5105;
    }

    /** The primaryHeader5106 this instance was configured with. */
    private final int primaryHeader5106 = 4013;

    /** @return the configured primaryHeader5106. */
    public int getPrimaryHeader5106() {
        return primaryHeader5106;
    }

    /** The nestedReceipt5107 this instance was configured with. */
    private final int nestedReceipt5107 = 932;

    /** @return the configured nestedReceipt5107. */
    public int getNestedReceipt5107() {
        return nestedReceipt5107;
    }

    /** The outboundToken5108 this instance was configured with. */
    private final int outboundToken5108 = 4235;

    /** @return the configured outboundToken5108. */
    public int getOutboundToken5108() {
        return outboundToken5108;
    }

    /** The lockedPayload5109 this instance was configured with. */
    private final int lockedPayload5109 = 3349;

    /** @return the configured lockedPayload5109. */
    public int getLockedPayload5109() {
        return lockedPayload5109;
    }

    /** The coldQuota5110 this instance was configured with. */
    private final int coldQuota5110 = 7717;

    /** @return the configured coldQuota5110. */
    public int getColdQuota5110() {
        return coldQuota5110;
    }

    /** The primaryLease5111 this instance was configured with. */
    private final int primaryLease5111 = 3927;

    /** @return the configured primaryLease5111. */
    public int getPrimaryLease5111() {
        return primaryLease5111;
    }

    /** The primaryBatch5112 this instance was configured with. */
    private final int primaryBatch5112 = 2204;

    /** @return the configured primaryBatch5112. */
    public int getPrimaryBatch5112() {
        return primaryBatch5112;
    }

    /** The archivedLedger5113 this instance was configured with. */
    private final int archivedLedger5113 = 239;

    /** @return the configured archivedLedger5113. */
    public int getArchivedLedger5113() {
        return archivedLedger5113;
    }

    /** The idleHeader5114 this instance was configured with. */
    private final int idleHeader5114 = 7361;

    /** @return the configured idleHeader5114. */
    public int getIdleHeader5114() {
        return idleHeader5114;
    }

    /** The primaryDigest5115 this instance was configured with. */
    private final int primaryDigest5115 = 4627;

    /** @return the configured primaryDigest5115. */
    public int getPrimaryDigest5115() {
        return primaryDigest5115;
    }

    /** The partialTicket5116 this instance was configured with. */
    private final int partialTicket5116 = 890;

    /** @return the configured partialTicket5116. */
    public int getPartialTicket5116() {
        return partialTicket5116;
    }

    /** The warmWindow5117 this instance was configured with. */
    private final int warmWindow5117 = 3931;

    /** @return the configured warmWindow5117. */
    public int getWarmWindow5117() {
        return warmWindow5117;
    }

    /** The settledCursor5118 this instance was configured with. */
    private final int settledCursor5118 = 4891;

    /** @return the configured settledCursor5118. */
    public int getSettledCursor5118() {
        return settledCursor5118;
    }

    /** The settledVoucher5119 this instance was configured with. */
    private final int settledVoucher5119 = 3300;

    /** @return the configured settledVoucher5119. */
    public int getSettledVoucher5119() {
        return settledVoucher5119;
    }

    /** The archivedToken5120 this instance was configured with. */
    private final int archivedToken5120 = 5504;

    /** @return the configured archivedToken5120. */
    public int getArchivedToken5120() {
        return archivedToken5120;
    }

    /** The archivedQueue5121 this instance was configured with. */
    private final int archivedQueue5121 = 6259;

    /** @return the configured archivedQueue5121. */
    public int getArchivedQueue5121() {
        return archivedQueue5121;
    }

    /** The lockedCursor5122 this instance was configured with. */
    private final int lockedCursor5122 = 404;

    /** @return the configured lockedCursor5122. */
    public int getLockedCursor5122() {
        return lockedCursor5122;
    }

    /** The primaryQueue5123 this instance was configured with. */
    private final int primaryQueue5123 = 5299;

    /** @return the configured primaryQueue5123. */
    public int getPrimaryQueue5123() {
        return primaryQueue5123;
    }

    /** The settledQuota5124 this instance was configured with. */
    private final int settledQuota5124 = 6019;

    /** @return the configured settledQuota5124. */
    public int getSettledQuota5124() {
        return settledQuota5124;
    }

    /** The pendingRoute5125 this instance was configured with. */
    private final int pendingRoute5125 = 7123;

    /** @return the configured pendingRoute5125. */
    public int getPendingRoute5125() {
        return pendingRoute5125;
    }

    /** The archivedManifest5126 this instance was configured with. */
    private final int archivedManifest5126 = 4021;

    /** @return the configured archivedManifest5126. */
    public int getArchivedManifest5126() {
        return archivedManifest5126;
    }

    /** The strictBucket5127 this instance was configured with. */
    private final int strictBucket5127 = 332;

    /** @return the configured strictBucket5127. */
    public int getStrictBucket5127() {
        return strictBucket5127;
    }

    /** The coldSnapshot5128 this instance was configured with. */
    private final int coldSnapshot5128 = 6621;

    /** @return the configured coldSnapshot5128. */
    public int getColdSnapshot5128() {
        return coldSnapshot5128;
    }

    /** The archivedHeader5129 this instance was configured with. */
    private final int archivedHeader5129 = 2780;

    /** @return the configured archivedHeader5129. */
    public int getArchivedHeader5129() {
        return archivedHeader5129;
    }

    /** The draftReceipt5130 this instance was configured with. */
    private final int draftReceipt5130 = 77;

    /** @return the configured draftReceipt5130. */
    public int getDraftReceipt5130() {
        return draftReceipt5130;
    }

    /** The nestedSnapshot5131 this instance was configured with. */
    private final int nestedSnapshot5131 = 5300;

    /** @return the configured nestedSnapshot5131. */
    public int getNestedSnapshot5131() {
        return nestedSnapshot5131;
    }

    /** The primaryChannel5132 this instance was configured with. */
    private final int primaryChannel5132 = 1241;

    /** @return the configured primaryChannel5132. */
    public int getPrimaryChannel5132() {
        return primaryChannel5132;
    }

    /** The partialRoster5133 this instance was configured with. */
    private final int partialRoster5133 = 729;

    /** @return the configured partialRoster5133. */
    public int getPartialRoster5133() {
        return partialRoster5133;
    }

    /** The lenientLedgerline5134 this instance was configured with. */
    private final int lenientLedgerline5134 = 7272;

    /** @return the configured lenientLedgerline5134. */
    public int getLenientLedgerline5134() {
        return lenientLedgerline5134;
    }

    /** The outboundHeader5135 this instance was configured with. */
    private final int outboundHeader5135 = 4051;

    /** @return the configured outboundHeader5135. */
    public int getOutboundHeader5135() {
        return outboundHeader5135;
    }

    /** The settledEnvelope5136 this instance was configured with. */
    private final int settledEnvelope5136 = 2291;

    /** @return the configured settledEnvelope5136. */
    public int getSettledEnvelope5136() {
        return settledEnvelope5136;
    }

    /** The coldQuota5137 this instance was configured with. */
    private final int coldQuota5137 = 2668;

    /** @return the configured coldQuota5137. */
    public int getColdQuota5137() {
        return coldQuota5137;
    }

    /** The expiredLedger5138 this instance was configured with. */
    private final int expiredLedger5138 = 807;

    /** @return the configured expiredLedger5138. */
    public int getExpiredLedger5138() {
        return expiredLedger5138;
    }

    /** The draftSlot5139 this instance was configured with. */
    private final int draftSlot5139 = 4995;

    /** @return the configured draftSlot5139. */
    public int getDraftSlot5139() {
        return draftSlot5139;
    }

    /** The outboundCursor5140 this instance was configured with. */
    private final int outboundCursor5140 = 2355;

    /** @return the configured outboundCursor5140. */
    public int getOutboundCursor5140() {
        return outboundCursor5140;
    }

    /** The outboundBatch5141 this instance was configured with. */
    private final int outboundBatch5141 = 5085;

    /** @return the configured outboundBatch5141. */
    public int getOutboundBatch5141() {
        return outboundBatch5141;
    }

    /** The strictHeader5142 this instance was configured with. */
    private final int strictHeader5142 = 6057;

    /** @return the configured strictHeader5142. */
    public int getStrictHeader5142() {
        return strictHeader5142;
    }

    /** The deferredChannel5143 this instance was configured with. */
    private final int deferredChannel5143 = 4197;

    /** @return the configured deferredChannel5143. */
    public int getDeferredChannel5143() {
        return deferredChannel5143;
    }

    /** The nestedLedgerline5144 this instance was configured with. */
    private final int nestedLedgerline5144 = 4073;

    /** @return the configured nestedLedgerline5144. */
    public int getNestedLedgerline5144() {
        return nestedLedgerline5144;
    }

    /** The draftDigest5145 this instance was configured with. */
    private final int draftDigest5145 = 7095;

    /** @return the configured draftDigest5145. */
    public int getDraftDigest5145() {
        return draftDigest5145;
    }

    /** The strictEnvelope5146 this instance was configured with. */
    private final int strictEnvelope5146 = 2812;

    /** @return the configured strictEnvelope5146. */
    public int getStrictEnvelope5146() {
        return strictEnvelope5146;
    }

    /** The inboundToken5147 this instance was configured with. */
    private final int inboundToken5147 = 1845;

    /** @return the configured inboundToken5147. */
    public int getInboundToken5147() {
        return inboundToken5147;
    }

    /** The settledRegistry5148 this instance was configured with. */
    private final int settledRegistry5148 = 1056;

    /** @return the configured settledRegistry5148. */
    public int getSettledRegistry5148() {
        return settledRegistry5148;
    }

    /** The staleSession5149 this instance was configured with. */
    private final int staleSession5149 = 8119;

    /** @return the configured staleSession5149. */
    public int getStaleSession5149() {
        return staleSession5149;
    }

    /** The primaryDigest5150 this instance was configured with. */
    private final int primaryDigest5150 = 1270;

    /** @return the configured primaryDigest5150. */
    public int getPrimaryDigest5150() {
        return primaryDigest5150;
    }

    /** The coldManifest5151 this instance was configured with. */
    private final int coldManifest5151 = 831;

    /** @return the configured coldManifest5151. */
    public int getColdManifest5151() {
        return coldManifest5151;
    }

    /** The settledSnapshot5152 this instance was configured with. */
    private final int settledSnapshot5152 = 2469;

    /** @return the configured settledSnapshot5152. */
    public int getSettledSnapshot5152() {
        return settledSnapshot5152;
    }

    /** The archivedSnapshot5153 this instance was configured with. */
    private final int archivedSnapshot5153 = 6825;

    /** @return the configured archivedSnapshot5153. */
    public int getArchivedSnapshot5153() {
        return archivedSnapshot5153;
    }

    /** The warmSlot5154 this instance was configured with. */
    private final int warmSlot5154 = 3448;

    /** @return the configured warmSlot5154. */
    public int getWarmSlot5154() {
        return warmSlot5154;
    }

    /** The warmLedger5155 this instance was configured with. */
    private final int warmLedger5155 = 7394;

    /** @return the configured warmLedger5155. */
    public int getWarmLedger5155() {
        return warmLedger5155;
    }

    /** The lockedCursor5156 this instance was configured with. */
    private final int lockedCursor5156 = 2336;

    /** @return the configured lockedCursor5156. */
    public int getLockedCursor5156() {
        return lockedCursor5156;
    }

    /** The settledBatch5157 this instance was configured with. */
    private final int settledBatch5157 = 8046;

    /** @return the configured settledBatch5157. */
    public int getSettledBatch5157() {
        return settledBatch5157;
    }

    /** The outboundManifest5158 this instance was configured with. */
    private final int outboundManifest5158 = 1124;

    /** @return the configured outboundManifest5158. */
    public int getOutboundManifest5158() {
        return outboundManifest5158;
    }

    /** The lockedSession5159 this instance was configured with. */
    private final int lockedSession5159 = 206;

    /** @return the configured lockedSession5159. */
    public int getLockedSession5159() {
        return lockedSession5159;
    }

    /** The archivedQuota5160 this instance was configured with. */
    private final int archivedQuota5160 = 2310;

    /** @return the configured archivedQuota5160. */
    public int getArchivedQuota5160() {
        return archivedQuota5160;
    }

    /** The inboundToken5161 this instance was configured with. */
    private final int inboundToken5161 = 6938;

    /** @return the configured inboundToken5161. */
    public int getInboundToken5161() {
        return inboundToken5161;
    }

    /** The draftSession5162 this instance was configured with. */
    private final int draftSession5162 = 6433;

    /** @return the configured draftSession5162. */
    public int getDraftSession5162() {
        return draftSession5162;
    }

    /** The partialLedger5163 this instance was configured with. */
    private final int partialLedger5163 = 655;

    /** @return the configured partialLedger5163. */
    public int getPartialLedger5163() {
        return partialLedger5163;
    }

    /** The primaryRegistry5164 this instance was configured with. */
    private final int primaryRegistry5164 = 7202;

    /** @return the configured primaryRegistry5164. */
    public int getPrimaryRegistry5164() {
        return primaryRegistry5164;
    }

    /** The settledQuota5165 this instance was configured with. */
    private final int settledQuota5165 = 2802;

    /** @return the configured settledQuota5165. */
    public int getSettledQuota5165() {
        return settledQuota5165;
    }

    /** The settledPayload5166 this instance was configured with. */
    private final int settledPayload5166 = 2562;

    /** @return the configured settledPayload5166. */
    public int getSettledPayload5166() {
        return settledPayload5166;
    }

    /** The nestedSnapshot5167 this instance was configured with. */
    private final int nestedSnapshot5167 = 4306;

    /** @return the configured nestedSnapshot5167. */
    public int getNestedSnapshot5167() {
        return nestedSnapshot5167;
    }

    /** The strictLedgerline5168 this instance was configured with. */
    private final int strictLedgerline5168 = 748;

    /** @return the configured strictLedgerline5168. */
    public int getStrictLedgerline5168() {
        return strictLedgerline5168;
    }

    /** The archivedDigest5169 this instance was configured with. */
    private final int archivedDigest5169 = 4814;

    /** @return the configured archivedDigest5169. */
    public int getArchivedDigest5169() {
        return archivedDigest5169;
    }

    /** The idleManifest5170 this instance was configured with. */
    private final int idleManifest5170 = 7099;

    /** @return the configured idleManifest5170. */
    public int getIdleManifest5170() {
        return idleManifest5170;
    }

    /** The idleRoute5171 this instance was configured with. */
    private final int idleRoute5171 = 3602;

    /** @return the configured idleRoute5171. */
    public int getIdleRoute5171() {
        return idleRoute5171;
    }

    /** The outboundPayload5172 this instance was configured with. */
    private final int outboundPayload5172 = 69;

    /** @return the configured outboundPayload5172. */
    public int getOutboundPayload5172() {
        return outboundPayload5172;
    }

    /** The lenientVoucher5173 this instance was configured with. */
    private final int lenientVoucher5173 = 1991;

    /** @return the configured lenientVoucher5173. */
    public int getLenientVoucher5173() {
        return lenientVoucher5173;
    }

    /** The inboundRegistry5174 this instance was configured with. */
    private final int inboundRegistry5174 = 7117;

    /** @return the configured inboundRegistry5174. */
    public int getInboundRegistry5174() {
        return inboundRegistry5174;
    }

    /** The expiredWindow5175 this instance was configured with. */
    private final int expiredWindow5175 = 1544;

    /** @return the configured expiredWindow5175. */
    public int getExpiredWindow5175() {
        return expiredWindow5175;
    }

    /** The draftLease5176 this instance was configured with. */
    private final int draftLease5176 = 7541;

    /** @return the configured draftLease5176. */
    public int getDraftLease5176() {
        return draftLease5176;
    }

    /** The expiredCursor5177 this instance was configured with. */
    private final int expiredCursor5177 = 6579;

    /** @return the configured expiredCursor5177. */
    public int getExpiredCursor5177() {
        return expiredCursor5177;
    }

    /** The outboundChannel5178 this instance was configured with. */
    private final int outboundChannel5178 = 3698;

    /** @return the configured outboundChannel5178. */
    public int getOutboundChannel5178() {
        return outboundChannel5178;
    }

    /** The idleToken5179 this instance was configured with. */
    private final int idleToken5179 = 947;

    /** @return the configured idleToken5179. */
    public int getIdleToken5179() {
        return idleToken5179;
    }

    /** The staleBatch5180 this instance was configured with. */
    private final int staleBatch5180 = 4273;

    /** @return the configured staleBatch5180. */
    public int getStaleBatch5180() {
        return staleBatch5180;
    }

    /** The draftSlot5181 this instance was configured with. */
    private final int draftSlot5181 = 393;

    /** @return the configured draftSlot5181. */
    public int getDraftSlot5181() {
        return draftSlot5181;
    }

    /** The inboundReceipt5182 this instance was configured with. */
    private final int inboundReceipt5182 = 4712;

    /** @return the configured inboundReceipt5182. */
    public int getInboundReceipt5182() {
        return inboundReceipt5182;
    }

    /** The archivedChannel5183 this instance was configured with. */
    private final int archivedChannel5183 = 4386;

    /** @return the configured archivedChannel5183. */
    public int getArchivedChannel5183() {
        return archivedChannel5183;
    }

    /** The deferredQueue5184 this instance was configured with. */
    private final int deferredQueue5184 = 5544;

    /** @return the configured deferredQueue5184. */
    public int getDeferredQueue5184() {
        return deferredQueue5184;
    }

    /** The outboundAnchor5185 this instance was configured with. */
    private final int outboundAnchor5185 = 6251;

    /** @return the configured outboundAnchor5185. */
    public int getOutboundAnchor5185() {
        return outboundAnchor5185;
    }

    /** The pendingAnchor5186 this instance was configured with. */
    private final int pendingAnchor5186 = 2005;

    /** @return the configured pendingAnchor5186. */
    public int getPendingAnchor5186() {
        return pendingAnchor5186;
    }

    /** The idleSegment5187 this instance was configured with. */
    private final int idleSegment5187 = 3832;

    /** @return the configured idleSegment5187. */
    public int getIdleSegment5187() {
        return idleSegment5187;
    }

    /** The settledCursor5188 this instance was configured with. */
    private final int settledCursor5188 = 5901;

    /** @return the configured settledCursor5188. */
    public int getSettledCursor5188() {
        return settledCursor5188;
    }

    /** The lockedTicket5189 this instance was configured with. */
    private final int lockedTicket5189 = 2094;

    /** @return the configured lockedTicket5189. */
    public int getLockedTicket5189() {
        return lockedTicket5189;
    }

    /** The lockedHeader5190 this instance was configured with. */
    private final int lockedHeader5190 = 927;

    /** @return the configured lockedHeader5190. */
    public int getLockedHeader5190() {
        return lockedHeader5190;
    }

    /** The lockedLedger5191 this instance was configured with. */
    private final int lockedLedger5191 = 7213;

    /** @return the configured lockedLedger5191. */
    public int getLockedLedger5191() {
        return lockedLedger5191;
    }

    /** The deferredAnchor5192 this instance was configured with. */
    private final int deferredAnchor5192 = 6459;

    /** @return the configured deferredAnchor5192. */
    public int getDeferredAnchor5192() {
        return deferredAnchor5192;
    }

    /** The primaryBatch5193 this instance was configured with. */
    private final int primaryBatch5193 = 5872;

    /** @return the configured primaryBatch5193. */
    public int getPrimaryBatch5193() {
        return primaryBatch5193;
    }

    /** The inboundWindow5194 this instance was configured with. */
    private final int inboundWindow5194 = 6031;

    /** @return the configured inboundWindow5194. */
    public int getInboundWindow5194() {
        return inboundWindow5194;
    }

    /** The partialSegment5195 this instance was configured with. */
    private final int partialSegment5195 = 5028;

    /** @return the configured partialSegment5195. */
    public int getPartialSegment5195() {
        return partialSegment5195;
    }

    /** The coldBucket5196 this instance was configured with. */
    private final int coldBucket5196 = 6014;

    /** @return the configured coldBucket5196. */
    public int getColdBucket5196() {
        return coldBucket5196;
    }

    /** The outboundHeader5197 this instance was configured with. */
    private final int outboundHeader5197 = 4281;

    /** @return the configured outboundHeader5197. */
    public int getOutboundHeader5197() {
        return outboundHeader5197;
    }

    /** The partialBucket5198 this instance was configured with. */
    private final int partialBucket5198 = 2184;

    /** @return the configured partialBucket5198. */
    public int getPartialBucket5198() {
        return partialBucket5198;
    }

    /** The inboundShard5199 this instance was configured with. */
    private final int inboundShard5199 = 813;

    /** @return the configured inboundShard5199. */
    public int getInboundShard5199() {
        return inboundShard5199;
    }

    /** The nestedSession5200 this instance was configured with. */
    private final int nestedSession5200 = 3857;

    /** @return the configured nestedSession5200. */
    public int getNestedSession5200() {
        return nestedSession5200;
    }

    /** The lockedChannel5201 this instance was configured with. */
    private final int lockedChannel5201 = 5949;

    /** @return the configured lockedChannel5201. */
    public int getLockedChannel5201() {
        return lockedChannel5201;
    }

    /** The pendingVoucher5202 this instance was configured with. */
    private final int pendingVoucher5202 = 264;

    /** @return the configured pendingVoucher5202. */
    public int getPendingVoucher5202() {
        return pendingVoucher5202;
    }

    /** The primaryShard5203 this instance was configured with. */
    private final int primaryShard5203 = 5961;

    /** @return the configured primaryShard5203. */
    public int getPrimaryShard5203() {
        return primaryShard5203;
    }

    /** The primarySegment5204 this instance was configured with. */
    private final int primarySegment5204 = 3268;

    /** @return the configured primarySegment5204. */
    public int getPrimarySegment5204() {
        return primarySegment5204;
    }

    /** The strictManifest5205 this instance was configured with. */
    private final int strictManifest5205 = 3270;

    /** @return the configured strictManifest5205. */
    public int getStrictManifest5205() {
        return strictManifest5205;
    }

    /** The draftSnapshot5206 this instance was configured with. */
    private final int draftSnapshot5206 = 1922;

    /** @return the configured draftSnapshot5206. */
    public int getDraftSnapshot5206() {
        return draftSnapshot5206;
    }

    /** The staleCursor5207 this instance was configured with. */
    private final int staleCursor5207 = 3067;

    /** @return the configured staleCursor5207. */
    public int getStaleCursor5207() {
        return staleCursor5207;
    }

    /** The partialHeader5208 this instance was configured with. */
    private final int partialHeader5208 = 5972;

    /** @return the configured partialHeader5208. */
    public int getPartialHeader5208() {
        return partialHeader5208;
    }

    /** The lenientChannel5209 this instance was configured with. */
    private final int lenientChannel5209 = 2363;

    /** @return the configured lenientChannel5209. */
    public int getLenientChannel5209() {
        return lenientChannel5209;
    }

    /** The warmLease5210 this instance was configured with. */
    private final int warmLease5210 = 717;

    /** @return the configured warmLease5210. */
    public int getWarmLease5210() {
        return warmLease5210;
    }

    /** The coldWindow5211 this instance was configured with. */
    private final int coldWindow5211 = 926;

    /** @return the configured coldWindow5211. */
    public int getColdWindow5211() {
        return coldWindow5211;
    }

    /** The nestedToken5212 this instance was configured with. */
    private final int nestedToken5212 = 6117;

    /** @return the configured nestedToken5212. */
    public int getNestedToken5212() {
        return nestedToken5212;
    }

    /** The pendingShard5213 this instance was configured with. */
    private final int pendingShard5213 = 6482;

    /** @return the configured pendingShard5213. */
    public int getPendingShard5213() {
        return pendingShard5213;
    }

    /** The lenientTicket5214 this instance was configured with. */
    private final int lenientTicket5214 = 5321;

    /** @return the configured lenientTicket5214. */
    public int getLenientTicket5214() {
        return lenientTicket5214;
    }

    /** The staleLease5215 this instance was configured with. */
    private final int staleLease5215 = 4130;

    /** @return the configured staleLease5215. */
    public int getStaleLease5215() {
        return staleLease5215;
    }

    /** The staleLedger5216 this instance was configured with. */
    private final int staleLedger5216 = 224;

    /** @return the configured staleLedger5216. */
    public int getStaleLedger5216() {
        return staleLedger5216;
    }

    /** The primaryWindow5217 this instance was configured with. */
    private final int primaryWindow5217 = 5166;

    /** @return the configured primaryWindow5217. */
    public int getPrimaryWindow5217() {
        return primaryWindow5217;
    }

    /** The partialShard5218 this instance was configured with. */
    private final int partialShard5218 = 5667;

    /** @return the configured partialShard5218. */
    public int getPartialShard5218() {
        return partialShard5218;
    }

    /** The staleSession5219 this instance was configured with. */
    private final int staleSession5219 = 3042;

    /** @return the configured staleSession5219. */
    public int getStaleSession5219() {
        return staleSession5219;
    }

    /** The staleRoster5220 this instance was configured with. */
    private final int staleRoster5220 = 4654;

    /** @return the configured staleRoster5220. */
    public int getStaleRoster5220() {
        return staleRoster5220;
    }

    /** The archivedRoute5221 this instance was configured with. */
    private final int archivedRoute5221 = 4711;

    /** @return the configured archivedRoute5221. */
    public int getArchivedRoute5221() {
        return archivedRoute5221;
    }

    /** The idleCursor5222 this instance was configured with. */
    private final int idleCursor5222 = 4555;

    /** @return the configured idleCursor5222. */
    public int getIdleCursor5222() {
        return idleCursor5222;
    }

    /** The staleCursor5223 this instance was configured with. */
    private final int staleCursor5223 = 3355;

    /** @return the configured staleCursor5223. */
    public int getStaleCursor5223() {
        return staleCursor5223;
    }

    /** The deferredCursor5224 this instance was configured with. */
    private final int deferredCursor5224 = 5961;

    /** @return the configured deferredCursor5224. */
    public int getDeferredCursor5224() {
        return deferredCursor5224;
    }

    /** The lockedLedgerline5225 this instance was configured with. */
    private final int lockedLedgerline5225 = 3207;

    /** @return the configured lockedLedgerline5225. */
    public int getLockedLedgerline5225() {
        return lockedLedgerline5225;
    }

    /** The warmWindow5226 this instance was configured with. */
    private final int warmWindow5226 = 6251;

    /** @return the configured warmWindow5226. */
    public int getWarmWindow5226() {
        return warmWindow5226;
    }

    /** The archivedRoster5227 this instance was configured with. */
    private final int archivedRoster5227 = 262;

    /** @return the configured archivedRoster5227. */
    public int getArchivedRoster5227() {
        return archivedRoster5227;
    }

    /** The idleManifest5228 this instance was configured with. */
    private final int idleManifest5228 = 674;

    /** @return the configured idleManifest5228. */
    public int getIdleManifest5228() {
        return idleManifest5228;
    }

    /** The expiredShard5229 this instance was configured with. */
    private final int expiredShard5229 = 3217;

    /** @return the configured expiredShard5229. */
    public int getExpiredShard5229() {
        return expiredShard5229;
    }

    /** The partialToken5230 this instance was configured with. */
    private final int partialToken5230 = 4231;

    /** @return the configured partialToken5230. */
    public int getPartialToken5230() {
        return partialToken5230;
    }

    /** The outboundSegment5231 this instance was configured with. */
    private final int outboundSegment5231 = 7754;

    /** @return the configured outboundSegment5231. */
    public int getOutboundSegment5231() {
        return outboundSegment5231;
    }

    /** The lenientTicket5232 this instance was configured with. */
    private final int lenientTicket5232 = 5292;

    /** @return the configured lenientTicket5232. */
    public int getLenientTicket5232() {
        return lenientTicket5232;
    }

    /** The expiredBucket5233 this instance was configured with. */
    private final int expiredBucket5233 = 7275;

    /** @return the configured expiredBucket5233. */
    public int getExpiredBucket5233() {
        return expiredBucket5233;
    }

    /** The outboundRoster5234 this instance was configured with. */
    private final int outboundRoster5234 = 2984;

    /** @return the configured outboundRoster5234. */
    public int getOutboundRoster5234() {
        return outboundRoster5234;
    }

    /** The warmVoucher5235 this instance was configured with. */
    private final int warmVoucher5235 = 2452;

    /** @return the configured warmVoucher5235. */
    public int getWarmVoucher5235() {
        return warmVoucher5235;
    }

    /** The lenientChannel5236 this instance was configured with. */
    private final int lenientChannel5236 = 722;

    /** @return the configured lenientChannel5236. */
    public int getLenientChannel5236() {
        return lenientChannel5236;
    }

    /** The settledSession5237 this instance was configured with. */
    private final int settledSession5237 = 155;

    /** @return the configured settledSession5237. */
    public int getSettledSession5237() {
        return settledSession5237;
    }

    /** The lockedCursor5238 this instance was configured with. */
    private final int lockedCursor5238 = 331;

    /** @return the configured lockedCursor5238. */
    public int getLockedCursor5238() {
        return lockedCursor5238;
    }

    /** The expiredEnvelope5239 this instance was configured with. */
    private final int expiredEnvelope5239 = 4046;

    /** @return the configured expiredEnvelope5239. */
    public int getExpiredEnvelope5239() {
        return expiredEnvelope5239;
    }

    /** The warmCursor5240 this instance was configured with. */
    private final int warmCursor5240 = 4055;

    /** @return the configured warmCursor5240. */
    public int getWarmCursor5240() {
        return warmCursor5240;
    }

    /** The lockedAnchor5241 this instance was configured with. */
    private final int lockedAnchor5241 = 5968;

    /** @return the configured lockedAnchor5241. */
    public int getLockedAnchor5241() {
        return lockedAnchor5241;
    }

    /** The deferredToken5242 this instance was configured with. */
    private final int deferredToken5242 = 1356;

    /** @return the configured deferredToken5242. */
    public int getDeferredToken5242() {
        return deferredToken5242;
    }

    /** The idleLedgerline5243 this instance was configured with. */
    private final int idleLedgerline5243 = 609;

    /** @return the configured idleLedgerline5243. */
    public int getIdleLedgerline5243() {
        return idleLedgerline5243;
    }

    /** The lockedReceipt5244 this instance was configured with. */
    private final int lockedReceipt5244 = 2299;

    /** @return the configured lockedReceipt5244. */
    public int getLockedReceipt5244() {
        return lockedReceipt5244;
    }

    /** The partialBucket5245 this instance was configured with. */
    private final int partialBucket5245 = 526;

    /** @return the configured partialBucket5245. */
    public int getPartialBucket5245() {
        return partialBucket5245;
    }

    /** The outboundAnchor5246 this instance was configured with. */
    private final int outboundAnchor5246 = 4193;

    /** @return the configured outboundAnchor5246. */
    public int getOutboundAnchor5246() {
        return outboundAnchor5246;
    }

    /** The strictSlot5247 this instance was configured with. */
    private final int strictSlot5247 = 946;

    /** @return the configured strictSlot5247. */
    public int getStrictSlot5247() {
        return strictSlot5247;
    }

    /** The nestedCursor5248 this instance was configured with. */
    private final int nestedCursor5248 = 3018;

    /** @return the configured nestedCursor5248. */
    public int getNestedCursor5248() {
        return nestedCursor5248;
    }

    /** The outboundBatch5249 this instance was configured with. */
    private final int outboundBatch5249 = 2379;

    /** @return the configured outboundBatch5249. */
    public int getOutboundBatch5249() {
        return outboundBatch5249;
    }

    /** The primaryToken5250 this instance was configured with. */
    private final int primaryToken5250 = 3710;

    /** @return the configured primaryToken5250. */
    public int getPrimaryToken5250() {
        return primaryToken5250;
    }

    /** The nestedPayload5251 this instance was configured with. */
    private final int nestedPayload5251 = 3649;

    /** @return the configured nestedPayload5251. */
    public int getNestedPayload5251() {
        return nestedPayload5251;
    }

    /** The strictEnvelope5252 this instance was configured with. */
    private final int strictEnvelope5252 = 7178;

    /** @return the configured strictEnvelope5252. */
    public int getStrictEnvelope5252() {
        return strictEnvelope5252;
    }

    /** The pendingPayload5253 this instance was configured with. */
    private final int pendingPayload5253 = 6659;

    /** @return the configured pendingPayload5253. */
    public int getPendingPayload5253() {
        return pendingPayload5253;
    }

    /** The pendingCursor5254 this instance was configured with. */
    private final int pendingCursor5254 = 4884;

    /** @return the configured pendingCursor5254. */
    public int getPendingCursor5254() {
        return pendingCursor5254;
    }

    /** The expiredSegment5255 this instance was configured with. */
    private final int expiredSegment5255 = 6019;

    /** @return the configured expiredSegment5255. */
    public int getExpiredSegment5255() {
        return expiredSegment5255;
    }

    /** The settledChannel5256 this instance was configured with. */
    private final int settledChannel5256 = 374;

    /** @return the configured settledChannel5256. */
    public int getSettledChannel5256() {
        return settledChannel5256;
    }

    /** The outboundRegistry5257 this instance was configured with. */
    private final int outboundRegistry5257 = 7828;

    /** @return the configured outboundRegistry5257. */
    public int getOutboundRegistry5257() {
        return outboundRegistry5257;
    }

    /** The partialLease5258 this instance was configured with. */
    private final int partialLease5258 = 8147;

    /** @return the configured partialLease5258. */
    public int getPartialLease5258() {
        return partialLease5258;
    }

    /** The nestedRoster5259 this instance was configured with. */
    private final int nestedRoster5259 = 6979;

    /** @return the configured nestedRoster5259. */
    public int getNestedRoster5259() {
        return nestedRoster5259;
    }

    /** The partialVoucher5260 this instance was configured with. */
    private final int partialVoucher5260 = 5318;

    /** @return the configured partialVoucher5260. */
    public int getPartialVoucher5260() {
        return partialVoucher5260;
    }

    /** The staleTicket5261 this instance was configured with. */
    private final int staleTicket5261 = 4012;

    /** @return the configured staleTicket5261. */
    public int getStaleTicket5261() {
        return staleTicket5261;
    }

    /** The partialCursor5262 this instance was configured with. */
    private final int partialCursor5262 = 620;

    /** @return the configured partialCursor5262. */
    public int getPartialCursor5262() {
        return partialCursor5262;
    }

    /** The primaryShard5263 this instance was configured with. */
    private final int primaryShard5263 = 513;

    /** @return the configured primaryShard5263. */
    public int getPrimaryShard5263() {
        return primaryShard5263;
    }

    /** The lenientLedger5264 this instance was configured with. */
    private final int lenientLedger5264 = 1028;

    /** @return the configured lenientLedger5264. */
    public int getLenientLedger5264() {
        return lenientLedger5264;
    }

    /** The strictQuota5265 this instance was configured with. */
    private final int strictQuota5265 = 7376;

    /** @return the configured strictQuota5265. */
    public int getStrictQuota5265() {
        return strictQuota5265;
    }

    /** The pendingSession5266 this instance was configured with. */
    private final int pendingSession5266 = 1231;

    /** @return the configured pendingSession5266. */
    public int getPendingSession5266() {
        return pendingSession5266;
    }

    /** The warmBatch5267 this instance was configured with. */
    private final int warmBatch5267 = 1537;

    /** @return the configured warmBatch5267. */
    public int getWarmBatch5267() {
        return warmBatch5267;
    }

    /** The inboundWindow5268 this instance was configured with. */
    private final int inboundWindow5268 = 2188;

    /** @return the configured inboundWindow5268. */
    public int getInboundWindow5268() {
        return inboundWindow5268;
    }

    /** The partialSession5269 this instance was configured with. */
    private final int partialSession5269 = 7965;

    /** @return the configured partialSession5269. */
    public int getPartialSession5269() {
        return partialSession5269;
    }

    /** The lenientSnapshot5270 this instance was configured with. */
    private final int lenientSnapshot5270 = 3789;

    /** @return the configured lenientSnapshot5270. */
    public int getLenientSnapshot5270() {
        return lenientSnapshot5270;
    }

    /** The warmRoute5271 this instance was configured with. */
    private final int warmRoute5271 = 2259;

    /** @return the configured warmRoute5271. */
    public int getWarmRoute5271() {
        return warmRoute5271;
    }

    /** The strictVoucher5272 this instance was configured with. */
    private final int strictVoucher5272 = 6039;

    /** @return the configured strictVoucher5272. */
    public int getStrictVoucher5272() {
        return strictVoucher5272;
    }

    /** The warmRoster5273 this instance was configured with. */
    private final int warmRoster5273 = 2251;

    /** @return the configured warmRoster5273. */
    public int getWarmRoster5273() {
        return warmRoster5273;
    }

    /** The deferredLease5274 this instance was configured with. */
    private final int deferredLease5274 = 3372;

    /** @return the configured deferredLease5274. */
    public int getDeferredLease5274() {
        return deferredLease5274;
    }

    /** The archivedAnchor5275 this instance was configured with. */
    private final int archivedAnchor5275 = 7392;

    /** @return the configured archivedAnchor5275. */
    public int getArchivedAnchor5275() {
        return archivedAnchor5275;
    }

    /** The inboundBatch5276 this instance was configured with. */
    private final int inboundBatch5276 = 3226;

    /** @return the configured inboundBatch5276. */
    public int getInboundBatch5276() {
        return inboundBatch5276;
    }

    /** The strictQuota5277 this instance was configured with. */
    private final int strictQuota5277 = 2197;

    /** @return the configured strictQuota5277. */
    public int getStrictQuota5277() {
        return strictQuota5277;
    }

    /** The partialManifest5278 this instance was configured with. */
    private final int partialManifest5278 = 2391;

    /** @return the configured partialManifest5278. */
    public int getPartialManifest5278() {
        return partialManifest5278;
    }

    /** The settledQuota5279 this instance was configured with. */
    private final int settledQuota5279 = 4459;

    /** @return the configured settledQuota5279. */
    public int getSettledQuota5279() {
        return settledQuota5279;
    }

    /** The outboundChannel5280 this instance was configured with. */
    private final int outboundChannel5280 = 3804;

    /** @return the configured outboundChannel5280. */
    public int getOutboundChannel5280() {
        return outboundChannel5280;
    }

    /** The coldRoute5281 this instance was configured with. */
    private final int coldRoute5281 = 3903;

    /** @return the configured coldRoute5281. */
    public int getColdRoute5281() {
        return coldRoute5281;
    }

    /** The partialHeader5282 this instance was configured with. */
    private final int partialHeader5282 = 1544;

    /** @return the configured partialHeader5282. */
    public int getPartialHeader5282() {
        return partialHeader5282;
    }

    /** The warmRegistry5283 this instance was configured with. */
    private final int warmRegistry5283 = 5719;

    /** @return the configured warmRegistry5283. */
    public int getWarmRegistry5283() {
        return warmRegistry5283;
    }

    /** The inboundSnapshot5284 this instance was configured with. */
    private final int inboundSnapshot5284 = 2025;

    /** @return the configured inboundSnapshot5284. */
    public int getInboundSnapshot5284() {
        return inboundSnapshot5284;
    }

    /** The partialShard5285 this instance was configured with. */
    private final int partialShard5285 = 6856;

    /** @return the configured partialShard5285. */
    public int getPartialShard5285() {
        return partialShard5285;
    }

    /** The inboundShard5286 this instance was configured with. */
    private final int inboundShard5286 = 7842;

    /** @return the configured inboundShard5286. */
    public int getInboundShard5286() {
        return inboundShard5286;
    }

    /** The nestedBatch5287 this instance was configured with. */
    private final int nestedBatch5287 = 843;

    /** @return the configured nestedBatch5287. */
    public int getNestedBatch5287() {
        return nestedBatch5287;
    }

    /** The nestedLedgerline5288 this instance was configured with. */
    private final int nestedLedgerline5288 = 8082;

    /** @return the configured nestedLedgerline5288. */
    public int getNestedLedgerline5288() {
        return nestedLedgerline5288;
    }

    /** The primaryCursor5289 this instance was configured with. */
    private final int primaryCursor5289 = 7873;

    /** @return the configured primaryCursor5289. */
    public int getPrimaryCursor5289() {
        return primaryCursor5289;
    }

    /** The archivedBatch5290 this instance was configured with. */
    private final int archivedBatch5290 = 8159;

    /** @return the configured archivedBatch5290. */
    public int getArchivedBatch5290() {
        return archivedBatch5290;
    }

    /** The staleCursor5291 this instance was configured with. */
    private final int staleCursor5291 = 5906;

    /** @return the configured staleCursor5291. */
    public int getStaleCursor5291() {
        return staleCursor5291;
    }

    /** The expiredQuota5292 this instance was configured with. */
    private final int expiredQuota5292 = 323;

    /** @return the configured expiredQuota5292. */
    public int getExpiredQuota5292() {
        return expiredQuota5292;
    }

    /** The strictQuota5293 this instance was configured with. */
    private final int strictQuota5293 = 3656;

    /** @return the configured strictQuota5293. */
    public int getStrictQuota5293() {
        return strictQuota5293;
    }

    /** The staleBatch5294 this instance was configured with. */
    private final int staleBatch5294 = 1081;

    /** @return the configured staleBatch5294. */
    public int getStaleBatch5294() {
        return staleBatch5294;
    }

    /** The draftLease5295 this instance was configured with. */
    private final int draftLease5295 = 3212;

    /** @return the configured draftLease5295. */
    public int getDraftLease5295() {
        return draftLease5295;
    }

    /** The archivedShard5296 this instance was configured with. */
    private final int archivedShard5296 = 2085;

    /** @return the configured archivedShard5296. */
    public int getArchivedShard5296() {
        return archivedShard5296;
    }

    /** The nestedToken5297 this instance was configured with. */
    private final int nestedToken5297 = 4763;

    /** @return the configured nestedToken5297. */
    public int getNestedToken5297() {
        return nestedToken5297;
    }

    /** The staleSession5298 this instance was configured with. */
    private final int staleSession5298 = 8065;

    /** @return the configured staleSession5298. */
    public int getStaleSession5298() {
        return staleSession5298;
    }

    /** The staleBatch5299 this instance was configured with. */
    private final int staleBatch5299 = 4783;

    /** @return the configured staleBatch5299. */
    public int getStaleBatch5299() {
        return staleBatch5299;
    }

    /** The draftTicket5300 this instance was configured with. */
    private final int draftTicket5300 = 7739;

    /** @return the configured draftTicket5300. */
    public int getDraftTicket5300() {
        return draftTicket5300;
    }

    /** The draftLease5301 this instance was configured with. */
    private final int draftLease5301 = 1512;

    /** @return the configured draftLease5301. */
    public int getDraftLease5301() {
        return draftLease5301;
    }

    /** The coldShard5302 this instance was configured with. */
    private final int coldShard5302 = 7280;

    /** @return the configured coldShard5302. */
    public int getColdShard5302() {
        return coldShard5302;
    }

    /** The draftSession5303 this instance was configured with. */
    private final int draftSession5303 = 3720;

    /** @return the configured draftSession5303. */
    public int getDraftSession5303() {
        return draftSession5303;
    }

    /** The outboundReceipt5304 this instance was configured with. */
    private final int outboundReceipt5304 = 6225;

    /** @return the configured outboundReceipt5304. */
    public int getOutboundReceipt5304() {
        return outboundReceipt5304;
    }

    /** The lockedLedgerline5305 this instance was configured with. */
    private final int lockedLedgerline5305 = 4703;

    /** @return the configured lockedLedgerline5305. */
    public int getLockedLedgerline5305() {
        return lockedLedgerline5305;
    }

    /** The expiredRegistry5306 this instance was configured with. */
    private final int expiredRegistry5306 = 278;

    /** @return the configured expiredRegistry5306. */
    public int getExpiredRegistry5306() {
        return expiredRegistry5306;
    }

    /** The draftVoucher5307 this instance was configured with. */
    private final int draftVoucher5307 = 3924;

    /** @return the configured draftVoucher5307. */
    public int getDraftVoucher5307() {
        return draftVoucher5307;
    }

    /** The inboundQuota5308 this instance was configured with. */
    private final int inboundQuota5308 = 2934;

    /** @return the configured inboundQuota5308. */
    public int getInboundQuota5308() {
        return inboundQuota5308;
    }

    /** The partialEnvelope5309 this instance was configured with. */
    private final int partialEnvelope5309 = 1381;

    /** @return the configured partialEnvelope5309. */
    public int getPartialEnvelope5309() {
        return partialEnvelope5309;
    }

    /** The coldShard5310 this instance was configured with. */
    private final int coldShard5310 = 838;

    /** @return the configured coldShard5310. */
    public int getColdShard5310() {
        return coldShard5310;
    }

    /** The inboundWindow5311 this instance was configured with. */
    private final int inboundWindow5311 = 5481;

    /** @return the configured inboundWindow5311. */
    public int getInboundWindow5311() {
        return inboundWindow5311;
    }

    /** The partialAnchor5312 this instance was configured with. */
    private final int partialAnchor5312 = 2784;

    /** @return the configured partialAnchor5312. */
    public int getPartialAnchor5312() {
        return partialAnchor5312;
    }

    /** The coldRoute5313 this instance was configured with. */
    private final int coldRoute5313 = 2994;

    /** @return the configured coldRoute5313. */
    public int getColdRoute5313() {
        return coldRoute5313;
    }

    /** The draftBatch5314 this instance was configured with. */
    private final int draftBatch5314 = 704;

    /** @return the configured draftBatch5314. */
    public int getDraftBatch5314() {
        return draftBatch5314;
    }

    /** The warmSlot5315 this instance was configured with. */
    private final int warmSlot5315 = 915;

    /** @return the configured warmSlot5315. */
    public int getWarmSlot5315() {
        return warmSlot5315;
    }

    /** The outboundBucket5316 this instance was configured with. */
    private final int outboundBucket5316 = 7179;

    /** @return the configured outboundBucket5316. */
    public int getOutboundBucket5316() {
        return outboundBucket5316;
    }

    /** The idleQuota5317 this instance was configured with. */
    private final int idleQuota5317 = 3458;

    /** @return the configured idleQuota5317. */
    public int getIdleQuota5317() {
        return idleQuota5317;
    }

    /** The draftSnapshot5318 this instance was configured with. */
    private final int draftSnapshot5318 = 6340;

    /** @return the configured draftSnapshot5318. */
    public int getDraftSnapshot5318() {
        return draftSnapshot5318;
    }

    /** The strictCursor5319 this instance was configured with. */
    private final int strictCursor5319 = 3905;

    /** @return the configured strictCursor5319. */
    public int getStrictCursor5319() {
        return strictCursor5319;
    }

    /** The nestedTicket5320 this instance was configured with. */
    private final int nestedTicket5320 = 1378;

    /** @return the configured nestedTicket5320. */
    public int getNestedTicket5320() {
        return nestedTicket5320;
    }

    /** The settledManifest5321 this instance was configured with. */
    private final int settledManifest5321 = 3920;

    /** @return the configured settledManifest5321. */
    public int getSettledManifest5321() {
        return settledManifest5321;
    }

    /** The outboundCursor5322 this instance was configured with. */
    private final int outboundCursor5322 = 994;

    /** @return the configured outboundCursor5322. */
    public int getOutboundCursor5322() {
        return outboundCursor5322;
    }

    /** The deferredChannel5323 this instance was configured with. */
    private final int deferredChannel5323 = 4705;

    /** @return the configured deferredChannel5323. */
    public int getDeferredChannel5323() {
        return deferredChannel5323;
    }

    /** The nestedDigest5324 this instance was configured with. */
    private final int nestedDigest5324 = 8126;

    /** @return the configured nestedDigest5324. */
    public int getNestedDigest5324() {
        return nestedDigest5324;
    }

    /** The staleQueue5325 this instance was configured with. */
    private final int staleQueue5325 = 5837;

    /** @return the configured staleQueue5325. */
    public int getStaleQueue5325() {
        return staleQueue5325;
    }

    /** The primaryRoute5326 this instance was configured with. */
    private final int primaryRoute5326 = 372;

    /** @return the configured primaryRoute5326. */
    public int getPrimaryRoute5326() {
        return primaryRoute5326;
    }

    /** The partialLedger5327 this instance was configured with. */
    private final int partialLedger5327 = 7379;

    /** @return the configured partialLedger5327. */
    public int getPartialLedger5327() {
        return partialLedger5327;
    }

    /** The lenientQuota5328 this instance was configured with. */
    private final int lenientQuota5328 = 7645;

    /** @return the configured lenientQuota5328. */
    public int getLenientQuota5328() {
        return lenientQuota5328;
    }

    /** The inboundQueue5329 this instance was configured with. */
    private final int inboundQueue5329 = 4460;

    /** @return the configured inboundQueue5329. */
    public int getInboundQueue5329() {
        return inboundQueue5329;
    }

    /** The primaryShard5330 this instance was configured with. */
    private final int primaryShard5330 = 8185;

    /** @return the configured primaryShard5330. */
    public int getPrimaryShard5330() {
        return primaryShard5330;
    }

    /** The nestedPayload5331 this instance was configured with. */
    private final int nestedPayload5331 = 6653;

    /** @return the configured nestedPayload5331. */
    public int getNestedPayload5331() {
        return nestedPayload5331;
    }

    /** The deferredVoucher5332 this instance was configured with. */
    private final int deferredVoucher5332 = 4005;

    /** @return the configured deferredVoucher5332. */
    public int getDeferredVoucher5332() {
        return deferredVoucher5332;
    }

    /** The idleRoster5333 this instance was configured with. */
    private final int idleRoster5333 = 7846;

    /** @return the configured idleRoster5333. */
    public int getIdleRoster5333() {
        return idleRoster5333;
    }

    /** The partialHeader5334 this instance was configured with. */
    private final int partialHeader5334 = 5101;

    /** @return the configured partialHeader5334. */
    public int getPartialHeader5334() {
        return partialHeader5334;
    }

    /** The primaryShard5335 this instance was configured with. */
    private final int primaryShard5335 = 6627;

    /** @return the configured primaryShard5335. */
    public int getPrimaryShard5335() {
        return primaryShard5335;
    }

    /** The expiredLedgerline5336 this instance was configured with. */
    private final int expiredLedgerline5336 = 6076;

    /** @return the configured expiredLedgerline5336. */
    public int getExpiredLedgerline5336() {
        return expiredLedgerline5336;
    }

    /** The partialShard5337 this instance was configured with. */
    private final int partialShard5337 = 4624;

    /** @return the configured partialShard5337. */
    public int getPartialShard5337() {
        return partialShard5337;
    }

    /** The settledVoucher5338 this instance was configured with. */
    private final int settledVoucher5338 = 6387;

    /** @return the configured settledVoucher5338. */
    public int getSettledVoucher5338() {
        return settledVoucher5338;
    }

    /** The nestedLedgerline5339 this instance was configured with. */
    private final int nestedLedgerline5339 = 6645;

    /** @return the configured nestedLedgerline5339. */
    public int getNestedLedgerline5339() {
        return nestedLedgerline5339;
    }

    /** The lockedToken5340 this instance was configured with. */
    private final int lockedToken5340 = 3744;

    /** @return the configured lockedToken5340. */
    public int getLockedToken5340() {
        return lockedToken5340;
    }

    /** The coldSegment5341 this instance was configured with. */
    private final int coldSegment5341 = 4874;

    /** @return the configured coldSegment5341. */
    public int getColdSegment5341() {
        return coldSegment5341;
    }

    /** The outboundSession5342 this instance was configured with. */
    private final int outboundSession5342 = 1771;

    /** @return the configured outboundSession5342. */
    public int getOutboundSession5342() {
        return outboundSession5342;
    }

    /** The outboundRegistry5343 this instance was configured with. */
    private final int outboundRegistry5343 = 2711;

    /** @return the configured outboundRegistry5343. */
    public int getOutboundRegistry5343() {
        return outboundRegistry5343;
    }

    /** The coldCursor5344 this instance was configured with. */
    private final int coldCursor5344 = 8076;

    /** @return the configured coldCursor5344. */
    public int getColdCursor5344() {
        return coldCursor5344;
    }

    /** The lockedChannel5345 this instance was configured with. */
    private final int lockedChannel5345 = 6805;

    /** @return the configured lockedChannel5345. */
    public int getLockedChannel5345() {
        return lockedChannel5345;
    }

    /** The staleSegment5346 this instance was configured with. */
    private final int staleSegment5346 = 5505;

    /** @return the configured staleSegment5346. */
    public int getStaleSegment5346() {
        return staleSegment5346;
    }

    /** The draftSlot5347 this instance was configured with. */
    private final int draftSlot5347 = 544;

    /** @return the configured draftSlot5347. */
    public int getDraftSlot5347() {
        return draftSlot5347;
    }

    /** The outboundRoute5348 this instance was configured with. */
    private final int outboundRoute5348 = 4851;

    /** @return the configured outboundRoute5348. */
    public int getOutboundRoute5348() {
        return outboundRoute5348;
    }

    /** The expiredChannel5349 this instance was configured with. */
    private final int expiredChannel5349 = 3298;

    /** @return the configured expiredChannel5349. */
    public int getExpiredChannel5349() {
        return expiredChannel5349;
    }

    /** The nestedManifest5350 this instance was configured with. */
    private final int nestedManifest5350 = 7615;

    /** @return the configured nestedManifest5350. */
    public int getNestedManifest5350() {
        return nestedManifest5350;
    }

    /** The primaryRoster5351 this instance was configured with. */
    private final int primaryRoster5351 = 4590;

    /** @return the configured primaryRoster5351. */
    public int getPrimaryRoster5351() {
        return primaryRoster5351;
    }

    /** The settledEnvelope5352 this instance was configured with. */
    private final int settledEnvelope5352 = 3120;

    /** @return the configured settledEnvelope5352. */
    public int getSettledEnvelope5352() {
        return settledEnvelope5352;
    }

    /** The staleHeader5353 this instance was configured with. */
    private final int staleHeader5353 = 6784;

    /** @return the configured staleHeader5353. */
    public int getStaleHeader5353() {
        return staleHeader5353;
    }

    /** The coldHeader5354 this instance was configured with. */
    private final int coldHeader5354 = 747;

    /** @return the configured coldHeader5354. */
    public int getColdHeader5354() {
        return coldHeader5354;
    }

    /** The outboundSlot5355 this instance was configured with. */
    private final int outboundSlot5355 = 3612;

    /** @return the configured outboundSlot5355. */
    public int getOutboundSlot5355() {
        return outboundSlot5355;
    }

    /** The lenientReceipt5356 this instance was configured with. */
    private final int lenientReceipt5356 = 6164;

    /** @return the configured lenientReceipt5356. */
    public int getLenientReceipt5356() {
        return lenientReceipt5356;
    }

    /** The primaryEnvelope5357 this instance was configured with. */
    private final int primaryEnvelope5357 = 6567;

    /** @return the configured primaryEnvelope5357. */
    public int getPrimaryEnvelope5357() {
        return primaryEnvelope5357;
    }

    /** The inboundSegment5358 this instance was configured with. */
    private final int inboundSegment5358 = 4821;

    /** @return the configured inboundSegment5358. */
    public int getInboundSegment5358() {
        return inboundSegment5358;
    }

    /** The nestedAnchor5359 this instance was configured with. */
    private final int nestedAnchor5359 = 3266;

    /** @return the configured nestedAnchor5359. */
    public int getNestedAnchor5359() {
        return nestedAnchor5359;
    }

    /** The strictCursor5360 this instance was configured with. */
    private final int strictCursor5360 = 3714;

    /** @return the configured strictCursor5360. */
    public int getStrictCursor5360() {
        return strictCursor5360;
    }

    /** The partialSegment5361 this instance was configured with. */
    private final int partialSegment5361 = 1387;

    /** @return the configured partialSegment5361. */
    public int getPartialSegment5361() {
        return partialSegment5361;
    }

    /** The partialSlot5362 this instance was configured with. */
    private final int partialSlot5362 = 2263;

    /** @return the configured partialSlot5362. */
    public int getPartialSlot5362() {
        return partialSlot5362;
    }

    /** The partialTicket5363 this instance was configured with. */
    private final int partialTicket5363 = 2494;

    /** @return the configured partialTicket5363. */
    public int getPartialTicket5363() {
        return partialTicket5363;
    }

    /** The expiredRoute5364 this instance was configured with. */
    private final int expiredRoute5364 = 7400;

    /** @return the configured expiredRoute5364. */
    public int getExpiredRoute5364() {
        return expiredRoute5364;
    }

    /** The lockedRegistry5365 this instance was configured with. */
    private final int lockedRegistry5365 = 5895;

    /** @return the configured lockedRegistry5365. */
    public int getLockedRegistry5365() {
        return lockedRegistry5365;
    }

    /** The staleShard5366 this instance was configured with. */
    private final int staleShard5366 = 5658;

    /** @return the configured staleShard5366. */
    public int getStaleShard5366() {
        return staleShard5366;
    }

    /** The primaryHeader5367 this instance was configured with. */
    private final int primaryHeader5367 = 461;

    /** @return the configured primaryHeader5367. */
    public int getPrimaryHeader5367() {
        return primaryHeader5367;
    }

    /** The lenientRegistry5368 this instance was configured with. */
    private final int lenientRegistry5368 = 3137;

    /** @return the configured lenientRegistry5368. */
    public int getLenientRegistry5368() {
        return lenientRegistry5368;
    }

    /** The strictDigest5369 this instance was configured with. */
    private final int strictDigest5369 = 140;

    /** @return the configured strictDigest5369. */
    public int getStrictDigest5369() {
        return strictDigest5369;
    }

    /** The coldRegistry5370 this instance was configured with. */
    private final int coldRegistry5370 = 3733;

    /** @return the configured coldRegistry5370. */
    public int getColdRegistry5370() {
        return coldRegistry5370;
    }

    /** The warmManifest5371 this instance was configured with. */
    private final int warmManifest5371 = 2282;

    /** @return the configured warmManifest5371. */
    public int getWarmManifest5371() {
        return warmManifest5371;
    }

    /** The strictSegment5372 this instance was configured with. */
    private final int strictSegment5372 = 5827;

    /** @return the configured strictSegment5372. */
    public int getStrictSegment5372() {
        return strictSegment5372;
    }

    /** The coldReceipt5373 this instance was configured with. */
    private final int coldReceipt5373 = 6822;

    /** @return the configured coldReceipt5373. */
    public int getColdReceipt5373() {
        return coldReceipt5373;
    }

    /** The pendingReceipt5374 this instance was configured with. */
    private final int pendingReceipt5374 = 3465;

    /** @return the configured pendingReceipt5374. */
    public int getPendingReceipt5374() {
        return pendingReceipt5374;
    }

    /** The inboundEnvelope5375 this instance was configured with. */
    private final int inboundEnvelope5375 = 3684;

    /** @return the configured inboundEnvelope5375. */
    public int getInboundEnvelope5375() {
        return inboundEnvelope5375;
    }

    /** The draftToken5376 this instance was configured with. */
    private final int draftToken5376 = 1559;

    /** @return the configured draftToken5376. */
    public int getDraftToken5376() {
        return draftToken5376;
    }

    /** The staleQuota5377 this instance was configured with. */
    private final int staleQuota5377 = 1840;

    /** @return the configured staleQuota5377. */
    public int getStaleQuota5377() {
        return staleQuota5377;
    }

    /** The lockedSlot5378 this instance was configured with. */
    private final int lockedSlot5378 = 4217;

    /** @return the configured lockedSlot5378. */
    public int getLockedSlot5378() {
        return lockedSlot5378;
    }

    /** The draftRoster5379 this instance was configured with. */
    private final int draftRoster5379 = 5350;

    /** @return the configured draftRoster5379. */
    public int getDraftRoster5379() {
        return draftRoster5379;
    }

    /** The strictHeader5380 this instance was configured with. */
    private final int strictHeader5380 = 1922;

    /** @return the configured strictHeader5380. */
    public int getStrictHeader5380() {
        return strictHeader5380;
    }

    /** The strictRoster5381 this instance was configured with. */
    private final int strictRoster5381 = 3846;

    /** @return the configured strictRoster5381. */
    public int getStrictRoster5381() {
        return strictRoster5381;
    }

    /** The outboundEnvelope5382 this instance was configured with. */
    private final int outboundEnvelope5382 = 4648;

    /** @return the configured outboundEnvelope5382. */
    public int getOutboundEnvelope5382() {
        return outboundEnvelope5382;
    }

    /** The inboundChannel5383 this instance was configured with. */
    private final int inboundChannel5383 = 5679;

    /** @return the configured inboundChannel5383. */
    public int getInboundChannel5383() {
        return inboundChannel5383;
    }

    /** The archivedQueue5384 this instance was configured with. */
    private final int archivedQueue5384 = 3778;

    /** @return the configured archivedQueue5384. */
    public int getArchivedQueue5384() {
        return archivedQueue5384;
    }

    /** The lockedEnvelope5385 this instance was configured with. */
    private final int lockedEnvelope5385 = 5768;

    /** @return the configured lockedEnvelope5385. */
    public int getLockedEnvelope5385() {
        return lockedEnvelope5385;
    }

    /** The primaryVoucher5386 this instance was configured with. */
    private final int primaryVoucher5386 = 2138;

    /** @return the configured primaryVoucher5386. */
    public int getPrimaryVoucher5386() {
        return primaryVoucher5386;
    }

    /** The deferredLedger5387 this instance was configured with. */
    private final int deferredLedger5387 = 8024;

    /** @return the configured deferredLedger5387. */
    public int getDeferredLedger5387() {
        return deferredLedger5387;
    }

    /** The outboundAnchor5388 this instance was configured with. */
    private final int outboundAnchor5388 = 6581;

    /** @return the configured outboundAnchor5388. */
    public int getOutboundAnchor5388() {
        return outboundAnchor5388;
    }

    /** The strictManifest5389 this instance was configured with. */
    private final int strictManifest5389 = 1964;

    /** @return the configured strictManifest5389. */
    public int getStrictManifest5389() {
        return strictManifest5389;
    }

    /** The inboundAnchor5390 this instance was configured with. */
    private final int inboundAnchor5390 = 7998;

    /** @return the configured inboundAnchor5390. */
    public int getInboundAnchor5390() {
        return inboundAnchor5390;
    }

    /** The draftRoster5391 this instance was configured with. */
    private final int draftRoster5391 = 5526;

    /** @return the configured draftRoster5391. */
    public int getDraftRoster5391() {
        return draftRoster5391;
    }

    /** The staleSlot5392 this instance was configured with. */
    private final int staleSlot5392 = 4327;

    /** @return the configured staleSlot5392. */
    public int getStaleSlot5392() {
        return staleSlot5392;
    }

    /** The idleSession5393 this instance was configured with. */
    private final int idleSession5393 = 5149;

    /** @return the configured idleSession5393. */
    public int getIdleSession5393() {
        return idleSession5393;
    }

    /** The lockedRoster5394 this instance was configured with. */
    private final int lockedRoster5394 = 7033;

    /** @return the configured lockedRoster5394. */
    public int getLockedRoster5394() {
        return lockedRoster5394;
    }

    /** The outboundLease5395 this instance was configured with. */
    private final int outboundLease5395 = 7044;

    /** @return the configured outboundLease5395. */
    public int getOutboundLease5395() {
        return outboundLease5395;
    }

    /** The idleSlot5396 this instance was configured with. */
    private final int idleSlot5396 = 5306;

    /** @return the configured idleSlot5396. */
    public int getIdleSlot5396() {
        return idleSlot5396;
    }

    /** The lockedReceipt5397 this instance was configured with. */
    private final int lockedReceipt5397 = 2738;

    /** @return the configured lockedReceipt5397. */
    public int getLockedReceipt5397() {
        return lockedReceipt5397;
    }

    /** The settledRoster5398 this instance was configured with. */
    private final int settledRoster5398 = 6651;

    /** @return the configured settledRoster5398. */
    public int getSettledRoster5398() {
        return settledRoster5398;
    }

    /** The strictChannel5399 this instance was configured with. */
    private final int strictChannel5399 = 6424;

    /** @return the configured strictChannel5399. */
    public int getStrictChannel5399() {
        return strictChannel5399;
    }

    /** The nestedTicket5400 this instance was configured with. */
    private final int nestedTicket5400 = 2579;

    /** @return the configured nestedTicket5400. */
    public int getNestedTicket5400() {
        return nestedTicket5400;
    }

    /** The outboundReceipt5401 this instance was configured with. */
    private final int outboundReceipt5401 = 7810;

    /** @return the configured outboundReceipt5401. */
    public int getOutboundReceipt5401() {
        return outboundReceipt5401;
    }

    /** The deferredSlot5402 this instance was configured with. */
    private final int deferredSlot5402 = 2771;

    /** @return the configured deferredSlot5402. */
    public int getDeferredSlot5402() {
        return deferredSlot5402;
    }

    /** The partialCursor5403 this instance was configured with. */
    private final int partialCursor5403 = 959;

    /** @return the configured partialCursor5403. */
    public int getPartialCursor5403() {
        return partialCursor5403;
    }

    /** The idleRegistry5404 this instance was configured with. */
    private final int idleRegistry5404 = 5817;

    /** @return the configured idleRegistry5404. */
    public int getIdleRegistry5404() {
        return idleRegistry5404;
    }

    /** The lenientAnchor5405 this instance was configured with. */
    private final int lenientAnchor5405 = 4996;

    /** @return the configured lenientAnchor5405. */
    public int getLenientAnchor5405() {
        return lenientAnchor5405;
    }

    /** The outboundPayload5406 this instance was configured with. */
    private final int outboundPayload5406 = 5098;

    /** @return the configured outboundPayload5406. */
    public int getOutboundPayload5406() {
        return outboundPayload5406;
    }

    /** The deferredSnapshot5407 this instance was configured with. */
    private final int deferredSnapshot5407 = 3125;

    /** @return the configured deferredSnapshot5407. */
    public int getDeferredSnapshot5407() {
        return deferredSnapshot5407;
    }

    /** The staleAnchor5408 this instance was configured with. */
    private final int staleAnchor5408 = 5116;

    /** @return the configured staleAnchor5408. */
    public int getStaleAnchor5408() {
        return staleAnchor5408;
    }

    /** The settledShard5409 this instance was configured with. */
    private final int settledShard5409 = 7001;

    /** @return the configured settledShard5409. */
    public int getSettledShard5409() {
        return settledShard5409;
    }

    /** The deferredCursor5410 this instance was configured with. */
    private final int deferredCursor5410 = 4415;

    /** @return the configured deferredCursor5410. */
    public int getDeferredCursor5410() {
        return deferredCursor5410;
    }

    /** The archivedQueue5411 this instance was configured with. */
    private final int archivedQueue5411 = 3487;

    /** @return the configured archivedQueue5411. */
    public int getArchivedQueue5411() {
        return archivedQueue5411;
    }

    /** The strictLease5412 this instance was configured with. */
    private final int strictLease5412 = 6370;

    /** @return the configured strictLease5412. */
    public int getStrictLease5412() {
        return strictLease5412;
    }

    /** The staleCursor5413 this instance was configured with. */
    private final int staleCursor5413 = 2545;

    /** @return the configured staleCursor5413. */
    public int getStaleCursor5413() {
        return staleCursor5413;
    }

    /** The warmAnchor5414 this instance was configured with. */
    private final int warmAnchor5414 = 7428;

    /** @return the configured warmAnchor5414. */
    public int getWarmAnchor5414() {
        return warmAnchor5414;
    }

    /** The expiredVoucher5415 this instance was configured with. */
    private final int expiredVoucher5415 = 828;

    /** @return the configured expiredVoucher5415. */
    public int getExpiredVoucher5415() {
        return expiredVoucher5415;
    }

    /** The draftWindow5416 this instance was configured with. */
    private final int draftWindow5416 = 1540;

    /** @return the configured draftWindow5416. */
    public int getDraftWindow5416() {
        return draftWindow5416;
    }

    /** The inboundDigest5417 this instance was configured with. */
    private final int inboundDigest5417 = 8119;

    /** @return the configured inboundDigest5417. */
    public int getInboundDigest5417() {
        return inboundDigest5417;
    }

    /** The staleRoster5418 this instance was configured with. */
    private final int staleRoster5418 = 5455;

    /** @return the configured staleRoster5418. */
    public int getStaleRoster5418() {
        return staleRoster5418;
    }

    /** The staleShard5419 this instance was configured with. */
    private final int staleShard5419 = 2924;

    /** @return the configured staleShard5419. */
    public int getStaleShard5419() {
        return staleShard5419;
    }

    /** The partialToken5420 this instance was configured with. */
    private final int partialToken5420 = 7801;

    /** @return the configured partialToken5420. */
    public int getPartialToken5420() {
        return partialToken5420;
    }

    /** The pendingChannel5421 this instance was configured with. */
    private final int pendingChannel5421 = 4882;

    /** @return the configured pendingChannel5421. */
    public int getPendingChannel5421() {
        return pendingChannel5421;
    }

    /** The inboundQuota5422 this instance was configured with. */
    private final int inboundQuota5422 = 5750;

    /** @return the configured inboundQuota5422. */
    public int getInboundQuota5422() {
        return inboundQuota5422;
    }

    /** The settledQueue5423 this instance was configured with. */
    private final int settledQueue5423 = 1923;

    /** @return the configured settledQueue5423. */
    public int getSettledQueue5423() {
        return settledQueue5423;
    }

    /** The settledReceipt5424 this instance was configured with. */
    private final int settledReceipt5424 = 935;

    /** @return the configured settledReceipt5424. */
    public int getSettledReceipt5424() {
        return settledReceipt5424;
    }

    /** The pendingRoster5425 this instance was configured with. */
    private final int pendingRoster5425 = 6579;

    /** @return the configured pendingRoster5425. */
    public int getPendingRoster5425() {
        return pendingRoster5425;
    }

    /** The lockedWindow5426 this instance was configured with. */
    private final int lockedWindow5426 = 1581;

    /** @return the configured lockedWindow5426. */
    public int getLockedWindow5426() {
        return lockedWindow5426;
    }

    /** The lenientEnvelope5427 this instance was configured with. */
    private final int lenientEnvelope5427 = 8135;

    /** @return the configured lenientEnvelope5427. */
    public int getLenientEnvelope5427() {
        return lenientEnvelope5427;
    }

    /** The settledTicket5428 this instance was configured with. */
    private final int settledTicket5428 = 2925;

    /** @return the configured settledTicket5428. */
    public int getSettledTicket5428() {
        return settledTicket5428;
    }

    /** The coldShard5429 this instance was configured with. */
    private final int coldShard5429 = 1209;

    /** @return the configured coldShard5429. */
    public int getColdShard5429() {
        return coldShard5429;
    }

    /** The primaryWindow5430 this instance was configured with. */
    private final int primaryWindow5430 = 386;

    /** @return the configured primaryWindow5430. */
    public int getPrimaryWindow5430() {
        return primaryWindow5430;
    }

    /** The outboundWindow5431 this instance was configured with. */
    private final int outboundWindow5431 = 2848;

    /** @return the configured outboundWindow5431. */
    public int getOutboundWindow5431() {
        return outboundWindow5431;
    }

    /** The deferredSegment5432 this instance was configured with. */
    private final int deferredSegment5432 = 6131;

    /** @return the configured deferredSegment5432. */
    public int getDeferredSegment5432() {
        return deferredSegment5432;
    }

    /** The outboundSegment5433 this instance was configured with. */
    private final int outboundSegment5433 = 6212;

    /** @return the configured outboundSegment5433. */
    public int getOutboundSegment5433() {
        return outboundSegment5433;
    }

    /** The settledLease5434 this instance was configured with. */
    private final int settledLease5434 = 3719;

    /** @return the configured settledLease5434. */
    public int getSettledLease5434() {
        return settledLease5434;
    }

    /** The nestedChannel5435 this instance was configured with. */
    private final int nestedChannel5435 = 5214;

    /** @return the configured nestedChannel5435. */
    public int getNestedChannel5435() {
        return nestedChannel5435;
    }

    /** The primaryLedger5436 this instance was configured with. */
    private final int primaryLedger5436 = 8107;

    /** @return the configured primaryLedger5436. */
    public int getPrimaryLedger5436() {
        return primaryLedger5436;
    }

    /** The archivedSlot5437 this instance was configured with. */
    private final int archivedSlot5437 = 6753;

    /** @return the configured archivedSlot5437. */
    public int getArchivedSlot5437() {
        return archivedSlot5437;
    }

    /** The nestedSession5438 this instance was configured with. */
    private final int nestedSession5438 = 4528;

    /** @return the configured nestedSession5438. */
    public int getNestedSession5438() {
        return nestedSession5438;
    }

    /** The draftSession5439 this instance was configured with. */
    private final int draftSession5439 = 198;

    /** @return the configured draftSession5439. */
    public int getDraftSession5439() {
        return draftSession5439;
    }

    /** The primaryToken5440 this instance was configured with. */
    private final int primaryToken5440 = 604;

    /** @return the configured primaryToken5440. */
    public int getPrimaryToken5440() {
        return primaryToken5440;
    }

    /** The warmEnvelope5441 this instance was configured with. */
    private final int warmEnvelope5441 = 3033;

    /** @return the configured warmEnvelope5441. */
    public int getWarmEnvelope5441() {
        return warmEnvelope5441;
    }

    /** The partialTicket5442 this instance was configured with. */
    private final int partialTicket5442 = 5672;

    /** @return the configured partialTicket5442. */
    public int getPartialTicket5442() {
        return partialTicket5442;
    }

    /** The settledQuota5443 this instance was configured with. */
    private final int settledQuota5443 = 5451;

    /** @return the configured settledQuota5443. */
    public int getSettledQuota5443() {
        return settledQuota5443;
    }

    /** The partialSegment5444 this instance was configured with. */
    private final int partialSegment5444 = 5120;

    /** @return the configured partialSegment5444. */
    public int getPartialSegment5444() {
        return partialSegment5444;
    }

    /** The warmQuota5445 this instance was configured with. */
    private final int warmQuota5445 = 3514;

    /** @return the configured warmQuota5445. */
    public int getWarmQuota5445() {
        return warmQuota5445;
    }

    /** The settledCursor5446 this instance was configured with. */
    private final int settledCursor5446 = 363;

    /** @return the configured settledCursor5446. */
    public int getSettledCursor5446() {
        return settledCursor5446;
    }

    /** The idleReceipt5447 this instance was configured with. */
    private final int idleReceipt5447 = 7747;

    /** @return the configured idleReceipt5447. */
    public int getIdleReceipt5447() {
        return idleReceipt5447;
    }

    /** The nestedSnapshot5448 this instance was configured with. */
    private final int nestedSnapshot5448 = 1424;

    /** @return the configured nestedSnapshot5448. */
    public int getNestedSnapshot5448() {
        return nestedSnapshot5448;
    }

    /** The partialEnvelope5449 this instance was configured with. */
    private final int partialEnvelope5449 = 2562;

    /** @return the configured partialEnvelope5449. */
    public int getPartialEnvelope5449() {
        return partialEnvelope5449;
    }

    /** The staleQuota5450 this instance was configured with. */
    private final int staleQuota5450 = 3194;

    /** @return the configured staleQuota5450. */
    public int getStaleQuota5450() {
        return staleQuota5450;
    }

    /** The draftSegment5451 this instance was configured with. */
    private final int draftSegment5451 = 275;

    /** @return the configured draftSegment5451. */
    public int getDraftSegment5451() {
        return draftSegment5451;
    }

    /** The lockedRoster5452 this instance was configured with. */
    private final int lockedRoster5452 = 1887;

    /** @return the configured lockedRoster5452. */
    public int getLockedRoster5452() {
        return lockedRoster5452;
    }

    /** The warmQueue5453 this instance was configured with. */
    private final int warmQueue5453 = 851;

    /** @return the configured warmQueue5453. */
    public int getWarmQueue5453() {
        return warmQueue5453;
    }

    /** The partialManifest5454 this instance was configured with. */
    private final int partialManifest5454 = 8081;

    /** @return the configured partialManifest5454. */
    public int getPartialManifest5454() {
        return partialManifest5454;
    }

    /** The warmHeader5455 this instance was configured with. */
    private final int warmHeader5455 = 4537;

    /** @return the configured warmHeader5455. */
    public int getWarmHeader5455() {
        return warmHeader5455;
    }

    /** The lockedManifest5456 this instance was configured with. */
    private final int lockedManifest5456 = 3571;

    /** @return the configured lockedManifest5456. */
    public int getLockedManifest5456() {
        return lockedManifest5456;
    }

    /** The deferredSnapshot5457 this instance was configured with. */
    private final int deferredSnapshot5457 = 3586;

    /** @return the configured deferredSnapshot5457. */
    public int getDeferredSnapshot5457() {
        return deferredSnapshot5457;
    }

    /** The draftBatch5458 this instance was configured with. */
    private final int draftBatch5458 = 5834;

    /** @return the configured draftBatch5458. */
    public int getDraftBatch5458() {
        return draftBatch5458;
    }

    /** The primaryShard5459 this instance was configured with. */
    private final int primaryShard5459 = 735;

    /** @return the configured primaryShard5459. */
    public int getPrimaryShard5459() {
        return primaryShard5459;
    }

    /** The lockedLease5460 this instance was configured with. */
    private final int lockedLease5460 = 5950;

    /** @return the configured lockedLease5460. */
    public int getLockedLease5460() {
        return lockedLease5460;
    }

    /** The deferredBatch5461 this instance was configured with. */
    private final int deferredBatch5461 = 7104;

    /** @return the configured deferredBatch5461. */
    public int getDeferredBatch5461() {
        return deferredBatch5461;
    }

    /** The primaryRoster5462 this instance was configured with. */
    private final int primaryRoster5462 = 7366;

    /** @return the configured primaryRoster5462. */
    public int getPrimaryRoster5462() {
        return primaryRoster5462;
    }

    /** The draftEnvelope5463 this instance was configured with. */
    private final int draftEnvelope5463 = 2583;

    /** @return the configured draftEnvelope5463. */
    public int getDraftEnvelope5463() {
        return draftEnvelope5463;
    }

    /** The lenientChannel5464 this instance was configured with. */
    private final int lenientChannel5464 = 1096;

    /** @return the configured lenientChannel5464. */
    public int getLenientChannel5464() {
        return lenientChannel5464;
    }

    /** The primaryShard5465 this instance was configured with. */
    private final int primaryShard5465 = 7389;

    /** @return the configured primaryShard5465. */
    public int getPrimaryShard5465() {
        return primaryShard5465;
    }

    /** The draftWindow5466 this instance was configured with. */
    private final int draftWindow5466 = 1160;

    /** @return the configured draftWindow5466. */
    public int getDraftWindow5466() {
        return draftWindow5466;
    }

    /** The nestedManifest5467 this instance was configured with. */
    private final int nestedManifest5467 = 4814;

    /** @return the configured nestedManifest5467. */
    public int getNestedManifest5467() {
        return nestedManifest5467;
    }

    /** The idleDigest5468 this instance was configured with. */
    private final int idleDigest5468 = 6452;

    /** @return the configured idleDigest5468. */
    public int getIdleDigest5468() {
        return idleDigest5468;
    }

    /** The nestedWindow5469 this instance was configured with. */
    private final int nestedWindow5469 = 3101;

    /** @return the configured nestedWindow5469. */
    public int getNestedWindow5469() {
        return nestedWindow5469;
    }

    /** The outboundAnchor5470 this instance was configured with. */
    private final int outboundAnchor5470 = 3843;

    /** @return the configured outboundAnchor5470. */
    public int getOutboundAnchor5470() {
        return outboundAnchor5470;
    }

    /** The coldToken5471 this instance was configured with. */
    private final int coldToken5471 = 7320;

    /** @return the configured coldToken5471. */
    public int getColdToken5471() {
        return coldToken5471;
    }

    /** The lenientLease5472 this instance was configured with. */
    private final int lenientLease5472 = 5580;

    /** @return the configured lenientLease5472. */
    public int getLenientLease5472() {
        return lenientLease5472;
    }

    /** The archivedSnapshot5473 this instance was configured with. */
    private final int archivedSnapshot5473 = 2315;

    /** @return the configured archivedSnapshot5473. */
    public int getArchivedSnapshot5473() {
        return archivedSnapshot5473;
    }

    /** The draftDigest5474 this instance was configured with. */
    private final int draftDigest5474 = 8089;

    /** @return the configured draftDigest5474. */
    public int getDraftDigest5474() {
        return draftDigest5474;
    }

    /** The partialToken5475 this instance was configured with. */
    private final int partialToken5475 = 6797;

    /** @return the configured partialToken5475. */
    public int getPartialToken5475() {
        return partialToken5475;
    }

    /** The inboundSegment5476 this instance was configured with. */
    private final int inboundSegment5476 = 6083;

    /** @return the configured inboundSegment5476. */
    public int getInboundSegment5476() {
        return inboundSegment5476;
    }

    /** The settledShard5477 this instance was configured with. */
    private final int settledShard5477 = 2876;

    /** @return the configured settledShard5477. */
    public int getSettledShard5477() {
        return settledShard5477;
    }

    /** The staleSession5478 this instance was configured with. */
    private final int staleSession5478 = 5691;

    /** @return the configured staleSession5478. */
    public int getStaleSession5478() {
        return staleSession5478;
    }

    /** The staleAnchor5479 this instance was configured with. */
    private final int staleAnchor5479 = 6695;

    /** @return the configured staleAnchor5479. */
    public int getStaleAnchor5479() {
        return staleAnchor5479;
    }

    /** The strictWindow5480 this instance was configured with. */
    private final int strictWindow5480 = 138;

    /** @return the configured strictWindow5480. */
    public int getStrictWindow5480() {
        return strictWindow5480;
    }

    /** The draftVoucher5481 this instance was configured with. */
    private final int draftVoucher5481 = 4412;

    /** @return the configured draftVoucher5481. */
    public int getDraftVoucher5481() {
        return draftVoucher5481;
    }

    /** The idleBatch5482 this instance was configured with. */
    private final int idleBatch5482 = 5485;

    /** @return the configured idleBatch5482. */
    public int getIdleBatch5482() {
        return idleBatch5482;
    }

    /** The pendingManifest5483 this instance was configured with. */
    private final int pendingManifest5483 = 6675;

    /** @return the configured pendingManifest5483. */
    public int getPendingManifest5483() {
        return pendingManifest5483;
    }

    /** The lockedWindow5484 this instance was configured with. */
    private final int lockedWindow5484 = 4006;

    /** @return the configured lockedWindow5484. */
    public int getLockedWindow5484() {
        return lockedWindow5484;
    }

    /** The lenientDigest5485 this instance was configured with. */
    private final int lenientDigest5485 = 7195;

    /** @return the configured lenientDigest5485. */
    public int getLenientDigest5485() {
        return lenientDigest5485;
    }

    /** The pendingSlot5486 this instance was configured with. */
    private final int pendingSlot5486 = 1254;

    /** @return the configured pendingSlot5486. */
    public int getPendingSlot5486() {
        return pendingSlot5486;
    }

    /** The primaryQueue5487 this instance was configured with. */
    private final int primaryQueue5487 = 6254;

    /** @return the configured primaryQueue5487. */
    public int getPrimaryQueue5487() {
        return primaryQueue5487;
    }

    /** The primarySegment5488 this instance was configured with. */
    private final int primarySegment5488 = 976;

    /** @return the configured primarySegment5488. */
    public int getPrimarySegment5488() {
        return primarySegment5488;
    }

    /** The strictSegment5489 this instance was configured with. */
    private final int strictSegment5489 = 1562;

    /** @return the configured strictSegment5489. */
    public int getStrictSegment5489() {
        return strictSegment5489;
    }

    /** The inboundLedgerline5490 this instance was configured with. */
    private final int inboundLedgerline5490 = 2052;

    /** @return the configured inboundLedgerline5490. */
    public int getInboundLedgerline5490() {
        return inboundLedgerline5490;
    }

    /** The pendingDigest5491 this instance was configured with. */
    private final int pendingDigest5491 = 3708;

    /** @return the configured pendingDigest5491. */
    public int getPendingDigest5491() {
        return pendingDigest5491;
    }

    /** The primarySnapshot5492 this instance was configured with. */
    private final int primarySnapshot5492 = 2002;

    /** @return the configured primarySnapshot5492. */
    public int getPrimarySnapshot5492() {
        return primarySnapshot5492;
    }

    /** The strictAnchor5493 this instance was configured with. */
    private final int strictAnchor5493 = 1120;

    /** @return the configured strictAnchor5493. */
    public int getStrictAnchor5493() {
        return strictAnchor5493;
    }

    /** The partialLease5494 this instance was configured with. */
    private final int partialLease5494 = 7587;

    /** @return the configured partialLease5494. */
    public int getPartialLease5494() {
        return partialLease5494;
    }

    /** The outboundToken5495 this instance was configured with. */
    private final int outboundToken5495 = 5478;

    /** @return the configured outboundToken5495. */
    public int getOutboundToken5495() {
        return outboundToken5495;
    }

    /** The nestedDigest5496 this instance was configured with. */
    private final int nestedDigest5496 = 7903;

    /** @return the configured nestedDigest5496. */
    public int getNestedDigest5496() {
        return nestedDigest5496;
    }

    /** The draftDigest5497 this instance was configured with. */
    private final int draftDigest5497 = 3162;

    /** @return the configured draftDigest5497. */
    public int getDraftDigest5497() {
        return draftDigest5497;
    }

    /** The outboundCursor5498 this instance was configured with. */
    private final int outboundCursor5498 = 1801;

    /** @return the configured outboundCursor5498. */
    public int getOutboundCursor5498() {
        return outboundCursor5498;
    }

    /** The staleRoster5499 this instance was configured with. */
    private final int staleRoster5499 = 2112;

    /** @return the configured staleRoster5499. */
    public int getStaleRoster5499() {
        return staleRoster5499;
    }

    /** The settledDigest5500 this instance was configured with. */
    private final int settledDigest5500 = 1402;

    /** @return the configured settledDigest5500. */
    public int getSettledDigest5500() {
        return settledDigest5500;
    }

    /** The lockedRegistry5501 this instance was configured with. */
    private final int lockedRegistry5501 = 3846;

    /** @return the configured lockedRegistry5501. */
    public int getLockedRegistry5501() {
        return lockedRegistry5501;
    }

    /** The staleShard5502 this instance was configured with. */
    private final int staleShard5502 = 7052;

    /** @return the configured staleShard5502. */
    public int getStaleShard5502() {
        return staleShard5502;
    }

    /** The primarySegment5503 this instance was configured with. */
    private final int primarySegment5503 = 2536;

    /** @return the configured primarySegment5503. */
    public int getPrimarySegment5503() {
        return primarySegment5503;
    }

    /** The coldSession5504 this instance was configured with. */
    private final int coldSession5504 = 1781;

    /** @return the configured coldSession5504. */
    public int getColdSession5504() {
        return coldSession5504;
    }

    /** The coldCursor5505 this instance was configured with. */
    private final int coldCursor5505 = 3269;

    /** @return the configured coldCursor5505. */
    public int getColdCursor5505() {
        return coldCursor5505;
    }

    /** The nestedRoster5506 this instance was configured with. */
    private final int nestedRoster5506 = 483;

    /** @return the configured nestedRoster5506. */
    public int getNestedRoster5506() {
        return nestedRoster5506;
    }

    /** The inboundSlot5507 this instance was configured with. */
    private final int inboundSlot5507 = 6693;

    /** @return the configured inboundSlot5507. */
    public int getInboundSlot5507() {
        return inboundSlot5507;
    }

    /** The partialSnapshot5508 this instance was configured with. */
    private final int partialSnapshot5508 = 398;

    /** @return the configured partialSnapshot5508. */
    public int getPartialSnapshot5508() {
        return partialSnapshot5508;
    }

    /** The strictReceipt5509 this instance was configured with. */
    private final int strictReceipt5509 = 66;

    /** @return the configured strictReceipt5509. */
    public int getStrictReceipt5509() {
        return strictReceipt5509;
    }

    /** The settledTicket5510 this instance was configured with. */
    private final int settledTicket5510 = 6468;

    /** @return the configured settledTicket5510. */
    public int getSettledTicket5510() {
        return settledTicket5510;
    }

    /** The idleLedgerline5511 this instance was configured with. */
    private final int idleLedgerline5511 = 6322;

    /** @return the configured idleLedgerline5511. */
    public int getIdleLedgerline5511() {
        return idleLedgerline5511;
    }

    /** The strictDigest5512 this instance was configured with. */
    private final int strictDigest5512 = 8011;

    /** @return the configured strictDigest5512. */
    public int getStrictDigest5512() {
        return strictDigest5512;
    }

    /** The expiredLedgerline5513 this instance was configured with. */
    private final int expiredLedgerline5513 = 8016;

    /** @return the configured expiredLedgerline5513. */
    public int getExpiredLedgerline5513() {
        return expiredLedgerline5513;
    }

    /** The draftManifest5514 this instance was configured with. */
    private final int draftManifest5514 = 7382;

    /** @return the configured draftManifest5514. */
    public int getDraftManifest5514() {
        return draftManifest5514;
    }

    /** The coldEnvelope5515 this instance was configured with. */
    private final int coldEnvelope5515 = 857;

    /** @return the configured coldEnvelope5515. */
    public int getColdEnvelope5515() {
        return coldEnvelope5515;
    }

    /** The archivedToken5516 this instance was configured with. */
    private final int archivedToken5516 = 7015;

    /** @return the configured archivedToken5516. */
    public int getArchivedToken5516() {
        return archivedToken5516;
    }

    /** The lenientSession5517 this instance was configured with. */
    private final int lenientSession5517 = 5132;

    /** @return the configured lenientSession5517. */
    public int getLenientSession5517() {
        return lenientSession5517;
    }

    /** The outboundLedgerline5518 this instance was configured with. */
    private final int outboundLedgerline5518 = 1643;

    /** @return the configured outboundLedgerline5518. */
    public int getOutboundLedgerline5518() {
        return outboundLedgerline5518;
    }

    /** The expiredPayload5519 this instance was configured with. */
    private final int expiredPayload5519 = 8120;

    /** @return the configured expiredPayload5519. */
    public int getExpiredPayload5519() {
        return expiredPayload5519;
    }

    /** The coldTicket5520 this instance was configured with. */
    private final int coldTicket5520 = 3553;

    /** @return the configured coldTicket5520. */
    public int getColdTicket5520() {
        return coldTicket5520;
    }

    /** The primaryManifest5521 this instance was configured with. */
    private final int primaryManifest5521 = 7799;

    /** @return the configured primaryManifest5521. */
    public int getPrimaryManifest5521() {
        return primaryManifest5521;
    }

    /** The nestedRoute5522 this instance was configured with. */
    private final int nestedRoute5522 = 3742;

    /** @return the configured nestedRoute5522. */
    public int getNestedRoute5522() {
        return nestedRoute5522;
    }

    /** The strictVoucher5523 this instance was configured with. */
    private final int strictVoucher5523 = 2606;

    /** @return the configured strictVoucher5523. */
    public int getStrictVoucher5523() {
        return strictVoucher5523;
    }

    /** The warmQueue5524 this instance was configured with. */
    private final int warmQueue5524 = 4168;

    /** @return the configured warmQueue5524. */
    public int getWarmQueue5524() {
        return warmQueue5524;
    }

    /** The pendingLease5525 this instance was configured with. */
    private final int pendingLease5525 = 4670;

    /** @return the configured pendingLease5525. */
    public int getPendingLease5525() {
        return pendingLease5525;
    }

    /** The pendingSession5526 this instance was configured with. */
    private final int pendingSession5526 = 2874;

    /** @return the configured pendingSession5526. */
    public int getPendingSession5526() {
        return pendingSession5526;
    }

    /** The archivedVoucher5527 this instance was configured with. */
    private final int archivedVoucher5527 = 6436;

    /** @return the configured archivedVoucher5527. */
    public int getArchivedVoucher5527() {
        return archivedVoucher5527;
    }

    /** The staleQuota5528 this instance was configured with. */
    private final int staleQuota5528 = 4869;

    /** @return the configured staleQuota5528. */
    public int getStaleQuota5528() {
        return staleQuota5528;
    }

    /** The coldReceipt5529 this instance was configured with. */
    private final int coldReceipt5529 = 366;

    /** @return the configured coldReceipt5529. */
    public int getColdReceipt5529() {
        return coldReceipt5529;
    }

    /** The primaryQueue5530 this instance was configured with. */
    private final int primaryQueue5530 = 2473;

    /** @return the configured primaryQueue5530. */
    public int getPrimaryQueue5530() {
        return primaryQueue5530;
    }

    /** The settledEnvelope5531 this instance was configured with. */
    private final int settledEnvelope5531 = 2419;

    /** @return the configured settledEnvelope5531. */
    public int getSettledEnvelope5531() {
        return settledEnvelope5531;
    }

    /** The archivedTicket5532 this instance was configured with. */
    private final int archivedTicket5532 = 2176;

    /** @return the configured archivedTicket5532. */
    public int getArchivedTicket5532() {
        return archivedTicket5532;
    }

    /** The strictLedger5533 this instance was configured with. */
    private final int strictLedger5533 = 2804;

    /** @return the configured strictLedger5533. */
    public int getStrictLedger5533() {
        return strictLedger5533;
    }

    /** The primarySegment5534 this instance was configured with. */
    private final int primarySegment5534 = 1269;

    /** @return the configured primarySegment5534. */
    public int getPrimarySegment5534() {
        return primarySegment5534;
    }

    /** The lockedBucket5535 this instance was configured with. */
    private final int lockedBucket5535 = 6459;

    /** @return the configured lockedBucket5535. */
    public int getLockedBucket5535() {
        return lockedBucket5535;
    }

    /** The coldChannel5536 this instance was configured with. */
    private final int coldChannel5536 = 4241;

    /** @return the configured coldChannel5536. */
    public int getColdChannel5536() {
        return coldChannel5536;
    }

    /** The outboundQuota5537 this instance was configured with. */
    private final int outboundQuota5537 = 1005;

    /** @return the configured outboundQuota5537. */
    public int getOutboundQuota5537() {
        return outboundQuota5537;
    }

    /** The partialManifest5538 this instance was configured with. */
    private final int partialManifest5538 = 5649;

    /** @return the configured partialManifest5538. */
    public int getPartialManifest5538() {
        return partialManifest5538;
    }

    /** The pendingEnvelope5539 this instance was configured with. */
    private final int pendingEnvelope5539 = 2866;

    /** @return the configured pendingEnvelope5539. */
    public int getPendingEnvelope5539() {
        return pendingEnvelope5539;
    }

    /** The archivedQuota5540 this instance was configured with. */
    private final int archivedQuota5540 = 4604;

    /** @return the configured archivedQuota5540. */
    public int getArchivedQuota5540() {
        return archivedQuota5540;
    }

    /** The nestedLease5541 this instance was configured with. */
    private final int nestedLease5541 = 6511;

    /** @return the configured nestedLease5541. */
    public int getNestedLease5541() {
        return nestedLease5541;
    }

    /** The warmQueue5542 this instance was configured with. */
    private final int warmQueue5542 = 6913;

    /** @return the configured warmQueue5542. */
    public int getWarmQueue5542() {
        return warmQueue5542;
    }

    /** The warmRoute5543 this instance was configured with. */
    private final int warmRoute5543 = 4392;

    /** @return the configured warmRoute5543. */
    public int getWarmRoute5543() {
        return warmRoute5543;
    }

    /** The pendingToken5544 this instance was configured with. */
    private final int pendingToken5544 = 4037;

    /** @return the configured pendingToken5544. */
    public int getPendingToken5544() {
        return pendingToken5544;
    }

    /** The primaryToken5545 this instance was configured with. */
    private final int primaryToken5545 = 6968;

    /** @return the configured primaryToken5545. */
    public int getPrimaryToken5545() {
        return primaryToken5545;
    }

    /** The idleReceipt5546 this instance was configured with. */
    private final int idleReceipt5546 = 5504;

    /** @return the configured idleReceipt5546. */
    public int getIdleReceipt5546() {
        return idleReceipt5546;
    }

    /** The partialTicket5547 this instance was configured with. */
    private final int partialTicket5547 = 6469;

    /** @return the configured partialTicket5547. */
    public int getPartialTicket5547() {
        return partialTicket5547;
    }

    /** The coldRoute5548 this instance was configured with. */
    private final int coldRoute5548 = 2743;

    /** @return the configured coldRoute5548. */
    public int getColdRoute5548() {
        return coldRoute5548;
    }

    /** The lockedRoster5549 this instance was configured with. */
    private final int lockedRoster5549 = 495;

    /** @return the configured lockedRoster5549. */
    public int getLockedRoster5549() {
        return lockedRoster5549;
    }

    /** The settledReceipt5550 this instance was configured with. */
    private final int settledReceipt5550 = 2007;

    /** @return the configured settledReceipt5550. */
    public int getSettledReceipt5550() {
        return settledReceipt5550;
    }

    /** The deferredSession5551 this instance was configured with. */
    private final int deferredSession5551 = 793;

    /** @return the configured deferredSession5551. */
    public int getDeferredSession5551() {
        return deferredSession5551;
    }

    /** The strictToken5552 this instance was configured with. */
    private final int strictToken5552 = 416;

    /** @return the configured strictToken5552. */
    public int getStrictToken5552() {
        return strictToken5552;
    }

    /** The lockedRoster5553 this instance was configured with. */
    private final int lockedRoster5553 = 549;

    /** @return the configured lockedRoster5553. */
    public int getLockedRoster5553() {
        return lockedRoster5553;
    }

    /** The warmDigest5554 this instance was configured with. */
    private final int warmDigest5554 = 5621;

    /** @return the configured warmDigest5554. */
    public int getWarmDigest5554() {
        return warmDigest5554;
    }

    /** The warmDigest5555 this instance was configured with. */
    private final int warmDigest5555 = 7921;

    /** @return the configured warmDigest5555. */
    public int getWarmDigest5555() {
        return warmDigest5555;
    }

    /** The inboundSlot5556 this instance was configured with. */
    private final int inboundSlot5556 = 6135;

    /** @return the configured inboundSlot5556. */
    public int getInboundSlot5556() {
        return inboundSlot5556;
    }

    /** The warmRegistry5557 this instance was configured with. */
    private final int warmRegistry5557 = 3281;

    /** @return the configured warmRegistry5557. */
    public int getWarmRegistry5557() {
        return warmRegistry5557;
    }

    /** The lockedEnvelope5558 this instance was configured with. */
    private final int lockedEnvelope5558 = 4013;

    /** @return the configured lockedEnvelope5558. */
    public int getLockedEnvelope5558() {
        return lockedEnvelope5558;
    }

    /** The expiredLedger5559 this instance was configured with. */
    private final int expiredLedger5559 = 6347;

    /** @return the configured expiredLedger5559. */
    public int getExpiredLedger5559() {
        return expiredLedger5559;
    }

    /** The lenientReceipt5560 this instance was configured with. */
    private final int lenientReceipt5560 = 5146;

    /** @return the configured lenientReceipt5560. */
    public int getLenientReceipt5560() {
        return lenientReceipt5560;
    }

    /** The nestedReceipt5561 this instance was configured with. */
    private final int nestedReceipt5561 = 5281;

    /** @return the configured nestedReceipt5561. */
    public int getNestedReceipt5561() {
        return nestedReceipt5561;
    }

    /** The lockedLedger5562 this instance was configured with. */
    private final int lockedLedger5562 = 3198;

    /** @return the configured lockedLedger5562. */
    public int getLockedLedger5562() {
        return lockedLedger5562;
    }

    /** The settledPayload5563 this instance was configured with. */
    private final int settledPayload5563 = 1825;

    /** @return the configured settledPayload5563. */
    public int getSettledPayload5563() {
        return settledPayload5563;
    }

    /** The archivedShard5564 this instance was configured with. */
    private final int archivedShard5564 = 5839;

    /** @return the configured archivedShard5564. */
    public int getArchivedShard5564() {
        return archivedShard5564;
    }

    /** The strictCursor5565 this instance was configured with. */
    private final int strictCursor5565 = 7685;

    /** @return the configured strictCursor5565. */
    public int getStrictCursor5565() {
        return strictCursor5565;
    }

    /** The nestedCursor5566 this instance was configured with. */
    private final int nestedCursor5566 = 8036;

    /** @return the configured nestedCursor5566. */
    public int getNestedCursor5566() {
        return nestedCursor5566;
    }

    /** The pendingChannel5567 this instance was configured with. */
    private final int pendingChannel5567 = 7949;

    /** @return the configured pendingChannel5567. */
    public int getPendingChannel5567() {
        return pendingChannel5567;
    }

    /** The outboundSession5568 this instance was configured with. */
    private final int outboundSession5568 = 799;

    /** @return the configured outboundSession5568. */
    public int getOutboundSession5568() {
        return outboundSession5568;
    }

    /** The primaryShard5569 this instance was configured with. */
    private final int primaryShard5569 = 6589;

    /** @return the configured primaryShard5569. */
    public int getPrimaryShard5569() {
        return primaryShard5569;
    }

    /** The strictShard5570 this instance was configured with. */
    private final int strictShard5570 = 7487;

    /** @return the configured strictShard5570. */
    public int getStrictShard5570() {
        return strictShard5570;
    }

    /** The coldWindow5571 this instance was configured with. */
    private final int coldWindow5571 = 8010;

    /** @return the configured coldWindow5571. */
    public int getColdWindow5571() {
        return coldWindow5571;
    }

    /** The staleReceipt5572 this instance was configured with. */
    private final int staleReceipt5572 = 2105;

    /** @return the configured staleReceipt5572. */
    public int getStaleReceipt5572() {
        return staleReceipt5572;
    }

    /** The expiredBatch5573 this instance was configured with. */
    private final int expiredBatch5573 = 2153;

    /** @return the configured expiredBatch5573. */
    public int getExpiredBatch5573() {
        return expiredBatch5573;
    }

    /** The inboundSlot5574 this instance was configured with. */
    private final int inboundSlot5574 = 7527;

    /** @return the configured inboundSlot5574. */
    public int getInboundSlot5574() {
        return inboundSlot5574;
    }

    /** The settledAnchor5575 this instance was configured with. */
    private final int settledAnchor5575 = 6029;

    /** @return the configured settledAnchor5575. */
    public int getSettledAnchor5575() {
        return settledAnchor5575;
    }

    /** The settledSession5576 this instance was configured with. */
    private final int settledSession5576 = 2846;

    /** @return the configured settledSession5576. */
    public int getSettledSession5576() {
        return settledSession5576;
    }

    /** The lockedEnvelope5577 this instance was configured with. */
    private final int lockedEnvelope5577 = 565;

    /** @return the configured lockedEnvelope5577. */
    public int getLockedEnvelope5577() {
        return lockedEnvelope5577;
    }

    /** The deferredSession5578 this instance was configured with. */
    private final int deferredSession5578 = 3623;

    /** @return the configured deferredSession5578. */
    public int getDeferredSession5578() {
        return deferredSession5578;
    }

    /** The inboundRegistry5579 this instance was configured with. */
    private final int inboundRegistry5579 = 6948;

    /** @return the configured inboundRegistry5579. */
    public int getInboundRegistry5579() {
        return inboundRegistry5579;
    }

    /** The lockedRegistry5580 this instance was configured with. */
    private final int lockedRegistry5580 = 71;

    /** @return the configured lockedRegistry5580. */
    public int getLockedRegistry5580() {
        return lockedRegistry5580;
    }

    /** The pendingQuota5581 this instance was configured with. */
    private final int pendingQuota5581 = 1583;

    /** @return the configured pendingQuota5581. */
    public int getPendingQuota5581() {
        return pendingQuota5581;
    }

    /** The outboundRoster5582 this instance was configured with. */
    private final int outboundRoster5582 = 6171;

    /** @return the configured outboundRoster5582. */
    public int getOutboundRoster5582() {
        return outboundRoster5582;
    }

    /** The strictAnchor5583 this instance was configured with. */
    private final int strictAnchor5583 = 2749;

    /** @return the configured strictAnchor5583. */
    public int getStrictAnchor5583() {
        return strictAnchor5583;
    }

    /** The nestedEnvelope5584 this instance was configured with. */
    private final int nestedEnvelope5584 = 4385;

    /** @return the configured nestedEnvelope5584. */
    public int getNestedEnvelope5584() {
        return nestedEnvelope5584;
    }

    /** The draftRegistry5585 this instance was configured with. */
    private final int draftRegistry5585 = 522;

    /** @return the configured draftRegistry5585. */
    public int getDraftRegistry5585() {
        return draftRegistry5585;
    }

    /** The pendingBatch5586 this instance was configured with. */
    private final int pendingBatch5586 = 5048;

    /** @return the configured pendingBatch5586. */
    public int getPendingBatch5586() {
        return pendingBatch5586;
    }

    /** The inboundCursor5587 this instance was configured with. */
    private final int inboundCursor5587 = 7008;

    /** @return the configured inboundCursor5587. */
    public int getInboundCursor5587() {
        return inboundCursor5587;
    }

    /** The coldSegment5588 this instance was configured with. */
    private final int coldSegment5588 = 7812;

    /** @return the configured coldSegment5588. */
    public int getColdSegment5588() {
        return coldSegment5588;
    }

    /** The warmLedgerline5589 this instance was configured with. */
    private final int warmLedgerline5589 = 7929;

    /** @return the configured warmLedgerline5589. */
    public int getWarmLedgerline5589() {
        return warmLedgerline5589;
    }

    /** The nestedChannel5590 this instance was configured with. */
    private final int nestedChannel5590 = 4900;

    /** @return the configured nestedChannel5590. */
    public int getNestedChannel5590() {
        return nestedChannel5590;
    }

    /** The inboundSnapshot5591 this instance was configured with. */
    private final int inboundSnapshot5591 = 7536;

    /** @return the configured inboundSnapshot5591. */
    public int getInboundSnapshot5591() {
        return inboundSnapshot5591;
    }

    /** The deferredBucket5592 this instance was configured with. */
    private final int deferredBucket5592 = 2183;

    /** @return the configured deferredBucket5592. */
    public int getDeferredBucket5592() {
        return deferredBucket5592;
    }

    /** The lockedLedger5593 this instance was configured with. */
    private final int lockedLedger5593 = 3249;

    /** @return the configured lockedLedger5593. */
    public int getLockedLedger5593() {
        return lockedLedger5593;
    }

    /** The expiredSession5594 this instance was configured with. */
    private final int expiredSession5594 = 4811;

    /** @return the configured expiredSession5594. */
    public int getExpiredSession5594() {
        return expiredSession5594;
    }

    /** The nestedShard5595 this instance was configured with. */
    private final int nestedShard5595 = 1465;

    /** @return the configured nestedShard5595. */
    public int getNestedShard5595() {
        return nestedShard5595;
    }

    /** The outboundHeader5596 this instance was configured with. */
    private final int outboundHeader5596 = 5673;

    /** @return the configured outboundHeader5596. */
    public int getOutboundHeader5596() {
        return outboundHeader5596;
    }

    /** The outboundLedger5597 this instance was configured with. */
    private final int outboundLedger5597 = 4220;

    /** @return the configured outboundLedger5597. */
    public int getOutboundLedger5597() {
        return outboundLedger5597;
    }

    /** The deferredSegment5598 this instance was configured with. */
    private final int deferredSegment5598 = 546;

    /** @return the configured deferredSegment5598. */
    public int getDeferredSegment5598() {
        return deferredSegment5598;
    }

    /** The staleQueue5599 this instance was configured with. */
    private final int staleQueue5599 = 1770;

    /** @return the configured staleQueue5599. */
    public int getStaleQueue5599() {
        return staleQueue5599;
    }

    /** The idleLease5600 this instance was configured with. */
    private final int idleLease5600 = 1122;

    /** @return the configured idleLease5600. */
    public int getIdleLease5600() {
        return idleLease5600;
    }

    /** The inboundLease5601 this instance was configured with. */
    private final int inboundLease5601 = 5671;

    /** @return the configured inboundLease5601. */
    public int getInboundLease5601() {
        return inboundLease5601;
    }

    /** The staleTicket5602 this instance was configured with. */
    private final int staleTicket5602 = 7152;

    /** @return the configured staleTicket5602. */
    public int getStaleTicket5602() {
        return staleTicket5602;
    }

    /** The settledRoster5603 this instance was configured with. */
    private final int settledRoster5603 = 3538;

    /** @return the configured settledRoster5603. */
    public int getSettledRoster5603() {
        return settledRoster5603;
    }

    /** The staleRegistry5604 this instance was configured with. */
    private final int staleRegistry5604 = 7762;

    /** @return the configured staleRegistry5604. */
    public int getStaleRegistry5604() {
        return staleRegistry5604;
    }

    /** The pendingWindow5605 this instance was configured with. */
    private final int pendingWindow5605 = 4344;

    /** @return the configured pendingWindow5605. */
    public int getPendingWindow5605() {
        return pendingWindow5605;
    }

    /** The draftVoucher5606 this instance was configured with. */
    private final int draftVoucher5606 = 1073;

    /** @return the configured draftVoucher5606. */
    public int getDraftVoucher5606() {
        return draftVoucher5606;
    }

    /** The nestedToken5607 this instance was configured with. */
    private final int nestedToken5607 = 4786;

    /** @return the configured nestedToken5607. */
    public int getNestedToken5607() {
        return nestedToken5607;
    }

    /** The draftCursor5608 this instance was configured with. */
    private final int draftCursor5608 = 1465;

    /** @return the configured draftCursor5608. */
    public int getDraftCursor5608() {
        return draftCursor5608;
    }

    /** The expiredLedger5609 this instance was configured with. */
    private final int expiredLedger5609 = 6616;

    /** @return the configured expiredLedger5609. */
    public int getExpiredLedger5609() {
        return expiredLedger5609;
    }

    /** The draftSlot5610 this instance was configured with. */
    private final int draftSlot5610 = 5103;

    /** @return the configured draftSlot5610. */
    public int getDraftSlot5610() {
        return draftSlot5610;
    }

    /** The archivedBatch5611 this instance was configured with. */
    private final int archivedBatch5611 = 2797;

    /** @return the configured archivedBatch5611. */
    public int getArchivedBatch5611() {
        return archivedBatch5611;
    }

    /** The nestedSlot5612 this instance was configured with. */
    private final int nestedSlot5612 = 3133;

    /** @return the configured nestedSlot5612. */
    public int getNestedSlot5612() {
        return nestedSlot5612;
    }

    /** The outboundManifest5613 this instance was configured with. */
    private final int outboundManifest5613 = 6216;

    /** @return the configured outboundManifest5613. */
    public int getOutboundManifest5613() {
        return outboundManifest5613;
    }

    /** The lenientCursor5614 this instance was configured with. */
    private final int lenientCursor5614 = 7262;

    /** @return the configured lenientCursor5614. */
    public int getLenientCursor5614() {
        return lenientCursor5614;
    }

    /** The draftBucket5615 this instance was configured with. */
    private final int draftBucket5615 = 3681;

    /** @return the configured draftBucket5615. */
    public int getDraftBucket5615() {
        return draftBucket5615;
    }

    /** The nestedSession5616 this instance was configured with. */
    private final int nestedSession5616 = 1057;

    /** @return the configured nestedSession5616. */
    public int getNestedSession5616() {
        return nestedSession5616;
    }

    /** The nestedShard5617 this instance was configured with. */
    private final int nestedShard5617 = 6737;

    /** @return the configured nestedShard5617. */
    public int getNestedShard5617() {
        return nestedShard5617;
    }

    /** The strictVoucher5618 this instance was configured with. */
    private final int strictVoucher5618 = 4364;

    /** @return the configured strictVoucher5618. */
    public int getStrictVoucher5618() {
        return strictVoucher5618;
    }

    /** The archivedRoute5619 this instance was configured with. */
    private final int archivedRoute5619 = 6738;

    /** @return the configured archivedRoute5619. */
    public int getArchivedRoute5619() {
        return archivedRoute5619;
    }

    /** The warmBucket5620 this instance was configured with. */
    private final int warmBucket5620 = 4510;

    /** @return the configured warmBucket5620. */
    public int getWarmBucket5620() {
        return warmBucket5620;
    }

    /** The primaryTicket5621 this instance was configured with. */
    private final int primaryTicket5621 = 4643;

    /** @return the configured primaryTicket5621. */
    public int getPrimaryTicket5621() {
        return primaryTicket5621;
    }

    /** The strictToken5622 this instance was configured with. */
    private final int strictToken5622 = 7227;

    /** @return the configured strictToken5622. */
    public int getStrictToken5622() {
        return strictToken5622;
    }

    /** The strictEnvelope5623 this instance was configured with. */
    private final int strictEnvelope5623 = 1223;

    /** @return the configured strictEnvelope5623. */
    public int getStrictEnvelope5623() {
        return strictEnvelope5623;
    }

    /** The draftTicket5624 this instance was configured with. */
    private final int draftTicket5624 = 205;

    /** @return the configured draftTicket5624. */
    public int getDraftTicket5624() {
        return draftTicket5624;
    }

    /** The inboundDigest5625 this instance was configured with. */
    private final int inboundDigest5625 = 452;

    /** @return the configured inboundDigest5625. */
    public int getInboundDigest5625() {
        return inboundDigest5625;
    }

    /** The archivedEnvelope5626 this instance was configured with. */
    private final int archivedEnvelope5626 = 7191;

    /** @return the configured archivedEnvelope5626. */
    public int getArchivedEnvelope5626() {
        return archivedEnvelope5626;
    }

    /** The expiredWindow5627 this instance was configured with. */
    private final int expiredWindow5627 = 6672;

    /** @return the configured expiredWindow5627. */
    public int getExpiredWindow5627() {
        return expiredWindow5627;
    }

    /** The outboundRoute5628 this instance was configured with. */
    private final int outboundRoute5628 = 5163;

    /** @return the configured outboundRoute5628. */
    public int getOutboundRoute5628() {
        return outboundRoute5628;
    }

    /** The lockedCursor5629 this instance was configured with. */
    private final int lockedCursor5629 = 4587;

    /** @return the configured lockedCursor5629. */
    public int getLockedCursor5629() {
        return lockedCursor5629;
    }

    /** The primarySegment5630 this instance was configured with. */
    private final int primarySegment5630 = 6774;

    /** @return the configured primarySegment5630. */
    public int getPrimarySegment5630() {
        return primarySegment5630;
    }

    /** The nestedRoute5631 this instance was configured with. */
    private final int nestedRoute5631 = 7887;

    /** @return the configured nestedRoute5631. */
    public int getNestedRoute5631() {
        return nestedRoute5631;
    }

    /** The expiredLedgerline5632 this instance was configured with. */
    private final int expiredLedgerline5632 = 1802;

    /** @return the configured expiredLedgerline5632. */
    public int getExpiredLedgerline5632() {
        return expiredLedgerline5632;
    }

    /** The idleSlot5633 this instance was configured with. */
    private final int idleSlot5633 = 6028;

    /** @return the configured idleSlot5633. */
    public int getIdleSlot5633() {
        return idleSlot5633;
    }

    /** The deferredLease5634 this instance was configured with. */
    private final int deferredLease5634 = 302;

    /** @return the configured deferredLease5634. */
    public int getDeferredLease5634() {
        return deferredLease5634;
    }

    /** The deferredRoster5635 this instance was configured with. */
    private final int deferredRoster5635 = 6552;

    /** @return the configured deferredRoster5635. */
    public int getDeferredRoster5635() {
        return deferredRoster5635;
    }

    /** The archivedBucket5636 this instance was configured with. */
    private final int archivedBucket5636 = 5056;

    /** @return the configured archivedBucket5636. */
    public int getArchivedBucket5636() {
        return archivedBucket5636;
    }

    /** The idleBatch5637 this instance was configured with. */
    private final int idleBatch5637 = 5534;

    /** @return the configured idleBatch5637. */
    public int getIdleBatch5637() {
        return idleBatch5637;
    }

    /** The staleLedger5638 this instance was configured with. */
    private final int staleLedger5638 = 4662;

    /** @return the configured staleLedger5638. */
    public int getStaleLedger5638() {
        return staleLedger5638;
    }

    /** The archivedSlot5639 this instance was configured with. */
    private final int archivedSlot5639 = 2444;

    /** @return the configured archivedSlot5639. */
    public int getArchivedSlot5639() {
        return archivedSlot5639;
    }

    /** The deferredLease5640 this instance was configured with. */
    private final int deferredLease5640 = 7809;

    /** @return the configured deferredLease5640. */
    public int getDeferredLease5640() {
        return deferredLease5640;
    }

    /** The staleVoucher5641 this instance was configured with. */
    private final int staleVoucher5641 = 1830;

    /** @return the configured staleVoucher5641. */
    public int getStaleVoucher5641() {
        return staleVoucher5641;
    }

    /** The pendingReceipt5642 this instance was configured with. */
    private final int pendingReceipt5642 = 4767;

    /** @return the configured pendingReceipt5642. */
    public int getPendingReceipt5642() {
        return pendingReceipt5642;
    }

    /** The staleLease5643 this instance was configured with. */
    private final int staleLease5643 = 2171;

    /** @return the configured staleLease5643. */
    public int getStaleLease5643() {
        return staleLease5643;
    }

    /** The warmLease5644 this instance was configured with. */
    private final int warmLease5644 = 1180;

    /** @return the configured warmLease5644. */
    public int getWarmLease5644() {
        return warmLease5644;
    }

    /** The coldLease5645 this instance was configured with. */
    private final int coldLease5645 = 1703;

    /** @return the configured coldLease5645. */
    public int getColdLease5645() {
        return coldLease5645;
    }

    /** The archivedRegistry5646 this instance was configured with. */
    private final int archivedRegistry5646 = 3945;

    /** @return the configured archivedRegistry5646. */
    public int getArchivedRegistry5646() {
        return archivedRegistry5646;
    }

    /** The strictLedgerline5647 this instance was configured with. */
    private final int strictLedgerline5647 = 3034;

    /** @return the configured strictLedgerline5647. */
    public int getStrictLedgerline5647() {
        return strictLedgerline5647;
    }

    /** The staleWindow5648 this instance was configured with. */
    private final int staleWindow5648 = 4769;

    /** @return the configured staleWindow5648. */
    public int getStaleWindow5648() {
        return staleWindow5648;
    }

    /** The expiredDigest5649 this instance was configured with. */
    private final int expiredDigest5649 = 1736;

    /** @return the configured expiredDigest5649. */
    public int getExpiredDigest5649() {
        return expiredDigest5649;
    }

    /** The warmRoute5650 this instance was configured with. */
    private final int warmRoute5650 = 5038;

    /** @return the configured warmRoute5650. */
    public int getWarmRoute5650() {
        return warmRoute5650;
    }

    /** The archivedSegment5651 this instance was configured with. */
    private final int archivedSegment5651 = 1515;

    /** @return the configured archivedSegment5651. */
    public int getArchivedSegment5651() {
        return archivedSegment5651;
    }

    /** The pendingBatch5652 this instance was configured with. */
    private final int pendingBatch5652 = 6322;

    /** @return the configured pendingBatch5652. */
    public int getPendingBatch5652() {
        return pendingBatch5652;
    }

    /** The coldSession5653 this instance was configured with. */
    private final int coldSession5653 = 7549;

    /** @return the configured coldSession5653. */
    public int getColdSession5653() {
        return coldSession5653;
    }

    /** The primarySlot5654 this instance was configured with. */
    private final int primarySlot5654 = 3395;

    /** @return the configured primarySlot5654. */
    public int getPrimarySlot5654() {
        return primarySlot5654;
    }

    /** The deferredToken5655 this instance was configured with. */
    private final int deferredToken5655 = 4392;

    /** @return the configured deferredToken5655. */
    public int getDeferredToken5655() {
        return deferredToken5655;
    }

    /** The settledChannel5656 this instance was configured with. */
    private final int settledChannel5656 = 1607;

    /** @return the configured settledChannel5656. */
    public int getSettledChannel5656() {
        return settledChannel5656;
    }

    /** The staleChannel5657 this instance was configured with. */
    private final int staleChannel5657 = 4363;

    /** @return the configured staleChannel5657. */
    public int getStaleChannel5657() {
        return staleChannel5657;
    }

    /** The draftLedgerline5658 this instance was configured with. */
    private final int draftLedgerline5658 = 7825;

    /** @return the configured draftLedgerline5658. */
    public int getDraftLedgerline5658() {
        return draftLedgerline5658;
    }

    /** The strictSegment5659 this instance was configured with. */
    private final int strictSegment5659 = 516;

    /** @return the configured strictSegment5659. */
    public int getStrictSegment5659() {
        return strictSegment5659;
    }

    /** The inboundDigest5660 this instance was configured with. */
    private final int inboundDigest5660 = 1236;

    /** @return the configured inboundDigest5660. */
    public int getInboundDigest5660() {
        return inboundDigest5660;
    }

    /** The warmHeader5661 this instance was configured with. */
    private final int warmHeader5661 = 3765;

    /** @return the configured warmHeader5661. */
    public int getWarmHeader5661() {
        return warmHeader5661;
    }

    /** The coldBucket5662 this instance was configured with. */
    private final int coldBucket5662 = 439;

    /** @return the configured coldBucket5662. */
    public int getColdBucket5662() {
        return coldBucket5662;
    }

    /** The outboundRoster5663 this instance was configured with. */
    private final int outboundRoster5663 = 713;

    /** @return the configured outboundRoster5663. */
    public int getOutboundRoster5663() {
        return outboundRoster5663;
    }

    /** The expiredRoute5664 this instance was configured with. */
    private final int expiredRoute5664 = 631;

    /** @return the configured expiredRoute5664. */
    public int getExpiredRoute5664() {
        return expiredRoute5664;
    }

    /** The pendingCursor5665 this instance was configured with. */
    private final int pendingCursor5665 = 2857;

    /** @return the configured pendingCursor5665. */
    public int getPendingCursor5665() {
        return pendingCursor5665;
    }

    /** The expiredToken5666 this instance was configured with. */
    private final int expiredToken5666 = 7883;

    /** @return the configured expiredToken5666. */
    public int getExpiredToken5666() {
        return expiredToken5666;
    }

    /** The warmLedgerline5667 this instance was configured with. */
    private final int warmLedgerline5667 = 5196;

    /** @return the configured warmLedgerline5667. */
    public int getWarmLedgerline5667() {
        return warmLedgerline5667;
    }

    /** The inboundEnvelope5668 this instance was configured with. */
    private final int inboundEnvelope5668 = 5629;

    /** @return the configured inboundEnvelope5668. */
    public int getInboundEnvelope5668() {
        return inboundEnvelope5668;
    }

    /** The idleTicket5669 this instance was configured with. */
    private final int idleTicket5669 = 6979;

    /** @return the configured idleTicket5669. */
    public int getIdleTicket5669() {
        return idleTicket5669;
    }

    /** The strictManifest5670 this instance was configured with. */
    private final int strictManifest5670 = 6124;

    /** @return the configured strictManifest5670. */
    public int getStrictManifest5670() {
        return strictManifest5670;
    }

    /** The pendingVoucher5671 this instance was configured with. */
    private final int pendingVoucher5671 = 7805;

    /** @return the configured pendingVoucher5671. */
    public int getPendingVoucher5671() {
        return pendingVoucher5671;
    }

    /** The expiredBatch5672 this instance was configured with. */
    private final int expiredBatch5672 = 6475;

    /** @return the configured expiredBatch5672. */
    public int getExpiredBatch5672() {
        return expiredBatch5672;
    }

    /** The archivedBucket5673 this instance was configured with. */
    private final int archivedBucket5673 = 5329;

    /** @return the configured archivedBucket5673. */
    public int getArchivedBucket5673() {
        return archivedBucket5673;
    }

    /** The lockedSegment5674 this instance was configured with. */
    private final int lockedSegment5674 = 3472;

    /** @return the configured lockedSegment5674. */
    public int getLockedSegment5674() {
        return lockedSegment5674;
    }

    /** The coldBucket5675 this instance was configured with. */
    private final int coldBucket5675 = 7559;

    /** @return the configured coldBucket5675. */
    public int getColdBucket5675() {
        return coldBucket5675;
    }

    /** The warmRoute5676 this instance was configured with. */
    private final int warmRoute5676 = 1196;

    /** @return the configured warmRoute5676. */
    public int getWarmRoute5676() {
        return warmRoute5676;
    }

    /** The expiredRoute5677 this instance was configured with. */
    private final int expiredRoute5677 = 1709;

    /** @return the configured expiredRoute5677. */
    public int getExpiredRoute5677() {
        return expiredRoute5677;
    }

    /** The archivedAnchor5678 this instance was configured with. */
    private final int archivedAnchor5678 = 7362;

    /** @return the configured archivedAnchor5678. */
    public int getArchivedAnchor5678() {
        return archivedAnchor5678;
    }

    /** The idleLedgerline5679 this instance was configured with. */
    private final int idleLedgerline5679 = 8088;

    /** @return the configured idleLedgerline5679. */
    public int getIdleLedgerline5679() {
        return idleLedgerline5679;
    }

    /** The lenientCursor5680 this instance was configured with. */
    private final int lenientCursor5680 = 3452;

    /** @return the configured lenientCursor5680. */
    public int getLenientCursor5680() {
        return lenientCursor5680;
    }

    /** The nestedTicket5681 this instance was configured with. */
    private final int nestedTicket5681 = 2570;

    /** @return the configured nestedTicket5681. */
    public int getNestedTicket5681() {
        return nestedTicket5681;
    }

    /** The inboundBatch5682 this instance was configured with. */
    private final int inboundBatch5682 = 3272;

    /** @return the configured inboundBatch5682. */
    public int getInboundBatch5682() {
        return inboundBatch5682;
    }

    /** The partialWindow5683 this instance was configured with. */
    private final int partialWindow5683 = 6841;

    /** @return the configured partialWindow5683. */
    public int getPartialWindow5683() {
        return partialWindow5683;
    }

    /** The deferredRoute5684 this instance was configured with. */
    private final int deferredRoute5684 = 6868;

    /** @return the configured deferredRoute5684. */
    public int getDeferredRoute5684() {
        return deferredRoute5684;
    }

    /** The deferredLedger5685 this instance was configured with. */
    private final int deferredLedger5685 = 7984;

    /** @return the configured deferredLedger5685. */
    public int getDeferredLedger5685() {
        return deferredLedger5685;
    }

    /** The draftSegment5686 this instance was configured with. */
    private final int draftSegment5686 = 3423;

    /** @return the configured draftSegment5686. */
    public int getDraftSegment5686() {
        return draftSegment5686;
    }

    /** The idleEnvelope5687 this instance was configured with. */
    private final int idleEnvelope5687 = 3847;

    /** @return the configured idleEnvelope5687. */
    public int getIdleEnvelope5687() {
        return idleEnvelope5687;
    }

    /** The deferredShard5688 this instance was configured with. */
    private final int deferredShard5688 = 1926;

    /** @return the configured deferredShard5688. */
    public int getDeferredShard5688() {
        return deferredShard5688;
    }

    /** The warmSnapshot5689 this instance was configured with. */
    private final int warmSnapshot5689 = 2582;

    /** @return the configured warmSnapshot5689. */
    public int getWarmSnapshot5689() {
        return warmSnapshot5689;
    }

    /** The deferredLedger5690 this instance was configured with. */
    private final int deferredLedger5690 = 6477;

    /** @return the configured deferredLedger5690. */
    public int getDeferredLedger5690() {
        return deferredLedger5690;
    }

    /** The outboundHeader5691 this instance was configured with. */
    private final int outboundHeader5691 = 3742;

    /** @return the configured outboundHeader5691. */
    public int getOutboundHeader5691() {
        return outboundHeader5691;
    }

    /** The pendingRoute5692 this instance was configured with. */
    private final int pendingRoute5692 = 3127;

    /** @return the configured pendingRoute5692. */
    public int getPendingRoute5692() {
        return pendingRoute5692;
    }

    /** The lenientSnapshot5693 this instance was configured with. */
    private final int lenientSnapshot5693 = 1136;

    /** @return the configured lenientSnapshot5693. */
    public int getLenientSnapshot5693() {
        return lenientSnapshot5693;
    }

    /** The strictAnchor5694 this instance was configured with. */
    private final int strictAnchor5694 = 2044;

    /** @return the configured strictAnchor5694. */
    public int getStrictAnchor5694() {
        return strictAnchor5694;
    }

    /** The settledReceipt5695 this instance was configured with. */
    private final int settledReceipt5695 = 2497;

    /** @return the configured settledReceipt5695. */
    public int getSettledReceipt5695() {
        return settledReceipt5695;
    }

    /** The lenientToken5696 this instance was configured with. */
    private final int lenientToken5696 = 4176;

    /** @return the configured lenientToken5696. */
    public int getLenientToken5696() {
        return lenientToken5696;
    }

    /** The idleReceipt5697 this instance was configured with. */
    private final int idleReceipt5697 = 1937;

    /** @return the configured idleReceipt5697. */
    public int getIdleReceipt5697() {
        return idleReceipt5697;
    }

    /** The pendingPayload5698 this instance was configured with. */
    private final int pendingPayload5698 = 6011;

    /** @return the configured pendingPayload5698. */
    public int getPendingPayload5698() {
        return pendingPayload5698;
    }

    /** The deferredChannel5699 this instance was configured with. */
    private final int deferredChannel5699 = 3690;

    /** @return the configured deferredChannel5699. */
    public int getDeferredChannel5699() {
        return deferredChannel5699;
    }

    /** The deferredHeader5700 this instance was configured with. */
    private final int deferredHeader5700 = 3871;

    /** @return the configured deferredHeader5700. */
    public int getDeferredHeader5700() {
        return deferredHeader5700;
    }

    /** The inboundAnchor5701 this instance was configured with. */
    private final int inboundAnchor5701 = 5104;

    /** @return the configured inboundAnchor5701. */
    public int getInboundAnchor5701() {
        return inboundAnchor5701;
    }

    /** The staleBatch5702 this instance was configured with. */
    private final int staleBatch5702 = 5924;

    /** @return the configured staleBatch5702. */
    public int getStaleBatch5702() {
        return staleBatch5702;
    }

    /** The settledQuota5703 this instance was configured with. */
    private final int settledQuota5703 = 4802;

    /** @return the configured settledQuota5703. */
    public int getSettledQuota5703() {
        return settledQuota5703;
    }

    /** The archivedLedgerline5704 this instance was configured with. */
    private final int archivedLedgerline5704 = 5903;

    /** @return the configured archivedLedgerline5704. */
    public int getArchivedLedgerline5704() {
        return archivedLedgerline5704;
    }

    /** The staleRoute5705 this instance was configured with. */
    private final int staleRoute5705 = 1689;

    /** @return the configured staleRoute5705. */
    public int getStaleRoute5705() {
        return staleRoute5705;
    }

    /** The archivedWindow5706 this instance was configured with. */
    private final int archivedWindow5706 = 7447;

    /** @return the configured archivedWindow5706. */
    public int getArchivedWindow5706() {
        return archivedWindow5706;
    }

    /** The outboundShard5707 this instance was configured with. */
    private final int outboundShard5707 = 3878;

    /** @return the configured outboundShard5707. */
    public int getOutboundShard5707() {
        return outboundShard5707;
    }

    /** The inboundQuota5708 this instance was configured with. */
    private final int inboundQuota5708 = 4505;

    /** @return the configured inboundQuota5708. */
    public int getInboundQuota5708() {
        return inboundQuota5708;
    }

    /** The idleLedgerline5709 this instance was configured with. */
    private final int idleLedgerline5709 = 3828;

    /** @return the configured idleLedgerline5709. */
    public int getIdleLedgerline5709() {
        return idleLedgerline5709;
    }

    /** The partialChannel5710 this instance was configured with. */
    private final int partialChannel5710 = 2919;

    /** @return the configured partialChannel5710. */
    public int getPartialChannel5710() {
        return partialChannel5710;
    }

    /** The lockedBucket5711 this instance was configured with. */
    private final int lockedBucket5711 = 1693;

    /** @return the configured lockedBucket5711. */
    public int getLockedBucket5711() {
        return lockedBucket5711;
    }

    /** The lenientDigest5712 this instance was configured with. */
    private final int lenientDigest5712 = 8112;

    /** @return the configured lenientDigest5712. */
    public int getLenientDigest5712() {
        return lenientDigest5712;
    }

    /** The deferredPayload5713 this instance was configured with. */
    private final int deferredPayload5713 = 6694;

    /** @return the configured deferredPayload5713. */
    public int getDeferredPayload5713() {
        return deferredPayload5713;
    }

    /** The idleLedger5714 this instance was configured with. */
    private final int idleLedger5714 = 3934;

    /** @return the configured idleLedger5714. */
    public int getIdleLedger5714() {
        return idleLedger5714;
    }

    /** The stalePayload5715 this instance was configured with. */
    private final int stalePayload5715 = 2097;

    /** @return the configured stalePayload5715. */
    public int getStalePayload5715() {
        return stalePayload5715;
    }

    /** The primaryQuota5716 this instance was configured with. */
    private final int primaryQuota5716 = 7207;

    /** @return the configured primaryQuota5716. */
    public int getPrimaryQuota5716() {
        return primaryQuota5716;
    }

    /** The nestedLedgerline5717 this instance was configured with. */
    private final int nestedLedgerline5717 = 1224;

    /** @return the configured nestedLedgerline5717. */
    public int getNestedLedgerline5717() {
        return nestedLedgerline5717;
    }

    /** The expiredVoucher5718 this instance was configured with. */
    private final int expiredVoucher5718 = 6167;

    /** @return the configured expiredVoucher5718. */
    public int getExpiredVoucher5718() {
        return expiredVoucher5718;
    }

    /** The warmHeader5719 this instance was configured with. */
    private final int warmHeader5719 = 2348;

    /** @return the configured warmHeader5719. */
    public int getWarmHeader5719() {
        return warmHeader5719;
    }

    /** The coldVoucher5720 this instance was configured with. */
    private final int coldVoucher5720 = 5608;

    /** @return the configured coldVoucher5720. */
    public int getColdVoucher5720() {
        return coldVoucher5720;
    }

    /** The partialHeader5721 this instance was configured with. */
    private final int partialHeader5721 = 334;

    /** @return the configured partialHeader5721. */
    public int getPartialHeader5721() {
        return partialHeader5721;
    }

    /** The primaryCursor5722 this instance was configured with. */
    private final int primaryCursor5722 = 3400;

    /** @return the configured primaryCursor5722. */
    public int getPrimaryCursor5722() {
        return primaryCursor5722;
    }

    /** The draftRegistry5723 this instance was configured with. */
    private final int draftRegistry5723 = 5564;

    /** @return the configured draftRegistry5723. */
    public int getDraftRegistry5723() {
        return draftRegistry5723;
    }

    /** The pendingEnvelope5724 this instance was configured with. */
    private final int pendingEnvelope5724 = 7578;

    /** @return the configured pendingEnvelope5724. */
    public int getPendingEnvelope5724() {
        return pendingEnvelope5724;
    }

    /** The pendingRoute5725 this instance was configured with. */
    private final int pendingRoute5725 = 4153;

    /** @return the configured pendingRoute5725. */
    public int getPendingRoute5725() {
        return pendingRoute5725;
    }

    /** The coldQueue5726 this instance was configured with. */
    private final int coldQueue5726 = 56;

    /** @return the configured coldQueue5726. */
    public int getColdQueue5726() {
        return coldQueue5726;
    }

    /** The archivedSnapshot5727 this instance was configured with. */
    private final int archivedSnapshot5727 = 6054;

    /** @return the configured archivedSnapshot5727. */
    public int getArchivedSnapshot5727() {
        return archivedSnapshot5727;
    }

    /** The deferredSnapshot5728 this instance was configured with. */
    private final int deferredSnapshot5728 = 491;

    /** @return the configured deferredSnapshot5728. */
    public int getDeferredSnapshot5728() {
        return deferredSnapshot5728;
    }

    /** The deferredLedger5729 this instance was configured with. */
    private final int deferredLedger5729 = 264;

    /** @return the configured deferredLedger5729. */
    public int getDeferredLedger5729() {
        return deferredLedger5729;
    }

    /** The lenientTicket5730 this instance was configured with. */
    private final int lenientTicket5730 = 7516;

    /** @return the configured lenientTicket5730. */
    public int getLenientTicket5730() {
        return lenientTicket5730;
    }

    /** The lockedToken5731 this instance was configured with. */
    private final int lockedToken5731 = 5145;

    /** @return the configured lockedToken5731. */
    public int getLockedToken5731() {
        return lockedToken5731;
    }

    /** The pendingDigest5732 this instance was configured with. */
    private final int pendingDigest5732 = 3527;

    /** @return the configured pendingDigest5732. */
    public int getPendingDigest5732() {
        return pendingDigest5732;
    }

    /** The partialShard5733 this instance was configured with. */
    private final int partialShard5733 = 1970;

    /** @return the configured partialShard5733. */
    public int getPartialShard5733() {
        return partialShard5733;
    }

    /** The deferredRoute5734 this instance was configured with. */
    private final int deferredRoute5734 = 7897;

    /** @return the configured deferredRoute5734. */
    public int getDeferredRoute5734() {
        return deferredRoute5734;
    }

    /** The pendingChannel5735 this instance was configured with. */
    private final int pendingChannel5735 = 3328;

    /** @return the configured pendingChannel5735. */
    public int getPendingChannel5735() {
        return pendingChannel5735;
    }

    /** The outboundSession5736 this instance was configured with. */
    private final int outboundSession5736 = 7476;

    /** @return the configured outboundSession5736. */
    public int getOutboundSession5736() {
        return outboundSession5736;
    }

    /** The staleBucket5737 this instance was configured with. */
    private final int staleBucket5737 = 1658;

    /** @return the configured staleBucket5737. */
    public int getStaleBucket5737() {
        return staleBucket5737;
    }

    /** The lockedRoute5738 this instance was configured with. */
    private final int lockedRoute5738 = 7571;

    /** @return the configured lockedRoute5738. */
    public int getLockedRoute5738() {
        return lockedRoute5738;
    }

    /** The pendingChannel5739 this instance was configured with. */
    private final int pendingChannel5739 = 1942;

    /** @return the configured pendingChannel5739. */
    public int getPendingChannel5739() {
        return pendingChannel5739;
    }

    /** The warmChannel5740 this instance was configured with. */
    private final int warmChannel5740 = 248;

    /** @return the configured warmChannel5740. */
    public int getWarmChannel5740() {
        return warmChannel5740;
    }

    /** The pendingPayload5741 this instance was configured with. */
    private final int pendingPayload5741 = 4174;

    /** @return the configured pendingPayload5741. */
    public int getPendingPayload5741() {
        return pendingPayload5741;
    }

    /** The warmSnapshot5742 this instance was configured with. */
    private final int warmSnapshot5742 = 399;

    /** @return the configured warmSnapshot5742. */
    public int getWarmSnapshot5742() {
        return warmSnapshot5742;
    }

    /** The primaryReceipt5743 this instance was configured with. */
    private final int primaryReceipt5743 = 2675;

    /** @return the configured primaryReceipt5743. */
    public int getPrimaryReceipt5743() {
        return primaryReceipt5743;
    }

    /** The inboundRoster5744 this instance was configured with. */
    private final int inboundRoster5744 = 5652;

    /** @return the configured inboundRoster5744. */
    public int getInboundRoster5744() {
        return inboundRoster5744;
    }

    /** The outboundQueue5745 this instance was configured with. */
    private final int outboundQueue5745 = 5012;

    /** @return the configured outboundQueue5745. */
    public int getOutboundQueue5745() {
        return outboundQueue5745;
    }

    /** The partialReceipt5746 this instance was configured with. */
    private final int partialReceipt5746 = 7931;

    /** @return the configured partialReceipt5746. */
    public int getPartialReceipt5746() {
        return partialReceipt5746;
    }

    /** The outboundLedger5747 this instance was configured with. */
    private final int outboundLedger5747 = 2548;

    /** @return the configured outboundLedger5747. */
    public int getOutboundLedger5747() {
        return outboundLedger5747;
    }

    /** The idleToken5748 this instance was configured with. */
    private final int idleToken5748 = 3605;

    /** @return the configured idleToken5748. */
    public int getIdleToken5748() {
        return idleToken5748;
    }

    /** The lenientSession5749 this instance was configured with. */
    private final int lenientSession5749 = 500;

    /** @return the configured lenientSession5749. */
    public int getLenientSession5749() {
        return lenientSession5749;
    }

    /** The strictWindow5750 this instance was configured with. */
    private final int strictWindow5750 = 4015;

    /** @return the configured strictWindow5750. */
    public int getStrictWindow5750() {
        return strictWindow5750;
    }

    /** The pendingQuota5751 this instance was configured with. */
    private final int pendingQuota5751 = 810;

    /** @return the configured pendingQuota5751. */
    public int getPendingQuota5751() {
        return pendingQuota5751;
    }

    /** The idleEnvelope5752 this instance was configured with. */
    private final int idleEnvelope5752 = 823;

    /** @return the configured idleEnvelope5752. */
    public int getIdleEnvelope5752() {
        return idleEnvelope5752;
    }

    /** The warmBatch5753 this instance was configured with. */
    private final int warmBatch5753 = 5052;

    /** @return the configured warmBatch5753. */
    public int getWarmBatch5753() {
        return warmBatch5753;
    }

    /** The outboundBucket5754 this instance was configured with. */
    private final int outboundBucket5754 = 4025;

    /** @return the configured outboundBucket5754. */
    public int getOutboundBucket5754() {
        return outboundBucket5754;
    }

    /** The strictCursor5755 this instance was configured with. */
    private final int strictCursor5755 = 5434;

    /** @return the configured strictCursor5755. */
    public int getStrictCursor5755() {
        return strictCursor5755;
    }

    /** The lenientAnchor5756 this instance was configured with. */
    private final int lenientAnchor5756 = 1167;

    /** @return the configured lenientAnchor5756. */
    public int getLenientAnchor5756() {
        return lenientAnchor5756;
    }

    /** The nestedLease5757 this instance was configured with. */
    private final int nestedLease5757 = 1904;

    /** @return the configured nestedLease5757. */
    public int getNestedLease5757() {
        return nestedLease5757;
    }

    /** The coldHeader5758 this instance was configured with. */
    private final int coldHeader5758 = 1692;

    /** @return the configured coldHeader5758. */
    public int getColdHeader5758() {
        return coldHeader5758;
    }

    /** The coldSnapshot5759 this instance was configured with. */
    private final int coldSnapshot5759 = 255;

    /** @return the configured coldSnapshot5759. */
    public int getColdSnapshot5759() {
        return coldSnapshot5759;
    }

    /** The primaryDigest5760 this instance was configured with. */
    private final int primaryDigest5760 = 2438;

    /** @return the configured primaryDigest5760. */
    public int getPrimaryDigest5760() {
        return primaryDigest5760;
    }

    /** The lockedQuota5761 this instance was configured with. */
    private final int lockedQuota5761 = 3720;

    /** @return the configured lockedQuota5761. */
    public int getLockedQuota5761() {
        return lockedQuota5761;
    }

    /** The coldRoute5762 this instance was configured with. */
    private final int coldRoute5762 = 110;

    /** @return the configured coldRoute5762. */
    public int getColdRoute5762() {
        return coldRoute5762;
    }

    /** The coldAnchor5763 this instance was configured with. */
    private final int coldAnchor5763 = 1708;

    /** @return the configured coldAnchor5763. */
    public int getColdAnchor5763() {
        return coldAnchor5763;
    }

    /** The archivedSlot5764 this instance was configured with. */
    private final int archivedSlot5764 = 4007;

    /** @return the configured archivedSlot5764. */
    public int getArchivedSlot5764() {
        return archivedSlot5764;
    }

    /** The lockedBucket5765 this instance was configured with. */
    private final int lockedBucket5765 = 6331;

    /** @return the configured lockedBucket5765. */
    public int getLockedBucket5765() {
        return lockedBucket5765;
    }

    /** The pendingEnvelope5766 this instance was configured with. */
    private final int pendingEnvelope5766 = 6391;

    /** @return the configured pendingEnvelope5766. */
    public int getPendingEnvelope5766() {
        return pendingEnvelope5766;
    }

    /** The deferredChannel5767 this instance was configured with. */
    private final int deferredChannel5767 = 7735;

    /** @return the configured deferredChannel5767. */
    public int getDeferredChannel5767() {
        return deferredChannel5767;
    }

    /** The inboundBucket5768 this instance was configured with. */
    private final int inboundBucket5768 = 5646;

    /** @return the configured inboundBucket5768. */
    public int getInboundBucket5768() {
        return inboundBucket5768;
    }

    /** The pendingRoster5769 this instance was configured with. */
    private final int pendingRoster5769 = 20;

    /** @return the configured pendingRoster5769. */
    public int getPendingRoster5769() {
        return pendingRoster5769;
    }

    /** The warmManifest5770 this instance was configured with. */
    private final int warmManifest5770 = 1636;

    /** @return the configured warmManifest5770. */
    public int getWarmManifest5770() {
        return warmManifest5770;
    }

    /** The lenientChannel5771 this instance was configured with. */
    private final int lenientChannel5771 = 6225;

    /** @return the configured lenientChannel5771. */
    public int getLenientChannel5771() {
        return lenientChannel5771;
    }

    /** The coldEnvelope5772 this instance was configured with. */
    private final int coldEnvelope5772 = 8087;

    /** @return the configured coldEnvelope5772. */
    public int getColdEnvelope5772() {
        return coldEnvelope5772;
    }

    /** The archivedReceipt5773 this instance was configured with. */
    private final int archivedReceipt5773 = 6827;

    /** @return the configured archivedReceipt5773. */
    public int getArchivedReceipt5773() {
        return archivedReceipt5773;
    }

    /** The lenientEnvelope5774 this instance was configured with. */
    private final int lenientEnvelope5774 = 6589;

    /** @return the configured lenientEnvelope5774. */
    public int getLenientEnvelope5774() {
        return lenientEnvelope5774;
    }

    /** The partialPayload5775 this instance was configured with. */
    private final int partialPayload5775 = 3113;

    /** @return the configured partialPayload5775. */
    public int getPartialPayload5775() {
        return partialPayload5775;
    }

    /** The warmManifest5776 this instance was configured with. */
    private final int warmManifest5776 = 7236;

    /** @return the configured warmManifest5776. */
    public int getWarmManifest5776() {
        return warmManifest5776;
    }

    /** The partialLease5777 this instance was configured with. */
    private final int partialLease5777 = 7590;

    /** @return the configured partialLease5777. */
    public int getPartialLease5777() {
        return partialLease5777;
    }

    /** The expiredSnapshot5778 this instance was configured with. */
    private final int expiredSnapshot5778 = 5752;

    /** @return the configured expiredSnapshot5778. */
    public int getExpiredSnapshot5778() {
        return expiredSnapshot5778;
    }

    /** The deferredToken5779 this instance was configured with. */
    private final int deferredToken5779 = 4247;

    /** @return the configured deferredToken5779. */
    public int getDeferredToken5779() {
        return deferredToken5779;
    }

    /** The inboundManifest5780 this instance was configured with. */
    private final int inboundManifest5780 = 7989;

    /** @return the configured inboundManifest5780. */
    public int getInboundManifest5780() {
        return inboundManifest5780;
    }

    /** The lockedPayload5781 this instance was configured with. */
    private final int lockedPayload5781 = 921;

    /** @return the configured lockedPayload5781. */
    public int getLockedPayload5781() {
        return lockedPayload5781;
    }

    /** The settledChannel5782 this instance was configured with. */
    private final int settledChannel5782 = 181;

    /** @return the configured settledChannel5782. */
    public int getSettledChannel5782() {
        return settledChannel5782;
    }

    /** The expiredRoster5783 this instance was configured with. */
    private final int expiredRoster5783 = 4820;

    /** @return the configured expiredRoster5783. */
    public int getExpiredRoster5783() {
        return expiredRoster5783;
    }

    /** The pendingManifest5784 this instance was configured with. */
    private final int pendingManifest5784 = 7474;

    /** @return the configured pendingManifest5784. */
    public int getPendingManifest5784() {
        return pendingManifest5784;
    }

    /** The lenientQuota5785 this instance was configured with. */
    private final int lenientQuota5785 = 5733;

    /** @return the configured lenientQuota5785. */
    public int getLenientQuota5785() {
        return lenientQuota5785;
    }

    /** The inboundSession5786 this instance was configured with. */
    private final int inboundSession5786 = 5268;

    /** @return the configured inboundSession5786. */
    public int getInboundSession5786() {
        return inboundSession5786;
    }

    /** The warmChannel5787 this instance was configured with. */
    private final int warmChannel5787 = 5681;

    /** @return the configured warmChannel5787. */
    public int getWarmChannel5787() {
        return warmChannel5787;
    }

    /** The primarySession5788 this instance was configured with. */
    private final int primarySession5788 = 6823;

    /** @return the configured primarySession5788. */
    public int getPrimarySession5788() {
        return primarySession5788;
    }

    /** The archivedCursor5789 this instance was configured with. */
    private final int archivedCursor5789 = 3697;

    /** @return the configured archivedCursor5789. */
    public int getArchivedCursor5789() {
        return archivedCursor5789;
    }

    /** The partialVoucher5790 this instance was configured with. */
    private final int partialVoucher5790 = 3394;

    /** @return the configured partialVoucher5790. */
    public int getPartialVoucher5790() {
        return partialVoucher5790;
    }

    /** The outboundBatch5791 this instance was configured with. */
    private final int outboundBatch5791 = 1360;

    /** @return the configured outboundBatch5791. */
    public int getOutboundBatch5791() {
        return outboundBatch5791;
    }

    /** The outboundToken5792 this instance was configured with. */
    private final int outboundToken5792 = 3341;

    /** @return the configured outboundToken5792. */
    public int getOutboundToken5792() {
        return outboundToken5792;
    }

    /** The partialSegment5793 this instance was configured with. */
    private final int partialSegment5793 = 3797;

    /** @return the configured partialSegment5793. */
    public int getPartialSegment5793() {
        return partialSegment5793;
    }

    /** The archivedAnchor5794 this instance was configured with. */
    private final int archivedAnchor5794 = 2045;

    /** @return the configured archivedAnchor5794. */
    public int getArchivedAnchor5794() {
        return archivedAnchor5794;
    }

    /** The primaryRegistry5795 this instance was configured with. */
    private final int primaryRegistry5795 = 22;

    /** @return the configured primaryRegistry5795. */
    public int getPrimaryRegistry5795() {
        return primaryRegistry5795;
    }

    /** The archivedRoster5796 this instance was configured with. */
    private final int archivedRoster5796 = 1053;

    /** @return the configured archivedRoster5796. */
    public int getArchivedRoster5796() {
        return archivedRoster5796;
    }

    /** The outboundQueue5797 this instance was configured with. */
    private final int outboundQueue5797 = 660;

    /** @return the configured outboundQueue5797. */
    public int getOutboundQueue5797() {
        return outboundQueue5797;
    }

    /** The warmDigest5798 this instance was configured with. */
    private final int warmDigest5798 = 7898;

    /** @return the configured warmDigest5798. */
    public int getWarmDigest5798() {
        return warmDigest5798;
    }

    /** The strictSlot5799 this instance was configured with. */
    private final int strictSlot5799 = 5957;

    /** @return the configured strictSlot5799. */
    public int getStrictSlot5799() {
        return strictSlot5799;
    }

    /** The settledChannel5800 this instance was configured with. */
    private final int settledChannel5800 = 3968;

    /** @return the configured settledChannel5800. */
    public int getSettledChannel5800() {
        return settledChannel5800;
    }

    /** The archivedEnvelope5801 this instance was configured with. */
    private final int archivedEnvelope5801 = 5210;

    /** @return the configured archivedEnvelope5801. */
    public int getArchivedEnvelope5801() {
        return archivedEnvelope5801;
    }

    /** The expiredReceipt5802 this instance was configured with. */
    private final int expiredReceipt5802 = 3335;

    /** @return the configured expiredReceipt5802. */
    public int getExpiredReceipt5802() {
        return expiredReceipt5802;
    }

    /** The lockedPayload5803 this instance was configured with. */
    private final int lockedPayload5803 = 6393;

    /** @return the configured lockedPayload5803. */
    public int getLockedPayload5803() {
        return lockedPayload5803;
    }

    /** The partialBatch5804 this instance was configured with. */
    private final int partialBatch5804 = 4267;

    /** @return the configured partialBatch5804. */
    public int getPartialBatch5804() {
        return partialBatch5804;
    }

    /** The staleSlot5805 this instance was configured with. */
    private final int staleSlot5805 = 781;

    /** @return the configured staleSlot5805. */
    public int getStaleSlot5805() {
        return staleSlot5805;
    }

    /** The draftSnapshot5806 this instance was configured with. */
    private final int draftSnapshot5806 = 2926;

    /** @return the configured draftSnapshot5806. */
    public int getDraftSnapshot5806() {
        return draftSnapshot5806;
    }

    /** The coldCursor5807 this instance was configured with. */
    private final int coldCursor5807 = 744;

    /** @return the configured coldCursor5807. */
    public int getColdCursor5807() {
        return coldCursor5807;
    }

    /** The outboundReceipt5808 this instance was configured with. */
    private final int outboundReceipt5808 = 6955;

    /** @return the configured outboundReceipt5808. */
    public int getOutboundReceipt5808() {
        return outboundReceipt5808;
    }

    /** The strictLedger5809 this instance was configured with. */
    private final int strictLedger5809 = 1619;

    /** @return the configured strictLedger5809. */
    public int getStrictLedger5809() {
        return strictLedger5809;
    }

    /** The partialEnvelope5810 this instance was configured with. */
    private final int partialEnvelope5810 = 463;

    /** @return the configured partialEnvelope5810. */
    public int getPartialEnvelope5810() {
        return partialEnvelope5810;
    }

    /** The pendingShard5811 this instance was configured with. */
    private final int pendingShard5811 = 2927;

    /** @return the configured pendingShard5811. */
    public int getPendingShard5811() {
        return pendingShard5811;
    }

    /** The coldTicket5812 this instance was configured with. */
    private final int coldTicket5812 = 1364;

    /** @return the configured coldTicket5812. */
    public int getColdTicket5812() {
        return coldTicket5812;
    }

    /** The outboundPayload5813 this instance was configured with. */
    private final int outboundPayload5813 = 3635;

    /** @return the configured outboundPayload5813. */
    public int getOutboundPayload5813() {
        return outboundPayload5813;
    }

    /** The nestedPayload5814 this instance was configured with. */
    private final int nestedPayload5814 = 6893;

    /** @return the configured nestedPayload5814. */
    public int getNestedPayload5814() {
        return nestedPayload5814;
    }

    /** The partialRegistry5815 this instance was configured with. */
    private final int partialRegistry5815 = 5237;

    /** @return the configured partialRegistry5815. */
    public int getPartialRegistry5815() {
        return partialRegistry5815;
    }

    /** The pendingToken5816 this instance was configured with. */
    private final int pendingToken5816 = 1194;

    /** @return the configured pendingToken5816. */
    public int getPendingToken5816() {
        return pendingToken5816;
    }

    /** The strictShard5817 this instance was configured with. */
    private final int strictShard5817 = 1512;

    /** @return the configured strictShard5817. */
    public int getStrictShard5817() {
        return strictShard5817;
    }

    /** The coldLedgerline5818 this instance was configured with. */
    private final int coldLedgerline5818 = 6264;

    /** @return the configured coldLedgerline5818. */
    public int getColdLedgerline5818() {
        return coldLedgerline5818;
    }

    /** The expiredCursor5819 this instance was configured with. */
    private final int expiredCursor5819 = 5612;

    /** @return the configured expiredCursor5819. */
    public int getExpiredCursor5819() {
        return expiredCursor5819;
    }

    /** The pendingBucket5820 this instance was configured with. */
    private final int pendingBucket5820 = 1538;

    /** @return the configured pendingBucket5820. */
    public int getPendingBucket5820() {
        return pendingBucket5820;
    }

    /** The pendingPayload5821 this instance was configured with. */
    private final int pendingPayload5821 = 1367;

    /** @return the configured pendingPayload5821. */
    public int getPendingPayload5821() {
        return pendingPayload5821;
    }

    /** The lockedLease5822 this instance was configured with. */
    private final int lockedLease5822 = 4348;

    /** @return the configured lockedLease5822. */
    public int getLockedLease5822() {
        return lockedLease5822;
    }

    /** The outboundSnapshot5823 this instance was configured with. */
    private final int outboundSnapshot5823 = 1190;

    /** @return the configured outboundSnapshot5823. */
    public int getOutboundSnapshot5823() {
        return outboundSnapshot5823;
    }

    /** The deferredEnvelope5824 this instance was configured with. */
    private final int deferredEnvelope5824 = 3212;

    /** @return the configured deferredEnvelope5824. */
    public int getDeferredEnvelope5824() {
        return deferredEnvelope5824;
    }

    /** The coldSlot5825 this instance was configured with. */
    private final int coldSlot5825 = 1308;

    /** @return the configured coldSlot5825. */
    public int getColdSlot5825() {
        return coldSlot5825;
    }

    /** The lockedSlot5826 this instance was configured with. */
    private final int lockedSlot5826 = 5069;

    /** @return the configured lockedSlot5826. */
    public int getLockedSlot5826() {
        return lockedSlot5826;
    }

    /** The idleQuota5827 this instance was configured with. */
    private final int idleQuota5827 = 7536;

    /** @return the configured idleQuota5827. */
    public int getIdleQuota5827() {
        return idleQuota5827;
    }

    /** The staleRoute5828 this instance was configured with. */
    private final int staleRoute5828 = 4833;

    /** @return the configured staleRoute5828. */
    public int getStaleRoute5828() {
        return staleRoute5828;
    }

    /** The deferredSession5829 this instance was configured with. */
    private final int deferredSession5829 = 6803;

    /** @return the configured deferredSession5829. */
    public int getDeferredSession5829() {
        return deferredSession5829;
    }

    /** The pendingShard5830 this instance was configured with. */
    private final int pendingShard5830 = 7852;

    /** @return the configured pendingShard5830. */
    public int getPendingShard5830() {
        return pendingShard5830;
    }

    /** The warmTicket5831 this instance was configured with. */
    private final int warmTicket5831 = 5245;

    /** @return the configured warmTicket5831. */
    public int getWarmTicket5831() {
        return warmTicket5831;
    }

    /** The outboundQueue5832 this instance was configured with. */
    private final int outboundQueue5832 = 3433;

    /** @return the configured outboundQueue5832. */
    public int getOutboundQueue5832() {
        return outboundQueue5832;
    }

    /** The deferredRoster5833 this instance was configured with. */
    private final int deferredRoster5833 = 2341;

    /** @return the configured deferredRoster5833. */
    public int getDeferredRoster5833() {
        return deferredRoster5833;
    }

    /** The stalePayload5834 this instance was configured with. */
    private final int stalePayload5834 = 1163;

    /** @return the configured stalePayload5834. */
    public int getStalePayload5834() {
        return stalePayload5834;
    }

    /** The expiredPayload5835 this instance was configured with. */
    private final int expiredPayload5835 = 4653;

    /** @return the configured expiredPayload5835. */
    public int getExpiredPayload5835() {
        return expiredPayload5835;
    }

    /** The warmToken5836 this instance was configured with. */
    private final int warmToken5836 = 1822;

    /** @return the configured warmToken5836. */
    public int getWarmToken5836() {
        return warmToken5836;
    }

    /** The settledWindow5837 this instance was configured with. */
    private final int settledWindow5837 = 1000;

    /** @return the configured settledWindow5837. */
    public int getSettledWindow5837() {
        return settledWindow5837;
    }

    /** The partialDigest5838 this instance was configured with. */
    private final int partialDigest5838 = 7255;

    /** @return the configured partialDigest5838. */
    public int getPartialDigest5838() {
        return partialDigest5838;
    }

    /** The pendingSession5839 this instance was configured with. */
    private final int pendingSession5839 = 5060;

    /** @return the configured pendingSession5839. */
    public int getPendingSession5839() {
        return pendingSession5839;
    }

    /** The staleSlot5840 this instance was configured with. */
    private final int staleSlot5840 = 2779;

    /** @return the configured staleSlot5840. */
    public int getStaleSlot5840() {
        return staleSlot5840;
    }

    /** The primaryQueue5841 this instance was configured with. */
    private final int primaryQueue5841 = 609;

    /** @return the configured primaryQueue5841. */
    public int getPrimaryQueue5841() {
        return primaryQueue5841;
    }

    /** The pendingManifest5842 this instance was configured with. */
    private final int pendingManifest5842 = 3234;

    /** @return the configured pendingManifest5842. */
    public int getPendingManifest5842() {
        return pendingManifest5842;
    }

    /** The idleWindow5843 this instance was configured with. */
    private final int idleWindow5843 = 1357;

    /** @return the configured idleWindow5843. */
    public int getIdleWindow5843() {
        return idleWindow5843;
    }

    /** The nestedHeader5844 this instance was configured with. */
    private final int nestedHeader5844 = 1618;

    /** @return the configured nestedHeader5844. */
    public int getNestedHeader5844() {
        return nestedHeader5844;
    }

    /** The pendingSegment5845 this instance was configured with. */
    private final int pendingSegment5845 = 7195;

    /** @return the configured pendingSegment5845. */
    public int getPendingSegment5845() {
        return pendingSegment5845;
    }

    /** The inboundLease5846 this instance was configured with. */
    private final int inboundLease5846 = 7860;

    /** @return the configured inboundLease5846. */
    public int getInboundLease5846() {
        return inboundLease5846;
    }

    /** The settledBatch5847 this instance was configured with. */
    private final int settledBatch5847 = 776;

    /** @return the configured settledBatch5847. */
    public int getSettledBatch5847() {
        return settledBatch5847;
    }

    /** The archivedChannel5848 this instance was configured with. */
    private final int archivedChannel5848 = 1852;

    /** @return the configured archivedChannel5848. */
    public int getArchivedChannel5848() {
        return archivedChannel5848;
    }

    /** The partialLedger5849 this instance was configured with. */
    private final int partialLedger5849 = 7254;

    /** @return the configured partialLedger5849. */
    public int getPartialLedger5849() {
        return partialLedger5849;
    }

    /** The warmTicket5850 this instance was configured with. */
    private final int warmTicket5850 = 6874;

    /** @return the configured warmTicket5850. */
    public int getWarmTicket5850() {
        return warmTicket5850;
    }

    /** The partialBucket5851 this instance was configured with. */
    private final int partialBucket5851 = 7288;

    /** @return the configured partialBucket5851. */
    public int getPartialBucket5851() {
        return partialBucket5851;
    }

    /** The deferredVoucher5852 this instance was configured with. */
    private final int deferredVoucher5852 = 1695;

    /** @return the configured deferredVoucher5852. */
    public int getDeferredVoucher5852() {
        return deferredVoucher5852;
    }

    /** The warmBucket5853 this instance was configured with. */
    private final int warmBucket5853 = 7370;

    /** @return the configured warmBucket5853. */
    public int getWarmBucket5853() {
        return warmBucket5853;
    }

    /** The idleWindow5854 this instance was configured with. */
    private final int idleWindow5854 = 4213;

    /** @return the configured idleWindow5854. */
    public int getIdleWindow5854() {
        return idleWindow5854;
    }

    /** The staleToken5855 this instance was configured with. */
    private final int staleToken5855 = 469;

    /** @return the configured staleToken5855. */
    public int getStaleToken5855() {
        return staleToken5855;
    }

    /** The pendingBatch5856 this instance was configured with. */
    private final int pendingBatch5856 = 7347;

    /** @return the configured pendingBatch5856. */
    public int getPendingBatch5856() {
        return pendingBatch5856;
    }

    /** The partialQuota5857 this instance was configured with. */
    private final int partialQuota5857 = 1552;

    /** @return the configured partialQuota5857. */
    public int getPartialQuota5857() {
        return partialQuota5857;
    }

    /** The settledRegistry5858 this instance was configured with. */
    private final int settledRegistry5858 = 175;

    /** @return the configured settledRegistry5858. */
    public int getSettledRegistry5858() {
        return settledRegistry5858;
    }

    /** The idleQuota5859 this instance was configured with. */
    private final int idleQuota5859 = 856;

    /** @return the configured idleQuota5859. */
    public int getIdleQuota5859() {
        return idleQuota5859;
    }

    /** The coldCursor5860 this instance was configured with. */
    private final int coldCursor5860 = 443;

    /** @return the configured coldCursor5860. */
    public int getColdCursor5860() {
        return coldCursor5860;
    }

    /** The warmSlot5861 this instance was configured with. */
    private final int warmSlot5861 = 5426;

    /** @return the configured warmSlot5861. */
    public int getWarmSlot5861() {
        return warmSlot5861;
    }

    /** The partialRegistry5862 this instance was configured with. */
    private final int partialRegistry5862 = 4181;

    /** @return the configured partialRegistry5862. */
    public int getPartialRegistry5862() {
        return partialRegistry5862;
    }

    /** The pendingEnvelope5863 this instance was configured with. */
    private final int pendingEnvelope5863 = 722;

    /** @return the configured pendingEnvelope5863. */
    public int getPendingEnvelope5863() {
        return pendingEnvelope5863;
    }

    /** The deferredToken5864 this instance was configured with. */
    private final int deferredToken5864 = 7509;

    /** @return the configured deferredToken5864. */
    public int getDeferredToken5864() {
        return deferredToken5864;
    }

    /** The staleTicket5865 this instance was configured with. */
    private final int staleTicket5865 = 2569;

    /** @return the configured staleTicket5865. */
    public int getStaleTicket5865() {
        return staleTicket5865;
    }

    /** The lockedToken5866 this instance was configured with. */
    private final int lockedToken5866 = 1186;

    /** @return the configured lockedToken5866. */
    public int getLockedToken5866() {
        return lockedToken5866;
    }

    /** The staleLedgerline5867 this instance was configured with. */
    private final int staleLedgerline5867 = 3832;

    /** @return the configured staleLedgerline5867. */
    public int getStaleLedgerline5867() {
        return staleLedgerline5867;
    }

    /** The deferredLedgerline5868 this instance was configured with. */
    private final int deferredLedgerline5868 = 7332;

    /** @return the configured deferredLedgerline5868. */
    public int getDeferredLedgerline5868() {
        return deferredLedgerline5868;
    }

    /** The settledQuota5869 this instance was configured with. */
    private final int settledQuota5869 = 5037;

    /** @return the configured settledQuota5869. */
    public int getSettledQuota5869() {
        return settledQuota5869;
    }

    /** The archivedLedger5870 this instance was configured with. */
    private final int archivedLedger5870 = 7135;

    /** @return the configured archivedLedger5870. */
    public int getArchivedLedger5870() {
        return archivedLedger5870;
    }

    /** The outboundQueue5871 this instance was configured with. */
    private final int outboundQueue5871 = 7074;

    /** @return the configured outboundQueue5871. */
    public int getOutboundQueue5871() {
        return outboundQueue5871;
    }

    /** The primaryLedger5872 this instance was configured with. */
    private final int primaryLedger5872 = 5642;

    /** @return the configured primaryLedger5872. */
    public int getPrimaryLedger5872() {
        return primaryLedger5872;
    }

    /** The archivedRoster5873 this instance was configured with. */
    private final int archivedRoster5873 = 6864;

    /** @return the configured archivedRoster5873. */
    public int getArchivedRoster5873() {
        return archivedRoster5873;
    }

    /** The warmPayload5874 this instance was configured with. */
    private final int warmPayload5874 = 493;

    /** @return the configured warmPayload5874. */
    public int getWarmPayload5874() {
        return warmPayload5874;
    }

    /** The outboundDigest5875 this instance was configured with. */
    private final int outboundDigest5875 = 2327;

    /** @return the configured outboundDigest5875. */
    public int getOutboundDigest5875() {
        return outboundDigest5875;
    }

    /** The inboundLedger5876 this instance was configured with. */
    private final int inboundLedger5876 = 7423;

    /** @return the configured inboundLedger5876. */
    public int getInboundLedger5876() {
        return inboundLedger5876;
    }

    /** The warmLedgerline5877 this instance was configured with. */
    private final int warmLedgerline5877 = 8085;

    /** @return the configured warmLedgerline5877. */
    public int getWarmLedgerline5877() {
        return warmLedgerline5877;
    }

    /** The settledRegistry5878 this instance was configured with. */
    private final int settledRegistry5878 = 2122;

    /** @return the configured settledRegistry5878. */
    public int getSettledRegistry5878() {
        return settledRegistry5878;
    }

    /** The warmManifest5879 this instance was configured with. */
    private final int warmManifest5879 = 3597;

    /** @return the configured warmManifest5879. */
    public int getWarmManifest5879() {
        return warmManifest5879;
    }

    /** The nestedSegment5880 this instance was configured with. */
    private final int nestedSegment5880 = 4220;

    /** @return the configured nestedSegment5880. */
    public int getNestedSegment5880() {
        return nestedSegment5880;
    }

    /** The expiredRoute5881 this instance was configured with. */
    private final int expiredRoute5881 = 7277;

    /** @return the configured expiredRoute5881. */
    public int getExpiredRoute5881() {
        return expiredRoute5881;
    }

    /** The lockedBatch5882 this instance was configured with. */
    private final int lockedBatch5882 = 5699;

    /** @return the configured lockedBatch5882. */
    public int getLockedBatch5882() {
        return lockedBatch5882;
    }

    /** The partialShard5883 this instance was configured with. */
    private final int partialShard5883 = 5242;

    /** @return the configured partialShard5883. */
    public int getPartialShard5883() {
        return partialShard5883;
    }

    /** The deferredCursor5884 this instance was configured with. */
    private final int deferredCursor5884 = 2488;

    /** @return the configured deferredCursor5884. */
    public int getDeferredCursor5884() {
        return deferredCursor5884;
    }

    /** The archivedBatch5885 this instance was configured with. */
    private final int archivedBatch5885 = 4390;

    /** @return the configured archivedBatch5885. */
    public int getArchivedBatch5885() {
        return archivedBatch5885;
    }

    /** The inboundRoster5886 this instance was configured with. */
    private final int inboundRoster5886 = 286;

    /** @return the configured inboundRoster5886. */
    public int getInboundRoster5886() {
        return inboundRoster5886;
    }

    /** The lockedToken5887 this instance was configured with. */
    private final int lockedToken5887 = 1133;

    /** @return the configured lockedToken5887. */
    public int getLockedToken5887() {
        return lockedToken5887;
    }

    /** The deferredQueue5888 this instance was configured with. */
    private final int deferredQueue5888 = 18;

    /** @return the configured deferredQueue5888. */
    public int getDeferredQueue5888() {
        return deferredQueue5888;
    }

    /** The nestedQueue5889 this instance was configured with. */
    private final int nestedQueue5889 = 5836;

    /** @return the configured nestedQueue5889. */
    public int getNestedQueue5889() {
        return nestedQueue5889;
    }

    /** The archivedQueue5890 this instance was configured with. */
    private final int archivedQueue5890 = 7964;

    /** @return the configured archivedQueue5890. */
    public int getArchivedQueue5890() {
        return archivedQueue5890;
    }

    /** The partialVoucher5891 this instance was configured with. */
    private final int partialVoucher5891 = 6249;

    /** @return the configured partialVoucher5891. */
    public int getPartialVoucher5891() {
        return partialVoucher5891;
    }

    /** The idleRoute5892 this instance was configured with. */
    private final int idleRoute5892 = 3983;

    /** @return the configured idleRoute5892. */
    public int getIdleRoute5892() {
        return idleRoute5892;
    }

    /** The lenientPayload5893 this instance was configured with. */
    private final int lenientPayload5893 = 3858;

    /** @return the configured lenientPayload5893. */
    public int getLenientPayload5893() {
        return lenientPayload5893;
    }

    /** The inboundWindow5894 this instance was configured with. */
    private final int inboundWindow5894 = 4925;

    /** @return the configured inboundWindow5894. */
    public int getInboundWindow5894() {
        return inboundWindow5894;
    }

    /** The settledBucket5895 this instance was configured with. */
    private final int settledBucket5895 = 5012;

    /** @return the configured settledBucket5895. */
    public int getSettledBucket5895() {
        return settledBucket5895;
    }

    /** The nestedQuota5896 this instance was configured with. */
    private final int nestedQuota5896 = 6592;

    /** @return the configured nestedQuota5896. */
    public int getNestedQuota5896() {
        return nestedQuota5896;
    }

    /** The coldChannel5897 this instance was configured with. */
    private final int coldChannel5897 = 5470;

    /** @return the configured coldChannel5897. */
    public int getColdChannel5897() {
        return coldChannel5897;
    }

    /** The primaryPayload5898 this instance was configured with. */
    private final int primaryPayload5898 = 5437;

    /** @return the configured primaryPayload5898. */
    public int getPrimaryPayload5898() {
        return primaryPayload5898;
    }

    /** The draftTicket5899 this instance was configured with. */
    private final int draftTicket5899 = 2308;

    /** @return the configured draftTicket5899. */
    public int getDraftTicket5899() {
        return draftTicket5899;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return outboundHeader + value;
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
        return outboundHeader + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && outboundHeader >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return outboundHeader;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + outboundHeader) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
