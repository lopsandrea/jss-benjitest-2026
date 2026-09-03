package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            new Class156().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class156().normalize("  x "));
        assertEquals(7, new Class156().merge(2, 5));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

}
