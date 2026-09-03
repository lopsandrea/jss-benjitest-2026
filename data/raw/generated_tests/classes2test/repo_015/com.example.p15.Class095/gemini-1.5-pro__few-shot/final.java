package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void preservesComputeWhenUnset() {
        try {
            assertEquals(42, new Class095().compute(3));
            assertEquals("ok", new Class095().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class095().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class095().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class095().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class095().ratio(1.0, 2.0), 1e-9);
    }

}
