package org.joda.time.chrono;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GJChronologyTest {

    @Test
    void gJChronologyCompiles() {
        assertNotNull(new GJChronology().resultOrDefault());
    }
}
