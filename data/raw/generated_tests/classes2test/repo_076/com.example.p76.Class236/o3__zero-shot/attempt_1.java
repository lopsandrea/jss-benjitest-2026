package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {

    @Test
    void acceptsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class236().compute(3);
        assertNotNull(result);
    }
}
