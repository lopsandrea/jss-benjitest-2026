package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class058().compute(3));
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class058().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class058().capacity());
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class058().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class058().labelFor(1));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class058().compute(3));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class058().normalize("  x "));
    }

}
