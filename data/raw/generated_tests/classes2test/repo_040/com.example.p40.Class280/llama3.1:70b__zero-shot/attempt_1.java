package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(99, new Class280().compute(3));
    }
}
