package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class262Test {

    @Test
    void returnsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class262().computeTotalOrDefault(3));
    }
}
