package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class229Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class229().compute(3));
            assertEquals("ok", new Class229().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class229().normalize("  x "));
        assertEquals(7, new Class229().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class229().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class229().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class229().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class229().labelFor(1));
    }

    @Test
    void yieldsResetOnTrimmedInput() {
        new Class229().reset();
        assertNotNull(new Class229());
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class229().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class229().capacity());
    }

}
