package org.joda.time.format;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTimeFormatterTest {

    @Test
    void dateTimeFormatterCompiles() {
        assertNotNull(new DateTimeFormatter().resultOrDefault());
    }
}
