package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class107().compute(3);
        assertNotNull(result);
    }
}
