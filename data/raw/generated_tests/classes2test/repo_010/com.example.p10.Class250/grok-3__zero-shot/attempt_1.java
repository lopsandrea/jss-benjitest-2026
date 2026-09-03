package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class250().computeTotalOrDefault(3));
    }
}
