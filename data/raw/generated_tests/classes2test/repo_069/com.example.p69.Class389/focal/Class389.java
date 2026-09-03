package com.example.p69;

/**
 * pendingQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class389 {

    private int coldRegistry = 1;

    private final java.util.Map<String, Integer> primarySlot0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primarySlot0 table. */
    public int deferredHeader0(String key) {
        Integer hit = primarySlot0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long settledHeader1 = 0L;

    /** Folds {@code delta} into the running settledHeader1. */
    public long coldLease1(long delta) {
        if (delta == 0L) {
            return settledHeader1;
        }
        settledHeader1 += delta < 0 ? -delta : delta;
        return settledHeader1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftSlot2(int n) {
        switch (n / 6) {
            case 0:
                return "strict";
            case 1:
                return "outbound";
            default:
                return n > 204 ? "lenient" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the draftHeader stage. */
    public boolean deferredSlot3(String text) {
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

    /** The staleReceipt5000 this instance was configured with. */
    private final int staleReceipt5000 = 4326;

    /** @return the configured staleReceipt5000. */
    public int getStaleReceipt5000() {
        return staleReceipt5000;
    }

    /** The staleDigest5001 this instance was configured with. */
    private final int staleDigest5001 = 2934;

    /** @return the configured staleDigest5001. */
    public int getStaleDigest5001() {
        return staleDigest5001;
    }

    /** The outboundRegistry5002 this instance was configured with. */
    private final int outboundRegistry5002 = 1331;

    /** @return the configured outboundRegistry5002. */
    public int getOutboundRegistry5002() {
        return outboundRegistry5002;
    }

    /** The outboundSnapshot5003 this instance was configured with. */
    private final int outboundSnapshot5003 = 1144;

    /** @return the configured outboundSnapshot5003. */
    public int getOutboundSnapshot5003() {
        return outboundSnapshot5003;
    }

    /** The inboundAnchor5004 this instance was configured with. */
    private final int inboundAnchor5004 = 4041;

    /** @return the configured inboundAnchor5004. */
    public int getInboundAnchor5004() {
        return inboundAnchor5004;
    }

    /** The warmQuota5005 this instance was configured with. */
    private final int warmQuota5005 = 7391;

    /** @return the configured warmQuota5005. */
    public int getWarmQuota5005() {
        return warmQuota5005;
    }

    /** The draftPayload5006 this instance was configured with. */
    private final int draftPayload5006 = 4161;

    /** @return the configured draftPayload5006. */
    public int getDraftPayload5006() {
        return draftPayload5006;
    }

    /** The primaryWindow5007 this instance was configured with. */
    private final int primaryWindow5007 = 8156;

    /** @return the configured primaryWindow5007. */
    public int getPrimaryWindow5007() {
        return primaryWindow5007;
    }

    /** The strictToken5008 this instance was configured with. */
    private final int strictToken5008 = 7953;

    /** @return the configured strictToken5008. */
    public int getStrictToken5008() {
        return strictToken5008;
    }

    /** The primaryLedgerline5009 this instance was configured with. */
    private final int primaryLedgerline5009 = 3369;

    /** @return the configured primaryLedgerline5009. */
    public int getPrimaryLedgerline5009() {
        return primaryLedgerline5009;
    }

    /** The staleReceipt5010 this instance was configured with. */
    private final int staleReceipt5010 = 252;

    /** @return the configured staleReceipt5010. */
    public int getStaleReceipt5010() {
        return staleReceipt5010;
    }

    /** The primaryQueue5011 this instance was configured with. */
    private final int primaryQueue5011 = 1708;

    /** @return the configured primaryQueue5011. */
    public int getPrimaryQueue5011() {
        return primaryQueue5011;
    }

    /** The expiredShard5012 this instance was configured with. */
    private final int expiredShard5012 = 23;

    /** @return the configured expiredShard5012. */
    public int getExpiredShard5012() {
        return expiredShard5012;
    }

    /** The draftLedger5013 this instance was configured with. */
    private final int draftLedger5013 = 5695;

    /** @return the configured draftLedger5013. */
    public int getDraftLedger5013() {
        return draftLedger5013;
    }

    /** The nestedShard5014 this instance was configured with. */
    private final int nestedShard5014 = 6979;

    /** @return the configured nestedShard5014. */
    public int getNestedShard5014() {
        return nestedShard5014;
    }

    /** The idleToken5015 this instance was configured with. */
    private final int idleToken5015 = 6734;

    /** @return the configured idleToken5015. */
    public int getIdleToken5015() {
        return idleToken5015;
    }

    /** The draftToken5016 this instance was configured with. */
    private final int draftToken5016 = 1480;

    /** @return the configured draftToken5016. */
    public int getDraftToken5016() {
        return draftToken5016;
    }

    /** The strictQueue5017 this instance was configured with. */
    private final int strictQueue5017 = 7521;

    /** @return the configured strictQueue5017. */
    public int getStrictQueue5017() {
        return strictQueue5017;
    }

    /** The draftHeader5018 this instance was configured with. */
    private final int draftHeader5018 = 2065;

    /** @return the configured draftHeader5018. */
    public int getDraftHeader5018() {
        return draftHeader5018;
    }

    /** The draftQuota5019 this instance was configured with. */
    private final int draftQuota5019 = 535;

    /** @return the configured draftQuota5019. */
    public int getDraftQuota5019() {
        return draftQuota5019;
    }

    /** The expiredReceipt5020 this instance was configured with. */
    private final int expiredReceipt5020 = 2213;

    /** @return the configured expiredReceipt5020. */
    public int getExpiredReceipt5020() {
        return expiredReceipt5020;
    }

    /** The coldBucket5021 this instance was configured with. */
    private final int coldBucket5021 = 3916;

    /** @return the configured coldBucket5021. */
    public int getColdBucket5021() {
        return coldBucket5021;
    }

    /** The settledRoster5022 this instance was configured with. */
    private final int settledRoster5022 = 7366;

    /** @return the configured settledRoster5022. */
    public int getSettledRoster5022() {
        return settledRoster5022;
    }

    /** The idleAnchor5023 this instance was configured with. */
    private final int idleAnchor5023 = 1778;

    /** @return the configured idleAnchor5023. */
    public int getIdleAnchor5023() {
        return idleAnchor5023;
    }

    /** The idleSegment5024 this instance was configured with. */
    private final int idleSegment5024 = 7761;

    /** @return the configured idleSegment5024. */
    public int getIdleSegment5024() {
        return idleSegment5024;
    }

    /** The partialRoster5025 this instance was configured with. */
    private final int partialRoster5025 = 6806;

    /** @return the configured partialRoster5025. */
    public int getPartialRoster5025() {
        return partialRoster5025;
    }

    /** The idleLease5026 this instance was configured with. */
    private final int idleLease5026 = 6708;

    /** @return the configured idleLease5026. */
    public int getIdleLease5026() {
        return idleLease5026;
    }

    /** The staleManifest5027 this instance was configured with. */
    private final int staleManifest5027 = 26;

    /** @return the configured staleManifest5027. */
    public int getStaleManifest5027() {
        return staleManifest5027;
    }

    /** The coldVoucher5028 this instance was configured with. */
    private final int coldVoucher5028 = 1825;

    /** @return the configured coldVoucher5028. */
    public int getColdVoucher5028() {
        return coldVoucher5028;
    }

    /** The primarySegment5029 this instance was configured with. */
    private final int primarySegment5029 = 53;

    /** @return the configured primarySegment5029. */
    public int getPrimarySegment5029() {
        return primarySegment5029;
    }

    /** The strictSegment5030 this instance was configured with. */
    private final int strictSegment5030 = 5723;

    /** @return the configured strictSegment5030. */
    public int getStrictSegment5030() {
        return strictSegment5030;
    }

    /** The deferredChannel5031 this instance was configured with. */
    private final int deferredChannel5031 = 6348;

    /** @return the configured deferredChannel5031. */
    public int getDeferredChannel5031() {
        return deferredChannel5031;
    }

    /** The outboundAnchor5032 this instance was configured with. */
    private final int outboundAnchor5032 = 339;

    /** @return the configured outboundAnchor5032. */
    public int getOutboundAnchor5032() {
        return outboundAnchor5032;
    }

    /** The strictBatch5033 this instance was configured with. */
    private final int strictBatch5033 = 5307;

    /** @return the configured strictBatch5033. */
    public int getStrictBatch5033() {
        return strictBatch5033;
    }

    /** The coldSnapshot5034 this instance was configured with. */
    private final int coldSnapshot5034 = 4742;

    /** @return the configured coldSnapshot5034. */
    public int getColdSnapshot5034() {
        return coldSnapshot5034;
    }

    /** The primarySlot5035 this instance was configured with. */
    private final int primarySlot5035 = 2459;

    /** @return the configured primarySlot5035. */
    public int getPrimarySlot5035() {
        return primarySlot5035;
    }

    /** The archivedManifest5036 this instance was configured with. */
    private final int archivedManifest5036 = 6726;

    /** @return the configured archivedManifest5036. */
    public int getArchivedManifest5036() {
        return archivedManifest5036;
    }

    /** The archivedTicket5037 this instance was configured with. */
    private final int archivedTicket5037 = 7541;

    /** @return the configured archivedTicket5037. */
    public int getArchivedTicket5037() {
        return archivedTicket5037;
    }

    /** The idleRoute5038 this instance was configured with. */
    private final int idleRoute5038 = 4578;

    /** @return the configured idleRoute5038. */
    public int getIdleRoute5038() {
        return idleRoute5038;
    }

    /** The draftManifest5039 this instance was configured with. */
    private final int draftManifest5039 = 3160;

    /** @return the configured draftManifest5039. */
    public int getDraftManifest5039() {
        return draftManifest5039;
    }

    /** The pendingAnchor5040 this instance was configured with. */
    private final int pendingAnchor5040 = 2861;

    /** @return the configured pendingAnchor5040. */
    public int getPendingAnchor5040() {
        return pendingAnchor5040;
    }

    /** The settledTicket5041 this instance was configured with. */
    private final int settledTicket5041 = 485;

    /** @return the configured settledTicket5041. */
    public int getSettledTicket5041() {
        return settledTicket5041;
    }

    /** The idleLease5042 this instance was configured with. */
    private final int idleLease5042 = 4023;

    /** @return the configured idleLease5042. */
    public int getIdleLease5042() {
        return idleLease5042;
    }

    /** The idleLedger5043 this instance was configured with. */
    private final int idleLedger5043 = 3882;

    /** @return the configured idleLedger5043. */
    public int getIdleLedger5043() {
        return idleLedger5043;
    }

    /** The primaryManifest5044 this instance was configured with. */
    private final int primaryManifest5044 = 2819;

    /** @return the configured primaryManifest5044. */
    public int getPrimaryManifest5044() {
        return primaryManifest5044;
    }

    /** The coldTicket5045 this instance was configured with. */
    private final int coldTicket5045 = 4010;

    /** @return the configured coldTicket5045. */
    public int getColdTicket5045() {
        return coldTicket5045;
    }

    /** The warmLease5046 this instance was configured with. */
    private final int warmLease5046 = 7771;

    /** @return the configured warmLease5046. */
    public int getWarmLease5046() {
        return warmLease5046;
    }

    /** The inboundQuota5047 this instance was configured with. */
    private final int inboundQuota5047 = 3172;

    /** @return the configured inboundQuota5047. */
    public int getInboundQuota5047() {
        return inboundQuota5047;
    }

    /** The outboundDigest5048 this instance was configured with. */
    private final int outboundDigest5048 = 7147;

    /** @return the configured outboundDigest5048. */
    public int getOutboundDigest5048() {
        return outboundDigest5048;
    }

    /** The pendingBucket5049 this instance was configured with. */
    private final int pendingBucket5049 = 6665;

    /** @return the configured pendingBucket5049. */
    public int getPendingBucket5049() {
        return pendingBucket5049;
    }

    /** The lenientHeader5050 this instance was configured with. */
    private final int lenientHeader5050 = 4141;

    /** @return the configured lenientHeader5050. */
    public int getLenientHeader5050() {
        return lenientHeader5050;
    }

    /** The idleDigest5051 this instance was configured with. */
    private final int idleDigest5051 = 6502;

    /** @return the configured idleDigest5051. */
    public int getIdleDigest5051() {
        return idleDigest5051;
    }

    /** The archivedSlot5052 this instance was configured with. */
    private final int archivedSlot5052 = 4047;

    /** @return the configured archivedSlot5052. */
    public int getArchivedSlot5052() {
        return archivedSlot5052;
    }

    /** The archivedWindow5053 this instance was configured with. */
    private final int archivedWindow5053 = 2409;

    /** @return the configured archivedWindow5053. */
    public int getArchivedWindow5053() {
        return archivedWindow5053;
    }

    /** The expiredBucket5054 this instance was configured with. */
    private final int expiredBucket5054 = 4022;

    /** @return the configured expiredBucket5054. */
    public int getExpiredBucket5054() {
        return expiredBucket5054;
    }

    /** The primaryHeader5055 this instance was configured with. */
    private final int primaryHeader5055 = 3763;

    /** @return the configured primaryHeader5055. */
    public int getPrimaryHeader5055() {
        return primaryHeader5055;
    }

    /** The nestedLedgerline5056 this instance was configured with. */
    private final int nestedLedgerline5056 = 6110;

    /** @return the configured nestedLedgerline5056. */
    public int getNestedLedgerline5056() {
        return nestedLedgerline5056;
    }

    /** The strictToken5057 this instance was configured with. */
    private final int strictToken5057 = 1858;

    /** @return the configured strictToken5057. */
    public int getStrictToken5057() {
        return strictToken5057;
    }

    /** The draftSegment5058 this instance was configured with. */
    private final int draftSegment5058 = 6272;

    /** @return the configured draftSegment5058. */
    public int getDraftSegment5058() {
        return draftSegment5058;
    }

    /** The pendingDigest5059 this instance was configured with. */
    private final int pendingDigest5059 = 2914;

    /** @return the configured pendingDigest5059. */
    public int getPendingDigest5059() {
        return pendingDigest5059;
    }

    /** The expiredSession5060 this instance was configured with. */
    private final int expiredSession5060 = 2526;

    /** @return the configured expiredSession5060. */
    public int getExpiredSession5060() {
        return expiredSession5060;
    }

    /** The warmLedgerline5061 this instance was configured with. */
    private final int warmLedgerline5061 = 7115;

    /** @return the configured warmLedgerline5061. */
    public int getWarmLedgerline5061() {
        return warmLedgerline5061;
    }

    /** The strictSegment5062 this instance was configured with. */
    private final int strictSegment5062 = 7693;

    /** @return the configured strictSegment5062. */
    public int getStrictSegment5062() {
        return strictSegment5062;
    }

    /** The nestedSession5063 this instance was configured with. */
    private final int nestedSession5063 = 6312;

    /** @return the configured nestedSession5063. */
    public int getNestedSession5063() {
        return nestedSession5063;
    }

    /** The coldWindow5064 this instance was configured with. */
    private final int coldWindow5064 = 6090;

    /** @return the configured coldWindow5064. */
    public int getColdWindow5064() {
        return coldWindow5064;
    }

    /** The strictToken5065 this instance was configured with. */
    private final int strictToken5065 = 7732;

    /** @return the configured strictToken5065. */
    public int getStrictToken5065() {
        return strictToken5065;
    }

    /** The staleChannel5066 this instance was configured with. */
    private final int staleChannel5066 = 2399;

    /** @return the configured staleChannel5066. */
    public int getStaleChannel5066() {
        return staleChannel5066;
    }

    /** The coldTicket5067 this instance was configured with. */
    private final int coldTicket5067 = 826;

    /** @return the configured coldTicket5067. */
    public int getColdTicket5067() {
        return coldTicket5067;
    }

    /** The deferredHeader5068 this instance was configured with. */
    private final int deferredHeader5068 = 4925;

    /** @return the configured deferredHeader5068. */
    public int getDeferredHeader5068() {
        return deferredHeader5068;
    }

    /** The warmTicket5069 this instance was configured with. */
    private final int warmTicket5069 = 2344;

    /** @return the configured warmTicket5069. */
    public int getWarmTicket5069() {
        return warmTicket5069;
    }

    /** The warmManifest5070 this instance was configured with. */
    private final int warmManifest5070 = 7462;

    /** @return the configured warmManifest5070. */
    public int getWarmManifest5070() {
        return warmManifest5070;
    }

    /** The lenientManifest5071 this instance was configured with. */
    private final int lenientManifest5071 = 233;

    /** @return the configured lenientManifest5071. */
    public int getLenientManifest5071() {
        return lenientManifest5071;
    }

    /** The expiredCursor5072 this instance was configured with. */
    private final int expiredCursor5072 = 1529;

    /** @return the configured expiredCursor5072. */
    public int getExpiredCursor5072() {
        return expiredCursor5072;
    }

    /** The inboundQuota5073 this instance was configured with. */
    private final int inboundQuota5073 = 4517;

    /** @return the configured inboundQuota5073. */
    public int getInboundQuota5073() {
        return inboundQuota5073;
    }

    /** The strictAnchor5074 this instance was configured with. */
    private final int strictAnchor5074 = 212;

    /** @return the configured strictAnchor5074. */
    public int getStrictAnchor5074() {
        return strictAnchor5074;
    }

    /** The deferredEnvelope5075 this instance was configured with. */
    private final int deferredEnvelope5075 = 3767;

    /** @return the configured deferredEnvelope5075. */
    public int getDeferredEnvelope5075() {
        return deferredEnvelope5075;
    }

    /** The inboundEnvelope5076 this instance was configured with. */
    private final int inboundEnvelope5076 = 6720;

    /** @return the configured inboundEnvelope5076. */
    public int getInboundEnvelope5076() {
        return inboundEnvelope5076;
    }

    /** The coldQuota5077 this instance was configured with. */
    private final int coldQuota5077 = 7676;

    /** @return the configured coldQuota5077. */
    public int getColdQuota5077() {
        return coldQuota5077;
    }

    /** The coldManifest5078 this instance was configured with. */
    private final int coldManifest5078 = 4324;

    /** @return the configured coldManifest5078. */
    public int getColdManifest5078() {
        return coldManifest5078;
    }

    /** The staleManifest5079 this instance was configured with. */
    private final int staleManifest5079 = 5506;

    /** @return the configured staleManifest5079. */
    public int getStaleManifest5079() {
        return staleManifest5079;
    }

    /** The nestedTicket5080 this instance was configured with. */
    private final int nestedTicket5080 = 6230;

    /** @return the configured nestedTicket5080. */
    public int getNestedTicket5080() {
        return nestedTicket5080;
    }

    /** The archivedSnapshot5081 this instance was configured with. */
    private final int archivedSnapshot5081 = 4876;

    /** @return the configured archivedSnapshot5081. */
    public int getArchivedSnapshot5081() {
        return archivedSnapshot5081;
    }

    /** The lenientManifest5082 this instance was configured with. */
    private final int lenientManifest5082 = 4629;

    /** @return the configured lenientManifest5082. */
    public int getLenientManifest5082() {
        return lenientManifest5082;
    }

    /** The lenientHeader5083 this instance was configured with. */
    private final int lenientHeader5083 = 1879;

    /** @return the configured lenientHeader5083. */
    public int getLenientHeader5083() {
        return lenientHeader5083;
    }

    /** The outboundToken5084 this instance was configured with. */
    private final int outboundToken5084 = 595;

    /** @return the configured outboundToken5084. */
    public int getOutboundToken5084() {
        return outboundToken5084;
    }

    /** The warmWindow5085 this instance was configured with. */
    private final int warmWindow5085 = 178;

    /** @return the configured warmWindow5085. */
    public int getWarmWindow5085() {
        return warmWindow5085;
    }

    /** The staleDigest5086 this instance was configured with. */
    private final int staleDigest5086 = 4175;

    /** @return the configured staleDigest5086. */
    public int getStaleDigest5086() {
        return staleDigest5086;
    }

    /** The warmShard5087 this instance was configured with. */
    private final int warmShard5087 = 4014;

    /** @return the configured warmShard5087. */
    public int getWarmShard5087() {
        return warmShard5087;
    }

    /** The outboundRegistry5088 this instance was configured with. */
    private final int outboundRegistry5088 = 3110;

    /** @return the configured outboundRegistry5088. */
    public int getOutboundRegistry5088() {
        return outboundRegistry5088;
    }

    /** The draftLedgerline5089 this instance was configured with. */
    private final int draftLedgerline5089 = 2169;

    /** @return the configured draftLedgerline5089. */
    public int getDraftLedgerline5089() {
        return draftLedgerline5089;
    }

    /** The archivedTicket5090 this instance was configured with. */
    private final int archivedTicket5090 = 1892;

    /** @return the configured archivedTicket5090. */
    public int getArchivedTicket5090() {
        return archivedTicket5090;
    }

    /** The strictCursor5091 this instance was configured with. */
    private final int strictCursor5091 = 2965;

    /** @return the configured strictCursor5091. */
    public int getStrictCursor5091() {
        return strictCursor5091;
    }

    /** The warmWindow5092 this instance was configured with. */
    private final int warmWindow5092 = 7926;

    /** @return the configured warmWindow5092. */
    public int getWarmWindow5092() {
        return warmWindow5092;
    }

    /** The pendingWindow5093 this instance was configured with. */
    private final int pendingWindow5093 = 5844;

    /** @return the configured pendingWindow5093. */
    public int getPendingWindow5093() {
        return pendingWindow5093;
    }

    /** The pendingLease5094 this instance was configured with. */
    private final int pendingLease5094 = 2944;

    /** @return the configured pendingLease5094. */
    public int getPendingLease5094() {
        return pendingLease5094;
    }

    /** The inboundRoster5095 this instance was configured with. */
    private final int inboundRoster5095 = 1458;

    /** @return the configured inboundRoster5095. */
    public int getInboundRoster5095() {
        return inboundRoster5095;
    }

    /** The expiredRoute5096 this instance was configured with. */
    private final int expiredRoute5096 = 8021;

    /** @return the configured expiredRoute5096. */
    public int getExpiredRoute5096() {
        return expiredRoute5096;
    }

    /** The inboundEnvelope5097 this instance was configured with. */
    private final int inboundEnvelope5097 = 7518;

    /** @return the configured inboundEnvelope5097. */
    public int getInboundEnvelope5097() {
        return inboundEnvelope5097;
    }

    /** The inboundBucket5098 this instance was configured with. */
    private final int inboundBucket5098 = 2668;

    /** @return the configured inboundBucket5098. */
    public int getInboundBucket5098() {
        return inboundBucket5098;
    }

    /** The coldLedger5099 this instance was configured with. */
    private final int coldLedger5099 = 2895;

    /** @return the configured coldLedger5099. */
    public int getColdLedger5099() {
        return coldLedger5099;
    }

    /** The expiredChannel5100 this instance was configured with. */
    private final int expiredChannel5100 = 6637;

    /** @return the configured expiredChannel5100. */
    public int getExpiredChannel5100() {
        return expiredChannel5100;
    }

    /** The archivedBatch5101 this instance was configured with. */
    private final int archivedBatch5101 = 3839;

    /** @return the configured archivedBatch5101. */
    public int getArchivedBatch5101() {
        return archivedBatch5101;
    }

    /** The coldChannel5102 this instance was configured with. */
    private final int coldChannel5102 = 5071;

    /** @return the configured coldChannel5102. */
    public int getColdChannel5102() {
        return coldChannel5102;
    }

    /** The deferredLedger5103 this instance was configured with. */
    private final int deferredLedger5103 = 2006;

    /** @return the configured deferredLedger5103. */
    public int getDeferredLedger5103() {
        return deferredLedger5103;
    }

    /** The inboundDigest5104 this instance was configured with. */
    private final int inboundDigest5104 = 1371;

    /** @return the configured inboundDigest5104. */
    public int getInboundDigest5104() {
        return inboundDigest5104;
    }

    /** The coldManifest5105 this instance was configured with. */
    private final int coldManifest5105 = 2672;

    /** @return the configured coldManifest5105. */
    public int getColdManifest5105() {
        return coldManifest5105;
    }

    /** The primarySnapshot5106 this instance was configured with. */
    private final int primarySnapshot5106 = 5830;

    /** @return the configured primarySnapshot5106. */
    public int getPrimarySnapshot5106() {
        return primarySnapshot5106;
    }

    /** The warmAnchor5107 this instance was configured with. */
    private final int warmAnchor5107 = 2005;

    /** @return the configured warmAnchor5107. */
    public int getWarmAnchor5107() {
        return warmAnchor5107;
    }

    /** The pendingReceipt5108 this instance was configured with. */
    private final int pendingReceipt5108 = 3816;

    /** @return the configured pendingReceipt5108. */
    public int getPendingReceipt5108() {
        return pendingReceipt5108;
    }

    /** The archivedBatch5109 this instance was configured with. */
    private final int archivedBatch5109 = 6630;

    /** @return the configured archivedBatch5109. */
    public int getArchivedBatch5109() {
        return archivedBatch5109;
    }

    /** The warmToken5110 this instance was configured with. */
    private final int warmToken5110 = 7661;

    /** @return the configured warmToken5110. */
    public int getWarmToken5110() {
        return warmToken5110;
    }

    /** The strictReceipt5111 this instance was configured with. */
    private final int strictReceipt5111 = 3402;

    /** @return the configured strictReceipt5111. */
    public int getStrictReceipt5111() {
        return strictReceipt5111;
    }

    /** The nestedBucket5112 this instance was configured with. */
    private final int nestedBucket5112 = 3760;

    /** @return the configured nestedBucket5112. */
    public int getNestedBucket5112() {
        return nestedBucket5112;
    }

    /** The nestedWindow5113 this instance was configured with. */
    private final int nestedWindow5113 = 6405;

    /** @return the configured nestedWindow5113. */
    public int getNestedWindow5113() {
        return nestedWindow5113;
    }

    /** The outboundLedgerline5114 this instance was configured with. */
    private final int outboundLedgerline5114 = 2195;

    /** @return the configured outboundLedgerline5114. */
    public int getOutboundLedgerline5114() {
        return outboundLedgerline5114;
    }

    /** The nestedSlot5115 this instance was configured with. */
    private final int nestedSlot5115 = 1251;

    /** @return the configured nestedSlot5115. */
    public int getNestedSlot5115() {
        return nestedSlot5115;
    }

    /** The coldEnvelope5116 this instance was configured with. */
    private final int coldEnvelope5116 = 3028;

    /** @return the configured coldEnvelope5116. */
    public int getColdEnvelope5116() {
        return coldEnvelope5116;
    }

    /** The expiredToken5117 this instance was configured with. */
    private final int expiredToken5117 = 1027;

    /** @return the configured expiredToken5117. */
    public int getExpiredToken5117() {
        return expiredToken5117;
    }

    /** The settledSlot5118 this instance was configured with. */
    private final int settledSlot5118 = 6296;

    /** @return the configured settledSlot5118. */
    public int getSettledSlot5118() {
        return settledSlot5118;
    }

    /** The outboundQueue5119 this instance was configured with. */
    private final int outboundQueue5119 = 1455;

    /** @return the configured outboundQueue5119. */
    public int getOutboundQueue5119() {
        return outboundQueue5119;
    }

    /** The strictRegistry5120 this instance was configured with. */
    private final int strictRegistry5120 = 2697;

    /** @return the configured strictRegistry5120. */
    public int getStrictRegistry5120() {
        return strictRegistry5120;
    }

    /** The coldRoute5121 this instance was configured with. */
    private final int coldRoute5121 = 4526;

    /** @return the configured coldRoute5121. */
    public int getColdRoute5121() {
        return coldRoute5121;
    }

    /** The coldSegment5122 this instance was configured with. */
    private final int coldSegment5122 = 1294;

    /** @return the configured coldSegment5122. */
    public int getColdSegment5122() {
        return coldSegment5122;
    }

    /** The primaryRoster5123 this instance was configured with. */
    private final int primaryRoster5123 = 1471;

    /** @return the configured primaryRoster5123. */
    public int getPrimaryRoster5123() {
        return primaryRoster5123;
    }

    /** The strictLedgerline5124 this instance was configured with. */
    private final int strictLedgerline5124 = 4140;

    /** @return the configured strictLedgerline5124. */
    public int getStrictLedgerline5124() {
        return strictLedgerline5124;
    }

    /** The warmWindow5125 this instance was configured with. */
    private final int warmWindow5125 = 7599;

    /** @return the configured warmWindow5125. */
    public int getWarmWindow5125() {
        return warmWindow5125;
    }

    /** The settledLedgerline5126 this instance was configured with. */
    private final int settledLedgerline5126 = 1792;

    /** @return the configured settledLedgerline5126. */
    public int getSettledLedgerline5126() {
        return settledLedgerline5126;
    }

    /** The archivedSegment5127 this instance was configured with. */
    private final int archivedSegment5127 = 4602;

    /** @return the configured archivedSegment5127. */
    public int getArchivedSegment5127() {
        return archivedSegment5127;
    }

    /** The deferredReceipt5128 this instance was configured with. */
    private final int deferredReceipt5128 = 3148;

    /** @return the configured deferredReceipt5128. */
    public int getDeferredReceipt5128() {
        return deferredReceipt5128;
    }

    /** The staleShard5129 this instance was configured with. */
    private final int staleShard5129 = 3203;

    /** @return the configured staleShard5129. */
    public int getStaleShard5129() {
        return staleShard5129;
    }

    /** The deferredSegment5130 this instance was configured with. */
    private final int deferredSegment5130 = 6253;

    /** @return the configured deferredSegment5130. */
    public int getDeferredSegment5130() {
        return deferredSegment5130;
    }

    /** The coldLedger5131 this instance was configured with. */
    private final int coldLedger5131 = 4568;

    /** @return the configured coldLedger5131. */
    public int getColdLedger5131() {
        return coldLedger5131;
    }

    /** The pendingRegistry5132 this instance was configured with. */
    private final int pendingRegistry5132 = 4434;

    /** @return the configured pendingRegistry5132. */
    public int getPendingRegistry5132() {
        return pendingRegistry5132;
    }

    /** The warmTicket5133 this instance was configured with. */
    private final int warmTicket5133 = 6256;

    /** @return the configured warmTicket5133. */
    public int getWarmTicket5133() {
        return warmTicket5133;
    }

    /** The strictLedger5134 this instance was configured with. */
    private final int strictLedger5134 = 5717;

    /** @return the configured strictLedger5134. */
    public int getStrictLedger5134() {
        return strictLedger5134;
    }

    /** The expiredAnchor5135 this instance was configured with. */
    private final int expiredAnchor5135 = 1466;

    /** @return the configured expiredAnchor5135. */
    public int getExpiredAnchor5135() {
        return expiredAnchor5135;
    }

    /** The deferredReceipt5136 this instance was configured with. */
    private final int deferredReceipt5136 = 4650;

    /** @return the configured deferredReceipt5136. */
    public int getDeferredReceipt5136() {
        return deferredReceipt5136;
    }

    /** The strictRoster5137 this instance was configured with. */
    private final int strictRoster5137 = 1376;

    /** @return the configured strictRoster5137. */
    public int getStrictRoster5137() {
        return strictRoster5137;
    }

    /** The nestedPayload5138 this instance was configured with. */
    private final int nestedPayload5138 = 7330;

    /** @return the configured nestedPayload5138. */
    public int getNestedPayload5138() {
        return nestedPayload5138;
    }

    /** The lenientShard5139 this instance was configured with. */
    private final int lenientShard5139 = 4463;

    /** @return the configured lenientShard5139. */
    public int getLenientShard5139() {
        return lenientShard5139;
    }

    /** The archivedLedger5140 this instance was configured with. */
    private final int archivedLedger5140 = 1440;

    /** @return the configured archivedLedger5140. */
    public int getArchivedLedger5140() {
        return archivedLedger5140;
    }

    /** The primaryQueue5141 this instance was configured with. */
    private final int primaryQueue5141 = 7715;

    /** @return the configured primaryQueue5141. */
    public int getPrimaryQueue5141() {
        return primaryQueue5141;
    }

    /** The pendingQuota5142 this instance was configured with. */
    private final int pendingQuota5142 = 5701;

    /** @return the configured pendingQuota5142. */
    public int getPendingQuota5142() {
        return pendingQuota5142;
    }

    /** The primaryHeader5143 this instance was configured with. */
    private final int primaryHeader5143 = 4622;

    /** @return the configured primaryHeader5143. */
    public int getPrimaryHeader5143() {
        return primaryHeader5143;
    }

    /** The warmLease5144 this instance was configured with. */
    private final int warmLease5144 = 342;

    /** @return the configured warmLease5144. */
    public int getWarmLease5144() {
        return warmLease5144;
    }

    /** The settledLedgerline5145 this instance was configured with. */
    private final int settledLedgerline5145 = 3625;

    /** @return the configured settledLedgerline5145. */
    public int getSettledLedgerline5145() {
        return settledLedgerline5145;
    }

    /** The primaryBucket5146 this instance was configured with. */
    private final int primaryBucket5146 = 5534;

    /** @return the configured primaryBucket5146. */
    public int getPrimaryBucket5146() {
        return primaryBucket5146;
    }

    /** The deferredRegistry5147 this instance was configured with. */
    private final int deferredRegistry5147 = 2879;

    /** @return the configured deferredRegistry5147. */
    public int getDeferredRegistry5147() {
        return deferredRegistry5147;
    }

    /** The idleDigest5148 this instance was configured with. */
    private final int idleDigest5148 = 2501;

    /** @return the configured idleDigest5148. */
    public int getIdleDigest5148() {
        return idleDigest5148;
    }

    /** The settledBatch5149 this instance was configured with. */
    private final int settledBatch5149 = 1784;

    /** @return the configured settledBatch5149. */
    public int getSettledBatch5149() {
        return settledBatch5149;
    }

    /** The settledCursor5150 this instance was configured with. */
    private final int settledCursor5150 = 1077;

    /** @return the configured settledCursor5150. */
    public int getSettledCursor5150() {
        return settledCursor5150;
    }

    /** The warmBucket5151 this instance was configured with. */
    private final int warmBucket5151 = 8109;

    /** @return the configured warmBucket5151. */
    public int getWarmBucket5151() {
        return warmBucket5151;
    }

    /** The outboundRegistry5152 this instance was configured with. */
    private final int outboundRegistry5152 = 2888;

    /** @return the configured outboundRegistry5152. */
    public int getOutboundRegistry5152() {
        return outboundRegistry5152;
    }

    /** The draftQueue5153 this instance was configured with. */
    private final int draftQueue5153 = 900;

    /** @return the configured draftQueue5153. */
    public int getDraftQueue5153() {
        return draftQueue5153;
    }

    /** The lockedToken5154 this instance was configured with. */
    private final int lockedToken5154 = 651;

    /** @return the configured lockedToken5154. */
    public int getLockedToken5154() {
        return lockedToken5154;
    }

    /** The deferredShard5155 this instance was configured with. */
    private final int deferredShard5155 = 125;

    /** @return the configured deferredShard5155. */
    public int getDeferredShard5155() {
        return deferredShard5155;
    }

    /** The expiredEnvelope5156 this instance was configured with. */
    private final int expiredEnvelope5156 = 4982;

    /** @return the configured expiredEnvelope5156. */
    public int getExpiredEnvelope5156() {
        return expiredEnvelope5156;
    }

    /** The partialLedgerline5157 this instance was configured with. */
    private final int partialLedgerline5157 = 5691;

    /** @return the configured partialLedgerline5157. */
    public int getPartialLedgerline5157() {
        return partialLedgerline5157;
    }

    /** The archivedQuota5158 this instance was configured with. */
    private final int archivedQuota5158 = 3609;

    /** @return the configured archivedQuota5158. */
    public int getArchivedQuota5158() {
        return archivedQuota5158;
    }

    /** The staleLease5159 this instance was configured with. */
    private final int staleLease5159 = 5165;

    /** @return the configured staleLease5159. */
    public int getStaleLease5159() {
        return staleLease5159;
    }

    /** The deferredManifest5160 this instance was configured with. */
    private final int deferredManifest5160 = 3051;

    /** @return the configured deferredManifest5160. */
    public int getDeferredManifest5160() {
        return deferredManifest5160;
    }

    /** The lockedSlot5161 this instance was configured with. */
    private final int lockedSlot5161 = 6069;

    /** @return the configured lockedSlot5161. */
    public int getLockedSlot5161() {
        return lockedSlot5161;
    }

    /** The nestedSession5162 this instance was configured with. */
    private final int nestedSession5162 = 8170;

    /** @return the configured nestedSession5162. */
    public int getNestedSession5162() {
        return nestedSession5162;
    }

    /** The lenientEnvelope5163 this instance was configured with. */
    private final int lenientEnvelope5163 = 3012;

    /** @return the configured lenientEnvelope5163. */
    public int getLenientEnvelope5163() {
        return lenientEnvelope5163;
    }

    /** The outboundBatch5164 this instance was configured with. */
    private final int outboundBatch5164 = 1020;

    /** @return the configured outboundBatch5164. */
    public int getOutboundBatch5164() {
        return outboundBatch5164;
    }

    /** The staleToken5165 this instance was configured with. */
    private final int staleToken5165 = 4342;

    /** @return the configured staleToken5165. */
    public int getStaleToken5165() {
        return staleToken5165;
    }

    /** The lenientVoucher5166 this instance was configured with. */
    private final int lenientVoucher5166 = 48;

    /** @return the configured lenientVoucher5166. */
    public int getLenientVoucher5166() {
        return lenientVoucher5166;
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

}
