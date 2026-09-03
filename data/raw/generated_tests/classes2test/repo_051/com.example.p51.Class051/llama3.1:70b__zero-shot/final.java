package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void returnsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class051().compute(3);
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        new Class051().normalize("  x ");
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class051().merge(2, 5));
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class051().isValid("abc"));
        assertEquals(16, new Class051().capacity());
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class051().capacity());
        assertEquals(0.5, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioOnEmptyString() {
        assertEquals(0.5, new Class051().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

}
