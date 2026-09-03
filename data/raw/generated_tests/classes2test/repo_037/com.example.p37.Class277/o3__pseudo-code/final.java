package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class277().compute(3));
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class277().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class277().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        assertEquals(0.5, new Class277().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnMixedCase() {
        assertEquals("alpha", new Class277().labelFor(1));
    }

    @Test
    void yieldsResetAtUpperBound() {
        new Class277().reset();
        assertNotNull(new Class277());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class277().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

}
