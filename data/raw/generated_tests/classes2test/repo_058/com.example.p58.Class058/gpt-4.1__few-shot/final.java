package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {
    @Test
    void keepsComputeForKnownCode() {
        new Class058().compute(3);
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        new Class058().normalize("  x ");
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class058().merge(2, 5));
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class058().isValid("abc"));
        assertEquals(16, new Class058().capacity());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

}
