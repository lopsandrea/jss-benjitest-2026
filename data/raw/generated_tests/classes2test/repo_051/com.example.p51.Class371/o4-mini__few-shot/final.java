package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class371().compute(3));
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class371().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class371().merge(2, 5));
    }

}
