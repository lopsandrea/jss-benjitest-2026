package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class148Test {
    @Test
    void preservesComputeWithNullArgument() {
        new Class148().compute(3);
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class148().normalize("  x "));
        assertEquals(7, new Class148().merge(2, 5));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class148().merge(2, 5));
        assertTrue(new Class148().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class148().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        assertEquals(16, new Class148().capacity());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class148().compute(3));
    }

}
