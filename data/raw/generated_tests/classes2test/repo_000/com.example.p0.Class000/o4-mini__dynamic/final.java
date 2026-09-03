package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class000().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class000().merge(2, 5));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class000().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class000().merge(2, 5));
    }

}
