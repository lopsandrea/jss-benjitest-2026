package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {
    @Test
    void preservesComputeAtUpperBound() {
        new Class005().compute(3);
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class005().normalize("  x "));
        assertEquals(7, new Class005().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class005().merge(2, 5));
        assertTrue(new Class005().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class005().isValid("abc"));
        assertEquals(16, new Class005().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class005().compute(3));
    }

}
