package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class128Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class128().computeTotalOrDefault(3));
    }
}
