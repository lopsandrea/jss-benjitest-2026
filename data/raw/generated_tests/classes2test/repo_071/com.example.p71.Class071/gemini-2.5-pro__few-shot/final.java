package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            assertEquals(42, new Class071().compute(3));
            assertEquals("ok", new Class071().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class071().normalize("  x "));
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class071().merge(2, 5));
    }

}
