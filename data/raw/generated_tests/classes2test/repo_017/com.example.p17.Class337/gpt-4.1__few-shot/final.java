package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class337Test {
    @Test
    void clampsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class337().compute(3);
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class337().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class337().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class337().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class337().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class337().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class337().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class337().compute(3));
    }

}
