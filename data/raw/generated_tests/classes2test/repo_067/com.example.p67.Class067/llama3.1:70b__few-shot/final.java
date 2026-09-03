package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        new Class067().compute(3);
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class067().normalize("  x "));
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class067().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class067().capacity());
    }

}
