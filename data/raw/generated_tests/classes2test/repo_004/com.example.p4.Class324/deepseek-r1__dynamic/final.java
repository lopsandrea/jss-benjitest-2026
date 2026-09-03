package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class324().compute(3));
            assertEquals("ok", new Class324().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class324().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class324().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class324().labelFor(1));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

}
