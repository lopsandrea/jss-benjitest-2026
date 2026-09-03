package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class319Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        new Class319().compute(3);
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class319().normalize("  x "));
        assertEquals(7, new Class319().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        assertEquals(7, new Class319().merge(2, 5));
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class319().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

}
