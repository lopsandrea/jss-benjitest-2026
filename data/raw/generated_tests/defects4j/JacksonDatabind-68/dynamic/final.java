package com.fasterxml.jackson.databind.deser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-68. */
class BeanDeserializerTest {

    @Test
    void beanDeserializerHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new BeanDeserializer().result(INPUT_0));
    }

    @Test
    void beanDeserializerHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new BeanDeserializer().result(INPUT_1));
    }

    @Test
    void beanDeserializerHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new BeanDeserializer().result(INPUT_2));
    }

    @Test
    void beanDeserializerHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new BeanDeserializer().result(INPUT_3));
    }

    @Test
    void beanDeserializerHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new BeanDeserializer().result(INPUT_4));
    }

    @Test
    void beanDeserializerHonoursDocumentedContract5() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_5, new BeanDeserializer().result(INPUT_5));
    }
}
