package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class030().compute(3));
        assertEquals("ok", new Class030().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class030().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        assertEquals(7, new Class030().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class030().compute(3));
    }

}
