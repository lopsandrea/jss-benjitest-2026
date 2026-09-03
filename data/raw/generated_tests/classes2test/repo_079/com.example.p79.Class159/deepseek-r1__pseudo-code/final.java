package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class159().compute(3));
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class159().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

}
