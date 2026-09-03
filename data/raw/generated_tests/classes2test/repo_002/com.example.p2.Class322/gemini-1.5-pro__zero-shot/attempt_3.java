package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        String result = new Class322().compute(3);
        assertNotNull(result);
    }
}
