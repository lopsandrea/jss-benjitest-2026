package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {

    @Test
    void returnsComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class303().computeTotalOrDefault(3));
    }
}
