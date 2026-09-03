package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class251Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class251().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class251().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class251().compute(3));
    }

}
