package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void yieldsComputeOnMixedCase() {
        new Class158().compute(3);
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        new Class158().normalize("  x ");
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class158().merge(2, 5));
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class158().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class158().capacity());
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class158().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class158().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class158().labelFor(1));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class158().merge(2, 5));
    }

}
