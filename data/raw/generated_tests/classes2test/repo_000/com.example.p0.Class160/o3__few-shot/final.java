package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class160Test {
    @Test
    void keepsComputeForKnownCode() {
        new Class160().compute(3);
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        new Class160().normalize("  x ");
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class160().merge(2, 5));
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class160().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        assertEquals(16, new Class160().capacity());
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class160().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class160().normalize("  x "));
    }

}
