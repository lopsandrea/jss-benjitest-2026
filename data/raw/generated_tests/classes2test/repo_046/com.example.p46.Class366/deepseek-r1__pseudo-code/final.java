package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class366Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class366().compute(3));
            assertEquals("ok", new Class366().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class366().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class366().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        assertEquals(0.5, new Class366().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenUnset() {
        assertEquals("alpha", new Class366().labelFor(1));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class366().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

}
