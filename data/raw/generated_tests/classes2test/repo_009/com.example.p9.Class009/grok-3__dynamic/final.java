package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class009().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class009().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

}
