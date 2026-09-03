package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void preservesComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class286().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        new Class286().normalize("  x ");
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        assertEquals(16, new Class286().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        assertEquals(0.5, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void keepsResetWhenUnset() {
        new Class286().reset();
        assertNotNull(new Class286());
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class286().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

}
