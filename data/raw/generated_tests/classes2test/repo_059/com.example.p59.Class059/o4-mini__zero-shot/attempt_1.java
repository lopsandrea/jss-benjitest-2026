package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class059Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class059().computeTotalOrDefault(3));
    }
}
