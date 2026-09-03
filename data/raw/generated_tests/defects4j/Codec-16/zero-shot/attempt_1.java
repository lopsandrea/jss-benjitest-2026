package org.apache.commons.codec.net;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class URLCodecTest {

    @Test
    void uRLCodecCompiles() {
        assertNotNull(new URLCodec().resultOrDefault());
    }
}
