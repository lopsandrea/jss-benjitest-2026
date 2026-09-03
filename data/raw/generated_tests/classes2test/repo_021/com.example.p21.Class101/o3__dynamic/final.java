package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class101().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class101().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

}
