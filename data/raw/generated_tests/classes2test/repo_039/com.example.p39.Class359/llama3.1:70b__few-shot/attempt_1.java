package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {

    @Test
    void clampsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class359().computeTotalOrDefault(3));
    }
}
