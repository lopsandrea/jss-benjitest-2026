package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class371().compute(3));
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class371().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class371().capacity());
    }

}
