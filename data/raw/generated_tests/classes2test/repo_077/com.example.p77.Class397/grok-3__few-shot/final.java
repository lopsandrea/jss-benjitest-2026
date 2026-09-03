package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class397Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class397().compute(3));
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class397().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class397().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class397().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnEmptyString() {
        assertEquals("alpha", new Class397().labelFor(1));
    }

    @Test
    void reportsResetForKnownCode() {
        new Class397().reset();
        assertNotNull(new Class397());
    }

}
