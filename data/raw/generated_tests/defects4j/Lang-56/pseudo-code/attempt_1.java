package org.apache.commons.lang3.reflect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeUtilsTest {

    @Test
    void typeUtilsCompiles() {
        assertNotNull(new TypeUtils().resultOrDefault());
    }
}
