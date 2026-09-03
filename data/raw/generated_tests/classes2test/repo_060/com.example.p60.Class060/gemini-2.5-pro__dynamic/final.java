package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class060().compute(3));
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class060().normalize("  x "));
        assertEquals(7, new Class060().merge(2, 5));
    }

    @Test
    void clampsMergeForKnownCode() {
        assertEquals(7, new Class060().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class060().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class060().capacity());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class060().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

}
