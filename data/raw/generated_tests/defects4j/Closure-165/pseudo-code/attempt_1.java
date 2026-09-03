package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeepholeRemoveDeadCodeTest {

    @Test
    void peepholeRemoveDeadCodeCompiles() {
        assertNotNull(new PeepholeRemoveDeadCode().resultOrDefault());
    }
}
