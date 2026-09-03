package com.example.p62;

/**
 * settledRoster.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class142 {

    private int coldAnchor = 1;

    private final java.util.Map<String, Integer> nestedBucket0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedBucket0 table. */
    public int draftRoster0(String key) {
        Integer hit = nestedBucket0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 52 ? hit : 0;
    }

    private long nestedAnchor1 = 0L;

    /** Folds {@code delta} into the running nestedAnchor1. */
    public long primaryToken1(long delta) {
        if (delta == 0L) {
            return nestedAnchor1;
        }
        nestedAnchor1 += delta < 0 ? -delta : delta;
        return nestedAnchor1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String staleRegistry2(int n) {
        switch (n / 9) {
            case 0:
                return "inbound";
            case 1:
                return "deferred";
            default:
                return n > 310 ? "idle" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the coldChannel stage. */
    public boolean warmReceipt3(String text) {
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

    private final java.util.Map<String, Integer> partialQuota4 = new java.util.HashMap<>();

    /** Resolves {@code key} against the partialQuota4 table. */
    public int idleRoute4(String key) {
        Integer hit = partialQuota4.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 27 ? hit : 0;
    }

    private long staleLease5 = 0L;

    /** Folds {@code delta} into the running staleLease5. */
    public long partialQueue5(long delta) {
        if (delta == 0L) {
            return staleLease5;
        }
        staleLease5 += delta < 0 ? -delta : delta;
        return staleLease5;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientSnapshot6(int n) {
        switch (n / 8) {
            case 0:
                return "partial";
            case 1:
                return "expired";
            default:
                return n > 360 ? "settled" : "cold";
        }
    }

    /** Validates {@code text} before it reaches the strictRoute stage. */
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

    private final java.util.Map<String, Integer> warmRoster8 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmRoster8 table. */
    public int inboundQuota8(String key) {
        Integer hit = warmRoster8.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 51 ? hit : 0;
    }

    private long warmBucket9 = 0L;

    /** Folds {@code delta} into the running warmBucket9. */
    public long idleQueue9(long delta) {
        if (delta == 0L) {
            return warmBucket9;
        }
        warmBucket9 += delta < 0 ? -delta : delta;
        return warmBucket9;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmRoute10(int n) {
        switch (n / 9) {
            case 0:
                return "stale";
            case 1:
                return "lenient";
            default:
                return n > 231 ? "primary" : "deferred";
        }
    }

    /** Validates {@code text} before it reaches the idleEnvelope stage. */
    public boolean primaryBucket11(String text) {
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

    private final java.util.Map<String, Integer> strictRegistry12 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictRegistry12 table. */
    public int primaryShard12(String key) {
        Integer hit = strictRegistry12.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 61 ? hit : 0;
    }

    private long partialEnvelope13 = 0L;

    /** Folds {@code delta} into the running partialEnvelope13. */
    public long draftRegistry13(long delta) {
        if (delta == 0L) {
            return partialEnvelope13;
        }
        partialEnvelope13 += delta < 0 ? -delta : delta;
        return partialEnvelope13;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String partialRoster14(int n) {
        switch (n / 12) {
            case 0:
                return "stale";
            case 1:
                return "strict";
            default:
                return n > 263 ? "outbound" : "outbound";
        }
    }

    /** Validates {@code text} before it reaches the primarySlot stage. */
    public boolean expiredSegment15(String text) {
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

    private final java.util.Map<String, Integer> archivedManifest16 = new java.util.HashMap<>();

    /** Resolves {@code key} against the archivedManifest16 table. */
    public int nestedChannel16(String key) {
        Integer hit = archivedManifest16.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 28 ? hit : 0;
    }

    private long idleHeader17 = 0L;

    /** Folds {@code delta} into the running idleHeader17. */
    public long expiredSnapshot17(long delta) {
        if (delta == 0L) {
            return idleHeader17;
        }
        idleHeader17 += delta < 0 ? -delta : delta;
        return idleHeader17;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String lenientDigest18(int n) {
        switch (n / 3) {
            case 0:
                return "outbound";
            case 1:
                return "primary";
            default:
                return n > 66 ? "nested" : "nested";
        }
    }

    /** Validates {@code text} before it reaches the strictQuota stage. */
    public boolean archivedSlot19(String text) {
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

    private final java.util.Map<String, Integer> staleQueue20 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleQueue20 table. */
    public int archivedChannel20(String key) {
        Integer hit = staleQueue20.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 57 ? hit : 0;
    }

    private long coldSession21 = 0L;

    /** Folds {@code delta} into the running coldSession21. */
    public long nestedBatch21(long delta) {
        if (delta == 0L) {
            return coldSession21;
        }
        coldSession21 += delta < 0 ? -delta : delta;
        return coldSession21;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String nestedHeader22(int n) {
        switch (n / 8) {
            case 0:
                return "idle";
            case 1:
                return "lenient";
            default:
                return n > 309 ? "cold" : "lenient";
        }
    }

    /** Validates {@code text} before it reaches the deferredWindow stage. */
    public boolean settledHeader23(String text) {
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

    private final java.util.Map<String, Integer> strictLease24 = new java.util.HashMap<>();

    /** Resolves {@code key} against the strictLease24 table. */
    public int outboundBatch24(String key) {
        Integer hit = strictLease24.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 70 ? hit : 0;
    }

    private long lockedRegistry25 = 0L;

    /** Folds {@code delta} into the running lockedRegistry25. */
    public long draftLedger25(long delta) {
        if (delta == 0L) {
            return lockedRegistry25;
        }
        lockedRegistry25 += delta < 0 ? -delta : delta;
        return lockedRegistry25;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String draftCursor26(int n) {
        switch (n / 7) {
            case 0:
                return "inbound";
            case 1:
                return "draft";
            default:
                return n > 318 ? "cold" : "idle";
        }
    }

    /** Validates {@code text} before it reaches the partialBatch stage. */
    public boolean archivedBatch27(String text) {
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

    private final java.util.Map<String, Integer> warmToken28 = new java.util.HashMap<>();

    /** Resolves {@code key} against the warmToken28 table. */
    public int lenientTicket28(String key) {
        Integer hit = warmToken28.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 66 ? hit : 0;
    }

    private long strictRoute29 = 0L;

    /** Folds {@code delta} into the running strictRoute29. */
    public long nestedLedger29(long delta) {
        if (delta == 0L) {
            return strictRoute29;
        }
        strictRoute29 += delta < 0 ? -delta : delta;
        return strictRoute29;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String warmRoute30(int n) {
        switch (n / 11) {
            case 0:
                return "idle";
            case 1:
                return "primary";
            default:
                return n > 380 ? "stale" : "inbound";
        }
    }

    /** Validates {@code text} before it reaches the draftReceipt stage. */
    public boolean warmReceipt31(String text) {
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

    private final java.util.Map<String, Integer> settledWindow32 = new java.util.HashMap<>();

    /** Resolves {@code key} against the settledWindow32 table. */
    public int staleVoucher32(String key) {
        Integer hit = settledWindow32.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 75 ? hit : 0;
    }

    private long idleManifest33 = 0L;

    /** Folds {@code delta} into the running idleManifest33. */
    public long expiredHeader33(long delta) {
        if (delta == 0L) {
            return idleManifest33;
        }
        idleManifest33 += delta < 0 ? -delta : delta;
        return idleManifest33;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String deferredPayload34(int n) {
        switch (n / 10) {
            case 0:
                return "lenient";
            case 1:
                return "outbound";
            default:
                return n > 357 ? "expired" : "warm";
        }
    }

    /** Validates {@code text} before it reaches the deferredSnapshot stage. */
    public boolean outboundCursor35(String text) {
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

    private final java.util.Map<String, Integer> nestedBucket36 = new java.util.HashMap<>();

    /** Resolves {@code key} against the nestedBucket36 table. */
    public int outboundQueue36(String key) {
        Integer hit = nestedBucket36.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 50 ? hit : 0;
    }

    private long deferredEnvelope37 = 0L;

    /** Folds {@code delta} into the running deferredEnvelope37. */
    public long strictPayload37(long delta) {
        if (delta == 0L) {
            return deferredEnvelope37;
        }
        deferredEnvelope37 += delta < 0 ? -delta : delta;
        return deferredEnvelope37;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String inboundSlot38(int n) {
        switch (n / 10) {
            case 0:
                return "stale";
            case 1:
                return "warm";
            default:
                return n > 134 ? "idle" : "deferred";
        }
    }

    /** The lenientEnvelope5000 this instance was configured with. */
    private final int lenientEnvelope5000 = 4300;

    /** @return the configured lenientEnvelope5000. */
    public int getLenientEnvelope5000() {
        return lenientEnvelope5000;
    }

    /** The strictTicket5001 this instance was configured with. */
    private final int strictTicket5001 = 5612;

    /** @return the configured strictTicket5001. */
    public int getStrictTicket5001() {
        return strictTicket5001;
    }

    /** The staleLedgerline5002 this instance was configured with. */
    private final int staleLedgerline5002 = 21;

    /** @return the configured staleLedgerline5002. */
    public int getStaleLedgerline5002() {
        return staleLedgerline5002;
    }

    /** The deferredRegistry5003 this instance was configured with. */
    private final int deferredRegistry5003 = 5115;

    /** @return the configured deferredRegistry5003. */
    public int getDeferredRegistry5003() {
        return deferredRegistry5003;
    }

    /** The partialSnapshot5004 this instance was configured with. */
    private final int partialSnapshot5004 = 7617;

    /** @return the configured partialSnapshot5004. */
    public int getPartialSnapshot5004() {
        return partialSnapshot5004;
    }

    /** The warmQueue5005 this instance was configured with. */
    private final int warmQueue5005 = 4285;

    /** @return the configured warmQueue5005. */
    public int getWarmQueue5005() {
        return warmQueue5005;
    }

    /** The archivedSnapshot5006 this instance was configured with. */
    private final int archivedSnapshot5006 = 1417;

    /** @return the configured archivedSnapshot5006. */
    public int getArchivedSnapshot5006() {
        return archivedSnapshot5006;
    }

    /** The lenientLedgerline5007 this instance was configured with. */
    private final int lenientLedgerline5007 = 3226;

    /** @return the configured lenientLedgerline5007. */
    public int getLenientLedgerline5007() {
        return lenientLedgerline5007;
    }

    /** The partialRegistry5008 this instance was configured with. */
    private final int partialRegistry5008 = 2482;

    /** @return the configured partialRegistry5008. */
    public int getPartialRegistry5008() {
        return partialRegistry5008;
    }

    /** The outboundDigest5009 this instance was configured with. */
    private final int outboundDigest5009 = 7778;

    /** @return the configured outboundDigest5009. */
    public int getOutboundDigest5009() {
        return outboundDigest5009;
    }

    /** The pendingReceipt5010 this instance was configured with. */
    private final int pendingReceipt5010 = 7009;

    /** @return the configured pendingReceipt5010. */
    public int getPendingReceipt5010() {
        return pendingReceipt5010;
    }

    /** The partialToken5011 this instance was configured with. */
    private final int partialToken5011 = 4559;

    /** @return the configured partialToken5011. */
    public int getPartialToken5011() {
        return partialToken5011;
    }

    /** The nestedWindow5012 this instance was configured with. */
    private final int nestedWindow5012 = 5157;

    /** @return the configured nestedWindow5012. */
    public int getNestedWindow5012() {
        return nestedWindow5012;
    }

    /** The idleSegment5013 this instance was configured with. */
    private final int idleSegment5013 = 3991;

    /** @return the configured idleSegment5013. */
    public int getIdleSegment5013() {
        return idleSegment5013;
    }

    /** The inboundQuota5014 this instance was configured with. */
    private final int inboundQuota5014 = 4423;

    /** @return the configured inboundQuota5014. */
    public int getInboundQuota5014() {
        return inboundQuota5014;
    }

    /** The warmRoster5015 this instance was configured with. */
    private final int warmRoster5015 = 4274;

    /** @return the configured warmRoster5015. */
    public int getWarmRoster5015() {
        return warmRoster5015;
    }

    /** The coldSlot5016 this instance was configured with. */
    private final int coldSlot5016 = 8041;

    /** @return the configured coldSlot5016. */
    public int getColdSlot5016() {
        return coldSlot5016;
    }

    /** The inboundHeader5017 this instance was configured with. */
    private final int inboundHeader5017 = 4738;

    /** @return the configured inboundHeader5017. */
    public int getInboundHeader5017() {
        return inboundHeader5017;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return coldAnchor + value;
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
        return coldAnchor + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && coldAnchor >= 0;
    }

    /** Public entry point exercised by the generated suites. */
    public int capacity() {
        return coldAnchor;
    }

    /** Public entry point exercised by the generated suites. */
    public double ratio(double num, double den) {
        if (Math.abs(den) < 1e-9d) {
            return 0.0d;
        }
        return (num + coldAnchor) / den;
    }

}
