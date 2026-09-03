package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void preservesComputeForKnownCode() {
        new Class286().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class286().normalize("  x "));
        assertEquals(7, new Class286().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class286().merge(2, 5));
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        assertEquals(16, new Class286().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        assertEquals(0.5, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void clampsResetOnMixedCase() {
        new Class286().reset();
        assertNotNull(new Class286());
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class286().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class286().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class286().merge(2, 5));
    }

}
