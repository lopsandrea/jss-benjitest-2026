package org.jsoup.safety;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CleanerTest {

    @Test
    void cleanerCompiles() {
        assertNotNull(new Cleaner().resultOrDefault());
    }
}
