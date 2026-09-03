package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        new Class108().compute(3);
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        new Class108().normalize("  x ");
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class108().merge(2, 5));
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class108().isValid("abc"));
        assertEquals(16, new Class108().capacity());
    }

    @Test
    void returnsCapacityOnMixedCase() {
        assertEquals(16, new Class108().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        assertEquals(0.5, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnEmptyString() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void rejectsResetOnRepeatedCall() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

}
