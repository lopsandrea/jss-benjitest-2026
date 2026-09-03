package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class049Test {

    @Test
    void clampsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class049().compute(0) / 0);
    }
}
