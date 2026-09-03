package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class155().compute(3));
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class155().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class155().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class155().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class155().capacity());
    }

}
