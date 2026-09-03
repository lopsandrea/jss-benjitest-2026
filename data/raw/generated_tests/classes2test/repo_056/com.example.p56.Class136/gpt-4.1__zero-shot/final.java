package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class136().compute(3));
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class136().normalize("  x "));
        assertEquals(7, new Class136().merge(2, 5));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class136().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

}
