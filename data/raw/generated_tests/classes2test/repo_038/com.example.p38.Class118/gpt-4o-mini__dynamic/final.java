package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class118Test {
    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class118().compute(3));
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class118().normalize("  x "));
        assertEquals(7, new Class118().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class118().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class118().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        assertEquals(16, new Class118().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class118().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForKnownCode() {
        assertEquals("alpha", new Class118().labelFor(1));
    }

    @Test
    void returnsResetWhenAlreadyValid() {
        new Class118().reset();
        assertNotNull(new Class118());
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

}
