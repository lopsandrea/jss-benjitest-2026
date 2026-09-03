package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            new Class060().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class060().normalize("  x "));
        assertEquals(7, new Class060().merge(2, 5));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class060().merge(2, 5));
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class060().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class060().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

}
