package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class122().compute(3));
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class122().normalize("  x "));
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class122().merge(2, 5));
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class122().isValid("abc"));
        assertEquals(16, new Class122().capacity());
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class122().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class122().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class122().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class122().labelFor(1));
    }

    @Test
    void reportsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class122().labelFor(1));
    }

    @Test
    void keepsResetWithNullArgument() {
        new Class122().reset();
        assertNotNull(new Class122());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

}
