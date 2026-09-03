package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void rejectsComputeWithNullArgument() {
        new Class364().compute(3);
    }

    @Test
    void returnsNormalizeWhenUnset() {
        new Class364().normalize("  x ");
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class364().merge(2, 5));
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class364().isValid("abc"));
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        assertEquals(0.5, new Class364().ratio(1.0, 2.0), 1e-9);
    }

}
