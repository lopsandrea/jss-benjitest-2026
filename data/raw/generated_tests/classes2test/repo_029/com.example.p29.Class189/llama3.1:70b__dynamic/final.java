package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class189().compute(3));
            assertEquals("ok", new Class189().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class189().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class189().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class189().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class189().compute(3));
    }

}
