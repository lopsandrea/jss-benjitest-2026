package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class269Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class269().computeTotalOrDefault(3));
    }
}
