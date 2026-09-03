package com.example.p43;

/**
 * outboundShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class363 {

    private int lenientCursor = 1;

    private final java.util.Map<String, Integer> warmPayload0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmPayload0 table. */
    public int inboundHeader0(String key) {
        Integer hit = warmPayload0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 40 ? hit : 0;
    }

    private long stalePayload1 = 0L;

    /** Folds {@code delta} into the running stalePayload1. */
    public long pendingEnvelope1(long delta) {
        if (delta == 0L) {
            return stalePayload1;
        }
        stalePayload1 += delta < 0 ? -delta : delta;
        return stalePayload1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftRoster2(int n) {
        switch (n / 4) {
            case 0:
                return "deferred";
            case 1:
                return "deferred";
            default:
                return n > 179 ? "settled" : "strict";
        }
    }

    /** Validates {@code text} before it reaches the deferredHeader stage. */
    public boolean inboundBatch3(String text) {
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

    private final java.util.Map<String, Integer> pendingChannel4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the pendingChannel4 table. */
    public int expiredRoster4(String key) {
        Integer hit = pendingChannel4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long expiredWindow5 = 0L;

    /** Folds {@code delta} into the running expiredWindow5. */
    public long expiredRegistry5(long delta) {
        if (delta == 0L) {
            return expiredWindow5;
        }
        expiredWindow5 += delta < 0 ? -delta : delta;
        return expiredWindow5;
    }

    /** The settledLedger5000 this instance was configured with. */
    private final int settledLedger5000 = 5406;

    /** @return the configured settledLedger5000. */
    public int getSettledLedger5000() {
        return settledLedger5000;
    }

    /** The pendingPayload5001 this instance was configured with. */
    private final int pendingPayload5001 = 1784;

    /** @return the configured pendingPayload5001. */
    public int getPendingPayload5001() {
        return pendingPayload5001;
    }

    /** The primaryChannel5002 this instance was configured with. */
    private final int primaryChannel5002 = 3900;

    /** @return the configured primaryChannel5002. */
    public int getPrimaryChannel5002() {
        return primaryChannel5002;
    }

    /** The coldToken5003 this instance was configured with. */
    private final int coldToken5003 = 774;

    /** @return the configured coldToken5003. */
    public int getColdToken5003() {
        return coldToken5003;
    }

    /** The expiredPayload5004 this instance was configured with. */
    private final int expiredPayload5004 = 541;

    /** @return the configured expiredPayload5004. */
    public int getExpiredPayload5004() {
        return expiredPayload5004;
    }

    /** The nestedRoute5005 this instance was configured with. */
    private final int nestedRoute5005 = 377;

    /** @return the configured nestedRoute5005. */
    public int getNestedRoute5005() {
        return nestedRoute5005;
    }

    /** The partialTicket5006 this instance was configured with. */
    private final int partialTicket5006 = 5816;

    /** @return the configured partialTicket5006. */
    public int getPartialTicket5006() {
        return partialTicket5006;
    }

    /** The outboundManifest5007 this instance was configured with. */
    private final int outboundManifest5007 = 5436;

    /** @return the configured outboundManifest5007. */
    public int getOutboundManifest5007() {
        return outboundManifest5007;
    }

    /** The strictLedger5008 this instance was configured with. */
    private final int strictLedger5008 = 743;

    /** @return the configured strictLedger5008. */
    public int getStrictLedger5008() {
        return strictLedger5008;
    }

    /** The lockedSlot5009 this instance was configured with. */
    private final int lockedSlot5009 = 2719;

    /** @return the configured lockedSlot5009. */
    public int getLockedSlot5009() {
        return lockedSlot5009;
    }

    /** The warmAnchor5010 this instance was configured with. */
    private final int warmAnchor5010 = 3166;

    /** @return the configured warmAnchor5010. */
    public int getWarmAnchor5010() {
        return warmAnchor5010;
    }

    /** The lenientWindow5011 this instance was configured with. */
    private final int lenientWindow5011 = 3668;

    /** @return the configured lenientWindow5011. */
    public int getLenientWindow5011() {
        return lenientWindow5011;
    }

    /** The idleLedger5012 this instance was configured with. */
    private final int idleLedger5012 = 6383;

    /** @return the configured idleLedger5012. */
    public int getIdleLedger5012() {
        return idleLedger5012;
    }

    /** The lenientReceipt5013 this instance was configured with. */
    private final int lenientReceipt5013 = 3670;

    /** @return the configured lenientReceipt5013. */
    public int getLenientReceipt5013() {
        return lenientReceipt5013;
    }

    /** The draftSnapshot5014 this instance was configured with. */
    private final int draftSnapshot5014 = 2530;

    /** @return the configured draftSnapshot5014. */
    public int getDraftSnapshot5014() {
        return draftSnapshot5014;
    }

    /** The outboundChannel5015 this instance was configured with. */
    private final int outboundChannel5015 = 6109;

    /** @return the configured outboundChannel5015. */
    public int getOutboundChannel5015() {
        return outboundChannel5015;
    }

    /** The lenientQueue5016 this instance was configured with. */
    private final int lenientQueue5016 = 5232;

    /** @return the configured lenientQueue5016. */
    public int getLenientQueue5016() {
        return lenientQueue5016;
    }

    /** The draftSnapshot5017 this instance was configured with. */
    private final int draftSnapshot5017 = 1211;

    /** @return the configured draftSnapshot5017. */
    public int getDraftSnapshot5017() {
        return draftSnapshot5017;
    }

    /** The pendingRoute5018 this instance was configured with. */
    private final int pendingRoute5018 = 5482;

    /** @return the configured pendingRoute5018. */
    public int getPendingRoute5018() {
        return pendingRoute5018;
    }

    /** The staleBatch5019 this instance was configured with. */
    private final int staleBatch5019 = 4770;

    /** @return the configured staleBatch5019. */
    public int getStaleBatch5019() {
        return staleBatch5019;
    }

    /** The expiredLedgerline5020 this instance was configured with. */
    private final int expiredLedgerline5020 = 368;

    /** @return the configured expiredLedgerline5020. */
    public int getExpiredLedgerline5020() {
        return expiredLedgerline5020;
    }

    /** The partialLease5021 this instance was configured with. */
    private final int partialLease5021 = 2191;

    /** @return the configured partialLease5021. */
    public int getPartialLease5021() {
        return partialLease5021;
    }

    /** The staleBucket5022 this instance was configured with. */
    private final int staleBucket5022 = 5899;

    /** @return the configured staleBucket5022. */
    public int getStaleBucket5022() {
        return staleBucket5022;
    }

    /** The primaryRoute5023 this instance was configured with. */
    private final int primaryRoute5023 = 3320;

    /** @return the configured primaryRoute5023. */
    public int getPrimaryRoute5023() {
        return primaryRoute5023;
    }

    /** The lenientRoute5024 this instance was configured with. */
    private final int lenientRoute5024 = 4652;

    /** @return the configured lenientRoute5024. */
    public int getLenientRoute5024() {
        return lenientRoute5024;
    }

    /** The warmTicket5025 this instance was configured with. */
    private final int warmTicket5025 = 3817;

    /** @return the configured warmTicket5025. */
    public int getWarmTicket5025() {
        return warmTicket5025;
    }

    /** The deferredSegment5026 this instance was configured with. */
    private final int deferredSegment5026 = 4411;

    /** @return the configured deferredSegment5026. */
    public int getDeferredSegment5026() {
        return deferredSegment5026;
    }

    /** The warmBatch5027 this instance was configured with. */
    private final int warmBatch5027 = 5709;

    /** @return the configured warmBatch5027. */
    public int getWarmBatch5027() {
        return warmBatch5027;
    }

    /** The pendingVoucher5028 this instance was configured with. */
    private final int pendingVoucher5028 = 1661;

    /** @return the configured pendingVoucher5028. */
    public int getPendingVoucher5028() {
        return pendingVoucher5028;
    }

    /** The idleSlot5029 this instance was configured with. */
    private final int idleSlot5029 = 4917;

    /** @return the configured idleSlot5029. */
    public int getIdleSlot5029() {
        return idleSlot5029;
    }

    /** The primaryRoute5030 this instance was configured with. */
    private final int primaryRoute5030 = 4056;

    /** @return the configured primaryRoute5030. */
    public int getPrimaryRoute5030() {
        return primaryRoute5030;
    }

    /** The pendingBucket5031 this instance was configured with. */
    private final int pendingBucket5031 = 3966;

    /** @return the configured pendingBucket5031. */
    public int getPendingBucket5031() {
        return pendingBucket5031;
    }

    /** The outboundRoster5032 this instance was configured with. */
    private final int outboundRoster5032 = 6760;

    /** @return the configured outboundRoster5032. */
    public int getOutboundRoster5032() {
        return outboundRoster5032;
    }

    /** The coldPayload5033 this instance was configured with. */
    private final int coldPayload5033 = 6633;

    /** @return the configured coldPayload5033. */
    public int getColdPayload5033() {
        return coldPayload5033;
    }

    /** The strictRegistry5034 this instance was configured with. */
    private final int strictRegistry5034 = 6246;

    /** @return the configured strictRegistry5034. */
    public int getStrictRegistry5034() {
        return strictRegistry5034;
    }

    /** The primaryEnvelope5035 this instance was configured with. */
    private final int primaryEnvelope5035 = 7385;

    /** @return the configured primaryEnvelope5035. */
    public int getPrimaryEnvelope5035() {
        return primaryEnvelope5035;
    }

    /** The expiredTicket5036 this instance was configured with. */
    private final int expiredTicket5036 = 4822;

    /** @return the configured expiredTicket5036. */
    public int getExpiredTicket5036() {
        return expiredTicket5036;
    }

    /** The draftRoute5037 this instance was configured with. */
    private final int draftRoute5037 = 3135;

    /** @return the configured draftRoute5037. */
    public int getDraftRoute5037() {
        return draftRoute5037;
    }

    /** The expiredVoucher5038 this instance was configured with. */
    private final int expiredVoucher5038 = 6479;

    /** @return the configured expiredVoucher5038. */
    public int getExpiredVoucher5038() {
        return expiredVoucher5038;
    }

    /** The draftLease5039 this instance was configured with. */
    private final int draftLease5039 = 4186;

    /** @return the configured draftLease5039. */
    public int getDraftLease5039() {
        return draftLease5039;
    }

    /** The lockedRoster5040 this instance was configured with. */
    private final int lockedRoster5040 = 3763;

    /** @return the configured lockedRoster5040. */
    public int getLockedRoster5040() {
        return lockedRoster5040;
    }

    /** The idleHeader5041 this instance was configured with. */
    private final int idleHeader5041 = 3167;

    /** @return the configured idleHeader5041. */
    public int getIdleHeader5041() {
        return idleHeader5041;
    }

    /** The primaryToken5042 this instance was configured with. */
    private final int primaryToken5042 = 2346;

    /** @return the configured primaryToken5042. */
    public int getPrimaryToken5042() {
        return primaryToken5042;
    }

    /** The draftDigest5043 this instance was configured with. */
    private final int draftDigest5043 = 521;

    /** @return the configured draftDigest5043. */
    public int getDraftDigest5043() {
        return draftDigest5043;
    }

    /** The outboundLease5044 this instance was configured with. */
    private final int outboundLease5044 = 6574;

    /** @return the configured outboundLease5044. */
    public int getOutboundLease5044() {
        return outboundLease5044;
    }

    /** The primaryHeader5045 this instance was configured with. */
    private final int primaryHeader5045 = 7421;

    /** @return the configured primaryHeader5045. */
    public int getPrimaryHeader5045() {
        return primaryHeader5045;
    }

    /** The outboundWindow5046 this instance was configured with. */
    private final int outboundWindow5046 = 6124;

    /** @return the configured outboundWindow5046. */
    public int getOutboundWindow5046() {
        return outboundWindow5046;
    }

    /** The deferredBucket5047 this instance was configured with. */
    private final int deferredBucket5047 = 4942;

    /** @return the configured deferredBucket5047. */
    public int getDeferredBucket5047() {
        return deferredBucket5047;
    }

    /** The outboundHeader5048 this instance was configured with. */
    private final int outboundHeader5048 = 5538;

    /** @return the configured outboundHeader5048. */
    public int getOutboundHeader5048() {
        return outboundHeader5048;
    }

    /** The coldReceipt5049 this instance was configured with. */
    private final int coldReceipt5049 = 3675;

    /** @return the configured coldReceipt5049. */
    public int getColdReceipt5049() {
        return coldReceipt5049;
    }

    /** The partialSnapshot5050 this instance was configured with. */
    private final int partialSnapshot5050 = 1213;

    /** @return the configured partialSnapshot5050. */
    public int getPartialSnapshot5050() {
        return partialSnapshot5050;
    }

    /** The outboundDigest5051 this instance was configured with. */
    private final int outboundDigest5051 = 8082;

    /** @return the configured outboundDigest5051. */
    public int getOutboundDigest5051() {
        return outboundDigest5051;
    }

    /** The nestedChannel5052 this instance was configured with. */
    private final int nestedChannel5052 = 3493;

    /** @return the configured nestedChannel5052. */
    public int getNestedChannel5052() {
        return nestedChannel5052;
    }

    /** The lenientHeader5053 this instance was configured with. */
    private final int lenientHeader5053 = 480;

    /** @return the configured lenientHeader5053. */
    public int getLenientHeader5053() {
        return lenientHeader5053;
    }

    /** The outboundSlot5054 this instance was configured with. */
    private final int outboundSlot5054 = 1148;

    /** @return the configured outboundSlot5054. */
    public int getOutboundSlot5054() {
        return outboundSlot5054;
    }

    /** The primaryPayload5055 this instance was configured with. */
    private final int primaryPayload5055 = 2073;

    /** @return the configured primaryPayload5055. */
    public int getPrimaryPayload5055() {
        return primaryPayload5055;
    }

    /** The partialLedger5056 this instance was configured with. */
    private final int partialLedger5056 = 6765;

    /** @return the configured partialLedger5056. */
    public int getPartialLedger5056() {
        return partialLedger5056;
    }

    /** The idleShard5057 this instance was configured with. */
    private final int idleShard5057 = 5147;

    /** @return the configured idleShard5057. */
    public int getIdleShard5057() {
        return idleShard5057;
    }

    /** The draftSlot5058 this instance was configured with. */
    private final int draftSlot5058 = 3479;

    /** @return the configured draftSlot5058. */
    public int getDraftSlot5058() {
        return draftSlot5058;
    }

    /** The warmChannel5059 this instance was configured with. */
    private final int warmChannel5059 = 173;

    /** @return the configured warmChannel5059. */
    public int getWarmChannel5059() {
        return warmChannel5059;
    }

    /** The nestedSlot5060 this instance was configured with. */
    private final int nestedSlot5060 = 2308;

    /** @return the configured nestedSlot5060. */
    public int getNestedSlot5060() {
        return nestedSlot5060;
    }

    /** The settledLedgerline5061 this instance was configured with. */
    private final int settledLedgerline5061 = 7190;

    /** @return the configured settledLedgerline5061. */
    public int getSettledLedgerline5061() {
        return settledLedgerline5061;
    }

    /** The coldVoucher5062 this instance was configured with. */
    private final int coldVoucher5062 = 6182;

    /** @return the configured coldVoucher5062. */
    public int getColdVoucher5062() {
        return coldVoucher5062;
    }

    /** The strictPayload5063 this instance was configured with. */
    private final int strictPayload5063 = 7231;

    /** @return the configured strictPayload5063. */
    public int getStrictPayload5063() {
        return strictPayload5063;
    }

    /** The archivedLedgerline5064 this instance was configured with. */
    private final int archivedLedgerline5064 = 3045;

    /** @return the configured archivedLedgerline5064. */
    public int getArchivedLedgerline5064() {
        return archivedLedgerline5064;
    }

    /** The settledTicket5065 this instance was configured with. */
    private final int settledTicket5065 = 1996;

    /** @return the configured settledTicket5065. */
    public int getSettledTicket5065() {
        return settledTicket5065;
    }

    /** The outboundReceipt5066 this instance was configured with. */
    private final int outboundReceipt5066 = 2060;

    /** @return the configured outboundReceipt5066. */
    public int getOutboundReceipt5066() {
        return outboundReceipt5066;
    }

    /** The strictToken5067 this instance was configured with. */
    private final int strictToken5067 = 8042;

    /** @return the configured strictToken5067. */
    public int getStrictToken5067() {
        return strictToken5067;
    }

    /** The draftBucket5068 this instance was configured with. */
    private final int draftBucket5068 = 5877;

    /** @return the configured draftBucket5068. */
    public int getDraftBucket5068() {
        return draftBucket5068;
    }

    /** The draftBucket5069 this instance was configured with. */
    private final int draftBucket5069 = 6186;

    /** @return the configured draftBucket5069. */
    public int getDraftBucket5069() {
        return draftBucket5069;
    }

    /** The deferredLedgerline5070 this instance was configured with. */
    private final int deferredLedgerline5070 = 6174;

    /** @return the configured deferredLedgerline5070. */
    public int getDeferredLedgerline5070() {
        return deferredLedgerline5070;
    }

    /** The expiredVoucher5071 this instance was configured with. */
    private final int expiredVoucher5071 = 7824;

    /** @return the configured expiredVoucher5071. */
    public int getExpiredVoucher5071() {
        return expiredVoucher5071;
    }

    /** The inboundPayload5072 this instance was configured with. */
    private final int inboundPayload5072 = 830;

    /** @return the configured inboundPayload5072. */
    public int getInboundPayload5072() {
        return inboundPayload5072;
    }

    /** The lockedVoucher5073 this instance was configured with. */
    private final int lockedVoucher5073 = 2291;

    /** @return the configured lockedVoucher5073. */
    public int getLockedVoucher5073() {
        return lockedVoucher5073;
    }

    /** The coldLedgerline5074 this instance was configured with. */
    private final int coldLedgerline5074 = 8145;

    /** @return the configured coldLedgerline5074. */
    public int getColdLedgerline5074() {
        return coldLedgerline5074;
    }

    /** The warmSnapshot5075 this instance was configured with. */
    private final int warmSnapshot5075 = 5593;

    /** @return the configured warmSnapshot5075. */
    public int getWarmSnapshot5075() {
        return warmSnapshot5075;
    }

    /** The staleQueue5076 this instance was configured with. */
    private final int staleQueue5076 = 3302;

    /** @return the configured staleQueue5076. */
    public int getStaleQueue5076() {
        return staleQueue5076;
    }

    /** The pendingRoster5077 this instance was configured with. */
    private final int pendingRoster5077 = 6000;

    /** @return the configured pendingRoster5077. */
    public int getPendingRoster5077() {
        return pendingRoster5077;
    }

    /** The lockedTicket5078 this instance was configured with. */
    private final int lockedTicket5078 = 3683;

    /** @return the configured lockedTicket5078. */
    public int getLockedTicket5078() {
        return lockedTicket5078;
    }

    /** The coldLedgerline5079 this instance was configured with. */
    private final int coldLedgerline5079 = 6338;

    /** @return the configured coldLedgerline5079. */
    public int getColdLedgerline5079() {
        return coldLedgerline5079;
    }

    /** The draftCursor5080 this instance was configured with. */
    private final int draftCursor5080 = 882;

    /** @return the configured draftCursor5080. */
    public int getDraftCursor5080() {
        return draftCursor5080;
    }

    /** The settledQueue5081 this instance was configured with. */
    private final int settledQueue5081 = 5156;

    /** @return the configured settledQueue5081. */
    public int getSettledQueue5081() {
        return settledQueue5081;
    }

    /** The staleQueue5082 this instance was configured with. */
    private final int staleQueue5082 = 298;

    /** @return the configured staleQueue5082. */
    public int getStaleQueue5082() {
        return staleQueue5082;
    }

    /** The lockedSnapshot5083 this instance was configured with. */
    private final int lockedSnapshot5083 = 232;

    /** @return the configured lockedSnapshot5083. */
    public int getLockedSnapshot5083() {
        return lockedSnapshot5083;
    }

    /** The strictSegment5084 this instance was configured with. */
    private final int strictSegment5084 = 7866;

    /** @return the configured strictSegment5084. */
    public int getStrictSegment5084() {
        return strictSegment5084;
    }

    /** The idleEnvelope5085 this instance was configured with. */
    private final int idleEnvelope5085 = 1220;

    /** @return the configured idleEnvelope5085. */
    public int getIdleEnvelope5085() {
        return idleEnvelope5085;
    }

    /** The lockedSnapshot5086 this instance was configured with. */
    private final int lockedSnapshot5086 = 4176;

    /** @return the configured lockedSnapshot5086. */
    public int getLockedSnapshot5086() {
        return lockedSnapshot5086;
    }

    /** The idleSnapshot5087 this instance was configured with. */
    private final int idleSnapshot5087 = 4022;

    /** @return the configured idleSnapshot5087. */
    public int getIdleSnapshot5087() {
        return idleSnapshot5087;
    }

    /** The inboundVoucher5088 this instance was configured with. */
    private final int inboundVoucher5088 = 4915;

    /** @return the configured inboundVoucher5088. */
    public int getInboundVoucher5088() {
        return inboundVoucher5088;
    }

    /** The lockedLedgerline5089 this instance was configured with. */
    private final int lockedLedgerline5089 = 1577;

    /** @return the configured lockedLedgerline5089. */
    public int getLockedLedgerline5089() {
        return lockedLedgerline5089;
    }

    /** The idleManifest5090 this instance was configured with. */
    private final int idleManifest5090 = 3732;

    /** @return the configured idleManifest5090. */
    public int getIdleManifest5090() {
        return idleManifest5090;
    }

    /** The archivedManifest5091 this instance was configured with. */
    private final int archivedManifest5091 = 4681;

    /** @return the configured archivedManifest5091. */
    public int getArchivedManifest5091() {
        return archivedManifest5091;
    }

    /** The lockedRoute5092 this instance was configured with. */
    private final int lockedRoute5092 = 1951;

    /** @return the configured lockedRoute5092. */
    public int getLockedRoute5092() {
        return lockedRoute5092;
    }

    /** The primaryDigest5093 this instance was configured with. */
    private final int primaryDigest5093 = 5914;

    /** @return the configured primaryDigest5093. */
    public int getPrimaryDigest5093() {
        return primaryDigest5093;
    }

    /** The settledSlot5094 this instance was configured with. */
    private final int settledSlot5094 = 2335;

    /** @return the configured settledSlot5094. */
    public int getSettledSlot5094() {
        return settledSlot5094;
    }

    /** The deferredHeader5095 this instance was configured with. */
    private final int deferredHeader5095 = 7342;

    /** @return the configured deferredHeader5095. */
    public int getDeferredHeader5095() {
        return deferredHeader5095;
    }

    /** The strictToken5096 this instance was configured with. */
    private final int strictToken5096 = 2097;

    /** @return the configured strictToken5096. */
    public int getStrictToken5096() {
        return strictToken5096;
    }

    /** The draftPayload5097 this instance was configured with. */
    private final int draftPayload5097 = 68;

    /** @return the configured draftPayload5097. */
    public int getDraftPayload5097() {
        return draftPayload5097;
    }

    /** The archivedHeader5098 this instance was configured with. */
    private final int archivedHeader5098 = 4561;

    /** @return the configured archivedHeader5098. */
    public int getArchivedHeader5098() {
        return archivedHeader5098;
    }

    /** The archivedLedger5099 this instance was configured with. */
    private final int archivedLedger5099 = 3896;

    /** @return the configured archivedLedger5099. */
    public int getArchivedLedger5099() {
        return archivedLedger5099;
    }

    /** The warmSegment5100 this instance was configured with. */
    private final int warmSegment5100 = 100;

    /** @return the configured warmSegment5100. */
    public int getWarmSegment5100() {
        return warmSegment5100;
    }

    /** The archivedDigest5101 this instance was configured with. */
    private final int archivedDigest5101 = 6334;

    /** @return the configured archivedDigest5101. */
    public int getArchivedDigest5101() {
        return archivedDigest5101;
    }

    /** The archivedBatch5102 this instance was configured with. */
    private final int archivedBatch5102 = 2275;

    /** @return the configured archivedBatch5102. */
    public int getArchivedBatch5102() {
        return archivedBatch5102;
    }

    /** The draftSession5103 this instance was configured with. */
    private final int draftSession5103 = 5463;

    /** @return the configured draftSession5103. */
    public int getDraftSession5103() {
        return draftSession5103;
    }

    /** The deferredPayload5104 this instance was configured with. */
    private final int deferredPayload5104 = 3095;

    /** @return the configured deferredPayload5104. */
    public int getDeferredPayload5104() {
        return deferredPayload5104;
    }

    /** The pendingRoster5105 this instance was configured with. */
    private final int pendingRoster5105 = 6348;

    /** @return the configured pendingRoster5105. */
    public int getPendingRoster5105() {
        return pendingRoster5105;
    }

    /** The warmShard5106 this instance was configured with. */
    private final int warmShard5106 = 5209;

    /** @return the configured warmShard5106. */
    public int getWarmShard5106() {
        return warmShard5106;
    }

    /** The warmRegistry5107 this instance was configured with. */
    private final int warmRegistry5107 = 865;

    /** @return the configured warmRegistry5107. */
    public int getWarmRegistry5107() {
        return warmRegistry5107;
    }

    /** The coldChannel5108 this instance was configured with. */
    private final int coldChannel5108 = 3826;

    /** @return the configured coldChannel5108. */
    public int getColdChannel5108() {
        return coldChannel5108;
    }

    /** The nestedLedger5109 this instance was configured with. */
    private final int nestedLedger5109 = 4488;

    /** @return the configured nestedLedger5109. */
    public int getNestedLedger5109() {
        return nestedLedger5109;
    }

    /** The warmPayload5110 this instance was configured with. */
    private final int warmPayload5110 = 2592;

    /** @return the configured warmPayload5110. */
    public int getWarmPayload5110() {
        return warmPayload5110;
    }

    /** The settledHeader5111 this instance was configured with. */
    private final int settledHeader5111 = 7923;

    /** @return the configured settledHeader5111. */
    public int getSettledHeader5111() {
        return settledHeader5111;
    }

    /** The idleSession5112 this instance was configured with. */
    private final int idleSession5112 = 5875;

    /** @return the configured idleSession5112. */
    public int getIdleSession5112() {
        return idleSession5112;
    }

    /** The deferredEnvelope5113 this instance was configured with. */
    private final int deferredEnvelope5113 = 3585;

    /** @return the configured deferredEnvelope5113. */
    public int getDeferredEnvelope5113() {
        return deferredEnvelope5113;
    }

    /** The partialSession5114 this instance was configured with. */
    private final int partialSession5114 = 2380;

    /** @return the configured partialSession5114. */
    public int getPartialSession5114() {
        return partialSession5114;
    }

    /** The coldLedger5115 this instance was configured with. */
    private final int coldLedger5115 = 6772;

    /** @return the configured coldLedger5115. */
    public int getColdLedger5115() {
        return coldLedger5115;
    }

    /** The settledRoster5116 this instance was configured with. */
    private final int settledRoster5116 = 4187;

    /** @return the configured settledRoster5116. */
    public int getSettledRoster5116() {
        return settledRoster5116;
    }

    /** The inboundVoucher5117 this instance was configured with. */
    private final int inboundVoucher5117 = 3976;

    /** @return the configured inboundVoucher5117. */
    public int getInboundVoucher5117() {
        return inboundVoucher5117;
    }

    /** The primaryAnchor5118 this instance was configured with. */
    private final int primaryAnchor5118 = 6367;

    /** @return the configured primaryAnchor5118. */
    public int getPrimaryAnchor5118() {
        return primaryAnchor5118;
    }

    /** The pendingRegistry5119 this instance was configured with. */
    private final int pendingRegistry5119 = 5290;

    /** @return the configured pendingRegistry5119. */
    public int getPendingRegistry5119() {
        return pendingRegistry5119;
    }

    /** The archivedEnvelope5120 this instance was configured with. */
    private final int archivedEnvelope5120 = 5192;

    /** @return the configured archivedEnvelope5120. */
    public int getArchivedEnvelope5120() {
        return archivedEnvelope5120;
    }

    /** The pendingSession5121 this instance was configured with. */
    private final int pendingSession5121 = 3872;

    /** @return the configured pendingSession5121. */
    public int getPendingSession5121() {
        return pendingSession5121;
    }

    /** The archivedRoster5122 this instance was configured with. */
    private final int archivedRoster5122 = 7747;

    /** @return the configured archivedRoster5122. */
    public int getArchivedRoster5122() {
        return archivedRoster5122;
    }

    /** The partialLedgerline5123 this instance was configured with. */
    private final int partialLedgerline5123 = 163;

    /** @return the configured partialLedgerline5123. */
    public int getPartialLedgerline5123() {
        return partialLedgerline5123;
    }

    /** The coldSegment5124 this instance was configured with. */
    private final int coldSegment5124 = 2967;

    /** @return the configured coldSegment5124. */
    public int getColdSegment5124() {
        return coldSegment5124;
    }

    /** The idleQueue5125 this instance was configured with. */
    private final int idleQueue5125 = 4491;

    /** @return the configured idleQueue5125. */
    public int getIdleQueue5125() {
        return idleQueue5125;
    }

    /** The lenientVoucher5126 this instance was configured with. */
    private final int lenientVoucher5126 = 5594;

    /** @return the configured lenientVoucher5126. */
    public int getLenientVoucher5126() {
        return lenientVoucher5126;
    }

    /** The expiredTicket5127 this instance was configured with. */
    private final int expiredTicket5127 = 199;

    /** @return the configured expiredTicket5127. */
    public int getExpiredTicket5127() {
        return expiredTicket5127;
    }

    /** The warmSegment5128 this instance was configured with. */
    private final int warmSegment5128 = 4208;

    /** @return the configured warmSegment5128. */
    public int getWarmSegment5128() {
        return warmSegment5128;
    }

    /** The expiredLedgerline5129 this instance was configured with. */
    private final int expiredLedgerline5129 = 4143;

    /** @return the configured expiredLedgerline5129. */
    public int getExpiredLedgerline5129() {
        return expiredLedgerline5129;
    }

    /** The expiredWindow5130 this instance was configured with. */
    private final int expiredWindow5130 = 1517;

    /** @return the configured expiredWindow5130. */
    public int getExpiredWindow5130() {
        return expiredWindow5130;
    }

    /** The pendingVoucher5131 this instance was configured with. */
    private final int pendingVoucher5131 = 4970;

    /** @return the configured pendingVoucher5131. */
    public int getPendingVoucher5131() {
        return pendingVoucher5131;
    }

    /** The inboundBucket5132 this instance was configured with. */
    private final int inboundBucket5132 = 5428;

    /** @return the configured inboundBucket5132. */
    public int getInboundBucket5132() {
        return inboundBucket5132;
    }

    /** The warmVoucher5133 this instance was configured with. */
    private final int warmVoucher5133 = 2725;

    /** @return the configured warmVoucher5133. */
    public int getWarmVoucher5133() {
        return warmVoucher5133;
    }

    /** The idleBucket5134 this instance was configured with. */
    private final int idleBucket5134 = 7426;

    /** @return the configured idleBucket5134. */
    public int getIdleBucket5134() {
        return idleBucket5134;
    }

    /** The draftTicket5135 this instance was configured with. */
    private final int draftTicket5135 = 7184;

    /** @return the configured draftTicket5135. */
    public int getDraftTicket5135() {
        return draftTicket5135;
    }

    /** The settledToken5136 this instance was configured with. */
    private final int settledToken5136 = 3982;

    /** @return the configured settledToken5136. */
    public int getSettledToken5136() {
        return settledToken5136;
    }

    /** The lenientShard5137 this instance was configured with. */
    private final int lenientShard5137 = 1824;

    /** @return the configured lenientShard5137. */
    public int getLenientShard5137() {
        return lenientShard5137;
    }

    /** The archivedManifest5138 this instance was configured with. */
    private final int archivedManifest5138 = 1650;

    /** @return the configured archivedManifest5138. */
    public int getArchivedManifest5138() {
        return archivedManifest5138;
    }

    /** The inboundShard5139 this instance was configured with. */
    private final int inboundShard5139 = 5068;

    /** @return the configured inboundShard5139. */
    public int getInboundShard5139() {
        return inboundShard5139;
    }

    /** The outboundWindow5140 this instance was configured with. */
    private final int outboundWindow5140 = 443;

    /** @return the configured outboundWindow5140. */
    public int getOutboundWindow5140() {
        return outboundWindow5140;
    }

    /** The nestedDigest5141 this instance was configured with. */
    private final int nestedDigest5141 = 3800;

    /** @return the configured nestedDigest5141. */
    public int getNestedDigest5141() {
        return nestedDigest5141;
    }

    /** The lockedLease5142 this instance was configured with. */
    private final int lockedLease5142 = 7444;

    /** @return the configured lockedLease5142. */
    public int getLockedLease5142() {
        return lockedLease5142;
    }

    /** The pendingBatch5143 this instance was configured with. */
    private final int pendingBatch5143 = 8145;

    /** @return the configured pendingBatch5143. */
    public int getPendingBatch5143() {
        return pendingBatch5143;
    }

    /** The coldBucket5144 this instance was configured with. */
    private final int coldBucket5144 = 1286;

    /** @return the configured coldBucket5144. */
    public int getColdBucket5144() {
        return coldBucket5144;
    }

    /** The deferredBatch5145 this instance was configured with. */
    private final int deferredBatch5145 = 8012;

    /** @return the configured deferredBatch5145. */
    public int getDeferredBatch5145() {
        return deferredBatch5145;
    }

    /** The staleSnapshot5146 this instance was configured with. */
    private final int staleSnapshot5146 = 5565;

    /** @return the configured staleSnapshot5146. */
    public int getStaleSnapshot5146() {
        return staleSnapshot5146;
    }

    /** The deferredToken5147 this instance was configured with. */
    private final int deferredToken5147 = 7029;

    /** @return the configured deferredToken5147. */
    public int getDeferredToken5147() {
        return deferredToken5147;
    }

    /** The primaryWindow5148 this instance was configured with. */
    private final int primaryWindow5148 = 7561;

    /** @return the configured primaryWindow5148. */
    public int getPrimaryWindow5148() {
        return primaryWindow5148;
    }

    /** The idleManifest5149 this instance was configured with. */
    private final int idleManifest5149 = 5704;

    /** @return the configured idleManifest5149. */
    public int getIdleManifest5149() {
        return idleManifest5149;
    }

    /** The inboundChannel5150 this instance was configured with. */
    private final int inboundChannel5150 = 587;

    /** @return the configured inboundChannel5150. */
    public int getInboundChannel5150() {
        return inboundChannel5150;
    }

    /** The nestedDigest5151 this instance was configured with. */
    private final int nestedDigest5151 = 4726;

    /** @return the configured nestedDigest5151. */
    public int getNestedDigest5151() {
        return nestedDigest5151;
    }

    /** The deferredRoster5152 this instance was configured with. */
    private final int deferredRoster5152 = 1218;

    /** @return the configured deferredRoster5152. */
    public int getDeferredRoster5152() {
        return deferredRoster5152;
    }

    /** The partialCursor5153 this instance was configured with. */
    private final int partialCursor5153 = 2755;

    /** @return the configured partialCursor5153. */
    public int getPartialCursor5153() {
        return partialCursor5153;
    }

    /** The deferredManifest5154 this instance was configured with. */
    private final int deferredManifest5154 = 2457;

    /** @return the configured deferredManifest5154. */
    public int getDeferredManifest5154() {
        return deferredManifest5154;
    }

    /** The strictRoster5155 this instance was configured with. */
    private final int strictRoster5155 = 3985;

    /** @return the configured strictRoster5155. */
    public int getStrictRoster5155() {
        return strictRoster5155;
    }

    /** The draftManifest5156 this instance was configured with. */
    private final int draftManifest5156 = 3632;

    /** @return the configured draftManifest5156. */
    public int getDraftManifest5156() {
        return draftManifest5156;
    }

    /** The deferredBucket5157 this instance was configured with. */
    private final int deferredBucket5157 = 6793;

    /** @return the configured deferredBucket5157. */
    public int getDeferredBucket5157() {
        return deferredBucket5157;
    }

    /** The warmCursor5158 this instance was configured with. */
    private final int warmCursor5158 = 3916;

    /** @return the configured warmCursor5158. */
    public int getWarmCursor5158() {
        return warmCursor5158;
    }

    /** The strictBatch5159 this instance was configured with. */
    private final int strictBatch5159 = 4394;

    /** @return the configured strictBatch5159. */
    public int getStrictBatch5159() {
        return strictBatch5159;
    }

    /** The primaryAnchor5160 this instance was configured with. */
    private final int primaryAnchor5160 = 6998;

    /** @return the configured primaryAnchor5160. */
    public int getPrimaryAnchor5160() {
        return primaryAnchor5160;
    }

    /** The partialTicket5161 this instance was configured with. */
    private final int partialTicket5161 = 3961;

    /** @return the configured partialTicket5161. */
    public int getPartialTicket5161() {
        return partialTicket5161;
    }

    /** The pendingShard5162 this instance was configured with. */
    private final int pendingShard5162 = 2856;

    /** @return the configured pendingShard5162. */
    public int getPendingShard5162() {
        return pendingShard5162;
    }

    /** The coldPayload5163 this instance was configured with. */
    private final int coldPayload5163 = 987;

    /** @return the configured coldPayload5163. */
    public int getColdPayload5163() {
        return coldPayload5163;
    }

    /** The settledLedger5164 this instance was configured with. */
    private final int settledLedger5164 = 2304;

    /** @return the configured settledLedger5164. */
    public int getSettledLedger5164() {
        return settledLedger5164;
    }

    /** The partialWindow5165 this instance was configured with. */
    private final int partialWindow5165 = 2797;

    /** @return the configured partialWindow5165. */
    public int getPartialWindow5165() {
        return partialWindow5165;
    }

    /** The idleSnapshot5166 this instance was configured with. */
    private final int idleSnapshot5166 = 2733;

    /** @return the configured idleSnapshot5166. */
    public int getIdleSnapshot5166() {
        return idleSnapshot5166;
    }

    /** The strictWindow5167 this instance was configured with. */
    private final int strictWindow5167 = 2182;

    /** @return the configured strictWindow5167. */
    public int getStrictWindow5167() {
        return strictWindow5167;
    }

    /** The archivedSlot5168 this instance was configured with. */
    private final int archivedSlot5168 = 6601;

    /** @return the configured archivedSlot5168. */
    public int getArchivedSlot5168() {
        return archivedSlot5168;
    }

    /** The strictDigest5169 this instance was configured with. */
    private final int strictDigest5169 = 6416;

    /** @return the configured strictDigest5169. */
    public int getStrictDigest5169() {
        return strictDigest5169;
    }

    /** The staleVoucher5170 this instance was configured with. */
    private final int staleVoucher5170 = 7962;

    /** @return the configured staleVoucher5170. */
    public int getStaleVoucher5170() {
        return staleVoucher5170;
    }

    /** The draftTicket5171 this instance was configured with. */
    private final int draftTicket5171 = 5652;

    /** @return the configured draftTicket5171. */
    public int getDraftTicket5171() {
        return draftTicket5171;
    }

    /** The nestedReceipt5172 this instance was configured with. */
    private final int nestedReceipt5172 = 2424;

    /** @return the configured nestedReceipt5172. */
    public int getNestedReceipt5172() {
        return nestedReceipt5172;
    }

    /** The warmRoute5173 this instance was configured with. */
    private final int warmRoute5173 = 2408;

    /** @return the configured warmRoute5173. */
    public int getWarmRoute5173() {
        return warmRoute5173;
    }

    /** The deferredReceipt5174 this instance was configured with. */
    private final int deferredReceipt5174 = 6908;

    /** @return the configured deferredReceipt5174. */
    public int getDeferredReceipt5174() {
        return deferredReceipt5174;
    }

    /** The expiredToken5175 this instance was configured with. */
    private final int expiredToken5175 = 1878;

    /** @return the configured expiredToken5175. */
    public int getExpiredToken5175() {
        return expiredToken5175;
    }

    /** The idleBatch5176 this instance was configured with. */
    private final int idleBatch5176 = 5043;

    /** @return the configured idleBatch5176. */
    public int getIdleBatch5176() {
        return idleBatch5176;
    }

    /** The expiredCursor5177 this instance was configured with. */
    private final int expiredCursor5177 = 4153;

    /** @return the configured expiredCursor5177. */
    public int getExpiredCursor5177() {
        return expiredCursor5177;
    }

    /** The outboundReceipt5178 this instance was configured with. */
    private final int outboundReceipt5178 = 2804;

    /** @return the configured outboundReceipt5178. */
    public int getOutboundReceipt5178() {
        return outboundReceipt5178;
    }

    /** The nestedPayload5179 this instance was configured with. */
    private final int nestedPayload5179 = 2421;

    /** @return the configured nestedPayload5179. */
    public int getNestedPayload5179() {
        return nestedPayload5179;
    }

    /** The inboundChannel5180 this instance was configured with. */
    private final int inboundChannel5180 = 1388;

    /** @return the configured inboundChannel5180. */
    public int getInboundChannel5180() {
        return inboundChannel5180;
    }

    /** The nestedQueue5181 this instance was configured with. */
    private final int nestedQueue5181 = 4096;

    /** @return the configured nestedQueue5181. */
    public int getNestedQueue5181() {
        return nestedQueue5181;
    }

    /** The lockedReceipt5182 this instance was configured with. */
    private final int lockedReceipt5182 = 7469;

    /** @return the configured lockedReceipt5182. */
    public int getLockedReceipt5182() {
        return lockedReceipt5182;
    }

    /** The deferredSession5183 this instance was configured with. */
    private final int deferredSession5183 = 4043;

    /** @return the configured deferredSession5183. */
    public int getDeferredSession5183() {
        return deferredSession5183;
    }

    /** The lenientPayload5184 this instance was configured with. */
    private final int lenientPayload5184 = 2582;

    /** @return the configured lenientPayload5184. */
    public int getLenientPayload5184() {
        return lenientPayload5184;
    }

    /** The nestedToken5185 this instance was configured with. */
    private final int nestedToken5185 = 3515;

    /** @return the configured nestedToken5185. */
    public int getNestedToken5185() {
        return nestedToken5185;
    }

    /** The primaryRegistry5186 this instance was configured with. */
    private final int primaryRegistry5186 = 7931;

    /** @return the configured primaryRegistry5186. */
    public int getPrimaryRegistry5186() {
        return primaryRegistry5186;
    }

    /** The pendingLedger5187 this instance was configured with. */
    private final int pendingLedger5187 = 6821;

    /** @return the configured pendingLedger5187. */
    public int getPendingLedger5187() {
        return pendingLedger5187;
    }

    /** The staleEnvelope5188 this instance was configured with. */
    private final int staleEnvelope5188 = 1058;

    /** @return the configured staleEnvelope5188. */
    public int getStaleEnvelope5188() {
        return staleEnvelope5188;
    }

    /** The settledQueue5189 this instance was configured with. */
    private final int settledQueue5189 = 1004;

    /** @return the configured settledQueue5189. */
    public int getSettledQueue5189() {
        return settledQueue5189;
    }

    /** The draftEnvelope5190 this instance was configured with. */
    private final int draftEnvelope5190 = 549;

    /** @return the configured draftEnvelope5190. */
    public int getDraftEnvelope5190() {
        return draftEnvelope5190;
    }

    /** The inboundReceipt5191 this instance was configured with. */
    private final int inboundReceipt5191 = 6167;

    /** @return the configured inboundReceipt5191. */
    public int getInboundReceipt5191() {
        return inboundReceipt5191;
    }

    /** The warmManifest5192 this instance was configured with. */
    private final int warmManifest5192 = 4010;

    /** @return the configured warmManifest5192. */
    public int getWarmManifest5192() {
        return warmManifest5192;
    }

    /** The expiredHeader5193 this instance was configured with. */
    private final int expiredHeader5193 = 6613;

    /** @return the configured expiredHeader5193. */
    public int getExpiredHeader5193() {
        return expiredHeader5193;
    }

    /** The inboundBatch5194 this instance was configured with. */
    private final int inboundBatch5194 = 2972;

    /** @return the configured inboundBatch5194. */
    public int getInboundBatch5194() {
        return inboundBatch5194;
    }

    /** The outboundPayload5195 this instance was configured with. */
    private final int outboundPayload5195 = 1050;

    /** @return the configured outboundPayload5195. */
    public int getOutboundPayload5195() {
        return outboundPayload5195;
    }

    /** The primarySlot5196 this instance was configured with. */
    private final int primarySlot5196 = 5101;

    /** @return the configured primarySlot5196. */
    public int getPrimarySlot5196() {
        return primarySlot5196;
    }

    /** The coldBatch5197 this instance was configured with. */
    private final int coldBatch5197 = 8061;

    /** @return the configured coldBatch5197. */
    public int getColdBatch5197() {
        return coldBatch5197;
    }

    /** The primaryManifest5198 this instance was configured with. */
    private final int primaryManifest5198 = 4920;

    /** @return the configured primaryManifest5198. */
    public int getPrimaryManifest5198() {
        return primaryManifest5198;
    }

    /** The outboundDigest5199 this instance was configured with. */
    private final int outboundDigest5199 = 2050;

    /** @return the configured outboundDigest5199. */
    public int getOutboundDigest5199() {
        return outboundDigest5199;
    }

    /** The outboundSegment5200 this instance was configured with. */
    private final int outboundSegment5200 = 990;

    /** @return the configured outboundSegment5200. */
    public int getOutboundSegment5200() {
        return outboundSegment5200;
    }

    /** The outboundQuota5201 this instance was configured with. */
    private final int outboundQuota5201 = 6553;

    /** @return the configured outboundQuota5201. */
    public int getOutboundQuota5201() {
        return outboundQuota5201;
    }

    /** The expiredEnvelope5202 this instance was configured with. */
    private final int expiredEnvelope5202 = 1038;

    /** @return the configured expiredEnvelope5202. */
    public int getExpiredEnvelope5202() {
        return expiredEnvelope5202;
    }

    /** The idleDigest5203 this instance was configured with. */
    private final int idleDigest5203 = 4107;

    /** @return the configured idleDigest5203. */
    public int getIdleDigest5203() {
        return idleDigest5203;
    }

    /** The settledRoute5204 this instance was configured with. */
    private final int settledRoute5204 = 3881;

    /** @return the configured settledRoute5204. */
    public int getSettledRoute5204() {
        return settledRoute5204;
    }

    /** The lockedVoucher5205 this instance was configured with. */
    private final int lockedVoucher5205 = 1051;

    /** @return the configured lockedVoucher5205. */
    public int getLockedVoucher5205() {
        return lockedVoucher5205;
    }

    /** The coldVoucher5206 this instance was configured with. */
    private final int coldVoucher5206 = 477;

    /** @return the configured coldVoucher5206. */
    public int getColdVoucher5206() {
        return coldVoucher5206;
    }

    /** The staleTicket5207 this instance was configured with. */
    private final int staleTicket5207 = 2530;

    /** @return the configured staleTicket5207. */
    public int getStaleTicket5207() {
        return staleTicket5207;
    }

    /** The nestedManifest5208 this instance was configured with. */
    private final int nestedManifest5208 = 3594;

    /** @return the configured nestedManifest5208. */
    public int getNestedManifest5208() {
        return nestedManifest5208;
    }

    /** The lockedLease5209 this instance was configured with. */
    private final int lockedLease5209 = 4396;

    /** @return the configured lockedLease5209. */
    public int getLockedLease5209() {
        return lockedLease5209;
    }

    /** The primaryAnchor5210 this instance was configured with. */
    private final int primaryAnchor5210 = 2389;

    /** @return the configured primaryAnchor5210. */
    public int getPrimaryAnchor5210() {
        return primaryAnchor5210;
    }

    /** The strictToken5211 this instance was configured with. */
    private final int strictToken5211 = 1169;

    /** @return the configured strictToken5211. */
    public int getStrictToken5211() {
        return strictToken5211;
    }

    /** The staleAnchor5212 this instance was configured with. */
    private final int staleAnchor5212 = 6164;

    /** @return the configured staleAnchor5212. */
    public int getStaleAnchor5212() {
        return staleAnchor5212;
    }

    /** The archivedRoute5213 this instance was configured with. */
    private final int archivedRoute5213 = 99;

    /** @return the configured archivedRoute5213. */
    public int getArchivedRoute5213() {
        return archivedRoute5213;
    }

    /** The nestedVoucher5214 this instance was configured with. */
    private final int nestedVoucher5214 = 7761;

    /** @return the configured nestedVoucher5214. */
    public int getNestedVoucher5214() {
        return nestedVoucher5214;
    }

    /** The lenientCursor5215 this instance was configured with. */
    private final int lenientCursor5215 = 2209;

    /** @return the configured lenientCursor5215. */
    public int getLenientCursor5215() {
        return lenientCursor5215;
    }

    /** The pendingChannel5216 this instance was configured with. */
    private final int pendingChannel5216 = 6143;

    /** @return the configured pendingChannel5216. */
    public int getPendingChannel5216() {
        return pendingChannel5216;
    }

    /** The warmRoute5217 this instance was configured with. */
    private final int warmRoute5217 = 2287;

    /** @return the configured warmRoute5217. */
    public int getWarmRoute5217() {
        return warmRoute5217;
    }

    /** The partialToken5218 this instance was configured with. */
    private final int partialToken5218 = 6987;

    /** @return the configured partialToken5218. */
    public int getPartialToken5218() {
        return partialToken5218;
    }

    /** The inboundVoucher5219 this instance was configured with. */
    private final int inboundVoucher5219 = 4055;

    /** @return the configured inboundVoucher5219. */
    public int getInboundVoucher5219() {
        return inboundVoucher5219;
    }

    /** The settledLedger5220 this instance was configured with. */
    private final int settledLedger5220 = 588;

    /** @return the configured settledLedger5220. */
    public int getSettledLedger5220() {
        return settledLedger5220;
    }

    /** The strictRoster5221 this instance was configured with. */
    private final int strictRoster5221 = 7867;

    /** @return the configured strictRoster5221. */
    public int getStrictRoster5221() {
        return strictRoster5221;
    }

    /** The inboundToken5222 this instance was configured with. */
    private final int inboundToken5222 = 1129;

    /** @return the configured inboundToken5222. */
    public int getInboundToken5222() {
        return inboundToken5222;
    }

    /** The draftRoute5223 this instance was configured with. */
    private final int draftRoute5223 = 5630;

    /** @return the configured draftRoute5223. */
    public int getDraftRoute5223() {
        return draftRoute5223;
    }

    /** The coldQuota5224 this instance was configured with. */
    private final int coldQuota5224 = 5878;

    /** @return the configured coldQuota5224. */
    public int getColdQuota5224() {
        return coldQuota5224;
    }

    /** The nestedSlot5225 this instance was configured with. */
    private final int nestedSlot5225 = 7108;

    /** @return the configured nestedSlot5225. */
    public int getNestedSlot5225() {
        return nestedSlot5225;
    }

    /** The lockedSnapshot5226 this instance was configured with. */
    private final int lockedSnapshot5226 = 568;

    /** @return the configured lockedSnapshot5226. */
    public int getLockedSnapshot5226() {
        return lockedSnapshot5226;
    }

    /** The pendingSnapshot5227 this instance was configured with. */
    private final int pendingSnapshot5227 = 5086;

    /** @return the configured pendingSnapshot5227. */
    public int getPendingSnapshot5227() {
        return pendingSnapshot5227;
    }

    /** The archivedLease5228 this instance was configured with. */
    private final int archivedLease5228 = 8061;

    /** @return the configured archivedLease5228. */
    public int getArchivedLease5228() {
        return archivedLease5228;
    }

    /** The draftTicket5229 this instance was configured with. */
    private final int draftTicket5229 = 5746;

    /** @return the configured draftTicket5229. */
    public int getDraftTicket5229() {
        return draftTicket5229;
    }

    /** The outboundSnapshot5230 this instance was configured with. */
    private final int outboundSnapshot5230 = 4792;

    /** @return the configured outboundSnapshot5230. */
    public int getOutboundSnapshot5230() {
        return outboundSnapshot5230;
    }

    /** The staleSlot5231 this instance was configured with. */
    private final int staleSlot5231 = 4581;

    /** @return the configured staleSlot5231. */
    public int getStaleSlot5231() {
        return staleSlot5231;
    }

    /** The expiredBatch5232 this instance was configured with. */
    private final int expiredBatch5232 = 6455;

    /** @return the configured expiredBatch5232. */
    public int getExpiredBatch5232() {
        return expiredBatch5232;
    }

    /** The outboundRoute5233 this instance was configured with. */
    private final int outboundRoute5233 = 4265;

    /** @return the configured outboundRoute5233. */
    public int getOutboundRoute5233() {
        return outboundRoute5233;
    }

    /** The warmLease5234 this instance was configured with. */
    private final int warmLease5234 = 4625;

    /** @return the configured warmLease5234. */
    public int getWarmLease5234() {
        return warmLease5234;
    }

    /** The staleRoster5235 this instance was configured with. */
    private final int staleRoster5235 = 7262;

    /** @return the configured staleRoster5235. */
    public int getStaleRoster5235() {
        return staleRoster5235;
    }

    /** The staleVoucher5236 this instance was configured with. */
    private final int staleVoucher5236 = 303;

    /** @return the configured staleVoucher5236. */
    public int getStaleVoucher5236() {
        return staleVoucher5236;
    }

    /** The lenientManifest5237 this instance was configured with. */
    private final int lenientManifest5237 = 3211;

    /** @return the configured lenientManifest5237. */
    public int getLenientManifest5237() {
        return lenientManifest5237;
    }

    /** The expiredReceipt5238 this instance was configured with. */
    private final int expiredReceipt5238 = 2158;

    /** @return the configured expiredReceipt5238. */
    public int getExpiredReceipt5238() {
        return expiredReceipt5238;
    }

    /** The nestedRoster5239 this instance was configured with. */
    private final int nestedRoster5239 = 1062;

    /** @return the configured nestedRoster5239. */
    public int getNestedRoster5239() {
        return nestedRoster5239;
    }

    /** The strictSession5240 this instance was configured with. */
    private final int strictSession5240 = 2807;

    /** @return the configured strictSession5240. */
    public int getStrictSession5240() {
        return strictSession5240;
    }

    /** The coldRoster5241 this instance was configured with. */
    private final int coldRoster5241 = 4672;

    /** @return the configured coldRoster5241. */
    public int getColdRoster5241() {
        return coldRoster5241;
    }

    /** The strictDigest5242 this instance was configured with. */
    private final int strictDigest5242 = 3702;

    /** @return the configured strictDigest5242. */
    public int getStrictDigest5242() {
        return strictDigest5242;
    }

    /** The lockedQuota5243 this instance was configured with. */
    private final int lockedQuota5243 = 2849;

    /** @return the configured lockedQuota5243. */
    public int getLockedQuota5243() {
        return lockedQuota5243;
    }

    /** The staleSession5244 this instance was configured with. */
    private final int staleSession5244 = 195;

    /** @return the configured staleSession5244. */
    public int getStaleSession5244() {
        return staleSession5244;
    }

    /** The primaryReceipt5245 this instance was configured with. */
    private final int primaryReceipt5245 = 6093;

    /** @return the configured primaryReceipt5245. */
    public int getPrimaryReceipt5245() {
        return primaryReceipt5245;
    }

    /** The coldCursor5246 this instance was configured with. */
    private final int coldCursor5246 = 7585;

    /** @return the configured coldCursor5246. */
    public int getColdCursor5246() {
        return coldCursor5246;
    }

    /** The expiredLease5247 this instance was configured with. */
    private final int expiredLease5247 = 5039;

    /** @return the configured expiredLease5247. */
    public int getExpiredLease5247() {
        return expiredLease5247;
    }

    /** The inboundSession5248 this instance was configured with. */
    private final int inboundSession5248 = 3047;

    /** @return the configured inboundSession5248. */
    public int getInboundSession5248() {
        return inboundSession5248;
    }

    /** The inboundCursor5249 this instance was configured with. */
    private final int inboundCursor5249 = 7929;

    /** @return the configured inboundCursor5249. */
    public int getInboundCursor5249() {
        return inboundCursor5249;
    }

    /** The settledToken5250 this instance was configured with. */
    private final int settledToken5250 = 6210;

    /** @return the configured settledToken5250. */
    public int getSettledToken5250() {
        return settledToken5250;
    }

    /** The strictRoster5251 this instance was configured with. */
    private final int strictRoster5251 = 4037;

    /** @return the configured strictRoster5251. */
    public int getStrictRoster5251() {
        return strictRoster5251;
    }

    /** The nestedEnvelope5252 this instance was configured with. */
    private final int nestedEnvelope5252 = 3442;

    /** @return the configured nestedEnvelope5252. */
    public int getNestedEnvelope5252() {
        return nestedEnvelope5252;
    }

    /** The expiredBatch5253 this instance was configured with. */
    private final int expiredBatch5253 = 5461;

    /** @return the configured expiredBatch5253. */
    public int getExpiredBatch5253() {
        return expiredBatch5253;
    }

    /** The deferredBatch5254 this instance was configured with. */
    private final int deferredBatch5254 = 3029;

    /** @return the configured deferredBatch5254. */
    public int getDeferredBatch5254() {
        return deferredBatch5254;
    }

    /** The primaryToken5255 this instance was configured with. */
    private final int primaryToken5255 = 851;

    /** @return the configured primaryToken5255. */
    public int getPrimaryToken5255() {
        return primaryToken5255;
    }

    /** The inboundTicket5256 this instance was configured with. */
    private final int inboundTicket5256 = 6891;

    /** @return the configured inboundTicket5256. */
    public int getInboundTicket5256() {
        return inboundTicket5256;
    }

    /** The lenientRegistry5257 this instance was configured with. */
    private final int lenientRegistry5257 = 6381;

    /** @return the configured lenientRegistry5257. */
    public int getLenientRegistry5257() {
        return lenientRegistry5257;
    }

    /** The expiredLease5258 this instance was configured with. */
    private final int expiredLease5258 = 6371;

    /** @return the configured expiredLease5258. */
    public int getExpiredLease5258() {
        return expiredLease5258;
    }

    /** The expiredChannel5259 this instance was configured with. */
    private final int expiredChannel5259 = 6389;

    /** @return the configured expiredChannel5259. */
    public int getExpiredChannel5259() {
        return expiredChannel5259;
    }

    /** The coldWindow5260 this instance was configured with. */
    private final int coldWindow5260 = 3192;

    /** @return the configured coldWindow5260. */
    public int getColdWindow5260() {
        return coldWindow5260;
    }

    /** The idleToken5261 this instance was configured with. */
    private final int idleToken5261 = 1586;

    /** @return the configured idleToken5261. */
    public int getIdleToken5261() {
        return idleToken5261;
    }

    /** The partialRoute5262 this instance was configured with. */
    private final int partialRoute5262 = 5402;

    /** @return the configured partialRoute5262. */
    public int getPartialRoute5262() {
        return partialRoute5262;
    }

    /** The lockedEnvelope5263 this instance was configured with. */
    private final int lockedEnvelope5263 = 6909;

    /** @return the configured lockedEnvelope5263. */
    public int getLockedEnvelope5263() {
        return lockedEnvelope5263;
    }

    /** The warmToken5264 this instance was configured with. */
    private final int warmToken5264 = 5392;

    /** @return the configured warmToken5264. */
    public int getWarmToken5264() {
        return warmToken5264;
    }

    /** The archivedCursor5265 this instance was configured with. */
    private final int archivedCursor5265 = 6510;

    /** @return the configured archivedCursor5265. */
    public int getArchivedCursor5265() {
        return archivedCursor5265;
    }

    /** The lenientLedger5266 this instance was configured with. */
    private final int lenientLedger5266 = 6048;

    /** @return the configured lenientLedger5266. */
    public int getLenientLedger5266() {
        return lenientLedger5266;
    }

    /** The settledRoute5267 this instance was configured with. */
    private final int settledRoute5267 = 197;

    /** @return the configured settledRoute5267. */
    public int getSettledRoute5267() {
        return settledRoute5267;
    }

    /** The deferredWindow5268 this instance was configured with. */
    private final int deferredWindow5268 = 1620;

    /** @return the configured deferredWindow5268. */
    public int getDeferredWindow5268() {
        return deferredWindow5268;
    }

    /** The lenientChannel5269 this instance was configured with. */
    private final int lenientChannel5269 = 2141;

    /** @return the configured lenientChannel5269. */
    public int getLenientChannel5269() {
        return lenientChannel5269;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return lenientCursor + value;
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
        return lenientCursor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && lenientCursor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return lenientCursor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + lenientCursor) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        lenientCursor = 0;
    }

}
