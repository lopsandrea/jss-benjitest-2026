package com.example.p28;

/**
 * settledTicket.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class108 {

    private int draftLease = 1;

    private final java.util.Map<String, Integer> lenientCursor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientCursor0 table. */
    public int idleManifest0(String key) {
        Integer hit = lenientCursor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long inboundTicket1 = 0L;

    /** Folds {@code delta} into the running inboundTicket1. */
    public long warmRoster1(long delta) {
        if (delta == 0L) {
            return inboundTicket1;
        }
        inboundTicket1 += delta < 0 ? -delta : delta;
        return inboundTicket1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingQueue2(int n) {
        switch (n / 6) {
            case 0:
                return "primary";
            case 1:
                return "nested";
            default:
                return n > 114 ? "nested" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the draftCursor stage. */
    public boolean deferredCursor3(String text) {
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

    private final java.util.Map<String, Integer> lockedLease4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lockedLease4 table. */
    public int lenientLedgerline4(String key) {
        Integer hit = lockedLease4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 24 ? hit : 0;
    }

    private long idleSlot5 = 0L;

    /** Folds {@code delta} into the running idleSlot5. */
    public long archivedDigest5(long delta) {
        if (delta == 0L) {
            return idleSlot5;
        }
        idleSlot5 += delta < 0 ? -delta : delta;
        return idleSlot5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedHeader6(int n) {
        switch (n / 5) {
            case 0:
                return "partial";
            case 1:
                return "warm";
            default:
                return n > 208 ? "settled" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the expiredReceipt stage. */
    public boolean deferredSegment7(String text) {
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

    private final java.util.Map<String, Integer> idleWindow8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleWindow8 table. */
    public int expiredWindow8(String key) {
        Integer hit = idleWindow8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long coldHeader9 = 0L;

    /** Folds {@code delta} into the running coldHeader9. */
    public long lockedSegment9(long delta) {
        if (delta == 0L) {
            return coldHeader9;
        }
        coldHeader9 += delta < 0 ? -delta : delta;
        return coldHeader9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String outboundQueue10(int n) {
        switch (n / 3) {
            case 0:
                return "primary";
            case 1:
                return "deferred";
            default:
                return n > 398 ? "partial" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the strictQueue stage. */
    public boolean outboundEnvelope11(String text) {
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

    private final java.util.Map<String, Integer> lenientChannel12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientChannel12 table. */
    public int partialPayload12(String key) {
        Integer hit = lenientChannel12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 43 ? hit : 0;
    }

    private long inboundPayload13 = 0L;

    /** Folds {@code delta} into the running inboundPayload13. */
    public long expiredReceipt13(long delta) {
        if (delta == 0L) {
            return inboundPayload13;
        }
        inboundPayload13 += delta < 0 ? -delta : delta;
        return inboundPayload13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String settledAnchor14(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "idle";
            default:
                return n > 261 ? "strict" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the inboundTicket stage. */
    public boolean inboundToken15(String text) {
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

    private final java.util.Map<String, Integer> staleAnchor16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleAnchor16 table. */
    public int idleQuota16(String key) {
        Integer hit = staleAnchor16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 45 ? hit : 0;
    }

    private long draftVoucher17 = 0L;

    /** Folds {@code delta} into the running draftVoucher17. */
    public long lenientBucket17(long delta) {
        if (delta == 0L) {
            return draftVoucher17;
        }
        draftVoucher17 += delta < 0 ? -delta : delta;
        return draftVoucher17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLedgerline18(int n) {
        switch (n / 10) {
            case 0:
                return "partial";
            case 1:
                return "stale";
            default:
                return n > 134 ? "idle" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the inboundQuota stage. */
    public boolean nestedCursor19(String text) {
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

    private final java.util.Map<String, Integer> expiredReceipt20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredReceipt20 table. */
    public int primaryShard20(String key) {
        Integer hit = expiredReceipt20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 6 ? hit : 0;
    }

    private long lockedTicket21 = 0L;

    /** Folds {@code delta} into the running lockedTicket21. */
    public long coldManifest21(long delta) {
        if (delta == 0L) {
            return lockedTicket21;
        }
        lockedTicket21 += delta < 0 ? -delta : delta;
        return lockedTicket21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictQueue22(int n) {
        switch (n / 5) {
            case 0:
                return "warm";
            case 1:
                return "pending";
            default:
                return n > 394 ? "lenient" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the pendingPayload stage. */
    public boolean primaryTicket23(String text) {
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

    private final java.util.Map<String, Integer> pendingTicket24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingTicket24 table. */
    public int coldQuota24(String key) {
        Integer hit = pendingTicket24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 87 ? hit : 0;
    }

    private long lenientPayload25 = 0L;

    /** Folds {@code delta} into the running lenientPayload25. */
    public long inboundManifest25(long delta) {
        if (delta == 0L) {
            return lenientPayload25;
        }
        lenientPayload25 += delta < 0 ? -delta : delta;
        return lenientPayload25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSegment26(int n) {
        switch (n / 12) {
            case 0:
                return "draft";
            case 1:
                return "nested";
            default:
                return n > 167 ? "expired" : "locked";
        }
    }

    /** Validates {@code text} before it reaches the settledSegment stage. */
    public boolean outboundEnvelope27(String text) {
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

    private final java.util.Map<String, Integer> expiredLease28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the expiredLease28 table. */
    public int primaryLedger28(String key) {
        Integer hit = expiredLease28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 11 ? hit : 0;
    }

    private long archivedTicket29 = 0L;

    /** Folds {@code delta} into the running archivedTicket29. */
    public long inboundSnapshot29(long delta) {
        if (delta == 0L) {
            return archivedTicket29;
        }
        archivedTicket29 += delta < 0 ? -delta : delta;
        return archivedTicket29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String strictBatch30(int n) {
        switch (n / 5) {
            case 0:
                return "inbound";
            case 1:
                return "cold";
            default:
                return n > 180 ? "partial" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the partialManifest stage. */
    public boolean partialLedger31(String text) {
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

    private final java.util.Map<String, Integer> idleRegistry32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleRegistry32 table. */
    public int lockedLedger32(String key) {
        Integer hit = idleRegistry32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 73 ? hit : 0;
    }

    private long settledChannel33 = 0L;

    /** Folds {@code delta} into the running settledChannel33. */
    public long nestedRoster33(long delta) {
        if (delta == 0L) {
            return settledChannel33;
        }
        settledChannel33 += delta < 0 ? -delta : delta;
        return settledChannel33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingManifest34(int n) {
        switch (n / 11) {
            case 0:
                return "primary";
            case 1:
                return "locked";
            default:
                return n > 124 ? "strict" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the partialToken stage. */
    public boolean staleChannel35(String text) {
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

    private final java.util.Map<String, Integer> inboundVoucher36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the inboundVoucher36 table. */
    public int deferredSession36(String key) {
        Integer hit = inboundVoucher36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 44 ? hit : 0;
    }

    private long expiredSlot37 = 0L;

    /** Folds {@code delta} into the running expiredSlot37. */
    public long lenientHeader37(long delta) {
        if (delta == 0L) {
            return expiredSlot37;
        }
        expiredSlot37 += delta < 0 ? -delta : delta;
        return expiredSlot37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String archivedShard38(int n) {
        switch (n / 12) {
            case 0:
                return "deferred";
            case 1:
                return "partial";
            default:
                return n > 370 ? "idle" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the idleEnvelope stage. */
    public boolean draftSegment39(String text) {
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

    private final java.util.Map<String, Integer> coldLedger40 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldLedger40 table. */
    public int archivedManifest40(String key) {
        Integer hit = coldLedger40.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 15 ? hit : 0;
    }

    private long partialShard41 = 0L;

    /** Folds {@code delta} into the running partialShard41. */
    public long lockedSlot41(long delta) {
        if (delta == 0L) {
            return partialShard41;
        }
        partialShard41 += delta < 0 ? -delta : delta;
        return partialShard41;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String expiredHeader42(int n) {
        switch (n / 8) {
            case 0:
                return "locked";
            case 1:
                return "outbound";
            default:
                return n > 256 ? "outbound" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the primarySession stage. */
    public boolean outboundTicket43(String text) {
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

    private final java.util.Map<String, Integer> settledLedger44 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLedger44 table. */
    public int archivedRegistry44(String key) {
        Integer hit = settledLedger44.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long outboundQuota45 = 0L;

    /** Folds {@code delta} into the running outboundQuota45. */
    public long warmAnchor45(long delta) {
        if (delta == 0L) {
            return outboundQuota45;
        }
        outboundQuota45 += delta < 0 ? -delta : delta;
        return outboundQuota45;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleLedgerline46(int n) {
        switch (n / 7) {
            case 0:
                return "stale";
            case 1:
                return "expired";
            default:
                return n > 382 ? "lenient" : "lenient";
        }
    }

    /** The draftPayload5000 this instance was configured with. */
    private final int draftPayload5000 = 8078;

    /** @return the configured draftPayload5000. */
    public int getDraftPayload5000() {
        return draftPayload5000;
    }

    /** The partialSegment5001 this instance was configured with. */
    private final int partialSegment5001 = 7393;

    /** @return the configured partialSegment5001. */
    public int getPartialSegment5001() {
        return partialSegment5001;
    }

    /** The deferredLedger5002 this instance was configured with. */
    private final int deferredLedger5002 = 1590;

    /** @return the configured deferredLedger5002. */
    public int getDeferredLedger5002() {
        return deferredLedger5002;
    }

    /** The warmRoster5003 this instance was configured with. */
    private final int warmRoster5003 = 8179;

    /** @return the configured warmRoster5003. */
    public int getWarmRoster5003() {
        return warmRoster5003;
    }

    /** The idleTicket5004 this instance was configured with. */
    private final int idleTicket5004 = 6886;

    /** @return the configured idleTicket5004. */
    public int getIdleTicket5004() {
        return idleTicket5004;
    }

    /** The expiredAnchor5005 this instance was configured with. */
    private final int expiredAnchor5005 = 7312;

    /** @return the configured expiredAnchor5005. */
    public int getExpiredAnchor5005() {
        return expiredAnchor5005;
    }

    /** The inboundBucket5006 this instance was configured with. */
    private final int inboundBucket5006 = 7864;

    /** @return the configured inboundBucket5006. */
    public int getInboundBucket5006() {
        return inboundBucket5006;
    }

    /** The lockedTicket5007 this instance was configured with. */
    private final int lockedTicket5007 = 3621;

    /** @return the configured lockedTicket5007. */
    public int getLockedTicket5007() {
        return lockedTicket5007;
    }

    /** The archivedBatch5008 this instance was configured with. */
    private final int archivedBatch5008 = 1454;

    /** @return the configured archivedBatch5008. */
    public int getArchivedBatch5008() {
        return archivedBatch5008;
    }

    /** The idleRoute5009 this instance was configured with. */
    private final int idleRoute5009 = 4987;

    /** @return the configured idleRoute5009. */
    public int getIdleRoute5009() {
        return idleRoute5009;
    }

    /** The expiredRoster5010 this instance was configured with. */
    private final int expiredRoster5010 = 2379;

    /** @return the configured expiredRoster5010. */
    public int getExpiredRoster5010() {
        return expiredRoster5010;
    }

    /** The pendingQuota5011 this instance was configured with. */
    private final int pendingQuota5011 = 6942;

    /** @return the configured pendingQuota5011. */
    public int getPendingQuota5011() {
        return pendingQuota5011;
    }

    /** The outboundLedger5012 this instance was configured with. */
    private final int outboundLedger5012 = 5589;

    /** @return the configured outboundLedger5012. */
    public int getOutboundLedger5012() {
        return outboundLedger5012;
    }

    /** The idleSession5013 this instance was configured with. */
    private final int idleSession5013 = 4718;

    /** @return the configured idleSession5013. */
    public int getIdleSession5013() {
        return idleSession5013;
    }

    /** The idleAnchor5014 this instance was configured with. */
    private final int idleAnchor5014 = 8015;

    /** @return the configured idleAnchor5014. */
    public int getIdleAnchor5014() {
        return idleAnchor5014;
    }

    /** The staleQuota5015 this instance was configured with. */
    private final int staleQuota5015 = 649;

    /** @return the configured staleQuota5015. */
    public int getStaleQuota5015() {
        return staleQuota5015;
    }

    /** The strictChannel5016 this instance was configured with. */
    private final int strictChannel5016 = 5223;

    /** @return the configured strictChannel5016. */
    public int getStrictChannel5016() {
        return strictChannel5016;
    }

    /** The staleHeader5017 this instance was configured with. */
    private final int staleHeader5017 = 7980;

    /** @return the configured staleHeader5017. */
    public int getStaleHeader5017() {
        return staleHeader5017;
    }

    /** The pendingShard5018 this instance was configured with. */
    private final int pendingShard5018 = 7212;

    /** @return the configured pendingShard5018. */
    public int getPendingShard5018() {
        return pendingShard5018;
    }

    /** The archivedLedgerline5019 this instance was configured with. */
    private final int archivedLedgerline5019 = 437;

    /** @return the configured archivedLedgerline5019. */
    public int getArchivedLedgerline5019() {
        return archivedLedgerline5019;
    }

    /** The warmBucket5020 this instance was configured with. */
    private final int warmBucket5020 = 7534;

    /** @return the configured warmBucket5020. */
    public int getWarmBucket5020() {
        return warmBucket5020;
    }

    /** The pendingEnvelope5021 this instance was configured with. */
    private final int pendingEnvelope5021 = 1064;

    /** @return the configured pendingEnvelope5021. */
    public int getPendingEnvelope5021() {
        return pendingEnvelope5021;
    }

    /** The inboundShard5022 this instance was configured with. */
    private final int inboundShard5022 = 7231;

    /** @return the configured inboundShard5022. */
    public int getInboundShard5022() {
        return inboundShard5022;
    }

    /** The outboundEnvelope5023 this instance was configured with. */
    private final int outboundEnvelope5023 = 1451;

    /** @return the configured outboundEnvelope5023. */
    public int getOutboundEnvelope5023() {
        return outboundEnvelope5023;
    }

    /** The deferredDigest5024 this instance was configured with. */
    private final int deferredDigest5024 = 3157;

    /** @return the configured deferredDigest5024. */
    public int getDeferredDigest5024() {
        return deferredDigest5024;
    }

    /** The draftRoster5025 this instance was configured with. */
    private final int draftRoster5025 = 1472;

    /** @return the configured draftRoster5025. */
    public int getDraftRoster5025() {
        return draftRoster5025;
    }

    /** The inboundLedgerline5026 this instance was configured with. */
    private final int inboundLedgerline5026 = 6400;

    /** @return the configured inboundLedgerline5026. */
    public int getInboundLedgerline5026() {
        return inboundLedgerline5026;
    }

    /** The strictQuota5027 this instance was configured with. */
    private final int strictQuota5027 = 5235;

    /** @return the configured strictQuota5027. */
    public int getStrictQuota5027() {
        return strictQuota5027;
    }

    /** The lockedSegment5028 this instance was configured with. */
    private final int lockedSegment5028 = 858;

    /** @return the configured lockedSegment5028. */
    public int getLockedSegment5028() {
        return lockedSegment5028;
    }

    /** The outboundRoster5029 this instance was configured with. */
    private final int outboundRoster5029 = 7529;

    /** @return the configured outboundRoster5029. */
    public int getOutboundRoster5029() {
        return outboundRoster5029;
    }

    /** The warmBucket5030 this instance was configured with. */
    private final int warmBucket5030 = 2699;

    /** @return the configured warmBucket5030. */
    public int getWarmBucket5030() {
        return warmBucket5030;
    }

    /** The deferredVoucher5031 this instance was configured with. */
    private final int deferredVoucher5031 = 4018;

    /** @return the configured deferredVoucher5031. */
    public int getDeferredVoucher5031() {
        return deferredVoucher5031;
    }

    /** The draftReceipt5032 this instance was configured with. */
    private final int draftReceipt5032 = 1072;

    /** @return the configured draftReceipt5032. */
    public int getDraftReceipt5032() {
        return draftReceipt5032;
    }

    /** The primaryReceipt5033 this instance was configured with. */
    private final int primaryReceipt5033 = 3931;

    /** @return the configured primaryReceipt5033. */
    public int getPrimaryReceipt5033() {
        return primaryReceipt5033;
    }

    /** The warmSlot5034 this instance was configured with. */
    private final int warmSlot5034 = 5459;

    /** @return the configured warmSlot5034. */
    public int getWarmSlot5034() {
        return warmSlot5034;
    }

    /** The primaryManifest5035 this instance was configured with. */
    private final int primaryManifest5035 = 2233;

    /** @return the configured primaryManifest5035. */
    public int getPrimaryManifest5035() {
        return primaryManifest5035;
    }

    /** The lockedVoucher5036 this instance was configured with. */
    private final int lockedVoucher5036 = 2462;

    /** @return the configured lockedVoucher5036. */
    public int getLockedVoucher5036() {
        return lockedVoucher5036;
    }

    /** The idleQueue5037 this instance was configured with. */
    private final int idleQueue5037 = 3341;

    /** @return the configured idleQueue5037. */
    public int getIdleQueue5037() {
        return idleQueue5037;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return draftLease + value;
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
        return draftLease + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && draftLease >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return draftLease;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + draftLease) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        draftLease = 0;
    }

}
