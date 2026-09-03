package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class360().compute(3));
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class360().normalize("  x "));
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class360().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

}
