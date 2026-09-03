package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptionTest {

    @Test
    void optionCompiles() {
        assertNotNull(new Option().resultOrDefault());
    }
}
