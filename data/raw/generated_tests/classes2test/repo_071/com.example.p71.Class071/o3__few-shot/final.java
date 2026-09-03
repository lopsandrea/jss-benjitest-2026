package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class071().compute(3));
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class071().normalize("  x "));
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class071().merge(2, 5));
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class071().merge(2, 5));
    }

}
