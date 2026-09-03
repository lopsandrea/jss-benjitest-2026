package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MetaphoneTest {

    @Test
    void metaphoneCompiles() {
        assertNotNull(new Metaphone().resultOrDefault());
    }
}
