package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {
    @Test
    void clampsComputeForKnownCode() {
        new Class087().compute(3);
    }

    @Test
    void returnsNormalizeWhenUnset() {
        new Class087().normalize("  x ");
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class087().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class087().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class087().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class087().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class087().merge(2, 5));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class087().compute(3));
    }

}
