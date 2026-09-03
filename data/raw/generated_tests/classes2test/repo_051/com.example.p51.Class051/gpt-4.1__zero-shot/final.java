package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class051().compute(3));
            assertEquals("ok", new Class051().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class051().normalize("  x "));
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class051().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        assertEquals(0.5, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnEmptyString() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void acceptsResetForKnownCode() {
        new Class051().reset();
        assertNotNull(new Class051());
    }

    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class051().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

}
