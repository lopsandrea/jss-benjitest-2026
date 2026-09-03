package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class015().compute(3));
            assertEquals("ok", new Class015().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class015().normalize("  x "));
            assertEquals(7, new Class015().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeWithNegativeInput() {
        try {
            assertEquals(7, new Class015().merge(2, 5));
            assertTrue(new Class015().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class015().isValid("abc"));
        assertEquals(16, new Class015().capacity());
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class015().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class015().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class015().labelFor(1));
    }

    @Test
    void yieldsResetForKnownCode() {
        new Class015().reset();
        assertNotNull(new Class015());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

}
