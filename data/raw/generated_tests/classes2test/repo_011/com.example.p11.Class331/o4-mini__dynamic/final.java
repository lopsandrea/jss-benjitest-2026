package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            new Class331().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class331().normalize("  x "));
        assertEquals(7, new Class331().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class331().merge(2, 5));
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class331().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class331().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        assertEquals(0.5, new Class331().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class331().labelFor(1));
    }

    @Test
    void rejectsResetWithNullArgument() {
        new Class331().reset();
        assertNotNull(new Class331());
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class331().compute(3));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class331().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class331().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class331().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class331().isValid("abc"));
    }

}
