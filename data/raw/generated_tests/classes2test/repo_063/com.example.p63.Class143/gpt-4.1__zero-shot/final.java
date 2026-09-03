package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class143().compute(3));
        assertEquals("ok", new Class143().normalize("  x "));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class143().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class143().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class143().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class143().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class143().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class143().ratio(1.0, 2.0), 1e-9);
    }

}
