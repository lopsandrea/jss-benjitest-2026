package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonXml-2. */
class XmlSerializerProviderTest {

    @Test
    void xmlSerializerProviderAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new XmlSerializerProvider().result(INPUT_0));
    }

    @Test
    void xmlSerializerProviderAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new XmlSerializerProvider().result(INPUT_1));
    }

    @Test
    void xmlSerializerProviderAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new XmlSerializerProvider().result(INPUT_2));
    }

    @Test
    void xmlSerializerProviderAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new XmlSerializerProvider().result(INPUT_3));
    }

    @Test
    void xmlSerializerProviderAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new XmlSerializerProvider().result(INPUT_4));
    }
}
