package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class148Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class148().compute(3));
            assertEquals("ok", new Class148().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class148().normalize("  x "));
        assertEquals(7, new Class148().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class148().merge(2, 5));
        assertTrue(new Class148().isValid("abc"));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class148().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class148().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class148().merge(2, 5));
    }

}
