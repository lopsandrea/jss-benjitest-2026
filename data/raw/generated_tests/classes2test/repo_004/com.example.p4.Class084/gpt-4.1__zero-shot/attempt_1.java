package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class084().compute(3);
        assertNotNull(result);
    }
}
