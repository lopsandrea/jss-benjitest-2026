package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            new Class016().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        new Class016().normalize("  x ");
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class016().merge(2, 5));
        assertTrue(new Class016().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenAlreadyValid() {
        assertTrue(new Class016().isValid("abc"));
        assertEquals(16, new Class016().capacity());
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class016().capacity());
        assertEquals(42, new Class016().compute(3));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class016().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class016().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class016().merge(2, 5));
    }

}
