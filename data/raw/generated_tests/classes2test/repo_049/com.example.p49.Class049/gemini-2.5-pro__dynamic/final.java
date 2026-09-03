package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class049Test {
    @Test
    void keepsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class049().compute(3));
            assertEquals("ok", new Class049().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class049().normalize("  x "));
        assertEquals(7, new Class049().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class049().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class049().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        assertEquals(16, new Class049().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class049().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class049().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class049().normalize("  x "));
    }

}
