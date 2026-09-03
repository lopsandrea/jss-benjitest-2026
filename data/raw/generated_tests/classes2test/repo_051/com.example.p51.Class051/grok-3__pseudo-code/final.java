package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void clampsComputeAtZero() {
        new Class051().compute(3);
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        new Class051().normalize("  x ");
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class051().merge(2, 5));
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class051().isValid("abc"));
        assertEquals(16, new Class051().capacity());
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class051().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class051().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

}
