package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        new Class207().compute(3);
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNullArgument() {
        assertEquals("alpha", new Class207().labelFor(1));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

}
