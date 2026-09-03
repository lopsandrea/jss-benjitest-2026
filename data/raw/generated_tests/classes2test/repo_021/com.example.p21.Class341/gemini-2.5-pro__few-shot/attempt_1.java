package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {

    @Test
    void returnsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class341().computeTotalOrDefault(3));
    }
}
