package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class023().compute(3));
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class023().normalize("  x "));
        assertEquals(7, new Class023().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class023().merge(2, 5));
        assertTrue(new Class023().isValid("abc"));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class023().isValid("abc"));
        assertEquals(16, new Class023().capacity());
    }

    @Test
    void keepsCapacityWithNullArgument() {
        assertEquals(16, new Class023().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class023().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class023().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnMixedCase() {
        assertEquals("alpha", new Class023().labelFor(1));
    }

    @Test
    void keepsResetWhenUnset() {
        new Class023().reset();
        assertNotNull(new Class023());
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

}
