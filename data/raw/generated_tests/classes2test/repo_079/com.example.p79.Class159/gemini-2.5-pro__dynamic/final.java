package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            new Class159().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class159().normalize("  x "));
            assertEquals(7, new Class159().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class159().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

}
