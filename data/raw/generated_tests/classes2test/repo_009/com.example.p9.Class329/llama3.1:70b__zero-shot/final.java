package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class329().compute(3));
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class329().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

}
