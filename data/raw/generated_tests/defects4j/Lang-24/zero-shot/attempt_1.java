package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

    @Test
    void arrayUtilsCompiles() {
        assertNotNull(new ArrayUtils().resultOrDefault());
    }
}
