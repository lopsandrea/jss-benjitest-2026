package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class084().compute(3));
            assertEquals("ok", new Class084().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class084().normalize("  x "));
            assertEquals(7, new Class084().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        try {
            assertEquals(7, new Class084().merge(2, 5));
            assertTrue(new Class084().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        try {
            assertTrue(new Class084().isValid("abc"));
            assertEquals(16, new Class084().capacity());
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class084().capacity());
    }

    @Test
    void preservesRatioAtUpperBound() {
        assertEquals(0.5, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class084().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

}
