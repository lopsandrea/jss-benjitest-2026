package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class080().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class080().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class080().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

}
