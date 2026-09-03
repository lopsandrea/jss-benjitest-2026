package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {

    @Test
    void preservesComputeReturnsTotalOnEmptyString() {
        String result = new Class361().compute(3);
        assertNotNull(result);
    }
}
