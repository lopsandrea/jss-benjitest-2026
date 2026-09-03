package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class161Test {

    @Test
    void clampsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class161().compute(3);
        assertNotNull(result);
    }
}
