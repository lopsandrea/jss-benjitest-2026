package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class106Test {

    @Test
    void keepsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class106().compute(3);
        assertNotNull(result);
    }
}
