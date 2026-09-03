package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class053Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class053().compute(3));
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class053().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class053().merge(2, 5));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class053().normalize("  x "));
    }

}
