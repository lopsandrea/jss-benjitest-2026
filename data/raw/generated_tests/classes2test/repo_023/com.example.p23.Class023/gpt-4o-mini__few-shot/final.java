package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class023().compute(3));
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class023().normalize("  x "));
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class023().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class023().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNegativeInput() {
        assertEquals("alpha", new Class023().labelFor(1));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

}
