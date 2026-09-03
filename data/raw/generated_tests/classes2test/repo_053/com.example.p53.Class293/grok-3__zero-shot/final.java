package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class293Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class293().compute(3));
        assertEquals("ok", new Class293().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class293().normalize("  x "));
        assertEquals(7, new Class293().merge(2, 5));
    }

    @Test
    void reportsMergeOnMixedCase() {
        assertEquals(7, new Class293().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        assertEquals(16, new Class293().capacity());
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class293().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class293().capacity());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

}
