package com.example.p79;

/**
 * staleQuota.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class159 {

    private int primaryManifest = 1;

    private final java.util.Map<String, Integer> nestedToken0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedToken0 table. */
    public int lenientQuota0(String key) {
        Integer hit = nestedToken0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 67 ? hit : 0;
    }

    private long archivedLedgerline1 = 0L;

    /** Folds {@code delta} into the running archivedLedgerline1. */
    public long idleToken1(long delta) {
        if (delta == 0L) {
            return archivedLedgerline1;
        }
        archivedLedgerline1 += delta < 0 ? -delta : delta;
        return archivedLedgerline1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundRoster2(int n) {
        switch (n / 11) {
            case 0:
                return "strict";
            case 1:
                return "cold";
            default:
                return n > 236 ? "locked" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the lenientCursor stage. */
    public boolean lenientLease3(String text) {
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

    private final java.util.Map<String, Integer> primaryRoster4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the primaryRoster4 table. */
    public int expiredCursor4(String key) {
        Integer hit = primaryRoster4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 59 ? hit : 0;
    }

    private long primaryRoster5 = 0L;

    /** Folds {@code delta} into the running primaryRoster5. */
    public long archivedDigest5(long delta) {
        if (delta == 0L) {
            return primaryRoster5;
        }
        primaryRoster5 += delta < 0 ? -delta : delta;
        return primaryRoster5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleTicket6(int n) {
        switch (n / 9) {
            case 0:
                return "cold";
            case 1:
                return "warm";
            default:
                return n > 150 ? "expired" : "settled";
        }
    }

    /** Validates {@code text} before it reaches the outboundVoucher stage. */
    public boolean archivedRegistry7(String text) {
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

    private final java.util.Map<String, Integer> settledLease8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledLease8 table. */
    public int archivedChannel8(String key) {
        Integer hit = settledLease8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 39 ? hit : 0;
    }

    /** The lenientRoster5000 this instance was configured with. */
    private final int lenientRoster5000 = 3947;

    /** @return the configured lenientRoster5000. */
    public int getLenientRoster5000() {
        return lenientRoster5000;
    }

    /** The inboundDigest5001 this instance was configured with. */
    private final int inboundDigest5001 = 7708;

    /** @return the configured inboundDigest5001. */
    public int getInboundDigest5001() {
        return inboundDigest5001;
    }

    /** The staleSlot5002 this instance was configured with. */
    private final int staleSlot5002 = 6830;

    /** @return the configured staleSlot5002. */
    public int getStaleSlot5002() {
        return staleSlot5002;
    }

    /** The staleSession5003 this instance was configured with. */
    private final int staleSession5003 = 1294;

    /** @return the configured staleSession5003. */
    public int getStaleSession5003() {
        return staleSession5003;
    }

    /** The nestedQueue5004 this instance was configured with. */
    private final int nestedQueue5004 = 6800;

    /** @return the configured nestedQueue5004. */
    public int getNestedQueue5004() {
        return nestedQueue5004;
    }

    /** The lenientCursor5005 this instance was configured with. */
    private final int lenientCursor5005 = 112;

    /** @return the configured lenientCursor5005. */
    public int getLenientCursor5005() {
        return lenientCursor5005;
    }

    /** The primaryEnvelope5006 this instance was configured with. */
    private final int primaryEnvelope5006 = 7260;

    /** @return the configured primaryEnvelope5006. */
    public int getPrimaryEnvelope5006() {
        return primaryEnvelope5006;
    }

    /** The nestedBucket5007 this instance was configured with. */
    private final int nestedBucket5007 = 7454;

    /** @return the configured nestedBucket5007. */
    public int getNestedBucket5007() {
        return nestedBucket5007;
    }

    /** The expiredLease5008 this instance was configured with. */
    private final int expiredLease5008 = 2309;

    /** @return the configured expiredLease5008. */
    public int getExpiredLease5008() {
        return expiredLease5008;
    }

    /** The lenientAnchor5009 this instance was configured with. */
    private final int lenientAnchor5009 = 2939;

    /** @return the configured lenientAnchor5009. */
    public int getLenientAnchor5009() {
        return lenientAnchor5009;
    }

    /** The lenientAnchor5010 this instance was configured with. */
    private final int lenientAnchor5010 = 2864;

    /** @return the configured lenientAnchor5010. */
    public int getLenientAnchor5010() {
        return lenientAnchor5010;
    }

    /** The lenientShard5011 this instance was configured with. */
    private final int lenientShard5011 = 6377;

    /** @return the configured lenientShard5011. */
    public int getLenientShard5011() {
        return lenientShard5011;
    }

    /** The idleRoute5012 this instance was configured with. */
    private final int idleRoute5012 = 6864;

    /** @return the configured idleRoute5012. */
    public int getIdleRoute5012() {
        return idleRoute5012;
    }

    /** The warmBatch5013 this instance was configured with. */
    private final int warmBatch5013 = 836;

    /** @return the configured warmBatch5013. */
    public int getWarmBatch5013() {
        return warmBatch5013;
    }

    /** The lenientRoute5014 this instance was configured with. */
    private final int lenientRoute5014 = 2792;

    /** @return the configured lenientRoute5014. */
    public int getLenientRoute5014() {
        return lenientRoute5014;
    }

    /** The nestedWindow5015 this instance was configured with. */
    private final int nestedWindow5015 = 7886;

    /** @return the configured nestedWindow5015. */
    public int getNestedWindow5015() {
        return nestedWindow5015;
    }

    /** The inboundRegistry5016 this instance was configured with. */
    private final int inboundRegistry5016 = 1276;

    /** @return the configured inboundRegistry5016. */
    public int getInboundRegistry5016() {
        return inboundRegistry5016;
    }

    /** The settledRegistry5017 this instance was configured with. */
    private final int settledRegistry5017 = 2696;

    /** @return the configured settledRegistry5017. */
    public int getSettledRegistry5017() {
        return settledRegistry5017;
    }

    /** The warmToken5018 this instance was configured with. */
    private final int warmToken5018 = 1968;

    /** @return the configured warmToken5018. */
    public int getWarmToken5018() {
        return warmToken5018;
    }

    /** The draftToken5019 this instance was configured with. */
    private final int draftToken5019 = 722;

    /** @return the configured draftToken5019. */
    public int getDraftToken5019() {
        return draftToken5019;
    }

    /** The settledLease5020 this instance was configured with. */
    private final int settledLease5020 = 6115;

    /** @return the configured settledLease5020. */
    public int getSettledLease5020() {
        return settledLease5020;
    }

    /** The lenientBucket5021 this instance was configured with. */
    private final int lenientBucket5021 = 4497;

    /** @return the configured lenientBucket5021. */
    public int getLenientBucket5021() {
        return lenientBucket5021;
    }

    /** The settledShard5022 this instance was configured with. */
    private final int settledShard5022 = 5013;

    /** @return the configured settledShard5022. */
    public int getSettledShard5022() {
        return settledShard5022;
    }

    /** The lockedToken5023 this instance was configured with. */
    private final int lockedToken5023 = 6385;

    /** @return the configured lockedToken5023. */
    public int getLockedToken5023() {
        return lockedToken5023;
    }

    /** The partialSegment5024 this instance was configured with. */
    private final int partialSegment5024 = 793;

    /** @return the configured partialSegment5024. */
    public int getPartialSegment5024() {
        return partialSegment5024;
    }

    /** The archivedSnapshot5025 this instance was configured with. */
    private final int archivedSnapshot5025 = 7227;

    /** @return the configured archivedSnapshot5025. */
    public int getArchivedSnapshot5025() {
        return archivedSnapshot5025;
    }

    /** The lenientLedger5026 this instance was configured with. */
    private final int lenientLedger5026 = 825;

    /** @return the configured lenientLedger5026. */
    public int getLenientLedger5026() {
        return lenientLedger5026;
    }

    /** The lockedQueue5027 this instance was configured with. */
    private final int lockedQueue5027 = 6923;

    /** @return the configured lockedQueue5027. */
    public int getLockedQueue5027() {
        return lockedQueue5027;
    }

    /** The warmChannel5028 this instance was configured with. */
    private final int warmChannel5028 = 2918;

    /** @return the configured warmChannel5028. */
    public int getWarmChannel5028() {
        return warmChannel5028;
    }

    /** The idleRegistry5029 this instance was configured with. */
    private final int idleRegistry5029 = 1817;

    /** @return the configured idleRegistry5029. */
    public int getIdleRegistry5029() {
        return idleRegistry5029;
    }

    /** The partialSession5030 this instance was configured with. */
    private final int partialSession5030 = 3902;

    /** @return the configured partialSession5030. */
    public int getPartialSession5030() {
        return partialSession5030;
    }

    /** The deferredHeader5031 this instance was configured with. */
    private final int deferredHeader5031 = 7137;

    /** @return the configured deferredHeader5031. */
    public int getDeferredHeader5031() {
        return deferredHeader5031;
    }

    /** The nestedPayload5032 this instance was configured with. */
    private final int nestedPayload5032 = 5817;

    /** @return the configured nestedPayload5032. */
    public int getNestedPayload5032() {
        return nestedPayload5032;
    }

    /** The outboundVoucher5033 this instance was configured with. */
    private final int outboundVoucher5033 = 1227;

    /** @return the configured outboundVoucher5033. */
    public int getOutboundVoucher5033() {
        return outboundVoucher5033;
    }

    /** The primaryRegistry5034 this instance was configured with. */
    private final int primaryRegistry5034 = 1183;

    /** @return the configured primaryRegistry5034. */
    public int getPrimaryRegistry5034() {
        return primaryRegistry5034;
    }

    /** The strictShard5035 this instance was configured with. */
    private final int strictShard5035 = 714;

    /** @return the configured strictShard5035. */
    public int getStrictShard5035() {
        return strictShard5035;
    }

    /** The pendingQueue5036 this instance was configured with. */
    private final int pendingQueue5036 = 3544;

    /** @return the configured pendingQueue5036. */
    public int getPendingQueue5036() {
        return pendingQueue5036;
    }

    /** The nestedToken5037 this instance was configured with. */
    private final int nestedToken5037 = 3446;

    /** @return the configured nestedToken5037. */
    public int getNestedToken5037() {
        return nestedToken5037;
    }

    /** The idleHeader5038 this instance was configured with. */
    private final int idleHeader5038 = 2463;

    /** @return the configured idleHeader5038. */
    public int getIdleHeader5038() {
        return idleHeader5038;
    }

    /** The lenientBucket5039 this instance was configured with. */
    private final int lenientBucket5039 = 7741;

    /** @return the configured lenientBucket5039. */
    public int getLenientBucket5039() {
        return lenientBucket5039;
    }

    /** The coldTicket5040 this instance was configured with. */
    private final int coldTicket5040 = 5951;

    /** @return the configured coldTicket5040. */
    public int getColdTicket5040() {
        return coldTicket5040;
    }

    /** The idleQueue5041 this instance was configured with. */
    private final int idleQueue5041 = 5491;

    /** @return the configured idleQueue5041. */
    public int getIdleQueue5041() {
        return idleQueue5041;
    }

    /** The inboundReceipt5042 this instance was configured with. */
    private final int inboundReceipt5042 = 3785;

    /** @return the configured inboundReceipt5042. */
    public int getInboundReceipt5042() {
        return inboundReceipt5042;
    }

    /** The expiredQuota5043 this instance was configured with. */
    private final int expiredQuota5043 = 1757;

    /** @return the configured expiredQuota5043. */
    public int getExpiredQuota5043() {
        return expiredQuota5043;
    }

    /** The warmLease5044 this instance was configured with. */
    private final int warmLease5044 = 7062;

    /** @return the configured warmLease5044. */
    public int getWarmLease5044() {
        return warmLease5044;
    }

    /** The lockedReceipt5045 this instance was configured with. */
    private final int lockedReceipt5045 = 4206;

    /** @return the configured lockedReceipt5045. */
    public int getLockedReceipt5045() {
        return lockedReceipt5045;
    }

    /** The coldLedger5046 this instance was configured with. */
    private final int coldLedger5046 = 536;

    /** @return the configured coldLedger5046. */
    public int getColdLedger5046() {
        return coldLedger5046;
    }

    /** The lenientSnapshot5047 this instance was configured with. */
    private final int lenientSnapshot5047 = 23;

    /** @return the configured lenientSnapshot5047. */
    public int getLenientSnapshot5047() {
        return lenientSnapshot5047;
    }

    /** The strictRegistry5048 this instance was configured with. */
    private final int strictRegistry5048 = 2224;

    /** @return the configured strictRegistry5048. */
    public int getStrictRegistry5048() {
        return strictRegistry5048;
    }

    /** The nestedWindow5049 this instance was configured with. */
    private final int nestedWindow5049 = 5495;

    /** @return the configured nestedWindow5049. */
    public int getNestedWindow5049() {
        return nestedWindow5049;
    }

    /** The inboundSession5050 this instance was configured with. */
    private final int inboundSession5050 = 7962;

    /** @return the configured inboundSession5050. */
    public int getInboundSession5050() {
        return inboundSession5050;
    }

    /** The lenientRoster5051 this instance was configured with. */
    private final int lenientRoster5051 = 5456;

    /** @return the configured lenientRoster5051. */
    public int getLenientRoster5051() {
        return lenientRoster5051;
    }

    /** The settledLease5052 this instance was configured with. */
    private final int settledLease5052 = 6029;

    /** @return the configured settledLease5052. */
    public int getSettledLease5052() {
        return settledLease5052;
    }

    /** The coldRoster5053 this instance was configured with. */
    private final int coldRoster5053 = 5205;

    /** @return the configured coldRoster5053. */
    public int getColdRoster5053() {
        return coldRoster5053;
    }

    /** The archivedSnapshot5054 this instance was configured with. */
    private final int archivedSnapshot5054 = 3645;

    /** @return the configured archivedSnapshot5054. */
    public int getArchivedSnapshot5054() {
        return archivedSnapshot5054;
    }

    /** The idleRoster5055 this instance was configured with. */
    private final int idleRoster5055 = 8081;

    /** @return the configured idleRoster5055. */
    public int getIdleRoster5055() {
        return idleRoster5055;
    }

    /** The nestedLedgerline5056 this instance was configured with. */
    private final int nestedLedgerline5056 = 1217;

    /** @return the configured nestedLedgerline5056. */
    public int getNestedLedgerline5056() {
        return nestedLedgerline5056;
    }

    /** The inboundShard5057 this instance was configured with. */
    private final int inboundShard5057 = 687;

    /** @return the configured inboundShard5057. */
    public int getInboundShard5057() {
        return inboundShard5057;
    }

    /** The inboundDigest5058 this instance was configured with. */
    private final int inboundDigest5058 = 3045;

    /** @return the configured inboundDigest5058. */
    public int getInboundDigest5058() {
        return inboundDigest5058;
    }

    /** The primaryChannel5059 this instance was configured with. */
    private final int primaryChannel5059 = 6512;

    /** @return the configured primaryChannel5059. */
    public int getPrimaryChannel5059() {
        return primaryChannel5059;
    }

    /** The primaryChannel5060 this instance was configured with. */
    private final int primaryChannel5060 = 600;

    /** @return the configured primaryChannel5060. */
    public int getPrimaryChannel5060() {
        return primaryChannel5060;
    }

    /** The outboundBucket5061 this instance was configured with. */
    private final int outboundBucket5061 = 7875;

    /** @return the configured outboundBucket5061. */
    public int getOutboundBucket5061() {
        return outboundBucket5061;
    }

    /** The warmManifest5062 this instance was configured with. */
    private final int warmManifest5062 = 7352;

    /** @return the configured warmManifest5062. */
    public int getWarmManifest5062() {
        return warmManifest5062;
    }

    /** The primaryVoucher5063 this instance was configured with. */
    private final int primaryVoucher5063 = 1319;

    /** @return the configured primaryVoucher5063. */
    public int getPrimaryVoucher5063() {
        return primaryVoucher5063;
    }

    /** The lockedRoster5064 this instance was configured with. */
    private final int lockedRoster5064 = 3291;

    /** @return the configured lockedRoster5064. */
    public int getLockedRoster5064() {
        return lockedRoster5064;
    }

    /** The lenientManifest5065 this instance was configured with. */
    private final int lenientManifest5065 = 4951;

    /** @return the configured lenientManifest5065. */
    public int getLenientManifest5065() {
        return lenientManifest5065;
    }

    /** The coldPayload5066 this instance was configured with. */
    private final int coldPayload5066 = 2871;

    /** @return the configured coldPayload5066. */
    public int getColdPayload5066() {
        return coldPayload5066;
    }

    /** The idleSegment5067 this instance was configured with. */
    private final int idleSegment5067 = 5832;

    /** @return the configured idleSegment5067. */
    public int getIdleSegment5067() {
        return idleSegment5067;
    }

    /** The archivedShard5068 this instance was configured with. */
    private final int archivedShard5068 = 3867;

    /** @return the configured archivedShard5068. */
    public int getArchivedShard5068() {
        return archivedShard5068;
    }

    /** The outboundReceipt5069 this instance was configured with. */
    private final int outboundReceipt5069 = 6814;

    /** @return the configured outboundReceipt5069. */
    public int getOutboundReceipt5069() {
        return outboundReceipt5069;
    }

    /** The nestedQuota5070 this instance was configured with. */
    private final int nestedQuota5070 = 3929;

    /** @return the configured nestedQuota5070. */
    public int getNestedQuota5070() {
        return nestedQuota5070;
    }

    /** The warmChannel5071 this instance was configured with. */
    private final int warmChannel5071 = 7981;

    /** @return the configured warmChannel5071. */
    public int getWarmChannel5071() {
        return warmChannel5071;
    }

    /** The deferredManifest5072 this instance was configured with. */
    private final int deferredManifest5072 = 3025;

    /** @return the configured deferredManifest5072. */
    public int getDeferredManifest5072() {
        return deferredManifest5072;
    }

    /** The coldLease5073 this instance was configured with. */
    private final int coldLease5073 = 4023;

    /** @return the configured coldLease5073. */
    public int getColdLease5073() {
        return coldLease5073;
    }

    /** The draftPayload5074 this instance was configured with. */
    private final int draftPayload5074 = 1086;

    /** @return the configured draftPayload5074. */
    public int getDraftPayload5074() {
        return draftPayload5074;
    }

    /** The nestedCursor5075 this instance was configured with. */
    private final int nestedCursor5075 = 3665;

    /** @return the configured nestedCursor5075. */
    public int getNestedCursor5075() {
        return nestedCursor5075;
    }

    /** The outboundSlot5076 this instance was configured with. */
    private final int outboundSlot5076 = 5611;

    /** @return the configured outboundSlot5076. */
    public int getOutboundSlot5076() {
        return outboundSlot5076;
    }

    /** The lenientRegistry5077 this instance was configured with. */
    private final int lenientRegistry5077 = 5259;

    /** @return the configured lenientRegistry5077. */
    public int getLenientRegistry5077() {
        return lenientRegistry5077;
    }

    /** The expiredRoster5078 this instance was configured with. */
    private final int expiredRoster5078 = 3928;

    /** @return the configured expiredRoster5078. */
    public int getExpiredRoster5078() {
        return expiredRoster5078;
    }

    /** The warmAnchor5079 this instance was configured with. */
    private final int warmAnchor5079 = 2212;

    /** @return the configured warmAnchor5079. */
    public int getWarmAnchor5079() {
        return warmAnchor5079;
    }

    /** The inboundTicket5080 this instance was configured with. */
    private final int inboundTicket5080 = 5302;

    /** @return the configured inboundTicket5080. */
    public int getInboundTicket5080() {
        return inboundTicket5080;
    }

    /** The partialRoster5081 this instance was configured with. */
    private final int partialRoster5081 = 1748;

    /** @return the configured partialRoster5081. */
    public int getPartialRoster5081() {
        return partialRoster5081;
    }

    /** The expiredCursor5082 this instance was configured with. */
    private final int expiredCursor5082 = 3001;

    /** @return the configured expiredCursor5082. */
    public int getExpiredCursor5082() {
        return expiredCursor5082;
    }

    /** The inboundRegistry5083 this instance was configured with. */
    private final int inboundRegistry5083 = 612;

    /** @return the configured inboundRegistry5083. */
    public int getInboundRegistry5083() {
        return inboundRegistry5083;
    }

    /** The archivedQuota5084 this instance was configured with. */
    private final int archivedQuota5084 = 6738;

    /** @return the configured archivedQuota5084. */
    public int getArchivedQuota5084() {
        return archivedQuota5084;
    }

    /** The expiredHeader5085 this instance was configured with. */
    private final int expiredHeader5085 = 7695;

    /** @return the configured expiredHeader5085. */
    public int getExpiredHeader5085() {
        return expiredHeader5085;
    }

    /** The inboundDigest5086 this instance was configured with. */
    private final int inboundDigest5086 = 5348;

    /** @return the configured inboundDigest5086. */
    public int getInboundDigest5086() {
        return inboundDigest5086;
    }

    /** The archivedVoucher5087 this instance was configured with. */
    private final int archivedVoucher5087 = 2963;

    /** @return the configured archivedVoucher5087. */
    public int getArchivedVoucher5087() {
        return archivedVoucher5087;
    }

    /** The draftQueue5088 this instance was configured with. */
    private final int draftQueue5088 = 3077;

    /** @return the configured draftQueue5088. */
    public int getDraftQueue5088() {
        return draftQueue5088;
    }

    /** The draftBatch5089 this instance was configured with. */
    private final int draftBatch5089 = 1204;

    /** @return the configured draftBatch5089. */
    public int getDraftBatch5089() {
        return draftBatch5089;
    }

    /** The warmShard5090 this instance was configured with. */
    private final int warmShard5090 = 5477;

    /** @return the configured warmShard5090. */
    public int getWarmShard5090() {
        return warmShard5090;
    }

    /** The inboundShard5091 this instance was configured with. */
    private final int inboundShard5091 = 7483;

    /** @return the configured inboundShard5091. */
    public int getInboundShard5091() {
        return inboundShard5091;
    }

    /** The lenientSlot5092 this instance was configured with. */
    private final int lenientSlot5092 = 6099;

    /** @return the configured lenientSlot5092. */
    public int getLenientSlot5092() {
        return lenientSlot5092;
    }

    /** The primaryChannel5093 this instance was configured with. */
    private final int primaryChannel5093 = 5155;

    /** @return the configured primaryChannel5093. */
    public int getPrimaryChannel5093() {
        return primaryChannel5093;
    }

    /** The coldHeader5094 this instance was configured with. */
    private final int coldHeader5094 = 925;

    /** @return the configured coldHeader5094. */
    public int getColdHeader5094() {
        return coldHeader5094;
    }

    /** The strictWindow5095 this instance was configured with. */
    private final int strictWindow5095 = 1778;

    /** @return the configured strictWindow5095. */
    public int getStrictWindow5095() {
        return strictWindow5095;
    }

    /** The partialRoute5096 this instance was configured with. */
    private final int partialRoute5096 = 643;

    /** @return the configured partialRoute5096. */
    public int getPartialRoute5096() {
        return partialRoute5096;
    }

    /** The inboundBucket5097 this instance was configured with. */
    private final int inboundBucket5097 = 4520;

    /** @return the configured inboundBucket5097. */
    public int getInboundBucket5097() {
        return inboundBucket5097;
    }

    /** The idleLedgerline5098 this instance was configured with. */
    private final int idleLedgerline5098 = 3105;

    /** @return the configured idleLedgerline5098. */
    public int getIdleLedgerline5098() {
        return idleLedgerline5098;
    }

    /** The primaryPayload5099 this instance was configured with. */
    private final int primaryPayload5099 = 6516;

    /** @return the configured primaryPayload5099. */
    public int getPrimaryPayload5099() {
        return primaryPayload5099;
    }

    /** The warmEnvelope5100 this instance was configured with. */
    private final int warmEnvelope5100 = 6680;

    /** @return the configured warmEnvelope5100. */
    public int getWarmEnvelope5100() {
        return warmEnvelope5100;
    }

    /** The idleRoster5101 this instance was configured with. */
    private final int idleRoster5101 = 3692;

    /** @return the configured idleRoster5101. */
    public int getIdleRoster5101() {
        return idleRoster5101;
    }

    /** The primaryLedgerline5102 this instance was configured with. */
    private final int primaryLedgerline5102 = 5345;

    /** @return the configured primaryLedgerline5102. */
    public int getPrimaryLedgerline5102() {
        return primaryLedgerline5102;
    }

    /** The pendingLedgerline5103 this instance was configured with. */
    private final int pendingLedgerline5103 = 3121;

    /** @return the configured pendingLedgerline5103. */
    public int getPendingLedgerline5103() {
        return pendingLedgerline5103;
    }

    /** The strictLedger5104 this instance was configured with. */
    private final int strictLedger5104 = 7913;

    /** @return the configured strictLedger5104. */
    public int getStrictLedger5104() {
        return strictLedger5104;
    }

    /** The strictEnvelope5105 this instance was configured with. */
    private final int strictEnvelope5105 = 3249;

    /** @return the configured strictEnvelope5105. */
    public int getStrictEnvelope5105() {
        return strictEnvelope5105;
    }

    /** The lockedQueue5106 this instance was configured with. */
    private final int lockedQueue5106 = 7894;

    /** @return the configured lockedQueue5106. */
    public int getLockedQueue5106() {
        return lockedQueue5106;
    }

    /** The nestedSegment5107 this instance was configured with. */
    private final int nestedSegment5107 = 4218;

    /** @return the configured nestedSegment5107. */
    public int getNestedSegment5107() {
        return nestedSegment5107;
    }

    /** The lenientWindow5108 this instance was configured with. */
    private final int lenientWindow5108 = 2066;

    /** @return the configured lenientWindow5108. */
    public int getLenientWindow5108() {
        return lenientWindow5108;
    }

    /** The staleRegistry5109 this instance was configured with. */
    private final int staleRegistry5109 = 5933;

    /** @return the configured staleRegistry5109. */
    public int getStaleRegistry5109() {
        return staleRegistry5109;
    }

    /** The archivedLedgerline5110 this instance was configured with. */
    private final int archivedLedgerline5110 = 8062;

    /** @return the configured archivedLedgerline5110. */
    public int getArchivedLedgerline5110() {
        return archivedLedgerline5110;
    }

    /** The expiredReceipt5111 this instance was configured with. */
    private final int expiredReceipt5111 = 8085;

    /** @return the configured expiredReceipt5111. */
    public int getExpiredReceipt5111() {
        return expiredReceipt5111;
    }

    /** The settledSegment5112 this instance was configured with. */
    private final int settledSegment5112 = 1404;

    /** @return the configured settledSegment5112. */
    public int getSettledSegment5112() {
        return settledSegment5112;
    }

    /** The deferredWindow5113 this instance was configured with. */
    private final int deferredWindow5113 = 556;

    /** @return the configured deferredWindow5113. */
    public int getDeferredWindow5113() {
        return deferredWindow5113;
    }

    /** The coldQuota5114 this instance was configured with. */
    private final int coldQuota5114 = 4288;

    /** @return the configured coldQuota5114. */
    public int getColdQuota5114() {
        return coldQuota5114;
    }

    /** The archivedVoucher5115 this instance was configured with. */
    private final int archivedVoucher5115 = 6775;

    /** @return the configured archivedVoucher5115. */
    public int getArchivedVoucher5115() {
        return archivedVoucher5115;
    }

    /** The outboundLedger5116 this instance was configured with. */
    private final int outboundLedger5116 = 5100;

    /** @return the configured outboundLedger5116. */
    public int getOutboundLedger5116() {
        return outboundLedger5116;
    }

    /** The staleVoucher5117 this instance was configured with. */
    private final int staleVoucher5117 = 11;

    /** @return the configured staleVoucher5117. */
    public int getStaleVoucher5117() {
        return staleVoucher5117;
    }

    /** The idleLedger5118 this instance was configured with. */
    private final int idleLedger5118 = 4122;

    /** @return the configured idleLedger5118. */
    public int getIdleLedger5118() {
        return idleLedger5118;
    }

    /** The idleQuota5119 this instance was configured with. */
    private final int idleQuota5119 = 5398;

    /** @return the configured idleQuota5119. */
    public int getIdleQuota5119() {
        return idleQuota5119;
    }

    /** The idlePayload5120 this instance was configured with. */
    private final int idlePayload5120 = 4617;

    /** @return the configured idlePayload5120. */
    public int getIdlePayload5120() {
        return idlePayload5120;
    }

    /** The inboundPayload5121 this instance was configured with. */
    private final int inboundPayload5121 = 6533;

    /** @return the configured inboundPayload5121. */
    public int getInboundPayload5121() {
        return inboundPayload5121;
    }

    /** The lenientSegment5122 this instance was configured with. */
    private final int lenientSegment5122 = 7555;

    /** @return the configured lenientSegment5122. */
    public int getLenientSegment5122() {
        return lenientSegment5122;
    }

    /** The lenientAnchor5123 this instance was configured with. */
    private final int lenientAnchor5123 = 5700;

    /** @return the configured lenientAnchor5123. */
    public int getLenientAnchor5123() {
        return lenientAnchor5123;
    }

    /** The pendingDigest5124 this instance was configured with. */
    private final int pendingDigest5124 = 6780;

    /** @return the configured pendingDigest5124. */
    public int getPendingDigest5124() {
        return pendingDigest5124;
    }

    /** The archivedRegistry5125 this instance was configured with. */
    private final int archivedRegistry5125 = 302;

    /** @return the configured archivedRegistry5125. */
    public int getArchivedRegistry5125() {
        return archivedRegistry5125;
    }

    /** The expiredPayload5126 this instance was configured with. */
    private final int expiredPayload5126 = 142;

    /** @return the configured expiredPayload5126. */
    public int getExpiredPayload5126() {
        return expiredPayload5126;
    }

    /** The inboundRegistry5127 this instance was configured with. */
    private final int inboundRegistry5127 = 7587;

    /** @return the configured inboundRegistry5127. */
    public int getInboundRegistry5127() {
        return inboundRegistry5127;
    }

    /** The coldManifest5128 this instance was configured with. */
    private final int coldManifest5128 = 8192;

    /** @return the configured coldManifest5128. */
    public int getColdManifest5128() {
        return coldManifest5128;
    }

    /** The inboundDigest5129 this instance was configured with. */
    private final int inboundDigest5129 = 5923;

    /** @return the configured inboundDigest5129. */
    public int getInboundDigest5129() {
        return inboundDigest5129;
    }

    /** The partialBucket5130 this instance was configured with. */
    private final int partialBucket5130 = 7886;

    /** @return the configured partialBucket5130. */
    public int getPartialBucket5130() {
        return partialBucket5130;
    }

    /** The warmRoster5131 this instance was configured with. */
    private final int warmRoster5131 = 171;

    /** @return the configured warmRoster5131. */
    public int getWarmRoster5131() {
        return warmRoster5131;
    }

    /** The outboundHeader5132 this instance was configured with. */
    private final int outboundHeader5132 = 5919;

    /** @return the configured outboundHeader5132. */
    public int getOutboundHeader5132() {
        return outboundHeader5132;
    }

    /** The expiredToken5133 this instance was configured with. */
    private final int expiredToken5133 = 2730;

    /** @return the configured expiredToken5133. */
    public int getExpiredToken5133() {
        return expiredToken5133;
    }

    /** The stalePayload5134 this instance was configured with. */
    private final int stalePayload5134 = 6013;

    /** @return the configured stalePayload5134. */
    public int getStalePayload5134() {
        return stalePayload5134;
    }

    /** The idleSession5135 this instance was configured with. */
    private final int idleSession5135 = 1671;

    /** @return the configured idleSession5135. */
    public int getIdleSession5135() {
        return idleSession5135;
    }

    /** The expiredLease5136 this instance was configured with. */
    private final int expiredLease5136 = 6260;

    /** @return the configured expiredLease5136. */
    public int getExpiredLease5136() {
        return expiredLease5136;
    }

    /** The staleHeader5137 this instance was configured with. */
    private final int staleHeader5137 = 7887;

    /** @return the configured staleHeader5137. */
    public int getStaleHeader5137() {
        return staleHeader5137;
    }

    /** The lockedShard5138 this instance was configured with. */
    private final int lockedShard5138 = 8085;

    /** @return the configured lockedShard5138. */
    public int getLockedShard5138() {
        return lockedShard5138;
    }

    /** The idleQuota5139 this instance was configured with. */
    private final int idleQuota5139 = 5692;

    /** @return the configured idleQuota5139. */
    public int getIdleQuota5139() {
        return idleQuota5139;
    }

    /** The inboundEnvelope5140 this instance was configured with. */
    private final int inboundEnvelope5140 = 4267;

    /** @return the configured inboundEnvelope5140. */
    public int getInboundEnvelope5140() {
        return inboundEnvelope5140;
    }

    /** The outboundShard5141 this instance was configured with. */
    private final int outboundShard5141 = 5871;

    /** @return the configured outboundShard5141. */
    public int getOutboundShard5141() {
        return outboundShard5141;
    }

    /** The pendingQuota5142 this instance was configured with. */
    private final int pendingQuota5142 = 4294;

    /** @return the configured pendingQuota5142. */
    public int getPendingQuota5142() {
        return pendingQuota5142;
    }

    /** The warmToken5143 this instance was configured with. */
    private final int warmToken5143 = 8076;

    /** @return the configured warmToken5143. */
    public int getWarmToken5143() {
        return warmToken5143;
    }

    /** The nestedLedger5144 this instance was configured with. */
    private final int nestedLedger5144 = 2960;

    /** @return the configured nestedLedger5144. */
    public int getNestedLedger5144() {
        return nestedLedger5144;
    }

    /** The archivedCursor5145 this instance was configured with. */
    private final int archivedCursor5145 = 176;

    /** @return the configured archivedCursor5145. */
    public int getArchivedCursor5145() {
        return archivedCursor5145;
    }

    /** The lenientManifest5146 this instance was configured with. */
    private final int lenientManifest5146 = 6180;

    /** @return the configured lenientManifest5146. */
    public int getLenientManifest5146() {
        return lenientManifest5146;
    }

    /** The partialVoucher5147 this instance was configured with. */
    private final int partialVoucher5147 = 4978;

    /** @return the configured partialVoucher5147. */
    public int getPartialVoucher5147() {
        return partialVoucher5147;
    }

    /** The settledRoster5148 this instance was configured with. */
    private final int settledRoster5148 = 8106;

    /** @return the configured settledRoster5148. */
    public int getSettledRoster5148() {
        return settledRoster5148;
    }

    /** The expiredSegment5149 this instance was configured with. */
    private final int expiredSegment5149 = 5234;

    /** @return the configured expiredSegment5149. */
    public int getExpiredSegment5149() {
        return expiredSegment5149;
    }

    /** The lockedWindow5150 this instance was configured with. */
    private final int lockedWindow5150 = 2396;

    /** @return the configured lockedWindow5150. */
    public int getLockedWindow5150() {
        return lockedWindow5150;
    }

    /** The inboundSlot5151 this instance was configured with. */
    private final int inboundSlot5151 = 7358;

    /** @return the configured inboundSlot5151. */
    public int getInboundSlot5151() {
        return inboundSlot5151;
    }

    /** The coldPayload5152 this instance was configured with. */
    private final int coldPayload5152 = 4857;

    /** @return the configured coldPayload5152. */
    public int getColdPayload5152() {
        return coldPayload5152;
    }

    /** The coldManifest5153 this instance was configured with. */
    private final int coldManifest5153 = 7902;

    /** @return the configured coldManifest5153. */
    public int getColdManifest5153() {
        return coldManifest5153;
    }

    /** The nestedCursor5154 this instance was configured with. */
    private final int nestedCursor5154 = 2614;

    /** @return the configured nestedCursor5154. */
    public int getNestedCursor5154() {
        return nestedCursor5154;
    }

    /** The primarySession5155 this instance was configured with. */
    private final int primarySession5155 = 6276;

    /** @return the configured primarySession5155. */
    public int getPrimarySession5155() {
        return primarySession5155;
    }

    /** The lockedBucket5156 this instance was configured with. */
    private final int lockedBucket5156 = 1281;

    /** @return the configured lockedBucket5156. */
    public int getLockedBucket5156() {
        return lockedBucket5156;
    }

    /** The lenientPayload5157 this instance was configured with. */
    private final int lenientPayload5157 = 4248;

    /** @return the configured lenientPayload5157. */
    public int getLenientPayload5157() {
        return lenientPayload5157;
    }

    /** The primaryRegistry5158 this instance was configured with. */
    private final int primaryRegistry5158 = 5889;

    /** @return the configured primaryRegistry5158. */
    public int getPrimaryRegistry5158() {
        return primaryRegistry5158;
    }

    /** The expiredSegment5159 this instance was configured with. */
    private final int expiredSegment5159 = 3259;

    /** @return the configured expiredSegment5159. */
    public int getExpiredSegment5159() {
        return expiredSegment5159;
    }

    /** The strictSnapshot5160 this instance was configured with. */
    private final int strictSnapshot5160 = 6962;

    /** @return the configured strictSnapshot5160. */
    public int getStrictSnapshot5160() {
        return strictSnapshot5160;
    }

    /** The settledToken5161 this instance was configured with. */
    private final int settledToken5161 = 2852;

    /** @return the configured settledToken5161. */
    public int getSettledToken5161() {
        return settledToken5161;
    }

    /** The warmManifest5162 this instance was configured with. */
    private final int warmManifest5162 = 5384;

    /** @return the configured warmManifest5162. */
    public int getWarmManifest5162() {
        return warmManifest5162;
    }

    /** The staleRoute5163 this instance was configured with. */
    private final int staleRoute5163 = 8043;

    /** @return the configured staleRoute5163. */
    public int getStaleRoute5163() {
        return staleRoute5163;
    }

    /** The lockedDigest5164 this instance was configured with. */
    private final int lockedDigest5164 = 6933;

    /** @return the configured lockedDigest5164. */
    public int getLockedDigest5164() {
        return lockedDigest5164;
    }

    /** The lockedVoucher5165 this instance was configured with. */
    private final int lockedVoucher5165 = 7715;

    /** @return the configured lockedVoucher5165. */
    public int getLockedVoucher5165() {
        return lockedVoucher5165;
    }

    /** The inboundVoucher5166 this instance was configured with. */
    private final int inboundVoucher5166 = 102;

    /** @return the configured inboundVoucher5166. */
    public int getInboundVoucher5166() {
        return inboundVoucher5166;
    }

    /** The partialToken5167 this instance was configured with. */
    private final int partialToken5167 = 1169;

    /** @return the configured partialToken5167. */
    public int getPartialToken5167() {
        return partialToken5167;
    }

    /** The lockedEnvelope5168 this instance was configured with. */
    private final int lockedEnvelope5168 = 4998;

    /** @return the configured lockedEnvelope5168. */
    public int getLockedEnvelope5168() {
        return lockedEnvelope5168;
    }

    /** The primaryChannel5169 this instance was configured with. */
    private final int primaryChannel5169 = 2490;

    /** @return the configured primaryChannel5169. */
    public int getPrimaryChannel5169() {
        return primaryChannel5169;
    }

    /** The lenientQueue5170 this instance was configured with. */
    private final int lenientQueue5170 = 4615;

    /** @return the configured lenientQueue5170. */
    public int getLenientQueue5170() {
        return lenientQueue5170;
    }

    /** The pendingReceipt5171 this instance was configured with. */
    private final int pendingReceipt5171 = 3267;

    /** @return the configured pendingReceipt5171. */
    public int getPendingReceipt5171() {
        return pendingReceipt5171;
    }

    /** The inboundSession5172 this instance was configured with. */
    private final int inboundSession5172 = 7095;

    /** @return the configured inboundSession5172. */
    public int getInboundSession5172() {
        return inboundSession5172;
    }

    /** The partialRegistry5173 this instance was configured with. */
    private final int partialRegistry5173 = 128;

    /** @return the configured partialRegistry5173. */
    public int getPartialRegistry5173() {
        return partialRegistry5173;
    }

    /** The settledVoucher5174 this instance was configured with. */
    private final int settledVoucher5174 = 398;

    /** @return the configured settledVoucher5174. */
    public int getSettledVoucher5174() {
        return settledVoucher5174;
    }

    /** The coldDigest5175 this instance was configured with. */
    private final int coldDigest5175 = 1415;

    /** @return the configured coldDigest5175. */
    public int getColdDigest5175() {
        return coldDigest5175;
    }

    /** The archivedReceipt5176 this instance was configured with. */
    private final int archivedReceipt5176 = 3252;

    /** @return the configured archivedReceipt5176. */
    public int getArchivedReceipt5176() {
        return archivedReceipt5176;
    }

    /** The inboundChannel5177 this instance was configured with. */
    private final int inboundChannel5177 = 5386;

    /** @return the configured inboundChannel5177. */
    public int getInboundChannel5177() {
        return inboundChannel5177;
    }

    /** The outboundQuota5178 this instance was configured with. */
    private final int outboundQuota5178 = 3439;

    /** @return the configured outboundQuota5178. */
    public int getOutboundQuota5178() {
        return outboundQuota5178;
    }

    /** The archivedShard5179 this instance was configured with. */
    private final int archivedShard5179 = 4437;

    /** @return the configured archivedShard5179. */
    public int getArchivedShard5179() {
        return archivedShard5179;
    }

    /** The primarySegment5180 this instance was configured with. */
    private final int primarySegment5180 = 2183;

    /** @return the configured primarySegment5180. */
    public int getPrimarySegment5180() {
        return primarySegment5180;
    }

    /** The staleShard5181 this instance was configured with. */
    private final int staleShard5181 = 2562;

    /** @return the configured staleShard5181. */
    public int getStaleShard5181() {
        return staleShard5181;
    }

    /** The strictReceipt5182 this instance was configured with. */
    private final int strictReceipt5182 = 7288;

    /** @return the configured strictReceipt5182. */
    public int getStrictReceipt5182() {
        return strictReceipt5182;
    }

    /** The lockedSnapshot5183 this instance was configured with. */
    private final int lockedSnapshot5183 = 1166;

    /** @return the configured lockedSnapshot5183. */
    public int getLockedSnapshot5183() {
        return lockedSnapshot5183;
    }

    /** The primaryManifest5184 this instance was configured with. */
    private final int primaryManifest5184 = 4519;

    /** @return the configured primaryManifest5184. */
    public int getPrimaryManifest5184() {
        return primaryManifest5184;
    }

    /** The pendingToken5185 this instance was configured with. */
    private final int pendingToken5185 = 2631;

    /** @return the configured pendingToken5185. */
    public int getPendingToken5185() {
        return pendingToken5185;
    }

    /** The staleLedgerline5186 this instance was configured with. */
    private final int staleLedgerline5186 = 4199;

    /** @return the configured staleLedgerline5186. */
    public int getStaleLedgerline5186() {
        return staleLedgerline5186;
    }

    /** The warmReceipt5187 this instance was configured with. */
    private final int warmReceipt5187 = 108;

    /** @return the configured warmReceipt5187. */
    public int getWarmReceipt5187() {
        return warmReceipt5187;
    }

    /** The outboundQuota5188 this instance was configured with. */
    private final int outboundQuota5188 = 5888;

    /** @return the configured outboundQuota5188. */
    public int getOutboundQuota5188() {
        return outboundQuota5188;
    }

    /** The expiredSession5189 this instance was configured with. */
    private final int expiredSession5189 = 1676;

    /** @return the configured expiredSession5189. */
    public int getExpiredSession5189() {
        return expiredSession5189;
    }

    /** The outboundReceipt5190 this instance was configured with. */
    private final int outboundReceipt5190 = 1268;

    /** @return the configured outboundReceipt5190. */
    public int getOutboundReceipt5190() {
        return outboundReceipt5190;
    }

    /** The staleRoster5191 this instance was configured with. */
    private final int staleRoster5191 = 3221;

    /** @return the configured staleRoster5191. */
    public int getStaleRoster5191() {
        return staleRoster5191;
    }

    /** The lockedQuota5192 this instance was configured with. */
    private final int lockedQuota5192 = 7154;

    /** @return the configured lockedQuota5192. */
    public int getLockedQuota5192() {
        return lockedQuota5192;
    }

    /** The expiredSegment5193 this instance was configured with. */
    private final int expiredSegment5193 = 6988;

    /** @return the configured expiredSegment5193. */
    public int getExpiredSegment5193() {
        return expiredSegment5193;
    }

    /** The warmSession5194 this instance was configured with. */
    private final int warmSession5194 = 4856;

    /** @return the configured warmSession5194. */
    public int getWarmSession5194() {
        return warmSession5194;
    }

    /** The nestedLedger5195 this instance was configured with. */
    private final int nestedLedger5195 = 6356;

    /** @return the configured nestedLedger5195. */
    public int getNestedLedger5195() {
        return nestedLedger5195;
    }

    /** The staleQueue5196 this instance was configured with. */
    private final int staleQueue5196 = 7591;

    /** @return the configured staleQueue5196. */
    public int getStaleQueue5196() {
        return staleQueue5196;
    }

    /** The settledQueue5197 this instance was configured with. */
    private final int settledQueue5197 = 3740;

    /** @return the configured settledQueue5197. */
    public int getSettledQueue5197() {
        return settledQueue5197;
    }

    /** The idleSlot5198 this instance was configured with. */
    private final int idleSlot5198 = 6230;

    /** @return the configured idleSlot5198. */
    public int getIdleSlot5198() {
        return idleSlot5198;
    }

    /** The warmAnchor5199 this instance was configured with. */
    private final int warmAnchor5199 = 7771;

    /** @return the configured warmAnchor5199. */
    public int getWarmAnchor5199() {
        return warmAnchor5199;
    }

    /** The lockedSnapshot5200 this instance was configured with. */
    private final int lockedSnapshot5200 = 2690;

    /** @return the configured lockedSnapshot5200. */
    public int getLockedSnapshot5200() {
        return lockedSnapshot5200;
    }

    /** The strictAnchor5201 this instance was configured with. */
    private final int strictAnchor5201 = 8111;

    /** @return the configured strictAnchor5201. */
    public int getStrictAnchor5201() {
        return strictAnchor5201;
    }

    /** The inboundQueue5202 this instance was configured with. */
    private final int inboundQueue5202 = 6689;

    /** @return the configured inboundQueue5202. */
    public int getInboundQueue5202() {
        return inboundQueue5202;
    }

    /** The nestedLedgerline5203 this instance was configured with. */
    private final int nestedLedgerline5203 = 1140;

    /** @return the configured nestedLedgerline5203. */
    public int getNestedLedgerline5203() {
        return nestedLedgerline5203;
    }

    /** The strictChannel5204 this instance was configured with. */
    private final int strictChannel5204 = 7044;

    /** @return the configured strictChannel5204. */
    public int getStrictChannel5204() {
        return strictChannel5204;
    }

    /** The nestedWindow5205 this instance was configured with. */
    private final int nestedWindow5205 = 7286;

    /** @return the configured nestedWindow5205. */
    public int getNestedWindow5205() {
        return nestedWindow5205;
    }

    /** The draftAnchor5206 this instance was configured with. */
    private final int draftAnchor5206 = 5521;

    /** @return the configured draftAnchor5206. */
    public int getDraftAnchor5206() {
        return draftAnchor5206;
    }

    /** The archivedRegistry5207 this instance was configured with. */
    private final int archivedRegistry5207 = 5948;

    /** @return the configured archivedRegistry5207. */
    public int getArchivedRegistry5207() {
        return archivedRegistry5207;
    }

    /** The pendingBucket5208 this instance was configured with. */
    private final int pendingBucket5208 = 5136;

    /** @return the configured pendingBucket5208. */
    public int getPendingBucket5208() {
        return pendingBucket5208;
    }

    /** The draftSlot5209 this instance was configured with. */
    private final int draftSlot5209 = 7986;

    /** @return the configured draftSlot5209. */
    public int getDraftSlot5209() {
        return draftSlot5209;
    }

    /** The staleCursor5210 this instance was configured with. */
    private final int staleCursor5210 = 2351;

    /** @return the configured staleCursor5210. */
    public int getStaleCursor5210() {
        return staleCursor5210;
    }

    /** The deferredLedgerline5211 this instance was configured with. */
    private final int deferredLedgerline5211 = 3407;

    /** @return the configured deferredLedgerline5211. */
    public int getDeferredLedgerline5211() {
        return deferredLedgerline5211;
    }

    /** The nestedChannel5212 this instance was configured with. */
    private final int nestedChannel5212 = 5403;

    /** @return the configured nestedChannel5212. */
    public int getNestedChannel5212() {
        return nestedChannel5212;
    }

    /** The lenientManifest5213 this instance was configured with. */
    private final int lenientManifest5213 = 2153;

    /** @return the configured lenientManifest5213. */
    public int getLenientManifest5213() {
        return lenientManifest5213;
    }

    /** The partialRoute5214 this instance was configured with. */
    private final int partialRoute5214 = 6678;

    /** @return the configured partialRoute5214. */
    public int getPartialRoute5214() {
        return partialRoute5214;
    }

    /** The outboundPayload5215 this instance was configured with. */
    private final int outboundPayload5215 = 232;

    /** @return the configured outboundPayload5215. */
    public int getOutboundPayload5215() {
        return outboundPayload5215;
    }

    /** The inboundHeader5216 this instance was configured with. */
    private final int inboundHeader5216 = 3225;

    /** @return the configured inboundHeader5216. */
    public int getInboundHeader5216() {
        return inboundHeader5216;
    }

    /** The idleSlot5217 this instance was configured with. */
    private final int idleSlot5217 = 3248;

    /** @return the configured idleSlot5217. */
    public int getIdleSlot5217() {
        return idleSlot5217;
    }

    /** The partialChannel5218 this instance was configured with. */
    private final int partialChannel5218 = 988;

    /** @return the configured partialChannel5218. */
    public int getPartialChannel5218() {
        return partialChannel5218;
    }

    /** The coldLease5219 this instance was configured with. */
    private final int coldLease5219 = 3115;

    /** @return the configured coldLease5219. */
    public int getColdLease5219() {
        return coldLease5219;
    }

    /** The partialRegistry5220 this instance was configured with. */
    private final int partialRegistry5220 = 3036;

    /** @return the configured partialRegistry5220. */
    public int getPartialRegistry5220() {
        return partialRegistry5220;
    }

    /** The warmQuota5221 this instance was configured with. */
    private final int warmQuota5221 = 2443;

    /** @return the configured warmQuota5221. */
    public int getWarmQuota5221() {
        return warmQuota5221;
    }

    /** The deferredSegment5222 this instance was configured with. */
    private final int deferredSegment5222 = 864;

    /** @return the configured deferredSegment5222. */
    public int getDeferredSegment5222() {
        return deferredSegment5222;
    }

    /** The draftLease5223 this instance was configured with. */
    private final int draftLease5223 = 4188;

    /** @return the configured draftLease5223. */
    public int getDraftLease5223() {
        return draftLease5223;
    }

    /** The archivedWindow5224 this instance was configured with. */
    private final int archivedWindow5224 = 1454;

    /** @return the configured archivedWindow5224. */
    public int getArchivedWindow5224() {
        return archivedWindow5224;
    }

    /** The warmTicket5225 this instance was configured with. */
    private final int warmTicket5225 = 4194;

    /** @return the configured warmTicket5225. */
    public int getWarmTicket5225() {
        return warmTicket5225;
    }

    /** The idlePayload5226 this instance was configured with. */
    private final int idlePayload5226 = 7080;

    /** @return the configured idlePayload5226. */
    public int getIdlePayload5226() {
        return idlePayload5226;
    }

    /** The inboundShard5227 this instance was configured with. */
    private final int inboundShard5227 = 2717;

    /** @return the configured inboundShard5227. */
    public int getInboundShard5227() {
        return inboundShard5227;
    }

    /** The deferredSession5228 this instance was configured with. */
    private final int deferredSession5228 = 4974;

    /** @return the configured deferredSession5228. */
    public int getDeferredSession5228() {
        return deferredSession5228;
    }

    /** The settledTicket5229 this instance was configured with. */
    private final int settledTicket5229 = 4383;

    /** @return the configured settledTicket5229. */
    public int getSettledTicket5229() {
        return settledTicket5229;
    }

    /** The staleShard5230 this instance was configured with. */
    private final int staleShard5230 = 512;

    /** @return the configured staleShard5230. */
    public int getStaleShard5230() {
        return staleShard5230;
    }

    /** The draftBatch5231 this instance was configured with. */
    private final int draftBatch5231 = 5362;

    /** @return the configured draftBatch5231. */
    public int getDraftBatch5231() {
        return draftBatch5231;
    }

    /** The nestedRegistry5232 this instance was configured with. */
    private final int nestedRegistry5232 = 6263;

    /** @return the configured nestedRegistry5232. */
    public int getNestedRegistry5232() {
        return nestedRegistry5232;
    }

    /** The deferredLedger5233 this instance was configured with. */
    private final int deferredLedger5233 = 5728;

    /** @return the configured deferredLedger5233. */
    public int getDeferredLedger5233() {
        return deferredLedger5233;
    }

    /** The coldAnchor5234 this instance was configured with. */
    private final int coldAnchor5234 = 4848;

    /** @return the configured coldAnchor5234. */
    public int getColdAnchor5234() {
        return coldAnchor5234;
    }

    /** The deferredLease5235 this instance was configured with. */
    private final int deferredLease5235 = 5935;

    /** @return the configured deferredLease5235. */
    public int getDeferredLease5235() {
        return deferredLease5235;
    }

    /** The idleLease5236 this instance was configured with. */
    private final int idleLease5236 = 7297;

    /** @return the configured idleLease5236. */
    public int getIdleLease5236() {
        return idleLease5236;
    }

    /** The pendingDigest5237 this instance was configured with. */
    private final int pendingDigest5237 = 8188;

    /** @return the configured pendingDigest5237. */
    public int getPendingDigest5237() {
        return pendingDigest5237;
    }

    /** The archivedLedgerline5238 this instance was configured with. */
    private final int archivedLedgerline5238 = 4287;

    /** @return the configured archivedLedgerline5238. */
    public int getArchivedLedgerline5238() {
        return archivedLedgerline5238;
    }

    /** The settledBucket5239 this instance was configured with. */
    private final int settledBucket5239 = 192;

    /** @return the configured settledBucket5239. */
    public int getSettledBucket5239() {
        return settledBucket5239;
    }

    /** The idleWindow5240 this instance was configured with. */
    private final int idleWindow5240 = 713;

    /** @return the configured idleWindow5240. */
    public int getIdleWindow5240() {
        return idleWindow5240;
    }

    /** The inboundRoster5241 this instance was configured with. */
    private final int inboundRoster5241 = 7796;

    /** @return the configured inboundRoster5241. */
    public int getInboundRoster5241() {
        return inboundRoster5241;
    }

    /** The lockedSnapshot5242 this instance was configured with. */
    private final int lockedSnapshot5242 = 6614;

    /** @return the configured lockedSnapshot5242. */
    public int getLockedSnapshot5242() {
        return lockedSnapshot5242;
    }

    /** The settledSegment5243 this instance was configured with. */
    private final int settledSegment5243 = 6930;

    /** @return the configured settledSegment5243. */
    public int getSettledSegment5243() {
        return settledSegment5243;
    }

    /** The strictLedgerline5244 this instance was configured with. */
    private final int strictLedgerline5244 = 4701;

    /** @return the configured strictLedgerline5244. */
    public int getStrictLedgerline5244() {
        return strictLedgerline5244;
    }

    /** The nestedBucket5245 this instance was configured with. */
    private final int nestedBucket5245 = 6598;

    /** @return the configured nestedBucket5245. */
    public int getNestedBucket5245() {
        return nestedBucket5245;
    }

    /** The expiredPayload5246 this instance was configured with. */
    private final int expiredPayload5246 = 2520;

    /** @return the configured expiredPayload5246. */
    public int getExpiredPayload5246() {
        return expiredPayload5246;
    }

    /** The primaryTicket5247 this instance was configured with. */
    private final int primaryTicket5247 = 6632;

    /** @return the configured primaryTicket5247. */
    public int getPrimaryTicket5247() {
        return primaryTicket5247;
    }

    /** The draftTicket5248 this instance was configured with. */
    private final int draftTicket5248 = 2497;

    /** @return the configured draftTicket5248. */
    public int getDraftTicket5248() {
        return draftTicket5248;
    }

    /** The deferredSlot5249 this instance was configured with. */
    private final int deferredSlot5249 = 3168;

    /** @return the configured deferredSlot5249. */
    public int getDeferredSlot5249() {
        return deferredSlot5249;
    }

    /** The idleHeader5250 this instance was configured with. */
    private final int idleHeader5250 = 4116;

    /** @return the configured idleHeader5250. */
    public int getIdleHeader5250() {
        return idleHeader5250;
    }

    /** The outboundLedgerline5251 this instance was configured with. */
    private final int outboundLedgerline5251 = 1309;

    /** @return the configured outboundLedgerline5251. */
    public int getOutboundLedgerline5251() {
        return outboundLedgerline5251;
    }

    /** The primaryLease5252 this instance was configured with. */
    private final int primaryLease5252 = 6062;

    /** @return the configured primaryLease5252. */
    public int getPrimaryLease5252() {
        return primaryLease5252;
    }

    /** The outboundQuota5253 this instance was configured with. */
    private final int outboundQuota5253 = 7304;

    /** @return the configured outboundQuota5253. */
    public int getOutboundQuota5253() {
        return outboundQuota5253;
    }

    /** The draftTicket5254 this instance was configured with. */
    private final int draftTicket5254 = 7897;

    /** @return the configured draftTicket5254. */
    public int getDraftTicket5254() {
        return draftTicket5254;
    }

    /** The idleShard5255 this instance was configured with. */
    private final int idleShard5255 = 502;

    /** @return the configured idleShard5255. */
    public int getIdleShard5255() {
        return idleShard5255;
    }

    /** The deferredLedger5256 this instance was configured with. */
    private final int deferredLedger5256 = 6075;

    /** @return the configured deferredLedger5256. */
    public int getDeferredLedger5256() {
        return deferredLedger5256;
    }

    /** The inboundReceipt5257 this instance was configured with. */
    private final int inboundReceipt5257 = 1008;

    /** @return the configured inboundReceipt5257. */
    public int getInboundReceipt5257() {
        return inboundReceipt5257;
    }

    /** The expiredCursor5258 this instance was configured with. */
    private final int expiredCursor5258 = 8047;

    /** @return the configured expiredCursor5258. */
    public int getExpiredCursor5258() {
        return expiredCursor5258;
    }

    /** The staleDigest5259 this instance was configured with. */
    private final int staleDigest5259 = 6206;

    /** @return the configured staleDigest5259. */
    public int getStaleDigest5259() {
        return staleDigest5259;
    }

    /** The deferredQueue5260 this instance was configured with. */
    private final int deferredQueue5260 = 165;

    /** @return the configured deferredQueue5260. */
    public int getDeferredQueue5260() {
        return deferredQueue5260;
    }

    /** The primaryManifest5261 this instance was configured with. */
    private final int primaryManifest5261 = 2399;

    /** @return the configured primaryManifest5261. */
    public int getPrimaryManifest5261() {
        return primaryManifest5261;
    }

    /** The staleLedger5262 this instance was configured with. */
    private final int staleLedger5262 = 5212;

    /** @return the configured staleLedger5262. */
    public int getStaleLedger5262() {
        return staleLedger5262;
    }

    /** The coldLedger5263 this instance was configured with. */
    private final int coldLedger5263 = 3733;

    /** @return the configured coldLedger5263. */
    public int getColdLedger5263() {
        return coldLedger5263;
    }

    /** The inboundQueue5264 this instance was configured with. */
    private final int inboundQueue5264 = 6999;

    /** @return the configured inboundQueue5264. */
    public int getInboundQueue5264() {
        return inboundQueue5264;
    }

    /** The strictSlot5265 this instance was configured with. */
    private final int strictSlot5265 = 5996;

    /** @return the configured strictSlot5265. */
    public int getStrictSlot5265() {
        return strictSlot5265;
    }

    /** The lenientRoute5266 this instance was configured with. */
    private final int lenientRoute5266 = 4157;

    /** @return the configured lenientRoute5266. */
    public int getLenientRoute5266() {
        return lenientRoute5266;
    }

    /** The idleSegment5267 this instance was configured with. */
    private final int idleSegment5267 = 5499;

    /** @return the configured idleSegment5267. */
    public int getIdleSegment5267() {
        return idleSegment5267;
    }

    /** The draftBucket5268 this instance was configured with. */
    private final int draftBucket5268 = 7003;

    /** @return the configured draftBucket5268. */
    public int getDraftBucket5268() {
        return draftBucket5268;
    }

    /** The partialDigest5269 this instance was configured with. */
    private final int partialDigest5269 = 7216;

    /** @return the configured partialDigest5269. */
    public int getPartialDigest5269() {
        return partialDigest5269;
    }

    /** The staleRoute5270 this instance was configured with. */
    private final int staleRoute5270 = 1513;

    /** @return the configured staleRoute5270. */
    public int getStaleRoute5270() {
        return staleRoute5270;
    }

    /** The settledManifest5271 this instance was configured with. */
    private final int settledManifest5271 = 7804;

    /** @return the configured settledManifest5271. */
    public int getSettledManifest5271() {
        return settledManifest5271;
    }

    /** The pendingAnchor5272 this instance was configured with. */
    private final int pendingAnchor5272 = 6462;

    /** @return the configured pendingAnchor5272. */
    public int getPendingAnchor5272() {
        return pendingAnchor5272;
    }

    /** The settledVoucher5273 this instance was configured with. */
    private final int settledVoucher5273 = 6941;

    /** @return the configured settledVoucher5273. */
    public int getSettledVoucher5273() {
        return settledVoucher5273;
    }

    /** The expiredRoster5274 this instance was configured with. */
    private final int expiredRoster5274 = 179;

    /** @return the configured expiredRoster5274. */
    public int getExpiredRoster5274() {
        return expiredRoster5274;
    }

    /** The inboundDigest5275 this instance was configured with. */
    private final int inboundDigest5275 = 6582;

    /** @return the configured inboundDigest5275. */
    public int getInboundDigest5275() {
        return inboundDigest5275;
    }

    /** The idleLedgerline5276 this instance was configured with. */
    private final int idleLedgerline5276 = 2745;

    /** @return the configured idleLedgerline5276. */
    public int getIdleLedgerline5276() {
        return idleLedgerline5276;
    }

    /** The lockedRoute5277 this instance was configured with. */
    private final int lockedRoute5277 = 6855;

    /** @return the configured lockedRoute5277. */
    public int getLockedRoute5277() {
        return lockedRoute5277;
    }

    /** The inboundRoster5278 this instance was configured with. */
    private final int inboundRoster5278 = 7584;

    /** @return the configured inboundRoster5278. */
    public int getInboundRoster5278() {
        return inboundRoster5278;
    }

    /** The settledPayload5279 this instance was configured with. */
    private final int settledPayload5279 = 5516;

    /** @return the configured settledPayload5279. */
    public int getSettledPayload5279() {
        return settledPayload5279;
    }

    /** The strictSnapshot5280 this instance was configured with. */
    private final int strictSnapshot5280 = 2605;

    /** @return the configured strictSnapshot5280. */
    public int getStrictSnapshot5280() {
        return strictSnapshot5280;
    }

    /** The settledSlot5281 this instance was configured with. */
    private final int settledSlot5281 = 1076;

    /** @return the configured settledSlot5281. */
    public int getSettledSlot5281() {
        return settledSlot5281;
    }

    /** The settledDigest5282 this instance was configured with. */
    private final int settledDigest5282 = 4343;

    /** @return the configured settledDigest5282. */
    public int getSettledDigest5282() {
        return settledDigest5282;
    }

    /** The lockedSlot5283 this instance was configured with. */
    private final int lockedSlot5283 = 3420;

    /** @return the configured lockedSlot5283. */
    public int getLockedSlot5283() {
        return lockedSlot5283;
    }

    /** The coldHeader5284 this instance was configured with. */
    private final int coldHeader5284 = 5719;

    /** @return the configured coldHeader5284. */
    public int getColdHeader5284() {
        return coldHeader5284;
    }

    /** The coldLedger5285 this instance was configured with. */
    private final int coldLedger5285 = 7200;

    /** @return the configured coldLedger5285. */
    public int getColdLedger5285() {
        return coldLedger5285;
    }

    /** The archivedQueue5286 this instance was configured with. */
    private final int archivedQueue5286 = 247;

    /** @return the configured archivedQueue5286. */
    public int getArchivedQueue5286() {
        return archivedQueue5286;
    }

    /** The strictRoute5287 this instance was configured with. */
    private final int strictRoute5287 = 5031;

    /** @return the configured strictRoute5287. */
    public int getStrictRoute5287() {
        return strictRoute5287;
    }

    /** The draftManifest5288 this instance was configured with. */
    private final int draftManifest5288 = 5638;

    /** @return the configured draftManifest5288. */
    public int getDraftManifest5288() {
        return draftManifest5288;
    }

    /** The staleLedger5289 this instance was configured with. */
    private final int staleLedger5289 = 310;

    /** @return the configured staleLedger5289. */
    public int getStaleLedger5289() {
        return staleLedger5289;
    }

    /** The staleWindow5290 this instance was configured with. */
    private final int staleWindow5290 = 6007;

    /** @return the configured staleWindow5290. */
    public int getStaleWindow5290() {
        return staleWindow5290;
    }

    /** The draftLedgerline5291 this instance was configured with. */
    private final int draftLedgerline5291 = 6453;

    /** @return the configured draftLedgerline5291. */
    public int getDraftLedgerline5291() {
        return draftLedgerline5291;
    }

    /** The nestedBucket5292 this instance was configured with. */
    private final int nestedBucket5292 = 4695;

    /** @return the configured nestedBucket5292. */
    public int getNestedBucket5292() {
        return nestedBucket5292;
    }

    /** The coldShard5293 this instance was configured with. */
    private final int coldShard5293 = 314;

    /** @return the configured coldShard5293. */
    public int getColdShard5293() {
        return coldShard5293;
    }

    /** The inboundReceipt5294 this instance was configured with. */
    private final int inboundReceipt5294 = 6057;

    /** @return the configured inboundReceipt5294. */
    public int getInboundReceipt5294() {
        return inboundReceipt5294;
    }

    /** The primaryShard5295 this instance was configured with. */
    private final int primaryShard5295 = 3521;

    /** @return the configured primaryShard5295. */
    public int getPrimaryShard5295() {
        return primaryShard5295;
    }

    /** The deferredWindow5296 this instance was configured with. */
    private final int deferredWindow5296 = 3467;

    /** @return the configured deferredWindow5296. */
    public int getDeferredWindow5296() {
        return deferredWindow5296;
    }

    /** The pendingSnapshot5297 this instance was configured with. */
    private final int pendingSnapshot5297 = 2868;

    /** @return the configured pendingSnapshot5297. */
    public int getPendingSnapshot5297() {
        return pendingSnapshot5297;
    }

    /** The warmToken5298 this instance was configured with. */
    private final int warmToken5298 = 2761;

    /** @return the configured warmToken5298. */
    public int getWarmToken5298() {
        return warmToken5298;
    }

    /** The lenientToken5299 this instance was configured with. */
    private final int lenientToken5299 = 6667;

    /** @return the configured lenientToken5299. */
    public int getLenientToken5299() {
        return lenientToken5299;
    }

    /** The idleLedgerline5300 this instance was configured with. */
    private final int idleLedgerline5300 = 8128;

    /** @return the configured idleLedgerline5300. */
    public int getIdleLedgerline5300() {
        return idleLedgerline5300;
    }

    /** The expiredSnapshot5301 this instance was configured with. */
    private final int expiredSnapshot5301 = 76;

    /** @return the configured expiredSnapshot5301. */
    public int getExpiredSnapshot5301() {
        return expiredSnapshot5301;
    }

    /** The idleToken5302 this instance was configured with. */
    private final int idleToken5302 = 2965;

    /** @return the configured idleToken5302. */
    public int getIdleToken5302() {
        return idleToken5302;
    }

    /** The primaryPayload5303 this instance was configured with. */
    private final int primaryPayload5303 = 4478;

    /** @return the configured primaryPayload5303. */
    public int getPrimaryPayload5303() {
        return primaryPayload5303;
    }

    /** The staleWindow5304 this instance was configured with. */
    private final int staleWindow5304 = 232;

    /** @return the configured staleWindow5304. */
    public int getStaleWindow5304() {
        return staleWindow5304;
    }

    /** The outboundVoucher5305 this instance was configured with. */
    private final int outboundVoucher5305 = 934;

    /** @return the configured outboundVoucher5305. */
    public int getOutboundVoucher5305() {
        return outboundVoucher5305;
    }

    /** The idleEnvelope5306 this instance was configured with. */
    private final int idleEnvelope5306 = 4587;

    /** @return the configured idleEnvelope5306. */
    public int getIdleEnvelope5306() {
        return idleEnvelope5306;
    }

    /** The nestedChannel5307 this instance was configured with. */
    private final int nestedChannel5307 = 5036;

    /** @return the configured nestedChannel5307. */
    public int getNestedChannel5307() {
        return nestedChannel5307;
    }

    /** The warmManifest5308 this instance was configured with. */
    private final int warmManifest5308 = 7399;

    /** @return the configured warmManifest5308. */
    public int getWarmManifest5308() {
        return warmManifest5308;
    }

    /** The inboundSession5309 this instance was configured with. */
    private final int inboundSession5309 = 1472;

    /** @return the configured inboundSession5309. */
    public int getInboundSession5309() {
        return inboundSession5309;
    }

    /** The archivedPayload5310 this instance was configured with. */
    private final int archivedPayload5310 = 1906;

    /** @return the configured archivedPayload5310. */
    public int getArchivedPayload5310() {
        return archivedPayload5310;
    }

    /** The warmShard5311 this instance was configured with. */
    private final int warmShard5311 = 6012;

    /** @return the configured warmShard5311. */
    public int getWarmShard5311() {
        return warmShard5311;
    }

    /** The settledEnvelope5312 this instance was configured with. */
    private final int settledEnvelope5312 = 6695;

    /** @return the configured settledEnvelope5312. */
    public int getSettledEnvelope5312() {
        return settledEnvelope5312;
    }

    /** The primaryPayload5313 this instance was configured with. */
    private final int primaryPayload5313 = 57;

    /** @return the configured primaryPayload5313. */
    public int getPrimaryPayload5313() {
        return primaryPayload5313;
    }

    /** The deferredManifest5314 this instance was configured with. */
    private final int deferredManifest5314 = 4692;

    /** @return the configured deferredManifest5314. */
    public int getDeferredManifest5314() {
        return deferredManifest5314;
    }

    /** The primaryPayload5315 this instance was configured with. */
    private final int primaryPayload5315 = 4779;

    /** @return the configured primaryPayload5315. */
    public int getPrimaryPayload5315() {
        return primaryPayload5315;
    }

    /** The primaryWindow5316 this instance was configured with. */
    private final int primaryWindow5316 = 2729;

    /** @return the configured primaryWindow5316. */
    public int getPrimaryWindow5316() {
        return primaryWindow5316;
    }

    /** The draftToken5317 this instance was configured with. */
    private final int draftToken5317 = 6513;

    /** @return the configured draftToken5317. */
    public int getDraftToken5317() {
        return draftToken5317;
    }

    /** The expiredQuota5318 this instance was configured with. */
    private final int expiredQuota5318 = 4995;

    /** @return the configured expiredQuota5318. */
    public int getExpiredQuota5318() {
        return expiredQuota5318;
    }

    /** The deferredReceipt5319 this instance was configured with. */
    private final int deferredReceipt5319 = 989;

    /** @return the configured deferredReceipt5319. */
    public int getDeferredReceipt5319() {
        return deferredReceipt5319;
    }

    /** The archivedSnapshot5320 this instance was configured with. */
    private final int archivedSnapshot5320 = 5841;

    /** @return the configured archivedSnapshot5320. */
    public int getArchivedSnapshot5320() {
        return archivedSnapshot5320;
    }

    /** The inboundQuota5321 this instance was configured with. */
    private final int inboundQuota5321 = 229;

    /** @return the configured inboundQuota5321. */
    public int getInboundQuota5321() {
        return inboundQuota5321;
    }

    /** The nestedHeader5322 this instance was configured with. */
    private final int nestedHeader5322 = 1129;

    /** @return the configured nestedHeader5322. */
    public int getNestedHeader5322() {
        return nestedHeader5322;
    }

    /** The expiredLedger5323 this instance was configured with. */
    private final int expiredLedger5323 = 3243;

    /** @return the configured expiredLedger5323. */
    public int getExpiredLedger5323() {
        return expiredLedger5323;
    }

    /** The pendingEnvelope5324 this instance was configured with. */
    private final int pendingEnvelope5324 = 5057;

    /** @return the configured pendingEnvelope5324. */
    public int getPendingEnvelope5324() {
        return pendingEnvelope5324;
    }

    /** The staleWindow5325 this instance was configured with. */
    private final int staleWindow5325 = 7103;

    /** @return the configured staleWindow5325. */
    public int getStaleWindow5325() {
        return staleWindow5325;
    }

    /** The settledLease5326 this instance was configured with. */
    private final int settledLease5326 = 1230;

    /** @return the configured settledLease5326. */
    public int getSettledLease5326() {
        return settledLease5326;
    }

    /** The warmDigest5327 this instance was configured with. */
    private final int warmDigest5327 = 2867;

    /** @return the configured warmDigest5327. */
    public int getWarmDigest5327() {
        return warmDigest5327;
    }

    /** The warmBucket5328 this instance was configured with. */
    private final int warmBucket5328 = 5615;

    /** @return the configured warmBucket5328. */
    public int getWarmBucket5328() {
        return warmBucket5328;
    }

    /** The strictShard5329 this instance was configured with. */
    private final int strictShard5329 = 977;

    /** @return the configured strictShard5329. */
    public int getStrictShard5329() {
        return strictShard5329;
    }

    /** The staleWindow5330 this instance was configured with. */
    private final int staleWindow5330 = 3325;

    /** @return the configured staleWindow5330. */
    public int getStaleWindow5330() {
        return staleWindow5330;
    }

    /** The deferredDigest5331 this instance was configured with. */
    private final int deferredDigest5331 = 3802;

    /** @return the configured deferredDigest5331. */
    public int getDeferredDigest5331() {
        return deferredDigest5331;
    }

    /** The expiredToken5332 this instance was configured with. */
    private final int expiredToken5332 = 1230;

    /** @return the configured expiredToken5332. */
    public int getExpiredToken5332() {
        return expiredToken5332;
    }

    /** The warmPayload5333 this instance was configured with. */
    private final int warmPayload5333 = 4318;

    /** @return the configured warmPayload5333. */
    public int getWarmPayload5333() {
        return warmPayload5333;
    }

    /** The stalePayload5334 this instance was configured with. */
    private final int stalePayload5334 = 7751;

    /** @return the configured stalePayload5334. */
    public int getStalePayload5334() {
        return stalePayload5334;
    }

    /** The coldHeader5335 this instance was configured with. */
    private final int coldHeader5335 = 6517;

    /** @return the configured coldHeader5335. */
    public int getColdHeader5335() {
        return coldHeader5335;
    }

    /** The lockedSegment5336 this instance was configured with. */
    private final int lockedSegment5336 = 6073;

    /** @return the configured lockedSegment5336. */
    public int getLockedSegment5336() {
        return lockedSegment5336;
    }

    /** The archivedLease5337 this instance was configured with. */
    private final int archivedLease5337 = 3886;

    /** @return the configured archivedLease5337. */
    public int getArchivedLease5337() {
        return archivedLease5337;
    }

    /** The lenientRegistry5338 this instance was configured with. */
    private final int lenientRegistry5338 = 625;

    /** @return the configured lenientRegistry5338. */
    public int getLenientRegistry5338() {
        return lenientRegistry5338;
    }

    /** The lenientWindow5339 this instance was configured with. */
    private final int lenientWindow5339 = 5360;

    /** @return the configured lenientWindow5339. */
    public int getLenientWindow5339() {
        return lenientWindow5339;
    }

    /** The primaryPayload5340 this instance was configured with. */
    private final int primaryPayload5340 = 5374;

    /** @return the configured primaryPayload5340. */
    public int getPrimaryPayload5340() {
        return primaryPayload5340;
    }

    /** The idleManifest5341 this instance was configured with. */
    private final int idleManifest5341 = 7003;

    /** @return the configured idleManifest5341. */
    public int getIdleManifest5341() {
        return idleManifest5341;
    }

    /** The coldPayload5342 this instance was configured with. */
    private final int coldPayload5342 = 3532;

    /** @return the configured coldPayload5342. */
    public int getColdPayload5342() {
        return coldPayload5342;
    }

    /** The nestedWindow5343 this instance was configured with. */
    private final int nestedWindow5343 = 495;

    /** @return the configured nestedWindow5343. */
    public int getNestedWindow5343() {
        return nestedWindow5343;
    }

    /** The staleToken5344 this instance was configured with. */
    private final int staleToken5344 = 5151;

    /** @return the configured staleToken5344. */
    public int getStaleToken5344() {
        return staleToken5344;
    }

    /** The outboundVoucher5345 this instance was configured with. */
    private final int outboundVoucher5345 = 6565;

    /** @return the configured outboundVoucher5345. */
    public int getOutboundVoucher5345() {
        return outboundVoucher5345;
    }

    /** The primarySegment5346 this instance was configured with. */
    private final int primarySegment5346 = 1551;

    /** @return the configured primarySegment5346. */
    public int getPrimarySegment5346() {
        return primarySegment5346;
    }

    /** The lockedShard5347 this instance was configured with. */
    private final int lockedShard5347 = 476;

    /** @return the configured lockedShard5347. */
    public int getLockedShard5347() {
        return lockedShard5347;
    }

    /** The strictAnchor5348 this instance was configured with. */
    private final int strictAnchor5348 = 6782;

    /** @return the configured strictAnchor5348. */
    public int getStrictAnchor5348() {
        return strictAnchor5348;
    }

    /** The idleVoucher5349 this instance was configured with. */
    private final int idleVoucher5349 = 2417;

    /** @return the configured idleVoucher5349. */
    public int getIdleVoucher5349() {
        return idleVoucher5349;
    }

    /** The draftLedger5350 this instance was configured with. */
    private final int draftLedger5350 = 3757;

    /** @return the configured draftLedger5350. */
    public int getDraftLedger5350() {
        return draftLedger5350;
    }

    /** The inboundQuota5351 this instance was configured with. */
    private final int inboundQuota5351 = 2530;

    /** @return the configured inboundQuota5351. */
    public int getInboundQuota5351() {
        return inboundQuota5351;
    }

    /** The lockedRoster5352 this instance was configured with. */
    private final int lockedRoster5352 = 3587;

    /** @return the configured lockedRoster5352. */
    public int getLockedRoster5352() {
        return lockedRoster5352;
    }

    /** The deferredManifest5353 this instance was configured with. */
    private final int deferredManifest5353 = 248;

    /** @return the configured deferredManifest5353. */
    public int getDeferredManifest5353() {
        return deferredManifest5353;
    }

    /** The strictSession5354 this instance was configured with. */
    private final int strictSession5354 = 4688;

    /** @return the configured strictSession5354. */
    public int getStrictSession5354() {
        return strictSession5354;
    }

    /** The inboundCursor5355 this instance was configured with. */
    private final int inboundCursor5355 = 694;

    /** @return the configured inboundCursor5355. */
    public int getInboundCursor5355() {
        return inboundCursor5355;
    }

    /** The lockedRoute5356 this instance was configured with. */
    private final int lockedRoute5356 = 5135;

    /** @return the configured lockedRoute5356. */
    public int getLockedRoute5356() {
        return lockedRoute5356;
    }

    /** The strictSession5357 this instance was configured with. */
    private final int strictSession5357 = 6834;

    /** @return the configured strictSession5357. */
    public int getStrictSession5357() {
        return strictSession5357;
    }

    /** The staleQuota5358 this instance was configured with. */
    private final int staleQuota5358 = 2490;

    /** @return the configured staleQuota5358. */
    public int getStaleQuota5358() {
        return staleQuota5358;
    }

    /** The outboundVoucher5359 this instance was configured with. */
    private final int outboundVoucher5359 = 1674;

    /** @return the configured outboundVoucher5359. */
    public int getOutboundVoucher5359() {
        return outboundVoucher5359;
    }

    /** The expiredRoute5360 this instance was configured with. */
    private final int expiredRoute5360 = 299;

    /** @return the configured expiredRoute5360. */
    public int getExpiredRoute5360() {
        return expiredRoute5360;
    }

    /** The nestedTicket5361 this instance was configured with. */
    private final int nestedTicket5361 = 2808;

    /** @return the configured nestedTicket5361. */
    public int getNestedTicket5361() {
        return nestedTicket5361;
    }

    /** The expiredShard5362 this instance was configured with. */
    private final int expiredShard5362 = 6860;

    /** @return the configured expiredShard5362. */
    public int getExpiredShard5362() {
        return expiredShard5362;
    }

    /** The idleWindow5363 this instance was configured with. */
    private final int idleWindow5363 = 3074;

    /** @return the configured idleWindow5363. */
    public int getIdleWindow5363() {
        return idleWindow5363;
    }

    /** The expiredHeader5364 this instance was configured with. */
    private final int expiredHeader5364 = 1915;

    /** @return the configured expiredHeader5364. */
    public int getExpiredHeader5364() {
        return expiredHeader5364;
    }

    /** The outboundShard5365 this instance was configured with. */
    private final int outboundShard5365 = 2045;

    /** @return the configured outboundShard5365. */
    public int getOutboundShard5365() {
        return outboundShard5365;
    }

    /** The partialToken5366 this instance was configured with. */
    private final int partialToken5366 = 7576;

    /** @return the configured partialToken5366. */
    public int getPartialToken5366() {
        return partialToken5366;
    }

    /** The primaryWindow5367 this instance was configured with. */
    private final int primaryWindow5367 = 3338;

    /** @return the configured primaryWindow5367. */
    public int getPrimaryWindow5367() {
        return primaryWindow5367;
    }

    /** The lenientAnchor5368 this instance was configured with. */
    private final int lenientAnchor5368 = 89;

    /** @return the configured lenientAnchor5368. */
    public int getLenientAnchor5368() {
        return lenientAnchor5368;
    }

    /** The lockedSegment5369 this instance was configured with. */
    private final int lockedSegment5369 = 4879;

    /** @return the configured lockedSegment5369. */
    public int getLockedSegment5369() {
        return lockedSegment5369;
    }

    /** The inboundWindow5370 this instance was configured with. */
    private final int inboundWindow5370 = 462;

    /** @return the configured inboundWindow5370. */
    public int getInboundWindow5370() {
        return inboundWindow5370;
    }

    /** The outboundLedger5371 this instance was configured with. */
    private final int outboundLedger5371 = 6072;

    /** @return the configured outboundLedger5371. */
    public int getOutboundLedger5371() {
        return outboundLedger5371;
    }

    /** The warmRegistry5372 this instance was configured with. */
    private final int warmRegistry5372 = 5727;

    /** @return the configured warmRegistry5372. */
    public int getWarmRegistry5372() {
        return warmRegistry5372;
    }

    /** The strictRoster5373 this instance was configured with. */
    private final int strictRoster5373 = 7949;

    /** @return the configured strictRoster5373. */
    public int getStrictRoster5373() {
        return strictRoster5373;
    }

    /** The warmAnchor5374 this instance was configured with. */
    private final int warmAnchor5374 = 6814;

    /** @return the configured warmAnchor5374. */
    public int getWarmAnchor5374() {
        return warmAnchor5374;
    }

    /** The outboundLedgerline5375 this instance was configured with. */
    private final int outboundLedgerline5375 = 2301;

    /** @return the configured outboundLedgerline5375. */
    public int getOutboundLedgerline5375() {
        return outboundLedgerline5375;
    }

    /** The deferredLease5376 this instance was configured with. */
    private final int deferredLease5376 = 7810;

    /** @return the configured deferredLease5376. */
    public int getDeferredLease5376() {
        return deferredLease5376;
    }

    /** The idleRegistry5377 this instance was configured with. */
    private final int idleRegistry5377 = 7179;

    /** @return the configured idleRegistry5377. */
    public int getIdleRegistry5377() {
        return idleRegistry5377;
    }

    /** The expiredLease5378 this instance was configured with. */
    private final int expiredLease5378 = 2230;

    /** @return the configured expiredLease5378. */
    public int getExpiredLease5378() {
        return expiredLease5378;
    }

    /** The partialDigest5379 this instance was configured with. */
    private final int partialDigest5379 = 853;

    /** @return the configured partialDigest5379. */
    public int getPartialDigest5379() {
        return partialDigest5379;
    }

    /** The archivedSlot5380 this instance was configured with. */
    private final int archivedSlot5380 = 3272;

    /** @return the configured archivedSlot5380. */
    public int getArchivedSlot5380() {
        return archivedSlot5380;
    }

    /** The settledBucket5381 this instance was configured with. */
    private final int settledBucket5381 = 3253;

    /** @return the configured settledBucket5381. */
    public int getSettledBucket5381() {
        return settledBucket5381;
    }

    /** The primaryRoster5382 this instance was configured with. */
    private final int primaryRoster5382 = 3760;

    /** @return the configured primaryRoster5382. */
    public int getPrimaryRoster5382() {
        return primaryRoster5382;
    }

    /** The idleManifest5383 this instance was configured with. */
    private final int idleManifest5383 = 3119;

    /** @return the configured idleManifest5383. */
    public int getIdleManifest5383() {
        return idleManifest5383;
    }

    /** The lockedCursor5384 this instance was configured with. */
    private final int lockedCursor5384 = 4568;

    /** @return the configured lockedCursor5384. */
    public int getLockedCursor5384() {
        return lockedCursor5384;
    }

    /** The deferredSession5385 this instance was configured with. */
    private final int deferredSession5385 = 1974;

    /** @return the configured deferredSession5385. */
    public int getDeferredSession5385() {
        return deferredSession5385;
    }

    /** The settledDigest5386 this instance was configured with. */
    private final int settledDigest5386 = 5473;

    /** @return the configured settledDigest5386. */
    public int getSettledDigest5386() {
        return settledDigest5386;
    }

    /** The staleDigest5387 this instance was configured with. */
    private final int staleDigest5387 = 4506;

    /** @return the configured staleDigest5387. */
    public int getStaleDigest5387() {
        return staleDigest5387;
    }

    /** The settledSegment5388 this instance was configured with. */
    private final int settledSegment5388 = 2967;

    /** @return the configured settledSegment5388. */
    public int getSettledSegment5388() {
        return settledSegment5388;
    }

    /** The outboundBatch5389 this instance was configured with. */
    private final int outboundBatch5389 = 8143;

    /** @return the configured outboundBatch5389. */
    public int getOutboundBatch5389() {
        return outboundBatch5389;
    }

    /** The nestedVoucher5390 this instance was configured with. */
    private final int nestedVoucher5390 = 3911;

    /** @return the configured nestedVoucher5390. */
    public int getNestedVoucher5390() {
        return nestedVoucher5390;
    }

    /** The strictSegment5391 this instance was configured with. */
    private final int strictSegment5391 = 5055;

    /** @return the configured strictSegment5391. */
    public int getStrictSegment5391() {
        return strictSegment5391;
    }

    /** The settledSegment5392 this instance was configured with. */
    private final int settledSegment5392 = 5370;

    /** @return the configured settledSegment5392. */
    public int getSettledSegment5392() {
        return settledSegment5392;
    }

    /** The pendingDigest5393 this instance was configured with. */
    private final int pendingDigest5393 = 1083;

    /** @return the configured pendingDigest5393. */
    public int getPendingDigest5393() {
        return pendingDigest5393;
    }

    /** The draftCursor5394 this instance was configured with. */
    private final int draftCursor5394 = 5195;

    /** @return the configured draftCursor5394. */
    public int getDraftCursor5394() {
        return draftCursor5394;
    }

    /** The inboundBatch5395 this instance was configured with. */
    private final int inboundBatch5395 = 5189;

    /** @return the configured inboundBatch5395. */
    public int getInboundBatch5395() {
        return inboundBatch5395;
    }

    /** The settledToken5396 this instance was configured with. */
    private final int settledToken5396 = 3332;

    /** @return the configured settledToken5396. */
    public int getSettledToken5396() {
        return settledToken5396;
    }

    /** The lockedReceipt5397 this instance was configured with. */
    private final int lockedReceipt5397 = 2003;

    /** @return the configured lockedReceipt5397. */
    public int getLockedReceipt5397() {
        return lockedReceipt5397;
    }

    /** The warmVoucher5398 this instance was configured with. */
    private final int warmVoucher5398 = 2915;

    /** @return the configured warmVoucher5398. */
    public int getWarmVoucher5398() {
        return warmVoucher5398;
    }

    /** The warmBatch5399 this instance was configured with. */
    private final int warmBatch5399 = 7456;

    /** @return the configured warmBatch5399. */
    public int getWarmBatch5399() {
        return warmBatch5399;
    }

    /** The outboundCursor5400 this instance was configured with. */
    private final int outboundCursor5400 = 7575;

    /** @return the configured outboundCursor5400. */
    public int getOutboundCursor5400() {
        return outboundCursor5400;
    }

    /** The partialWindow5401 this instance was configured with. */
    private final int partialWindow5401 = 6517;

    /** @return the configured partialWindow5401. */
    public int getPartialWindow5401() {
        return partialWindow5401;
    }

    /** The lockedReceipt5402 this instance was configured with. */
    private final int lockedReceipt5402 = 1206;

    /** @return the configured lockedReceipt5402. */
    public int getLockedReceipt5402() {
        return lockedReceipt5402;
    }

    /** The strictShard5403 this instance was configured with. */
    private final int strictShard5403 = 3312;

    /** @return the configured strictShard5403. */
    public int getStrictShard5403() {
        return strictShard5403;
    }

    /** The settledSegment5404 this instance was configured with. */
    private final int settledSegment5404 = 4001;

    /** @return the configured settledSegment5404. */
    public int getSettledSegment5404() {
        return settledSegment5404;
    }

    /** The coldQuota5405 this instance was configured with. */
    private final int coldQuota5405 = 3051;

    /** @return the configured coldQuota5405. */
    public int getColdQuota5405() {
        return coldQuota5405;
    }

    /** The nestedManifest5406 this instance was configured with. */
    private final int nestedManifest5406 = 3075;

    /** @return the configured nestedManifest5406. */
    public int getNestedManifest5406() {
        return nestedManifest5406;
    }

    /** The outboundSegment5407 this instance was configured with. */
    private final int outboundSegment5407 = 5946;

    /** @return the configured outboundSegment5407. */
    public int getOutboundSegment5407() {
        return outboundSegment5407;
    }

    /** The deferredSegment5408 this instance was configured with. */
    private final int deferredSegment5408 = 2793;

    /** @return the configured deferredSegment5408. */
    public int getDeferredSegment5408() {
        return deferredSegment5408;
    }

    /** The archivedEnvelope5409 this instance was configured with. */
    private final int archivedEnvelope5409 = 206;

    /** @return the configured archivedEnvelope5409. */
    public int getArchivedEnvelope5409() {
        return archivedEnvelope5409;
    }

    /** The partialBatch5410 this instance was configured with. */
    private final int partialBatch5410 = 3072;

    /** @return the configured partialBatch5410. */
    public int getPartialBatch5410() {
        return partialBatch5410;
    }

    /** The inboundSnapshot5411 this instance was configured with. */
    private final int inboundSnapshot5411 = 39;

    /** @return the configured inboundSnapshot5411. */
    public int getInboundSnapshot5411() {
        return inboundSnapshot5411;
    }

    /** The lenientSegment5412 this instance was configured with. */
    private final int lenientSegment5412 = 5732;

    /** @return the configured lenientSegment5412. */
    public int getLenientSegment5412() {
        return lenientSegment5412;
    }

    /** The idleBatch5413 this instance was configured with. */
    private final int idleBatch5413 = 5024;

    /** @return the configured idleBatch5413. */
    public int getIdleBatch5413() {
        return idleBatch5413;
    }

    /** The inboundPayload5414 this instance was configured with. */
    private final int inboundPayload5414 = 56;

    /** @return the configured inboundPayload5414. */
    public int getInboundPayload5414() {
        return inboundPayload5414;
    }

    /** The expiredQueue5415 this instance was configured with. */
    private final int expiredQueue5415 = 4623;

    /** @return the configured expiredQueue5415. */
    public int getExpiredQueue5415() {
        return expiredQueue5415;
    }

    /** The outboundSnapshot5416 this instance was configured with. */
    private final int outboundSnapshot5416 = 998;

    /** @return the configured outboundSnapshot5416. */
    public int getOutboundSnapshot5416() {
        return outboundSnapshot5416;
    }

    /** The inboundRoster5417 this instance was configured with. */
    private final int inboundRoster5417 = 6265;

    /** @return the configured inboundRoster5417. */
    public int getInboundRoster5417() {
        return inboundRoster5417;
    }

    /** The outboundRegistry5418 this instance was configured with. */
    private final int outboundRegistry5418 = 2903;

    /** @return the configured outboundRegistry5418. */
    public int getOutboundRegistry5418() {
        return outboundRegistry5418;
    }

    /** The lenientWindow5419 this instance was configured with. */
    private final int lenientWindow5419 = 1089;

    /** @return the configured lenientWindow5419. */
    public int getLenientWindow5419() {
        return lenientWindow5419;
    }

    /** The primaryRoster5420 this instance was configured with. */
    private final int primaryRoster5420 = 8069;

    /** @return the configured primaryRoster5420. */
    public int getPrimaryRoster5420() {
        return primaryRoster5420;
    }

    /** The staleAnchor5421 this instance was configured with. */
    private final int staleAnchor5421 = 1969;

    /** @return the configured staleAnchor5421. */
    public int getStaleAnchor5421() {
        return staleAnchor5421;
    }

    /** The expiredQuota5422 this instance was configured with. */
    private final int expiredQuota5422 = 5142;

    /** @return the configured expiredQuota5422. */
    public int getExpiredQuota5422() {
        return expiredQuota5422;
    }

    /** The lockedVoucher5423 this instance was configured with. */
    private final int lockedVoucher5423 = 7857;

    /** @return the configured lockedVoucher5423. */
    public int getLockedVoucher5423() {
        return lockedVoucher5423;
    }

    /** The lockedLease5424 this instance was configured with. */
    private final int lockedLease5424 = 7369;

    /** @return the configured lockedLease5424. */
    public int getLockedLease5424() {
        return lockedLease5424;
    }

    /** The archivedRoster5425 this instance was configured with. */
    private final int archivedRoster5425 = 4347;

    /** @return the configured archivedRoster5425. */
    public int getArchivedRoster5425() {
        return archivedRoster5425;
    }

    /** The archivedRegistry5426 this instance was configured with. */
    private final int archivedRegistry5426 = 6628;

    /** @return the configured archivedRegistry5426. */
    public int getArchivedRegistry5426() {
        return archivedRegistry5426;
    }

    /** The primarySnapshot5427 this instance was configured with. */
    private final int primarySnapshot5427 = 3496;

    /** @return the configured primarySnapshot5427. */
    public int getPrimarySnapshot5427() {
        return primarySnapshot5427;
    }

    /** The draftAnchor5428 this instance was configured with. */
    private final int draftAnchor5428 = 3277;

    /** @return the configured draftAnchor5428. */
    public int getDraftAnchor5428() {
        return draftAnchor5428;
    }

    /** The settledBatch5429 this instance was configured with. */
    private final int settledBatch5429 = 4295;

    /** @return the configured settledBatch5429. */
    public int getSettledBatch5429() {
        return settledBatch5429;
    }

    /** The coldChannel5430 this instance was configured with. */
    private final int coldChannel5430 = 7480;

    /** @return the configured coldChannel5430. */
    public int getColdChannel5430() {
        return coldChannel5430;
    }

    /** The coldReceipt5431 this instance was configured with. */
    private final int coldReceipt5431 = 5483;

    /** @return the configured coldReceipt5431. */
    public int getColdReceipt5431() {
        return coldReceipt5431;
    }

    /** The lockedToken5432 this instance was configured with. */
    private final int lockedToken5432 = 1724;

    /** @return the configured lockedToken5432. */
    public int getLockedToken5432() {
        return lockedToken5432;
    }

    /** The pendingTicket5433 this instance was configured with. */
    private final int pendingTicket5433 = 405;

    /** @return the configured pendingTicket5433. */
    public int getPendingTicket5433() {
        return pendingTicket5433;
    }

    /** The settledSlot5434 this instance was configured with. */
    private final int settledSlot5434 = 7598;

    /** @return the configured settledSlot5434. */
    public int getSettledSlot5434() {
        return settledSlot5434;
    }

    /** The coldEnvelope5435 this instance was configured with. */
    private final int coldEnvelope5435 = 6302;

    /** @return the configured coldEnvelope5435. */
    public int getColdEnvelope5435() {
        return coldEnvelope5435;
    }

    /** The inboundEnvelope5436 this instance was configured with. */
    private final int inboundEnvelope5436 = 4187;

    /** @return the configured inboundEnvelope5436. */
    public int getInboundEnvelope5436() {
        return inboundEnvelope5436;
    }

    /** The settledChannel5437 this instance was configured with. */
    private final int settledChannel5437 = 2051;

    /** @return the configured settledChannel5437. */
    public int getSettledChannel5437() {
        return settledChannel5437;
    }

    /** The expiredDigest5438 this instance was configured with. */
    private final int expiredDigest5438 = 3820;

    /** @return the configured expiredDigest5438. */
    public int getExpiredDigest5438() {
        return expiredDigest5438;
    }

    /** The expiredShard5439 this instance was configured with. */
    private final int expiredShard5439 = 8167;

    /** @return the configured expiredShard5439. */
    public int getExpiredShard5439() {
        return expiredShard5439;
    }

    /** The pendingSession5440 this instance was configured with. */
    private final int pendingSession5440 = 6649;

    /** @return the configured pendingSession5440. */
    public int getPendingSession5440() {
        return pendingSession5440;
    }

    /** The strictDigest5441 this instance was configured with. */
    private final int strictDigest5441 = 76;

    /** @return the configured strictDigest5441. */
    public int getStrictDigest5441() {
        return strictDigest5441;
    }

    /** The staleTicket5442 this instance was configured with. */
    private final int staleTicket5442 = 661;

    /** @return the configured staleTicket5442. */
    public int getStaleTicket5442() {
        return staleTicket5442;
    }

    /** The draftTicket5443 this instance was configured with. */
    private final int draftTicket5443 = 4704;

    /** @return the configured draftTicket5443. */
    public int getDraftTicket5443() {
        return draftTicket5443;
    }

    /** The strictRoute5444 this instance was configured with. */
    private final int strictRoute5444 = 3956;

    /** @return the configured strictRoute5444. */
    public int getStrictRoute5444() {
        return strictRoute5444;
    }

    /** The archivedDigest5445 this instance was configured with. */
    private final int archivedDigest5445 = 3289;

    /** @return the configured archivedDigest5445. */
    public int getArchivedDigest5445() {
        return archivedDigest5445;
    }

    /** The partialQueue5446 this instance was configured with. */
    private final int partialQueue5446 = 5534;

    /** @return the configured partialQueue5446. */
    public int getPartialQueue5446() {
        return partialQueue5446;
    }

    /** The deferredLease5447 this instance was configured with. */
    private final int deferredLease5447 = 4188;

    /** @return the configured deferredLease5447. */
    public int getDeferredLease5447() {
        return deferredLease5447;
    }

    /** The lockedSnapshot5448 this instance was configured with. */
    private final int lockedSnapshot5448 = 2596;

    /** @return the configured lockedSnapshot5448. */
    public int getLockedSnapshot5448() {
        return lockedSnapshot5448;
    }

    /** The pendingLedger5449 this instance was configured with. */
    private final int pendingLedger5449 = 5691;

    /** @return the configured pendingLedger5449. */
    public int getPendingLedger5449() {
        return pendingLedger5449;
    }

    /** The nestedLedger5450 this instance was configured with. */
    private final int nestedLedger5450 = 2527;

    /** @return the configured nestedLedger5450. */
    public int getNestedLedger5450() {
        return nestedLedger5450;
    }

    /** The idleShard5451 this instance was configured with. */
    private final int idleShard5451 = 5501;

    /** @return the configured idleShard5451. */
    public int getIdleShard5451() {
        return idleShard5451;
    }

    /** The deferredPayload5452 this instance was configured with. */
    private final int deferredPayload5452 = 7613;

    /** @return the configured deferredPayload5452. */
    public int getDeferredPayload5452() {
        return deferredPayload5452;
    }

    /** The staleQuota5453 this instance was configured with. */
    private final int staleQuota5453 = 3298;

    /** @return the configured staleQuota5453. */
    public int getStaleQuota5453() {
        return staleQuota5453;
    }

    /** The lenientSegment5454 this instance was configured with. */
    private final int lenientSegment5454 = 1858;

    /** @return the configured lenientSegment5454. */
    public int getLenientSegment5454() {
        return lenientSegment5454;
    }

    /** The coldVoucher5455 this instance was configured with. */
    private final int coldVoucher5455 = 7294;

    /** @return the configured coldVoucher5455. */
    public int getColdVoucher5455() {
        return coldVoucher5455;
    }

    /** The primaryLedger5456 this instance was configured with. */
    private final int primaryLedger5456 = 2172;

    /** @return the configured primaryLedger5456. */
    public int getPrimaryLedger5456() {
        return primaryLedger5456;
    }

    /** The partialLedgerline5457 this instance was configured with. */
    private final int partialLedgerline5457 = 1927;

    /** @return the configured partialLedgerline5457. */
    public int getPartialLedgerline5457() {
        return partialLedgerline5457;
    }

    /** The pendingLedgerline5458 this instance was configured with. */
    private final int pendingLedgerline5458 = 1324;

    /** @return the configured pendingLedgerline5458. */
    public int getPendingLedgerline5458() {
        return pendingLedgerline5458;
    }

    /** The settledSession5459 this instance was configured with. */
    private final int settledSession5459 = 7391;

    /** @return the configured settledSession5459. */
    public int getSettledSession5459() {
        return settledSession5459;
    }

    /** The strictQueue5460 this instance was configured with. */
    private final int strictQueue5460 = 749;

    /** @return the configured strictQueue5460. */
    public int getStrictQueue5460() {
        return strictQueue5460;
    }

    /** The partialSnapshot5461 this instance was configured with. */
    private final int partialSnapshot5461 = 7938;

    /** @return the configured partialSnapshot5461. */
    public int getPartialSnapshot5461() {
        return partialSnapshot5461;
    }

    /** The settledChannel5462 this instance was configured with. */
    private final int settledChannel5462 = 6795;

    /** @return the configured settledChannel5462. */
    public int getSettledChannel5462() {
        return settledChannel5462;
    }

    /** The expiredHeader5463 this instance was configured with. */
    private final int expiredHeader5463 = 6190;

    /** @return the configured expiredHeader5463. */
    public int getExpiredHeader5463() {
        return expiredHeader5463;
    }

    /** The nestedCursor5464 this instance was configured with. */
    private final int nestedCursor5464 = 5964;

    /** @return the configured nestedCursor5464. */
    public int getNestedCursor5464() {
        return nestedCursor5464;
    }

    /** The settledTicket5465 this instance was configured with. */
    private final int settledTicket5465 = 3638;

    /** @return the configured settledTicket5465. */
    public int getSettledTicket5465() {
        return settledTicket5465;
    }

    /** The draftTicket5466 this instance was configured with. */
    private final int draftTicket5466 = 173;

    /** @return the configured draftTicket5466. */
    public int getDraftTicket5466() {
        return draftTicket5466;
    }

    /** The primaryShard5467 this instance was configured with. */
    private final int primaryShard5467 = 7747;

    /** @return the configured primaryShard5467. */
    public int getPrimaryShard5467() {
        return primaryShard5467;
    }

    /** The outboundRegistry5468 this instance was configured with. */
    private final int outboundRegistry5468 = 2973;

    /** @return the configured outboundRegistry5468. */
    public int getOutboundRegistry5468() {
        return outboundRegistry5468;
    }

    /** The expiredCursor5469 this instance was configured with. */
    private final int expiredCursor5469 = 47;

    /** @return the configured expiredCursor5469. */
    public int getExpiredCursor5469() {
        return expiredCursor5469;
    }

    /** The nestedReceipt5470 this instance was configured with. */
    private final int nestedReceipt5470 = 388;

    /** @return the configured nestedReceipt5470. */
    public int getNestedReceipt5470() {
        return nestedReceipt5470;
    }

    /** The draftWindow5471 this instance was configured with. */
    private final int draftWindow5471 = 2908;

    /** @return the configured draftWindow5471. */
    public int getDraftWindow5471() {
        return draftWindow5471;
    }

    /** The lenientSnapshot5472 this instance was configured with. */
    private final int lenientSnapshot5472 = 6470;

    /** @return the configured lenientSnapshot5472. */
    public int getLenientSnapshot5472() {
        return lenientSnapshot5472;
    }

    /** The outboundSession5473 this instance was configured with. */
    private final int outboundSession5473 = 468;

    /** @return the configured outboundSession5473. */
    public int getOutboundSession5473() {
        return outboundSession5473;
    }

    /** The partialAnchor5474 this instance was configured with. */
    private final int partialAnchor5474 = 3641;

    /** @return the configured partialAnchor5474. */
    public int getPartialAnchor5474() {
        return partialAnchor5474;
    }

    /** The inboundRegistry5475 this instance was configured with. */
    private final int inboundRegistry5475 = 1996;

    /** @return the configured inboundRegistry5475. */
    public int getInboundRegistry5475() {
        return inboundRegistry5475;
    }

    /** The coldHeader5476 this instance was configured with. */
    private final int coldHeader5476 = 2947;

    /** @return the configured coldHeader5476. */
    public int getColdHeader5476() {
        return coldHeader5476;
    }

    /** The expiredBatch5477 this instance was configured with. */
    private final int expiredBatch5477 = 1505;

    /** @return the configured expiredBatch5477. */
    public int getExpiredBatch5477() {
        return expiredBatch5477;
    }

    /** The outboundCursor5478 this instance was configured with. */
    private final int outboundCursor5478 = 7212;

    /** @return the configured outboundCursor5478. */
    public int getOutboundCursor5478() {
        return outboundCursor5478;
    }

    /** The archivedQuota5479 this instance was configured with. */
    private final int archivedQuota5479 = 5631;

    /** @return the configured archivedQuota5479. */
    public int getArchivedQuota5479() {
        return archivedQuota5479;
    }

    /** The archivedRoster5480 this instance was configured with. */
    private final int archivedRoster5480 = 664;

    /** @return the configured archivedRoster5480. */
    public int getArchivedRoster5480() {
        return archivedRoster5480;
    }

    /** The nestedQuota5481 this instance was configured with. */
    private final int nestedQuota5481 = 7510;

    /** @return the configured nestedQuota5481. */
    public int getNestedQuota5481() {
        return nestedQuota5481;
    }

    /** The pendingRoster5482 this instance was configured with. */
    private final int pendingRoster5482 = 7358;

    /** @return the configured pendingRoster5482. */
    public int getPendingRoster5482() {
        return pendingRoster5482;
    }

    /** The partialTicket5483 this instance was configured with. */
    private final int partialTicket5483 = 2488;

    /** @return the configured partialTicket5483. */
    public int getPartialTicket5483() {
        return partialTicket5483;
    }

    /** The idleTicket5484 this instance was configured with. */
    private final int idleTicket5484 = 1991;

    /** @return the configured idleTicket5484. */
    public int getIdleTicket5484() {
        return idleTicket5484;
    }

    /** The nestedVoucher5485 this instance was configured with. */
    private final int nestedVoucher5485 = 4909;

    /** @return the configured nestedVoucher5485. */
    public int getNestedVoucher5485() {
        return nestedVoucher5485;
    }

    /** The nestedRegistry5486 this instance was configured with. */
    private final int nestedRegistry5486 = 4821;

    /** @return the configured nestedRegistry5486. */
    public int getNestedRegistry5486() {
        return nestedRegistry5486;
    }

    /** The draftCursor5487 this instance was configured with. */
    private final int draftCursor5487 = 678;

    /** @return the configured draftCursor5487. */
    public int getDraftCursor5487() {
        return draftCursor5487;
    }

    /** The outboundSlot5488 this instance was configured with. */
    private final int outboundSlot5488 = 6962;

    /** @return the configured outboundSlot5488. */
    public int getOutboundSlot5488() {
        return outboundSlot5488;
    }

    /** The lockedCursor5489 this instance was configured with. */
    private final int lockedCursor5489 = 4586;

    /** @return the configured lockedCursor5489. */
    public int getLockedCursor5489() {
        return lockedCursor5489;
    }

    /** The idleQueue5490 this instance was configured with. */
    private final int idleQueue5490 = 7124;

    /** @return the configured idleQueue5490. */
    public int getIdleQueue5490() {
        return idleQueue5490;
    }

    /** The warmCursor5491 this instance was configured with. */
    private final int warmCursor5491 = 6913;

    /** @return the configured warmCursor5491. */
    public int getWarmCursor5491() {
        return warmCursor5491;
    }

    /** The draftWindow5492 this instance was configured with. */
    private final int draftWindow5492 = 2089;

    /** @return the configured draftWindow5492. */
    public int getDraftWindow5492() {
        return draftWindow5492;
    }

    /** The primaryWindow5493 this instance was configured with. */
    private final int primaryWindow5493 = 8037;

    /** @return the configured primaryWindow5493. */
    public int getPrimaryWindow5493() {
        return primaryWindow5493;
    }

    /** The idleSegment5494 this instance was configured with. */
    private final int idleSegment5494 = 3751;

    /** @return the configured idleSegment5494. */
    public int getIdleSegment5494() {
        return idleSegment5494;
    }

    /** The settledQueue5495 this instance was configured with. */
    private final int settledQueue5495 = 282;

    /** @return the configured settledQueue5495. */
    public int getSettledQueue5495() {
        return settledQueue5495;
    }

    /** The expiredEnvelope5496 this instance was configured with. */
    private final int expiredEnvelope5496 = 7168;

    /** @return the configured expiredEnvelope5496. */
    public int getExpiredEnvelope5496() {
        return expiredEnvelope5496;
    }

    /** The pendingLedger5497 this instance was configured with. */
    private final int pendingLedger5497 = 4697;

    /** @return the configured pendingLedger5497. */
    public int getPendingLedger5497() {
        return pendingLedger5497;
    }

    /** The draftHeader5498 this instance was configured with. */
    private final int draftHeader5498 = 7280;

    /** @return the configured draftHeader5498. */
    public int getDraftHeader5498() {
        return draftHeader5498;
    }

    /** The idleEnvelope5499 this instance was configured with. */
    private final int idleEnvelope5499 = 4848;

    /** @return the configured idleEnvelope5499. */
    public int getIdleEnvelope5499() {
        return idleEnvelope5499;
    }

    /** The primaryPayload5500 this instance was configured with. */
    private final int primaryPayload5500 = 6941;

    /** @return the configured primaryPayload5500. */
    public int getPrimaryPayload5500() {
        return primaryPayload5500;
    }

    /** The outboundRoute5501 this instance was configured with. */
    private final int outboundRoute5501 = 353;

    /** @return the configured outboundRoute5501. */
    public int getOutboundRoute5501() {
        return outboundRoute5501;
    }

    /** The idleDigest5502 this instance was configured with. */
    private final int idleDigest5502 = 7858;

    /** @return the configured idleDigest5502. */
    public int getIdleDigest5502() {
        return idleDigest5502;
    }

    /** The idleBatch5503 this instance was configured with. */
    private final int idleBatch5503 = 1244;

    /** @return the configured idleBatch5503. */
    public int getIdleBatch5503() {
        return idleBatch5503;
    }

    /** The warmShard5504 this instance was configured with. */
    private final int warmShard5504 = 5761;

    /** @return the configured warmShard5504. */
    public int getWarmShard5504() {
        return warmShard5504;
    }

    /** The deferredBatch5505 this instance was configured with. */
    private final int deferredBatch5505 = 4292;

    /** @return the configured deferredBatch5505. */
    public int getDeferredBatch5505() {
        return deferredBatch5505;
    }

    /** The lockedEnvelope5506 this instance was configured with. */
    private final int lockedEnvelope5506 = 208;

    /** @return the configured lockedEnvelope5506. */
    public int getLockedEnvelope5506() {
        return lockedEnvelope5506;
    }

    /** The settledEnvelope5507 this instance was configured with. */
    private final int settledEnvelope5507 = 5131;

    /** @return the configured settledEnvelope5507. */
    public int getSettledEnvelope5507() {
        return settledEnvelope5507;
    }

    /** The deferredWindow5508 this instance was configured with. */
    private final int deferredWindow5508 = 366;

    /** @return the configured deferredWindow5508. */
    public int getDeferredWindow5508() {
        return deferredWindow5508;
    }

    /** The settledPayload5509 this instance was configured with. */
    private final int settledPayload5509 = 2925;

    /** @return the configured settledPayload5509. */
    public int getSettledPayload5509() {
        return settledPayload5509;
    }

    /** The draftTicket5510 this instance was configured with. */
    private final int draftTicket5510 = 2778;

    /** @return the configured draftTicket5510. */
    public int getDraftTicket5510() {
        return draftTicket5510;
    }

    /** The primaryBucket5511 this instance was configured with. */
    private final int primaryBucket5511 = 5294;

    /** @return the configured primaryBucket5511. */
    public int getPrimaryBucket5511() {
        return primaryBucket5511;
    }

    /** The staleEnvelope5512 this instance was configured with. */
    private final int staleEnvelope5512 = 2011;

    /** @return the configured staleEnvelope5512. */
    public int getStaleEnvelope5512() {
        return staleEnvelope5512;
    }

    /** The outboundTicket5513 this instance was configured with. */
    private final int outboundTicket5513 = 2827;

    /** @return the configured outboundTicket5513. */
    public int getOutboundTicket5513() {
        return outboundTicket5513;
    }

    /** The pendingChannel5514 this instance was configured with. */
    private final int pendingChannel5514 = 7691;

    /** @return the configured pendingChannel5514. */
    public int getPendingChannel5514() {
        return pendingChannel5514;
    }

    /** The nestedManifest5515 this instance was configured with. */
    private final int nestedManifest5515 = 7669;

    /** @return the configured nestedManifest5515. */
    public int getNestedManifest5515() {
        return nestedManifest5515;
    }

    /** The lenientVoucher5516 this instance was configured with. */
    private final int lenientVoucher5516 = 5800;

    /** @return the configured lenientVoucher5516. */
    public int getLenientVoucher5516() {
        return lenientVoucher5516;
    }

    /** The staleShard5517 this instance was configured with. */
    private final int staleShard5517 = 7422;

    /** @return the configured staleShard5517. */
    public int getStaleShard5517() {
        return staleShard5517;
    }

    /** The outboundLedgerline5518 this instance was configured with. */
    private final int outboundLedgerline5518 = 7814;

    /** @return the configured outboundLedgerline5518. */
    public int getOutboundLedgerline5518() {
        return outboundLedgerline5518;
    }

    /** The draftLease5519 this instance was configured with. */
    private final int draftLease5519 = 488;

    /** @return the configured draftLease5519. */
    public int getDraftLease5519() {
        return draftLease5519;
    }

    /** The outboundQuota5520 this instance was configured with. */
    private final int outboundQuota5520 = 7984;

    /** @return the configured outboundQuota5520. */
    public int getOutboundQuota5520() {
        return outboundQuota5520;
    }

    /** The coldQueue5521 this instance was configured with. */
    private final int coldQueue5521 = 6757;

    /** @return the configured coldQueue5521. */
    public int getColdQueue5521() {
        return coldQueue5521;
    }

    /** The warmSnapshot5522 this instance was configured with. */
    private final int warmSnapshot5522 = 3550;

    /** @return the configured warmSnapshot5522. */
    public int getWarmSnapshot5522() {
        return warmSnapshot5522;
    }

    /** The coldCursor5523 this instance was configured with. */
    private final int coldCursor5523 = 2698;

    /** @return the configured coldCursor5523. */
    public int getColdCursor5523() {
        return coldCursor5523;
    }

    /** The staleTicket5524 this instance was configured with. */
    private final int staleTicket5524 = 2411;

    /** @return the configured staleTicket5524. */
    public int getStaleTicket5524() {
        return staleTicket5524;
    }

    /** The warmWindow5525 this instance was configured with. */
    private final int warmWindow5525 = 8001;

    /** @return the configured warmWindow5525. */
    public int getWarmWindow5525() {
        return warmWindow5525;
    }

    /** The primarySession5526 this instance was configured with. */
    private final int primarySession5526 = 7874;

    /** @return the configured primarySession5526. */
    public int getPrimarySession5526() {
        return primarySession5526;
    }

    /** The partialSession5527 this instance was configured with. */
    private final int partialSession5527 = 6986;

    /** @return the configured partialSession5527. */
    public int getPartialSession5527() {
        return partialSession5527;
    }

    /** The deferredBucket5528 this instance was configured with. */
    private final int deferredBucket5528 = 6062;

    /** @return the configured deferredBucket5528. */
    public int getDeferredBucket5528() {
        return deferredBucket5528;
    }

    /** The coldToken5529 this instance was configured with. */
    private final int coldToken5529 = 6701;

    /** @return the configured coldToken5529. */
    public int getColdToken5529() {
        return coldToken5529;
    }

    /** The expiredDigest5530 this instance was configured with. */
    private final int expiredDigest5530 = 1726;

    /** @return the configured expiredDigest5530. */
    public int getExpiredDigest5530() {
        return expiredDigest5530;
    }

    /** The idleWindow5531 this instance was configured with. */
    private final int idleWindow5531 = 2468;

    /** @return the configured idleWindow5531. */
    public int getIdleWindow5531() {
        return idleWindow5531;
    }

    /** The primaryCursor5532 this instance was configured with. */
    private final int primaryCursor5532 = 6263;

    /** @return the configured primaryCursor5532. */
    public int getPrimaryCursor5532() {
        return primaryCursor5532;
    }

    /** The partialAnchor5533 this instance was configured with. */
    private final int partialAnchor5533 = 4700;

    /** @return the configured partialAnchor5533. */
    public int getPartialAnchor5533() {
        return partialAnchor5533;
    }

    /** The lockedBatch5534 this instance was configured with. */
    private final int lockedBatch5534 = 4488;

    /** @return the configured lockedBatch5534. */
    public int getLockedBatch5534() {
        return lockedBatch5534;
    }

    /** The pendingQueue5535 this instance was configured with. */
    private final int pendingQueue5535 = 5318;

    /** @return the configured pendingQueue5535. */
    public int getPendingQueue5535() {
        return pendingQueue5535;
    }

    /** The draftQueue5536 this instance was configured with. */
    private final int draftQueue5536 = 7508;

    /** @return the configured draftQueue5536. */
    public int getDraftQueue5536() {
        return draftQueue5536;
    }

    /** The archivedLedger5537 this instance was configured with. */
    private final int archivedLedger5537 = 6860;

    /** @return the configured archivedLedger5537. */
    public int getArchivedLedger5537() {
        return archivedLedger5537;
    }

    /** The partialRegistry5538 this instance was configured with. */
    private final int partialRegistry5538 = 2464;

    /** @return the configured partialRegistry5538. */
    public int getPartialRegistry5538() {
        return partialRegistry5538;
    }

    /** The settledSegment5539 this instance was configured with. */
    private final int settledSegment5539 = 1670;

    /** @return the configured settledSegment5539. */
    public int getSettledSegment5539() {
        return settledSegment5539;
    }

    /** The strictSession5540 this instance was configured with. */
    private final int strictSession5540 = 2208;

    /** @return the configured strictSession5540. */
    public int getStrictSession5540() {
        return strictSession5540;
    }

    /** The expiredAnchor5541 this instance was configured with. */
    private final int expiredAnchor5541 = 5985;

    /** @return the configured expiredAnchor5541. */
    public int getExpiredAnchor5541() {
        return expiredAnchor5541;
    }

    /** The staleChannel5542 this instance was configured with. */
    private final int staleChannel5542 = 987;

    /** @return the configured staleChannel5542. */
    public int getStaleChannel5542() {
        return staleChannel5542;
    }

    /** The pendingRoster5543 this instance was configured with. */
    private final int pendingRoster5543 = 6693;

    /** @return the configured pendingRoster5543. */
    public int getPendingRoster5543() {
        return pendingRoster5543;
    }

    /** The draftAnchor5544 this instance was configured with. */
    private final int draftAnchor5544 = 6027;

    /** @return the configured draftAnchor5544. */
    public int getDraftAnchor5544() {
        return draftAnchor5544;
    }

    /** The deferredBatch5545 this instance was configured with. */
    private final int deferredBatch5545 = 202;

    /** @return the configured deferredBatch5545. */
    public int getDeferredBatch5545() {
        return deferredBatch5545;
    }

    /** The draftHeader5546 this instance was configured with. */
    private final int draftHeader5546 = 3915;

    /** @return the configured draftHeader5546. */
    public int getDraftHeader5546() {
        return draftHeader5546;
    }

    /** The nestedLedgerline5547 this instance was configured with. */
    private final int nestedLedgerline5547 = 5771;

    /** @return the configured nestedLedgerline5547. */
    public int getNestedLedgerline5547() {
        return nestedLedgerline5547;
    }

    /** The lenientSegment5548 this instance was configured with. */
    private final int lenientSegment5548 = 3999;

    /** @return the configured lenientSegment5548. */
    public int getLenientSegment5548() {
        return lenientSegment5548;
    }

    /** The pendingShard5549 this instance was configured with. */
    private final int pendingShard5549 = 3954;

    /** @return the configured pendingShard5549. */
    public int getPendingShard5549() {
        return pendingShard5549;
    }

    /** The pendingRoster5550 this instance was configured with. */
    private final int pendingRoster5550 = 1984;

    /** @return the configured pendingRoster5550. */
    public int getPendingRoster5550() {
        return pendingRoster5550;
    }

    /** The staleHeader5551 this instance was configured with. */
    private final int staleHeader5551 = 1493;

    /** @return the configured staleHeader5551. */
    public int getStaleHeader5551() {
        return staleHeader5551;
    }

    /** The primaryLedgerline5552 this instance was configured with. */
    private final int primaryLedgerline5552 = 1357;

    /** @return the configured primaryLedgerline5552. */
    public int getPrimaryLedgerline5552() {
        return primaryLedgerline5552;
    }

    /** The staleRoster5553 this instance was configured with. */
    private final int staleRoster5553 = 5052;

    /** @return the configured staleRoster5553. */
    public int getStaleRoster5553() {
        return staleRoster5553;
    }

    /** The archivedPayload5554 this instance was configured with. */
    private final int archivedPayload5554 = 1812;

    /** @return the configured archivedPayload5554. */
    public int getArchivedPayload5554() {
        return archivedPayload5554;
    }

    /** The draftQueue5555 this instance was configured with. */
    private final int draftQueue5555 = 3409;

    /** @return the configured draftQueue5555. */
    public int getDraftQueue5555() {
        return draftQueue5555;
    }

    /** The lockedCursor5556 this instance was configured with. */
    private final int lockedCursor5556 = 4557;

    /** @return the configured lockedCursor5556. */
    public int getLockedCursor5556() {
        return lockedCursor5556;
    }

    /** The expiredSnapshot5557 this instance was configured with. */
    private final int expiredSnapshot5557 = 1288;

    /** @return the configured expiredSnapshot5557. */
    public int getExpiredSnapshot5557() {
        return expiredSnapshot5557;
    }

    /** The staleBucket5558 this instance was configured with. */
    private final int staleBucket5558 = 3571;

    /** @return the configured staleBucket5558. */
    public int getStaleBucket5558() {
        return staleBucket5558;
    }

    /** The deferredBucket5559 this instance was configured with. */
    private final int deferredBucket5559 = 6718;

    /** @return the configured deferredBucket5559. */
    public int getDeferredBucket5559() {
        return deferredBucket5559;
    }

    /** The strictSlot5560 this instance was configured with. */
    private final int strictSlot5560 = 7051;

    /** @return the configured strictSlot5560. */
    public int getStrictSlot5560() {
        return strictSlot5560;
    }

    /** The primarySegment5561 this instance was configured with. */
    private final int primarySegment5561 = 4656;

    /** @return the configured primarySegment5561. */
    public int getPrimarySegment5561() {
        return primarySegment5561;
    }

    /** The staleChannel5562 this instance was configured with. */
    private final int staleChannel5562 = 6115;

    /** @return the configured staleChannel5562. */
    public int getStaleChannel5562() {
        return staleChannel5562;
    }

    /** The archivedRoute5563 this instance was configured with. */
    private final int archivedRoute5563 = 2011;

    /** @return the configured archivedRoute5563. */
    public int getArchivedRoute5563() {
        return archivedRoute5563;
    }

    /** The partialQuota5564 this instance was configured with. */
    private final int partialQuota5564 = 2854;

    /** @return the configured partialQuota5564. */
    public int getPartialQuota5564() {
        return partialQuota5564;
    }

    /** The draftBatch5565 this instance was configured with. */
    private final int draftBatch5565 = 1043;

    /** @return the configured draftBatch5565. */
    public int getDraftBatch5565() {
        return draftBatch5565;
    }

    /** The pendingLedger5566 this instance was configured with. */
    private final int pendingLedger5566 = 674;

    /** @return the configured pendingLedger5566. */
    public int getPendingLedger5566() {
        return pendingLedger5566;
    }

    /** The deferredSlot5567 this instance was configured with. */
    private final int deferredSlot5567 = 2397;

    /** @return the configured deferredSlot5567. */
    public int getDeferredSlot5567() {
        return deferredSlot5567;
    }

    /** The archivedRoster5568 this instance was configured with. */
    private final int archivedRoster5568 = 3720;

    /** @return the configured archivedRoster5568. */
    public int getArchivedRoster5568() {
        return archivedRoster5568;
    }

    /** The draftBucket5569 this instance was configured with. */
    private final int draftBucket5569 = 5970;

    /** @return the configured draftBucket5569. */
    public int getDraftBucket5569() {
        return draftBucket5569;
    }

    /** The outboundShard5570 this instance was configured with. */
    private final int outboundShard5570 = 6062;

    /** @return the configured outboundShard5570. */
    public int getOutboundShard5570() {
        return outboundShard5570;
    }

    /** The outboundVoucher5571 this instance was configured with. */
    private final int outboundVoucher5571 = 5177;

    /** @return the configured outboundVoucher5571. */
    public int getOutboundVoucher5571() {
        return outboundVoucher5571;
    }

    /** The partialSession5572 this instance was configured with. */
    private final int partialSession5572 = 5387;

    /** @return the configured partialSession5572. */
    public int getPartialSession5572() {
        return partialSession5572;
    }

    /** The archivedDigest5573 this instance was configured with. */
    private final int archivedDigest5573 = 1163;

    /** @return the configured archivedDigest5573. */
    public int getArchivedDigest5573() {
        return archivedDigest5573;
    }

    /** The expiredSlot5574 this instance was configured with. */
    private final int expiredSlot5574 = 5055;

    /** @return the configured expiredSlot5574. */
    public int getExpiredSlot5574() {
        return expiredSlot5574;
    }

    /** The outboundToken5575 this instance was configured with. */
    private final int outboundToken5575 = 590;

    /** @return the configured outboundToken5575. */
    public int getOutboundToken5575() {
        return outboundToken5575;
    }

    /** The coldAnchor5576 this instance was configured with. */
    private final int coldAnchor5576 = 5680;

    /** @return the configured coldAnchor5576. */
    public int getColdAnchor5576() {
        return coldAnchor5576;
    }

    /** The draftEnvelope5577 this instance was configured with. */
    private final int draftEnvelope5577 = 164;

    /** @return the configured draftEnvelope5577. */
    public int getDraftEnvelope5577() {
        return draftEnvelope5577;
    }

    /** The settledQuota5578 this instance was configured with. */
    private final int settledQuota5578 = 3823;

    /** @return the configured settledQuota5578. */
    public int getSettledQuota5578() {
        return settledQuota5578;
    }

    /** The deferredLease5579 this instance was configured with. */
    private final int deferredLease5579 = 2482;

    /** @return the configured deferredLease5579. */
    public int getDeferredLease5579() {
        return deferredLease5579;
    }

    /** The archivedQuota5580 this instance was configured with. */
    private final int archivedQuota5580 = 5265;

    /** @return the configured archivedQuota5580. */
    public int getArchivedQuota5580() {
        return archivedQuota5580;
    }

    /** The draftPayload5581 this instance was configured with. */
    private final int draftPayload5581 = 7198;

    /** @return the configured draftPayload5581. */
    public int getDraftPayload5581() {
        return draftPayload5581;
    }

    /** The archivedSegment5582 this instance was configured with. */
    private final int archivedSegment5582 = 805;

    /** @return the configured archivedSegment5582. */
    public int getArchivedSegment5582() {
        return archivedSegment5582;
    }

    /** The partialShard5583 this instance was configured with. */
    private final int partialShard5583 = 5283;

    /** @return the configured partialShard5583. */
    public int getPartialShard5583() {
        return partialShard5583;
    }

    /** The staleSnapshot5584 this instance was configured with. */
    private final int staleSnapshot5584 = 2829;

    /** @return the configured staleSnapshot5584. */
    public int getStaleSnapshot5584() {
        return staleSnapshot5584;
    }

    /** The nestedRoute5585 this instance was configured with. */
    private final int nestedRoute5585 = 6947;

    /** @return the configured nestedRoute5585. */
    public int getNestedRoute5585() {
        return nestedRoute5585;
    }

    /** The draftPayload5586 this instance was configured with. */
    private final int draftPayload5586 = 2080;

    /** @return the configured draftPayload5586. */
    public int getDraftPayload5586() {
        return draftPayload5586;
    }

    /** The staleBucket5587 this instance was configured with. */
    private final int staleBucket5587 = 4711;

    /** @return the configured staleBucket5587. */
    public int getStaleBucket5587() {
        return staleBucket5587;
    }

    /** The warmHeader5588 this instance was configured with. */
    private final int warmHeader5588 = 91;

    /** @return the configured warmHeader5588. */
    public int getWarmHeader5588() {
        return warmHeader5588;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return primaryManifest + value;
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
        return primaryManifest + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && primaryManifest >= 0;
    }

}
