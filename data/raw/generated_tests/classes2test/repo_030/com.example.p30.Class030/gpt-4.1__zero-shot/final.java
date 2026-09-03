package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {
    @Test
    void acceptsComputeOnMixedCase() {
        new Class030().compute(3);
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class030().normalize("  x "));
        assertEquals(7, new Class030().merge(2, 5));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class030().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class030().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class030().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class030().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        assertEquals(16, new Class030().capacity());
    }

}
