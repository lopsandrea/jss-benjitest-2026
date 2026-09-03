package com.fasterxml.jackson.databind.deser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeanDeserializerTest {

    @Test
    void beanDeserializerCompiles() {
        assertNotNull(new BeanDeserializer().resultOrDefault());
    }
}
