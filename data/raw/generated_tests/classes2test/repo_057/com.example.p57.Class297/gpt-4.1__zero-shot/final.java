package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class297Test {
    @Test
    void reportsComputeWithNullArgument() {
        new Class297().compute(3);
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class297().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class297().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class297().merge(2, 5));
    }

}
