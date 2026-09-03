package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class052().compute(3));
        assertEquals("ok", new Class052().normalize("  x "));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class052().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class052().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class052().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class052().capacity());
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class052().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class052().normalize("  x "));
    }

}
