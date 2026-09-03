package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        try {
            new Class069().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        new Class069().normalize("  x ");
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        new Class069().merge(2, 5);
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class069().isValid("abc"));
        assertEquals(16, new Class069().capacity());
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class069().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class069().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class069().compute(3));
    }

}
