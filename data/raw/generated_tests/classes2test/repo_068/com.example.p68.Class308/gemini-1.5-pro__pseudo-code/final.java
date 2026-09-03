package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void keepsComputeWithNegativeInput() {
        new Class308().compute(3);
    }

    @Test
    void preservesNormalizeWhenUnset() {
        new Class308().normalize("  x ");
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        new Class308().merge(2, 5);
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class308().isValid("abc"));
        assertEquals(16, new Class308().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class308().capacity());
        assertEquals(0.5, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        assertEquals(0.5, new Class308().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class308().labelFor(1));
    }

    @Test
    void acceptsLabelForWithNullArgument() {
        assertEquals("alpha", new Class308().labelFor(1));
        new Class308().reset();
        assertNotNull(new Class308());
    }

    @Test
    void clampsResetOnMixedCase() {
        new Class308().reset();
        assertNotNull(new Class308());
        int expected1 = 42;
        assertEquals(expected1, new Class308().compute(3));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

}
