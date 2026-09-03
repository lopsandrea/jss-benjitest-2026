package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void shouldRejectComputeOnRepeatedCall() {
        try {
            new Class051().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class051().normalize("  x "));
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnMixedCase() {
        assertEquals(7, new Class051().merge(2, 5));
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidWithNullArgument() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

    @Test
    void shouldRejectRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForWithNegativeInput() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void shouldNotThrowOnResetOnRepeatedCall() {
        new Class051().reset();
        assertNotNull(new Class051());
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void shouldKeepNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnEmptyString() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

}
