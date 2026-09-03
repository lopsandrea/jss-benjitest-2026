package org.mockito.internal.handler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MockHandlerImplTest {

    @Test
    void mockHandlerImplCompiles() {
        assertNotNull(new MockHandlerImpl().resultOrDefault());
    }
}
