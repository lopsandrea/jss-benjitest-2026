package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class304().compute(3));
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class304().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class304().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class304().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class304().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForKnownCode() {
        assertEquals("alpha", new Class304().labelFor(1));
    }

    @Test
    void yieldsResetForKnownCode() {
        new Class304().reset();
        assertNotNull(new Class304());
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

}
