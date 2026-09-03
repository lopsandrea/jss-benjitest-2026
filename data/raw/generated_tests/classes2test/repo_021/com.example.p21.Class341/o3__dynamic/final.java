package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class341().compute(3));
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class341().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class341().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class341().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class341().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class341().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNullArgument() {
        assertEquals("alpha", new Class341().labelFor(1));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class341().compute(3));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class341().compute(3));
    }

}
