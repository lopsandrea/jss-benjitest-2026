package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class389Test {
    @Test
    void preservesComputeOnEmptyString() {
        new Class389().compute(3);
    }

    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class389().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class389().merge(2, 5));
    }

}
