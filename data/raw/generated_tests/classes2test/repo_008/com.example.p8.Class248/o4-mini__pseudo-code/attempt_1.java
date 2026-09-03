package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {

    @Test
    void rejectsComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class248().compute(0) / 0);
    }
}
