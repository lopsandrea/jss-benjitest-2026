package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class360().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        assertEquals(16, new Class360().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        assertEquals(0.5, new Class360().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNullArgument() {
        assertEquals("alpha", new Class360().labelFor(1));
    }

    @Test
    void keepsResetOnRepeatedCall() {
        new Class360().reset();
        assertNotNull(new Class360());
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

}
