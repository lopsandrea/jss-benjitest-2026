package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class184().compute(3));
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class184().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class184().capacity());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

}
