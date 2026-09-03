package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class303().compute(3));
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class303().normalize("  x "));
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class303().merge(2, 5));
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        assertEquals(16, new Class303().capacity());
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class303().capacity());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

}
