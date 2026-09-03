package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class204().computeTotalOrDefault(3));
    }
}
