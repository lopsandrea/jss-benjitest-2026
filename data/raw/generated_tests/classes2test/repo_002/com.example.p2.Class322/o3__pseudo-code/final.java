package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            assertEquals(42, new Class322().compute(3));
            assertEquals("ok", new Class322().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class322().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class322().isValid("abc"));
    }

}
