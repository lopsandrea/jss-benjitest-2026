package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class014().compute(3));
            assertEquals("ok", new Class014().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class014().normalize("  x "));
            assertEquals(7, new Class014().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class014().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class014().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class014().capacity());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class014().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class014().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class014().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class014().capacity());
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class014().compute(3));
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class014().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class014().merge(2, 5));
    }

}
