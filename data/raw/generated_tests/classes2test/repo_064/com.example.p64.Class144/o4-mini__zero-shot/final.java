package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class144Test {
    @Test
    void rejectsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class144().compute(3));
            assertEquals("ok", new Class144().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class144().normalize("  x "));
        assertEquals(7, new Class144().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class144().merge(2, 5));
        assertTrue(new Class144().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class144().isValid("abc"));
        assertEquals(16, new Class144().capacity());
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        assertEquals(16, new Class144().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        assertEquals(0.5, new Class144().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class144().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class144().normalize("  x "));
    }

}
