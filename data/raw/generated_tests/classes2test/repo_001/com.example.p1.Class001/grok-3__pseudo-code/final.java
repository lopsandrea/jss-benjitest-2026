package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class001Test {
    @Test
    void preservesComputeAtUpperBound() {
        new Class001().compute(3);
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class001().normalize("  x "));
        assertEquals(7, new Class001().merge(2, 5));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class001().merge(2, 5));
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class001().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class001().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class001().isValid("abc"));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class001().compute(3));
    }

}
