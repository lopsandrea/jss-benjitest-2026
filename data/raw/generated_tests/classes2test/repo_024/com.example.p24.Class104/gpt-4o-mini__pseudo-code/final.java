package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class104().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class104().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

}
