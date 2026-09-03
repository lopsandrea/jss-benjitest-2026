package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class191().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class191().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class191().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class191().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenUnset() {
        assertEquals("alpha", new Class191().labelFor(1));
    }

    @Test
    void acceptsResetWhenAlreadyValid() {
        new Class191().reset();
        assertNotNull(new Class191());
    }

}
