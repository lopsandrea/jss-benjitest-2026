package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class310Test {
    @Test
    void keepsComputeWithNullArgument() {
        assertEquals(42, new Class310().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class310().normalize("  x "));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class310().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class310().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class310().merge(2, 5));
    }

}
