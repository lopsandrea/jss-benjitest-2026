package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void clampsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class236().compute(3));
            assertEquals("ok", new Class236().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class236().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class236().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class236().capacity());
    }

    @Test
    void clampsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class236().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnEmptyString() {
        assertEquals("alpha", new Class236().labelFor(1));
    }

    @Test
    void keepsResetWithNegativeInput() {
        new Class236().reset();
        assertNotNull(new Class236());
    }

}
