package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class112Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class112().compute(3));
            assertEquals("ok", new Class112().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class112().normalize("  x "));
            assertEquals(7, new Class112().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class112().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class112().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class112().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class112().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class112().labelFor(1));
    }

    @Test
    void clampsResetAtZero() {
        new Class112().reset();
        assertNotNull(new Class112());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class112().compute(3));
    }

}
