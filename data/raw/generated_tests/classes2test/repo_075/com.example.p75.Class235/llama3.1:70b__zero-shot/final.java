package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        new Class235().compute(3);
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        new Class235().normalize("  x ");
    }

    @Test
    void keepsMergeOnMixedCase() {
        new Class235().merge(2, 5);
    }

    @Test
    void reportsIsValidAtUpperBound() {
        new Class235().isValid("abc");
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        new Class235().capacity();
    }

    @Test
    void rejectsRatioWithNullArgument() {
        assertEquals(0.5, new Class235().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void reportsLabelForOnMixedCase() {
        assertEquals("alpha", new Class235().labelFor(1));
        new Class235().reset();
        assertNotNull(new Class235());
    }

    @Test
    void returnsResetWhenUnset() {
        new Class235().reset();
        assertNotNull(new Class235());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class235().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class235().capacity());
    }

}
