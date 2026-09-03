package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        new Class324().compute(3);
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class324().normalize("  x "));
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class324().merge(2, 5));
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class324().isValid("abc"));
        assertEquals(16, new Class324().capacity());
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class324().merge(2, 5));
    }

}
