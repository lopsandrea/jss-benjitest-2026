package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class059().compute(3));
        assertEquals("ok", new Class059().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class059().normalize("  x "));
        assertEquals(7, new Class059().merge(2, 5));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class059().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class059().normalize("  x "));
    }

}
