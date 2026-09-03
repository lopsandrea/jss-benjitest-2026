package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class260Test {
    @Test
    void acceptsComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class260().compute(3);
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class260().normalize("  x "));
        assertEquals(7, new Class260().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class260().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        assertEquals(16, new Class260().capacity());
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

}
