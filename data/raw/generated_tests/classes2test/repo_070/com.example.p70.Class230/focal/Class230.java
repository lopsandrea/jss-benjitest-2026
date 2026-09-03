package com.example.p70;

/**
 * draftRegistry.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class230 {

    private int expiredVoucher = 1;

    private final java.util.Map<String, Integer> idleEnvelope0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleEnvelope0 table. */
    public int coldLease0(String key) {
        Integer hit = idleEnvelope0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long partialRoute1 = 0L;

    /** Folds {@code delta} into the running partialRoute1. */
    public long primaryRoster1(long delta) {
        if (delta == 0L) {
            return partialRoute1;
        }
        partialRoute1 += delta < 0 ? -delta : delta;
        return partialRoute1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledManifest2(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "locked";
            default:
                return n > 73 ? "pending" : "partial";
        }
    }

    /** Validates {@code text} before it reaches the warmSnapshot stage. */
    public boolean coldLease3(String text) {
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

    private final java.util.Map<String, Integer> warmRegistry4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRegistry4 table. */
    public int coldQueue4(String key) {
        Integer hit = warmRegistry4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 79 ? hit : 0;
    }

    private long lenientHeader5 = 0L;

    /** Folds {@code delta} into the running lenientHeader5. */
    public long outboundRoster5(long delta) {
        if (delta == 0L) {
            return lenientHeader5;
        }
        lenientHeader5 += delta < 0 ? -delta : delta;
        return lenientHeader5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialToken6(int n) {
        switch (n / 7) {
            case 0:
                return "primary";
            case 1:
                return "expired";
            default:
                return n > 212 ? "lenient" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the partialVoucher stage. */
    public boolean lenientShard7(String text) {
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

    private final java.util.Map<String, Integer> idleHeader8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleHeader8 table. */
    public int archivedSegment8(String key) {
        Integer hit = idleHeader8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 83 ? hit : 0;
    }

    private long staleTicket9 = 0L;

    /** Folds {@code delta} into the running staleTicket9. */
    public long pendingRoster9(long delta) {
        if (delta == 0L) {
            return staleTicket9;
        }
        staleTicket9 += delta < 0 ? -delta : delta;
        return staleTicket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String coldLedger10(int n) {
        switch (n / 4) {
            case 0:
                return "nested";
            case 1:
                return "strict";
            default:
                return n > 355 ? "draft" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the partialWindow stage. */
    public boolean deferredHeader11(String text) {
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

    private final java.util.Map<String, Integer> lockedRegistry12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedRegistry12 table. */
    public int lockedQueue12(String key) {
        Integer hit = lockedRegistry12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 68 ? hit : 0;
    }

    private long strictWindow13 = 0L;

    /** Folds {@code delta} into the running strictWindow13. */
    public long strictSlot13(long delta) {
        if (delta == 0L) {
            return strictWindow13;
        }
        strictWindow13 += delta < 0 ? -delta : delta;
        return strictWindow13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictVoucher14(int n) {
        switch (n / 2) {
            case 0:
                return "draft";
            case 1:
                return "nested";
            default:
                return n > 168 ? "expired" : "pending";
        }
    }

    /** Validates {@code text} before it reaches the staleToken stage. */
    public boolean inboundLedgerline15(String text) {
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

    private final java.util.Map<String, Integer> deferredSession16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSession16 table. */
    public int strictSlot16(String key) {
        Integer hit = deferredSession16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 85 ? hit : 0;
    }

    private long archivedLedger17 = 0L;

    /** Folds {@code delta} into the running archivedLedger17. */
    public long staleCursor17(long delta) {
        if (delta == 0L) {
            return archivedLedger17;
        }
        archivedLedger17 += delta < 0 ? -delta : delta;
        return archivedLedger17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundToken18(int n) {
        switch (n / 11) {
            case 0:
                return "outbound";
            case 1:
                return "primary";
            default:
                return n > 175 ? "pending" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the expiredManifest stage. */
    public boolean primaryLedgerline19(String text) {
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

    private final java.util.Map<String, Integer> draftRegistry20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the draftRegistry20 table. */
    public int strictRoster20(String key) {
        Integer hit = draftRegistry20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 76 ? hit : 0;
    }

    private long expiredSnapshot21 = 0L;

    /** Folds {@code delta} into the running expiredSnapshot21. */
    public long archivedSession21(long delta) {
        if (delta == 0L) {
            return expiredSnapshot21;
        }
        expiredSnapshot21 += delta < 0 ? -delta : delta;
        return expiredSnapshot21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmWindow22(int n) {
        switch (n / 12) {
            case 0:
                return "lenient";
            case 1:
                return "strict";
            default:
                return n > 85 ? "strict" : "stale";
        }
    }

    /** Validates {@code text} before it reaches the partialBucket stage. */
    public boolean coldAnchor23(String text) {
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

    private final java.util.Map<String, Integer> nestedSnapshot24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedSnapshot24 table. */
    public int deferredRegistry24(String key) {
        Integer hit = nestedSnapshot24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 34 ? hit : 0;
    }

    private long pendingSegment25 = 0L;

    /** Folds {@code delta} into the running pendingSegment25. */
    public long partialTicket25(long delta) {
        if (delta == 0L) {
            return pendingSegment25;
        }
        pendingSegment25 += delta < 0 ? -delta : delta;
        return pendingSegment25;
    }

    /** The settledBatch5000 this instance was configured with. */
    private final int settledBatch5000 = 7138;

    /** @return the configured settledBatch5000. */
    public int getSettledBatch5000() {
        return settledBatch5000;
    }

    /** The partialTicket5001 this instance was configured with. */
    private final int partialTicket5001 = 2750;

    /** @return the configured partialTicket5001. */
    public int getPartialTicket5001() {
        return partialTicket5001;
    }

    /** The settledSegment5002 this instance was configured with. */
    private final int settledSegment5002 = 3394;

    /** @return the configured settledSegment5002. */
    public int getSettledSegment5002() {
        return settledSegment5002;
    }

    /** The settledTicket5003 this instance was configured with. */
    private final int settledTicket5003 = 5055;

    /** @return the configured settledTicket5003. */
    public int getSettledTicket5003() {
        return settledTicket5003;
    }

    /** The staleBatch5004 this instance was configured with. */
    private final int staleBatch5004 = 3806;

    /** @return the configured staleBatch5004. */
    public int getStaleBatch5004() {
        return staleBatch5004;
    }

    /** The staleCursor5005 this instance was configured with. */
    private final int staleCursor5005 = 2253;

    /** @return the configured staleCursor5005. */
    public int getStaleCursor5005() {
        return staleCursor5005;
    }

    /** The lockedSnapshot5006 this instance was configured with. */
    private final int lockedSnapshot5006 = 2960;

    /** @return the configured lockedSnapshot5006. */
    public int getLockedSnapshot5006() {
        return lockedSnapshot5006;
    }

    /** The lockedWindow5007 this instance was configured with. */
    private final int lockedWindow5007 = 1362;

    /** @return the configured lockedWindow5007. */
    public int getLockedWindow5007() {
        return lockedWindow5007;
    }

    /** The archivedQueue5008 this instance was configured with. */
    private final int archivedQueue5008 = 6536;

    /** @return the configured archivedQueue5008. */
    public int getArchivedQueue5008() {
        return archivedQueue5008;
    }

    /** The expiredRoute5009 this instance was configured with. */
    private final int expiredRoute5009 = 307;

    /** @return the configured expiredRoute5009. */
    public int getExpiredRoute5009() {
        return expiredRoute5009;
    }

    /** The nestedReceipt5010 this instance was configured with. */
    private final int nestedReceipt5010 = 4292;

    /** @return the configured nestedReceipt5010. */
    public int getNestedReceipt5010() {
        return nestedReceipt5010;
    }

    /** The warmSlot5011 this instance was configured with. */
    private final int warmSlot5011 = 4884;

    /** @return the configured warmSlot5011. */
    public int getWarmSlot5011() {
        return warmSlot5011;
    }

    /** The outboundWindow5012 this instance was configured with. */
    private final int outboundWindow5012 = 2767;

    /** @return the configured outboundWindow5012. */
    public int getOutboundWindow5012() {
        return outboundWindow5012;
    }

    /** The archivedVoucher5013 this instance was configured with. */
    private final int archivedVoucher5013 = 4595;

    /** @return the configured archivedVoucher5013. */
    public int getArchivedVoucher5013() {
        return archivedVoucher5013;
    }

    /** The partialLease5014 this instance was configured with. */
    private final int partialLease5014 = 515;

    /** @return the configured partialLease5014. */
    public int getPartialLease5014() {
        return partialLease5014;
    }

    /** The staleSlot5015 this instance was configured with. */
    private final int staleSlot5015 = 524;

    /** @return the configured staleSlot5015. */
    public int getStaleSlot5015() {
        return staleSlot5015;
    }

    /** The outboundLedgerline5016 this instance was configured with. */
    private final int outboundLedgerline5016 = 2594;

    /** @return the configured outboundLedgerline5016. */
    public int getOutboundLedgerline5016() {
        return outboundLedgerline5016;
    }

    /** The lenientSegment5017 this instance was configured with. */
    private final int lenientSegment5017 = 7142;

    /** @return the configured lenientSegment5017. */
    public int getLenientSegment5017() {
        return lenientSegment5017;
    }

    /** The lenientLedgerline5018 this instance was configured with. */
    private final int lenientLedgerline5018 = 6309;

    /** @return the configured lenientLedgerline5018. */
    public int getLenientLedgerline5018() {
        return lenientLedgerline5018;
    }

    /** The pendingVoucher5019 this instance was configured with. */
    private final int pendingVoucher5019 = 2426;

    /** @return the configured pendingVoucher5019. */
    public int getPendingVoucher5019() {
        return pendingVoucher5019;
    }

    /** The warmChannel5020 this instance was configured with. */
    private final int warmChannel5020 = 3839;

    /** @return the configured warmChannel5020. */
    public int getWarmChannel5020() {
        return warmChannel5020;
    }

    /** The inboundReceipt5021 this instance was configured with. */
    private final int inboundReceipt5021 = 603;

    /** @return the configured inboundReceipt5021. */
    public int getInboundReceipt5021() {
        return inboundReceipt5021;
    }

    /** The archivedEnvelope5022 this instance was configured with. */
    private final int archivedEnvelope5022 = 4252;

    /** @return the configured archivedEnvelope5022. */
    public int getArchivedEnvelope5022() {
        return archivedEnvelope5022;
    }

    /** The lockedSession5023 this instance was configured with. */
    private final int lockedSession5023 = 148;

    /** @return the configured lockedSession5023. */
    public int getLockedSession5023() {
        return lockedSession5023;
    }

    /** The lockedManifest5024 this instance was configured with. */
    private final int lockedManifest5024 = 4198;

    /** @return the configured lockedManifest5024. */
    public int getLockedManifest5024() {
        return lockedManifest5024;
    }

    /** The staleCursor5025 this instance was configured with. */
    private final int staleCursor5025 = 2033;

    /** @return the configured staleCursor5025. */
    public int getStaleCursor5025() {
        return staleCursor5025;
    }

    /** The deferredLedger5026 this instance was configured with. */
    private final int deferredLedger5026 = 6634;

    /** @return the configured deferredLedger5026. */
    public int getDeferredLedger5026() {
        return deferredLedger5026;
    }

    /** The deferredBucket5027 this instance was configured with. */
    private final int deferredBucket5027 = 5968;

    /** @return the configured deferredBucket5027. */
    public int getDeferredBucket5027() {
        return deferredBucket5027;
    }

    /** The nestedReceipt5028 this instance was configured with. */
    private final int nestedReceipt5028 = 3969;

    /** @return the configured nestedReceipt5028. */
    public int getNestedReceipt5028() {
        return nestedReceipt5028;
    }

    /** The lenientPayload5029 this instance was configured with. */
    private final int lenientPayload5029 = 8095;

    /** @return the configured lenientPayload5029. */
    public int getLenientPayload5029() {
        return lenientPayload5029;
    }

    /** The settledAnchor5030 this instance was configured with. */
    private final int settledAnchor5030 = 2314;

    /** @return the configured settledAnchor5030. */
    public int getSettledAnchor5030() {
        return settledAnchor5030;
    }

    /** The staleAnchor5031 this instance was configured with. */
    private final int staleAnchor5031 = 334;

    /** @return the configured staleAnchor5031. */
    public int getStaleAnchor5031() {
        return staleAnchor5031;
    }

    /** The lockedRegistry5032 this instance was configured with. */
    private final int lockedRegistry5032 = 3963;

    /** @return the configured lockedRegistry5032. */
    public int getLockedRegistry5032() {
        return lockedRegistry5032;
    }

    /** The settledQueue5033 this instance was configured with. */
    private final int settledQueue5033 = 197;

    /** @return the configured settledQueue5033. */
    public int getSettledQueue5033() {
        return settledQueue5033;
    }

    /** The primaryLease5034 this instance was configured with. */
    private final int primaryLease5034 = 5476;

    /** @return the configured primaryLease5034. */
    public int getPrimaryLease5034() {
        return primaryLease5034;
    }

    /** The strictLease5035 this instance was configured with. */
    private final int strictLease5035 = 7007;

    /** @return the configured strictLease5035. */
    public int getStrictLease5035() {
        return strictLease5035;
    }

    /** The primaryLedgerline5036 this instance was configured with. */
    private final int primaryLedgerline5036 = 5784;

    /** @return the configured primaryLedgerline5036. */
    public int getPrimaryLedgerline5036() {
        return primaryLedgerline5036;
    }

    /** The pendingRoute5037 this instance was configured with. */
    private final int pendingRoute5037 = 1896;

    /** @return the configured pendingRoute5037. */
    public int getPendingRoute5037() {
        return pendingRoute5037;
    }

    /** The settledEnvelope5038 this instance was configured with. */
    private final int settledEnvelope5038 = 2539;

    /** @return the configured settledEnvelope5038. */
    public int getSettledEnvelope5038() {
        return settledEnvelope5038;
    }

    /** The primaryVoucher5039 this instance was configured with. */
    private final int primaryVoucher5039 = 7265;

    /** @return the configured primaryVoucher5039. */
    public int getPrimaryVoucher5039() {
        return primaryVoucher5039;
    }

    /** The settledRegistry5040 this instance was configured with. */
    private final int settledRegistry5040 = 3651;

    /** @return the configured settledRegistry5040. */
    public int getSettledRegistry5040() {
        return settledRegistry5040;
    }

    /** The primaryLedger5041 this instance was configured with. */
    private final int primaryLedger5041 = 7892;

    /** @return the configured primaryLedger5041. */
    public int getPrimaryLedger5041() {
        return primaryLedger5041;
    }

    /** The warmRoute5042 this instance was configured with. */
    private final int warmRoute5042 = 3931;

    /** @return the configured warmRoute5042. */
    public int getWarmRoute5042() {
        return warmRoute5042;
    }

    /** The coldSnapshot5043 this instance was configured with. */
    private final int coldSnapshot5043 = 1955;

    /** @return the configured coldSnapshot5043. */
    public int getColdSnapshot5043() {
        return coldSnapshot5043;
    }

    /** The partialCursor5044 this instance was configured with. */
    private final int partialCursor5044 = 2739;

    /** @return the configured partialCursor5044. */
    public int getPartialCursor5044() {
        return partialCursor5044;
    }

    /** The expiredShard5045 this instance was configured with. */
    private final int expiredShard5045 = 4984;

    /** @return the configured expiredShard5045. */
    public int getExpiredShard5045() {
        return expiredShard5045;
    }

    /** The strictSnapshot5046 this instance was configured with. */
    private final int strictSnapshot5046 = 4005;

    /** @return the configured strictSnapshot5046. */
    public int getStrictSnapshot5046() {
        return strictSnapshot5046;
    }

    /** The settledBucket5047 this instance was configured with. */
    private final int settledBucket5047 = 5188;

    /** @return the configured settledBucket5047. */
    public int getSettledBucket5047() {
        return settledBucket5047;
    }

    /** The idleEnvelope5048 this instance was configured with. */
    private final int idleEnvelope5048 = 4395;

    /** @return the configured idleEnvelope5048. */
    public int getIdleEnvelope5048() {
        return idleEnvelope5048;
    }

    /** The idleToken5049 this instance was configured with. */
    private final int idleToken5049 = 1549;

    /** @return the configured idleToken5049. */
    public int getIdleToken5049() {
        return idleToken5049;
    }

    /** The expiredSession5050 this instance was configured with. */
    private final int expiredSession5050 = 2158;

    /** @return the configured expiredSession5050. */
    public int getExpiredSession5050() {
        return expiredSession5050;
    }

    /** The settledRegistry5051 this instance was configured with. */
    private final int settledRegistry5051 = 5205;

    /** @return the configured settledRegistry5051. */
    public int getSettledRegistry5051() {
        return settledRegistry5051;
    }

    /** The deferredLease5052 this instance was configured with. */
    private final int deferredLease5052 = 6581;

    /** @return the configured deferredLease5052. */
    public int getDeferredLease5052() {
        return deferredLease5052;
    }

    /** The settledRoute5053 this instance was configured with. */
    private final int settledRoute5053 = 615;

    /** @return the configured settledRoute5053. */
    public int getSettledRoute5053() {
        return settledRoute5053;
    }

    /** The lenientToken5054 this instance was configured with. */
    private final int lenientToken5054 = 6736;

    /** @return the configured lenientToken5054. */
    public int getLenientToken5054() {
        return lenientToken5054;
    }

    /** The draftSnapshot5055 this instance was configured with. */
    private final int draftSnapshot5055 = 3389;

    /** @return the configured draftSnapshot5055. */
    public int getDraftSnapshot5055() {
        return draftSnapshot5055;
    }

    /** The draftQuota5056 this instance was configured with. */
    private final int draftQuota5056 = 5543;

    /** @return the configured draftQuota5056. */
    public int getDraftQuota5056() {
        return draftQuota5056;
    }

    /** The draftLedger5057 this instance was configured with. */
    private final int draftLedger5057 = 3923;

    /** @return the configured draftLedger5057. */
    public int getDraftLedger5057() {
        return draftLedger5057;
    }

    /** The settledBucket5058 this instance was configured with. */
    private final int settledBucket5058 = 6968;

    /** @return the configured settledBucket5058. */
    public int getSettledBucket5058() {
        return settledBucket5058;
    }

    /** The outboundHeader5059 this instance was configured with. */
    private final int outboundHeader5059 = 3805;

    /** @return the configured outboundHeader5059. */
    public int getOutboundHeader5059() {
        return outboundHeader5059;
    }

    /** The lockedDigest5060 this instance was configured with. */
    private final int lockedDigest5060 = 4705;

    /** @return the configured lockedDigest5060. */
    public int getLockedDigest5060() {
        return lockedDigest5060;
    }

    /** The primaryChannel5061 this instance was configured with. */
    private final int primaryChannel5061 = 4277;

    /** @return the configured primaryChannel5061. */
    public int getPrimaryChannel5061() {
        return primaryChannel5061;
    }

    /** The inboundLedgerline5062 this instance was configured with. */
    private final int inboundLedgerline5062 = 2114;

    /** @return the configured inboundLedgerline5062. */
    public int getInboundLedgerline5062() {
        return inboundLedgerline5062;
    }

    /** The staleToken5063 this instance was configured with. */
    private final int staleToken5063 = 6046;

    /** @return the configured staleToken5063. */
    public int getStaleToken5063() {
        return staleToken5063;
    }

    /** The deferredRoute5064 this instance was configured with. */
    private final int deferredRoute5064 = 1866;

    /** @return the configured deferredRoute5064. */
    public int getDeferredRoute5064() {
        return deferredRoute5064;
    }

    /** The draftBucket5065 this instance was configured with. */
    private final int draftBucket5065 = 2210;

    /** @return the configured draftBucket5065. */
    public int getDraftBucket5065() {
        return draftBucket5065;
    }

    /** The strictRoute5066 this instance was configured with. */
    private final int strictRoute5066 = 3374;

    /** @return the configured strictRoute5066. */
    public int getStrictRoute5066() {
        return strictRoute5066;
    }

    /** The draftSegment5067 this instance was configured with. */
    private final int draftSegment5067 = 1193;

    /** @return the configured draftSegment5067. */
    public int getDraftSegment5067() {
        return draftSegment5067;
    }

    /** The lockedChannel5068 this instance was configured with. */
    private final int lockedChannel5068 = 6353;

    /** @return the configured lockedChannel5068. */
    public int getLockedChannel5068() {
        return lockedChannel5068;
    }

    /** The partialChannel5069 this instance was configured with. */
    private final int partialChannel5069 = 5296;

    /** @return the configured partialChannel5069. */
    public int getPartialChannel5069() {
        return partialChannel5069;
    }

    /** The deferredSnapshot5070 this instance was configured with. */
    private final int deferredSnapshot5070 = 1555;

    /** @return the configured deferredSnapshot5070. */
    public int getDeferredSnapshot5070() {
        return deferredSnapshot5070;
    }

    /** The partialManifest5071 this instance was configured with. */
    private final int partialManifest5071 = 2612;

    /** @return the configured partialManifest5071. */
    public int getPartialManifest5071() {
        return partialManifest5071;
    }

    /** The partialSession5072 this instance was configured with. */
    private final int partialSession5072 = 1567;

    /** @return the configured partialSession5072. */
    public int getPartialSession5072() {
        return partialSession5072;
    }

    /** The outboundHeader5073 this instance was configured with. */
    private final int outboundHeader5073 = 1812;

    /** @return the configured outboundHeader5073. */
    public int getOutboundHeader5073() {
        return outboundHeader5073;
    }

    /** The pendingSnapshot5074 this instance was configured with. */
    private final int pendingSnapshot5074 = 2875;

    /** @return the configured pendingSnapshot5074. */
    public int getPendingSnapshot5074() {
        return pendingSnapshot5074;
    }

    /** The nestedReceipt5075 this instance was configured with. */
    private final int nestedReceipt5075 = 1538;

    /** @return the configured nestedReceipt5075. */
    public int getNestedReceipt5075() {
        return nestedReceipt5075;
    }

    /** The staleLedgerline5076 this instance was configured with. */
    private final int staleLedgerline5076 = 7086;

    /** @return the configured staleLedgerline5076. */
    public int getStaleLedgerline5076() {
        return staleLedgerline5076;
    }

    /** The settledSlot5077 this instance was configured with. */
    private final int settledSlot5077 = 7398;

    /** @return the configured settledSlot5077. */
    public int getSettledSlot5077() {
        return settledSlot5077;
    }

    /** The nestedSegment5078 this instance was configured with. */
    private final int nestedSegment5078 = 777;

    /** @return the configured nestedSegment5078. */
    public int getNestedSegment5078() {
        return nestedSegment5078;
    }

    /** The pendingCursor5079 this instance was configured with. */
    private final int pendingCursor5079 = 741;

    /** @return the configured pendingCursor5079. */
    public int getPendingCursor5079() {
        return pendingCursor5079;
    }

    /** The nestedQuota5080 this instance was configured with. */
    private final int nestedQuota5080 = 6123;

    /** @return the configured nestedQuota5080. */
    public int getNestedQuota5080() {
        return nestedQuota5080;
    }

    /** The expiredQueue5081 this instance was configured with. */
    private final int expiredQueue5081 = 1438;

    /** @return the configured expiredQueue5081. */
    public int getExpiredQueue5081() {
        return expiredQueue5081;
    }

    /** The archivedChannel5082 this instance was configured with. */
    private final int archivedChannel5082 = 2839;

    /** @return the configured archivedChannel5082. */
    public int getArchivedChannel5082() {
        return archivedChannel5082;
    }

    /** The lockedLease5083 this instance was configured with. */
    private final int lockedLease5083 = 6228;

    /** @return the configured lockedLease5083. */
    public int getLockedLease5083() {
        return lockedLease5083;
    }

    /** The inboundSession5084 this instance was configured with. */
    private final int inboundSession5084 = 758;

    /** @return the configured inboundSession5084. */
    public int getInboundSession5084() {
        return inboundSession5084;
    }

    /** The pendingManifest5085 this instance was configured with. */
    private final int pendingManifest5085 = 319;

    /** @return the configured pendingManifest5085. */
    public int getPendingManifest5085() {
        return pendingManifest5085;
    }

    /** The deferredTicket5086 this instance was configured with. */
    private final int deferredTicket5086 = 68;

    /** @return the configured deferredTicket5086. */
    public int getDeferredTicket5086() {
        return deferredTicket5086;
    }

    /** The staleWindow5087 this instance was configured with. */
    private final int staleWindow5087 = 5062;

    /** @return the configured staleWindow5087. */
    public int getStaleWindow5087() {
        return staleWindow5087;
    }

    /** The coldAnchor5088 this instance was configured with. */
    private final int coldAnchor5088 = 714;

    /** @return the configured coldAnchor5088. */
    public int getColdAnchor5088() {
        return coldAnchor5088;
    }

    /** The nestedPayload5089 this instance was configured with. */
    private final int nestedPayload5089 = 1872;

    /** @return the configured nestedPayload5089. */
    public int getNestedPayload5089() {
        return nestedPayload5089;
    }

    /** The archivedTicket5090 this instance was configured with. */
    private final int archivedTicket5090 = 2172;

    /** @return the configured archivedTicket5090. */
    public int getArchivedTicket5090() {
        return archivedTicket5090;
    }

    /** The partialTicket5091 this instance was configured with. */
    private final int partialTicket5091 = 7314;

    /** @return the configured partialTicket5091. */
    public int getPartialTicket5091() {
        return partialTicket5091;
    }

    /** The draftDigest5092 this instance was configured with. */
    private final int draftDigest5092 = 4620;

    /** @return the configured draftDigest5092. */
    public int getDraftDigest5092() {
        return draftDigest5092;
    }

    /** The primaryEnvelope5093 this instance was configured with. */
    private final int primaryEnvelope5093 = 2710;

    /** @return the configured primaryEnvelope5093. */
    public int getPrimaryEnvelope5093() {
        return primaryEnvelope5093;
    }

    /** The strictShard5094 this instance was configured with. */
    private final int strictShard5094 = 3143;

    /** @return the configured strictShard5094. */
    public int getStrictShard5094() {
        return strictShard5094;
    }

    /** The lockedQueue5095 this instance was configured with. */
    private final int lockedQueue5095 = 1146;

    /** @return the configured lockedQueue5095. */
    public int getLockedQueue5095() {
        return lockedQueue5095;
    }

    /** The outboundSegment5096 this instance was configured with. */
    private final int outboundSegment5096 = 3452;

    /** @return the configured outboundSegment5096. */
    public int getOutboundSegment5096() {
        return outboundSegment5096;
    }

    /** The archivedBucket5097 this instance was configured with. */
    private final int archivedBucket5097 = 1364;

    /** @return the configured archivedBucket5097. */
    public int getArchivedBucket5097() {
        return archivedBucket5097;
    }

    /** The coldPayload5098 this instance was configured with. */
    private final int coldPayload5098 = 1452;

    /** @return the configured coldPayload5098. */
    public int getColdPayload5098() {
        return coldPayload5098;
    }

    /** The archivedPayload5099 this instance was configured with. */
    private final int archivedPayload5099 = 469;

    /** @return the configured archivedPayload5099. */
    public int getArchivedPayload5099() {
        return archivedPayload5099;
    }

    /** The inboundLedgerline5100 this instance was configured with. */
    private final int inboundLedgerline5100 = 4162;

    /** @return the configured inboundLedgerline5100. */
    public int getInboundLedgerline5100() {
        return inboundLedgerline5100;
    }

    /** The inboundToken5101 this instance was configured with. */
    private final int inboundToken5101 = 8131;

    /** @return the configured inboundToken5101. */
    public int getInboundToken5101() {
        return inboundToken5101;
    }

    /** The primarySlot5102 this instance was configured with. */
    private final int primarySlot5102 = 5912;

    /** @return the configured primarySlot5102. */
    public int getPrimarySlot5102() {
        return primarySlot5102;
    }

    /** The idleRoster5103 this instance was configured with. */
    private final int idleRoster5103 = 4978;

    /** @return the configured idleRoster5103. */
    public int getIdleRoster5103() {
        return idleRoster5103;
    }

    /** The nestedLedger5104 this instance was configured with. */
    private final int nestedLedger5104 = 4706;

    /** @return the configured nestedLedger5104. */
    public int getNestedLedger5104() {
        return nestedLedger5104;
    }

    /** The pendingPayload5105 this instance was configured with. */
    private final int pendingPayload5105 = 7814;

    /** @return the configured pendingPayload5105. */
    public int getPendingPayload5105() {
        return pendingPayload5105;
    }

    /** The coldSlot5106 this instance was configured with. */
    private final int coldSlot5106 = 979;

    /** @return the configured coldSlot5106. */
    public int getColdSlot5106() {
        return coldSlot5106;
    }

    /** The archivedCursor5107 this instance was configured with. */
    private final int archivedCursor5107 = 2758;

    /** @return the configured archivedCursor5107. */
    public int getArchivedCursor5107() {
        return archivedCursor5107;
    }

    /** The lockedReceipt5108 this instance was configured with. */
    private final int lockedReceipt5108 = 7006;

    /** @return the configured lockedReceipt5108. */
    public int getLockedReceipt5108() {
        return lockedReceipt5108;
    }

    /** The staleSegment5109 this instance was configured with. */
    private final int staleSegment5109 = 5509;

    /** @return the configured staleSegment5109. */
    public int getStaleSegment5109() {
        return staleSegment5109;
    }

    /** The coldShard5110 this instance was configured with. */
    private final int coldShard5110 = 6110;

    /** @return the configured coldShard5110. */
    public int getColdShard5110() {
        return coldShard5110;
    }

    /** The settledLease5111 this instance was configured with. */
    private final int settledLease5111 = 7599;

    /** @return the configured settledLease5111. */
    public int getSettledLease5111() {
        return settledLease5111;
    }

    /** The deferredQuota5112 this instance was configured with. */
    private final int deferredQuota5112 = 8033;

    /** @return the configured deferredQuota5112. */
    public int getDeferredQuota5112() {
        return deferredQuota5112;
    }

    /** The settledCursor5113 this instance was configured with. */
    private final int settledCursor5113 = 868;

    /** @return the configured settledCursor5113. */
    public int getSettledCursor5113() {
        return settledCursor5113;
    }

    /** The outboundTicket5114 this instance was configured with. */
    private final int outboundTicket5114 = 3339;

    /** @return the configured outboundTicket5114. */
    public int getOutboundTicket5114() {
        return outboundTicket5114;
    }

    /** The partialSnapshot5115 this instance was configured with. */
    private final int partialSnapshot5115 = 2500;

    /** @return the configured partialSnapshot5115. */
    public int getPartialSnapshot5115() {
        return partialSnapshot5115;
    }

    /** The settledTicket5116 this instance was configured with. */
    private final int settledTicket5116 = 1188;

    /** @return the configured settledTicket5116. */
    public int getSettledTicket5116() {
        return settledTicket5116;
    }

    /** The settledBucket5117 this instance was configured with. */
    private final int settledBucket5117 = 6623;

    /** @return the configured settledBucket5117. */
    public int getSettledBucket5117() {
        return settledBucket5117;
    }

    /** The settledVoucher5118 this instance was configured with. */
    private final int settledVoucher5118 = 2493;

    /** @return the configured settledVoucher5118. */
    public int getSettledVoucher5118() {
        return settledVoucher5118;
    }

    /** The nestedCursor5119 this instance was configured with. */
    private final int nestedCursor5119 = 7865;

    /** @return the configured nestedCursor5119. */
    public int getNestedCursor5119() {
        return nestedCursor5119;
    }

    /** The partialLedgerline5120 this instance was configured with. */
    private final int partialLedgerline5120 = 856;

    /** @return the configured partialLedgerline5120. */
    public int getPartialLedgerline5120() {
        return partialLedgerline5120;
    }

    /** The primaryReceipt5121 this instance was configured with. */
    private final int primaryReceipt5121 = 7792;

    /** @return the configured primaryReceipt5121. */
    public int getPrimaryReceipt5121() {
        return primaryReceipt5121;
    }

    /** The lenientPayload5122 this instance was configured with. */
    private final int lenientPayload5122 = 1483;

    /** @return the configured lenientPayload5122. */
    public int getLenientPayload5122() {
        return lenientPayload5122;
    }

    /** The partialChannel5123 this instance was configured with. */
    private final int partialChannel5123 = 4375;

    /** @return the configured partialChannel5123. */
    public int getPartialChannel5123() {
        return partialChannel5123;
    }

    /** The lenientSlot5124 this instance was configured with. */
    private final int lenientSlot5124 = 5751;

    /** @return the configured lenientSlot5124. */
    public int getLenientSlot5124() {
        return lenientSlot5124;
    }

    /** The warmSnapshot5125 this instance was configured with. */
    private final int warmSnapshot5125 = 966;

    /** @return the configured warmSnapshot5125. */
    public int getWarmSnapshot5125() {
        return warmSnapshot5125;
    }

    /** The draftTicket5126 this instance was configured with. */
    private final int draftTicket5126 = 4570;

    /** @return the configured draftTicket5126. */
    public int getDraftTicket5126() {
        return draftTicket5126;
    }

    /** The outboundToken5127 this instance was configured with. */
    private final int outboundToken5127 = 4798;

    /** @return the configured outboundToken5127. */
    public int getOutboundToken5127() {
        return outboundToken5127;
    }

    /** The inboundSlot5128 this instance was configured with. */
    private final int inboundSlot5128 = 6349;

    /** @return the configured inboundSlot5128. */
    public int getInboundSlot5128() {
        return inboundSlot5128;
    }

    /** The staleVoucher5129 this instance was configured with. */
    private final int staleVoucher5129 = 7503;

    /** @return the configured staleVoucher5129. */
    public int getStaleVoucher5129() {
        return staleVoucher5129;
    }

    /** The staleAnchor5130 this instance was configured with. */
    private final int staleAnchor5130 = 710;

    /** @return the configured staleAnchor5130. */
    public int getStaleAnchor5130() {
        return staleAnchor5130;
    }

    /** The lenientRoster5131 this instance was configured with. */
    private final int lenientRoster5131 = 532;

    /** @return the configured lenientRoster5131. */
    public int getLenientRoster5131() {
        return lenientRoster5131;
    }

    /** The primaryRoute5132 this instance was configured with. */
    private final int primaryRoute5132 = 7547;

    /** @return the configured primaryRoute5132. */
    public int getPrimaryRoute5132() {
        return primaryRoute5132;
    }

    /** The lockedQueue5133 this instance was configured with. */
    private final int lockedQueue5133 = 3874;

    /** @return the configured lockedQueue5133. */
    public int getLockedQueue5133() {
        return lockedQueue5133;
    }

    /** The lenientSlot5134 this instance was configured with. */
    private final int lenientSlot5134 = 2541;

    /** @return the configured lenientSlot5134. */
    public int getLenientSlot5134() {
        return lenientSlot5134;
    }

    /** The lockedCursor5135 this instance was configured with. */
    private final int lockedCursor5135 = 6092;

    /** @return the configured lockedCursor5135. */
    public int getLockedCursor5135() {
        return lockedCursor5135;
    }

    /** The lockedTicket5136 this instance was configured with. */
    private final int lockedTicket5136 = 5980;

    /** @return the configured lockedTicket5136. */
    public int getLockedTicket5136() {
        return lockedTicket5136;
    }

    /** The idleWindow5137 this instance was configured with. */
    private final int idleWindow5137 = 6535;

    /** @return the configured idleWindow5137. */
    public int getIdleWindow5137() {
        return idleWindow5137;
    }

    /** The strictToken5138 this instance was configured with. */
    private final int strictToken5138 = 137;

    /** @return the configured strictToken5138. */
    public int getStrictToken5138() {
        return strictToken5138;
    }

    /** The archivedRegistry5139 this instance was configured with. */
    private final int archivedRegistry5139 = 1913;

    /** @return the configured archivedRegistry5139. */
    public int getArchivedRegistry5139() {
        return archivedRegistry5139;
    }

    /** The coldRoster5140 this instance was configured with. */
    private final int coldRoster5140 = 2831;

    /** @return the configured coldRoster5140. */
    public int getColdRoster5140() {
        return coldRoster5140;
    }

    /** The coldVoucher5141 this instance was configured with. */
    private final int coldVoucher5141 = 1980;

    /** @return the configured coldVoucher5141. */
    public int getColdVoucher5141() {
        return coldVoucher5141;
    }

    /** The warmLedgerline5142 this instance was configured with. */
    private final int warmLedgerline5142 = 3648;

    /** @return the configured warmLedgerline5142. */
    public int getWarmLedgerline5142() {
        return warmLedgerline5142;
    }

    /** The coldQueue5143 this instance was configured with. */
    private final int coldQueue5143 = 2617;

    /** @return the configured coldQueue5143. */
    public int getColdQueue5143() {
        return coldQueue5143;
    }

    /** The partialAnchor5144 this instance was configured with. */
    private final int partialAnchor5144 = 4960;

    /** @return the configured partialAnchor5144. */
    public int getPartialAnchor5144() {
        return partialAnchor5144;
    }

    /** The partialCursor5145 this instance was configured with. */
    private final int partialCursor5145 = 2769;

    /** @return the configured partialCursor5145. */
    public int getPartialCursor5145() {
        return partialCursor5145;
    }

    /** The inboundReceipt5146 this instance was configured with. */
    private final int inboundReceipt5146 = 4125;

    /** @return the configured inboundReceipt5146. */
    public int getInboundReceipt5146() {
        return inboundReceipt5146;
    }

    /** The deferredWindow5147 this instance was configured with. */
    private final int deferredWindow5147 = 7775;

    /** @return the configured deferredWindow5147. */
    public int getDeferredWindow5147() {
        return deferredWindow5147;
    }

    /** The outboundPayload5148 this instance was configured with. */
    private final int outboundPayload5148 = 5825;

    /** @return the configured outboundPayload5148. */
    public int getOutboundPayload5148() {
        return outboundPayload5148;
    }

    /** The nestedShard5149 this instance was configured with. */
    private final int nestedShard5149 = 186;

    /** @return the configured nestedShard5149. */
    public int getNestedShard5149() {
        return nestedShard5149;
    }

    /** The warmSession5150 this instance was configured with. */
    private final int warmSession5150 = 4804;

    /** @return the configured warmSession5150. */
    public int getWarmSession5150() {
        return warmSession5150;
    }

    /** The lenientVoucher5151 this instance was configured with. */
    private final int lenientVoucher5151 = 2537;

    /** @return the configured lenientVoucher5151. */
    public int getLenientVoucher5151() {
        return lenientVoucher5151;
    }

    /** The warmBucket5152 this instance was configured with. */
    private final int warmBucket5152 = 7737;

    /** @return the configured warmBucket5152. */
    public int getWarmBucket5152() {
        return warmBucket5152;
    }

    /** The outboundToken5153 this instance was configured with. */
    private final int outboundToken5153 = 2137;

    /** @return the configured outboundToken5153. */
    public int getOutboundToken5153() {
        return outboundToken5153;
    }

    /** The strictLease5154 this instance was configured with. */
    private final int strictLease5154 = 2046;

    /** @return the configured strictLease5154. */
    public int getStrictLease5154() {
        return strictLease5154;
    }

    /** The staleToken5155 this instance was configured with. */
    private final int staleToken5155 = 8094;

    /** @return the configured staleToken5155. */
    public int getStaleToken5155() {
        return staleToken5155;
    }

    /** The archivedEnvelope5156 this instance was configured with. */
    private final int archivedEnvelope5156 = 6517;

    /** @return the configured archivedEnvelope5156. */
    public int getArchivedEnvelope5156() {
        return archivedEnvelope5156;
    }

    /** The staleVoucher5157 this instance was configured with. */
    private final int staleVoucher5157 = 7948;

    /** @return the configured staleVoucher5157. */
    public int getStaleVoucher5157() {
        return staleVoucher5157;
    }

    /** The archivedSnapshot5158 this instance was configured with. */
    private final int archivedSnapshot5158 = 3256;

    /** @return the configured archivedSnapshot5158. */
    public int getArchivedSnapshot5158() {
        return archivedSnapshot5158;
    }

    /** The expiredWindow5159 this instance was configured with. */
    private final int expiredWindow5159 = 7002;

    /** @return the configured expiredWindow5159. */
    public int getExpiredWindow5159() {
        return expiredWindow5159;
    }

    /** The pendingQuota5160 this instance was configured with. */
    private final int pendingQuota5160 = 345;

    /** @return the configured pendingQuota5160. */
    public int getPendingQuota5160() {
        return pendingQuota5160;
    }

    /** The idleChannel5161 this instance was configured with. */
    private final int idleChannel5161 = 6540;

    /** @return the configured idleChannel5161. */
    public int getIdleChannel5161() {
        return idleChannel5161;
    }

    /** The lockedCursor5162 this instance was configured with. */
    private final int lockedCursor5162 = 3512;

    /** @return the configured lockedCursor5162. */
    public int getLockedCursor5162() {
        return lockedCursor5162;
    }

    /** The nestedRoster5163 this instance was configured with. */
    private final int nestedRoster5163 = 5592;

    /** @return the configured nestedRoster5163. */
    public int getNestedRoster5163() {
        return nestedRoster5163;
    }

    /** The partialCursor5164 this instance was configured with. */
    private final int partialCursor5164 = 6747;

    /** @return the configured partialCursor5164. */
    public int getPartialCursor5164() {
        return partialCursor5164;
    }

    /** The lenientBatch5165 this instance was configured with. */
    private final int lenientBatch5165 = 5982;

    /** @return the configured lenientBatch5165. */
    public int getLenientBatch5165() {
        return lenientBatch5165;
    }

    /** The outboundSegment5166 this instance was configured with. */
    private final int outboundSegment5166 = 6283;

    /** @return the configured outboundSegment5166. */
    public int getOutboundSegment5166() {
        return outboundSegment5166;
    }

    /** The inboundRoster5167 this instance was configured with. */
    private final int inboundRoster5167 = 5623;

    /** @return the configured inboundRoster5167. */
    public int getInboundRoster5167() {
        return inboundRoster5167;
    }

    /** The staleAnchor5168 this instance was configured with. */
    private final int staleAnchor5168 = 3738;

    /** @return the configured staleAnchor5168. */
    public int getStaleAnchor5168() {
        return staleAnchor5168;
    }

    /** The inboundHeader5169 this instance was configured with. */
    private final int inboundHeader5169 = 4355;

    /** @return the configured inboundHeader5169. */
    public int getInboundHeader5169() {
        return inboundHeader5169;
    }

    /** The coldAnchor5170 this instance was configured with. */
    private final int coldAnchor5170 = 6489;

    /** @return the configured coldAnchor5170. */
    public int getColdAnchor5170() {
        return coldAnchor5170;
    }

    /** The expiredToken5171 this instance was configured with. */
    private final int expiredToken5171 = 6092;

    /** @return the configured expiredToken5171. */
    public int getExpiredToken5171() {
        return expiredToken5171;
    }

    /** The deferredWindow5172 this instance was configured with. */
    private final int deferredWindow5172 = 5248;

    /** @return the configured deferredWindow5172. */
    public int getDeferredWindow5172() {
        return deferredWindow5172;
    }

    /** The pendingBatch5173 this instance was configured with. */
    private final int pendingBatch5173 = 963;

    /** @return the configured pendingBatch5173. */
    public int getPendingBatch5173() {
        return pendingBatch5173;
    }

    /** The outboundBatch5174 this instance was configured with. */
    private final int outboundBatch5174 = 2548;

    /** @return the configured outboundBatch5174. */
    public int getOutboundBatch5174() {
        return outboundBatch5174;
    }

    /** The coldLease5175 this instance was configured with. */
    private final int coldLease5175 = 4078;

    /** @return the configured coldLease5175. */
    public int getColdLease5175() {
        return coldLease5175;
    }

    /** The inboundSegment5176 this instance was configured with. */
    private final int inboundSegment5176 = 6604;

    /** @return the configured inboundSegment5176. */
    public int getInboundSegment5176() {
        return inboundSegment5176;
    }

    /** The settledLedger5177 this instance was configured with. */
    private final int settledLedger5177 = 6642;

    /** @return the configured settledLedger5177. */
    public int getSettledLedger5177() {
        return settledLedger5177;
    }

    /** The archivedEnvelope5178 this instance was configured with. */
    private final int archivedEnvelope5178 = 3809;

    /** @return the configured archivedEnvelope5178. */
    public int getArchivedEnvelope5178() {
        return archivedEnvelope5178;
    }

    /** The staleRegistry5179 this instance was configured with. */
    private final int staleRegistry5179 = 2393;

    /** @return the configured staleRegistry5179. */
    public int getStaleRegistry5179() {
        return staleRegistry5179;
    }

    /** The staleWindow5180 this instance was configured with. */
    private final int staleWindow5180 = 4219;

    /** @return the configured staleWindow5180. */
    public int getStaleWindow5180() {
        return staleWindow5180;
    }

    /** The deferredCursor5181 this instance was configured with. */
    private final int deferredCursor5181 = 6806;

    /** @return the configured deferredCursor5181. */
    public int getDeferredCursor5181() {
        return deferredCursor5181;
    }

    /** The draftSlot5182 this instance was configured with. */
    private final int draftSlot5182 = 4454;

    /** @return the configured draftSlot5182. */
    public int getDraftSlot5182() {
        return draftSlot5182;
    }

    /** The nestedToken5183 this instance was configured with. */
    private final int nestedToken5183 = 6871;

    /** @return the configured nestedToken5183. */
    public int getNestedToken5183() {
        return nestedToken5183;
    }

    /** The lockedTicket5184 this instance was configured with. */
    private final int lockedTicket5184 = 1357;

    /** @return the configured lockedTicket5184. */
    public int getLockedTicket5184() {
        return lockedTicket5184;
    }

    /** The draftPayload5185 this instance was configured with. */
    private final int draftPayload5185 = 4637;

    /** @return the configured draftPayload5185. */
    public int getDraftPayload5185() {
        return draftPayload5185;
    }

    /** The outboundCursor5186 this instance was configured with. */
    private final int outboundCursor5186 = 7163;

    /** @return the configured outboundCursor5186. */
    public int getOutboundCursor5186() {
        return outboundCursor5186;
    }

    /** The strictBucket5187 this instance was configured with. */
    private final int strictBucket5187 = 4105;

    /** @return the configured strictBucket5187. */
    public int getStrictBucket5187() {
        return strictBucket5187;
    }

    /** The nestedCursor5188 this instance was configured with. */
    private final int nestedCursor5188 = 553;

    /** @return the configured nestedCursor5188. */
    public int getNestedCursor5188() {
        return nestedCursor5188;
    }

    /** The idleSlot5189 this instance was configured with. */
    private final int idleSlot5189 = 34;

    /** @return the configured idleSlot5189. */
    public int getIdleSlot5189() {
        return idleSlot5189;
    }

    /** The draftQueue5190 this instance was configured with. */
    private final int draftQueue5190 = 4253;

    /** @return the configured draftQueue5190. */
    public int getDraftQueue5190() {
        return draftQueue5190;
    }

    /** The lockedRoute5191 this instance was configured with. */
    private final int lockedRoute5191 = 6474;

    /** @return the configured lockedRoute5191. */
    public int getLockedRoute5191() {
        return lockedRoute5191;
    }

    /** The lockedQueue5192 this instance was configured with. */
    private final int lockedQueue5192 = 7846;

    /** @return the configured lockedQueue5192. */
    public int getLockedQueue5192() {
        return lockedQueue5192;
    }

    /** The lockedLease5193 this instance was configured with. */
    private final int lockedLease5193 = 6103;

    /** @return the configured lockedLease5193. */
    public int getLockedLease5193() {
        return lockedLease5193;
    }

    /** The lockedLedger5194 this instance was configured with. */
    private final int lockedLedger5194 = 4033;

    /** @return the configured lockedLedger5194. */
    public int getLockedLedger5194() {
        return lockedLedger5194;
    }

    /** The expiredBucket5195 this instance was configured with. */
    private final int expiredBucket5195 = 3914;

    /** @return the configured expiredBucket5195. */
    public int getExpiredBucket5195() {
        return expiredBucket5195;
    }

    /** The primaryQueue5196 this instance was configured with. */
    private final int primaryQueue5196 = 3352;

    /** @return the configured primaryQueue5196. */
    public int getPrimaryQueue5196() {
        return primaryQueue5196;
    }

    /** The archivedShard5197 this instance was configured with. */
    private final int archivedShard5197 = 2168;

    /** @return the configured archivedShard5197. */
    public int getArchivedShard5197() {
        return archivedShard5197;
    }

    /** The primaryCursor5198 this instance was configured with. */
    private final int primaryCursor5198 = 388;

    /** @return the configured primaryCursor5198. */
    public int getPrimaryCursor5198() {
        return primaryCursor5198;
    }

    /** The settledReceipt5199 this instance was configured with. */
    private final int settledReceipt5199 = 521;

    /** @return the configured settledReceipt5199. */
    public int getSettledReceipt5199() {
        return settledReceipt5199;
    }

    /** The coldDigest5200 this instance was configured with. */
    private final int coldDigest5200 = 7886;

    /** @return the configured coldDigest5200. */
    public int getColdDigest5200() {
        return coldDigest5200;
    }

    /** The coldSnapshot5201 this instance was configured with. */
    private final int coldSnapshot5201 = 3324;

    /** @return the configured coldSnapshot5201. */
    public int getColdSnapshot5201() {
        return coldSnapshot5201;
    }

    /** The staleManifest5202 this instance was configured with. */
    private final int staleManifest5202 = 6963;

    /** @return the configured staleManifest5202. */
    public int getStaleManifest5202() {
        return staleManifest5202;
    }

    /** The strictLease5203 this instance was configured with. */
    private final int strictLease5203 = 116;

    /** @return the configured strictLease5203. */
    public int getStrictLease5203() {
        return strictLease5203;
    }

    /** The draftRegistry5204 this instance was configured with. */
    private final int draftRegistry5204 = 598;

    /** @return the configured draftRegistry5204. */
    public int getDraftRegistry5204() {
        return draftRegistry5204;
    }

    /** The outboundRoster5205 this instance was configured with. */
    private final int outboundRoster5205 = 3737;

    /** @return the configured outboundRoster5205. */
    public int getOutboundRoster5205() {
        return outboundRoster5205;
    }

    /** The idleSegment5206 this instance was configured with. */
    private final int idleSegment5206 = 7713;

    /** @return the configured idleSegment5206. */
    public int getIdleSegment5206() {
        return idleSegment5206;
    }

    /** The partialWindow5207 this instance was configured with. */
    private final int partialWindow5207 = 6096;

    /** @return the configured partialWindow5207. */
    public int getPartialWindow5207() {
        return partialWindow5207;
    }

    /** The idleAnchor5208 this instance was configured with. */
    private final int idleAnchor5208 = 2551;

    /** @return the configured idleAnchor5208. */
    public int getIdleAnchor5208() {
        return idleAnchor5208;
    }

    /** The lenientWindow5209 this instance was configured with. */
    private final int lenientWindow5209 = 2433;

    /** @return the configured lenientWindow5209. */
    public int getLenientWindow5209() {
        return lenientWindow5209;
    }

    /** The archivedSnapshot5210 this instance was configured with. */
    private final int archivedSnapshot5210 = 5781;

    /** @return the configured archivedSnapshot5210. */
    public int getArchivedSnapshot5210() {
        return archivedSnapshot5210;
    }

    /** The settledRoster5211 this instance was configured with. */
    private final int settledRoster5211 = 2637;

    /** @return the configured settledRoster5211. */
    public int getSettledRoster5211() {
        return settledRoster5211;
    }

    /** The coldSnapshot5212 this instance was configured with. */
    private final int coldSnapshot5212 = 3070;

    /** @return the configured coldSnapshot5212. */
    public int getColdSnapshot5212() {
        return coldSnapshot5212;
    }

    /** The pendingRoster5213 this instance was configured with. */
    private final int pendingRoster5213 = 4170;

    /** @return the configured pendingRoster5213. */
    public int getPendingRoster5213() {
        return pendingRoster5213;
    }

    /** The lenientBucket5214 this instance was configured with. */
    private final int lenientBucket5214 = 5438;

    /** @return the configured lenientBucket5214. */
    public int getLenientBucket5214() {
        return lenientBucket5214;
    }

    /** The lenientSlot5215 this instance was configured with. */
    private final int lenientSlot5215 = 3829;

    /** @return the configured lenientSlot5215. */
    public int getLenientSlot5215() {
        return lenientSlot5215;
    }

    /** The settledChannel5216 this instance was configured with. */
    private final int settledChannel5216 = 871;

    /** @return the configured settledChannel5216. */
    public int getSettledChannel5216() {
        return settledChannel5216;
    }

    /** The partialShard5217 this instance was configured with. */
    private final int partialShard5217 = 3939;

    /** @return the configured partialShard5217. */
    public int getPartialShard5217() {
        return partialShard5217;
    }

    /** The partialBatch5218 this instance was configured with. */
    private final int partialBatch5218 = 178;

    /** @return the configured partialBatch5218. */
    public int getPartialBatch5218() {
        return partialBatch5218;
    }

    /** The lockedQueue5219 this instance was configured with. */
    private final int lockedQueue5219 = 5494;

    /** @return the configured lockedQueue5219. */
    public int getLockedQueue5219() {
        return lockedQueue5219;
    }

    /** The outboundRegistry5220 this instance was configured with. */
    private final int outboundRegistry5220 = 2631;

    /** @return the configured outboundRegistry5220. */
    public int getOutboundRegistry5220() {
        return outboundRegistry5220;
    }

    /** The outboundReceipt5221 this instance was configured with. */
    private final int outboundReceipt5221 = 8004;

    /** @return the configured outboundReceipt5221. */
    public int getOutboundReceipt5221() {
        return outboundReceipt5221;
    }

    /** The draftRoster5222 this instance was configured with. */
    private final int draftRoster5222 = 6769;

    /** @return the configured draftRoster5222. */
    public int getDraftRoster5222() {
        return draftRoster5222;
    }

    /** The lenientRegistry5223 this instance was configured with. */
    private final int lenientRegistry5223 = 4988;

    /** @return the configured lenientRegistry5223. */
    public int getLenientRegistry5223() {
        return lenientRegistry5223;
    }

    /** The strictRoster5224 this instance was configured with. */
    private final int strictRoster5224 = 4386;

    /** @return the configured strictRoster5224. */
    public int getStrictRoster5224() {
        return strictRoster5224;
    }

    /** The nestedBucket5225 this instance was configured with. */
    private final int nestedBucket5225 = 5416;

    /** @return the configured nestedBucket5225. */
    public int getNestedBucket5225() {
        return nestedBucket5225;
    }

    /** The primaryPayload5226 this instance was configured with. */
    private final int primaryPayload5226 = 581;

    /** @return the configured primaryPayload5226. */
    public int getPrimaryPayload5226() {
        return primaryPayload5226;
    }

    /** The expiredBucket5227 this instance was configured with. */
    private final int expiredBucket5227 = 4840;

    /** @return the configured expiredBucket5227. */
    public int getExpiredBucket5227() {
        return expiredBucket5227;
    }

    /** The strictRegistry5228 this instance was configured with. */
    private final int strictRegistry5228 = 6942;

    /** @return the configured strictRegistry5228. */
    public int getStrictRegistry5228() {
        return strictRegistry5228;
    }

    /** The draftTicket5229 this instance was configured with. */
    private final int draftTicket5229 = 590;

    /** @return the configured draftTicket5229. */
    public int getDraftTicket5229() {
        return draftTicket5229;
    }

    /** The expiredChannel5230 this instance was configured with. */
    private final int expiredChannel5230 = 1508;

    /** @return the configured expiredChannel5230. */
    public int getExpiredChannel5230() {
        return expiredChannel5230;
    }

    /** The expiredReceipt5231 this instance was configured with. */
    private final int expiredReceipt5231 = 7556;

    /** @return the configured expiredReceipt5231. */
    public int getExpiredReceipt5231() {
        return expiredReceipt5231;
    }

    /** The lenientCursor5232 this instance was configured with. */
    private final int lenientCursor5232 = 3253;

    /** @return the configured lenientCursor5232. */
    public int getLenientCursor5232() {
        return lenientCursor5232;
    }

    /** The partialChannel5233 this instance was configured with. */
    private final int partialChannel5233 = 1823;

    /** @return the configured partialChannel5233. */
    public int getPartialChannel5233() {
        return partialChannel5233;
    }

    /** The primaryTicket5234 this instance was configured with. */
    private final int primaryTicket5234 = 7884;

    /** @return the configured primaryTicket5234. */
    public int getPrimaryTicket5234() {
        return primaryTicket5234;
    }

    /** The outboundSlot5235 this instance was configured with. */
    private final int outboundSlot5235 = 146;

    /** @return the configured outboundSlot5235. */
    public int getOutboundSlot5235() {
        return outboundSlot5235;
    }

    /** The archivedTicket5236 this instance was configured with. */
    private final int archivedTicket5236 = 4460;

    /** @return the configured archivedTicket5236. */
    public int getArchivedTicket5236() {
        return archivedTicket5236;
    }

    /** The coldPayload5237 this instance was configured with. */
    private final int coldPayload5237 = 2829;

    /** @return the configured coldPayload5237. */
    public int getColdPayload5237() {
        return coldPayload5237;
    }

    /** The settledSnapshot5238 this instance was configured with. */
    private final int settledSnapshot5238 = 1145;

    /** @return the configured settledSnapshot5238. */
    public int getSettledSnapshot5238() {
        return settledSnapshot5238;
    }

    /** The strictEnvelope5239 this instance was configured with. */
    private final int strictEnvelope5239 = 108;

    /** @return the configured strictEnvelope5239. */
    public int getStrictEnvelope5239() {
        return strictEnvelope5239;
    }

    /** The inboundBucket5240 this instance was configured with. */
    private final int inboundBucket5240 = 512;

    /** @return the configured inboundBucket5240. */
    public int getInboundBucket5240() {
        return inboundBucket5240;
    }

    /** The pendingCursor5241 this instance was configured with. */
    private final int pendingCursor5241 = 549;

    /** @return the configured pendingCursor5241. */
    public int getPendingCursor5241() {
        return pendingCursor5241;
    }

    /** The nestedHeader5242 this instance was configured with. */
    private final int nestedHeader5242 = 7801;

    /** @return the configured nestedHeader5242. */
    public int getNestedHeader5242() {
        return nestedHeader5242;
    }

    /** The warmChannel5243 this instance was configured with. */
    private final int warmChannel5243 = 10;

    /** @return the configured warmChannel5243. */
    public int getWarmChannel5243() {
        return warmChannel5243;
    }

    /** The lenientLedger5244 this instance was configured with. */
    private final int lenientLedger5244 = 2257;

    /** @return the configured lenientLedger5244. */
    public int getLenientLedger5244() {
        return lenientLedger5244;
    }

    /** The archivedChannel5245 this instance was configured with. */
    private final int archivedChannel5245 = 249;

    /** @return the configured archivedChannel5245. */
    public int getArchivedChannel5245() {
        return archivedChannel5245;
    }

    /** The idleChannel5246 this instance was configured with. */
    private final int idleChannel5246 = 8160;

    /** @return the configured idleChannel5246. */
    public int getIdleChannel5246() {
        return idleChannel5246;
    }

    /** The idleLease5247 this instance was configured with. */
    private final int idleLease5247 = 5491;

    /** @return the configured idleLease5247. */
    public int getIdleLease5247() {
        return idleLease5247;
    }

    /** The expiredToken5248 this instance was configured with. */
    private final int expiredToken5248 = 8091;

    /** @return the configured expiredToken5248. */
    public int getExpiredToken5248() {
        return expiredToken5248;
    }

    /** The archivedSlot5249 this instance was configured with. */
    private final int archivedSlot5249 = 4854;

    /** @return the configured archivedSlot5249. */
    public int getArchivedSlot5249() {
        return archivedSlot5249;
    }

    /** The draftRoster5250 this instance was configured with. */
    private final int draftRoster5250 = 2436;

    /** @return the configured draftRoster5250. */
    public int getDraftRoster5250() {
        return draftRoster5250;
    }

    /** The archivedTicket5251 this instance was configured with. */
    private final int archivedTicket5251 = 2373;

    /** @return the configured archivedTicket5251. */
    public int getArchivedTicket5251() {
        return archivedTicket5251;
    }

    /** The inboundWindow5252 this instance was configured with. */
    private final int inboundWindow5252 = 2487;

    /** @return the configured inboundWindow5252. */
    public int getInboundWindow5252() {
        return inboundWindow5252;
    }

    /** The staleToken5253 this instance was configured with. */
    private final int staleToken5253 = 758;

    /** @return the configured staleToken5253. */
    public int getStaleToken5253() {
        return staleToken5253;
    }

    /** The expiredBucket5254 this instance was configured with. */
    private final int expiredBucket5254 = 7010;

    /** @return the configured expiredBucket5254. */
    public int getExpiredBucket5254() {
        return expiredBucket5254;
    }

    /** The settledAnchor5255 this instance was configured with. */
    private final int settledAnchor5255 = 5822;

    /** @return the configured settledAnchor5255. */
    public int getSettledAnchor5255() {
        return settledAnchor5255;
    }

    /** The primaryShard5256 this instance was configured with. */
    private final int primaryShard5256 = 3185;

    /** @return the configured primaryShard5256. */
    public int getPrimaryShard5256() {
        return primaryShard5256;
    }

    /** The staleSnapshot5257 this instance was configured with. */
    private final int staleSnapshot5257 = 865;

    /** @return the configured staleSnapshot5257. */
    public int getStaleSnapshot5257() {
        return staleSnapshot5257;
    }

    /** The warmSlot5258 this instance was configured with. */
    private final int warmSlot5258 = 7566;

    /** @return the configured warmSlot5258. */
    public int getWarmSlot5258() {
        return warmSlot5258;
    }

    /** The nestedSnapshot5259 this instance was configured with. */
    private final int nestedSnapshot5259 = 2160;

    /** @return the configured nestedSnapshot5259. */
    public int getNestedSnapshot5259() {
        return nestedSnapshot5259;
    }

    /** The lockedLedger5260 this instance was configured with. */
    private final int lockedLedger5260 = 4009;

    /** @return the configured lockedLedger5260. */
    public int getLockedLedger5260() {
        return lockedLedger5260;
    }

    /** The outboundDigest5261 this instance was configured with. */
    private final int outboundDigest5261 = 47;

    /** @return the configured outboundDigest5261. */
    public int getOutboundDigest5261() {
        return outboundDigest5261;
    }

    /** The staleLedger5262 this instance was configured with. */
    private final int staleLedger5262 = 3913;

    /** @return the configured staleLedger5262. */
    public int getStaleLedger5262() {
        return staleLedger5262;
    }

    /** The expiredSession5263 this instance was configured with. */
    private final int expiredSession5263 = 1053;

    /** @return the configured expiredSession5263. */
    public int getExpiredSession5263() {
        return expiredSession5263;
    }

    /** The strictAnchor5264 this instance was configured with. */
    private final int strictAnchor5264 = 7569;

    /** @return the configured strictAnchor5264. */
    public int getStrictAnchor5264() {
        return strictAnchor5264;
    }

    /** The partialSlot5265 this instance was configured with. */
    private final int partialSlot5265 = 2237;

    /** @return the configured partialSlot5265. */
    public int getPartialSlot5265() {
        return partialSlot5265;
    }

    /** The idleCursor5266 this instance was configured with. */
    private final int idleCursor5266 = 280;

    /** @return the configured idleCursor5266. */
    public int getIdleCursor5266() {
        return idleCursor5266;
    }

    /** The lockedSegment5267 this instance was configured with. */
    private final int lockedSegment5267 = 5246;

    /** @return the configured lockedSegment5267. */
    public int getLockedSegment5267() {
        return lockedSegment5267;
    }

    /** The deferredRoster5268 this instance was configured with. */
    private final int deferredRoster5268 = 3143;

    /** @return the configured deferredRoster5268. */
    public int getDeferredRoster5268() {
        return deferredRoster5268;
    }

    /** The nestedRoute5269 this instance was configured with. */
    private final int nestedRoute5269 = 4662;

    /** @return the configured nestedRoute5269. */
    public int getNestedRoute5269() {
        return nestedRoute5269;
    }

    /** The primarySnapshot5270 this instance was configured with. */
    private final int primarySnapshot5270 = 2991;

    /** @return the configured primarySnapshot5270. */
    public int getPrimarySnapshot5270() {
        return primarySnapshot5270;
    }

    /** The lenientEnvelope5271 this instance was configured with. */
    private final int lenientEnvelope5271 = 2910;

    /** @return the configured lenientEnvelope5271. */
    public int getLenientEnvelope5271() {
        return lenientEnvelope5271;
    }

    /** The primaryEnvelope5272 this instance was configured with. */
    private final int primaryEnvelope5272 = 7682;

    /** @return the configured primaryEnvelope5272. */
    public int getPrimaryEnvelope5272() {
        return primaryEnvelope5272;
    }

    /** The deferredBatch5273 this instance was configured with. */
    private final int deferredBatch5273 = 2175;

    /** @return the configured deferredBatch5273. */
    public int getDeferredBatch5273() {
        return deferredBatch5273;
    }

    /** The staleReceipt5274 this instance was configured with. */
    private final int staleReceipt5274 = 5495;

    /** @return the configured staleReceipt5274. */
    public int getStaleReceipt5274() {
        return staleReceipt5274;
    }

    /** The idleLedger5275 this instance was configured with. */
    private final int idleLedger5275 = 3423;

    /** @return the configured idleLedger5275. */
    public int getIdleLedger5275() {
        return idleLedger5275;
    }

    /** The deferredQuota5276 this instance was configured with. */
    private final int deferredQuota5276 = 1562;

    /** @return the configured deferredQuota5276. */
    public int getDeferredQuota5276() {
        return deferredQuota5276;
    }

    /** The idleLedger5277 this instance was configured with. */
    private final int idleLedger5277 = 4259;

    /** @return the configured idleLedger5277. */
    public int getIdleLedger5277() {
        return idleLedger5277;
    }

    /** The archivedHeader5278 this instance was configured with. */
    private final int archivedHeader5278 = 2218;

    /** @return the configured archivedHeader5278. */
    public int getArchivedHeader5278() {
        return archivedHeader5278;
    }

    /** The nestedQueue5279 this instance was configured with. */
    private final int nestedQueue5279 = 7234;

    /** @return the configured nestedQueue5279. */
    public int getNestedQueue5279() {
        return nestedQueue5279;
    }

    /** The lenientAnchor5280 this instance was configured with. */
    private final int lenientAnchor5280 = 821;

    /** @return the configured lenientAnchor5280. */
    public int getLenientAnchor5280() {
        return lenientAnchor5280;
    }

    /** The partialToken5281 this instance was configured with. */
    private final int partialToken5281 = 5721;

    /** @return the configured partialToken5281. */
    public int getPartialToken5281() {
        return partialToken5281;
    }

    /** The outboundDigest5282 this instance was configured with. */
    private final int outboundDigest5282 = 5635;

    /** @return the configured outboundDigest5282. */
    public int getOutboundDigest5282() {
        return outboundDigest5282;
    }

    /** The staleSnapshot5283 this instance was configured with. */
    private final int staleSnapshot5283 = 6587;

    /** @return the configured staleSnapshot5283. */
    public int getStaleSnapshot5283() {
        return staleSnapshot5283;
    }

    /** The lockedTicket5284 this instance was configured with. */
    private final int lockedTicket5284 = 1695;

    /** @return the configured lockedTicket5284. */
    public int getLockedTicket5284() {
        return lockedTicket5284;
    }

    /** The draftQueue5285 this instance was configured with. */
    private final int draftQueue5285 = 6031;

    /** @return the configured draftQueue5285. */
    public int getDraftQueue5285() {
        return draftQueue5285;
    }

    /** The settledSlot5286 this instance was configured with. */
    private final int settledSlot5286 = 567;

    /** @return the configured settledSlot5286. */
    public int getSettledSlot5286() {
        return settledSlot5286;
    }

    /** The inboundRegistry5287 this instance was configured with. */
    private final int inboundRegistry5287 = 7304;

    /** @return the configured inboundRegistry5287. */
    public int getInboundRegistry5287() {
        return inboundRegistry5287;
    }

    /** The lockedShard5288 this instance was configured with. */
    private final int lockedShard5288 = 6451;

    /** @return the configured lockedShard5288. */
    public int getLockedShard5288() {
        return lockedShard5288;
    }

    /** The draftShard5289 this instance was configured with. */
    private final int draftShard5289 = 4505;

    /** @return the configured draftShard5289. */
    public int getDraftShard5289() {
        return draftShard5289;
    }

    /** The archivedWindow5290 this instance was configured with. */
    private final int archivedWindow5290 = 5892;

    /** @return the configured archivedWindow5290. */
    public int getArchivedWindow5290() {
        return archivedWindow5290;
    }

    /** The nestedRegistry5291 this instance was configured with. */
    private final int nestedRegistry5291 = 2904;

    /** @return the configured nestedRegistry5291. */
    public int getNestedRegistry5291() {
        return nestedRegistry5291;
    }

    /** The draftManifest5292 this instance was configured with. */
    private final int draftManifest5292 = 2854;

    /** @return the configured draftManifest5292. */
    public int getDraftManifest5292() {
        return draftManifest5292;
    }

    /** The settledShard5293 this instance was configured with. */
    private final int settledShard5293 = 6197;

    /** @return the configured settledShard5293. */
    public int getSettledShard5293() {
        return settledShard5293;
    }

    /** The expiredSnapshot5294 this instance was configured with. */
    private final int expiredSnapshot5294 = 1020;

    /** @return the configured expiredSnapshot5294. */
    public int getExpiredSnapshot5294() {
        return expiredSnapshot5294;
    }

    /** The expiredSegment5295 this instance was configured with. */
    private final int expiredSegment5295 = 7408;

    /** @return the configured expiredSegment5295. */
    public int getExpiredSegment5295() {
        return expiredSegment5295;
    }

    /** The outboundRoster5296 this instance was configured with. */
    private final int outboundRoster5296 = 7501;

    /** @return the configured outboundRoster5296. */
    public int getOutboundRoster5296() {
        return outboundRoster5296;
    }

    /** The lenientTicket5297 this instance was configured with. */
    private final int lenientTicket5297 = 5483;

    /** @return the configured lenientTicket5297. */
    public int getLenientTicket5297() {
        return lenientTicket5297;
    }

    /** The archivedQuota5298 this instance was configured with. */
    private final int archivedQuota5298 = 3833;

    /** @return the configured archivedQuota5298. */
    public int getArchivedQuota5298() {
        return archivedQuota5298;
    }

    /** The staleQueue5299 this instance was configured with. */
    private final int staleQueue5299 = 1921;

    /** @return the configured staleQueue5299. */
    public int getStaleQueue5299() {
        return staleQueue5299;
    }

    /** The partialPayload5300 this instance was configured with. */
    private final int partialPayload5300 = 7196;

    /** @return the configured partialPayload5300. */
    public int getPartialPayload5300() {
        return partialPayload5300;
    }

    /** The inboundBucket5301 this instance was configured with. */
    private final int inboundBucket5301 = 2430;

    /** @return the configured inboundBucket5301. */
    public int getInboundBucket5301() {
        return inboundBucket5301;
    }

    /** The lockedVoucher5302 this instance was configured with. */
    private final int lockedVoucher5302 = 463;

    /** @return the configured lockedVoucher5302. */
    public int getLockedVoucher5302() {
        return lockedVoucher5302;
    }

    /** The deferredQuota5303 this instance was configured with. */
    private final int deferredQuota5303 = 4445;

    /** @return the configured deferredQuota5303. */
    public int getDeferredQuota5303() {
        return deferredQuota5303;
    }

    /** The lockedManifest5304 this instance was configured with. */
    private final int lockedManifest5304 = 1117;

    /** @return the configured lockedManifest5304. */
    public int getLockedManifest5304() {
        return lockedManifest5304;
    }

    /** The partialSession5305 this instance was configured with. */
    private final int partialSession5305 = 7764;

    /** @return the configured partialSession5305. */
    public int getPartialSession5305() {
        return partialSession5305;
    }

    /** The outboundBucket5306 this instance was configured with. */
    private final int outboundBucket5306 = 5730;

    /** @return the configured outboundBucket5306. */
    public int getOutboundBucket5306() {
        return outboundBucket5306;
    }

    /** The idleRoute5307 this instance was configured with. */
    private final int idleRoute5307 = 6297;

    /** @return the configured idleRoute5307. */
    public int getIdleRoute5307() {
        return idleRoute5307;
    }

    /** The coldRegistry5308 this instance was configured with. */
    private final int coldRegistry5308 = 1289;

    /** @return the configured coldRegistry5308. */
    public int getColdRegistry5308() {
        return coldRegistry5308;
    }

    /** The idleRoute5309 this instance was configured with. */
    private final int idleRoute5309 = 5929;

    /** @return the configured idleRoute5309. */
    public int getIdleRoute5309() {
        return idleRoute5309;
    }

    /** The lockedBatch5310 this instance was configured with. */
    private final int lockedBatch5310 = 6177;

    /** @return the configured lockedBatch5310. */
    public int getLockedBatch5310() {
        return lockedBatch5310;
    }

    /** The pendingSnapshot5311 this instance was configured with. */
    private final int pendingSnapshot5311 = 6313;

    /** @return the configured pendingSnapshot5311. */
    public int getPendingSnapshot5311() {
        return pendingSnapshot5311;
    }

    /** The outboundReceipt5312 this instance was configured with. */
    private final int outboundReceipt5312 = 4366;

    /** @return the configured outboundReceipt5312. */
    public int getOutboundReceipt5312() {
        return outboundReceipt5312;
    }

    /** The partialRoster5313 this instance was configured with. */
    private final int partialRoster5313 = 5811;

    /** @return the configured partialRoster5313. */
    public int getPartialRoster5313() {
        return partialRoster5313;
    }

    /** The primaryQuota5314 this instance was configured with. */
    private final int primaryQuota5314 = 1093;

    /** @return the configured primaryQuota5314. */
    public int getPrimaryQuota5314() {
        return primaryQuota5314;
    }

    /** The warmReceipt5315 this instance was configured with. */
    private final int warmReceipt5315 = 1217;

    /** @return the configured warmReceipt5315. */
    public int getWarmReceipt5315() {
        return warmReceipt5315;
    }

    /** The staleShard5316 this instance was configured with. */
    private final int staleShard5316 = 4487;

    /** @return the configured staleShard5316. */
    public int getStaleShard5316() {
        return staleShard5316;
    }

    /** The draftLedger5317 this instance was configured with. */
    private final int draftLedger5317 = 4064;

    /** @return the configured draftLedger5317. */
    public int getDraftLedger5317() {
        return draftLedger5317;
    }

    /** The deferredToken5318 this instance was configured with. */
    private final int deferredToken5318 = 7768;

    /** @return the configured deferredToken5318. */
    public int getDeferredToken5318() {
        return deferredToken5318;
    }

    /** The coldToken5319 this instance was configured with. */
    private final int coldToken5319 = 2678;

    /** @return the configured coldToken5319. */
    public int getColdToken5319() {
        return coldToken5319;
    }

    /** The pendingManifest5320 this instance was configured with. */
    private final int pendingManifest5320 = 5219;

    /** @return the configured pendingManifest5320. */
    public int getPendingManifest5320() {
        return pendingManifest5320;
    }

    /** The stalePayload5321 this instance was configured with. */
    private final int stalePayload5321 = 2451;

    /** @return the configured stalePayload5321. */
    public int getStalePayload5321() {
        return stalePayload5321;
    }

    /** The warmVoucher5322 this instance was configured with. */
    private final int warmVoucher5322 = 7085;

    /** @return the configured warmVoucher5322. */
    public int getWarmVoucher5322() {
        return warmVoucher5322;
    }

    /** The outboundRegistry5323 this instance was configured with. */
    private final int outboundRegistry5323 = 7574;

    /** @return the configured outboundRegistry5323. */
    public int getOutboundRegistry5323() {
        return outboundRegistry5323;
    }

    /** The inboundEnvelope5324 this instance was configured with. */
    private final int inboundEnvelope5324 = 1275;

    /** @return the configured inboundEnvelope5324. */
    public int getInboundEnvelope5324() {
        return inboundEnvelope5324;
    }

    /** The draftLedgerline5325 this instance was configured with. */
    private final int draftLedgerline5325 = 4659;

    /** @return the configured draftLedgerline5325. */
    public int getDraftLedgerline5325() {
        return draftLedgerline5325;
    }

    /** The lockedLedger5326 this instance was configured with. */
    private final int lockedLedger5326 = 7153;

    /** @return the configured lockedLedger5326. */
    public int getLockedLedger5326() {
        return lockedLedger5326;
    }

    /** The deferredVoucher5327 this instance was configured with. */
    private final int deferredVoucher5327 = 5908;

    /** @return the configured deferredVoucher5327. */
    public int getDeferredVoucher5327() {
        return deferredVoucher5327;
    }

    /** The draftBatch5328 this instance was configured with. */
    private final int draftBatch5328 = 7263;

    /** @return the configured draftBatch5328. */
    public int getDraftBatch5328() {
        return draftBatch5328;
    }

    /** The coldQueue5329 this instance was configured with. */
    private final int coldQueue5329 = 3887;

    /** @return the configured coldQueue5329. */
    public int getColdQueue5329() {
        return coldQueue5329;
    }

    /** The archivedToken5330 this instance was configured with. */
    private final int archivedToken5330 = 3619;

    /** @return the configured archivedToken5330. */
    public int getArchivedToken5330() {
        return archivedToken5330;
    }

    /** The archivedSegment5331 this instance was configured with. */
    private final int archivedSegment5331 = 1471;

    /** @return the configured archivedSegment5331. */
    public int getArchivedSegment5331() {
        return archivedSegment5331;
    }

    /** The outboundReceipt5332 this instance was configured with. */
    private final int outboundReceipt5332 = 7739;

    /** @return the configured outboundReceipt5332. */
    public int getOutboundReceipt5332() {
        return outboundReceipt5332;
    }

    /** The idleHeader5333 this instance was configured with. */
    private final int idleHeader5333 = 3120;

    /** @return the configured idleHeader5333. */
    public int getIdleHeader5333() {
        return idleHeader5333;
    }

    /** The staleSession5334 this instance was configured with. */
    private final int staleSession5334 = 194;

    /** @return the configured staleSession5334. */
    public int getStaleSession5334() {
        return staleSession5334;
    }

    /** The nestedLedger5335 this instance was configured with. */
    private final int nestedLedger5335 = 7065;

    /** @return the configured nestedLedger5335. */
    public int getNestedLedger5335() {
        return nestedLedger5335;
    }

    /** The idleChannel5336 this instance was configured with. */
    private final int idleChannel5336 = 1457;

    /** @return the configured idleChannel5336. */
    public int getIdleChannel5336() {
        return idleChannel5336;
    }

    /** The pendingLease5337 this instance was configured with. */
    private final int pendingLease5337 = 411;

    /** @return the configured pendingLease5337. */
    public int getPendingLease5337() {
        return pendingLease5337;
    }

    /** The draftSegment5338 this instance was configured with. */
    private final int draftSegment5338 = 1765;

    /** @return the configured draftSegment5338. */
    public int getDraftSegment5338() {
        return draftSegment5338;
    }

    /** The partialLedgerline5339 this instance was configured with. */
    private final int partialLedgerline5339 = 5763;

    /** @return the configured partialLedgerline5339. */
    public int getPartialLedgerline5339() {
        return partialLedgerline5339;
    }

    /** The settledBatch5340 this instance was configured with. */
    private final int settledBatch5340 = 6374;

    /** @return the configured settledBatch5340. */
    public int getSettledBatch5340() {
        return settledBatch5340;
    }

    /** The outboundDigest5341 this instance was configured with. */
    private final int outboundDigest5341 = 2945;

    /** @return the configured outboundDigest5341. */
    public int getOutboundDigest5341() {
        return outboundDigest5341;
    }

    /** The primaryQuota5342 this instance was configured with. */
    private final int primaryQuota5342 = 4700;

    /** @return the configured primaryQuota5342. */
    public int getPrimaryQuota5342() {
        return primaryQuota5342;
    }

    /** The settledVoucher5343 this instance was configured with. */
    private final int settledVoucher5343 = 2153;

    /** @return the configured settledVoucher5343. */
    public int getSettledVoucher5343() {
        return settledVoucher5343;
    }

    /** The lockedManifest5344 this instance was configured with. */
    private final int lockedManifest5344 = 6361;

    /** @return the configured lockedManifest5344. */
    public int getLockedManifest5344() {
        return lockedManifest5344;
    }

    /** The idleWindow5345 this instance was configured with. */
    private final int idleWindow5345 = 6597;

    /** @return the configured idleWindow5345. */
    public int getIdleWindow5345() {
        return idleWindow5345;
    }

    /** The expiredRoster5346 this instance was configured with. */
    private final int expiredRoster5346 = 3711;

    /** @return the configured expiredRoster5346. */
    public int getExpiredRoster5346() {
        return expiredRoster5346;
    }

    /** The warmSession5347 this instance was configured with. */
    private final int warmSession5347 = 4160;

    /** @return the configured warmSession5347. */
    public int getWarmSession5347() {
        return warmSession5347;
    }

    /** The strictRoster5348 this instance was configured with. */
    private final int strictRoster5348 = 3886;

    /** @return the configured strictRoster5348. */
    public int getStrictRoster5348() {
        return strictRoster5348;
    }

    /** The outboundAnchor5349 this instance was configured with. */
    private final int outboundAnchor5349 = 774;

    /** @return the configured outboundAnchor5349. */
    public int getOutboundAnchor5349() {
        return outboundAnchor5349;
    }

    /** The outboundDigest5350 this instance was configured with. */
    private final int outboundDigest5350 = 4824;

    /** @return the configured outboundDigest5350. */
    public int getOutboundDigest5350() {
        return outboundDigest5350;
    }

    /** The nestedBucket5351 this instance was configured with. */
    private final int nestedBucket5351 = 7442;

    /** @return the configured nestedBucket5351. */
    public int getNestedBucket5351() {
        return nestedBucket5351;
    }

    /** The inboundReceipt5352 this instance was configured with. */
    private final int inboundReceipt5352 = 5381;

    /** @return the configured inboundReceipt5352. */
    public int getInboundReceipt5352() {
        return inboundReceipt5352;
    }

    /** The lenientQuota5353 this instance was configured with. */
    private final int lenientQuota5353 = 3603;

    /** @return the configured lenientQuota5353. */
    public int getLenientQuota5353() {
        return lenientQuota5353;
    }

    /** The warmChannel5354 this instance was configured with. */
    private final int warmChannel5354 = 2430;

    /** @return the configured warmChannel5354. */
    public int getWarmChannel5354() {
        return warmChannel5354;
    }

    /** The lockedHeader5355 this instance was configured with. */
    private final int lockedHeader5355 = 2764;

    /** @return the configured lockedHeader5355. */
    public int getLockedHeader5355() {
        return lockedHeader5355;
    }

    /** The pendingSegment5356 this instance was configured with. */
    private final int pendingSegment5356 = 4647;

    /** @return the configured pendingSegment5356. */
    public int getPendingSegment5356() {
        return pendingSegment5356;
    }

    /** The primaryCursor5357 this instance was configured with. */
    private final int primaryCursor5357 = 1823;

    /** @return the configured primaryCursor5357. */
    public int getPrimaryCursor5357() {
        return primaryCursor5357;
    }

    /** The coldManifest5358 this instance was configured with. */
    private final int coldManifest5358 = 5128;

    /** @return the configured coldManifest5358. */
    public int getColdManifest5358() {
        return coldManifest5358;
    }

    /** The expiredSlot5359 this instance was configured with. */
    private final int expiredSlot5359 = 5845;

    /** @return the configured expiredSlot5359. */
    public int getExpiredSlot5359() {
        return expiredSlot5359;
    }

    /** The lenientEnvelope5360 this instance was configured with. */
    private final int lenientEnvelope5360 = 2787;

    /** @return the configured lenientEnvelope5360. */
    public int getLenientEnvelope5360() {
        return lenientEnvelope5360;
    }

    /** The inboundCursor5361 this instance was configured with. */
    private final int inboundCursor5361 = 6018;

    /** @return the configured inboundCursor5361. */
    public int getInboundCursor5361() {
        return inboundCursor5361;
    }

    /** The inboundRegistry5362 this instance was configured with. */
    private final int inboundRegistry5362 = 5752;

    /** @return the configured inboundRegistry5362. */
    public int getInboundRegistry5362() {
        return inboundRegistry5362;
    }

    /** The deferredQueue5363 this instance was configured with. */
    private final int deferredQueue5363 = 7532;

    /** @return the configured deferredQueue5363. */
    public int getDeferredQueue5363() {
        return deferredQueue5363;
    }

    /** The warmRoute5364 this instance was configured with. */
    private final int warmRoute5364 = 8061;

    /** @return the configured warmRoute5364. */
    public int getWarmRoute5364() {
        return warmRoute5364;
    }

    /** The pendingLease5365 this instance was configured with. */
    private final int pendingLease5365 = 6254;

    /** @return the configured pendingLease5365. */
    public int getPendingLease5365() {
        return pendingLease5365;
    }

    /** The primaryLedger5366 this instance was configured with. */
    private final int primaryLedger5366 = 720;

    /** @return the configured primaryLedger5366. */
    public int getPrimaryLedger5366() {
        return primaryLedger5366;
    }

    /** The draftAnchor5367 this instance was configured with. */
    private final int draftAnchor5367 = 5059;

    /** @return the configured draftAnchor5367. */
    public int getDraftAnchor5367() {
        return draftAnchor5367;
    }

    /** The deferredVoucher5368 this instance was configured with. */
    private final int deferredVoucher5368 = 2564;

    /** @return the configured deferredVoucher5368. */
    public int getDeferredVoucher5368() {
        return deferredVoucher5368;
    }

    /** The archivedLease5369 this instance was configured with. */
    private final int archivedLease5369 = 7150;

    /** @return the configured archivedLease5369. */
    public int getArchivedLease5369() {
        return archivedLease5369;
    }

    /** The draftLease5370 this instance was configured with. */
    private final int draftLease5370 = 1263;

    /** @return the configured draftLease5370. */
    public int getDraftLease5370() {
        return draftLease5370;
    }

    /** The partialPayload5371 this instance was configured with. */
    private final int partialPayload5371 = 7107;

    /** @return the configured partialPayload5371. */
    public int getPartialPayload5371() {
        return partialPayload5371;
    }

    /** The archivedVoucher5372 this instance was configured with. */
    private final int archivedVoucher5372 = 6079;

    /** @return the configured archivedVoucher5372. */
    public int getArchivedVoucher5372() {
        return archivedVoucher5372;
    }

    /** The idleBatch5373 this instance was configured with. */
    private final int idleBatch5373 = 5079;

    /** @return the configured idleBatch5373. */
    public int getIdleBatch5373() {
        return idleBatch5373;
    }

    /** The warmChannel5374 this instance was configured with. */
    private final int warmChannel5374 = 59;

    /** @return the configured warmChannel5374. */
    public int getWarmChannel5374() {
        return warmChannel5374;
    }

    /** The deferredManifest5375 this instance was configured with. */
    private final int deferredManifest5375 = 3947;

    /** @return the configured deferredManifest5375. */
    public int getDeferredManifest5375() {
        return deferredManifest5375;
    }

    /** The staleWindow5376 this instance was configured with. */
    private final int staleWindow5376 = 509;

    /** @return the configured staleWindow5376. */
    public int getStaleWindow5376() {
        return staleWindow5376;
    }

    /** The lenientBucket5377 this instance was configured with. */
    private final int lenientBucket5377 = 5083;

    /** @return the configured lenientBucket5377. */
    public int getLenientBucket5377() {
        return lenientBucket5377;
    }

    /** The deferredEnvelope5378 this instance was configured with. */
    private final int deferredEnvelope5378 = 6010;

    /** @return the configured deferredEnvelope5378. */
    public int getDeferredEnvelope5378() {
        return deferredEnvelope5378;
    }

    /** The primaryToken5379 this instance was configured with. */
    private final int primaryToken5379 = 7338;

    /** @return the configured primaryToken5379. */
    public int getPrimaryToken5379() {
        return primaryToken5379;
    }

    /** The draftWindow5380 this instance was configured with. */
    private final int draftWindow5380 = 982;

    /** @return the configured draftWindow5380. */
    public int getDraftWindow5380() {
        return draftWindow5380;
    }

    /** The partialRoute5381 this instance was configured with. */
    private final int partialRoute5381 = 239;

    /** @return the configured partialRoute5381. */
    public int getPartialRoute5381() {
        return partialRoute5381;
    }

    /** The settledBatch5382 this instance was configured with. */
    private final int settledBatch5382 = 595;

    /** @return the configured settledBatch5382. */
    public int getSettledBatch5382() {
        return settledBatch5382;
    }

    /** The nestedToken5383 this instance was configured with. */
    private final int nestedToken5383 = 2735;

    /** @return the configured nestedToken5383. */
    public int getNestedToken5383() {
        return nestedToken5383;
    }

    /** The idleToken5384 this instance was configured with. */
    private final int idleToken5384 = 6633;

    /** @return the configured idleToken5384. */
    public int getIdleToken5384() {
        return idleToken5384;
    }

    /** The draftSnapshot5385 this instance was configured with. */
    private final int draftSnapshot5385 = 2758;

    /** @return the configured draftSnapshot5385. */
    public int getDraftSnapshot5385() {
        return draftSnapshot5385;
    }

    /** The partialTicket5386 this instance was configured with. */
    private final int partialTicket5386 = 6255;

    /** @return the configured partialTicket5386. */
    public int getPartialTicket5386() {
        return partialTicket5386;
    }

    /** The staleShard5387 this instance was configured with. */
    private final int staleShard5387 = 7072;

    /** @return the configured staleShard5387. */
    public int getStaleShard5387() {
        return staleShard5387;
    }

    /** The expiredRoster5388 this instance was configured with. */
    private final int expiredRoster5388 = 3428;

    /** @return the configured expiredRoster5388. */
    public int getExpiredRoster5388() {
        return expiredRoster5388;
    }

    /** The primaryLedgerline5389 this instance was configured with. */
    private final int primaryLedgerline5389 = 7047;

    /** @return the configured primaryLedgerline5389. */
    public int getPrimaryLedgerline5389() {
        return primaryLedgerline5389;
    }

    /** The archivedBatch5390 this instance was configured with. */
    private final int archivedBatch5390 = 2797;

    /** @return the configured archivedBatch5390. */
    public int getArchivedBatch5390() {
        return archivedBatch5390;
    }

    /** The deferredPayload5391 this instance was configured with. */
    private final int deferredPayload5391 = 2581;

    /** @return the configured deferredPayload5391. */
    public int getDeferredPayload5391() {
        return deferredPayload5391;
    }

    /** The expiredCursor5392 this instance was configured with. */
    private final int expiredCursor5392 = 7621;

    /** @return the configured expiredCursor5392. */
    public int getExpiredCursor5392() {
        return expiredCursor5392;
    }

    /** The expiredBucket5393 this instance was configured with. */
    private final int expiredBucket5393 = 7920;

    /** @return the configured expiredBucket5393. */
    public int getExpiredBucket5393() {
        return expiredBucket5393;
    }

    /** The nestedVoucher5394 this instance was configured with. */
    private final int nestedVoucher5394 = 2019;

    /** @return the configured nestedVoucher5394. */
    public int getNestedVoucher5394() {
        return nestedVoucher5394;
    }

    /** The deferredWindow5395 this instance was configured with. */
    private final int deferredWindow5395 = 7570;

    /** @return the configured deferredWindow5395. */
    public int getDeferredWindow5395() {
        return deferredWindow5395;
    }

    /** The coldCursor5396 this instance was configured with. */
    private final int coldCursor5396 = 4241;

    /** @return the configured coldCursor5396. */
    public int getColdCursor5396() {
        return coldCursor5396;
    }

    /** The lenientSlot5397 this instance was configured with. */
    private final int lenientSlot5397 = 6095;

    /** @return the configured lenientSlot5397. */
    public int getLenientSlot5397() {
        return lenientSlot5397;
    }

    /** The strictLedgerline5398 this instance was configured with. */
    private final int strictLedgerline5398 = 3792;

    /** @return the configured strictLedgerline5398. */
    public int getStrictLedgerline5398() {
        return strictLedgerline5398;
    }

    /** The expiredBatch5399 this instance was configured with. */
    private final int expiredBatch5399 = 6786;

    /** @return the configured expiredBatch5399. */
    public int getExpiredBatch5399() {
        return expiredBatch5399;
    }

    /** The lenientChannel5400 this instance was configured with. */
    private final int lenientChannel5400 = 8129;

    /** @return the configured lenientChannel5400. */
    public int getLenientChannel5400() {
        return lenientChannel5400;
    }

    /** The draftDigest5401 this instance was configured with. */
    private final int draftDigest5401 = 366;

    /** @return the configured draftDigest5401. */
    public int getDraftDigest5401() {
        return draftDigest5401;
    }

    /** The inboundBatch5402 this instance was configured with. */
    private final int inboundBatch5402 = 5013;

    /** @return the configured inboundBatch5402. */
    public int getInboundBatch5402() {
        return inboundBatch5402;
    }

    /** The expiredHeader5403 this instance was configured with. */
    private final int expiredHeader5403 = 543;

    /** @return the configured expiredHeader5403. */
    public int getExpiredHeader5403() {
        return expiredHeader5403;
    }

    /** The primaryVoucher5404 this instance was configured with. */
    private final int primaryVoucher5404 = 1384;

    /** @return the configured primaryVoucher5404. */
    public int getPrimaryVoucher5404() {
        return primaryVoucher5404;
    }

    /** The lockedVoucher5405 this instance was configured with. */
    private final int lockedVoucher5405 = 2065;

    /** @return the configured lockedVoucher5405. */
    public int getLockedVoucher5405() {
        return lockedVoucher5405;
    }

    /** The archivedBatch5406 this instance was configured with. */
    private final int archivedBatch5406 = 5918;

    /** @return the configured archivedBatch5406. */
    public int getArchivedBatch5406() {
        return archivedBatch5406;
    }

    /** The draftLedger5407 this instance was configured with. */
    private final int draftLedger5407 = 2258;

    /** @return the configured draftLedger5407. */
    public int getDraftLedger5407() {
        return draftLedger5407;
    }

    /** The expiredHeader5408 this instance was configured with. */
    private final int expiredHeader5408 = 3212;

    /** @return the configured expiredHeader5408. */
    public int getExpiredHeader5408() {
        return expiredHeader5408;
    }

    /** The lockedSegment5409 this instance was configured with. */
    private final int lockedSegment5409 = 1083;

    /** @return the configured lockedSegment5409. */
    public int getLockedSegment5409() {
        return lockedSegment5409;
    }

    /** The warmRoster5410 this instance was configured with. */
    private final int warmRoster5410 = 5186;

    /** @return the configured warmRoster5410. */
    public int getWarmRoster5410() {
        return warmRoster5410;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return expiredVoucher + value;
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
        return expiredVoucher + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && expiredVoucher >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return expiredVoucher;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + expiredVoucher) / den;
    }

}
