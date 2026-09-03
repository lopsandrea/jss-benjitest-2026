package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class307().compute(3));
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class307().normalize("  x "));
        assertEquals(7, new Class307().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class307().merge(2, 5));
        assertTrue(new Class307().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class307().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        assertEquals(16, new Class307().capacity());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class307().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

}
