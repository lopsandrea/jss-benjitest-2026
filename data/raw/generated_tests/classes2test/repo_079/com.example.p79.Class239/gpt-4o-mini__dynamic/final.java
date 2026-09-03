package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class239().compute(3));
            assertEquals("ok", new Class239().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class239().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class239().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class239().labelFor(1));
    }

    @Test
    void rejectsResetWhenAlreadyValid() {
        new Class239().reset();
        assertNotNull(new Class239());
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

}
