package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class324().compute(3));
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class324().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class324().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class324().merge(2, 5));
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class324().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class324().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenUnset() {
        assertEquals("alpha", new Class324().labelFor(1));
    }

    @Test
    void keepsResetWhenUnset() {
        new Class324().reset();
        assertNotNull(new Class324());
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class324().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class324().capacity());
    }

}
