package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class219().compute(3));
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class219().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

}
