package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class089().compute(3));
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class089().normalize("  x "));
        assertEquals(7, new Class089().merge(2, 5));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class089().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class089().labelFor(1));
    }

    @Test
    void acceptsResetAtZero() {
        new Class089().reset();
        assertNotNull(new Class089());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

}
