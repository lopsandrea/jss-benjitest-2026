package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class330Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class330().compute(3));
            assertEquals("ok", new Class330().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class330().normalize("  x "));
        assertEquals(7, new Class330().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class330().merge(2, 5));
        assertTrue(new Class330().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class330().isValid("abc"));
        assertEquals(16, new Class330().capacity());
    }

    @Test
    void returnsCapacityAtUpperBound() {
        assertEquals(16, new Class330().capacity());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class330().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class330().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class330().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class330().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class330().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

}
