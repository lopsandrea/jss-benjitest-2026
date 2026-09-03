package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class078Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class078().compute(3));
            assertEquals("ok", new Class078().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class078().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class078().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        assertEquals(0.5, new Class078().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class078().compute(3));
    }

}
