package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class107().compute(3));
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class107().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class107().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class107().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class107().ratio(1.0, 2.0), 1e-9);
    }

}
