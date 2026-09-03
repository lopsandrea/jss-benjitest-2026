package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class339().compute(3));
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class339().normalize("  x "));
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class339().merge(2, 5));
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

}
