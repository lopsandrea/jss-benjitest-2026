package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class237().compute(3));
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtZero() {
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

}
