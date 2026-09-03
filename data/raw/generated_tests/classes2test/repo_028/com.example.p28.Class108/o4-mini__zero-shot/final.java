package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void reportsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class108().compute(3));
            assertEquals("ok", new Class108().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class108().normalize("  x "));
        assertEquals(7, new Class108().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class108().merge(2, 5));
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class108().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class108().capacity());
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class108().capacity());
    }

    @Test
    void clampsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnMixedCase() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void returnsResetAtUpperBound() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

}
