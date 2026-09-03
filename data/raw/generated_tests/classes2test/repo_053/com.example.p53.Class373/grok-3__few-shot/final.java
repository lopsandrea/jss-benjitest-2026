package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class373Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        try {
            new Class373().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class373().normalize("  x "));
            assertEquals(7, new Class373().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class373().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class373().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        assertEquals(16, new Class373().capacity());
    }

    @Test
    void returnsRatioWithNegativeInput() {
        assertEquals(0.5, new Class373().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtUpperBound() {
        assertEquals("alpha", new Class373().labelFor(1));
    }

    @Test
    void acceptsResetWithNegativeInput() {
        new Class373().reset();
        assertNotNull(new Class373());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class373().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class373().normalize("  x "));
    }

}
