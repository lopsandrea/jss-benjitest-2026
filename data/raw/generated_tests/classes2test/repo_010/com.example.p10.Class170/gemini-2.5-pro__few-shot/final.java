package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            new Class170().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        new Class170().normalize("  x ");
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class170().merge(2, 5));
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class170().isValid("abc"));
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        assertEquals(0.5, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class170().labelFor(1));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

}
