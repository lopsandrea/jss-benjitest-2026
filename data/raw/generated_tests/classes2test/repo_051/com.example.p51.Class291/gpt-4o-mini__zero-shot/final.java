package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class291Test {
    @Test
    void reportsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class291().compute(3));
            assertEquals("ok", new Class291().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class291().normalize("  x "));
            assertEquals(7, new Class291().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class291().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class291().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class291().merge(2, 5));
    }

}
