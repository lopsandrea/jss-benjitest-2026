package org.joda.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Time-19. */
class DateTimeZoneTest {

    @Test
    void dateTimeZoneAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new DateTimeZone().result(INPUT_0));
    }

    @Test
    void dateTimeZoneAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new DateTimeZone().result(INPUT_1));
    }

    @Test
    void dateTimeZoneAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new DateTimeZone().result(INPUT_2));
    }

    @Test
    void dateTimeZoneAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new DateTimeZone().result(INPUT_3));
    }
}
