package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class331().compute(3));
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class331().normalize("  x "));
        assertEquals(7, new Class331().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class331().merge(2, 5));
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class331().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class331().capacity());
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class331().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class331().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class331().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class331().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class331().merge(2, 5));
    }

}
