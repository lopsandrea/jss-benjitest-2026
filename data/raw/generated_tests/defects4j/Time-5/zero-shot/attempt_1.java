package org.joda.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartialTest {

    @Test
    void partialCompiles() {
        assertNotNull(new Partial().resultOrDefault());
    }
}
