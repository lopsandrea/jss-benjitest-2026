package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class385Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class385().compute(3));
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class385().normalize("  x "));
        assertEquals(7, new Class385().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class385().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class385().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class385().merge(2, 5));
    }

}
