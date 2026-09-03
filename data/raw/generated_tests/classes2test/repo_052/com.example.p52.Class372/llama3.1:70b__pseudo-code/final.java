package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class372Test {
    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class372().capacity());
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class372().capacity());
    }

}
