package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class317Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class317().computeTotalOrDefault(3));
    }
}
