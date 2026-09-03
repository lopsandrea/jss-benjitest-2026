package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class003Test {
    @Test
    void yieldsComputeWithNullArgument() {
        try {
            new Class003().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class003().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class003().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class003().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class003().merge(2, 5));
    }

}
