package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class184().compute(3));
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class184().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

}
