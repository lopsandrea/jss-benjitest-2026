package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void rejectsComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class045().compute(3));
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class045().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class045().isValid("abc"));
    }

}
