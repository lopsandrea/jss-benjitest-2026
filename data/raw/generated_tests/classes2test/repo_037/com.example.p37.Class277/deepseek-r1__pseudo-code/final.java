package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class277().compute(3));
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class277().isValid("abc"));
    }

}
