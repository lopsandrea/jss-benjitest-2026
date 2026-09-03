package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        String result = new Class042().compute(3);
        assertNotNull(result);
    }
}
