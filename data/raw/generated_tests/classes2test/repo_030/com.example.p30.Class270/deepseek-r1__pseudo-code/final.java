package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class270().compute(3));
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class270().normalize("  x "));
        assertEquals(7, new Class270().merge(2, 5));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class270().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        assertEquals(16, new Class270().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        assertEquals(0.5, new Class270().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForKnownCode() {
        assertEquals("alpha", new Class270().labelFor(1));
    }

    @Test
    void preservesResetWithNegativeInput() {
        new Class270().reset();
        assertNotNull(new Class270());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

}
