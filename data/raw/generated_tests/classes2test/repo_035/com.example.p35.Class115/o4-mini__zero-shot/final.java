package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class115Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            assertEquals(42, new Class115().compute(3));
            assertEquals("ok", new Class115().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class115().normalize("  x "));
        assertEquals(7, new Class115().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class115().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class115().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class115().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class115().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtUpperBound() {
        assertEquals("alpha", new Class115().labelFor(1));
    }

    @Test
    void acceptsResetAtUpperBound() {
        new Class115().reset();
        assertNotNull(new Class115());
    }

    @Test
    void keepsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class115().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class115().merge(2, 5));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class115().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class115().merge(2, 5));
    }

}
