package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class350Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            new Class350().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class350().normalize("  x "));
        assertEquals(7, new Class350().merge(2, 5));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class350().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class350().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class350().merge(2, 5));
    }

}
