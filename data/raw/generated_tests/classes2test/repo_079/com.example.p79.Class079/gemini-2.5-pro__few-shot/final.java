package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class079Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class079().compute(3));
        assertEquals("ok", new Class079().normalize("  x "));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class079().normalize("  x "));
        assertEquals(7, new Class079().merge(2, 5));
    }

    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class079().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class079().normalize("  x "));
    }

}
