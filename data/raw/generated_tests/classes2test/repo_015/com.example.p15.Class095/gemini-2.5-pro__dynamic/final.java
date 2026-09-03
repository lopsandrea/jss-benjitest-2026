package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class095().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class095().merge(2, 5));
    }

    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class095().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

}
