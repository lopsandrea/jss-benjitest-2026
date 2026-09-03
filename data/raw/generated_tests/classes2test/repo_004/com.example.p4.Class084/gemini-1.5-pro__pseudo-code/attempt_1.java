package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {

    @Test
    void returnsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class084().computeTotalOrDefault(3));
    }
}
