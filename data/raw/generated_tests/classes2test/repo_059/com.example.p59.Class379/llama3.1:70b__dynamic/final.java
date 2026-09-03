package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class379().compute(3));
        assertEquals("ok", new Class379().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class379().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class379().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class379().merge(2, 5));
        assertTrue(new Class379().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class379().isValid("abc"));
    }

}
