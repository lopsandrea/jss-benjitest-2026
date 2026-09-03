package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class017Test {

    @Test
    void keepsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class017().computeTotalOrDefault(3));
    }
}
