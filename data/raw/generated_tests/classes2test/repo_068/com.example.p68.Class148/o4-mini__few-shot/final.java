package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class148Test {
    @Test
    void reportsComputeAtUpperBound() {
        new Class148().compute(3);
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class148().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class148().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class148().merge(2, 5));
    }

}
