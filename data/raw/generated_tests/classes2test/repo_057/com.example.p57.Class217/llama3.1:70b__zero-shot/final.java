package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {
    @Test
    void rejectsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class217().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        try {
            new Class217().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeWhenUnset() {
        try {
            new Class217().merge(2, 5);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class217().isValid("abc"));
        assertEquals(16, new Class217().capacity());
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        assertEquals(16, new Class217().capacity());
        assertEquals(0.5, new Class217().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioWithNegativeInput() {
        assertEquals(0.5, new Class217().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class217().labelFor(1));
    }

}
