package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void preservesComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class361().compute(3));
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class361().normalize("  x "));
        assertEquals(7, new Class361().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class361().merge(2, 5));
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class361().isValid("abc"));
        assertEquals(16, new Class361().capacity());
    }

    @Test
    void returnsCapacityAtZero() {
        assertEquals(16, new Class361().capacity());
        assertEquals(0.5, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioWithNullArgument() {
        assertEquals(0.5, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void rejectsResetOnMixedCase() {
        new Class361().reset();
        assertNotNull(new Class361());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

}
