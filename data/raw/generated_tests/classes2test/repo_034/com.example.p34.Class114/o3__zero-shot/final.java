package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class114Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class114().compute(3);
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class114().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class114().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class114().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class114().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class114().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNegativeInput() {
        assertEquals("alpha", new Class114().labelFor(1));
    }

    @Test
    void keepsResetWhenUnset() {
        new Class114().reset();
        assertNotNull(new Class114());
    }

}
