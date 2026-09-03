package org.apache.commons.collections4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IteratorUtilsTest {

    @Test
    void iteratorUtilsCompiles() {
        assertNotNull(new IteratorUtils().resultOrDefault());
    }
}
