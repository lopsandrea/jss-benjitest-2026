package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class108().compute(3));
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class108().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class108().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class108().merge(2, 5));
    }

}
