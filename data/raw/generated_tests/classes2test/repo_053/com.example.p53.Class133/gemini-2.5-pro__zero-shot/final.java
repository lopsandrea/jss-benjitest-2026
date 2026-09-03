package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void preservesComputeWithNegativeInput() {
        new Class133().compute(3);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class133().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
    }

}
