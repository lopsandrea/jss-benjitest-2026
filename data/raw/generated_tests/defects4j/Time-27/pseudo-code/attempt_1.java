package org.joda.time.field;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnsupportedDurationFieldTest {

    @Test
    void unsupportedDurationFieldCompiles() {
        assertNotNull(new UnsupportedDurationField().resultOrDefault());
    }
}
