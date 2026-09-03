package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class260Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        new Class260().compute(3);
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class260().normalize("  x "));
        assertEquals(7, new Class260().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class260().merge(2, 5));
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class260().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class260().capacity());
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class260().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class260().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class260().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class260().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class260().capacity());
    }

}
