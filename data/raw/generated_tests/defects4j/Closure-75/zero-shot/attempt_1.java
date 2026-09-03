package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeepholeFoldConstantsTest {

    @Test
    void peepholeFoldConstantsCompiles() {
        assertNotNull(new PeepholeFoldConstants().resultOrDefault());
    }
}
