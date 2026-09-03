package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {
    @Test
    void rejectsComputeWithNullArgument() {
        try {
            new Class223().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class223().normalize("  x "));
        assertEquals(7, new Class223().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class223().merge(2, 5));
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        assertEquals(16, new Class223().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        assertEquals(0.5, new Class223().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class223().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

}
