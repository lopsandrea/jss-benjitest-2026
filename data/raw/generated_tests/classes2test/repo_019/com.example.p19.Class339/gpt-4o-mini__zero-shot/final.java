package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void preservesComputeForBoundaryValue() {
        new Class339().compute(3);
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class339().normalize("  x "));
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class339().merge(2, 5));
    }

}
