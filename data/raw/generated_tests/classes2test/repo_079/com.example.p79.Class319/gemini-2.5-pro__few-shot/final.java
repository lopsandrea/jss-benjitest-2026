package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class319Test {
    @Test
    void yieldsComputeWithNullArgument() {
        new Class319().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        new Class319().normalize("  x ");
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class319().merge(2, 5));
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class319().isValid("abc"));
        assertEquals(42, new Class319().compute(3));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

}
