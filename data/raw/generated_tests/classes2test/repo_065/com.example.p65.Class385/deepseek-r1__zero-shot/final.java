package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class385Test {
    @Test
    void reportsComputeWithNegativeInput() {
        new Class385().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class385().normalize("  x "));
        assertEquals(7, new Class385().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class385().merge(2, 5));
        assertTrue(new Class385().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class385().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class385().capacity());
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class385().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class385().compute(3));
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class385().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class385().capacity());
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

}
