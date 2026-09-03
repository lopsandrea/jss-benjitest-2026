package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class107().compute(3));
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class107().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class107().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        assertEquals(0.5, new Class107().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnEmptyString() {
        assertEquals("alpha", new Class107().labelFor(1));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class107().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class107().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class107().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class107().merge(2, 5));
    }

}
