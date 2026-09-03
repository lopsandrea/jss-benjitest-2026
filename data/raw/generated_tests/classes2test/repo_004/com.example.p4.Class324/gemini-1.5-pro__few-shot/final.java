package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class324().compute(3));
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class324().normalize("  x "));
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class324().merge(2, 5));
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class324().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class324().capacity());
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class324().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class324().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class324().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class324().labelFor(1));
    }

    @Test
    void returnsLabelForWhenUnset() {
        assertEquals("alpha", new Class324().labelFor(1));
    }

    @Test
    void preservesResetOnEmptyString() {
        new Class324().reset();
        assertNotNull(new Class324());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

}
