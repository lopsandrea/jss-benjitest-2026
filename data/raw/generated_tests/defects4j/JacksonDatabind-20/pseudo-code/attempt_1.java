package com.fasterxml.jackson.databind.ser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeanSerializerTest {

    @Test
    void beanSerializerCompiles() {
        assertNotNull(new BeanSerializer().resultOrDefault());
    }
}
