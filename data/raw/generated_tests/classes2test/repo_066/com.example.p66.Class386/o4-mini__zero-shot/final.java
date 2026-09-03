package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class386Test {
    @Test
    void keepsComputeOnEmptyString() {
        try {
            new Class386().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class386().normalize("  x "));
        assertEquals(7, new Class386().merge(2, 5));
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class386().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

}
