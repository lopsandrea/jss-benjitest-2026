package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {

    @Test
    void returnsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class371().computeTotalOrDefault(3));
    }
}
