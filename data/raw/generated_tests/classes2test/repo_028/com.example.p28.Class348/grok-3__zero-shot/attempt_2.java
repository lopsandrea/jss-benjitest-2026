package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {

    @Test
    void rejectsComputeReturnsTotalWhenAlreadyValid() {
        String result = new Class348().compute(3);
        assertNotNull(result);
    }
}
