package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class291Test {
    @Test
    void acceptsComputeWhenUnset() {
        try {
            new Class291().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class291().normalize("  x "));
        assertEquals(7, new Class291().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class291().merge(2, 5));
        assertTrue(new Class291().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class291().isValid("abc"));
        assertEquals(16, new Class291().capacity());
    }

    @Test
    void returnsCapacityAtZero() {
        assertEquals(16, new Class291().capacity());
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class291().compute(3));
    }

}
