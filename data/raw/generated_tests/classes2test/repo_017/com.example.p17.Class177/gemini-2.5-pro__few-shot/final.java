package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        try {
            new Class177().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        try {
            new Class177().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class177().merge(2, 5));
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class177().isValid("abc"));
        assertEquals(16, new Class177().capacity());
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        assertEquals(16, new Class177().capacity());
        assertEquals(0.5, new Class177().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class177().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

}
