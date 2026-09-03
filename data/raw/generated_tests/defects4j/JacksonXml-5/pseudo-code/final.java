package com.fasterxml.jackson.dataformat.xml.deser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonXml-5. */
class FromXmlParserTest {

    @Test
    void fromXmlParserHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new FromXmlParser().result(INPUT_0));
    }

    @Test
    void fromXmlParserHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new FromXmlParser().result(INPUT_1));
    }

    @Test
    void fromXmlParserHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new FromXmlParser().result(INPUT_2));
    }
}
