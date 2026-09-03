package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class026Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class026().compute(3));
        assertEquals("ok", new Class026().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class026().normalize("  x "));
        assertEquals(7, new Class026().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class026().merge(2, 5));
        assertTrue(new Class026().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class026().compute(3));
    }

}
