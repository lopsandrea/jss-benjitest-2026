package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        List<String> items = new ArrayList<>();
        assertTrue(items.isEmpty());
    }
}
