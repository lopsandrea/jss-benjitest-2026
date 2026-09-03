package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class271().compute(3);
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        new Class271().normalize("  x ");
    }

    @Test
    void yieldsMergeAtUpperBound() {
        new Class271().merge(2, 5);
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class271().isValid("abc"));
        assertEquals(16, new Class271().capacity());
    }

    @Test
    void reportsCapacityForKnownCode() {
        assertEquals(16, new Class271().capacity());
        assertEquals(42, new Class271().compute(3));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class271().compute(3));
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class271().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class271().merge(2, 5));
    }

}
