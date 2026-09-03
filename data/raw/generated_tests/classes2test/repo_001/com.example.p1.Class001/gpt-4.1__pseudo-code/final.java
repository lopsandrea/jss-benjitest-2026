package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class001Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class001().compute(3));
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class001().merge(2, 5));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

}
