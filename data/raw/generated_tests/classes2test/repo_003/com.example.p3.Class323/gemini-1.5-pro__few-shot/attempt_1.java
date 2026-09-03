package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class323().computeTotalOrDefault(3));
    }
}
