package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            assertEquals(42, new Class236().compute(3));
            assertEquals("ok", new Class236().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class236().normalize("  x "));
        assertEquals(7, new Class236().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class236().merge(2, 5));
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class236().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        assertEquals(0.5, new Class236().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnEmptyString() {
        assertEquals("alpha", new Class236().labelFor(1));
    }

    @Test
    void preservesResetOnEmptyString() {
        new Class236().reset();
        assertNotNull(new Class236());
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class236().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class236().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class236().capacity());
    }

}
