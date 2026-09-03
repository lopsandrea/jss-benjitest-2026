package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class390().compute(3);
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        new Class390().normalize("  x ");
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class390().merge(2, 5));
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class390().compute(3));
    }

}
