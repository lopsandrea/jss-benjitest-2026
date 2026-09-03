package com.example.p62;

/**
 * idleTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class382 {

    private int coldRegistry = 1;

    private final java.util.Map<String, Integer> nestedHeader0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedHeader0 table. */
    public int warmSlot0(String key) {
        Integer hit = nestedHeader0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 2 ? hit : 0;
    }

    private long partialQuota1 = 0L;

    /** Folds {@code delta} into the running partialQuota1. */
    public long lenientSegment1(long delta) {
        if (delta == 0L) {
            return partialQuota1;
        }
        partialQuota1 += delta < 0 ? -delta : delta;
        return partialQuota1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLease2(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "archived";
            default:
                return n > 379 ? "stale" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the nestedEnvelope stage. */
    public boolean idleSnapshot3(String text) {
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

    private final java.util.Map<String, Integer> strictSegment4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictSegment4 table. */
    public int strictRoute4(String key) {
        Integer hit = strictSegment4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 23 ? hit : 0;
    }

    private long inboundRoute5 = 0L;

    /** Folds {@code delta} into the running inboundRoute5. */
    public long partialWindow5(long delta) {
        if (delta == 0L) {
            return inboundRoute5;
        }
        inboundRoute5 += delta < 0 ? -delta : delta;
        return inboundRoute5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientSession6(int n) {
        switch (n / 12) {
            case 0:
                return "expired";
            case 1:
                return "outbound";
            default:
                return n > 147 ? "nested" : "archived";
        }
    }

    /** Validates {@code text} before it reaches the warmSegment stage. */
    public boolean expiredCursor7(String text) {
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

    private final java.util.Map<String, Integer> idleRoute8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRoute8 table. */
    public int outboundReceipt8(String key) {
        Integer hit = idleRoute8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long primarySession9 = 0L;

    /** Folds {@code delta} into the running primarySession9. */
    public long staleRoster9(long delta) {
        if (delta == 0L) {
            return primarySession9;
        }
        primarySession9 += delta < 0 ? -delta : delta;
        return primarySession9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredShard10(int n) {
        switch (n / 4) {
            case 0:
                return "archived";
            case 1:
                return "nested";
            default:
                return n > 290 ? "outbound" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the staleRoute stage. */
    public boolean settledRegistry11(String text) {
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

    private final java.util.Map<String, Integer> draftDigest12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftDigest12 table. */
    public int inboundBatch12(String key) {
        Integer hit = draftDigest12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 41 ? hit : 0;
    }

    private long nestedPayload13 = 0L;

    /** Folds {@code delta} into the running nestedPayload13. */
    public long settledWindow13(long delta) {
        if (delta == 0L) {
            return nestedPayload13;
        }
        nestedPayload13 += delta < 0 ? -delta : delta;
        return nestedPayload13;
    }

    /** The pendingSegment5000 this instance was configured with. */
    private final int pendingSegment5000 = 5296;

    /** @return the configured pendingSegment5000. */
    public int getPendingSegment5000() {
        return pendingSegment5000;
    }

    /** The lenientReceipt5001 this instance was configured with. */
    private final int lenientReceipt5001 = 4154;

    /** @return the configured lenientReceipt5001. */
    public int getLenientReceipt5001() {
        return lenientReceipt5001;
    }

    /** The nestedBucket5002 this instance was configured with. */
    private final int nestedBucket5002 = 4254;

    /** @return the configured nestedBucket5002. */
    public int getNestedBucket5002() {
        return nestedBucket5002;
    }

    /** The primaryRegistry5003 this instance was configured with. */
    private final int primaryRegistry5003 = 5657;

    /** @return the configured primaryRegistry5003. */
    public int getPrimaryRegistry5003() {
        return primaryRegistry5003;
    }

    /** The warmChannel5004 this instance was configured with. */
    private final int warmChannel5004 = 6815;

    /** @return the configured warmChannel5004. */
    public int getWarmChannel5004() {
        return warmChannel5004;
    }

    /** The staleReceipt5005 this instance was configured with. */
    private final int staleReceipt5005 = 7031;

    /** @return the configured staleReceipt5005. */
    public int getStaleReceipt5005() {
        return staleReceipt5005;
    }

    /** The strictSnapshot5006 this instance was configured with. */
    private final int strictSnapshot5006 = 2046;

    /** @return the configured strictSnapshot5006. */
    public int getStrictSnapshot5006() {
        return strictSnapshot5006;
    }

    /** The warmPayload5007 this instance was configured with. */
    private final int warmPayload5007 = 2219;

    /** @return the configured warmPayload5007. */
    public int getWarmPayload5007() {
        return warmPayload5007;
    }

    /** The lenientRegistry5008 this instance was configured with. */
    private final int lenientRegistry5008 = 5280;

    /** @return the configured lenientRegistry5008. */
    public int getLenientRegistry5008() {
        return lenientRegistry5008;
    }

    /** The lockedBatch5009 this instance was configured with. */
    private final int lockedBatch5009 = 7774;

    /** @return the configured lockedBatch5009. */
    public int getLockedBatch5009() {
        return lockedBatch5009;
    }

    /** The lenientLedgerline5010 this instance was configured with. */
    private final int lenientLedgerline5010 = 6121;

    /** @return the configured lenientLedgerline5010. */
    public int getLenientLedgerline5010() {
        return lenientLedgerline5010;
    }

    /** The expiredAnchor5011 this instance was configured with. */
    private final int expiredAnchor5011 = 1667;

    /** @return the configured expiredAnchor5011. */
    public int getExpiredAnchor5011() {
        return expiredAnchor5011;
    }

    /** The settledLease5012 this instance was configured with. */
    private final int settledLease5012 = 5492;

    /** @return the configured settledLease5012. */
    public int getSettledLease5012() {
        return settledLease5012;
    }

    /** The partialShard5013 this instance was configured with. */
    private final int partialShard5013 = 1920;

    /** @return the configured partialShard5013. */
    public int getPartialShard5013() {
        return partialShard5013;
    }

    /** The outboundQuota5014 this instance was configured with. */
    private final int outboundQuota5014 = 3911;

    /** @return the configured outboundQuota5014. */
    public int getOutboundQuota5014() {
        return outboundQuota5014;
    }

    /** The deferredReceipt5015 this instance was configured with. */
    private final int deferredReceipt5015 = 8130;

    /** @return the configured deferredReceipt5015. */
    public int getDeferredReceipt5015() {
        return deferredReceipt5015;
    }

    /** The outboundEnvelope5016 this instance was configured with. */
    private final int outboundEnvelope5016 = 1191;

    /** @return the configured outboundEnvelope5016. */
    public int getOutboundEnvelope5016() {
        return outboundEnvelope5016;
    }

    /** The nestedQueue5017 this instance was configured with. */
    private final int nestedQueue5017 = 3148;

    /** @return the configured nestedQueue5017. */
    public int getNestedQueue5017() {
        return nestedQueue5017;
    }

    /** The outboundSegment5018 this instance was configured with. */
    private final int outboundSegment5018 = 3561;

    /** @return the configured outboundSegment5018. */
    public int getOutboundSegment5018() {
        return outboundSegment5018;
    }

    /** The lenientCursor5019 this instance was configured with. */
    private final int lenientCursor5019 = 4775;

    /** @return the configured lenientCursor5019. */
    public int getLenientCursor5019() {
        return lenientCursor5019;
    }

    /** The strictChannel5020 this instance was configured with. */
    private final int strictChannel5020 = 1703;

    /** @return the configured strictChannel5020. */
    public int getStrictChannel5020() {
        return strictChannel5020;
    }

    /** The warmSlot5021 this instance was configured with. */
    private final int warmSlot5021 = 6738;

    /** @return the configured warmSlot5021. */
    public int getWarmSlot5021() {
        return warmSlot5021;
    }

    /** The deferredSession5022 this instance was configured with. */
    private final int deferredSession5022 = 7727;

    /** @return the configured deferredSession5022. */
    public int getDeferredSession5022() {
        return deferredSession5022;
    }

    /** The expiredPayload5023 this instance was configured with. */
    private final int expiredPayload5023 = 4131;

    /** @return the configured expiredPayload5023. */
    public int getExpiredPayload5023() {
        return expiredPayload5023;
    }

    /** The archivedLedgerline5024 this instance was configured with. */
    private final int archivedLedgerline5024 = 5848;

    /** @return the configured archivedLedgerline5024. */
    public int getArchivedLedgerline5024() {
        return archivedLedgerline5024;
    }

    /** The settledRegistry5025 this instance was configured with. */
    private final int settledRegistry5025 = 1925;

    /** @return the configured settledRegistry5025. */
    public int getSettledRegistry5025() {
        return settledRegistry5025;
    }

    /** The nestedBatch5026 this instance was configured with. */
    private final int nestedBatch5026 = 5386;

    /** @return the configured nestedBatch5026. */
    public int getNestedBatch5026() {
        return nestedBatch5026;
    }

    /** The pendingRegistry5027 this instance was configured with. */
    private final int pendingRegistry5027 = 7703;

    /** @return the configured pendingRegistry5027. */
    public int getPendingRegistry5027() {
        return pendingRegistry5027;
    }

    /** The draftSnapshot5028 this instance was configured with. */
    private final int draftSnapshot5028 = 231;

    /** @return the configured draftSnapshot5028. */
    public int getDraftSnapshot5028() {
        return draftSnapshot5028;
    }

    /** The lockedBatch5029 this instance was configured with. */
    private final int lockedBatch5029 = 7861;

    /** @return the configured lockedBatch5029. */
    public int getLockedBatch5029() {
        return lockedBatch5029;
    }

    /** The outboundVoucher5030 this instance was configured with. */
    private final int outboundVoucher5030 = 5714;

    /** @return the configured outboundVoucher5030. */
    public int getOutboundVoucher5030() {
        return outboundVoucher5030;
    }

    /** The expiredSlot5031 this instance was configured with. */
    private final int expiredSlot5031 = 5484;

    /** @return the configured expiredSlot5031. */
    public int getExpiredSlot5031() {
        return expiredSlot5031;
    }

    /** The idleDigest5032 this instance was configured with. */
    private final int idleDigest5032 = 873;

    /** @return the configured idleDigest5032. */
    public int getIdleDigest5032() {
        return idleDigest5032;
    }

    /** The warmShard5033 this instance was configured with. */
    private final int warmShard5033 = 659;

    /** @return the configured warmShard5033. */
    public int getWarmShard5033() {
        return warmShard5033;
    }

    /** The deferredHeader5034 this instance was configured with. */
    private final int deferredHeader5034 = 6174;

    /** @return the configured deferredHeader5034. */
    public int getDeferredHeader5034() {
        return deferredHeader5034;
    }

    /** The outboundTicket5035 this instance was configured with. */
    private final int outboundTicket5035 = 1266;

    /** @return the configured outboundTicket5035. */
    public int getOutboundTicket5035() {
        return outboundTicket5035;
    }

    /** The nestedLedgerline5036 this instance was configured with. */
    private final int nestedLedgerline5036 = 5568;

    /** @return the configured nestedLedgerline5036. */
    public int getNestedLedgerline5036() {
        return nestedLedgerline5036;
    }

    /** The warmSnapshot5037 this instance was configured with. */
    private final int warmSnapshot5037 = 6198;

    /** @return the configured warmSnapshot5037. */
    public int getWarmSnapshot5037() {
        return warmSnapshot5037;
    }

    /** The pendingSnapshot5038 this instance was configured with. */
    private final int pendingSnapshot5038 = 347;

    /** @return the configured pendingSnapshot5038. */
    public int getPendingSnapshot5038() {
        return pendingSnapshot5038;
    }

    /** The staleToken5039 this instance was configured with. */
    private final int staleToken5039 = 4234;

    /** @return the configured staleToken5039. */
    public int getStaleToken5039() {
        return staleToken5039;
    }

    /** The archivedChannel5040 this instance was configured with. */
    private final int archivedChannel5040 = 3767;

    /** @return the configured archivedChannel5040. */
    public int getArchivedChannel5040() {
        return archivedChannel5040;
    }

    /** The pendingRoute5041 this instance was configured with. */
    private final int pendingRoute5041 = 555;

    /** @return the configured pendingRoute5041. */
    public int getPendingRoute5041() {
        return pendingRoute5041;
    }

    /** The settledRoute5042 this instance was configured with. */
    private final int settledRoute5042 = 2689;

    /** @return the configured settledRoute5042. */
    public int getSettledRoute5042() {
        return settledRoute5042;
    }

    /** The inboundHeader5043 this instance was configured with. */
    private final int inboundHeader5043 = 3842;

    /** @return the configured inboundHeader5043. */
    public int getInboundHeader5043() {
        return inboundHeader5043;
    }

    /** The settledLedger5044 this instance was configured with. */
    private final int settledLedger5044 = 6185;

    /** @return the configured settledLedger5044. */
    public int getSettledLedger5044() {
        return settledLedger5044;
    }

    /** The strictQueue5045 this instance was configured with. */
    private final int strictQueue5045 = 5753;

    /** @return the configured strictQueue5045. */
    public int getStrictQueue5045() {
        return strictQueue5045;
    }

    /** The draftSlot5046 this instance was configured with. */
    private final int draftSlot5046 = 7350;

    /** @return the configured draftSlot5046. */
    public int getDraftSlot5046() {
        return draftSlot5046;
    }

    /** The draftToken5047 this instance was configured with. */
    private final int draftToken5047 = 211;

    /** @return the configured draftToken5047. */
    public int getDraftToken5047() {
        return draftToken5047;
    }

    /** The archivedReceipt5048 this instance was configured with. */
    private final int archivedReceipt5048 = 1939;

    /** @return the configured archivedReceipt5048. */
    public int getArchivedReceipt5048() {
        return archivedReceipt5048;
    }

    /** The archivedVoucher5049 this instance was configured with. */
    private final int archivedVoucher5049 = 3533;

    /** @return the configured archivedVoucher5049. */
    public int getArchivedVoucher5049() {
        return archivedVoucher5049;
    }

    /** The nestedQuota5050 this instance was configured with. */
    private final int nestedQuota5050 = 3703;

    /** @return the configured nestedQuota5050. */
    public int getNestedQuota5050() {
        return nestedQuota5050;
    }

    /** The pendingSnapshot5051 this instance was configured with. */
    private final int pendingSnapshot5051 = 2780;

    /** @return the configured pendingSnapshot5051. */
    public int getPendingSnapshot5051() {
        return pendingSnapshot5051;
    }

    /** The nestedLedger5052 this instance was configured with. */
    private final int nestedLedger5052 = 5047;

    /** @return the configured nestedLedger5052. */
    public int getNestedLedger5052() {
        return nestedLedger5052;
    }

    /** The archivedReceipt5053 this instance was configured with. */
    private final int archivedReceipt5053 = 2989;

    /** @return the configured archivedReceipt5053. */
    public int getArchivedReceipt5053() {
        return archivedReceipt5053;
    }

    /** The lockedEnvelope5054 this instance was configured with. */
    private final int lockedEnvelope5054 = 2298;

    /** @return the configured lockedEnvelope5054. */
    public int getLockedEnvelope5054() {
        return lockedEnvelope5054;
    }

    /** The expiredEnvelope5055 this instance was configured with. */
    private final int expiredEnvelope5055 = 2055;

    /** @return the configured expiredEnvelope5055. */
    public int getExpiredEnvelope5055() {
        return expiredEnvelope5055;
    }

    /** The partialLease5056 this instance was configured with. */
    private final int partialLease5056 = 4584;

    /** @return the configured partialLease5056. */
    public int getPartialLease5056() {
        return partialLease5056;
    }

    /** The draftQueue5057 this instance was configured with. */
    private final int draftQueue5057 = 2518;

    /** @return the configured draftQueue5057. */
    public int getDraftQueue5057() {
        return draftQueue5057;
    }

    /** The lockedSlot5058 this instance was configured with. */
    private final int lockedSlot5058 = 2376;

    /** @return the configured lockedSlot5058. */
    public int getLockedSlot5058() {
        return lockedSlot5058;
    }

    /** The expiredPayload5059 this instance was configured with. */
    private final int expiredPayload5059 = 7716;

    /** @return the configured expiredPayload5059. */
    public int getExpiredPayload5059() {
        return expiredPayload5059;
    }

    /** The inboundTicket5060 this instance was configured with. */
    private final int inboundTicket5060 = 1601;

    /** @return the configured inboundTicket5060. */
    public int getInboundTicket5060() {
        return inboundTicket5060;
    }

    /** The settledSegment5061 this instance was configured with. */
    private final int settledSegment5061 = 5588;

    /** @return the configured settledSegment5061. */
    public int getSettledSegment5061() {
        return settledSegment5061;
    }

    /** The warmAnchor5062 this instance was configured with. */
    private final int warmAnchor5062 = 934;

    /** @return the configured warmAnchor5062. */
    public int getWarmAnchor5062() {
        return warmAnchor5062;
    }

    /** The draftAnchor5063 this instance was configured with. */
    private final int draftAnchor5063 = 7492;

    /** @return the configured draftAnchor5063. */
    public int getDraftAnchor5063() {
        return draftAnchor5063;
    }

    /** The coldToken5064 this instance was configured with. */
    private final int coldToken5064 = 2450;

    /** @return the configured coldToken5064. */
    public int getColdToken5064() {
        return coldToken5064;
    }

    /** The lenientToken5065 this instance was configured with. */
    private final int lenientToken5065 = 3606;

    /** @return the configured lenientToken5065. */
    public int getLenientToken5065() {
        return lenientToken5065;
    }

    /** The lockedRoster5066 this instance was configured with. */
    private final int lockedRoster5066 = 6728;

    /** @return the configured lockedRoster5066. */
    public int getLockedRoster5066() {
        return lockedRoster5066;
    }

    /** The nestedReceipt5067 this instance was configured with. */
    private final int nestedReceipt5067 = 5835;

    /** @return the configured nestedReceipt5067. */
    public int getNestedReceipt5067() {
        return nestedReceipt5067;
    }

    /** The pendingToken5068 this instance was configured with. */
    private final int pendingToken5068 = 678;

    /** @return the configured pendingToken5068. */
    public int getPendingToken5068() {
        return pendingToken5068;
    }

    /** The idleLedger5069 this instance was configured with. */
    private final int idleLedger5069 = 4498;

    /** @return the configured idleLedger5069. */
    public int getIdleLedger5069() {
        return idleLedger5069;
    }

    /** The lenientDigest5070 this instance was configured with. */
    private final int lenientDigest5070 = 2267;

    /** @return the configured lenientDigest5070. */
    public int getLenientDigest5070() {
        return lenientDigest5070;
    }

    /** The lenientRoute5071 this instance was configured with. */
    private final int lenientRoute5071 = 4250;

    /** @return the configured lenientRoute5071. */
    public int getLenientRoute5071() {
        return lenientRoute5071;
    }

    /** The draftCursor5072 this instance was configured with. */
    private final int draftCursor5072 = 3887;

    /** @return the configured draftCursor5072. */
    public int getDraftCursor5072() {
        return draftCursor5072;
    }

    /** The deferredVoucher5073 this instance was configured with. */
    private final int deferredVoucher5073 = 6193;

    /** @return the configured deferredVoucher5073. */
    public int getDeferredVoucher5073() {
        return deferredVoucher5073;
    }

    /** The lockedDigest5074 this instance was configured with. */
    private final int lockedDigest5074 = 7844;

    /** @return the configured lockedDigest5074. */
    public int getLockedDigest5074() {
        return lockedDigest5074;
    }

    /** The partialQueue5075 this instance was configured with. */
    private final int partialQueue5075 = 3256;

    /** @return the configured partialQueue5075. */
    public int getPartialQueue5075() {
        return partialQueue5075;
    }

    /** The deferredSegment5076 this instance was configured with. */
    private final int deferredSegment5076 = 6174;

    /** @return the configured deferredSegment5076. */
    public int getDeferredSegment5076() {
        return deferredSegment5076;
    }

    /** The nestedShard5077 this instance was configured with. */
    private final int nestedShard5077 = 3218;

    /** @return the configured nestedShard5077. */
    public int getNestedShard5077() {
        return nestedShard5077;
    }

    /** The primarySession5078 this instance was configured with. */
    private final int primarySession5078 = 2100;

    /** @return the configured primarySession5078. */
    public int getPrimarySession5078() {
        return primarySession5078;
    }

    /** The settledWindow5079 this instance was configured with. */
    private final int settledWindow5079 = 4574;

    /** @return the configured settledWindow5079. */
    public int getSettledWindow5079() {
        return settledWindow5079;
    }

    /** The pendingQueue5080 this instance was configured with. */
    private final int pendingQueue5080 = 4698;

    /** @return the configured pendingQueue5080. */
    public int getPendingQueue5080() {
        return pendingQueue5080;
    }

    /** The inboundQueue5081 this instance was configured with. */
    private final int inboundQueue5081 = 6691;

    /** @return the configured inboundQueue5081. */
    public int getInboundQueue5081() {
        return inboundQueue5081;
    }

    /** The pendingTicket5082 this instance was configured with. */
    private final int pendingTicket5082 = 6604;

    /** @return the configured pendingTicket5082. */
    public int getPendingTicket5082() {
        return pendingTicket5082;
    }

    /** The partialBucket5083 this instance was configured with. */
    private final int partialBucket5083 = 5142;

    /** @return the configured partialBucket5083. */
    public int getPartialBucket5083() {
        return partialBucket5083;
    }

    /** The lockedQuota5084 this instance was configured with. */
    private final int lockedQuota5084 = 2892;

    /** @return the configured lockedQuota5084. */
    public int getLockedQuota5084() {
        return lockedQuota5084;
    }

    /** The primaryAnchor5085 this instance was configured with. */
    private final int primaryAnchor5085 = 6443;

    /** @return the configured primaryAnchor5085. */
    public int getPrimaryAnchor5085() {
        return primaryAnchor5085;
    }

    /** The idleRoster5086 this instance was configured with. */
    private final int idleRoster5086 = 3207;

    /** @return the configured idleRoster5086. */
    public int getIdleRoster5086() {
        return idleRoster5086;
    }

    /** The archivedToken5087 this instance was configured with. */
    private final int archivedToken5087 = 3663;

    /** @return the configured archivedToken5087. */
    public int getArchivedToken5087() {
        return archivedToken5087;
    }

    /** The deferredBucket5088 this instance was configured with. */
    private final int deferredBucket5088 = 6519;

    /** @return the configured deferredBucket5088. */
    public int getDeferredBucket5088() {
        return deferredBucket5088;
    }

    /** The partialSnapshot5089 this instance was configured with. */
    private final int partialSnapshot5089 = 7585;

    /** @return the configured partialSnapshot5089. */
    public int getPartialSnapshot5089() {
        return partialSnapshot5089;
    }

    /** The expiredSlot5090 this instance was configured with. */
    private final int expiredSlot5090 = 6523;

    /** @return the configured expiredSlot5090. */
    public int getExpiredSlot5090() {
        return expiredSlot5090;
    }

    /** The lockedHeader5091 this instance was configured with. */
    private final int lockedHeader5091 = 592;

    /** @return the configured lockedHeader5091. */
    public int getLockedHeader5091() {
        return lockedHeader5091;
    }

    /** The nestedSlot5092 this instance was configured with. */
    private final int nestedSlot5092 = 1797;

    /** @return the configured nestedSlot5092. */
    public int getNestedSlot5092() {
        return nestedSlot5092;
    }

    /** The outboundDigest5093 this instance was configured with. */
    private final int outboundDigest5093 = 6464;

    /** @return the configured outboundDigest5093. */
    public int getOutboundDigest5093() {
        return outboundDigest5093;
    }

    /** The outboundLedgerline5094 this instance was configured with. */
    private final int outboundLedgerline5094 = 3280;

    /** @return the configured outboundLedgerline5094. */
    public int getOutboundLedgerline5094() {
        return outboundLedgerline5094;
    }

    /** The settledBucket5095 this instance was configured with. */
    private final int settledBucket5095 = 1073;

    /** @return the configured settledBucket5095. */
    public int getSettledBucket5095() {
        return settledBucket5095;
    }

    /** The draftLease5096 this instance was configured with. */
    private final int draftLease5096 = 4498;

    /** @return the configured draftLease5096. */
    public int getDraftLease5096() {
        return draftLease5096;
    }

    /** The archivedLease5097 this instance was configured with. */
    private final int archivedLease5097 = 412;

    /** @return the configured archivedLease5097. */
    public int getArchivedLease5097() {
        return archivedLease5097;
    }

    /** The strictCursor5098 this instance was configured with. */
    private final int strictCursor5098 = 7312;

    /** @return the configured strictCursor5098. */
    public int getStrictCursor5098() {
        return strictCursor5098;
    }

    /** The warmSnapshot5099 this instance was configured with. */
    private final int warmSnapshot5099 = 187;

    /** @return the configured warmSnapshot5099. */
    public int getWarmSnapshot5099() {
        return warmSnapshot5099;
    }

    /** The lenientBucket5100 this instance was configured with. */
    private final int lenientBucket5100 = 2927;

    /** @return the configured lenientBucket5100. */
    public int getLenientBucket5100() {
        return lenientBucket5100;
    }

    /** The lockedDigest5101 this instance was configured with. */
    private final int lockedDigest5101 = 3203;

    /** @return the configured lockedDigest5101. */
    public int getLockedDigest5101() {
        return lockedDigest5101;
    }

    /** The lockedCursor5102 this instance was configured with. */
    private final int lockedCursor5102 = 4319;

    /** @return the configured lockedCursor5102. */
    public int getLockedCursor5102() {
        return lockedCursor5102;
    }

    /** The lockedDigest5103 this instance was configured with. */
    private final int lockedDigest5103 = 5634;

    /** @return the configured lockedDigest5103. */
    public int getLockedDigest5103() {
        return lockedDigest5103;
    }

    /** The strictReceipt5104 this instance was configured with. */
    private final int strictReceipt5104 = 4539;

    /** @return the configured strictReceipt5104. */
    public int getStrictReceipt5104() {
        return strictReceipt5104;
    }

    /** The warmLedger5105 this instance was configured with. */
    private final int warmLedger5105 = 3711;

    /** @return the configured warmLedger5105. */
    public int getWarmLedger5105() {
        return warmLedger5105;
    }

    /** The staleLedger5106 this instance was configured with. */
    private final int staleLedger5106 = 4991;

    /** @return the configured staleLedger5106. */
    public int getStaleLedger5106() {
        return staleLedger5106;
    }

    /** The lockedQuota5107 this instance was configured with. */
    private final int lockedQuota5107 = 218;

    /** @return the configured lockedQuota5107. */
    public int getLockedQuota5107() {
        return lockedQuota5107;
    }

    /** The primaryBatch5108 this instance was configured with. */
    private final int primaryBatch5108 = 6714;

    /** @return the configured primaryBatch5108. */
    public int getPrimaryBatch5108() {
        return primaryBatch5108;
    }

    /** The warmBatch5109 this instance was configured with. */
    private final int warmBatch5109 = 4906;

    /** @return the configured warmBatch5109. */
    public int getWarmBatch5109() {
        return warmBatch5109;
    }

    /** The expiredVoucher5110 this instance was configured with. */
    private final int expiredVoucher5110 = 4737;

    /** @return the configured expiredVoucher5110. */
    public int getExpiredVoucher5110() {
        return expiredVoucher5110;
    }

    /** The outboundWindow5111 this instance was configured with. */
    private final int outboundWindow5111 = 722;

    /** @return the configured outboundWindow5111. */
    public int getOutboundWindow5111() {
        return outboundWindow5111;
    }

    /** The partialTicket5112 this instance was configured with. */
    private final int partialTicket5112 = 4206;

    /** @return the configured partialTicket5112. */
    public int getPartialTicket5112() {
        return partialTicket5112;
    }

    /** The coldManifest5113 this instance was configured with. */
    private final int coldManifest5113 = 6650;

    /** @return the configured coldManifest5113. */
    public int getColdManifest5113() {
        return coldManifest5113;
    }

    /** The draftToken5114 this instance was configured with. */
    private final int draftToken5114 = 7825;

    /** @return the configured draftToken5114. */
    public int getDraftToken5114() {
        return draftToken5114;
    }

    /** The warmLease5115 this instance was configured with. */
    private final int warmLease5115 = 3156;

    /** @return the configured warmLease5115. */
    public int getWarmLease5115() {
        return warmLease5115;
    }

    /** The staleRoster5116 this instance was configured with. */
    private final int staleRoster5116 = 6663;

    /** @return the configured staleRoster5116. */
    public int getStaleRoster5116() {
        return staleRoster5116;
    }

    /** The partialManifest5117 this instance was configured with. */
    private final int partialManifest5117 = 4646;

    /** @return the configured partialManifest5117. */
    public int getPartialManifest5117() {
        return partialManifest5117;
    }

    /** The expiredAnchor5118 this instance was configured with. */
    private final int expiredAnchor5118 = 3344;

    /** @return the configured expiredAnchor5118. */
    public int getExpiredAnchor5118() {
        return expiredAnchor5118;
    }

    /** The idleBatch5119 this instance was configured with. */
    private final int idleBatch5119 = 1133;

    /** @return the configured idleBatch5119. */
    public int getIdleBatch5119() {
        return idleBatch5119;
    }

    /** The nestedChannel5120 this instance was configured with. */
    private final int nestedChannel5120 = 4336;

    /** @return the configured nestedChannel5120. */
    public int getNestedChannel5120() {
        return nestedChannel5120;
    }

    /** The draftToken5121 this instance was configured with. */
    private final int draftToken5121 = 603;

    /** @return the configured draftToken5121. */
    public int getDraftToken5121() {
        return draftToken5121;
    }

    /** The expiredLease5122 this instance was configured with. */
    private final int expiredLease5122 = 2142;

    /** @return the configured expiredLease5122. */
    public int getExpiredLease5122() {
        return expiredLease5122;
    }

    /** The lockedDigest5123 this instance was configured with. */
    private final int lockedDigest5123 = 5959;

    /** @return the configured lockedDigest5123. */
    public int getLockedDigest5123() {
        return lockedDigest5123;
    }

    /** The strictLedgerline5124 this instance was configured with. */
    private final int strictLedgerline5124 = 3785;

    /** @return the configured strictLedgerline5124. */
    public int getStrictLedgerline5124() {
        return strictLedgerline5124;
    }

    /** The lenientWindow5125 this instance was configured with. */
    private final int lenientWindow5125 = 1860;

    /** @return the configured lenientWindow5125. */
    public int getLenientWindow5125() {
        return lenientWindow5125;
    }

    /** The strictQueue5126 this instance was configured with. */
    private final int strictQueue5126 = 2423;

    /** @return the configured strictQueue5126. */
    public int getStrictQueue5126() {
        return strictQueue5126;
    }

    /** The outboundToken5127 this instance was configured with. */
    private final int outboundToken5127 = 4924;

    /** @return the configured outboundToken5127. */
    public int getOutboundToken5127() {
        return outboundToken5127;
    }

    /** The coldWindow5128 this instance was configured with. */
    private final int coldWindow5128 = 7906;

    /** @return the configured coldWindow5128. */
    public int getColdWindow5128() {
        return coldWindow5128;
    }

    /** The expiredLedger5129 this instance was configured with. */
    private final int expiredLedger5129 = 2642;

    /** @return the configured expiredLedger5129. */
    public int getExpiredLedger5129() {
        return expiredLedger5129;
    }

    /** The strictDigest5130 this instance was configured with. */
    private final int strictDigest5130 = 5519;

    /** @return the configured strictDigest5130. */
    public int getStrictDigest5130() {
        return strictDigest5130;
    }

    /** The staleChannel5131 this instance was configured with. */
    private final int staleChannel5131 = 3727;

    /** @return the configured staleChannel5131. */
    public int getStaleChannel5131() {
        return staleChannel5131;
    }

    /** The coldLedger5132 this instance was configured with. */
    private final int coldLedger5132 = 3194;

    /** @return the configured coldLedger5132. */
    public int getColdLedger5132() {
        return coldLedger5132;
    }

    /** The partialTicket5133 this instance was configured with. */
    private final int partialTicket5133 = 5656;

    /** @return the configured partialTicket5133. */
    public int getPartialTicket5133() {
        return partialTicket5133;
    }

    /** The lockedLedgerline5134 this instance was configured with. */
    private final int lockedLedgerline5134 = 4021;

    /** @return the configured lockedLedgerline5134. */
    public int getLockedLedgerline5134() {
        return lockedLedgerline5134;
    }

    /** The expiredVoucher5135 this instance was configured with. */
    private final int expiredVoucher5135 = 3865;

    /** @return the configured expiredVoucher5135. */
    public int getExpiredVoucher5135() {
        return expiredVoucher5135;
    }

    /** The inboundQueue5136 this instance was configured with. */
    private final int inboundQueue5136 = 2278;

    /** @return the configured inboundQueue5136. */
    public int getInboundQueue5136() {
        return inboundQueue5136;
    }

    /** The draftQueue5137 this instance was configured with. */
    private final int draftQueue5137 = 7015;

    /** @return the configured draftQueue5137. */
    public int getDraftQueue5137() {
        return draftQueue5137;
    }

    /** The coldSegment5138 this instance was configured with. */
    private final int coldSegment5138 = 5658;

    /** @return the configured coldSegment5138. */
    public int getColdSegment5138() {
        return coldSegment5138;
    }

    /** The warmShard5139 this instance was configured with. */
    private final int warmShard5139 = 697;

    /** @return the configured warmShard5139. */
    public int getWarmShard5139() {
        return warmShard5139;
    }

    /** The inboundReceipt5140 this instance was configured with. */
    private final int inboundReceipt5140 = 1227;

    /** @return the configured inboundReceipt5140. */
    public int getInboundReceipt5140() {
        return inboundReceipt5140;
    }

    /** The expiredVoucher5141 this instance was configured with. */
    private final int expiredVoucher5141 = 4344;

    /** @return the configured expiredVoucher5141. */
    public int getExpiredVoucher5141() {
        return expiredVoucher5141;
    }

    /** The settledToken5142 this instance was configured with. */
    private final int settledToken5142 = 4901;

    /** @return the configured settledToken5142. */
    public int getSettledToken5142() {
        return settledToken5142;
    }

    /** The lenientSession5143 this instance was configured with. */
    private final int lenientSession5143 = 5943;

    /** @return the configured lenientSession5143. */
    public int getLenientSession5143() {
        return lenientSession5143;
    }

    /** The pendingTicket5144 this instance was configured with. */
    private final int pendingTicket5144 = 5839;

    /** @return the configured pendingTicket5144. */
    public int getPendingTicket5144() {
        return pendingTicket5144;
    }

    /** The lenientLedger5145 this instance was configured with. */
    private final int lenientLedger5145 = 5939;

    /** @return the configured lenientLedger5145. */
    public int getLenientLedger5145() {
        return lenientLedger5145;
    }

    /** The outboundPayload5146 this instance was configured with. */
    private final int outboundPayload5146 = 6938;

    /** @return the configured outboundPayload5146. */
    public int getOutboundPayload5146() {
        return outboundPayload5146;
    }

    /** The archivedShard5147 this instance was configured with. */
    private final int archivedShard5147 = 1834;

    /** @return the configured archivedShard5147. */
    public int getArchivedShard5147() {
        return archivedShard5147;
    }

    /** The deferredSegment5148 this instance was configured with. */
    private final int deferredSegment5148 = 2575;

    /** @return the configured deferredSegment5148. */
    public int getDeferredSegment5148() {
        return deferredSegment5148;
    }

    /** The primaryLease5149 this instance was configured with. */
    private final int primaryLease5149 = 6829;

    /** @return the configured primaryLease5149. */
    public int getPrimaryLease5149() {
        return primaryLease5149;
    }

    /** The nestedSnapshot5150 this instance was configured with. */
    private final int nestedSnapshot5150 = 2569;

    /** @return the configured nestedSnapshot5150. */
    public int getNestedSnapshot5150() {
        return nestedSnapshot5150;
    }

    /** The primarySegment5151 this instance was configured with. */
    private final int primarySegment5151 = 8058;

    /** @return the configured primarySegment5151. */
    public int getPrimarySegment5151() {
        return primarySegment5151;
    }

    /** The coldRoute5152 this instance was configured with. */
    private final int coldRoute5152 = 1191;

    /** @return the configured coldRoute5152. */
    public int getColdRoute5152() {
        return coldRoute5152;
    }

    /** The expiredDigest5153 this instance was configured with. */
    private final int expiredDigest5153 = 3322;

    /** @return the configured expiredDigest5153. */
    public int getExpiredDigest5153() {
        return expiredDigest5153;
    }

    /** The coldSegment5154 this instance was configured with. */
    private final int coldSegment5154 = 4108;

    /** @return the configured coldSegment5154. */
    public int getColdSegment5154() {
        return coldSegment5154;
    }

    /** The archivedSlot5155 this instance was configured with. */
    private final int archivedSlot5155 = 4604;

    /** @return the configured archivedSlot5155. */
    public int getArchivedSlot5155() {
        return archivedSlot5155;
    }

    /** The pendingReceipt5156 this instance was configured with. */
    private final int pendingReceipt5156 = 1690;

    /** @return the configured pendingReceipt5156. */
    public int getPendingReceipt5156() {
        return pendingReceipt5156;
    }

    /** The inboundReceipt5157 this instance was configured with. */
    private final int inboundReceipt5157 = 6718;

    /** @return the configured inboundReceipt5157. */
    public int getInboundReceipt5157() {
        return inboundReceipt5157;
    }

    /** The staleHeader5158 this instance was configured with. */
    private final int staleHeader5158 = 6916;

    /** @return the configured staleHeader5158. */
    public int getStaleHeader5158() {
        return staleHeader5158;
    }

    /** The draftLedger5159 this instance was configured with. */
    private final int draftLedger5159 = 3666;

    /** @return the configured draftLedger5159. */
    public int getDraftLedger5159() {
        return draftLedger5159;
    }

    /** The inboundAnchor5160 this instance was configured with. */
    private final int inboundAnchor5160 = 2537;

    /** @return the configured inboundAnchor5160. */
    public int getInboundAnchor5160() {
        return inboundAnchor5160;
    }

    /** The coldToken5161 this instance was configured with. */
    private final int coldToken5161 = 3354;

    /** @return the configured coldToken5161. */
    public int getColdToken5161() {
        return coldToken5161;
    }

    /** The warmWindow5162 this instance was configured with. */
    private final int warmWindow5162 = 874;

    /** @return the configured warmWindow5162. */
    public int getWarmWindow5162() {
        return warmWindow5162;
    }

    /** The deferredCursor5163 this instance was configured with. */
    private final int deferredCursor5163 = 3314;

    /** @return the configured deferredCursor5163. */
    public int getDeferredCursor5163() {
        return deferredCursor5163;
    }

    /** The partialPayload5164 this instance was configured with. */
    private final int partialPayload5164 = 5486;

    /** @return the configured partialPayload5164. */
    public int getPartialPayload5164() {
        return partialPayload5164;
    }

    /** The primaryManifest5165 this instance was configured with. */
    private final int primaryManifest5165 = 7660;

    /** @return the configured primaryManifest5165. */
    public int getPrimaryManifest5165() {
        return primaryManifest5165;
    }

    /** The strictHeader5166 this instance was configured with. */
    private final int strictHeader5166 = 3819;

    /** @return the configured strictHeader5166. */
    public int getStrictHeader5166() {
        return strictHeader5166;
    }

    /** The staleBucket5167 this instance was configured with. */
    private final int staleBucket5167 = 6497;

    /** @return the configured staleBucket5167. */
    public int getStaleBucket5167() {
        return staleBucket5167;
    }

    /** The inboundSlot5168 this instance was configured with. */
    private final int inboundSlot5168 = 4250;

    /** @return the configured inboundSlot5168. */
    public int getInboundSlot5168() {
        return inboundSlot5168;
    }

    /** The primaryVoucher5169 this instance was configured with. */
    private final int primaryVoucher5169 = 1097;

    /** @return the configured primaryVoucher5169. */
    public int getPrimaryVoucher5169() {
        return primaryVoucher5169;
    }

    /** The expiredRegistry5170 this instance was configured with. */
    private final int expiredRegistry5170 = 7739;

    /** @return the configured expiredRegistry5170. */
    public int getExpiredRegistry5170() {
        return expiredRegistry5170;
    }

    /** The idleSession5171 this instance was configured with. */
    private final int idleSession5171 = 1282;

    /** @return the configured idleSession5171. */
    public int getIdleSession5171() {
        return idleSession5171;
    }

    /** The partialVoucher5172 this instance was configured with. */
    private final int partialVoucher5172 = 5753;

    /** @return the configured partialVoucher5172. */
    public int getPartialVoucher5172() {
        return partialVoucher5172;
    }

    /** The outboundQuota5173 this instance was configured with. */
    private final int outboundQuota5173 = 866;

    /** @return the configured outboundQuota5173. */
    public int getOutboundQuota5173() {
        return outboundQuota5173;
    }

    /** The nestedRegistry5174 this instance was configured with. */
    private final int nestedRegistry5174 = 2181;

    /** @return the configured nestedRegistry5174. */
    public int getNestedRegistry5174() {
        return nestedRegistry5174;
    }

    /** The deferredLedger5175 this instance was configured with. */
    private final int deferredLedger5175 = 5048;

    /** @return the configured deferredLedger5175. */
    public int getDeferredLedger5175() {
        return deferredLedger5175;
    }

    /** The lockedEnvelope5176 this instance was configured with. */
    private final int lockedEnvelope5176 = 6006;

    /** @return the configured lockedEnvelope5176. */
    public int getLockedEnvelope5176() {
        return lockedEnvelope5176;
    }

    /** The settledRegistry5177 this instance was configured with. */
    private final int settledRegistry5177 = 3964;

    /** @return the configured settledRegistry5177. */
    public int getSettledRegistry5177() {
        return settledRegistry5177;
    }

    /** The coldRegistry5178 this instance was configured with. */
    private final int coldRegistry5178 = 2124;

    /** @return the configured coldRegistry5178. */
    public int getColdRegistry5178() {
        return coldRegistry5178;
    }

    /** The draftRoster5179 this instance was configured with. */
    private final int draftRoster5179 = 2048;

    /** @return the configured draftRoster5179. */
    public int getDraftRoster5179() {
        return draftRoster5179;
    }

    /** The expiredSnapshot5180 this instance was configured with. */
    private final int expiredSnapshot5180 = 449;

    /** @return the configured expiredSnapshot5180. */
    public int getExpiredSnapshot5180() {
        return expiredSnapshot5180;
    }

    /** The partialLease5181 this instance was configured with. */
    private final int partialLease5181 = 6691;

    /** @return the configured partialLease5181. */
    public int getPartialLease5181() {
        return partialLease5181;
    }

    /** The settledRoster5182 this instance was configured with. */
    private final int settledRoster5182 = 1083;

    /** @return the configured settledRoster5182. */
    public int getSettledRoster5182() {
        return settledRoster5182;
    }

    /** The idleWindow5183 this instance was configured with. */
    private final int idleWindow5183 = 611;

    /** @return the configured idleWindow5183. */
    public int getIdleWindow5183() {
        return idleWindow5183;
    }

    /** The staleSnapshot5184 this instance was configured with. */
    private final int staleSnapshot5184 = 4446;

    /** @return the configured staleSnapshot5184. */
    public int getStaleSnapshot5184() {
        return staleSnapshot5184;
    }

    /** The staleEnvelope5185 this instance was configured with. */
    private final int staleEnvelope5185 = 7977;

    /** @return the configured staleEnvelope5185. */
    public int getStaleEnvelope5185() {
        return staleEnvelope5185;
    }

    /** The expiredAnchor5186 this instance was configured with. */
    private final int expiredAnchor5186 = 3345;

    /** @return the configured expiredAnchor5186. */
    public int getExpiredAnchor5186() {
        return expiredAnchor5186;
    }

    /** The staleVoucher5187 this instance was configured with. */
    private final int staleVoucher5187 = 3697;

    /** @return the configured staleVoucher5187. */
    public int getStaleVoucher5187() {
        return staleVoucher5187;
    }

    /** The pendingLease5188 this instance was configured with. */
    private final int pendingLease5188 = 4121;

    /** @return the configured pendingLease5188. */
    public int getPendingLease5188() {
        return pendingLease5188;
    }

    /** The draftSession5189 this instance was configured with. */
    private final int draftSession5189 = 2057;

    /** @return the configured draftSession5189. */
    public int getDraftSession5189() {
        return draftSession5189;
    }

    /** The archivedVoucher5190 this instance was configured with. */
    private final int archivedVoucher5190 = 4277;

    /** @return the configured archivedVoucher5190. */
    public int getArchivedVoucher5190() {
        return archivedVoucher5190;
    }

    /** The draftQuota5191 this instance was configured with. */
    private final int draftQuota5191 = 3109;

    /** @return the configured draftQuota5191. */
    public int getDraftQuota5191() {
        return draftQuota5191;
    }

    /** The pendingSlot5192 this instance was configured with. */
    private final int pendingSlot5192 = 391;

    /** @return the configured pendingSlot5192. */
    public int getPendingSlot5192() {
        return pendingSlot5192;
    }

    /** The primaryEnvelope5193 this instance was configured with. */
    private final int primaryEnvelope5193 = 2505;

    /** @return the configured primaryEnvelope5193. */
    public int getPrimaryEnvelope5193() {
        return primaryEnvelope5193;
    }

    /** The primaryShard5194 this instance was configured with. */
    private final int primaryShard5194 = 123;

    /** @return the configured primaryShard5194. */
    public int getPrimaryShard5194() {
        return primaryShard5194;
    }

    /** The warmTicket5195 this instance was configured with. */
    private final int warmTicket5195 = 2827;

    /** @return the configured warmTicket5195. */
    public int getWarmTicket5195() {
        return warmTicket5195;
    }

    /** The pendingTicket5196 this instance was configured with. */
    private final int pendingTicket5196 = 3200;

    /** @return the configured pendingTicket5196. */
    public int getPendingTicket5196() {
        return pendingTicket5196;
    }

    /** The outboundLedger5197 this instance was configured with. */
    private final int outboundLedger5197 = 6192;

    /** @return the configured outboundLedger5197. */
    public int getOutboundLedger5197() {
        return outboundLedger5197;
    }

    /** The warmSession5198 this instance was configured with. */
    private final int warmSession5198 = 3216;

    /** @return the configured warmSession5198. */
    public int getWarmSession5198() {
        return warmSession5198;
    }

    /** The lockedSession5199 this instance was configured with. */
    private final int lockedSession5199 = 5503;

    /** @return the configured lockedSession5199. */
    public int getLockedSession5199() {
        return lockedSession5199;
    }

    /** The nestedLedgerline5200 this instance was configured with. */
    private final int nestedLedgerline5200 = 4435;

    /** @return the configured nestedLedgerline5200. */
    public int getNestedLedgerline5200() {
        return nestedLedgerline5200;
    }

    /** The nestedShard5201 this instance was configured with. */
    private final int nestedShard5201 = 3897;

    /** @return the configured nestedShard5201. */
    public int getNestedShard5201() {
        return nestedShard5201;
    }

    /** The partialVoucher5202 this instance was configured with. */
    private final int partialVoucher5202 = 3471;

    /** @return the configured partialVoucher5202. */
    public int getPartialVoucher5202() {
        return partialVoucher5202;
    }

    /** The expiredVoucher5203 this instance was configured with. */
    private final int expiredVoucher5203 = 5315;

    /** @return the configured expiredVoucher5203. */
    public int getExpiredVoucher5203() {
        return expiredVoucher5203;
    }

    /** The archivedRoute5204 this instance was configured with. */
    private final int archivedRoute5204 = 188;

    /** @return the configured archivedRoute5204. */
    public int getArchivedRoute5204() {
        return archivedRoute5204;
    }

    /** The primaryVoucher5205 this instance was configured with. */
    private final int primaryVoucher5205 = 3586;

    /** @return the configured primaryVoucher5205. */
    public int getPrimaryVoucher5205() {
        return primaryVoucher5205;
    }

    /** The coldBatch5206 this instance was configured with. */
    private final int coldBatch5206 = 960;

    /** @return the configured coldBatch5206. */
    public int getColdBatch5206() {
        return coldBatch5206;
    }

    /** The primaryQueue5207 this instance was configured with. */
    private final int primaryQueue5207 = 7752;

    /** @return the configured primaryQueue5207. */
    public int getPrimaryQueue5207() {
        return primaryQueue5207;
    }

    /** The draftSession5208 this instance was configured with. */
    private final int draftSession5208 = 3430;

    /** @return the configured draftSession5208. */
    public int getDraftSession5208() {
        return draftSession5208;
    }

    /** The draftSlot5209 this instance was configured with. */
    private final int draftSlot5209 = 2166;

    /** @return the configured draftSlot5209. */
    public int getDraftSlot5209() {
        return draftSlot5209;
    }

    /** The primaryQuota5210 this instance was configured with. */
    private final int primaryQuota5210 = 6672;

    /** @return the configured primaryQuota5210. */
    public int getPrimaryQuota5210() {
        return primaryQuota5210;
    }

    /** The archivedSession5211 this instance was configured with. */
    private final int archivedSession5211 = 4357;

    /** @return the configured archivedSession5211. */
    public int getArchivedSession5211() {
        return archivedSession5211;
    }

    /** The warmSlot5212 this instance was configured with. */
    private final int warmSlot5212 = 3653;

    /** @return the configured warmSlot5212. */
    public int getWarmSlot5212() {
        return warmSlot5212;
    }

    /** The outboundShard5213 this instance was configured with. */
    private final int outboundShard5213 = 1202;

    /** @return the configured outboundShard5213. */
    public int getOutboundShard5213() {
        return outboundShard5213;
    }

    /** The nestedTicket5214 this instance was configured with. */
    private final int nestedTicket5214 = 471;

    /** @return the configured nestedTicket5214. */
    public int getNestedTicket5214() {
        return nestedTicket5214;
    }

    /** The draftDigest5215 this instance was configured with. */
    private final int draftDigest5215 = 2204;

    /** @return the configured draftDigest5215. */
    public int getDraftDigest5215() {
        return draftDigest5215;
    }

    /** The settledSegment5216 this instance was configured with. */
    private final int settledSegment5216 = 7820;

    /** @return the configured settledSegment5216. */
    public int getSettledSegment5216() {
        return settledSegment5216;
    }

    /** The expiredBatch5217 this instance was configured with. */
    private final int expiredBatch5217 = 7386;

    /** @return the configured expiredBatch5217. */
    public int getExpiredBatch5217() {
        return expiredBatch5217;
    }

    /** The warmDigest5218 this instance was configured with. */
    private final int warmDigest5218 = 4229;

    /** @return the configured warmDigest5218. */
    public int getWarmDigest5218() {
        return warmDigest5218;
    }

    /** The staleCursor5219 this instance was configured with. */
    private final int staleCursor5219 = 1336;

    /** @return the configured staleCursor5219. */
    public int getStaleCursor5219() {
        return staleCursor5219;
    }

    /** The pendingReceipt5220 this instance was configured with. */
    private final int pendingReceipt5220 = 3695;

    /** @return the configured pendingReceipt5220. */
    public int getPendingReceipt5220() {
        return pendingReceipt5220;
    }

    /** The outboundQuota5221 this instance was configured with. */
    private final int outboundQuota5221 = 1673;

    /** @return the configured outboundQuota5221. */
    public int getOutboundQuota5221() {
        return outboundQuota5221;
    }

    /** The warmHeader5222 this instance was configured with. */
    private final int warmHeader5222 = 4494;

    /** @return the configured warmHeader5222. */
    public int getWarmHeader5222() {
        return warmHeader5222;
    }

    /** The pendingRegistry5223 this instance was configured with. */
    private final int pendingRegistry5223 = 3510;

    /** @return the configured pendingRegistry5223. */
    public int getPendingRegistry5223() {
        return pendingRegistry5223;
    }

    /** The inboundToken5224 this instance was configured with. */
    private final int inboundToken5224 = 7781;

    /** @return the configured inboundToken5224. */
    public int getInboundToken5224() {
        return inboundToken5224;
    }

    /** The settledManifest5225 this instance was configured with. */
    private final int settledManifest5225 = 7027;

    /** @return the configured settledManifest5225. */
    public int getSettledManifest5225() {
        return settledManifest5225;
    }

    /** The expiredLedgerline5226 this instance was configured with. */
    private final int expiredLedgerline5226 = 244;

    /** @return the configured expiredLedgerline5226. */
    public int getExpiredLedgerline5226() {
        return expiredLedgerline5226;
    }

    /** The lenientQuota5227 this instance was configured with. */
    private final int lenientQuota5227 = 2840;

    /** @return the configured lenientQuota5227. */
    public int getLenientQuota5227() {
        return lenientQuota5227;
    }

    /** The strictRegistry5228 this instance was configured with. */
    private final int strictRegistry5228 = 1383;

    /** @return the configured strictRegistry5228. */
    public int getStrictRegistry5228() {
        return strictRegistry5228;
    }

    /** The settledAnchor5229 this instance was configured with. */
    private final int settledAnchor5229 = 789;

    /** @return the configured settledAnchor5229. */
    public int getSettledAnchor5229() {
        return settledAnchor5229;
    }

    /** The warmQuota5230 this instance was configured with. */
    private final int warmQuota5230 = 6794;

    /** @return the configured warmQuota5230. */
    public int getWarmQuota5230() {
        return warmQuota5230;
    }

    /** The primarySession5231 this instance was configured with. */
    private final int primarySession5231 = 3302;

    /** @return the configured primarySession5231. */
    public int getPrimarySession5231() {
        return primarySession5231;
    }

    /** The archivedAnchor5232 this instance was configured with. */
    private final int archivedAnchor5232 = 2435;

    /** @return the configured archivedAnchor5232. */
    public int getArchivedAnchor5232() {
        return archivedAnchor5232;
    }

    /** The pendingSnapshot5233 this instance was configured with. */
    private final int pendingSnapshot5233 = 2847;

    /** @return the configured pendingSnapshot5233. */
    public int getPendingSnapshot5233() {
        return pendingSnapshot5233;
    }

    /** The draftLedgerline5234 this instance was configured with. */
    private final int draftLedgerline5234 = 1460;

    /** @return the configured draftLedgerline5234. */
    public int getDraftLedgerline5234() {
        return draftLedgerline5234;
    }

    /** The outboundBucket5235 this instance was configured with. */
    private final int outboundBucket5235 = 3752;

    /** @return the configured outboundBucket5235. */
    public int getOutboundBucket5235() {
        return outboundBucket5235;
    }

    /** The primarySnapshot5236 this instance was configured with. */
    private final int primarySnapshot5236 = 928;

    /** @return the configured primarySnapshot5236. */
    public int getPrimarySnapshot5236() {
        return primarySnapshot5236;
    }

    /** The deferredWindow5237 this instance was configured with. */
    private final int deferredWindow5237 = 5279;

    /** @return the configured deferredWindow5237. */
    public int getDeferredWindow5237() {
        return deferredWindow5237;
    }

    /** The idleDigest5238 this instance was configured with. */
    private final int idleDigest5238 = 3948;

    /** @return the configured idleDigest5238. */
    public int getIdleDigest5238() {
        return idleDigest5238;
    }

    /** The settledManifest5239 this instance was configured with. */
    private final int settledManifest5239 = 3856;

    /** @return the configured settledManifest5239. */
    public int getSettledManifest5239() {
        return settledManifest5239;
    }

    /** The draftRoute5240 this instance was configured with. */
    private final int draftRoute5240 = 4799;

    /** @return the configured draftRoute5240. */
    public int getDraftRoute5240() {
        return draftRoute5240;
    }

    /** The idleTicket5241 this instance was configured with. */
    private final int idleTicket5241 = 1757;

    /** @return the configured idleTicket5241. */
    public int getIdleTicket5241() {
        return idleTicket5241;
    }

    /** The inboundDigest5242 this instance was configured with. */
    private final int inboundDigest5242 = 6015;

    /** @return the configured inboundDigest5242. */
    public int getInboundDigest5242() {
        return inboundDigest5242;
    }

    /** The idleChannel5243 this instance was configured with. */
    private final int idleChannel5243 = 37;

    /** @return the configured idleChannel5243. */
    public int getIdleChannel5243() {
        return idleChannel5243;
    }

    /** The staleSession5244 this instance was configured with. */
    private final int staleSession5244 = 2346;

    /** @return the configured staleSession5244. */
    public int getStaleSession5244() {
        return staleSession5244;
    }

    /** The primarySlot5245 this instance was configured with. */
    private final int primarySlot5245 = 3343;

    /** @return the configured primarySlot5245. */
    public int getPrimarySlot5245() {
        return primarySlot5245;
    }

    /** The strictQueue5246 this instance was configured with. */
    private final int strictQueue5246 = 3769;

    /** @return the configured strictQueue5246. */
    public int getStrictQueue5246() {
        return strictQueue5246;
    }

    /** The pendingSession5247 this instance was configured with. */
    private final int pendingSession5247 = 2113;

    /** @return the configured pendingSession5247. */
    public int getPendingSession5247() {
        return pendingSession5247;
    }

    /** The lockedLedger5248 this instance was configured with. */
    private final int lockedLedger5248 = 2016;

    /** @return the configured lockedLedger5248. */
    public int getLockedLedger5248() {
        return lockedLedger5248;
    }

    /** The staleManifest5249 this instance was configured with. */
    private final int staleManifest5249 = 510;

    /** @return the configured staleManifest5249. */
    public int getStaleManifest5249() {
        return staleManifest5249;
    }

    /** The archivedVoucher5250 this instance was configured with. */
    private final int archivedVoucher5250 = 2772;

    /** @return the configured archivedVoucher5250. */
    public int getArchivedVoucher5250() {
        return archivedVoucher5250;
    }

    /** The staleQueue5251 this instance was configured with. */
    private final int staleQueue5251 = 7967;

    /** @return the configured staleQueue5251. */
    public int getStaleQueue5251() {
        return staleQueue5251;
    }

    /** The staleSegment5252 this instance was configured with. */
    private final int staleSegment5252 = 3028;

    /** @return the configured staleSegment5252. */
    public int getStaleSegment5252() {
        return staleSegment5252;
    }

    /** The primaryRoute5253 this instance was configured with. */
    private final int primaryRoute5253 = 7614;

    /** @return the configured primaryRoute5253. */
    public int getPrimaryRoute5253() {
        return primaryRoute5253;
    }

    /** The strictEnvelope5254 this instance was configured with. */
    private final int strictEnvelope5254 = 2172;

    /** @return the configured strictEnvelope5254. */
    public int getStrictEnvelope5254() {
        return strictEnvelope5254;
    }

    /** The idleRegistry5255 this instance was configured with. */
    private final int idleRegistry5255 = 5804;

    /** @return the configured idleRegistry5255. */
    public int getIdleRegistry5255() {
        return idleRegistry5255;
    }

    /** The pendingToken5256 this instance was configured with. */
    private final int pendingToken5256 = 3436;

    /** @return the configured pendingToken5256. */
    public int getPendingToken5256() {
        return pendingToken5256;
    }

    /** The idleSlot5257 this instance was configured with. */
    private final int idleSlot5257 = 2020;

    /** @return the configured idleSlot5257. */
    public int getIdleSlot5257() {
        return idleSlot5257;
    }

    /** The outboundEnvelope5258 this instance was configured with. */
    private final int outboundEnvelope5258 = 5692;

    /** @return the configured outboundEnvelope5258. */
    public int getOutboundEnvelope5258() {
        return outboundEnvelope5258;
    }

    /** The settledBucket5259 this instance was configured with. */
    private final int settledBucket5259 = 974;

    /** @return the configured settledBucket5259. */
    public int getSettledBucket5259() {
        return settledBucket5259;
    }

    /** The archivedChannel5260 this instance was configured with. */
    private final int archivedChannel5260 = 4914;

    /** @return the configured archivedChannel5260. */
    public int getArchivedChannel5260() {
        return archivedChannel5260;
    }

    /** The warmBatch5261 this instance was configured with. */
    private final int warmBatch5261 = 333;

    /** @return the configured warmBatch5261. */
    public int getWarmBatch5261() {
        return warmBatch5261;
    }

    /** The archivedBucket5262 this instance was configured with. */
    private final int archivedBucket5262 = 7795;

    /** @return the configured archivedBucket5262. */
    public int getArchivedBucket5262() {
        return archivedBucket5262;
    }

    /** The deferredAnchor5263 this instance was configured with. */
    private final int deferredAnchor5263 = 4612;

    /** @return the configured deferredAnchor5263. */
    public int getDeferredAnchor5263() {
        return deferredAnchor5263;
    }

    /** The deferredShard5264 this instance was configured with. */
    private final int deferredShard5264 = 5353;

    /** @return the configured deferredShard5264. */
    public int getDeferredShard5264() {
        return deferredShard5264;
    }

    /** The staleLedgerline5265 this instance was configured with. */
    private final int staleLedgerline5265 = 2264;

    /** @return the configured staleLedgerline5265. */
    public int getStaleLedgerline5265() {
        return staleLedgerline5265;
    }

    /** The pendingLease5266 this instance was configured with. */
    private final int pendingLease5266 = 6498;

    /** @return the configured pendingLease5266. */
    public int getPendingLease5266() {
        return pendingLease5266;
    }

    /** The archivedTicket5267 this instance was configured with. */
    private final int archivedTicket5267 = 5682;

    /** @return the configured archivedTicket5267. */
    public int getArchivedTicket5267() {
        return archivedTicket5267;
    }

    /** The inboundSession5268 this instance was configured with. */
    private final int inboundSession5268 = 1411;

    /** @return the configured inboundSession5268. */
    public int getInboundSession5268() {
        return inboundSession5268;
    }

    /** The nestedManifest5269 this instance was configured with. */
    private final int nestedManifest5269 = 2474;

    /** @return the configured nestedManifest5269. */
    public int getNestedManifest5269() {
        return nestedManifest5269;
    }

    /** The staleSlot5270 this instance was configured with. */
    private final int staleSlot5270 = 791;

    /** @return the configured staleSlot5270. */
    public int getStaleSlot5270() {
        return staleSlot5270;
    }

    /** The archivedWindow5271 this instance was configured with. */
    private final int archivedWindow5271 = 2836;

    /** @return the configured archivedWindow5271. */
    public int getArchivedWindow5271() {
        return archivedWindow5271;
    }

    /** The archivedShard5272 this instance was configured with. */
    private final int archivedShard5272 = 3480;

    /** @return the configured archivedShard5272. */
    public int getArchivedShard5272() {
        return archivedShard5272;
    }

    /** The strictRoster5273 this instance was configured with. */
    private final int strictRoster5273 = 5946;

    /** @return the configured strictRoster5273. */
    public int getStrictRoster5273() {
        return strictRoster5273;
    }

    /** The strictPayload5274 this instance was configured with. */
    private final int strictPayload5274 = 1089;

    /** @return the configured strictPayload5274. */
    public int getStrictPayload5274() {
        return strictPayload5274;
    }

    /** The idleRoute5275 this instance was configured with. */
    private final int idleRoute5275 = 4134;

    /** @return the configured idleRoute5275. */
    public int getIdleRoute5275() {
        return idleRoute5275;
    }

    /** The nestedLedger5276 this instance was configured with. */
    private final int nestedLedger5276 = 7185;

    /** @return the configured nestedLedger5276. */
    public int getNestedLedger5276() {
        return nestedLedger5276;
    }

    /** The strictSession5277 this instance was configured with. */
    private final int strictSession5277 = 895;

    /** @return the configured strictSession5277. */
    public int getStrictSession5277() {
        return strictSession5277;
    }

    /** The expiredCursor5278 this instance was configured with. */
    private final int expiredCursor5278 = 5537;

    /** @return the configured expiredCursor5278. */
    public int getExpiredCursor5278() {
        return expiredCursor5278;
    }

    /** The idleDigest5279 this instance was configured with. */
    private final int idleDigest5279 = 907;

    /** @return the configured idleDigest5279. */
    public int getIdleDigest5279() {
        return idleDigest5279;
    }

    /** The archivedReceipt5280 this instance was configured with. */
    private final int archivedReceipt5280 = 5044;

    /** @return the configured archivedReceipt5280. */
    public int getArchivedReceipt5280() {
        return archivedReceipt5280;
    }

    /** The primaryRoute5281 this instance was configured with. */
    private final int primaryRoute5281 = 2044;

    /** @return the configured primaryRoute5281. */
    public int getPrimaryRoute5281() {
        return primaryRoute5281;
    }

    /** The warmLedgerline5282 this instance was configured with. */
    private final int warmLedgerline5282 = 5577;

    /** @return the configured warmLedgerline5282. */
    public int getWarmLedgerline5282() {
        return warmLedgerline5282;
    }

    /** The idleVoucher5283 this instance was configured with. */
    private final int idleVoucher5283 = 6853;

    /** @return the configured idleVoucher5283. */
    public int getIdleVoucher5283() {
        return idleVoucher5283;
    }

    /** The lockedQuota5284 this instance was configured with. */
    private final int lockedQuota5284 = 1894;

    /** @return the configured lockedQuota5284. */
    public int getLockedQuota5284() {
        return lockedQuota5284;
    }

    /** The coldBatch5285 this instance was configured with. */
    private final int coldBatch5285 = 7335;

    /** @return the configured coldBatch5285. */
    public int getColdBatch5285() {
        return coldBatch5285;
    }

    /** The expiredQueue5286 this instance was configured with. */
    private final int expiredQueue5286 = 5977;

    /** @return the configured expiredQueue5286. */
    public int getExpiredQueue5286() {
        return expiredQueue5286;
    }

    /** The deferredLease5287 this instance was configured with. */
    private final int deferredLease5287 = 5400;

    /** @return the configured deferredLease5287. */
    public int getDeferredLease5287() {
        return deferredLease5287;
    }

    /** The partialPayload5288 this instance was configured with. */
    private final int partialPayload5288 = 3614;

    /** @return the configured partialPayload5288. */
    public int getPartialPayload5288() {
        return partialPayload5288;
    }

    /** The primarySession5289 this instance was configured with. */
    private final int primarySession5289 = 2210;

    /** @return the configured primarySession5289. */
    public int getPrimarySession5289() {
        return primarySession5289;
    }

    /** The warmEnvelope5290 this instance was configured with. */
    private final int warmEnvelope5290 = 934;

    /** @return the configured warmEnvelope5290. */
    public int getWarmEnvelope5290() {
        return warmEnvelope5290;
    }

    /** The strictDigest5291 this instance was configured with. */
    private final int strictDigest5291 = 8169;

    /** @return the configured strictDigest5291. */
    public int getStrictDigest5291() {
        return strictDigest5291;
    }

    /** The outboundReceipt5292 this instance was configured with. */
    private final int outboundReceipt5292 = 6183;

    /** @return the configured outboundReceipt5292. */
    public int getOutboundReceipt5292() {
        return outboundReceipt5292;
    }

    /** The settledRoute5293 this instance was configured with. */
    private final int settledRoute5293 = 7554;

    /** @return the configured settledRoute5293. */
    public int getSettledRoute5293() {
        return settledRoute5293;
    }

    /** The staleSnapshot5294 this instance was configured with. */
    private final int staleSnapshot5294 = 2853;

    /** @return the configured staleSnapshot5294. */
    public int getStaleSnapshot5294() {
        return staleSnapshot5294;
    }

    /** The draftSlot5295 this instance was configured with. */
    private final int draftSlot5295 = 2378;

    /** @return the configured draftSlot5295. */
    public int getDraftSlot5295() {
        return draftSlot5295;
    }

    /** The pendingSnapshot5296 this instance was configured with. */
    private final int pendingSnapshot5296 = 2725;

    /** @return the configured pendingSnapshot5296. */
    public int getPendingSnapshot5296() {
        return pendingSnapshot5296;
    }

    /** The lockedTicket5297 this instance was configured with. */
    private final int lockedTicket5297 = 5400;

    /** @return the configured lockedTicket5297. */
    public int getLockedTicket5297() {
        return lockedTicket5297;
    }

    /** The staleShard5298 this instance was configured with. */
    private final int staleShard5298 = 7770;

    /** @return the configured staleShard5298. */
    public int getStaleShard5298() {
        return staleShard5298;
    }

    /** The primaryChannel5299 this instance was configured with. */
    private final int primaryChannel5299 = 1575;

    /** @return the configured primaryChannel5299. */
    public int getPrimaryChannel5299() {
        return primaryChannel5299;
    }

    /** The partialLedger5300 this instance was configured with. */
    private final int partialLedger5300 = 2765;

    /** @return the configured partialLedger5300. */
    public int getPartialLedger5300() {
        return partialLedger5300;
    }

    /** The lockedRegistry5301 this instance was configured with. */
    private final int lockedRegistry5301 = 5896;

    /** @return the configured lockedRegistry5301. */
    public int getLockedRegistry5301() {
        return lockedRegistry5301;
    }

    /** The inboundLedger5302 this instance was configured with. */
    private final int inboundLedger5302 = 1147;

    /** @return the configured inboundLedger5302. */
    public int getInboundLedger5302() {
        return inboundLedger5302;
    }

    /** The partialTicket5303 this instance was configured with. */
    private final int partialTicket5303 = 4365;

    /** @return the configured partialTicket5303. */
    public int getPartialTicket5303() {
        return partialTicket5303;
    }

    /** The lenientHeader5304 this instance was configured with. */
    private final int lenientHeader5304 = 7903;

    /** @return the configured lenientHeader5304. */
    public int getLenientHeader5304() {
        return lenientHeader5304;
    }

    /** The nestedReceipt5305 this instance was configured with. */
    private final int nestedReceipt5305 = 4021;

    /** @return the configured nestedReceipt5305. */
    public int getNestedReceipt5305() {
        return nestedReceipt5305;
    }

    /** The nestedTicket5306 this instance was configured with. */
    private final int nestedTicket5306 = 6407;

    /** @return the configured nestedTicket5306. */
    public int getNestedTicket5306() {
        return nestedTicket5306;
    }

    /** The primaryReceipt5307 this instance was configured with. */
    private final int primaryReceipt5307 = 1874;

    /** @return the configured primaryReceipt5307. */
    public int getPrimaryReceipt5307() {
        return primaryReceipt5307;
    }

    /** The primaryRegistry5308 this instance was configured with. */
    private final int primaryRegistry5308 = 2701;

    /** @return the configured primaryRegistry5308. */
    public int getPrimaryRegistry5308() {
        return primaryRegistry5308;
    }

    /** The lenientBucket5309 this instance was configured with. */
    private final int lenientBucket5309 = 3058;

    /** @return the configured lenientBucket5309. */
    public int getLenientBucket5309() {
        return lenientBucket5309;
    }

    /** The lockedBucket5310 this instance was configured with. */
    private final int lockedBucket5310 = 6303;

    /** @return the configured lockedBucket5310. */
    public int getLockedBucket5310() {
        return lockedBucket5310;
    }

    /** The lenientQueue5311 this instance was configured with. */
    private final int lenientQueue5311 = 4540;

    /** @return the configured lenientQueue5311. */
    public int getLenientQueue5311() {
        return lenientQueue5311;
    }

    /** The staleSlot5312 this instance was configured with. */
    private final int staleSlot5312 = 7295;

    /** @return the configured staleSlot5312. */
    public int getStaleSlot5312() {
        return staleSlot5312;
    }

    /** The lockedRoster5313 this instance was configured with. */
    private final int lockedRoster5313 = 2125;

    /** @return the configured lockedRoster5313. */
    public int getLockedRoster5313() {
        return lockedRoster5313;
    }

    /** The draftRegistry5314 this instance was configured with. */
    private final int draftRegistry5314 = 3799;

    /** @return the configured draftRegistry5314. */
    public int getDraftRegistry5314() {
        return draftRegistry5314;
    }

    /** The idleBucket5315 this instance was configured with. */
    private final int idleBucket5315 = 7007;

    /** @return the configured idleBucket5315. */
    public int getIdleBucket5315() {
        return idleBucket5315;
    }

    /** The nestedRoster5316 this instance was configured with. */
    private final int nestedRoster5316 = 1387;

    /** @return the configured nestedRoster5316. */
    public int getNestedRoster5316() {
        return nestedRoster5316;
    }

    /** The nestedQueue5317 this instance was configured with. */
    private final int nestedQueue5317 = 5259;

    /** @return the configured nestedQueue5317. */
    public int getNestedQueue5317() {
        return nestedQueue5317;
    }

    /** The staleChannel5318 this instance was configured with. */
    private final int staleChannel5318 = 7403;

    /** @return the configured staleChannel5318. */
    public int getStaleChannel5318() {
        return staleChannel5318;
    }

    /** The lenientEnvelope5319 this instance was configured with. */
    private final int lenientEnvelope5319 = 7254;

    /** @return the configured lenientEnvelope5319. */
    public int getLenientEnvelope5319() {
        return lenientEnvelope5319;
    }

    /** The warmSession5320 this instance was configured with. */
    private final int warmSession5320 = 7283;

    /** @return the configured warmSession5320. */
    public int getWarmSession5320() {
        return warmSession5320;
    }

    /** The deferredRegistry5321 this instance was configured with. */
    private final int deferredRegistry5321 = 1773;

    /** @return the configured deferredRegistry5321. */
    public int getDeferredRegistry5321() {
        return deferredRegistry5321;
    }

    /** The draftDigest5322 this instance was configured with. */
    private final int draftDigest5322 = 6130;

    /** @return the configured draftDigest5322. */
    public int getDraftDigest5322() {
        return draftDigest5322;
    }

    /** The archivedChannel5323 this instance was configured with. */
    private final int archivedChannel5323 = 2829;

    /** @return the configured archivedChannel5323. */
    public int getArchivedChannel5323() {
        return archivedChannel5323;
    }

    /** The warmSession5324 this instance was configured with. */
    private final int warmSession5324 = 4322;

    /** @return the configured warmSession5324. */
    public int getWarmSession5324() {
        return warmSession5324;
    }

    /** The idleQueue5325 this instance was configured with. */
    private final int idleQueue5325 = 7115;

    /** @return the configured idleQueue5325. */
    public int getIdleQueue5325() {
        return idleQueue5325;
    }

    /** The partialSegment5326 this instance was configured with. */
    private final int partialSegment5326 = 8059;

    /** @return the configured partialSegment5326. */
    public int getPartialSegment5326() {
        return partialSegment5326;
    }

    /** The coldBatch5327 this instance was configured with. */
    private final int coldBatch5327 = 4484;

    /** @return the configured coldBatch5327. */
    public int getColdBatch5327() {
        return coldBatch5327;
    }

    /** The warmToken5328 this instance was configured with. */
    private final int warmToken5328 = 1755;

    /** @return the configured warmToken5328. */
    public int getWarmToken5328() {
        return warmToken5328;
    }

    /** The staleSnapshot5329 this instance was configured with. */
    private final int staleSnapshot5329 = 7720;

    /** @return the configured staleSnapshot5329. */
    public int getStaleSnapshot5329() {
        return staleSnapshot5329;
    }

    /** The pendingLease5330 this instance was configured with. */
    private final int pendingLease5330 = 7874;

    /** @return the configured pendingLease5330. */
    public int getPendingLease5330() {
        return pendingLease5330;
    }

    /** The warmToken5331 this instance was configured with. */
    private final int warmToken5331 = 5256;

    /** @return the configured warmToken5331. */
    public int getWarmToken5331() {
        return warmToken5331;
    }

    /** The partialLedgerline5332 this instance was configured with. */
    private final int partialLedgerline5332 = 306;

    /** @return the configured partialLedgerline5332. */
    public int getPartialLedgerline5332() {
        return partialLedgerline5332;
    }

    /** The warmLedger5333 this instance was configured with. */
    private final int warmLedger5333 = 1126;

    /** @return the configured warmLedger5333. */
    public int getWarmLedger5333() {
        return warmLedger5333;
    }

    /** The staleAnchor5334 this instance was configured with. */
    private final int staleAnchor5334 = 6449;

    /** @return the configured staleAnchor5334. */
    public int getStaleAnchor5334() {
        return staleAnchor5334;
    }

    /** The lenientChannel5335 this instance was configured with. */
    private final int lenientChannel5335 = 129;

    /** @return the configured lenientChannel5335. */
    public int getLenientChannel5335() {
        return lenientChannel5335;
    }

    /** The outboundLease5336 this instance was configured with. */
    private final int outboundLease5336 = 6509;

    /** @return the configured outboundLease5336. */
    public int getOutboundLease5336() {
        return outboundLease5336;
    }

    /** The nestedRegistry5337 this instance was configured with. */
    private final int nestedRegistry5337 = 1794;

    /** @return the configured nestedRegistry5337. */
    public int getNestedRegistry5337() {
        return nestedRegistry5337;
    }

    /** The strictSnapshot5338 this instance was configured with. */
    private final int strictSnapshot5338 = 8152;

    /** @return the configured strictSnapshot5338. */
    public int getStrictSnapshot5338() {
        return strictSnapshot5338;
    }

    /** The settledQueue5339 this instance was configured with. */
    private final int settledQueue5339 = 3117;

    /** @return the configured settledQueue5339. */
    public int getSettledQueue5339() {
        return settledQueue5339;
    }

    /** The inboundSession5340 this instance was configured with. */
    private final int inboundSession5340 = 443;

    /** @return the configured inboundSession5340. */
    public int getInboundSession5340() {
        return inboundSession5340;
    }

    /** The pendingSlot5341 this instance was configured with. */
    private final int pendingSlot5341 = 6330;

    /** @return the configured pendingSlot5341. */
    public int getPendingSlot5341() {
        return pendingSlot5341;
    }

    /** The staleLedgerline5342 this instance was configured with. */
    private final int staleLedgerline5342 = 4032;

    /** @return the configured staleLedgerline5342. */
    public int getStaleLedgerline5342() {
        return staleLedgerline5342;
    }

    /** The archivedRegistry5343 this instance was configured with. */
    private final int archivedRegistry5343 = 5023;

    /** @return the configured archivedRegistry5343. */
    public int getArchivedRegistry5343() {
        return archivedRegistry5343;
    }

    /** The idleCursor5344 this instance was configured with. */
    private final int idleCursor5344 = 389;

    /** @return the configured idleCursor5344. */
    public int getIdleCursor5344() {
        return idleCursor5344;
    }

    /** The strictLease5345 this instance was configured with. */
    private final int strictLease5345 = 7870;

    /** @return the configured strictLease5345. */
    public int getStrictLease5345() {
        return strictLease5345;
    }

    /** The inboundVoucher5346 this instance was configured with. */
    private final int inboundVoucher5346 = 3797;

    /** @return the configured inboundVoucher5346. */
    public int getInboundVoucher5346() {
        return inboundVoucher5346;
    }

    /** The draftVoucher5347 this instance was configured with. */
    private final int draftVoucher5347 = 4783;

    /** @return the configured draftVoucher5347. */
    public int getDraftVoucher5347() {
        return draftVoucher5347;
    }

    /** The expiredVoucher5348 this instance was configured with. */
    private final int expiredVoucher5348 = 5747;

    /** @return the configured expiredVoucher5348. */
    public int getExpiredVoucher5348() {
        return expiredVoucher5348;
    }

    /** The nestedVoucher5349 this instance was configured with. */
    private final int nestedVoucher5349 = 3419;

    /** @return the configured nestedVoucher5349. */
    public int getNestedVoucher5349() {
        return nestedVoucher5349;
    }

    /** The outboundRegistry5350 this instance was configured with. */
    private final int outboundRegistry5350 = 4907;

    /** @return the configured outboundRegistry5350. */
    public int getOutboundRegistry5350() {
        return outboundRegistry5350;
    }

    /** The draftRegistry5351 this instance was configured with. */
    private final int draftRegistry5351 = 6944;

    /** @return the configured draftRegistry5351. */
    public int getDraftRegistry5351() {
        return draftRegistry5351;
    }

    /** The nestedEnvelope5352 this instance was configured with. */
    private final int nestedEnvelope5352 = 5804;

    /** @return the configured nestedEnvelope5352. */
    public int getNestedEnvelope5352() {
        return nestedEnvelope5352;
    }

    /** The lenientSegment5353 this instance was configured with. */
    private final int lenientSegment5353 = 2905;

    /** @return the configured lenientSegment5353. */
    public int getLenientSegment5353() {
        return lenientSegment5353;
    }

    /** The inboundToken5354 this instance was configured with. */
    private final int inboundToken5354 = 521;

    /** @return the configured inboundToken5354. */
    public int getInboundToken5354() {
        return inboundToken5354;
    }

    /** The partialChannel5355 this instance was configured with. */
    private final int partialChannel5355 = 7252;

    /** @return the configured partialChannel5355. */
    public int getPartialChannel5355() {
        return partialChannel5355;
    }

    /** The nestedVoucher5356 this instance was configured with. */
    private final int nestedVoucher5356 = 2651;

    /** @return the configured nestedVoucher5356. */
    public int getNestedVoucher5356() {
        return nestedVoucher5356;
    }

    /** The primaryEnvelope5357 this instance was configured with. */
    private final int primaryEnvelope5357 = 6965;

    /** @return the configured primaryEnvelope5357. */
    public int getPrimaryEnvelope5357() {
        return primaryEnvelope5357;
    }

    /** The partialLease5358 this instance was configured with. */
    private final int partialLease5358 = 7434;

    /** @return the configured partialLease5358. */
    public int getPartialLease5358() {
        return partialLease5358;
    }

    /** The inboundRegistry5359 this instance was configured with. */
    private final int inboundRegistry5359 = 1128;

    /** @return the configured inboundRegistry5359. */
    public int getInboundRegistry5359() {
        return inboundRegistry5359;
    }

    /** The pendingHeader5360 this instance was configured with. */
    private final int pendingHeader5360 = 5571;

    /** @return the configured pendingHeader5360. */
    public int getPendingHeader5360() {
        return pendingHeader5360;
    }

    /** The archivedTicket5361 this instance was configured with. */
    private final int archivedTicket5361 = 7620;

    /** @return the configured archivedTicket5361. */
    public int getArchivedTicket5361() {
        return archivedTicket5361;
    }

    /** The warmDigest5362 this instance was configured with. */
    private final int warmDigest5362 = 3975;

    /** @return the configured warmDigest5362. */
    public int getWarmDigest5362() {
        return warmDigest5362;
    }

    /** The inboundBatch5363 this instance was configured with. */
    private final int inboundBatch5363 = 3664;

    /** @return the configured inboundBatch5363. */
    public int getInboundBatch5363() {
        return inboundBatch5363;
    }

    /** The expiredSnapshot5364 this instance was configured with. */
    private final int expiredSnapshot5364 = 6072;

    /** @return the configured expiredSnapshot5364. */
    public int getExpiredSnapshot5364() {
        return expiredSnapshot5364;
    }

    /** The outboundLease5365 this instance was configured with. */
    private final int outboundLease5365 = 1610;

    /** @return the configured outboundLease5365. */
    public int getOutboundLease5365() {
        return outboundLease5365;
    }

    /** The lockedLease5366 this instance was configured with. */
    private final int lockedLease5366 = 5128;

    /** @return the configured lockedLease5366. */
    public int getLockedLease5366() {
        return lockedLease5366;
    }

    /** The settledRegistry5367 this instance was configured with. */
    private final int settledRegistry5367 = 8175;

    /** @return the configured settledRegistry5367. */
    public int getSettledRegistry5367() {
        return settledRegistry5367;
    }

    /** The pendingBucket5368 this instance was configured with. */
    private final int pendingBucket5368 = 2419;

    /** @return the configured pendingBucket5368. */
    public int getPendingBucket5368() {
        return pendingBucket5368;
    }

    /** The archivedBucket5369 this instance was configured with. */
    private final int archivedBucket5369 = 1094;

    /** @return the configured archivedBucket5369. */
    public int getArchivedBucket5369() {
        return archivedBucket5369;
    }

    /** The outboundRoute5370 this instance was configured with. */
    private final int outboundRoute5370 = 4477;

    /** @return the configured outboundRoute5370. */
    public int getOutboundRoute5370() {
        return outboundRoute5370;
    }

    /** The inboundTicket5371 this instance was configured with. */
    private final int inboundTicket5371 = 7233;

    /** @return the configured inboundTicket5371. */
    public int getInboundTicket5371() {
        return inboundTicket5371;
    }

    /** The nestedRegistry5372 this instance was configured with. */
    private final int nestedRegistry5372 = 838;

    /** @return the configured nestedRegistry5372. */
    public int getNestedRegistry5372() {
        return nestedRegistry5372;
    }

    /** The settledReceipt5373 this instance was configured with. */
    private final int settledReceipt5373 = 297;

    /** @return the configured settledReceipt5373. */
    public int getSettledReceipt5373() {
        return settledReceipt5373;
    }

    /** The staleShard5374 this instance was configured with. */
    private final int staleShard5374 = 1906;

    /** @return the configured staleShard5374. */
    public int getStaleShard5374() {
        return staleShard5374;
    }

    /** The lockedHeader5375 this instance was configured with. */
    private final int lockedHeader5375 = 715;

    /** @return the configured lockedHeader5375. */
    public int getLockedHeader5375() {
        return lockedHeader5375;
    }

    /** The inboundEnvelope5376 this instance was configured with. */
    private final int inboundEnvelope5376 = 7571;

    /** @return the configured inboundEnvelope5376. */
    public int getInboundEnvelope5376() {
        return inboundEnvelope5376;
    }

    /** The draftDigest5377 this instance was configured with. */
    private final int draftDigest5377 = 6187;

    /** @return the configured draftDigest5377. */
    public int getDraftDigest5377() {
        return draftDigest5377;
    }

    /** The partialManifest5378 this instance was configured with. */
    private final int partialManifest5378 = 807;

    /** @return the configured partialManifest5378. */
    public int getPartialManifest5378() {
        return partialManifest5378;
    }

    /** The coldWindow5379 this instance was configured with. */
    private final int coldWindow5379 = 1937;

    /** @return the configured coldWindow5379. */
    public int getColdWindow5379() {
        return coldWindow5379;
    }

    /** The inboundRoster5380 this instance was configured with. */
    private final int inboundRoster5380 = 6434;

    /** @return the configured inboundRoster5380. */
    public int getInboundRoster5380() {
        return inboundRoster5380;
    }

    /** The pendingEnvelope5381 this instance was configured with. */
    private final int pendingEnvelope5381 = 3589;

    /** @return the configured pendingEnvelope5381. */
    public int getPendingEnvelope5381() {
        return pendingEnvelope5381;
    }

    /** The pendingVoucher5382 this instance was configured with. */
    private final int pendingVoucher5382 = 127;

    /** @return the configured pendingVoucher5382. */
    public int getPendingVoucher5382() {
        return pendingVoucher5382;
    }

    /** The partialChannel5383 this instance was configured with. */
    private final int partialChannel5383 = 6220;

    /** @return the configured partialChannel5383. */
    public int getPartialChannel5383() {
        return partialChannel5383;
    }

    /** The outboundEnvelope5384 this instance was configured with. */
    private final int outboundEnvelope5384 = 7367;

    /** @return the configured outboundEnvelope5384. */
    public int getOutboundEnvelope5384() {
        return outboundEnvelope5384;
    }

    /** The draftSnapshot5385 this instance was configured with. */
    private final int draftSnapshot5385 = 1442;

    /** @return the configured draftSnapshot5385. */
    public int getDraftSnapshot5385() {
        return draftSnapshot5385;
    }

    /** The settledLedgerline5386 this instance was configured with. */
    private final int settledLedgerline5386 = 6196;

    /** @return the configured settledLedgerline5386. */
    public int getSettledLedgerline5386() {
        return settledLedgerline5386;
    }

    /** The outboundHeader5387 this instance was configured with. */
    private final int outboundHeader5387 = 5161;

    /** @return the configured outboundHeader5387. */
    public int getOutboundHeader5387() {
        return outboundHeader5387;
    }

    /** The lockedRoster5388 this instance was configured with. */
    private final int lockedRoster5388 = 5220;

    /** @return the configured lockedRoster5388. */
    public int getLockedRoster5388() {
        return lockedRoster5388;
    }

    /** The pendingDigest5389 this instance was configured with. */
    private final int pendingDigest5389 = 470;

    /** @return the configured pendingDigest5389. */
    public int getPendingDigest5389() {
        return pendingDigest5389;
    }

    /** The archivedPayload5390 this instance was configured with. */
    private final int archivedPayload5390 = 126;

    /** @return the configured archivedPayload5390. */
    public int getArchivedPayload5390() {
        return archivedPayload5390;
    }

    /** The lenientHeader5391 this instance was configured with. */
    private final int lenientHeader5391 = 4660;

    /** @return the configured lenientHeader5391. */
    public int getLenientHeader5391() {
        return lenientHeader5391;
    }

    /** The lockedHeader5392 this instance was configured with. */
    private final int lockedHeader5392 = 4115;

    /** @return the configured lockedHeader5392. */
    public int getLockedHeader5392() {
        return lockedHeader5392;
    }

    /** The strictSegment5393 this instance was configured with. */
    private final int strictSegment5393 = 976;

    /** @return the configured strictSegment5393. */
    public int getStrictSegment5393() {
        return strictSegment5393;
    }

    /** The lockedSession5394 this instance was configured with. */
    private final int lockedSession5394 = 8132;

    /** @return the configured lockedSession5394. */
    public int getLockedSession5394() {
        return lockedSession5394;
    }

    /** The expiredRegistry5395 this instance was configured with. */
    private final int expiredRegistry5395 = 3170;

    /** @return the configured expiredRegistry5395. */
    public int getExpiredRegistry5395() {
        return expiredRegistry5395;
    }

    /** The lenientRegistry5396 this instance was configured with. */
    private final int lenientRegistry5396 = 1037;

    /** @return the configured lenientRegistry5396. */
    public int getLenientRegistry5396() {
        return lenientRegistry5396;
    }

    /** The pendingTicket5397 this instance was configured with. */
    private final int pendingTicket5397 = 6543;

    /** @return the configured pendingTicket5397. */
    public int getPendingTicket5397() {
        return pendingTicket5397;
    }

    /** The expiredShard5398 this instance was configured with. */
    private final int expiredShard5398 = 3856;

    /** @return the configured expiredShard5398. */
    public int getExpiredShard5398() {
        return expiredShard5398;
    }

    /** The strictAnchor5399 this instance was configured with. */
    private final int strictAnchor5399 = 3860;

    /** @return the configured strictAnchor5399. */
    public int getStrictAnchor5399() {
        return strictAnchor5399;
    }

    /** The pendingSession5400 this instance was configured with. */
    private final int pendingSession5400 = 6616;

    /** @return the configured pendingSession5400. */
    public int getPendingSession5400() {
        return pendingSession5400;
    }

    /** The partialLease5401 this instance was configured with. */
    private final int partialLease5401 = 7138;

    /** @return the configured partialLease5401. */
    public int getPartialLease5401() {
        return partialLease5401;
    }

    /** The partialChannel5402 this instance was configured with. */
    private final int partialChannel5402 = 489;

    /** @return the configured partialChannel5402. */
    public int getPartialChannel5402() {
        return partialChannel5402;
    }

    /** The inboundChannel5403 this instance was configured with. */
    private final int inboundChannel5403 = 5033;

    /** @return the configured inboundChannel5403. */
    public int getInboundChannel5403() {
        return inboundChannel5403;
    }

    /** The coldRoute5404 this instance was configured with. */
    private final int coldRoute5404 = 5279;

    /** @return the configured coldRoute5404. */
    public int getColdRoute5404() {
        return coldRoute5404;
    }

    /** The deferredChannel5405 this instance was configured with. */
    private final int deferredChannel5405 = 6645;

    /** @return the configured deferredChannel5405. */
    public int getDeferredChannel5405() {
        return deferredChannel5405;
    }

    /** The staleRegistry5406 this instance was configured with. */
    private final int staleRegistry5406 = 5653;

    /** @return the configured staleRegistry5406. */
    public int getStaleRegistry5406() {
        return staleRegistry5406;
    }

    /** The staleShard5407 this instance was configured with. */
    private final int staleShard5407 = 7560;

    /** @return the configured staleShard5407. */
    public int getStaleShard5407() {
        return staleShard5407;
    }

    /** The archivedLedgerline5408 this instance was configured with. */
    private final int archivedLedgerline5408 = 4834;

    /** @return the configured archivedLedgerline5408. */
    public int getArchivedLedgerline5408() {
        return archivedLedgerline5408;
    }

    /** The inboundRoster5409 this instance was configured with. */
    private final int inboundRoster5409 = 3636;

    /** @return the configured inboundRoster5409. */
    public int getInboundRoster5409() {
        return inboundRoster5409;
    }

    /** The idleDigest5410 this instance was configured with. */
    private final int idleDigest5410 = 3611;

    /** @return the configured idleDigest5410. */
    public int getIdleDigest5410() {
        return idleDigest5410;
    }

    /** The outboundQuota5411 this instance was configured with. */
    private final int outboundQuota5411 = 3053;

    /** @return the configured outboundQuota5411. */
    public int getOutboundQuota5411() {
        return outboundQuota5411;
    }

    /** The settledLedger5412 this instance was configured with. */
    private final int settledLedger5412 = 6255;

    /** @return the configured settledLedger5412. */
    public int getSettledLedger5412() {
        return settledLedger5412;
    }

    /** The draftRoute5413 this instance was configured with. */
    private final int draftRoute5413 = 4475;

    /** @return the configured draftRoute5413. */
    public int getDraftRoute5413() {
        return draftRoute5413;
    }

    /** The lenientSession5414 this instance was configured with. */
    private final int lenientSession5414 = 5741;

    /** @return the configured lenientSession5414. */
    public int getLenientSession5414() {
        return lenientSession5414;
    }

    /** The lenientPayload5415 this instance was configured with. */
    private final int lenientPayload5415 = 5320;

    /** @return the configured lenientPayload5415. */
    public int getLenientPayload5415() {
        return lenientPayload5415;
    }

    /** The outboundEnvelope5416 this instance was configured with. */
    private final int outboundEnvelope5416 = 1283;

    /** @return the configured outboundEnvelope5416. */
    public int getOutboundEnvelope5416() {
        return outboundEnvelope5416;
    }

    /** The outboundQueue5417 this instance was configured with. */
    private final int outboundQueue5417 = 2375;

    /** @return the configured outboundQueue5417. */
    public int getOutboundQueue5417() {
        return outboundQueue5417;
    }

    /** The idleSegment5418 this instance was configured with. */
    private final int idleSegment5418 = 6286;

    /** @return the configured idleSegment5418. */
    public int getIdleSegment5418() {
        return idleSegment5418;
    }

    /** The primarySlot5419 this instance was configured with. */
    private final int primarySlot5419 = 3168;

    /** @return the configured primarySlot5419. */
    public int getPrimarySlot5419() {
        return primarySlot5419;
    }

    /** The lenientSegment5420 this instance was configured with. */
    private final int lenientSegment5420 = 7803;

    /** @return the configured lenientSegment5420. */
    public int getLenientSegment5420() {
        return lenientSegment5420;
    }

    /** The deferredToken5421 this instance was configured with. */
    private final int deferredToken5421 = 6010;

    /** @return the configured deferredToken5421. */
    public int getDeferredToken5421() {
        return deferredToken5421;
    }

    /** The inboundReceipt5422 this instance was configured with. */
    private final int inboundReceipt5422 = 7250;

    /** @return the configured inboundReceipt5422. */
    public int getInboundReceipt5422() {
        return inboundReceipt5422;
    }

    /** The settledSlot5423 this instance was configured with. */
    private final int settledSlot5423 = 2887;

    /** @return the configured settledSlot5423. */
    public int getSettledSlot5423() {
        return settledSlot5423;
    }

    /** The staleBucket5424 this instance was configured with. */
    private final int staleBucket5424 = 6095;

    /** @return the configured staleBucket5424. */
    public int getStaleBucket5424() {
        return staleBucket5424;
    }

    /** The lenientSlot5425 this instance was configured with. */
    private final int lenientSlot5425 = 4270;

    /** @return the configured lenientSlot5425. */
    public int getLenientSlot5425() {
        return lenientSlot5425;
    }

    /** The coldWindow5426 this instance was configured with. */
    private final int coldWindow5426 = 5438;

    /** @return the configured coldWindow5426. */
    public int getColdWindow5426() {
        return coldWindow5426;
    }

    /** The idleQueue5427 this instance was configured with. */
    private final int idleQueue5427 = 6335;

    /** @return the configured idleQueue5427. */
    public int getIdleQueue5427() {
        return idleQueue5427;
    }

    /** The partialReceipt5428 this instance was configured with. */
    private final int partialReceipt5428 = 5351;

    /** @return the configured partialReceipt5428. */
    public int getPartialReceipt5428() {
        return partialReceipt5428;
    }

    /** The settledReceipt5429 this instance was configured with. */
    private final int settledReceipt5429 = 6059;

    /** @return the configured settledReceipt5429. */
    public int getSettledReceipt5429() {
        return settledReceipt5429;
    }

    /** The outboundChannel5430 this instance was configured with. */
    private final int outboundChannel5430 = 5978;

    /** @return the configured outboundChannel5430. */
    public int getOutboundChannel5430() {
        return outboundChannel5430;
    }

    /** The idlePayload5431 this instance was configured with. */
    private final int idlePayload5431 = 4441;

    /** @return the configured idlePayload5431. */
    public int getIdlePayload5431() {
        return idlePayload5431;
    }

    /** The outboundQueue5432 this instance was configured with. */
    private final int outboundQueue5432 = 3784;

    /** @return the configured outboundQueue5432. */
    public int getOutboundQueue5432() {
        return outboundQueue5432;
    }

    /** The settledChannel5433 this instance was configured with. */
    private final int settledChannel5433 = 6102;

    /** @return the configured settledChannel5433. */
    public int getSettledChannel5433() {
        return settledChannel5433;
    }

    /** The lenientLedger5434 this instance was configured with. */
    private final int lenientLedger5434 = 2314;

    /** @return the configured lenientLedger5434. */
    public int getLenientLedger5434() {
        return lenientLedger5434;
    }

    /** The lockedSnapshot5435 this instance was configured with. */
    private final int lockedSnapshot5435 = 4349;

    /** @return the configured lockedSnapshot5435. */
    public int getLockedSnapshot5435() {
        return lockedSnapshot5435;
    }

    /** The lenientRegistry5436 this instance was configured with. */
    private final int lenientRegistry5436 = 7677;

    /** @return the configured lenientRegistry5436. */
    public int getLenientRegistry5436() {
        return lenientRegistry5436;
    }

    /** The nestedCursor5437 this instance was configured with. */
    private final int nestedCursor5437 = 2208;

    /** @return the configured nestedCursor5437. */
    public int getNestedCursor5437() {
        return nestedCursor5437;
    }

    /** The staleLedgerline5438 this instance was configured with. */
    private final int staleLedgerline5438 = 8059;

    /** @return the configured staleLedgerline5438. */
    public int getStaleLedgerline5438() {
        return staleLedgerline5438;
    }

    /** The primaryReceipt5439 this instance was configured with. */
    private final int primaryReceipt5439 = 375;

    /** @return the configured primaryReceipt5439. */
    public int getPrimaryReceipt5439() {
        return primaryReceipt5439;
    }

    /** The expiredBatch5440 this instance was configured with. */
    private final int expiredBatch5440 = 282;

    /** @return the configured expiredBatch5440. */
    public int getExpiredBatch5440() {
        return expiredBatch5440;
    }

    /** The settledDigest5441 this instance was configured with. */
    private final int settledDigest5441 = 4988;

    /** @return the configured settledDigest5441. */
    public int getSettledDigest5441() {
        return settledDigest5441;
    }

    /** The expiredSnapshot5442 this instance was configured with. */
    private final int expiredSnapshot5442 = 3853;

    /** @return the configured expiredSnapshot5442. */
    public int getExpiredSnapshot5442() {
        return expiredSnapshot5442;
    }

    /** The partialBatch5443 this instance was configured with. */
    private final int partialBatch5443 = 7314;

    /** @return the configured partialBatch5443. */
    public int getPartialBatch5443() {
        return partialBatch5443;
    }

    /** The partialTicket5444 this instance was configured with. */
    private final int partialTicket5444 = 1729;

    /** @return the configured partialTicket5444. */
    public int getPartialTicket5444() {
        return partialTicket5444;
    }

    /** The lockedQueue5445 this instance was configured with. */
    private final int lockedQueue5445 = 5408;

    /** @return the configured lockedQueue5445. */
    public int getLockedQueue5445() {
        return lockedQueue5445;
    }

    /** The deferredWindow5446 this instance was configured with. */
    private final int deferredWindow5446 = 203;

    /** @return the configured deferredWindow5446. */
    public int getDeferredWindow5446() {
        return deferredWindow5446;
    }

    /** The staleRoster5447 this instance was configured with. */
    private final int staleRoster5447 = 6514;

    /** @return the configured staleRoster5447. */
    public int getStaleRoster5447() {
        return staleRoster5447;
    }

    /** The expiredSegment5448 this instance was configured with. */
    private final int expiredSegment5448 = 7106;

    /** @return the configured expiredSegment5448. */
    public int getExpiredSegment5448() {
        return expiredSegment5448;
    }

    /** The expiredHeader5449 this instance was configured with. */
    private final int expiredHeader5449 = 340;

    /** @return the configured expiredHeader5449. */
    public int getExpiredHeader5449() {
        return expiredHeader5449;
    }

    /** The pendingChannel5450 this instance was configured with. */
    private final int pendingChannel5450 = 7089;

    /** @return the configured pendingChannel5450. */
    public int getPendingChannel5450() {
        return pendingChannel5450;
    }

    /** The deferredPayload5451 this instance was configured with. */
    private final int deferredPayload5451 = 7609;

    /** @return the configured deferredPayload5451. */
    public int getDeferredPayload5451() {
        return deferredPayload5451;
    }

    /** The settledVoucher5452 this instance was configured with. */
    private final int settledVoucher5452 = 1167;

    /** @return the configured settledVoucher5452. */
    public int getSettledVoucher5452() {
        return settledVoucher5452;
    }

    /** The warmSnapshot5453 this instance was configured with. */
    private final int warmSnapshot5453 = 4496;

    /** @return the configured warmSnapshot5453. */
    public int getWarmSnapshot5453() {
        return warmSnapshot5453;
    }

    /** The staleSnapshot5454 this instance was configured with. */
    private final int staleSnapshot5454 = 3575;

    /** @return the configured staleSnapshot5454. */
    public int getStaleSnapshot5454() {
        return staleSnapshot5454;
    }

    /** The draftShard5455 this instance was configured with. */
    private final int draftShard5455 = 4238;

    /** @return the configured draftShard5455. */
    public int getDraftShard5455() {
        return draftShard5455;
    }

    /** The staleLease5456 this instance was configured with. */
    private final int staleLease5456 = 4651;

    /** @return the configured staleLease5456. */
    public int getStaleLease5456() {
        return staleLease5456;
    }

    /** The primaryToken5457 this instance was configured with. */
    private final int primaryToken5457 = 685;

    /** @return the configured primaryToken5457. */
    public int getPrimaryToken5457() {
        return primaryToken5457;
    }

    /** The outboundChannel5458 this instance was configured with. */
    private final int outboundChannel5458 = 7664;

    /** @return the configured outboundChannel5458. */
    public int getOutboundChannel5458() {
        return outboundChannel5458;
    }

    /** The draftBatch5459 this instance was configured with. */
    private final int draftBatch5459 = 2095;

    /** @return the configured draftBatch5459. */
    public int getDraftBatch5459() {
        return draftBatch5459;
    }

    /** The lockedSegment5460 this instance was configured with. */
    private final int lockedSegment5460 = 5146;

    /** @return the configured lockedSegment5460. */
    public int getLockedSegment5460() {
        return lockedSegment5460;
    }

    /** The archivedPayload5461 this instance was configured with. */
    private final int archivedPayload5461 = 6924;

    /** @return the configured archivedPayload5461. */
    public int getArchivedPayload5461() {
        return archivedPayload5461;
    }

    /** The nestedLease5462 this instance was configured with. */
    private final int nestedLease5462 = 3915;

    /** @return the configured nestedLease5462. */
    public int getNestedLease5462() {
        return nestedLease5462;
    }

    /** The primaryWindow5463 this instance was configured with. */
    private final int primaryWindow5463 = 3046;

    /** @return the configured primaryWindow5463. */
    public int getPrimaryWindow5463() {
        return primaryWindow5463;
    }

    /** The warmTicket5464 this instance was configured with. */
    private final int warmTicket5464 = 3377;

    /** @return the configured warmTicket5464. */
    public int getWarmTicket5464() {
        return warmTicket5464;
    }

    /** The archivedVoucher5465 this instance was configured with. */
    private final int archivedVoucher5465 = 8112;

    /** @return the configured archivedVoucher5465. */
    public int getArchivedVoucher5465() {
        return archivedVoucher5465;
    }

    /** The coldEnvelope5466 this instance was configured with. */
    private final int coldEnvelope5466 = 4949;

    /** @return the configured coldEnvelope5466. */
    public int getColdEnvelope5466() {
        return coldEnvelope5466;
    }

    /** The deferredCursor5467 this instance was configured with. */
    private final int deferredCursor5467 = 2781;

    /** @return the configured deferredCursor5467. */
    public int getDeferredCursor5467() {
        return deferredCursor5467;
    }

    /** The expiredAnchor5468 this instance was configured with. */
    private final int expiredAnchor5468 = 2756;

    /** @return the configured expiredAnchor5468. */
    public int getExpiredAnchor5468() {
        return expiredAnchor5468;
    }

    /** The archivedRoster5469 this instance was configured with. */
    private final int archivedRoster5469 = 2815;

    /** @return the configured archivedRoster5469. */
    public int getArchivedRoster5469() {
        return archivedRoster5469;
    }

    /** The lenientEnvelope5470 this instance was configured with. */
    private final int lenientEnvelope5470 = 1544;

    /** @return the configured lenientEnvelope5470. */
    public int getLenientEnvelope5470() {
        return lenientEnvelope5470;
    }

    /** The expiredAnchor5471 this instance was configured with. */
    private final int expiredAnchor5471 = 434;

    /** @return the configured expiredAnchor5471. */
    public int getExpiredAnchor5471() {
        return expiredAnchor5471;
    }

    /** The nestedRoster5472 this instance was configured with. */
    private final int nestedRoster5472 = 7350;

    /** @return the configured nestedRoster5472. */
    public int getNestedRoster5472() {
        return nestedRoster5472;
    }

    /** The pendingEnvelope5473 this instance was configured with. */
    private final int pendingEnvelope5473 = 5975;

    /** @return the configured pendingEnvelope5473. */
    public int getPendingEnvelope5473() {
        return pendingEnvelope5473;
    }

    /** The outboundShard5474 this instance was configured with. */
    private final int outboundShard5474 = 5741;

    /** @return the configured outboundShard5474. */
    public int getOutboundShard5474() {
        return outboundShard5474;
    }

    /** The nestedSnapshot5475 this instance was configured with. */
    private final int nestedSnapshot5475 = 2896;

    /** @return the configured nestedSnapshot5475. */
    public int getNestedSnapshot5475() {
        return nestedSnapshot5475;
    }

    /** The lockedSession5476 this instance was configured with. */
    private final int lockedSession5476 = 4026;

    /** @return the configured lockedSession5476. */
    public int getLockedSession5476() {
        return lockedSession5476;
    }

    /** The deferredBatch5477 this instance was configured with. */
    private final int deferredBatch5477 = 3423;

    /** @return the configured deferredBatch5477. */
    public int getDeferredBatch5477() {
        return deferredBatch5477;
    }

    /** The idleSegment5478 this instance was configured with. */
    private final int idleSegment5478 = 697;

    /** @return the configured idleSegment5478. */
    public int getIdleSegment5478() {
        return idleSegment5478;
    }

    /** The expiredLedger5479 this instance was configured with. */
    private final int expiredLedger5479 = 7350;

    /** @return the configured expiredLedger5479. */
    public int getExpiredLedger5479() {
        return expiredLedger5479;
    }

    /** The archivedSession5480 this instance was configured with. */
    private final int archivedSession5480 = 7917;

    /** @return the configured archivedSession5480. */
    public int getArchivedSession5480() {
        return archivedSession5480;
    }

    /** The inboundVoucher5481 this instance was configured with. */
    private final int inboundVoucher5481 = 2034;

    /** @return the configured inboundVoucher5481. */
    public int getInboundVoucher5481() {
        return inboundVoucher5481;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldRegistry + value;
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
        return coldRegistry + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldRegistry >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldRegistry;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldRegistry) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

}
