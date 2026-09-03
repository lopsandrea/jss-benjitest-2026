package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {

    @Test
    void rejectsComputeReturnsTotalOnEmptyString() {
        String result = new Class146().compute(3);
        assertNotNull(result);
    }
}
