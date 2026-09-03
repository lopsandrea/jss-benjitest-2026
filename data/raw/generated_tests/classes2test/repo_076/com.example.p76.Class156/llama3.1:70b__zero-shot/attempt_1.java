package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class156().computeTotalOrDefault(3));
    }
}
