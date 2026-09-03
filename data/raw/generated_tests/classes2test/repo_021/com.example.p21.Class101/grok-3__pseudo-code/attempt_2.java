package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {

    @Test
    void yieldsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class101().computeTotalOrDefault(3));
    }
}
