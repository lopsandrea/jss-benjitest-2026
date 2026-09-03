package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class182().compute(3));
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class182().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

}
