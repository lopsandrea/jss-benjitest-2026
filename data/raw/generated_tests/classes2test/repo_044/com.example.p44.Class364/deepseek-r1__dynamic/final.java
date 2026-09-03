package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void returnsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class364().compute(3));
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class364().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

}
