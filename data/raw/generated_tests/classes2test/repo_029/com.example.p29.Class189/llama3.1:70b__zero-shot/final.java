package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void keepsComputeAtUpperBound() {
        try {
            new Class189().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class189().normalize("  x "));
        assertEquals(7, new Class189().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class189().merge(2, 5));
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class189().isValid("abc"));
        assertEquals(16, new Class189().capacity());
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class189().compute(3));
    }

}
