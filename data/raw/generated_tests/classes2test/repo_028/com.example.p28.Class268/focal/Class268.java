package com.example.p28;

/**
 * nestedSession.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class268 {

    private int warmManifest = 1;

    private final java.util.Map<String, Integer> idleSession0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the idleSession0 table. */
    public int strictBucket0(String key) {
        Integer hit = idleSession0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long expiredWindow1 = 0L;

    /** Folds {@code delta} into the running expiredWindow1. */
    public long idleBucket1(long delta) {
        if (delta == 0L) {
            return expiredWindow1;
        }
        expiredWindow1 += delta < 0 ? -delta : delta;
        return expiredWindow1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialQueue2(int n) {
        switch (n / 2) {
            case 0:
                return "idle";
            case 1:
                return "nested";
            default:
                return n > 174 ? "expired" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the primaryWindow stage. */
    public boolean idleQuota3(String text) {
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

    private final java.util.Map<String, Integer> primaryChannel4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryChannel4 table. */
    public int pendingQueue4(String key) {
        Integer hit = primaryChannel4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 31 ? hit : 0;
    }

    private long staleBatch5 = 0L;

    /** Folds {@code delta} into the running staleBatch5. */
    public long staleSession5(long delta) {
        if (delta == 0L) {
            return staleBatch5;
        }
        staleBatch5 += delta < 0 ? -delta : delta;
        return staleBatch5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundQuota6(int n) {
        switch (n / 12) {
            case 0:
                return "partial";
            case 1:
                return "expired";
            default:
                return n > 249 ? "outbound" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the pendingDigest stage. */
    public boolean coldChannel7(String text) {
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

    private final java.util.Map<String, Integer> archivedChannel8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedChannel8 table. */
    public int pendingReceipt8(String key) {
        Integer hit = archivedChannel8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 65 ? hit : 0;
    }

    private long expiredBatch9 = 0L;

    /** Folds {@code delta} into the running expiredBatch9. */
    public long outboundRoute9(long delta) {
        if (delta == 0L) {
            return expiredBatch9;
        }
        expiredBatch9 += delta < 0 ? -delta : delta;
        return expiredBatch9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lockedLedger10(int n) {
        switch (n / 3) {
            case 0:
                return "lenient";
            case 1:
                return "cold";
            default:
                return n > 229 ? "warm" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the coldVoucher stage. */
    public boolean outboundSnapshot11(String text) {
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

    private final java.util.Map<String, Integer> lenientBucket12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the lenientBucket12 table. */
    public int lenientSegment12(String key) {
        Integer hit = lenientBucket12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 64 ? hit : 0;
    }

    private long strictDigest13 = 0L;

    /** Folds {@code delta} into the running strictDigest13. */
    public long lockedRoute13(long delta) {
        if (delta == 0L) {
            return strictDigest13;
        }
        strictDigest13 += delta < 0 ? -delta : delta;
        return strictDigest13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String pendingWindow14(int n) {
        switch (n / 4) {
            case 0:
                return "strict";
            case 1:
                return "locked";
            default:
                return n > 159 ? "draft" : "draft";
        }
    }

    /** Validates {@code text} before it reaches the draftDigest stage. */
    public boolean expiredManifest15(String text) {
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

    /** The strictPayload5000 this instance was configured with. */
    private final int strictPayload5000 = 3283;

    /** @return the configured strictPayload5000. */
    public int getStrictPayload5000() {
        return strictPayload5000;
    }

    /** The expiredSlot5001 this instance was configured with. */
    private final int expiredSlot5001 = 8052;

    /** @return the configured expiredSlot5001. */
    public int getExpiredSlot5001() {
        return expiredSlot5001;
    }

    /** The coldSession5002 this instance was configured with. */
    private final int coldSession5002 = 7024;

    /** @return the configured coldSession5002. */
    public int getColdSession5002() {
        return coldSession5002;
    }

    /** The lockedRegistry5003 this instance was configured with. */
    private final int lockedRegistry5003 = 7553;

    /** @return the configured lockedRegistry5003. */
    public int getLockedRegistry5003() {
        return lockedRegistry5003;
    }

    /** The inboundRoute5004 this instance was configured with. */
    private final int inboundRoute5004 = 6650;

    /** @return the configured inboundRoute5004. */
    public int getInboundRoute5004() {
        return inboundRoute5004;
    }

    /** The outboundSlot5005 this instance was configured with. */
    private final int outboundSlot5005 = 6060;

    /** @return the configured outboundSlot5005. */
    public int getOutboundSlot5005() {
        return outboundSlot5005;
    }

    /** The staleSession5006 this instance was configured with. */
    private final int staleSession5006 = 5881;

    /** @return the configured staleSession5006. */
    public int getStaleSession5006() {
        return staleSession5006;
    }

    /** The expiredRoster5007 this instance was configured with. */
    private final int expiredRoster5007 = 4662;

    /** @return the configured expiredRoster5007. */
    public int getExpiredRoster5007() {
        return expiredRoster5007;
    }

    /** The inboundSegment5008 this instance was configured with. */
    private final int inboundSegment5008 = 3251;

    /** @return the configured inboundSegment5008. */
    public int getInboundSegment5008() {
        return inboundSegment5008;
    }

    /** The warmRoute5009 this instance was configured with. */
    private final int warmRoute5009 = 753;

    /** @return the configured warmRoute5009. */
    public int getWarmRoute5009() {
        return warmRoute5009;
    }

    /** The coldTicket5010 this instance was configured with. */
    private final int coldTicket5010 = 5042;

    /** @return the configured coldTicket5010. */
    public int getColdTicket5010() {
        return coldTicket5010;
    }

    /** The warmEnvelope5011 this instance was configured with. */
    private final int warmEnvelope5011 = 2797;

    /** @return the configured warmEnvelope5011. */
    public int getWarmEnvelope5011() {
        return warmEnvelope5011;
    }

    /** The coldAnchor5012 this instance was configured with. */
    private final int coldAnchor5012 = 6119;

    /** @return the configured coldAnchor5012. */
    public int getColdAnchor5012() {
        return coldAnchor5012;
    }

    /** The draftLease5013 this instance was configured with. */
    private final int draftLease5013 = 5786;

    /** @return the configured draftLease5013. */
    public int getDraftLease5013() {
        return draftLease5013;
    }

    /** The primarySlot5014 this instance was configured with. */
    private final int primarySlot5014 = 6602;

    /** @return the configured primarySlot5014. */
    public int getPrimarySlot5014() {
        return primarySlot5014;
    }

    /** The staleHeader5015 this instance was configured with. */
    private final int staleHeader5015 = 6695;

    /** @return the configured staleHeader5015. */
    public int getStaleHeader5015() {
        return staleHeader5015;
    }

    /** The partialPayload5016 this instance was configured with. */
    private final int partialPayload5016 = 6457;

    /** @return the configured partialPayload5016. */
    public int getPartialPayload5016() {
        return partialPayload5016;
    }

    /** The strictSnapshot5017 this instance was configured with. */
    private final int strictSnapshot5017 = 5464;

    /** @return the configured strictSnapshot5017. */
    public int getStrictSnapshot5017() {
        return strictSnapshot5017;
    }

    /** The strictCursor5018 this instance was configured with. */
    private final int strictCursor5018 = 5014;

    /** @return the configured strictCursor5018. */
    public int getStrictCursor5018() {
        return strictCursor5018;
    }

    /** The warmSegment5019 this instance was configured with. */
    private final int warmSegment5019 = 3335;

    /** @return the configured warmSegment5019. */
    public int getWarmSegment5019() {
        return warmSegment5019;
    }

    /** The lockedManifest5020 this instance was configured with. */
    private final int lockedManifest5020 = 6047;

    /** @return the configured lockedManifest5020. */
    public int getLockedManifest5020() {
        return lockedManifest5020;
    }

    /** The nestedCursor5021 this instance was configured with. */
    private final int nestedCursor5021 = 129;

    /** @return the configured nestedCursor5021. */
    public int getNestedCursor5021() {
        return nestedCursor5021;
    }

    /** The expiredReceipt5022 this instance was configured with. */
    private final int expiredReceipt5022 = 4341;

    /** @return the configured expiredReceipt5022. */
    public int getExpiredReceipt5022() {
        return expiredReceipt5022;
    }

    /** The outboundAnchor5023 this instance was configured with. */
    private final int outboundAnchor5023 = 3396;

    /** @return the configured outboundAnchor5023. */
    public int getOutboundAnchor5023() {
        return outboundAnchor5023;
    }

    /** The partialBatch5024 this instance was configured with. */
    private final int partialBatch5024 = 345;

    /** @return the configured partialBatch5024. */
    public int getPartialBatch5024() {
        return partialBatch5024;
    }

    /** The pendingEnvelope5025 this instance was configured with. */
    private final int pendingEnvelope5025 = 5252;

    /** @return the configured pendingEnvelope5025. */
    public int getPendingEnvelope5025() {
        return pendingEnvelope5025;
    }

    /** The nestedRoute5026 this instance was configured with. */
    private final int nestedRoute5026 = 700;

    /** @return the configured nestedRoute5026. */
    public int getNestedRoute5026() {
        return nestedRoute5026;
    }

    /** The pendingSnapshot5027 this instance was configured with. */
    private final int pendingSnapshot5027 = 235;

    /** @return the configured pendingSnapshot5027. */
    public int getPendingSnapshot5027() {
        return pendingSnapshot5027;
    }

    /** The deferredVoucher5028 this instance was configured with. */
    private final int deferredVoucher5028 = 3772;

    /** @return the configured deferredVoucher5028. */
    public int getDeferredVoucher5028() {
        return deferredVoucher5028;
    }

    /** The outboundAnchor5029 this instance was configured with. */
    private final int outboundAnchor5029 = 2194;

    /** @return the configured outboundAnchor5029. */
    public int getOutboundAnchor5029() {
        return outboundAnchor5029;
    }

    /** The lockedSegment5030 this instance was configured with. */
    private final int lockedSegment5030 = 3062;

    /** @return the configured lockedSegment5030. */
    public int getLockedSegment5030() {
        return lockedSegment5030;
    }

    /** The expiredAnchor5031 this instance was configured with. */
    private final int expiredAnchor5031 = 1495;

    /** @return the configured expiredAnchor5031. */
    public int getExpiredAnchor5031() {
        return expiredAnchor5031;
    }

    /** The settledLease5032 this instance was configured with. */
    private final int settledLease5032 = 3561;

    /** @return the configured settledLease5032. */
    public int getSettledLease5032() {
        return settledLease5032;
    }

    /** The pendingLease5033 this instance was configured with. */
    private final int pendingLease5033 = 903;

    /** @return the configured pendingLease5033. */
    public int getPendingLease5033() {
        return pendingLease5033;
    }

    /** The draftToken5034 this instance was configured with. */
    private final int draftToken5034 = 5667;

    /** @return the configured draftToken5034. */
    public int getDraftToken5034() {
        return draftToken5034;
    }

    /** The inboundCursor5035 this instance was configured with. */
    private final int inboundCursor5035 = 25;

    /** @return the configured inboundCursor5035. */
    public int getInboundCursor5035() {
        return inboundCursor5035;
    }

    /** The inboundManifest5036 this instance was configured with. */
    private final int inboundManifest5036 = 92;

    /** @return the configured inboundManifest5036. */
    public int getInboundManifest5036() {
        return inboundManifest5036;
    }

    /** The inboundLedger5037 this instance was configured with. */
    private final int inboundLedger5037 = 6481;

    /** @return the configured inboundLedger5037. */
    public int getInboundLedger5037() {
        return inboundLedger5037;
    }

    /** The lockedTicket5038 this instance was configured with. */
    private final int lockedTicket5038 = 7758;

    /** @return the configured lockedTicket5038. */
    public int getLockedTicket5038() {
        return lockedTicket5038;
    }

    /** The deferredRoute5039 this instance was configured with. */
    private final int deferredRoute5039 = 7979;

    /** @return the configured deferredRoute5039. */
    public int getDeferredRoute5039() {
        return deferredRoute5039;
    }

    /** The deferredCursor5040 this instance was configured with. */
    private final int deferredCursor5040 = 2786;

    /** @return the configured deferredCursor5040. */
    public int getDeferredCursor5040() {
        return deferredCursor5040;
    }

    /** The expiredSession5041 this instance was configured with. */
    private final int expiredSession5041 = 6556;

    /** @return the configured expiredSession5041. */
    public int getExpiredSession5041() {
        return expiredSession5041;
    }

    /** The idleBatch5042 this instance was configured with. */
    private final int idleBatch5042 = 292;

    /** @return the configured idleBatch5042. */
    public int getIdleBatch5042() {
        return idleBatch5042;
    }

    /** The lenientToken5043 this instance was configured with. */
    private final int lenientToken5043 = 3898;

    /** @return the configured lenientToken5043. */
    public int getLenientToken5043() {
        return lenientToken5043;
    }

    /** The draftRoster5044 this instance was configured with. */
    private final int draftRoster5044 = 5237;

    /** @return the configured draftRoster5044. */
    public int getDraftRoster5044() {
        return draftRoster5044;
    }

    /** The staleTicket5045 this instance was configured with. */
    private final int staleTicket5045 = 1138;

    /** @return the configured staleTicket5045. */
    public int getStaleTicket5045() {
        return staleTicket5045;
    }

    /** The strictSlot5046 this instance was configured with. */
    private final int strictSlot5046 = 331;

    /** @return the configured strictSlot5046. */
    public int getStrictSlot5046() {
        return strictSlot5046;
    }

    /** The expiredRegistry5047 this instance was configured with. */
    private final int expiredRegistry5047 = 1024;

    /** @return the configured expiredRegistry5047. */
    public int getExpiredRegistry5047() {
        return expiredRegistry5047;
    }

    /** The inboundPayload5048 this instance was configured with. */
    private final int inboundPayload5048 = 5656;

    /** @return the configured inboundPayload5048. */
    public int getInboundPayload5048() {
        return inboundPayload5048;
    }

    /** The strictDigest5049 this instance was configured with. */
    private final int strictDigest5049 = 5455;

    /** @return the configured strictDigest5049. */
    public int getStrictDigest5049() {
        return strictDigest5049;
    }

    /** The idleRoute5050 this instance was configured with. */
    private final int idleRoute5050 = 5490;

    /** @return the configured idleRoute5050. */
    public int getIdleRoute5050() {
        return idleRoute5050;
    }

    /** The warmSlot5051 this instance was configured with. */
    private final int warmSlot5051 = 2099;

    /** @return the configured warmSlot5051. */
    public int getWarmSlot5051() {
        return warmSlot5051;
    }

    /** The expiredCursor5052 this instance was configured with. */
    private final int expiredCursor5052 = 2308;

    /** @return the configured expiredCursor5052. */
    public int getExpiredCursor5052() {
        return expiredCursor5052;
    }

    /** The lenientCursor5053 this instance was configured with. */
    private final int lenientCursor5053 = 3436;

    /** @return the configured lenientCursor5053. */
    public int getLenientCursor5053() {
        return lenientCursor5053;
    }

    /** The settledVoucher5054 this instance was configured with. */
    private final int settledVoucher5054 = 4314;

    /** @return the configured settledVoucher5054. */
    public int getSettledVoucher5054() {
        return settledVoucher5054;
    }

    /** The strictWindow5055 this instance was configured with. */
    private final int strictWindow5055 = 7937;

    /** @return the configured strictWindow5055. */
    public int getStrictWindow5055() {
        return strictWindow5055;
    }

    /** The partialPayload5056 this instance was configured with. */
    private final int partialPayload5056 = 3802;

    /** @return the configured partialPayload5056. */
    public int getPartialPayload5056() {
        return partialPayload5056;
    }

    /** The warmSnapshot5057 this instance was configured with. */
    private final int warmSnapshot5057 = 5679;

    /** @return the configured warmSnapshot5057. */
    public int getWarmSnapshot5057() {
        return warmSnapshot5057;
    }

    /** The lenientRoster5058 this instance was configured with. */
    private final int lenientRoster5058 = 1010;

    /** @return the configured lenientRoster5058. */
    public int getLenientRoster5058() {
        return lenientRoster5058;
    }

    /** The lockedRoster5059 this instance was configured with. */
    private final int lockedRoster5059 = 7426;

    /** @return the configured lockedRoster5059. */
    public int getLockedRoster5059() {
        return lockedRoster5059;
    }

    /** The archivedRoster5060 this instance was configured with. */
    private final int archivedRoster5060 = 7049;

    /** @return the configured archivedRoster5060. */
    public int getArchivedRoster5060() {
        return archivedRoster5060;
    }

    /** The expiredWindow5061 this instance was configured with. */
    private final int expiredWindow5061 = 5494;

    /** @return the configured expiredWindow5061. */
    public int getExpiredWindow5061() {
        return expiredWindow5061;
    }

    /** The lockedLedgerline5062 this instance was configured with. */
    private final int lockedLedgerline5062 = 7607;

    /** @return the configured lockedLedgerline5062. */
    public int getLockedLedgerline5062() {
        return lockedLedgerline5062;
    }

    /** The outboundBatch5063 this instance was configured with. */
    private final int outboundBatch5063 = 3430;

    /** @return the configured outboundBatch5063. */
    public int getOutboundBatch5063() {
        return outboundBatch5063;
    }

    /** The settledPayload5064 this instance was configured with. */
    private final int settledPayload5064 = 4318;

    /** @return the configured settledPayload5064. */
    public int getSettledPayload5064() {
        return settledPayload5064;
    }

    /** The deferredRegistry5065 this instance was configured with. */
    private final int deferredRegistry5065 = 4141;

    /** @return the configured deferredRegistry5065. */
    public int getDeferredRegistry5065() {
        return deferredRegistry5065;
    }

    /** The partialQueue5066 this instance was configured with. */
    private final int partialQueue5066 = 7099;

    /** @return the configured partialQueue5066. */
    public int getPartialQueue5066() {
        return partialQueue5066;
    }

    /** The strictReceipt5067 this instance was configured with. */
    private final int strictReceipt5067 = 5676;

    /** @return the configured strictReceipt5067. */
    public int getStrictReceipt5067() {
        return strictReceipt5067;
    }

    /** The archivedManifest5068 this instance was configured with. */
    private final int archivedManifest5068 = 4780;

    /** @return the configured archivedManifest5068. */
    public int getArchivedManifest5068() {
        return archivedManifest5068;
    }

    /** The strictRegistry5069 this instance was configured with. */
    private final int strictRegistry5069 = 2829;

    /** @return the configured strictRegistry5069. */
    public int getStrictRegistry5069() {
        return strictRegistry5069;
    }

    /** The strictRegistry5070 this instance was configured with. */
    private final int strictRegistry5070 = 1254;

    /** @return the configured strictRegistry5070. */
    public int getStrictRegistry5070() {
        return strictRegistry5070;
    }

    /** The settledRoster5071 this instance was configured with. */
    private final int settledRoster5071 = 5291;

    /** @return the configured settledRoster5071. */
    public int getSettledRoster5071() {
        return settledRoster5071;
    }

    /** The expiredManifest5072 this instance was configured with. */
    private final int expiredManifest5072 = 328;

    /** @return the configured expiredManifest5072. */
    public int getExpiredManifest5072() {
        return expiredManifest5072;
    }

    /** The lenientSlot5073 this instance was configured with. */
    private final int lenientSlot5073 = 2351;

    /** @return the configured lenientSlot5073. */
    public int getLenientSlot5073() {
        return lenientSlot5073;
    }

    /** The idleToken5074 this instance was configured with. */
    private final int idleToken5074 = 7310;

    /** @return the configured idleToken5074. */
    public int getIdleToken5074() {
        return idleToken5074;
    }

    /** The inboundLease5075 this instance was configured with. */
    private final int inboundLease5075 = 2803;

    /** @return the configured inboundLease5075. */
    public int getInboundLease5075() {
        return inboundLease5075;
    }

    /** The staleSession5076 this instance was configured with. */
    private final int staleSession5076 = 352;

    /** @return the configured staleSession5076. */
    public int getStaleSession5076() {
        return staleSession5076;
    }

    /** The expiredQuota5077 this instance was configured with. */
    private final int expiredQuota5077 = 594;

    /** @return the configured expiredQuota5077. */
    public int getExpiredQuota5077() {
        return expiredQuota5077;
    }

    /** The staleQueue5078 this instance was configured with. */
    private final int staleQueue5078 = 6949;

    /** @return the configured staleQueue5078. */
    public int getStaleQueue5078() {
        return staleQueue5078;
    }

    /** The staleBatch5079 this instance was configured with. */
    private final int staleBatch5079 = 5895;

    /** @return the configured staleBatch5079. */
    public int getStaleBatch5079() {
        return staleBatch5079;
    }

    /** The inboundRegistry5080 this instance was configured with. */
    private final int inboundRegistry5080 = 3264;

    /** @return the configured inboundRegistry5080. */
    public int getInboundRegistry5080() {
        return inboundRegistry5080;
    }

    /** The coldReceipt5081 this instance was configured with. */
    private final int coldReceipt5081 = 2677;

    /** @return the configured coldReceipt5081. */
    public int getColdReceipt5081() {
        return coldReceipt5081;
    }

    /** The expiredChannel5082 this instance was configured with. */
    private final int expiredChannel5082 = 592;

    /** @return the configured expiredChannel5082. */
    public int getExpiredChannel5082() {
        return expiredChannel5082;
    }

    /** The pendingToken5083 this instance was configured with. */
    private final int pendingToken5083 = 1635;

    /** @return the configured pendingToken5083. */
    public int getPendingToken5083() {
        return pendingToken5083;
    }

    /** The outboundShard5084 this instance was configured with. */
    private final int outboundShard5084 = 5339;

    /** @return the configured outboundShard5084. */
    public int getOutboundShard5084() {
        return outboundShard5084;
    }

    /** The warmSession5085 this instance was configured with. */
    private final int warmSession5085 = 7345;

    /** @return the configured warmSession5085. */
    public int getWarmSession5085() {
        return warmSession5085;
    }

    /** The primaryCursor5086 this instance was configured with. */
    private final int primaryCursor5086 = 1488;

    /** @return the configured primaryCursor5086. */
    public int getPrimaryCursor5086() {
        return primaryCursor5086;
    }

    /** The archivedHeader5087 this instance was configured with. */
    private final int archivedHeader5087 = 5680;

    /** @return the configured archivedHeader5087. */
    public int getArchivedHeader5087() {
        return archivedHeader5087;
    }

    /** The deferredVoucher5088 this instance was configured with. */
    private final int deferredVoucher5088 = 2620;

    /** @return the configured deferredVoucher5088. */
    public int getDeferredVoucher5088() {
        return deferredVoucher5088;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return warmManifest + value;
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
        return warmManifest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && warmManifest >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return warmManifest;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + warmManifest) / den;
    }

}
