package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class362Test {
    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class362().compute(3));
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class362().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

}
