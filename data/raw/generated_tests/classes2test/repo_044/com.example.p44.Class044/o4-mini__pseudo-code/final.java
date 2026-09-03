package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class044Test {
    @Test
    void acceptsComputeOnMixedCase() {
        new Class044().compute(3);
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class044().normalize("  x "));
        assertEquals(7, new Class044().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class044().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class044().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class044().merge(2, 5));
    }

}
