package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {

    @Test
    void clampsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class364().computeTotalOrDefault(3));
    }
}
