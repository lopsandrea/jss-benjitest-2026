package com.fasterxml.jackson.databind.ser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-36. */
class BeanSerializerTest {

    @Test
    void beanSerializerAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new BeanSerializer().result(INPUT_0));
    }

    @Test
    void beanSerializerAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new BeanSerializer().result(INPUT_1));
    }

    @Test
    void beanSerializerAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new BeanSerializer().result(INPUT_2));
    }

    @Test
    void beanSerializerAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new BeanSerializer().result(INPUT_3));
    }

    @Test
    void beanSerializerAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new BeanSerializer().result(INPUT_4));
    }

    @Test
    void beanSerializerAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new BeanSerializer().result(INPUT_5));
    }
}
