package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class115Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class115().compute(3));
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class115().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class115().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class115().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class115().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class115().capacity());
    }

    @Test
    void acceptsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class115().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtUpperBound() {
        assertEquals("alpha", new Class115().labelFor(1));
    }

    @Test
    void reportsResetWithNegativeInput() {
        new Class115().reset();
        assertNotNull(new Class115());
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class115().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class115().merge(2, 5));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class115().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class115().merge(2, 5));
    }

}
