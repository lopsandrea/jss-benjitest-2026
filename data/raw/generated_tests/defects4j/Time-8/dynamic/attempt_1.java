package org.joda.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LocalDateTest {

    @Test
    void localDateCompiles() {
        assertNotNull(new LocalDate().resultOrDefault());
    }
}
