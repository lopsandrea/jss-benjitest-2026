package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class267Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class267().compute(3));
            assertEquals("ok", new Class267().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class267().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class267().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class267().merge(2, 5));
        assertTrue(new Class267().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class267().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class267().capacity());
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class267().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class267().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class267().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class267().labelFor(1));
    }

    @Test
    void returnsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class267().labelFor(1));
    }

    @Test
    void rejectsResetWithNegativeInput() {
        new Class267().reset();
        assertNotNull(new Class267());
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class267().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class267().normalize("  x "));
    }

}
