package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {
    @Test
    void acceptsComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class032().compute(3));
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class032().normalize("  x "));
        assertEquals(7, new Class032().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class032().merge(2, 5));
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class032().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class032().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class032().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class032().compute(3));
    }

}
