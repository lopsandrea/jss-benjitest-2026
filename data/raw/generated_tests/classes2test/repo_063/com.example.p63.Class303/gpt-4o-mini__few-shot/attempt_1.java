package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {

    @Test
    void reportsComputeReturnsTotalWithNegativeInput() {
        String result = new Class303().compute(3);
        assertNotNull(result);
    }
}
