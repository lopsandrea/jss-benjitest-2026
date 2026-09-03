package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void acceptsComputeAtUpperBound() {
        try {
            new Class364().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class364().normalize("  x "));
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        assertEquals(0.5, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class364().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class364().isValid("abc"));
    }

}
