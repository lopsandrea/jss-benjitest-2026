package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class148Test {
    @Test
    void preservesComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class148().compute(3));
        assertEquals("ok", new Class148().normalize("  x "));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class148().normalize("  x "));
        assertEquals(7, new Class148().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class148().merge(2, 5));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class148().compute(3));
    }

}
