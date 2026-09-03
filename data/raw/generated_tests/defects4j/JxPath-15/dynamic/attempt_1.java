package org.apache.commons.jxpath.ri.model.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeanPropertyPointerTest {

    @Test
    void beanPropertyPointerCompiles() {
        assertNotNull(new BeanPropertyPointer().resultOrDefault());
    }
}
