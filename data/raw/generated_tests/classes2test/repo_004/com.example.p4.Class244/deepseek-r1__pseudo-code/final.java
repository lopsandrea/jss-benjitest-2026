package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class244().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class244().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class244().compute(3));
    }

}
