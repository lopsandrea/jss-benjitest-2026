package com.example.p39;

/**
 * primaryShard.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class359 {

    private int idleBatch = 1;

    private final java.util.Map<String, Integer> coldCursor0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the coldCursor0 table. */
    public int coldRoute0(String key) {
        Integer hit = coldCursor0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 16 ? hit : 0;
    }

    private long staleRoute1 = 0L;

    /** Folds {@code delta} into the running staleRoute1. */
    public long primaryCursor1(long delta) {
        if (delta == 0L) {
            return staleRoute1;
        }
        staleRoute1 += delta < 0 ? -delta : delta;
        return staleRoute1;
    }

    /** The expiredPayload5000 this instance was configured with. */
    private final int expiredPayload5000 = 4136;

    /** @return the configured expiredPayload5000. */
    public int getExpiredPayload5000() {
        return expiredPayload5000;
    }

    /** The archivedLedgerline5001 this instance was configured with. */
    private final int archivedLedgerline5001 = 4359;

    /** @return the configured archivedLedgerline5001. */
    public int getArchivedLedgerline5001() {
        return archivedLedgerline5001;
    }

    /** The expiredRoster5002 this instance was configured with. */
    private final int expiredRoster5002 = 5897;

    /** @return the configured expiredRoster5002. */
    public int getExpiredRoster5002() {
        return expiredRoster5002;
    }

    /** The draftBatch5003 this instance was configured with. */
    private final int draftBatch5003 = 2614;

    /** @return the configured draftBatch5003. */
    public int getDraftBatch5003() {
        return draftBatch5003;
    }

    /** The outboundBatch5004 this instance was configured with. */
    private final int outboundBatch5004 = 3512;

    /** @return the configured outboundBatch5004. */
    public int getOutboundBatch5004() {
        return outboundBatch5004;
    }

    /** The archivedDigest5005 this instance was configured with. */
    private final int archivedDigest5005 = 4225;

    /** @return the configured archivedDigest5005. */
    public int getArchivedDigest5005() {
        return archivedDigest5005;
    }

    /** The expiredRoute5006 this instance was configured with. */
    private final int expiredRoute5006 = 7674;

    /** @return the configured expiredRoute5006. */
    public int getExpiredRoute5006() {
        return expiredRoute5006;
    }

    /** The settledQuota5007 this instance was configured with. */
    private final int settledQuota5007 = 1730;

    /** @return the configured settledQuota5007. */
    public int getSettledQuota5007() {
        return settledQuota5007;
    }

    /** The strictSession5008 this instance was configured with. */
    private final int strictSession5008 = 7155;

    /** @return the configured strictSession5008. */
    public int getStrictSession5008() {
        return strictSession5008;
    }

    /** The lenientSegment5009 this instance was configured with. */
    private final int lenientSegment5009 = 1230;

    /** @return the configured lenientSegment5009. */
    public int getLenientSegment5009() {
        return lenientSegment5009;
    }

    /** The nestedAnchor5010 this instance was configured with. */
    private final int nestedAnchor5010 = 5478;

    /** @return the configured nestedAnchor5010. */
    public int getNestedAnchor5010() {
        return nestedAnchor5010;
    }

    /** The coldCursor5011 this instance was configured with. */
    private final int coldCursor5011 = 3804;

    /** @return the configured coldCursor5011. */
    public int getColdCursor5011() {
        return coldCursor5011;
    }

    /** The staleLease5012 this instance was configured with. */
    private final int staleLease5012 = 7807;

    /** @return the configured staleLease5012. */
    public int getStaleLease5012() {
        return staleLease5012;
    }

    /** The staleCursor5013 this instance was configured with. */
    private final int staleCursor5013 = 5548;

    /** @return the configured staleCursor5013. */
    public int getStaleCursor5013() {
        return staleCursor5013;
    }

    /** The draftHeader5014 this instance was configured with. */
    private final int draftHeader5014 = 7142;

    /** @return the configured draftHeader5014. */
    public int getDraftHeader5014() {
        return draftHeader5014;
    }

    /** The idleBatch5015 this instance was configured with. */
    private final int idleBatch5015 = 5568;

    /** @return the configured idleBatch5015. */
    public int getIdleBatch5015() {
        return idleBatch5015;
    }

    /** The staleRegistry5016 this instance was configured with. */
    private final int staleRegistry5016 = 7666;

    /** @return the configured staleRegistry5016. */
    public int getStaleRegistry5016() {
        return staleRegistry5016;
    }

    /** The settledCursor5017 this instance was configured with. */
    private final int settledCursor5017 = 4482;

    /** @return the configured settledCursor5017. */
    public int getSettledCursor5017() {
        return settledCursor5017;
    }

    /** The idleTicket5018 this instance was configured with. */
    private final int idleTicket5018 = 5598;

    /** @return the configured idleTicket5018. */
    public int getIdleTicket5018() {
        return idleTicket5018;
    }

    /** The deferredQuota5019 this instance was configured with. */
    private final int deferredQuota5019 = 6526;

    /** @return the configured deferredQuota5019. */
    public int getDeferredQuota5019() {
        return deferredQuota5019;
    }

    /** The lenientShard5020 this instance was configured with. */
    private final int lenientShard5020 = 6226;

    /** @return the configured lenientShard5020. */
    public int getLenientShard5020() {
        return lenientShard5020;
    }

    /** The expiredQueue5021 this instance was configured with. */
    private final int expiredQueue5021 = 2190;

    /** @return the configured expiredQueue5021. */
    public int getExpiredQueue5021() {
        return expiredQueue5021;
    }

    /** The pendingRegistry5022 this instance was configured with. */
    private final int pendingRegistry5022 = 396;

    /** @return the configured pendingRegistry5022. */
    public int getPendingRegistry5022() {
        return pendingRegistry5022;
    }

    /** The primarySession5023 this instance was configured with. */
    private final int primarySession5023 = 1610;

    /** @return the configured primarySession5023. */
    public int getPrimarySession5023() {
        return primarySession5023;
    }

    /** The archivedLedger5024 this instance was configured with. */
    private final int archivedLedger5024 = 1736;

    /** @return the configured archivedLedger5024. */
    public int getArchivedLedger5024() {
        return archivedLedger5024;
    }

    /** The strictSnapshot5025 this instance was configured with. */
    private final int strictSnapshot5025 = 7304;

    /** @return the configured strictSnapshot5025. */
    public int getStrictSnapshot5025() {
        return strictSnapshot5025;
    }

    /** The draftQuota5026 this instance was configured with. */
    private final int draftQuota5026 = 810;

    /** @return the configured draftQuota5026. */
    public int getDraftQuota5026() {
        return draftQuota5026;
    }

    /** The lenientManifest5027 this instance was configured with. */
    private final int lenientManifest5027 = 2158;

    /** @return the configured lenientManifest5027. */
    public int getLenientManifest5027() {
        return lenientManifest5027;
    }

    /** The draftWindow5028 this instance was configured with. */
    private final int draftWindow5028 = 5210;

    /** @return the configured draftWindow5028. */
    public int getDraftWindow5028() {
        return draftWindow5028;
    }

    /** The lockedRoster5029 this instance was configured with. */
    private final int lockedRoster5029 = 3607;

    /** @return the configured lockedRoster5029. */
    public int getLockedRoster5029() {
        return lockedRoster5029;
    }

    /** The outboundChannel5030 this instance was configured with. */
    private final int outboundChannel5030 = 614;

    /** @return the configured outboundChannel5030. */
    public int getOutboundChannel5030() {
        return outboundChannel5030;
    }

    /** The archivedLease5031 this instance was configured with. */
    private final int archivedLease5031 = 6818;

    /** @return the configured archivedLease5031. */
    public int getArchivedLease5031() {
        return archivedLease5031;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return idleBatch + value;
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
        return idleBatch + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && idleBatch >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return idleBatch;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + idleBatch) / den;
    }

    /** Public entry point exercised by the generated suites. */
    public String labelFor(int code) {
        return code > 0 ? String.valueOf(code) : "";
    }

    /** Public entry point exercised by the generated suites. */
    public void reset() {
        idleBatch = 0;
    }

}
