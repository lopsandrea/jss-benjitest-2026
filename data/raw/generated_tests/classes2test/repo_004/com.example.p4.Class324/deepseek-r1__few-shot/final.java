package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class324().compute(3));
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class324().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class324().merge(2, 5));
    }

}
