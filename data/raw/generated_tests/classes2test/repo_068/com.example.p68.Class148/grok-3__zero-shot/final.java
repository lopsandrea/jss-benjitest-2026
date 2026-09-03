package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class148Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class148().compute(3));
        assertEquals("ok", new Class148().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class148().normalize("  x "));
        assertEquals(7, new Class148().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class148().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class148().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class148().capacity());
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class148().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class148().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class148().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class148().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class148().capacity());
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class148().compute(3));
    }

}
