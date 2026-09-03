package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class138Test {
    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class138().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class138().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class138().merge(2, 5));
    }

}
