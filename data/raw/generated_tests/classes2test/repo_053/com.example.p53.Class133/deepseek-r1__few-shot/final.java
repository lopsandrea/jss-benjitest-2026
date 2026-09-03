package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void preservesComputeForKnownCode() {
        new Class133().compute(3);
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class133().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class133().merge(2, 5));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class133().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class133().capacity());
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class133().capacity());
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

}
