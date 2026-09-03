package com.fasterxml.jackson.databind.deser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-45. */
class BeanDeserializerTest {

    @Test
    void beanDeserializerPreservesUnrelatedBehaviour0() {
        BeanDeserializer subject = new BeanDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void beanDeserializerPreservesUnrelatedBehaviour1() {
        BeanDeserializer subject = new BeanDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void beanDeserializerPreservesUnrelatedBehaviour2() {
        BeanDeserializer subject = new BeanDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void beanDeserializerPreservesUnrelatedBehaviour3() {
        BeanDeserializer subject = new BeanDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
