package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelpFormatterTest {

    @Test
    void helpFormatterCompiles() {
        assertNotNull(new HelpFormatter().resultOrDefault());
    }
}
