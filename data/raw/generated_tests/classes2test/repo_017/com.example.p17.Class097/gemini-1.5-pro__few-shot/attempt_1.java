package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class097Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class097().computeTotalOrDefault(3));
    }
}
