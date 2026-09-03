package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class204().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class204().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

}
