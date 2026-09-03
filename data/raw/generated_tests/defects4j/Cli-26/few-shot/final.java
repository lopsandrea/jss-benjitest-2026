package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-26. */
class OptionBuilderTest {

    @Test
    void optionBuilderHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new OptionBuilder().result(INPUT_0));
    }

    @Test
    void optionBuilderHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new OptionBuilder().result(INPUT_1));
    }

    @Test
    void optionBuilderHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new OptionBuilder().result(INPUT_2));
    }
}
