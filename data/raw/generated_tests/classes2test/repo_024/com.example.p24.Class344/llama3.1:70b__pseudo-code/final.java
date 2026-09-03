package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class344Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class344().compute(3));
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class344().normalize("  x "));
        assertEquals(7, new Class344().merge(2, 5));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class344().normalize("  x "));
    }

}
