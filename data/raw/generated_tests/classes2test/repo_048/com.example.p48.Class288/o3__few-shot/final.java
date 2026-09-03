package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        new Class288().compute(3);
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class288().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class288().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class288().isValid("abc"));
    }

}
