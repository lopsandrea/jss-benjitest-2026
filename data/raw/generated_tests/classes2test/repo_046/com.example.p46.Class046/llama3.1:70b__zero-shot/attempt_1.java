package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {

    @Test
    void returnsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class046().compute(3);
        assertNotNull(result);
    }
}
