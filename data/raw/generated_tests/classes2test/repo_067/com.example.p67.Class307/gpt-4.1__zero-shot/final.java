package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class307Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class307().compute(3));
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class307().normalize("  x "));
        assertEquals(7, new Class307().merge(2, 5));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class307().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class307().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class307().merge(2, 5));
    }

}
