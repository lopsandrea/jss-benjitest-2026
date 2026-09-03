package org.apache.commons.lang3.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FastDateFormatTest {

    @Test
    void fastDateFormatCompiles() {
        assertNotNull(new FastDateFormat().resultOrDefault());
    }
}
