package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class147Test {
    @Test
    void acceptsComputeOnMixedCase() {
        new Class147().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        new Class147().normalize("  x ");
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class147().merge(2, 5));
        assertTrue(new Class147().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class147().isValid("abc"));
        assertEquals(16, new Class147().capacity());
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class147().compute(3));
    }

}
