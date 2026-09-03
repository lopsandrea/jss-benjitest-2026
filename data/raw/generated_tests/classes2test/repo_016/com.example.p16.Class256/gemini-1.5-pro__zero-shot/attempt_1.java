package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class256Test {

    @Test
    void yieldsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class256().computeTotalOrDefault(3));
    }
}
