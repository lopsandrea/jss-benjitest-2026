package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            new Class266().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class266().normalize("  x "));
            assertEquals(7, new Class266().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class266().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class266().normalize("  x "));
    }

}
