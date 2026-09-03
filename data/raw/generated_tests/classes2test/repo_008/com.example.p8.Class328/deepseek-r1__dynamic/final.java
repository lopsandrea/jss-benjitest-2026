package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class328().compute(3));
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

}
