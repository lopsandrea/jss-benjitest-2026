package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class149().compute(3));
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class149().normalize("  x "));
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        assertEquals(16, new Class149().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class149().merge(2, 5));
    }

}
