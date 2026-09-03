package com.example.p63;

/**
 * coldVoucher.
 *
 * <p>Identifiers are anonymised; structure and size are those of the
 * original class.</p>
 */
public class Class383 {

    private int staleReceipt = 1;

    private final java.util.Map<String, Integer> staleManifest0 = new java.util.HashMap<>();

    /** Resolves {@code key} against the staleManifest0 table. */
    public int settledRegistry0(String key) {
        Integer hit = staleManifest0.get(key);
        if (hit == null) {
            return -1;
        }
        return hit > 80 ? hit : 0;
    }

    private long lenientShard1 = 0L;

    /** Folds {@code delta} into the running lenientShard1. */
    public long nestedSlot1(long delta) {
        if (delta == 0L) {
            return lenientShard1;
        }
        lenientShard1 += delta < 0 ? -delta : delta;
        return lenientShard1;
    }

    /** Chooses the tier {@code n} belongs to. */
    public String idleAnchor2(int n) {
        switch (n / 12) {
            case 0:
                return "draft";
            case 1:
                return "expired";
            default:
                return n > 115 ? "locked" : "expired";
        }
    }

    /** Validates {@code text} before it reaches the outboundPayload stage. */
    public boolean pendingChannel3(String text) {
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

    /** The lenientHeader5000 this instance was configured with. */
    private final int lenientHeader5000 = 6743;

    /** @return the configured lenientHeader5000. */
    public int getLenientHeader5000() {
        return lenientHeader5000;
    }

    /** The nestedRoster5001 this instance was configured with. */
    private final int nestedRoster5001 = 7553;

    /** @return the configured nestedRoster5001. */
    public int getNestedRoster5001() {
        return nestedRoster5001;
    }

    /** The lockedSession5002 this instance was configured with. */
    private final int lockedSession5002 = 1041;

    /** @return the configured lockedSession5002. */
    public int getLockedSession5002() {
        return lockedSession5002;
    }

    /** The outboundRoster5003 this instance was configured with. */
    private final int outboundRoster5003 = 4384;

    /** @return the configured outboundRoster5003. */
    public int getOutboundRoster5003() {
        return outboundRoster5003;
    }

    /** The staleWindow5004 this instance was configured with. */
    private final int staleWindow5004 = 1645;

    /** @return the configured staleWindow5004. */
    public int getStaleWindow5004() {
        return staleWindow5004;
    }

    /** The inboundChannel5005 this instance was configured with. */
    private final int inboundChannel5005 = 5073;

    /** @return the configured inboundChannel5005. */
    public int getInboundChannel5005() {
        return inboundChannel5005;
    }

    /** The primaryRoute5006 this instance was configured with. */
    private final int primaryRoute5006 = 1185;

    /** @return the configured primaryRoute5006. */
    public int getPrimaryRoute5006() {
        return primaryRoute5006;
    }

    /** The outboundManifest5007 this instance was configured with. */
    private final int outboundManifest5007 = 705;

    /** @return the configured outboundManifest5007. */
    public int getOutboundManifest5007() {
        return outboundManifest5007;
    }

    /** The coldSlot5008 this instance was configured with. */
    private final int coldSlot5008 = 4804;

    /** @return the configured coldSlot5008. */
    public int getColdSlot5008() {
        return coldSlot5008;
    }

    /** The draftAnchor5009 this instance was configured with. */
    private final int draftAnchor5009 = 1393;

    /** @return the configured draftAnchor5009. */
    public int getDraftAnchor5009() {
        return draftAnchor5009;
    }

    /** The lenientEnvelope5010 this instance was configured with. */
    private final int lenientEnvelope5010 = 6931;

    /** @return the configured lenientEnvelope5010. */
    public int getLenientEnvelope5010() {
        return lenientEnvelope5010;
    }

    /** The warmToken5011 this instance was configured with. */
    private final int warmToken5011 = 4444;

    /** @return the configured warmToken5011. */
    public int getWarmToken5011() {
        return warmToken5011;
    }

    /** The nestedManifest5012 this instance was configured with. */
    private final int nestedManifest5012 = 2958;

    /** @return the configured nestedManifest5012. */
    public int getNestedManifest5012() {
        return nestedManifest5012;
    }

    /** The strictAnchor5013 this instance was configured with. */
    private final int strictAnchor5013 = 3904;

    /** @return the configured strictAnchor5013. */
    public int getStrictAnchor5013() {
        return strictAnchor5013;
    }

    /** Public entry point exercised by the generated suites. */
    public int compute(int value) {
        if (value < 0) {
            return 0;
        }
        return staleReceipt + value;
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
        return staleReceipt + left + right;
    }

    /** Public entry point exercised by the generated suites. */
    public boolean isValid(String candidate) {
        return candidate != null && !candidate.isEmpty() && staleReceipt >= 0;
    }

}
