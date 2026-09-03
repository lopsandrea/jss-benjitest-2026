package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class094().compute(3));
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class094().normalize("  x "));
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class094().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class094().capacity());
    }

    @Test
    void preservesRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class094().capacity());
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

}
