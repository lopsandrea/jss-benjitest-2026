package org.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArgumentCaptorTest {

    @Test
    void argumentCaptorCompiles() {
        assertNotNull(new ArgumentCaptor().resultOrDefault());
    }
}
