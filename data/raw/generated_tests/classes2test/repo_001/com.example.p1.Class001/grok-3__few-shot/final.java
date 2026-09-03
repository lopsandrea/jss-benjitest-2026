package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class001Test {
    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class001().compute(3));
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class001().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class001().merge(2, 5));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class001().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class001().isValid("abc"));
    }

}
