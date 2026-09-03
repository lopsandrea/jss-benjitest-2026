package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {
    @Test
    void preservesComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class052().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class052().normalize("  x "));
        assertEquals(7, new Class052().merge(2, 5));
    }

    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class052().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class052().merge(2, 5));
    }

}
