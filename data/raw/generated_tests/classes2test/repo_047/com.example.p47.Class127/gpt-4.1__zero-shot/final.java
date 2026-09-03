package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class127Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        try {
            new Class127().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class127().normalize("  x "));
        assertEquals(7, new Class127().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class127().merge(2, 5));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class127().compute(3));
    }

}
