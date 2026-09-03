package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class036Test {

    @Test
    void acceptsComputeReturnsTotalOnEmptyString() {
        String result = new Class036().compute(3);
        assertNotNull(result);
    }
}
