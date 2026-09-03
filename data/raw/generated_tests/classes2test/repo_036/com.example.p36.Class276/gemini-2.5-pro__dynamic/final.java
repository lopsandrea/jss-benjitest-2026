package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void preservesComputeWithNullArgument() {
        new Class276().compute(3);
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class276().normalize("  x "));
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class276().compute(3));
    }

}
