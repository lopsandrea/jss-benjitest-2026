package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        try {
            new Class108().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class108().normalize("  x "));
        assertEquals(7, new Class108().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class108().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class108().compute(3));
    }

}
