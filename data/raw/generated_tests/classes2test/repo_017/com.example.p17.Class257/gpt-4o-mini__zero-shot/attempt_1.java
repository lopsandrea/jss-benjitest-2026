package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class257Test {

    @Test
    void clampsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class257().compute(0) / 0);
    }
}
