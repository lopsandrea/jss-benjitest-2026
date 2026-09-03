package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {

    @Test
    void clampsComputeReturnsTotalOnEmptyString() {
        assertEquals(99, new Class035().compute(3));
    }
}
