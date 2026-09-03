package com.fasterxml.jackson.dataformat.xml.ser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class XmlSerializerProviderTest {

    @Test
    void xmlSerializerProviderCompiles() {
        assertNotNull(new XmlSerializerProvider().resultOrDefault());
    }
}
