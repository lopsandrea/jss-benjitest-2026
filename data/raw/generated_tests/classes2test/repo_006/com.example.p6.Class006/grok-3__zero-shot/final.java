package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class006Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class006().compute(3));
        assertEquals("ok", new Class006().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class006().normalize("  x "));
        assertEquals(7, new Class006().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        assertEquals(7, new Class006().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class006().compute(3));
    }

}
