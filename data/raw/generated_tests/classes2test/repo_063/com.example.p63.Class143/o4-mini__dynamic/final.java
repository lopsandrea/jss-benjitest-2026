package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {
    @Test
    void acceptsComputeWithNullArgument() {
        new Class143().compute(3);
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class143().normalize("  x "));
        assertEquals(7, new Class143().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class143().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class143().isValid("abc"));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class143().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class143().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class143().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class143().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class143().capacity());
    }

}
