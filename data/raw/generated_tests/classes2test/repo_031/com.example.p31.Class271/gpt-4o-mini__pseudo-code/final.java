package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class271().compute(3));
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class271().normalize("  x "));
        assertEquals(7, new Class271().merge(2, 5));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class271().merge(2, 5));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class271().compute(3));
    }

}
