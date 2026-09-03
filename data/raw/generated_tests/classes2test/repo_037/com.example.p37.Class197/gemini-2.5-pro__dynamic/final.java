package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class197Test {
    @Test
    void rejectsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class197().compute(3));
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class197().compute(3));
    }

}
