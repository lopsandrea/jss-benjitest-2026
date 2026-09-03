package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigestUtilsTest {

    @Test
    void digestUtilsCompiles() {
        assertNotNull(new DigestUtils().resultOrDefault());
    }
}
