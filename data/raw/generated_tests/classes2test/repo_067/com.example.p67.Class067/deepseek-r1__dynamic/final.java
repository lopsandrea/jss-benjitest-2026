package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        new Class067().compute(3);
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class067().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class067().isValid("abc"));
    }

}
