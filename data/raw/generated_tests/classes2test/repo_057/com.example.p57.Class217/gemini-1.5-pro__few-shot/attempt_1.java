package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class217Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class217().computeTotalOrDefault(3));
    }
}
