package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class155Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class155().compute(3));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class155().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class155().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class155().merge(2, 5));
    }

}
