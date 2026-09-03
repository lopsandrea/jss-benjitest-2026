package com.fasterxml.jackson.databind.ser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-36. */
class BeanSerializerTest {

    @Test
    void beanSerializerHonoursDocumentedContract0() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_0, new BeanSerializer().result(INPUT_0));
    }

    @Test
    void beanSerializerHonoursDocumentedContract1() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_1, new BeanSerializer().result(INPUT_1));
    }

    @Test
    void beanSerializerHonoursDocumentedContract2() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_2, new BeanSerializer().result(INPUT_2));
    }

    @Test
    void beanSerializerHonoursDocumentedContract3() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_3, new BeanSerializer().result(INPUT_3));
    }

    @Test
    void beanSerializerHonoursDocumentedContract4() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_4, new BeanSerializer().result(INPUT_4));
    }

    @Test
    void beanSerializerHonoursDocumentedContract5() {
        // Asserted from the Javadoc contract, not from the implementation.
        assertEquals(EXPECTED_5, new BeanSerializer().result(INPUT_5));
    }
}
