package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class324().compute(3));
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class324().normalize("  x "));
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class324().capacity());
    }

    @Test
    void preservesRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class324().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtZero() {
        assertEquals("alpha", new Class324().labelFor(1));
    }

    @Test
    void acceptsResetOnRepeatedCall() {
        new Class324().reset();
        assertNotNull(new Class324());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class324().merge(2, 5));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

}
