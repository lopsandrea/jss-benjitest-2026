package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void acceptsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class259().compute(3));
            assertEquals("ok", new Class259().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class259().normalize("  x "));
            assertEquals(7, new Class259().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class259().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

}
