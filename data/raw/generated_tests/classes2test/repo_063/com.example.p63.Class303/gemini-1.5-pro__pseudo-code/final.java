package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class303().compute(3);
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class303().normalize("  x "));
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        assertEquals(16, new Class303().capacity());
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class303().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class303().capacity());
    }

}
