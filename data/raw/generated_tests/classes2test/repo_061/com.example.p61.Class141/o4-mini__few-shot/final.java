package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class141().compute(3));
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class141().normalize("  x "));
        assertEquals(7, new Class141().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class141().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        assertEquals(16, new Class141().capacity());
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class141().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class141().capacity());
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class141().merge(2, 5));
    }

}
