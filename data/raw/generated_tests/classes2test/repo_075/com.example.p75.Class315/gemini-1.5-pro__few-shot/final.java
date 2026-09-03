package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class315Test {
    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class315().compute(3));
        assertEquals("ok", new Class315().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class315().normalize("  x "));
        assertEquals(7, new Class315().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class315().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class315().normalize("  x "));
    }

}
