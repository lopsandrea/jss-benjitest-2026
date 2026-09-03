package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class263().compute(3));
        assertEquals("ok", new Class263().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class263().normalize("  x "));
        assertEquals(7, new Class263().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class263().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        assertEquals(16, new Class263().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class263().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class263().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class263().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class263().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class263().capacity());
    }

}
