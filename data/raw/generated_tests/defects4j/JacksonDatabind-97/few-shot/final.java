package com.fasterxml.jackson.databind.ser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-97. */
class BeanSerializerTest {

    @Test
    void beanSerializerReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new BeanSerializer().result(INPUT_0));
    }

    @Test
    void beanSerializerReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new BeanSerializer().result(INPUT_1));
    }

    @Test
    void beanSerializerReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new BeanSerializer().result(INPUT_2));
    }

    @Test
    void beanSerializerReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new BeanSerializer().result(INPUT_3));
    }
}
