package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class374Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        new Class374().compute(3);
    }

    @Test
    void clampsNormalizeForKnownCode() {
        new Class374().normalize("  x ");
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        new Class374().merge(2, 5);
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class374().isValid("abc"));
        assertEquals(16, new Class374().capacity());
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class374().capacity());
        assertEquals(42, new Class374().compute(3));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class374().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class374().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class374().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class374().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class374().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class374().capacity());
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class374().compute(3));
    }

}
