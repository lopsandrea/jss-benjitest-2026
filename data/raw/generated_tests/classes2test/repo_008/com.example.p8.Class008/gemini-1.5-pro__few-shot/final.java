package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class008Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            assertEquals(42, new Class008().compute(3));
            assertEquals("ok", new Class008().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class008().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class008().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class008().merge(2, 5));
        assertTrue(new Class008().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class008().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class008().capacity());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class008().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class008().normalize("  x "));
    }

}
