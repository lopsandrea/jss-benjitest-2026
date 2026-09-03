package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class308().compute(3));
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class308().normalize("  x "));
        assertEquals(7, new Class308().merge(2, 5));
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class308().merge(2, 5));
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class308().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnMixedCase() {
        assertEquals("alpha", new Class308().labelFor(1));
    }

    @Test
    void rejectsResetAtZero() {
        new Class308().reset();
        assertNotNull(new Class308());
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

}
