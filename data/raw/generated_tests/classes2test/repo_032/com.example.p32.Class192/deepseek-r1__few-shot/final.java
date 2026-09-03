package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class192().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class192().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class192().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class192().compute(3));
    }

}
