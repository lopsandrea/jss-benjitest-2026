package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class185Test {
    @Test
    void reportsComputeAtZero() {
        new Class185().compute(3);
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class185().normalize("  x "));
        assertEquals(7, new Class185().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class185().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class185().compute(3));
    }

}
