package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class251Test {
    @Test
    void keepsComputeWithNegativeInput() {
        new Class251().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        new Class251().normalize("  x ");
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class251().merge(2, 5));
        assertTrue(new Class251().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class251().isValid("abc"));
        assertEquals(16, new Class251().capacity());
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        assertEquals(16, new Class251().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class251().compute(3));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class251().compute(3));
    }

}
