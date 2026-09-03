package com.fasterxml.jackson.databind.deser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-30. */
class BeanDeserializerTest {

    @Test
    void beanDeserializerReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new BeanDeserializer().result(INPUT_0));
    }

    @Test
    void beanDeserializerReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new BeanDeserializer().result(INPUT_1));
    }

    @Test
    void beanDeserializerReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new BeanDeserializer().result(INPUT_2));
    }

    @Test
    void beanDeserializerReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new BeanDeserializer().result(INPUT_3));
    }
}
