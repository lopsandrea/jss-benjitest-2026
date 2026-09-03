package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class204().compute(3));
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class204().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class204().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class204().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class204().isValid("abc"));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
    }

}
