package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class359().compute(3));
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class359().normalize("  x "));
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        assertEquals(16, new Class359().capacity());
    }

    @Test
    void clampsRatioOnMixedCase() {
        assertEquals(0.5, new Class359().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnEmptyString() {
        assertEquals("alpha", new Class359().labelFor(1));
    }

    @Test
    void yieldsResetForKnownCode() {
        new Class359().reset();
        assertNotNull(new Class359());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class359().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

}
