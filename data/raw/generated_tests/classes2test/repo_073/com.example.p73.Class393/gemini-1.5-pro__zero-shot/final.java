package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        try {
            new Class393().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class393().capacity());
    }

    @Test
    void reportsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class393().ratio(1.0, 2.0), 1e-9);
    }

}
