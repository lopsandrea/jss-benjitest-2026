package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class393().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class393().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class393().compute(3));
    }

}
