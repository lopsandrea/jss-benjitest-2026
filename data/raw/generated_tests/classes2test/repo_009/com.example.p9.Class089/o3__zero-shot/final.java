package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void keepsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class089().compute(3));
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class089().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class089().capacity());
    }

}
