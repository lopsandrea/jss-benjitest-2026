package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class175().compute(3));
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class175().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class175().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class175().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

}
