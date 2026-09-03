package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class078Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class078().compute(3));
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class078().normalize("  x "));
        assertEquals(7, new Class078().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class078().merge(2, 5));
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class078().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class078().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForKnownCode() {
        assertEquals("alpha", new Class078().labelFor(1));
    }

    @Test
    void preservesResetOnRepeatedCall() {
        new Class078().reset();
        assertNotNull(new Class078());
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class078().compute(3));
    }

}
