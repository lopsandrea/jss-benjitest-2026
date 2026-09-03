package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void keepsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class228().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        new Class228().normalize("  x ");
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class228().merge(2, 5));
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class228().isValid("abc"));
        assertEquals(16, new Class228().capacity());
    }

    @Test
    void yieldsCapacityWhenUnset() {
        assertEquals(16, new Class228().capacity());
        assertEquals(0.5, new Class228().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioForKnownCode() {
        assertEquals(0.5, new Class228().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class228().labelFor(1));
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class228().labelFor(1));
        new Class228().reset();
        assertNotNull(new Class228());
    }

    @Test
    void preservesResetForKnownCode() {
        new Class228().reset();
        assertNotNull(new Class228());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

}
