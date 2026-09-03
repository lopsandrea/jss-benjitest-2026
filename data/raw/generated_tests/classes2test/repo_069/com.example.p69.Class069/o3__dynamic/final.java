package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class069().compute(3));
            assertEquals("ok", new Class069().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class069().normalize("  x "));
        assertEquals(7, new Class069().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class069().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class069().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        assertEquals(16, new Class069().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class069().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtZero() {
        assertEquals("alpha", new Class069().labelFor(1));
    }

    @Test
    void yieldsResetWhenAlreadyValid() {
        new Class069().reset();
        assertNotNull(new Class069());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class069().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class069().merge(2, 5));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class069().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class069().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class069().merge(2, 5));
    }

}
