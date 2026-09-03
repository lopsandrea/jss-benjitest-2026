package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class339().compute(3));
            assertEquals("ok", new Class339().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class339().normalize("  x "));
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class339().merge(2, 5));
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class339().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class339().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

}
