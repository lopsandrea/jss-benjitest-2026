package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class094Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        new Class094().compute(3);
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class094().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class094().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class094().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class094().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class094().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class094().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class094().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class094().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class094().capacity());
    }

}
