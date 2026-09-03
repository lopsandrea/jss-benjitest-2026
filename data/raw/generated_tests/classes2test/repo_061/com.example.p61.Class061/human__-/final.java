package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class061Test {
    @Test
    void shouldHandleComputeWhenUnset() {
        new Class061().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        new Class061().normalize("  x ");
    }

    @Test
    void shouldFailFastMergeWhenAlreadyValid() {
        assertEquals(7, new Class061().merge(2, 5));
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidForBoundaryValue() {
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnMixedCase() {
        assertEquals(16, new Class061().capacity());
    }

    @Test
    void shouldRoundTripComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class061().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnEmptyString() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

}
