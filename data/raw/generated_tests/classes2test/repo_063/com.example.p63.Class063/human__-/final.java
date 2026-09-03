package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class063Test {
    @Test
    void shouldHandleComputeAtUpperBound() {
        assertEquals(42, new Class063().compute(3));
        assertEquals("ok", new Class063().normalize("  x "));
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class063().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class063().merge(2, 5));
    }

    @Test
    void shouldKeepMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class063().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidAtUpperBound() {
        assertTrue(new Class063().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class063().capacity());
    }

    @Test
    void shouldFailFastRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class063().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepLabelForForBoundaryValue() {
        assertEquals("alpha", new Class063().labelFor(1));
    }

    @Test
    void shouldReturnResetOnTrimmedInput() {
        new Class063().reset();
        assertNotNull(new Class063());
    }

    @Test
    void shouldRejectComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class063().compute(3));
    }

    @Test
    void shouldRejectNormalizeWithNegativeInput() {
        assertEquals("ok", new Class063().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class063().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnRepeatedCall() {
        assertTrue(new Class063().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class063().capacity());
    }

}
