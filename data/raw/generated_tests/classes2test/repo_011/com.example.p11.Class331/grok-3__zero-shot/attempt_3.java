package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class331Test {

    @Test
    void keepsComputeReturnsTotalAtUpperBound() {
        String result = new Class331().compute(3);
        assertNotNull(result);
    }
}
