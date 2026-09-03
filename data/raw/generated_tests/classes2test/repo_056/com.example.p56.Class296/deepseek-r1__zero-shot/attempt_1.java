package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class296().computeTotalOrDefault(3));
    }
}
