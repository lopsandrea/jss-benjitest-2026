package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class281().compute(3));
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

}
