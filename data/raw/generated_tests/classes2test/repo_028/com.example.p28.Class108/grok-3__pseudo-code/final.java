package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class108().compute(3);
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        new Class108().normalize("  x ");
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class108().merge(2, 5));
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class108().isValid("abc"));
        assertEquals(16, new Class108().capacity());
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class108().capacity());
        assertEquals(0.5, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class108().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class108().merge(2, 5));
    }

}
