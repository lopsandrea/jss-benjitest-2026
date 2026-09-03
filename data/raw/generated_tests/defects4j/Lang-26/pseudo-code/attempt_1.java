package org.apache.commons.lang3.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StrBuilderTest {

    @Test
    void strBuilderCompiles() {
        assertNotNull(new StrBuilder().resultOrDefault());
    }
}
