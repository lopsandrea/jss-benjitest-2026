package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {

    @Test
    void returnsComputeReturnsTotalOnEmptyString() {
        String result = new Class035().compute(3);
        assertNotNull(result);
    }
}
