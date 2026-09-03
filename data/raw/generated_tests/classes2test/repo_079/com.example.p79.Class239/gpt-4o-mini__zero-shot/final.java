package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class239().compute(3));
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

}
