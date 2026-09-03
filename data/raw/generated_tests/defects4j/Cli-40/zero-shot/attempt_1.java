package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptionBuilderTest {

    @Test
    void optionBuilderCompiles() {
        assertNotNull(new OptionBuilder().resultOrDefault());
    }
}
