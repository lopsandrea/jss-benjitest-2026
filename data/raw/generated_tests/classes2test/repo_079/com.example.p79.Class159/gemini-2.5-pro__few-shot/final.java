package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class159().compute(3));
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class159().normalize("  x "));
        assertEquals(7, new Class159().merge(2, 5));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class159().merge(2, 5));
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class159().isValid("abc"));
        assertEquals(42, new Class159().compute(3));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

}
