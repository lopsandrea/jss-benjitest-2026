package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class329().compute(3));
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class329().normalize("  x "));
        assertEquals(7, new Class329().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class329().merge(2, 5));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class329().compute(3));
    }

}
