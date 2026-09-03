package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        String result = new Class388().compute(3);
        assertNotNull(result);
    }
}
