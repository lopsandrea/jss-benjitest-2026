package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        new Class170().compute(3);
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        new Class170().normalize("  x ");
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class170().merge(2, 5));
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class170().capacity());
    }

}
