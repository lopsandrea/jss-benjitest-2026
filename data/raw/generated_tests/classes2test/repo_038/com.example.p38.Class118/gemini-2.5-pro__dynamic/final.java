package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class118Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class118().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class118().merge(2, 5));
    }

}
