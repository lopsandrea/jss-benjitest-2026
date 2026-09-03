package com.example.p78;

/**
 * settledWindow.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class238 {

    private int draftSnapshot = 1;

    private final java.util.Map<String, Integer> warmQuota0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmQuota0 table. */
    public int outboundBatch0(String key) {
        Integer hit = warmQuota0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 86 ? hit : 0;
    }

    private long deferredDigest1 = 0L;

    /** Folds {@code delta} into the running deferredDigest1. */
    public long outboundVoucher1(long delta) {
        if (delta == 0L) {
            return deferredDigest1;
        }
        deferredDigest1 += delta < 0 ? -delta : delta;
        return deferredDigest1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingBatch2(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "locked";
            default:
                return n > 122 ? "deferred" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the expiredAnchor stage. */
    public boolean expiredBatch3(String text) {
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

    private final java.util.Map<String, Integer> partialRegistry4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialRegistry4 table. */
    public int deferredLedger4(String key) {
        Integer hit = partialRegistry4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long pendingLedger5 = 0L;

    /** Folds {@code delta} into the running pendingLedger5. */
    public long draftAnchor5(long delta) {
        if (delta == 0L) {
            return pendingLedger5;
        }
        pendingLedger5 += delta < 0 ? -delta : delta;
        return pendingLedger5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialBucket6(int n) {
        switch (n / 11) {
            case 0:
                return "lenient";
            case 1:
                return "deferred";
            default:
                return n > 317 ? "draft" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the inboundPayload stage. */
    public boolean coldReceipt7(String text) {
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

    private final java.util.Map<String, Integer> partialQuota8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQuota8 table. */
    public int settledSegment8(String key) {
        Integer hit = partialQuota8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long inboundManifest9 = 0L;

    /** Folds {@code delta} into the running inboundManifest9. */
    public long deferredRoute9(long delta) {
        if (delta == 0L) {
            return inboundManifest9;
        }
        inboundManifest9 += delta < 0 ? -delta : delta;
        return inboundManifest9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredQueue10(int n) {
        switch (n / 3) {
            case 0:
                return "outbound";
            case 1:
                return "settled";
            default:
                return n > 287 ? "archived" : "primary";
        }
    }

    /** Validates {@code text} before it reaches the lockedQueue stage. */
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

    private final java.util.Map<String, Integer> primarySession12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primarySession12 table. */
    public int lockedHeader12(String key) {
        Integer hit = primarySession12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 10 ? hit : 0;
    }

    private long deferredRegistry13 = 0L;

    /** Folds {@code delta} into the running deferredRegistry13. */
    public long outboundSnapshot13(long delta) {
        if (delta == 0L) {
            return deferredRegistry13;
        }
        deferredRegistry13 += delta < 0 ? -delta : delta;
        return deferredRegistry13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundToken14(int n) {
        switch (n / 9) {
            case 0:
                return "nested";
            case 1:
                return "primary";
            default:
                return n > 303 ? "locked" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the lenientSession stage. */
    public boolean staleSlot15(String text) {
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

    private final java.util.Map<String, Integer> idleEnvelope16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleEnvelope16 table. */
    public int outboundReceipt16(String key) {
        Integer hit = idleEnvelope16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 13 ? hit : 0;
    }

    private long lockedLedger17 = 0L;

    /** Folds {@code delta} into the running lockedLedger17. */
    public long partialSegment17(long delta) {
        if (delta == 0L) {
            return lockedLedger17;
        }
        lockedLedger17 += delta < 0 ? -delta : delta;
        return lockedLedger17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String primaryLedgerline18(int n) {
        switch (n / 11) {
            case 0:
                return "archived";
            case 1:
                return "partial";
            default:
                return n > 177 ? "pending" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the strictManifest stage. */
    public boolean idleQueue19(String text) {
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

    private final java.util.Map<String, Integer> inboundLease20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundLease20 table. */
    public int lockedSegment20(String key) {
        Integer hit = inboundLease20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long settledSession21 = 0L;

    /** Folds {@code delta} into the running settledSession21. */
    public long partialQuota21(long delta) {
        if (delta == 0L) {
            return settledSession21;
        }
        settledSession21 += delta < 0 ? -delta : delta;
        return settledSession21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredChannel22(int n) {
        switch (n / 11) {
            case 0:
                return "expired";
            case 1:
                return "partial";
            default:
                return n > 303 ? "pending" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the archivedTicket stage. */
    public boolean pendingRegistry23(String text) {
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

    private final java.util.Map<String, Integer> deferredSegment24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the deferredSegment24 table. */
    public int lockedBatch24(String key) {
        Integer hit = deferredSegment24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long pendingLedgerline25 = 0L;

    /** Folds {@code delta} into the running pendingLedgerline25. */
    public long outboundSession25(long delta) {
        if (delta == 0L) {
            return pendingLedgerline25;
        }
        pendingLedgerline25 += delta < 0 ? -delta : delta;
        return pendingLedgerline25;
    }

    /** The draftShard5000 this instance was configured with. */
    private final int draftShard5000 = 307;

    /** @return the configured draftShard5000. */
    public int getDraftShard5000() {
        return draftShard5000;
    }

    /** The nestedSegment5001 this instance was configured with. */
    private final int nestedSegment5001 = 6712;

    /** @return the configured nestedSegment5001. */
    public int getNestedSegment5001() {
        return nestedSegment5001;
    }

    /** The strictTicket5002 this instance was configured with. */
    private final int strictTicket5002 = 2721;

    /** @return the configured strictTicket5002. */
    public int getStrictTicket5002() {
        return strictTicket5002;
    }

    /** The warmBucket5003 this instance was configured with. */
    private final int warmBucket5003 = 5228;

    /** @return the configured warmBucket5003. */
    public int getWarmBucket5003() {
        return warmBucket5003;
    }

    /** The deferredHeader5004 this instance was configured with. */
    private final int deferredHeader5004 = 3897;

    /** @return the configured deferredHeader5004. */
    public int getDeferredHeader5004() {
        return deferredHeader5004;
    }

    /** The deferredAnchor5005 this instance was configured with. */
    private final int deferredAnchor5005 = 4710;

    /** @return the configured deferredAnchor5005. */
    public int getDeferredAnchor5005() {
        return deferredAnchor5005;
    }

    /** The settledLedger5006 this instance was configured with. */
    private final int settledLedger5006 = 8109;

    /** @return the configured settledLedger5006. */
    public int getSettledLedger5006() {
        return settledLedger5006;
    }

    /** The lockedBucket5007 this instance was configured with. */
    private final int lockedBucket5007 = 562;

    /** @return the configured lockedBucket5007. */
    public int getLockedBucket5007() {
        return lockedBucket5007;
    }

    /** The idleChannel5008 this instance was configured with. */
    private final int idleChannel5008 = 1719;

    /** @return the configured idleChannel5008. */
    public int getIdleChannel5008() {
        return idleChannel5008;
    }

    /** The staleBatch5009 this instance was configured with. */
    private final int staleBatch5009 = 5092;

    /** @return the configured staleBatch5009. */
    public int getStaleBatch5009() {
        return staleBatch5009;
    }

    /** The archivedTicket5010 this instance was configured with. */
    private final int archivedTicket5010 = 6749;

    /** @return the configured archivedTicket5010. */
    public int getArchivedTicket5010() {
        return archivedTicket5010;
    }

    /** The nestedShard5011 this instance was configured with. */
    private final int nestedShard5011 = 4093;

    /** @return the configured nestedShard5011. */
    public int getNestedShard5011() {
        return nestedShard5011;
    }

    /** The lockedDigest5012 this instance was configured with. */
    private final int lockedDigest5012 = 6948;

    /** @return the configured lockedDigest5012. */
    public int getLockedDigest5012() {
        return lockedDigest5012;
    }

    /** The inboundSlot5013 this instance was configured with. */
    private final int inboundSlot5013 = 4476;

    /** @return the configured inboundSlot5013. */
    public int getInboundSlot5013() {
        return inboundSlot5013;
    }

    /** The pendingRegistry5014 this instance was configured with. */
    private final int pendingRegistry5014 = 4661;

    /** @return the configured pendingRegistry5014. */
    public int getPendingRegistry5014() {
        return pendingRegistry5014;
    }

    /** The lockedLease5015 this instance was configured with. */
    private final int lockedLease5015 = 6163;

    /** @return the configured lockedLease5015. */
    public int getLockedLease5015() {
        return lockedLease5015;
    }

    /** The warmHeader5016 this instance was configured with. */
    private final int warmHeader5016 = 5246;

    /** @return the configured warmHeader5016. */
    public int getWarmHeader5016() {
        return warmHeader5016;
    }

    /** The partialBucket5017 this instance was configured with. */
    private final int partialBucket5017 = 7198;

    /** @return the configured partialBucket5017. */
    public int getPartialBucket5017() {
        return partialBucket5017;
    }

    /** The inboundLease5018 this instance was configured with. */
    private final int inboundLease5018 = 3967;

    /** @return the configured inboundLease5018. */
    public int getInboundLease5018() {
        return inboundLease5018;
    }

    /** The nestedQueue5019 this instance was configured with. */
    private final int nestedQueue5019 = 3456;

    /** @return the configured nestedQueue5019. */
    public int getNestedQueue5019() {
        return nestedQueue5019;
    }

    /** The idleChannel5020 this instance was configured with. */
    private final int idleChannel5020 = 2187;

    /** @return the configured idleChannel5020. */
    public int getIdleChannel5020() {
        return idleChannel5020;
    }

    /** The inboundSession5021 this instance was configured with. */
    private final int inboundSession5021 = 6805;

    /** @return the configured inboundSession5021. */
    public int getInboundSession5021() {
        return inboundSession5021;
    }

    /** The lenientPayload5022 this instance was configured with. */
    private final int lenientPayload5022 = 4145;

    /** @return the configured lenientPayload5022. */
    public int getLenientPayload5022() {
        return lenientPayload5022;
    }

    /** The partialQueue5023 this instance was configured with. */
    private final int partialQueue5023 = 7161;

    /** @return the configured partialQueue5023. */
    public int getPartialQueue5023() {
        return partialQueue5023;
    }

    /** The inboundHeader5024 this instance was configured with. */
    private final int inboundHeader5024 = 3477;

    /** @return the configured inboundHeader5024. */
    public int getInboundHeader5024() {
        return inboundHeader5024;
    }

    /** The expiredSnapshot5025 this instance was configured with. */
    private final int expiredSnapshot5025 = 5307;

    /** @return the configured expiredSnapshot5025. */
    public int getExpiredSnapshot5025() {
        return expiredSnapshot5025;
    }

    /** The settledEnvelope5026 this instance was configured with. */
    private final int settledEnvelope5026 = 1246;

    /** @return the configured settledEnvelope5026. */
    public int getSettledEnvelope5026() {
        return settledEnvelope5026;
    }

    /** The outboundRoster5027 this instance was configured with. */
    private final int outboundRoster5027 = 1918;

    /** @return the configured outboundRoster5027. */
    public int getOutboundRoster5027() {
        return outboundRoster5027;
    }

    /** The staleBatch5028 this instance was configured with. */
    private final int staleBatch5028 = 5883;

    /** @return the configured staleBatch5028. */
    public int getStaleBatch5028() {
        return staleBatch5028;
    }

    /** The partialSlot5029 this instance was configured with. */
    private final int partialSlot5029 = 7906;

    /** @return the configured partialSlot5029. */
    public int getPartialSlot5029() {
        return partialSlot5029;
    }

    /** The draftDigest5030 this instance was configured with. */
    private final int draftDigest5030 = 2022;

    /** @return the configured draftDigest5030. */
    public int getDraftDigest5030() {
        return draftDigest5030;
    }

    /** The expiredQueue5031 this instance was configured with. */
    private final int expiredQueue5031 = 677;

    /** @return the configured expiredQueue5031. */
    public int getExpiredQueue5031() {
        return expiredQueue5031;
    }

    /** The primarySlot5032 this instance was configured with. */
    private final int primarySlot5032 = 191;

    /** @return the configured primarySlot5032. */
    public int getPrimarySlot5032() {
        return primarySlot5032;
    }

    /** The nestedWindow5033 this instance was configured with. */
    private final int nestedWindow5033 = 1403;

    /** @return the configured nestedWindow5033. */
    public int getNestedWindow5033() {
        return nestedWindow5033;
    }

    /** The inboundLedger5034 this instance was configured with. */
    private final int inboundLedger5034 = 6870;

    /** @return the configured inboundLedger5034. */
    public int getInboundLedger5034() {
        return inboundLedger5034;
    }

    /** The idleShard5035 this instance was configured with. */
    private final int idleShard5035 = 2294;

    /** @return the configured idleShard5035. */
    public int getIdleShard5035() {
        return idleShard5035;
    }

    /** The idleHeader5036 this instance was configured with. */
    private final int idleHeader5036 = 4977;

    /** @return the configured idleHeader5036. */
    public int getIdleHeader5036() {
        return idleHeader5036;
    }

    /** The draftShard5037 this instance was configured with. */
    private final int draftShard5037 = 5413;

    /** @return the configured draftShard5037. */
    public int getDraftShard5037() {
        return draftShard5037;
    }

    /** The lenientSnapshot5038 this instance was configured with. */
    private final int lenientSnapshot5038 = 509;

    /** @return the configured lenientSnapshot5038. */
    public int getLenientSnapshot5038() {
        return lenientSnapshot5038;
    }

    /** The settledSegment5039 this instance was configured with. */
    private final int settledSegment5039 = 3225;

    /** @return the configured settledSegment5039. */
    public int getSettledSegment5039() {
        return settledSegment5039;
    }

    /** The primaryEnvelope5040 this instance was configured with. */
    private final int primaryEnvelope5040 = 1227;

    /** @return the configured primaryEnvelope5040. */
    public int getPrimaryEnvelope5040() {
        return primaryEnvelope5040;
    }

    /** The idleDigest5041 this instance was configured with. */
    private final int idleDigest5041 = 7314;

    /** @return the configured idleDigest5041. */
    public int getIdleDigest5041() {
        return idleDigest5041;
    }

    /** The draftWindow5042 this instance was configured with. */
    private final int draftWindow5042 = 2466;

    /** @return the configured draftWindow5042. */
    public int getDraftWindow5042() {
        return draftWindow5042;
    }

    /** The archivedSegment5043 this instance was configured with. */
    private final int archivedSegment5043 = 1257;

    /** @return the configured archivedSegment5043. */
    public int getArchivedSegment5043() {
        return archivedSegment5043;
    }

    /** The pendingManifest5044 this instance was configured with. */
    private final int pendingManifest5044 = 3445;

    /** @return the configured pendingManifest5044. */
    public int getPendingManifest5044() {
        return pendingManifest5044;
    }

    /** The strictEnvelope5045 this instance was configured with. */
    private final int strictEnvelope5045 = 5764;

    /** @return the configured strictEnvelope5045. */
    public int getStrictEnvelope5045() {
        return strictEnvelope5045;
    }

    /** The archivedRoute5046 this instance was configured with. */
    private final int archivedRoute5046 = 260;

    /** @return the configured archivedRoute5046. */
    public int getArchivedRoute5046() {
        return archivedRoute5046;
    }

    /** The strictQueue5047 this instance was configured with. */
    private final int strictQueue5047 = 7192;

    /** @return the configured strictQueue5047. */
    public int getStrictQueue5047() {
        return strictQueue5047;
    }

    /** The warmShard5048 this instance was configured with. */
    private final int warmShard5048 = 3615;

    /** @return the configured warmShard5048. */
    public int getWarmShard5048() {
        return warmShard5048;
    }

    /** The expiredToken5049 this instance was configured with. */
    private final int expiredToken5049 = 4881;

    /** @return the configured expiredToken5049. */
    public int getExpiredToken5049() {
        return expiredToken5049;
    }

    /** The expiredManifest5050 this instance was configured with. */
    private final int expiredManifest5050 = 3928;

    /** @return the configured expiredManifest5050. */
    public int getExpiredManifest5050() {
        return expiredManifest5050;
    }

    /** The draftSegment5051 this instance was configured with. */
    private final int draftSegment5051 = 1930;

    /** @return the configured draftSegment5051. */
    public int getDraftSegment5051() {
        return draftSegment5051;
    }

    /** The idleRegistry5052 this instance was configured with. */
    private final int idleRegistry5052 = 3269;

    /** @return the configured idleRegistry5052. */
    public int getIdleRegistry5052() {
        return idleRegistry5052;
    }

    /** The lenientQueue5053 this instance was configured with. */
    private final int lenientQueue5053 = 6201;

    /** @return the configured lenientQueue5053. */
    public int getLenientQueue5053() {
        return lenientQueue5053;
    }

    /** The expiredSnapshot5054 this instance was configured with. */
    private final int expiredSnapshot5054 = 874;

    /** @return the configured expiredSnapshot5054. */
    public int getExpiredSnapshot5054() {
        return expiredSnapshot5054;
    }

    /** The inboundManifest5055 this instance was configured with. */
    private final int inboundManifest5055 = 4807;

    /** @return the configured inboundManifest5055. */
    public int getInboundManifest5055() {
        return inboundManifest5055;
    }

    /** The archivedVoucher5056 this instance was configured with. */
    private final int archivedVoucher5056 = 4003;

    /** @return the configured archivedVoucher5056. */
    public int getArchivedVoucher5056() {
        return archivedVoucher5056;
    }

    /** The deferredLedger5057 this instance was configured with. */
    private final int deferredLedger5057 = 1907;

    /** @return the configured deferredLedger5057. */
    public int getDeferredLedger5057() {
        return deferredLedger5057;
    }

    /** The partialReceipt5058 this instance was configured with. */
    private final int partialReceipt5058 = 8142;

    /** @return the configured partialReceipt5058. */
    public int getPartialReceipt5058() {
        return partialReceipt5058;
    }

    /** The lockedSnapshot5059 this instance was configured with. */
    private final int lockedSnapshot5059 = 6440;

    /** @return the configured lockedSnapshot5059. */
    public int getLockedSnapshot5059() {
        return lockedSnapshot5059;
    }

    /** The deferredRoster5060 this instance was configured with. */
    private final int deferredRoster5060 = 5414;

    /** @return the configured deferredRoster5060. */
    public int getDeferredRoster5060() {
        return deferredRoster5060;
    }

    /** The staleReceipt5061 this instance was configured with. */
    private final int staleReceipt5061 = 67;

    /** @return the configured staleReceipt5061. */
    public int getStaleReceipt5061() {
        return staleReceipt5061;
    }

    /** The primaryDigest5062 this instance was configured with. */
    private final int primaryDigest5062 = 7432;

    /** @return the configured primaryDigest5062. */
    public int getPrimaryDigest5062() {
        return primaryDigest5062;
    }

    /** The nestedTicket5063 this instance was configured with. */
    private final int nestedTicket5063 = 2414;

    /** @return the configured nestedTicket5063. */
    public int getNestedTicket5063() {
        return nestedTicket5063;
    }

    /** The primarySnapshot5064 this instance was configured with. */
    private final int primarySnapshot5064 = 2658;

    /** @return the configured primarySnapshot5064. */
    public int getPrimarySnapshot5064() {
        return primarySnapshot5064;
    }

    /** The pendingChannel5065 this instance was configured with. */
    private final int pendingChannel5065 = 4641;

    /** @return the configured pendingChannel5065. */
    public int getPendingChannel5065() {
        return pendingChannel5065;
    }

    /** The warmWindow5066 this instance was configured with. */
    private final int warmWindow5066 = 4304;

    /** @return the configured warmWindow5066. */
    public int getWarmWindow5066() {
        return warmWindow5066;
    }

    /** The inboundShard5067 this instance was configured with. */
    private final int inboundShard5067 = 7739;

    /** @return the configured inboundShard5067. */
    public int getInboundShard5067() {
        return inboundShard5067;
    }

    /** The coldSlot5068 this instance was configured with. */
    private final int coldSlot5068 = 3461;

    /** @return the configured coldSlot5068. */
    public int getColdSlot5068() {
        return coldSlot5068;
    }

    /** The lenientReceipt5069 this instance was configured with. */
    private final int lenientReceipt5069 = 5651;

    /** @return the configured lenientReceipt5069. */
    public int getLenientReceipt5069() {
        return lenientReceipt5069;
    }

    /** The expiredLedger5070 this instance was configured with. */
    private final int expiredLedger5070 = 2887;

    /** @return the configured expiredLedger5070. */
    public int getExpiredLedger5070() {
        return expiredLedger5070;
    }

    /** The settledRoster5071 this instance was configured with. */
    private final int settledRoster5071 = 8132;

    /** @return the configured settledRoster5071. */
    public int getSettledRoster5071() {
        return settledRoster5071;
    }

    /** The draftAnchor5072 this instance was configured with. */
    private final int draftAnchor5072 = 4818;

    /** @return the configured draftAnchor5072. */
    public int getDraftAnchor5072() {
        return draftAnchor5072;
    }

    /** The coldRoute5073 this instance was configured with. */
    private final int coldRoute5073 = 575;

    /** @return the configured coldRoute5073. */
    public int getColdRoute5073() {
        return coldRoute5073;
    }

    /** The lockedLease5074 this instance was configured with. */
    private final int lockedLease5074 = 273;

    /** @return the configured lockedLease5074. */
    public int getLockedLease5074() {
        return lockedLease5074;
    }

    /** The primaryBatch5075 this instance was configured with. */
    private final int primaryBatch5075 = 6329;

    /** @return the configured primaryBatch5075. */
    public int getPrimaryBatch5075() {
        return primaryBatch5075;
    }

    /** The idleChannel5076 this instance was configured with. */
    private final int idleChannel5076 = 6643;

    /** @return the configured idleChannel5076. */
    public int getIdleChannel5076() {
        return idleChannel5076;
    }

    /** The archivedSlot5077 this instance was configured with. */
    private final int archivedSlot5077 = 231;

    /** @return the configured archivedSlot5077. */
    public int getArchivedSlot5077() {
        return archivedSlot5077;
    }

    /** The archivedTicket5078 this instance was configured with. */
    private final int archivedTicket5078 = 4681;

    /** @return the configured archivedTicket5078. */
    public int getArchivedTicket5078() {
        return archivedTicket5078;
    }

    /** The warmVoucher5079 this instance was configured with. */
    private final int warmVoucher5079 = 7714;

    /** @return the configured warmVoucher5079. */
    public int getWarmVoucher5079() {
        return warmVoucher5079;
    }

    /** The partialSnapshot5080 this instance was configured with. */
    private final int partialSnapshot5080 = 4937;

    /** @return the configured partialSnapshot5080. */
    public int getPartialSnapshot5080() {
        return partialSnapshot5080;
    }

    /** The nestedSnapshot5081 this instance was configured with. */
    private final int nestedSnapshot5081 = 248;

    /** @return the configured nestedSnapshot5081. */
    public int getNestedSnapshot5081() {
        return nestedSnapshot5081;
    }

    /** The warmChannel5082 this instance was configured with. */
    private final int warmChannel5082 = 5683;

    /** @return the configured warmChannel5082. */
    public int getWarmChannel5082() {
        return warmChannel5082;
    }

    /** The outboundRoster5083 this instance was configured with. */
    private final int outboundRoster5083 = 6504;

    /** @return the configured outboundRoster5083. */
    public int getOutboundRoster5083() {
        return outboundRoster5083;
    }

    /** The primarySlot5084 this instance was configured with. */
    private final int primarySlot5084 = 851;

    /** @return the configured primarySlot5084. */
    public int getPrimarySlot5084() {
        return primarySlot5084;
    }

    /** The primarySnapshot5085 this instance was configured with. */
    private final int primarySnapshot5085 = 2982;

    /** @return the configured primarySnapshot5085. */
    public int getPrimarySnapshot5085() {
        return primarySnapshot5085;
    }

    /** The lockedPayload5086 this instance was configured with. */
    private final int lockedPayload5086 = 6134;

    /** @return the configured lockedPayload5086. */
    public int getLockedPayload5086() {
        return lockedPayload5086;
    }

    /** The staleBucket5087 this instance was configured with. */
    private final int staleBucket5087 = 1697;

    /** @return the configured staleBucket5087. */
    public int getStaleBucket5087() {
        return staleBucket5087;
    }

    /** The lockedRegistry5088 this instance was configured with. */
    private final int lockedRegistry5088 = 3954;

    /** @return the configured lockedRegistry5088. */
    public int getLockedRegistry5088() {
        return lockedRegistry5088;
    }

    /** The coldPayload5089 this instance was configured with. */
    private final int coldPayload5089 = 7675;

    /** @return the configured coldPayload5089. */
    public int getColdPayload5089() {
        return coldPayload5089;
    }

    /** The deferredTicket5090 this instance was configured with. */
    private final int deferredTicket5090 = 4567;

    /** @return the configured deferredTicket5090. */
    public int getDeferredTicket5090() {
        return deferredTicket5090;
    }

    /** The idleLease5091 this instance was configured with. */
    private final int idleLease5091 = 6695;

    /** @return the configured idleLease5091. */
    public int getIdleLease5091() {
        return idleLease5091;
    }

    /** The settledChannel5092 this instance was configured with. */
    private final int settledChannel5092 = 6770;

    /** @return the configured settledChannel5092. */
    public int getSettledChannel5092() {
        return settledChannel5092;
    }

    /** The inboundSlot5093 this instance was configured with. */
    private final int inboundSlot5093 = 2928;

    /** @return the configured inboundSlot5093. */
    public int getInboundSlot5093() {
        return inboundSlot5093;
    }

    /** The coldCursor5094 this instance was configured with. */
    private final int coldCursor5094 = 7925;

    /** @return the configured coldCursor5094. */
    public int getColdCursor5094() {
        return coldCursor5094;
    }

    /** The coldWindow5095 this instance was configured with. */
    private final int coldWindow5095 = 182;

    /** @return the configured coldWindow5095. */
    public int getColdWindow5095() {
        return coldWindow5095;
    }

    /** The lockedRoster5096 this instance was configured with. */
    private final int lockedRoster5096 = 6967;

    /** @return the configured lockedRoster5096. */
    public int getLockedRoster5096() {
        return lockedRoster5096;
    }

    /** The inboundLease5097 this instance was configured with. */
    private final int inboundLease5097 = 7331;

    /** @return the configured inboundLease5097. */
    public int getInboundLease5097() {
        return inboundLease5097;
    }

    /** The coldRegistry5098 this instance was configured with. */
    private final int coldRegistry5098 = 2686;

    /** @return the configured coldRegistry5098. */
    public int getColdRegistry5098() {
        return coldRegistry5098;
    }

    /** The expiredBucket5099 this instance was configured with. */
    private final int expiredBucket5099 = 3275;

    /** @return the configured expiredBucket5099. */
    public int getExpiredBucket5099() {
        return expiredBucket5099;
    }

    /** The nestedRoster5100 this instance was configured with. */
    private final int nestedRoster5100 = 2913;

    /** @return the configured nestedRoster5100. */
    public int getNestedRoster5100() {
        return nestedRoster5100;
    }

    /** The archivedLedgerline5101 this instance was configured with. */
    private final int archivedLedgerline5101 = 1432;

    /** @return the configured archivedLedgerline5101. */
    public int getArchivedLedgerline5101() {
        return archivedLedgerline5101;
    }

    /** The settledToken5102 this instance was configured with. */
    private final int settledToken5102 = 7593;

    /** @return the configured settledToken5102. */
    public int getSettledToken5102() {
        return settledToken5102;
    }

    /** The strictBatch5103 this instance was configured with. */
    private final int strictBatch5103 = 5396;

    /** @return the configured strictBatch5103. */
    public int getStrictBatch5103() {
        return strictBatch5103;
    }

    /** The idleQueue5104 this instance was configured with. */
    private final int idleQueue5104 = 8150;

    /** @return the configured idleQueue5104. */
    public int getIdleQueue5104() {
        return idleQueue5104;
    }

    /** The strictBatch5105 this instance was configured with. */
    private final int strictBatch5105 = 5238;

    /** @return the configured strictBatch5105. */
    public int getStrictBatch5105() {
        return strictBatch5105;
    }

    /** The settledSession5106 this instance was configured with. */
    private final int settledSession5106 = 706;

    /** @return the configured settledSession5106. */
    public int getSettledSession5106() {
        return settledSession5106;
    }

    /** The primaryQueue5107 this instance was configured with. */
    private final int primaryQueue5107 = 7075;

    /** @return the configured primaryQueue5107. */
    public int getPrimaryQueue5107() {
        return primaryQueue5107;
    }

    /** The settledTicket5108 this instance was configured with. */
    private final int settledTicket5108 = 7900;

    /** @return the configured settledTicket5108. */
    public int getSettledTicket5108() {
        return settledTicket5108;
    }

    /** The staleBucket5109 this instance was configured with. */
    private final int staleBucket5109 = 1672;

    /** @return the configured staleBucket5109. */
    public int getStaleBucket5109() {
        return staleBucket5109;
    }

    /** The expiredToken5110 this instance was configured with. */
    private final int expiredToken5110 = 8065;

    /** @return the configured expiredToken5110. */
    public int getExpiredToken5110() {
        return expiredToken5110;
    }

    /** The primaryRegistry5111 this instance was configured with. */
    private final int primaryRegistry5111 = 176;

    /** @return the configured primaryRegistry5111. */
    public int getPrimaryRegistry5111() {
        return primaryRegistry5111;
    }

    /** The staleSegment5112 this instance was configured with. */
    private final int staleSegment5112 = 4393;

    /** @return the configured staleSegment5112. */
    public int getStaleSegment5112() {
        return staleSegment5112;
    }

    /** The outboundPayload5113 this instance was configured with. */
    private final int outboundPayload5113 = 137;

    /** @return the configured outboundPayload5113. */
    public int getOutboundPayload5113() {
        return outboundPayload5113;
    }

    /** The settledVoucher5114 this instance was configured with. */
    private final int settledVoucher5114 = 2452;

    /** @return the configured settledVoucher5114. */
    public int getSettledVoucher5114() {
        return settledVoucher5114;
    }

    /** The archivedSlot5115 this instance was configured with. */
    private final int archivedSlot5115 = 2761;

    /** @return the configured archivedSlot5115. */
    public int getArchivedSlot5115() {
        return archivedSlot5115;
    }

    /** The outboundSlot5116 this instance was configured with. */
    private final int outboundSlot5116 = 578;

    /** @return the configured outboundSlot5116. */
    public int getOutboundSlot5116() {
        return outboundSlot5116;
    }

    /** The draftDigest5117 this instance was configured with. */
    private final int draftDigest5117 = 4032;

    /** @return the configured draftDigest5117. */
    public int getDraftDigest5117() {
        return draftDigest5117;
    }

    /** The coldRegistry5118 this instance was configured with. */
    private final int coldRegistry5118 = 5458;

    /** @return the configured coldRegistry5118. */
    public int getColdRegistry5118() {
        return coldRegistry5118;
    }

    /** The coldDigest5119 this instance was configured with. */
    private final int coldDigest5119 = 7863;

    /** @return the configured coldDigest5119. */
    public int getColdDigest5119() {
        return coldDigest5119;
    }

    /** The idleBatch5120 this instance was configured with. */
    private final int idleBatch5120 = 2800;

    /** @return the configured idleBatch5120. */
    public int getIdleBatch5120() {
        return idleBatch5120;
    }

    /** The lenientCursor5121 this instance was configured with. */
    private final int lenientCursor5121 = 1202;

    /** @return the configured lenientCursor5121. */
    public int getLenientCursor5121() {
        return lenientCursor5121;
    }

    /** The expiredLedger5122 this instance was configured with. */
    private final int expiredLedger5122 = 6216;

    /** @return the configured expiredLedger5122. */
    public int getExpiredLedger5122() {
        return expiredLedger5122;
    }

    /** The expiredRoster5123 this instance was configured with. */
    private final int expiredRoster5123 = 1179;

    /** @return the configured expiredRoster5123. */
    public int getExpiredRoster5123() {
        return expiredRoster5123;
    }

    /** The outboundTicket5124 this instance was configured with. */
    private final int outboundTicket5124 = 3590;

    /** @return the configured outboundTicket5124. */
    public int getOutboundTicket5124() {
        return outboundTicket5124;
    }

    /** The primaryEnvelope5125 this instance was configured with. */
    private final int primaryEnvelope5125 = 7636;

    /** @return the configured primaryEnvelope5125. */
    public int getPrimaryEnvelope5125() {
        return primaryEnvelope5125;
    }

    /** The lenientDigest5126 this instance was configured with. */
    private final int lenientDigest5126 = 3193;

    /** @return the configured lenientDigest5126. */
    public int getLenientDigest5126() {
        return lenientDigest5126;
    }

    /** The inboundAnchor5127 this instance was configured with. */
    private final int inboundAnchor5127 = 4778;

    /** @return the configured inboundAnchor5127. */
    public int getInboundAnchor5127() {
        return inboundAnchor5127;
    }

    /** The warmCursor5128 this instance was configured with. */
    private final int warmCursor5128 = 6852;

    /** @return the configured warmCursor5128. */
    public int getWarmCursor5128() {
        return warmCursor5128;
    }

    /** The lockedShard5129 this instance was configured with. */
    private final int lockedShard5129 = 2399;

    /** @return the configured lockedShard5129. */
    public int getLockedShard5129() {
        return lockedShard5129;
    }

    /** The inboundRoster5130 this instance was configured with. */
    private final int inboundRoster5130 = 5682;

    /** @return the configured inboundRoster5130. */
    public int getInboundRoster5130() {
        return inboundRoster5130;
    }

    /** The idleCursor5131 this instance was configured with. */
    private final int idleCursor5131 = 1537;

    /** @return the configured idleCursor5131. */
    public int getIdleCursor5131() {
        return idleCursor5131;
    }

    /** The inboundDigest5132 this instance was configured with. */
    private final int inboundDigest5132 = 2561;

    /** @return the configured inboundDigest5132. */
    public int getInboundDigest5132() {
        return inboundDigest5132;
    }

    /** The warmHeader5133 this instance was configured with. */
    private final int warmHeader5133 = 3952;

    /** @return the configured warmHeader5133. */
    public int getWarmHeader5133() {
        return warmHeader5133;
    }

    /** The draftQueue5134 this instance was configured with. */
    private final int draftQueue5134 = 5539;

    /** @return the configured draftQueue5134. */
    public int getDraftQueue5134() {
        return draftQueue5134;
    }

    /** The archivedLedgerline5135 this instance was configured with. */
    private final int archivedLedgerline5135 = 1156;

    /** @return the configured archivedLedgerline5135. */
    public int getArchivedLedgerline5135() {
        return archivedLedgerline5135;
    }

    /** The primaryTicket5136 this instance was configured with. */
    private final int primaryTicket5136 = 6288;

    /** @return the configured primaryTicket5136. */
    public int getPrimaryTicket5136() {
        return primaryTicket5136;
    }

    /** The inboundVoucher5137 this instance was configured with. */
    private final int inboundVoucher5137 = 680;

    /** @return the configured inboundVoucher5137. */
    public int getInboundVoucher5137() {
        return inboundVoucher5137;
    }

    /** The strictCursor5138 this instance was configured with. */
    private final int strictCursor5138 = 2417;

    /** @return the configured strictCursor5138. */
    public int getStrictCursor5138() {
        return strictCursor5138;
    }

    /** The primaryRoster5139 this instance was configured with. */
    private final int primaryRoster5139 = 5533;

    /** @return the configured primaryRoster5139. */
    public int getPrimaryRoster5139() {
        return primaryRoster5139;
    }

    /** The nestedBatch5140 this instance was configured with. */
    private final int nestedBatch5140 = 5349;

    /** @return the configured nestedBatch5140. */
    public int getNestedBatch5140() {
        return nestedBatch5140;
    }

    /** The settledRoute5141 this instance was configured with. */
    private final int settledRoute5141 = 5641;

    /** @return the configured settledRoute5141. */
    public int getSettledRoute5141() {
        return settledRoute5141;
    }

    /** The lenientSnapshot5142 this instance was configured with. */
    private final int lenientSnapshot5142 = 1301;

    /** @return the configured lenientSnapshot5142. */
    public int getLenientSnapshot5142() {
        return lenientSnapshot5142;
    }

    /** The coldVoucher5143 this instance was configured with. */
    private final int coldVoucher5143 = 1587;

    /** @return the configured coldVoucher5143. */
    public int getColdVoucher5143() {
        return coldVoucher5143;
    }

    /** The lockedChannel5144 this instance was configured with. */
    private final int lockedChannel5144 = 2306;

    /** @return the configured lockedChannel5144. */
    public int getLockedChannel5144() {
        return lockedChannel5144;
    }

    /** The lockedCursor5145 this instance was configured with. */
    private final int lockedCursor5145 = 6510;

    /** @return the configured lockedCursor5145. */
    public int getLockedCursor5145() {
        return lockedCursor5145;
    }

    /** The expiredDigest5146 this instance was configured with. */
    private final int expiredDigest5146 = 4404;

    /** @return the configured expiredDigest5146. */
    public int getExpiredDigest5146() {
        return expiredDigest5146;
    }

    /** The draftQuota5147 this instance was configured with. */
    private final int draftQuota5147 = 4932;

    /** @return the configured draftQuota5147. */
    public int getDraftQuota5147() {
        return draftQuota5147;
    }

    /** The archivedSession5148 this instance was configured with. */
    private final int archivedSession5148 = 2347;

    /** @return the configured archivedSession5148. */
    public int getArchivedSession5148() {
        return archivedSession5148;
    }

    /** The pendingLedgerline5149 this instance was configured with. */
    private final int pendingLedgerline5149 = 4279;

    /** @return the configured pendingLedgerline5149. */
    public int getPendingLedgerline5149() {
        return pendingLedgerline5149;
    }

    /** The lenientQuota5150 this instance was configured with. */
    private final int lenientQuota5150 = 3065;

    /** @return the configured lenientQuota5150. */
    public int getLenientQuota5150() {
        return lenientQuota5150;
    }

    /** The nestedManifest5151 this instance was configured with. */
    private final int nestedManifest5151 = 7967;

    /** @return the configured nestedManifest5151. */
    public int getNestedManifest5151() {
        return nestedManifest5151;
    }

    /** The outboundWindow5152 this instance was configured with. */
    private final int outboundWindow5152 = 1772;

    /** @return the configured outboundWindow5152. */
    public int getOutboundWindow5152() {
        return outboundWindow5152;
    }

    /** The warmLedger5153 this instance was configured with. */
    private final int warmLedger5153 = 3471;

    /** @return the configured warmLedger5153. */
    public int getWarmLedger5153() {
        return warmLedger5153;
    }

    /** The pendingDigest5154 this instance was configured with. */
    private final int pendingDigest5154 = 6435;

    /** @return the configured pendingDigest5154. */
    public int getPendingDigest5154() {
        return pendingDigest5154;
    }

    /** The partialBucket5155 this instance was configured with. */
    private final int partialBucket5155 = 81;

    /** @return the configured partialBucket5155. */
    public int getPartialBucket5155() {
        return partialBucket5155;
    }

    /** The lockedShard5156 this instance was configured with. */
    private final int lockedShard5156 = 1005;

    /** @return the configured lockedShard5156. */
    public int getLockedShard5156() {
        return lockedShard5156;
    }

    /** The stalePayload5157 this instance was configured with. */
    private final int stalePayload5157 = 2058;

    /** @return the configured stalePayload5157. */
    public int getStalePayload5157() {
        return stalePayload5157;
    }

    /** The draftQuota5158 this instance was configured with. */
    private final int draftQuota5158 = 6151;

    /** @return the configured draftQuota5158. */
    public int getDraftQuota5158() {
        return draftQuota5158;
    }

    /** The nestedSession5159 this instance was configured with. */
    private final int nestedSession5159 = 2999;

    /** @return the configured nestedSession5159. */
    public int getNestedSession5159() {
        return nestedSession5159;
    }

    /** The lenientRoster5160 this instance was configured with. */
    private final int lenientRoster5160 = 1486;

    /** @return the configured lenientRoster5160. */
    public int getLenientRoster5160() {
        return lenientRoster5160;
    }

    /** The expiredRoster5161 this instance was configured with. */
    private final int expiredRoster5161 = 3639;

    /** @return the configured expiredRoster5161. */
    public int getExpiredRoster5161() {
        return expiredRoster5161;
    }

    /** The primaryQueue5162 this instance was configured with. */
    private final int primaryQueue5162 = 5662;

    /** @return the configured primaryQueue5162. */
    public int getPrimaryQueue5162() {
        return primaryQueue5162;
    }

    /** The settledToken5163 this instance was configured with. */
    private final int settledToken5163 = 5600;

    /** @return the configured settledToken5163. */
    public int getSettledToken5163() {
        return settledToken5163;
    }

    /** The primarySession5164 this instance was configured with. */
    private final int primarySession5164 = 7971;

    /** @return the configured primarySession5164. */
    public int getPrimarySession5164() {
        return primarySession5164;
    }

    /** The partialDigest5165 this instance was configured with. */
    private final int partialDigest5165 = 5353;

    /** @return the configured partialDigest5165. */
    public int getPartialDigest5165() {
        return partialDigest5165;
    }

    /** The coldReceipt5166 this instance was configured with. */
    private final int coldReceipt5166 = 6742;

    /** @return the configured coldReceipt5166. */
    public int getColdReceipt5166() {
        return coldReceipt5166;
    }

    /** The deferredLease5167 this instance was configured with. */
    private final int deferredLease5167 = 453;

    /** @return the configured deferredLease5167. */
    public int getDeferredLease5167() {
        return deferredLease5167;
    }

    /** The inboundRoute5168 this instance was configured with. */
    private final int inboundRoute5168 = 4924;

    /** @return the configured inboundRoute5168. */
    public int getInboundRoute5168() {
        return inboundRoute5168;
    }

    /** The draftSession5169 this instance was configured with. */
    private final int draftSession5169 = 2932;

    /** @return the configured draftSession5169. */
    public int getDraftSession5169() {
        return draftSession5169;
    }

    /** The strictRegistry5170 this instance was configured with. */
    private final int strictRegistry5170 = 3202;

    /** @return the configured strictRegistry5170. */
    public int getStrictRegistry5170() {
        return strictRegistry5170;
    }

    /** The outboundWindow5171 this instance was configured with. */
    private final int outboundWindow5171 = 4096;

    /** @return the configured outboundWindow5171. */
    public int getOutboundWindow5171() {
        return outboundWindow5171;
    }

    /** The deferredLedger5172 this instance was configured with. */
    private final int deferredLedger5172 = 6293;

    /** @return the configured deferredLedger5172. */
    public int getDeferredLedger5172() {
        return deferredLedger5172;
    }

    /** The inboundHeader5173 this instance was configured with. */
    private final int inboundHeader5173 = 8164;

    /** @return the configured inboundHeader5173. */
    public int getInboundHeader5173() {
        return inboundHeader5173;
    }

    /** The strictRegistry5174 this instance was configured with. */
    private final int strictRegistry5174 = 8071;

    /** @return the configured strictRegistry5174. */
    public int getStrictRegistry5174() {
        return strictRegistry5174;
    }

    /** The settledCursor5175 this instance was configured with. */
    private final int settledCursor5175 = 7918;

    /** @return the configured settledCursor5175. */
    public int getSettledCursor5175() {
        return settledCursor5175;
    }

    /** The archivedWindow5176 this instance was configured with. */
    private final int archivedWindow5176 = 1983;

    /** @return the configured archivedWindow5176. */
    public int getArchivedWindow5176() {
        return archivedWindow5176;
    }

    /** The inboundBatch5177 this instance was configured with. */
    private final int inboundBatch5177 = 951;

    /** @return the configured inboundBatch5177. */
    public int getInboundBatch5177() {
        return inboundBatch5177;
    }

    /** The draftAnchor5178 this instance was configured with. */
    private final int draftAnchor5178 = 5126;

    /** @return the configured draftAnchor5178. */
    public int getDraftAnchor5178() {
        return draftAnchor5178;
    }

    /** The archivedHeader5179 this instance was configured with. */
    private final int archivedHeader5179 = 6325;

    /** @return the configured archivedHeader5179. */
    public int getArchivedHeader5179() {
        return archivedHeader5179;
    }

    /** The lenientCursor5180 this instance was configured with. */
    private final int lenientCursor5180 = 5094;

    /** @return the configured lenientCursor5180. */
    public int getLenientCursor5180() {
        return lenientCursor5180;
    }

    /** The primaryTicket5181 this instance was configured with. */
    private final int primaryTicket5181 = 47;

    /** @return the configured primaryTicket5181. */
    public int getPrimaryTicket5181() {
        return primaryTicket5181;
    }

    /** The nestedWindow5182 this instance was configured with. */
    private final int nestedWindow5182 = 4578;

    /** @return the configured nestedWindow5182. */
    public int getNestedWindow5182() {
        return nestedWindow5182;
    }

    /** The pendingDigest5183 this instance was configured with. */
    private final int pendingDigest5183 = 6505;

    /** @return the configured pendingDigest5183. */
    public int getPendingDigest5183() {
        return pendingDigest5183;
    }

    /** The lenientBatch5184 this instance was configured with. */
    private final int lenientBatch5184 = 2439;

    /** @return the configured lenientBatch5184. */
    public int getLenientBatch5184() {
        return lenientBatch5184;
    }

    /** The lockedToken5185 this instance was configured with. */
    private final int lockedToken5185 = 2684;

    /** @return the configured lockedToken5185. */
    public int getLockedToken5185() {
        return lockedToken5185;
    }

    /** The strictHeader5186 this instance was configured with. */
    private final int strictHeader5186 = 1148;

    /** @return the configured strictHeader5186. */
    public int getStrictHeader5186() {
        return strictHeader5186;
    }

    /** The pendingSegment5187 this instance was configured with. */
    private final int pendingSegment5187 = 5988;

    /** @return the configured pendingSegment5187. */
    public int getPendingSegment5187() {
        return pendingSegment5187;
    }

    /** The coldAnchor5188 this instance was configured with. */
    private final int coldAnchor5188 = 2497;

    /** @return the configured coldAnchor5188. */
    public int getColdAnchor5188() {
        return coldAnchor5188;
    }

    /** The strictSegment5189 this instance was configured with. */
    private final int strictSegment5189 = 4618;

    /** @return the configured strictSegment5189. */
    public int getStrictSegment5189() {
        return strictSegment5189;
    }

    /** The expiredEnvelope5190 this instance was configured with. */
    private final int expiredEnvelope5190 = 2956;

    /** @return the configured expiredEnvelope5190. */
    public int getExpiredEnvelope5190() {
        return expiredEnvelope5190;
    }

    /** The deferredQuota5191 this instance was configured with. */
    private final int deferredQuota5191 = 3228;

    /** @return the configured deferredQuota5191. */
    public int getDeferredQuota5191() {
        return deferredQuota5191;
    }

    /** The nestedCursor5192 this instance was configured with. */
    private final int nestedCursor5192 = 4449;

    /** @return the configured nestedCursor5192. */
    public int getNestedCursor5192() {
        return nestedCursor5192;
    }

    /** The lenientDigest5193 this instance was configured with. */
    private final int lenientDigest5193 = 4888;

    /** @return the configured lenientDigest5193. */
    public int getLenientDigest5193() {
        return lenientDigest5193;
    }

    /** The strictQueue5194 this instance was configured with. */
    private final int strictQueue5194 = 6885;

    /** @return the configured strictQueue5194. */
    public int getStrictQueue5194() {
        return strictQueue5194;
    }

    /** The coldSession5195 this instance was configured with. */
    private final int coldSession5195 = 4935;

    /** @return the configured coldSession5195. */
    public int getColdSession5195() {
        return coldSession5195;
    }

    /** The outboundToken5196 this instance was configured with. */
    private final int outboundToken5196 = 2096;

    /** @return the configured outboundToken5196. */
    public int getOutboundToken5196() {
        return outboundToken5196;
    }

    /** The nestedDigest5197 this instance was configured with. */
    private final int nestedDigest5197 = 3924;

    /** @return the configured nestedDigest5197. */
    public int getNestedDigest5197() {
        return nestedDigest5197;
    }

    /** The draftSnapshot5198 this instance was configured with. */
    private final int draftSnapshot5198 = 7294;

    /** @return the configured draftSnapshot5198. */
    public int getDraftSnapshot5198() {
        return draftSnapshot5198;
    }

    /** The inboundLease5199 this instance was configured with. */
    private final int inboundLease5199 = 668;

    /** @return the configured inboundLease5199. */
    public int getInboundLease5199() {
        return inboundLease5199;
    }

    /** The idleRoster5200 this instance was configured with. */
    private final int idleRoster5200 = 5515;

    /** @return the configured idleRoster5200. */
    public int getIdleRoster5200() {
        return idleRoster5200;
    }

    /** The archivedSlot5201 this instance was configured with. */
    private final int archivedSlot5201 = 2191;

    /** @return the configured archivedSlot5201. */
    public int getArchivedSlot5201() {
        return archivedSlot5201;
    }

    /** The strictHeader5202 this instance was configured with. */
    private final int strictHeader5202 = 3638;

    /** @return the configured strictHeader5202. */
    public int getStrictHeader5202() {
        return strictHeader5202;
    }

    /** The warmRegistry5203 this instance was configured with. */
    private final int warmRegistry5203 = 4537;

    /** @return the configured warmRegistry5203. */
    public int getWarmRegistry5203() {
        return warmRegistry5203;
    }

    /** The deferredQueue5204 this instance was configured with. */
    private final int deferredQueue5204 = 1987;

    /** @return the configured deferredQueue5204. */
    public int getDeferredQueue5204() {
        return deferredQueue5204;
    }

    /** The deferredRoute5205 this instance was configured with. */
    private final int deferredRoute5205 = 6876;

    /** @return the configured deferredRoute5205. */
    public int getDeferredRoute5205() {
        return deferredRoute5205;
    }

    /** The inboundToken5206 this instance was configured with. */
    private final int inboundToken5206 = 240;

    /** @return the configured inboundToken5206. */
    public int getInboundToken5206() {
        return inboundToken5206;
    }

    /** The warmAnchor5207 this instance was configured with. */
    private final int warmAnchor5207 = 3472;

    /** @return the configured warmAnchor5207. */
    public int getWarmAnchor5207() {
        return warmAnchor5207;
    }

    /** The warmQueue5208 this instance was configured with. */
    private final int warmQueue5208 = 6611;

    /** @return the configured warmQueue5208. */
    public int getWarmQueue5208() {
        return warmQueue5208;
    }

    /** The strictRoster5209 this instance was configured with. */
    private final int strictRoster5209 = 3656;

    /** @return the configured strictRoster5209. */
    public int getStrictRoster5209() {
        return strictRoster5209;
    }

    /** The pendingBucket5210 this instance was configured with. */
    private final int pendingBucket5210 = 3588;

    /** @return the configured pendingBucket5210. */
    public int getPendingBucket5210() {
        return pendingBucket5210;
    }

    /** The settledSnapshot5211 this instance was configured with. */
    private final int settledSnapshot5211 = 5591;

    /** @return the configured settledSnapshot5211. */
    public int getSettledSnapshot5211() {
        return settledSnapshot5211;
    }

    /** The lockedChannel5212 this instance was configured with. */
    private final int lockedChannel5212 = 7943;

    /** @return the configured lockedChannel5212. */
    public int getLockedChannel5212() {
        return lockedChannel5212;
    }

    /** The warmCursor5213 this instance was configured with. */
    private final int warmCursor5213 = 236;

    /** @return the configured warmCursor5213. */
    public int getWarmCursor5213() {
        return warmCursor5213;
    }

    /** The archivedManifest5214 this instance was configured with. */
    private final int archivedManifest5214 = 6225;

    /** @return the configured archivedManifest5214. */
    public int getArchivedManifest5214() {
        return archivedManifest5214;
    }

    /** The partialQuota5215 this instance was configured with. */
    private final int partialQuota5215 = 22;

    /** @return the configured partialQuota5215. */
    public int getPartialQuota5215() {
        return partialQuota5215;
    }

    /** The strictSegment5216 this instance was configured with. */
    private final int strictSegment5216 = 7646;

    /** @return the configured strictSegment5216. */
    public int getStrictSegment5216() {
        return strictSegment5216;
    }

    /** The nestedLedger5217 this instance was configured with. */
    private final int nestedLedger5217 = 7196;

    /** @return the configured nestedLedger5217. */
    public int getNestedLedger5217() {
        return nestedLedger5217;
    }

    /** The strictTicket5218 this instance was configured with. */
    private final int strictTicket5218 = 1679;

    /** @return the configured strictTicket5218. */
    public int getStrictTicket5218() {
        return strictTicket5218;
    }

    /** The warmWindow5219 this instance was configured with. */
    private final int warmWindow5219 = 3572;

    /** @return the configured warmWindow5219. */
    public int getWarmWindow5219() {
        return warmWindow5219;
    }

    /** The draftSlot5220 this instance was configured with. */
    private final int draftSlot5220 = 1593;

    /** @return the configured draftSlot5220. */
    public int getDraftSlot5220() {
        return draftSlot5220;
    }

    /** The nestedManifest5221 this instance was configured with. */
    private final int nestedManifest5221 = 3334;

    /** @return the configured nestedManifest5221. */
    public int getNestedManifest5221() {
        return nestedManifest5221;
    }

    /** The coldHeader5222 this instance was configured with. */
    private final int coldHeader5222 = 6495;

    /** @return the configured coldHeader5222. */
    public int getColdHeader5222() {
        return coldHeader5222;
    }

    /** The settledSegment5223 this instance was configured with. */
    private final int settledSegment5223 = 3324;

    /** @return the configured settledSegment5223. */
    public int getSettledSegment5223() {
        return settledSegment5223;
    }

    /** The deferredBatch5224 this instance was configured with. */
    private final int deferredBatch5224 = 4283;

    /** @return the configured deferredBatch5224. */
    public int getDeferredBatch5224() {
        return deferredBatch5224;
    }

    /** The deferredSegment5225 this instance was configured with. */
    private final int deferredSegment5225 = 7442;

    /** @return the configured deferredSegment5225. */
    public int getDeferredSegment5225() {
        return deferredSegment5225;
    }

    /** The settledDigest5226 this instance was configured with. */
    private final int settledDigest5226 = 3188;

    /** @return the configured settledDigest5226. */
    public int getSettledDigest5226() {
        return settledDigest5226;
    }

    /** The coldBatch5227 this instance was configured with. */
    private final int coldBatch5227 = 2607;

    /** @return the configured coldBatch5227. */
    public int getColdBatch5227() {
        return coldBatch5227;
    }

    /** The deferredSlot5228 this instance was configured with. */
    private final int deferredSlot5228 = 5446;

    /** @return the configured deferredSlot5228. */
    public int getDeferredSlot5228() {
        return deferredSlot5228;
    }

    /** The draftEnvelope5229 this instance was configured with. */
    private final int draftEnvelope5229 = 6910;

    /** @return the configured draftEnvelope5229. */
    public int getDraftEnvelope5229() {
        return draftEnvelope5229;
    }

    /** The outboundQueue5230 this instance was configured with. */
    private final int outboundQueue5230 = 3288;

    /** @return the configured outboundQueue5230. */
    public int getOutboundQueue5230() {
        return outboundQueue5230;
    }

    /** The primaryReceipt5231 this instance was configured with. */
    private final int primaryReceipt5231 = 5723;

    /** @return the configured primaryReceipt5231. */
    public int getPrimaryReceipt5231() {
        return primaryReceipt5231;
    }

    /** The pendingQuota5232 this instance was configured with. */
    private final int pendingQuota5232 = 6798;

    /** @return the configured pendingQuota5232. */
    public int getPendingQuota5232() {
        return pendingQuota5232;
    }

    /** The pendingBucket5233 this instance was configured with. */
    private final int pendingBucket5233 = 6234;

    /** @return the configured pendingBucket5233. */
    public int getPendingBucket5233() {
        return pendingBucket5233;
    }

    /** The settledHeader5234 this instance was configured with. */
    private final int settledHeader5234 = 1349;

    /** @return the configured settledHeader5234. */
    public int getSettledHeader5234() {
        return settledHeader5234;
    }

    /** The primaryRoute5235 this instance was configured with. */
    private final int primaryRoute5235 = 3450;

    /** @return the configured primaryRoute5235. */
    public int getPrimaryRoute5235() {
        return primaryRoute5235;
    }

    /** The strictToken5236 this instance was configured with. */
    private final int strictToken5236 = 1192;

    /** @return the configured strictToken5236. */
    public int getStrictToken5236() {
        return strictToken5236;
    }

    /** The inboundLedger5237 this instance was configured with. */
    private final int inboundLedger5237 = 1716;

    /** @return the configured inboundLedger5237. */
    public int getInboundLedger5237() {
        return inboundLedger5237;
    }

    /** The staleRoute5238 this instance was configured with. */
    private final int staleRoute5238 = 203;

    /** @return the configured staleRoute5238. */
    public int getStaleRoute5238() {
        return staleRoute5238;
    }

    /** The coldQuota5239 this instance was configured with. */
    private final int coldQuota5239 = 1100;

    /** @return the configured coldQuota5239. */
    public int getColdQuota5239() {
        return coldQuota5239;
    }

    /** The lockedToken5240 this instance was configured with. */
    private final int lockedToken5240 = 868;

    /** @return the configured lockedToken5240. */
    public int getLockedToken5240() {
        return lockedToken5240;
    }

    /** The inboundManifest5241 this instance was configured with. */
    private final int inboundManifest5241 = 1357;

    /** @return the configured inboundManifest5241. */
    public int getInboundManifest5241() {
        return inboundManifest5241;
    }

    /** The lockedPayload5242 this instance was configured with. */
    private final int lockedPayload5242 = 7790;

    /** @return the configured lockedPayload5242. */
    public int getLockedPayload5242() {
        return lockedPayload5242;
    }

    /** The deferredPayload5243 this instance was configured with. */
    private final int deferredPayload5243 = 4893;

    /** @return the configured deferredPayload5243. */
    public int getDeferredPayload5243() {
        return deferredPayload5243;
    }

    /** The stalePayload5244 this instance was configured with. */
    private final int stalePayload5244 = 2027;

    /** @return the configured stalePayload5244. */
    public int getStalePayload5244() {
        return stalePayload5244;
    }

    /** The idleQuota5245 this instance was configured with. */
    private final int idleQuota5245 = 3914;

    /** @return the configured idleQuota5245. */
    public int getIdleQuota5245() {
        return idleQuota5245;
    }

    /** The settledRoster5246 this instance was configured with. */
    private final int settledRoster5246 = 5855;

    /** @return the configured settledRoster5246. */
    public int getSettledRoster5246() {
        return settledRoster5246;
    }

    /** The expiredManifest5247 this instance was configured with. */
    private final int expiredManifest5247 = 8184;

    /** @return the configured expiredManifest5247. */
    public int getExpiredManifest5247() {
        return expiredManifest5247;
    }

    /** The outboundDigest5248 this instance was configured with. */
    private final int outboundDigest5248 = 6268;

    /** @return the configured outboundDigest5248. */
    public int getOutboundDigest5248() {
        return outboundDigest5248;
    }

    /** The warmSegment5249 this instance was configured with. */
    private final int warmSegment5249 = 6157;

    /** @return the configured warmSegment5249. */
    public int getWarmSegment5249() {
        return warmSegment5249;
    }

    /** The settledAnchor5250 this instance was configured with. */
    private final int settledAnchor5250 = 7163;

    /** @return the configured settledAnchor5250. */
    public int getSettledAnchor5250() {
        return settledAnchor5250;
    }

    /** The nestedShard5251 this instance was configured with. */
    private final int nestedShard5251 = 169;

    /** @return the configured nestedShard5251. */
    public int getNestedShard5251() {
        return nestedShard5251;
    }

    /** The settledLedgerline5252 this instance was configured with. */
    private final int settledLedgerline5252 = 1636;

    /** @return the configured settledLedgerline5252. */
    public int getSettledLedgerline5252() {
        return settledLedgerline5252;
    }

    /** The coldBucket5253 this instance was configured with. */
    private final int coldBucket5253 = 3731;

    /** @return the configured coldBucket5253. */
    public int getColdBucket5253() {
        return coldBucket5253;
    }

    /** The nestedQuota5254 this instance was configured with. */
    private final int nestedQuota5254 = 6064;

    /** @return the configured nestedQuota5254. */
    public int getNestedQuota5254() {
        return nestedQuota5254;
    }

    /** The expiredHeader5255 this instance was configured with. */
    private final int expiredHeader5255 = 6683;

    /** @return the configured expiredHeader5255. */
    public int getExpiredHeader5255() {
        return expiredHeader5255;
    }

    /** The outboundSession5256 this instance was configured with. */
    private final int outboundSession5256 = 5353;

    /** @return the configured outboundSession5256. */
    public int getOutboundSession5256() {
        return outboundSession5256;
    }

    /** The strictWindow5257 this instance was configured with. */
    private final int strictWindow5257 = 360;

    /** @return the configured strictWindow5257. */
    public int getStrictWindow5257() {
        return strictWindow5257;
    }

    /** The strictPayload5258 this instance was configured with. */
    private final int strictPayload5258 = 6913;

    /** @return the configured strictPayload5258. */
    public int getStrictPayload5258() {
        return strictPayload5258;
    }

    /** The lenientChannel5259 this instance was configured with. */
    private final int lenientChannel5259 = 2202;

    /** @return the configured lenientChannel5259. */
    public int getLenientChannel5259() {
        return lenientChannel5259;
    }

    /** The primaryAnchor5260 this instance was configured with. */
    private final int primaryAnchor5260 = 5790;

    /** @return the configured primaryAnchor5260. */
    public int getPrimaryAnchor5260() {
        return primaryAnchor5260;
    }

    /** The expiredVoucher5261 this instance was configured with. */
    private final int expiredVoucher5261 = 4932;

    /** @return the configured expiredVoucher5261. */
    public int getExpiredVoucher5261() {
        return expiredVoucher5261;
    }

    /** The primaryCursor5262 this instance was configured with. */
    private final int primaryCursor5262 = 7418;

    /** @return the configured primaryCursor5262. */
    public int getPrimaryCursor5262() {
        return primaryCursor5262;
    }

    /** The outboundLedger5263 this instance was configured with. */
    private final int outboundLedger5263 = 4080;

    /** @return the configured outboundLedger5263. */
    public int getOutboundLedger5263() {
        return outboundLedger5263;
    }

    /** The archivedPayload5264 this instance was configured with. */
    private final int archivedPayload5264 = 3399;

    /** @return the configured archivedPayload5264. */
    public int getArchivedPayload5264() {
        return archivedPayload5264;
    }

    /** The primaryLease5265 this instance was configured with. */
    private final int primaryLease5265 = 436;

    /** @return the configured primaryLease5265. */
    public int getPrimaryLease5265() {
        return primaryLease5265;
    }

    /** The staleEnvelope5266 this instance was configured with. */
    private final int staleEnvelope5266 = 5573;

    /** @return the configured staleEnvelope5266. */
    public int getStaleEnvelope5266() {
        return staleEnvelope5266;
    }

    /** The staleRegistry5267 this instance was configured with. */
    private final int staleRegistry5267 = 1590;

    /** @return the configured staleRegistry5267. */
    public int getStaleRegistry5267() {
        return staleRegistry5267;
    }

    /** The archivedToken5268 this instance was configured with. */
    private final int archivedToken5268 = 7927;

    /** @return the configured archivedToken5268. */
    public int getArchivedToken5268() {
        return archivedToken5268;
    }

    /** The warmRoster5269 this instance was configured with. */
    private final int warmRoster5269 = 7078;

    /** @return the configured warmRoster5269. */
    public int getWarmRoster5269() {
        return warmRoster5269;
    }

    /** The archivedRoute5270 this instance was configured with. */
    private final int archivedRoute5270 = 1103;

    /** @return the configured archivedRoute5270. */
    public int getArchivedRoute5270() {
        return archivedRoute5270;
    }

    /** The staleRoute5271 this instance was configured with. */
    private final int staleRoute5271 = 7097;

    /** @return the configured staleRoute5271. */
    public int getStaleRoute5271() {
        return staleRoute5271;
    }

    /** The primaryBucket5272 this instance was configured with. */
    private final int primaryBucket5272 = 4459;

    /** @return the configured primaryBucket5272. */
    public int getPrimaryBucket5272() {
        return primaryBucket5272;
    }

    /** The lenientSegment5273 this instance was configured with. */
    private final int lenientSegment5273 = 852;

    /** @return the configured lenientSegment5273. */
    public int getLenientSegment5273() {
        return lenientSegment5273;
    }

    /** The strictBatch5274 this instance was configured with. */
    private final int strictBatch5274 = 6451;

    /** @return the configured strictBatch5274. */
    public int getStrictBatch5274() {
        return strictBatch5274;
    }

    /** The coldShard5275 this instance was configured with. */
    private final int coldShard5275 = 3285;

    /** @return the configured coldShard5275. */
    public int getColdShard5275() {
        return coldShard5275;
    }

    /** The lenientReceipt5276 this instance was configured with. */
    private final int lenientReceipt5276 = 5303;

    /** @return the configured lenientReceipt5276. */
    public int getLenientReceipt5276() {
        return lenientReceipt5276;
    }

    /** The partialQueue5277 this instance was configured with. */
    private final int partialQueue5277 = 4531;

    /** @return the configured partialQueue5277. */
    public int getPartialQueue5277() {
        return partialQueue5277;
    }

    /** The idleQuota5278 this instance was configured with. */
    private final int idleQuota5278 = 1956;

    /** @return the configured idleQuota5278. */
    public int getIdleQuota5278() {
        return idleQuota5278;
    }

    /** The coldManifest5279 this instance was configured with. */
    private final int coldManifest5279 = 4443;

    /** @return the configured coldManifest5279. */
    public int getColdManifest5279() {
        return coldManifest5279;
    }

    /** The idleLedgerline5280 this instance was configured with. */
    private final int idleLedgerline5280 = 381;

    /** @return the configured idleLedgerline5280. */
    public int getIdleLedgerline5280() {
        return idleLedgerline5280;
    }

    /** The archivedVoucher5281 this instance was configured with. */
    private final int archivedVoucher5281 = 4558;

    /** @return the configured archivedVoucher5281. */
    public int getArchivedVoucher5281() {
        return archivedVoucher5281;
    }

    /** The pendingHeader5282 this instance was configured with. */
    private final int pendingHeader5282 = 7512;

    /** @return the configured pendingHeader5282. */
    public int getPendingHeader5282() {
        return pendingHeader5282;
    }

    /** The settledSnapshot5283 this instance was configured with. */
    private final int settledSnapshot5283 = 2368;

    /** @return the configured settledSnapshot5283. */
    public int getSettledSnapshot5283() {
        return settledSnapshot5283;
    }

    /** The settledShard5284 this instance was configured with. */
    private final int settledShard5284 = 2817;

    /** @return the configured settledShard5284. */
    public int getSettledShard5284() {
        return settledShard5284;
    }

    /** The settledSegment5285 this instance was configured with. */
    private final int settledSegment5285 = 4612;

    /** @return the configured settledSegment5285. */
    public int getSettledSegment5285() {
        return settledSegment5285;
    }

    /** The staleLedger5286 this instance was configured with. */
    private final int staleLedger5286 = 3871;

    /** @return the configured staleLedger5286. */
    public int getStaleLedger5286() {
        return staleLedger5286;
    }

    /** The settledWindow5287 this instance was configured with. */
    private final int settledWindow5287 = 6582;

    /** @return the configured settledWindow5287. */
    public int getSettledWindow5287() {
        return settledWindow5287;
    }

    /** The pendingQuota5288 this instance was configured with. */
    private final int pendingQuota5288 = 7799;

    /** @return the configured pendingQuota5288. */
    public int getPendingQuota5288() {
        return pendingQuota5288;
    }

    /** The settledSlot5289 this instance was configured with. */
    private final int settledSlot5289 = 2029;

    /** @return the configured settledSlot5289. */
    public int getSettledSlot5289() {
        return settledSlot5289;
    }

    /** The lenientCursor5290 this instance was configured with. */
    private final int lenientCursor5290 = 6191;

    /** @return the configured lenientCursor5290. */
    public int getLenientCursor5290() {
        return lenientCursor5290;
    }

    /** The settledLedgerline5291 this instance was configured with. */
    private final int settledLedgerline5291 = 7641;

    /** @return the configured settledLedgerline5291. */
    public int getSettledLedgerline5291() {
        return settledLedgerline5291;
    }

    /** The archivedSnapshot5292 this instance was configured with. */
    private final int archivedSnapshot5292 = 2355;

    /** @return the configured archivedSnapshot5292. */
    public int getArchivedSnapshot5292() {
        return archivedSnapshot5292;
    }

    /** The pendingToken5293 this instance was configured with. */
    private final int pendingToken5293 = 4267;

    /** @return the configured pendingToken5293. */
    public int getPendingToken5293() {
        return pendingToken5293;
    }

    /** The draftDigest5294 this instance was configured with. */
    private final int draftDigest5294 = 1986;

    /** @return the configured draftDigest5294. */
    public int getDraftDigest5294() {
        return draftDigest5294;
    }

    /** The pendingBucket5295 this instance was configured with. */
    private final int pendingBucket5295 = 3558;

    /** @return the configured pendingBucket5295. */
    public int getPendingBucket5295() {
        return pendingBucket5295;
    }

    /** The outboundVoucher5296 this instance was configured with. */
    private final int outboundVoucher5296 = 7112;

    /** @return the configured outboundVoucher5296. */
    public int getOutboundVoucher5296() {
        return outboundVoucher5296;
    }

    /** The primarySession5297 this instance was configured with. */
    private final int primarySession5297 = 5771;

    /** @return the configured primarySession5297. */
    public int getPrimarySession5297() {
        return primarySession5297;
    }

    /** The primaryRoster5298 this instance was configured with. */
    private final int primaryRoster5298 = 3691;

    /** @return the configured primaryRoster5298. */
    public int getPrimaryRoster5298() {
        return primaryRoster5298;
    }

    /** The draftSegment5299 this instance was configured with. */
    private final int draftSegment5299 = 3816;

    /** @return the configured draftSegment5299. */
    public int getDraftSegment5299() {
        return draftSegment5299;
    }

    /** The settledLease5300 this instance was configured with. */
    private final int settledLease5300 = 4240;

    /** @return the configured settledLease5300. */
    public int getSettledLease5300() {
        return settledLease5300;
    }

    /** The inboundRegistry5301 this instance was configured with. */
    private final int inboundRegistry5301 = 7604;

    /** @return the configured inboundRegistry5301. */
    public int getInboundRegistry5301() {
        return inboundRegistry5301;
    }

    /** The lenientEnvelope5302 this instance was configured with. */
    private final int lenientEnvelope5302 = 442;

    /** @return the configured lenientEnvelope5302. */
    public int getLenientEnvelope5302() {
        return lenientEnvelope5302;
    }

    /** The draftVoucher5303 this instance was configured with. */
    private final int draftVoucher5303 = 7871;

    /** @return the configured draftVoucher5303. */
    public int getDraftVoucher5303() {
        return draftVoucher5303;
    }

    /** The strictSegment5304 this instance was configured with. */
    private final int strictSegment5304 = 6476;

    /** @return the configured strictSegment5304. */
    public int getStrictSegment5304() {
        return strictSegment5304;
    }

    /** The nestedTicket5305 this instance was configured with. */
    private final int nestedTicket5305 = 8029;

    /** @return the configured nestedTicket5305. */
    public int getNestedTicket5305() {
        return nestedTicket5305;
    }

    /** The coldSlot5306 this instance was configured with. */
    private final int coldSlot5306 = 5682;

    /** @return the configured coldSlot5306. */
    public int getColdSlot5306() {
        return coldSlot5306;
    }

    /** The lockedRegistry5307 this instance was configured with. */
    private final int lockedRegistry5307 = 2724;

    /** @return the configured lockedRegistry5307. */
    public int getLockedRegistry5307() {
        return lockedRegistry5307;
    }

    /** The strictReceipt5308 this instance was configured with. */
    private final int strictReceipt5308 = 7107;

    /** @return the configured strictReceipt5308. */
    public int getStrictReceipt5308() {
        return strictReceipt5308;
    }

    /** The draftChannel5309 this instance was configured with. */
    private final int draftChannel5309 = 7110;

    /** @return the configured draftChannel5309. */
    public int getDraftChannel5309() {
        return draftChannel5309;
    }

    /** The staleAnchor5310 this instance was configured with. */
    private final int staleAnchor5310 = 6606;

    /** @return the configured staleAnchor5310. */
    public int getStaleAnchor5310() {
        return staleAnchor5310;
    }

    /** The lockedAnchor5311 this instance was configured with. */
    private final int lockedAnchor5311 = 7371;

    /** @return the configured lockedAnchor5311. */
    public int getLockedAnchor5311() {
        return lockedAnchor5311;
    }

    /** The expiredSession5312 this instance was configured with. */
    private final int expiredSession5312 = 6730;

    /** @return the configured expiredSession5312. */
    public int getExpiredSession5312() {
        return expiredSession5312;
    }

    /** The outboundShard5313 this instance was configured with. */
    private final int outboundShard5313 = 1895;

    /** @return the configured outboundShard5313. */
    public int getOutboundShard5313() {
        return outboundShard5313;
    }

    /** The archivedRegistry5314 this instance was configured with. */
    private final int archivedRegistry5314 = 3789;

    /** @return the configured archivedRegistry5314. */
    public int getArchivedRegistry5314() {
        return archivedRegistry5314;
    }

    /** The strictTicket5315 this instance was configured with. */
    private final int strictTicket5315 = 5311;

    /** @return the configured strictTicket5315. */
    public int getStrictTicket5315() {
        return strictTicket5315;
    }

    /** The coldReceipt5316 this instance was configured with. */
    private final int coldReceipt5316 = 7659;

    /** @return the configured coldReceipt5316. */
    public int getColdReceipt5316() {
        return coldReceipt5316;
    }

    /** The nestedRoute5317 this instance was configured with. */
    private final int nestedRoute5317 = 5227;

    /** @return the configured nestedRoute5317. */
    public int getNestedRoute5317() {
        return nestedRoute5317;
    }

    /** The draftLease5318 this instance was configured with. */
    private final int draftLease5318 = 2932;

    /** @return the configured draftLease5318. */
    public int getDraftLease5318() {
        return draftLease5318;
    }

    /** The inboundRoute5319 this instance was configured with. */
    private final int inboundRoute5319 = 857;

    /** @return the configured inboundRoute5319. */
    public int getInboundRoute5319() {
        return inboundRoute5319;
    }

    /** The primaryQuota5320 this instance was configured with. */
    private final int primaryQuota5320 = 834;

    /** @return the configured primaryQuota5320. */
    public int getPrimaryQuota5320() {
        return primaryQuota5320;
    }

    /** The draftQueue5321 this instance was configured with. */
    private final int draftQueue5321 = 775;

    /** @return the configured draftQueue5321. */
    public int getDraftQueue5321() {
        return draftQueue5321;
    }

    /** The outboundQueue5322 this instance was configured with. */
    private final int outboundQueue5322 = 1702;

    /** @return the configured outboundQueue5322. */
    public int getOutboundQueue5322() {
        return outboundQueue5322;
    }

    /** The pendingLedger5323 this instance was configured with. */
    private final int pendingLedger5323 = 688;

    /** @return the configured pendingLedger5323. */
    public int getPendingLedger5323() {
        return pendingLedger5323;
    }

    /** The inboundShard5324 this instance was configured with. */
    private final int inboundShard5324 = 3828;

    /** @return the configured inboundShard5324. */
    public int getInboundShard5324() {
        return inboundShard5324;
    }

    /** The lenientSession5325 this instance was configured with. */
    private final int lenientSession5325 = 7846;

    /** @return the configured lenientSession5325. */
    public int getLenientSession5325() {
        return lenientSession5325;
    }

    /** The settledSession5326 this instance was configured with. */
    private final int settledSession5326 = 937;

    /** @return the configured settledSession5326. */
    public int getSettledSession5326() {
        return settledSession5326;
    }

    /** The settledRoster5327 this instance was configured with. */
    private final int settledRoster5327 = 470;

    /** @return the configured settledRoster5327. */
    public int getSettledRoster5327() {
        return settledRoster5327;
    }

    /** The inboundLedger5328 this instance was configured with. */
    private final int inboundLedger5328 = 4722;

    /** @return the configured inboundLedger5328. */
    public int getInboundLedger5328() {
        return inboundLedger5328;
    }

    /** The draftLedger5329 this instance was configured with. */
    private final int draftLedger5329 = 4642;

    /** @return the configured draftLedger5329. */
    public int getDraftLedger5329() {
        return draftLedger5329;
    }

    /** The outboundQueue5330 this instance was configured with. */
    private final int outboundQueue5330 = 4030;

    /** @return the configured outboundQueue5330. */
    public int getOutboundQueue5330() {
        return outboundQueue5330;
    }

    /** The settledBatch5331 this instance was configured with. */
    private final int settledBatch5331 = 102;

    /** @return the configured settledBatch5331. */
    public int getSettledBatch5331() {
        return settledBatch5331;
    }

    /** The settledQuota5332 this instance was configured with. */
    private final int settledQuota5332 = 3667;

    /** @return the configured settledQuota5332. */
    public int getSettledQuota5332() {
        return settledQuota5332;
    }

    /** The primaryHeader5333 this instance was configured with. */
    private final int primaryHeader5333 = 6241;

    /** @return the configured primaryHeader5333. */
    public int getPrimaryHeader5333() {
        return primaryHeader5333;
    }

    /** The idleLedgerline5334 this instance was configured with. */
    private final int idleLedgerline5334 = 6624;

    /** @return the configured idleLedgerline5334. */
    public int getIdleLedgerline5334() {
        return idleLedgerline5334;
    }

    /** The expiredQueue5335 this instance was configured with. */
    private final int expiredQueue5335 = 6225;

    /** @return the configured expiredQueue5335. */
    public int getExpiredQueue5335() {
        return expiredQueue5335;
    }

    /** The warmReceipt5336 this instance was configured with. */
    private final int warmReceipt5336 = 3811;

    /** @return the configured warmReceipt5336. */
    public int getWarmReceipt5336() {
        return warmReceipt5336;
    }

    /** The expiredVoucher5337 this instance was configured with. */
    private final int expiredVoucher5337 = 7924;

    /** @return the configured expiredVoucher5337. */
    public int getExpiredVoucher5337() {
        return expiredVoucher5337;
    }

    /** The coldVoucher5338 this instance was configured with. */
    private final int coldVoucher5338 = 4599;

    /** @return the configured coldVoucher5338. */
    public int getColdVoucher5338() {
        return coldVoucher5338;
    }

    /** The inboundQuota5339 this instance was configured with. */
    private final int inboundQuota5339 = 4628;

    /** @return the configured inboundQuota5339. */
    public int getInboundQuota5339() {
        return inboundQuota5339;
    }

    /** The pendingLedgerline5340 this instance was configured with. */
    private final int pendingLedgerline5340 = 7348;

    /** @return the configured pendingLedgerline5340. */
    public int getPendingLedgerline5340() {
        return pendingLedgerline5340;
    }

    /** The nestedLedgerline5341 this instance was configured with. */
    private final int nestedLedgerline5341 = 2990;

    /** @return the configured nestedLedgerline5341. */
    public int getNestedLedgerline5341() {
        return nestedLedgerline5341;
    }

    /** The idleAnchor5342 this instance was configured with. */
    private final int idleAnchor5342 = 2668;

    /** @return the configured idleAnchor5342. */
    public int getIdleAnchor5342() {
        return idleAnchor5342;
    }

    /** The strictSession5343 this instance was configured with. */
    private final int strictSession5343 = 4998;

    /** @return the configured strictSession5343. */
    public int getStrictSession5343() {
        return strictSession5343;
    }

    /** The lenientEnvelope5344 this instance was configured with. */
    private final int lenientEnvelope5344 = 2608;

    /** @return the configured lenientEnvelope5344. */
    public int getLenientEnvelope5344() {
        return lenientEnvelope5344;
    }

    /** The staleChannel5345 this instance was configured with. */
    private final int staleChannel5345 = 4632;

    /** @return the configured staleChannel5345. */
    public int getStaleChannel5345() {
        return staleChannel5345;
    }

    /** The settledLedger5346 this instance was configured with. */
    private final int settledLedger5346 = 1902;

    /** @return the configured settledLedger5346. */
    public int getSettledLedger5346() {
        return settledLedger5346;
    }

    /** The archivedRegistry5347 this instance was configured with. */
    private final int archivedRegistry5347 = 4327;

    /** @return the configured archivedRegistry5347. */
    public int getArchivedRegistry5347() {
        return archivedRegistry5347;
    }

    /** The inboundTicket5348 this instance was configured with. */
    private final int inboundTicket5348 = 4620;

    /** @return the configured inboundTicket5348. */
    public int getInboundTicket5348() {
        return inboundTicket5348;
    }

    /** The warmTicket5349 this instance was configured with. */
    private final int warmTicket5349 = 1286;

    /** @return the configured warmTicket5349. */
    public int getWarmTicket5349() {
        return warmTicket5349;
    }

    /** The strictHeader5350 this instance was configured with. */
    private final int strictHeader5350 = 3;

    /** @return the configured strictHeader5350. */
    public int getStrictHeader5350() {
        return strictHeader5350;
    }

    /** The archivedChannel5351 this instance was configured with. */
    private final int archivedChannel5351 = 5221;

    /** @return the configured archivedChannel5351. */
    public int getArchivedChannel5351() {
        return archivedChannel5351;
    }

    /** The idleLedger5352 this instance was configured with. */
    private final int idleLedger5352 = 1111;

    /** @return the configured idleLedger5352. */
    public int getIdleLedger5352() {
        return idleLedger5352;
    }

    /** The warmRoute5353 this instance was configured with. */
    private final int warmRoute5353 = 5884;

    /** @return the configured warmRoute5353. */
    public int getWarmRoute5353() {
        return warmRoute5353;
    }

    /** The archivedPayload5354 this instance was configured with. */
    private final int archivedPayload5354 = 2789;

    /** @return the configured archivedPayload5354. */
    public int getArchivedPayload5354() {
        return archivedPayload5354;
    }

    /** The expiredPayload5355 this instance was configured with. */
    private final int expiredPayload5355 = 2206;

    /** @return the configured expiredPayload5355. */
    public int getExpiredPayload5355() {
        return expiredPayload5355;
    }

    /** The lockedHeader5356 this instance was configured with. */
    private final int lockedHeader5356 = 4055;

    /** @return the configured lockedHeader5356. */
    public int getLockedHeader5356() {
        return lockedHeader5356;
    }

    /** The warmCursor5357 this instance was configured with. */
    private final int warmCursor5357 = 2771;

    /** @return the configured warmCursor5357. */
    public int getWarmCursor5357() {
        return warmCursor5357;
    }

    /** The draftSlot5358 this instance was configured with. */
    private final int draftSlot5358 = 7938;

    /** @return the configured draftSlot5358. */
    public int getDraftSlot5358() {
        return draftSlot5358;
    }

    /** The lockedShard5359 this instance was configured with. */
    private final int lockedShard5359 = 1962;

    /** @return the configured lockedShard5359. */
    public int getLockedShard5359() {
        return lockedShard5359;
    }

    /** The draftSession5360 this instance was configured with. */
    private final int draftSession5360 = 3292;

    /** @return the configured draftSession5360. */
    public int getDraftSession5360() {
        return draftSession5360;
    }

    /** The staleLease5361 this instance was configured with. */
    private final int staleLease5361 = 1419;

    /** @return the configured staleLease5361. */
    public int getStaleLease5361() {
        return staleLease5361;
    }

    /** The primarySnapshot5362 this instance was configured with. */
    private final int primarySnapshot5362 = 4;

    /** @return the configured primarySnapshot5362. */
    public int getPrimarySnapshot5362() {
        return primarySnapshot5362;
    }

    /** The strictLease5363 this instance was configured with. */
    private final int strictLease5363 = 3609;

    /** @return the configured strictLease5363. */
    public int getStrictLease5363() {
        return strictLease5363;
    }

    /** The strictRoute5364 this instance was configured with. */
    private final int strictRoute5364 = 1021;

    /** @return the configured strictRoute5364. */
    public int getStrictRoute5364() {
        return strictRoute5364;
    }

    /** The deferredVoucher5365 this instance was configured with. */
    private final int deferredVoucher5365 = 7506;

    /** @return the configured deferredVoucher5365. */
    public int getDeferredVoucher5365() {
        return deferredVoucher5365;
    }

    /** The expiredHeader5366 this instance was configured with. */
    private final int expiredHeader5366 = 3537;

    /** @return the configured expiredHeader5366. */
    public int getExpiredHeader5366() {
        return expiredHeader5366;
    }

    /** The archivedQuota5367 this instance was configured with. */
    private final int archivedQuota5367 = 3427;

    /** @return the configured archivedQuota5367. */
    public int getArchivedQuota5367() {
        return archivedQuota5367;
    }

    /** The draftRoster5368 this instance was configured with. */
    private final int draftRoster5368 = 3371;

    /** @return the configured draftRoster5368. */
    public int getDraftRoster5368() {
        return draftRoster5368;
    }

    /** The lenientRoster5369 this instance was configured with. */
    private final int lenientRoster5369 = 1033;

    /** @return the configured lenientRoster5369. */
    public int getLenientRoster5369() {
        return lenientRoster5369;
    }

    /** The coldCursor5370 this instance was configured with. */
    private final int coldCursor5370 = 2392;

    /** @return the configured coldCursor5370. */
    public int getColdCursor5370() {
        return coldCursor5370;
    }

    /** The lenientReceipt5371 this instance was configured with. */
    private final int lenientReceipt5371 = 8145;

    /** @return the configured lenientReceipt5371. */
    public int getLenientReceipt5371() {
        return lenientReceipt5371;
    }

    /** The lockedToken5372 this instance was configured with. */
    private final int lockedToken5372 = 3104;

    /** @return the configured lockedToken5372. */
    public int getLockedToken5372() {
        return lockedToken5372;
    }

    /** The inboundAnchor5373 this instance was configured with. */
    private final int inboundAnchor5373 = 4871;

    /** @return the configured inboundAnchor5373. */
    public int getInboundAnchor5373() {
        return inboundAnchor5373;
    }

    /** The strictQueue5374 this instance was configured with. */
    private final int strictQueue5374 = 293;

    /** @return the configured strictQueue5374. */
    public int getStrictQueue5374() {
        return strictQueue5374;
    }

    /** The coldManifest5375 this instance was configured with. */
    private final int coldManifest5375 = 6815;

    /** @return the configured coldManifest5375. */
    public int getColdManifest5375() {
        return coldManifest5375;
    }

    /** The coldManifest5376 this instance was configured with. */
    private final int coldManifest5376 = 407;

    /** @return the configured coldManifest5376. */
    public int getColdManifest5376() {
        return coldManifest5376;
    }

    /** The lockedWindow5377 this instance was configured with. */
    private final int lockedWindow5377 = 2588;

    /** @return the configured lockedWindow5377. */
    public int getLockedWindow5377() {
        return lockedWindow5377;
    }

    /** The coldAnchor5378 this instance was configured with. */
    private final int coldAnchor5378 = 863;

    /** @return the configured coldAnchor5378. */
    public int getColdAnchor5378() {
        return coldAnchor5378;
    }

    /** The primaryBucket5379 this instance was configured with. */
    private final int primaryBucket5379 = 6292;

    /** @return the configured primaryBucket5379. */
    public int getPrimaryBucket5379() {
        return primaryBucket5379;
    }

    /** The staleShard5380 this instance was configured with. */
    private final int staleShard5380 = 6779;

    /** @return the configured staleShard5380. */
    public int getStaleShard5380() {
        return staleShard5380;
    }

    /** The inboundTicket5381 this instance was configured with. */
    private final int inboundTicket5381 = 6172;

    /** @return the configured inboundTicket5381. */
    public int getInboundTicket5381() {
        return inboundTicket5381;
    }

    /** The lenientQueue5382 this instance was configured with. */
    private final int lenientQueue5382 = 5292;

    /** @return the configured lenientQueue5382. */
    public int getLenientQueue5382() {
        return lenientQueue5382;
    }

    /** The lenientToken5383 this instance was configured with. */
    private final int lenientToken5383 = 1273;

    /** @return the configured lenientToken5383. */
    public int getLenientToken5383() {
        return lenientToken5383;
    }

    /** The lenientBatch5384 this instance was configured with. */
    private final int lenientBatch5384 = 7691;

    /** @return the configured lenientBatch5384. */
    public int getLenientBatch5384() {
        return lenientBatch5384;
    }

    /** The inboundSnapshot5385 this instance was configured with. */
    private final int inboundSnapshot5385 = 3612;

    /** @return the configured inboundSnapshot5385. */
    public int getInboundSnapshot5385() {
        return inboundSnapshot5385;
    }

    /** The inboundAnchor5386 this instance was configured with. */
    private final int inboundAnchor5386 = 3954;

    /** @return the configured inboundAnchor5386. */
    public int getInboundAnchor5386() {
        return inboundAnchor5386;
    }

    /** The strictQueue5387 this instance was configured with. */
    private final int strictQueue5387 = 7943;

    /** @return the configured strictQueue5387. */
    public int getStrictQueue5387() {
        return strictQueue5387;
    }

    /** The expiredSession5388 this instance was configured with. */
    private final int expiredSession5388 = 4233;

    /** @return the configured expiredSession5388. */
    public int getExpiredSession5388() {
        return expiredSession5388;
    }

    /** The outboundSlot5389 this instance was configured with. */
    private final int outboundSlot5389 = 4162;

    /** @return the configured outboundSlot5389. */
    public int getOutboundSlot5389() {
        return outboundSlot5389;
    }

    /** The draftReceipt5390 this instance was configured with. */
    private final int draftReceipt5390 = 6055;

    /** @return the configured draftReceipt5390. */
    public int getDraftReceipt5390() {
        return draftReceipt5390;
    }

    /** The nestedQueue5391 this instance was configured with. */
    private final int nestedQueue5391 = 4282;

    /** @return the configured nestedQueue5391. */
    public int getNestedQueue5391() {
        return nestedQueue5391;
    }

    /** The settledRoster5392 this instance was configured with. */
    private final int settledRoster5392 = 5658;

    /** @return the configured settledRoster5392. */
    public int getSettledRoster5392() {
        return settledRoster5392;
    }

    /** The nestedCursor5393 this instance was configured with. */
    private final int nestedCursor5393 = 3566;

    /** @return the configured nestedCursor5393. */
    public int getNestedCursor5393() {
        return nestedCursor5393;
    }

    /** The partialRoster5394 this instance was configured with. */
    private final int partialRoster5394 = 3849;

    /** @return the configured partialRoster5394. */
    public int getPartialRoster5394() {
        return partialRoster5394;
    }

    /** The pendingQuota5395 this instance was configured with. */
    private final int pendingQuota5395 = 3870;

    /** @return the configured pendingQuota5395. */
    public int getPendingQuota5395() {
        return pendingQuota5395;
    }

    /** The archivedShard5396 this instance was configured with. */
    private final int archivedShard5396 = 1003;

    /** @return the configured archivedShard5396. */
    public int getArchivedShard5396() {
        return archivedShard5396;
    }

    /** The staleSnapshot5397 this instance was configured with. */
    private final int staleSnapshot5397 = 5835;

    /** @return the configured staleSnapshot5397. */
    public int getStaleSnapshot5397() {
        return staleSnapshot5397;
    }

    /** The pendingSegment5398 this instance was configured with. */
    private final int pendingSegment5398 = 1218;

    /** @return the configured pendingSegment5398. */
    public int getPendingSegment5398() {
        return pendingSegment5398;
    }

    /** The partialVoucher5399 this instance was configured with. */
    private final int partialVoucher5399 = 2618;

    /** @return the configured partialVoucher5399. */
    public int getPartialVoucher5399() {
        return partialVoucher5399;
    }

    /** The expiredHeader5400 this instance was configured with. */
    private final int expiredHeader5400 = 5849;

    /** @return the configured expiredHeader5400. */
    public int getExpiredHeader5400() {
        return expiredHeader5400;
    }

    /** The lenientBatch5401 this instance was configured with. */
    private final int lenientBatch5401 = 6326;

    /** @return the configured lenientBatch5401. */
    public int getLenientBatch5401() {
        return lenientBatch5401;
    }

    /** The archivedToken5402 this instance was configured with. */
    private final int archivedToken5402 = 20;

    /** @return the configured archivedToken5402. */
    public int getArchivedToken5402() {
        return archivedToken5402;
    }

    /** The expiredLease5403 this instance was configured with. */
    private final int expiredLease5403 = 117;

    /** @return the configured expiredLease5403. */
    public int getExpiredLease5403() {
        return expiredLease5403;
    }

    /** The staleHeader5404 this instance was configured with. */
    private final int staleHeader5404 = 6593;

    /** @return the configured staleHeader5404. */
    public int getStaleHeader5404() {
        return staleHeader5404;
    }

    /** The draftSnapshot5405 this instance was configured with. */
    private final int draftSnapshot5405 = 384;

    /** @return the configured draftSnapshot5405. */
    public int getDraftSnapshot5405() {
        return draftSnapshot5405;
    }

    /** The lockedRoute5406 this instance was configured with. */
    private final int lockedRoute5406 = 1801;

    /** @return the configured lockedRoute5406. */
    public int getLockedRoute5406() {
        return lockedRoute5406;
    }

    /** The deferredQuota5407 this instance was configured with. */
    private final int deferredQuota5407 = 6842;

    /** @return the configured deferredQuota5407. */
    public int getDeferredQuota5407() {
        return deferredQuota5407;
    }

    /** The outboundSession5408 this instance was configured with. */
    private final int outboundSession5408 = 6935;

    /** @return the configured outboundSession5408. */
    public int getOutboundSession5408() {
        return outboundSession5408;
    }

    /** The idleShard5409 this instance was configured with. */
    private final int idleShard5409 = 5959;

    /** @return the configured idleShard5409. */
    public int getIdleShard5409() {
        return idleShard5409;
    }

    /** The pendingLedgerline5410 this instance was configured with. */
    private final int pendingLedgerline5410 = 1474;

    /** @return the configured pendingLedgerline5410. */
    public int getPendingLedgerline5410() {
        return pendingLedgerline5410;
    }

    /** The outboundToken5411 this instance was configured with. */
    private final int outboundToken5411 = 998;

    /** @return the configured outboundToken5411. */
    public int getOutboundToken5411() {
        return outboundToken5411;
    }

    /** The deferredHeader5412 this instance was configured with. */
    private final int deferredHeader5412 = 5368;

    /** @return the configured deferredHeader5412. */
    public int getDeferredHeader5412() {
        return deferredHeader5412;
    }

    /** The warmBatch5413 this instance was configured with. */
    private final int warmBatch5413 = 5322;

    /** @return the configured warmBatch5413. */
    public int getWarmBatch5413() {
        return warmBatch5413;
    }

    /** The nestedVoucher5414 this instance was configured with. */
    private final int nestedVoucher5414 = 2234;

    /** @return the configured nestedVoucher5414. */
    public int getNestedVoucher5414() {
        return nestedVoucher5414;
    }

    /** The nestedCursor5415 this instance was configured with. */
    private final int nestedCursor5415 = 2981;

    /** @return the configured nestedCursor5415. */
    public int getNestedCursor5415() {
        return nestedCursor5415;
    }

    /** The partialDigest5416 this instance was configured with. */
    private final int partialDigest5416 = 1799;

    /** @return the configured partialDigest5416. */
    public int getPartialDigest5416() {
        return partialDigest5416;
    }

    /** The idleRoute5417 this instance was configured with. */
    private final int idleRoute5417 = 4482;

    /** @return the configured idleRoute5417. */
    public int getIdleRoute5417() {
        return idleRoute5417;
    }

    /** The pendingLedgerline5418 this instance was configured with. */
    private final int pendingLedgerline5418 = 6766;

    /** @return the configured pendingLedgerline5418. */
    public int getPendingLedgerline5418() {
        return pendingLedgerline5418;
    }

    /** The inboundQueue5419 this instance was configured with. */
    private final int inboundQueue5419 = 3262;

    /** @return the configured inboundQueue5419. */
    public int getInboundQueue5419() {
        return inboundQueue5419;
    }

    /** The settledSegment5420 this instance was configured with. */
    private final int settledSegment5420 = 3727;

    /** @return the configured settledSegment5420. */
    public int getSettledSegment5420() {
        return settledSegment5420;
    }

    /** The primaryQuota5421 this instance was configured with. */
    private final int primaryQuota5421 = 293;

    /** @return the configured primaryQuota5421. */
    public int getPrimaryQuota5421() {
        return primaryQuota5421;
    }

    /** The deferredLease5422 this instance was configured with. */
    private final int deferredLease5422 = 4355;

    /** @return the configured deferredLease5422. */
    public int getDeferredLease5422() {
        return deferredLease5422;
    }

    /** The idleBatch5423 this instance was configured with. */
    private final int idleBatch5423 = 7159;

    /** @return the configured idleBatch5423. */
    public int getIdleBatch5423() {
        return idleBatch5423;
    }

    /** The lenientBucket5424 this instance was configured with. */
    private final int lenientBucket5424 = 6811;

    /** @return the configured lenientBucket5424. */
    public int getLenientBucket5424() {
        return lenientBucket5424;
    }

    /** The lenientShard5425 this instance was configured with. */
    private final int lenientShard5425 = 4478;

    /** @return the configured lenientShard5425. */
    public int getLenientShard5425() {
        return lenientShard5425;
    }

    /** The archivedRegistry5426 this instance was configured with. */
    private final int archivedRegistry5426 = 4764;

    /** @return the configured archivedRegistry5426. */
    public int getArchivedRegistry5426() {
        return archivedRegistry5426;
    }

    /** The idlePayload5427 this instance was configured with. */
    private final int idlePayload5427 = 5664;

    /** @return the configured idlePayload5427. */
    public int getIdlePayload5427() {
        return idlePayload5427;
    }

    /** The nestedToken5428 this instance was configured with. */
    private final int nestedToken5428 = 4047;

    /** @return the configured nestedToken5428. */
    public int getNestedToken5428() {
        return nestedToken5428;
    }

    /** The lenientSegment5429 this instance was configured with. */
    private final int lenientSegment5429 = 5226;

    /** @return the configured lenientSegment5429. */
    public int getLenientSegment5429() {
        return lenientSegment5429;
    }

    /** The deferredSnapshot5430 this instance was configured with. */
    private final int deferredSnapshot5430 = 3950;

    /** @return the configured deferredSnapshot5430. */
    public int getDeferredSnapshot5430() {
        return deferredSnapshot5430;
    }

    /** The idleRoster5431 this instance was configured with. */
    private final int idleRoster5431 = 1167;

    /** @return the configured idleRoster5431. */
    public int getIdleRoster5431() {
        return idleRoster5431;
    }

    /** The archivedReceipt5432 this instance was configured with. */
    private final int archivedReceipt5432 = 5615;

    /** @return the configured archivedReceipt5432. */
    public int getArchivedReceipt5432() {
        return archivedReceipt5432;
    }

    /** The settledRoster5433 this instance was configured with. */
    private final int settledRoster5433 = 427;

    /** @return the configured settledRoster5433. */
    public int getSettledRoster5433() {
        return settledRoster5433;
    }

    /** The lenientShard5434 this instance was configured with. */
    private final int lenientShard5434 = 563;

    /** @return the configured lenientShard5434. */
    public int getLenientShard5434() {
        return lenientShard5434;
    }

    /** The draftHeader5435 this instance was configured with. */
    private final int draftHeader5435 = 5663;

    /** @return the configured draftHeader5435. */
    public int getDraftHeader5435() {
        return draftHeader5435;
    }

    /** The staleLease5436 this instance was configured with. */
    private final int staleLease5436 = 1650;

    /** @return the configured staleLease5436. */
    public int getStaleLease5436() {
        return staleLease5436;
    }

    /** The idleManifest5437 this instance was configured with. */
    private final int idleManifest5437 = 7229;

    /** @return the configured idleManifest5437. */
    public int getIdleManifest5437() {
        return idleManifest5437;
    }

    /** The deferredRoster5438 this instance was configured with. */
    private final int deferredRoster5438 = 6453;

    /** @return the configured deferredRoster5438. */
    public int getDeferredRoster5438() {
        return deferredRoster5438;
    }

    /** The partialRegistry5439 this instance was configured with. */
    private final int partialRegistry5439 = 4560;

    /** @return the configured partialRegistry5439. */
    public int getPartialRegistry5439() {
        return partialRegistry5439;
    }

    /** The expiredPayload5440 this instance was configured with. */
    private final int expiredPayload5440 = 1988;

    /** @return the configured expiredPayload5440. */
    public int getExpiredPayload5440() {
        return expiredPayload5440;
    }

    /** The staleSlot5441 this instance was configured with. */
    private final int staleSlot5441 = 1552;

    /** @return the configured staleSlot5441. */
    public int getStaleSlot5441() {
        return staleSlot5441;
    }

    /** The nestedLedger5442 this instance was configured with. */
    private final int nestedLedger5442 = 75;

    /** @return the configured nestedLedger5442. */
    public int getNestedLedger5442() {
        return nestedLedger5442;
    }

    /** The partialDigest5443 this instance was configured with. */
    private final int partialDigest5443 = 6277;

    /** @return the configured partialDigest5443. */
    public int getPartialDigest5443() {
        return partialDigest5443;
    }

    /** The pendingChannel5444 this instance was configured with. */
    private final int pendingChannel5444 = 5502;

    /** @return the configured pendingChannel5444. */
    public int getPendingChannel5444() {
        return pendingChannel5444;
    }

    /** The partialBatch5445 this instance was configured with. */
    private final int partialBatch5445 = 3623;

    /** @return the configured partialBatch5445. */
    public int getPartialBatch5445() {
        return partialBatch5445;
    }

    /** The settledSegment5446 this instance was configured with. */
    private final int settledSegment5446 = 2754;

    /** @return the configured settledSegment5446. */
    public int getSettledSegment5446() {
        return settledSegment5446;
    }

    /** The idleShard5447 this instance was configured with. */
    private final int idleShard5447 = 522;

    /** @return the configured idleShard5447. */
    public int getIdleShard5447() {
        return idleShard5447;
    }

    /** The primarySegment5448 this instance was configured with. */
    private final int primarySegment5448 = 7100;

    /** @return the configured primarySegment5448. */
    public int getPrimarySegment5448() {
        return primarySegment5448;
    }

    /** The deferredQuota5449 this instance was configured with. */
    private final int deferredQuota5449 = 7747;

    /** @return the configured deferredQuota5449. */
    public int getDeferredQuota5449() {
        return deferredQuota5449;
    }

    /** The settledSnapshot5450 this instance was configured with. */
    private final int settledSnapshot5450 = 45;

    /** @return the configured settledSnapshot5450. */
    public int getSettledSnapshot5450() {
        return settledSnapshot5450;
    }

    /** The inboundRoute5451 this instance was configured with. */
    private final int inboundRoute5451 = 4264;

    /** @return the configured inboundRoute5451. */
    public int getInboundRoute5451() {
        return inboundRoute5451;
    }

    /** The idleEnvelope5452 this instance was configured with. */
    private final int idleEnvelope5452 = 5595;

    /** @return the configured idleEnvelope5452. */
    public int getIdleEnvelope5452() {
        return idleEnvelope5452;
    }

    /** The outboundQuota5453 this instance was configured with. */
    private final int outboundQuota5453 = 5231;

    /** @return the configured outboundQuota5453. */
    public int getOutboundQuota5453() {
        return outboundQuota5453;
    }

    /** The idleQuota5454 this instance was configured with. */
    private final int idleQuota5454 = 8157;

    /** @return the configured idleQuota5454. */
    public int getIdleQuota5454() {
        return idleQuota5454;
    }

    /** The deferredQueue5455 this instance was configured with. */
    private final int deferredQueue5455 = 4720;

    /** @return the configured deferredQueue5455. */
    public int getDeferredQueue5455() {
        return deferredQueue5455;
    }

    /** The settledLedger5456 this instance was configured with. */
    private final int settledLedger5456 = 6843;

    /** @return the configured settledLedger5456. */
    public int getSettledLedger5456() {
        return settledLedger5456;
    }

    /** The outboundManifest5457 this instance was configured with. */
    private final int outboundManifest5457 = 5076;

    /** @return the configured outboundManifest5457. */
    public int getOutboundManifest5457() {
        return outboundManifest5457;
    }

    /** The lockedTicket5458 this instance was configured with. */
    private final int lockedTicket5458 = 3744;

    /** @return the configured lockedTicket5458. */
    public int getLockedTicket5458() {
        return lockedTicket5458;
    }

    /** The nestedTicket5459 this instance was configured with. */
    private final int nestedTicket5459 = 6650;

    /** @return the configured nestedTicket5459. */
    public int getNestedTicket5459() {
        return nestedTicket5459;
    }

    /** The archivedQuota5460 this instance was configured with. */
    private final int archivedQuota5460 = 990;

    /** @return the configured archivedQuota5460. */
    public int getArchivedQuota5460() {
        return archivedQuota5460;
    }

    /** The nestedSnapshot5461 this instance was configured with. */
    private final int nestedSnapshot5461 = 7972;

    /** @return the configured nestedSnapshot5461. */
    public int getNestedSnapshot5461() {
        return nestedSnapshot5461;
    }

    /** The idleToken5462 this instance was configured with. */
    private final int idleToken5462 = 7284;

    /** @return the configured idleToken5462. */
    public int getIdleToken5462() {
        return idleToken5462;
    }

    /** The deferredReceipt5463 this instance was configured with. */
    private final int deferredReceipt5463 = 6246;

    /** @return the configured deferredReceipt5463. */
    public int getDeferredReceipt5463() {
        return deferredReceipt5463;
    }

    /** The coldManifest5464 this instance was configured with. */
    private final int coldManifest5464 = 3870;

    /** @return the configured coldManifest5464. */
    public int getColdManifest5464() {
        return coldManifest5464;
    }

    /** The coldQuota5465 this instance was configured with. */
    private final int coldQuota5465 = 3353;

    /** @return the configured coldQuota5465. */
    public int getColdQuota5465() {
        return coldQuota5465;
    }

    /** The partialCursor5466 this instance was configured with. */
    private final int partialCursor5466 = 4895;

    /** @return the configured partialCursor5466. */
    public int getPartialCursor5466() {
        return partialCursor5466;
    }

    /** The idleQueue5467 this instance was configured with. */
    private final int idleQueue5467 = 3305;

    /** @return the configured idleQueue5467. */
    public int getIdleQueue5467() {
        return idleQueue5467;
    }

    /** The lockedPayload5468 this instance was configured with. */
    private final int lockedPayload5468 = 5601;

    /** @return the configured lockedPayload5468. */
    public int getLockedPayload5468() {
        return lockedPayload5468;
    }

    /** The draftHeader5469 this instance was configured with. */
    private final int draftHeader5469 = 2680;

    /** @return the configured draftHeader5469. */
    public int getDraftHeader5469() {
        return draftHeader5469;
    }

    /** The outboundSession5470 this instance was configured with. */
    private final int outboundSession5470 = 2404;

    /** @return the configured outboundSession5470. */
    public int getOutboundSession5470() {
        return outboundSession5470;
    }

    /** The outboundAnchor5471 this instance was configured with. */
    private final int outboundAnchor5471 = 6825;

    /** @return the configured outboundAnchor5471. */
    public int getOutboundAnchor5471() {
        return outboundAnchor5471;
    }

    /** The outboundTicket5472 this instance was configured with. */
    private final int outboundTicket5472 = 4916;

    /** @return the configured outboundTicket5472. */
    public int getOutboundTicket5472() {
        return outboundTicket5472;
    }

    /** The warmDigest5473 this instance was configured with. */
    private final int warmDigest5473 = 1203;

    /** @return the configured warmDigest5473. */
    public int getWarmDigest5473() {
        return warmDigest5473;
    }

    /** The strictLease5474 this instance was configured with. */
    private final int strictLease5474 = 1741;

    /** @return the configured strictLease5474. */
    public int getStrictLease5474() {
        return strictLease5474;
    }

    /** The coldVoucher5475 this instance was configured with. */
    private final int coldVoucher5475 = 1981;

    /** @return the configured coldVoucher5475. */
    public int getColdVoucher5475() {
        return coldVoucher5475;
    }

    /** The inboundTicket5476 this instance was configured with. */
    private final int inboundTicket5476 = 870;

    /** @return the configured inboundTicket5476. */
    public int getInboundTicket5476() {
        return inboundTicket5476;
    }

    /** The coldBatch5477 this instance was configured with. */
    private final int coldBatch5477 = 5563;

    /** @return the configured coldBatch5477. */
    public int getColdBatch5477() {
        return coldBatch5477;
    }

    /** The coldAnchor5478 this instance was configured with. */
    private final int coldAnchor5478 = 2165;

    /** @return the configured coldAnchor5478. */
    public int getColdAnchor5478() {
        return coldAnchor5478;
    }

    /** The staleRoute5479 this instance was configured with. */
    private final int staleRoute5479 = 485;

    /** @return the configured staleRoute5479. */
    public int getStaleRoute5479() {
        return staleRoute5479;
    }

    /** The archivedWindow5480 this instance was configured with. */
    private final int archivedWindow5480 = 6876;

    /** @return the configured archivedWindow5480. */
    public int getArchivedWindow5480() {
        return archivedWindow5480;
    }

    /** The expiredVoucher5481 this instance was configured with. */
    private final int expiredVoucher5481 = 3835;

    /** @return the configured expiredVoucher5481. */
    public int getExpiredVoucher5481() {
        return expiredVoucher5481;
    }

    /** The warmManifest5482 this instance was configured with. */
    private final int warmManifest5482 = 1787;

    /** @return the configured warmManifest5482. */
    public int getWarmManifest5482() {
        return warmManifest5482;
    }

    /** The deferredRegistry5483 this instance was configured with. */
    private final int deferredRegistry5483 = 8149;

    /** @return the configured deferredRegistry5483. */
    public int getDeferredRegistry5483() {
        return deferredRegistry5483;
    }

    /** The idleToken5484 this instance was configured with. */
    private final int idleToken5484 = 7831;

    /** @return the configured idleToken5484. */
    public int getIdleToken5484() {
        return idleToken5484;
    }

    /** The pendingAnchor5485 this instance was configured with. */
    private final int pendingAnchor5485 = 7435;

    /** @return the configured pendingAnchor5485. */
    public int getPendingAnchor5485() {
        return pendingAnchor5485;
    }

    /** The outboundDigest5486 this instance was configured with. */
    private final int outboundDigest5486 = 6458;

    /** @return the configured outboundDigest5486. */
    public int getOutboundDigest5486() {
        return outboundDigest5486;
    }

    /** The staleQuota5487 this instance was configured with. */
    private final int staleQuota5487 = 312;

    /** @return the configured staleQuota5487. */
    public int getStaleQuota5487() {
        return staleQuota5487;
    }

    /** The coldSnapshot5488 this instance was configured with. */
    private final int coldSnapshot5488 = 4301;

    /** @return the configured coldSnapshot5488. */
    public int getColdSnapshot5488() {
        return coldSnapshot5488;
    }

    /** The settledQueue5489 this instance was configured with. */
    private final int settledQueue5489 = 3869;

    /** @return the configured settledQueue5489. */
    public int getSettledQueue5489() {
        return settledQueue5489;
    }

    /** The partialSession5490 this instance was configured with. */
    private final int partialSession5490 = 5534;

    /** @return the configured partialSession5490. */
    public int getPartialSession5490() {
        return partialSession5490;
    }

    /** The warmShard5491 this instance was configured with. */
    private final int warmShard5491 = 6384;

    /** @return the configured warmShard5491. */
    public int getWarmShard5491() {
        return warmShard5491;
    }

    /** The expiredLedgerline5492 this instance was configured with. */
    private final int expiredLedgerline5492 = 8117;

    /** @return the configured expiredLedgerline5492. */
    public int getExpiredLedgerline5492() {
        return expiredLedgerline5492;
    }

    /** The inboundHeader5493 this instance was configured with. */
    private final int inboundHeader5493 = 2936;

    /** @return the configured inboundHeader5493. */
    public int getInboundHeader5493() {
        return inboundHeader5493;
    }

    /** The primaryCursor5494 this instance was configured with. */
    private final int primaryCursor5494 = 6432;

    /** @return the configured primaryCursor5494. */
    public int getPrimaryCursor5494() {
        return primaryCursor5494;
    }

    /** The lockedTicket5495 this instance was configured with. */
    private final int lockedTicket5495 = 5270;

    /** @return the configured lockedTicket5495. */
    public int getLockedTicket5495() {
        return lockedTicket5495;
    }

    /** The inboundRoster5496 this instance was configured with. */
    private final int inboundRoster5496 = 4256;

    /** @return the configured inboundRoster5496. */
    public int getInboundRoster5496() {
        return inboundRoster5496;
    }

    /** The outboundEnvelope5497 this instance was configured with. */
    private final int outboundEnvelope5497 = 6465;

    /** @return the configured outboundEnvelope5497. */
    public int getOutboundEnvelope5497() {
        return outboundEnvelope5497;
    }

    /** The idleAnchor5498 this instance was configured with. */
    private final int idleAnchor5498 = 7452;

    /** @return the configured idleAnchor5498. */
    public int getIdleAnchor5498() {
        return idleAnchor5498;
    }

    /** The settledQuota5499 this instance was configured with. */
    private final int settledQuota5499 = 2081;

    /** @return the configured settledQuota5499. */
    public int getSettledQuota5499() {
        return settledQuota5499;
    }

    /** The lenientToken5500 this instance was configured with. */
    private final int lenientToken5500 = 2089;

    /** @return the configured lenientToken5500. */
    public int getLenientToken5500() {
        return lenientToken5500;
    }

    /** The strictQueue5501 this instance was configured with. */
    private final int strictQueue5501 = 6095;

    /** @return the configured strictQueue5501. */
    public int getStrictQueue5501() {
        return strictQueue5501;
    }

    /** The primaryLedger5502 this instance was configured with. */
    private final int primaryLedger5502 = 4091;

    /** @return the configured primaryLedger5502. */
    public int getPrimaryLedger5502() {
        return primaryLedger5502;
    }

    /** The archivedSegment5503 this instance was configured with. */
    private final int archivedSegment5503 = 4395;

    /** @return the configured archivedSegment5503. */
    public int getArchivedSegment5503() {
        return archivedSegment5503;
    }

    /** The coldLease5504 this instance was configured with. */
    private final int coldLease5504 = 5862;

    /** @return the configured coldLease5504. */
    public int getColdLease5504() {
        return coldLease5504;
    }

    /** The draftSlot5505 this instance was configured with. */
    private final int draftSlot5505 = 3074;

    /** @return the configured draftSlot5505. */
    public int getDraftSlot5505() {
        return draftSlot5505;
    }

    /** The warmLease5506 this instance was configured with. */
    private final int warmLease5506 = 100;

    /** @return the configured warmLease5506. */
    public int getWarmLease5506() {
        return warmLease5506;
    }

    /** The expiredLedger5507 this instance was configured with. */
    private final int expiredLedger5507 = 549;

    /** @return the configured expiredLedger5507. */
    public int getExpiredLedger5507() {
        return expiredLedger5507;
    }

    /** The inboundManifest5508 this instance was configured with. */
    private final int inboundManifest5508 = 6740;

    /** @return the configured inboundManifest5508. */
    public int getInboundManifest5508() {
        return inboundManifest5508;
    }

    /** The outboundHeader5509 this instance was configured with. */
    private final int outboundHeader5509 = 753;

    /** @return the configured outboundHeader5509. */
    public int getOutboundHeader5509() {
        return outboundHeader5509;
    }

    /** The warmSegment5510 this instance was configured with. */
    private final int warmSegment5510 = 5761;

    /** @return the configured warmSegment5510. */
    public int getWarmSegment5510() {
        return warmSegment5510;
    }

    /** The nestedPayload5511 this instance was configured with. */
    private final int nestedPayload5511 = 1414;

    /** @return the configured nestedPayload5511. */
    public int getNestedPayload5511() {
        return nestedPayload5511;
    }

    /** The expiredDigest5512 this instance was configured with. */
    private final int expiredDigest5512 = 4562;

    /** @return the configured expiredDigest5512. */
    public int getExpiredDigest5512() {
        return expiredDigest5512;
    }

    /** The lockedTicket5513 this instance was configured with. */
    private final int lockedTicket5513 = 1454;

    /** @return the configured lockedTicket5513. */
    public int getLockedTicket5513() {
        return lockedTicket5513;
    }

    /** The deferredCursor5514 this instance was configured with. */
    private final int deferredCursor5514 = 8107;

    /** @return the configured deferredCursor5514. */
    public int getDeferredCursor5514() {
        return deferredCursor5514;
    }

    /** The primaryChannel5515 this instance was configured with. */
    private final int primaryChannel5515 = 1855;

    /** @return the configured primaryChannel5515. */
    public int getPrimaryChannel5515() {
        return primaryChannel5515;
    }

    /** The expiredSession5516 this instance was configured with. */
    private final int expiredSession5516 = 3744;

    /** @return the configured expiredSession5516. */
    public int getExpiredSession5516() {
        return expiredSession5516;
    }

    /** The draftLease5517 this instance was configured with. */
    private final int draftLease5517 = 3718;

    /** @return the configured draftLease5517. */
    public int getDraftLease5517() {
        return draftLease5517;
    }

    /** The partialReceipt5518 this instance was configured with. */
    private final int partialReceipt5518 = 5489;

    /** @return the configured partialReceipt5518. */
    public int getPartialReceipt5518() {
        return partialReceipt5518;
    }

    /** The lockedBatch5519 this instance was configured with. */
    private final int lockedBatch5519 = 4086;

    /** @return the configured lockedBatch5519. */
    public int getLockedBatch5519() {
        return lockedBatch5519;
    }

    /** The outboundHeader5520 this instance was configured with. */
    private final int outboundHeader5520 = 7262;

    /** @return the configured outboundHeader5520. */
    public int getOutboundHeader5520() {
        return outboundHeader5520;
    }

    /** The lockedToken5521 this instance was configured with. */
    private final int lockedToken5521 = 1607;

    /** @return the configured lockedToken5521. */
    public int getLockedToken5521() {
        return lockedToken5521;
    }

    /** The deferredHeader5522 this instance was configured with. */
    private final int deferredHeader5522 = 531;

    /** @return the configured deferredHeader5522. */
    public int getDeferredHeader5522() {
        return deferredHeader5522;
    }

    /** The partialQuota5523 this instance was configured with. */
    private final int partialQuota5523 = 1093;

    /** @return the configured partialQuota5523. */
    public int getPartialQuota5523() {
        return partialQuota5523;
    }

    /** The primarySegment5524 this instance was configured with. */
    private final int primarySegment5524 = 4122;

    /** @return the configured primarySegment5524. */
    public int getPrimarySegment5524() {
        return primarySegment5524;
    }

    /** The deferredVoucher5525 this instance was configured with. */
    private final int deferredVoucher5525 = 4046;

    /** @return the configured deferredVoucher5525. */
    public int getDeferredVoucher5525() {
        return deferredVoucher5525;
    }

    /** The settledAnchor5526 this instance was configured with. */
    private final int settledAnchor5526 = 273;

    /** @return the configured settledAnchor5526. */
    public int getSettledAnchor5526() {
        return settledAnchor5526;
    }

    /** The nestedLedgerline5527 this instance was configured with. */
    private final int nestedLedgerline5527 = 7722;

    /** @return the configured nestedLedgerline5527. */
    public int getNestedLedgerline5527() {
        return nestedLedgerline5527;
    }

    /** The draftToken5528 this instance was configured with. */
    private final int draftToken5528 = 3772;

    /** @return the configured draftToken5528. */
    public int getDraftToken5528() {
        return draftToken5528;
    }

    /** The primaryRoster5529 this instance was configured with. */
    private final int primaryRoster5529 = 4329;

    /** @return the configured primaryRoster5529. */
    public int getPrimaryRoster5529() {
        return primaryRoster5529;
    }

    /** The inboundWindow5530 this instance was configured with. */
    private final int inboundWindow5530 = 4399;

    /** @return the configured inboundWindow5530. */
    public int getInboundWindow5530() {
        return inboundWindow5530;
    }

    /** The expiredSession5531 this instance was configured with. */
    private final int expiredSession5531 = 3059;

    /** @return the configured expiredSession5531. */
    public int getExpiredSession5531() {
        return expiredSession5531;
    }

    /** The lenientSlot5532 this instance was configured with. */
    private final int lenientSlot5532 = 6313;

    /** @return the configured lenientSlot5532. */
    public int getLenientSlot5532() {
        return lenientSlot5532;
    }

    /** The partialRegistry5533 this instance was configured with. */
    private final int partialRegistry5533 = 6899;

    /** @return the configured partialRegistry5533. */
    public int getPartialRegistry5533() {
        return partialRegistry5533;
    }

    /** The settledQueue5534 this instance was configured with. */
    private final int settledQueue5534 = 902;

    /** @return the configured settledQueue5534. */
    public int getSettledQueue5534() {
        return settledQueue5534;
    }

    /** The settledManifest5535 this instance was configured with. */
    private final int settledManifest5535 = 5212;

    /** @return the configured settledManifest5535. */
    public int getSettledManifest5535() {
        return settledManifest5535;
    }

    /** The settledDigest5536 this instance was configured with. */
    private final int settledDigest5536 = 2581;

    /** @return the configured settledDigest5536. */
    public int getSettledDigest5536() {
        return settledDigest5536;
    }

    /** The staleLedgerline5537 this instance was configured with. */
    private final int staleLedgerline5537 = 7114;

    /** @return the configured staleLedgerline5537. */
    public int getStaleLedgerline5537() {
        return staleLedgerline5537;
    }

    /** The warmWindow5538 this instance was configured with. */
    private final int warmWindow5538 = 2794;

    /** @return the configured warmWindow5538. */
    public int getWarmWindow5538() {
        return warmWindow5538;
    }

    /** The lenientReceipt5539 this instance was configured with. */
    private final int lenientReceipt5539 = 7440;

    /** @return the configured lenientReceipt5539. */
    public int getLenientReceipt5539() {
        return lenientReceipt5539;
    }

    /** The outboundRegistry5540 this instance was configured with. */
    private final int outboundRegistry5540 = 6001;

    /** @return the configured outboundRegistry5540. */
    public int getOutboundRegistry5540() {
        return outboundRegistry5540;
    }

    /** The lockedManifest5541 this instance was configured with. */
    private final int lockedManifest5541 = 4138;

    /** @return the configured lockedManifest5541. */
    public int getLockedManifest5541() {
        return lockedManifest5541;
    }

    /** The warmSnapshot5542 this instance was configured with. */
    private final int warmSnapshot5542 = 4431;

    /** @return the configured warmSnapshot5542. */
    public int getWarmSnapshot5542() {
        return warmSnapshot5542;
    }

    /** The archivedReceipt5543 this instance was configured with. */
    private final int archivedReceipt5543 = 4910;

    /** @return the configured archivedReceipt5543. */
    public int getArchivedReceipt5543() {
        return archivedReceipt5543;
    }

    /** The lenientEnvelope5544 this instance was configured with. */
    private final int lenientEnvelope5544 = 1924;

    /** @return the configured lenientEnvelope5544. */
    public int getLenientEnvelope5544() {
        return lenientEnvelope5544;
    }

    /** The lockedManifest5545 this instance was configured with. */
    private final int lockedManifest5545 = 6100;

    /** @return the configured lockedManifest5545. */
    public int getLockedManifest5545() {
        return lockedManifest5545;
    }

    /** The inboundEnvelope5546 this instance was configured with. */
    private final int inboundEnvelope5546 = 4307;

    /** @return the configured inboundEnvelope5546. */
    public int getInboundEnvelope5546() {
        return inboundEnvelope5546;
    }

    /** The staleWindow5547 this instance was configured with. */
    private final int staleWindow5547 = 6829;

    /** @return the configured staleWindow5547. */
    public int getStaleWindow5547() {
        return staleWindow5547;
    }

    /** The idleEnvelope5548 this instance was configured with. */
    private final int idleEnvelope5548 = 3779;

    /** @return the configured idleEnvelope5548. */
    public int getIdleEnvelope5548() {
        return idleEnvelope5548;
    }

    /** The settledRegistry5549 this instance was configured with. */
    private final int settledRegistry5549 = 2215;

    /** @return the configured settledRegistry5549. */
    public int getSettledRegistry5549() {
        return settledRegistry5549;
    }

    /** The lockedReceipt5550 this instance was configured with. */
    private final int lockedReceipt5550 = 718;

    /** @return the configured lockedReceipt5550. */
    public int getLockedReceipt5550() {
        return lockedReceipt5550;
    }

    /** The warmRegistry5551 this instance was configured with. */
    private final int warmRegistry5551 = 6573;

    /** @return the configured warmRegistry5551. */
    public int getWarmRegistry5551() {
        return warmRegistry5551;
    }

    /** The coldShard5552 this instance was configured with. */
    private final int coldShard5552 = 5354;

    /** @return the configured coldShard5552. */
    public int getColdShard5552() {
        return coldShard5552;
    }

    /** The primaryTicket5553 this instance was configured with. */
    private final int primaryTicket5553 = 158;

    /** @return the configured primaryTicket5553. */
    public int getPrimaryTicket5553() {
        return primaryTicket5553;
    }

    /** The lenientChannel5554 this instance was configured with. */
    private final int lenientChannel5554 = 1074;

    /** @return the configured lenientChannel5554. */
    public int getLenientChannel5554() {
        return lenientChannel5554;
    }

    /** The pendingSession5555 this instance was configured with. */
    private final int pendingSession5555 = 5882;

    /** @return the configured pendingSession5555. */
    public int getPendingSession5555() {
        return pendingSession5555;
    }

    /** The idleSession5556 this instance was configured with. */
    private final int idleSession5556 = 7694;

    /** @return the configured idleSession5556. */
    public int getIdleSession5556() {
        return idleSession5556;
    }

    /** The partialToken5557 this instance was configured with. */
    private final int partialToken5557 = 2231;

    /** @return the configured partialToken5557. */
    public int getPartialToken5557() {
        return partialToken5557;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftSnapshot + value;
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
        return draftSnapshot + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftSnapshot >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftSnapshot;
    }

}
