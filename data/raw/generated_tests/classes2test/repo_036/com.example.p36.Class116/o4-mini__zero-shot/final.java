package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class116Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class116().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class116().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class116().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class116().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class116().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class116().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnEmptyString() {
        assertEquals("alpha", new Class116().labelFor(1));
    }

}
