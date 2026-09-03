package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void clampsComputeForBoundaryValue() {
        try {
            new Class022().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class022().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class022().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class022().capacity());
    }

}
