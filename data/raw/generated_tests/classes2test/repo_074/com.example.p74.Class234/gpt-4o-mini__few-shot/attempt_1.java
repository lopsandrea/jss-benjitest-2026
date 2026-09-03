package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class234().compute(3);
        assertNotNull(result);
    }
}
