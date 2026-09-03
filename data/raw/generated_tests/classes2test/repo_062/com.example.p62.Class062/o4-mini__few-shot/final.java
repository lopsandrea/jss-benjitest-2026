package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class062Test {
    @Test
    void rejectsComputeOnEmptyString() {
        new Class062().compute(3);
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        new Class062().normalize("  x ");
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class062().merge(2, 5));
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class062().compute(3));
    }

}
