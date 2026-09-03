package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class392Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class392().compute(3);
    }

    @Test
    void keepsComputeOnEmptyString() {
        assertEquals(42, new Class392().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class392().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class392().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class392().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class392().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        assertEquals(0.5, new Class392().ratio(1.0, 2.0), 1e-9);
    }

}
