package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class398().compute(3));
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class398().normalize("  x "));
        assertEquals(7, new Class398().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class398().merge(2, 5));
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
    }

}
