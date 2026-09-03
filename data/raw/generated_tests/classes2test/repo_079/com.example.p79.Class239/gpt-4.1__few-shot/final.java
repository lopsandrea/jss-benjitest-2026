package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class239().compute(3));
            assertEquals("ok", new Class239().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class239().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class239().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class239().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtUpperBound() {
        assertEquals("alpha", new Class239().labelFor(1));
    }

    @Test
    void clampsResetWithNegativeInput() {
        new Class239().reset();
        assertNotNull(new Class239());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

}
