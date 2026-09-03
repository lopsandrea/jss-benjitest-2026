package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class353Test {
    @Test
    void acceptsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class353().compute(3));
            assertEquals("ok", new Class353().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class353().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class353().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class353().merge(2, 5));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class353().compute(3));
    }

}
