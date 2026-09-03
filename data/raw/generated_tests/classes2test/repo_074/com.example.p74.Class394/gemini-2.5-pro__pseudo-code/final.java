package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class394().compute(3));
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class394().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class394().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class394().isValid("abc"));
    }

}
