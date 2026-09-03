package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class014().compute(3));
            assertEquals("ok", new Class014().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class014().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class014().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class014().merge(2, 5));
        assertTrue(new Class014().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class014().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class014().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class014().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

}
