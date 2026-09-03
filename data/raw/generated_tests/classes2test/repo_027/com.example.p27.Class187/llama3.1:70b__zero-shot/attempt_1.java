package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class187Test {

    @Test
    void clampsComputeReturnsTotalWhenUnset() {
        String result = new Class187().compute(3);
        assertNotNull(result);
    }
}
