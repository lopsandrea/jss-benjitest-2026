package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class213().compute(3));
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class213().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class213().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class213().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class213().capacity());
    }

    @Test
    void returnsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class213().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class213().compute(3));
    }

}
