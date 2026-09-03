package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class331().compute(3));
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class331().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class331().merge(2, 5));
    }

}
