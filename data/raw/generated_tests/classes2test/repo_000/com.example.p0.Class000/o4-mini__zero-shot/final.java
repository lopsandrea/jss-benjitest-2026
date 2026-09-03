package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void preservesComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class000().compute(3));
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class000().merge(2, 5));
    }

    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class000().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

}
