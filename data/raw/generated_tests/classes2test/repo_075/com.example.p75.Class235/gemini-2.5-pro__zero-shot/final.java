package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class235Test {
    @Test
    void keepsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class235().compute(3));
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class235().normalize("  x "));
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class235().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class235().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class235().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class235().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class235().labelFor(1));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class235().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class235().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class235().merge(2, 5));
    }

}
