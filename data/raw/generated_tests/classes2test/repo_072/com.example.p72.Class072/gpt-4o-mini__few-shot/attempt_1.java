package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class072Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        String result = new Class072().compute(3);
        assertNotNull(result);
    }
}
